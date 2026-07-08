package com.ss.bduploader;

import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bduploader.smartserver.SmartRouting;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class BDVideoUploader extends BDVideoUploaderBase {
    public boolean hasInit;
    public int mEstimatedFileSize = -1;
    public int mEstimatedVideoDuration;
    public JSONObject mEstimatedVideoInfo;
    public int mEstimatedVideoRate;
    public SmartRouting mSmartRouting;

    private void preloadModel() {
        SmartRouting smartRouting = this.mSmartRouting;
        if (smartRouting != null) {
            smartRouting.preloadEnv();
        }
    }

    @Override // com.ss.bduploader.BDVideoUploaderBase
    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._mergeUpload(j);
    }

    public void cancelUpload() {
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
        } else {
            BDVideoUploaderBase._cancelUpload(j);
            this.mWriteLock.unlock();
        }
    }

    private void checkAndInit(String str) {
        if (this.hasInit) {
            return;
        }
        this.hasInit = true;
        SmartRouting smartRouting = new SmartRouting();
        this.mSmartRouting = smartRouting;
        smartRouting.init();
        this.mSmartRouting.parseUrl(str);
        this.mSmartRouting.configServer();
    }

    private String insertFileSizeInfo(String str) {
        JSONObject jSONObject;
        try {
            int i = this.mEstimatedVideoDuration * this.mEstimatedVideoRate;
            if (i <= 0) {
                i = this.mEstimatedFileSize;
            }
            this.mEstimatedFileSize = i;
            jSONObject = new JSONObject(str);
            jSONObject.put("est_file_size", this.mEstimatedFileSize / 1024);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return str;
        }
        return C786410Ut5.J3(jSONObject);
    }

    private float predictIntelligentTCPQUIC(String str) {
        if (this.mSmartRouting == null) {
            return -1.0f;
        }
        try {
            return this.mSmartRouting.predictSpeedSync(new JSONObject(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1.0f;
        }
    }

    private JSONObject processIntelligentPrediction(float f) {
        JSONObject jSONObject = new JSONObject();
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        try {
            if (f < 0.5d) {
                jSONObject.put("intelligentRoutingResult", 0);
                return jSONObject;
            }
            jSONObject.put("intelligentRoutingResult", 1);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public void setAuthType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 416, i);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String strMapToString;
        if (this.mHandle != 0 && treeMap != null && (strMapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, strMapToString);
        }
    }

    public void setContext(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            BDVideoUploaderBase._setContext(j, str);
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject jSONObjectMapToJSON;
        if (this.mHandle == 0 || treeMap == null || (jSONObjectMapToJSON = BDUploadUtil.mapToJSON(treeMap)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("custom_config", jSONObjectMapToJSON);
            String strJ3 = C786410Ut5.J3(jSONObject);
            if (!TextUtils.isEmpty(strJ3)) {
                setStringValue(63, strJ3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setCustomQUICConfig(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setStringValue(j, 445, str);
    }

    public void setDataTransportProtocol(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            BDVideoUploaderBase._setIntValue(j, 411, i);
        }
    }

    public void setEstimatedVideoInfo(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && !treeMap.isEmpty()) {
            JSONObject jSONObjectMapToJSON = BDUploadUtil.mapToJSON(treeMap);
            this.mEstimatedVideoInfo = jSONObjectMapToJSON;
            if (jSONObjectMapToJSON == null) {
                return;
            }
            try {
                this.mEstimatedVideoDuration = JSONObjectProtectorUtils.getInt(jSONObjectMapToJSON, "durationMs") / LSPassThroughRecordSizeConfig.DEFAULT;
                this.mEstimatedVideoRate = JSONObjectProtectorUtils.getInt(this.mEstimatedVideoInfo, "bitrateKb");
                BDVideoUploaderBase._setStringValue(this.mHandle, 436, C786410Ut5.J3(this.mEstimatedVideoInfo));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void setExternFileReader(BDExternalFileReader bDExternalFileReader) {
        long j = this.mHandle;
        if (j != 0 && bDExternalFileReader != null) {
            BDVideoUploaderBase._setIntValue(j, 71, 1);
            BDVideoUploaderBase._setObject(this.mHandle, 200, bDExternalFileReader);
        }
    }

    public void setExternMinSIze(int i) {
        long j = this.mHandle;
        if (j != 0 && i > 0) {
            BDVideoUploaderBase._setIntValue(j, 77, i);
        }
    }

    public void setExternalReaderMode(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            BDVideoUploaderBase._setIntValue(j, 412, i);
        }
    }

    public void setGeneralOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 456, i);
    }

    public void setHeartBeatErrorInfoOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 455, i);
    }

    public void setHttpRequestPriority(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 462, i);
    }

    public void setInternalErrorInfoEventOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 454, i);
    }

    public void setNoNetBlockOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        this.mNoNetBlockOption = i;
        BDVideoUploaderBase._setIntValue(j, 458, i);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String strMapToString = BDUploadUtil.mapToString(treeMap);
            if (!TextUtils.isEmpty(strMapToString)) {
                setStringValue(55, strMapToString);
            }
        }
    }

    @Override // com.ss.bduploader.BDVideoUploaderBase
    public void setPreUploadEncryptionMode(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 74, i);
    }

    public void setPreUploadMode(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 459, i);
    }

    public void setPrivateVideo(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 414, z ? 1 : 0);
    }

    public void setProcessActionType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 65, i);
    }

    public void setQueryAuth(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            BDVideoUploaderBase._setStringValue(j, 15, str);
        }
    }

    public void setRetryStatesOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 434, i);
    }

    public void setSDKRetryCallbackOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 448, i);
    }

    public void setSpeedTestThresh(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 406, i);
    }

    public void setSpeedTestValue(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 405, i);
    }

    public void setStarshipOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 469, i);
    }

    public void setTTNetEngineFallbackOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 437, i);
    }

    public void setUserReference(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            BDVideoUploaderBase._setStringValue(j, 62, str);
        }
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String intelligentInterface(int i, String str) {
        JSONObject jSONObjectProcessIntelligentPrediction;
        if (i != 0) {
            if (i == 1 && (jSONObjectProcessIntelligentPrediction = processIntelligentPrediction(predictIntelligentTCPQUIC(insertFileSizeInfo(str)))) != null) {
                return C786410Ut5.J3(jSONObjectProcessIntelligentPrediction);
            }
            return "";
        }
        checkAndInit(str);
        preloadModel();
        return "";
    }

    public void set1001DomainFallbackOption(int i, String str) {
        long j = this.mHandle;
        if (j != 0 && i > 0) {
            BDVideoUploaderBase._setIntValue(j, 452, i);
            BDVideoUploaderBase._setStringValue(this.mHandle, 453, str);
        }
    }

    public void setHeartBeatOption(int i, int i2) {
        long j = this.mHandle;
        if (j != 0 && i > 0 && i2 > 0) {
            BDVideoUploaderBase._setIntValue(j, 446, i);
            BDVideoUploaderBase._setIntValue(this.mHandle, 447, i2);
        }
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, i, i2);
    }

    public void setTTNetForbidOption(int i, String str) {
        long j = this.mHandle;
        if (j != 0 && i > 0) {
            BDVideoUploaderBase._setIntValue(j, 450, i);
            BDVideoUploaderBase._setStringValue(this.mHandle, 451, str);
        }
    }

    public void setCustomApplyPhaseTimeoutParams(int i, int i2, int i3, int i4) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 463, 4);
        BDVideoUploaderBase._setIntValue(this.mHandle, 464, i);
        BDVideoUploaderBase._setIntValue(this.mHandle, 465, i2);
        BDVideoUploaderBase._setIntValue(this.mHandle, 466, i3);
        BDVideoUploaderBase._setIntValue(this.mHandle, 467, i4);
    }

    public void setCustomNetworkTimeoutParams(int i, int i2, int i3, int i4, int i5) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDVideoUploaderBase._setIntValue(j, 422, i);
        BDVideoUploaderBase._setIntValue(this.mHandle, 423, i2);
        BDVideoUploaderBase._setIntValue(this.mHandle, 424, i3);
        BDVideoUploaderBase._setIntValue(this.mHandle, 425, i4);
        BDVideoUploaderBase._setIntValue(this.mHandle, 427, i5);
    }
}
