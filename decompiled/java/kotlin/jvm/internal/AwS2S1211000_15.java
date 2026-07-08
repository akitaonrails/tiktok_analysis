package kotlin.jvm.internal;

import X.C09AY;
import X.C955080axe;
import X.InterfaceC937840aVq;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS2S1211000_15 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS2S1211000_15 awS2S1211000_15, Object obj) {
        ((MultiCoHostWindowManager) awS2S1211000_15.l1).LJIIIIZZ((InterfaceC937840aVq) awS2S1211000_15.l2, null, awS2S1211000_15.i4, awS2S1211000_15.z3, awS2S1211000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1211000_15 awS2S1211000_15, Object obj) {
        ((MultiCoHostWindowManager) awS2S1211000_15.l1).LJIIIIZZ(null, (C955080axe) awS2S1211000_15.l2, awS2S1211000_15.i4, awS2S1211000_15.z3, awS2S1211000_15.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1211000_15(MultiCoHostWindowManager multiCoHostWindowManager, InterfaceC937840aVq interfaceC937840aVq, int i, boolean z, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = multiCoHostWindowManager;
        this.l2 = interfaceC937840aVq;
        this.i4 = i;
        this.z3 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1211000_15(MultiCoHostWindowManager multiCoHostWindowManager, C955080axe c955080axe, int i, boolean z, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = multiCoHostWindowManager;
        this.l2 = c955080axe;
        this.i4 = i;
        this.z3 = z;
        this.s0 = str;
    }
}
