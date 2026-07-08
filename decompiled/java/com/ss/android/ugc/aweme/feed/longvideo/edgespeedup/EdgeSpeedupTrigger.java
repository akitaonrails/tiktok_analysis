package com.ss.android.ugc.aweme.feed.longvideo.edgespeedup;

import X.C03H5;
import X.C0RUJ;
import X.C13IQ;
import X.C13LE;
import X.C305280Bxu;
import X.C589960NBy;
import X.C718190SFd;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent;

/* JADX INFO: loaded from: classes12.dex */
public final class EdgeSpeedupTrigger extends BaseDowngradeCellTriggerComponent<EdgeSpeedupTrigger> implements C0RUJ {
    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "cell_edge_speed_up";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(EdgeSpeedupAssem.class);
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        if (C305280Bxu.LIZ()) {
            C589960NBy c589960NBy = C589960NBy.LIZ;
            Aweme aweme = videoItemParams.getAweme();
            c589960NBy.getClass();
            if (C589960NBy.LIZ(aweme) && !C718190SFd.LIZLLL(videoItemParams.getAweme(), videoItemParams.mEventType)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
