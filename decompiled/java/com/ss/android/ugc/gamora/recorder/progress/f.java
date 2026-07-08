package com.ss.android.ugc.gamora.recorder.progress;

import X.C01GW;
import X.C0C64;
import X.C0LAB;
import X.C0LEO;
import X.C0MWZ;
import X.C12ES;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C13LE;
import X.C1462920oAk;
import X.C1631190sY9;
import X.C1648440szy;
import X.C1648610t0F;
import X.C1648640t0I;
import X.C1648650t0J;
import X.C1648660t0K;
import X.C1664740tQG;
import X.C1699250uJv;
import X.C1DRG;
import X.C20684815ws;
import X.C21408218qG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C267540Ae8;
import X.C366700EZg;
import X.C385670FAf;
import X.C418440Gaw;
import X.C443120HZe;
import X.C452501pT;
import X.C538770LBb;
import X.C539900LFk;
import X.C560530Lyd;
import X.C569780MWi;
import X.C578130Mlv;
import X.C579640MoM;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C862010Xrj;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625470sOv;
import X.InterfaceC1647420syK;
import X.InterfaceC1648550t09;
import X.InterfaceC1648570t0B;
import X.InterfaceC1648590t0D;
import X.InterfaceC1648600t0E;
import X.InterfaceC1650230t2r;
import X.InterfaceC1655330tB5;
import X.InterfaceC1655340tB6;
import X.InterfaceC21645719nT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC362610EJn;
import X.InterfaceC524950KiL;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnTouchListenerC1648690t0N;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nows.experiment.AIGCPhotoGenerationOptimization;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.gamora.recorder.experiment.RecordButtonOnEffectPanelCoverTipsFixConfig;
import com.ss.android.ugc.gamora.recorder.progress.f;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.zhiliaoapp.musically.R;
import dtj.u7;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import nv7.c0;

