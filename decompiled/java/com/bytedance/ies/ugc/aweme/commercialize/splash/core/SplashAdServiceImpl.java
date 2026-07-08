package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import X.C01GW;
import X.C0C64;
import X.C0TT1;
import X.C0VSJ;
import X.C1002190cBd;
import X.C1017070cZd;
import X.C1018150cbN;
import X.C1018240cbW;
import X.C1018250cbX;
import X.C1018290cbb;
import X.C1030680cva;
import X.C1030780cvk;
import X.C1030790cvl;
import X.C1030980cw4;
import X.C1031040cwA;
import X.C1031050cwB;
import X.C1031060cwC;
import X.C1031080cwE;
import X.C1031100cwG;
import X.C1031160cwM;
import X.C1031250cwV;
import X.C10GR;
import X.C1865910yej;
import X.C19EG;
import X.C19GS;
import X.C20595215iQ;
import X.C20656615sK;
import X.C20673215v0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2212051Bhr;
import X.C2212061Bhs;
import X.C2212121Bhy;
import X.C2212141Bi0;
import X.C2212161Bi2;
import X.C2212171Bi3;
import X.C2212191Bi5;
import X.C2212201Bi6;
import X.C2212231Bi9;
import X.C2212241BiA;
import X.C2212281BiE;
import X.C2212381BiO;
import X.C2214471Bll;
import X.C2238381CjE;
import X.C2344009Gk;
import X.C288590BSv;
import X.C344570Df5;
import X.C452501pT;
import X.C793770VBv;
import X.C794240VDq;
import X.C800330VaR;
import X.C844470XAv;
import X.InterfaceC1018210cbT;
import X.InterfaceC1023590ck9;
import X.InterfaceC1023650ckF;
import X.InterfaceC1028550cs9;
import X.InterfaceC1031110cwH;
import X.InterfaceC814740Vxg;
import Y.ACallableS67S1100000_16;
import Y.ARunnableS93S0000000_16;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.RealTimeSplashTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadJsonTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.silentpush.TopviewSafeguardManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.model.SilentMsg;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SplashAdServiceImpl implements ISplashAdService {
    public C344570Df5 LIZ;
    public C1018290cbb LIZIZ;
    public InterfaceC1023590ck9 LJ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1018250cbX());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1018240cbW());
    public final ConcurrentHashMap<InterfaceC1023650ckF<Long, Long>, Long> LJFF = new ConcurrentHashMap<>();

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJI() {
        this.LIZIZ = null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Integer LIZJ() {
        C1030790cvl.LIZ.getClass();
        ArrayList arrayListLIZ = C1030790cvl.LIZ(true);
        if (arrayListLIZ == null || arrayListLIZ.isEmpty()) {
            return null;
        }
        C1030780cvk c1030780cvk = (C1030780cvk) ListProtector.get(arrayListLIZ, 0);
        int i = c1030780cvk.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("topViewHasUnShowBrandSafetyCheck: brandSafety = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("topViewHasUnShowBrandSafetyCheck first = ");
        sbLIZ2.append(c1030780cvk);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (C1030680cva.LJIIJ(i)) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final boolean LJ() {
        C1031060cwC.LIZ.getClass();
        return C1031060cwC.LIZJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final boolean LJIILIIL() {
        if (((Boolean) C1865910yej.LIZJ.getValue()).booleanValue()) {
            C20595215iQ c20595215iQ = C20595215iQ.LIZ;
            float f = C20595215iQ.LIZJ;
            if (f > 0.0f && f <= 4.5f) {
                return false;
            }
        }
        return !((Boolean) C2238381CjE.LIZJ.getValue()).booleanValue() || C2212241BiA.LJFF();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIILL() {
        if (C2212241BiA.LJ) {
            return;
        }
        C2212241BiA.LJ = true;
        C844470XAv.LIZ.getClass();
        C2212241BiA.LIZIZ(C844470XAv.LIZ());
        C2212241BiA.LIZIZ.LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIILLIIL() {
        C844470XAv.LIZ.getClass();
        C2212241BiA.LIZIZ(C844470XAv.LIZ());
        C2212241BiA.LIZIZ.getClass();
        C2212171Bi3.LJ().LJIIIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIJI() {
        this.LJFF.clear();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIJJLI() {
        TopviewSafeguardManager.LIZ.getClass();
        IPushApi iPushApi = (IPushApi) PluggableExtentionKt.pluggableSpi$default(IPushApi.class, false, false, false, 14, null);
        if (iPushApi != null) {
            iPushApi.registerSilentMsgHandler(new InterfaceC814740Vxg() { // from class: X.0W4W
                public final int[] LIZ = {EnumC814940Vy0.TOPVIEW_SAFEGUARD_CACHE.getSceneId()};

                @Override // X.InterfaceC814740Vxg
                public final int[] LIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC814740Vxg
                public final void LIZIZ(SilentMsg silentMsg) {
                    try {
                        C1227904rF c1227904rF = C1227904rF.LIZ;
                        String str = silentMsg.data;
                        c1227904rF.getClass();
                        List<String> list = ((TopviewSafeguardManager.SilentPushMessage) C1227904rF.LIZIZ(str, TopviewSafeguardManager.SilentPushMessage.class)).creativeIds;
                        if (list != null) {
                            for (String str2 : list) {
                                C1018150cbN.LIZJ().getClass();
                                TopViewJsonManager topViewJsonManager = C1018150cbN.LIZJ;
                                if (topViewJsonManager != null) {
                                    C15O7.LIZJ(new ACallableS67S1100000_16(topViewJsonManager, str2, 0));
                                }
                            }
                            C1227904rF.LIZ.getClass();
                            C20684815ws.LJIILLIIL("push_to_clean", C2097908Jt.LIZJ(new Pair("cid_list", C1227904rF.LJI(list))));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final RealTimeSplashTask LJIL() {
        return new RealTimeSplashTask();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Integer LJJ() {
        C1030790cvl.LIZ.getClass();
        C1030790cvl.LIZJ = null;
        C1030790cvl.LIZIZ = false;
        ArrayList arrayListLIZ = C1030790cvl.LIZ(false);
        if (arrayListLIZ == null || arrayListLIZ.isEmpty()) {
            C1030790cvl.LIZIZ = true;
            return null;
        }
        if (C1030680cva.LJIJ) {
            C1030790cvl.LIZJ = new C1031040cwA(4, (String) null, 6);
            return null;
        }
        C2212191Bi5.LIZJ().getClass();
        if (C2212231Bi9.LJIIIIZZ().LJIILL && C2212161Bi2.LJIJJ(C2212141Bi0.LJIIIIZZ())) {
            C1030790cvl.LIZJ = new C1031040cwA(13, (String) null, 6);
            return null;
        }
        C1030780cvk c1030780cvk = (C1030780cvk) ListProtector.get(arrayListLIZ, 0);
        int i = c1030780cvk.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("topViewHasBrandSafetyCheck: brandSafety = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        Integer numValueOf = C1030680cva.LJIIJ(i) ? Integer.valueOf(i) : null;
        C1030790cvl.LIZJ = new C1031040cwA(0, c1030780cvk.LIZ, Integer.valueOf(i));
        return numValueOf;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJIIJ() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        SettingsManager.LIZLLL().getClass();
        repo.storeBoolean("splash_ad_enable", SettingsManager.LIZ("enable_normal_splash_ad", true) && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_normal_splash_ad_ab", true, true));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJIIZI() {
        C20656615sK stateWrapper;
        if (C1030680cva.LJIILJJIL) {
            C344570Df5 c344570Df5 = this.LIZ;
            if (c344570Df5 != null && (stateWrapper = c344570Df5.getStateWrapper()) != null) {
                stateWrapper.LIZ();
            }
            this.LIZ = null;
            C1030680cva.LJIILJJIL = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJIJ() {
        C1031060cwC.LIZ.getClass();
        C1031060cwC.LIZJ = false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final int LJJIJIIJIL() {
        C844470XAv.LIZ.getClass();
        C2212241BiA.LIZIZ(C844470XAv.LIZ());
        C2212241BiA.LIZIZ.getClass();
        return C2212141Bi0.LJIIIIZZ().LJIIJJI();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final boolean LJJIJIL() {
        C1031060cwC.LIZ.getClass();
        return C1031060cwC.LIZLLL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final C0TT1 LJJIZ() {
        return (C0TT1) this.LIZJ.getValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final SplashBgInflate LIZ() {
        if (LJIILIIL()) {
            return new SplashBgInflate();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIJ() {
        File[] fileArrListFiles;
        C1018150cbN.LIZJ().getClass();
        if (C1018150cbN.LIZJ == null || (fileArrListFiles = new C0VSJ(C1018150cbN.LIZLLL).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final TopViewPreloadJsonTask LJJIJLIJ() {
        if (LJIILIIL()) {
            return new TopViewPreloadJsonTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final SplashAdManagerPreloadTask LJJIL() {
        if (LJIILIIL()) {
            return new SplashAdManagerPreloadTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final String LJJJ() {
        TopViewAwemeRawAd topViewAwemeRawAdLIZIZ;
        TopViewAwemeRawAd topViewAwemeRawAdLJIJJLI;
        Integer brandSafety;
        C1018150cbN.LIZJ().getClass();
        TopViewJsonManager topViewJsonManager = C1018150cbN.LIZJ;
        if (topViewJsonManager == null || topViewJsonManager.LJ.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (InterfaceC1018210cbT interfaceC1018210cbT : new HashMap(topViewJsonManager.LJ).values()) {
            if (C1030680cva.LJIIJ((interfaceC1018210cbT == null || (topViewAwemeRawAdLJIJJLI = C1017070cZd.LJIJJLI(interfaceC1018210cbT)) == null || (brandSafety = topViewAwemeRawAdLJIJJLI.getBrandSafety()) == null) ? 0 : brandSafety.intValue()) && (topViewAwemeRawAdLIZIZ = interfaceC1018210cbT.LIZIZ()) != null) {
                sb.append(topViewAwemeRawAdLIZIZ.getCreativeIdStr());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Map<InterfaceC1023650ckF<Long, Long>, Long> LJJIII() {
        return this.LJFF;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LIZLLL(boolean z) {
        SharedPreferences sharedPreferences;
        C1018150cbN.LIZJ().getClass();
        TopViewJsonManager topViewJsonManager = C1018150cbN.LIZJ;
        if (topViewJsonManager != null && (sharedPreferences = topViewJsonManager.LIZJ) != null) {
            sharedPreferences.edit().putBoolean("awesome_splash_filter_enable", z).apply();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final C1018290cbb LJFF(C19EG c19eg) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C1018290cbb(c19eg, this.LJ);
        }
        return this.LIZIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Drawable LJII(Context context) {
        return C800330VaR.LIZIZ(context, R.drawable.splash_bg_normal);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIIJ(C1030980cw4 c1030980cw4) {
        if (C1031100cwG.LIZ() != null) {
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("splash_depend_init_question", 2, null);
        } else {
            C1031100cwG.LIZ.LIZIZ(c1030980cw4);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIIL(C1031080cwE c1031080cwE) {
        long jLongValue;
        long jLongValue2;
        String logExtra;
        Long adId;
        C1031250cwV.LIZ.getValue().getClass();
        Aweme aweme = c1031080cwE.LIZ;
        Integer num = c1031080cwE.LIZIZ;
        Integer num2 = c1031080cwE.LIZJ;
        Long l = c1031080cwE.LIZLLL;
        long jLongValue3 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = c1031080cwE.LJ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        if (aweme != null && num != null && num2 != null) {
            int iIntValue = num2.intValue();
            int iIntValue2 = num.intValue();
            try {
                JSONObject jSONObject = new JSONObject();
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    logExtra = awemeRawAd.getLogExtra();
                } else {
                    logExtra = null;
                }
                if (!TextUtils.isEmpty(logExtra)) {
                    jSONObject.put("log_extra", logExtra);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("launch_type", C1030680cva.LJ ? 1 : 0);
                jSONObject2.put("video_nums", iIntValue);
                jSONObject2.putOpt("is_topview", "1");
                jSONObject2.put("play_order", jLongValue);
                jSONObject2.put("duration", jLongValue2);
                jSONObject2.put("current_position", iIntValue2);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                jSONObject.put("is_ad_event", "1");
                C2212051Bhr c2212051BhrLIZJ = C2212051Bhr.LIZJ();
                AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                if (awemeRawAdLJJIJLIJ != null && (adId = awemeRawAdLJJIJLIJ.getAdId()) != null) {
                    jLongValue3 = adId.longValue();
                }
                c2212051BhrLIZJ.LJ(0, jLongValue3, "splash_ad", "topview_swipe_up_context", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Aweme LJIILJJIL(String str) {
        C1018150cbN.LIZJ().getClass();
        return C1018150cbN.LIZJ.LIZIZ(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final TopViewAdEventLogger LJIIZILJ(Aweme aweme) {
        return new TopViewAdEventLogger(new Object[]{aweme});
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJI(InterfaceC1023590ck9 interfaceC1023590ck9) {
        this.LJ = interfaceC1023590ck9;
        C1018290cbb c1018290cbb = this.LIZIZ;
        if (c1018290cbb != null) {
            c1018290cbb.LIZLLL = interfaceC1023590ck9;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final boolean LJJIFFI(C19GS c19gs) {
        boolean zLJI = MethodIDManager.LJI(71911);
        if (C288590BSv.LIZ()) {
            C1031060cwC.LIZ.getClass();
            boolean zLJI2 = C1031060cwC.LIZJ().LJI(1, c19gs);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return zLJI2;
        }
        if (((Boolean) C2238381CjE.LIZJ.getValue()).booleanValue() && !C2212241BiA.LJFF()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return false;
            }
            return false;
        }
        boolean zLJFF = C1031060cwC.LIZ.LJFF(1, c19gs);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLJFF;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJII(InterfaceC1028550cs9 interfaceC1028550cs9) {
        if (C1031100cwG.LIZ() == null) {
            C1031100cwG.LIZ.LIZIZ(interfaceC1028550cs9);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("splash_depend_init_question", 1, null);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJIIZ(Aweme aweme) {
        LJJJIL(null, aweme, false);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View LJJIJIIJI(View view) {
        if (view != null) {
            return view.findViewById(R.id.bme);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final TopViewPreloadTask LJJIJL(List list) {
        return new TopViewPreloadTask(list);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Df5, X.15sG] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJJI(final C19EG c19eg) {
        if (C1030680cva.LJIILJJIL) {
            return;
        }
        C1030680cva.LJIILJJIL = true;
        ?? r0 = new C10GR(c19eg) { // from class: X.0Df5
            public final C19EG LL;
            public final int LLILLJJLI = 10;

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
            }

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg2 = this.LL;
                return new C688120Qyw(c19eg2, c19eg2, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILLJJLI;
            }

            {
                this.LL = c19eg;
            }
        };
        this.LIZ = r0;
        PopupManager.LJIJI(r0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LIZIZ(Context context, String str) {
        Object arrayList;
        String deviceId;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("splash_crash_protect", true)) {
            C2212191Bi5 c2212191Bi5 = C1031160cwM.LIZ;
            C2212281BiE.LIZIZ(context, null);
            C1031160cwM.LIZLLL.getClass();
            try {
                if (!TextUtils.isEmpty(str)) {
                    ArrayList<String> arrayList2 = new ArrayList();
                    Package r0 = C1031160cwM.class.getPackage();
                    if (r0 != null) {
                        arrayList2.add(r0.getName());
                    }
                    for (String str2 : arrayList2) {
                        if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("crashed，ad array is: ");
                            C2212061Bhs c2212061BhsLIZIZ = C2212061Bhs.LIZIZ();
                            if (c2212061BhsLIZIZ.LIZ == null) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList();
                                for (C2212201Bi6 c2212201Bi6 : new ArrayList(c2212061BhsLIZIZ.LIZ)) {
                                    if (c2212201Bi6 != null) {
                                        arrayList.add(String.valueOf(c2212201Bi6.LLJI));
                                    }
                                }
                            }
                            sbLIZ.append(arrayList);
                            sbLIZ.append("\n crash stack is: ");
                            sbLIZ.append(str);
                            C2212381BiO.LIZJ(84378473382L, C2188811AlT.LIZIZ(sbLIZ), null);
                            if (C2212141Bi0.LJIIIIZZ().LIZJ.LIZIZ("key_exception_time") + 1 >= C2212231Bi9.LJIIIIZZ().LIZ) {
                                C2212231Bi9.LJFF.execute(new ARunnableS93S0000000_16(15));
                                C2212121Bhy c2212121Bhy = C2212141Bi0.LJIIIIZZ().LIZJ;
                                c2212121Bhy.LJ(0, "key_exception_time");
                                c2212121Bhy.LIZ.LIZIZ();
                            } else {
                                C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
                                C2212121Bhy c2212121Bhy2 = c2212141Bi0LJIIIIZZ.LIZJ;
                                c2212121Bhy2.LJ(c2212141Bi0LJIIIIZZ.LIZJ.LIZIZ("key_exception_time") + 1, "key_exception_time");
                                c2212121Bhy2.LIZ.LIZIZ();
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LIZLLL(System.currentTimeMillis(), "event_time");
                            IHostContextDepend iHostContextDependLIZIZ = C2214471Bll.LIZIZ();
                            if (iHostContextDependLIZIZ != null && (deviceId = iHostContextDependLIZIZ.getDeviceId()) != null) {
                                c2344009Gk.LJFF(FollowStatusChangeMethod.PARAM_UID, deviceId);
                            }
                            C20684815ws.LJIILLIIL("splash_ad_handle_exception_event", c2344009Gk.LIZ);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2212381BiO.LIZLLL(" crashed while processing crash ");
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIIIIZZ(Context context, Aweme aweme) {
        LJJJIL(context, aweme, true);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View LJIIIZ(ViewGroup viewGroup, Fragment fragment) {
        System.currentTimeMillis();
        if (fragment.getActivity() != null) {
            C20673215v0.LIZLLL(R.layout.abt, fragment.requireActivity(), viewGroup, true);
        }
        return viewGroup.findViewById(R.id.bmc);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIJJ(Context context, List<? extends Aweme> list) {
        C1018150cbN.LIZJ().LJIIIIZZ(context, list);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJIIJZLJL(C1002190cBd c1002190cBd, long j) {
        this.LJFF.put(c1002190cBd, Long.valueOf(j));
    }

    public final void LJJJIL(Context context, Aweme aweme, boolean z) {
        if (((ArrayList) this.LIZLLL.getValue()).isEmpty() || new CopyOnWriteArrayList((ArrayList) this.LIZLLL.getValue()).isEmpty()) {
            return;
        }
        for (InterfaceC1031110cwH interfaceC1031110cwH : (ArrayList) this.LIZLLL.getValue()) {
            if (interfaceC1031110cwH.LIZ(aweme)) {
                if (z) {
                    interfaceC1031110cwH.LIZJ(context, aweme);
                } else {
                    interfaceC1031110cwH.LIZIZ(aweme);
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIIJJI(int i, String str, String str2, boolean z) {
        C1031060cwC.LIZ.getClass();
        C1031050cwB c1031050cwBLIZJ = C1031060cwC.LIZJ();
        if (c1031050cwBLIZJ != null) {
            c1031050cwBLIZJ.LJFF(i, str, str2, z, true, true);
        }
    }
}
