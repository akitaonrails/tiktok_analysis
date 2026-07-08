package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiSendDmsRequest {

    @C09CT("room_id")
    public long roomId;

    @C09CT("send_to_uid_list")
    public List<Long> sendToUidList = new ArrayList();

    @C09CT("dm_text")
    public String dmText = "";
}
