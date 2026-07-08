package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C0BV4;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class CustomBizData implements Serializable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("awemes")
    public final List<Aweme> awemes;

    @C09CT("event")
    public final EcLiveEvent event;

    @C09CT("room_info")
    public final String roomInfo;

    @C09CT("type")
    public final int type;

    @C09CT("user")
    public final User user;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomBizData(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", roomInfo=");
        sbLIZ.append(this.roomInfo);
        sbLIZ.append(", awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(", event=");
        sbLIZ.append(this.event);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        String uid;
        String uid2;
        String aid;
        if (!C0BV4.LIZ()) {
            return super.equals(obj);
        }
        if (!(obj instanceof CustomBizData)) {
            return false;
        }
        User user = this.user;
        String aid2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        CustomBizData customBizData = (CustomBizData) obj;
        User user2 = customBizData.user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        if (!Intrinsics.LJFF(uid, uid2) || this.type != customBizData.type) {
            return false;
        }
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = customBizData.aweme;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        if (!Intrinsics.LJFF(aid, aid2) || !Intrinsics.LJFF(this.roomInfo, customBizData.roomInfo) || !Intrinsics.LJFF(this.event, customBizData.event)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomBizData(User user, Aweme aweme, int i, String str, List<? extends Aweme> list, EcLiveEvent ecLiveEvent) {
        this.user = user;
        this.aweme = aweme;
        this.type = i;
        this.roomInfo = str;
        this.awemes = list;
        this.event = ecLiveEvent;
    }
}
