package kotlin.jvm.internal;

import X.C013C;
import X.C01GW;
import X.C09AY;
import X.C1505650pHf;
import X.C1507770pL5;
import X.C1507780pL6;
import X.C1515820pY4;
import X.C1516130pYZ;
import X.C1523320pkA;
import X.C1523440pkM;
import X.C1523700pkm;
import X.C1523770pkt;
import X.C1523780pku;
import X.C1531930py3;
import X.C1532950pzh;
import X.C1534750q2b;
import X.C2188811AlT;
import X.C786410Ut5;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadEventParams;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AwS138S1200000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS138S1200000_23 awS138S1200000_23) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepared template data hit, key=");
        sbLIZ.append(awS138S1200000_23.s0);
        sbLIZ.append(", rawDataCleared=");
        if (((C1507770pL5) awS138S1200000_23.l1).LIZJ == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", monitorSize=");
        sbLIZ.append(((C1507780pL6) awS138S1200000_23.l2).LIZIZ.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS138S1200000_23 awS138S1200000_23) {
        C1523320pkA c1523320pkA = C1523320pkA.LL;
        String str = awS138S1200000_23.s0;
        C1507770pL5 c1507770pL5 = (C1507770pL5) awS138S1200000_23.l1;
        c1523320pkA.getClass();
        TemplateData templateDataLJ = C1523320pkA.LJ(str, c1507770pL5);
        if (templateDataLJ != null) {
            C1523320pkA.LLILZLL.LIZ(awS138S1200000_23.s0, "update_network", new AwS86S1300000_23((LynxView) awS138S1200000_23.l2, templateDataLJ, (C1507770pL5) awS138S1200000_23.l1, awS138S1200000_23.s0, 1));
        } else {
            Map mapLIZLLL = C1523320pkA.LIZLLL(awS138S1200000_23.s0, (C1507770pL5) awS138S1200000_23.l1, "update_network");
            C1523440pkM c1523440pkM = C1523320pkA.LLILZLL;
            String str2 = awS138S1200000_23.s0;
            c1523440pkM.LIZ(str2, "update_network", new AwS86S1300000_23((LynxView) awS138S1200000_23.l2, (LynxView) mapLIZLLL, (Map<String, ? extends Object>) awS138S1200000_23.l1, (C1507770pL5) str2, (String) 0));
        }
        C1523320pkA.LLILLJJLI.remove(awS138S1200000_23.s0);
        C1505650pHf c1505650pHf = C1505650pHf.LIZ;
        String str3 = awS138S1200000_23.s0;
        c1505650pHf.getClass();
        C1505650pHf.LIZIZ.remove(str3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS138S1200000_23 awS138S1200000_23) {
        Object objOpt;
        CopyOnWriteArrayList<Pair<ECSparkPreloadEventParams, ECSparkPreloadConfigItem>> copyOnWriteArrayList = C1523700pkm.LIZJ.get(awS138S1200000_23.s0);
        if (copyOnWriteArrayList != null) {
            JSONObject jSONObject = (JSONObject) awS138S1200000_23.l1;
            C013C c013c = (C013C) awS138S1200000_23.l2;
            String str = awS138S1200000_23.s0;
            for (Pair<ECSparkPreloadEventParams, ECSparkPreloadConfigItem> pair : copyOnWriteArrayList) {
                ECSparkPreloadEventParams first = pair.getFirst();
                ECSparkPreloadConfigItem second = pair.getSecond();
                C01GW c01gw = C1523700pkm.LIZ;
                List<Map<String, String>> list = first.matchers;
                String strOptString = null;
                if (list != null) {
                    if (!list.isEmpty()) {
                        for (Map<String, String> map : list) {
                            if (!map.isEmpty()) {
                                for (Map.Entry<String, String> entry : map.entrySet()) {
                                    if (jSONObject != null) {
                                        objOpt = jSONObject.opt(entry.getKey());
                                    } else {
                                        objOpt = null;
                                    }
                                    if (!Intrinsics.LJFF(objOpt, entry.getValue())) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                c013c.element = true;
                C1523770pkt c1523770pkt = C1523770pkt.LIZ;
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("page_name");
                }
                c1523770pkt.LIZ(second, new C1523780pku(strOptString, str));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS138S1200000_23 awS138S1200000_23) {
        C1523770pkt c1523770pkt = C1523770pkt.LIZ;
        C1523780pku c1523780pku = (C1523780pku) awS138S1200000_23.l1;
        String str = awS138S1200000_23.s0;
        int i = ((ECSparkPreloadConfigItem) awS138S1200000_23.l2).preloadType;
        c1523770pkt.getClass();
        c1523770pkt.getClass();
        C1523770pkt.LIZJ(c1523780pku, str, i, "cancel_clean", 0L);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS138S1200000_23 awS138S1200000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parameter ");
        sbLIZ.append((String) ((Map.Entry) awS138S1200000_23.l1).getKey());
        sbLIZ.append(" already exists for ");
        sbLIZ.append(awS138S1200000_23.s0);
        sbLIZ.append(", except:");
        sbLIZ.append((String) ((Map.Entry) awS138S1200000_23.l1).getValue());
        sbLIZ.append(", current:");
        C1531930py3 c1531930py3 = (C1531930py3) awS138S1200000_23.l2;
        sbLIZ.append(c1531930py3.LIZ.LIZJ((String) ((Map.Entry) awS138S1200000_23.l1).getKey()));
        sbLIZ.append('.');
        return new C1534750q2b("GeckoUtils", C2188811AlT.LIZIZ(sbLIZ), null, 28);
    }

    public static final Object invoke$5(AwS138S1200000_23 awS138S1200000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forestX: ");
        sbLIZ.append(((C1532950pzh) awS138S1200000_23.l1).LIZ.LIZ);
        sbLIZ.append(", event:");
        sbLIZ.append(awS138S1200000_23.s0);
        sbLIZ.append(", data:");
        sbLIZ.append((JSONObject) awS138S1200000_23.l2);
        return new C1534750q2b("GeckoUtils", "event", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS138S1200000_23 awS138S1200000_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=defer_released requestId=");
        sbLIZ.append(((C1515820pY4) awS138S1200000_23.l1).LLILLL);
        sbLIZ.append(" seq=");
        sbLIZ.append(((C1516130pYZ) awS138S1200000_23.l2).LIZ);
        sbLIZ.append(" reason=prefer ruleKey=");
        sbLIZ.append(awS138S1200000_23.s0);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS138S1200000_23(C1515820pY4 c1515820pY4, C1515820pY4<byte[]> c1515820pY42, C1516130pYZ<Object> c1516130pYZ, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1515820pY4;
        this.l2 = c1515820pY42;
        this.s0 = c1516130pYZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1200000_23(C1523780pku c1523780pku, String str, ECSparkPreloadConfigItem eCSparkPreloadConfigItem, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1523780pku;
        this.s0 = str;
        this.l2 = eCSparkPreloadConfigItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1200000_23(C1532950pzh c1532950pzh, String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1532950pzh;
        this.s0 = str;
        this.l2 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1200000_23(String str, C1507770pL5 c1507770pL5, C1507780pL6 c1507780pL6, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1507770pL5;
        this.l2 = c1507780pL6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1200000_23(String str, C1507770pL5 c1507770pL5, LynxView lynxView, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1507770pL5;
        this.l2 = lynxView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1200000_23(String str, JSONObject jSONObject, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = jSONObject;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS138S1200000_23(Map.Entry entry, Map.Entry<String, String> entry2, String str, C1531930py3 c1531930py3) {
        super(0);
        this.$t = c1531930py3;
        this.l1 = entry;
        this.s0 = entry2;
        this.l2 = str;
    }
}
