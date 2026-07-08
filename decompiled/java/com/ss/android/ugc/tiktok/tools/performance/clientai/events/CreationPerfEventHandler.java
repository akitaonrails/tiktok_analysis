package com.ss.android.ugc.tiktok.tools.performance.clientai.events;

import X.C0BXW;
import X.C13LQ;
import X.C1510130pOt;
import X.InterfaceC1510030pOj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tools.performance.clientai.CreationFeatureRouter;
import java.util.Set;
import kotlin.jvm.internal.AwS614S0100000_35;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class CreationPerfEventHandler implements InterfaceC1510030pOj {
    public static final CreationPerfEventHandler INSTANCE = new CreationPerfEventHandler();
    public static final Set<String> events = C13LQ.LJLIIL(new String[]{"shoot", "shoot_exit", "draft_load", "enter_video_shoot_page", "record_video", "click_prop_entrance", "prop_click", "save_draft", "enter_video_edit_page", "enter_video_post_page", "performance_publish_click", "click_upload_entrance", "click_save_local_on_edit_page", "click_save_local_error", "publish_finish", "publish_fail", "post_page_back_to_edit", "tool_performance_record_first_frame", "tool_performance_video_preview", "tool_performance_video_record", "tool_performance_edit_first_frame", "album_import", "save_local_stage", "tool_performance_operation_cost_time", "tool_performance_publish_first_frame", "publish_page_cover_show", "publish_stuck", "tool_performance_edit_preview", "tool_performance_enter_prop_tab", "tool_performance_prop_apply_total", "capsule_ai_recommend_music_result", "draft_save", "app_kill_reason", "tool_performance_mixed_asset_apply_total"});
    public static final int $stable = 8;

    @Override // X.InterfaceC1510030pOj
    public Set<String> events() {
        return events;
    }

    @Override // X.InterfaceC1510030pOj
    public void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        JSONObject jSONObject;
        if (!C0BXW.LIZ()) {
            return;
        }
        try {
            Object obj = c1510130pOt.LIZIZ;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            CreationFeatureRouter.INSTANCE.handleEvent(str, new AwS614S0100000_35(jSONObject, 123));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
