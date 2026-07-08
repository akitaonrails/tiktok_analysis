package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RW6;
import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoSocialTagContainerTrigger;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialPrivacyTagTriggerV2 extends AbsVideoSocialTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedSocialPrivacyTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_privacy";
    }

    @Override // X.C0RWO
    public final void bf(Aweme aweme) {
        DynamicComponent<?> dynamicComponent;
        if (!C0RW6.LIZ(aweme)) {
            PriorityAbility priorityAbilityLJIILIIL = LJIILIIL();
            if (priorityAbilityLJIILIIL != null) {
                priorityAbilityLJIILIIL.Pq1(this);
            }
        } else {
            LJIJJLI();
        }
        Object objBo = this.LLILZLL;
        if (objBo == null) {
            ReusedAssem<?> reusedAssem = this.LLILLL;
            if (reusedAssem != null) {
                objBo = reusedAssem.bo();
            } else {
                objBo = null;
            }
        }
        VideoItemParams videoItemParams = (VideoItemParams) objBo;
        if (videoItemParams != null && (dynamicComponent = this.LLJIJIL) != null) {
            dynamicComponent.up(videoItemParams);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            return C0RW6.LIZ(aweme);
        }
        return false;
    }
}
