package com.ss.android.ugc.aweme.search.entry.visualsearch.ui;

import X.C01GW;
import X.C03H5;
import X.C0QRE;
import X.C0RUJ;
import X.C1255704vj;
import X.C13IQ;
import X.C13LE;
import X.C265830AbN;
import X.C339190DRl;
import X.C452501pT;
import X.C669350QNh;
import X.C673080Qag;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVisualTagComponentTrigger extends BaseDowngradeCellTriggerComponent<SearchVisualTagComponentTrigger> implements ComponentPriorityProtocol, C0RUJ {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 318));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "full_container_visual_search_tag";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "search_visual_container";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return true;
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iqLJIIJ = C1255704vj.LIZ().LJIIJ();
        return c13iqLJIIJ == null ? C13LE.LIZ(SearchVisualSearchContainerComponentEmpty.class) : c13iqLJIIJ;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        super.up(videoItemParams);
        C339190DRl.LIZIZ(LJJIJL());
        if (up(videoItemParams)) {
            C1255704vj.LIZ().LJJJJIZL();
            C339190DRl.LIZLLL(LJJIJL());
            if (!((Boolean) C265830AbN.LIZ.getValue()).booleanValue() && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJL.getValue()) != null) {
                interactAreaCommonAbility.zB1(this);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        if (!C673080Qag.LIZIZ()) {
            return false;
        }
        C0QRE.LIZ.getClass();
        if (!C0QRE.LIZ() || !C669350QNh.LIZ()) {
            return false;
        }
        return true;
    }
}
