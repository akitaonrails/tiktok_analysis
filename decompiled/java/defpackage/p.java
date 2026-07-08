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
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p extends AbstractC1549150qPp<b, c> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29796"));

    @InterfaceC1549730qQl(name = "playMusic", params = {"music", "music_extra", "from_card_type"})
    public final String name = "playMusic";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PROTECT;

    public static final class a {
    }

    @C040D
    public interface b extends XBaseParamModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "from_card_type", required = false)
        String getFromCardType();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "music", required = true)
        Map<String, Object> getMusic();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "music_extra", nestedClassType = d.class, required = false)
        d getMusicExtra();
    }

    @C040E
    public interface c extends XBaseResultModel {
    }

    public interface d extends XBaseModel {
        @InterfaceC1549470qQL(isGetter = true, keyPath = "clickEventKey", required = false)
        String getClickEventKey();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "containerID", required = false)
        String getContainerID();

        @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = true)
        String getId();

        @InterfaceC1549470qQL(isGetter = true, keyPath = "repeat", required = false)
        Boolean getRepeat();
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
