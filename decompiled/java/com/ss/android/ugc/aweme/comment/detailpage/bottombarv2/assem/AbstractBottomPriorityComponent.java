package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C01GW;
import X.C2188811AlT;
import X.C2189821An6;
import X.C452501pT;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractBottomPriorityComponent extends UIContentAssem implements BottomBarProtocol, InterfaceC1146704e9 {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 112));

    public void Do() {
    }

    public abstract boolean Go(C2189821An6 c2189821An6);

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    public abstract void No(ViewGroup viewGroup);

    public void Oo(ViewGroup viewGroup) {
    }

    public void W3() {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DetailPageBottomBarScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailPageBottomBarScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    public final DetailBottomBarAbility Jo() {
        return (DetailBottomBarAbility) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
    }

    public final Aweme Ho() {
        DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
        if (detailBottomBarAbilityJo != null) {
            return detailBottomBarAbilityJo.getCommentInputAweme();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    public final String getAid() {
        Aweme commentInputAweme;
        String aid;
        DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
        return (detailBottomBarAbilityJo == null || (commentInputAweme = detailBottomBarAbilityJo.getCommentInputAweme()) == null || (aid = commentInputAweme.getAid()) == null) ? "" : aid;
    }

    public final String getEventType() {
        String eventType;
        DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
        return (detailBottomBarAbilityJo == null || (eventType = detailBottomBarAbilityJo.getEventType()) == null) ? "" : eventType;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    public final C2189821An6 xp0() {
        DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
        if (detailBottomBarAbilityJo != null) {
            return detailBottomBarAbilityJo.xp0();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
        if (detailBottomBarAbilityJo != null) {
            detailBottomBarAbilityJo.EM2(this);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated: ");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void Lo(String str, ViewGroup viewGroup) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttach: ");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        No(viewGroup);
    }
}
