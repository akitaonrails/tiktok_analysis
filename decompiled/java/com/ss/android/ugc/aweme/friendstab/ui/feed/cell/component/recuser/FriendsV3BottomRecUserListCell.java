package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.recuser;

import X.AbstractC1263540izA;
import X.AbstractC1263550izB;
import X.AbstractC1890380zIC;
import X.AbstractC1903730zdj;
import X.AbstractC1906720ziY;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C1073940e3M;
import X.C1196320hEk;
import X.C1262040iwk;
import X.C1262300ixA;
import X.C1262310ixB;
import X.C1262320ixC;
import X.C1262590ixd;
import X.C1262780ixw;
import X.C1262790ixx;
import X.C1262960iyE;
import X.C1262970iyF;
import X.C1264180j0C;
import X.C1266050j3D;
import X.C1361300lWq;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C1569520qwg;
import X.C1600480rkc;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C339450DSl;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1261750iwH;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS46S0100000_19;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FriendsV3BottomRecUserListCell extends PowerCell<C1361300lWq> implements InterfaceC713360RyY {
    public AbstractC1263550izB LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZIL;
    public C1600480rkc LLILZLL;
    public C339450DSl LLIZ;
    public final ViewModelStore LL = new ViewModelStore();
    public final C1266050j3D LLILLJJLI = new C1266050j3D(this, 0);
    public final C1262960iyE LLILZ = new InterfaceC1261750iwH() { // from class: X.0iyE
        @Override // X.InterfaceC1261750iwH
        public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        }

        @Override // X.InterfaceC1261750iwH
        public final void LLF(RecyclerView recyclerView, int i) {
        }

        @Override // X.InterfaceC1261750iwH
        public final void nO0(C1075800e6M c1075800e6M) {
            List<InterfaceC1891350zJl> listLIZ = c1075800e6M.LIZJ.LIZ();
            AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
            if (!(abstractC1623806Xk instanceof C1623706Xj) && !(abstractC1623806Xk instanceof C491101vh)) {
                if (abstractC1623806Xk instanceof C1623606Xi) {
                    if (listLIZ != null && !listLIZ.isEmpty()) {
                        this.LL.I5(listLIZ.size());
                        return;
                    }
                    this.LL.I5(0);
                    FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LL.LLIZLLLIL.getValue();
                    if (friendsV3FeedListAbility == null) {
                        return;
                    }
                    friendsV3FeedListAbility.rD0();
                    return;
                }
                return;
            }
            this.LL.I5(0);
        }
    };
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1460));
    public final int LLJ = 5;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cbc;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            FriendsV3RecListAbility friendsV3RecListAbility = (FriendsV3RecListAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), FriendsV3RecListAbility.class, null);
            if (friendsV3RecListAbility != null) {
                friendsV3RecListAbility.Xb0();
            }
            C1600480rkc c1600480rkc = this.LLILZLL;
            if (c1600480rkc != null && Intrinsics.LJFF(c1600480rkc.LLIZLLLIL, viewOnAttachStateChangeListenerC20604515jv)) {
                c1600480rkc.LLIZLLLIL = null;
                c1600480rkc.LLJJ = 0;
            }
        }
        super.onViewDetachedFromWindow();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        AbstractC329610Cw3<?> abstractC329610Cw3LJIIJJI;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        List<AbstractC1906720ziY> allChunks;
        Fragment currentFragment;
        Object objLJ;
        super.onItemViewCreated();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) this.itemView.findViewById(R.id.imt);
        this.LLILZIL = viewOnAttachStateChangeListenerC20604515jv2;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setTag(R.id.rnd, C1558420qem.LIZIZ(this));
        }
        C339450DSl c339450DSl = new C339450DSl(this.itemView.getContext());
        this.LLIZ = c339450DSl;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILZIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(c339450DSl);
        }
        if (this.LLILZIL != null) {
            C19EG c19eg = null;
            int i = 1;
            if (this.LLILLL == null && (currentFragment = getCurrentFragment()) != null) {
                C1262310ixB c1262310ixB = new C1262310ixB(c19eg, currentFragment, i);
                c1262310ixB.LIZJ(AFwS252S0000000_16.get$arr$(555));
                c1262310ixB.LIZ(AFwS257S0000000_19.get$arr$(739));
                c1262310ixB.LIZLLL(AFwS257S0000000_19.get$arr$(740));
                IRelationUserCardInternalService.LIZ.getClass();
                IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ = C1073940e3M.LIZ();
                C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
                if (c1262320ixC.LIZLLL == -1) {
                    int i2 = c1262310ixB.LJFF.LIZJ - 10;
                    if (i2 < 5) {
                        i2 = 5;
                    }
                    c1262320ixC.LIZLLL = i2;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AbstractC1263550izB.class);
                if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
                    C1262590ixd c1262590ixd = c1262310ixB.LJFF;
                    if (c1262590ixd.LJIILJJIL == null) {
                        c1262590ixd.LJIILJJIL = Boolean.TRUE;
                    }
                }
                C1262300ixA c1262300ixA = new C1262300ixA(c1262310ixB.LIZ, c1262310ixB.LIZIZ, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI);
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AbstractC1263550izB.class);
                if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262790ixx.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 1).getLayout();
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262780ixw.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 0).getLayout();
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263550izB.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZIZ(c1262300ixA);
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1890380zIC.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZJ(c1262300ixA);
                } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1903730zdj.class))) {
                    objLJ = iRelationUserCardInternalServiceLIZ.LIZLLL(c1262300ixA);
                } else {
                    if (!Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263540izA.class))) {
                        "type is error!".toString();
                        throw new IllegalStateException("type is error!");
                    }
                    objLJ = iRelationUserCardInternalServiceLIZ.LJ(c1262300ixA);
                }
                if (objLJ == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
                }
                this.LLILLL = (AbstractC1263550izB) objLJ;
            }
            if (this.LLILLL != null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLILZIL;
                if (viewOnAttachStateChangeListenerC20604515jv4 == null || (allChunks = viewOnAttachStateChangeListenerC20604515jv4.getAllChunks()) == null || !allChunks.contains(this.LLILLL)) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLILZIL;
                    if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                        viewOnAttachStateChangeListenerC20604515jv5.LIZJ(this.LLILLL);
                    }
                    AbstractC1263550izB abstractC1263550izB = this.LLILLL;
                    if (abstractC1263550izB != null) {
                        ((C1262970iyF) abstractC1263550izB).LJI(null);
                    }
                }
                AbstractC1263550izB abstractC1263550izB2 = this.LLILLL;
                if (abstractC1263550izB2 == null || (abstractC329610Cw3LJIIJJI = abstractC1263550izB2.LJIIJJI()) == null || (viewOnAttachStateChangeListenerC20604515jv = this.LLILZIL) == null) {
                    return;
                }
                viewOnAttachStateChangeListenerC20604515jv.LL.LLLIL(abstractC329610Cw3LJIIJJI, abstractC1263550izB2, abstractC1263550izB2.LLILZLL);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLILZIL = (ViewOnAttachStateChangeListenerC20604515jv) this.itemView.findViewById(R.id.imt);
        ViewParent parent = this.itemView.getParent();
        C1600480rkc c1600480rkc = parent instanceof C1600480rkc ? (C1600480rkc) parent : null;
        this.LLILZLL = c1600480rkc;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || c1600480rkc == null) {
            return;
        }
        c1600480rkc.LLIZLLLIL = viewOnAttachStateChangeListenerC20604515jv;
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS46S0100000_19(c1600480rkc, 16));
        FriendsV3RecListAbility friendsV3RecListAbility = (FriendsV3RecListAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), FriendsV3RecListAbility.class, null);
        if (friendsV3RecListAbility != null) {
            friendsV3RecListAbility.YZ0();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        AbstractC1263550izB abstractC1263550izB = this.LLILLL;
        if (abstractC1263550izB != null) {
            ((C1262970iyF) abstractC1263550izB).ng(this.LLILZ);
        }
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLILLJJLI;
    }

    public final void I5(int i) {
        int i2;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof RecyclerView.LayoutParams)) {
            return;
        }
        if (i > this.LLJ) {
            i2 = -1;
        } else {
            i2 = -2;
        }
        if (layoutParams.height != i2) {
            layoutParams.height = i2;
            C786410Ut5.W5(this.itemView, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLJIIJJI;
        super.onBindItemView(interfaceC1891350zJl);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        AbstractC1263550izB abstractC1263550izB = this.LLILLL;
        if (abstractC1263550izB != null) {
            ((C1262970iyF) abstractC1263550izB).Eg(this.LLILZ);
        }
        if (C1569520qwg.LIZIZ) {
            AbstractC1263550izB abstractC1263550izB2 = this.LLILLL;
            if (abstractC1263550izB2 != null) {
                ((C1262970iyF) abstractC1263550izB2).reset();
            }
            AbstractC1263550izB abstractC1263550izB3 = this.LLILLL;
            if (abstractC1263550izB3 != null) {
                ((C1262970iyF) abstractC1263550izB3).LLFZ(false);
            }
            Class<?> clsLIZLLL = C1264180j0C.LIZIZ.LIZLLL();
            if ((clsLIZLLL instanceof Class) && clsLIZLLL != null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILZIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != 0) {
                    iLJIIJJI = viewOnAttachStateChangeListenerC20604515jv2.LJIIJJI(C1262040iwk.class, clsLIZLLL);
                } else {
                    iLJIIJJI = -1;
                }
                C339450DSl c339450DSl = this.LLIZ;
                if (c339450DSl != null) {
                    c339450DSl.LL = C1697810uHb.LJIILJJIL(Integer.valueOf(iLJIIJJI));
                }
            }
            C1569520qwg.LIZIZ = false;
        }
    }
}
