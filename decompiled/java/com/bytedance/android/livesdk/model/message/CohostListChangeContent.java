package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CohostListChangeContent {

    @C09CT("users")
    public List<CohostListUser> users;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        sb.replace(0, 2, "CohostListChangeContent{");
        sb.append('}');
        return sb.toString();
    }
}
