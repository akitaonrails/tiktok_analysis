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
public abstract class v extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29879"));

    @InterfaceC1549730qQl(name = "searchCloseCard", params = {"rank"}, results = {"code"})
    public final String name = "searchCloseCard";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "rank", required = true)
        Number getRank();
    }

    @C040E
    public interface c extends XBaseResultModel {
        @InterfaceC1909207dq(option = {1, 0, -1, -2})
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "code", required = true)
        Number getCode();

        @InterfaceC1909207dq(option = {1, 0, -1, -2})
        @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "code", required = true)
        void setCode(Number number);
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
