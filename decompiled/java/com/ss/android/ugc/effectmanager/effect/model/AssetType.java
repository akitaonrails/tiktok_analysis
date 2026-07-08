package com.ss.android.ugc.effectmanager.effect.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AssetType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AssetType[] $VALUES;
    public final int value;
    public static final AssetType DEFAULT = new AssetType(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
    public static final AssetType XINGTU_TEMPLATE = new AssetType("XINGTU_TEMPLATE", 1, 1);
    public static final AssetType VIMO_TEMPLATE = new AssetType("VIMO_TEMPLATE", 2, 2);
    public static final AssetType LOKI_TEMPLATE = new AssetType("LOKI_TEMPLATE", 3, 3);
    public static final AssetType CAPCUT_TEMPLATE = new AssetType("CAPCUT_TEMPLATE", 4, 4);
    public static final AssetType UGC_TEMPLATE = new AssetType("UGC_TEMPLATE", 5, 5);
    public static final AssetType AUTOCUT_AI_TEMPLATE = new AssetType("AUTOCUT_AI_TEMPLATE", 6, 6);
    public static final AssetType THREE_D_MODEL = new AssetType("THREE_D_MODEL", 7, 7);
    public static final AssetType PICO_THREE_MODEL = new AssetType("PICO_THREE_MODEL", 8, 8);
    public static final AssetType PRE_DESIGNED = new AssetType("PRE_DESIGNED", 9, 9);
    public static final AssetType TOOL_MODEL = new AssetType("TOOL_MODEL", 10, 10);
    public static final AssetType THREE_MATERIAL = new AssetType("THREE_MATERIAL", 11, 11);
    public static final AssetType MAKE_UP_MATERIAL = new AssetType("MAKE_UP_MATERIAL", 12, 12);
    public static final AssetType FILTER = new AssetType("FILTER", 13, 13);
    public static final AssetType TWO_D_MODEL = new AssetType("TWO_D_MODEL", 14, 14);
    public static final AssetType PREFEB = new AssetType("PREFEB", 15, 15);
    public static final AssetType MLBB = new AssetType("MLBB", 16, 16);
    public static final AssetType SUB_GRAPH = new AssetType("SUB_GRAPH", 17, 17);
    public static final AssetType PUGC_TEMPLATE = new AssetType("PUGC_TEMPLATE", 18, 18);
    public static final AssetType PRE_TOOL_EFFECT = new AssetType("PRE_TOOL_EFFECT", 19, 19);
    public static final AssetType TWO_D_IMAGE = new AssetType("TWO_D_IMAGE", 20, 20);
    public static final AssetType PIXEL = new AssetType("PIXEL", 21, 21);
    public static final AssetType PHOTO_TREND_TEMPLATE = new AssetType("PHOTO_TREND_TEMPLATE", 22, 22);
    public static final AssetType IMAGE_TEXT_TEMPLATE = new AssetType("IMAGE_TEXT_TEMPLATE", 23, 23);
    public static final AssetType LEMON8_TEMPLATE = new AssetType("LEMON8_TEMPLATE", 24, 30);
    public static final AssetType EFFECT_INHOUSE = new AssetType("EFFECT_INHOUSE", 25, 31);
    public static final AssetType EFFECT_AWE = new AssetType("EFFECT_AWE", 26, 32);
    public static final AssetType EFFECT_MET = new AssetType("EFFECT_MET", 27, 33);
    public static final AssetType AUTOCUT_AI_TEMPLATE_V2 = new AssetType("AUTOCUT_AI_TEMPLATE_V2", 28, 34);
    public static final AssetType SOUND_SYNC = new AssetType("SOUND_SYNC", 29, 37);
    public static final AssetType PHOTO_BASELINE_SINGLE = new AssetType("PHOTO_BASELINE_SINGLE", 30, 38);
    public static final AssetType PHOTO_BASELINE_MULTI = new AssetType("PHOTO_BASELINE_MULTI", 31, 39);
    public static final AssetType PHOTO_DESIGNER_SINGLE = new AssetType("PHOTO_DESIGNER_SINGLE", 32, 41);
    public static final AssetType PHOTO_DESIGNER_MULTI = new AssetType("PHOTO_DESIGNER_MULTI", 33, 42);
    public static final AssetType PHOTO_ALGO_SINGLE = new AssetType("PHOTO_ALGO_SINGLE", 34, 43);
    public static final AssetType PHOTO_ALGO_MULTI = new AssetType("PHOTO_ALGO_MULTI", 35, 44);
    public static final AssetType PHOTO_EFFECT = new AssetType("PHOTO_EFFECT", 36, 45);
    public static final AssetType AIGT = new AssetType("AIGT", 37, 50);
    public static final AssetType AI_ALIVE_TEMPLATE = new AssetType("AI_ALIVE_TEMPLATE", 38, 51);
    public static final AssetType AUTO_PICK_TEMPLATE = new AssetType("AUTO_PICK_TEMPLATE", 39, 52);
    public static final AssetType LYRICS_RULE_TEMPLATE = new AssetType("LYRICS_RULE_TEMPLATE", 40, 62);
    public static final AssetType BASEIMAGE = new AssetType("BASEIMAGE", 41, 65);
    public static final AssetType BASEVIDEO = new AssetType("BASEVIDEO", 42, 66);
    public static final AssetType SGT = new AssetType("SGT", 43, 69);

    public static final /* synthetic */ AssetType[] $values() {
        return new AssetType[]{DEFAULT, XINGTU_TEMPLATE, VIMO_TEMPLATE, LOKI_TEMPLATE, CAPCUT_TEMPLATE, UGC_TEMPLATE, AUTOCUT_AI_TEMPLATE, THREE_D_MODEL, PICO_THREE_MODEL, PRE_DESIGNED, TOOL_MODEL, THREE_MATERIAL, MAKE_UP_MATERIAL, FILTER, TWO_D_MODEL, PREFEB, MLBB, SUB_GRAPH, PUGC_TEMPLATE, PRE_TOOL_EFFECT, TWO_D_IMAGE, PIXEL, PHOTO_TREND_TEMPLATE, IMAGE_TEXT_TEMPLATE, LEMON8_TEMPLATE, EFFECT_INHOUSE, EFFECT_AWE, EFFECT_MET, AUTOCUT_AI_TEMPLATE_V2, SOUND_SYNC, PHOTO_BASELINE_SINGLE, PHOTO_BASELINE_MULTI, PHOTO_DESIGNER_SINGLE, PHOTO_DESIGNER_MULTI, PHOTO_ALGO_SINGLE, PHOTO_ALGO_MULTI, PHOTO_EFFECT, AIGT, AI_ALIVE_TEMPLATE, AUTO_PICK_TEMPLATE, LYRICS_RULE_TEMPLATE, BASEIMAGE, BASEVIDEO, SGT};
    }

    public static InterfaceC2044707zh<AssetType> getEntries() {
        return $ENTRIES;
    }

    static {
        AssetType[] assetTypeArr$values = $values();
        $VALUES = assetTypeArr$values;
        $ENTRIES = new C2254308sP(assetTypeArr$values);
    }

    public static AssetType[] values() {
        return (AssetType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AssetType valueOf(String str) {
        return (AssetType) C08FF.LIZ(AssetType.class, str);
    }

    public AssetType(String str, int i, int i2) {
        this.value = i2;
    }
}
