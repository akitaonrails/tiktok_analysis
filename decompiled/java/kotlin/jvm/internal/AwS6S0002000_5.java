package kotlin.jvm.internal;

import X.C09AY;
import X.C0EZP;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS6S0002000_5 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1029i0;
    public int i1;

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

    public static final Object invoke$0(AwS6S0002000_5 awS6S0002000_5, Object obj) {
        NLETextRichContent nLETextRichContent = (NLETextRichContent) obj;
        if (nLETextRichContent != null) {
            nLETextRichContent.updateColor(awS6S0002000_5.f1029i0, awS6S0002000_5.i1);
            nLETextRichContent.setRichText(nLETextRichContent.richTextData.toLabelStr());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S0002000_5 awS6S0002000_5, Object obj) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return addYoursStickerModel.copy(BaseStickerModel.copy$default(addYoursStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, awS6S0002000_5.f1029i0, awS6S0002000_5.i1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }

    public static final Object invoke$2(AwS6S0002000_5 awS6S0002000_5, Object obj) {
        return C0EZP.LIZ((C0EZP) obj, null, null, awS6S0002000_5.f1029i0, awS6S0002000_5.i1, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0002000_5(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f1029i0 = i;
        this.i1 = i2;
    }
}
