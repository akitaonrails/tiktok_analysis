package kotlin.jvm.internal;

import X.C09AY;
import X.C0K0S;
import X.C0K1G;
import X.C1909107dp;
import X.C2097608Jq;
import X.C2382909Vj;
import X.C479650IrT;
import X.C510630K0v;
import X.C511970K5z;
import X.C519690KZr;
import X.InterfaceC479210Iql;
import X.InterfaceC519720KZu;
import X.InterfaceC634840OvC;
import androidx.activity.ComponentActivity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectionVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class AwS285S0300000_7 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS285S0300000_7 awS285S0300000_7, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        InterfaceC634840OvC interfaceC634840OvC = ((C519690KZr) awS285S0300000_7.l0).IBridgeSdkContext;
        if (interfaceC634840OvC != null && interfaceC634840OvC.getContext() != null) {
            CompletionBlock completionBlock = (CompletionBlock) awS285S0300000_7.l1;
            ComponentActivity componentActivity = (ComponentActivity) awS285S0300000_7.l2;
            if (zBooleanValue) {
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC519720KZu.class, null);
                ((InterfaceC519720KZu) xBaseModelLIZJ).setId(String.valueOf(componentActivity.hashCode()));
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "create window live player success");
            } else {
                if (str == null) {
                    str = "create window live player failed";
                }
                C2382909Vj.LIZ(completionBlock, -1, str, null, 4);
            }
        } else {
            C2382909Vj.LIZ((CompletionBlock) awS285S0300000_7.l1, -1, "context is null!!", null, 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS285S0300000_7 awS285S0300000_7, Object obj, Object obj2) {
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = ((C0K0S) awS285S0300000_7.l0).LJ;
        if (subscriptionPrivilegeDetailFragment != null) {
            String str = ((C510630K0v) awS285S0300000_7.l1).LIZ;
            ((C0K1G) awS285S0300000_7.l2).getClass();
            Map mapLJ = C2097608Jq.LJ();
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_privilege_intro_item_show");
            subscriptionPrivilegeDetailFragment.mS(c511970K5z);
            c511970K5z.LIZIZ(str, "privilege_page");
            c511970K5z.LIZJ(mapLJ);
            c511970K5z.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS285S0300000_7 awS285S0300000_7, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        ((C479650IrT) awS285S0300000_7.l0).LIZ((InterfaceC479210Iql) awS285S0300000_7.l1, ((LiveHangoutV2SelectionVM) awS285S0300000_7.l2).getState());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS285S0300000_7(C479650IrT c479650IrT, InterfaceC479210Iql interfaceC479210Iql, LiveHangoutV2SelectionVM liveHangoutV2SelectionVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = c479650IrT;
        this.l1 = interfaceC479210Iql;
        this.l2 = liveHangoutV2SelectionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS285S0300000_7(C0K0S c0k0s, C510630K0v c510630K0v, C0K1G c0k1g, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0k0s;
        this.l1 = c510630K0v;
        this.l2 = c0k1g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS285S0300000_7(C519690KZr c519690KZr, C519690KZr c519690KZr2, CompletionBlock<InterfaceC519720KZu> completionBlock, ComponentActivity componentActivity) {
        super(2);
        this.$t = componentActivity;
        this.l0 = c519690KZr;
        this.l1 = c519690KZr2;
        this.l2 = completionBlock;
    }
}
