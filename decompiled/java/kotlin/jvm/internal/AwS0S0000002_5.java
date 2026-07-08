package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS0S0000002_5 extends C09AY implements Function1 {
    public final int $t;
    public float f0;
    public float f1;

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

    public static final Object invoke$0(AwS0S0000002_5 awS0S0000002_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS0S0000002_5.f0, awS0S0000002_5.f1, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -100663297, 15, null);
    }

    public static final Object invoke$1(AwS0S0000002_5 awS0S0000002_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, awS0S0000002_5.f0, awS0S0000002_5.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null);
    }

    public static final Object invoke$2(AwS0S0000002_5 awS0S0000002_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, awS0S0000002_5.f0, awS0S0000002_5.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0000002_5(float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
        this.f1 = f2;
    }
}
