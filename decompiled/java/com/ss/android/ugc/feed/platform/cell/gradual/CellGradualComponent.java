package com.ss.android.ugc.feed.platform.cell.gradual;

import X.C01GW;
import X.C0C64;
import X.C0R7F;
import X.C0R9J;
import X.C0R9L;
import X.C0RD6;
import X.C0REF;
import X.C0REG;
import X.C0REH;
import X.C0REI;
import X.C0REL;
import X.C0RF0;
import X.C13LE;
import X.C1558520qew;
import X.C1A5L;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C339190DRl;
import X.C426600Go6;
import X.C452501pT;
import X.C589800NBi;
import X.C637920P0k;
import X.C729510SjV;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC691050R8t;
import Y.ARunnableS111S0100000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class CellGradualComponent extends BaseCellContentComponent<CellGradualComponent> implements CellGradualAbility, InterfaceC1554640qYg {
    public static final int[] LLLFFI = {0, Color.argb(2, 0, 0, 0), Color.argb(10, 0, 0, 0), Color.argb(20, 0, 0, 0), Color.argb(30, 0, 0, 0), Color.argb(38, 0, 0, 0), Color.argb(43, 0, 0, 0), Color.argb(46, 0, 0, 0)};
    public static final float[] LLLFZ = {0.0f, 0.04f, 0.22f, 0.43f, 0.65f, 0.83f, 0.93f, 1.0f};
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0REL());
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(553));
    public final GradientDrawable LLJZIJLIL = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{771751936, 0});
    public final C01GW LLL = C452501pT.LIZIZ(new C0REF());
    public int LLLF = -1;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1187));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2065189638) {
            return null;
        }
        return this;
    }

    private final void hp() {
        final View view = this.LLJJJJLIIL;
        if (view != null) {
            C637920P0k.LIZ(view, new Runnable() { // from class: X.0Sdd
                public final void LIZ() {
                    float f;
                    C12P3 c12p3LIZ;
                    boolean z = (C1389300mG0.LJIIIZ(this.LL.jm().LIZIZ()) && C1595430rcT.LIZIZ.LIZJ().shouldInitSocial2TabV1()) || C1389300mG0.LJII(this.LL.jm().LIZIZ());
                    if (C1591480rW6.LIZIZ() == 1 && !z) {
                        View view2 = view;
                        Context context = this.LL.getContext();
                        if (context != null) {
                            C12P5 c12p5 = new C12P5();
                            c12p5.LJ = Float.valueOf(0.18f);
                            c12p5.LJFF = Float.valueOf(0.0f);
                            c12p5.LJI = C12KQ.VERTICAL;
                            c12p5.LJII = EnumC197015126j.EASE_IN_OUT;
                            c12p3LIZ = c12p5.LIZ(context);
                        } else {
                            c12p3LIZ = null;
                        }
                        view2.setBackground(c12p3LIZ);
                    } else {
                        if (C1591480rW6.LIZIZ() != 2 || z) {
                            if (C2548309yj.LIZ) {
                                view.setBackground(this.LL.LLJZIJLIL);
                            } else {
                                view.setBackgroundResource(R.drawable.baz);
                            }
                            f = 136.0f;
                            view.getLayoutParams().height = (int) C12ES.LIZJ(f, this.LL.getContext());
                        }
                        this.LL.LLJLILLLLZIIL = true;
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    f = 78.0f;
                    view.getLayoutParams().height = (int) C12ES.LIZJ(f, this.LL.getContext());
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CellGradualComponent@116e.initGradualTopView$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CellGradualComponent@116e.initGradualTopView$1$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final boolean IC1() {
        View view = this.LLJL;
        return view != null && view.getVisibility() == 0;
    }

    public final GradientDrawable ep() {
        return (GradientDrawable) this.LLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void fi0() {
        C0R9L c0r9l;
        if (this.LLJLIL) {
            return;
        }
        this.LLJLIL = true;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 == null || (c0r9l = c0rf0.LJFF) == null) {
            return;
        }
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new C0R9J(c0r9l, new InterfaceC691050R8t() { // from class: X.0R7G
            @Override // X.InterfaceC691050R8t
            public final void LIZ(int i) {
                AssemViewModel assemViewModel = (AssemViewModel) this.LIZ.LLJLLL.getValue();
                assemViewModel.getClass();
                assemViewModel.setState(new AwS26S0001000_11(i, 5));
            }
        }, new Runnable() { // from class: X.0R7H
            public final void LIZ() {
                BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C631370Opb.LIZ(this.LL)).baseFeedPageParams;
                int i = baseFeedPageParams != null ? baseFeedPageParams.awemeFromPage : 0;
                Context context = this.LL.getContext();
                C1372310lob c1372310lob = new C1372310lob(true, i, 4, context != null ? context.hashCode() : 0);
                c1372310lob.LJII = new ARunnableS111S0100000_11(this.LL, 74);
                C1440005kM.LIZ(c1372310lob);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CellGradualComponent@116e.initFullscreenGradual$1$maskGestureDetector$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CellGradualComponent@116e.initFullscreenGradual$1$maskGestureDetector$2");
            }
        }, new C0R7F(this)));
        View view = this.LLJL;
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0REJ
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    this.LL.kp(gestureDetector, motionEvent, view2);
                    return true;
                }
            });
        }
        C2271391DvN.LIZ(this.LLJL, (C1A5L) C2271381DvM.LJIIIIZZ.getValue());
    }

    public final void lp() {
        int alpha = ep().getAlpha();
        int i = this.LLLF;
        if (alpha == i || i < 0) {
            return;
        }
        ((ValueAnimator) this.LLLFF.getValue()).setIntValues(alpha, this.LLLF);
        ((ValueAnimator) this.LLLFF.getValue()).start();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_enter_dislike_mode", new C0REG(this));
        c0rd6.LIZIZ("event_downgrade_view_opt", new C0REI(this));
        c0rd6.LIZIZ("event_enter_clear_mode", new C0REH(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void ii(boolean z) {
        float f;
        View view;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        View view2 = this.LLJL;
        if (view2 != null && view2.getVisibility() == 0 && (view = this.LLJL) != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: ip, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        View view;
        View view2;
        C2189821An6 c2189821An6;
        View view3;
        C589800NBi.LIZ.getClass();
        if (C589800NBi.LIZIZ()) {
            ((ValueAnimator) this.LLLFF.getValue()).cancel();
            this.LLLF = -1;
            int alpha = ep().getAlpha();
            if (!((Boolean) C589800NBi.LJIIIZ.getValue()).booleanValue() || Math.abs(46 - alpha) >= 25) {
                ep().setAlpha(46);
            }
        }
        String strLIZ = jm().LIZ();
        if (Intrinsics.LJFF(strLIZ, "cell_detail")) {
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null && c2189821An6.isFromDuetModeOrDuetModeDetail() && (view3 = this.LLJJJJLIIL) != null) {
                view3.setBackgroundResource(R.drawable.b_m);
            }
        } else if (Intrinsics.LJFF(strLIZ, "cell_story") && videoItemParams.getAweme().getStoryType() == 2 && !C729510SjV.LJJIIZI(videoItemParams.getAweme()) && (view = this.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (Intrinsics.LJFF(jm().LJII, "cell_story_immersive_collection") && (view2 = this.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        hp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        View view2;
        this.LLJJJJLIIL = view.findViewById(R.id.gradual_top);
        this.LLJJL = view.findViewById(R.id.j4u);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.gradual_bottom);
        this.LLJL = view.findViewById(R.id.j4r);
        hp();
        C589800NBi.LIZ.getClass();
        if (C589800NBi.LIZIZ() && (view2 = this.LLJJLIIIJLLLLLLLZ) != null) {
            view2.setTag(R.id.x17, Boolean.TRUE);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cell_gradual_bottom_exp", true) > 0) {
            View view3 = this.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                view3.setBackground(ep());
            }
        } else {
            C426600Go6.LIZ(this.LLJJLIIIJLLLLLLLZ);
        }
        if (C589800NBi.LIZIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0REK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJL;
                }
            }, null, AFwS294S0000000_11.get$arr$(203), 6);
        }
    }

    public void sm0(boolean z) {
        if (z) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                C339190DRl.LIZLLL(view);
                return;
            }
            return;
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 == null) {
            return;
        }
        C339190DRl.LIZIZ(view2);
    }

    public void kp(GestureDetector gestureDetector, MotionEvent motionEvent, View view) {
        gestureDetector.onTouchEvent(motionEvent);
    }
}
