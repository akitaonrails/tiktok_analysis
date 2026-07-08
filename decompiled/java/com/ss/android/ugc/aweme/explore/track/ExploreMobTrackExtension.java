package com.ss.android.ugc.aweme.explore.track;

import X.C13LQ;
import X.C15TA;
import X.C15WT;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreMobTrackExtension implements IExploreMobTrackExtension {
    public final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"video_play", "video_play_finish", "play_time", "click_comment_button", "post_comment", "like_comment", "close_comment", "share_video", "follow", "download", "favourite_video", "click_report", "enter_music_detail", "screen_shot", "comment_duration", "enter_graphic_detail", "graphic_detail_playtime", "multi_photo_slide", "pinch_zoom", "post_stay_time", "like", "dislike", "enter_personal_detail", "show_explore_card", "disappear_explore_card", "show_explore_card_accurate", "disappear_explore_card_accurate", "click_explore_card", "dislike_reason_submit", "enter_graphic_detail", "click_video_play", "ttexp_special_shaped_card_element_click"});
    public final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"show_explore_card_accurate", "disappear_explore_card_accurate", "click_comment_button", "post_comment", "like_comment", "close_comment", "comment_duration", "dislike_reason_submit", "enter_graphic_detail"});
    public final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"show_explore_card", "show_explore_card_accurate", "click_explore_card", "ttexp_special_shaped_card_element_click"});
    public final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"show_explore_card", "show_explore_card_accurate", "click_explore_card", "post_comment", "ttexp_special_shaped_card_element_click"});
    public final Set<String> LJ = C13LQ.LJLIIL(new String[]{"show_explore_card", "show_explore_card_accurate", "click_explore_card"});

    @Override // com.ss.android.ugc.aweme.explore.track.IExploreMobTrackExtension
    public final void LIZ(String str, Map<String, String> map) {
        String str2;
        String str3 = map.get("group_id");
        Map<String, String> mapLn = null;
        if (str3 != null) {
            mapLn = C15WT.LIZIZ.Ln(str3);
        }
        if (mapLn != null) {
            for (Map.Entry<String, String> entry : mapLn.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "show_comment_number")) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (this.LIZIZ.contains(str) && !map.containsKey("show_comment_number") && mapLn != null && (str2 = mapLn.get("show_comment_number")) != null) {
            map.put("show_comment_number", str2);
        }
        if (this.LIZJ.contains(str)) {
            C15TA.LIZ.getClass();
            map.put("enter_method", C15TA.LJIILL);
        }
        if (this.LIZLLL.contains(str)) {
            C15TA c15ta = C15TA.LIZ;
            c15ta.getClass();
            map.put("curr_page_enter_method", C15TA.LJIILL);
            c15ta.getClass();
            String str4 = C15TA.LJJIIJZLJL;
            if (str4 != null && str4.length() > 0) {
                map.put("curr_page_sub_enter_method", str4);
            }
        }
        if (this.LJ.contains(str)) {
            C15TA.LIZ.getClass();
            String str5 = C15TA.LJIJJ;
            if (str5.length() > 0) {
                map.put("subtab_enter_method", str5);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.track.IExploreMobTrackExtension
    public final boolean LIZIZ(String str, JSONObject jSONObject) {
        if (this.LIZ.contains(str) && Intrinsics.LJFF(jSONObject.optString("enter_from"), "homepage_explore")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.explore.track.IExploreMobTrackExtension
    public final void LIZJ(String str, JSONObject jSONObject) throws JSONException {
        boolean z;
        Object obj;
        String strOptString = jSONObject.optString("group_id");
        if (strOptString.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Map<String, String> mapLn = null;
        if (z) {
            mapLn = C15WT.LIZIZ.Ln(strOptString);
        }
        if (mapLn != null) {
            for (Map.Entry<String, String> entry : mapLn.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "show_comment_number")) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (this.LIZIZ.contains(str) && !jSONObject.has("show_comment_number") && mapLn != null && (obj = mapLn.get("show_comment_number")) != null) {
            jSONObject.put("show_comment_number", obj);
        }
        if (this.LIZJ.contains(str)) {
            C15TA.LIZ.getClass();
            jSONObject.put("enter_method", C15TA.LJIILL);
        }
        if (this.LIZLLL.contains(str)) {
            C15TA c15ta = C15TA.LIZ;
            c15ta.getClass();
            jSONObject.put("curr_page_enter_method", C15TA.LJIILL);
            c15ta.getClass();
            String str2 = C15TA.LJJIIJZLJL;
            if (str2 != null && str2.length() > 0) {
                jSONObject.put("curr_page_sub_enter_method", str2);
            }
        }
        if (this.LJ.contains(str)) {
            C15TA.LIZ.getClass();
            String str3 = C15TA.LJIJJ;
            if (str3.length() > 0) {
                jSONObject.put("subtab_enter_method", str3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.track.IExploreMobTrackExtension
    public final boolean LIZLLL(String str, Map<String, String> map) {
        if (this.LIZ.contains(str) && Intrinsics.LJFF(map.get("enter_from"), "homepage_explore")) {
            return true;
        }
        return false;
    }
}
