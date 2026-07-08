package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C01GW;
import X.C07CK;
import X.C0LEO;
import X.C0RFT;
import X.C11VU;
import X.C120B;
import X.C12C5;
import X.C12CI;
import X.C12WG;
import X.C12YD;
import X.C1402440mbC;
import X.C1402470mbF;
import X.C1402820mbo;
import X.C1428310nGv;
import X.C1428470nHB;
import X.C1432320nNO;
import X.C1447800nmM;
import X.C1449630npJ;
import X.C1462760oAU;
import X.C1462930oAl;
import X.C1491180ouK;
import X.C1642810sqt;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C19647111tt;
import X.C19714312Bh;
import X.C1DRG;
import X.C214798194i;
import X.C2296808zG;
import X.C418440Gaw;
import X.C419260GcG;
import X.C426750GoL;
import X.C452501pT;
import X.C568750MSj;
import X.C571320Maw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1453410nvP;
import X.InterfaceC19647211tu;
import X.InterfaceC19714712Bl;
import X.InterfaceC362610EJn;
import X.InterfaceC379610EuV;
import X.InterfaceC710220RtU;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ImagePublishPreviewScene extends PublishPreviewScene implements InterfaceC379610EuV, InterfaceC362610EJn {
    public static final int LLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
    public final VideoPublishEditModel LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final UrlModel LLJL;
    public final int LLJLIL;
    public final String LLJLILLLLZIIL;
    public final int LLJLL;
    public final Function0<Unit> LLJLLIL;
    public final Function0<Unit> LLJLLL;
    public final boolean LLJZ;
    public final int LLJZIJLIL;
    public final InterfaceC19714712Bl LLL;
    public final Function1<Integer, Unit> LLLF;
    public final Function1<Integer, Unit> LLLFF;
    public final boolean LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public ObjectAnimator LLLII;
    public View LLLIIII;
    public FrameLayout LLLIIIIL;
    public LinearLayout LLLIIIL;
    public C120B LLLIIL;
    public TuxIconView LLLIILIL;
    public View LLLIL;
    public FrameLayout LLLILZ;
    public View LLLILZJ;
    public View LLLILZLLLI;
    public C419260GcG LLLIZZ;
    public ViewGroup LLLJ;
    public C1462760oAU LLLJIL;
    public C19647111tt LLLJL;
    public C1491180ouK LLLL;
    public View LLLLII;
    public View LLLLIIIILLL;
    public TuxIconView LLLLIIL;
    public FrameLayout LLLLIILL;
    public C0RFT LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public String LLLLJI;
    public float LLLLL;
    public boolean LLLLLIL;
    public C1462930oAl LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public boolean LLLLLJLJLL;
    public final C01GW LLLLLL;
    public final C01GW LLLLLLIL;
    public FeedContentLayoutInfo LLLLLLJ;
    public InterfaceC710220RtU LLLLLLL;
    public View LLLLLLLLL;
    public C12CI LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final C01GW LLLLLLZZ;

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLL() {
        View view = this.LLLFZ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        View view2 = this.LLLI;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        ObjectAnimator objectAnimator = this.LLLII;
        if (objectAnimator == null) {
            objectAnimator = null;
        }
        if (objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.LLLII;
            (objectAnimator2 != null ? objectAnimator2 : null).cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLLL() {
        View view = this.LLLI;
        if (view == null) {
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        this.LLLII = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat == null) {
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.setDuration(1000L);
        ObjectAnimator objectAnimator = this.LLLII;
        if (objectAnimator == null) {
            objectAnimator = null;
        }
        objectAnimator.setRepeatCount(-1);
        ObjectAnimator objectAnimator2 = this.LLLII;
        if (objectAnimator2 == null) {
            objectAnimator2 = null;
        }
        objectAnimator2.setInterpolator(new LinearInterpolator());
        View view2 = this.LLLFZ;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        View view3 = this.LLLI;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(0, view3);
        ObjectAnimator objectAnimator3 = this.LLLII;
        if (objectAnimator3 == null) {
            objectAnimator3 = null;
        }
        if (objectAnimator3.isRunning()) {
            return;
        }
        ObjectAnimator objectAnimator4 = this.LLLII;
        C786410Ut5.Pd(objectAnimator4 != null ? objectAnimator4 : null);
    }

    public final void LLLLLLLLL() {
        if (this.LLLLJ) {
            InterfaceC19714712Bl interfaceC19714712Bl = this.LLL;
            if (interfaceC19714712Bl != null) {
                interfaceC19714712Bl.LIZJ(0);
            }
            LLLLLZ();
            return;
        }
        InterfaceC19714712Bl interfaceC19714712Bl2 = this.LLL;
        if (interfaceC19714712Bl2 != null) {
            interfaceC19714712Bl2.LIZ(0);
        }
        C1402820mbo.LJ(this.LLJJL, "preview_feed");
        pause();
    }

    public final boolean LLLLLLLZIL() {
        return ((Boolean) this.LLLLLLIL.getValue()).booleanValue();
    }

    public final InterfaceC1453410nvP LLLLLLZ() {
        return (InterfaceC1453410nvP) this.LLLLLJIL.getValue();
    }

    public final void LLLLLZ() {
        TuxIconView tuxIconView = this.LLLLIIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C1491180ouK c1491180ouK = this.LLLL;
        if (c1491180ouK != null) {
            c1491180ouK.resume();
        }
        LLLLLLZ().resume();
        C19647111tt c19647111tt = this.LLLJL;
        (c19647111tt != null ? c19647111tt : null).LJJIZ(true);
        this.LLLLJ = false;
    }

    public final boolean LLLLZLLIL() {
        return C1428470nHB.LLIIIILZ(this.LLJJL) && C07CK.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        InterfaceC19647211tu interfaceC19647211tuAv;
        C12CI c12ci = this.LLLLLLLLLL;
        if (c12ci != null) {
            C2296808zG.LIZJ(c12ci.LIZLLL, null);
            c12ci.LJFF.clear();
            c12ci.LJI.clear();
        }
        this.LLLLLLLLLL = null;
        super.onDestroyView();
        C1462930oAl c1462930oAl = this.LLLLLILLIL;
        if (c1462930oAl != null && (interfaceC19647211tuAv = c1462930oAl.Av()) != null) {
            interfaceC19647211tuAv.release();
        }
        C1491180ouK c1491180ouK = this.LLLL;
        if (c1491180ouK != null) {
            c1491180ouK.release();
        }
        ((C1432320nNO) this.LLLLLL.getValue()).LIZ();
    }

    public final void pause() {
        TuxIconView tuxIconView = this.LLLLIIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C1491180ouK c1491180ouK = this.LLLL;
        if (c1491180ouK != null) {
            c1491180ouK.pause();
        }
        LLLLLLZ().pause(false);
        C419260GcG c419260GcG = this.LLLIZZ;
        if (c419260GcG == null) {
            c419260GcG = null;
        }
        C12C5.LIZJ(c419260GcG, 800L, null, null, 14);
        C19647111tt c19647111tt = this.LLLJL;
        (c19647111tt != null ? c19647111tt : null).LJJIZ(false);
        this.LLLLJ = true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLJ() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        return Intrinsics.LJFF(navigationSceneLIZ != null ? navigationSceneLIZ.LLLLIIIILLL() : null, this);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
        if (c1drgLJIIIZ != null) {
            return c1drgLJIIIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        C1491180ouK c1491180ouK;
        super.onPause();
        if (this.LLLLLJLJLL || (c1491180ouK = this.LLLL) == null) {
            return;
        }
        c1491180ouK.pause();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLLLLIL = false;
        if (this.LLLLJ) {
            C12WG.LIZLLL(this, new ARunnableS129S0100000_29(this, 88), 300L);
        } else {
            LLLLLZ();
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        if (!this.LLLLLIL) {
            C1402470mbF c1402470mbF = C1402440mbC.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJJL;
            boolean z = this.LLLLIL;
            c1402470mbF.getClass();
            C1402470mbF.LJFF(videoPublishEditModel, z);
        }
        if (this.LLLLLJLJLL) {
            this.LLLLLJLJLL = false;
            return;
        }
        C1491180ouK c1491180ouK = this.LLLL;
        if (c1491180ouK != null) {
            c1491180ouK.pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLIL() {
        return this.LLLLIL;
    }

    public final void LLLLLLLLLL(View view) {
        GradientDrawable gradientDrawable;
        Drawable background = null;
        if (view != null) {
            background = view.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        }
    }

    public final void LLLLLLZZ(int i) {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            ViewGroup viewGroup = null;
            if (C568750MSj.LIZIZ(this.LLJJL) && this.LLLFFI) {
                Activity activity = navigationSceneLIZ.mActivity;
                if ((activity instanceof EditPostedVideoPublishActivity) && activity != null) {
                    VideoPublishEditModel videoPublishEditModel = this.LLJJL;
                    ViewGroup viewGroup2 = this.LLLJ;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    int width = viewGroup2.getWidth();
                    ViewGroup viewGroup3 = this.LLLJ;
                    if (viewGroup3 != null) {
                        viewGroup = viewGroup3;
                    }
                    C571320Maw.LIZ(activity, videoPublishEditModel, width, viewGroup.getHeight(), i);
                    return;
                }
                return;
            }
            List<Scene> sceneList = navigationSceneLIZ.getSceneList();
            if (!((ArrayList) sceneList).isEmpty()) {
                Iterator it2 = ((ArrayList) sceneList).iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof ImageEditRootScene) {
                        Function1<Integer, Unit> function1 = this.LLLF;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(i));
                        }
                        navigationSceneLIZ.LLLLLLJ(ImageEditRootScene.class, new C214798194i());
                        return;
                    }
                }
            }
            List<Scene> sceneList2 = navigationSceneLIZ.getSceneList();
            if (!((ArrayList) sceneList2).isEmpty()) {
                Iterator it3 = ((ArrayList) sceneList2).iterator();
                while (it3.hasNext()) {
                    if (it3.next() instanceof VideoEditContainerScene) {
                        Function1<Integer, Unit> function12 = this.LLLF;
                        if (function12 != null) {
                            function12.invoke(Integer.valueOf(i));
                        }
                        navigationSceneLIZ.LLLLLLJ(VideoEditContainerScene.class, null);
                        return;
                    }
                }
            }
            Function1<Integer, Unit> function13 = this.LLLFF;
            if (function13 == null) {
                return;
            }
            function13.invoke(Integer.valueOf(i));
        }
    }

    public final void LLLLLZL(boolean z) {
        FrameLayout frameLayout;
        VideoPublishEditModel videoPublishEditModel = this.LLJJL;
        boolean z2 = this.LLLLIL;
        String str = this.LLJLILLLLZIIL;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLLLJI;
        View view = null;
        if (str2 == null) {
            str2 = null;
        }
        C1402820mbo.LIZIZ(videoPublishEditModel, str, str2, "preview_feed", z2);
        LLLLZLLLI(false);
        View view2 = this.LLLIIII;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.LJLLLLLL(8, view);
        if (LLLLZLLIL() && (frameLayout = this.LLLIIIIL) != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        this.LLLLLIL = true;
        Function0<Unit> function0 = this.LLJLLL;
        if (function0 != null) {
            function0.invoke();
        }
        if (!z) {
            if (this.LLJZ) {
                InterfaceC19714712Bl interfaceC19714712Bl = this.LLL;
                if (interfaceC19714712Bl != null) {
                    interfaceC19714712Bl.S();
                    return;
                }
                return;
            }
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ == null) {
                return;
            }
            navigationSceneLIZ.remove(this);
        }
    }

    public final void LLLLZ(View view) {
        ViewGroup viewGroup;
        C120B c120b = this.LLLIIL;
        View view2 = null;
        if (c120b == null) {
            c120b = null;
        }
        View view3 = c120b.LLIZLLLIL;
        if (view3 == null) {
            view3 = null;
        }
        ViewParent parent = view3.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            LinearLayout linearLayout = c120b.LLJJI;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C426750GoL.LJIIIZ(linearLayout, null, null, 0, null, false, 27);
            View view4 = c120b.LLIZLLLIL;
            if (view4 == null) {
                view4 = null;
            }
            int iIndexOfChild = viewGroup.indexOfChild(view4);
            View view5 = c120b.LLIZLLLIL;
            if (view5 != null) {
                view2 = view5;
            }
            C786410Ut5.LJJJLZIJ(view2, viewGroup);
            viewGroup.addView(view, iIndexOfChild);
            View viewFindViewById = view.findViewById(R.id.desc);
            if (viewFindViewById != null) {
                if (viewFindViewById.isLaidOut() && !viewFindViewById.isLayoutRequested()) {
                    View view6 = c120b.LLILZ;
                    if (view6 != null) {
                        ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = viewFindViewById.getWidth();
                            C786410Ut5.W5(view6, layoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                } else {
                    viewFindViewById.addOnLayoutChangeListener(new C12YD(c120b, 15));
                }
            }
            c120b.LLIZLLLIL = view;
            C786410Ut5.I7(new ACListenerS163S0100000_29(c120b, 316), view);
        }
    }

    public final void LLLLZLLLI(boolean z) {
        long j;
        long j2;
        FrameLayout frameLayout;
        this.LLLLIL = z;
        C120B c120b = this.LLLIIL;
        View view = null;
        if (c120b == null) {
            c120b = null;
        }
        boolean z2 = !z;
        View view2 = c120b.LLJJIJI;
        if (view2 == null) {
            view2 = null;
        }
        if (z2) {
            j = 0;
            C12C5.LIZIZ(view2, 0L, 0.4f, null, 5);
        } else {
            j = 0;
            C12C5.LIZJ(view2, 0L, null, null, 15);
        }
        View view3 = c120b.LLJJIJIIJIL;
        if (view3 == null) {
            view3 = null;
        }
        if (z2) {
            C12C5.LIZIZ(view3, j, 1.0f, null, 5);
        } else {
            C12C5.LIZJ(view3, j, null, null, 15);
        }
        View view4 = c120b.LLJJJIL;
        if (view4 == null) {
            view4 = null;
        }
        C12C5.LIZ(view4, z2);
        View view5 = c120b.LLJJJJ;
        if (view5 == null) {
            view5 = null;
        }
        C12C5.LIZ(view5, z2);
        View view6 = c120b.LLJJJJJIL;
        if (view6 == null) {
            view6 = null;
        }
        C12C5.LIZ(view6, z2);
        View view7 = c120b.LLJJJJLIIL;
        if (view7 == null) {
            view7 = null;
        }
        C12C5.LIZ(view7, z2);
        View view8 = c120b.LLJJL;
        if (view8 == null) {
            view8 = null;
        }
        C12C5.LIZ(view8, z2);
        TuxIconView tuxIconView = this.LLLIILIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        if (z) {
            j2 = 0;
            C12C5.LIZIZ(tuxIconView, 0L, 1.0f, null, 5);
        } else {
            j2 = 0;
            C12C5.LIZJ(tuxIconView, 0L, null, null, 15);
        }
        View view9 = this.LLLIIII;
        if (view9 == null) {
            view9 = null;
        }
        if (z) {
            C12C5.LIZIZ(view9, j2, 1.0f, null, 5);
        } else {
            C12C5.LIZJ(view9, j2, null, null, 15);
        }
        if ((!C1428470nHB.LLIIIILZ(this.LLJJL) || Intrinsics.LJFF(this.LLJJL.getDraftLandPage(), "video_post_page") || LLLLZLLIL()) && (frameLayout = this.LLLIIIIL) != null) {
            if (z) {
                C12C5.LIZIZ(frameLayout, j2, 1.0f, null, 5);
            } else {
                C12C5.LIZJ(frameLayout, j2, null, null, 15);
            }
        }
        View view10 = this.LLLIL;
        if (view10 == null) {
            view10 = null;
        }
        C1428310nGv.LJIIIIZZ(view10, z);
        View view11 = this.LLLILZLLLI;
        if (view11 != null) {
            view = view11;
        }
        C1428310nGv.LJIIIIZZ(view, z2);
        View view12 = this.LLLILZJ;
        if (view12 != null) {
            C1428310nGv.LJIIIIZZ(view12, z);
        }
        if (this.LLJZ) {
            View view13 = this.LLLILZJ;
            if (view13 != null) {
                C786410Ut5.LJLLLLLL(8, view13);
            }
            if (z) {
                InterfaceC19714712Bl interfaceC19714712Bl = this.LLL;
                if (interfaceC19714712Bl != null) {
                    interfaceC19714712Bl.show();
                    return;
                }
                return;
            }
            InterfaceC19714712Bl interfaceC19714712Bl2 = this.LLL;
            if (interfaceC19714712Bl2 == null) {
                return;
            }
            interfaceC19714712Bl2.hide();
        }
    }

    public final void LLLZ(boolean z) {
        View view = this.mView;
        if (view != null && view.getVisibility() == 0) {
            if (z && this.LLLLIL) {
                InterfaceC19714712Bl interfaceC19714712Bl = this.LLL;
                if (interfaceC19714712Bl != null) {
                    interfaceC19714712Bl.show();
                    return;
                }
                return;
            }
            InterfaceC19714712Bl interfaceC19714712Bl2 = this.LLL;
            if (interfaceC19714712Bl2 == null) {
                return;
            }
            interfaceC19714712Bl2.hide();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
        int iLIZIZ;
        if (z) {
            iLIZIZ = C0LEO.LIZIZ();
        } else {
            iLIZIZ = 0;
        }
        int i = LLLLLZ;
        C1462760oAU c1462760oAU = this.LLLJIL;
        View view = null;
        if (c1462760oAU == null) {
            c1462760oAU = null;
        }
        LLLLZIL(i, c1462760oAU);
        FrameLayout frameLayout = this.LLLLIILL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        LLLLZIL(i, frameLayout);
        TuxIconView tuxIconView = this.LLLLIIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        LLLLZIL(iLIZIZ / 2, tuxIconView);
        View view2 = this.LLLLIIIILLL;
        if (view2 != null) {
            view = view2;
        }
        LLLLZIL(iLIZIZ, view);
        LinearLayout linearLayout = this.LLLIIIL;
        if (linearLayout != null) {
            LLLLZIL(C0LEO.LIZIZ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), linearLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS283S0000000_35.get$arr$(86));
        C1664590tQ1.LIZLLL(this, "ImagePublishPreviewScene", false, new AwS587S0100000_8(this, 258), 2);
        C1664600tQ2.LIZ(this, "ImagePublishPreviewScene", new AwS608S0100000_29(this, 236));
        C1642810sqt.LIZ(C1664600tQ2.LJ(this), "image_publish_preview");
        LLLLLLZ().LLLIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        LLLLLLZ().ct1(true);
        LLLLLLZ().kM1(this.LLJLL, 0.0f);
        C19647111tt c19647111tt = this.LLLJL;
        if (c19647111tt == null) {
            c19647111tt = null;
        }
        c19647111tt.LLJJIJI = new AwS573S0100000_29(this, 276);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
        LLLLZLL((int) C11VU.LIZIZ(3.0f, requireActivity()), this.LLLILZ, true);
        C419260GcG c419260GcG = this.LLLIZZ;
        FrameLayout frameLayout = null;
        if (c419260GcG == null) {
            c419260GcG = null;
        }
        LLLLZLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), c419260GcG, true);
        C120B c120b = this.LLLIIL;
        if (c120b == null) {
            c120b = null;
        }
        LLLLZLL(0, c120b, true);
        C1462760oAU c1462760oAU = this.LLLJIL;
        if (c1462760oAU == null) {
            c1462760oAU = null;
        }
        LLLLZLL(0, c1462760oAU, !LLLLLLLZIL());
        FrameLayout frameLayout2 = this.LLLLIILL;
        if (frameLayout2 != null) {
            frameLayout = frameLayout2;
        }
        LLLLZLL(0, frameLayout, !LLLLLLLZIL());
    }

    public static void LLLLZIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        C786410Ut5.W5(view, marginLayoutParams);
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        LLLLLZL(false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183 A[PHI: r6
      0x0183: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String), (r6v0 java.lang.String) binds: [B:59:0x0181, B:76:0x01e5, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARN: Type inference failed for: r4v235, types: [X.12Bs] */
    /* JADX WARN: Type inference failed for: r4v64, types: [X.12Br] */
    /* JADX WARN: Type inference failed for: r6v51, types: [X.12Bf] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r29, android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void LLLLZLL(int i, View view, boolean z) {
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (z) {
            i += ((Number) this.LLLLLLZZ.getValue()).intValue();
        }
        marginLayoutParams.topMargin = i;
        C786410Ut5.W5(view, marginLayoutParams);
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && intent.getBooleanExtra("extra_return_to_publish", false)) {
            LLLLLZL(false);
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.w_, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePublishPreviewScene(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, int i, String str2, int i2, Function0<Unit> function0, Function0<Unit> function02, boolean z, int i3, InterfaceC19714712Bl interfaceC19714712Bl, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, boolean z2) {
        this.LLJJL = videoPublishEditModel;
        this.LLJJLIIIJLLLLLLLZ = str;
        this.LLJL = urlModel;
        this.LLJLIL = i;
        this.LLJLILLLLZIIL = str2;
        this.LLJLL = i2;
        this.LLJLLIL = function0;
        this.LLJLLL = function02;
        this.LLJZ = z;
        this.LLJZIJLIL = i3;
        this.LLL = interfaceC19714712Bl;
        this.LLLF = function1;
        this.LLLFF = function12;
        this.LLLFFI = z2;
        this.LLLLIL = true;
        this.LLLLLJIL = C1449630npJ.LIZ(this, InterfaceC1453410nvP.class);
        this.LLLLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 279));
        this.LLLLLLIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(185));
        this.LLLLLLLZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 275));
        this.LLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 277));
        this.LLLLLLZZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 278));
    }

    public /* synthetic */ ImagePublishPreviewScene(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, int i, String str2, int i2, Function0 function0, Function0 function02, boolean z, int i3, C19714312Bh c19714312Bh, Function1 function1, Function1 function12, boolean z2, int i4) {
        this(videoPublishEditModel, str, urlModel, i, str2, i2, function0, (i4 & 128) != 0 ? null : function02, (i4 & 256) != 0 ? false : z, i3, (i4 & 1024) != 0 ? null : c19714312Bh, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function1, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? function12 : null, (i4 & 8192) != 0 ? false : z2);
    }
}
