package com.tts.oecverify;

import X.AbstractC202199149t;
import X.C145R;
import X.C149J;
import X.C149K;
import X.C149L;
import X.C149V;
import X.C149Y;
import X.C14A1;
import X.C14A2;
import X.C14A3;
import X.C14A5;
import X.C14A6;
import X.C14AA;
import X.C14AC;
import X.C14AY;
import X.C202169148p;
import X.C202170148q;
import X.C202185149f;
import X.C202191149l;
import X.C202197149r;
import X.C2188811AlT;
import X.InterfaceC2178208g8;
import Y.ARunnableS4S1300000_3;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.verify.LoginVerifyService;
import com.tts.oecverify.verify.RiskControlService;
import com.tts.oecverify.verify.TwiceVerifyService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class BdTuring {
    public static final C14A1 LJFF = new C14A3() { // from class: X.14A1
        @Override // X.C14A3
        public final void LIZIZ(String str, int i, long j, String str2, String str3, int i2, String str4) {
        }

        @Override // X.C14A3
        public final void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
            C202191149l.LJIIJ(i, i2, i3, i4, str, str2, str3, str4);
        }
    };
    public static final int TYPE_ECAF = 9;
    public static final int TYPE_EMAIL = 11;
    public static final int TYPE_IDENTIFY = 4;
    public static final int TYPE_PASSWORD = 8;
    public static final int TYPE_QA = 3;
    public static final int TYPE_SMARTER = 5;
    public static final int TYPE_SMS_VOICE = 13;
    public BdTuringConfig LIZ;
    public boolean LIZIZ;
    public RiskControlService LIZJ;
    public final HashMap<String, C14A2> LIZLLL = new HashMap<>();
    public long LJ = 0;

    public void dismissVerifyDialog() {
        if (this.LIZIZ) {
            this.LIZJ.dismissVerifyDialog();
        }
    }

    public static BdTuring getInstance() {
        return C14A5.LIZ;
    }

    public BdTuringConfig getConfig() {
        return this.LIZ;
    }

    public boolean isInitDone() {
        return this.LIZIZ;
    }

    public static void LIZ(BdTuringConfig bdTuringConfig) {
        if (bdTuringConfig == null) {
            C202191149l.LJIILIIL(C149Y.SDK_INIT_CHECK_CONFIG_ERROR.getCode(), "config is null");
            return;
        }
        if (bdTuringConfig.getApplicationContext() == null) {
            C202191149l.LJIILIIL(C149Y.SDK_INIT_CHECK_CONFIG_ERROR.getCode(), "BdTuring context is null");
            return;
        }
        if (bdTuringConfig.getHttpClient() == null) {
            try {
                bdTuringConfig.setHttpClient((InterfaceC2178208g8) Class.forName("com.tts.oecverify.ttnet.TTNetHttpClient").getConstructor(Context.class).newInstance(bdTuringConfig.getApplicationContext()));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C202191149l.LJIILIIL(C149Y.SDK_INIT_CHECK_CONFIG_ERROR.getCode(), "setHttpClient failed");
            }
        }
        if (bdTuringConfig.getHttpClient() != null && bdTuringConfig.getEventClient() != null) {
            return;
        }
        C202191149l.LJIILIIL(C149Y.SDK_INIT_CHECK_CONFIG_ERROR.getCode(), "getHttpClient failed");
    }

    public final synchronized void LIZJ(BdTuringConfig bdTuringConfig) {
        if (bdTuringConfig == null) {
            return;
        }
        C202191149l.LIZLLL(bdTuringConfig.getSamplingRate());
    }

    public void addService(C14A2 c14a2) {
        if (this.LIZLLL.containsKey(c14a2.getClass().getName())) {
            return;
        }
        this.LIZLLL.put(c14a2.getClass().getName(), c14a2);
    }

    public synchronized BdTuring init(final BdTuringConfig bdTuringConfig) {
        if (this.LIZIZ) {
            return this;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = bdTuringConfig;
        LIZJ(bdTuringConfig);
        LIZ(bdTuringConfig);
        VerifyTaskHandler verifyTaskHandler = C145R.LIZ;
        verifyTaskHandler.LIZIZ();
        verifyTaskHandler.LIZ(new Runnable() { // from class: X.149d
            public final void LIZ() {
                Context applicationContext = bdTuringConfig.getApplicationContext();
                if (applicationContext == null) {
                    C202191149l.LJIILIIL(C149Y.SDK_INIT_CHECK_CONFIG_ERROR.getCode(), "SettingsManager context is null");
                    return;
                }
                int tTNetStatus = BdTuring.getInstance().getConfig().getTTNetStatus();
                C202185149f c202185149f = C202185149f.LIZ;
                C202190149k c202190149k = new C202190149k();
                synchronized (c202185149f) {
                    try {
                        if (!C202185149f.LJIIIZ) {
                            C202185149f.LJ = c202190149k;
                            InterfaceC202184149e interfaceC202184149e = C202185149f.LJ;
                            if (interfaceC202184149e == null) {
                                interfaceC202184149e = null;
                            }
                            ((C202190149k) interfaceC202184149e).getClass();
                            C202185149f.LIZLLL = new BPEAHandler(C786410Ut5.W2(C145R.LIZ.LIZ));
                            C20188713z3 c20188713z3 = C20188713z3.LIZ;
                            c20188713z3.LIZ(applicationContext);
                            String strLIZJ = c20188713z3.LIZJ("spark_def");
                            if (strLIZJ == null || !strLIZJ.equals("1")) {
                                c20188713z3.LIZIZ("spark_def", "1");
                            } else {
                                String strLIZJ2 = c20188713z3.LIZJ("settings");
                                if (strLIZJ2 != null) {
                                    C202185149f.LJIIJJI(strLIZJ2);
                                }
                            }
                            InterfaceC202184149e interfaceC202184149e2 = C202185149f.LJ;
                            C202155148b.LIZ(C202190149k.LIZ());
                            if (C202185149f.LJII("common").optInt("skip_launch", 0) == 1) {
                                long jOptLong = C202185149f.LJII("common").optLong("period", 30000L);
                                c202185149f.getClass();
                                C202185149f.LJIIIZ(jOptLong, "init", "", "");
                            } else {
                                c202185149f.getClass();
                                C202185149f.LJIIIZ(0L, "init", "", "");
                            }
                            C202185149f.LJIIIZ = true;
                            C202185149f.LJIIJ = tTNetStatus;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C202185149f.LIZJ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BdTuring@176e.init$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BdTuring@176e.init$2");
            }
        });
        RiskControlService riskControlService = new RiskControlService();
        this.LIZJ = riskControlService;
        addService(riskControlService);
        addService(new TwiceVerifyService());
        addService(new LoginVerifyService());
        C14AY c14ayLIZ = C14AY.LIZ();
        this.LIZ.getTwiceVerifyDepend();
        c14ayLIZ.getClass();
        this.LIZIZ = true;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", jCurrentTimeMillis2);
            jSONObject.put("key", "init");
            C202191149l.LIZJ("oec_verify_sdk", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
        return this;
    }

    public void openLog(boolean z) {
        if (z) {
            C14A6.LIZ = 7;
        } else {
            C14A6.LIZ = 1;
        }
    }

    public final boolean LIZIZ(Activity activity, AbstractC202199149t abstractC202199149t, BdTuringCallback bdTuringCallback) {
        boolean z;
        String showingRequestPath;
        if (abstractC202199149t == null) {
            return false;
        }
        if (this.LIZIZ && bdTuringCallback != null && activity != null) {
            if (System.currentTimeMillis() - this.LJ < 500) {
                z = true;
            } else {
                z = false;
            }
            this.LJ = System.currentTimeMillis();
            if (!z) {
                return true;
            }
            RiskControlService riskControlService = this.LIZJ;
            if (riskControlService != null) {
                showingRequestPath = riskControlService.getShowingRequestPath();
                if (showingRequestPath != null && showingRequestPath.equals(abstractC202199149t.LJFF())) {
                    this.LIZJ.increaseBlockSamePathReqCount();
                }
            } else {
                showingRequestPath = null;
            }
            C202191149l.LJII(abstractC202199149t, C149V.VERIFY_POP_TOO_FREQUENT.getCode(), 0L, null, showingRequestPath);
            bdTuringCallback.onFail(LSPassThroughRecordSizeConfig.DEFAULT, null);
            return false;
        }
        C202191149l.LJII(abstractC202199149t, C149V.VERIFY_POP_CHECK_REQUEST_ERROR.getCode(), 0L, null, null);
        bdTuringCallback.onFail(2, null);
        return false;
    }

    public final void LIZLLL(Activity activity, AbstractC202199149t abstractC202199149t, BdTuringCallback bdTuringCallback) {
        abstractC202199149t.LIZ = activity;
        for (C14A2 c14a2 : this.LIZLLL.values()) {
            if (c14a2.isProcess(abstractC202199149t.LJIIJJI())) {
                c14a2.execute(abstractC202199149t, bdTuringCallback);
                return;
            }
        }
        C202191149l.LJII(abstractC202199149t, C149V.VERIFY_POP_MISMATCH_TYPE_ERROR.getCode(), 0L, null, null);
        bdTuringCallback.onFail(996, null);
    }

    public void preloadVerifyDialog(Activity activity, AbstractC202199149t abstractC202199149t, BdTuringCallback bdTuringCallback) {
        C202169148p c202169148p = C202170148q.LIZ;
        abstractC202199149t.LIZ = activity;
        abstractC202199149t.LIZJ = true;
        c202169148p.LIZ = System.currentTimeMillis();
        C14AC c14ac = new C14AC(abstractC202199149t, bdTuringCallback, false);
        c14ac.create();
        new WeakReference(c14ac);
    }

    public void showVerifyDialog(Activity activity, int i, BdTuringCallback bdTuringCallback) {
        AbstractC202199149t c149j;
        if (!LIZIZ(activity, null, bdTuringCallback)) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BdTuring showVerifyDialog with unsupported verifyType: ");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                c149j = new C149L(getConfig().getChallengeCode());
            } else {
                c149j = new C149K(getConfig().getScene(), getConfig().getShowToastSuccess());
            }
        } else {
            c149j = new C149J(getConfig().getRiskInfo());
            if (c149j.LJIIJJI() == 0) {
                bdTuringCallback.onFail(997, null);
                return;
            }
        }
        c149j.LJ = getConfig().getMaskCancel();
        LIZLLL(activity, c149j, bdTuringCallback);
    }

    public void showVerifyDialog(Activity activity, AbstractC202199149t abstractC202199149t, BdTuringCallback bdTuringCallback) {
        BdTuringConfig config = getInstance().getConfig();
        if (config != null && config.getExpFeatures() != null) {
            Object obj = config.getExpFeatures().get("useSView");
            if (obj instanceof Boolean) {
                ((Boolean) obj).booleanValue();
            }
        }
        if (!LIZIZ(activity, abstractC202199149t, bdTuringCallback)) {
            if (abstractC202199149t.LJIIJ().equals("login")) {
                C202185149f c202185149f = C202185149f.LIZ;
                C202185149f.LJIIIIZZ(LJFF, abstractC202199149t.LIZIZ(), 9, abstractC202199149t.LJII(), abstractC202199149t.LJFF(), abstractC202199149t.LJIIJ());
            }
            bdTuringCallback.onFail(1, null);
            return;
        }
        LIZLLL(activity, abstractC202199149t, bdTuringCallback);
    }

    public void checkSmsCode(String str, String str2, int i, String str3, C14AA c14aa) {
        JSONObject jSONObject = new JSONObject();
        BdTuringConfig config = getInstance().getConfig();
        try {
            jSONObject.put("mobile", str2);
            jSONObject.put("app_id", CastIntegerProtector.parseInt(config.getAppId()));
            jSONObject.put(Scene.SCENE_SERVICE, i);
            jSONObject.put("code", str3);
            jSONObject.put("language", config.getLanguage());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json");
        C145R.LIZ.LIZ(new ARunnableS4S1300000_3(config, str, map, jSONObject, 1));
    }

    public void sendSmsCode(String str, Activity activity, String str2, int i, int i2, int i3, int i4, BdTuringCallback bdTuringCallback) {
        C202197149r.LIZ(str, activity, str2, i, i2, i3, i4, bdTuringCallback);
    }
}
