package com.ss.android.ugc.effectmanager;

import X.C08FF;
import X.C08RN;
import X.C0VSJ;
import X.C1042510dEf;
import X.C13Q5;
import X.C13R7;
import X.C13RB;
import X.C13RD;
import X.C13RF;
import X.C13SS;
import X.C20000913Nn;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import X.InterfaceC19370610qO;
import X.InterfaceC19997313Md;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.knadapt.KNExecutorService;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNLogger;
import com.ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public class EffectConfiguration {
    public ExecutorService executor;
    public int filterType;
    public HashMap<String, String> iopInfo;
    public IJsonConverter jsonConverter;
    public String mAccessKey;
    public String mApiAddress;
    public String mAppID;
    public String mAppLanguage;
    public String mAppVersion;
    public String mChannel;
    public Context mContext;
    public String mDeviceId;
    public String mDeviceType;
    public ArrayList<String> mDraftList;
    public C13RD mEffectConfig;
    public File mEffectDir;
    public String mGpuVersion;
    public List<Host> mHosts;
    public String mPlatform;
    public String mRegion;
    public int mRetryCount;
    public String mSdkVersion;
    public IMonitorService monitorService;
    public int requestStrategy;
    public String testStatus;

    public static final class Builder {
        public static boolean hasAddedVersionTagInLog;
        public String accessKey;
        public String appID;
        public String appLanguage;
        public String appVersion;
        public String channel;
        public Context context;
        public String customDiskName;
        public String deviceId;
        public String deviceType;
        public ArrayList<String> draftList;
        public File effectDir;
        public IEffectNetWorker effectNetWorker;
        public int filterType;
        public String gpuVersion;
        public List<Host> hosts;
        public IJsonConverter jsonConverter;
        public ExecutorService mExecutor;
        public C13RF mKNEffectConfigBuilder;
        public IMonitorService monitorService;
        public String platform;
        public String region;
        public int requestStrategy;
        public String sdkVersion;
        public String testStatus;
        public int retryCount = 3;
        public HashMap<String, String> iopInfo = new HashMap<>();

        public Builder sysLanguage(String str) {
            return this;
        }

        public EffectConfiguration build() {
            return new EffectConfiguration(this);
        }

        public C13RD buildKNEffectConfig() {
            C13RF c13rf = this.mKNEffectConfigBuilder;
            c13rf.getClass();
            return new C13RD(c13rf);
        }

        public Builder() {
            if (!hasAddedVersionTagInLog) {
                EPLog.addSDKTagString("1.0.20.2-bugfix");
                hasAddedVersionTagInLog = true;
            }
            this.mKNEffectConfigBuilder = new C13RF();
        }

        public Builder JsonConverter(IJsonConverter iJsonConverter) {
            this.jsonConverter = iJsonConverter;
            this.mKNEffectConfigBuilder.LJII = new C13R7(new KNJsonConverter(iJsonConverter));
            return this;
        }

        public Builder abDiffEffect(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJ = z;
            return this;
        }

        public Builder abInsertHead(boolean z) {
            this.mKNEffectConfigBuilder.LJJIZ = z;
            return this;
        }

        public Builder abInsertHeadPanels(String[] strArr) {
            this.mKNEffectConfigBuilder.LJJJ = strArr;
            return this;
        }

        public Builder accessKey(String str) {
            this.accessKey = str;
            this.mKNEffectConfigBuilder.LIZ = str;
            return this;
        }

        public Builder appID(String str) {
            this.appID = str;
            this.mKNEffectConfigBuilder.LJFF = str;
            return this;
        }

        public Builder appLanguage(String str) {
            this.appLanguage = str;
            this.mKNEffectConfigBuilder.LJIJ = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.appVersion = str;
            this.mKNEffectConfigBuilder.LIZJ = str;
            return this;
        }

        public Builder backupUrlRetryCount(int i) {
            this.mKNEffectConfigBuilder.LJIILLIIL = i;
            return this;
        }

        public Builder canUseNewFillModel(boolean z) {
            this.mKNEffectConfigBuilder.LJJIIZ = z;
            return this;
        }

        public Builder channel(String str) {
            this.channel = str;
            this.mKNEffectConfigBuilder.LJIIIZ = str;
            return this;
        }

        public Builder context(Context context) {
            Context contextN3 = C786410Ut5.N3(context);
            this.context = contextN3;
            this.mKNEffectConfigBuilder.LJJIIZI = contextN3;
            return this;
        }

        public Builder customDiskName(String str) {
            this.customDiskName = str;
            this.mKNEffectConfigBuilder.LJIILIIL = str;
            return this;
        }

        public Builder deviceId(String str) {
            this.deviceId = str;
            this.mKNEffectConfigBuilder.LIZLLL = str;
            return this;
        }

        public Builder deviceType(String str) {
            this.deviceType = str;
            this.mKNEffectConfigBuilder.LJIIJJI = str;
            return this;
        }

        public Builder draftList(ArrayList<String> arrayList) {
            this.draftList = arrayList;
            this.mKNEffectConfigBuilder.LJJIIJ = arrayList;
            return this;
        }

        public Builder effectDir(File file) {
            this.effectDir = file;
            if (file == null) {
                return this;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            this.mKNEffectConfigBuilder.LJIIL = file.getAbsolutePath();
            return this;
        }

        public Builder effectFetcher(EffectFetcher effectFetcher) {
            if (C13Q5.LIZJ()) {
                this.mKNEffectConfigBuilder.LJIJJ = C13Q5.LIZ().LIZIZ();
            }
            return this;
        }

        public Builder effectListV4(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJL = z;
            return this;
        }

        public Builder effectMaxCacheSize(long j) {
            C13RF c13rf = this.mKNEffectConfigBuilder;
            if (j <= 0) {
                c13rf.getClass();
                return this;
            }
            c13rf.LJJIJL = j;
            return this;
        }

        public Builder effectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.effectNetWorker = iEffectNetWorker;
            this.mKNEffectConfigBuilder.LJI = new KNNetworkClient(iEffectNetWorker);
            return this;
        }

        public Builder executor(ExecutorService executorService) {
            this.mExecutor = executorService;
            this.mKNEffectConfigBuilder.LJIJI = new KNExecutorService(executorService);
            return this;
        }

        public Builder extraParams(InterfaceC19370610qO interfaceC19370610qO) {
            this.mKNEffectConfigBuilder.LJJJI = interfaceC19370610qO;
            return this;
        }

        public Builder filterType(int i) {
            this.filterType = i;
            this.mKNEffectConfigBuilder.LJJIJIL = Integer.valueOf(i);
            return this;
        }

        public Builder gpuInfo(String str) {
            this.gpuVersion = str;
            this.mKNEffectConfigBuilder.LJJ = str;
            return this;
        }

        public Builder hosts(List<Host> list) {
            this.hosts = list;
            if (!list.isEmpty()) {
                this.mKNEffectConfigBuilder.LJJII = ((Host) ListProtector.get(list, 0)).getItemName();
            }
            return this;
        }

        public Builder ignoreBuiltInModel(boolean z) {
            this.mKNEffectConfigBuilder.LJJJIL = z;
            return this;
        }

        public Builder ignoreNullCallback(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJI = z;
            return this;
        }

        public Builder isEffectDir(Boolean bool) {
            this.mKNEffectConfigBuilder.LJJIJLIJ = bool.booleanValue();
            return this;
        }

        public Builder jsonOptimizeType(int i) {
            this.mKNEffectConfigBuilder.LJJJJIZL = i;
            return this;
        }

        public Builder knEffectFetcher(InterfaceC19997313Md interfaceC19997313Md) {
            this.mKNEffectConfigBuilder.LJIJJ = interfaceC19997313Md;
            return this;
        }

        public Builder modelNameCache(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJJL = z;
            return this;
        }

        public Builder monitorService(IMonitorService iMonitorService) {
            this.monitorService = iMonitorService;
            this.mKNEffectConfigBuilder.LJIJJLI = new KNMonitorService(iMonitorService);
            return this;
        }

        public Builder networkQuality(C13RB c13rb) {
            this.mKNEffectConfigBuilder.LJJJJZ = c13rb;
            return this;
        }

        public Builder objIdConversionConfig(C20000913Nn c20000913Nn) {
            this.mKNEffectConfigBuilder.LJJIIJZLJL = c20000913Nn;
            return this;
        }

        public Builder platform(String str) {
            this.platform = str;
            this.mKNEffectConfigBuilder.LJIIJ = str;
            return this;
        }

        public Builder region(String str) {
            this.region = str;
            this.mKNEffectConfigBuilder.LJ = str;
            return this;
        }

        public Builder regionAsPartOfCacheKey(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJLL = z;
            return this;
        }

        public Builder requestStrategy(int i) {
            this.requestStrategy = i;
            this.mKNEffectConfigBuilder.LJJIFFI = i;
            return this;
        }

        public Builder retryCount(int i) {
            this.retryCount = i;
            this.mKNEffectConfigBuilder.LJIILL = i;
            return this;
        }

        public Builder sdkVersion(String str) {
            this.sdkVersion = str;
            this.mKNEffectConfigBuilder.LIZIZ = str;
            return this;
        }

        public Builder setUnzipNewSolution(boolean z) {
            if (z) {
                this.mKNEffectConfigBuilder.LJJIII = UnZipSolution.NEW_SOLUTION;
                return this;
            }
            this.mKNEffectConfigBuilder.LJJIII = UnZipSolution.OLD_SOLUTION;
            return this;
        }

        public Builder setUnzipSolution(UnZipSolution unZipSolution) {
            this.mKNEffectConfigBuilder.LJJIII = unZipSolution;
            return this;
        }

        public Builder testStatus(String str) {
            this.testStatus = str;
            this.mKNEffectConfigBuilder.LJIL = str;
            return this;
        }

        public Builder threadCoreSize(int i) {
            C13RF c13rf = this.mKNEffectConfigBuilder;
            c13rf.getClass();
            c13rf.LJIJI = C1042510dEf.LIZ(i, 30000L);
            c13rf.LJJIL = i;
            return this;
        }

        public Builder iop(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str)) {
                this.iopInfo.put("lx", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                this.iopInfo.put("ly", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                this.iopInfo.put("cy_code", str3);
            }
            this.mKNEffectConfigBuilder.LIZ(str, str2, str3);
            return this;
        }
    }

    public String getAccessKey() {
        return this.mAccessKey;
    }

    public String getApiAdress() {
        return this.mApiAddress;
    }

    public String getAppID() {
        return this.mAppID;
    }

    public String getAppLanguage() {
        return this.mAppLanguage;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public ArrayList<String> getDraftList() {
        return this.mDraftList;
    }

    public C13RD getEffectConfig() {
        return this.mEffectConfig;
    }

    public File getEffectDir() {
        return this.mEffectDir;
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public String getGpuVersion() {
        return this.mGpuVersion;
    }

    public List<Host> getHosts() {
        return this.mHosts;
    }

    public HashMap<String, String> getIopInfo() {
        return this.iopInfo;
    }

    public IJsonConverter getJsonConverter() {
        return this.jsonConverter;
    }

    public IMonitorService getMonitorService() {
        return this.monitorService;
    }

    public String getPlatform() {
        return this.mPlatform;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public int getRequestStrategy() {
        return this.requestStrategy;
    }

    public int getRetryCount() {
        return this.mRetryCount;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public String getTestStatus() {
        return this.testStatus;
    }

    /* JADX INFO: loaded from: classes27.dex */
    public enum UnZipSolution {
        OLD_SOLUTION,
        NEW_SOLUTION,
        UNZIP3,
        MINI_ZIP;

        public static UnZipSolution valueOf(String str) {
            return (UnZipSolution) C08FF.LIZ(UnZipSolution.class, str);
        }
    }

    public EffectConfiguration(Builder builder) {
        this.mChannel = "online";
        this.iopInfo = new HashMap<>();
        this.mRetryCount = 1;
        this.mApiAddress = "/effect/api";
        this.mAccessKey = builder.accessKey;
        this.mSdkVersion = builder.sdkVersion;
        this.mAppVersion = builder.appVersion;
        this.mDeviceId = builder.deviceId;
        String str = builder.channel;
        this.mChannel = str != null ? str : "online";
        String str2 = builder.platform;
        this.mPlatform = str2 == null ? "android" : str2;
        this.mDeviceType = builder.deviceType;
        Context context = builder.context;
        this.mContext = context;
        File file = builder.effectDir;
        if (file == null && context != null) {
            this.mEffectDir = new C0VSJ(INVOKEVIRTUAL_com_ss_android_ugc_effectmanager_EffectConfiguration_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.mContext), "effect");
        } else {
            this.mEffectDir = file;
        }
        this.mEffectDir = builder.effectDir;
        this.mRegion = builder.region;
        this.mRetryCount = builder.retryCount;
        this.jsonConverter = builder.jsonConverter;
        String str3 = builder.appID;
        this.mAppID = str3 == null ? CardStruct.IStatusCode.DEFAULT : str3;
        this.mAppLanguage = builder.appLanguage;
        this.iopInfo = builder.iopInfo;
        this.monitorService = builder.monitorService;
        this.executor = builder.mExecutor;
        this.testStatus = builder.testStatus;
        this.mDraftList = builder.draftList;
        this.mGpuVersion = builder.gpuVersion;
        this.requestStrategy = builder.requestStrategy;
        this.mHosts = builder.hosts;
        this.filterType = builder.filterType;
        C13RD c13rdBuildKNEffectConfig = builder.buildKNEffectConfig();
        this.mEffectConfig = c13rdBuildKNEffectConfig;
        KNLogger kNLogger = KNLogger.INSTANCE;
        c13rdBuildKNEffectConfig.getClass();
        C13SS.LIZ.getClass();
        C13SS.LIZIZ = kNLogger;
    }

    public static File INVOKEVIRTUAL_com_ss_android_ugc_effectmanager_EffectConfiguration_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setDraftList(ArrayList<String> arrayList) {
        this.mDraftList = arrayList;
    }

    public void setEffectDir(File file) {
        this.mEffectDir = file;
    }
}
