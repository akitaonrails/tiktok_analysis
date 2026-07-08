package com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods;

import X.C1047200dME;
import X.C1243960iTa;
import X.C786410Ut5;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenSchemaSingleTaskMethodCrossPlatform extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenSchemaSingleTaskMethodCrossPlatform(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString = jSONObject.optString("schema");
        String strOptString2 = jSONObject.optString("page");
        int iOptInt = jSONObject.optInt("is_back");
        boolean z = false;
        if (Intrinsics.LJFF(strOptString2, "AWEVideoNewPublishViewController")) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            int length = activityStack.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Activity activity = activityStack[i];
                    ICreativePageService iCreativePageService = (ICreativePageService) PluggableExtentionKt.pluggableSpi$default(ICreativePageService.class, false, false, false, 14, null);
                    if (iCreativePageService != null && iCreativePageService.isPublishPage(activity)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJJIZ("No video publish activity in stack.", 1, strOptString2, strOptString, C786410Ut5.J3(jSONObject));
                    C1243960iTa.LIZ(jSONObject);
                    break;
                }
            }
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (SettingsManager.LIZ("ec_creative_tools_plugin_entry_intercept_enabled", true)) {
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(getActContext(), "ecommerce_open_singleton_schema_cross_platform", true)) {
                    return;
                }
            }
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).openPublishPage(getActContext(), intent);
        } else {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActContext(), "//bullet/single_task?intercept_page=show_window");
            Intent intentBuildIntent = smartRouteBuildRoute.buildIntent();
            if (intentBuildIntent != null) {
                if (iOptInt == 1) {
                    z = true;
                }
                intentBuildIntent.putExtra("is_clear_top", z);
            } else {
                intentBuildIntent = null;
            }
            smartRouteBuildRoute.withParam(intentBuildIntent);
            smartRouteBuildRoute.withParam(C1047200dME.LIZ(strOptString));
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.addFlags(268435456);
            smartRouteBuildRoute.open();
        }
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJJIZ(null, null, strOptString2, strOptString, C786410Ut5.J3(jSONObject));
        interfaceC1041760dDS.onSuccess("Open singleton schema successful.");
    }
}
