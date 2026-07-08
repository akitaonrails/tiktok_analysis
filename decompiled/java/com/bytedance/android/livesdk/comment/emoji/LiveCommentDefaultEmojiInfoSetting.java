package com.bytedance.android.livesdk.comment.emoji;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_default_emoji_info")
public final class LiveCommentDefaultEmojiInfoSetting {
    public static final LiveCommentDefaultEmojiInfoSetting INSTANCE = new LiveCommentDefaultEmojiInfoSetting();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJIIIIZZ(new Pair("[rockyserious]", "rockyserious.webp"), new Pair("[rockyloveit]", "rockyloveit.webp"), new Pair("[rockyproud]", "rockyproud.webp"), new Pair("[rockycool]", "rockycool.webp"), new Pair("[rosiedislike]", "rockyloveit.webp"), new Pair("[rosiekisskiss]", "rosiekisskiss.webp"), new Pair("[rosieawkward]", "rosieawkward.webp"), new Pair("[rosiecute]", "rosiecute.webp"), new Pair("[jolliekissingface]", "jolliekissingface.webp"), new Pair("[jolliewow]", "jolliewow.webp"), new Pair("[jolliesatisfied]", "jolliesatisfied.webp"), new Pair("[jolliespeechless]", "jolliespeechless.webp"), new Pair("[sagethink]", "sagethink.webp"), new Pair("[sagefulfilled]", "sagefulfilled.webp"), new Pair("[sageclever]", "sageclever.webp"), new Pair("[sagemoney]", "sagemoney.webp"));

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_comment_default_emoji_info", map);
        return map2 != null ? map2 : map;
    }
}
