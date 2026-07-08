package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C040E;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "38199"));

    @InterfaceC1549730qQl(name = "requestSearchHorizontalData", params = {"searchId", "query", "backtrace", "logId", "tokenType", "cursor", "count", "horizontalSessionid", "tabIndex", "requestParams", "requestPath", "awemeListPath"})
    public final String name = "requestSearchHorizontalData";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeListPath", required = false)
        String getAwemeListPath();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "backtrace", required = false)
        String getBacktrace();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "count", required = false)
        Number getCount();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "cursor", required = false)
        Number getCursor();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "horizontalSessionid", required = false)
        Object getHorizontalSessionid();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "logId", required = false)
        String getLogId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "query", required = false)
        String getQuery();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "requestParams", required = false)
        Map<String, Object> getRequestParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "requestPath", required = false)
        String getRequestPath();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "searchId", required = false)
        String getSearchId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "tabIndex", required = false)
        Number getTabIndex();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "tokenType", required = false)
        String getTokenType();
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
