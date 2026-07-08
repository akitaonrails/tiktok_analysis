package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.SessionInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class WriteImpressionRequest implements Serializable {

    @C09CT("feed_list")
    public final List<Feed> feedList;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_info")
    public final SessionInfo sessionInfo;

    public WriteImpressionRequest() {
        this(null, null, null, 7, null);
    }

    public WriteImpressionRequest(String str, List<Feed> list, SessionInfo sessionInfo) {
        this.scene = str;
        this.feedList = list;
        this.sessionInfo = sessionInfo;
    }

    public WriteImpressionRequest(String str, List list, SessionInfo sessionInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : sessionInfo);
    }
}
