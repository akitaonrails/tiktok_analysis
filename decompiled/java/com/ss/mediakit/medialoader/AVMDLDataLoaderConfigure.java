package com.ss.mediakit.medialoader;

import X.C2188811AlT;
import X.C538540LAe;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLDataLoaderConfigure {
    public int mAccessCheckLevel;
    public int mAlogEnable;
    public String mAppInfo;
    public int mByteMediaNetLoaderCronetBufSizeKB;
    public String mCacheDir;
    public String mCacheDirListsStr;
    public int mCheckCacheDir;
    public int mCheckContentTypeMethod;
    public int mCheckPreloadLevel;
    public int mCheckSumLevel;
    public int mCloseLocalServer;
    public int mCloseThreadPool;
    public long mConnectPoolStragetyValue;
    public int mControlCDNRangeType;
    public String mCustomUA;
    public int mDNSMainType;
    public int mDevDiskSizeMB;
    public int mDevMemorySizeMB;
    public int mDeviceScoreEx;
    public int mDisableRecentCache;
    public String mDmDomain;
    public String mDomains;
    public int mDownLogMaxSize;
    public String mDownloadDir;
    public String mDynamicPreconnectConfigStr;
    public int mEnableBenchMarkIOSpeed;
    public int mEnableCacheReqRange;
    public int mEnableCellularUp;
    public int mEnableDataLoaderLockOpt;
    public int mEnableDownloaderLog;
    public int mEnableDynamicTimeout;
    public int mEnableEarlyData;
    public int mEnableEnginePortrait;
    public int mEnableEventInfo;
    public int mEnableExternDNS;
    public int mEnableFileCacheV2;
    public int mEnableFileMutexOptimize;
    public int mEnableFileRingBuffer;
    public int mEnableIOManager;
    public int mEnableIpBucket;
    public int mEnableJavaThreadMerge;
    public int mEnableLazyBufferpool;
    public int mEnableLoaderLogExtractUrls;
    public int mEnableLoaderPreempt;
    public int mEnableLoaderSeek;
    public int mEnableMaxCacheAgeForAllDir;
    public int mEnableMissReason;
    public int mEnableMultiDownloadPath;
    public int mEnableNetScheduler;
    public int mEnableNetworkChangeNotify;
    public int mEnableNewBufferpool;
    public int mEnableOkHttpLoader;
    public int mEnableOptimizeRange;
    public int mEnableP2PPreDown;
    public int mEnableP2pUpload;
    public int mEnablePcdnAuto;
    public int mEnablePlayInfoCache;
    public int mEnablePlayLog;
    public int mEnablePreconnect;
    public int mEnablePreloadReUse;
    public int mEnableReportTaskLog;
    public int mEnableSessionReuse;
    public int mEnableSocketReuse;
    public int mEnableSpeedEngine;
    public int mEnableSpeedPredict;
    public int mEnableSpeedReport;
    public int mEnableStorageModule;
    public int mEnableSyncDnsForPcdn;
    public int mEnableTTNetLoader;
    public int mEnableTTQuicHeLoader;
    public int mEnableTTQuicHeLoaderCheckWithNetworkType;
    public int mEnableTaskPointWrap;
    public int mEnableThreadPoolCheckIdle;
    public int mEnableTraceIdPreloadLog;
    public int mEnableUseFileExtendLoaderBuffer;
    public int mEnableUseGroupId;
    public int mEnableUseOriginalUrl;
    public int mEnableWaitNetReachable;
    public int mEncryptVersion;
    public String mEnginePortraitStr;
    public int mErrorStateTrustTime;
    public String mFileKeyRule;
    public int mFileManagerInterval;
    public String mFileRingBufferOptStr;
    public int mFirstRangeLeftThreshold;
    public int mForbidByPassCookie;
    public String mForesightDomain;
    public int mGetCookieTokenLevel;
    public int mGlobalSpeedSampleInterval;
    public int mHlsTsFileKeyGenerateType;
    public int mIgnorePlayInfo;
    public int mIgnoreTextSpeedTest;
    public int mIsAllowTryTheLastUrl;
    public int mIsCloseFileCache;
    public String mKeyDomain;
    public String mKeyToken;
    public String mLiveContainerString;
    public int mLiveEnableMdlProto;
    public int mLiveLoaderEnable;
    public int mLiveMobileDownloadAllow;
    public int mLiveMobileUploadAllow;
    public int mLiveP2pAllow;
    public int mLoadPcdnInterval;
    public String mLoaderFactoryDir;
    public int mLoaderType;
    public int mMainToBackUpDelayedTime;
    public int mMaxAliveHostNum;
    public int mMaxCacheSize;
    public int mMaxFileMemCacheNum;
    public int mMaxFileMemCacheSize;
    public int mMaxIpCountEachDomain;
    public int mMaxIpNum;
    public int mMaxLoaderLogNum;
    public int mMaxSocketReuseCount;
    public String mMdlExtensionOptsStr;
    public String mMdlTTQuicHeOptsStr;
    public int mMinAllowSpeed;
    public long mMonitorMinAllowLoadSize;
    public long mMonitorTimeInternal;
    public String mN80OptsStr;
    public String mNetCacheDir;
    public int mNetSChedulerBlockDurationMs;
    public int mNetSchedulerBlockAllNetErr;
    public int mNetSchedulerBlockErrCount;
    public int mNetSchedulerBlockHostIpErrCount;
    public String mNetSchedulerConfigStr;
    public int mNetUnreachableStopRetry;
    public int mNetUnreachableTimeout;
    public int mNewBufferPoolBlockSize;
    public int mNewBufferPoolGrowBlockCount;
    public int mNewBufferPoolResidentSize;
    public int mNewUserOptVer;
    public int mNextDownloadThreshold;
    public int mNonBlockRangeMaxSizeKB;
    public int mNonBlockRangeMode;
    public int mOnlyUseCdn;
    public int mOpenTimeOut;
    public String mP2PConfigStr;
    public String mP2PCostTag;
    public long mP2PStragetyLevel;
    public int mPlayTaskNotWriteDisk;
    public String mPrecisePreloadConfigStr;
    public String mProtectCacheDirsStr;
    public int mRWTimeOut;
    public int mSessionCacheInterval;
    public String mSettingsDomain;
    public int mSkipCDNBeforeExpiredSec;
    public int mSocketRecvBufferSize;
    public String mSocketTraingCenterConfigStr;
    public int mSpeedCoefficientValue;
    public String mSpeedEngineSetting;
    public int mSpeedSampleInterval;
    public int mStoIoWriteLimitKBTh1;
    public int mStoIoWriteLimitKBTh2;
    public int mStoLevel;
    public int mStoMaxIdleTimeSec;
    public int mStoPlayDldWinSizeKBLS;
    public int mStoPlayDldWinSizeKBNM;
    public int mStoRingBufferSizeKB;
    public int mStoSensitiveUser;
    public String mStoStrategyConfig;
    public String mTTKMNConfigStr;
    public int mTTNetLoaderCronetBufSizeKB;
    public String mTTquicheCacheDir;
    public String mTemporaryOptStr;
    public int mThreadPoolMinCount;
    public int mThreadPoolTTLSecond;
    public int mThreadStackSizeLevel;
    public int mTryCount;
    public int mUpdateCacheFileInternal;
    public int mUseNewSpeedTestForSingle;
    public String mVdpABTestId;
    public String mVdpExtGlobalInfo;
    public String mVdpGroupId;
    public int mZeroRatingStatus;
    public int mMaxIPV6Num = Integer.MAX_VALUE;
    public int mMaxIPV4Num = Integer.MAX_VALUE;
    public int mP2PPreDownPeerCount = 5;
    public int mP2PFirstRangeLoaderType = 1;
    public int mPreloadInfoRecordMaxCnt = 20;
    public int mLoaderFactoryMaxCacheSize = 209715200;
    public int mLoaderFactoryMaxMemorySize = 5242880;
    public int mPreloadParallelNum = 1;
    public int mMaxCacheAge = 1209600;
    public int mPreloadStrategy = 1;
    public int mPreloadWaitListType = 1;
    public int mSocketIdleTimeOut = 120;
    public int mDNSBackType = 2;
    public int mTestSpeedTypeVersion = 1;
    public int mDefaultExpiredTime = 120;
    public int mSocketSendBufferKB = -1;
    public int mRingBufferSizeKB = -1;
    public int mFileExtendSizeKB = 8192;
    public int mLiveLoaderType = 10000;
    public int mLiveWatchDurationThreshold = 20000;
    public int mLiveCacheThresholdHttpToP2p = 3500;
    public int mLiveCacheThresholdP2pToHttp = LSPassThroughRecordSizeConfig.DEFAULT;
    public int mLiveMaxTrySwitchP2pTimes = 3;
    public int mLiveWaitP2pReadyThreshold = C538540LAe.LLJJJIL;
    public int mLiveRecvDataTimeout = 5000;
    public int mPreconnectNum = 3;
    public int mMaxTlsVersion = 2;
    public int mXYLibValue = -1;
    public int mWriteFileNotifyIntervalMS = 500;
    public int mSessionTimeout = 3600;
    public int mSocketInitialTimeout = 3;
    public int mEnableOwnVDPPreloadNotify = 1;
    public int mCellularUpAsyncDelay = 60;
    public int mEnableByteMediaNetLoader = 0;

    public static AVMDLDataLoaderConfigure getDefaultonfigure() {
        return new AVMDLDataLoaderConfigure(314572800, 5, 5, 0, null);
    }

    public void ParseJsonConfig() {
        try {
            if (this.mLiveContainerString != null) {
                JSONObject jSONObject = new JSONObject(this.mLiveContainerString);
                if (jSONObject.isNull("enable_mdl_proto")) {
                    return;
                }
                this.mLiveEnableMdlProto = JSONObjectProtectorUtils.getInt(jSONObject, "enable_mdl_proto");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mdl live json enable_mdl_proto:");
                sbLIZ.append(this.mLiveEnableMdlProto);
                AVMDLLog.w("ttmn", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parse json config fail:");
            sbLIZ2.append(e.toString());
            AVMDLLog.e("ttmn", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void setProtectCacheDirs(String[] strArr) {
        if (strArr.length == 0) {
            return;
        }
        this.mProtectCacheDirsStr = null;
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                if (this.mProtectCacheDirsStr == null) {
                    this.mProtectCacheDirsStr = strArr[i];
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.mProtectCacheDirsStr);
                    sbLIZ.append("|");
                    sbLIZ.append(strArr[i]);
                    this.mProtectCacheDirsStr = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        if (TextUtils.isEmpty(this.mProtectCacheDirsStr)) {
            AVMDLLog.e("AVMDLDataLoaderConfigure", "protect cache dir list str is null");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("protect cache dir list str is:");
        sbLIZ2.append(this.mProtectCacheDirsStr);
        AVMDLLog.d("AVMDLDataLoaderConfigure", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public void setCacheInfoList(String[] strArr, long[] jArr) {
        if (strArr.length != 0 && jArr.length != 0 && strArr.length == jArr.length) {
            this.mCacheDirListsStr = null;
            for (int i = 0; i < strArr.length; i++) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    if (this.mCacheDirListsStr == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strArr[i]);
                        sbLIZ.append(e3.c);
                        sbLIZ.append(Long.toString(jArr[i]));
                        this.mCacheDirListsStr = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.mCacheDirListsStr);
                        sbLIZ2.append("|");
                        sbLIZ2.append(strArr[i]);
                        sbLIZ2.append(e3.c);
                        sbLIZ2.append(Long.toString(jArr[i]));
                        this.mCacheDirListsStr = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
            }
            if (TextUtils.isEmpty(this.mCacheDirListsStr)) {
                AVMDLLog.e("AVMDLDataLoaderConfigure", "cache dir list str is null");
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cache dir list str is:");
            sbLIZ3.append(this.mCacheDirListsStr);
            AVMDLLog.d("AVMDLDataLoaderConfigure", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public AVMDLDataLoaderConfigure(int i, int i2, int i3, int i4, String str) {
        this.mMaxCacheSize = i;
        this.mOpenTimeOut = i2;
        this.mRWTimeOut = i3;
        this.mTryCount = i4;
        this.mCacheDir = str;
    }
}
