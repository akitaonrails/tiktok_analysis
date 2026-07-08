package kotlin.jvm.internal;

import X.C07WN;
import X.C07WW;
import X.C09AY;
import X.C0E3P;
import X.C0E3X;
import X.C194335111h;
import X.C19647711tz;
import X.C357930E1n;
import X.C359400E7e;
import X.C359410E7f;
import X.C359700E8i;
import X.C364110EPh;
import X.C364260EPw;
import X.C374720Emc;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS3S0000001_5 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0000001_5(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS3S0000001_5.f0, null, null, null, false, Integer.MAX_VALUE, 15, null);
    }

    public static final Object invoke$1(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C364260EPw.LIZ((C364260EPw) obj, null, false, null, false, null, false, new C364110EPh(awS3S0000001_5.f0, true, true), 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388543);
    }

    public static final Object invoke$10(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C07WW.LIZ((C07WW) obj, awS3S0000001_5.f0, false, 5);
    }

    public static final Object invoke$11(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C359700E8i.LIZ((C359700E8i) obj, awS3S0000001_5.f0, null, null, 0, 14);
    }

    public static final Object invoke$12(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        C359400E7e c359400E7e = (C359400E7e) obj;
        C359410E7f c359410E7f = c359400E7e.LIZ;
        Float fValueOf = Float.valueOf(awS3S0000001_5.f0);
        PlayPositionState playPositionState = c359410E7f.LIZ;
        c359410E7f.getClass();
        return C359400E7e.LIZ(c359400E7e, new C359410E7f(playPositionState, fValueOf), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382);
    }

    public static final Object invoke$13(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        BaseStickerModel baseStickerModel = (BaseStickerModel) obj;
        float f = 360;
        float f2 = awS3S0000001_5.f0 % f;
        if (f2 > 180.0f) {
            f2 -= f;
        } else if (f2 < -180.0f) {
            f2 += f;
        }
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
    }

    public static final Object invoke$14(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS3S0000001_5.f0, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null);
    }

    public static final Object invoke$15(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C19647711tz.LIZ((C19647711tz) obj, false, false, false, false, awS3S0000001_5.f0, 991);
    }

    public static final Object invoke$16(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return addYoursStickerModel.copy(addYoursStickerModel.baseStickerModel, addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, awS3S0000001_5.f0, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }

    public static final Object invoke$17(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return addYoursStickerModel.copy(addYoursStickerModel.baseStickerModel, addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, awS3S0000001_5.f0, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }

    public static final Object invoke$18(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return addYoursStickerModel.copy(BaseStickerModel.copy$default(addYoursStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS3S0000001_5.f0, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }

    public static final Object invoke$19(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        float f = awS3S0000001_5.f0;
        obj.getClass();
        return new C07WN(f);
    }

    public static final Object invoke$2(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        Boolean bool = Boolean.FALSE;
        return C364260EPw.LIZ((C364260EPw) obj, null, true, null, false, null, true, new C364110EPh(awS3S0000001_5.f0, true, true), 0, null, null, null, null, null, null, null, null, new Pair(bool, bool), null, false, null, null, null, null, 8322973);
    }

    public static final Object invoke$20(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return AICaptionTagStickerModel.copy$default((AICaptionTagStickerModel) obj, null, false, false, awS3S0000001_5.f0, false, false, 55, null);
    }

    public static final Object invoke$21(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS3S0000001_5.f0, null, null, null, false, Integer.MAX_VALUE, 15, null);
    }

    public static final Object invoke$22(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C194335111h.LIZ((C194335111h) obj, false, awS3S0000001_5.f0, 3);
    }

    public static final Object invoke$3(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C357930E1n.LIZ((C357930E1n) obj, null, null, null, false, awS3S0000001_5.f0, 31);
    }

    public static final Object invoke$4(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C0E3P.LIZ((C0E3P) obj, null, awS3S0000001_5.f0, null, 5);
    }

    public static final Object invoke$5(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C374720Emc.LIZ((C374720Emc) obj, false, false, awS3S0000001_5.f0, 0.0f, false, false, false, 247);
    }

    public static final Object invoke$6(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C374720Emc.LIZ((C374720Emc) obj, false, false, 0.0f, awS3S0000001_5.f0, false, false, false, 239);
    }

    public static final Object invoke$7(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C0E3X.LIZ((C0E3X) obj, 0, awS3S0000001_5.f0, null, null, 13);
    }

    public static final Object invoke$8(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C07WW.LIZ((C07WW) obj, awS3S0000001_5.f0, false, 5);
    }

    public static final Object invoke$9(AwS3S0000001_5 awS3S0000001_5, Object obj) {
        return C07WW.LIZ((C07WW) obj, awS3S0000001_5.f0, false, 5);
    }
}
