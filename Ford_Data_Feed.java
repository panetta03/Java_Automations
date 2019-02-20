package ap_unix.ais_monthly_ford_fact_files_nv_uv_part1_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendString;
import routines.DQTechnical;
import routines.StringHandling;
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

//the import part of tJava_3
//import java.util.List;

//the import part of tJava_5
//import java.util.List;

//the import part of tJavaRow_1
//import java.util.List;

//the import part of tJavaRow_2
//import java.util.List;

//the import part of tJavaRow_4
//import java.util.List;

//the import part of tJavaRow_3
//import java.util.List;

//the import part of tJava_4
//import java.util.List;

//the import part of tJava_1
//import java.util.List;

//the import part of tJava_2
//import java.util.List;

@SuppressWarnings("unused")
/**
 * Job: AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 Purpose: <br>
 * Description: Runs New and Used vehicle files and attributes <br>
 * @author Panetta, Alex
 * @version 6.1.1.20151214_1327
 * @status 
 */
public class AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 implements TalendJob {
	static {
		System.setProperty("TalendJob.log",
				"AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.log");
	}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.class);

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

			if (altEmailCC != null) {

				this.setProperty("altEmailCC", altEmailCC.toString());

			}

			if (altEmailTo != null) {

				this.setProperty("altEmailTo", altEmailTo.toString());

			}

			if (client != null) {

				this.setProperty("client", client.toString());

			}

			if (eftpDirectory != null) {

				this.setProperty("eftpDirectory", eftpDirectory.toString());

			}

			if (eftpHost != null) {

				this.setProperty("eftpHost", eftpHost.toString());

			}

			if (eftpPassword != null) {

				this.setProperty("eftpPassword", eftpPassword.toString());

			}

			if (eftpUser != null) {

				this.setProperty("eftpUser", eftpUser.toString());

			}

			if (emailBcc != null) {

				this.setProperty("emailBcc", emailBcc.toString());

			}

			if (emailCC != null) {

				this.setProperty("emailCC", emailCC.toString());

			}

			if (emailFrom != null) {

				this.setProperty("emailFrom", emailFrom.toString());

			}

			if (emailTo != null) {

				this.setProperty("emailTo", emailTo.toString());

			}

			if (expiredReportMonth != null) {

				this.setProperty("expiredReportMonth",
						expiredReportMonth.toString());

			}

			if (jobNumber != null) {

				this.setProperty("jobNumber", jobNumber.toString());

			}

			if (lastReportMonth != null) {

				this.setProperty("lastReportMonth", lastReportMonth.toString());

			}

			if (resourceInt != null) {

				this.setProperty("resourceInt", resourceInt.toString());

			}

			if (runIt != null) {

				this.setProperty("runIt", runIt.toString());

			}

			if (salesCostCenter != null) {

				this.setProperty("salesCostCenter", salesCostCenter.toString());

			}

			if (salesEmail != null) {

				this.setProperty("salesEmail", salesEmail.toString());

			}

			if (salesName != null) {

				this.setProperty("salesName", salesName.toString());

			}

			if (salesSignature != null) {

				this.setProperty("salesSignature", salesSignature.toString());

			}

			if (shipIt != null) {

				this.setProperty("shipIt", shipIt.toString());

			}

			if (startDate != null) {

				this.setProperty("startDate", startDate.toString());

			}

			if (prevYear != null) {

				this.setProperty("prevYear", prevYear.toString());

			}

			if (reportMonth != null) {

				this.setProperty("reportMonth", reportMonth.toString());

			}

			if (reportYear != null) {

				this.setProperty("reportYear", reportYear.toString());

			}

			if (rMonth != null) {

				this.setProperty("rMonth", rMonth.toString());

			}

			if (rMth != null) {

				this.setProperty("rMth", rMth.toString());

			}

			if (dbHostName != null) {

				this.setProperty("dbHostName", dbHostName.toString());

			}

			if (dbName != null) {

				this.setProperty("dbName", dbName.toString());

			}

			if (dbPassword != null) {

				this.setProperty("dbPassword", dbPassword.toString());

			}

			if (dbSchema != null) {

				this.setProperty("dbSchema", dbSchema.toString());

			}

			if (dbUser != null) {

				this.setProperty("dbUser", dbUser.toString());

			}

			if (ftpDirectory != null) {

				this.setProperty("ftpDirectory", ftpDirectory.toString());

			}

			if (ftpHost != null) {

				this.setProperty("ftpHost", ftpHost.toString());

			}

			if (ftpPassword != null) {

				this.setProperty("ftpPassword", ftpPassword.toString());

			}

			if (ftpUser != null) {

				this.setProperty("ftpUser", ftpUser.toString());

			}

			if (prodEmail != null) {

				this.setProperty("prodEmail", prodEmail.toString());

			}

			if (salesPhone != null) {

				this.setProperty("salesPhone", salesPhone.toString());

			}

			if (salesTitle != null) {

				this.setProperty("salesTitle", salesTitle.toString());

			}

			if (shipEmail != null) {

				this.setProperty("shipEmail", shipEmail.toString());

			}

			if (smtpHost != null) {

				this.setProperty("smtpHost", smtpHost.toString());

			}

			if (dbVersion != null) {

				this.setProperty("dbVersion", dbVersion.toString());

			}

			if (lineFeed != null) {

				this.setProperty("lineFeed", lineFeed.toString());

			}

			if (localDirectory != null) {

				this.setProperty("localDirectory", localDirectory.toString());

			}

			if (mDrive != null) {

				this.setProperty("mDrive", mDrive.toString());

			}

			if (shipping != null) {

				this.setProperty("shipping", shipping.toString());

			}

			if (slash != null) {

				this.setProperty("slash", slash.toString());

			}

			if (pgpKeyRecipient != null) {

				this.setProperty("pgpKeyRecipient", pgpKeyRecipient.toString());

			}

			if (pgpFileName != null) {

				this.setProperty("pgpFileName", pgpFileName.toString());

			}

			if (fileRowCount != null) {

				this.setProperty("fileRowCount", fileRowCount.toString());

			}

			if (jobID != null) {

				this.setProperty("jobID", jobID.toString());

			}

			if (fileName != null) {

				this.setProperty("fileName", fileName.toString());

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

			if (reportMonth1 != null) {

				this.setProperty("reportMonth1", reportMonth1.toString());

			}

		}

		public String altEmailCC;

		public String getAltEmailCC() {
			return this.altEmailCC;
		}

		public String altEmailTo;

		public String getAltEmailTo() {
			return this.altEmailTo;
		}

		public String client;

		public String getClient() {
			return this.client;
		}

		public String eftpDirectory;

		public String getEftpDirectory() {
			return this.eftpDirectory;
		}

		public String eftpHost;

		public String getEftpHost() {
			return this.eftpHost;
		}

		public String eftpPassword;

		public String getEftpPassword() {
			return this.eftpPassword;
		}

		public String eftpUser;

		public String getEftpUser() {
			return this.eftpUser;
		}

		public String emailBcc;

		public String getEmailBcc() {
			return this.emailBcc;
		}

		public String emailCC;

		public String getEmailCC() {
			return this.emailCC;
		}

		public String emailFrom;

		public String getEmailFrom() {
			return this.emailFrom;
		}

		public String emailTo;

		public String getEmailTo() {
			return this.emailTo;
		}

		public String expiredReportMonth;

		public String getExpiredReportMonth() {
			return this.expiredReportMonth;
		}

		public String jobNumber;

		public String getJobNumber() {
			return this.jobNumber;
		}

		public String lastReportMonth;

		public String getLastReportMonth() {
			return this.lastReportMonth;
		}

		public String resourceInt;

		public String getResourceInt() {
			return this.resourceInt;
		}

		public String runIt;

		public String getRunIt() {
			return this.runIt;
		}

		public String salesCostCenter;

		public String getSalesCostCenter() {
			return this.salesCostCenter;
		}

		public String salesEmail;

		public String getSalesEmail() {
			return this.salesEmail;
		}

		public String salesName;

		public String getSalesName() {
			return this.salesName;
		}

		public String salesSignature;

		public String getSalesSignature() {
			return this.salesSignature;
		}

		public String shipIt;

		public String getShipIt() {
			return this.shipIt;
		}

		public String startDate;

		public String getStartDate() {
			return this.startDate;
		}

		public String prevYear;

		public String getPrevYear() {
			return this.prevYear;
		}

		public String reportMonth;

		public String getReportMonth() {
			return this.reportMonth;
		}

		public String reportYear;

		public String getReportYear() {
			return this.reportYear;
		}

		public String rMonth;

		public String getRMonth() {
			return this.rMonth;
		}

		public String rMth;

		public String getRMth() {
			return this.rMth;
		}

		public String dbHostName;

		public String getDbHostName() {
			return this.dbHostName;
		}

		public String dbName;

		public String getDbName() {
			return this.dbName;
		}

		public String dbPassword;

		public String getDbPassword() {
			return this.dbPassword;
		}

		public String dbSchema;

		public String getDbSchema() {
			return this.dbSchema;
		}

		public String dbUser;

		public String getDbUser() {
			return this.dbUser;
		}

		public String ftpDirectory;

		public String getFtpDirectory() {
			return this.ftpDirectory;
		}

		public String ftpHost;

		public String getFtpHost() {
			return this.ftpHost;
		}

		public String ftpPassword;

		public String getFtpPassword() {
			return this.ftpPassword;
		}

		public String ftpUser;

		public String getFtpUser() {
			return this.ftpUser;
		}

		public String prodEmail;

		public String getProdEmail() {
			return this.prodEmail;
		}

		public String salesPhone;

		public String getSalesPhone() {
			return this.salesPhone;
		}

		public String salesTitle;

		public String getSalesTitle() {
			return this.salesTitle;
		}

		public String shipEmail;

		public String getShipEmail() {
			return this.shipEmail;
		}

		public String smtpHost;

		public String getSmtpHost() {
			return this.smtpHost;
		}

		public String dbVersion;

		public String getDbVersion() {
			return this.dbVersion;
		}

		public String lineFeed;

		public String getLineFeed() {
			return this.lineFeed;
		}

		public String localDirectory;

		public String getLocalDirectory() {
			return this.localDirectory;
		}

		public String mDrive;

		public String getMDrive() {
			return this.mDrive;
		}

		public String shipping;

		public String getShipping() {
			return this.shipping;
		}

		public String slash;

		public String getSlash() {
			return this.slash;
		}

		public String pgpKeyRecipient;

		public String getPgpKeyRecipient() {
			return this.pgpKeyRecipient;
		}

		public String pgpFileName;

		public String getPgpFileName() {
			return this.pgpFileName;
		}

		public Integer fileRowCount;

		public Integer getFileRowCount() {
			return this.fileRowCount;
		}

		public String jobID;

		public String getJobID() {
			return this.jobID;
		}

		public String fileName;

		public String getFileName() {
			return this.fileName;
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

		public String reportMonth1;

		public String getReportMonth1() {
			return this.reportMonth1;
		}
	}

	private ContextProperties context = new ContextProperties();

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "AIS_Monthly_Ford_Fact_Files_NV_UV_Part1";
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
					AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(
									AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.this,
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

	public void tFTPDelete_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFTPDelete_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPPut_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFTPPut_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tJava_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSendMail_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileArchive_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileArchive_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSendMail_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tFileInputDelimited_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tJavaRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tOracleInput_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_9_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_4_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_6_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tJava_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_8_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSystem_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSystem_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileRowCount_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFixedFlowInput_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_39_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_10_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_9_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_14_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_14_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_13_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_14_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_16_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_16_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_15_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_16_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_18_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_18_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_17_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_18_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_20_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_20_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_19_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_20_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_22_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_22_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_21_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_22_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_24_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_24_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_23_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_24_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_26_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_26_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_25_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_26_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_32_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_32_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_31_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_32_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_34_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_34_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_33_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_34_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_36_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_36_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_35_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_36_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_38_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_38_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_37_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_38_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_3_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_3_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPostjob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPDelete_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPPut_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_4_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_5_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSendMail_4_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileArchive_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_3_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSendMail_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_1_onSubJobError(Exception exception,
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

	public void tOracleInput_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_9_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_4_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_6_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_4_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_8_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSystem_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFixedFlowInput_1_onSubJobError(Exception exception,
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

	public void tOracleInput_10_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_14_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_16_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_18_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_20_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_22_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_24_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_26_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_32_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_34_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_36_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_38_onSubJobError(Exception exception,
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

	public void tPostjob_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPDelete_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFTPDelete_1_SUBPROCESS_STATE", 0);

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
				 * [tFTPDelete_1 begin ] start
				 */

				ok_Hash.put("tFTPDelete_1", false);
				start_Hash.put("tFTPDelete_1", System.currentTimeMillis());

				currentComponent = "tFTPDelete_1";

				int tos_count_tFTPDelete_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFTPDelete_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFTPDelete_1 = new StringBuilder();
				log4jParamters_tFTPDelete_1.append("Parameters:");
				log4jParamters_tFTPDelete_1.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("HOST" + " = "
						+ "context.ftpHost");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("PORT" + " = " + "21");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("USERNAME" + " = "
						+ "context.ftpUser");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("PASSWORD"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.ftpPassword))
								.substring(0, 4) + "...");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("SFTP" + " = " + "false");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("REMOTEDIR" + " = "
						+ "context.ftpDirectory");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("PERL5_REGEX" + " = "
						+ "false");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1
						.append("FILES"
								+ " = "
								+ "[{FILEMASK="
								+ ("\"FORD_CUSTOM_CATEGORY_\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_CUSTOM_CATEGORY_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_CUSTOM_GEOGRAPHY*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_CUSTOM_GEOGRAPHY_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_CUSTOM_MAKE_MODEL*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_CUSTOM_MAKE_MODEL_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_DESC_GENDER*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_DESC_GENDER_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_DESC_HH_AGE*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_DESC_HH_AGE_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_EST_HH_INCOME_SORT*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_EST_HH_INCOME_SORT_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_LU_ETHNIC_CODES*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_LU_ETHNIC_CODES_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_NEW_FACT*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_NEW_FACT_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_NEW_USED_SALES_TIME_PERIOD*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_NEW_USED_SALES_TIME_PERIOD_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_STANDARD_GEOGRAPHY*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_STANDARD_GEOGRAPHY_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_TARGET_INCOME*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_TARGET_INCOME_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_USED_FACT*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_USED_FACT_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_VEH_AGE_BAND*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_VEH_AGE_BAND_COUNT.txt.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_VEHICLE_ATTRIBUTES*\"+context.reportMonth1+\"*.gpg\"")
								+ "}, {FILEMASK="
								+ ("\"FORD_VEHICLE_ATTRIBUTES_COUNT.txt.gpg\"")
								+ "}]");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("TARGET_TYPE" + " = "
						+ "FILE");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("CONNECT_MODE" + " = "
						+ "PASSIVE");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("DIE_ON_ERROR" + " = "
						+ "false");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("USE_PROXY" + " = "
						+ "false");
				log4jParamters_tFTPDelete_1.append(" | ");
				log4jParamters_tFTPDelete_1.append("IGNORE_FAILURE_AT_QUIT"
						+ " = " + "false");
				log4jParamters_tFTPDelete_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFTPDelete_1 - " + log4jParamters_tFTPDelete_1);

				int nb_file_tFTPDelete_1 = 0;

				com.enterprisedt.net.ftp.FTPClient ftp_tFTPDelete_1 = null;

				ftp_tFTPDelete_1 = new com.enterprisedt.net.ftp.FTPClient();
				ftp_tFTPDelete_1.setRemoteHost(context.ftpHost);
				ftp_tFTPDelete_1.setRemotePort(21);

				log.debug("tFTPDelete_1 - " + "Using the passive mode.");

				ftp_tFTPDelete_1
						.setConnectMode(com.enterprisedt.net.ftp.FTPConnectMode.PASV);

				ftp_tFTPDelete_1.setControlEncoding("ISO-8859-15");

				log.info("tFTPDelete_1 - Attempt to connect to '"
						+ context.ftpHost + "' with username: '"
						+ context.ftpUser + "'.");

				ftp_tFTPDelete_1.connect();

				final String decryptedPassword_tFTPDelete_1 = context.ftpPassword;

				ftp_tFTPDelete_1.login(context.ftpUser,
						decryptedPassword_tFTPDelete_1);

				log.info("tFTPDelete_1 - Connect to '" + context.ftpHost
						+ "' has succeeded.");

				java.util.List<java.util.Map<String, String>> listtFTPDelete_1 = new java.util.ArrayList<java.util.Map<String, String>>();

				java.util.Map<String, String> maptFTPDelete_10 = new java.util.HashMap<String, String>();
				maptFTPDelete_10.put("FORD_CUSTOM_CATEGORY_"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_10);

				java.util.Map<String, String> maptFTPDelete_11 = new java.util.HashMap<String, String>();
				maptFTPDelete_11.put("FORD_CUSTOM_CATEGORY_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_11);

				java.util.Map<String, String> maptFTPDelete_12 = new java.util.HashMap<String, String>();
				maptFTPDelete_12.put("FORD_CUSTOM_GEOGRAPHY*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_12);

				java.util.Map<String, String> maptFTPDelete_13 = new java.util.HashMap<String, String>();
				maptFTPDelete_13.put("FORD_CUSTOM_GEOGRAPHY_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_13);

				java.util.Map<String, String> maptFTPDelete_14 = new java.util.HashMap<String, String>();
				maptFTPDelete_14.put("FORD_CUSTOM_MAKE_MODEL*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_14);

				java.util.Map<String, String> maptFTPDelete_15 = new java.util.HashMap<String, String>();
				maptFTPDelete_15
						.put("FORD_CUSTOM_MAKE_MODEL_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_15);

				java.util.Map<String, String> maptFTPDelete_16 = new java.util.HashMap<String, String>();
				maptFTPDelete_16.put("FORD_DESC_GENDER*" + context.reportMonth1
						+ "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_16);

				java.util.Map<String, String> maptFTPDelete_17 = new java.util.HashMap<String, String>();
				maptFTPDelete_17.put("FORD_DESC_GENDER_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_17);

				java.util.Map<String, String> maptFTPDelete_18 = new java.util.HashMap<String, String>();
				maptFTPDelete_18.put("FORD_DESC_HH_AGE*" + context.reportMonth1
						+ "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_18);

				java.util.Map<String, String> maptFTPDelete_19 = new java.util.HashMap<String, String>();
				maptFTPDelete_19.put("FORD_DESC_HH_AGE_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_19);

				java.util.Map<String, String> maptFTPDelete_110 = new java.util.HashMap<String, String>();
				maptFTPDelete_110.put("FORD_EST_HH_INCOME_SORT*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_110);

				java.util.Map<String, String> maptFTPDelete_111 = new java.util.HashMap<String, String>();
				maptFTPDelete_111.put("FORD_EST_HH_INCOME_SORT_COUNT.txt.gpg",
						"");
				listtFTPDelete_1.add(maptFTPDelete_111);

				java.util.Map<String, String> maptFTPDelete_112 = new java.util.HashMap<String, String>();
				maptFTPDelete_112.put("FORD_LU_ETHNIC_CODES*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_112);

				java.util.Map<String, String> maptFTPDelete_113 = new java.util.HashMap<String, String>();
				maptFTPDelete_113.put("FORD_LU_ETHNIC_CODES_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_113);

				java.util.Map<String, String> maptFTPDelete_114 = new java.util.HashMap<String, String>();
				maptFTPDelete_114.put("FORD_NEW_FACT*" + context.reportMonth1
						+ "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_114);

				java.util.Map<String, String> maptFTPDelete_115 = new java.util.HashMap<String, String>();
				maptFTPDelete_115.put("FORD_NEW_FACT_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_115);

				java.util.Map<String, String> maptFTPDelete_116 = new java.util.HashMap<String, String>();
				maptFTPDelete_116.put("FORD_NEW_USED_SALES_TIME_PERIOD*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_116);

				java.util.Map<String, String> maptFTPDelete_117 = new java.util.HashMap<String, String>();
				maptFTPDelete_117.put(
						"FORD_NEW_USED_SALES_TIME_PERIOD_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_117);

				java.util.Map<String, String> maptFTPDelete_118 = new java.util.HashMap<String, String>();
				maptFTPDelete_118.put("FORD_STANDARD_GEOGRAPHY*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_118);

				java.util.Map<String, String> maptFTPDelete_119 = new java.util.HashMap<String, String>();
				maptFTPDelete_119.put("FORD_STANDARD_GEOGRAPHY_COUNT.txt.gpg",
						"");
				listtFTPDelete_1.add(maptFTPDelete_119);

				java.util.Map<String, String> maptFTPDelete_120 = new java.util.HashMap<String, String>();
				maptFTPDelete_120.put("FORD_TARGET_INCOME*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_120);

				java.util.Map<String, String> maptFTPDelete_121 = new java.util.HashMap<String, String>();
				maptFTPDelete_121.put("FORD_TARGET_INCOME_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_121);

				java.util.Map<String, String> maptFTPDelete_122 = new java.util.HashMap<String, String>();
				maptFTPDelete_122.put("FORD_USED_FACT*" + context.reportMonth1
						+ "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_122);

				java.util.Map<String, String> maptFTPDelete_123 = new java.util.HashMap<String, String>();
				maptFTPDelete_123.put("FORD_USED_FACT_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_123);

				java.util.Map<String, String> maptFTPDelete_124 = new java.util.HashMap<String, String>();
				maptFTPDelete_124.put("FORD_VEH_AGE_BAND*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_124);

				java.util.Map<String, String> maptFTPDelete_125 = new java.util.HashMap<String, String>();
				maptFTPDelete_125.put("FORD_VEH_AGE_BAND_COUNT.txt.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_125);

				java.util.Map<String, String> maptFTPDelete_126 = new java.util.HashMap<String, String>();
				maptFTPDelete_126.put("FORD_VEHICLE_ATTRIBUTES*"
						+ context.reportMonth1 + "*.gpg", "");
				listtFTPDelete_1.add(maptFTPDelete_126);

				java.util.Map<String, String> maptFTPDelete_127 = new java.util.HashMap<String, String>();
				maptFTPDelete_127.put("FORD_VEHICLE_ATTRIBUTES_COUNT.txt.gpg",
						"");
				listtFTPDelete_1.add(maptFTPDelete_127);

				String remotedirtFTPDelete_1 = context.ftpDirectory;
				ftp_tFTPDelete_1.chdir(remotedirtFTPDelete_1);
				String roottFTPDelete_1 = ftp_tFTPDelete_1.pwd();

				log.info("tFTPDelete_1 - Deleting file from server.");

				for (java.util.Map<String, String> maptFTPDelete_1 : listtFTPDelete_1) {

					/**
					 * [tFTPDelete_1 begin ] stop
					 */

					/**
					 * [tFTPDelete_1 main ] start
					 */

					currentComponent = "tFTPDelete_1";

					try {

						globalMap.put("tFTPDelete_1_CURRENT_STATUS",
								"No file deleted.");
						java.util.Set<String> keySettFTPDelete_1 = maptFTPDelete_1
								.keySet();
						try {
							for (String keytFTPDelete_1 : keySettFTPDelete_1) {
								String filemasktFTPDelete_1 = keytFTPDelete_1;
								String dirtFTPDelete_1 = null;

								String masktFTPDelete_1 = filemasktFTPDelete_1
										.replaceAll("\\\\", "/");

								int itFTPDelete_1 = masktFTPDelete_1
										.lastIndexOf('/');
								if (itFTPDelete_1 != -1) {
									dirtFTPDelete_1 = masktFTPDelete_1
											.substring(0, itFTPDelete_1);
									masktFTPDelete_1 = masktFTPDelete_1
											.substring(itFTPDelete_1 + 1);
								}
								if (dirtFTPDelete_1 != null
										&& !"".equals(dirtFTPDelete_1))
									ftp_tFTPDelete_1.chdir(dirtFTPDelete_1);

								masktFTPDelete_1 = org.apache.oro.text.GlobCompiler
										.globToPerl5(
												masktFTPDelete_1.toCharArray(),
												org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

								String[] fileName_tFTPDelete_1 = null;
								boolean dirFailed_tFTPDelete_1 = false;
								try {
									fileName_tFTPDelete_1 = ftp_tFTPDelete_1
											.dir(null, false);
								} catch (com.enterprisedt.net.ftp.FTPException e_tFTPDelete_1) {
									dirFailed_tFTPDelete_1 = true;

									log.warn("tFTPDelete_1 - "
											+ e_tFTPDelete_1.getMessage());

								}
								if ((fileName_tFTPDelete_1 == null)
										|| dirFailed_tFTPDelete_1
										|| (fileName_tFTPDelete_1.length <= 0)) {
									com.enterprisedt.net.ftp.FTPFile[] fileList_tFTPDelete_1 = ftp_tFTPDelete_1
											.dirDetails(null);
									fileName_tFTPDelete_1 = new String[fileList_tFTPDelete_1.length];
									for (int i_tFTPDelete_1 = 0; i_tFTPDelete_1 < fileList_tFTPDelete_1.length; i_tFTPDelete_1++) {
										fileName_tFTPDelete_1[i_tFTPDelete_1] = fileList_tFTPDelete_1[i_tFTPDelete_1]
												.getName();
									}
								}
								for (String file_tFTPDelete_1 : fileName_tFTPDelete_1) {
									if (file_tFTPDelete_1
											.matches(masktFTPDelete_1)) {
										ftp_tFTPDelete_1
												.delete(file_tFTPDelete_1);

										log.debug("tFTPDelete_1 - File '"
												+ file_tFTPDelete_1
												+ "' was deleted from the remote directory "
												+ context.ftpDirectory + ".");

										globalMap.put(
												"tFTPDelete_1_CURRENT_STATUS",
												"File deleted.");
										nb_file_tFTPDelete_1++;
									}
								}
							}
						} catch (com.enterprisedt.net.ftp.FTPException e_tFTPDelete_1) {
							globalMap.put("tFTPDelete_1_CURRENT_STATUS",
									"Deleting file action error");
							throw e_tFTPDelete_1;
						}
						ftp_tFTPDelete_1.chdir(roottFTPDelete_1);
					} catch (java.lang.Exception e_tFTPDelete_1) {

						log.error("tFTPDelete_1 - "
								+ e_tFTPDelete_1.getMessage());

						System.err.print(e_tFTPDelete_1.getMessage());
					}

					tos_count_tFTPDelete_1++;

					/**
					 * [tFTPDelete_1 main ] stop
					 */

					/**
					 * [tFTPDelete_1 end ] start
					 */

					currentComponent = "tFTPDelete_1";

				}

				log.info("tFTPDelete_1 - Closing the connection to the server.");

				ftp_tFTPDelete_1.quit();

				log.info("tFTPDelete_1 - Connection to the server closed.");

				globalMap.put("tFTPDelete_1_NB_FILE", nb_file_tFTPDelete_1);

				log.info("tFTPDelete_1 - Deleted files count: "
						+ nb_file_tFTPDelete_1 + ".");

				if (log.isInfoEnabled())
					log.info("tFTPDelete_1 - " + "Done.");

				ok_Hash.put("tFTPDelete_1", true);
				end_Hash.put("tFTPDelete_1", System.currentTimeMillis());

				tFTPPut_1Process(globalMap);

				/**
				 * [tFTPDelete_1 end ] stop
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
				 * [tFTPDelete_1 finally ] start
				 */

				currentComponent = "tFTPDelete_1";

				/**
				 * [tFTPDelete_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPDelete_1_SUBPROCESS_STATE", 1);
	}

	public void tFTPPut_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFTPPut_1_SUBPROCESS_STATE", 0);

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
				 * [tFTPPut_1 begin ] start
				 */

				ok_Hash.put("tFTPPut_1", false);
				start_Hash.put("tFTPPut_1", System.currentTimeMillis());

				currentComponent = "tFTPPut_1";

				int tos_count_tFTPPut_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFTPPut_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFTPPut_1 = new StringBuilder();
				log4jParamters_tFTPPut_1.append("Parameters:");
				log4jParamters_tFTPPut_1.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("HOST" + " = "
						+ "context.ftpHost");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("PORT" + " = " + "21");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("USERNAME" + " = "
						+ "context.ftpUser");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("PASSWORD"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.ftpPassword))
								.substring(0, 4) + "...");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("SFTP" + " = " + "false");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("FTPS" + " = " + "false");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1
						.append("LOCALDIR"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("REMOTEDIR" + " = "
						+ "context.ftpDirectory");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("MODE" + " = " + "binary");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("OVERWRITE" + " = " + "always");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("APPEND" + " = " + "false");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1
						.append("PERL5_REGEX" + " = " + "false");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("FILES" + " = " + "[{FILEMASK="
						+ ("\"*.gpg\"") + ", NEWNAME=" + ("\"\"") + "}]");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("CONNECT_MODE" + " = "
						+ "PASSIVE");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1
						.append("DIE_ON_ERROR" + " = " + "true");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("USE_PROXY" + " = " + "false");
				log4jParamters_tFTPPut_1.append(" | ");
				log4jParamters_tFTPPut_1.append("IGNORE_FAILURE_AT_QUIT"
						+ " = " + "false");
				log4jParamters_tFTPPut_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFTPPut_1 - " + log4jParamters_tFTPPut_1);

				int nb_file_tFTPPut_1 = 0;
				// *** ftp *** //
				com.enterprisedt.net.ftp.FTPClient ftp_tFTPPut_1 = null;

				ftp_tFTPPut_1 = new com.enterprisedt.net.ftp.FTPClient();
				ftp_tFTPPut_1.setRemoteHost(context.ftpHost);
				ftp_tFTPPut_1.setRemotePort(21);

				log.debug("tFTPPut_1 - " + "Using the passive mode.");

				ftp_tFTPPut_1
						.setConnectMode(com.enterprisedt.net.ftp.FTPConnectMode.PASV);

				ftp_tFTPPut_1.setControlEncoding("ISO-8859-15");

				log.info("tFTPPut_1 - Attempt to connect to '"
						+ context.ftpHost + "' with username '"
						+ context.ftpUser + "'.");

				ftp_tFTPPut_1.connect();

				final String decryptedPassword_tFTPPut_1 = context.ftpPassword;

				ftp_tFTPPut_1.login(context.ftpUser,
						decryptedPassword_tFTPPut_1);

				log.info("tFTPPut_1 - Connect to '" + context.ftpHost
						+ "' has succeeded.");

				// msg_tFTPPut_1 likes a String[] to save the message from
				// transfer.
				com.enterprisedt.net.ftp.TransferCompleteStrings msg_tFTPPut_1 = ftp_tFTPPut_1
						.getTransferCompleteMessages();
				msg_tFTPPut_1.clearAll();
				java.util.List<java.util.Map<String, String>> listtFTPPut_1 = new java.util.ArrayList<java.util.Map<String, String>>();

				java.util.Map<String, String> maptFTPPut_10 = new java.util.HashMap<String, String>();
				maptFTPPut_10.put("*.gpg", "");
				listtFTPPut_1.add(maptFTPPut_10);
				String remotedirtFTPPut_1 = context.ftpDirectory;
				ftp_tFTPPut_1.chdir(remotedirtFTPPut_1);

				ftp_tFTPPut_1
						.setType(com.enterprisedt.net.ftp.FTPTransferType.BINARY);

				String localdirtFTPPut_1 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Ford_Fact_Files/NVUV/" + context.reportMonth;

				log.info("tFTPPut_1 - Uploading files to the server.");

				for (java.util.Map<String, String> maptFTPPut_1 : listtFTPPut_1) {

					/**
					 * [tFTPPut_1 begin ] stop
					 */

					/**
					 * [tFTPPut_1 main ] start
					 */

					currentComponent = "tFTPPut_1";

					try {

						String currentStatus_tFTPPut_1 = "No file transfered.";
						java.util.Set<String> keySettFTPPut_1 = maptFTPPut_1
								.keySet();
						for (String keytFTPPut_1 : keySettFTPPut_1) {
							if (keytFTPPut_1 == null || "".equals(keytFTPPut_1)) {
								System.err.println("file name invalid!");
								log.error("tFTPPut_1 - file name invalid!");
								continue;
							}
							String tempdirtFTPPut_1 = localdirtFTPPut_1;
							String filemasktFTPPut_1 = keytFTPPut_1;
							String dirtFTPPut_1 = null;
							String masktFTPPut_1 = filemasktFTPPut_1
									.replaceAll("\\\\", "/");
							int itFTPPut_1 = masktFTPPut_1.lastIndexOf('/');
							if (itFTPPut_1 != -1) {
								dirtFTPPut_1 = masktFTPPut_1.substring(0,
										itFTPPut_1);
								masktFTPPut_1 = masktFTPPut_1
										.substring(itFTPPut_1 + 1);
							}
							if (dirtFTPPut_1 != null
									&& !"".equals(dirtFTPPut_1)) {
								tempdirtFTPPut_1 = tempdirtFTPPut_1 + "/"
										+ dirtFTPPut_1;
							}
							masktFTPPut_1 = masktFTPPut_1.replaceAll("\\.",
									"\\\\.").replaceAll("\\*", ".*");
							final String finalMasktFTPPut_1 = masktFTPPut_1;
							java.io.File[] listingstFTPPut_1 = null;
							java.io.File filetFTPPut_1 = new java.io.File(
									tempdirtFTPPut_1);
							if (filetFTPPut_1.isDirectory()) {
								listingstFTPPut_1 = filetFTPPut_1
										.listFiles(new java.io.FileFilter() {
											public boolean accept(
													java.io.File pathname) {
												boolean result = false;
												if (pathname != null
														&& pathname.isFile()) {
													result = java.util.regex.Pattern
															.compile(
																	finalMasktFTPPut_1)
															.matcher(
																	pathname.getName())
															.find();
												}
												return result;
											}
										});
							}
							if (listingstFTPPut_1 != null
									&& listingstFTPPut_1.length > 0) {
								for (int mtFTPPut_1 = 0; mtFTPPut_1 < listingstFTPPut_1.length; mtFTPPut_1++) {
									java.io.File file_in_localDir = listingstFTPPut_1[mtFTPPut_1];
									String uploadingFileName_tFTPPut_1 = file_in_localDir
											.getName();
									String newFileName_tFTPPut_1 = maptFTPPut_1
											.get(keytFTPPut_1);
									String newName_tFTPPut_1 = (""
											.equals(newFileName_tFTPPut_1)) ? uploadingFileName_tFTPPut_1
											: newFileName_tFTPPut_1;
									boolean targetFileExistsOnRemoteServer_tFTPPut_1 = false;
									try {
										if (uploadingFileName_tFTPPut_1
												.matches(masktFTPPut_1)) {
											ftp_tFTPPut_1
													.put(tempdirtFTPPut_1
															+ "/"
															+ uploadingFileName_tFTPPut_1,
															newName_tFTPPut_1);

											currentStatus_tFTPPut_1 = "File rename OK.";
											msg_tFTPPut_1
													.add("file: "
															+ file_in_localDir
																	.getAbsolutePath()
															+ ", size: "
															+ file_in_localDir
																	.length()
															+ " bytes upload successfully");
											log.debug("tFTPPut_1 - Uploaded file '"
													+ uploadingFileName_tFTPPut_1
													+ "' successfully.");

											nb_file_tFTPPut_1++;
										}
									} catch (com.enterprisedt.net.ftp.FTPException e_tFTPPut_1) {

										msg_tFTPPut_1.add("file "
												+ file_in_localDir
														.getAbsolutePath()
												+ " not found?");

										currentStatus_tFTPPut_1 = "File rename fail.";
										globalMap
												.put("tFTPPut_1_CURRENT_FILE_EXISTS",
														targetFileExistsOnRemoteServer_tFTPPut_1);
										throw e_tFTPPut_1;
									}
								}
							} else {
								log.warn("tFTPPut_1 - No match file exist!");
								System.err.println("No match file exist!");
							}

						}
						globalMap.put("tFTPPut_1_CURRENT_STATUS",
								currentStatus_tFTPPut_1);

					} catch (java.lang.Exception e_tFTPPut_1) {
						throw (e_tFTPPut_1);
					}

					tos_count_tFTPPut_1++;

					/**
					 * [tFTPPut_1 main ] stop
					 */

					/**
					 * [tFTPPut_1 end ] start
					 */

					currentComponent = "tFTPPut_1";

					// *** ftp *** //
				}

				msg_tFTPPut_1.add(ftp_tFTPPut_1.getUploadCount()
						+ " files have been uploaded.");

				String[] msgAll_tFTPPut_1 = msg_tFTPPut_1.getAll();
				StringBuffer sb_tFTPPut_1 = new StringBuffer();
				if (msgAll_tFTPPut_1 != null) {
					for (String item_tFTPPut_1 : msgAll_tFTPPut_1) {
						sb_tFTPPut_1.append(item_tFTPPut_1).append("\n");
					}
				}
				globalMap.put("tFTPPut_1_TRANSFER_MESSAGES",
						sb_tFTPPut_1.toString());

				log.info("tFTPPut_1 - Closing the connection to the server.");

				ftp_tFTPPut_1.quit();

				log.info("tFTPPut_1 - Connection to the server closed.");

				globalMap.put("tFTPPut_1_NB_FILE", nb_file_tFTPPut_1);
				log.info("tFTPPut_1 - Uploaded files count: "
						+ nb_file_tFTPPut_1 + ".");

				if (log.isInfoEnabled())
					log.info("tFTPPut_1 - " + "Done.");

				ok_Hash.put("tFTPPut_1", true);
				end_Hash.put("tFTPPut_1", System.currentTimeMillis());

				tFileList_4Process(globalMap);

				/**
				 * [tFTPPut_1 end ] stop
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
				 * [tFTPPut_1 finally ] start
				 */

				currentComponent = "tFTPPut_1";

				/**
				 * [tFTPPut_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPPut_1_SUBPROCESS_STATE", 1);
	}

	public void tFileList_4Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_4_SUBPROCESS_STATE", 0);

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
				 * [tFileList_4 begin ] start
				 */

				int NB_ITERATE_tJava_3 = 0; // for statistics

				ok_Hash.put("tFileList_4", false);
				start_Hash.put("tFileList_4", System.currentTimeMillis());

				currentComponent = "tFileList_4";

				int tos_count_tFileList_4 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_4 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_4 = new StringBuilder();
				log4jParamters_tFileList_4.append("Parameters:");
				log4jParamters_tFileList_4
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("LIST_MODE" + " = " + "BOTH");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.gpg\"") + "}]");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4
						.append("IFEXCLUDE" + " = " + "false");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_4 - " + log4jParamters_tFileList_4);

				final StringBuffer log4jSb_tFileList_4 = new StringBuffer();

				String directory_tFileList_4 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Ford_Fact_Files/NVUV/" + context.reportMonth;
				final java.util.List<String> maskList_tFileList_4 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_4 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_4.add("*.gpg");
				for (final String filemask_tFileList_4 : maskList_tFileList_4) {
					String filemask_compile_tFileList_4 = filemask_tFileList_4;

					filemask_compile_tFileList_4 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_4.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_4 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_4);
					patternList_tFileList_4.add(fileNamePattern_tFileList_4);
				}
				int NB_FILEtFileList_4 = 0;

				final boolean case_sensitive_tFileList_4 = true;
				final java.util.List<java.io.File> list_tFileList_4 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_4 = new java.util.HashSet<String>();
				java.io.File file_tFileList_4 = new java.io.File(
						directory_tFileList_4);

				file_tFileList_4.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);

						String fileName_tFileList_4 = file.getName();
						for (final java.util.regex.Pattern fileNamePattern_tFileList_4 : patternList_tFileList_4) {
							if (fileNamePattern_tFileList_4.matcher(
									fileName_tFileList_4).matches()) {
								if (!filePath_tFileList_4.contains(file
										.getAbsolutePath())) {
									list_tFileList_4.add(file);
									filePath_tFileList_4.add(file
											.getAbsolutePath());
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_4);

				log.info("tFileList_4 - Start to list files");

				for (int i_tFileList_4 = 0; i_tFileList_4 < list_tFileList_4
						.size(); i_tFileList_4++) {
					java.io.File files_tFileList_4 = list_tFileList_4
							.get(i_tFileList_4);
					String fileName_tFileList_4 = files_tFileList_4.getName();

					String currentFileName_tFileList_4 = files_tFileList_4
							.getName();
					String currentFilePath_tFileList_4 = files_tFileList_4
							.getAbsolutePath();
					String currentFileDirectory_tFileList_4 = files_tFileList_4
							.getParent();
					String currentFileExtension_tFileList_4 = null;

					if (files_tFileList_4.getName().contains(".")
							&& files_tFileList_4.isFile()) {
						currentFileExtension_tFileList_4 = files_tFileList_4
								.getName().substring(
										files_tFileList_4.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_4 = "";
					}

					NB_FILEtFileList_4++;
					globalMap.put("tFileList_4_CURRENT_FILE",
							currentFileName_tFileList_4);
					globalMap.put("tFileList_4_CURRENT_FILEPATH",
							currentFilePath_tFileList_4);
					globalMap.put("tFileList_4_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_4);
					globalMap.put("tFileList_4_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_4);
					globalMap.put("tFileList_4_NB_FILE", NB_FILEtFileList_4);

					log.info("tFileList_4 - Current file or directory path : "
							+ currentFilePath_tFileList_4);

					/**
					 * [tFileList_4 begin ] stop
					 */

					/**
					 * [tFileList_4 main ] start
					 */

					currentComponent = "tFileList_4";

					tos_count_tFileList_4++;

					/**
					 * [tFileList_4 main ] stop
					 */
					NB_ITERATE_tJava_3++;

					/**
					 * [tJava_3 begin ] start
					 */

					ok_Hash.put("tJava_3", false);
					start_Hash.put("tJava_3", System.currentTimeMillis());

					currentComponent = "tJava_3";

					int tos_count_tJava_3 = 0;

					context.fileName += ((String) globalMap
							.get("tFileList_4_CURRENT_FILE") + "<br>");

					/**
					 * [tJava_3 begin ] stop
					 */

					/**
					 * [tJava_3 main ] start
					 */

					currentComponent = "tJava_3";

					tos_count_tJava_3++;

					/**
					 * [tJava_3 main ] stop
					 */

					/**
					 * [tJava_3 end ] start
					 */

					currentComponent = "tJava_3";

					ok_Hash.put("tJava_3", true);
					end_Hash.put("tJava_3", System.currentTimeMillis());

					/**
					 * [tJava_3 end ] stop
					 */

					/**
					 * [tFileList_4 end ] start
					 */

					currentComponent = "tFileList_4";

				}
				globalMap.put("tFileList_4_NB_FILE", NB_FILEtFileList_4);

				log.info("tFileList_4 - File or directory count : "
						+ NB_FILEtFileList_4);

				if (log.isInfoEnabled())
					log.info("tFileList_4 - " + "Done.");

				ok_Hash.put("tFileList_4", true);
				end_Hash.put("tFileList_4", System.currentTimeMillis());

				/**
				 * [tFileList_4 end ] stop
				 */
			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_4:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tJava_5Process(globalMap);

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
				 * [tFileList_4 finally ] start
				 */

				currentComponent = "tFileList_4";

				/**
				 * [tFileList_4 finally ] stop
				 */

				/**
				 * [tJava_3 finally ] start
				 */

				currentComponent = "tJava_3";

				/**
				 * [tJava_3 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_4_SUBPROCESS_STATE", 1);
	}

	public void tJava_5Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tJava_5_SUBPROCESS_STATE", 0);

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
				 * [tJava_5 begin ] start
				 */

				ok_Hash.put("tJava_5", false);
				start_Hash.put("tJava_5", System.currentTimeMillis());

				currentComponent = "tJava_5";

				int tos_count_tJava_5 = 0;

				System.out.println("Checking number of files on FTP site.");

				/**
				 * [tJava_5 begin ] stop
				 */

				/**
				 * [tJava_5 main ] start
				 */

				currentComponent = "tJava_5";

				tos_count_tJava_5++;

				/**
				 * [tJava_5 main ] stop
				 */

				/**
				 * [tJava_5 end ] start
				 */

				currentComponent = "tJava_5";

				ok_Hash.put("tJava_5", true);
				end_Hash.put("tJava_5", System.currentTimeMillis());

				if (((Integer) globalMap.get("tFTPPut_1_NB_FILE")) == 28) {

					tSendMail_4Process(globalMap);
				}

				if (((Integer) globalMap.get("tFTPPut_1_NB_FILE")) != 28) {

					tSendMail_1Process(globalMap);
				}

				/**
				 * [tJava_5 end ] stop
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
				 * [tJava_5 finally ] start
				 */

				currentComponent = "tJava_5";

				/**
				 * [tJava_5 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tJava_5_SUBPROCESS_STATE", 1);
	}

	public void tSendMail_4Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tSendMail_4_SUBPROCESS_STATE", 0);

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
				 * [tSendMail_4 begin ] start
				 */

				ok_Hash.put("tSendMail_4", false);
				start_Hash.put("tSendMail_4", System.currentTimeMillis());

				currentComponent = "tSendMail_4";

				int tos_count_tSendMail_4 = 0;

				if (log.isInfoEnabled())
					log.info("tSendMail_4 - " + "Start to work.");
				StringBuilder log4jParamters_tSendMail_4 = new StringBuilder();
				log4jParamters_tSendMail_4.append("Parameters:");
				log4jParamters_tSendMail_4.append("TO" + " = "
						+ "context.emailTo");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("FROM" + " = "
						+ "context.emailFrom");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("CC" + " = "
						+ "context.emailCC");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("BCC" + " = " + "\"\"");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4
						.append("SUBJECT"
								+ " = "
								+ "context.client+\"_SHP_\"+context.salesCostCenter+\"_[\"+context.jobNumber+\"]_For_Report_Month:_\" +context.reportMonth");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4
						.append("MESSAGE"
								+ " = "
								+ "\"<html> <body>  <img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>   <br>  <br>  Please be advised the following files are now available on the ftp site:  <br>  <br>  \"+context.fileName+\"  <br>  <br>  If you have any questions regarding the contents of this data, please contact:   <br>   <br>  <font face=Elephant>  \"+context.salesName+\" </font> <br>  \"+context.salesTitle+\"<br>  Phone:  \"+context.salesPhone+\" <br>  Email:  \"+context.salesEmail+\" <br>   <br>   <b> <i>  Thank you for choosing IHS Markit as your solutions provider. We look forward to working with you again. </b> </i>   <br>   <br>  Job# \"+context.jobNumber+\"   <br>  Shipped by: \"+context.resourceInt+\"  </body>  </html>\"");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("ATTACHMENTS" + " = "
						+ "[{CONTENT_TRANSFER_ENCODING=" + ("DEFAULT")
						+ ", FILE="
						+ ("context.shipping+\"/Shipping_Letter_Stat.doc\"")
						+ "}]");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("SMTP_HOST" + " = "
						+ "\"smtp.dc.polk.com\"");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("SMTP_PORT" + " = " + "25");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("SSL" + " = " + "false");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("STARTTLS" + " = " + "false");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("IMPORTANCE" + " = "
						+ "Normal");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4
						.append("NEED_AUTH" + " = " + "false");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("DIE_ON_ERROR" + " = "
						+ "true");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("TEXT_SUBTYPE" + " = "
						+ "html");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("SET_LOCALHOST" + " = "
						+ "false");
				log4jParamters_tSendMail_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSendMail_4 - " + log4jParamters_tSendMail_4);

				/**
				 * [tSendMail_4 begin ] stop
				 */

				/**
				 * [tSendMail_4 main ] start
				 */

				currentComponent = "tSendMail_4";

				String smtpHost_tSendMail_4 = "smtp.dc.polk.com";
				String smtpPort_tSendMail_4 = "25";
				String from_tSendMail_4 = (context.emailFrom);
				String to_tSendMail_4 = (context.emailTo).replace(";", ",");
				String cc_tSendMail_4 = ((context.emailCC) == null || ""
						.equals(context.emailCC)) ? null : (context.emailCC)
						.replace(";", ",");
				String bcc_tSendMail_4 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String subject_tSendMail_4 = (context.client + "_SHP_"
						+ context.salesCostCenter + "_[" + context.jobNumber
						+ "]_For_Report_Month:_" + context.reportMonth);

				java.util.List<java.util.Map<String, String>> headers_tSendMail_4 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_4 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_4 = new java.util.ArrayList<String>();
				attachments_tSendMail_4.add(context.shipping
						+ "/Shipping_Letter_Stat.doc");
				contentTransferEncoding_tSendMail_4.add("DEFAULT");

				String message_tSendMail_4 = (("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\nPlease be advised the following files are now available on the ftp site:\n<br>\n<br>\n"
						+ context.fileName
						+ "\n<br>\n<br>\nIf you have any questions regarding the contents of this data, please contact:\n <br>\n <br>\n<font face=Elephant>\n"
						+ context.salesName
						+ " </font> <br>\n"
						+ context.salesTitle
						+ "<br>\nPhone:  "
						+ context.salesPhone
						+ " <br>\nEmail:  "
						+ context.salesEmail
						+ " <br>\n <br>\n <b> <i>\nThank you for choosing IHS Markit as your solutions provider. We look forward to working with you again. </b> </i>\n <br>\n <br>\nJob# "
						+ context.jobNumber
						+ "\n <br>\nShipped by: "
						+ context.resourceInt + "\n</body>\n</html>") == null || ""
						.equals("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\nPlease be advised the following files are now available on the ftp site:\n<br>\n<br>\n"
								+ context.fileName
								+ "\n<br>\n<br>\nIf you have any questions regarding the contents of this data, please contact:\n <br>\n <br>\n<font face=Elephant>\n"
								+ context.salesName
								+ " </font> <br>\n"
								+ context.salesTitle
								+ "<br>\nPhone:  "
								+ context.salesPhone
								+ " <br>\nEmail:  "
								+ context.salesEmail
								+ " <br>\n <br>\n <b> <i>\nThank you for choosing IHS Markit as your solutions provider. We look forward to working with you again. </b> </i>\n <br>\n <br>\nJob# "
								+ context.jobNumber
								+ "\n <br>\nShipped by: "
								+ context.resourceInt + "\n</body>\n</html>")) ? "\"\""
						: ("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\nPlease be advised the following files are now available on the ftp site:\n<br>\n<br>\n"
								+ context.fileName
								+ "\n<br>\n<br>\nIf you have any questions regarding the contents of this data, please contact:\n <br>\n <br>\n<font face=Elephant>\n"
								+ context.salesName
								+ " </font> <br>\n"
								+ context.salesTitle
								+ "<br>\nPhone:  "
								+ context.salesPhone
								+ " <br>\nEmail:  "
								+ context.salesEmail
								+ " <br>\n <br>\n <b> <i>\nThank you for choosing IHS Markit as your solutions provider. We look forward to working with you again. </b> </i>\n <br>\n <br>\nJob# "
								+ context.jobNumber
								+ "\n <br>\nShipped by: "
								+ context.resourceInt + "\n</body>\n</html>");
				java.util.Properties props_tSendMail_4 = System.getProperties();
				props_tSendMail_4.put("mail.smtp.host", smtpHost_tSendMail_4);
				props_tSendMail_4.put("mail.smtp.port", smtpPort_tSendMail_4);
				props_tSendMail_4.put("mail.mime.encodefilename", "true");
				try {

					log.info("tSendMail_4 - Connection attempt to '"
							+ smtpHost_tSendMail_4 + "'.");

					props_tSendMail_4.put("mail.smtp.auth", "false");
					javax.mail.Session session_tSendMail_4 = javax.mail.Session
							.getInstance(props_tSendMail_4, null);

					log.info("tSendMail_4 - Connection to '"
							+ smtpHost_tSendMail_4 + "' has succeeded.");

					javax.mail.Message msg_tSendMail_4 = new javax.mail.internet.MimeMessage(
							session_tSendMail_4);
					msg_tSendMail_4
							.setFrom(new javax.mail.internet.InternetAddress(
									from_tSendMail_4, null));
					msg_tSendMail_4.setRecipients(
							javax.mail.Message.RecipientType.TO,
							javax.mail.internet.InternetAddress.parse(
									to_tSendMail_4, false));
					if (cc_tSendMail_4 != null)
						msg_tSendMail_4.setRecipients(
								javax.mail.Message.RecipientType.CC,
								javax.mail.internet.InternetAddress.parse(
										cc_tSendMail_4, false));
					if (bcc_tSendMail_4 != null)
						msg_tSendMail_4.setRecipients(
								javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(
										bcc_tSendMail_4, false));
					msg_tSendMail_4.setSubject(subject_tSendMail_4);

					for (int i_tSendMail_4 = 0; i_tSendMail_4 < headers_tSendMail_4
							.size(); i_tSendMail_4++) {
						java.util.Map<String, String> header_tSendMail_4 = headers_tSendMail_4
								.get(i_tSendMail_4);
						msg_tSendMail_4.setHeader(
								header_tSendMail_4.get("KEY"),
								header_tSendMail_4.get("VALUE"));
					}
					msg_tSendMail_4.setSentDate(new Date());
					msg_tSendMail_4.setHeader("X-Priority", "3"); // High->1
																	// Normal->3
																	// Low->5
					javax.mail.Multipart mp_tSendMail_4 = new javax.mail.internet.MimeMultipart();
					javax.mail.internet.MimeBodyPart mbpText_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
					mbpText_tSendMail_4.setText(message_tSendMail_4,
							"ISO-8859-15", "html");
					mp_tSendMail_4.addBodyPart(mbpText_tSendMail_4);

					javax.mail.internet.MimeBodyPart mbpFile_tSendMail_4 = null;

					for (int i_tSendMail_4 = 0; i_tSendMail_4 < attachments_tSendMail_4
							.size(); i_tSendMail_4++) {
						String filename_tSendMail_4 = attachments_tSendMail_4
								.get(i_tSendMail_4);
						javax.activation.FileDataSource fds_tSendMail_4 = null;
						java.io.File file_tSendMail_4 = new java.io.File(
								filename_tSendMail_4);

						if (file_tSendMail_4.isDirectory()) {
							java.io.File[] subFiles_tSendMail_4 = file_tSendMail_4
									.listFiles();
							for (java.io.File subFile_tSendMail_4 : subFiles_tSendMail_4) {
								if (subFile_tSendMail_4.isFile()) {
									fds_tSendMail_4 = new javax.activation.FileDataSource(
											subFile_tSendMail_4
													.getAbsolutePath());
									mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
									mbpFile_tSendMail_4
											.setDataHandler(new javax.activation.DataHandler(
													fds_tSendMail_4));
									mbpFile_tSendMail_4
											.setFileName(javax.mail.internet.MimeUtility
													.encodeText(fds_tSendMail_4
															.getName()));
									if (contentTransferEncoding_tSendMail_4
											.get(i_tSendMail_4)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_4.setHeader(
												"Content-Transfer-Encoding",
												"base64");
									}
									mp_tSendMail_4
											.addBodyPart(mbpFile_tSendMail_4);
								}
							}
						} else {
							mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
							fds_tSendMail_4 = new javax.activation.FileDataSource(
									filename_tSendMail_4);
							mbpFile_tSendMail_4
									.setDataHandler(new javax.activation.DataHandler(
											fds_tSendMail_4));
							mbpFile_tSendMail_4
									.setFileName(javax.mail.internet.MimeUtility
											.encodeText(fds_tSendMail_4
													.getName()));
							if (contentTransferEncoding_tSendMail_4.get(
									i_tSendMail_4).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_4.setHeader(
										"Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_4.addBodyPart(mbpFile_tSendMail_4);
						}
					}
					// -- set the content --
					msg_tSendMail_4.setContent(mp_tSendMail_4);
					// add handlers for main MIME types
					javax.activation.MailcapCommandMap mc_tSendMail_4 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
							.getDefaultCommandMap();
					mc_tSendMail_4
							.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
					mc_tSendMail_4
							.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
					mc_tSendMail_4
							.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
					mc_tSendMail_4
							.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
					mc_tSendMail_4
							.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
					javax.activation.CommandMap
							.setDefaultCommandMap(mc_tSendMail_4);
					// -- Send the message --
					javax.mail.Transport.send(msg_tSendMail_4);
				} catch (java.lang.Exception e) {

					throw (e);

				} finally {
					props_tSendMail_4.remove("mail.smtp.host");
					props_tSendMail_4.remove("mail.smtp.port");

					props_tSendMail_4.remove("mail.mime.encodefilename");

					props_tSendMail_4.remove("mail.smtp.auth");
				}

				tos_count_tSendMail_4++;

				/**
				 * [tSendMail_4 main ] stop
				 */

				/**
				 * [tSendMail_4 end ] start
				 */

				currentComponent = "tSendMail_4";

				if (log.isInfoEnabled())
					log.info("tSendMail_4 - " + "Done.");

				ok_Hash.put("tSendMail_4", true);
				end_Hash.put("tSendMail_4", System.currentTimeMillis());

				tFileArchive_1Process(globalMap);

				/**
				 * [tSendMail_4 end ] stop
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
				 * [tSendMail_4 finally ] start
				 */

				currentComponent = "tSendMail_4";

				/**
				 * [tSendMail_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSendMail_4_SUBPROCESS_STATE", 1);
	}

	public void tFileArchive_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileArchive_1_SUBPROCESS_STATE", 0);

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
				 * [tFileArchive_1 begin ] start
				 */

				ok_Hash.put("tFileArchive_1", false);
				start_Hash.put("tFileArchive_1", System.currentTimeMillis());

				currentComponent = "tFileArchive_1";

				int tos_count_tFileArchive_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFileArchive_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFileArchive_1 = new StringBuilder();
				log4jParamters_tFileArchive_1.append("Parameters:");
				log4jParamters_tFileArchive_1
						.append("SOURCE"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("SUB_DIRECTROY" + " = "
						+ "true");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1
						.append("TARGET"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+context.slash+\"Ford_Fact_FilesNVUV.zip\"");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("MKDIR" + " = " + "false");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("ARCHIVE_FORMAT" + " = "
						+ "zip");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("LEVEL" + " = " + "4");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("ALL_FILES" + " = "
						+ "true");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("OVERWRITE" + " = "
						+ "true");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("ENCRYPT_FILES" + " = "
						+ "false");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("ZIP64_MODE" + " = "
						+ "ALWAYS");
				log4jParamters_tFileArchive_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileArchive_1 - "
							+ log4jParamters_tFileArchive_1);

				/**
				 * [tFileArchive_1 begin ] stop
				 */

				/**
				 * [tFileArchive_1 main ] start
				 */

				currentComponent = "tFileArchive_1";

				final StringBuffer log4jSb_tFileArchive_1 = new StringBuffer();

				String sourceFile_tFileArchive_1 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Ford_Fact_Files/NVUV/" + context.reportMonth;

				String zipFile_tFileArchive_1 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Ford_Fact_Files/NVUV/" + context.reportMonth
						+ context.slash + "Ford_Fact_FilesNVUV.zip";

				com.talend.compress.zip.Zip zip_tFileArchive_1 = new com.talend.compress.zip.Zip(
						sourceFile_tFileArchive_1, zipFile_tFileArchive_1);
				zip_tFileArchive_1.setOverwriteExistTargetZip(true);
				zip_tFileArchive_1.setMakeTargetDir(false);
				zip_tFileArchive_1.setCompressLevel(4);
				zip_tFileArchive_1.setArchiveFormat("zip");
				zip_tFileArchive_1.setAllFiles(true);

				zip_tFileArchive_1.setContainSubDir(true);
				zip_tFileArchive_1.setEncoding("ISO-8859-15");
				zip_tFileArchive_1.setZip64Mode("ALWAYS");
				zip_tFileArchive_1.setEncrypted(false);

				final String decryptedPassword_tFileArchive_1 = routines.system.PasswordEncryptUtil
						.decryptPassword("f4f7aba1746784ea");

				zip_tFileArchive_1
						.setPassword(decryptedPassword_tFileArchive_1);

				zip_tFileArchive_1.setUseZip4jEncryption(true);
				zip_tFileArchive_1
						.setEncryptionMethod(net.lingala.zip4j.util.Zip4jConstants.ENC_METHOD_STANDARD);

				zip_tFileArchive_1.doZip();

				globalMap.put("tFileArchive_1_ARCHIVE_FILEPATH",
						zipFile_tFileArchive_1);
				globalMap
						.put("tFileArchive_1_ARCHIVE_FILENAME",
								(context.shipping + "/" + context.reportYear
										+ context.mDrive
										+ "/Ford_Fact_Files/NVUV/"
										+ context.reportMonth + context.slash + "Ford_Fact_FilesNVUV.zip")
										.contains("\\") ? (context.shipping
										+ "/" + context.reportYear
										+ context.mDrive
										+ "/Ford_Fact_Files/NVUV/"
										+ context.reportMonth + context.slash + "Ford_Fact_FilesNVUV.zip")
										.substring(((context.shipping + "/"
												+ context.reportYear
												+ context.mDrive
												+ "/Ford_Fact_Files/NVUV/"
												+ context.reportMonth
												+ context.slash + "Ford_Fact_FilesNVUV.zip")
												.lastIndexOf("\\") + 2))
										: (context.shipping + "/"
												+ context.reportYear
												+ context.mDrive
												+ "/Ford_Fact_Files/NVUV/"
												+ context.reportMonth
												+ context.slash + "Ford_Fact_FilesNVUV.zip")
												.substring(((context.shipping
														+ "/"
														+ context.reportYear
														+ context.mDrive
														+ "/Ford_Fact_Files/NVUV/"
														+ context.reportMonth
														+ context.slash + "Ford_Fact_FilesNVUV.zip")
														.lastIndexOf("/")) + 1));

				tos_count_tFileArchive_1++;

				/**
				 * [tFileArchive_1 main ] stop
				 */

				/**
				 * [tFileArchive_1 end ] start
				 */

				currentComponent = "tFileArchive_1";

				if (log.isInfoEnabled())
					log.info("tFileArchive_1 - " + "Done.");

				ok_Hash.put("tFileArchive_1", true);
				end_Hash.put("tFileArchive_1", System.currentTimeMillis());

				tFileList_3Process(globalMap);

				/**
				 * [tFileArchive_1 end ] stop
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
				 * [tFileArchive_1 finally ] start
				 */

				currentComponent = "tFileArchive_1";

				/**
				 * [tFileArchive_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileArchive_1_SUBPROCESS_STATE", 1);
	}

	public void tFileList_3Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_3_SUBPROCESS_STATE", 0);

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
				 * [tFileList_3 begin ] start
				 */

				int NB_ITERATE_tFileDelete_1 = 0; // for statistics

				ok_Hash.put("tFileList_3", false);
				start_Hash.put("tFileList_3", System.currentTimeMillis());

				currentComponent = "tFileList_3";

				int tos_count_tFileList_3 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_3 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_3 = new StringBuilder();
				log4jParamters_tFileList_3.append("Parameters:");
				log4jParamters_tFileList_3
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3
						.append("LIST_MODE" + " = " + "FILES");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}, {FILEMASK="
						+ ("\"*.gpg\"") + "}]");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3
						.append("IFEXCLUDE" + " = " + "false");
				log4jParamters_tFileList_3.append(" | ");
				log4jParamters_tFileList_3.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_3.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_3 - " + log4jParamters_tFileList_3);

				final StringBuffer log4jSb_tFileList_3 = new StringBuffer();

				String directory_tFileList_3 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Ford_Fact_Files/NVUV/" + context.reportMonth;
				final java.util.List<String> maskList_tFileList_3 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_3 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_3.add("*.txt");
				maskList_tFileList_3.add("*.gpg");
				for (final String filemask_tFileList_3 : maskList_tFileList_3) {
					String filemask_compile_tFileList_3 = filemask_tFileList_3;

					filemask_compile_tFileList_3 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_3.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_3 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_3);
					patternList_tFileList_3.add(fileNamePattern_tFileList_3);
				}
				int NB_FILEtFileList_3 = 0;

				final boolean case_sensitive_tFileList_3 = true;
				final java.util.List<java.io.File> list_tFileList_3 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_3 = new java.util.HashSet<String>();
				java.io.File file_tFileList_3 = new java.io.File(
						directory_tFileList_3);

				file_tFileList_3.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_3 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_3 : patternList_tFileList_3) {
								if (fileNamePattern_tFileList_3.matcher(
										fileName_tFileList_3).matches()) {
									if (!filePath_tFileList_3.contains(file
											.getAbsolutePath())) {
										list_tFileList_3.add(file);
										filePath_tFileList_3.add(file
												.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_3);

				log.info("tFileList_3 - Start to list files");

				for (int i_tFileList_3 = 0; i_tFileList_3 < list_tFileList_3
						.size(); i_tFileList_3++) {
					java.io.File files_tFileList_3 = list_tFileList_3
							.get(i_tFileList_3);
					String fileName_tFileList_3 = files_tFileList_3.getName();

					String currentFileName_tFileList_3 = files_tFileList_3
							.getName();
					String currentFilePath_tFileList_3 = files_tFileList_3
							.getAbsolutePath();
					String currentFileDirectory_tFileList_3 = files_tFileList_3
							.getParent();
					String currentFileExtension_tFileList_3 = null;

					if (files_tFileList_3.getName().contains(".")
							&& files_tFileList_3.isFile()) {
						currentFileExtension_tFileList_3 = files_tFileList_3
								.getName().substring(
										files_tFileList_3.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_3 = "";
					}

					NB_FILEtFileList_3++;
					globalMap.put("tFileList_3_CURRENT_FILE",
							currentFileName_tFileList_3);
					globalMap.put("tFileList_3_CURRENT_FILEPATH",
							currentFilePath_tFileList_3);
					globalMap.put("tFileList_3_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_3);
					globalMap.put("tFileList_3_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_3);
					globalMap.put("tFileList_3_NB_FILE", NB_FILEtFileList_3);

					log.info("tFileList_3 - Current file or directory path : "
							+ currentFilePath_tFileList_3);

					/**
					 * [tFileList_3 begin ] stop
					 */

					/**
					 * [tFileList_3 main ] start
					 */

					currentComponent = "tFileList_3";

					tos_count_tFileList_3++;

					/**
					 * [tFileList_3 main ] stop
					 */
					NB_ITERATE_tFileDelete_1++;

					/**
					 * [tFileDelete_1 begin ] start
					 */

					ok_Hash.put("tFileDelete_1", false);
					start_Hash.put("tFileDelete_1", System.currentTimeMillis());

					currentComponent = "tFileDelete_1";

					int tos_count_tFileDelete_1 = 0;

					if (log.isInfoEnabled())
						log.info("tFileDelete_1 - " + "Start to work.");
					StringBuilder log4jParamters_tFileDelete_1 = new StringBuilder();
					log4jParamters_tFileDelete_1.append("Parameters:");
					log4jParamters_tFileDelete_1
							.append("FILENAME"
									+ " = "
									+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/\"+((String)globalMap.get(\"tFileList_3_CURRENT_FILE\"))");
					log4jParamters_tFileDelete_1.append(" | ");
					log4jParamters_tFileDelete_1.append("FAILON" + " = "
							+ "true");
					log4jParamters_tFileDelete_1.append(" | ");
					log4jParamters_tFileDelete_1.append("FOLDER" + " = "
							+ "false");
					log4jParamters_tFileDelete_1.append(" | ");
					log4jParamters_tFileDelete_1.append("FOLDER_FILE" + " = "
							+ "false");
					log4jParamters_tFileDelete_1.append(" | ");
					if (log.isDebugEnabled())
						log.debug("tFileDelete_1 - "
								+ log4jParamters_tFileDelete_1);

					/**
					 * [tFileDelete_1 begin ] stop
					 */

					/**
					 * [tFileDelete_1 main ] start
					 */

					currentComponent = "tFileDelete_1";

					final StringBuffer log4jSb_tFileDelete_1 = new StringBuffer();

					class DeleteFoldertFileDelete_1 {
						/**
						 * delete all the sub-files in 'file'
						 * 
						 * @param file
						 */
						public boolean delete(java.io.File file) {
							java.io.File[] files = file.listFiles();
							for (int i = 0; i < files.length; i++) {
								if (files[i].isFile()) {
									files[i].delete();
								} else if (files[i].isDirectory()) {
									if (!files[i].delete()) {
										delete(files[i]);
									}
								}
							}
							deleteDirectory(file);
							return file.delete();
						}

						/**
						 * delete all the sub-folders in 'file'
						 * 
						 * @param file
						 */
						private void deleteDirectory(java.io.File file) {
							java.io.File[] filed = file.listFiles();
							for (int i = 0; i < filed.length; i++) {
								if (filed[i].isDirectory()) {
									deleteDirectory(filed[i]);
								}
								filed[i].delete();
							}
						}

					}
					java.io.File file_tFileDelete_1 = new java.io.File(
							context.shipping
									+ "/"
									+ context.reportYear
									+ context.mDrive
									+ "/Ford_Fact_Files/NVUV/"
									+ context.reportMonth
									+ "/"
									+ ((String) globalMap
											.get("tFileList_3_CURRENT_FILE")));
					if (file_tFileDelete_1.exists()
							&& file_tFileDelete_1.isFile()) {
						if (file_tFileDelete_1.delete()) {
							globalMap.put("tFileDelete_1_CURRENT_STATUS",
									"File deleted.");
							log.info("tFileDelete_1 - File : "
									+ file_tFileDelete_1.getAbsolutePath()
									+ " is deleted.");
						} else {
							globalMap.put("tFileDelete_1_CURRENT_STATUS",
									"No file deleted.");
							log.info("tFileDelete_1 - Fail to delete file : "
									+ file_tFileDelete_1.getAbsolutePath());
						}
					} else {
						globalMap.put("tFileDelete_1_CURRENT_STATUS",
								"File does not exist or is invalid.");
						throw new RuntimeException(
								"File does not exist or is invalid.");
					}
					globalMap.put(
							"tFileDelete_1_DELETE_PATH",
							context.shipping
									+ "/"
									+ context.reportYear
									+ context.mDrive
									+ "/Ford_Fact_Files/NVUV/"
									+ context.reportMonth
									+ "/"
									+ ((String) globalMap
											.get("tFileList_3_CURRENT_FILE")));

					tos_count_tFileDelete_1++;

					/**
					 * [tFileDelete_1 main ] stop
					 */

					/**
					 * [tFileDelete_1 end ] start
					 */

					currentComponent = "tFileDelete_1";

					if (log.isInfoEnabled())
						log.info("tFileDelete_1 - " + "Done.");

					ok_Hash.put("tFileDelete_1", true);
					end_Hash.put("tFileDelete_1", System.currentTimeMillis());

					/**
					 * [tFileDelete_1 end ] stop
					 */

					/**
					 * [tFileList_3 end ] start
					 */

					currentComponent = "tFileList_3";

				}
				globalMap.put("tFileList_3_NB_FILE", NB_FILEtFileList_3);

				log.info("tFileList_3 - File or directory count : "
						+ NB_FILEtFileList_3);

				if (log.isInfoEnabled())
					log.info("tFileList_3 - " + "Done.");

				ok_Hash.put("tFileList_3", true);
				end_Hash.put("tFileList_3", System.currentTimeMillis());

				/**
				 * [tFileList_3 end ] stop
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
				 * [tFileList_3 finally ] start
				 */

				currentComponent = "tFileList_3";

				/**
				 * [tFileList_3 finally ] stop
				 */

				/**
				 * [tFileDelete_1 finally ] start
				 */

				currentComponent = "tFileDelete_1";

				/**
				 * [tFileDelete_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_3_SUBPROCESS_STATE", 1);
	}

	public void tSendMail_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tSendMail_1_SUBPROCESS_STATE", 0);

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
				 * [tSendMail_1 begin ] start
				 */

				ok_Hash.put("tSendMail_1", false);
				start_Hash.put("tSendMail_1", System.currentTimeMillis());

				currentComponent = "tSendMail_1";

				int tos_count_tSendMail_1 = 0;

				if (log.isInfoEnabled())
					log.info("tSendMail_1 - " + "Start to work.");
				StringBuilder log4jParamters_tSendMail_1 = new StringBuilder();
				log4jParamters_tSendMail_1.append("Parameters:");
				log4jParamters_tSendMail_1.append("TO" + " = "
						+ "context.altEmailTo");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("FROM" + " = "
						+ "context.emailFrom");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("CC" + " = " + "\"\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("BCC" + " = " + "\"\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1
						.append("SUBJECT"
								+ " = "
								+ "context.client+\"_SHP_\"+context.salesCostCenter+\"_[\"+context.jobNumber+\"]_For_Report_Month:_\" +context.reportMonth+\" ERROR\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1
						.append("MESSAGE"
								+ " = "
								+ "\"<html> <body>  <img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>   <br>  <br>  Please be advised there was an error with the number of files that were sent to FTP site. Please check that there are 38 files sent.  </body>  </html>\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("ATTACHMENTS" + " = " + "[]");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("SMTP_HOST" + " = "
						+ "\"smtp.dc.polk.com\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("SMTP_PORT" + " = " + "25");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("SSL" + " = " + "false");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("STARTTLS" + " = " + "false");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("IMPORTANCE" + " = "
						+ "Normal");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1
						.append("NEED_AUTH" + " = " + "false");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("DIE_ON_ERROR" + " = "
						+ "true");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("TEXT_SUBTYPE" + " = "
						+ "html");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("SET_LOCALHOST" + " = "
						+ "false");
				log4jParamters_tSendMail_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSendMail_1 - " + log4jParamters_tSendMail_1);

				/**
				 * [tSendMail_1 begin ] stop
				 */

				/**
				 * [tSendMail_1 main ] start
				 */

				currentComponent = "tSendMail_1";

				String smtpHost_tSendMail_1 = "smtp.dc.polk.com";
				String smtpPort_tSendMail_1 = "25";
				String from_tSendMail_1 = (context.emailFrom);
				String to_tSendMail_1 = (context.altEmailTo).replace(";", ",");
				String cc_tSendMail_1 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String bcc_tSendMail_1 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String subject_tSendMail_1 = (context.client + "_SHP_"
						+ context.salesCostCenter + "_[" + context.jobNumber
						+ "]_For_Report_Month:_" + context.reportMonth + " ERROR");

				java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();

				String message_tSendMail_1 = (("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\nPlease be advised there was an error with the number of files that were sent to FTP site. Please check that there are 38 files sent.\n</body>\n</html>") == null || ""
						.equals("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\nPlease be advised there was an error with the number of files that were sent to FTP site. Please check that there are 38 files sent.\n</body>\n</html>")) ? "\"\""
						: ("<html> <body>\n<img style=-webkit-user-select: none src=https://login.polk.com/polklogin/pages/images/logo.png>\n <br>\n<br>\nPlease be advised there was an error with the number of files that were sent to FTP site. Please check that there are 38 files sent.\n</body>\n</html>");
				java.util.Properties props_tSendMail_1 = System.getProperties();
				props_tSendMail_1.put("mail.smtp.host", smtpHost_tSendMail_1);
				props_tSendMail_1.put("mail.smtp.port", smtpPort_tSendMail_1);
				props_tSendMail_1.put("mail.mime.encodefilename", "true");
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
								javax.mail.internet.InternetAddress.parse(
										cc_tSendMail_1, false));
					if (bcc_tSendMail_1 != null)
						msg_tSendMail_1.setRecipients(
								javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(
										bcc_tSendMail_1, false));
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
										mbpFile_tSendMail_1.setHeader(
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
							if (contentTransferEncoding_tSendMail_1.get(
									i_tSendMail_1).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_1.setHeader(
										"Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
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

					props_tSendMail_1.remove("mail.mime.encodefilename");

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

				/**
				 * [tSendMail_1 end ] stop
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

		globalMap.put("tSendMail_1_SUBPROCESS_STATE", 1);
	}

	public static class row6Struct implements
			routines.system.IPersistableRow<row6Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

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
								+ "context.localDirectory+\"/PI_\"+context.dbVersion+\".txt\"");
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
							+ "/PI_" + context.dbVersion + ".txt";
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
								context.localDirectory + "/PI_"
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
							context.dbUserPI = row6.USER;
							context.dbPasswordPI = row6.PASSWORD;
							context.dbHostNamePI = row6.HST_NAME;
							context.dbNamePI = row6.DB_NAME;
							context.dbSchemaPI = row6.SCHEMA;
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
					if (!((Object) (context.localDirectory + "/PI_"
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

	public static class row10Struct implements
			routines.system.IPersistableRow<row10Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

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
		public int compareTo(row10Struct other) {

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

				row10Struct row10 = new row10Struct();

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
								+ "context.localDirectory+\"/AIS_OWNER_\"+context.dbVersion+\".txt\"");
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
						+ ", SCHEMA_COLUMN=" + ("SCHEMA") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("FTP_HOST")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("FTP_USER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("FTP_PASSWORD") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("PROD_EMAIL")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SHIP_EMAIL") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SMTP_HOST") + "}]");
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
							+ "/AIS_OWNER_" + context.dbVersion + ".txt";
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
								context.localDirectory + "/AIS_OWNER_"
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

						row10 = null;

						boolean whetherReject_tFileInputDelimited_2 = false;
						row10 = new row10Struct();
						try {

							int columnIndexWithD_tFileInputDelimited_2 = 0;

							columnIndexWithD_tFileInputDelimited_2 = 0;

							row10.USER = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 1;

							row10.PASSWORD = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 2;

							row10.HST_NAME = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 3;

							row10.DB_NAME = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 4;

							row10.SCHEMA = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 5;

							row10.FTP_HOST = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 6;

							row10.FTP_USER = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 7;

							row10.FTP_PASSWORD = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 8;

							row10.PROD_EMAIL = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 9;

							row10.SHIP_EMAIL = fid_tFileInputDelimited_2
									.get(columnIndexWithD_tFileInputDelimited_2);

							columnIndexWithD_tFileInputDelimited_2 = 10;

							row10.SMTP_HOST = fid_tFileInputDelimited_2
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
							row10 = null;

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
						// Start of branch "row10"
						if (row10 != null) {

							/**
							 * [tJavaRow_2 main ] start
							 */

							currentComponent = "tJavaRow_2";

							if (log.isTraceEnabled()) {
								log.trace("row10 - "
										+ (row10 == null ? "" : row10
												.toLogString()));
							}

							// Code generate accord to input schema and output
							// schmea
							context.dbUser = row10.USER;
							context.dbPassword = row10.PASSWORD;
							context.dbHostName = row10.HST_NAME;
							context.dbName = row10.DB_NAME;
							context.dbSchema = row10.SCHEMA;
							context.ftpHost = row10.FTP_HOST;
							context.ftpUser = row10.FTP_USER;
							context.ftpPassword = row10.FTP_PASSWORD;
							context.prodEmail = row10.PROD_EMAIL;
							context.shipEmail = row10.SHIP_EMAIL;
							context.smtpHost = row10.SMTP_HOST;

							nb_line_tJavaRow_2++;

							tos_count_tJavaRow_2++;

							/**
							 * [tJavaRow_2 main ] stop
							 */

						} // End of branch "row10"

						/**
						 * [tFileInputDelimited_2 end ] start
						 */

						currentComponent = "tFileInputDelimited_2";

					}
				} finally {
					if (!((Object) (context.localDirectory + "/AIS_OWNER_"
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
				 * [tJavaRow_2 end ] start
				 */

				currentComponent = "tJavaRow_2";

				globalMap.put("tJavaRow_2_NB_LINE", nb_line_tJavaRow_2);

				ok_Hash.put("tJavaRow_2", true);
				end_Hash.put("tJavaRow_2", System.currentTimeMillis());

				tOracleInput_2Process(globalMap);

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
				 * [tFileInputDelimited_2 finally ] start
				 */

				currentComponent = "tFileInputDelimited_2";

				/**
				 * [tFileInputDelimited_2 finally ] stop
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

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}

	public static class row1Struct implements
			routines.system.IPersistableRow<row1Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String JOB_NUMBER;

		public String getJOB_NUMBER() {
			return this.JOB_NUMBER;
		}

		public String CLIENT;

		public String getCLIENT() {
			return this.CLIENT;
		}

		public String START_DATE;

		public String getSTART_DATE() {
			return this.START_DATE;
		}

		public String LAST_REPORT_MONTH;

		public String getLAST_REPORT_MONTH() {
			return this.LAST_REPORT_MONTH;
		}

		public String EXPIRED_REPORT_MONTH;

		public String getEXPIRED_REPORT_MONTH() {
			return this.EXPIRED_REPORT_MONTH;
		}

		public String EMAIL_TO;

		public String getEMAIL_TO() {
			return this.EMAIL_TO;
		}

		public String EMAIL_CC;

		public String getEMAIL_CC() {
			return this.EMAIL_CC;
		}

		public String RESOURCE_INT;

		public String getRESOURCE_INT() {
			return this.RESOURCE_INT;
		}

		public String SALES_NAME;

		public String getSALES_NAME() {
			return this.SALES_NAME;
		}

		public String SALES_SIGNATURE;

		public String getSALES_SIGNATURE() {
			return this.SALES_SIGNATURE;
		}

		public String SALES_EMAIL;

		public String getSALES_EMAIL() {
			return this.SALES_EMAIL;
		}

		public String FTP_DIRECTORY;

		public String getFTP_DIRECTORY() {
			return this.FTP_DIRECTORY;
		}

		public String SHIP_IT;

		public String getSHIP_IT() {
			return this.SHIP_IT;
		}

		public String RUN_IT;

		public String getRUN_IT() {
			return this.RUN_IT;
		}

		public String SALES_COST_CENTER;

		public String getSALES_COST_CENTER() {
			return this.SALES_COST_CENTER;
		}

		public String EMAIL_FROM;

		public String getEMAIL_FROM() {
			return this.EMAIL_FROM;
		}

		public String EMAIL_BCC;

		public String getEMAIL_BCC() {
			return this.EMAIL_BCC;
		}

		public String ALT_FTP;

		public String getALT_FTP() {
			return this.ALT_FTP;
		}

		public String EFTP_PASSWORD;

		public String getEFTP_PASSWORD() {
			return this.EFTP_PASSWORD;
		}

		public String EFTP_HOST;

		public String getEFTP_HOST() {
			return this.EFTP_HOST;
		}

		public String EFTP_USER;

		public String getEFTP_USER() {
			return this.EFTP_USER;
		}

		public String SALES_TITLE;

		public String getSALES_TITLE() {
			return this.SALES_TITLE;
		}

		public String SALES_PHONE;

		public String getSALES_PHONE() {
			return this.SALES_PHONE;
		}

		public String COIN_FTP_HOST;

		public String getCOIN_FTP_HOST() {
			return this.COIN_FTP_HOST;
		}

		public String COIN_USER;

		public String getCOIN_USER() {
			return this.COIN_USER;
		}

		public String COIN_PASSWORD;

		public String getCOIN_PASSWORD() {
			return this.COIN_PASSWORD;
		}

		public String COIN_DIRECTORY;

		public String getCOIN_DIRECTORY() {
			return this.COIN_DIRECTORY;
		}

		public String ALT_EMAIL_TO;

		public String getALT_EMAIL_TO() {
			return this.ALT_EMAIL_TO;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.JOB_NUMBER = readString(dis);

					this.CLIENT = readString(dis);

					this.START_DATE = readString(dis);

					this.LAST_REPORT_MONTH = readString(dis);

					this.EXPIRED_REPORT_MONTH = readString(dis);

					this.EMAIL_TO = readString(dis);

					this.EMAIL_CC = readString(dis);

					this.RESOURCE_INT = readString(dis);

					this.SALES_NAME = readString(dis);

					this.SALES_SIGNATURE = readString(dis);

					this.SALES_EMAIL = readString(dis);

					this.FTP_DIRECTORY = readString(dis);

					this.SHIP_IT = readString(dis);

					this.RUN_IT = readString(dis);

					this.SALES_COST_CENTER = readString(dis);

					this.EMAIL_FROM = readString(dis);

					this.EMAIL_BCC = readString(dis);

					this.ALT_FTP = readString(dis);

					this.EFTP_PASSWORD = readString(dis);

					this.EFTP_HOST = readString(dis);

					this.EFTP_USER = readString(dis);

					this.SALES_TITLE = readString(dis);

					this.SALES_PHONE = readString(dis);

					this.COIN_FTP_HOST = readString(dis);

					this.COIN_USER = readString(dis);

					this.COIN_PASSWORD = readString(dis);

					this.COIN_DIRECTORY = readString(dis);

					this.ALT_EMAIL_TO = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.JOB_NUMBER, dos);

				// String

				writeString(this.CLIENT, dos);

				// String

				writeString(this.START_DATE, dos);

				// String

				writeString(this.LAST_REPORT_MONTH, dos);

				// String

				writeString(this.EXPIRED_REPORT_MONTH, dos);

				// String

				writeString(this.EMAIL_TO, dos);

				// String

				writeString(this.EMAIL_CC, dos);

				// String

				writeString(this.RESOURCE_INT, dos);

				// String

				writeString(this.SALES_NAME, dos);

				// String

				writeString(this.SALES_SIGNATURE, dos);

				// String

				writeString(this.SALES_EMAIL, dos);

				// String

				writeString(this.FTP_DIRECTORY, dos);

				// String

				writeString(this.SHIP_IT, dos);

				// String

				writeString(this.RUN_IT, dos);

				// String

				writeString(this.SALES_COST_CENTER, dos);

				// String

				writeString(this.EMAIL_FROM, dos);

				// String

				writeString(this.EMAIL_BCC, dos);

				// String

				writeString(this.ALT_FTP, dos);

				// String

				writeString(this.EFTP_PASSWORD, dos);

				// String

				writeString(this.EFTP_HOST, dos);

				// String

				writeString(this.EFTP_USER, dos);

				// String

				writeString(this.SALES_TITLE, dos);

				// String

				writeString(this.SALES_PHONE, dos);

				// String

				writeString(this.COIN_FTP_HOST, dos);

				// String

				writeString(this.COIN_USER, dos);

				// String

				writeString(this.COIN_PASSWORD, dos);

				// String

				writeString(this.COIN_DIRECTORY, dos);

				// String

				writeString(this.ALT_EMAIL_TO, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("JOB_NUMBER=" + JOB_NUMBER);
			sb.append(",CLIENT=" + CLIENT);
			sb.append(",START_DATE=" + START_DATE);
			sb.append(",LAST_REPORT_MONTH=" + LAST_REPORT_MONTH);
			sb.append(",EXPIRED_REPORT_MONTH=" + EXPIRED_REPORT_MONTH);
			sb.append(",EMAIL_TO=" + EMAIL_TO);
			sb.append(",EMAIL_CC=" + EMAIL_CC);
			sb.append(",RESOURCE_INT=" + RESOURCE_INT);
			sb.append(",SALES_NAME=" + SALES_NAME);
			sb.append(",SALES_SIGNATURE=" + SALES_SIGNATURE);
			sb.append(",SALES_EMAIL=" + SALES_EMAIL);
			sb.append(",FTP_DIRECTORY=" + FTP_DIRECTORY);
			sb.append(",SHIP_IT=" + SHIP_IT);
			sb.append(",RUN_IT=" + RUN_IT);
			sb.append(",SALES_COST_CENTER=" + SALES_COST_CENTER);
			sb.append(",EMAIL_FROM=" + EMAIL_FROM);
			sb.append(",EMAIL_BCC=" + EMAIL_BCC);
			sb.append(",ALT_FTP=" + ALT_FTP);
			sb.append(",EFTP_PASSWORD=" + EFTP_PASSWORD);
			sb.append(",EFTP_HOST=" + EFTP_HOST);
			sb.append(",EFTP_USER=" + EFTP_USER);
			sb.append(",SALES_TITLE=" + SALES_TITLE);
			sb.append(",SALES_PHONE=" + SALES_PHONE);
			sb.append(",COIN_FTP_HOST=" + COIN_FTP_HOST);
			sb.append(",COIN_USER=" + COIN_USER);
			sb.append(",COIN_PASSWORD=" + COIN_PASSWORD);
			sb.append(",COIN_DIRECTORY=" + COIN_DIRECTORY);
			sb.append(",ALT_EMAIL_TO=" + ALT_EMAIL_TO);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (JOB_NUMBER == null) {
				sb.append("<null>");
			} else {
				sb.append(JOB_NUMBER);
			}

			sb.append("|");

			if (CLIENT == null) {
				sb.append("<null>");
			} else {
				sb.append(CLIENT);
			}

			sb.append("|");

			if (START_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(START_DATE);
			}

			sb.append("|");

			if (LAST_REPORT_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_REPORT_MONTH);
			}

			sb.append("|");

			if (EXPIRED_REPORT_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(EXPIRED_REPORT_MONTH);
			}

			sb.append("|");

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

			if (RESOURCE_INT == null) {
				sb.append("<null>");
			} else {
				sb.append(RESOURCE_INT);
			}

			sb.append("|");

			if (SALES_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES_NAME);
			}

			sb.append("|");

			if (SALES_SIGNATURE == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES_SIGNATURE);
			}

			sb.append("|");

			if (SALES_EMAIL == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES_EMAIL);
			}

			sb.append("|");

			if (FTP_DIRECTORY == null) {
				sb.append("<null>");
			} else {
				sb.append(FTP_DIRECTORY);
			}

			sb.append("|");

			if (SHIP_IT == null) {
				sb.append("<null>");
			} else {
				sb.append(SHIP_IT);
			}

			sb.append("|");

			if (RUN_IT == null) {
				sb.append("<null>");
			} else {
				sb.append(RUN_IT);
			}

			sb.append("|");

			if (SALES_COST_CENTER == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES_COST_CENTER);
			}

			sb.append("|");

			if (EMAIL_FROM == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_FROM);
			}

			sb.append("|");

			if (EMAIL_BCC == null) {
				sb.append("<null>");
			} else {
				sb.append(EMAIL_BCC);
			}

			sb.append("|");

			if (ALT_FTP == null) {
				sb.append("<null>");
			} else {
				sb.append(ALT_FTP);
			}

			sb.append("|");

			if (EFTP_PASSWORD == null) {
				sb.append("<null>");
			} else {
				sb.append(EFTP_PASSWORD);
			}

			sb.append("|");

			if (EFTP_HOST == null) {
				sb.append("<null>");
			} else {
				sb.append(EFTP_HOST);
			}

			sb.append("|");

			if (EFTP_USER == null) {
				sb.append("<null>");
			} else {
				sb.append(EFTP_USER);
			}

			sb.append("|");

			if (SALES_TITLE == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES_TITLE);
			}

			sb.append("|");

			if (SALES_PHONE == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES_PHONE);
			}

			sb.append("|");

			if (COIN_FTP_HOST == null) {
				sb.append("<null>");
			} else {
				sb.append(COIN_FTP_HOST);
			}

			sb.append("|");

			if (COIN_USER == null) {
				sb.append("<null>");
			} else {
				sb.append(COIN_USER);
			}

			sb.append("|");

			if (COIN_PASSWORD == null) {
				sb.append("<null>");
			} else {
				sb.append(COIN_PASSWORD);
			}

			sb.append("|");

			if (COIN_DIRECTORY == null) {
				sb.append("<null>");
			} else {
				sb.append(COIN_DIRECTORY);
			}

			sb.append("|");

			if (ALT_EMAIL_TO == null) {
				sb.append("<null>");
			} else {
				sb.append(ALT_EMAIL_TO);
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

				row1Struct row1 = new row1Struct();

				/**
				 * [tJavaRow_4 begin ] start
				 */

				ok_Hash.put("tJavaRow_4", false);
				start_Hash.put("tJavaRow_4", System.currentTimeMillis());

				currentComponent = "tJavaRow_4";

				int tos_count_tJavaRow_4 = 0;

				int nb_line_tJavaRow_4 = 0;

				/**
				 * [tJavaRow_4 begin ] stop
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
								+ "\"SELECT JOB_NUMBER,CLIENT,  to_char(START_DATE, 'MM/DD/YY HH24:MI:SS'),  LAST_REPORT_MONTH,EXPIRED_REPORT_MONTH,EMAIL_TO,EMAIL_CC,RESOURCE_INT,  SALES_NAME,SALES_SIGNATURE,SALES_EMAIL,FTP_DIRECTORY,SHIP_IT,RUN_IT, SALES_COST_CENTER,  EMAIL_FROM, EMAIL_BCC,ALT_FTP, FTP_PASSWORD, FTP_HOST, FTP_USER,SALES_TITLE,SALES_PHONE,FTP_HOST2,FTP_USER2,FTP_PASSWORD2,FTP_DIRECTORY2,ALT_EMAIL_TO  FROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J, AIS_JOBS_SALES_STAFF S  WHERE JOB_ID = '\"+context.jobID+\"'  AND J.SALES_ID = S.SALES_ID\"");
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
						+ ("JOB_NUMBER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CLIENT") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("START_DATE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("LAST_REPORT_MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EXPIRED_REPORT_MONTH")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("EMAIL_TO") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EMAIL_CC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("RESOURCE_INT")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SALES_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SALES_SIGNATURE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SALES_EMAIL") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("FTP_DIRECTORY") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("SHIP_IT")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("RUN_IT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SALES_COST_CENTER")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("EMAIL_FROM") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EMAIL_BCC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("ALT_FTP")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("EFTP_PASSWORD") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EFTP_HOST") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("EFTP_USER")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SALES_TITLE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SALES_PHONE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("COIN_FTP_HOST")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("COIN_USER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("COIN_PASSWORD") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("COIN_DIRECTORY")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ALT_EMAIL_TO") + "}]");
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

				String dbquery_tOracleInput_2 = "SELECT JOB_NUMBER,CLIENT,\nto_char(START_DATE, 'MM/DD/YY HH24:MI:SS'),\nLAST_REPORT_MONTH,EXPIRED_REPORT_MONTH,EMAIL_TO,EMAIL_CC,RESOURCE_INT,\nSALES_NAME,SALES_SIGNATURE,SALES_EMAIL,FTP_DIRECTORY,SHIP_IT,RUN_IT, SALES_COST_CENTER,\nEMAIL_FROM, EMAIL_BCC,ALT_FTP, FTP_PASSWORD, FTP_HOST, FTP_USER,SALES_TITLE,SALES_PHONE,FTP_HOST2,FTP_USER2,FTP_PASSWORD2,FTP_DIRECTORY2,ALT_EMAIL_TO\nFROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J, AIS_JOBS_SALES_STAFF S\nWHERE JOB_ID = '"
						+ context.jobID + "'\nAND J.SALES_ID = S.SALES_ID";

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
							row1.JOB_NUMBER = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(1);
							if (tmpContent_tOracleInput_2 != null) {
								row1.JOB_NUMBER = tmpContent_tOracleInput_2;
							} else {
								row1.JOB_NUMBER = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 2) {
							row1.CLIENT = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(2);
							if (tmpContent_tOracleInput_2 != null) {
								row1.CLIENT = tmpContent_tOracleInput_2;
							} else {
								row1.CLIENT = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 3) {
							row1.START_DATE = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(3);
							if (tmpContent_tOracleInput_2 != null) {
								row1.START_DATE = tmpContent_tOracleInput_2;
							} else {
								row1.START_DATE = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 4) {
							row1.LAST_REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(4);
							if (tmpContent_tOracleInput_2 != null) {
								row1.LAST_REPORT_MONTH = tmpContent_tOracleInput_2;
							} else {
								row1.LAST_REPORT_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 5) {
							row1.EXPIRED_REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(5);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EXPIRED_REPORT_MONTH = tmpContent_tOracleInput_2;
							} else {
								row1.EXPIRED_REPORT_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 6) {
							row1.EMAIL_TO = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(6);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EMAIL_TO = tmpContent_tOracleInput_2;
							} else {
								row1.EMAIL_TO = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 7) {
							row1.EMAIL_CC = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(7);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EMAIL_CC = tmpContent_tOracleInput_2;
							} else {
								row1.EMAIL_CC = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 8) {
							row1.RESOURCE_INT = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(8);
							if (tmpContent_tOracleInput_2 != null) {
								row1.RESOURCE_INT = tmpContent_tOracleInput_2;
							} else {
								row1.RESOURCE_INT = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 9) {
							row1.SALES_NAME = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(9);
							if (tmpContent_tOracleInput_2 != null) {
								row1.SALES_NAME = tmpContent_tOracleInput_2;
							} else {
								row1.SALES_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 10) {
							row1.SALES_SIGNATURE = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(10);
							if (tmpContent_tOracleInput_2 != null) {
								row1.SALES_SIGNATURE = tmpContent_tOracleInput_2;
							} else {
								row1.SALES_SIGNATURE = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 11) {
							row1.SALES_EMAIL = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(11);
							if (tmpContent_tOracleInput_2 != null) {
								row1.SALES_EMAIL = tmpContent_tOracleInput_2;
							} else {
								row1.SALES_EMAIL = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 12) {
							row1.FTP_DIRECTORY = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(12);
							if (tmpContent_tOracleInput_2 != null) {
								row1.FTP_DIRECTORY = tmpContent_tOracleInput_2;
							} else {
								row1.FTP_DIRECTORY = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 13) {
							row1.SHIP_IT = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(13);
							if (tmpContent_tOracleInput_2 != null) {
								row1.SHIP_IT = tmpContent_tOracleInput_2;
							} else {
								row1.SHIP_IT = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 14) {
							row1.RUN_IT = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(14);
							if (tmpContent_tOracleInput_2 != null) {
								row1.RUN_IT = tmpContent_tOracleInput_2;
							} else {
								row1.RUN_IT = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 15) {
							row1.SALES_COST_CENTER = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(15);
							if (tmpContent_tOracleInput_2 != null) {
								row1.SALES_COST_CENTER = tmpContent_tOracleInput_2;
							} else {
								row1.SALES_COST_CENTER = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 16) {
							row1.EMAIL_FROM = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(16);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EMAIL_FROM = tmpContent_tOracleInput_2;
							} else {
								row1.EMAIL_FROM = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 17) {
							row1.EMAIL_BCC = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(17);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EMAIL_BCC = tmpContent_tOracleInput_2;
							} else {
								row1.EMAIL_BCC = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 18) {
							row1.ALT_FTP = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(18);
							if (tmpContent_tOracleInput_2 != null) {
								row1.ALT_FTP = tmpContent_tOracleInput_2;
							} else {
								row1.ALT_FTP = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 19) {
							row1.EFTP_PASSWORD = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(19);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EFTP_PASSWORD = tmpContent_tOracleInput_2;
							} else {
								row1.EFTP_PASSWORD = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 20) {
							row1.EFTP_HOST = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(20);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EFTP_HOST = tmpContent_tOracleInput_2;
							} else {
								row1.EFTP_HOST = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 21) {
							row1.EFTP_USER = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(21);
							if (tmpContent_tOracleInput_2 != null) {
								row1.EFTP_USER = tmpContent_tOracleInput_2;
							} else {
								row1.EFTP_USER = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 22) {
							row1.SALES_TITLE = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(22);
							if (tmpContent_tOracleInput_2 != null) {
								row1.SALES_TITLE = tmpContent_tOracleInput_2;
							} else {
								row1.SALES_TITLE = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 23) {
							row1.SALES_PHONE = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(23);
							if (tmpContent_tOracleInput_2 != null) {
								row1.SALES_PHONE = tmpContent_tOracleInput_2;
							} else {
								row1.SALES_PHONE = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 24) {
							row1.COIN_FTP_HOST = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(24);
							if (tmpContent_tOracleInput_2 != null) {
								row1.COIN_FTP_HOST = tmpContent_tOracleInput_2;
							} else {
								row1.COIN_FTP_HOST = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 25) {
							row1.COIN_USER = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(25);
							if (tmpContent_tOracleInput_2 != null) {
								row1.COIN_USER = tmpContent_tOracleInput_2;
							} else {
								row1.COIN_USER = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 26) {
							row1.COIN_PASSWORD = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(26);
							if (tmpContent_tOracleInput_2 != null) {
								row1.COIN_PASSWORD = tmpContent_tOracleInput_2;
							} else {
								row1.COIN_PASSWORD = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 27) {
							row1.COIN_DIRECTORY = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(27);
							if (tmpContent_tOracleInput_2 != null) {
								row1.COIN_DIRECTORY = tmpContent_tOracleInput_2;
							} else {
								row1.COIN_DIRECTORY = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 28) {
							row1.ALT_EMAIL_TO = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(28);
							if (tmpContent_tOracleInput_2 != null) {
								row1.ALT_EMAIL_TO = tmpContent_tOracleInput_2;
							} else {
								row1.ALT_EMAIL_TO = null;
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
						 * [tJavaRow_4 main ] start
						 */

						currentComponent = "tJavaRow_4";

						if (log.isTraceEnabled()) {
							log.trace("row1 - "
									+ (row1 == null ? "" : row1.toLogString()));
						}

						// Code generate accord to input schema and output
						// schmea
						context.jobNumber = row1.JOB_NUMBER;
						context.client = row1.CLIENT;
						context.startDate = row1.START_DATE;
						context.lastReportMonth = row1.LAST_REPORT_MONTH;
						context.expiredReportMonth = row1.EXPIRED_REPORT_MONTH;
						context.emailTo = row1.EMAIL_TO;
						context.emailCC = row1.SALES_EMAIL + ";"
								+ row1.EMAIL_CC;
						context.resourceInt = row1.RESOURCE_INT;
						context.salesName = row1.SALES_NAME;
						context.salesSignature = row1.SALES_SIGNATURE;
						context.salesEmail = row1.SALES_EMAIL;
						context.ftpDirectory = row1.FTP_DIRECTORY;
						context.shipIt = row1.SHIP_IT;
						context.runIt = row1.RUN_IT;
						context.salesCostCenter = row1.SALES_COST_CENTER;
						context.emailFrom = row1.EMAIL_FROM;
						context.emailBcc = row1.EMAIL_BCC;
						context.eftpHost = row1.EFTP_HOST;
						context.altEmailTo = row1.ALT_EMAIL_TO;
						context.eftpUser = row1.EFTP_USER;
						context.eftpPassword = row1.EFTP_PASSWORD;
						context.eftpDirectory = row1.FTP_DIRECTORY;
						context.salesTitle = row1.SALES_TITLE;
						context.salesPhone = row1.SALES_PHONE;
						context.altEmailTo = row1.ALT_EMAIL_TO;

						nb_line_tJavaRow_4++;

						tos_count_tJavaRow_4++;

						/**
						 * [tJavaRow_4 main ] stop
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
				 * [tJavaRow_4 end ] start
				 */

				currentComponent = "tJavaRow_4";

				globalMap.put("tJavaRow_4_NB_LINE", nb_line_tJavaRow_4);

				ok_Hash.put("tJavaRow_4", true);
				end_Hash.put("tJavaRow_4", System.currentTimeMillis());

				tOracleInput_9Process(globalMap);

				/**
				 * [tJavaRow_4 end ] stop
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
				 * [tJavaRow_4 finally ] start
				 */

				currentComponent = "tJavaRow_4";

				/**
				 * [tJavaRow_4 finally ] stop
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

	public static class row11Struct implements
			routines.system.IPersistableRow<row11Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String REPORT_YEAR_MONTH;

		public String getREPORT_YEAR_MONTH() {
			return this.REPORT_YEAR_MONTH;
		}

		public String REPORT_YEAR;

		public String getREPORT_YEAR() {
			return this.REPORT_YEAR;
		}

		public String REPORT_YEAR_MONTH1;

		public String getREPORT_YEAR_MONTH1() {
			return this.REPORT_YEAR_MONTH1;
		}

		public String START_DATE;

		public String getSTART_DATE() {
			return this.START_DATE;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.REPORT_YEAR_MONTH = readString(dis);

					this.REPORT_YEAR = readString(dis);

					this.REPORT_YEAR_MONTH1 = readString(dis);

					this.START_DATE = readString(dis);

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

				// String

				writeString(this.REPORT_YEAR_MONTH1, dos);

				// String

				writeString(this.START_DATE, dos);

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
			sb.append(",REPORT_YEAR_MONTH1=" + REPORT_YEAR_MONTH1);
			sb.append(",START_DATE=" + START_DATE);
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

			if (REPORT_YEAR_MONTH1 == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_YEAR_MONTH1);
			}

			sb.append("|");

			if (START_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(START_DATE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row11Struct other) {

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

	public void tOracleInput_9Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_9_SUBPROCESS_STATE", 0);

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

				row11Struct row11 = new row11Struct();

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
				 * [tOracleInput_9 begin ] start
				 */

				ok_Hash.put("tOracleInput_9", false);
				start_Hash.put("tOracleInput_9", System.currentTimeMillis());

				currentComponent = "tOracleInput_9";

				int tos_count_tOracleInput_9 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_9 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_9 = new StringBuilder();
				log4jParamters_tOracleInput_9.append("Parameters:");
				log4jParamters_tOracleInput_9.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9
						.append("QUERY"
								+ " = "
								+ "\"  Select REPORT_YEAR_MONTH CURRENT_MONTH,             SUBSTR(REPORT_YEAR_MONTH, 1, 4) CURRENT_YEAR,  TO_CHAR(ADD_MONTHS(to_date(REPORT_YEAR_MONTH,'YYYYMM'), -1), 'YYYYMM') PREVIOUS_MONTH,  to_char(sysdate,'YYYYMMDD') START_DATE  from CUSTGEN.RSD_TIME_PERIOD rsd_prd  WHERE RSD_PRD.TIME_PERIOD = 'MRMO'  \"");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("REPORT_YEAR_MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_YEAR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("REPORT_YEAR_MONTH1") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("START_DATE") + "}]");
				log4jParamters_tOracleInput_9.append(" | ");
				log4jParamters_tOracleInput_9.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_9.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_9 - "
							+ log4jParamters_tOracleInput_9);

				int nb_line_tOracleInput_9 = 0;
				java.sql.Connection conn_tOracleInput_9 = null;
				String driverClass_tOracleInput_9 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_9);

				String url_tOracleInput_9 = null;
				url_tOracleInput_9 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_9 = context.dbUser;

				final String decryptedPassword_tOracleInput_9 = context.dbPassword;

				String dbPwd_tOracleInput_9 = decryptedPassword_tOracleInput_9;

				log.debug("tOracleInput_9 - Driver ClassName: "
						+ driverClass_tOracleInput_9 + ".");

				log.info("tOracleInput_9 - Connection attempt to '"
						+ url_tOracleInput_9 + "' with the username '"
						+ dbUser_tOracleInput_9 + "'.");

				conn_tOracleInput_9 = java.sql.DriverManager.getConnection(
						url_tOracleInput_9, dbUser_tOracleInput_9,
						dbPwd_tOracleInput_9);
				log.info("tOracleInput_9 - Connection to '"
						+ url_tOracleInput_9 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_9 = conn_tOracleInput_9
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_9 = stmtGetTZ_tOracleInput_9
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_9 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_9.next()) {
					sessionTimezone_tOracleInput_9 = rsGetTZ_tOracleInput_9
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_9)
						.setSessionTimeZone(sessionTimezone_tOracleInput_9);

				java.sql.Statement stmt_tOracleInput_9 = conn_tOracleInput_9
						.createStatement();

				String dbquery_tOracleInput_9 = "\nSelect REPORT_YEAR_MONTH CURRENT_MONTH, \n          SUBSTR(REPORT_YEAR_MONTH, 1, 4) CURRENT_YEAR,\nTO_CHAR(ADD_MONTHS(to_date(REPORT_YEAR_MONTH,'YYYYMM'), -1), 'YYYYMM') PREVIOUS_MONTH,\nto_char(sysdate,'YYYYMMDD') START_DATE\nfrom CUSTGEN.RSD_TIME_PERIOD rsd_prd\nWHERE RSD_PRD.TIME_PERIOD = 'MRMO'\n";

				log.info("tOracleInput_9 - Executing the query: '"
						+ dbquery_tOracleInput_9 + "'.");

				globalMap.put("tOracleInput_9_QUERY", dbquery_tOracleInput_9);

				java.sql.ResultSet rs_tOracleInput_9 = null;
				try {
					rs_tOracleInput_9 = stmt_tOracleInput_9
							.executeQuery(dbquery_tOracleInput_9);
					java.sql.ResultSetMetaData rsmd_tOracleInput_9 = rs_tOracleInput_9
							.getMetaData();
					int colQtyInRs_tOracleInput_9 = rsmd_tOracleInput_9
							.getColumnCount();

					String tmpContent_tOracleInput_9 = null;

					log.info("tOracleInput_9 - Retrieving records from the database.");

					while (rs_tOracleInput_9.next()) {
						nb_line_tOracleInput_9++;

						if (colQtyInRs_tOracleInput_9 < 1) {
							row11.REPORT_YEAR_MONTH = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(1);
							if (tmpContent_tOracleInput_9 != null) {
								row11.REPORT_YEAR_MONTH = tmpContent_tOracleInput_9;
							} else {
								row11.REPORT_YEAR_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 2) {
							row11.REPORT_YEAR = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(2);
							if (tmpContent_tOracleInput_9 != null) {
								row11.REPORT_YEAR = tmpContent_tOracleInput_9;
							} else {
								row11.REPORT_YEAR = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 3) {
							row11.REPORT_YEAR_MONTH1 = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(3);
							if (tmpContent_tOracleInput_9 != null) {
								row11.REPORT_YEAR_MONTH1 = tmpContent_tOracleInput_9;
							} else {
								row11.REPORT_YEAR_MONTH1 = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 4) {
							row11.START_DATE = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(4);
							if (tmpContent_tOracleInput_9 != null) {
								row11.START_DATE = tmpContent_tOracleInput_9;
							} else {
								row11.START_DATE = null;
							}
						}

						log.debug("tOracleInput_9 - Retrieving the record "
								+ nb_line_tOracleInput_9 + ".");

						/**
						 * [tOracleInput_9 begin ] stop
						 */

						/**
						 * [tOracleInput_9 main ] start
						 */

						currentComponent = "tOracleInput_9";

						tos_count_tOracleInput_9++;

						/**
						 * [tOracleInput_9 main ] stop
						 */

						/**
						 * [tJavaRow_3 main ] start
						 */

						currentComponent = "tJavaRow_3";

						if (log.isTraceEnabled()) {
							log.trace("row11 - "
									+ (row11 == null ? "" : row11.toLogString()));
						}

						// Code generate accord to input schema and output
						// schmea
						context.reportMonth = row11.REPORT_YEAR_MONTH;
						context.reportYear = row11.REPORT_YEAR;
						context.reportMonth1 = row11.REPORT_YEAR_MONTH1;
						context.startDate = row11.START_DATE;

						nb_line_tJavaRow_3++;

						tos_count_tJavaRow_3++;

						/**
						 * [tJavaRow_3 main ] stop
						 */

						/**
						 * [tOracleInput_9 end ] start
						 */

						currentComponent = "tOracleInput_9";

					}
				} finally {
					stmt_tOracleInput_9.close();

					if (conn_tOracleInput_9 != null
							&& !conn_tOracleInput_9.isClosed()) {

						log.info("tOracleInput_9 - Closing the connection to the database.");

						conn_tOracleInput_9.close();

						log.info("tOracleInput_9 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_9_NB_LINE", nb_line_tOracleInput_9);
				log.info("tOracleInput_9 - Retrieved records count: "
						+ nb_line_tOracleInput_9 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_9 - " + "Done.");

				ok_Hash.put("tOracleInput_9", true);
				end_Hash.put("tOracleInput_9", System.currentTimeMillis());

				/**
				 * [tOracleInput_9 end ] stop
				 */

				/**
				 * [tJavaRow_3 end ] start
				 */

				currentComponent = "tJavaRow_3";

				globalMap.put("tJavaRow_3_NB_LINE", nb_line_tJavaRow_3);

				ok_Hash.put("tJavaRow_3", true);
				end_Hash.put("tJavaRow_3", System.currentTimeMillis());

				tOracleInput_4Process(globalMap);
				tOracleInput_6Process(globalMap);
				tJava_4Process(globalMap);

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
				 * [tOracleInput_9 finally ] start
				 */

				currentComponent = "tOracleInput_9";

				/**
				 * [tOracleInput_9 finally ] stop
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

		globalMap.put("tOracleInput_9_SUBPROCESS_STATE", 1);
	}

	public static class row4Struct implements
			routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String LAST_REPORT_MONTH;

		public String getLAST_REPORT_MONTH() {
			return this.LAST_REPORT_MONTH;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.LAST_REPORT_MONTH = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.LAST_REPORT_MONTH, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("LAST_REPORT_MONTH=" + LAST_REPORT_MONTH);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (LAST_REPORT_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_REPORT_MONTH);
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

	public void tOracleInput_4Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_4_SUBPROCESS_STATE", 0);

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
				 * [tSendMail_2 begin ] start
				 */

				ok_Hash.put("tSendMail_2", false);
				start_Hash.put("tSendMail_2", System.currentTimeMillis());

				currentComponent = "tSendMail_2";

				int tos_count_tSendMail_2 = 0;

				if (log.isInfoEnabled())
					log.info("tSendMail_2 - " + "Start to work.");
				StringBuilder log4jParamters_tSendMail_2 = new StringBuilder();
				log4jParamters_tSendMail_2.append("Parameters:");
				log4jParamters_tSendMail_2.append("TO" + " = "
						+ "context.salesEmail");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("FROM" + " = "
						+ "context.prodEmail");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("CC" + " = " + "\"\"");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("BCC" + " = "
						+ "context.prodEmail");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2
						.append("SUBJECT"
								+ " = "
								+ "context.client+ \" Job number: \" +context.jobID+ \" for Report Month: \"  +context.reportMonth+ \"  Last Delivery\"");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2
						.append("MESSAGE"
								+ " = "
								+ "\"Just a reminder that this is the last delivery on this job.    Please send in a new WRF to the Stat box for next month if they are going to renew.    Thanks!     Stat Production\"");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("ATTACHMENTS" + " = " + "[]");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("SMTP_HOST" + " = "
						+ "\"smtp.dc.polk.com\"");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("SMTP_PORT" + " = " + "25");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("SSL" + " = " + "false");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("STARTTLS" + " = " + "false");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("IMPORTANCE" + " = "
						+ "Normal");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2
						.append("NEED_AUTH" + " = " + "false");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("DIE_ON_ERROR" + " = "
						+ "true");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("TEXT_SUBTYPE" + " = "
						+ "plain");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2.append("SET_LOCALHOST" + " = "
						+ "false");
				log4jParamters_tSendMail_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSendMail_2 - " + log4jParamters_tSendMail_2);

				/**
				 * [tSendMail_2 begin ] stop
				 */

				/**
				 * [tOracleInput_4 begin ] start
				 */

				ok_Hash.put("tOracleInput_4", false);
				start_Hash.put("tOracleInput_4", System.currentTimeMillis());

				currentComponent = "tOracleInput_4";

				int tos_count_tOracleInput_4 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_4 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_4 = new StringBuilder();
				log4jParamters_tOracleInput_4.append("Parameters:");
				log4jParamters_tOracleInput_4.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4
						.append("QUERY"
								+ " = "
								+ "\"SELECT LAST_REPORT_MONTH  FROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J  WHERE JOB_ID = '\"+context.jobID+\"'  AND LAST_REPORT_MONTH = '\"+context.reportMonth+\"'\"");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("LAST_REPORT_MONTH") + "}]");
				log4jParamters_tOracleInput_4.append(" | ");
				log4jParamters_tOracleInput_4.append("NO_NULL_VALUES" + " = "
						+ "false");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_4 = context.dbUser;

				final String decryptedPassword_tOracleInput_4 = context.dbPassword;

				String dbPwd_tOracleInput_4 = decryptedPassword_tOracleInput_4;

				log.debug("tOracleInput_4 - Driver ClassName: "
						+ driverClass_tOracleInput_4 + ".");

				log.info("tOracleInput_4 - Connection attempt to '"
						+ url_tOracleInput_4 + "' with the username '"
						+ dbUser_tOracleInput_4 + "'.");

				conn_tOracleInput_4 = java.sql.DriverManager.getConnection(
						url_tOracleInput_4, dbUser_tOracleInput_4,
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

				String dbquery_tOracleInput_4 = "SELECT LAST_REPORT_MONTH\nFROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J\nWHERE JOB_ID = '"
						+ context.jobID
						+ "'\nAND LAST_REPORT_MONTH = '"
						+ context.reportMonth + "'";

				log.info("tOracleInput_4 - Executing the query: '"
						+ dbquery_tOracleInput_4 + "'.");

				globalMap.put("tOracleInput_4_QUERY", dbquery_tOracleInput_4);

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
							row4.LAST_REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_4 = rs_tOracleInput_4
									.getString(1);
							if (tmpContent_tOracleInput_4 != null) {
								row4.LAST_REPORT_MONTH = tmpContent_tOracleInput_4;
							} else {
								row4.LAST_REPORT_MONTH = null;
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
						 * [tSendMail_2 main ] start
						 */

						currentComponent = "tSendMail_2";

						if (log.isTraceEnabled()) {
							log.trace("row4 - "
									+ (row4 == null ? "" : row4.toLogString()));
						}

						String smtpHost_tSendMail_2 = "smtp.dc.polk.com";
						String smtpPort_tSendMail_2 = "25";
						String from_tSendMail_2 = (context.prodEmail);
						String to_tSendMail_2 = (context.salesEmail).replace(
								";", ",");
						String cc_tSendMail_2 = (("") == null || "".equals("")) ? null
								: ("").replace(";", ",");
						String bcc_tSendMail_2 = ((context.prodEmail) == null || ""
								.equals(context.prodEmail)) ? null
								: (context.prodEmail).replace(";", ",");
						String subject_tSendMail_2 = (context.client
								+ " Job number: " + context.jobID
								+ " for Report Month: " + context.reportMonth + "  Last Delivery");

						java.util.List<java.util.Map<String, String>> headers_tSendMail_2 = new java.util.ArrayList<java.util.Map<String, String>>();
						java.util.List<String> attachments_tSendMail_2 = new java.util.ArrayList<String>();
						java.util.List<String> contentTransferEncoding_tSendMail_2 = new java.util.ArrayList<String>();

						String message_tSendMail_2 = (("Just a reminder that this is the last delivery on this job.\n\nPlease send in a new WRF to the Stat box for next month if they are going to renew.\n\nThanks! \n\nStat Production") == null || ""
								.equals("Just a reminder that this is the last delivery on this job.\n\nPlease send in a new WRF to the Stat box for next month if they are going to renew.\n\nThanks! \n\nStat Production")) ? "\"\""
								: ("Just a reminder that this is the last delivery on this job.\n\nPlease send in a new WRF to the Stat box for next month if they are going to renew.\n\nThanks! \n\nStat Production");
						java.util.Properties props_tSendMail_2 = System
								.getProperties();
						props_tSendMail_2.put("mail.smtp.host",
								smtpHost_tSendMail_2);
						props_tSendMail_2.put("mail.smtp.port",
								smtpPort_tSendMail_2);
						props_tSendMail_2.put("mail.mime.encodefilename",
								"true");
						try {

							log.info("tSendMail_2 - Connection attempt to '"
									+ smtpHost_tSendMail_2 + "'.");

							props_tSendMail_2.put("mail.smtp.auth", "false");
							javax.mail.Session session_tSendMail_2 = javax.mail.Session
									.getInstance(props_tSendMail_2, null);

							log.info("tSendMail_2 - Connection to '"
									+ smtpHost_tSendMail_2 + "' has succeeded.");

							javax.mail.Message msg_tSendMail_2 = new javax.mail.internet.MimeMessage(
									session_tSendMail_2);
							msg_tSendMail_2
									.setFrom(new javax.mail.internet.InternetAddress(
											from_tSendMail_2, null));
							msg_tSendMail_2.setRecipients(
									javax.mail.Message.RecipientType.TO,
									javax.mail.internet.InternetAddress.parse(
											to_tSendMail_2, false));
							if (cc_tSendMail_2 != null)
								msg_tSendMail_2.setRecipients(
										javax.mail.Message.RecipientType.CC,
										javax.mail.internet.InternetAddress
												.parse(cc_tSendMail_2, false));
							if (bcc_tSendMail_2 != null)
								msg_tSendMail_2.setRecipients(
										javax.mail.Message.RecipientType.BCC,
										javax.mail.internet.InternetAddress
												.parse(bcc_tSendMail_2, false));
							msg_tSendMail_2.setSubject(subject_tSendMail_2);

							for (int i_tSendMail_2 = 0; i_tSendMail_2 < headers_tSendMail_2
									.size(); i_tSendMail_2++) {
								java.util.Map<String, String> header_tSendMail_2 = headers_tSendMail_2
										.get(i_tSendMail_2);
								msg_tSendMail_2.setHeader(
										header_tSendMail_2.get("KEY"),
										header_tSendMail_2.get("VALUE"));
							}
							msg_tSendMail_2.setSentDate(new Date());
							msg_tSendMail_2.setHeader("X-Priority", "3"); // High->1
																			// Normal->3
																			// Low->5
							javax.mail.Multipart mp_tSendMail_2 = new javax.mail.internet.MimeMultipart();
							javax.mail.internet.MimeBodyPart mbpText_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
							mbpText_tSendMail_2.setText(message_tSendMail_2,
									"ISO-8859-15", "plain");
							mp_tSendMail_2.addBodyPart(mbpText_tSendMail_2);

							javax.mail.internet.MimeBodyPart mbpFile_tSendMail_2 = null;

							for (int i_tSendMail_2 = 0; i_tSendMail_2 < attachments_tSendMail_2
									.size(); i_tSendMail_2++) {
								String filename_tSendMail_2 = attachments_tSendMail_2
										.get(i_tSendMail_2);
								javax.activation.FileDataSource fds_tSendMail_2 = null;
								java.io.File file_tSendMail_2 = new java.io.File(
										filename_tSendMail_2);

								if (file_tSendMail_2.isDirectory()) {
									java.io.File[] subFiles_tSendMail_2 = file_tSendMail_2
											.listFiles();
									for (java.io.File subFile_tSendMail_2 : subFiles_tSendMail_2) {
										if (subFile_tSendMail_2.isFile()) {
											fds_tSendMail_2 = new javax.activation.FileDataSource(
													subFile_tSendMail_2
															.getAbsolutePath());
											mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
											mbpFile_tSendMail_2
													.setDataHandler(new javax.activation.DataHandler(
															fds_tSendMail_2));
											mbpFile_tSendMail_2
													.setFileName(javax.mail.internet.MimeUtility
															.encodeText(fds_tSendMail_2
																	.getName()));
											if (contentTransferEncoding_tSendMail_2
													.get(i_tSendMail_2)
													.equalsIgnoreCase("base64")) {
												mbpFile_tSendMail_2
														.setHeader(
																"Content-Transfer-Encoding",
																"base64");
											}
											mp_tSendMail_2
													.addBodyPart(mbpFile_tSendMail_2);
										}
									}
								} else {
									mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
									fds_tSendMail_2 = new javax.activation.FileDataSource(
											filename_tSendMail_2);
									mbpFile_tSendMail_2
											.setDataHandler(new javax.activation.DataHandler(
													fds_tSendMail_2));
									mbpFile_tSendMail_2
											.setFileName(javax.mail.internet.MimeUtility
													.encodeText(fds_tSendMail_2
															.getName()));
									if (contentTransferEncoding_tSendMail_2
											.get(i_tSendMail_2)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_2.setHeader(
												"Content-Transfer-Encoding",
												"base64");
									}
									mp_tSendMail_2
											.addBodyPart(mbpFile_tSendMail_2);
								}
							}
							// -- set the content --
							msg_tSendMail_2.setContent(mp_tSendMail_2);
							// add handlers for main MIME types
							javax.activation.MailcapCommandMap mc_tSendMail_2 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
									.getDefaultCommandMap();
							mc_tSendMail_2
									.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
							mc_tSendMail_2
									.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
							mc_tSendMail_2
									.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
							mc_tSendMail_2
									.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
							mc_tSendMail_2
									.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
							javax.activation.CommandMap
									.setDefaultCommandMap(mc_tSendMail_2);
							// -- Send the message --
							javax.mail.Transport.send(msg_tSendMail_2);
						} catch (java.lang.Exception e) {

							throw (e);

						} finally {
							props_tSendMail_2.remove("mail.smtp.host");
							props_tSendMail_2.remove("mail.smtp.port");

							props_tSendMail_2
									.remove("mail.mime.encodefilename");

							props_tSendMail_2.remove("mail.smtp.auth");
						}

						tos_count_tSendMail_2++;

						/**
						 * [tSendMail_2 main ] stop
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

				globalMap.put("tOracleInput_4_NB_LINE", nb_line_tOracleInput_4);
				log.info("tOracleInput_4 - Retrieved records count: "
						+ nb_line_tOracleInput_4 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_4 - " + "Done.");

				ok_Hash.put("tOracleInput_4", true);
				end_Hash.put("tOracleInput_4", System.currentTimeMillis());

				/**
				 * [tOracleInput_4 end ] stop
				 */

				/**
				 * [tSendMail_2 end ] start
				 */

				currentComponent = "tSendMail_2";

				if (log.isInfoEnabled())
					log.info("tSendMail_2 - " + "Done.");

				ok_Hash.put("tSendMail_2", true);
				end_Hash.put("tSendMail_2", System.currentTimeMillis());

				/**
				 * [tSendMail_2 end ] stop
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
				 * [tOracleInput_4 finally ] start
				 */

				currentComponent = "tOracleInput_4";

				/**
				 * [tOracleInput_4 finally ] stop
				 */

				/**
				 * [tSendMail_2 finally ] start
				 */

				currentComponent = "tSendMail_2";

				/**
				 * [tSendMail_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_4_SUBPROCESS_STATE", 1);
	}

	public static class row7Struct implements
			routines.system.IPersistableRow<row7Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String LAST_REPORT_MONTH;

		public String getLAST_REPORT_MONTH() {
			return this.LAST_REPORT_MONTH;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.LAST_REPORT_MONTH = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.LAST_REPORT_MONTH, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("LAST_REPORT_MONTH=" + LAST_REPORT_MONTH);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (LAST_REPORT_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_REPORT_MONTH);
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

	public void tOracleInput_6Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_6_SUBPROCESS_STATE", 0);

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
				 * [tSendMail_3 begin ] start
				 */

				ok_Hash.put("tSendMail_3", false);
				start_Hash.put("tSendMail_3", System.currentTimeMillis());

				currentComponent = "tSendMail_3";

				int tos_count_tSendMail_3 = 0;

				if (log.isInfoEnabled())
					log.info("tSendMail_3 - " + "Start to work.");
				StringBuilder log4jParamters_tSendMail_3 = new StringBuilder();
				log4jParamters_tSendMail_3.append("Parameters:");
				log4jParamters_tSendMail_3.append("TO" + " = "
						+ "context.salesEmail");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("FROM" + " = "
						+ "context.prodEmail");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("CC" + " = " + "\"\"");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("BCC" + " = "
						+ "context.prodEmail");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3
						.append("SUBJECT"
								+ " = "
								+ "context.client+ \" Job number: \" +context.jobID+ \" for Report Month: \"  +context.reportMonth+ \"  EXPIRED WRF NO DELIVERY\"");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3
						.append("MESSAGE"
								+ " = "
								+ "\"Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.    Please send in a new WRF to the Stat box for if they are going to renew.    Thanks!     Stat Production\"");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("ATTACHMENTS" + " = " + "[]");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("SMTP_HOST" + " = "
						+ "\"smtp.dc.polk.com\"");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("SMTP_PORT" + " = " + "25");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("SSL" + " = " + "false");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("STARTTLS" + " = " + "false");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("IMPORTANCE" + " = "
						+ "Normal");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3
						.append("NEED_AUTH" + " = " + "false");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("DIE_ON_ERROR" + " = "
						+ "true");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("TEXT_SUBTYPE" + " = "
						+ "plain");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("SET_LOCALHOST" + " = "
						+ "false");
				log4jParamters_tSendMail_3.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSendMail_3 - " + log4jParamters_tSendMail_3);

				/**
				 * [tSendMail_3 begin ] stop
				 */

				/**
				 * [tOracleInput_6 begin ] start
				 */

				ok_Hash.put("tOracleInput_6", false);
				start_Hash.put("tOracleInput_6", System.currentTimeMillis());

				currentComponent = "tOracleInput_6";

				int tos_count_tOracleInput_6 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_6 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_6 = new StringBuilder();
				log4jParamters_tOracleInput_6.append("Parameters:");
				log4jParamters_tOracleInput_6.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6
						.append("QUERY"
								+ " = "
								+ "\"SELECT EXPIRED_REPORT_MONTH  FROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J  WHERE JOB_ID = '\"+context.jobID+\"'  AND EXPIRED_REPORT_MONTH = '\"+context.reportMonth+\"'\"");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("LAST_REPORT_MONTH") + "}]");
				log4jParamters_tOracleInput_6.append(" | ");
				log4jParamters_tOracleInput_6.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_6.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_6 - "
							+ log4jParamters_tOracleInput_6);

				int nb_line_tOracleInput_6 = 0;
				java.sql.Connection conn_tOracleInput_6 = null;
				String driverClass_tOracleInput_6 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_6);

				String url_tOracleInput_6 = null;
				url_tOracleInput_6 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_6 = context.dbUser;

				final String decryptedPassword_tOracleInput_6 = context.dbPassword;

				String dbPwd_tOracleInput_6 = decryptedPassword_tOracleInput_6;

				log.debug("tOracleInput_6 - Driver ClassName: "
						+ driverClass_tOracleInput_6 + ".");

				log.info("tOracleInput_6 - Connection attempt to '"
						+ url_tOracleInput_6 + "' with the username '"
						+ dbUser_tOracleInput_6 + "'.");

				conn_tOracleInput_6 = java.sql.DriverManager.getConnection(
						url_tOracleInput_6, dbUser_tOracleInput_6,
						dbPwd_tOracleInput_6);
				log.info("tOracleInput_6 - Connection to '"
						+ url_tOracleInput_6 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_6 = conn_tOracleInput_6
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_6 = stmtGetTZ_tOracleInput_6
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_6 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_6.next()) {
					sessionTimezone_tOracleInput_6 = rsGetTZ_tOracleInput_6
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_6)
						.setSessionTimeZone(sessionTimezone_tOracleInput_6);

				java.sql.Statement stmt_tOracleInput_6 = conn_tOracleInput_6
						.createStatement();

				String dbquery_tOracleInput_6 = "SELECT EXPIRED_REPORT_MONTH\nFROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J\nWHERE JOB_ID = '"
						+ context.jobID
						+ "'\nAND EXPIRED_REPORT_MONTH = '"
						+ context.reportMonth + "'";

				log.info("tOracleInput_6 - Executing the query: '"
						+ dbquery_tOracleInput_6 + "'.");

				globalMap.put("tOracleInput_6_QUERY", dbquery_tOracleInput_6);

				java.sql.ResultSet rs_tOracleInput_6 = null;
				try {
					rs_tOracleInput_6 = stmt_tOracleInput_6
							.executeQuery(dbquery_tOracleInput_6);
					java.sql.ResultSetMetaData rsmd_tOracleInput_6 = rs_tOracleInput_6
							.getMetaData();
					int colQtyInRs_tOracleInput_6 = rsmd_tOracleInput_6
							.getColumnCount();

					String tmpContent_tOracleInput_6 = null;

					log.info("tOracleInput_6 - Retrieving records from the database.");

					while (rs_tOracleInput_6.next()) {
						nb_line_tOracleInput_6++;

						if (colQtyInRs_tOracleInput_6 < 1) {
							row7.LAST_REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_6 = rs_tOracleInput_6
									.getString(1);
							if (tmpContent_tOracleInput_6 != null) {
								row7.LAST_REPORT_MONTH = tmpContent_tOracleInput_6;
							} else {
								row7.LAST_REPORT_MONTH = null;
							}
						}

						log.debug("tOracleInput_6 - Retrieving the record "
								+ nb_line_tOracleInput_6 + ".");

						/**
						 * [tOracleInput_6 begin ] stop
						 */

						/**
						 * [tOracleInput_6 main ] start
						 */

						currentComponent = "tOracleInput_6";

						tos_count_tOracleInput_6++;

						/**
						 * [tOracleInput_6 main ] stop
						 */

						/**
						 * [tSendMail_3 main ] start
						 */

						currentComponent = "tSendMail_3";

						if (log.isTraceEnabled()) {
							log.trace("row7 - "
									+ (row7 == null ? "" : row7.toLogString()));
						}

						String smtpHost_tSendMail_3 = "smtp.dc.polk.com";
						String smtpPort_tSendMail_3 = "25";
						String from_tSendMail_3 = (context.prodEmail);
						String to_tSendMail_3 = (context.salesEmail).replace(
								";", ",");
						String cc_tSendMail_3 = (("") == null || "".equals("")) ? null
								: ("").replace(";", ",");
						String bcc_tSendMail_3 = ((context.prodEmail) == null || ""
								.equals(context.prodEmail)) ? null
								: (context.prodEmail).replace(";", ",");
						String subject_tSendMail_3 = (context.client
								+ " Job number: " + context.jobID
								+ " for Report Month: " + context.reportMonth + "  EXPIRED WRF NO DELIVERY");

						java.util.List<java.util.Map<String, String>> headers_tSendMail_3 = new java.util.ArrayList<java.util.Map<String, String>>();
						java.util.List<String> attachments_tSendMail_3 = new java.util.ArrayList<String>();
						java.util.List<String> contentTransferEncoding_tSendMail_3 = new java.util.ArrayList<String>();

						String message_tSendMail_3 = (("Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.\n\nPlease send in a new WRF to the Stat box for if they are going to renew.\n\nThanks! \n\nStat Production") == null || ""
								.equals("Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.\n\nPlease send in a new WRF to the Stat box for if they are going to renew.\n\nThanks! \n\nStat Production")) ? "\"\""
								: ("Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.\n\nPlease send in a new WRF to the Stat box for if they are going to renew.\n\nThanks! \n\nStat Production");
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
									"ISO-8859-15", "plain");
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
						 * [tOracleInput_6 end ] start
						 */

						currentComponent = "tOracleInput_6";

					}
				} finally {
					stmt_tOracleInput_6.close();

					if (conn_tOracleInput_6 != null
							&& !conn_tOracleInput_6.isClosed()) {

						log.info("tOracleInput_6 - Closing the connection to the database.");

						conn_tOracleInput_6.close();

						log.info("tOracleInput_6 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_6_NB_LINE", nb_line_tOracleInput_6);
				log.info("tOracleInput_6 - Retrieved records count: "
						+ nb_line_tOracleInput_6 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_6 - " + "Done.");

				ok_Hash.put("tOracleInput_6", true);
				end_Hash.put("tOracleInput_6", System.currentTimeMillis());

				/**
				 * [tOracleInput_6 end ] stop
				 */

				/**
				 * [tSendMail_3 end ] start
				 */

				currentComponent = "tSendMail_3";

				if (log.isInfoEnabled())
					log.info("tSendMail_3 - " + "Done.");

				ok_Hash.put("tSendMail_3", true);
				end_Hash.put("tSendMail_3", System.currentTimeMillis());

				/**
				 * [tSendMail_3 end ] stop
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
				 * [tOracleInput_6 finally ] start
				 */

				currentComponent = "tOracleInput_6";

				/**
				 * [tOracleInput_6 finally ] stop
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

		globalMap.put("tOracleInput_6_SUBPROCESS_STATE", 1);
	}

	public void tJava_4Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tJava_4_SUBPROCESS_STATE", 0);

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
				 * [tJava_4 begin ] start
				 */

				ok_Hash.put("tJava_4", false);
				start_Hash.put("tJava_4", System.currentTimeMillis());

				currentComponent = "tJava_4";

				int tos_count_tJava_4 = 0;

				System.out.println("Begin Running Files...");

				/**
				 * [tJava_4 begin ] stop
				 */

				/**
				 * [tJava_4 main ] start
				 */

				currentComponent = "tJava_4";

				tos_count_tJava_4++;

				/**
				 * [tJava_4 main ] stop
				 */

				/**
				 * [tJava_4 end ] start
				 */

				currentComponent = "tJava_4";

				ok_Hash.put("tJava_4", true);
				end_Hash.put("tJava_4", System.currentTimeMillis());

				if (context.runIt.equals("Y")) {

					tOracleInput_8Process(globalMap);
				}

				/**
				 * [tJava_4 end ] stop
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
				 * [tJava_4 finally ] start
				 */

				currentComponent = "tJava_4";

				/**
				 * [tJava_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tJava_4_SUBPROCESS_STATE", 1);
	}

	public void tOracleInput_8Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_8_SUBPROCESS_STATE", 0);

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
				 * [tOracleInput_8 begin ] start
				 */

				int NB_ITERATE_tFileDelete_2 = 0; // for statistics

				ok_Hash.put("tOracleInput_8", false);
				start_Hash.put("tOracleInput_8", System.currentTimeMillis());

				currentComponent = "tOracleInput_8";

				int tos_count_tOracleInput_8 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_8 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_8 = new StringBuilder();
				log4jParamters_tOracleInput_8.append("Parameters:");
				log4jParamters_tOracleInput_8.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8
						.append("QUERY"
								+ " = "
								+ "\"SELECT REPORT_MONTH  FROM AIS_JOBS_STAT_REPORT_MONTHS  WHERE JOB_ID = '\"+context.jobID+\"'  and nvl(delivered, 'NO') = 'NO'  AND REPORT_MONTH = '\"+context.reportMonth+\"'  \"");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("SPECIFY_DATASOURCE_ALIAS"
						+ " = " + "false");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("REPORT_MONTH") + "}]");
				log4jParamters_tOracleInput_8.append(" | ");
				log4jParamters_tOracleInput_8.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_8.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_8 - "
							+ log4jParamters_tOracleInput_8);

				int nb_line_tOracleInput_8 = 0;
				java.sql.Connection conn_tOracleInput_8 = null;
				String driverClass_tOracleInput_8 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_8);

				String url_tOracleInput_8 = null;
				url_tOracleInput_8 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_8 = context.dbUser;

				final String decryptedPassword_tOracleInput_8 = context.dbPassword;

				String dbPwd_tOracleInput_8 = decryptedPassword_tOracleInput_8;

				log.debug("tOracleInput_8 - Driver ClassName: "
						+ driverClass_tOracleInput_8 + ".");

				log.info("tOracleInput_8 - Connection attempt to '"
						+ url_tOracleInput_8 + "' with the username '"
						+ dbUser_tOracleInput_8 + "'.");

				conn_tOracleInput_8 = java.sql.DriverManager.getConnection(
						url_tOracleInput_8, dbUser_tOracleInput_8,
						dbPwd_tOracleInput_8);
				log.info("tOracleInput_8 - Connection to '"
						+ url_tOracleInput_8 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_8 = conn_tOracleInput_8
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_8 = stmtGetTZ_tOracleInput_8
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_8 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_8.next()) {
					sessionTimezone_tOracleInput_8 = rsGetTZ_tOracleInput_8
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_8)
						.setSessionTimeZone(sessionTimezone_tOracleInput_8);

				java.sql.Statement stmt_tOracleInput_8 = conn_tOracleInput_8
						.createStatement();

				String dbquery_tOracleInput_8 = "SELECT REPORT_MONTH\nFROM AIS_JOBS_STAT_REPORT_MONTHS\nWHERE JOB_ID = '"
						+ context.jobID
						+ "'\nand nvl(delivered, 'NO') = 'NO'\nAND REPORT_MONTH = '"
						+ context.reportMonth + "'\n";

				log.info("tOracleInput_8 - Executing the query: '"
						+ dbquery_tOracleInput_8 + "'.");

				globalMap.put("tOracleInput_8_QUERY", dbquery_tOracleInput_8);

				java.sql.ResultSet rs_tOracleInput_8 = null;
				try {
					rs_tOracleInput_8 = stmt_tOracleInput_8
							.executeQuery(dbquery_tOracleInput_8);
					java.sql.ResultSetMetaData rsmd_tOracleInput_8 = rs_tOracleInput_8
							.getMetaData();
					int colQtyInRs_tOracleInput_8 = rsmd_tOracleInput_8
							.getColumnCount();

					String tmpContent_tOracleInput_8 = null;

					log.info("tOracleInput_8 - Retrieving records from the database.");

					while (rs_tOracleInput_8.next()) {
						nb_line_tOracleInput_8++;

						log.debug("tOracleInput_8 - Retrieving the record "
								+ nb_line_tOracleInput_8 + ".");

						/**
						 * [tOracleInput_8 begin ] stop
						 */

						/**
						 * [tOracleInput_8 main ] start
						 */

						currentComponent = "tOracleInput_8";

						tos_count_tOracleInput_8++;

						/**
						 * [tOracleInput_8 main ] stop
						 */
						NB_ITERATE_tFileDelete_2++;

						/**
						 * [tFileDelete_2 begin ] start
						 */

						ok_Hash.put("tFileDelete_2", false);
						start_Hash.put("tFileDelete_2",
								System.currentTimeMillis());

						currentComponent = "tFileDelete_2";

						int tos_count_tFileDelete_2 = 0;

						if (log.isInfoEnabled())
							log.info("tFileDelete_2 - " + "Start to work.");
						StringBuilder log4jParamters_tFileDelete_2 = new StringBuilder();
						log4jParamters_tFileDelete_2.append("Parameters:");
						log4jParamters_tFileDelete_2
								.append("PATH"
										+ " = "
										+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV\"");
						log4jParamters_tFileDelete_2.append(" | ");
						log4jParamters_tFileDelete_2.append("FAILON" + " = "
								+ "false");
						log4jParamters_tFileDelete_2.append(" | ");
						log4jParamters_tFileDelete_2.append("FOLDER_FILE"
								+ " = " + "true");
						log4jParamters_tFileDelete_2.append(" | ");
						if (log.isDebugEnabled())
							log.debug("tFileDelete_2 - "
									+ log4jParamters_tFileDelete_2);

						/**
						 * [tFileDelete_2 begin ] stop
						 */

						/**
						 * [tFileDelete_2 main ] start
						 */

						currentComponent = "tFileDelete_2";

						final StringBuffer log4jSb_tFileDelete_2 = new StringBuffer();

						class DeleteFoldertFileDelete_2 {
							/**
							 * delete all the sub-files in 'file'
							 * 
							 * @param file
							 */
							public boolean delete(java.io.File file) {
								java.io.File[] files = file.listFiles();
								for (int i = 0; i < files.length; i++) {
									if (files[i].isFile()) {
										files[i].delete();
									} else if (files[i].isDirectory()) {
										if (!files[i].delete()) {
											delete(files[i]);
										}
									}
								}
								deleteDirectory(file);
								return file.delete();
							}

							/**
							 * delete all the sub-folders in 'file'
							 * 
							 * @param file
							 */
							private void deleteDirectory(java.io.File file) {
								java.io.File[] filed = file.listFiles();
								for (int i = 0; i < filed.length; i++) {
									if (filed[i].isDirectory()) {
										deleteDirectory(filed[i]);
									}
									filed[i].delete();
								}
							}

						}
						java.io.File path_tFileDelete_2 = new java.io.File(
								context.shipping + "/" + context.reportYear
										+ context.mDrive
										+ "/Ford_Fact_Files/NVUV");
						if (path_tFileDelete_2.exists()) {
							if (path_tFileDelete_2.isFile()) {
								if (path_tFileDelete_2.delete()) {
									globalMap.put(
											"tFileDelete_2_CURRENT_STATUS",
											"File deleted.");
									log.info("tFileDelete_2 - File : "
											+ path_tFileDelete_2
													.getAbsolutePath()
											+ " is deleted.");
								} else {
									globalMap.put(
											"tFileDelete_2_CURRENT_STATUS",
											"No file deleted.");
									log.info("tFileDelete_2 - Fail to delete file : "
											+ path_tFileDelete_2
													.getAbsolutePath());
								}
							} else if (path_tFileDelete_2.isDirectory()) {
								DeleteFoldertFileDelete_2 dftFileDelete_2 = new DeleteFoldertFileDelete_2();
								if (dftFileDelete_2.delete(path_tFileDelete_2)) {
									globalMap.put(
											"tFileDelete_2_CURRENT_STATUS",
											"Path deleted.");
									log.info("tFileDelete_2 - Directory : "
											+ path_tFileDelete_2
													.getAbsolutePath()
											+ " is deleted.");
								} else {
									globalMap.put(
											"tFileDelete_2_CURRENT_STATUS",
											"No path deleted.");
									log.info("tFileDelete_2 - Fail to delete directory : "
											+ path_tFileDelete_2
													.getAbsolutePath());
								}
							}
						} else {
							globalMap
									.put("tFileDelete_2_CURRENT_STATUS",
											"File or path does not exist or is invalid.");
							log.error("tFileDelete_2 - File or directory : "
									+ path_tFileDelete_2.getAbsolutePath()
									+ " does not exist or is invalid.");
						}
						globalMap.put("tFileDelete_2_DELETE_PATH",
								context.shipping + "/" + context.reportYear
										+ context.mDrive
										+ "/Ford_Fact_Files/NVUV");

						tos_count_tFileDelete_2++;

						/**
						 * [tFileDelete_2 main ] stop
						 */

						/**
						 * [tFileDelete_2 end ] start
						 */

						currentComponent = "tFileDelete_2";

						if (log.isInfoEnabled())
							log.info("tFileDelete_2 - " + "Done.");

						ok_Hash.put("tFileDelete_2", true);
						end_Hash.put("tFileDelete_2",
								System.currentTimeMillis());

						tFileInputDelimited_1Process(globalMap);

						/**
						 * [tFileDelete_2 end ] stop
						 */

						/**
						 * [tOracleInput_8 end ] start
						 */

						currentComponent = "tOracleInput_8";

					}
				} finally {
					stmt_tOracleInput_8.close();

					if (conn_tOracleInput_8 != null
							&& !conn_tOracleInput_8.isClosed()) {

						log.info("tOracleInput_8 - Closing the connection to the database.");

						conn_tOracleInput_8.close();

						log.info("tOracleInput_8 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_8_NB_LINE", nb_line_tOracleInput_8);
				log.info("tOracleInput_8 - Retrieved records count: "
						+ nb_line_tOracleInput_8 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_8 - " + "Done.");

				ok_Hash.put("tOracleInput_8", true);
				end_Hash.put("tOracleInput_8", System.currentTimeMillis());

				/**
				 * [tOracleInput_8 end ] stop
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
				 * [tOracleInput_8 finally ] start
				 */

				currentComponent = "tOracleInput_8";

				/**
				 * [tOracleInput_8 finally ] stop
				 */

				/**
				 * [tFileDelete_2 finally ] start
				 */

				currentComponent = "tFileDelete_2";

				/**
				 * [tFileDelete_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_8_SUBPROCESS_STATE", 1);
	}

	public void tFileList_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

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
				 * [tFileList_1 begin ] start
				 */

				int NB_ITERATE_tJava_1 = 0; // for statistics

				ok_Hash.put("tFileList_1", false);
				start_Hash.put("tFileList_1", System.currentTimeMillis());

				currentComponent = "tFileList_1";

				int tos_count_tFileList_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_1 = new StringBuilder();
				log4jParamters_tFileList_1.append("Parameters:");
				log4jParamters_tFileList_1
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("LIST_MODE" + " = " + "BOTH");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}]");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1
						.append("IFEXCLUDE" + " = " + "false");
				log4jParamters_tFileList_1.append(" | ");
				log4jParamters_tFileList_1.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_1 - " + log4jParamters_tFileList_1);

				final StringBuffer log4jSb_tFileList_1 = new StringBuffer();

				String directory_tFileList_1 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Ford_Fact_Files/NVUV/" + context.reportMonth;
				final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_1.add("*.txt");
				for (final String filemask_tFileList_1 : maskList_tFileList_1) {
					String filemask_compile_tFileList_1 = filemask_tFileList_1;

					filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_1.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_1);
					patternList_tFileList_1.add(fileNamePattern_tFileList_1);
				}
				int NB_FILEtFileList_1 = 0;

				final boolean case_sensitive_tFileList_1 = true;
				final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
				java.io.File file_tFileList_1 = new java.io.File(
						directory_tFileList_1);

				file_tFileList_1.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);

						String fileName_tFileList_1 = file.getName();
						for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
							if (fileNamePattern_tFileList_1.matcher(
									fileName_tFileList_1).matches()) {
								if (!filePath_tFileList_1.contains(file
										.getAbsolutePath())) {
									list_tFileList_1.add(file);
									filePath_tFileList_1.add(file
											.getAbsolutePath());
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_1);

				log.info("tFileList_1 - Start to list files");

				for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1
						.size(); i_tFileList_1++) {
					java.io.File files_tFileList_1 = list_tFileList_1
							.get(i_tFileList_1);
					String fileName_tFileList_1 = files_tFileList_1.getName();

					String currentFileName_tFileList_1 = files_tFileList_1
							.getName();
					String currentFilePath_tFileList_1 = files_tFileList_1
							.getAbsolutePath();
					String currentFileDirectory_tFileList_1 = files_tFileList_1
							.getParent();
					String currentFileExtension_tFileList_1 = null;

					if (files_tFileList_1.getName().contains(".")
							&& files_tFileList_1.isFile()) {
						currentFileExtension_tFileList_1 = files_tFileList_1
								.getName().substring(
										files_tFileList_1.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_1 = "";
					}

					NB_FILEtFileList_1++;
					globalMap.put("tFileList_1_CURRENT_FILE",
							currentFileName_tFileList_1);
					globalMap.put("tFileList_1_CURRENT_FILEPATH",
							currentFilePath_tFileList_1);
					globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_1);
					globalMap.put("tFileList_1_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_1);
					globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);

					log.info("tFileList_1 - Current file or directory path : "
							+ currentFilePath_tFileList_1);

					/**
					 * [tFileList_1 begin ] stop
					 */

					/**
					 * [tFileList_1 main ] start
					 */

					currentComponent = "tFileList_1";

					tos_count_tFileList_1++;

					/**
					 * [tFileList_1 main ] stop
					 */
					NB_ITERATE_tJava_1++;

					/**
					 * [tJava_1 begin ] start
					 */

					int NB_ITERATE_tJava_2 = 0; // for statistics

					ok_Hash.put("tJava_1", false);
					start_Hash.put("tJava_1", System.currentTimeMillis());

					currentComponent = "tJava_1";

					int tos_count_tJava_1 = 0;

					context.pgpFileName = (String) globalMap
							.get("tFileList_1_CURRENT_FILE");
					System.out.println("Encrypting File: "
							+ context.pgpFileName);

					/**
					 * [tJava_1 begin ] stop
					 */

					/**
					 * [tJava_1 main ] start
					 */

					currentComponent = "tJava_1";

					tos_count_tJava_1++;

					/**
					 * [tJava_1 main ] stop
					 */
					NB_ITERATE_tJava_2++;

					/**
					 * [tJava_2 begin ] start
					 */

					ok_Hash.put("tJava_2", false);
					start_Hash.put("tJava_2", System.currentTimeMillis());

					currentComponent = "tJava_2";

					int tos_count_tJava_2 = 0;

					String baseGpg = "gpg --batch --yes --always-trust -r "
							+ "\"" + context.pgpKeyRecipient + "\"" + " -e ";
					String fileName = "\"" + context.shipping + "/"
							+ context.reportYear + context.mDrive
							+ "/Ford_Fact_Files/NVUV/" + context.reportMonth
							+ context.slash + context.pgpFileName + "\"";
					String gpgCmd = baseGpg + fileName;
					String cmdSet = gpgCmd;
					globalMap.put("gpgCmd", cmdSet);
					System.out.println(((String) globalMap.get("gpgCmd")));

					/**
					 * [tJava_2 begin ] stop
					 */

					/**
					 * [tJava_2 main ] start
					 */

					currentComponent = "tJava_2";

					tos_count_tJava_2++;

					/**
					 * [tJava_2 main ] stop
					 */

					/**
					 * [tJava_2 end ] start
					 */

					currentComponent = "tJava_2";

					ok_Hash.put("tJava_2", true);
					end_Hash.put("tJava_2", System.currentTimeMillis());

					tSystem_1Process(globalMap);

					/**
					 * [tJava_2 end ] stop
					 */

					/**
					 * [tJava_1 end ] start
					 */

					currentComponent = "tJava_1";

					ok_Hash.put("tJava_1", true);
					end_Hash.put("tJava_1", System.currentTimeMillis());

					/**
					 * [tJava_1 end ] stop
					 */

					/**
					 * [tFileList_1 end ] start
					 */

					currentComponent = "tFileList_1";

				}
				globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);

				log.info("tFileList_1 - File or directory count : "
						+ NB_FILEtFileList_1);

				if (log.isInfoEnabled())
					log.info("tFileList_1 - " + "Done.");

				ok_Hash.put("tFileList_1", true);
				end_Hash.put("tFileList_1", System.currentTimeMillis());

				/**
				 * [tFileList_1 end ] stop
				 */
			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_1:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tFTPDelete_1Process(globalMap);

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
				 * [tFileList_1 finally ] start
				 */

				currentComponent = "tFileList_1";

				/**
				 * [tFileList_1 finally ] stop
				 */

				/**
				 * [tJava_1 finally ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 finally ] stop
				 */

				/**
				 * [tJava_2 finally ] start
				 */

				currentComponent = "tJava_2";

				/**
				 * [tJava_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}

	public void tSystem_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tSystem_1_SUBPROCESS_STATE", 0);

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
				 * [tSystem_1 begin ] start
				 */

				ok_Hash.put("tSystem_1", false);
				start_Hash.put("tSystem_1", System.currentTimeMillis());

				currentComponent = "tSystem_1";

				int tos_count_tSystem_1 = 0;

				if (log.isInfoEnabled())
					log.info("tSystem_1 - " + "Start to work.");
				StringBuilder log4jParamters_tSystem_1 = new StringBuilder();
				log4jParamters_tSystem_1.append("Parameters:");
				log4jParamters_tSystem_1.append("ROOTDIR" + " = " + "false");
				log4jParamters_tSystem_1.append(" | ");
				log4jParamters_tSystem_1.append("USE_SINGLE_COMMAND" + " = "
						+ "true");
				log4jParamters_tSystem_1.append(" | ");
				log4jParamters_tSystem_1
						.append("COMMAND"
								+ " = "
								+ "new String[]{\"/bin/bash\",\"-c\", ((String)globalMap.get(\"gpgCmd\"))} /*((String)globalMap.get(\"gpgCmd\"))*/");
				log4jParamters_tSystem_1.append(" | ");
				log4jParamters_tSystem_1.append("USE_ARRAY_COMMAND" + " = "
						+ "false");
				log4jParamters_tSystem_1.append(" | ");
				log4jParamters_tSystem_1.append("OUTPUT" + " = "
						+ "OUTPUT_TO_CONSOLE");
				log4jParamters_tSystem_1.append(" | ");
				log4jParamters_tSystem_1.append("ERROROUTPUT" + " = "
						+ "OUTPUT_TO_CONSOLE");
				log4jParamters_tSystem_1.append(" | ");
				log4jParamters_tSystem_1.append("PARAMS" + " = " + "[{VALUE="
						+ ("\"/polk/app/tomcat\"") + ", NAME=" + ("\"HOME\"")
						+ "}]");
				log4jParamters_tSystem_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSystem_1 - " + log4jParamters_tSystem_1);

				Runtime runtime_tSystem_1 = Runtime.getRuntime();

				String[] env_tSystem_1 = null;
				java.util.Map<String, String> envMap_tSystem_1 = System
						.getenv();
				java.util.Map<String, String> envMapClone_tSystem_1 = new java.util.HashMap();
				envMapClone_tSystem_1.putAll(envMap_tSystem_1);

				log.info("tSystem_1 - Setting the parameters.");
				log.debug("tSystem_1 - Parameter " + (1) + ": Key='" + "HOME"
						+ "', Value='" + "/polk/app/tomcat" + "'.");
				envMapClone_tSystem_1.put("HOME", "/polk/app/tomcat");
				env_tSystem_1 = new String[envMapClone_tSystem_1.size()];
				int i_tSystem_1 = 0;
				for (String envKey : (java.util.Set<String>) envMapClone_tSystem_1
						.keySet()) {
					env_tSystem_1[i_tSystem_1++] = envKey + "="
							+ envMapClone_tSystem_1.get(envKey);
				}
				final Process ps_tSystem_1 = runtime_tSystem_1.exec(
						new String[] { "/bin/bash", "-c",
								((String) globalMap.get("gpgCmd")) }
						/* ((String)globalMap.get("gpgCmd")) */, env_tSystem_1);

				globalMap.remove("tSystem_1_OUTPUT");
				globalMap.remove("tSystem_1_ERROROUTPUT");

				Thread normal_tSystem_1 = new Thread() {
					public void run() {
						try {
							java.io.BufferedReader reader = new java.io.BufferedReader(
									new java.io.InputStreamReader(
											ps_tSystem_1.getInputStream()));
							String line = "";
							try {
								while ((line = reader.readLine()) != null) {

									log.debug("tSystem_1 - Sending the standard output to the console.");

									System.out.println(line);
								}
							} finally {
								reader.close();
							}
						} catch (java.io.IOException ioe) {

							log.error("tSystem_1 - " + ioe.getMessage());

							ioe.printStackTrace();
						}
					}
				};
				log.info("tSystem_1 - Executing the command.");
				log.info("tSystem_1 - Command to execute: '"
						+ new String[] { "/bin/bash", "-c",
								((String) globalMap.get("gpgCmd")) }
						/* ((String)globalMap.get("gpgCmd")) */+ "'.");
				normal_tSystem_1.start();
				log.info("tSystem_1 - The command has been executed successfully.");

				Thread error_tSystem_1 = new Thread() {
					public void run() {
						try {
							java.io.BufferedReader reader = new java.io.BufferedReader(
									new java.io.InputStreamReader(
											ps_tSystem_1.getErrorStream()));
							String line = "";
							try {
								while ((line = reader.readLine()) != null) {

									log.debug("tSystem_1 - Sending the error output to the console.");

									System.err.println(line);
								}
							} finally {
								reader.close();
							}
						} catch (java.io.IOException ioe) {

							log.error("tSystem_1 - " + ioe.getMessage());

							ioe.printStackTrace();
						}
					}
				};
				error_tSystem_1.start();
				if (ps_tSystem_1.getOutputStream() != null) {
					ps_tSystem_1.getOutputStream().close();
				}
				ps_tSystem_1.waitFor();
				normal_tSystem_1.join(10000);
				error_tSystem_1.join(10000);

				/**
				 * [tSystem_1 begin ] stop
				 */

				/**
				 * [tSystem_1 main ] start
				 */

				currentComponent = "tSystem_1";

				tos_count_tSystem_1++;

				/**
				 * [tSystem_1 main ] stop
				 */

				/**
				 * [tSystem_1 end ] start
				 */

				currentComponent = "tSystem_1";

				globalMap.put("tSystem_1_EXIT_VALUE", ps_tSystem_1.exitValue());

				if (log.isInfoEnabled())
					log.info("tSystem_1 - " + "Done.");

				ok_Hash.put("tSystem_1", true);
				end_Hash.put("tSystem_1", System.currentTimeMillis());

				/**
				 * [tSystem_1 end ] stop
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
				 * [tSystem_1 finally ] start
				 */

				currentComponent = "tSystem_1";

				/**
				 * [tSystem_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSystem_1_SUBPROCESS_STATE", 1);
	}

	public void tFileList_2Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_2_SUBPROCESS_STATE", 0);

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
				 * [tFileList_2 begin ] start
				 */

				int NB_ITERATE_tFileRowCount_1 = 0; // for statistics

				ok_Hash.put("tFileList_2", false);
				start_Hash.put("tFileList_2", System.currentTimeMillis());

				currentComponent = "tFileList_2";

				int tos_count_tFileList_2 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_2 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_2 = new StringBuilder();
				log4jParamters_tFileList_2.append("Parameters:");
				log4jParamters_tFileList_2
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2
						.append("LIST_MODE" + " = " + "FILES");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}]");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2
						.append("IFEXCLUDE" + " = " + "false");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_2 - " + log4jParamters_tFileList_2);

				final StringBuffer log4jSb_tFileList_2 = new StringBuffer();

				String directory_tFileList_2 = context.shipping + "/"
						+ context.reportYear + context.mDrive
						+ "/Ford_Fact_Files/NVUV/" + context.reportMonth;
				final java.util.List<String> maskList_tFileList_2 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_2 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_2.add("*.txt");
				for (final String filemask_tFileList_2 : maskList_tFileList_2) {
					String filemask_compile_tFileList_2 = filemask_tFileList_2;

					filemask_compile_tFileList_2 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_2.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_2 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_2);
					patternList_tFileList_2.add(fileNamePattern_tFileList_2);
				}
				int NB_FILEtFileList_2 = 0;

				final boolean case_sensitive_tFileList_2 = true;
				final java.util.List<java.io.File> list_tFileList_2 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_2 = new java.util.HashSet<String>();
				java.io.File file_tFileList_2 = new java.io.File(
						directory_tFileList_2);

				file_tFileList_2.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_2 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_2 : patternList_tFileList_2) {
								if (fileNamePattern_tFileList_2.matcher(
										fileName_tFileList_2).matches()) {
									if (!filePath_tFileList_2.contains(file
											.getAbsolutePath())) {
										list_tFileList_2.add(file);
										filePath_tFileList_2.add(file
												.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_2);

				log.info("tFileList_2 - Start to list files");

				for (int i_tFileList_2 = 0; i_tFileList_2 < list_tFileList_2
						.size(); i_tFileList_2++) {
					java.io.File files_tFileList_2 = list_tFileList_2
							.get(i_tFileList_2);
					String fileName_tFileList_2 = files_tFileList_2.getName();

					String currentFileName_tFileList_2 = files_tFileList_2
							.getName();
					String currentFilePath_tFileList_2 = files_tFileList_2
							.getAbsolutePath();
					String currentFileDirectory_tFileList_2 = files_tFileList_2
							.getParent();
					String currentFileExtension_tFileList_2 = null;

					if (files_tFileList_2.getName().contains(".")
							&& files_tFileList_2.isFile()) {
						currentFileExtension_tFileList_2 = files_tFileList_2
								.getName().substring(
										files_tFileList_2.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_2 = "";
					}

					NB_FILEtFileList_2++;
					globalMap.put("tFileList_2_CURRENT_FILE",
							currentFileName_tFileList_2);
					globalMap.put("tFileList_2_CURRENT_FILEPATH",
							currentFilePath_tFileList_2);
					globalMap.put("tFileList_2_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_2);
					globalMap.put("tFileList_2_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_2);
					globalMap.put("tFileList_2_NB_FILE", NB_FILEtFileList_2);

					log.info("tFileList_2 - Current file or directory path : "
							+ currentFilePath_tFileList_2);

					/**
					 * [tFileList_2 begin ] stop
					 */

					/**
					 * [tFileList_2 main ] start
					 */

					currentComponent = "tFileList_2";

					tos_count_tFileList_2++;

					/**
					 * [tFileList_2 main ] stop
					 */
					NB_ITERATE_tFileRowCount_1++;

					/**
					 * [tFileRowCount_1 begin ] start
					 */

					ok_Hash.put("tFileRowCount_1", false);
					start_Hash.put("tFileRowCount_1",
							System.currentTimeMillis());

					currentComponent = "tFileRowCount_1";

					int tos_count_tFileRowCount_1 = 0;

					if (log.isInfoEnabled())
						log.info("tFileRowCount_1 - " + "Start to work.");
					StringBuilder log4jParamters_tFileRowCount_1 = new StringBuilder();
					log4jParamters_tFileRowCount_1.append("Parameters:");
					log4jParamters_tFileRowCount_1
							.append("FILENAME"
									+ " = "
									+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth + \"/\" +((String)globalMap.get(\"tFileList_2_CURRENT_FILE\"))");
					log4jParamters_tFileRowCount_1.append(" | ");
					log4jParamters_tFileRowCount_1.append("ROWSEPARATOR"
							+ " = " + "\"\\n\"");
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

					String tmp_tFileRowCount_1 = context.shipping
							+ "/"
							+ context.reportYear
							+ context.mDrive
							+ "/Ford_Fact_Files/NVUV/"
							+ context.reportMonth
							+ "/"
							+ ((String) globalMap
									.get("tFileList_2_CURRENT_FILE"));
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
																+ "/Ford_Fact_Files/NVUV/"
																+ context.reportMonth
																+ "/"
																+ ((String) globalMap
																		.get("tFileList_2_CURRENT_FILE")))),
										wbs_tFileRowCount_1);

						java.util.List<jxl.Sheet> sheets_tFileRowCount_1 = new java.util.ArrayList<jxl.Sheet>();
						;
						sheets_tFileRowCount_1 = java.util.Arrays
								.<jxl.Sheet> asList(wb_tFileRowCount_1
										.getSheets());

						if (sheets_tFileRowCount_1.size() <= 0) {
							wb_tFileRowCount_1.close();
							throw new RuntimeException(
									"Special sheets not exist!");
						}

						for (jxl.Sheet sheet_tFileRowCount_1 : sheets_tFileRowCount_1) {
							int one_sheet_rows = sheet_tFileRowCount_1
									.getRows();
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
														+ "/Ford_Fact_Files/NVUV/"
														+ context.reportMonth
														+ "/"
														+ ((String) globalMap
																.get("tFileList_2_CURRENT_FILE"))),
										"ISO-8859-15"));
						String rowSeparator_tFileRowCount_1 = "\n";
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
								lineCount_tFileRowCount_1++; // add last row if
																// not end by
																// row separator

							if (bTipEmptyFlagOpen_tFileRowCount_1) {
								lineCount_tFileRowCount_1 -= tipEmptyLineCount_tFileRowCount_1;
								emptyLineCount_tFileRowCount_1 -= tipEmptyLineCount_tFileRowCount_1;
							}
						}
						br_tFileRowCount_1.close();
					}

					globalMap.put("tFileRowCount_1_COUNT",
							lineCount_tFileRowCount_1);

					log.info("tFileRowCount_1 - File : "
							+ context.shipping
							+ "/"
							+ context.reportYear
							+ context.mDrive
							+ "/Ford_Fact_Files/NVUV/"
							+ context.reportMonth
							+ "/"
							+ ((String) globalMap
									.get("tFileList_2_CURRENT_FILE"))
							+ " row count is " + lineCount_tFileRowCount_1);

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

					tFixedFlowInput_1Process(globalMap);

					/**
					 * [tFileRowCount_1 end ] stop
					 */

					/**
					 * [tFileList_2 end ] start
					 */

					currentComponent = "tFileList_2";

				}
				globalMap.put("tFileList_2_NB_FILE", NB_FILEtFileList_2);

				log.info("tFileList_2 - File or directory count : "
						+ NB_FILEtFileList_2);

				if (log.isInfoEnabled())
					log.info("tFileList_2 - " + "Done.");

				ok_Hash.put("tFileList_2", true);
				end_Hash.put("tFileList_2", System.currentTimeMillis());

				/**
				 * [tFileList_2 end ] stop
				 */
			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_2:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tFileList_1Process(globalMap);

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
				 * [tFileList_2 finally ] start
				 */

				currentComponent = "tFileList_2";

				/**
				 * [tFileList_2 finally ] stop
				 */

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

		globalMap.put("tFileList_2_SUBPROCESS_STATE", 1);
	}

	public static class row42Struct implements
			routines.system.IPersistableRow<row42Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String COUNT;

		public String getCOUNT() {
			return this.COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("COUNT=" + COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(COUNT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row42Struct other) {

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

	public void tFixedFlowInput_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFixedFlowInput_1_SUBPROCESS_STATE", 0);

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

				row42Struct row42 = new row42Struct();

				/**
				 * [tFileOutputDelimited_39 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_39", false);
				start_Hash.put("tFileOutputDelimited_39",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_39";

				int tos_count_tFileOutputDelimited_39 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_39 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_39 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_39.append("Parameters:");
				log4jParamters_tFileOutputDelimited_39.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth + \"/\" + ((String)globalMap.get(\"tFileList_2_CURRENT_FILE\")).substring(0, + ((String)globalMap.get(\"tFileList_2_CURRENT_FILE\")).length()-19) + \"COUNT.txt\"");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("FIELDSEPARATOR"
						+ " = " + "\";\"");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				log4jParamters_tFileOutputDelimited_39
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_39.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_39 - "
							+ log4jParamters_tFileOutputDelimited_39);

				String fileName_tFileOutputDelimited_39 = "";
				fileName_tFileOutputDelimited_39 = (new java.io.File(
						context.shipping
								+ "/"
								+ context.reportYear
								+ context.mDrive
								+ "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/"
								+ ((String) globalMap
										.get("tFileList_2_CURRENT_FILE")).substring(
										0,
										+((String) globalMap
												.get("tFileList_2_CURRENT_FILE"))
												.length() - 19) + "COUNT.txt"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_39 = null;
				String extension_tFileOutputDelimited_39 = null;
				String directory_tFileOutputDelimited_39 = null;
				if ((fileName_tFileOutputDelimited_39.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_39.lastIndexOf(".") < fileName_tFileOutputDelimited_39
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_39 = fileName_tFileOutputDelimited_39;
						extension_tFileOutputDelimited_39 = "";
					} else {
						fullName_tFileOutputDelimited_39 = fileName_tFileOutputDelimited_39
								.substring(0, fileName_tFileOutputDelimited_39
										.lastIndexOf("."));
						extension_tFileOutputDelimited_39 = fileName_tFileOutputDelimited_39
								.substring(fileName_tFileOutputDelimited_39
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_39 = fileName_tFileOutputDelimited_39
							.substring(0, fileName_tFileOutputDelimited_39
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_39.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_39 = fileName_tFileOutputDelimited_39
								.substring(0, fileName_tFileOutputDelimited_39
										.lastIndexOf("."));
						extension_tFileOutputDelimited_39 = fileName_tFileOutputDelimited_39
								.substring(fileName_tFileOutputDelimited_39
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_39 = fileName_tFileOutputDelimited_39;
						extension_tFileOutputDelimited_39 = "";
					}
					directory_tFileOutputDelimited_39 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_39 = true;
				java.io.File filetFileOutputDelimited_39 = new java.io.File(
						fileName_tFileOutputDelimited_39);
				globalMap.put("tFileOutputDelimited_39_FILE_NAME",
						fileName_tFileOutputDelimited_39);
				int nb_line_tFileOutputDelimited_39 = 0;
				int splitEvery_tFileOutputDelimited_39 = 1000;
				int splitedFileNo_tFileOutputDelimited_39 = 0;
				int currentRow_tFileOutputDelimited_39 = 0;

				final String OUT_DELIM_tFileOutputDelimited_39 = /**
				 * Start field
				 * tFileOutputDelimited_39:FIELDSEPARATOR
				 */
				";"/** End field tFileOutputDelimited_39:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_39 = /**
				 * Start
				 * field tFileOutputDelimited_39:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_39:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_39 != null
						&& directory_tFileOutputDelimited_39.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_39 = new java.io.File(
							directory_tFileOutputDelimited_39);
					if (!dir_tFileOutputDelimited_39.exists()) {
						log.info("tFileOutputDelimited_39 - Creating directory '"
								+ dir_tFileOutputDelimited_39
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_39.mkdirs();
						log.info("tFileOutputDelimited_39 - The directory '"
								+ dir_tFileOutputDelimited_39
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_39 = null;

				java.io.File fileToDelete_tFileOutputDelimited_39 = new java.io.File(
						fileName_tFileOutputDelimited_39);
				if (fileToDelete_tFileOutputDelimited_39.exists()) {
					fileToDelete_tFileOutputDelimited_39.delete();
				}
				outtFileOutputDelimited_39 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_39, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_39.length() == 0) {
						outtFileOutputDelimited_39.write("COUNT");
						outtFileOutputDelimited_39
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_39);
						outtFileOutputDelimited_39.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_39",
						outtFileOutputDelimited_39);
				resourceMap.put("nb_line_tFileOutputDelimited_39",
						nb_line_tFileOutputDelimited_39);

				/**
				 * [tFileOutputDelimited_39 begin ] stop
				 */

				/**
				 * [tFixedFlowInput_1 begin ] start
				 */

				ok_Hash.put("tFixedFlowInput_1", false);
				start_Hash.put("tFixedFlowInput_1", System.currentTimeMillis());

				currentComponent = "tFixedFlowInput_1";

				int tos_count_tFixedFlowInput_1 = 0;

				int nb_line_tFixedFlowInput_1 = 0;
				List<row42Struct> cacheList_tFixedFlowInput_1 = new java.util.ArrayList<row42Struct>();
				row42 = new row42Struct();
				row42.COUNT = ((Integer) globalMap.get("tFileRowCount_1_COUNT"))
						.toString();
				cacheList_tFixedFlowInput_1.add(row42);
				for (int i_tFixedFlowInput_1 = 0; i_tFixedFlowInput_1 < 1; i_tFixedFlowInput_1++) {
					for (row42Struct tmpRow_tFixedFlowInput_1 : cacheList_tFixedFlowInput_1) {
						nb_line_tFixedFlowInput_1++;
						row42 = tmpRow_tFixedFlowInput_1;

						/**
						 * [tFixedFlowInput_1 begin ] stop
						 */

						/**
						 * [tFixedFlowInput_1 main ] start
						 */

						currentComponent = "tFixedFlowInput_1";

						tos_count_tFixedFlowInput_1++;

						/**
						 * [tFixedFlowInput_1 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_39 main ] start
						 */

						currentComponent = "tFileOutputDelimited_39";

						if (log.isTraceEnabled()) {
							log.trace("row42 - "
									+ (row42 == null ? "" : row42.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_39 = new StringBuilder();
						if (row42.COUNT != null) {
							sb_tFileOutputDelimited_39.append(row42.COUNT);
						}
						sb_tFileOutputDelimited_39
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_39);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_39++;
							resourceMap.put("nb_line_tFileOutputDelimited_39",
									nb_line_tFileOutputDelimited_39);

							outtFileOutputDelimited_39
									.write(sb_tFileOutputDelimited_39
											.toString());
							log.debug("tFileOutputDelimited_39 - Writing the record "
									+ nb_line_tFileOutputDelimited_39 + ".");

						}

						tos_count_tFileOutputDelimited_39++;

						/**
						 * [tFileOutputDelimited_39 main ] stop
						 */

						/**
						 * [tFixedFlowInput_1 end ] start
						 */

						currentComponent = "tFixedFlowInput_1";

					}
				}
				cacheList_tFixedFlowInput_1.clear();
				globalMap.put("tFixedFlowInput_1_NB_LINE",
						nb_line_tFixedFlowInput_1);

				ok_Hash.put("tFixedFlowInput_1", true);
				end_Hash.put("tFixedFlowInput_1", System.currentTimeMillis());

				/**
				 * [tFixedFlowInput_1 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_39 end ] start
				 */

				currentComponent = "tFileOutputDelimited_39";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_39 != null) {
						outtFileOutputDelimited_39.flush();
						outtFileOutputDelimited_39.close();
					}

					globalMap.put("tFileOutputDelimited_39_NB_LINE",
							nb_line_tFileOutputDelimited_39);
					globalMap.put("tFileOutputDelimited_39_FILE_NAME",
							fileName_tFileOutputDelimited_39);

				}

				resourceMap.put("finish_tFileOutputDelimited_39", true);

				log.info("tFileOutputDelimited_39 - Written records count: "
						+ nb_line_tFileOutputDelimited_39 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_39 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_39", true);
				end_Hash.put("tFileOutputDelimited_39",
						System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_39 end ] stop
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
				 * [tFixedFlowInput_1 finally ] start
				 */

				currentComponent = "tFixedFlowInput_1";

				/**
				 * [tFixedFlowInput_1 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_39 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_39";

				if (resourceMap.get("finish_tFileOutputDelimited_39") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_39 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_39");
						if (outtFileOutputDelimited_39 != null) {
							outtFileOutputDelimited_39.flush();
							outtFileOutputDelimited_39.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_39 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFixedFlowInput_1_SUBPROCESS_STATE", 1);
	}

	public static class row2Struct implements
			routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String TRACTZIP_SAKEY;

		public String getTRACTZIP_SAKEY() {
			return this.TRACTZIP_SAKEY;
		}

		public String REPORT_YEAR_MONTH;

		public String getREPORT_YEAR_MONTH() {
			return this.REPORT_YEAR_MONTH;
		}

		public String MAKE_MODEL_CODE;

		public String getMAKE_MODEL_CODE() {
			return this.MAKE_MODEL_CODE;
		}

		public String CATEGORY_CODE;

		public String getCATEGORY_CODE() {
			return this.CATEGORY_CODE;
		}

		public String GENDER_CODE;

		public String getGENDER_CODE() {
			return this.GENDER_CODE;
		}

		public String ETHNIC_KEY;

		public String getETHNIC_KEY() {
			return this.ETHNIC_KEY;
		}

		public String AGE_CODE;

		public String getAGE_CODE() {
			return this.AGE_CODE;
		}

		public String EST_HH_INCOME_CODE;

		public String getEST_HH_INCOME_CODE() {
			return this.EST_HH_INCOME_CODE;
		}

		public String TRGT_INC;

		public String getTRGT_INC() {
			return this.TRGT_INC;
		}

		public String VIN_PATRN;

		public String getVIN_PATRN() {
			return this.VIN_PATRN;
		}

		public String VIN_PATRN_SURR_KEY;

		public String getVIN_PATRN_SURR_KEY() {
			return this.VIN_PATRN_SURR_KEY;
		}

		public String VEHICLE_COUNT;

		public String getVEHICLE_COUNT() {
			return this.VEHICLE_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.TRACTZIP_SAKEY = readString(dis);

					this.REPORT_YEAR_MONTH = readString(dis);

					this.MAKE_MODEL_CODE = readString(dis);

					this.CATEGORY_CODE = readString(dis);

					this.GENDER_CODE = readString(dis);

					this.ETHNIC_KEY = readString(dis);

					this.AGE_CODE = readString(dis);

					this.EST_HH_INCOME_CODE = readString(dis);

					this.TRGT_INC = readString(dis);

					this.VIN_PATRN = readString(dis);

					this.VIN_PATRN_SURR_KEY = readString(dis);

					this.VEHICLE_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TRACTZIP_SAKEY, dos);

				// String

				writeString(this.REPORT_YEAR_MONTH, dos);

				// String

				writeString(this.MAKE_MODEL_CODE, dos);

				// String

				writeString(this.CATEGORY_CODE, dos);

				// String

				writeString(this.GENDER_CODE, dos);

				// String

				writeString(this.ETHNIC_KEY, dos);

				// String

				writeString(this.AGE_CODE, dos);

				// String

				writeString(this.EST_HH_INCOME_CODE, dos);

				// String

				writeString(this.TRGT_INC, dos);

				// String

				writeString(this.VIN_PATRN, dos);

				// String

				writeString(this.VIN_PATRN_SURR_KEY, dos);

				// String

				writeString(this.VEHICLE_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRACTZIP_SAKEY=" + TRACTZIP_SAKEY);
			sb.append(",REPORT_YEAR_MONTH=" + REPORT_YEAR_MONTH);
			sb.append(",MAKE_MODEL_CODE=" + MAKE_MODEL_CODE);
			sb.append(",CATEGORY_CODE=" + CATEGORY_CODE);
			sb.append(",GENDER_CODE=" + GENDER_CODE);
			sb.append(",ETHNIC_KEY=" + ETHNIC_KEY);
			sb.append(",AGE_CODE=" + AGE_CODE);
			sb.append(",EST_HH_INCOME_CODE=" + EST_HH_INCOME_CODE);
			sb.append(",TRGT_INC=" + TRGT_INC);
			sb.append(",VIN_PATRN=" + VIN_PATRN);
			sb.append(",VIN_PATRN_SURR_KEY=" + VIN_PATRN_SURR_KEY);
			sb.append(",VEHICLE_COUNT=" + VEHICLE_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TRACTZIP_SAKEY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRACTZIP_SAKEY);
			}

			sb.append("|");

			if (REPORT_YEAR_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_YEAR_MONTH);
			}

			sb.append("|");

			if (MAKE_MODEL_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(MAKE_MODEL_CODE);
			}

			sb.append("|");

			if (CATEGORY_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(CATEGORY_CODE);
			}

			sb.append("|");

			if (GENDER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(GENDER_CODE);
			}

			sb.append("|");

			if (ETHNIC_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(ETHNIC_KEY);
			}

			sb.append("|");

			if (AGE_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(AGE_CODE);
			}

			sb.append("|");

			if (EST_HH_INCOME_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(EST_HH_INCOME_CODE);
			}

			sb.append("|");

			if (TRGT_INC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRGT_INC);
			}

			sb.append("|");

			if (VIN_PATRN == null) {
				sb.append("<null>");
			} else {
				sb.append(VIN_PATRN);
			}

			sb.append("|");

			if (VIN_PATRN_SURR_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(VIN_PATRN_SURR_KEY);
			}

			sb.append("|");

			if (VEHICLE_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT);
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

				row2Struct row2 = new row2Struct();

				/**
				 * [tFileOutputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_1", false);
				start_Hash.put("tFileOutputDelimited_1",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_1";

				int tos_count_tFileOutputDelimited_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_1.append("Parameters:");
				log4jParamters_tFileOutputDelimited_1.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_NEW_FACT_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("COMPRESS" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("ROW_MODE" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("DELETE_EMPTYFILE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_1 - "
							+ log4jParamters_tFileOutputDelimited_1);

				String fileName_tFileOutputDelimited_1 = "";
				fileName_tFileOutputDelimited_1 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth + "/FORD_NEW_FACT_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_1 = null;
				String extension_tFileOutputDelimited_1 = null;
				String directory_tFileOutputDelimited_1 = null;
				if ((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
						extension_tFileOutputDelimited_1 = "";
					} else {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
								.substring(0, fileName_tFileOutputDelimited_1
										.lastIndexOf("."));
						extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
								.substring(fileName_tFileOutputDelimited_1
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
							.substring(0, fileName_tFileOutputDelimited_1
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
								.substring(0, fileName_tFileOutputDelimited_1
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
				 * Start field
				 * tFileOutputDelimited_1:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /**
				 * Start
				 * field tFileOutputDelimited_1:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_1 != null
						&& directory_tFileOutputDelimited_1.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_1 = new java.io.File(
							directory_tFileOutputDelimited_1);
					if (!dir_tFileOutputDelimited_1.exists()) {
						log.info("tFileOutputDelimited_1 - Creating directory '"
								+ dir_tFileOutputDelimited_1.getCanonicalPath()
								+ "'.");
						dir_tFileOutputDelimited_1.mkdirs();
						log.info("tFileOutputDelimited_1 - The directory '"
								+ dir_tFileOutputDelimited_1.getCanonicalPath()
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
										fileName_tFileOutputDelimited_1, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_1.length() == 0) {
						outtFileOutputDelimited_1.write("TRACTZIP_SAKEY");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("REPORT_YEAR_MONTH");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("MAKE_MODEL_CODE");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("CATEGORY_CODE");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("GENDER_CODE");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("ETHNIC_KEY");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("AGE_CODE");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("EST_HH_INCOME_CODE");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("TRGT_INC");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("VIN_PATRN");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("VIN_PATRN_SURR_KEY");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("VEHICLE_COUNT");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_1",
						outtFileOutputDelimited_1);
				resourceMap.put("nb_line_tFileOutputDelimited_1",
						nb_line_tFileOutputDelimited_1);

				/**
				 * [tFileOutputDelimited_1 begin ] stop
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
				log4jParamters_tOracleInput_1.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1
						.append("QUERY"
								+ " = "
								+ "\"  SELECT NF.TRACTZIP_SAKEY,--REFERENCES STANDARD/CUSTOM_GEOGRAPHY         REPORT_YEAR_MONTH,                       MAKE_MODEL_CODE,--REFERENCES CUSTOM_MAKE_MODEL_FOR         CATEGORY_CODE, --REFERENCES CUSTOM_CATEGORY_FOR                GENDER_CODE,  	   ETHNIC_KEY,  	   AGE_CODE,  	   EST_HH_INCOME_CODE,                TRGT_INC,                VIN_PATRN,         VIN_PATRN_SURR_KEY, --REFERENCES VEHICLE_ATTRIBUTES         SUM(VEHICLE_COUNT) VEHICLE_COUNT  FROM NEW_FACT NF, STANDARD_GEOGRAPHY SG  WHERE NF.VIN NOT LIKE '99%'   AND NF.TRACTZIP_SAKEY = SG.TRACTZIP_SAKEY  --AND SG.CT_STATE_ABBRV IN ('MD','TX','FL')  GROUP BY NF.TRACTZIP_SAKEY,         REPORT_YEAR_MONTH,                       MAKE_MODEL_CODE,         CATEGORY_CODE,               GENDER_CODE,  	   ETHNIC_KEY,  	   AGE_CODE,  	   EST_HH_INCOME_CODE,                TRGT_INC,                VIN_PATRN,         VIN_PATRN_SURR_KEY  \"    ");
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
						+ ("TRACTZIP_SAKEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_YEAR_MONTH")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MAKE_MODEL_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CATEGORY_CODE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("GENDER_CODE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ETHNIC_KEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("AGE_CODE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("EST_HH_INCOME_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TRGT_INC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("VIN_PATRN")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("VIN_PATRN_SURR_KEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEHICLE_COUNT") + "}]");
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

				String dbquery_tOracleInput_1 = "\nSELECT NF.TRACTZIP_SAKEY,--REFERENCES STANDARD/CUSTOM_GEOGRAPHY\n       REPORT_YEAR_MONTH,              \n       MAKE_MODEL_CODE,--REFERENCES CUSTOM_MAKE_MODEL_FOR\n       CATEGORY_CODE, --REFERENCES CUSTOM_CATEGORY_FOR       \n       GENDER_CODE,\n	   ETHNIC_KEY,\n	   AGE_CODE,\n	   EST_HH_INCOME_CODE,       \n       TRGT_INC,       \n       VIN_PATRN,\n       VIN_PATRN_SURR_KEY, --REFERENCES VEHICLE_ATTRIBUTES\n       SUM(VEHICLE_COUNT) VEHICLE_COUNT\nFROM NEW_FACT NF, STANDARD_GEOGRAPHY SG\nWHERE NF.VIN NOT LIKE '99%' \nAND NF.TRACTZIP_SAKEY = SG.TRACTZIP_SAKEY\n--AND SG.CT_STATE_ABBRV IN ('MD','TX','FL')\nGROUP BY NF.TRACTZIP_SAKEY,\n       REPORT_YEAR_MONTH,              \n       MAKE_MODEL_CODE,\n       CATEGORY_CODE,      \n       GENDER_CODE,\n	   ETHNIC_KEY,\n	   AGE_CODE,\n	   EST_HH_INCOME_CODE,       \n       TRGT_INC,       \n       VIN_PATRN,\n       VIN_PATRN_SURR_KEY\n"

				;

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
							row2.TRACTZIP_SAKEY = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(1);
							if (tmpContent_tOracleInput_1 != null) {
								row2.TRACTZIP_SAKEY = tmpContent_tOracleInput_1;
							} else {
								row2.TRACTZIP_SAKEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 2) {
							row2.REPORT_YEAR_MONTH = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(2);
							if (tmpContent_tOracleInput_1 != null) {
								row2.REPORT_YEAR_MONTH = tmpContent_tOracleInput_1;
							} else {
								row2.REPORT_YEAR_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 3) {
							row2.MAKE_MODEL_CODE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(3);
							if (tmpContent_tOracleInput_1 != null) {
								row2.MAKE_MODEL_CODE = tmpContent_tOracleInput_1;
							} else {
								row2.MAKE_MODEL_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 4) {
							row2.CATEGORY_CODE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(4);
							if (tmpContent_tOracleInput_1 != null) {
								row2.CATEGORY_CODE = tmpContent_tOracleInput_1;
							} else {
								row2.CATEGORY_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 5) {
							row2.GENDER_CODE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(5);
							if (tmpContent_tOracleInput_1 != null) {
								row2.GENDER_CODE = tmpContent_tOracleInput_1;
							} else {
								row2.GENDER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 6) {
							row2.ETHNIC_KEY = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(6);
							if (tmpContent_tOracleInput_1 != null) {
								row2.ETHNIC_KEY = tmpContent_tOracleInput_1;
							} else {
								row2.ETHNIC_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 7) {
							row2.AGE_CODE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(7);
							if (tmpContent_tOracleInput_1 != null) {
								row2.AGE_CODE = tmpContent_tOracleInput_1;
							} else {
								row2.AGE_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 8) {
							row2.EST_HH_INCOME_CODE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(8);
							if (tmpContent_tOracleInput_1 != null) {
								row2.EST_HH_INCOME_CODE = tmpContent_tOracleInput_1;
							} else {
								row2.EST_HH_INCOME_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 9) {
							row2.TRGT_INC = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(9);
							if (tmpContent_tOracleInput_1 != null) {
								row2.TRGT_INC = tmpContent_tOracleInput_1;
							} else {
								row2.TRGT_INC = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 10) {
							row2.VIN_PATRN = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(10);
							if (tmpContent_tOracleInput_1 != null) {
								row2.VIN_PATRN = tmpContent_tOracleInput_1;
							} else {
								row2.VIN_PATRN = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 11) {
							row2.VIN_PATRN_SURR_KEY = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(11);
							if (tmpContent_tOracleInput_1 != null) {
								row2.VIN_PATRN_SURR_KEY = tmpContent_tOracleInput_1;
							} else {
								row2.VIN_PATRN_SURR_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 12) {
							row2.VEHICLE_COUNT = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(12);
							if (tmpContent_tOracleInput_1 != null) {
								row2.VEHICLE_COUNT = tmpContent_tOracleInput_1;
							} else {
								row2.VEHICLE_COUNT = null;
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
						 * [tFileOutputDelimited_1 main ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						if (log.isTraceEnabled()) {
							log.trace("row2 - "
									+ (row2 == null ? "" : row2.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
						if (row2.TRACTZIP_SAKEY != null) {
							sb_tFileOutputDelimited_1
									.append(row2.TRACTZIP_SAKEY);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.REPORT_YEAR_MONTH != null) {
							sb_tFileOutputDelimited_1
									.append(row2.REPORT_YEAR_MONTH);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.MAKE_MODEL_CODE != null) {
							sb_tFileOutputDelimited_1
									.append(row2.MAKE_MODEL_CODE);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.CATEGORY_CODE != null) {
							sb_tFileOutputDelimited_1
									.append(row2.CATEGORY_CODE);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.GENDER_CODE != null) {
							sb_tFileOutputDelimited_1.append(row2.GENDER_CODE);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.ETHNIC_KEY != null) {
							sb_tFileOutputDelimited_1.append(row2.ETHNIC_KEY);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.AGE_CODE != null) {
							sb_tFileOutputDelimited_1.append(row2.AGE_CODE);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.EST_HH_INCOME_CODE != null) {
							sb_tFileOutputDelimited_1
									.append(row2.EST_HH_INCOME_CODE);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.TRGT_INC != null) {
							sb_tFileOutputDelimited_1.append(row2.TRGT_INC);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.VIN_PATRN != null) {
							sb_tFileOutputDelimited_1.append(row2.VIN_PATRN);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.VIN_PATRN_SURR_KEY != null) {
							sb_tFileOutputDelimited_1
									.append(row2.VIN_PATRN_SURR_KEY);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row2.VEHICLE_COUNT != null) {
							sb_tFileOutputDelimited_1
									.append(row2.VEHICLE_COUNT);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_1++;
							resourceMap.put("nb_line_tFileOutputDelimited_1",
									nb_line_tFileOutputDelimited_1);

							outtFileOutputDelimited_1
									.write(sb_tFileOutputDelimited_1.toString());
							log.debug("tFileOutputDelimited_1 - Writing the record "
									+ nb_line_tFileOutputDelimited_1 + ".");

						}

						tos_count_tFileOutputDelimited_1++;

						/**
						 * [tFileOutputDelimited_1 main ] stop
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

				resourceMap.put("finish_tFileOutputDelimited_1", true);

				log.info("tFileOutputDelimited_1 - Written records count: "
						+ nb_line_tFileOutputDelimited_1 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_1 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_1", true);
				end_Hash.put("tFileOutputDelimited_1",
						System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_1 end ] stop
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

	public static class row12Struct implements
			routines.system.IPersistableRow<row12Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String CATEGORY_CODE;

		public String getCATEGORY_CODE() {
			return this.CATEGORY_CODE;
		}

		public String CATEGORY_CODE_DESC;

		public String getCATEGORY_CODE_DESC() {
			return this.CATEGORY_CODE_DESC;
		}

		public String REGIS_TYPE_CODE;

		public String getREGIS_TYPE_CODE() {
			return this.REGIS_TYPE_CODE;
		}

		public String REGIS_TYPE_CODE_DESC;

		public String getREGIS_TYPE_CODE_DESC() {
			return this.REGIS_TYPE_CODE_DESC;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.CATEGORY_CODE = readString(dis);

					this.CATEGORY_CODE_DESC = readString(dis);

					this.REGIS_TYPE_CODE = readString(dis);

					this.REGIS_TYPE_CODE_DESC = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.CATEGORY_CODE, dos);

				// String

				writeString(this.CATEGORY_CODE_DESC, dos);

				// String

				writeString(this.REGIS_TYPE_CODE, dos);

				// String

				writeString(this.REGIS_TYPE_CODE_DESC, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CATEGORY_CODE=" + CATEGORY_CODE);
			sb.append(",CATEGORY_CODE_DESC=" + CATEGORY_CODE_DESC);
			sb.append(",REGIS_TYPE_CODE=" + REGIS_TYPE_CODE);
			sb.append(",REGIS_TYPE_CODE_DESC=" + REGIS_TYPE_CODE_DESC);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (CATEGORY_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(CATEGORY_CODE);
			}

			sb.append("|");

			if (CATEGORY_CODE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(CATEGORY_CODE_DESC);
			}

			sb.append("|");

			if (REGIS_TYPE_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(REGIS_TYPE_CODE);
			}

			sb.append("|");

			if (REGIS_TYPE_CODE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(REGIS_TYPE_CODE_DESC);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row12Struct other) {

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

	public void tOracleInput_10Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_10_SUBPROCESS_STATE", 0);

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

				row12Struct row12 = new row12Struct();

				/**
				 * [tFileOutputDelimited_9 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_9", false);
				start_Hash.put("tFileOutputDelimited_9",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_9";

				int tos_count_tFileOutputDelimited_9 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_9 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_9 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_9.append("Parameters:");
				log4jParamters_tFileOutputDelimited_9.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_CUSTOM_CATEGORY_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("COMPRESS" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("ROW_MODE" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				log4jParamters_tFileOutputDelimited_9.append("DELETE_EMPTYFILE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_9.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_9 - "
							+ log4jParamters_tFileOutputDelimited_9);

				String fileName_tFileOutputDelimited_9 = "";
				fileName_tFileOutputDelimited_9 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_CUSTOM_CATEGORY_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_9 = null;
				String extension_tFileOutputDelimited_9 = null;
				String directory_tFileOutputDelimited_9 = null;
				if ((fileName_tFileOutputDelimited_9.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_9.lastIndexOf(".") < fileName_tFileOutputDelimited_9
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_9 = fileName_tFileOutputDelimited_9;
						extension_tFileOutputDelimited_9 = "";
					} else {
						fullName_tFileOutputDelimited_9 = fileName_tFileOutputDelimited_9
								.substring(0, fileName_tFileOutputDelimited_9
										.lastIndexOf("."));
						extension_tFileOutputDelimited_9 = fileName_tFileOutputDelimited_9
								.substring(fileName_tFileOutputDelimited_9
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_9 = fileName_tFileOutputDelimited_9
							.substring(0, fileName_tFileOutputDelimited_9
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_9.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_9 = fileName_tFileOutputDelimited_9
								.substring(0, fileName_tFileOutputDelimited_9
										.lastIndexOf("."));
						extension_tFileOutputDelimited_9 = fileName_tFileOutputDelimited_9
								.substring(fileName_tFileOutputDelimited_9
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_9 = fileName_tFileOutputDelimited_9;
						extension_tFileOutputDelimited_9 = "";
					}
					directory_tFileOutputDelimited_9 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_9 = true;
				java.io.File filetFileOutputDelimited_9 = new java.io.File(
						fileName_tFileOutputDelimited_9);
				globalMap.put("tFileOutputDelimited_9_FILE_NAME",
						fileName_tFileOutputDelimited_9);
				int nb_line_tFileOutputDelimited_9 = 0;
				int splitEvery_tFileOutputDelimited_9 = 1000;
				int splitedFileNo_tFileOutputDelimited_9 = 0;
				int currentRow_tFileOutputDelimited_9 = 0;

				final String OUT_DELIM_tFileOutputDelimited_9 = /**
				 * Start field
				 * tFileOutputDelimited_9:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_9:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_9 = /**
				 * Start
				 * field tFileOutputDelimited_9:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_9:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_9 != null
						&& directory_tFileOutputDelimited_9.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_9 = new java.io.File(
							directory_tFileOutputDelimited_9);
					if (!dir_tFileOutputDelimited_9.exists()) {
						log.info("tFileOutputDelimited_9 - Creating directory '"
								+ dir_tFileOutputDelimited_9.getCanonicalPath()
								+ "'.");
						dir_tFileOutputDelimited_9.mkdirs();
						log.info("tFileOutputDelimited_9 - The directory '"
								+ dir_tFileOutputDelimited_9.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_9 = null;

				java.io.File fileToDelete_tFileOutputDelimited_9 = new java.io.File(
						fileName_tFileOutputDelimited_9);
				if (fileToDelete_tFileOutputDelimited_9.exists()) {
					fileToDelete_tFileOutputDelimited_9.delete();
				}
				outtFileOutputDelimited_9 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_9, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_9.length() == 0) {
						outtFileOutputDelimited_9.write("CATEGORY_CODE");
						outtFileOutputDelimited_9
								.write(OUT_DELIM_tFileOutputDelimited_9);
						outtFileOutputDelimited_9.write("CATEGORY_CODE_DESC");
						outtFileOutputDelimited_9
								.write(OUT_DELIM_tFileOutputDelimited_9);
						outtFileOutputDelimited_9.write("REGIS_TYPE_CODE");
						outtFileOutputDelimited_9
								.write(OUT_DELIM_tFileOutputDelimited_9);
						outtFileOutputDelimited_9.write("REGIS_TYPE_CODE_DESC");
						outtFileOutputDelimited_9
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_9);
						outtFileOutputDelimited_9.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_9",
						outtFileOutputDelimited_9);
				resourceMap.put("nb_line_tFileOutputDelimited_9",
						nb_line_tFileOutputDelimited_9);

				/**
				 * [tFileOutputDelimited_9 begin ] stop
				 */

				/**
				 * [tOracleInput_10 begin ] start
				 */

				ok_Hash.put("tOracleInput_10", false);
				start_Hash.put("tOracleInput_10", System.currentTimeMillis());

				currentComponent = "tOracleInput_10";

				int tos_count_tOracleInput_10 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_10 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_10 = new StringBuilder();
				log4jParamters_tOracleInput_10.append("Parameters:");
				log4jParamters_tOracleInput_10.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10
						.append("QUERY"
								+ " = "
								+ "\"  SELECT CATEGORY_CODE, --REFERENCES FACT TABLES         CATEGORY_CODE_DESC,          REGIS_TYPE_CODE,          REGIS_TYPE_CODE_DESC   FROM CUSTOM_CATEGORY_FOR  ORDER BY 1  \"    ");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("CATEGORY_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CATEGORY_CODE_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("REGIS_TYPE_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REGIS_TYPE_CODE_DESC") + "}]");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_10.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_10 - "
							+ log4jParamters_tOracleInput_10);

				int nb_line_tOracleInput_10 = 0;
				java.sql.Connection conn_tOracleInput_10 = null;
				String driverClass_tOracleInput_10 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_10);

				String url_tOracleInput_10 = null;
				url_tOracleInput_10 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_10 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_10 = context.dbPasswordPI;

				String dbPwd_tOracleInput_10 = decryptedPassword_tOracleInput_10;

				log.debug("tOracleInput_10 - Driver ClassName: "
						+ driverClass_tOracleInput_10 + ".");

				log.info("tOracleInput_10 - Connection attempt to '"
						+ url_tOracleInput_10 + "' with the username '"
						+ dbUser_tOracleInput_10 + "'.");

				conn_tOracleInput_10 = java.sql.DriverManager.getConnection(
						url_tOracleInput_10, dbUser_tOracleInput_10,
						dbPwd_tOracleInput_10);
				log.info("tOracleInput_10 - Connection to '"
						+ url_tOracleInput_10 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_10 = conn_tOracleInput_10
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_10 = stmtGetTZ_tOracleInput_10
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_10 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_10.next()) {
					sessionTimezone_tOracleInput_10 = rsGetTZ_tOracleInput_10
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_10)
						.setSessionTimeZone(sessionTimezone_tOracleInput_10);

				java.sql.Statement stmt_tOracleInput_10 = conn_tOracleInput_10
						.createStatement();

				String dbquery_tOracleInput_10 = "\nSELECT CATEGORY_CODE, --REFERENCES FACT TABLES\n       CATEGORY_CODE_DESC, \n       REGIS_TYPE_CODE, \n       REGIS_TYPE_CODE_DESC \nFROM CUSTOM_CATEGORY_FOR\nORDER BY 1\n"

				;

				log.info("tOracleInput_10 - Executing the query: '"
						+ dbquery_tOracleInput_10 + "'.");

				globalMap.put("tOracleInput_10_QUERY", dbquery_tOracleInput_10);

				java.sql.ResultSet rs_tOracleInput_10 = null;
				try {
					rs_tOracleInput_10 = stmt_tOracleInput_10
							.executeQuery(dbquery_tOracleInput_10);
					java.sql.ResultSetMetaData rsmd_tOracleInput_10 = rs_tOracleInput_10
							.getMetaData();
					int colQtyInRs_tOracleInput_10 = rsmd_tOracleInput_10
							.getColumnCount();

					String tmpContent_tOracleInput_10 = null;

					log.info("tOracleInput_10 - Retrieving records from the database.");

					while (rs_tOracleInput_10.next()) {
						nb_line_tOracleInput_10++;

						if (colQtyInRs_tOracleInput_10 < 1) {
							row12.CATEGORY_CODE = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(1);
							if (tmpContent_tOracleInput_10 != null) {
								row12.CATEGORY_CODE = tmpContent_tOracleInput_10;
							} else {
								row12.CATEGORY_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 2) {
							row12.CATEGORY_CODE_DESC = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(2);
							if (tmpContent_tOracleInput_10 != null) {
								row12.CATEGORY_CODE_DESC = tmpContent_tOracleInput_10;
							} else {
								row12.CATEGORY_CODE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 3) {
							row12.REGIS_TYPE_CODE = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(3);
							if (tmpContent_tOracleInput_10 != null) {
								row12.REGIS_TYPE_CODE = tmpContent_tOracleInput_10;
							} else {
								row12.REGIS_TYPE_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 4) {
							row12.REGIS_TYPE_CODE_DESC = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(4);
							if (tmpContent_tOracleInput_10 != null) {
								row12.REGIS_TYPE_CODE_DESC = tmpContent_tOracleInput_10;
							} else {
								row12.REGIS_TYPE_CODE_DESC = null;
							}
						}

						log.debug("tOracleInput_10 - Retrieving the record "
								+ nb_line_tOracleInput_10 + ".");

						/**
						 * [tOracleInput_10 begin ] stop
						 */

						/**
						 * [tOracleInput_10 main ] start
						 */

						currentComponent = "tOracleInput_10";

						tos_count_tOracleInput_10++;

						/**
						 * [tOracleInput_10 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_9 main ] start
						 */

						currentComponent = "tFileOutputDelimited_9";

						if (log.isTraceEnabled()) {
							log.trace("row12 - "
									+ (row12 == null ? "" : row12.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_9 = new StringBuilder();
						if (row12.CATEGORY_CODE != null) {
							sb_tFileOutputDelimited_9
									.append(row12.CATEGORY_CODE);
						}
						sb_tFileOutputDelimited_9
								.append(OUT_DELIM_tFileOutputDelimited_9);
						if (row12.CATEGORY_CODE_DESC != null) {
							sb_tFileOutputDelimited_9
									.append(row12.CATEGORY_CODE_DESC);
						}
						sb_tFileOutputDelimited_9
								.append(OUT_DELIM_tFileOutputDelimited_9);
						if (row12.REGIS_TYPE_CODE != null) {
							sb_tFileOutputDelimited_9
									.append(row12.REGIS_TYPE_CODE);
						}
						sb_tFileOutputDelimited_9
								.append(OUT_DELIM_tFileOutputDelimited_9);
						if (row12.REGIS_TYPE_CODE_DESC != null) {
							sb_tFileOutputDelimited_9
									.append(row12.REGIS_TYPE_CODE_DESC);
						}
						sb_tFileOutputDelimited_9
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_9);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_9++;
							resourceMap.put("nb_line_tFileOutputDelimited_9",
									nb_line_tFileOutputDelimited_9);

							outtFileOutputDelimited_9
									.write(sb_tFileOutputDelimited_9.toString());
							log.debug("tFileOutputDelimited_9 - Writing the record "
									+ nb_line_tFileOutputDelimited_9 + ".");

						}

						tos_count_tFileOutputDelimited_9++;

						/**
						 * [tFileOutputDelimited_9 main ] stop
						 */

						/**
						 * [tOracleInput_10 end ] start
						 */

						currentComponent = "tOracleInput_10";

					}
				} finally {
					stmt_tOracleInput_10.close();

					if (conn_tOracleInput_10 != null
							&& !conn_tOracleInput_10.isClosed()) {

						log.info("tOracleInput_10 - Closing the connection to the database.");

						conn_tOracleInput_10.close();

						log.info("tOracleInput_10 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_10_NB_LINE",
						nb_line_tOracleInput_10);
				log.info("tOracleInput_10 - Retrieved records count: "
						+ nb_line_tOracleInput_10 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_10 - " + "Done.");

				ok_Hash.put("tOracleInput_10", true);
				end_Hash.put("tOracleInput_10", System.currentTimeMillis());

				/**
				 * [tOracleInput_10 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_9 end ] start
				 */

				currentComponent = "tFileOutputDelimited_9";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_9 != null) {
						outtFileOutputDelimited_9.flush();
						outtFileOutputDelimited_9.close();
					}

					globalMap.put("tFileOutputDelimited_9_NB_LINE",
							nb_line_tFileOutputDelimited_9);
					globalMap.put("tFileOutputDelimited_9_FILE_NAME",
							fileName_tFileOutputDelimited_9);

				}

				resourceMap.put("finish_tFileOutputDelimited_9", true);

				log.info("tFileOutputDelimited_9 - Written records count: "
						+ nb_line_tFileOutputDelimited_9 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_9 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_9", true);
				end_Hash.put("tFileOutputDelimited_9",
						System.currentTimeMillis());

				tOracleInput_14Process(globalMap);

				/**
				 * [tFileOutputDelimited_9 end ] stop
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
				 * [tOracleInput_10 finally ] start
				 */

				currentComponent = "tOracleInput_10";

				/**
				 * [tOracleInput_10 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_9 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_9";

				if (resourceMap.get("finish_tFileOutputDelimited_9") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_9 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_9");
						if (outtFileOutputDelimited_9 != null) {
							outtFileOutputDelimited_9.flush();
							outtFileOutputDelimited_9.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_9 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_10_SUBPROCESS_STATE", 1);
	}

	public static class row16Struct implements
			routines.system.IPersistableRow<row16Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String TRACTZIP_SAKEY;

		public String getTRACTZIP_SAKEY() {
			return this.TRACTZIP_SAKEY;
		}

		public String SALES_AREA_NAME;

		public String getSALES_AREA_NAME() {
			return this.SALES_AREA_NAME;
		}

		public String MKT_AREA_NAME;

		public String getMKT_AREA_NAME() {
			return this.MKT_AREA_NAME;
		}

		public String REGION_NAME;

		public String getREGION_NAME() {
			return this.REGION_NAME;
		}

		public String DISTRICT_NAME;

		public String getDISTRICT_NAME() {
			return this.DISTRICT_NAME;
		}

		public String ZONE_NAME;

		public String getZONE_NAME() {
			return this.ZONE_NAME;
		}

		public String AREA_NAME;

		public String getAREA_NAME() {
			return this.AREA_NAME;
		}

		public String DEALER_NAME;

		public String getDEALER_NAME() {
			return this.DEALER_NAME;
		}

		public String ZIP_TOWN;

		public String getZIP_TOWN() {
			return this.ZIP_TOWN;
		}

		public String ZIP_CODE;

		public String getZIP_CODE() {
			return this.ZIP_CODE;
		}

		public String TRC_ZIP_KEY;

		public String getTRC_ZIP_KEY() {
			return this.TRC_ZIP_KEY;
		}

		public String FDAF_NAME;

		public String getFDAF_NAME() {
			return this.FDAF_NAME;
		}

		public String MAJ_MKT_NAME;

		public String getMAJ_MKT_NAME() {
			return this.MAJ_MKT_NAME;
		}

		public String Top_130;

		public String getTop_130() {
			return this.Top_130;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.TRACTZIP_SAKEY = readString(dis);

					this.SALES_AREA_NAME = readString(dis);

					this.MKT_AREA_NAME = readString(dis);

					this.REGION_NAME = readString(dis);

					this.DISTRICT_NAME = readString(dis);

					this.ZONE_NAME = readString(dis);

					this.AREA_NAME = readString(dis);

					this.DEALER_NAME = readString(dis);

					this.ZIP_TOWN = readString(dis);

					this.ZIP_CODE = readString(dis);

					this.TRC_ZIP_KEY = readString(dis);

					this.FDAF_NAME = readString(dis);

					this.MAJ_MKT_NAME = readString(dis);

					this.Top_130 = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TRACTZIP_SAKEY, dos);

				// String

				writeString(this.SALES_AREA_NAME, dos);

				// String

				writeString(this.MKT_AREA_NAME, dos);

				// String

				writeString(this.REGION_NAME, dos);

				// String

				writeString(this.DISTRICT_NAME, dos);

				// String

				writeString(this.ZONE_NAME, dos);

				// String

				writeString(this.AREA_NAME, dos);

				// String

				writeString(this.DEALER_NAME, dos);

				// String

				writeString(this.ZIP_TOWN, dos);

				// String

				writeString(this.ZIP_CODE, dos);

				// String

				writeString(this.TRC_ZIP_KEY, dos);

				// String

				writeString(this.FDAF_NAME, dos);

				// String

				writeString(this.MAJ_MKT_NAME, dos);

				// String

				writeString(this.Top_130, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRACTZIP_SAKEY=" + TRACTZIP_SAKEY);
			sb.append(",SALES_AREA_NAME=" + SALES_AREA_NAME);
			sb.append(",MKT_AREA_NAME=" + MKT_AREA_NAME);
			sb.append(",REGION_NAME=" + REGION_NAME);
			sb.append(",DISTRICT_NAME=" + DISTRICT_NAME);
			sb.append(",ZONE_NAME=" + ZONE_NAME);
			sb.append(",AREA_NAME=" + AREA_NAME);
			sb.append(",DEALER_NAME=" + DEALER_NAME);
			sb.append(",ZIP_TOWN=" + ZIP_TOWN);
			sb.append(",ZIP_CODE=" + ZIP_CODE);
			sb.append(",TRC_ZIP_KEY=" + TRC_ZIP_KEY);
			sb.append(",FDAF_NAME=" + FDAF_NAME);
			sb.append(",MAJ_MKT_NAME=" + MAJ_MKT_NAME);
			sb.append(",Top_130=" + Top_130);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TRACTZIP_SAKEY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRACTZIP_SAKEY);
			}

			sb.append("|");

			if (SALES_AREA_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES_AREA_NAME);
			}

			sb.append("|");

			if (MKT_AREA_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(MKT_AREA_NAME);
			}

			sb.append("|");

			if (REGION_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(REGION_NAME);
			}

			sb.append("|");

			if (DISTRICT_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(DISTRICT_NAME);
			}

			sb.append("|");

			if (ZONE_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(ZONE_NAME);
			}

			sb.append("|");

			if (AREA_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(AREA_NAME);
			}

			sb.append("|");

			if (DEALER_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_NAME);
			}

			sb.append("|");

			if (ZIP_TOWN == null) {
				sb.append("<null>");
			} else {
				sb.append(ZIP_TOWN);
			}

			sb.append("|");

			if (ZIP_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(ZIP_CODE);
			}

			sb.append("|");

			if (TRC_ZIP_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRC_ZIP_KEY);
			}

			sb.append("|");

			if (FDAF_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(FDAF_NAME);
			}

			sb.append("|");

			if (MAJ_MKT_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(MAJ_MKT_NAME);
			}

			sb.append("|");

			if (Top_130 == null) {
				sb.append("<null>");
			} else {
				sb.append(Top_130);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row16Struct other) {

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

	public void tOracleInput_14Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_14_SUBPROCESS_STATE", 0);

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

				row16Struct row16 = new row16Struct();

				/**
				 * [tFileOutputDelimited_13 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_13", false);
				start_Hash.put("tFileOutputDelimited_13",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_13";

				int tos_count_tFileOutputDelimited_13 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_13 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_13 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_13.append("Parameters:");
				log4jParamters_tFileOutputDelimited_13.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_CUSTOM_GEOGRAPHY_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				log4jParamters_tFileOutputDelimited_13
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_13.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_13 - "
							+ log4jParamters_tFileOutputDelimited_13);

				String fileName_tFileOutputDelimited_13 = "";
				fileName_tFileOutputDelimited_13 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_CUSTOM_GEOGRAPHY_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_13 = null;
				String extension_tFileOutputDelimited_13 = null;
				String directory_tFileOutputDelimited_13 = null;
				if ((fileName_tFileOutputDelimited_13.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_13.lastIndexOf(".") < fileName_tFileOutputDelimited_13
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13;
						extension_tFileOutputDelimited_13 = "";
					} else {
						fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13
								.substring(0, fileName_tFileOutputDelimited_13
										.lastIndexOf("."));
						extension_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13
								.substring(fileName_tFileOutputDelimited_13
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13
							.substring(0, fileName_tFileOutputDelimited_13
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_13.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13
								.substring(0, fileName_tFileOutputDelimited_13
										.lastIndexOf("."));
						extension_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13
								.substring(fileName_tFileOutputDelimited_13
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13;
						extension_tFileOutputDelimited_13 = "";
					}
					directory_tFileOutputDelimited_13 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_13 = true;
				java.io.File filetFileOutputDelimited_13 = new java.io.File(
						fileName_tFileOutputDelimited_13);
				globalMap.put("tFileOutputDelimited_13_FILE_NAME",
						fileName_tFileOutputDelimited_13);
				int nb_line_tFileOutputDelimited_13 = 0;
				int splitEvery_tFileOutputDelimited_13 = 1000;
				int splitedFileNo_tFileOutputDelimited_13 = 0;
				int currentRow_tFileOutputDelimited_13 = 0;

				final String OUT_DELIM_tFileOutputDelimited_13 = /**
				 * Start field
				 * tFileOutputDelimited_13:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_13:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_13 = /**
				 * Start
				 * field tFileOutputDelimited_13:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_13:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_13 != null
						&& directory_tFileOutputDelimited_13.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_13 = new java.io.File(
							directory_tFileOutputDelimited_13);
					if (!dir_tFileOutputDelimited_13.exists()) {
						log.info("tFileOutputDelimited_13 - Creating directory '"
								+ dir_tFileOutputDelimited_13
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_13.mkdirs();
						log.info("tFileOutputDelimited_13 - The directory '"
								+ dir_tFileOutputDelimited_13
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_13 = null;

				java.io.File fileToDelete_tFileOutputDelimited_13 = new java.io.File(
						fileName_tFileOutputDelimited_13);
				if (fileToDelete_tFileOutputDelimited_13.exists()) {
					fileToDelete_tFileOutputDelimited_13.delete();
				}
				outtFileOutputDelimited_13 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_13, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_13.length() == 0) {
						outtFileOutputDelimited_13.write("TRACTZIP_SAKEY");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("SALES_AREA_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("MKT_AREA_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("REGION_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("DISTRICT_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("ZONE_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("AREA_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("DEALER_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("ZIP_TOWN");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("ZIP_CODE");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("TRC_ZIP_KEY");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("FDAF_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("MAJ_MKT_NAME");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.write("Top_130");
						outtFileOutputDelimited_13
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_13);
						outtFileOutputDelimited_13.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_13",
						outtFileOutputDelimited_13);
				resourceMap.put("nb_line_tFileOutputDelimited_13",
						nb_line_tFileOutputDelimited_13);

				/**
				 * [tFileOutputDelimited_13 begin ] stop
				 */

				/**
				 * [tOracleInput_14 begin ] start
				 */

				ok_Hash.put("tOracleInput_14", false);
				start_Hash.put("tOracleInput_14", System.currentTimeMillis());

				currentComponent = "tOracleInput_14";

				int tos_count_tOracleInput_14 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_14 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_14 = new StringBuilder();
				log4jParamters_tOracleInput_14.append("Parameters:");
				log4jParamters_tOracleInput_14.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14
						.append("QUERY"
								+ " = "
								+ "\"  SELECT TRACTZIP_SAKEY, --REFERENCES FACT TABLES  		SALES_AREA_NAME,		   		MKT_AREA_NAME,				  		REGION_NAME, 		  		DISTRICT_NAME,		  		ZONE_NAME, 		  		AREA_NAME,			  		DEALER_NAME,           ZIP_TOWN,          ZIP_CODE,           TRC_ZIP_KEY,		  		FDAF_NAME,  		MAJ_MKT_NAME,  		CASE               WHEN CBSA_MARKET_IND = 'Y' THEN 'Top 130 Market'              ELSE 'Other Market'  		END Top_130  FROM CUSTOM_GEOGRAPHY_FOR  \"    ");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("TRACTZIP_SAKEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SALES_AREA_NAME")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MKT_AREA_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REGION_NAME") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("DISTRICT_NAME")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ZONE_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("AREA_NAME") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("DEALER_NAME")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ZIP_TOWN") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ZIP_CODE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("TRC_ZIP_KEY")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("FDAF_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("MAJ_MKT_NAME") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("Top_130") + "}]");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_14.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_14 - "
							+ log4jParamters_tOracleInput_14);

				int nb_line_tOracleInput_14 = 0;
				java.sql.Connection conn_tOracleInput_14 = null;
				String driverClass_tOracleInput_14 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_14);

				String url_tOracleInput_14 = null;
				url_tOracleInput_14 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_14 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_14 = context.dbPasswordPI;

				String dbPwd_tOracleInput_14 = decryptedPassword_tOracleInput_14;

				log.debug("tOracleInput_14 - Driver ClassName: "
						+ driverClass_tOracleInput_14 + ".");

				log.info("tOracleInput_14 - Connection attempt to '"
						+ url_tOracleInput_14 + "' with the username '"
						+ dbUser_tOracleInput_14 + "'.");

				conn_tOracleInput_14 = java.sql.DriverManager.getConnection(
						url_tOracleInput_14, dbUser_tOracleInput_14,
						dbPwd_tOracleInput_14);
				log.info("tOracleInput_14 - Connection to '"
						+ url_tOracleInput_14 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_14 = conn_tOracleInput_14
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_14 = stmtGetTZ_tOracleInput_14
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_14 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_14.next()) {
					sessionTimezone_tOracleInput_14 = rsGetTZ_tOracleInput_14
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_14)
						.setSessionTimeZone(sessionTimezone_tOracleInput_14);

				java.sql.Statement stmt_tOracleInput_14 = conn_tOracleInput_14
						.createStatement();

				String dbquery_tOracleInput_14 = "\nSELECT TRACTZIP_SAKEY, --REFERENCES FACT TABLES\n		SALES_AREA_NAME,		 \n		MKT_AREA_NAME,				\n		REGION_NAME, 		\n		DISTRICT_NAME,		\n		ZONE_NAME, 		\n		AREA_NAME,			\n		DEALER_NAME, \n        ZIP_TOWN,\n        ZIP_CODE, \n        TRC_ZIP_KEY,		\n		FDAF_NAME,\n		MAJ_MKT_NAME,\n		CASE \n            WHEN CBSA_MARKET_IND = 'Y' THEN 'Top 130 Market'\n            ELSE 'Other Market'\n		END Top_130\nFROM CUSTOM_GEOGRAPHY_FOR\n"

				;

				log.info("tOracleInput_14 - Executing the query: '"
						+ dbquery_tOracleInput_14 + "'.");

				globalMap.put("tOracleInput_14_QUERY", dbquery_tOracleInput_14);

				java.sql.ResultSet rs_tOracleInput_14 = null;
				try {
					rs_tOracleInput_14 = stmt_tOracleInput_14
							.executeQuery(dbquery_tOracleInput_14);
					java.sql.ResultSetMetaData rsmd_tOracleInput_14 = rs_tOracleInput_14
							.getMetaData();
					int colQtyInRs_tOracleInput_14 = rsmd_tOracleInput_14
							.getColumnCount();

					String tmpContent_tOracleInput_14 = null;

					log.info("tOracleInput_14 - Retrieving records from the database.");

					while (rs_tOracleInput_14.next()) {
						nb_line_tOracleInput_14++;

						if (colQtyInRs_tOracleInput_14 < 1) {
							row16.TRACTZIP_SAKEY = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(1);
							if (tmpContent_tOracleInput_14 != null) {
								row16.TRACTZIP_SAKEY = tmpContent_tOracleInput_14;
							} else {
								row16.TRACTZIP_SAKEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 2) {
							row16.SALES_AREA_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(2);
							if (tmpContent_tOracleInput_14 != null) {
								row16.SALES_AREA_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.SALES_AREA_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 3) {
							row16.MKT_AREA_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(3);
							if (tmpContent_tOracleInput_14 != null) {
								row16.MKT_AREA_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.MKT_AREA_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 4) {
							row16.REGION_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(4);
							if (tmpContent_tOracleInput_14 != null) {
								row16.REGION_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.REGION_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 5) {
							row16.DISTRICT_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(5);
							if (tmpContent_tOracleInput_14 != null) {
								row16.DISTRICT_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.DISTRICT_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 6) {
							row16.ZONE_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(6);
							if (tmpContent_tOracleInput_14 != null) {
								row16.ZONE_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.ZONE_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 7) {
							row16.AREA_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(7);
							if (tmpContent_tOracleInput_14 != null) {
								row16.AREA_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.AREA_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 8) {
							row16.DEALER_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(8);
							if (tmpContent_tOracleInput_14 != null) {
								row16.DEALER_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.DEALER_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 9) {
							row16.ZIP_TOWN = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(9);
							if (tmpContent_tOracleInput_14 != null) {
								row16.ZIP_TOWN = tmpContent_tOracleInput_14;
							} else {
								row16.ZIP_TOWN = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 10) {
							row16.ZIP_CODE = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(10);
							if (tmpContent_tOracleInput_14 != null) {
								row16.ZIP_CODE = tmpContent_tOracleInput_14;
							} else {
								row16.ZIP_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 11) {
							row16.TRC_ZIP_KEY = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(11);
							if (tmpContent_tOracleInput_14 != null) {
								row16.TRC_ZIP_KEY = tmpContent_tOracleInput_14;
							} else {
								row16.TRC_ZIP_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 12) {
							row16.FDAF_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(12);
							if (tmpContent_tOracleInput_14 != null) {
								row16.FDAF_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.FDAF_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 13) {
							row16.MAJ_MKT_NAME = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(13);
							if (tmpContent_tOracleInput_14 != null) {
								row16.MAJ_MKT_NAME = tmpContent_tOracleInput_14;
							} else {
								row16.MAJ_MKT_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 14) {
							row16.Top_130 = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(14);
							if (tmpContent_tOracleInput_14 != null) {
								row16.Top_130 = tmpContent_tOracleInput_14;
							} else {
								row16.Top_130 = null;
							}
						}

						log.debug("tOracleInput_14 - Retrieving the record "
								+ nb_line_tOracleInput_14 + ".");

						/**
						 * [tOracleInput_14 begin ] stop
						 */

						/**
						 * [tOracleInput_14 main ] start
						 */

						currentComponent = "tOracleInput_14";

						tos_count_tOracleInput_14++;

						/**
						 * [tOracleInput_14 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_13 main ] start
						 */

						currentComponent = "tFileOutputDelimited_13";

						if (log.isTraceEnabled()) {
							log.trace("row16 - "
									+ (row16 == null ? "" : row16.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_13 = new StringBuilder();
						if (row16.TRACTZIP_SAKEY != null) {
							sb_tFileOutputDelimited_13
									.append(row16.TRACTZIP_SAKEY);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.SALES_AREA_NAME != null) {
							sb_tFileOutputDelimited_13
									.append(row16.SALES_AREA_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.MKT_AREA_NAME != null) {
							sb_tFileOutputDelimited_13
									.append(row16.MKT_AREA_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.REGION_NAME != null) {
							sb_tFileOutputDelimited_13
									.append(row16.REGION_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.DISTRICT_NAME != null) {
							sb_tFileOutputDelimited_13
									.append(row16.DISTRICT_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.ZONE_NAME != null) {
							sb_tFileOutputDelimited_13.append(row16.ZONE_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.AREA_NAME != null) {
							sb_tFileOutputDelimited_13.append(row16.AREA_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.DEALER_NAME != null) {
							sb_tFileOutputDelimited_13
									.append(row16.DEALER_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.ZIP_TOWN != null) {
							sb_tFileOutputDelimited_13.append(row16.ZIP_TOWN);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.ZIP_CODE != null) {
							sb_tFileOutputDelimited_13.append(row16.ZIP_CODE);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.TRC_ZIP_KEY != null) {
							sb_tFileOutputDelimited_13
									.append(row16.TRC_ZIP_KEY);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.FDAF_NAME != null) {
							sb_tFileOutputDelimited_13.append(row16.FDAF_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.MAJ_MKT_NAME != null) {
							sb_tFileOutputDelimited_13
									.append(row16.MAJ_MKT_NAME);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_tFileOutputDelimited_13);
						if (row16.Top_130 != null) {
							sb_tFileOutputDelimited_13.append(row16.Top_130);
						}
						sb_tFileOutputDelimited_13
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_13);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_13++;
							resourceMap.put("nb_line_tFileOutputDelimited_13",
									nb_line_tFileOutputDelimited_13);

							outtFileOutputDelimited_13
									.write(sb_tFileOutputDelimited_13
											.toString());
							log.debug("tFileOutputDelimited_13 - Writing the record "
									+ nb_line_tFileOutputDelimited_13 + ".");

						}

						tos_count_tFileOutputDelimited_13++;

						/**
						 * [tFileOutputDelimited_13 main ] stop
						 */

						/**
						 * [tOracleInput_14 end ] start
						 */

						currentComponent = "tOracleInput_14";

					}
				} finally {
					stmt_tOracleInput_14.close();

					if (conn_tOracleInput_14 != null
							&& !conn_tOracleInput_14.isClosed()) {

						log.info("tOracleInput_14 - Closing the connection to the database.");

						conn_tOracleInput_14.close();

						log.info("tOracleInput_14 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_14_NB_LINE",
						nb_line_tOracleInput_14);
				log.info("tOracleInput_14 - Retrieved records count: "
						+ nb_line_tOracleInput_14 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_14 - " + "Done.");

				ok_Hash.put("tOracleInput_14", true);
				end_Hash.put("tOracleInput_14", System.currentTimeMillis());

				/**
				 * [tOracleInput_14 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_13 end ] start
				 */

				currentComponent = "tFileOutputDelimited_13";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_13 != null) {
						outtFileOutputDelimited_13.flush();
						outtFileOutputDelimited_13.close();
					}

					globalMap.put("tFileOutputDelimited_13_NB_LINE",
							nb_line_tFileOutputDelimited_13);
					globalMap.put("tFileOutputDelimited_13_FILE_NAME",
							fileName_tFileOutputDelimited_13);

				}

				resourceMap.put("finish_tFileOutputDelimited_13", true);

				log.info("tFileOutputDelimited_13 - Written records count: "
						+ nb_line_tFileOutputDelimited_13 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_13 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_13", true);
				end_Hash.put("tFileOutputDelimited_13",
						System.currentTimeMillis());

				tOracleInput_16Process(globalMap);

				/**
				 * [tFileOutputDelimited_13 end ] stop
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
				 * [tOracleInput_14 finally ] start
				 */

				currentComponent = "tOracleInput_14";

				/**
				 * [tOracleInput_14 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_13 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_13";

				if (resourceMap.get("finish_tFileOutputDelimited_13") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_13 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_13");
						if (outtFileOutputDelimited_13 != null) {
							outtFileOutputDelimited_13.flush();
							outtFileOutputDelimited_13.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_13 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_14_SUBPROCESS_STATE", 1);
	}

	public static class row18Struct implements
			routines.system.IPersistableRow<row18Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String SEGMENT_DESC;

		public String getSEGMENT_DESC() {
			return this.SEGMENT_DESC;
		}

		public String VEHICLE_TYPE_DESC;

		public String getVEHICLE_TYPE_DESC() {
			return this.VEHICLE_TYPE_DESC;
		}

		public String MAKE_MODEL_CODE;

		public String getMAKE_MODEL_CODE() {
			return this.MAKE_MODEL_CODE;
		}

		public String MAKE_DESC;

		public String getMAKE_DESC() {
			return this.MAKE_DESC;
		}

		public String MODEL_DESC;

		public String getMODEL_DESC() {
			return this.MODEL_DESC;
		}

		public String SERIES_TEXT;

		public String getSERIES_TEXT() {
			return this.SERIES_TEXT;
		}

		public String SUB_SERIES_TEXT;

		public String getSUB_SERIES_TEXT() {
			return this.SUB_SERIES_TEXT;
		}

		public String CORP_DESC;

		public String getCORP_DESC() {
			return this.CORP_DESC;
		}

		public String CORP2;

		public String getCORP2() {
			return this.CORP2;
		}

		public String ORIGIN;

		public String getORIGIN() {
			return this.ORIGIN;
		}

		public String POLK_BODY_STYLE_DESC;

		public String getPOLK_BODY_STYLE_DESC() {
			return this.POLK_BODY_STYLE_DESC;
		}

		public String NUMBER_OF_DOORS_DESC;

		public String getNUMBER_OF_DOORS_DESC() {
			return this.NUMBER_OF_DOORS_DESC;
		}

		public String DRIVE_TYPE_DESC;

		public String getDRIVE_TYPE_DESC() {
			return this.DRIVE_TYPE_DESC;
		}

		public String ORIGIN_DESC;

		public String getORIGIN_DESC() {
			return this.ORIGIN_DESC;
		}

		public String FUEL_DESC;

		public String getFUEL_DESC() {
			return this.FUEL_DESC;
		}

		public String NUMBER_OF_CYLS_DESC;

		public String getNUMBER_OF_CYLS_DESC() {
			return this.NUMBER_OF_CYLS_DESC;
		}

		public String CAB_SIZE_DESC;

		public String getCAB_SIZE_DESC() {
			return this.CAB_SIZE_DESC;
		}

		public String BED_SIZE_DESC;

		public String getBED_SIZE_DESC() {
			return this.BED_SIZE_DESC;
		}

		public String GVW_CODE;

		public String getGVW_CODE() {
			return this.GVW_CODE;
		}

		public String GVW_DESC;

		public String getGVW_DESC() {
			return this.GVW_DESC;
		}

		public String TYPE1_DESC;

		public String getTYPE1_DESC() {
			return this.TYPE1_DESC;
		}

		public String TYPE3_DESC;

		public String getTYPE3_DESC() {
			return this.TYPE3_DESC;
		}

		public String TYPE5_DESC;

		public String getTYPE5_DESC() {
			return this.TYPE5_DESC;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.SEGMENT_DESC = readString(dis);

					this.VEHICLE_TYPE_DESC = readString(dis);

					this.MAKE_MODEL_CODE = readString(dis);

					this.MAKE_DESC = readString(dis);

					this.MODEL_DESC = readString(dis);

					this.SERIES_TEXT = readString(dis);

					this.SUB_SERIES_TEXT = readString(dis);

					this.CORP_DESC = readString(dis);

					this.CORP2 = readString(dis);

					this.ORIGIN = readString(dis);

					this.POLK_BODY_STYLE_DESC = readString(dis);

					this.NUMBER_OF_DOORS_DESC = readString(dis);

					this.DRIVE_TYPE_DESC = readString(dis);

					this.ORIGIN_DESC = readString(dis);

					this.FUEL_DESC = readString(dis);

					this.NUMBER_OF_CYLS_DESC = readString(dis);

					this.CAB_SIZE_DESC = readString(dis);

					this.BED_SIZE_DESC = readString(dis);

					this.GVW_CODE = readString(dis);

					this.GVW_DESC = readString(dis);

					this.TYPE1_DESC = readString(dis);

					this.TYPE3_DESC = readString(dis);

					this.TYPE5_DESC = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.SEGMENT_DESC, dos);

				// String

				writeString(this.VEHICLE_TYPE_DESC, dos);

				// String

				writeString(this.MAKE_MODEL_CODE, dos);

				// String

				writeString(this.MAKE_DESC, dos);

				// String

				writeString(this.MODEL_DESC, dos);

				// String

				writeString(this.SERIES_TEXT, dos);

				// String

				writeString(this.SUB_SERIES_TEXT, dos);

				// String

				writeString(this.CORP_DESC, dos);

				// String

				writeString(this.CORP2, dos);

				// String

				writeString(this.ORIGIN, dos);

				// String

				writeString(this.POLK_BODY_STYLE_DESC, dos);

				// String

				writeString(this.NUMBER_OF_DOORS_DESC, dos);

				// String

				writeString(this.DRIVE_TYPE_DESC, dos);

				// String

				writeString(this.ORIGIN_DESC, dos);

				// String

				writeString(this.FUEL_DESC, dos);

				// String

				writeString(this.NUMBER_OF_CYLS_DESC, dos);

				// String

				writeString(this.CAB_SIZE_DESC, dos);

				// String

				writeString(this.BED_SIZE_DESC, dos);

				// String

				writeString(this.GVW_CODE, dos);

				// String

				writeString(this.GVW_DESC, dos);

				// String

				writeString(this.TYPE1_DESC, dos);

				// String

				writeString(this.TYPE3_DESC, dos);

				// String

				writeString(this.TYPE5_DESC, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("SEGMENT_DESC=" + SEGMENT_DESC);
			sb.append(",VEHICLE_TYPE_DESC=" + VEHICLE_TYPE_DESC);
			sb.append(",MAKE_MODEL_CODE=" + MAKE_MODEL_CODE);
			sb.append(",MAKE_DESC=" + MAKE_DESC);
			sb.append(",MODEL_DESC=" + MODEL_DESC);
			sb.append(",SERIES_TEXT=" + SERIES_TEXT);
			sb.append(",SUB_SERIES_TEXT=" + SUB_SERIES_TEXT);
			sb.append(",CORP_DESC=" + CORP_DESC);
			sb.append(",CORP2=" + CORP2);
			sb.append(",ORIGIN=" + ORIGIN);
			sb.append(",POLK_BODY_STYLE_DESC=" + POLK_BODY_STYLE_DESC);
			sb.append(",NUMBER_OF_DOORS_DESC=" + NUMBER_OF_DOORS_DESC);
			sb.append(",DRIVE_TYPE_DESC=" + DRIVE_TYPE_DESC);
			sb.append(",ORIGIN_DESC=" + ORIGIN_DESC);
			sb.append(",FUEL_DESC=" + FUEL_DESC);
			sb.append(",NUMBER_OF_CYLS_DESC=" + NUMBER_OF_CYLS_DESC);
			sb.append(",CAB_SIZE_DESC=" + CAB_SIZE_DESC);
			sb.append(",BED_SIZE_DESC=" + BED_SIZE_DESC);
			sb.append(",GVW_CODE=" + GVW_CODE);
			sb.append(",GVW_DESC=" + GVW_DESC);
			sb.append(",TYPE1_DESC=" + TYPE1_DESC);
			sb.append(",TYPE3_DESC=" + TYPE3_DESC);
			sb.append(",TYPE5_DESC=" + TYPE5_DESC);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (SEGMENT_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(SEGMENT_DESC);
			}

			sb.append("|");

			if (VEHICLE_TYPE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_TYPE_DESC);
			}

			sb.append("|");

			if (MAKE_MODEL_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(MAKE_MODEL_CODE);
			}

			sb.append("|");

			if (MAKE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(MAKE_DESC);
			}

			sb.append("|");

			if (MODEL_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(MODEL_DESC);
			}

			sb.append("|");

			if (SERIES_TEXT == null) {
				sb.append("<null>");
			} else {
				sb.append(SERIES_TEXT);
			}

			sb.append("|");

			if (SUB_SERIES_TEXT == null) {
				sb.append("<null>");
			} else {
				sb.append(SUB_SERIES_TEXT);
			}

			sb.append("|");

			if (CORP_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(CORP_DESC);
			}

			sb.append("|");

			if (CORP2 == null) {
				sb.append("<null>");
			} else {
				sb.append(CORP2);
			}

			sb.append("|");

			if (ORIGIN == null) {
				sb.append("<null>");
			} else {
				sb.append(ORIGIN);
			}

			sb.append("|");

			if (POLK_BODY_STYLE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(POLK_BODY_STYLE_DESC);
			}

			sb.append("|");

			if (NUMBER_OF_DOORS_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(NUMBER_OF_DOORS_DESC);
			}

			sb.append("|");

			if (DRIVE_TYPE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(DRIVE_TYPE_DESC);
			}

			sb.append("|");

			if (ORIGIN_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(ORIGIN_DESC);
			}

			sb.append("|");

			if (FUEL_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(FUEL_DESC);
			}

			sb.append("|");

			if (NUMBER_OF_CYLS_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(NUMBER_OF_CYLS_DESC);
			}

			sb.append("|");

			if (CAB_SIZE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(CAB_SIZE_DESC);
			}

			sb.append("|");

			if (BED_SIZE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(BED_SIZE_DESC);
			}

			sb.append("|");

			if (GVW_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(GVW_CODE);
			}

			sb.append("|");

			if (GVW_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(GVW_DESC);
			}

			sb.append("|");

			if (TYPE1_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(TYPE1_DESC);
			}

			sb.append("|");

			if (TYPE3_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(TYPE3_DESC);
			}

			sb.append("|");

			if (TYPE5_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(TYPE5_DESC);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row18Struct other) {

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

	public void tOracleInput_16Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_16_SUBPROCESS_STATE", 0);

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

				row18Struct row18 = new row18Struct();

				/**
				 * [tFileOutputDelimited_15 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_15", false);
				start_Hash.put("tFileOutputDelimited_15",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_15";

				int tos_count_tFileOutputDelimited_15 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_15 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_15 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_15.append("Parameters:");
				log4jParamters_tFileOutputDelimited_15.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_CUSTOM_MAKE_MODEL_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				log4jParamters_tFileOutputDelimited_15
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_15.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_15 - "
							+ log4jParamters_tFileOutputDelimited_15);

				String fileName_tFileOutputDelimited_15 = "";
				fileName_tFileOutputDelimited_15 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_CUSTOM_MAKE_MODEL_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_15 = null;
				String extension_tFileOutputDelimited_15 = null;
				String directory_tFileOutputDelimited_15 = null;
				if ((fileName_tFileOutputDelimited_15.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_15.lastIndexOf(".") < fileName_tFileOutputDelimited_15
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15;
						extension_tFileOutputDelimited_15 = "";
					} else {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15
								.substring(0, fileName_tFileOutputDelimited_15
										.lastIndexOf("."));
						extension_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15
								.substring(fileName_tFileOutputDelimited_15
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15
							.substring(0, fileName_tFileOutputDelimited_15
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_15.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15
								.substring(0, fileName_tFileOutputDelimited_15
										.lastIndexOf("."));
						extension_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15
								.substring(fileName_tFileOutputDelimited_15
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15;
						extension_tFileOutputDelimited_15 = "";
					}
					directory_tFileOutputDelimited_15 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_15 = true;
				java.io.File filetFileOutputDelimited_15 = new java.io.File(
						fileName_tFileOutputDelimited_15);
				globalMap.put("tFileOutputDelimited_15_FILE_NAME",
						fileName_tFileOutputDelimited_15);
				int nb_line_tFileOutputDelimited_15 = 0;
				int splitEvery_tFileOutputDelimited_15 = 1000;
				int splitedFileNo_tFileOutputDelimited_15 = 0;
				int currentRow_tFileOutputDelimited_15 = 0;

				final String OUT_DELIM_tFileOutputDelimited_15 = /**
				 * Start field
				 * tFileOutputDelimited_15:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_15:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_15 = /**
				 * Start
				 * field tFileOutputDelimited_15:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_15:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_15 != null
						&& directory_tFileOutputDelimited_15.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_15 = new java.io.File(
							directory_tFileOutputDelimited_15);
					if (!dir_tFileOutputDelimited_15.exists()) {
						log.info("tFileOutputDelimited_15 - Creating directory '"
								+ dir_tFileOutputDelimited_15
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_15.mkdirs();
						log.info("tFileOutputDelimited_15 - The directory '"
								+ dir_tFileOutputDelimited_15
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_15 = null;

				java.io.File fileToDelete_tFileOutputDelimited_15 = new java.io.File(
						fileName_tFileOutputDelimited_15);
				if (fileToDelete_tFileOutputDelimited_15.exists()) {
					fileToDelete_tFileOutputDelimited_15.delete();
				}
				outtFileOutputDelimited_15 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_15, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_15.length() == 0) {
						outtFileOutputDelimited_15.write("SEGMENT_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("VEHICLE_TYPE_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("MAKE_MODEL_CODE");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("MAKE_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("MODEL_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("SERIES_TEXT");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("SUB_SERIES_TEXT");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CORP_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CORP2");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("ORIGIN");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15
								.write("POLK_BODY_STYLE_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15
								.write("NUMBER_OF_DOORS_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("DRIVE_TYPE_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("ORIGIN_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("FUEL_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("NUMBER_OF_CYLS_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CAB_SIZE_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("BED_SIZE_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("GVW_CODE");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("GVW_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TYPE1_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TYPE3_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TYPE5_DESC");
						outtFileOutputDelimited_15
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_15",
						outtFileOutputDelimited_15);
				resourceMap.put("nb_line_tFileOutputDelimited_15",
						nb_line_tFileOutputDelimited_15);

				/**
				 * [tFileOutputDelimited_15 begin ] stop
				 */

				/**
				 * [tOracleInput_16 begin ] start
				 */

				ok_Hash.put("tOracleInput_16", false);
				start_Hash.put("tOracleInput_16", System.currentTimeMillis());

				currentComponent = "tOracleInput_16";

				int tos_count_tOracleInput_16 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_16 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_16 = new StringBuilder();
				log4jParamters_tOracleInput_16.append("Parameters:");
				log4jParamters_tOracleInput_16.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16
						.append("QUERY"
								+ " = "
								+ "\"  SELECT SEGMENT_DESC,         	   VEHICLE_TYPE_DESC,         MAKE_MODEL_CODE, --REFERENCES FACT TABLES         MAKE_DESC,         MODEL_DESC,         SERIES_TEXT,          SUB_SERIES_TEXT,         CORP_DESC,          CORP2,          ORIGIN,         	   POLK_BODY_STYLE_DESC,                NUMBER_OF_DOORS_DESC,                 DRIVE_TYPE_DESC,                ORIGIN_DESC,                FUEL_DESC,                NUMBER_OF_CYLS_DESC,               CAB_SIZE_DESC,                 BED_SIZE_DESC,         GVW_CODE,          GVW_DESC,         TYPE1_DESC,          TYPE3_DESC,          TYPE5_DESC       FROM CUSTOM_MAKE_MODEL_FOR  \"    ");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SEGMENT_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEHICLE_TYPE_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MAKE_MODEL_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("MAKE_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("MODEL_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SERIES_TEXT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SUB_SERIES_TEXT")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("CORP_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CORP2") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("ORIGIN")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("POLK_BODY_STYLE_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("NUMBER_OF_DOORS_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("DRIVE_TYPE_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ORIGIN_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("FUEL_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("NUMBER_OF_CYLS_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CAB_SIZE_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("BED_SIZE_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("GVW_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("GVW_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("TYPE1_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("TYPE3_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TYPE5_DESC") + "}]");
				log4jParamters_tOracleInput_16.append(" | ");
				log4jParamters_tOracleInput_16.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_16.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_16 - "
							+ log4jParamters_tOracleInput_16);

				int nb_line_tOracleInput_16 = 0;
				java.sql.Connection conn_tOracleInput_16 = null;
				String driverClass_tOracleInput_16 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_16);

				String url_tOracleInput_16 = null;
				url_tOracleInput_16 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_16 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_16 = context.dbPasswordPI;

				String dbPwd_tOracleInput_16 = decryptedPassword_tOracleInput_16;

				log.debug("tOracleInput_16 - Driver ClassName: "
						+ driverClass_tOracleInput_16 + ".");

				log.info("tOracleInput_16 - Connection attempt to '"
						+ url_tOracleInput_16 + "' with the username '"
						+ dbUser_tOracleInput_16 + "'.");

				conn_tOracleInput_16 = java.sql.DriverManager.getConnection(
						url_tOracleInput_16, dbUser_tOracleInput_16,
						dbPwd_tOracleInput_16);
				log.info("tOracleInput_16 - Connection to '"
						+ url_tOracleInput_16 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_16 = conn_tOracleInput_16
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_16 = stmtGetTZ_tOracleInput_16
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_16 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_16.next()) {
					sessionTimezone_tOracleInput_16 = rsGetTZ_tOracleInput_16
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_16)
						.setSessionTimeZone(sessionTimezone_tOracleInput_16);

				java.sql.Statement stmt_tOracleInput_16 = conn_tOracleInput_16
						.createStatement();

				String dbquery_tOracleInput_16 = "\nSELECT SEGMENT_DESC,       \n	   VEHICLE_TYPE_DESC,\n       MAKE_MODEL_CODE, --REFERENCES FACT TABLES\n       MAKE_DESC,\n       MODEL_DESC,\n       SERIES_TEXT, \n       SUB_SERIES_TEXT,\n       CORP_DESC, \n       CORP2, \n       ORIGIN,       \n	   POLK_BODY_STYLE_DESC,       \n       NUMBER_OF_DOORS_DESC,        \n       DRIVE_TYPE_DESC,       \n       ORIGIN_DESC,       \n       FUEL_DESC,       \n       NUMBER_OF_CYLS_DESC,      \n       CAB_SIZE_DESC,        \n       BED_SIZE_DESC,\n       GVW_CODE, \n       GVW_DESC,\n       TYPE1_DESC, \n       TYPE3_DESC, \n       TYPE5_DESC     \nFROM CUSTOM_MAKE_MODEL_FOR\n"

				;

				log.info("tOracleInput_16 - Executing the query: '"
						+ dbquery_tOracleInput_16 + "'.");

				globalMap.put("tOracleInput_16_QUERY", dbquery_tOracleInput_16);

				java.sql.ResultSet rs_tOracleInput_16 = null;
				try {
					rs_tOracleInput_16 = stmt_tOracleInput_16
							.executeQuery(dbquery_tOracleInput_16);
					java.sql.ResultSetMetaData rsmd_tOracleInput_16 = rs_tOracleInput_16
							.getMetaData();
					int colQtyInRs_tOracleInput_16 = rsmd_tOracleInput_16
							.getColumnCount();

					String tmpContent_tOracleInput_16 = null;

					log.info("tOracleInput_16 - Retrieving records from the database.");

					while (rs_tOracleInput_16.next()) {
						nb_line_tOracleInput_16++;

						if (colQtyInRs_tOracleInput_16 < 1) {
							row18.SEGMENT_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(1);
							if (tmpContent_tOracleInput_16 != null) {
								row18.SEGMENT_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.SEGMENT_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 2) {
							row18.VEHICLE_TYPE_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(2);
							if (tmpContent_tOracleInput_16 != null) {
								row18.VEHICLE_TYPE_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.VEHICLE_TYPE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 3) {
							row18.MAKE_MODEL_CODE = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(3);
							if (tmpContent_tOracleInput_16 != null) {
								row18.MAKE_MODEL_CODE = tmpContent_tOracleInput_16;
							} else {
								row18.MAKE_MODEL_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 4) {
							row18.MAKE_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(4);
							if (tmpContent_tOracleInput_16 != null) {
								row18.MAKE_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.MAKE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 5) {
							row18.MODEL_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(5);
							if (tmpContent_tOracleInput_16 != null) {
								row18.MODEL_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.MODEL_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 6) {
							row18.SERIES_TEXT = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(6);
							if (tmpContent_tOracleInput_16 != null) {
								row18.SERIES_TEXT = tmpContent_tOracleInput_16;
							} else {
								row18.SERIES_TEXT = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 7) {
							row18.SUB_SERIES_TEXT = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(7);
							if (tmpContent_tOracleInput_16 != null) {
								row18.SUB_SERIES_TEXT = tmpContent_tOracleInput_16;
							} else {
								row18.SUB_SERIES_TEXT = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 8) {
							row18.CORP_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(8);
							if (tmpContent_tOracleInput_16 != null) {
								row18.CORP_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.CORP_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 9) {
							row18.CORP2 = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(9);
							if (tmpContent_tOracleInput_16 != null) {
								row18.CORP2 = tmpContent_tOracleInput_16;
							} else {
								row18.CORP2 = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 10) {
							row18.ORIGIN = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(10);
							if (tmpContent_tOracleInput_16 != null) {
								row18.ORIGIN = tmpContent_tOracleInput_16;
							} else {
								row18.ORIGIN = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 11) {
							row18.POLK_BODY_STYLE_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(11);
							if (tmpContent_tOracleInput_16 != null) {
								row18.POLK_BODY_STYLE_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.POLK_BODY_STYLE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 12) {
							row18.NUMBER_OF_DOORS_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(12);
							if (tmpContent_tOracleInput_16 != null) {
								row18.NUMBER_OF_DOORS_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.NUMBER_OF_DOORS_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 13) {
							row18.DRIVE_TYPE_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(13);
							if (tmpContent_tOracleInput_16 != null) {
								row18.DRIVE_TYPE_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.DRIVE_TYPE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 14) {
							row18.ORIGIN_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(14);
							if (tmpContent_tOracleInput_16 != null) {
								row18.ORIGIN_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.ORIGIN_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 15) {
							row18.FUEL_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(15);
							if (tmpContent_tOracleInput_16 != null) {
								row18.FUEL_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.FUEL_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 16) {
							row18.NUMBER_OF_CYLS_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(16);
							if (tmpContent_tOracleInput_16 != null) {
								row18.NUMBER_OF_CYLS_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.NUMBER_OF_CYLS_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 17) {
							row18.CAB_SIZE_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(17);
							if (tmpContent_tOracleInput_16 != null) {
								row18.CAB_SIZE_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.CAB_SIZE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 18) {
							row18.BED_SIZE_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(18);
							if (tmpContent_tOracleInput_16 != null) {
								row18.BED_SIZE_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.BED_SIZE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 19) {
							row18.GVW_CODE = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(19);
							if (tmpContent_tOracleInput_16 != null) {
								row18.GVW_CODE = tmpContent_tOracleInput_16;
							} else {
								row18.GVW_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 20) {
							row18.GVW_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(20);
							if (tmpContent_tOracleInput_16 != null) {
								row18.GVW_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.GVW_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 21) {
							row18.TYPE1_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(21);
							if (tmpContent_tOracleInput_16 != null) {
								row18.TYPE1_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.TYPE1_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 22) {
							row18.TYPE3_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(22);
							if (tmpContent_tOracleInput_16 != null) {
								row18.TYPE3_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.TYPE3_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_16 < 23) {
							row18.TYPE5_DESC = null;
						} else {

							tmpContent_tOracleInput_16 = rs_tOracleInput_16
									.getString(23);
							if (tmpContent_tOracleInput_16 != null) {
								row18.TYPE5_DESC = tmpContent_tOracleInput_16;
							} else {
								row18.TYPE5_DESC = null;
							}
						}

						log.debug("tOracleInput_16 - Retrieving the record "
								+ nb_line_tOracleInput_16 + ".");

						/**
						 * [tOracleInput_16 begin ] stop
						 */

						/**
						 * [tOracleInput_16 main ] start
						 */

						currentComponent = "tOracleInput_16";

						tos_count_tOracleInput_16++;

						/**
						 * [tOracleInput_16 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_15 main ] start
						 */

						currentComponent = "tFileOutputDelimited_15";

						if (log.isTraceEnabled()) {
							log.trace("row18 - "
									+ (row18 == null ? "" : row18.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_15 = new StringBuilder();
						if (row18.SEGMENT_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.SEGMENT_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.VEHICLE_TYPE_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.VEHICLE_TYPE_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.MAKE_MODEL_CODE != null) {
							sb_tFileOutputDelimited_15
									.append(row18.MAKE_MODEL_CODE);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.MAKE_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.MAKE_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.MODEL_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.MODEL_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.SERIES_TEXT != null) {
							sb_tFileOutputDelimited_15
									.append(row18.SERIES_TEXT);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.SUB_SERIES_TEXT != null) {
							sb_tFileOutputDelimited_15
									.append(row18.SUB_SERIES_TEXT);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.CORP_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.CORP_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.CORP2 != null) {
							sb_tFileOutputDelimited_15.append(row18.CORP2);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.ORIGIN != null) {
							sb_tFileOutputDelimited_15.append(row18.ORIGIN);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.POLK_BODY_STYLE_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.POLK_BODY_STYLE_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.NUMBER_OF_DOORS_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.NUMBER_OF_DOORS_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.DRIVE_TYPE_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.DRIVE_TYPE_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.ORIGIN_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.ORIGIN_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.FUEL_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.FUEL_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.NUMBER_OF_CYLS_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.NUMBER_OF_CYLS_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.CAB_SIZE_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.CAB_SIZE_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.BED_SIZE_DESC != null) {
							sb_tFileOutputDelimited_15
									.append(row18.BED_SIZE_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.GVW_CODE != null) {
							sb_tFileOutputDelimited_15.append(row18.GVW_CODE);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.GVW_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.GVW_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.TYPE1_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.TYPE1_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.TYPE3_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.TYPE3_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row18.TYPE5_DESC != null) {
							sb_tFileOutputDelimited_15.append(row18.TYPE5_DESC);
						}
						sb_tFileOutputDelimited_15
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_15);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_15++;
							resourceMap.put("nb_line_tFileOutputDelimited_15",
									nb_line_tFileOutputDelimited_15);

							outtFileOutputDelimited_15
									.write(sb_tFileOutputDelimited_15
											.toString());
							log.debug("tFileOutputDelimited_15 - Writing the record "
									+ nb_line_tFileOutputDelimited_15 + ".");

						}

						tos_count_tFileOutputDelimited_15++;

						/**
						 * [tFileOutputDelimited_15 main ] stop
						 */

						/**
						 * [tOracleInput_16 end ] start
						 */

						currentComponent = "tOracleInput_16";

					}
				} finally {
					stmt_tOracleInput_16.close();

					if (conn_tOracleInput_16 != null
							&& !conn_tOracleInput_16.isClosed()) {

						log.info("tOracleInput_16 - Closing the connection to the database.");

						conn_tOracleInput_16.close();

						log.info("tOracleInput_16 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_16_NB_LINE",
						nb_line_tOracleInput_16);
				log.info("tOracleInput_16 - Retrieved records count: "
						+ nb_line_tOracleInput_16 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_16 - " + "Done.");

				ok_Hash.put("tOracleInput_16", true);
				end_Hash.put("tOracleInput_16", System.currentTimeMillis());

				/**
				 * [tOracleInput_16 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_15 end ] start
				 */

				currentComponent = "tFileOutputDelimited_15";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_15 != null) {
						outtFileOutputDelimited_15.flush();
						outtFileOutputDelimited_15.close();
					}

					globalMap.put("tFileOutputDelimited_15_NB_LINE",
							nb_line_tFileOutputDelimited_15);
					globalMap.put("tFileOutputDelimited_15_FILE_NAME",
							fileName_tFileOutputDelimited_15);

				}

				resourceMap.put("finish_tFileOutputDelimited_15", true);

				log.info("tFileOutputDelimited_15 - Written records count: "
						+ nb_line_tFileOutputDelimited_15 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_15 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_15", true);
				end_Hash.put("tFileOutputDelimited_15",
						System.currentTimeMillis());

				tOracleInput_18Process(globalMap);

				/**
				 * [tFileOutputDelimited_15 end ] stop
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
				 * [tOracleInput_16 finally ] start
				 */

				currentComponent = "tOracleInput_16";

				/**
				 * [tOracleInput_16 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_15 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_15";

				if (resourceMap.get("finish_tFileOutputDelimited_15") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_15 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_15");
						if (outtFileOutputDelimited_15 != null) {
							outtFileOutputDelimited_15.flush();
							outtFileOutputDelimited_15.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_15 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_16_SUBPROCESS_STATE", 1);
	}

	public static class row20Struct implements
			routines.system.IPersistableRow<row20Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String GENDER_CODE;

		public String getGENDER_CODE() {
			return this.GENDER_CODE;
		}

		public String GENDER_DESC;

		public String getGENDER_DESC() {
			return this.GENDER_DESC;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.GENDER_CODE = readString(dis);

					this.GENDER_DESC = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.GENDER_CODE, dos);

				// String

				writeString(this.GENDER_DESC, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("GENDER_CODE=" + GENDER_CODE);
			sb.append(",GENDER_DESC=" + GENDER_DESC);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (GENDER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(GENDER_CODE);
			}

			sb.append("|");

			if (GENDER_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(GENDER_DESC);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row20Struct other) {

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

	public void tOracleInput_18Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_18_SUBPROCESS_STATE", 0);

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

				row20Struct row20 = new row20Struct();

				/**
				 * [tFileOutputDelimited_17 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_17", false);
				start_Hash.put("tFileOutputDelimited_17",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_17";

				int tos_count_tFileOutputDelimited_17 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_17 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_17 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_17.append("Parameters:");
				log4jParamters_tFileOutputDelimited_17.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_DESC_GENDER_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				log4jParamters_tFileOutputDelimited_17
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_17.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_17 - "
							+ log4jParamters_tFileOutputDelimited_17);

				String fileName_tFileOutputDelimited_17 = "";
				fileName_tFileOutputDelimited_17 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth + "/FORD_DESC_GENDER_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_17 = null;
				String extension_tFileOutputDelimited_17 = null;
				String directory_tFileOutputDelimited_17 = null;
				if ((fileName_tFileOutputDelimited_17.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_17.lastIndexOf(".") < fileName_tFileOutputDelimited_17
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_17 = fileName_tFileOutputDelimited_17;
						extension_tFileOutputDelimited_17 = "";
					} else {
						fullName_tFileOutputDelimited_17 = fileName_tFileOutputDelimited_17
								.substring(0, fileName_tFileOutputDelimited_17
										.lastIndexOf("."));
						extension_tFileOutputDelimited_17 = fileName_tFileOutputDelimited_17
								.substring(fileName_tFileOutputDelimited_17
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_17 = fileName_tFileOutputDelimited_17
							.substring(0, fileName_tFileOutputDelimited_17
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_17.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_17 = fileName_tFileOutputDelimited_17
								.substring(0, fileName_tFileOutputDelimited_17
										.lastIndexOf("."));
						extension_tFileOutputDelimited_17 = fileName_tFileOutputDelimited_17
								.substring(fileName_tFileOutputDelimited_17
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_17 = fileName_tFileOutputDelimited_17;
						extension_tFileOutputDelimited_17 = "";
					}
					directory_tFileOutputDelimited_17 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_17 = true;
				java.io.File filetFileOutputDelimited_17 = new java.io.File(
						fileName_tFileOutputDelimited_17);
				globalMap.put("tFileOutputDelimited_17_FILE_NAME",
						fileName_tFileOutputDelimited_17);
				int nb_line_tFileOutputDelimited_17 = 0;
				int splitEvery_tFileOutputDelimited_17 = 1000;
				int splitedFileNo_tFileOutputDelimited_17 = 0;
				int currentRow_tFileOutputDelimited_17 = 0;

				final String OUT_DELIM_tFileOutputDelimited_17 = /**
				 * Start field
				 * tFileOutputDelimited_17:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_17:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_17 = /**
				 * Start
				 * field tFileOutputDelimited_17:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_17:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_17 != null
						&& directory_tFileOutputDelimited_17.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_17 = new java.io.File(
							directory_tFileOutputDelimited_17);
					if (!dir_tFileOutputDelimited_17.exists()) {
						log.info("tFileOutputDelimited_17 - Creating directory '"
								+ dir_tFileOutputDelimited_17
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_17.mkdirs();
						log.info("tFileOutputDelimited_17 - The directory '"
								+ dir_tFileOutputDelimited_17
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_17 = null;

				java.io.File fileToDelete_tFileOutputDelimited_17 = new java.io.File(
						fileName_tFileOutputDelimited_17);
				if (fileToDelete_tFileOutputDelimited_17.exists()) {
					fileToDelete_tFileOutputDelimited_17.delete();
				}
				outtFileOutputDelimited_17 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_17, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_17.length() == 0) {
						outtFileOutputDelimited_17.write("GENDER_CODE");
						outtFileOutputDelimited_17
								.write(OUT_DELIM_tFileOutputDelimited_17);
						outtFileOutputDelimited_17.write("GENDER_DESC");
						outtFileOutputDelimited_17
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_17);
						outtFileOutputDelimited_17.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_17",
						outtFileOutputDelimited_17);
				resourceMap.put("nb_line_tFileOutputDelimited_17",
						nb_line_tFileOutputDelimited_17);

				/**
				 * [tFileOutputDelimited_17 begin ] stop
				 */

				/**
				 * [tOracleInput_18 begin ] start
				 */

				ok_Hash.put("tOracleInput_18", false);
				start_Hash.put("tOracleInput_18", System.currentTimeMillis());

				currentComponent = "tOracleInput_18";

				int tos_count_tOracleInput_18 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_18 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_18 = new StringBuilder();
				log4jParamters_tOracleInput_18.append("Parameters:");
				log4jParamters_tOracleInput_18.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18
						.append("QUERY"
								+ " = "
								+ "\"  SELECT GENDER_CODE, --REFERENCES FACT TABLES         GENDER_DESC   FROM RNC_DESC_GENDER  ORDER BY 1  \"    ");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("GENDER_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("GENDER_DESC") + "}]");
				log4jParamters_tOracleInput_18.append(" | ");
				log4jParamters_tOracleInput_18.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_18.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_18 - "
							+ log4jParamters_tOracleInput_18);

				int nb_line_tOracleInput_18 = 0;
				java.sql.Connection conn_tOracleInput_18 = null;
				String driverClass_tOracleInput_18 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_18);

				String url_tOracleInput_18 = null;
				url_tOracleInput_18 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_18 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_18 = context.dbPasswordPI;

				String dbPwd_tOracleInput_18 = decryptedPassword_tOracleInput_18;

				log.debug("tOracleInput_18 - Driver ClassName: "
						+ driverClass_tOracleInput_18 + ".");

				log.info("tOracleInput_18 - Connection attempt to '"
						+ url_tOracleInput_18 + "' with the username '"
						+ dbUser_tOracleInput_18 + "'.");

				conn_tOracleInput_18 = java.sql.DriverManager.getConnection(
						url_tOracleInput_18, dbUser_tOracleInput_18,
						dbPwd_tOracleInput_18);
				log.info("tOracleInput_18 - Connection to '"
						+ url_tOracleInput_18 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_18 = conn_tOracleInput_18
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_18 = stmtGetTZ_tOracleInput_18
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_18 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_18.next()) {
					sessionTimezone_tOracleInput_18 = rsGetTZ_tOracleInput_18
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_18)
						.setSessionTimeZone(sessionTimezone_tOracleInput_18);

				java.sql.Statement stmt_tOracleInput_18 = conn_tOracleInput_18
						.createStatement();

				String dbquery_tOracleInput_18 = "\nSELECT GENDER_CODE, --REFERENCES FACT TABLES\n       GENDER_DESC \nFROM RNC_DESC_GENDER\nORDER BY 1\n"

				;

				log.info("tOracleInput_18 - Executing the query: '"
						+ dbquery_tOracleInput_18 + "'.");

				globalMap.put("tOracleInput_18_QUERY", dbquery_tOracleInput_18);

				java.sql.ResultSet rs_tOracleInput_18 = null;
				try {
					rs_tOracleInput_18 = stmt_tOracleInput_18
							.executeQuery(dbquery_tOracleInput_18);
					java.sql.ResultSetMetaData rsmd_tOracleInput_18 = rs_tOracleInput_18
							.getMetaData();
					int colQtyInRs_tOracleInput_18 = rsmd_tOracleInput_18
							.getColumnCount();

					String tmpContent_tOracleInput_18 = null;

					log.info("tOracleInput_18 - Retrieving records from the database.");

					while (rs_tOracleInput_18.next()) {
						nb_line_tOracleInput_18++;

						if (colQtyInRs_tOracleInput_18 < 1) {
							row20.GENDER_CODE = null;
						} else {

							tmpContent_tOracleInput_18 = rs_tOracleInput_18
									.getString(1);
							if (tmpContent_tOracleInput_18 != null) {
								row20.GENDER_CODE = tmpContent_tOracleInput_18;
							} else {
								row20.GENDER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_18 < 2) {
							row20.GENDER_DESC = null;
						} else {

							tmpContent_tOracleInput_18 = rs_tOracleInput_18
									.getString(2);
							if (tmpContent_tOracleInput_18 != null) {
								row20.GENDER_DESC = tmpContent_tOracleInput_18;
							} else {
								row20.GENDER_DESC = null;
							}
						}

						log.debug("tOracleInput_18 - Retrieving the record "
								+ nb_line_tOracleInput_18 + ".");

						/**
						 * [tOracleInput_18 begin ] stop
						 */

						/**
						 * [tOracleInput_18 main ] start
						 */

						currentComponent = "tOracleInput_18";

						tos_count_tOracleInput_18++;

						/**
						 * [tOracleInput_18 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_17 main ] start
						 */

						currentComponent = "tFileOutputDelimited_17";

						if (log.isTraceEnabled()) {
							log.trace("row20 - "
									+ (row20 == null ? "" : row20.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_17 = new StringBuilder();
						if (row20.GENDER_CODE != null) {
							sb_tFileOutputDelimited_17
									.append(row20.GENDER_CODE);
						}
						sb_tFileOutputDelimited_17
								.append(OUT_DELIM_tFileOutputDelimited_17);
						if (row20.GENDER_DESC != null) {
							sb_tFileOutputDelimited_17
									.append(row20.GENDER_DESC);
						}
						sb_tFileOutputDelimited_17
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_17);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_17++;
							resourceMap.put("nb_line_tFileOutputDelimited_17",
									nb_line_tFileOutputDelimited_17);

							outtFileOutputDelimited_17
									.write(sb_tFileOutputDelimited_17
											.toString());
							log.debug("tFileOutputDelimited_17 - Writing the record "
									+ nb_line_tFileOutputDelimited_17 + ".");

						}

						tos_count_tFileOutputDelimited_17++;

						/**
						 * [tFileOutputDelimited_17 main ] stop
						 */

						/**
						 * [tOracleInput_18 end ] start
						 */

						currentComponent = "tOracleInput_18";

					}
				} finally {
					stmt_tOracleInput_18.close();

					if (conn_tOracleInput_18 != null
							&& !conn_tOracleInput_18.isClosed()) {

						log.info("tOracleInput_18 - Closing the connection to the database.");

						conn_tOracleInput_18.close();

						log.info("tOracleInput_18 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_18_NB_LINE",
						nb_line_tOracleInput_18);
				log.info("tOracleInput_18 - Retrieved records count: "
						+ nb_line_tOracleInput_18 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_18 - " + "Done.");

				ok_Hash.put("tOracleInput_18", true);
				end_Hash.put("tOracleInput_18", System.currentTimeMillis());

				/**
				 * [tOracleInput_18 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_17 end ] start
				 */

				currentComponent = "tFileOutputDelimited_17";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_17 != null) {
						outtFileOutputDelimited_17.flush();
						outtFileOutputDelimited_17.close();
					}

					globalMap.put("tFileOutputDelimited_17_NB_LINE",
							nb_line_tFileOutputDelimited_17);
					globalMap.put("tFileOutputDelimited_17_FILE_NAME",
							fileName_tFileOutputDelimited_17);

				}

				resourceMap.put("finish_tFileOutputDelimited_17", true);

				log.info("tFileOutputDelimited_17 - Written records count: "
						+ nb_line_tFileOutputDelimited_17 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_17 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_17", true);
				end_Hash.put("tFileOutputDelimited_17",
						System.currentTimeMillis());

				tOracleInput_20Process(globalMap);

				/**
				 * [tFileOutputDelimited_17 end ] stop
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
				 * [tOracleInput_18 finally ] start
				 */

				currentComponent = "tOracleInput_18";

				/**
				 * [tOracleInput_18 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_17 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_17";

				if (resourceMap.get("finish_tFileOutputDelimited_17") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_17 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_17");
						if (outtFileOutputDelimited_17 != null) {
							outtFileOutputDelimited_17.flush();
							outtFileOutputDelimited_17.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_17 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_18_SUBPROCESS_STATE", 1);
	}

	public static class row22Struct implements
			routines.system.IPersistableRow<row22Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String AGE_CODE;

		public String getAGE_CODE() {
			return this.AGE_CODE;
		}

		public String AGE_DESC;

		public String getAGE_DESC() {
			return this.AGE_DESC;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.AGE_CODE = readString(dis);

					this.AGE_DESC = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.AGE_CODE, dos);

				// String

				writeString(this.AGE_DESC, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("AGE_CODE=" + AGE_CODE);
			sb.append(",AGE_DESC=" + AGE_DESC);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (AGE_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(AGE_CODE);
			}

			sb.append("|");

			if (AGE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(AGE_DESC);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row22Struct other) {

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

	public void tOracleInput_20Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_20_SUBPROCESS_STATE", 0);

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

				row22Struct row22 = new row22Struct();

				/**
				 * [tFileOutputDelimited_19 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_19", false);
				start_Hash.put("tFileOutputDelimited_19",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_19";

				int tos_count_tFileOutputDelimited_19 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_19 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_19 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_19.append("Parameters:");
				log4jParamters_tFileOutputDelimited_19.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_DESC_HH_AGE_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				log4jParamters_tFileOutputDelimited_19
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_19.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_19 - "
							+ log4jParamters_tFileOutputDelimited_19);

				String fileName_tFileOutputDelimited_19 = "";
				fileName_tFileOutputDelimited_19 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth + "/FORD_DESC_HH_AGE_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_19 = null;
				String extension_tFileOutputDelimited_19 = null;
				String directory_tFileOutputDelimited_19 = null;
				if ((fileName_tFileOutputDelimited_19.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_19.lastIndexOf(".") < fileName_tFileOutputDelimited_19
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_19 = fileName_tFileOutputDelimited_19;
						extension_tFileOutputDelimited_19 = "";
					} else {
						fullName_tFileOutputDelimited_19 = fileName_tFileOutputDelimited_19
								.substring(0, fileName_tFileOutputDelimited_19
										.lastIndexOf("."));
						extension_tFileOutputDelimited_19 = fileName_tFileOutputDelimited_19
								.substring(fileName_tFileOutputDelimited_19
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_19 = fileName_tFileOutputDelimited_19
							.substring(0, fileName_tFileOutputDelimited_19
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_19.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_19 = fileName_tFileOutputDelimited_19
								.substring(0, fileName_tFileOutputDelimited_19
										.lastIndexOf("."));
						extension_tFileOutputDelimited_19 = fileName_tFileOutputDelimited_19
								.substring(fileName_tFileOutputDelimited_19
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_19 = fileName_tFileOutputDelimited_19;
						extension_tFileOutputDelimited_19 = "";
					}
					directory_tFileOutputDelimited_19 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_19 = true;
				java.io.File filetFileOutputDelimited_19 = new java.io.File(
						fileName_tFileOutputDelimited_19);
				globalMap.put("tFileOutputDelimited_19_FILE_NAME",
						fileName_tFileOutputDelimited_19);
				int nb_line_tFileOutputDelimited_19 = 0;
				int splitEvery_tFileOutputDelimited_19 = 1000;
				int splitedFileNo_tFileOutputDelimited_19 = 0;
				int currentRow_tFileOutputDelimited_19 = 0;

				final String OUT_DELIM_tFileOutputDelimited_19 = /**
				 * Start field
				 * tFileOutputDelimited_19:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_19:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_19 = /**
				 * Start
				 * field tFileOutputDelimited_19:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_19:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_19 != null
						&& directory_tFileOutputDelimited_19.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_19 = new java.io.File(
							directory_tFileOutputDelimited_19);
					if (!dir_tFileOutputDelimited_19.exists()) {
						log.info("tFileOutputDelimited_19 - Creating directory '"
								+ dir_tFileOutputDelimited_19
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_19.mkdirs();
						log.info("tFileOutputDelimited_19 - The directory '"
								+ dir_tFileOutputDelimited_19
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_19 = null;

				java.io.File fileToDelete_tFileOutputDelimited_19 = new java.io.File(
						fileName_tFileOutputDelimited_19);
				if (fileToDelete_tFileOutputDelimited_19.exists()) {
					fileToDelete_tFileOutputDelimited_19.delete();
				}
				outtFileOutputDelimited_19 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_19, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_19.length() == 0) {
						outtFileOutputDelimited_19.write("AGE_CODE");
						outtFileOutputDelimited_19
								.write(OUT_DELIM_tFileOutputDelimited_19);
						outtFileOutputDelimited_19.write("AGE_DESC");
						outtFileOutputDelimited_19
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_19);
						outtFileOutputDelimited_19.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_19",
						outtFileOutputDelimited_19);
				resourceMap.put("nb_line_tFileOutputDelimited_19",
						nb_line_tFileOutputDelimited_19);

				/**
				 * [tFileOutputDelimited_19 begin ] stop
				 */

				/**
				 * [tOracleInput_20 begin ] start
				 */

				ok_Hash.put("tOracleInput_20", false);
				start_Hash.put("tOracleInput_20", System.currentTimeMillis());

				currentComponent = "tOracleInput_20";

				int tos_count_tOracleInput_20 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_20 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_20 = new StringBuilder();
				log4jParamters_tOracleInput_20.append("Parameters:");
				log4jParamters_tOracleInput_20.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20
						.append("QUERY"
								+ " = "
								+ "\"  SELECT DMG_AGE_CODE, --REFERENCES FACT TABLES         DMG_AGE_DESC   FROM RNC_DESC_HH_AGE  ORDER BY 1  \"    ");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("AGE_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("AGE_DESC") + "}]");
				log4jParamters_tOracleInput_20.append(" | ");
				log4jParamters_tOracleInput_20.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_20.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_20 - "
							+ log4jParamters_tOracleInput_20);

				int nb_line_tOracleInput_20 = 0;
				java.sql.Connection conn_tOracleInput_20 = null;
				String driverClass_tOracleInput_20 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_20);

				String url_tOracleInput_20 = null;
				url_tOracleInput_20 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_20 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_20 = context.dbPasswordPI;

				String dbPwd_tOracleInput_20 = decryptedPassword_tOracleInput_20;

				log.debug("tOracleInput_20 - Driver ClassName: "
						+ driverClass_tOracleInput_20 + ".");

				log.info("tOracleInput_20 - Connection attempt to '"
						+ url_tOracleInput_20 + "' with the username '"
						+ dbUser_tOracleInput_20 + "'.");

				conn_tOracleInput_20 = java.sql.DriverManager.getConnection(
						url_tOracleInput_20, dbUser_tOracleInput_20,
						dbPwd_tOracleInput_20);
				log.info("tOracleInput_20 - Connection to '"
						+ url_tOracleInput_20 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_20 = conn_tOracleInput_20
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_20 = stmtGetTZ_tOracleInput_20
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_20 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_20.next()) {
					sessionTimezone_tOracleInput_20 = rsGetTZ_tOracleInput_20
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_20)
						.setSessionTimeZone(sessionTimezone_tOracleInput_20);

				java.sql.Statement stmt_tOracleInput_20 = conn_tOracleInput_20
						.createStatement();

				String dbquery_tOracleInput_20 = "\nSELECT DMG_AGE_CODE, --REFERENCES FACT TABLES\n       DMG_AGE_DESC \nFROM RNC_DESC_HH_AGE\nORDER BY 1\n"

				;

				log.info("tOracleInput_20 - Executing the query: '"
						+ dbquery_tOracleInput_20 + "'.");

				globalMap.put("tOracleInput_20_QUERY", dbquery_tOracleInput_20);

				java.sql.ResultSet rs_tOracleInput_20 = null;
				try {
					rs_tOracleInput_20 = stmt_tOracleInput_20
							.executeQuery(dbquery_tOracleInput_20);
					java.sql.ResultSetMetaData rsmd_tOracleInput_20 = rs_tOracleInput_20
							.getMetaData();
					int colQtyInRs_tOracleInput_20 = rsmd_tOracleInput_20
							.getColumnCount();

					String tmpContent_tOracleInput_20 = null;

					log.info("tOracleInput_20 - Retrieving records from the database.");

					while (rs_tOracleInput_20.next()) {
						nb_line_tOracleInput_20++;

						if (colQtyInRs_tOracleInput_20 < 1) {
							row22.AGE_CODE = null;
						} else {

							tmpContent_tOracleInput_20 = rs_tOracleInput_20
									.getString(1);
							if (tmpContent_tOracleInput_20 != null) {
								row22.AGE_CODE = tmpContent_tOracleInput_20;
							} else {
								row22.AGE_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_20 < 2) {
							row22.AGE_DESC = null;
						} else {

							tmpContent_tOracleInput_20 = rs_tOracleInput_20
									.getString(2);
							if (tmpContent_tOracleInput_20 != null) {
								row22.AGE_DESC = tmpContent_tOracleInput_20;
							} else {
								row22.AGE_DESC = null;
							}
						}

						log.debug("tOracleInput_20 - Retrieving the record "
								+ nb_line_tOracleInput_20 + ".");

						/**
						 * [tOracleInput_20 begin ] stop
						 */

						/**
						 * [tOracleInput_20 main ] start
						 */

						currentComponent = "tOracleInput_20";

						tos_count_tOracleInput_20++;

						/**
						 * [tOracleInput_20 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_19 main ] start
						 */

						currentComponent = "tFileOutputDelimited_19";

						if (log.isTraceEnabled()) {
							log.trace("row22 - "
									+ (row22 == null ? "" : row22.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_19 = new StringBuilder();
						if (row22.AGE_CODE != null) {
							sb_tFileOutputDelimited_19.append(row22.AGE_CODE);
						}
						sb_tFileOutputDelimited_19
								.append(OUT_DELIM_tFileOutputDelimited_19);
						if (row22.AGE_DESC != null) {
							sb_tFileOutputDelimited_19.append(row22.AGE_DESC);
						}
						sb_tFileOutputDelimited_19
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_19);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_19++;
							resourceMap.put("nb_line_tFileOutputDelimited_19",
									nb_line_tFileOutputDelimited_19);

							outtFileOutputDelimited_19
									.write(sb_tFileOutputDelimited_19
											.toString());
							log.debug("tFileOutputDelimited_19 - Writing the record "
									+ nb_line_tFileOutputDelimited_19 + ".");

						}

						tos_count_tFileOutputDelimited_19++;

						/**
						 * [tFileOutputDelimited_19 main ] stop
						 */

						/**
						 * [tOracleInput_20 end ] start
						 */

						currentComponent = "tOracleInput_20";

					}
				} finally {
					stmt_tOracleInput_20.close();

					if (conn_tOracleInput_20 != null
							&& !conn_tOracleInput_20.isClosed()) {

						log.info("tOracleInput_20 - Closing the connection to the database.");

						conn_tOracleInput_20.close();

						log.info("tOracleInput_20 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_20_NB_LINE",
						nb_line_tOracleInput_20);
				log.info("tOracleInput_20 - Retrieved records count: "
						+ nb_line_tOracleInput_20 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_20 - " + "Done.");

				ok_Hash.put("tOracleInput_20", true);
				end_Hash.put("tOracleInput_20", System.currentTimeMillis());

				/**
				 * [tOracleInput_20 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_19 end ] start
				 */

				currentComponent = "tFileOutputDelimited_19";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_19 != null) {
						outtFileOutputDelimited_19.flush();
						outtFileOutputDelimited_19.close();
					}

					globalMap.put("tFileOutputDelimited_19_NB_LINE",
							nb_line_tFileOutputDelimited_19);
					globalMap.put("tFileOutputDelimited_19_FILE_NAME",
							fileName_tFileOutputDelimited_19);

				}

				resourceMap.put("finish_tFileOutputDelimited_19", true);

				log.info("tFileOutputDelimited_19 - Written records count: "
						+ nb_line_tFileOutputDelimited_19 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_19 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_19", true);
				end_Hash.put("tFileOutputDelimited_19",
						System.currentTimeMillis());

				tOracleInput_22Process(globalMap);

				/**
				 * [tFileOutputDelimited_19 end ] stop
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
				 * [tOracleInput_20 finally ] start
				 */

				currentComponent = "tOracleInput_20";

				/**
				 * [tOracleInput_20 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_19 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_19";

				if (resourceMap.get("finish_tFileOutputDelimited_19") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_19 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_19");
						if (outtFileOutputDelimited_19 != null) {
							outtFileOutputDelimited_19.flush();
							outtFileOutputDelimited_19.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_19 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_20_SUBPROCESS_STATE", 1);
	}

	public static class row24Struct implements
			routines.system.IPersistableRow<row24Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String EST_HH_INCOME_CODE;

		public String getEST_HH_INCOME_CODE() {
			return this.EST_HH_INCOME_CODE;
		}

		public String EST_HH_INCOME_DESC;

		public String getEST_HH_INCOME_DESC() {
			return this.EST_HH_INCOME_DESC;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.EST_HH_INCOME_CODE = readString(dis);

					this.EST_HH_INCOME_DESC = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.EST_HH_INCOME_CODE, dos);

				// String

				writeString(this.EST_HH_INCOME_DESC, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("EST_HH_INCOME_CODE=" + EST_HH_INCOME_CODE);
			sb.append(",EST_HH_INCOME_DESC=" + EST_HH_INCOME_DESC);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (EST_HH_INCOME_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(EST_HH_INCOME_CODE);
			}

			sb.append("|");

			if (EST_HH_INCOME_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(EST_HH_INCOME_DESC);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row24Struct other) {

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

	public void tOracleInput_22Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_22_SUBPROCESS_STATE", 0);

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

				row24Struct row24 = new row24Struct();

				/**
				 * [tFileOutputDelimited_21 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_21", false);
				start_Hash.put("tFileOutputDelimited_21",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_21";

				int tos_count_tFileOutputDelimited_21 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_21 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_21 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_21.append("Parameters:");
				log4jParamters_tFileOutputDelimited_21.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_EST_HH_INCOME_SORT_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				log4jParamters_tFileOutputDelimited_21
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_21.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_21 - "
							+ log4jParamters_tFileOutputDelimited_21);

				String fileName_tFileOutputDelimited_21 = "";
				fileName_tFileOutputDelimited_21 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_EST_HH_INCOME_SORT_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_21 = null;
				String extension_tFileOutputDelimited_21 = null;
				String directory_tFileOutputDelimited_21 = null;
				if ((fileName_tFileOutputDelimited_21.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_21.lastIndexOf(".") < fileName_tFileOutputDelimited_21
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_21 = fileName_tFileOutputDelimited_21;
						extension_tFileOutputDelimited_21 = "";
					} else {
						fullName_tFileOutputDelimited_21 = fileName_tFileOutputDelimited_21
								.substring(0, fileName_tFileOutputDelimited_21
										.lastIndexOf("."));
						extension_tFileOutputDelimited_21 = fileName_tFileOutputDelimited_21
								.substring(fileName_tFileOutputDelimited_21
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_21 = fileName_tFileOutputDelimited_21
							.substring(0, fileName_tFileOutputDelimited_21
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_21.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_21 = fileName_tFileOutputDelimited_21
								.substring(0, fileName_tFileOutputDelimited_21
										.lastIndexOf("."));
						extension_tFileOutputDelimited_21 = fileName_tFileOutputDelimited_21
								.substring(fileName_tFileOutputDelimited_21
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_21 = fileName_tFileOutputDelimited_21;
						extension_tFileOutputDelimited_21 = "";
					}
					directory_tFileOutputDelimited_21 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_21 = true;
				java.io.File filetFileOutputDelimited_21 = new java.io.File(
						fileName_tFileOutputDelimited_21);
				globalMap.put("tFileOutputDelimited_21_FILE_NAME",
						fileName_tFileOutputDelimited_21);
				int nb_line_tFileOutputDelimited_21 = 0;
				int splitEvery_tFileOutputDelimited_21 = 1000;
				int splitedFileNo_tFileOutputDelimited_21 = 0;
				int currentRow_tFileOutputDelimited_21 = 0;

				final String OUT_DELIM_tFileOutputDelimited_21 = /**
				 * Start field
				 * tFileOutputDelimited_21:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_21:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_21 = /**
				 * Start
				 * field tFileOutputDelimited_21:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_21:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_21 != null
						&& directory_tFileOutputDelimited_21.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_21 = new java.io.File(
							directory_tFileOutputDelimited_21);
					if (!dir_tFileOutputDelimited_21.exists()) {
						log.info("tFileOutputDelimited_21 - Creating directory '"
								+ dir_tFileOutputDelimited_21
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_21.mkdirs();
						log.info("tFileOutputDelimited_21 - The directory '"
								+ dir_tFileOutputDelimited_21
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_21 = null;

				java.io.File fileToDelete_tFileOutputDelimited_21 = new java.io.File(
						fileName_tFileOutputDelimited_21);
				if (fileToDelete_tFileOutputDelimited_21.exists()) {
					fileToDelete_tFileOutputDelimited_21.delete();
				}
				outtFileOutputDelimited_21 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_21, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_21.length() == 0) {
						outtFileOutputDelimited_21.write("EST_HH_INCOME_CODE");
						outtFileOutputDelimited_21
								.write(OUT_DELIM_tFileOutputDelimited_21);
						outtFileOutputDelimited_21.write("EST_HH_INCOME_DESC");
						outtFileOutputDelimited_21
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_21);
						outtFileOutputDelimited_21.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_21",
						outtFileOutputDelimited_21);
				resourceMap.put("nb_line_tFileOutputDelimited_21",
						nb_line_tFileOutputDelimited_21);

				/**
				 * [tFileOutputDelimited_21 begin ] stop
				 */

				/**
				 * [tOracleInput_22 begin ] start
				 */

				ok_Hash.put("tOracleInput_22", false);
				start_Hash.put("tOracleInput_22", System.currentTimeMillis());

				currentComponent = "tOracleInput_22";

				int tos_count_tOracleInput_22 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_22 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_22 = new StringBuilder();
				log4jParamters_tOracleInput_22.append("Parameters:");
				log4jParamters_tOracleInput_22.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22
						.append("QUERY"
								+ " = "
								+ "\"  SELECT EST_HH_INCOME_CODE, --REFERENCES FACT TABLES         EST_HH_INCOME_DESC    FROM EST_HH_INCOME_SORT  ORDER BY 1   \"    ");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("EST_HH_INCOME_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EST_HH_INCOME_DESC") + "}]");
				log4jParamters_tOracleInput_22.append(" | ");
				log4jParamters_tOracleInput_22.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_22.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_22 - "
							+ log4jParamters_tOracleInput_22);

				int nb_line_tOracleInput_22 = 0;
				java.sql.Connection conn_tOracleInput_22 = null;
				String driverClass_tOracleInput_22 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_22);

				String url_tOracleInput_22 = null;
				url_tOracleInput_22 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_22 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_22 = context.dbPasswordPI;

				String dbPwd_tOracleInput_22 = decryptedPassword_tOracleInput_22;

				log.debug("tOracleInput_22 - Driver ClassName: "
						+ driverClass_tOracleInput_22 + ".");

				log.info("tOracleInput_22 - Connection attempt to '"
						+ url_tOracleInput_22 + "' with the username '"
						+ dbUser_tOracleInput_22 + "'.");

				conn_tOracleInput_22 = java.sql.DriverManager.getConnection(
						url_tOracleInput_22, dbUser_tOracleInput_22,
						dbPwd_tOracleInput_22);
				log.info("tOracleInput_22 - Connection to '"
						+ url_tOracleInput_22 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_22 = conn_tOracleInput_22
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_22 = stmtGetTZ_tOracleInput_22
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_22 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_22.next()) {
					sessionTimezone_tOracleInput_22 = rsGetTZ_tOracleInput_22
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_22)
						.setSessionTimeZone(sessionTimezone_tOracleInput_22);

				java.sql.Statement stmt_tOracleInput_22 = conn_tOracleInput_22
						.createStatement();

				String dbquery_tOracleInput_22 = "\nSELECT EST_HH_INCOME_CODE, --REFERENCES FACT TABLES\n       EST_HH_INCOME_DESC  \nFROM EST_HH_INCOME_SORT\nORDER BY 1 \n"

				;

				log.info("tOracleInput_22 - Executing the query: '"
						+ dbquery_tOracleInput_22 + "'.");

				globalMap.put("tOracleInput_22_QUERY", dbquery_tOracleInput_22);

				java.sql.ResultSet rs_tOracleInput_22 = null;
				try {
					rs_tOracleInput_22 = stmt_tOracleInput_22
							.executeQuery(dbquery_tOracleInput_22);
					java.sql.ResultSetMetaData rsmd_tOracleInput_22 = rs_tOracleInput_22
							.getMetaData();
					int colQtyInRs_tOracleInput_22 = rsmd_tOracleInput_22
							.getColumnCount();

					String tmpContent_tOracleInput_22 = null;

					log.info("tOracleInput_22 - Retrieving records from the database.");

					while (rs_tOracleInput_22.next()) {
						nb_line_tOracleInput_22++;

						if (colQtyInRs_tOracleInput_22 < 1) {
							row24.EST_HH_INCOME_CODE = null;
						} else {

							tmpContent_tOracleInput_22 = rs_tOracleInput_22
									.getString(1);
							if (tmpContent_tOracleInput_22 != null) {
								row24.EST_HH_INCOME_CODE = tmpContent_tOracleInput_22;
							} else {
								row24.EST_HH_INCOME_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_22 < 2) {
							row24.EST_HH_INCOME_DESC = null;
						} else {

							tmpContent_tOracleInput_22 = rs_tOracleInput_22
									.getString(2);
							if (tmpContent_tOracleInput_22 != null) {
								row24.EST_HH_INCOME_DESC = tmpContent_tOracleInput_22;
							} else {
								row24.EST_HH_INCOME_DESC = null;
							}
						}

						log.debug("tOracleInput_22 - Retrieving the record "
								+ nb_line_tOracleInput_22 + ".");

						/**
						 * [tOracleInput_22 begin ] stop
						 */

						/**
						 * [tOracleInput_22 main ] start
						 */

						currentComponent = "tOracleInput_22";

						tos_count_tOracleInput_22++;

						/**
						 * [tOracleInput_22 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_21 main ] start
						 */

						currentComponent = "tFileOutputDelimited_21";

						if (log.isTraceEnabled()) {
							log.trace("row24 - "
									+ (row24 == null ? "" : row24.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_21 = new StringBuilder();
						if (row24.EST_HH_INCOME_CODE != null) {
							sb_tFileOutputDelimited_21
									.append(row24.EST_HH_INCOME_CODE);
						}
						sb_tFileOutputDelimited_21
								.append(OUT_DELIM_tFileOutputDelimited_21);
						if (row24.EST_HH_INCOME_DESC != null) {
							sb_tFileOutputDelimited_21
									.append(row24.EST_HH_INCOME_DESC);
						}
						sb_tFileOutputDelimited_21
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_21);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_21++;
							resourceMap.put("nb_line_tFileOutputDelimited_21",
									nb_line_tFileOutputDelimited_21);

							outtFileOutputDelimited_21
									.write(sb_tFileOutputDelimited_21
											.toString());
							log.debug("tFileOutputDelimited_21 - Writing the record "
									+ nb_line_tFileOutputDelimited_21 + ".");

						}

						tos_count_tFileOutputDelimited_21++;

						/**
						 * [tFileOutputDelimited_21 main ] stop
						 */

						/**
						 * [tOracleInput_22 end ] start
						 */

						currentComponent = "tOracleInput_22";

					}
				} finally {
					stmt_tOracleInput_22.close();

					if (conn_tOracleInput_22 != null
							&& !conn_tOracleInput_22.isClosed()) {

						log.info("tOracleInput_22 - Closing the connection to the database.");

						conn_tOracleInput_22.close();

						log.info("tOracleInput_22 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_22_NB_LINE",
						nb_line_tOracleInput_22);
				log.info("tOracleInput_22 - Retrieved records count: "
						+ nb_line_tOracleInput_22 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_22 - " + "Done.");

				ok_Hash.put("tOracleInput_22", true);
				end_Hash.put("tOracleInput_22", System.currentTimeMillis());

				/**
				 * [tOracleInput_22 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_21 end ] start
				 */

				currentComponent = "tFileOutputDelimited_21";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_21 != null) {
						outtFileOutputDelimited_21.flush();
						outtFileOutputDelimited_21.close();
					}

					globalMap.put("tFileOutputDelimited_21_NB_LINE",
							nb_line_tFileOutputDelimited_21);
					globalMap.put("tFileOutputDelimited_21_FILE_NAME",
							fileName_tFileOutputDelimited_21);

				}

				resourceMap.put("finish_tFileOutputDelimited_21", true);

				log.info("tFileOutputDelimited_21 - Written records count: "
						+ nb_line_tFileOutputDelimited_21 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_21 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_21", true);
				end_Hash.put("tFileOutputDelimited_21",
						System.currentTimeMillis());

				tOracleInput_24Process(globalMap);

				/**
				 * [tFileOutputDelimited_21 end ] stop
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
				 * [tOracleInput_22 finally ] start
				 */

				currentComponent = "tOracleInput_22";

				/**
				 * [tOracleInput_22 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_21 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_21";

				if (resourceMap.get("finish_tFileOutputDelimited_21") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_21 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_21");
						if (outtFileOutputDelimited_21 != null) {
							outtFileOutputDelimited_21.flush();
							outtFileOutputDelimited_21.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_21 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_22_SUBPROCESS_STATE", 1);
	}

	public static class row26Struct implements
			routines.system.IPersistableRow<row26Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String ETHNIC_KEY;

		public String getETHNIC_KEY() {
			return this.ETHNIC_KEY;
		}

		public String PEC_DESC;

		public String getPEC_DESC() {
			return this.PEC_DESC;
		}

		public String PLC_DESC;

		public String getPLC_DESC() {
			return this.PLC_DESC;
		}

		public String SEC_DESC;

		public String getSEC_DESC() {
			return this.SEC_DESC;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.ETHNIC_KEY = readString(dis);

					this.PEC_DESC = readString(dis);

					this.PLC_DESC = readString(dis);

					this.SEC_DESC = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.ETHNIC_KEY, dos);

				// String

				writeString(this.PEC_DESC, dos);

				// String

				writeString(this.PLC_DESC, dos);

				// String

				writeString(this.SEC_DESC, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ETHNIC_KEY=" + ETHNIC_KEY);
			sb.append(",PEC_DESC=" + PEC_DESC);
			sb.append(",PLC_DESC=" + PLC_DESC);
			sb.append(",SEC_DESC=" + SEC_DESC);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ETHNIC_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(ETHNIC_KEY);
			}

			sb.append("|");

			if (PEC_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(PEC_DESC);
			}

			sb.append("|");

			if (PLC_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(PLC_DESC);
			}

			sb.append("|");

			if (SEC_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(SEC_DESC);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row26Struct other) {

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

	public void tOracleInput_24Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_24_SUBPROCESS_STATE", 0);

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

				row26Struct row26 = new row26Struct();

				/**
				 * [tFileOutputDelimited_23 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_23", false);
				start_Hash.put("tFileOutputDelimited_23",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_23";

				int tos_count_tFileOutputDelimited_23 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_23 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_23 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_23.append("Parameters:");
				log4jParamters_tFileOutputDelimited_23.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_LU_ETHNIC_CODES_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				log4jParamters_tFileOutputDelimited_23
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_23.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_23 - "
							+ log4jParamters_tFileOutputDelimited_23);

				String fileName_tFileOutputDelimited_23 = "";
				fileName_tFileOutputDelimited_23 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_LU_ETHNIC_CODES_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_23 = null;
				String extension_tFileOutputDelimited_23 = null;
				String directory_tFileOutputDelimited_23 = null;
				if ((fileName_tFileOutputDelimited_23.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_23.lastIndexOf(".") < fileName_tFileOutputDelimited_23
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_23 = fileName_tFileOutputDelimited_23;
						extension_tFileOutputDelimited_23 = "";
					} else {
						fullName_tFileOutputDelimited_23 = fileName_tFileOutputDelimited_23
								.substring(0, fileName_tFileOutputDelimited_23
										.lastIndexOf("."));
						extension_tFileOutputDelimited_23 = fileName_tFileOutputDelimited_23
								.substring(fileName_tFileOutputDelimited_23
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_23 = fileName_tFileOutputDelimited_23
							.substring(0, fileName_tFileOutputDelimited_23
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_23.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_23 = fileName_tFileOutputDelimited_23
								.substring(0, fileName_tFileOutputDelimited_23
										.lastIndexOf("."));
						extension_tFileOutputDelimited_23 = fileName_tFileOutputDelimited_23
								.substring(fileName_tFileOutputDelimited_23
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_23 = fileName_tFileOutputDelimited_23;
						extension_tFileOutputDelimited_23 = "";
					}
					directory_tFileOutputDelimited_23 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_23 = true;
				java.io.File filetFileOutputDelimited_23 = new java.io.File(
						fileName_tFileOutputDelimited_23);
				globalMap.put("tFileOutputDelimited_23_FILE_NAME",
						fileName_tFileOutputDelimited_23);
				int nb_line_tFileOutputDelimited_23 = 0;
				int splitEvery_tFileOutputDelimited_23 = 1000;
				int splitedFileNo_tFileOutputDelimited_23 = 0;
				int currentRow_tFileOutputDelimited_23 = 0;

				final String OUT_DELIM_tFileOutputDelimited_23 = /**
				 * Start field
				 * tFileOutputDelimited_23:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_23:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_23 = /**
				 * Start
				 * field tFileOutputDelimited_23:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_23:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_23 != null
						&& directory_tFileOutputDelimited_23.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_23 = new java.io.File(
							directory_tFileOutputDelimited_23);
					if (!dir_tFileOutputDelimited_23.exists()) {
						log.info("tFileOutputDelimited_23 - Creating directory '"
								+ dir_tFileOutputDelimited_23
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_23.mkdirs();
						log.info("tFileOutputDelimited_23 - The directory '"
								+ dir_tFileOutputDelimited_23
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_23 = null;

				java.io.File fileToDelete_tFileOutputDelimited_23 = new java.io.File(
						fileName_tFileOutputDelimited_23);
				if (fileToDelete_tFileOutputDelimited_23.exists()) {
					fileToDelete_tFileOutputDelimited_23.delete();
				}
				outtFileOutputDelimited_23 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_23, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_23.length() == 0) {
						outtFileOutputDelimited_23.write("ETHNIC_KEY");
						outtFileOutputDelimited_23
								.write(OUT_DELIM_tFileOutputDelimited_23);
						outtFileOutputDelimited_23.write("PEC_DESC");
						outtFileOutputDelimited_23
								.write(OUT_DELIM_tFileOutputDelimited_23);
						outtFileOutputDelimited_23.write("PLC_DESC");
						outtFileOutputDelimited_23
								.write(OUT_DELIM_tFileOutputDelimited_23);
						outtFileOutputDelimited_23.write("SEC_DESC");
						outtFileOutputDelimited_23
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_23);
						outtFileOutputDelimited_23.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_23",
						outtFileOutputDelimited_23);
				resourceMap.put("nb_line_tFileOutputDelimited_23",
						nb_line_tFileOutputDelimited_23);

				/**
				 * [tFileOutputDelimited_23 begin ] stop
				 */

				/**
				 * [tOracleInput_24 begin ] start
				 */

				ok_Hash.put("tOracleInput_24", false);
				start_Hash.put("tOracleInput_24", System.currentTimeMillis());

				currentComponent = "tOracleInput_24";

				int tos_count_tOracleInput_24 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_24 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_24 = new StringBuilder();
				log4jParamters_tOracleInput_24.append("Parameters:");
				log4jParamters_tOracleInput_24.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24
						.append("QUERY"
								+ " = "
								+ "\"  SELECT ETHNIC_KEY, --REFERENCES FACT TABLES                PEC_DESC,                PLC_DESC,                SEC_DESC        FROM LU_ETHNIC_CODES  \"    ");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ETHNIC_KEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("PEC_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("PLC_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SEC_DESC") + "}]");
				log4jParamters_tOracleInput_24.append(" | ");
				log4jParamters_tOracleInput_24.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_24.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_24 - "
							+ log4jParamters_tOracleInput_24);

				int nb_line_tOracleInput_24 = 0;
				java.sql.Connection conn_tOracleInput_24 = null;
				String driverClass_tOracleInput_24 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_24);

				String url_tOracleInput_24 = null;
				url_tOracleInput_24 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_24 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_24 = context.dbPasswordPI;

				String dbPwd_tOracleInput_24 = decryptedPassword_tOracleInput_24;

				log.debug("tOracleInput_24 - Driver ClassName: "
						+ driverClass_tOracleInput_24 + ".");

				log.info("tOracleInput_24 - Connection attempt to '"
						+ url_tOracleInput_24 + "' with the username '"
						+ dbUser_tOracleInput_24 + "'.");

				conn_tOracleInput_24 = java.sql.DriverManager.getConnection(
						url_tOracleInput_24, dbUser_tOracleInput_24,
						dbPwd_tOracleInput_24);
				log.info("tOracleInput_24 - Connection to '"
						+ url_tOracleInput_24 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_24 = conn_tOracleInput_24
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_24 = stmtGetTZ_tOracleInput_24
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_24 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_24.next()) {
					sessionTimezone_tOracleInput_24 = rsGetTZ_tOracleInput_24
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_24)
						.setSessionTimeZone(sessionTimezone_tOracleInput_24);

				java.sql.Statement stmt_tOracleInput_24 = conn_tOracleInput_24
						.createStatement();

				String dbquery_tOracleInput_24 = "\nSELECT ETHNIC_KEY, --REFERENCES FACT TABLES       \n       PEC_DESC,       \n       PLC_DESC,       \n       SEC_DESC      \nFROM LU_ETHNIC_CODES\n"

				;

				log.info("tOracleInput_24 - Executing the query: '"
						+ dbquery_tOracleInput_24 + "'.");

				globalMap.put("tOracleInput_24_QUERY", dbquery_tOracleInput_24);

				java.sql.ResultSet rs_tOracleInput_24 = null;
				try {
					rs_tOracleInput_24 = stmt_tOracleInput_24
							.executeQuery(dbquery_tOracleInput_24);
					java.sql.ResultSetMetaData rsmd_tOracleInput_24 = rs_tOracleInput_24
							.getMetaData();
					int colQtyInRs_tOracleInput_24 = rsmd_tOracleInput_24
							.getColumnCount();

					String tmpContent_tOracleInput_24 = null;

					log.info("tOracleInput_24 - Retrieving records from the database.");

					while (rs_tOracleInput_24.next()) {
						nb_line_tOracleInput_24++;

						if (colQtyInRs_tOracleInput_24 < 1) {
							row26.ETHNIC_KEY = null;
						} else {

							tmpContent_tOracleInput_24 = rs_tOracleInput_24
									.getString(1);
							if (tmpContent_tOracleInput_24 != null) {
								row26.ETHNIC_KEY = tmpContent_tOracleInput_24;
							} else {
								row26.ETHNIC_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_24 < 2) {
							row26.PEC_DESC = null;
						} else {

							tmpContent_tOracleInput_24 = rs_tOracleInput_24
									.getString(2);
							if (tmpContent_tOracleInput_24 != null) {
								row26.PEC_DESC = tmpContent_tOracleInput_24;
							} else {
								row26.PEC_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_24 < 3) {
							row26.PLC_DESC = null;
						} else {

							tmpContent_tOracleInput_24 = rs_tOracleInput_24
									.getString(3);
							if (tmpContent_tOracleInput_24 != null) {
								row26.PLC_DESC = tmpContent_tOracleInput_24;
							} else {
								row26.PLC_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_24 < 4) {
							row26.SEC_DESC = null;
						} else {

							tmpContent_tOracleInput_24 = rs_tOracleInput_24
									.getString(4);
							if (tmpContent_tOracleInput_24 != null) {
								row26.SEC_DESC = tmpContent_tOracleInput_24;
							} else {
								row26.SEC_DESC = null;
							}
						}

						log.debug("tOracleInput_24 - Retrieving the record "
								+ nb_line_tOracleInput_24 + ".");

						/**
						 * [tOracleInput_24 begin ] stop
						 */

						/**
						 * [tOracleInput_24 main ] start
						 */

						currentComponent = "tOracleInput_24";

						tos_count_tOracleInput_24++;

						/**
						 * [tOracleInput_24 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_23 main ] start
						 */

						currentComponent = "tFileOutputDelimited_23";

						if (log.isTraceEnabled()) {
							log.trace("row26 - "
									+ (row26 == null ? "" : row26.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_23 = new StringBuilder();
						if (row26.ETHNIC_KEY != null) {
							sb_tFileOutputDelimited_23.append(row26.ETHNIC_KEY);
						}
						sb_tFileOutputDelimited_23
								.append(OUT_DELIM_tFileOutputDelimited_23);
						if (row26.PEC_DESC != null) {
							sb_tFileOutputDelimited_23.append(row26.PEC_DESC);
						}
						sb_tFileOutputDelimited_23
								.append(OUT_DELIM_tFileOutputDelimited_23);
						if (row26.PLC_DESC != null) {
							sb_tFileOutputDelimited_23.append(row26.PLC_DESC);
						}
						sb_tFileOutputDelimited_23
								.append(OUT_DELIM_tFileOutputDelimited_23);
						if (row26.SEC_DESC != null) {
							sb_tFileOutputDelimited_23.append(row26.SEC_DESC);
						}
						sb_tFileOutputDelimited_23
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_23);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_23++;
							resourceMap.put("nb_line_tFileOutputDelimited_23",
									nb_line_tFileOutputDelimited_23);

							outtFileOutputDelimited_23
									.write(sb_tFileOutputDelimited_23
											.toString());
							log.debug("tFileOutputDelimited_23 - Writing the record "
									+ nb_line_tFileOutputDelimited_23 + ".");

						}

						tos_count_tFileOutputDelimited_23++;

						/**
						 * [tFileOutputDelimited_23 main ] stop
						 */

						/**
						 * [tOracleInput_24 end ] start
						 */

						currentComponent = "tOracleInput_24";

					}
				} finally {
					stmt_tOracleInput_24.close();

					if (conn_tOracleInput_24 != null
							&& !conn_tOracleInput_24.isClosed()) {

						log.info("tOracleInput_24 - Closing the connection to the database.");

						conn_tOracleInput_24.close();

						log.info("tOracleInput_24 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_24_NB_LINE",
						nb_line_tOracleInput_24);
				log.info("tOracleInput_24 - Retrieved records count: "
						+ nb_line_tOracleInput_24 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_24 - " + "Done.");

				ok_Hash.put("tOracleInput_24", true);
				end_Hash.put("tOracleInput_24", System.currentTimeMillis());

				/**
				 * [tOracleInput_24 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_23 end ] start
				 */

				currentComponent = "tFileOutputDelimited_23";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_23 != null) {
						outtFileOutputDelimited_23.flush();
						outtFileOutputDelimited_23.close();
					}

					globalMap.put("tFileOutputDelimited_23_NB_LINE",
							nb_line_tFileOutputDelimited_23);
					globalMap.put("tFileOutputDelimited_23_FILE_NAME",
							fileName_tFileOutputDelimited_23);

				}

				resourceMap.put("finish_tFileOutputDelimited_23", true);

				log.info("tFileOutputDelimited_23 - Written records count: "
						+ nb_line_tFileOutputDelimited_23 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_23 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_23", true);
				end_Hash.put("tFileOutputDelimited_23",
						System.currentTimeMillis());

				tOracleInput_26Process(globalMap);

				/**
				 * [tFileOutputDelimited_23 end ] stop
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
				 * [tOracleInput_24 finally ] start
				 */

				currentComponent = "tOracleInput_24";

				/**
				 * [tOracleInput_24 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_23 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_23";

				if (resourceMap.get("finish_tFileOutputDelimited_23") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_23 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_23");
						if (outtFileOutputDelimited_23 != null) {
							outtFileOutputDelimited_23.flush();
							outtFileOutputDelimited_23.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_23 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_24_SUBPROCESS_STATE", 1);
	}

	public static class row28Struct implements
			routines.system.IPersistableRow<row28Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String DATA_TYPE;

		public String getDATA_TYPE() {
			return this.DATA_TYPE;
		}

		public String TIME_PERIOD;

		public String getTIME_PERIOD() {
			return this.TIME_PERIOD;
		}

		public String REPORT_YEAR_MONTH;

		public String getREPORT_YEAR_MONTH() {
			return this.REPORT_YEAR_MONTH;
		}

		public String MONTH_DESC;

		public String getMONTH_DESC() {
			return this.MONTH_DESC;
		}

		public String YEAR_ID;

		public String getYEAR_ID() {
			return this.YEAR_ID;
		}

		public String QUERY_OPTION;

		public String getQUERY_OPTION() {
			return this.QUERY_OPTION;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.DATA_TYPE = readString(dis);

					this.TIME_PERIOD = readString(dis);

					this.REPORT_YEAR_MONTH = readString(dis);

					this.MONTH_DESC = readString(dis);

					this.YEAR_ID = readString(dis);

					this.QUERY_OPTION = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.DATA_TYPE, dos);

				// String

				writeString(this.TIME_PERIOD, dos);

				// String

				writeString(this.REPORT_YEAR_MONTH, dos);

				// String

				writeString(this.MONTH_DESC, dos);

				// String

				writeString(this.YEAR_ID, dos);

				// String

				writeString(this.QUERY_OPTION, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("DATA_TYPE=" + DATA_TYPE);
			sb.append(",TIME_PERIOD=" + TIME_PERIOD);
			sb.append(",REPORT_YEAR_MONTH=" + REPORT_YEAR_MONTH);
			sb.append(",MONTH_DESC=" + MONTH_DESC);
			sb.append(",YEAR_ID=" + YEAR_ID);
			sb.append(",QUERY_OPTION=" + QUERY_OPTION);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (DATA_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(DATA_TYPE);
			}

			sb.append("|");

			if (TIME_PERIOD == null) {
				sb.append("<null>");
			} else {
				sb.append(TIME_PERIOD);
			}

			sb.append("|");

			if (REPORT_YEAR_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_YEAR_MONTH);
			}

			sb.append("|");

			if (MONTH_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH_DESC);
			}

			sb.append("|");

			if (YEAR_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_ID);
			}

			sb.append("|");

			if (QUERY_OPTION == null) {
				sb.append("<null>");
			} else {
				sb.append(QUERY_OPTION);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row28Struct other) {

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

	public void tOracleInput_26Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_26_SUBPROCESS_STATE", 0);

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

				row28Struct row28 = new row28Struct();

				/**
				 * [tFileOutputDelimited_25 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_25", false);
				start_Hash.put("tFileOutputDelimited_25",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_25";

				int tos_count_tFileOutputDelimited_25 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_25 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_25 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_25.append("Parameters:");
				log4jParamters_tFileOutputDelimited_25.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_NEW_USED_SALES_TIME_PERIOD_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				log4jParamters_tFileOutputDelimited_25
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_25.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_25 - "
							+ log4jParamters_tFileOutputDelimited_25);

				String fileName_tFileOutputDelimited_25 = "";
				fileName_tFileOutputDelimited_25 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_NEW_USED_SALES_TIME_PERIOD_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_25 = null;
				String extension_tFileOutputDelimited_25 = null;
				String directory_tFileOutputDelimited_25 = null;
				if ((fileName_tFileOutputDelimited_25.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_25.lastIndexOf(".") < fileName_tFileOutputDelimited_25
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_25 = fileName_tFileOutputDelimited_25;
						extension_tFileOutputDelimited_25 = "";
					} else {
						fullName_tFileOutputDelimited_25 = fileName_tFileOutputDelimited_25
								.substring(0, fileName_tFileOutputDelimited_25
										.lastIndexOf("."));
						extension_tFileOutputDelimited_25 = fileName_tFileOutputDelimited_25
								.substring(fileName_tFileOutputDelimited_25
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_25 = fileName_tFileOutputDelimited_25
							.substring(0, fileName_tFileOutputDelimited_25
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_25.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_25 = fileName_tFileOutputDelimited_25
								.substring(0, fileName_tFileOutputDelimited_25
										.lastIndexOf("."));
						extension_tFileOutputDelimited_25 = fileName_tFileOutputDelimited_25
								.substring(fileName_tFileOutputDelimited_25
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_25 = fileName_tFileOutputDelimited_25;
						extension_tFileOutputDelimited_25 = "";
					}
					directory_tFileOutputDelimited_25 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_25 = true;
				java.io.File filetFileOutputDelimited_25 = new java.io.File(
						fileName_tFileOutputDelimited_25);
				globalMap.put("tFileOutputDelimited_25_FILE_NAME",
						fileName_tFileOutputDelimited_25);
				int nb_line_tFileOutputDelimited_25 = 0;
				int splitEvery_tFileOutputDelimited_25 = 1000;
				int splitedFileNo_tFileOutputDelimited_25 = 0;
				int currentRow_tFileOutputDelimited_25 = 0;

				final String OUT_DELIM_tFileOutputDelimited_25 = /**
				 * Start field
				 * tFileOutputDelimited_25:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_25:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_25 = /**
				 * Start
				 * field tFileOutputDelimited_25:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_25:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_25 != null
						&& directory_tFileOutputDelimited_25.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_25 = new java.io.File(
							directory_tFileOutputDelimited_25);
					if (!dir_tFileOutputDelimited_25.exists()) {
						log.info("tFileOutputDelimited_25 - Creating directory '"
								+ dir_tFileOutputDelimited_25
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_25.mkdirs();
						log.info("tFileOutputDelimited_25 - The directory '"
								+ dir_tFileOutputDelimited_25
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_25 = null;

				java.io.File fileToDelete_tFileOutputDelimited_25 = new java.io.File(
						fileName_tFileOutputDelimited_25);
				if (fileToDelete_tFileOutputDelimited_25.exists()) {
					fileToDelete_tFileOutputDelimited_25.delete();
				}
				outtFileOutputDelimited_25 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_25, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_25.length() == 0) {
						outtFileOutputDelimited_25.write("DATA_TYPE");
						outtFileOutputDelimited_25
								.write(OUT_DELIM_tFileOutputDelimited_25);
						outtFileOutputDelimited_25.write("TIME_PERIOD");
						outtFileOutputDelimited_25
								.write(OUT_DELIM_tFileOutputDelimited_25);
						outtFileOutputDelimited_25.write("REPORT_YEAR_MONTH");
						outtFileOutputDelimited_25
								.write(OUT_DELIM_tFileOutputDelimited_25);
						outtFileOutputDelimited_25.write("MONTH_DESC");
						outtFileOutputDelimited_25
								.write(OUT_DELIM_tFileOutputDelimited_25);
						outtFileOutputDelimited_25.write("YEAR_ID");
						outtFileOutputDelimited_25
								.write(OUT_DELIM_tFileOutputDelimited_25);
						outtFileOutputDelimited_25.write("QUERY_OPTION");
						outtFileOutputDelimited_25
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_25);
						outtFileOutputDelimited_25.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_25",
						outtFileOutputDelimited_25);
				resourceMap.put("nb_line_tFileOutputDelimited_25",
						nb_line_tFileOutputDelimited_25);

				/**
				 * [tFileOutputDelimited_25 begin ] stop
				 */

				/**
				 * [tOracleInput_26 begin ] start
				 */

				ok_Hash.put("tOracleInput_26", false);
				start_Hash.put("tOracleInput_26", System.currentTimeMillis());

				currentComponent = "tOracleInput_26";

				int tos_count_tOracleInput_26 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_26 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_26 = new StringBuilder();
				log4jParamters_tOracleInput_26.append("Parameters:");
				log4jParamters_tOracleInput_26.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26
						.append("QUERY"
								+ " = "
								+ "\"  SELECT DATA_TYPE,         TIME_PERIOD,         REPORT_YEAR_MONTH, --REFERENCES NEW/USED/SALES FACT TABLES         MONTH_DESC,         YEAR_ID,         QUERY_OPTION  FROM TIME_PERIOD   ORDER BY 1,3  \"    ");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("DATA_TYPE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TIME_PERIOD") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("REPORT_YEAR_MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("MONTH_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("YEAR_ID")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("QUERY_OPTION") + "}]");
				log4jParamters_tOracleInput_26.append(" | ");
				log4jParamters_tOracleInput_26.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_26.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_26 - "
							+ log4jParamters_tOracleInput_26);

				int nb_line_tOracleInput_26 = 0;
				java.sql.Connection conn_tOracleInput_26 = null;
				String driverClass_tOracleInput_26 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_26);

				String url_tOracleInput_26 = null;
				url_tOracleInput_26 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_26 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_26 = context.dbPasswordPI;

				String dbPwd_tOracleInput_26 = decryptedPassword_tOracleInput_26;

				log.debug("tOracleInput_26 - Driver ClassName: "
						+ driverClass_tOracleInput_26 + ".");

				log.info("tOracleInput_26 - Connection attempt to '"
						+ url_tOracleInput_26 + "' with the username '"
						+ dbUser_tOracleInput_26 + "'.");

				conn_tOracleInput_26 = java.sql.DriverManager.getConnection(
						url_tOracleInput_26, dbUser_tOracleInput_26,
						dbPwd_tOracleInput_26);
				log.info("tOracleInput_26 - Connection to '"
						+ url_tOracleInput_26 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_26 = conn_tOracleInput_26
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_26 = stmtGetTZ_tOracleInput_26
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_26 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_26.next()) {
					sessionTimezone_tOracleInput_26 = rsGetTZ_tOracleInput_26
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_26)
						.setSessionTimeZone(sessionTimezone_tOracleInput_26);

				java.sql.Statement stmt_tOracleInput_26 = conn_tOracleInput_26
						.createStatement();

				String dbquery_tOracleInput_26 = "\nSELECT DATA_TYPE,\n       TIME_PERIOD,\n       REPORT_YEAR_MONTH, --REFERENCES NEW/USED/SALES FACT TABLES\n       MONTH_DESC,\n       YEAR_ID,\n       QUERY_OPTION\nFROM TIME_PERIOD \nORDER BY 1,3\n"

				;

				log.info("tOracleInput_26 - Executing the query: '"
						+ dbquery_tOracleInput_26 + "'.");

				globalMap.put("tOracleInput_26_QUERY", dbquery_tOracleInput_26);

				java.sql.ResultSet rs_tOracleInput_26 = null;
				try {
					rs_tOracleInput_26 = stmt_tOracleInput_26
							.executeQuery(dbquery_tOracleInput_26);
					java.sql.ResultSetMetaData rsmd_tOracleInput_26 = rs_tOracleInput_26
							.getMetaData();
					int colQtyInRs_tOracleInput_26 = rsmd_tOracleInput_26
							.getColumnCount();

					String tmpContent_tOracleInput_26 = null;

					log.info("tOracleInput_26 - Retrieving records from the database.");

					while (rs_tOracleInput_26.next()) {
						nb_line_tOracleInput_26++;

						if (colQtyInRs_tOracleInput_26 < 1) {
							row28.DATA_TYPE = null;
						} else {

							tmpContent_tOracleInput_26 = rs_tOracleInput_26
									.getString(1);
							if (tmpContent_tOracleInput_26 != null) {
								row28.DATA_TYPE = tmpContent_tOracleInput_26;
							} else {
								row28.DATA_TYPE = null;
							}
						}
						if (colQtyInRs_tOracleInput_26 < 2) {
							row28.TIME_PERIOD = null;
						} else {

							tmpContent_tOracleInput_26 = rs_tOracleInput_26
									.getString(2);
							if (tmpContent_tOracleInput_26 != null) {
								row28.TIME_PERIOD = tmpContent_tOracleInput_26;
							} else {
								row28.TIME_PERIOD = null;
							}
						}
						if (colQtyInRs_tOracleInput_26 < 3) {
							row28.REPORT_YEAR_MONTH = null;
						} else {

							tmpContent_tOracleInput_26 = rs_tOracleInput_26
									.getString(3);
							if (tmpContent_tOracleInput_26 != null) {
								row28.REPORT_YEAR_MONTH = tmpContent_tOracleInput_26;
							} else {
								row28.REPORT_YEAR_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_26 < 4) {
							row28.MONTH_DESC = null;
						} else {

							tmpContent_tOracleInput_26 = rs_tOracleInput_26
									.getString(4);
							if (tmpContent_tOracleInput_26 != null) {
								row28.MONTH_DESC = tmpContent_tOracleInput_26;
							} else {
								row28.MONTH_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_26 < 5) {
							row28.YEAR_ID = null;
						} else {

							tmpContent_tOracleInput_26 = rs_tOracleInput_26
									.getString(5);
							if (tmpContent_tOracleInput_26 != null) {
								row28.YEAR_ID = tmpContent_tOracleInput_26;
							} else {
								row28.YEAR_ID = null;
							}
						}
						if (colQtyInRs_tOracleInput_26 < 6) {
							row28.QUERY_OPTION = null;
						} else {

							tmpContent_tOracleInput_26 = rs_tOracleInput_26
									.getString(6);
							if (tmpContent_tOracleInput_26 != null) {
								row28.QUERY_OPTION = tmpContent_tOracleInput_26;
							} else {
								row28.QUERY_OPTION = null;
							}
						}

						log.debug("tOracleInput_26 - Retrieving the record "
								+ nb_line_tOracleInput_26 + ".");

						/**
						 * [tOracleInput_26 begin ] stop
						 */

						/**
						 * [tOracleInput_26 main ] start
						 */

						currentComponent = "tOracleInput_26";

						tos_count_tOracleInput_26++;

						/**
						 * [tOracleInput_26 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_25 main ] start
						 */

						currentComponent = "tFileOutputDelimited_25";

						if (log.isTraceEnabled()) {
							log.trace("row28 - "
									+ (row28 == null ? "" : row28.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_25 = new StringBuilder();
						if (row28.DATA_TYPE != null) {
							sb_tFileOutputDelimited_25.append(row28.DATA_TYPE);
						}
						sb_tFileOutputDelimited_25
								.append(OUT_DELIM_tFileOutputDelimited_25);
						if (row28.TIME_PERIOD != null) {
							sb_tFileOutputDelimited_25
									.append(row28.TIME_PERIOD);
						}
						sb_tFileOutputDelimited_25
								.append(OUT_DELIM_tFileOutputDelimited_25);
						if (row28.REPORT_YEAR_MONTH != null) {
							sb_tFileOutputDelimited_25
									.append(row28.REPORT_YEAR_MONTH);
						}
						sb_tFileOutputDelimited_25
								.append(OUT_DELIM_tFileOutputDelimited_25);
						if (row28.MONTH_DESC != null) {
							sb_tFileOutputDelimited_25.append(row28.MONTH_DESC);
						}
						sb_tFileOutputDelimited_25
								.append(OUT_DELIM_tFileOutputDelimited_25);
						if (row28.YEAR_ID != null) {
							sb_tFileOutputDelimited_25.append(row28.YEAR_ID);
						}
						sb_tFileOutputDelimited_25
								.append(OUT_DELIM_tFileOutputDelimited_25);
						if (row28.QUERY_OPTION != null) {
							sb_tFileOutputDelimited_25
									.append(row28.QUERY_OPTION);
						}
						sb_tFileOutputDelimited_25
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_25);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_25++;
							resourceMap.put("nb_line_tFileOutputDelimited_25",
									nb_line_tFileOutputDelimited_25);

							outtFileOutputDelimited_25
									.write(sb_tFileOutputDelimited_25
											.toString());
							log.debug("tFileOutputDelimited_25 - Writing the record "
									+ nb_line_tFileOutputDelimited_25 + ".");

						}

						tos_count_tFileOutputDelimited_25++;

						/**
						 * [tFileOutputDelimited_25 main ] stop
						 */

						/**
						 * [tOracleInput_26 end ] start
						 */

						currentComponent = "tOracleInput_26";

					}
				} finally {
					stmt_tOracleInput_26.close();

					if (conn_tOracleInput_26 != null
							&& !conn_tOracleInput_26.isClosed()) {

						log.info("tOracleInput_26 - Closing the connection to the database.");

						conn_tOracleInput_26.close();

						log.info("tOracleInput_26 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_26_NB_LINE",
						nb_line_tOracleInput_26);
				log.info("tOracleInput_26 - Retrieved records count: "
						+ nb_line_tOracleInput_26 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_26 - " + "Done.");

				ok_Hash.put("tOracleInput_26", true);
				end_Hash.put("tOracleInput_26", System.currentTimeMillis());

				/**
				 * [tOracleInput_26 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_25 end ] start
				 */

				currentComponent = "tFileOutputDelimited_25";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_25 != null) {
						outtFileOutputDelimited_25.flush();
						outtFileOutputDelimited_25.close();
					}

					globalMap.put("tFileOutputDelimited_25_NB_LINE",
							nb_line_tFileOutputDelimited_25);
					globalMap.put("tFileOutputDelimited_25_FILE_NAME",
							fileName_tFileOutputDelimited_25);

				}

				resourceMap.put("finish_tFileOutputDelimited_25", true);

				log.info("tFileOutputDelimited_25 - Written records count: "
						+ nb_line_tFileOutputDelimited_25 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_25 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_25", true);
				end_Hash.put("tFileOutputDelimited_25",
						System.currentTimeMillis());

				tOracleInput_32Process(globalMap);

				/**
				 * [tFileOutputDelimited_25 end ] stop
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
				 * [tOracleInput_26 finally ] start
				 */

				currentComponent = "tOracleInput_26";

				/**
				 * [tOracleInput_26 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_25 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_25";

				if (resourceMap.get("finish_tFileOutputDelimited_25") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_25 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_25");
						if (outtFileOutputDelimited_25 != null) {
							outtFileOutputDelimited_25.flush();
							outtFileOutputDelimited_25.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_25 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_26_SUBPROCESS_STATE", 1);
	}

	public static class row34Struct implements
			routines.system.IPersistableRow<row34Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String TRACTZIP_SAKEY;

		public String getTRACTZIP_SAKEY() {
			return this.TRACTZIP_SAKEY;
		}

		public String CBSA_MARKET_CODE;

		public String getCBSA_MARKET_CODE() {
			return this.CBSA_MARKET_CODE;
		}

		public String CBSA_MARKET_NAME;

		public String getCBSA_MARKET_NAME() {
			return this.CBSA_MARKET_NAME;
		}

		public String DMA_NAME;

		public String getDMA_NAME() {
			return this.DMA_NAME;
		}

		public String FZN_ZIP;

		public String getFZN_ZIP() {
			return this.FZN_ZIP;
		}

		public String ZIP_TOWN;

		public String getZIP_TOWN() {
			return this.ZIP_TOWN;
		}

		public String CT_NATION_NAME;

		public String getCT_NATION_NAME() {
			return this.CT_NATION_NAME;
		}

		public String CT_STATE_NAME;

		public String getCT_STATE_NAME() {
			return this.CT_STATE_NAME;
		}

		public String CT_COUNTY_NAME;

		public String getCT_COUNTY_NAME() {
			return this.CT_COUNTY_NAME;
		}

		public String TRC_KEY;

		public String getTRC_KEY() {
			return this.TRC_KEY;
		}

		public String CT_STATE_ABBRV;

		public String getCT_STATE_ABBRV() {
			return this.CT_STATE_ABBRV;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.TRACTZIP_SAKEY = readString(dis);

					this.CBSA_MARKET_CODE = readString(dis);

					this.CBSA_MARKET_NAME = readString(dis);

					this.DMA_NAME = readString(dis);

					this.FZN_ZIP = readString(dis);

					this.ZIP_TOWN = readString(dis);

					this.CT_NATION_NAME = readString(dis);

					this.CT_STATE_NAME = readString(dis);

					this.CT_COUNTY_NAME = readString(dis);

					this.TRC_KEY = readString(dis);

					this.CT_STATE_ABBRV = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TRACTZIP_SAKEY, dos);

				// String

				writeString(this.CBSA_MARKET_CODE, dos);

				// String

				writeString(this.CBSA_MARKET_NAME, dos);

				// String

				writeString(this.DMA_NAME, dos);

				// String

				writeString(this.FZN_ZIP, dos);

				// String

				writeString(this.ZIP_TOWN, dos);

				// String

				writeString(this.CT_NATION_NAME, dos);

				// String

				writeString(this.CT_STATE_NAME, dos);

				// String

				writeString(this.CT_COUNTY_NAME, dos);

				// String

				writeString(this.TRC_KEY, dos);

				// String

				writeString(this.CT_STATE_ABBRV, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRACTZIP_SAKEY=" + TRACTZIP_SAKEY);
			sb.append(",CBSA_MARKET_CODE=" + CBSA_MARKET_CODE);
			sb.append(",CBSA_MARKET_NAME=" + CBSA_MARKET_NAME);
			sb.append(",DMA_NAME=" + DMA_NAME);
			sb.append(",FZN_ZIP=" + FZN_ZIP);
			sb.append(",ZIP_TOWN=" + ZIP_TOWN);
			sb.append(",CT_NATION_NAME=" + CT_NATION_NAME);
			sb.append(",CT_STATE_NAME=" + CT_STATE_NAME);
			sb.append(",CT_COUNTY_NAME=" + CT_COUNTY_NAME);
			sb.append(",TRC_KEY=" + TRC_KEY);
			sb.append(",CT_STATE_ABBRV=" + CT_STATE_ABBRV);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TRACTZIP_SAKEY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRACTZIP_SAKEY);
			}

			sb.append("|");

			if (CBSA_MARKET_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSA_MARKET_CODE);
			}

			sb.append("|");

			if (CBSA_MARKET_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSA_MARKET_NAME);
			}

			sb.append("|");

			if (DMA_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(DMA_NAME);
			}

			sb.append("|");

			if (FZN_ZIP == null) {
				sb.append("<null>");
			} else {
				sb.append(FZN_ZIP);
			}

			sb.append("|");

			if (ZIP_TOWN == null) {
				sb.append("<null>");
			} else {
				sb.append(ZIP_TOWN);
			}

			sb.append("|");

			if (CT_NATION_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(CT_NATION_NAME);
			}

			sb.append("|");

			if (CT_STATE_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(CT_STATE_NAME);
			}

			sb.append("|");

			if (CT_COUNTY_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(CT_COUNTY_NAME);
			}

			sb.append("|");

			if (TRC_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRC_KEY);
			}

			sb.append("|");

			if (CT_STATE_ABBRV == null) {
				sb.append("<null>");
			} else {
				sb.append(CT_STATE_ABBRV);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row34Struct other) {

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

	public void tOracleInput_32Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_32_SUBPROCESS_STATE", 0);

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

				row34Struct row34 = new row34Struct();

				/**
				 * [tFileOutputDelimited_31 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_31", false);
				start_Hash.put("tFileOutputDelimited_31",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_31";

				int tos_count_tFileOutputDelimited_31 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_31 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_31 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_31.append("Parameters:");
				log4jParamters_tFileOutputDelimited_31.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_STANDARD_GEOGRAPHY_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				log4jParamters_tFileOutputDelimited_31
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_31.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_31 - "
							+ log4jParamters_tFileOutputDelimited_31);

				String fileName_tFileOutputDelimited_31 = "";
				fileName_tFileOutputDelimited_31 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_STANDARD_GEOGRAPHY_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_31 = null;
				String extension_tFileOutputDelimited_31 = null;
				String directory_tFileOutputDelimited_31 = null;
				if ((fileName_tFileOutputDelimited_31.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_31.lastIndexOf(".") < fileName_tFileOutputDelimited_31
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_31 = fileName_tFileOutputDelimited_31;
						extension_tFileOutputDelimited_31 = "";
					} else {
						fullName_tFileOutputDelimited_31 = fileName_tFileOutputDelimited_31
								.substring(0, fileName_tFileOutputDelimited_31
										.lastIndexOf("."));
						extension_tFileOutputDelimited_31 = fileName_tFileOutputDelimited_31
								.substring(fileName_tFileOutputDelimited_31
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_31 = fileName_tFileOutputDelimited_31
							.substring(0, fileName_tFileOutputDelimited_31
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_31.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_31 = fileName_tFileOutputDelimited_31
								.substring(0, fileName_tFileOutputDelimited_31
										.lastIndexOf("."));
						extension_tFileOutputDelimited_31 = fileName_tFileOutputDelimited_31
								.substring(fileName_tFileOutputDelimited_31
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_31 = fileName_tFileOutputDelimited_31;
						extension_tFileOutputDelimited_31 = "";
					}
					directory_tFileOutputDelimited_31 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_31 = true;
				java.io.File filetFileOutputDelimited_31 = new java.io.File(
						fileName_tFileOutputDelimited_31);
				globalMap.put("tFileOutputDelimited_31_FILE_NAME",
						fileName_tFileOutputDelimited_31);
				int nb_line_tFileOutputDelimited_31 = 0;
				int splitEvery_tFileOutputDelimited_31 = 1000;
				int splitedFileNo_tFileOutputDelimited_31 = 0;
				int currentRow_tFileOutputDelimited_31 = 0;

				final String OUT_DELIM_tFileOutputDelimited_31 = /**
				 * Start field
				 * tFileOutputDelimited_31:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_31:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_31 = /**
				 * Start
				 * field tFileOutputDelimited_31:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_31:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_31 != null
						&& directory_tFileOutputDelimited_31.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_31 = new java.io.File(
							directory_tFileOutputDelimited_31);
					if (!dir_tFileOutputDelimited_31.exists()) {
						log.info("tFileOutputDelimited_31 - Creating directory '"
								+ dir_tFileOutputDelimited_31
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_31.mkdirs();
						log.info("tFileOutputDelimited_31 - The directory '"
								+ dir_tFileOutputDelimited_31
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_31 = null;

				java.io.File fileToDelete_tFileOutputDelimited_31 = new java.io.File(
						fileName_tFileOutputDelimited_31);
				if (fileToDelete_tFileOutputDelimited_31.exists()) {
					fileToDelete_tFileOutputDelimited_31.delete();
				}
				outtFileOutputDelimited_31 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_31, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_31.length() == 0) {
						outtFileOutputDelimited_31.write("TRACTZIP_SAKEY");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("CBSA_MARKET_CODE");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("CBSA_MARKET_NAME");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("DMA_NAME");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("FZN_ZIP");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("ZIP_TOWN");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("CT_NATION_NAME");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("CT_STATE_NAME");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("CT_COUNTY_NAME");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("TRC_KEY");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.write("CT_STATE_ABBRV");
						outtFileOutputDelimited_31
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_31);
						outtFileOutputDelimited_31.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_31",
						outtFileOutputDelimited_31);
				resourceMap.put("nb_line_tFileOutputDelimited_31",
						nb_line_tFileOutputDelimited_31);

				/**
				 * [tFileOutputDelimited_31 begin ] stop
				 */

				/**
				 * [tOracleInput_32 begin ] start
				 */

				ok_Hash.put("tOracleInput_32", false);
				start_Hash.put("tOracleInput_32", System.currentTimeMillis());

				currentComponent = "tOracleInput_32";

				int tos_count_tOracleInput_32 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_32 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_32 = new StringBuilder();
				log4jParamters_tOracleInput_32.append("Parameters:");
				log4jParamters_tOracleInput_32.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32
						.append("QUERY"
								+ " = "
								+ "\"  SELECT TRACTZIP_SAKEY,--REFERENCES FACT TABLES         CBSA_MARKET_CODE,   	   CBSA_MARKET_NAME,	     	   DMA_NAME,         FZN_ZIP,         ZIP_TOWN,         	   CT_NATION_NAME, 	         CT_STATE_NAME,         	   CT_COUNTY_NAME,         TRC_KEY,          CT_STATE_ABBRV            FROM STANDARD_GEOGRAPHY  \"    ");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("TRACTZIP_SAKEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CBSA_MARKET_CODE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("CBSA_MARKET_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("DMA_NAME") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("FZN_ZIP")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ZIP_TOWN") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CT_NATION_NAME") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("CT_STATE_NAME")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("CT_COUNTY_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TRC_KEY") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("CT_STATE_ABBRV")
						+ "}]");
				log4jParamters_tOracleInput_32.append(" | ");
				log4jParamters_tOracleInput_32.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_32.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_32 - "
							+ log4jParamters_tOracleInput_32);

				int nb_line_tOracleInput_32 = 0;
				java.sql.Connection conn_tOracleInput_32 = null;
				String driverClass_tOracleInput_32 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_32);

				String url_tOracleInput_32 = null;
				url_tOracleInput_32 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_32 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_32 = context.dbPasswordPI;

				String dbPwd_tOracleInput_32 = decryptedPassword_tOracleInput_32;

				log.debug("tOracleInput_32 - Driver ClassName: "
						+ driverClass_tOracleInput_32 + ".");

				log.info("tOracleInput_32 - Connection attempt to '"
						+ url_tOracleInput_32 + "' with the username '"
						+ dbUser_tOracleInput_32 + "'.");

				conn_tOracleInput_32 = java.sql.DriverManager.getConnection(
						url_tOracleInput_32, dbUser_tOracleInput_32,
						dbPwd_tOracleInput_32);
				log.info("tOracleInput_32 - Connection to '"
						+ url_tOracleInput_32 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_32 = conn_tOracleInput_32
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_32 = stmtGetTZ_tOracleInput_32
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_32 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_32.next()) {
					sessionTimezone_tOracleInput_32 = rsGetTZ_tOracleInput_32
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_32)
						.setSessionTimeZone(sessionTimezone_tOracleInput_32);

				java.sql.Statement stmt_tOracleInput_32 = conn_tOracleInput_32
						.createStatement();

				String dbquery_tOracleInput_32 = "\nSELECT TRACTZIP_SAKEY,--REFERENCES FACT TABLES\n       CBSA_MARKET_CODE, \n	   CBSA_MARKET_NAME,	   \n	   DMA_NAME,\n       FZN_ZIP,\n       ZIP_TOWN,       \n	   CT_NATION_NAME, 	\n       CT_STATE_NAME,       \n	   CT_COUNTY_NAME,\n       TRC_KEY, \n       CT_STATE_ABBRV          \nFROM STANDARD_GEOGRAPHY\n"

				;

				log.info("tOracleInput_32 - Executing the query: '"
						+ dbquery_tOracleInput_32 + "'.");

				globalMap.put("tOracleInput_32_QUERY", dbquery_tOracleInput_32);

				java.sql.ResultSet rs_tOracleInput_32 = null;
				try {
					rs_tOracleInput_32 = stmt_tOracleInput_32
							.executeQuery(dbquery_tOracleInput_32);
					java.sql.ResultSetMetaData rsmd_tOracleInput_32 = rs_tOracleInput_32
							.getMetaData();
					int colQtyInRs_tOracleInput_32 = rsmd_tOracleInput_32
							.getColumnCount();

					String tmpContent_tOracleInput_32 = null;

					log.info("tOracleInput_32 - Retrieving records from the database.");

					while (rs_tOracleInput_32.next()) {
						nb_line_tOracleInput_32++;

						if (colQtyInRs_tOracleInput_32 < 1) {
							row34.TRACTZIP_SAKEY = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(1);
							if (tmpContent_tOracleInput_32 != null) {
								row34.TRACTZIP_SAKEY = tmpContent_tOracleInput_32;
							} else {
								row34.TRACTZIP_SAKEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 2) {
							row34.CBSA_MARKET_CODE = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(2);
							if (tmpContent_tOracleInput_32 != null) {
								row34.CBSA_MARKET_CODE = tmpContent_tOracleInput_32;
							} else {
								row34.CBSA_MARKET_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 3) {
							row34.CBSA_MARKET_NAME = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(3);
							if (tmpContent_tOracleInput_32 != null) {
								row34.CBSA_MARKET_NAME = tmpContent_tOracleInput_32;
							} else {
								row34.CBSA_MARKET_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 4) {
							row34.DMA_NAME = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(4);
							if (tmpContent_tOracleInput_32 != null) {
								row34.DMA_NAME = tmpContent_tOracleInput_32;
							} else {
								row34.DMA_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 5) {
							row34.FZN_ZIP = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(5);
							if (tmpContent_tOracleInput_32 != null) {
								row34.FZN_ZIP = tmpContent_tOracleInput_32;
							} else {
								row34.FZN_ZIP = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 6) {
							row34.ZIP_TOWN = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(6);
							if (tmpContent_tOracleInput_32 != null) {
								row34.ZIP_TOWN = tmpContent_tOracleInput_32;
							} else {
								row34.ZIP_TOWN = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 7) {
							row34.CT_NATION_NAME = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(7);
							if (tmpContent_tOracleInput_32 != null) {
								row34.CT_NATION_NAME = tmpContent_tOracleInput_32;
							} else {
								row34.CT_NATION_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 8) {
							row34.CT_STATE_NAME = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(8);
							if (tmpContent_tOracleInput_32 != null) {
								row34.CT_STATE_NAME = tmpContent_tOracleInput_32;
							} else {
								row34.CT_STATE_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 9) {
							row34.CT_COUNTY_NAME = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(9);
							if (tmpContent_tOracleInput_32 != null) {
								row34.CT_COUNTY_NAME = tmpContent_tOracleInput_32;
							} else {
								row34.CT_COUNTY_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 10) {
							row34.TRC_KEY = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(10);
							if (tmpContent_tOracleInput_32 != null) {
								row34.TRC_KEY = tmpContent_tOracleInput_32;
							} else {
								row34.TRC_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_32 < 11) {
							row34.CT_STATE_ABBRV = null;
						} else {

							tmpContent_tOracleInput_32 = rs_tOracleInput_32
									.getString(11);
							if (tmpContent_tOracleInput_32 != null) {
								row34.CT_STATE_ABBRV = tmpContent_tOracleInput_32;
							} else {
								row34.CT_STATE_ABBRV = null;
							}
						}

						log.debug("tOracleInput_32 - Retrieving the record "
								+ nb_line_tOracleInput_32 + ".");

						/**
						 * [tOracleInput_32 begin ] stop
						 */

						/**
						 * [tOracleInput_32 main ] start
						 */

						currentComponent = "tOracleInput_32";

						tos_count_tOracleInput_32++;

						/**
						 * [tOracleInput_32 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_31 main ] start
						 */

						currentComponent = "tFileOutputDelimited_31";

						if (log.isTraceEnabled()) {
							log.trace("row34 - "
									+ (row34 == null ? "" : row34.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_31 = new StringBuilder();
						if (row34.TRACTZIP_SAKEY != null) {
							sb_tFileOutputDelimited_31
									.append(row34.TRACTZIP_SAKEY);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.CBSA_MARKET_CODE != null) {
							sb_tFileOutputDelimited_31
									.append(row34.CBSA_MARKET_CODE);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.CBSA_MARKET_NAME != null) {
							sb_tFileOutputDelimited_31
									.append(row34.CBSA_MARKET_NAME);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.DMA_NAME != null) {
							sb_tFileOutputDelimited_31.append(row34.DMA_NAME);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.FZN_ZIP != null) {
							sb_tFileOutputDelimited_31.append(row34.FZN_ZIP);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.ZIP_TOWN != null) {
							sb_tFileOutputDelimited_31.append(row34.ZIP_TOWN);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.CT_NATION_NAME != null) {
							sb_tFileOutputDelimited_31
									.append(row34.CT_NATION_NAME);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.CT_STATE_NAME != null) {
							sb_tFileOutputDelimited_31
									.append(row34.CT_STATE_NAME);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.CT_COUNTY_NAME != null) {
							sb_tFileOutputDelimited_31
									.append(row34.CT_COUNTY_NAME);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.TRC_KEY != null) {
							sb_tFileOutputDelimited_31.append(row34.TRC_KEY);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_tFileOutputDelimited_31);
						if (row34.CT_STATE_ABBRV != null) {
							sb_tFileOutputDelimited_31
									.append(row34.CT_STATE_ABBRV);
						}
						sb_tFileOutputDelimited_31
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_31);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_31++;
							resourceMap.put("nb_line_tFileOutputDelimited_31",
									nb_line_tFileOutputDelimited_31);

							outtFileOutputDelimited_31
									.write(sb_tFileOutputDelimited_31
											.toString());
							log.debug("tFileOutputDelimited_31 - Writing the record "
									+ nb_line_tFileOutputDelimited_31 + ".");

						}

						tos_count_tFileOutputDelimited_31++;

						/**
						 * [tFileOutputDelimited_31 main ] stop
						 */

						/**
						 * [tOracleInput_32 end ] start
						 */

						currentComponent = "tOracleInput_32";

					}
				} finally {
					stmt_tOracleInput_32.close();

					if (conn_tOracleInput_32 != null
							&& !conn_tOracleInput_32.isClosed()) {

						log.info("tOracleInput_32 - Closing the connection to the database.");

						conn_tOracleInput_32.close();

						log.info("tOracleInput_32 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_32_NB_LINE",
						nb_line_tOracleInput_32);
				log.info("tOracleInput_32 - Retrieved records count: "
						+ nb_line_tOracleInput_32 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_32 - " + "Done.");

				ok_Hash.put("tOracleInput_32", true);
				end_Hash.put("tOracleInput_32", System.currentTimeMillis());

				/**
				 * [tOracleInput_32 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_31 end ] start
				 */

				currentComponent = "tFileOutputDelimited_31";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_31 != null) {
						outtFileOutputDelimited_31.flush();
						outtFileOutputDelimited_31.close();
					}

					globalMap.put("tFileOutputDelimited_31_NB_LINE",
							nb_line_tFileOutputDelimited_31);
					globalMap.put("tFileOutputDelimited_31_FILE_NAME",
							fileName_tFileOutputDelimited_31);

				}

				resourceMap.put("finish_tFileOutputDelimited_31", true);

				log.info("tFileOutputDelimited_31 - Written records count: "
						+ nb_line_tFileOutputDelimited_31 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_31 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_31", true);
				end_Hash.put("tFileOutputDelimited_31",
						System.currentTimeMillis());

				tOracleInput_34Process(globalMap);

				/**
				 * [tFileOutputDelimited_31 end ] stop
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
				 * [tOracleInput_32 finally ] start
				 */

				currentComponent = "tOracleInput_32";

				/**
				 * [tOracleInput_32 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_31 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_31";

				if (resourceMap.get("finish_tFileOutputDelimited_31") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_31 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_31");
						if (outtFileOutputDelimited_31 != null) {
							outtFileOutputDelimited_31.flush();
							outtFileOutputDelimited_31.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_31 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_32_SUBPROCESS_STATE", 1);
	}

	public static class row36Struct implements
			routines.system.IPersistableRow<row36Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String TRGT_INC;

		public String getTRGT_INC() {
			return this.TRGT_INC;
		}

		public String TRGT_INC_DESC;

		public String getTRGT_INC_DESC() {
			return this.TRGT_INC_DESC;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.TRGT_INC = readString(dis);

					this.TRGT_INC_DESC = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TRGT_INC, dos);

				// String

				writeString(this.TRGT_INC_DESC, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRGT_INC=" + TRGT_INC);
			sb.append(",TRGT_INC_DESC=" + TRGT_INC_DESC);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TRGT_INC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRGT_INC);
			}

			sb.append("|");

			if (TRGT_INC_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRGT_INC_DESC);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row36Struct other) {

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

	public void tOracleInput_34Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_34_SUBPROCESS_STATE", 0);

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

				row36Struct row36 = new row36Struct();

				/**
				 * [tFileOutputDelimited_33 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_33", false);
				start_Hash.put("tFileOutputDelimited_33",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_33";

				int tos_count_tFileOutputDelimited_33 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_33 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_33 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_33.append("Parameters:");
				log4jParamters_tFileOutputDelimited_33.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_TARGET_INCOME_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				log4jParamters_tFileOutputDelimited_33
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_33.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_33 - "
							+ log4jParamters_tFileOutputDelimited_33);

				String fileName_tFileOutputDelimited_33 = "";
				fileName_tFileOutputDelimited_33 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth + "/FORD_TARGET_INCOME_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_33 = null;
				String extension_tFileOutputDelimited_33 = null;
				String directory_tFileOutputDelimited_33 = null;
				if ((fileName_tFileOutputDelimited_33.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_33.lastIndexOf(".") < fileName_tFileOutputDelimited_33
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_33 = fileName_tFileOutputDelimited_33;
						extension_tFileOutputDelimited_33 = "";
					} else {
						fullName_tFileOutputDelimited_33 = fileName_tFileOutputDelimited_33
								.substring(0, fileName_tFileOutputDelimited_33
										.lastIndexOf("."));
						extension_tFileOutputDelimited_33 = fileName_tFileOutputDelimited_33
								.substring(fileName_tFileOutputDelimited_33
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_33 = fileName_tFileOutputDelimited_33
							.substring(0, fileName_tFileOutputDelimited_33
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_33.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_33 = fileName_tFileOutputDelimited_33
								.substring(0, fileName_tFileOutputDelimited_33
										.lastIndexOf("."));
						extension_tFileOutputDelimited_33 = fileName_tFileOutputDelimited_33
								.substring(fileName_tFileOutputDelimited_33
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_33 = fileName_tFileOutputDelimited_33;
						extension_tFileOutputDelimited_33 = "";
					}
					directory_tFileOutputDelimited_33 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_33 = true;
				java.io.File filetFileOutputDelimited_33 = new java.io.File(
						fileName_tFileOutputDelimited_33);
				globalMap.put("tFileOutputDelimited_33_FILE_NAME",
						fileName_tFileOutputDelimited_33);
				int nb_line_tFileOutputDelimited_33 = 0;
				int splitEvery_tFileOutputDelimited_33 = 1000;
				int splitedFileNo_tFileOutputDelimited_33 = 0;
				int currentRow_tFileOutputDelimited_33 = 0;

				final String OUT_DELIM_tFileOutputDelimited_33 = /**
				 * Start field
				 * tFileOutputDelimited_33:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_33:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_33 = /**
				 * Start
				 * field tFileOutputDelimited_33:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_33:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_33 != null
						&& directory_tFileOutputDelimited_33.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_33 = new java.io.File(
							directory_tFileOutputDelimited_33);
					if (!dir_tFileOutputDelimited_33.exists()) {
						log.info("tFileOutputDelimited_33 - Creating directory '"
								+ dir_tFileOutputDelimited_33
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_33.mkdirs();
						log.info("tFileOutputDelimited_33 - The directory '"
								+ dir_tFileOutputDelimited_33
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_33 = null;

				java.io.File fileToDelete_tFileOutputDelimited_33 = new java.io.File(
						fileName_tFileOutputDelimited_33);
				if (fileToDelete_tFileOutputDelimited_33.exists()) {
					fileToDelete_tFileOutputDelimited_33.delete();
				}
				outtFileOutputDelimited_33 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_33, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_33.length() == 0) {
						outtFileOutputDelimited_33.write("TRGT_INC");
						outtFileOutputDelimited_33
								.write(OUT_DELIM_tFileOutputDelimited_33);
						outtFileOutputDelimited_33.write("TRGT_INC_DESC");
						outtFileOutputDelimited_33
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_33);
						outtFileOutputDelimited_33.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_33",
						outtFileOutputDelimited_33);
				resourceMap.put("nb_line_tFileOutputDelimited_33",
						nb_line_tFileOutputDelimited_33);

				/**
				 * [tFileOutputDelimited_33 begin ] stop
				 */

				/**
				 * [tOracleInput_34 begin ] start
				 */

				ok_Hash.put("tOracleInput_34", false);
				start_Hash.put("tOracleInput_34", System.currentTimeMillis());

				currentComponent = "tOracleInput_34";

				int tos_count_tOracleInput_34 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_34 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_34 = new StringBuilder();
				log4jParamters_tOracleInput_34.append("Parameters:");
				log4jParamters_tOracleInput_34.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34
						.append("QUERY"
								+ " = "
								+ "\"  SELECT TRGT_INC, -- REFERENCES FACT TABLES         TRGT_INC_DESC  FROM HDS_TARGET_INCOME  ORDER BY 1  \"    ");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("TRGT_INC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TRGT_INC_DESC") + "}]");
				log4jParamters_tOracleInput_34.append(" | ");
				log4jParamters_tOracleInput_34.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_34.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_34 - "
							+ log4jParamters_tOracleInput_34);

				int nb_line_tOracleInput_34 = 0;
				java.sql.Connection conn_tOracleInput_34 = null;
				String driverClass_tOracleInput_34 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_34);

				String url_tOracleInput_34 = null;
				url_tOracleInput_34 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_34 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_34 = context.dbPasswordPI;

				String dbPwd_tOracleInput_34 = decryptedPassword_tOracleInput_34;

				log.debug("tOracleInput_34 - Driver ClassName: "
						+ driverClass_tOracleInput_34 + ".");

				log.info("tOracleInput_34 - Connection attempt to '"
						+ url_tOracleInput_34 + "' with the username '"
						+ dbUser_tOracleInput_34 + "'.");

				conn_tOracleInput_34 = java.sql.DriverManager.getConnection(
						url_tOracleInput_34, dbUser_tOracleInput_34,
						dbPwd_tOracleInput_34);
				log.info("tOracleInput_34 - Connection to '"
						+ url_tOracleInput_34 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_34 = conn_tOracleInput_34
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_34 = stmtGetTZ_tOracleInput_34
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_34 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_34.next()) {
					sessionTimezone_tOracleInput_34 = rsGetTZ_tOracleInput_34
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_34)
						.setSessionTimeZone(sessionTimezone_tOracleInput_34);

				java.sql.Statement stmt_tOracleInput_34 = conn_tOracleInput_34
						.createStatement();

				String dbquery_tOracleInput_34 = "\nSELECT TRGT_INC, -- REFERENCES FACT TABLES\n       TRGT_INC_DESC\nFROM HDS_TARGET_INCOME\nORDER BY 1\n"

				;

				log.info("tOracleInput_34 - Executing the query: '"
						+ dbquery_tOracleInput_34 + "'.");

				globalMap.put("tOracleInput_34_QUERY", dbquery_tOracleInput_34);

				java.sql.ResultSet rs_tOracleInput_34 = null;
				try {
					rs_tOracleInput_34 = stmt_tOracleInput_34
							.executeQuery(dbquery_tOracleInput_34);
					java.sql.ResultSetMetaData rsmd_tOracleInput_34 = rs_tOracleInput_34
							.getMetaData();
					int colQtyInRs_tOracleInput_34 = rsmd_tOracleInput_34
							.getColumnCount();

					String tmpContent_tOracleInput_34 = null;

					log.info("tOracleInput_34 - Retrieving records from the database.");

					while (rs_tOracleInput_34.next()) {
						nb_line_tOracleInput_34++;

						if (colQtyInRs_tOracleInput_34 < 1) {
							row36.TRGT_INC = null;
						} else {

							tmpContent_tOracleInput_34 = rs_tOracleInput_34
									.getString(1);
							if (tmpContent_tOracleInput_34 != null) {
								row36.TRGT_INC = tmpContent_tOracleInput_34;
							} else {
								row36.TRGT_INC = null;
							}
						}
						if (colQtyInRs_tOracleInput_34 < 2) {
							row36.TRGT_INC_DESC = null;
						} else {

							tmpContent_tOracleInput_34 = rs_tOracleInput_34
									.getString(2);
							if (tmpContent_tOracleInput_34 != null) {
								row36.TRGT_INC_DESC = tmpContent_tOracleInput_34;
							} else {
								row36.TRGT_INC_DESC = null;
							}
						}

						log.debug("tOracleInput_34 - Retrieving the record "
								+ nb_line_tOracleInput_34 + ".");

						/**
						 * [tOracleInput_34 begin ] stop
						 */

						/**
						 * [tOracleInput_34 main ] start
						 */

						currentComponent = "tOracleInput_34";

						tos_count_tOracleInput_34++;

						/**
						 * [tOracleInput_34 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_33 main ] start
						 */

						currentComponent = "tFileOutputDelimited_33";

						if (log.isTraceEnabled()) {
							log.trace("row36 - "
									+ (row36 == null ? "" : row36.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_33 = new StringBuilder();
						if (row36.TRGT_INC != null) {
							sb_tFileOutputDelimited_33.append(row36.TRGT_INC);
						}
						sb_tFileOutputDelimited_33
								.append(OUT_DELIM_tFileOutputDelimited_33);
						if (row36.TRGT_INC_DESC != null) {
							sb_tFileOutputDelimited_33
									.append(row36.TRGT_INC_DESC);
						}
						sb_tFileOutputDelimited_33
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_33);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_33++;
							resourceMap.put("nb_line_tFileOutputDelimited_33",
									nb_line_tFileOutputDelimited_33);

							outtFileOutputDelimited_33
									.write(sb_tFileOutputDelimited_33
											.toString());
							log.debug("tFileOutputDelimited_33 - Writing the record "
									+ nb_line_tFileOutputDelimited_33 + ".");

						}

						tos_count_tFileOutputDelimited_33++;

						/**
						 * [tFileOutputDelimited_33 main ] stop
						 */

						/**
						 * [tOracleInput_34 end ] start
						 */

						currentComponent = "tOracleInput_34";

					}
				} finally {
					stmt_tOracleInput_34.close();

					if (conn_tOracleInput_34 != null
							&& !conn_tOracleInput_34.isClosed()) {

						log.info("tOracleInput_34 - Closing the connection to the database.");

						conn_tOracleInput_34.close();

						log.info("tOracleInput_34 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_34_NB_LINE",
						nb_line_tOracleInput_34);
				log.info("tOracleInput_34 - Retrieved records count: "
						+ nb_line_tOracleInput_34 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_34 - " + "Done.");

				ok_Hash.put("tOracleInput_34", true);
				end_Hash.put("tOracleInput_34", System.currentTimeMillis());

				/**
				 * [tOracleInput_34 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_33 end ] start
				 */

				currentComponent = "tFileOutputDelimited_33";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_33 != null) {
						outtFileOutputDelimited_33.flush();
						outtFileOutputDelimited_33.close();
					}

					globalMap.put("tFileOutputDelimited_33_NB_LINE",
							nb_line_tFileOutputDelimited_33);
					globalMap.put("tFileOutputDelimited_33_FILE_NAME",
							fileName_tFileOutputDelimited_33);

				}

				resourceMap.put("finish_tFileOutputDelimited_33", true);

				log.info("tFileOutputDelimited_33 - Written records count: "
						+ nb_line_tFileOutputDelimited_33 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_33 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_33", true);
				end_Hash.put("tFileOutputDelimited_33",
						System.currentTimeMillis());

				tOracleInput_36Process(globalMap);

				/**
				 * [tFileOutputDelimited_33 end ] stop
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
				 * [tOracleInput_34 finally ] start
				 */

				currentComponent = "tOracleInput_34";

				/**
				 * [tOracleInput_34 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_33 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_33";

				if (resourceMap.get("finish_tFileOutputDelimited_33") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_33 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_33");
						if (outtFileOutputDelimited_33 != null) {
							outtFileOutputDelimited_33.flush();
							outtFileOutputDelimited_33.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_33 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_34_SUBPROCESS_STATE", 1);
	}

	public static class row38Struct implements
			routines.system.IPersistableRow<row38Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String VEH_AGE;

		public String getVEH_AGE() {
			return this.VEH_AGE;
		}

		public String VEH_AGE_BAND;

		public String getVEH_AGE_BAND() {
			return this.VEH_AGE_BAND;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.VEH_AGE = readString(dis);

					this.VEH_AGE_BAND = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.VEH_AGE, dos);

				// String

				writeString(this.VEH_AGE_BAND, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("VEH_AGE=" + VEH_AGE);
			sb.append(",VEH_AGE_BAND=" + VEH_AGE_BAND);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (VEH_AGE == null) {
				sb.append("<null>");
			} else {
				sb.append(VEH_AGE);
			}

			sb.append("|");

			if (VEH_AGE_BAND == null) {
				sb.append("<null>");
			} else {
				sb.append(VEH_AGE_BAND);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row38Struct other) {

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

	public void tOracleInput_36Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_36_SUBPROCESS_STATE", 0);

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

				row38Struct row38 = new row38Struct();

				/**
				 * [tFileOutputDelimited_35 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_35", false);
				start_Hash.put("tFileOutputDelimited_35",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_35";

				int tos_count_tFileOutputDelimited_35 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_35 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_35 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_35.append("Parameters:");
				log4jParamters_tFileOutputDelimited_35.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_VEH_AGE_BAND_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				log4jParamters_tFileOutputDelimited_35
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_35.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_35 - "
							+ log4jParamters_tFileOutputDelimited_35);

				String fileName_tFileOutputDelimited_35 = "";
				fileName_tFileOutputDelimited_35 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth + "/FORD_VEH_AGE_BAND_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_35 = null;
				String extension_tFileOutputDelimited_35 = null;
				String directory_tFileOutputDelimited_35 = null;
				if ((fileName_tFileOutputDelimited_35.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_35.lastIndexOf(".") < fileName_tFileOutputDelimited_35
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_35 = fileName_tFileOutputDelimited_35;
						extension_tFileOutputDelimited_35 = "";
					} else {
						fullName_tFileOutputDelimited_35 = fileName_tFileOutputDelimited_35
								.substring(0, fileName_tFileOutputDelimited_35
										.lastIndexOf("."));
						extension_tFileOutputDelimited_35 = fileName_tFileOutputDelimited_35
								.substring(fileName_tFileOutputDelimited_35
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_35 = fileName_tFileOutputDelimited_35
							.substring(0, fileName_tFileOutputDelimited_35
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_35.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_35 = fileName_tFileOutputDelimited_35
								.substring(0, fileName_tFileOutputDelimited_35
										.lastIndexOf("."));
						extension_tFileOutputDelimited_35 = fileName_tFileOutputDelimited_35
								.substring(fileName_tFileOutputDelimited_35
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_35 = fileName_tFileOutputDelimited_35;
						extension_tFileOutputDelimited_35 = "";
					}
					directory_tFileOutputDelimited_35 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_35 = true;
				java.io.File filetFileOutputDelimited_35 = new java.io.File(
						fileName_tFileOutputDelimited_35);
				globalMap.put("tFileOutputDelimited_35_FILE_NAME",
						fileName_tFileOutputDelimited_35);
				int nb_line_tFileOutputDelimited_35 = 0;
				int splitEvery_tFileOutputDelimited_35 = 1000;
				int splitedFileNo_tFileOutputDelimited_35 = 0;
				int currentRow_tFileOutputDelimited_35 = 0;

				final String OUT_DELIM_tFileOutputDelimited_35 = /**
				 * Start field
				 * tFileOutputDelimited_35:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_35:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_35 = /**
				 * Start
				 * field tFileOutputDelimited_35:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_35:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_35 != null
						&& directory_tFileOutputDelimited_35.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_35 = new java.io.File(
							directory_tFileOutputDelimited_35);
					if (!dir_tFileOutputDelimited_35.exists()) {
						log.info("tFileOutputDelimited_35 - Creating directory '"
								+ dir_tFileOutputDelimited_35
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_35.mkdirs();
						log.info("tFileOutputDelimited_35 - The directory '"
								+ dir_tFileOutputDelimited_35
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_35 = null;

				java.io.File fileToDelete_tFileOutputDelimited_35 = new java.io.File(
						fileName_tFileOutputDelimited_35);
				if (fileToDelete_tFileOutputDelimited_35.exists()) {
					fileToDelete_tFileOutputDelimited_35.delete();
				}
				outtFileOutputDelimited_35 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_35, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_35.length() == 0) {
						outtFileOutputDelimited_35.write("VEH_AGE");
						outtFileOutputDelimited_35
								.write(OUT_DELIM_tFileOutputDelimited_35);
						outtFileOutputDelimited_35.write("VEH_AGE_BAND");
						outtFileOutputDelimited_35
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_35);
						outtFileOutputDelimited_35.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_35",
						outtFileOutputDelimited_35);
				resourceMap.put("nb_line_tFileOutputDelimited_35",
						nb_line_tFileOutputDelimited_35);

				/**
				 * [tFileOutputDelimited_35 begin ] stop
				 */

				/**
				 * [tOracleInput_36 begin ] start
				 */

				ok_Hash.put("tOracleInput_36", false);
				start_Hash.put("tOracleInput_36", System.currentTimeMillis());

				currentComponent = "tOracleInput_36";

				int tos_count_tOracleInput_36 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_36 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_36 = new StringBuilder();
				log4jParamters_tOracleInput_36.append("Parameters:");
				log4jParamters_tOracleInput_36.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36
						.append("QUERY"
								+ " = "
								+ "\"  SELECT VEH_AGE, --REFERENCES VIO_FACT         VEH_AGE_BAND  FROM LU_VEH_AGE_BAND  \"    ");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("VEH_AGE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEH_AGE_BAND") + "}]");
				log4jParamters_tOracleInput_36.append(" | ");
				log4jParamters_tOracleInput_36.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_36.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_36 - "
							+ log4jParamters_tOracleInput_36);

				int nb_line_tOracleInput_36 = 0;
				java.sql.Connection conn_tOracleInput_36 = null;
				String driverClass_tOracleInput_36 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_36);

				String url_tOracleInput_36 = null;
				url_tOracleInput_36 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_36 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_36 = context.dbPasswordPI;

				String dbPwd_tOracleInput_36 = decryptedPassword_tOracleInput_36;

				log.debug("tOracleInput_36 - Driver ClassName: "
						+ driverClass_tOracleInput_36 + ".");

				log.info("tOracleInput_36 - Connection attempt to '"
						+ url_tOracleInput_36 + "' with the username '"
						+ dbUser_tOracleInput_36 + "'.");

				conn_tOracleInput_36 = java.sql.DriverManager.getConnection(
						url_tOracleInput_36, dbUser_tOracleInput_36,
						dbPwd_tOracleInput_36);
				log.info("tOracleInput_36 - Connection to '"
						+ url_tOracleInput_36 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_36 = conn_tOracleInput_36
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_36 = stmtGetTZ_tOracleInput_36
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_36 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_36.next()) {
					sessionTimezone_tOracleInput_36 = rsGetTZ_tOracleInput_36
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_36)
						.setSessionTimeZone(sessionTimezone_tOracleInput_36);

				java.sql.Statement stmt_tOracleInput_36 = conn_tOracleInput_36
						.createStatement();

				String dbquery_tOracleInput_36 = "\nSELECT VEH_AGE, --REFERENCES VIO_FACT\n       VEH_AGE_BAND\nFROM LU_VEH_AGE_BAND\n"

				;

				log.info("tOracleInput_36 - Executing the query: '"
						+ dbquery_tOracleInput_36 + "'.");

				globalMap.put("tOracleInput_36_QUERY", dbquery_tOracleInput_36);

				java.sql.ResultSet rs_tOracleInput_36 = null;
				try {
					rs_tOracleInput_36 = stmt_tOracleInput_36
							.executeQuery(dbquery_tOracleInput_36);
					java.sql.ResultSetMetaData rsmd_tOracleInput_36 = rs_tOracleInput_36
							.getMetaData();
					int colQtyInRs_tOracleInput_36 = rsmd_tOracleInput_36
							.getColumnCount();

					String tmpContent_tOracleInput_36 = null;

					log.info("tOracleInput_36 - Retrieving records from the database.");

					while (rs_tOracleInput_36.next()) {
						nb_line_tOracleInput_36++;

						if (colQtyInRs_tOracleInput_36 < 1) {
							row38.VEH_AGE = null;
						} else {

							tmpContent_tOracleInput_36 = rs_tOracleInput_36
									.getString(1);
							if (tmpContent_tOracleInput_36 != null) {
								row38.VEH_AGE = tmpContent_tOracleInput_36;
							} else {
								row38.VEH_AGE = null;
							}
						}
						if (colQtyInRs_tOracleInput_36 < 2) {
							row38.VEH_AGE_BAND = null;
						} else {

							tmpContent_tOracleInput_36 = rs_tOracleInput_36
									.getString(2);
							if (tmpContent_tOracleInput_36 != null) {
								row38.VEH_AGE_BAND = tmpContent_tOracleInput_36;
							} else {
								row38.VEH_AGE_BAND = null;
							}
						}

						log.debug("tOracleInput_36 - Retrieving the record "
								+ nb_line_tOracleInput_36 + ".");

						/**
						 * [tOracleInput_36 begin ] stop
						 */

						/**
						 * [tOracleInput_36 main ] start
						 */

						currentComponent = "tOracleInput_36";

						tos_count_tOracleInput_36++;

						/**
						 * [tOracleInput_36 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_35 main ] start
						 */

						currentComponent = "tFileOutputDelimited_35";

						if (log.isTraceEnabled()) {
							log.trace("row38 - "
									+ (row38 == null ? "" : row38.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_35 = new StringBuilder();
						if (row38.VEH_AGE != null) {
							sb_tFileOutputDelimited_35.append(row38.VEH_AGE);
						}
						sb_tFileOutputDelimited_35
								.append(OUT_DELIM_tFileOutputDelimited_35);
						if (row38.VEH_AGE_BAND != null) {
							sb_tFileOutputDelimited_35
									.append(row38.VEH_AGE_BAND);
						}
						sb_tFileOutputDelimited_35
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_35);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_35++;
							resourceMap.put("nb_line_tFileOutputDelimited_35",
									nb_line_tFileOutputDelimited_35);

							outtFileOutputDelimited_35
									.write(sb_tFileOutputDelimited_35
											.toString());
							log.debug("tFileOutputDelimited_35 - Writing the record "
									+ nb_line_tFileOutputDelimited_35 + ".");

						}

						tos_count_tFileOutputDelimited_35++;

						/**
						 * [tFileOutputDelimited_35 main ] stop
						 */

						/**
						 * [tOracleInput_36 end ] start
						 */

						currentComponent = "tOracleInput_36";

					}
				} finally {
					stmt_tOracleInput_36.close();

					if (conn_tOracleInput_36 != null
							&& !conn_tOracleInput_36.isClosed()) {

						log.info("tOracleInput_36 - Closing the connection to the database.");

						conn_tOracleInput_36.close();

						log.info("tOracleInput_36 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_36_NB_LINE",
						nb_line_tOracleInput_36);
				log.info("tOracleInput_36 - Retrieved records count: "
						+ nb_line_tOracleInput_36 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_36 - " + "Done.");

				ok_Hash.put("tOracleInput_36", true);
				end_Hash.put("tOracleInput_36", System.currentTimeMillis());

				/**
				 * [tOracleInput_36 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_35 end ] start
				 */

				currentComponent = "tFileOutputDelimited_35";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_35 != null) {
						outtFileOutputDelimited_35.flush();
						outtFileOutputDelimited_35.close();
					}

					globalMap.put("tFileOutputDelimited_35_NB_LINE",
							nb_line_tFileOutputDelimited_35);
					globalMap.put("tFileOutputDelimited_35_FILE_NAME",
							fileName_tFileOutputDelimited_35);

				}

				resourceMap.put("finish_tFileOutputDelimited_35", true);

				log.info("tFileOutputDelimited_35 - Written records count: "
						+ nb_line_tFileOutputDelimited_35 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_35 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_35", true);
				end_Hash.put("tFileOutputDelimited_35",
						System.currentTimeMillis());

				tOracleInput_38Process(globalMap);

				/**
				 * [tFileOutputDelimited_35 end ] stop
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
				 * [tOracleInput_36 finally ] start
				 */

				currentComponent = "tOracleInput_36";

				/**
				 * [tOracleInput_36 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_35 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_35";

				if (resourceMap.get("finish_tFileOutputDelimited_35") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_35 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_35");
						if (outtFileOutputDelimited_35 != null) {
							outtFileOutputDelimited_35.flush();
							outtFileOutputDelimited_35.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_35 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_36_SUBPROCESS_STATE", 1);
	}

	public static class row40Struct implements
			routines.system.IPersistableRow<row40Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String VIN_PATRN_SURR_KEY;

		public String getVIN_PATRN_SURR_KEY() {
			return this.VIN_PATRN_SURR_KEY;
		}

		public String REF_NBR;

		public String getREF_NBR() {
			return this.REF_NBR;
		}

		public String VIN_PATRN;

		public String getVIN_PATRN() {
			return this.VIN_PATRN;
		}

		public String VEH_MDL_YR;

		public String getVEH_MDL_YR() {
			return this.VEH_MDL_YR;
		}

		public String VEH_MFG_BASE_LIST_PRCE;

		public String getVEH_MFG_BASE_LIST_PRCE() {
			return this.VEH_MFG_BASE_LIST_PRCE;
		}

		public String MSRP_BAND;

		public String getMSRP_BAND() {
			return this.MSRP_BAND;
		}

		public String VEH_PWR_STRNG_OPT_DESC;

		public String getVEH_PWR_STRNG_OPT_DESC() {
			return this.VEH_PWR_STRNG_OPT_DESC;
		}

		public String VEH_ABS_DESC;

		public String getVEH_ABS_DESC() {
			return this.VEH_ABS_DESC;
		}

		public String TRANS_DESC;

		public String getTRANS_DESC() {
			return this.TRANS_DESC;
		}

		public String ENG_SUPERCHARGER_DESC;

		public String getENG_SUPERCHARGER_DESC() {
			return this.ENG_SUPERCHARGER_DESC;
		}

		public String ENG_TURBOCHARGER_DESC;

		public String getENG_TURBOCHARGER_DESC() {
			return this.ENG_TURBOCHARGER_DESC;
		}

		public String ENG_DSPLCMNT_CI;

		public String getENG_DSPLCMNT_CI() {
			return this.ENG_DSPLCMNT_CI;
		}

		public String ENG_DSPLCMNT_LITERS;

		public String getENG_DSPLCMNT_LITERS() {
			return this.ENG_DSPLCMNT_LITERS;
		}

		public String VEH_LONGEST_WHLBS_INCH;

		public String getVEH_LONGEST_WHLBS_INCH() {
			return this.VEH_LONGEST_WHLBS_INCH;
		}

		public String ADVNC_VEH_TYPE_DESC;

		public String getADVNC_VEH_TYPE_DESC() {
			return this.ADVNC_VEH_TYPE_DESC;
		}

		public String EV_RNG;

		public String getEV_RNG() {
			return this.EV_RNG;
		}

		public String ADVNC_VEH_BATTERY_CHRG_TM_240V;

		public String getADVNC_VEH_BATTERY_CHRG_TM_240V() {
			return this.ADVNC_VEH_BATTERY_CHRG_TM_240V;
		}

		public String BATTERY_TYPE_DESC;

		public String getBATTERY_TYPE_DESC() {
			return this.BATTERY_TYPE_DESC;
		}

		public String BATTERY_VOLTAGE_DESC;

		public String getBATTERY_VOLTAGE_DESC() {
			return this.BATTERY_VOLTAGE_DESC;
		}

		public String MOTOR_PWR_OUTPUT_KW;

		public String getMOTOR_PWR_OUTPUT_KW() {
			return this.MOTOR_PWR_OUTPUT_KW;
		}

		public String REGEN_BRK_DESC;

		public String getREGEN_BRK_DESC() {
			return this.REGEN_BRK_DESC;
		}

		public String MPG_CITY;

		public String getMPG_CITY() {
			return this.MPG_CITY;
		}

		public String MPG_HIGHWAY;

		public String getMPG_HIGHWAY() {
			return this.MPG_HIGHWAY;
		}

		public String MPG_CMBND;

		public String getMPG_CMBND() {
			return this.MPG_CMBND;
		}

		public String EPA_AIR_POLLUTION_SCR;

		public String getEPA_AIR_POLLUTION_SCR() {
			return this.EPA_AIR_POLLUTION_SCR;
		}

		public String EPA_GREENHOUSE_GAS_SCR;

		public String getEPA_GREENHOUSE_GAS_SCR() {
			return this.EPA_GREENHOUSE_GAS_SCR;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.VIN_PATRN_SURR_KEY = readString(dis);

					this.REF_NBR = readString(dis);

					this.VIN_PATRN = readString(dis);

					this.VEH_MDL_YR = readString(dis);

					this.VEH_MFG_BASE_LIST_PRCE = readString(dis);

					this.MSRP_BAND = readString(dis);

					this.VEH_PWR_STRNG_OPT_DESC = readString(dis);

					this.VEH_ABS_DESC = readString(dis);

					this.TRANS_DESC = readString(dis);

					this.ENG_SUPERCHARGER_DESC = readString(dis);

					this.ENG_TURBOCHARGER_DESC = readString(dis);

					this.ENG_DSPLCMNT_CI = readString(dis);

					this.ENG_DSPLCMNT_LITERS = readString(dis);

					this.VEH_LONGEST_WHLBS_INCH = readString(dis);

					this.ADVNC_VEH_TYPE_DESC = readString(dis);

					this.EV_RNG = readString(dis);

					this.ADVNC_VEH_BATTERY_CHRG_TM_240V = readString(dis);

					this.BATTERY_TYPE_DESC = readString(dis);

					this.BATTERY_VOLTAGE_DESC = readString(dis);

					this.MOTOR_PWR_OUTPUT_KW = readString(dis);

					this.REGEN_BRK_DESC = readString(dis);

					this.MPG_CITY = readString(dis);

					this.MPG_HIGHWAY = readString(dis);

					this.MPG_CMBND = readString(dis);

					this.EPA_AIR_POLLUTION_SCR = readString(dis);

					this.EPA_GREENHOUSE_GAS_SCR = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.VIN_PATRN_SURR_KEY, dos);

				// String

				writeString(this.REF_NBR, dos);

				// String

				writeString(this.VIN_PATRN, dos);

				// String

				writeString(this.VEH_MDL_YR, dos);

				// String

				writeString(this.VEH_MFG_BASE_LIST_PRCE, dos);

				// String

				writeString(this.MSRP_BAND, dos);

				// String

				writeString(this.VEH_PWR_STRNG_OPT_DESC, dos);

				// String

				writeString(this.VEH_ABS_DESC, dos);

				// String

				writeString(this.TRANS_DESC, dos);

				// String

				writeString(this.ENG_SUPERCHARGER_DESC, dos);

				// String

				writeString(this.ENG_TURBOCHARGER_DESC, dos);

				// String

				writeString(this.ENG_DSPLCMNT_CI, dos);

				// String

				writeString(this.ENG_DSPLCMNT_LITERS, dos);

				// String

				writeString(this.VEH_LONGEST_WHLBS_INCH, dos);

				// String

				writeString(this.ADVNC_VEH_TYPE_DESC, dos);

				// String

				writeString(this.EV_RNG, dos);

				// String

				writeString(this.ADVNC_VEH_BATTERY_CHRG_TM_240V, dos);

				// String

				writeString(this.BATTERY_TYPE_DESC, dos);

				// String

				writeString(this.BATTERY_VOLTAGE_DESC, dos);

				// String

				writeString(this.MOTOR_PWR_OUTPUT_KW, dos);

				// String

				writeString(this.REGEN_BRK_DESC, dos);

				// String

				writeString(this.MPG_CITY, dos);

				// String

				writeString(this.MPG_HIGHWAY, dos);

				// String

				writeString(this.MPG_CMBND, dos);

				// String

				writeString(this.EPA_AIR_POLLUTION_SCR, dos);

				// String

				writeString(this.EPA_GREENHOUSE_GAS_SCR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("VIN_PATRN_SURR_KEY=" + VIN_PATRN_SURR_KEY);
			sb.append(",REF_NBR=" + REF_NBR);
			sb.append(",VIN_PATRN=" + VIN_PATRN);
			sb.append(",VEH_MDL_YR=" + VEH_MDL_YR);
			sb.append(",VEH_MFG_BASE_LIST_PRCE=" + VEH_MFG_BASE_LIST_PRCE);
			sb.append(",MSRP_BAND=" + MSRP_BAND);
			sb.append(",VEH_PWR_STRNG_OPT_DESC=" + VEH_PWR_STRNG_OPT_DESC);
			sb.append(",VEH_ABS_DESC=" + VEH_ABS_DESC);
			sb.append(",TRANS_DESC=" + TRANS_DESC);
			sb.append(",ENG_SUPERCHARGER_DESC=" + ENG_SUPERCHARGER_DESC);
			sb.append(",ENG_TURBOCHARGER_DESC=" + ENG_TURBOCHARGER_DESC);
			sb.append(",ENG_DSPLCMNT_CI=" + ENG_DSPLCMNT_CI);
			sb.append(",ENG_DSPLCMNT_LITERS=" + ENG_DSPLCMNT_LITERS);
			sb.append(",VEH_LONGEST_WHLBS_INCH=" + VEH_LONGEST_WHLBS_INCH);
			sb.append(",ADVNC_VEH_TYPE_DESC=" + ADVNC_VEH_TYPE_DESC);
			sb.append(",EV_RNG=" + EV_RNG);
			sb.append(",ADVNC_VEH_BATTERY_CHRG_TM_240V="
					+ ADVNC_VEH_BATTERY_CHRG_TM_240V);
			sb.append(",BATTERY_TYPE_DESC=" + BATTERY_TYPE_DESC);
			sb.append(",BATTERY_VOLTAGE_DESC=" + BATTERY_VOLTAGE_DESC);
			sb.append(",MOTOR_PWR_OUTPUT_KW=" + MOTOR_PWR_OUTPUT_KW);
			sb.append(",REGEN_BRK_DESC=" + REGEN_BRK_DESC);
			sb.append(",MPG_CITY=" + MPG_CITY);
			sb.append(",MPG_HIGHWAY=" + MPG_HIGHWAY);
			sb.append(",MPG_CMBND=" + MPG_CMBND);
			sb.append(",EPA_AIR_POLLUTION_SCR=" + EPA_AIR_POLLUTION_SCR);
			sb.append(",EPA_GREENHOUSE_GAS_SCR=" + EPA_GREENHOUSE_GAS_SCR);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (VIN_PATRN_SURR_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(VIN_PATRN_SURR_KEY);
			}

			sb.append("|");

			if (REF_NBR == null) {
				sb.append("<null>");
			} else {
				sb.append(REF_NBR);
			}

			sb.append("|");

			if (VIN_PATRN == null) {
				sb.append("<null>");
			} else {
				sb.append(VIN_PATRN);
			}

			sb.append("|");

			if (VEH_MDL_YR == null) {
				sb.append("<null>");
			} else {
				sb.append(VEH_MDL_YR);
			}

			sb.append("|");

			if (VEH_MFG_BASE_LIST_PRCE == null) {
				sb.append("<null>");
			} else {
				sb.append(VEH_MFG_BASE_LIST_PRCE);
			}

			sb.append("|");

			if (MSRP_BAND == null) {
				sb.append("<null>");
			} else {
				sb.append(MSRP_BAND);
			}

			sb.append("|");

			if (VEH_PWR_STRNG_OPT_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(VEH_PWR_STRNG_OPT_DESC);
			}

			sb.append("|");

			if (VEH_ABS_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(VEH_ABS_DESC);
			}

			sb.append("|");

			if (TRANS_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRANS_DESC);
			}

			sb.append("|");

			if (ENG_SUPERCHARGER_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(ENG_SUPERCHARGER_DESC);
			}

			sb.append("|");

			if (ENG_TURBOCHARGER_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(ENG_TURBOCHARGER_DESC);
			}

			sb.append("|");

			if (ENG_DSPLCMNT_CI == null) {
				sb.append("<null>");
			} else {
				sb.append(ENG_DSPLCMNT_CI);
			}

			sb.append("|");

			if (ENG_DSPLCMNT_LITERS == null) {
				sb.append("<null>");
			} else {
				sb.append(ENG_DSPLCMNT_LITERS);
			}

			sb.append("|");

			if (VEH_LONGEST_WHLBS_INCH == null) {
				sb.append("<null>");
			} else {
				sb.append(VEH_LONGEST_WHLBS_INCH);
			}

			sb.append("|");

			if (ADVNC_VEH_TYPE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(ADVNC_VEH_TYPE_DESC);
			}

			sb.append("|");

			if (EV_RNG == null) {
				sb.append("<null>");
			} else {
				sb.append(EV_RNG);
			}

			sb.append("|");

			if (ADVNC_VEH_BATTERY_CHRG_TM_240V == null) {
				sb.append("<null>");
			} else {
				sb.append(ADVNC_VEH_BATTERY_CHRG_TM_240V);
			}

			sb.append("|");

			if (BATTERY_TYPE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(BATTERY_TYPE_DESC);
			}

			sb.append("|");

			if (BATTERY_VOLTAGE_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(BATTERY_VOLTAGE_DESC);
			}

			sb.append("|");

			if (MOTOR_PWR_OUTPUT_KW == null) {
				sb.append("<null>");
			} else {
				sb.append(MOTOR_PWR_OUTPUT_KW);
			}

			sb.append("|");

			if (REGEN_BRK_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(REGEN_BRK_DESC);
			}

			sb.append("|");

			if (MPG_CITY == null) {
				sb.append("<null>");
			} else {
				sb.append(MPG_CITY);
			}

			sb.append("|");

			if (MPG_HIGHWAY == null) {
				sb.append("<null>");
			} else {
				sb.append(MPG_HIGHWAY);
			}

			sb.append("|");

			if (MPG_CMBND == null) {
				sb.append("<null>");
			} else {
				sb.append(MPG_CMBND);
			}

			sb.append("|");

			if (EPA_AIR_POLLUTION_SCR == null) {
				sb.append("<null>");
			} else {
				sb.append(EPA_AIR_POLLUTION_SCR);
			}

			sb.append("|");

			if (EPA_GREENHOUSE_GAS_SCR == null) {
				sb.append("<null>");
			} else {
				sb.append(EPA_GREENHOUSE_GAS_SCR);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row40Struct other) {

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

	public void tOracleInput_38Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_38_SUBPROCESS_STATE", 0);

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

				row40Struct row40 = new row40Struct();

				/**
				 * [tFileOutputDelimited_37 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_37", false);
				start_Hash.put("tFileOutputDelimited_37",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_37";

				int tos_count_tFileOutputDelimited_37 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_37 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_37 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_37.append("Parameters:");
				log4jParamters_tFileOutputDelimited_37.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_VEHICLE_ATTRIBUTES_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				log4jParamters_tFileOutputDelimited_37
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputDelimited_37.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_37 - "
							+ log4jParamters_tFileOutputDelimited_37);

				String fileName_tFileOutputDelimited_37 = "";
				fileName_tFileOutputDelimited_37 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth
								+ "/FORD_VEHICLE_ATTRIBUTES_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_37 = null;
				String extension_tFileOutputDelimited_37 = null;
				String directory_tFileOutputDelimited_37 = null;
				if ((fileName_tFileOutputDelimited_37.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_37.lastIndexOf(".") < fileName_tFileOutputDelimited_37
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_37 = fileName_tFileOutputDelimited_37;
						extension_tFileOutputDelimited_37 = "";
					} else {
						fullName_tFileOutputDelimited_37 = fileName_tFileOutputDelimited_37
								.substring(0, fileName_tFileOutputDelimited_37
										.lastIndexOf("."));
						extension_tFileOutputDelimited_37 = fileName_tFileOutputDelimited_37
								.substring(fileName_tFileOutputDelimited_37
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_37 = fileName_tFileOutputDelimited_37
							.substring(0, fileName_tFileOutputDelimited_37
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_37.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_37 = fileName_tFileOutputDelimited_37
								.substring(0, fileName_tFileOutputDelimited_37
										.lastIndexOf("."));
						extension_tFileOutputDelimited_37 = fileName_tFileOutputDelimited_37
								.substring(fileName_tFileOutputDelimited_37
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_37 = fileName_tFileOutputDelimited_37;
						extension_tFileOutputDelimited_37 = "";
					}
					directory_tFileOutputDelimited_37 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_37 = true;
				java.io.File filetFileOutputDelimited_37 = new java.io.File(
						fileName_tFileOutputDelimited_37);
				globalMap.put("tFileOutputDelimited_37_FILE_NAME",
						fileName_tFileOutputDelimited_37);
				int nb_line_tFileOutputDelimited_37 = 0;
				int splitEvery_tFileOutputDelimited_37 = 1000;
				int splitedFileNo_tFileOutputDelimited_37 = 0;
				int currentRow_tFileOutputDelimited_37 = 0;

				final String OUT_DELIM_tFileOutputDelimited_37 = /**
				 * Start field
				 * tFileOutputDelimited_37:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_37:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_37 = /**
				 * Start
				 * field tFileOutputDelimited_37:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_37:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_37 != null
						&& directory_tFileOutputDelimited_37.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_37 = new java.io.File(
							directory_tFileOutputDelimited_37);
					if (!dir_tFileOutputDelimited_37.exists()) {
						log.info("tFileOutputDelimited_37 - Creating directory '"
								+ dir_tFileOutputDelimited_37
										.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_37.mkdirs();
						log.info("tFileOutputDelimited_37 - The directory '"
								+ dir_tFileOutputDelimited_37
										.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_37 = null;

				java.io.File fileToDelete_tFileOutputDelimited_37 = new java.io.File(
						fileName_tFileOutputDelimited_37);
				if (fileToDelete_tFileOutputDelimited_37.exists()) {
					fileToDelete_tFileOutputDelimited_37.delete();
				}
				outtFileOutputDelimited_37 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_37, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_37.length() == 0) {
						outtFileOutputDelimited_37.write("VIN_PATRN_SURR_KEY");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("REF_NBR");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("VIN_PATRN");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("VEH_MDL_YR");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("VEH_MFG_BASE_LIST_PRCE");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("MSRP_BAND");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("VEH_PWR_STRNG_OPT_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("VEH_ABS_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("TRANS_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("ENG_SUPERCHARGER_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("ENG_TURBOCHARGER_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("ENG_DSPLCMNT_CI");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("ENG_DSPLCMNT_LITERS");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("VEH_LONGEST_WHLBS_INCH");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("ADVNC_VEH_TYPE_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("EV_RNG");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("ADVNC_VEH_BATTERY_CHRG_TM_240V");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("BATTERY_TYPE_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("BATTERY_VOLTAGE_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("MOTOR_PWR_OUTPUT_KW");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("REGEN_BRK_DESC");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("MPG_CITY");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("MPG_HIGHWAY");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.write("MPG_CMBND");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("EPA_AIR_POLLUTION_SCR");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_tFileOutputDelimited_37);
						outtFileOutputDelimited_37
								.write("EPA_GREENHOUSE_GAS_SCR");
						outtFileOutputDelimited_37
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_37);
						outtFileOutputDelimited_37.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_37",
						outtFileOutputDelimited_37);
				resourceMap.put("nb_line_tFileOutputDelimited_37",
						nb_line_tFileOutputDelimited_37);

				/**
				 * [tFileOutputDelimited_37 begin ] stop
				 */

				/**
				 * [tOracleInput_38 begin ] start
				 */

				ok_Hash.put("tOracleInput_38", false);
				start_Hash.put("tOracleInput_38", System.currentTimeMillis());

				currentComponent = "tOracleInput_38";

				int tos_count_tOracleInput_38 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_38 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_38 = new StringBuilder();
				log4jParamters_tOracleInput_38.append("Parameters:");
				log4jParamters_tOracleInput_38.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("HOST" + " = "
						+ "context.dbHostNamePI");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("DBNAME" + " = "
						+ "context.dbNamePI");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("SCHEMA_DB" + " = "
						+ "context.dbSchemaPI");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("USER" + " = "
						+ "context.dbUserPI");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPasswordPI))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38
						.append("QUERY"
								+ " = "
								+ "\"  SELECT '',--REFERENCES FACT TABLES           REF_NBR, --references make_model_code       	   VIN_PATRN, --references vio_fact         VEH_MDL_YR,         NULL, --VEH_MFG_BASE_LIST_PRCE,  	   NULL, --MSRP_BAND,         	   VEH_PWR_STRNG_OPT_DESC,         	   VEH_ABS_DESC,         	   TRANS_DESC,         ENG_SUPERCHARGER_DESC,          ENG_TURBOCHARGER_DESC,          ENG_DSPLCMNT_CI,  	   ENG_DSPLCMNT_LITERS,         	   VEH_LONGEST_WHLBS_INCH,            	   ADVNC_VEH_TYPE_DESC,         EV_RNG,         	   ADVNC_VEH_BATTERY_CHRG_TM_240V,          BATTERY_TYPE_DESC,         BATTERY_VOLTAGE_DESC,  	   MOTOR_PWR_OUTPUT_KW,         REGEN_BRK_DESC,         MPG_CITY,         MPG_HIGHWAY,         MPG_CMBND,         EPA_AIR_POLLUTION_SCR,         EPA_GREENHOUSE_GAS_SCR        FROM VEHICLE_ATTRIBUTES  \"    ");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("VIN_PATRN_SURR_KEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REF_NBR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("VIN_PATRN")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("VEH_MDL_YR") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEH_MFG_BASE_LIST_PRCE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MSRP_BAND") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEH_PWR_STRNG_OPT_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("VEH_ABS_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TRANS_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("ENG_SUPERCHARGER_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ENG_TURBOCHARGER_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ENG_DSPLCMNT_CI") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ENG_DSPLCMNT_LITERS")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("VEH_LONGEST_WHLBS_INCH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ADVNC_VEH_TYPE_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("EV_RNG") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN="
						+ ("ADVNC_VEH_BATTERY_CHRG_TM_240V") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("BATTERY_TYPE_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("BATTERY_VOLTAGE_DESC")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MOTOR_PWR_OUTPUT_KW") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REGEN_BRK_DESC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("MPG_CITY")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MPG_HIGHWAY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("MPG_CMBND") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("EPA_AIR_POLLUTION_SCR") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("EPA_GREENHOUSE_GAS_SCR")
						+ "}]");
				log4jParamters_tOracleInput_38.append(" | ");
				log4jParamters_tOracleInput_38.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_38.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_38 - "
							+ log4jParamters_tOracleInput_38);

				int nb_line_tOracleInput_38 = 0;
				java.sql.Connection conn_tOracleInput_38 = null;
				String driverClass_tOracleInput_38 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_38);

				String url_tOracleInput_38 = null;
				url_tOracleInput_38 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostNamePI
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbNamePI
						+ ")))";

				String dbUser_tOracleInput_38 = context.dbUserPI;

				final String decryptedPassword_tOracleInput_38 = context.dbPasswordPI;

				String dbPwd_tOracleInput_38 = decryptedPassword_tOracleInput_38;

				log.debug("tOracleInput_38 - Driver ClassName: "
						+ driverClass_tOracleInput_38 + ".");

				log.info("tOracleInput_38 - Connection attempt to '"
						+ url_tOracleInput_38 + "' with the username '"
						+ dbUser_tOracleInput_38 + "'.");

				conn_tOracleInput_38 = java.sql.DriverManager.getConnection(
						url_tOracleInput_38, dbUser_tOracleInput_38,
						dbPwd_tOracleInput_38);
				log.info("tOracleInput_38 - Connection to '"
						+ url_tOracleInput_38 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_38 = conn_tOracleInput_38
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_38 = stmtGetTZ_tOracleInput_38
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_38 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_38.next()) {
					sessionTimezone_tOracleInput_38 = rsGetTZ_tOracleInput_38
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_38)
						.setSessionTimeZone(sessionTimezone_tOracleInput_38);

				java.sql.Statement stmt_tOracleInput_38 = conn_tOracleInput_38
						.createStatement();

				String dbquery_tOracleInput_38 = "\nSELECT '',--REFERENCES FACT TABLES  \n       REF_NBR, --references make_model_code     \n	   VIN_PATRN, --references vio_fact\n       VEH_MDL_YR,\n       NULL, --VEH_MFG_BASE_LIST_PRCE,\n	   NULL, --MSRP_BAND,       \n	   VEH_PWR_STRNG_OPT_DESC,       \n	   VEH_ABS_DESC,       \n	   TRANS_DESC,\n       ENG_SUPERCHARGER_DESC, \n       ENG_TURBOCHARGER_DESC, \n       ENG_DSPLCMNT_CI,\n	   ENG_DSPLCMNT_LITERS,       \n	   VEH_LONGEST_WHLBS_INCH,          \n	   ADVNC_VEH_TYPE_DESC,\n       EV_RNG,       \n	   ADVNC_VEH_BATTERY_CHRG_TM_240V, \n       BATTERY_TYPE_DESC,\n       BATTERY_VOLTAGE_DESC,\n	   MOTOR_PWR_OUTPUT_KW,\n       REGEN_BRK_DESC,\n       MPG_CITY,\n       MPG_HIGHWAY,\n       MPG_CMBND,\n       EPA_AIR_POLLUTION_SCR,\n       EPA_GREENHOUSE_GAS_SCR      \nFROM VEHICLE_ATTRIBUTES\n"

				;

				log.info("tOracleInput_38 - Executing the query: '"
						+ dbquery_tOracleInput_38 + "'.");

				globalMap.put("tOracleInput_38_QUERY", dbquery_tOracleInput_38);

				java.sql.ResultSet rs_tOracleInput_38 = null;
				try {
					rs_tOracleInput_38 = stmt_tOracleInput_38
							.executeQuery(dbquery_tOracleInput_38);
					java.sql.ResultSetMetaData rsmd_tOracleInput_38 = rs_tOracleInput_38
							.getMetaData();
					int colQtyInRs_tOracleInput_38 = rsmd_tOracleInput_38
							.getColumnCount();

					String tmpContent_tOracleInput_38 = null;

					log.info("tOracleInput_38 - Retrieving records from the database.");

					while (rs_tOracleInput_38.next()) {
						nb_line_tOracleInput_38++;

						if (colQtyInRs_tOracleInput_38 < 1) {
							row40.VIN_PATRN_SURR_KEY = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(1);
							if (tmpContent_tOracleInput_38 != null) {
								row40.VIN_PATRN_SURR_KEY = tmpContent_tOracleInput_38;
							} else {
								row40.VIN_PATRN_SURR_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 2) {
							row40.REF_NBR = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(2);
							if (tmpContent_tOracleInput_38 != null) {
								row40.REF_NBR = tmpContent_tOracleInput_38;
							} else {
								row40.REF_NBR = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 3) {
							row40.VIN_PATRN = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(3);
							if (tmpContent_tOracleInput_38 != null) {
								row40.VIN_PATRN = tmpContent_tOracleInput_38;
							} else {
								row40.VIN_PATRN = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 4) {
							row40.VEH_MDL_YR = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(4);
							if (tmpContent_tOracleInput_38 != null) {
								row40.VEH_MDL_YR = tmpContent_tOracleInput_38;
							} else {
								row40.VEH_MDL_YR = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 5) {
							row40.VEH_MFG_BASE_LIST_PRCE = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(5);
							if (tmpContent_tOracleInput_38 != null) {
								row40.VEH_MFG_BASE_LIST_PRCE = tmpContent_tOracleInput_38;
							} else {
								row40.VEH_MFG_BASE_LIST_PRCE = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 6) {
							row40.MSRP_BAND = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(6);
							if (tmpContent_tOracleInput_38 != null) {
								row40.MSRP_BAND = tmpContent_tOracleInput_38;
							} else {
								row40.MSRP_BAND = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 7) {
							row40.VEH_PWR_STRNG_OPT_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(7);
							if (tmpContent_tOracleInput_38 != null) {
								row40.VEH_PWR_STRNG_OPT_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.VEH_PWR_STRNG_OPT_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 8) {
							row40.VEH_ABS_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(8);
							if (tmpContent_tOracleInput_38 != null) {
								row40.VEH_ABS_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.VEH_ABS_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 9) {
							row40.TRANS_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(9);
							if (tmpContent_tOracleInput_38 != null) {
								row40.TRANS_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.TRANS_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 10) {
							row40.ENG_SUPERCHARGER_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(10);
							if (tmpContent_tOracleInput_38 != null) {
								row40.ENG_SUPERCHARGER_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.ENG_SUPERCHARGER_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 11) {
							row40.ENG_TURBOCHARGER_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(11);
							if (tmpContent_tOracleInput_38 != null) {
								row40.ENG_TURBOCHARGER_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.ENG_TURBOCHARGER_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 12) {
							row40.ENG_DSPLCMNT_CI = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(12);
							if (tmpContent_tOracleInput_38 != null) {
								row40.ENG_DSPLCMNT_CI = tmpContent_tOracleInput_38;
							} else {
								row40.ENG_DSPLCMNT_CI = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 13) {
							row40.ENG_DSPLCMNT_LITERS = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(13);
							if (tmpContent_tOracleInput_38 != null) {
								row40.ENG_DSPLCMNT_LITERS = tmpContent_tOracleInput_38;
							} else {
								row40.ENG_DSPLCMNT_LITERS = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 14) {
							row40.VEH_LONGEST_WHLBS_INCH = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(14);
							if (tmpContent_tOracleInput_38 != null) {
								row40.VEH_LONGEST_WHLBS_INCH = tmpContent_tOracleInput_38;
							} else {
								row40.VEH_LONGEST_WHLBS_INCH = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 15) {
							row40.ADVNC_VEH_TYPE_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(15);
							if (tmpContent_tOracleInput_38 != null) {
								row40.ADVNC_VEH_TYPE_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.ADVNC_VEH_TYPE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 16) {
							row40.EV_RNG = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(16);
							if (tmpContent_tOracleInput_38 != null) {
								row40.EV_RNG = tmpContent_tOracleInput_38;
							} else {
								row40.EV_RNG = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 17) {
							row40.ADVNC_VEH_BATTERY_CHRG_TM_240V = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(17);
							if (tmpContent_tOracleInput_38 != null) {
								row40.ADVNC_VEH_BATTERY_CHRG_TM_240V = tmpContent_tOracleInput_38;
							} else {
								row40.ADVNC_VEH_BATTERY_CHRG_TM_240V = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 18) {
							row40.BATTERY_TYPE_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(18);
							if (tmpContent_tOracleInput_38 != null) {
								row40.BATTERY_TYPE_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.BATTERY_TYPE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 19) {
							row40.BATTERY_VOLTAGE_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(19);
							if (tmpContent_tOracleInput_38 != null) {
								row40.BATTERY_VOLTAGE_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.BATTERY_VOLTAGE_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 20) {
							row40.MOTOR_PWR_OUTPUT_KW = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(20);
							if (tmpContent_tOracleInput_38 != null) {
								row40.MOTOR_PWR_OUTPUT_KW = tmpContent_tOracleInput_38;
							} else {
								row40.MOTOR_PWR_OUTPUT_KW = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 21) {
							row40.REGEN_BRK_DESC = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(21);
							if (tmpContent_tOracleInput_38 != null) {
								row40.REGEN_BRK_DESC = tmpContent_tOracleInput_38;
							} else {
								row40.REGEN_BRK_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 22) {
							row40.MPG_CITY = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(22);
							if (tmpContent_tOracleInput_38 != null) {
								row40.MPG_CITY = tmpContent_tOracleInput_38;
							} else {
								row40.MPG_CITY = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 23) {
							row40.MPG_HIGHWAY = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(23);
							if (tmpContent_tOracleInput_38 != null) {
								row40.MPG_HIGHWAY = tmpContent_tOracleInput_38;
							} else {
								row40.MPG_HIGHWAY = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 24) {
							row40.MPG_CMBND = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(24);
							if (tmpContent_tOracleInput_38 != null) {
								row40.MPG_CMBND = tmpContent_tOracleInput_38;
							} else {
								row40.MPG_CMBND = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 25) {
							row40.EPA_AIR_POLLUTION_SCR = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(25);
							if (tmpContent_tOracleInput_38 != null) {
								row40.EPA_AIR_POLLUTION_SCR = tmpContent_tOracleInput_38;
							} else {
								row40.EPA_AIR_POLLUTION_SCR = null;
							}
						}
						if (colQtyInRs_tOracleInput_38 < 26) {
							row40.EPA_GREENHOUSE_GAS_SCR = null;
						} else {

							tmpContent_tOracleInput_38 = rs_tOracleInput_38
									.getString(26);
							if (tmpContent_tOracleInput_38 != null) {
								row40.EPA_GREENHOUSE_GAS_SCR = tmpContent_tOracleInput_38;
							} else {
								row40.EPA_GREENHOUSE_GAS_SCR = null;
							}
						}

						log.debug("tOracleInput_38 - Retrieving the record "
								+ nb_line_tOracleInput_38 + ".");

						/**
						 * [tOracleInput_38 begin ] stop
						 */

						/**
						 * [tOracleInput_38 main ] start
						 */

						currentComponent = "tOracleInput_38";

						tos_count_tOracleInput_38++;

						/**
						 * [tOracleInput_38 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_37 main ] start
						 */

						currentComponent = "tFileOutputDelimited_37";

						if (log.isTraceEnabled()) {
							log.trace("row40 - "
									+ (row40 == null ? "" : row40.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_37 = new StringBuilder();
						if (row40.VIN_PATRN_SURR_KEY != null) {
							sb_tFileOutputDelimited_37
									.append(row40.VIN_PATRN_SURR_KEY);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.REF_NBR != null) {
							sb_tFileOutputDelimited_37.append(row40.REF_NBR);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.VIN_PATRN != null) {
							sb_tFileOutputDelimited_37.append(row40.VIN_PATRN);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.VEH_MDL_YR != null) {
							sb_tFileOutputDelimited_37.append(row40.VEH_MDL_YR);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.VEH_MFG_BASE_LIST_PRCE != null) {
							sb_tFileOutputDelimited_37
									.append(row40.VEH_MFG_BASE_LIST_PRCE);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.MSRP_BAND != null) {
							sb_tFileOutputDelimited_37.append(row40.MSRP_BAND);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.VEH_PWR_STRNG_OPT_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.VEH_PWR_STRNG_OPT_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.VEH_ABS_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.VEH_ABS_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.TRANS_DESC != null) {
							sb_tFileOutputDelimited_37.append(row40.TRANS_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.ENG_SUPERCHARGER_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.ENG_SUPERCHARGER_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.ENG_TURBOCHARGER_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.ENG_TURBOCHARGER_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.ENG_DSPLCMNT_CI != null) {
							sb_tFileOutputDelimited_37
									.append(row40.ENG_DSPLCMNT_CI);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.ENG_DSPLCMNT_LITERS != null) {
							sb_tFileOutputDelimited_37
									.append(row40.ENG_DSPLCMNT_LITERS);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.VEH_LONGEST_WHLBS_INCH != null) {
							sb_tFileOutputDelimited_37
									.append(row40.VEH_LONGEST_WHLBS_INCH);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.ADVNC_VEH_TYPE_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.ADVNC_VEH_TYPE_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.EV_RNG != null) {
							sb_tFileOutputDelimited_37.append(row40.EV_RNG);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.ADVNC_VEH_BATTERY_CHRG_TM_240V != null) {
							sb_tFileOutputDelimited_37
									.append(row40.ADVNC_VEH_BATTERY_CHRG_TM_240V);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.BATTERY_TYPE_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.BATTERY_TYPE_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.BATTERY_VOLTAGE_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.BATTERY_VOLTAGE_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.MOTOR_PWR_OUTPUT_KW != null) {
							sb_tFileOutputDelimited_37
									.append(row40.MOTOR_PWR_OUTPUT_KW);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.REGEN_BRK_DESC != null) {
							sb_tFileOutputDelimited_37
									.append(row40.REGEN_BRK_DESC);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.MPG_CITY != null) {
							sb_tFileOutputDelimited_37.append(row40.MPG_CITY);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.MPG_HIGHWAY != null) {
							sb_tFileOutputDelimited_37
									.append(row40.MPG_HIGHWAY);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.MPG_CMBND != null) {
							sb_tFileOutputDelimited_37.append(row40.MPG_CMBND);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.EPA_AIR_POLLUTION_SCR != null) {
							sb_tFileOutputDelimited_37
									.append(row40.EPA_AIR_POLLUTION_SCR);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_tFileOutputDelimited_37);
						if (row40.EPA_GREENHOUSE_GAS_SCR != null) {
							sb_tFileOutputDelimited_37
									.append(row40.EPA_GREENHOUSE_GAS_SCR);
						}
						sb_tFileOutputDelimited_37
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_37);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_37++;
							resourceMap.put("nb_line_tFileOutputDelimited_37",
									nb_line_tFileOutputDelimited_37);

							outtFileOutputDelimited_37
									.write(sb_tFileOutputDelimited_37
											.toString());
							log.debug("tFileOutputDelimited_37 - Writing the record "
									+ nb_line_tFileOutputDelimited_37 + ".");

						}

						tos_count_tFileOutputDelimited_37++;

						/**
						 * [tFileOutputDelimited_37 main ] stop
						 */

						/**
						 * [tOracleInput_38 end ] start
						 */

						currentComponent = "tOracleInput_38";

					}
				} finally {
					stmt_tOracleInput_38.close();

					if (conn_tOracleInput_38 != null
							&& !conn_tOracleInput_38.isClosed()) {

						log.info("tOracleInput_38 - Closing the connection to the database.");

						conn_tOracleInput_38.close();

						log.info("tOracleInput_38 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_38_NB_LINE",
						nb_line_tOracleInput_38);
				log.info("tOracleInput_38 - Retrieved records count: "
						+ nb_line_tOracleInput_38 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_38 - " + "Done.");

				ok_Hash.put("tOracleInput_38", true);
				end_Hash.put("tOracleInput_38", System.currentTimeMillis());

				/**
				 * [tOracleInput_38 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_37 end ] start
				 */

				currentComponent = "tFileOutputDelimited_37";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_37 != null) {
						outtFileOutputDelimited_37.flush();
						outtFileOutputDelimited_37.close();
					}

					globalMap.put("tFileOutputDelimited_37_NB_LINE",
							nb_line_tFileOutputDelimited_37);
					globalMap.put("tFileOutputDelimited_37_FILE_NAME",
							fileName_tFileOutputDelimited_37);

				}

				resourceMap.put("finish_tFileOutputDelimited_37", true);

				log.info("tFileOutputDelimited_37 - Written records count: "
						+ nb_line_tFileOutputDelimited_37 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_37 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_37", true);
				end_Hash.put("tFileOutputDelimited_37",
						System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_37 end ] stop
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
				 * [tOracleInput_38 finally ] start
				 */

				currentComponent = "tOracleInput_38";

				/**
				 * [tOracleInput_38 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_37 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_37";

				if (resourceMap.get("finish_tFileOutputDelimited_37") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_37 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_37");
						if (outtFileOutputDelimited_37 != null) {
							outtFileOutputDelimited_37.flush();
							outtFileOutputDelimited_37.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_37 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_38_SUBPROCESS_STATE", 1);
	}

	public static class row3Struct implements
			routines.system.IPersistableRow<row3Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[0];

		public String TRACTZIP_SAKEY;

		public String getTRACTZIP_SAKEY() {
			return this.TRACTZIP_SAKEY;
		}

		public String REPORT_YEAR_MONTH;

		public String getREPORT_YEAR_MONTH() {
			return this.REPORT_YEAR_MONTH;
		}

		public String MAKE_MODEL_CODE;

		public String getMAKE_MODEL_CODE() {
			return this.MAKE_MODEL_CODE;
		}

		public String MAKE_TEXT;

		public String getMAKE_TEXT() {
			return this.MAKE_TEXT;
		}

		public String GENDER_CODE;

		public String getGENDER_CODE() {
			return this.GENDER_CODE;
		}

		public String AGE_CODE;

		public String getAGE_CODE() {
			return this.AGE_CODE;
		}

		public String ETHNIC_KEY;

		public String getETHNIC_KEY() {
			return this.ETHNIC_KEY;
		}

		public String EST_HH_INCOME_CODE;

		public String getEST_HH_INCOME_CODE() {
			return this.EST_HH_INCOME_CODE;
		}

		public String CERTIFIED_PRE_OWNED;

		public String getCERTIFIED_PRE_OWNED() {
			return this.CERTIFIED_PRE_OWNED;
		}

		public String CERTIFIED_DESC;

		public String getCERTIFIED_DESC() {
			return this.CERTIFIED_DESC;
		}

		public String FIRST_TIME_USED_IND;

		public String getFIRST_TIME_USED_IND() {
			return this.FIRST_TIME_USED_IND;
		}

		public String OFF_LEASE_CODE;

		public String getOFF_LEASE_CODE() {
			return this.OFF_LEASE_CODE;
		}

		public String TRGT_INC;

		public String getTRGT_INC() {
			return this.TRGT_INC;
		}

		public String VIN_PATRN;

		public String getVIN_PATRN() {
			return this.VIN_PATRN;
		}

		public String VIN_PATRN_SURR_KEY;

		public String getVIN_PATRN_SURR_KEY() {
			return this.VIN_PATRN_SURR_KEY;
		}

		public String VEHICLE_COUNT;

		public String getVEHICLE_COUNT() {
			return this.VEHICLE_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_Ford_Fact_Files_NV_UV_Part1) {

				try {

					int length = 0;

					this.TRACTZIP_SAKEY = readString(dis);

					this.REPORT_YEAR_MONTH = readString(dis);

					this.MAKE_MODEL_CODE = readString(dis);

					this.MAKE_TEXT = readString(dis);

					this.GENDER_CODE = readString(dis);

					this.AGE_CODE = readString(dis);

					this.ETHNIC_KEY = readString(dis);

					this.EST_HH_INCOME_CODE = readString(dis);

					this.CERTIFIED_PRE_OWNED = readString(dis);

					this.CERTIFIED_DESC = readString(dis);

					this.FIRST_TIME_USED_IND = readString(dis);

					this.OFF_LEASE_CODE = readString(dis);

					this.TRGT_INC = readString(dis);

					this.VIN_PATRN = readString(dis);

					this.VIN_PATRN_SURR_KEY = readString(dis);

					this.VEHICLE_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TRACTZIP_SAKEY, dos);

				// String

				writeString(this.REPORT_YEAR_MONTH, dos);

				// String

				writeString(this.MAKE_MODEL_CODE, dos);

				// String

				writeString(this.MAKE_TEXT, dos);

				// String

				writeString(this.GENDER_CODE, dos);

				// String

				writeString(this.AGE_CODE, dos);

				// String

				writeString(this.ETHNIC_KEY, dos);

				// String

				writeString(this.EST_HH_INCOME_CODE, dos);

				// String

				writeString(this.CERTIFIED_PRE_OWNED, dos);

				// String

				writeString(this.CERTIFIED_DESC, dos);

				// String

				writeString(this.FIRST_TIME_USED_IND, dos);

				// String

				writeString(this.OFF_LEASE_CODE, dos);

				// String

				writeString(this.TRGT_INC, dos);

				// String

				writeString(this.VIN_PATRN, dos);

				// String

				writeString(this.VIN_PATRN_SURR_KEY, dos);

				// String

				writeString(this.VEHICLE_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRACTZIP_SAKEY=" + TRACTZIP_SAKEY);
			sb.append(",REPORT_YEAR_MONTH=" + REPORT_YEAR_MONTH);
			sb.append(",MAKE_MODEL_CODE=" + MAKE_MODEL_CODE);
			sb.append(",MAKE_TEXT=" + MAKE_TEXT);
			sb.append(",GENDER_CODE=" + GENDER_CODE);
			sb.append(",AGE_CODE=" + AGE_CODE);
			sb.append(",ETHNIC_KEY=" + ETHNIC_KEY);
			sb.append(",EST_HH_INCOME_CODE=" + EST_HH_INCOME_CODE);
			sb.append(",CERTIFIED_PRE_OWNED=" + CERTIFIED_PRE_OWNED);
			sb.append(",CERTIFIED_DESC=" + CERTIFIED_DESC);
			sb.append(",FIRST_TIME_USED_IND=" + FIRST_TIME_USED_IND);
			sb.append(",OFF_LEASE_CODE=" + OFF_LEASE_CODE);
			sb.append(",TRGT_INC=" + TRGT_INC);
			sb.append(",VIN_PATRN=" + VIN_PATRN);
			sb.append(",VIN_PATRN_SURR_KEY=" + VIN_PATRN_SURR_KEY);
			sb.append(",VEHICLE_COUNT=" + VEHICLE_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TRACTZIP_SAKEY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRACTZIP_SAKEY);
			}

			sb.append("|");

			if (REPORT_YEAR_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_YEAR_MONTH);
			}

			sb.append("|");

			if (MAKE_MODEL_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(MAKE_MODEL_CODE);
			}

			sb.append("|");

			if (MAKE_TEXT == null) {
				sb.append("<null>");
			} else {
				sb.append(MAKE_TEXT);
			}

			sb.append("|");

			if (GENDER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(GENDER_CODE);
			}

			sb.append("|");

			if (AGE_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(AGE_CODE);
			}

			sb.append("|");

			if (ETHNIC_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(ETHNIC_KEY);
			}

			sb.append("|");

			if (EST_HH_INCOME_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(EST_HH_INCOME_CODE);
			}

			sb.append("|");

			if (CERTIFIED_PRE_OWNED == null) {
				sb.append("<null>");
			} else {
				sb.append(CERTIFIED_PRE_OWNED);
			}

			sb.append("|");

			if (CERTIFIED_DESC == null) {
				sb.append("<null>");
			} else {
				sb.append(CERTIFIED_DESC);
			}

			sb.append("|");

			if (FIRST_TIME_USED_IND == null) {
				sb.append("<null>");
			} else {
				sb.append(FIRST_TIME_USED_IND);
			}

			sb.append("|");

			if (OFF_LEASE_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(OFF_LEASE_CODE);
			}

			sb.append("|");

			if (TRGT_INC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRGT_INC);
			}

			sb.append("|");

			if (VIN_PATRN == null) {
				sb.append("<null>");
			} else {
				sb.append(VIN_PATRN);
			}

			sb.append("|");

			if (VIN_PATRN_SURR_KEY == null) {
				sb.append("<null>");
			} else {
				sb.append(VIN_PATRN_SURR_KEY);
			}

			sb.append("|");

			if (VEHICLE_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT);
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

				row3Struct row3 = new row3Struct();

				/**
				 * [tFileOutputDelimited_3 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_3", false);
				start_Hash.put("tFileOutputDelimited_3",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_3";

				int tos_count_tFileOutputDelimited_3 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_3 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_3 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_3.append("Parameters:");
				log4jParamters_tFileOutputDelimited_3.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3
						.append("FILENAME"
								+ " = "
								+ "context.shipping+\"/\"+context.reportYear+context.mDrive+\"/Ford_Fact_Files/NVUV/\"+context.reportMonth+\"/FORD_USED_FACT_\" + context.reportMonth + \"_\" + context.startDate + \".txt\"");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("FIELDSEPARATOR"
						+ " = " + "\"|\"");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("COMPRESS" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("ROW_MODE" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("DELETE_EMPTYFILE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_3 - "
							+ log4jParamters_tFileOutputDelimited_3);

				String fileName_tFileOutputDelimited_3 = "";
				fileName_tFileOutputDelimited_3 = (new java.io.File(
						context.shipping + "/" + context.reportYear
								+ context.mDrive + "/Ford_Fact_Files/NVUV/"
								+ context.reportMonth + "/FORD_USED_FACT_"
								+ context.reportMonth + "_" + context.startDate
								+ ".txt")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_3 = null;
				String extension_tFileOutputDelimited_3 = null;
				String directory_tFileOutputDelimited_3 = null;
				if ((fileName_tFileOutputDelimited_3.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_3.lastIndexOf(".") < fileName_tFileOutputDelimited_3
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
						extension_tFileOutputDelimited_3 = "";
					} else {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3
								.substring(0, fileName_tFileOutputDelimited_3
										.lastIndexOf("."));
						extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3
								.substring(fileName_tFileOutputDelimited_3
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3
							.substring(0, fileName_tFileOutputDelimited_3
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_3.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3
								.substring(0, fileName_tFileOutputDelimited_3
										.lastIndexOf("."));
						extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3
								.substring(fileName_tFileOutputDelimited_3
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
						extension_tFileOutputDelimited_3 = "";
					}
					directory_tFileOutputDelimited_3 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_3 = true;
				java.io.File filetFileOutputDelimited_3 = new java.io.File(
						fileName_tFileOutputDelimited_3);
				globalMap.put("tFileOutputDelimited_3_FILE_NAME",
						fileName_tFileOutputDelimited_3);
				int nb_line_tFileOutputDelimited_3 = 0;
				int splitEvery_tFileOutputDelimited_3 = 1000;
				int splitedFileNo_tFileOutputDelimited_3 = 0;
				int currentRow_tFileOutputDelimited_3 = 0;

				final String OUT_DELIM_tFileOutputDelimited_3 = /**
				 * Start field
				 * tFileOutputDelimited_3:FIELDSEPARATOR
				 */
				"|"/** End field tFileOutputDelimited_3:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_3 = /**
				 * Start
				 * field tFileOutputDelimited_3:ROWSEPARATOR
				 */
				"\r\n"/** End field tFileOutputDelimited_3:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_3 != null
						&& directory_tFileOutputDelimited_3.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_3 = new java.io.File(
							directory_tFileOutputDelimited_3);
					if (!dir_tFileOutputDelimited_3.exists()) {
						log.info("tFileOutputDelimited_3 - Creating directory '"
								+ dir_tFileOutputDelimited_3.getCanonicalPath()
								+ "'.");
						dir_tFileOutputDelimited_3.mkdirs();
						log.info("tFileOutputDelimited_3 - The directory '"
								+ dir_tFileOutputDelimited_3.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_3 = null;

				java.io.File fileToDelete_tFileOutputDelimited_3 = new java.io.File(
						fileName_tFileOutputDelimited_3);
				if (fileToDelete_tFileOutputDelimited_3.exists()) {
					fileToDelete_tFileOutputDelimited_3.delete();
				}
				outtFileOutputDelimited_3 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_3, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_3.length() == 0) {
						outtFileOutputDelimited_3.write("TRACTZIP_SAKEY");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("REPORT_YEAR_MONTH");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("MAKE_MODEL_CODE");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("MAKE_TEXT");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("GENDER_CODE");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("AGE_CODE");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("ETHNIC_KEY");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("EST_HH_INCOME_CODE");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("CERTIFIED_PRE_OWNED");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("CERTIFIED_DESC");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("FIRST_TIME_USED_IND");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("OFF_LEASE_CODE");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("TRGT_INC");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("VIN_PATRN");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("VIN_PATRN_SURR_KEY");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("VEHICLE_COUNT");
						outtFileOutputDelimited_3
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_3",
						outtFileOutputDelimited_3);
				resourceMap.put("nb_line_tFileOutputDelimited_3",
						nb_line_tFileOutputDelimited_3);

				/**
				 * [tFileOutputDelimited_3 begin ] stop
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
				log4jParamters_tOracleInput_3.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3
						.append("QUERY"
								+ " = "
								+ "\"  SELECT UF.TRACTZIP_SAKEY,          --REFERENCES STANDARD/CUSTOM_GEOGRAPHY              REPORT_YEAR_MONTH,                        --REFERENCES TIME_PERIOD              MAKE_MODEL_CODE, --REFERENCES CUSTOM_MAKE_MODEL_FOR /REF_NBR FOR VEHICLE_ATTRIBUTES              MAKE_TEXT,              GENDER_CODE,              AGE_CODE,              ETHNIC_KEY,              EST_HH_INCOME_CODE,              CASE                 WHEN MAKE_TEXT = 'FOR' THEN UF.CERTIFIED_USED_VEHICLE                 WHEN MAKE_TEXT = 'LIN' THEN UF.CERTIFIED_USED_VEHICLE                 ELSE NULL              END  CERTIFIED_PRE_OWNED,              CP.CUV_DESC CERTIFIED_DESC,                          FIRST_TIME_USED_IND,              OFF_LEASE_CODE,              TRGT_INC,              VIN_PATRN,              VIN_PATRN_SURR_KEY,              SUM (VEHICLE_COUNT) VEHICLE_COUNT         FROM USED_FACT UF,              STANDARD_GEOGRAPHY SG,              CUSTOM_PARAMETERS_FMC CP        WHERE     UF.TRACTZIP_SAKEY = SG.TRACTZIP_SAKEY              --AND SG.CT_STATE_ABBRV IN ('MD', 'TX', 'FL')              AND UF.CERTIFIED_USED_VEHICLE = CP.CUV(+)     GROUP BY UF.TRACTZIP_SAKEY,              REPORT_YEAR_MONTH,              MAKE_MODEL_CODE,              MAKE_TEXT,              GENDER_CODE,              AGE_CODE,              ETHNIC_KEY,              EST_HH_INCOME_CODE,              CASE                 WHEN MAKE_TEXT = 'FOR' THEN UF.CERTIFIED_USED_VEHICLE                 WHEN MAKE_TEXT = 'LIN' THEN UF.CERTIFIED_USED_VEHICLE                 ELSE NULL              END,              CUV_DESC,              FIRST_TIME_USED_IND,              OFF_LEASE_CODE,              TRGT_INC,              VIN_PATRN,              VIN_PATRN_SURR_KEY  \"    ");
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
						+ ("TRACTZIP_SAKEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_YEAR_MONTH")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MAKE_MODEL_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("MAKE_TEXT") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("GENDER_CODE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("AGE_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ETHNIC_KEY") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("EST_HH_INCOME_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CERTIFIED_PRE_OWNED")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("CERTIFIED_DESC") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("FIRST_TIME_USED_IND")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("OFF_LEASE_CODE") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TRGT_INC") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("VIN_PATRN")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("VIN_PATRN_SURR_KEY") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEHICLE_COUNT") + "}]");
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

				String dbquery_tOracleInput_3 = "\nSELECT UF.TRACTZIP_SAKEY,          --REFERENCES STANDARD/CUSTOM_GEOGRAPHY\n            REPORT_YEAR_MONTH,                        --REFERENCES TIME_PERIOD\n            MAKE_MODEL_CODE, --REFERENCES CUSTOM_MAKE_MODEL_FOR /REF_NBR FOR VEHICLE_ATTRIBUTES\n            MAKE_TEXT,\n            GENDER_CODE,\n            AGE_CODE,\n            ETHNIC_KEY,\n            EST_HH_INCOME_CODE,\n            CASE\n               WHEN MAKE_TEXT = 'FOR' THEN UF.CERTIFIED_USED_VEHICLE\n               WHEN MAKE_TEXT = 'LIN' THEN UF.CERTIFIED_USED_VEHICLE\n               ELSE NULL\n            END  CERTIFIED_PRE_OWNED,\n            CP.CUV_DESC CERTIFIED_DESC,            \n            FIRST_TIME_USED_IND,\n            OFF_LEASE_CODE,\n            TRGT_INC,\n            VIN_PATRN,\n            VIN_PATRN_SURR_KEY,\n            SUM (VEHICLE_COUNT) VEHICLE_COUNT\n       FROM USED_FACT UF,\n            STANDARD_GEOGRAPHY SG,\n            CUSTOM_PARAMETERS_FMC CP\n      WHERE     UF.TRACTZIP_SAKEY = SG.TRACTZIP_SAKEY\n            --AND SG.CT_STATE_ABBRV IN ('MD', 'TX', 'FL')\n            AND UF.CERTIFIED_USED_VEHICLE = CP.CUV(+)\n   GROUP BY UF.TRACTZIP_SAKEY,\n            REPORT_YEAR_MONTH,\n            MAKE_MODEL_CODE,\n            MAKE_TEXT,\n            GENDER_CODE,\n            AGE_CODE,\n            ETHNIC_KEY,\n            EST_HH_INCOME_CODE,\n            CASE\n               WHEN MAKE_TEXT = 'FOR' THEN UF.CERTIFIED_USED_VEHICLE\n               WHEN MAKE_TEXT = 'LIN' THEN UF.CERTIFIED_USED_VEHICLE\n               ELSE NULL\n            END,\n            CUV_DESC,\n            FIRST_TIME_USED_IND,\n            OFF_LEASE_CODE,\n            TRGT_INC,\n            VIN_PATRN,\n            VIN_PATRN_SURR_KEY\n"

				;

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
							row3.TRACTZIP_SAKEY = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(1);
							if (tmpContent_tOracleInput_3 != null) {
								row3.TRACTZIP_SAKEY = tmpContent_tOracleInput_3;
							} else {
								row3.TRACTZIP_SAKEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 2) {
							row3.REPORT_YEAR_MONTH = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(2);
							if (tmpContent_tOracleInput_3 != null) {
								row3.REPORT_YEAR_MONTH = tmpContent_tOracleInput_3;
							} else {
								row3.REPORT_YEAR_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 3) {
							row3.MAKE_MODEL_CODE = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(3);
							if (tmpContent_tOracleInput_3 != null) {
								row3.MAKE_MODEL_CODE = tmpContent_tOracleInput_3;
							} else {
								row3.MAKE_MODEL_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 4) {
							row3.MAKE_TEXT = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(4);
							if (tmpContent_tOracleInput_3 != null) {
								row3.MAKE_TEXT = tmpContent_tOracleInput_3;
							} else {
								row3.MAKE_TEXT = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 5) {
							row3.GENDER_CODE = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(5);
							if (tmpContent_tOracleInput_3 != null) {
								row3.GENDER_CODE = tmpContent_tOracleInput_3;
							} else {
								row3.GENDER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 6) {
							row3.AGE_CODE = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(6);
							if (tmpContent_tOracleInput_3 != null) {
								row3.AGE_CODE = tmpContent_tOracleInput_3;
							} else {
								row3.AGE_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 7) {
							row3.ETHNIC_KEY = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(7);
							if (tmpContent_tOracleInput_3 != null) {
								row3.ETHNIC_KEY = tmpContent_tOracleInput_3;
							} else {
								row3.ETHNIC_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 8) {
							row3.EST_HH_INCOME_CODE = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(8);
							if (tmpContent_tOracleInput_3 != null) {
								row3.EST_HH_INCOME_CODE = tmpContent_tOracleInput_3;
							} else {
								row3.EST_HH_INCOME_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 9) {
							row3.CERTIFIED_PRE_OWNED = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(9);
							if (tmpContent_tOracleInput_3 != null) {
								row3.CERTIFIED_PRE_OWNED = tmpContent_tOracleInput_3;
							} else {
								row3.CERTIFIED_PRE_OWNED = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 10) {
							row3.CERTIFIED_DESC = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(10);
							if (tmpContent_tOracleInput_3 != null) {
								row3.CERTIFIED_DESC = tmpContent_tOracleInput_3;
							} else {
								row3.CERTIFIED_DESC = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 11) {
							row3.FIRST_TIME_USED_IND = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(11);
							if (tmpContent_tOracleInput_3 != null) {
								row3.FIRST_TIME_USED_IND = tmpContent_tOracleInput_3;
							} else {
								row3.FIRST_TIME_USED_IND = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 12) {
							row3.OFF_LEASE_CODE = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(12);
							if (tmpContent_tOracleInput_3 != null) {
								row3.OFF_LEASE_CODE = tmpContent_tOracleInput_3;
							} else {
								row3.OFF_LEASE_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 13) {
							row3.TRGT_INC = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(13);
							if (tmpContent_tOracleInput_3 != null) {
								row3.TRGT_INC = tmpContent_tOracleInput_3;
							} else {
								row3.TRGT_INC = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 14) {
							row3.VIN_PATRN = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(14);
							if (tmpContent_tOracleInput_3 != null) {
								row3.VIN_PATRN = tmpContent_tOracleInput_3;
							} else {
								row3.VIN_PATRN = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 15) {
							row3.VIN_PATRN_SURR_KEY = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(15);
							if (tmpContent_tOracleInput_3 != null) {
								row3.VIN_PATRN_SURR_KEY = tmpContent_tOracleInput_3;
							} else {
								row3.VIN_PATRN_SURR_KEY = null;
							}
						}
						if (colQtyInRs_tOracleInput_3 < 16) {
							row3.VEHICLE_COUNT = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(16);
							if (tmpContent_tOracleInput_3 != null) {
								row3.VEHICLE_COUNT = tmpContent_tOracleInput_3;
							} else {
								row3.VEHICLE_COUNT = null;
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
						 * [tFileOutputDelimited_3 main ] start
						 */

						currentComponent = "tFileOutputDelimited_3";

						if (log.isTraceEnabled()) {
							log.trace("row3 - "
									+ (row3 == null ? "" : row3.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_3 = new StringBuilder();
						if (row3.TRACTZIP_SAKEY != null) {
							sb_tFileOutputDelimited_3
									.append(row3.TRACTZIP_SAKEY);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.REPORT_YEAR_MONTH != null) {
							sb_tFileOutputDelimited_3
									.append(row3.REPORT_YEAR_MONTH);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.MAKE_MODEL_CODE != null) {
							sb_tFileOutputDelimited_3
									.append(row3.MAKE_MODEL_CODE);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.MAKE_TEXT != null) {
							sb_tFileOutputDelimited_3.append(row3.MAKE_TEXT);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.GENDER_CODE != null) {
							sb_tFileOutputDelimited_3.append(row3.GENDER_CODE);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.AGE_CODE != null) {
							sb_tFileOutputDelimited_3.append(row3.AGE_CODE);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.ETHNIC_KEY != null) {
							sb_tFileOutputDelimited_3.append(row3.ETHNIC_KEY);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.EST_HH_INCOME_CODE != null) {
							sb_tFileOutputDelimited_3
									.append(row3.EST_HH_INCOME_CODE);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.CERTIFIED_PRE_OWNED != null) {
							sb_tFileOutputDelimited_3
									.append(row3.CERTIFIED_PRE_OWNED);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.CERTIFIED_DESC != null) {
							sb_tFileOutputDelimited_3
									.append(row3.CERTIFIED_DESC);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.FIRST_TIME_USED_IND != null) {
							sb_tFileOutputDelimited_3
									.append(row3.FIRST_TIME_USED_IND);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.OFF_LEASE_CODE != null) {
							sb_tFileOutputDelimited_3
									.append(row3.OFF_LEASE_CODE);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.TRGT_INC != null) {
							sb_tFileOutputDelimited_3.append(row3.TRGT_INC);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.VIN_PATRN != null) {
							sb_tFileOutputDelimited_3.append(row3.VIN_PATRN);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.VIN_PATRN_SURR_KEY != null) {
							sb_tFileOutputDelimited_3
									.append(row3.VIN_PATRN_SURR_KEY);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row3.VEHICLE_COUNT != null) {
							sb_tFileOutputDelimited_3
									.append(row3.VEHICLE_COUNT);
						}
						sb_tFileOutputDelimited_3
								.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_3++;
							resourceMap.put("nb_line_tFileOutputDelimited_3",
									nb_line_tFileOutputDelimited_3);

							outtFileOutputDelimited_3
									.write(sb_tFileOutputDelimited_3.toString());
							log.debug("tFileOutputDelimited_3 - Writing the record "
									+ nb_line_tFileOutputDelimited_3 + ".");

						}

						tos_count_tFileOutputDelimited_3++;

						/**
						 * [tFileOutputDelimited_3 main ] stop
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
				 * [tFileOutputDelimited_3 end ] start
				 */

				currentComponent = "tFileOutputDelimited_3";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_3 != null) {
						outtFileOutputDelimited_3.flush();
						outtFileOutputDelimited_3.close();
					}

					globalMap.put("tFileOutputDelimited_3_NB_LINE",
							nb_line_tFileOutputDelimited_3);
					globalMap.put("tFileOutputDelimited_3_FILE_NAME",
							fileName_tFileOutputDelimited_3);

				}

				resourceMap.put("finish_tFileOutputDelimited_3", true);

				log.info("tFileOutputDelimited_3 - Written records count: "
						+ nb_line_tFileOutputDelimited_3 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_3 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_3", true);
				end_Hash.put("tFileOutputDelimited_3",
						System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_3 end ] stop
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
				 * [tFileOutputDelimited_3 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_3";

				if (resourceMap.get("finish_tFileOutputDelimited_3") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_3 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_3");
						if (outtFileOutputDelimited_3 != null) {
							outtFileOutputDelimited_3.flush();
							outtFileOutputDelimited_3.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_3 finally ] stop
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

	public void tPostjob_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

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
				 * [tPostjob_1 begin ] start
				 */

				ok_Hash.put("tPostjob_1", false);
				start_Hash.put("tPostjob_1", System.currentTimeMillis());

				currentComponent = "tPostjob_1";

				int tos_count_tPostjob_1 = 0;

				/**
				 * [tPostjob_1 begin ] stop
				 */

				/**
				 * [tPostjob_1 main ] start
				 */

				currentComponent = "tPostjob_1";

				tos_count_tPostjob_1++;

				/**
				 * [tPostjob_1 main ] stop
				 */

				/**
				 * [tPostjob_1 end ] start
				 */

				currentComponent = "tPostjob_1";

				ok_Hash.put("tPostjob_1", true);
				end_Hash.put("tPostjob_1", System.currentTimeMillis());

				tFileList_2Process(globalMap);

				/**
				 * [tPostjob_1 end ] stop
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
				 * [tPostjob_1 finally ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}

	public void tPrejob_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

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
				 * [tPrejob_1 begin ] start
				 */

				ok_Hash.put("tPrejob_1", false);
				start_Hash.put("tPrejob_1", System.currentTimeMillis());

				currentComponent = "tPrejob_1";

				int tos_count_tPrejob_1 = 0;

				/**
				 * [tPrejob_1 begin ] stop
				 */

				/**
				 * [tPrejob_1 main ] start
				 */

				currentComponent = "tPrejob_1";

				tos_count_tPrejob_1++;

				/**
				 * [tPrejob_1 main ] stop
				 */

				/**
				 * [tPrejob_1 end ] start
				 */

				currentComponent = "tPrejob_1";

				ok_Hash.put("tPrejob_1", true);
				end_Hash.put("tPrejob_1", System.currentTimeMillis());

				tFileInputDelimited_2Process(globalMap);

				/**
				 * [tPrejob_1 end ] stop
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
				 * [tPrejob_1 finally ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
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
	public String contextStr = "Dev";
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
		final AIS_Monthly_Ford_Fact_Files_NV_UV_Part1 AIS_Monthly_Ford_Fact_Files_NV_UV_Part1Class = new AIS_Monthly_Ford_Fact_Files_NV_UV_Part1();

		int exitCode = AIS_Monthly_Ford_Fact_Files_NV_UV_Part1Class
				.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'AIS_Monthly_Ford_Fact_Files_NV_UV_Part1' - Done.");
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
		log.info("TalendJob: 'AIS_Monthly_Ford_Fact_Files_NV_UV_Part1' - Start.");

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
			java.io.InputStream inContext = AIS_Monthly_Ford_Fact_Files_NV_UV_Part1.class
					.getClassLoader().getResourceAsStream(
							"ap_unix/ais_monthly_ford_fact_files_nv_uv_part1_0_1/contexts/"
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
			context.altEmailCC = (String) context.getProperty("altEmailCC");
			context.altEmailTo = (String) context.getProperty("altEmailTo");
			context.client = (String) context.getProperty("client");
			context.eftpDirectory = (String) context
					.getProperty("eftpDirectory");
			context.eftpHost = (String) context.getProperty("eftpHost");
			context.eftpPassword = (String) context.getProperty("eftpPassword");
			context.eftpUser = (String) context.getProperty("eftpUser");
			context.emailBcc = (String) context.getProperty("emailBcc");
			context.emailCC = (String) context.getProperty("emailCC");
			context.emailFrom = (String) context.getProperty("emailFrom");
			context.emailTo = (String) context.getProperty("emailTo");
			context.expiredReportMonth = (String) context
					.getProperty("expiredReportMonth");
			context.jobNumber = (String) context.getProperty("jobNumber");
			context.lastReportMonth = (String) context
					.getProperty("lastReportMonth");
			context.resourceInt = (String) context.getProperty("resourceInt");
			context.runIt = (String) context.getProperty("runIt");
			context.salesCostCenter = (String) context
					.getProperty("salesCostCenter");
			context.salesEmail = (String) context.getProperty("salesEmail");
			context.salesName = (String) context.getProperty("salesName");
			context.salesSignature = (String) context
					.getProperty("salesSignature");
			context.shipIt = (String) context.getProperty("shipIt");
			context.startDate = (String) context.getProperty("startDate");
			context.prevYear = (String) context.getProperty("prevYear");
			context.reportMonth = (String) context.getProperty("reportMonth");
			context.reportYear = (String) context.getProperty("reportYear");
			context.rMonth = (String) context.getProperty("rMonth");
			context.rMth = (String) context.getProperty("rMth");
			context.dbHostName = (String) context.getProperty("dbHostName");
			context.dbName = (String) context.getProperty("dbName");
			context.dbPassword = (String) context.getProperty("dbPassword");
			context.dbSchema = (String) context.getProperty("dbSchema");
			context.dbUser = (String) context.getProperty("dbUser");
			context.ftpDirectory = (String) context.getProperty("ftpDirectory");
			context.ftpHost = (String) context.getProperty("ftpHost");
			context.ftpPassword = (String) context.getProperty("ftpPassword");
			context.ftpUser = (String) context.getProperty("ftpUser");
			context.prodEmail = (String) context.getProperty("prodEmail");
			context.salesPhone = (String) context.getProperty("salesPhone");
			context.salesTitle = (String) context.getProperty("salesTitle");
			context.shipEmail = (String) context.getProperty("shipEmail");
			context.smtpHost = (String) context.getProperty("smtpHost");
			context.dbVersion = (String) context.getProperty("dbVersion");
			context.lineFeed = (String) context.getProperty("lineFeed");
			context.localDirectory = (String) context
					.getProperty("localDirectory");
			context.mDrive = (String) context.getProperty("mDrive");
			context.shipping = (String) context.getProperty("shipping");
			context.slash = (String) context.getProperty("slash");
			context.pgpKeyRecipient = (String) context
					.getProperty("pgpKeyRecipient");
			context.pgpFileName = (String) context.getProperty("pgpFileName");
			try {
				context.fileRowCount = routines.system.ParserUtils
						.parseTo_Integer(context.getProperty("fileRowCount"));
			} catch (NumberFormatException e) {
				context.fileRowCount = null;
			}
			context.jobID = (String) context.getProperty("jobID");
			context.fileName = (String) context.getProperty("fileName");
			context.dbUserPI = (String) context.getProperty("dbUserPI");
			context.dbPasswordPI = (String) context.getProperty("dbPasswordPI");
			context.dbHostNamePI = (String) context.getProperty("dbHostNamePI");
			context.dbNamePI = (String) context.getProperty("dbNamePI");
			context.dbSchemaPI = (String) context.getProperty("dbSchemaPI");
			context.reportMonth1 = (String) context.getProperty("reportMonth1");
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
			if (parentContextMap.containsKey("altEmailCC")) {
				context.altEmailCC = (String) parentContextMap
						.get("altEmailCC");
			}
			if (parentContextMap.containsKey("altEmailTo")) {
				context.altEmailTo = (String) parentContextMap
						.get("altEmailTo");
			}
			if (parentContextMap.containsKey("client")) {
				context.client = (String) parentContextMap.get("client");
			}
			if (parentContextMap.containsKey("eftpDirectory")) {
				context.eftpDirectory = (String) parentContextMap
						.get("eftpDirectory");
			}
			if (parentContextMap.containsKey("eftpHost")) {
				context.eftpHost = (String) parentContextMap.get("eftpHost");
			}
			if (parentContextMap.containsKey("eftpPassword")) {
				context.eftpPassword = (String) parentContextMap
						.get("eftpPassword");
			}
			if (parentContextMap.containsKey("eftpUser")) {
				context.eftpUser = (String) parentContextMap.get("eftpUser");
			}
			if (parentContextMap.containsKey("emailBcc")) {
				context.emailBcc = (String) parentContextMap.get("emailBcc");
			}
			if (parentContextMap.containsKey("emailCC")) {
				context.emailCC = (String) parentContextMap.get("emailCC");
			}
			if (parentContextMap.containsKey("emailFrom")) {
				context.emailFrom = (String) parentContextMap.get("emailFrom");
			}
			if (parentContextMap.containsKey("emailTo")) {
				context.emailTo = (String) parentContextMap.get("emailTo");
			}
			if (parentContextMap.containsKey("expiredReportMonth")) {
				context.expiredReportMonth = (String) parentContextMap
						.get("expiredReportMonth");
			}
			if (parentContextMap.containsKey("jobNumber")) {
				context.jobNumber = (String) parentContextMap.get("jobNumber");
			}
			if (parentContextMap.containsKey("lastReportMonth")) {
				context.lastReportMonth = (String) parentContextMap
						.get("lastReportMonth");
			}
			if (parentContextMap.containsKey("resourceInt")) {
				context.resourceInt = (String) parentContextMap
						.get("resourceInt");
			}
			if (parentContextMap.containsKey("runIt")) {
				context.runIt = (String) parentContextMap.get("runIt");
			}
			if (parentContextMap.containsKey("salesCostCenter")) {
				context.salesCostCenter = (String) parentContextMap
						.get("salesCostCenter");
			}
			if (parentContextMap.containsKey("salesEmail")) {
				context.salesEmail = (String) parentContextMap
						.get("salesEmail");
			}
			if (parentContextMap.containsKey("salesName")) {
				context.salesName = (String) parentContextMap.get("salesName");
			}
			if (parentContextMap.containsKey("salesSignature")) {
				context.salesSignature = (String) parentContextMap
						.get("salesSignature");
			}
			if (parentContextMap.containsKey("shipIt")) {
				context.shipIt = (String) parentContextMap.get("shipIt");
			}
			if (parentContextMap.containsKey("startDate")) {
				context.startDate = (String) parentContextMap.get("startDate");
			}
			if (parentContextMap.containsKey("prevYear")) {
				context.prevYear = (String) parentContextMap.get("prevYear");
			}
			if (parentContextMap.containsKey("reportMonth")) {
				context.reportMonth = (String) parentContextMap
						.get("reportMonth");
			}
			if (parentContextMap.containsKey("reportYear")) {
				context.reportYear = (String) parentContextMap
						.get("reportYear");
			}
			if (parentContextMap.containsKey("rMonth")) {
				context.rMonth = (String) parentContextMap.get("rMonth");
			}
			if (parentContextMap.containsKey("rMth")) {
				context.rMth = (String) parentContextMap.get("rMth");
			}
			if (parentContextMap.containsKey("dbHostName")) {
				context.dbHostName = (String) parentContextMap
						.get("dbHostName");
			}
			if (parentContextMap.containsKey("dbName")) {
				context.dbName = (String) parentContextMap.get("dbName");
			}
			if (parentContextMap.containsKey("dbPassword")) {
				context.dbPassword = (String) parentContextMap
						.get("dbPassword");
			}
			if (parentContextMap.containsKey("dbSchema")) {
				context.dbSchema = (String) parentContextMap.get("dbSchema");
			}
			if (parentContextMap.containsKey("dbUser")) {
				context.dbUser = (String) parentContextMap.get("dbUser");
			}
			if (parentContextMap.containsKey("ftpDirectory")) {
				context.ftpDirectory = (String) parentContextMap
						.get("ftpDirectory");
			}
			if (parentContextMap.containsKey("ftpHost")) {
				context.ftpHost = (String) parentContextMap.get("ftpHost");
			}
			if (parentContextMap.containsKey("ftpPassword")) {
				context.ftpPassword = (String) parentContextMap
						.get("ftpPassword");
			}
			if (parentContextMap.containsKey("ftpUser")) {
				context.ftpUser = (String) parentContextMap.get("ftpUser");
			}
			if (parentContextMap.containsKey("prodEmail")) {
				context.prodEmail = (String) parentContextMap.get("prodEmail");
			}
			if (parentContextMap.containsKey("salesPhone")) {
				context.salesPhone = (String) parentContextMap
						.get("salesPhone");
			}
			if (parentContextMap.containsKey("salesTitle")) {
				context.salesTitle = (String) parentContextMap
						.get("salesTitle");
			}
			if (parentContextMap.containsKey("shipEmail")) {
				context.shipEmail = (String) parentContextMap.get("shipEmail");
			}
			if (parentContextMap.containsKey("smtpHost")) {
				context.smtpHost = (String) parentContextMap.get("smtpHost");
			}
			if (parentContextMap.containsKey("dbVersion")) {
				context.dbVersion = (String) parentContextMap.get("dbVersion");
			}
			if (parentContextMap.containsKey("lineFeed")) {
				context.lineFeed = (String) parentContextMap.get("lineFeed");
			}
			if (parentContextMap.containsKey("localDirectory")) {
				context.localDirectory = (String) parentContextMap
						.get("localDirectory");
			}
			if (parentContextMap.containsKey("mDrive")) {
				context.mDrive = (String) parentContextMap.get("mDrive");
			}
			if (parentContextMap.containsKey("shipping")) {
				context.shipping = (String) parentContextMap.get("shipping");
			}
			if (parentContextMap.containsKey("slash")) {
				context.slash = (String) parentContextMap.get("slash");
			}
			if (parentContextMap.containsKey("pgpKeyRecipient")) {
				context.pgpKeyRecipient = (String) parentContextMap
						.get("pgpKeyRecipient");
			}
			if (parentContextMap.containsKey("pgpFileName")) {
				context.pgpFileName = (String) parentContextMap
						.get("pgpFileName");
			}
			if (parentContextMap.containsKey("fileRowCount")) {
				context.fileRowCount = (Integer) parentContextMap
						.get("fileRowCount");
			}
			if (parentContextMap.containsKey("jobID")) {
				context.jobID = (String) parentContextMap.get("jobID");
			}
			if (parentContextMap.containsKey("fileName")) {
				context.fileName = (String) parentContextMap.get("fileName");
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
			if (parentContextMap.containsKey("reportMonth1")) {
				context.reportMonth1 = (String) parentContextMap
						.get("reportMonth1");
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

		try {
			errorCode = null;
			tPrejob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPrejob_1) {
			globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

			e_tPrejob_1.printStackTrace();

		}

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
					tOracleInput_1Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get())
							.get("status"))) {
						((java.util.Map) threadLocal.get())
								.put("status", "end");
					}
				} catch (TalendException e_tOracleInput_1) {
					globalMap.put("tOracleInput_1_SUBPROCESS_STATE", -1);

					e_tOracleInput_1.printStackTrace();

				} catch (Error e_tOracleInput_1) {
					globalMap.put("tOracleInput_1_SUBPROCESS_STATE", -1);

					e_tOracleInput_1.printStackTrace();

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

		runningThreadCount.add(1);
		new Thread() {
			public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

				try {
					((java.util.Map) threadLocal.get()).put("errorCode", null);
					tOracleInput_10Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get())
							.get("status"))) {
						((java.util.Map) threadLocal.get())
								.put("status", "end");
					}
				} catch (TalendException e_tOracleInput_10) {
					globalMap.put("tOracleInput_10_SUBPROCESS_STATE", -1);

					e_tOracleInput_10.printStackTrace();

				} catch (Error e_tOracleInput_10) {
					globalMap.put("tOracleInput_10_SUBPROCESS_STATE", -1);

					e_tOracleInput_10.printStackTrace();

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

		runningThreadCount.add(1);
		new Thread() {
			public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

				try {
					((java.util.Map) threadLocal.get()).put("errorCode", null);
					tOracleInput_3Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get())
							.get("status"))) {
						((java.util.Map) threadLocal.get())
								.put("status", "end");
					}
				} catch (TalendException e_tOracleInput_3) {
					globalMap.put("tOracleInput_3_SUBPROCESS_STATE", -1);

					e_tOracleInput_3.printStackTrace();

				} catch (Error e_tOracleInput_3) {
					globalMap.put("tOracleInput_3_SUBPROCESS_STATE", -1);

					e_tOracleInput_3.printStackTrace();

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

		try {
			errorCode = null;
			tPostjob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPostjob_1) {
			globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

			e_tPostjob_1.printStackTrace();

		}

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		if (false) {
			System.out
					.println((endUsedMemory - startUsedMemory)
							+ " bytes memory increase when running : AIS_Monthly_Ford_Fact_Files_NV_UV_Part1");
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