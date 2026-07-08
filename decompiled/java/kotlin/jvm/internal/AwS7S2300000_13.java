package kotlin.jvm.internal;

import X.C09AY;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.routing.CommonFlowRouteAction;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS7S2300000_13 extends C09AY implements Function1 {
    public final int $t;
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

    public static final Object invoke$0(AwS7S2300000_13 awS7S2300000_13, Object obj) {
        SafeEnvData safeEnvData = (SafeEnvData) obj;
        if (safeEnvData.safe) {
            ((CommonFlowRouteAction) awS7S2300000_13.l2).LLILLJJLI.changeUnverifiedEmail((Activity) awS7S2300000_13.l3, awS7S2300000_13.s0, awS7S2300000_13.s1, (Bundle) awS7S2300000_13.l4, true, null);
        } else {
            ((CommonFlowRouteAction) awS7S2300000_13.l2).LLILLJJLI.changeEmailWithTypes((Activity) awS7S2300000_13.l3, awS7S2300000_13.s0, new ArrayList<>(safeEnvData.LIZ()), (Bundle) awS7S2300000_13.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S2300000_13 awS7S2300000_13, Object obj) {
        SafeEnvData safeEnvData = (SafeEnvData) obj;
        if (safeEnvData.safe) {
            ((CommonFlowRouteAction) awS7S2300000_13.l2).LLILLJJLI.bindMobile((Activity) awS7S2300000_13.l3, awS7S2300000_13.s0, awS7S2300000_13.s1, (Bundle) awS7S2300000_13.l4, true, null);
        } else {
            ((CommonFlowRouteAction) awS7S2300000_13.l2).LLILLJJLI.changeMobileWithTypes((Activity) awS7S2300000_13.l3, awS7S2300000_13.s0, new ArrayList<>(safeEnvData.LIZ()), (Bundle) awS7S2300000_13.l4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S2300000_13(CommonFlowRouteAction commonFlowRouteAction, Activity activity, String str, String str2, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l2 = commonFlowRouteAction;
        this.l3 = activity;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = bundle;
    }
}
