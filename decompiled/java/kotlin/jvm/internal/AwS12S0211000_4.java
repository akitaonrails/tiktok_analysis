package kotlin.jvm.internal;

import X.C09AY;
import X.C0D39;
import X.C0D3Y;
import X.C0DDQ;
import X.C0DIP;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C2265351Dld;
import X.C332690D2l;
import X.C332820D2y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS12S0211000_4 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS12S0211000_4 awS12S0211000_4, Object obj) {
        String str;
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265351Dld.LIZ.getClass();
        C1002190cBd c1002190cBd = C2265351Dld.LJI;
        C332690D2l c332690D2l = ((C0DDQ) awS12S0211000_4.l0).LIZJ.LLILZLL;
        if (c332690D2l != null) {
            str = c332690D2l.productId;
        } else {
            str = null;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C2265351Dld.LJIJJLI, ((C0D39) awS12S0211000_4.l1).id);
        c1023640ckE.withParam(C2265351Dld.LJIL, ((C0D39) awS12S0211000_4.l1).title);
        c1023640ckE.withParam(C2265351Dld.LJJ, Long.valueOf(awS12S0211000_4.i3));
        C1002190cBd c1002190cBd2 = C2265351Dld.LJJI;
        if (awS12S0211000_4.z2) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE.withParam(c1002190cBd2, Long.valueOf(j));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S0211000_4 awS12S0211000_4, Object obj) {
        String str;
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C0DIP.LIZ.getClass();
        c1023640ckE.withParam(C0DIP.LIZJ, "buy_now");
        C1002190cBd c1002190cBd = C0DIP.LJIIZILJ;
        C332820D2y c332820D2y = (C332820D2y) awS12S0211000_4.l0;
        String str2 = null;
        if (c332820D2y != null) {
            str = c332820D2y.id;
        } else {
            str = null;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        C1002190cBd c1002190cBd2 = C0DIP.LJIJ;
        C0D3Y c0d3y = (C0D3Y) awS12S0211000_4.l1;
        if (c0d3y != null) {
            str2 = c0d3y.price;
        }
        c1023640ckE.withParam(c1002190cBd2, str2);
        c1023640ckE.withParam(C0DIP.LJIJI, Long.valueOf(awS12S0211000_4.i3));
        C1002190cBd c1002190cBd3 = C0DIP.LJIJJ;
        if (awS12S0211000_4.z2) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE.withParam(c1002190cBd3, Long.valueOf(j));
        c1023640ckE.withParam(C0DIP.LJIJJLI, 1L);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0211000_4(C332820D2y c332820D2y, C0D3Y c0d3y, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c332820D2y;
        this.l1 = c0d3y;
        this.i3 = i;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0211000_4(C0DDQ c0ddq, C0D39 c0d39, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0ddq;
        this.l1 = c0d39;
        this.i3 = i;
        this.z2 = z;
    }
}
