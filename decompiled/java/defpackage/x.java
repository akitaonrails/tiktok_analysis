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
public abstract class x extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "40789"));

    @InterfaceC1549730qQl(name = "searchOpenSchema", params = {"schema", "log_params", "bundle_params", "extra", "page_data", "awemePoolBundleParams"})
    public final String name = "searchOpenSchema";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PROTECT;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "awemePoolBundleParams", nestedClassType = d.class, required = false)
        d getAwemePoolBundleParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "bundle_params", required = false)
        Map<String, Object> getBundleParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
        Map<String, Object> getExtra();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "log_params", required = true)
        Map<String, Object> getLogParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "page_data", required = false)
        Map<String, Object> getPageData();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
        String getSchema();
    }

    @C040E
    public interface c extends XBaseResultModel {
    }

    public interface d extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "bundlerExtraParams", required = false)
        Map<String, Object> getBundlerExtraParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "continueToPlay", required = false)
        Boolean getContinueToPlay();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "entryAwemeIdentifier", nestedClassType = e.class, required = true)
        e getEntryAwemeIdentifier();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "inflowCountAwemes", primitiveClassType = String.class, required = false)
        List<String> getInflowCountAwemes();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "loadMoreRequest", nestedClassType = g.class, required = false)
        g getLoadMoreRequest();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "needGeneralSearchVideos", required = false)
        Boolean getNeedGeneralSearchVideos();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "openKeyframePanel", required = false)
        Boolean getOpenKeyframePanel();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "photoPosition", required = false)
        Number getPhotoPosition();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "seedConfigParams", nestedClassType = h.class, required = true)
        List<h> getSeedConfigParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "seekTime", required = false)
        Number getSeekTime();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "shouldBackToEntry", required = false)
        Boolean getShouldBackToEntry();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
        String getTitle();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "toast", required = false)
        String getToast();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "transitionType", required = false)
        Number getTransitionType();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "useVerticalTransitionIndex", required = false)
        Boolean getUseVerticalTransitionIndex();
    }

    public interface e extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeID", required = true)
        String getAwemeID();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "elementID", required = false)
        String getElementID();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "itemKey", required = false)
        String getItemKey();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "tabIndex", required = false)
        Number getTabIndex();
    }

    public interface f extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "requestFieldKey", required = true)
        String getRequestFieldKey();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "responseFieldKey", required = true)
        String getResponseFieldKey();
    }

    public interface g extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeListPath", required = true)
        String getAwemeListPath();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "fieldKeyMapList", nestedClassType = f.class, required = false)
        List<f> getFieldKeyMapList();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
        String getUrl();
    }

    public interface h extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeIDList", primitiveClassType = String.class, required = true)
        List<String> getAwemeIDList();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "itemKey", required = false)
        String getItemKey();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "loadMoreParams", required = false)
        Map<String, Object> getLoadMoreParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "logParams", required = false)
        Map<String, Object> getLogParams();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "tabCount", required = false)
        Number getTabCount();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "tabIndex", required = false)
        Number getTabIndex();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "tabShowName", required = false)
        String getTabShowName();
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
