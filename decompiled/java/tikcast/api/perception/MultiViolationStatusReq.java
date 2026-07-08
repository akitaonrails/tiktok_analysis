package tikcast.api.perception;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiViolationStatusReq {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("scenes")
    public List<Integer> scenes = new ArrayList();
}
