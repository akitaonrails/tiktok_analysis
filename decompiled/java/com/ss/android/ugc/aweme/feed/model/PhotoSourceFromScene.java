package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PhotoSourceFromScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PhotoSourceFromScene[] $VALUES;
    public static final PhotoSourceFromScene DEFAULT = new PhotoSourceFromScene(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "");
    public static final PhotoSourceFromScene PUBLISH = new PhotoSourceFromScene("PUBLISH", 1, "publish");
    public final String desc;

    public static final /* synthetic */ PhotoSourceFromScene[] $values() {
        return new PhotoSourceFromScene[]{DEFAULT, PUBLISH};
    }

    public static InterfaceC2044707zh<PhotoSourceFromScene> getEntries() {
        return $ENTRIES;
    }

    static {
        PhotoSourceFromScene[] photoSourceFromSceneArr$values = $values();
        $VALUES = photoSourceFromSceneArr$values;
        $ENTRIES = new C2254308sP(photoSourceFromSceneArr$values);
    }

    public static PhotoSourceFromScene[] values() {
        return (PhotoSourceFromScene[]) $VALUES.clone();
    }

    public final String getDesc() {
        return this.desc;
    }

    public static PhotoSourceFromScene valueOf(String str) {
        return (PhotoSourceFromScene) C08FF.LIZ(PhotoSourceFromScene.class, str);
    }

    public PhotoSourceFromScene(String str, int i, String str2) {
        this.desc = str2;
    }
}
