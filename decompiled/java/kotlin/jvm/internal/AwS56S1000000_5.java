package kotlin.jvm.internal;

import X.C051R;
import X.C09AY;
import X.C0E1X;
import X.C0EDQ;
import X.C0EEA;
import X.C0EEF;
import X.C0EEO;
import X.C0EW9;
import X.C0VSJ;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C194410114e;
import X.C348100Dkm;
import X.C350410DoV;
import X.C357930E1n;
import X.C358230E2r;
import X.C360990EDh;
import X.C364260EPw;
import X.C375830EoP;
import X.C382490Ez9;
import X.C382680EzS;
import X.C382890Ezn;
import X.C786410Ut5;
import X.EnumC1338240kve;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS56S1000000_5 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S1000000_5(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(awS56S1000000_5.s0));
        c1331670kl3LJII.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJII.LJJ((SmartImageView) obj);
        C786410Ut5.h3(c1331670kl3LJII);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C0EW9.LIZ((C0EW9) obj, null, null, null, null, awS56S1000000_5.s0, 15);
    }

    public static final Object invoke$10(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C357930E1n.LIZ((C357930E1n) obj, null, awS56S1000000_5.s0, null, false, 0.0f, 61);
    }

    public static final Object invoke$11(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C0EEO.LIZ((C0EEO) obj, null, null, null, null, awS56S1000000_5.s0, 15);
    }

    public static final Object invoke$12(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C358230E2r.LIZ((C358230E2r) obj, false, 0, null, null, awS56S1000000_5.s0, 15);
    }

    public static final Object invoke$13(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        int i;
        C358230E2r c358230E2r = (C358230E2r) obj;
        String str = awS56S1000000_5.s0;
        if (str != null && str.length() != 0) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1k;
        }
        return C358230E2r.LIZ(c358230E2r, false, 0, null, Integer.valueOf(i), null, 23);
    }

    public static final Object invoke$14(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        float f;
        C360990EDh c360990EDh = (C360990EDh) obj;
        String str = awS56S1000000_5.s0;
        if (str != null && str.length() != 0) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        return C360990EDh.LIZ(c360990EDh, Float.valueOf(f), null, null, null, null, 0, null, null, null, null, 1022);
    }

    public static final Object invoke$15(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C360990EDh.LIZ((C360990EDh) obj, null, null, null, null, null, 0, null, null, null, awS56S1000000_5.s0, 511);
    }

    public static final Object invoke$16(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C0EDQ) obj).LIZ.getPath(), awS56S1000000_5.s0));
    }

    public static final Object invoke$17(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C382490Ez9.LIZ((C382490Ez9) obj, null, null, null, null, null, null, null, awS56S1000000_5.s0, null, 383);
    }

    public static final Object invoke$18(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, null, null, null, awS56S1000000_5.s0, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -9, 65535, null);
    }

    public static final Object invoke$19(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        TextStickerModel textStickerModel = (TextStickerModel) obj;
        TextStickerCompatModel compatModel = textStickerModel.getCompatModel();
        compatModel.setSelectPovText(awS56S1000000_5.s0);
        return TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, compatModel, -1, 32767, null);
    }

    public static final Object invoke$2(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C364260EPw.LIZ((C364260EPw) obj, null, false, null, false, null, false, null, 0, null, null, null, null, null, new C375830EoP(awS56S1000000_5.s0), null, null, null, null, false, null, null, null, null, 8380415);
    }

    public static final Object invoke$20(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, null, null, null, awS56S1000000_5.s0, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -9, 65535, null);
    }

    public static final Object invoke$21(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, null, null, null, null, awS56S1000000_5.s0, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -17, 65535, null);
    }

    public static final Object invoke$3(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C194410114e.LIZ((C194410114e) obj, null, null, null, null, null, null, null, null, null, new C375830EoP(awS56S1000000_5.s0), null, null, null, null, null, null, null, null, null, null, 4193279);
    }

    public static final Object invoke$4(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return addYoursStickerModel.copy(addYoursStickerModel.baseStickerModel, null, awS56S1000000_5.s0, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, 0, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }

    public static final Object invoke$5(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        C350410DoV.LIZLLL(((C348100Dkm) obj).LIZ, true, C051R.LIZIZ(new C0E1X(awS56S1000000_5.s0, null, null, null, null, 30)), false, true);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C382890Ezn.LIZ((C382890Ezn) obj, false, null, null, false, 0, null, 0, false, 0L, awS56S1000000_5.s0, 0, null, false, false, false, 32255);
    }

    public static final Object invoke$7(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C382890Ezn.LIZ((C382890Ezn) obj, false, awS56S1000000_5.s0, null, false, 0, null, 0, false, 0L, null, 0, null, false, false, false, 32765);
    }

    public static final Object invoke$8(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        C0EEA c0eea = (C0EEA) obj;
        String str = awS56S1000000_5.s0;
        boolean z = c0eea.LIZ;
        C0EEF c0eef = c0eea.LIZIZ;
        c0eea.getClass();
        return new C0EEA(z, c0eef, str);
    }

    public static final Object invoke$9(AwS56S1000000_5 awS56S1000000_5, Object obj) {
        return C382680EzS.LIZ((C382680EzS) obj, null, null, null, false, awS56S1000000_5.s0, false, false, 223);
    }
}
