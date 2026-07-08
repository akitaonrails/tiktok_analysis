package kotlin.jvm.internal;

import X.C09AY;
import X.C1491570oux;
import X.C1520200pf8;
import X.C1522430pij;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1537820q7Y;
import X.C1537830q7Z;
import X.C1537900q7g;
import X.C1538140q84;
import X.C1538590q8n;
import X.C1541950qED;
import X.C1545470qJt;
import X.C1546360qLK;
import X.C1547370qMx;
import X.C1549760qQo;
import X.C1549960qR8;
import X.C1549970qR9;
import X.C1550020qRE;
import X.C2188811AlT;
import X.EnumC1067640dtC;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public class AFwS344S0000000_23 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(7);
    public final int $t;

    public static AFwS344S0000000_23 get$arr$(int i) {
        AFwS344S0000000_23 aFwS344S0000000_23 = (AFwS344S0000000_23) arr$.get(i);
        if (aFwS344S0000000_23 != null) {
            return aFwS344S0000000_23;
        }
        arr$.compareAndSet(i, null, new AFwS344S0000000_23(i));
        return (AFwS344S0000000_23) arr$.get(i);
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
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS344S0000000_23(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS344S0000000_23 aFwS344S0000000_23, Object obj, Object obj2, Object obj3) {
        boolean z;
        if (C1549760qQo.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isMatchViewWithContext: ");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        return Boolean.valueOf(z2);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS344S0000000_23 aFwS344S0000000_23, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS344S0000000_23 aFwS344S0000000_23, Object obj, Object obj2, Object obj3) {
        SparkContext sparkContext;
        HybridSchemaParam hybridSchemaParam;
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (!(c1537480q70 instanceof SparkContext) || (sparkContext = (SparkContext) c1537480q70) == null) {
            sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
        }
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = sparkContext.liteLynxConfig;
        if (c1538590q8n == null) {
            c1538590q8n = new C1538590q8n();
        }
        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
        sparkContext.usePreload = true;
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS == null || (hybridSchemaParam = interfaceC1531560pxS.LIZJ()) == null) {
            hybridSchemaParam = new HybridSchemaParam(EnumC1067640dtC.LYNX);
        }
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParam, sparkContext, context, null);
        if (!(interfaceC1541990qEHLIZIZ instanceof C1537720q7O)) {
            return null;
        }
        return interfaceC1541990qEHLIZIZ;
    }

    public static final Object invoke$3(AFwS344S0000000_23 aFwS344S0000000_23, Object obj, Object obj2, Object obj3) {
        SparkContext sparkContext;
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (!(c1537480q70 instanceof SparkContext) || (sparkContext = (SparkContext) c1537480q70) == null) {
            sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        sparkContext.usePreload = true;
        c1537900q7g.getClass();
        return new C1541950qED(context, sparkContext).LIZ(false);
    }

    public static final Object invoke$4(AFwS344S0000000_23 aFwS344S0000000_23, Object obj, Object obj2, Object obj3) {
        SparkContext sparkContext;
        HybridSchemaParam hybridSchemaParam;
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            sparkContext = (SparkContext) c1537480q70;
        } else {
            sparkContext = new SparkContext();
        }
        sparkContext.LJJIIZ(str);
        sparkContext.LJJJZ("businessClickTime", String.valueOf(System.currentTimeMillis()));
        HybridSchemaParam hybridSchemaParamLIZ = C1545470qJt.LIZ(str, null, null, sparkContext.containerId);
        C1537830q7Z c1537830q7Z = new C1537830q7Z(UriProtector.parse(str), sparkContext);
        c1537830q7Z.LJJIJIIJIL = true;
        c1537830q7Z.LJJIIJ = hybridSchemaParamLIZ;
        C1546360qLK.LIZ.getClass();
        C1546360qLK.LIZ(str, c1537830q7Z, true);
        sparkContext.hybridParams = c1537830q7Z;
        String str2 = sparkContext.containerId;
        C1520200pf8.LIZ.getClass();
        C1491570oux.LJI(C1491570oux.LIZ, str2, new C1522430pij("schema", str));
        sparkContext.usePreload = true;
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LJFF = true;
        c1538590q8n.LJI = true;
        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS == null || (hybridSchemaParam = interfaceC1531560pxS.LIZJ()) == null) {
            hybridSchemaParam = new HybridSchemaParam(EnumC1067640dtC.LYNX);
        }
        return C1537820q7Y.LIZIZ(hybridSchemaParam, sparkContext, context, new C1547370qMx(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "bdhm_pid"), null, null, true));
    }

    public static final Object invoke$5(AFwS344S0000000_23 aFwS344S0000000_23, Object obj, Object obj2, Object obj3) {
        Uri uri = (Uri) obj;
        C1550020qRE c1550020qRE = (C1550020qRE) obj2;
        Map map = (Map) obj3;
        if (!Intrinsics.LJFF(uri.getScheme(), "http") && !Intrinsics.LJFF(uri.getScheme(), "https") && 0 == 0) {
            return null;
        }
        return new C1549960qR8(uri, c1550020qRE, map);
    }

    public static final Object invoke$6(AFwS344S0000000_23 aFwS344S0000000_23, Object obj, Object obj2, Object obj3) {
        Uri uri = (Uri) obj;
        C1550020qRE c1550020qRE = (C1550020qRE) obj2;
        Map map = (Map) obj3;
        if (!Intrinsics.LJFF(uri.getScheme(), "react-native")) {
            return null;
        }
        return new C1549970qR9(uri, c1550020qRE, map);
    }
}
