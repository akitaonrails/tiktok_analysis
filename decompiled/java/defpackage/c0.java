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
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c0 extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29927"));

    @InterfaceC1549730qQl(name = "searchRequestSuccess", params = {"global_doodle_config", "extra", "log_pb", "is_load_more"})
    public final String name = "searchRequestSuccess";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", nestedClassType = d.class, required = true)
        d getExtra();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "global_doodle_config", nestedClassType = e.class, required = true)
        e getGlobalDoodleConfig();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "log_pb", nestedClassType = f.class, required = true)
        f getLogPb();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "is_load_more", required = true)
        boolean isLoadMore();
    }

    @C040E
    public interface c extends XBaseResultModel {
    }

    public interface d extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "fatal_item_ids", required = false)
        List<Object> getFatalItemIds();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "logid", required = false)
        String getLogid();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "now", required = false)
        Number getNow();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "search_request_id", required = false)
        String getSearchRequestId();
    }

    public interface e extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "display_filter_bar", required = false)
        Number getDisplayFilterBar();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = false)
        String getKeyword();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "new_source", required = false)
        String getNewSource();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "search_channel", required = false)
        String getSearchChannel();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "sounds_list_type", required = false)
        Number getSoundsListType();
    }

    public interface f extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "impr_id", required = false)
        String getImprId();
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
