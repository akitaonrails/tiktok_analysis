package kotlin.jvm.internal;

import X.C09AY;
import X.C0NOH;
import X.C1602160rnK;
import X.C1775300wIa;
import X.C184X;
import X.C212246184e;
import X.C212249184h;
import X.C212260184s;
import X.C212334187o;
import X.InterfaceC1631620sYq;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.mixmall.player.LynxMMKVideo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class AwS493S0200000_32 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS493S0200000_32(C0NOH c0noh, C212334187o c212334187o, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0noh;
        this.l1 = c212334187o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS493S0200000_32(C1775300wIa c1775300wIa, LynxMMKVideo lynxMMKVideo, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1775300wIa;
        this.l1 = lynxMMKVideo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS493S0200000_32(C184X c184x, C184X<ViewGroup> c184x2, C212246184e c212246184e) {
        super(3);
        this.$t = c212246184e;
        this.l0 = c184x;
        this.l1 = c184x2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS493S0200000_32(C212249184h c212249184h, C212249184h<ViewGroup> c212249184h2, C212260184s c212260184s) {
        super(3);
        this.$t = c212260184s;
        this.l0 = c212249184h;
        this.l1 = c212249184h2;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS493S0200000_32 awS493S0200000_32, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long jLongValue = ((Number) obj3).longValue();
        if (((C0NOH) awS493S0200000_32.l0).LIZJ == 2) {
            C212334187o c212334187o = (C212334187o) awS493S0200000_32.l1;
            int visibility = c212334187o.getVisibility();
            c212334187o.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c212334187o);
            ((C212334187o) awS493S0200000_32.l1).setCountDownText(jLongValue);
        } else {
            C212334187o c212334187o2 = (C212334187o) awS493S0200000_32.l1;
            int visibility2 = c212334187o2.getVisibility();
            c212334187o2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c212334187o2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r4.equals("onPlayFailed") == false) goto L4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS493S0200000_32 r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS493S0200000_32.invoke$1(kotlin.jvm.internal.AwS493S0200000_32, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS493S0200000_32 awS493S0200000_32, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long jLongValue = ((Number) obj3).longValue();
        ((C212249184h) awS493S0200000_32.l0).getClass();
        ((C212249184h) awS493S0200000_32.l0).LJIILL(iIntValue, ((C212260184s) awS493S0200000_32.l1).LIZ, jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS493S0200000_32 awS493S0200000_32, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long jLongValue = ((Number) obj3).longValue();
        ((C184X) awS493S0200000_32.l0).getClass();
        ((C184X) awS493S0200000_32.l0).LJIILJJIL(iIntValue, ((C212246184e) awS493S0200000_32.l1).LIZ, jLongValue);
        return Unit.LIZ;
    }
}
