package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail;

import X.AbstractC1177930gl5;
import X.C0F28;
import X.C0KYM;
import X.C1324610kZf;
import X.C13LP;
import X.C16G1;
import X.C1819620xS4;
import X.C1881590z41;
import X.C1884080z82;
import X.C1884370z8V;
import X.C197039127h;
import X.C20441214yg;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C259800zU;
import X.C476770Imp;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C842240X2g;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameMixedDetailPageHalfFragment;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GameMixedDetailPageHalfFragment extends GameDetailMixPageBaseFragment {
    public static final int LLLILZ = (int) C497740JfY.LIZIZ(32.0f);
    public static final int LLLILZJ = ((int) C497740JfY.LIZIZ(52.0f)) + GameDetailMixPageBaseFragment.LLLF;
    public static final int LLLILZLLLI = (int) C497740JfY.LIZIZ(210.0f);
    public static final int LLLIZZ = (int) C497740JfY.LIZIZ(26.0f);
    public static final C0F28 LLLJ = new C0F28(0.1f, 0.5f);
    public static final C0F28 LLLJIL = new C0F28(0.5f, 0.9f);
    public static final C0F28 LLLJL = new C0F28(0.0f, 0.2f);
    public static float LLLL = -1.0f;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViJCYrJCHELIOSQ1JjonZic5OiY9LTY/Zyc8OzFiLi4+LSEpPS46JGsLKCI2BSw0LCsXLTEtICMDKSIpAS4/LgM+KCg+LSs4";
    public String LLLFZ = "";
    public int LLLI = 4;
    public float LLLII;
    public float LLLIIII;
    public float LLLIIIIL;
    public float LLLIIIL;
    public View LLLIIL;
    public ViewGroup LLLIILIL;
    public BottomSheetBehavior<?> LLLIL;

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final int PR() {
        return R.layout.h6n;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final boolean RR() {
        View view = this.LLLIIL;
        return view != null && view.getAlpha() > 0.1f;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void UR() {
        C1881590z41 c1881590z41;
        MutableLiveData<Boolean> mutableLiveData;
        super.UR();
        if (SR() || (c1881590z41 = this.LLJZIJLIL) == null || (mutableLiveData = c1881590z41.LLJZ) == null) {
            return;
        }
        mutableLiveData.observe(this, new Observer() { // from class: X.0zB0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BottomSheetBehavior<?> bottomSheetBehavior = this.LL.LLLIL;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                }
                C1884370z8V c1884370z8V = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1884370z8V != null) {
                    c1884370z8V.setScrollY(GameMixedDetailPageHalfFragment.LLLILZLLLI);
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void ZR() {
        String strLIZIZ;
        LiveIconView liveIconView;
        C1881590z41 c1881590z41;
        GameStationGameInfo gameStationGameInfo;
        ImageModel imageModel;
        List<String> listLIZ;
        C0KYM c0kymLJJI;
        super.ZR();
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0zAw
                @Override // X.AbstractC1177930gl5
                public final void LIZJ(View view, float f) {
                    float f2;
                    View view2;
                    int height;
                    GameMixedDetailPageHalfFragment gameMixedDetailPageHalfFragment = this.LIZ;
                    gameMixedDetailPageHalfFragment.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("curSlideOffset  ");
                    int i = 0;
                    sbLIZ.append(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
                    C20441214yg.LIZIZ("GameMixedDetailPageHalfFragment", C2188811AlT.LIZIZ(sbLIZ));
                    gameMixedDetailPageHalfFragment.LLLIIIIL = f;
                    if (Intrinsics.LJFF(gameMixedDetailPageHalfFragment.LLLFZ, "immersive_full_screen")) {
                        f2 = f * (1 / gameMixedDetailPageHalfFragment.LLLIIII);
                    } else {
                        float f3 = 1.0f;
                        if (gameMixedDetailPageHalfFragment.LLLII <= f && f <= 1.0f) {
                            ViewGroup viewGroup = gameMixedDetailPageHalfFragment.LLLIILIL;
                            if (viewGroup != null) {
                                height = viewGroup.getHeight();
                            } else {
                                height = 0;
                            }
                            int i2 = height - GameDetailMixPageBaseFragment.LLLFF;
                            float f4 = gameMixedDetailPageHalfFragment.LLLII;
                            float f5 = ((f - f4) / (1.0f - f4)) * i2;
                            ViewGroup viewGroup2 = gameMixedDetailPageHalfFragment.LLLIILIL;
                            if (viewGroup2 != null) {
                                viewGroup2.setScrollY((int) f5);
                            }
                        }
                        boolean zLIZJ = GameMixedDetailPageHalfFragment.LLLJL.LIZJ(Float.valueOf(f));
                        if (f > 0.0f && C500260Jjc.LJJJJIZL(gameMixedDetailPageHalfFragment.LLJJJJLIIL) != zLIZJ && (view2 = gameMixedDetailPageHalfFragment.LLJJJJLIIL) != null) {
                            if (!zLIZJ) {
                                i = 8;
                            }
                            C786410Ut5.LJLLLLLL(i, view2);
                        }
                        float f6 = f / gameMixedDetailPageHalfFragment.LLLII;
                        if (C1884080z82.LIZIZ() && gameMixedDetailPageHalfFragment.LLLII < 0.0f) {
                            if (gameMixedDetailPageHalfFragment.LLLIIIIL <= 0.0f) {
                                f3 = 0.0f;
                            }
                            f6 = f3;
                        }
                        gameMixedDetailPageHalfFragment.oS(f6);
                        float f7 = gameMixedDetailPageHalfFragment.LLLIIII;
                        float f8 = gameMixedDetailPageHalfFragment.LLLII;
                        f2 = (f - f8) / (f7 - f8);
                    }
                    gameMixedDetailPageHalfFragment.cS(f2);
                    gameMixedDetailPageHalfFragment.gS();
                }

                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i, View view) {
                    String str;
                    GameMixedDetailPageHalfFragment gameMixedDetailPageHalfFragment = this.LIZ;
                    boolean z = true;
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    str = "";
                                } else {
                                    C1881590z41 c1881590z412 = gameMixedDetailPageHalfFragment.LLJZIJLIL;
                                    if (c1881590z412 != null) {
                                        c1881590z412.LLJLLL = Boolean.TRUE;
                                    }
                                    FrameLayout frameLayout = gameMixedDetailPageHalfFragment.LLJL;
                                    if (frameLayout != null) {
                                        frameLayout.setClipToOutline(false);
                                    }
                                    gameMixedDetailPageHalfFragment.oS(1.0f);
                                    gameMixedDetailPageHalfFragment.cS(0.0f);
                                    FrameLayout frameLayout2 = gameMixedDetailPageHalfFragment.LLJL;
                                    if (frameLayout2 != null) {
                                        frameLayout2.setBackgroundColor(C497740JfY.LIZLLL(R.attr.c63, gameMixedDetailPageHalfFragment.getContext()));
                                    }
                                    View view2 = gameMixedDetailPageHalfFragment.LLJJJJLIIL;
                                    if (view2 != null) {
                                        C500260Jjc.LJIILIIL(view2);
                                    }
                                    ViewGroup viewGroup = gameMixedDetailPageHalfFragment.LLLIILIL;
                                    if (viewGroup != null) {
                                        viewGroup.setScrollY(0);
                                    }
                                    gameMixedDetailPageHalfFragment.LLLII = gameMixedDetailPageHalfFragment.LLLIIIIL;
                                    if (GameMixedDetailPageHalfFragment.LLLL < 0.0f && !C1884080z82.LIZJ()) {
                                        GameMixedDetailPageHalfFragment.LLLL = gameMixedDetailPageHalfFragment.LLLIIIIL;
                                    }
                                    str = "STATE_HALF_EXPANDED";
                                }
                            } else {
                                C1881590z41 c1881590z413 = gameMixedDetailPageHalfFragment.LLJZIJLIL;
                                if (c1881590z413 != null) {
                                    c1881590z413.LLJLLL = null;
                                }
                                gameMixedDetailPageHalfFragment.dismissAllowingStateLoss();
                                str = "STATE_HIDDEN";
                            }
                        } else {
                            C1881590z41 c1881590z414 = gameMixedDetailPageHalfFragment.LLJZIJLIL;
                            if (c1881590z414 != null) {
                                c1881590z414.LLJLLL = Boolean.FALSE;
                            }
                            FrameLayout frameLayout3 = gameMixedDetailPageHalfFragment.LLJL;
                            if (frameLayout3 != null) {
                                frameLayout3.setClipToOutline(true);
                            }
                            gameMixedDetailPageHalfFragment.oS(0.0f);
                            if (Intrinsics.LJFF(gameMixedDetailPageHalfFragment.LLLFZ, "immersive_full_screen")) {
                                gameMixedDetailPageHalfFragment.oS(1.0f);
                                gameMixedDetailPageHalfFragment.cS(0.0f);
                                FrameLayout frameLayout4 = gameMixedDetailPageHalfFragment.LLJL;
                                if (frameLayout4 != null) {
                                    frameLayout4.setBackgroundColor(C497740JfY.LIZLLL(R.attr.c63, gameMixedDetailPageHalfFragment.getContext()));
                                }
                                View view3 = gameMixedDetailPageHalfFragment.LLJJJJLIIL;
                                if (view3 != null) {
                                    C500260Jjc.LJIILIIL(view3);
                                }
                                C500260Jjc.LLFFF(gameMixedDetailPageHalfFragment.LLJLIL);
                                View view4 = gameMixedDetailPageHalfFragment.LLJLL;
                                if (view4 != null) {
                                    C500260Jjc.LLFFF(view4);
                                }
                            } else {
                                View view5 = gameMixedDetailPageHalfFragment.LLJJJJLIIL;
                                if (view5 != null) {
                                    C500260Jjc.LLFFF(view5);
                                }
                                FrameLayout frameLayout5 = gameMixedDetailPageHalfFragment.LLJL;
                                if (frameLayout5 != null) {
                                    frameLayout5.setBackgroundResource(R.drawable.f0v);
                                }
                            }
                            str = "STATE_COLLAPSED";
                        }
                    } else {
                        C1881590z41 c1881590z415 = gameMixedDetailPageHalfFragment.LLJZIJLIL;
                        if (c1881590z415 != null) {
                            c1881590z415.LLJLLL = Boolean.TRUE;
                        }
                        FrameLayout frameLayout6 = gameMixedDetailPageHalfFragment.LLJL;
                        if (frameLayout6 != null) {
                            frameLayout6.setClipToOutline(false);
                        }
                        str = "STATE_EXPANDED";
                    }
                    gameMixedDetailPageHalfFragment.gS();
                    if (i != 3) {
                        z = false;
                    }
                    gameMixedDetailPageHalfFragment.kS(z);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onBottomSheetStateChanged = ");
                    sbLIZ.append(str);
                    C20441214yg.LIZIZ("GameMixedDetailPageHalfFragment", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
        LiveIconView liveIconView2 = this.LLJLIL;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0zB2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomSheetBehavior<?> bottomSheetBehavior2;
                    BottomSheetBehavior<?> bottomSheetBehavior3 = this.LL.LLLIL;
                    if (bottomSheetBehavior3 != null && bottomSheetBehavior3.isHideable() && (bottomSheetBehavior2 = this.LL.LLLIL) != null) {
                        bottomSheetBehavior2.setState(5);
                    }
                    this.LL.dismissAllowingStateLoss();
                }
            });
        }
        C1881590z41 c1881590z412 = this.LLJZIJLIL;
        if (c1881590z412 == null || (c0kymLJJI = c1881590z412.LJJI()) == null || (strLIZIZ = c0kymLJJI.LIZIZ("header_image_url")) == null) {
            strLIZIZ = "";
        }
        if (strLIZIZ.length() != 0 || ((c1881590z41 = this.LLJZIJLIL) != null && (gameStationGameInfo = c1881590z41.LLJILLL) != null && (imageModel = gameStationGameInfo.topBackgroundImage) != null && (listLIZ = C842240X2g.LIZ(imageModel)) != null && (strLIZIZ = (String) C13LP.LJJJLL(listLIZ)) != null)) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(strLIZIZ);
            url.LJIL = true;
            url.LJJI(this.LLLIIL);
        }
        View view = this.LLJLL;
        if (view != null) {
            C500260Jjc.LJIILLIIL(view);
        }
        if (SR() || (liveIconView = this.LLJLIL) == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(liveIconView);
    }

    public final void nS() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        int i = C497740JfY.LJIILIIL(getActivity()).heightPixels;
        if (Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen")) {
            int i2 = (i - LLLILZLLLI) + GameDetailMixPageBaseFragment.LLLFF;
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLLIL;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setPeekHeight(i2);
            }
            this.LLLIIII = (r1 - LLLILZJ) / (i - i2);
            return;
        }
        float f = i;
        int i3 = GameDetailMixPageBaseFragment.LLLFF;
        float f2 = (0.7f * f) + i3;
        BottomSheetBehavior<?> bottomSheetBehavior3 = this.LLLIL;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setPeekHeight((int) f2);
        }
        float f3 = f - f2;
        float f4 = (i - LLLILZLLLI) + LLLIZZ + i3;
        float f5 = f4 / f;
        if (0.0f <= f5 && f5 <= 1.0f && (bottomSheetBehavior = this.LLLIL) != null) {
            bottomSheetBehavior.setHalfExpandedRatio(f5);
        }
        float f6 = f4 - f2;
        this.LLLIIII = ((r4 - LLLILZJ) + f6) / f3;
        this.LLLII = f6 / f3;
        if (LLLL <= 0.0f || C1884080z82.LIZJ()) {
            return;
        }
        this.LLLII = LLLL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void NR(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C16G1 c16g1;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams3;
        super.NR(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.iqq);
        this.LLLIILIL = viewGroup;
        if (viewGroup != null && (layoutParams3 = viewGroup.getLayoutParams()) != null) {
            layoutParams3.height = LLLILZLLLI;
        }
        this.LLLIIL = view.findViewById(R.id.iqr);
        C1884370z8V c1884370z8V = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V != null) {
            c1884370z8V.setPadding(0, GameDetailMixPageBaseFragment.LLLFF, 0, 0);
        }
        C1884370z8V c1884370z8V2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V2 != null) {
            this.LLLIL = BottomSheetBehavior.from(c1884370z8V2);
        }
        C1884370z8V c1884370z8V3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V3 != null) {
            c1884370z8V3.setBackground(null);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setHideable(true);
        }
        if (SR()) {
            C1884370z8V c1884370z8V4 = this.LLJJLIIIJLLLLLLLZ;
            if (c1884370z8V4 != null) {
                c1884370z8V4.setPadding(0, 0, 0, 0);
            }
            C1884370z8V c1884370z8V5 = this.LLJJLIIIJLLLLLLLZ;
            if (c1884370z8V5 != null) {
                layoutParams = c1884370z8V5.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = LLLILZ;
            }
            View view2 = getView();
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.iqa)) != null) {
                viewFindViewById.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0Goa
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view3, Outline outline) {
                        float width = view3.getWidth();
                        float height = view3.getHeight();
                        if (width > 0.0f && height > 0.0f) {
                            Path path = new Path();
                            float fLIZIZ = C418440Gaw.LIZIZ(26);
                            if (C497740JfY.LJJ()) {
                                path.moveTo(0.0f, 0.0f);
                                float f = width - fLIZIZ;
                                path.lineTo(f, 0.0f);
                                path.quadTo(width, 0.0f, width, fLIZIZ);
                                path.lineTo(width, height - fLIZIZ);
                                path.quadTo(width, height, f, height);
                                path.lineTo(0.0f, height);
                                path.close();
                            } else {
                                path.moveTo(0.0f, fLIZIZ);
                                path.quadTo(0.0f, 0.0f, fLIZIZ, 0.0f);
                                path.lineTo(width, 0.0f);
                                path.lineTo(width, height);
                                path.lineTo(fLIZIZ, height);
                                path.quadTo(0.0f, height, 0.0f, height - fLIZIZ);
                                path.close();
                            }
                            try {
                                if (path.isConvex()) {
                                    outline.setConvexPath(path);
                                }
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                });
                viewFindViewById.setClipToOutline(true);
            }
            FrameLayout frameLayout = this.LLJL;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(C497740JfY.LIZLLL(R.attr.c63, getContext()));
            }
            LiveIconView liveIconView = this.LLJLIL;
            if (liveIconView != null) {
                liveIconView.setIconTint(OR());
            }
            View view3 = this.LLJJJJLIIL;
            if (view3 != null) {
                C500260Jjc.LJIILIIL(view3);
            }
            View view4 = this.LLJJJIL;
            if (view4 != null) {
                C500260Jjc.LLFFF(view4);
            }
            C197039127h c197039127h = this.LLJJJJ;
            if (c197039127h != null) {
                C500260Jjc.LJIILLIIL(c197039127h);
            }
            LiveIconView liveIconView2 = this.LLJLIL;
            if (liveIconView2 != null) {
                C500260Jjc.LLFFF(liveIconView2);
            }
            cS(1.0f);
            View view5 = this.LLJJJIL;
            if (view5 != null) {
                view5.bringToFront();
            }
            LiveIconView liveIconView3 = this.LLJLIL;
            if (liveIconView3 != null) {
                liveIconView3.bringToFront();
            }
            C1884370z8V c1884370z8V6 = this.LLJJLIIIJLLLLLLLZ;
            if (c1884370z8V6 != null) {
                layoutParams2 = c1884370z8V6.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
                c16g1.LIZIZ(null);
            }
            this.LLLIL = null;
        }
        if (!SR()) {
            FrameLayout frameLayout2 = this.LLJL;
            if (frameLayout2 != null) {
                frameLayout2.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0Goc
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view6, Outline outline) {
                        float width = view6.getWidth();
                        float height = view6.getHeight();
                        if (width > 0.0f && height > 0.0f) {
                            float fLIZIZ = C418440Gaw.LIZIZ(26);
                            Path path = new Path();
                            path.moveTo(0.0f, fLIZIZ);
                            path.quadTo(0.0f, 0.0f, fLIZIZ, 0.0f);
                            path.lineTo(width - fLIZIZ, 0.0f);
                            path.quadTo(width, 0.0f, width, fLIZIZ);
                            path.lineTo(width, height);
                            path.lineTo(0.0f, height);
                            path.close();
                            try {
                                if (path.isConvex()) {
                                    outline.setConvexPath(path);
                                }
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                });
            }
            FrameLayout frameLayout3 = this.LLJL;
            if (frameLayout3 != null) {
                frameLayout3.setClipToOutline(true);
            }
        }
        oS(0.0f);
        gS();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void WR(MotionEvent motionEvent) {
        int state;
        boolean z;
        boolean z2;
        View view;
        View view2;
        super.WR(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z3 = true;
            if (action == 1) {
                float f = this.LLLIIIIL;
                if (f < this.LLLIIIL) {
                    z = true;
                } else {
                    z = false;
                }
                if (LLLJ.LIZJ(Float.valueOf(f)) && !z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!LLLJIL.LIZJ(Float.valueOf(this.LLLIIIIL)) || !z) {
                    z3 = false;
                }
                if ((z2 || z3) && !Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen") && (view = getView()) != null) {
                    C476770Imp.LIZJ(view, new Runnable() { // from class: X.0zAy
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameMixedDetailPageHalfFragment@6aaa.secondExpand$1");
                            try {
                                ViewGroup viewGroup = this.LL.LLLIILIL;
                                if (viewGroup != null) {
                                    viewGroup.setScrollY(0);
                                }
                                BottomSheetBehavior<?> bottomSheetBehavior = this.LL.LLLIL;
                                if (bottomSheetBehavior != null) {
                                    bottomSheetBehavior.setState(6);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameMixedDetailPageHalfFragment@6aaa.secondExpand$1");
                        }
                    });
                }
                if (this.LLLI == 3 && z && !Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen") && (view2 = getView()) != null) {
                    C476770Imp.LIZJ(view2, new Runnable() { // from class: X.0zAy
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameMixedDetailPageHalfFragment@6aaa.secondExpand$1");
                            try {
                                ViewGroup viewGroup = this.LL.LLLIILIL;
                                if (viewGroup != null) {
                                    viewGroup.setScrollY(0);
                                }
                                BottomSheetBehavior<?> bottomSheetBehavior = this.LL.LLLIL;
                                if (bottomSheetBehavior != null) {
                                    bottomSheetBehavior.setState(6);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameMixedDetailPageHalfFragment@6aaa.secondExpand$1");
                        }
                    });
                }
                mS(motionEvent);
                return;
            }
            return;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLIL;
        if (bottomSheetBehavior != null) {
            state = bottomSheetBehavior.getState();
        } else {
            state = 4;
        }
        this.LLLI = state;
        this.LLLIIIL = this.LLLIIIIL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void iS(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        C16G1 c16g1;
        if (SR()) {
        }
        String str = this.LLLFZ;
        switch (str.hashCode()) {
            case -1008505828:
                if (str.equals("full_screen")) {
                    if (z) {
                        LiveIconView liveIconView = this.LLJLIL;
                        if (liveIconView != null) {
                            C500260Jjc.LLFFF(liveIconView);
                        }
                        dS(OR());
                    } else {
                        C197039127h c197039127h = this.LLJJJJ;
                        if (c197039127h != null) {
                            C500260Jjc.LJIILLIIL(c197039127h);
                        }
                        cS(1.0f);
                        C1884370z8V c1884370z8V = this.LLJJLIIIJLLLLLLLZ;
                        if (c1884370z8V != null) {
                            layoutParams = c1884370z8V.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
                            c16g1.LIZIZ(null);
                        }
                        this.LLLIL = null;
                        kS(true);
                    }
                }
                break;
            case -643484520:
                if (str.equals("immersive_full_screen")) {
                    if (!z) {
                        nS();
                        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLIL;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setHideable(false);
                        }
                        oS(1.0f);
                        cS(0.0f);
                        FrameLayout frameLayout = this.LLJL;
                        if (frameLayout != null) {
                            frameLayout.setBackgroundColor(C497740JfY.LIZLLL(R.attr.c63, getContext()));
                        }
                        View view = this.LLJJJJLIIL;
                        if (view != null) {
                            C500260Jjc.LJIILIIL(view);
                        }
                    }
                    C500260Jjc.LLFFF(this.LLJLIL);
                    View view2 = this.LLJLL;
                    if (view2 != null) {
                        C500260Jjc.LLFFF(view2);
                    }
                }
                break;
            case -514898392:
                if (str.equals("immersive_popup")) {
                    if (!z) {
                        nS();
                        BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLLIL;
                        if (bottomSheetBehavior2 != null) {
                            bottomSheetBehavior2.setHideable(true);
                        }
                        oS(1.0f);
                        cS(0.0f);
                        FrameLayout frameLayout2 = this.LLJL;
                        if (frameLayout2 != null) {
                            frameLayout2.setBackgroundColor(C497740JfY.LIZLLL(R.attr.c63, getContext()));
                        }
                        View view3 = this.LLJJJJLIIL;
                        if (view3 != null) {
                            C500260Jjc.LJIILIIL(view3);
                        }
                    }
                    C500260Jjc.LLFFF(this.LLJLIL);
                    View view4 = this.LLJLL;
                    if (view4 != null) {
                        C500260Jjc.LLFFF(view4);
                    }
                    C1884370z8V c1884370z8V2 = this.LLJJLIIIJLLLLLLLZ;
                    if (c1884370z8V2 != null) {
                        c1884370z8V2.setClickActionListener(null);
                    }
                }
                break;
            case 106852524:
                if (str.equals("popup")) {
                    ViewGroup viewGroup = this.LLLIILIL;
                    if (viewGroup != null) {
                        C500260Jjc.LJIILIIL(viewGroup);
                    }
                    C1884370z8V c1884370z8V3 = this.LLJJLIIIJLLLLLLLZ;
                    if (c1884370z8V3 != null) {
                        c1884370z8V3.setClickActionListener(null);
                    }
                }
                break;
        }
    }

    public final boolean mS(MotionEvent motionEvent) {
        BottomSheetBehavior<?> bottomSheetBehavior;
        if (motionEvent == null || Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen") || (bottomSheetBehavior = this.LLLIL) == null || bottomSheetBehavior.getState() != 4) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        Rect rect = new Rect();
        FrameLayout frameLayout = this.LLJL;
        if (frameLayout != null) {
            frameLayout.getGlobalVisibleRect(rect);
        }
        if (rect.contains(rawX, rawY)) {
            return false;
        }
        dismissAllowingStateLoss();
        return true;
    }

    public final void oS(float f) {
        View childAt;
        ViewGroup viewGroup = this.LLLIILIL;
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            C786410Ut5.T4(childAt, f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateHeaderCoverAlpha = ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("GameMixedDetailPageHalfFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0zAu] */
    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment, com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        ViewTreeObserver viewTreeObserver;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        if (SR()) {
            View view2 = this.LLJJJIL;
            int i2 = 0;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, 0);
            }
            View view3 = this.LLJJJIL;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.height -= GameDetailMixPageBaseFragment.LLLF;
            }
            LiveIconView liveIconView = this.LLJLIL;
            if (liveIconView != null) {
                ViewGroup.LayoutParams layoutParams2 = liveIconView.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i = marginLayoutParams2.topMargin;
                } else {
                    i = 0;
                }
                C500260Jjc.LJLJL(i - GameDetailMixPageBaseFragment.LLLF, liveIconView);
            }
            View view4 = this.LLJLL;
            if (view4 != null) {
                LiveIconView liveIconView2 = this.LLJLIL;
                if (liveIconView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = liveIconView2.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        i2 = marginLayoutParams.topMargin;
                    }
                }
                C500260Jjc.LJLJL(i2 - GameDetailMixPageBaseFragment.LLLF, view4);
            }
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0zAu
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver2;
                C1884370z8V c1884370z8V = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1884370z8V != null && (viewTreeObserver2 = c1884370z8V.getViewTreeObserver()) != null) {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = c259800zU.element;
                    viewTreeObserver2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                this.LL.nS();
            }
        };
        C1884370z8V c1884370z8V = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V != null && (viewTreeObserver = c1884370z8V.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) c259800zU.element;
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        View view5 = getView();
        if (view5 != null && (viewFindViewById = view5.findViewById(R.id.iqa)) != null) {
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0zB6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view6, MotionEvent motionEvent) {
                    return this.LL.mS(motionEvent);
                }
            });
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0zB4
                @Override // X.AbstractC1177930gl5
                public final void LIZJ(View view6, float f) {
                }

                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i3, View view6) {
                    if (i3 == 5) {
                        this.LIZ.dismissAllowingStateLoss();
                    }
                }
            });
        }
    }
}
