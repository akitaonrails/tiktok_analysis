package kotlin.jvm.internal;

import X.C09AY;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.C214719191h;
import X.InterfaceC1163110gNB;
import X.InterfaceC1631620sYq;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public class AFwS340S0000000_17 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(4);
    public final int $t;

    public static AFwS340S0000000_17 get$arr$(int i) {
        AFwS340S0000000_17 aFwS340S0000000_17 = (AFwS340S0000000_17) arr$.get(i);
        if (aFwS340S0000000_17 != null) {
            return aFwS340S0000000_17;
        }
        arr$.compareAndSet(i, null, new AFwS340S0000000_17(i));
        return (AFwS340S0000000_17) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
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
    public AFwS340S0000000_17(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS340S0000000_17 aFwS340S0000000_17, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            sparkContext.LJJ(InterfaceC1163110gNB.class, new C214719191h() { // from class: X.0esF
                @Override // X.C214719191h
                public final void LJJIJL(SparkContext sparkContext2) {
                    InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
                    if (sparkContext2 != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext2.LJJIJLIJ()) != null) {
                        interfaceC1059280dfiLJJIJLIJ.close();
                    }
                    C20441214yg.LJIIIZ("HybridPerf", "spark container closed by icon");
                }
            });
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        sparkContext2.LJJ(InterfaceC1163110gNB.class, new C214719191h() { // from class: X.0esG
            @Override // X.C214719191h
            public final void LJJIJL(SparkContext sparkContext3) {
                InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
                if (sparkContext3 != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext3.LJJIJLIJ()) != null) {
                    interfaceC1059280dfiLJJIJLIJ.close();
                }
                C20441214yg.LJIIIZ("HybridPerf", "spark container closed by icon");
            }
        });
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$1(AFwS340S0000000_17 aFwS340S0000000_17, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$2(AFwS340S0000000_17 aFwS340S0000000_17, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$3(AFwS340S0000000_17 aFwS340S0000000_17, Object obj, Object obj2, Object obj3) {
        ItemInfo4FE itemInfo4FE = (ItemInfo4FE) obj;
        long jLongValue = ((Number) obj2).longValue();
        ((Number) obj3).longValue();
        itemInfo4FE.effectStartTimeSec = jLongValue;
        itemInfo4FE.endAt = jLongValue + itemInfo4FE.effectLastDuration;
        return Unit.LIZ;
    }
}
