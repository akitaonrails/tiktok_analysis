package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS0S0110002_13 extends C09AY implements Function0 {
    public final int $t;
    public float f2;
    public float f3;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS0S0110002_13 awS0S0110002_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedFling: target=");
        sbLIZ.append((View) awS0S0110002_13.l0);
        sbLIZ.append(", velocityX=");
        sbLIZ.append(awS0S0110002_13.f2);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(awS0S0110002_13.f3);
        sbLIZ.append(", consumed=");
        sbLIZ.append(awS0S0110002_13.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS0S0110002_13 awS0S0110002_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedFling: target=");
        sbLIZ.append((View) awS0S0110002_13.l0);
        sbLIZ.append(", velocityX=");
        sbLIZ.append(awS0S0110002_13.f2);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(awS0S0110002_13.f3);
        sbLIZ.append(", consumed=");
        sbLIZ.append(awS0S0110002_13.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0110002_13(View view, float f, float f2, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.f2 = f;
        this.f3 = f2;
        this.z1 = z;
    }
}
