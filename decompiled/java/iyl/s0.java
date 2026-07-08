package iyl;

import X.AnonymousClass0956;
import X.C01GW;
import X.C1428160nGg;
import X.C1461700o8m;
import X.C1462920oAk;
import X.C1650980t44;
import X.C1651440t4o;
import X.C1651580t52;
import X.C1651980t5g;
import X.C1654400t9a;
import X.C1657770tF1;
import X.C1657800tF4;
import X.C1657820tF6;
import X.C1659010tH1;
import X.C1659070tH7;
import X.C1660590tJZ;
import X.C1662030tLt;
import X.C1662100tM0;
import X.C1698440uIc;
import X.C295280Bhm;
import X.C385670FAf;
import X.C418440Gaw;
import X.C426750GoL;
import X.C443120HZe;
import X.C452501pT;
import X.C538770LBb;
import X.C560530Lyd;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1651790t5N;
import X.EnumC1651870t5V;
import X.InterfaceC1651320t4c;
import X.InterfaceC1651490t4t;
import X.InterfaceC1651760t5K;
import X.InterfaceC1657650tEp;
import X.InterfaceC1657870tFB;
import X.InterfaceC1657910tFF;
import Y.AObjectS246S0100000_25;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import iyl.i3;
import iyl.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import nv7.c0;
import oyl.d0;

/* JADX INFO: loaded from: classes26.dex */
public final class s0 extends Scene implements InterfaceC1651760t5K {
    public final InterfaceC1651490t4t LLJI;
    public final LiveEvent<Boolean> LLJIJIL;
    public final ShortVideoContext LLJILJIL;
    public final C385670FAf<Boolean> LLJILJILJ;
    public final LiveEvent<Pair<Boolean, Boolean>> LLJILLL;
    public final LiveEvent<Boolean> LLJJ;
    public final LiveEvent<Boolean> LLJJI;
    public final List<View> LLJJIII;
    public final LiveEvent<Unit> LLJJIJI;
    public final C385670FAf<Boolean> LLJJIJIIJIL;
    public final LiveEvent<C1662100tM0> LLJJIJIL;
    public final LiveEvent<Pair<EnumC1651790t5N, Boolean>> LLJJJ;
    public final LiveEvent<C443120HZe<Boolean, Boolean, Boolean>> LLJJJIL;
    public final boolean LLJJJJ;
    public final Function0<Unit> LLJJJJJIL;
    public final C1651580t52 LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public Pair<Integer, Integer> LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public d0 LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public AnonymousClass0956 LLJZ;
    public InterfaceC1657650tEp LLJZIJLIL;

    public s0() {
        throw null;
    }

    @Override // X.InterfaceC1651760t5K
    public final void Av() {
    }

    @Override // X.InterfaceC1651760t5K
    public final void Bv(EnumC1651870t5V enumC1651870t5V) {
    }

    @Override // X.InterfaceC1651760t5K
    public final Scene LJI() {
        return this;
    }

    @Override // X.InterfaceC1651760t5K
    public final void vv() {
    }

    public final C1662030tLt LLLIILIL() {
        return (C1662030tLt) this.LLJLLL.getValue();
    }

    public final int LLLIL() {
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        Context contextRequireSceneContext = requireSceneContext();
        if (C1462920oAk.LIZLLL() && c1660590tJZ != null && getSceneContext() != null) {
            return c1660590tJZ.LJ(contextRequireSceneContext).topMargin + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + (c1660590tJZ.LJI() ? ScreenUtils.getStatusBarHeight(contextRequireSceneContext) : 0);
        }
        int i = C1428160nGg.LIZ;
        return C1428160nGg.LIZ + ScreenUtils.getStatusBarHeight(contextRequireSceneContext);
    }

    @Override // X.InterfaceC1651760t5K
    public final boolean Nq() {
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        return d0Var.LJIILIIL();
    }

    @Override // X.InterfaceC1651760t5K
    public final boolean j5() {
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        if (!d0Var.LJIILIIL()) {
            return false;
        }
        d0 d0Var2 = this.LLJLL;
        (d0Var2 != null ? d0Var2 : null).LIZJ();
        return true;
    }

