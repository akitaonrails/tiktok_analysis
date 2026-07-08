package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C09R3;
import X.C1220000hqw;
import X.C1358120lRi;
import X.C1358690lSd;
import X.C1388190mED;
import X.C1389300mG0;
import X.C13LE;
import X.C1587150rP7;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C298440Bms;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.zhiliaoapp.musically.R;
import defpackage.RepostFeedEntranceCell;
import defpackage.RepostFeedEntranceVM;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS158S0110000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePanelListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public UpvotePanelListViewModel LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C736950SvV LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public final AssemVMLazy LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UpvotePanelListAssem.class, "newVm", "getNewVm()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostPanelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(UpvotePanelListAssem.class, "entranceVM", "getEntranceVM()LRepostFeedEntranceVM;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public UpvotePanelListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostPanelViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ, 904), AFwS259S0000000_21.get$arr$(244), null, true);
        this.LLJI = new C736950SvV(C13LE.LIZ(UpvotePublishVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(246), new AwS565S0100000_21((AbstractC738140SxQ) this, 906), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RepostFeedEntranceVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ2, 905), AFwS259S0000000_21.get$arr$(245), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C19EG c19egLIZIZ;
        String str;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        LiveData liveData;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
        VideoItemParams videoItemParams;
        Fragment fragment;
        VideoItemParams videoItemParams2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3;
        super.onViewCreated(view);
        if (C1358690lSd.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
            assemVMLazy.getValue();
        } else {
            Context context = getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                UpvotePanelListViewModel.LLJJIJI.getClass();
                this.LLIZLLLIL = C1358120lRi.LIZ(c19egLIZIZ);
            }
        }
        this.LLJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.upvote_list);
        String strLIZIZ = null;
        if (C298440Bms.LIZ() && (viewOnAttachStateChangeListenerC20604515jv3 = this.LLJIJIL) != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setItemAnimator(null);
        }
        C1587150rP7 c1587150rP7 = C1587150rP7.LIZIZ;
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLIZLLLIL;
        if (upvotePanelListViewModel != null && (videoItemParams2 = upvotePanelListViewModel.LLJI) != null) {
            str = videoItemParams2.mEventType;
        } else {
            str = null;
        }
        UpvotePanelListViewModel upvotePanelListViewModel2 = this.LLIZLLLIL;
        if (upvotePanelListViewModel2 != null && (videoItemParams = upvotePanelListViewModel2.LLJI) != null && (fragment = videoItemParams.fragment) != null) {
            strLIZIZ = C1389300mG0.LIZIZ(fragment);
        }
        boolean zLJIILIIL = c1587150rP7.LJIILIIL(str, strLIZIZ);
        if (zLJIILIIL) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                viewOnAttachStateChangeListenerC20604515jv4.LJIILJJIL(UpvotePanelListCell.class, CommentRepostPanelCell.class, CommentRepostViewMorePanelCell.class, RepostFeedEntranceCell.class);
            }
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                viewOnAttachStateChangeListenerC20604515jv5.LJIILJJIL(UpvotePanelListCell.class, CommentRepostPanelCell.class, CommentRepostViewMorePanelCell.class);
            }
        }
        if (C1358690lSd.LIZ() && (viewOnAttachStateChangeListenerC20604515jv2 = this.LLJIJIL) != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(UpvotePanelMafDividerCell.class);
        }
        if (C1358690lSd.LIZ()) {
            AssemVMLazy assemVMLazy2 = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJILJILJ;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.0lUd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1358750lSj) obj).LLILLJJLI;
                }
            }, null, new AwS158S0110000_21(this, zLJIILIIL, 0), 6);
        } else {
            UpvotePanelListViewModel upvotePanelListViewModel3 = this.LLIZLLLIL;
            if (upvotePanelListViewModel3 != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJIJIL) != null) {
                viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) upvotePanelListViewModel3.LLJJIII.getValue());
            }
            C736680Sv4.LJIIIIZZ(this, this.LLJI.getValue(), new C2217381BqS() { // from class: X.0lUW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1358700lSe) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS158S0110000_21(this, zLJIILIIL, 1), 4);
        }
        UpvotePanelListViewModel upvotePanelListViewModel4 = this.LLIZLLLIL;
        if (upvotePanelListViewModel4 != null && (liveData = (LiveData) upvotePanelListViewModel4.LLILZIL.getValue()) != null) {
            liveData.observe(this, new AObserverS224S0100000_21(this, 47));
        }
    }
}
