package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_improve_host_keyword_schema_seven_percent")
public final class LiveCommentBlockUrlSettingSevenPercent {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_creator_tools%2Fpages%2Fcomment-host-keyword-faq%2Ftemplate.js&hide_loading=0&gravity=bottom&height=70%25&radius=8&bdhm_pid=comment-hot-keyword-faq&bdhm_bid=tiktok_live_fundamental_creator_tools&launch_mode=navigate&starling_fallback=1&starling_channel=3588__38137&show_mask=1&mask_bg_color=00000080";
    public static final LiveCommentBlockUrlSettingSevenPercent INSTANCE = new LiveCommentBlockUrlSettingSevenPercent();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_improve_host_keyword_schema_seven_percent", DEFAULT);
        return stringValue.length() == 0 ? "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_creator_tools%2Fpages%2Fcomment-host-keyword-faq%2Ftemplate.js&hide_loading=0&gravity=bottom&height=70%25&radius=8&bdhm_pid=comment-hot-keyword-faq&bdhm_bid=tiktok_live_fundamental_creator_tools&launch_mode=navigate&starling_fallback=1&starling_channel=3588__38137&show_mask=1&mask_bg_color=00000080" : stringValue;
    }
}
