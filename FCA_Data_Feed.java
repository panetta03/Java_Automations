package ap_unix.ais_monthly_fcaserviceretention_sr_0_1;

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

//the import part of tJava_3
//import java.util.List;

//the import part of tJavaRow_7
//import java.util.List;

//the import part of tJavaRow_2
//import java.util.List;

//the import part of tJavaRow_6
//import java.util.List;

//the import part of tJavaRow_5
//import java.util.List;

//the import part of tJavaRow_3
//import java.util.List;

//the import part of tJava_2
//import java.util.List;

//the import part of tJava_1
//import java.util.List;

//the import part of tJava_9
//import java.util.List;

//the import part of tJava_4
//import java.util.List;

//the import part of tJavaRow_1
//import java.util.List;

//the import part of tJava_5
//import java.util.List;

//the import part of tJavaFlex_1
//import java.util.List;

@SuppressWarnings("unused")
/**
 * Job: AIS_Monthly_FCAServiceRetention_SR Purpose: FCA Service Retention<br>
 * Description: FCA Service Retention <br>
 * @author user@talend.com
 * @version 6.1.1.20151214_1327
 * @status 
 */
public class AIS_Monthly_FCAServiceRetention_SR implements TalendJob {
	static {
		System.setProperty("TalendJob.log",
				"AIS_Monthly_FCAServiceRetention_SR.log");
	}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(AIS_Monthly_FCAServiceRetention_SR.class);

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

			if (pgpKeyRecipient != null) {

				this.setProperty("pgpKeyRecipient", pgpKeyRecipient.toString());

			}

			if (pgpDir != null) {

				this.setProperty("pgpDir", pgpDir.toString());

			}

			if (pgpFileName != null) {

				this.setProperty("pgpFileName", pgpFileName.toString());

			}

			if (jobID != null) {

				this.setProperty("jobID", jobID.toString());

			}

			if (coinFTPHost != null) {

				this.setProperty("coinFTPHost", coinFTPHost.toString());

			}

			if (coinFTPUser != null) {

				this.setProperty("coinFTPUser", coinFTPUser.toString());

			}

			if (coinFTPPassword != null) {

				this.setProperty("coinFTPPassword", coinFTPPassword.toString());

			}

			if (coinFTPDirectory != null) {

				this.setProperty("coinFTPDirectory",
						coinFTPDirectory.toString());

			}

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

		}

		public String pgpKeyRecipient;

		public String getPgpKeyRecipient() {
			return this.pgpKeyRecipient;
		}

		public String pgpDir;

		public String getPgpDir() {
			return this.pgpDir;
		}

		public String pgpFileName;

		public String getPgpFileName() {
			return this.pgpFileName;
		}

		public String jobID;

		public String getJobID() {
			return this.jobID;
		}

		public String coinFTPHost;

		public String getCoinFTPHost() {
			return this.coinFTPHost;
		}

		public String coinFTPUser;

		public String getCoinFTPUser() {
			return this.coinFTPUser;
		}

		public String coinFTPPassword;

		public String getCoinFTPPassword() {
			return this.coinFTPPassword;
		}

		public String coinFTPDirectory;

		public String getCoinFTPDirectory() {
			return this.coinFTPDirectory;
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
	}

	private ContextProperties context = new ContextProperties();

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "AIS_Monthly_FCAServiceRetention_SR";
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
					AIS_Monthly_FCAServiceRetention_SR.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(AIS_Monthly_FCAServiceRetention_SR.this,
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

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tJava_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_4_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_4_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tJavaRow_7_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_4_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tOracleInput_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_6_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_6_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_3_error(Exception exception,
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

	public void tOracleInput_11_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_11_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_11_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_3_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tJavaRow_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent,
				globalMap);
	}

	public void tOracleInput_5_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tParallelize_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tParallelize_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_7_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputPositional_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_8_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputPositional_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_9_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputPositional_3_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_13_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_13_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputPositional_7_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_13_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_10_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputPositional_4_error(Exception exception,
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

	public void tFileOutputPositional_5_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_14_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_12_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_12_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputPositional_6_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_12_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleInput_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputPositional_8_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_1_error(Exception exception, String errorComponent,
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

	public void tJava_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSystem_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSystem_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_9_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tJava_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileCopy_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileCopy_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_9_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_10_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPConnection_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFTPConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPConnection_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFTPConnection_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPPut_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_6_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tJava_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_7_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSendMail_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileArchive_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileArchive_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_8_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSendMail_8_onSubJobError(exception, errorComponent, globalMap);
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

	public void tOracleRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleRow_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tOracleRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleRow_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_8_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPPut_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPPut_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPPut_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaFlex_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileRowCount_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFixedFlowInput_4_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_4_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSendMail_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDie_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDie_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFixedFlowInput_3_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_3_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFixedFlowInput_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_2_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tSendMail_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDie_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDie_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFixedFlowInput_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFixedFlowInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tCreateTemporaryFile_1_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileList_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSortRow_1_SortOut_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		tSortRow_1_SortIn_error(exception, errorComponent, globalMap);

	}

	public void tSortRow_1_SortIn_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSortRow_2_SortOut_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		tSortRow_2_SortIn_error(exception, errorComponent, globalMap);

	}

	public void tSortRow_2_SortIn_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSortRow_3_SortOut_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		tSortRow_3_SortIn_error(exception, errorComponent, globalMap);

	}

	public void tSortRow_3_SortIn_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSortRow_4_SortOut_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		tSortRow_4_SortIn_error(exception, errorComponent, globalMap);

	}

	public void tSortRow_4_SortIn_error(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tOracleInput_13_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_3_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_4_onSubJobError(Exception exception,
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

	public void tOracleInput_6_onSubJobError(Exception exception,
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

	public void tOracleInput_4_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tOracleInput_11_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_3_onSubJobError(Exception exception,
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

	public void tParallelize_1_onSubJobError(Exception exception,
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

	public void tOracleInput_8_onSubJobError(Exception exception,
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

	public void tOracleInput_13_onSubJobError(Exception exception,
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

	public void tOracleInput_12_onSubJobError(Exception exception,
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

	public void tFileList_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSystem_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_9_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileCopy_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_5_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_9_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_10_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPConnection_1_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPConnection_2_onSubJobError(Exception exception,
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

	public void tFileList_3_onSubJobError(Exception exception,
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

	public void tFileList_6_onSubJobError(Exception exception,
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

	public void tFileList_7_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSendMail_3_onSubJobError(Exception exception,
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

	public void tSendMail_8_onSubJobError(Exception exception,
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

	public void tOracleRow_1_onSubJobError(Exception exception,
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

	public void tFileList_8_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFixedFlowInput_4_onSubJobError(Exception exception,
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

	public void tDie_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFixedFlowInput_3_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFixedFlowInput_2_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSendMail_5_onSubJobError(Exception exception,
			String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread
				.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(),
				ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDie_1_onSubJobError(Exception exception,
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

				tJava_3Process(globalMap);

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

	public void tJava_3Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tJava_3_SUBPROCESS_STATE", 0);

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
				 * [tJava_3 begin ] start
				 */

				ok_Hash.put("tJava_3", false);
				start_Hash.put("tJava_3", System.currentTimeMillis());

				currentComponent = "tJava_3";

				int tos_count_tJava_3 = 0;

				context.slash = System.getProperty("file.separator");
				globalMap.put("error", false);

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

				tFileInputDelimited_4Process(globalMap);

				/**
				 * [tJava_3 end ] stop
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

		globalMap.put("tJava_3_SUBPROCESS_STATE", 1);
	}

	public static class row21Struct implements
			routines.system.IPersistableRow<row21Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

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
		public int compareTo(row21Struct other) {

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

	public void tFileInputDelimited_4Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileInputDelimited_4_SUBPROCESS_STATE", 0);

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

				row21Struct row21 = new row21Struct();

				/**
				 * [tJavaRow_7 begin ] start
				 */

				ok_Hash.put("tJavaRow_7", false);
				start_Hash.put("tJavaRow_7", System.currentTimeMillis());

				currentComponent = "tJavaRow_7";

				int tos_count_tJavaRow_7 = 0;

				int nb_line_tJavaRow_7 = 0;

				/**
				 * [tJavaRow_7 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_4 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_4", false);
				start_Hash.put("tFileInputDelimited_4",
						System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_4";

				int tos_count_tFileInputDelimited_4 = 0;

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_4 - " + "Start to work.");
				StringBuilder log4jParamters_tFileInputDelimited_4 = new StringBuilder();
				log4jParamters_tFileInputDelimited_4.append("Parameters:");
				log4jParamters_tFileInputDelimited_4
						.append("FILENAME"
								+ " = "
								+ "context.localDirectory+context.slash+\"AIS_OWNER_\"+context.dbVersion+\".txt\"");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("ROWSEPARATOR"
						+ " = " + "context.lineFeed");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("HEADER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("FOOTER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("LIMIT" + " = "
						+ "");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("REMOVE_EMPTY_ROW"
						+ " = " + "true");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("UNCOMPRESS"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("DIE_ON_ERROR"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("RANDOM" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("TRIMALL" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("TRIMSELECT"
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
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("CHECK_FIELDS_NUM"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("CHECK_DATE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("SPLITRECORD"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				log4jParamters_tFileInputDelimited_4.append("ENABLE_DECODE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_4 - "
							+ log4jParamters_tFileInputDelimited_4);

				final routines.system.RowState rowstate_tFileInputDelimited_4 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_4 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_4 = null;
				try {

					Object filename_tFileInputDelimited_4 = context.localDirectory
							+ context.slash
							+ "AIS_OWNER_"
							+ context.dbVersion
							+ ".txt";
					if (filename_tFileInputDelimited_4 instanceof java.io.InputStream) {

						int footer_value_tFileInputDelimited_4 = 0, random_value_tFileInputDelimited_4 = -1;
						if (footer_value_tFileInputDelimited_4 > 0
								|| random_value_tFileInputDelimited_4 > 0) {
							throw new java.lang.Exception(
									"When the input source is a stream,footer and random shouldn't be bigger than 0.");
						}

					}
					try {
						fid_tFileInputDelimited_4 = new org.talend.fileprocess.FileInputDelimited(
								context.localDirectory + context.slash
										+ "AIS_OWNER_" + context.dbVersion
										+ ".txt", "ISO-8859-15", ",",
								context.lineFeed, true, 0, 0, -1, -1, false);
					} catch (java.lang.Exception e) {

						log.error("tFileInputDelimited_4 - " + e.getMessage());

						System.err.println(e.getMessage());

					}

					log.info("tFileInputDelimited_4 - Retrieving records from the datasource.");

					while (fid_tFileInputDelimited_4 != null
							&& fid_tFileInputDelimited_4.nextRecord()) {
						rowstate_tFileInputDelimited_4.reset();

						row21 = null;

						boolean whetherReject_tFileInputDelimited_4 = false;
						row21 = new row21Struct();
						try {

							int columnIndexWithD_tFileInputDelimited_4 = 0;

							columnIndexWithD_tFileInputDelimited_4 = 0;

							row21.USER = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 1;

							row21.PASSWORD = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 2;

							row21.HST_NAME = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 3;

							row21.DB_NAME = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 4;

							row21.SCHEMA = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 5;

							row21.FTP_HOST = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 6;

							row21.FTP_USER = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 7;

							row21.FTP_PASSWORD = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 8;

							row21.PROD_EMAIL = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 9;

							row21.SHIP_EMAIL = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							columnIndexWithD_tFileInputDelimited_4 = 10;

							row21.SMTP_HOST = fid_tFileInputDelimited_4
									.get(columnIndexWithD_tFileInputDelimited_4);

							if (rowstate_tFileInputDelimited_4.getException() != null) {
								throw rowstate_tFileInputDelimited_4
										.getException();
							}

						} catch (java.lang.Exception e) {
							whetherReject_tFileInputDelimited_4 = true;

							log.error("tFileInputDelimited_4 - "
									+ e.getMessage());

							System.err.println(e.getMessage());
							row21 = null;

						}

						log.debug("tFileInputDelimited_4 - Retrieving the record "
								+ fid_tFileInputDelimited_4.getRowNumber()
								+ ".");

						/**
						 * [tFileInputDelimited_4 begin ] stop
						 */

						/**
						 * [tFileInputDelimited_4 main ] start
						 */

						currentComponent = "tFileInputDelimited_4";

						tos_count_tFileInputDelimited_4++;

						/**
						 * [tFileInputDelimited_4 main ] stop
						 */
						// Start of branch "row21"
						if (row21 != null) {

							/**
							 * [tJavaRow_7 main ] start
							 */

							currentComponent = "tJavaRow_7";

							if (log.isTraceEnabled()) {
								log.trace("row21 - "
										+ (row21 == null ? "" : row21
												.toLogString()));
							}

							// Code generate accord to input schema and output
							// schmea
							context.dbUser = row21.USER;
							context.dbPassword = row21.PASSWORD;
							context.dbHostName = row21.HST_NAME;
							context.dbName = row21.DB_NAME;
							context.dbSchema = row21.SCHEMA;
							context.ftpHost = row21.FTP_HOST;
							context.ftpUser = row21.FTP_USER;
							context.ftpPassword = row21.FTP_PASSWORD;
							context.prodEmail = row21.PROD_EMAIL;
							context.shipEmail = row21.SHIP_EMAIL;
							context.smtpHost = row21.SMTP_HOST;

							nb_line_tJavaRow_7++;

							tos_count_tJavaRow_7++;

							/**
							 * [tJavaRow_7 main ] stop
							 */

						} // End of branch "row21"

						/**
						 * [tFileInputDelimited_4 end ] start
						 */

						currentComponent = "tFileInputDelimited_4";

					}
				} finally {
					if (!((Object) (context.localDirectory + context.slash
							+ "AIS_OWNER_" + context.dbVersion + ".txt") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_4 != null) {
							fid_tFileInputDelimited_4.close();
						}
					}
					if (fid_tFileInputDelimited_4 != null) {
						globalMap.put("tFileInputDelimited_4_NB_LINE",
								fid_tFileInputDelimited_4.getRowNumber());

						log.info("tFileInputDelimited_4 - Retrieved records count: "
								+ fid_tFileInputDelimited_4.getRowNumber()
								+ ".");

					}
				}

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_4 - " + "Done.");

				ok_Hash.put("tFileInputDelimited_4", true);
				end_Hash.put("tFileInputDelimited_4",
						System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_4 end ] stop
				 */

				/**
				 * [tJavaRow_7 end ] start
				 */

				currentComponent = "tJavaRow_7";

				globalMap.put("tJavaRow_7_NB_LINE", nb_line_tJavaRow_7);

				ok_Hash.put("tJavaRow_7", true);
				end_Hash.put("tJavaRow_7", System.currentTimeMillis());

				tOracleInput_1Process(globalMap);

				/**
				 * [tJavaRow_7 end ] stop
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
				 * [tFileInputDelimited_4 finally ] start
				 */

				currentComponent = "tFileInputDelimited_4";

				/**
				 * [tFileInputDelimited_4 finally ] stop
				 */

				/**
				 * [tJavaRow_7 finally ] start
				 */

				currentComponent = "tJavaRow_7";

				/**
				 * [tJavaRow_7 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_4_SUBPROCESS_STATE", 1);
	}

	public static class row14Struct implements
			routines.system.IPersistableRow<row14Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

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
		public int compareTo(row14Struct other) {

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

				row14Struct row14 = new row14Struct();

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
						+ "context.dbHostName");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_1.append(" | ");
				log4jParamters_tOracleInput_1.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
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
								+ "\"SELECT JOB_NUMBER,CLIENT,  to_char(START_DATE, 'MM/DD/YY HH24:MI:SS'),  LAST_REPORT_MONTH,EXPIRED_REPORT_MONTH,EMAIL_TO,EMAIL_CC,RESOURCE_INT,  SALES_NAME,SALES_SIGNATURE,SALES_EMAIL,FTP_DIRECTORY,SHIP_IT,RUN_IT, SALES_COST_CENTER,  EMAIL_FROM, EMAIL_BCC,ALT_FTP, FTP_PASSWORD, FTP_HOST, FTP_USER,SALES_TITLE,SALES_PHONE,FTP_HOST2,FTP_USER2,FTP_PASSWORD2,FTP_DIRECTORY2,ALT_EMAIL_TO  FROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J, AIS_JOBS_SALES_STAFF S  WHERE JOB_ID = '\"+context.jobID+\"'  AND J.SALES_ID = S.SALES_ID\"");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_1 = context.dbUser;

				final String decryptedPassword_tOracleInput_1 = context.dbPassword;

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

				String dbquery_tOracleInput_1 = "SELECT JOB_NUMBER,CLIENT,\nto_char(START_DATE, 'MM/DD/YY HH24:MI:SS'),\nLAST_REPORT_MONTH,EXPIRED_REPORT_MONTH,EMAIL_TO,EMAIL_CC,RESOURCE_INT,\nSALES_NAME,SALES_SIGNATURE,SALES_EMAIL,FTP_DIRECTORY,SHIP_IT,RUN_IT, SALES_COST_CENTER,\nEMAIL_FROM, EMAIL_BCC,ALT_FTP, FTP_PASSWORD, FTP_HOST, FTP_USER,SALES_TITLE,SALES_PHONE,FTP_HOST2,FTP_USER2,FTP_PASSWORD2,FTP_DIRECTORY2,ALT_EMAIL_TO\nFROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J, AIS_JOBS_SALES_STAFF S\nWHERE JOB_ID = '"
						+ context.jobID + "'\nAND J.SALES_ID = S.SALES_ID";

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
							row14.JOB_NUMBER = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(1);
							if (tmpContent_tOracleInput_1 != null) {
								row14.JOB_NUMBER = tmpContent_tOracleInput_1;
							} else {
								row14.JOB_NUMBER = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 2) {
							row14.CLIENT = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(2);
							if (tmpContent_tOracleInput_1 != null) {
								row14.CLIENT = tmpContent_tOracleInput_1;
							} else {
								row14.CLIENT = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 3) {
							row14.START_DATE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(3);
							if (tmpContent_tOracleInput_1 != null) {
								row14.START_DATE = tmpContent_tOracleInput_1;
							} else {
								row14.START_DATE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 4) {
							row14.LAST_REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(4);
							if (tmpContent_tOracleInput_1 != null) {
								row14.LAST_REPORT_MONTH = tmpContent_tOracleInput_1;
							} else {
								row14.LAST_REPORT_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 5) {
							row14.EXPIRED_REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(5);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EXPIRED_REPORT_MONTH = tmpContent_tOracleInput_1;
							} else {
								row14.EXPIRED_REPORT_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 6) {
							row14.EMAIL_TO = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(6);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EMAIL_TO = tmpContent_tOracleInput_1;
							} else {
								row14.EMAIL_TO = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 7) {
							row14.EMAIL_CC = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(7);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EMAIL_CC = tmpContent_tOracleInput_1;
							} else {
								row14.EMAIL_CC = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 8) {
							row14.RESOURCE_INT = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(8);
							if (tmpContent_tOracleInput_1 != null) {
								row14.RESOURCE_INT = tmpContent_tOracleInput_1;
							} else {
								row14.RESOURCE_INT = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 9) {
							row14.SALES_NAME = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(9);
							if (tmpContent_tOracleInput_1 != null) {
								row14.SALES_NAME = tmpContent_tOracleInput_1;
							} else {
								row14.SALES_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 10) {
							row14.SALES_SIGNATURE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(10);
							if (tmpContent_tOracleInput_1 != null) {
								row14.SALES_SIGNATURE = tmpContent_tOracleInput_1;
							} else {
								row14.SALES_SIGNATURE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 11) {
							row14.SALES_EMAIL = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(11);
							if (tmpContent_tOracleInput_1 != null) {
								row14.SALES_EMAIL = tmpContent_tOracleInput_1;
							} else {
								row14.SALES_EMAIL = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 12) {
							row14.FTP_DIRECTORY = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(12);
							if (tmpContent_tOracleInput_1 != null) {
								row14.FTP_DIRECTORY = tmpContent_tOracleInput_1;
							} else {
								row14.FTP_DIRECTORY = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 13) {
							row14.SHIP_IT = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(13);
							if (tmpContent_tOracleInput_1 != null) {
								row14.SHIP_IT = tmpContent_tOracleInput_1;
							} else {
								row14.SHIP_IT = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 14) {
							row14.RUN_IT = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(14);
							if (tmpContent_tOracleInput_1 != null) {
								row14.RUN_IT = tmpContent_tOracleInput_1;
							} else {
								row14.RUN_IT = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 15) {
							row14.SALES_COST_CENTER = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(15);
							if (tmpContent_tOracleInput_1 != null) {
								row14.SALES_COST_CENTER = tmpContent_tOracleInput_1;
							} else {
								row14.SALES_COST_CENTER = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 16) {
							row14.EMAIL_FROM = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(16);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EMAIL_FROM = tmpContent_tOracleInput_1;
							} else {
								row14.EMAIL_FROM = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 17) {
							row14.EMAIL_BCC = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(17);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EMAIL_BCC = tmpContent_tOracleInput_1;
							} else {
								row14.EMAIL_BCC = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 18) {
							row14.ALT_FTP = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(18);
							if (tmpContent_tOracleInput_1 != null) {
								row14.ALT_FTP = tmpContent_tOracleInput_1;
							} else {
								row14.ALT_FTP = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 19) {
							row14.EFTP_PASSWORD = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(19);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EFTP_PASSWORD = tmpContent_tOracleInput_1;
							} else {
								row14.EFTP_PASSWORD = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 20) {
							row14.EFTP_HOST = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(20);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EFTP_HOST = tmpContent_tOracleInput_1;
							} else {
								row14.EFTP_HOST = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 21) {
							row14.EFTP_USER = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(21);
							if (tmpContent_tOracleInput_1 != null) {
								row14.EFTP_USER = tmpContent_tOracleInput_1;
							} else {
								row14.EFTP_USER = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 22) {
							row14.SALES_TITLE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(22);
							if (tmpContent_tOracleInput_1 != null) {
								row14.SALES_TITLE = tmpContent_tOracleInput_1;
							} else {
								row14.SALES_TITLE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 23) {
							row14.SALES_PHONE = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(23);
							if (tmpContent_tOracleInput_1 != null) {
								row14.SALES_PHONE = tmpContent_tOracleInput_1;
							} else {
								row14.SALES_PHONE = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 24) {
							row14.COIN_FTP_HOST = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(24);
							if (tmpContent_tOracleInput_1 != null) {
								row14.COIN_FTP_HOST = tmpContent_tOracleInput_1;
							} else {
								row14.COIN_FTP_HOST = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 25) {
							row14.COIN_USER = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(25);
							if (tmpContent_tOracleInput_1 != null) {
								row14.COIN_USER = tmpContent_tOracleInput_1;
							} else {
								row14.COIN_USER = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 26) {
							row14.COIN_PASSWORD = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(26);
							if (tmpContent_tOracleInput_1 != null) {
								row14.COIN_PASSWORD = tmpContent_tOracleInput_1;
							} else {
								row14.COIN_PASSWORD = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 27) {
							row14.COIN_DIRECTORY = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(27);
							if (tmpContent_tOracleInput_1 != null) {
								row14.COIN_DIRECTORY = tmpContent_tOracleInput_1;
							} else {
								row14.COIN_DIRECTORY = null;
							}
						}
						if (colQtyInRs_tOracleInput_1 < 28) {
							row14.ALT_EMAIL_TO = null;
						} else {

							tmpContent_tOracleInput_1 = rs_tOracleInput_1
									.getString(28);
							if (tmpContent_tOracleInput_1 != null) {
								row14.ALT_EMAIL_TO = tmpContent_tOracleInput_1;
							} else {
								row14.ALT_EMAIL_TO = null;
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
						 * [tJavaRow_2 main ] start
						 */

						currentComponent = "tJavaRow_2";

						if (log.isTraceEnabled()) {
							log.trace("row14 - "
									+ (row14 == null ? "" : row14.toLogString()));
						}

						// Code generate accord to input schema and output
						// schmea
						context.jobNumber = row14.JOB_NUMBER;
						context.client = row14.CLIENT;
						context.startDate = row14.START_DATE;
						context.lastReportMonth = row14.LAST_REPORT_MONTH;
						context.expiredReportMonth = row14.EXPIRED_REPORT_MONTH;
						context.emailTo = row14.EMAIL_TO;
						context.emailCC = row14.SALES_EMAIL + ";"
								+ row14.EMAIL_CC;
						context.resourceInt = row14.RESOURCE_INT;
						context.salesName = row14.SALES_NAME;
						context.salesSignature = row14.SALES_SIGNATURE;
						context.salesEmail = row14.SALES_EMAIL;
						context.ftpDirectory = row14.ALT_FTP;
						context.shipIt = row14.SHIP_IT;
						context.runIt = row14.RUN_IT;
						context.salesCostCenter = row14.SALES_COST_CENTER;
						context.emailFrom = row14.EMAIL_FROM;
						context.emailBcc = row14.EMAIL_BCC;
						context.eftpHost = row14.EFTP_HOST;
						context.eftpUser = row14.EFTP_USER;
						context.eftpPassword = row14.EFTP_PASSWORD;
						context.eftpDirectory = row14.FTP_DIRECTORY;
						context.salesTitle = row14.SALES_TITLE;
						context.salesPhone = row14.SALES_PHONE;
						context.coinFTPHost = row14.COIN_FTP_HOST;
						context.coinFTPUser = row14.COIN_USER;
						context.coinFTPPassword = row14.COIN_PASSWORD;
						context.coinFTPDirectory = row14.COIN_DIRECTORY;
						context.altEmailTo = row14.ALT_EMAIL_TO;

						nb_line_tJavaRow_2++;

						tos_count_tJavaRow_2++;

						/**
						 * [tJavaRow_2 main ] stop
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
				 * [tJavaRow_2 end ] start
				 */

				currentComponent = "tJavaRow_2";

				globalMap.put("tJavaRow_2_NB_LINE", nb_line_tJavaRow_2);

				ok_Hash.put("tJavaRow_2", true);
				end_Hash.put("tJavaRow_2", System.currentTimeMillis());

				tOracleInput_6Process(globalMap);

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
				 * [tOracleInput_1 finally ] start
				 */

				currentComponent = "tOracleInput_1";

				/**
				 * [tOracleInput_1 finally ] stop
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

		globalMap.put("tOracleInput_1_SUBPROCESS_STATE", 1);
	}

	public static class row20Struct implements
			routines.system.IPersistableRow<row20Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String REPORT_YEAR_MONTH;

		public String getREPORT_YEAR_MONTH() {
			return this.REPORT_YEAR_MONTH;
		}

		public String REPORT_YEAR;

		public String getREPORT_YEAR() {
			return this.REPORT_YEAR;
		}

		public String RMTH;

		public String getRMTH() {
			return this.RMTH;
		}

		public String PREV_YEAR;

		public String getPREV_YEAR() {
			return this.PREV_YEAR;
		}

		public String RMONTH;

		public String getRMONTH() {
			return this.RMONTH;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.REPORT_YEAR_MONTH = readString(dis);

					this.REPORT_YEAR = readString(dis);

					this.RMTH = readString(dis);

					this.PREV_YEAR = readString(dis);

					this.RMONTH = readString(dis);

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

				writeString(this.RMTH, dos);

				// String

				writeString(this.PREV_YEAR, dos);

				// String

				writeString(this.RMONTH, dos);

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
			sb.append(",RMTH=" + RMTH);
			sb.append(",PREV_YEAR=" + PREV_YEAR);
			sb.append(",RMONTH=" + RMONTH);
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

			if (RMTH == null) {
				sb.append("<null>");
			} else {
				sb.append(RMTH);
			}

			sb.append("|");

			if (PREV_YEAR == null) {
				sb.append("<null>");
			} else {
				sb.append(PREV_YEAR);
			}

			sb.append("|");

			if (RMONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(RMONTH);
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

				row20Struct row20 = new row20Struct();

				/**
				 * [tJavaRow_6 begin ] start
				 */

				ok_Hash.put("tJavaRow_6", false);
				start_Hash.put("tJavaRow_6", System.currentTimeMillis());

				currentComponent = "tJavaRow_6";

				int tos_count_tJavaRow_6 = 0;

				int nb_line_tJavaRow_6 = 0;

				/**
				 * [tJavaRow_6 begin ] stop
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
								+ "\"Select TO_CHAR(ADD_MONTHS(TO_DATE(REPORT_YEAR_MONTH,'YYYYMM'),1),'YYYYMM'),  SUBSTR(REPORT_YEAR_MONTH, 1, 4),  SUBSTR(REPORT_YEAR_MONTH, 5, 2),  SUBSTR(REPORT_YEAR_MONTH, 1, 4) - 2||'12',  rtrim(TO_CHAR(ADD_MONTHS(SYSDATE, -2), 'Month'))  from CUSTGEN.RSD_TIME_PERIOD rsd_prd  WHERE RSD_PRD.TIME_PERIOD = 'MRMO'\"");
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
						+ ("REPORT_YEAR_MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_YEAR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("RMTH")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("PREV_YEAR") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("RMONTH") + "}]");
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

				String dbquery_tOracleInput_6 = "Select TO_CHAR(ADD_MONTHS(TO_DATE(REPORT_YEAR_MONTH,'YYYYMM'),1),'YYYYMM'),\nSUBSTR(REPORT_YEAR_MONTH, 1, 4),\nSUBSTR(REPORT_YEAR_MONTH, 5, 2),\nSUBSTR(REPORT_YEAR_MONTH, 1, 4) - 2||'12',\nrtrim(TO_CHAR(ADD_MONTHS(SYSDATE, -2), 'Month'))\nfrom CUSTGEN.RSD_TIME_PERIOD rsd_prd\nWHERE RSD_PRD.TIME_PERIOD = 'MRMO'";

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
							row20.REPORT_YEAR_MONTH = null;
						} else {

							tmpContent_tOracleInput_6 = rs_tOracleInput_6
									.getString(1);
							if (tmpContent_tOracleInput_6 != null) {
								row20.REPORT_YEAR_MONTH = tmpContent_tOracleInput_6;
							} else {
								row20.REPORT_YEAR_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_6 < 2) {
							row20.REPORT_YEAR = null;
						} else {

							tmpContent_tOracleInput_6 = rs_tOracleInput_6
									.getString(2);
							if (tmpContent_tOracleInput_6 != null) {
								row20.REPORT_YEAR = tmpContent_tOracleInput_6;
							} else {
								row20.REPORT_YEAR = null;
							}
						}
						if (colQtyInRs_tOracleInput_6 < 3) {
							row20.RMTH = null;
						} else {

							tmpContent_tOracleInput_6 = rs_tOracleInput_6
									.getString(3);
							if (tmpContent_tOracleInput_6 != null) {
								row20.RMTH = tmpContent_tOracleInput_6;
							} else {
								row20.RMTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_6 < 4) {
							row20.PREV_YEAR = null;
						} else {

							tmpContent_tOracleInput_6 = rs_tOracleInput_6
									.getString(4);
							if (tmpContent_tOracleInput_6 != null) {
								row20.PREV_YEAR = tmpContent_tOracleInput_6;
							} else {
								row20.PREV_YEAR = null;
							}
						}
						if (colQtyInRs_tOracleInput_6 < 5) {
							row20.RMONTH = null;
						} else {

							tmpContent_tOracleInput_6 = rs_tOracleInput_6
									.getString(5);
							if (tmpContent_tOracleInput_6 != null) {
								row20.RMONTH = tmpContent_tOracleInput_6;
							} else {
								row20.RMONTH = null;
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
						 * [tJavaRow_6 main ] start
						 */

						currentComponent = "tJavaRow_6";

						if (log.isTraceEnabled()) {
							log.trace("row20 - "
									+ (row20 == null ? "" : row20.toLogString()));
						}

						// Code generate accord to input schema and output
						// schmea
						context.reportMonth = row20.REPORT_YEAR_MONTH;
						context.reportYear = row20.REPORT_YEAR;
						context.rMth = row20.RMTH;
						context.prevYear = row20.PREV_YEAR;
						context.rMonth = row20.RMONTH;

						nb_line_tJavaRow_6++;

						tos_count_tJavaRow_6++;

						/**
						 * [tJavaRow_6 main ] stop
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
				 * [tJavaRow_6 end ] start
				 */

				currentComponent = "tJavaRow_6";

				globalMap.put("tJavaRow_6_NB_LINE", nb_line_tJavaRow_6);

				ok_Hash.put("tJavaRow_6", true);
				end_Hash.put("tJavaRow_6", System.currentTimeMillis());

				tOracleInput_3Process(globalMap);
				tOracleInput_4Process(globalMap);
				if (context.runIt.equals("Y")) {

					tOracleInput_11Process(globalMap);
				}

				/**
				 * [tJavaRow_6 end ] stop
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
				 * [tJavaRow_6 finally ] start
				 */

				currentComponent = "tJavaRow_6";

				/**
				 * [tJavaRow_6 finally ] stop
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

	public static class row2Struct implements
			routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

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

				row2Struct row2 = new row2Struct();

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
						+ "context.salesEmail");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("FROM" + " = "
						+ "context.prodEmail");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("CC" + " = " + "\"\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1.append("BCC" + " = "
						+ "context.prodEmail");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1
						.append("SUBJECT"
								+ " = "
								+ "context.client+ \" Job number: \" +context.jobID+ \" for Report Month: \"  +context.reportMonth+ \"  Last Delivery\"");
				log4jParamters_tSendMail_1.append(" | ");
				log4jParamters_tSendMail_1
						.append("MESSAGE"
								+ " = "
								+ "\"Just a reminder that this is the last delivery on this job.    Please send in a new WRF to the Stat box for next month if they are going to renew.    Thanks!     Stat Production\"");
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
						+ "plain");
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
						+ "context.dbHostName");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_3.append(" | ");
				log4jParamters_tOracleInput_3.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
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
								+ "\"SELECT LAST_REPORT_MONTH  FROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J  WHERE JOB_ID = '\"+context.jobID+\"'  AND LAST_REPORT_MONTH = '\"+context.reportMonth+\"'\"");
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
						+ ("LAST_REPORT_MONTH") + "}]");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_3 = context.dbUser;

				final String decryptedPassword_tOracleInput_3 = context.dbPassword;

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

				String dbquery_tOracleInput_3 = "SELECT LAST_REPORT_MONTH\nFROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J\nWHERE JOB_ID = '"
						+ context.jobID
						+ "'\nAND LAST_REPORT_MONTH = '"
						+ context.reportMonth + "'";

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
							row2.LAST_REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_3 = rs_tOracleInput_3
									.getString(1);
							if (tmpContent_tOracleInput_3 != null) {
								row2.LAST_REPORT_MONTH = tmpContent_tOracleInput_3;
							} else {
								row2.LAST_REPORT_MONTH = null;
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
						 * [tSendMail_1 main ] start
						 */

						currentComponent = "tSendMail_1";

						if (log.isTraceEnabled()) {
							log.trace("row2 - "
									+ (row2 == null ? "" : row2.toLogString()));
						}

						String smtpHost_tSendMail_1 = "smtp.dc.polk.com";
						String smtpPort_tSendMail_1 = "25";
						String from_tSendMail_1 = (context.prodEmail);
						String to_tSendMail_1 = (context.salesEmail).replace(
								";", ",");
						String cc_tSendMail_1 = (("") == null || "".equals("")) ? null
								: ("").replace(";", ",");
						String bcc_tSendMail_1 = ((context.prodEmail) == null || ""
								.equals(context.prodEmail)) ? null
								: (context.prodEmail).replace(";", ",");
						String subject_tSendMail_1 = (context.client
								+ " Job number: " + context.jobID
								+ " for Report Month: " + context.reportMonth + "  Last Delivery");

						java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String, String>>();
						java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
						java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();

						String message_tSendMail_1 = (("Just a reminder that this is the last delivery on this job.\n\nPlease send in a new WRF to the Stat box for next month if they are going to renew.\n\nThanks! \n\nStat Production") == null || ""
								.equals("Just a reminder that this is the last delivery on this job.\n\nPlease send in a new WRF to the Stat box for next month if they are going to renew.\n\nThanks! \n\nStat Production")) ? "\"\""
								: ("Just a reminder that this is the last delivery on this job.\n\nPlease send in a new WRF to the Stat box for next month if they are going to renew.\n\nThanks! \n\nStat Production");
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
									"ISO-8859-15", "plain");
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
				 * [tOracleInput_3 finally ] start
				 */

				currentComponent = "tOracleInput_3";

				/**
				 * [tOracleInput_3 finally ] stop
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

	public static class row4Struct implements
			routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

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
								+ "context.client+ \" Job number: \" +context.jobID+ \" for Report Month: \"  +context.reportMonth+ \"  EXPIRED WRF NO DELIVERY\"");
				log4jParamters_tSendMail_2.append(" | ");
				log4jParamters_tSendMail_2
						.append("MESSAGE"
								+ " = "
								+ "\"Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.    Please send in a new WRF to the Stat box for if they are going to renew.    Thanks!     Stat Production\"");
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
								+ "\"SELECT EXPIRED_REPORT_MONTH  FROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J  WHERE JOB_ID = '\"+context.jobID+\"'  AND EXPIRED_REPORT_MONTH = '\"+context.reportMonth+\"'\"");
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

				String dbquery_tOracleInput_4 = "SELECT EXPIRED_REPORT_MONTH\nFROM AIS_OWNER.AIS_JOBS_STANDARD_INFORMATION J\nWHERE JOB_ID = '"
						+ context.jobID
						+ "'\nAND EXPIRED_REPORT_MONTH = '"
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
								+ " for Report Month: " + context.reportMonth + "  EXPIRED WRF NO DELIVERY");

						java.util.List<java.util.Map<String, String>> headers_tSendMail_2 = new java.util.ArrayList<java.util.Map<String, String>>();
						java.util.List<String> attachments_tSendMail_2 = new java.util.ArrayList<String>();
						java.util.List<String> contentTransferEncoding_tSendMail_2 = new java.util.ArrayList<String>();

						String message_tSendMail_2 = (("Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.\n\nPlease send in a new WRF to the Stat box for if they are going to renew.\n\nThanks! \n\nStat Production") == null || ""
								.equals("Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.\n\nPlease send in a new WRF to the Stat box for if they are going to renew.\n\nThanks! \n\nStat Production")) ? "\"\""
								: ("Just a reminder that this WRF is now expired and NO deliverable will be created for this report month.\n\nPlease send in a new WRF to the Stat box for if they are going to renew.\n\nThanks! \n\nStat Production");
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

	public void tOracleInput_11Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_11_SUBPROCESS_STATE", 0);

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
				 * [tOracleInput_11 begin ] start
				 */

				int NB_ITERATE_tFileDelete_1 = 0; // for statistics

				ok_Hash.put("tOracleInput_11", false);
				start_Hash.put("tOracleInput_11", System.currentTimeMillis());

				currentComponent = "tOracleInput_11";

				int tos_count_tOracleInput_11 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_11 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_11 = new StringBuilder();
				log4jParamters_tOracleInput_11.append("Parameters:");
				log4jParamters_tOracleInput_11.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11
						.append("QUERY"
								+ " = "
								+ "\"SELECT REPORT_MONTH  FROM AIS_JOBS_STAT_REPORT_MONTHS  WHERE JOB_ID = '\"+context.jobID+\"'  and nvl(delivered, 'NO') = 'NO'  AND REPORT_MONTH = '\"+context.reportMonth+\"'  \"");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("REPORT_MONTH") + "}]");
				log4jParamters_tOracleInput_11.append(" | ");
				log4jParamters_tOracleInput_11.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_11.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_11 - "
							+ log4jParamters_tOracleInput_11);

				int nb_line_tOracleInput_11 = 0;
				java.sql.Connection conn_tOracleInput_11 = null;
				String driverClass_tOracleInput_11 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_11);

				String url_tOracleInput_11 = null;
				url_tOracleInput_11 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_11 = context.dbUser;

				final String decryptedPassword_tOracleInput_11 = context.dbPassword;

				String dbPwd_tOracleInput_11 = decryptedPassword_tOracleInput_11;

				log.debug("tOracleInput_11 - Driver ClassName: "
						+ driverClass_tOracleInput_11 + ".");

				log.info("tOracleInput_11 - Connection attempt to '"
						+ url_tOracleInput_11 + "' with the username '"
						+ dbUser_tOracleInput_11 + "'.");

				conn_tOracleInput_11 = java.sql.DriverManager.getConnection(
						url_tOracleInput_11, dbUser_tOracleInput_11,
						dbPwd_tOracleInput_11);
				log.info("tOracleInput_11 - Connection to '"
						+ url_tOracleInput_11 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_11 = conn_tOracleInput_11
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_11 = stmtGetTZ_tOracleInput_11
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_11 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_11.next()) {
					sessionTimezone_tOracleInput_11 = rsGetTZ_tOracleInput_11
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_11)
						.setSessionTimeZone(sessionTimezone_tOracleInput_11);

				java.sql.Statement stmt_tOracleInput_11 = conn_tOracleInput_11
						.createStatement();

				String dbquery_tOracleInput_11 = "SELECT REPORT_MONTH\nFROM AIS_JOBS_STAT_REPORT_MONTHS\nWHERE JOB_ID = '"
						+ context.jobID
						+ "'\nand nvl(delivered, 'NO') = 'NO'\nAND REPORT_MONTH = '"
						+ context.reportMonth + "'\n";

				log.info("tOracleInput_11 - Executing the query: '"
						+ dbquery_tOracleInput_11 + "'.");

				globalMap.put("tOracleInput_11_QUERY", dbquery_tOracleInput_11);

				java.sql.ResultSet rs_tOracleInput_11 = null;
				try {
					rs_tOracleInput_11 = stmt_tOracleInput_11
							.executeQuery(dbquery_tOracleInput_11);
					java.sql.ResultSetMetaData rsmd_tOracleInput_11 = rs_tOracleInput_11
							.getMetaData();
					int colQtyInRs_tOracleInput_11 = rsmd_tOracleInput_11
							.getColumnCount();

					String tmpContent_tOracleInput_11 = null;

					log.info("tOracleInput_11 - Retrieving records from the database.");

					while (rs_tOracleInput_11.next()) {
						nb_line_tOracleInput_11++;

						log.debug("tOracleInput_11 - Retrieving the record "
								+ nb_line_tOracleInput_11 + ".");

						/**
						 * [tOracleInput_11 begin ] stop
						 */

						/**
						 * [tOracleInput_11 main ] start
						 */

						currentComponent = "tOracleInput_11";

						tos_count_tOracleInput_11++;

						/**
						 * [tOracleInput_11 main ] stop
						 */
						NB_ITERATE_tFileDelete_1++;

						/**
						 * [tFileDelete_1 begin ] start
						 */

						ok_Hash.put("tFileDelete_1", false);
						start_Hash.put("tFileDelete_1",
								System.currentTimeMillis());

						currentComponent = "tFileDelete_1";

						int tos_count_tFileDelete_1 = 0;

						if (log.isInfoEnabled())
							log.info("tFileDelete_1 - " + "Start to work.");
						StringBuilder log4jParamters_tFileDelete_1 = new StringBuilder();
						log4jParamters_tFileDelete_1.append("Parameters:");
						log4jParamters_tFileDelete_1
								.append("PATH"
										+ " = "
										+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash+context.client+\"_\"+context.reportMonth+\".zip\"");
						log4jParamters_tFileDelete_1.append(" | ");
						log4jParamters_tFileDelete_1.append("FAILON" + " = "
								+ "false");
						log4jParamters_tFileDelete_1.append(" | ");
						log4jParamters_tFileDelete_1.append("FOLDER_FILE"
								+ " = " + "true");
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
						java.io.File path_tFileDelete_1 = new java.io.File(
								context.shipping + context.slash
										+ context.reportYear + context.mDrive
										+ context.slash + context.client
										+ context.slash + context.jobNumber
										+ context.slash + context.reportMonth
										+ context.slash + context.client + "_"
										+ context.reportMonth + ".zip");
						if (path_tFileDelete_1.exists()) {
							if (path_tFileDelete_1.isFile()) {
								if (path_tFileDelete_1.delete()) {
									globalMap.put(
											"tFileDelete_1_CURRENT_STATUS",
											"File deleted.");
									log.info("tFileDelete_1 - File : "
											+ path_tFileDelete_1
													.getAbsolutePath()
											+ " is deleted.");
								} else {
									globalMap.put(
											"tFileDelete_1_CURRENT_STATUS",
											"No file deleted.");
									log.info("tFileDelete_1 - Fail to delete file : "
											+ path_tFileDelete_1
													.getAbsolutePath());
								}
							} else if (path_tFileDelete_1.isDirectory()) {
								DeleteFoldertFileDelete_1 dftFileDelete_1 = new DeleteFoldertFileDelete_1();
								if (dftFileDelete_1.delete(path_tFileDelete_1)) {
									globalMap.put(
											"tFileDelete_1_CURRENT_STATUS",
											"Path deleted.");
									log.info("tFileDelete_1 - Directory : "
											+ path_tFileDelete_1
													.getAbsolutePath()
											+ " is deleted.");
								} else {
									globalMap.put(
											"tFileDelete_1_CURRENT_STATUS",
											"No path deleted.");
									log.info("tFileDelete_1 - Fail to delete directory : "
											+ path_tFileDelete_1
													.getAbsolutePath());
								}
							}
						} else {
							globalMap
									.put("tFileDelete_1_CURRENT_STATUS",
											"File or path does not exist or is invalid.");
							log.error("tFileDelete_1 - File or directory : "
									+ path_tFileDelete_1.getAbsolutePath()
									+ " does not exist or is invalid.");
						}
						globalMap.put("tFileDelete_1_DELETE_PATH",
								context.shipping + context.slash
										+ context.reportYear + context.mDrive
										+ context.slash + context.client
										+ context.slash + context.jobNumber
										+ context.slash + context.reportMonth
										+ context.slash + context.client + "_"
										+ context.reportMonth + ".zip");

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
						end_Hash.put("tFileDelete_1",
								System.currentTimeMillis());

						tFileInputDelimited_3Process(globalMap);

						/**
						 * [tFileDelete_1 end ] stop
						 */

						/**
						 * [tOracleInput_11 end ] start
						 */

						currentComponent = "tOracleInput_11";

					}
				} finally {
					stmt_tOracleInput_11.close();

					if (conn_tOracleInput_11 != null
							&& !conn_tOracleInput_11.isClosed()) {

						log.info("tOracleInput_11 - Closing the connection to the database.");

						conn_tOracleInput_11.close();

						log.info("tOracleInput_11 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_11_NB_LINE",
						nb_line_tOracleInput_11);
				log.info("tOracleInput_11 - Retrieved records count: "
						+ nb_line_tOracleInput_11 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_11 - " + "Done.");

				ok_Hash.put("tOracleInput_11", true);
				end_Hash.put("tOracleInput_11", System.currentTimeMillis());

				/**
				 * [tOracleInput_11 end ] stop
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
				 * [tOracleInput_11 finally ] start
				 */

				currentComponent = "tOracleInput_11";

				/**
				 * [tOracleInput_11 finally ] stop
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

		globalMap.put("tOracleInput_11_SUBPROCESS_STATE", 1);
	}

	public static class row15Struct implements
			routines.system.IPersistableRow<row15Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

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

		public String SHIP_EMAIL;

		public String getSHIP_EMAIL() {
			return this.SHIP_EMAIL;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.USER = readString(dis);

					this.PASSWORD = readString(dis);

					this.HST_NAME = readString(dis);

					this.DB_NAME = readString(dis);

					this.SCHEMA = readString(dis);

					this.SHIP_EMAIL = readString(dis);

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

				writeString(this.SHIP_EMAIL, dos);

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
			sb.append(",SHIP_EMAIL=" + SHIP_EMAIL);
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

			if (SHIP_EMAIL == null) {
				sb.append("<null>");
			} else {
				sb.append(SHIP_EMAIL);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row15Struct other) {

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

	public void tFileInputDelimited_3Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 0);

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

				row15Struct row15 = new row15Struct();

				/**
				 * [tJavaRow_5 begin ] start
				 */

				ok_Hash.put("tJavaRow_5", false);
				start_Hash.put("tJavaRow_5", System.currentTimeMillis());

				currentComponent = "tJavaRow_5";

				int tos_count_tJavaRow_5 = 0;

				int nb_line_tJavaRow_5 = 0;

				/**
				 * [tJavaRow_5 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_3 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_3", false);
				start_Hash.put("tFileInputDelimited_3",
						System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_3";

				int tos_count_tFileInputDelimited_3 = 0;

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_3 - " + "Start to work.");
				StringBuilder log4jParamters_tFileInputDelimited_3 = new StringBuilder();
				log4jParamters_tFileInputDelimited_3.append("Parameters:");
				log4jParamters_tFileInputDelimited_3
						.append("FILENAME"
								+ " = "
								+ "context.localDirectory+context.slash+\"FCA_OWNER_\"+context.dbVersion+\".txt\"");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("ROWSEPARATOR"
						+ " = " + "context.lineFeed");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("HEADER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("FOOTER" + " = "
						+ "0");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("LIMIT" + " = "
						+ "");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("REMOVE_EMPTY_ROW"
						+ " = " + "true");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("UNCOMPRESS"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("DIE_ON_ERROR"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("RANDOM" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("TRIMALL" + " = "
						+ "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("TRIMSELECT"
						+ " = " + "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("USER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("PASSWORD") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("HST_NAME")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("DB_NAME") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SCHEMA") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("SHIP_EMAIL")
						+ "}]");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("CHECK_FIELDS_NUM"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("CHECK_DATE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("SPLITRECORD"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				log4jParamters_tFileInputDelimited_3.append("ENABLE_DECODE"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_3.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_3 - "
							+ log4jParamters_tFileInputDelimited_3);

				final routines.system.RowState rowstate_tFileInputDelimited_3 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_3 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_3 = null;
				try {

					Object filename_tFileInputDelimited_3 = context.localDirectory
							+ context.slash
							+ "FCA_OWNER_"
							+ context.dbVersion
							+ ".txt";
					if (filename_tFileInputDelimited_3 instanceof java.io.InputStream) {

						int footer_value_tFileInputDelimited_3 = 0, random_value_tFileInputDelimited_3 = -1;
						if (footer_value_tFileInputDelimited_3 > 0
								|| random_value_tFileInputDelimited_3 > 0) {
							throw new java.lang.Exception(
									"When the input source is a stream,footer and random shouldn't be bigger than 0.");
						}

					}
					try {
						fid_tFileInputDelimited_3 = new org.talend.fileprocess.FileInputDelimited(
								context.localDirectory + context.slash
										+ "FCA_OWNER_" + context.dbVersion
										+ ".txt", "ISO-8859-15", ",",
								context.lineFeed, true, 0, 0, -1, -1, false);
					} catch (java.lang.Exception e) {

						log.error("tFileInputDelimited_3 - " + e.getMessage());

						System.err.println(e.getMessage());

					}

					log.info("tFileInputDelimited_3 - Retrieving records from the datasource.");

					while (fid_tFileInputDelimited_3 != null
							&& fid_tFileInputDelimited_3.nextRecord()) {
						rowstate_tFileInputDelimited_3.reset();

						row15 = null;

						boolean whetherReject_tFileInputDelimited_3 = false;
						row15 = new row15Struct();
						try {

							int columnIndexWithD_tFileInputDelimited_3 = 0;

							columnIndexWithD_tFileInputDelimited_3 = 0;

							row15.USER = fid_tFileInputDelimited_3
									.get(columnIndexWithD_tFileInputDelimited_3);

							columnIndexWithD_tFileInputDelimited_3 = 1;

							row15.PASSWORD = fid_tFileInputDelimited_3
									.get(columnIndexWithD_tFileInputDelimited_3);

							columnIndexWithD_tFileInputDelimited_3 = 2;

							row15.HST_NAME = fid_tFileInputDelimited_3
									.get(columnIndexWithD_tFileInputDelimited_3);

							columnIndexWithD_tFileInputDelimited_3 = 3;

							row15.DB_NAME = fid_tFileInputDelimited_3
									.get(columnIndexWithD_tFileInputDelimited_3);

							columnIndexWithD_tFileInputDelimited_3 = 4;

							row15.SCHEMA = fid_tFileInputDelimited_3
									.get(columnIndexWithD_tFileInputDelimited_3);

							columnIndexWithD_tFileInputDelimited_3 = 5;

							row15.SHIP_EMAIL = fid_tFileInputDelimited_3
									.get(columnIndexWithD_tFileInputDelimited_3);

							if (rowstate_tFileInputDelimited_3.getException() != null) {
								throw rowstate_tFileInputDelimited_3
										.getException();
							}

						} catch (java.lang.Exception e) {
							whetherReject_tFileInputDelimited_3 = true;

							log.error("tFileInputDelimited_3 - "
									+ e.getMessage());

							System.err.println(e.getMessage());
							row15 = null;

						}

						log.debug("tFileInputDelimited_3 - Retrieving the record "
								+ fid_tFileInputDelimited_3.getRowNumber()
								+ ".");

						/**
						 * [tFileInputDelimited_3 begin ] stop
						 */

						/**
						 * [tFileInputDelimited_3 main ] start
						 */

						currentComponent = "tFileInputDelimited_3";

						tos_count_tFileInputDelimited_3++;

						/**
						 * [tFileInputDelimited_3 main ] stop
						 */
						// Start of branch "row15"
						if (row15 != null) {

							/**
							 * [tJavaRow_5 main ] start
							 */

							currentComponent = "tJavaRow_5";

							if (log.isTraceEnabled()) {
								log.trace("row15 - "
										+ (row15 == null ? "" : row15
												.toLogString()));
							}

							// Code generate accord to input schema and output
							// schmea
							context.dbUser = row15.USER;
							context.dbPassword = row15.PASSWORD;
							context.dbHostName = row15.HST_NAME;
							context.dbName = row15.DB_NAME;
							context.dbSchema = row15.SCHEMA;
							context.shipEmail = row15.SHIP_EMAIL;

							nb_line_tJavaRow_5++;

							tos_count_tJavaRow_5++;

							/**
							 * [tJavaRow_5 main ] stop
							 */

						} // End of branch "row15"

						/**
						 * [tFileInputDelimited_3 end ] start
						 */

						currentComponent = "tFileInputDelimited_3";

					}
				} finally {
					if (!((Object) (context.localDirectory + context.slash
							+ "FCA_OWNER_" + context.dbVersion + ".txt") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_3 != null) {
							fid_tFileInputDelimited_3.close();
						}
					}
					if (fid_tFileInputDelimited_3 != null) {
						globalMap.put("tFileInputDelimited_3_NB_LINE",
								fid_tFileInputDelimited_3.getRowNumber());

						log.info("tFileInputDelimited_3 - Retrieved records count: "
								+ fid_tFileInputDelimited_3.getRowNumber()
								+ ".");

					}
				}

				if (log.isInfoEnabled())
					log.info("tFileInputDelimited_3 - " + "Done.");

				ok_Hash.put("tFileInputDelimited_3", true);
				end_Hash.put("tFileInputDelimited_3",
						System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_3 end ] stop
				 */

				/**
				 * [tJavaRow_5 end ] start
				 */

				currentComponent = "tJavaRow_5";

				globalMap.put("tJavaRow_5_NB_LINE", nb_line_tJavaRow_5);

				ok_Hash.put("tJavaRow_5", true);
				end_Hash.put("tJavaRow_5", System.currentTimeMillis());

				tOracleInput_5Process(globalMap);

				/**
				 * [tJavaRow_5 end ] stop
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
				 * [tFileInputDelimited_3 finally ] start
				 */

				currentComponent = "tFileInputDelimited_3";

				/**
				 * [tFileInputDelimited_3 finally ] stop
				 */

				/**
				 * [tJavaRow_5 finally ] start
				 */

				currentComponent = "tJavaRow_5";

				/**
				 * [tJavaRow_5 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 1);
	}

	public static class row12Struct implements
			routines.system.IPersistableRow<row12Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String RPT_DT;

		public String getRPT_DT() {
			return this.RPT_DT;
		}

		public String REPORT_YEAR;

		public String getREPORT_YEAR() {
			return this.REPORT_YEAR;
		}

		public String RMONTH;

		public String getRMONTH() {
			return this.RMONTH;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.RPT_DT = readString(dis);

					this.REPORT_YEAR = readString(dis);

					this.RMONTH = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.RPT_DT, dos);

				// String

				writeString(this.REPORT_YEAR, dos);

				// String

				writeString(this.RMONTH, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("RPT_DT=" + RPT_DT);
			sb.append(",REPORT_YEAR=" + REPORT_YEAR);
			sb.append(",RMONTH=" + RMONTH);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (RPT_DT == null) {
				sb.append("<null>");
			} else {
				sb.append(RPT_DT);
			}

			sb.append("|");

			if (REPORT_YEAR == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_YEAR);
			}

			sb.append("|");

			if (RMONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(RMONTH);
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

				row12Struct row12 = new row12Struct();

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
						+ "context.dbHostName");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_5.append(" | ");
				log4jParamters_tOracleInput_5
						.append("QUERY"
								+ " = "
								+ "\"SELECT DISTINCT  TO_CHAR(RPT_DT, 'YYYYMM'),  TO_CHAR(RPT_DT, 'YYYY'),  TO_CHAR(SYSDATE,'MM')||18||TO_CHAR(SYSDATE,'YY')   FROM FCA_SR_OWNER.FCA_SVC_RETENTION_STATUS    WHERE RPT_DT = (SELECT MAX(RPT_DT) FROM FCA_SR_OWNER.FCA_SVC_RETENTION_STATUS)\"");
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
						+ ("RPT_DT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_YEAR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("RMONTH") + "}]");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_5 = context.dbUser;

				final String decryptedPassword_tOracleInput_5 = context.dbPassword;

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

				String dbquery_tOracleInput_5 = "SELECT DISTINCT\nTO_CHAR(RPT_DT, 'YYYYMM'),\nTO_CHAR(RPT_DT, 'YYYY'),\nTO_CHAR(SYSDATE,'MM')||18||TO_CHAR(SYSDATE,'YY')   FROM FCA_SR_OWNER.FCA_SVC_RETENTION_STATUS\n\nWHERE RPT_DT = (SELECT MAX(RPT_DT) FROM FCA_SR_OWNER.FCA_SVC_RETENTION_STATUS)";

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
							row12.RPT_DT = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(1);
							if (tmpContent_tOracleInput_5 != null) {
								row12.RPT_DT = tmpContent_tOracleInput_5;
							} else {
								row12.RPT_DT = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 2) {
							row12.REPORT_YEAR = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(2);
							if (tmpContent_tOracleInput_5 != null) {
								row12.REPORT_YEAR = tmpContent_tOracleInput_5;
							} else {
								row12.REPORT_YEAR = null;
							}
						}
						if (colQtyInRs_tOracleInput_5 < 3) {
							row12.RMONTH = null;
						} else {

							tmpContent_tOracleInput_5 = rs_tOracleInput_5
									.getString(3);
							if (tmpContent_tOracleInput_5 != null) {
								row12.RMONTH = tmpContent_tOracleInput_5;
							} else {
								row12.RMONTH = null;
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
						 * [tJavaRow_3 main ] start
						 */

						currentComponent = "tJavaRow_3";

						if (log.isTraceEnabled()) {
							log.trace("row12 - "
									+ (row12 == null ? "" : row12.toLogString()));
						}

						// Code generate accord to input schema and output
						// schmea
						context.reportMonth = row12.RPT_DT;
						context.reportYear = row12.REPORT_YEAR;
						context.rMonth = row12.RMONTH;
						nb_line_tJavaRow_3++;

						tos_count_tJavaRow_3++;

						/**
						 * [tJavaRow_3 main ] stop
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
				 * [tJavaRow_3 end ] start
				 */

				currentComponent = "tJavaRow_3";

				globalMap.put("tJavaRow_3_NB_LINE", nb_line_tJavaRow_3);

				ok_Hash.put("tJavaRow_3", true);
				end_Hash.put("tJavaRow_3", System.currentTimeMillis());

				tParallelize_1Process(globalMap);

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
				 * [tOracleInput_5 finally ] start
				 */

				currentComponent = "tOracleInput_5";

				/**
				 * [tOracleInput_5 finally ] stop
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

		globalMap.put("tOracleInput_5_SUBPROCESS_STATE", 1);
	}

	public void tParallelize_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tParallelize_1_SUBPROCESS_STATE", 0);

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
				 * [tParallelize_1 begin ] start
				 */

				ok_Hash.put("tParallelize_1", false);
				start_Hash.put("tParallelize_1", System.currentTimeMillis());

				currentComponent = "tParallelize_1";

				int tos_count_tParallelize_1 = 0;

				// call parallelized subjobs
				java.util.Map<String, Thread> mt_tParallelize_1 = new java.util.HashMap<String, Thread>();

				// clear the temporary values in the globalMap
				globalMap.remove("tOracleInput_7_SUBPROCESS_STATE");
				globalMap.remove("tOracleInput_10_SUBPROCESS_STATE");
				globalMap.remove("tOracleInput_12_SUBPROCESS_STATE");
				globalMap.remove("tOracleInput_2_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if (globalMap instanceof java.util.HashMap) {
					concurrentMap_temp_tParallelize_1 = java.util.Collections
							.synchronizedMap(globalMap);
				} else {
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;

				runningThreadCount.add(1);
				Thread thread_tOracleInput_7 = new Thread() {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_7' starts.");

							tOracleInput_7Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_7' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_7_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_7_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tOracleInput_7.start();
				mt_tParallelize_1.put("tOracleInput_7", thread_tOracleInput_7);
				runningThreadCount.add(1);
				Thread thread_tOracleInput_10 = new Thread() {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_10' starts.");

							tOracleInput_10Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_10' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_10_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_10_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tOracleInput_10.start();
				mt_tParallelize_1
						.put("tOracleInput_10", thread_tOracleInput_10);
				runningThreadCount.add(1);
				Thread thread_tOracleInput_12 = new Thread() {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_12' starts.");

							tOracleInput_12Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_12' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_12_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_12_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tOracleInput_12.start();
				mt_tParallelize_1
						.put("tOracleInput_12", thread_tOracleInput_12);
				runningThreadCount.add(1);
				Thread thread_tOracleInput_2 = new Thread() {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_2' starts.");

							tOracleInput_2Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tOracleInput_2' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_2_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put(
									"tOracleInput_2_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tOracleInput_2.start();
				mt_tParallelize_1.put("tOracleInput_2", thread_tOracleInput_2);
				while ((((globalMap.get("tOracleInput_7_SUBPROCESS_STATE") == null) ? true
						: ((Integer) globalMap
								.get("tOracleInput_7_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tOracleInput_10_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap
										.get("tOracleInput_10_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tOracleInput_12_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap
										.get("tOracleInput_12_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tOracleInput_2_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap
										.get("tOracleInput_2_SUBPROCESS_STATE") == 0)) || false)) {
					Thread.sleep(100);
				}

				// call next subprocesses
				log.debug("tParallelize_1 - The subjob starting with the component 'tJava_9' starts.");
				tJava_9Process(globalMap);
				log.debug("tParallelize_1 - The subjob starting with the component 'tJava_9' is done.");

				/**
				 * [tParallelize_1 begin ] stop
				 */

				/**
				 * [tParallelize_1 main ] start
				 */

				currentComponent = "tParallelize_1";

				tos_count_tParallelize_1++;

				/**
				 * [tParallelize_1 main ] stop
				 */

				/**
				 * [tParallelize_1 end ] start
				 */

				currentComponent = "tParallelize_1";

				ok_Hash.put("tParallelize_1", true);
				end_Hash.put("tParallelize_1", System.currentTimeMillis());

				/**
				 * [tParallelize_1 end ] stop
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
				 * [tParallelize_1 finally ] start
				 */

				currentComponent = "tParallelize_1";

				/**
				 * [tParallelize_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tParallelize_1_SUBPROCESS_STATE", 1);
	}

	public static class row9Struct implements
			routines.system.IPersistableRow<row9Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
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

	public static class OnRowsEndStructtSortRow_1 implements
			routines.system.IPersistableRow<OnRowsEndStructtSortRow_1> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OnRowsEndStructtSortRow_1 other) {

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

	public static class row5Struct implements
			routines.system.IPersistableRow<row5Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row5Struct other) {

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
		String currentVirtualComponent = null;

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

				row5Struct row5 = new row5Struct();
				row9Struct row9 = new row9Struct();

				/**
				 * [tSortRow_1_SortOut begin ] start
				 */

				ok_Hash.put("tSortRow_1_SortOut", false);
				start_Hash
						.put("tSortRow_1_SortOut", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_1";

				currentComponent = "tSortRow_1_SortOut";

				int tos_count_tSortRow_1_SortOut = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_1_SortOut - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_1_SortOut = new StringBuilder();
				log4jParamters_tSortRow_1_SortOut.append("Parameters:");
				log4jParamters_tSortRow_1_SortOut.append("DESTINATION" + " = "
						+ "tSortRow_1");
				log4jParamters_tSortRow_1_SortOut.append(" | ");
				log4jParamters_tSortRow_1_SortOut.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_1_SortOut.append(" | ");
				log4jParamters_tSortRow_1_SortOut.append("CRITERIA" + " = "
						+ "[{ORDER=" + ("asc") + ", COLNAME=" + ("DEALER_CODE")
						+ ", SORT=" + ("alpha") + "}, {ORDER=" + ("asc")
						+ ", COLNAME=" + ("YEAR_OF_OWNERSHIP") + ", SORT="
						+ ("alpha") + "}]");
				log4jParamters_tSortRow_1_SortOut.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_1_SortOut - "
							+ log4jParamters_tSortRow_1_SortOut);

				class Comparablerow5Struct extends row5Struct implements
						Comparable<Comparablerow5Struct> {

					public int compareTo(Comparablerow5Struct other) {

						if (this.DEALER_CODE == null
								&& other.DEALER_CODE != null) {
							return -1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE == null) {
							return 1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE != null) {
							if (!this.DEALER_CODE.equals(other.DEALER_CODE)) {
								return this.DEALER_CODE
										.compareTo(other.DEALER_CODE);
							}
						}
						if (this.YEAR_OF_OWNERSHIP == null
								&& other.YEAR_OF_OWNERSHIP != null) {
							return -1;

						} else if (this.YEAR_OF_OWNERSHIP != null
								&& other.YEAR_OF_OWNERSHIP == null) {
							return 1;

						} else if (this.YEAR_OF_OWNERSHIP != null
								&& other.YEAR_OF_OWNERSHIP != null) {
							if (!this.YEAR_OF_OWNERSHIP
									.equals(other.YEAR_OF_OWNERSHIP)) {
								return this.YEAR_OF_OWNERSHIP
										.compareTo(other.YEAR_OF_OWNERSHIP);
							}
						}
						return 0;
					}
				}

				java.util.List<Comparablerow5Struct> list_tSortRow_1_SortOut = new java.util.ArrayList<Comparablerow5Struct>();

				/**
				 * [tSortRow_1_SortOut begin ] stop
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
						+ "context.dbHostName");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_7.append(" | ");
				log4jParamters_tOracleInput_7
						.append("QUERY"
								+ " = "
								+ "\"SELECT               TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,              DLR_CD AS DEALER_CODE,              YR_OF_OWNERSHIP AS YEAR_OF_OWNERSHIP,              VEH_CNT_DENOMINATOR AS VEHICLE_COUNTDENOM,              R1M_1PLUS_DLR_RETEN_NUMERATOR AS ONEp_RETENTION_COUNT,              R1M_2PLUS_DLR_RETEN_NUMERATOR AS TWOP_RETENTION_COUNT,              R1M_1PLUS_DLR_DEFEC_NUMERATOR AS ONEp_DEFECTION_COUNT,              R1M_2PLUS_DLR_DEFEC_NUMERATOR AS TWOp_DEFECTION_COUNT                FROM FCA_SR_OWNER.FCA_DLR_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')  ORDER BY 2,3\"");
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
						+ ("MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("DEALER_CODE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("YEAR_OF_OWNERSHIP") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEHICLE_COUNT_DENOM")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONEp_RETENTION_COUNT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TWOp_RETENTION_COUNT")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONEp_DEFECTION_COUNT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TWOp_DEFECTION_COUNT") + "}]");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_7 = context.dbUser;

				final String decryptedPassword_tOracleInput_7 = context.dbPassword;

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

				String dbquery_tOracleInput_7 = "SELECT \n            TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,\n            DLR_CD AS DEALER_CODE,\n            YR_OF_OWNERSHIP AS YEAR_OF_OWNERSHIP,\n            VEH_CNT_DENOMINATOR AS VEHICLE_COUNTDENOM,\n            R1M_1PLUS_DLR_RETEN_NUMERATOR AS ONEp_RETENTION_COUNT,\n            R1M_2PLUS_DLR_RETEN_NUMERATOR AS TWOP_RETENTION_COUNT,\n            R1M_1PLUS_DLR_DEFEC_NUMERATOR AS ONEp_DEFECTION_COUNT,\n            R1M_2PLUS_DLR_DEFEC_NUMERATOR AS TWOp_DEFECTION_COUNT\n            \nFROM FCA_SR_OWNER.FCA_DLR_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')\nORDER BY 2,3";

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
							row5.MONTH = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(1);
							if (tmpContent_tOracleInput_7 != null) {
								row5.MONTH = tmpContent_tOracleInput_7;
							} else {
								row5.MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 2) {
							row5.DEALER_CODE = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(2);
							if (tmpContent_tOracleInput_7 != null) {
								row5.DEALER_CODE = tmpContent_tOracleInput_7;
							} else {
								row5.DEALER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 3) {
							row5.YEAR_OF_OWNERSHIP = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(3);
							if (tmpContent_tOracleInput_7 != null) {
								row5.YEAR_OF_OWNERSHIP = tmpContent_tOracleInput_7;
							} else {
								row5.YEAR_OF_OWNERSHIP = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 4) {
							row5.VEHICLE_COUNT_DENOM = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(4);
							if (tmpContent_tOracleInput_7 != null) {
								row5.VEHICLE_COUNT_DENOM = tmpContent_tOracleInput_7;
							} else {
								row5.VEHICLE_COUNT_DENOM = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 5) {
							row5.ONEp_RETENTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(5);
							if (tmpContent_tOracleInput_7 != null) {
								row5.ONEp_RETENTION_COUNT = tmpContent_tOracleInput_7;
							} else {
								row5.ONEp_RETENTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 6) {
							row5.TWOp_RETENTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(6);
							if (tmpContent_tOracleInput_7 != null) {
								row5.TWOp_RETENTION_COUNT = tmpContent_tOracleInput_7;
							} else {
								row5.TWOp_RETENTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 7) {
							row5.ONEp_DEFECTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(7);
							if (tmpContent_tOracleInput_7 != null) {
								row5.ONEp_DEFECTION_COUNT = tmpContent_tOracleInput_7;
							} else {
								row5.ONEp_DEFECTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_7 < 8) {
							row5.TWOp_DEFECTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_7 = rs_tOracleInput_7
									.getString(8);
							if (tmpContent_tOracleInput_7 != null) {
								row5.TWOp_DEFECTION_COUNT = tmpContent_tOracleInput_7;
							} else {
								row5.TWOp_DEFECTION_COUNT = null;
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
						 * [tSortRow_1_SortOut main ] start
						 */

						currentVirtualComponent = "tSortRow_1";

						currentComponent = "tSortRow_1_SortOut";

						if (log.isTraceEnabled()) {
							log.trace("row5 - "
									+ (row5 == null ? "" : row5.toLogString()));
						}

						Comparablerow5Struct arrayRowtSortRow_1_SortOut = new Comparablerow5Struct();

						arrayRowtSortRow_1_SortOut.MONTH = row5.MONTH;
						arrayRowtSortRow_1_SortOut.DEALER_CODE = row5.DEALER_CODE;
						arrayRowtSortRow_1_SortOut.YEAR_OF_OWNERSHIP = row5.YEAR_OF_OWNERSHIP;
						arrayRowtSortRow_1_SortOut.VEHICLE_COUNT_DENOM = row5.VEHICLE_COUNT_DENOM;
						arrayRowtSortRow_1_SortOut.ONEp_RETENTION_COUNT = row5.ONEp_RETENTION_COUNT;
						arrayRowtSortRow_1_SortOut.TWOp_RETENTION_COUNT = row5.TWOp_RETENTION_COUNT;
						arrayRowtSortRow_1_SortOut.ONEp_DEFECTION_COUNT = row5.ONEp_DEFECTION_COUNT;
						arrayRowtSortRow_1_SortOut.TWOp_DEFECTION_COUNT = row5.TWOp_DEFECTION_COUNT;
						list_tSortRow_1_SortOut.add(arrayRowtSortRow_1_SortOut);

						tos_count_tSortRow_1_SortOut++;

						/**
						 * [tSortRow_1_SortOut main ] stop
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
				 * [tSortRow_1_SortOut end ] start
				 */

				currentVirtualComponent = "tSortRow_1";

				currentComponent = "tSortRow_1_SortOut";

				row5Struct[] array_tSortRow_1_SortOut = list_tSortRow_1_SortOut
						.toArray(new Comparablerow5Struct[0]);

				java.util.Arrays.sort(array_tSortRow_1_SortOut);

				globalMap.put("tSortRow_1", array_tSortRow_1_SortOut);

				if (log.isInfoEnabled())
					log.info("tSortRow_1_SortOut - " + "Done.");

				ok_Hash.put("tSortRow_1_SortOut", true);
				end_Hash.put("tSortRow_1_SortOut", System.currentTimeMillis());

				/**
				 * [tSortRow_1_SortOut end ] stop
				 */

				/**
				 * [tFileOutputPositional_1 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_1", false);
				start_Hash.put("tFileOutputPositional_1",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_1";

				int tos_count_tFileOutputPositional_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_1 = new StringBuilder();
				log4jParamters_tFileOutputPositional_1.append("Parameters:");
				log4jParamters_tFileOutputPositional_1
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"Dealer_Retention_Stats_R1M_\" + context.rMonth + \".txt\"");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'R'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("6")
						+ ", SCHEMA_COLUMN=" + ("MONTH") + "}, {ALIGN="
						+ ("'R'") + ", PADDING_CHAR=" + ("0") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("5") + ", SCHEMA_COLUMN="
						+ ("DEALER_CODE") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("2") + ", SCHEMA_COLUMN="
						+ ("YEAR_OF_OWNERSHIP") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("VEHICLE_COUNT_DENOM") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONEp_RETENTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("TWOp_RETENTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONEp_DEFECTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("TWOp_DEFECTION_COUNT") + "}]");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				log4jParamters_tFileOutputPositional_1
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_1 - "
							+ log4jParamters_tFileOutputPositional_1);

				int nb_line_tFileOutputPositional_1 = 0;

				class PositionUtil_tFileOutputPositional_1 {

					void setValue_0(final row9Struct row9,
							StringBuilder sb_tFileOutputPositional_1,
							String tempStringMtFileOutputPositional_1,
							int tempLengthMtFileOutputPositional_1)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.MONTH == null) ? ""
								: row9.MONTH;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 6) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 6) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 6 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(' ');
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.DEALER_CODE == null) ? ""
								: row9.DEALER_CODE;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 5) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 5) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 5 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(0);
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.YEAR_OF_OWNERSHIP == null) ? ""
								: row9.YEAR_OF_OWNERSHIP;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 2) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 2) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 2 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(0);
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.VEHICLE_COUNT_DENOM == null) ? ""
								: row9.VEHICLE_COUNT_DENOM;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 8) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 8) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 8 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(0);
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.ONEp_RETENTION_COUNT == null) ? ""
								: row9.ONEp_RETENTION_COUNT;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 8) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 8) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 8 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(0);
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.TWOp_RETENTION_COUNT == null) ? ""
								: row9.TWOp_RETENTION_COUNT;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 8) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 8) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 8 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(0);
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.ONEp_DEFECTION_COUNT == null) ? ""
								: row9.ONEp_DEFECTION_COUNT;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 8) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 8) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 8 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(0);
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_1 = (row9.TWOp_DEFECTION_COUNT == null) ? ""
								: row9.TWOp_DEFECTION_COUNT;

						tempLengthMtFileOutputPositional_1 = tempStringMtFileOutputPositional_1
								.length();

						if (tempLengthMtFileOutputPositional_1 >= 8) {
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);
						} else if (tempLengthMtFileOutputPositional_1 < 8) {

							for (int i_tFileOutputPositional_1 = 0; i_tFileOutputPositional_1 < 8 - tempLengthMtFileOutputPositional_1; i_tFileOutputPositional_1++) {
								sb_tFileOutputPositional_1.append(0);
							}
							sb_tFileOutputPositional_1
									.append(tempStringMtFileOutputPositional_1);

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_1 positionUtil_tFileOutputPositional_1 = new PositionUtil_tFileOutputPositional_1();

				String fileNewName_tFileOutputPositional_1 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Dealer_Retention_Stats_R1M_" + context.rMonth
						+ ".txt";
				java.io.File createFiletFileOutputPositional_1 = new java.io.File(
						fileNewName_tFileOutputPositional_1);
				boolean isFileGenerated_tFileOutputPositional_1 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_1 = createFiletFileOutputPositional_1
						.getParentFile();
				if (parentFile_tFileOutputPositional_1 != null
						&& !parentFile_tFileOutputPositional_1.exists()) {
					parentFile_tFileOutputPositional_1.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_1 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_1,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_1 begin ] stop
				 */

				/**
				 * [tSortRow_1_SortIn begin ] start
				 */

				ok_Hash.put("tSortRow_1_SortIn", false);
				start_Hash.put("tSortRow_1_SortIn", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_1";

				currentComponent = "tSortRow_1_SortIn";

				int tos_count_tSortRow_1_SortIn = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_1_SortIn - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_1_SortIn = new StringBuilder();
				log4jParamters_tSortRow_1_SortIn.append("Parameters:");
				log4jParamters_tSortRow_1_SortIn.append("ORIGIN" + " = "
						+ "tSortRow_1");
				log4jParamters_tSortRow_1_SortIn.append(" | ");
				log4jParamters_tSortRow_1_SortIn.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_1_SortIn.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_1_SortIn - "
							+ log4jParamters_tSortRow_1_SortIn);

				row5Struct[] array_tSortRow_1_SortIn = (row5Struct[]) globalMap
						.get("tSortRow_1");

				int nb_line_tSortRow_1_SortIn = 0;

				row5Struct current_tSortRow_1_SortIn = null;

				for (int i_tSortRow_1_SortIn = 0; i_tSortRow_1_SortIn < array_tSortRow_1_SortIn.length; i_tSortRow_1_SortIn++) {
					current_tSortRow_1_SortIn = array_tSortRow_1_SortIn[i_tSortRow_1_SortIn];
					row9.MONTH = current_tSortRow_1_SortIn.MONTH;
					row9.DEALER_CODE = current_tSortRow_1_SortIn.DEALER_CODE;
					row9.YEAR_OF_OWNERSHIP = current_tSortRow_1_SortIn.YEAR_OF_OWNERSHIP;
					row9.VEHICLE_COUNT_DENOM = current_tSortRow_1_SortIn.VEHICLE_COUNT_DENOM;
					row9.ONEp_RETENTION_COUNT = current_tSortRow_1_SortIn.ONEp_RETENTION_COUNT;
					row9.TWOp_RETENTION_COUNT = current_tSortRow_1_SortIn.TWOp_RETENTION_COUNT;
					row9.ONEp_DEFECTION_COUNT = current_tSortRow_1_SortIn.ONEp_DEFECTION_COUNT;
					row9.TWOp_DEFECTION_COUNT = current_tSortRow_1_SortIn.TWOp_DEFECTION_COUNT;
					// increase number of line sorted
					nb_line_tSortRow_1_SortIn++;

					/**
					 * [tSortRow_1_SortIn begin ] stop
					 */

					/**
					 * [tSortRow_1_SortIn main ] start
					 */

					currentVirtualComponent = "tSortRow_1";

					currentComponent = "tSortRow_1_SortIn";

					tos_count_tSortRow_1_SortIn++;

					/**
					 * [tSortRow_1_SortIn main ] stop
					 */

					/**
					 * [tFileOutputPositional_1 main ] start
					 */

					currentComponent = "tFileOutputPositional_1";

					if (log.isTraceEnabled()) {
						log.trace("row9 - "
								+ (row9 == null ? "" : row9.toLogString()));
					}

					String tempStringMtFileOutputPositional_1 = null;

					int tempLengthMtFileOutputPositional_1 = 0;

					StringBuilder sb_tFileOutputPositional_1 = new StringBuilder();
					positionUtil_tFileOutputPositional_1.setValue_0(row9,
							sb_tFileOutputPositional_1,
							tempStringMtFileOutputPositional_1,
							tempLengthMtFileOutputPositional_1);
					sb_tFileOutputPositional_1.append("\r\n");

					synchronized (multiThreadLockWrite) {

						outtFileOutputPositional_1
								.write(sb_tFileOutputPositional_1.toString());

					}

					nb_line_tFileOutputPositional_1++;
					log.debug("tFileOutputPositional_1 - Writing the record "
							+ nb_line_tFileOutputPositional_1 + " to the file.");

					tos_count_tFileOutputPositional_1++;

					/**
					 * [tFileOutputPositional_1 main ] stop
					 */

					/**
					 * [tSortRow_1_SortIn end ] start
					 */

					currentVirtualComponent = "tSortRow_1";

					currentComponent = "tSortRow_1_SortIn";

				}

				globalMap.put("tSortRow_1_SortIn_NB_LINE",
						nb_line_tSortRow_1_SortIn);

				if (log.isInfoEnabled())
					log.info("tSortRow_1_SortIn - " + "Done.");

				ok_Hash.put("tSortRow_1_SortIn", true);
				end_Hash.put("tSortRow_1_SortIn", System.currentTimeMillis());

				/**
				 * [tSortRow_1_SortIn end ] stop
				 */

				/**
				 * [tFileOutputPositional_1 end ] start
				 */

				currentComponent = "tFileOutputPositional_1";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_1.close();
				}
				globalMap.put("tFileOutputPositional_1_NB_LINE",
						nb_line_tFileOutputPositional_1);
				log.info("tFileOutputPositional_1 - Written records count: "
						+ nb_line_tFileOutputPositional_1 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_1 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_1", true);
				end_Hash.put("tFileOutputPositional_1",
						System.currentTimeMillis());

				tOracleInput_8Process(globalMap);

				/**
				 * [tFileOutputPositional_1 end ] stop
				 */

			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			te.setVirtualComponentName(currentVirtualComponent);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			// free memory for "tSortRow_1_SortIn"
			globalMap.remove("tSortRow_1");

			try {

				/**
				 * [tOracleInput_7 finally ] start
				 */

				currentComponent = "tOracleInput_7";

				/**
				 * [tOracleInput_7 finally ] stop
				 */

				/**
				 * [tSortRow_1_SortOut finally ] start
				 */

				currentVirtualComponent = "tSortRow_1";

				currentComponent = "tSortRow_1_SortOut";

				/**
				 * [tSortRow_1_SortOut finally ] stop
				 */

				/**
				 * [tSortRow_1_SortIn finally ] start
				 */

				currentVirtualComponent = "tSortRow_1";

				currentComponent = "tSortRow_1_SortIn";

				/**
				 * [tSortRow_1_SortIn finally ] stop
				 */

				/**
				 * [tFileOutputPositional_1 finally ] start
				 */

				currentComponent = "tFileOutputPositional_1";

				/**
				 * [tFileOutputPositional_1 finally ] stop
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

	public static class row16Struct implements
			routines.system.IPersistableRow<row16Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
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

	public static class OnRowsEndStructtSortRow_2 implements
			routines.system.IPersistableRow<OnRowsEndStructtSortRow_2> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OnRowsEndStructtSortRow_2 other) {

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

	public static class row7Struct implements
			routines.system.IPersistableRow<row7Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
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

	public void tOracleInput_8Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_8_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;
		String currentVirtualComponent = null;

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
				row16Struct row16 = new row16Struct();

				/**
				 * [tSortRow_2_SortOut begin ] start
				 */

				ok_Hash.put("tSortRow_2_SortOut", false);
				start_Hash
						.put("tSortRow_2_SortOut", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_2";

				currentComponent = "tSortRow_2_SortOut";

				int tos_count_tSortRow_2_SortOut = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_2_SortOut - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_2_SortOut = new StringBuilder();
				log4jParamters_tSortRow_2_SortOut.append("Parameters:");
				log4jParamters_tSortRow_2_SortOut.append("DESTINATION" + " = "
						+ "tSortRow_2");
				log4jParamters_tSortRow_2_SortOut.append(" | ");
				log4jParamters_tSortRow_2_SortOut.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_2_SortOut.append(" | ");
				log4jParamters_tSortRow_2_SortOut.append("CRITERIA" + " = "
						+ "[{ORDER=" + ("asc") + ", COLNAME=" + ("DEALER_CODE")
						+ ", SORT=" + ("alpha") + "}, {ORDER=" + ("asc")
						+ ", COLNAME=" + ("YEAR_OF_OWNERSHIP") + ", SORT="
						+ ("alpha") + "}]");
				log4jParamters_tSortRow_2_SortOut.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_2_SortOut - "
							+ log4jParamters_tSortRow_2_SortOut);

				class Comparablerow7Struct extends row7Struct implements
						Comparable<Comparablerow7Struct> {

					public int compareTo(Comparablerow7Struct other) {

						if (this.DEALER_CODE == null
								&& other.DEALER_CODE != null) {
							return -1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE == null) {
							return 1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE != null) {
							if (!this.DEALER_CODE.equals(other.DEALER_CODE)) {
								return this.DEALER_CODE
										.compareTo(other.DEALER_CODE);
							}
						}
						if (this.YEAR_OF_OWNERSHIP == null
								&& other.YEAR_OF_OWNERSHIP != null) {
							return -1;

						} else if (this.YEAR_OF_OWNERSHIP != null
								&& other.YEAR_OF_OWNERSHIP == null) {
							return 1;

						} else if (this.YEAR_OF_OWNERSHIP != null
								&& other.YEAR_OF_OWNERSHIP != null) {
							if (!this.YEAR_OF_OWNERSHIP
									.equals(other.YEAR_OF_OWNERSHIP)) {
								return this.YEAR_OF_OWNERSHIP
										.compareTo(other.YEAR_OF_OWNERSHIP);
							}
						}
						return 0;
					}
				}

				java.util.List<Comparablerow7Struct> list_tSortRow_2_SortOut = new java.util.ArrayList<Comparablerow7Struct>();

				/**
				 * [tSortRow_2_SortOut begin ] stop
				 */

				/**
				 * [tOracleInput_8 begin ] start
				 */

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
								+ "\"SELECT               TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,              DLR_CD AS DEALER_CODE,              YR_OF_OWNERSHIP AS YEAR_OF_OWNERSHIP,              VEH_CNT_DENOMINATOR AS VEHICLE_COUNTDENOMINATOR,              R3M_1PLUS_DLR_RETEN_NUMERATOR AS ONEp_RETENTION_COUNT,              R3M_2PLUS_DLR_RETEN_NUMERATOR AS TWOp_RETENTION_COUNT,              R3M_1PLUS_DLR_DEFEC_NUMERATOR AS ONEp_DEFECTION_COUNT,              R3M_2PLUS_DLR_DEFEC_NUMERATOR AS TWOp_DEFECTION_COUNT                FROM FCA_SR_OWNER.FCA_DLR_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')  ORDER BY 2,3\"");
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
						+ ("MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("DEALER_CODE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("YEAR_OF_OWNERSHIP") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEHICLE_COUNT_DENOM")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONEp_RETENTION_COUNT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TWOp_RETENTION_COUNT")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONEp_DEFECTION_COUNT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TWOp_DEFECTION_COUNT") + "}]");
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

				String dbquery_tOracleInput_8 = "SELECT \n            TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,\n            DLR_CD AS DEALER_CODE,\n            YR_OF_OWNERSHIP AS YEAR_OF_OWNERSHIP,\n            VEH_CNT_DENOMINATOR AS VEHICLE_COUNTDENOMINATOR,\n            R3M_1PLUS_DLR_RETEN_NUMERATOR AS ONEp_RETENTION_COUNT,\n            R3M_2PLUS_DLR_RETEN_NUMERATOR AS TWOp_RETENTION_COUNT,\n            R3M_1PLUS_DLR_DEFEC_NUMERATOR AS ONEp_DEFECTION_COUNT,\n            R3M_2PLUS_DLR_DEFEC_NUMERATOR AS TWOp_DEFECTION_COUNT\n            \nFROM FCA_SR_OWNER.FCA_DLR_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')\nORDER BY 2,3";

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

						if (colQtyInRs_tOracleInput_8 < 1) {
							row7.MONTH = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(1);
							if (tmpContent_tOracleInput_8 != null) {
								row7.MONTH = tmpContent_tOracleInput_8;
							} else {
								row7.MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_8 < 2) {
							row7.DEALER_CODE = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(2);
							if (tmpContent_tOracleInput_8 != null) {
								row7.DEALER_CODE = tmpContent_tOracleInput_8;
							} else {
								row7.DEALER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_8 < 3) {
							row7.YEAR_OF_OWNERSHIP = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(3);
							if (tmpContent_tOracleInput_8 != null) {
								row7.YEAR_OF_OWNERSHIP = tmpContent_tOracleInput_8;
							} else {
								row7.YEAR_OF_OWNERSHIP = null;
							}
						}
						if (colQtyInRs_tOracleInput_8 < 4) {
							row7.VEHICLE_COUNT_DENOM = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(4);
							if (tmpContent_tOracleInput_8 != null) {
								row7.VEHICLE_COUNT_DENOM = tmpContent_tOracleInput_8;
							} else {
								row7.VEHICLE_COUNT_DENOM = null;
							}
						}
						if (colQtyInRs_tOracleInput_8 < 5) {
							row7.ONEp_RETENTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(5);
							if (tmpContent_tOracleInput_8 != null) {
								row7.ONEp_RETENTION_COUNT = tmpContent_tOracleInput_8;
							} else {
								row7.ONEp_RETENTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_8 < 6) {
							row7.TWOp_RETENTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(6);
							if (tmpContent_tOracleInput_8 != null) {
								row7.TWOp_RETENTION_COUNT = tmpContent_tOracleInput_8;
							} else {
								row7.TWOp_RETENTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_8 < 7) {
							row7.ONEp_DEFECTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(7);
							if (tmpContent_tOracleInput_8 != null) {
								row7.ONEp_DEFECTION_COUNT = tmpContent_tOracleInput_8;
							} else {
								row7.ONEp_DEFECTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_8 < 8) {
							row7.TWOp_DEFECTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_8 = rs_tOracleInput_8
									.getString(8);
							if (tmpContent_tOracleInput_8 != null) {
								row7.TWOp_DEFECTION_COUNT = tmpContent_tOracleInput_8;
							} else {
								row7.TWOp_DEFECTION_COUNT = null;
							}
						}

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

						/**
						 * [tSortRow_2_SortOut main ] start
						 */

						currentVirtualComponent = "tSortRow_2";

						currentComponent = "tSortRow_2_SortOut";

						if (log.isTraceEnabled()) {
							log.trace("row7 - "
									+ (row7 == null ? "" : row7.toLogString()));
						}

						Comparablerow7Struct arrayRowtSortRow_2_SortOut = new Comparablerow7Struct();

						arrayRowtSortRow_2_SortOut.MONTH = row7.MONTH;
						arrayRowtSortRow_2_SortOut.DEALER_CODE = row7.DEALER_CODE;
						arrayRowtSortRow_2_SortOut.YEAR_OF_OWNERSHIP = row7.YEAR_OF_OWNERSHIP;
						arrayRowtSortRow_2_SortOut.VEHICLE_COUNT_DENOM = row7.VEHICLE_COUNT_DENOM;
						arrayRowtSortRow_2_SortOut.ONEp_RETENTION_COUNT = row7.ONEp_RETENTION_COUNT;
						arrayRowtSortRow_2_SortOut.TWOp_RETENTION_COUNT = row7.TWOp_RETENTION_COUNT;
						arrayRowtSortRow_2_SortOut.ONEp_DEFECTION_COUNT = row7.ONEp_DEFECTION_COUNT;
						arrayRowtSortRow_2_SortOut.TWOp_DEFECTION_COUNT = row7.TWOp_DEFECTION_COUNT;
						list_tSortRow_2_SortOut.add(arrayRowtSortRow_2_SortOut);

						tos_count_tSortRow_2_SortOut++;

						/**
						 * [tSortRow_2_SortOut main ] stop
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

				/**
				 * [tSortRow_2_SortOut end ] start
				 */

				currentVirtualComponent = "tSortRow_2";

				currentComponent = "tSortRow_2_SortOut";

				row7Struct[] array_tSortRow_2_SortOut = list_tSortRow_2_SortOut
						.toArray(new Comparablerow7Struct[0]);

				java.util.Arrays.sort(array_tSortRow_2_SortOut);

				globalMap.put("tSortRow_2", array_tSortRow_2_SortOut);

				if (log.isInfoEnabled())
					log.info("tSortRow_2_SortOut - " + "Done.");

				ok_Hash.put("tSortRow_2_SortOut", true);
				end_Hash.put("tSortRow_2_SortOut", System.currentTimeMillis());

				/**
				 * [tSortRow_2_SortOut end ] stop
				 */

				/**
				 * [tFileOutputPositional_2 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_2", false);
				start_Hash.put("tFileOutputPositional_2",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_2";

				int tos_count_tFileOutputPositional_2 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_2 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_2 = new StringBuilder();
				log4jParamters_tFileOutputPositional_2.append("Parameters:");
				log4jParamters_tFileOutputPositional_2
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"Dealer_Retention_Stats_R3M_\" + context.rMonth + \".txt\"");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'R'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("6")
						+ ", SCHEMA_COLUMN=" + ("MONTH") + "}, {ALIGN="
						+ ("'R'") + ", PADDING_CHAR=" + ("0") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("5") + ", SCHEMA_COLUMN="
						+ ("DEALER_CODE") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("2") + ", SCHEMA_COLUMN="
						+ ("YEAR_OF_OWNERSHIP") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("VEHICLE_COUNT_DENOM") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONEp_RETENTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("TWOp_RETENTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONEp_DEFECTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("TWOp_DEFECTION_COUNT") + "}]");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				log4jParamters_tFileOutputPositional_2
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_2 - "
							+ log4jParamters_tFileOutputPositional_2);

				int nb_line_tFileOutputPositional_2 = 0;

				class PositionUtil_tFileOutputPositional_2 {

					void setValue_0(final row16Struct row16,
							StringBuilder sb_tFileOutputPositional_2,
							String tempStringMtFileOutputPositional_2,
							int tempLengthMtFileOutputPositional_2)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.MONTH == null) ? ""
								: row16.MONTH;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 6) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 6) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 6 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(' ');
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.DEALER_CODE == null) ? ""
								: row16.DEALER_CODE;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 5) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 5) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 5 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(0);
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.YEAR_OF_OWNERSHIP == null) ? ""
								: row16.YEAR_OF_OWNERSHIP;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 2) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 2) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 2 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(0);
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.VEHICLE_COUNT_DENOM == null) ? ""
								: row16.VEHICLE_COUNT_DENOM;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 8) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 8) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 8 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(0);
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.ONEp_RETENTION_COUNT == null) ? ""
								: row16.ONEp_RETENTION_COUNT;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 8) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 8) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 8 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(0);
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.TWOp_RETENTION_COUNT == null) ? ""
								: row16.TWOp_RETENTION_COUNT;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 8) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 8) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 8 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(0);
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.ONEp_DEFECTION_COUNT == null) ? ""
								: row16.ONEp_DEFECTION_COUNT;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 8) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 8) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 8 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(0);
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_2 = (row16.TWOp_DEFECTION_COUNT == null) ? ""
								: row16.TWOp_DEFECTION_COUNT;

						tempLengthMtFileOutputPositional_2 = tempStringMtFileOutputPositional_2
								.length();

						if (tempLengthMtFileOutputPositional_2 >= 8) {
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);
						} else if (tempLengthMtFileOutputPositional_2 < 8) {

							for (int i_tFileOutputPositional_2 = 0; i_tFileOutputPositional_2 < 8 - tempLengthMtFileOutputPositional_2; i_tFileOutputPositional_2++) {
								sb_tFileOutputPositional_2.append(0);
							}
							sb_tFileOutputPositional_2
									.append(tempStringMtFileOutputPositional_2);

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_2 positionUtil_tFileOutputPositional_2 = new PositionUtil_tFileOutputPositional_2();

				String fileNewName_tFileOutputPositional_2 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Dealer_Retention_Stats_R3M_" + context.rMonth
						+ ".txt";
				java.io.File createFiletFileOutputPositional_2 = new java.io.File(
						fileNewName_tFileOutputPositional_2);
				boolean isFileGenerated_tFileOutputPositional_2 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_2 = createFiletFileOutputPositional_2
						.getParentFile();
				if (parentFile_tFileOutputPositional_2 != null
						&& !parentFile_tFileOutputPositional_2.exists()) {
					parentFile_tFileOutputPositional_2.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_2 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_2,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_2 begin ] stop
				 */

				/**
				 * [tSortRow_2_SortIn begin ] start
				 */

				ok_Hash.put("tSortRow_2_SortIn", false);
				start_Hash.put("tSortRow_2_SortIn", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_2";

				currentComponent = "tSortRow_2_SortIn";

				int tos_count_tSortRow_2_SortIn = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_2_SortIn - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_2_SortIn = new StringBuilder();
				log4jParamters_tSortRow_2_SortIn.append("Parameters:");
				log4jParamters_tSortRow_2_SortIn.append("ORIGIN" + " = "
						+ "tSortRow_2");
				log4jParamters_tSortRow_2_SortIn.append(" | ");
				log4jParamters_tSortRow_2_SortIn.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_2_SortIn.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_2_SortIn - "
							+ log4jParamters_tSortRow_2_SortIn);

				row7Struct[] array_tSortRow_2_SortIn = (row7Struct[]) globalMap
						.get("tSortRow_2");

				int nb_line_tSortRow_2_SortIn = 0;

				row7Struct current_tSortRow_2_SortIn = null;

				for (int i_tSortRow_2_SortIn = 0; i_tSortRow_2_SortIn < array_tSortRow_2_SortIn.length; i_tSortRow_2_SortIn++) {
					current_tSortRow_2_SortIn = array_tSortRow_2_SortIn[i_tSortRow_2_SortIn];
					row16.MONTH = current_tSortRow_2_SortIn.MONTH;
					row16.DEALER_CODE = current_tSortRow_2_SortIn.DEALER_CODE;
					row16.YEAR_OF_OWNERSHIP = current_tSortRow_2_SortIn.YEAR_OF_OWNERSHIP;
					row16.VEHICLE_COUNT_DENOM = current_tSortRow_2_SortIn.VEHICLE_COUNT_DENOM;
					row16.ONEp_RETENTION_COUNT = current_tSortRow_2_SortIn.ONEp_RETENTION_COUNT;
					row16.TWOp_RETENTION_COUNT = current_tSortRow_2_SortIn.TWOp_RETENTION_COUNT;
					row16.ONEp_DEFECTION_COUNT = current_tSortRow_2_SortIn.ONEp_DEFECTION_COUNT;
					row16.TWOp_DEFECTION_COUNT = current_tSortRow_2_SortIn.TWOp_DEFECTION_COUNT;
					// increase number of line sorted
					nb_line_tSortRow_2_SortIn++;

					/**
					 * [tSortRow_2_SortIn begin ] stop
					 */

					/**
					 * [tSortRow_2_SortIn main ] start
					 */

					currentVirtualComponent = "tSortRow_2";

					currentComponent = "tSortRow_2_SortIn";

					tos_count_tSortRow_2_SortIn++;

					/**
					 * [tSortRow_2_SortIn main ] stop
					 */

					/**
					 * [tFileOutputPositional_2 main ] start
					 */

					currentComponent = "tFileOutputPositional_2";

					if (log.isTraceEnabled()) {
						log.trace("row16 - "
								+ (row16 == null ? "" : row16.toLogString()));
					}

					String tempStringMtFileOutputPositional_2 = null;

					int tempLengthMtFileOutputPositional_2 = 0;

					StringBuilder sb_tFileOutputPositional_2 = new StringBuilder();
					positionUtil_tFileOutputPositional_2.setValue_0(row16,
							sb_tFileOutputPositional_2,
							tempStringMtFileOutputPositional_2,
							tempLengthMtFileOutputPositional_2);
					sb_tFileOutputPositional_2.append("\r\n");

					synchronized (multiThreadLockWrite) {

						outtFileOutputPositional_2
								.write(sb_tFileOutputPositional_2.toString());

					}

					nb_line_tFileOutputPositional_2++;
					log.debug("tFileOutputPositional_2 - Writing the record "
							+ nb_line_tFileOutputPositional_2 + " to the file.");

					tos_count_tFileOutputPositional_2++;

					/**
					 * [tFileOutputPositional_2 main ] stop
					 */

					/**
					 * [tSortRow_2_SortIn end ] start
					 */

					currentVirtualComponent = "tSortRow_2";

					currentComponent = "tSortRow_2_SortIn";

				}

				globalMap.put("tSortRow_2_SortIn_NB_LINE",
						nb_line_tSortRow_2_SortIn);

				if (log.isInfoEnabled())
					log.info("tSortRow_2_SortIn - " + "Done.");

				ok_Hash.put("tSortRow_2_SortIn", true);
				end_Hash.put("tSortRow_2_SortIn", System.currentTimeMillis());

				/**
				 * [tSortRow_2_SortIn end ] stop
				 */

				/**
				 * [tFileOutputPositional_2 end ] start
				 */

				currentComponent = "tFileOutputPositional_2";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_2.close();
				}
				globalMap.put("tFileOutputPositional_2_NB_LINE",
						nb_line_tFileOutputPositional_2);
				log.info("tFileOutputPositional_2 - Written records count: "
						+ nb_line_tFileOutputPositional_2 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_2 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_2", true);
				end_Hash.put("tFileOutputPositional_2",
						System.currentTimeMillis());

				tOracleInput_9Process(globalMap);

				/**
				 * [tFileOutputPositional_2 end ] stop
				 */

			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			te.setVirtualComponentName(currentVirtualComponent);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			// free memory for "tSortRow_2_SortIn"
			globalMap.remove("tSortRow_2");

			try {

				/**
				 * [tOracleInput_8 finally ] start
				 */

				currentComponent = "tOracleInput_8";

				/**
				 * [tOracleInput_8 finally ] stop
				 */

				/**
				 * [tSortRow_2_SortOut finally ] start
				 */

				currentVirtualComponent = "tSortRow_2";

				currentComponent = "tSortRow_2_SortOut";

				/**
				 * [tSortRow_2_SortOut finally ] stop
				 */

				/**
				 * [tSortRow_2_SortIn finally ] start
				 */

				currentVirtualComponent = "tSortRow_2";

				currentComponent = "tSortRow_2_SortIn";

				/**
				 * [tSortRow_2_SortIn finally ] stop
				 */

				/**
				 * [tFileOutputPositional_2 finally ] start
				 */

				currentComponent = "tFileOutputPositional_2";

				/**
				 * [tFileOutputPositional_2 finally ] stop
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

	public static class row17Struct implements
			routines.system.IPersistableRow<row17Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row17Struct other) {

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

	public static class OnRowsEndStructtSortRow_3 implements
			routines.system.IPersistableRow<OnRowsEndStructtSortRow_3> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OnRowsEndStructtSortRow_3 other) {

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

	public static class row8Struct implements
			routines.system.IPersistableRow<row8Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String YEAR_OF_OWNERSHIP;

		public String getYEAR_OF_OWNERSHIP() {
			return this.YEAR_OF_OWNERSHIP;
		}

		public String VEHICLE_COUNT_DENOM;

		public String getVEHICLE_COUNT_DENOM() {
			return this.VEHICLE_COUNT_DENOM;
		}

		public String ONEp_RETENTION_COUNT;

		public String getONEp_RETENTION_COUNT() {
			return this.ONEp_RETENTION_COUNT;
		}

		public String TWOp_RETENTION_COUNT;

		public String getTWOp_RETENTION_COUNT() {
			return this.TWOp_RETENTION_COUNT;
		}

		public String ONEp_DEFECTION_COUNT;

		public String getONEp_DEFECTION_COUNT() {
			return this.ONEp_DEFECTION_COUNT;
		}

		public String TWOp_DEFECTION_COUNT;

		public String getTWOp_DEFECTION_COUNT() {
			return this.TWOp_DEFECTION_COUNT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.YEAR_OF_OWNERSHIP = readString(dis);

					this.VEHICLE_COUNT_DENOM = readString(dis);

					this.ONEp_RETENTION_COUNT = readString(dis);

					this.TWOp_RETENTION_COUNT = readString(dis);

					this.ONEp_DEFECTION_COUNT = readString(dis);

					this.TWOp_DEFECTION_COUNT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.YEAR_OF_OWNERSHIP, dos);

				// String

				writeString(this.VEHICLE_COUNT_DENOM, dos);

				// String

				writeString(this.ONEp_RETENTION_COUNT, dos);

				// String

				writeString(this.TWOp_RETENTION_COUNT, dos);

				// String

				writeString(this.ONEp_DEFECTION_COUNT, dos);

				// String

				writeString(this.TWOp_DEFECTION_COUNT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",YEAR_OF_OWNERSHIP=" + YEAR_OF_OWNERSHIP);
			sb.append(",VEHICLE_COUNT_DENOM=" + VEHICLE_COUNT_DENOM);
			sb.append(",ONEp_RETENTION_COUNT=" + ONEp_RETENTION_COUNT);
			sb.append(",TWOp_RETENTION_COUNT=" + TWOp_RETENTION_COUNT);
			sb.append(",ONEp_DEFECTION_COUNT=" + ONEp_DEFECTION_COUNT);
			sb.append(",TWOp_DEFECTION_COUNT=" + TWOp_DEFECTION_COUNT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (YEAR_OF_OWNERSHIP == null) {
				sb.append("<null>");
			} else {
				sb.append(YEAR_OF_OWNERSHIP);
			}

			sb.append("|");

			if (VEHICLE_COUNT_DENOM == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_COUNT_DENOM);
			}

			sb.append("|");

			if (ONEp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_RETENTION_COUNT);
			}

			sb.append("|");

			if (TWOp_RETENTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_RETENTION_COUNT);
			}

			sb.append("|");

			if (ONEp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(ONEp_DEFECTION_COUNT);
			}

			sb.append("|");

			if (TWOp_DEFECTION_COUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TWOp_DEFECTION_COUNT);
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

	public void tOracleInput_9Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_9_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;
		String currentVirtualComponent = null;

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

				row8Struct row8 = new row8Struct();
				row17Struct row17 = new row17Struct();

				/**
				 * [tSortRow_3_SortOut begin ] start
				 */

				ok_Hash.put("tSortRow_3_SortOut", false);
				start_Hash
						.put("tSortRow_3_SortOut", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_3";

				currentComponent = "tSortRow_3_SortOut";

				int tos_count_tSortRow_3_SortOut = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_3_SortOut - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_3_SortOut = new StringBuilder();
				log4jParamters_tSortRow_3_SortOut.append("Parameters:");
				log4jParamters_tSortRow_3_SortOut.append("DESTINATION" + " = "
						+ "tSortRow_3");
				log4jParamters_tSortRow_3_SortOut.append(" | ");
				log4jParamters_tSortRow_3_SortOut.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_3_SortOut.append(" | ");
				log4jParamters_tSortRow_3_SortOut.append("CRITERIA" + " = "
						+ "[{ORDER=" + ("asc") + ", COLNAME=" + ("DEALER_CODE")
						+ ", SORT=" + ("alpha") + "}, {ORDER=" + ("asc")
						+ ", COLNAME=" + ("YEAR_OF_OWNERSHIP") + ", SORT="
						+ ("alpha") + "}]");
				log4jParamters_tSortRow_3_SortOut.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_3_SortOut - "
							+ log4jParamters_tSortRow_3_SortOut);

				class Comparablerow8Struct extends row8Struct implements
						Comparable<Comparablerow8Struct> {

					public int compareTo(Comparablerow8Struct other) {

						if (this.DEALER_CODE == null
								&& other.DEALER_CODE != null) {
							return -1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE == null) {
							return 1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE != null) {
							if (!this.DEALER_CODE.equals(other.DEALER_CODE)) {
								return this.DEALER_CODE
										.compareTo(other.DEALER_CODE);
							}
						}
						if (this.YEAR_OF_OWNERSHIP == null
								&& other.YEAR_OF_OWNERSHIP != null) {
							return -1;

						} else if (this.YEAR_OF_OWNERSHIP != null
								&& other.YEAR_OF_OWNERSHIP == null) {
							return 1;

						} else if (this.YEAR_OF_OWNERSHIP != null
								&& other.YEAR_OF_OWNERSHIP != null) {
							if (!this.YEAR_OF_OWNERSHIP
									.equals(other.YEAR_OF_OWNERSHIP)) {
								return this.YEAR_OF_OWNERSHIP
										.compareTo(other.YEAR_OF_OWNERSHIP);
							}
						}
						return 0;
					}
				}

				java.util.List<Comparablerow8Struct> list_tSortRow_3_SortOut = new java.util.ArrayList<Comparablerow8Struct>();

				/**
				 * [tSortRow_3_SortOut begin ] stop
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
								+ "\"SELECT               TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,              DLR_CD AS DEALER_CODE,              YR_OF_OWNERSHIP AS YEAR_OF_OWNERSHIP,              VEH_CNT_DENOMINATOR AS VEHICLE_COUNTDENOMINATOR,              R12M_1PLUS_DLR_RETEN_NUMERATOR AS ONEp_RETENTION_COUNT,              R12M_2PLUS_DLR_RETEN_NUMERATOR AS TWOp_RETENTION_COUNT,              R12M_1PLUS_DLR_DEFEC_NUMERATOR AS ONEp_DEFECTION_COUNT,              R12M_2PLUS_DLR_DEFEC_NUMERATOR AS TWOp_DEFECTION_COUNT                FROM FCA_SR_OWNER.FCA_DLR_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')  ORDER BY 2,3\"");
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
						+ ("MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("DEALER_CODE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("YEAR_OF_OWNERSHIP") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEHICLE_COUNT_DENOM")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONEp_RETENTION_COUNT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TWOp_RETENTION_COUNT")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONEp_DEFECTION_COUNT") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("TWOp_DEFECTION_COUNT") + "}]");
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

				String dbquery_tOracleInput_9 = "SELECT \n            TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,\n            DLR_CD AS DEALER_CODE,\n            YR_OF_OWNERSHIP AS YEAR_OF_OWNERSHIP,\n            VEH_CNT_DENOMINATOR AS VEHICLE_COUNTDENOMINATOR,\n            R12M_1PLUS_DLR_RETEN_NUMERATOR AS ONEp_RETENTION_COUNT,\n            R12M_2PLUS_DLR_RETEN_NUMERATOR AS TWOp_RETENTION_COUNT,\n            R12M_1PLUS_DLR_DEFEC_NUMERATOR AS ONEp_DEFECTION_COUNT,\n            R12M_2PLUS_DLR_DEFEC_NUMERATOR AS TWOp_DEFECTION_COUNT\n            \nFROM FCA_SR_OWNER.FCA_DLR_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')\nORDER BY 2,3";

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
							row8.MONTH = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(1);
							if (tmpContent_tOracleInput_9 != null) {
								row8.MONTH = tmpContent_tOracleInput_9;
							} else {
								row8.MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 2) {
							row8.DEALER_CODE = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(2);
							if (tmpContent_tOracleInput_9 != null) {
								row8.DEALER_CODE = tmpContent_tOracleInput_9;
							} else {
								row8.DEALER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 3) {
							row8.YEAR_OF_OWNERSHIP = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(3);
							if (tmpContent_tOracleInput_9 != null) {
								row8.YEAR_OF_OWNERSHIP = tmpContent_tOracleInput_9;
							} else {
								row8.YEAR_OF_OWNERSHIP = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 4) {
							row8.VEHICLE_COUNT_DENOM = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(4);
							if (tmpContent_tOracleInput_9 != null) {
								row8.VEHICLE_COUNT_DENOM = tmpContent_tOracleInput_9;
							} else {
								row8.VEHICLE_COUNT_DENOM = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 5) {
							row8.ONEp_RETENTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(5);
							if (tmpContent_tOracleInput_9 != null) {
								row8.ONEp_RETENTION_COUNT = tmpContent_tOracleInput_9;
							} else {
								row8.ONEp_RETENTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 6) {
							row8.TWOp_RETENTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(6);
							if (tmpContent_tOracleInput_9 != null) {
								row8.TWOp_RETENTION_COUNT = tmpContent_tOracleInput_9;
							} else {
								row8.TWOp_RETENTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 7) {
							row8.ONEp_DEFECTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(7);
							if (tmpContent_tOracleInput_9 != null) {
								row8.ONEp_DEFECTION_COUNT = tmpContent_tOracleInput_9;
							} else {
								row8.ONEp_DEFECTION_COUNT = null;
							}
						}
						if (colQtyInRs_tOracleInput_9 < 8) {
							row8.TWOp_DEFECTION_COUNT = null;
						} else {

							tmpContent_tOracleInput_9 = rs_tOracleInput_9
									.getString(8);
							if (tmpContent_tOracleInput_9 != null) {
								row8.TWOp_DEFECTION_COUNT = tmpContent_tOracleInput_9;
							} else {
								row8.TWOp_DEFECTION_COUNT = null;
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
						 * [tSortRow_3_SortOut main ] start
						 */

						currentVirtualComponent = "tSortRow_3";

						currentComponent = "tSortRow_3_SortOut";

						if (log.isTraceEnabled()) {
							log.trace("row8 - "
									+ (row8 == null ? "" : row8.toLogString()));
						}

						Comparablerow8Struct arrayRowtSortRow_3_SortOut = new Comparablerow8Struct();

						arrayRowtSortRow_3_SortOut.MONTH = row8.MONTH;
						arrayRowtSortRow_3_SortOut.DEALER_CODE = row8.DEALER_CODE;
						arrayRowtSortRow_3_SortOut.YEAR_OF_OWNERSHIP = row8.YEAR_OF_OWNERSHIP;
						arrayRowtSortRow_3_SortOut.VEHICLE_COUNT_DENOM = row8.VEHICLE_COUNT_DENOM;
						arrayRowtSortRow_3_SortOut.ONEp_RETENTION_COUNT = row8.ONEp_RETENTION_COUNT;
						arrayRowtSortRow_3_SortOut.TWOp_RETENTION_COUNT = row8.TWOp_RETENTION_COUNT;
						arrayRowtSortRow_3_SortOut.ONEp_DEFECTION_COUNT = row8.ONEp_DEFECTION_COUNT;
						arrayRowtSortRow_3_SortOut.TWOp_DEFECTION_COUNT = row8.TWOp_DEFECTION_COUNT;
						list_tSortRow_3_SortOut.add(arrayRowtSortRow_3_SortOut);

						tos_count_tSortRow_3_SortOut++;

						/**
						 * [tSortRow_3_SortOut main ] stop
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
				 * [tSortRow_3_SortOut end ] start
				 */

				currentVirtualComponent = "tSortRow_3";

				currentComponent = "tSortRow_3_SortOut";

				row8Struct[] array_tSortRow_3_SortOut = list_tSortRow_3_SortOut
						.toArray(new Comparablerow8Struct[0]);

				java.util.Arrays.sort(array_tSortRow_3_SortOut);

				globalMap.put("tSortRow_3", array_tSortRow_3_SortOut);

				if (log.isInfoEnabled())
					log.info("tSortRow_3_SortOut - " + "Done.");

				ok_Hash.put("tSortRow_3_SortOut", true);
				end_Hash.put("tSortRow_3_SortOut", System.currentTimeMillis());

				/**
				 * [tSortRow_3_SortOut end ] stop
				 */

				/**
				 * [tFileOutputPositional_3 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_3", false);
				start_Hash.put("tFileOutputPositional_3",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_3";

				int tos_count_tFileOutputPositional_3 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_3 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_3 = new StringBuilder();
				log4jParamters_tFileOutputPositional_3.append("Parameters:");
				log4jParamters_tFileOutputPositional_3
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"Dealer_Retention_Stats_R12M_\" + context.rMonth + \".txt\"");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'R'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("6")
						+ ", SCHEMA_COLUMN=" + ("MONTH") + "}, {ALIGN="
						+ ("'R'") + ", PADDING_CHAR=" + ("0") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("5") + ", SCHEMA_COLUMN="
						+ ("DEALER_CODE") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("2") + ", SCHEMA_COLUMN="
						+ ("YEAR_OF_OWNERSHIP") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("VEHICLE_COUNT_DENOM") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONEp_RETENTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("TWOp_RETENTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONEp_DEFECTION_COUNT") + "}, {ALIGN=" + ("'R'")
						+ ", PADDING_CHAR=" + ("0") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("TWOp_DEFECTION_COUNT") + "}]");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				log4jParamters_tFileOutputPositional_3
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_3.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_3 - "
							+ log4jParamters_tFileOutputPositional_3);

				int nb_line_tFileOutputPositional_3 = 0;

				class PositionUtil_tFileOutputPositional_3 {

					void setValue_0(final row17Struct row17,
							StringBuilder sb_tFileOutputPositional_3,
							String tempStringMtFileOutputPositional_3,
							int tempLengthMtFileOutputPositional_3)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.MONTH == null) ? ""
								: row17.MONTH;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 6) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 6) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 6 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(' ');
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.DEALER_CODE == null) ? ""
								: row17.DEALER_CODE;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 5) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 5) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 5 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(0);
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.YEAR_OF_OWNERSHIP == null) ? ""
								: row17.YEAR_OF_OWNERSHIP;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 2) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 2) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 2 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(0);
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.VEHICLE_COUNT_DENOM == null) ? ""
								: row17.VEHICLE_COUNT_DENOM;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 8) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 8) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 8 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(0);
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.ONEp_RETENTION_COUNT == null) ? ""
								: row17.ONEp_RETENTION_COUNT;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 8) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 8) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 8 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(0);
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.TWOp_RETENTION_COUNT == null) ? ""
								: row17.TWOp_RETENTION_COUNT;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 8) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 8) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 8 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(0);
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.ONEp_DEFECTION_COUNT == null) ? ""
								: row17.ONEp_DEFECTION_COUNT;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 8) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 8) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 8 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(0);
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_3 = (row17.TWOp_DEFECTION_COUNT == null) ? ""
								: row17.TWOp_DEFECTION_COUNT;

						tempLengthMtFileOutputPositional_3 = tempStringMtFileOutputPositional_3
								.length();

						if (tempLengthMtFileOutputPositional_3 >= 8) {
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);
						} else if (tempLengthMtFileOutputPositional_3 < 8) {

							for (int i_tFileOutputPositional_3 = 0; i_tFileOutputPositional_3 < 8 - tempLengthMtFileOutputPositional_3; i_tFileOutputPositional_3++) {
								sb_tFileOutputPositional_3.append(0);
							}
							sb_tFileOutputPositional_3
									.append(tempStringMtFileOutputPositional_3);

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_3 positionUtil_tFileOutputPositional_3 = new PositionUtil_tFileOutputPositional_3();

				String fileNewName_tFileOutputPositional_3 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Dealer_Retention_Stats_R12M_" + context.rMonth
						+ ".txt";
				java.io.File createFiletFileOutputPositional_3 = new java.io.File(
						fileNewName_tFileOutputPositional_3);
				boolean isFileGenerated_tFileOutputPositional_3 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_3 = createFiletFileOutputPositional_3
						.getParentFile();
				if (parentFile_tFileOutputPositional_3 != null
						&& !parentFile_tFileOutputPositional_3.exists()) {
					parentFile_tFileOutputPositional_3.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_3 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_3,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_3 begin ] stop
				 */

				/**
				 * [tSortRow_3_SortIn begin ] start
				 */

				ok_Hash.put("tSortRow_3_SortIn", false);
				start_Hash.put("tSortRow_3_SortIn", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_3";

				currentComponent = "tSortRow_3_SortIn";

				int tos_count_tSortRow_3_SortIn = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_3_SortIn - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_3_SortIn = new StringBuilder();
				log4jParamters_tSortRow_3_SortIn.append("Parameters:");
				log4jParamters_tSortRow_3_SortIn.append("ORIGIN" + " = "
						+ "tSortRow_3");
				log4jParamters_tSortRow_3_SortIn.append(" | ");
				log4jParamters_tSortRow_3_SortIn.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_3_SortIn.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_3_SortIn - "
							+ log4jParamters_tSortRow_3_SortIn);

				row8Struct[] array_tSortRow_3_SortIn = (row8Struct[]) globalMap
						.get("tSortRow_3");

				int nb_line_tSortRow_3_SortIn = 0;

				row8Struct current_tSortRow_3_SortIn = null;

				for (int i_tSortRow_3_SortIn = 0; i_tSortRow_3_SortIn < array_tSortRow_3_SortIn.length; i_tSortRow_3_SortIn++) {
					current_tSortRow_3_SortIn = array_tSortRow_3_SortIn[i_tSortRow_3_SortIn];
					row17.MONTH = current_tSortRow_3_SortIn.MONTH;
					row17.DEALER_CODE = current_tSortRow_3_SortIn.DEALER_CODE;
					row17.YEAR_OF_OWNERSHIP = current_tSortRow_3_SortIn.YEAR_OF_OWNERSHIP;
					row17.VEHICLE_COUNT_DENOM = current_tSortRow_3_SortIn.VEHICLE_COUNT_DENOM;
					row17.ONEp_RETENTION_COUNT = current_tSortRow_3_SortIn.ONEp_RETENTION_COUNT;
					row17.TWOp_RETENTION_COUNT = current_tSortRow_3_SortIn.TWOp_RETENTION_COUNT;
					row17.ONEp_DEFECTION_COUNT = current_tSortRow_3_SortIn.ONEp_DEFECTION_COUNT;
					row17.TWOp_DEFECTION_COUNT = current_tSortRow_3_SortIn.TWOp_DEFECTION_COUNT;
					// increase number of line sorted
					nb_line_tSortRow_3_SortIn++;

					/**
					 * [tSortRow_3_SortIn begin ] stop
					 */

					/**
					 * [tSortRow_3_SortIn main ] start
					 */

					currentVirtualComponent = "tSortRow_3";

					currentComponent = "tSortRow_3_SortIn";

					tos_count_tSortRow_3_SortIn++;

					/**
					 * [tSortRow_3_SortIn main ] stop
					 */

					/**
					 * [tFileOutputPositional_3 main ] start
					 */

					currentComponent = "tFileOutputPositional_3";

					if (log.isTraceEnabled()) {
						log.trace("row17 - "
								+ (row17 == null ? "" : row17.toLogString()));
					}

					String tempStringMtFileOutputPositional_3 = null;

					int tempLengthMtFileOutputPositional_3 = 0;

					StringBuilder sb_tFileOutputPositional_3 = new StringBuilder();
					positionUtil_tFileOutputPositional_3.setValue_0(row17,
							sb_tFileOutputPositional_3,
							tempStringMtFileOutputPositional_3,
							tempLengthMtFileOutputPositional_3);
					sb_tFileOutputPositional_3.append("\r\n");

					synchronized (multiThreadLockWrite) {

						outtFileOutputPositional_3
								.write(sb_tFileOutputPositional_3.toString());

					}

					nb_line_tFileOutputPositional_3++;
					log.debug("tFileOutputPositional_3 - Writing the record "
							+ nb_line_tFileOutputPositional_3 + " to the file.");

					tos_count_tFileOutputPositional_3++;

					/**
					 * [tFileOutputPositional_3 main ] stop
					 */

					/**
					 * [tSortRow_3_SortIn end ] start
					 */

					currentVirtualComponent = "tSortRow_3";

					currentComponent = "tSortRow_3_SortIn";

				}

				globalMap.put("tSortRow_3_SortIn_NB_LINE",
						nb_line_tSortRow_3_SortIn);

				if (log.isInfoEnabled())
					log.info("tSortRow_3_SortIn - " + "Done.");

				ok_Hash.put("tSortRow_3_SortIn", true);
				end_Hash.put("tSortRow_3_SortIn", System.currentTimeMillis());

				/**
				 * [tSortRow_3_SortIn end ] stop
				 */

				/**
				 * [tFileOutputPositional_3 end ] start
				 */

				currentComponent = "tFileOutputPositional_3";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_3.close();
				}
				globalMap.put("tFileOutputPositional_3_NB_LINE",
						nb_line_tFileOutputPositional_3);
				log.info("tFileOutputPositional_3 - Written records count: "
						+ nb_line_tFileOutputPositional_3 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_3 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_3", true);
				end_Hash.put("tFileOutputPositional_3",
						System.currentTimeMillis());

				tOracleInput_13Process(globalMap);

				/**
				 * [tFileOutputPositional_3 end ] stop
				 */

			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			te.setVirtualComponentName(currentVirtualComponent);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			// free memory for "tSortRow_3_SortIn"
			globalMap.remove("tSortRow_3");

			try {

				/**
				 * [tOracleInput_9 finally ] start
				 */

				currentComponent = "tOracleInput_9";

				/**
				 * [tOracleInput_9 finally ] stop
				 */

				/**
				 * [tSortRow_3_SortOut finally ] start
				 */

				currentVirtualComponent = "tSortRow_3";

				currentComponent = "tSortRow_3_SortOut";

				/**
				 * [tSortRow_3_SortOut finally ] stop
				 */

				/**
				 * [tSortRow_3_SortIn finally ] start
				 */

				currentVirtualComponent = "tSortRow_3";

				currentComponent = "tSortRow_3_SortIn";

				/**
				 * [tSortRow_3_SortIn finally ] stop
				 */

				/**
				 * [tFileOutputPositional_3 finally ] start
				 */

				currentComponent = "tFileOutputPositional_3";

				/**
				 * [tFileOutputPositional_3 finally ] stop
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

	public static class row18Struct implements
			routines.system.IPersistableRow<row18Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String RETENTION_STATUS;

		public String getRETENTION_STATUS() {
			return this.RETENTION_STATUS;
		}

		public String ONLY_6_MONTH_NUMERATOR;

		public String getONLY_6_MONTH_NUMERATOR() {
			return this.ONLY_6_MONTH_NUMERATOR;
		}

		public String ONLY_6_MONTH_DENOMINATOR;

		public String getONLY_6_MONTH_DENOMINATOR() {
			return this.ONLY_6_MONTH_DENOMINATOR;
		}

		public String ONLY_12_MONTH_NUMERATOR;

		public String getONLY_12_MONTH_NUMERATOR() {
			return this.ONLY_12_MONTH_NUMERATOR;
		}

		public String ONLY_12_MONTH_DENOMINATOR;

		public String getONLY_12_MONTH_DENOMINATOR() {
			return this.ONLY_12_MONTH_DENOMINATOR;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.RETENTION_STATUS = readString(dis);

					this.ONLY_6_MONTH_NUMERATOR = readString(dis);

					this.ONLY_6_MONTH_DENOMINATOR = readString(dis);

					this.ONLY_12_MONTH_NUMERATOR = readString(dis);

					this.ONLY_12_MONTH_DENOMINATOR = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.RETENTION_STATUS, dos);

				// String

				writeString(this.ONLY_6_MONTH_NUMERATOR, dos);

				// String

				writeString(this.ONLY_6_MONTH_DENOMINATOR, dos);

				// String

				writeString(this.ONLY_12_MONTH_NUMERATOR, dos);

				// String

				writeString(this.ONLY_12_MONTH_DENOMINATOR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",RETENTION_STATUS=" + RETENTION_STATUS);
			sb.append(",ONLY_6_MONTH_NUMERATOR=" + ONLY_6_MONTH_NUMERATOR);
			sb.append(",ONLY_6_MONTH_DENOMINATOR=" + ONLY_6_MONTH_DENOMINATOR);
			sb.append(",ONLY_12_MONTH_NUMERATOR=" + ONLY_12_MONTH_NUMERATOR);
			sb.append(",ONLY_12_MONTH_DENOMINATOR=" + ONLY_12_MONTH_DENOMINATOR);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (RETENTION_STATUS == null) {
				sb.append("<null>");
			} else {
				sb.append(RETENTION_STATUS);
			}

			sb.append("|");

			if (ONLY_6_MONTH_NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_6_MONTH_NUMERATOR);
			}

			sb.append("|");

			if (ONLY_6_MONTH_DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_6_MONTH_DENOMINATOR);
			}

			sb.append("|");

			if (ONLY_12_MONTH_NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_12_MONTH_NUMERATOR);
			}

			sb.append("|");

			if (ONLY_12_MONTH_DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_12_MONTH_DENOMINATOR);
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

	public static class OnRowsEndStructtSortRow_4 implements
			routines.system.IPersistableRow<OnRowsEndStructtSortRow_4> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String RETENTION_STATUS;

		public String getRETENTION_STATUS() {
			return this.RETENTION_STATUS;
		}

		public String ONLY_6_MONTH_NUMERATOR;

		public String getONLY_6_MONTH_NUMERATOR() {
			return this.ONLY_6_MONTH_NUMERATOR;
		}

		public String ONLY_6_MONTH_DENOMINATOR;

		public String getONLY_6_MONTH_DENOMINATOR() {
			return this.ONLY_6_MONTH_DENOMINATOR;
		}

		public String ONLY_12_MONTH_NUMERATOR;

		public String getONLY_12_MONTH_NUMERATOR() {
			return this.ONLY_12_MONTH_NUMERATOR;
		}

		public String ONLY_12_MONTH_DENOMINATOR;

		public String getONLY_12_MONTH_DENOMINATOR() {
			return this.ONLY_12_MONTH_DENOMINATOR;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.RETENTION_STATUS = readString(dis);

					this.ONLY_6_MONTH_NUMERATOR = readString(dis);

					this.ONLY_6_MONTH_DENOMINATOR = readString(dis);

					this.ONLY_12_MONTH_NUMERATOR = readString(dis);

					this.ONLY_12_MONTH_DENOMINATOR = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.RETENTION_STATUS, dos);

				// String

				writeString(this.ONLY_6_MONTH_NUMERATOR, dos);

				// String

				writeString(this.ONLY_6_MONTH_DENOMINATOR, dos);

				// String

				writeString(this.ONLY_12_MONTH_NUMERATOR, dos);

				// String

				writeString(this.ONLY_12_MONTH_DENOMINATOR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",RETENTION_STATUS=" + RETENTION_STATUS);
			sb.append(",ONLY_6_MONTH_NUMERATOR=" + ONLY_6_MONTH_NUMERATOR);
			sb.append(",ONLY_6_MONTH_DENOMINATOR=" + ONLY_6_MONTH_DENOMINATOR);
			sb.append(",ONLY_12_MONTH_NUMERATOR=" + ONLY_12_MONTH_NUMERATOR);
			sb.append(",ONLY_12_MONTH_DENOMINATOR=" + ONLY_12_MONTH_DENOMINATOR);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (RETENTION_STATUS == null) {
				sb.append("<null>");
			} else {
				sb.append(RETENTION_STATUS);
			}

			sb.append("|");

			if (ONLY_6_MONTH_NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_6_MONTH_NUMERATOR);
			}

			sb.append("|");

			if (ONLY_6_MONTH_DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_6_MONTH_DENOMINATOR);
			}

			sb.append("|");

			if (ONLY_12_MONTH_NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_12_MONTH_NUMERATOR);
			}

			sb.append("|");

			if (ONLY_12_MONTH_DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_12_MONTH_DENOMINATOR);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OnRowsEndStructtSortRow_4 other) {

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

	public static class row11Struct implements
			routines.system.IPersistableRow<row11Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String RETENTION_STATUS;

		public String getRETENTION_STATUS() {
			return this.RETENTION_STATUS;
		}

		public String ONLY_6_MONTH_NUMERATOR;

		public String getONLY_6_MONTH_NUMERATOR() {
			return this.ONLY_6_MONTH_NUMERATOR;
		}

		public String ONLY_6_MONTH_DENOMINATOR;

		public String getONLY_6_MONTH_DENOMINATOR() {
			return this.ONLY_6_MONTH_DENOMINATOR;
		}

		public String ONLY_12_MONTH_NUMERATOR;

		public String getONLY_12_MONTH_NUMERATOR() {
			return this.ONLY_12_MONTH_NUMERATOR;
		}

		public String ONLY_12_MONTH_DENOMINATOR;

		public String getONLY_12_MONTH_DENOMINATOR() {
			return this.ONLY_12_MONTH_DENOMINATOR;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.RETENTION_STATUS = readString(dis);

					this.ONLY_6_MONTH_NUMERATOR = readString(dis);

					this.ONLY_6_MONTH_DENOMINATOR = readString(dis);

					this.ONLY_12_MONTH_NUMERATOR = readString(dis);

					this.ONLY_12_MONTH_DENOMINATOR = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.RETENTION_STATUS, dos);

				// String

				writeString(this.ONLY_6_MONTH_NUMERATOR, dos);

				// String

				writeString(this.ONLY_6_MONTH_DENOMINATOR, dos);

				// String

				writeString(this.ONLY_12_MONTH_NUMERATOR, dos);

				// String

				writeString(this.ONLY_12_MONTH_DENOMINATOR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",RETENTION_STATUS=" + RETENTION_STATUS);
			sb.append(",ONLY_6_MONTH_NUMERATOR=" + ONLY_6_MONTH_NUMERATOR);
			sb.append(",ONLY_6_MONTH_DENOMINATOR=" + ONLY_6_MONTH_DENOMINATOR);
			sb.append(",ONLY_12_MONTH_NUMERATOR=" + ONLY_12_MONTH_NUMERATOR);
			sb.append(",ONLY_12_MONTH_DENOMINATOR=" + ONLY_12_MONTH_DENOMINATOR);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (RETENTION_STATUS == null) {
				sb.append("<null>");
			} else {
				sb.append(RETENTION_STATUS);
			}

			sb.append("|");

			if (ONLY_6_MONTH_NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_6_MONTH_NUMERATOR);
			}

			sb.append("|");

			if (ONLY_6_MONTH_DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_6_MONTH_DENOMINATOR);
			}

			sb.append("|");

			if (ONLY_12_MONTH_NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_12_MONTH_NUMERATOR);
			}

			sb.append("|");

			if (ONLY_12_MONTH_DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(ONLY_12_MONTH_DENOMINATOR);
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

	public void tOracleInput_13Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_13_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;
		String currentVirtualComponent = null;

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
				row18Struct row18 = new row18Struct();

				/**
				 * [tSortRow_4_SortOut begin ] start
				 */

				ok_Hash.put("tSortRow_4_SortOut", false);
				start_Hash
						.put("tSortRow_4_SortOut", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_4";

				currentComponent = "tSortRow_4_SortOut";

				int tos_count_tSortRow_4_SortOut = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_4_SortOut - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_4_SortOut = new StringBuilder();
				log4jParamters_tSortRow_4_SortOut.append("Parameters:");
				log4jParamters_tSortRow_4_SortOut.append("DESTINATION" + " = "
						+ "tSortRow_4");
				log4jParamters_tSortRow_4_SortOut.append(" | ");
				log4jParamters_tSortRow_4_SortOut.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_4_SortOut.append(" | ");
				log4jParamters_tSortRow_4_SortOut.append("CRITERIA" + " = "
						+ "[{ORDER=" + ("asc") + ", COLNAME=" + ("DEALER_CODE")
						+ ", SORT=" + ("alpha") + "}, {ORDER=" + ("asc")
						+ ", COLNAME=" + ("RETENTION_STATUS") + ", SORT="
						+ ("alpha") + "}]");
				log4jParamters_tSortRow_4_SortOut.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_4_SortOut - "
							+ log4jParamters_tSortRow_4_SortOut);

				class Comparablerow11Struct extends row11Struct implements
						Comparable<Comparablerow11Struct> {

					public int compareTo(Comparablerow11Struct other) {

						if (this.DEALER_CODE == null
								&& other.DEALER_CODE != null) {
							return -1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE == null) {
							return 1;

						} else if (this.DEALER_CODE != null
								&& other.DEALER_CODE != null) {
							if (!this.DEALER_CODE.equals(other.DEALER_CODE)) {
								return this.DEALER_CODE
										.compareTo(other.DEALER_CODE);
							}
						}
						if (this.RETENTION_STATUS == null
								&& other.RETENTION_STATUS != null) {
							return -1;

						} else if (this.RETENTION_STATUS != null
								&& other.RETENTION_STATUS == null) {
							return 1;

						} else if (this.RETENTION_STATUS != null
								&& other.RETENTION_STATUS != null) {
							if (!this.RETENTION_STATUS
									.equals(other.RETENTION_STATUS)) {
								return this.RETENTION_STATUS
										.compareTo(other.RETENTION_STATUS);
							}
						}
						return 0;
					}
				}

				java.util.List<Comparablerow11Struct> list_tSortRow_4_SortOut = new java.util.ArrayList<Comparablerow11Struct>();

				/**
				 * [tSortRow_4_SortOut begin ] stop
				 */

				/**
				 * [tOracleInput_13 begin ] start
				 */

				ok_Hash.put("tOracleInput_13", false);
				start_Hash.put("tOracleInput_13", System.currentTimeMillis());

				currentComponent = "tOracleInput_13";

				int tos_count_tOracleInput_13 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_13 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_13 = new StringBuilder();
				log4jParamters_tOracleInput_13.append("Parameters:");
				log4jParamters_tOracleInput_13.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13
						.append("QUERY"
								+ " = "
								+ "\"SELECT               TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,              DLR_CD AS DEALER_CODE,              RETENTION_STATUS,              SIX_MTH_NUMERATOR AS ONLY_6_MONTH_NUMERATOR,              SIX_MTH_DENOMINATOR AS ONLY_6_MONTH_DENOMINATOR,              TWELVE_MTH_NUMERATOR AS ONLY_12_MONTH_NUMERATOR,              TWELVE_MTH_DENOMINATOR AS ONLY_12_MONTH_DENOMINATOR                              FROM FCA_SR_OWNER.FCA_DLR_FYR_SVC_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')  ORDER BY 2,3\"");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("DEALER_CODE") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("RETENTION_STATUS")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONLY_6_MONTH_NUMERATOR") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ONLY_6_MONTH_DENOMINATOR")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ONLY_12_MONTH_NUMERATOR") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("ONLY_12_MONTH_DENOMINATOR")
						+ "}]");
				log4jParamters_tOracleInput_13.append(" | ");
				log4jParamters_tOracleInput_13.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_13.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_13 - "
							+ log4jParamters_tOracleInput_13);

				int nb_line_tOracleInput_13 = 0;
				java.sql.Connection conn_tOracleInput_13 = null;
				String driverClass_tOracleInput_13 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_13);

				String url_tOracleInput_13 = null;
				url_tOracleInput_13 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_13 = context.dbUser;

				final String decryptedPassword_tOracleInput_13 = context.dbPassword;

				String dbPwd_tOracleInput_13 = decryptedPassword_tOracleInput_13;

				log.debug("tOracleInput_13 - Driver ClassName: "
						+ driverClass_tOracleInput_13 + ".");

				log.info("tOracleInput_13 - Connection attempt to '"
						+ url_tOracleInput_13 + "' with the username '"
						+ dbUser_tOracleInput_13 + "'.");

				conn_tOracleInput_13 = java.sql.DriverManager.getConnection(
						url_tOracleInput_13, dbUser_tOracleInput_13,
						dbPwd_tOracleInput_13);
				log.info("tOracleInput_13 - Connection to '"
						+ url_tOracleInput_13 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_13 = conn_tOracleInput_13
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_13 = stmtGetTZ_tOracleInput_13
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_13 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_13.next()) {
					sessionTimezone_tOracleInput_13 = rsGetTZ_tOracleInput_13
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_13)
						.setSessionTimeZone(sessionTimezone_tOracleInput_13);

				java.sql.Statement stmt_tOracleInput_13 = conn_tOracleInput_13
						.createStatement();

				String dbquery_tOracleInput_13 = "SELECT \n            TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,\n            DLR_CD AS DEALER_CODE,\n            RETENTION_STATUS,\n            SIX_MTH_NUMERATOR AS ONLY_6_MONTH_NUMERATOR,\n            SIX_MTH_DENOMINATOR AS ONLY_6_MONTH_DENOMINATOR,\n            TWELVE_MTH_NUMERATOR AS ONLY_12_MONTH_NUMERATOR,\n            TWELVE_MTH_DENOMINATOR AS ONLY_12_MONTH_DENOMINATOR\n            \n            \nFROM FCA_SR_OWNER.FCA_DLR_FYR_SVC_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')\nORDER BY 2,3";

				log.info("tOracleInput_13 - Executing the query: '"
						+ dbquery_tOracleInput_13 + "'.");

				globalMap.put("tOracleInput_13_QUERY", dbquery_tOracleInput_13);

				java.sql.ResultSet rs_tOracleInput_13 = null;
				try {
					rs_tOracleInput_13 = stmt_tOracleInput_13
							.executeQuery(dbquery_tOracleInput_13);
					java.sql.ResultSetMetaData rsmd_tOracleInput_13 = rs_tOracleInput_13
							.getMetaData();
					int colQtyInRs_tOracleInput_13 = rsmd_tOracleInput_13
							.getColumnCount();

					String tmpContent_tOracleInput_13 = null;

					log.info("tOracleInput_13 - Retrieving records from the database.");

					while (rs_tOracleInput_13.next()) {
						nb_line_tOracleInput_13++;

						if (colQtyInRs_tOracleInput_13 < 1) {
							row11.MONTH = null;
						} else {

							tmpContent_tOracleInput_13 = rs_tOracleInput_13
									.getString(1);
							if (tmpContent_tOracleInput_13 != null) {
								row11.MONTH = tmpContent_tOracleInput_13;
							} else {
								row11.MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_13 < 2) {
							row11.DEALER_CODE = null;
						} else {

							tmpContent_tOracleInput_13 = rs_tOracleInput_13
									.getString(2);
							if (tmpContent_tOracleInput_13 != null) {
								row11.DEALER_CODE = tmpContent_tOracleInput_13;
							} else {
								row11.DEALER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_13 < 3) {
							row11.RETENTION_STATUS = null;
						} else {

							tmpContent_tOracleInput_13 = rs_tOracleInput_13
									.getString(3);
							if (tmpContent_tOracleInput_13 != null) {
								row11.RETENTION_STATUS = tmpContent_tOracleInput_13;
							} else {
								row11.RETENTION_STATUS = null;
							}
						}
						if (colQtyInRs_tOracleInput_13 < 4) {
							row11.ONLY_6_MONTH_NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_13 = rs_tOracleInput_13
									.getString(4);
							if (tmpContent_tOracleInput_13 != null) {
								row11.ONLY_6_MONTH_NUMERATOR = tmpContent_tOracleInput_13;
							} else {
								row11.ONLY_6_MONTH_NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_13 < 5) {
							row11.ONLY_6_MONTH_DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_13 = rs_tOracleInput_13
									.getString(5);
							if (tmpContent_tOracleInput_13 != null) {
								row11.ONLY_6_MONTH_DENOMINATOR = tmpContent_tOracleInput_13;
							} else {
								row11.ONLY_6_MONTH_DENOMINATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_13 < 6) {
							row11.ONLY_12_MONTH_NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_13 = rs_tOracleInput_13
									.getString(6);
							if (tmpContent_tOracleInput_13 != null) {
								row11.ONLY_12_MONTH_NUMERATOR = tmpContent_tOracleInput_13;
							} else {
								row11.ONLY_12_MONTH_NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_13 < 7) {
							row11.ONLY_12_MONTH_DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_13 = rs_tOracleInput_13
									.getString(7);
							if (tmpContent_tOracleInput_13 != null) {
								row11.ONLY_12_MONTH_DENOMINATOR = tmpContent_tOracleInput_13;
							} else {
								row11.ONLY_12_MONTH_DENOMINATOR = null;
							}
						}

						log.debug("tOracleInput_13 - Retrieving the record "
								+ nb_line_tOracleInput_13 + ".");

						/**
						 * [tOracleInput_13 begin ] stop
						 */

						/**
						 * [tOracleInput_13 main ] start
						 */

						currentComponent = "tOracleInput_13";

						tos_count_tOracleInput_13++;

						/**
						 * [tOracleInput_13 main ] stop
						 */

						/**
						 * [tSortRow_4_SortOut main ] start
						 */

						currentVirtualComponent = "tSortRow_4";

						currentComponent = "tSortRow_4_SortOut";

						if (log.isTraceEnabled()) {
							log.trace("row11 - "
									+ (row11 == null ? "" : row11.toLogString()));
						}

						Comparablerow11Struct arrayRowtSortRow_4_SortOut = new Comparablerow11Struct();

						arrayRowtSortRow_4_SortOut.MONTH = row11.MONTH;
						arrayRowtSortRow_4_SortOut.DEALER_CODE = row11.DEALER_CODE;
						arrayRowtSortRow_4_SortOut.RETENTION_STATUS = row11.RETENTION_STATUS;
						arrayRowtSortRow_4_SortOut.ONLY_6_MONTH_NUMERATOR = row11.ONLY_6_MONTH_NUMERATOR;
						arrayRowtSortRow_4_SortOut.ONLY_6_MONTH_DENOMINATOR = row11.ONLY_6_MONTH_DENOMINATOR;
						arrayRowtSortRow_4_SortOut.ONLY_12_MONTH_NUMERATOR = row11.ONLY_12_MONTH_NUMERATOR;
						arrayRowtSortRow_4_SortOut.ONLY_12_MONTH_DENOMINATOR = row11.ONLY_12_MONTH_DENOMINATOR;
						list_tSortRow_4_SortOut.add(arrayRowtSortRow_4_SortOut);

						tos_count_tSortRow_4_SortOut++;

						/**
						 * [tSortRow_4_SortOut main ] stop
						 */

						/**
						 * [tOracleInput_13 end ] start
						 */

						currentComponent = "tOracleInput_13";

					}
				} finally {
					stmt_tOracleInput_13.close();

					if (conn_tOracleInput_13 != null
							&& !conn_tOracleInput_13.isClosed()) {

						log.info("tOracleInput_13 - Closing the connection to the database.");

						conn_tOracleInput_13.close();

						log.info("tOracleInput_13 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_13_NB_LINE",
						nb_line_tOracleInput_13);
				log.info("tOracleInput_13 - Retrieved records count: "
						+ nb_line_tOracleInput_13 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_13 - " + "Done.");

				ok_Hash.put("tOracleInput_13", true);
				end_Hash.put("tOracleInput_13", System.currentTimeMillis());

				/**
				 * [tOracleInput_13 end ] stop
				 */

				/**
				 * [tSortRow_4_SortOut end ] start
				 */

				currentVirtualComponent = "tSortRow_4";

				currentComponent = "tSortRow_4_SortOut";

				row11Struct[] array_tSortRow_4_SortOut = list_tSortRow_4_SortOut
						.toArray(new Comparablerow11Struct[0]);

				java.util.Arrays.sort(array_tSortRow_4_SortOut);

				globalMap.put("tSortRow_4", array_tSortRow_4_SortOut);

				if (log.isInfoEnabled())
					log.info("tSortRow_4_SortOut - " + "Done.");

				ok_Hash.put("tSortRow_4_SortOut", true);
				end_Hash.put("tSortRow_4_SortOut", System.currentTimeMillis());

				/**
				 * [tSortRow_4_SortOut end ] stop
				 */

				/**
				 * [tFileOutputPositional_7 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_7", false);
				start_Hash.put("tFileOutputPositional_7",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_7";

				int tos_count_tFileOutputPositional_7 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_7 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_7 = new StringBuilder();
				log4jParamters_tFileOutputPositional_7.append("Parameters:");
				log4jParamters_tFileOutputPositional_7
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+  \"Dealer_Standard_FYR_Summary_\" + context.rMonth + \".txt\"");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("6")
						+ ", SCHEMA_COLUMN=" + ("MONTH") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("0") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("5") + ", SCHEMA_COLUMN="
						+ ("DEALER_CODE") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("2") + ", SCHEMA_COLUMN="
						+ ("RETENTION_STATUS") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONLY_6_MONTH_NUMERATOR") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONLY_6_MONTH_DENOMINATOR") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONLY_12_MONTH_NUMERATOR") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("ONLY_12_MONTH_DENOMINATOR") + "}]");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				log4jParamters_tFileOutputPositional_7
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_7.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_7 - "
							+ log4jParamters_tFileOutputPositional_7);

				int nb_line_tFileOutputPositional_7 = 0;

				class PositionUtil_tFileOutputPositional_7 {

					void setValue_0(final row18Struct row18,
							StringBuilder sb_tFileOutputPositional_7,
							String tempStringMtFileOutputPositional_7,
							int tempLengthMtFileOutputPositional_7)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_7 = (row18.MONTH == null) ? ""
								: row18.MONTH;

						tempLengthMtFileOutputPositional_7 = tempStringMtFileOutputPositional_7
								.length();

						if (tempLengthMtFileOutputPositional_7 >= 6) {
							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
						} else if (tempLengthMtFileOutputPositional_7 < 6) {

							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
							for (int i_tFileOutputPositional_7 = 0; i_tFileOutputPositional_7 < 6 - tempLengthMtFileOutputPositional_7; i_tFileOutputPositional_7++) {
								sb_tFileOutputPositional_7.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_7 = (row18.DEALER_CODE == null) ? ""
								: row18.DEALER_CODE;

						tempLengthMtFileOutputPositional_7 = tempStringMtFileOutputPositional_7
								.length();

						if (tempLengthMtFileOutputPositional_7 >= 5) {
							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
						} else if (tempLengthMtFileOutputPositional_7 < 5) {

							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
							for (int i_tFileOutputPositional_7 = 0; i_tFileOutputPositional_7 < 5 - tempLengthMtFileOutputPositional_7; i_tFileOutputPositional_7++) {
								sb_tFileOutputPositional_7.append(0);
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_7 = (row18.RETENTION_STATUS == null) ? ""
								: row18.RETENTION_STATUS;

						tempLengthMtFileOutputPositional_7 = tempStringMtFileOutputPositional_7
								.length();

						if (tempLengthMtFileOutputPositional_7 >= 2) {
							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
						} else if (tempLengthMtFileOutputPositional_7 < 2) {

							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
							for (int i_tFileOutputPositional_7 = 0; i_tFileOutputPositional_7 < 2 - tempLengthMtFileOutputPositional_7; i_tFileOutputPositional_7++) {
								sb_tFileOutputPositional_7.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_7 = (row18.ONLY_6_MONTH_NUMERATOR == null) ? ""
								: row18.ONLY_6_MONTH_NUMERATOR;

						tempLengthMtFileOutputPositional_7 = tempStringMtFileOutputPositional_7
								.length();

						if (tempLengthMtFileOutputPositional_7 >= 8) {
							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
						} else if (tempLengthMtFileOutputPositional_7 < 8) {

							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
							for (int i_tFileOutputPositional_7 = 0; i_tFileOutputPositional_7 < 8 - tempLengthMtFileOutputPositional_7; i_tFileOutputPositional_7++) {
								sb_tFileOutputPositional_7.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_7 = (row18.ONLY_6_MONTH_DENOMINATOR == null) ? ""
								: row18.ONLY_6_MONTH_DENOMINATOR;

						tempLengthMtFileOutputPositional_7 = tempStringMtFileOutputPositional_7
								.length();

						if (tempLengthMtFileOutputPositional_7 >= 8) {
							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
						} else if (tempLengthMtFileOutputPositional_7 < 8) {

							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
							for (int i_tFileOutputPositional_7 = 0; i_tFileOutputPositional_7 < 8 - tempLengthMtFileOutputPositional_7; i_tFileOutputPositional_7++) {
								sb_tFileOutputPositional_7.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_7 = (row18.ONLY_12_MONTH_NUMERATOR == null) ? ""
								: row18.ONLY_12_MONTH_NUMERATOR;

						tempLengthMtFileOutputPositional_7 = tempStringMtFileOutputPositional_7
								.length();

						if (tempLengthMtFileOutputPositional_7 >= 8) {
							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
						} else if (tempLengthMtFileOutputPositional_7 < 8) {

							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
							for (int i_tFileOutputPositional_7 = 0; i_tFileOutputPositional_7 < 8 - tempLengthMtFileOutputPositional_7; i_tFileOutputPositional_7++) {
								sb_tFileOutputPositional_7.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_7 = (row18.ONLY_12_MONTH_DENOMINATOR == null) ? ""
								: row18.ONLY_12_MONTH_DENOMINATOR;

						tempLengthMtFileOutputPositional_7 = tempStringMtFileOutputPositional_7
								.length();

						if (tempLengthMtFileOutputPositional_7 >= 8) {
							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
						} else if (tempLengthMtFileOutputPositional_7 < 8) {

							sb_tFileOutputPositional_7
									.append(tempStringMtFileOutputPositional_7);
							for (int i_tFileOutputPositional_7 = 0; i_tFileOutputPositional_7 < 8 - tempLengthMtFileOutputPositional_7; i_tFileOutputPositional_7++) {
								sb_tFileOutputPositional_7.append(' ');
							}

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_7 positionUtil_tFileOutputPositional_7 = new PositionUtil_tFileOutputPositional_7();

				String fileNewName_tFileOutputPositional_7 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Dealer_Standard_FYR_Summary_" + context.rMonth
						+ ".txt";
				java.io.File createFiletFileOutputPositional_7 = new java.io.File(
						fileNewName_tFileOutputPositional_7);
				boolean isFileGenerated_tFileOutputPositional_7 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_7 = createFiletFileOutputPositional_7
						.getParentFile();
				if (parentFile_tFileOutputPositional_7 != null
						&& !parentFile_tFileOutputPositional_7.exists()) {
					parentFile_tFileOutputPositional_7.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_7 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_7,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_7 begin ] stop
				 */

				/**
				 * [tSortRow_4_SortIn begin ] start
				 */

				ok_Hash.put("tSortRow_4_SortIn", false);
				start_Hash.put("tSortRow_4_SortIn", System.currentTimeMillis());

				currentVirtualComponent = "tSortRow_4";

				currentComponent = "tSortRow_4_SortIn";

				int tos_count_tSortRow_4_SortIn = 0;

				if (log.isInfoEnabled())
					log.info("tSortRow_4_SortIn - " + "Start to work.");
				StringBuilder log4jParamters_tSortRow_4_SortIn = new StringBuilder();
				log4jParamters_tSortRow_4_SortIn.append("Parameters:");
				log4jParamters_tSortRow_4_SortIn.append("ORIGIN" + " = "
						+ "tSortRow_4");
				log4jParamters_tSortRow_4_SortIn.append(" | ");
				log4jParamters_tSortRow_4_SortIn.append("EXTERNAL" + " = "
						+ "false");
				log4jParamters_tSortRow_4_SortIn.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSortRow_4_SortIn - "
							+ log4jParamters_tSortRow_4_SortIn);

				row11Struct[] array_tSortRow_4_SortIn = (row11Struct[]) globalMap
						.get("tSortRow_4");

				int nb_line_tSortRow_4_SortIn = 0;

				row11Struct current_tSortRow_4_SortIn = null;

				for (int i_tSortRow_4_SortIn = 0; i_tSortRow_4_SortIn < array_tSortRow_4_SortIn.length; i_tSortRow_4_SortIn++) {
					current_tSortRow_4_SortIn = array_tSortRow_4_SortIn[i_tSortRow_4_SortIn];
					row18.MONTH = current_tSortRow_4_SortIn.MONTH;
					row18.DEALER_CODE = current_tSortRow_4_SortIn.DEALER_CODE;
					row18.RETENTION_STATUS = current_tSortRow_4_SortIn.RETENTION_STATUS;
					row18.ONLY_6_MONTH_NUMERATOR = current_tSortRow_4_SortIn.ONLY_6_MONTH_NUMERATOR;
					row18.ONLY_6_MONTH_DENOMINATOR = current_tSortRow_4_SortIn.ONLY_6_MONTH_DENOMINATOR;
					row18.ONLY_12_MONTH_NUMERATOR = current_tSortRow_4_SortIn.ONLY_12_MONTH_NUMERATOR;
					row18.ONLY_12_MONTH_DENOMINATOR = current_tSortRow_4_SortIn.ONLY_12_MONTH_DENOMINATOR;
					// increase number of line sorted
					nb_line_tSortRow_4_SortIn++;

					/**
					 * [tSortRow_4_SortIn begin ] stop
					 */

					/**
					 * [tSortRow_4_SortIn main ] start
					 */

					currentVirtualComponent = "tSortRow_4";

					currentComponent = "tSortRow_4_SortIn";

					tos_count_tSortRow_4_SortIn++;

					/**
					 * [tSortRow_4_SortIn main ] stop
					 */

					/**
					 * [tFileOutputPositional_7 main ] start
					 */

					currentComponent = "tFileOutputPositional_7";

					if (log.isTraceEnabled()) {
						log.trace("row18 - "
								+ (row18 == null ? "" : row18.toLogString()));
					}

					String tempStringMtFileOutputPositional_7 = null;

					int tempLengthMtFileOutputPositional_7 = 0;

					StringBuilder sb_tFileOutputPositional_7 = new StringBuilder();
					positionUtil_tFileOutputPositional_7.setValue_0(row18,
							sb_tFileOutputPositional_7,
							tempStringMtFileOutputPositional_7,
							tempLengthMtFileOutputPositional_7);
					sb_tFileOutputPositional_7.append("\r\n");

					synchronized (multiThreadLockWrite) {

						outtFileOutputPositional_7
								.write(sb_tFileOutputPositional_7.toString());

					}

					nb_line_tFileOutputPositional_7++;
					log.debug("tFileOutputPositional_7 - Writing the record "
							+ nb_line_tFileOutputPositional_7 + " to the file.");

					tos_count_tFileOutputPositional_7++;

					/**
					 * [tFileOutputPositional_7 main ] stop
					 */

					/**
					 * [tSortRow_4_SortIn end ] start
					 */

					currentVirtualComponent = "tSortRow_4";

					currentComponent = "tSortRow_4_SortIn";

				}

				globalMap.put("tSortRow_4_SortIn_NB_LINE",
						nb_line_tSortRow_4_SortIn);

				if (log.isInfoEnabled())
					log.info("tSortRow_4_SortIn - " + "Done.");

				ok_Hash.put("tSortRow_4_SortIn", true);
				end_Hash.put("tSortRow_4_SortIn", System.currentTimeMillis());

				/**
				 * [tSortRow_4_SortIn end ] stop
				 */

				/**
				 * [tFileOutputPositional_7 end ] start
				 */

				currentComponent = "tFileOutputPositional_7";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_7.close();
				}
				globalMap.put("tFileOutputPositional_7_NB_LINE",
						nb_line_tFileOutputPositional_7);
				log.info("tFileOutputPositional_7 - Written records count: "
						+ nb_line_tFileOutputPositional_7 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_7 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_7", true);
				end_Hash.put("tFileOutputPositional_7",
						System.currentTimeMillis());

				/**
				 * [tFileOutputPositional_7 end ] stop
				 */

			}// end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage());
			}

			TalendException te = new TalendException(e, currentComponent,
					globalMap);

			te.setVirtualComponentName(currentVirtualComponent);

			throw te;
		} catch (java.lang.Error error) {

			throw error;
		} finally {

			// free memory for "tSortRow_4_SortIn"
			globalMap.remove("tSortRow_4");

			try {

				/**
				 * [tOracleInput_13 finally ] start
				 */

				currentComponent = "tOracleInput_13";

				/**
				 * [tOracleInput_13 finally ] stop
				 */

				/**
				 * [tSortRow_4_SortOut finally ] start
				 */

				currentVirtualComponent = "tSortRow_4";

				currentComponent = "tSortRow_4_SortOut";

				/**
				 * [tSortRow_4_SortOut finally ] stop
				 */

				/**
				 * [tSortRow_4_SortIn finally ] start
				 */

				currentVirtualComponent = "tSortRow_4";

				currentComponent = "tSortRow_4_SortIn";

				/**
				 * [tSortRow_4_SortIn finally ] stop
				 */

				/**
				 * [tFileOutputPositional_7 finally ] start
				 */

				currentComponent = "tFileOutputPositional_7";

				/**
				 * [tFileOutputPositional_7 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_13_SUBPROCESS_STATE", 1);
	}

	public static class row6Struct implements
			routines.system.IPersistableRow<row6Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String DEALER_NUMBER;

		public String getDEALER_NUMBER() {
			return this.DEALER_NUMBER;
		}

		public String REPORT_MONTH;

		public String getREPORT_MONTH() {
			return this.REPORT_MONTH;
		}

		public String SERVICE_LOYAL_12NUMERATOR;

		public String getSERVICE_LOYAL_12NUMERATOR() {
			return this.SERVICE_LOYAL_12NUMERATOR;
		}

		public String SERVICE_BASE_12DENOMINATOR;

		public String getSERVICE_BASE_12DENOMINATOR() {
			return this.SERVICE_BASE_12DENOMINATOR;
		}

		public String SERVICE_LOYAL_PCT_12;

		public String getSERVICE_LOYAL_PCT_12() {
			return this.SERVICE_LOYAL_PCT_12;
		}

		public String SERVICE_LOYAL_3NUMERATOR;

		public String getSERVICE_LOYAL_3NUMERATOR() {
			return this.SERVICE_LOYAL_3NUMERATOR;
		}

		public String SERVICE_BASE_3DENOMINATOR;

		public String getSERVICE_BASE_3DENOMINATOR() {
			return this.SERVICE_BASE_3DENOMINATOR;
		}

		public String SERVICE_LOYAL_PCT_3;

		public String getSERVICE_LOYAL_PCT_3() {
			return this.SERVICE_LOYAL_PCT_3;
		}

		public String SERVICE_LOYAL_1NUMERATOR;

		public String getSERVICE_LOYAL_1NUMERATOR() {
			return this.SERVICE_LOYAL_1NUMERATOR;
		}

		public String SERVICE_BASE_1DENOMINATOR;

		public String getSERVICE_BASE_1DENOMINATOR() {
			return this.SERVICE_BASE_1DENOMINATOR;
		}

		public String SERVICE_LOYALPCT_1;

		public String getSERVICE_LOYALPCT_1() {
			return this.SERVICE_LOYALPCT_1;
		}

		public String LESS_THAN_12_MTHS_SERVICE_IND;

		public String getLESS_THAN_12_MTHS_SERVICE_IND() {
			return this.LESS_THAN_12_MTHS_SERVICE_IND;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.DEALER_NUMBER = readString(dis);

					this.REPORT_MONTH = readString(dis);

					this.SERVICE_LOYAL_12NUMERATOR = readString(dis);

					this.SERVICE_BASE_12DENOMINATOR = readString(dis);

					this.SERVICE_LOYAL_PCT_12 = readString(dis);

					this.SERVICE_LOYAL_3NUMERATOR = readString(dis);

					this.SERVICE_BASE_3DENOMINATOR = readString(dis);

					this.SERVICE_LOYAL_PCT_3 = readString(dis);

					this.SERVICE_LOYAL_1NUMERATOR = readString(dis);

					this.SERVICE_BASE_1DENOMINATOR = readString(dis);

					this.SERVICE_LOYALPCT_1 = readString(dis);

					this.LESS_THAN_12_MTHS_SERVICE_IND = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.DEALER_NUMBER, dos);

				// String

				writeString(this.REPORT_MONTH, dos);

				// String

				writeString(this.SERVICE_LOYAL_12NUMERATOR, dos);

				// String

				writeString(this.SERVICE_BASE_12DENOMINATOR, dos);

				// String

				writeString(this.SERVICE_LOYAL_PCT_12, dos);

				// String

				writeString(this.SERVICE_LOYAL_3NUMERATOR, dos);

				// String

				writeString(this.SERVICE_BASE_3DENOMINATOR, dos);

				// String

				writeString(this.SERVICE_LOYAL_PCT_3, dos);

				// String

				writeString(this.SERVICE_LOYAL_1NUMERATOR, dos);

				// String

				writeString(this.SERVICE_BASE_1DENOMINATOR, dos);

				// String

				writeString(this.SERVICE_LOYALPCT_1, dos);

				// String

				writeString(this.LESS_THAN_12_MTHS_SERVICE_IND, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("DEALER_NUMBER=" + DEALER_NUMBER);
			sb.append(",REPORT_MONTH=" + REPORT_MONTH);
			sb.append(",SERVICE_LOYAL_12NUMERATOR=" + SERVICE_LOYAL_12NUMERATOR);
			sb.append(",SERVICE_BASE_12DENOMINATOR="
					+ SERVICE_BASE_12DENOMINATOR);
			sb.append(",SERVICE_LOYAL_PCT_12=" + SERVICE_LOYAL_PCT_12);
			sb.append(",SERVICE_LOYAL_3NUMERATOR=" + SERVICE_LOYAL_3NUMERATOR);
			sb.append(",SERVICE_BASE_3DENOMINATOR=" + SERVICE_BASE_3DENOMINATOR);
			sb.append(",SERVICE_LOYAL_PCT_3=" + SERVICE_LOYAL_PCT_3);
			sb.append(",SERVICE_LOYAL_1NUMERATOR=" + SERVICE_LOYAL_1NUMERATOR);
			sb.append(",SERVICE_BASE_1DENOMINATOR=" + SERVICE_BASE_1DENOMINATOR);
			sb.append(",SERVICE_LOYALPCT_1=" + SERVICE_LOYALPCT_1);
			sb.append(",LESS_THAN_12_MTHS_SERVICE_IND="
					+ LESS_THAN_12_MTHS_SERVICE_IND);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (DEALER_NUMBER == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_NUMBER);
			}

			sb.append("|");

			if (REPORT_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_MONTH);
			}

			sb.append("|");

			if (SERVICE_LOYAL_12NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_12NUMERATOR);
			}

			sb.append("|");

			if (SERVICE_BASE_12DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_BASE_12DENOMINATOR);
			}

			sb.append("|");

			if (SERVICE_LOYAL_PCT_12 == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_PCT_12);
			}

			sb.append("|");

			if (SERVICE_LOYAL_3NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_3NUMERATOR);
			}

			sb.append("|");

			if (SERVICE_BASE_3DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_BASE_3DENOMINATOR);
			}

			sb.append("|");

			if (SERVICE_LOYAL_PCT_3 == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_PCT_3);
			}

			sb.append("|");

			if (SERVICE_LOYAL_1NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_1NUMERATOR);
			}

			sb.append("|");

			if (SERVICE_BASE_1DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_BASE_1DENOMINATOR);
			}

			sb.append("|");

			if (SERVICE_LOYALPCT_1 == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYALPCT_1);
			}

			sb.append("|");

			if (LESS_THAN_12_MTHS_SERVICE_IND == null) {
				sb.append("<null>");
			} else {
				sb.append(LESS_THAN_12_MTHS_SERVICE_IND);
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

				row6Struct row6 = new row6Struct();

				/**
				 * [tFileOutputPositional_4 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_4", false);
				start_Hash.put("tFileOutputPositional_4",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_4";

				int tos_count_tFileOutputPositional_4 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_4 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_4 = new StringBuilder();
				log4jParamters_tFileOutputPositional_4.append("Parameters:");
				log4jParamters_tFileOutputPositional_4
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"Service_Retention_1X_\" + context.rMonth + \".txt\"");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("0")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("5")
						+ ", SCHEMA_COLUMN=" + ("DEALER_NUMBER") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("6") + ", SCHEMA_COLUMN="
						+ ("REPORT_MONTH") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_12NUMERATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_12DENOMINATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_12") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_3NUMERATOR") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_3DENOMINATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_3") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_1NUMERATOR") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_1DENOMINATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYALPCT_1") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("1") + ", SCHEMA_COLUMN="
						+ ("LESS_THAN_12_MTHS_SERVICE_IND") + "}]");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				log4jParamters_tFileOutputPositional_4
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_4 - "
							+ log4jParamters_tFileOutputPositional_4);

				int nb_line_tFileOutputPositional_4 = 0;

				class PositionUtil_tFileOutputPositional_4 {

					void setValue_0(final row6Struct row6,
							StringBuilder sb_tFileOutputPositional_4,
							String tempStringMtFileOutputPositional_4,
							int tempLengthMtFileOutputPositional_4)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.DEALER_NUMBER == null) ? ""
								: row6.DEALER_NUMBER;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 5) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 5) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 5 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(0);
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.REPORT_MONTH == null) ? ""
								: row6.REPORT_MONTH;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 6) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 6) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 6 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_LOYAL_12NUMERATOR == null) ? ""
								: row6.SERVICE_LOYAL_12NUMERATOR;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_BASE_12DENOMINATOR == null) ? ""
								: row6.SERVICE_BASE_12DENOMINATOR;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_LOYAL_PCT_12 == null) ? ""
								: row6.SERVICE_LOYAL_PCT_12;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_LOYAL_3NUMERATOR == null) ? ""
								: row6.SERVICE_LOYAL_3NUMERATOR;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_BASE_3DENOMINATOR == null) ? ""
								: row6.SERVICE_BASE_3DENOMINATOR;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_LOYAL_PCT_3 == null) ? ""
								: row6.SERVICE_LOYAL_PCT_3;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_LOYAL_1NUMERATOR == null) ? ""
								: row6.SERVICE_LOYAL_1NUMERATOR;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_BASE_1DENOMINATOR == null) ? ""
								: row6.SERVICE_BASE_1DENOMINATOR;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.SERVICE_LOYALPCT_1 == null) ? ""
								: row6.SERVICE_LOYALPCT_1;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 8) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 8) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 8 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_4 = (row6.LESS_THAN_12_MTHS_SERVICE_IND == null) ? ""
								: row6.LESS_THAN_12_MTHS_SERVICE_IND;

						tempLengthMtFileOutputPositional_4 = tempStringMtFileOutputPositional_4
								.length();

						if (tempLengthMtFileOutputPositional_4 >= 1) {
							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
						} else if (tempLengthMtFileOutputPositional_4 < 1) {

							sb_tFileOutputPositional_4
									.append(tempStringMtFileOutputPositional_4);
							for (int i_tFileOutputPositional_4 = 0; i_tFileOutputPositional_4 < 1 - tempLengthMtFileOutputPositional_4; i_tFileOutputPositional_4++) {
								sb_tFileOutputPositional_4.append(' ');
							}

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_4 positionUtil_tFileOutputPositional_4 = new PositionUtil_tFileOutputPositional_4();

				String fileNewName_tFileOutputPositional_4 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Service_Retention_1X_" + context.rMonth + ".txt";
				java.io.File createFiletFileOutputPositional_4 = new java.io.File(
						fileNewName_tFileOutputPositional_4);
				boolean isFileGenerated_tFileOutputPositional_4 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_4 = createFiletFileOutputPositional_4
						.getParentFile();
				if (parentFile_tFileOutputPositional_4 != null
						&& !parentFile_tFileOutputPositional_4.exists()) {
					parentFile_tFileOutputPositional_4.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_4 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_4,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_4 begin ] stop
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
						+ "context.dbHostName");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_10.append(" | ");
				log4jParamters_tOracleInput_10.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
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
								+ "\"SELECT               DLR_CD AS DEALER_NUMBER,              TO_CHAR(RPT_DT, 'YYYYMM') AS REPORT_MONTH,              R12M_1PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_12NUMERATOR,              R12M_SVC_BASE AS SERVICE_BASE_12DENOMINATOR,              CAST(REPLACE(R12M_SVC_LOYAL_PCT_1X,'.','') AS INT) AS SERVICE_LOYAL_PCT_12,              R3M_1PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_3NUMERATOR,              R3M_SVC_BASE AS SERVICE_BASE_3DENOMINATOR,               CAST(REPLACE(R3M_SVC_LOYAL_PCT_1X,'.','') AS INT) AS SERVICE_LOYAL_PCT_3,              R1M_1PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_1NUMERATOR,              R1M_SVC_BASE AS SERVICE_BASE_1DENOMINATOR,               CAST(REPLACE(R1M_SVC_LOYAL_PCT_1X,'.','') AS INT) AS SERVICE_LOYAL_PCT_1,              LESS_THAN_12_MTHS_IND AS LESS_THAN_12_MTHS_SERVICE_IND                  FROM FCA_SR_OWNER.FCA_SVC_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')  ORDER BY 1\"");
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
						+ ("DEALER_NUMBER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_MONTH") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_12NUMERATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_12DENOMINATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_12") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SERVICE_LOYAL_3NUMERATOR")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_3DENOMINATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_3") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SERVICE_LOYAL_1NUMERATOR")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_1DENOMINATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYALPCT_1") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN="
						+ ("LESS_THAN_12_MTHS_SERVICE_IND") + "}]");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_10 = context.dbUser;

				final String decryptedPassword_tOracleInput_10 = context.dbPassword;

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

				String dbquery_tOracleInput_10 = "SELECT \n            DLR_CD AS DEALER_NUMBER,\n            TO_CHAR(RPT_DT, 'YYYYMM') AS REPORT_MONTH,\n            R12M_1PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_12NUMERATOR,\n            R12M_SVC_BASE AS SERVICE_BASE_12DENOMINATOR,\n            CAST(REPLACE(R12M_SVC_LOYAL_PCT_1X,'.','') AS INT) AS SERVICE_LOYAL_PCT_12,\n            R3M_1PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_3NUMERATOR,\n            R3M_SVC_BASE AS SERVICE_BASE_3DENOMINATOR,\n             CAST(REPLACE(R3M_SVC_LOYAL_PCT_1X,'.','') AS INT) AS SERVICE_LOYAL_PCT_3,\n            R1M_1PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_1NUMERATOR,\n            R1M_SVC_BASE AS SERVICE_BASE_1DENOMINATOR,\n             CAST(REPLACE(R1M_SVC_LOYAL_PCT_1X,'.','') AS INT) AS SERVICE_LOYAL_PCT_1,\n            LESS_THAN_12_MTHS_IND AS LESS_THAN_12_MTHS_SERVICE_IND\n\n            \nFROM FCA_SR_OWNER.FCA_SVC_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')\nORDER BY 1";

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
							row6.DEALER_NUMBER = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(1);
							if (tmpContent_tOracleInput_10 != null) {
								row6.DEALER_NUMBER = tmpContent_tOracleInput_10;
							} else {
								row6.DEALER_NUMBER = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 2) {
							row6.REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(2);
							if (tmpContent_tOracleInput_10 != null) {
								row6.REPORT_MONTH = tmpContent_tOracleInput_10;
							} else {
								row6.REPORT_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 3) {
							row6.SERVICE_LOYAL_12NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(3);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_LOYAL_12NUMERATOR = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_LOYAL_12NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 4) {
							row6.SERVICE_BASE_12DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(4);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_BASE_12DENOMINATOR = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_BASE_12DENOMINATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 5) {
							row6.SERVICE_LOYAL_PCT_12 = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(5);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_LOYAL_PCT_12 = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_LOYAL_PCT_12 = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 6) {
							row6.SERVICE_LOYAL_3NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(6);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_LOYAL_3NUMERATOR = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_LOYAL_3NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 7) {
							row6.SERVICE_BASE_3DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(7);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_BASE_3DENOMINATOR = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_BASE_3DENOMINATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 8) {
							row6.SERVICE_LOYAL_PCT_3 = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(8);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_LOYAL_PCT_3 = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_LOYAL_PCT_3 = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 9) {
							row6.SERVICE_LOYAL_1NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(9);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_LOYAL_1NUMERATOR = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_LOYAL_1NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 10) {
							row6.SERVICE_BASE_1DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(10);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_BASE_1DENOMINATOR = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_BASE_1DENOMINATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 11) {
							row6.SERVICE_LOYALPCT_1 = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(11);
							if (tmpContent_tOracleInput_10 != null) {
								row6.SERVICE_LOYALPCT_1 = tmpContent_tOracleInput_10;
							} else {
								row6.SERVICE_LOYALPCT_1 = null;
							}
						}
						if (colQtyInRs_tOracleInput_10 < 12) {
							row6.LESS_THAN_12_MTHS_SERVICE_IND = null;
						} else {

							tmpContent_tOracleInput_10 = rs_tOracleInput_10
									.getString(12);
							if (tmpContent_tOracleInput_10 != null) {
								row6.LESS_THAN_12_MTHS_SERVICE_IND = tmpContent_tOracleInput_10;
							} else {
								row6.LESS_THAN_12_MTHS_SERVICE_IND = null;
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
						 * [tFileOutputPositional_4 main ] start
						 */

						currentComponent = "tFileOutputPositional_4";

						if (log.isTraceEnabled()) {
							log.trace("row6 - "
									+ (row6 == null ? "" : row6.toLogString()));
						}

						String tempStringMtFileOutputPositional_4 = null;

						int tempLengthMtFileOutputPositional_4 = 0;

						StringBuilder sb_tFileOutputPositional_4 = new StringBuilder();
						positionUtil_tFileOutputPositional_4.setValue_0(row6,
								sb_tFileOutputPositional_4,
								tempStringMtFileOutputPositional_4,
								tempLengthMtFileOutputPositional_4);
						sb_tFileOutputPositional_4.append("\r\n");

						synchronized (multiThreadLockWrite) {

							outtFileOutputPositional_4
									.write(sb_tFileOutputPositional_4
											.toString());

						}

						nb_line_tFileOutputPositional_4++;
						log.debug("tFileOutputPositional_4 - Writing the record "
								+ nb_line_tFileOutputPositional_4
								+ " to the file.");

						tos_count_tFileOutputPositional_4++;

						/**
						 * [tFileOutputPositional_4 main ] stop
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
				 * [tFileOutputPositional_4 end ] start
				 */

				currentComponent = "tFileOutputPositional_4";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_4.close();
				}
				globalMap.put("tFileOutputPositional_4_NB_LINE",
						nb_line_tFileOutputPositional_4);
				log.info("tFileOutputPositional_4 - Written records count: "
						+ nb_line_tFileOutputPositional_4 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_4 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_4", true);
				end_Hash.put("tFileOutputPositional_4",
						System.currentTimeMillis());

				tOracleInput_14Process(globalMap);

				/**
				 * [tFileOutputPositional_4 end ] stop
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
				 * [tFileOutputPositional_4 finally ] start
				 */

				currentComponent = "tFileOutputPositional_4";

				/**
				 * [tFileOutputPositional_4 finally ] stop
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

	public static class row13Struct implements
			routines.system.IPersistableRow<row13Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String DEALER_NUMBER;

		public String getDEALER_NUMBER() {
			return this.DEALER_NUMBER;
		}

		public String REPORT_MONTH;

		public String getREPORT_MONTH() {
			return this.REPORT_MONTH;
		}

		public String SERVICE_LOYAL_12NUMERATOR;

		public String getSERVICE_LOYAL_12NUMERATOR() {
			return this.SERVICE_LOYAL_12NUMERATOR;
		}

		public String SERVICE_BASE_12DENOMINATOR;

		public String getSERVICE_BASE_12DENOMINATOR() {
			return this.SERVICE_BASE_12DENOMINATOR;
		}

		public String SERVICE_LOYAL_PCT_12;

		public String getSERVICE_LOYAL_PCT_12() {
			return this.SERVICE_LOYAL_PCT_12;
		}

		public String SERVICE_LOYAL_3NUMERATOR;

		public String getSERVICE_LOYAL_3NUMERATOR() {
			return this.SERVICE_LOYAL_3NUMERATOR;
		}

		public String SERVICE_BASE_3DENOMINATOR;

		public String getSERVICE_BASE_3DENOMINATOR() {
			return this.SERVICE_BASE_3DENOMINATOR;
		}

		public String SERVICE_LOYAL_PCT_3;

		public String getSERVICE_LOYAL_PCT_3() {
			return this.SERVICE_LOYAL_PCT_3;
		}

		public String SERVICE_LOYAL_1NUMERATOR;

		public String getSERVICE_LOYAL_1NUMERATOR() {
			return this.SERVICE_LOYAL_1NUMERATOR;
		}

		public String SERVICE_BASE_1DENOMINATOR;

		public String getSERVICE_BASE_1DENOMINATOR() {
			return this.SERVICE_BASE_1DENOMINATOR;
		}

		public String SERVICE_LOYALPCT_1;

		public String getSERVICE_LOYALPCT_1() {
			return this.SERVICE_LOYALPCT_1;
		}

		public String LESS_THAN_12_MTHS_SERVICE_IND;

		public String getLESS_THAN_12_MTHS_SERVICE_IND() {
			return this.LESS_THAN_12_MTHS_SERVICE_IND;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.DEALER_NUMBER = readString(dis);

					this.REPORT_MONTH = readString(dis);

					this.SERVICE_LOYAL_12NUMERATOR = readString(dis);

					this.SERVICE_BASE_12DENOMINATOR = readString(dis);

					this.SERVICE_LOYAL_PCT_12 = readString(dis);

					this.SERVICE_LOYAL_3NUMERATOR = readString(dis);

					this.SERVICE_BASE_3DENOMINATOR = readString(dis);

					this.SERVICE_LOYAL_PCT_3 = readString(dis);

					this.SERVICE_LOYAL_1NUMERATOR = readString(dis);

					this.SERVICE_BASE_1DENOMINATOR = readString(dis);

					this.SERVICE_LOYALPCT_1 = readString(dis);

					this.LESS_THAN_12_MTHS_SERVICE_IND = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.DEALER_NUMBER, dos);

				// String

				writeString(this.REPORT_MONTH, dos);

				// String

				writeString(this.SERVICE_LOYAL_12NUMERATOR, dos);

				// String

				writeString(this.SERVICE_BASE_12DENOMINATOR, dos);

				// String

				writeString(this.SERVICE_LOYAL_PCT_12, dos);

				// String

				writeString(this.SERVICE_LOYAL_3NUMERATOR, dos);

				// String

				writeString(this.SERVICE_BASE_3DENOMINATOR, dos);

				// String

				writeString(this.SERVICE_LOYAL_PCT_3, dos);

				// String

				writeString(this.SERVICE_LOYAL_1NUMERATOR, dos);

				// String

				writeString(this.SERVICE_BASE_1DENOMINATOR, dos);

				// String

				writeString(this.SERVICE_LOYALPCT_1, dos);

				// String

				writeString(this.LESS_THAN_12_MTHS_SERVICE_IND, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("DEALER_NUMBER=" + DEALER_NUMBER);
			sb.append(",REPORT_MONTH=" + REPORT_MONTH);
			sb.append(",SERVICE_LOYAL_12NUMERATOR=" + SERVICE_LOYAL_12NUMERATOR);
			sb.append(",SERVICE_BASE_12DENOMINATOR="
					+ SERVICE_BASE_12DENOMINATOR);
			sb.append(",SERVICE_LOYAL_PCT_12=" + SERVICE_LOYAL_PCT_12);
			sb.append(",SERVICE_LOYAL_3NUMERATOR=" + SERVICE_LOYAL_3NUMERATOR);
			sb.append(",SERVICE_BASE_3DENOMINATOR=" + SERVICE_BASE_3DENOMINATOR);
			sb.append(",SERVICE_LOYAL_PCT_3=" + SERVICE_LOYAL_PCT_3);
			sb.append(",SERVICE_LOYAL_1NUMERATOR=" + SERVICE_LOYAL_1NUMERATOR);
			sb.append(",SERVICE_BASE_1DENOMINATOR=" + SERVICE_BASE_1DENOMINATOR);
			sb.append(",SERVICE_LOYALPCT_1=" + SERVICE_LOYALPCT_1);
			sb.append(",LESS_THAN_12_MTHS_SERVICE_IND="
					+ LESS_THAN_12_MTHS_SERVICE_IND);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (DEALER_NUMBER == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_NUMBER);
			}

			sb.append("|");

			if (REPORT_MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(REPORT_MONTH);
			}

			sb.append("|");

			if (SERVICE_LOYAL_12NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_12NUMERATOR);
			}

			sb.append("|");

			if (SERVICE_BASE_12DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_BASE_12DENOMINATOR);
			}

			sb.append("|");

			if (SERVICE_LOYAL_PCT_12 == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_PCT_12);
			}

			sb.append("|");

			if (SERVICE_LOYAL_3NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_3NUMERATOR);
			}

			sb.append("|");

			if (SERVICE_BASE_3DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_BASE_3DENOMINATOR);
			}

			sb.append("|");

			if (SERVICE_LOYAL_PCT_3 == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_PCT_3);
			}

			sb.append("|");

			if (SERVICE_LOYAL_1NUMERATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYAL_1NUMERATOR);
			}

			sb.append("|");

			if (SERVICE_BASE_1DENOMINATOR == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_BASE_1DENOMINATOR);
			}

			sb.append("|");

			if (SERVICE_LOYALPCT_1 == null) {
				sb.append("<null>");
			} else {
				sb.append(SERVICE_LOYALPCT_1);
			}

			sb.append("|");

			if (LESS_THAN_12_MTHS_SERVICE_IND == null) {
				sb.append("<null>");
			} else {
				sb.append(LESS_THAN_12_MTHS_SERVICE_IND);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row13Struct other) {

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

				row13Struct row13 = new row13Struct();

				/**
				 * [tFileOutputPositional_5 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_5", false);
				start_Hash.put("tFileOutputPositional_5",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_5";

				int tos_count_tFileOutputPositional_5 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_5 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_5 = new StringBuilder();
				log4jParamters_tFileOutputPositional_5.append("Parameters:");
				log4jParamters_tFileOutputPositional_5
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"Service_Retention_2X_\" + context.rMonth + \".txt\"");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("0")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("5")
						+ ", SCHEMA_COLUMN=" + ("DEALER_NUMBER") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("6") + ", SCHEMA_COLUMN="
						+ ("REPORT_MONTH") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_12NUMERATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_12DENOMINATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_12") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_3NUMERATOR") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_3DENOMINATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_3") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_1NUMERATOR") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_1DENOMINATOR") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYALPCT_1") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("1") + ", SCHEMA_COLUMN="
						+ ("LESS_THAN_12_MTHS_SERVICE_IND") + "}]");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				log4jParamters_tFileOutputPositional_5
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_5.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_5 - "
							+ log4jParamters_tFileOutputPositional_5);

				int nb_line_tFileOutputPositional_5 = 0;

				class PositionUtil_tFileOutputPositional_5 {

					void setValue_0(final row13Struct row13,
							StringBuilder sb_tFileOutputPositional_5,
							String tempStringMtFileOutputPositional_5,
							int tempLengthMtFileOutputPositional_5)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.DEALER_NUMBER == null) ? ""
								: row13.DEALER_NUMBER;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 5) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 5) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 5 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(0);
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.REPORT_MONTH == null) ? ""
								: row13.REPORT_MONTH;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 6) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 6) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 6 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_LOYAL_12NUMERATOR == null) ? ""
								: row13.SERVICE_LOYAL_12NUMERATOR;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_BASE_12DENOMINATOR == null) ? ""
								: row13.SERVICE_BASE_12DENOMINATOR;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_LOYAL_PCT_12 == null) ? ""
								: row13.SERVICE_LOYAL_PCT_12;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_LOYAL_3NUMERATOR == null) ? ""
								: row13.SERVICE_LOYAL_3NUMERATOR;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_BASE_3DENOMINATOR == null) ? ""
								: row13.SERVICE_BASE_3DENOMINATOR;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_LOYAL_PCT_3 == null) ? ""
								: row13.SERVICE_LOYAL_PCT_3;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_LOYAL_1NUMERATOR == null) ? ""
								: row13.SERVICE_LOYAL_1NUMERATOR;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_BASE_1DENOMINATOR == null) ? ""
								: row13.SERVICE_BASE_1DENOMINATOR;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.SERVICE_LOYALPCT_1 == null) ? ""
								: row13.SERVICE_LOYALPCT_1;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 8) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 8) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 8 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_5 = (row13.LESS_THAN_12_MTHS_SERVICE_IND == null) ? ""
								: row13.LESS_THAN_12_MTHS_SERVICE_IND;

						tempLengthMtFileOutputPositional_5 = tempStringMtFileOutputPositional_5
								.length();

						if (tempLengthMtFileOutputPositional_5 >= 1) {
							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
						} else if (tempLengthMtFileOutputPositional_5 < 1) {

							sb_tFileOutputPositional_5
									.append(tempStringMtFileOutputPositional_5);
							for (int i_tFileOutputPositional_5 = 0; i_tFileOutputPositional_5 < 1 - tempLengthMtFileOutputPositional_5; i_tFileOutputPositional_5++) {
								sb_tFileOutputPositional_5.append(' ');
							}

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_5 positionUtil_tFileOutputPositional_5 = new PositionUtil_tFileOutputPositional_5();

				String fileNewName_tFileOutputPositional_5 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Service_Retention_2X_" + context.rMonth + ".txt";
				java.io.File createFiletFileOutputPositional_5 = new java.io.File(
						fileNewName_tFileOutputPositional_5);
				boolean isFileGenerated_tFileOutputPositional_5 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_5 = createFiletFileOutputPositional_5
						.getParentFile();
				if (parentFile_tFileOutputPositional_5 != null
						&& !parentFile_tFileOutputPositional_5.exists()) {
					parentFile_tFileOutputPositional_5.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_5 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_5,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_5 begin ] stop
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
						+ "context.dbHostName");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_14.append(" | ");
				log4jParamters_tOracleInput_14.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
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
								+ "\"SELECT               DLR_CD AS DEALER_NUMBER,              TO_CHAR(RPT_DT, 'YYYYMM') AS REPORT_MONTH,              R12M_2PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_12NUMERATOR,              R12M_SVC_BASE AS SERVICE_BASE_12DENOMINATOR,              CAST(REPLACE(R12M_SVC_LOYAL_PCT_2X,'.','')AS INT) AS SERVICE_LOYAL_PCT_12,              R3M_2PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_3NUMERATOR,              R3M_SVC_BASE AS SERVICE_BASE_3DENOMINATOR,              CAST(REPLACE(R3M_SVC_LOYAL_PCT_2X,'.','')AS INT) AS SERVICE_LOYAL_PCT_3,              R1M_2PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_1NUMERATOR,              R1M_SVC_BASE AS SERVICE_BASE_1DENOMINATOR,              CAST(REPLACE(R1M_SVC_LOYAL_PCT_2X,'.','')AS INT) AS SERVICE_LOYAL_PCT_1,              LESS_THAN_12_MTHS_IND AS LESS_THAN_12_MTHS_SERVICE_IND                  FROM FCA_SR_OWNER.FCA_SVC_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')  ORDER BY 1\"");
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
						+ ("DEALER_NUMBER") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("REPORT_MONTH") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_12NUMERATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_12DENOMINATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_12") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SERVICE_LOYAL_3NUMERATOR")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_3DENOMINATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYAL_PCT_3") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("SERVICE_LOYAL_1NUMERATOR")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_BASE_1DENOMINATOR") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN="
						+ ("SERVICE_LOYALPCT_1") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN="
						+ ("LESS_THAN_12_MTHS_SERVICE_IND") + "}]");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_14 = context.dbUser;

				final String decryptedPassword_tOracleInput_14 = context.dbPassword;

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

				String dbquery_tOracleInput_14 = "SELECT \n            DLR_CD AS DEALER_NUMBER,\n            TO_CHAR(RPT_DT, 'YYYYMM') AS REPORT_MONTH,\n            R12M_2PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_12NUMERATOR,\n            R12M_SVC_BASE AS SERVICE_BASE_12DENOMINATOR,\n            CAST(REPLACE(R12M_SVC_LOYAL_PCT_2X,'.','')AS INT) AS SERVICE_LOYAL_PCT_12,\n            R3M_2PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_3NUMERATOR,\n            R3M_SVC_BASE AS SERVICE_BASE_3DENOMINATOR,\n            CAST(REPLACE(R3M_SVC_LOYAL_PCT_2X,'.','')AS INT) AS SERVICE_LOYAL_PCT_3,\n            R1M_2PLUS_SVC_RETEN_NUMERATOR AS SERVICE_LOYAL_1NUMERATOR,\n            R1M_SVC_BASE AS SERVICE_BASE_1DENOMINATOR,\n            CAST(REPLACE(R1M_SVC_LOYAL_PCT_2X,'.','')AS INT) AS SERVICE_LOYAL_PCT_1,\n            LESS_THAN_12_MTHS_IND AS LESS_THAN_12_MTHS_SERVICE_IND\n\n            \nFROM FCA_SR_OWNER.FCA_SVC_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')\nORDER BY 1";

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
							row13.DEALER_NUMBER = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(1);
							if (tmpContent_tOracleInput_14 != null) {
								row13.DEALER_NUMBER = tmpContent_tOracleInput_14;
							} else {
								row13.DEALER_NUMBER = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 2) {
							row13.REPORT_MONTH = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(2);
							if (tmpContent_tOracleInput_14 != null) {
								row13.REPORT_MONTH = tmpContent_tOracleInput_14;
							} else {
								row13.REPORT_MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 3) {
							row13.SERVICE_LOYAL_12NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(3);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_LOYAL_12NUMERATOR = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_LOYAL_12NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 4) {
							row13.SERVICE_BASE_12DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(4);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_BASE_12DENOMINATOR = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_BASE_12DENOMINATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 5) {
							row13.SERVICE_LOYAL_PCT_12 = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(5);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_LOYAL_PCT_12 = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_LOYAL_PCT_12 = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 6) {
							row13.SERVICE_LOYAL_3NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(6);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_LOYAL_3NUMERATOR = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_LOYAL_3NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 7) {
							row13.SERVICE_BASE_3DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(7);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_BASE_3DENOMINATOR = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_BASE_3DENOMINATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 8) {
							row13.SERVICE_LOYAL_PCT_3 = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(8);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_LOYAL_PCT_3 = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_LOYAL_PCT_3 = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 9) {
							row13.SERVICE_LOYAL_1NUMERATOR = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(9);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_LOYAL_1NUMERATOR = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_LOYAL_1NUMERATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 10) {
							row13.SERVICE_BASE_1DENOMINATOR = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(10);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_BASE_1DENOMINATOR = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_BASE_1DENOMINATOR = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 11) {
							row13.SERVICE_LOYALPCT_1 = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(11);
							if (tmpContent_tOracleInput_14 != null) {
								row13.SERVICE_LOYALPCT_1 = tmpContent_tOracleInput_14;
							} else {
								row13.SERVICE_LOYALPCT_1 = null;
							}
						}
						if (colQtyInRs_tOracleInput_14 < 12) {
							row13.LESS_THAN_12_MTHS_SERVICE_IND = null;
						} else {

							tmpContent_tOracleInput_14 = rs_tOracleInput_14
									.getString(12);
							if (tmpContent_tOracleInput_14 != null) {
								row13.LESS_THAN_12_MTHS_SERVICE_IND = tmpContent_tOracleInput_14;
							} else {
								row13.LESS_THAN_12_MTHS_SERVICE_IND = null;
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
						 * [tFileOutputPositional_5 main ] start
						 */

						currentComponent = "tFileOutputPositional_5";

						if (log.isTraceEnabled()) {
							log.trace("row13 - "
									+ (row13 == null ? "" : row13.toLogString()));
						}

						String tempStringMtFileOutputPositional_5 = null;

						int tempLengthMtFileOutputPositional_5 = 0;

						StringBuilder sb_tFileOutputPositional_5 = new StringBuilder();
						positionUtil_tFileOutputPositional_5.setValue_0(row13,
								sb_tFileOutputPositional_5,
								tempStringMtFileOutputPositional_5,
								tempLengthMtFileOutputPositional_5);
						sb_tFileOutputPositional_5.append("\r\n");

						synchronized (multiThreadLockWrite) {

							outtFileOutputPositional_5
									.write(sb_tFileOutputPositional_5
											.toString());

						}

						nb_line_tFileOutputPositional_5++;
						log.debug("tFileOutputPositional_5 - Writing the record "
								+ nb_line_tFileOutputPositional_5
								+ " to the file.");

						tos_count_tFileOutputPositional_5++;

						/**
						 * [tFileOutputPositional_5 main ] stop
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
				 * [tFileOutputPositional_5 end ] start
				 */

				currentComponent = "tFileOutputPositional_5";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_5.close();
				}
				globalMap.put("tFileOutputPositional_5_NB_LINE",
						nb_line_tFileOutputPositional_5);
				log.info("tFileOutputPositional_5 - Written records count: "
						+ nb_line_tFileOutputPositional_5 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_5 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_5", true);
				end_Hash.put("tFileOutputPositional_5",
						System.currentTimeMillis());

				/**
				 * [tFileOutputPositional_5 end ] stop
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
				 * [tFileOutputPositional_5 finally ] start
				 */

				currentComponent = "tFileOutputPositional_5";

				/**
				 * [tFileOutputPositional_5 finally ] stop
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

	public static class row10Struct implements
			routines.system.IPersistableRow<row10Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String MONTH;

		public String getMONTH() {
			return this.MONTH;
		}

		public String VIN;

		public String getVIN() {
			return this.VIN;
		}

		public String DEALER_CODE;

		public String getDEALER_CODE() {
			return this.DEALER_CODE;
		}

		public String COIN_CONSUMER_ID;

		public String getCOIN_CONSUMER_ID() {
			return this.COIN_CONSUMER_ID;
		}

		public String PURCHASE_LEASE_DATE;

		public String getPURCHASE_LEASE_DATE() {
			return this.PURCHASE_LEASE_DATE;
		}

		public String RETENTION_STATUS;

		public String getRETENTION_STATUS() {
			return this.RETENTION_STATUS;
		}

		public String VEHICLE_AGE;

		public String getVEHICLE_AGE() {
			return this.VEHICLE_AGE;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.MONTH = readString(dis);

					this.VIN = readString(dis);

					this.DEALER_CODE = readString(dis);

					this.COIN_CONSUMER_ID = readString(dis);

					this.PURCHASE_LEASE_DATE = readString(dis);

					this.RETENTION_STATUS = readString(dis);

					this.VEHICLE_AGE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MONTH, dos);

				// String

				writeString(this.VIN, dos);

				// String

				writeString(this.DEALER_CODE, dos);

				// String

				writeString(this.COIN_CONSUMER_ID, dos);

				// String

				writeString(this.PURCHASE_LEASE_DATE, dos);

				// String

				writeString(this.RETENTION_STATUS, dos);

				// String

				writeString(this.VEHICLE_AGE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MONTH=" + MONTH);
			sb.append(",VIN=" + VIN);
			sb.append(",DEALER_CODE=" + DEALER_CODE);
			sb.append(",COIN_CONSUMER_ID=" + COIN_CONSUMER_ID);
			sb.append(",PURCHASE_LEASE_DATE=" + PURCHASE_LEASE_DATE);
			sb.append(",RETENTION_STATUS=" + RETENTION_STATUS);
			sb.append(",VEHICLE_AGE=" + VEHICLE_AGE);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MONTH == null) {
				sb.append("<null>");
			} else {
				sb.append(MONTH);
			}

			sb.append("|");

			if (VIN == null) {
				sb.append("<null>");
			} else {
				sb.append(VIN);
			}

			sb.append("|");

			if (DEALER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(DEALER_CODE);
			}

			sb.append("|");

			if (COIN_CONSUMER_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(COIN_CONSUMER_ID);
			}

			sb.append("|");

			if (PURCHASE_LEASE_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(PURCHASE_LEASE_DATE);
			}

			sb.append("|");

			if (RETENTION_STATUS == null) {
				sb.append("<null>");
			} else {
				sb.append(RETENTION_STATUS);
			}

			sb.append("|");

			if (VEHICLE_AGE == null) {
				sb.append("<null>");
			} else {
				sb.append(VEHICLE_AGE);
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

	public void tOracleInput_12Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tOracleInput_12_SUBPROCESS_STATE", 0);

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
				 * [tFileOutputPositional_6 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_6", false);
				start_Hash.put("tFileOutputPositional_6",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_6";

				int tos_count_tFileOutputPositional_6 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_6 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_6 = new StringBuilder();
				log4jParamters_tFileOutputPositional_6.append("Parameters:");
				log4jParamters_tFileOutputPositional_6
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"Dealer_Standard_FYR_Detail_\" + context.rMonth + \".txt\"");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("6")
						+ ", SCHEMA_COLUMN=" + ("MONTH") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("17") + ", SCHEMA_COLUMN="
						+ ("VIN") + "}, {ALIGN=" + ("'L'") + ", PADDING_CHAR="
						+ ("0") + ", KEEP=" + ("'A'") + ", SIZE=" + ("5")
						+ ", SCHEMA_COLUMN=" + ("DEALER_CODE") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("10") + ", SCHEMA_COLUMN="
						+ ("COIN_CONSUMER_ID") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("8") + ", SCHEMA_COLUMN="
						+ ("PURCHASE_LEASE_DATE") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("2") + ", SCHEMA_COLUMN="
						+ ("RETENTION_STATUS") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("2") + ", SCHEMA_COLUMN="
						+ ("VEHICLE_AGE") + "}]");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				log4jParamters_tFileOutputPositional_6
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_6.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_6 - "
							+ log4jParamters_tFileOutputPositional_6);

				int nb_line_tFileOutputPositional_6 = 0;

				class PositionUtil_tFileOutputPositional_6 {

					void setValue_0(final row10Struct row10,
							StringBuilder sb_tFileOutputPositional_6,
							String tempStringMtFileOutputPositional_6,
							int tempLengthMtFileOutputPositional_6)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_6 = (row10.MONTH == null) ? ""
								: row10.MONTH;

						tempLengthMtFileOutputPositional_6 = tempStringMtFileOutputPositional_6
								.length();

						if (tempLengthMtFileOutputPositional_6 >= 6) {
							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
						} else if (tempLengthMtFileOutputPositional_6 < 6) {

							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
							for (int i_tFileOutputPositional_6 = 0; i_tFileOutputPositional_6 < 6 - tempLengthMtFileOutputPositional_6; i_tFileOutputPositional_6++) {
								sb_tFileOutputPositional_6.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_6 = (row10.VIN == null) ? ""
								: row10.VIN;

						tempLengthMtFileOutputPositional_6 = tempStringMtFileOutputPositional_6
								.length();

						if (tempLengthMtFileOutputPositional_6 >= 17) {
							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
						} else if (tempLengthMtFileOutputPositional_6 < 17) {

							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
							for (int i_tFileOutputPositional_6 = 0; i_tFileOutputPositional_6 < 17 - tempLengthMtFileOutputPositional_6; i_tFileOutputPositional_6++) {
								sb_tFileOutputPositional_6.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_6 = (row10.DEALER_CODE == null) ? ""
								: row10.DEALER_CODE;

						tempLengthMtFileOutputPositional_6 = tempStringMtFileOutputPositional_6
								.length();

						if (tempLengthMtFileOutputPositional_6 >= 5) {
							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
						} else if (tempLengthMtFileOutputPositional_6 < 5) {

							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
							for (int i_tFileOutputPositional_6 = 0; i_tFileOutputPositional_6 < 5 - tempLengthMtFileOutputPositional_6; i_tFileOutputPositional_6++) {
								sb_tFileOutputPositional_6.append(0);
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_6 = (row10.COIN_CONSUMER_ID == null) ? ""
								: row10.COIN_CONSUMER_ID;

						tempLengthMtFileOutputPositional_6 = tempStringMtFileOutputPositional_6
								.length();

						if (tempLengthMtFileOutputPositional_6 >= 10) {
							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
						} else if (tempLengthMtFileOutputPositional_6 < 10) {

							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
							for (int i_tFileOutputPositional_6 = 0; i_tFileOutputPositional_6 < 10 - tempLengthMtFileOutputPositional_6; i_tFileOutputPositional_6++) {
								sb_tFileOutputPositional_6.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_6 = (row10.PURCHASE_LEASE_DATE == null) ? ""
								: row10.PURCHASE_LEASE_DATE;

						tempLengthMtFileOutputPositional_6 = tempStringMtFileOutputPositional_6
								.length();

						if (tempLengthMtFileOutputPositional_6 >= 8) {
							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
						} else if (tempLengthMtFileOutputPositional_6 < 8) {

							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
							for (int i_tFileOutputPositional_6 = 0; i_tFileOutputPositional_6 < 8 - tempLengthMtFileOutputPositional_6; i_tFileOutputPositional_6++) {
								sb_tFileOutputPositional_6.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_6 = (row10.RETENTION_STATUS == null) ? ""
								: row10.RETENTION_STATUS;

						tempLengthMtFileOutputPositional_6 = tempStringMtFileOutputPositional_6
								.length();

						if (tempLengthMtFileOutputPositional_6 >= 2) {
							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
						} else if (tempLengthMtFileOutputPositional_6 < 2) {

							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
							for (int i_tFileOutputPositional_6 = 0; i_tFileOutputPositional_6 < 2 - tempLengthMtFileOutputPositional_6; i_tFileOutputPositional_6++) {
								sb_tFileOutputPositional_6.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_6 = (row10.VEHICLE_AGE == null) ? ""
								: row10.VEHICLE_AGE;

						tempLengthMtFileOutputPositional_6 = tempStringMtFileOutputPositional_6
								.length();

						if (tempLengthMtFileOutputPositional_6 >= 2) {
							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
						} else if (tempLengthMtFileOutputPositional_6 < 2) {

							sb_tFileOutputPositional_6
									.append(tempStringMtFileOutputPositional_6);
							for (int i_tFileOutputPositional_6 = 0; i_tFileOutputPositional_6 < 2 - tempLengthMtFileOutputPositional_6; i_tFileOutputPositional_6++) {
								sb_tFileOutputPositional_6.append(' ');
							}

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_6 positionUtil_tFileOutputPositional_6 = new PositionUtil_tFileOutputPositional_6();

				String fileNewName_tFileOutputPositional_6 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Dealer_Standard_FYR_Detail_" + context.rMonth
						+ ".txt";
				java.io.File createFiletFileOutputPositional_6 = new java.io.File(
						fileNewName_tFileOutputPositional_6);
				boolean isFileGenerated_tFileOutputPositional_6 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_6 = createFiletFileOutputPositional_6
						.getParentFile();
				if (parentFile_tFileOutputPositional_6 != null
						&& !parentFile_tFileOutputPositional_6.exists()) {
					parentFile_tFileOutputPositional_6.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_6 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_6,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_6 begin ] stop
				 */

				/**
				 * [tOracleInput_12 begin ] start
				 */

				ok_Hash.put("tOracleInput_12", false);
				start_Hash.put("tOracleInput_12", System.currentTimeMillis());

				currentComponent = "tOracleInput_12";

				int tos_count_tOracleInput_12 = 0;

				if (log.isInfoEnabled())
					log.info("tOracleInput_12 - " + "Start to work.");
				StringBuilder log4jParamters_tOracleInput_12 = new StringBuilder();
				log4jParamters_tOracleInput_12.append("Parameters:");
				log4jParamters_tOracleInput_12.append("USE_EXISTING_CONNECTION"
						+ " = " + "false");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("CONNECTION_TYPE" + " = "
						+ "ORACLE_SERVICE_NAME");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("DB_VERSION" + " = "
						+ "ORACLE_11");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("PORT" + " = "
						+ "\"1521\"");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("TABLE" + " = " + "\"\"");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12
						.append("QUERY"
								+ " = "
								+ "\"SELECT               TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,              VIN,              DLR_CD AS DEALER_CODE,              CUST_ID AS COIN_CONSUMER_ID,              PRCH_LSE_DT AS PURCHASE_LEASE_DATE,              RETENTION_STATUS,              MTH_OF_OWNERSHIP AS VEHICLE_AGE                              FROM FCA_SR_OWNER.FCA_VIN_FYR_SVC_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')  ORDER BY 3\"");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12
						.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("PROPERTIES" + " = "
						+ "\"\"");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("IS_CONVERT_XMLTYPE"
						+ " = " + "false");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("USE_CURSOR" + " = "
						+ "false");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("TRIM_ALL_COLUMN" + " = "
						+ "false");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("TRIM_COLUMN" + " = "
						+ "[{TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("MONTH") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VIN") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("DEALER_CODE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("COIN_CONSUMER_ID") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("PURCHASE_LEASE_DATE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("RETENTION_STATUS") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("VEHICLE_AGE") + "}]");
				log4jParamters_tOracleInput_12.append(" | ");
				log4jParamters_tOracleInput_12.append("NO_NULL_VALUES" + " = "
						+ "false");
				log4jParamters_tOracleInput_12.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tOracleInput_12 - "
							+ log4jParamters_tOracleInput_12);

				int nb_line_tOracleInput_12 = 0;
				java.sql.Connection conn_tOracleInput_12 = null;
				String driverClass_tOracleInput_12 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tOracleInput_12);

				String url_tOracleInput_12 = null;
				url_tOracleInput_12 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";

				String dbUser_tOracleInput_12 = context.dbUser;

				final String decryptedPassword_tOracleInput_12 = context.dbPassword;

				String dbPwd_tOracleInput_12 = decryptedPassword_tOracleInput_12;

				log.debug("tOracleInput_12 - Driver ClassName: "
						+ driverClass_tOracleInput_12 + ".");

				log.info("tOracleInput_12 - Connection attempt to '"
						+ url_tOracleInput_12 + "' with the username '"
						+ dbUser_tOracleInput_12 + "'.");

				conn_tOracleInput_12 = java.sql.DriverManager.getConnection(
						url_tOracleInput_12, dbUser_tOracleInput_12,
						dbPwd_tOracleInput_12);
				log.info("tOracleInput_12 - Connection to '"
						+ url_tOracleInput_12 + "' has succeeded.");

				java.sql.Statement stmtGetTZ_tOracleInput_12 = conn_tOracleInput_12
						.createStatement();
				java.sql.ResultSet rsGetTZ_tOracleInput_12 = stmtGetTZ_tOracleInput_12
						.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tOracleInput_12 = java.util.TimeZone
						.getDefault().getID();
				while (rsGetTZ_tOracleInput_12.next()) {
					sessionTimezone_tOracleInput_12 = rsGetTZ_tOracleInput_12
							.getString(1);
				}
				((oracle.jdbc.OracleConnection) conn_tOracleInput_12)
						.setSessionTimeZone(sessionTimezone_tOracleInput_12);

				java.sql.Statement stmt_tOracleInput_12 = conn_tOracleInput_12
						.createStatement();

				String dbquery_tOracleInput_12 = "SELECT \n            TO_CHAR(RPT_DT, 'YYYYMM') AS MONTH,\n            VIN,\n            DLR_CD AS DEALER_CODE,\n            CUST_ID AS COIN_CONSUMER_ID,\n            PRCH_LSE_DT AS PURCHASE_LEASE_DATE,\n            RETENTION_STATUS,\n            MTH_OF_OWNERSHIP AS VEHICLE_AGE\n            \n            \nFROM FCA_SR_OWNER.FCA_VIN_FYR_SVC_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')\nORDER BY 3";

				log.info("tOracleInput_12 - Executing the query: '"
						+ dbquery_tOracleInput_12 + "'.");

				globalMap.put("tOracleInput_12_QUERY", dbquery_tOracleInput_12);

				java.sql.ResultSet rs_tOracleInput_12 = null;
				try {
					rs_tOracleInput_12 = stmt_tOracleInput_12
							.executeQuery(dbquery_tOracleInput_12);
					java.sql.ResultSetMetaData rsmd_tOracleInput_12 = rs_tOracleInput_12
							.getMetaData();
					int colQtyInRs_tOracleInput_12 = rsmd_tOracleInput_12
							.getColumnCount();

					String tmpContent_tOracleInput_12 = null;

					log.info("tOracleInput_12 - Retrieving records from the database.");

					while (rs_tOracleInput_12.next()) {
						nb_line_tOracleInput_12++;

						if (colQtyInRs_tOracleInput_12 < 1) {
							row10.MONTH = null;
						} else {

							tmpContent_tOracleInput_12 = rs_tOracleInput_12
									.getString(1);
							if (tmpContent_tOracleInput_12 != null) {
								row10.MONTH = tmpContent_tOracleInput_12;
							} else {
								row10.MONTH = null;
							}
						}
						if (colQtyInRs_tOracleInput_12 < 2) {
							row10.VIN = null;
						} else {

							tmpContent_tOracleInput_12 = rs_tOracleInput_12
									.getString(2);
							if (tmpContent_tOracleInput_12 != null) {
								row10.VIN = tmpContent_tOracleInput_12;
							} else {
								row10.VIN = null;
							}
						}
						if (colQtyInRs_tOracleInput_12 < 3) {
							row10.DEALER_CODE = null;
						} else {

							tmpContent_tOracleInput_12 = rs_tOracleInput_12
									.getString(3);
							if (tmpContent_tOracleInput_12 != null) {
								row10.DEALER_CODE = tmpContent_tOracleInput_12;
							} else {
								row10.DEALER_CODE = null;
							}
						}
						if (colQtyInRs_tOracleInput_12 < 4) {
							row10.COIN_CONSUMER_ID = null;
						} else {

							tmpContent_tOracleInput_12 = rs_tOracleInput_12
									.getString(4);
							if (tmpContent_tOracleInput_12 != null) {
								row10.COIN_CONSUMER_ID = tmpContent_tOracleInput_12;
							} else {
								row10.COIN_CONSUMER_ID = null;
							}
						}
						if (colQtyInRs_tOracleInput_12 < 5) {
							row10.PURCHASE_LEASE_DATE = null;
						} else {

							tmpContent_tOracleInput_12 = rs_tOracleInput_12
									.getString(5);
							if (tmpContent_tOracleInput_12 != null) {
								row10.PURCHASE_LEASE_DATE = tmpContent_tOracleInput_12;
							} else {
								row10.PURCHASE_LEASE_DATE = null;
							}
						}
						if (colQtyInRs_tOracleInput_12 < 6) {
							row10.RETENTION_STATUS = null;
						} else {

							tmpContent_tOracleInput_12 = rs_tOracleInput_12
									.getString(6);
							if (tmpContent_tOracleInput_12 != null) {
								row10.RETENTION_STATUS = tmpContent_tOracleInput_12;
							} else {
								row10.RETENTION_STATUS = null;
							}
						}
						if (colQtyInRs_tOracleInput_12 < 7) {
							row10.VEHICLE_AGE = null;
						} else {

							tmpContent_tOracleInput_12 = rs_tOracleInput_12
									.getString(7);
							if (tmpContent_tOracleInput_12 != null) {
								row10.VEHICLE_AGE = tmpContent_tOracleInput_12;
							} else {
								row10.VEHICLE_AGE = null;
							}
						}

						log.debug("tOracleInput_12 - Retrieving the record "
								+ nb_line_tOracleInput_12 + ".");

						/**
						 * [tOracleInput_12 begin ] stop
						 */

						/**
						 * [tOracleInput_12 main ] start
						 */

						currentComponent = "tOracleInput_12";

						tos_count_tOracleInput_12++;

						/**
						 * [tOracleInput_12 main ] stop
						 */

						/**
						 * [tFileOutputPositional_6 main ] start
						 */

						currentComponent = "tFileOutputPositional_6";

						if (log.isTraceEnabled()) {
							log.trace("row10 - "
									+ (row10 == null ? "" : row10.toLogString()));
						}

						String tempStringMtFileOutputPositional_6 = null;

						int tempLengthMtFileOutputPositional_6 = 0;

						StringBuilder sb_tFileOutputPositional_6 = new StringBuilder();
						positionUtil_tFileOutputPositional_6.setValue_0(row10,
								sb_tFileOutputPositional_6,
								tempStringMtFileOutputPositional_6,
								tempLengthMtFileOutputPositional_6);
						sb_tFileOutputPositional_6.append("\r\n");

						synchronized (multiThreadLockWrite) {

							outtFileOutputPositional_6
									.write(sb_tFileOutputPositional_6
											.toString());

						}

						nb_line_tFileOutputPositional_6++;
						log.debug("tFileOutputPositional_6 - Writing the record "
								+ nb_line_tFileOutputPositional_6
								+ " to the file.");

						tos_count_tFileOutputPositional_6++;

						/**
						 * [tFileOutputPositional_6 main ] stop
						 */

						/**
						 * [tOracleInput_12 end ] start
						 */

						currentComponent = "tOracleInput_12";

					}
				} finally {
					stmt_tOracleInput_12.close();

					if (conn_tOracleInput_12 != null
							&& !conn_tOracleInput_12.isClosed()) {

						log.info("tOracleInput_12 - Closing the connection to the database.");

						conn_tOracleInput_12.close();

						log.info("tOracleInput_12 - Connection to the database closed.");

					}

				}

				globalMap.put("tOracleInput_12_NB_LINE",
						nb_line_tOracleInput_12);
				log.info("tOracleInput_12 - Retrieved records count: "
						+ nb_line_tOracleInput_12 + " .");

				if (log.isInfoEnabled())
					log.info("tOracleInput_12 - " + "Done.");

				ok_Hash.put("tOracleInput_12", true);
				end_Hash.put("tOracleInput_12", System.currentTimeMillis());

				/**
				 * [tOracleInput_12 end ] stop
				 */

				/**
				 * [tFileOutputPositional_6 end ] start
				 */

				currentComponent = "tFileOutputPositional_6";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_6.close();
				}
				globalMap.put("tFileOutputPositional_6_NB_LINE",
						nb_line_tFileOutputPositional_6);
				log.info("tFileOutputPositional_6 - Written records count: "
						+ nb_line_tFileOutputPositional_6 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_6 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_6", true);
				end_Hash.put("tFileOutputPositional_6",
						System.currentTimeMillis());

				/**
				 * [tFileOutputPositional_6 end ] stop
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
				 * [tOracleInput_12 finally ] start
				 */

				currentComponent = "tOracleInput_12";

				/**
				 * [tOracleInput_12 finally ] stop
				 */

				/**
				 * [tFileOutputPositional_6 finally ] start
				 */

				currentComponent = "tFileOutputPositional_6";

				/**
				 * [tFileOutputPositional_6 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tOracleInput_12_SUBPROCESS_STATE", 1);
	}

	public static class row1Struct implements
			routines.system.IPersistableRow<row1Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String CUST_ID;

		public String getCUST_ID() {
			return this.CUST_ID;
		}

		public String FULL_NAME;

		public String getFULL_NAME() {
			return this.FULL_NAME;
		}

		public String PHONE;

		public String getPHONE() {
			return this.PHONE;
		}

		public String ADDRESS_LINE_1;

		public String getADDRESS_LINE_1() {
			return this.ADDRESS_LINE_1;
		}

		public String CITY;

		public String getCITY() {
			return this.CITY;
		}

		public String STATE;

		public String getSTATE() {
			return this.STATE;
		}

		public String ZIP;

		public String getZIP() {
			return this.ZIP;
		}

		public String COUNTRY;

		public String getCOUNTRY() {
			return this.COUNTRY;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.CUST_ID = readString(dis);

					this.FULL_NAME = readString(dis);

					this.PHONE = readString(dis);

					this.ADDRESS_LINE_1 = readString(dis);

					this.CITY = readString(dis);

					this.STATE = readString(dis);

					this.ZIP = readString(dis);

					this.COUNTRY = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.CUST_ID, dos);

				// String

				writeString(this.FULL_NAME, dos);

				// String

				writeString(this.PHONE, dos);

				// String

				writeString(this.ADDRESS_LINE_1, dos);

				// String

				writeString(this.CITY, dos);

				// String

				writeString(this.STATE, dos);

				// String

				writeString(this.ZIP, dos);

				// String

				writeString(this.COUNTRY, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CUST_ID=" + CUST_ID);
			sb.append(",FULL_NAME=" + FULL_NAME);
			sb.append(",PHONE=" + PHONE);
			sb.append(",ADDRESS_LINE_1=" + ADDRESS_LINE_1);
			sb.append(",CITY=" + CITY);
			sb.append(",STATE=" + STATE);
			sb.append(",ZIP=" + ZIP);
			sb.append(",COUNTRY=" + COUNTRY);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (CUST_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(CUST_ID);
			}

			sb.append("|");

			if (FULL_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(FULL_NAME);
			}

			sb.append("|");

			if (PHONE == null) {
				sb.append("<null>");
			} else {
				sb.append(PHONE);
			}

			sb.append("|");

			if (ADDRESS_LINE_1 == null) {
				sb.append("<null>");
			} else {
				sb.append(ADDRESS_LINE_1);
			}

			sb.append("|");

			if (CITY == null) {
				sb.append("<null>");
			} else {
				sb.append(CITY);
			}

			sb.append("|");

			if (STATE == null) {
				sb.append("<null>");
			} else {
				sb.append(STATE);
			}

			sb.append("|");

			if (ZIP == null) {
				sb.append("<null>");
			} else {
				sb.append(ZIP);
			}

			sb.append("|");

			if (COUNTRY == null) {
				sb.append("<null>");
			} else {
				sb.append(COUNTRY);
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
				 * [tFileOutputPositional_8 begin ] start
				 */

				ok_Hash.put("tFileOutputPositional_8", false);
				start_Hash.put("tFileOutputPositional_8",
						System.currentTimeMillis());

				currentComponent = "tFileOutputPositional_8";

				int tos_count_tFileOutputPositional_8 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_8 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputPositional_8 = new StringBuilder();
				log4jParamters_tFileOutputPositional_8.append("Parameters:");
				log4jParamters_tFileOutputPositional_8
						.append("USE_EXISTING_DYNAMIC" + " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"Dealer_Standard_SR_COIN.txt\"");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("ROWSEPARATOR"
						+ " = " + "\"\\r\\n\"");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("COMPRESS"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("FORMATS" + " = "
						+ "[{ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("9")
						+ ", SCHEMA_COLUMN=" + ("CUST_ID") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("60") + ", SCHEMA_COLUMN="
						+ ("FULL_NAME") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("12") + ", SCHEMA_COLUMN=" + ("PHONE")
						+ "}, {ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("120")
						+ ", SCHEMA_COLUMN=" + ("ADDRESS_LINE_1")
						+ "}, {ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("32")
						+ ", SCHEMA_COLUMN=" + ("CITY") + "}, {ALIGN="
						+ ("'L'") + ", PADDING_CHAR=" + ("' '") + ", KEEP="
						+ ("'A'") + ", SIZE=" + ("2") + ", SCHEMA_COLUMN="
						+ ("STATE") + "}, {ALIGN=" + ("'L'")
						+ ", PADDING_CHAR=" + ("' '") + ", KEEP=" + ("'A'")
						+ ", SIZE=" + ("15") + ", SCHEMA_COLUMN=" + ("ZIP")
						+ "}, {ALIGN=" + ("'L'") + ", PADDING_CHAR=" + ("' '")
						+ ", KEEP=" + ("'A'") + ", SIZE=" + ("3")
						+ ", SCHEMA_COLUMN=" + ("COUNTRY") + "}]");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("USE_BYTE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("ROW_MODE"
						+ " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8.append("ENCODING"
						+ " = " + "\"ISO-8859-15\"");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				log4jParamters_tFileOutputPositional_8
						.append("DELETE_EMPTYFILE" + " = " + "false");
				log4jParamters_tFileOutputPositional_8.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputPositional_8 - "
							+ log4jParamters_tFileOutputPositional_8);

				int nb_line_tFileOutputPositional_8 = 0;

				class PositionUtil_tFileOutputPositional_8 {

					void setValue_0(final row1Struct row1,
							StringBuilder sb_tFileOutputPositional_8,
							String tempStringMtFileOutputPositional_8,
							int tempLengthMtFileOutputPositional_8)
							throws IOException,
							java.io.UnsupportedEncodingException {
						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.CUST_ID == null) ? ""
								: row1.CUST_ID;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 9) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 9) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 9 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.FULL_NAME == null) ? ""
								: row1.FULL_NAME;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 60) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 60) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 60 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.PHONE == null) ? ""
								: row1.PHONE;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 12) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 12) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 12 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.ADDRESS_LINE_1 == null) ? ""
								: row1.ADDRESS_LINE_1;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 120) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 120) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 120 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.CITY == null) ? ""
								: row1.CITY;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 32) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 32) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 32 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.STATE == null) ? ""
								: row1.STATE;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 2) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 2) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 2 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.ZIP == null) ? ""
								: row1.ZIP;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 15) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 15) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 15 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

						// get and format output String begin
						tempStringMtFileOutputPositional_8 = (row1.COUNTRY == null) ? ""
								: row1.COUNTRY;

						tempLengthMtFileOutputPositional_8 = tempStringMtFileOutputPositional_8
								.length();

						if (tempLengthMtFileOutputPositional_8 >= 3) {
							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
						} else if (tempLengthMtFileOutputPositional_8 < 3) {

							sb_tFileOutputPositional_8
									.append(tempStringMtFileOutputPositional_8);
							for (int i_tFileOutputPositional_8 = 0; i_tFileOutputPositional_8 < 3 - tempLengthMtFileOutputPositional_8; i_tFileOutputPositional_8++) {
								sb_tFileOutputPositional_8.append(' ');
							}

						}
						// get and format output String end

					}

				}

				PositionUtil_tFileOutputPositional_8 positionUtil_tFileOutputPositional_8 = new PositionUtil_tFileOutputPositional_8();

				String fileNewName_tFileOutputPositional_8 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Dealer_Standard_SR_COIN.txt";
				java.io.File createFiletFileOutputPositional_8 = new java.io.File(
						fileNewName_tFileOutputPositional_8);
				boolean isFileGenerated_tFileOutputPositional_8 = true;
				// create directory only if not exists
				java.io.File parentFile_tFileOutputPositional_8 = createFiletFileOutputPositional_8
						.getParentFile();
				if (parentFile_tFileOutputPositional_8 != null
						&& !parentFile_tFileOutputPositional_8.exists()) {
					parentFile_tFileOutputPositional_8.mkdirs();
				}
				final java.io.BufferedWriter outtFileOutputPositional_8 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileNewName_tFileOutputPositional_8,
										false), "ISO-8859-15"));

				/**
				 * [tFileOutputPositional_8 begin ] stop
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
								+ "\"SELECT               CUST_ID,              CUST_FULL_NM AS FULL_NAME,              CUST_PH AS PHONE,              CUST_ADDR_LINE AS ADDRESS_LINE_1,              CUST_CITY AS CITY,              CUST_STATE AS STATE,              CUST_ZIP AS ZIP,              CUST_COUNTRY AS COUNTRY                              FROM FCA_SR_OWNER.FCA_VIN_FYR_SVC_RETENTION  WHERE RPT_DT = TO_DATE(\" + context.reportMonth + \",'YYYYMM')\"    ");
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
						+ ("CUST_ID") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("FULL_NAME") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("PHONE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ADDRESS_LINE_1") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("CITY") + "}, {TRIM="
						+ ("false") + ", SCHEMA_COLUMN=" + ("STATE")
						+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
						+ ("ZIP") + "}, {TRIM=" + ("false")
						+ ", SCHEMA_COLUMN=" + ("COUNTRY") + "}]");
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

				String dbquery_tOracleInput_2 = "SELECT \n            CUST_ID,\n            CUST_FULL_NM AS FULL_NAME,\n            CUST_PH AS PHONE,\n            CUST_ADDR_LINE AS ADDRESS_LINE_1,\n            CUST_CITY AS CITY,\n            CUST_STATE AS STATE,\n            CUST_ZIP AS ZIP,\n            CUST_COUNTRY AS COUNTRY\n            \n            \nFROM FCA_SR_OWNER.FCA_VIN_FYR_SVC_RETENTION\nWHERE RPT_DT = TO_DATE("
						+ context.reportMonth + ",'YYYYMM')"

				;

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
							row1.CUST_ID = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(1);
							if (tmpContent_tOracleInput_2 != null) {
								row1.CUST_ID = tmpContent_tOracleInput_2;
							} else {
								row1.CUST_ID = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 2) {
							row1.FULL_NAME = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(2);
							if (tmpContent_tOracleInput_2 != null) {
								row1.FULL_NAME = tmpContent_tOracleInput_2;
							} else {
								row1.FULL_NAME = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 3) {
							row1.PHONE = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(3);
							if (tmpContent_tOracleInput_2 != null) {
								row1.PHONE = tmpContent_tOracleInput_2;
							} else {
								row1.PHONE = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 4) {
							row1.ADDRESS_LINE_1 = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(4);
							if (tmpContent_tOracleInput_2 != null) {
								row1.ADDRESS_LINE_1 = tmpContent_tOracleInput_2;
							} else {
								row1.ADDRESS_LINE_1 = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 5) {
							row1.CITY = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(5);
							if (tmpContent_tOracleInput_2 != null) {
								row1.CITY = tmpContent_tOracleInput_2;
							} else {
								row1.CITY = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 6) {
							row1.STATE = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(6);
							if (tmpContent_tOracleInput_2 != null) {
								row1.STATE = tmpContent_tOracleInput_2;
							} else {
								row1.STATE = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 7) {
							row1.ZIP = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(7);
							if (tmpContent_tOracleInput_2 != null) {
								row1.ZIP = tmpContent_tOracleInput_2;
							} else {
								row1.ZIP = null;
							}
						}
						if (colQtyInRs_tOracleInput_2 < 8) {
							row1.COUNTRY = null;
						} else {

							tmpContent_tOracleInput_2 = rs_tOracleInput_2
									.getString(8);
							if (tmpContent_tOracleInput_2 != null) {
								row1.COUNTRY = tmpContent_tOracleInput_2;
							} else {
								row1.COUNTRY = null;
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
						 * [tFileOutputPositional_8 main ] start
						 */

						currentComponent = "tFileOutputPositional_8";

						if (log.isTraceEnabled()) {
							log.trace("row1 - "
									+ (row1 == null ? "" : row1.toLogString()));
						}

						String tempStringMtFileOutputPositional_8 = null;

						int tempLengthMtFileOutputPositional_8 = 0;

						StringBuilder sb_tFileOutputPositional_8 = new StringBuilder();
						positionUtil_tFileOutputPositional_8.setValue_0(row1,
								sb_tFileOutputPositional_8,
								tempStringMtFileOutputPositional_8,
								tempLengthMtFileOutputPositional_8);
						sb_tFileOutputPositional_8.append("\r\n");

						synchronized (multiThreadLockWrite) {

							outtFileOutputPositional_8
									.write(sb_tFileOutputPositional_8
											.toString());

						}

						nb_line_tFileOutputPositional_8++;
						log.debug("tFileOutputPositional_8 - Writing the record "
								+ nb_line_tFileOutputPositional_8
								+ " to the file.");

						tos_count_tFileOutputPositional_8++;

						/**
						 * [tFileOutputPositional_8 main ] stop
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
				 * [tFileOutputPositional_8 end ] start
				 */

				currentComponent = "tFileOutputPositional_8";

				synchronized (multiThreadLockWrite) {
					outtFileOutputPositional_8.close();
				}
				globalMap.put("tFileOutputPositional_8_NB_LINE",
						nb_line_tFileOutputPositional_8);
				log.info("tFileOutputPositional_8 - Written records count: "
						+ nb_line_tFileOutputPositional_8 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputPositional_8 - " + "Done.");

				ok_Hash.put("tFileOutputPositional_8", true);
				end_Hash.put("tFileOutputPositional_8",
						System.currentTimeMillis());

				tFileList_1Process(globalMap);

				/**
				 * [tFileOutputPositional_8 end ] stop
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
				 * [tFileOutputPositional_8 finally ] start
				 */

				currentComponent = "tFileOutputPositional_8";

				/**
				 * [tFileOutputPositional_8 finally ] stop
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

				int NB_ITERATE_tJava_2 = 0; // for statistics

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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash");
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
						+ "[{FILEMASK=" + ("\"Dealer_Standard_SR_COIN.txt\"")
						+ "}]");
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

				String directory_tFileList_1 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
				final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_1.add("Dealer_Standard_SR_COIN.txt");
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
					NB_ITERATE_tJava_2++;

					/**
					 * [tJava_2 begin ] start
					 */

					int NB_ITERATE_tJava_1 = 0; // for statistics

					ok_Hash.put("tJava_2", false);
					start_Hash.put("tJava_2", System.currentTimeMillis());

					currentComponent = "tJava_2";

					int tos_count_tJava_2 = 0;

					context.pgpFileName = (String) globalMap
							.get("tFileList_1_CURRENT_FILE");
					System.out.println("Encrypting File: "
							+ context.pgpFileName);

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
					NB_ITERATE_tJava_1++;

					/**
					 * [tJava_1 begin ] start
					 */

					ok_Hash.put("tJava_1", false);
					start_Hash.put("tJava_1", System.currentTimeMillis());

					currentComponent = "tJava_1";

					int tos_count_tJava_1 = 0;

					String baseGpg = "gpg --batch --yes --always-trust -r "
							+ context.pgpKeyRecipient + " -a -e ";
					String fileName = context.shipping + context.slash
							+ context.reportYear + context.mDrive
							+ context.slash + context.client + context.slash
							+ context.jobNumber + context.slash
							+ context.reportMonth + context.slash
							+ context.pgpFileName;
					String gpgCmd = baseGpg + fileName;
					String cmdSet = gpgCmd;
					globalMap.put("gpgCmd", cmdSet);

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

					/**
					 * [tJava_1 end ] start
					 */

					currentComponent = "tJava_1";

					ok_Hash.put("tJava_1", true);
					end_Hash.put("tJava_1", System.currentTimeMillis());

					tSystem_2Process(globalMap);

					/**
					 * [tJava_1 end ] stop
					 */

					/**
					 * [tJava_2 end ] start
					 */

					currentComponent = "tJava_2";

					ok_Hash.put("tJava_2", true);
					end_Hash.put("tJava_2", System.currentTimeMillis());

					/**
					 * [tJava_2 end ] stop
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
				 * [tJava_2 finally ] start
				 */

				currentComponent = "tJava_2";

				/**
				 * [tJava_2 finally ] stop
				 */

				/**
				 * [tJava_1 finally ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 finally ] stop
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

	public void tSystem_2Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tSystem_2_SUBPROCESS_STATE", 0);

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
				 * [tSystem_2 begin ] start
				 */

				ok_Hash.put("tSystem_2", false);
				start_Hash.put("tSystem_2", System.currentTimeMillis());

				currentComponent = "tSystem_2";

				int tos_count_tSystem_2 = 0;

				if (log.isInfoEnabled())
					log.info("tSystem_2 - " + "Start to work.");
				StringBuilder log4jParamters_tSystem_2 = new StringBuilder();
				log4jParamters_tSystem_2.append("Parameters:");
				log4jParamters_tSystem_2.append("ROOTDIR" + " = " + "false");
				log4jParamters_tSystem_2.append(" | ");
				log4jParamters_tSystem_2.append("USE_SINGLE_COMMAND" + " = "
						+ "true");
				log4jParamters_tSystem_2.append(" | ");
				log4jParamters_tSystem_2
						.append("COMMAND"
								+ " = "
								+ "new String[]{\"/bin/bash\",\"-c\", ((String)globalMap.get(\"gpgCmd\"))}");
				log4jParamters_tSystem_2.append(" | ");
				log4jParamters_tSystem_2.append("USE_ARRAY_COMMAND" + " = "
						+ "false");
				log4jParamters_tSystem_2.append(" | ");
				log4jParamters_tSystem_2.append("OUTPUT" + " = "
						+ "OUTPUT_TO_CONSOLE");
				log4jParamters_tSystem_2.append(" | ");
				log4jParamters_tSystem_2.append("ERROROUTPUT" + " = "
						+ "OUTPUT_TO_CONSOLE");
				log4jParamters_tSystem_2.append(" | ");
				log4jParamters_tSystem_2.append("PARAMS" + " = " + "[{VALUE="
						+ ("\"/polk/app/tomcat\"") + ", NAME=" + ("\"HOME\"")
						+ "}]");
				log4jParamters_tSystem_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSystem_2 - " + log4jParamters_tSystem_2);

				Runtime runtime_tSystem_2 = Runtime.getRuntime();

				String[] env_tSystem_2 = null;
				java.util.Map<String, String> envMap_tSystem_2 = System
						.getenv();
				java.util.Map<String, String> envMapClone_tSystem_2 = new java.util.HashMap();
				envMapClone_tSystem_2.putAll(envMap_tSystem_2);

				log.info("tSystem_2 - Setting the parameters.");
				log.debug("tSystem_2 - Parameter " + (1) + ": Key='" + "HOME"
						+ "', Value='" + "/polk/app/tomcat" + "'.");
				envMapClone_tSystem_2.put("HOME", "/polk/app/tomcat");
				env_tSystem_2 = new String[envMapClone_tSystem_2.size()];
				int i_tSystem_2 = 0;
				for (String envKey : (java.util.Set<String>) envMapClone_tSystem_2
						.keySet()) {
					env_tSystem_2[i_tSystem_2++] = envKey + "="
							+ envMapClone_tSystem_2.get(envKey);
				}
				final Process ps_tSystem_2 = runtime_tSystem_2.exec(
						new String[] { "/bin/bash", "-c",
								((String) globalMap.get("gpgCmd")) },
						env_tSystem_2);

				globalMap.remove("tSystem_2_OUTPUT");
				globalMap.remove("tSystem_2_ERROROUTPUT");

				Thread normal_tSystem_2 = new Thread() {
					public void run() {
						try {
							java.io.BufferedReader reader = new java.io.BufferedReader(
									new java.io.InputStreamReader(
											ps_tSystem_2.getInputStream()));
							String line = "";
							try {
								while ((line = reader.readLine()) != null) {

									log.debug("tSystem_2 - Sending the standard output to the console.");

									System.out.println(line);
								}
							} finally {
								reader.close();
							}
						} catch (java.io.IOException ioe) {

							log.error("tSystem_2 - " + ioe.getMessage());

							ioe.printStackTrace();
						}
					}
				};
				log.info("tSystem_2 - Executing the command.");
				log.info("tSystem_2 - Command to execute: '"
						+ new String[] { "/bin/bash", "-c",
								((String) globalMap.get("gpgCmd")) } + "'.");
				normal_tSystem_2.start();
				log.info("tSystem_2 - The command has been executed successfully.");

				Thread error_tSystem_2 = new Thread() {
					public void run() {
						try {
							java.io.BufferedReader reader = new java.io.BufferedReader(
									new java.io.InputStreamReader(
											ps_tSystem_2.getErrorStream()));
							String line = "";
							try {
								while ((line = reader.readLine()) != null) {

									log.debug("tSystem_2 - Sending the error output to the console.");

									System.err.println(line);
								}
							} finally {
								reader.close();
							}
						} catch (java.io.IOException ioe) {

							log.error("tSystem_2 - " + ioe.getMessage());

							ioe.printStackTrace();
						}
					}
				};
				error_tSystem_2.start();
				if (ps_tSystem_2.getOutputStream() != null) {
					ps_tSystem_2.getOutputStream().close();
				}
				ps_tSystem_2.waitFor();
				normal_tSystem_2.join(10000);
				error_tSystem_2.join(10000);

				/**
				 * [tSystem_2 begin ] stop
				 */

				/**
				 * [tSystem_2 main ] start
				 */

				currentComponent = "tSystem_2";

				tos_count_tSystem_2++;

				/**
				 * [tSystem_2 main ] stop
				 */

				/**
				 * [tSystem_2 end ] start
				 */

				currentComponent = "tSystem_2";

				globalMap.put("tSystem_2_EXIT_VALUE", ps_tSystem_2.exitValue());

				if (log.isInfoEnabled())
					log.info("tSystem_2 - " + "Done.");

				ok_Hash.put("tSystem_2", true);
				end_Hash.put("tSystem_2", System.currentTimeMillis());

				/**
				 * [tSystem_2 end ] stop
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
				 * [tSystem_2 finally ] start
				 */

				currentComponent = "tSystem_2";

				/**
				 * [tSystem_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSystem_2_SUBPROCESS_STATE", 1);
	}

	public void tJava_9Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tJava_9_SUBPROCESS_STATE", 0);

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
				 * [tJava_9 begin ] start
				 */

				ok_Hash.put("tJava_9", false);
				start_Hash.put("tJava_9", System.currentTimeMillis());

				currentComponent = "tJava_9";

				int tos_count_tJava_9 = 0;

				System.out.println("Post Job Running...");

				/**
				 * [tJava_9 begin ] stop
				 */

				/**
				 * [tJava_9 main ] start
				 */

				currentComponent = "tJava_9";

				tos_count_tJava_9++;

				/**
				 * [tJava_9 main ] stop
				 */

				/**
				 * [tJava_9 end ] start
				 */

				currentComponent = "tJava_9";

				ok_Hash.put("tJava_9", true);
				end_Hash.put("tJava_9", System.currentTimeMillis());

				tFileCopy_1Process(globalMap);

				/**
				 * [tJava_9 end ] stop
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
				 * [tJava_9 finally ] start
				 */

				currentComponent = "tJava_9";

				/**
				 * [tJava_9 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tJava_9_SUBPROCESS_STATE", 1);
	}

	public void tFileCopy_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileCopy_1_SUBPROCESS_STATE", 0);

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
				 * [tFileCopy_1 begin ] start
				 */

				ok_Hash.put("tFileCopy_1", false);
				start_Hash.put("tFileCopy_1", System.currentTimeMillis());

				currentComponent = "tFileCopy_1";

				int tos_count_tFileCopy_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFileCopy_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFileCopy_1 = new StringBuilder();
				log4jParamters_tFileCopy_1.append("Parameters:");
				log4jParamters_tFileCopy_1
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash  + \"Dealer_Standard_SR_COIN.txt.asc\"");
				log4jParamters_tFileCopy_1.append(" | ");
				log4jParamters_tFileCopy_1.append("ENABLE_COPY_DIRECTORY"
						+ " = " + "false");
				log4jParamters_tFileCopy_1.append(" | ");
				log4jParamters_tFileCopy_1
						.append("DESTINATION"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash");
				log4jParamters_tFileCopy_1.append(" | ");
				log4jParamters_tFileCopy_1.append("RENAME" + " = " + "true");
				log4jParamters_tFileCopy_1.append(" | ");
				log4jParamters_tFileCopy_1.append("DESTINATION_RENAME" + " = "
						+ "\"Dealer_Standard_SR_COIN.txt.pgp\"");
				log4jParamters_tFileCopy_1.append(" | ");
				log4jParamters_tFileCopy_1.append("REMOVE_FILE" + " = "
						+ "true");
				log4jParamters_tFileCopy_1.append(" | ");
				log4jParamters_tFileCopy_1.append("REPLACE_FILE" + " = "
						+ "true");
				log4jParamters_tFileCopy_1.append(" | ");
				log4jParamters_tFileCopy_1.append("CREATE_DIRECTORY" + " = "
						+ "true");
				log4jParamters_tFileCopy_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileCopy_1 - " + log4jParamters_tFileCopy_1);

				/**
				 * [tFileCopy_1 begin ] stop
				 */

				/**
				 * [tFileCopy_1 main ] start
				 */

				currentComponent = "tFileCopy_1";

				final StringBuffer log4jSb_tFileCopy_1 = new StringBuffer();

				String srcFileName_tFileCopy_1 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash
						+ "Dealer_Standard_SR_COIN.txt.asc";

				java.io.File srcFile_tFileCopy_1 = new java.io.File(
						srcFileName_tFileCopy_1);

				// here need check first, before mkdirs().
				if (!srcFile_tFileCopy_1.exists()
						|| !srcFile_tFileCopy_1.isFile()) {
					throw new RuntimeException("The source File \""
							+ srcFileName_tFileCopy_1
							+ "\" does not exist or is not a file.");
				}

				String desDirName_tFileCopy_1 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash;

				String desFileName_tFileCopy_1 = "Dealer_Standard_SR_COIN.txt.pgp";

				if (desFileName_tFileCopy_1 != null
						&& ("").equals(desFileName_tFileCopy_1.trim())) {
					desFileName_tFileCopy_1 = "NewName.temp";
				}

				java.io.File desFile_tFileCopy_1 = new java.io.File(
						desDirName_tFileCopy_1, desFileName_tFileCopy_1);

				if (!srcFile_tFileCopy_1.getPath().equals(
						desFile_tFileCopy_1.getPath())) {
					java.io.File parentFile_tFileCopy_1 = desFile_tFileCopy_1
							.getParentFile();

					if (parentFile_tFileCopy_1 != null
							&& !parentFile_tFileCopy_1.exists()) {
						parentFile_tFileCopy_1.mkdirs();
					}
					org.talend.FileCopy.copyFile(srcFile_tFileCopy_1.getPath(),
							desFile_tFileCopy_1.getPath(), true);
					java.io.File isRemoved_tFileCopy_1 = new java.io.File(
							context.shipping + context.slash
									+ context.reportYear + context.mDrive
									+ context.slash + context.client
									+ context.slash + context.jobNumber
									+ context.slash + context.reportMonth
									+ context.slash
									+ "Dealer_Standard_SR_COIN.txt.asc");
					if (isRemoved_tFileCopy_1.exists()) {
						log.error("tFileCopy_1 - The source file \""
								+ srcFileName_tFileCopy_1
								+ "\" could not be removed from the folder because it is open or you only have read-only rights.");
						System.err
								.println("The source file could not be removed from the folder because it is open or you only have read-only rights.\n");
					} else {
						log.info("tFileCopy_1 - The source file \""
								+ srcFileName_tFileCopy_1 + "\" is deleted.");
					}

				}
				globalMap.put("tFileCopy_1_DESTINATION_FILEPATH",
						desFile_tFileCopy_1.getPath());
				globalMap.put("tFileCopy_1_DESTINATION_FILENAME",
						desFile_tFileCopy_1.getName());

				globalMap.put("tFileCopy_1_SOURCE_DIRECTORY",
						srcFile_tFileCopy_1.getParent());
				globalMap.put("tFileCopy_1_DESTINATION_DIRECTORY",
						desFile_tFileCopy_1.getParent());

				tos_count_tFileCopy_1++;

				/**
				 * [tFileCopy_1 main ] stop
				 */

				/**
				 * [tFileCopy_1 end ] start
				 */

				currentComponent = "tFileCopy_1";

				if (log.isInfoEnabled())
					log.info("tFileCopy_1 - " + "Done.");

				ok_Hash.put("tFileCopy_1", true);
				end_Hash.put("tFileCopy_1", System.currentTimeMillis());

				tFileList_5Process(globalMap);

				/**
				 * [tFileCopy_1 end ] stop
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
				 * [tFileCopy_1 finally ] start
				 */

				currentComponent = "tFileCopy_1";

				/**
				 * [tFileCopy_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileCopy_1_SUBPROCESS_STATE", 1);
	}

	public void tFileList_5Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_5_SUBPROCESS_STATE", 0);

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
				 * [tFileList_5 begin ] start
				 */

				int NB_ITERATE_tCreateTemporaryFile_1 = 0; // for statistics

				ok_Hash.put("tFileList_5", false);
				start_Hash.put("tFileList_5", System.currentTimeMillis());

				currentComponent = "tFileList_5";

				int tos_count_tFileList_5 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_5 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_5 = new StringBuilder();
				log4jParamters_tFileList_5.append("Parameters:");
				log4jParamters_tFileList_5
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5
						.append("LIST_MODE" + " = " + "FILES");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}]");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("IFEXCLUDE" + " = " + "true");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("EXCLUDEFILEMASK" + " = "
						+ "\"*.asc\"");
				log4jParamters_tFileList_5.append(" | ");
				log4jParamters_tFileList_5.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_5.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_5 - " + log4jParamters_tFileList_5);

				final StringBuffer log4jSb_tFileList_5 = new StringBuffer();

				String directory_tFileList_5 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
				final java.util.List<String> maskList_tFileList_5 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_5 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_5.add("*.txt");
				for (final String filemask_tFileList_5 : maskList_tFileList_5) {
					String filemask_compile_tFileList_5 = filemask_tFileList_5;

					filemask_compile_tFileList_5 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_5.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_5 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_5);
					patternList_tFileList_5.add(fileNamePattern_tFileList_5);
				}
				int NB_FILEtFileList_5 = 0;

				final boolean case_sensitive_tFileList_5 = true;
				String excludefilemask_tFileList_5 = "*.asc";
				final List<java.util.regex.Pattern> excludefileNameEachPattern_tFileList_5 = new java.util.ArrayList<java.util.regex.Pattern>();
				if (excludefilemask_tFileList_5 != null
						&& !"".equals(excludefilemask_tFileList_5)) {
					for (String excludefilemaskEach_tFileList_5 : excludefilemask_tFileList_5
							.split(",")) {

						excludefilemaskEach_tFileList_5 = org.apache.oro.text.GlobCompiler
								.globToPerl5(
										excludefilemaskEach_tFileList_5
												.toCharArray(),
										org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						excludefileNameEachPattern_tFileList_5
								.add(java.util.regex.Pattern
										.compile(excludefilemaskEach_tFileList_5));

					}
				}
				final java.util.List<java.io.File> list_tFileList_5 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_5 = new java.util.HashSet<String>();
				java.io.File file_tFileList_5 = new java.io.File(
						directory_tFileList_5);

				file_tFileList_5.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_5 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_5 : patternList_tFileList_5) {
								if (fileNamePattern_tFileList_5.matcher(
										fileName_tFileList_5).matches()) {
									boolean isExclude_tFileList_5 = false;
									for (java.util.regex.Pattern pattern : excludefileNameEachPattern_tFileList_5) {
										if (pattern.matcher(
												fileName_tFileList_5).matches()) {
											isExclude_tFileList_5 = true;
											break;
										}
									}
									if (!isExclude_tFileList_5
											&& !filePath_tFileList_5
													.contains(file
															.getAbsolutePath())) {
										list_tFileList_5.add(file);
										filePath_tFileList_5.add(file
												.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_5);

				log.info("tFileList_5 - Start to list files");

				for (int i_tFileList_5 = 0; i_tFileList_5 < list_tFileList_5
						.size(); i_tFileList_5++) {
					java.io.File files_tFileList_5 = list_tFileList_5
							.get(i_tFileList_5);
					String fileName_tFileList_5 = files_tFileList_5.getName();

					String currentFileName_tFileList_5 = files_tFileList_5
							.getName();
					String currentFilePath_tFileList_5 = files_tFileList_5
							.getAbsolutePath();
					String currentFileDirectory_tFileList_5 = files_tFileList_5
							.getParent();
					String currentFileExtension_tFileList_5 = null;

					if (files_tFileList_5.getName().contains(".")
							&& files_tFileList_5.isFile()) {
						currentFileExtension_tFileList_5 = files_tFileList_5
								.getName().substring(
										files_tFileList_5.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_5 = "";
					}

					NB_FILEtFileList_5++;
					globalMap.put("tFileList_5_CURRENT_FILE",
							currentFileName_tFileList_5);
					globalMap.put("tFileList_5_CURRENT_FILEPATH",
							currentFilePath_tFileList_5);
					globalMap.put("tFileList_5_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_5);
					globalMap.put("tFileList_5_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_5);
					globalMap.put("tFileList_5_NB_FILE", NB_FILEtFileList_5);

					log.info("tFileList_5 - Current file or directory path : "
							+ currentFilePath_tFileList_5);

					/**
					 * [tFileList_5 begin ] stop
					 */

					/**
					 * [tFileList_5 main ] start
					 */

					currentComponent = "tFileList_5";

					tos_count_tFileList_5++;

					/**
					 * [tFileList_5 main ] stop
					 */
					NB_ITERATE_tCreateTemporaryFile_1++;

					/**
					 * [tCreateTemporaryFile_1 begin ] start
					 */

					ok_Hash.put("tCreateTemporaryFile_1", false);
					start_Hash.put("tCreateTemporaryFile_1",
							System.currentTimeMillis());

					currentComponent = "tCreateTemporaryFile_1";

					int tos_count_tCreateTemporaryFile_1 = 0;

					if (log.isInfoEnabled())
						log.info("tCreateTemporaryFile_1 - " + "Start to work.");
					StringBuilder log4jParamters_tCreateTemporaryFile_1 = new StringBuilder();
					log4jParamters_tCreateTemporaryFile_1.append("Parameters:");
					log4jParamters_tCreateTemporaryFile_1.append("REMOVE"
							+ " = " + "false");
					log4jParamters_tCreateTemporaryFile_1.append(" | ");
					log4jParamters_tCreateTemporaryFile_1
							.append("USE_DEFAULT_DIR" + " = " + "false");
					log4jParamters_tCreateTemporaryFile_1.append(" | ");
					log4jParamters_tCreateTemporaryFile_1
							.append("DIRECTORY"
									+ " = "
									+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash");
					log4jParamters_tCreateTemporaryFile_1.append(" | ");
					log4jParamters_tCreateTemporaryFile_1
							.append("TEMPLATE"
									+ " = "
									+ "((String)globalMap.get(\"tFileList_5_CURRENT_FILE\")).substring(0,((String)globalMap.get(\"tFileList_5_CURRENT_FILE\")).length()-((String)globalMap.get(\"tFileList_5_CURRENT_FILEEXTENSION\")).length()-1)");
					log4jParamters_tCreateTemporaryFile_1.append(" | ");
					log4jParamters_tCreateTemporaryFile_1.append("SUFFIX"
							+ " = " + "\"DONE\"");
					log4jParamters_tCreateTemporaryFile_1.append(" | ");
					if (log.isDebugEnabled())
						log.debug("tCreateTemporaryFile_1 - "
								+ log4jParamters_tCreateTemporaryFile_1);

					final StringBuffer log4jSb_tCreateTemporaryFile_1 = new StringBuffer();

					java.io.File dir_tCreateTemporaryFile_1 = new java.io.File(
							context.shipping + context.slash
									+ context.reportYear + context.mDrive
									+ context.slash + context.client
									+ context.slash + context.jobNumber
									+ context.slash + context.reportMonth
									+ context.slash);
					dir_tCreateTemporaryFile_1.mkdirs();
					String name_tCreateTemporaryFile_1 = ((String) globalMap
							.get("tFileList_5_CURRENT_FILE"))
							.substring(
									0,
									((String) globalMap
											.get("tFileList_5_CURRENT_FILE"))
											.length()
											- ((String) globalMap
													.get("tFileList_5_CURRENT_FILEEXTENSION"))
													.length() - 1).replaceAll(
									"XXXX",
									routines.TalendString.getAsciiRandomString(
											4).toUpperCase());
					String suffix_tCreateTemporaryFile_1 = ("DONE".replaceAll(
							"\\.", "").length() == 0) ? "tmp" : "DONE"
							.replaceAll("\\.", "");
					java.io.File file_tCreateTemporaryFile_1 = new java.io.File(
							dir_tCreateTemporaryFile_1,
							name_tCreateTemporaryFile_1 + "."
									+ suffix_tCreateTemporaryFile_1);
					if (file_tCreateTemporaryFile_1.createNewFile()) {
					}
					globalMap.put("tCreateTemporaryFile_1_FILEPATH",
							file_tCreateTemporaryFile_1.getCanonicalPath());

					log.info("tCreateTemporaryFile_1 - tmp file path : "
							+ file_tCreateTemporaryFile_1.getCanonicalPath()
							+ ".");

					/**
					 * [tCreateTemporaryFile_1 begin ] stop
					 */

					/**
					 * [tCreateTemporaryFile_1 main ] start
					 */

					currentComponent = "tCreateTemporaryFile_1";

					tos_count_tCreateTemporaryFile_1++;

					/**
					 * [tCreateTemporaryFile_1 main ] stop
					 */

					/**
					 * [tCreateTemporaryFile_1 end ] start
					 */

					currentComponent = "tCreateTemporaryFile_1";

					if (log.isInfoEnabled())
						log.info("tCreateTemporaryFile_1 - " + "Done.");

					ok_Hash.put("tCreateTemporaryFile_1", true);
					end_Hash.put("tCreateTemporaryFile_1",
							System.currentTimeMillis());

					/**
					 * [tCreateTemporaryFile_1 end ] stop
					 */

					/**
					 * [tFileList_5 end ] start
					 */

					currentComponent = "tFileList_5";

				}
				globalMap.put("tFileList_5_NB_FILE", NB_FILEtFileList_5);

				log.info("tFileList_5 - File or directory count : "
						+ NB_FILEtFileList_5);

				if (log.isInfoEnabled())
					log.info("tFileList_5 - " + "Done.");

				ok_Hash.put("tFileList_5", true);
				end_Hash.put("tFileList_5", System.currentTimeMillis());

				if (context.shipIt.equals("Y")) {

					tFileList_9Process(globalMap);
				}

				/**
				 * [tFileList_5 end ] stop
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
				 * [tFileList_5 finally ] start
				 */

				currentComponent = "tFileList_5";

				/**
				 * [tFileList_5 finally ] stop
				 */

				/**
				 * [tCreateTemporaryFile_1 finally ] start
				 */

				currentComponent = "tCreateTemporaryFile_1";

				/**
				 * [tCreateTemporaryFile_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_5_SUBPROCESS_STATE", 1);
	}

	public void tFileList_9Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_9_SUBPROCESS_STATE", 0);

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
				 * [tFileList_9 begin ] start
				 */

				ok_Hash.put("tFileList_9", false);
				start_Hash.put("tFileList_9", System.currentTimeMillis());

				currentComponent = "tFileList_9";

				int tos_count_tFileList_9 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_9 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_9 = new StringBuilder();
				log4jParamters_tFileList_9.append("Parameters:");
				log4jParamters_tFileList_9
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9
						.append("LIST_MODE" + " = " + "FILES");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}, {FILEMASK="
						+ ("\"*.txt.pgp\"") + "}, {FILEMASK=" + ("\"*.DONE\"")
						+ "}]");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("IFEXCLUDE" + " = " + "true");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("EXCLUDEFILEMASK" + " = "
						+ "\"Dealer_Standard_SR_COIN.txt\"");
				log4jParamters_tFileList_9.append(" | ");
				log4jParamters_tFileList_9.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_9.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_9 - " + log4jParamters_tFileList_9);

				final StringBuffer log4jSb_tFileList_9 = new StringBuffer();

				String directory_tFileList_9 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth;
				final java.util.List<String> maskList_tFileList_9 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_9 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_9.add("*.txt");
				maskList_tFileList_9.add("*.txt.pgp");
				maskList_tFileList_9.add("*.DONE");
				for (final String filemask_tFileList_9 : maskList_tFileList_9) {
					String filemask_compile_tFileList_9 = filemask_tFileList_9;

					filemask_compile_tFileList_9 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_9.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_9 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_9);
					patternList_tFileList_9.add(fileNamePattern_tFileList_9);
				}
				int NB_FILEtFileList_9 = 0;

				final boolean case_sensitive_tFileList_9 = true;
				String excludefilemask_tFileList_9 = "Dealer_Standard_SR_COIN.txt";
				final List<java.util.regex.Pattern> excludefileNameEachPattern_tFileList_9 = new java.util.ArrayList<java.util.regex.Pattern>();
				if (excludefilemask_tFileList_9 != null
						&& !"".equals(excludefilemask_tFileList_9)) {
					for (String excludefilemaskEach_tFileList_9 : excludefilemask_tFileList_9
							.split(",")) {

						excludefilemaskEach_tFileList_9 = org.apache.oro.text.GlobCompiler
								.globToPerl5(
										excludefilemaskEach_tFileList_9
												.toCharArray(),
										org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						excludefileNameEachPattern_tFileList_9
								.add(java.util.regex.Pattern
										.compile(excludefilemaskEach_tFileList_9));

					}
				}
				final java.util.List<java.io.File> list_tFileList_9 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_9 = new java.util.HashSet<String>();
				java.io.File file_tFileList_9 = new java.io.File(
						directory_tFileList_9);

				file_tFileList_9.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_9 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_9 : patternList_tFileList_9) {
								if (fileNamePattern_tFileList_9.matcher(
										fileName_tFileList_9).matches()) {
									boolean isExclude_tFileList_9 = false;
									for (java.util.regex.Pattern pattern : excludefileNameEachPattern_tFileList_9) {
										if (pattern.matcher(
												fileName_tFileList_9).matches()) {
											isExclude_tFileList_9 = true;
											break;
										}
									}
									if (!isExclude_tFileList_9
											&& !filePath_tFileList_9
													.contains(file
															.getAbsolutePath())) {
										list_tFileList_9.add(file);
										filePath_tFileList_9.add(file
												.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_9);

				log.info("tFileList_9 - Start to list files");

				for (int i_tFileList_9 = 0; i_tFileList_9 < list_tFileList_9
						.size(); i_tFileList_9++) {
					java.io.File files_tFileList_9 = list_tFileList_9
							.get(i_tFileList_9);
					String fileName_tFileList_9 = files_tFileList_9.getName();

					String currentFileName_tFileList_9 = files_tFileList_9
							.getName();
					String currentFilePath_tFileList_9 = files_tFileList_9
							.getAbsolutePath();
					String currentFileDirectory_tFileList_9 = files_tFileList_9
							.getParent();
					String currentFileExtension_tFileList_9 = null;

					if (files_tFileList_9.getName().contains(".")
							&& files_tFileList_9.isFile()) {
						currentFileExtension_tFileList_9 = files_tFileList_9
								.getName().substring(
										files_tFileList_9.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_9 = "";
					}

					NB_FILEtFileList_9++;
					globalMap.put("tFileList_9_CURRENT_FILE",
							currentFileName_tFileList_9);
					globalMap.put("tFileList_9_CURRENT_FILEPATH",
							currentFilePath_tFileList_9);
					globalMap.put("tFileList_9_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_9);
					globalMap.put("tFileList_9_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_9);
					globalMap.put("tFileList_9_NB_FILE", NB_FILEtFileList_9);

					log.info("tFileList_9 - Current file or directory path : "
							+ currentFilePath_tFileList_9);

					/**
					 * [tFileList_9 begin ] stop
					 */

					/**
					 * [tFileList_9 main ] start
					 */

					currentComponent = "tFileList_9";

					tos_count_tFileList_9++;

					/**
					 * [tFileList_9 main ] stop
					 */

					/**
					 * [tFileList_9 end ] start
					 */

					currentComponent = "tFileList_9";

				}
				globalMap.put("tFileList_9_NB_FILE", NB_FILEtFileList_9);

				log.info("tFileList_9 - File or directory count : "
						+ NB_FILEtFileList_9);

				if (log.isInfoEnabled())
					log.info("tFileList_9 - " + "Done.");

				ok_Hash.put("tFileList_9", true);
				end_Hash.put("tFileList_9", System.currentTimeMillis());

				if (((Integer) globalMap.get("tFileList_9_NB_FILE")) != 16) {

					tFixedFlowInput_2Process(globalMap);
				}

				if (((Integer) globalMap.get("tFileList_9_NB_FILE")) == 16) {

					tFixedFlowInput_1Process(globalMap);
				}

				/**
				 * [tFileList_9 end ] stop
				 */
			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_9:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tFileList_10Process(globalMap);

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
				 * [tFileList_9 finally ] start
				 */

				currentComponent = "tFileList_9";

				/**
				 * [tFileList_9 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_9_SUBPROCESS_STATE", 1);
	}

	public void tFileList_10Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_10_SUBPROCESS_STATE", 0);

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
				 * [tFileList_10 begin ] start
				 */

				int NB_ITERATE_tJavaFlex_1 = 0; // for statistics

				ok_Hash.put("tFileList_10", false);
				start_Hash.put("tFileList_10", System.currentTimeMillis());

				currentComponent = "tFileList_10";

				int tos_count_tFileList_10 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_10 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_10 = new StringBuilder();
				log4jParamters_tFileList_10.append("Parameters:");
				log4jParamters_tFileList_10
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("LIST_MODE" + " = "
						+ "FILES");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}, {FILEMASK="
						+ ("\"*.txt.pgp\"") + "}]");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10
						.append("IFEXCLUDE" + " = " + "true");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("EXCLUDEFILEMASK" + " = "
						+ "\"Dealer_Standard_SR_COIN.txt\"");
				log4jParamters_tFileList_10.append(" | ");
				log4jParamters_tFileList_10.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_10.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_10 - " + log4jParamters_tFileList_10);

				final StringBuffer log4jSb_tFileList_10 = new StringBuffer();

				String directory_tFileList_10 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth;
				final java.util.List<String> maskList_tFileList_10 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_10 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_10.add("*.txt");
				maskList_tFileList_10.add("*.txt.pgp");
				for (final String filemask_tFileList_10 : maskList_tFileList_10) {
					String filemask_compile_tFileList_10 = filemask_tFileList_10;

					filemask_compile_tFileList_10 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_10.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_10 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_10);
					patternList_tFileList_10.add(fileNamePattern_tFileList_10);
				}
				int NB_FILEtFileList_10 = 0;

				final boolean case_sensitive_tFileList_10 = true;
				String excludefilemask_tFileList_10 = "Dealer_Standard_SR_COIN.txt";
				final List<java.util.regex.Pattern> excludefileNameEachPattern_tFileList_10 = new java.util.ArrayList<java.util.regex.Pattern>();
				if (excludefilemask_tFileList_10 != null
						&& !"".equals(excludefilemask_tFileList_10)) {
					for (String excludefilemaskEach_tFileList_10 : excludefilemask_tFileList_10
							.split(",")) {

						excludefilemaskEach_tFileList_10 = org.apache.oro.text.GlobCompiler
								.globToPerl5(
										excludefilemaskEach_tFileList_10
												.toCharArray(),
										org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						excludefileNameEachPattern_tFileList_10
								.add(java.util.regex.Pattern
										.compile(excludefilemaskEach_tFileList_10));

					}
				}
				final java.util.List<java.io.File> list_tFileList_10 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_10 = new java.util.HashSet<String>();
				java.io.File file_tFileList_10 = new java.io.File(
						directory_tFileList_10);

				file_tFileList_10.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_10 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_10 : patternList_tFileList_10) {
								if (fileNamePattern_tFileList_10.matcher(
										fileName_tFileList_10).matches()) {
									boolean isExclude_tFileList_10 = false;
									for (java.util.regex.Pattern pattern : excludefileNameEachPattern_tFileList_10) {
										if (pattern.matcher(
												fileName_tFileList_10)
												.matches()) {
											isExclude_tFileList_10 = true;
											break;
										}
									}
									if (!isExclude_tFileList_10
											&& !filePath_tFileList_10
													.contains(file
															.getAbsolutePath())) {
										list_tFileList_10.add(file);
										filePath_tFileList_10.add(file
												.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_10);

				log.info("tFileList_10 - Start to list files");

				for (int i_tFileList_10 = 0; i_tFileList_10 < list_tFileList_10
						.size(); i_tFileList_10++) {
					java.io.File files_tFileList_10 = list_tFileList_10
							.get(i_tFileList_10);
					String fileName_tFileList_10 = files_tFileList_10.getName();

					String currentFileName_tFileList_10 = files_tFileList_10
							.getName();
					String currentFilePath_tFileList_10 = files_tFileList_10
							.getAbsolutePath();
					String currentFileDirectory_tFileList_10 = files_tFileList_10
							.getParent();
					String currentFileExtension_tFileList_10 = null;

					if (files_tFileList_10.getName().contains(".")
							&& files_tFileList_10.isFile()) {
						currentFileExtension_tFileList_10 = files_tFileList_10
								.getName().substring(
										files_tFileList_10.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_10 = "";
					}

					NB_FILEtFileList_10++;
					globalMap.put("tFileList_10_CURRENT_FILE",
							currentFileName_tFileList_10);
					globalMap.put("tFileList_10_CURRENT_FILEPATH",
							currentFilePath_tFileList_10);
					globalMap.put("tFileList_10_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_10);
					globalMap.put("tFileList_10_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_10);
					globalMap.put("tFileList_10_NB_FILE", NB_FILEtFileList_10);

					log.info("tFileList_10 - Current file or directory path : "
							+ currentFilePath_tFileList_10);

					/**
					 * [tFileList_10 begin ] stop
					 */

					/**
					 * [tFileList_10 main ] start
					 */

					currentComponent = "tFileList_10";

					tos_count_tFileList_10++;

					/**
					 * [tFileList_10 main ] stop
					 */
					NB_ITERATE_tJavaFlex_1++;

					/**
					 * [tJavaFlex_1 begin ] start
					 */

					int NB_ITERATE_tFileRowCount_1 = 0; // for statistics

					ok_Hash.put("tJavaFlex_1", false);
					start_Hash.put("tJavaFlex_1", System.currentTimeMillis());

					currentComponent = "tJavaFlex_1";

					int tos_count_tJavaFlex_1 = 0;

					String fileName = ((String) globalMap
							.get("tFileList_10_CURRENT_FILE"));
					globalMap.put("rowcount", Integer.MAX_VALUE);

					/**
					 * [tJavaFlex_1 begin ] stop
					 */

					/**
					 * [tJavaFlex_1 main ] start
					 */

					currentComponent = "tJavaFlex_1";

					if (fileName.equals("Dealer_Retention_Stats_R1M_"
							+ context.rMonth + ".txt")) {
						globalMap.put("rowcount", 11000);
					} else if (fileName.equals("Dealer_Retention_Stats_R3M_"
							+ context.rMonth + ".txt")) {
						globalMap.put("rowcount", 11000);
					} else if (fileName.equals("Dealer_Retention_Stats_R12M_"
							+ context.rMonth + ".txt")) {
						globalMap.put("rowcount", 11000);
					} else if (fileName.equals("Dealer_Standard_FYR_Summary_"
							+ context.rMonth + ".txt")) {
						globalMap.put("rowcount", 6000);
					} else if (fileName.equals("Dealer_Standard_FYR_Detail_"
							+ context.rMonth + ".txt")) {
						globalMap.put("rowcount", 500000);
					} else if (fileName.equals("Service_Retention_1X_"
							+ context.rMonth + ".txt")) {
						globalMap.put("rowcount", 1000);
					} else if (fileName.equals("Service_Retention_2X_"
							+ context.rMonth + ".txt")) {
						globalMap.put("rowcount", 1000);
					} else if (fileName
							.equals("Dealer_Standard_SR_COIN.txt.pgp")) {
						globalMap.put("rowcount", 500000);
					}

					tos_count_tJavaFlex_1++;

					/**
					 * [tJavaFlex_1 main ] stop
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
									+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth + context.slash + ((String)globalMap.get(\"tFileList_10_CURRENT_FILE\"))");
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
							+ context.slash
							+ context.reportYear
							+ context.mDrive
							+ context.slash
							+ context.client
							+ context.slash
							+ context.jobNumber
							+ context.slash
							+ context.reportMonth
							+ context.slash
							+ ((String) globalMap
									.get("tFileList_10_CURRENT_FILE"));
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
																+ context.slash
																+ context.reportYear
																+ context.mDrive
																+ context.slash
																+ context.client
																+ context.slash
																+ context.jobNumber
																+ context.slash
																+ context.reportMonth
																+ context.slash
																+ ((String) globalMap
																		.get("tFileList_10_CURRENT_FILE")))),
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
														+ context.slash
														+ context.reportYear
														+ context.mDrive
														+ context.slash
														+ context.client
														+ context.slash
														+ context.jobNumber
														+ context.slash
														+ context.reportMonth
														+ context.slash
														+ ((String) globalMap
																.get("tFileList_10_CURRENT_FILE"))),
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
							+ context.slash
							+ context.reportYear
							+ context.mDrive
							+ context.slash
							+ context.client
							+ context.slash
							+ context.jobNumber
							+ context.slash
							+ context.reportMonth
							+ context.slash
							+ ((String) globalMap
									.get("tFileList_10_CURRENT_FILE"))
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

					if (((Integer) globalMap.get("tFileRowCount_1_COUNT")) <= ((Integer) globalMap
							.get("rowcount"))) {

						tFixedFlowInput_4Process(globalMap);
					}

					if (((Integer) globalMap.get("tFileRowCount_1_COUNT")) > ((Integer) globalMap
							.get("rowcount"))) {

						tFixedFlowInput_3Process(globalMap);
					}

					/**
					 * [tFileRowCount_1 end ] stop
					 */

					/**
					 * [tJavaFlex_1 end ] start
					 */

					currentComponent = "tJavaFlex_1";

					ok_Hash.put("tJavaFlex_1", true);
					end_Hash.put("tJavaFlex_1", System.currentTimeMillis());

					/**
					 * [tJavaFlex_1 end ] stop
					 */

					/**
					 * [tFileList_10 end ] start
					 */

					currentComponent = "tFileList_10";

				}
				globalMap.put("tFileList_10_NB_FILE", NB_FILEtFileList_10);

				log.info("tFileList_10 - File or directory count : "
						+ NB_FILEtFileList_10);

				if (log.isInfoEnabled())
					log.info("tFileList_10 - " + "Done.");

				ok_Hash.put("tFileList_10", true);
				end_Hash.put("tFileList_10", System.currentTimeMillis());

				/**
				 * [tFileList_10 end ] stop
				 */
			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_10:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tFTPConnection_1Process(globalMap);

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
				 * [tFileList_10 finally ] start
				 */

				currentComponent = "tFileList_10";

				/**
				 * [tFileList_10 finally ] stop
				 */

				/**
				 * [tJavaFlex_1 finally ] start
				 */

				currentComponent = "tJavaFlex_1";

				/**
				 * [tJavaFlex_1 finally ] stop
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

		globalMap.put("tFileList_10_SUBPROCESS_STATE", 1);
	}

	public void tFTPConnection_1Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 0);

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
				 * [tFTPConnection_1 begin ] start
				 */

				ok_Hash.put("tFTPConnection_1", false);
				start_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				currentComponent = "tFTPConnection_1";

				int tos_count_tFTPConnection_1 = 0;

				if (log.isInfoEnabled())
					log.info("tFTPConnection_1 - " + "Start to work.");
				StringBuilder log4jParamters_tFTPConnection_1 = new StringBuilder();
				log4jParamters_tFTPConnection_1.append("Parameters:");
				log4jParamters_tFTPConnection_1.append("HOST" + " = "
						+ "context.eftpHost");
				log4jParamters_tFTPConnection_1.append(" | ");
				log4jParamters_tFTPConnection_1.append("PORT" + " = " + "22");
				log4jParamters_tFTPConnection_1.append(" | ");
				log4jParamters_tFTPConnection_1.append("USER" + " = "
						+ "context.eftpUser");
				log4jParamters_tFTPConnection_1.append(" | ");
				log4jParamters_tFTPConnection_1.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.eftpPassword))
								.substring(0, 4) + "...");
				log4jParamters_tFTPConnection_1.append(" | ");
				log4jParamters_tFTPConnection_1.append("SFTP" + " = " + "true");
				log4jParamters_tFTPConnection_1.append(" | ");
				log4jParamters_tFTPConnection_1.append("AUTH_METHOD" + " = "
						+ "PASSWORD");
				log4jParamters_tFTPConnection_1.append(" | ");
				log4jParamters_tFTPConnection_1.append("USE_ENCODING" + " = "
						+ "false");
				log4jParamters_tFTPConnection_1.append(" | ");
				log4jParamters_tFTPConnection_1.append("USE_PROXY" + " = "
						+ "false");
				log4jParamters_tFTPConnection_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFTPConnection_1 - "
							+ log4jParamters_tFTPConnection_1);

				class MyUserInfo implements com.jcraft.jsch.UserInfo,
						com.jcraft.jsch.UIKeyboardInteractive {

					String decryptedPassphrase_tFTPConnection_1 = routines.system.PasswordEncryptUtil
							.decryptPassword("abf4f1fe565f5343");

					String passphrase_tFTPConnection_1 = decryptedPassphrase_tFTPConnection_1;

					public String getPassphrase() {
						return passphrase_tFTPConnection_1;
					}

					public String getPassword() {
						return null;
					}

					public boolean promptPassword(String arg0) {
						return true;
					}

					public boolean promptPassphrase(String arg0) {
						return true;
					}

					public boolean promptYesNo(String arg0) {
						return true;
					}

					public void showMessage(String arg0) {
					}

					public String[] promptKeyboardInteractive(
							String destination, String name,
							String instruction, String[] prompt, boolean[] echo) {

						final String decryptedPassword_tFTPConnection_1 = context.eftpPassword;

						String[] password_tFTPConnection_1 = { decryptedPassword_tFTPConnection_1 };
						return password_tFTPConnection_1;
					}
				}
				;
				final com.jcraft.jsch.UserInfo defaultUserInfo_tFTPConnection_1 = new MyUserInfo();
				com.jcraft.jsch.JSch jsch_tFTPConnection_1 = new com.jcraft.jsch.JSch();

				com.jcraft.jsch.Session session_tFTPConnection_1 = jsch_tFTPConnection_1
						.getSession(context.eftpUser, context.eftpHost, 22);
				session_tFTPConnection_1
						.setConfig("PreferredAuthentications",
								"publickey,password,keyboard-interactive,gssapi-with-mic");

				log.info("tFTPConnection_1 - SFTP authentication using a password.");

				final String decryptedPassword_tFTPConnection_1 = context.eftpPassword;

				session_tFTPConnection_1
						.setPassword(decryptedPassword_tFTPConnection_1);

				session_tFTPConnection_1
						.setUserInfo(defaultUserInfo_tFTPConnection_1);

				if (("true").equals(System.getProperty("http.proxySet"))) {
					com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(
							System.getProperty("http.proxyHost"),
							Integer.parseInt(System
									.getProperty("http.proxyPort")));
					if (!"".equals(System.getProperty("http.proxyUser"))) {
						proxy_tFTPConnection_1.setUserPasswd(
								System.getProperty("http.proxyUser"),
								System.getProperty("http.proxyPassword"));
					}
					session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
				}

				log.info("tFTPConnection_1 - Attempt to connect to  '"
						+ context.eftpHost + "' with username '"
						+ context.eftpUser + "'.");

				session_tFTPConnection_1.connect();
				com.jcraft.jsch.Channel channel_tFTPConnection_1 = session_tFTPConnection_1
						.openChannel("sftp");
				channel_tFTPConnection_1.connect();

				log.info("tFTPConnection_1 - Connect to '" + context.eftpHost
						+ "' has succeeded.");

				com.jcraft.jsch.ChannelSftp c_tFTPConnection_1 = (com.jcraft.jsch.ChannelSftp) channel_tFTPConnection_1;

				globalMap.put("conn_tFTPConnection_1", c_tFTPConnection_1);

				/**
				 * [tFTPConnection_1 begin ] stop
				 */

				/**
				 * [tFTPConnection_1 main ] start
				 */

				currentComponent = "tFTPConnection_1";

				tos_count_tFTPConnection_1++;

				/**
				 * [tFTPConnection_1 main ] stop
				 */

				/**
				 * [tFTPConnection_1 end ] start
				 */

				currentComponent = "tFTPConnection_1";

				if (log.isInfoEnabled())
					log.info("tFTPConnection_1 - " + "Done.");

				ok_Hash.put("tFTPConnection_1", true);
				end_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				tFTPConnection_2Process(globalMap);

				/**
				 * [tFTPConnection_1 end ] stop
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
				 * [tFTPConnection_1 finally ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 1);
	}

	public void tFTPConnection_2Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFTPConnection_2_SUBPROCESS_STATE", 0);

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
				 * [tFTPConnection_2 begin ] start
				 */

				ok_Hash.put("tFTPConnection_2", false);
				start_Hash.put("tFTPConnection_2", System.currentTimeMillis());

				currentComponent = "tFTPConnection_2";

				int tos_count_tFTPConnection_2 = 0;

				if (log.isInfoEnabled())
					log.info("tFTPConnection_2 - " + "Start to work.");
				StringBuilder log4jParamters_tFTPConnection_2 = new StringBuilder();
				log4jParamters_tFTPConnection_2.append("Parameters:");
				log4jParamters_tFTPConnection_2.append("HOST" + " = "
						+ "context.coinFTPHost");
				log4jParamters_tFTPConnection_2.append(" | ");
				log4jParamters_tFTPConnection_2.append("PORT" + " = " + "22");
				log4jParamters_tFTPConnection_2.append(" | ");
				log4jParamters_tFTPConnection_2.append("USER" + " = "
						+ "context.coinFTPUser");
				log4jParamters_tFTPConnection_2.append(" | ");
				log4jParamters_tFTPConnection_2
						.append("PASS"
								+ " = "
								+ String.valueOf(
										routines.system.PasswordEncryptUtil
												.encryptPassword(context.coinFTPPassword))
										.substring(0, 4) + "...");
				log4jParamters_tFTPConnection_2.append(" | ");
				log4jParamters_tFTPConnection_2.append("SFTP" + " = " + "true");
				log4jParamters_tFTPConnection_2.append(" | ");
				log4jParamters_tFTPConnection_2.append("AUTH_METHOD" + " = "
						+ "PASSWORD");
				log4jParamters_tFTPConnection_2.append(" | ");
				log4jParamters_tFTPConnection_2.append("USE_ENCODING" + " = "
						+ "false");
				log4jParamters_tFTPConnection_2.append(" | ");
				log4jParamters_tFTPConnection_2.append("USE_PROXY" + " = "
						+ "false");
				log4jParamters_tFTPConnection_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFTPConnection_2 - "
							+ log4jParamters_tFTPConnection_2);

				class MyUserInfo implements com.jcraft.jsch.UserInfo,
						com.jcraft.jsch.UIKeyboardInteractive {

					String decryptedPassphrase_tFTPConnection_2 = routines.system.PasswordEncryptUtil
							.decryptPassword("abf4f1fe565f5343");

					String passphrase_tFTPConnection_2 = decryptedPassphrase_tFTPConnection_2;

					public String getPassphrase() {
						return passphrase_tFTPConnection_2;
					}

					public String getPassword() {
						return null;
					}

					public boolean promptPassword(String arg0) {
						return true;
					}

					public boolean promptPassphrase(String arg0) {
						return true;
					}

					public boolean promptYesNo(String arg0) {
						return true;
					}

					public void showMessage(String arg0) {
					}

					public String[] promptKeyboardInteractive(
							String destination, String name,
							String instruction, String[] prompt, boolean[] echo) {

						final String decryptedPassword_tFTPConnection_2 = context.coinFTPPassword;

						String[] password_tFTPConnection_2 = { decryptedPassword_tFTPConnection_2 };
						return password_tFTPConnection_2;
					}
				}
				;
				final com.jcraft.jsch.UserInfo defaultUserInfo_tFTPConnection_2 = new MyUserInfo();
				com.jcraft.jsch.JSch jsch_tFTPConnection_2 = new com.jcraft.jsch.JSch();

				com.jcraft.jsch.Session session_tFTPConnection_2 = jsch_tFTPConnection_2
						.getSession(context.coinFTPUser, context.coinFTPHost,
								22);
				session_tFTPConnection_2
						.setConfig("PreferredAuthentications",
								"publickey,password,keyboard-interactive,gssapi-with-mic");

				log.info("tFTPConnection_2 - SFTP authentication using a password.");

				final String decryptedPassword_tFTPConnection_2 = context.coinFTPPassword;

				session_tFTPConnection_2
						.setPassword(decryptedPassword_tFTPConnection_2);

				session_tFTPConnection_2
						.setUserInfo(defaultUserInfo_tFTPConnection_2);

				if (("true").equals(System.getProperty("http.proxySet"))) {
					com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_2 = new com.jcraft.jsch.ProxyHTTP(
							System.getProperty("http.proxyHost"),
							Integer.parseInt(System
									.getProperty("http.proxyPort")));
					if (!"".equals(System.getProperty("http.proxyUser"))) {
						proxy_tFTPConnection_2.setUserPasswd(
								System.getProperty("http.proxyUser"),
								System.getProperty("http.proxyPassword"));
					}
					session_tFTPConnection_2.setProxy(proxy_tFTPConnection_2);
				}

				log.info("tFTPConnection_2 - Attempt to connect to  '"
						+ context.coinFTPHost + "' with username '"
						+ context.coinFTPUser + "'.");

				session_tFTPConnection_2.connect();
				com.jcraft.jsch.Channel channel_tFTPConnection_2 = session_tFTPConnection_2
						.openChannel("sftp");
				channel_tFTPConnection_2.connect();

				log.info("tFTPConnection_2 - Connect to '"
						+ context.coinFTPHost + "' has succeeded.");

				com.jcraft.jsch.ChannelSftp c_tFTPConnection_2 = (com.jcraft.jsch.ChannelSftp) channel_tFTPConnection_2;

				globalMap.put("conn_tFTPConnection_2", c_tFTPConnection_2);

				/**
				 * [tFTPConnection_2 begin ] stop
				 */

				/**
				 * [tFTPConnection_2 main ] start
				 */

				currentComponent = "tFTPConnection_2";

				tos_count_tFTPConnection_2++;

				/**
				 * [tFTPConnection_2 main ] stop
				 */

				/**
				 * [tFTPConnection_2 end ] start
				 */

				currentComponent = "tFTPConnection_2";

				if (log.isInfoEnabled())
					log.info("tFTPConnection_2 - " + "Done.");

				ok_Hash.put("tFTPConnection_2", true);
				end_Hash.put("tFTPConnection_2", System.currentTimeMillis());

				tFileList_2Process(globalMap);

				/**
				 * [tFTPConnection_2 end ] stop
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
				 * [tFTPConnection_2 finally ] start
				 */

				currentComponent = "tFTPConnection_2";

				/**
				 * [tFTPConnection_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPConnection_2_SUBPROCESS_STATE", 1);
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

				int NB_ITERATE_tFTPPut_1 = 0; // for statistics

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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
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
				log4jParamters_tFileList_2.append("IFEXCLUDE" + " = " + "true");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("EXCLUDEFILEMASK" + " = "
						+ "\"Dealer_Standard_SR_COIN.txt\"");
				log4jParamters_tFileList_2.append(" | ");
				log4jParamters_tFileList_2.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_2 - " + log4jParamters_tFileList_2);

				final StringBuffer log4jSb_tFileList_2 = new StringBuffer();

				String directory_tFileList_2 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
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
				String excludefilemask_tFileList_2 = "Dealer_Standard_SR_COIN.txt";
				final List<java.util.regex.Pattern> excludefileNameEachPattern_tFileList_2 = new java.util.ArrayList<java.util.regex.Pattern>();
				if (excludefilemask_tFileList_2 != null
						&& !"".equals(excludefilemask_tFileList_2)) {
					for (String excludefilemaskEach_tFileList_2 : excludefilemask_tFileList_2
							.split(",")) {

						excludefilemaskEach_tFileList_2 = org.apache.oro.text.GlobCompiler
								.globToPerl5(
										excludefilemaskEach_tFileList_2
												.toCharArray(),
										org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						excludefileNameEachPattern_tFileList_2
								.add(java.util.regex.Pattern
										.compile(excludefilemaskEach_tFileList_2));

					}
				}
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
									boolean isExclude_tFileList_2 = false;
									for (java.util.regex.Pattern pattern : excludefileNameEachPattern_tFileList_2) {
										if (pattern.matcher(
												fileName_tFileList_2).matches()) {
											isExclude_tFileList_2 = true;
											break;
										}
									}
									if (!isExclude_tFileList_2
											&& !filePath_tFileList_2
													.contains(file
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
					NB_ITERATE_tFTPPut_1++;

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
							+ " = " + "true");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1.append("CONNECTION" + " = "
							+ "tFTPConnection_1");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1
							.append("LOCALDIR"
									+ " = "
									+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1.append("REMOTEDIR" + " = "
							+ "context.eftpDirectory");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1
							.append("MOVE_TO_THE_CURRENT_DIRECTORY" + " = "
									+ "true");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1.append("SFTPOVERWRITE" + " = "
							+ "overwrite");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1.append("PERL5_REGEX" + " = "
							+ "false");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1
							.append("FILES"
									+ " = "
									+ "[{FILEMASK="
									+ ("((String)globalMap.get(\"tFileList_2_CURRENT_FILE\"))")
									+ ", NEWNAME=" + ("\"\"") + "}]");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1.append("DIE_ON_ERROR" + " = "
							+ "true");
					log4jParamters_tFTPPut_1.append(" | ");
					log4jParamters_tFTPPut_1.append("USE_PROXY" + " = "
							+ "false");
					log4jParamters_tFTPPut_1.append(" | ");
					if (log.isDebugEnabled())
						log.debug("tFTPPut_1 - " + log4jParamters_tFTPPut_1);

					int nb_file_tFTPPut_1 = 0;
					// *** sftp *** //

					class MyProgressMonitor_tFTPPut_1 implements
							com.jcraft.jsch.SftpProgressMonitor {
						public void init(int op, String src, String dest,
								long max) {
						}

						public boolean count(long count) {
							return true;
						}

						public void end() {
						}
					}

					com.jcraft.jsch.ChannelSftp c_tFTPPut_1 = (com.jcraft.jsch.ChannelSftp) globalMap
							.get("conn_tFTPConnection_1");

					if (c_tFTPPut_1 != null && c_tFTPPut_1.getSession() != null) {
						log.info("tFTPPut_1 - Uses an existing connection. Connection username "
								+ c_tFTPPut_1.getSession().getUserName()
								+ ", Connection hostname: "
								+ c_tFTPPut_1.getSession().getHost()
								+ ", Connection port: "
								+ c_tFTPPut_1.getSession().getPort() + ".");
					}

					if (c_tFTPPut_1.getHome() != null
							&& !c_tFTPPut_1.getHome().equals(c_tFTPPut_1.pwd())) {
						c_tFTPPut_1.cd(c_tFTPPut_1.getHome());
					}

					// becasue there is not the same method in JSch class as
					// FTPClient class, define a list here
					java.util.List<String> msg_tFTPPut_1 = new java.util.ArrayList<String>();
					com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_1 = new MyProgressMonitor_tFTPPut_1();
					java.util.List<java.util.Map<String, String>> listtFTPPut_1 = new java.util.ArrayList<java.util.Map<String, String>>();

					java.util.Map<String, String> maptFTPPut_10 = new java.util.HashMap<String, String>();
					maptFTPPut_10
							.put(((String) globalMap
									.get("tFileList_2_CURRENT_FILE")), "");
					listtFTPPut_1.add(maptFTPPut_10);
					String localdirtFTPPut_1 = context.shipping + context.slash
							+ context.reportYear + context.mDrive
							+ context.slash + context.client + context.slash
							+ context.jobNumber + context.slash
							+ context.reportMonth + context.slash;

					log.info("tFTPPut_1 - Putting file to the server.");

					for (java.util.Map<String, String> maptFTPPut_1 : listtFTPPut_1) {

						/**
						 * [tFTPPut_1 begin ] stop
						 */

						/**
						 * [tFTPPut_1 main ] start
						 */

						currentComponent = "tFTPPut_1";

						try {
							globalMap.put("tFTPPut_1_CURRENT_STATUS",
									"No file transfered.");
							java.util.Set<String> keySettFTPPut_1 = maptFTPPut_1
									.keySet();
							for (String keytFTPPut_1 : keySettFTPPut_1) {
								if (keytFTPPut_1 == null
										|| "".equals(keytFTPPut_1)) {
									log.error("tFTPPut_1 - file name invalid!");
									System.err.println("file name invalid!");
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
										&& !"".equals(dirtFTPPut_1))
									tempdirtFTPPut_1 = tempdirtFTPPut_1 + "/"
											+ dirtFTPPut_1;
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
															&& pathname
																	.isFile()) {
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
										if (listingstFTPPut_1[mtFTPPut_1]
												.getName().matches(
														masktFTPPut_1)) {

											int modetFTPPut_1 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
											try {
												c_tFTPPut_1
														.put(listingstFTPPut_1[mtFTPPut_1]
																.getAbsolutePath(),
																context.eftpDirectory,
																monitortFTPPut_1,
																modetFTPPut_1);

												// add info to list will return
												msg_tFTPPut_1
														.add("file: "
																+ listingstFTPPut_1[mtFTPPut_1]
																		.getAbsolutePath()
																+ ", size: "
																+ listingstFTPPut_1[mtFTPPut_1]
																		.length()
																+ " bytes upload successfully");
												log.debug("tFTPPut_1 - Uploaded file '"
														+ listingstFTPPut_1[mtFTPPut_1]
																.getName()
														+ "' successfully.");
												globalMap
														.put("tFTPPut_1_CURRENT_STATUS",
																"File transfer OK.");
												if (c_tFTPPut_1
														.stat(context.eftpDirectory
																+ "/"
																+ listingstFTPPut_1[mtFTPPut_1]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_1_CURRENT_FILE_EXISTS",
																	true);
												}
											} catch (com.jcraft.jsch.SftpException e_tFTPPut_1) {
												log.error("tFTPPut_1 - File transfer fail."
														+ e_tFTPPut_1
																.getMessage());
												globalMap
														.put("tFTPPut_1_CURRENT_STATUS",
																"File transfer fail.");
												if (c_tFTPPut_1
														.stat(context.eftpDirectory
																+ "/"
																+ listingstFTPPut_1[mtFTPPut_1]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_1_CURRENT_FILE_EXISTS",
																	true);
												}
												throw (e_tFTPPut_1);
											} catch (java.lang.Exception e_tFTPPut_1) {
												if (!(e_tFTPPut_1 instanceof com.jcraft.jsch.SftpException)) {
													msg_tFTPPut_1
															.add("file "
																	+ listingstFTPPut_1[mtFTPPut_1]
																			.getAbsolutePath()
																	+ " not found?");

													globalMap
															.put("tFTPPut_1_CURRENT_FILE_EXISTS",
																	false);
												}
												throw e_tFTPPut_1;
											}
											nb_file_tFTPPut_1++;
										}
									}
								} else {
									log.error("tFTPPut_1 - No match file exist!");
									System.err.println("No match file exist!");
								}

								// do rename
								if (maptFTPPut_1.get(keytFTPPut_1) != ""
										&& keytFTPPut_1 != maptFTPPut_1
												.get(keytFTPPut_1)) {
									try {
										c_tFTPPut_1.rm(context.eftpDirectory
												+ "/"
												+ maptFTPPut_1
														.get(keytFTPPut_1));
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_1) {
									}
									try {
										c_tFTPPut_1
												.rename(context.eftpDirectory
														+ "/" + keytFTPPut_1,
														context.eftpDirectory
																+ "/"
																+ maptFTPPut_1
																		.get(keytFTPPut_1));
										globalMap.put(
												"tFTPPut_1_CURRENT_STATUS",
												"File rename OK.");
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_1) {
										globalMap.put(
												"tFTPPut_1_CURRENT_STATUS",
												"File rename fail.");
										throw e_tFTPPut_1;
									}
								}
							}

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

					}
					msg_tFTPPut_1.add(nb_file_tFTPPut_1
							+ " files have been uploaded.");

					StringBuffer sb_tFTPPut_1 = new StringBuffer();
					for (String item_tFTPPut_1 : msg_tFTPPut_1) {
						sb_tFTPPut_1.append(item_tFTPPut_1).append("\n");
					}
					globalMap.put("tFTPPut_1_TRANSFER_MESSAGES",
							sb_tFTPPut_1.toString());

					globalMap.put("tFTPPut_1_NB_FILE", nb_file_tFTPPut_1);
					log.info("tFTPPut_1 - Uploaded files count: "
							+ nb_file_tFTPPut_1 + ".");

					if (log.isInfoEnabled())
						log.info("tFTPPut_1 - " + "Done.");

					ok_Hash.put("tFTPPut_1", true);
					end_Hash.put("tFTPPut_1", System.currentTimeMillis());

					/**
					 * [tFTPPut_1 end ] stop
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

			tFileList_3Process(globalMap);

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

		globalMap.put("tFileList_2_SUBPROCESS_STATE", 1);
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

				int NB_ITERATE_tFTPPut_2 = 0; // for statistics

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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
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
						+ "[{FILEMASK=" + ("\"*.pgp\"") + "}]");
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

				String directory_tFileList_3 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
				final java.util.List<String> maskList_tFileList_3 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_3 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_3.add("*.pgp");
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
					NB_ITERATE_tFTPPut_2++;

					/**
					 * [tFTPPut_2 begin ] start
					 */

					ok_Hash.put("tFTPPut_2", false);
					start_Hash.put("tFTPPut_2", System.currentTimeMillis());

					currentComponent = "tFTPPut_2";

					int tos_count_tFTPPut_2 = 0;

					if (log.isInfoEnabled())
						log.info("tFTPPut_2 - " + "Start to work.");
					StringBuilder log4jParamters_tFTPPut_2 = new StringBuilder();
					log4jParamters_tFTPPut_2.append("Parameters:");
					log4jParamters_tFTPPut_2.append("USE_EXISTING_CONNECTION"
							+ " = " + "true");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2.append("CONNECTION" + " = "
							+ "tFTPConnection_2");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2
							.append("LOCALDIR"
									+ " = "
									+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2.append("REMOTEDIR" + " = "
							+ "context.coinFTPDirectory");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2
							.append("MOVE_TO_THE_CURRENT_DIRECTORY" + " = "
									+ "true");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2.append("SFTPOVERWRITE" + " = "
							+ "overwrite");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2.append("PERL5_REGEX" + " = "
							+ "false");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2
							.append("FILES"
									+ " = "
									+ "[{FILEMASK="
									+ ("((String)globalMap.get(\"tFileList_3_CURRENT_FILE\"))")
									+ ", NEWNAME=" + ("\"\"") + "}]");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2.append("DIE_ON_ERROR" + " = "
							+ "true");
					log4jParamters_tFTPPut_2.append(" | ");
					log4jParamters_tFTPPut_2.append("USE_PROXY" + " = "
							+ "false");
					log4jParamters_tFTPPut_2.append(" | ");
					if (log.isDebugEnabled())
						log.debug("tFTPPut_2 - " + log4jParamters_tFTPPut_2);

					int nb_file_tFTPPut_2 = 0;
					// *** sftp *** //

					class MyProgressMonitor_tFTPPut_2 implements
							com.jcraft.jsch.SftpProgressMonitor {
						public void init(int op, String src, String dest,
								long max) {
						}

						public boolean count(long count) {
							return true;
						}

						public void end() {
						}
					}

					com.jcraft.jsch.ChannelSftp c_tFTPPut_2 = (com.jcraft.jsch.ChannelSftp) globalMap
							.get("conn_tFTPConnection_2");

					if (c_tFTPPut_2 != null && c_tFTPPut_2.getSession() != null) {
						log.info("tFTPPut_2 - Uses an existing connection. Connection username "
								+ c_tFTPPut_2.getSession().getUserName()
								+ ", Connection hostname: "
								+ c_tFTPPut_2.getSession().getHost()
								+ ", Connection port: "
								+ c_tFTPPut_2.getSession().getPort() + ".");
					}

					if (c_tFTPPut_2.getHome() != null
							&& !c_tFTPPut_2.getHome().equals(c_tFTPPut_2.pwd())) {
						c_tFTPPut_2.cd(c_tFTPPut_2.getHome());
					}

					// becasue there is not the same method in JSch class as
					// FTPClient class, define a list here
					java.util.List<String> msg_tFTPPut_2 = new java.util.ArrayList<String>();
					com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_2 = new MyProgressMonitor_tFTPPut_2();
					java.util.List<java.util.Map<String, String>> listtFTPPut_2 = new java.util.ArrayList<java.util.Map<String, String>>();

					java.util.Map<String, String> maptFTPPut_20 = new java.util.HashMap<String, String>();
					maptFTPPut_20
							.put(((String) globalMap
									.get("tFileList_3_CURRENT_FILE")), "");
					listtFTPPut_2.add(maptFTPPut_20);
					String localdirtFTPPut_2 = context.shipping + context.slash
							+ context.reportYear + context.mDrive
							+ context.slash + context.client + context.slash
							+ context.jobNumber + context.slash
							+ context.reportMonth + context.slash;

					log.info("tFTPPut_2 - Putting file to the server.");

					for (java.util.Map<String, String> maptFTPPut_2 : listtFTPPut_2) {

						/**
						 * [tFTPPut_2 begin ] stop
						 */

						/**
						 * [tFTPPut_2 main ] start
						 */

						currentComponent = "tFTPPut_2";

						try {
							globalMap.put("tFTPPut_2_CURRENT_STATUS",
									"No file transfered.");
							java.util.Set<String> keySettFTPPut_2 = maptFTPPut_2
									.keySet();
							for (String keytFTPPut_2 : keySettFTPPut_2) {
								if (keytFTPPut_2 == null
										|| "".equals(keytFTPPut_2)) {
									log.error("tFTPPut_2 - file name invalid!");
									System.err.println("file name invalid!");
									continue;
								}
								String tempdirtFTPPut_2 = localdirtFTPPut_2;
								String filemasktFTPPut_2 = keytFTPPut_2;
								String dirtFTPPut_2 = null;
								String masktFTPPut_2 = filemasktFTPPut_2
										.replaceAll("\\\\", "/");
								int itFTPPut_2 = masktFTPPut_2.lastIndexOf('/');
								if (itFTPPut_2 != -1) {
									dirtFTPPut_2 = masktFTPPut_2.substring(0,
											itFTPPut_2);
									masktFTPPut_2 = masktFTPPut_2
											.substring(itFTPPut_2 + 1);
								}
								if (dirtFTPPut_2 != null
										&& !"".equals(dirtFTPPut_2))
									tempdirtFTPPut_2 = tempdirtFTPPut_2 + "/"
											+ dirtFTPPut_2;
								masktFTPPut_2 = masktFTPPut_2.replaceAll("\\.",
										"\\\\.").replaceAll("\\*", ".*");
								final String finalMasktFTPPut_2 = masktFTPPut_2;
								java.io.File[] listingstFTPPut_2 = null;
								java.io.File filetFTPPut_2 = new java.io.File(
										tempdirtFTPPut_2);
								if (filetFTPPut_2.isDirectory()) {
									listingstFTPPut_2 = filetFTPPut_2
											.listFiles(new java.io.FileFilter() {
												public boolean accept(
														java.io.File pathname) {
													boolean result = false;
													if (pathname != null
															&& pathname
																	.isFile()) {
														result = java.util.regex.Pattern
																.compile(
																		finalMasktFTPPut_2)
																.matcher(
																		pathname.getName())
																.find();
													}
													return result;
												}
											});
								}
								if (listingstFTPPut_2 != null
										&& listingstFTPPut_2.length > 0) {
									for (int mtFTPPut_2 = 0; mtFTPPut_2 < listingstFTPPut_2.length; mtFTPPut_2++) {
										if (listingstFTPPut_2[mtFTPPut_2]
												.getName().matches(
														masktFTPPut_2)) {

											int modetFTPPut_2 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
											try {
												c_tFTPPut_2
														.put(listingstFTPPut_2[mtFTPPut_2]
																.getAbsolutePath(),
																context.coinFTPDirectory,
																monitortFTPPut_2,
																modetFTPPut_2);

												// add info to list will return
												msg_tFTPPut_2
														.add("file: "
																+ listingstFTPPut_2[mtFTPPut_2]
																		.getAbsolutePath()
																+ ", size: "
																+ listingstFTPPut_2[mtFTPPut_2]
																		.length()
																+ " bytes upload successfully");
												log.debug("tFTPPut_2 - Uploaded file '"
														+ listingstFTPPut_2[mtFTPPut_2]
																.getName()
														+ "' successfully.");
												globalMap
														.put("tFTPPut_2_CURRENT_STATUS",
																"File transfer OK.");
												if (c_tFTPPut_2
														.stat(context.coinFTPDirectory
																+ "/"
																+ listingstFTPPut_2[mtFTPPut_2]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_2_CURRENT_FILE_EXISTS",
																	true);
												}
											} catch (com.jcraft.jsch.SftpException e_tFTPPut_2) {
												log.error("tFTPPut_2 - File transfer fail."
														+ e_tFTPPut_2
																.getMessage());
												globalMap
														.put("tFTPPut_2_CURRENT_STATUS",
																"File transfer fail.");
												if (c_tFTPPut_2
														.stat(context.coinFTPDirectory
																+ "/"
																+ listingstFTPPut_2[mtFTPPut_2]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_2_CURRENT_FILE_EXISTS",
																	true);
												}
												throw (e_tFTPPut_2);
											} catch (java.lang.Exception e_tFTPPut_2) {
												if (!(e_tFTPPut_2 instanceof com.jcraft.jsch.SftpException)) {
													msg_tFTPPut_2
															.add("file "
																	+ listingstFTPPut_2[mtFTPPut_2]
																			.getAbsolutePath()
																	+ " not found?");

													globalMap
															.put("tFTPPut_2_CURRENT_FILE_EXISTS",
																	false);
												}
												throw e_tFTPPut_2;
											}
											nb_file_tFTPPut_2++;
										}
									}
								} else {
									log.error("tFTPPut_2 - No match file exist!");
									System.err.println("No match file exist!");
								}

								// do rename
								if (maptFTPPut_2.get(keytFTPPut_2) != ""
										&& keytFTPPut_2 != maptFTPPut_2
												.get(keytFTPPut_2)) {
									try {
										c_tFTPPut_2.rm(context.coinFTPDirectory
												+ "/"
												+ maptFTPPut_2
														.get(keytFTPPut_2));
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_2) {
									}
									try {
										c_tFTPPut_2
												.rename(context.coinFTPDirectory
														+ "/" + keytFTPPut_2,
														context.coinFTPDirectory
																+ "/"
																+ maptFTPPut_2
																		.get(keytFTPPut_2));
										globalMap.put(
												"tFTPPut_2_CURRENT_STATUS",
												"File rename OK.");
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_2) {
										globalMap.put(
												"tFTPPut_2_CURRENT_STATUS",
												"File rename fail.");
										throw e_tFTPPut_2;
									}
								}
							}

						} catch (java.lang.Exception e_tFTPPut_2) {
							throw (e_tFTPPut_2);
						}

						tos_count_tFTPPut_2++;

						/**
						 * [tFTPPut_2 main ] stop
						 */

						/**
						 * [tFTPPut_2 end ] start
						 */

						currentComponent = "tFTPPut_2";

					}
					msg_tFTPPut_2.add(nb_file_tFTPPut_2
							+ " files have been uploaded.");

					StringBuffer sb_tFTPPut_2 = new StringBuffer();
					for (String item_tFTPPut_2 : msg_tFTPPut_2) {
						sb_tFTPPut_2.append(item_tFTPPut_2).append("\n");
					}
					globalMap.put("tFTPPut_2_TRANSFER_MESSAGES",
							sb_tFTPPut_2.toString());

					globalMap.put("tFTPPut_2_NB_FILE", nb_file_tFTPPut_2);
					log.info("tFTPPut_2 - Uploaded files count: "
							+ nb_file_tFTPPut_2 + ".");

					if (log.isInfoEnabled())
						log.info("tFTPPut_2 - " + "Done.");

					ok_Hash.put("tFTPPut_2", true);
					end_Hash.put("tFTPPut_2", System.currentTimeMillis());

					/**
					 * [tFTPPut_2 end ] stop
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

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_3:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tFileList_4Process(globalMap);

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
				 * [tFTPPut_2 finally ] start
				 */

				currentComponent = "tFTPPut_2";

				/**
				 * [tFTPPut_2 finally ] stop
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

				int NB_ITERATE_tFTPPut_3 = 0; // for statistics

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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4
						.append("LIST_MODE" + " = " + "FILES");
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
						+ "[{FILEMASK=" + ("\"*.DONE\"") + "}]");
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
				log4jParamters_tFileList_4.append("IFEXCLUDE" + " = " + "true");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("EXCLUDEFILEMASK" + " = "
						+ "\"Dealer_Standard_SR_COIN.DONE\"");
				log4jParamters_tFileList_4.append(" | ");
				log4jParamters_tFileList_4.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_4 - " + log4jParamters_tFileList_4);

				final StringBuffer log4jSb_tFileList_4 = new StringBuffer();

				String directory_tFileList_4 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
				final java.util.List<String> maskList_tFileList_4 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_4 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_4.add("*.DONE");
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
				String excludefilemask_tFileList_4 = "Dealer_Standard_SR_COIN.DONE";
				final List<java.util.regex.Pattern> excludefileNameEachPattern_tFileList_4 = new java.util.ArrayList<java.util.regex.Pattern>();
				if (excludefilemask_tFileList_4 != null
						&& !"".equals(excludefilemask_tFileList_4)) {
					for (String excludefilemaskEach_tFileList_4 : excludefilemask_tFileList_4
							.split(",")) {

						excludefilemaskEach_tFileList_4 = org.apache.oro.text.GlobCompiler
								.globToPerl5(
										excludefilemaskEach_tFileList_4
												.toCharArray(),
										org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						excludefileNameEachPattern_tFileList_4
								.add(java.util.regex.Pattern
										.compile(excludefilemaskEach_tFileList_4));

					}
				}
				final java.util.List<java.io.File> list_tFileList_4 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_4 = new java.util.HashSet<String>();
				java.io.File file_tFileList_4 = new java.io.File(
						directory_tFileList_4);

				file_tFileList_4.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_4 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_4 : patternList_tFileList_4) {
								if (fileNamePattern_tFileList_4.matcher(
										fileName_tFileList_4).matches()) {
									boolean isExclude_tFileList_4 = false;
									for (java.util.regex.Pattern pattern : excludefileNameEachPattern_tFileList_4) {
										if (pattern.matcher(
												fileName_tFileList_4).matches()) {
											isExclude_tFileList_4 = true;
											break;
										}
									}
									if (!isExclude_tFileList_4
											&& !filePath_tFileList_4
													.contains(file
															.getAbsolutePath())) {
										list_tFileList_4.add(file);
										filePath_tFileList_4.add(file
												.getAbsolutePath());
									}
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
					NB_ITERATE_tFTPPut_3++;

					/**
					 * [tFTPPut_3 begin ] start
					 */

					ok_Hash.put("tFTPPut_3", false);
					start_Hash.put("tFTPPut_3", System.currentTimeMillis());

					currentComponent = "tFTPPut_3";

					int tos_count_tFTPPut_3 = 0;

					if (log.isInfoEnabled())
						log.info("tFTPPut_3 - " + "Start to work.");
					StringBuilder log4jParamters_tFTPPut_3 = new StringBuilder();
					log4jParamters_tFTPPut_3.append("Parameters:");
					log4jParamters_tFTPPut_3.append("USE_EXISTING_CONNECTION"
							+ " = " + "true");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3.append("CONNECTION" + " = "
							+ "tFTPConnection_1");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3
							.append("LOCALDIR"
									+ " = "
									+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3.append("REMOTEDIR" + " = "
							+ "context.eftpDirectory");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3
							.append("MOVE_TO_THE_CURRENT_DIRECTORY" + " = "
									+ "true");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3.append("SFTPOVERWRITE" + " = "
							+ "overwrite");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3.append("PERL5_REGEX" + " = "
							+ "false");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3
							.append("FILES"
									+ " = "
									+ "[{FILEMASK="
									+ ("((String)globalMap.get(\"tFileList_4_CURRENT_FILE\"))")
									+ ", NEWNAME=" + ("\"\"") + "}]");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3.append("DIE_ON_ERROR" + " = "
							+ "true");
					log4jParamters_tFTPPut_3.append(" | ");
					log4jParamters_tFTPPut_3.append("USE_PROXY" + " = "
							+ "false");
					log4jParamters_tFTPPut_3.append(" | ");
					if (log.isDebugEnabled())
						log.debug("tFTPPut_3 - " + log4jParamters_tFTPPut_3);

					int nb_file_tFTPPut_3 = 0;
					// *** sftp *** //

					class MyProgressMonitor_tFTPPut_3 implements
							com.jcraft.jsch.SftpProgressMonitor {
						public void init(int op, String src, String dest,
								long max) {
						}

						public boolean count(long count) {
							return true;
						}

						public void end() {
						}
					}

					com.jcraft.jsch.ChannelSftp c_tFTPPut_3 = (com.jcraft.jsch.ChannelSftp) globalMap
							.get("conn_tFTPConnection_1");

					if (c_tFTPPut_3 != null && c_tFTPPut_3.getSession() != null) {
						log.info("tFTPPut_3 - Uses an existing connection. Connection username "
								+ c_tFTPPut_3.getSession().getUserName()
								+ ", Connection hostname: "
								+ c_tFTPPut_3.getSession().getHost()
								+ ", Connection port: "
								+ c_tFTPPut_3.getSession().getPort() + ".");
					}

					if (c_tFTPPut_3.getHome() != null
							&& !c_tFTPPut_3.getHome().equals(c_tFTPPut_3.pwd())) {
						c_tFTPPut_3.cd(c_tFTPPut_3.getHome());
					}

					// becasue there is not the same method in JSch class as
					// FTPClient class, define a list here
					java.util.List<String> msg_tFTPPut_3 = new java.util.ArrayList<String>();
					com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_3 = new MyProgressMonitor_tFTPPut_3();
					java.util.List<java.util.Map<String, String>> listtFTPPut_3 = new java.util.ArrayList<java.util.Map<String, String>>();

					java.util.Map<String, String> maptFTPPut_30 = new java.util.HashMap<String, String>();
					maptFTPPut_30
							.put(((String) globalMap
									.get("tFileList_4_CURRENT_FILE")), "");
					listtFTPPut_3.add(maptFTPPut_30);
					String localdirtFTPPut_3 = context.shipping + context.slash
							+ context.reportYear + context.mDrive
							+ context.slash + context.client + context.slash
							+ context.jobNumber + context.slash
							+ context.reportMonth + context.slash;

					log.info("tFTPPut_3 - Putting file to the server.");

					for (java.util.Map<String, String> maptFTPPut_3 : listtFTPPut_3) {

						/**
						 * [tFTPPut_3 begin ] stop
						 */

						/**
						 * [tFTPPut_3 main ] start
						 */

						currentComponent = "tFTPPut_3";

						try {
							globalMap.put("tFTPPut_3_CURRENT_STATUS",
									"No file transfered.");
							java.util.Set<String> keySettFTPPut_3 = maptFTPPut_3
									.keySet();
							for (String keytFTPPut_3 : keySettFTPPut_3) {
								if (keytFTPPut_3 == null
										|| "".equals(keytFTPPut_3)) {
									log.error("tFTPPut_3 - file name invalid!");
									System.err.println("file name invalid!");
									continue;
								}
								String tempdirtFTPPut_3 = localdirtFTPPut_3;
								String filemasktFTPPut_3 = keytFTPPut_3;
								String dirtFTPPut_3 = null;
								String masktFTPPut_3 = filemasktFTPPut_3
										.replaceAll("\\\\", "/");
								int itFTPPut_3 = masktFTPPut_3.lastIndexOf('/');
								if (itFTPPut_3 != -1) {
									dirtFTPPut_3 = masktFTPPut_3.substring(0,
											itFTPPut_3);
									masktFTPPut_3 = masktFTPPut_3
											.substring(itFTPPut_3 + 1);
								}
								if (dirtFTPPut_3 != null
										&& !"".equals(dirtFTPPut_3))
									tempdirtFTPPut_3 = tempdirtFTPPut_3 + "/"
											+ dirtFTPPut_3;
								masktFTPPut_3 = masktFTPPut_3.replaceAll("\\.",
										"\\\\.").replaceAll("\\*", ".*");
								final String finalMasktFTPPut_3 = masktFTPPut_3;
								java.io.File[] listingstFTPPut_3 = null;
								java.io.File filetFTPPut_3 = new java.io.File(
										tempdirtFTPPut_3);
								if (filetFTPPut_3.isDirectory()) {
									listingstFTPPut_3 = filetFTPPut_3
											.listFiles(new java.io.FileFilter() {
												public boolean accept(
														java.io.File pathname) {
													boolean result = false;
													if (pathname != null
															&& pathname
																	.isFile()) {
														result = java.util.regex.Pattern
																.compile(
																		finalMasktFTPPut_3)
																.matcher(
																		pathname.getName())
																.find();
													}
													return result;
												}
											});
								}
								if (listingstFTPPut_3 != null
										&& listingstFTPPut_3.length > 0) {
									for (int mtFTPPut_3 = 0; mtFTPPut_3 < listingstFTPPut_3.length; mtFTPPut_3++) {
										if (listingstFTPPut_3[mtFTPPut_3]
												.getName().matches(
														masktFTPPut_3)) {

											int modetFTPPut_3 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
											try {
												c_tFTPPut_3
														.put(listingstFTPPut_3[mtFTPPut_3]
																.getAbsolutePath(),
																context.eftpDirectory,
																monitortFTPPut_3,
																modetFTPPut_3);

												// add info to list will return
												msg_tFTPPut_3
														.add("file: "
																+ listingstFTPPut_3[mtFTPPut_3]
																		.getAbsolutePath()
																+ ", size: "
																+ listingstFTPPut_3[mtFTPPut_3]
																		.length()
																+ " bytes upload successfully");
												log.debug("tFTPPut_3 - Uploaded file '"
														+ listingstFTPPut_3[mtFTPPut_3]
																.getName()
														+ "' successfully.");
												globalMap
														.put("tFTPPut_3_CURRENT_STATUS",
																"File transfer OK.");
												if (c_tFTPPut_3
														.stat(context.eftpDirectory
																+ "/"
																+ listingstFTPPut_3[mtFTPPut_3]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_3_CURRENT_FILE_EXISTS",
																	true);
												}
											} catch (com.jcraft.jsch.SftpException e_tFTPPut_3) {
												log.error("tFTPPut_3 - File transfer fail."
														+ e_tFTPPut_3
																.getMessage());
												globalMap
														.put("tFTPPut_3_CURRENT_STATUS",
																"File transfer fail.");
												if (c_tFTPPut_3
														.stat(context.eftpDirectory
																+ "/"
																+ listingstFTPPut_3[mtFTPPut_3]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_3_CURRENT_FILE_EXISTS",
																	true);
												}
												throw (e_tFTPPut_3);
											} catch (java.lang.Exception e_tFTPPut_3) {
												if (!(e_tFTPPut_3 instanceof com.jcraft.jsch.SftpException)) {
													msg_tFTPPut_3
															.add("file "
																	+ listingstFTPPut_3[mtFTPPut_3]
																			.getAbsolutePath()
																	+ " not found?");

													globalMap
															.put("tFTPPut_3_CURRENT_FILE_EXISTS",
																	false);
												}
												throw e_tFTPPut_3;
											}
											nb_file_tFTPPut_3++;
										}
									}
								} else {
									log.error("tFTPPut_3 - No match file exist!");
									System.err.println("No match file exist!");
								}

								// do rename
								if (maptFTPPut_3.get(keytFTPPut_3) != ""
										&& keytFTPPut_3 != maptFTPPut_3
												.get(keytFTPPut_3)) {
									try {
										c_tFTPPut_3.rm(context.eftpDirectory
												+ "/"
												+ maptFTPPut_3
														.get(keytFTPPut_3));
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_3) {
									}
									try {
										c_tFTPPut_3
												.rename(context.eftpDirectory
														+ "/" + keytFTPPut_3,
														context.eftpDirectory
																+ "/"
																+ maptFTPPut_3
																		.get(keytFTPPut_3));
										globalMap.put(
												"tFTPPut_3_CURRENT_STATUS",
												"File rename OK.");
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_3) {
										globalMap.put(
												"tFTPPut_3_CURRENT_STATUS",
												"File rename fail.");
										throw e_tFTPPut_3;
									}
								}
							}

						} catch (java.lang.Exception e_tFTPPut_3) {
							throw (e_tFTPPut_3);
						}

						tos_count_tFTPPut_3++;

						/**
						 * [tFTPPut_3 main ] stop
						 */

						/**
						 * [tFTPPut_3 end ] start
						 */

						currentComponent = "tFTPPut_3";

					}
					msg_tFTPPut_3.add(nb_file_tFTPPut_3
							+ " files have been uploaded.");

					StringBuffer sb_tFTPPut_3 = new StringBuffer();
					for (String item_tFTPPut_3 : msg_tFTPPut_3) {
						sb_tFTPPut_3.append(item_tFTPPut_3).append("\n");
					}
					globalMap.put("tFTPPut_3_TRANSFER_MESSAGES",
							sb_tFTPPut_3.toString());

					globalMap.put("tFTPPut_3_NB_FILE", nb_file_tFTPPut_3);
					log.info("tFTPPut_3 - Uploaded files count: "
							+ nb_file_tFTPPut_3 + ".");

					if (log.isInfoEnabled())
						log.info("tFTPPut_3 - " + "Done.");

					ok_Hash.put("tFTPPut_3", true);
					end_Hash.put("tFTPPut_3", System.currentTimeMillis());

					/**
					 * [tFTPPut_3 end ] stop
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

			tFileList_6Process(globalMap);

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
				 * [tFTPPut_3 finally ] start
				 */

				currentComponent = "tFTPPut_3";

				/**
				 * [tFTPPut_3 finally ] stop
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

	public void tFileList_6Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_6_SUBPROCESS_STATE", 0);

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
				 * [tFileList_6 begin ] start
				 */

				int NB_ITERATE_tFTPPut_4 = 0; // for statistics

				ok_Hash.put("tFileList_6", false);
				start_Hash.put("tFileList_6", System.currentTimeMillis());

				currentComponent = "tFileList_6";

				int tos_count_tFileList_6 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_6 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_6 = new StringBuilder();
				log4jParamters_tFileList_6.append("Parameters:");
				log4jParamters_tFileList_6
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6
						.append("LIST_MODE" + " = " + "FILES");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"Dealer_Standard_SR_COIN.DONE\"")
						+ "}]");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6
						.append("IFEXCLUDE" + " = " + "false");
				log4jParamters_tFileList_6.append(" | ");
				log4jParamters_tFileList_6.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_6.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_6 - " + log4jParamters_tFileList_6);

				final StringBuffer log4jSb_tFileList_6 = new StringBuffer();

				String directory_tFileList_6 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
				final java.util.List<String> maskList_tFileList_6 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_6 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_6.add("Dealer_Standard_SR_COIN.DONE");
				for (final String filemask_tFileList_6 : maskList_tFileList_6) {
					String filemask_compile_tFileList_6 = filemask_tFileList_6;

					filemask_compile_tFileList_6 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_6.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_6 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_6);
					patternList_tFileList_6.add(fileNamePattern_tFileList_6);
				}
				int NB_FILEtFileList_6 = 0;

				final boolean case_sensitive_tFileList_6 = true;
				final java.util.List<java.io.File> list_tFileList_6 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_6 = new java.util.HashSet<String>();
				java.io.File file_tFileList_6 = new java.io.File(
						directory_tFileList_6);

				file_tFileList_6.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_6 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_6 : patternList_tFileList_6) {
								if (fileNamePattern_tFileList_6.matcher(
										fileName_tFileList_6).matches()) {
									if (!filePath_tFileList_6.contains(file
											.getAbsolutePath())) {
										list_tFileList_6.add(file);
										filePath_tFileList_6.add(file
												.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_6);

				log.info("tFileList_6 - Start to list files");

				for (int i_tFileList_6 = 0; i_tFileList_6 < list_tFileList_6
						.size(); i_tFileList_6++) {
					java.io.File files_tFileList_6 = list_tFileList_6
							.get(i_tFileList_6);
					String fileName_tFileList_6 = files_tFileList_6.getName();

					String currentFileName_tFileList_6 = files_tFileList_6
							.getName();
					String currentFilePath_tFileList_6 = files_tFileList_6
							.getAbsolutePath();
					String currentFileDirectory_tFileList_6 = files_tFileList_6
							.getParent();
					String currentFileExtension_tFileList_6 = null;

					if (files_tFileList_6.getName().contains(".")
							&& files_tFileList_6.isFile()) {
						currentFileExtension_tFileList_6 = files_tFileList_6
								.getName().substring(
										files_tFileList_6.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_6 = "";
					}

					NB_FILEtFileList_6++;
					globalMap.put("tFileList_6_CURRENT_FILE",
							currentFileName_tFileList_6);
					globalMap.put("tFileList_6_CURRENT_FILEPATH",
							currentFilePath_tFileList_6);
					globalMap.put("tFileList_6_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_6);
					globalMap.put("tFileList_6_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_6);
					globalMap.put("tFileList_6_NB_FILE", NB_FILEtFileList_6);

					log.info("tFileList_6 - Current file or directory path : "
							+ currentFilePath_tFileList_6);

					/**
					 * [tFileList_6 begin ] stop
					 */

					/**
					 * [tFileList_6 main ] start
					 */

					currentComponent = "tFileList_6";

					tos_count_tFileList_6++;

					/**
					 * [tFileList_6 main ] stop
					 */
					NB_ITERATE_tFTPPut_4++;

					/**
					 * [tFTPPut_4 begin ] start
					 */

					ok_Hash.put("tFTPPut_4", false);
					start_Hash.put("tFTPPut_4", System.currentTimeMillis());

					currentComponent = "tFTPPut_4";

					int tos_count_tFTPPut_4 = 0;

					if (log.isInfoEnabled())
						log.info("tFTPPut_4 - " + "Start to work.");
					StringBuilder log4jParamters_tFTPPut_4 = new StringBuilder();
					log4jParamters_tFTPPut_4.append("Parameters:");
					log4jParamters_tFTPPut_4.append("USE_EXISTING_CONNECTION"
							+ " = " + "true");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4.append("CONNECTION" + " = "
							+ "tFTPConnection_2");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4
							.append("LOCALDIR"
									+ " = "
									+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4.append("REMOTEDIR" + " = "
							+ "context.coinFTPDirectory");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4
							.append("MOVE_TO_THE_CURRENT_DIRECTORY" + " = "
									+ "true");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4.append("SFTPOVERWRITE" + " = "
							+ "overwrite");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4.append("PERL5_REGEX" + " = "
							+ "false");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4
							.append("FILES"
									+ " = "
									+ "[{FILEMASK="
									+ ("((String)globalMap.get(\"tFileList_6_CURRENT_FILE\"))")
									+ ", NEWNAME=" + ("\"\"") + "}]");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4.append("DIE_ON_ERROR" + " = "
							+ "true");
					log4jParamters_tFTPPut_4.append(" | ");
					log4jParamters_tFTPPut_4.append("USE_PROXY" + " = "
							+ "false");
					log4jParamters_tFTPPut_4.append(" | ");
					if (log.isDebugEnabled())
						log.debug("tFTPPut_4 - " + log4jParamters_tFTPPut_4);

					int nb_file_tFTPPut_4 = 0;
					// *** sftp *** //

					class MyProgressMonitor_tFTPPut_4 implements
							com.jcraft.jsch.SftpProgressMonitor {
						public void init(int op, String src, String dest,
								long max) {
						}

						public boolean count(long count) {
							return true;
						}

						public void end() {
						}
					}

					com.jcraft.jsch.ChannelSftp c_tFTPPut_4 = (com.jcraft.jsch.ChannelSftp) globalMap
							.get("conn_tFTPConnection_2");

					if (c_tFTPPut_4 != null && c_tFTPPut_4.getSession() != null) {
						log.info("tFTPPut_4 - Uses an existing connection. Connection username "
								+ c_tFTPPut_4.getSession().getUserName()
								+ ", Connection hostname: "
								+ c_tFTPPut_4.getSession().getHost()
								+ ", Connection port: "
								+ c_tFTPPut_4.getSession().getPort() + ".");
					}

					if (c_tFTPPut_4.getHome() != null
							&& !c_tFTPPut_4.getHome().equals(c_tFTPPut_4.pwd())) {
						c_tFTPPut_4.cd(c_tFTPPut_4.getHome());
					}

					// becasue there is not the same method in JSch class as
					// FTPClient class, define a list here
					java.util.List<String> msg_tFTPPut_4 = new java.util.ArrayList<String>();
					com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_4 = new MyProgressMonitor_tFTPPut_4();
					java.util.List<java.util.Map<String, String>> listtFTPPut_4 = new java.util.ArrayList<java.util.Map<String, String>>();

					java.util.Map<String, String> maptFTPPut_40 = new java.util.HashMap<String, String>();
					maptFTPPut_40
							.put(((String) globalMap
									.get("tFileList_6_CURRENT_FILE")), "");
					listtFTPPut_4.add(maptFTPPut_40);
					String localdirtFTPPut_4 = context.shipping + context.slash
							+ context.reportYear + context.mDrive
							+ context.slash + context.client + context.slash
							+ context.jobNumber + context.slash
							+ context.reportMonth + context.slash;

					log.info("tFTPPut_4 - Putting file to the server.");

					for (java.util.Map<String, String> maptFTPPut_4 : listtFTPPut_4) {

						/**
						 * [tFTPPut_4 begin ] stop
						 */

						/**
						 * [tFTPPut_4 main ] start
						 */

						currentComponent = "tFTPPut_4";

						try {
							globalMap.put("tFTPPut_4_CURRENT_STATUS",
									"No file transfered.");
							java.util.Set<String> keySettFTPPut_4 = maptFTPPut_4
									.keySet();
							for (String keytFTPPut_4 : keySettFTPPut_4) {
								if (keytFTPPut_4 == null
										|| "".equals(keytFTPPut_4)) {
									log.error("tFTPPut_4 - file name invalid!");
									System.err.println("file name invalid!");
									continue;
								}
								String tempdirtFTPPut_4 = localdirtFTPPut_4;
								String filemasktFTPPut_4 = keytFTPPut_4;
								String dirtFTPPut_4 = null;
								String masktFTPPut_4 = filemasktFTPPut_4
										.replaceAll("\\\\", "/");
								int itFTPPut_4 = masktFTPPut_4.lastIndexOf('/');
								if (itFTPPut_4 != -1) {
									dirtFTPPut_4 = masktFTPPut_4.substring(0,
											itFTPPut_4);
									masktFTPPut_4 = masktFTPPut_4
											.substring(itFTPPut_4 + 1);
								}
								if (dirtFTPPut_4 != null
										&& !"".equals(dirtFTPPut_4))
									tempdirtFTPPut_4 = tempdirtFTPPut_4 + "/"
											+ dirtFTPPut_4;
								masktFTPPut_4 = masktFTPPut_4.replaceAll("\\.",
										"\\\\.").replaceAll("\\*", ".*");
								final String finalMasktFTPPut_4 = masktFTPPut_4;
								java.io.File[] listingstFTPPut_4 = null;
								java.io.File filetFTPPut_4 = new java.io.File(
										tempdirtFTPPut_4);
								if (filetFTPPut_4.isDirectory()) {
									listingstFTPPut_4 = filetFTPPut_4
											.listFiles(new java.io.FileFilter() {
												public boolean accept(
														java.io.File pathname) {
													boolean result = false;
													if (pathname != null
															&& pathname
																	.isFile()) {
														result = java.util.regex.Pattern
																.compile(
																		finalMasktFTPPut_4)
																.matcher(
																		pathname.getName())
																.find();
													}
													return result;
												}
											});
								}
								if (listingstFTPPut_4 != null
										&& listingstFTPPut_4.length > 0) {
									for (int mtFTPPut_4 = 0; mtFTPPut_4 < listingstFTPPut_4.length; mtFTPPut_4++) {
										if (listingstFTPPut_4[mtFTPPut_4]
												.getName().matches(
														masktFTPPut_4)) {

											int modetFTPPut_4 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
											try {
												c_tFTPPut_4
														.put(listingstFTPPut_4[mtFTPPut_4]
																.getAbsolutePath(),
																context.coinFTPDirectory,
																monitortFTPPut_4,
																modetFTPPut_4);

												// add info to list will return
												msg_tFTPPut_4
														.add("file: "
																+ listingstFTPPut_4[mtFTPPut_4]
																		.getAbsolutePath()
																+ ", size: "
																+ listingstFTPPut_4[mtFTPPut_4]
																		.length()
																+ " bytes upload successfully");
												log.debug("tFTPPut_4 - Uploaded file '"
														+ listingstFTPPut_4[mtFTPPut_4]
																.getName()
														+ "' successfully.");
												globalMap
														.put("tFTPPut_4_CURRENT_STATUS",
																"File transfer OK.");
												if (c_tFTPPut_4
														.stat(context.coinFTPDirectory
																+ "/"
																+ listingstFTPPut_4[mtFTPPut_4]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_4_CURRENT_FILE_EXISTS",
																	true);
												}
											} catch (com.jcraft.jsch.SftpException e_tFTPPut_4) {
												log.error("tFTPPut_4 - File transfer fail."
														+ e_tFTPPut_4
																.getMessage());
												globalMap
														.put("tFTPPut_4_CURRENT_STATUS",
																"File transfer fail.");
												if (c_tFTPPut_4
														.stat(context.coinFTPDirectory
																+ "/"
																+ listingstFTPPut_4[mtFTPPut_4]
																		.getName())
														.getAtimeString() != null) {
													globalMap
															.put("tFTPPut_4_CURRENT_FILE_EXISTS",
																	true);
												}
												throw (e_tFTPPut_4);
											} catch (java.lang.Exception e_tFTPPut_4) {
												if (!(e_tFTPPut_4 instanceof com.jcraft.jsch.SftpException)) {
													msg_tFTPPut_4
															.add("file "
																	+ listingstFTPPut_4[mtFTPPut_4]
																			.getAbsolutePath()
																	+ " not found?");

													globalMap
															.put("tFTPPut_4_CURRENT_FILE_EXISTS",
																	false);
												}
												throw e_tFTPPut_4;
											}
											nb_file_tFTPPut_4++;
										}
									}
								} else {
									log.error("tFTPPut_4 - No match file exist!");
									System.err.println("No match file exist!");
								}

								// do rename
								if (maptFTPPut_4.get(keytFTPPut_4) != ""
										&& keytFTPPut_4 != maptFTPPut_4
												.get(keytFTPPut_4)) {
									try {
										c_tFTPPut_4.rm(context.coinFTPDirectory
												+ "/"
												+ maptFTPPut_4
														.get(keytFTPPut_4));
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_4) {
									}
									try {
										c_tFTPPut_4
												.rename(context.coinFTPDirectory
														+ "/" + keytFTPPut_4,
														context.coinFTPDirectory
																+ "/"
																+ maptFTPPut_4
																		.get(keytFTPPut_4));
										globalMap.put(
												"tFTPPut_4_CURRENT_STATUS",
												"File rename OK.");
									} catch (com.jcraft.jsch.SftpException e_tFTPPut_4) {
										globalMap.put(
												"tFTPPut_4_CURRENT_STATUS",
												"File rename fail.");
										throw e_tFTPPut_4;
									}
								}
							}

						} catch (java.lang.Exception e_tFTPPut_4) {
							throw (e_tFTPPut_4);
						}

						tos_count_tFTPPut_4++;

						/**
						 * [tFTPPut_4 main ] stop
						 */

						/**
						 * [tFTPPut_4 end ] start
						 */

						currentComponent = "tFTPPut_4";

					}
					msg_tFTPPut_4.add(nb_file_tFTPPut_4
							+ " files have been uploaded.");

					StringBuffer sb_tFTPPut_4 = new StringBuffer();
					for (String item_tFTPPut_4 : msg_tFTPPut_4) {
						sb_tFTPPut_4.append(item_tFTPPut_4).append("\n");
					}
					globalMap.put("tFTPPut_4_TRANSFER_MESSAGES",
							sb_tFTPPut_4.toString());

					globalMap.put("tFTPPut_4_NB_FILE", nb_file_tFTPPut_4);
					log.info("tFTPPut_4 - Uploaded files count: "
							+ nb_file_tFTPPut_4 + ".");

					if (log.isInfoEnabled())
						log.info("tFTPPut_4 - " + "Done.");

					ok_Hash.put("tFTPPut_4", true);
					end_Hash.put("tFTPPut_4", System.currentTimeMillis());

					/**
					 * [tFTPPut_4 end ] stop
					 */

					/**
					 * [tFileList_6 end ] start
					 */

					currentComponent = "tFileList_6";

				}
				globalMap.put("tFileList_6_NB_FILE", NB_FILEtFileList_6);

				log.info("tFileList_6 - File or directory count : "
						+ NB_FILEtFileList_6);

				if (log.isInfoEnabled())
					log.info("tFileList_6 - " + "Done.");

				ok_Hash.put("tFileList_6", true);
				end_Hash.put("tFileList_6", System.currentTimeMillis());

				/**
				 * [tFileList_6 end ] stop
				 */
			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_6:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tJava_4Process(globalMap);

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
				 * [tFileList_6 finally ] start
				 */

				currentComponent = "tFileList_6";

				/**
				 * [tFileList_6 finally ] stop
				 */

				/**
				 * [tFTPPut_4 finally ] start
				 */

				currentComponent = "tFTPPut_4";

				/**
				 * [tFTPPut_4 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_6_SUBPROCESS_STATE", 1);
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

				context.pgpFileName = "";

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

				tFileList_7Process(globalMap);

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

	public void tFileList_7Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_7_SUBPROCESS_STATE", 0);

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
				 * [tFileList_7 begin ] start
				 */

				int NB_ITERATE_tJava_5 = 0; // for statistics

				ok_Hash.put("tFileList_7", false);
				start_Hash.put("tFileList_7", System.currentTimeMillis());

				currentComponent = "tFileList_7";

				int tos_count_tFileList_7 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_7 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_7 = new StringBuilder();
				log4jParamters_tFileList_7.append("Parameters:");
				log4jParamters_tFileList_7
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7
						.append("LIST_MODE" + " = " + "FILES");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("INCLUDSUBDIR" + " = "
						+ "false");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}, {FILEMASK="
						+ ("\"*.pgp\"") + "}]");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("IFEXCLUDE" + " = " + "true");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("EXCLUDEFILEMASK" + " = "
						+ "\"Dealer_Standard_SR_COIN.txt\"");
				log4jParamters_tFileList_7.append(" | ");
				log4jParamters_tFileList_7.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_7.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_7 - " + log4jParamters_tFileList_7);

				final StringBuffer log4jSb_tFileList_7 = new StringBuffer();

				String directory_tFileList_7 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
				final java.util.List<String> maskList_tFileList_7 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_7 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_7.add("*.txt");
				maskList_tFileList_7.add("*.pgp");
				for (final String filemask_tFileList_7 : maskList_tFileList_7) {
					String filemask_compile_tFileList_7 = filemask_tFileList_7;

					filemask_compile_tFileList_7 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_7.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_7 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_7);
					patternList_tFileList_7.add(fileNamePattern_tFileList_7);
				}
				int NB_FILEtFileList_7 = 0;

				final boolean case_sensitive_tFileList_7 = true;
				String excludefilemask_tFileList_7 = "Dealer_Standard_SR_COIN.txt";
				final List<java.util.regex.Pattern> excludefileNameEachPattern_tFileList_7 = new java.util.ArrayList<java.util.regex.Pattern>();
				if (excludefilemask_tFileList_7 != null
						&& !"".equals(excludefilemask_tFileList_7)) {
					for (String excludefilemaskEach_tFileList_7 : excludefilemask_tFileList_7
							.split(",")) {

						excludefilemaskEach_tFileList_7 = org.apache.oro.text.GlobCompiler
								.globToPerl5(
										excludefilemaskEach_tFileList_7
												.toCharArray(),
										org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						excludefileNameEachPattern_tFileList_7
								.add(java.util.regex.Pattern
										.compile(excludefilemaskEach_tFileList_7));

					}
				}
				final java.util.List<java.io.File> list_tFileList_7 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_7 = new java.util.HashSet<String>();
				java.io.File file_tFileList_7 = new java.io.File(
						directory_tFileList_7);

				file_tFileList_7.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_7 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_7 : patternList_tFileList_7) {
								if (fileNamePattern_tFileList_7.matcher(
										fileName_tFileList_7).matches()) {
									boolean isExclude_tFileList_7 = false;
									for (java.util.regex.Pattern pattern : excludefileNameEachPattern_tFileList_7) {
										if (pattern.matcher(
												fileName_tFileList_7).matches()) {
											isExclude_tFileList_7 = true;
											break;
										}
									}
									if (!isExclude_tFileList_7
											&& !filePath_tFileList_7
													.contains(file
															.getAbsolutePath())) {
										list_tFileList_7.add(file);
										filePath_tFileList_7.add(file
												.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_7);

				log.info("tFileList_7 - Start to list files");

				for (int i_tFileList_7 = 0; i_tFileList_7 < list_tFileList_7
						.size(); i_tFileList_7++) {
					java.io.File files_tFileList_7 = list_tFileList_7
							.get(i_tFileList_7);
					String fileName_tFileList_7 = files_tFileList_7.getName();

					String currentFileName_tFileList_7 = files_tFileList_7
							.getName();
					String currentFilePath_tFileList_7 = files_tFileList_7
							.getAbsolutePath();
					String currentFileDirectory_tFileList_7 = files_tFileList_7
							.getParent();
					String currentFileExtension_tFileList_7 = null;

					if (files_tFileList_7.getName().contains(".")
							&& files_tFileList_7.isFile()) {
						currentFileExtension_tFileList_7 = files_tFileList_7
								.getName().substring(
										files_tFileList_7.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_7 = "";
					}

					NB_FILEtFileList_7++;
					globalMap.put("tFileList_7_CURRENT_FILE",
							currentFileName_tFileList_7);
					globalMap.put("tFileList_7_CURRENT_FILEPATH",
							currentFilePath_tFileList_7);
					globalMap.put("tFileList_7_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_7);
					globalMap.put("tFileList_7_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_7);
					globalMap.put("tFileList_7_NB_FILE", NB_FILEtFileList_7);

					log.info("tFileList_7 - Current file or directory path : "
							+ currentFilePath_tFileList_7);

					/**
					 * [tFileList_7 begin ] stop
					 */

					/**
					 * [tFileList_7 main ] start
					 */

					currentComponent = "tFileList_7";

					tos_count_tFileList_7++;

					/**
					 * [tFileList_7 main ] stop
					 */
					NB_ITERATE_tJava_5++;

					/**
					 * [tJava_5 begin ] start
					 */

					ok_Hash.put("tJava_5", false);
					start_Hash.put("tJava_5", System.currentTimeMillis());

					currentComponent = "tJava_5";

					int tos_count_tJava_5 = 0;

					context.pgpFileName += ((String) globalMap
							.get("tFileList_7_CURRENT_FILE") + "<br>");

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

					/**
					 * [tJava_5 end ] stop
					 */

					/**
					 * [tFileList_7 end ] start
					 */

					currentComponent = "tFileList_7";

				}
				globalMap.put("tFileList_7_NB_FILE", NB_FILEtFileList_7);

				log.info("tFileList_7 - File or directory count : "
						+ NB_FILEtFileList_7);

				if (log.isInfoEnabled())
					log.info("tFileList_7 - " + "Done.");

				ok_Hash.put("tFileList_7", true);
				end_Hash.put("tFileList_7", System.currentTimeMillis());

				/**
				 * [tFileList_7 end ] stop
				 */
			}// end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil
						.addLog("CHECKPOINT",
								"CONNECTION:SUBJOB_OK:tFileList_7:OnSubjobOk",
								"", Thread.currentThread().getId() + "", "",
								"", "", "", "");
			}

			tSendMail_3Process(globalMap);

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
				 * [tFileList_7 finally ] start
				 */

				currentComponent = "tFileList_7";

				/**
				 * [tFileList_7 finally ] stop
				 */

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

		globalMap.put("tFileList_7_SUBPROCESS_STATE", 1);
	}

	public void tSendMail_3Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tSendMail_3_SUBPROCESS_STATE", 0);

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
						+ "context.emailTo");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("FROM" + " = "
						+ "context.emailFrom");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("CC" + " = "
						+ "context.emailCC");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("BCC" + " = " + "");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3
						.append("SUBJECT"
								+ " = "
								+ "\"USA_\" + context.client+ \" _SHP_\"+context.salesCostCenter+\"_[\"+context.jobNumber+\"]_For_Report_Month:_\" +context.reportMonth");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3
						.append("MESSAGE"
								+ " = "
								+ "\"<html> <body>   <br>  <br>  Please be advised that the following files have been posted to ftp.is.chrysler.com:  <br>  <br>  \"+context.pgpFileName+\"  <br>  If you have any questions regarding the contents, please contact:   <br>   <br>  <font face=Elephant>  \"+context.salesName+\" </font> <br>  \"+context.salesTitle+\"<br>  Phone:  \"+context.salesPhone+\" <br>  Email:  \"+context.salesEmail+\" <br>   <br>   <b> <i>  Thank you for choosing IHS Automotive as your solutions provider. We look forward to working with you again. </b> </i>   <br>   <br>  Job# \"+context.jobNumber+\"   <br>  Shipped by: \"+context.resourceInt+\"  </body>  </html>\"");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("ATTACHMENTS" + " = " + "[]");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_3.append(" | ");
				log4jParamters_tSendMail_3.append("SMTP_HOST" + " = "
						+ "context.smtpHost");
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
						+ "html");
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
				 * [tSendMail_3 main ] start
				 */

				currentComponent = "tSendMail_3";

				String smtpHost_tSendMail_3 = context.smtpHost;
				String smtpPort_tSendMail_3 = "25";
				String from_tSendMail_3 = (context.emailFrom);
				String to_tSendMail_3 = (context.emailTo).replace(";", ",");
				String cc_tSendMail_3 = ((context.emailCC) == null || ""
						.equals(context.emailCC)) ? null : (context.emailCC)
						.replace(";", ",");
				String bcc_tSendMail_3 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String subject_tSendMail_3 = ("USA_" + context.client
						+ " _SHP_" + context.salesCostCenter + "_["
						+ context.jobNumber + "]_For_Report_Month:_" + context.reportMonth);

				java.util.List<java.util.Map<String, String>> headers_tSendMail_3 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_3 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_3 = new java.util.ArrayList<String>();

				String message_tSendMail_3 = (("<html> <body>\n <br>\n<br>\nPlease be advised that the following files have been posted to ftp.is.chrysler.com:\n<br>\n<br>\n"
						+ context.pgpFileName
						+ "\n<br>\nIf you have any questions regarding the contents, please contact:\n <br>\n <br>\n<font face=Elephant>\n"
						+ context.salesName
						+ " </font> <br>\n"
						+ context.salesTitle
						+ "<br>\nPhone:  "
						+ context.salesPhone
						+ " <br>\nEmail:  "
						+ context.salesEmail
						+ " <br>\n <br>\n <b> <i>\nThank you for choosing IHS Automotive as your solutions provider. We look forward to working with you again. </b> </i>\n <br>\n <br>\nJob# "
						+ context.jobNumber
						+ "\n <br>\nShipped by: "
						+ context.resourceInt + "\n</body>\n</html>") == null || ""
						.equals("<html> <body>\n <br>\n<br>\nPlease be advised that the following files have been posted to ftp.is.chrysler.com:\n<br>\n<br>\n"
								+ context.pgpFileName
								+ "\n<br>\nIf you have any questions regarding the contents, please contact:\n <br>\n <br>\n<font face=Elephant>\n"
								+ context.salesName
								+ " </font> <br>\n"
								+ context.salesTitle
								+ "<br>\nPhone:  "
								+ context.salesPhone
								+ " <br>\nEmail:  "
								+ context.salesEmail
								+ " <br>\n <br>\n <b> <i>\nThank you for choosing IHS Automotive as your solutions provider. We look forward to working with you again. </b> </i>\n <br>\n <br>\nJob# "
								+ context.jobNumber
								+ "\n <br>\nShipped by: "
								+ context.resourceInt + "\n</body>\n</html>")) ? "\"\""
						: ("<html> <body>\n <br>\n<br>\nPlease be advised that the following files have been posted to ftp.is.chrysler.com:\n<br>\n<br>\n"
								+ context.pgpFileName
								+ "\n<br>\nIf you have any questions regarding the contents, please contact:\n <br>\n <br>\n<font face=Elephant>\n"
								+ context.salesName
								+ " </font> <br>\n"
								+ context.salesTitle
								+ "<br>\nPhone:  "
								+ context.salesPhone
								+ " <br>\nEmail:  "
								+ context.salesEmail
								+ " <br>\n <br>\n <b> <i>\nThank you for choosing IHS Automotive as your solutions provider. We look forward to working with you again. </b> </i>\n <br>\n <br>\nJob# "
								+ context.jobNumber
								+ "\n <br>\nShipped by: "
								+ context.resourceInt + "\n</body>\n</html>");
				java.util.Properties props_tSendMail_3 = System.getProperties();
				props_tSendMail_3.put("mail.smtp.host", smtpHost_tSendMail_3);
				props_tSendMail_3.put("mail.smtp.port", smtpPort_tSendMail_3);
				props_tSendMail_3.put("mail.mime.encodefilename", "true");
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
								javax.mail.internet.InternetAddress.parse(
										cc_tSendMail_3, false));
					if (bcc_tSendMail_3 != null)
						msg_tSendMail_3.setRecipients(
								javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(
										bcc_tSendMail_3, false));
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
										mbpFile_tSendMail_3.setHeader(
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
							if (contentTransferEncoding_tSendMail_3.get(
									i_tSendMail_3).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_3.setHeader(
										"Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_3.addBodyPart(mbpFile_tSendMail_3);
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

					props_tSendMail_3.remove("mail.mime.encodefilename");

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

				tFileArchive_1Process(globalMap);

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

		globalMap.put("tSendMail_3_SUBPROCESS_STATE", 1);
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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1.append("SUB_DIRECTROY" + " = "
						+ "true");
				log4jParamters_tFileArchive_1.append(" | ");
				log4jParamters_tFileArchive_1
						.append("TARGET"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash+context.client+\"_\"+context.reportMonth+\".zip\"");
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
						+ "ASNEEDED");
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

				String sourceFile_tFileArchive_1 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash;

				String zipFile_tFileArchive_1 = context.shipping
						+ context.slash + context.reportYear + context.mDrive
						+ context.slash + context.client + context.slash
						+ context.jobNumber + context.slash
						+ context.reportMonth + context.slash + context.client
						+ "_" + context.reportMonth + ".zip";

				com.talend.compress.zip.Zip zip_tFileArchive_1 = new com.talend.compress.zip.Zip(
						sourceFile_tFileArchive_1, zipFile_tFileArchive_1);
				zip_tFileArchive_1.setOverwriteExistTargetZip(true);
				zip_tFileArchive_1.setMakeTargetDir(false);
				zip_tFileArchive_1.setCompressLevel(4);
				zip_tFileArchive_1.setArchiveFormat("zip");
				zip_tFileArchive_1.setAllFiles(true);

				zip_tFileArchive_1.setContainSubDir(true);
				zip_tFileArchive_1.setEncoding("ISO-8859-15");
				zip_tFileArchive_1.setZip64Mode("ASNEEDED");
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
								(context.shipping + context.slash
										+ context.reportYear + context.mDrive
										+ context.slash + context.client
										+ context.slash + context.jobNumber
										+ context.slash + context.reportMonth
										+ context.slash + context.client + "_"
										+ context.reportMonth + ".zip")
										.contains("\\") ? (context.shipping
										+ context.slash + context.reportYear
										+ context.mDrive + context.slash
										+ context.client + context.slash
										+ context.jobNumber + context.slash
										+ context.reportMonth + context.slash
										+ context.client + "_"
										+ context.reportMonth + ".zip")
										.substring(((context.shipping
												+ context.slash
												+ context.reportYear
												+ context.mDrive
												+ context.slash
												+ context.client
												+ context.slash
												+ context.jobNumber
												+ context.slash
												+ context.reportMonth
												+ context.slash
												+ context.client + "_"
												+ context.reportMonth + ".zip")
												.lastIndexOf("\\") + 2))
										: (context.shipping + context.slash
												+ context.reportYear
												+ context.mDrive
												+ context.slash
												+ context.client
												+ context.slash
												+ context.jobNumber
												+ context.slash
												+ context.reportMonth
												+ context.slash
												+ context.client + "_"
												+ context.reportMonth + ".zip")
												.substring(((context.shipping
														+ context.slash
														+ context.reportYear
														+ context.mDrive
														+ context.slash
														+ context.client
														+ context.slash
														+ context.jobNumber
														+ context.slash
														+ context.reportMonth
														+ context.slash
														+ context.client + "_"
														+ context.reportMonth + ".zip")
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

				tSendMail_8Process(globalMap);
				tFileList_8Process(globalMap);

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

	public void tSendMail_8Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tSendMail_8_SUBPROCESS_STATE", 0);

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
				 * [tSendMail_8 begin ] start
				 */

				ok_Hash.put("tSendMail_8", false);
				start_Hash.put("tSendMail_8", System.currentTimeMillis());

				currentComponent = "tSendMail_8";

				int tos_count_tSendMail_8 = 0;

				if (log.isInfoEnabled())
					log.info("tSendMail_8 - " + "Start to work.");
				StringBuilder log4jParamters_tSendMail_8 = new StringBuilder();
				log4jParamters_tSendMail_8.append("Parameters:");
				log4jParamters_tSendMail_8.append("TO" + " = "
						+ "context.altEmailTo");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("FROM" + " = "
						+ "context.altEmailTo");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("CC" + " = " + "");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("BCC" + " = " + "");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8
						.append("SUBJECT"
								+ " = "
								+ "context.client + \" Talend Job Completed Successfully\"");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8
						.append("MESSAGE"
								+ " = "
								+ "\"<html> <body>   <br>  <br>  Talend Job Completed Successfully.  </body>  </html>\"");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("ATTACHMENTS" + " = " + "[]");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("SMTP_HOST" + " = "
						+ "context.smtpHost");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("SMTP_PORT" + " = " + "25");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("SSL" + " = " + "false");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("STARTTLS" + " = " + "false");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("IMPORTANCE" + " = "
						+ "Normal");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8
						.append("NEED_AUTH" + " = " + "false");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("DIE_ON_ERROR" + " = "
						+ "true");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("TEXT_SUBTYPE" + " = "
						+ "html");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tSendMail_8.append(" | ");
				log4jParamters_tSendMail_8.append("SET_LOCALHOST" + " = "
						+ "false");
				log4jParamters_tSendMail_8.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSendMail_8 - " + log4jParamters_tSendMail_8);

				/**
				 * [tSendMail_8 begin ] stop
				 */

				/**
				 * [tSendMail_8 main ] start
				 */

				currentComponent = "tSendMail_8";

				String smtpHost_tSendMail_8 = context.smtpHost;
				String smtpPort_tSendMail_8 = "25";
				String from_tSendMail_8 = (context.altEmailTo);
				String to_tSendMail_8 = (context.altEmailTo).replace(";", ",");
				String cc_tSendMail_8 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String bcc_tSendMail_8 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String subject_tSendMail_8 = (context.client + " Talend Job Completed Successfully");

				java.util.List<java.util.Map<String, String>> headers_tSendMail_8 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_8 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_8 = new java.util.ArrayList<String>();

				String message_tSendMail_8 = (("<html> <body>\n <br>\n<br>\nTalend Job Completed Successfully.\n</body>\n</html>") == null || ""
						.equals("<html> <body>\n <br>\n<br>\nTalend Job Completed Successfully.\n</body>\n</html>")) ? "\"\""
						: ("<html> <body>\n <br>\n<br>\nTalend Job Completed Successfully.\n</body>\n</html>");
				java.util.Properties props_tSendMail_8 = System.getProperties();
				props_tSendMail_8.put("mail.smtp.host", smtpHost_tSendMail_8);
				props_tSendMail_8.put("mail.smtp.port", smtpPort_tSendMail_8);
				props_tSendMail_8.put("mail.mime.encodefilename", "true");
				try {

					log.info("tSendMail_8 - Connection attempt to '"
							+ smtpHost_tSendMail_8 + "'.");

					props_tSendMail_8.put("mail.smtp.auth", "false");
					javax.mail.Session session_tSendMail_8 = javax.mail.Session
							.getInstance(props_tSendMail_8, null);

					log.info("tSendMail_8 - Connection to '"
							+ smtpHost_tSendMail_8 + "' has succeeded.");

					javax.mail.Message msg_tSendMail_8 = new javax.mail.internet.MimeMessage(
							session_tSendMail_8);
					msg_tSendMail_8
							.setFrom(new javax.mail.internet.InternetAddress(
									from_tSendMail_8, null));
					msg_tSendMail_8.setRecipients(
							javax.mail.Message.RecipientType.TO,
							javax.mail.internet.InternetAddress.parse(
									to_tSendMail_8, false));
					if (cc_tSendMail_8 != null)
						msg_tSendMail_8.setRecipients(
								javax.mail.Message.RecipientType.CC,
								javax.mail.internet.InternetAddress.parse(
										cc_tSendMail_8, false));
					if (bcc_tSendMail_8 != null)
						msg_tSendMail_8.setRecipients(
								javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(
										bcc_tSendMail_8, false));
					msg_tSendMail_8.setSubject(subject_tSendMail_8);

					for (int i_tSendMail_8 = 0; i_tSendMail_8 < headers_tSendMail_8
							.size(); i_tSendMail_8++) {
						java.util.Map<String, String> header_tSendMail_8 = headers_tSendMail_8
								.get(i_tSendMail_8);
						msg_tSendMail_8.setHeader(
								header_tSendMail_8.get("KEY"),
								header_tSendMail_8.get("VALUE"));
					}
					msg_tSendMail_8.setSentDate(new Date());
					msg_tSendMail_8.setHeader("X-Priority", "3"); // High->1
																	// Normal->3
																	// Low->5
					javax.mail.Multipart mp_tSendMail_8 = new javax.mail.internet.MimeMultipart();
					javax.mail.internet.MimeBodyPart mbpText_tSendMail_8 = new javax.mail.internet.MimeBodyPart();
					mbpText_tSendMail_8.setText(message_tSendMail_8,
							"ISO-8859-15", "html");
					mp_tSendMail_8.addBodyPart(mbpText_tSendMail_8);

					javax.mail.internet.MimeBodyPart mbpFile_tSendMail_8 = null;

					for (int i_tSendMail_8 = 0; i_tSendMail_8 < attachments_tSendMail_8
							.size(); i_tSendMail_8++) {
						String filename_tSendMail_8 = attachments_tSendMail_8
								.get(i_tSendMail_8);
						javax.activation.FileDataSource fds_tSendMail_8 = null;
						java.io.File file_tSendMail_8 = new java.io.File(
								filename_tSendMail_8);

						if (file_tSendMail_8.isDirectory()) {
							java.io.File[] subFiles_tSendMail_8 = file_tSendMail_8
									.listFiles();
							for (java.io.File subFile_tSendMail_8 : subFiles_tSendMail_8) {
								if (subFile_tSendMail_8.isFile()) {
									fds_tSendMail_8 = new javax.activation.FileDataSource(
											subFile_tSendMail_8
													.getAbsolutePath());
									mbpFile_tSendMail_8 = new javax.mail.internet.MimeBodyPart();
									mbpFile_tSendMail_8
											.setDataHandler(new javax.activation.DataHandler(
													fds_tSendMail_8));
									mbpFile_tSendMail_8
											.setFileName(javax.mail.internet.MimeUtility
													.encodeText(fds_tSendMail_8
															.getName()));
									if (contentTransferEncoding_tSendMail_8
											.get(i_tSendMail_8)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_8.setHeader(
												"Content-Transfer-Encoding",
												"base64");
									}
									mp_tSendMail_8
											.addBodyPart(mbpFile_tSendMail_8);
								}
							}
						} else {
							mbpFile_tSendMail_8 = new javax.mail.internet.MimeBodyPart();
							fds_tSendMail_8 = new javax.activation.FileDataSource(
									filename_tSendMail_8);
							mbpFile_tSendMail_8
									.setDataHandler(new javax.activation.DataHandler(
											fds_tSendMail_8));
							mbpFile_tSendMail_8
									.setFileName(javax.mail.internet.MimeUtility
											.encodeText(fds_tSendMail_8
													.getName()));
							if (contentTransferEncoding_tSendMail_8.get(
									i_tSendMail_8).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_8.setHeader(
										"Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_8.addBodyPart(mbpFile_tSendMail_8);
						}
					}
					// -- set the content --
					msg_tSendMail_8.setContent(mp_tSendMail_8);
					// add handlers for main MIME types
					javax.activation.MailcapCommandMap mc_tSendMail_8 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
							.getDefaultCommandMap();
					mc_tSendMail_8
							.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
					mc_tSendMail_8
							.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
					mc_tSendMail_8
							.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
					mc_tSendMail_8
							.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
					mc_tSendMail_8
							.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
					javax.activation.CommandMap
							.setDefaultCommandMap(mc_tSendMail_8);
					// -- Send the message --
					javax.mail.Transport.send(msg_tSendMail_8);
				} catch (java.lang.Exception e) {

					throw (e);

				} finally {
					props_tSendMail_8.remove("mail.smtp.host");
					props_tSendMail_8.remove("mail.smtp.port");

					props_tSendMail_8.remove("mail.mime.encodefilename");

					props_tSendMail_8.remove("mail.smtp.auth");
				}

				tos_count_tSendMail_8++;

				/**
				 * [tSendMail_8 main ] stop
				 */

				/**
				 * [tSendMail_8 end ] start
				 */

				currentComponent = "tSendMail_8";

				if (log.isInfoEnabled())
					log.info("tSendMail_8 - " + "Done.");

				ok_Hash.put("tSendMail_8", true);
				end_Hash.put("tSendMail_8", System.currentTimeMillis());

				tFileInputDelimited_1Process(globalMap);

				/**
				 * [tSendMail_8 end ] stop
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
				 * [tSendMail_8 finally ] start
				 */

				currentComponent = "tSendMail_8";

				/**
				 * [tSendMail_8 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSendMail_8_SUBPROCESS_STATE", 1);
	}

	public static class row19Struct implements
			routines.system.IPersistableRow<row19Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

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
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

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
		public int compareTo(row19Struct other) {

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

				row19Struct row19 = new row19Struct();

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
								+ "context.localDirectory+context.slash+\"AIS_OWNER_\"+context.dbVersion+\".txt\"");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileInputDelimited_1.append(" | ");
				log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR"
						+ " = " + "context.lineFeed");
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
							+ context.slash
							+ "AIS_OWNER_"
							+ context.dbVersion
							+ ".txt";
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
								context.localDirectory + context.slash
										+ "AIS_OWNER_" + context.dbVersion
										+ ".txt", "ISO-8859-15", ",",
								context.lineFeed, true, 0, 0, -1, -1, false);
					} catch (java.lang.Exception e) {

						log.error("tFileInputDelimited_1 - " + e.getMessage());

						System.err.println(e.getMessage());

					}

					log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");

					while (fid_tFileInputDelimited_1 != null
							&& fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();

						row19 = null;

						boolean whetherReject_tFileInputDelimited_1 = false;
						row19 = new row19Struct();
						try {

							int columnIndexWithD_tFileInputDelimited_1 = 0;

							columnIndexWithD_tFileInputDelimited_1 = 0;

							row19.USER = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 1;

							row19.PASSWORD = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 2;

							row19.HST_NAME = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 3;

							row19.DB_NAME = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 4;

							row19.SCHEMA = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 5;

							row19.FTP_HOST = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 6;

							row19.FTP_USER = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 7;

							row19.FTP_PASSWORD = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 8;

							row19.PROD_EMAIL = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 9;

							row19.SHIP_EMAIL = fid_tFileInputDelimited_1
									.get(columnIndexWithD_tFileInputDelimited_1);

							columnIndexWithD_tFileInputDelimited_1 = 10;

							row19.SMTP_HOST = fid_tFileInputDelimited_1
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
							row19 = null;

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
						// Start of branch "row19"
						if (row19 != null) {

							/**
							 * [tJavaRow_1 main ] start
							 */

							currentComponent = "tJavaRow_1";

							if (log.isTraceEnabled()) {
								log.trace("row19 - "
										+ (row19 == null ? "" : row19
												.toLogString()));
							}

							// Code generate accord to input schema and output
							// schmea
							context.dbUser = row19.USER;
							context.dbPassword = row19.PASSWORD;
							context.dbHostName = row19.HST_NAME;
							context.dbName = row19.DB_NAME;
							context.dbSchema = row19.SCHEMA;
							context.ftpHost = row19.FTP_HOST;
							context.ftpUser = row19.FTP_USER;
							context.ftpPassword = row19.FTP_PASSWORD;
							context.prodEmail = row19.PROD_EMAIL;
							context.shipEmail = row19.SHIP_EMAIL;
							context.smtpHost = row19.SMTP_HOST;

							nb_line_tJavaRow_1++;

							tos_count_tJavaRow_1++;

							/**
							 * [tJavaRow_1 main ] stop
							 */

						} // End of branch "row19"

						/**
						 * [tFileInputDelimited_1 end ] start
						 */

						currentComponent = "tFileInputDelimited_1";

					}
				} finally {
					if (!((Object) (context.localDirectory + context.slash
							+ "AIS_OWNER_" + context.dbVersion + ".txt") instanceof java.io.InputStream)) {
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

				tOracleRow_1Process(globalMap);

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
						+ "ORACLE_11");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("PORT" + " = " + "\"1521\"");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_1.append(" | ");
				log4jParamters_tOracleRow_1
						.append("QUERY"
								+ " = "
								+ "\"INSERT INTO AIS_PROD_TALEND_METRICS   (LIST_STAT,JOB_NUMBER,JOB_NAME,JOB_TYPE,SALES_PERSON,RESOURCE_INT,  WRF_RECD_DATE,WRF_RECD_TIME,  START_DATE,START_TIME,  CUST_REQ_DATE,CUST_PROMISE_DATE,  DELIVERY_DATE,DELIVERY_TIME,  NBR_EXTERNAL_FILES,NBR_INTERNAL_DELIVERABLES,  NBR_CD_DVD,NBR_EMAIL,NBR_FTP,NBR_HARDCOPY,  NBR_EXTERNAL_DELIVERABLES,  JOB_CLASS,MET_STANDARD,PLATFORM,TALEND)  VALUES  ('STAT-T','\"+context.jobNumber+\"','\"+context.client+\"','M','\"+context.salesName+\"',  '\"+context.resourceInt+\"',  TO_TIMESTAMP('\"+context.startDate+\"','MM/DD/YY HH24:MI:SS'),   sysdate,  sysdate,sysdate,  sysdate,sysdate,  sysdate,sysdate,  0,8,0,0,8,0,8,'Z','Y',  'TALEND','SERVER')\"");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";
				log.debug("tOracleRow_1 - Driver ClassName: "
						+ driverClass_tOracleRow_1 + ".");

				String dbUser_tOracleRow_1 = context.dbUser;

				final String decryptedPassword_tOracleRow_1 = context.dbPassword;

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
						+ "INSERT INTO AIS_PROD_TALEND_METRICS   (LIST_STAT,JOB_NUMBER,JOB_NAME,JOB_TYPE,SALES_PERSON,RESOURCE_INT,  WRF_RECD_DATE,WRF_RECD_TIME,  START_DATE,START_TIME,  CUST_REQ_DATE,CUST_PROMISE_DATE,  DELIVERY_DATE,DELIVERY_TIME,  NBR_EXTERNAL_FILES,NBR_INTERNAL_DELIVERABLES,  NBR_CD_DVD,NBR_EMAIL,NBR_FTP,NBR_HARDCOPY,  NBR_EXTERNAL_DELIVERABLES,  JOB_CLASS,MET_STANDARD,PLATFORM,TALEND)  VALUES  ('STAT-T','"
						+ context.jobNumber
						+ "','"
						+ context.client
						+ "','M','"
						+ context.salesName
						+ "',  '"
						+ context.resourceInt
						+ "',  TO_TIMESTAMP('"
						+ context.startDate
						+ "','MM/DD/YY HH24:MI:SS'),   sysdate,  sysdate,sysdate,  sysdate,sysdate,  sysdate,sysdate,  0,8,0,0,8,0,8,'Z','Y',  'TALEND','SERVER')"
						+ "'.");

				query_tOracleRow_1 = "INSERT INTO AIS_PROD_TALEND_METRICS \n(LIST_STAT,JOB_NUMBER,JOB_NAME,JOB_TYPE,SALES_PERSON,RESOURCE_INT,\nWRF_RECD_DATE,WRF_RECD_TIME,\nSTART_DATE,START_TIME,\nCUST_REQ_DATE,CUST_PROMISE_DATE,\nDELIVERY_DATE,DELIVERY_TIME,\nNBR_EXTERNAL_FILES,NBR_INTERNAL_DELIVERABLES,\nNBR_CD_DVD,NBR_EMAIL,NBR_FTP,NBR_HARDCOPY,\nNBR_EXTERNAL_DELIVERABLES,\nJOB_CLASS,MET_STANDARD,PLATFORM,TALEND)\nVALUES\n('STAT-T','"
						+ context.jobNumber
						+ "','"
						+ context.client
						+ "','M','"
						+ context.salesName
						+ "',\n'"
						+ context.resourceInt
						+ "',\nTO_TIMESTAMP('"
						+ context.startDate
						+ "','MM/DD/YY HH24:MI:SS'), \nsysdate,\nsysdate,sysdate,\nsysdate,sysdate,\nsysdate,sysdate,\n0,8,0,0,8,0,8,'Z','Y',\n'TALEND','SERVER')";
				whetherReject_tOracleRow_1 = false;
				globalMap.put("tOracleRow_1_QUERY", query_tOracleRow_1);
				try {
					stmt_tOracleRow_1.execute(query_tOracleRow_1);

					log.info("tOracleRow_1 - Execute the query: '"
							+ "INSERT INTO AIS_PROD_TALEND_METRICS \n(LIST_STAT,JOB_NUMBER,JOB_NAME,JOB_TYPE,SALES_PERSON,RESOURCE_INT,\nWRF_RECD_DATE,WRF_RECD_TIME,\nSTART_DATE,START_TIME,\nCUST_REQ_DATE,CUST_PROMISE_DATE,\nDELIVERY_DATE,DELIVERY_TIME,\nNBR_EXTERNAL_FILES,NBR_INTERNAL_DELIVERABLES,\nNBR_CD_DVD,NBR_EMAIL,NBR_FTP,NBR_HARDCOPY,\nNBR_EXTERNAL_DELIVERABLES,\nJOB_CLASS,MET_STANDARD,PLATFORM,TALEND)\nVALUES\n('STAT-T','"
							+ context.jobNumber
							+ "','"
							+ context.client
							+ "','M','"
							+ context.salesName
							+ "',\n'"
							+ context.resourceInt
							+ "',\nTO_TIMESTAMP('"
							+ context.startDate
							+ "','MM/DD/YY HH24:MI:SS'), \nsysdate,\nsysdate,sysdate,\nsysdate,sysdate,\nsysdate,sysdate,\n0,8,0,0,8,0,8,'Z','Y',\n'TALEND','SERVER')"
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

				tOracleRow_2Process(globalMap);

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
						+ "ORACLE_11");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("HOST" + " = "
						+ "context.dbHostName");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("PORT" + " = " + "\"1521\"");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("DBNAME" + " = "
						+ "context.dbName");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("SCHEMA_DB" + " = "
						+ "context.dbSchema");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("USER" + " = "
						+ "context.dbUser");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("PASS"
						+ " = "
						+ String.valueOf(
								routines.system.PasswordEncryptUtil
										.encryptPassword(context.dbPassword))
								.substring(0, 4) + "...");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2.append("QUERYSTORE" + " = "
						+ "\"\"");
				log4jParamters_tOracleRow_2.append(" | ");
				log4jParamters_tOracleRow_2
						.append("QUERY"
								+ " = "
								+ "\"UPDATE AIS_JOBS_STAT_REPORT_MONTHS   SET DELIVERED = 'YES'  WHERE JOB_ID = '\"+context.jobID+\"'  AND REPORT_MONTH = '\"+context.reportMonth+\"'\"");
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
						+ context.dbHostName
						+ ")(port="
						+ "1521"
						+ "))(connect_data=(service_name="
						+ context.dbName
						+ ")))";
				log.debug("tOracleRow_2 - Driver ClassName: "
						+ driverClass_tOracleRow_2 + ".");

				String dbUser_tOracleRow_2 = context.dbUser;

				final String decryptedPassword_tOracleRow_2 = context.dbPassword;

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
						+ "UPDATE AIS_JOBS_STAT_REPORT_MONTHS   SET DELIVERED = 'YES'  WHERE JOB_ID = '"
						+ context.jobID + "'  AND REPORT_MONTH = '"
						+ context.reportMonth + "'" + "'.");

				query_tOracleRow_2 = "UPDATE AIS_JOBS_STAT_REPORT_MONTHS\n SET DELIVERED = 'YES'\nWHERE JOB_ID = '"
						+ context.jobID
						+ "'\nAND REPORT_MONTH = '"
						+ context.reportMonth + "'";
				whetherReject_tOracleRow_2 = false;
				globalMap.put("tOracleRow_2_QUERY", query_tOracleRow_2);
				try {
					stmt_tOracleRow_2.execute(query_tOracleRow_2);

					log.info("tOracleRow_2 - Execute the query: '"
							+ "UPDATE AIS_JOBS_STAT_REPORT_MONTHS\n SET DELIVERED = 'YES'\nWHERE JOB_ID = '"
							+ context.jobID + "'\nAND REPORT_MONTH = '"
							+ context.reportMonth + "'" + "' has finished.");

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

	public void tFileList_8Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFileList_8_SUBPROCESS_STATE", 0);

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
				 * [tFileList_8 begin ] start
				 */

				int NB_ITERATE_tFileDelete_2 = 0; // for statistics

				ok_Hash.put("tFileList_8", false);
				start_Hash.put("tFileList_8", System.currentTimeMillis());

				currentComponent = "tFileList_8";

				int tos_count_tFileList_8 = 0;

				if (log.isInfoEnabled())
					log.info("tFileList_8 - " + "Start to work.");
				StringBuilder log4jParamters_tFileList_8 = new StringBuilder();
				log4jParamters_tFileList_8.append("Parameters:");
				log4jParamters_tFileList_8
						.append("DIRECTORY"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("LIST_MODE" + " = " + "BOTH");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("INCLUDSUBDIR" + " = "
						+ "true");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("CASE_SENSITIVE" + " = "
						+ "YES");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("ERROR" + " = " + "false");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("GLOBEXPRESSIONS" + " = "
						+ "true");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("FILES" + " = "
						+ "[{FILEMASK=" + ("\"*.txt\"") + "}, {FILEMASK="
						+ ("\"*.DONE\"") + "}, {FILEMASK=" + ("\"*.txt.pgp\"")
						+ "}, {FILEMASK=" + ("\"QC_LOG\"") + "}]");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("ORDER_BY_NOTHING" + " = "
						+ "true");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("ORDER_BY_FILENAME" + " = "
						+ "false");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("ORDER_BY_FILESIZE" + " = "
						+ "false");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("ORDER_BY_MODIFIEDDATE"
						+ " = " + "false");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("ORDER_ACTION_ASC" + " = "
						+ "true");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("ORDER_ACTION_DESC" + " = "
						+ "false");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8
						.append("IFEXCLUDE" + " = " + "false");
				log4jParamters_tFileList_8.append(" | ");
				log4jParamters_tFileList_8.append("FORMAT_FILEPATH_TO_SLASH"
						+ " = " + "false");
				log4jParamters_tFileList_8.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileList_8 - " + log4jParamters_tFileList_8);

				final StringBuffer log4jSb_tFileList_8 = new StringBuffer();

				String directory_tFileList_8 = context.shipping + context.slash
						+ context.reportYear + context.mDrive + context.slash
						+ context.client + context.slash + context.jobNumber
						+ context.slash + context.reportMonth + context.slash;
				final java.util.List<String> maskList_tFileList_8 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_8 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_8.add("*.txt");
				maskList_tFileList_8.add("*.DONE");
				maskList_tFileList_8.add("*.txt.pgp");
				maskList_tFileList_8.add("QC_LOG");
				for (final String filemask_tFileList_8 : maskList_tFileList_8) {
					String filemask_compile_tFileList_8 = filemask_tFileList_8;

					filemask_compile_tFileList_8 = org.apache.oro.text.GlobCompiler
							.globToPerl5(
									filemask_tFileList_8.toCharArray(),
									org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_8 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_8);
					patternList_tFileList_8.add(fileNamePattern_tFileList_8);
				}
				int NB_FILEtFileList_8 = 0;

				final boolean case_sensitive_tFileList_8 = true;
				final java.util.List<java.io.File> list_tFileList_8 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_8 = new java.util.HashSet<String>();
				java.io.File file_tFileList_8 = new java.io.File(
						directory_tFileList_8);

				file_tFileList_8.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);

						String fileName_tFileList_8 = file.getName();
						for (final java.util.regex.Pattern fileNamePattern_tFileList_8 : patternList_tFileList_8) {
							if (fileNamePattern_tFileList_8.matcher(
									fileName_tFileList_8).matches()) {
								if (!filePath_tFileList_8.contains(file
										.getAbsolutePath())) {
									list_tFileList_8.add(file);
									filePath_tFileList_8.add(file
											.getAbsolutePath());
								}
							}
						}
						if (file.isDirectory()) {
							file.listFiles(this);
						}

						return false;
					}
				});
				java.util.Collections.sort(list_tFileList_8);

				log.info("tFileList_8 - Start to list files");

				for (int i_tFileList_8 = 0; i_tFileList_8 < list_tFileList_8
						.size(); i_tFileList_8++) {
					java.io.File files_tFileList_8 = list_tFileList_8
							.get(i_tFileList_8);
					String fileName_tFileList_8 = files_tFileList_8.getName();

					String currentFileName_tFileList_8 = files_tFileList_8
							.getName();
					String currentFilePath_tFileList_8 = files_tFileList_8
							.getAbsolutePath();
					String currentFileDirectory_tFileList_8 = files_tFileList_8
							.getParent();
					String currentFileExtension_tFileList_8 = null;

					if (files_tFileList_8.getName().contains(".")
							&& files_tFileList_8.isFile()) {
						currentFileExtension_tFileList_8 = files_tFileList_8
								.getName().substring(
										files_tFileList_8.getName()
												.lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_8 = "";
					}

					NB_FILEtFileList_8++;
					globalMap.put("tFileList_8_CURRENT_FILE",
							currentFileName_tFileList_8);
					globalMap.put("tFileList_8_CURRENT_FILEPATH",
							currentFilePath_tFileList_8);
					globalMap.put("tFileList_8_CURRENT_FILEDIRECTORY",
							currentFileDirectory_tFileList_8);
					globalMap.put("tFileList_8_CURRENT_FILEEXTENSION",
							currentFileExtension_tFileList_8);
					globalMap.put("tFileList_8_NB_FILE", NB_FILEtFileList_8);

					log.info("tFileList_8 - Current file or directory path : "
							+ currentFilePath_tFileList_8);

					/**
					 * [tFileList_8 begin ] stop
					 */

					/**
					 * [tFileList_8 main ] start
					 */

					currentComponent = "tFileList_8";

					tos_count_tFileList_8++;

					/**
					 * [tFileList_8 main ] stop
					 */
					NB_ITERATE_tFileDelete_2++;

					/**
					 * [tFileDelete_2 begin ] start
					 */

					ok_Hash.put("tFileDelete_2", false);
					start_Hash.put("tFileDelete_2", System.currentTimeMillis());

					currentComponent = "tFileDelete_2";

					int tos_count_tFileDelete_2 = 0;

					if (log.isInfoEnabled())
						log.info("tFileDelete_2 - " + "Start to work.");
					StringBuilder log4jParamters_tFileDelete_2 = new StringBuilder();
					log4jParamters_tFileDelete_2.append("Parameters:");
					log4jParamters_tFileDelete_2
							.append("PATH"
									+ " = "
									+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth+context.slash + ((String)globalMap.get(\"tFileList_8_CURRENT_FILE\"))");
					log4jParamters_tFileDelete_2.append(" | ");
					log4jParamters_tFileDelete_2.append("FAILON" + " = "
							+ "false");
					log4jParamters_tFileDelete_2.append(" | ");
					log4jParamters_tFileDelete_2.append("FOLDER_FILE" + " = "
							+ "true");
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
							context.shipping
									+ context.slash
									+ context.reportYear
									+ context.mDrive
									+ context.slash
									+ context.client
									+ context.slash
									+ context.jobNumber
									+ context.slash
									+ context.reportMonth
									+ context.slash
									+ ((String) globalMap
											.get("tFileList_8_CURRENT_FILE")));
					if (path_tFileDelete_2.exists()) {
						if (path_tFileDelete_2.isFile()) {
							if (path_tFileDelete_2.delete()) {
								globalMap.put("tFileDelete_2_CURRENT_STATUS",
										"File deleted.");
								log.info("tFileDelete_2 - File : "
										+ path_tFileDelete_2.getAbsolutePath()
										+ " is deleted.");
							} else {
								globalMap.put("tFileDelete_2_CURRENT_STATUS",
										"No file deleted.");
								log.info("tFileDelete_2 - Fail to delete file : "
										+ path_tFileDelete_2.getAbsolutePath());
							}
						} else if (path_tFileDelete_2.isDirectory()) {
							DeleteFoldertFileDelete_2 dftFileDelete_2 = new DeleteFoldertFileDelete_2();
							if (dftFileDelete_2.delete(path_tFileDelete_2)) {
								globalMap.put("tFileDelete_2_CURRENT_STATUS",
										"Path deleted.");
								log.info("tFileDelete_2 - Directory : "
										+ path_tFileDelete_2.getAbsolutePath()
										+ " is deleted.");
							} else {
								globalMap.put("tFileDelete_2_CURRENT_STATUS",
										"No path deleted.");
								log.info("tFileDelete_2 - Fail to delete directory : "
										+ path_tFileDelete_2.getAbsolutePath());
							}
						}
					} else {
						globalMap.put("tFileDelete_2_CURRENT_STATUS",
								"File or path does not exist or is invalid.");
						log.error("tFileDelete_2 - File or directory : "
								+ path_tFileDelete_2.getAbsolutePath()
								+ " does not exist or is invalid.");
					}
					globalMap.put(
							"tFileDelete_2_DELETE_PATH",
							context.shipping
									+ context.slash
									+ context.reportYear
									+ context.mDrive
									+ context.slash
									+ context.client
									+ context.slash
									+ context.jobNumber
									+ context.slash
									+ context.reportMonth
									+ context.slash
									+ ((String) globalMap
											.get("tFileList_8_CURRENT_FILE")));

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
					end_Hash.put("tFileDelete_2", System.currentTimeMillis());

					/**
					 * [tFileDelete_2 end ] stop
					 */

					/**
					 * [tFileList_8 end ] start
					 */

					currentComponent = "tFileList_8";

				}
				globalMap.put("tFileList_8_NB_FILE", NB_FILEtFileList_8);

				log.info("tFileList_8 - File or directory count : "
						+ NB_FILEtFileList_8);

				if (log.isInfoEnabled())
					log.info("tFileList_8 - " + "Done.");

				ok_Hash.put("tFileList_8", true);
				end_Hash.put("tFileList_8", System.currentTimeMillis());

				/**
				 * [tFileList_8 end ] stop
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
				 * [tFileList_8 finally ] start
				 */

				currentComponent = "tFileList_8";

				/**
				 * [tFileList_8 finally ] stop
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

		globalMap.put("tFileList_8_SUBPROCESS_STATE", 1);
	}

	public static class row24Struct implements
			routines.system.IPersistableRow<row24Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String TEST;

		public String getTEST() {
			return this.TEST;
		}

		public String RESULT;

		public String getRESULT() {
			return this.RESULT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.TEST = readString(dis);

					this.RESULT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TEST, dos);

				// String

				writeString(this.RESULT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TEST=" + TEST);
			sb.append(",RESULT=" + RESULT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TEST == null) {
				sb.append("<null>");
			} else {
				sb.append(TEST);
			}

			sb.append("|");

			if (RESULT == null) {
				sb.append("<null>");
			} else {
				sb.append(RESULT);
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

	public void tFixedFlowInput_4Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFixedFlowInput_4_SUBPROCESS_STATE", 0);

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
				 * [tFileOutputDelimited_4 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_4", false);
				start_Hash.put("tFileOutputDelimited_4",
						System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_4";

				int tos_count_tFileOutputDelimited_4 = 0;

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_4 - " + "Start to work.");
				StringBuilder log4jParamters_tFileOutputDelimited_4 = new StringBuilder();
				log4jParamters_tFileOutputDelimited_4.append("Parameters:");
				log4jParamters_tFileOutputDelimited_4.append("USESTREAM"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4
						.append("FILENAME"
								+ " = "
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"QC_LOG\" + context.slash + \"QC_LOG.csv\"");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("ROWSEPARATOR"
						+ " = " + "\"\\n\"");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("APPEND" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("INCLUDEHEADER"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4
						.append("ADVANCED_SEPARATOR" + " = " + "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("CSV_OPTION"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("CREATE" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("SPLIT" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("FLUSHONROW"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("ROW_MODE" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				log4jParamters_tFileOutputDelimited_4.append("DELETE_EMPTYFILE"
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_4.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_4 - "
							+ log4jParamters_tFileOutputDelimited_4);

				String fileName_tFileOutputDelimited_4 = "";
				fileName_tFileOutputDelimited_4 = (new java.io.File(
						context.shipping + context.slash + context.reportYear
								+ context.mDrive + context.slash
								+ context.client + context.slash
								+ context.jobNumber + context.slash
								+ context.reportMonth + context.slash
								+ "QC_LOG" + context.slash + "QC_LOG.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_4 = null;
				String extension_tFileOutputDelimited_4 = null;
				String directory_tFileOutputDelimited_4 = null;
				if ((fileName_tFileOutputDelimited_4.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_4.lastIndexOf(".") < fileName_tFileOutputDelimited_4
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4;
						extension_tFileOutputDelimited_4 = "";
					} else {
						fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4
								.substring(0, fileName_tFileOutputDelimited_4
										.lastIndexOf("."));
						extension_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4
								.substring(fileName_tFileOutputDelimited_4
										.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4
							.substring(0, fileName_tFileOutputDelimited_4
									.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_4.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4
								.substring(0, fileName_tFileOutputDelimited_4
										.lastIndexOf("."));
						extension_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4
								.substring(fileName_tFileOutputDelimited_4
										.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_4 = fileName_tFileOutputDelimited_4;
						extension_tFileOutputDelimited_4 = "";
					}
					directory_tFileOutputDelimited_4 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_4 = true;
				java.io.File filetFileOutputDelimited_4 = new java.io.File(
						fileName_tFileOutputDelimited_4);
				globalMap.put("tFileOutputDelimited_4_FILE_NAME",
						fileName_tFileOutputDelimited_4);
				if (filetFileOutputDelimited_4.exists()) {
					isFileGenerated_tFileOutputDelimited_4 = false;
				}
				int nb_line_tFileOutputDelimited_4 = 0;
				int splitEvery_tFileOutputDelimited_4 = 1000;
				int splitedFileNo_tFileOutputDelimited_4 = 0;
				int currentRow_tFileOutputDelimited_4 = 0;

				final String OUT_DELIM_tFileOutputDelimited_4 = /**
				 * Start field
				 * tFileOutputDelimited_4:FIELDSEPARATOR
				 */
				","/** End field tFileOutputDelimited_4:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_4 = /**
				 * Start
				 * field tFileOutputDelimited_4:ROWSEPARATOR
				 */
				"\n"/** End field tFileOutputDelimited_4:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_4 != null
						&& directory_tFileOutputDelimited_4.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_4 = new java.io.File(
							directory_tFileOutputDelimited_4);
					if (!dir_tFileOutputDelimited_4.exists()) {
						log.info("tFileOutputDelimited_4 - Creating directory '"
								+ dir_tFileOutputDelimited_4.getCanonicalPath()
								+ "'.");
						dir_tFileOutputDelimited_4.mkdirs();
						log.info("tFileOutputDelimited_4 - The directory '"
								+ dir_tFileOutputDelimited_4.getCanonicalPath()
								+ "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_4 = null;

				outtFileOutputDelimited_4 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_4, true),
								"ISO-8859-15"));

				resourceMap.put("out_tFileOutputDelimited_4",
						outtFileOutputDelimited_4);
				resourceMap.put("nb_line_tFileOutputDelimited_4",
						nb_line_tFileOutputDelimited_4);

				/**
				 * [tFileOutputDelimited_4 begin ] stop
				 */

				/**
				 * [tFixedFlowInput_4 begin ] start
				 */

				ok_Hash.put("tFixedFlowInput_4", false);
				start_Hash.put("tFixedFlowInput_4", System.currentTimeMillis());

				currentComponent = "tFixedFlowInput_4";

				int tos_count_tFixedFlowInput_4 = 0;

				for (int i_tFixedFlowInput_4 = 0; i_tFixedFlowInput_4 < 1; i_tFixedFlowInput_4++) {

					row24.TEST = "FILE ROW COUNT("
							+ ((Integer) globalMap.get("rowcount"))
							+ "): "
							+ ((String) globalMap
									.get("tFileList_10_CURRENT_FILE"));

					row24.RESULT = "FAILED";

					/**
					 * [tFixedFlowInput_4 begin ] stop
					 */

					/**
					 * [tFixedFlowInput_4 main ] start
					 */

					currentComponent = "tFixedFlowInput_4";

					tos_count_tFixedFlowInput_4++;

					/**
					 * [tFixedFlowInput_4 main ] stop
					 */

					/**
					 * [tFileOutputDelimited_4 main ] start
					 */

					currentComponent = "tFileOutputDelimited_4";

					if (log.isTraceEnabled()) {
						log.trace("row24 - "
								+ (row24 == null ? "" : row24.toLogString()));
					}

					StringBuilder sb_tFileOutputDelimited_4 = new StringBuilder();
					if (row24.TEST != null) {
						sb_tFileOutputDelimited_4.append(row24.TEST);
					}
					sb_tFileOutputDelimited_4
							.append(OUT_DELIM_tFileOutputDelimited_4);
					if (row24.RESULT != null) {
						sb_tFileOutputDelimited_4.append(row24.RESULT);
					}
					sb_tFileOutputDelimited_4
							.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_4);

					synchronized (multiThreadLockWrite) {
						nb_line_tFileOutputDelimited_4++;
						resourceMap.put("nb_line_tFileOutputDelimited_4",
								nb_line_tFileOutputDelimited_4);

						outtFileOutputDelimited_4
								.write(sb_tFileOutputDelimited_4.toString());
						log.debug("tFileOutputDelimited_4 - Writing the record "
								+ nb_line_tFileOutputDelimited_4 + ".");

					}

					tos_count_tFileOutputDelimited_4++;

					/**
					 * [tFileOutputDelimited_4 main ] stop
					 */

					/**
					 * [tFixedFlowInput_4 end ] start
					 */

					currentComponent = "tFixedFlowInput_4";

				}
				globalMap.put("tFixedFlowInput_4_NB_LINE", 1);

				ok_Hash.put("tFixedFlowInput_4", true);
				end_Hash.put("tFixedFlowInput_4", System.currentTimeMillis());

				/**
				 * [tFixedFlowInput_4 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_4 end ] start
				 */

				currentComponent = "tFileOutputDelimited_4";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_4 != null) {
						outtFileOutputDelimited_4.flush();
						outtFileOutputDelimited_4.close();
					}

					globalMap.put("tFileOutputDelimited_4_NB_LINE",
							nb_line_tFileOutputDelimited_4);
					globalMap.put("tFileOutputDelimited_4_FILE_NAME",
							fileName_tFileOutputDelimited_4);

				}

				resourceMap.put("finish_tFileOutputDelimited_4", true);

				log.info("tFileOutputDelimited_4 - Written records count: "
						+ nb_line_tFileOutputDelimited_4 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_4 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_4", true);
				end_Hash.put("tFileOutputDelimited_4",
						System.currentTimeMillis());

				tSendMail_4Process(globalMap);

				/**
				 * [tFileOutputDelimited_4 end ] stop
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
				 * [tFixedFlowInput_4 finally ] start
				 */

				currentComponent = "tFixedFlowInput_4";

				/**
				 * [tFixedFlowInput_4 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_4 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_4";

				if (resourceMap.get("finish_tFileOutputDelimited_4") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_4 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_4");
						if (outtFileOutputDelimited_4 != null) {
							outtFileOutputDelimited_4.flush();
							outtFileOutputDelimited_4.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_4 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFixedFlowInput_4_SUBPROCESS_STATE", 1);
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
						+ "context.altEmailTo");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("FROM" + " = "
						+ "context.altEmailTo");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("CC" + " = " + "");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("BCC" + " = " + "");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("SUBJECT" + " = "
						+ "context.client + \" Error\"");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4
						.append("MESSAGE"
								+ " = "
								+ "\"<html> <body>   <br>  <br>  File row Count Fell below threshold.  </body>  </html>\"");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("ATTACHMENTS" + " = " + "[]");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_4.append(" | ");
				log4jParamters_tSendMail_4.append("SMTP_HOST" + " = "
						+ "context.smtpHost");
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

				String smtpHost_tSendMail_4 = context.smtpHost;
				String smtpPort_tSendMail_4 = "25";
				String from_tSendMail_4 = (context.altEmailTo);
				String to_tSendMail_4 = (context.altEmailTo).replace(";", ",");
				String cc_tSendMail_4 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String bcc_tSendMail_4 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String subject_tSendMail_4 = (context.client + " Error");

				java.util.List<java.util.Map<String, String>> headers_tSendMail_4 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_4 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_4 = new java.util.ArrayList<String>();

				String message_tSendMail_4 = (("<html> <body>\n <br>\n<br>\nFile row Count Fell below threshold.\n</body>\n</html>") == null || ""
						.equals("<html> <body>\n <br>\n<br>\nFile row Count Fell below threshold.\n</body>\n</html>")) ? "\"\""
						: ("<html> <body>\n <br>\n<br>\nFile row Count Fell below threshold.\n</body>\n</html>");
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

				tDie_2Process(globalMap);

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

	public void tDie_2Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tDie_2_SUBPROCESS_STATE", 0);

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
				 * [tDie_2 begin ] start
				 */

				ok_Hash.put("tDie_2", false);
				start_Hash.put("tDie_2", System.currentTimeMillis());

				currentComponent = "tDie_2";

				int tos_count_tDie_2 = 0;

				if (log.isInfoEnabled())
					log.info("tDie_2 - " + "Start to work.");
				StringBuilder log4jParamters_tDie_2 = new StringBuilder();
				log4jParamters_tDie_2.append("Parameters:");
				log4jParamters_tDie_2
						.append("MESSAGE"
								+ " = "
								+ "\"FILE ROW COUNT FELL BELOW THRESHOLD: \" + ((String)globalMap.get(\"tFileList_10_CURRENT_FILE\"))");
				log4jParamters_tDie_2.append(" | ");
				log4jParamters_tDie_2.append("CODE" + " = " + "4");
				log4jParamters_tDie_2.append(" | ");
				log4jParamters_tDie_2.append("PRIORITY" + " = " + "5");
				log4jParamters_tDie_2.append(" | ");
				log4jParamters_tDie_2.append("EXIT_JVM" + " = " + "false");
				log4jParamters_tDie_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tDie_2 - " + log4jParamters_tDie_2);

				/**
				 * [tDie_2 begin ] stop
				 */

				/**
				 * [tDie_2 main ] start
				 */

				currentComponent = "tDie_2";

				globalMap.put("tDie_2_DIE_PRIORITY", 5);
				System.err
						.println("FILE ROW COUNT FELL BELOW THRESHOLD: "
								+ ((String) globalMap
										.get("tFileList_10_CURRENT_FILE")));

				log.error("tDie_2 - The die message: "
						+ "FILE ROW COUNT FELL BELOW THRESHOLD: "
						+ ((String) globalMap.get("tFileList_10_CURRENT_FILE")));

				globalMap.put(
						"tDie_2_DIE_MESSAGE",
						"FILE ROW COUNT FELL BELOW THRESHOLD: "
								+ ((String) globalMap
										.get("tFileList_10_CURRENT_FILE")));
				globalMap.put(
						"tDie_2_DIE_MESSAGES",
						"FILE ROW COUNT FELL BELOW THRESHOLD: "
								+ ((String) globalMap
										.get("tFileList_10_CURRENT_FILE")));
				currentComponent = "tDie_2";
				status = "failure";
				errorCode = new Integer(4);
				((java.util.Map) threadLocal.get()).put("errorCode",
						new Integer(4));
				((java.util.Map) threadLocal.get()).put("status", "failure");
				globalMap.put("tDie_2_DIE_CODE", errorCode);

				if (true) {
					throw new TDieException();
				}

				tos_count_tDie_2++;

				/**
				 * [tDie_2 main ] stop
				 */

				/**
				 * [tDie_2 end ] start
				 */

				currentComponent = "tDie_2";

				if (log.isInfoEnabled())
					log.info("tDie_2 - " + "Done.");

				ok_Hash.put("tDie_2", true);
				end_Hash.put("tDie_2", System.currentTimeMillis());

				/**
				 * [tDie_2 end ] stop
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
				 * [tDie_2 finally ] start
				 */

				currentComponent = "tDie_2";

				/**
				 * [tDie_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDie_2_SUBPROCESS_STATE", 1);
	}

	public static class row23Struct implements
			routines.system.IPersistableRow<row23Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String TEST;

		public String getTEST() {
			return this.TEST;
		}

		public String RESULT;

		public String getRESULT() {
			return this.RESULT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.TEST = readString(dis);

					this.RESULT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TEST, dos);

				// String

				writeString(this.RESULT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TEST=" + TEST);
			sb.append(",RESULT=" + RESULT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TEST == null) {
				sb.append("<null>");
			} else {
				sb.append(TEST);
			}

			sb.append("|");

			if (RESULT == null) {
				sb.append("<null>");
			} else {
				sb.append(RESULT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row23Struct other) {

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

	public void tFixedFlowInput_3Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFixedFlowInput_3_SUBPROCESS_STATE", 0);

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

				row23Struct row23 = new row23Struct();

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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"QC_LOG\" + context.slash + \"QC_LOG.csv\"");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("ROWSEPARATOR"
						+ " = " + "\"\\n\"");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("APPEND" + " = "
						+ "true");
				log4jParamters_tFileOutputDelimited_3.append(" | ");
				log4jParamters_tFileOutputDelimited_3.append("INCLUDEHEADER"
						+ " = " + "false");
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
						context.shipping + context.slash + context.reportYear
								+ context.mDrive + context.slash
								+ context.client + context.slash
								+ context.jobNumber + context.slash
								+ context.reportMonth + context.slash
								+ "QC_LOG" + context.slash + "QC_LOG.csv"))
						.getAbsolutePath().replace("\\", "/");
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
				if (filetFileOutputDelimited_3.exists()) {
					isFileGenerated_tFileOutputDelimited_3 = false;
				}
				int nb_line_tFileOutputDelimited_3 = 0;
				int splitEvery_tFileOutputDelimited_3 = 1000;
				int splitedFileNo_tFileOutputDelimited_3 = 0;
				int currentRow_tFileOutputDelimited_3 = 0;

				final String OUT_DELIM_tFileOutputDelimited_3 = /**
				 * Start field
				 * tFileOutputDelimited_3:FIELDSEPARATOR
				 */
				","/** End field tFileOutputDelimited_3:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_3 = /**
				 * Start
				 * field tFileOutputDelimited_3:ROWSEPARATOR
				 */
				"\n"/** End field tFileOutputDelimited_3:ROWSEPARATOR */
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

				outtFileOutputDelimited_3 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_3, true),
								"ISO-8859-15"));

				resourceMap.put("out_tFileOutputDelimited_3",
						outtFileOutputDelimited_3);
				resourceMap.put("nb_line_tFileOutputDelimited_3",
						nb_line_tFileOutputDelimited_3);

				/**
				 * [tFileOutputDelimited_3 begin ] stop
				 */

				/**
				 * [tFixedFlowInput_3 begin ] start
				 */

				ok_Hash.put("tFixedFlowInput_3", false);
				start_Hash.put("tFixedFlowInput_3", System.currentTimeMillis());

				currentComponent = "tFixedFlowInput_3";

				int tos_count_tFixedFlowInput_3 = 0;

				for (int i_tFixedFlowInput_3 = 0; i_tFixedFlowInput_3 < 1; i_tFixedFlowInput_3++) {

					row23.TEST = "FILE ROW COUNT("
							+ ((Integer) globalMap.get("rowcount"))
							+ "): "
							+ ((String) globalMap
									.get("tFileList_10_CURRENT_FILE"));

					row23.RESULT = "PASSED";

					/**
					 * [tFixedFlowInput_3 begin ] stop
					 */

					/**
					 * [tFixedFlowInput_3 main ] start
					 */

					currentComponent = "tFixedFlowInput_3";

					tos_count_tFixedFlowInput_3++;

					/**
					 * [tFixedFlowInput_3 main ] stop
					 */

					/**
					 * [tFileOutputDelimited_3 main ] start
					 */

					currentComponent = "tFileOutputDelimited_3";

					if (log.isTraceEnabled()) {
						log.trace("row23 - "
								+ (row23 == null ? "" : row23.toLogString()));
					}

					StringBuilder sb_tFileOutputDelimited_3 = new StringBuilder();
					if (row23.TEST != null) {
						sb_tFileOutputDelimited_3.append(row23.TEST);
					}
					sb_tFileOutputDelimited_3
							.append(OUT_DELIM_tFileOutputDelimited_3);
					if (row23.RESULT != null) {
						sb_tFileOutputDelimited_3.append(row23.RESULT);
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
					 * [tFixedFlowInput_3 end ] start
					 */

					currentComponent = "tFixedFlowInput_3";

				}
				globalMap.put("tFixedFlowInput_3_NB_LINE", 1);

				ok_Hash.put("tFixedFlowInput_3", true);
				end_Hash.put("tFixedFlowInput_3", System.currentTimeMillis());

				/**
				 * [tFixedFlowInput_3 end ] stop
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
				 * [tFixedFlowInput_3 finally ] start
				 */

				currentComponent = "tFixedFlowInput_3";

				/**
				 * [tFixedFlowInput_3 finally ] stop
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

		globalMap.put("tFixedFlowInput_3_SUBPROCESS_STATE", 1);
	}

	public static class row22Struct implements
			routines.system.IPersistableRow<row22Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String TEST;

		public String getTEST() {
			return this.TEST;
		}

		public String RESULT;

		public String getRESULT() {
			return this.RESULT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.TEST = readString(dis);

					this.RESULT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TEST, dos);

				// String

				writeString(this.RESULT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TEST=" + TEST);
			sb.append(",RESULT=" + RESULT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TEST == null) {
				sb.append("<null>");
			} else {
				sb.append(TEST);
			}

			sb.append("|");

			if (RESULT == null) {
				sb.append("<null>");
			} else {
				sb.append(RESULT);
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

	public void tFixedFlowInput_2Process(
			final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tFixedFlowInput_2_SUBPROCESS_STATE", 0);

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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"QC_LOG\" + context.slash + \"QC_LOG.csv\"");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("ROWSEPARATOR"
						+ " = " + "\"\\n\"");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("APPEND" + " = "
						+ "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("INCLUDEHEADER"
						+ " = " + "true");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				log4jParamters_tFileOutputDelimited_2.append("COMPRESS" + " = "
						+ "false");
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
						+ " = " + "false");
				log4jParamters_tFileOutputDelimited_2.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_2 - "
							+ log4jParamters_tFileOutputDelimited_2);

				String fileName_tFileOutputDelimited_2 = "";
				fileName_tFileOutputDelimited_2 = (new java.io.File(
						context.shipping + context.slash + context.reportYear
								+ context.mDrive + context.slash
								+ context.client + context.slash
								+ context.jobNumber + context.slash
								+ context.reportMonth + context.slash
								+ "QC_LOG" + context.slash + "QC_LOG.csv"))
						.getAbsolutePath().replace("\\", "/");
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
				"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */
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

				java.io.File fileToDelete_tFileOutputDelimited_2 = new java.io.File(
						fileName_tFileOutputDelimited_2);
				if (fileToDelete_tFileOutputDelimited_2.exists()) {
					fileToDelete_tFileOutputDelimited_2.delete();
				}
				outtFileOutputDelimited_2 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(
								new java.io.FileOutputStream(
										fileName_tFileOutputDelimited_2, false),
								"ISO-8859-15"));
				synchronized (multiThreadLockWrite) {
					if (filetFileOutputDelimited_2.length() == 0) {
						outtFileOutputDelimited_2.write("TEST");
						outtFileOutputDelimited_2
								.write(OUT_DELIM_tFileOutputDelimited_2);
						outtFileOutputDelimited_2.write("RESULT");
						outtFileOutputDelimited_2
								.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);
						outtFileOutputDelimited_2.flush();
					}
				}

				resourceMap.put("out_tFileOutputDelimited_2",
						outtFileOutputDelimited_2);
				resourceMap.put("nb_line_tFileOutputDelimited_2",
						nb_line_tFileOutputDelimited_2);

				/**
				 * [tFileOutputDelimited_2 begin ] stop
				 */

				/**
				 * [tFixedFlowInput_2 begin ] start
				 */

				ok_Hash.put("tFixedFlowInput_2", false);
				start_Hash.put("tFixedFlowInput_2", System.currentTimeMillis());

				currentComponent = "tFixedFlowInput_2";

				int tos_count_tFixedFlowInput_2 = 0;

				StringBuilder result_tFixedFlowInput_2 = new StringBuilder();
				result_tFixedFlowInput_2.append("RklMRVNfRVhJU1QsIEZBSUxFRA==");
				String originalFileContent_tFixedFlowInput_2 = "";
				try {
					originalFileContent_tFixedFlowInput_2 = new String(
							(new sun.misc.BASE64Decoder()).decodeBuffer(result_tFixedFlowInput_2
									.toString()), utf8Charset);
				} catch (java.lang.Exception e) {
					e.printStackTrace();
				}

				int nb_line_tFixedFlowInput_2 = 0;

				for (int i_tFixedFlowInput_2 = 0; i_tFixedFlowInput_2 < 1; i_tFixedFlowInput_2++) {

					java.io.InputStream ins_tFixedFlowInput_2 = new java.io.ByteArrayInputStream(
							originalFileContent_tFixedFlowInput_2
									.getBytes(utf8Charset));
					org.talend.fileprocess.FileInputDelimited fid_tFixedFlowInput_2 = new org.talend.fileprocess.FileInputDelimited(
							ins_tFixedFlowInput_2, utf8Charset, ",", "\n",
							true, 0, 0, -1, -1, false);

					while (fid_tFixedFlowInput_2.nextRecord()) {
						nb_line_tFixedFlowInput_2++;
						row22 = new row22Struct();

						if (0 < fid_tFixedFlowInput_2
								.getColumnsCountOfCurrentRow()) {
							String colContent = fid_tFixedFlowInput_2.get(0);
							row22.TEST = (colContent == null || colContent
									.length() == 0) ? null : colContent;
						} else {

							row22.TEST = null;

						}

						if (1 < fid_tFixedFlowInput_2
								.getColumnsCountOfCurrentRow()) {
							String colContent = fid_tFixedFlowInput_2.get(1);
							row22.RESULT = (colContent == null || colContent
									.length() == 0) ? null : colContent;
						} else {

							row22.RESULT = null;

						}

						/**
						 * [tFixedFlowInput_2 begin ] stop
						 */

						/**
						 * [tFixedFlowInput_2 main ] start
						 */

						currentComponent = "tFixedFlowInput_2";

						tos_count_tFixedFlowInput_2++;

						/**
						 * [tFixedFlowInput_2 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_2 main ] start
						 */

						currentComponent = "tFileOutputDelimited_2";

						if (log.isTraceEnabled()) {
							log.trace("row22 - "
									+ (row22 == null ? "" : row22.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
						if (row22.TEST != null) {
							sb_tFileOutputDelimited_2.append(row22.TEST);
						}
						sb_tFileOutputDelimited_2
								.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row22.RESULT != null) {
							sb_tFileOutputDelimited_2.append(row22.RESULT);
						}
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
						 * [tFixedFlowInput_2 end ] start
						 */

						currentComponent = "tFixedFlowInput_2";

					}
					fid_tFixedFlowInput_2.close();
				}

				globalMap.put("tFixedFlowInput_2_NB_LINE",
						nb_line_tFixedFlowInput_2);

				ok_Hash.put("tFixedFlowInput_2", true);
				end_Hash.put("tFixedFlowInput_2", System.currentTimeMillis());

				/**
				 * [tFixedFlowInput_2 end ] stop
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

				resourceMap.put("finish_tFileOutputDelimited_2", true);

				log.info("tFileOutputDelimited_2 - Written records count: "
						+ nb_line_tFileOutputDelimited_2 + " .");

				if (log.isInfoEnabled())
					log.info("tFileOutputDelimited_2 - " + "Done.");

				ok_Hash.put("tFileOutputDelimited_2", true);
				end_Hash.put("tFileOutputDelimited_2",
						System.currentTimeMillis());

				tSendMail_5Process(globalMap);

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
				 * [tFixedFlowInput_2 finally ] start
				 */

				currentComponent = "tFixedFlowInput_2";

				/**
				 * [tFixedFlowInput_2 finally ] stop
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

		globalMap.put("tFixedFlowInput_2_SUBPROCESS_STATE", 1);
	}

	public void tSendMail_5Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tSendMail_5_SUBPROCESS_STATE", 0);

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
				 * [tSendMail_5 begin ] start
				 */

				ok_Hash.put("tSendMail_5", false);
				start_Hash.put("tSendMail_5", System.currentTimeMillis());

				currentComponent = "tSendMail_5";

				int tos_count_tSendMail_5 = 0;

				if (log.isInfoEnabled())
					log.info("tSendMail_5 - " + "Start to work.");
				StringBuilder log4jParamters_tSendMail_5 = new StringBuilder();
				log4jParamters_tSendMail_5.append("Parameters:");
				log4jParamters_tSendMail_5.append("TO" + " = "
						+ "context.altEmailTo");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("FROM" + " = "
						+ "context.altEmailTo");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("NEED_PERSONAL_NAME" + " = "
						+ "false");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("CC" + " = " + "");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("BCC" + " = " + "");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("SUBJECT" + " = "
						+ "context.client + \" Error\"");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5
						.append("MESSAGE"
								+ " = "
								+ "\"<html> <body>   <br>  <br>  Not all Files Exist.  </body>  </html>\"");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("CHECK_ATTACHMENT" + " = "
						+ "true");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("ATTACHMENTS" + " = " + "[]");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("HEADERS" + " = " + "[]");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("SMTP_HOST" + " = "
						+ "context.smtpHost");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("SMTP_PORT" + " = " + "25");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("SSL" + " = " + "false");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("STARTTLS" + " = " + "false");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("IMPORTANCE" + " = "
						+ "Normal");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5
						.append("NEED_AUTH" + " = " + "false");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("DIE_ON_ERROR" + " = "
						+ "true");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("TEXT_SUBTYPE" + " = "
						+ "html");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("ENCODING" + " = "
						+ "\"ISO-8859-15\"");
				log4jParamters_tSendMail_5.append(" | ");
				log4jParamters_tSendMail_5.append("SET_LOCALHOST" + " = "
						+ "false");
				log4jParamters_tSendMail_5.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tSendMail_5 - " + log4jParamters_tSendMail_5);

				/**
				 * [tSendMail_5 begin ] stop
				 */

				/**
				 * [tSendMail_5 main ] start
				 */

				currentComponent = "tSendMail_5";

				String smtpHost_tSendMail_5 = context.smtpHost;
				String smtpPort_tSendMail_5 = "25";
				String from_tSendMail_5 = (context.altEmailTo);
				String to_tSendMail_5 = (context.altEmailTo).replace(";", ",");
				String cc_tSendMail_5 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String bcc_tSendMail_5 = (("") == null || "".equals("")) ? null
						: ("").replace(";", ",");
				String subject_tSendMail_5 = (context.client + " Error");

				java.util.List<java.util.Map<String, String>> headers_tSendMail_5 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_5 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_5 = new java.util.ArrayList<String>();

				String message_tSendMail_5 = (("<html> <body>\n <br>\n<br>\nNot all Files Exist.\n</body>\n</html>") == null || ""
						.equals("<html> <body>\n <br>\n<br>\nNot all Files Exist.\n</body>\n</html>")) ? "\"\""
						: ("<html> <body>\n <br>\n<br>\nNot all Files Exist.\n</body>\n</html>");
				java.util.Properties props_tSendMail_5 = System.getProperties();
				props_tSendMail_5.put("mail.smtp.host", smtpHost_tSendMail_5);
				props_tSendMail_5.put("mail.smtp.port", smtpPort_tSendMail_5);
				props_tSendMail_5.put("mail.mime.encodefilename", "true");
				try {

					log.info("tSendMail_5 - Connection attempt to '"
							+ smtpHost_tSendMail_5 + "'.");

					props_tSendMail_5.put("mail.smtp.auth", "false");
					javax.mail.Session session_tSendMail_5 = javax.mail.Session
							.getInstance(props_tSendMail_5, null);

					log.info("tSendMail_5 - Connection to '"
							+ smtpHost_tSendMail_5 + "' has succeeded.");

					javax.mail.Message msg_tSendMail_5 = new javax.mail.internet.MimeMessage(
							session_tSendMail_5);
					msg_tSendMail_5
							.setFrom(new javax.mail.internet.InternetAddress(
									from_tSendMail_5, null));
					msg_tSendMail_5.setRecipients(
							javax.mail.Message.RecipientType.TO,
							javax.mail.internet.InternetAddress.parse(
									to_tSendMail_5, false));
					if (cc_tSendMail_5 != null)
						msg_tSendMail_5.setRecipients(
								javax.mail.Message.RecipientType.CC,
								javax.mail.internet.InternetAddress.parse(
										cc_tSendMail_5, false));
					if (bcc_tSendMail_5 != null)
						msg_tSendMail_5.setRecipients(
								javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(
										bcc_tSendMail_5, false));
					msg_tSendMail_5.setSubject(subject_tSendMail_5);

					for (int i_tSendMail_5 = 0; i_tSendMail_5 < headers_tSendMail_5
							.size(); i_tSendMail_5++) {
						java.util.Map<String, String> header_tSendMail_5 = headers_tSendMail_5
								.get(i_tSendMail_5);
						msg_tSendMail_5.setHeader(
								header_tSendMail_5.get("KEY"),
								header_tSendMail_5.get("VALUE"));
					}
					msg_tSendMail_5.setSentDate(new Date());
					msg_tSendMail_5.setHeader("X-Priority", "3"); // High->1
																	// Normal->3
																	// Low->5
					javax.mail.Multipart mp_tSendMail_5 = new javax.mail.internet.MimeMultipart();
					javax.mail.internet.MimeBodyPart mbpText_tSendMail_5 = new javax.mail.internet.MimeBodyPart();
					mbpText_tSendMail_5.setText(message_tSendMail_5,
							"ISO-8859-15", "html");
					mp_tSendMail_5.addBodyPart(mbpText_tSendMail_5);

					javax.mail.internet.MimeBodyPart mbpFile_tSendMail_5 = null;

					for (int i_tSendMail_5 = 0; i_tSendMail_5 < attachments_tSendMail_5
							.size(); i_tSendMail_5++) {
						String filename_tSendMail_5 = attachments_tSendMail_5
								.get(i_tSendMail_5);
						javax.activation.FileDataSource fds_tSendMail_5 = null;
						java.io.File file_tSendMail_5 = new java.io.File(
								filename_tSendMail_5);

						if (file_tSendMail_5.isDirectory()) {
							java.io.File[] subFiles_tSendMail_5 = file_tSendMail_5
									.listFiles();
							for (java.io.File subFile_tSendMail_5 : subFiles_tSendMail_5) {
								if (subFile_tSendMail_5.isFile()) {
									fds_tSendMail_5 = new javax.activation.FileDataSource(
											subFile_tSendMail_5
													.getAbsolutePath());
									mbpFile_tSendMail_5 = new javax.mail.internet.MimeBodyPart();
									mbpFile_tSendMail_5
											.setDataHandler(new javax.activation.DataHandler(
													fds_tSendMail_5));
									mbpFile_tSendMail_5
											.setFileName(javax.mail.internet.MimeUtility
													.encodeText(fds_tSendMail_5
															.getName()));
									if (contentTransferEncoding_tSendMail_5
											.get(i_tSendMail_5)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_5.setHeader(
												"Content-Transfer-Encoding",
												"base64");
									}
									mp_tSendMail_5
											.addBodyPart(mbpFile_tSendMail_5);
								}
							}
						} else {
							mbpFile_tSendMail_5 = new javax.mail.internet.MimeBodyPart();
							fds_tSendMail_5 = new javax.activation.FileDataSource(
									filename_tSendMail_5);
							mbpFile_tSendMail_5
									.setDataHandler(new javax.activation.DataHandler(
											fds_tSendMail_5));
							mbpFile_tSendMail_5
									.setFileName(javax.mail.internet.MimeUtility
											.encodeText(fds_tSendMail_5
													.getName()));
							if (contentTransferEncoding_tSendMail_5.get(
									i_tSendMail_5).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_5.setHeader(
										"Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_5.addBodyPart(mbpFile_tSendMail_5);
						}
					}
					// -- set the content --
					msg_tSendMail_5.setContent(mp_tSendMail_5);
					// add handlers for main MIME types
					javax.activation.MailcapCommandMap mc_tSendMail_5 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
							.getDefaultCommandMap();
					mc_tSendMail_5
							.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
					mc_tSendMail_5
							.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
					mc_tSendMail_5
							.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
					mc_tSendMail_5
							.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
					mc_tSendMail_5
							.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
					javax.activation.CommandMap
							.setDefaultCommandMap(mc_tSendMail_5);
					// -- Send the message --
					javax.mail.Transport.send(msg_tSendMail_5);
				} catch (java.lang.Exception e) {

					throw (e);

				} finally {
					props_tSendMail_5.remove("mail.smtp.host");
					props_tSendMail_5.remove("mail.smtp.port");

					props_tSendMail_5.remove("mail.mime.encodefilename");

					props_tSendMail_5.remove("mail.smtp.auth");
				}

				tos_count_tSendMail_5++;

				/**
				 * [tSendMail_5 main ] stop
				 */

				/**
				 * [tSendMail_5 end ] start
				 */

				currentComponent = "tSendMail_5";

				if (log.isInfoEnabled())
					log.info("tSendMail_5 - " + "Done.");

				ok_Hash.put("tSendMail_5", true);
				end_Hash.put("tSendMail_5", System.currentTimeMillis());

				tDie_1Process(globalMap);

				/**
				 * [tSendMail_5 end ] stop
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
				 * [tSendMail_5 finally ] start
				 */

				currentComponent = "tSendMail_5";

				/**
				 * [tSendMail_5 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSendMail_5_SUBPROCESS_STATE", 1);
	}

	public void tDie_1Process(final java.util.Map<String, Object> globalMap)
			throws TalendException {
		globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

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
				 * [tDie_1 begin ] start
				 */

				ok_Hash.put("tDie_1", false);
				start_Hash.put("tDie_1", System.currentTimeMillis());

				currentComponent = "tDie_1";

				int tos_count_tDie_1 = 0;

				if (log.isInfoEnabled())
					log.info("tDie_1 - " + "Start to work.");
				StringBuilder log4jParamters_tDie_1 = new StringBuilder();
				log4jParamters_tDie_1.append("Parameters:");
				log4jParamters_tDie_1.append("MESSAGE" + " = "
						+ "\"Not all files Exist\"");
				log4jParamters_tDie_1.append(" | ");
				log4jParamters_tDie_1.append("CODE" + " = " + "4");
				log4jParamters_tDie_1.append(" | ");
				log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
				log4jParamters_tDie_1.append(" | ");
				log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "false");
				log4jParamters_tDie_1.append(" | ");
				if (log.isDebugEnabled())
					log.debug("tDie_1 - " + log4jParamters_tDie_1);

				/**
				 * [tDie_1 begin ] stop
				 */

				/**
				 * [tDie_1 main ] start
				 */

				currentComponent = "tDie_1";

				globalMap.put("tDie_1_DIE_PRIORITY", 5);
				System.err.println("Not all files Exist");

				log.error("tDie_1 - The die message: " + "Not all files Exist");

				globalMap.put("tDie_1_DIE_MESSAGE", "Not all files Exist");
				globalMap.put("tDie_1_DIE_MESSAGES", "Not all files Exist");
				currentComponent = "tDie_1";
				status = "failure";
				errorCode = new Integer(4);
				((java.util.Map) threadLocal.get()).put("errorCode",
						new Integer(4));
				((java.util.Map) threadLocal.get()).put("status", "failure");
				globalMap.put("tDie_1_DIE_CODE", errorCode);

				if (true) {
					throw new TDieException();
				}

				tos_count_tDie_1++;

				/**
				 * [tDie_1 main ] stop
				 */

				/**
				 * [tDie_1 end ] start
				 */

				currentComponent = "tDie_1";

				if (log.isInfoEnabled())
					log.info("tDie_1 - " + "Done.");

				ok_Hash.put("tDie_1", true);
				end_Hash.put("tDie_1", System.currentTimeMillis());

				/**
				 * [tDie_1 end ] stop
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
				 * [tDie_1 finally ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}

	public static class row3Struct implements
			routines.system.IPersistableRow<row3Struct> {
		final static byte[] commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];
		static byte[] commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[0];

		public String TEST;

		public String getTEST() {
			return this.TEST;
		}

		public String RESULT;

		public String getRESULT() {
			return this.RESULT;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length) {
					if (length < 1024
							&& commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR.length == 0) {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[1024];
					} else {
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR = new byte[2 * length];
					}
				}
				dis.readFully(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
						0, length);
				strReturn = new String(
						commonByteArray_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR,
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

			synchronized (commonByteArrayLock_AP_UNIX_AIS_Monthly_FCAServiceRetention_SR) {

				try {

					int length = 0;

					this.TEST = readString(dis);

					this.RESULT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TEST, dos);

				// String

				writeString(this.RESULT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TEST=" + TEST);
			sb.append(",RESULT=" + RESULT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TEST == null) {
				sb.append("<null>");
			} else {
				sb.append(TEST);
			}

			sb.append("|");

			if (RESULT == null) {
				sb.append("<null>");
			} else {
				sb.append(RESULT);
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

				row3Struct row3 = new row3Struct();

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
								+ "context.shipping+context.slash+context.reportYear+context.mDrive+context.slash+context.client+context.slash+context.jobNumber+context.slash+context.reportMonth +context.slash+ \"QC_LOG\" + context.slash + \"QC_LOG.csv\"");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR"
						+ " = " + "\"\\n\"");
				log4jParamters_tFileOutputDelimited_1.append(" | ");
				log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR"
						+ " = " + "\",\"");
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
						context.shipping + context.slash + context.reportYear
								+ context.mDrive + context.slash
								+ context.client + context.slash
								+ context.jobNumber + context.slash
								+ context.reportMonth + context.slash
								+ "QC_LOG" + context.slash + "QC_LOG.csv"))
						.getAbsolutePath().replace("\\", "/");
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
				","/** End field tFileOutputDelimited_1:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /**
				 * Start
				 * field tFileOutputDelimited_1:ROWSEPARATOR
				 */
				"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */
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
						outtFileOutputDelimited_1.write("TEST");
						outtFileOutputDelimited_1
								.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RESULT");
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
				 * [tFixedFlowInput_1 begin ] start
				 */

				ok_Hash.put("tFixedFlowInput_1", false);
				start_Hash.put("tFixedFlowInput_1", System.currentTimeMillis());

				currentComponent = "tFixedFlowInput_1";

				int tos_count_tFixedFlowInput_1 = 0;

				StringBuilder result_tFixedFlowInput_1 = new StringBuilder();
				result_tFixedFlowInput_1.append("RklMRVNfRVhJU1QsUEFTU0VE");
				String originalFileContent_tFixedFlowInput_1 = "";
				try {
					originalFileContent_tFixedFlowInput_1 = new String(
							(new sun.misc.BASE64Decoder()).decodeBuffer(result_tFixedFlowInput_1
									.toString()), utf8Charset);
				} catch (java.lang.Exception e) {
					e.printStackTrace();
				}

				int nb_line_tFixedFlowInput_1 = 0;

				for (int i_tFixedFlowInput_1 = 0; i_tFixedFlowInput_1 < 1; i_tFixedFlowInput_1++) {

					java.io.InputStream ins_tFixedFlowInput_1 = new java.io.ByteArrayInputStream(
							originalFileContent_tFixedFlowInput_1
									.getBytes(utf8Charset));
					org.talend.fileprocess.FileInputDelimited fid_tFixedFlowInput_1 = new org.talend.fileprocess.FileInputDelimited(
							ins_tFixedFlowInput_1, utf8Charset, ",", "\n",
							true, 0, 0, -1, -1, false);

					while (fid_tFixedFlowInput_1.nextRecord()) {
						nb_line_tFixedFlowInput_1++;
						row3 = new row3Struct();

						if (0 < fid_tFixedFlowInput_1
								.getColumnsCountOfCurrentRow()) {
							String colContent = fid_tFixedFlowInput_1.get(0);
							row3.TEST = (colContent == null || colContent
									.length() == 0) ? null : colContent;
						} else {

							row3.TEST = null;

						}

						if (1 < fid_tFixedFlowInput_1
								.getColumnsCountOfCurrentRow()) {
							String colContent = fid_tFixedFlowInput_1.get(1);
							row3.RESULT = (colContent == null || colContent
									.length() == 0) ? null : colContent;
						} else {

							row3.RESULT = null;

						}

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
						 * [tFileOutputDelimited_1 main ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						if (log.isTraceEnabled()) {
							log.trace("row3 - "
									+ (row3 == null ? "" : row3.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
						if (row3.TEST != null) {
							sb_tFileOutputDelimited_1.append(row3.TEST);
						}
						sb_tFileOutputDelimited_1
								.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row3.RESULT != null) {
							sb_tFileOutputDelimited_1.append(row3.RESULT);
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
						 * [tFixedFlowInput_1 end ] start
						 */

						currentComponent = "tFixedFlowInput_1";

					}
					fid_tFixedFlowInput_1.close();
				}

				globalMap.put("tFixedFlowInput_1_NB_LINE",
						nb_line_tFixedFlowInput_1);

				ok_Hash.put("tFixedFlowInput_1", true);
				end_Hash.put("tFixedFlowInput_1", System.currentTimeMillis());

				/**
				 * [tFixedFlowInput_1 end ] stop
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
				 * [tFixedFlowInput_1 finally ] start
				 */

				currentComponent = "tFixedFlowInput_1";

				/**
				 * [tFixedFlowInput_1 finally ] stop
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

		globalMap.put("tFixedFlowInput_1_SUBPROCESS_STATE", 1);
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
		final AIS_Monthly_FCAServiceRetention_SR AIS_Monthly_FCAServiceRetention_SRClass = new AIS_Monthly_FCAServiceRetention_SR();

		int exitCode = AIS_Monthly_FCAServiceRetention_SRClass
				.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'AIS_Monthly_FCAServiceRetention_SR' - Done.");
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
		log.info("TalendJob: 'AIS_Monthly_FCAServiceRetention_SR' - Start.");

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
			java.io.InputStream inContext = AIS_Monthly_FCAServiceRetention_SR.class
					.getClassLoader().getResourceAsStream(
							"ap_unix/ais_monthly_fcaserviceretention_sr_0_1/contexts/"
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
			context.pgpKeyRecipient = (String) context
					.getProperty("pgpKeyRecipient");
			context.pgpDir = (String) context.getProperty("pgpDir");
			context.pgpFileName = (String) context.getProperty("pgpFileName");
			context.jobID = (String) context.getProperty("jobID");
			context.coinFTPHost = (String) context.getProperty("coinFTPHost");
			context.coinFTPUser = (String) context.getProperty("coinFTPUser");
			context.coinFTPPassword = (String) context
					.getProperty("coinFTPPassword");
			context.coinFTPDirectory = (String) context
					.getProperty("coinFTPDirectory");
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
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
			if (parentContextMap.containsKey("pgpKeyRecipient")) {
				context.pgpKeyRecipient = (String) parentContextMap
						.get("pgpKeyRecipient");
			}
			if (parentContextMap.containsKey("pgpDir")) {
				context.pgpDir = (String) parentContextMap.get("pgpDir");
			}
			if (parentContextMap.containsKey("pgpFileName")) {
				context.pgpFileName = (String) parentContextMap
						.get("pgpFileName");
			}
			if (parentContextMap.containsKey("jobID")) {
				context.jobID = (String) parentContextMap.get("jobID");
			}
			if (parentContextMap.containsKey("coinFTPHost")) {
				context.coinFTPHost = (String) parentContextMap
						.get("coinFTPHost");
			}
			if (parentContextMap.containsKey("coinFTPUser")) {
				context.coinFTPUser = (String) parentContextMap
						.get("coinFTPUser");
			}
			if (parentContextMap.containsKey("coinFTPPassword")) {
				context.coinFTPPassword = (String) parentContextMap
						.get("coinFTPPassword");
			}
			if (parentContextMap.containsKey("coinFTPDirectory")) {
				context.coinFTPDirectory = (String) parentContextMap
						.get("coinFTPDirectory");
			}
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
							+ " bytes memory increase when running : AIS_Monthly_FCAServiceRetention_SR");
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
		closeFtpConnections();

	}

	private void closeFtpConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tFTPConnection_1");
			if (obj_conn != null) {
				((com.jcraft.jsch.ChannelSftp) obj_conn).quit();
			}
			obj_conn = globalMap.remove("conn_tFTPConnection_2");
			if (obj_conn != null) {
				((com.jcraft.jsch.ChannelSftp) obj_conn).quit();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		connections.put("conn_tFTPConnection_1",
				globalMap.get("conn_tFTPConnection_1"));
		connections.put("conn_tFTPConnection_2",
				globalMap.get("conn_tFTPConnection_2"));

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