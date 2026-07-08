package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1927307gl;
import X.C2014207um;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class BackgroundAudioVM extends BaseCellSettingsVM<C2014207um> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2014207um(2131826772, new C1927307gl(this), new AwS617S0100000_3(this, 63));
    }

    public final void vQ2(Context context) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        C20684815ws.LJIILLIIL("click_background_audio", c2344009Gk.LIZ);
        SmartRouter.buildRoute(context, "aweme://setting/background_audio").open();
    }
}
