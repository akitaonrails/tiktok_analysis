package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MusicETBusinessModule {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MusicETBusinessModule[] $VALUES;
    public static final Companion Companion;
    public final String fieldValue;
    public static final MusicETBusinessModule FEED = new MusicETBusinessModule("FEED", 0, "feed");
    public static final MusicETBusinessModule MDP = new MusicETBusinessModule("MDP", 1, "mdp");
    public static final MusicETBusinessModule MUSIC_TAB = new MusicETBusinessModule("MUSIC_TAB", 2, "music_tab");
    public static final MusicETBusinessModule MY_MUSIC = new MusicETBusinessModule("MY_MUSIC", 3, "my_music");
    public static final MusicETBusinessModule SEARCH = new MusicETBusinessModule("SEARCH", 4, "search");
    public static final MusicETBusinessModule DSP2TT = new MusicETBusinessModule("DSP2TT", 5, "dsp2tt");
    public static final MusicETBusinessModule SIMILAR_MUSIC = new MusicETBusinessModule("SIMILAR_MUSIC", 6, "similar_music");
    public static final MusicETBusinessModule MUSIC_SETTING = new MusicETBusinessModule("MUSIC_SETTING", 7, "music_setting");
    public static final MusicETBusinessModule PRESAVE = new MusicETBusinessModule("PRESAVE", 8, "presave");
    public static final MusicETBusinessModule CAMPAIGN = new MusicETBusinessModule("CAMPAIGN", 9, "campaign");
    public static final MusicETBusinessModule SOUND_TAB = new MusicETBusinessModule("SOUND_TAB", 10, "sound_tab");
    public static final MusicETBusinessModule FEED_CARD = new MusicETBusinessModule("FEED_CARD", 11, "feed_card");
    public static final MusicETBusinessModule MUSIC_CHART = new MusicETBusinessModule("MUSIC_CHART", 12, "music_chart");
    public static final MusicETBusinessModule MAGIC = new MusicETBusinessModule("MAGIC", 13, "magic");

    public static final /* synthetic */ MusicETBusinessModule[] $values() {
        return new MusicETBusinessModule[]{FEED, MDP, MUSIC_TAB, MY_MUSIC, SEARCH, DSP2TT, SIMILAR_MUSIC, MUSIC_SETTING, PRESAVE, CAMPAIGN, SOUND_TAB, FEED_CARD, MUSIC_CHART, MAGIC};
    }

    public static InterfaceC2044707zh<MusicETBusinessModule> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.music.model.MusicETBusinessModule$Companion] */
    static {
        MusicETBusinessModule[] musicETBusinessModuleArr$values = $values();
        $VALUES = musicETBusinessModuleArr$values;
        $ENTRIES = new C2254308sP(musicETBusinessModuleArr$values);
        Companion = new Object() { // from class: com.ss.android.ugc.aweme.music.model.MusicETBusinessModule.Companion
            public final MusicETBusinessModule fromFieldValue(String str) {
                boolean z;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return null;
                }
                for (MusicETBusinessModule musicETBusinessModule : MusicETBusinessModule.values()) {
                    if (Intrinsics.LJFF(musicETBusinessModule.getFieldValue(), str)) {
                        return musicETBusinessModule;
                    }
                }
                return null;
            }
        };
    }

    public static MusicETBusinessModule[] values() {
        return (MusicETBusinessModule[]) $VALUES.clone();
    }

    public final String getFieldValue() {
        return this.fieldValue;
    }

    public static MusicETBusinessModule valueOf(String str) {
        return (MusicETBusinessModule) C08FF.LIZ(MusicETBusinessModule.class, str);
    }

    public MusicETBusinessModule(String str, int i, String str2) {
        this.fieldValue = str2;
    }
}
