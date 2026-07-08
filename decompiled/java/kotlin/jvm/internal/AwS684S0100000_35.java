package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1D82;
import X.C1DEF;
import X.C1DEK;
import X.C2254191DKv;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes36.dex */
public class AwS684S0100000_35 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
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
    public AwS684S0100000_35(C013C c013c, int i) {
        super(3);
        this.$t = i;
        this.l0 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS684S0100000_35(C1DEK c1dek, C1DEK<E> c1dek2) {
        super(3);
        this.$t = c1dek2;
        this.l0 = c1dek;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS684S0100000_35(C2254191DKv c2254191DKv, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2254191DKv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS684S0100000_35(SeaSkuPanelSkcHeaderWidget seaSkuPanelSkcHeaderWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = seaSkuPanelSkcHeaderWidget;
    }

    public final void LIZ$0(C1D82 c1d82, Set<C1D82> set, LinkedList<C1D82> linkedList) {
        if (((C013C) this.l0).element) {
            return;
        }
        if (linkedList.contains(c1d82)) {
            ((C013C) this.l0).element = true;
            return;
        }
        if (!set.contains(c1d82)) {
            set.add(c1d82);
            linkedList.add(c1d82);
            Iterator<C1D82> it2 = c1d82.LIZ.LIZIZ.iterator();
            while (it2.hasNext()) {
                LIZ$0(it2.next(), set, linkedList);
            }
            linkedList.removeLast();
        }
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AwS684S0100000_35 awS684S0100000_35, Object obj, Object obj2, Object obj3) {
        awS684S0100000_35.LIZ$0((C1D82) obj, (Set) obj2, (LinkedList) obj3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS684S0100000_35 r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.03o5 r3 = (X.C953503o5) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget) r2
            r1 = 0
            if (r4 == 0) goto L2c
            r2.getClass()
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            if (r0 != 0) goto L2c
            X.0vzk r0 = r2.LLJILJIL
            if (r0 == 0) goto L1b
            X.C0H1U.LIZIZ(r0)
        L1b:
            com.bytedance.tux.input.TuxTextView r0 = r2.LLJILJILJ
            if (r0 == 0) goto L22
            X.C12ES.LJIILL(r1, r0)
        L22:
            com.bytedance.tux.input.TuxTextView r0 = r2.LLJILJILJ
            if (r0 == 0) goto L29
            r0.setText(r4)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.0vzk r0 = r2.LLJILJIL
            if (r0 == 0) goto L33
            X.C12ES.LJIILL(r1, r0)
        L33:
            com.bytedance.tux.input.TuxTextView r0 = r2.LLJILJILJ
            if (r0 == 0) goto L3a
            X.C0H1U.LIZIZ(r0)
        L3a:
            X.0vzk r0 = r2.LLJILJIL
            if (r0 == 0) goto L29
            r0.s0(r3)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS684S0100000_35.invoke$1(kotlin.jvm.internal.AwS684S0100000_35, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS684S0100000_35 awS684S0100000_35, Object obj, Object obj2, Object obj3) {
        IQRCodeScanner.ScanProcessListenr scanProcessListenr;
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        if (iIntValue == 3 && (scanProcessListenr = ((C2254191DKv) awS684S0100000_35.l0).LIZLLL) != null) {
            scanProcessListenr.onFirstRenderSuccess();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS684S0100000_35 awS684S0100000_35, Object obj, Object obj2, Object obj3) {
        return new AwS244S0300000_35(obj3, (C1DEK) awS684S0100000_35.l0, (C1DEK<Object>) obj, (C1DEF<?>) 7);
    }
}
