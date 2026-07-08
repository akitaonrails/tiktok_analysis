package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell;

import X.C0PEM;
import X.C1255390im1;
import X.C1388190mED;
import X.C1929307h5;
import X.C19316810hi;
import X.C19316910hj;
import X.C19EG;
import X.C2015407uy;
import X.C2277881EDy;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.C848760XRi;
import X.DialogC1389620mGW;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes29.dex */
public final class SwitchAccountVM extends BaseCellSettingsVM<C2015407uy> {
    public static final /* synthetic */ int LL = 0;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2015407uy(2131829327, new C1929307h5(this), new AwS617S0100000_3(this, 73));
    }

    public final void vQ2(Context context, String str) {
        FragmentManager supportFragmentManager;
        String str2 = str;
        if (context == null) {
            return;
        }
        if (C848760XRi.LIZ().isEnabled && C19316810hi.LIZIZ().getBoolean("is_recovery_succeeded", false)) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLJ(R.string.txr);
            C786410Ut5.J4(dialogC1389620mGW);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C19316910hj(dialogC1389620mGW, null), 3);
            return;
        }
        if (str2 == null) {
            str2 = "settings_page";
        }
        C1255390im1 c1255390im1 = new C1255390im1(str2, "switch_account", null, null, null, null, 252);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        C2277881EDy.LIZIZ.showInChooseAccountBottomSheet(supportFragmentManager, c1255390im1, "choose_account_dialog", null, null, null);
    }
}
