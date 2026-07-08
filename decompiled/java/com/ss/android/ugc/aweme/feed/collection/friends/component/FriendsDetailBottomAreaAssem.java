package com.ss.android.ugc.aweme.feed.collection.friends.component;

import X.C01GW;
import X.C06KX;
import X.C0O1Z;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1558520qew;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C694560RMg;
import X.C696930RVj;
import X.C697660RYe;
import X.C723830SaL;
import X.EnumC696910RVh;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC696870RVd;
import X.InterfaceC713360RyY;
import Y.AUListenerS261S0100000_11;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailBottomAreaAssem extends BaseCellContentComponent<FriendsDetailBottomAreaAssem> implements ICellCleanAbility, CleanModeProtocol, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 306));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 303));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 307));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 305));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 304));

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final String BB1() {
        return "bottom_area_tag";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final void Iu0() {
        Xk(null, null, false, false, false, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final void Lv() {
        Xk(null, null, true, false, false, false);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1312751005) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        List list = (List) this.LLJJL.getValue();
        CommonCellAbility commonCellAbility = (CommonCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), CommonCellAbility.class, null);
        if (commonCellAbility != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1554610qYd.LIZLLL(interfaceC665370Q7zLIZIZ, CleanModeProtocol.class, (C06KX) it2.next());
            }
        }
        ep().LIZ().invoke(new C696930RVj<>(EnumC696910RVh.ON_DESTROY, null));
    }

    public final InterfaceC696870RVd<FriendsDetailBottomAreaAssem> ep() {
        return (InterfaceC696870RVd) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        ep().LIZ().invoke(new C696930RVj<>(EnumC696910RVh.ON_UN_SELECTED, null));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ep().LIZ().invoke(new C696930RVj<>(EnumC696910RVh.ON_CREATE, null));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        ep().LIZ().invoke(new C696930RVj<>(EnumC696910RVh.ON_UN_BIND, null));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0O1Z.LIZ(this, (List) this.LLJJL.getValue());
        ep().LIZ().invoke(new C696930RVj<>(EnumC696910RVh.ON_VIEW_CREATED, null));
        C697660RYe.LIZ(this, new C694560RMg("DETAIL"));
        C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, view, 35));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ep().LIZ().invoke(new C696930RVj<>(EnumC696910RVh.ON_BIND, videoItemParams));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        boolean zVo2;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iViewPagerComponentAbility != null) {
            zVo2 = iViewPagerComponentAbility.Vo2();
        } else {
            zVo2 = false;
        }
        ep().LIZ().invoke(new C696930RVj<>(EnumC696910RVh.ON_SELECTED, Boolean.valueOf(zVo2)));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility
    public final void Xk(Animator animator, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        float f;
        long duration;
        TimeInterpolator linearInterpolator;
        long startDelay;
        LJJIJL().animate().cancel();
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = LJJIJL().animate().alpha(f);
        if (animator != null) {
            duration = animator.getDuration();
        } else {
            duration = 200;
        }
        ViewPropertyAnimator duration2 = viewPropertyAnimatorAlpha.setDuration(duration);
        if (animator == null || (linearInterpolator = animator.getInterpolator()) == null) {
            linearInterpolator = new LinearInterpolator();
        }
        ViewPropertyAnimator interpolator = duration2.setInterpolator(linearInterpolator);
        if (animator != null) {
            startDelay = animator.getStartDelay();
        } else {
            startDelay = 0;
        }
        ViewPropertyAnimator startDelay2 = interpolator.setStartDelay(startDelay);
        if (Intrinsics.LJFF(jm().LIZ(), "cell_photos")) {
            startDelay2.setUpdateListener(new AUListenerS261S0100000_11(this, 12));
        }
        startDelay2.start();
    }
}
