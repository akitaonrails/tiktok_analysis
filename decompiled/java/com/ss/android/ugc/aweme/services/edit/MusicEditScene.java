package com.ss.android.ugc.aweme.services.edit;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class MusicEditScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MusicEditScene[] $VALUES;
    public final int value;
    public static final MusicEditScene MUSIC_EDIT_SCENE_VIDEO_GENERAL = new MusicEditScene("MUSIC_EDIT_SCENE_VIDEO_GENERAL", 0, 0);
    public static final MusicEditScene MUSIC_EDIT_SCENE_IMAGE_LEMON8 = new MusicEditScene("MUSIC_EDIT_SCENE_IMAGE_LEMON8", 1, 1);
    public static final MusicEditScene MUSIC_EDIT_SCENE_IMAGE_COPYRIGHT = new MusicEditScene("MUSIC_EDIT_SCENE_IMAGE_COPYRIGHT", 2, 2);

    public static final /* synthetic */ MusicEditScene[] $values() {
        return new MusicEditScene[]{MUSIC_EDIT_SCENE_VIDEO_GENERAL, MUSIC_EDIT_SCENE_IMAGE_LEMON8, MUSIC_EDIT_SCENE_IMAGE_COPYRIGHT};
    }

    public static InterfaceC2044707zh<MusicEditScene> getEntries() {
        return $ENTRIES;
    }

    static {
        MusicEditScene[] musicEditSceneArr$values = $values();
        $VALUES = musicEditSceneArr$values;
        $ENTRIES = new C2254308sP(musicEditSceneArr$values);
    }

    public static MusicEditScene[] values() {
        return (MusicEditScene[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static MusicEditScene valueOf(String str) {
        return (MusicEditScene) C08FF.LIZ(MusicEditScene.class, str);
    }

    public MusicEditScene(String str, int i, int i2) {
        this.value = i2;
    }
}
