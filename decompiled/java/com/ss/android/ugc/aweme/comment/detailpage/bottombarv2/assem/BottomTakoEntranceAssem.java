package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C019F;
import X.C10EU;
import X.C127G;
import X.C1352700lIy;
import X.C13LE;
import X.C14TF;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1ER1;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.AObjectS72S0000000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.appdiff.ICommentAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.communication.IBottomTakoEntranceVM;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class BottomTakoEntranceAssem extends AbstractBottomPriorityComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public String LLJI;
    public C127G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomTakoEntranceAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/otherpage/searchdetailfeed/bottombar/communication/IBottomTakoEntranceVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BottomTakoEntranceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IBottomTakoEntranceVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 532), AFwS259S0000000_21.get$arr$(63), null, true);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void Oo(ViewGroup viewGroup) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "tako_entry";
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIL() {
        ICommentAppDiffProtocol.LIZ.getClass();
        C1352700lIy.LIZIZ.getValue().LIZJ();
        Aweme awemeHo = Ho();
        return (awemeHo == null || AwemeExtKt.isAdTraffic(awemeHo) || AwemeSaaSExtKt.isLive(awemeHo) || C1ER1.LIZIZ.LJJII().LJFF(awemeHo) || C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(awemeHo))) ? false : true;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IBottomTakoEntranceVM.class, new AObjectS72S0000000_21(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean Go(C2189821An6 c2189821An6) {
        String eventType;
        if (!C14TF.LIZIZ.LJIILL().LJIILIIL()) {
            return false;
        }
        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        if (!Intrinsics.LJFF(eventType, "general_search") && !Intrinsics.LJFF(eventType, "search_result")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void No(ViewGroup viewGroup) {
        String aid;
        String aid2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component onAttach aid:");
        Aweme awemeHo = Ho();
        if (awemeHo != null) {
            aid = awemeHo.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme awemeHo2 = Ho();
        if (awemeHo2 != null && (aid2 = awemeHo2.getAid()) != null && !Intrinsics.LJFF(aid2, this.LLJI)) {
            this.LLJI = aid2;
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            ((IBottomTakoEntranceVM) assemVMLazy.getValue()).vQ2(Ho(), xp0());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        Context context = getContext();
        if (context == null) {
            return;
        }
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            ComposeView composeView = new ComposeView(context, null, 6);
            C786410Ut5.k6(composeView, new ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(composeView);
            C723850SaN.LIZLLL(this, new AwS387S0200000_21(this, composeView, 8));
        }
    }
}
