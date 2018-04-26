create or replace package PKG_DC_API_HANDLR is

  -- Author  : ASHIK.KHAN
  -- Created : 4/18/2018 11:43:00 AM
  -- Purpose : 
  W_ENTITY_NUM NUMBER := 1;
  PROCEDURE FN_PROCESS_CUST_DETAIL_REQ (V_CIF_NUM IN NUMBER, P_OUT OUT VARCHAR2);

end PKG_DC_API_HANDLR;
/

create or replace package body PKG_DC_API_HANDLR is

  PROCEDURE FN_PROCESS_CUST_DETAIL_REQ(V_CIF_NUM IN NUMBER,
                                       P_OUT     OUT VARCHAR2) IS
    V_FIRST_NAME         VARCHAR2(200);
    V_SECOND_NAME        VARCHAR2(200);
    V_FULL_NAME          VARCHAR2(200);
    V_MOTHER_NAME        VARCHAR2(200);
    V_SEX                VARCHAR2(200);
    V_RES_TELNO          VARCHAR2(200);
    V_OFF_TELNO          VARCHAR2(200);
    V_FAX_NO             VARCHAR2(200);
    V_CUST_NAME          VARCHAR2(200);
    V_LOCN_CODE          VARCHAR2(200);
    V_CLIENT_TYPE        CHAR(1);
    V_ADDRESS            VARCHAR2(1000);
    V_PIN_CODE           VARCHAR2(200);
    V_OPEN_DATE          DATE;
    V_BRANCH_CODE        VARCHAR2(200);
    V_BRANCH_NAME        VARCHAR2(200);
    V_CUST_ADDRESS       VARCHAR2(200);
    V_COUNTRY_CODE       VARCHAR2(200);
    V_COUNTRY_DESC       VARCHAR2(200);
    V_CONTACT_NO         VARCHAR2(200);
    V_EMAIL_ID           VARCHAR2(200);
    V_BIRTH_DATE         VARCHAR2(200);
    V_PERSONAL_IDENTITY1 VARCHAR2(200);
    V_ERROR_MSG          VARCHAR2(200);
  
    W_SQL VARCHAR(1000);
  
    W_CLIENT_NAME        VARCHAR2(200);
    W_INCORP_DATE        DATE;
    W_INCORP_CNTRY       VARCHAR2(2);
    W_REG_NUM            VARCHAR2(25);
    W_REG_DATE           DATE;
    W_REG_EXPIRY_DATE    DATE;
    W_REG_OFF_ADDR1      VARCHAR2(35);
    W_REG_OFF_ADDR2      VARCHAR2(35);
    W_REG_OFF_ADDR5      VARCHAR2(35);
    W_REG_OFF_ADDR3      VARCHAR2(35);
    W_REG_OFF_ADDR4      VARCHAR2(35);
    W_AUTHORIZED_CAPITAL NUMBER(18, 3);
    W_ISSUED_CAPITAL     NUMBER(18, 3);
    W_PAIDUP_CAPITAL     NUMBER(18, 3);
    W_NETWORTH_AMT       NUMBER(18, 3);
    W_BC_GROSS_TURNOVER  NUMBER(18, 3);
    W_NATURE_OF_BUS1     VARCHAR2(50);
    V_EMPLOY_TYPE        CHAR(1);
    V_BRN_CODE           NUMBER(6);
    V_SEGMENT_CODE       VARCHAR2(6) := '';
    V_BUSDIVN_CODE       VARCHAR2(3) := '';
    V_ARM_CODE           VARCHAR2(8) := '';
  
    VAR_MINBAL_CHRG_FLG VARCHAR2(1);
  
    EX_INVALID_CLIENT EXCEPTION;
  BEGIN
    P_OUT := '';
  
    VAR_MINBAL_CHRG_FLG := 'N';
    BEGIN
      SELECT C.CLIENTS_TYPE_FLG,
             C.CLIENTS_ADDR1 || '|' || C.CLIENTS_ADDR2 || '|' ||
             C.CLIENTS_ADDR3 || '|' || C.CLIENTS_ADDR4 || '|' ||
             C.CLIENTS_ADDR5 ADDRESS,
             C.CLIENTS_LOCN_CODE,
             C.CLIENTS_OPENING_DATE
        INTO V_CLIENT_TYPE, V_ADDRESS, V_PIN_CODE, V_OPEN_DATE
        FROM CLIENTS C
       WHERE C.CLIENTS_CODE = V_CIF_NUM;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        RAISE EX_INVALID_CLIENT;
    END;
    IF V_CLIENT_TYPE = 'I' THEN
    
      SELECT I.INDCLIENT_FIRST_NAME,
             I.INDCLIENT_SUR_NAME,
             I.INDCLIENT_FIRST_NAME || ' ' || I.INDCLIENT_LAST_NAME || ' ' ||
             I.INDCLIENT_SUR_NAME AS FULL_NAME,
             I.INDCLIENT_FATHER_NAME,
             I.INDCLIENT_SEX,
             I.INDCLIENT_TEL_RES,
             I.INDCLIENT_TEL_OFF,
             I.INDCLIENT_TEL_FAX,
             I.INDCLIENT_EMPLOY_TYPE,
             C.CLIENTS_HOME_BRN_CODE,
             C.CLIENTS_SEGMENT_CODE,
             C.CLIENTS_BUSDIVN_CODE,
             C.CLIENTS_ARM_CODE
        INTO V_FIRST_NAME,
             V_SECOND_NAME,
             V_FULL_NAME,
             V_MOTHER_NAME,
             V_SEX,
             V_RES_TELNO,
             V_OFF_TELNO,
             V_FAX_NO,
             V_EMPLOY_TYPE,
             V_BRN_CODE,
             V_SEGMENT_CODE,
             V_BUSDIVN_CODE,
             V_ARM_CODE
        FROM INDCLIENTS I, CLIENTS C
       WHERE I.INDCLIENT_CODE = V_CIF_NUM
         and i.indclient_code = c.clients_code;
    
    ELSIF V_CLIENT_TYPE = 'C' THEN
    
      SELECT CORPCL_CLIENT_NAME,
             CORPCL_INCORP_DATE,
             CORPCL_INCORP_CNTRY,
             CORPCL_REG_NUM,
             CORPCL_REG_DATE,
             CORPCL_REG_EXPIRY_DATE,
             CORPCL_REG_OFF_ADDR1,
             CORPCL_REG_OFF_ADDR2,
             CORPCL_REG_OFF_ADDR3,
             CORPCL_REG_OFF_ADDR4,
             CORPCL_REG_OFF_ADDR5,
             CORPCL_AUTHORIZED_CAPITAL,
             CORPCL_ISSUED_CAPITAL,
             CORPCL_PAIDUP_CAPITAL,
             CORPCL_NETWORTH_AMT,
             CORPCL_BC_GROSS_TURNOVER,
             CORPCL_NATURE_OF_BUS1
        INTO W_CLIENT_NAME,
             W_INCORP_DATE,
             W_INCORP_CNTRY,
             W_REG_NUM,
             W_REG_DATE,
             W_REG_EXPIRY_DATE,
             W_REG_OFF_ADDR1,
             W_REG_OFF_ADDR2,
             W_REG_OFF_ADDR3,
             W_REG_OFF_ADDR4,
             W_REG_OFF_ADDR5,
             W_AUTHORIZED_CAPITAL,
             W_ISSUED_CAPITAL,
             W_PAIDUP_CAPITAL,
             W_NETWORTH_AMT,
             W_BC_GROSS_TURNOVER,
             W_NATURE_OF_BUS1
        FROM CORPCLIENTS L
       WHERE L.CORPCL_CLIENT_CODE = V_CIF_NUM;
    
    END IF;
  
    W_SQL := 'BEGIN ' || 'PKG_IB_CUSTDTL.SP_GET_CUSTDTL( :1,
                           :2,
                           :3,
                           :4,
                           :5,
                           :6,
                           :7,
                           :8,
                           :9,
                           :10,
                           :11,
                           :12,
                           :13,
                           :14,
                           :15
                           ); END ;';
  
    EXECUTE IMMEDIATE W_SQL
      USING IN W_ENTITY_NUM, IN V_CIF_NUM, OUT V_CUST_NAME, OUT V_BRANCH_CODE, OUT V_BRANCH_NAME, OUT V_CUST_ADDRESS, OUT V_COUNTRY_CODE, OUT V_COUNTRY_DESC, OUT V_CONTACT_NO, OUT V_EMAIL_ID, OUT V_BIRTH_DATE, OUT V_PIN_CODE, OUT V_LOCN_CODE, OUT V_PERSONAL_IDENTITY1, OUT V_ERROR_MSG;
  
    V_CUST_ADDRESS := TRIM(REPLACE(V_CUST_ADDRESS, '|', ' '));
    IF V_CLIENT_TYPE = 'I' THEN
      P_OUT := 'V_FIRST_NAME=' || V_FIRST_NAME || '|' || 'V_SECOND_NAME=' ||
               V_SECOND_NAME || '|' || 'V_FULL_NAME=' || V_FULL_NAME || '|' ||
               'V_MOTHER_NAME=' || V_MOTHER_NAME || '|' ||
              
               'V_COUNTRY_CODE=' || V_COUNTRY_CODE || '|' ||
               'V_BIRTH_DATE=' || TRIM(V_BIRTH_DATE) || '|' ||
               'V_OPEN_DATE=' || V_OPEN_DATE || '|' || 'V_SEX=' || V_SEX || '|' ||
               'V_CLIENT_TYPE=' || V_CLIENT_TYPE;
    
      P_OUT := P_OUT || '|' || 'V_EMPLOY_TYPE=' || V_EMPLOY_TYPE || '|' ||
               'V_SEGMENT_CODE=' || V_SEGMENT_CODE || '|' ||
               'V_BUSDIVN_CODE=' || V_BUSDIVN_CODE || '|' || 'V_ARM_CODE=' ||
               V_ARM_CODE || '|' || 'V_BRN_CODE=' || V_BRN_CODE;
    
      P_OUT := P_OUT || '|' || 'V_CUST_ADDRESS=' || V_CUST_ADDRESS || '|' ||
               'V_PIN_CODE=' || V_PIN_CODE || '|' || 'V_COUNTRY_CODE=' ||
               V_COUNTRY_CODE || '|' || 'V_LOCN_CODE=' || V_LOCN_CODE || '|' ||
               'V_PIN_CODE=' || V_PIN_CODE;
      P_OUT := P_OUT || '|' || 'V_CONTACT_NO=' || V_CONTACT_NO || '|' ||
               'V_EMAIL_ID=' || V_EMAIL_ID || '|' || 'V_RES_TELNO=' ||
               V_RES_TELNO || '|' || 'V_OFF_TELNO=' || V_OFF_TELNO || '|' ||
               'V_FAX_NO=' || V_FAX_NO;
    ELSIF V_CLIENT_TYPE = 'C' THEN
      P_OUT := 'W_CLIENT_NAME=' || W_CLIENT_NAME || '|' || 'W_INCORP_DATE=' ||
               W_INCORP_DATE || '|' || 'W_INCORP_CNTRY=' || W_INCORP_CNTRY || '|' ||
               'W_REG_NUM=' || W_REG_NUM || '|' || 'W_REG_DATE=' ||
               W_REG_DATE || '|' || 'W_REG_EXPIRY_DATE=' ||
               W_REG_EXPIRY_DATE || '|' || 'W_REG_OFF_ADDR1=' ||
               W_REG_OFF_ADDR1 || 'W_REG_OFF_ADDR2=' || W_REG_OFF_ADDR2 ||
               'W_REG_OFF_ADDR3=' || W_REG_OFF_ADDR3 || 'W_REG_OFF_ADDR4=' ||
               W_REG_OFF_ADDR4 || 'W_REG_OFF_ADDR5=' || W_REG_OFF_ADDR5 || '|' ||
               'W_BC_GROSS_TURNOVER=' || W_BC_GROSS_TURNOVER || '|' ||
               'W_AUTHORIZED_CAPITAL=' || W_AUTHORIZED_CAPITAL || '|' ||
               'W_ISSUED_CAPITAL=' || W_ISSUED_CAPITAL || '|' ||
               'W_PAIDUP_CAPITAL=' || W_PAIDUP_CAPITAL || '|' ||
               'W_NETWORTH_AMT=' || W_NETWORTH_AMT || '|' || 'V_ARM_CODE=' ||
               V_ARM_CODE || '|' || 'V_BRANCH_NAME=' || V_BRANCH_NAME || '|' ||
               'W_NATURE_OF_BUS1=' || W_NATURE_OF_BUS1 || '|' ||
               'V_CLIENT_TYPE=' || V_CLIENT_TYPE;
      P_OUT := P_OUT || '|' || 'V_CUST_ADDRESS=' || V_CUST_ADDRESS || '||' ||
               'V_PIN_CODE=' || V_PIN_CODE || '|' || 'V_COUNTRY_CODE=' ||
               V_COUNTRY_CODE || '|' || 'V_LOCN_CODE=' || V_LOCN_CODE || '|' ||
               'V_PIN_CODE=' || V_PIN_CODE;
      P_OUT := P_OUT || '|' || 'V_CONTACT_NO=' || V_CONTACT_NO || '|' ||
               'V_EMAIL_ID=' || V_EMAIL_ID || '|' || 'V_RES_TELNO=' ||
               V_RES_TELNO || '|' || 'V_OFF_TELNO=' || V_OFF_TELNO || '|' ||
               'V_FAX_NO=' || V_FAX_NO;
    END IF;
  EXCEPTION
    WHEN EX_INVALID_CLIENT THEN
      P_OUT := 'ERROR=CLIENT NOT FOUND';
  END;
end PKG_DC_API_HANDLR;
/

