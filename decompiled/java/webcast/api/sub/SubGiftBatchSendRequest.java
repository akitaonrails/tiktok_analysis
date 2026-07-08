package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubGiftBatchSendRequest {

    @C09CT("receiver_uid_list")
    public List<String> receiverUidList = new ArrayList();

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("package_id")
    public String packageId = "";
}
