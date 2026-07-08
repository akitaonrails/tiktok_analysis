package kotlin.jvm.internal;

import X.C09AY;
import X.C817403Hg;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS14S0100002_5 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public float f2;
    public Object l0;

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

    public static final Object invoke$0(AwS14S0100002_5 awS14S0100002_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, awS14S0100002_5.f1, awS14S0100002_5.f2, ((C817403Hg) awS14S0100002_5.l0).element, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -14680065, 15, null);
    }

    public static final Object invoke$1(AwS14S0100002_5 awS14S0100002_5, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, awS14S0100002_5.f1, awS14S0100002_5.f2, ((C817403Hg) awS14S0100002_5.l0).element, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -14680065, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0100002_5(float f, float f2, C817403Hg c817403Hg, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.f2 = f2;
        this.l0 = c817403Hg;
    }
}
