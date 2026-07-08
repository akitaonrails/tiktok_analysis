package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label;

import X.C01GW;
import X.C03H5;
import X.C0BOZ;
import X.C13IQ;
import X.C13LE;
import X.C2222691Bz1;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C697760RYo;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC698070RZt;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OperatorBoost;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelUIModelAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.InfoBarLabelTriggerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class HeatingBottomLabelTriggerAssem extends InfoBarLabelTriggerComponent<BottomLabelUIModelAssem> implements VideoBottomLabelProtocol, ComponentPriorityProtocol {
    public final C01GW LLJLLL;

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
        return C13LE.LIZ(HeatingBottomLabelUIAssem.class);
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent
    public final InterfaceC698070RZt Ap() {
        final String strH3 = H3();
        final Context context = LJJIJL().getContext();
        return new InterfaceC698070RZt(strH3, context) { // from class: X.0RZn
            public final String LIZ;
            public final Context LIZIZ;

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
                return this.LIZ;
            }

            @Override // X.InterfaceC698070RZt
            public final String LIZJ(VideoItemParams videoItemParams) {
                String string = this.LIZIZ.getString(2131858526);
                if (string == null) {
                    return "";
                }
                return string;
            }

            {
                this.LIZ = strH3;
                this.LIZIZ = context;
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return !this.LLJLILLLLZIIL ? "bottom_tag_container_label_featured" : "annotation_container_label_featured";
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
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return H3();
    }

    public HeatingBottomLabelTriggerAssem(boolean z) {
        super(z);
        this.LLJLLL = C452501pT.LIZIZ(new C697760RYo(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.InfoBarLabelTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (!C0BOZ.LIZ()) {
            yp(this, null, new AwS555S0100000_11(videoItemParams, 1251));
        } else {
            yp(this, new AwS555S0100000_11(videoItemParams, 1252), null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        List<OperatorBoost> list;
        List<OperatorBoost> list2;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme == null || (list = aweme.operatorBoosts) == null || !(!list.isEmpty()) || (list2 = aweme.operatorBoosts) == null) {
            return false;
        }
        for (OperatorBoost operatorBoost : list2) {
            String strLIZIZ = C2222691Bz1.LIZIZ();
            Locale locale = Locale.ROOT;
            if (Intrinsics.LJFF(strLIZIZ.toLowerCase(locale), operatorBoost.region.toLowerCase(locale)) && operatorBoost.targetVv > 0 && System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < operatorBoost.endTime) {
                return true;
            }
        }
        return false;
    }
}
