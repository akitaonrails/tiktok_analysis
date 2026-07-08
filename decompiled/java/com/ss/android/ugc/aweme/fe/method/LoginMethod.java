package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C0XTT;
import X.C1062710dlF;
import X.C19334710kb;
import X.C786410Ut5;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class LoginMethod extends BaseCommonJavaMethod {
    public final IMultiAccountService LLILLL;
    public final boolean LLILZ;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static void LIZIZ(InterfaceC1041760dDS interfaceC1041760dDS) {
        JSONObject jSONObject = new JSONObject();
        try {
            C1062710dlF.LJIJI(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZIZ(jSONObject);
        }
    }

    public final void LIZ(InterfaceC1041760dDS interfaceC1041760dDS) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZIZ(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "loginCanceled");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            jSONObject2.put("args", jSONObject3);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        sendEvent("H5_nativeEvent", jSONObject2, 3);
    }

    public LoginMethod(IESJsBridge iESJsBridge, boolean z) {
        super(iESJsBridge);
        this.LLILLL = (IMultiAccountService) PluggableExtentionKt.pluggableSpi$default(IMultiAccountService.class, false, false, false, 14, null);
        this.LLILZ = z;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws JSONException {
        Activity activity;
        Context actContext = getActContext();
        if (!(actContext instanceof Activity) || (activity = (Activity) actContext) == null || jSONObject == null) {
            return;
        }
        if (!this.LLILZ && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            LIZIZ(interfaceC1041760dDS);
            return;
        }
        IMultiAccountService iMultiAccountService = this.LLILLL;
        if (iMultiAccountService != null && iMultiAccountService.LIZLLL()) {
            String strLJ = this.LLILLL.LJ();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", false);
            jSONObject2.put("code", 0);
            jSONObject2.put("msg", strLJ);
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZIZ(jSONObject2);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        String strOptString = jSONObject.optString("after_login_schema", "");
        if (strOptString.length() > 0) {
            C786410Ut5.LJJJI("after_login_schema", strOptString, bundle);
        }
        String strOptString2 = jSONObject.optString("enter_from", "h5");
        String strOptString3 = jSONObject.optString("enter_method", "");
        String strOptString4 = jSONObject.optString("platform", "");
        if (!TextUtils.isEmpty(strOptString4)) {
            for (C0XTT c0xtt : C0XQ7.LIZJ().getAllSupportedLoginPlatform()) {
                if (TextUtils.equals(strOptString4, c0xtt.LIZ)) {
                    C786410Ut5.LJJJI("setting_page", "feedback_faq_list_page", bundle);
                    bundle.putBoolean("is_login", this.LLILZ);
                    C786410Ut5.LJJJI("jsb_parmas", C786410Ut5.J3(jSONObject), bundle);
                    bundle.putBoolean("js_bridge_initiated", true);
                    ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
                    C0XQS c0xqs = new C0XQS();
                    c0xqs.LIZ = activity;
                    c0xqs.LIZIZ = strOptString2;
                    c0xqs.LIZJ = strOptString3;
                    c0xqs.LIZLLL = bundle;
                    c0xqs.LJ = new C19334710kb(this, interfaceC1041760dDS, 3);
                    iLoginServiceLIZJ.loginByPlatform(new C0XQT(c0xqs), c0xtt);
                    return;
                }
            }
        }
        ILoginService iLoginServiceLIZJ2 = C0XQ7.LIZJ();
        C0XQS c0xqs2 = new C0XQS();
        c0xqs2.LIZ = activity;
        c0xqs2.LIZIZ = strOptString2;
        c0xqs2.LIZJ = strOptString3;
        c0xqs2.LIZLLL = bundle;
        c0xqs2.LJ = new C19334710kb(this, interfaceC1041760dDS, 4);
        iLoginServiceLIZJ2.showLoginAndRegisterView(new C0XQT(c0xqs2));
    }
}
