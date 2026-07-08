package com.bytedance.geckox;

import X.AbstractC1553590qWz;
import X.C08FF;
import X.C1504240pFO;
import X.C2362609No;
import X.C786410Ut5;
import X.InterfaceC1504290pFT;
import X.InterfaceC1551450qTX;
import X.InterfaceC1553640qX4;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class GeckoGlobalConfig {
    public final List<File> candidateRootDirectories;
    public final long mAppColdStartTime;
    public final Long mAppId;
    public final String mAppVersion;
    public final Context mContext;
    public String mDeviceId;
    public final ENVType mEnv;
    public final InterfaceC1553640qX4 mGeckoServiceManager;
    public String mHost;
    public final IMonitorConfig mMonitorConfig;
    public final InterfaceC1504290pFT mNetWork;
    public final String mRegion;
    public final IRequestTagHeaderProvider mRequestTagHeaderProvider;
    public final InterfaceC1551450qTX mStatisticMonitor;
    public AbstractC1553590qWz resourceValidator;
    public volatile File rootDirectory;

    public static class Builder {
        public long appColdStartTime;
        public Long appId;
        public String appVersion;
        public List<File> candidateRootDirectories;
        public String deviceId;
        public ENVType env;
        public InterfaceC1553640qX4 geckoServiceManager;
        public String host;
        public Context mContext;
        public InterfaceC1504290pFT mNetWork;
        public InterfaceC1551450qTX mStatisticMonitor;
        public IMonitorConfig monitorConfig;
        public String region;
        public IRequestTagHeaderProvider requestTagHeaderProvider;
        public AbstractC1553590qWz resourceValidator;
        public File rootDirectory;

        public GeckoGlobalConfig build() {
            if (this.rootDirectory != null) {
                return new GeckoGlobalConfig(this);
            }
            throw new IllegalArgumentException("rootDirectory is required");
        }

        public Builder(Context context) {
            this.mContext = C786410Ut5.N3(context);
        }

        public Builder appColdStartTime(long j) {
            this.appColdStartTime = j;
            return this;
        }

        public Builder appId(long j) {
            this.appId = Long.valueOf(j);
            return this;
        }

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder candidateRootDirectories(List<File> list) {
            this.candidateRootDirectories = list;
            return this;
        }

        public Builder deviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder env(ENVType eNVType) {
            this.env = eNVType;
            return this;
        }

        public Builder geckoServiceManager(InterfaceC1553640qX4 interfaceC1553640qX4) {
            this.geckoServiceManager = interfaceC1553640qX4;
            return this;
        }

        public Builder host(String str) {
            this.host = str;
            return this;
        }

        public Builder monitorConfig(IMonitorConfig iMonitorConfig) {
            this.monitorConfig = iMonitorConfig;
            return this;
        }

        public Builder netStack(InterfaceC1504290pFT interfaceC1504290pFT) {
            this.mNetWork = interfaceC1504290pFT;
            return this;
        }

        public Builder region(String str) {
            this.region = str;
            return this;
        }

        public Builder requestTagHeaderProvider(IRequestTagHeaderProvider iRequestTagHeaderProvider) {
            this.requestTagHeaderProvider = iRequestTagHeaderProvider;
            return this;
        }

        public Builder resourceValidator(AbstractC1553590qWz abstractC1553590qWz) {
            this.resourceValidator = abstractC1553590qWz;
            return this;
        }

        public Builder rootDirectory(File file) {
            this.rootDirectory = file;
            return this;
        }

        public Builder statisticMonitor(InterfaceC1551450qTX interfaceC1551450qTX) {
            this.mStatisticMonitor = interfaceC1551450qTX;
            return this;
        }
    }

    public interface IMonitorConfig {
        String getChannel();

        Map<String, String> getCommonParams();

        String getMonitorHost();

        String getPackageId();

        String getUpdateVersionCode();

        boolean isOversea();
    }

    public interface IRequestTagHeaderProvider {
        Pair<String, String> getRequestTagHeader(boolean z);
    }

    public long getAppId() {
        return this.mAppId.longValue();
    }

    public List<File> getCandidateRootDirectories() {
        List<File> list = this.candidateRootDirectories;
        return (list == null || list.isEmpty()) ? Collections.singletonList(this.rootDirectory) : this.candidateRootDirectories;
    }

    public String getRootDirectoryPath() {
        return this.rootDirectory.getAbsolutePath();
    }

    public enum ENVType {
        BOE(1),
        DEV(1),
        PROD(2);

        public int val;

        public int getVal() {
            return this.val;
        }

        public static ENVType valueOf(String str) {
            return (ENVType) C08FF.LIZ(ENVType.class, str);
        }

        ENVType(int i) {
            this.val = i;
        }
    }

    public long getAppColdStartTime() {
        return this.mAppColdStartTime;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public ENVType getEnv() {
        return this.mEnv;
    }

    public InterfaceC1553640qX4 getGeckoServiceManager() {
        return this.mGeckoServiceManager;
    }

    public String getHost() {
        return this.mHost;
    }

    public IMonitorConfig getMonitorConfig() {
        return this.mMonitorConfig;
    }

    public InterfaceC1504290pFT getNetWork() {
        return this.mNetWork;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public IRequestTagHeaderProvider getRequestTagHeaderProvider() {
        return this.mRequestTagHeaderProvider;
    }

    public AbstractC1553590qWz getResourceValidator() {
        return this.resourceValidator;
    }

    public File getRootDirectory() {
        return this.rootDirectory;
    }

    public InterfaceC1551450qTX getStatisticMonitor() {
        return this.mStatisticMonitor;
    }

    public GeckoGlobalConfig(Builder builder) {
        Context context = builder.mContext;
        this.mContext = context;
        if (context != null) {
            Long l = builder.appId;
            this.mAppId = l;
            if (TextUtils.isEmpty(builder.appVersion)) {
                this.mAppVersion = C2362609No.LIZJ(context);
            } else {
                this.mAppVersion = builder.appVersion;
            }
            this.mDeviceId = builder.deviceId;
            String str = builder.host;
            this.mHost = str;
            this.mRegion = builder.region;
            ENVType eNVType = builder.env;
            this.mEnv = eNVType;
            if (!TextUtils.isEmpty(str)) {
                if (l != null) {
                    if (!TextUtils.isEmpty(this.mDeviceId)) {
                        if (eNVType != null) {
                            InterfaceC1504290pFT interfaceC1504290pFT = builder.mNetWork;
                            if (interfaceC1504290pFT == null) {
                                this.mNetWork = new C1504240pFO();
                            } else {
                                this.mNetWork = interfaceC1504290pFT;
                            }
                            this.mStatisticMonitor = builder.mStatisticMonitor;
                            this.mRequestTagHeaderProvider = builder.requestTagHeaderProvider;
                            this.mMonitorConfig = builder.monitorConfig;
                            this.rootDirectory = builder.rootDirectory;
                            this.resourceValidator = builder.resourceValidator;
                            this.candidateRootDirectories = builder.candidateRootDirectories;
                            long j = builder.appColdStartTime;
                            if (j == 0) {
                                this.mAppColdStartTime = System.currentTimeMillis();
                            } else {
                                this.mAppColdStartTime = j;
                            }
                            InterfaceC1553640qX4 interfaceC1553640qX4 = builder.geckoServiceManager;
                            if (interfaceC1553640qX4 == null) {
                                this.mGeckoServiceManager = new InterfaceC1553640qX4() { // from class: X.0qWP
                                };
                                return;
                            } else {
                                this.mGeckoServiceManager = interfaceC1553640qX4;
                                return;
                            }
                        }
                        throw new IllegalArgumentException("env is required");
                    }
                    throw new IllegalArgumentException("deviceId is required");
                }
                throw new IllegalArgumentException("appId is required");
            }
            throw new IllegalArgumentException("host is required");
        }
        throw new IllegalArgumentException("context is required");
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setRootDirectory(File file) {
        this.rootDirectory = file;
    }
}
