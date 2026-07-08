package kotlin.jvm.internal;

import X.C09AY;
import X.C1412020mqe;
import X.C1451460nsG;
import X.C1459370o51;
import X.C372820EjY;
import X.C375830EoP;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS10S0000001_22 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0000001_22(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1451460nsG.LIZ((C1451460nsG) obj, new C375830EoP(Float.valueOf(awS10S0000001_22.f0)), null, 11);
    }

    public static final Object invoke$1(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1412020mqe.LIZ((C1412020mqe) obj, false, null, null, null, null, awS10S0000001_22.f0, false, 0, null, null, null, null, false, null, 16351);
    }

    public static final Object invoke$2(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1412020mqe.LIZ((C1412020mqe) obj, false, null, null, null, null, awS10S0000001_22.f0, false, 0, null, null, null, null, false, null, 16351);
    }

    public static final Object invoke$3(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1412020mqe.LIZ((C1412020mqe) obj, false, null, null, null, null, 0.0f, false, 0, null, null, null, Float.valueOf(1 - awS10S0000001_22.f0), false, null, 14335);
    }

    public static final Object invoke$4(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1412020mqe.LIZ((C1412020mqe) obj, false, null, null, null, null, 0.0f, false, 0, null, null, null, Float.valueOf(C372820EjY.LIZ(awS10S0000001_22.f0)), false, null, 14335);
    }

    public static final Object invoke$5(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1459370o51.LIZ((C1459370o51) obj, 0, (int) (awS10S0000001_22.f0 * 100), 0, false, false, false, false, null, null, null, 2045);
    }

    public static final Object invoke$6(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1459370o51.LIZ((C1459370o51) obj, (int) (awS10S0000001_22.f0 * 100), 0, 0, false, false, false, false, null, null, null, 2046);
    }

    public static final Object invoke$7(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        return C1459370o51.LIZ((C1459370o51) obj, 0, 0, (int) (awS10S0000001_22.f0 * 100), false, false, false, false, null, null, null, 2043);
    }

    public static final Object invoke$8(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        LocationStickerModel locationStickerModel = (LocationStickerModel) obj;
        return locationStickerModel.copy(locationStickerModel.baseStickerModel, locationStickerModel.theme, locationStickerModel.poiData, locationStickerModel.clickable, awS10S0000001_22.f0, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle);
    }

    public static final Object invoke$9(AwS10S0000001_22 awS10S0000001_22, Object obj) {
        MentionStickerModel mentionStickerModel = (MentionStickerModel) obj;
        return mentionStickerModel.copy(BaseStickerModel.copy$default(mentionStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS10S0000001_22.f0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), mentionStickerModel.user, mentionStickerModel.userId, mentionStickerModel.secUid, mentionStickerModel.userName, mentionStickerModel.avatarUrl, mentionStickerModel.nickname, mentionStickerModel.useNickName, mentionStickerModel.editable, mentionStickerModel.visible, mentionStickerModel.useCapsuleStyle);
    }
}
