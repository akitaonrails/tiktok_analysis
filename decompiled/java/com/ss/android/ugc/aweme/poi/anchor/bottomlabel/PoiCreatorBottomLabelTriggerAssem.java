package com.ss.android.ugc.aweme.poi.anchor.bottomlabel;

import X.C01GW;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C698040RZq;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC698070RZt;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.LocalAllianceInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class PoiCreatorBottomLabelTriggerAssem extends BottomLabelTriggerComponent<PoiCreatorBottomLabelUIModelAssem> implements VideoBottomLabelProtocol, ComponentPriorityProtocol {
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C698040RZq(this));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol
    public final ReusedUIAssem<? extends C03H5> VO() {
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(PoiCreatorBottomLabelUIModelAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_tag_container_bottom_label_poi_alliance";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent
    public final InterfaceC698070RZt Ap() {
        return new InterfaceC698070RZt() { // from class: X.0RZp
            @Override // X.InterfaceC698070RZt
            public final View.OnClickListener LIZ(VideoItemParams videoItemParams) {
                return null;
            }

            @Override // X.InterfaceC698070RZt
            public final Integer LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC698070RZt
            public final String LLLII() {
                return "bottom_tag_container_bottom_label_poi_alliance";
            }

            @Override // X.InterfaceC698070RZt
            public final String LIZJ(VideoItemParams videoItemParams) {
                StandardBusinessModel standardBusinessModel;
                LocalAllianceInfo localAllianceInfo;
                String str;
                ContentModel contentModel = videoItemParams.getAweme().getContentModel();
                if (contentModel == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (localAllianceInfo = standardBusinessModel.getLocalAllianceInfo()) == null || (str = localAllianceInfo.allianceItemLabelText) == null) {
                    return "";
                }
                return str;
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        yp(this, null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        StandardBusinessModel standardBusinessModel;
        LocalAllianceInfo localAllianceInfo;
        try {
            ContentModel contentModel = videoItemParams.getAweme().getContentModel();
            if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (localAllianceInfo = standardBusinessModel.getLocalAllianceInfo()) != null && localAllianceInfo.showBottomLabel()) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("bottom_label_poi_alliance_show", false)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
