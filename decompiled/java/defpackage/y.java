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
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "27104"));

    @InterfaceC1549730qQl(name = "searchRefreshLocation", params = {"refreshLocationAccuracy", "byUser"}, results = {"refreshResult", "locationMobParams"})
    public final String name = "searchRefreshLocation";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1909207dq(option = {0, 1})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "byUser", required = true)
        Number getByUser();

        @InterfaceC1909207dq(option = {2, 3})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "refreshLocationAccuracy", required = true)
        Number getRefreshLocationAccuracy();
    }

    @C040E
    public interface c extends XBaseResultModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "locationMobParams", required = true)
        Map<String, Object> getLocationMobParams();

        @InterfaceC1909207dq(option = {0, 1, 2})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "refreshResult", required = true)
        Number getRefreshResult();

        @InterfaceC1549470qQL(isGetter = false, keyPath = "locationMobParams", required = true)
        void setLocationMobParams(Map<String, ? extends Object> map);

        @InterfaceC1909207dq(option = {0, 1, 2})
        @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "refreshResult", required = true)
        void setRefreshResult(Number number);
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
