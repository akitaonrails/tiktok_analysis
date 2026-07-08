package kotlin.jvm.internal;

import X.C09AY;
import X.C1171460gae;
import X.C1200450hLP;
import X.C2188811AlT;
import X.C259800zU;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS18S1210000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS18S1210000_18 awS18S1210000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload markdownContent skip full, defer=");
        sbLIZ.append(awS18S1210000_18.z3);
        sbLIZ.append(", fullEqFirst=");
        sbLIZ.append(Intrinsics.LJFF(((C259800zU) awS18S1210000_18.l1).element, ((C259800zU) awS18S1210000_18.l2).element));
        sbLIZ.append(", uuid=");
        sbLIZ.append(awS18S1210000_18.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS18S1210000_18 awS18S1210000_18) {
        String str = (String) ((Pair) awS18S1210000_18.l1).getSecond();
        if (str != null) {
            boolean z = awS18S1210000_18.z3;
            Context context = (Context) awS18S1210000_18.l2;
            String str2 = awS18S1210000_18.s0;
            if (z) {
                C1200450hLP.LIZ.getClass();
                C1200450hLP.LIZ(context, str2, "click_moreinfo");
            } else {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
                smartRouteBuildRoute.withParam("use_spark", true);
                smartRouteBuildRoute.withParam("url", str);
                smartRouteBuildRoute.withParam("title", "");
                smartRouteBuildRoute.withParam("show_separate_line", true);
                smartRouteBuildRoute.open();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS18S1210000_18 awS18S1210000_18) {
        C1171460gae c1171460gae = C1171460gae.LIZ;
        Aweme aweme = (Aweme) awS18S1210000_18.l1;
        String str = awS18S1210000_18.s0;
        boolean z = awS18S1210000_18.z3;
        Context context = (Context) awS18S1210000_18.l2;
        c1171460gae.getClass();
        C1171460gae.LIZJ(context, aweme, str, z);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS18S1210000_18 awS18S1210000_18) {
        C1171460gae c1171460gae = C1171460gae.LIZ;
        Aweme aweme = (Aweme) awS18S1210000_18.l1;
        String str = awS18S1210000_18.s0;
        boolean z = awS18S1210000_18.z3;
        Context context = (Context) awS18S1210000_18.l2;
        c1171460gae.getClass();
        C1171460gae.LIZIZ(context, aweme, str, z);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS18S1210000_18 awS18S1210000_18) {
        C1171460gae c1171460gae = C1171460gae.LIZ;
        Aweme aweme = (Aweme) awS18S1210000_18.l1;
        String str = awS18S1210000_18.s0;
        boolean z = awS18S1210000_18.z3;
        Context context = (Context) awS18S1210000_18.l2;
        c1171460gae.getClass();
        C1171460gae.LIZJ(context, aweme, str, z);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS18S1210000_18 awS18S1210000_18) {
        C1171460gae c1171460gae = C1171460gae.LIZ;
        Aweme aweme = (Aweme) awS18S1210000_18.l1;
        String str = awS18S1210000_18.s0;
        boolean z = awS18S1210000_18.z3;
        Context context = (Context) awS18S1210000_18.l2;
        c1171460gae.getClass();
        C1171460gae.LIZIZ(context, aweme, str, z);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1210000_18(Context context, Aweme aweme, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
        this.z3 = z;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S1210000_18(Pair pair, Pair<String, String> pair2, boolean z, Context context, String str) {
        super(0);
        this.$t = str;
        this.l1 = pair;
        this.z3 = pair2;
        this.l2 = z;
        this.s0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S1210000_18(boolean z, boolean z2, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, String str) {
        super(0);
        this.$t = str;
        this.z3 = z;
        this.l1 = z2;
        this.l2 = c259800zU;
        this.s0 = c259800zU2;
    }
}
