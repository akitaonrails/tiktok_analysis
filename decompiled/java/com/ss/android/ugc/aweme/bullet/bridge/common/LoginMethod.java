package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C0XQ7;
import X.C0XQS;
import X.C0XTT;
import X.C1051660dTQ;
import X.C1062710dlF;
import X.C1388190mED;
import X.C1879300z0K;
import X.C19334710kb;
import X.C786410Ut5;
import X.EnumC1054630dYD;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class LoginMethod extends BaseBridgeMethod {
    public static final C1879300z0K Companion = new Object() { // from class: X.0z0K
    };
    public final boolean enableMultiAccountLogin;
    public final IMultiAccountService multiAccountService;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void sendLoginCanceledEvent() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "loginCanceled");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject.put("args", jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        sendEvent("H5_nativeEvent", jSONObject);
    }

    public boolean getEnableMultiAccountLogin() {
        return this.enableMultiAccountLogin;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public LoginMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.multiAccountService = (IMultiAccountService) PluggableExtentionKt.pluggableSpi$default(IMultiAccountService.class, false, false, false, 14, null);
        this.name = "login";
    }

    private final C0XTT findRightPlatformInfo(String str) {
        for (C0XTT c0xtt : C0XQ7.LIZJ().getAllSupportedLoginPlatform()) {
            if (TextUtils.equals(str, c0xtt.LIZ)) {
                return c0xtt;
            }
        }
        return null;
    }

    public final void loginCancelCallback(InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (getHybridType() == EnumC1054630dYD.LYNX) {
            interfaceC1019840ce6.onSuccess(jSONObject);
        } else {
            interfaceC1019840ce6.LIZIZ(jSONObject);
        }
        sendLoginCanceledEvent();
    }

    public final void loginSuccessCallback(InterfaceC1019840ce6 interfaceC1019840ce6) {
        JSONObject jSONObject = new JSONObject();
        try {
            C1062710dlF.LJIJI(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (getHybridType() == EnumC1054630dYD.LYNX) {
            interfaceC1019840ce6.onSuccess(jSONObject);
        } else {
            interfaceC1019840ce6.LIZIZ(jSONObject);
        }
    }

    private final void loginErrorCallback(InterfaceC1019840ce6 interfaceC1019840ce6, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 0);
        jSONObject.put("msg", str);
        interfaceC1019840ce6.LIZIZ(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        Activity activityLIZ;
        C0XTT c0xttFindRightPlatformInfo;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            if (!getEnableMultiAccountLogin() && C0XQ7.LJFF().isLogin()) {
                loginSuccessCallback(interfaceC1019840ce6);
                return;
            }
            IMultiAccountService iMultiAccountService = this.multiAccountService;
            if (iMultiAccountService != null && iMultiAccountService.LIZLLL()) {
                loginErrorCallback(interfaceC1019840ce6, this.multiAccountService.LJ());
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
            if (!TextUtils.isEmpty(strOptString4) && (c0xttFindRightPlatformInfo = findRightPlatformInfo(strOptString4)) != null) {
                C786410Ut5.LJJJI("setting_page", "feedback_faq_list_page", bundle);
                bundle.putBoolean("is_login", TextUtils.equals(getName(), "loginWithPlatform"));
                C786410Ut5.LJJJI("jsb_parmas", C786410Ut5.J3(jSONObject), bundle);
                bundle.putBoolean("js_bridge_initiated", true);
                ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = activityLIZ;
                c0xqs.LIZIZ = strOptString2;
                c0xqs.LIZJ = strOptString3;
                c0xqs.LIZLLL = bundle;
                c0xqs.LJ = new C19334710kb(this, interfaceC1019840ce6, 1);
                iLoginServiceLIZJ.loginByPlatform(c0xqs.LIZ(), c0xttFindRightPlatformInfo);
                return;
            }
            ILoginService iLoginServiceLIZJ2 = C0XQ7.LIZJ();
            C0XQS c0xqs2 = new C0XQS();
            c0xqs2.LIZ = activityLIZ;
            c0xqs2.LIZIZ = strOptString2;
            c0xqs2.LIZJ = strOptString3;
            c0xqs2.LIZLLL = bundle;
            c0xqs2.LJ = new C19334710kb(this, interfaceC1019840ce6, 2);
            iLoginServiceLIZJ2.showLoginAndRegisterView(c0xqs2.LIZ());
        }
    }
}
