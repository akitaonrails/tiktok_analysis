package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.AbstractC1272690jDv;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1283880jVy;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.os.Handler;
import com.bytedance.bmf_mods_api.DenoiseAPI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BmfVideoDenoiseFilterImpl extends AbstractC1272690jDv {
    public static final String TAG = "BmfVideoDenoiseFilterImpl";
    public int mAbStrategy;
    public int mAlgorithmType;
    public boolean mAlreadyInited;
    public int mBackend;
    public float mBitrateRatioGE1080p;
    public float mBitrateRatioLT1080p;
    public InterfaceC1283880jVy mCallback;
    public DenoiseAPI mDenoise;
    public boolean mEnableDenoiseOpt;
    public Handler mHandler;
    public boolean mInplaceProcess2D;
    public int mMaxHeight;
    public int mMaxWidth;
    public int mMediumISO;
    public int mPoolSize;
    public String mProgramCache;
    public int mReservedParam;
    public int mStrongISO;
    public boolean mUseFp16;
    public int mWeakISO;
    public int mWindowType;
    public float mCurrentBitrateRatio = -1.0f;
    public int[] mStreamSize = {0, 0};
    public final int[] mCalcISOBundle = new int[4];
    public int mCameraFacing = -1;
    public int mISO = -1;

    private int last_code_denoise_level(int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            return -1;
        }
        if (i <= i2) {
            return 0;
        }
        if (i2 >= i || i > i3) {
            return (i3 >= i || i > i4) ? 3 : 2;
        }
        return 1;
    }

    @Override // X.AbstractC1272690jDv
    public synchronized void release() {
        this.mCallback = null;
        if (this.mAlreadyInited) {
            DenoiseAPI denoiseAPI = this.mDenoise;
            if (denoiseAPI != null) {
                denoiseAPI.Free();
                this.mDenoise = null;
            }
            this.mAlreadyInited = false;
        }
    }

    public void freeStreamHdInGlThread() {
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 130));
        }
    }

    @Override // X.AbstractC1272690jDv
    public JSONObject getStatus() {
        int i;
        try {
            InterfaceC1283880jVy interfaceC1283880jVy = this.mCallback;
            if (interfaceC1283880jVy != null) {
                interfaceC1283880jVy.LJLJLJ(this.mMask);
                if (this.mEnableDenoiseOpt) {
                    int iCalcISONew = calcISONew(false);
                    this.mISO = iCalcISONew;
                    if (iCalcISONew <= this.mWeakISO) {
                        this.mLastCode = -9;
                        if (this.mAlreadyInited) {
                            setEnable(false, 32);
                        }
                    } else if (!this.mAlreadyInited) {
                        setEnable(true, 32);
                    }
                }
            }
            if (this.mDenoise == null) {
                if (this.mLastCode == 0) {
                    return null;
                }
                return new JSONObject().put("last_code", this.mLastCode);
            }
            if (this.mLastCode == 0 && ((i = this.mMask) == 0 || i == 1)) {
                int[] iArrGetReport = this.mDenoise.GetReport();
                int i2 = this.mLastCode;
                if (iArrGetReport == null || iArrGetReport.length < 9) {
                    return null;
                }
                int i3 = iArrGetReport[0];
                if (i3 == 0) {
                    enable(false, 1);
                    i2 = -6;
                } else {
                    enable(true, 1);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("last_code", i2);
                jSONObject.put("denoise_mask", this.mMask);
                jSONObject.put("state", i3);
                jSONObject.put("ab_strategy", iArrGetReport[1]);
                jSONObject.put("strong_iso", iArrGetReport[2]);
                jSONObject.put("medium_iso", iArrGetReport[3]);
                jSONObject.put("weak_iso", iArrGetReport[4]);
                jSONObject.put("blend_weight", iArrGetReport[5]);
                jSONObject.put("iso_value", iArrGetReport[6]);
                jSONObject.put("last_code_denoise_level", last_code_denoise_level(iArrGetReport[6], iArrGetReport[4], iArrGetReport[3], iArrGetReport[2]));
                jSONObject.put("avg_cost_time", iArrGetReport[8]);
                jSONObject.put("bitrate_ratio", this.mCurrentBitrateRatio);
                jSONObject.put("alg_type", this.mAlgorithmType);
                jSONObject.put("backend", this.mBackend);
                jSONObject.put("pool_size", this.mPoolSize);
                jSONObject.put("reserved_param", this.mReservedParam);
                InterfaceC1283880jVy interfaceC1283880jVy2 = this.mCallback;
                jSONObject.put("camera_iso", interfaceC1283880jVy2 != null ? interfaceC1283880jVy2.LJLJL() : -2);
                return jSONObject;
            }
            JSONObject jSONObjectPut = new JSONObject().put("last_code", this.mLastCode).put("denoise_mask", this.mMask).put("iso_value", this.mISO).put("weak_iso", this.mWeakISO).put("medium_iso", this.mMediumISO).put("strong_iso", this.mStrongISO).put("alg_type", this.mAlgorithmType).put("backend", this.mBackend).put("pool_size", this.mPoolSize);
            InterfaceC1283880jVy interfaceC1283880jVy3 = this.mCallback;
            return jSONObjectPut.put("camera_iso", interfaceC1283880jVy3 != null ? interfaceC1283880jVy3.LJLJL() : -2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public void initDenoise() {
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 129));
        }
    }

    @Override // X.AbstractC1272690jDv
    public boolean isInplaceProcess2D() {
        return this.mInplaceProcess2D;
    }

    private int calcISO(boolean z) {
        int i;
        int iLJLJL;
        if (z) {
            Arrays.fill(this.mCalcISOBundle, 0);
        }
        int[] iArr = this.mCalcISOBundle;
        int i2 = iArr[0];
        if (i2 <= 0) {
            i = 1;
        } else {
            i = 100;
        }
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = i3 + 1;
        iArr[1] = i6;
        if (i6 >= i) {
            iArr[1] = 0;
            InterfaceC1283880jVy interfaceC1283880jVy = this.mCallback;
            if (interfaceC1283880jVy != null) {
                iLJLJL = interfaceC1283880jVy.LJLJL();
                if (iLJLJL > 0) {
                    int[] iArr2 = this.mCalcISOBundle;
                    int i7 = i4 + 1;
                    iArr2[2] = i7;
                    int i8 = i5 + iLJLJL;
                    iArr2[3] = i8;
                    if (i7 >= 15) {
                        i2 = i8 / i7;
                        iArr2[0] = i2;
                        iArr2[2] = 0;
                        iArr2[3] = 0;
                    }
                }
            } else {
                iLJLJL = -2;
            }
            this.mCalcISOBundle[0] = iLJLJL;
            return iLJLJL;
        }
        if (i2 == 0) {
            return 75;
        }
        return i2;
    }

    private int calcISONew(boolean z) {
        int iLJLJL;
        if (z) {
            Arrays.fill(this.mCalcISOBundle, 0);
        }
        int[] iArr = this.mCalcISOBundle;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        InterfaceC1283880jVy interfaceC1283880jVy = this.mCallback;
        if (interfaceC1283880jVy != null) {
            iLJLJL = interfaceC1283880jVy.LJLJL();
            if (iLJLJL > 0) {
                int[] iArr2 = this.mCalcISOBundle;
                int i4 = i2 + 1;
                iArr2[1] = i4;
                int i5 = i3 + iLJLJL;
                iArr2[2] = i5;
                if (i4 >= 12) {
                    int i6 = i5 / i4;
                    iArr2[0] = i6;
                    iArr2[1] = 0;
                    iArr2[2] = 0;
                    return i6;
                }
                return i;
            }
        } else {
            iLJLJL = -2;
        }
        this.mCalcISOBundle[0] = iLJLJL;
        return iLJLJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void notifyBitrateRatioChange(boolean r8) {
        /*
            r7 = this;
            X.0jVy r3 = r7.mCallback
            if (r3 != 0) goto L5
            return
        L5:
            int[] r6 = r3.LJLJLLL()
            r5 = 1
            r4 = 0
            if (r6 == 0) goto L27
            int r1 = r6.length
            r0 = 2
            if (r1 < r0) goto L27
            r1 = r6[r4]
            int[] r2 = r7.mStreamSize
            r0 = r2[r4]
            if (r1 != r0) goto L1f
            r1 = r6[r5]
            r0 = r2[r5]
            if (r1 == r0) goto L27
        L1f:
            r7.mStreamSize = r6
            r0 = 1
        L22:
            if (r8 != 0) goto L29
            if (r0 != 0) goto L29
            return
        L27:
            r0 = 0
            goto L22
        L29:
            boolean r0 = r7.enable()
            if (r0 == 0) goto L4a
            int[] r2 = r7.mStreamSize
            r0 = r2[r4]
            r1 = 1080(0x438, float:1.513E-42)
            if (r0 < r1) goto L45
            r0 = r2[r5]
            if (r0 < r1) goto L45
            float r0 = r7.mBitrateRatioGE1080p
            r7.mCurrentBitrateRatio = r0
        L3f:
            float r0 = r7.mCurrentBitrateRatio
            r3.LJLL(r0)
            return
        L45:
            float r0 = r7.mBitrateRatioLT1080p
            r7.mCurrentBitrateRatio = r0
            goto L3f
        L4a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.mCurrentBitrateRatio = r0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilterImpl.notifyBitrateRatioChange(boolean):void");
    }

    @Override // X.AbstractC1272690jDv
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    @Override // X.AbstractC1272690jDv
    public void updateParams(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        boolean z;
        boolean z2 = false;
        if (!jSONObject.isNull("enable")) {
            boolean zEnable = enable();
            if ((this.mMask & 8) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (jSONObject.optBoolean("enable", z)) {
                this.mMask &= -9;
            } else {
                this.mMask |= 8;
            }
            if (zEnable != enable()) {
                z2 = true;
            }
        }
        if (!jSONObject.isNull("bitrateRatios") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("bitrateRatios")) != null) {
            this.mBitrateRatioGE1080p = (float) jSONObjectOptJSONObject.optDouble("ge1080p", this.mBitrateRatioGE1080p);
            this.mBitrateRatioLT1080p = (float) jSONObjectOptJSONObject.optDouble("lt1080p", this.mBitrateRatioLT1080p);
        } else if (!z2) {
            return;
        }
        notifyBitrateRatioChange(true);
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

    @Override // X.AbstractC1272690jDv
    public void enable(boolean z, int i) {
        boolean z2;
        int i2 = this.mMask;
        boolean zEnable = enable();
        super.enable(z, i);
        if (i2 != i || zEnable != enable()) {
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("video denoise mask changed from ");
            sbLIZ.append(i2);
            sbLIZ.append(" to ");
            sbLIZ.append(this.mMask);
            AVLog.iow(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (zEnable != enable()) {
            z2 = true;
        } else {
            z2 = false;
        }
        notifyBitrateRatioChange(z2);
        if (!z && i == 16) {
            this.mLastCode = -7;
        }
    }

    @Override // X.AbstractC1272690jDv
    public void setEnable(boolean z, int i) {
        if (!z) {
            this.mMask |= i;
        } else {
            int i2 = this.mMask & (~i);
            this.mMask = i2;
            if (i == 16 || i == 4) {
                this.mMask = i2 & (-5);
            }
            if (this.mMask == 0) {
                if (this.mAlreadyInited) {
                    return;
                }
                initDenoise();
                return;
            }
        }
        if (this.mAlreadyInited) {
            freeStreamHdInGlThread();
        }
        if (!z) {
            if (i == 16) {
                this.mLastCode = -7;
            } else if (i == 32) {
                this.mLastCode = -9;
            } else {
                if (i != 4) {
                    return;
                }
                this.mLastCode = -14;
            }
        }
    }

    public BmfVideoDenoiseFilterImpl(Context context, JSONObject jSONObject, InterfaceC1283880jVy interfaceC1283880jVy) {
        boolean z;
        int iInit;
        this.mBitrateRatioGE1080p = -1.0f;
        this.mBitrateRatioLT1080p = -1.0f;
        this.mBackend = 2;
        this.mPoolSize = 3;
        this.mInplaceProcess2D = true;
        this.mProgramCache = "";
        if (jSONObject == null) {
            onError(-1, TAG, "init params is null", null);
            return;
        }
        int iOptInt = jSONObject.optInt("maxWidth", 1200);
        int iOptInt2 = jSONObject.optInt("maxHeight", 2000);
        int iOptInt3 = jSONObject.optInt("abStrategyV2", 0);
        if (iOptInt > 0 && iOptInt2 > 0 && iOptInt3 > 0) {
            this.mInplaceProcess2D = jSONObject.optBoolean("inplaceProcess2D", true);
            if (!jSONObject.isNull("algorithmType")) {
                this.mAlgorithmType = jSONObject.optInt("algorithmType", 0);
                this.mBackend = jSONObject.optInt("backend", 2);
                this.mPoolSize = jSONObject.optInt("poolSize", 3);
                this.mReservedParam = jSONObject.optInt("reservedParam", !this.mInplaceProcess2D ? 1 : 0);
                z = true;
            } else {
                z = false;
            }
            int iOptInt4 = jSONObject.optInt("windowType", 1);
            boolean zOptBoolean = jSONObject.optBoolean("useFp16", true);
            int iOptInt5 = jSONObject.optInt("weakISO", 75);
            int iOptInt6 = jSONObject.optInt("mediumISO", 800);
            int iOptInt7 = jSONObject.optInt("strongISO", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            this.mWeakISO = iOptInt5;
            this.mMediumISO = iOptInt6;
            this.mStrongISO = iOptInt7;
            String programCache = parseProgramCache(context, jSONObject);
            this.mWindowType = iOptInt4;
            this.mUseFp16 = zOptBoolean;
            this.mMaxWidth = iOptInt;
            this.mMaxHeight = iOptInt2;
            this.mAbStrategy = iOptInt3;
            this.mProgramCache = programCache;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bitrateRatios");
            if (jSONObjectOptJSONObject != null) {
                this.mBitrateRatioGE1080p = (float) jSONObjectOptJSONObject.optDouble("ge1080p", -1.0d);
                this.mBitrateRatioLT1080p = (float) jSONObjectOptJSONObject.optDouble("lt1080p", -1.0d);
            }
            this.mEnableDenoiseOpt = jSONObject.optBoolean("enableDenoiseOpt", false);
            try {
                try {
                    Object objNewInstance = Class.forName("com.bytedance.bmf_mods.Denoise").getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (objNewInstance instanceof DenoiseAPI) {
                        DenoiseAPI denoiseAPI = (DenoiseAPI) objNewInstance;
                        this.mDenoise = denoiseAPI;
                        if (!this.mEnableDenoiseOpt) {
                            if (!z) {
                                iInit = denoiseAPI.Init(iOptInt, iOptInt2, iOptInt4, zOptBoolean, programCache, iOptInt3, iOptInt7, iOptInt6, iOptInt5);
                            } else {
                                iInit = denoiseAPI.Init(this.mAlgorithmType, this.mBackend, this.mPoolSize, iOptInt, iOptInt2, iOptInt4, zOptBoolean, programCache, iOptInt3, iOptInt7, iOptInt6, iOptInt5, this.mReservedParam);
                            }
                            if (iInit != 0) {
                                String str = TAG;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Denoise.Init returns ");
                                sbLIZ.append(iInit);
                                onError(-13, str, C2188811AlT.LIZIZ(sbLIZ), null);
                                release();
                                return;
                            }
                            this.mLastCode = 0;
                            AVLog.iow(TAG, "Denoise.Init success.");
                        }
                        this.mCallback = interfaceC1283880jVy;
                        super.mCallback = interfaceC1283880jVy;
                        return;
                    }
                    String str2 = TAG;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("instance type error: ");
                    sbLIZ2.append(objNewInstance);
                    onError(-15, str2, C2188811AlT.LIZIZ(sbLIZ2), null);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    String str3 = TAG;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("create instance failed: ");
                    sbLIZ3.append(jSONObject);
                    onError(-16, str3, C2188811AlT.LIZIZ(sbLIZ3), th);
                    release();
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                onError(-2, TAG, "reflect error. ", e);
                return;
            }
        }
        String str4 = TAG;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Params for color hist are illegal: ");
        sbLIZ4.append(jSONObject);
        onError(-1, str4, C2188811AlT.LIZIZ(sbLIZ4), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0163, code lost:
    
        if (r4 == r25[0]) goto L77;
     */
    @Override // X.AbstractC1272690jDv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int process(int r20, boolean r21, int r22, int r23, float[] r24, int[] r25) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilterImpl.process(int, boolean, int, int, float[], int[]):int");
    }
}
