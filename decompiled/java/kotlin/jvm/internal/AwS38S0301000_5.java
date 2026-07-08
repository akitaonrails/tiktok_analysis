package kotlin.jvm.internal;

import X.C09AY;
import X.C0E5G;
import X.C0EH8;
import X.C0EJO;
import X.C0FU7;
import X.C1653300t7o;
import X.C361980EHc;
import X.C370320EfW;
import X.C370330EfX;
import X.C390790FTx;
import X.EnumC1466150oFx;
import X.EnumC357850E1f;
import androidx.recyclerview.widget.RecyclerView;
import bfk.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS38S0301000_5 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS38S0301000_5 awS38S0301000_5, Object obj) {
        C0EH8 c0eh8;
        if (((C0EJO) awS38S0301000_5.l0).LLILLL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C0EJO.LLILZIL >= 500) {
                C0EJO.LLILZIL = jCurrentTimeMillis;
                boolean zBooleanValue = ((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CLICK_WHEN_DISABLE_FUNCTION_ITEM, Boolean.FALSE)).booleanValue();
                C361980EHc c361980EHc = (C361980EHc) awS38S0301000_5.l1;
                if ((c361980EHc.LJII || zBooleanValue) && (c0eh8 = ((C0EJO) awS38S0301000_5.l0).LLILZ) != null) {
                    c0eh8.LIZ(c361980EHc, awS38S0301000_5.i3, ((RecyclerView.ViewHolder) awS38S0301000_5.l2).itemView);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S0301000_5 awS38S0301000_5, Object obj) {
        C0EH8 c0eh8;
        C370320EfW c370320EfW = (C370320EfW) awS38S0301000_5.l0;
        if (c370320EfW.LLILLL) {
            C361980EHc c361980EHc = (C361980EHc) awS38S0301000_5.l1;
            if (c361980EHc.LJII && (c0eh8 = c370320EfW.LLILZ) != null) {
                c0eh8.LIZIZ(c361980EHc, awS38S0301000_5.i3, ((C370330EfX) awS38S0301000_5.l2).itemView);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS38S0301000_5 awS38S0301000_5, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C1653300t7o c1653300t7o = (C1653300t7o) awS38S0301000_5.l0;
            b0 b0Var = (b0) awS38S0301000_5.l1;
            CharSequence charSequence = (CharSequence) awS38S0301000_5.l2;
            int i = awS38S0301000_5.i3;
            c1653300t7o.getClass();
            C1653300t7o.LJFF(b0Var, charSequence, i, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS38S0301000_5 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS38S0301000_5.invoke$3(kotlin.jvm.internal.AwS38S0301000_5, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0301000_5(C1653300t7o c1653300t7o, b0 b0Var, CharSequence charSequence, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1653300t7o;
        this.l1 = b0Var;
        this.l2 = charSequence;
        this.i3 = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS38S0301000_5(C0EJO c0ejo, C0EJO<VH> c0ejo2, C361980EHc c361980EHc, int i, VH vh) {
        super(1);
        this.$t = vh;
        this.l0 = c0ejo;
        this.l1 = c0ejo2;
        this.i3 = c361980EHc;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0301000_5(C370320EfW c370320EfW, C361980EHc c361980EHc, int i, C370330EfX c370330EfX, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c370320EfW;
        this.l1 = c361980EHc;
        this.i3 = i;
        this.l2 = c370330EfX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0301000_5(C390790FTx c390790FTx, C0FU7 c0fu7, int i, EnumC1466150oFx enumC1466150oFx, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c390790FTx;
        this.l1 = c0fu7;
        this.i3 = i;
        this.l2 = enumC1466150oFx;
    }
}
