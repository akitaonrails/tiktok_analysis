package kotlin.jvm.internal;

import X.C09AY;
import X.C19672011xu;
import X.C375830EoP;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS2S0000002_29 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS2S0000002_29 awS2S0000002_29, Object obj) {
        return C19672011xu.LIZ((C19672011xu) obj, null, new C375830EoP(new Pair(Float.valueOf(awS2S0000002_29.f0), Float.valueOf(awS2S0000002_29.f1))), null, 13);
    }

    public static final Object invoke$1(AwS2S0000002_29 awS2S0000002_29, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS2S0000002_29.f0, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS2S0000002_29.f1, null, null, null, false, 2139095039, 15, null);
    }

    public static final Object invoke$2(AwS2S0000002_29 awS2S0000002_29, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS2S0000002_29.f0, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS2S0000002_29.f1, null, null, null, false, 2139095039, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0000002_29(float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
        this.f1 = f2;
    }
}
