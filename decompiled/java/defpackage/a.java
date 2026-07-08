package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes31.dex */
public abstract class a extends AbstractC1549150qPp<InterfaceC0001a, Object> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "33223"));

    @InterfaceC1549730qQl(name = "AIBotToTako", params = {"enter_source", "enter_from", "enter_method", "search_id", "bot_info", "extra_info"}, results = {"code", "msg"})
    public final String name = "AIBotToTako";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    /* JADX INFO: renamed from: a$a, reason: collision with other inner class name */
    @C040D
    public interface InterfaceC0001a extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "bot_info", nestedClassType = c.class, required = true)
        c getBotInfo();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = true)
        String getEnterFrom();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = true)
        String getEnterMethod();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_source", required = true)
        String getEnterSource();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_info", required = false)
        Map<String, Object> getExtraInfo();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "search_id", required = true)
        String getSearchId();
    }

    public static final class b {
    }

    public interface c extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "bot_id", required = true)
        String getBotId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "bot_image", required = true)
        String getBotImage();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "bot_name", required = true)
        String getBotName();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_info", required = false)
        Map<String, Object> getExtraInfo();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "query", required = true)
        String getQuery();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "start_msg", required = true)
        String getStartMsg();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "start_sug", primitiveClassType = String.class, required = true)
        List<String> getStartSug();
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
