package com.ss.android.ugc.aweme.comment.exposedcmt;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0RDX;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C20684815ws;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724240Sb0;
import X.C729740Sjs;
import X.C786410Ut5;
import X.InterfaceC691660RBc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposedCommentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentInfoTrigger extends BaseCellTriggerComponent<ExposedCommentInfoTrigger> implements ComponentPriorityProtocol {
    public static final /* synthetic */ int LLJL = 0;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 80));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_exposed_comment";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(ExposedCommentInfoAssem.class);
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (C729740Sjs.LIZ(videoItemParams)) {
            InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null);
            if (interactAreaAttachAbility != null) {
                interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 81));
            }
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(this);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        return C729740Sjs.LIZ(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        List<ExposedCommentInfo> exposedCommentInfoList;
        ExposedCommentInfo exposedCommentInfo;
        String str;
        String str2;
        String uid;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        if (aweme != null && aweme.getExposedCommentInfoList() != null && (exposedCommentInfoList = aweme.getExposedCommentInfoList()) != null && (!exposedCommentInfoList.isEmpty())) {
            List<ExposedCommentInfo> exposedCommentInfoList2 = aweme.getExposedCommentInfoList();
            Integer numValueOf = null;
            if (exposedCommentInfoList2 != null) {
                exposedCommentInfo = (ExposedCommentInfo) ListProtector.get(exposedCommentInfoList2, 0);
            } else {
                exposedCommentInfo = null;
            }
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("homepage_friends", "enter_from");
            String aid = aweme.getAid();
            String str3 = "";
            if (aid == null) {
                aid = "";
            }
            pairArr[1] = new Pair(aid, "group_id");
            User author = aweme.getAuthor();
            if (author != null && (uid = author.getUid()) != null) {
                str3 = uid;
            }
            pairArr[2] = new Pair(str3, "author_id");
            if (exposedCommentInfo != null) {
                str = exposedCommentInfo.commentId;
            } else {
                str = null;
            }
            pairArr[3] = new Pair(str, "comment_id");
            if (exposedCommentInfo != null) {
                str2 = exposedCommentInfo.commentUserId;
            } else {
                str2 = null;
            }
            pairArr[4] = new Pair(str2, "comment_user_id");
            if (exposedCommentInfo != null) {
                numValueOf = Integer.valueOf(exposedCommentInfo.followStatusRelation);
            }
            pairArr[5] = new Pair(numValueOf, "follow_status_relation");
            C20684815ws.LJIJI("outer_comment_contained", pairArr);
        }
    }
}
