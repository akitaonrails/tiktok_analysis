package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui;

import X.C01GW;
import X.C10B8;
import X.C128Y;
import X.C19EH;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1243970iTb;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PaPromptProcessFragment extends BaseFragment implements InterfaceC1243970iTb {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDHELIOSsnISsrZz8yODcjJD8nZjAlZx8yGDcjJD8nGDcjKiogOwM+KCg+LSs4";
    public Function0<Unit> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 641));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 551));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 552));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 550));

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        return R.layout.be4;
    }

    public final int NR() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public final void OR() {
        Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.tqy);
        if (Intrinsics.LJFF(fragmentLJJJJZ != null ? fragmentLJJJJZ.getTag() : null, "pa_prompt_privacy_settings") || NR() >= 2) {
            Function0<Unit> function0 = this.LL;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Fragment fragmentLJJJJZ2 = getChildFragmentManager().LJJJJZ(R.id.tqy);
        if (Intrinsics.LJFF(fragmentLJJJJZ2 != null ? fragmentLJJJJZ2.getTag() : null, "pa_prompt_introduce_for_existing_users")) {
            Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("pa_prompt");
            if (fragmentLJJJJZI == null) {
                fragmentLJJJJZI = new PaPromptFragmentForExistingUsers();
            }
            PR(fragmentLJJJJZI, "pa_prompt");
            return;
        }
        Fragment fragmentLJJJJZ3 = getChildFragmentManager().LJJJJZ(R.id.tqy);
        if (!Intrinsics.LJFF(fragmentLJJJJZ3 != null ? fragmentLJJJJZ3.getTag() : null, "pa_prompt")) {
            Fragment fragmentLJJJJZ4 = getChildFragmentManager().LJJJJZ(R.id.tqy);
            if (!Intrinsics.LJFF(fragmentLJJJJZ4 != null ? fragmentLJJJJZ4.getTag() : null, "pa_prompt")) {
                return;
            }
        }
        Fragment fragmentLJJJJZI2 = getChildFragmentManager().LJJJJZI("pa_prompt_privacy_settings");
        if (fragmentLJJJJZI2 == null) {
            int iIntValue = ((Number) this.LLILLL.getValue()).intValue();
            int iNR = NR();
            String str = (String) this.LLILZIL.getValue();
            fragmentLJJJJZI2 = new PaPromptPrivacySettingsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("private_account_prompt", iIntValue);
            bundle.putInt("private_account_prompt_type", iNR);
            C786410Ut5.LJJJI("enter_position", str, bundle);
            fragmentLJJJJZI2.setArguments(bundle);
        }
        PR(fragmentLJJJJZI2, "pa_prompt_privacy_settings");
    }

    @Override // X.InterfaceC1243970iTb
    public final boolean onBackPressed() {
        C128Y c128yLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.tqy);
        C10B8 c10b8 = c128yLJJJJZ instanceof C10B8 ? (C10B8) c128yLJJJJZ : null;
        if (c10b8 != null && c10b8.onBackPressed()) {
            return true;
        }
        getChildFragmentManager().LJLLILLLL();
        return true;
    }

    @Override // X.InterfaceC1243970iTb
    public final void ke(AwS557S0100000_13 awS557S0100000_13) {
        this.LL = awS557S0100000_13;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(androidx.fragment.app.Fragment r7, java.lang.String r8) {
        /*
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.getChildFragmentManager()
            X.19EH r5 = r0.LJIIJ()
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L37
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            r4 = 1
            if (r0 != r4) goto L37
        L15:
            r3 = 2130837783(0x7f020117, float:1.728053E38)
            r2 = 2130837774(0x7f02010e, float:1.7280512E38)
            r1 = 2130837781(0x7f020115, float:1.7280526E38)
            r0 = 2130837776(0x7f020110, float:1.7280516E38)
            if (r4 == 0) goto L33
            r5.LJIJJLI(r2, r3, r0, r1)
        L26:
            r0 = 2131388996(0x7f0a6a44, float:1.8398523E38)
            r5.LJIJ(r0, r7, r8)
            r5.LJII(r8)
            r5.LJIIJ()
            return
        L33:
            r5.LJIJJLI(r0, r1, r2, r3)
            goto L26
        L37:
            r4 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptProcessFragment.PR(androidx.fragment.app.Fragment, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Fragment paPromptFragment;
        super.onViewCreated(view, bundle);
        if (((PaPromptViewModel) this.LLILLJJLI.getValue()).LLILZ) {
            str = "pa_prompt_introduce_for_existing_users";
        } else {
            str = "pa_prompt";
        }
        if (((PaPromptViewModel) this.LLILLJJLI.getValue()).LLILZ) {
            int iIntValue = ((Number) this.LLILLL.getValue()).intValue();
            int iNR = NR();
            String str2 = (String) this.LLILZIL.getValue();
            paPromptFragment = new PaPromptIntroduceFragmentForExistingUsers();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("private_account_prompt", iIntValue);
            bundle2.putInt("private_account_prompt_type", iNR);
            C786410Ut5.LJJJI("enter_position", str2, bundle2);
            paPromptFragment.setArguments(bundle2);
        } else {
            int iIntValue2 = ((Number) this.LLILLL.getValue()).intValue();
            int iNR2 = NR();
            String str3 = (String) this.LLILZIL.getValue();
            paPromptFragment = new PaPromptFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("private_account_prompt", iIntValue2);
            bundle3.putInt("private_account_prompt_type", iNR2);
            C786410Ut5.LJJJI("enter_position", str3, bundle3);
            paPromptFragment.setArguments(bundle3);
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.tqy, paPromptFragment, str);
        c19ehLJIIJ.LJIIJ();
    }
}
