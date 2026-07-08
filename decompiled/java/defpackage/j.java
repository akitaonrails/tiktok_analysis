package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C040E;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "28319"));

    @InterfaceC1549730qQl(name = "horizontalLoadMore", params = {"sessionId", "params"}, results = {"data"})
    public final String name = "horizontalLoadMore";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "params", nestedClassType = d.class, required = true)
        d getParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionId", required = true)
        String getSessionId();
    }

    /* JADX INFO: loaded from: classes10.dex */
    @C040E
    public interface c extends XBaseResultModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = true)
        String getData();

        @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = true)
        void setData(String str);
    }

    public interface d extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "backtrace", required = true)
        String getBacktrace();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "cursor", required = true)
        Number getCursor();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "ecomApiVersion", required = false)
        String getEcomApiVersion();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "log_id", required = true)
        String getLogId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "query", required = true)
        String getQuery();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "search_id", required = true)
        String getSearchId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "search_result_id", required = true)
        String getSearchResultId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "token_type", required = true)
        String getTokenType();
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
