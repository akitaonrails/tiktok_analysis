package com.ss.android.ugc.aweme.aigc.aiplayground.navigate;

import X.AbstractC1950107kR;
import X.C098200Yq;
import X.C189200o6;
import X.C1950707kX;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class AIVideoToolLinkAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        map.put("is_ai_video_tool_deeplink", Boolean.TRUE);
        map.put(Scene.SCENE_SERVICE, "ai_video_tool");
        return new Pair<>("//studio/ai_video_tool", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null && !iDeepLinkService.isAppHot()) {
            try {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
                smartRouteBuildRoute.withParam("is_ai_video_tool_deeplink", true);
                smartRouteBuildRoute.open();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
