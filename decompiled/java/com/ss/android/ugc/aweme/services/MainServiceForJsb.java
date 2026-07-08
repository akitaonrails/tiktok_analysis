package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C0CQT;
import X.C0XQ7;
import X.C1BYN;
import X.C2188811AlT;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.sdk.webview.di.IMainServiceForJsb;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class MainServiceForJsb implements IMainServiceForJsb {
    public static final String JS_SDK_CONFIG_URL;

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public String getSSLocalScheme() {
        return "sslocal";
    }

    static {
        String str = C0CQT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZ);
        sbLIZ.append("/client_auth/js_sdk/config/v1/");
        JS_SDK_CONFIG_URL = C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getPlayNameMobile() {
        return C1BYN.LIZIZ.LIZIZ();
    }

    public boolean hasPlatformBinded() {
        return C1BYN.LIZIZ.LIZ();
    }

    public long getUserId() {
        return CastLongProtector.parseLong(C0XQ7.LJFF().getCurUserId());
    }

    public boolean isLogin() {
        return C0XQ7.LJFF().isLogin();
    }

    public String getJSSDKConfigUrl() {
        return JS_SDK_CONFIG_URL;
    }

    public static IMainServiceForJsb createIMainServiceForJsbbyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IMainServiceForJsb.class, z);
        if (objLIZ != null) {
            return (IMainServiceForJsb) objLIZ;
        }
        if (C04TD.A4 == null) {
            synchronized (IMainServiceForJsb.class) {
                if (C04TD.A4 == null) {
                    C04TD.A4 = new MainServiceForJsb();
                }
            }
        }
        return C04TD.A4;
    }

    public boolean isApiSuccess(JSONObject jSONObject) {
        if (jSONObject != null && "success".equals(jSONObject.optString("message"))) {
            return true;
        }
        return false;
    }

    public boolean isBrowserActivity(Context context) {
        return CrossPlatformActivity.class.isInstance(context);
    }

    public boolean isPlatformBinded(String str) {
        return C1BYN.LIZIZ.LIZJ(str);
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public void startAdsAppActivity(Activity activity, String str) {
        ((IMainService) ServiceManager.get().getService(IMainService.class)).startAdsAppActivity(activity, str, "");
    }
}
