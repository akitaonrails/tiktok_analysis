package com.ss.android.ugc.aweme.inbox.search.assem;

import X.C01D1;
import X.C09R3;
import X.C0DTR;
import X.C0PE4;
import X.C0PE8;
import X.C0PEM;
import X.C1241390iPR;
import X.C12ES;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1720106oR;
import X.C19719912Dl;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C724750Sbp;
import X.C736820SvI;
import X.C817503Hh;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS46S0100000_19;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchKeyWordAbility;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageTitleCell;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchGroupCell;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchRecentKeywordCell;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchUserCell;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchDefaultAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public long LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxSearchDefaultAssem.class, "keyWordVM", "getKeyWordVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InboxSearchDefaultAssem.class, "defaultVM", "getDefaultVM()Lcom/ss/android/ugc/aweme/inbox/search/vm/InboxSearchDefaultVM;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InboxSearchDefaultAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxSearchVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 1550), AFwS257S0000000_19.get$arr$(191), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InboxSearchDefaultVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 1551), AFwS257S0000000_19.get$arr$(192), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a_a;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchDefaultAssem", "onDestroy()");
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0PE8(null), 2);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        LinearLayoutManager linearLayoutManager;
        super.onPause();
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) LJJIJL().findViewById(R.id.kjg)).getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        this.LLJJIJIIJIL = iFindFirstVisibleItemPosition;
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        this.LLJJIJIL = viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getTop()).intValue() : 0;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        LinearLayoutManager linearLayoutManager;
        super.onResume();
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) LJJIJL().findViewById(R.id.kjg)).getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(this.LLJJIJIIJIL, this.LLJJIJIL);
    }

    public final void hp(List<? extends InterfaceC1891350zJl> list) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showResult() - items.size = ");
        sbLIZ.append(list.size());
        C1720106oR.LJI("InboxSearchDefaultAssem", C2188811AlT.LIZIZ(sbLIZ));
        ((ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.kjg)).getState().LJIILL(list, null);
        C12ES.LJIILL(0, LJJIJL().findViewById(R.id.kjg));
        C0DTR.LIZIZ(LJJIJL().findViewById(R.id.kjf));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.kjg)).LJIILJJIL(InboxSearchRecentKeywordCell.class, InboxSearchDefaultPageFoldCell.class, InboxSearchDefaultPageTitleCell.class, InboxSearchUserCell.class, InboxSearchGroupCell.class);
        ((RecyclerView) view.findViewById(R.id.kjg)).setItemAnimator(null);
        InboxSearchKeyWordAbility inboxSearchKeyWordAbility = (InboxSearchKeyWordAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxSearchKeyWordAbility.class, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.kjg);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        ((PowerAdapter) recyclerView.getAdapter()).LLLLII(new C1241390iPR(inboxSearchKeyWordAbility, (InboxSearchDefaultVM) assemVMLazy.getValue()), C1241390iPR.class);
        ((RecyclerView) view.findViewById(R.id.kjg)).addOnScrollListener(new AsS46S0100000_19(inboxSearchKeyWordAbility, 7));
        AssemViewModel value = this.LLJJI.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, AFwS303S0000000_19.get$arr$(15));
        AssemViewModel value2 = this.LLJJIII.getValue();
        subscribe(value2, C736820SvI.LIZIZ(value2.usedInReusedScene), null, new AwS633S0100000_19(this, 57));
        this.LLJJIJI = NetworkUtils.getServerTimeMills();
        InboxSearchDefaultVM inboxSearchDefaultVM = (InboxSearchDefaultVM) this.LLJJIII.getValue();
        C23250099c.LIZLLL(inboxSearchDefaultVM.getLifecycleScope(), C0PEM.LIZJ, null, new C0PE4(inboxSearchDefaultVM, null), 2);
    }
}
