package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C0K77;
import X.C0RF0;
import X.C0RI4;
import X.C0RJN;
import X.C0RMW;
import X.C0SZ8;
import X.C1223104qT;
import X.C1558420qem;
import X.C1558520qew;
import X.C1600710rkz;
import X.C2189821An6;
import X.C281310B0v;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.InterfaceC1619900sFw;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.MoveGestureInterceptAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ui.ImmersiveGestureMonitor;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StorySwipeInterceptComponent extends BaseCellContentComponent<StorySwipeInterceptComponent> implements InterfaceC1619900sFw, MoveGestureInterceptAbility {
    public static final C01GW<C0K77> LLJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(169));
    public ImmersiveGestureMonitor LLJJJJLIIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 725));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 726));
    public boolean LLJL;

    @Override // X.InterfaceC1619900sFw
    public final boolean LLLLLZL() {
        return false;
    }

    @Override // X.InterfaceC1619900sFw
    public final void F5() {
        CollectionVHAbility collectionVHAbility = (CollectionVHAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        C0RI4.LIZ(collectionVHAbility != null ? collectionVHAbility.j92() : null, LJJIJL());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, MoveGestureInterceptAbility.class, null);
        }
    }

    public final boolean ep() {
        C0SZ8 c0sz8J92;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C0RMW c0rmw = C0RMW.LIZ;
        C0RF0 c0rf0 = jm().LIZLLL;
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (c0rmw.LJIILLIIL((c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null) ? null : c2189821An6.getFrom()) || !C281310B0v.LIZ()) {
            return false;
        }
        CollectionVHAbility collectionVHAbility = (CollectionVHAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (collectionVHAbility != null && (c0sz8J92 = collectionVHAbility.j92()) != null) {
            if (!(c0sz8J92 instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8J92) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IPinchMonitorAbility.class, null)) == null) {
                C0SZ8 c0sz8LLJLLL = c0sz8J92.LLJLLL();
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPinchMonitorAbility.class, null);
                }
            } else {
                interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
            }
            IPinchMonitorAbility iPinchMonitorAbility = (IPinchMonitorAbility) interfaceC494301wDLIZ2;
            if (iPinchMonitorAbility != null && iPinchMonitorAbility.Eo0()) {
                return false;
            }
        }
        return !this.LLJL;
    }

    @Override // X.InterfaceC1619900sFw
    public final void E5() {
        Fragment fragment;
        IDetailBaseAbility iDetailBaseAbilityLIZ;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ == null || (fragment = c0rjnLIZIZ.LJ) == null || (iDetailBaseAbilityLIZ = C1600710rkz.LIZ(fragment)) == null) {
            return;
        }
        iDetailBaseAbilityLIZ.yF(10, "slide");
    }

    @Override // X.InterfaceC1619900sFw
    public final boolean Qc() {
        if (!ep()) {
            return false;
        }
        C0RF0 c0rf0 = jm().LIZLLL;
        return !Intrinsics.LJFF(c0rf0 != null ? c0rf0.LJIIIZ : null, "story_archive");
    }

    @Override // X.InterfaceC1619900sFw
    public final void Yi() {
        Fragment fragment;
        IDetailBaseAbility iDetailBaseAbilityLIZ;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ == null || (fragment = c0rjnLIZIZ.LJ) == null || (iDetailBaseAbilityLIZ = C1600710rkz.LIZ(fragment)) == null) {
            return;
        }
        iDetailBaseAbilityLIZ.yF(10, "slide_right");
    }

    @Override // X.InterfaceC1619900sFw
    public final boolean f5() {
        if (!ep()) {
            return false;
        }
        C0RF0 c0rf0 = jm().LIZLLL;
        return !Intrinsics.LJFF(c0rf0 != null ? c0rf0.LJIIIZ : null, "story_archive");
    }

    @Override // X.InterfaceC1619900sFw
    public final void kh() {
        StoryDetailAbility storyDetailAbility;
        if (!C1223104qT.LIZ() || (storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), StoryDetailAbility.class, null)) == null) {
            return;
        }
        storyDetailAbility.yI1();
    }

    @Override // X.InterfaceC1619900sFw
    public final void ki() {
        StoryDetailAbility storyDetailAbility;
        if (!C1223104qT.LIZ() || (storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), StoryDetailAbility.class, null)) == null) {
            return;
        }
        storyDetailAbility.N20(1);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, MoveGestureInterceptAbility.class, null, null);
        }
    }

    @Override // X.InterfaceC1619900sFw
    public final boolean p8() {
        StoryDetailAbility storyDetailAbility;
        return C1223104qT.LIZ() && (storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), StoryDetailAbility.class, null)) != null && storyDetailAbility.Um0() == -1;
    }

    @Override // X.InterfaceC1619900sFw
    public final boolean wl() {
        return ep();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.MoveGestureInterceptAbility
    public final void Ay1(boolean z) {
        this.LLJL = z;
        StoryDetailAbility storyDetailAbility = (StoryDetailAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), StoryDetailAbility.class, null);
        if (storyDetailAbility != null) {
            storyDetailAbility.AB2(z);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ImmersiveGestureMonitor immersiveGestureMonitor;
        if (view instanceof ImmersiveGestureMonitor) {
            immersiveGestureMonitor = (ImmersiveGestureMonitor) view;
        } else {
            immersiveGestureMonitor = null;
        }
        this.LLJJJJLIIL = immersiveGestureMonitor;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String from;
        ImmersiveGestureMonitor immersiveGestureMonitor;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C0RMW c0rmw = C0RMW.LIZ;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null && (baseFeedPageParams = c0rf0.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        if (!c0rmw.LJIILLIIL(from) && (immersiveGestureMonitor = this.LLJJJJLIIL) != null) {
            immersiveGestureMonitor.setEventListener$story_release(this);
        }
    }
}
