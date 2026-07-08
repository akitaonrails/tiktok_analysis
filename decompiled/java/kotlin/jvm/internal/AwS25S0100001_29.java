package kotlin.jvm.internal;

import X.C09AY;
import X.C19623311q3;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS25S0100001_29 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS25S0100001_29 awS25S0100001_29, Object obj) {
        LocationStickerModel locationStickerModel = (LocationStickerModel) obj;
        return locationStickerModel.copy(BaseStickerModel.copy$default(((C19623311q3) awS25S0100001_29.l0).LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS25S0100001_29.f1, null, null, null, false, Integer.MAX_VALUE, 15, null), locationStickerModel.theme, locationStickerModel.poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle);
    }

    public static final Object invoke$1(AwS25S0100001_29 awS25S0100001_29, Object obj) {
        SecretRepliesStickerModel secretRepliesStickerModel = (SecretRepliesStickerModel) obj;
        return secretRepliesStickerModel.copy(BaseStickerModel.copy$default((BaseStickerModel) awS25S0100001_29.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS25S0100001_29.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), secretRepliesStickerModel.visible, secretRepliesStickerModel.questionText, secretRepliesStickerModel.editable);
    }

    public static final Object invoke$2(AwS25S0100001_29 awS25S0100001_29, Object obj) {
        PollStickerModel pollStickerModel = (PollStickerModel) obj;
        return pollStickerModel.copy(BaseStickerModel.copy$default((BaseStickerModel) awS25S0100001_29.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS25S0100001_29.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), pollStickerModel.visible, pollStickerModel.editable, pollStickerModel.clickable, pollStickerModel.question, pollStickerModel.option1, pollStickerModel.option2, pollStickerModel.pollStickerId);
    }

    public static final Object invoke$3(AwS25S0100001_29 awS25S0100001_29, Object obj) {
        EmbedHashTagStickerModel embedHashTagStickerModel = (EmbedHashTagStickerModel) obj;
        return embedHashTagStickerModel.copy(BaseStickerModel.copy$default((BaseStickerModel) awS25S0100001_29.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS25S0100001_29.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), embedHashTagStickerModel.hashtagId, embedHashTagStickerModel.contentText, embedHashTagStickerModel.editable, embedHashTagStickerModel.clickable, embedHashTagStickerModel.visible);
    }

    public static final Object invoke$4(AwS25S0100001_29 awS25S0100001_29, Object obj) {
        GlobalHashTagStickerModel globalHashTagStickerModel = (GlobalHashTagStickerModel) obj;
        return globalHashTagStickerModel.copy(BaseStickerModel.copy$default((BaseStickerModel) awS25S0100001_29.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS25S0100001_29.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), globalHashTagStickerModel.hashtagId, globalHashTagStickerModel.contentText, globalHashTagStickerModel.editable, globalHashTagStickerModel.clickable, globalHashTagStickerModel.visible);
    }

    public static final Object invoke$5(AwS25S0100001_29 awS25S0100001_29, Object obj) {
        return SingleHashTagStickerModel.copy$default((SingleHashTagStickerModel) obj, BaseStickerModel.copy$default((BaseStickerModel) awS25S0100001_29.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS25S0100001_29.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), 0L, null, false, false, false, 62, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S0100001_29(C19623311q3 c19623311q3, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19623311q3;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S0100001_29(BaseStickerModel baseStickerModel, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseStickerModel;
        this.f1 = f;
    }
}
