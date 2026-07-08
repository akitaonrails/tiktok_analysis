package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ViewerPicksUpdateMessage extends AbstractC1136060ffY {

    @C09CT("info")
    public ViewerPicksInfo info;

    @C09CT("update_type")
    public int updateType;

    public ViewerPicksUpdateMessage() {
        this.type = C001A.VIEWER_PICKS_UPDATE_MESSAGE;
    }
}
