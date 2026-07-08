package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public abstract class c extends AbstractC1549150qPp<a, Object> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "28065"));

    @InterfaceC1549730qQl(name = "adComponentStatus", params = {FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Scene.SCENE_SERVICE})
    public final String name = "adComponentStatus";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    @C040D
    public interface a extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
        String getScene();

        @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
        Number getStatus();
    }

    public static final class b {
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
