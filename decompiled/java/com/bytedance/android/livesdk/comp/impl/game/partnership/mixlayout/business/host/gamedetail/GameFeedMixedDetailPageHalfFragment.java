package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail;

import X.AbstractC1177930gl5;
import X.C0F28;
import X.C16G1;
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
import android.content.DialogInterface;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameFeedMixedDetailPageHalfFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GameFeedMixedDetailPageHalfFragment extends GameDetailMixPageBaseFragment {
    public static final int LLLLIIL = (int) C497740JfY.LIZIZ(32.0f);
    public static final int LLLLIILL = ((int) C497740JfY.LIZIZ(52.0f)) + GameDetailMixPageBaseFragment.LLLF;
    public static final int LLLLIILLL = (int) C497740JfY.LIZIZ(210.0f);
    public static final int LLLLIL = (int) C497740JfY.LIZIZ(26.0f);
    public static final C0F28 LLLLILI = new C0F28(0.1f, 0.5f);
    public static final C0F28 LLLLJ = new C0F28(0.5f, 0.9f);
    public static final C0F28 LLLLJI = new C0F28(0.0f, 0.2f);
    public static float LLLLL = -1.0f;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViJCYrJCQ1JjHELIOSonZic5OiY9LTY/Zyc8OzFiLi4+LSEpPS46JGsLKCI2DiApLQI6MCAoDSonKSwgGS40LQ0tJSkVOiQrJCo9PA==";
    public final String LLLFZ = "immersive_popup";
    public int LLLI = 4;
    public float LLLII;
    public float LLLIIII;
    public float LLLIIIIL;
    public float LLLIIIL;
    public View LLLIIL;
    public ViewGroup LLLIILIL;
    public View LLLIL;
    public View LLLILZ;
    public View LLLILZJ;
    public TextView LLLILZLLLI;
    public TextView LLLIZZ;
    public BottomSheetBehavior<?> LLLJ;
    public TextView LLLJIL;
    public String LLLJL;
    public boolean LLLL;
    public AbstractC1177930gl5 LLLLII;
    public boolean LLLLIIIILLL;

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
        mutableLiveData.observe(this, new Observer() { // from class: X.0zAz
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BottomSheetBehavior<?> bottomSheetBehavior = this.LL.LLLJ;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                }
                C1884370z8V c1884370z8V = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1884370z8V != null) {
                    c1884370z8V.setScrollY(GameFeedMixedDetailPageHalfFragment.LLLLIILLL);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZR() {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameFeedMixedDetailPageHalfFragment.ZR():void");
    }

    public final void oS() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        int i = C497740JfY.LJIILIIL(getActivity()).heightPixels;
        if (Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen")) {
            int i2 = (i - LLLLIILLL) + GameDetailMixPageBaseFragment.LLLFF;
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLLJ;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setPeekHeight(i2);
            }
            this.LLLIIII = (r1 - LLLLIILL) / (i - i2);
            return;
        }
        float f = i;
        int i3 = GameDetailMixPageBaseFragment.LLLFF;
        float f2 = (0.7f * f) + i3;
        BottomSheetBehavior<?> bottomSheetBehavior3 = this.LLLJ;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setPeekHeight((int) f2);
        }
        float f3 = f - f2;
        float f4 = (i - LLLLIILLL) + LLLLIL + i3;
        float f5 = f4 / f;
        if (0.0f <= f5 && f5 <= 1.0f && (bottomSheetBehavior = this.LLLJ) != null) {
            bottomSheetBehavior.setHalfExpandedRatio(f5);
        }
        float f6 = f4 - f2;
        this.LLLIIII = ((r4 - LLLLIILL) + f6) / f3;
        this.LLLII = f6 / f3;
        if (LLLLL <= 0.0f || C1884080z82.LIZJ()) {
            return;
        }
        this.LLLII = LLLLL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void NR(View view) {
        int state;
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
            layoutParams3.height = LLLLIILLL;
        }
        this.LLLIIL = view.findViewById(R.id.iqr);
        C1884370z8V c1884370z8V = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V != null) {
            c1884370z8V.setPadding(0, GameDetailMixPageBaseFragment.LLLFF, 0, 0);
        }
        C1884370z8V c1884370z8V2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V2 != null) {
            this.LLLJ = BottomSheetBehavior.from(c1884370z8V2);
        }
        C1884370z8V c1884370z8V3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V3 != null) {
            c1884370z8V3.setBackground(null);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLJ;
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
                marginLayoutParams.topMargin = LLLLIIL;
            }
            View view2 = getView();
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.iqa)) != null) {
                viewFindViewById.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GoZ
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
            this.LLLJ = null;
        }
        if (!SR()) {
            FrameLayout frameLayout2 = this.LLJL;
            if (frameLayout2 != null) {
                frameLayout2.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0Gob
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
        rS(0.0f);
        gS();
        this.LLLJIL = (TextView) view.findViewById(R.id.bud);
        String str = this.LLLJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindBcLabel text='");
        sbLIZ.append(str);
        sbLIZ.append("', bcLabelView=");
        sbLIZ.append(this.LLLJIL);
        C20441214yg.LIZIZ("test_lzk", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0 && this.LLLL) {
            TextView textView = this.LLLJIL;
            if (textView != null) {
                textView.setText(str);
                textView.setTextColor(C497740JfY.LIZLLL(R.attr.c9i, textView.getContext()));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(4.0f));
                gradientDrawable.setColor(C497740JfY.LIZLLL(R.attr.c98, textView.getContext()));
                textView.setBackground(gradientDrawable);
            }
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLLJ;
            if (bottomSheetBehavior2 != null) {
                state = bottomSheetBehavior2.getState();
            } else {
                state = 4;
            }
            qS(state);
        } else {
            C500260Jjc.LJIILIIL(this.LLLJIL);
        }
        this.LLLIL = view.findViewById(R.id.e8e);
        this.LLLILZ = view.findViewById(R.id.c4o);
        this.LLLILZJ = view.findViewById(R.id.tcw);
        this.LLLILZLLLI = (TextView) view.findViewById(R.id.tcy);
        this.LLLIZZ = (TextView) view.findViewById(R.id.tcx);
        mS("findViewAfterViewCreated");
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
                if (LLLLILI.LIZJ(Float.valueOf(f)) && !z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!LLLLJ.LIZJ(Float.valueOf(this.LLLIIIIL)) || !z) {
                    z3 = false;
                }
                if ((z2 || z3) && !Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen") && (view = getView()) != null) {
                    C476770Imp.LIZJ(view, new Runnable() { // from class: X.0zAx
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameFeedMixedDetailPageHalfFragment@4d72.secondExpand$1");
                            try {
                                ViewGroup viewGroup = this.LL.LLLIILIL;
                                if (viewGroup != null) {
                                    viewGroup.setScrollY(0);
                                }
                                BottomSheetBehavior<?> bottomSheetBehavior = this.LL.LLLJ;
                                if (bottomSheetBehavior != null) {
                                    bottomSheetBehavior.setState(6);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameFeedMixedDetailPageHalfFragment@4d72.secondExpand$1");
                        }
                    });
                }
                if (this.LLLI == 3 && z && !Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen") && (view2 = getView()) != null) {
                    C476770Imp.LIZJ(view2, new Runnable() { // from class: X.0zAx
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameFeedMixedDetailPageHalfFragment@4d72.secondExpand$1");
                            try {
                                ViewGroup viewGroup = this.LL.LLLIILIL;
                                if (viewGroup != null) {
                                    viewGroup.setScrollY(0);
                                }
                                BottomSheetBehavior<?> bottomSheetBehavior = this.LL.LLLJ;
                                if (bottomSheetBehavior != null) {
                                    bottomSheetBehavior.setState(6);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameFeedMixedDetailPageHalfFragment@4d72.secondExpand$1");
                        }
                    });
                }
                nS(motionEvent);
                return;
            }
            return;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLJ;
        if (bottomSheetBehavior != null) {
            state = bottomSheetBehavior.getState();
        } else {
            state = 4;
        }
        this.LLLI = state;
        this.LLLIIIL = this.LLLIIIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void iS(boolean z) {
        if (SR()) {
            return;
        }
        if (!z) {
            oS();
            BottomSheetBehavior<?> bottomSheetBehavior = this.LLLJ;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(true);
            }
            rS(1.0f);
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
        C1884370z8V c1884370z8V = this.LLJJLIIIJLLLLLLLZ;
        if (c1884370z8V != null) {
            c1884370z8V.setClickActionListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameFeedMixedDetailPageHalfFragment.mS(java.lang.String):void");
    }

    public final boolean nS(MotionEvent motionEvent) {
        BottomSheetBehavior<?> bottomSheetBehavior;
        if (motionEvent == null || Intrinsics.LJFF(this.LLLFZ, "immersive_full_screen") || (bottomSheetBehavior = this.LLLJ) == null || bottomSheetBehavior.getState() != 4) {
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

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        AbstractC1177930gl5 abstractC1177930gl5;
        if (!this.LLLLIIIILLL) {
            this.LLLLIIIILLL = true;
            View view = getView();
            if ((view != null || (view = this.LLJL) != null) && (abstractC1177930gl5 = this.LLLLII) != null) {
                abstractC1177930gl5.LIZLLL(5, view);
            }
        }
        super.onDismiss(dialogInterface);
    }

    public final void qS(int i) {
        String str = this.LLLJL;
        boolean z = true;
        int i2 = 0;
        if (str == null || str.length() == 0 || i != 4 || !this.LLLL) {
            z = false;
        }
        TextView textView = this.LLLJIL;
        if (textView != null) {
            if (!z) {
                i2 = 8;
            }
            C786410Ut5.LLIL(textView, i2);
        }
    }

    public final void rS(float f) {
        ViewGroup viewGroup = this.LLLIILIL;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    C786410Ut5.T4(childAt, f);
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateHeaderCoverAlpha = ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("GameFeedMixedDetailPageHalfFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0zAt] */
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
        c259800zU.element = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0zAt
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver2;
                C1884370z8V c1884370z8V = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1884370z8V != null && (viewTreeObserver2 = c1884370z8V.getViewTreeObserver()) != null) {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = c259800zU.element;
                    viewTreeObserver2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                this.LL.oS();
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
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0zB5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view6, MotionEvent motionEvent) {
                    return this.LL.nS(motionEvent);
                }
            });
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLLJ;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0zB3
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sS(int r5, java.lang.String r6) {
        /*
            r4 = this;
            X.0z41 r0 = r4.LLJZIJLIL
            if (r0 == 0) goto L5e
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = r0.LLJJI
            if (r0 == 0) goto L5e
            com.bytedance.android.livesdk.game.model.GameDetailHeaderCTA r0 = r0.gameDetailHeaderCta
        La:
            r3 = 0
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.headerCtaText
            if (r0 == 0) goto L5a
            int r0 = r0.length()
            if (r0 == 0) goto L5a
            r2 = 1
            r0 = 6
            if (r5 == r0) goto L1e
            r0 = 3
            if (r5 != r0) goto L5b
        L1e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateResourceBundleVisibility from="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " state="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " hasBundle="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " → visibility="
            r1.append(r0)
            if (r3 != 0) goto L57
            java.lang.String r0 = "VISIBLE"
        L43:
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "test_lzk"
            X.C20441214yg.LIZIZ(r0, r1)
            android.view.View r0 = r4.LLLILZJ
            if (r0 == 0) goto L56
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L56:
            return
        L57:
            java.lang.String r0 = "GONE"
            goto L43
        L5a:
            r2 = 0
        L5b:
            r3 = 8
            goto L1e
        L5e:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameFeedMixedDetailPageHalfFragment.sS(int, java.lang.String):void");
    }
}
