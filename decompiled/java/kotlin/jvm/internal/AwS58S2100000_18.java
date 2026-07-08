package kotlin.jvm.internal;

import X.C06UM;
import X.C098200Yq;
import X.C09AY;
import X.C1066680dre;
import X.C1381150m2r;
import X.C189200o6;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS58S2100000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS58S2100000_18 awS58S2100000_18) {
        String str;
        PoiDataStruct poiDataStruct = ((Aweme) awS58S2100000_18.l2).getPoiDataStruct();
        if (poiDataStruct == null || (str = poiDataStruct.poiName) == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selfPreload: enableSlashLiteCache and contains industry, ");
        sbLIZ.append(awS58S2100000_18.s0);
        sbLIZ.append(", poiId: ");
        sbLIZ.append(awS58S2100000_18.s1);
        sbLIZ.append(", poiName: ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS58S2100000_18 awS58S2100000_18) {
        String str;
        PoiDataStruct poiDataStruct = ((Aweme) awS58S2100000_18.l2).getPoiDataStruct();
        if (poiDataStruct == null || (str = poiDataStruct.poiName) == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selfPreload: not enableSlashLiteCache or not contains industry, ");
        sbLIZ.append(awS58S2100000_18.s0);
        sbLIZ.append(" , poiId: ");
        sbLIZ.append(awS58S2100000_18.s1);
        sbLIZ.append(", poiName: ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS58S2100000_18 awS58S2100000_18) {
        Map map = (Map) awS58S2100000_18.l2;
        String str = awS58S2100000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = awS58S2100000_18.s1;
        if (str3 != null) {
            str2 = str3;
        }
        try {
            C1066680dre.LIZ("report", map);
            IReportService.LIZ.getClass();
            C06UM.LIZ().report(new C1381150m2r(str, str2));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S2100000_18(Aweme aweme, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = aweme;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS58S2100000_18(String str, String str2, String str3, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
