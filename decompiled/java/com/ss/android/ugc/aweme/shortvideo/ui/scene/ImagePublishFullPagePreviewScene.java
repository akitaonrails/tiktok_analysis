package com.ss.android.ugc.aweme.shortvideo.ui.scene;

import X.AbstractC19647511tx;
import X.C01GW;
import X.C0C0S;
import X.C0RFT;
import X.C0SP8;
import X.C1172980gd6;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C120E;
import X.C120F;
import X.C12C5;
import X.C12WG;
import X.C1308910kAL;
import X.C1397760mTe;
import X.C13LE;
import X.C1402820mbo;
import X.C1428310nGv;
import X.C1432320nNO;
import X.C1444760nhS;
import X.C1447800nmM;
import X.C1452870nuX;
import X.C1462760oAU;
import X.C1466090oFr;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1697810uHb;
import X.C1766560w4U;
import X.C19647111tt;
import X.C19715812Bw;
import X.C19774712Yn;
import X.C19775212Ys;
import X.C1DRG;
import X.C20094413jq;
import X.C20094813ju;
import X.C337180DJs;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1397840mTm;
import X.InterfaceC1453410nvP;
import X.InterfaceC19714512Bj;
import X.InterfaceC19714712Bl;
import X.InterfaceC19715212Bq;
import X.InterfaceC572870MdR;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS163S0100000_29;
import Y.AObjectS247S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS98S0200000_29;
import Y.ATListenerS461S0100000_29;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AFwS328S0000000_3;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ImagePublishFullPagePreviewScene extends PublishPreviewScene {
    public final VideoPublishEditModel LLJJL;
    public final InterfaceC19714712Bl LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final boolean LLJLIL;
    public final Function0<Unit> LLJLILLLLZIIL;
    public final String LLJLL;
    public final InterfaceC572870MdR LLJLLIL;
    public final Function2<Integer, Boolean, Unit> LLJLLL;
    public final boolean LLJZ;
    public InterfaceC1453410nvP LLJZIJLIL;
    public boolean LLL;
    public C19715812Bw LLLFFI;
    public C1462760oAU LLLFZ;
    public FrameLayout LLLI;
    public C19647111tt LLLII;
    public ScrollView LLLIIII;
    public ImageView LLLIIIIL;
    public FrameLayout LLLIIIL;
    public ObjectAnimator LLLIIL;
    public View LLLIILIL;
    public View LLLIL;
    public View LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final C0SP8 LLLJIL;
    public final C1444760nhS LLLJL;
    public C0RFT LLLLII;
    public C120F LLLLIIIILLL;
    public InterfaceC19715212Bq LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLF = true;
    public String LLLFF = "";
    public final C1172980gd6 LLLJ = new Scene() { // from class: X.0gd6
        @Override // com.bytedance.scene.Scene
        public final void onViewCreated(View view, Bundle bundle) {
            super.onViewCreated(view, bundle);
            ((TextView) view.findViewById(R.id.rjt)).setEnabled(false);
        }

        @Override // com.bytedance.scene.Scene
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return C786410Ut5.Td(layoutInflater, R.layout.e_j, viewGroup, false);
        }
    };
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 281));

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLIL() {
        return true;
    }

    public final void LLLLLLZ() {
        this.LLLIZZ = false;
        ImageView imageView = this.LLLIIIIL;
        if (imageView == null) {
            imageView = null;
        }
        C337180DJs.LIZ(imageView);
        InterfaceC572870MdR interfaceC572870MdR = this.LLJLLIL;
        if (interfaceC572870MdR != null) {
            interfaceC572870MdR.resume();
        }
        InterfaceC1453410nvP interfaceC1453410nvP = this.LLJZIJLIL;
        (interfaceC1453410nvP != null ? interfaceC1453410nvP : null).resume();
        C19715812Bw c19715812Bw = this.LLLFFI;
        if (c19715812Bw != null) {
            c19715812Bw.rl();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
    }

    public final void pause() {
        this.LLLIZZ = true;
        ImageView imageView = this.LLLIIIIL;
        if (imageView == null) {
            imageView = null;
        }
        C337180DJs.LIZJ(imageView);
        InterfaceC572870MdR interfaceC572870MdR = this.LLJLLIL;
        if (interfaceC572870MdR != null) {
            interfaceC572870MdR.pause();
        }
        InterfaceC1453410nvP interfaceC1453410nvP = this.LLJZIJLIL;
        (interfaceC1453410nvP != null ? interfaceC1453410nvP : null).pause(false);
        C19715812Bw c19715812Bw = this.LLLFFI;
        if (c19715812Bw != null) {
            c19715812Bw.Li();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLLL() {
        View view = this.LLLILZ;
        if (view == null) {
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        this.LLLIIL = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat == null) {
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.setDuration(1000L);
        ObjectAnimator objectAnimator = this.LLLIIL;
        if (objectAnimator == null) {
            objectAnimator = null;
        }
        objectAnimator.setRepeatCount(-1);
        ObjectAnimator objectAnimator2 = this.LLLIIL;
        if (objectAnimator2 == null) {
            objectAnimator2 = null;
        }
        objectAnimator2.setInterpolator(new LinearInterpolator());
        View view2 = this.LLLIILIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        View view3 = this.LLLILZ;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(0, view3);
        ObjectAnimator objectAnimator3 = this.LLLIIL;
        if (objectAnimator3 == null) {
            objectAnimator3 = null;
        }
        if (objectAnimator3.isRunning()) {
            return;
        }
        ObjectAnimator objectAnimator4 = this.LLLIIL;
        C786410Ut5.Pd(objectAnimator4 != null ? objectAnimator4 : null);
    }

    public final void LLLLLLLLL() {
        if (this.LLLIZZ) {
            InterfaceC19714712Bl interfaceC19714712Bl = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC19714712Bl != null) {
                interfaceC19714712Bl.LIZJ(1);
            }
            LLLLLLZ();
            return;
        }
        InterfaceC19714712Bl interfaceC19714712Bl2 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC19714712Bl2 != null) {
            interfaceC19714712Bl2.LIZ(1);
        }
        C1402820mbo.LJ(this.LLJJL, "preview_full_page");
        pause();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final C1202330hOR LLLLJI() {
        if (!C0C0S.LIZ()) {
            return super.LLLLJI();
        }
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLJ() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        return Intrinsics.LJFF(navigationSceneLIZ != null ? navigationSceneLIZ.LLLLIIIILLL() : null, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[PHI: r1
      0x004c: PHI (r1v9 java.lang.Integer) = (r1v8 java.lang.Integer), (r1v11 java.lang.Integer) binds: [B:32:0x0086, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLLLLLLLL() {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishFullPagePreviewScene.LLLLLLLLLL():int");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        InterfaceC572870MdR interfaceC572870MdR;
        C1452870nuX c1452870nuXAv;
        super.onDestroyView();
        C19715812Bw c19715812Bw = this.LLLFFI;
        if (c19715812Bw != null && (c1452870nuXAv = c19715812Bw.Av()) != null) {
            c1452870nuXAv.release();
        }
        Function2<Integer, Boolean, Unit> function2 = this.LLJLLL;
        if (function2 != null) {
            C1462760oAU c1462760oAU = this.LLLFZ;
            if (c1462760oAU == null) {
                c1462760oAU = null;
            }
            function2.invoke(Integer.valueOf(c1462760oAU.getCurrentItem()), Boolean.valueOf(this.LLLIZZ));
        }
        if (!C0C0S.LIZ() || (interfaceC572870MdR = this.LLJLLIL) == null) {
            return;
        }
        interfaceC572870MdR.setVolume(this.LLJJL.getMusicVolume());
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        InterfaceC572870MdR interfaceC572870MdR;
        super.onPause();
        if (this.LLLILZLLLI || (interfaceC572870MdR = this.LLJLLIL) == null) {
            return;
        }
        interfaceC572870MdR.pause();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLLIZZ) {
            C12WG.LIZLLL(this, new ARunnableS129S0100000_29(this, 90), 300L);
            return;
        }
        InterfaceC572870MdR interfaceC572870MdR = this.LLJLLIL;
        if (interfaceC572870MdR != null) {
            interfaceC572870MdR.resume();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        if (C0C0S.LIZ()) {
            TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
            tuxImmersionBarLJ.LJIIIIZZ(R.attr.bx);
            tuxImmersionBarLJ.LJ(R.attr.bx);
            tuxImmersionBarLJ.LIZ(true);
            tuxImmersionBarLJ.LIZLLL();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        if (z) {
            InterfaceC1453410nvP interfaceC1453410nvP = this.LLJZIJLIL;
            C1462760oAU c1462760oAU = null;
            if (interfaceC1453410nvP == null) {
                interfaceC1453410nvP = null;
            }
            C1462760oAU c1462760oAU2 = this.LLLFZ;
            if (c1462760oAU2 != null) {
                c1462760oAU = c1462760oAU2;
            }
            interfaceC1453410nvP.kM1(c1462760oAU.getCurrentItem(), 0.0f);
        }
    }

    public final void LLLLLLZZ(boolean z) {
        View view;
        View view2;
        if (z) {
            C1172980gd6 c1172980gd6 = this.LLLJ;
            if (c1172980gd6 != null && (view2 = c1172980gd6.mView) != null) {
                C12C5.LIZJ(view2, 300L, null, null, 14);
            }
            View view3 = this.LLLIL;
            if (view3 == null) {
                view3 = null;
            }
            C12C5.LIZIZ(view3, 300L, 0.0f, null, 6);
            return;
        }
        C1172980gd6 c1172980gd62 = this.LLLJ;
        if (c1172980gd62 != null && (view = c1172980gd62.mView) != null) {
            C12C5.LIZIZ(view, 300L, 0.0f, null, 6);
        }
        View view4 = this.LLLIL;
        if (view4 == null) {
            view4 = null;
        }
        C12C5.LIZJ(view4, 300L, null, null, 14);
    }

    public final void LLLLLLLZIL(Scene scene, int i) {
        if (!isAdded(scene)) {
            String strLJI = C13LE.LIZ(scene.getClass()).LJI();
            if (strLJI == null) {
                strLJI = "";
            }
            add(i, scene, strLJI);
        }
        show(scene);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        List<SingleImageData> imageList;
        Context context;
        Integer numLIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        this.config.LIZLLL = false;
        this.LLLFZ = (C1462760oAU) requireViewById(R.id.viewPager);
        this.LLLI = (FrameLayout) requireViewById(R.id.w6j);
        Activity activity = this.mActivity;
        Context contextRequireSceneContext = requireSceneContext();
        VideoPublishEditModel videoPublishEditModel = this.LLJJL;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null) {
            C19647111tt c19647111tt = new C19647111tt(activity, this, contextRequireSceneContext, videoPublishEditModel, imageAlbumData, !C0C0S.LIZ(), 0.75f, C0C0S.LIZ(), 0, false, new AwS573S0100000_29(this, 283), new AbstractC19647511tx() { // from class: X.11ty
            }, null, null, 26144);
            this.LLLII = c19647111tt;
            c19647111tt.LLJJIII = !this.LLJLIL;
            C1462760oAU c1462760oAU = this.LLLFZ;
            if (c1462760oAU == null) {
                c1462760oAU = null;
            }
            c1462760oAU.setOffscreenPageLimit(1);
            C1462760oAU c1462760oAU2 = this.LLLFZ;
            if (c1462760oAU2 == null) {
                c1462760oAU2 = null;
            }
            C19647111tt c19647111tt2 = this.LLLII;
            if (c19647111tt2 == null) {
                c19647111tt2 = null;
            }
            c1462760oAU2.setAdapter(c19647111tt2);
            C1462760oAU c1462760oAU3 = this.LLLFZ;
            if (c1462760oAU3 == null) {
                c1462760oAU3 = null;
            }
            c1462760oAU3.setPublishPreview(true);
            C1462760oAU c1462760oAU4 = this.LLLFZ;
            if (c1462760oAU4 == null) {
                c1462760oAU4 = null;
            }
            c1462760oAU4.setCanScroll(true);
            C1462760oAU c1462760oAU5 = this.LLLFZ;
            if (c1462760oAU5 == null) {
                c1462760oAU5 = null;
            }
            c1462760oAU5.LLFFF(this.LLJL, false);
            C19647111tt c19647111tt3 = this.LLLII;
            if (c19647111tt3 == null) {
                c19647111tt3 = null;
            }
            c19647111tt3.LLJJIJI = new AwS573S0100000_29(this, 284);
            C19647111tt c19647111tt4 = this.LLLII;
            if (c19647111tt4 == null) {
                c19647111tt4 = null;
            }
            c19647111tt4.LLJJIJIIJIL = new AwS573S0100000_29(this, 285);
            C1462760oAU c1462760oAU6 = this.LLLFZ;
            if (c1462760oAU6 == null) {
                c1462760oAU6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c1462760oAU6.getLayoutParams();
            marginLayoutParams2.height = LLLLLLLLLL();
            FrameLayout frameLayout = this.LLLI;
            if (frameLayout == null) {
                frameLayout = null;
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.height = LLLLLLLLLL() - marginLayoutParams.topMargin;
                FrameLayout frameLayout2 = this.LLLI;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                C786410Ut5.a6(frameLayout2, marginLayoutParams);
            }
            C1462760oAU c1462760oAU7 = this.LLLFZ;
            if (c1462760oAU7 == null) {
                c1462760oAU7 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1462760oAU7);
            c1462760oAU7.setLayoutParams(marginLayoutParams2);
            if (C0C0S.LIZ() && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                C1462760oAU c1462760oAU8 = this.LLLFZ;
                if (c1462760oAU8 == null) {
                    c1462760oAU8 = null;
                }
                c1462760oAU8.setBackgroundColor(iIntValue);
            }
            C1462760oAU c1462760oAU9 = this.LLLFZ;
            if (c1462760oAU9 == null) {
                c1462760oAU9 = null;
            }
            c1462760oAU9.LIZLLL(new C19774712Yn(this, 7));
            C1462760oAU c1462760oAU10 = this.LLLFZ;
            if (c1462760oAU10 == null) {
                c1462760oAU10 = null;
            }
            c1462760oAU10.setOnTouchListener(new ATListenerS461S0100000_29(this, 10));
            C1654320t9S.LIZIZ(this, AFwS283S0000000_35.get$arr$(89));
            C1664590tQ1.LIZLLL(this, "ImagePublishFullPagePreviewScene", false, new AwS610S0100000_31(this, 232), 2);
            C1664600tQ2.LIZ(this, "ImagePublishFullPagePreviewScene", new AwS608S0100000_29(this, 246));
            C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
            if (c1drg != null) {
                this.LLLLIIIILLL = (C120F) c1drg.LJIIL(null, C120F.class);
                InterfaceC1453410nvP interfaceC1453410nvP = (InterfaceC1453410nvP) c1drg.LJII(InterfaceC1453410nvP.class, null);
                this.LLJZIJLIL = interfaceC1453410nvP;
                interfaceC1453410nvP.ct1(true);
                if (C0C0S.LIZ()) {
                    InterfaceC19714512Bj interfaceC19714512Bj = (InterfaceC19714512Bj) c1drg.LJIIL(null, InterfaceC19714512Bj.class);
                    if (interfaceC19714512Bj != null) {
                        LiveState<Boolean> liveStateIsFullScreen = interfaceC19714512Bj.isFullScreen();
                        if (liveStateIsFullScreen != null) {
                            liveStateIsFullScreen.LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 242));
                        }
                        LiveEvent<Unit> liveEventAk = interfaceC19714512Bj.ak();
                        if (liveEventAk != null) {
                            liveEventAk.LJII(this, Lifecycle.State.STARTED, new AObjectS247S0100000_29(this, 58));
                        }
                    }
                    this.LLLLIIL = (InterfaceC19715212Bq) c1drg.LJIIL(null, InterfaceC19715212Bq.class);
                }
                this.LLLIL = requireViewById(R.id.sg_);
                this.LLLIIIL = (FrameLayout) requireViewById(R.id.sg9);
                this.LLLIILIL = requireViewById(R.id.sgr);
                this.LLLILZ = requireViewById(R.id.sgu);
                if (this.LLJJL.creativeModel.editPostModel != null) {
                    ((TextView) requireViewById(R.id.shc)).setText(2131833454);
                }
                FrameLayout frameLayout3 = this.LLLIIIL;
                if (frameLayout3 == null) {
                    frameLayout3 = null;
                }
                C786410Ut5.O7(frameLayout3, new ACListenerS163S0100000_29(this, 102));
                int i = C20094413jq.LJIIZILJ;
                FrameLayout frameLayout4 = this.LLLIIIL;
                if (frameLayout4 == null) {
                    frameLayout4 = null;
                }
                C1397760mTe c1397760mTe = new C1397760mTe();
                c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
                c1397760mTe.LIZJ = null;
                C20094813ju.LIZ(frameLayout4, c1397760mTe.LIZ());
                LLLLLLZZ(true);
                ImageView imageView = (ImageView) this.mView.findViewById(R.id.rlr);
                this.LLLIIIIL = imageView;
                if (imageView == null) {
                    imageView = null;
                }
                C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 100));
                if (this.LLJLIL) {
                    pause();
                }
                if (!((C1432320nNO) this.LLLL.getValue()).LJFF()) {
                    ImageAlbumData imageAlbumData2 = this.LLJJL.getImageAlbumData();
                    if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
                        int i2 = 0;
                        for (SingleImageData singleImageData : imageList) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                SingleImageData singleImageData2 = singleImageData;
                                C19647111tt c19647111tt5 = this.LLLII;
                                if (c19647111tt5 == null) {
                                    c19647111tt5 = null;
                                }
                                ImageSynthesisResult synthesisData = singleImageData2.getSynthesisData();
                                if (synthesisData != null) {
                                    c19647111tt5.LJJJIL(i2, synthesisData);
                                    i2 = i3;
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                } else {
                    C1432320nNO.LJII((C1432320nNO) this.LLLL.getValue(), this.LLJJL, new AwS643S0100000_29(this, 42), AFwS328S0000000_3.get$arr$(1), AFwS273S0000000_29.get$arr$(140), null, true, 48);
                }
                List<StickerModel> listLJFF = C1466090oFr.LJFF(this.LLJJL.creativeModel.stickerModel);
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) listLJFF) {
                    StickerModel stickerModel = (StickerModel) obj;
                    if (!stickerModel.needCompile() && !stickerModel.isVERenderSticker()) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C12WG.LIZJ(this, new ARunnableS98S0200000_29(this, arrayList, 30));
                }
                if (!C0C0S.LIZ()) {
                    C1DRG c1drg2 = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
                    if (c1drg2 != null) {
                        LLLLLLLZIL(new C120E(c1drg2), R.id.view_stub_follow);
                        C1428310nGv.LJI(LLLLLLLLLL() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), requireViewById(R.id.view_stub), false);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                LLLLLLLZIL(this.LLLJ, R.id.view_stub_action_bar);
                LLLLLLLZIL(this.LLLJL, R.id.view_stub_anchors_time);
                LLLLLLLZIL(this.LLLJIL, R.id.view_stub_description);
                C1447800nmM.LIZIZ(this).LLLIILIL(this, new C19775212Ys(this, 2));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (C0C0S.LIZ()) {
            View viewTd = C786410Ut5.Td(layoutInflater, R.layout.duw, viewGroup, false);
            if (!(viewTd instanceof ViewGroup) || (viewGroup3 = (ViewGroup) viewTd) == null) {
                return new FrameLayout(layoutInflater.getContext());
            }
            return viewGroup3;
        }
        View viewTd2 = C786410Ut5.Td(layoutInflater, R.layout.duu, viewGroup, false);
        if ((viewTd2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewTd2) != null) {
            return viewGroup2;
        }
        return new FrameLayout(layoutInflater.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0gd6] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0SP8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0nhS] */
    public ImagePublishFullPagePreviewScene(final VideoPublishEditModel videoPublishEditModel, InterfaceC19714712Bl interfaceC19714712Bl, final String str, final UrlModel urlModel, int i, boolean z, Function0<Unit> function0, String str2, InterfaceC572870MdR interfaceC572870MdR, Function2<? super Integer, ? super Boolean, Unit> function2, boolean z2) {
        this.LLJJL = videoPublishEditModel;
        this.LLJJLIIIJLLLLLLLZ = interfaceC19714712Bl;
        this.LLJL = i;
        this.LLJLIL = z;
        this.LLJLILLLLZIIL = function0;
        this.LLJLL = str2;
        this.LLJLLIL = interfaceC572870MdR;
        this.LLJLLL = function2;
        this.LLJZ = z2;
        this.LLLILZJ = true ^ z2;
        this.LLLIZZ = z;
        this.LLLJIL = new Scene(videoPublishEditModel) { // from class: X.0SP8
            public final VideoPublishEditModel LLJI;
            public C1355730lNr LLJIJIL;
            public TuxTextView LLJILJIL;

            {
                this.LLJI = videoPublishEditModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
            @Override // com.bytedance.scene.Scene
            public final void onViewCreated(View view, Bundle bundle) {
                ?? arrayList;
                boolean z3;
                int iRgb;
                super.onViewCreated(view, bundle);
                this.LLJIJIL = (C1355730lNr) view.findViewById(R.id.rru);
                this.LLJILJIL = (TuxTextView) view.findViewById(R.id.rrv);
                String title = this.LLJI.getTitle();
                List<AVTextExtraStruct> structList = this.LLJI.getStructList();
                if (structList != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(structList, 10));
                    for (AVTextExtraStruct aVTextExtraStruct : structList) {
                        TextExtraStruct textExtraStruct = new TextExtraStruct();
                        textExtraStruct.setStart(aVTextExtraStruct.start);
                        textExtraStruct.setEnd(aVTextExtraStruct.end);
                        textExtraStruct.setType(aVTextExtraStruct.type);
                        textExtraStruct.setHashTagName(aVTextExtraStruct.hashTagName);
                        textExtraStruct.setSubType(aVTextExtraStruct.subType);
                        textExtraStruct.setAwemeId("123");
                        arrayList.add(textExtraStruct);
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                String heading = this.LLJI.getHeading();
                if (heading != null && heading.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                TuxTextView tuxTextView = null;
                if (!z3) {
                    TuxTextView tuxTextView2 = this.LLJILJIL;
                    if (tuxTextView2 == null) {
                        tuxTextView2 = null;
                    }
                    C337180DJs.LIZJ(tuxTextView2);
                    TuxTextView tuxTextView3 = this.LLJILJIL;
                    if (tuxTextView3 == null) {
                        tuxTextView3 = null;
                    }
                    tuxTextView3.setText(this.LLJI.getHeading());
                }
                if (title == null) {
                    title = "";
                }
                C0SJF c0sjfLIZIZ = C719200SJa.LIZIZ(title, arrayList);
                c0sjfLIZIZ.LIZLLL(new AwS590S0100000_11(AFwS243S0000000_11.get$arr$(311), (Function1<? super C0RTH, Unit>) 611));
                final Context context = this.mView.getContext();
                C1355730lNr c1355730lNr = this.LLJIJIL;
                if (c1355730lNr == null) {
                    c1355730lNr = null;
                }
                final int currentTextColor = c1355730lNr.getCurrentTextColor();
                c0sjfLIZIZ.LIZLLL(new C0SJU(Collections.singletonList(new C0SJV() { // from class: X.0SJt
                    @Override // X.C0SJV
                    public final void LIZ(C0SJL<C719000SIg> c0sjl) {
                        TextExtraStruct textExtraStruct2;
                        float f;
                        boolean z4;
                        C0SP8 c0sp8 = this.LIZ;
                        Context context2 = context;
                        int i2 = currentTextColor;
                        c0sp8.getClass();
                        C719000SIg c719000SIg = c0sjl.LLIZ;
                        if (c719000SIg != null && (textExtraStruct2 = c719000SIg.LIZ) != null) {
                            int iLIZ = C960203pA.LIZ(R.attr.br, context2);
                            if (C722510SVt.LIZJ()) {
                                z4 = true;
                                f = 15.0f;
                                iLIZ = 0;
                            } else {
                                f = 13.0f;
                                z4 = false;
                            }
                            C428830Grh c428830Grh = new C428830Grh(context2, C814420VxA.LIZIZ(C12ES.LJIIJ(context2)), iLIZ, i2, textExtraStruct2, true, null, true, z4, null, 1600);
                            float fLIZJ = C12ES.LIZJ(12.0f, context2);
                            if (C722510SVt.LIZJ()) {
                                fLIZJ = C12ES.LIZJ(8.0f, context2);
                            }
                            c428830Grh.LLJILLL = fLIZJ;
                            c428830Grh.LLJJ = C12ES.LIZJ(2.0f, context2);
                            c428830Grh.LLJILJIL = C12ES.LIZJ(f, context2);
                            c0sjl.LLIZLLLIL.add(c428830Grh);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("addTypeAtMatcher: start:");
                            sbLIZ.append(textExtraStruct2.getStart());
                            sbLIZ.append(", end: ");
                            sbLIZ.append(textExtraStruct2.getEnd());
                            C719300SJk.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }

                    @Override // X.C0SJV
                    public final boolean LIZIZ(C0SJL<C719000SIg> c0sjl) {
                        C0SP8 c0sp8 = this.LIZ;
                        C719000SIg c719000SIg = c0sjl.LLIZ;
                        c0sp8.getClass();
                        if (c719000SIg == null || c719000SIg.LIZ.getType() != 5) {
                            return false;
                        }
                        return true;
                    }
                })));
                CharSequence charSequenceLIZ = C0SJF.LIZ(c0sjfLIZIZ);
                if (TextUtils.isEmpty(charSequenceLIZ)) {
                    C1355730lNr c1355730lNr2 = this.LLJIJIL;
                    if (c1355730lNr2 == null) {
                        c1355730lNr2 = null;
                    }
                    int visibility = c1355730lNr2.getVisibility();
                    c1355730lNr2.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c1355730lNr2);
                } else {
                    C1355730lNr c1355730lNr3 = this.LLJIJIL;
                    if (c1355730lNr3 == null) {
                        c1355730lNr3 = null;
                    }
                    int visibility2 = c1355730lNr3.getVisibility();
                    c1355730lNr3.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c1355730lNr3);
                    C1355730lNr c1355730lNr4 = this.LLJIJIL;
                    if (c1355730lNr4 == null) {
                        c1355730lNr4 = null;
                    }
                    c1355730lNr4.setText(charSequenceLIZ);
                    List<TextExtraStruct> listLIZJ = c0sjfLIZIZ.LIZJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getActualTextExtra textMetadata result -> ");
                    sbLIZ.append(C08JS.LIZLLL(listLIZJ));
                    C719300SJk.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (C19719512Dh.LJI(listLIZJ) && listLIZJ != null) {
                        C1355730lNr c1355730lNr5 = this.LLJIJIL;
                        if (c1355730lNr5 == null) {
                            c1355730lNr5 = null;
                        }
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bb, c1355730lNr5.getContext());
                        if (numLIZJ != null) {
                            iRgb = numLIZJ.intValue();
                        } else {
                            iRgb = Color.rgb(64, 141, 159);
                        }
                        c1355730lNr5.setSpanColor(iRgb);
                        c1355730lNr5.setSpanStyle(0);
                        if (C301000Br0.LIZIZ) {
                            C19719612Di.LJJIIJ(listLIZJ, AFwS243S0000000_11.get$arr$(312), true);
                        }
                        c1355730lNr5.LJJJJIZL(listLIZJ, null, null);
                        c1355730lNr5.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                    C1355730lNr c1355730lNr6 = this.LLJIJIL;
                    if (c1355730lNr6 == null) {
                        c1355730lNr6 = null;
                    }
                    c1355730lNr6.setLineHeight(iLIZIZ);
                }
                String heading2 = this.LLJI.getHeading();
                if (heading2 != null && heading2.length() != 0) {
                    TuxTextView tuxTextView4 = this.LLJILJIL;
                    if (tuxTextView4 == null) {
                        tuxTextView4 = null;
                    }
                    C337180DJs.LIZJ(tuxTextView4);
                    TuxTextView tuxTextView5 = this.LLJILJIL;
                    if (tuxTextView5 != null) {
                        tuxTextView = tuxTextView5;
                    }
                    tuxTextView.setText(this.LLJI.getHeading());
                }
            }

            @Override // com.bytedance.scene.Scene
            public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                return C786410Ut5.Td(layoutInflater, R.layout.e_q, viewGroup, false);
            }
        };
        this.LLLJL = new Scene(str, urlModel, videoPublishEditModel) { // from class: X.0nhS
            public final String LLJI;
            public final UrlModel LLJIJIL;
            public final VideoPublishEditModel LLJILJIL;
            public TuxTextView LLJILJILJ;
            public SmartImageView LLJILLL;
            public LinearLayout LLJJ;
            public LinearLayout LLJJI;
            public TuxTextView LLJJIII;

            @Override // com.bytedance.scene.Scene
            public final void onViewCreated(View view, Bundle bundle) {
                EditCapCutReuseModel.MusicInfo musicInfo;
                String str3;
                super.onViewCreated(view, bundle);
                this.LLJJI = (LinearLayout) this.mView.findViewById(R.id.rou);
                this.LLJJIII = (TuxTextView) this.mView.findViewById(R.id.b0b);
                CreativeModel creativeModel = this.LLJILJIL.creativeModel;
                EditPostModel editPostModel = creativeModel.editPostModel;
                TextView textView = null;
                if (editPostModel != null) {
                    musicInfo = editPostModel.getMusicInfo();
                } else {
                    EditCapCutReuseModel editCapCutReuseModel = creativeModel.initialModel.capCutReuseModel;
                    if (editCapCutReuseModel != null) {
                        musicInfo = editCapCutReuseModel.musicInfo;
                    } else {
                        musicInfo = null;
                    }
                }
                if (musicInfo == null && MusicBeanUtilKt.extractAVMusic(this.LLJILJIL.creativeModel.musicBuzModel) == null) {
                    this.LLJJ = (LinearLayout) this.mView.findViewById(R.id.rot);
                    this.LLJILJILJ = (TuxTextView) this.mView.findViewById(R.id.b0_);
                    this.LLJILLL = (SmartImageView) this.mView.findViewById(R.id.b0f);
                    String str4 = this.LLJI;
                    if (str4 != null && str4.length() != 0 && this.LLJIJIL != null) {
                        LinearLayout linearLayout = this.LLJJ;
                        if (linearLayout == null) {
                            linearLayout = null;
                        }
                        C337180DJs.LIZJ(linearLayout);
                        TuxTextView tuxTextView = this.LLJILJILJ;
                        if (tuxTextView == null) {
                            tuxTextView = null;
                        }
                        tuxTextView.setText(this.LLJI);
                        List<String> urlList = this.LLJIJIL.getUrlList();
                        if (urlList == null || (str3 = (String) C13LP.LJJJJZI(urlList)) == null) {
                            str3 = "";
                        }
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
                        SmartImageView smartImageView = this.LLJILLL;
                        if (smartImageView == null) {
                            smartImageView = null;
                        }
                        c1331670kl3LJIIIZ.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LJIIIZ);
                    }
                } else {
                    C1464900oDw c1464900oDw = C1464900oDw.LIZ;
                    Context context = this.mView.getContext();
                    C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLJILJIL.creativeModel.musicBuzModel);
                    c1464900oDw.getClass();
                    String strLIZIZ = C1464900oDw.LIZIZ(context, currentUser, musicInfo, aVMusicExtractAVMusic);
                    LinearLayout linearLayout2 = this.LLJJI;
                    if (linearLayout2 == null) {
                        linearLayout2 = null;
                    }
                    C337180DJs.LIZJ(linearLayout2);
                    TuxTextView tuxTextView2 = this.LLJJIII;
                    if (tuxTextView2 == null) {
                        tuxTextView2 = null;
                    }
                    tuxTextView2.setText(strLIZIZ);
                }
                TextView textView2 = (TextView) this.mView.findViewById(R.id.rlh);
                if (textView2 != null) {
                    textView = textView2;
                }
                textView.setText(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
            }

            {
                this.LLJI = str;
                this.LLJIJIL = urlModel;
                this.LLJILJIL = videoPublishEditModel;
            }

            @Override // com.bytedance.scene.Scene
            public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                return C786410Ut5.Td(layoutInflater, R.layout.e_o, viewGroup, false);
            }
        };
    }
}
