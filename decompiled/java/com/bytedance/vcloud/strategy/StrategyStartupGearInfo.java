package com.bytedance.vcloud.strategy;

import X.C08FF;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class StrategyStartupGearInfo {

    public static class GearRequest {
        public String mAbrAdaptiveStr;
        public JSONObject mAbrBitrateInfoMap;
        public JSONObject mAbrGearToResolutionMap;
        public JSONObject mAbrGearToSizeMap;
        public JSONObject mAbrRtBitrateInfoMap;
        public JSONObject mAbrRtBitratePctMap;
        public JSONObject mAbrRtBitrateStdMap;
        public JSONObject mAbrRtBitrateTsMap;
        public JSONObject mAbrRtBitrateVpaasTsMap;
        public int mCallType;
        public String mDefaultResolution;
        public boolean mEnableBandwidthEstimationStrategy;
        public boolean mEnableGetCybertronVrtbitrate;
        public boolean mEnableProbeStartupBitrate;
        public boolean mEnableStartupRetry;
        public boolean mEnableUseStartupCache;
        public int mFirstSession;
        public String mHost;
        public int mIsPreview;
        public int mIsReused;
        public boolean mIsWidevineDrm;
        public long mLatestVrtbitrateTs;
        public String mNeptuneName;
        public JSONObject mOriginResolution;
        public JSONObject mPageLayoutRatio;
        public int mPushResolution;
        public int mRealStartupRetryCount;
        public JSONObject mRenderViewSize;
        public JSONObject mScreenInfo;
        public String mStartupResListStr;
        public ILiveStartupRetryListener mStartupRetryListener;
        public JSONObject mStartupStrategyInputParams;
        public int mUserCount;
        public String mWidevineSecurityLevel;
        public JSONObject mbandwidthEstimationStrategyInputParams;
        public String mRoomId = "";
        public String mStreamName = "";
        public int mIsHorizontalScreen = -1;
        public String mLevel = "main";
        public int mStartupRetryInterval = 30000;
        public int mStartupRetryLimitCount = 30;
        public int mNetworkLevel = -1;
        public int mNetworkRecommendBitrate = -1;
        public String mCdnName = "";
        public String mSessionID = "";
        public String mConnectionID = "";
        public String mEnterMethod = "";
        public String mConfigUniqueId = "";

        public void reset() {
        }

        public JSONObject getCallerInfo() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("RoomID", this.mRoomId);
                jSONObject.put("StreamName", this.mStreamName);
                jSONObject.put("CDNName", this.mCdnName);
                jSONObject.put("IsReused", this.mIsReused);
                jSONObject.put("FirstSession", this.mFirstSession);
                jSONObject.put("CallType", this.mCallType);
                jSONObject.put("SessionID", this.mSessionID);
                jSONObject.put("ConnectionID", this.mConnectionID);
                return jSONObject;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }

        public JSONObject toBandwidthJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PLAY-NeptuneName", this.mNeptuneName);
                return jSONObject;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }

        public JSONObject toFeatureListJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PLAY-IsPreview", this.mIsPreview);
                jSONObject.put("PLAY-IsHorizontalScreen", this.mIsHorizontalScreen);
                jSONObject.put("PLAY-PushResolution", this.mPushResolution);
                jSONObject.put("PLAY-NeptuneName", this.mNeptuneName);
                jSONObject.put("PLAY-DefaultResolution", this.mDefaultResolution);
                jSONObject.put("PLAY-BitrateList", this.mAbrBitrateInfoMap);
                jSONObject.put("PLAY-RTBitrateList", this.mAbrRtBitrateInfoMap);
                jSONObject.put("PLAY-RTBitrateTsList", this.mAbrRtBitrateTsMap);
                jSONObject.put("PLAY-RTBitrateStdList", this.mAbrRtBitrateStdMap);
                jSONObject.put("PLAY-RTBitratePctList", this.mAbrRtBitratePctMap);
                jSONObject.put("PLAY-GearToResolution", this.mAbrGearToResolutionMap);
                jSONObject.put("PLAY-GearToSize", this.mAbrGearToSizeMap);
                jSONObject.put("PLAY-UserCount", this.mUserCount);
                jSONObject.put("PLAY-CallerInfo", getCallerInfo());
                jSONObject.put("NETWORK-NetworkLevel", this.mNetworkLevel);
                jSONObject.put("NETWORK-RecommendBitrate", this.mNetworkRecommendBitrate);
                if (!TextUtils.isEmpty(this.mHost)) {
                    jSONObject.put("PLAY-HostName", this.mHost);
                }
                JSONObject jSONObject2 = this.mScreenInfo;
                if (jSONObject2 != null) {
                    jSONObject.put("DEVICE-ScreenInfo", jSONObject2);
                }
                JSONObject jSONObject3 = this.mOriginResolution;
                if (jSONObject3 != null && jSONObject3.length() > 0) {
                    jSONObject.put("PLAY-OriginVideoSize", this.mOriginResolution);
                }
                JSONObject jSONObject4 = this.mPageLayoutRatio;
                if (jSONObject4 != null && jSONObject4.length() > 0) {
                    jSONObject.put("PLAY-LayoutRatio", this.mPageLayoutRatio);
                }
                JSONObject jSONObject5 = this.mRenderViewSize;
                if (jSONObject5 != null && jSONObject5.length() > 0) {
                    jSONObject.put("PLAY-RenderViewResolution", this.mRenderViewSize);
                }
                if (!TextUtils.isEmpty(this.mEnterMethod)) {
                    jSONObject.put("PLAY-EnterMethod", this.mEnterMethod);
                    return jSONObject;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return jSONObject;
        }

        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("inputFeatureData", toFeatureListJson());
                jSONObject.put("startupInputParams", this.mStartupStrategyInputParams);
                jSONObject.put("bandwidthInputParams", this.mbandwidthEstimationStrategyInputParams);
                jSONObject.put("configUniqueId", this.mConfigUniqueId);
                return jSONObject;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }

        public JSONObject toStartupJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PLAY-IsPreview", this.mIsPreview);
                jSONObject.put("PLAY-IsHorizontalScreen", this.mIsHorizontalScreen);
                jSONObject.put("PLAY-PushResolution", this.mPushResolution);
                jSONObject.put("PLAY-NeptuneName", this.mNeptuneName);
                jSONObject.put("PLAY-DefaultResolution", this.mDefaultResolution);
                jSONObject.put("PLAY-BitrateList", this.mAbrBitrateInfoMap);
                jSONObject.put("PLAY-RTBitrateList", this.mAbrRtBitrateInfoMap);
                jSONObject.put("PLAY-RTBitrateTsList", this.mAbrRtBitrateTsMap);
                jSONObject.put("PLAY-RTBitrateStdList", this.mAbrRtBitrateStdMap);
                jSONObject.put("PLAY-RTBitratePctList", this.mAbrRtBitratePctMap);
                jSONObject.put("PLAY-GearToResolution", this.mAbrGearToResolutionMap);
                jSONObject.put("PLAY-GearToSize", this.mAbrGearToSizeMap);
                jSONObject.put("PLAY-UserCount", this.mUserCount);
                return jSONObject;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }
    }

    public static class GearResponse {
        public JSONObject mCybertronRtBitrateInfoMap;
        public JSONObject mCybertronRtBitrateTsMap;
        public JSONObject mCybertronRtBitrateVpaasTsMap;
        public int mHitCybertronVrtbitrate;
        public long mParseStrategyConfigCostUs;
        public int mStartupExecType;
        public long mStartupStrategyEndTs;
        public long mStartupStrategyStartTs;
        public JSONObject mStrategyLog;
        public String mStrategyResult;
        public String mGear = "";
        public String mRoomId = "";

        public void reset() {
            this.mGear = "";
            this.mStrategyLog = null;
            this.mStartupExecType = 0;
            this.mStrategyResult = null;
        }
    }

    public enum LiveStartupExecType {
        STARTUP_EXEC_TYPE_NONE,
        STARTUP_EXEC_TYPE_LOCAL_STRATEGY,
        STARTUP_EXEC_TYPE_PYTHON_STRATEGY,
        STARTUP_EXEC_TYPE_PLAYER_STRATEGY,
        STARTUP_EXEC_TYPE_FAIL;

        public static LiveStartupExecType valueOf(String str) {
            return (LiveStartupExecType) C08FF.LIZ(LiveStartupExecType.class, str);
        }
    }
}
