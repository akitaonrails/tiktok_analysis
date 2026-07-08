package com.ss.android.ugc.aweme.social.sticker.enteredit.streak;

import X.C09CT;
import X.C20173213wY;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class GroupChatStreakInfoColorConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("streak_level_map")
    public final Map<String, ColorMetaData> colorMap;

    @C09CT("style1_effect_id")
    public final String style1EffectId;

    @C09CT("style2_effect_id")
    public final String style2EffectId;

    public GroupChatStreakInfoColorConfig() {
        this(null, null, null, 7, null);
    }

    public final Map<String, ColorMetaData> getColorMap() {
        return this.colorMap;
    }

    public final String getStyle1EffectId() {
        return this.style1EffectId;
    }

    public final String getStyle2EffectId() {
        return this.style2EffectId;
    }

    public GroupChatStreakInfoColorConfig(Map<String, ColorMetaData> map, String str, String str2) {
        this.colorMap = map;
        this.style1EffectId = str;
        this.style2EffectId = str2;
    }

    public GroupChatStreakInfoColorConfig(Map map, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("3", C20173213wY.LIZ), new Pair("10", C20173213wY.LIZIZ), new Pair("30", C20173213wY.LIZJ), new Pair("100", C20173213wY.LIZLLL), new Pair("200", C20173213wY.LJ), new Pair("300", C20173213wY.LJFF)) : map, (i & 2) != 0 ? "2763398773" : str, (i & 4) != 0 ? "2952045415" : str2);
    }
}
