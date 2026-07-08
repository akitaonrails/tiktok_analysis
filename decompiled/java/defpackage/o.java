package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C040E;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import X.InterfaceC1909307dr;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "38578"));

    @InterfaceC1549730qQl(name = "pipo.getNfcStatus", params = {""}, results = {"result"})
    public final String name = "pipo.getNfcStatus";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
    }

    /* JADX INFO: loaded from: classes27.dex */
    @C040E
    public interface c extends XBaseResultModel {
        @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "result", required = true)
        @InterfaceC1909307dr(option = {"UNAVAILABLE", "ENABLED", "DISABLED"})
        String getResult();

        @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "result", required = true)
        @InterfaceC1909307dr(option = {"UNAVAILABLE", "ENABLED", "DISABLED"})
        void setResult(String str);
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
