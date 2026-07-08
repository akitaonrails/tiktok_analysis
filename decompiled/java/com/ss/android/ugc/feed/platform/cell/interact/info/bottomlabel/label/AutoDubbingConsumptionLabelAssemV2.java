package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label;

import X.AnonymousClass0956;
import X.C017O;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0RT5;
import X.C10EU;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.C23250099c;
import X.C299180Bo4;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C698090RZv;
import X.C698130RZz;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC2748014o;
import X.InterfaceC698070RZt;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.InfoBarLabelTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomLabelAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AutoDubbingConsumptionLabelAssemV2 extends InfoBarLabelTriggerComponent<AutoDubbingConsumptionLabelUIModelAssem> implements VideoBottomLabelProtocol, ComponentPriorityProtocol {
    public final C01GW LLJLLL;
    public AnonymousClass0956 LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLL = false;
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
        return C13LE.LIZ(AutoDubbingConsumptionLabelUIModelAssem.class);
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
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 347);
        return new C698090RZv(LJJIJL().getContext(), C724240Sb0.LIZ(this), H3(), awS590S0100000_11, this.LLJLILLLLZIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return this.LLJLILLLLZIIL ? "annotation_container_bottom_label_auto_dubbing" : "bottom_tag_container_bottom_label_auto_dubbing";
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.InfoBarLabelTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
        AnonymousClass0956 anonymousClass0956 = this.LLJZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJZ = null;
        this.LLJZIJLIL = false;
        this.LLL = false;
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

    public AutoDubbingConsumptionLabelAssemV2(boolean z) {
        super(z);
        this.LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1249));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
        Object c098200Yq;
        Object obj;
        this.LLJZIJLIL = !z;
        if (C017O.LIZ() && this.LLJZIJLIL && !this.LLL) {
            Object obj2 = null;
            try {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                c098200Yq = (VideoItemParams) obj;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            VideoItemParams videoItemParams = (VideoItemParams) obj2;
            if (videoItemParams != null) {
                this.LLL = true;
                IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
                if (iAutoDubbingServiceLIZ != null) {
                    iAutoDubbingServiceLIZ.LJFF(videoItemParams.mEventType, EnumC2748014o.SHOW.getValue(), videoItemParams.getAweme().getAid());
                }
            }
        }
    }

    public final void Ep(Integer num) {
        TuxTag tuxTag;
        if (this.LLJLILLLLZIIL) {
            this.LLJLIL.LIZJ("update_content", new AwS590S0100000_11(num, 348));
            return;
        }
        View viewFindViewById = LJJIJL().findViewById(R.id.hsj);
        if (!(viewFindViewById instanceof TuxTag) || (tuxTag = (TuxTag) viewFindViewById) == null) {
            return;
        }
        tuxTag.setTagIcon(num);
    }

    public final void Fp(boolean z) {
        if (!this.LLJLILLLLZIIL) {
            if (z) {
                InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
                if (interactAreaAttachAbility != null) {
                    interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 1250));
                }
                InteractAreaAttachAbility interactAreaAttachAbility2 = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
                if (interactAreaAttachAbility2 != null) {
                    interactAreaAttachAbility2.wR(0);
                    return;
                }
                return;
            }
            InteractAreaAttachAbility interactAreaAttachAbility3 = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoBottomLabelAbility.class, null);
            if (interactAreaAttachAbility3 != null) {
                interactAreaAttachAbility3.wR(8);
            }
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        if (z) {
            Bp("show_content", null);
        } else {
            Bp("hide_content", null);
        }
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
        if (C299180Bo4.LIZ() && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(videoItemParams.getAweme()))) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            yp(this, null, new AwS412S0200000_11(this, videoItemParams, 41));
            AnonymousClass0956 anonymousClass0956 = this.LLJZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJZ = null;
            this.LLJZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C698130RZz(this, videoItemParams, null), 3);
            IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
            if (iAutoDubbingServiceLIZ != null) {
                iAutoDubbingServiceLIZ.LJ(videoItemParams.getAweme());
                return;
            }
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJZ = null;
        Fp(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
        if (iAutoDubbingServiceLIZ != null) {
            return iAutoDubbingServiceLIZ.LIZ(videoItemParams.getAweme());
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        boolean z;
        IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
        if (iAutoDubbingServiceLIZ != null && iAutoDubbingServiceLIZ.LIZ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        Fp(z);
        IAutoDubbingService iAutoDubbingServiceLIZ2 = C0RT5.LIZ();
        if (iAutoDubbingServiceLIZ2 != null && !iAutoDubbingServiceLIZ2.LIZLLL(aweme)) {
            Ep(null);
        }
    }
}
