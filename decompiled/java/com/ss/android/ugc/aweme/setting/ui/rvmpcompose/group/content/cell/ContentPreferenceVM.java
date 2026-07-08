package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1070560dxu;
import X.C14YX;
import X.C15YK;
import X.C1929207h4;
import X.C2015607v0;
import X.C20684815ws;
import X.C2344009Gk;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC20537615Xy;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContentPreferenceVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes31.dex */
public final class ContentPreferenceVM extends BaseCellSettingsVM<C2015607v0> {
    public static DialogC1389620mGW LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2015607v0(new C1929207h4(this), new AwS617S0100000_3(this, 64));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C14YX.LIZ();
        super.onCleared();
    }

    public static void vQ2(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://contentpreference");
        smartRouteBuildRoute.withParam("enter_from", "settings_page");
        smartRouteBuildRoute.open();
    }

    public final void wQ2(final Context context, String str) {
        String str2;
        String str3;
        if (context != null) {
            final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            LL = dialogC1389620mGW;
            C786410Ut5.J4(dialogC1389620mGW);
            C1070560dxu.LIZ.getClass();
            if (ComplianceServiceProvider.LJIIJJI().LIZIZ() == EnumC20537615Xy.CHILD) {
                str2 = "teen";
            } else if (ComplianceServiceProvider.LJIIJJI().LIZIZ() == EnumC20537615Xy.PARENT) {
                str2 = "parent";
            } else {
                str2 = "unknown";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("previous_page", "settings_page");
            c2344009Gk.LJIIIIZZ("enter_method", "click_button");
            c2344009Gk.LJIIIIZZ("role", str2);
            c2344009Gk.LJIIIIZZ("entry_point", "setting_privacy");
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("login_type", str3);
            C20684815ws.LJIILLIIL("enter_content_preference", c2344009Gk.LIZ);
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                ComplianceServiceProvider.LJIL().LJJIJL(new C15YK() { // from class: X.14bf
                    @Override // X.C15YK
                    public final void onSuccess() {
                        if (dialogC1389620mGW.isShowing()) {
                            C786410Ut5.LJIIJ(dialogC1389620mGW);
                        }
                        ContentPreferenceVM contentPreferenceVM = this;
                        Context context2 = context;
                        contentPreferenceVM.getClass();
                        ContentPreferenceVM.vQ2(context2);
                    }

                    @Override // X.C15YK
                    public final void onFailed(Exception exc) {
                        if (dialogC1389620mGW.isShowing()) {
                            C786410Ut5.LJIIJ(dialogC1389620mGW);
                        }
                        ContentPreferenceVM contentPreferenceVM = this;
                        Context context2 = context;
                        contentPreferenceVM.getClass();
                        ContentPreferenceVM.vQ2(context2);
                    }
                }, "");
                return;
            }
            if (dialogC1389620mGW.isShowing()) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            vQ2(context);
        }
    }
}
