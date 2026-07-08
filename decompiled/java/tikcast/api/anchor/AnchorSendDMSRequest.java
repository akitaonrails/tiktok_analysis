package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorSendDMSRequest {

    @C09CT("source_task_type")
    public int sourceTaskType;

    @C09CT("send_to_uid_list")
    public List<Long> sendToUidList = new ArrayList();

    @C09CT("dm_text")
    public String dmText = "";
}
