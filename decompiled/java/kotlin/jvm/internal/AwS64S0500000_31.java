package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C11BY;
import X.C1391840mK6;
import X.C1397620mTQ;
import X.C20508215Mq;
import X.C997320c3m;
import X.EnumC1779330wP5;
import X.InterfaceC20507515Mj;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.LiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS64S0500000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS64S0500000_31 awS64S0500000_31, Object obj) {
        boolean zLJFF = Intrinsics.LJFF(((LiveData) ((C1391840mK6) awS64S0500000_31.l0).LIZLLL.getValue()).getValue(), Boolean.TRUE);
        ((C013C) awS64S0500000_31.l1).element = true;
        new C11BY().LJIILL((Mission) awS64S0500000_31.l2, zLJFF, EnumC1779330wP5.POST);
        C20508215Mq c20508215Mq = (C20508215Mq) awS64S0500000_31.l3;
        Keva keva = (Keva) c20508215Mq.LLILZ.getValue();
        C997320c3m c997320c3m = c20508215Mq.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C20508215Mq.LLILZIL;
        keva.storeBoolean((String) c997320c3m.LIZ(c20508215Mq), zLJFF);
        ((InterfaceC20507515Mj) awS64S0500000_31.l4).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS64S0500000_31 awS64S0500000_31, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131837309, new AwS64S0500000_31((C1391840mK6) awS64S0500000_31.l0, (C013C) awS64S0500000_31.l1, (Mission) awS64S0500000_31.l2, (C20508215Mq) awS64S0500000_31.l3, (InterfaceC20507515Mj) awS64S0500000_31.l4, 0));
        c1397620mTQ.LJII(2131837308, new AwS126S0400000_31((C013C) awS64S0500000_31.l1, (Mission) awS64S0500000_31.l2, (C1391840mK6) awS64S0500000_31.l0, (InterfaceC20507515Mj) awS64S0500000_31.l4, 15));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0500000_31(C1391840mK6 c1391840mK6, C013C c013c, Mission mission, C20508215Mq c20508215Mq, InterfaceC20507515Mj interfaceC20507515Mj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1391840mK6;
        this.l1 = c013c;
        this.l2 = mission;
        this.l3 = c20508215Mq;
        this.l4 = interfaceC20507515Mj;
    }
}
