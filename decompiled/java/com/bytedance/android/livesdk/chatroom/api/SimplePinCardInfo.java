package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SimplePinCardInfo {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("type")
    public int type;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("content")
    public String content = "";

    @C09CT("title")
    public String title = "";

    @C09CT("icons")
    public List<ImageModel> icons = new ArrayList();

    @C09CT("backgrounds")
    public List<Background> backgrounds = new ArrayList();

    @C09CT("platform_key")
    public String platformKey = "";

    public static final class Background {

        @C09CT("angle_deg")
        public long angleDeg;

        @C09CT("type")
        public String type = "";

        @C09CT("stops")
        public List<Stop> stops = new ArrayList();

        public static final class Stop {

            @C09CT("color")
            public String color = "";

            @C09CT("pos")
            public long pos;
        }
    }
}
