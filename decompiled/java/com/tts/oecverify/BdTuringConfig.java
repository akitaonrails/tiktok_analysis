package com.tts.oecverify;

import X.C08FF;
import X.C148O;
import X.C14A7;
import X.C14A9;
import X.C14AB;
import X.C2188811AlT;
import X.InterfaceC1524180plY;
import X.InterfaceC202182149c;
import X.InterfaceC2178208g8;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class BdTuringConfig {
    public static final String OS_VERSION;
    public static final String REGION_CN = "cn";
    public InterfaceC1524180plY bdTuringDepend;
    public C14A7 eventClient;
    public InterfaceC2178208g8 httpClient;
    public String mAppId;
    public String mAppKey;
    public String mAppName;
    public String mAppVersion;
    public int mBlockingCount;
    public String mBlockingPath;
    public Condition mCbCondition;
    public int mChallengeCode;
    public String mChannel;
    public Lock mConditionLock;
    public Context mContext;
    public ReentrantLock mCountLock;
    public int mDelayBackupDuration;
    public String mDeviceBrand;
    public String mDeviceId;
    public String mDeviceModel;
    public int mExpBlockCnt;
    public HashMap<String, Object> mExpFeatures;
    public boolean mFullScreen;
    public boolean mInjectHeader;
    public String mInstallId;
    public String mLanguage;
    public String mLocale;
    public boolean mMaskCancel;
    public String mMode;
    public boolean mNeedRetry;
    public String mNewAccountAUTH;
    public String mNewTTXToken;
    public String mOpenUdid;
    public JSONObject mQATheme;
    public String mRegion;
    public String mRiskInfo;
    public JSONObject mSMSTheme;
    public HashMap<String, Double> mSamplingRate;
    public String mScene;
    public final String mSdkVersion;
    public C14A9 mServiceInterceptor;
    public String mSessionID;
    public String mSessionId;
    public boolean mShowToastSuccess;
    public JSONObject mSlideTheme;
    public int mTTNetStatus;
    public Updater mUpdater;
    public boolean mUserDidConsent;
    public String mUserId;
    public InterfaceC202182149c mVerifyLoginHandler;
    public HashMap<Integer, Pair<String, String>> testConfig;
    public String ticket;
    public C14AB twiceVerifyDepend;

    public interface Updater {
        void update(BdTuringConfig bdTuringConfig);
    }

    public String getOsName() {
        return "Android";
    }

    public int getOsType() {
        return 0;
    }

    public String getSdkVersion() {
        return "3.2.3.i18n";
    }

    public C14A9 getServiceInterceptor() {
        return null;
    }

    public C14AB getTwiceVerifyDepend() {
        return null;
    }

    public BdTuringConfig setServiceInterceptor(C14A9 c14a9) {
        return this;
    }

    public String getLocale() {
        String string = this.mLocale;
        try {
            if (TextUtils.isEmpty(string)) {
                string = Locale.getDefault().toString();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (string == null) {
                return "";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
        return string == null ? "" : string;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public RegionType getRegionType() {
        String str = this.mRegion;
        str.getClass();
        switch (str.hashCode()) {
            case 3179:
                if (str.equals(REGION_CN)) {
                    return RegionType.REGION_CN;
                }
                break;
            case 3365:
                if (str.equals("in")) {
                    return RegionType.REGION_INDIA;
                }
                break;
            case 3668:
                if (str.equals("sg")) {
                    return RegionType.REGION_SINGAPOER;
                }
                break;
            case 3755:
                if (str.equals("va")) {
                    return RegionType.REGION_USA_EAST;
                }
                break;
            case 97720:
                if (str.equals("boe")) {
                    return RegionType.REGION_BOE;
                }
                break;
        }
        return RegionType.REGION_OTHER;
    }

    public Activity getTopActivity() {
        InterfaceC1524180plY interfaceC1524180plY = this.bdTuringDepend;
        if (interfaceC1524180plY != null) {
            return interfaceC1524180plY.getActivity();
        }
        return null;
    }

    public boolean isRegionBoe() {
        return this.mRegion.equals("boe");
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(Build.VERSION.SDK_INT);
        OS_VERSION = C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getResolutionString() {
        Activity topActivity = getTopActivity();
        if (topActivity == null) {
            return null;
        }
        return C148O.LJ(topActivity);
    }

    public enum RegionType {
        REGION_CN(BdTuringConfig.REGION_CN),
        REGION_SINGAPOER("sg"),
        REGION_USA_EAST("va"),
        REGION_INDIA("in"),
        REGION_BOE("boe"),
        REGION_OTHER("other");

        public String mName;

        public String getName() {
            return this.mName;
        }

        public static RegionType valueOf(String str) {
            return (RegionType) C08FF.LIZ(RegionType.class, str);
        }

        RegionType(String str) {
            this.mName = str;
        }
    }

    public String getAccountAUTH() {
        return this.mNewAccountAUTH;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public int getBlockingCount() {
        return this.mBlockingCount;
    }

    public String getBlockingPath() {
        return this.mBlockingPath;
    }

    public Condition getCbCondition() {
        return this.mCbCondition;
    }

    public int getChallengeCode() {
        return this.mChallengeCode;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public Lock getConditionLock() {
        return this.mConditionLock;
    }

    public ReentrantLock getCountLock() {
        return this.mCountLock;
    }

    public int getDelayBackupDuration() {
        return this.mDelayBackupDuration;
    }

    public String getDeviceBrand() {
        return this.mDeviceBrand;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getDeviceModel() {
        return this.mDeviceModel;
    }

    public C14A7 getEventClient() {
        return this.eventClient;
    }

    public HashMap<String, Object> getExpFeatures() {
        return this.mExpFeatures;
    }

    public boolean getFullScreen() {
        return this.mFullScreen;
    }

    public InterfaceC2178208g8 getHttpClient() {
        return this.httpClient;
    }

    public boolean getInjectHeader() {
        return this.mInjectHeader;
    }

    public String getInstallId() {
        return this.mInstallId;
    }

    public String getLanguage() {
        return this.mLanguage;
    }

    public boolean getMaskCancel() {
        return this.mMaskCancel;
    }

    public String getMode() {
        return this.mMode;
    }

    public boolean getNeedRetry() {
        return this.mNeedRetry;
    }

    public String getNewTTXToken() {
        return this.mNewTTXToken;
    }

    public String getOpenUdid() {
        return this.mOpenUdid;
    }

    public String getOsVersion() {
        return OS_VERSION;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public String getRiskInfo() {
        return this.mRiskInfo;
    }

    public HashMap<String, Double> getSamplingRate() {
        return this.mSamplingRate;
    }

    public String getScene() {
        return this.mScene;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public boolean getShowToastSuccess() {
        return this.mShowToastSuccess;
    }

    public int getTTNetStatus() {
        return this.mTTNetStatus;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String getTokoSessionID() {
        return this.mSessionID;
    }

    public Updater getUpdater() {
        return this.mUpdater;
    }

    public boolean getUserDidConsent() {
        return this.mUserDidConsent;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public InterfaceC202182149c getVerifyLoginHandler() {
        return this.mVerifyLoginHandler;
    }

    public static class Builder {
        public InterfaceC1524180plY bdTuringDepend;
        public C14A7 eventClient;
        public InterfaceC2178208g8 httpClient;
        public String mAppId;
        public String mAppName;
        public String mAppVersion;
        public String mChannel;
        public Context mContext;
        public int mDelayBackupDuration;
        public String mDeviceId;
        public String mInstallId;
        public String mLanguage;
        public String mLocale;
        public String mMode;
        public String mOpenUdid;
        public String mRegion;
        public C14A9 mServiceInterceptor;
        public String mSessionId;
        public int mTTNetStatus;
        public Updater mUpdater;
        public String mUserId;
        public InterfaceC202182149c mVerifyLoginHandler;
        public C14AB twiceVerifyDepend;
        public String mAppKey = "";
        public boolean mMaskCancel = true;
        public boolean mInjectHeader = true;
        public HashMap<String, Double> mSamplingRate = new HashMap<>();
        public HashMap<String, Object> mExpFeatures = new HashMap<>();

        public Builder serviceInterceptor(C14A9 c14a9) {
            return this;
        }

        public Builder twiceVerifyDepend(C14AB c14ab) {
            return this;
        }

        public Builder appId(String str) {
            this.mAppId = str;
            return this;
        }

        public Builder appKey(String str) {
            this.mAppKey = str;
            return this;
        }

        public Builder appName(String str) {
            this.mAppName = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.mAppVersion = str;
            return this;
        }

        public Builder bdTuringDepend(InterfaceC1524180plY interfaceC1524180plY) {
            this.bdTuringDepend = interfaceC1524180plY;
            return this;
        }

        public BdTuringConfig build(Context context) {
            this.mContext = context;
            return new BdTuringConfig(this);
        }

        public Builder channel(String str) {
            this.mChannel = str;
            return this;
        }

        public Builder delayBackupDuration(int i) {
            this.mDelayBackupDuration = i;
            return this;
        }

        public Builder deviceId(String str) {
            this.mDeviceId = str;
            return this;
        }

        public Builder eventClient(C14A7 c14a7) {
            this.eventClient = c14a7;
            return this;
        }

        public Builder forceBoe(boolean z) {
            if (z) {
                this.mRegion = "boe";
            }
            return this;
        }

        public Builder httpClient(InterfaceC2178208g8 interfaceC2178208g8) {
            this.httpClient = interfaceC2178208g8;
            return this;
        }

        public Builder injectHeader(boolean z) {
            this.mInjectHeader = z;
            return this;
        }

        public Builder installId(String str) {
            this.mInstallId = str;
            return this;
        }

        public Builder language(String str) {
            this.mLanguage = str;
            return this;
        }

        public Builder locale(String str) {
            this.mLocale = str;
            return this;
        }

        public Builder maskCancel(boolean z) {
            this.mMaskCancel = z;
            return this;
        }

        public Builder mode(String str) {
            this.mMode = str;
            return this;
        }

        public Builder openDid(String str) {
            this.mOpenUdid = str;
            return this;
        }

        public Builder openUdid(String str) {
            this.mOpenUdid = str;
            return this;
        }

        public Builder region(String str) {
            this.mRegion = str;
            return this;
        }

        public Builder regionType(RegionType regionType) {
            this.mRegion = regionType.getName();
            return this;
        }

        public Builder sessionId(String str) {
            this.mSessionId = str;
            return this;
        }

        public Builder setExpFeatures(HashMap<String, Object> map) {
            this.mExpFeatures.putAll(map);
            return this;
        }

        public Builder setSamplingRate(HashMap<String, Double> map) {
            this.mSamplingRate.putAll(map);
            return this;
        }

        public Builder setVerifyLoginHandler(InterfaceC202182149c interfaceC202182149c) {
            this.mVerifyLoginHandler = interfaceC202182149c;
            return this;
        }

        public Builder ttNetStatus(int i) {
            this.mTTNetStatus = i;
            return this;
        }

        public Builder updater(Updater updater) {
            this.mUpdater = updater;
            return this;
        }

        public Builder userId(String str) {
            this.mUserId = str;
            return this;
        }
    }

    public BdTuringConfig(Builder builder) {
        String string;
        String str;
        this.mRegion = "va";
        this.mSdkVersion = "3.2.3.i18n";
        String str2 = Build.BRAND;
        this.mDeviceBrand = str2;
        String str3 = Build.MODEL;
        this.mDeviceModel = str3;
        this.testConfig = new HashMap<>();
        this.mMode = null;
        this.mQATheme = null;
        this.mSMSTheme = null;
        this.mSlideTheme = null;
        this.ticket = null;
        this.mRiskInfo = null;
        this.mFullScreen = true;
        this.mScene = null;
        this.mShowToastSuccess = false;
        this.mUserDidConsent = false;
        this.mUpdater = null;
        this.mDelayBackupDuration = 100;
        this.mTTNetStatus = -1;
        this.mSamplingRate = new HashMap<>();
        this.mExpFeatures = new HashMap<>();
        this.bdTuringDepend = null;
        this.mExpBlockCnt = 2;
        this.mCountLock = null;
        this.mConditionLock = null;
        this.mCbCondition = null;
        this.mBlockingPath = null;
        this.mBlockingCount = 0;
        this.mNeedRetry = false;
        this.mNewTTXToken = "";
        this.mNewAccountAUTH = "";
        this.mSessionID = "";
        this.mRegion = builder.mRegion;
        this.mAppId = builder.mAppId;
        this.mLanguage = builder.mLanguage;
        this.mAppName = builder.mAppName;
        this.mChannel = builder.mChannel;
        this.mAppKey = builder.mAppKey;
        this.mAppVersion = builder.mAppVersion;
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(builder.mLocale)) {
            string = locale.toString();
        } else {
            string = builder.mLocale;
        }
        this.mLocale = string;
        this.eventClient = builder.eventClient;
        this.httpClient = builder.httpClient;
        this.bdTuringDepend = builder.bdTuringDepend;
        if (TextUtils.isEmpty(builder.mLocale) && (str = this.mLocale) != null) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length > 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strArrSplit[0]);
                sbLIZ.append("_");
                sbLIZ.append(strArrSplit[1]);
                this.mLocale = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        try {
            this.mDeviceBrand = URLEncoder.encode(str2, "utf-8");
            this.mDeviceModel = URLEncoder.encode(str3, "utf-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.mInstallId = builder.mInstallId;
        this.mDeviceId = builder.mDeviceId;
        this.mSessionId = builder.mSessionId;
        this.mUpdater = builder.mUpdater;
        this.mUserId = builder.mUserId;
        this.mOpenUdid = builder.mOpenUdid;
        this.mContext = builder.mContext;
        this.mMaskCancel = builder.mMaskCancel;
        this.mInjectHeader = builder.mInjectHeader;
        this.mVerifyLoginHandler = builder.mVerifyLoginHandler;
        this.mDelayBackupDuration = builder.mDelayBackupDuration;
        this.mTTNetStatus = builder.mTTNetStatus;
        this.mSamplingRate = builder.mSamplingRate;
        this.mExpFeatures = builder.mExpFeatures;
        this.mExpBlockCnt = 2;
        try {
            Object obj = getExpFeatures().get("blockingCnt");
            if (obj != null && (obj instanceof Number)) {
                this.mExpBlockCnt = ((Number) obj).intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.mCountLock = new ReentrantLock();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.mConditionLock = reentrantLock;
        this.mCbCondition = reentrantLock.newCondition();
        this.mBlockingCount = 0;
    }

    public Pair<String, String> getTestConfig(int i) {
        return this.testConfig.get(Integer.valueOf(i));
    }

    public JSONObject getTheme(int i) {
        if (i != 1) {
            if (i != 3) {
                return this.mSlideTheme;
            }
            return this.mQATheme;
        }
        return this.mSMSTheme;
    }

    public BdTuringConfig removeTestConfig(int i) {
        this.testConfig.remove(Integer.valueOf(i));
        return this;
    }

    public void setAccountAUTH(String str) {
        this.mNewAccountAUTH = str;
    }

    public BdTuringConfig setAppId(String str) {
        this.mAppId = str;
        return this;
    }

    public void setBlockingCount(int i) {
        this.mBlockingCount = i;
    }

    public void setBlockingPath(String str) {
        this.mBlockingPath = str;
    }

    public BdTuringConfig setChallengeCode(int i) {
        this.mChallengeCode = i;
        return this;
    }

    public BdTuringConfig setDeviceId(String str) {
        this.mDeviceId = str;
        return this;
    }

    public BdTuringConfig setExpFeatures(HashMap<String, Object> map) {
        this.mExpFeatures.putAll(map);
        return this;
    }

    public BdTuringConfig setFullScreen(boolean z) {
        this.mFullScreen = z;
        return this;
    }

    public void setHttpClient(InterfaceC2178208g8 interfaceC2178208g8) {
        this.httpClient = interfaceC2178208g8;
    }

    public BdTuringConfig setIBdturingDepend(InterfaceC1524180plY interfaceC1524180plY) {
        this.bdTuringDepend = interfaceC1524180plY;
        return this;
    }

    public BdTuringConfig setInstallId(String str) {
        this.mInstallId = str;
        return this;
    }

    public BdTuringConfig setLanguage(String str) {
        this.mLanguage = str;
        return this;
    }

    public BdTuringConfig setLocale(String str) {
        this.mLocale = str;
        return this;
    }

    public BdTuringConfig setMaskCancel(boolean z) {
        this.mMaskCancel = z;
        return this;
    }

    public BdTuringConfig setMode(String str) {
        this.mMode = str;
        return this;
    }

    public void setNeedRetry(boolean z) {
        this.mNeedRetry = z;
    }

    public BdTuringConfig setOpenUdid(String str) {
        this.mOpenUdid = str;
        return this;
    }

    public BdTuringConfig setRegion(String str) {
        this.mRegion = str;
        return this;
    }

    public BdTuringConfig setRegionBoe(boolean z) {
        if (z) {
            this.mRegion = "boe";
        }
        return this;
    }

    public void setRegionType(RegionType regionType) {
        this.mRegion = regionType.name();
    }

    public BdTuringConfig setRiskInfo(String str) {
        this.mRiskInfo = str;
        return this;
    }

    public BdTuringConfig setScene(String str) {
        this.mScene = str;
        return this;
    }

    public BdTuringConfig setSessionId(String str) {
        this.mSessionId = str;
        return this;
    }

    public BdTuringConfig setShowToastSuccess(boolean z) {
        this.mShowToastSuccess = z;
        return this;
    }

    public void setTTXToken(String str) {
        this.mNewTTXToken = str;
    }

    public BdTuringConfig setTicket(String str) {
        this.ticket = str;
        return this;
    }

    public void setTokoSessionID(String str) {
        this.mSessionID = str;
    }

    public BdTuringConfig setUpdater(Updater updater) {
        this.mUpdater = updater;
        return this;
    }

    public BdTuringConfig setUserDidConsent(boolean z) {
        this.mUserDidConsent = z;
        return this;
    }

    public BdTuringConfig setUserId(String str) {
        this.mUserId = str;
        return this;
    }

    public BdTuringConfig setVerifyLoginHandler(InterfaceC202182149c interfaceC202182149c) {
        this.mVerifyLoginHandler = interfaceC202182149c;
        return this;
    }

    public BdTuringConfig setTheme(JSONObject jSONObject, int i) {
        if (i == 3) {
            this.mQATheme = jSONObject;
            return this;
        }
        if (i == 1) {
            this.mSMSTheme = jSONObject;
            return this;
        }
        this.mSlideTheme = jSONObject;
        return this;
    }

    public BdTuringConfig setTestConfig(int i, String str, String str2) {
        this.testConfig.put(Integer.valueOf(i), new Pair<>(str, str2));
        return this;
    }
}
