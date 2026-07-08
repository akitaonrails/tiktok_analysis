package tikcast.api.privilege;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveNameFrameEntry {

    @C09CT("live_name_frame_list")
    public List<UserPrivilege> liveNameFrameList = new ArrayList();

    @C09CT("red_dot_map")
    public Map<String, PrivilegeFERedDot> redDotMap = new LinkedHashMap();
}
