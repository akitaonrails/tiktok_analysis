package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C1463850oCF;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmPath;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS1S1402000_22 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public int i6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS1S1402000_22 awS1S1402000_22) {
        ((C118300cf) awS1S1402000_22.l1).element = ((C1463850oCF) awS1S1402000_22.l2).LJI(awS1S1402000_22.s0, awS1S1402000_22.i5, awS1S1402000_22.i6, (NLEAlgorithmPath) awS1S1402000_22.l3);
        ((CountDownLatch) awS1S1402000_22.l4).countDown();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1402000_22 awS1S1402000_22) {
        ((C118300cf) awS1S1402000_22.l1).element = ((C1463850oCF) awS1S1402000_22.l2).LJII(awS1S1402000_22.s0, awS1S1402000_22.i5, awS1S1402000_22.i6, false);
        ((CountDownLatch) awS1S1402000_22.l4).countDown();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1402000_22(C118300cf c118300cf, C1463850oCF c1463850oCF, String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath, CountDownLatch countDownLatch, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c118300cf;
        this.l2 = c1463850oCF;
        this.s0 = str;
        this.i5 = i;
        this.i6 = i2;
        this.l3 = nLEAlgorithmPath;
        this.l4 = countDownLatch;
    }
}
