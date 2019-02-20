package ap_unix.qa_framework_process_email_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.Mathematical;
import routines.DataQualityDependencies;
import routines.SQLike;
import routines.Numeric;
import routines.TalendString;
import routines.StringHandling;
import routines.DQTechnical;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;

//the import part of tJavaRow_1
//import java.util.List;

@SuppressWarnings("unused")
/**
 * Job: QA_Framework_Process_Email Purpose: CSV File<br>
 * Description: Monthly <br>
 * @author Panetta, Alex
 * @version 6.1.1.20151214_1327
 * @status DEV
 */
public class QA_Framework_Process_Email implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "QA_Framework_Process_Email.log");
	}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(QA_Framework_Process_Email.class);

	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}

	private Object[] multiThreadLockWrite = new Object[0];

	private final static String defaultCharset = java.nio.charset.Charset
			.defaultCharset().name();

	private final static String utf8Charset = "UTF-8";

	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();

	// create application properties with default
	public class ContextProperties extends java.util.Properties {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public void synchronizeContext() {

			if (reportMonth != null) {

				this.setProperty("reportMonth", reportMonth.toString());

			}

			if (jobNumber != null) {

				this.setProperty("jobNumber", jobNumber.toString());

			}

			if (mDrive != null) {

				this.setProperty("mDrive", mDrive.toString());

			}

			if (shipping != null) {

				this.setProperty("shipping", shipping.toString());

			}

			if (reportYear != null) {

				this.setProperty("reportYear", reportYear.toString());

			}

			if (salesName != null) {

				this.setProperty("salesName", salesName.toString());

			}

			if (salesSignature != null) {

				this.setProperty("salesSignature", salesSignature.toString());

			}

			if (salesEmail != null) {

				this.setProperty("salesEmail", salesEmail.toString());

			}

			if (client != null) {

				this.setProperty("client", client.toString());

			}

			if (jobID != null) {

				this.setProperty("jobID", jobID.toString());

			}

			if (resourceInt != null) {

				this.setProperty("resourceInt", resourceInt.toString());

			}

			if (emailTo != null) {

				this.setProperty("emailTo", emailTo.toString());

			}

			if (emailCC != null) {

				this.setProperty("emailCC", emailCC.toString());

			}

			if (dbVersion != null) {

				this.setProperty("dbVersion", dbVersion.toString());

			}

			if (localDirectory != null) {

				this.setProperty("localDirectory", localDirectory.toString());

			}

			if (dbUser != null) {

				this.setProperty("dbUser", dbUser.toString());

			}

			if (dbPassword != null) {

				this.setProperty("dbPassword", dbPassword.toString());

			}

			if (startDate != null) {

				this.setProperty("startDate", startDate.toString());

			}

			if (startTime != null) {

				this.setProperty("startTime", startTime.toString());

			}

			if (lastReportMonth != null) {

				this.setProperty("lastReportMonth", lastReportMonth.toString());

			}

			if (expiredReportMonth != null) {

				this.setProperty("expiredReportMonth",
						expiredReportMonth.toString());

			}

			if (dbHostName != null) {

				this.setProperty("dbHostName", dbHostName.toString());

			}

			if (dbName != null) {

				this.setProperty("dbName", dbName.toString());

			}

			if (dbSchema != null) {

				this.setProperty("dbSchema", dbSchema.toString());

			}

			if (ftpHost != null) {

				this.setProperty("ftpHost", ftpHost.toString());

			}

			if (ftpUser != null) {

				this.setProperty("ftpUser", ftpUser.toString());

			}

			if (ftpPassword != null) {

				this.setProperty("ftpPassword", ftpPassword.toString());

			}

			if (ftpDirectory != null) {

				this.setProperty("ftpDirectory", ftpDirectory.toString());

			}

			if (shipIt != null) {

				this.setProperty("shipIt", shipIt.toString());

			}

			if (runIt != null) {

				this.setProperty("runIt", runIt.toString());

			}

			if (prodEmail != null) {

				this.setProperty("prodEmail", prodEmail.toString());

			}

			if (shipEmail != null) {

				this.setProperty("shipEmail", shipEmail.toString());

			}

			if (salesCostCenter != null) {

				this.setProperty("salesCostCenter", salesCostCenter.toString());

			}

			if (emailFrom != null) {

				this.setProperty("emailFrom", emailFrom.toString());

			}

			if (emailBcc != null) {

				this.setProperty("emailBcc", emailBcc.toString());

			}

			if (smtpHost != null) {

				this.setProperty("smtpHost", smtpHost.toString());

			}

			if (dbUserPI != null) {

				this.setProperty("dbUserPI", dbUserPI.toString());

			}

			if (dbPasswordPI != null) {

				this.setProperty("dbPasswordPI", dbPasswordPI.toString());

			}

			if (dbHostNamePI != null) {

				this.setProperty("dbHostNamePI", dbHostNamePI.toString());

			}

			if (dbNamePI != null) {

				this.setProperty("dbNamePI", dbNamePI.toString());

			}

			if (dbSchemaPI != null) {

				this.setProperty("dbSchemaPI", dbSchemaPI.toString());

			}

			if (salesTitle != null) {

				this.setProperty("salesTitle", salesTitle.toString());

			}

			if (salesPhone != null) {

				this.setProperty("salesPhone", salesPhone.toString());

			}

			if (reportMonthPI != null) {

				this.setProperty("reportMonthPI", reportMonthPI.toString());

			}

			if (headersql != null) {

				this.setProperty("headersql", headersql.toString());

			}

			if (testResult != null) {

				this.setProperty("testResult", testResult.toString());

			}

			if (notify != null) {

				this.setProperty("notify", notify.toString());

			}

			if (notifySuccess != null) {

				this.setProperty("notifySuccess", notifySuccess.toString());

			}

			if (notifyError != null) {

				this.setProperty("notifyError", notifyError.toString());

			}

			if (ruleID != null) {

				this.setProperty("ruleID", ruleID.toString());

			}

			if (execTime != null) {

				this.setProperty("execTime", execTime.toString());

			}

			if (ruleDesc != null) {

				this.setProperty("ruleDesc", ruleDesc.toString());

			}

		}

		public String reportMonth;

		public String getReportMonth() {
			return this.reportMonth;
		}

		public String jobNumber;

		public String getJobNumber() {
			return this.jobNumber;
		}

		public String mDrive;

		public String getMDrive() {
			return this.mDrive;
		}

		public String shipping;

		public String getShipping() {
			return this.shipping;
		}

		public String reportYear;

		public String getReportYear() {
			return this.reportYear;
		}

		public String salesName;

		public String getSalesName() {
			return this.salesName;
		}

		public String salesSignature;

		public String getSalesSignature() {
			return this.salesSignature;
		}

		public String salesEmail;

		public String getSalesEmail() {
			return this.salesEmail;
		}

		public String client;

		public String getClient() {
			return this.client;
		}

		public String jobID;

		public String getJobID() {
			return this.jobID;
		}

		public String resourceInt;

		public String getResourceInt() {
			return this.resourceInt;
		}

		public String emailTo;

		public String getEmailTo() {
			return this.emailTo;
		}

		public String emailCC;

		public String getEmailCC() {
			return this.emailCC;
		}

		public String dbVersion;

		public String getDbVersion() {
			return this.dbVersion;
		}

		public String localDirectory;

		public String getLocalDirectory() {
			return this.localDirectory;
		}

		public String dbUser;

		public String getDbUser() {
			return this.dbUser;
		}

		public String dbPassword;

		public String getDbPassword() {
			return this.dbPassword;
		}

		public String startDate;

		public String getStartDate() {
			return this.startDate;
		}

		public String startTime;

		public String getStartTime() {
			return this.startTime;
		}

		public String lastReportMonth;

		public String getLastReportMonth() {
			return this.lastReportMonth;
		}

		public String expiredReportMonth;

		public String getExpiredReportMonth() {
			return this.expiredReportMonth;
		}

		public String dbHostName;

		public String getDbHostName() {
			return this.dbHostName;
		}

		public String dbName;

		public String getDbName() {
			return this.dbName;
		}

		public String dbSchema;

		public String getDbSchema() {
			return this.dbSchema;
		}

		public String ftpHost;

		public String getFtpHost() {
			return this.ftpHost;
		}

		public String ftpUser;

		public String getFtpUser() {
			return this.ftpUser;
		}

		public String ftpPassword;

		public String getFtpPassword() {
			return this.ftpPassword;
		}

		public String ftpDirectory;

		public String getFtpDirectory() {
			return this.ftpDirectory;
		}

		public String shipIt;

		public String getShipIt() {
			return this.shipIt;
		}

		public String runIt;

		public String getRunIt() {
			return this.runIt;
		}

		public String prodEmail;

		public String getProdEmail() {
			return this.prodEmail;
		}

		public String shipEmail;

		public String getShipEmail() {
			return this.shipEmail;
		}

		public String salesCostCenter;

		public String getSalesCostCenter() {
			return this.salesCostCenter;
		}

		public String emailFrom;

		public String getEmailFrom() {
			return this.emailFrom;
		}

		public String emailBcc;

		public String getEmailBcc() {
			return this.emailBcc;
		}

		public String smtpHost;

		public String getSmtpHost() {
			return this.smtpHost;
		}

		public String dbUserPI;

		public String getDbUserPI() {
			return this.dbUserPI;
		}

		public String dbPasswordPI;

		public String getDbPasswordPI() {
			return this.dbPasswordPI;
		}

		public String dbHostNamePI;

		public String getDbHostNamePI() {
			return this.dbHostNamePI;
		}

		public String dbNamePI;

		public String getDbNamePI() {
			return this.dbNamePI;
		}

		public String dbSchemaPI;

		public String getDbSchemaPI() {
			return this.dbSchemaPI;
		}

		public String salesTitle;

		public String getSalesTitle() {
			return this.salesTitle;
		}

		public String salesPhone;

		public String getSalesPhone() {
			return this.salesPhone;
		}

		public String reportMonthPI;

		public String getReportMonthPI() {
			return this.reportMonthPI;
		}

		public String headersql;

		public String getHeadersql() {
			return this.headersql;
		}

		public String testResult;

		public String getTestResult() {
			return this.testResult;
		}

		public String notify;

		public String getNotify() {
			return this.notify;
		}

		public String notifySuccess;

		public String getNotifySuccess() {
			return this.notifySuccess;
		}

		public String notifyError;

		public String getNotifyError() {
			return this.notifyError;
		}

		public String ruleID;

		public String getRuleID() {
			return this.ruleID;
		}

		public String execTime;

		public String getExecTime() {
			return this.execTime;
		}

		public String ruleDesc;

		public String getRuleDesc() {
			return this.ruleDesc;
		}
	}

	private ContextProperties context = new ContextProperties();

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "QA_Framework_Process_Email";
	private final String projectName = "AP_UNIX";
	public Integer errorCode = null;
	private String currentComponent = "";

	private final java.util.Map<String, Object> globalMap = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Object>());

	private final java.util.Map<String, Long> start_Hash = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Long>());
	private final java.util.Map<String, Long> end_Hash = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Long>());
	private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Boolean>());
	public final java.util.List<String[]> globalBuffer = java.util.Collections
			.synchronizedList(new java.util.ArrayList<String[]>());

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";

	public void setDataSources(
			java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources
				.entrySet()) {
			talendDataSources.put(
					dataSourceEntry.getKey(),
					new routines.system.TalendDataSource(dataSourceEntry
							.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
	}

	private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
	private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(
			new java.io.BufferedOutputStream(baos));

	public String getExceptionStackTrace() {
		if ("failure".equals(this.getStatus())) {
			errorMessagePS.flush();
			return baos.toString();
		}
		return null;
	}

	private Exception exception;

	public Exception getException() {
		if ("failure".equals(this.getStatus())) {
			return this.exception;
		}
		return null;
	}

	private class TalendException extends Exception {

		private static final long serialVersionUID = 1L;

		private java.util.Map<String, Object> globalMap = null;
		private Exception e = null;
		private String currentComponent = null;
		private String virtualComponentName = null;

		public void setVirtualComponentName(String virtualComponentName) {
			this.virtualComponentName = virtualComponentName;
		}

		private TalendException(Exception e, String errorComponent,
				final java.util.Map<String, Object> globalMap) {
			this.currentComponent = errorComponent;
			this.globalMap = globalMap;
			this.e = e;
		}

		public Exception getException() {
			return this.e;
		}

		public String getCurrentComponent() {
			return this.currentComponent;
		}

		public String getExceptionCauseMessage(Exception e) {
			Throwable cause = e;
			String message = null;
			int i = 10;
			while (null != cause && 0 < i--) {
				message = cause.getMessage();
				if (null == message) {
					cause = cause.getCause();
				} else {
					break;
				}
			}
			if (null == message) {
				message = e.getClass().getName();
			}
			return message;
		}

		@Override
		public void printStackTrace() {
			if (!(e instanceof TalendException || e instanceof TDieException)) {
				if (virtualComponentName != null
						&& currentComponent.indexOf(virtualComponentName + "_") == 0) {
					globalMap.put(virtualComponentName + "_ERROR_MESSAGE",
							getExceptionCauseMessage(e));
				}
				globalMap.put(currentComponent + "_ERROR_MESSAGE",
						getExceptionCauseMessage(e));
				System.err
						.println("Exception in component " + currentComponent);
			}
			if (!(e instanceof TDieException)) {
				if (e instanceof TalendException) {
					e.printStackTrace();
				} else {
					e.printStackTrace();
					e.printStackTrace(errorMessagePS);
					QA_Framework_Process_Email.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(QA_Framework_Process_Email.this,
									new Object[] { e, currentComponent,
											globalMap });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
					}
				} catch (Exception e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void tFileInputDelimited_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_1_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tJavaRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_1_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tOracleInput_7_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFlowToIterate_4_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleRow_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleRow_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleRow_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_3_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFlowToIterate_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleRow_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleRow_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleRow_6_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleRow_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_7_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleRow_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleRow_3_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_3_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleRow_4_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleRow_6_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public static class row7Struct implements
			routines.system.IPersistableRow<row7Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_Email = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[0];

		public String USER;

		public String getUSER() {
			return this.USER;
		}

		public String PASSWORD;

		public String getPASSWORD() {
			return this.PASSWORD;
		}

		public String HST_NAME;

		public String getHST_NAME() {
			return this.HST_NAME;
		}

		public String DB_NAME;

		public String getDB_NAME() {
			return this.DB_NAME;
		}

		public String SCHEMA;

		public String getSCHEMA() {
			return this.SCHEMA;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_Email.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_Email.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_QA_Framework_Process_Email, 0,
						length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_Email, 0,
						length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos)
				throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_Email) {

				try {

					int length = 0;

					this.USER = readString(dis);

					this.PASSWORD = readString(dis);

					this.HST_NAME = readString(dis);

					this.DB_NAME = readString(dis);

					this.SCHEMA = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.USER, dos);

				// String

				writeString(this.PASSWORD, dos);

				// String

				writeString(this.HST_NAME, dos);

				// String

				writeString(this.DB_NAME, dos);

				// String

				writeString(this.SCHEMA, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("USER=" + USER);
			sb.append(",PASSWORD=" + PASSWORD);
			sb.append(",HST_NAME=" + HST_NAME);
			sb.append(",DB_NAME=" + DB_NAME);
			sb.append(",SCHEMA=" + SCHEMA);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (USER == null) {
				sb.append("<null>");
			} else {
				sb.append(USER);
			}

			sb.append("|");

			if (PASSWORD == null) {
				sb.append("<null>");
			} else {
				sb.append(PASSWORD);
			}

			sb.append("|");

			if (HST_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(HST_NAME);
			}

			sb.append("|");

			if (DB_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(DB_NAME);
			}

			sb.append("|");

			if (SCHEMA == null) {
				sb.append("<null>");
			} else {
				sb.append(SCHEMA);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row7Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(),
						object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tFileInputDelimited_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {

			String currentMethodName = new java.lang.Exception()
					.getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				row7Struct row7 = new row7Struct();

				/**
				 * [tJavaRow_1 begin ] start
				 */

				ok_Hash.put("tJavaRow_1", false);
				start_Hash.put("tJavaRow_1", System.currentTimeMillis());

				currentComponent = "tJavaRow_1";

				int tos_count_tJavaRow_1 = 0;

				int nb_line_tJavaRow_1 = 0;

				/**
				 * [tJavaRow_1 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_1", false);
				start_Hash.put("tFileInputDelimited_1",
						System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_1";

				int tos_count_tFileInputDelimited_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFileInputDelimited_1 = new StringBuilder();
				log4jParamters_tFileInputDelimited_1.append("Parameters:");
				log4jParamters_tFileInputDelimited_1
						.append("FILENAME"
								+ " = "
								+ "context.localDirectory+\"/STATS_APEX_\"+context.dbVersion+\".txt\"");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("HEADER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("FOOTER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("LIMIT" + " = "
						+ "");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("REMOVE_EMPTY_ROW"
						+ " = " + "true");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("UNCOMPRESS"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("RANDOM" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("TRIMSELECT"
						+ " = " + "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("USER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("PASSWORD") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("HST_NAME")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("DB_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SCHEMA") + "}]");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("CHECK_FIELDS_NUM"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("CHECK_DATE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("SPLITRECORD"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("ENABLE_DECODE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_1 - "
							+ log4jParamters_tFileInputDelimited_1);

				final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				try {

					Object filename_tFileInputDelimited_1 = context.localDirectory
							+ "/STATS_APEX_" + context.dbVersion + ".txt";
					if (filename_tFileInputDelimited_1 instanceof java.io.InputStream) {

						int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
						if (footer_value_tFileInputDelimited_1 > 0
								|| random_value_tFileInputDelimited_1 > 0) {
							throw new java.lang.Exception(
									"When the input source is a stream,footer and random shouldn't be bigger than 0.");
						}

					}
					try {
						fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(
								context.localDirectory + "/STATS_APEX_"
										+ context.dbVersion + ".txt",
								"ISO-8859-15", ",", "\r\n", true, 0, 0, -1, -1,
								false);
					} catch (java.lang.Exception e) {

						log.error("tFileInputDelimited_1 - " + e.getMessage());

						System.err.println(e.getMessage());

					}

					log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");

					while (fid_tFileInputDelimited_1 != null
							&& fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();

						row7 = null;

						boolean whetherReject_tFileInputDelimited_1 = false;
						row7 = new row7Struct();
						try {

							int columnIndexWithD_tFileInputDelimited_1 = 0;

							columnIndexWithD_tFileInputDelimited_1 = 0;

							row7.USER = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 1;

							row7.PASSWORD = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 2;

							row7.HST_NAME = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 3;

							row7.DB_NAME = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 4;

							row7.SCHEMA = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							if (rowstate_tFileInputDelimited_1.getException() != null) {
								throw rowstate_tFileInputDelimited_1
										.getException();
							}

						} catch (java.lang.Exception e) {
							whetherReject_tFileInputDelimited_1 = true;

							log.error("tFileInputDelimited_1 - "
									+ e.getMessage());

							System.err.println(e.getMessage());
							row7 = null;

						}

						log.debug("tFileInputDelimited_1 - Retrieving the record "
								+ fid_tFileInputDelimited_1.getRowNumber()
								+ ".");

						/**
						 * [tFileInputDelimited_1 begin ] stop
						 */

						/**
						 * [tFileInputDelimited_1 main ] start
						 */

						currentComponent = "tFileInputDelimited_1";

						tos_count_tFileInputDelimited_1++;

						/**
						 * [tFileInputDelimited_1 main ] stop
						 */
						// Start of branch "row7"
						if (row7 != null) {

							/**
							 * [tJavaRow_1 main ] start
							 */

							currentComponent = "tJavaRow_1";

							if (log.isTraceEnabled()) {
								log.trace("row7 - "
										+ (row7 == null ? "" : row7
												.toLogString()));
							}

							// Code generate accord to input schema and output
							// schmea
							context.dbUserPI = row7.USER;
							context.dbPasswordPI = row7.PASSWORD;
							context.dbHostNamePI = row7.HST_NAME;
							context.dbNamePI = row7.DB_NAME;
							context.dbSchemaPI = row7.SCHEMA;
							nb_line_tJavaRow_1++;

							tos_count_tJavaRow_1++;

							/**
							 * [tJavaRow_1 main ] stop
							 */

						} // End of branch "row7"

						/**
						 * [tFileInputDelimited_1 end ] start
						 */

						currentComponent = "tFileInputDelimited_1";

					}
				} finally {
					if (!((Object) (context.localDirectory + "/STATS_APEX_"
							+ context.dbVersion + ".txt") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_1 != null) {
							fid_tFileInputDelimited_1.close();
						}
					}
					if (fid_tFileInputDelimited_1 != null) {
						globalMap.put("tFileInputDelimited_1_NB_LINE",
								fid_tFileInputDelimited_1.getRowNumber());

						log.info("tFileInputDelimited_1 - Retrieved records count: "
								+ fid_tFileInputDelimited_1.getRowNumber()
								+ ".");

					}
				}

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_1 - " + "Done.");

				ok_Hash.put("tFileInputDelimited_1", true);
				end_Hash.put("tFileInputDelimited_1",
						System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_1 end ] stop
				 */

				/**
				 * [tJavaRow_1 end ] start
				 */

				currentComponent = "tJavaRow_1";

				globalMap.put("tJavaRow_1_NB_LINE", nb_line_tJavaRow_1);

				ok_Hash.put("tJavaRow_1", true);
				end_Hash.put("tJavaRow_1", System.currentTimeMillis());

				if (context.testResult.equals("OK")
						&& context.notifySuccess.equals("Y")) {

					tOracleInput_7Process(globalMap);
				}

				if (context.testResult == "NOTOK"
						&& context.notifyError.equals("N")) {

					tOracleRow_3Process(globalMap);
				}

				if (context.testResult.equals("NOTOK")
						&& context.notifyError.equals("Y")) {

					tOracleInput_3Process(globalMap);
				}

				if (context.testResult.equals("OK")
						&& context.notifySuccess.equals("N")) {

					tOracleRow_6Process(globalMap);
				}

				/**
				 * [tJavaRow_1 end ] stop
				 */

			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			try {

				/**
				 * [tFileInputDelimited_1 finally ] start
				 */

				currentComponent = "tFileInputDelimited_1";

				/**
				 * [tFileInputDelimited_1 finally ] stop
				 */

				/**
				 * [tJavaRow_1 finally ] start
				 */

				currentComponent = "tJavaRow_1";

				/**
				 * [tJavaRow_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}

	public static class row9Struct implements
			routines.system.IPersistableRow<row9Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_Email = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[0];

		public String EMAIL_TO;

		public String getEMAIL_TO() {
			return this.EMAIL_TO;
		}

		public String EMAIL_CC;

		public String getEMAIL_CC() {
			return this.EMAIL_CC;
		}

		public String EMAIL_FROM;

		public String getEMAIL_FROM() {
			return this.EMAIL_FROM;
		}

		public String SUCCESS_MESSAGE;

		public String getSUCCESS_MESSAGE() {
			return this.SUCCESS_MESSAGE;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_Email.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_Email.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_QA_Framework_Process_Email, 0,
						length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_Email, 0,
						length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos)
				throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_Email) {

				try {

					int length = 0;

					this.EMAIL_TO = readString(dis);

					this.EMAIL_CC = readString(dis);

					this.EMAIL_FROM = readString(dis);

					this.SUCCESS_MESSAGE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.EMAIL_TO, dos);

				// String

				writeString(this.EMAIL_CC, dos);

				// String

				writeString(this.EMAIL_FROM, dos);

				// String

				writeString(this.SUCCESS_MESSAGE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("EMAIL_TO=" + EMAIL_TO);
			sb.append(",EMAIL_CC=" + EMAIL_CC);
			sb.append(",EMAIL_FROM=" + EMAIL_FROM);
			sb.append(",SUCCESS_MESSAGE=" + SUCCESS_MESSAGE);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (EMAIL_TO == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_TO);
			}

			sb.append("|");

			if (EMAIL_CC == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_CC);
			}

			sb.append("|");

			if (EMAIL_FROM == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_FROM);
			}

			sb.append("|");

			if (SUCCESS_MESSAGE == null) {
				sb.append("<null>");
			} else {
				sb.append(SUCCESS_MESSAGE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row9Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(),
						object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tOracleInput_7Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_7_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {

			String currentMethodName = new java.lang.Exception()
					.getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				row9Struct row9 = new row9Struct();

				/**
				 * [tFlowToIterate_4 begin ] start
				 */

				int NB_ITERATE_tSendMail_3 = 0; // for statistics

				ok_Hash.put("tFlowToIterate_4", false);
				start_Hash.put("tFlowToIterate_4", System.currentTimeMillis());

				currentComponent = "tFlowToIterate_4";

				int tos_count_tFlowToIterate_4 = 0;

				if (log.isInfoEnabled())
					log.info("tFlowToIterate_4 - " + "Start to work.");
				StringBuilder log4jParamters_tFlowToIterate_4 = new StringBuilder();
				log4jParamters_tFlowToIterate_4.append("Parameters:");
				log4jParamters_tFlowToIterate_4.append("DEFAULT_MAP" + " = "
						+ "true");
				log4jParamters_tFlowToIterate_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFlowToIterate_4 - "
							+ log4jParamters_tFlowToIterate_4);

				int nb_line_tFlowToIterate_4 = 0;
				int counter_tFlowToIterate_4 = 0;

				/**
				 * [tFlowToIterate_4 begin ] stop
				 */

				/**
				 * [tOracleInput_7 begin ] start
				 */

				ok_Hash.put("tOracleInput_7", false);
				start_Hash.put("tOracleInput_7", System.currentTimeMillis());

				currentComponent = "tOracleInput_7";

				int tos_count_tOracleInput_7 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_7 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_7 = new StringBuilder();
				log4jParamters_tOracleInput_7.append("Parameters:");
				log4jParamters_tOracleInput_7.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("TABLE" + " = "
						+ "\"metadata\"");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7
						.append("QUERY"
								+ " = "
								+ "\"  SELECT  REPLACE(EMAIL_TO,':',';'),REPLACE(EMAIL_CC,':',';'),EMAIL_FROM,SUCCESS_MESSAGE  FROM QA_EMAIL  WHERE RULE_ID = \"+context.ruleID");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("EMAIL_TO") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EMAIL_CC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("EMAIL_FROM")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SUCCESS_MESSAGE") + "}]");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_7.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_7 - "
							+ log4jParamters_tOracleInput_7);

				int nb_line_tOracleInput_7 = 0;
				java.sql.Connection conn_tOracleInput_7 = null;
				String driverClass_tOracleInput_7 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_7);

				String url_tOracleInput_7 = null;
				url_tOracleInput_7 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_7 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_7 = context.dbPasswordPI;

				String dbPwd_tOracleInput_7 = decryptedPassword_tOracleInput_7;

				log.debug("tOracleInput_7 - Driver ClassName: "
						+ driverClass_tOracleInput_7 + ".");

				log.info("tOracleInput_7 - Connection attempt to '"
						+ url_tOracleInput_7 + "' with the username '"
						+ dbUser_tOracleInput_7 + "'.");

				conn_tOracleInput_7 = java.sql.DriverManager.getConnection(
						url_tOracleInput_7, dbUser_tOracleInput_7,
						dbPwd_tOracleInput_7);
				log.info("tOracleInput_7 - Connection to '"
						+ url_tOracleInput_7 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_7 = conn_tOracleInput_7
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_7 = stmtGetTZ_tOracleInput_7
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_7 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_7.next()) {
					sessionTimezone_tOracleInput_7 = rsGetTZ_tOracleInput_7
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_7)
						.setSessionTimeZone(sessionTimezone_tOracleInput_7);

				java.sql.Statement stmt_tOracleInput_7 = conn_tOracleInput_7
						.createStatement();

				String dbquery_tOracleInput_7 = "\nSELECT  REPLACE(EMAIL_TO,':',';'),REPLACE(EMAIL_CC,':',';'),EMAIL_FROM,SUCCESS_MESSAGE\nFROM QA_EMAIL\nWHERE RULE_ID = "
						+ context.ruleID;

				log.info("tOracleInput_7 - Executing the query: '"
						+ dbquery_tOracleInput_7 + "'.");

				globalMap.put("tOracleInput_7_QUERY", dbquery_tOracleInput_7);

				java.sql.ResultSet rs_tOracleInput_7 = null;
				try {
					rs_tOracleInput_7 = stmt_tOracleInput_7
							.executeQuery(dbquery_tOracleInput_7);
					java.sql.ResultSetMetaData rsmd_tOracleInput_7 = rs_tOracleInput_7
							.getMetaData();
					int colQtyInRs_tOracleInput_7 = rsmd_tOracleInput_7
							.getColumnCount();

					String tmpContent_tOracleInput_7 = null;

					log.info("tOracleInput_7 - Retrieving records from the database.");

					while (rs_tOracleInput_7.next()) {
						nb_line_tOracleInput_7++;

						if (colQtyInRs_tOracleInput_7 < 1) {
							row9.EMAIL_TO = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(1);
							if (tmpContent_tOracleInput_7 != null) {
								row9.EMAIL_TO = tmpContent_tOracleInput_7;
							} else {
								row9.EMAIL_TO = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 2) {
							row9.EMAIL_CC = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(2);
							if (tmpContent_tOracleInput_7 != null) {
								row9.EMAIL_CC = tmpContent_tOracleInput_7;
							} else {
								row9.EMAIL_CC = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 3) {
							row9.EMAIL_FROM = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(3);
							if (tmpContent_tOracleInput_7 != null) {
								row9.EMAIL_FROM = tmpContent_tOracleInput_7;
							} else {
								row9.EMAIL_FROM = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 4) {
							row9.SUCCESS_MESSAGE = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(4);
							if (tmpContent_tOracleInput_7 != null) {
								row9.SUCCESS_MESSAGE = tmpContent_tOracleInput_7;
							} else {
								row9.SUCCESS_MESSAGE = null;
							}
						}

						log.debug("tOracleInput_7 - Retrieving the record "
								+ nb_line_tOracleInput_7 + ".");

						/**
						 * [tOracleInput_7 begin ] stop
						 */

						/**
						 * [tOracleInput_7 main ] start
						 */

						currentComponent = "tOracleInput_7";

						tos_count_tOracleInput_7++;

						/**
						 * [tOracleInput_7 main ] stop
						 */

						/**
						 * [tFlowToIterate_4 main ] start
						 */

						currentComponent = "tFlowToIterate_4";

						if (log.isTraceEnabled()) {
							log.trace("row9 - "
									+ (row9 == null ? "" : row9.toLogString()));
						}

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_4 - "
									+ "Set global var, key=row9.EMAIL_TO, value="
									+ row9.EMAIL_TO + ".");
						globalMap.put("row9.EMAIL_TO", row9.EMAIL_TO);
						nb_line_tFlowToIterate_4++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_4 - "
									+ "Set global var, key=row9.EMAIL_CC, value="
									+ row9.EMAIL_CC + ".");
						globalMap.put("row9.EMAIL_CC", row9.EMAIL_CC);
						nb_line_tFlowToIterate_4++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_4 - "
									+ "Set global var, key=row9.EMAIL_FROM, value="
									+ row9.EMAIL_FROM + ".");
						globalMap.put("row9.EMAIL_FROM", row9.EMAIL_FROM);
						nb_line_tFlowToIterate_4++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_4 - "
									+ "Set global var, key=row9.SUCCESS_MESSAGE, value="
									+ row9.SUCCESS_MESSAGE + ".");
						globalMap.put("row9.SUCCESS_MESSAGE",
								row9.SUCCESS_MESSAGE);
						nb_line_tFlowToIterate_4++;

						counter_tFlowToIterate_4++;
						if (log.isDebugEnabled())
							log.debug("tFlowToIterate_4 - "
									+ "Current iteration is: "
									+ counter_tFlowToIterate_4 + ".");
						globalMap.put("tFlowToIterate_4_CURRENT_ITERATION",
								counter_tFlowToIterate_4);

						tos_count_tFlowToIterate_4++;

						/**
						 * [tFlowToIterate_4 main ] stop
						 */
						NB_ITERATE_tSendMail_3++;

						/**
						 * [tSendMail_3 begin ] start
						 */

						ok_Hash.put("tSendMail_3", false);
						start_Hash.put("tSendMail_3",
								System.currentTimeMillis());

						currentComponent = "tSendMail_3";

						int tos_count_tSendMail_3 = 0;

						if (log.isInfoEnabled())
							log.info("tSendMail_3 - " + "Start to work.");
						StringBuilder log4jParamters_tSendMail_3 = new StringBuilder();
						log4jParamters_tSendMail_3.append("Parameters:");
						log4jParamters_tSendMail_3.append("TO" + " = "
								+ "((String)globalMap.get(\"row9.EMAIL_TO\"))");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3
								.append("FROM"
										+ " = "
										+ "((String)globalMap.get(\"row9.EMAIL_FROM\"))");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("NEED_PERSONAL_NAME"
								+ " = " + "false");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("CC" + " = "
								+ "((String)globalMap.get(\"row9.EMAIL_CC\"))");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("BCC" + " = "
								+ "\"\"");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3
								.append("SUBJECT"
										+ " = "
										+ "\"ALERT \"+context.ruleDesc+\"_\"+context.ruleID+\" SUCCESS\"");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3
								.append("MESSAGE"
										+ " = "
										+ "\"<html> <body>  <img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>   <br>  <br>  \"+((String)globalMap.get(\"row9.SUCCESS_MESSAGE\"))+\"   <br>  <br>  <br>  </body>  </html>\"");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("CHECK_ATTACHMENT"
								+ " = " + "true");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("ATTACHMENTS" + " = "
								+ "[]");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("HEADERS" + " = "
								+ "[]");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("SMTP_HOST" + " = "
								+ "\"smtp.dc.polk.com\"");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("SMTP_PORT" + " = "
								+ "25");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("SSL" + " = "
								+ "false");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("STARTTLS" + " = "
								+ "false");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("IMPORTANCE" + " = "
								+ "Normal");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("NEED_AUTH" + " = "
								+ "false");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("DIE_ON_ERROR"
								+ " = " + "true");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("TEXT_SUBTYPE"
								+ " = " + "html");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("ENCODING" + " = "
								+ "\"ISO-8859-15\"");
						log4jParamters_tSendMail_3.append(" | ");
						log4jParamters_tSendMail_3.append("SET_LOCALHOST"
								+ " = " + "false");
						log4jParamters_tSendMail_3.append(" | ");
						if (log.isDebugEnabled())
							log.debug("tSendMail_3 - "
									+ log4jParamters_tSendMail_3);

						/**
						 * [tSendMail_3 begin ] stop
						 */

						/**
						 * [tSendMail_3 main ] start
						 */

						currentComponent = "tSendMail_3";

						String smtpHost_tSendMail_3 = "smtp.dc.polk.com";
						String smtpPort_tSendMail_3 = "25";
						String from_tSendMail_3 = (((String) globalMap
								.get("row9.EMAIL_FROM")));
						String to_tSendMail_3 = (((String) globalMap
								.get("row9.EMAIL_TO"))).replace(";", ",");
						String cc_tSendMail_3 = ((((String) globalMap
								.get("row9.EMAIL_CC"))) == null || ""
								.equals(((String) globalMap
										.get("row9.EMAIL_CC")))) ? null
								: (((String) globalMap.get("row9.EMAIL_CC")))
										.replace(";", ",");
						String bcc_tSendMail_3 = (("") == null || "".equals("")) ? null
								: ("").replace(";", ",");
						String subject_tSendMail_3 = ("ALERT "
								+ context.ruleDesc + "_" + context.ruleID + " SUCCESS");

						java.util.List<java.util.Map<String, String>> headers_tSendMail_3 = new java.util.ArrayList<java.util.Map<String, String>>();
						java.util.List<String> attachments_tSendMail_3 = new java.util.ArrayList<String>();
						java.util.List<String> contentTransferEncoding_tSendMail_3 = new java.util.ArrayList<String>();

						String message_tSendMail_3 = (("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\n"
								+ ((String) globalMap
										.get("row9.SUCCESS_MESSAGE")) + "\n <br>\n<br>\n<br>\n</body>\n</html>") == null || ""
								.equals("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\n"
										+ ((String) globalMap
												.get("row9.SUCCESS_MESSAGE"))
										+ "\n <br>\n<br>\n<br>\n</body>\n</html>")) ? "\"\""
								: ("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\n"
										+ ((String) globalMap
												.get("row9.SUCCESS_MESSAGE")) + "\n <br>\n<br>\n<br>\n</body>\n</html>");
						java.util.Properties props_tSendMail_3 = System
								.getProperties();
						props_tSendMail_3.put("mail.smtp.host",
								smtpHost_tSendMail_3);
						props_tSendMail_3.put("mail.smtp.port",
								smtpPort_tSendMail_3);
						props_tSendMail_3.put("mail.mime.encodefilename",
								"true");
						try {

							log.info("tSendMail_3 - Connection attempt to '"
									+ smtpHost_tSendMail_3 + "'.");

							props_tSendMail_3.put("mail.smtp.auth", "false");
							javax.mail.Session session_tSendMail_3 = javax.mail.Session
									.getInstance(props_tSendMail_3, null);

							log.info("tSendMail_3 - Connection to '"
									+ smtpHost_tSendMail_3 + "' has succeeded.");

							javax.mail.Message msg_tSendMail_3 = new javax.mail.internet.MimeMessage(
									session_tSendMail_3);
							msg_tSendMail_3
									.setFrom(new javax.mail.internet.InternetAddress(
											from_tSendMail_3, null));
							msg_tSendMail_3.setRecipients(
									javax.mail.Message.RecipientType.TO,
									javax.mail.internet.InternetAddress.parse(
											to_tSendMail_3, false));
							if (cc_tSendMail_3 != null)
								msg_tSendMail_3.setRecipients(
										javax.mail.Message.RecipientType.CC,
										javax.mail.internet.InternetAddress
												.parse(cc_tSendMail_3, false));
							if (bcc_tSendMail_3 != null)
								msg_tSendMail_3.setRecipients(
										javax.mail.Message.RecipientType.BCC,
										javax.mail.internet.InternetAddress
												.parse(bcc_tSendMail_3, false));
							msg_tSendMail_3.setSubject(subject_tSendMail_3);

							for (int i_tSendMail_3 = 0; i_tSendMail_3 < headers_tSendMail_3
									.size(); i_tSendMail_3++) {
								java.util.Map<String, String> header_tSendMail_3 = headers_tSendMail_3
										.get(i_tSendMail_3);
								msg_tSendMail_3.setHeader(
										header_tSendMail_3.get("KEY"),
										header_tSendMail_3.get("VALUE"));
							}
							msg_tSendMail_3.setSentDate(new Date());
							msg_tSendMail_3.setHeader("X-Priority", "3"); // High->1
																			// Normal->3
																			// Low->5
							javax.mail.Multipart mp_tSendMail_3 = new javax.mail.internet.MimeMultipart();
							javax.mail.internet.MimeBodyPart mbpText_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
							mbpText_tSendMail_3.setText(message_tSendMail_3,
									"ISO-8859-15", "html");
							mp_tSendMail_3.addBodyPart(mbpText_tSendMail_3);

							javax.mail.internet.MimeBodyPart mbpFile_tSendMail_3 = null;

							for (int i_tSendMail_3 = 0; i_tSendMail_3 < attachments_tSendMail_3
									.size(); i_tSendMail_3++) {
								String filename_tSendMail_3 = attachments_tSendMail_3
										.get(i_tSendMail_3);
								javax.activation.FileDataSource fds_tSendMail_3 = null;
								java.io.File file_tSendMail_3 = new java.io.File(
										filename_tSendMail_3);

								if (file_tSendMail_3.isDirectory()) {
									java.io.File[] subFiles_tSendMail_3 = file_tSendMail_3
											.listFiles();
									for (java.io.File subFile_tSendMail_3 : subFiles_tSendMail_3) {
										if (subFile_tSendMail_3.isFile()) {
											fds_tSendMail_3 = new javax.activation.FileDataSource(
													subFile_tSendMail_3
															.getAbsolutePath());
											mbpFile_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
											mbpFile_tSendMail_3
													.setDataHandler(new javax.activation.DataHandler(
															fds_tSendMail_3));
											mbpFile_tSendMail_3
													.setFileName(javax.mail.internet.MimeUtility
															.encodeText(fds_tSendMail_3
																	.getName()));
											if (contentTransferEncoding_tSendMail_3
													.get(i_tSendMail_3)
													.equalsIgnoreCase("base64")) {
												mbpFile_tSendMail_3
														.setHeader(
																"Content-Transfer-Encoding",
																"base64");
											}
											mp_tSendMail_3
													.addBodyPart(mbpFile_tSendMail_3);
										}
									}
								} else {
									mbpFile_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
									fds_tSendMail_3 = new javax.activation.FileDataSource(
											filename_tSendMail_3);
									mbpFile_tSendMail_3
											.setDataHandler(new javax.activation.DataHandler(
													fds_tSendMail_3));
									mbpFile_tSendMail_3
											.setFileName(javax.mail.internet.MimeUtility
													.encodeText(fds_tSendMail_3
															.getName()));
									if (contentTransferEncoding_tSendMail_3
											.get(i_tSendMail_3)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_3.setHeader(
												"Content-Transfer-Encoding",
												"base64");
									}
									mp_tSendMail_3
											.addBodyPart(mbpFile_tSendMail_3);
								}
							}
							// -- set the content --
							msg_tSendMail_3.setContent(mp_tSendMail_3);
							// add handlers for main MIME types
							javax.activation.MailcapCommandMap mc_tSendMail_3 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
									.getDefaultCommandMap();
							mc_tSendMail_3
									.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
							mc_tSendMail_3
									.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
							mc_tSendMail_3
									.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
							mc_tSendMail_3
									.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
							mc_tSendMail_3
									.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
							javax.activation.CommandMap
									.setDefaultCommandMap(mc_tSendMail_3);
							// -- Send the message --
							javax.mail.Transport.send(msg_tSendMail_3);
						} catch (java.lang.Exception e) {

							throw (e);

						} finally {
							props_tSendMail_3.remove("mail.smtp.host");
							props_tSendMail_3.remove("mail.smtp.port");

							props_tSendMail_3
									.remove("mail.mime.encodefilename");

							props_tSendMail_3.remove("mail.smtp.auth");
						}

						tos_count_tSendMail_3++;

						/**
						 * [tSendMail_3 main ] stop
						 */

						/**
						 * [tSendMail_3 end ] start
						 */

						currentComponent = "tSendMail_3";

						if (log.isInfoEnabled())
							log.info("tSendMail_3 - " + "Done.");

						ok_Hash.put("tSendMail_3", true);
						end_Hash.put("tSendMail_3", System.currentTimeMillis());

						tOracleRow_2Process(globalMap);

						/**
						 * [tSendMail_3 end ] stop
						 */

						/**
						 * [tOracleInput_7 end ] start
						 */

						currentComponent = "tOracleInput_7";

					}
				} finally {
					stmt_tOracleInput_7.close();

					if (conn_tOracleInput_7 != null
							&& !conn_tOracleInput_7.isClosed()) {

						log.info("tOracleInput_7 - Closing the connection to the database.");

						conn_tOracleInput_7.close();

						log.info("tOracleInput_7 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_7_NB_LINE", nb_line_tOracleInput_7);
				log.info("tOracleInput_7 - Retrieved records count: "
						+ nb_line_tOracleInput_7 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_7 - " + "Done.");

				ok_Hash.put("tOracleInput_7", true);
				end_Hash.put("tOracleInput_7", System.currentTimeMillis());

				/**
				 * [tOracleInput_7 end ] stop
				 */

				/**
				 * [tFlowToIterate_4 end ] start
				 */

				currentComponent = "tFlowToIterate_4";

				globalMap.put("tFlowToIterate_4_NB_LINE",
						nb_line_tFlowToIterate_4);

				if (log.isInfoEnabled())
					log.info("tFlowToIterate_4 - " + "Done.");

				ok_Hash.put("tFlowToIterate_4", true);
				end_Hash.put("tFlowToIterate_4", System.currentTimeMillis());

				/**
				 * [tFlowToIterate_4 end ] stop
				 */

			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			try {

				/**
				 * [tOracleInput_7 finally ] start
				 */

				currentComponent = "tOracleInput_7";

				/**
				 * [tOracleInput_7 finally ] stop
				 */

				/**
				 * [tFlowToIterate_4 finally ] start
				 */

				currentComponent = "tFlowToIterate_4";

				/**
				 * [tFlowToIterate_4 finally ] stop
				 */

				/**
				 * [tSendMail_3 finally ] start
				 */

				currentComponent = "tSendMail_3";

				/**
				 * [tSendMail_3 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_7_SUBPROCESS_STATE", 1);
	}

	public void tOracleRow_2Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleRow_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {

			String currentMethodName = new java.lang.Exception()
					.getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				/**
				 * [tOracleRow_2 begin ] start
				 */

				ok_Hash.put("tOracleRow_2", false);
				start_Hash.put("tOracleRow_2", System.currentTimeMillis());

				currentComponent = "tOracleRow_2";

				int tos_count_tOracleRow_2 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleRow_2 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleRow_2 = new StringBuilder();
				log4jParamters_tOracleRow_2.append("Parameters:");
				log4jParamters_tOracleRow_2.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("DB_VERSION" + " = "
						+ "ORACLE_12");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("PORT" + " = " + "\"1521\"");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2
						.append("QUERY"
								+ " = "
								+ "\"  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = \"+context.ruleID+\";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'Y'  WHERE RULE_ID = \"+context.ruleID+\"  AND EXEC_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'OK'  WHERE RULE_ID = \"+context.ruleID+\"  AND START_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  \"");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("USE_NB_LINE" + " = "
						+ "NONE");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("DIE_ON_ERROR" + " = "
						+ "false");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("PROPAGATE_RECORD_SET"
						+ " = " + "false");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("USE_PREPAREDSTATEMENT"
						+ " = " + "false");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("COMMIT_EVERY" + " = "
						+ "10000");
				log4jParamters_tOracleRow_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleRow_2 - " + log4jParamters_tOracleRow_2);

				java.sql.Connection conn_tOracleRow_2 = null;
				String query_tOracleRow_2 = "";
				boolean whetherReject_tOracleRow_2 = false;
				String driverClass_tOracleRow_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleRow_2);

				String url_tOracleRow_2 = null;
				url_tOracleRow_2 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";
				log.debug("tOracleRow_2 - Driver ClassName: "
						+ driverClass_tOracleRow_2 + ".");

				String dbUser_tOracleRow_2 = context.dbUserPI;

				final String decryptedPassword_tOracleRow_2 = context.dbPasswordPI;

				String dbPwd_tOracleRow_2 = decryptedPassword_tOracleRow_2;

				log.info("tOracleRow_2 - Connection attempt to '"
						+ url_tOracleRow_2 + "' with the username '"
						+ dbUser_tOracleRow_2 + "'.");

				conn_tOracleRow_2 = java.sql.DriverManager.getConnection(
						url_tOracleRow_2, dbUser_tOracleRow_2,
						dbPwd_tOracleRow_2);

				log.info("tOracleRow_2 - Connection to '" + url_tOracleRow_2
						+ "' has succeeded.");

				if (conn_tOracleRow_2.getAutoCommit()) {

					log.debug("tOracleRow_2 - Connection is set auto commit to 'false'.");

					conn_tOracleRow_2.setAutoCommit(false);

				}
				int commitEvery_tOracleRow_2 = 10000;
				int commitCounter_tOracleRow_2 = 0;

				java.sql.Statement stmt_tOracleRow_2 = conn_tOracleRow_2
						.createStatement();

				/**
				 * [tOracleRow_2 begin ] stop
				 */

				/**
				 * [tOracleRow_2 main ] start
				 */

				currentComponent = "tOracleRow_2";

				log.info("tOracleRow_2 - Executing the query: '"
						+ "  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = "
						+ context.ruleID
						+ ";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'Y'  WHERE RULE_ID = "
						+ context.ruleID
						+ "  AND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'OK'  WHERE RULE_ID = "
						+ context.ruleID + "  AND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  "
						+ "'.");

				query_tOracleRow_2 = "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
						+ context.ruleID
						+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'Y'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'OK'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n";
				whetherReject_tOracleRow_2 = false;
				globalMap.put("tOracleRow_2_QUERY", query_tOracleRow_2);
				try {
					stmt_tOracleRow_2.execute(query_tOracleRow_2);

					log.info("tOracleRow_2 - Execute the query: '"
							+ "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
							+ context.ruleID
							+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'Y'\nWHERE RULE_ID = "
							+ context.ruleID
							+ "\nAND EXEC_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'OK'\nWHERE RULE_ID = "
							+ context.ruleID + "\nAND START_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n"
							+ "' has finished.");

				} catch (java.lang.Exception e) {
					whetherReject_tOracleRow_2 = true;

					log.error("tOracleRow_2 - " + e.getMessage());

					System.err.print(e.getMessage());

				}

				commitCounter_tOracleRow_2++;
				if (commitEvery_tOracleRow_2 <= commitCounter_tOracleRow_2) {

					log.debug("tOracleRow_2 - Connection starting to commit.");

					conn_tOracleRow_2.commit();

					log.debug("tOracleRow_2 - Connection commit has succeeded.");

					commitCounter_tOracleRow_2 = 0;
				}

				tos_count_tOracleRow_2++;

				/**
				 * [tOracleRow_2 main ] stop
				 */

				/**
				 * [tOracleRow_2 end ] start
				 */

				currentComponent = "tOracleRow_2";

				stmt_tOracleRow_2.close();
				if (commitEvery_tOracleRow_2 > commitCounter_tOracleRow_2) {

					log.debug("tOracleRow_2 - Connection starting to commit.");

					conn_tOracleRow_2.commit();

					log.debug("tOracleRow_2 - Connection commit has succeeded.");

					commitCounter_tOracleRow_2 = 0;

				}
				log.info("tOracleRow_2 - Closing the connection to the database.");

				conn_tOracleRow_2.close();

				log.info("tOracleRow_2 - Connection to the database closed.");

				if (log.isInfoEnabled())
					log.info("tOracleRow_2 - " + "Done.");

				ok_Hash.put("tOracleRow_2", true);
				end_Hash.put("tOracleRow_2", System.currentTimeMillis());

				/**
				 * [tOracleRow_2 end ] stop
				 */
			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			try {

				/**
				 * [tOracleRow_2 finally ] start
				 */

				currentComponent = "tOracleRow_2";

				/**
				 * [tOracleRow_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleRow_2_SUBPROCESS_STATE", 1);
	}

	public void tOracleRow_3Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleRow_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {

			String currentMethodName = new java.lang.Exception()
					.getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				/**
				 * [tOracleRow_3 begin ] start
				 */

				ok_Hash.put("tOracleRow_3", false);
				start_Hash.put("tOracleRow_3", System.currentTimeMillis());

				currentComponent = "tOracleRow_3";

				int tos_count_tOracleRow_3 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleRow_3 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleRow_3 = new StringBuilder();
				log4jParamters_tOracleRow_3.append("Parameters:");
				log4jParamters_tOracleRow_3.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("DB_VERSION" + " = "
						+ "ORACLE_12");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("PORT" + " = " + "\"1521\"");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3
						.append("QUERY"
								+ " = "
								+ "\"  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = \"+context.ruleID+\";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'E'  WHERE RULE_ID = \"+context.ruleID+\"  AND EXEC_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'NOTOK'  WHERE RULE_ID = \"+context.ruleID+\"  AND START_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  \"");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("USE_NB_LINE" + " = "
						+ "NONE");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("DIE_ON_ERROR" + " = "
						+ "false");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("PROPAGATE_RECORD_SET"
						+ " = " + "false");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("USE_PREPAREDSTATEMENT"
						+ " = " + "false");
				log4jParamters_tOracleRow_3.append(" | ");
				log4jParamters_tOracleRow_3.append("COMMIT_EVERY" + " = "
						+ "10000");
				log4jParamters_tOracleRow_3.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleRow_3 - " + log4jParamters_tOracleRow_3);

				java.sql.Connection conn_tOracleRow_3 = null;
				String query_tOracleRow_3 = "";
				boolean whetherReject_tOracleRow_3 = false;
				String driverClass_tOracleRow_3 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleRow_3);

				String url_tOracleRow_3 = null;
				url_tOracleRow_3 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";
				log.debug("tOracleRow_3 - Driver ClassName: "
						+ driverClass_tOracleRow_3 + ".");

				String dbUser_tOracleRow_3 = context.dbUserPI;

				final String decryptedPassword_tOracleRow_3 = context.dbPasswordPI;

				String dbPwd_tOracleRow_3 = decryptedPassword_tOracleRow_3;

				log.info("tOracleRow_3 - Connection attempt to '"
						+ url_tOracleRow_3 + "' with the username '"
						+ dbUser_tOracleRow_3 + "'.");

				conn_tOracleRow_3 = java.sql.DriverManager.getConnection(
						url_tOracleRow_3, dbUser_tOracleRow_3,
						dbPwd_tOracleRow_3);

				log.info("tOracleRow_3 - Connection to '" + url_tOracleRow_3
						+ "' has succeeded.");

				if (conn_tOracleRow_3.getAutoCommit()) {

					log.debug("tOracleRow_3 - Connection is set auto commit to 'false'.");

					conn_tOracleRow_3.setAutoCommit(false);

				}
				int commitEvery_tOracleRow_3 = 10000;
				int commitCounter_tOracleRow_3 = 0;

				java.sql.Statement stmt_tOracleRow_3 = conn_tOracleRow_3
						.createStatement();

				/**
				 * [tOracleRow_3 begin ] stop
				 */

				/**
				 * [tOracleRow_3 main ] start
				 */

				currentComponent = "tOracleRow_3";

				log.info("tOracleRow_3 - Executing the query: '"
						+ "  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = "
						+ context.ruleID
						+ ";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'E'  WHERE RULE_ID = "
						+ context.ruleID
						+ "  AND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'NOTOK'  WHERE RULE_ID = "
						+ context.ruleID + "  AND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  "
						+ "'.");

				query_tOracleRow_3 = "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
						+ context.ruleID
						+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'E'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'NOTOK'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n";
				whetherReject_tOracleRow_3 = false;
				globalMap.put("tOracleRow_3_QUERY", query_tOracleRow_3);
				try {
					stmt_tOracleRow_3.execute(query_tOracleRow_3);

					log.info("tOracleRow_3 - Execute the query: '"
							+ "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
							+ context.ruleID
							+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'E'\nWHERE RULE_ID = "
							+ context.ruleID
							+ "\nAND EXEC_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'NOTOK'\nWHERE RULE_ID = "
							+ context.ruleID + "\nAND START_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n"
							+ "' has finished.");

				} catch (java.lang.Exception e) {
					whetherReject_tOracleRow_3 = true;

					log.error("tOracleRow_3 - " + e.getMessage());

					System.err.print(e.getMessage());

				}

				commitCounter_tOracleRow_3++;
				if (commitEvery_tOracleRow_3 <= commitCounter_tOracleRow_3) {

					log.debug("tOracleRow_3 - Connection starting to commit.");

					conn_tOracleRow_3.commit();

					log.debug("tOracleRow_3 - Connection commit has succeeded.");

					commitCounter_tOracleRow_3 = 0;
				}

				tos_count_tOracleRow_3++;

				/**
				 * [tOracleRow_3 main ] stop
				 */

				/**
				 * [tOracleRow_3 end ] start
				 */

				currentComponent = "tOracleRow_3";

				stmt_tOracleRow_3.close();
				if (commitEvery_tOracleRow_3 > commitCounter_tOracleRow_3) {

					log.debug("tOracleRow_3 - Connection starting to commit.");

					conn_tOracleRow_3.commit();

					log.debug("tOracleRow_3 - Connection commit has succeeded.");

					commitCounter_tOracleRow_3 = 0;

				}
				log.info("tOracleRow_3 - Closing the connection to the database.");

				conn_tOracleRow_3.close();

				log.info("tOracleRow_3 - Connection to the database closed.");

				if (log.isInfoEnabled())
					log.info("tOracleRow_3 - " + "Done.");

				ok_Hash.put("tOracleRow_3", true);
				end_Hash.put("tOracleRow_3", System.currentTimeMillis());

				/**
				 * [tOracleRow_3 end ] stop
				 */
			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			try {

				/**
				 * [tOracleRow_3 finally ] start
				 */

				currentComponent = "tOracleRow_3";

				/**
				 * [tOracleRow_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleRow_3_SUBPROCESS_STATE", 1);
	}

	public static class row4Struct implements
			routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_Email = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[0];

		public String EMAIL_TO;

		public String getEMAIL_TO() {
			return this.EMAIL_TO;
		}

		public String EMAIL_CC;

		public String getEMAIL_CC() {
			return this.EMAIL_CC;
		}

		public String EMAIL_FROM;

		public String getEMAIL_FROM() {
			return this.EMAIL_FROM;
		}

		public String ERROR_MESSAGE;

		public String getERROR_MESSAGE() {
			return this.ERROR_MESSAGE;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_Email.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_Email.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_Email = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_QA_Framework_Process_Email, 0,
						length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_Email, 0,
						length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos)
				throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_Email) {

				try {

					int length = 0;

					this.EMAIL_TO = readString(dis);

					this.EMAIL_CC = readString(dis);

					this.EMAIL_FROM = readString(dis);

					this.ERROR_MESSAGE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.EMAIL_TO, dos);

				// String

				writeString(this.EMAIL_CC, dos);

				// String

				writeString(this.EMAIL_FROM, dos);

				// String

				writeString(this.ERROR_MESSAGE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("EMAIL_TO=" + EMAIL_TO);
			sb.append(",EMAIL_CC=" + EMAIL_CC);
			sb.append(",EMAIL_FROM=" + EMAIL_FROM);
			sb.append(",ERROR_MESSAGE=" + ERROR_MESSAGE);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (EMAIL_TO == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_TO);
			}

			sb.append("|");

			if (EMAIL_CC == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_CC);
			}

			sb.append("|");

			if (EMAIL_FROM == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_FROM);
			}

			sb.append("|");

			if (ERROR_MESSAGE == null) {
				sb.append("<null>");
			} else {
				sb.append(ERROR_MESSAGE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row4Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(),
						object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tOracleInput_3Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {

			String currentMethodName = new java.lang.Exception()
					.getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				row4Struct row4 = new row4Struct();

				/**
				 * [tFlowToIterate_2 begin ] start
				 */

				int NB_ITERATE_tSendMail_1 = 0; // for statistics

				ok_Hash.put("tFlowToIterate_2", false);
				start_Hash.put("tFlowToIterate_2", System.currentTimeMillis());

				currentComponent = "tFlowToIterate_2";

				int tos_count_tFlowToIterate_2 = 0;

				if (log.isInfoEnabled())
					log.info("tFlowToIterate_2 - " + "Start to work.");
				StringBuilder log4jParamters_tFlowToIterate_2 = new StringBuilder();
				log4jParamters_tFlowToIterate_2.append("Parameters:");
				log4jParamters_tFlowToIterate_2.append("DEFAULT_MAP" + " = "
						+ "true");
				log4jParamters_tFlowToIterate_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFlowToIterate_2 - "
							+ log4jParamters_tFlowToIterate_2);

				int nb_line_tFlowToIterate_2 = 0;
				int counter_tFlowToIterate_2 = 0;

				/**
				 * [tFlowToIterate_2 begin ] stop
				 */

				/**
				 * [tOracleInput_3 begin ] start
				 */

				ok_Hash.put("tOracleInput_3", false);
				start_Hash.put("tOracleInput_3", System.currentTimeMillis());

				currentComponent = "tOracleInput_3";

				int tos_count_tOracleInput_3 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_3 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_3 = new StringBuilder();
				log4jParamters_tOracleInput_3.append("Parameters:");
				log4jParamters_tOracleInput_3.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("TABLE" + " = "
						+ "\"metadata\"");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3
						.append("QUERY"
								+ " = "
								+ "\"  SELECT  REPLACE(EMAIL_TO,':',';'),REPLACE(EMAIL_CC,':',';'),EMAIL_FROM,ERROR_MESSAGE  FROM QA_EMAIL  WHERE RULE_ID = \"+context.ruleID");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("EMAIL_TO") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EMAIL_CC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("EMAIL_FROM")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ERROR_MESSAGE") + "}]");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_3.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_3 - "
							+ log4jParamters_tOracleInput_3);

				int nb_line_tOracleInput_3 = 0;
				java.sql.Connection conn_tOracleInput_3 = null;
				String driverClass_tOracleInput_3 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_3);

				String url_tOracleInput_3 = null;
				url_tOracleInput_3 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_3 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_3 = context.dbPasswordPI;

				String dbPwd_tOracleInput_3 = decryptedPassword_tOracleInput_3;

				log.debug("tOracleInput_3 - Driver ClassName: "
						+ driverClass_tOracleInput_3 + ".");

				log.info("tOracleInput_3 - Connection attempt to '"
						+ url_tOracleInput_3 + "' with the username '"
						+ dbUser_tOracleInput_3 + "'.");

				conn_tOracleInput_3 = java.sql.DriverManager.getConnection(
						url_tOracleInput_3, dbUser_tOracleInput_3,
						dbPwd_tOracleInput_3);
				log.info("tOracleInput_3 - Connection to '"
						+ url_tOracleInput_3 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_3 = conn_tOracleInput_3
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_3 = stmtGetTZ_tOracleInput_3
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_3 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_3.next()) {
					sessionTimezone_tOracleInput_3 = rsGetTZ_tOracleInput_3
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_3)
						.setSessionTimeZone(sessionTimezone_tOracleInput_3);

				java.sql.Statement stmt_tOracleInput_3 = conn_tOracleInput_3
						.createStatement();

				String dbquery_tOracleInput_3 = "\nSELECT  REPLACE(EMAIL_TO,':',';'),REPLACE(EMAIL_CC,':',';'),EMAIL_FROM,ERROR_MESSAGE\nFROM QA_EMAIL\nWHERE RULE_ID = "
						+ context.ruleID;

				log.info("tOracleInput_3 - Executing the query: '"
						+ dbquery_tOracleInput_3 + "'.");

				globalMap.put("tOracleInput_3_QUERY", dbquery_tOracleInput_3);

				java.sql.ResultSet rs_tOracleInput_3 = null;
				try {
					rs_tOracleInput_3 = stmt_tOracleInput_3
							.executeQuery(dbquery_tOracleInput_3);
					java.sql.ResultSetMetaData rsmd_tOracleInput_3 = rs_tOracleInput_3
							.getMetaData();
					int colQtyInRs_tOracleInput_3 = rsmd_tOracleInput_3
							.getColumnCount();

					String tmpContent_tOracleInput_3 = null;

					log.info("tOracleInput_3 - Retrieving records from the database.");

					while (rs_tOracleInput_3.next()) {
						nb_line_tOracleInput_3++;

						if (colQtyInRs_tOracleInput_3 < 1) {
							row4.EMAIL_TO = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(1);
							if (tmpContent_tOracleInput_3 != null) {
								row4.EMAIL_TO = tmpContent_tOracleInput_3;
							} else {
								row4.EMAIL_TO = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 2) {
							row4.EMAIL_CC = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(2);
							if (tmpContent_tOracleInput_3 != null) {
								row4.EMAIL_CC = tmpContent_tOracleInput_3;
							} else {
								row4.EMAIL_CC = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 3) {
							row4.EMAIL_FROM = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(3);
							if (tmpContent_tOracleInput_3 != null) {
								row4.EMAIL_FROM = tmpContent_tOracleInput_3;
							} else {
								row4.EMAIL_FROM = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 4) {
							row4.ERROR_MESSAGE = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(4);
							if (tmpContent_tOracleInput_3 != null) {
								row4.ERROR_MESSAGE = tmpContent_tOracleInput_3;
							} else {
								row4.ERROR_MESSAGE = null;
							}
						}

						log.debug("tOracleInput_3 - Retrieving the record "
								+ nb_line_tOracleInput_3 + ".");

						/**
						 * [tOracleInput_3 begin ] stop
						 */

						/**
						 * [tOracleInput_3 main ] start
						 */

						currentComponent = "tOracleInput_3";

						tos_count_tOracleInput_3++;

						/**
						 * [tOracleInput_3 main ] stop
						 */

						/**
						 * [tFlowToIterate_2 main ] start
						 */

						currentComponent = "tFlowToIterate_2";

						if (log.isTraceEnabled()) {
							log.trace("row4 - "
									+ (row4 == null ? "" : row4.toLogString()));
						}

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_2 - "
									+ "Set global var, key=row4.EMAIL_TO, value="
									+ row4.EMAIL_TO + ".");
						globalMap.put("row4.EMAIL_TO", row4.EMAIL_TO);
						nb_line_tFlowToIterate_2++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_2 - "
									+ "Set global var, key=row4.EMAIL_CC, value="
									+ row4.EMAIL_CC + ".");
						globalMap.put("row4.EMAIL_CC", row4.EMAIL_CC);
						nb_line_tFlowToIterate_2++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_2 - "
									+ "Set global var, key=row4.EMAIL_FROM, value="
									+ row4.EMAIL_FROM + ".");
						globalMap.put("row4.EMAIL_FROM", row4.EMAIL_FROM);
						nb_line_tFlowToIterate_2++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_2 - "
									+ "Set global var, key=row4.ERROR_MESSAGE, value="
									+ row4.ERROR_MESSAGE + ".");
						globalMap.put("row4.ERROR_MESSAGE", row4.ERROR_MESSAGE);
						nb_line_tFlowToIterate_2++;

						counter_tFlowToIterate_2++;
						if (log.isDebugEnabled())
							log.debug("tFlowToIterate_2 - "
									+ "Current iteration is: "
									+ counter_tFlowToIterate_2 + ".");
						globalMap.put("tFlowToIterate_2_CURRENT_ITERATION",
								counter_tFlowToIterate_2);

						tos_count_tFlowToIterate_2++;

						/**
						 * [tFlowToIterate_2 main ] stop
						 */
						NB_ITERATE_tSendMail_1++;

						/**
						 * [tSendMail_1 begin ] start
						 */

						ok_Hash.put("tSendMail_1", false);
						start_Hash.put("tSendMail_1",
								System.currentTimeMillis());

						currentComponent = "tSendMail_1";

						int tos_count_tSendMail_1 = 0;

						if (log.isInfoEnabled())
							log.info("tSendMail_1 - " + "Start to work.");
						StringBuilder log4jParamters_tSendMail_1 = new StringBuilder();
						log4jParamters_tSendMail_1.append("Parameters:");
						log4jParamters_tSendMail_1.append("TO" + " = "
								+ "((String)globalMap.get(\"row4.EMAIL_TO\"))");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1
								.append("FROM"
										+ " = "
										+ "((String)globalMap.get(\"row4.EMAIL_FROM\"))");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("NEED_PERSONAL_NAME"
								+ " = " + "false");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("CC" + " = "
								+ "((String)globalMap.get(\"row4.EMAIL_CC\"))");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("BCC" + " = "
								+ "\"\"");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1
								.append("SUBJECT"
										+ " = "
										+ "\"ALERT \"+context.ruleDesc+\"_\"+context.ruleID+\" ERRORS\"");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1
								.append("MESSAGE"
										+ " = "
										+ "\"<html> <body>  <img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>   <br>  <br>  \"+((String)globalMap.get(\"row4.ERROR_MESSAGE\"))+\"   <br>  <br>  <br>  </body>  </html>\"");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("CHECK_ATTACHMENT"
								+ " = " + "true");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1
								.append("ATTACHMENTS"
										+ " = "
										+ "[{CONTENT_TRANSFER_ENCODING="
										+ ("DEFAULT")
										+ ", FILE="
										+ ("context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Quality_Assurance/\"+context.ruleDesc+\"_\"+context.ruleID+\"/\"+context.reportMonth+\"/Rule_\"+context.ruleID+\"_QAReportResults.csv\"")
										+ "}]");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("HEADERS" + " = "
								+ "[]");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("SMTP_HOST" + " = "
								+ "\"smtp.dc.polk.com\"");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("SMTP_PORT" + " = "
								+ "25");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("SSL" + " = "
								+ "false");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("STARTTLS" + " = "
								+ "false");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("IMPORTANCE" + " = "
								+ "Normal");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("NEED_AUTH" + " = "
								+ "false");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("DIE_ON_ERROR"
								+ " = " + "true");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("TEXT_SUBTYPE"
								+ " = " + "html");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("ENCODING" + " = "
								+ "\"ISO-8859-15\"");
						log4jParamters_tSendMail_1.append(" | ");
						log4jParamters_tSendMail_1.append("SET_LOCALHOST"
								+ " = " + "false");
						log4jParamters_tSendMail_1.append(" | ");
						if (log.isDebugEnabled())
							log.debug("tSendMail_1 - "
									+ log4jParamters_tSendMail_1);

						/**
						 * [tSendMail_1 begin ] stop
						 */

						/**
						 * [tSendMail_1 main ] start
						 */

						currentComponent = "tSendMail_1";

						String smtpHost_tSendMail_1 = "smtp.dc.polk.com";
						String smtpPort_tSendMail_1 = "25";
						String from_tSendMail_1 = (((String) globalMap
								.get("row4.EMAIL_FROM")));
						String to_tSendMail_1 = (((String) globalMap
								.get("row4.EMAIL_TO"))).replace(";", ",");
						String cc_tSendMail_1 = ((((String) globalMap
								.get("row4.EMAIL_CC"))) == null || ""
								.equals(((String) globalMap
										.get("row4.EMAIL_CC")))) ? null
								: (((String) globalMap.get("row4.EMAIL_CC")))
										.replace(";", ",");
						String bcc_tSendMail_1 = (("") == null || "".equals("")) ? null
								: ("").replace(";", ",");
						String subject_tSendMail_1 = ("ALERT "
								+ context.ruleDesc + "_" + context.ruleID + " ERRORS");

						java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String, String>>();
						java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
						java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();
						attachments_tSendMail_1.add(context.shipping + "/"
								+ context.reportYear + context.mDrive
								+ "/Quality_Assurance/" + context.ruleDesc
								+ "_" + context.ruleID + "/"
								+ context.reportMonth + "/Rule_"
								+ context.ruleID + "_QAReportResults.csv");
						contentTransferEncoding_tSendMail_1.add("DEFAULT");

						String message_tSendMail_1 = (("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\n"
								+ ((String) globalMap.get("row4.ERROR_MESSAGE")) + "\n <br>\n<br>\n<br>\n</body>\n</html>") == null || ""
								.equals("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\n"
										+ ((String) globalMap
												.get("row4.ERROR_MESSAGE"))
										+ "\n <br>\n<br>\n<br>\n</body>\n</html>")) ? "\"\""
								: ("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\n"
										+ ((String) globalMap
												.get("row4.ERROR_MESSAGE")) + "\n <br>\n<br>\n<br>\n</body>\n</html>");
						java.util.Properties props_tSendMail_1 = System
								.getProperties();
						props_tSendMail_1.put("mail.smtp.host",
								smtpHost_tSendMail_1);
						props_tSendMail_1.put("mail.smtp.port",
								smtpPort_tSendMail_1);
						props_tSendMail_1.put("mail.mime.encodefilename",
								"true");
						try {

							log.info("tSendMail_1 - Connection attempt to '"
									+ smtpHost_tSendMail_1 + "'.");

							props_tSendMail_1.put("mail.smtp.auth", "false");
							javax.mail.Session session_tSendMail_1 = javax.mail.Session
									.getInstance(props_tSendMail_1, null);

							log.info("tSendMail_1 - Connection to '"
									+ smtpHost_tSendMail_1 + "' has succeeded.");

							javax.mail.Message msg_tSendMail_1 = new javax.mail.internet.MimeMessage(
									session_tSendMail_1);
							msg_tSendMail_1
									.setFrom(new javax.mail.internet.InternetAddress(
											from_tSendMail_1, null));
							msg_tSendMail_1.setRecipients(
									javax.mail.Message.RecipientType.TO,
									javax.mail.internet.InternetAddress.parse(
											to_tSendMail_1, false));
							if (cc_tSendMail_1 != null)
								msg_tSendMail_1.setRecipients(
										javax.mail.Message.RecipientType.CC,
										javax.mail.internet.InternetAddress
												.parse(cc_tSendMail_1, false));
							if (bcc_tSendMail_1 != null)
								msg_tSendMail_1.setRecipients(
										javax.mail.Message.RecipientType.BCC,
										javax.mail.internet.InternetAddress
												.parse(bcc_tSendMail_1, false));
							msg_tSendMail_1.setSubject(subject_tSendMail_1);

							for (int i_tSendMail_1 = 0; i_tSendMail_1 < headers_tSendMail_1
									.size(); i_tSendMail_1++) {
								java.util.Map<String, String> header_tSendMail_1 = headers_tSendMail_1
										.get(i_tSendMail_1);
								msg_tSendMail_1.setHeader(
										header_tSendMail_1.get("KEY"),
										header_tSendMail_1.get("VALUE"));
							}
							msg_tSendMail_1.setSentDate(new Date());
							msg_tSendMail_1.setHeader("X-Priority", "3"); // High->1
																			// Normal->3
																			// Low->5
							javax.mail.Multipart mp_tSendMail_1 = new javax.mail.internet.MimeMultipart();
							javax.mail.internet.MimeBodyPart mbpText_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
							mbpText_tSendMail_1.setText(message_tSendMail_1,
									"ISO-8859-15", "html");
							mp_tSendMail_1.addBodyPart(mbpText_tSendMail_1);

							javax.mail.internet.MimeBodyPart mbpFile_tSendMail_1 = null;

							for (int i_tSendMail_1 = 0; i_tSendMail_1 < attachments_tSendMail_1
									.size(); i_tSendMail_1++) {
								String filename_tSendMail_1 = attachments_tSendMail_1
										.get(i_tSendMail_1);
								javax.activation.FileDataSource fds_tSendMail_1 = null;
								java.io.File file_tSendMail_1 = new java.io.File(
										filename_tSendMail_1);

								if (file_tSendMail_1.isDirectory()) {
									java.io.File[] subFiles_tSendMail_1 = file_tSendMail_1
											.listFiles();
									for (java.io.File subFile_tSendMail_1 : subFiles_tSendMail_1) {
										if (subFile_tSendMail_1.isFile()) {
											fds_tSendMail_1 = new javax.activation.FileDataSource(
													subFile_tSendMail_1
															.getAbsolutePath());
											mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
											mbpFile_tSendMail_1
													.setDataHandler(new javax.activation.DataHandler(
															fds_tSendMail_1));
											mbpFile_tSendMail_1
													.setFileName(javax.mail.internet.MimeUtility
															.encodeText(fds_tSendMail_1
																	.getName()));
											if (contentTransferEncoding_tSendMail_1
													.get(i_tSendMail_1)
													.equalsIgnoreCase("base64")) {
												mbpFile_tSendMail_1
														.setHeader(
																"Content-Transfer-Encoding",
																"base64");
											}
											mp_tSendMail_1
													.addBodyPart(mbpFile_tSendMail_1);
										}
									}
								} else {
									mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
									fds_tSendMail_1 = new javax.activation.FileDataSource(
											filename_tSendMail_1);
									mbpFile_tSendMail_1
											.setDataHandler(new javax.activation.DataHandler(
													fds_tSendMail_1));
									mbpFile_tSendMail_1
											.setFileName(javax.mail.internet.MimeUtility
													.encodeText(fds_tSendMail_1
															.getName()));
									if (contentTransferEncoding_tSendMail_1
											.get(i_tSendMail_1)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_1.setHeader(
												"Content-Transfer-Encoding",
												"base64");
									}
									mp_tSendMail_1
											.addBodyPart(mbpFile_tSendMail_1);
								}
							}
							// -- set the content --
							msg_tSendMail_1.setContent(mp_tSendMail_1);
							// add handlers for main MIME types
							javax.activation.MailcapCommandMap mc_tSendMail_1 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
									.getDefaultCommandMap();
							mc_tSendMail_1
									.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
							mc_tSendMail_1
									.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
							mc_tSendMail_1
									.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
							mc_tSendMail_1
									.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
							mc_tSendMail_1
									.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
							javax.activation.CommandMap
									.setDefaultCommandMap(mc_tSendMail_1);
							// -- Send the message --
							javax.mail.Transport.send(msg_tSendMail_1);
						} catch (java.lang.Exception e) {

							throw (e);

						} finally {
							props_tSendMail_1.remove("mail.smtp.host");
							props_tSendMail_1.remove("mail.smtp.port");

							props_tSendMail_1
									.remove("mail.mime.encodefilename");

							props_tSendMail_1.remove("mail.smtp.auth");
						}

						tos_count_tSendMail_1++;

						/**
						 * [tSendMail_1 main ] stop
						 */

						/**
						 * [tSendMail_1 end ] start
						 */

						currentComponent = "tSendMail_1";

						if (log.isInfoEnabled())
							log.info("tSendMail_1 - " + "Done.");

						ok_Hash.put("tSendMail_1", true);
						end_Hash.put("tSendMail_1", System.currentTimeMillis());

						tOracleRow_4Process(globalMap);

						/**
						 * [tSendMail_1 end ] stop
						 */

						/**
						 * [tOracleInput_3 end ] start
						 */

						currentComponent = "tOracleInput_3";

					}
				} finally {
					stmt_tOracleInput_3.close();

					if (conn_tOracleInput_3 != null
							&& !conn_tOracleInput_3.isClosed()) {

						log.info("tOracleInput_3 - Closing the connection to the database.");

						conn_tOracleInput_3.close();

						log.info("tOracleInput_3 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_3_NB_LINE", nb_line_tOracleInput_3);
				log.info("tOracleInput_3 - Retrieved records count: "
						+ nb_line_tOracleInput_3 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_3 - " + "Done.");

				ok_Hash.put("tOracleInput_3", true);
				end_Hash.put("tOracleInput_3", System.currentTimeMillis());

				/**
				 * [tOracleInput_3 end ] stop
				 */

				/**
				 * [tFlowToIterate_2 end ] start
				 */

				currentComponent = "tFlowToIterate_2";

				globalMap.put("tFlowToIterate_2_NB_LINE",
						nb_line_tFlowToIterate_2);

				if (log.isInfoEnabled())
					log.info("tFlowToIterate_2 - " + "Done.");

				ok_Hash.put("tFlowToIterate_2", true);
				end_Hash.put("tFlowToIterate_2", System.currentTimeMillis());

				/**
				 * [tFlowToIterate_2 end ] stop
				 */

			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			try {

				/**
				 * [tOracleInput_3 finally ] start
				 */

				currentComponent = "tOracleInput_3";

				/**
				 * [tOracleInput_3 finally ] stop
				 */

				/**
				 * [tFlowToIterate_2 finally ] start
				 */

				currentComponent = "tFlowToIterate_2";

				/**
				 * [tFlowToIterate_2 finally ] stop
				 */

				/**
				 * [tSendMail_1 finally ] start
				 */

				currentComponent = "tSendMail_1";

				/**
				 * [tSendMail_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_3_SUBPROCESS_STATE", 1);
	}

	public void tOracleRow_4Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleRow_4_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {

			String currentMethodName = new java.lang.Exception()
					.getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				/**
				 * [tOracleRow_4 begin ] start
				 */

				ok_Hash.put("tOracleRow_4", false);
				start_Hash.put("tOracleRow_4", System.currentTimeMillis());

				currentComponent = "tOracleRow_4";

				int tos_count_tOracleRow_4 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleRow_4 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleRow_4 = new StringBuilder();
				log4jParamters_tOracleRow_4.append("Parameters:");
				log4jParamters_tOracleRow_4.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("DB_VERSION" + " = "
						+ "ORACLE_12");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("PORT" + " = " + "\"1521\"");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4
						.append("QUERY"
								+ " = "
								+ "\"  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = \"+context.ruleID+\";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'E'  WHERE RULE_ID = \"+context.ruleID+\"  AND EXEC_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'NOTOK'  WHERE RULE_ID = \"+context.ruleID+\"  AND START_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  \"");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("USE_NB_LINE" + " = "
						+ "NONE");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("DIE_ON_ERROR" + " = "
						+ "false");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("PROPAGATE_RECORD_SET"
						+ " = " + "false");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("USE_PREPAREDSTATEMENT"
						+ " = " + "false");
				log4jParamters_tOracleRow_4.append(" | ");
				log4jParamters_tOracleRow_4.append("COMMIT_EVERY" + " = "
						+ "10000");
				log4jParamters_tOracleRow_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleRow_4 - " + log4jParamters_tOracleRow_4);

				java.sql.Connection conn_tOracleRow_4 = null;
				String query_tOracleRow_4 = "";
				boolean whetherReject_tOracleRow_4 = false;
				String driverClass_tOracleRow_4 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleRow_4);

				String url_tOracleRow_4 = null;
				url_tOracleRow_4 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";
				log.debug("tOracleRow_4 - Driver ClassName: "
						+ driverClass_tOracleRow_4 + ".");

				String dbUser_tOracleRow_4 = context.dbUserPI;

				final String decryptedPassword_tOracleRow_4 = context.dbPasswordPI;

				String dbPwd_tOracleRow_4 = decryptedPassword_tOracleRow_4;

				log.info("tOracleRow_4 - Connection attempt to '"
						+ url_tOracleRow_4 + "' with the username '"
						+ dbUser_tOracleRow_4 + "'.");

				conn_tOracleRow_4 = java.sql.DriverManager.getConnection(
						url_tOracleRow_4, dbUser_tOracleRow_4,
						dbPwd_tOracleRow_4);

				log.info("tOracleRow_4 - Connection to '" + url_tOracleRow_4
						+ "' has succeeded.");

				if (conn_tOracleRow_4.getAutoCommit()) {

					log.debug("tOracleRow_4 - Connection is set auto commit to 'false'.");

					conn_tOracleRow_4.setAutoCommit(false);

				}
				int commitEvery_tOracleRow_4 = 10000;
				int commitCounter_tOracleRow_4 = 0;

				java.sql.Statement stmt_tOracleRow_4 = conn_tOracleRow_4
						.createStatement();

				/**
				 * [tOracleRow_4 begin ] stop
				 */

				/**
				 * [tOracleRow_4 main ] start
				 */

				currentComponent = "tOracleRow_4";

				log.info("tOracleRow_4 - Executing the query: '"
						+ "  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = "
						+ context.ruleID
						+ ";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'E'  WHERE RULE_ID = "
						+ context.ruleID
						+ "  AND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'NOTOK'  WHERE RULE_ID = "
						+ context.ruleID + "  AND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  "
						+ "'.");

				query_tOracleRow_4 = "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
						+ context.ruleID
						+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'E'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'NOTOK'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n";
				whetherReject_tOracleRow_4 = false;
				globalMap.put("tOracleRow_4_QUERY", query_tOracleRow_4);
				try {
					stmt_tOracleRow_4.execute(query_tOracleRow_4);

					log.info("tOracleRow_4 - Execute the query: '"
							+ "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
							+ context.ruleID
							+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'E'\nWHERE RULE_ID = "
							+ context.ruleID
							+ "\nAND EXEC_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'NOTOK'\nWHERE RULE_ID = "
							+ context.ruleID + "\nAND START_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n"
							+ "' has finished.");

				} catch (java.lang.Exception e) {
					whetherReject_tOracleRow_4 = true;

					log.error("tOracleRow_4 - " + e.getMessage());

					System.err.print(e.getMessage());

				}

				commitCounter_tOracleRow_4++;
				if (commitEvery_tOracleRow_4 <= commitCounter_tOracleRow_4) {

					log.debug("tOracleRow_4 - Connection starting to commit.");

					conn_tOracleRow_4.commit();

					log.debug("tOracleRow_4 - Connection commit has succeeded.");

					commitCounter_tOracleRow_4 = 0;
				}

				tos_count_tOracleRow_4++;

				/**
				 * [tOracleRow_4 main ] stop
				 */

				/**
				 * [tOracleRow_4 end ] start
				 */

				currentComponent = "tOracleRow_4";

				stmt_tOracleRow_4.close();
				if (commitEvery_tOracleRow_4 > commitCounter_tOracleRow_4) {

					log.debug("tOracleRow_4 - Connection starting to commit.");

					conn_tOracleRow_4.commit();

					log.debug("tOracleRow_4 - Connection commit has succeeded.");

					commitCounter_tOracleRow_4 = 0;

				}
				log.info("tOracleRow_4 - Closing the connection to the database.");

				conn_tOracleRow_4.close();

				log.info("tOracleRow_4 - Connection to the database closed.");

				if (log.isInfoEnabled())
					log.info("tOracleRow_4 - " + "Done.");

				ok_Hash.put("tOracleRow_4", true);
				end_Hash.put("tOracleRow_4", System.currentTimeMillis());

				/**
				 * [tOracleRow_4 end ] stop
				 */
			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			try {

				/**
				 * [tOracleRow_4 finally ] start
				 */

				currentComponent = "tOracleRow_4";

				/**
				 * [tOracleRow_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleRow_4_SUBPROCESS_STATE", 1);
	}

	public void tOracleRow_6Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleRow_6_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {

			String currentMethodName = new java.lang.Exception()
					.getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if (resumeEntryMethodName == null || resumeIt || globalResumeTicket) {// start
																					// the
																					// resume
				globalResumeTicket = true;

				/**
				 * [tOracleRow_6 begin ] start
				 */

				ok_Hash.put("tOracleRow_6", false);
				start_Hash.put("tOracleRow_6", System.currentTimeMillis());

				currentComponent = "tOracleRow_6";

				int tos_count_tOracleRow_6 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleRow_6 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleRow_6 = new StringBuilder();
				log4jParamters_tOracleRow_6.append("Parameters:");
				log4jParamters_tOracleRow_6.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("DB_VERSION" + " = "
						+ "ORACLE_12");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("PORT" + " = " + "\"1521\"");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6
						.append("QUERY"
								+ " = "
								+ "\"  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = \"+context.ruleID+\";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'Y'  WHERE RULE_ID = \"+context.ruleID+\"  AND EXEC_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'OK'  WHERE RULE_ID = \"+context.ruleID+\"  AND START_TIME = TO_DATE('\"+context.execTime+\"','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  \"");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("USE_NB_LINE" + " = "
						+ "NONE");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("DIE_ON_ERROR" + " = "
						+ "false");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("PROPAGATE_RECORD_SET"
						+ " = " + "false");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("USE_PREPAREDSTATEMENT"
						+ " = " + "false");
				log4jParamters_tOracleRow_6.append(" | ");
				log4jParamters_tOracleRow_6.append("COMMIT_EVERY" + " = "
						+ "10000");
				log4jParamters_tOracleRow_6.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleRow_6 - " + log4jParamters_tOracleRow_6);

				java.sql.Connection conn_tOracleRow_6 = null;
				String query_tOracleRow_6 = "";
				boolean whetherReject_tOracleRow_6 = false;
				String driverClass_tOracleRow_6 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleRow_6);

				String url_tOracleRow_6 = null;
				url_tOracleRow_6 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";
				log.debug("tOracleRow_6 - Driver ClassName: "
						+ driverClass_tOracleRow_6 + ".");

				String dbUser_tOracleRow_6 = context.dbUserPI;

				final String decryptedPassword_tOracleRow_6 = context.dbPasswordPI;

				String dbPwd_tOracleRow_6 = decryptedPassword_tOracleRow_6;

				log.info("tOracleRow_6 - Connection attempt to '"
						+ url_tOracleRow_6 + "' with the username '"
						+ dbUser_tOracleRow_6 + "'.");

				conn_tOracleRow_6 = java.sql.DriverManager.getConnection(
						url_tOracleRow_6, dbUser_tOracleRow_6,
						dbPwd_tOracleRow_6);

				log.info("tOracleRow_6 - Connection to '" + url_tOracleRow_6
						+ "' has succeeded.");

				if (conn_tOracleRow_6.getAutoCommit()) {

					log.debug("tOracleRow_6 - Connection is set auto commit to 'false'.");

					conn_tOracleRow_6.setAutoCommit(false);

				}
				int commitEvery_tOracleRow_6 = 10000;
				int commitCounter_tOracleRow_6 = 0;

				java.sql.Statement stmt_tOracleRow_6 = conn_tOracleRow_6
						.createStatement();

				/**
				 * [tOracleRow_6 begin ] stop
				 */

				/**
				 * [tOracleRow_6 main ] start
				 */

				currentComponent = "tOracleRow_6";

				log.info("tOracleRow_6 - Executing the query: '"
						+ "  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = "
						+ context.ruleID
						+ ";  COMMIT;  UPDATE QA_EXEC_SCHEDULE  SET DELIVERED = 'Y'  WHERE RULE_ID = "
						+ context.ruleID
						+ "  AND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  UPDATE QA_LOG  SET STATUS = 'OK'  WHERE RULE_ID = "
						+ context.ruleID + "  AND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');  COMMIT;  END;  "
						+ "'.");

				query_tOracleRow_6 = "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
						+ context.ruleID
						+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'Y'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND EXEC_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'OK'\nWHERE RULE_ID = "
						+ context.ruleID
						+ "\nAND START_TIME = TO_DATE('"
						+ context.execTime
						+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n";
				whetherReject_tOracleRow_6 = false;
				globalMap.put("tOracleRow_6_QUERY", query_tOracleRow_6);
				try {
					stmt_tOracleRow_6.execute(query_tOracleRow_6);

					log.info("tOracleRow_6 - Execute the query: '"
							+ "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
							+ context.ruleID
							+ ";\nCOMMIT;\nUPDATE QA_EXEC_SCHEDULE\nSET DELIVERED = 'Y'\nWHERE RULE_ID = "
							+ context.ruleID
							+ "\nAND EXEC_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nUPDATE QA_LOG\nSET STATUS = 'OK'\nWHERE RULE_ID = "
							+ context.ruleID + "\nAND START_TIME = TO_DATE('"
							+ context.execTime
							+ "','MM/DD/YYYY HH:MI:SS AM');\nCOMMIT;\nEND;\n"
							+ "' has finished.");

				} catch (java.lang.Exception e) {
					whetherReject_tOracleRow_6 = true;

					log.error("tOracleRow_6 - " + e.getMessage());

					System.err.print(e.getMessage());

				}

				commitCounter_tOracleRow_6++;
				if (commitEvery_tOracleRow_6 <= commitCounter_tOracleRow_6) {

					log.debug("tOracleRow_6 - Connection starting to commit.");

					conn_tOracleRow_6.commit();

					log.debug("tOracleRow_6 - Connection commit has succeeded.");

					commitCounter_tOracleRow_6 = 0;
				}

				tos_count_tOracleRow_6++;

				/**
				 * [tOracleRow_6 main ] stop
				 */

				/**
				 * [tOracleRow_6 end ] start
				 */

				currentComponent = "tOracleRow_6";

				stmt_tOracleRow_6.close();
				if (commitEvery_tOracleRow_6 > commitCounter_tOracleRow_6) {

					log.debug("tOracleRow_6 - Connection starting to commit.");

					conn_tOracleRow_6.commit();

					log.debug("tOracleRow_6 - Connection commit has succeeded.");

					commitCounter_tOracleRow_6 = 0;

				}
				log.info("tOracleRow_6 - Closing the connection to the database.");

				conn_tOracleRow_6.close();

				log.info("tOracleRow_6 - Connection to the database closed.");

				if (log.isInfoEnabled())
					log.info("tOracleRow_6 - " + "Done.");

				ok_Hash.put("tOracleRow_6", true);
				end_Hash.put("tOracleRow_6", System.currentTimeMillis());

				/**
				 * [tOracleRow_6 end ] stop
				 */
			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			try {

				/**
				 * [tOracleRow_6 finally ] start
				 */

				currentComponent = "tOracleRow_6";

				/**
				 * [tOracleRow_6 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleRow_6_SUBPROCESS_STATE", 1);
	}

	public String resuming_logs_dir_path = null;
	public String resuming_checkpoint_path = null;
	public String parent_part_launcher = null;
	private String resumeEntryMethodName = null;
	private boolean globalResumeTicket = false;

	public boolean watch = false;
	// portStats is null, it means don't execute the statistics
	public Integer portStats = null;
	public int portTraces = 4334;
	public String clientHost;
	public String defaultClientHost = "localhost";
	public String contextStr = "Prod";
	public boolean isDefaultContext = true;
	public String pid = "0";
	public String rootPid = null;
	public String fatherPid = null;
	public String fatherNode = null;
	public long startTime = 0;
	public boolean isChildJob = false;
	public String log4jLevel = "";

	private boolean execStat = true;

	private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
		protected java.util.Map<String, String> initialValue() {
			java.util.Map<String, String> threadRunResultMap = new java.util.HashMap<String, String>();
			threadRunResultMap.put("errorCode", null);
			threadRunResultMap.put("status", "");
			return threadRunResultMap;
		};
	};

	private SyncInt runningThreadCount = new SyncInt();

	private class SyncInt {
		private int count = 0;

		public synchronized void add(int i) {
			count += i;
		}

		public synchronized int getCount() {
			return count;
		}
	}

	private java.util.Properties context_param = new java.util.Properties();
	public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

	public String status = "";

	public static void main(String[] args) {
		final QA_Framework_Process_Email QA_Framework_Process_EmailClass = new QA_Framework_Process_Email();

		int exitCode = QA_Framework_Process_EmailClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'QA_Framework_Process_Email' - Done.");
		}

		System.exit(exitCode);
	}

	public String[][] runJob(String[] args) {

		int exitCode = runJobInTOS(args);
		String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

		return bufferValue;
	}

	public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;

		return hastBufferOutput;
	}

	public int runJobInTOS(String[] args) {
		// reset status
		status = "";

		String lastStr = "";
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--context_param")) {
				lastStr = arg;
			} else if (lastStr.equals("")) {
				evalParam(arg);
			} else {
				evalParam(lastStr + " " + arg);
				lastStr = "";
			}
		}

		if (!"".equals(log4jLevel)) {
			if ("trace".equalsIgnoreCase(log4jLevel)) {
				log.setLevel(org.apache.log4j.Level.TRACE);
			} else if ("debug".equalsIgnoreCase(log4jLevel)) {
				log.setLevel(org.apache.log4j.Level.DEBUG);
			} else if ("info".equalsIgnoreCase(log4jLevel)) {
				log.setLevel(org.apache.log4j.Level.INFO);
			} else if ("warn".equalsIgnoreCase(log4jLevel)) {
				log.setLevel(org.apache.log4j.Level.WARN);
			} else if ("error".equalsIgnoreCase(log4jLevel)) {
				log.setLevel(org.apache.log4j.Level.ERROR);
			} else if ("fatal".equalsIgnoreCase(log4jLevel)) {
				log.setLevel(org.apache.log4j.Level.FATAL);
			} else if ("off".equalsIgnoreCase(log4jLevel)) {
				log.setLevel(org.apache.log4j.Level.OFF);
			}
			org.apache.log4j.Logger.getRootLogger().setLevel(log.getLevel());
		}
		log.info("TalendJob: 'QA_Framework_Process_Email' - Start.");

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		if (pid == null || "0".equals(pid)) {
			pid = TalendString.getAsciiRandomString(6);
		}

		if (rootPid == null) {
			rootPid = pid;
		}
		if (fatherPid == null) {
			fatherPid = pid;
		} else {
			isChildJob = true;
		}

		try {
			// call job/subjob with an existing context, like:
			// --context=production. if without this parameter, there will use
			// the default context instead.
			java.io.InputStream inContext = QA_Framework_Process_Email.class
					.getClassLoader().getResourceAsStream(
							"ap_unix/qa_framework_process_email_0_1/contexts/"
									+ contextStr + ".properties");
			if (isDefaultContext && inContext == null) {

			} else {
				if (inContext != null) {
					// defaultProps is in order to keep the original context
					// value
					defaultProps.load(inContext);
					inContext.close();
					context = new ContextProperties(defaultProps);
				} else {
					// print info and job continue to run, for case:
					// context_param is not empty.
					System.err.println("Could not find the context "
							+ contextStr);
				}
			}

			if (!context_param.isEmpty()) {
				context.putAll(context_param);
			}
			context.reportMonth = (String) context.getProperty("reportMonth");
			context.jobNumber = (String) context.getProperty("jobNumber");
			context.mDrive = (String) context.getProperty("mDrive");
			context.shipping = (String) context.getProperty("shipping");
			context.reportYear = (String) context.getProperty("reportYear");
			context.salesName = (String) context.getProperty("salesName");
			context.salesSignature = (String) context
					.getProperty("salesSignature");
			context.salesEmail = (String) context.getProperty("salesEmail");
			context.client = (String) context.getProperty("client");
			context.jobID = (String) context.getProperty("jobID");
			context.resourceInt = (String) context.getProperty("resourceInt");
			context.emailTo = (String) context.getProperty("emailTo");
			context.emailCC = (String) context.getProperty("emailCC");
			context.dbVersion = (String) context.getProperty("dbVersion");
			context.localDirectory = (String) context
					.getProperty("localDirectory");
			context.dbUser = (String) context.getProperty("dbUser");
			context.dbPassword = (String) context.getProperty("dbPassword");
			context.startDate = (String) context.getProperty("startDate");
			context.startTime = (String) context.getProperty("startTime");
			context.lastReportMonth = (String) context
					.getProperty("lastReportMonth");
			context.expiredReportMonth = (String) context
					.getProperty("expiredReportMonth");
			context.dbHostName = (String) context.getProperty("dbHostName");
			context.dbName = (String) context.getProperty("dbName");
			context.dbSchema = (String) context.getProperty("dbSchema");
			context.ftpHost = (String) context.getProperty("ftpHost");
			context.ftpUser = (String) context.getProperty("ftpUser");
			context.ftpPassword = (String) context.getProperty("ftpPassword");
			context.ftpDirectory = (String) context.getProperty("ftpDirectory");
			context.shipIt = (String) context.getProperty("shipIt");
			context.runIt = (String) context.getProperty("runIt");
			context.prodEmail = (String) context.getProperty("prodEmail");
			context.shipEmail = (String) context.getProperty("shipEmail");
			context.salesCostCenter = (String) context
					.getProperty("salesCostCenter");
			context.emailFrom = (String) context.getProperty("emailFrom");
			context.emailBcc = (String) context.getProperty("emailBcc");
			context.smtpHost = (String) context.getProperty("smtpHost");
			context.dbUserPI = (String) context.getProperty("dbUserPI");
			context.dbPasswordPI = (String) context.getProperty("dbPasswordPI");
			context.dbHostNamePI = (String) context.getProperty("dbHostNamePI");
			context.dbNamePI = (String) context.getProperty("dbNamePI");
			context.dbSchemaPI = (String) context.getProperty("dbSchemaPI");
			context.salesTitle = (String) context.getProperty("salesTitle");
			context.salesPhone = (String) context.getProperty("salesPhone");
			context.reportMonthPI = (String) context
					.getProperty("reportMonthPI");
			context.headersql = (String) context.getProperty("headersql");
			context.testResult = (String) context.getProperty("testResult");
			context.notify = (String) context.getProperty("notify");
			context.notifySuccess = (String) context
					.getProperty("notifySuccess");
			context.notifyError = (String) context.getProperty("notifyError");
			context.ruleID = (String) context.getProperty("ruleID");
			context.execTime = (String) context.getProperty("execTime");
			context.ruleDesc = (String) context.getProperty("ruleDesc");
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
			if (parentContextMap.containsKey("reportMonth")) {
				context.reportMonth = (String) parentContextMap
						.get("reportMonth");
			}
			if (parentContextMap.containsKey("jobNumber")) {
				context.jobNumber = (String) parentContextMap.get("jobNumber");
			}
			if (parentContextMap.containsKey("mDrive")) {
				context.mDrive = (String) parentContextMap.get("mDrive");
			}
			if (parentContextMap.containsKey("shipping")) {
				context.shipping = (String) parentContextMap.get("shipping");
			}
			if (parentContextMap.containsKey("reportYear")) {
				context.reportYear = (String) parentContextMap
						.get("reportYear");
			}
			if (parentContextMap.containsKey("salesName")) {
				context.salesName = (String) parentContextMap.get("salesName");
			}
			if (parentContextMap.containsKey("salesSignature")) {
				context.salesSignature = (String) parentContextMap
						.get("salesSignature");
			}
			if (parentContextMap.containsKey("salesEmail")) {
				context.salesEmail = (String) parentContextMap
						.get("salesEmail");
			}
			if (parentContextMap.containsKey("client")) {
				context.client = (String) parentContextMap.get("client");
			}
			if (parentContextMap.containsKey("jobID")) {
				context.jobID = (String) parentContextMap.get("jobID");
			}
			if (parentContextMap.containsKey("resourceInt")) {
				context.resourceInt = (String) parentContextMap
						.get("resourceInt");
			}
			if (parentContextMap.containsKey("emailTo")) {
				context.emailTo = (String) parentContextMap.get("emailTo");
			}
			if (parentContextMap.containsKey("emailCC")) {
				context.emailCC = (String) parentContextMap.get("emailCC");
			}
			if (parentContextMap.containsKey("dbVersion")) {
				context.dbVersion = (String) parentContextMap.get("dbVersion");
			}
			if (parentContextMap.containsKey("localDirectory")) {
				context.localDirectory = (String) parentContextMap
						.get("localDirectory");
			}
			if (parentContextMap.containsKey("dbUser")) {
				context.dbUser = (String) parentContextMap.get("dbUser");
			}
			if (parentContextMap.containsKey("dbPassword")) {
				context.dbPassword = (String) parentContextMap
						.get("dbPassword");
			}
			if (parentContextMap.containsKey("startDate")) {
				context.startDate = (String) parentContextMap.get("startDate");
			}
			if (parentContextMap.containsKey("startTime")) {
				context.startTime = (String) parentContextMap.get("startTime");
			}
			if (parentContextMap.containsKey("lastReportMonth")) {
				context.lastReportMonth = (String) parentContextMap
						.get("lastReportMonth");
			}
			if (parentContextMap.containsKey("expiredReportMonth")) {
				context.expiredReportMonth = (String) parentContextMap
						.get("expiredReportMonth");
			}
			if (parentContextMap.containsKey("dbHostName")) {
				context.dbHostName = (String) parentContextMap
						.get("dbHostName");
			}
			if (parentContextMap.containsKey("dbName")) {
				context.dbName = (String) parentContextMap.get("dbName");
			}
			if (parentContextMap.containsKey("dbSchema")) {
				context.dbSchema = (String) parentContextMap.get("dbSchema");
			}
			if (parentContextMap.containsKey("ftpHost")) {
				context.ftpHost = (String) parentContextMap.get("ftpHost");
			}
			if (parentContextMap.containsKey("ftpUser")) {
				context.ftpUser = (String) parentContextMap.get("ftpUser");
			}
			if (parentContextMap.containsKey("ftpPassword")) {
				context.ftpPassword = (String) parentContextMap
						.get("ftpPassword");
			}
			if (parentContextMap.containsKey("ftpDirectory")) {
				context.ftpDirectory = (String) parentContextMap
						.get("ftpDirectory");
			}
			if (parentContextMap.containsKey("shipIt")) {
				context.shipIt = (String) parentContextMap.get("shipIt");
			}
			if (parentContextMap.containsKey("runIt")) {
				context.runIt = (String) parentContextMap.get("runIt");
			}
			if (parentContextMap.containsKey("prodEmail")) {
				context.prodEmail = (String) parentContextMap.get("prodEmail");
			}
			if (parentContextMap.containsKey("shipEmail")) {
				context.shipEmail = (String) parentContextMap.get("shipEmail");
			}
			if (parentContextMap.containsKey("salesCostCenter")) {
				context.salesCostCenter = (String) parentContextMap
						.get("salesCostCenter");
			}
			if (parentContextMap.containsKey("emailFrom")) {
				context.emailFrom = (String) parentContextMap.get("emailFrom");
			}
			if (parentContextMap.containsKey("emailBcc")) {
				context.emailBcc = (String) parentContextMap.get("emailBcc");
			}
			if (parentContextMap.containsKey("smtpHost")) {
				context.smtpHost = (String) parentContextMap.get("smtpHost");
			}
			if (parentContextMap.containsKey("dbUserPI")) {
				context.dbUserPI = (String) parentContextMap.get("dbUserPI");
			}
			if (parentContextMap.containsKey("dbPasswordPI")) {
				context.dbPasswordPI = (String) parentContextMap
						.get("dbPasswordPI");
			}
			if (parentContextMap.containsKey("dbHostNamePI")) {
				context.dbHostNamePI = (String) parentContextMap
						.get("dbHostNamePI");
			}
			if (parentContextMap.containsKey("dbNamePI")) {
				context.dbNamePI = (String) parentContextMap.get("dbNamePI");
			}
			if (parentContextMap.containsKey("dbSchemaPI")) {
				context.dbSchemaPI = (String) parentContextMap
						.get("dbSchemaPI");
			}
			if (parentContextMap.containsKey("salesTitle")) {
				context.salesTitle = (String) parentContextMap
						.get("salesTitle");
			}
			if (parentContextMap.containsKey("salesPhone")) {
				context.salesPhone = (String) parentContextMap
						.get("salesPhone");
			}
			if (parentContextMap.containsKey("reportMonthPI")) {
				context.reportMonthPI = (String) parentContextMap
						.get("reportMonthPI");
			}
			if (parentContextMap.containsKey("headersql")) {
				context.headersql = (String) parentContextMap.get("headersql");
			}
			if (parentContextMap.containsKey("testResult")) {
				context.testResult = (String) parentContextMap
						.get("testResult");
			}
			if (parentContextMap.containsKey("notify")) {
				context.notify = (String) parentContextMap.get("notify");
			}
			if (parentContextMap.containsKey("notifySuccess")) {
				context.notifySuccess = (String) parentContextMap
						.get("notifySuccess");
			}
			if (parentContextMap.containsKey("notifyError")) {
				context.notifyError = (String) parentContextMap
						.get("notifyError");
			}
			if (parentContextMap.containsKey("ruleID")) {
				context.ruleID = (String) parentContextMap.get("ruleID");
			}
			if (parentContextMap.containsKey("execTime")) {
				context.execTime = (String) parentContextMap.get("execTime");
			}
			if (parentContextMap.containsKey("ruleDesc")) {
				context.ruleDesc = (String) parentContextMap.get("ruleDesc");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil
				.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName,
				jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName,
				parent_part_launcher, Thread.currentThread().getId() + "", "",
				"", "", "",
				resumeUtil.convertToJsonText(context, parametersToEncrypt));

		java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
		globalMap.put("concurrentHashMap", concurrentHashMap);

		long startUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		long endUsedMemory = 0;
		long end = 0;

		startTime = System.currentTimeMillis();

		this.globalResumeTicket = true;// to run tPreJob

		this.globalResumeTicket = false;// to run others jobs

		runningThreadCount.add(1);
		new Thread() {
			public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

				try {
					((java.util.Map) threadLocal.get()).put("errorCode", null);
					tFileInputDelimited_1Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get())
							.get("status"))) {
						((java.util.Map) threadLocal.get())
								.put("status", "end");
					}
				} catch (TalendException e_tFileInputDelimited_1) {
					globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", -1);

					e_tFileInputDelimited_1.printStackTrace();

				} catch (Error e_tFileInputDelimited_1) {
					globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", -1);

					e_tFileInputDelimited_1.printStackTrace();

				} finally {
					Integer localErrorCode = (Integer) (((java.util.Map) threadLocal
							.get()).get("errorCode"));
					String localStatus = (String) (((java.util.Map) threadLocal
							.get()).get("status"));
					if (localErrorCode != null) {
						if (errorCode == null
								|| localErrorCode.compareTo(errorCode) > 0) {
							errorCode = localErrorCode;
						}
					}
					if (!status.equals("failure")) {
						status = localStatus;
					}

					runningThreadCount.add(-1);
				}
			}
		}.start();

		while (runningThreadCount.getCount() > 0) {
			try {
				Thread.sleep(10);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		if (false) {
			System.out
					.println((endUsedMemory - startUsedMemory)
							+ " bytes memory increase when running : QA_Framework_Process_Email");
		}

		int returnCode = 0;
		if (errorCode == null) {
			returnCode = status != null && status.equals("failure") ? 1 : 0;
		} else {
			returnCode = errorCode.intValue();
		}
		resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher,
				Thread.currentThread().getId() + "", "", "" + returnCode, "",
				"", "");

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {

	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		return connections;
	}

	private void evalParam(String arg) {
		if (arg.startsWith("--resuming_logs_dir_path")) {
			resuming_logs_dir_path = arg.substring(25);
		} else if (arg.startsWith("--resuming_checkpoint_path")) {
			resuming_checkpoint_path = arg.substring(27);
		} else if (arg.startsWith("--parent_part_launcher")) {
			parent_part_launcher = arg.substring(23);
		} else if (arg.startsWith("--watch")) {
			watch = true;
		} else if (arg.startsWith("--stat_port=")) {
			String portStatsStr = arg.substring(12);
			if (portStatsStr != null && !portStatsStr.equals("null")) {
				portStats = Integer.parseInt(portStatsStr);
			}
		} else if (arg.startsWith("--trace_port=")) {
			portTraces = Integer.parseInt(arg.substring(13));
		} else if (arg.startsWith("--client_host=")) {
			clientHost = arg.substring(14);
		} else if (arg.startsWith("--context=")) {
			contextStr = arg.substring(10);
			isDefaultContext = false;
		} else if (arg.startsWith("--father_pid=")) {
			fatherPid = arg.substring(13);
		} else if (arg.startsWith("--root_pid=")) {
			rootPid = arg.substring(11);
		} else if (arg.startsWith("--father_node=")) {
			fatherNode = arg.substring(14);
		} else if (arg.startsWith("--pid=")) {
			pid = arg.substring(6);
		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.put(keyValue.substring(0, index),
							replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.put(keyValue.substring(0, index),
							keyValue.substring(index + 1));
				}
			}
		} else if (arg.startsWith("--log4jLevel=")) {
			log4jLevel = arg.substring(13);
		}

	}

	private final String[][] escapeChars = { { "\\\\", "\\" }, { "\\n", "\n" },
			{ "\\'", "\'" }, { "\\r", "\r" }, { "\\f", "\f" }, { "\\b", "\b" },
			{ "\\t", "\t" } };

	private String replaceEscapeChars(String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0], currIndex);
				if (index >= 0) {

					result.append(keyValue.substring(currIndex,
							index + strArray[0].length()).replace(strArray[0],
							strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left
			// into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getStatus() {
		return status;
	}

	ResumeUtil resumeUtil = null;
}