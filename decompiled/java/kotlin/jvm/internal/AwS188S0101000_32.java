package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import X.InterfaceC21503119Dh;
import android.content.Intent;
import android.view.KeyEvent;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class AwS188S0101000_32 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS188S0101000_32(int i, Intent intent, int i2) {
        super(3);
        this.$t = i2;
        this.i1 = i;
        this.l0 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS188S0101000_32(int i, KeyEvent keyEvent, int i2) {
        super(3);
        this.$t = i2;
        this.i1 = i;
        this.l0 = keyEvent;
    }

    public static final Object invoke$0(AwS188S0101000_32 awS188S0101000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).u1(awS188S0101000_32.i1, (Intent) awS188S0101000_32.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS188S0101000_32 r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            X.19Dh r3 = (X.InterfaceC21503119Dh) r3
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            int r1 = r2.i1
            java.lang.Object r0 = r2.l0
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            boolean r0 = r3.onKeyDown(r1, r0)
            if (r0 != 0) goto L19
            r1 = 0
            if (r5 == 0) goto L1a
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L1a
        L19:
            r1 = 1
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS188S0101000_32.invoke$1(kotlin.jvm.internal.AwS188S0101000_32, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
