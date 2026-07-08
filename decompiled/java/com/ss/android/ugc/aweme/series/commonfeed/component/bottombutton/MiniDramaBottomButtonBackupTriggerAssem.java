package com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton;

import X.C01GW;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1611790s2r;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C695070ROf;
import X.C699500RcC;
import X.C700450Rdj;
import X.C718180SFc;
import X.C718220SFg;
import X.C718230SFh;
import X.C718240SFi;
import X.C718300SFo;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.touchpoint.api.model.DramaBottomButton;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class MiniDramaBottomButtonBackupTriggerAssem extends BaseCellTriggerComponent<MiniDramaBottomButtonBackupTriggerAssem> implements PriorityProtocol, MiniDramaBottomButtonAbility, InterfaceC1554640qYg {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C718230SFh(this));
    public DramaBottomButton LLJL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_drama";
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
        return C13LE.LIZ(MiniDramaBottomButtonBackupAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -496164725) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_drama";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return new C700450Rdj(new AwS625S0100000_11(this, 42), new AwS625S0100000_11(this, 43), new AwS555S0100000_11(this, 530));
    }

    public final Map<String, String> yp() {
        HashMap map = new HashMap();
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        Boolean boolValueOf = Boolean.valueOf(this.LLJL != null);
        c1611790s2r.getClass();
        map.put("is_with_coin_guide", String.valueOf(C1611790s2r.LJIIL(boolValueOf)));
        C724270Sb3 c724270Sb3 = this.LLJI;
        PaidContentInfo paidContentInfo = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().mPaidContentInfo;
        if (paidContentInfo != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            String strLJ = C718180SFc.LJ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
            if (strLJ == null) {
                strLJ = "";
            }
            map.put("series_video_type", strLJ);
            C724270Sb3 c724270Sb33 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
            C724270Sb3 c724270Sb34 = this.LLJI;
            map.put("series_feed_type", C718180SFc.LIZLLL(aweme, ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).mEventType));
            C724270Sb3 c724270Sb35 = this.LLJI;
            PaidContentInfo paidContentInfo2 = ((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme().mPaidContentInfo;
            map.put("series_collection_id", String.valueOf(paidContentInfo2 != null ? Long.valueOf(paidContentInfo2.getPaidCollectionId()) : null));
            C724270Sb3 c724270Sb36 = this.LLJI;
            map.put("series_state", (C718300SFo.LIZ(((VideoItemParams) (c724270Sb36 != null ? c724270Sb36.LL : null)).getAweme()) || paidContentInfo.isLimitedFreeShortDrama()) ? "limited_free_series" : "paid_series");
            map.put("series_category", String.valueOf(paidContentInfo.getCategory()));
        }
        return map;
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
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

    @Override // com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.MiniDramaBottomButtonAbility
    public final DramaBottomButton BW() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        DramaBottomButton dramaBottomButtonLIZIZ;
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        if (!Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot")) {
            dramaBottomButtonLIZIZ = null;
        } else {
            ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIILL();
            dramaBottomButtonLIZIZ = C718220SFg.LIZIZ();
        }
        this.LLJL = dramaBottomButtonLIZIZ;
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.MJ(this, new C718240SFi(this));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        PaidContentInfo paidContentInfo;
        String bottomButtonText;
        if (!videoItemParams.getAweme().isPaidContent || (paidContentInfo = videoItemParams.getAweme().mPaidContentInfo) == null || !Intrinsics.LJFF(paidContentInfo.getShouldShowBottomButton(), Boolean.TRUE) || (bottomButtonText = paidContentInfo.getBottomButtonText()) == null || bottomButtonText.length() == 0) {
            return false;
        }
        if (Intrinsics.LJFF(videoItemParams.mEventType, "paid_series_detail_page") && !C695070ROf.LIZ(videoItemParams.getAweme())) {
            return false;
        }
        return true;
    }
}
