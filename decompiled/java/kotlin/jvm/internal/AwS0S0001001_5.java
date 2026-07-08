package kotlin.jvm.internal;

import X.C09AY;
import X.C358230E2r;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS0S0001001_5 extends C09AY implements Function1 {
    public final int $t;
    public float f1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f947i0;

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

    public static final Object invoke$0(AwS0S0001001_5 awS0S0001001_5, Object obj) {
        Integer numValueOf;
        C358230E2r c358230E2r = (C358230E2r) obj;
        int i = (int) (awS0S0001001_5.f1 * 100);
        int i2 = awS0S0001001_5.f947i0;
        if (i2 != 100) {
            numValueOf = Integer.valueOf(i2);
        } else {
            numValueOf = null;
        }
        return C358230E2r.LIZ(c358230E2r, true, i, numValueOf, null, null, 24);
    }

    public static final Object invoke$1(AwS0S0001001_5 awS0S0001001_5, Object obj) {
        TextStickerModel textStickerModel = (TextStickerModel) obj;
        return TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, awS0S0001001_5.f1, TextFontModel.LIZ(textStickerModel.getFontModel(), null, null, null, null, null, null, awS0S0001001_5.f947i0, 0, null, null, false, false, 0, 16319), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -769, 65535, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0001001_5(float f, int i, int i2) {
        super(1);
        this.$t = i2;
        this.f1 = f;
        this.f947i0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0001001_5(int i, float f, int i2) {
        super(1);
        this.$t = i2;
        this.f947i0 = i;
        this.f1 = f;
    }
}
