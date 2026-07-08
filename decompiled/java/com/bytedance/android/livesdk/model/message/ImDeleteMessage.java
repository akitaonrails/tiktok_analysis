package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ImDeleteMessage extends AbstractC1136060ffY {

    @C09CT("delete_msg_ids")
    public List<Long> deleteMsgIds;

    @C09CT("delete_user_ids")
    public List<Long> deleteUserIds;

    public ImDeleteMessage() {
        this.type = C001A.IM_DELETE;
        this.deleteMsgIds = Collections.emptyList();
        this.deleteUserIds = Collections.emptyList();
    }
}
