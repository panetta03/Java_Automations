package ap_unix.qa_framework_process_c2c_0_1;

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

//the import part of tJavaRow_2
//import java.util.List;

//the import part of tJavaRow_3
//import java.util.List;

@SuppressWarnings("unused")
/**
 * Job: QA_Framework_Process_C2C Purpose: CSV File<br>
 * Description: Monthly <br>
 * @author user@talend.com
 * @version 6.1.1.20151214_1327
 * @status DEV
 */
public class QA_Framework_Process_C2C implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "QA_Framework_Process_C2C.log");
	}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(QA_Framework_Process_C2C.class);

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
	}

	private ContextProperties context = new ContextProperties();

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "QA_Framework_Process_C2C";
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
					QA_Framework_Process_C2C.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(QA_Framework_Process_C2C.this,
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

	public void tOracleInput_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tJavaRow_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tOracleInput_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFlowToIterate_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_4_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tOracleRow_2Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get())
					.get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tOracleRow_2Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get())
					.get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_5_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tOracleRow_2Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get())
					.get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tOracleInput_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tOracleRow_2Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get())
					.get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tOracleInput_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tOracleRow_2Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get())
					.get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tOracleRow_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileRowCount_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tOracleRow_2Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get())
					.get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tFileRowCount_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tRunJob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tOracleRow_2Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get())
					.get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tRunJob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleRow_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_5_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleRow_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileRowCount_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tRunJob_1_onSubJobError(Exception exception,
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

	public static class row6Struct implements
			routines.system.IPersistableRow<row6Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[0];

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

		public String FTP_HOST;

		public String getFTP_HOST() {
			return this.FTP_HOST;
		}

		public String FTP_USER;

		public String getFTP_USER() {
			return this.FTP_USER;
		}

		public String FTP_PASSWORD;

		public String getFTP_PASSWORD() {
			return this.FTP_PASSWORD;
		}

		public String PROD_EMAIL;

		public String getPROD_EMAIL() {
			return this.PROD_EMAIL;
		}

		public String SHIP_EMAIL;

		public String getSHIP_EMAIL() {
			return this.SHIP_EMAIL;
		}

		public String SMTP_HOST;

		public String getSMTP_HOST() {
			return this.SMTP_HOST;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AP_UNIX_QA_Framework_Process_C2C,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C, 0,
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

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C) {

				try {

					int length = 0;

					this.USER = readString(dis);

					this.PASSWORD = readString(dis);

					this.HST_NAME = readString(dis);

					this.DB_NAME = readString(dis);

					this.SCHEMA = readString(dis);

					this.FTP_HOST = readString(dis);

					this.FTP_USER = readString(dis);

					this.FTP_PASSWORD = readString(dis);

					this.PROD_EMAIL = readString(dis);

					this.SHIP_EMAIL = readString(dis);

					this.SMTP_HOST = readString(dis);

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

				// String

				writeString(this.FTP_HOST, dos);

				// String

				writeString(this.FTP_USER, dos);

				// String

				writeString(this.FTP_PASSWORD, dos);

				// String

				writeString(this.PROD_EMAIL, dos);

				// String

				writeString(this.SHIP_EMAIL, dos);

				// String

				writeString(this.SMTP_HOST, dos);

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
			sb.append(",FTP_HOST=" + FTP_HOST);
			sb.append(",FTP_USER=" + FTP_USER);
			sb.append(",FTP_PASSWORD=" + FTP_PASSWORD);
			sb.append(",PROD_EMAIL=" + PROD_EMAIL);
			sb.append(",SHIP_EMAIL=" + SHIP_EMAIL);
			sb.append(",SMTP_HOST=" + SMTP_HOST);
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

			if (FTP_HOST == null) {
				sb.append("<null>");
			} else {
				sb.append(FTP_HOST);
			}

			sb.append("|");

			if (FTP_USER == null) {
				sb.append("<null>");
			} else {
				sb.append(FTP_USER);
			}

			sb.append("|");

			if (FTP_PASSWORD == null) {
				sb.append("<null>");
			} else {
				sb.append(FTP_PASSWORD);
			}

			sb.append("|");

			if (PROD_EMAIL == null) {
				sb.append("<null>");
			} else {
				sb.append(PROD_EMAIL);
			}

			sb.append("|");

			if (SHIP_EMAIL == null) {
				sb.append("<null>");
			} else {
				sb.append(SHIP_EMAIL);
			}

			sb.append("|");

			if (SMTP_HOST == null) {
				sb.append("<null>");
			} else {
				sb.append(SMTP_HOST);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row6Struct other) {

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

				row6Struct row6 = new row6Struct();

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
								+ "context.localDirectory+\"/AIS_OWNER_\"+context.dbVersion+\".txt\"");
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
						+ ", SCHEMA_COLUMN=" + ("SCHEMA") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("FTP_HOST")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("FTP_USER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("FTP_PASSWORD") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("PROD_EMAIL")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SHIP_EMAIL") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SMTP_HOST") + "}]");
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
							+ "/AIS_OWNER_" + context.dbVersion + ".txt";
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
								context.localDirectory + "/AIS_OWNER_"
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

						row6 = null;

						boolean whetherReject_tFileInputDelimited_1 = false;
						row6 = new row6Struct();
						try {

							int columnIndexWithD_tFileInputDelimited_1 = 0;

							columnIndexWithD_tFileInputDelimited_1 = 0;

							row6.USER = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 1;

							row6.PASSWORD = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 2;

							row6.HST_NAME = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 3;

							row6.DB_NAME = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 4;

							row6.SCHEMA = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 5;

							row6.FTP_HOST = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 6;

							row6.FTP_USER = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 7;

							row6.FTP_PASSWORD = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 8;

							row6.PROD_EMAIL = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 9;

							row6.SHIP_EMAIL = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 10;

							row6.SMTP_HOST = fid_tFileInputDelimited_1
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
							row6 = null;

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
						// Start of branch "row6"
						if (row6 != null) {

							/**
							 * [tJavaRow_1 main ] start
							 */

							currentComponent = "tJavaRow_1";

							if (log.isTraceEnabled()) {
								log.trace("row6 - "
										+ (row6 == null ? "" : row6
												.toLogString()));
							}

							// Code generate accord to input schema and output
							// schmea
							context.dbUser = row6.USER;
							context.dbPassword = row6.PASSWORD;
							context.dbHostName = row6.HST_NAME;
							context.dbName = row6.DB_NAME;
							context.dbSchema = row6.SCHEMA;
							context.ftpHost = row6.FTP_HOST;
							context.ftpUser = row6.FTP_USER;
							context.ftpPassword = row6.FTP_PASSWORD;
							context.prodEmail = row6.PROD_EMAIL;
							context.shipEmail = row6.SHIP_EMAIL;
							context.smtpHost = row6.SMTP_HOST;

							nb_line_tJavaRow_1++;

							tos_count_tJavaRow_1++;

							/**
							 * [tJavaRow_1 main ] stop
							 */

						} // End of branch "row6"

						/**
						 * [tFileInputDelimited_1 end ] start
						 */

						currentComponent = "tFileInputDelimited_1";

					}
				} finally {
					if (!((Object) (context.localDirectory + "/AIS_OWNER_"
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

				tOracleInput_2Process(globalMap);

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

	public static class row2Struct implements
			routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[0];

		public String REPORT_YEAR_MONTH;

		public String getREPORT_YEAR_MONTH() {
			return this.REPORT_YEAR_MONTH;
		}

		public String REPORT_YEAR;

		public String getREPORT_YEAR() {
			return this.REPORT_YEAR;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AP_UNIX_QA_Framework_Process_C2C,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C, 0,
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

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C) {

				try {

					int length = 0;

					this.REPORT_YEAR_MONTH = readString(dis);

					this.REPORT_YEAR = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.REPORT_YEAR_MONTH, dos);

				// String

				writeString(this.REPORT_YEAR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("REPORT_YEAR_MONTH=" + REPORT_YEAR_MONTH);
			sb.append(",REPORT_YEAR=" + REPORT_YEAR);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (REPORT_YEAR_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_YEAR_MONTH);
			}

			sb.append("|");

			if (REPORT_YEAR == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_YEAR);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row2Struct other) {

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

	public void tOracleInput_2Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_2_SUBPROCESS_STATE", 0);

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

				row2Struct row2 = new row2Struct();

				/**
				 * [tJavaRow_2 begin ] start
				 */

				ok_Hash.put("tJavaRow_2", false);
				start_Hash.put("tJavaRow_2", System.currentTimeMillis());

				currentComponent = "tJavaRow_2";

				int tos_count_tJavaRow_2 = 0;

				int nb_line_tJavaRow_2 = 0;

				/**
				 * [tJavaRow_2 begin ] stop
				 */

				/**
				 * [tOracleInput_2 begin ] start
				 */

				ok_Hash.put("tOracleInput_2", false);
				start_Hash.put("tOracleInput_2", System.currentTimeMillis());

				currentComponent = "tOracleInput_2";

				int tos_count_tOracleInput_2 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_2 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_2 = new StringBuilder();
				log4jParamters_tOracleInput_2.append("Parameters:");
				log4jParamters_tOracleInput_2.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2
						.append("QUERY"
								+ " = "
								+ "\"Select REPORT_YEAR_MONTH, SUBSTR(REPORT_YEAR_MONTH, 1, 4),  TO_CHAR(ADD_MONTHS(to_date(REPORT_YEAR_MONTH,'YYYYMM'), -1), 'YYYYMM')  from CUSTGEN.RSD_TIME_PERIOD rsd_prd  WHERE RSD_PRD.TIME_PERIOD = 'MRMO'\"");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("REPORT_YEAR_MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_YEAR") + "}]");
				log4jParamters_tOracleInput_2.append(" | ");
				log4jParamters_tOracleInput_2.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_2 - "
							+ log4jParamters_tOracleInput_2);

				int nb_line_tOracleInput_2 = 0;
				java.sql.Connection conn_tOracleInput_2 = null;
				String driverClass_tOracleInput_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_2);

				String url_tOracleInput_2 = null;
				url_tOracleInput_2 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_2 = context.dbUser;

				final String decryptedPassword_tOracleInput_2 = context.dbPassword;

				String dbPwd_tOracleInput_2 = decryptedPassword_tOracleInput_2;

				log.debug("tOracleInput_2 - Driver ClassName: "
						+ driverClass_tOracleInput_2 + ".");

				log.info("tOracleInput_2 - Connection attempt to '"
						+ url_tOracleInput_2 + "' with the username '"
						+ dbUser_tOracleInput_2 + "'.");

				conn_tOracleInput_2 = java.sql.DriverManager.getConnection(
						url_tOracleInput_2, dbUser_tOracleInput_2,
						dbPwd_tOracleInput_2);
				log.info("tOracleInput_2 - Connection to '"
						+ url_tOracleInput_2 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_2 = conn_tOracleInput_2
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_2 = stmtGetTZ_tOracleInput_2
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_2 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_2.next()) {
					sessionTimezone_tOracleInput_2 = rsGetTZ_tOracleInput_2
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_2)
						.setSessionTimeZone(sessionTimezone_tOracleInput_2);

				java.sql.Statement stmt_tOracleInput_2 = conn_tOracleInput_2
						.createStatement();

				String dbquery_tOracleInput_2 = "Select REPORT_YEAR_MONTH, SUBSTR(REPORT_YEAR_MONTH, 1, 4),\nTO_CHAR(ADD_MONTHS(to_date(REPORT_YEAR_MONTH,'YYYYMM'), -1), 'YYYYMM')\nfrom CUSTGEN.RSD_TIME_PERIOD rsd_prd\nWHERE RSD_PRD.TIME_PERIOD = 'MRMO'";

				log.info("tOracleInput_2 - Executing the query: '"
						+ dbquery_tOracleInput_2 + "'.");

				globalMap.put("tOracleInput_2_QUERY", dbquery_tOracleInput_2);

				java.sql.ResultSet rs_tOracleInput_2 = null;
				try {
					rs_tOracleInput_2 = stmt_tOracleInput_2
							.executeQuery(dbquery_tOracleInput_2);
					java.sql.ResultSetMetaData rsmd_tOracleInput_2 = rs_tOracleInput_2
							.getMetaData();
					int colQtyInRs_tOracleInput_2 = rsmd_tOracleInput_2
							.getColumnCount();

					String tmpContent_tOracleInput_2 = null;

					log.info("tOracleInput_2 - Retrieving records from the database.");

					while (rs_tOracleInput_2.next()) {
						nb_line_tOracleInput_2++;

						if (colQtyInRs_tOracleInput_2 < 1) {
							row2.REPORT_YEAR_MONTH = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(1);
							if (tmpContent_tOracleInput_2 != null) {
								row2.REPORT_YEAR_MONTH = tmpContent_tOracleInput_2;
							} else {
								row2.REPORT_YEAR_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 2) {
							row2.REPORT_YEAR = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(2);
							if (tmpContent_tOracleInput_2 != null) {
								row2.REPORT_YEAR = tmpContent_tOracleInput_2;
							} else {
								row2.REPORT_YEAR = null;
							}
						}

						log.debug("tOracleInput_2 - Retrieving the record "
								+ nb_line_tOracleInput_2 + ".");

						/**
						 * [tOracleInput_2 begin ] stop
						 */

						/**
						 * [tOracleInput_2 main ] start
						 */

						currentComponent = "tOracleInput_2";

						tos_count_tOracleInput_2++;

						/**
						 * [tOracleInput_2 main ] stop
						 */

						/**
						 * [tJavaRow_2 main ] start
						 */

						currentComponent = "tJavaRow_2";

						if (log.isTraceEnabled()) {
							log.trace("row2 - "
									+ (row2 == null ? "" : row2.toLogString()));
						}

						// Code generate accord to input schema and output
						// schmea
						context.reportMonth = row2.REPORT_YEAR_MONTH;
						context.reportYear = row2.REPORT_YEAR;

						nb_line_tJavaRow_2++;

						tos_count_tJavaRow_2++;

						/**
						 * [tJavaRow_2 main ] stop
						 */

						/**
						 * [tOracleInput_2 end ] start
						 */

						currentComponent = "tOracleInput_2";

					}
				} finally {
					stmt_tOracleInput_2.close();

					if (conn_tOracleInput_2 != null
							&& !conn_tOracleInput_2.isClosed()) {

						log.info("tOracleInput_2 - Closing the connection to the database.");

						conn_tOracleInput_2.close();

						log.info("tOracleInput_2 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_2_NB_LINE", nb_line_tOracleInput_2);
				log.info("tOracleInput_2 - Retrieved records count: "
						+ nb_line_tOracleInput_2 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_2 - " + "Done.");

				ok_Hash.put("tOracleInput_2", true);
				end_Hash.put("tOracleInput_2", System.currentTimeMillis());

				/**
				 * [tOracleInput_2 end ] stop
				 */

				/**
				 * [tJavaRow_2 end ] start
				 */

				currentComponent = "tJavaRow_2";

				globalMap.put("tJavaRow_2_NB_LINE", nb_line_tJavaRow_2);

				ok_Hash.put("tJavaRow_2", true);
				end_Hash.put("tJavaRow_2", System.currentTimeMillis());

				tFileInputDelimited_2Process(globalMap);

				/**
				 * [tJavaRow_2 end ] stop
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
				 * [tOracleInput_2 finally ] start
				 */

				currentComponent = "tOracleInput_2";

				/**
				 * [tOracleInput_2 finally ] stop
				 */

				/**
				 * [tJavaRow_2 finally ] start
				 */

				currentComponent = "tJavaRow_2";

				/**
				 * [tJavaRow_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_2_SUBPROCESS_STATE", 1);
	}

	public static class row7Struct implements
			routines.system.IPersistableRow<row7Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AP_UNIX_QA_Framework_Process_C2C,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C, 0,
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

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C) {

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

	public void tFileInputDelimited_2Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

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
				 * [tJavaRow_3 begin ] start
				 */

				ok_Hash.put("tJavaRow_3", false);
				start_Hash.put("tJavaRow_3", System.currentTimeMillis());

				currentComponent = "tJavaRow_3";

				int tos_count_tJavaRow_3 = 0;

				int nb_line_tJavaRow_3 = 0;

				/**
				 * [tJavaRow_3 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_2 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_2", false);
				start_Hash.put("tFileInputDelimited_2",
						System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_2";

				int tos_count_tFileInputDelimited_2 = 0;

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_2 - " + "Start to work.");
				StringBuilder log4jParamters_tFileInputDelimited_2 = new StringBuilder();
				log4jParamters_tFileInputDelimited_2.append("Parameters:");
				log4jParamters_tFileInputDelimited_2
						.append("FILENAME"
								+ " = "
								+ "context.localDirectory+\"/STATS_APEX_\"+context.dbVersion+\".txt\"");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("HEADER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("FOOTER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("LIMIT" + " = "
						+ "");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("REMOVE_EMPTY_ROW"
						+ " = " + "true");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("UNCOMPRESS"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("DIE_ON_ERROR"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("RANDOM" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("TRIMALL" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("TRIMSELECT"
						+ " = " + "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("USER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("PASSWORD") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("HST_NAME")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("DB_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SCHEMA") + "}]");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("CHECK_FIELDS_NUM"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("CHECK_DATE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("SPLITRECORD"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				log4jParamters_tFileInputDelimited_2.append("ENABLE_DECODE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_2 - "
							+ log4jParamters_tFileInputDelimited_2);

				final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_2 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = null;
				try {

					Object filename_tFileInputDelimited_2 = context.localDirectory
							+ "/STATS_APEX_" + context.dbVersion + ".txt";
					if (filename_tFileInputDelimited_2 instanceof java.io.InputStream) {

						int footer_value_tFileInputDelimited_2 = 0, random_value_tFileInputDelimited_2 = -1;
						if (footer_value_tFileInputDelimited_2 > 0
								|| random_value_tFileInputDelimited_2 > 0) {
							throw new java.lang.Exception(
									"When the input source is a stream,footer and random shouldn't be bigger than 0.");
						}

					}
					try {
						fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited(
								context.localDirectory + "/STATS_APEX_"
										+ context.dbVersion + ".txt",
								"ISO-8859-15", ",", "\r\n", true, 0, 0, -1, -1,
								false);
					} catch (java.lang.Exception e) {

						log.error("tFileInputDelimited_2 - " + e.getMessage());

						System.err.println(e.getMessage());

					}

					log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");

					while (fid_tFileInputDelimited_2 != null
							&& fid_tFileInputDelimited_2.nextRecord()) {
						rowstate_tFileInputDelimited_2.reset();

						row7 = null;

						boolean whetherReject_tFileInputDelimited_2 = false;
						row7 = new row7Struct();
						try {

							int columnIndexWithD_tFileInputDelimited_2 = 0;

							columnIndexWithD_tFileInputDelimited_2 = 0;

							row7.USER = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 1;

							row7.PASSWORD = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 2;

							row7.HST_NAME = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 3;

							row7.DB_NAME = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 4;

							row7.SCHEMA = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							if (rowstate_tFileInputDelimited_2.getException() != null) {
								throw rowstate_tFileInputDelimited_2
										.getException();
							}

						} catch (java.lang.Exception e) {
							whetherReject_tFileInputDelimited_2 = true;

							log.error("tFileInputDelimited_2 - "
									+ e.getMessage());

							System.err.println(e.getMessage());
							row7 = null;

						}

						log.debug("tFileInputDelimited_2 - Retrieving the record "
								+ fid_tFileInputDelimited_2.getRowNumber()
								+ ".");

						/**
						 * [tFileInputDelimited_2 begin ] stop
						 */

						/**
						 * [tFileInputDelimited_2 main ] start
						 */

						currentComponent = "tFileInputDelimited_2";

						tos_count_tFileInputDelimited_2++;

						/**
						 * [tFileInputDelimited_2 main ] stop
						 */
						// Start of branch "row7"
						if (row7 != null) {

							/**
							 * [tJavaRow_3 main ] start
							 */

							currentComponent = "tJavaRow_3";

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

							nb_line_tJavaRow_3++;

							tos_count_tJavaRow_3++;

							/**
							 * [tJavaRow_3 main ] stop
							 */

						} // End of branch "row7"

						/**
						 * [tFileInputDelimited_2 end ] start
						 */

						currentComponent = "tFileInputDelimited_2";

					}
				} finally {
					if (!((Object) (context.localDirectory + "/STATS_APEX_"
							+ context.dbVersion + ".txt") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_2 != null) {
							fid_tFileInputDelimited_2.close();
						}
					}
					if (fid_tFileInputDelimited_2 != null) {
						globalMap.put("tFileInputDelimited_2_NB_LINE",
								fid_tFileInputDelimited_2.getRowNumber());

						log.info("tFileInputDelimited_2 - Retrieved records count: "
								+ fid_tFileInputDelimited_2.getRowNumber()
								+ ".");

					}
				}

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_2 - " + "Done.");

				ok_Hash.put("tFileInputDelimited_2", true);
				end_Hash.put("tFileInputDelimited_2",
						System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_2 end ] stop
				 */

				/**
				 * [tJavaRow_3 end ] start
				 */

				currentComponent = "tJavaRow_3";

				globalMap.put("tJavaRow_3_NB_LINE", nb_line_tJavaRow_3);

				ok_Hash.put("tJavaRow_3", true);
				end_Hash.put("tJavaRow_3", System.currentTimeMillis());

				tOracleInput_1Process(globalMap);

				/**
				 * [tJavaRow_3 end ] stop
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
				 * [tFileInputDelimited_2 finally ] start
				 */

				currentComponent = "tFileInputDelimited_2";

				/**
				 * [tFileInputDelimited_2 finally ] stop
				 */

				/**
				 * [tJavaRow_3 finally ] start
				 */

				currentComponent = "tJavaRow_3";

				/**
				 * [tJavaRow_3 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}

	public static class row8Struct implements
			routines.system.IPersistableRow<row8Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[0];

		public String newColumn;

		public String getNewColumn() {
			return this.newColumn;
		}

		public String newColumn1;

		public String getNewColumn1() {
			return this.newColumn1;
		}

		public String newColumn2;

		public String getNewColumn2() {
			return this.newColumn2;
		}

		public String newColumn3;

		public String getNewColumn3() {
			return this.newColumn3;
		}

		public String newColumn4;

		public String getNewColumn4() {
			return this.newColumn4;
		}

		public String newColumn5;

		public String getNewColumn5() {
			return this.newColumn5;
		}

		public String newColumn6;

		public String getNewColumn6() {
			return this.newColumn6;
		}

		public String newColumn7;

		public String getNewColumn7() {
			return this.newColumn7;
		}

		public String newColumn8;

		public String getNewColumn8() {
			return this.newColumn8;
		}

		public String newColumn9;

		public String getNewColumn9() {
			return this.newColumn9;
		}

		public String newColumn10;

		public String getNewColumn10() {
			return this.newColumn10;
		}

		public String newColumn11;

		public String getNewColumn11() {
			return this.newColumn11;
		}

		public String newColumn12;

		public String getNewColumn12() {
			return this.newColumn12;
		}

		public String newColumn13;

		public String getNewColumn13() {
			return this.newColumn13;
		}

		public String newColumn14;

		public String getNewColumn14() {
			return this.newColumn14;
		}

		public String newColumn15;

		public String getNewColumn15() {
			return this.newColumn15;
		}

		public String newColumn16;

		public String getNewColumn16() {
			return this.newColumn16;
		}

		public String newColumn17;

		public String getNewColumn17() {
			return this.newColumn17;
		}

		public String newColumn18;

		public String getNewColumn18() {
			return this.newColumn18;
		}

		public String newColumn19;

		public String getNewColumn19() {
			return this.newColumn19;
		}

		public String newColumn20;

		public String getNewColumn20() {
			return this.newColumn20;
		}

		public String newColumn21;

		public String getNewColumn21() {
			return this.newColumn21;
		}

		public String newColumn22;

		public String getNewColumn22() {
			return this.newColumn22;
		}

		public String newColumn23;

		public String getNewColumn23() {
			return this.newColumn23;
		}

		public String newColumn24;

		public String getNewColumn24() {
			return this.newColumn24;
		}

		public String newColumn25;

		public String getNewColumn25() {
			return this.newColumn25;
		}

		public String newColumn26;

		public String getNewColumn26() {
			return this.newColumn26;
		}

		public String newColumn27;

		public String getNewColumn27() {
			return this.newColumn27;
		}

		public String newColumn28;

		public String getNewColumn28() {
			return this.newColumn28;
		}

		public String newColumn29;

		public String getNewColumn29() {
			return this.newColumn29;
		}

		public String newColumn30;

		public String getNewColumn30() {
			return this.newColumn30;
		}

		public String newColumn31;

		public String getNewColumn31() {
			return this.newColumn31;
		}

		public String newColumn32;

		public String getNewColumn32() {
			return this.newColumn32;
		}

		public String newColumn33;

		public String getNewColumn33() {
			return this.newColumn33;
		}

		public String newColumn34;

		public String getNewColumn34() {
			return this.newColumn34;
		}

		public String newColumn35;

		public String getNewColumn35() {
			return this.newColumn35;
		}

		public String newColumn36;

		public String getNewColumn36() {
			return this.newColumn36;
		}

		public String newColumn37;

		public String getNewColumn37() {
			return this.newColumn37;
		}

		public String newColumn38;

		public String getNewColumn38() {
			return this.newColumn38;
		}

		public String newColumn39;

		public String getNewColumn39() {
			return this.newColumn39;
		}

		public String newColumn40;

		public String getNewColumn40() {
			return this.newColumn40;
		}

		public String newColumn41;

		public String getNewColumn41() {
			return this.newColumn41;
		}

		public String newColumn42;

		public String getNewColumn42() {
			return this.newColumn42;
		}

		public String newColumn43;

		public String getNewColumn43() {
			return this.newColumn43;
		}

		public String newColumn44;

		public String getNewColumn44() {
			return this.newColumn44;
		}

		public String newColumn45;

		public String getNewColumn45() {
			return this.newColumn45;
		}

		public String newColumn46;

		public String getNewColumn46() {
			return this.newColumn46;
		}

		public String newColumn47;

		public String getNewColumn47() {
			return this.newColumn47;
		}

		public String newColumn48;

		public String getNewColumn48() {
			return this.newColumn48;
		}

		public String newColumn49;

		public String getNewColumn49() {
			return this.newColumn49;
		}

		public String newColumn50;

		public String getNewColumn50() {
			return this.newColumn50;
		}

		public String newColumn51;

		public String getNewColumn51() {
			return this.newColumn51;
		}

		public String newColumn52;

		public String getNewColumn52() {
			return this.newColumn52;
		}

		public String newColumn53;

		public String getNewColumn53() {
			return this.newColumn53;
		}

		public String newColumn54;

		public String getNewColumn54() {
			return this.newColumn54;
		}

		public String newColumn55;

		public String getNewColumn55() {
			return this.newColumn55;
		}

		public String newColumn56;

		public String getNewColumn56() {
			return this.newColumn56;
		}

		public String newColumn57;

		public String getNewColumn57() {
			return this.newColumn57;
		}

		public String newColumn58;

		public String getNewColumn58() {
			return this.newColumn58;
		}

		public String newColumn59;

		public String getNewColumn59() {
			return this.newColumn59;
		}

		public String newColumn60;

		public String getNewColumn60() {
			return this.newColumn60;
		}

		public String newColumn61;

		public String getNewColumn61() {
			return this.newColumn61;
		}

		public String newColumn62;

		public String getNewColumn62() {
			return this.newColumn62;
		}

		public String newColumn63;

		public String getNewColumn63() {
			return this.newColumn63;
		}

		public String newColumn64;

		public String getNewColumn64() {
			return this.newColumn64;
		}

		public String newColumn65;

		public String getNewColumn65() {
			return this.newColumn65;
		}

		public String newColumn66;

		public String getNewColumn66() {
			return this.newColumn66;
		}

		public String newColumn67;

		public String getNewColumn67() {
			return this.newColumn67;
		}

		public String newColumn68;

		public String getNewColumn68() {
			return this.newColumn68;
		}

		public String newColumn69;

		public String getNewColumn69() {
			return this.newColumn69;
		}

		public String newColumn70;

		public String getNewColumn70() {
			return this.newColumn70;
		}

		public String newColumn71;

		public String getNewColumn71() {
			return this.newColumn71;
		}

		public String newColumn72;

		public String getNewColumn72() {
			return this.newColumn72;
		}

		public String newColumn73;

		public String getNewColumn73() {
			return this.newColumn73;
		}

		public String newColumn74;

		public String getNewColumn74() {
			return this.newColumn74;
		}

		public String newColumn75;

		public String getNewColumn75() {
			return this.newColumn75;
		}

		public String newColumn76;

		public String getNewColumn76() {
			return this.newColumn76;
		}

		public String newColumn77;

		public String getNewColumn77() {
			return this.newColumn77;
		}

		public String newColumn78;

		public String getNewColumn78() {
			return this.newColumn78;
		}

		public String newColumn79;

		public String getNewColumn79() {
			return this.newColumn79;
		}

		public String newColumn80;

		public String getNewColumn80() {
			return this.newColumn80;
		}

		public String newColumn81;

		public String getNewColumn81() {
			return this.newColumn81;
		}

		public String newColumn82;

		public String getNewColumn82() {
			return this.newColumn82;
		}

		public String newColumn83;

		public String getNewColumn83() {
			return this.newColumn83;
		}

		public String newColumn84;

		public String getNewColumn84() {
			return this.newColumn84;
		}

		public String newColumn85;

		public String getNewColumn85() {
			return this.newColumn85;
		}

		public String newColumn86;

		public String getNewColumn86() {
			return this.newColumn86;
		}

		public String newColumn87;

		public String getNewColumn87() {
			return this.newColumn87;
		}

		public String newColumn88;

		public String getNewColumn88() {
			return this.newColumn88;
		}

		public String newColumn89;

		public String getNewColumn89() {
			return this.newColumn89;
		}

		public String newColumn90;

		public String getNewColumn90() {
			return this.newColumn90;
		}

		public String newColumn91;

		public String getNewColumn91() {
			return this.newColumn91;
		}

		public String newColumn92;

		public String getNewColumn92() {
			return this.newColumn92;
		}

		public String newColumn93;

		public String getNewColumn93() {
			return this.newColumn93;
		}

		public String newColumn94;

		public String getNewColumn94() {
			return this.newColumn94;
		}

		public String newColumn95;

		public String getNewColumn95() {
			return this.newColumn95;
		}

		public String newColumn96;

		public String getNewColumn96() {
			return this.newColumn96;
		}

		public String newColumn97;

		public String getNewColumn97() {
			return this.newColumn97;
		}

		public String newColumn98;

		public String getNewColumn98() {
			return this.newColumn98;
		}

		public String newColumn99;

		public String getNewColumn99() {
			return this.newColumn99;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AP_UNIX_QA_Framework_Process_C2C,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C, 0,
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

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C) {

				try {

					int length = 0;

					this.newColumn = readString(dis);

					this.newColumn1 = readString(dis);

					this.newColumn2 = readString(dis);

					this.newColumn3 = readString(dis);

					this.newColumn4 = readString(dis);

					this.newColumn5 = readString(dis);

					this.newColumn6 = readString(dis);

					this.newColumn7 = readString(dis);

					this.newColumn8 = readString(dis);

					this.newColumn9 = readString(dis);

					this.newColumn10 = readString(dis);

					this.newColumn11 = readString(dis);

					this.newColumn12 = readString(dis);

					this.newColumn13 = readString(dis);

					this.newColumn14 = readString(dis);

					this.newColumn15 = readString(dis);

					this.newColumn16 = readString(dis);

					this.newColumn17 = readString(dis);

					this.newColumn18 = readString(dis);

					this.newColumn19 = readString(dis);

					this.newColumn20 = readString(dis);

					this.newColumn21 = readString(dis);

					this.newColumn22 = readString(dis);

					this.newColumn23 = readString(dis);

					this.newColumn24 = readString(dis);

					this.newColumn25 = readString(dis);

					this.newColumn26 = readString(dis);

					this.newColumn27 = readString(dis);

					this.newColumn28 = readString(dis);

					this.newColumn29 = readString(dis);

					this.newColumn30 = readString(dis);

					this.newColumn31 = readString(dis);

					this.newColumn32 = readString(dis);

					this.newColumn33 = readString(dis);

					this.newColumn34 = readString(dis);

					this.newColumn35 = readString(dis);

					this.newColumn36 = readString(dis);

					this.newColumn37 = readString(dis);

					this.newColumn38 = readString(dis);

					this.newColumn39 = readString(dis);

					this.newColumn40 = readString(dis);

					this.newColumn41 = readString(dis);

					this.newColumn42 = readString(dis);

					this.newColumn43 = readString(dis);

					this.newColumn44 = readString(dis);

					this.newColumn45 = readString(dis);

					this.newColumn46 = readString(dis);

					this.newColumn47 = readString(dis);

					this.newColumn48 = readString(dis);

					this.newColumn49 = readString(dis);

					this.newColumn50 = readString(dis);

					this.newColumn51 = readString(dis);

					this.newColumn52 = readString(dis);

					this.newColumn53 = readString(dis);

					this.newColumn54 = readString(dis);

					this.newColumn55 = readString(dis);

					this.newColumn56 = readString(dis);

					this.newColumn57 = readString(dis);

					this.newColumn58 = readString(dis);

					this.newColumn59 = readString(dis);

					this.newColumn60 = readString(dis);

					this.newColumn61 = readString(dis);

					this.newColumn62 = readString(dis);

					this.newColumn63 = readString(dis);

					this.newColumn64 = readString(dis);

					this.newColumn65 = readString(dis);

					this.newColumn66 = readString(dis);

					this.newColumn67 = readString(dis);

					this.newColumn68 = readString(dis);

					this.newColumn69 = readString(dis);

					this.newColumn70 = readString(dis);

					this.newColumn71 = readString(dis);

					this.newColumn72 = readString(dis);

					this.newColumn73 = readString(dis);

					this.newColumn74 = readString(dis);

					this.newColumn75 = readString(dis);

					this.newColumn76 = readString(dis);

					this.newColumn77 = readString(dis);

					this.newColumn78 = readString(dis);

					this.newColumn79 = readString(dis);

					this.newColumn80 = readString(dis);

					this.newColumn81 = readString(dis);

					this.newColumn82 = readString(dis);

					this.newColumn83 = readString(dis);

					this.newColumn84 = readString(dis);

					this.newColumn85 = readString(dis);

					this.newColumn86 = readString(dis);

					this.newColumn87 = readString(dis);

					this.newColumn88 = readString(dis);

					this.newColumn89 = readString(dis);

					this.newColumn90 = readString(dis);

					this.newColumn91 = readString(dis);

					this.newColumn92 = readString(dis);

					this.newColumn93 = readString(dis);

					this.newColumn94 = readString(dis);

					this.newColumn95 = readString(dis);

					this.newColumn96 = readString(dis);

					this.newColumn97 = readString(dis);

					this.newColumn98 = readString(dis);

					this.newColumn99 = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.newColumn, dos);

				// String

				writeString(this.newColumn1, dos);

				// String

				writeString(this.newColumn2, dos);

				// String

				writeString(this.newColumn3, dos);

				// String

				writeString(this.newColumn4, dos);

				// String

				writeString(this.newColumn5, dos);

				// String

				writeString(this.newColumn6, dos);

				// String

				writeString(this.newColumn7, dos);

				// String

				writeString(this.newColumn8, dos);

				// String

				writeString(this.newColumn9, dos);

				// String

				writeString(this.newColumn10, dos);

				// String

				writeString(this.newColumn11, dos);

				// String

				writeString(this.newColumn12, dos);

				// String

				writeString(this.newColumn13, dos);

				// String

				writeString(this.newColumn14, dos);

				// String

				writeString(this.newColumn15, dos);

				// String

				writeString(this.newColumn16, dos);

				// String

				writeString(this.newColumn17, dos);

				// String

				writeString(this.newColumn18, dos);

				// String

				writeString(this.newColumn19, dos);

				// String

				writeString(this.newColumn20, dos);

				// String

				writeString(this.newColumn21, dos);

				// String

				writeString(this.newColumn22, dos);

				// String

				writeString(this.newColumn23, dos);

				// String

				writeString(this.newColumn24, dos);

				// String

				writeString(this.newColumn25, dos);

				// String

				writeString(this.newColumn26, dos);

				// String

				writeString(this.newColumn27, dos);

				// String

				writeString(this.newColumn28, dos);

				// String

				writeString(this.newColumn29, dos);

				// String

				writeString(this.newColumn30, dos);

				// String

				writeString(this.newColumn31, dos);

				// String

				writeString(this.newColumn32, dos);

				// String

				writeString(this.newColumn33, dos);

				// String

				writeString(this.newColumn34, dos);

				// String

				writeString(this.newColumn35, dos);

				// String

				writeString(this.newColumn36, dos);

				// String

				writeString(this.newColumn37, dos);

				// String

				writeString(this.newColumn38, dos);

				// String

				writeString(this.newColumn39, dos);

				// String

				writeString(this.newColumn40, dos);

				// String

				writeString(this.newColumn41, dos);

				// String

				writeString(this.newColumn42, dos);

				// String

				writeString(this.newColumn43, dos);

				// String

				writeString(this.newColumn44, dos);

				// String

				writeString(this.newColumn45, dos);

				// String

				writeString(this.newColumn46, dos);

				// String

				writeString(this.newColumn47, dos);

				// String

				writeString(this.newColumn48, dos);

				// String

				writeString(this.newColumn49, dos);

				// String

				writeString(this.newColumn50, dos);

				// String

				writeString(this.newColumn51, dos);

				// String

				writeString(this.newColumn52, dos);

				// String

				writeString(this.newColumn53, dos);

				// String

				writeString(this.newColumn54, dos);

				// String

				writeString(this.newColumn55, dos);

				// String

				writeString(this.newColumn56, dos);

				// String

				writeString(this.newColumn57, dos);

				// String

				writeString(this.newColumn58, dos);

				// String

				writeString(this.newColumn59, dos);

				// String

				writeString(this.newColumn60, dos);

				// String

				writeString(this.newColumn61, dos);

				// String

				writeString(this.newColumn62, dos);

				// String

				writeString(this.newColumn63, dos);

				// String

				writeString(this.newColumn64, dos);

				// String

				writeString(this.newColumn65, dos);

				// String

				writeString(this.newColumn66, dos);

				// String

				writeString(this.newColumn67, dos);

				// String

				writeString(this.newColumn68, dos);

				// String

				writeString(this.newColumn69, dos);

				// String

				writeString(this.newColumn70, dos);

				// String

				writeString(this.newColumn71, dos);

				// String

				writeString(this.newColumn72, dos);

				// String

				writeString(this.newColumn73, dos);

				// String

				writeString(this.newColumn74, dos);

				// String

				writeString(this.newColumn75, dos);

				// String

				writeString(this.newColumn76, dos);

				// String

				writeString(this.newColumn77, dos);

				// String

				writeString(this.newColumn78, dos);

				// String

				writeString(this.newColumn79, dos);

				// String

				writeString(this.newColumn80, dos);

				// String

				writeString(this.newColumn81, dos);

				// String

				writeString(this.newColumn82, dos);

				// String

				writeString(this.newColumn83, dos);

				// String

				writeString(this.newColumn84, dos);

				// String

				writeString(this.newColumn85, dos);

				// String

				writeString(this.newColumn86, dos);

				// String

				writeString(this.newColumn87, dos);

				// String

				writeString(this.newColumn88, dos);

				// String

				writeString(this.newColumn89, dos);

				// String

				writeString(this.newColumn90, dos);

				// String

				writeString(this.newColumn91, dos);

				// String

				writeString(this.newColumn92, dos);

				// String

				writeString(this.newColumn93, dos);

				// String

				writeString(this.newColumn94, dos);

				// String

				writeString(this.newColumn95, dos);

				// String

				writeString(this.newColumn96, dos);

				// String

				writeString(this.newColumn97, dos);

				// String

				writeString(this.newColumn98, dos);

				// String

				writeString(this.newColumn99, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("newColumn=" + newColumn);
			sb.append(",newColumn1=" + newColumn1);
			sb.append(",newColumn2=" + newColumn2);
			sb.append(",newColumn3=" + newColumn3);
			sb.append(",newColumn4=" + newColumn4);
			sb.append(",newColumn5=" + newColumn5);
			sb.append(",newColumn6=" + newColumn6);
			sb.append(",newColumn7=" + newColumn7);
			sb.append(",newColumn8=" + newColumn8);
			sb.append(",newColumn9=" + newColumn9);
			sb.append(",newColumn10=" + newColumn10);
			sb.append(",newColumn11=" + newColumn11);
			sb.append(",newColumn12=" + newColumn12);
			sb.append(",newColumn13=" + newColumn13);
			sb.append(",newColumn14=" + newColumn14);
			sb.append(",newColumn15=" + newColumn15);
			sb.append(",newColumn16=" + newColumn16);
			sb.append(",newColumn17=" + newColumn17);
			sb.append(",newColumn18=" + newColumn18);
			sb.append(",newColumn19=" + newColumn19);
			sb.append(",newColumn20=" + newColumn20);
			sb.append(",newColumn21=" + newColumn21);
			sb.append(",newColumn22=" + newColumn22);
			sb.append(",newColumn23=" + newColumn23);
			sb.append(",newColumn24=" + newColumn24);
			sb.append(",newColumn25=" + newColumn25);
			sb.append(",newColumn26=" + newColumn26);
			sb.append(",newColumn27=" + newColumn27);
			sb.append(",newColumn28=" + newColumn28);
			sb.append(",newColumn29=" + newColumn29);
			sb.append(",newColumn30=" + newColumn30);
			sb.append(",newColumn31=" + newColumn31);
			sb.append(",newColumn32=" + newColumn32);
			sb.append(",newColumn33=" + newColumn33);
			sb.append(",newColumn34=" + newColumn34);
			sb.append(",newColumn35=" + newColumn35);
			sb.append(",newColumn36=" + newColumn36);
			sb.append(",newColumn37=" + newColumn37);
			sb.append(",newColumn38=" + newColumn38);
			sb.append(",newColumn39=" + newColumn39);
			sb.append(",newColumn40=" + newColumn40);
			sb.append(",newColumn41=" + newColumn41);
			sb.append(",newColumn42=" + newColumn42);
			sb.append(",newColumn43=" + newColumn43);
			sb.append(",newColumn44=" + newColumn44);
			sb.append(",newColumn45=" + newColumn45);
			sb.append(",newColumn46=" + newColumn46);
			sb.append(",newColumn47=" + newColumn47);
			sb.append(",newColumn48=" + newColumn48);
			sb.append(",newColumn49=" + newColumn49);
			sb.append(",newColumn50=" + newColumn50);
			sb.append(",newColumn51=" + newColumn51);
			sb.append(",newColumn52=" + newColumn52);
			sb.append(",newColumn53=" + newColumn53);
			sb.append(",newColumn54=" + newColumn54);
			sb.append(",newColumn55=" + newColumn55);
			sb.append(",newColumn56=" + newColumn56);
			sb.append(",newColumn57=" + newColumn57);
			sb.append(",newColumn58=" + newColumn58);
			sb.append(",newColumn59=" + newColumn59);
			sb.append(",newColumn60=" + newColumn60);
			sb.append(",newColumn61=" + newColumn61);
			sb.append(",newColumn62=" + newColumn62);
			sb.append(",newColumn63=" + newColumn63);
			sb.append(",newColumn64=" + newColumn64);
			sb.append(",newColumn65=" + newColumn65);
			sb.append(",newColumn66=" + newColumn66);
			sb.append(",newColumn67=" + newColumn67);
			sb.append(",newColumn68=" + newColumn68);
			sb.append(",newColumn69=" + newColumn69);
			sb.append(",newColumn70=" + newColumn70);
			sb.append(",newColumn71=" + newColumn71);
			sb.append(",newColumn72=" + newColumn72);
			sb.append(",newColumn73=" + newColumn73);
			sb.append(",newColumn74=" + newColumn74);
			sb.append(",newColumn75=" + newColumn75);
			sb.append(",newColumn76=" + newColumn76);
			sb.append(",newColumn77=" + newColumn77);
			sb.append(",newColumn78=" + newColumn78);
			sb.append(",newColumn79=" + newColumn79);
			sb.append(",newColumn80=" + newColumn80);
			sb.append(",newColumn81=" + newColumn81);
			sb.append(",newColumn82=" + newColumn82);
			sb.append(",newColumn83=" + newColumn83);
			sb.append(",newColumn84=" + newColumn84);
			sb.append(",newColumn85=" + newColumn85);
			sb.append(",newColumn86=" + newColumn86);
			sb.append(",newColumn87=" + newColumn87);
			sb.append(",newColumn88=" + newColumn88);
			sb.append(",newColumn89=" + newColumn89);
			sb.append(",newColumn90=" + newColumn90);
			sb.append(",newColumn91=" + newColumn91);
			sb.append(",newColumn92=" + newColumn92);
			sb.append(",newColumn93=" + newColumn93);
			sb.append(",newColumn94=" + newColumn94);
			sb.append(",newColumn95=" + newColumn95);
			sb.append(",newColumn96=" + newColumn96);
			sb.append(",newColumn97=" + newColumn97);
			sb.append(",newColumn98=" + newColumn98);
			sb.append(",newColumn99=" + newColumn99);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (newColumn == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn);
			}

			sb.append("|");

			if (newColumn1 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn1);
			}

			sb.append("|");

			if (newColumn2 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn2);
			}

			sb.append("|");

			if (newColumn3 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn3);
			}

			sb.append("|");

			if (newColumn4 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn4);
			}

			sb.append("|");

			if (newColumn5 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn5);
			}

			sb.append("|");

			if (newColumn6 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn6);
			}

			sb.append("|");

			if (newColumn7 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn7);
			}

			sb.append("|");

			if (newColumn8 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn8);
			}

			sb.append("|");

			if (newColumn9 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn9);
			}

			sb.append("|");

			if (newColumn10 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn10);
			}

			sb.append("|");

			if (newColumn11 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn11);
			}

			sb.append("|");

			if (newColumn12 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn12);
			}

			sb.append("|");

			if (newColumn13 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn13);
			}

			sb.append("|");

			if (newColumn14 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn14);
			}

			sb.append("|");

			if (newColumn15 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn15);
			}

			sb.append("|");

			if (newColumn16 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn16);
			}

			sb.append("|");

			if (newColumn17 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn17);
			}

			sb.append("|");

			if (newColumn18 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn18);
			}

			sb.append("|");

			if (newColumn19 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn19);
			}

			sb.append("|");

			if (newColumn20 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn20);
			}

			sb.append("|");

			if (newColumn21 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn21);
			}

			sb.append("|");

			if (newColumn22 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn22);
			}

			sb.append("|");

			if (newColumn23 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn23);
			}

			sb.append("|");

			if (newColumn24 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn24);
			}

			sb.append("|");

			if (newColumn25 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn25);
			}

			sb.append("|");

			if (newColumn26 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn26);
			}

			sb.append("|");

			if (newColumn27 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn27);
			}

			sb.append("|");

			if (newColumn28 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn28);
			}

			sb.append("|");

			if (newColumn29 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn29);
			}

			sb.append("|");

			if (newColumn30 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn30);
			}

			sb.append("|");

			if (newColumn31 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn31);
			}

			sb.append("|");

			if (newColumn32 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn32);
			}

			sb.append("|");

			if (newColumn33 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn33);
			}

			sb.append("|");

			if (newColumn34 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn34);
			}

			sb.append("|");

			if (newColumn35 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn35);
			}

			sb.append("|");

			if (newColumn36 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn36);
			}

			sb.append("|");

			if (newColumn37 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn37);
			}

			sb.append("|");

			if (newColumn38 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn38);
			}

			sb.append("|");

			if (newColumn39 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn39);
			}

			sb.append("|");

			if (newColumn40 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn40);
			}

			sb.append("|");

			if (newColumn41 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn41);
			}

			sb.append("|");

			if (newColumn42 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn42);
			}

			sb.append("|");

			if (newColumn43 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn43);
			}

			sb.append("|");

			if (newColumn44 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn44);
			}

			sb.append("|");

			if (newColumn45 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn45);
			}

			sb.append("|");

			if (newColumn46 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn46);
			}

			sb.append("|");

			if (newColumn47 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn47);
			}

			sb.append("|");

			if (newColumn48 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn48);
			}

			sb.append("|");

			if (newColumn49 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn49);
			}

			sb.append("|");

			if (newColumn50 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn50);
			}

			sb.append("|");

			if (newColumn51 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn51);
			}

			sb.append("|");

			if (newColumn52 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn52);
			}

			sb.append("|");

			if (newColumn53 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn53);
			}

			sb.append("|");

			if (newColumn54 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn54);
			}

			sb.append("|");

			if (newColumn55 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn55);
			}

			sb.append("|");

			if (newColumn56 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn56);
			}

			sb.append("|");

			if (newColumn57 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn57);
			}

			sb.append("|");

			if (newColumn58 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn58);
			}

			sb.append("|");

			if (newColumn59 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn59);
			}

			sb.append("|");

			if (newColumn60 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn60);
			}

			sb.append("|");

			if (newColumn61 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn61);
			}

			sb.append("|");

			if (newColumn62 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn62);
			}

			sb.append("|");

			if (newColumn63 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn63);
			}

			sb.append("|");

			if (newColumn64 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn64);
			}

			sb.append("|");

			if (newColumn65 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn65);
			}

			sb.append("|");

			if (newColumn66 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn66);
			}

			sb.append("|");

			if (newColumn67 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn67);
			}

			sb.append("|");

			if (newColumn68 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn68);
			}

			sb.append("|");

			if (newColumn69 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn69);
			}

			sb.append("|");

			if (newColumn70 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn70);
			}

			sb.append("|");

			if (newColumn71 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn71);
			}

			sb.append("|");

			if (newColumn72 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn72);
			}

			sb.append("|");

			if (newColumn73 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn73);
			}

			sb.append("|");

			if (newColumn74 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn74);
			}

			sb.append("|");

			if (newColumn75 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn75);
			}

			sb.append("|");

			if (newColumn76 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn76);
			}

			sb.append("|");

			if (newColumn77 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn77);
			}

			sb.append("|");

			if (newColumn78 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn78);
			}

			sb.append("|");

			if (newColumn79 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn79);
			}

			sb.append("|");

			if (newColumn80 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn80);
			}

			sb.append("|");

			if (newColumn81 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn81);
			}

			sb.append("|");

			if (newColumn82 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn82);
			}

			sb.append("|");

			if (newColumn83 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn83);
			}

			sb.append("|");

			if (newColumn84 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn84);
			}

			sb.append("|");

			if (newColumn85 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn85);
			}

			sb.append("|");

			if (newColumn86 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn86);
			}

			sb.append("|");

			if (newColumn87 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn87);
			}

			sb.append("|");

			if (newColumn88 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn88);
			}

			sb.append("|");

			if (newColumn89 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn89);
			}

			sb.append("|");

			if (newColumn90 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn90);
			}

			sb.append("|");

			if (newColumn91 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn91);
			}

			sb.append("|");

			if (newColumn92 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn92);
			}

			sb.append("|");

			if (newColumn93 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn93);
			}

			sb.append("|");

			if (newColumn94 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn94);
			}

			sb.append("|");

			if (newColumn95 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn95);
			}

			sb.append("|");

			if (newColumn96 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn96);
			}

			sb.append("|");

			if (newColumn97 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn97);
			}

			sb.append("|");

			if (newColumn98 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn98);
			}

			sb.append("|");

			if (newColumn99 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn99);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row8Struct other) {

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

	public static class row1Struct implements
			routines.system.IPersistableRow<row1Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[0];

		public String RULE_ID;

		public String getRULE_ID() {
			return this.RULE_ID;
		}

		public String HEADER;

		public String getHEADER() {
			return this.HEADER;
		}

		public String DATA;

		public String getDATA() {
			return this.DATA;
		}

		public String NOTIFY;

		public String getNOTIFY() {
			return this.NOTIFY;
		}

		public String EXEC_TIME;

		public String getEXEC_TIME() {
			return this.EXEC_TIME;
		}

		public String RULE_DESC;

		public String getRULE_DESC() {
			return this.RULE_DESC;
		}

		public String NOTIFY_SUCCESS;

		public String getNOTIFY_SUCCESS() {
			return this.NOTIFY_SUCCESS;
		}

		public String NOTIFY_ERROR;

		public String getNOTIFY_ERROR() {
			return this.NOTIFY_ERROR;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AP_UNIX_QA_Framework_Process_C2C,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C, 0,
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

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C) {

				try {

					int length = 0;

					this.RULE_ID = readString(dis);

					this.HEADER = readString(dis);

					this.DATA = readString(dis);

					this.NOTIFY = readString(dis);

					this.EXEC_TIME = readString(dis);

					this.RULE_DESC = readString(dis);

					this.NOTIFY_SUCCESS = readString(dis);

					this.NOTIFY_ERROR = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.RULE_ID, dos);

				// String

				writeString(this.HEADER, dos);

				// String

				writeString(this.DATA, dos);

				// String

				writeString(this.NOTIFY, dos);

				// String

				writeString(this.EXEC_TIME, dos);

				// String

				writeString(this.RULE_DESC, dos);

				// String

				writeString(this.NOTIFY_SUCCESS, dos);

				// String

				writeString(this.NOTIFY_ERROR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("RULE_ID=" + RULE_ID);
			sb.append(",HEADER=" + HEADER);
			sb.append(",DATA=" + DATA);
			sb.append(",NOTIFY=" + NOTIFY);
			sb.append(",EXEC_TIME=" + EXEC_TIME);
			sb.append(",RULE_DESC=" + RULE_DESC);
			sb.append(",NOTIFY_SUCCESS=" + NOTIFY_SUCCESS);
			sb.append(",NOTIFY_ERROR=" + NOTIFY_ERROR);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (RULE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(RULE_ID);
			}

			sb.append("|");

			if (HEADER == null) {
				sb.append("<null>");
			} else {
				sb.append(HEADER);
			}

			sb.append("|");

			if (DATA == null) {
				sb.append("<null>");
			} else {
				sb.append(DATA);
			}

			sb.append("|");

			if (NOTIFY == null) {
				sb.append("<null>");
			} else {
				sb.append(NOTIFY);
			}

			sb.append("|");

			if (EXEC_TIME == null) {
				sb.append("<null>");
			} else {
				sb.append(EXEC_TIME);
			}

			sb.append("|");

			if (RULE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(RULE_DESC);
			}

			sb.append("|");

			if (NOTIFY_SUCCESS == null) {
				sb.append("<null>");
			} else {
				sb.append(NOTIFY_SUCCESS);
			}

			sb.append("|");

			if (NOTIFY_ERROR == null) {
				sb.append("<null>");
			} else {
				sb.append(NOTIFY_ERROR);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row1Struct other) {

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

	public void tOracleInput_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_1_SUBPROCESS_STATE", 0);

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

				row1Struct row1 = new row1Struct();
				row8Struct row8 = new row8Struct();

				/**
				 * [tFlowToIterate_1 begin ] start
				 */

				int NB_ITERATE_tOracleInput_4 = 0; // for statistics

				ok_Hash.put("tFlowToIterate_1", false);
				start_Hash.put("tFlowToIterate_1", System.currentTimeMillis());

				currentComponent = "tFlowToIterate_1";

				int tos_count_tFlowToIterate_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFlowToIterate_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFlowToIterate_1 = new StringBuilder();
				log4jParamters_tFlowToIterate_1.append("Parameters:");
				log4jParamters_tFlowToIterate_1.append("DEFAULT_MAP" + " = "
						+ "true");
				log4jParamters_tFlowToIterate_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFlowToIterate_1 - "
							+ log4jParamters_tFlowToIterate_1);

				int nb_line_tFlowToIterate_1 = 0;
				int counter_tFlowToIterate_1 = 0;

				/**
				 * [tFlowToIterate_1 begin ] stop
				 */

				/**
				 * [tOracleInput_1 begin ] start
				 */

				ok_Hash.put("tOracleInput_1", false);
				start_Hash.put("tOracleInput_1", System.currentTimeMillis());

				currentComponent = "tOracleInput_1";

				int tos_count_tOracleInput_1 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_1 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_1 = new StringBuilder();
				log4jParamters_tOracleInput_1.append("Parameters:");
				log4jParamters_tOracleInput_1.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("TABLE" + " = "
						+ "\"metadata\"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1
						.append("QUERY"
								+ " = "
								+ "\"  SELECT  SQ.RULE_ID, HEADER_SQL,DATA_SQL,NVL(NOTIFY,'N'),TO_CHAR(EXEC_TIME,'MM/DD/YYYY HH:MI:SS AM'),RULE_DESC,NVL(NOTIFY_SUCCESS,'N'),NVL(NOTIFY_ERROR,'N') FROM QA_SQL SQ  INNER JOIN QA_BUSINESS_RULES BR  	ON SQ.RULE_ID = BR.RULE_ID  WHERE COMP_TYPE = 'C2C'  \"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("RULE_ID") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("HEADER") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("DATA")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("NOTIFY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EXEC_TIME") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("RULE_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("NOTIFY_SUCCESS") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("NOTIFY_ERROR") + "}]");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_1 - "
							+ log4jParamters_tOracleInput_1);

				int nb_line_tOracleInput_1 = 0;
				java.sql.Connection conn_tOracleInput_1 = null;
				String driverClass_tOracleInput_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_1);

				String url_tOracleInput_1 = null;
				url_tOracleInput_1 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_1 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_1 = context.dbPasswordPI;

				String dbPwd_tOracleInput_1 = decryptedPassword_tOracleInput_1;

				log.debug("tOracleInput_1 - Driver ClassName: "
						+ driverClass_tOracleInput_1 + ".");

				log.info("tOracleInput_1 - Connection attempt to '"
						+ url_tOracleInput_1 + "' with the username '"
						+ dbUser_tOracleInput_1 + "'.");

				conn_tOracleInput_1 = java.sql.DriverManager.getConnection(
						url_tOracleInput_1, dbUser_tOracleInput_1,
						dbPwd_tOracleInput_1);
				log.info("tOracleInput_1 - Connection to '"
						+ url_tOracleInput_1 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_1 = conn_tOracleInput_1
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_1 = stmtGetTZ_tOracleInput_1
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_1 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_1.next()) {
					sessionTimezone_tOracleInput_1 = rsGetTZ_tOracleInput_1
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_1)
						.setSessionTimeZone(sessionTimezone_tOracleInput_1);

				java.sql.Statement stmt_tOracleInput_1 = conn_tOracleInput_1
						.createStatement();

				String dbquery_tOracleInput_1 = "\nSELECT  SQ.RULE_ID, HEADER_SQL,DATA_SQL,NVL(NOTIFY,'N'),TO_CHAR(EXEC_TIME,'MM/DD/YYYY HH:MI:SS AM'),RULE_DESC,NVL(NOTIFY_SUCCESS,'N'),NVL(NOTIFY_ERROR,'N') FROM QA_SQL SQ\nINNER JOIN QA_BUSINESS_RULES BR\n	ON SQ.RULE_ID = BR.RULE_ID\nWHERE COMP_TYPE = 'C2C'\n";

				log.info("tOracleInput_1 - Executing the query: '"
						+ dbquery_tOracleInput_1 + "'.");

				globalMap.put("tOracleInput_1_QUERY", dbquery_tOracleInput_1);

				java.sql.ResultSet rs_tOracleInput_1 = null;
				try {
					rs_tOracleInput_1 = stmt_tOracleInput_1
							.executeQuery(dbquery_tOracleInput_1);
					java.sql.ResultSetMetaData rsmd_tOracleInput_1 = rs_tOracleInput_1
							.getMetaData();
					int colQtyInRs_tOracleInput_1 = rsmd_tOracleInput_1
							.getColumnCount();

					String tmpContent_tOracleInput_1 = null;

					log.info("tOracleInput_1 - Retrieving records from the database.");

					while (rs_tOracleInput_1.next()) {
						nb_line_tOracleInput_1++;

						if (colQtyInRs_tOracleInput_1 < 1) {
							row1.RULE_ID = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(1);
							if (tmpContent_tOracleInput_1 != null) {
								row1.RULE_ID = tmpContent_tOracleInput_1;
							} else {
								row1.RULE_ID = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 2) {
							row1.HEADER = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(2);
							if (tmpContent_tOracleInput_1 != null) {
								row1.HEADER = tmpContent_tOracleInput_1;
							} else {
								row1.HEADER = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 3) {
							row1.DATA = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(3);
							if (tmpContent_tOracleInput_1 != null) {
								row1.DATA = tmpContent_tOracleInput_1;
							} else {
								row1.DATA = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 4) {
							row1.NOTIFY = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(4);
							if (tmpContent_tOracleInput_1 != null) {
								row1.NOTIFY = tmpContent_tOracleInput_1;
							} else {
								row1.NOTIFY = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 5) {
							row1.EXEC_TIME = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(5);
							if (tmpContent_tOracleInput_1 != null) {
								row1.EXEC_TIME = tmpContent_tOracleInput_1;
							} else {
								row1.EXEC_TIME = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 6) {
							row1.RULE_DESC = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(6);
							if (tmpContent_tOracleInput_1 != null) {
								row1.RULE_DESC = tmpContent_tOracleInput_1;
							} else {
								row1.RULE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 7) {
							row1.NOTIFY_SUCCESS = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(7);
							if (tmpContent_tOracleInput_1 != null) {
								row1.NOTIFY_SUCCESS = tmpContent_tOracleInput_1;
							} else {
								row1.NOTIFY_SUCCESS = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 8) {
							row1.NOTIFY_ERROR = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(8);
							if (tmpContent_tOracleInput_1 != null) {
								row1.NOTIFY_ERROR = tmpContent_tOracleInput_1;
							} else {
								row1.NOTIFY_ERROR = null;
							}
						}

						log.debug("tOracleInput_1 - Retrieving the record "
								+ nb_line_tOracleInput_1 + ".");

						/**
						 * [tOracleInput_1 begin ] stop
						 */

						/**
						 * [tOracleInput_1 main ] start
						 */

						currentComponent = "tOracleInput_1";

						tos_count_tOracleInput_1++;

						/**
						 * [tOracleInput_1 main ] stop
						 */

						/**
						 * [tFlowToIterate_1 main ] start
						 */

						currentComponent = "tFlowToIterate_1";

						if (log.isTraceEnabled()) {
							log.trace("row1 - "
									+ (row1 == null ? "" : row1.toLogString()));
						}

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.RULE_ID, value="
									+ row1.RULE_ID + ".");
						globalMap.put("row1.RULE_ID", row1.RULE_ID);
						nb_line_tFlowToIterate_1++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.HEADER, value="
									+ row1.HEADER + ".");
						globalMap.put("row1.HEADER", row1.HEADER);
						nb_line_tFlowToIterate_1++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.DATA, value="
									+ row1.DATA + ".");
						globalMap.put("row1.DATA", row1.DATA);
						nb_line_tFlowToIterate_1++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.NOTIFY, value="
									+ row1.NOTIFY + ".");
						globalMap.put("row1.NOTIFY", row1.NOTIFY);
						nb_line_tFlowToIterate_1++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.EXEC_TIME, value="
									+ row1.EXEC_TIME + ".");
						globalMap.put("row1.EXEC_TIME", row1.EXEC_TIME);
						nb_line_tFlowToIterate_1++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.RULE_DESC, value="
									+ row1.RULE_DESC + ".");
						globalMap.put("row1.RULE_DESC", row1.RULE_DESC);
						nb_line_tFlowToIterate_1++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.NOTIFY_SUCCESS, value="
									+ row1.NOTIFY_SUCCESS + ".");
						globalMap.put("row1.NOTIFY_SUCCESS",
								row1.NOTIFY_SUCCESS);
						nb_line_tFlowToIterate_1++;

						if (log.isTraceEnabled())
							log.trace("tFlowToIterate_1 - "
									+ "Set global var, key=row1.NOTIFY_ERROR, value="
									+ row1.NOTIFY_ERROR + ".");
						globalMap.put("row1.NOTIFY_ERROR", row1.NOTIFY_ERROR);
						nb_line_tFlowToIterate_1++;

						counter_tFlowToIterate_1++;
						if (log.isDebugEnabled())
							log.debug("tFlowToIterate_1 - "
									+ "Current iteration is: "
									+ counter_tFlowToIterate_1 + ".");
						globalMap.put("tFlowToIterate_1_CURRENT_ITERATION",
								counter_tFlowToIterate_1);

						tos_count_tFlowToIterate_1++;

						/**
						 * [tFlowToIterate_1 main ] stop
						 */
						NB_ITERATE_tOracleInput_4++;

						/**
						 * [tFileOutputDelimited_1 begin ] start
						 */

						ok_Hash.put("tFileOutputDelimited_1", false);
						start_Hash.put("tFileOutputDelimited_1",
								System.currentTimeMillis());

						currentComponent = "tFileOutputDelimited_1";

						int tos_count_tFileOutputDelimited_1 = 0;

						if (log.isInfoEnabled())
							log.info("tFileOutputDelimited_1 - "
									+ "Start to work.");
						StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
						log4jParamters_tFileOutputDelimited_1
								.append("Parameters:");
						log4jParamters_tFileOutputDelimited_1
								.append("USESTREAM" + " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("FILENAME"
										+ " = "
										+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Quality_Assurance/\"+((String)globalMap.get(\"row1.RULE_DESC\"))+\"_\"+((String)globalMap.get(\"row1.RULE_ID\"))+\"/\"+context.reportMonth+\"/Rule_\"+((String)globalMap.get(\"row1.RULE_ID\"))+\"_QAReportResults.csv\"");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("ROWSEPARATOR" + " = " + "\"\\r\\n\"");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("FIELDSEPARATOR" + " = " + "\",\"");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1.append("APPEND"
								+ " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("INCLUDEHEADER" + " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1.append("COMPRESS"
								+ " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("ADVANCED_SEPARATOR" + " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("CSV_OPTION" + " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1.append("CREATE"
								+ " = " + "true");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1.append("SPLIT"
								+ " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("FLUSHONROW" + " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1.append("ROW_MODE"
								+ " = " + "false");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1.append("ENCODING"
								+ " = " + "\"ISO-8859-15\"");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						log4jParamters_tFileOutputDelimited_1
								.append("DELETE_EMPTYFILE" + " = " + "true");
						log4jParamters_tFileOutputDelimited_1.append(" | ");
						if (log.isDebugEnabled())
							log.debug("tFileOutputDelimited_1 - "
									+ log4jParamters_tFileOutputDelimited_1);

						String fileName_tFileOutputDelimited_1 = "";
						class FileOutputDelimitedUtil_tFileOutputDelimited_1 {
							public void putValue_0(
									final row8Struct row8,
									StringBuilder sb_tFileOutputDelimited_1,
									final String OUT_DELIM_tFileOutputDelimited_1)
									throws java.lang.Exception {
								if (row8.newColumn != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn1 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn1);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn2 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn2);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn3 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn3);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn4 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn4);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn5 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn5);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn6 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn6);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn7 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn7);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn8 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn8);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn9 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn9);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn10 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn10);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn11 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn11);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn12 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn12);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn13 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn13);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn14 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn14);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn15 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn15);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn16 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn16);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn17 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn17);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn18 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn18);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn19 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn19);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn20 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn20);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn21 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn21);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn22 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn22);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn23 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn23);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn24 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn24);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn25 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn25);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn26 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn26);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn27 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn27);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn28 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn28);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn29 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn29);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn30 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn30);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn31 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn31);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn32 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn32);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn33 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn33);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn34 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn34);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn35 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn35);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn36 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn36);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn37 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn37);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn38 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn38);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn39 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn39);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn40 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn40);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn41 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn41);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn42 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn42);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn43 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn43);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn44 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn44);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn45 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn45);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn46 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn46);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn47 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn47);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn48 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn48);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn49 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn49);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn50 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn50);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn51 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn51);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn52 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn52);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn53 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn53);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn54 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn54);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn55 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn55);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn56 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn56);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn57 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn57);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn58 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn58);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn59 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn59);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn60 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn60);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn61 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn61);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn62 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn62);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn63 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn63);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn64 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn64);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn65 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn65);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn66 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn66);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn67 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn67);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn68 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn68);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn69 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn69);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn70 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn70);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn71 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn71);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn72 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn72);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn73 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn73);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn74 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn74);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn75 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn75);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn76 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn76);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn77 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn77);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn78 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn78);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn79 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn79);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn80 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn80);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn81 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn81);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn82 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn82);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn83 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn83);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn84 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn84);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn85 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn85);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn86 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn86);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn87 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn87);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn88 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn88);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn89 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn89);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
							}

							public void putValue_1(
									final row8Struct row8,
									StringBuilder sb_tFileOutputDelimited_1,
									final String OUT_DELIM_tFileOutputDelimited_1)
									throws java.lang.Exception {
								if (row8.newColumn90 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn90);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn91 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn91);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn92 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn92);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn93 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn93);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn94 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn94);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn95 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn95);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn96 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn96);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn97 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn97);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn98 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn98);
								}
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_tFileOutputDelimited_1);
								if (row8.newColumn99 != null) {
									sb_tFileOutputDelimited_1
											.append(row8.newColumn99);
								}
							}
						}
						FileOutputDelimitedUtil_tFileOutputDelimited_1 fileOutputDelimitedUtil_tFileOutputDelimited_1 = new FileOutputDelimitedUtil_tFileOutputDelimited_1();
						fileName_tFileOutputDelimited_1 = (new java.io.File(
								context.shipping
										+ "/"
										+ context.reportYear
										+ context.mDrive
										+ "/Quality_Assurance/"
										+ ((String) globalMap
												.get("row1.RULE_DESC"))
										+ "_"
										+ ((String) globalMap
												.get("row1.RULE_ID"))
										+ "/"
										+ context.reportMonth
										+ "/Rule_"
										+ ((String) globalMap
												.get("row1.RULE_ID"))
										+ "_QAReportResults.csv"))
								.getAbsolutePath().replace("\\", "/");
						String fullName_tFileOutputDelimited_1 = null;
						String extension_tFileOutputDelimited_1 = null;
						String directory_tFileOutputDelimited_1 = null;
						if ((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
							if (fileName_tFileOutputDelimited_1
									.lastIndexOf(".") < fileName_tFileOutputDelimited_1
									.lastIndexOf("/")) {
								fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
								extension_tFileOutputDelimited_1 = "";
							} else {
								fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
										.substring(0,
												fileName_tFileOutputDelimited_1
														.lastIndexOf("."));
								extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
										.substring(fileName_tFileOutputDelimited_1
												.lastIndexOf("."));
							}
							directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
									.substring(0,
											fileName_tFileOutputDelimited_1
													.lastIndexOf("/"));
						} else {
							if (fileName_tFileOutputDelimited_1
									.lastIndexOf(".") != -1) {
								fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
										.substring(0,
												fileName_tFileOutputDelimited_1
														.lastIndexOf("."));
								extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
										.substring(fileName_tFileOutputDelimited_1
												.lastIndexOf("."));
							} else {
								fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
								extension_tFileOutputDelimited_1 = "";
							}
							directory_tFileOutputDelimited_1 = "";
						}
						boolean isFileGenerated_tFileOutputDelimited_1 = true;
						java.io.File filetFileOutputDelimited_1 = new java.io.File(
								fileName_tFileOutputDelimited_1);
						globalMap.put("tFileOutputDelimited_1_FILE_NAME",
								fileName_tFileOutputDelimited_1);
						int nb_line_tFileOutputDelimited_1 = 0;
						int splitEvery_tFileOutputDelimited_1 = 1000;
						int splitedFileNo_tFileOutputDelimited_1 = 0;
						int currentRow_tFileOutputDelimited_1 = 0;

						final String OUT_DELIM_tFileOutputDelimited_1 = /**
						 * Start
						 * field tFileOutputDelimited_1:FIELDSEPARATOR
						 */
						","/** End field tFileOutputDelimited_1:FIELDSEPARATOR */
						;

						final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /**
						 * 
						 * Start field tFileOutputDelimited_1:ROWSEPARATOR
						 */
						"\r\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */
						;

						// create directory only if not exists
						if (directory_tFileOutputDelimited_1 != null
								&& directory_tFileOutputDelimited_1.trim()
										.length() != 0) {
							java.io.File dir_tFileOutputDelimited_1 = new java.io.File(
									directory_tFileOutputDelimited_1);
							if (!dir_tFileOutputDelimited_1.exists()) {
								log.info("tFileOutputDelimited_1 - Creating directory '"
										+ dir_tFileOutputDelimited_1
												.getCanonicalPath() + "'.");
								dir_tFileOutputDelimited_1.mkdirs();
								log.info("tFileOutputDelimited_1 - The directory '"
										+ dir_tFileOutputDelimited_1
												.getCanonicalPath()
										+ "' has been created successfully.");
							}
						}

						// routines.system.Row
						java.io.Writer outtFileOutputDelimited_1 = null;

						java.io.File fileToDelete_tFileOutputDelimited_1 = new java.io.File(
								fileName_tFileOutputDelimited_1);
						if (fileToDelete_tFileOutputDelimited_1.exists()) {
							fileToDelete_tFileOutputDelimited_1.delete();
						}
						outtFileOutputDelimited_1 = new java.io.BufferedWriter(
								new java.io.OutputStreamWriter(
										new java.io.FileOutputStream(
												fileName_tFileOutputDelimited_1,
												false), "ISO-8859-15"));

						resourceMap.put("out_tFileOutputDelimited_1",
								outtFileOutputDelimited_1);
						resourceMap.put("nb_line_tFileOutputDelimited_1",
								nb_line_tFileOutputDelimited_1);
						resourceMap.put(
								"isFileGenerated_tFileOutputDelimited_1",
								isFileGenerated_tFileOutputDelimited_1);
						resourceMap.put("filetFileOutputDelimited_1",
								filetFileOutputDelimited_1);

						/**
						 * [tFileOutputDelimited_1 begin ] stop
						 */

						/**
						 * [tOracleInput_4 begin ] start
						 */

						ok_Hash.put("tOracleInput_4", false);
						start_Hash.put("tOracleInput_4",
								System.currentTimeMillis());

						currentComponent = "tOracleInput_4";

						int tos_count_tOracleInput_4 = 0;

						if (log.isInfoEnabled())
							log.info("tOracleInput_4 - " + "Start to work.");
						StringBuilder log4jParamters_tOracleInput_4 = new StringBuilder();
						log4jParamters_tOracleInput_4.append("Parameters:");
						log4jParamters_tOracleInput_4
								.append("USE_EXISTING_CONNECTION" + " = "
										+ "false");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("CONNECTION_TYPE"
								+ " = " + "ORACLE_SERVICE_NAME");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("DB_VERSION"
								+ " = " + "ORACLE_11");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("HOST" + " = "
								+ "context.dbHostNamePI");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("PORT" + " = "
								+ "\"1521\"");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("DBNAME" + " = "
								+ "context.dbNamePI");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("SCHEMA_DB"
								+ " = " + "context.dbSchemaPI");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("USER" + " = "
								+ "context.dbUserPI");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4
								.append("PASS"
										+ " = "
										+ String.valueOf(
												routines.system.PasswordEncryptUtil
														.encryptPassword(context.dbPasswordPI))
												.substring(0, 4) + "...");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("TABLE" + " = "
								+ "\"metadata\"");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("QUERYSTORE"
								+ " = " + "\"\"");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("QUERY" + " = "
								+ "((String)globalMap.get(\"row1.HEADER\"))");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4
								.append("SPECIFY_DATASOURCE_ALIAS" + " = "
										+ "false");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("PROPERTIES"
								+ " = " + "\"\"");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4
								.append("IS_CONVERT_XMLTYPE" + " = " + "false");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("USE_CURSOR"
								+ " = " + "false");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("TRIM_ALL_COLUMN"
								+ " = " + "false");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("TRIM_COLUMN"
								+ " = " + "[{TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn1") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn2")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn3") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn4")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn5") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn6")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn7") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn8")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn9") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn10")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn11") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn12")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn13") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn14")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn15") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn16")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn17") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn18")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn19") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn20")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn21") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn22")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn23") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn24")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn25") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn26")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn27") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn28")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn29") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn30")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn31") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn32")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn33") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn34")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn35") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn36")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn37") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn38")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn39") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn40")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn41") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn42")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn43") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn44")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn45") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn46")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn47") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn48")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn49") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn50")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn51") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn52")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn53") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn54")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn55") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn56")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn57") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn58")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn59") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn60")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn61") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn62")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn63") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn64")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn65") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn66")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn67") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn68")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn69") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn70")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn71") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn72")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn73") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn74")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn75") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn76")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn77") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn78")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn79") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn80")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn81") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn82")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn83") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn84")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn85") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn86")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn87") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn88")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn89") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn90")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn91") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn92")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn93") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn94")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn95") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn96")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn97") + "}, {TRIM=" + ("false")
								+ ", SCHEMA_COLUMN=" + ("newColumn98")
								+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
								+ ("newColumn99") + "}]");
						log4jParamters_tOracleInput_4.append(" | ");
						log4jParamters_tOracleInput_4.append("NO_NULL_VALUES"
								+ " = " + "false");
						log4jParamters_tOracleInput_4.append(" | ");
						if (log.isDebugEnabled())
							log.debug("tOracleInput_4 - "
									+ log4jParamters_tOracleInput_4);

						int nb_line_tOracleInput_4 = 0;
						java.sql.Connection conn_tOracleInput_4 = null;
						String driverClass_tOracleInput_4 = "oracle.jdbc.OracleDriver";
						java.lang.Class.forName(driverClass_tOracleInput_4);

						String url_tOracleInput_4 = null;
						url_tOracleInput_4 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
								+ context.dbHostNamePI
								+ ")(port="
								+ "1521"
								+ "))(connect_data=(service_name="
								+ context.dbNamePI + ")))";

						String dbUser_tOracleInput_4 = context.dbUserPI;

						final String decryptedPassword_tOracleInput_4 = context.dbPasswordPI;

						String dbPwd_tOracleInput_4 = decryptedPassword_tOracleInput_4;

						log.debug("tOracleInput_4 - Driver ClassName: "
								+ driverClass_tOracleInput_4 + ".");

						log.info("tOracleInput_4 - Connection attempt to '"
								+ url_tOracleInput_4 + "' with the username '"
								+ dbUser_tOracleInput_4 + "'.");

						conn_tOracleInput_4 = java.sql.DriverManager
								.getConnection(url_tOracleInput_4,
										dbUser_tOracleInput_4,
										dbPwd_tOracleInput_4);
						log.info("tOracleInput_4 - Connection to '"
								+ url_tOracleInput_4 + "' has succeeded.");

						java.sql.Statement stmtGetTZ_tOracleInput_4 = conn_tOracleInput_4
								.createStatement();
						java.sql.ResultSet rsGetTZ_tOracleInput_4 = stmtGetTZ_tOracleInput_4
								.executeQuery("select sessiontimezone from dual");
						String sessionTimezone_tOracleInput_4 = java.util.TimeZone
								.getDefault().getID();
						while (rsGetTZ_tOracleInput_4.next()) {
							sessionTimezone_tOracleInput_4 = rsGetTZ_tOracleInput_4
									.getString(1);
						}
						((oracle.jdbc.OracleConnection) conn_tOracleInput_4)
								.setSessionTimeZone(sessionTimezone_tOracleInput_4);

						java.sql.Statement stmt_tOracleInput_4 = conn_tOracleInput_4
								.createStatement();

						String dbquery_tOracleInput_4 = ((String) globalMap
								.get("row1.HEADER"));

						log.info("tOracleInput_4 - Executing the query: '"
								+ dbquery_tOracleInput_4 + "'.");

						globalMap.put("tOracleInput_4_QUERY",
								dbquery_tOracleInput_4);

						java.sql.ResultSet rs_tOracleInput_4 = null;
						try {
							rs_tOracleInput_4 = stmt_tOracleInput_4
									.executeQuery(dbquery_tOracleInput_4);
							java.sql.ResultSetMetaData rsmd_tOracleInput_4 = rs_tOracleInput_4
									.getMetaData();
							int colQtyInRs_tOracleInput_4 = rsmd_tOracleInput_4
									.getColumnCount();

							String tmpContent_tOracleInput_4 = null;

							log.info("tOracleInput_4 - Retrieving records from the database.");

							while (rs_tOracleInput_4.next()) {
								nb_line_tOracleInput_4++;

								if (colQtyInRs_tOracleInput_4 < 1) {
									row8.newColumn = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(1);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 2) {
									row8.newColumn1 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(2);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn1 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn1 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 3) {
									row8.newColumn2 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(3);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn2 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn2 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 4) {
									row8.newColumn3 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(4);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn3 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn3 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 5) {
									row8.newColumn4 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(5);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn4 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn4 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 6) {
									row8.newColumn5 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(6);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn5 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn5 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 7) {
									row8.newColumn6 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(7);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn6 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn6 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 8) {
									row8.newColumn7 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(8);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn7 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn7 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 9) {
									row8.newColumn8 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(9);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn8 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn8 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 10) {
									row8.newColumn9 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(10);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn9 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn9 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 11) {
									row8.newColumn10 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(11);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn10 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn10 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 12) {
									row8.newColumn11 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(12);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn11 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn11 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 13) {
									row8.newColumn12 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(13);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn12 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn12 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 14) {
									row8.newColumn13 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(14);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn13 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn13 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 15) {
									row8.newColumn14 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(15);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn14 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn14 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 16) {
									row8.newColumn15 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(16);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn15 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn15 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 17) {
									row8.newColumn16 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(17);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn16 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn16 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 18) {
									row8.newColumn17 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(18);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn17 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn17 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 19) {
									row8.newColumn18 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(19);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn18 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn18 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 20) {
									row8.newColumn19 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(20);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn19 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn19 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 21) {
									row8.newColumn20 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(21);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn20 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn20 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 22) {
									row8.newColumn21 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(22);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn21 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn21 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 23) {
									row8.newColumn22 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(23);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn22 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn22 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 24) {
									row8.newColumn23 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(24);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn23 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn23 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 25) {
									row8.newColumn24 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(25);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn24 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn24 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 26) {
									row8.newColumn25 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(26);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn25 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn25 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 27) {
									row8.newColumn26 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(27);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn26 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn26 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 28) {
									row8.newColumn27 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(28);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn27 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn27 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 29) {
									row8.newColumn28 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(29);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn28 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn28 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 30) {
									row8.newColumn29 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(30);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn29 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn29 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 31) {
									row8.newColumn30 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(31);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn30 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn30 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 32) {
									row8.newColumn31 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(32);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn31 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn31 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 33) {
									row8.newColumn32 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(33);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn32 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn32 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 34) {
									row8.newColumn33 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(34);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn33 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn33 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 35) {
									row8.newColumn34 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(35);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn34 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn34 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 36) {
									row8.newColumn35 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(36);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn35 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn35 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 37) {
									row8.newColumn36 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(37);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn36 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn36 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 38) {
									row8.newColumn37 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(38);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn37 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn37 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 39) {
									row8.newColumn38 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(39);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn38 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn38 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 40) {
									row8.newColumn39 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(40);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn39 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn39 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 41) {
									row8.newColumn40 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(41);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn40 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn40 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 42) {
									row8.newColumn41 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(42);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn41 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn41 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 43) {
									row8.newColumn42 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(43);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn42 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn42 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 44) {
									row8.newColumn43 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(44);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn43 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn43 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 45) {
									row8.newColumn44 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(45);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn44 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn44 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 46) {
									row8.newColumn45 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(46);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn45 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn45 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 47) {
									row8.newColumn46 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(47);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn46 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn46 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 48) {
									row8.newColumn47 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(48);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn47 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn47 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 49) {
									row8.newColumn48 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(49);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn48 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn48 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 50) {
									row8.newColumn49 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(50);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn49 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn49 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 51) {
									row8.newColumn50 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(51);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn50 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn50 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 52) {
									row8.newColumn51 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(52);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn51 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn51 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 53) {
									row8.newColumn52 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(53);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn52 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn52 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 54) {
									row8.newColumn53 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(54);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn53 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn53 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 55) {
									row8.newColumn54 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(55);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn54 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn54 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 56) {
									row8.newColumn55 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(56);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn55 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn55 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 57) {
									row8.newColumn56 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(57);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn56 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn56 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 58) {
									row8.newColumn57 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(58);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn57 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn57 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 59) {
									row8.newColumn58 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(59);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn58 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn58 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 60) {
									row8.newColumn59 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(60);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn59 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn59 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 61) {
									row8.newColumn60 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(61);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn60 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn60 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 62) {
									row8.newColumn61 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(62);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn61 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn61 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 63) {
									row8.newColumn62 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(63);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn62 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn62 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 64) {
									row8.newColumn63 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(64);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn63 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn63 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 65) {
									row8.newColumn64 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(65);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn64 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn64 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 66) {
									row8.newColumn65 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(66);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn65 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn65 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 67) {
									row8.newColumn66 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(67);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn66 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn66 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 68) {
									row8.newColumn67 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(68);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn67 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn67 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 69) {
									row8.newColumn68 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(69);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn68 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn68 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 70) {
									row8.newColumn69 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(70);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn69 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn69 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 71) {
									row8.newColumn70 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(71);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn70 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn70 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 72) {
									row8.newColumn71 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(72);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn71 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn71 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 73) {
									row8.newColumn72 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(73);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn72 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn72 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 74) {
									row8.newColumn73 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(74);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn73 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn73 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 75) {
									row8.newColumn74 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(75);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn74 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn74 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 76) {
									row8.newColumn75 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(76);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn75 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn75 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 77) {
									row8.newColumn76 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(77);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn76 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn76 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 78) {
									row8.newColumn77 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(78);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn77 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn77 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 79) {
									row8.newColumn78 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(79);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn78 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn78 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 80) {
									row8.newColumn79 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(80);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn79 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn79 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 81) {
									row8.newColumn80 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(81);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn80 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn80 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 82) {
									row8.newColumn81 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(82);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn81 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn81 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 83) {
									row8.newColumn82 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(83);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn82 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn82 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 84) {
									row8.newColumn83 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(84);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn83 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn83 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 85) {
									row8.newColumn84 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(85);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn84 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn84 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 86) {
									row8.newColumn85 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(86);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn85 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn85 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 87) {
									row8.newColumn86 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(87);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn86 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn86 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 88) {
									row8.newColumn87 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(88);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn87 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn87 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 89) {
									row8.newColumn88 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(89);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn88 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn88 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 90) {
									row8.newColumn89 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(90);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn89 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn89 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 91) {
									row8.newColumn90 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(91);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn90 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn90 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 92) {
									row8.newColumn91 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(92);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn91 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn91 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 93) {
									row8.newColumn92 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(93);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn92 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn92 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 94) {
									row8.newColumn93 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(94);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn93 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn93 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 95) {
									row8.newColumn94 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(95);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn94 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn94 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 96) {
									row8.newColumn95 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(96);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn95 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn95 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 97) {
									row8.newColumn96 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(97);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn96 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn96 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 98) {
									row8.newColumn97 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(98);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn97 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn97 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 99) {
									row8.newColumn98 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(99);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn98 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn98 = null;
									}
								}
								if (colQtyInRs_tOracleInput_4 < 100) {
									row8.newColumn99 = null;
								} else {

									tmpContent_tOracleInput_4 = rs_tOracleInput_4
											.getString(100);
									if (tmpContent_tOracleInput_4 != null) {
										row8.newColumn99 = tmpContent_tOracleInput_4;
									} else {
										row8.newColumn99 = null;
									}
								}

								log.debug("tOracleInput_4 - Retrieving the record "
										+ nb_line_tOracleInput_4 + ".");

								/**
								 * [tOracleInput_4 begin ] stop
								 */

								/**
								 * [tOracleInput_4 main ] start
								 */

								currentComponent = "tOracleInput_4";

								tos_count_tOracleInput_4++;

								/**
								 * [tOracleInput_4 main ] stop
								 */

								/**
								 * [tFileOutputDelimited_1 main ] start
								 */

								currentComponent = "tFileOutputDelimited_1";

								if (log.isTraceEnabled()) {
									log.trace("row8 - "
											+ (row8 == null ? "" : row8
													.toLogString()));
								}

								StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
								fileOutputDelimitedUtil_tFileOutputDelimited_1
										.putValue_0(row8,
												sb_tFileOutputDelimited_1,
												OUT_DELIM_tFileOutputDelimited_1);
								fileOutputDelimitedUtil_tFileOutputDelimited_1
										.putValue_1(row8,
												sb_tFileOutputDelimited_1,
												OUT_DELIM_tFileOutputDelimited_1);
								sb_tFileOutputDelimited_1
										.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);

								synchronized (multiThreadLockWrite) {
									nb_line_tFileOutputDelimited_1++;
									resourceMap.put(
											"nb_line_tFileOutputDelimited_1",
											nb_line_tFileOutputDelimited_1);

									outtFileOutputDelimited_1
											.write(sb_tFileOutputDelimited_1
													.toString());
									log.debug("tFileOutputDelimited_1 - Writing the record "
											+ nb_line_tFileOutputDelimited_1
											+ ".");

								}

								tos_count_tFileOutputDelimited_1++;

								/**
								 * [tFileOutputDelimited_1 main ] stop
								 */

								/**
								 * [tOracleInput_4 end ] start
								 */

								currentComponent = "tOracleInput_4";

							}
						} finally {
							stmt_tOracleInput_4.close();

							if (conn_tOracleInput_4 != null
									&& !conn_tOracleInput_4.isClosed()) {

								log.info("tOracleInput_4 - Closing the connection to the database.");

								conn_tOracleInput_4.close();

								log.info("tOracleInput_4 - Connection to the database closed.");

							}

						}

						globalMap.put("tOracleInput_4_NB_LINE",
								nb_line_tOracleInput_4);
						log.info("tOracleInput_4 - Retrieved records count: "
								+ nb_line_tOracleInput_4 + " .");

						if (log.isInfoEnabled())
							log.info("tOracleInput_4 - " + "Done.");

						ok_Hash.put("tOracleInput_4", true);
						end_Hash.put("tOracleInput_4",
								System.currentTimeMillis());

						/**
						 * [tOracleInput_4 end ] stop
						 */

						/**
						 * [tFileOutputDelimited_1 end ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						synchronized (multiThreadLockWrite) {

							if (outtFileOutputDelimited_1 != null) {
								outtFileOutputDelimited_1.flush();
								outtFileOutputDelimited_1.close();
							}

							globalMap.put("tFileOutputDelimited_1_NB_LINE",
									nb_line_tFileOutputDelimited_1);
							globalMap.put("tFileOutputDelimited_1_FILE_NAME",
									fileName_tFileOutputDelimited_1);

						}

						if (isFileGenerated_tFileOutputDelimited_1
								&& nb_line_tFileOutputDelimited_1 == 0) {

							filetFileOutputDelimited_1.delete();

						}

						resourceMap.put("finish_tFileOutputDelimited_1", true);

						log.info("tFileOutputDelimited_1 - Written records count: "
								+ nb_line_tFileOutputDelimited_1 + " .");

						if (log.isInfoEnabled())
							log.info("tFileOutputDelimited_1 - " + "Done.");

						ok_Hash.put("tFileOutputDelimited_1", true);
						end_Hash.put("tFileOutputDelimited_1",
								System.currentTimeMillis());

						tOracleInput_5Process(globalMap);

						/**
						 * [tFileOutputDelimited_1 end ] stop
						 */

						/**
						 * [tOracleInput_1 end ] start
						 */

						currentComponent = "tOracleInput_1";

					}
				} finally {
					stmt_tOracleInput_1.close();

					if (conn_tOracleInput_1 != null
							&& !conn_tOracleInput_1.isClosed()) {

						log.info("tOracleInput_1 - Closing the connection to the database.");

						conn_tOracleInput_1.close();

						log.info("tOracleInput_1 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_1_NB_LINE", nb_line_tOracleInput_1);
				log.info("tOracleInput_1 - Retrieved records count: "
						+ nb_line_tOracleInput_1 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_1 - " + "Done.");

				ok_Hash.put("tOracleInput_1", true);
				end_Hash.put("tOracleInput_1", System.currentTimeMillis());

				/**
				 * [tOracleInput_1 end ] stop
				 */

				/**
				 * [tFlowToIterate_1 end ] start
				 */

				currentComponent = "tFlowToIterate_1";

				globalMap.put("tFlowToIterate_1_NB_LINE",
						nb_line_tFlowToIterate_1);

				if (log.isInfoEnabled())
					log.info("tFlowToIterate_1 - " + "Done.");

				ok_Hash.put("tFlowToIterate_1", true);
				end_Hash.put("tFlowToIterate_1", System.currentTimeMillis());

				/**
				 * [tFlowToIterate_1 end ] stop
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
				 * [tOracleInput_1 finally ] start
				 */

				currentComponent = "tOracleInput_1";

				/**
				 * [tOracleInput_1 finally ] stop
				 */

				/**
				 * [tFlowToIterate_1 finally ] start
				 */

				currentComponent = "tFlowToIterate_1";

				/**
				 * [tFlowToIterate_1 finally ] stop
				 */

				/**
				 * [tOracleInput_4 finally ] start
				 */

				currentComponent = "tOracleInput_4";

				/**
				 * [tOracleInput_4 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_1 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_1";

				if (resourceMap.get("finish_tFileOutputDelimited_1") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_1");
						if (outtFileOutputDelimited_1 != null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}

					}

					if (Boolean.valueOf(String.valueOf(resourceMap
							.get("isFileGenerated_tFileOutputDelimited_1")))
							&& Integer.valueOf(String.valueOf(resourceMap
									.get("nb_line_tFileOutputDelimited_1"))) == 0) {

						((java.io.File) resourceMap
								.get("filetFileOutputDelimited_1")).delete();

					}

				}

				/**
				 * [tFileOutputDelimited_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_1_SUBPROCESS_STATE", 1);
	}

	public static class row3Struct implements
			routines.system.IPersistableRow<row3Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C = new byte[0];
		static byte[] commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[0];

		public String newColumn;

		public String getNewColumn() {
			return this.newColumn;
		}

		public String newColumn1;

		public String getNewColumn1() {
			return this.newColumn1;
		}

		public String newColumn2;

		public String getNewColumn2() {
			return this.newColumn2;
		}

		public String newColumn3;

		public String getNewColumn3() {
			return this.newColumn3;
		}

		public String newColumn4;

		public String getNewColumn4() {
			return this.newColumn4;
		}

		public String newColumn5;

		public String getNewColumn5() {
			return this.newColumn5;
		}

		public String newColumn6;

		public String getNewColumn6() {
			return this.newColumn6;
		}

		public String newColumn7;

		public String getNewColumn7() {
			return this.newColumn7;
		}

		public String newColumn8;

		public String getNewColumn8() {
			return this.newColumn8;
		}

		public String newColumn9;

		public String getNewColumn9() {
			return this.newColumn9;
		}

		public String newColumn10;

		public String getNewColumn10() {
			return this.newColumn10;
		}

		public String newColumn11;

		public String getNewColumn11() {
			return this.newColumn11;
		}

		public String newColumn12;

		public String getNewColumn12() {
			return this.newColumn12;
		}

		public String newColumn13;

		public String getNewColumn13() {
			return this.newColumn13;
		}

		public String newColumn14;

		public String getNewColumn14() {
			return this.newColumn14;
		}

		public String newColumn15;

		public String getNewColumn15() {
			return this.newColumn15;
		}

		public String newColumn16;

		public String getNewColumn16() {
			return this.newColumn16;
		}

		public String newColumn17;

		public String getNewColumn17() {
			return this.newColumn17;
		}

		public String newColumn18;

		public String getNewColumn18() {
			return this.newColumn18;
		}

		public String newColumn19;

		public String getNewColumn19() {
			return this.newColumn19;
		}

		public String newColumn20;

		public String getNewColumn20() {
			return this.newColumn20;
		}

		public String newColumn21;

		public String getNewColumn21() {
			return this.newColumn21;
		}

		public String newColumn22;

		public String getNewColumn22() {
			return this.newColumn22;
		}

		public String newColumn23;

		public String getNewColumn23() {
			return this.newColumn23;
		}

		public String newColumn24;

		public String getNewColumn24() {
			return this.newColumn24;
		}

		public String newColumn25;

		public String getNewColumn25() {
			return this.newColumn25;
		}

		public String newColumn26;

		public String getNewColumn26() {
			return this.newColumn26;
		}

		public String newColumn27;

		public String getNewColumn27() {
			return this.newColumn27;
		}

		public String newColumn28;

		public String getNewColumn28() {
			return this.newColumn28;
		}

		public String newColumn29;

		public String getNewColumn29() {
			return this.newColumn29;
		}

		public String newColumn30;

		public String getNewColumn30() {
			return this.newColumn30;
		}

		public String newColumn31;

		public String getNewColumn31() {
			return this.newColumn31;
		}

		public String newColumn32;

		public String getNewColumn32() {
			return this.newColumn32;
		}

		public String newColumn33;

		public String getNewColumn33() {
			return this.newColumn33;
		}

		public String newColumn34;

		public String getNewColumn34() {
			return this.newColumn34;
		}

		public String newColumn35;

		public String getNewColumn35() {
			return this.newColumn35;
		}

		public String newColumn36;

		public String getNewColumn36() {
			return this.newColumn36;
		}

		public String newColumn37;

		public String getNewColumn37() {
			return this.newColumn37;
		}

		public String newColumn38;

		public String getNewColumn38() {
			return this.newColumn38;
		}

		public String newColumn39;

		public String getNewColumn39() {
			return this.newColumn39;
		}

		public String newColumn40;

		public String getNewColumn40() {
			return this.newColumn40;
		}

		public String newColumn41;

		public String getNewColumn41() {
			return this.newColumn41;
		}

		public String newColumn42;

		public String getNewColumn42() {
			return this.newColumn42;
		}

		public String newColumn43;

		public String getNewColumn43() {
			return this.newColumn43;
		}

		public String newColumn44;

		public String getNewColumn44() {
			return this.newColumn44;
		}

		public String newColumn45;

		public String getNewColumn45() {
			return this.newColumn45;
		}

		public String newColumn46;

		public String getNewColumn46() {
			return this.newColumn46;
		}

		public String newColumn47;

		public String getNewColumn47() {
			return this.newColumn47;
		}

		public String newColumn48;

		public String getNewColumn48() {
			return this.newColumn48;
		}

		public String newColumn49;

		public String getNewColumn49() {
			return this.newColumn49;
		}

		public String newColumn50;

		public String getNewColumn50() {
			return this.newColumn50;
		}

		public String newColumn51;

		public String getNewColumn51() {
			return this.newColumn51;
		}

		public String newColumn52;

		public String getNewColumn52() {
			return this.newColumn52;
		}

		public String newColumn53;

		public String getNewColumn53() {
			return this.newColumn53;
		}

		public String newColumn54;

		public String getNewColumn54() {
			return this.newColumn54;
		}

		public String newColumn55;

		public String getNewColumn55() {
			return this.newColumn55;
		}

		public String newColumn56;

		public String getNewColumn56() {
			return this.newColumn56;
		}

		public String newColumn57;

		public String getNewColumn57() {
			return this.newColumn57;
		}

		public String newColumn58;

		public String getNewColumn58() {
			return this.newColumn58;
		}

		public String newColumn59;

		public String getNewColumn59() {
			return this.newColumn59;
		}

		public String newColumn60;

		public String getNewColumn60() {
			return this.newColumn60;
		}

		public String newColumn61;

		public String getNewColumn61() {
			return this.newColumn61;
		}

		public String newColumn62;

		public String getNewColumn62() {
			return this.newColumn62;
		}

		public String newColumn63;

		public String getNewColumn63() {
			return this.newColumn63;
		}

		public String newColumn64;

		public String getNewColumn64() {
			return this.newColumn64;
		}

		public String newColumn65;

		public String getNewColumn65() {
			return this.newColumn65;
		}

		public String newColumn66;

		public String getNewColumn66() {
			return this.newColumn66;
		}

		public String newColumn67;

		public String getNewColumn67() {
			return this.newColumn67;
		}

		public String newColumn68;

		public String getNewColumn68() {
			return this.newColumn68;
		}

		public String newColumn69;

		public String getNewColumn69() {
			return this.newColumn69;
		}

		public String newColumn70;

		public String getNewColumn70() {
			return this.newColumn70;
		}

		public String newColumn71;

		public String getNewColumn71() {
			return this.newColumn71;
		}

		public String newColumn72;

		public String getNewColumn72() {
			return this.newColumn72;
		}

		public String newColumn73;

		public String getNewColumn73() {
			return this.newColumn73;
		}

		public String newColumn74;

		public String getNewColumn74() {
			return this.newColumn74;
		}

		public String newColumn75;

		public String getNewColumn75() {
			return this.newColumn75;
		}

		public String newColumn76;

		public String getNewColumn76() {
			return this.newColumn76;
		}

		public String newColumn77;

		public String getNewColumn77() {
			return this.newColumn77;
		}

		public String newColumn78;

		public String getNewColumn78() {
			return this.newColumn78;
		}

		public String newColumn79;

		public String getNewColumn79() {
			return this.newColumn79;
		}

		public String newColumn80;

		public String getNewColumn80() {
			return this.newColumn80;
		}

		public String newColumn81;

		public String getNewColumn81() {
			return this.newColumn81;
		}

		public String newColumn82;

		public String getNewColumn82() {
			return this.newColumn82;
		}

		public String newColumn83;

		public String getNewColumn83() {
			return this.newColumn83;
		}

		public String newColumn84;

		public String getNewColumn84() {
			return this.newColumn84;
		}

		public String newColumn85;

		public String getNewColumn85() {
			return this.newColumn85;
		}

		public String newColumn86;

		public String getNewColumn86() {
			return this.newColumn86;
		}

		public String newColumn87;

		public String getNewColumn87() {
			return this.newColumn87;
		}

		public String newColumn88;

		public String getNewColumn88() {
			return this.newColumn88;
		}

		public String newColumn89;

		public String getNewColumn89() {
			return this.newColumn89;
		}

		public String newColumn90;

		public String getNewColumn90() {
			return this.newColumn90;
		}

		public String newColumn91;

		public String getNewColumn91() {
			return this.newColumn91;
		}

		public String newColumn92;

		public String getNewColumn92() {
			return this.newColumn92;
		}

		public String newColumn93;

		public String getNewColumn93() {
			return this.newColumn93;
		}

		public String newColumn94;

		public String getNewColumn94() {
			return this.newColumn94;
		}

		public String newColumn95;

		public String getNewColumn95() {
			return this.newColumn95;
		}

		public String newColumn96;

		public String getNewColumn96() {
			return this.newColumn96;
		}

		public String newColumn97;

		public String getNewColumn97() {
			return this.newColumn97;
		}

		public String newColumn98;

		public String getNewColumn98() {
			return this.newColumn98;
		}

		public String newColumn99;

		public String getNewColumn99() {
			return this.newColumn99;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_QA_Framework_Process_C2C.length == 0) {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AP_UNIX_QA_Framework_Process_C2C,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_QA_Framework_Process_C2C, 0,
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

			synchronized (commonByteArrayLock_AP_UNIX_QA_Framework_Process_C2C) {

				try {

					int length = 0;

					this.newColumn = readString(dis);

					this.newColumn1 = readString(dis);

					this.newColumn2 = readString(dis);

					this.newColumn3 = readString(dis);

					this.newColumn4 = readString(dis);

					this.newColumn5 = readString(dis);

					this.newColumn6 = readString(dis);

					this.newColumn7 = readString(dis);

					this.newColumn8 = readString(dis);

					this.newColumn9 = readString(dis);

					this.newColumn10 = readString(dis);

					this.newColumn11 = readString(dis);

					this.newColumn12 = readString(dis);

					this.newColumn13 = readString(dis);

					this.newColumn14 = readString(dis);

					this.newColumn15 = readString(dis);

					this.newColumn16 = readString(dis);

					this.newColumn17 = readString(dis);

					this.newColumn18 = readString(dis);

					this.newColumn19 = readString(dis);

					this.newColumn20 = readString(dis);

					this.newColumn21 = readString(dis);

					this.newColumn22 = readString(dis);

					this.newColumn23 = readString(dis);

					this.newColumn24 = readString(dis);

					this.newColumn25 = readString(dis);

					this.newColumn26 = readString(dis);

					this.newColumn27 = readString(dis);

					this.newColumn28 = readString(dis);

					this.newColumn29 = readString(dis);

					this.newColumn30 = readString(dis);

					this.newColumn31 = readString(dis);

					this.newColumn32 = readString(dis);

					this.newColumn33 = readString(dis);

					this.newColumn34 = readString(dis);

					this.newColumn35 = readString(dis);

					this.newColumn36 = readString(dis);

					this.newColumn37 = readString(dis);

					this.newColumn38 = readString(dis);

					this.newColumn39 = readString(dis);

					this.newColumn40 = readString(dis);

					this.newColumn41 = readString(dis);

					this.newColumn42 = readString(dis);

					this.newColumn43 = readString(dis);

					this.newColumn44 = readString(dis);

					this.newColumn45 = readString(dis);

					this.newColumn46 = readString(dis);

					this.newColumn47 = readString(dis);

					this.newColumn48 = readString(dis);

					this.newColumn49 = readString(dis);

					this.newColumn50 = readString(dis);

					this.newColumn51 = readString(dis);

					this.newColumn52 = readString(dis);

					this.newColumn53 = readString(dis);

					this.newColumn54 = readString(dis);

					this.newColumn55 = readString(dis);

					this.newColumn56 = readString(dis);

					this.newColumn57 = readString(dis);

					this.newColumn58 = readString(dis);

					this.newColumn59 = readString(dis);

					this.newColumn60 = readString(dis);

					this.newColumn61 = readString(dis);

					this.newColumn62 = readString(dis);

					this.newColumn63 = readString(dis);

					this.newColumn64 = readString(dis);

					this.newColumn65 = readString(dis);

					this.newColumn66 = readString(dis);

					this.newColumn67 = readString(dis);

					this.newColumn68 = readString(dis);

					this.newColumn69 = readString(dis);

					this.newColumn70 = readString(dis);

					this.newColumn71 = readString(dis);

					this.newColumn72 = readString(dis);

					this.newColumn73 = readString(dis);

					this.newColumn74 = readString(dis);

					this.newColumn75 = readString(dis);

					this.newColumn76 = readString(dis);

					this.newColumn77 = readString(dis);

					this.newColumn78 = readString(dis);

					this.newColumn79 = readString(dis);

					this.newColumn80 = readString(dis);

					this.newColumn81 = readString(dis);

					this.newColumn82 = readString(dis);

					this.newColumn83 = readString(dis);

					this.newColumn84 = readString(dis);

					this.newColumn85 = readString(dis);

					this.newColumn86 = readString(dis);

					this.newColumn87 = readString(dis);

					this.newColumn88 = readString(dis);

					this.newColumn89 = readString(dis);

					this.newColumn90 = readString(dis);

					this.newColumn91 = readString(dis);

					this.newColumn92 = readString(dis);

					this.newColumn93 = readString(dis);

					this.newColumn94 = readString(dis);

					this.newColumn95 = readString(dis);

					this.newColumn96 = readString(dis);

					this.newColumn97 = readString(dis);

					this.newColumn98 = readString(dis);

					this.newColumn99 = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.newColumn, dos);

				// String

				writeString(this.newColumn1, dos);

				// String

				writeString(this.newColumn2, dos);

				// String

				writeString(this.newColumn3, dos);

				// String

				writeString(this.newColumn4, dos);

				// String

				writeString(this.newColumn5, dos);

				// String

				writeString(this.newColumn6, dos);

				// String

				writeString(this.newColumn7, dos);

				// String

				writeString(this.newColumn8, dos);

				// String

				writeString(this.newColumn9, dos);

				// String

				writeString(this.newColumn10, dos);

				// String

				writeString(this.newColumn11, dos);

				// String

				writeString(this.newColumn12, dos);

				// String

				writeString(this.newColumn13, dos);

				// String

				writeString(this.newColumn14, dos);

				// String

				writeString(this.newColumn15, dos);

				// String

				writeString(this.newColumn16, dos);

				// String

				writeString(this.newColumn17, dos);

				// String

				writeString(this.newColumn18, dos);

				// String

				writeString(this.newColumn19, dos);

				// String

				writeString(this.newColumn20, dos);

				// String

				writeString(this.newColumn21, dos);

				// String

				writeString(this.newColumn22, dos);

				// String

				writeString(this.newColumn23, dos);

				// String

				writeString(this.newColumn24, dos);

				// String

				writeString(this.newColumn25, dos);

				// String

				writeString(this.newColumn26, dos);

				// String

				writeString(this.newColumn27, dos);

				// String

				writeString(this.newColumn28, dos);

				// String

				writeString(this.newColumn29, dos);

				// String

				writeString(this.newColumn30, dos);

				// String

				writeString(this.newColumn31, dos);

				// String

				writeString(this.newColumn32, dos);

				// String

				writeString(this.newColumn33, dos);

				// String

				writeString(this.newColumn34, dos);

				// String

				writeString(this.newColumn35, dos);

				// String

				writeString(this.newColumn36, dos);

				// String

				writeString(this.newColumn37, dos);

				// String

				writeString(this.newColumn38, dos);

				// String

				writeString(this.newColumn39, dos);

				// String

				writeString(this.newColumn40, dos);

				// String

				writeString(this.newColumn41, dos);

				// String

				writeString(this.newColumn42, dos);

				// String

				writeString(this.newColumn43, dos);

				// String

				writeString(this.newColumn44, dos);

				// String

				writeString(this.newColumn45, dos);

				// String

				writeString(this.newColumn46, dos);

				// String

				writeString(this.newColumn47, dos);

				// String

				writeString(this.newColumn48, dos);

				// String

				writeString(this.newColumn49, dos);

				// String

				writeString(this.newColumn50, dos);

				// String

				writeString(this.newColumn51, dos);

				// String

				writeString(this.newColumn52, dos);

				// String

				writeString(this.newColumn53, dos);

				// String

				writeString(this.newColumn54, dos);

				// String

				writeString(this.newColumn55, dos);

				// String

				writeString(this.newColumn56, dos);

				// String

				writeString(this.newColumn57, dos);

				// String

				writeString(this.newColumn58, dos);

				// String

				writeString(this.newColumn59, dos);

				// String

				writeString(this.newColumn60, dos);

				// String

				writeString(this.newColumn61, dos);

				// String

				writeString(this.newColumn62, dos);

				// String

				writeString(this.newColumn63, dos);

				// String

				writeString(this.newColumn64, dos);

				// String

				writeString(this.newColumn65, dos);

				// String

				writeString(this.newColumn66, dos);

				// String

				writeString(this.newColumn67, dos);

				// String

				writeString(this.newColumn68, dos);

				// String

				writeString(this.newColumn69, dos);

				// String

				writeString(this.newColumn70, dos);

				// String

				writeString(this.newColumn71, dos);

				// String

				writeString(this.newColumn72, dos);

				// String

				writeString(this.newColumn73, dos);

				// String

				writeString(this.newColumn74, dos);

				// String

				writeString(this.newColumn75, dos);

				// String

				writeString(this.newColumn76, dos);

				// String

				writeString(this.newColumn77, dos);

				// String

				writeString(this.newColumn78, dos);

				// String

				writeString(this.newColumn79, dos);

				// String

				writeString(this.newColumn80, dos);

				// String

				writeString(this.newColumn81, dos);

				// String

				writeString(this.newColumn82, dos);

				// String

				writeString(this.newColumn83, dos);

				// String

				writeString(this.newColumn84, dos);

				// String

				writeString(this.newColumn85, dos);

				// String

				writeString(this.newColumn86, dos);

				// String

				writeString(this.newColumn87, dos);

				// String

				writeString(this.newColumn88, dos);

				// String

				writeString(this.newColumn89, dos);

				// String

				writeString(this.newColumn90, dos);

				// String

				writeString(this.newColumn91, dos);

				// String

				writeString(this.newColumn92, dos);

				// String

				writeString(this.newColumn93, dos);

				// String

				writeString(this.newColumn94, dos);

				// String

				writeString(this.newColumn95, dos);

				// String

				writeString(this.newColumn96, dos);

				// String

				writeString(this.newColumn97, dos);

				// String

				writeString(this.newColumn98, dos);

				// String

				writeString(this.newColumn99, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("newColumn=" + newColumn);
			sb.append(",newColumn1=" + newColumn1);
			sb.append(",newColumn2=" + newColumn2);
			sb.append(",newColumn3=" + newColumn3);
			sb.append(",newColumn4=" + newColumn4);
			sb.append(",newColumn5=" + newColumn5);
			sb.append(",newColumn6=" + newColumn6);
			sb.append(",newColumn7=" + newColumn7);
			sb.append(",newColumn8=" + newColumn8);
			sb.append(",newColumn9=" + newColumn9);
			sb.append(",newColumn10=" + newColumn10);
			sb.append(",newColumn11=" + newColumn11);
			sb.append(",newColumn12=" + newColumn12);
			sb.append(",newColumn13=" + newColumn13);
			sb.append(",newColumn14=" + newColumn14);
			sb.append(",newColumn15=" + newColumn15);
			sb.append(",newColumn16=" + newColumn16);
			sb.append(",newColumn17=" + newColumn17);
			sb.append(",newColumn18=" + newColumn18);
			sb.append(",newColumn19=" + newColumn19);
			sb.append(",newColumn20=" + newColumn20);
			sb.append(",newColumn21=" + newColumn21);
			sb.append(",newColumn22=" + newColumn22);
			sb.append(",newColumn23=" + newColumn23);
			sb.append(",newColumn24=" + newColumn24);
			sb.append(",newColumn25=" + newColumn25);
			sb.append(",newColumn26=" + newColumn26);
			sb.append(",newColumn27=" + newColumn27);
			sb.append(",newColumn28=" + newColumn28);
			sb.append(",newColumn29=" + newColumn29);
			sb.append(",newColumn30=" + newColumn30);
			sb.append(",newColumn31=" + newColumn31);
			sb.append(",newColumn32=" + newColumn32);
			sb.append(",newColumn33=" + newColumn33);
			sb.append(",newColumn34=" + newColumn34);
			sb.append(",newColumn35=" + newColumn35);
			sb.append(",newColumn36=" + newColumn36);
			sb.append(",newColumn37=" + newColumn37);
			sb.append(",newColumn38=" + newColumn38);
			sb.append(",newColumn39=" + newColumn39);
			sb.append(",newColumn40=" + newColumn40);
			sb.append(",newColumn41=" + newColumn41);
			sb.append(",newColumn42=" + newColumn42);
			sb.append(",newColumn43=" + newColumn43);
			sb.append(",newColumn44=" + newColumn44);
			sb.append(",newColumn45=" + newColumn45);
			sb.append(",newColumn46=" + newColumn46);
			sb.append(",newColumn47=" + newColumn47);
			sb.append(",newColumn48=" + newColumn48);
			sb.append(",newColumn49=" + newColumn49);
			sb.append(",newColumn50=" + newColumn50);
			sb.append(",newColumn51=" + newColumn51);
			sb.append(",newColumn52=" + newColumn52);
			sb.append(",newColumn53=" + newColumn53);
			sb.append(",newColumn54=" + newColumn54);
			sb.append(",newColumn55=" + newColumn55);
			sb.append(",newColumn56=" + newColumn56);
			sb.append(",newColumn57=" + newColumn57);
			sb.append(",newColumn58=" + newColumn58);
			sb.append(",newColumn59=" + newColumn59);
			sb.append(",newColumn60=" + newColumn60);
			sb.append(",newColumn61=" + newColumn61);
			sb.append(",newColumn62=" + newColumn62);
			sb.append(",newColumn63=" + newColumn63);
			sb.append(",newColumn64=" + newColumn64);
			sb.append(",newColumn65=" + newColumn65);
			sb.append(",newColumn66=" + newColumn66);
			sb.append(",newColumn67=" + newColumn67);
			sb.append(",newColumn68=" + newColumn68);
			sb.append(",newColumn69=" + newColumn69);
			sb.append(",newColumn70=" + newColumn70);
			sb.append(",newColumn71=" + newColumn71);
			sb.append(",newColumn72=" + newColumn72);
			sb.append(",newColumn73=" + newColumn73);
			sb.append(",newColumn74=" + newColumn74);
			sb.append(",newColumn75=" + newColumn75);
			sb.append(",newColumn76=" + newColumn76);
			sb.append(",newColumn77=" + newColumn77);
			sb.append(",newColumn78=" + newColumn78);
			sb.append(",newColumn79=" + newColumn79);
			sb.append(",newColumn80=" + newColumn80);
			sb.append(",newColumn81=" + newColumn81);
			sb.append(",newColumn82=" + newColumn82);
			sb.append(",newColumn83=" + newColumn83);
			sb.append(",newColumn84=" + newColumn84);
			sb.append(",newColumn85=" + newColumn85);
			sb.append(",newColumn86=" + newColumn86);
			sb.append(",newColumn87=" + newColumn87);
			sb.append(",newColumn88=" + newColumn88);
			sb.append(",newColumn89=" + newColumn89);
			sb.append(",newColumn90=" + newColumn90);
			sb.append(",newColumn91=" + newColumn91);
			sb.append(",newColumn92=" + newColumn92);
			sb.append(",newColumn93=" + newColumn93);
			sb.append(",newColumn94=" + newColumn94);
			sb.append(",newColumn95=" + newColumn95);
			sb.append(",newColumn96=" + newColumn96);
			sb.append(",newColumn97=" + newColumn97);
			sb.append(",newColumn98=" + newColumn98);
			sb.append(",newColumn99=" + newColumn99);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (newColumn == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn);
			}

			sb.append("|");

			if (newColumn1 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn1);
			}

			sb.append("|");

			if (newColumn2 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn2);
			}

			sb.append("|");

			if (newColumn3 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn3);
			}

			sb.append("|");

			if (newColumn4 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn4);
			}

			sb.append("|");

			if (newColumn5 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn5);
			}

			sb.append("|");

			if (newColumn6 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn6);
			}

			sb.append("|");

			if (newColumn7 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn7);
			}

			sb.append("|");

			if (newColumn8 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn8);
			}

			sb.append("|");

			if (newColumn9 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn9);
			}

			sb.append("|");

			if (newColumn10 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn10);
			}

			sb.append("|");

			if (newColumn11 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn11);
			}

			sb.append("|");

			if (newColumn12 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn12);
			}

			sb.append("|");

			if (newColumn13 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn13);
			}

			sb.append("|");

			if (newColumn14 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn14);
			}

			sb.append("|");

			if (newColumn15 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn15);
			}

			sb.append("|");

			if (newColumn16 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn16);
			}

			sb.append("|");

			if (newColumn17 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn17);
			}

			sb.append("|");

			if (newColumn18 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn18);
			}

			sb.append("|");

			if (newColumn19 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn19);
			}

			sb.append("|");

			if (newColumn20 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn20);
			}

			sb.append("|");

			if (newColumn21 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn21);
			}

			sb.append("|");

			if (newColumn22 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn22);
			}

			sb.append("|");

			if (newColumn23 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn23);
			}

			sb.append("|");

			if (newColumn24 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn24);
			}

			sb.append("|");

			if (newColumn25 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn25);
			}

			sb.append("|");

			if (newColumn26 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn26);
			}

			sb.append("|");

			if (newColumn27 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn27);
			}

			sb.append("|");

			if (newColumn28 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn28);
			}

			sb.append("|");

			if (newColumn29 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn29);
			}

			sb.append("|");

			if (newColumn30 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn30);
			}

			sb.append("|");

			if (newColumn31 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn31);
			}

			sb.append("|");

			if (newColumn32 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn32);
			}

			sb.append("|");

			if (newColumn33 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn33);
			}

			sb.append("|");

			if (newColumn34 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn34);
			}

			sb.append("|");

			if (newColumn35 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn35);
			}

			sb.append("|");

			if (newColumn36 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn36);
			}

			sb.append("|");

			if (newColumn37 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn37);
			}

			sb.append("|");

			if (newColumn38 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn38);
			}

			sb.append("|");

			if (newColumn39 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn39);
			}

			sb.append("|");

			if (newColumn40 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn40);
			}

			sb.append("|");

			if (newColumn41 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn41);
			}

			sb.append("|");

			if (newColumn42 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn42);
			}

			sb.append("|");

			if (newColumn43 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn43);
			}

			sb.append("|");

			if (newColumn44 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn44);
			}

			sb.append("|");

			if (newColumn45 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn45);
			}

			sb.append("|");

			if (newColumn46 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn46);
			}

			sb.append("|");

			if (newColumn47 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn47);
			}

			sb.append("|");

			if (newColumn48 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn48);
			}

			sb.append("|");

			if (newColumn49 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn49);
			}

			sb.append("|");

			if (newColumn50 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn50);
			}

			sb.append("|");

			if (newColumn51 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn51);
			}

			sb.append("|");

			if (newColumn52 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn52);
			}

			sb.append("|");

			if (newColumn53 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn53);
			}

			sb.append("|");

			if (newColumn54 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn54);
			}

			sb.append("|");

			if (newColumn55 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn55);
			}

			sb.append("|");

			if (newColumn56 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn56);
			}

			sb.append("|");

			if (newColumn57 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn57);
			}

			sb.append("|");

			if (newColumn58 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn58);
			}

			sb.append("|");

			if (newColumn59 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn59);
			}

			sb.append("|");

			if (newColumn60 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn60);
			}

			sb.append("|");

			if (newColumn61 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn61);
			}

			sb.append("|");

			if (newColumn62 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn62);
			}

			sb.append("|");

			if (newColumn63 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn63);
			}

			sb.append("|");

			if (newColumn64 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn64);
			}

			sb.append("|");

			if (newColumn65 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn65);
			}

			sb.append("|");

			if (newColumn66 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn66);
			}

			sb.append("|");

			if (newColumn67 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn67);
			}

			sb.append("|");

			if (newColumn68 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn68);
			}

			sb.append("|");

			if (newColumn69 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn69);
			}

			sb.append("|");

			if (newColumn70 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn70);
			}

			sb.append("|");

			if (newColumn71 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn71);
			}

			sb.append("|");

			if (newColumn72 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn72);
			}

			sb.append("|");

			if (newColumn73 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn73);
			}

			sb.append("|");

			if (newColumn74 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn74);
			}

			sb.append("|");

			if (newColumn75 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn75);
			}

			sb.append("|");

			if (newColumn76 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn76);
			}

			sb.append("|");

			if (newColumn77 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn77);
			}

			sb.append("|");

			if (newColumn78 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn78);
			}

			sb.append("|");

			if (newColumn79 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn79);
			}

			sb.append("|");

			if (newColumn80 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn80);
			}

			sb.append("|");

			if (newColumn81 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn81);
			}

			sb.append("|");

			if (newColumn82 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn82);
			}

			sb.append("|");

			if (newColumn83 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn83);
			}

			sb.append("|");

			if (newColumn84 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn84);
			}

			sb.append("|");

			if (newColumn85 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn85);
			}

			sb.append("|");

			if (newColumn86 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn86);
			}

			sb.append("|");

			if (newColumn87 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn87);
			}

			sb.append("|");

			if (newColumn88 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn88);
			}

			sb.append("|");

			if (newColumn89 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn89);
			}

			sb.append("|");

			if (newColumn90 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn90);
			}

			sb.append("|");

			if (newColumn91 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn91);
			}

			sb.append("|");

			if (newColumn92 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn92);
			}

			sb.append("|");

			if (newColumn93 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn93);
			}

			sb.append("|");

			if (newColumn94 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn94);
			}

			sb.append("|");

			if (newColumn95 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn95);
			}

			sb.append("|");

			if (newColumn96 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn96);
			}

			sb.append("|");

			if (newColumn97 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn97);
			}

			sb.append("|");

			if (newColumn98 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn98);
			}

			sb.append("|");

			if (newColumn99 == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn99);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row3Struct other) {

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

	public void tOracleInput_5Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_5_SUBPROCESS_STATE", 0);

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

				row3Struct row3 = new row3Struct();

				/**
				 * [tFileOutputDelimited_2 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_2", false);
				start_Hash.put("tFileOutputDelimited_2",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_2";

				int tos_count_tFileOutputDelimited_2 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_2 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_2 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_2.append("Parameters:");
				log4jParamters_tFileOutputDelimited_2.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Quality_Assurance/\"+((String)globalMap.get(\"row1.RULE_DESC\"))+\"_\"+((String)globalMap.get(\"row1.RULE_ID\"))+\"/\"+context.reportMonth+\"/Rule_\"+((String)globalMap.get(\"row1.RULE_ID\"))+\"_QAReportResults.csv\"");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("APPEND" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("ROW_MODE" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("DELETE_EMPTYFILE"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_2 - "
							+ log4jParamters_tFileOutputDelimited_2);

				String fileName_tFileOutputDelimited_2 = "";
				class FileOutputDelimitedUtil_tFileOutputDelimited_2 {
					public void putValue_0(final row3Struct row3,
							StringBuilder sb_tFileOutputDelimited_2,
							final String OUT_DELIM_tFileOutputDelimited_2)
							throws java.lang.Exception {
						if (row3.newColumn != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn1 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn1);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn2 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn2);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn3 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn3);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn4 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn4);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn5 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn5);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn6 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn6);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn7 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn7);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn8 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn8);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn9 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn9);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn10 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn10);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn11 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn11);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn12 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn12);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn13 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn13);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn14 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn14);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn15 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn15);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn16 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn16);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn17 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn17);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn18 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn18);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn19 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn19);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn20 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn20);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn21 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn21);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn22 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn22);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn23 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn23);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn24 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn24);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn25 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn25);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn26 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn26);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn27 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn27);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn28 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn28);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn29 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn29);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn30 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn30);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn31 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn31);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn32 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn32);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn33 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn33);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn34 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn34);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn35 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn35);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn36 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn36);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn37 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn37);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn38 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn38);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn39 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn39);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn40 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn40);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn41 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn41);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn42 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn42);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn43 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn43);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn44 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn44);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn45 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn45);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn46 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn46);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn47 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn47);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn48 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn48);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn49 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn49);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn50 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn50);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn51 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn51);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn52 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn52);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn53 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn53);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn54 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn54);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn55 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn55);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn56 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn56);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn57 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn57);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn58 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn58);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn59 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn59);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn60 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn60);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn61 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn61);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn62 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn62);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn63 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn63);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn64 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn64);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn65 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn65);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn66 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn66);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn67 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn67);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn68 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn68);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn69 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn69);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn70 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn70);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn71 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn71);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn72 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn72);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn73 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn73);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn74 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn74);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn75 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn75);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn76 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn76);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn77 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn77);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn78 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn78);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn79 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn79);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn80 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn80);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn81 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn81);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn82 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn82);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn83 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn83);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn84 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn84);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn85 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn85);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn86 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn86);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn87 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn87);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn88 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn88);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn89 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn89);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
					}

					public void putValue_1(final row3Struct row3,
							StringBuilder sb_tFileOutputDelimited_2,
							final String OUT_DELIM_tFileOutputDelimited_2)
							throws java.lang.Exception {
						if (row3.newColumn90 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn90);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn91 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn91);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn92 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn92);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn93 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn93);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn94 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn94);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn95 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn95);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn96 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn96);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn97 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn97);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn98 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn98);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row3.newColumn99 != null) {
							sb_tFileOutputDelimited_2.append(row3.newColumn99);
						}
					}
				}
				FileOutputDelimitedUtil_tFileOutputDelimited_2 fileOutputDelimitedUtil_tFileOutputDelimited_2 = new FileOutputDelimitedUtil_tFileOutputDelimited_2();
				fileName_tFileOutputDelimited_2 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Quality_Assurance/"
								+ ((String) globalMap.get("row1.RULE_DESC"))
								+ "_"
								+ ((String) globalMap.get("row1.RULE_ID"))
								+ "/" + context.reportMonth + "/Rule_"
								+ ((String) globalMap.get("row1.RULE_ID"))
								+ "_QAReportResults.csv")).getAbsolutePath()
						.replace("\\", "/");
				String fullName_tFileOutputDelimited_2 = null;
				String extension_tFileOutputDelimited_2 = null;
				String directory_tFileOutputDelimited_2 = null;
				if ((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_2.lastIndexOf(".") < fileName_tFileOutputDelimited_2
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
						extension_tFileOutputDelimited_2 = "";
					} else {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
								.substring(0, fileName_tFileOutputDelimited_2
										.lastIndexOf("."));
						extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
								.substring(fileName_tFileOutputDelimited_2
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
							.substring(0, fileName_tFileOutputDelimited_2
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_2.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
								.substring(0, fileName_tFileOutputDelimited_2
										.lastIndexOf("."));
						extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
								.substring(fileName_tFileOutputDelimited_2
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
						extension_tFileOutputDelimited_2 = "";
					}
					directory_tFileOutputDelimited_2 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_2 = true;
				java.io.File filetFileOutputDelimited_2 = new java.io.File(
						fileName_tFileOutputDelimited_2);
				globalMap.put("tFileOutputDelimited_2_FILE_NAME",
						fileName_tFileOutputDelimited_2);
				if (filetFileOutputDelimited_2.exists()) {
					isFileGenerated_tFileOutputDelimited_2 = false;
				}
				int nb_line_tFileOutputDelimited_2 = 0;
				int splitEvery_tFileOutputDelimited_2 = 1000;
				int splitedFileNo_tFileOutputDelimited_2 = 0;
				int currentRow_tFileOutputDelimited_2 = 0;

				final String OUT_DELIM_tFileOutputDelimited_2 = /**
				 * Start field
				 * tFileOutputDelimited_2:FIELDSEPARATOR
				 */
				","/** End field tFileOutputDelimited_2:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /**
				 * Start
				 * field tFileOutputDelimited_2:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_2 != null
						&& directory_tFileOutputDelimited_2.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_2 = new java.io.File(
							directory_tFileOutputDelimited_2);
					if (!dir_tFileOutputDelimited_2.exists()) {
						log.info("tFileOutputDelimited_2 - Creating directory '"
								+ dir_tFileOutputDelimited_2.getCanonicalPath()
								+ "'.");
						dir_tFileOutputDelimited_2.mkdirs();
						log.info("tFileOutputDelimited_2 - The directory '"
								+ dir_tFileOutputDelimited_2.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_2 = null;

				outtFileOutputDelimited_2 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_2, true),
								"ISO-8859-15"));

				resourceMap.put("out_tFileOutputDelimited_2",
						outtFileOutputDelimited_2);
				resourceMap.put("nb_line_tFileOutputDelimited_2",
						nb_line_tFileOutputDelimited_2);
				resourceMap.put("isFileGenerated_tFileOutputDelimited_2",
						isFileGenerated_tFileOutputDelimited_2);
				resourceMap.put("filetFileOutputDelimited_2",
						filetFileOutputDelimited_2);

				/**
				 * [tFileOutputDelimited_2 begin ] stop
				 */

				/**
				 * [tOracleInput_5 begin ] start
				 */

				ok_Hash.put("tOracleInput_5", false);
				start_Hash.put("tOracleInput_5", System.currentTimeMillis());

				currentComponent = "tOracleInput_5";

				int tos_count_tOracleInput_5 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_5 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_5 = new StringBuilder();
				log4jParamters_tOracleInput_5.append("Parameters:");
				log4jParamters_tOracleInput_5.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("TABLE" + " = "
						+ "\"metadata\"");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("QUERY" + " = "
						+ "((String)globalMap.get(\"row1.DATA\"))");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn1") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn2")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn3") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn4") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn5")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn6") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn7") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn8")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn9") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn10") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn11")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn12") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn13") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn14")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn15") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn16") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn17")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn18") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn19") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn20")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn21") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn22") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn23")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn24") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn25") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn26")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn27") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn28") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn29")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn30") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn31") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn32")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn33") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn34") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn35")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn36") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn37") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn38")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn39") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn40") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn41")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn42") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn43") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn44")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn45") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn46") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn47")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn48") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn49") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn50")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn51") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn52") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn53")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn54") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn55") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn56")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn57") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn58") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn59")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn60") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn61") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn62")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn63") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn64") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn65")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn66") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn67") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn68")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn69") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn70") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn71")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn72") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn73") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn74")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn75") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn76") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn77")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn78") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn79") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn80")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn81") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn82") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn83")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn84") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn85") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn86")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn87") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn88") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn89")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn90") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn91") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn92")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn93") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn94") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn95")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn96") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("newColumn97") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("newColumn98")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("newColumn99") + "}]");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_5.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_5 - "
							+ log4jParamters_tOracleInput_5);

				int nb_line_tOracleInput_5 = 0;
				java.sql.Connection conn_tOracleInput_5 = null;
				String driverClass_tOracleInput_5 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_5);

				String url_tOracleInput_5 = null;
				url_tOracleInput_5 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_5 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_5 = context.dbPasswordPI;

				String dbPwd_tOracleInput_5 = decryptedPassword_tOracleInput_5;

				log.debug("tOracleInput_5 - Driver ClassName: "
						+ driverClass_tOracleInput_5 + ".");

				log.info("tOracleInput_5 - Connection attempt to '"
						+ url_tOracleInput_5 + "' with the username '"
						+ dbUser_tOracleInput_5 + "'.");

				conn_tOracleInput_5 = java.sql.DriverManager.getConnection(
						url_tOracleInput_5, dbUser_tOracleInput_5,
						dbPwd_tOracleInput_5);
				log.info("tOracleInput_5 - Connection to '"
						+ url_tOracleInput_5 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_5 = conn_tOracleInput_5
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_5 = stmtGetTZ_tOracleInput_5
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_5 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_5.next()) {
					sessionTimezone_tOracleInput_5 = rsGetTZ_tOracleInput_5
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_5)
						.setSessionTimeZone(sessionTimezone_tOracleInput_5);

				java.sql.Statement stmt_tOracleInput_5 = conn_tOracleInput_5
						.createStatement();

				String dbquery_tOracleInput_5 = ((String) globalMap
						.get("row1.DATA"));

				log.info("tOracleInput_5 - Executing the query: '"
						+ dbquery_tOracleInput_5 + "'.");

				globalMap.put("tOracleInput_5_QUERY", dbquery_tOracleInput_5);

				java.sql.ResultSet rs_tOracleInput_5 = null;
				try {
					rs_tOracleInput_5 = stmt_tOracleInput_5
							.executeQuery(dbquery_tOracleInput_5);
					java.sql.ResultSetMetaData rsmd_tOracleInput_5 = rs_tOracleInput_5
							.getMetaData();
					int colQtyInRs_tOracleInput_5 = rsmd_tOracleInput_5
							.getColumnCount();

					String tmpContent_tOracleInput_5 = null;

					log.info("tOracleInput_5 - Retrieving records from the database.");

					while (rs_tOracleInput_5.next()) {
						nb_line_tOracleInput_5++;

						if (colQtyInRs_tOracleInput_5 < 1) {
							row3.newColumn = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(1);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 2) {
							row3.newColumn1 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(2);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn1 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn1 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 3) {
							row3.newColumn2 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(3);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn2 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn2 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 4) {
							row3.newColumn3 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(4);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn3 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn3 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 5) {
							row3.newColumn4 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(5);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn4 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn4 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 6) {
							row3.newColumn5 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(6);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn5 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn5 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 7) {
							row3.newColumn6 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(7);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn6 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn6 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 8) {
							row3.newColumn7 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(8);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn7 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn7 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 9) {
							row3.newColumn8 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(9);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn8 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn8 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 10) {
							row3.newColumn9 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(10);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn9 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn9 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 11) {
							row3.newColumn10 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(11);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn10 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn10 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 12) {
							row3.newColumn11 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(12);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn11 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn11 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 13) {
							row3.newColumn12 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(13);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn12 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn12 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 14) {
							row3.newColumn13 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(14);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn13 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn13 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 15) {
							row3.newColumn14 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(15);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn14 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn14 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 16) {
							row3.newColumn15 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(16);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn15 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn15 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 17) {
							row3.newColumn16 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(17);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn16 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn16 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 18) {
							row3.newColumn17 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(18);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn17 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn17 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 19) {
							row3.newColumn18 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(19);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn18 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn18 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 20) {
							row3.newColumn19 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(20);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn19 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn19 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 21) {
							row3.newColumn20 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(21);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn20 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn20 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 22) {
							row3.newColumn21 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(22);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn21 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn21 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 23) {
							row3.newColumn22 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(23);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn22 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn22 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 24) {
							row3.newColumn23 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(24);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn23 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn23 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 25) {
							row3.newColumn24 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(25);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn24 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn24 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 26) {
							row3.newColumn25 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(26);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn25 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn25 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 27) {
							row3.newColumn26 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(27);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn26 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn26 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 28) {
							row3.newColumn27 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(28);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn27 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn27 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 29) {
							row3.newColumn28 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(29);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn28 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn28 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 30) {
							row3.newColumn29 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(30);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn29 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn29 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 31) {
							row3.newColumn30 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(31);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn30 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn30 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 32) {
							row3.newColumn31 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(32);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn31 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn31 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 33) {
							row3.newColumn32 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(33);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn32 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn32 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 34) {
							row3.newColumn33 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(34);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn33 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn33 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 35) {
							row3.newColumn34 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(35);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn34 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn34 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 36) {
							row3.newColumn35 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(36);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn35 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn35 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 37) {
							row3.newColumn36 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(37);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn36 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn36 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 38) {
							row3.newColumn37 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(38);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn37 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn37 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 39) {
							row3.newColumn38 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(39);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn38 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn38 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 40) {
							row3.newColumn39 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(40);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn39 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn39 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 41) {
							row3.newColumn40 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(41);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn40 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn40 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 42) {
							row3.newColumn41 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(42);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn41 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn41 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 43) {
							row3.newColumn42 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(43);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn42 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn42 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 44) {
							row3.newColumn43 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(44);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn43 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn43 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 45) {
							row3.newColumn44 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(45);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn44 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn44 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 46) {
							row3.newColumn45 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(46);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn45 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn45 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 47) {
							row3.newColumn46 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(47);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn46 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn46 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 48) {
							row3.newColumn47 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(48);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn47 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn47 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 49) {
							row3.newColumn48 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(49);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn48 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn48 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 50) {
							row3.newColumn49 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(50);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn49 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn49 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 51) {
							row3.newColumn50 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(51);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn50 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn50 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 52) {
							row3.newColumn51 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(52);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn51 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn51 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 53) {
							row3.newColumn52 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(53);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn52 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn52 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 54) {
							row3.newColumn53 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(54);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn53 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn53 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 55) {
							row3.newColumn54 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(55);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn54 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn54 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 56) {
							row3.newColumn55 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(56);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn55 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn55 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 57) {
							row3.newColumn56 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(57);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn56 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn56 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 58) {
							row3.newColumn57 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(58);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn57 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn57 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 59) {
							row3.newColumn58 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(59);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn58 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn58 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 60) {
							row3.newColumn59 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(60);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn59 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn59 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 61) {
							row3.newColumn60 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(61);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn60 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn60 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 62) {
							row3.newColumn61 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(62);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn61 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn61 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 63) {
							row3.newColumn62 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(63);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn62 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn62 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 64) {
							row3.newColumn63 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(64);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn63 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn63 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 65) {
							row3.newColumn64 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(65);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn64 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn64 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 66) {
							row3.newColumn65 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(66);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn65 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn65 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 67) {
							row3.newColumn66 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(67);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn66 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn66 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 68) {
							row3.newColumn67 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(68);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn67 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn67 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 69) {
							row3.newColumn68 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(69);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn68 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn68 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 70) {
							row3.newColumn69 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(70);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn69 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn69 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 71) {
							row3.newColumn70 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(71);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn70 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn70 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 72) {
							row3.newColumn71 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(72);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn71 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn71 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 73) {
							row3.newColumn72 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(73);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn72 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn72 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 74) {
							row3.newColumn73 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(74);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn73 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn73 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 75) {
							row3.newColumn74 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(75);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn74 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn74 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 76) {
							row3.newColumn75 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(76);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn75 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn75 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 77) {
							row3.newColumn76 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(77);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn76 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn76 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 78) {
							row3.newColumn77 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(78);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn77 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn77 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 79) {
							row3.newColumn78 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(79);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn78 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn78 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 80) {
							row3.newColumn79 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(80);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn79 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn79 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 81) {
							row3.newColumn80 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(81);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn80 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn80 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 82) {
							row3.newColumn81 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(82);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn81 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn81 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 83) {
							row3.newColumn82 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(83);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn82 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn82 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 84) {
							row3.newColumn83 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(84);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn83 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn83 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 85) {
							row3.newColumn84 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(85);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn84 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn84 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 86) {
							row3.newColumn85 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(86);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn85 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn85 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 87) {
							row3.newColumn86 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(87);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn86 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn86 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 88) {
							row3.newColumn87 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(88);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn87 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn87 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 89) {
							row3.newColumn88 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(89);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn88 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn88 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 90) {
							row3.newColumn89 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(90);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn89 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn89 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 91) {
							row3.newColumn90 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(91);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn90 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn90 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 92) {
							row3.newColumn91 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(92);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn91 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn91 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 93) {
							row3.newColumn92 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(93);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn92 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn92 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 94) {
							row3.newColumn93 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(94);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn93 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn93 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 95) {
							row3.newColumn94 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(95);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn94 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn94 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 96) {
							row3.newColumn95 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(96);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn95 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn95 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 97) {
							row3.newColumn96 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(97);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn96 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn96 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 98) {
							row3.newColumn97 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(98);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn97 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn97 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 99) {
							row3.newColumn98 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(99);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn98 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn98 = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 100) {
							row3.newColumn99 = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(100);
							if (tmpContent_tOracleInput_5 != null) {
								row3.newColumn99 = tmpContent_tOracleInput_5;
							} else {
								row3.newColumn99 = null;
							}
						}

						log.debug("tOracleInput_5 - Retrieving the record "
								+ nb_line_tOracleInput_5 + ".");

						/**
						 * [tOracleInput_5 begin ] stop
						 */

						/**
						 * [tOracleInput_5 main ] start
						 */

						currentComponent = "tOracleInput_5";

						tos_count_tOracleInput_5++;

						/**
						 * [tOracleInput_5 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_2 main ] start
						 */

						currentComponent = "tFileOutputDelimited_2";

						if (log.isTraceEnabled()) {
							log.trace("row3 - "
									+ (row3 == null ? "" : row3.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
						fileOutputDelimitedUtil_tFileOutputDelimited_2
								.putValue_0(row3, sb_tFileOutputDelimited_2,
										OUT_DELIM_tFileOutputDelimited_2);
						fileOutputDelimitedUtil_tFileOutputDelimited_2
								.putValue_1(row3, sb_tFileOutputDelimited_2,
										OUT_DELIM_tFileOutputDelimited_2);
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_2++;
							resourceMap.put("nb_line_tFileOutputDelimited_2",
									nb_line_tFileOutputDelimited_2);

							outtFileOutputDelimited_2
									.write(sb_tFileOutputDelimited_2.toString());
							log.debug("tFileOutputDelimited_2 - Writing the record "
									+ nb_line_tFileOutputDelimited_2 + ".");

						}

						tos_count_tFileOutputDelimited_2++;

						/**
						 * [tFileOutputDelimited_2 main ] stop
						 */

						/**
						 * [tOracleInput_5 end ] start
						 */

						currentComponent = "tOracleInput_5";

					}
				} finally {
					stmt_tOracleInput_5.close();

					if (conn_tOracleInput_5 != null
							&& !conn_tOracleInput_5.isClosed()) {

						log.info("tOracleInput_5 - Closing the connection to the database.");

						conn_tOracleInput_5.close();

						log.info("tOracleInput_5 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_5_NB_LINE", nb_line_tOracleInput_5);
				log.info("tOracleInput_5 - Retrieved records count: "
						+ nb_line_tOracleInput_5 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_5 - " + "Done.");

				ok_Hash.put("tOracleInput_5", true);
				end_Hash.put("tOracleInput_5", System.currentTimeMillis());

				/**
				 * [tOracleInput_5 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_2 end ] start
				 */

				currentComponent = "tFileOutputDelimited_2";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_2 != null) {
						outtFileOutputDelimited_2.flush();
						outtFileOutputDelimited_2.close();
					}

					globalMap.put("tFileOutputDelimited_2_NB_LINE",
							nb_line_tFileOutputDelimited_2);
					globalMap.put("tFileOutputDelimited_2_FILE_NAME",
							fileName_tFileOutputDelimited_2);

				}

				if (isFileGenerated_tFileOutputDelimited_2
						&& nb_line_tFileOutputDelimited_2 == 0) {

					filetFileOutputDelimited_2.delete();

				}

				resourceMap.put("finish_tFileOutputDelimited_2", true);

				log.info("tFileOutputDelimited_2 - Written records count: "
						+ nb_line_tFileOutputDelimited_2 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_2 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_2", true);
				end_Hash.put("tFileOutputDelimited_2",
						System.currentTimeMillis());

				tOracleRow_1Process(globalMap);

				/**
				 * [tFileOutputDelimited_2 end ] stop
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
				 * [tOracleInput_5 finally ] start
				 */

				currentComponent = "tOracleInput_5";

				/**
				 * [tOracleInput_5 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_2 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_2";

				if (resourceMap.get("finish_tFileOutputDelimited_2") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_2 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_2");
						if (outtFileOutputDelimited_2 != null) {
							outtFileOutputDelimited_2.flush();
							outtFileOutputDelimited_2.close();
						}

					}

					if (Boolean.valueOf(String.valueOf(resourceMap
							.get("isFileGenerated_tFileOutputDelimited_2")))
							&& Integer.valueOf(String.valueOf(resourceMap
									.get("nb_line_tFileOutputDelimited_2"))) == 0) {

						((java.io.File) resourceMap
								.get("filetFileOutputDelimited_2")).delete();

					}

				}

				/**
				 * [tFileOutputDelimited_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_5_SUBPROCESS_STATE", 1);
	}

	public void tOracleRow_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleRow_1_SUBPROCESS_STATE", 0);

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
				 * [tOracleRow_1 begin ] start
				 */

				ok_Hash.put("tOracleRow_1", false);
				start_Hash.put("tOracleRow_1", System.currentTimeMillis());

				currentComponent = "tOracleRow_1";

				int tos_count_tOracleRow_1 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleRow_1 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleRow_1 = new StringBuilder();
				log4jParamters_tOracleRow_1.append("Parameters:");
				log4jParamters_tOracleRow_1.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("DB_VERSION" + " = "
						+ "ORACLE_12");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("PORT" + " = " + "\"1521\"");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1
						.append("QUERY"
								+ " = "
								+ "\"  BEGIN  DELETE FROM QA_SQL  WHERE RULE_ID = \"+((String)globalMap.get(\"row1.RULE_ID\"))+\"  AND EXEC_TIME = TO_TIMESTAMP('\"+((String)globalMap.get(\"row1.EXEC_TIME\"))+\"','MM/DD/YYYY HH:MI:SS.FF AM');  COMMIT;  END;  \"");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("USE_NB_LINE" + " = "
						+ "NONE");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("DIE_ON_ERROR" + " = "
						+ "false");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("PROPAGATE_RECORD_SET"
						+ " = " + "false");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("USE_PREPAREDSTATEMENT"
						+ " = " + "false");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("COMMIT_EVERY" + " = "
						+ "10000");
				log4jParamters_tOracleRow_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleRow_1 - " + log4jParamters_tOracleRow_1);

				java.sql.Connection conn_tOracleRow_1 = null;
				String query_tOracleRow_1 = "";
				boolean whetherReject_tOracleRow_1 = false;
				String driverClass_tOracleRow_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleRow_1);

				String url_tOracleRow_1 = null;
				url_tOracleRow_1 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";
				log.debug("tOracleRow_1 - Driver ClassName: "
						+ driverClass_tOracleRow_1 + ".");

				String dbUser_tOracleRow_1 = context.dbUserPI;

				final String decryptedPassword_tOracleRow_1 = context.dbPasswordPI;

				String dbPwd_tOracleRow_1 = decryptedPassword_tOracleRow_1;

				log.info("tOracleRow_1 - Connection attempt to '"
						+ url_tOracleRow_1 + "' with the username '"
						+ dbUser_tOracleRow_1 + "'.");

				conn_tOracleRow_1 = java.sql.DriverManager.getConnection(
						url_tOracleRow_1, dbUser_tOracleRow_1,
						dbPwd_tOracleRow_1);

				log.info("tOracleRow_1 - Connection to '" + url_tOracleRow_1
						+ "' has succeeded.");

				if (conn_tOracleRow_1.getAutoCommit()) {

					log.debug("tOracleRow_1 - Connection is set auto commit to 'false'.");

					conn_tOracleRow_1.setAutoCommit(false);

				}
				int commitEvery_tOracleRow_1 = 10000;
				int commitCounter_tOracleRow_1 = 0;

				java.sql.Statement stmt_tOracleRow_1 = conn_tOracleRow_1
						.createStatement();

				/**
				 * [tOracleRow_1 begin ] stop
				 */

				/**
				 * [tOracleRow_1 main ] start
				 */

				currentComponent = "tOracleRow_1";

				log.info("tOracleRow_1 - Executing the query: '"
						+ "  BEGIN  DELETE FROM QA_SQL  WHERE RULE_ID = "
						+ ((String) globalMap.get("row1.RULE_ID"))
						+ "  AND EXEC_TIME = TO_TIMESTAMP('"
						+ ((String) globalMap.get("row1.EXEC_TIME"))
						+ "','MM/DD/YYYY HH:MI:SS.FF AM');  COMMIT;  END;  "
						+ "'.");

				query_tOracleRow_1 = "\nBEGIN\nDELETE FROM QA_SQL\nWHERE RULE_ID = "
						+ ((String) globalMap.get("row1.RULE_ID"))
						+ "\nAND EXEC_TIME = TO_TIMESTAMP('"
						+ ((String) globalMap.get("row1.EXEC_TIME"))
						+ "','MM/DD/YYYY HH:MI:SS.FF AM');\nCOMMIT;\nEND;\n";
				whetherReject_tOracleRow_1 = false;
				globalMap.put("tOracleRow_1_QUERY", query_tOracleRow_1);
				try {
					stmt_tOracleRow_1.execute(query_tOracleRow_1);

					log.info("tOracleRow_1 - Execute the query: '"
							+ "\nBEGIN\nDELETE FROM QA_SQL\nWHERE RULE_ID = "
							+ ((String) globalMap.get("row1.RULE_ID"))
							+ "\nAND EXEC_TIME = TO_TIMESTAMP('"
							+ ((String) globalMap.get("row1.EXEC_TIME"))
							+ "','MM/DD/YYYY HH:MI:SS.FF AM');\nCOMMIT;\nEND;\n"
							+ "' has finished.");

				} catch (java.lang.Exception e) {
					whetherReject_tOracleRow_1 = true;

					log.error("tOracleRow_1 - " + e.getMessage());

					System.err.print(e.getMessage());

				}

				if (!whetherReject_tOracleRow_1) {

				}

				commitCounter_tOracleRow_1++;
				if (commitEvery_tOracleRow_1 <= commitCounter_tOracleRow_1) {

					log.debug("tOracleRow_1 - Connection starting to commit.");

					conn_tOracleRow_1.commit();

					log.debug("tOracleRow_1 - Connection commit has succeeded.");

					commitCounter_tOracleRow_1 = 0;
				}

				tos_count_tOracleRow_1++;

				/**
				 * [tOracleRow_1 main ] stop
				 */

				/**
				 * [tOracleRow_1 end ] start
				 */

				currentComponent = "tOracleRow_1";

				stmt_tOracleRow_1.close();
				if (commitEvery_tOracleRow_1 > commitCounter_tOracleRow_1) {

					log.debug("tOracleRow_1 - Connection starting to commit.");

					conn_tOracleRow_1.commit();

					log.debug("tOracleRow_1 - Connection commit has succeeded.");

					commitCounter_tOracleRow_1 = 0;

				}
				log.info("tOracleRow_1 - Closing the connection to the database.");

				conn_tOracleRow_1.close();

				log.info("tOracleRow_1 - Connection to the database closed.");

				if (log.isInfoEnabled())
					log.info("tOracleRow_1 - " + "Done.");

				ok_Hash.put("tOracleRow_1", true);
				end_Hash.put("tOracleRow_1", System.currentTimeMillis());

				tFileRowCount_1Process(globalMap);

				/**
				 * [tOracleRow_1 end ] stop
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
				 * [tOracleRow_1 finally ] start
				 */

				currentComponent = "tOracleRow_1";

				/**
				 * [tOracleRow_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleRow_1_SUBPROCESS_STATE", 1);
	}

	public void tFileRowCount_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileRowCount_1_SUBPROCESS_STATE", 0);

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
				 * [tFileRowCount_1 begin ] start
				 */

				ok_Hash.put("tFileRowCount_1", false);
				start_Hash.put("tFileRowCount_1", System.currentTimeMillis());

				currentComponent = "tFileRowCount_1";

				int tos_count_tFileRowCount_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFileRowCount_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFileRowCount_1 = new StringBuilder();
				log4jParamters_tFileRowCount_1.append("Parameters:");
				log4jParamters_tFileRowCount_1
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Quality_Assurance/\"+((String)globalMap.get(\"row1.RULE_DESC\"))+\"_\"+((String)globalMap.get(\"row1.RULE_ID\"))+\"/\"+context.reportMonth+\"/Rule_\"+((String)globalMap.get(\"row1.RULE_ID\"))+\"_QAReportResults.csv\"");
				log4jParamters_tFileRowCount_1.append(" | ");
				log4jParamters_tFileRowCount_1.append("ROWSEPARATOR" + " = "
						+ "\"\\r\\n\"");
				log4jParamters_tFileRowCount_1.append(" | ");
				log4jParamters_tFileRowCount_1.append("IGNORE_EMPTY_ROW"
						+ " = " + "false");
				log4jParamters_tFileRowCount_1.append(" | ");
				log4jParamters_tFileRowCount_1.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileRowCount_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileRowCount_1 - "
							+ log4jParamters_tFileRowCount_1);

				/**
				 * [tFileRowCount_1 begin ] stop
				 */

				/**
				 * [tFileRowCount_1 main ] start
				 */

				currentComponent = "tFileRowCount_1";

				final StringBuffer log4jSb_tFileRowCount_1 = new StringBuffer();

				String tmp_tFileRowCount_1 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Quality_Assurance/"
						+ ((String) globalMap.get("row1.RULE_DESC")) + "_"
						+ ((String) globalMap.get("row1.RULE_ID")) + "/"
						+ context.reportMonth + "/Rule_"
						+ ((String) globalMap.get("row1.RULE_ID"))
						+ "_QAReportResults.csv";
				int emptyLineCount_tFileRowCount_1 = 0;
				if (tmp_tFileRowCount_1.toLowerCase().endsWith(".xlsx"))
					throw new RuntimeException("not support excel 2007");
				int lineCount_tFileRowCount_1 = 0;
				if (tmp_tFileRowCount_1.toLowerCase().endsWith(".xls")) {
					final jxl.WorkbookSettings wbs_tFileRowCount_1 = new jxl.WorkbookSettings();
					wbs_tFileRowCount_1.setEncoding("ISO-8859-15");
					final jxl.Workbook wb_tFileRowCount_1 = jxl.Workbook
							.getWorkbook(
									new java.io.BufferedInputStream(
											new java.io.FileInputStream(
													context.shipping
															+ "/"
															+ context.reportYear
															+ context.mDrive
															+ "/Quality_Assurance/"
															+ ((String) globalMap
																	.get("row1.RULE_DESC"))
															+ "_"
															+ ((String) globalMap
																	.get("row1.RULE_ID"))
															+ "/"
															+ context.reportMonth
															+ "/Rule_"
															+ ((String) globalMap
																	.get("row1.RULE_ID"))
															+ "_QAReportResults.csv")),
									wbs_tFileRowCount_1);

					java.util.List<jxl.Sheet> sheets_tFileRowCount_1 = new java.util.ArrayList<jxl.Sheet>();
					;
					sheets_tFileRowCount_1 = java.util.Arrays
							.<jxl.Sheet> asList(wb_tFileRowCount_1.getSheets());

					if (sheets_tFileRowCount_1.size() <= 0) {
						wb_tFileRowCount_1.close();
						throw new RuntimeException("Special sheets not exist!");
					}

					for (jxl.Sheet sheet_tFileRowCount_1 : sheets_tFileRowCount_1) {
						int one_sheet_rows = sheet_tFileRowCount_1.getRows();
						lineCount_tFileRowCount_1 += one_sheet_rows;

						for (int i_tFileRowCount_1 = 0; i_tFileRowCount_1 < one_sheet_rows; i_tFileRowCount_1++) {
							jxl.Cell[] sheet_row = sheet_tFileRowCount_1
									.getRow(i_tFileRowCount_1);

							boolean bIsEmptyRow = true;
							for (jxl.Cell cell : sheet_row) {
								if (cell.getContents() != null) {
									bIsEmptyRow = false;
									break;
								}
							}
							emptyLineCount_tFileRowCount_1 += bIsEmptyRow ? 1
									: 0;
						}
					}
					wb_tFileRowCount_1.close();

				} else {
					java.io.BufferedReader br_tFileRowCount_1 = new java.io.BufferedReader(
							new java.io.InputStreamReader(
									new java.io.FileInputStream(
											context.shipping
													+ "/"
													+ context.reportYear
													+ context.mDrive
													+ "/Quality_Assurance/"
													+ ((String) globalMap
															.get("row1.RULE_DESC"))
													+ "_"
													+ ((String) globalMap
															.get("row1.RULE_ID"))
													+ "/"
													+ context.reportMonth
													+ "/Rule_"
													+ ((String) globalMap
															.get("row1.RULE_ID"))
													+ "_QAReportResults.csv"),
									"ISO-8859-15"));
					String rowSeparator_tFileRowCount_1 = "\r\n";
					byte[] bytes_tFileRowCount_1 = rowSeparator_tFileRowCount_1
							.getBytes();
					int index_tFileRowCount_1 = 0, oneChar_tFileRowCount_1 = 0, tipEmptyLineCount_tFileRowCount_1 = 0;
					boolean bTipEmptyFlagOpen_tFileRowCount_1 = true, bReadyEOF_tFileRowCount_1 = false;

					if (bytes_tFileRowCount_1.length > 0) {
						while ((oneChar_tFileRowCount_1 = br_tFileRowCount_1
								.read()) != -1) {
							if (oneChar_tFileRowCount_1 == bytes_tFileRowCount_1[index_tFileRowCount_1]) {

								if (index_tFileRowCount_1 < bytes_tFileRowCount_1.length - 1) {
									index_tFileRowCount_1++;
									continue; // match next char
								}

								if (index_tFileRowCount_1 == bytes_tFileRowCount_1.length - 1) {
									lineCount_tFileRowCount_1++;
									if (bTipEmptyFlagOpen_tFileRowCount_1) {
										tipEmptyLineCount_tFileRowCount_1++;
										emptyLineCount_tFileRowCount_1++;
									}
									bReadyEOF_tFileRowCount_1 = false; // next
																		// row
																		// must
																		// be
																		// have
																		// char(or
																		// EOF
																		// flag)
									bTipEmptyFlagOpen_tFileRowCount_1 = true;
									index_tFileRowCount_1 = 0;
								}

							} else {
								bReadyEOF_tFileRowCount_1 = true;
								bTipEmptyFlagOpen_tFileRowCount_1 = false;
								tipEmptyLineCount_tFileRowCount_1 = 0;
								index_tFileRowCount_1 = 0;
							}
						}

						if (bReadyEOF_tFileRowCount_1)
							lineCount_tFileRowCount_1++; // add last row if not
															// end by row
															// separator

						if (bTipEmptyFlagOpen_tFileRowCount_1) {
							lineCount_tFileRowCount_1 -= tipEmptyLineCount_tFileRowCount_1;
							emptyLineCount_tFileRowCount_1 -= tipEmptyLineCount_tFileRowCount_1;
						}
					}
					br_tFileRowCount_1.close();
				}

				globalMap.put("tFileRowCount_1_COUNT",
						lineCount_tFileRowCount_1);

				log.info("tFileRowCount_1 - File : " + context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Quality_Assurance/"
						+ ((String) globalMap.get("row1.RULE_DESC")) + "_"
						+ ((String) globalMap.get("row1.RULE_ID")) + "/"
						+ context.reportMonth + "/Rule_"
						+ ((String) globalMap.get("row1.RULE_ID"))
						+ "_QAReportResults.csv" + " row count is "
						+ lineCount_tFileRowCount_1);

				tos_count_tFileRowCount_1++;

				/**
				 * [tFileRowCount_1 main ] stop
				 */

				/**
				 * [tFileRowCount_1 end ] start
				 */

				currentComponent = "tFileRowCount_1";

				if (log.isInfoEnabled())
					log.info("tFileRowCount_1 - " + "Done.");

				ok_Hash.put("tFileRowCount_1", true);
				end_Hash.put("tFileRowCount_1", System.currentTimeMillis());

				tRunJob_1Process(globalMap);

				/**
				 * [tFileRowCount_1 end ] stop
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
				 * [tFileRowCount_1 finally ] start
				 */

				currentComponent = "tFileRowCount_1";

				/**
				 * [tFileRowCount_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileRowCount_1_SUBPROCESS_STATE", 1);
	}

	public void tRunJob_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tRunJob_1_SUBPROCESS_STATE", 0);

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
				 * [tRunJob_1 begin ] start
				 */

				ok_Hash.put("tRunJob_1", false);
				start_Hash.put("tRunJob_1", System.currentTimeMillis());

				currentComponent = "tRunJob_1";

				int tos_count_tRunJob_1 = 0;

				if (log.isInfoEnabled())
					log.info("tRunJob_1 - " + "Start to work.");
				StringBuilder log4jParamters_tRunJob_1 = new StringBuilder();
				log4jParamters_tRunJob_1.append("Parameters:");
				log4jParamters_tRunJob_1.append("USE_DYNAMIC_JOB" + " = "
						+ "false");
				log4jParamters_tRunJob_1.append(" | ");
				log4jParamters_tRunJob_1.append("PROCESS" + " = "
						+ "QA_Framework_Process_Email");
				log4jParamters_tRunJob_1.append(" | ");
				log4jParamters_tRunJob_1.append("USE_INDEPENDENT_PROCESS"
						+ " = " + "false");
				log4jParamters_tRunJob_1.append(" | ");
				log4jParamters_tRunJob_1.append("DIE_ON_CHILD_ERROR" + " = "
						+ "false");
				log4jParamters_tRunJob_1.append(" | ");
				log4jParamters_tRunJob_1.append("TRANSMIT_WHOLE_CONTEXT"
						+ " = " + "false");
				log4jParamters_tRunJob_1.append(" | ");
				log4jParamters_tRunJob_1
						.append("CONTEXTPARAMS"
								+ " = "
								+ "[{PARAM_NAME_COLUMN="
								+ ("testResult")
								+ ", PARAM_VALUE_COLUMN="
								+ ("((Integer)globalMap.get(\"tFileRowCount_1_COUNT\"))>1?\"NOTOK\":\"OK\"")
								+ "}, {PARAM_NAME_COLUMN="
								+ ("notify")
								+ ", PARAM_VALUE_COLUMN="
								+ ("((String)globalMap.get(\"row1.NOTIFY\"))")
								+ "}, {PARAM_NAME_COLUMN="
								+ ("notifySuccess")
								+ ", PARAM_VALUE_COLUMN="
								+ ("((String)globalMap.get(\"row1.NOTIFY_SUCCESS\"))")
								+ "}, {PARAM_NAME_COLUMN="
								+ ("notifyError")
								+ ", PARAM_VALUE_COLUMN="
								+ ("((String)globalMap.get(\"row1.NOTIFY_ERROR\"))")
								+ "}, {PARAM_NAME_COLUMN="
								+ ("ruleID")
								+ ", PARAM_VALUE_COLUMN="
								+ ("((String)globalMap.get(\"row1.RULE_ID\"))")
								+ "}, {PARAM_NAME_COLUMN="
								+ ("execTime")
								+ ", PARAM_VALUE_COLUMN="
								+ ("((String)globalMap.get(\"row1.EXEC_TIME\"))")
								+ "}, {PARAM_NAME_COLUMN="
								+ ("ruleDesc")
								+ ", PARAM_VALUE_COLUMN="
								+ ("((String)globalMap.get(\"row1.RULE_DESC\"))")
								+ "}, {PARAM_NAME_COLUMN=" + ("reportMonth")
								+ ", PARAM_VALUE_COLUMN="
								+ ("context.reportMonth")
								+ "}, {PARAM_NAME_COLUMN=" + ("reportYear")
								+ ", PARAM_VALUE_COLUMN="
								+ ("context.reportYear") + "}]");
				log4jParamters_tRunJob_1.append(" | ");
				log4jParamters_tRunJob_1.append("PROPAGATE_CHILD_RESULT"
						+ " = " + "false");
				log4jParamters_tRunJob_1.append(" | ");
				log4jParamters_tRunJob_1.append("PRINT_PARAMETER" + " = "
						+ "false");
				log4jParamters_tRunJob_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tRunJob_1 - " + log4jParamters_tRunJob_1);

				/**
				 * [tRunJob_1 begin ] stop
				 */

				/**
				 * [tRunJob_1 main ] start
				 */

				currentComponent = "tRunJob_1";

				java.util.List<String> paraList_tRunJob_1 = new java.util.ArrayList<String>();

				paraList_tRunJob_1.add("--father_pid=" + pid);

				paraList_tRunJob_1.add("--root_pid=" + rootPid);

				paraList_tRunJob_1.add("--father_node=tRunJob_1");

				paraList_tRunJob_1.add("--context=Prod");

				if (!"".equals(log4jLevel)) {
					paraList_tRunJob_1.add("--log4jLevel=" + log4jLevel);
				}

				// for feature:10589

				paraList_tRunJob_1.add("--stat_port=" + portStats);

				if (resuming_logs_dir_path != null) {
					paraList_tRunJob_1.add("--resuming_logs_dir_path="
							+ resuming_logs_dir_path);
				}
				String childResumePath_tRunJob_1 = ResumeUtil
						.getChildJobCheckPointPath(resuming_checkpoint_path);
				String tRunJobName_tRunJob_1 = ResumeUtil
						.getRighttRunJob(resuming_checkpoint_path);
				if ("tRunJob_1".equals(tRunJobName_tRunJob_1)
						&& childResumePath_tRunJob_1 != null) {
					paraList_tRunJob_1
							.add("--resuming_checkpoint_path="
									+ ResumeUtil
											.getChildJobCheckPointPath(resuming_checkpoint_path));
				}
				paraList_tRunJob_1.add("--parent_part_launcher=JOB:" + jobName
						+ "/NODE:tRunJob_1");

				java.util.Map<String, Object> parentContextMap_tRunJob_1 = new java.util.HashMap<String, Object>();

				Object obj_tRunJob_1 = null;

				obj_tRunJob_1 = ((Integer) globalMap
						.get("tFileRowCount_1_COUNT")) > 1 ? "NOTOK" : "OK";
				paraList_tRunJob_1.add("--context_param testResult="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("testResult", obj_tRunJob_1);

				obj_tRunJob_1 = ((String) globalMap.get("row1.NOTIFY"));
				paraList_tRunJob_1.add("--context_param notify="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("notify", obj_tRunJob_1);

				obj_tRunJob_1 = ((String) globalMap.get("row1.NOTIFY_SUCCESS"));
				paraList_tRunJob_1.add("--context_param notifySuccess="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("notifySuccess", obj_tRunJob_1);

				obj_tRunJob_1 = ((String) globalMap.get("row1.NOTIFY_ERROR"));
				paraList_tRunJob_1.add("--context_param notifyError="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("notifyError", obj_tRunJob_1);

				obj_tRunJob_1 = ((String) globalMap.get("row1.RULE_ID"));
				paraList_tRunJob_1.add("--context_param ruleID="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("ruleID", obj_tRunJob_1);

				obj_tRunJob_1 = ((String) globalMap.get("row1.EXEC_TIME"));
				paraList_tRunJob_1.add("--context_param execTime="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("execTime", obj_tRunJob_1);

				obj_tRunJob_1 = ((String) globalMap.get("row1.RULE_DESC"));
				paraList_tRunJob_1.add("--context_param ruleDesc="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("ruleDesc", obj_tRunJob_1);

				obj_tRunJob_1 = context.reportMonth;
				paraList_tRunJob_1.add("--context_param reportMonth="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("reportMonth", obj_tRunJob_1);

				obj_tRunJob_1 = context.reportYear;
				paraList_tRunJob_1.add("--context_param reportYear="
						+ RuntimeUtils.tRunJobConvertContext(obj_tRunJob_1));
				parentContextMap_tRunJob_1.put("reportYear", obj_tRunJob_1);

				ap_unix.qa_framework_process_email_0_1.QA_Framework_Process_Email childJob_tRunJob_1 = new ap_unix.qa_framework_process_email_0_1.QA_Framework_Process_Email();
				// pass DataSources
				java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_1 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
						.get(KEY_DB_DATASOURCES);
				if (null != talendDataSources_tRunJob_1) {
					java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_1 = new java.util.HashMap<String, javax.sql.DataSource>();
					for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_1 : talendDataSources_tRunJob_1
							.entrySet()) {
						dataSources_tRunJob_1.put(
								talendDataSourceEntry_tRunJob_1.getKey(),
								talendDataSourceEntry_tRunJob_1.getValue()
										.getRawDataSource());
					}
					childJob_tRunJob_1.setDataSources(dataSources_tRunJob_1);
				}

				childJob_tRunJob_1.parentContextMap = parentContextMap_tRunJob_1;

				log.info("tRunJob_1 - The child job 'ap_unix.qa_framework_process_email_0_1.QA_Framework_Process_Email' starts on the version '0.1' with the context 'Prod'.");

				String[][] childReturn_tRunJob_1 = childJob_tRunJob_1
						.runJob((String[]) paraList_tRunJob_1
								.toArray(new String[paraList_tRunJob_1.size()]));

				log.info("tRunJob_1 - The child job 'ap_unix.qa_framework_process_email_0_1.QA_Framework_Process_Email' is done.");

				((java.util.Map) threadLocal.get()).put("errorCode",
						childJob_tRunJob_1.getErrorCode());

				if (childJob_tRunJob_1.getErrorCode() == null) {
					globalMap.put(
							"tRunJob_1_CHILD_RETURN_CODE",
							childJob_tRunJob_1.getStatus() != null
									&& ("failure").equals(childJob_tRunJob_1
											.getStatus()) ? 1 : 0);
				} else {
					globalMap.put("tRunJob_1_CHILD_RETURN_CODE",
							childJob_tRunJob_1.getErrorCode());
				}
				if (childJob_tRunJob_1.getExceptionStackTrace() != null) {
					globalMap.put("tRunJob_1_CHILD_EXCEPTION_STACKTRACE",
							childJob_tRunJob_1.getExceptionStackTrace());
				}

				tos_count_tRunJob_1++;

				/**
				 * [tRunJob_1 main ] stop
				 */

				/**
				 * [tRunJob_1 end ] start
				 */

				currentComponent = "tRunJob_1";

				if (log.isInfoEnabled())
					log.info("tRunJob_1 - " + "Done.");

				ok_Hash.put("tRunJob_1", true);
				end_Hash.put("tRunJob_1", System.currentTimeMillis());

				/**
				 * [tRunJob_1 end ] stop
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
				 * [tRunJob_1 finally ] start
				 */

				currentComponent = "tRunJob_1";

				/**
				 * [tRunJob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tRunJob_1_SUBPROCESS_STATE", 1);
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
								+ "\"  BEGIN  UPDATE QA_BUSINESS_RULES  SET EXEC_STATUS = 'READY'  WHERE RULE_ID = \"+((String)globalMap.get(\"row1.RULE_ID\"))+\";  COMMIT;  END;  \"");
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
						+ ((String) globalMap.get("row1.RULE_ID"))
						+ ";  COMMIT;  END;  " + "'.");

				query_tOracleRow_2 = "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
						+ ((String) globalMap.get("row1.RULE_ID"))
						+ ";\nCOMMIT;\nEND;\n";
				whetherReject_tOracleRow_2 = false;
				globalMap.put("tOracleRow_2_QUERY", query_tOracleRow_2);
				try {
					stmt_tOracleRow_2.execute(query_tOracleRow_2);

					log.info("tOracleRow_2 - Execute the query: '"
							+ "\nBEGIN\nUPDATE QA_BUSINESS_RULES\nSET EXEC_STATUS = 'READY'\nWHERE RULE_ID = "
							+ ((String) globalMap.get("row1.RULE_ID"))
							+ ";\nCOMMIT;\nEND;\n" + "' has finished.");

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
		final QA_Framework_Process_C2C QA_Framework_Process_C2CClass = new QA_Framework_Process_C2C();

		int exitCode = QA_Framework_Process_C2CClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'QA_Framework_Process_C2C' - Done.");
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
		log.info("TalendJob: 'QA_Framework_Process_C2C' - Start.");

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
			java.io.InputStream inContext = QA_Framework_Process_C2C.class
					.getClassLoader().getResourceAsStream(
							"ap_unix/qa_framework_process_c2c_0_1/contexts/"
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
							+ " bytes memory increase when running : QA_Framework_Process_C2C");
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
