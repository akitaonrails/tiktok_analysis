package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C09IC;
import X.C09R3;
import X.C0OJU;
import X.C0OLV;
import X.C0ON0;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C1390130mHL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C414301jJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457301qF;
import X.C616770OHb;
import X.C618200OMo;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS384S0100000_9;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListPageStatusViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPageLoadStatusAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public C1749280vcc LLIZLLLIL;
    public LinearLayout LLJ;
    public C1390130mHL LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public C127G LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPageLoadStatusAssem.class, "pageViewModel", "getPageViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListPageStatusViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinPageLoadStatusAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BulletinPageLoadStatusAssem.class, "publishVm", "getPublishVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPublishViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(Oo(), C0OJU.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(Oo(), C0OJU.class);
    }

    public BulletinPageLoadStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinListPageStatusViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 309), AFwS240S0000000_9.get$arr$(190), null, true);
        this.LLJILJIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 308);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(193), new AwS553S0100000_9((AbstractC738140SxQ) this, 313), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinListViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 310), AFwS240S0000000_9.get$arr$(191), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinPublishViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 311), AFwS240S0000000_9.get$arr$(192), null, true);
    }

    public final C0QSJ Go() {
        C0QSJ c0qsj = this.LLJJIJI;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIII;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIII = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{BulletinFragmentScope.class});
        this.LLJJIJI = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final LinearLayout Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cze) : null;
            this.LLJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C0OLV Jo() {
        return (C0OLV) this.LLJILJIL.getValue();
    }

    public final C1390130mHL Lo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d29) : null;
            this.LLJI = (C1390130mHL) viewFindViewById;
        }
        return (C1390130mHL) viewFindViewById;
    }

    public final C1749280vcc No() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d59) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final BulletinListViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (BulletinListViewModel) assemVMLazy.getValue();
    }

    public final BulletinListPageStatusViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (BulletinListPageStatusViewModel) assemVMLazy.getValue();
    }

    public final BulletinProfileViewModel Vo() {
        return (BulletinProfileViewModel) this.LLJILJILJ.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinListViewModel.class, new AObjectS384S0100000_9(this, 5), BulletinPublishViewModel.class, new AObjectS384S0100000_9(this, 4)}, defaultViewModelProviderFactory);
                    this.LLJJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        So().asyncSubscribe(new C2217381BqS() { // from class: X.0OMk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618190OMn) obj).LLILLL;
            }
        }, this, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 125), new AwS553S0100000_9(this, 316), new AwS588S0100000_9(this, 114));
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0OKf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJ;
            }
        }, null, new AwS623S0100000_9(this, 46), 6);
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        assemVMLazy.getValue().asyncSubscribe(new C2217381BqS() { // from class: X.0OMv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618290OMx) obj).LLILLJJLI;
            }
        }, this, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 117), new AwS553S0100000_9(this, 307), new AwS588S0100000_9(this, 115));
        Vo().asyncSubscribe(new C2217381BqS() { // from class: X.0OMs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJLILLLLZIIL;
            }
        }, this, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 116), new AwS553S0100000_9(this, 306), new AwS588S0100000_9(this, 118));
        if (C616770OHb.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457301qF(this, new C414301jJ(C09IC.LJ(new C0ON0(Vo(), new C2217381BqS() { // from class: X.0OMq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LL;
                }
            }, this, null)), C09IC.LJ(new C0ON0(Oo(), new C2217381BqS() { // from class: X.0OKk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C616880OHm c616880OHm = (C616880OHm) obj;
                    c616880OHm.getClass();
                    return C627260Oiy.LIZLLL(c616880OHm);
                }
            }, this, null)), new C618200OMo(AFwS292S0000000_9.get$arr$(13))), new AwS588S0100000_9(this, 119), null), 3);
        } else {
            AssemViewModel.asyncSubscribe$default(Vo(), new C2217381BqS() { // from class: X.0OMr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LL;
                }
            }, this, null, new AwS588S0100000_9(this, 120), new AwS553S0100000_9(this, 312), new AwS588S0100000_9(this, 121), 4, null);
            AssemViewModel.asyncSubscribe$default(Oo(), new C2217381BqS() { // from class: X.0OKl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C616880OHm c616880OHm = (C616880OHm) obj;
                    c616880OHm.getClass();
                    return C627260Oiy.LIZLLL(c616880OHm);
                }
            }, this, null, new AwS588S0100000_9(this, 122), new AwS553S0100000_9(this, 314), new AwS588S0100000_9(this, 123), 4, null);
        }
        AssemViewModel.asyncSubscribe$default(Vo(), new C2217381BqS() { // from class: X.0OMt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJI;
            }
        }, null, new AwS588S0100000_9(this, 124), new AwS553S0100000_9(this, 315), new AwS588S0100000_9(this, 126), 2, null);
        AssemViewModel.asyncSubscribe$default(this.LLJJ.getValue(), new C2217381BqS() { // from class: X.0OMw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618290OMx) obj).LL;
            }
        }, this, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 127), null, null, 48, null);
    }
}
