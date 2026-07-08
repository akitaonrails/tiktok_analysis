package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g extends AbstractC1549150qPp<b, Object> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "26981"));

    @InterfaceC1549730qQl(name = "ecOpenAlert", params = {"title", "content", "buttons", FollowStatusChangeMethod.PARAM_UID})
    public final String name = "ecOpenAlert";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "buttons", nestedClassType = c.class, required = true)
        c getButtons();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = true)
        String getContent();

        @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
        String getId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
        String getTitle();
    }

    public interface c extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "cancel", nestedClassType = d.class, required = true)
        d getCancel();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "confirm", nestedClassType = e.class, required = true)
        e getConfirm();
    }

    public interface d extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "text", required = true)
        String getText();
    }

    public interface e extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "text", required = true)
        String getText();
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
