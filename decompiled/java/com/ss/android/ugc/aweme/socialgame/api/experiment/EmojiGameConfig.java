package com.ss.android.ugc.aweme.socialgame.api.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiGameConfig {

    @C09CT("base_url")
    public final String baseUrl;

    @C09CT("enable")
    public final int enable;

    @C09CT("emoji_game_exp_version")
    public final int expVersion;

    @C09CT("game_list")
    public final List<EmojiGameItemConfig> gameList;

    public EmojiGameConfig() {
        this(null, 0, null, 0, 15, null);
    }

    public EmojiGameConfig(String str, int i, List<EmojiGameItemConfig> list, int i2) {
        this.baseUrl = str;
        this.enable = i;
        this.gameList = list;
        this.expVersion = i2;
    }

    public EmojiGameConfig(String str, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
