package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.live.tab.LiveTabResponse;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LiveTabCombineModel extends BaseCombineMode {

    @C09CT("body")
    public LiveTabResponse liveTab;

    public final LiveTabCombineModel copy(LiveTabResponse liveTabResponse) {
        return new LiveTabCombineModel(liveTabResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveTabCombineModel) && Intrinsics.LJFF(this.liveTab, ((LiveTabCombineModel) obj).liveTab);
    }

    public int hashCode() {
        LiveTabResponse liveTabResponse = this.liveTab;
        if (liveTabResponse == null) {
            return 0;
        }
        return liveTabResponse.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveTabCombineModel(liveTab=");
        sbLIZ.append(this.liveTab);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LiveTabResponse getLiveTab() {
        return this.liveTab;
    }

    public LiveTabCombineModel(LiveTabResponse liveTabResponse) {
        this.liveTab = liveTabResponse;
    }

    public final void setLiveTab(LiveTabResponse liveTabResponse) {
        this.liveTab = liveTabResponse;
    }
}
