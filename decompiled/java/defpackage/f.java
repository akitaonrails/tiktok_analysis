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

/* JADX INFO: loaded from: classes29.dex */
public abstract class f extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "26093"));

    @InterfaceC1549730qQl(name = "ec_mall_get_previous_page", params = {""}, results = {"previousPage"})
    public final String name = "ec_mall_get_previous_page";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
    }

    @C040E
    public interface c extends XBaseResultModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "previousPage", required = true)
        String getPreviousPage();

        @InterfaceC1549470qQL(isGetter = false, keyPath = "previousPage", required = true)
        void setPreviousPage(String str);
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
