package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui;

import X.C01GW;
import X.C106V;
import X.C10B2;
import X.C10B4;
import X.C10B8;
import X.C10B9;
import X.C1163504gr;
import X.C191969108h;
import X.C197039127h;
import X.C2097908Jt;
import X.C452501pT;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PaPromptPrivacySettingsFragment extends BaseFragment implements C10B8 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnISsrHELIOSZz8yODcjJD8nZjAlZx8yGDcjJD8nGDclPy4wMRYpPTs6JiI/Dz0yLygpJzs=";
    public TuxNavBar LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public TuxTextView LLILZ;
    public RecyclerView LLILZIL;
    public View LLILZLL;
    public long LLIZLLLIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 640));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 638));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 639));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 637));

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        return R.layout.be8;
    }

    public final int NR() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    public final PaPromptViewModel PR() {
        return (PaPromptViewModel) this.LLIZ.getValue();
    }

    public final String OR() {
        C10B4 value = PR().LL.getValue();
        if (value == null) {
            return "private";
        }
        int i = C10B2.LIZ[value.ordinal()];
        return i != 2 ? i == 3 ? "remind_me_later" : "private" : "public";
    }

    @Override // X.C10B8
    public final boolean onBackPressed() {
        if (PR().LLILZ) {
            C1163504gr c1163504gr = C1163504gr.LIZIZ;
            C191969108h c191969108h = new C191969108h();
            c191969108h.LIZLLL("enter_from", "exist_account_privacy_page");
            c191969108h.LIZLLL("action_type", "click");
            c191969108h.LIZLLL("click_type", "go_back");
            C10B9 c10b9WQ2 = PR().wQ2();
            c191969108h.LIZLLL("private_type", c10b9WQ2 != null ? c10b9WQ2.getEtText() : null);
            c1163504gr.onEventV3("exist_account_privacy_setting_page", c191969108h.LIZ);
        } else {
            C1163504gr c1163504gr2 = C1163504gr.LIZIZ;
            C191969108h c191969108h2 = new C191969108h();
            c191969108h2.LIZLLL("action_type", "click");
            c191969108h2.LIZLLL("enter_from", "account_privacy_page");
            c191969108h2.LIZLLL("click_type", "go_back");
            c191969108h2.LIZIZ(System.currentTimeMillis() - this.LLIZLLLIL, "stay_time");
            c191969108h2.LIZ(((Number) this.LLJI.getValue()).intValue() > 0 ? 1 : 0, "is_later_show");
            c191969108h2.LIZLLL("private_type", OR());
            c191969108h2.LIZLLL("enter_position", (String) this.LLJIJIL.getValue());
            c1163504gr2.onEventV3("account_privacy_setting_page", c191969108h2.LIZ);
        }
        if (NR() != 2 && NR() != 4 && !PR().LLILZ && NR() != 8 && NR() != 9) {
            PR().LL.postValue(C10B4.NONE);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLIZLLLIL = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void RR(java.lang.String r5) {
        /*
            X.04gr r3 = X.C1163504gr.LIZIZ
            r0 = 2
            kotlin.Pair[] r4 = new kotlin.Pair[r0]
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "account_privacy_page"
            r2.<init>(r1, r0)
            r0 = 0
            r4[r0] = r2
            int r1 = r5.hashCode()
            r0 = -2099038552(0xffffffff82e336a8, float:-3.3386023E-37)
            if (r1 == r0) goto L4d
            r0 = -1124815836(0xffffffffbcf4ac24, float:-0.02986724)
            if (r1 == r0) goto L42
            r0 = -99623184(0xfffffffffa0fdef0, float:-1.8675504E35)
            if (r1 != r0) goto L58
            java.lang.String r0 = "dm_setting_friends"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L58
            java.lang.String r2 = "1"
        L2e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "DM_permission"
            r1.<init>(r0, r2)
            r0 = 1
            r4[r0] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r4)
            java.lang.String r0 = "click_dm_permissions_setting"
            r3.onEventV3(r0, r1)
            return
        L42:
            java.lang.String r0 = "dm_setting_potential_connection"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L58
            java.lang.String r2 = "2"
            goto L2e
        L4d:
            java.lang.String r0 = "dm_setting_others"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L58
            java.lang.String r2 = "3"
            goto L2e
        L58:
            java.lang.String r2 = ""
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptPrivacySettingsFragment.RR(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C106V.LIZ.LIZ();
        C1163504gr.LIZIZ.onEventV3("pns_tpsc_page_enter", C2097908Jt.LIZJ(new Pair("page_tag", "paprompt")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b7 A[PHI: r2
      0x02b7: PHI (r2v5 android.view.View) = (r2v4 android.view.View), (r2v10 android.view.View) binds: [B:69:0x02a4, B:74:0x02b5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptPrivacySettingsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
