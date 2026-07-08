package kotlin.jvm.internal;

import X.AbstractC1542200qEc;
import X.C09AY;
import X.C1123340fL2;
import X.C1125610fOh;
import X.C1125620fOi;
import X.C1125640fOk;
import X.InterfaceC1631620sYq;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS2S2300100_17 extends C09AY implements Function1 {
    public final int $t;
    public long j5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS2S2300100_17 awS2S2300100_17, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        String str = awS2S2300100_17.s0;
        if (str == null) {
            str = "";
        }
        sparkContext.LJJLIIIJ(str, "banner_lynx_extra");
        final Function1 function1 = (Function1) awS2S2300100_17.l2;
        final long j = awS2S2300100_17.j5;
        final C1123340fL2 c1123340fL2 = (C1123340fL2) awS2S2300100_17.l3;
        final String str2 = awS2S2300100_17.s1;
        final String str3 = awS2S2300100_17.s0;
        final InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS2S2300100_17.l4;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0fL3
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                function1.invoke(Long.valueOf(j));
                c1123340fL2.setShowingUrl(str2);
                c1123340fL2.setLynxExtra(str3);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str4, C1542120qEU c1542120qEU) {
                LJLI(interfaceC1541990qEH, str4, c1542120qEU.LIZIZ);
                c1123340fL2.setShowingUrl("");
                c1123340fL2.setLynxExtra("");
                interfaceC1631620sYq.invoke(Long.valueOf(j), c1542120qEU.LIZ, c1542120qEU.LIZIZ);
                c1123340fL2.setShowingUrl(null);
                c1123340fL2.setLynxExtra(null);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2300100_17 awS2S2300100_17, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        String str = awS2S2300100_17.s0;
        if (str == null) {
            str = "";
        }
        sparkContext.LJJLIIIJ(str, "bubble_lynx_extra");
        final Function1 function1 = (Function1) awS2S2300100_17.l2;
        final long j = awS2S2300100_17.j5;
        final C1125640fOk c1125640fOk = (C1125640fOk) awS2S2300100_17.l3;
        final String str2 = awS2S2300100_17.s1;
        final InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS2S2300100_17.l4;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0fOj
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                function1.invoke(Long.valueOf(j));
                c1125640fOk.setShowingUrl(str2);
                C20441214yg.LIZIZ("EventLynxBubble", "onLoadFinish: ");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str3, C1542120qEU c1542120qEU) {
                LJLI(interfaceC1541990qEH, str3, c1542120qEU.LIZIZ);
                c1125640fOk.setShowingUrl("");
                interfaceC1631620sYq.invoke(Long.valueOf(j), c1542120qEU.LIZ, c1542120qEU.LIZIZ);
                c1125640fOk.setShowingUrl(null);
                C20441214yg.LJIIIZ("EventLynxBubble", "onLoadFailed: ");
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2300100_17(long j, C1123340fL2 c1123340fL2, String str, String str2, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = function1;
        this.j5 = j;
        this.l3 = c1123340fL2;
        this.s1 = str2;
        this.l4 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2300100_17(String str, C1125620fOi c1125620fOi, long j, C1125640fOk c1125640fOk, String str2, C1125610fOh c1125610fOh, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = c1125620fOi;
        this.j5 = j;
        this.l3 = c1125640fOk;
        this.s1 = str2;
        this.l4 = c1125610fOh;
    }
}
