package defpackage;

import X.AbstractC1549150qPp;
import X.C040D;
import X.C2097908Jt;
import X.EnumC1063530dmZ;
import X.InterfaceC1549470qQL;
import X.InterfaceC1549730qQl;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b extends AbstractC1549150qPp<a, Object> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29726"));

    @InterfaceC1549730qQl(name = "adComponentSize", params = {Scene.SCENE_SERVICE, "size"})
    public final String name = "adComponentSize";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    @C040D
    public interface a extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
        String getScene();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "size", nestedClassType = c.class, required = true)
        c getSize();
    }

    /* JADX INFO: renamed from: b$b, reason: collision with other inner class name */
    public static final class C0007b {
    }

    public interface c extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "height", required = true)
        Number getHeight();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "width", required = true)
        Number getWidth();
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
