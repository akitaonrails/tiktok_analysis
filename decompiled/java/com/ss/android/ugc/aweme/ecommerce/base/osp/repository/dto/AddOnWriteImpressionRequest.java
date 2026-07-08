package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class AddOnWriteImpressionRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("feed_list")
    public final List<AddOnFeed> feedList;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_info")
    public final SessionInfo sessionInfo;

    public AddOnWriteImpressionRequest(String str, List<AddOnFeed> list, SessionInfo sessionInfo) {
        this.scene = str;
        this.feedList = list;
        this.sessionInfo = sessionInfo;
    }

    public AddOnWriteImpressionRequest(String str, List list, SessionInfo sessionInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : sessionInfo);
    }
}
