package com.ss.android.ugc.profile.business.ur.following.ui.assem;

import X.C013C;
import X.C019F;
import X.C01GW;
import X.C0P6P;
import X.C1264770j19;
import X.C1265220j1s;
import X.C1265390j29;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749260vca;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C295390Bhx;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1265210j1r;
import X.InterfaceC1265570j2R;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS25S0201000_19;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.FollowerListAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.FollowItemCell;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.FollowItemFooterCell;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.RelationStatusCell;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS7S2110000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowerListAssem extends UIListContentAssem<FollowerListViewModel> implements InterfaceC1265570j2R {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C1749280vcc LLJ;
    public C1749260vca LLJI;
    public C1749280vcc LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C1559260qg8 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowerListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FollowerListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowerListViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2320), AFwS257S0000000_19.get$arr$(428), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2318));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2317));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2319));
        this.LLJJI = new C1559260qg8(new C723590SZx(this, C1264770j19.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = FollowItemFooterCell.class;
        c20603715jn.LJIILJJIL = true;
        return c20603715jn;
    }

    @Override // X.InterfaceC1265570j2R
    public final C1265390j29 LJIIZILJ() {
        return new C1265390j29(Go(), new C0P6P() { // from class: X.0j1l
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.Jo().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    public final C1749280vcc Lo() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.igb) : null;
            this.LLJIJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1264770j19 No() {
        return (C1264770j19) this.LLJJI.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Oo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.twh) : null;
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1749280vcc So() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w2d) : null;
            this.LLJ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Vo, reason: merged with bridge method [inline-methods] */
    public final FollowerListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (FollowerListViewModel) assemVMLazy.getValue();
    }

    public final boolean Zo() {
        C013C c013c = new C013C();
        withState(Jo(), new AwS385S0200000_19(c013c, this, 60));
        return c013c.element;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.twh);
    }

    public final void ap() {
        C786410Ut5.LLLZLZ(So(), 0);
        So().setStatus(No().LLILZ);
        if (C295390Bhx.LIZJ()) {
            So().setLayoutVariant(0);
        }
    }

    public final User getUser() {
        return No().LL;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String secUid;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        if (viewOnAttachStateChangeListenerC20604515jvGo != null) {
            viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(FollowItemCell.class);
            viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(RelationStatusCell.class);
            ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jvGo.getAdapter()).LLLLII(this, FollowerListAssem.class);
            viewOnAttachStateChangeListenerC20604515jvGo.setLifecycleOwner(this);
            Go().setLayoutManager(new LinearLayoutManager(LJJIJL().getContext()));
        }
        FollowerListViewModel followerListViewModelJo = Jo();
        String str = No().LLILLJJLI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        User user = getUser();
        if (user != null && (secUid = user.getSecUid()) != null) {
            str2 = secUid;
        }
        followerListViewModelJo.setState(new AwS7S2110000_19(getUser(), No().LLILLL, str, str2, 0));
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0j1n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FollowerRelationState) obj).getRefreshState();
            }
        }, this, null, new AwS598S0100000_19(this, 29), new AwS563S0100000_19(this, 8), new AwS598S0100000_19(this, 31), 4, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0j1o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FollowerRelationState) obj).getLoadMoreState();
            }
        }, this, null, new AwS598S0100000_19(this, 33), new AwS563S0100000_19(this, 9), new AwS598S0100000_19(this, 35), 4, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0j1q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FollowerRelationState) obj).getPayload();
            }
        }, C736820SvI.LJ(), new AwS633S0100000_19(this, 4), 4);
        new C1265220j1s(Oo(), new InterfaceC1265210j1r() { // from class: X.0j1j
            @Override // X.InterfaceC1265210j1r
            public final void LIZ(int i, C1265220j1s c1265220j1s) {
                FollowerListAssem followerListAssem = this.LIZ;
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(followerListAssem.Go().getListItems(), i);
                if (interfaceC1891350zJl instanceof C1265420j2C) {
                    C1265420j2C c1265420j2C = (C1265420j2C) interfaceC1891350zJl;
                    if (c1265420j2C.LL == 1) {
                        User user2 = c1265420j2C.LLILLJJLI;
                        String uid = user2.getUid();
                        ARunnableS25S0201000_19 aRunnableS25S0201000_19 = new ARunnableS25S0201000_19(i, followerListAssem, user2, 0);
                        if (!c1265220j1s.LIZLLL.contains(uid)) {
                            c1265220j1s.LIZLLL.add(uid);
                            aRunnableS25S0201000_19.run();
                            return;
                        }
                        return;
                    }
                }
                if (!(interfaceC1891350zJl instanceof C1782830wUj)) {
                    return;
                }
            }
        });
    }
}
