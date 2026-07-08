package kotlin.jvm.internal;

import X.C09AY;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1836200xso;
import X.InterfaceC1631620sYq;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes13.dex */
public class AFwS336S0000000_12 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(5);
    public final int $t;

    public static AFwS336S0000000_12 get$arr$(int i) {
        AFwS336S0000000_12 aFwS336S0000000_12 = (AFwS336S0000000_12) arr$.get(i);
        if (aFwS336S0000000_12 != null) {
            return aFwS336S0000000_12;
        }
        arr$.compareAndSet(i, null, new AFwS336S0000000_12(i));
        return (AFwS336S0000000_12) arr$.get(i);
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
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS336S0000000_12(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS336S0000000_12 aFwS336S0000000_12, Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj2).longValue();
        int i = ((C1836200xso) obj3).LIZLLL;
        if (i == 0) {
            return new ArrayList();
        }
        int iCeil = (int) Math.ceil((jLongValue / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((double) i));
        ArrayList arrayList = new ArrayList(iCeil);
        for (int i2 = 0; i2 < iCeil; i2++) {
            arrayList.add("");
        }
        return arrayList;
    }

    public static final Object invoke$1(AFwS336S0000000_12 aFwS336S0000000_12, Object obj, Object obj2, Object obj3) {
        ((Number) obj).floatValue();
        return Float.valueOf(Math.max(((C1836200xso) obj2).LJIIJ * (((Number) obj3).longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 1.0f));
    }

    public static final Object invoke$2(AFwS336S0000000_12 aFwS336S0000000_12, Object obj, Object obj2, Object obj3) {
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

    public static final Object invoke$3(AFwS336S0000000_12 aFwS336S0000000_12, Object obj, Object obj2, Object obj3) {
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

    public static final Object invoke$4(AFwS336S0000000_12 aFwS336S0000000_12, Object obj, Object obj2, Object obj3) {
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
}
