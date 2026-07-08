package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RJN;
import X.C0RP0;
import X.C13LE;
import X.C1558520qew;
import X.C1865850yed;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C690870R8b;
import X.C694030RKf;
import X.C697060RVw;
import X.C697070RVx;
import X.C700100RdA;
import X.C708910RrN;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationTrigger;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForTagAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoTagContainerTrigger;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedDMSharedTagTriggerV2 extends AbsVideoTagContainerTrigger implements HideComponentForTagAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C0RP0 LLJILJILJ = new C0RP0(this, C13LE.LIZ(VideoExposeSharerInformationVM.class));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedDMSharedTagTriggerV2.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger, X.C0RJM
    public final boolean Kj() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedDMSharedTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_dm_shared";
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForTagAbility
    public final void LJJJJIZL() {
        View view = this.LLIZLLLIL;
        C708910RrN c708910RrN = view instanceof C708910RrN ? (C708910RrN) view : null;
        if (c708910RrN != null) {
            c708910RrN.setTag(C700100RdA.LJI, "is_avoided");
            C786410Ut5.W(c708910RrN, 8);
        } else if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC634910OvJ
    public final void LIZ(VideoItemParams videoItemParams) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJILJ.getValue(this, LLJILLL[0]), new C2217381BqS() { // from class: X.0ROx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S2L) obj).LLJILJIL;
            }
        }, null, new C694030RKf(this), 6);
        if (k0() != null) {
            C1558520qew.LJI(this, VideoCellScope.class, this, HideComponentForTagAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Fragment fragment;
        if (videoItemParams != null) {
            C697060RVw c697060RVw = C697060RVw.LIZ;
            Aweme aweme = videoItemParams.getAweme();
            C0RJN c0rjn = this.LLJI;
            if (c0rjn != null) {
                fragment = c0rjn.LJ;
            } else {
                fragment = null;
            }
            c697060RVw.getClass();
            if (!C697060RVw.LIZ(fragment, aweme)) {
                VideoExposeSharerInformationTrigger.LLJLIL.getClass();
                if (!C697070RVx.LIZ(videoItemParams, true) || !C1865850yed.LIZ()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