    @Override // X.InterfaceC1651760t5K
    public final void notifyDataSetChanged() {
        this.LLJLLIL.getValue().getClass();
    }

    public final int LLLIIIIL() {
        return ((ScreenUtils.getFullScreenHeight(requireSceneContext()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(requireSceneContext())) - this.LLJLIL) - this.LLJLILLLLZIIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // X.InterfaceC1651760t5K
    public final void A2(int i) {
        if (this.LLJJJJ) {
            return;
        }
        this.LLJLIL = i;
        C426750GoL.LJIIL(this.mView, null, Integer.valueOf(i), null, null, 29);
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        d0Var.setMaxHeight(LLLIIIIL());
    }

    @Override // X.InterfaceC1651760t5K
    public final C1654400t9a Cv(InterfaceC1651320t4c<?> interfaceC1651320t4c) {
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        return d0Var.LJIIIZ(interfaceC1651320t4c.getKey());
    }

    public final void LLLILZ(boolean z) {
        Object obj;
        AnonymousClass0956 anonymousClass0956 = this.LLJZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        d0Var.setShowingTextGuideFlag(new C1657800tF4(false, false));
        d0 d0Var2 = this.LLJLL;
        if (d0Var2 == null) {
            d0Var2 = null;
        }
        if (!d0Var2.LJIILIIL()) {
            d0 d0Var3 = this.LLJLL;
            if (d0Var3 == null) {
                d0Var3 = null;
            }
            d0Var3.setBackground(null);
            InterfaceC1651490t4t interfaceC1651490t4t = this.LLJI;
            C1657770tF1 c1657770tF1 = C1657770tF1.LIZ;
            if (z) {
                obj = C1659010tH1.LIZ;
            } else {
                obj = C1659070tH7.LIZ;
            }
            interfaceC1651490t4t.LJI(c1657770tF1, obj);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1657820tF6.LIZ.getClass();
        d0 d0Var = null;
        if (C1657820tF6.LIZJ() != -1) {
            d0 d0Var2 = this.LLJLL;
            if (d0Var2 == null) {
                d0Var2 = null;
            }
            d0Var2.setMaxCollapseSlideFixTotalCnt(C1657820tF6.LIZJ());
        }
        d0 d0Var3 = this.LLJLL;
        if (d0Var3 != null) {
            d0Var = d0Var3;
        }
        d0Var.LIZ(new InterfaceC1657870tFB() { // from class: X.0tEz
            @Override // X.InterfaceC1657870tFB
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1657870tFB
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1657870tFB
            public final void LIZLLL(List<i3> list, List<i3> list2) {
            }

            @Override // X.InterfaceC1657870tFB
            public final void LLLFFI() {
                d0 d0Var4 = this.LIZ.LLJLL;
                if (d0Var4 == null) {
                    d0Var4 = null;
                }
                d0Var4.setShowingTextGuideFlag(new C1657800tF4(false, false));
                this.LIZ.LLLIILIL().LIZLLL(false, true, false);
            }

            @Override // X.InterfaceC1657870tFB
            public final void LLLFZ() {
                s0 s0Var = this.LIZ;
                AnonymousClass0956 anonymousClass0956 = s0Var.LLJZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                    s0Var.LLJZ = null;
                }
                this.LIZ.LLLIILIL().LIZLLL(false, true, false);
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", this.LIZ.LLJILJIL.getCreationId());
                c0lab.LJ("enter_from", "video_shoot_page");
                c0lab.LJ("shoot_way", this.LIZ.LLJILJIL.shootWay);
                C20684815ws.LJIILLIIL("click_expand_button", c0lab.LIZ);
            }

            @Override // X.InterfaceC1657870tFB
            public final void LIZ(int i) {
                if (i == 0) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", this.LIZ.LLJILJIL.getCreationId());
                    c0lab.LJ("enter_from", "video_shoot_page");
                    c0lab.LJ("shoot_way", this.LIZ.LLJILJIL.shootWay);
                    C20684815ws.LJIILLIIL("scroll_tool_bar", c0lab.LIZ);
                }
            }
        });
        this.LLJJIJI.LIZ(this, new AObjectS246S0100000_25(this, 697));
        C1651440t4o.LIZ.getClass();
        C1651440t4o.LIZ();
        C385670FAf<Boolean> c385670FAf = this.LLJJIJIIJIL;
        if (c385670FAf != null) {
            c385670FAf.LIZ(this, new AObjectS246S0100000_25(this, 698));
        }
        this.LLJIJIL.LIZ(this, new AObjectS246S0100000_25(this, 699));
        this.LLJILJILJ.LIZ(this, new AObjectS246S0100000_25(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        LiveEvent<C1662100tM0> liveEvent = this.LLJJIJIL;
        if (liveEvent != null) {
            liveEvent.LIZ(this, new AObjectS246S0100000_25(this, 701));
        }
        LiveEvent<C443120HZe<Boolean, Boolean, Boolean>> liveEvent2 = this.LLJJJIL;
        if (liveEvent2 != null) {
            liveEvent2.LIZ(this, new AObjectS246S0100000_25(this, 702));
        }
        LiveEvent<Boolean> liveEvent3 = this.LLJJ;
        if (liveEvent3 != null) {
            liveEvent3.LIZ(this, new AObjectS246S0100000_25(this, 703));
        }
        LiveEvent<Pair<EnumC1651790t5N, Boolean>> liveEvent4 = this.LLJJJ;
        if (liveEvent4 != null) {
            liveEvent4.LIZ(this, new AObjectS246S0100000_25(this, 704));
        }
        this.LLJJI.LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 695));
        this.LLJILLL.LIZ(this, new AObjectS246S0100000_25(this, 696));
    }

    @Override // X.InterfaceC1651760t5K
    public final View wv(InterfaceC1651320t4c<?> interfaceC1651320t4c) {
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        return d0Var.LJIIL(interfaceC1651320t4c.getKey());
    }

    @Override // X.InterfaceC1651760t5K
    public final C1650980t44 xv(int i) {
        throw new IllegalStateException("Do not access RecordToolbarModel directly");
    }

    @Override // X.InterfaceC1651760t5K
    public final void yv(final Function0<Unit> function0, final Function0<Boolean> function02) {
        final GestureDetector gestureDetector = new GestureDetector(getSceneContext(), new C1698440uIc(this, 2));
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        ((ArrayList) d0Var.LLJJJJ).add(new InterfaceC1657910tFF() { // from class: X.0tEy
            public final C01GW LIZ;

            @Override // X.InterfaceC1657910tFF
            public final boolean LJJJJ(MotionEvent motionEvent) {
                if (!function02.invoke().booleanValue()) {
                    return false;
                }
                if (motionEvent.getAction() == 2 && this.LIZIZ.LLJJLIIIJLLLLLLLZ) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.LIZIZ.LLJJLIIIJLLLLLLLZ) {
                    return true;
                }
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            }

            @Override // X.InterfaceC1657910tFF
            public final void onTouchEvent(MotionEvent motionEvent) {
                gestureDetector.onTouchEvent(motionEvent);
                this.LIZIZ.LLJJJJJIL.invoke();
                if (motionEvent.getAction() == 2) {
                    s0 s0Var = this.LIZIZ;
                    if (s0Var.LLJJLIIIJLLLLLLLZ) {
                        View viewWv = s0Var.wv(EnumC1651770t5L.SPEED);
                        if (viewWv == null) {
                            return;
                        }
                        float x = motionEvent.getX() - this.LIZIZ.LLJL.getFirst().floatValue();
                        float y = motionEvent.getY() - this.LIZIZ.LLJL.getSecond().floatValue();
                        if (y > 88.0f || y < -88.0f) {
                            int iLLLII = s0.LLLII(viewWv.getTop(), this.LIZIZ, (Rect) this.LIZ.getValue()) + (viewWv.getHeight() / 2);
                            InterfaceC1657650tEp interfaceC1657650tEp = this.LIZIZ.LLJZIJLIL;
                            if (interfaceC1657650tEp != null) {
                                interfaceC1657650tEp.LIZIZ((int) motionEvent.getX(), (int) (motionEvent.getY() - iLLLII), (int) x, (int) y);
                            }
                            this.LIZIZ.LLJL = new Pair<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
                        }
                        Rect rect = new Rect();
                        d0 d0Var2 = this.LIZIZ.LLJLL;
                        if (d0Var2 == null) {
                            d0Var2 = null;
                        }
                        d0Var2.getLocalVisibleRect(rect);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            int iLLLII2 = s0.LLLII(viewWv.getTop(), this.LIZIZ, (Rect) this.LIZ.getValue()) + (viewWv.getHeight() / 2);
                            InterfaceC1657650tEp interfaceC1657650tEp2 = this.LIZIZ.LLJZIJLIL;
                            if (interfaceC1657650tEp2 != null) {
                                interfaceC1657650tEp2.LIZJ((int) motionEvent.getX(), (int) (motionEvent.getY() - iLLLII2));
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 && this.LIZIZ.LLJJLIIIJLLLLLLLZ) {
                    function0.invoke();
                    s0 s0Var2 = this.LIZIZ;
                    s0Var2.LLJJL = false;
                    s0Var2.LLJJLIIIJLLLLLLLZ = false;
                }
            }

            {
                this.LIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this.LIZIZ, 831));
            }
        });
    }

