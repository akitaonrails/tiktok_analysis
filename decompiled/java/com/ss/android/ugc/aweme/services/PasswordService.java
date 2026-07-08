package com.ss.android.ugc.aweme.services;

import X.C0XQ5;
import X.C0XTR;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C851380Xaa;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.crash.Npth;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class PasswordService extends BasePasswordService {
    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private void reportBindingError(Object obj, int i, String str) {
        HashMap map = new HashMap();
        map.put("data1", obj.toString());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        map.put("action", C2188811AlT.LIZIZ(sbLIZ));
        Npth.reportBizException("AccountBindCallbackTypeError", new Throwable(str), str, (Map<String, String>) map, true);
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.InterfaceC1136104cR
    public void setPassword(Activity activity, Bundle bundle, C0XTR c0xtr) {
        String str = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.CREATE_PASSWORD_FOR_PHONE, EnumC852660Xce.CHANGE_PASSWORD, bundle, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.InterfaceC1136104cR
    public void verifyPassword(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        super.verifyPassword(activity, str, bundle, c0xtr);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/login/signup_or_login");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.VERIFY_PASSWORD.getValue());
        if (bundle != null) {
            smartRouteBuildRoute.withParam(bundle);
        }
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.InterfaceC1136104cR
    public void changePassword(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        if (bundle2.getString("page") == null) {
            C786410Ut5.LJJJI("page", "change_password", bundle2);
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        if (C0XQ5.LIZ().LIZ()) {
            super.changePassword(activity, str, str2, bundle2, c0xtr);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/login/signup_or_login");
            smartRouteBuildRoute.withParam(bundle2);
            smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.CHANGE_PASSWORD_FOR_CHILDREN.getValue());
            smartRouteBuildRoute.open();
            return;
        }
        bundle2.putBoolean("from_changePwd", true);
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.CHANGE_PASSWORD, EnumC852660Xce.CHANGE_PASSWORD, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.InterfaceC1136104cR
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_from", str2, bundle2);
        }
        if (!TextUtils.isEmpty(str3)) {
            C786410Ut5.LJJJI("enter_method", str3, bundle2);
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("platform", str, bundle2);
        }
        String str4 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.CHANGE_PASSWORD, EnumC852660Xce.CHANGE_PASSWORD, bundle2, c0xtr, null);
    }
}