/* JADX INFO: loaded from: classes26.dex */
public final class f extends Scene {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLLLL;
    public final InterfaceC1650230t2r LLJI;
    public final InterfaceC1648570t0B LLJIJIL;
    public final InterfaceC1647420syK LLJILJIL;
    public final ShortVideoContext LLJILJILJ;
    public final C385670FAf<Long> LLJILLL;
    public final C385670FAf<Long> LLJJ;
    public final C385670FAf<Boolean> LLJJI;
    public final C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> LLJJIII;
    public final C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJJIJI;
    public final C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJJIJIIJIL;
    public final C385670FAf<Integer> LLJJIJIL;
    public final C385670FAf<RetakeVideoContext> LLJJJ;
    public final C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> LLJJJIL;
    public final C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJJJJ;
    public final C385670FAf<Boolean> LLJJJJJIL;
    public final C385670FAf<Boolean> LLJJJJLIIL;
    public final C385670FAf<Boolean> LLJJL;
    public final C385670FAf<ScaleGestureDetector> LLJJLIIIJLLLLLLLZ;
    public final C385670FAf<InterfaceC21645719nT> LLJL;
    public final C385670FAf<Long> LLJLIL;
    public final h0<Boolean> LLJLILLLLZIIL;
    public final C538770LBb<Integer> LLJLL;
    public final a LLJLLIL;
    public final C560530Lyd<Unit> LLJLLL;
    public final q LLJZ;
    public final InterfaceC1648590t0D LLJZIJLIL;
    public final C1DRG LLL;
    public boolean LLLF = true;
    public C21408218qG LLLFF;
    public TextView LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public InterfaceC1648550t09 LLLII;
    public C1648440szy LLLIIII;
    public TuxTextView LLLIIIIL;
    public ViewGroup LLLIIIL;
    public ViewOnTouchListenerC1648690t0N LLLIIL;
    public View LLLIILIL;
    public View LLLIL;
    public ImageView LLLILZ;
    public final int LLLILZJ;
    public final int LLLILZLLLI;
    public final int LLLIZZ;
    public final int LLLJ;
    public Object LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public String LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public int LLLLIILL;
    public int LLLLIILLL;
    public int LLLLIL;
    public final int LLLLILI;
    public final int LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public final AFwS214S0000000_25 LLLLLIL;
    public final AFwS214S0000000_25 LLLLLILLIL;
    public final l0 LLLLLJIL;
    public final C1664740tQG LLLLLJLJLL;
    public final C1648650t0J LLLLLL;
    public final C1648660t0K LLLLLLIL;
    public final C1648640t0I LLLLLLJ;
    public int LLLLLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(f.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        C13LE.LIZ.getClass();
        LLLLLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final boolean LLLIIIIL() {
        LiveEvent<Boolean> liveEventDN1;
        Boolean boolLJI;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        String musicId = this.LLJILJILJ.getMusicId();
        boolean z = musicId == null || musicId.length() == 0;
        q qVar = this.LLJZ;
        boolean z2 = qVar == null || (interfaceC1624480sNKC0 = qVar.C0()) == null || (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) == null || (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) == null || mutableLiveDataLJIJJLI.getValue() == 0;
        q qVar2 = this.LLJZ;
        return z && z2 && !((qVar2 == null || (liveEventDN1 = qVar2.dN1()) == null || (boolLJI = liveEventDN1.LJI()) == null) ? false : boolLJI.booleanValue()) && !this.LLLLIIL;
    }

    public final void LLLIILIL() {
        ShortVideoContext shortVideoContext = this.LLJILJILJ;
        if (shortVideoContext.cameraComponentModel.isRetakeMode) {
            int size = shortVideoContext.LJI().size();
            C579640MoM.LIZ.getClass();
            C0LAB c0labLIZ = C579640MoM.LIZ();
            c0labLIZ.LIZ(size, "videoSegment");
            C20684815ws.LJIILLIIL("back_to_video_trim", c0labLIZ.LIZ);
        }
        this.LLJLLL.LJIIJ(Unit.LIZ);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).performanceMonitorService().getJatoBoostAbilityForEditPage();
        this.LLJIJIL.Ak().LIZIZ();
        this.LLJIJIL.Db2("click go next");
        if (u7.LJ()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ(Scene.SCENE_SERVICE, "go_edit");
            c0lab.LJ("shoot_way", this.LLJILJILJ.shootWay);
            c0lab.LJ("creation_id", this.LLJILJILJ.getCreationId());
            c0lab.LJ("enter_from", this.LLJILJILJ.enterFrom);
            C1699250uJv.LLILLL.getClass();
            c0lab.LIZIZ(0L, "dalvikPss");
            c0lab.LIZIZ(0L, "nativePss");
            c0lab.LIZIZ(0L, "otherPss");
            c0lab.LIZIZ(0L, "totalPss");
            C20684815ws.LJIILLIIL("av_memory_log", c0lab.LIZ);
        }
        ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJ(this.LLJILJILJ);
    }

