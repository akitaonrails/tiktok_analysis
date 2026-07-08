package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C040E;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import X.InterfaceC1909207dq;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "25979"));

    @InterfaceC1549730qQl(name = "searchRefreshMonitor", params = {"networkStart", "networkEnd", "itemCount", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "viewDrawEnd"})
    public final String name = "searchRefreshMonitor";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PROTECT;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "itemCount", required = true)
        Number getItemCount();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "networkEnd", required = true)
        Number getNetworkEnd();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "networkStart", required = true)
        Number getNetworkStart();

        @InterfaceC1909207dq(option = {0, 1})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
        Number getStatus();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "viewDrawEnd", required = true)
        Number getViewDrawEnd();
    }

    @C040E
    public interface c extends XBaseResultModel {
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final EnumC1063530dmZ getAccess() {
        return this.LL;
    }

    @Override // X.InterfaceC1063710dmr
    public final String getName() {
        return this.name;
    }
}
