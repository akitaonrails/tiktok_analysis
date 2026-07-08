package com.ss.android.ugc.tools.common.experiment;

import X.C09CT;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatDomainSettings {

    @C09CT("chat_avatar")
    public final String aiChatAvatar;

    @C09CT("default_prompt_uri")
    public final String defaultPromptUri;

    @C09CT("guide_image_url_sets")
    public final Map<String, String> guideImageUrls;

    @C09CT("guide_video_url")
    public final String guideVideoUrl;

    @C09CT("guide_video_url_sets")
    public final Map<String, String> guideVideoUrls;

    public AiChatDomainSettings() {
        HashMap map = new HashMap();
        map.put("comment", "https://tosv-sg.tiktok-row.org/obj/tiktok-ic-aigc-sg/img_airemiximage_guide.jpg");
        this("https://lf16-effectcdn-sg.tiktokcdn.com/obj/ies.fe.effect.alisg/VP_guide_panel.mp4", "ies.fe.effect.alisg/visual_poet_action_bar_others.webp", "#", map, null);
    }

    public AiChatDomainSettings(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        this.guideVideoUrl = str;
        this.defaultPromptUri = str2;
        this.aiChatAvatar = str3;
        this.guideImageUrls = map;
        this.guideVideoUrls = map2;
    }
}
