package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS12S0100002_13 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public float f2;
    public Object l0;

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

    public static final Object invoke$0(AwS12S0100002_13 awS12S0100002_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreFling: target=");
        sbLIZ.append((View) awS12S0100002_13.l0);
        sbLIZ.append(", velocityX=");
        sbLIZ.append(awS12S0100002_13.f1);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(awS12S0100002_13.f2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS12S0100002_13 awS12S0100002_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreFling: target=");
        sbLIZ.append((View) awS12S0100002_13.l0);
        sbLIZ.append(", velocityX=");
        sbLIZ.append(awS12S0100002_13.f1);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(awS12S0100002_13.f2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0100002_13(float f, float f2, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.f1 = f;
        this.f2 = f2;
    }
}
