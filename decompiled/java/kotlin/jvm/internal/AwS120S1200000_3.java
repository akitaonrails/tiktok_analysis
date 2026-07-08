package kotlin.jvm.internal;

import X.C09AY;
import X.C1741890vQh;
import X.C2097608Jq;
import X.C2124108Tv;
import X.C2124208Tw;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS120S1200000_3 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS120S1200000_3 awS120S1200000_3) {
        TermsConditionsAssem termsConditionsAssem = (TermsConditionsAssem) awS120S1200000_3.l1;
        Context context = ((TuxTextView) awS120S1200000_3.l2).getContext();
        String str = awS120S1200000_3.s0;
        termsConditionsAssem.getClass();
        if (str != null && str.length() != 0) {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("use_spark", "1");
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
            smartRouteBuildRoute.withParam("url", builderAppendQueryParameter.toString());
            smartRouteBuildRoute.withParam("use_webview_title", true);
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS120S1200000_3 awS120S1200000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData uniqueId=");
        sbLIZ.append(awS120S1200000_3.s0);
        sbLIZ.append(" requestKey=");
        sbLIZ.append(((C2124208Tw) awS120S1200000_3.l1).LIZ);
        sbLIZ.append(" payload=");
        C2124108Tv c2124108Tv = C2124108Tv.LL;
        Map map = (Map) awS120S1200000_3.l2;
        c2124108Tv.getClass();
        Object objLIZ = C2124108Tv.LIZ(map);
        if (objLIZ == null) {
            objLIZ = C2097608Jq.LJ();
        }
        sbLIZ.append(C1741890vQh.LJIIIIZZ(objLIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS120S1200000_3 awS120S1200000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store consume pending uniqueId=");
        sbLIZ.append(awS120S1200000_3.s0);
        sbLIZ.append(" consumedCount=");
        sbLIZ.append(((List) awS120S1200000_3.l1).size());
        sbLIZ.append(" pendingCount=");
        sbLIZ.append(((ConcurrentHashMap) awS120S1200000_3.l2).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS120S1200000_3 awS120S1200000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store update uniqueId=");
        sbLIZ.append(awS120S1200000_3.s0);
        sbLIZ.append(" requestKey=");
        sbLIZ.append(((C2124208Tw) awS120S1200000_3.l1).LIZ);
        sbLIZ.append(" pendingCount=");
        sbLIZ.append(((ConcurrentHashMap) awS120S1200000_3.l2).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS120S1200000_3 awS120S1200000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store deliver item uniqueId=");
        sbLIZ.append(awS120S1200000_3.s0);
        sbLIZ.append(" requestKey=");
        sbLIZ.append(((C2124208Tw) awS120S1200000_3.l1).LIZ);
        sbLIZ.append(" pendingCount=");
        sbLIZ.append(((ConcurrentHashMap) awS120S1200000_3.l2).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS120S1200000_3 awS120S1200000_3) {
        String str;
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(awS120S1200000_3.s0).buildUpon().appendQueryParameter("use_spark", "1");
        PolicyBodyLinkList policyBodyLinkList = (PolicyBodyLinkList) awS120S1200000_3.l1;
        if (policyBodyLinkList == null || (str = policyBodyLinkList.name) == null) {
            str = "";
        }
        SmartRouter.buildRoute((Context) awS120S1200000_3.l2, builderAppendQueryParameter.appendQueryParameter("title", str).build().toString()).open();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1200000_3(TermsConditionsAssem termsConditionsAssem, TuxTextView tuxTextView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = termsConditionsAssem;
        this.l2 = tuxTextView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS120S1200000_3(String str, String str2, C2124208Tw c2124208Tw, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c2124208Tw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS120S1200000_3(String str, String str2, C2124208Tw c2124208Tw, ConcurrentHashMap<String, C2124208Tw> concurrentHashMap) {
        super(0);
        this.$t = concurrentHashMap;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c2124208Tw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1200000_3(String str, PolicyBodyLinkList policyBodyLinkList, Context context, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = policyBodyLinkList;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS120S1200000_3(String str, String str2, List<C2124208Tw> list, ConcurrentHashMap<String, C2124208Tw> concurrentHashMap) {
        super(0);
        this.$t = concurrentHashMap;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = list;
    }
}
