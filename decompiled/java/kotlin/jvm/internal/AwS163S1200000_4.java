package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import X.InterfaceC494301wD;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class AwS163S1200000_4 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
    public AwS163S1200000_4(Context context, String str, AFwS206S0000000_18 aFwS206S0000000_18, int i) {
        super(3);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
        this.l2 = aFwS206S0000000_18;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS163S1200000_4 r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r17
            r13 = r16
            r1 = r15
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L94
            r0 = 4
        L1f:
            r4 = r4 | r0
        L20:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L32
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L32
            r13.LIZJ()
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L92
            r0 = 1
        L3d:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L56
        L4c:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 25
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L56:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "(debug) error: different "
            r1.<init>(r0)
            java.lang.String r0 = r14.s0
            r1.append(r0)
            java.lang.String r0 = " instance! "
            r1.append(r0)
            java.lang.Object r0 = r14.l1
            r1.append(r0)
            java.lang.String r0 = " AND "
            r1.append(r0)
            java.lang.Object r0 = r14.l2
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            r14 = 3504(0xdb0, float:4.91E-42)
            r16 = 1968(0x7b0, float:2.758E-42)
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2f
        L92:
            r0 = 0
            goto L3d
        L94:
            r0 = 2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS163S1200000_4.invoke$0(kotlin.jvm.internal.AwS163S1200000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS163S1200000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8c
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8a
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 32
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = r16
            java.lang.String r10 = r0.s0
            kotlin.jvm.internal.AwS282S0300000_4 r3 = new kotlin.jvm.internal.AwS282S0300000_4
            java.lang.Object r2 = r0.l1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 12
            r3.<init>(r2, r1, r4, r0)
            r0 = 2122433812(0x7e81c514, float:8.624685E37)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8a:
            r0 = 0
            goto L3e
        L8c:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS163S1200000_4.invoke$1(kotlin.jvm.internal.AwS163S1200000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S1200000_4(String str, InterfaceC494301wD interfaceC494301wD, InterfaceC494301wD interfaceC494301wD2, int i) {
        super(3);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC494301wD;
        this.l2 = interfaceC494301wD2;
    }
}
