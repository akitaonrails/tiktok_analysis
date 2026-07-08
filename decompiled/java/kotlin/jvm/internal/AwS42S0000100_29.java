package kotlin.jvm.internal;

import X.C09AY;
import X.C19419910yL;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS42S0000100_29 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0000100_29(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS42S0000100_29 awS42S0000100_29, Object obj) {
        LiveCountDownStickerModel liveCountDownStickerModel = (LiveCountDownStickerModel) obj;
        return liveCountDownStickerModel.copy(liveCountDownStickerModel.baseStickerModel, liveCountDownStickerModel.title, awS42S0000100_29.j0, System.currentTimeMillis(), liveCountDownStickerModel.subscribeNum, liveCountDownStickerModel.subscribe, liveCountDownStickerModel.textAlreadyExpired, liveCountDownStickerModel.textTobeSubscribed, liveCountDownStickerModel.textAlreadySubscribed, liveCountDownStickerModel.maxLine, liveCountDownStickerModel.clickable, liveCountDownStickerModel.editable, liveCountDownStickerModel.visible);
    }

    public static final Object invoke$1(AwS42S0000100_29 awS42S0000100_29, Object obj) {
        return C19419910yL.LIZ((C19419910yL) obj, null, awS42S0000100_29.j0, false, 0, 13);
    }
}
