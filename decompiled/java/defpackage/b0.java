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
public abstract class b0 extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "28665"));

    @InterfaceC1549730qQl(name = "searchRequestPermission", params = {"permissionType", "permissionSubType", "enterMethod"}, results = {"requestResult", "locationMobParams"})
    public final String name = "searchRequestPermission";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = false)
        String getEnterMethod();

        @InterfaceC1909207dq(option = {2, 3})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "permissionSubType", required = true)
        Number getPermissionSubType();

        @InterfaceC1909207dq(option = {1})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "permissionType", required = true)
        Number getPermissionType();
    }

    @C040E
    public interface c extends XBaseResultModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "locationMobParams", required = true)
        Map<String, Object> getLocationMobParams();

        @InterfaceC1909207dq(option = {1, 2, 3, 4, 5})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "requestResult", required = true)
        Number getRequestResult();

        @InterfaceC1549470qQL(isGetter = false, keyPath = "locationMobParams", required = true)
        void setLocationMobParams(Map<String, ? extends Object> map);

        @InterfaceC1909207dq(option = {1, 2, 3, 4, 5})
        @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "requestResult", required = true)
        void setRequestResult(Number number);
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
