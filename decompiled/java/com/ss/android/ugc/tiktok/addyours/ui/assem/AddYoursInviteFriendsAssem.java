package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C019F;
import X.C09R3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1749260vca;
import X.C197039127h;
import X.C19719912Dl;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C330010Cwh;
import X.C330050Cwl;
import X.C346420Di4;
import X.C418440Gaw;
import X.C426750GoL;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS139S0100000_4;
import Y.AsS31S0100000_4;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.SearchResultListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;
import wh6.AbS687S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AddYoursInviteFriendsAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public C1749260vca LLIZLLLIL;
    public C197039127h LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723590SZx(this, C330050Cwl.class, "InviteHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AsS31S0100000_4 LLJJ;
    public final C2252321DDq LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursInviteFriendsAssem.class, "searchResultVM", "getSearchResultVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/SearchResultListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AddYoursInviteFriendsAssem.class, "inviteVM", "getInviteVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursInviteFriendsViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public AddYoursInviteFriendsAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchResultListViewModel.class);
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 392), AFwS232S0000000_4.get$arr$(147), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AddYoursInviteFriendsViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 393), AFwS232S0000000_4.get$arr$(148), null, true);
        this.LLJJ = new AsS31S0100000_4(this, 6);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C330010Cwh(c2252321DDqLIZ, this, null), 3);
        this.LLJJI = c2252321DDqLIZ;
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cra) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final AddYoursInviteFriendsViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (AddYoursInviteFriendsViewModel) assemVMLazy.getValue();
    }

    public final C1749260vca Jo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u78) : null;
            this.LLIZLLLIL = (C1749260vca) viewFindViewById;
        }
        return (C1749260vca) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new AbS687S0100000_4(this, 0), Go());
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0DL8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C330070Cwn) obj).LLILLL;
            }
        }, null, new AwS618S0100000_4(this, 50), 6);
        Jo().getEditTextView().addTextChangedListener(new C346420Di4(this, 1));
        Jo().setOnClickClearListener(new ACListenerS139S0100000_4(this, 60));
        Jo().getEditTextView().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0DL7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                Fragment fragmentLJI;
                if (z && (fragmentLJI = C724240Sb0.LJI(this.LL)) != null && !((C330050Cwl) this.LL.LLJILJIL.getValue()).LLILZIL) {
                    String str = TuxSheet._pnsPageId;
                    C1391190mJ3.LJIIIIZZ(fragmentLJI, true);
                }
            }
        });
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0DL9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C330070Cwn) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 51), 6);
        View viewFindViewById = this.LLJI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.mst);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ((RecyclerView) viewFindViewById).addOnScrollListener(this.LLJJ);
        View viewFindViewById3 = this.LLJIJIL;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.mss);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById3;
        }
        ((RecyclerView) viewFindViewById3).addOnScrollListener(this.LLJJ);
        if (((C330050Cwl) this.LLJILJIL.getValue()).LLILZIL) {
            View viewFindViewById4 = this.LLJI;
            if (viewFindViewById4 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById4 = viewLJJIJL3.findViewById(R.id.mst);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById4;
            }
            C426750GoL.LJIIL(viewFindViewById4, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), 23);
            View view2 = this.LLJIJIL;
            if (view2 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById2 = viewLJJIJL4.findViewById(R.id.mss);
                }
                this.LLJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            C426750GoL.LJIIL(view2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), 23);
        }
    }
}
