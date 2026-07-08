package kotlin.jvm.internal;

import X.AnonymousClass1295;
import X.AnonymousClass1298;
import X.C09AY;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes34.dex */
public class AwS162S1200000_33 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS162S1200000_33 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131847063(0x7f116797, float:1.9327593E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder) r0
            boolean r4 = r5.LJII(r0)
            java.lang.String r0 = r9.s0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r3 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder) r3
            java.lang.String r2 = r9.s0
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L59
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L62
        L59:
            kotlin.jvm.internal.AwS141S1200000_26 r7 = new kotlin.jvm.internal.AwS141S1200000_26
            r0 = 0
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L62:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131847064(0x7f116798, float:1.9327595E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder) r0
            boolean r3 = r5.LJII(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r3 != 0) goto La2
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto Lac
        La2:
            kotlin.jvm.internal.AwS427S0200000_26 r7 = new kotlin.jvm.internal.AwS427S0200000_26
            r0 = 14
            r7.<init>(r2, r1, r0)
            r5.LJJIJIIJI(r7)
        Lac:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS162S1200000_33.invoke$0(kotlin.jvm.internal.AwS162S1200000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS162S1200000_33 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131833413(0x7f113245, float:1.9299907E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.String r0 = r9.s0
            boolean r4 = r5.LJJIIJ(r0)
            java.lang.Object r0 = r9.l1
            X.1298 r0 = (X.AnonymousClass1298) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.String r3 = r9.s0
            java.lang.Object r2 = r9.l1
            X.1298 r2 = (X.AnonymousClass1298) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L59
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L63
        L59:
            kotlin.jvm.internal.AwS144S1200000_29 r7 = new kotlin.jvm.internal.AwS144S1200000_29
            r0 = 8
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L63:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131828338(0x7f111e72, float:1.9289614E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L96
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La0
        L96:
            kotlin.jvm.internal.AwS577S0100000_33 r7 = new kotlin.jvm.internal.AwS577S0100000_33
            r0 = 3878(0xf26, float:5.434E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La0:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJII(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS162S1200000_33.invoke$1(kotlin.jvm.internal.AwS162S1200000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS162S1200000_33 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131833413(0x7f113245, float:1.9299907E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.String r0 = r9.s0
            boolean r4 = r5.LJJIIJ(r0)
            java.lang.Object r0 = r9.l1
            X.1295 r0 = (X.AnonymousClass1295) r0
            boolean r0 = r5.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.String r3 = r9.s0
            java.lang.Object r2 = r9.l1
            X.1295 r2 = (X.AnonymousClass1295) r2
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L59
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L63
        L59:
            kotlin.jvm.internal.AwS144S1200000_29 r7 = new kotlin.jvm.internal.AwS144S1200000_29
            r0 = 9
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L63:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131828338(0x7f111e72, float:1.9289614E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L96
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto La0
        L96:
            kotlin.jvm.internal.AwS577S0100000_33 r7 = new kotlin.jvm.internal.AwS577S0100000_33
            r0 = 3879(0xf27, float:5.436E-42)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        La0:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJII(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS162S1200000_33.invoke$2(kotlin.jvm.internal.AwS162S1200000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS162S1200000_33(AddressPasteViewHolder addressPasteViewHolder, AddressPasteViewHolder addressPasteViewHolder2, String str, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l1 = addressPasteViewHolder;
        this.s0 = addressPasteViewHolder2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS162S1200000_33(String str, String str2, AnonymousClass1295 anonymousClass1295, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = anonymousClass1295;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS162S1200000_33(String str, String str2, AnonymousClass1298 anonymousClass1298, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = anonymousClass1298;
    }
}
