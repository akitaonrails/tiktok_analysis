package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base;

import X.C01GW;
import X.C0OB8;
import X.C0SDD;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C16F4;
import X.C452501pT;
import X.C704790Rkj;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.InterfaceC1361270lWn;
import X.InterfaceC1608300rxE;
import X.InterfaceC998590c5p;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsV3GestureInterceptLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3GestureDetectorAssem extends BaseFriendsV3CellContentAssem<FriendsV3GestureDetectorAssem, InterfaceC1361270lWn> implements IFriendsV3GestureHandleAbility, InterfaceC998590c5p {
    public final CopyOnWriteArrayList<InterfaceC1608300rxE> LLJJJJJIL = new CopyOnWriteArrayList<>();
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 457));
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS264S0000000_24.get$arr$(142));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        FriendsV3GestureInterceptLayout friendsV3GestureInterceptLayout;
        this.LLJJJJJIL.clear();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IFriendsV3GestureHandleAbility.class, null);
        }
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof FriendsV3GestureInterceptLayout) || (friendsV3GestureInterceptLayout = (FriendsV3GestureInterceptLayout) viewLJJIJL) == null) {
            return;
        }
        friendsV3GestureInterceptLayout.setGestureListener(null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IFriendsV3GestureHandleAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.IFriendsV3GestureHandleAbility
    public final void AY1(InterfaceC1608300rxE interfaceC1608300rxE) {
        this.LLJJJJJIL.add(interfaceC1608300rxE);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.IFriendsV3GestureHandleAbility
    public final void jx1(InterfaceC1608300rxE interfaceC1608300rxE) {
        this.LLJJJJJIL.remove(interfaceC1608300rxE);
    }

    @Override // X.InterfaceC998590c5p
    public final void onDoubleTap(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        C16F4 c16f4WK2;
        VideoViewModel videoViewModel = (VideoViewModel) this.LLJJL.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        videoViewModel.yQ2(((C0OB8) obj).getAweme());
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof C0SDD) {
            IFriendsV3PageAbility iFriendsV3PageAbility = (IFriendsV3PageAbility) this.LLJJJJLIIL.getValue();
            if (iFriendsV3PageAbility != null && (c16f4WK2 = iFriendsV3PageAbility.WK2()) != null) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                }
                c16f4WK2.LIZJ(rawX, rawY, ((C0OB8) obj3).getAweme());
                return;
            }
            return;
        }
        if (c724270Sb32 == null) {
        }
    }

    @Override // X.InterfaceC998590c5p
    public final void onSingleTapConfirmed(MotionEvent motionEvent) {
        CopyOnWriteArrayList<InterfaceC1608300rxE> copyOnWriteArrayList = this.LLJJJJJIL;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<InterfaceC1608300rxE> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext() && !it2.next().o5(motionEvent)) {
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FriendsV3GestureInterceptLayout friendsV3GestureInterceptLayout;
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof FriendsV3GestureInterceptLayout) && (friendsV3GestureInterceptLayout = (FriendsV3GestureInterceptLayout) viewLJJIJL) != null) {
            friendsV3GestureInterceptLayout.setGestureListener(this);
        }
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }
}