    public final int LLLIL() {
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        a aVar = this.LLJLLIL;
        int i = 0;
        if ((aVar != null ? aVar.t92() : null) != null) {
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LLLIIL;
            if (viewOnTouchListenerC1648690t0N == null) {
                viewOnTouchListenerC1648690t0N = null;
            }
            ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC1648690t0N.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams2.bottomMargin;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        } else {
            if (!C1462920oAk.LIZLLL()) {
                C385670FAf<Boolean> c385670FAf = this.LLJJL;
                if (c385670FAf != null) {
                    Intrinsics.LJFF(c385670FAf.LIZJ(), Boolean.TRUE);
                }
                return C0LEO.LIZ() + C366700EZg.LIZ(10.0d) + this.LLLILZJ;
            }
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = this.LLLIIL;
            if (viewOnTouchListenerC1648690t0N2 == null) {
                viewOnTouchListenerC1648690t0N2 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = viewOnTouchListenerC1648690t0N2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i = marginLayoutParams.bottomMargin;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        return i + iLIZIZ;
    }

    public final boolean LLLJ() {
        return (!this.LLJILJILJ.LJJJJZ() || this.LLJILJILJ.LJJIJIIJI() || this.LLJILJILJ.LJJIL()) ? false : true;
    }

    public final void LLLII() {
        int iLLLIL = LLLIL();
        int i = this.LLLLILI + iLLLIL;
        C21408218qG c21408218qG = this.LLLFF;
        if (c21408218qG == null) {
            c21408218qG = null;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c21408218qG.getLayoutParams();
        if (i != layoutParams.bottomMargin || layoutParams.leftMargin != 0) {
            layoutParams.bottomMargin = i;
            layoutParams.leftMargin = 0;
            C21408218qG c21408218qG2 = this.LLLFF;
            if (c21408218qG2 == null) {
                c21408218qG2 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21408218qG2);
            c21408218qG2.setLayoutParams(layoutParams);
        }
        TextView textView = this.LLLFFI;
        if (textView == null) {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        int i2 = i + this.LLLILZLLLI + this.LLLJ;
        if (i2 != layoutParams2.bottomMargin) {
            layoutParams2.bottomMargin = i2;
            TextView textView2 = this.LLLFFI;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.g6(textView2, layoutParams2);
        }
        ImageView imageView = this.LLLILZ;
        if (imageView == null) {
            imageView = null;
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        int i3 = iLLLIL + ((this.LLLILZLLLI - this.LLLIZZ) / 2);
        if (i3 != layoutParams3.bottomMargin) {
            layoutParams3.bottomMargin = i3;
            ImageView imageView2 = this.LLLILZ;
            C786410Ut5.c6(imageView2 != null ? imageView2 : null, layoutParams3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZ() {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.progress.f.LLLILZ():void");
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(this.LLLLLL);
        }
        InterfaceC1648600t0E interfaceC1648600t0ELIZ = C569780MWi.LIZ(this);
        if (interfaceC1648600t0ELIZ != null) {
            interfaceC1648600t0ELIZ.LJJIJIL(this.LLLLLLIL);
            interfaceC1648600t0ELIZ.LLD(this.LLLLLLJ);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LLLIIL;
        if (viewOnTouchListenerC1648690t0N == null) {
            viewOnTouchListenerC1648690t0N = null;
        }
        viewOnTouchListenerC1648690t0N.LJIIJJI();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.kF(this.LLLLLL);
        }
        InterfaceC1648600t0E interfaceC1648600t0ELIZ = C569780MWi.LIZ(this);
        if (interfaceC1648600t0ELIZ != null) {
            interfaceC1648600t0ELIZ.LLFII(this.LLLLLLIL);
            interfaceC1648600t0ELIZ.LJJLIIIJILLIZJL(this.LLLLLLJ);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        Object obj = this.LLLJIL;
        if (obj == null || Intrinsics.LJFF(obj, Unit.LIZ)) {
            return;
        }
        Object obj2 = this.LLLJIL;
        if (!(obj2 instanceof Dialog)) {
            C1397510mTF c1397510mTF = (C1397510mTF) obj2;
            if (c1397510mTF.LJIIIZ()) {
                c1397510mTF.LIZIZ(null);
                return;
            }
            return;
        }
        Dialog dialog = (Dialog) obj2;
        if (dialog.isShowing()) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
    }

    public final void LLLILZLLLI(boolean z) {
        int i;
        ImageView imageView = this.LLLILZ;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZI(i, imageView);
        ShortVideoContext shortVideoContext = this.LLJILJILJ;
        if (shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM || (shortVideoContext.LJJJJZ() && !this.LLJILJILJ.LJJIJIIJI())) {
            ImageView imageView3 = this.LLLILZ;
            if (imageView3 != null) {
                imageView2 = imageView3;
            }
            C786410Ut5.LJZI(8, imageView2);
        }
    }

    public final void LLLIZZ(boolean z) {
        TuxTextView tuxTextView;
        int iIntValue;
        Integer numLIZJ;
        if (AIGCPhotoGenerationOptimization.INSTANCE.isEnabled() && (tuxTextView = this.LLLIIIIL) != null) {
            if (z) {
                Context contextRequireSceneContext = requireSceneContext();
                if (contextRequireSceneContext != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.za, contextRequireSceneContext)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -16777216;
                }
                tuxTextView.setShadowLayer(1.0f, 0.0f, 1.0f, iIntValue);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    public final void LLLLII(boolean z) {
        boolean z2;
        float fLIZJ;
        boolean z3;
        int iLIZIZ;
        ViewGroup viewGroup;
        float f = 52.0f;
        int i = 0;
        ImageView imageView = null;
        TextView textView = null;
        TextView textView2 = null;
        ImageView imageView2 = null;
        if (((Boolean) C267540Ae8.LIZ.getValue()).booleanValue()) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_record_button_on_effect_panel", true) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                Context contextRequireSceneContext = requireSceneContext();
                if (!z3) {
                    f = 58.0f;
                }
                float fLIZJ2 = C12ES.LIZJ(f, contextRequireSceneContext) / this.LLLILZLLLI;
                boolean zLJIIIIZZ = c0.LIZ.LJIIIIZZ();
                C01GW c01gw = C1648610t0F.LIZIZ;
                if (((RecordButtonOnEffectPanelCoverTipsFixConfig) c01gw.getValue()).enableFix) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((RecordButtonOnEffectPanelCoverTipsFixConfig) c01gw.getValue()).bottomMargin)));
                } else if (zLJIIIIZZ) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                }
                ViewGroup viewGroup2 = this.LLLIIIL;
                if (viewGroup2 == null) {
                    viewGroup = null;
                    viewGroup2 = null;
                } else {
                    viewGroup = viewGroup2;
                }
                viewGroup.setPivotY(viewGroup2.getHeight());
                ViewGroup viewGroup3 = this.LLLIIIL;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                C786410Ut5.Lb(fLIZJ2, viewGroup3);
                ViewGroup viewGroup4 = this.LLLIIIL;
                if (viewGroup4 == null) {
                    viewGroup4 = null;
                }
                C786410Ut5.mc(fLIZJ2, viewGroup4);
                ViewGroup viewGroup5 = this.LLLIIIL;
                if (viewGroup5 == null) {
                    viewGroup5 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup5.getLayoutParams();
                this.LLLLIL = marginLayoutParams.bottomMargin;
                marginLayoutParams.bottomMargin = iLIZIZ;
                ViewGroup viewGroup6 = this.LLLIIIL;
                if (viewGroup6 == null) {
                    viewGroup6 = null;
                }
                C786410Ut5.X5(marginLayoutParams, viewGroup6);
                TextView textView3 = this.LLLFFI;
                if (textView3 != null) {
                    textView = textView3;
                }
                C786410Ut5.LLIL(textView, 8);
                this.LLLJL = true;
                return;
            }
            ViewGroup viewGroup7 = this.LLLIIIL;
            if (viewGroup7 == null) {
                viewGroup7 = null;
            }
            C786410Ut5.Lb(1.0f, viewGroup7);
            ViewGroup viewGroup8 = this.LLLIIIL;
            if (viewGroup8 == null) {
                viewGroup8 = null;
            }
            C786410Ut5.mc(1.0f, viewGroup8);
            ViewGroup viewGroup9 = this.LLLIIIL;
            if (viewGroup9 == null) {
                viewGroup9 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup9.getLayoutParams();
            marginLayoutParams2.bottomMargin = this.LLLLIL;
            ViewGroup viewGroup10 = this.LLLIIIL;
            if (viewGroup10 == null) {
                viewGroup10 = null;
            }
            C786410Ut5.X5(marginLayoutParams2, viewGroup10);
            if (this.LLLF || LLLJ()) {
                TextView textView4 = this.LLLFFI;
                if (textView4 != null) {
                    textView2 = textView4;
                }
                C786410Ut5.LLIL(textView2, 0);
            }
            this.LLLJL = false;
            return;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_record_button_on_effect_panel", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            Context contextRequireSceneContext2 = requireSceneContext();
            if (z2) {
                fLIZJ = C12ES.LIZJ(52.0f, contextRequireSceneContext2);
            } else {
                fLIZJ = C12ES.LIZJ(58.0f, contextRequireSceneContext2);
            }
            float f2 = fLIZJ / this.LLLILZLLLI;
            if (!c0.LIZ.LJIIIIZZ()) {
                i = 26;
            }
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LLLIIL;
            if (viewOnTouchListenerC1648690t0N == null) {
                viewOnTouchListenerC1648690t0N = null;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewOnTouchListenerC1648690t0N.getLayoutParams();
            this.LLLLIILL = layoutParams.bottomMargin;
            layoutParams.bottomMargin = C366700EZg.LIZ(10.0d) + i;
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = this.LLLIIL;
            if (viewOnTouchListenerC1648690t0N2 == null) {
                viewOnTouchListenerC1648690t0N2 = null;
            }
            C786410Ut5.n7(viewOnTouchListenerC1648690t0N2, layoutParams);
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N3 = this.LLLIIL;
            if (viewOnTouchListenerC1648690t0N3 == null) {
                viewOnTouchListenerC1648690t0N3 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnTouchListenerC1648690t0N3);
            viewOnTouchListenerC1648690t0N3.setScaleX(f2);
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N4 = this.LLLIIL;
            if (viewOnTouchListenerC1648690t0N4 == null) {
                viewOnTouchListenerC1648690t0N4 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnTouchListenerC1648690t0N4);
            viewOnTouchListenerC1648690t0N4.setScaleY(f2);
            C21408218qG c21408218qG = this.LLLFF;
            if (c21408218qG == null) {
                c21408218qG = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c21408218qG.getLayoutParams();
            this.LLLLIILLL = marginLayoutParams3.bottomMargin;
            marginLayoutParams3.bottomMargin = C366700EZg.LIZ(12.0d) + 26 + this.LLLLILI;
            C21408218qG c21408218qG2 = this.LLLFF;
            if (c21408218qG2 == null) {
                c21408218qG2 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21408218qG2);
            c21408218qG2.setLayoutParams(marginLayoutParams3);
            C21408218qG c21408218qG3 = this.LLLFF;
            if (c21408218qG3 == null) {
                c21408218qG3 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21408218qG3);
            c21408218qG3.setScaleX(f2);
            C21408218qG c21408218qG4 = this.LLLFF;
            if (c21408218qG4 == null) {
                c21408218qG4 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21408218qG4);
            c21408218qG4.setScaleY(f2);
            TextView textView5 = this.LLLFFI;
            if (textView5 == null) {
                textView5 = null;
            }
            C786410Ut5.LLIL(textView5, 8);
            ImageView imageView3 = this.LLLILZ;
            if (imageView3 == null) {
                imageView3 = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView3.getLayoutParams();
            layoutParams2.bottomMargin = i + ((this.LLLILZLLLI - this.LLLIZZ) / 2) + C366700EZg.LIZ(18.0d) + this.LLLLILI;
            ImageView imageView4 = this.LLLILZ;
            if (imageView4 == null) {
                imageView4 = null;
            }
            C786410Ut5.c6(imageView4, layoutParams2);
            ImageView imageView5 = this.LLLILZ;
            if (imageView5 == null) {
                imageView5 = null;
            }
            C786410Ut5.Qb(imageView5, f2);
            ImageView imageView6 = this.LLLILZ;
            if (imageView6 != null) {
                imageView2 = imageView6;
            }
            C786410Ut5.rc(imageView2, f2);
            this.LLLJL = true;
            return;
        }
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N5 = this.LLLIIL;
        if (viewOnTouchListenerC1648690t0N5 == null) {
            viewOnTouchListenerC1648690t0N5 = null;
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewOnTouchListenerC1648690t0N5.getLayoutParams();
        layoutParams3.bottomMargin = this.LLLLIILL;
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N6 = this.LLLIIL;
        if (viewOnTouchListenerC1648690t0N6 == null) {
            viewOnTouchListenerC1648690t0N6 = null;
        }
        C786410Ut5.n7(viewOnTouchListenerC1648690t0N6, layoutParams3);
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N7 = this.LLLIIL;
        if (viewOnTouchListenerC1648690t0N7 == null) {
            viewOnTouchListenerC1648690t0N7 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnTouchListenerC1648690t0N7);
        viewOnTouchListenerC1648690t0N7.setScaleX(1.0f);
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N8 = this.LLLIIL;
        if (viewOnTouchListenerC1648690t0N8 == null) {
            viewOnTouchListenerC1648690t0N8 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnTouchListenerC1648690t0N8);
        viewOnTouchListenerC1648690t0N8.setScaleY(1.0f);
        C21408218qG c21408218qG5 = this.LLLFF;
        if (c21408218qG5 == null) {
            c21408218qG5 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) c21408218qG5.getLayoutParams();
        marginLayoutParams4.bottomMargin = this.LLLLIILLL;
        C21408218qG c21408218qG6 = this.LLLFF;
        if (c21408218qG6 == null) {
            c21408218qG6 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21408218qG6);
        c21408218qG6.setLayoutParams(marginLayoutParams4);
        C21408218qG c21408218qG7 = this.LLLFF;
        if (c21408218qG7 == null) {
            c21408218qG7 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21408218qG7);
        c21408218qG7.setScaleX(1.0f);
        C21408218qG c21408218qG8 = this.LLLFF;
        if (c21408218qG8 == null) {
            c21408218qG8 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21408218qG8);
        c21408218qG8.setScaleY(1.0f);
        if (this.LLLF || LLLJ()) {
            TextView textView6 = this.LLLFFI;
            if (textView6 == null) {
                textView6 = null;
            }
            C786410Ut5.LLIL(textView6, 0);
        }
        ImageView imageView7 = this.LLLILZ;
        if (imageView7 == null) {
            imageView7 = null;
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) imageView7.getLayoutParams();
        layoutParams4.bottomMargin = LLLIL() + ((this.LLLILZLLLI - this.LLLIZZ) / 2);
        ImageView imageView8 = this.LLLILZ;
        if (imageView8 == null) {
            imageView8 = null;
        }
        C786410Ut5.c6(imageView8, layoutParams4);
        ImageView imageView9 = this.LLLILZ;
        if (imageView9 == null) {
            imageView9 = null;
        }
        C786410Ut5.Qb(imageView9, 1.0f);
        ImageView imageView10 = this.LLLILZ;
        if (imageView10 != null) {
            imageView = imageView10;
        }
        C786410Ut5.rc(imageView, 1.0f);
        this.LLLJL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x03e0  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.progress.f.onActivityCreated(android.os.Bundle):void");
    }

    public static void LLLJL(f fVar, long j) {
        String strLIZIZ;
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = null;
        if (j <= 0) {
            fVar.LLLF = false;
            if (fVar.LLLJ()) {
                TextView textView = fVar.LLLFFI;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(fVar.LLLLII);
                if (!fVar.LLLJL) {
                    TextView textView2 = fVar.LLLFFI;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    C786410Ut5.LLIL(textView2, 0);
                }
            } else {
                TextView textView3 = fVar.LLLFFI;
                if (textView3 == null) {
                    textView3 = null;
                }
                C786410Ut5.LLIL(textView3, 8);
            }
            Boolean boolLIZJ = fVar.LLJLILLLLZIIL.LIZJ();
            Boolean bool = Boolean.FALSE;
            if (!Intrinsics.LJFF(boolLIZJ, bool)) {
                fVar.LLJLILLLLZIIL.LJII(bool);
            }
            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = fVar.LLLIIL;
            if (viewOnTouchListenerC1648690t0N2 != null) {
                viewOnTouchListenerC1648690t0N = viewOnTouchListenerC1648690t0N2;
            }
            viewOnTouchListenerC1648690t0N.setShouldDrawBorder(true);
            return;
        }
        fVar.getClass();
        int i = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (i == fVar.LLLLLLL) {
            return;
        }
        fVar.LLLLLLL = i;
        int i2 = i % 60;
        int i3 = (i - i2) / 60;
        if (fVar.LLLL) {
            TextView textView4 = fVar.LLLFFI;
            if (textView4 == null) {
                textView4 = null;
            }
            C786410Ut5.LLIL(textView4, 0);
            Boolean boolLIZJ2 = fVar.LLJLILLLLZIIL.LIZJ();
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(boolLIZJ2, bool2)) {
                fVar.LLJLILLLLZIIL.LJII(bool2);
            }
        }
        if (C539900LFk.LIZ(fVar.LLJILJILJ)) {
            float f = 10;
            strLIZIZ = C786410Ut5.j4("%.1fs/%.1fs", Arrays.copyOf(new Object[]{Float.valueOf(((int) ((j / 1000.0f) * f)) / 10.0f), Float.valueOf(((int) ((fVar.LLJILJILJ.cameraComponentModel.mMaxDuration / 1000.0f) * f)) / 10.0f)}, 2));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
            sbLIZ.append(':');
            sbLIZ.append(C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        TextView textView5 = fVar.LLLFFI;
        if (textView5 == null) {
            textView5 = null;
        }
        strLIZIZ.toString();
        textView5.setText(strLIZIZ);
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N3 = fVar.LLLIIL;
        if (viewOnTouchListenerC1648690t0N3 != null) {
            viewOnTouchListenerC1648690t0N = viewOnTouchListenerC1648690t0N3;
        }
        viewOnTouchListenerC1648690t0N.setShouldDrawBorder(false);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        View viewLoadLayoutFiles = ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles("lighteningControl", getSceneContext(), layoutInflater, R.layout.eqp, viewGroup, false);
        if ((viewLoadLayoutFiles instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewLoadLayoutFiles) != null) {
            viewGroup2.setClipChildren(true);
        }
        View viewFindViewById = viewLoadLayoutFiles.findViewById(R.id.ext);
        int i = ViewOnTouchListenerC1648690t0N.LLLLLZIL;
        viewFindViewById.setMinimumWidth(ViewOnTouchListenerC1648690t0N.LLLLLZIL * 2);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 81;
        }
        viewLoadLayoutFiles.requestLayout();
        return viewLoadLayoutFiles;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [X.0t0J] */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.0t0K] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.0t0I] */
    public f(InterfaceC1650230t2r interfaceC1650230t2r, InterfaceC1648570t0B interfaceC1648570t0B, InterfaceC1647420syK interfaceC1647420syK, ShortVideoContext shortVideoContext, C385670FAf<Long> c385670FAf, C385670FAf<Long> c385670FAf2, C385670FAf<Boolean> c385670FAf3, C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> c385670FAf4, C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf5, C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf6, C385670FAf<Integer> c385670FAf7, C385670FAf<RetakeVideoContext> c385670FAf8, C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> c385670FAf9, C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf10, C385670FAf<Boolean> c385670FAf11, C385670FAf<Boolean> c385670FAf12, C385670FAf<Boolean> c385670FAf13, C385670FAf<ScaleGestureDetector> c385670FAf14, C385670FAf<InterfaceC21645719nT> c385670FAf15, C385670FAf<Long> c385670FAf16, h0<Boolean> h0Var, C538770LBb<Integer> c538770LBb, a aVar, C560530Lyd<Unit> c560530Lyd, q qVar, InterfaceC1648590t0D interfaceC1648590t0D, C1DRG c1drg) {
        int iLIZ;
        double d;
        Boolean boolT92;
        int iLIZIZ;
        Boolean boolT922;
        int iLIZIZ2;
        this.LLJI = interfaceC1650230t2r;
        this.LLJIJIL = interfaceC1648570t0B;
        this.LLJILJIL = interfaceC1647420syK;
        this.LLJILJILJ = shortVideoContext;
        this.LLJILLL = c385670FAf;
        this.LLJJ = c385670FAf2;
        this.LLJJI = c385670FAf3;
        this.LLJJIII = c385670FAf4;
        this.LLJJIJI = c385670FAf5;
        this.LLJJIJIIJIL = c385670FAf6;
        this.LLJJIJIL = c385670FAf7;
        this.LLJJJ = c385670FAf8;
        this.LLJJJIL = c385670FAf9;
        this.LLJJJJ = c385670FAf10;
        this.LLJJJJJIL = c385670FAf11;
        this.LLJJJJLIIL = c385670FAf12;
        this.LLJJL = c385670FAf13;
        this.LLJJLIIIJLLLLLLLZ = c385670FAf14;
        this.LLJL = c385670FAf15;
        this.LLJLIL = c385670FAf16;
        this.LLJLILLLLZIIL = h0Var;
        this.LLJLL = c538770LBb;
        this.LLJLLIL = aVar;
        this.LLJLLL = c560530Lyd;
        this.LLJZ = qVar;
        this.LLJZIJLIL = interfaceC1648590t0D;
        this.LLL = c1drg;
        if (aVar != null && aVar.t92() != null) {
            if (Intrinsics.LJFF(aVar.t92(), Boolean.TRUE)) {
                iLIZ = C578130Mlv.LIZIZ();
            } else {
                iLIZ = C578130Mlv.LIZ();
            }
        } else if (C1462920oAk.LIZLLL()) {
            iLIZ = C578130Mlv.LIZIZ();
        } else {
            iLIZ = C578130Mlv.LIZ();
        }
        this.LLLILZJ = iLIZ;
        this.LLLILZLLLI = C366700EZg.LIZ(80.0d);
        this.LLLIZZ = C366700EZg.LIZ(36.0d);
        if (((Boolean) C862010Xrj.LIZ.getValue()).booleanValue()) {
            d = 39.0d;
        } else {
            d = 28.0d;
        }
        this.LLLJ = C366700EZg.LIZ(d);
        this.LLLL = true;
        this.LLLLII = "";
        if (aVar != null) {
            boolT92 = aVar.t92();
        } else {
            boolT92 = null;
        }
        if (boolT92 != null) {
            if (Intrinsics.LJFF(aVar.t92(), Boolean.TRUE)) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            }
        } else if (C1462920oAk.LIZLLL()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        this.LLLLILI = iLIZIZ;
        if (aVar != null) {
            boolT922 = aVar.t92();
        } else {
            boolT922 = null;
        }
        if (boolT922 != null) {
            if (Intrinsics.LJFF(aVar.t92(), Boolean.TRUE)) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
            }
        } else if (C1462920oAk.LIZLLL()) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        }
        this.LLLLJ = iLIZIZ2;
        this.LLLLJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(296));
        this.LLLLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(293));
        this.LLLLLIL = AFwS214S0000000_25.get$arr$(294);
        this.LLLLLILLIL = AFwS214S0000000_25.get$arr$(295);
        this.LLLLLJIL = (l0) c1drg.LJIIL(null, l0.class);
        this.LLLLLJLJLL = new C1664740tQG(c1drg.LJIILIIL("lazyControlProgressConfig", C1631190sY9.class), C1631190sY9.class);
        this.LLLLLL = new InterfaceC362610EJn() { // from class: X.0t0J
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i != 24 && i != 25) {
                    return false;
                }
                C1457570o27.LIZ(i, this.LL.LLJILJILJ.creativeInfo.getCreationId(), "video_shoot_page", "video_shoot_page");
                if (!C565740MGu.LIZ() || !this.LL.LLLIIIIL()) {
                    return false;
                }
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LL.LLLIIL;
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = null;
                if (viewOnTouchListenerC1648690t0N == null) {
                    viewOnTouchListenerC1648690t0N = null;
                }
                if (viewOnTouchListenerC1648690t0N.LLLLLJLJLL) {
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                f fVar = this.LL;
                if (fVar.LLLLIIIILLL) {
                    return true;
                }
                fVar.LLLLIIIILLL = true;
                keyEvent.startTracking();
                f fVar2 = this.LL;
                fVar2.LLJILJILJ.shootMethod = "volume_key";
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N3 = fVar2.LLLIIL;
                if (viewOnTouchListenerC1648690t0N3 != null) {
                    viewOnTouchListenerC1648690t0N2 = viewOnTouchListenerC1648690t0N3;
                }
                boolean zLJII = viewOnTouchListenerC1648690t0N2.LJII(0, keyEvent);
                if (!zLJII) {
                    this.LL.LLJILJILJ.shootMethod = "record_button";
                }
                return zLJII;
            }
        };
        this.LLLLLLIL = new InterfaceC1655330tB5() { // from class: X.0t0K
            @Override // X.InterfaceC1655330tB5
            public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
                if ((i != 24 && i != 25) || !C565740MGu.LIZ() || !this.LIZ.LLLIIIIL()) {
                    return false;
                }
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LIZ.LLLIIL;
                if (viewOnTouchListenerC1648690t0N == null) {
                    viewOnTouchListenerC1648690t0N = null;
                }
                return viewOnTouchListenerC1648690t0N.LJII(2, keyEvent);
            }
        };
        this.LLLLLLJ = new InterfaceC1655340tB6() { // from class: X.0t0I
            @Override // X.InterfaceC1655340tB6
            public final boolean onKeyUp(int i, KeyEvent keyEvent) {
                if (i != 24 && i != 25) {
                    return false;
                }
                this.LIZ.LLLLIIIILLL = false;
                if (!C565740MGu.LIZ() || !this.LIZ.LLLIIIIL()) {
                    return false;
                }
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LIZ.LLLIIL;
                if (viewOnTouchListenerC1648690t0N == null) {
                    viewOnTouchListenerC1648690t0N = null;
                }
                return viewOnTouchListenerC1648690t0N.LJII(1, keyEvent);
            }
        };
        this.LLLLLLL = -1;
    }
}
