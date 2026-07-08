package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RichTextStyle_ProtoDecoder implements C0IMD<RichTextStyle> {
    public static RichTextStyle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RichTextStyle richTextStyle = new RichTextStyle();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        richTextStyle.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        richTextStyle.type = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        richTextStyle.textStyle = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        richTextStyle.fontSize = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        richTextStyle.fontFamily = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        richTextStyle.color = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        richTextStyle.stroke = _StrokeStyle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        richTextStyle.lineHeight = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        richTextStyle.padding = _EdgeInsets_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        richTextStyle.paragraphLayout = _ParagraphLayout_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        richTextStyle.flowSpec = _FlowSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        richTextStyle.contentAlignX = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        richTextStyle.colorBackground = _ColorBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        richTextStyle.imageBackground = _ImageBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        richTextStyle.lineSpacing = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 16:
                        richTextStyle.inlineBackground = _ColorBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return richTextStyle;
            }
        }
    }

    public static void LJ(RichTextStyle richTextStyle) {
        ImageContent imageContent;
        ImageBackground imageBackground = richTextStyle.imageBackground;
        if (imageBackground != null && (imageContent = imageBackground.image) != null) {
            _ImageContent_ProtoDecoder.LJ(imageContent);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RichTextStyle richTextStyle) {
        LJ(richTextStyle);
    }

    @Override // X.C0IMD
    public final RichTextStyle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RichTextStyle richTextStyle, List list) {
    }
}
