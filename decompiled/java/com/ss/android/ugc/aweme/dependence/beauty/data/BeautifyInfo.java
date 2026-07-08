package com.ss.android.ugc.aweme.dependence.beauty.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BeautifyInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String effectId;

    @C09CT("tags")
    public final List<BeautifyTag> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautifyInfo)) {
            return false;
        }
        BeautifyInfo beautifyInfo = (BeautifyInfo) obj;
        return Intrinsics.LJFF(this.effectId, beautifyInfo.effectId) && Intrinsics.LJFF(this.tags, beautifyInfo.tags);
    }

    public BeautifyInfo() {
        this("-1", new ArrayList());
    }

    public BeautifyInfo(String str, List<BeautifyTag> list) {
        this.effectId = str;
        this.tags = list;
    }
}
