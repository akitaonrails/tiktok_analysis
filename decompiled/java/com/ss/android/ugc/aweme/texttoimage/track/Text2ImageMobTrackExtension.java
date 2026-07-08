package com.ss.android.ugc.aweme.texttoimage.track;

import X.C13LQ;
import X.C1533950q1J;
import X.C572310McX;
import X.C740740T3w;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class Text2ImageMobTrackExtension implements IText2ImageMobTrackExtension {
    public final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"save_draft", "publish", "multi_anchor_entrance_show", "multi_anchor_entrance_click", "enter_multi_anchor_detail", "like", "like_cancel", "follow", "click_comment_button", "post_comment", "dislike", "video_play", "play_time", "video_play_finish", "enter_personal_detail", "favourite_video", "cancel_favourite_video", "video_pause", "enter_music_detail", "enter_tag_detail", "click_report", "post_stay_time", "enter_graphic_detail", "graphic_detail_playtime", "graphic_detail_finish", "pinch_zoom", "multi_photo_slide", "screen_shot", "comment_duration", "like_comment", "share_video", "download", "enter_video_edit_page"});

    @Override // com.ss.android.ugc.aweme.texttoimage.track.IText2ImageMobTrackExtension
    public final boolean LIZ(String str) {
        return this.LIZ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.track.IText2ImageMobTrackExtension
    public final void LIZIZ(Map map) {
        IAwemeService iAwemeService;
        Aweme awemeLLILZ;
        String str = (String) map.get("group_id");
        if (str != null && (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) != null && (awemeLLILZ = iAwemeService.LLILZ(str)) != null) {
            C572310McX.LIZIZ(awemeLLILZ, map);
        }
        C572310McX.LIZIZ(C740740T3w.LJ(), map);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.track.IText2ImageMobTrackExtension
    public final void LIZJ(JSONObject jSONObject) {
        Aweme awemeLLILZ;
        String strOptString = jSONObject.optString("group_id");
        if (C1533950q1J.LJ(strOptString)) {
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(strOptString)) != null) {
                C572310McX.LIZIZ(awemeLLILZ, jSONObject);
                return;
            }
            return;
        }
        C572310McX.LIZIZ(C740740T3w.LJ(), jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.track.IText2ImageMobTrackExtension
    public final boolean LIZLLL(String str) {
        return this.LIZ.contains(str);
    }
}
