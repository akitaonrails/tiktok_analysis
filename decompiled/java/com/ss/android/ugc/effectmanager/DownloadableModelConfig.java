package com.ss.android.ugc.effectmanager;

import X.C08FF;
import X.C13R7;
import X.C13RD;
import X.C13RF;
import X.C13SS;
import X.C13SV;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.knadapt.KNExecutor;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt;
import com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes31.dex */
public final class DownloadableModelConfig {
    public final String mAccessKey;
    public final String mAppId;
    public final AssetManager mAssetManager;
    public final Context mContext;
    public final String mDeviceType;
    public final EffectConfiguration mEffectConfiguration;
    public final IEffectNetWorker mEffectNetWorker;
    public final ModelEventListener mEventListener;
    public final Pattern mExclusionPattern;
    public final Executor mExecutor;
    public final FetchModelType mFetchModelType;
    public final List<Host> mHosts;
    public final IJsonConverter mJsonConverter;
    public C13RD mKNEffectConfig;
    public final ModelFileEnv mModelFileEnv;
    public final IMonitorService mMonitorService;
    public final String mSdkVersion;
    public final String mWorkspace;

    public static final class Builder {
        public String mAccessKey;
        public String mAppId;
        public AssetManager mAssetManager;
        public String mBid;
        public Context mContext;
        public String mDeviceType;
        public EffectConfiguration mEffectConfiguration;
        public IEffectNetWorker mEffectNetWorker;
        public ModelEventListener mEventListener;
        public Pattern mExclusionPattern;
        public Executor mExecutor;
        public FetchModelType mFetchModelType;
        public IJsonConverter mJsonConverter;
        public ModelFileEnv mModelFileEnv;
        public IMonitorService mMonitorService;
        public String mSdkVersion;
        public String mWorkspace;
        public List<Host> mHosts = new ArrayList();
        public C13RF mKNEffectConfigBuilder = new C13RF();

        public DownloadableModelConfig build() {
            return new DownloadableModelConfig(this);
        }

        public C13RD buildKNConfig() {
            C13RF c13rf = this.mKNEffectConfigBuilder;
            c13rf.getClass();
            return new C13RD(c13rf);
        }

        public Builder abDiffEffect(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJ = z;
            return this;
        }

        public Builder ignoreBuiltInModel(boolean z) {
            this.mKNEffectConfigBuilder.LJJJIL = z;
            return this;
        }

        public Builder ignoreModelLruVersion(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJJ = z;
            return this;
        }

        public Builder modelNameCache(boolean z) {
            this.mKNEffectConfigBuilder.LJJJJJL = z;
            return this;
        }

        public Builder setAccessKey(String str) {
            this.mAccessKey = str;
            this.mKNEffectConfigBuilder.LIZ = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.mAppId = str;
            this.mKNEffectConfigBuilder.LJFF = str;
            return this;
        }

        public Builder setAssetManager(AssetManager assetManager) {
            this.mAssetManager = assetManager;
            return this;
        }

        public Builder setBackupUrlRetryCount(int i) {
            this.mKNEffectConfigBuilder.LJIILLIIL = i;
            return this;
        }

        public Builder setBid(String str) {
            this.mBid = str;
            return this;
        }

        public Builder setContext(Context context) {
            Context contextN3 = C786410Ut5.N3(context);
            this.mContext = contextN3;
            this.mKNEffectConfigBuilder.LJJIIZI = contextN3;
            return this;
        }

        public Builder setDeviceType(String str) {
            this.mDeviceType = str;
            this.mKNEffectConfigBuilder.LJIIJJI = str;
            return this;
        }

