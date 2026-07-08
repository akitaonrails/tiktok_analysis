package kotlin.jvm.internal;

import X.AnonymousClass1147;
import X.C09AY;
import X.C0E2U;
import X.C0E3X;
import X.C0EUM;
import X.C0FCZ;
import X.C0FHM;
import X.C194410114e;
import X.C357930E1n;
import X.C358230E2r;
import X.C359400E7e;
import X.C359700E8i;
import X.C364260EPw;
import X.C373910ElJ;
import X.C374000ElS;
import X.C375830EoP;
import X.C385730FAl;
import X.C387490FHf;
import X.C388440FKw;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS20S0001000_5 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f968i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0001000_5(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f968i0 = i;
    }

    public static final Object invoke$0(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        NLETextRichContent nLETextRichContent = (NLETextRichContent) obj;
        if (nLETextRichContent != null) {
            int i = awS20S0001000_5.f968i0;
            int i2 = 1;
            if (i != 1) {
                if (i == 3) {
                    i2 = 2;
                }
            } else {
                i2 = 0;
            }
            nLETextRichContent.setTypeSettingAlign(i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C364260EPw.LIZ((C364260EPw) obj, null, false, null, false, null, false, null, 0, null, null, null, Integer.valueOf(awS20S0001000_5.f968i0), null, null, null, null, null, null, false, null, null, null, null, 8386559);
    }

    public static final Object invoke$10(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C357930E1n.LIZ((C357930E1n) obj, null, null, null, false, awS20S0001000_5.f968i0 / 100, 31);
    }

    public static final Object invoke$11(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0FCZ.LIZ((C0FCZ) obj, null, false, false, awS20S0001000_5.f968i0, 7);
    }

    public static final Object invoke$12(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        int i = awS20S0001000_5.f968i0;
        return C0EUM.LIZ((C0EUM) obj, i, i, null, false, false, false, false, false, false, 0, 1020);
    }

    public static final Object invoke$13(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0EUM.LIZ((C0EUM) obj, 0, 0, null, false, false, false, false, false, false, awS20S0001000_5.f968i0, 511);
    }

    public static final Object invoke$14(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C358230E2r.LIZ((C358230E2r) obj, false, awS20S0001000_5.f968i0, null, null, null, 29);
    }

    public static final Object invoke$15(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C374000ElS.LIZ((C374000ElS) obj, false, null, new Pair(Integer.valueOf(awS20S0001000_5.f968i0), Boolean.TRUE), false, false, 27);
    }

    public static final Object invoke$16(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C373910ElJ.LIZ((C373910ElJ) obj, new Pair(Integer.valueOf(awS20S0001000_5.f968i0), Boolean.TRUE), null, false, null, false, 126);
    }

    public static final Object invoke$17(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E3X.LIZ((C0E3X) obj, awS20S0001000_5.f968i0, 0.0f, null, null, 14);
    }

    public static final Object invoke$18(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C359700E8i.LIZ((C359700E8i) obj, 0.0f, Integer.valueOf(awS20S0001000_5.f968i0), null, 0, 13);
    }

    public static final Object invoke$19(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C359700E8i.LIZ((C359700E8i) obj, 0.0f, null, null, awS20S0001000_5.f968i0, 7);
    }

    public static final Object invoke$2(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C364260EPw.LIZ((C364260EPw) obj, null, false, null, false, null, false, null, 0, null, null, null, Integer.valueOf(awS20S0001000_5.f968i0), null, null, null, null, null, null, false, null, null, null, null, 8386559);
    }

    public static final Object invoke$20(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E2U.LIZ((C0E2U) obj, 0, awS20S0001000_5.f968i0, false, 0.0f, 0.0f, 0, 61);
    }

    public static final Object invoke$21(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E2U.LIZ((C0E2U) obj, 0, awS20S0001000_5.f968i0, false, 0.0f, 0.0f, 0, 61);
    }

    public static final Object invoke$22(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        C0E2U c0e2u = (C0E2U) obj;
        int i = awS20S0001000_5.f968i0;
        if (i <= 0) {
            i = -1;
        }
        return C0E2U.LIZ(c0e2u, 0, 0, false, 0.0f, 0.0f, i, 31);
    }

    public static final Object invoke$23(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E2U.LIZ((C0E2U) obj, 0, awS20S0001000_5.f968i0, false, 0.0f, 0.0f, 0, 61);
    }

    public static final Object invoke$24(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E2U.LIZ((C0E2U) obj, 0, awS20S0001000_5.f968i0, false, 0.0f, 0.0f, 0, 61);
    }

    public static final Object invoke$25(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E2U.LIZ((C0E2U) obj, 0, awS20S0001000_5.f968i0, false, 0.0f, 0.0f, 0, 61);
    }

    public static final Object invoke$26(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E2U.LIZ((C0E2U) obj, awS20S0001000_5.f968i0, 0, false, 0.0f, 0.0f, 0, 62);
    }

    public static final Object invoke$27(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C0E2U.LIZ((C0E2U) obj, 0, awS20S0001000_5.f968i0, false, 0.0f, 0.0f, 0, 61);
    }

    public static final Object invoke$28(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C385730FAl.LIZ((C385730FAl) obj, null, null, null, null, awS20S0001000_5.f968i0, false, null, null, false, false, false, false, null, null, null, false, null, null, null, false, null, false, 4194287);
    }

    public static final Object invoke$29(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C359400E7e.LIZ((C359400E7e) obj, null, null, null, null, null, null, null, null, null, null, null, null, new C375830EoP(Integer.valueOf(awS20S0001000_5.f968i0)), null, 12287);
    }

    public static final Object invoke$3(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C194410114e.LIZ((C194410114e) obj, null, null, null, new C375830EoP(new AnonymousClass1147(0, awS20S0001000_5.f968i0, 0, 3)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194287);
    }

    public static final Object invoke$30(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS20S0001000_5.f968i0, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -100663297, 15, null);
    }

    public static final Object invoke$31(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, awS20S0001000_5.f968i0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -3, 15, null);
    }

    public static final Object invoke$32(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        C0FHM c0fhm;
        C388440FKw c388440FKw = (C388440FKw) obj;
        if (awS20S0001000_5.f968i0 == 0) {
            c0fhm = C0FHM.VISIBLE;
        } else {
            c0fhm = C0FHM.GONE;
        }
        return C388440FKw.LIZ(c388440FKw, c0fhm);
    }

    public static final Object invoke$33(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        TextStickerModel textStickerModel = (TextStickerModel) obj;
        TextStickerCompatModel compatModel = textStickerModel.getCompatModel();
        ArrayList arrayList = new ArrayList();
        int i = awS20S0001000_5.f968i0;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new SubTemplateInfo(Integer.valueOf(i2), "", new SubTemplateStyle(-1, new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 15359, null), 2, 16.0f, 0.0f)));
        }
        return TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, TextStickerCompatModel.copy$default(compatModel, false, false, null, null, null, null, null, null, null, false, null, null, null, 0, arrayList, 0.0f, null, null, null, null, null, 2080767, null), -1, 32767, null);
    }

    public static final Object invoke$34(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, null, null, null, null, null, 0, 0, awS20S0001000_5.f968i0 + 1, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -129, 65535, null);
    }

    public static final Object invoke$35(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, null, null, null, null, null, 0, awS20S0001000_5.f968i0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -65, 65535, null);
    }

    public static final Object invoke$36(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, null, null, null, null, null, 0, awS20S0001000_5.f968i0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -65, 65535, null);
    }

    public static final Object invoke$37(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, null, null, null, null, null, awS20S0001000_5.f968i0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -33, 65519, null);
    }

    public static final Object invoke$4(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, null, null, null, null, false, false, null, null, null, null, awS20S0001000_5.f968i0, 2047);
    }

    public static final Object invoke$5(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, null, null, Integer.valueOf(awS20S0001000_5.f968i0), null, false, false, null, null, null, null, 0, 4087);
    }

    public static final Object invoke$6(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, null, null, Integer.valueOf(awS20S0001000_5.f968i0), null, false, false, null, null, null, null, 0, 4087);
    }

    public static final Object invoke$7(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, null, null, null, null, false, false, null, null, null, null, awS20S0001000_5.f968i0, 2047);
    }

    public static final Object invoke$8(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, null, null, null, null, false, false, null, null, null, null, awS20S0001000_5.f968i0, 2047);
    }

    public static final Object invoke$9(AwS20S0001000_5 awS20S0001000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, null, null, Integer.valueOf(awS20S0001000_5.f968i0), null, false, false, null, null, null, null, 0, 4087);
    }
}
