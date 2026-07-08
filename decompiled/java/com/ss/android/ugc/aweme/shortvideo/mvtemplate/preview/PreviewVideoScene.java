package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0CNO;
import X.C11S5;
import X.C12ES;
import X.C1322110kVd;
import X.C15O7;
import X.C1637890six;
import X.C1688850u39;
import X.C1DOT;
import X.C1DOU;
import X.C201955140j;
import X.C20736016Cg;
import X.C21570819bO;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C527210Klz;
import X.C527870Kn3;
import X.C527880Kn4;
import X.C531250KsV;
import X.C533790Kwb;
import X.C534210KxH;
import X.C534280KxO;
import X.C537680L6w;
import X.C568500MRk;
import X.C786410Ut5;
import X.EnumC1464490oDH;
import X.EnumC568460MRg;
import X.InterfaceC1464190oCn;
import X.InterfaceC525540KjI;
import X.InterfaceC568490MRj;
import X.InterfaceC568550MRp;
import X.InterpolatorC1088790eRJ;
import X.ViewOnLayoutChangeListenerC580900MqO;
import Y.ACListenerS143S0100000_8;
import Y.ACallableS415S0100000_8;
import Y.ARunnableS77S0200000_8;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.vesdk.VEEditor;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class PreviewVideoScene extends UserVisibleHintGroupScene implements InterfaceC525540KjI {
    public final String LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public String LLJJJIL;
    public EnumC568460MRg LLJJJJ;
    public TikTokMediaModel LLJJJJJIL;
    public InterfaceC568490MRj LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public TTVideoEngine LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public Surface LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public CreativeInfo LLJZIJLIL;
    public AnonymousClass0956 LLL;
    public long LLLF;
    public final C01GW LLLFF;
    public volatile ValueAnimator LLLFFI;
    public final C01GW LLLFZ;
    public CountDownLatch LLLI;
    public boolean LLLII;
    public View LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public boolean LLLIILIL;
    public Pair<Integer, Integer> LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public boolean LLLILZLLLI;
    public Function1<? super TikTokMediaModel, Unit> LLLIZZ;
    public Function1<? super TikTokMediaModel, Unit> LLLJ;
    public ViewStub LLLJIL;
    public View LLLJL;
    public TuxIconView LLLL;
    public int LLLLII;
    public boolean LLLLIIIILLL;

    @Override // X.InterfaceC525540KjI
    public final UserVisibleHintGroupScene LJI() {
        return this;
    }

    @Override // X.InterfaceC525540KjI
    public final void LLJ() {
        this.LLLILZLLLI = true;
        LLLLLJLJLL();
        TTVideoEngine tTVideoEngine = this.LLJL;
        if (tTVideoEngine == null) {
            return;
        }
        if (tTVideoEngine.LJJLIIIJILLIZJL() == 1) {
            TTVideoEngine tTVideoEngine2 = this.LLJL;
            (tTVideoEngine2 != null ? tTVideoEngine2 : null).pause();
        }
    }

    public final void LLLLLILLIL() {
        InterfaceC568490MRj interfaceC568490MRj;
        Pair<Integer, Integer> pair;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfigLLZZLLIL;
        long j;
        int i;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfigLLZZLLIL2;
        String strLJFF;
        LivePhotoInfo livePhotoInfo;
        this.LLLLIIIILLL = true;
        TikTokMediaModel tikTokMediaModel = this.LLJJJJJIL;
        if (tikTokMediaModel != null) {
            if (C527210Klz.LIZ(tikTokMediaModel)) {
                CountDownLatch countDownLatch = this.LLLI;
                if (countDownLatch != null) {
                    LLLLLLLLLL(countDownLatch);
                }
                LivePhotoInfo livePhotoInfo2 = tikTokMediaModel.livePhotoInfo;
                pair = new Pair<>(0, Integer.valueOf(livePhotoInfo2 != null ? (int) livePhotoInfo2.getVideoDuration() : LivePreCreateNextRoomPlayer.ENABLE));
            } else {
                InterfaceC568490MRj interfaceC568490MRj2 = this.LLJJJJLIIL;
                if ((interfaceC568490MRj2 == null || (choosePhotoPreviewPageConfigLLZZLLIL2 = interfaceC568490MRj2.LLZZLLIL()) == null || !choosePhotoPreviewPageConfigLLZZLLIL2.isUgcTemplate) && ((interfaceC568490MRj = this.LLJJJJLIIL) == null || (choosePhotoPreviewPageConfigLLZZLLIL = interfaceC568490MRj.LLZZLLIL()) == null || !choosePhotoPreviewPageConfigLLZZLLIL.isEditorProReplace)) {
                    Integer numValueOf = Integer.valueOf(tikTokMediaModel.startTime);
                    int i2 = tikTokMediaModel.endTime;
                    if (i2 <= 0) {
                        i2 = (int) tikTokMediaModel.duration;
                    }
                    pair = new Pair<>(numValueOf, Integer.valueOf(i2));
                } else {
                    if (tikTokMediaModel.selectIndex >= 0) {
                        j = tikTokMediaModel.clipDuration;
                        if (j <= 0) {
                            i = tikTokMediaModel.endTime;
                        }
                        pair = new Pair<>(Integer.valueOf(tikTokMediaModel.startTime), Integer.valueOf(i));
                    } else {
                        j = tikTokMediaModel.duration;
                    }
                    i = (int) j;
                    pair = new Pair<>(Integer.valueOf(tikTokMediaModel.startTime), Integer.valueOf(i));
                }
            }
            this.LLLIL = pair;
            if (!C527210Klz.LIZ(tikTokMediaModel) || (livePhotoInfo = tikTokMediaModel.livePhotoInfo) == null || (strLJFF = livePhotoInfo.getVideoPath()) == null) {
                strLJFF = tikTokMediaModel.LJFF();
            }
            C1DOT c1dotLLLLL = LLLLL();
            if (c1dotLLLLL != null) {
                C1DOU c1dou = new C1DOU(new String[]{strLJFF});
                c1dou.LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
                c1dou.LJIIIIZZ = new float[]{1.0f};
                c1dotLLLLL.hg(c1dou);
                Pair<Integer, Integer> pair2 = this.LLLIL;
                int iIntValue = pair2 != null ? pair2.getFirst().intValue() : 0;
                Pair<Integer, Integer> pair3 = this.LLLIL;
                c1dotLLLLL.uf(iIntValue, pair3 != null ? pair3.getSecond().intValue() : 0);
                c1dotLLLLL.tf(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE);
                if (C527210Klz.LIZ(tikTokMediaModel)) {
                    c1dotLLLLL.setLoopPlay(false);
                } else {
                    c1dotLLLLL.setLoopPlay(true);
                }
                c1dotLLLLL.We(new InterfaceC1464190oCn() { // from class: X.0MRq
                    @Override // X.InterfaceC1464190oCn
                    public final void onRendered() {
                        C0CNO.LIZLLL(0L, new AwS552S0100000_8(this.LIZ, 310));
                    }
                });
                c1dotLLLLL.setPageMode(103);
                c1dotLLLLL.prepare();
            }
        }
    }

    @Override // X.InterfaceC525540KjI
    public final void onBackPress() {
        exit(true);
    }

    @Override // X.InterfaceC525540KjI
    public final void onPageSelected() {
        this.LLLILZLLLI = false;
        if (LLLLL() != null && !this.LLLLIIIILLL) {
            LLLLLILLIL();
        }
        this.LLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C527870Kn3(this, null), 3);
    }

    public final C21570819bO LLLLIILL() {
        C21570819bO c21570819bO = new C21570819bO();
        c21570819bO.LJ = 220L;
        c21570819bO.LJFF = 220L;
        c21570819bO.LJI = 220L;
        c21570819bO.LJII = 220L;
        Pair<PointF, PointF> pair = C568500MRk.LIZ;
        c21570819bO.LIZ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZIZ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZJ = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        c21570819bO.LIZLLL = new InterpolatorC1088790eRJ(pair.getFirst(), pair.getSecond());
        return c21570819bO;
    }

    public final void LLLLIL() {
        C201955140j.LIZLLL(C533790Kwb.LIZIZ, this.LLJJIJIIJIL, "dismiss loading");
        TikTokMediaModel tikTokMediaModel = this.LLJJJJJIL;
        if (tikTokMediaModel == null || !tikTokMediaModel.LJIIJJI()) {
            this.LLLIILIL = false;
            if (((View) this.LLLIIL.getValue()).getVisibility() == 0) {
                C786410Ut5.E1((C1688850u39) this.LLLIIL.getValue(), 8);
            }
        }
    }

    public final ImageView LLLLILI() {
        return (ImageView) this.LLLFZ.getValue();
    }

    public final TextureView LLLLJ() {
        return (TextureView) this.LLLFF.getValue();
    }

    public final C1322110kVd LLLLJI() {
        return (C1322110kVd) this.LLLIIIIL.getValue();
    }

    public final C1DOT LLLLL() {
        return (C1DOT) this.LLLILZ.getValue();
    }

    public final void LLLLLIL() {
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfigLLZZLLIL;
        TikTokMediaModel tikTokMediaModel;
        InterfaceC568490MRj interfaceC568490MRj = this.LLJJJJLIIL;
        if (interfaceC568490MRj == null || (choosePhotoPreviewPageConfigLLZZLLIL = interfaceC568490MRj.LLZZLLIL()) == null || !choosePhotoPreviewPageConfigLLZZLLIL.enableLivePhotoSwitch || (tikTokMediaModel = this.LLJJJJJIL) == null || !C527210Klz.LIZ(tikTokMediaModel)) {
            return;
        }
        View view = this.mView;
        ViewStub viewStub = view != null ? (ViewStub) view.findViewById(R.id.view_stub_live_photo_switch) : null;
        this.LLLJIL = viewStub;
        if (viewStub == null || viewStub.getParent() == null) {
            return;
        }
        ViewStub viewStub2 = this.LLLJIL;
        View viewLJLLLL = viewStub2 != null ? C786410Ut5.LJLLLL(viewStub2) : null;
        this.LLLJL = viewLJLLLL;
        if (viewLJLLLL != null) {
            C786410Ut5.LJLLLLLL(4, viewLJLLLL);
        }
        View view2 = this.LLLJL;
        this.LLLL = view2 != null ? (TuxIconView) view2.findViewById(R.id.n3j) : null;
        View view3 = this.LLLJL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 65), view3);
        }
        LLLLLLL();
        LLLLILI().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC580900MqO(this, 3));
    }

    public final void LLLLLJIL() {
        if (!C527210Klz.LIZ(this.LLJJJJJIL) || this.LLJL == null) {
            return;
        }
        if (this.LLLFFI != null) {
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            String str = this.LLJJIJIIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append(" maybeStopPlayLivePhoto: in progress");
            C201955140j.LIZLLL(c533790Kwb, str, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
        String str2 = this.LLJJIJIIJIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" maybeStopPlayLivePhoto");
        C201955140j.LIZLLL(c533790Kwb2, str2, C2188811AlT.LIZIZ(sbLIZ2));
        C0CNO.LIZLLL(0L, new AwS552S0100000_8(this, 313));
    }

    public final void LLLLLJLJLL() {
        AnonymousClass0956 anonymousClass0956 = this.LLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLL = null;
        C1DOT c1dotLLLLL = LLLLL();
        if (c1dotLLLLL != null) {
            c1dotLLLLL.pause();
        }
        TTVideoEngine tTVideoEngine = this.LLJL;
        if (tTVideoEngine == null) {
            return;
        }
        if (tTVideoEngine.LIZ.LJIILL == 1 || (C534210KxH.LIZ() && ((View) this.LLLIIL.getValue()).getVisibility() == 0)) {
            TTVideoEngine tTVideoEngine2 = this.LLJL;
            (tTVideoEngine2 != null ? tTVideoEngine2 : null).pause();
        }
    }

    public final void LLLLLL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View rootView;
        View viewFindViewById;
        View view = this.LLLJL;
        if (view == null) {
            return;
        }
        int width = LLLLILI().getWidth();
        int height = LLLLILI().getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int top = LLLLILI().getTop();
        int left = LLLLILI().getLeft() + width;
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = view.getMeasuredWidth();
        int iLIZJ = this.LLLLII;
        if (iLIZJ < 0) {
            View view2 = this.mView;
            if (view2 == null || (rootView = view2.getRootView()) == null || (viewFindViewById = rootView.findViewById(R.id.ul0)) == null || viewFindViewById.getHeight() <= 0) {
                iLIZJ = (int) C12ES.LIZJ(86.0f, requireSceneContext());
            } else {
                int[] iArr = new int[2];
                viewFindViewById.getLocationOnScreen(iArr);
                iLIZJ = viewFindViewById.getHeight() + iArr[1];
                this.LLLLII = iLIZJ;
            }
        }
        int iLIZJ2 = iLIZJ - ((int) C12ES.LIZJ(5.0f, requireSceneContext()));
        if (top < iLIZJ2) {
            top = iLIZJ2;
        }
        int i = left - measuredWidth;
        if (i < 0) {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.topMargin = top;
        marginLayoutParams.leftMargin = i;
        C786410Ut5.W5(view, marginLayoutParams);
        if (view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void LLLLLLIL() {
        LivePhotoInfo livePhotoInfo;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        C201955140j.LIZLLL(c533790Kwb, this.LLJJIJIIJIL, "startPlay");
        TikTokMediaModel tikTokMediaModel = this.LLJJJJJIL;
        if (tikTokMediaModel != null && C527210Klz.LIZ(tikTokMediaModel)) {
            String livePhotoPreviewMode = null;
            if (1 != 0) {
                TikTokMediaModel tikTokMediaModel2 = this.LLJJJJJIL;
                if (tikTokMediaModel2 != null && (livePhotoInfo = tikTokMediaModel2.livePhotoInfo) != null) {
                    livePhotoPreviewMode = livePhotoInfo.getLivePhotoPreviewMode();
                }
                if (Intrinsics.LJFF(livePhotoPreviewMode, "STATIC")) {
                    C201955140j.LIZLLL(c533790Kwb, this.LLJJIJIIJIL, "startPlay skip: Live Photo is in STATIC mode");
                    return;
                }
            }
        }
        C1DOT c1dotLLLLL = LLLLL();
        if (c1dotLLLLL != null) {
            if (!this.LLLLIIIILLL) {
                LLLLLILLIL();
            }
            c1dotLLLLL.play();
        }
        TTVideoEngine tTVideoEngine = this.LLJL;
        if (tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 2) {
            LLLLLLJ();
        }
    }

    public final void LLLLLLJ() {
        LivePhotoInfo livePhotoInfo;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        String str = this.LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPlay isExiting=");
        sbLIZ.append(this.LLJJL);
        sbLIZ.append(" isLivePhoto=");
        TikTokMediaModel tikTokMediaModel = this.LLJJJJJIL;
        sbLIZ.append(tikTokMediaModel != null ? Boolean.valueOf(tikTokMediaModel.LJIIJJI()) : null);
        sbLIZ.append(',');
        TikTokMediaModel tikTokMediaModel2 = this.LLJJJJJIL;
        sbLIZ.append(tikTokMediaModel2 != null ? tikTokMediaModel2.LJFF() : null);
        sbLIZ.append(", ");
        TikTokMediaModel tikTokMediaModel3 = this.LLJJJJJIL;
        sbLIZ.append(tikTokMediaModel3 != null ? tikTokMediaModel3.livePhotoInfo : null);
        C201955140j.LIZLLL(c533790Kwb, str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJL) {
            return;
        }
        TikTokMediaModel tikTokMediaModel4 = this.LLJJJJJIL;
        if (tikTokMediaModel4 != null && C527210Klz.LIZ(tikTokMediaModel4)) {
            TikTokMediaModel tikTokMediaModel5 = this.LLJJJJJIL;
            if (Intrinsics.LJFF((tikTokMediaModel5 == null || (livePhotoInfo = tikTokMediaModel5.livePhotoInfo) == null) ? null : livePhotoInfo.getLivePhotoPreviewMode(), "STATIC")) {
                C201955140j.LIZLLL(c533790Kwb, this.LLJJIJIIJIL, "tryPlay skip: Live Photo is in STATIC mode");
                return;
            }
        }
        this.LLLFFI = null;
        C786410Ut5.Q4(1.0f, LLLLJ());
        if (!C534210KxH.LIZ()) {
            TTVideoEngine tTVideoEngine = this.LLJL;
            (tTVideoEngine != null ? tTVideoEngine : null).play();
            return;
        }
        C20736016Cg c20736016Cg = this.LLJILLL;
        if (c20736016Cg.LL == null) {
            c20736016Cg.LL = new LifecycleRegistry(c20736016Cg);
        }
        if (c20736016Cg.LL.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            TTVideoEngine tTVideoEngine2 = this.LLJL;
            (tTVideoEngine2 != null ? tTVideoEngine2 : null).play();
        }
    }

    public final void LLLLLLL() {
        if (this.LLLJL == null) {
            LLLLLIL();
        }
        TikTokMediaModel tikTokMediaModel = this.LLJJJJJIL;
        if (tikTokMediaModel != null) {
            LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
            if (livePhotoInfo == null) {
                if (tikTokMediaModel == null || !C527210Klz.LIZ(tikTokMediaModel)) {
                    return;
                }
                livePhotoInfo = new LivePhotoInfo("", 0L, "LIVE_PHOTO", false);
                TikTokMediaModel tikTokMediaModel2 = this.LLJJJJJIL;
                if (tikTokMediaModel2 != null) {
                    tikTokMediaModel2.livePhotoInfo = livePhotoInfo;
                }
            }
            int iIntValue = C534280KxO.LIZ(Intrinsics.LJFF(livePhotoInfo.getLivePhotoPreviewMode(), "STATIC") ? LivePhotoPreviewMode.STATIC : LivePhotoPreviewMode.LIVE_PHOTO).getFirst().intValue();
            TuxIconView tuxIconView = this.LLLL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(iIntValue);
            }
        }
    }

    public PreviewVideoScene() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewVideo");
        sbLIZ.append(hashCode());
        this.LLJJIJIIJIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJIJIL = 2;
        this.LLJJJIL = "";
        this.LLJJJJ = EnumC568460MRg.NONE;
        this.LLJZIJLIL = new CreativeInfo(null, 0, null, 7, null);
        this.LLLFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 315));
        this.LLLFZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 311));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 316));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 308));
        this.LLLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 312));
        this.LLLIILIL = true;
        this.LLLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 317));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 314));
        this.LLLLII = -1;
    }

    @Override // X.InterfaceC525540KjI
    public final void LJJZZIII() {
        LLLLLLIL();
        TTVideoEngine tTVideoEngine = this.LLJL;
        if (tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 2) {
            LLLLLLJ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() throws JSONException {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.LLLFFI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLFFI = null;
        C1DOT c1dotLLLLL = LLLLL();
        if (c1dotLLLLL != null) {
            C15O7.LIZJ(new ACallableS415S0100000_8(c1dotLLLLL, 7));
        }
        TTVideoEngine tTVideoEngine = this.LLJL;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
            Surface surface = this.LLJLLIL;
            if (surface != null) {
                surface.release();
            }
            if (this.LLJLIL) {
                boolean z = this.LLJLL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_4k", this.LLJJJJ == EnumC568460MRg.DISABLE_4K ? 1 : 0);
                jSONObject.put("error_code", this.LLJJJ);
                jSONObject.put("error_message", this.LLJJJIL);
                jSONObject.put("display_status", this.LLJJJJ.ordinal());
                jSONObject.put("player_type", this.LLJJIJIL);
                jSONObject.put("video_watched_duration", Float.valueOf((this.LLJL != null ? r0 : null).LJJLL() / LSPassThroughRecordSizeConfig.DEFAULT));
                C1637890six.LJ("tool_performance_preview_video_play_status", z ? 1 : 0, jSONObject);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        LLLLLJLJLL();
        if (this.LLJJ && this.LLJLIL) {
            TTVideoEngine tTVideoEngine = this.LLJL;
            if (tTVideoEngine == null) {
                tTVideoEngine = null;
            }
            tTVideoEngine.pause();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLJJ && this.LLJLIL && !C527210Klz.LIZ(this.LLJJJJJIL)) {
            LLLLLLJ();
        }
        if (LLLLL() != null) {
            if (isVisible() && !this.LLLLIIIILLL) {
                LLLLLILLIL();
            }
            this.LLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C527880Kn4(this, null), 3);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        InterfaceC568490MRj interfaceC568490MRj;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfigLLZZLLIL;
        InterfaceC568490MRj interfaceC568490MRj2;
        C531250KsV c531250KsVLLZZJLIL;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfigLLZZLLIL2;
        super.onStop();
        InterfaceC568490MRj interfaceC568490MRj3 = this.LLJJJJLIIL;
        if (((interfaceC568490MRj3 == null || (choosePhotoPreviewPageConfigLLZZLLIL2 = interfaceC568490MRj3.LLZZLLIL()) == null || !choosePhotoPreviewPageConfigLLZZLLIL2.isUgcTemplate) && ((interfaceC568490MRj = this.LLJJJJLIIL) == null || (choosePhotoPreviewPageConfigLLZZLLIL = interfaceC568490MRj.LLZZLLIL()) == null || !choosePhotoPreviewPageConfigLLZZLLIL.isEditorProReplace)) || (interfaceC568490MRj2 = this.LLJJJJLIIL) == null || (c531250KsVLLZZJLIL = interfaceC568490MRj2.LLZZJLIL()) == null) {
            return;
        }
        c531250KsVLLZZJLIL.LLIZ.LIZJ();
    }

    @Override // X.InterfaceC525540KjI
    public final void LJLILLLLZI(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            C537680L6w.LIZ(C533790Kwb.LIZIZ, this.LLJJIJIIJIL, "set null mediaModel ", null);
            return;
        }
        this.LLJJJJJIL = tikTokMediaModel;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        String str = this.LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMediaModel ");
        sbLIZ.append(tikTokMediaModel);
        C201955140j.LIZLLL(c533790Kwb, str, C2188811AlT.LIZIZ(sbLIZ));
        if (C527210Klz.LIZ(tikTokMediaModel)) {
            C11S5.LIZ().LIZIZ(new ARunnableS77S0200000_8(this, tikTokMediaModel, 13));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        if (z) {
            Function1<? super TikTokMediaModel, Unit> function1 = this.LLLIZZ;
            if (function1 != null) {
                function1.invoke(this.LLJJJJJIL);
            }
            Function1<? super TikTokMediaModel, Unit> function12 = this.LLLJ;
            if (function12 != null) {
                function12.invoke(this.LLJJJJJIL);
            }
            LLLLLLL();
            LLLLLL();
        } else {
            InterfaceC568550MRp interfaceC568550MRpLIZ = C568500MRk.LIZ(this.LLLIIII);
            if (interfaceC568550MRpLIZ != null) {
                interfaceC568550MRpLIZ.reset();
            }
        }
        TTVideoEngine tTVideoEngine = this.LLJL;
        if (tTVideoEngine != null) {
            if (this.LLJLIL) {
                if (z) {
                    LLLLLLJ();
                    return;
                }
                tTVideoEngine.pause();
                TTVideoEngine tTVideoEngine2 = this.LLJL;
                if (tTVideoEngine2 == null) {
                    tTVideoEngine2 = null;
                }
                tTVideoEngine2.LJIJJLI(0, null);
                return;
            }
            if (this.LLJLILLLLZIIL || this.LLJLLIL == null || !z) {
                return;
            }
            LLLLLLJ();
        }
    }

    public final void LLLLLLLLL(Pair<Integer, Integer> pair) {
        Pair<Integer, Integer> pair2;
        TikTokMediaModel tikTokMediaModel = this.LLJJJJJIL;
        if (tikTokMediaModel != null && tikTokMediaModel.LJFF() != null) {
            Pair<Integer, Integer> pair3 = this.LLLIL;
            if (pair3 != null && pair.getFirst().intValue() == pair3.getFirst().intValue() && (pair2 = this.LLLIL) != null && pair.getSecond().intValue() == pair2.getSecond().intValue()) {
                return;
            }
            this.LLLIL = pair;
            C1DOT c1dotLLLLL = LLLLL();
            if (c1dotLLLLL != null) {
                c1dotLLLLL.uf(pair.getFirst().intValue(), pair.getSecond().intValue());
            }
        }
    }

    public final void LLLLLLLLLL(CountDownLatch countDownLatch) {
        boolean zAwait;
        LivePhotoInfo livePhotoInfo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zAwait = countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            zAwait = false;
        }
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        String str = this.LLJJIJIIJIL;
        StringBuilder sb = new StringBuilder("waitAndLog: ");
        sb.append(zAwait);
        sb.append(", ");
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb.append(", ");
        TikTokMediaModel tikTokMediaModel = this.LLJJJJJIL;
        if (tikTokMediaModel != null) {
            livePhotoInfo = tikTokMediaModel.livePhotoInfo;
        } else {
            livePhotoInfo = null;
        }
        sb.append(livePhotoInfo);
        C201955140j.LIZLLL(c533790Kwb, str, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void exit(boolean r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene.exit(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.InterfaceC525540KjI
    public final void LJJJJLI(int i, InterfaceC568490MRj interfaceC568490MRj) {
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJJJJLIIL = interfaceC568490MRj;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.LLJLLL) {
            i = R.layout.er7;
        } else {
            i = R.layout.er6;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
