package kotlin.jvm.internal;

import X.C09AY;
import X.C0FGA;
import X.C1426750nEP;
import X.C388170FJv;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS21S0100001_5 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S0100001_5 awS21S0100001_5, Object obj) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return addYoursStickerModel.copy(BaseStickerModel.copy$default((BaseStickerModel) awS21S0100001_5.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS21S0100001_5.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS21S0100001_5 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS21S0100001_5.invoke$1(kotlin.jvm.internal.AwS21S0100001_5, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$2(kotlin.jvm.internal.AwS21S0100001_5 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS21S0100001_5.invoke$2(kotlin.jvm.internal.AwS21S0100001_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS21S0100001_5 awS21S0100001_5, Object obj) {
        int iLJFF;
        TextStickerModel textStickerModel = (TextStickerModel) obj;
        BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
        float f = awS21S0100001_5.f1;
        C0FGA textStickerPlayer = ((C388170FJv) awS21S0100001_5.l0).getTextStickerPlayer();
        if (textStickerPlayer != null) {
            iLJFF = textStickerPlayer.LJFF();
        } else {
            iLJFF = 0;
        }
        return TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f - iLJFF, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1080033281, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, true, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -8194, 65535, null);
    }

    public static final Object invoke$4(AwS21S0100001_5 awS21S0100001_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, BaseStickerModel.copy$default((BaseStickerModel) awS21S0100001_5.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS21S0100001_5.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null);
    }

    public static final Object invoke$5(AwS21S0100001_5 awS21S0100001_5, Object obj) {
        return TextStickerModel.copy$default((TextStickerModel) obj, BaseStickerModel.copy$default((BaseStickerModel) awS21S0100001_5.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS21S0100001_5.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0100001_5(float f, C388170FJv c388170FJv, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.l0 = c388170FJv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0100001_5(C1426750nEP c1426750nEP, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1426750nEP;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0100001_5(FilterBean filterBean, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = filterBean;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0100001_5(BaseStickerModel baseStickerModel, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseStickerModel;
        this.f1 = f;
    }
}
