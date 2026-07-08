package kotlin.jvm.internal;

import X.C09AY;
import X.C1667180tUC;
import X.C1667940tVQ;
import X.C1668880tWw;
import X.C1671940tbs;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS12S1301000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS12S1301000_25 awS12S1301000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1668880tWw c1668880tWw = (C1668880tWw) awS12S1301000_25.l1;
        String str = awS12S1301000_25.s0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS12S1301000_25.l2;
        Function0 function0 = (Function0) awS12S1301000_25.l3;
        C1671940tbs.LJIIIIZZ(C341440Da2.LIZ(awS12S1301000_25.i4 | 1), (InterfaceC1680500tpg) obj, interfaceC1685750ty9, c1668880tWw, str, function0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S1301000_25 awS12S1301000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = awS12S1301000_25.s0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS12S1301000_25.l1;
        C1668880tWw c1668880tWw = (C1668880tWw) awS12S1301000_25.l2;
        Function0 function0 = (Function0) awS12S1301000_25.l3;
        C1667180tUC.LIZIZ(C341440Da2.LIZ(awS12S1301000_25.i4 | 1), (InterfaceC1680500tpg) obj, interfaceC1685750ty9, c1668880tWw, str, function0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS12S1301000_25 awS12S1301000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667940tVQ.LIZ((FragmentManager) awS12S1301000_25.l1, awS12S1301000_25.s0, (PurchasePanelViewModel) awS12S1301000_25.l2, (Function1) awS12S1301000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS12S1301000_25.i4 | 1));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS12S1301000_25(int r3, X.InterfaceC1685750ty9 r4, X.C1668880tWw r5, java.lang.String r6, kotlin.jvm.functions.Function0 r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.s0 = r6
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r7
            r1.i4 = r3
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r5
            r1.s0 = r6
            r1.l2 = r4
            r1.l3 = r7
            r1.i4 = r3
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS12S1301000_25.<init>(int, X.0ty9, X.0tWw, java.lang.String, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1301000_25(FragmentManager fragmentManager, String str, PurchasePanelViewModel purchasePanelViewModel, Function1 function1, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = fragmentManager;
        this.s0 = str;
        this.l2 = purchasePanelViewModel;
        this.l3 = function1;
        this.i4 = i;
    }
}
