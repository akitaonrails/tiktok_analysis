package com.ss.android.ugc.aweme.poi.anchor.banner;

import X.C01GW;
import X.C03H5;
import X.C0T1C;
import X.C1200970hMF;
import X.C1201020hMK;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C20294614b2;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC1201000hMI;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes31.dex */
public final class PoiReTagBottomBarAssemTrigger extends BaseCellTriggerComponent<PoiReTagBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C20294614b2(this));
    public VideoItemParams LLJL;
    public VideoItemParams LLJLIL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_banner_retag_poi";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(PoiReTagBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_banner_retag_poi";
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
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

    @C14EU(priority = 2, threadMode = ThreadMode.MAIN)
    public final void onPoiReTagAwemeChangeEvent(C0T1C c0t1c) {
        Aweme aweme;
        VideoItemParams videoItemParams;
        PriorityAbility priorityAbility;
        if (c0t1c != null && (aweme = c0t1c.LIZ) != null && (videoItemParams = this.LLJLIL) != null && Intrinsics.LJFF(videoItemParams.getAweme().getAid(), aweme.getAid()) && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.Pq1(this);
        }
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
        this.LLJLIL = videoItemParams;
        if (lp(videoItemParams)) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (priorityAbility != null) {
                priorityAbility.MJ(this, new AwS609S0100000_30(this, 74));
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        PriorityAbility priorityAbility2 = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (priorityAbility2 == null) {
            return;
        }
        priorityAbility2.Pq1(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        String str;
        this.LLJL = videoItemParams;
        if (!C1201020hMK.LIZ(videoItemParams.getAweme())) {
            C1200970hMF c1200970hMF = InterfaceC1201000hMI.LIZ;
            Aweme aweme = videoItemParams.getAweme();
            VideoItemParams videoItemParams2 = this.LLJL;
            if (videoItemParams2 != null) {
                str = videoItemParams2.mEventType;
            } else {
                str = null;
            }
            c1200970hMF.getClass();
            if (!C1200970hMF.LIZ(aweme, str)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
