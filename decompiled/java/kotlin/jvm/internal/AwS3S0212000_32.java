package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS3S0212000_32 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS3S0212000_32 awS3S0212000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartNestedScroll: child=");
        sbLIZ.append((View) awS3S0212000_32.l0);
        sbLIZ.append(", target=");
        sbLIZ.append((View) awS3S0212000_32.l1);
        sbLIZ.append(", axes=");
        sbLIZ.append(awS3S0212000_32.i3);
        sbLIZ.append(", type=");
        sbLIZ.append(awS3S0212000_32.i4);
        sbLIZ.append(",result:");
        sbLIZ.append(awS3S0212000_32.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS3S0212000_32 awS3S0212000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartNestedScroll: child=");
        sbLIZ.append((View) awS3S0212000_32.l0);
        sbLIZ.append(", target=");
        sbLIZ.append((View) awS3S0212000_32.l1);
        sbLIZ.append(", axes=");
        sbLIZ.append(awS3S0212000_32.i3);
        sbLIZ.append(", type=");
        sbLIZ.append(awS3S0212000_32.i4);
        sbLIZ.append(",result:");
        sbLIZ.append(awS3S0212000_32.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0212000_32(int i, int i2, View view, View view2, boolean z, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = view;
        this.l1 = view2;
        this.i3 = i;
        this.i4 = i2;
        this.z2 = z;
    }
}
