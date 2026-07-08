package com.ss.android.ugc.aweme.account.login.v2.routing;

import X.AbstractC854370XfP;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVY;
import X.C1388190mED;
import X.C1954807lC;
import X.C2095008Iq;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.C851380Xaa;
import X.C852560XcU;
import X.C853870Xeb;
import X.C853880Xec;
import X.C853910Xef;
import X.DialogC1389620mGW;
import X.EnumC1237810iJf;
import X.EnumC1237820iJg;
import X.EnumC852630Xcb;
import X.EnumC852660Xce;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.model.Block3pLogoutDetailDTO;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS7S2300000_13;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class CommonFlowRouteAction implements IRouteAction {
    public final IAccountService LL;
    public final IBindService LLILLJJLI;

    public CommonFlowRouteAction() {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LL = iAccountService;
        this.LLILLJJLI = iAccountService.LJII();
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String string = bundle.getString("enter_from");
        String string2 = bundle.getString("enter_method");
        bundle.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_FORCE.getValue());
        bundle.putInt("phone_number_source", EnumC1237820iJg.GENERAL_POPUP_FORCE.getValue());
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            if (a0.LJJIIZI(str, "aweme://account/change/email", false)) {
                LIZ(activityLIZ, bundle, EnumC852630Xcb.CHANGE_EMAIL, new AwS7S2300000_13(this, activityLIZ, string, string2, bundle, 0));
            } else if (a0.LJJIIZI(str, "aweme://account/change/phone", false)) {
                bundle.putBoolean("is_changing", true);
                LIZ(activityLIZ, bundle, EnumC852630Xcb.CHANGE_MOBILE, new AwS7S2300000_13(this, activityLIZ, string, string2, bundle, 1));
            } else if (a0.LJJIIZI(str, "aweme://account/verify/email", false) || a0.LJJIIZI(str, "aweme://account/add/non1p_email", false)) {
                bundle.putBoolean("pii_clickable", true);
                LIZIZ(activityLIZ, EnumC852660Xce.BIND_EMAIL, bundle, Block3pLogoutDetailDTO.PiiType.EMAIL);
            } else if (a0.LJJIIZI(str, "aweme://account/add/non1p_phone", false)) {
                bundle.putBoolean("pii_clickable", true);
                LIZIZ(activityLIZ, EnumC852660Xce.BIND_PHONE, bundle, Block3pLogoutDetailDTO.PiiType.MOBILE);
            } else if (a0.LJJIIZI(str, "aweme://account/add/phone", false)) {
                LIZIZ(activityLIZ, EnumC852660Xce.BIND_PHONE, bundle, Block3pLogoutDetailDTO.PiiType.NONE);
            } else if (a0.LJJIIZI(str, "aweme://account/change_password", false)) {
                C0XQ7.LJ();
                C0XQ7.LIZ.LJIIJJI().changePassword(activityLIZ, string, "password_click", new Bundle(), null);
            }
        }
        return Boolean.TRUE;
    }

    public static void LIZ(Activity activity, Bundle bundle, EnumC852630Xcb enumC852630Xcb, Function1 function1) {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
        C786410Ut5.J4(dialogC1389620mGW);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C852560XcU(enumC852630Xcb, dialogC1389620mGW, bundle, function1, activity, null), 3);
    }

    public static void LIZIZ(Activity activity, EnumC852660Xce enumC852660Xce, Bundle bundle, Block3pLogoutDetailDTO.PiiType piiType) {
        AbstractC854370XfP c853870Xeb;
        int iIntValue;
        Integer numLJIIJJI;
        int i = C0XVY.LIZ[piiType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c853870Xeb = new C853910Xef();
                } else {
                    throw new C1954807lC();
                }
            } else {
                c853870Xeb = new C853880Xec();
            }
        } else {
            String string = bundle.getString("source");
            if (string == null) {
                string = "";
            }
            c853870Xeb = new C853870Xeb(string);
        }
        C786410Ut5.LJJIZ(bundle, "pii_type", piiType);
        String string2 = bundle.getString("non1p_binding_type");
        if (string2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string2)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        bundle.putInt("non1p_binding_type", iIntValue);
        bundle.putBoolean("prevent_back", true);
        String str = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZIZ(activity, c853870Xeb, enumC852660Xce, bundle, null);
    }
}
