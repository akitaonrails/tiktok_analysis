package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells;

import X.C1927007gi;
import X.C2013007ua;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2435609gY;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.Pair;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountDeletionVM extends BaseCellSettingsVM<C2013007ua> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2013007ua(2131837033, new C1927007gi(this), new AwS617S0100000_3(this, 7));
    }

    public final void vQ2(Context context) {
        C20684815ws.LJIILLIIL("enter_delete_account", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "settings_page"), new Pair("previous_page", "personal_homepage"), new Pair("enter_method", "click_button")));
        C2435609gY.LIZ(context);
    }
}
