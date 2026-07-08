package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IBusiness {

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("preview")
    public Preview preview;

    @C09CT("priority")
    public long priority;

    @C09CT("unify_base_id")
    public int unifyBaseId;

    @C09CT("use_backend_render")
    public boolean useBackendRender;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("name")
    public String name = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("filter")
    public List<Filter> filter = new ArrayList();
}
