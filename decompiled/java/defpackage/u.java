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
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes24.dex */
public abstract class u extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "27876"));

    @InterfaceC1549730qQl(name = "reuseKitView", params = {"biz", "matchCacheRegex", "volumn", "expiredTimeInSeconds", "allowSchemaList", "denySchemaList"})
    public final String name = "reuseKitView";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "allowSchemaList", primitiveClassType = String.class, required = false)
        List<String> getAllowSchemaList();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "biz", required = true)
        String getBiz();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "denySchemaList", primitiveClassType = String.class, required = false)
        List<String> getDenySchemaList();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "expiredTimeInSeconds", required = false)
        Number getExpiredTimeInSeconds();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "matchCacheRegex", required = false)
        String getMatchCacheRegex();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "volumn", required = false)
        Number getVolumn();
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