        public Builder setEffectConfiguration(EffectConfiguration effectConfiguration) {
            this.mEffectConfiguration = effectConfiguration;
            if (effectConfiguration.getContext() != null && this.mContext == null) {
                setContext(effectConfiguration.getContext());
            }
            if (effectConfiguration.getAppVersion() != null) {
                this.mKNEffectConfigBuilder.LIZJ = effectConfiguration.getAppVersion();
            }
            if (effectConfiguration.getChannel() != null) {
                this.mKNEffectConfigBuilder.LJIIIZ = effectConfiguration.getChannel();
            }
            if (effectConfiguration.getDeviceId() != null) {
                this.mKNEffectConfigBuilder.LIZLLL = effectConfiguration.getDeviceId();
            }
            if (effectConfiguration.getPlatform() != null) {
                this.mKNEffectConfigBuilder.LJIIJ = effectConfiguration.getPlatform();
            }
            if (effectConfiguration.getRegion() != null) {
                this.mKNEffectConfigBuilder.LJ = effectConfiguration.getRegion();
            }
            if (effectConfiguration.getAppLanguage() != null) {
                this.mKNEffectConfigBuilder.LJIJ = effectConfiguration.getAppLanguage();
            }
            if (effectConfiguration.getGpuVersion() != null) {
                this.mKNEffectConfigBuilder.LJJ = effectConfiguration.getGpuVersion();
            }
            if (effectConfiguration.getTestStatus() != null) {
                this.mKNEffectConfigBuilder.LJIL = effectConfiguration.getTestStatus();
            }
            this.mKNEffectConfigBuilder.LJJIJIL = Integer.valueOf(effectConfiguration.getFilterType());
            return this;
        }

        public Builder setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.mEffectNetWorker = iEffectNetWorker;
            this.mKNEffectConfigBuilder.LJI = new KNNetworkClient(iEffectNetWorker);
            return this;
        }

        public Builder setEventListener(ModelEventListener modelEventListener) {
            this.mEventListener = modelEventListener;
            C13RF c13rf = this.mKNEffectConfigBuilder;
            ModelListenerAdaptKt.toKNListener(modelEventListener);
            c13rf.getClass();
            return this;
        }

        public Builder setExclusionPattern(String str) {
            if (str == null) {
                this.mExclusionPattern = null;
                return this;
            }
            this.mExclusionPattern = PatternProtector.compile(str);
            this.mKNEffectConfigBuilder.LJJIJIIJI = str;
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.mExecutor = executor;
            this.mKNEffectConfigBuilder.LJIJI = new KNExecutor(executor);
            return this;
        }

        public Builder setFetchModelListApiVersion(int i) {
            this.mKNEffectConfigBuilder.LJJJJLI = i;
            return this;
        }

        public Builder setHosts(List<Host> list) {
            this.mHosts.addAll(list);
            if (!list.isEmpty()) {
                this.mKNEffectConfigBuilder.LJJII = ((Host) ListProtector.get(list, 0)).getItemName();
            }
            return this;
        }

        public Builder setJsonConverter(IJsonConverter iJsonConverter) {
            this.mJsonConverter = iJsonConverter;
            this.mKNEffectConfigBuilder.LJII = new C13R7(new KNJsonConverter(iJsonConverter));
            return this;
        }

        public Builder setModelApiMaxTryCount(int i) {
            this.mKNEffectConfigBuilder.LJIIZILJ = i;
            return this;
        }

        public Builder setModelFileEnv(ModelFileEnv modelFileEnv) {
            this.mModelFileEnv = modelFileEnv;
            this.mKNEffectConfigBuilder.LJJIJIIJIL = ModelConverterExtKt.toKNModel(modelFileEnv);
            return this;
        }

        public Builder setModelType(FetchModelType fetchModelType) {
            this.mFetchModelType = fetchModelType;
            this.mKNEffectConfigBuilder.LJJIJ = ModelConverterExtKt.toKNFetchModelType(fetchModelType);
            return this;
        }

        public Builder setMonitorService(IMonitorService iMonitorService) {
            this.mMonitorService = iMonitorService;
            this.mKNEffectConfigBuilder.LJIJJLI = new KNMonitorService(iMonitorService);
            return this;
        }

        public Builder setRetryCount(int i) {
            this.mKNEffectConfigBuilder.LJIILL = i;
            return this;
        }

        public Builder setSdkVersion(String str) {
            this.mSdkVersion = str;
            this.mKNEffectConfigBuilder.LIZIZ = str;
            return this;
        }

