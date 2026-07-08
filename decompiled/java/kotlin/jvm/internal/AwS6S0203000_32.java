package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS6S0203000_32 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0203000_32 awS6S0203000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreScroll: target=");
        sbLIZ.append((View) awS6S0203000_32.l0);
        sbLIZ.append(", dx=");
        sbLIZ.append(awS6S0203000_32.i2);
        sbLIZ.append(", dy=");
        sbLIZ.append(awS6S0203000_32.i3);
        sbLIZ.append(", consumed=");
        sbLIZ.append(((int[]) awS6S0203000_32.l1)[1]);
        sbLIZ.append(", type=");
        sbLIZ.append(awS6S0203000_32.i4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS6S0203000_32 awS6S0203000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreScroll: target=");
        sbLIZ.append((View) awS6S0203000_32.l0);
        sbLIZ.append(", dx=");
        sbLIZ.append(awS6S0203000_32.i2);
        sbLIZ.append(", dy=");
        sbLIZ.append(awS6S0203000_32.i3);
        sbLIZ.append(", consumed=");
        sbLIZ.append(((int[]) awS6S0203000_32.l1)[1]);
        sbLIZ.append(", type=");
        sbLIZ.append(awS6S0203000_32.i4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0203000_32(View view, int i, int i2, int[] iArr, int i3, int i4) {
        super(0);
        this.$t = i4;
        this.l0 = view;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = iArr;
        this.i4 = i3;
    }
}
