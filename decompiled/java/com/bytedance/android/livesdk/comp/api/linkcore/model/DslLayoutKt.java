package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C1697810uHb;
import X.C2097608Jq;
import X.C2097908Jt;
import X.EnumC918990a1R;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class DslLayoutKt {
    public static final Layout FLOAT;
    public static final Layout FLOAT_FIX;
    public static final Layout GRID_FIX;
    public static final Layout GRID_FLOAT;
    public static final DslLayout defaultDsl;
    public static final Layout normalDsl;

    static {
        Insets insets = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 56), 0.66f, "center", "top_center", "fill_width", 0.0f);
        Insets insets2 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.66f, "center", "center", "fill_width", 0.0f);
        Insets insets3 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 56), 0.66f, "center", "top_center", "fill_width", 0.0f);
        Insets insets4 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 64), 0.66f, "center", "top_center", "fill_width", 0.0f);
        Insets insets5 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 56), 0.66f, "center", "top_center", "fill_width", 0.0f);
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.331f);
        Float fValueOf3 = Float.valueOf(0.498f);
        Float fValueOf4 = Float.valueOf(0.336f);
        Float fValueOf5 = Float.valueOf(0.667f);
        Float fValueOf6 = Float.valueOf(0.672f);
        Float fValueOf7 = Float.valueOf(1.0f);
        Float fValueOf8 = Float.valueOf(0.502f);
        Layout layout = new Layout(6, "fix", "1004", "9002", "1004", insets, insets2, insets3, insets4, insets5, C2097908Jt.LIZJ(new Pair("c6", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf2, fValueOf3), "res", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf4, fValueOf, fValueOf5, fValueOf3), "res", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf6, fValueOf, fValueOf7, fValueOf3), "res", null, null, null, null, null)), new Pair("4", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf8, fValueOf2, fValueOf7), "res", null, null, null, null, null)), new Pair("5", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf4, fValueOf8, fValueOf5, fValueOf7), "res", null, null, null, null, null)), new Pair("6", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf6, fValueOf8, fValueOf7, fValueOf7), "res", null, null, null, null, null))))), C2097908Jt.LIZJ(new Pair("c6", C1697810uHb.LJIIJJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.331f, 0.0f, 0.336f, 1.0f), new RectF(0.667f, 0.0f, 0.672f, 1.0f)))), C2097908Jt.LIZJ(new Pair("res", new Resolution(240, 540, 15, 500, "linkmic_grid_fix_6", 240, 540, "layout_default", null))), 4, 1, false, "grid_fix", null, null);
        GRID_FIX = layout;
        Insets insets6 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 58), 0.666f, "center", "top_center", "fill_width", 0.0f);
        Insets insets7 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.666f, "center", "center", "fill_width", 0.0f);
        Insets insets8 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 58), 0.666f, "center", "top_center", "fill_width", 0.0f);
        Insets insets9 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 66), 0.666f, "center", "top_center", "fill_width", 0.0f);
        Insets insets10 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 58), 0.666f, "center", "top_center", "fill_width", 0.0f);
        Pair[] pairArr = {new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf3), "res_2", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf8, fValueOf7, fValueOf7), "res_2", null, null, null, null, null))};
        Float fValueOf9 = Float.valueOf(0.499f);
        Float fValueOf10 = Float.valueOf(0.504f);
        Layout layout2 = new Layout(6, "float", "1003", "9002", "1003", insets6, insets7, insets8, insets9, insets10, C2097608Jq.LJIIIIZZ(new Pair("c1", C2097908Jt.LIZJ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf7), "res_1", null, null, null, null, null)))), new Pair("c2", C2097608Jq.LJIIIIZZ(pairArr)), new Pair("c3", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf3), "res_3_main", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf8, fValueOf9, fValueOf7), "res_3", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf10, fValueOf8, fValueOf7, fValueOf7), "res_3", null, null, null, null, null)))), new Pair("c4", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf9, fValueOf3), "res_4", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf10, fValueOf, fValueOf7, fValueOf3), "res_4", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf8, fValueOf9, fValueOf7), "res_4", null, null, null, null, null)), new Pair("4", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf10, fValueOf8, fValueOf7, fValueOf7), "res_4", null, null, null, null, null)))), new Pair("c5", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf9, fValueOf3), "res_5_main", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf10, fValueOf, fValueOf7, fValueOf3), "res_5_main", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf8, fValueOf2, fValueOf7), "res_5", null, null, null, null, null)), new Pair("4", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf4, fValueOf8, fValueOf5, fValueOf7), "res_5", null, null, null, null, null)), new Pair("5", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf6, fValueOf8, fValueOf7, fValueOf7), "res_5", null, null, null, null, null)))), new Pair("c6", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf2, fValueOf3), "res_6", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf4, fValueOf, fValueOf5, fValueOf3), "res_6", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf6, fValueOf, fValueOf7, fValueOf3), "res_6", null, null, null, null, null)), new Pair("4", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf8, fValueOf2, fValueOf7), "res_6", null, null, null, null, null)), new Pair("5", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf4, fValueOf8, fValueOf5, fValueOf7), "res_6", null, null, null, null, null)), new Pair("6", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf6, fValueOf8, fValueOf7, fValueOf7), "res_6", null, null, null, null, null))))), C2097608Jq.LJIIIIZZ(new Pair("c2", Collections.singletonList(new RectF(0.0f, 0.498f, 1.0f, 0.502f))), new Pair("c3", C1697810uHb.LJIIJJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.499f, 0.502f, 0.504f, 1.0f))), new Pair("c4", C1697810uHb.LJIIJJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.499f, 0.0f, 0.504f, 1.0f))), new Pair("c5", C1697810uHb.LJIIJJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.499f, 0.0f, 0.504f, 0.498f), new RectF(0.331f, 0.502f, 0.336f, 1.0f), new RectF(0.667f, 0.502f, 0.672f, 1.0f))), new Pair("c6", C1697810uHb.LJIIJJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.331f, 0.0f, 0.336f, 1.0f), new RectF(0.667f, 0.0f, 0.672f, 1.0f)))), C2097608Jq.LJIIIIZZ(new Pair("res_1", new Resolution(720, 1280, 15, 2000, "linkmic_grid_float_1", 720, 1280, "layout_default", null)), new Pair("res_2", new Resolution(720, 540, 15, 1200, "linkmic_grid_float_2", 720, 540, "layout_default", null)), new Pair("res_3_main", new Resolution(720, 540, 15, 1200, "linkmic_grid_float_3_main", 720, 540, "layout_default", null)), new Pair("res_3", new Resolution(360, 540, 15, 650, "linkmic_grid_float_3", 360, 540, "layout_default", null)), new Pair("res_4", new Resolution(360, 540, 15, 650, "linkmic_grid_float_4", 360, 540, "layout_default", null)), new Pair("res_5_main", new Resolution(360, 540, 15, 650, "linkmic_grid_float_5_main", 360, 540, "layout_default", null)), new Pair("res_5", new Resolution(240, 240, 15, 500, "linkmic_grid_float_5", 240, 240, "layout_default", null)), new Pair("res_6", new Resolution(240, 540, 15, 500, "linkmic_grid_float_6", 240, 540, "layout_default", null))), 4, 1, false, "grid_float", null, null);
        GRID_FLOAT = layout2;
        Insets insets11 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 56), 0.909f, "center", "right_center", "fill_height", 0.0f);
        Insets insets12 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.909f, "center", "center", "fit", 0.0f);
        Insets insets13 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 56), 0.909f, "center", "right_center", "fill_height", 0.0f);
        Insets insets14 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 64), 0.909f, "center", "right_center", "fill_height", 0.0f);
        Insets insets15 = new Insets(null, C1697810uHb.LJIIJJI(0, 130, 0, 56), 0.909f, "center", "right_center", "fill_height", 0.0f);
        Float[] fArr = {fValueOf, fValueOf, Float.valueOf(0.772f), fValueOf7};
        Float fValueOf11 = Float.valueOf(0.778f);
        Layout layout3 = new Layout(5, "fix", "1002", "9001", "1002", insets11, insets12, insets13, insets14, insets15, C2097908Jt.LIZJ(new Pair("c5", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fArr), "res_main", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf11, fValueOf, fValueOf7, Float.valueOf(0.245f)), "res", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf11, Float.valueOf(0.25f), fValueOf7, Float.valueOf(0.495f)), "res", null, null, null, null, null)), new Pair("4", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf11, Float.valueOf(0.5f), fValueOf7, Float.valueOf(0.747f)), "res", null, null, null, null, null)), new Pair("5", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf11, Float.valueOf(0.753f), fValueOf7, fValueOf7), "res", null, null, null, null, null))))), C2097908Jt.LIZJ(new Pair("c5", C1697810uHb.LJIIJJI(new RectF(0.772f, 0.0f, 0.778f, 1.0f), new RectF(0.778f, 0.245f, 1.0f, 0.25f), new RectF(0.778f, 0.495f, 1.0f, 0.5f), new RectF(0.778f, 0.747f, 1.0f, 0.753f)))), C2097608Jq.LJIIIIZZ(new Pair("res_main", new Resolution(540, 960, 15, 1200, "linkmic_panel_fix_5_main", 540, 960, "layout_default", null)), new Pair("res", new Resolution(240, 320, 15, 400, "linkmic_panel_fix_5", 240, 320, "layout_default", null))), 4, 1, false, "panel_fix", null, null);
        FLOAT_FIX = layout3;
        Insets insets16 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f);
        Insets insets17 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.5625f, "center", "center", "fit", 0.0f);
        Insets insets18 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f);
        Insets insets19 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f);
        Insets insets20 = new Insets(null, C1697810uHb.LJIIJJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f);
        Float fValueOf12 = Float.valueOf(0.75f);
        Float fValueOf13 = Float.valueOf(0.728f);
        Float fValueOf14 = Float.valueOf(0.978f);
        Float fValueOf15 = Float.valueOf(0.878f);
        Layout layout4 = new Layout(5, "float", "1001", "9001", "1001", insets16, insets17, insets18, insets19, insets20, C2097608Jq.LJIIIIZZ(new Pair("c1", C2097908Jt.LIZJ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf7), "res_main", null, null, null, null, null)))), new Pair("c2", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf7), "res_main", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, fValueOf13, fValueOf14, fValueOf15), "res", null, null, null, null, null)))), new Pair("c3", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf7), "res_main", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, fValueOf13, fValueOf14, fValueOf15), "res", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, Float.valueOf(0.572f), fValueOf14, Float.valueOf(0.722f)), "res", null, null, null, null, null)))), new Pair("c4", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf7), "res_main", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, fValueOf13, fValueOf14, fValueOf15), "res", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, Float.valueOf(0.572f), fValueOf14, Float.valueOf(0.722f)), "res", null, null, null, null, null)), new Pair("4", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, Float.valueOf(0.416f), fValueOf14, Float.valueOf(0.566f)), "res", null, null, null, null, null)))), new Pair("c5", C2097608Jq.LJIIIIZZ(new Pair("1", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf7, fValueOf7), "res_main", null, null, null, null, null)), new Pair("2", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, fValueOf13, fValueOf14, fValueOf15), "res", null, null, null, null, null)), new Pair("3", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, Float.valueOf(0.572f), fValueOf14, Float.valueOf(0.722f)), "res", null, null, null, null, null)), new Pair("4", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, Float.valueOf(0.416f), fValueOf14, Float.valueOf(0.566f)), "res", null, null, null, null, null)), new Pair("5", new LayoutArray(C1697810uHb.LJIIJJI(fValueOf12, Float.valueOf(0.26f), fValueOf14, Float.valueOf(0.41f)), "res", null, null, null, null, null))))), C2097608Jq.LJ(), C2097608Jq.LJIIIIZZ(new Pair("res_main", new Resolution(720, 1280, 15, 2000, "linkmic_panel_float_5_main", 720, 1280, "layout_default", null)), new Pair("res", new Resolution(360, 360, 15, 500, "linkmic_panel_float_5", 360, 360, "layout_default", null))), 4, 1, false, "panel_float", null, null);
        FLOAT = layout4;
        defaultDsl = new DslLayout(4, -1, C2097608Jq.LJIIIIZZ(new Pair(EnumC918990a1R.GRID_FIX.getBusinessType(), layout), new Pair(EnumC918990a1R.GRID_FLOAT.getBusinessType(), layout2), new Pair(EnumC918990a1R.FLOAT.getBusinessType(), layout4), new Pair(EnumC918990a1R.FLOAT_FIX.getBusinessType(), layout3)));
        normalDsl = new Layout(1, "fix", CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, new Insets(null, C1697810uHb.LJIIIIZZ(), 1.0f, "", "", "fill", 0.0f), new Insets(null, C1697810uHb.LJIIIIZZ(), 1.0f, "", "", "fit", 0.0f), new Insets(null, C1697810uHb.LJIIIIZZ(), 1.0f, "", "", "fit", 0.0f), new Insets(null, C1697810uHb.LJIIIIZZ(), 1.0f, "", "", "fit", 0.0f), new Insets(null, C1697810uHb.LJIIIIZZ(), 1.0f, "", "", "fit", 0.0f), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), 4, 1, true, "normal", null, null);
    }

    public static final DslLayout getDefaultDsl() {
        return defaultDsl;
    }

    public static final Layout getNormalLayout() {
        return normalDsl;
    }

    public static final int getMaxCount(Layout layout) {
        if (layout != null) {
            return layout.micCount;
        }
        return 9;
    }

    public static final int getMaxGuestCount(Layout layout) {
        int i;
        if (layout != null) {
            i = layout.micCount;
        } else {
            i = 9;
        }
        return i - 1;
    }
}
