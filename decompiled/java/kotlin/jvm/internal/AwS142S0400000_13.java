package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0X0B;
import X.C1725190uzl;
import X.C2188811AlT;
import X.C259800zU;
import X.InterfaceC1059280dfi;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS142S0400000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS142S0400000_13 r6) {
        /*
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "pipo_container_auto_close_pre_popup"
            r5 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r5)
            r4 = 0
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r6.l0
            X.013C r0 = (X.C013C) r0
            boolean r0 = r0.element
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r6.l1
            X.0dfi r0 = (X.InterfaceC1059280dfi) r0
            boolean r0 = r0 instanceof com.bytedance.hybrid.spark.page.SparkPopup
            if (r0 != 0) goto L60
            java.lang.Object r2 = r6.l2
            X.0uzl r2 = (X.C1725190uzl) r2
            java.lang.Object r0 = r6.l3
            com.bytedance.hybrid.spark.SparkContext r0 = (com.bytedance.hybrid.spark.SparkContext) r0
            r3 = 0
            if (r0 == 0) goto L6c
            java.lang.String r1 = r0.LJIJI()
        L30:
            r2.getClass()
            if (r1 == 0) goto L6a
            java.lang.String r0 = "isPopupSchema"
            android.net.Uri r2 = X.C759510Tqn.LIZLLL(r1, r0)
        L3b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isPopupSchema host: "
            r1.append(r0)
            if (r2 == 0) goto L4a
            java.lang.String r3 = r2.getHost()
        L4a:
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L6e
            java.lang.String r1 = r2.getHost()
            if (r1 == 0) goto L6e
            java.lang.String r0 = "_popup"
            boolean r0 = kotlin.text.u.LJIIZILJ(r1, r0, r4)
            if (r0 != r5) goto L6e
        L60:
            java.lang.Object r0 = r6.l1
            X.0dfi r0 = (X.InterfaceC1059280dfi) r0
            r0.close()
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6a:
            r2 = r3
            goto L3b
        L6c:
            r1 = r3
            goto L30
        L6e:
            java.lang.Object r0 = r6.l1
            X.0dfi r0 = (X.InterfaceC1059280dfi) r0
            r0.m3(r4)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS142S0400000_13.invoke$0(kotlin.jvm.internal.AwS142S0400000_13):java.lang.Object");
    }

    public static final Object invoke$1(AwS142S0400000_13 awS142S0400000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("URLConnectionModifier get request body, delegate:");
        sbLIZ.append("javaClass");
        sbLIZ.append(" url:");
        sbLIZ.append(((C0X0B) awS142S0400000_13.l1).LIZ.getURL());
        sbLIZ.append(" body:");
        sbLIZ.append(((C259800zU) awS142S0400000_13.l2).element.getClass().getName());
        sbLIZ.append(" sink:");
        sbLIZ.append(((C259800zU) awS142S0400000_13.l3).element.getClass().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0400000_13(C013C c013c, InterfaceC1059280dfi interfaceC1059280dfi, C1725190uzl c1725190uzl, SparkContext sparkContext, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = interfaceC1059280dfi;
        this.l2 = c1725190uzl;
        this.l3 = sparkContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS142S0400000_13(Object obj, Object obj2, C0X0B c0x0b, C259800zU<Object> c259800zU, C259800zU<Object> c259800zU2) {
        super(0);
        this.$t = c259800zU2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = c0x0b;
        this.l3 = c259800zU;
    }
}
