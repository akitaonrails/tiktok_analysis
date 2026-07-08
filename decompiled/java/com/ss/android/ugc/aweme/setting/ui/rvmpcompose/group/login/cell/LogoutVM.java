package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell;

import X.AbstractC848400XPy;
import X.C036E;
import X.C0SY5;
import X.C0XQ7;
import X.C1233040iBy;
import X.C1239530iMR;
import X.C1247510iZJ;
import X.C1388190mED;
import X.C1390850mIV;
import X.C14EU;
import X.C1929007h2;
import X.C19EG;
import X.C2015307ux;
import X.C2019607ve;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C622680Oba;
import X.C785410UrT;
import X.DialogC1389620mGW;
import X.InterfaceC0148002o;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AwS617S0100000_3;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class LogoutVM extends BaseCellSettingsVM<C2015307ux> {
    public static DialogC1389620mGW LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2015307ux(2131836850, new C1929007h2(this), new AwS617S0100000_3(this, 72));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1239530iMR c1239530iMR) {
        DialogC1389620mGW dialogC1389620mGW = LL;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        LL = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogoutSettingsCell: ");
        sbLIZ.append(event);
        sbLIZ.append(" | source: ");
        sbLIZ.append(lifecycleOwner);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2019607ve.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C622680Oba.LIZLLL(this);
                return;
            }
            return;
        }
        C622680Oba.LIZJ(this);
    }

    public final void vQ2(Context context, String str) {
        Lifecycle.State currentState;
        FragmentManager supportFragmentManager;
        LifecycleOwner lifecycleOwnerLIZIZ;
        Lifecycle lifecycle;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("params_for_special", "uc_login");
        c2344009Gk.LJIIIIZZ("uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C20684815ws.LJIILLIIL("uc_user_logout_click", c2344009Gk.LIZ);
        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isMainCameraPublishingOrStoryCameraPublishing()) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if (context != null && (lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context)) != null && (lifecycle = lifecycleOwnerLIZIZ.getLifecycle()) != null) {
                        currentState = lifecycle.getCurrentState();
                    } else {
                        currentState = null;
                    }
                    if (currentState != Lifecycle.State.RESUMED) {
                        return;
                    }
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", str);
                    c2344009Gk2.LJIIIIZZ("enter_method", "logout_page");
                    C20684815ws.LJIILLIIL("log_out_panel_show", c2344009Gk2.LIZ);
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        C1390850mIV c1390850mIV = new C1390850mIV();
                        c1390850mIV.LIZ.LLJJIJI = context.getString(2131821823);
                        ArrayList arrayList = new ArrayList();
                        if (C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
                            C1247510iZJ c1247510iZJ = new C1247510iZJ();
                            c1247510iZJ.LIZ = context.getString(2131829327);
                            c1247510iZJ.LJ = new ACListenerS154S0100000_19(context, 131);
                            arrayList.add(c1247510iZJ);
                        }
                        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                        c1247510iZJ2.LIZ = context.getString(2131836850);
                        c1247510iZJ2.LIZJ = 1;
                        c1247510iZJ2.LJ = new ACListenerS154S0100000_19(context, 132);
                        arrayList.add(c1247510iZJ2);
                        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList.toArray(new C1247510iZJ[0]);
                        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
                        c1390850mIV.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.0iMS
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                C2082608Dw.LIZ(0);
                            }
                        };
                        c1390850mIV.LIZJ().show(supportFragmentManager, "logout_dialog_with_switch_account");
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
            return;
        }
        C1233040iBy c1233040iBy2 = new C1233040iBy(context);
        c1233040iBy2.LIZIZ(2131845616);
        c1233040iBy2.LIZLLL();
    }
}
