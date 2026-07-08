package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb;

import X.C1000150c8L;
import X.C1035300d32;
import X.C1035310d33;
import X.C1051660dTQ;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenHybridMethod extends BaseBridgeMethod {
    public static final C1035310d33 Companion = new Object() { // from class: X.0d33
    };
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenHybridMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openHybrid";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        boolean z;
        String strOptString = jSONObject.optString("schema");
        if (jSONObject.optInt("is_ad") == 1) {
            z = true;
        } else {
            z = false;
        }
        String strOptString2 = jSONObject.optString("param");
        int i = C1035300d32.LIZ[getHybridType().ordinal()];
        if (i != 1 && i != 2) {
            interfaceC1019840ce6.LIZ(-1, "The container is not any of these three - Web/RN/Lynx");
        } else {
            openHybrid(strOptString, z, strOptString2);
            interfaceC1019840ce6.LIZJ(1, null, null);
        }
    }

    private final void openHybrid(String str, boolean z, String str2) {
        Uri.Builder builderBuildUpon;
        String strK0;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (str == null) {
            return;
        }
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return;
        }
        Bundle bundle = new Bundle();
        Uri uri = UriProtector.parse(str);
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "access_key")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
            C786410Ut5.LJJJI("access_key", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
        }
        if (z) {
            ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).getAdPackageBundleName();
            C786410Ut5.LJJJI("bundle_extra_param", str2, bundle);
        }
        Uri uri2 = UriProtector.parse(str);
        if (uri2 != null && (builderBuildUpon = uri2.buildUpon()) != null) {
            if (z) {
                IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
                if (iAdSparkUtilsLJFF != null) {
                    String string = builderBuildUpon.toString();
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService != null) {
                        strK0 = iAdLandPagePreloadService.K0("lynx_feed");
                    } else {
                        strK0 = null;
                    }
                    iAdSparkUtilsLJFF.LIZ(context, string, bundle, strK0, C1000150c8L.LIZIZ(), false, null, null, AFwS252S0000000_16.get$arr$(112));
                    return;
                }
                return;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, builderBuildUpon.toString());
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
        }
    }
}
