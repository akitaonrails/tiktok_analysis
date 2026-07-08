package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C123100dR;
import X.C1669660tYC;
import X.C1926507gd;
import X.C19328810je;
import X.C2016007v4;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC2174471A8f;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS18S0010000_3;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LanguageVM extends BaseCellSettingsVM<C2016007v4> {
    public final String LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2016007v4(C1669660tYC.LIZIZ, C1669660tYC.LIZ, 2131836405, null, null, null, new C1926507gd(this), new AwS617S0100000_3(this, 57), false);
    }

    public LanguageVM(String str) {
        this.LL = str;
        if (str != null) {
            if (Intrinsics.LJFF("translate_tts", str) || Intrinsics.LJFF("translate_subtitle", str)) {
                setState(new AwS18S0010000_3(true, 5));
            }
        }
    }

    public final void vQ2(Context context, String str) {
        C19328810je.LIZ(EnumC2174471A8f.LANGUAGE.getKey());
        if (C123100dR.LIZ(str)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
            c2344009Gk.LJIIIIZZ("enter_method", str);
            C20684815ws.LJIILLIIL("enter_language_setting", c2344009Gk.LIZ);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//display/caption/setting_compose");
            smartRouteBuildRoute.withParam("enter_method", str);
            smartRouteBuildRoute.open();
            return;
        }
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//display/caption/setting_compose");
        smartRouteBuildRoute2.withParam("enter_method", "setting_page");
        smartRouteBuildRoute2.open();
    }
}
