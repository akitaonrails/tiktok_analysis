package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MusicResourceBitStructScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MusicResourceBitStructScene[] $VALUES;
    public final String scene;
    public static final MusicResourceBitStructScene CAMPAIGN = new MusicResourceBitStructScene("CAMPAIGN", 0, "campaign");
    public static final MusicResourceBitStructScene BULLETIN = new MusicResourceBitStructScene("BULLETIN", 1, "bulletin");
    public static final MusicResourceBitStructScene TV_FILM_IP_PAGE = new MusicResourceBitStructScene("TV_FILM_IP_PAGE", 2, "tv_film_ip_page");

    public static final /* synthetic */ MusicResourceBitStructScene[] $values() {
        return new MusicResourceBitStructScene[]{CAMPAIGN, BULLETIN, TV_FILM_IP_PAGE};
    }

    public static InterfaceC2044707zh<MusicResourceBitStructScene> getEntries() {
        return $ENTRIES;
    }

    static {
        MusicResourceBitStructScene[] musicResourceBitStructSceneArr$values = $values();
        $VALUES = musicResourceBitStructSceneArr$values;
        $ENTRIES = new C2254308sP(musicResourceBitStructSceneArr$values);
    }

    public static MusicResourceBitStructScene[] values() {
        return (MusicResourceBitStructScene[]) $VALUES.clone();
    }

    public final String getScene() {
        return this.scene;
    }

    public static MusicResourceBitStructScene valueOf(String str) {
        return (MusicResourceBitStructScene) C08FF.LIZ(MusicResourceBitStructScene.class, str);
    }

    public MusicResourceBitStructScene(String str, int i, String str2) {
        this.scene = str2;
    }
}
