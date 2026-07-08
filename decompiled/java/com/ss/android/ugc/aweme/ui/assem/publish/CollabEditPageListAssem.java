package com.ss.android.ugc.aweme.ui.assem.publish;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.aweme.ui.cell.publish.CollabInviteEditCell;
import com.ss.android.ugc.aweme.ui.cell.publish.CollabInviteSectionCell;
import com.ss.android.ugc.aweme.vm.publish.CollabEditListViewModel;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabEditPageListAssem extends UIListContentAssem<CollabEditListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C736950SvV LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollabEditPageListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/vm/publish/CollabEditListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CollabEditPageListAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(378);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(CollabEditPageContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(492), new AwS568S0100000_24((AbstractC738140SxQ) this, 1417), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CollabEditListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1416), AFwS264S0000000_24.get$arr$(491), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1414));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 10;
        c20603715jn.LIZJ = true;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        c20603715jn.LJIIIZ = "collab_edit_page_list";
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final CollabEditListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (CollabEditListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(CollabInviteEditCell.class, CollabInviteSectionCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0r1a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572540r1Y) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 156), 4);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r1Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325600Cpa c325600Cpa = (C325600Cpa) obj;
                c325600Cpa.getClass();
                return C627260Oiy.LIZLLL(c325600Cpa);
            }
        }, null, new AwS603S0100000_24(this, 371), new AwS568S0100000_24(this, 1415), new AwS603S0100000_24(this, 372), 2, null);
    }
}
