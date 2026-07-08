package kotlin.jvm.internal;

import X.C09AY;
import X.C21285518Rp;
import X.C2188811AlT;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS46S0102000_32 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS46S0102000_32 awS46S0102000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreScroll done :  dx=");
        sbLIZ.append(awS46S0102000_32.i1);
        sbLIZ.append(", dy=");
        sbLIZ.append(awS46S0102000_32.i2);
        sbLIZ.append(", consumed=");
        sbLIZ.append(((int[]) awS46S0102000_32.l0)[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS46S0102000_32 awS46S0102000_32) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(awS46S0102000_32.i1, awS46S0102000_32.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS46S0102000_32 awS46S0102000_32) {
        ((C21285518Rp) awS46S0102000_32.l0).LIZJ(awS46S0102000_32.i1, awS46S0102000_32.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS46S0102000_32 awS46S0102000_32) {
        ((C21285518Rp) awS46S0102000_32.l0).LIZLLL(awS46S0102000_32.i1, awS46S0102000_32.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS46S0102000_32 awS46S0102000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreScroll done :  dx=");
        sbLIZ.append(awS46S0102000_32.i1);
        sbLIZ.append(", dy=");
        sbLIZ.append(awS46S0102000_32.i2);
        sbLIZ.append(", consumed=");
        sbLIZ.append(((int[]) awS46S0102000_32.l0)[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0102000_32(int i, int i2, TuxTextView tuxTextView, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = tuxTextView;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0102000_32(int i, int i2, int[] iArr, int i3) {
        super(0);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0102000_32(C21285518Rp c21285518Rp, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c21285518Rp;
        this.i1 = i;
        this.i2 = i2;
    }
}
