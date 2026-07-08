package com.lynx.textra;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public class TTTextDefinition {
    public static final FontWeight[] weight_ordinal_ = FontWeight.values();
    public static final LinkStyle[] link_ordinal_ = LinkStyle.values();
    public static final ThemeColorType[] theme_color_ordinal = ThemeColorType.values();
    public static final CanvasOp[] canvas_ordinal_ = CanvasOp.values();
    public static final PathType[] path_ordinal_ = PathType.values();
    public static final CharacterVerticalAlign[] character_vertical_ordinal_ = CharacterVerticalAlign.values();
    public static final ParagraphHorizontalAlign[] paragraph_horizon_ordinal_ = ParagraphHorizontalAlign.values();
    public static final ParagraphVerticalAlign[] paragraph_vertical_ordinal_ = ParagraphVerticalAlign.values();
    public static final LayoutResult[] layout_result_ordinal_ = LayoutResult.values();

    public static class FontFace {
        public String font_family;
        public String[] resource;
    }

    public static class LayoutPosition {
        public int char_index_;
        public int run_index_;

        public LayoutPosition() {
        }

        public LayoutPosition(int i, int i2) {
            this.run_index_ = i;
            this.char_index_ = i2;
        }
    }

    public enum CanvasOp {
        kStartPaint,
        kEndPaint,
        kSave,
        kRestore,
        kTranslate,
        kScale,
        kRotate,
        kSkew,
        kClipRect,
        kClear,
        kClearRect,
        kFillRect,
        kDrawColor,
        kDrawLine,
        kDrawRect,
        kDrawOval,
        kDrawCircle,
        kDrawArc,
        kDrawPath,
        kDrawArcTo,
        kDrawText,
        kDrawGlyphs,
        kDrawRunDelegate,
        kDrawImage,
        kDrawImageRect,
        kDrawBackgroundDelegate,
        kDrawBlockRegion,
        kDrawRoundRect;

        public static CanvasOp valueOf(String str) {
            return (CanvasOp) C08FF.LIZ(CanvasOp.class, str);
        }
    }

    public enum CharacterVerticalAlign {
        kBaseLine,
        kSuperScript,
        kSubScript,
        kTop,
        kBottom,
        kMiddle;

        public static CharacterVerticalAlign valueOf(String str) {
            return (CharacterVerticalAlign) C08FF.LIZ(CharacterVerticalAlign.class, str);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public enum DecorationType {
        kNone,
        kUnderLine;

        public static DecorationType valueOf(String str) {
            return (DecorationType) C08FF.LIZ(DecorationType.class, str);
        }
    }

    public enum FontWeight {
        kUndefined,
        kThin_100,
        kExtraLight_200,
        kLight_300,
        kNormal_400,
        kMedium_500,
        kSemiBold_600,
        kBold_700,
        kExtraBold_800,
        kBlack_900;

        public static FontWeight valueOf(String str) {
            return (FontWeight) C08FF.LIZ(FontWeight.class, str);
        }
    }

    public enum LayoutResult {
        kNormal,
        kRelayoutPage,
        kRelayoutLine,
        kBreakPage,
        kBreakColumn,
        kParagraphEnd;

        public static LayoutResult valueOf(String str) {
            return (LayoutResult) C08FF.LIZ(LayoutResult.class, str);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public enum LinkStyle {
        kNone,
        kUnderline;

        public static LinkStyle valueOf(String str) {
            return (LinkStyle) C08FF.LIZ(LinkStyle.class, str);
        }
    }

    public enum ParagraphHorizontalAlign {
        kLeft,
        kCenter,
        kRight,
        kJustify,
        kDistributed;

        public static ParagraphHorizontalAlign valueOf(String str) {
            return (ParagraphHorizontalAlign) C08FF.LIZ(ParagraphHorizontalAlign.class, str);
        }
    }

    public enum ParagraphVerticalAlign {
        kTop,
        kCenter,
        kBaseline,
        kBottom;

        public static ParagraphVerticalAlign valueOf(String str) {
            return (ParagraphVerticalAlign) C08FF.LIZ(ParagraphVerticalAlign.class, str);
        }
    }

    public enum PathType {
        kLines,
        kArc,
        kBezier,
        kMoveTo,
        kMultiPath;

        public static PathType valueOf(String str) {
            return (PathType) C08FF.LIZ(PathType.class, str);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public enum Slant {
        kUpRightSlant,
        kItalicSlant,
        kObliqueSlant;

        public static Slant valueOf(String str) {
            return (Slant) C08FF.LIZ(Slant.class, str);
        }
    }

    public enum ThemeColorType {
        kNormal,
        kLink,
        kBackground,
        kBlock,
        kFootnote,
        kPressedLink;

        public static ThemeColorType valueOf(String str) {
            return (ThemeColorType) C08FF.LIZ(ThemeColorType.class, str);
        }
    }

    public static CanvasOp GetCanvasOp(int i) {
        return canvas_ordinal_[i];
    }

    public static CharacterVerticalAlign GetCharacterVerticalAlign(int i) {
        return character_vertical_ordinal_[i];
    }

    public static FontWeight GetFontWeight(int i) {
        if (i >= 0) {
            FontWeight[] fontWeightArr = weight_ordinal_;
            if (i < fontWeightArr.length) {
                return fontWeightArr[i];
            }
        }
        return FontWeight.kNormal_400;
    }

    public static LayoutResult GetLayoutResult(int i) {
        return layout_result_ordinal_[i];
    }

    public static LinkStyle GetLinkStyle(int i) {
        if (i >= 0) {
            LinkStyle[] linkStyleArr = link_ordinal_;
            if (i < linkStyleArr.length) {
                return linkStyleArr[i];
            }
        }
        return LinkStyle.kNone;
    }

    public static ParagraphHorizontalAlign GetParagraphHorizontalAlign(int i) {
        return paragraph_horizon_ordinal_[i];
    }

    public static ParagraphVerticalAlign GetParagraphVerticalAlign(int i) {
        return paragraph_vertical_ordinal_[i];
    }

    public static PathType GetPathType(int i) {
        return path_ordinal_[i];
    }

    public static ThemeColorType GetThemeColorType(int i) {
        if (i >= 0) {
            ThemeColorType[] themeColorTypeArr = theme_color_ordinal;
            if (i < themeColorTypeArr.length) {
                return themeColorTypeArr[i];
            }
        }
        return ThemeColorType.kNormal;
    }

    public static class Size {
        public float height;
        public float width;

        public Size(float f, float f2) {
            this.width = f;
            this.height = f2;
        }
    }
}
