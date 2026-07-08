package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RWB;
import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import X.C698200Ra6;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoSocialTagContainerTrigger;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialRelationTagTriggerV2 extends AbsVideoSocialTagContainerTrigger {
    public String LLJILJILJ = "";

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedSocialRelationTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        if (this.LLJILJILJ.length() == 0) {
            Object objBo = this.LLILZLL;
            if (objBo == null) {
                ReusedAssem<?> reusedAssem = this.LLILLL;
                objBo = reusedAssem != null ? reusedAssem.bo() : null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) objBo;
            Aweme aweme = videoItemParams != null ? videoItemParams.getAweme() : null;
            C698200Ra6 c698200Ra6 = C698200Ra6.LIZ;
            C0RWB c0rwb = new C0RWB(this);
            c698200Ra6.getClass();
            C698200Ra6.LIZJ(aweme, c0rwb);
        }
        return this.LLJILJILJ;
    }

    @Override // X.C0RWO
    public final void bf(Aweme aweme) {
        LJIJJLI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        C698200Ra6 c698200Ra6 = C698200Ra6.LIZ;
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 19);
        c698200Ra6.getClass();
        return C698200Ra6.LIZJ(aweme, awS590S0100000_11);
    }
}
