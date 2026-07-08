package kotlin.jvm.internal;

import X.C09AY;
import X.C1168400gVi;
import X.C1292290jjX;
import X.C1321510kUf;
import X.C2188811AlT;
import Y.ARunnableS10S2100000_20;
import Y.ARunnableS25S1100000_20;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class AwS26S1101000_20 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS26S1101000_20 awS26S1101000_20, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSource start: src=");
        sbLIZ.append(awS26S1101000_20.s0);
        sbLIZ.append(", instanceId=");
        sbLIZ.append(((C1292290jjX) awS26S1101000_20.l1).LL);
        sbLIZ.append(", requestId=");
        sbLIZ.append(awS26S1101000_20.i2);
        sbLIZ.append(", autoPlay=");
        sbLIZ.append(((C1292290jjX) awS26S1101000_20.l1).LLILLL);
        sbLIZ.append(", loop=");
        sbLIZ.append(((C1292290jjX) awS26S1101000_20.l1).LLILZ);
        sbLIZ.append(", loopCount=");
        sbLIZ.append(((C1292290jjX) awS26S1101000_20.l1).LLILZIL);
        sbLIZ.append(", speed=");
        sbLIZ.append(((C1292290jjX) awS26S1101000_20.l1).LLILZLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S1101000_20 awS26S1101000_20, Object obj) {
        String str = (String) obj;
        if (awS26S1101000_20.i2 == ((C1321510kUf) awS26S1101000_20.l1).b) {
            if (str != null && str.length() != 0) {
                HandlerHook.viewPost(((C1321510kUf) awS26S1101000_20.l1).getView(), new ARunnableS10S2100000_20((C1321510kUf) awS26S1101000_20.l1, str, awS26S1101000_20.s0, 2));
            } else {
                C1168400gVi.LIZJ(new AwS53S1000000_2(awS26S1101000_20.s0, 1));
                HandlerHook.viewPost(((C1321510kUf) awS26S1101000_20.l1).getView(), new ARunnableS25S1100000_20((C1321510kUf) awS26S1101000_20.l1, awS26S1101000_20.s0, 2));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S1101000_20(int i, C1321510kUf c1321510kUf, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l1 = c1321510kUf;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S1101000_20(String str, C1292290jjX c1292290jjX, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = c1292290jjX;
        this.i2 = i;
    }
}
