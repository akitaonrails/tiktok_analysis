package tikcast.api.privilege.user_level;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class BatchSendInboxRequest {

    @C09CT("inbox_type")
    public int inboxType;

    @C09CT("to_user_id_list")
    public List<Long> toUserIdList = new ArrayList();
}
