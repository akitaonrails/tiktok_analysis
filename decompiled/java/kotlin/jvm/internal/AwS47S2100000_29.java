package kotlin.jvm.internal;

import X.C09AY;
import X.EnumC1779140wOm;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS47S2100000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS47S2100000_29 awS47S2100000_29, Object obj) {
        ((Boolean) obj).booleanValue();
        ((WaterMarkServiceImpl) awS47S2100000_29.l2).addAIPortraitWatermarkToImage(awS47S2100000_29.s0, awS47S2100000_29.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS47S2100000_29 awS47S2100000_29, Object obj) {
        ArticleStickerModel articleStickerModel = (ArticleStickerModel) obj;
        return articleStickerModel.copy(articleStickerModel.baseStickerModel, awS47S2100000_29.s0, awS47S2100000_29.s1, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, new ArticleStickerModel.StyleModel((EnumC1779140wOm) awS47S2100000_29.l2, Boolean.FALSE), articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight);
    }

    public static final Object invoke$2(AwS47S2100000_29 awS47S2100000_29, Object obj) {
        EnumC1779140wOm enumC1779140wOm;
        boolean z;
        ArticleStickerModel articleStickerModel = (ArticleStickerModel) obj;
        ArticleStickerModel.StyleModel styleState = articleStickerModel.getStyleState();
        if (styleState != null) {
            enumC1779140wOm = styleState.type;
        } else {
            enumC1779140wOm = null;
        }
        String str = awS47S2100000_29.s0;
        String str2 = awS47S2100000_29.s1;
        EnumC1779140wOm enumC1779140wOm2 = (EnumC1779140wOm) awS47S2100000_29.l2;
        if (enumC1779140wOm2 != enumC1779140wOm) {
            z = true;
        } else {
            z = false;
        }
        return articleStickerModel.copy(articleStickerModel.baseStickerModel, str, str2, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, new ArticleStickerModel.StyleModel(enumC1779140wOm2, Boolean.valueOf(z)), articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S2100000_29(WaterMarkServiceImpl waterMarkServiceImpl, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = waterMarkServiceImpl;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S2100000_29(String str, String str2, EnumC1779140wOm enumC1779140wOm, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = enumC1779140wOm;
    }
}
