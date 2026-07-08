package com.ss.android.ugc.aweme.live.livehostimpl.livereply;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.highlight.LiveRecordingPageRedesignSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveReplayListRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String strLJJIFFI = null;
        if (LiveRecordingPageRedesignSetting.INSTANCE.enable()) {
            if (str != null) {
                strLJJIFFI = u.LJJIFFI(str, "//webcast_replay_list", "//webcast_replay_list_v2", false);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strLJJIFFI);
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
        } else {
            if (str != null) {
                strLJJIFFI = u.LJJIFFI(str, "//webcast_replay_list", "//webcast_replay_list_v1", false);
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, strLJJIFFI);
            smartRouteBuildRoute2.withParam(bundle);
            smartRouteBuildRoute2.open();
        }
        return Boolean.TRUE;
    }
}
