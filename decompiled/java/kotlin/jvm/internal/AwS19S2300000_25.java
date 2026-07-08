package kotlin.jvm.internal;

import X.AbstractC1291220jho;
import X.AbstractC1653290t7n;
import X.C09AY;
import X.C1320700kTM;
import X.C1322110kVd;
import X.C1324750kZt;
import X.C1647390syH;
import X.C1653620t8K;
import X.C259800zU;
import X.InterfaceC1330440kj4;
import X.InterfaceC1653360t7u;
import android.graphics.Bitmap;
import bfk.b0;
import com.bytedance.als.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lnn.l;

/* JADX INFO: loaded from: classes26.dex */
public class AwS19S2300000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS19S2300000_25 awS19S2300000_25) {
        h0<C1647390syH> h0Var = ((AbstractC1653290t7n) awS19S2300000_25.l2).LJ;
        if (h0Var == null) {
            h0Var = null;
        }
        boolean zLJFF = Intrinsics.LJFF(h0Var.LIZJ().LIZIZ, awS19S2300000_25.s0);
        C1653620t8K c1653620t8KLJII = ((AbstractC1653290t7n) awS19S2300000_25.l2).LJII();
        b0 b0Var = (b0) awS19S2300000_25.l3;
        c1653620t8KLJII.getClass();
        C1653620t8K.LIZLLL(b0Var, zLJFF);
        InterfaceC1653360t7u interfaceC1653360t7u = (InterfaceC1653360t7u) awS19S2300000_25.l4;
        if (interfaceC1653360t7u != null) {
            interfaceC1653360t7u.onCelebrationStyleApplied(awS19S2300000_25.s1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS19S2300000_25 awS19S2300000_25) {
        AbstractC1291220jho abstractC1291220jho;
        C1322110kVd c1322110kVd = (C1322110kVd) awS19S2300000_25.l2;
        String str = awS19S2300000_25.s0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        l lVar = (l) awS19S2300000_25.l3;
        if (lVar.LLILLL) {
            abstractC1291220jho = (AbstractC1291220jho) lVar.LLJJI.getValue();
        } else {
            abstractC1291220jho = null;
        }
        C1324750kZt.LJIIL(c1322110kVd, str, -1, -1, config, abstractC1291220jho, null, (C1320700kTM) ((C259800zU) awS19S2300000_25.l4).element, awS19S2300000_25.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS19S2300000_25(C1322110kVd c1322110kVd, C1322110kVd c1322110kVd2, String str, l lVar, C259800zU<C1320700kTM<InterfaceC1330440kj4>> c259800zU, String str2) {
        super(0);
        this.$t = str2;
        this.l2 = c1322110kVd;
        this.s0 = c1322110kVd2;
        this.l3 = str;
        this.l4 = lVar;
        this.s1 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S2300000_25(AbstractC1653290t7n abstractC1653290t7n, String str, b0 b0Var, InterfaceC1653360t7u interfaceC1653360t7u, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = abstractC1653290t7n;
        this.s0 = str;
        this.l3 = b0Var;
        this.l4 = interfaceC1653360t7u;
        this.s1 = str2;
    }
}
