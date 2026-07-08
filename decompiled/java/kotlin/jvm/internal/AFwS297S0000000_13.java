package kotlin.jvm.internal;

import X.C09AY;
import X.C0VSF;
import X.C13LQ;
import X.C1798060wtI;
import X.C1954807lC;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C799570VYd;
import X.C825830WaT;
import X.C840990Wyv;
import X.C841020Wyy;
import X.C844420XAq;
import X.EnumC825810WaR;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.utils.CostTimeline;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.tako.botpage.components.easteregg.model.TakoEasterEggConfig;
import java.io.BufferedReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public class AFwS297S0000000_13 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(6);
    public final int $t;

    public static AFwS297S0000000_13 get$arr$(int i) {
        AFwS297S0000000_13 aFwS297S0000000_13 = (AFwS297S0000000_13) arr$.get(i);
        if (aFwS297S0000000_13 != null) {
            return aFwS297S0000000_13;
        }
        arr$.compareAndSet(i, null, new AFwS297S0000000_13(i));
        return (AFwS297S0000000_13) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS297S0000000_13(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS297S0000000_13 aFwS297S0000000_13, Object obj, Object obj2) {
        ((Number) obj).intValue();
        C1798060wtI.LJII = null;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS297S0000000_13 aFwS297S0000000_13, Object obj, Object obj2) {
        Bundle arguments;
        Fragment fragment = (Fragment) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (fragment != null && (arguments = fragment.getArguments()) != null) {
            arguments.putBoolean("IS_AGE_GATE_PASSED", zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS297S0000000_13 aFwS297S0000000_13, Object obj, Object obj2) {
        String str;
        String str2;
        Object[] objArr = (Object[]) obj2;
        int i = C825830WaT.LIZ[((EnumC825810WaR) obj).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new C1954807lC();
                }
                str = "0x28";
            } else {
                str = "0x58";
            }
        } else {
            str = "0x48";
        }
        if (objArr == null || (str2 = (String) C13LQ.LJJIFFI(objArr)) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('1');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AFwS297S0000000_13 aFwS297S0000000_13, Object obj, Object obj2) throws Throwable {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue() && str.length() > 0) {
            List<TakoEasterEggConfig> list = C844420XAq.LIZ;
            try {
                BufferedReader bufferedReader = new BufferedReader(new C0VSF(str));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    C844420XAq.LIZ = (List) C844420XAq.LIZIZ.LJIIIIZZ(sb.toString(), new TypeToken<List<? extends TakoEasterEggConfig>>() { // from class: X.0XAm
                    }.getType());
                    C2107108Nh.LIZ(bufferedReader, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(bufferedReader, th);
                        throw th;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS297S0000000_13 aFwS297S0000000_13, Object obj, Object obj2) {
        ((ExecutorService) C799570VYd.LIZJ.getValue()).execute(new Runnable() { // from class: X.0hSd
            public static void LIZ() {
                C1205260hTA.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("nearby_tab_position", C1204880hSY.LIZLLL(null));
                C1205170hT1.LIZ.getClass();
                c2344009Gk.LJIIIIZZ("nearby_tab_name", C1205170hT1.LIZLLL);
                c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                Map<String, String> map = c2344009Gk.LIZ;
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ("ttls_nearby_tab_show_full", map, null);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NearbyTabViewFactory@513e.buildView$1$1$1$2$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NearbyTabViewFactory@513e.buildView$1$1$1$2$1");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS297S0000000_13 aFwS297S0000000_13, Object obj, Object obj2) {
        CostTimeline costTimeline = (CostTimeline) obj;
        C841020Wyy c841020Wyy = (C841020Wyy) obj2;
        C840990Wyv c840990Wyv = c841020Wyy.LIZJ.LIZ.LIZ().LJI;
        if (c840990Wyv.LIZ || c840990Wyv.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("id: ");
            sbLIZ.append(c841020Wyy.LIZJ.LIZ.LIZ().LIZ.LIZ);
            sbLIZ.append(" memberName:");
            sbLIZ.append(c841020Wyy.LIZJ.LIZ.LIZ().LIZ.LIZLLL);
            sbLIZ.append(" uuid:");
            sbLIZ.append(c841020Wyy.LIZJ.LIZ.LIZ().LJJIII);
            costTimeline.logTotal("guardPipelineCost", C2188811AlT.LIZIZ(sbLIZ));
            costTimeline.printLog("Helios:Network-Cost");
        }
        return Unit.LIZ;
    }
}