    public static final int LLLII(int i, s0 s0Var, Rect rect) {
        int i2 = i + rect.top;
        d0 d0Var = s0Var.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        return i2 - d0Var.getSlideRegionScrollY();
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.LLJJJJ) {
            d0 d0Var = new d0(requireSceneContext());
            this.LLJLL = d0Var;
            d0Var.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
            d0Var.setOrientation(1);
            int iLIZ = C1461700o8m.LIZ(C786410Ut5.N3(d0Var.getContext()));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ScreenUtils.getScreenWidth(d0Var.getContext()));
            layoutParams.gravity = 8388613;
            layoutParams.topMargin = iLIZ;
            C786410Ut5.t7(d0Var, layoutParams);
            d0Var.setGravity(16);
            return d0Var;
        }
        d0 d0Var2 = new d0(requireSceneContext());
        this.LLJLL = d0Var2;
        d0Var2.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
        C426750GoL.LJIIL(d0Var2, null, Integer.valueOf(LLLIL()), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210))), 21);
        d0Var2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 8388613;
        C786410Ut5.t7(d0Var2, layoutParams2);
        return d0Var2;
    }

    public s0(InterfaceC1651490t4t interfaceC1651490t4t, C560530Lyd c560530Lyd, ShortVideoContext shortVideoContext, C385670FAf c385670FAf, C560530Lyd c560530Lyd2, C560530Lyd c560530Lyd3, LiveEvent liveEvent, List list, C560530Lyd c560530Lyd4, C538770LBb c538770LBb, C560530Lyd c560530Lyd5, C560530Lyd c560530Lyd6, C560530Lyd c560530Lyd7, C1651980t5g c1651980t5g, C1651580t52 c1651580t52) {
        this.LLJI = interfaceC1651490t4t;
        this.LLJIJIL = c560530Lyd;
        this.LLJILJIL = shortVideoContext;
        this.LLJILJILJ = c385670FAf;
        this.LLJILLL = c560530Lyd2;
        this.LLJJ = c560530Lyd3;
        this.LLJJI = liveEvent;
        this.LLJJIII = list;
        this.LLJJIJI = c560530Lyd4;
        this.LLJJIJIIJIL = c538770LBb;
        this.LLJJIJIL = c560530Lyd5;
        this.LLJJJ = c560530Lyd6;
        this.LLJJJIL = c560530Lyd7;
        this.LLJJJJ = false;
        this.LLJJJJJIL = c1651980t5g;
        this.LLJJJJLIIL = c1651580t52;
        C295280Bhm.LIZ();
        this.LLJL = new Pair<>(0, 0);
        this.LLJLIL = C1428160nGg.LIZ;
        this.LLJLILLLLZIIL = C1428160nGg.LIZIZ;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 832));
        this.LLJLLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(437));
    }
}
