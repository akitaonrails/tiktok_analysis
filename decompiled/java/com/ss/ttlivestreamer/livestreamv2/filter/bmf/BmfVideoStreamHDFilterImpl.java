package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.AbstractC1272680jDu;
import X.C0VSJ;
import X.C1267500j5Y;
import X.C1283100jUi;
import X.C1283830jVt;
import X.C1283840jVu;
import X.C1283870jVx;
import X.C1283890jVz;
import X.C1283900jW0;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1267980j6K;
import X.InterfaceC1273880jFq;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.os.Handler;
import com.bytedance.bmf_mods_api.ByteStreamHDAPI;
import com.bytedance.bmf_mods_api.ByteStreamHDCallbackAPI;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoStreamHDFilterImpl;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BmfVideoStreamHDFilterImpl extends AbstractC1272680jDu {
    public String mAccessKey;
    public int mAesBoostAlgType;
    public int[] mAesBoostGroupIds;
    public String mAesBoostModelNamePrefix;
    public int mAlgorithmType;
    public boolean mAlreadyInited;
    public int mBackend;
    public EnumC1267980j6K mBuildPipelineScene;
    public InterfaceC1273880jFq mCallback;
    public int mDenoiseAbStrategy;
    public int mDenoiseAlgType;
    public int mDenoiseWindowType;
    public int mDownloadStatus;
    public int mFrameCnt;
    public Handler mHandler;
    public boolean mInitAesboostEnable;
    public JSONObject mInitColorCorrectionSettings;
    public boolean mInitDenoiseEnable;
    public boolean mInitEnableColorCorrection;
    public boolean mInitNoiseDetectEnable;
    public int mInitProcessMode;
    public boolean mInitSharpEnable;
    public boolean mIsOes;
    public int mMaxHeight;
    public int mMaxWidth;
    public String mModeDownloadUrl;
    public int mPoolSize;
    public int mProcessMode;
    public String mProgramCache;
    public int mReservedParam;
    public int mSharpAlgType;
    public float mSharpStrength;
    public float mSharpThresholdHigh;
    public float mSharpThresholdLow;
    public ByteStreamHDAPI mStreamHD;
    public boolean mStreamHDEnable;
    public C1283840jVu mStreamHDconfig;
    public int mSubAlgListIndex;
    public int mTexProcessType;
    public int mCameraFacing = -1;
    public int mInTex = -1;
    public int mOutTex = -1;
    public int mWidth = -1;
    public int mHeight = -1;
    public boolean mCanSkipNode = true;
    public int mForceAesboostEnableStatus = -1;

    /* JADX WARN: Multi-variable type inference failed */
    private int calculateProcessMode(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = z;
        if (z2) {
            i = (z ? 1 : 0) | 2;
        }
        if (z3) {
            i = (i == true ? 1 : 0) | 4;
        }
        return z4 ? i | 8 : i;
    }

    private int getStreamhdLevel(float f, int i, int i2, int i3) {
        if (f <= 0.0f || i <= 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        if (0.0f < f && f <= i) {
            return 0;
        }
        if (i >= f || f > i2) {
            return (((float) i2) >= f || f > ((float) i3)) ? 3 : 2;
        }
        return 1;
    }

    @Override // X.AbstractC1272680jDu
    public JSONObject getStatus() {
        try {
            InterfaceC1273880jFq interfaceC1273880jFq = this.mCallback;
            if (interfaceC1273880jFq != null) {
                interfaceC1273880jFq.LIZ(this.mMask);
            }
            if (this.mStreamHD != null && this.mAlreadyInited) {
                C1283900jW0[] c1283900jW0Arr = {null};
                C1283100jUi.LIZIZ(this.mHandler, new ARunnableS89S0200000_20(this, c1283900jW0Arr, 72));
                if (c1283900jW0Arr[0] != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("last_code", this.mLastCode);
                    jSONObject.put("streamhd_mask", this.mMask);
                    jSONObject.put("alg_type", this.mAlgorithmType);
                    jSONObject.put("pool_size", this.mPoolSize);
                    jSONObject.put("reserved_param", this.mReservedParam);
                    jSONObject.put("algRunflag", c1283900jW0Arr[0].LIZ);
                    jSONObject.put("abStrategy", c1283900jW0Arr[0].LIZIZ);
                    jSONObject.put("strongDenoiseTh", c1283900jW0Arr[0].LIZJ);
                    jSONObject.put("mediumgDenoiseTh", c1283900jW0Arr[0].LIZLLL);
                    jSONObject.put("weakDenoiseTh", c1283900jW0Arr[0].LJ);
                    jSONObject.put("streamhd_running_type", getRunningAlgType(c1283900jW0Arr[0].LIZ));
                    jSONObject.put("noiseVariance", c1283900jW0Arr[0].LJFF);
                    jSONObject.put("brightness", c1283900jW0Arr[0].LJI);
                    jSONObject.put("subAlgListIndex", this.mSubAlgListIndex);
                    C1283900jW0 c1283900jW0 = c1283900jW0Arr[0];
                    jSONObject.put("last_code_denoise_level", getStreamhdLevel(c1283900jW0.LJFF, c1283900jW0.LJ, c1283900jW0.LIZLLL, c1283900jW0.LIZJ));
                    jSONObject.put("streamhd_enable", this.mStreamHDEnable);
                    jSONObject.put("already_inited", this.mAlreadyInited);
                    jSONObject.put("input_texture_id", this.mInTex);
                    jSONObject.put("output_texture_id", this.mOutTex);
                    jSONObject.put("input_texture_width", this.mWidth);
                    jSONObject.put("input_texture_height", this.mHeight);
                    jSONObject.put("input_texture_is_oes", this.mIsOes);
                    jSONObject.put("aesBoostAlgType", this.mAesBoostAlgType);
                    jSONObject.put("denoiseAlgType", this.mDenoiseAlgType);
                    jSONObject.put("sharpAlgType", this.mSharpAlgType);
                    jSONObject.put("noiseDetectAlgType", this.mInitNoiseDetectEnable);
                    jSONObject.put("streamhd_force_aesboost_enable", this.mForceAesboostEnableStatus);
                    jSONObject.put("init_process_mode", this.mInitProcessMode);
                    jSONObject.put("run_process_mode", this.mProcessMode);
                    jSONObject.put("can_skip_node", this.mCanSkipNode);
                    jSONObject.put("color_correction_enable", this.mInitEnableColorCorrection);
                    int i = this.mFrameCnt;
                    this.mFrameCnt = 0;
                    jSONObject.put("frame_cnt", i);
                    return jSONObject;
                }
            }
            return new JSONObject().put("last_code", this.mLastCode).put("streamhd_mask", this.mMask);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractC1272680jDu
    public synchronized void release() {
        if (this.mAlreadyInited) {
            this.mCallback = null;
            ByteStreamHDAPI byteStreamHDAPI = this.mStreamHD;
            if (byteStreamHDAPI != null) {
                byteStreamHDAPI.Free();
                this.mStreamHD = null;
                AVLog.logKibana(4, "BmfVideoStreamHD", "release", null);
            }
            this.mAlreadyInited = false;
        }
    }

    private int calculateProcessMode() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (!this.mStreamHDEnable || this.mCanSkipNode) {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        } else {
            z = this.mInitAesboostEnable;
            z2 = this.mInitDenoiseEnable;
            z3 = this.mInitSharpEnable;
            z4 = this.mInitNoiseDetectEnable;
        }
        int i = this.mForceAesboostEnableStatus;
        if (i == 1) {
            z5 = true;
        } else if (i != 0) {
            z5 = z;
        }
        return calculateProcessMode(z5, z2, z3, z4);
    }

    public void freeStreamHdInGlThread() {
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 131));
        }
    }

    @Override // X.AbstractC1272680jDu
    public JSONObject getBMFColorCorrectionSetting() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bmf get color correction:");
        sbLIZ.append(this.mStreamHD);
        AVLog.logKibana(4, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ), null);
        ByteStreamHDAPI byteStreamHDAPI = this.mStreamHD;
        if (byteStreamHDAPI == null) {
            return null;
        }
        C1283890jVz c1283890jVzGetColorInfo = byteStreamHDAPI.GetColorInfo();
        if (c1283890jVzGetColorInfo == null) {
            AVLog.logKibana(4, "BmfVideoStreamHD", "bmf get color correction GetColorInfo is null", null);
            return null;
        }
        JSONObject jSONObject = this.mInitColorCorrectionSettings;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gamma");
            Objects.requireNonNull(jSONObjectOptJSONObject);
            jSONObjectOptJSONObject.put("value", toFloatWithTwoDecimalPlaces(c1283890jVzGetColorInfo.LIZ).doubleValue());
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("brightness");
            Objects.requireNonNull(jSONObjectOptJSONObject2);
            jSONObjectOptJSONObject2.put("value", toFloatWithTwoDecimalPlaces(c1283890jVzGetColorInfo.LIZIZ).doubleValue());
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("contrast");
            Objects.requireNonNull(jSONObjectOptJSONObject3);
            jSONObjectOptJSONObject3.put("value", toFloatWithTwoDecimalPlaces(c1283890jVzGetColorInfo.LIZJ).doubleValue());
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("saturation");
            Objects.requireNonNull(jSONObjectOptJSONObject4);
            jSONObjectOptJSONObject4.put("value", toFloatWithTwoDecimalPlaces(c1283890jVzGetColorInfo.LIZLLL).doubleValue());
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("hueShift");
            Objects.requireNonNull(jSONObjectOptJSONObject5);
            jSONObjectOptJSONObject5.put("value", toFloatWithTwoDecimalPlaces(c1283890jVzGetColorInfo.LJ).doubleValue());
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("opacity");
            Objects.requireNonNull(jSONObjectOptJSONObject6);
            jSONObjectOptJSONObject6.put("value", toFloatWithTwoDecimalPlaces(c1283890jVzGetColorInfo.LJFF).doubleValue());
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("addColor");
            Objects.requireNonNull(jSONObjectOptJSONObject7);
            jSONObjectOptJSONObject7.put("value", c1283890jVzGetColorInfo.LJI);
            JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("mulColor");
            Objects.requireNonNull(jSONObjectOptJSONObject8);
            jSONObjectOptJSONObject8.put("value", c1283890jVzGetColorInfo.LJII);
            jSONObject2.put("colorCorrectionSetting", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            onError(-3, "BmfVideoStreamHD", "bmf get color correction error. ", e);
        }
        AVLog.logKibana(4, "BmfVideoStreamHD", "bmf get color correction algorithm result:" + jSONObject2, null);
        return jSONObject2;
    }

    public void initStreamHD() {
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 132));
        }
    }

    private String getRunningAlgType(int i) {
        String strLIZIZ = "";
        if ((i & 1) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("AesBoost");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if ((i & 2) != 0) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("#");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("Denoise");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if ((i & 4) != 0) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append("#");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("Sharp");
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        return strLIZIZ;
    }

    private BigDecimal toFloatWithTwoDecimalPlaces(float f) {
        return new BigDecimal(String.valueOf(f)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override // X.AbstractC1272680jDu
    public void canSkipNode(boolean z) {
        this.mCanSkipNode = z;
    }

    @Override // X.AbstractC1272680jDu
    public void setBMFColorCorrectionSetting(JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bmf set color correction jsonObject:");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", mStreamHD:");
        sbLIZ.append(this.mStreamHD);
        AVLog.logKibana(4, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.mStreamHD == null || jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("colorCorrectionSetting");
            if (jSONObjectOptJSONObject == null) {
                AVLog.logKibana(4, "BmfVideoStreamHD", "bmf set color correction colorCorrectionSetting is null", null);
                return;
            }
            float floatParam = parseFloatParam(jSONObjectOptJSONObject, "gamma", 0.0f);
            float floatParam2 = parseFloatParam(jSONObjectOptJSONObject, "brightness", 0.0f);
            float floatParam3 = parseFloatParam(jSONObjectOptJSONObject, "contrast", 0.0f);
            float floatParam4 = parseFloatParam(jSONObjectOptJSONObject, "saturation", 0.0f);
            float floatParam5 = parseFloatParam(jSONObjectOptJSONObject, "hueShift", 0.0f);
            float floatParam6 = parseFloatParam(jSONObjectOptJSONObject, "opacity", 100.0f);
            long longParam = parseLongParam(jSONObjectOptJSONObject, "addColor", 0L);
            long longParam2 = parseLongParam(jSONObjectOptJSONObject, "mulColor", 16777215L);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bmf set color correction ");
            sbLIZ2.append(C786410Ut5.j4("setBMFColorCorrectionSetting params: gamma=%.2f, brightness=%.2f, contrast=%.2f, saturation=%.2f, hueShift=%.2f, opacity=%.2f, addColor=%d, mulColor=%d", new Object[]{Float.valueOf(floatParam), Float.valueOf(floatParam2), Float.valueOf(floatParam3), Float.valueOf(floatParam4), Float.valueOf(floatParam5), Float.valueOf(floatParam6), Long.valueOf(longParam), Long.valueOf(longParam2)}));
            AVLog.logKibana(4, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ2), null);
            this.mStreamHD.SetColorCorrectionParam(floatParam, floatParam2, floatParam3, floatParam4, floatParam5, floatParam6, longParam, longParam2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            onError(-3, "BmfVideoStreamHD", "bmf set color correction error.", e);
        }
    }

    @Override // X.AbstractC1272680jDu
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    private String parseProgramCache(Context context, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("programCache", "");
        if (context != null && strOptString.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
            sbLIZ.append("/");
            sbLIZ.append(strOptString);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                if (c0vsj.exists() && !c0vsj.isDirectory()) {
                    c0vsj.delete();
                }
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
                return strLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }
        return strOptString;
    }

    @Override // X.AbstractC1272680jDu
    public void forceEnable(boolean z, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("force enable:");
        sbLIZ.append(z);
        sbLIZ.append(" runAlgTypes:");
        sbLIZ.append(i);
        AVLog.logKibana(4, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ), null);
        if (i == 1) {
            this.mForceAesboostEnableStatus = z ? 1 : 0;
        }
        if (z) {
            if (!this.mAlreadyInited) {
                initStreamHD();
            }
        } else {
            if (this.mStreamHDEnable) {
                return;
            }
            freeStreamHdInGlThread();
            this.mLastCode = -17;
        }
    }

    @Override // X.AbstractC1272680jDu
    public void setEnable(boolean z, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnable enable:");
        sbLIZ.append(z);
        sbLIZ.append(" mask:");
        sbLIZ.append(i);
        AVLog.logKibana(4, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ), null);
        if (z) {
            if (!this.mStreamHDEnable && !this.mAlreadyInited) {
                initStreamHD();
            }
            this.mMask = 0;
        } else {
            if (i == 4) {
                if (!this.mInitEnableColorCorrection || this.mForceAesboostEnableStatus != 1) {
                    freeStreamHdInGlThread();
                }
                this.mLastCode = -14;
            } else if (i == 16) {
                this.mLastCode = -7;
            }
            this.mMask = i;
        }
        this.mStreamHDEnable = z;
    }

    private float parseFloatParam(JSONObject jSONObject, String str, float f) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
            return (float) jSONObjectOptJSONObject.optDouble("value", f);
        }
        return f;
    }

    private long parseLongParam(JSONObject jSONObject, String str, long j) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
            return jSONObjectOptJSONObject.optLong("value", j);
        }
        return j;
    }

    public BmfVideoStreamHDFilterImpl(Context context, JSONObject jSONObject, InterfaceC1273880jFq interfaceC1273880jFq, Handler handler, EnumC1267980j6K enumC1267980j6K, C1267500j5Y c1267500j5Y) {
        boolean z;
        boolean z2;
        boolean z3;
        this.mTexProcessType = 1;
        this.mBackend = 2;
        this.mPoolSize = 3;
        this.mMaxWidth = 1200;
        this.mMaxHeight = 2000;
        this.mProgramCache = "";
        this.mModeDownloadUrl = "";
        this.mAccessKey = "";
        this.mAesBoostModelNamePrefix = "";
        this.mStreamHDEnable = true;
        this.mInitEnableColorCorrection = c1267500j5Y.LIZ.mPushBase.LJIIJ();
        this.mInitColorCorrectionSettings = c1267500j5Y.LIZ.mPushBase.LJ();
        if (enumC1267980j6K == EnumC1267980j6K.GAME_LIVE) {
            this.mStreamHDEnable = c1267500j5Y.LIZ.mPushBase.LJIILL();
        } else {
            this.mStreamHDEnable = c1267500j5Y.LIZ.mPushBase.LJIL();
        }
        this.mCallback = interfaceC1273880jFq;
        this.mHandler = handler;
        this.mBuildPipelineScene = enumC1267980j6K;
        if (jSONObject == null) {
            onError(-1, "BmfVideoStreamHD", "init params is null", null);
            return;
        }
        try {
            this.mMaxWidth = jSONObject.optInt("maxWidth", 1200);
            this.mMaxHeight = jSONObject.optInt("maxHeight", 2000);
            this.mProgramCache = parseProgramCache(context, jSONObject);
            this.mModeDownloadUrl = jSONObject.optString("modeDownloadUrl", "https://api.tiktokv.com");
            this.mAccessKey = jSONObject.optString("accessKey", "");
            this.mReservedParam = jSONObject.optInt("reservedParam", 1);
            this.mAlgorithmType = jSONObject.optInt("algorithmType", 0);
            this.mTexProcessType = jSONObject.optInt("texProcessType", 1);
            this.mSubAlgListIndex = jSONObject.optInt("subAlgListIndex", 0);
            this.mBackend = jSONObject.optInt("backend", 2);
            this.mPoolSize = jSONObject.optInt("poolSize", 3);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("aesBoostParams");
            if (jSONObjectOptJSONObject != null) {
                this.mAesBoostAlgType = jSONObjectOptJSONObject.optInt("aesBoostAlgType", 0);
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("groupIds");
                this.mAesBoostGroupIds = new int[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.mAesBoostGroupIds[i] = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray, i);
                }
                this.mAesBoostModelNamePrefix = jSONObjectOptJSONObject.optString("modelNamePrefix", "");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("denoiseParams");
            if (jSONObjectOptJSONObject2 != null) {
                this.mDenoiseAlgType = jSONObjectOptJSONObject2.optInt("denoiseAlgType", 0);
                this.mDenoiseAbStrategy = jSONObjectOptJSONObject2.optInt("abStrategyV2", 1);
                this.mDenoiseWindowType = jSONObjectOptJSONObject2.optInt("windowType", 1);
            }
            C1283870jVx c1283870jVx = new C1283870jVx();
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("noiseDetectParams");
            if (jSONObjectOptJSONObject3 != null) {
                c1283870jVx.LIZ = jSONObjectOptJSONObject3.optInt("noise_detect_alg_type", 1);
                c1283870jVx.LIZIZ = jSONObjectOptJSONObject3.optInt("noise_detect_time_step", LSPassThroughRecordSizeConfig.DEFAULT);
                c1283870jVx.LIZJ = jSONObjectOptJSONObject3.optInt("noise_detect_grad_threshold", 40);
                c1283870jVx.LIZLLL = jSONObjectOptJSONObject3.optInt("noise_detect_lumi_threshold_low", 10);
                c1283870jVx.LJ = jSONObjectOptJSONObject3.optInt("noise_detect_lumi_threshold_high", 150);
                c1283870jVx.LJFF = (float) jSONObjectOptJSONObject3.optDouble("noise_detect_discard_rate", 0.949999988079071d);
                c1283870jVx.LJI = jSONObjectOptJSONObject3.optInt("denoise_strong_th", 9999);
                c1283870jVx.LJII = jSONObjectOptJSONObject3.optInt("denoise_medium_th", 5);
                c1283870jVx.LJIIIIZZ = jSONObjectOptJSONObject3.optInt("denoise_weak_th", 2);
                c1283870jVx.LJIIIZ = jSONObjectOptJSONObject3.optInt("noise_detect_lumi_step", 20);
                c1283870jVx.LJIIJ = jSONObjectOptJSONObject3.optInt("noise_detect_lumi_threshold", 20);
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("sharpParams");
            if (jSONObjectOptJSONObject4 != null) {
                this.mSharpAlgType = jSONObjectOptJSONObject4.optInt("sharpAlgType", 0);
                this.mSharpStrength = (float) jSONObjectOptJSONObject4.optDouble("sharpStrength", 0.0d);
                this.mSharpThresholdLow = (float) jSONObjectOptJSONObject4.optDouble("sharpThresholdLow", 0.0d);
                this.mSharpThresholdHigh = (float) jSONObjectOptJSONObject4.optDouble("sharpThreadholdHigh", 0.0d);
            }
            try {
                Object objNewInstance = Class.forName("com.bytedance.bmf_mods.ByteStreamHD").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof ByteStreamHDAPI) {
                    ByteStreamHDAPI byteStreamHDAPI = (ByteStreamHDAPI) objNewInstance;
                    this.mStreamHD = byteStreamHDAPI;
                    if (byteStreamHDAPI == null) {
                        onError(-15, "BmfVideoStreamHD", "instance is null", null);
                        return;
                    }
                    if (this.mAesBoostAlgType > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mInitAesboostEnable = z;
                    if (this.mDenoiseAlgType > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.mInitDenoiseEnable = z2;
                    if (this.mSharpAlgType > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.mInitSharpEnable = z3;
                    boolean z4 = c1283870jVx.LIZ > 0;
                    this.mInitNoiseDetectEnable = z4;
                    this.mInitProcessMode = calculateProcessMode(z, z2, z3, z4);
                    C1283830jVt c1283830jVt = new C1283830jVt();
                    c1283830jVt.LIZIZ(this.mModeDownloadUrl, this.mAccessKey);
                    int i2 = this.mAesBoostAlgType;
                    int[] iArr = this.mAesBoostGroupIds;
                    String str = this.mAesBoostModelNamePrefix;
                    String str2 = this.mProgramCache;
                    c1283830jVt.LJ = i2;
                    c1283830jVt.LIZLLL = iArr;
                    c1283830jVt.LIZIZ = str;
                    c1283830jVt.LIZJ = str2;
                    int i3 = this.mDenoiseAlgType;
                    int i4 = this.mDenoiseAbStrategy;
                    c1283830jVt.LJFF = i3;
                    c1283830jVt.LJI = i4;
                    c1283830jVt.LJIIIIZZ = 0;
                    c1283830jVt.LJIIIZ = 0;
                    c1283830jVt.LJII = 0;
                    int i5 = this.mSharpAlgType;
                    float f = this.mSharpStrength;
                    float f2 = this.mSharpThresholdLow;
                    float f3 = this.mSharpThresholdHigh;
                    c1283830jVt.LJIIJ = i5;
                    c1283830jVt.LJIIJJI = f;
                    c1283830jVt.LJIIL = f2;
                    c1283830jVt.LJIILIIL = f3;
                    c1283830jVt.LJJIFFI = this.mInitProcessMode;
                    c1283830jVt.LJJII = this.mTexProcessType;
                    c1283830jVt.LIZJ(c1283870jVx);
                    this.mStreamHDconfig = c1283830jVt.LIZ();
                    this.mStreamHD.SetDownloadCallback(new ByteStreamHDCallbackAPI() { // from class: X.0jTN
                        @Override // X.InterfaceC1865060ydM
                        public final void callback(int i6) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ByteStreamHDCallback callback status:");
                            sbLIZ.append(i6);
                            AVLog.logKibana(4, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ), null);
                            if (i6 == 1) {
                                this.LIZ.initStreamHD();
                                return;
                            }
                            BmfVideoStreamHDFilterImpl bmfVideoStreamHDFilterImpl = this.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("ByteStreamHDCallback model download fail status:");
                            sbLIZ2.append(i6);
                            bmfVideoStreamHDFilterImpl.onError(-13, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ2), null);
                            this.LIZ.release();
                            this.LIZ.mLastCode = r2.mDownloadStatus - 100000;
                        }
                    });
                    this.mStreamHD.DownloadModel(context, this.mStreamHDconfig);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mStreamHD: ");
                    sbLIZ.append(this.mStreamHD);
                    sbLIZ.append(" mStreamHDconfig:");
                    sbLIZ.append(this.mStreamHDconfig);
                    AVLog.logKibana(4, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ), null);
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("instance type error: ");
                sbLIZ2.append(objNewInstance);
                onError(-15, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ2), null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("create instance failed: ");
                sbLIZ3.append(jSONObject);
                onError(-16, "BmfVideoStreamHD", C2188811AlT.LIZIZ(sbLIZ3), th);
                release();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            onError(-2, "BmfVideoStreamHD", "reflect error. ", e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:20|(13:22|(0)|29|(1:31)(1:33)|32|66|34|(1:37)(1:40)|41|(1:43)(1:44)|(3:46|(1:48)(3:(1:(3:58|50|(1:54)))|59|60)|55)(1:61)|64|65)(1:28)|24|(2:26|27)|29|(0)(0)|32|66|34|(6:36|38|37|41|(0)(0)|(0)(0))(0)|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        if (r3 == r20[0]) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        onError(-2, "BmfVideoStreamHD", "process error. ", r3);
        r14.mLastCode = -5;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:34:0x0046, B:38:0x0052, B:40:0x0055, B:41:0x0057, B:43:0x0072, B:46:0x0089, B:48:0x0091, B:50:0x0095, B:52:0x0098, B:54:0x009c, B:55:0x009e, B:59:0x00a8, B:61:0x00af, B:44:0x0080), top: B:66:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:34:0x0046, B:38:0x0052, B:40:0x0055, B:41:0x0057, B:43:0x0072, B:46:0x0089, B:48:0x0091, B:50:0x0095, B:52:0x0098, B:54:0x009c, B:55:0x009e, B:59:0x00a8, B:61:0x00af, B:44:0x0080), top: B:66:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:34:0x0046, B:38:0x0052, B:40:0x0055, B:41:0x0057, B:43:0x0072, B:46:0x0089, B:48:0x0091, B:50:0x0095, B:52:0x0098, B:54:0x009c, B:55:0x009e, B:59:0x00a8, B:61:0x00af, B:44:0x0080), top: B:66:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b4, blocks: (B:34:0x0046, B:38:0x0052, B:40:0x0055, B:41:0x0057, B:43:0x0072, B:46:0x0089, B:48:0x0091, B:50:0x0095, B:52:0x0098, B:54:0x009c, B:55:0x009e, B:59:0x00a8, B:61:0x00af, B:44:0x0080), top: B:66:0x0046 }] */
    @Override // X.AbstractC1272680jDu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int process(int r15, boolean r16, int r17, int r18, float[] r19, int[] r20) {
        /*
            r14 = this;
            boolean r0 = r14.mInitEnableColorCorrection
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = r14.mStreamHDEnable
            if (r0 == 0) goto Ld
            boolean r0 = r14.mCanSkipNode
            if (r0 == 0) goto L1b
        Ld:
            int r0 = r14.mForceAesboostEnableStatus
            if (r0 == r1) goto L1b
            int r0 = r14.mLastCode
            return r0
        L14:
            boolean r0 = r14.mStreamHDEnable
            if (r0 != 0) goto L1b
            int r0 = r14.mLastCode
            return r0
        L1b:
            boolean r0 = r14.mAlreadyInited
            if (r0 != 0) goto L22
            int r0 = r14.mLastCode
            return r0
        L22:
            X.0jFq r0 = r14.mCallback
            r2 = -2
            if (r0 == 0) goto L39
            int r3 = r0.LJLJJLL()
            if (r3 >= 0) goto L3b
        L2d:
            X.0j6K r1 = r14.mBuildPipelineScene
            X.0j6K r0 = X.EnumC1267980j6K.GAME_LIVE
            if (r1 == r0) goto L3b
            r0 = -4
            r14.mLastCode = r0
            int r0 = r14.mLastCode
            return r0
        L39:
            r3 = -2
            goto L2d
        L3b:
            int r0 = r14.mCameraFacing
            r9 = 0
            if (r3 == r0) goto L44
            r10 = 1
        L41:
            r14.mCameraFacing = r3
            goto L46
        L44:
            r10 = 0
            goto L41
        L46:
            com.ss.ttlivestreamer.core.utils.TimeUtils.nativeNanoTime()     // Catch: java.lang.Exception -> Lb4
            r1 = r20
            if (r1 == 0) goto L4f
            goto L52
        L4f:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L57
        L52:
            int r0 = r1.length     // Catch: java.lang.Exception -> Lb4
            if (r0 <= 0) goto L4f
            r11 = r1[r9]     // Catch: java.lang.Exception -> Lb4
        L57:
            r4 = r15
            r14.mInTex = r4     // Catch: java.lang.Exception -> Lb4
            r6 = r17
            r14.mWidth = r6     // Catch: java.lang.Exception -> Lb4
            r7 = r18
            r14.mHeight = r7     // Catch: java.lang.Exception -> Lb4
            r5 = r16
            r14.mIsOes = r5     // Catch: java.lang.Exception -> Lb4
            int r0 = r14.mFrameCnt     // Catch: java.lang.Exception -> Lb4
            int r0 = r0 + 1
            r14.mFrameCnt = r0     // Catch: java.lang.Exception -> Lb4
            boolean r0 = r14.mInitEnableColorCorrection     // Catch: java.lang.Exception -> Lb4
            r8 = r19
            if (r0 == 0) goto L80
            int r13 = r14.calculateProcessMode()     // Catch: java.lang.Exception -> Lb4
            r14.mProcessMode = r13     // Catch: java.lang.Exception -> Lb4
            com.bytedance.bmf_mods_api.ByteStreamHDAPI r3 = r14.mStreamHD     // Catch: java.lang.Exception -> Lb4
            r12 = 3
            int r0 = r3.ProcessTextureWithProcessMode(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lb4
            goto L87
        L80:
            com.bytedance.bmf_mods_api.ByteStreamHDAPI r3 = r14.mStreamHD     // Catch: java.lang.Exception -> Lb4
            r12 = 3
            int r0 = r3.ProcessTexture(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lb4
        L87:
            if (r0 != 0) goto Laf
            com.bytedance.bmf_mods_api.ByteStreamHDAPI r0 = r14.mStreamHD     // Catch: java.lang.Exception -> Lb4
            int r3 = r0.GetResult()     // Catch: java.lang.Exception -> Lb4
            if (r11 <= 0) goto La3
            r0 = r1[r9]     // Catch: java.lang.Exception -> Lb4
            if (r3 != r0) goto La8
        L95:
            int r0 = r1.length     // Catch: java.lang.Exception -> Lb4
            if (r0 <= 0) goto L9e
            r0 = r1[r9]     // Catch: java.lang.Exception -> Lb4
            if (r0 > 0) goto L9e
            r1[r9] = r3     // Catch: java.lang.Exception -> Lb4
        L9e:
            r14.mOutTex = r3     // Catch: java.lang.Exception -> Lb4
            r14.mLastCode = r9     // Catch: java.lang.Exception -> Lb4
            goto Lc2
        La3:
            if (r3 <= 0) goto La8
            if (r1 == 0) goto L9e
            goto L95
        La8:
            r0 = -12
            r14.mLastCode = r0     // Catch: java.lang.Exception -> Lb4
            int r0 = r14.mLastCode     // Catch: java.lang.Exception -> Lb4
            return r0
        Laf:
            int r0 = r0 + (-1000)
            r14.mLastCode = r0     // Catch: java.lang.Exception -> Lb4
            goto Lc2
        Lb4:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.lang.String r1 = "BmfVideoStreamHD"
            java.lang.String r0 = "process error. "
            r14.onError(r2, r1, r0, r3)
            r0 = -5
            r14.mLastCode = r0
        Lc2:
            int r0 = r14.mLastCode
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoStreamHDFilterImpl.process(int, boolean, int, int, float[], int[]):int");
    }
}
