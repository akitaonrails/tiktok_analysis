package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS0S0006003_5 extends C09AY implements Function1 {
    public final int $t;
    public float f6;
    public float f7;
    public float f8;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f951i0;
    public int i1;
    public int i2;
    public int i3;
    public int i4;
    public int i5;

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

    public static final Object invoke$0(AwS0S0006003_5 awS0S0006003_5, Object obj) {
        int i = (int) awS0S0006003_5.f6;
        int i2 = (int) awS0S0006003_5.f7;
        int i3 = awS0S0006003_5.f951i0;
        int i4 = awS0S0006003_5.i1;
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, i, i2, i3 / 2.0f, i4 / 2.0f, awS0S0006003_5.i2, awS0S0006003_5.i3, awS0S0006003_5.i4, awS0S0006003_5.i5, i3, i4, i3, i4, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (-awS0S0006003_5.f8) % 360, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16809977, 15, null);
    }

    public static final Object invoke$1(AwS0S0006003_5 awS0S0006003_5, Object obj) {
        int i = (int) awS0S0006003_5.f6;
        int i2 = (int) awS0S0006003_5.f7;
        int i3 = awS0S0006003_5.f951i0;
        int i4 = awS0S0006003_5.i1;
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, i, i2, i3 / 2.0f, i4 / 2.0f, awS0S0006003_5.i2, awS0S0006003_5.i3, awS0S0006003_5.i4, awS0S0006003_5.i5, i3, i4, i3, i4, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (-awS0S0006003_5.f8) % 360, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16809977, 15, null);
    }

    public static final Object invoke$2(AwS0S0006003_5 awS0S0006003_5, Object obj) {
        int i = (int) awS0S0006003_5.f6;
        int i2 = (int) awS0S0006003_5.f7;
        int i3 = awS0S0006003_5.f951i0;
        int i4 = awS0S0006003_5.i1;
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, i, i2, i3 / 2.0f, i4 / 2.0f, awS0S0006003_5.i2, awS0S0006003_5.i3, awS0S0006003_5.i4, awS0S0006003_5.i5, i3, i4, i3, i4, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (-awS0S0006003_5.f8) % 360, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16809977, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0006003_5(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, float f3, int i7) {
        super(1);
        this.$t = i7;
        this.f6 = f;
        this.f7 = f2;
        this.f951i0 = i;
        this.i1 = i2;
        this.f8 = f3;
        this.i2 = i3;
        this.i3 = i4;
        this.i4 = i5;
        this.i5 = i6;
    }
}