        public Builder setWorkspace(String str) {
            this.mWorkspace = str;
            this.mKNEffectConfigBuilder.LJIILJJIL = str;
            return this;
        }
    }

    public String getAccessKey() {
        return this.mAccessKey;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public AssetManager getAssetManager() {
        return this.mAssetManager;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public EffectConfiguration getEffectConfiguration() {
        return this.mEffectConfiguration;
    }

    public IEffectNetWorker getEffectNetWorker() {
        return this.mEffectNetWorker;
    }

    public ModelEventListener getEventListener() {
        return this.mEventListener;
    }

    public Pattern getExclusionPattern() {
        return this.mExclusionPattern;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public List<Host> getHosts() {
        return this.mHosts;
    }

    public IJsonConverter getJsonConverter() {
        return this.mJsonConverter;
    }

    public C13RD getKNEffectConfig() {
        return this.mKNEffectConfig;
    }

    public ModelFileEnv getModelFileEnv() {
        return this.mModelFileEnv;
    }

    public FetchModelType getModelType() {
        return this.mFetchModelType;
    }

    public IMonitorService getMonitorService() {
        return this.mMonitorService;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public String getWorkspace() {
        return this.mWorkspace;
    }

    public enum ModelFileEnv {
        TEST,
        ONLINE;

        public static ModelFileEnv valueOf(String str) {
            return (ModelFileEnv) C08FF.LIZ(ModelFileEnv.class, str);
        }
    }

    public DownloadableModelConfig(Builder builder) {
        AssetManager assetManager = builder.mAssetManager;
        Preconditions.checkNotNull(assetManager);
        this.mAssetManager = assetManager;
        String str = builder.mWorkspace;
        Preconditions.checkNotNull(str);
        this.mWorkspace = str;
        IEffectNetWorker iEffectNetWorker = builder.mEffectNetWorker;
        Preconditions.checkNotNull(iEffectNetWorker);
        this.mEffectNetWorker = iEffectNetWorker;
        this.mHosts = Collections.unmodifiableList(builder.mHosts);
        IJsonConverter iJsonConverter = builder.mJsonConverter;
        Preconditions.checkNotNull(iJsonConverter);
        this.mJsonConverter = iJsonConverter;
        Executor executor = builder.mExecutor;
        Preconditions.checkNotNull(executor);
        this.mExecutor = executor;
        String str2 = builder.mDeviceType;
        Preconditions.checkNotNull(str2);
        this.mDeviceType = str2;
        String str3 = builder.mSdkVersion;
        Preconditions.checkNotNull(str3);
        this.mSdkVersion = str3;
        String str4 = builder.mAppId;
        Preconditions.checkNotNull(str4);
        this.mAppId = str4;
        String str5 = builder.mAccessKey;
        Preconditions.checkNotNull(str5);
        this.mAccessKey = str5;
        this.mMonitorService = builder.mMonitorService;
        this.mExclusionPattern = builder.mExclusionPattern;
        this.mEventListener = builder.mEventListener;
        ModelFileEnv modelFileEnv = builder.mModelFileEnv;
        this.mModelFileEnv = modelFileEnv == null ? ModelFileEnv.ONLINE : modelFileEnv;
        FetchModelType fetchModelType = builder.mFetchModelType;
        this.mFetchModelType = fetchModelType == null ? FetchModelType.ORIGIN : fetchModelType;
        this.mEffectConfiguration = builder.mEffectConfiguration;
        this.mContext = builder.mContext;
        C13RD c13rdBuildKNConfig = builder.buildKNConfig();
        this.mKNEffectConfig = c13rdBuildKNConfig;
        if (c13rdBuildKNConfig != null) {
            C13SV c13sv = new C13SV() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelConfig.1
                public void setEnabled(boolean z) {
                }

                @Override // X.C13SV
                public boolean getEnabled() {
                    return EPLog.INSTANCE.getSEnableLog();
                }

                @Override // X.C13SV
                public void logDebug(String str6, String str7) {
                    EPLog.d(str6, str7);
                }

                @Override // X.C13SV
                public void logError(String str6, String str7) {
                    EPLog.e(str6, str7);
                }

                @Override // X.C13SV
                public void logWarn(String str6, String str7) {
                    EPLog.w(str6, str7);
                }

                @Override // X.C13SV
                public void logError(String str6, String str7, Throwable th) {
                    EPLog.e(str6, str7, th);
                }
            };
            C13SS.LIZ.getClass();
            C13SS.LIZIZ = c13sv;
        }
    }
}
