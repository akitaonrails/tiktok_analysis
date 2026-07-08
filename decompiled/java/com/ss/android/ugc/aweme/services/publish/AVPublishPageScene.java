package com.ss.android.ugc.aweme.services.publish;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class AVPublishPageScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AVPublishPageScene[] $VALUES;
    public final String pageScene;
    public static final AVPublishPageScene MAIN = new AVPublishPageScene("MAIN", 0, "main");
    public static final AVPublishPageScene EDIT_POST = new AVPublishPageScene("EDIT_POST", 1, "edit_post");

    public static final /* synthetic */ AVPublishPageScene[] $values() {
        return new AVPublishPageScene[]{MAIN, EDIT_POST};
    }

    public static InterfaceC2044707zh<AVPublishPageScene> getEntries() {
        return $ENTRIES;
    }

    static {
        AVPublishPageScene[] aVPublishPageSceneArr$values = $values();
        $VALUES = aVPublishPageSceneArr$values;
        $ENTRIES = new C2254308sP(aVPublishPageSceneArr$values);
    }

    public static AVPublishPageScene[] values() {
        return (AVPublishPageScene[]) $VALUES.clone();
    }

    public final String getPageScene() {
        return this.pageScene;
    }

    public static AVPublishPageScene valueOf(String str) {
        return (AVPublishPageScene) C08FF.LIZ(AVPublishPageScene.class, str);
    }

    public AVPublishPageScene(String str, int i, String str2) {
        this.pageScene = str2;
    }
}
