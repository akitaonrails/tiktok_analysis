package com.ss.android.ugc.aweme.story.experiment.celebration;

import X.C09CT;
import X.C1697810uHb;
import X.C2097908Jt;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryCelebrationConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("celebration_emoji_settings")
    public final Map<String, List<String>> celebrationEmojiSetting;

    @C09CT("celebration_sticker_font_config")
    public final CelebrationStickerFontConfig stickerFontConfig;

    @C09CT("story_celebration_white_list")
    public final List<String> whiteList;

    public StoryCelebrationConfig() {
        this(null, null, null, 7, null);
    }

    public final Map<String, List<String>> getCelebrationEmojiSetting() {
        return this.celebrationEmojiSetting;
    }

    public final CelebrationStickerFontConfig getStickerFontConfig() {
        return this.stickerFontConfig;
    }

    public final List<String> getWhiteList() {
        return this.whiteList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryCelebrationConfig(List<String> list, CelebrationStickerFontConfig celebrationStickerFontConfig, Map<String, ? extends List<String>> map) {
        this.whiteList = list;
        this.stickerFontConfig = celebrationStickerFontConfig;
        this.celebrationEmojiSetting = map;
    }

    public StoryCelebrationConfig(List list, CelebrationStickerFontConfig celebrationStickerFontConfig, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1697810uHb.LJIIJJI("1", "2", "3", "4", "5") : list, (i & 2) != 0 ? new CelebrationStickerFontConfig(null, null, null, null, 15, null) : celebrationStickerFontConfig, (i & 4) != 0 ? C2097908Jt.LIZJ(new Pair("1", C1697810uHb.LJ("🎉", "🥳", "🎂", "🎈", "🎊", "🍾"))) : map);
    }
}
