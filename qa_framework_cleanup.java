package ap_unix.qa_framework_process_cleanup_0_1;

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
 * Job: QA_Framework_Process_CleanUp Purpose: CSV File<br>
 * Description: Monthly <br>
 * @author Panetta, Alex
 * @version 6.1.1.20151214_1327
 * @status DEV
 */
public class QA_Framework_Process_CleanUp implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "QA_Framework_Process_CleanUp.log");
	}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(QA_Framework_Process_CleanUp.class);

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
	private final String jobName = "QA_Framework_Process_CleanUp";
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
					QA_Framework_Process_CleanUp.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(QA_Framework_Process_CleanUp.this,
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

	public void tOracleSP_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleSP_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleSP_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public static class row7Struct implements
			routines.system.IPersistableRow<row7Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_CleanUp = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_CleanUp = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_CleanUp.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_CleanUp.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_CleanUp = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_CleanUp = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_QA_Framework_Process_CleanUp,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_CleanUp,
						0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_CleanUp) {

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

				tOracleSP_2Process(globalMap);

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

	public void tOracleSP_2Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleSP_2_SUBPROCESS_STATE", 0);

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
				 * [tOracleSP_2 begin ] start
				 */

				ok_Hash.put("tOracleSP_2", false);
				start_Hash.put("tOracleSP_2", System.currentTimeMillis());

				currentComponent = "tOracleSP_2";

				int tos_count_tOracleSP_2 = 0;

				java.sql.Connection connection_tOracleSP_2 = null;

				java.lang.Class.forName("oracle.jdbc.OracleDriver");

				String connectionString_tOracleSP_2 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				final String decryptedPassword_tOracleSP_2 = context.dbPasswordPI;

				connection_tOracleSP_2 = java.sql.DriverManager.getConnection(
						connectionString_tOracleSP_2, context.dbUserPI,
						decryptedPassword_tOracleSP_2);

				java.sql.CallableStatement statement_tOracleSP_2 = connection_tOracleSP_2
						.prepareCall("{call " + "STATS_APEX.QA_CLEAN_UP"
								+ "()}");

				java.sql.Timestamp tmpDate_tOracleSP_2;
				String tmpString_tOracleSP_2;

				/**
				 * [tOracleSP_2 begin ] stop
				 */

				/**
				 * [tOracleSP_2 main ] start
				 */

				currentComponent = "tOracleSP_2";

				statement_tOracleSP_2.execute();

				tos_count_tOracleSP_2++;

				/**
				 * [tOracleSP_2 main ] stop
				 */

				/**
				 * [tOracleSP_2 end ] start
				 */

				currentComponent = "tOracleSP_2";

				statement_tOracleSP_2.close();
				connection_tOracleSP_2.close();

				ok_Hash.put("tOracleSP_2", true);
				end_Hash.put("tOracleSP_2", System.currentTimeMillis());

				/**
				 * [tOracleSP_2 end ] stop
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
				 * [tOracleSP_2 finally ] start
				 */

				currentComponent = "tOracleSP_2";

				/**
				 * [tOracleSP_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleSP_2_SUBPROCESS_STATE", 1);
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
		final QA_Framework_Process_CleanUp QA_Framework_Process_CleanUpClass = new QA_Framework_Process_CleanUp();

		int exitCode = QA_Framework_Process_CleanUpClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'QA_Framework_Process_CleanUp' - Done.");
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
		log.info("TalendJob: 'QA_Framework_Process_CleanUp' - Start.");

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
			java.io.InputStream inContext = QA_Framework_Process_CleanUp.class
					.getClassLoader().getResourceAsStream(
							"ap_unix/qa_framework_process_cleanup_0_1/contexts/"
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
							+ " bytes memory increase when running : QA_Framework_Process_CleanUp");
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