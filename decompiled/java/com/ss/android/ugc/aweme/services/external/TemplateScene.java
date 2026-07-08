package com.ss.android.ugc.aweme.services.external;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class TemplateScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TemplateScene[] $VALUES;
    public final String sceneName;
    public static final TemplateScene AUTO_CUT = new TemplateScene("AUTO_CUT", 0, "AUTO_CUT");
    public static final TemplateScene TEMPLATE_TAB = new TemplateScene("TEMPLATE_TAB", 1, "TEMPLATE_TAB");
    public static final TemplateScene UGC = new TemplateScene("UGC", 2, "UGC");
    public static final TemplateScene PUGC = new TemplateScene("PUGC", 3, "PUGC");
    public static final TemplateScene PIC_UGC = new TemplateScene("PIC_UGC", 4, "PIC_UGC");
    public static final TemplateScene PHOTO_TEMPLATE = new TemplateScene("PHOTO_TEMPLATE", 5, "PHOTO_TEMPLATE");
    public static final TemplateScene CANVAS_PHOTO_TEMPLATE = new TemplateScene("CANVAS_PHOTO_TEMPLATE", 6, "CANVAS_PHOTO_TEMPLATE");
    public static final TemplateScene IMAGE_EFFECT_TEMPLATE = new TemplateScene("IMAGE_EFFECT_TEMPLATE", 7, "IMAGE_EFFECT_TEMPLATE");

    public static final /* synthetic */ TemplateScene[] $values() {
        return new TemplateScene[]{AUTO_CUT, TEMPLATE_TAB, UGC, PUGC, PIC_UGC, PHOTO_TEMPLATE, CANVAS_PHOTO_TEMPLATE, IMAGE_EFFECT_TEMPLATE};
    }

    public static InterfaceC2044707zh<TemplateScene> getEntries() {
        return $ENTRIES;
    }

    static {
        TemplateScene[] templateSceneArr$values = $values();
        $VALUES = templateSceneArr$values;
        $ENTRIES = new C2254308sP(templateSceneArr$values);
    }

    public static TemplateScene[] values() {
        return (TemplateScene[]) $VALUES.clone();
    }

    public final String getSceneName() {
        return this.sceneName;
    }

    public static TemplateScene valueOf(String str) {
        return (TemplateScene) C08FF.LIZ(TemplateScene.class, str);
    }

    public TemplateScene(String str, int i, String str2) {
        this.sceneName = str2;
    }
}
