package com.ss.android.ugc.aweme.biz.wallet.biz.finish;

import X.C01GW;
import X.C092700Wn;
import X.C098200Yq;
import X.C1548870qPN;
import X.C1559260qg8;
import X.C1716310ulR;
import X.C1716350ulV;
import X.C1716470ulh;
import X.C1716550ulp;
import X.C1717080umg;
import X.C1718840upW;
import X.C189200o6;
import X.C19EG;
import X.C2097608Jq;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.CountDownTimerC1775650wJ9;
import X.InterfaceC1548890qPP;
import X.InterfaceC1716990umX;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.ab.PipoOnboardingSuccPageConfigModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class WalletAccountFinishAssem extends UIContentAssem implements InterfaceC1548890qPP {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 115));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 117));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 114));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 113));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 116));
    public final C1559260qg8 LLJILJILJ = new C1559260qg8(new C723580SZw(this, C1718840upW.class, "SOURCE_DATA"), checkSupervisorPrepared());
    public final C1548870qPN LLJILLL = new C1548870qPN();
    public final long LLJJ;
    public int LLJJI;
    public final AtomicBoolean LLJJIII;
    public CountDownTimerC1775650wJ9 LLJJIJI;
    public final long LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public long LLJJJJJIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1718840upW Jo() {
        return (C1718840upW) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9 = this.LLJJIJI;
        if (countDownTimerC1775650wJ9 != null) {
            countDownTimerC1775650wJ9.cancel();
        }
        if (this.LLJJJJ) {
            this.LLJILLL.LJI("ttpay_post_guide", this);
        }
        super.onDestroy();
    }

    public WalletAccountFinishAssem() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoOnboardingSuccPageConfigModel pipoOnboardingSuccPageConfigModel = C092700Wn.LIZ;
        PipoOnboardingSuccPageConfigModel pipoOnboardingSuccPageConfigModel2 = (PipoOnboardingSuccPageConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_onboarding_succ_page_config", PipoOnboardingSuccPageConfigModel.class, pipoOnboardingSuccPageConfigModel);
        long j = (pipoOnboardingSuccPageConfigModel2 != null ? pipoOnboardingSuccPageConfigModel2 : pipoOnboardingSuccPageConfigModel).countdownTime;
        this.LLJJ = j;
        this.LLJJI = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        this.LLJJIII = new AtomicBoolean(false);
        this.LLJJIJIIJIL = System.currentTimeMillis();
    }

    public final boolean Lo() {
        C1718840upW c1718840upWJo = Jo();
        return c1718840upWJo != null && c1718840upWJo.LLJIJIL;
    }

    public final String No() {
        String str;
        C1718840upW c1718840upWJo = Jo();
        if (c1718840upWJo == null || (str = c1718840upWJo.LLJILLL) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (Lo()) {
            return;
        }
        String strNo = No();
        if ((strNo == null || strNo.length() == 0) && this.LLJJIII.compareAndSet(false, true)) {
            Go(this.LLJJI - 1);
            CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9 = this.LLJJIJI;
            if (countDownTimerC1775650wJ9 != null) {
                countDownTimerC1775650wJ9.start();
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LLJJJJJIL));
        String str = this.LLJJIJIL;
        if (str == null) {
            str = "close";
        }
        pairArr[1] = new Pair("quit_type", str);
        So("pipo_page_stay", "leave", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void Go(int i) {
        String str;
        TextView textView = (TextView) this.LLJIJIL.getValue();
        C1718840upW c1718840upWJo = Jo();
        if (c1718840upWJo == null || (str = c1718840upWJo.LLJ) == null) {
            str = "";
        }
        textView.setText(C786410Ut5.j4(str, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b9 A[PHI: r2
      0x01b9: PHI (r2v27 java.lang.Integer) = (r2v24 java.lang.Integer), (r2v28 java.lang.Integer) binds: [B:92:0x01b7, B:56:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishAssem.onViewCreated(android.view.View):void");
    }

    public final void Ho(String str, boolean z) {
        String str2;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9 = this.LLJJIJI;
            if (countDownTimerC1775650wJ9 != null) {
                countDownTimerC1775650wJ9.cancel();
            }
            String str3 = WalletAccountFinishFragment._pnsPageId;
            C1718840upW c1718840upWJo = Jo();
            if (c1718840upWJo == null || (str2 = c1718840upWJo.LL) == null) {
                str2 = "";
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            HashMap<String, InterfaceC1716990umX> map = WalletAccountFinishFragment.LLJJI;
            InterfaceC1716990umX interfaceC1716990umX = map.get(str2);
            if (interfaceC1716990umX != null) {
                interfaceC1716990umX.LIZIZ(boolValueOf, str);
                map.remove(str2);
            }
            c19egLIZ.finish();
        }
    }

    public final void Oo(String str, Map<String, String> map) {
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJJJIL;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("button_id", str);
        pairArr[1] = new Pair("click_use_time", String.valueOf(jCurrentTimeMillis));
        C1718840upW c1718840upWJo = Jo();
        if (c1718840upWJo == null || (str2 = c1718840upWJo.LLILLL) == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("previous_page_id", str2);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        So("pipo_button_click", "click", mapLJIIJ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        Object c098200Yq;
        String str3;
        if (!Intrinsics.LJFF(str, "ttpay_post_guide")) {
            return;
        }
        try {
            c098200Yq = new JSONObject(str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("action");
        String strOptString2 = jSONObject.optString("biz");
        C1718840upW c1718840upWJo = Jo();
        if (c1718840upWJo == null || (str3 = c1718840upWJo.LL) == null) {
            str3 = "";
        }
        C1716470ulh.LIZ(str3, "rd_pipo_on_boarding", C2097608Jq.LJIIIIZZ(new Pair("step", "finish_post_guide"), new Pair("result", strOptString), new Pair("extra", strOptString2)));
        switch (strOptString.hashCode()) {
            case -2062099762:
                if (!strOptString.equals("close_back")) {
                    return;
                }
                break;
            case -2061583514:
                if (!strOptString.equals("close_skip")) {
                    return;
                }
                break;
            case -1274442605:
                if (!strOptString.equals("finish")) {
                    return;
                }
                break;
            case -432210913:
                if (!strOptString.equals("drop_off")) {
                    return;
                }
                break;
            case 866536433:
                if (!strOptString.equals("close_x")) {
                    return;
                }
                break;
            default:
                return;
        }
        this.LLJJIJIL = "next";
        Ho(this.LLJJJIL, false);
    }

    public final void So(String str, String str2, Map<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C1716350ulV c1716350ulV;
        Pair[] pairArr = new Pair[8];
        C1718840upW c1718840upWJo = Jo();
        String str9 = "";
        if (c1718840upWJo == null || (str3 = c1718840upWJo.LLILZ) == null) {
            str3 = "";
        }
        pairArr[0] = new Pair("enter_from", str3);
        pairArr[1] = new Pair("page_id", "open_result");
        pairArr[2] = new Pair("busi_line", "TIKTOK_PAY");
        pairArr[3] = new Pair("event_type", str2);
        C1716550ulp c1716550ulp = C1716550ulp.LIZ;
        C1718840upW c1718840upWJo2 = Jo();
        if (c1718840upWJo2 == null || (str4 = c1718840upWJo2.LL) == null) {
            str4 = "";
        }
        c1716550ulp.getClass();
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str4);
        if (c1717080umgLJFF == null || (c1716350ulV = c1717080umgLJFF.LIZLLL) == null || (str5 = c1716350ulV.LIZIZ) == null) {
            str5 = "";
        }
        pairArr[4] = new Pair("merchant_user_id", str5);
        C1718840upW c1718840upWJo3 = Jo();
        if (c1718840upWJo3 == null || (str6 = c1718840upWJo3.LLILLL) == null) {
            str6 = "";
        }
        pairArr[5] = new Pair("previous_page_id", str6);
        if (!Lo()) {
            str7 = "";
        } else {
            str7 = "promo";
        }
        pairArr[6] = new Pair("activity_type", str7);
        C1718840upW c1718840upWJo4 = Jo();
        if (c1718840upWJo4 != null && (str8 = c1718840upWJo4.LLIZLLLIL) != null) {
            str9 = str8;
        }
        pairArr[7] = new Pair("text", str9);
        Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), map);
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL(str, mapLJIIL);
    }
}
