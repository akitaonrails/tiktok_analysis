package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1927507gn;
import X.C19328810je;
import X.C2014507up;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC2174471A8f;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class FavoriteCellVM extends BaseCellSettingsVM<C2014507up> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2014507up(Integer.valueOf(R.string.lxm), new C1927507gn(this), new AwS617S0100000_3(this, 71));
    }

    public final void vQ2(Context context) {
        C19328810je.LIZ(EnumC2174471A8f.FAVORITE_SETTINGS.getKey());
        SmartRouter.buildRoute(context, "//setting/favorite").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        C20684815ws.LJIILLIIL("enter_settings_favorite", c2344009Gk.LIZ);
    }
}
