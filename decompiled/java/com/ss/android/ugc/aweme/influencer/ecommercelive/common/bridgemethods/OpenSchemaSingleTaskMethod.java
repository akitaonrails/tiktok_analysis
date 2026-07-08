package com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods;

import X.C1047200dME;
import X.C1051660dTQ;
import X.C1076820e80;
import X.C1243960iTa;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenSchemaSingleTaskMethod extends BaseBridgeMethod {
    public final String name;
    public static final C1076820e80 Companion = new Object() { // from class: X.0e80
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenSchemaSingleTaskMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openSingletonSchema";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
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
                if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(getContext(), "ecommerce_open_singleton_schema", true)) {
                    return;
                }
            }
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).openPublishPage(getContext(), intent);
        } else {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//bullet/single_task?intercept_page=show_window");
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
        interfaceC1019840ce6.onSuccess("Open singleton schema successful.");
    }
}
