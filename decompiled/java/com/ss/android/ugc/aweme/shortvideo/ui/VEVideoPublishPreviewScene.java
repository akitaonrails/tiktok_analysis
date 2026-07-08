package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AbstractC1437870nWL;
import X.C01GW;
import X.C0C64;
import X.C0FFA;
import X.C0FG9;
import X.C0FSK;
import X.C0LAB;
import X.C0LEO;
import X.C0MUK;
import X.C11VU;
import X.C120A;
import X.C1257310ip7;
import X.C1397760mTe;
import X.C1402440mbC;
import X.C1402470mbF;
import X.C1402790mbl;
import X.C1402820mbo;
import X.C1428470nHB;
import X.C1441830ncj;
import X.C1447250nlT;
import X.C1447800nmM;
import X.C1451800nso;
import X.C1453180nv2;
import X.C1461760o8s;
import X.C1462420o9w;
import X.C1462430o9x;
import X.C1465030oE9;
import X.C1466090oFr;
import X.C1466910oHB;
import X.C1524705y1;
import X.C15O7;
import X.C1602160rnK;
import X.C1664680tQA;
import X.C194331111d;
import X.C194335111h;
import X.C196925122x;
import X.C197039127h;
import X.C19713912Bd;
import X.C19740512Lj;
import X.C19EG;
import X.C20094813ju;
import X.C20622515mp;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2216131BoR;
import X.C2356009La;
import X.C275510Aqz;
import X.C286950BMn;
import X.C301490Brn;
import X.C537820L7k;
import X.C580270MpN;
import X.C786410Ut5;
import X.EnumC1397840mTm;
import X.InterfaceC1452170ntP;
import X.InterfaceC1674890tgd;
import X.InterfaceC194336111i;
import X.InterfaceC20597015ii;
import X.InterfaceC362610EJn;
import X.InterfaceC545970Lb9;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AAListenerS333S0100000_22;
import Y.ACListenerS149S0100000_14;
import Y.ACListenerS156S0100000_22;
import Y.ACallableS250S0200000_22;
import Y.AObjectS316S0200000_22;
import Y.AObjectS365S0100000_22;
import Y.AObjectS396S0100000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS74S0200000_5;
import Y.AUListenerS271S0100000_22;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleEventObserver;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.creative.model.landscape.LandscapeVideoModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.setting.ExpandRegionBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;
import lth.o;
import nv7.c0;

/* JADX INFO: loaded from: classes23.dex */
public class VEVideoPublishPreviewScene extends PublishPreviewScene implements InterfaceC362610EJn, InterfaceC545970Lb9 {
    public static final /* synthetic */ int LLLLZ = 0;
    public final boolean LLJJL;
    public ImageView LLJJLIIIJLLLLLLLZ;
    public VideoPublishEditModel LLJL;
    public C1441830ncj LLJLIL;
    public SurfaceView LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LLJLLIL;
    public C120A LLJLLL;
    public C1461760o8s LLJZ;
    public C194331111d LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public FrameLayout LLLFF;
    public ImageView LLLFFI;
    public ImageView LLLFZ;
    public String LLLI;
    public UrlModel LLLII;
    public Integer LLLIIII;
    public int LLLIIIIL;
    public String LLLIIIL;
    public String LLLIIL;
    public long LLLIILIL;
    public AbstractC1437870nWL LLLIL;
    public FrameLayout LLLILZ;
    public View LLLILZJ;
    public View LLLILZLLLI;
    public NavigationScene LLLIZZ;
    public C197039127h LLLJ;
    public LinearLayout LLLJIL;
    public C197039127h LLLJL;
    public TuxIconView LLLL;
    public final Function0<Void> LLLLII;
    public View LLLLIIIILLL;
    public ObjectAnimator LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public FrameLayout LLLLJI;
    public InfoStickerModel LLLLL;
    public final List<TextStickerData> LLLLLIL;
    public final List<C196925122x> LLLLLILLIL;
    public SafeHandler LLLLLJIL;
    public C197039127h LLLLLJLJLL;
    public FrameLayout.LayoutParams LLLLLL;
    public Bundle LLLLLLIL;
    public final C1664680tQA<C194335111h> LLLLLLJ;
    public FrameLayout.LayoutParams LLLLLLL;
    public boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public View LLLLLLZ;
    public boolean LLLLLLZZ;
    public C0FSK LLLLLZ;
    public View LLLLLZIL;
    public View LLLLLZL;

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLL() {
        C786410Ut5.LLLLLLJ(this.LLLJL, 0);
        C786410Ut5.LLLLLLJ(this.LLLLLJLJLL, 0);
        C786410Ut5.LJLLLLLL(8, this.LLLLIIIILLL);
        if (this.LLLLIIL.isRunning()) {
            this.LLLLIIL.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLIL() {
        return !this.LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLLLLJ() {
        NavigationScene navigationScene = this.LLLIZZ;
        return navigationScene != null && navigationScene.LLLLIIIILLL() == this;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final void LLLLLLL() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLLLIIIILLL, "rotation", 0.0f, 360.0f);
        this.LLLLIIL = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        this.LLLLIIL.setRepeatCount(-1);
        this.LLLLIIL.setInterpolator(new LinearInterpolator());
        C786410Ut5.LLLLLLJ(this.LLLJL, 8);
        C786410Ut5.LLLLLLJ(this.LLLLLJLJLL, 8);
        C786410Ut5.LJLLLLLL(0, this.LLLLIIIILLL);
        if (this.LLLLIIL.isRunning()) {
            return;
        }
        C786410Ut5.Pd(this.LLLLIIL);
    }

    public final void LLLLLLLLL() {
        View view = this.LLLLLZIL;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.LLLLLZL;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.LLLLLLZ;
        if (view3 != null) {
            view3.bringToFront();
        }
        this.LLJLLL.bringToFront();
        this.LLJZ.bringToFront();
        this.LLJZIJLIL.bringToFront();
        this.LLLFFI.bringToFront();
        this.LLL.bringToFront();
        this.LLLF.bringToFront();
        this.LLLFF.bringToFront();
        this.LLLFZ.bringToFront();
        this.LLLL.bringToFront();
        this.LLLJL.bringToFront();
        LinearLayout linearLayout = this.LLLJIL;
        if (linearLayout != null) {
            linearLayout.bringToFront();
        }
    }

    public final void LLLLLLLLLL() {
        VideoPublishEditModel videoPublishEditModel;
        LandscapeVideoModel landscapeVideoModel;
        C0FG9.LIZ.getClass();
        if (C0FG9.LIZ()) {
            synchronized (this.LLJL.creativeModel.landscapeVideoModel) {
                try {
                    videoPublishEditModel = this.LLJL;
                    landscapeVideoModel = videoPublishEditModel.creativeModel.landscapeVideoModel;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (landscapeVideoModel == null || !landscapeVideoModel.isLandscapeVideo || landscapeVideoModel.blackLevel == 0) {
                return;
            }
            C0FFA c0ffa = C0FFA.LIZ;
            SurfaceView surfaceView = this.LLJLILLLLZIIL;
            c0ffa.getClass();
            RectF rectFLIZLLL = C0FFA.LIZLLL(surfaceView);
            C2356009La c2356009La = C2356009La.LIZ;
            String strVideoPath = videoPublishEditModel.videoPath();
            c2356009La.getClass();
            VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(strVideoPath);
            float fHeight = 0.0f;
            if (vEVideoFileInfoLIZ != null && vEVideoFileInfoLIZ.width != 0 && vEVideoFileInfoLIZ.height != 0 && rectFLIZLLL.width() != 0.0f && rectFLIZLLL.height() != 0.0f) {
                Pair pairLIZ = C0FFA.LIZ(vEVideoFileInfoLIZ.width / vEVideoFileInfoLIZ.height, rectFLIZLLL.width(), rectFLIZLLL.height());
                float f = 2;
                fHeight = (rectFLIZLLL.height() / f) + (((Number) pairLIZ.getSecond()).floatValue() / f);
            }
            C194335111h c194335111h = new C194335111h(true, false, fHeight);
            C194331111d c194331111d = this.LLJZIJLIL;
            c194331111d.getClass();
            C1524705y1.LIZJ(new AwS430S0200000_29(c194331111d, c194335111h, 136));
            C194331111d c194331111d2 = this.LLJZIJLIL;
            int visibility = c194331111d2.getVisibility();
            c194331111d2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c194331111d2);
            this.LLJZIJLIL.bringToFront();
        }
    }

    public final void LLLLLLLZIL() {
        C786410Ut5.LLLLLLZZ(this.LLLL, 0);
        C786410Ut5.LJLLLLLL(4, this.LLL);
        C120A c120a = this.LLJLLL;
        int visibility = c120a.getVisibility();
        c120a.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c120a);
        C786410Ut5.LJLLLLLL(4, this.LLLF);
        C786410Ut5.LJLLLLLL(4, this.LLLILZJ);
        C786410Ut5.LJLLLLLL(4, this.LLLILZLLLI);
        C194331111d c194331111d = this.LLJZIJLIL;
        int visibility2 = c194331111d.getVisibility();
        c194331111d.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, c194331111d);
    }

    public final void LLLLLLZZ() {
        C120A c120a = this.LLJLLL;
        int visibility = c120a.getVisibility();
        c120a.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c120a);
        C786410Ut5.LJZI(0, this.LLLFFI);
        C786410Ut5.LJLLLLLL(0, this.LLL);
        C786410Ut5.LJLLLLLL(0, this.LLLF);
        C786410Ut5.LJLLLLLL(0, this.LLLILZJ);
        C786410Ut5.LJLLLLLL(0, this.LLLILZLLLI);
        LLLLLZ(true);
        C786410Ut5.LLLLLLZZ(this.LLLL, 4);
        if (this.LLLLIILLL) {
            C786410Ut5.LJZI(0, this.LLLFZ);
        }
        C120A c120a2 = this.LLJLLL;
        if (c120a2 != null) {
            c120a2.LIZJ();
        }
        LLLLLLLLLL();
    }

    public final void LLLLZ() {
        if (this.LLLLJ) {
            if (this.LLJZ.getVisibility() == 0) {
                C786410Ut5.N0(this.LLJZ, 8);
                return;
            } else {
                C786410Ut5.N0(this.LLJZ, 0);
                return;
            }
        }
        if (this.LLLLIILLL) {
            VideoPublishEditModel videoPublishEditModel = this.LLJL;
            String str = this.LLLIIIL;
            C1402820mbo.LIZ.getClass();
            C20684815ws.LJIILLIIL("click_on_preview_page", C1402820mbo.LIZ(videoPublishEditModel, str, true).LIZ);
            this.LLJLIL.LJ();
            C786410Ut5.LJZI(4, this.LLLFZ);
            this.LLLLIILLL = false;
            return;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLJL;
        String str2 = this.LLLIIIL;
        C1402820mbo.LIZ.getClass();
        C20684815ws.LJIILLIIL("click_on_preview_page", C1402820mbo.LIZ(videoPublishEditModel2, str2, true).LIZ);
        this.LLJLIL.LIZLLL();
        C786410Ut5.LJZI(0, this.LLLFZ);
        this.LLLLIILLL = true;
        C1402820mbo.LJ(this.LLJL, "preview_video");
    }

    public final FrameLayout.LayoutParams LLLLZIL() {
        AbstractC1437870nWL abstractC1437870nWL = this.LLLIL;
        return abstractC1437870nWL != null ? c0.LIZ.LJ(abstractC1437870nWL.LJFF(), this.LLLIL.LIZJ()) : (FrameLayout.LayoutParams) this.LLJLILLLLZIIL.getLayoutParams();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
        AbstractC1437870nWL abstractC1437870nWL = this.LLLIL;
        if (abstractC1437870nWL != null) {
            c0.LIZ.q2(abstractC1437870nWL.LJFF(), this.LLLIL.LIZJ(), this.LLJLILLLLZIIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        this.LLJLIL.LJIIIZ.If();
        this.LLJLIL.LIZJ();
        C1453180nv2.LJ = 0;
        C1453180nv2.LJFF = 0;
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        FrameLayout.LayoutParams layoutParams;
        super.onResume();
        this.LLLLIILLL = false;
        this.LLLLILI = false;
        this.LLJLIL.LJ();
        C786410Ut5.LJZI(4, this.LLLFZ);
        if (!this.LLLLLLLLLL) {
            this.LLLLLLLLLL = true;
            ViewStub viewStub = (ViewStub) findViewById(R.id.w7r);
            FrameLayout.LayoutParams layoutParamsLLLLZIL = LLLLZIL();
            C1465030oE9 c1465030oE9 = C1465030oE9.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJL;
            C19EG c19eg = (C19EG) requireActivity();
            ArrayList arrayList = (ArrayList) C1466090oFr.LJFF(this.LLJL.creativeModel.stickerModel);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int mediaWidth = ((StickerModel) it2.next()).getBaseModel().getMediaWidth();
                while (it2.hasNext()) {
                    int mediaWidth2 = ((StickerModel) it2.next()).getBaseModel().getMediaWidth();
                    if (mediaWidth < mediaWidth2) {
                        mediaWidth = mediaWidth2;
                    }
                }
                Iterator it3 = arrayList.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                int mediaHeight = ((StickerModel) it3.next()).getBaseModel().getMediaHeight();
                while (it3.hasNext()) {
                    int mediaHeight2 = ((StickerModel) it3.next()).getBaseModel().getMediaHeight();
                    if (mediaHeight < mediaHeight2) {
                        mediaHeight = mediaHeight2;
                    }
                }
                if (C537820L7k.LIZ(mediaWidth, mediaHeight) && C301490Brn.LIZ()) {
                    float f = mediaWidth / mediaHeight;
                    int i = layoutParamsLLLLZIL.height;
                    int i2 = (int) (i * f);
                    int i3 = (layoutParamsLLLLZIL.width - i2) / 2;
                    layoutParams = new FrameLayout.LayoutParams(i2, i);
                    layoutParams.topMargin = layoutParamsLLLLZIL.topMargin;
                    layoutParams.bottomMargin = layoutParamsLLLLZIL.bottomMargin;
                    layoutParams.setMarginStart(layoutParamsLLLLZIL.getMarginStart() + i3);
                    layoutParams.setMarginEnd(layoutParamsLLLLZIL.getMarginEnd() + i3);
                    layoutParams.leftMargin = layoutParamsLLLLZIL.leftMargin + i3;
                    layoutParams.rightMargin = layoutParamsLLLLZIL.rightMargin + i3;
                } else {
                    float f2 = mediaHeight / mediaWidth;
                    int i4 = layoutParamsLLLLZIL.width;
                    float f3 = i4 * f2;
                    layoutParams = new FrameLayout.LayoutParams(i4, (int) f3);
                    int i5 = (int) ((layoutParamsLLLLZIL.height - f3) / 2);
                    layoutParams.topMargin = layoutParamsLLLLZIL.topMargin + i5;
                    layoutParams.bottomMargin = layoutParamsLLLLZIL.bottomMargin + i5;
                    layoutParams.setMarginStart(layoutParamsLLLLZIL.getMarginStart());
                    layoutParams.leftMargin = layoutParamsLLLLZIL.leftMargin;
                    layoutParams.rightMargin = layoutParamsLLLLZIL.rightMargin;
                }
                layoutParamsLLLLZIL = layoutParams;
            }
            AObjectS365S0100000_22 aObjectS365S0100000_22 = new AObjectS365S0100000_22(this, 3);
            AObjectS396S0100000_22 aObjectS396S0100000_22 = new AObjectS396S0100000_22(this, 9);
            AObjectS396S0100000_22 aObjectS396S0100000_222 = new AObjectS396S0100000_22(this, 5);
            c1465030oE9.getClass();
            C1465030oE9.LIZLLL(1.0f, viewStub, layoutParamsLLLLZIL, null, c19eg, this, videoPublishEditModel, "video_post_page_preview_page", aObjectS396S0100000_22, aObjectS396S0100000_222, aObjectS365S0100000_22);
        }
        if (!this.LLLLLLZZ && ((Number) C1402790mbl.LIZ.getValue()).intValue() != 0) {
            this.LLLLLLZ = findViewById(R.id.w4u);
            C19740512Lj c19740512LjLIZ = C1451800nso.LIZ(getContext(), (ViewGroup) this.LLLLLLZ, 0, 8);
            C0FSK c0fsk = new C0FSK(this.LLJL, this, this.LLLLLL, this.LLJLIL.LJIIIZ, new AObjectS365S0100000_22(this, 0));
            this.LLLLLZ = c0fsk;
            new SafeHandler(this).post(new ARunnableS74S0200000_5(c0fsk, new AObjectS316S0200000_22(this, c19740512LjLIZ, 0), 13));
            this.LLLLLLZZ = true;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "preview_cover_flash_opt", true, false)) {
            FrameLayout.LayoutParams layoutParamsLLLLZIL2 = LLLLZIL();
            if (this.LLJJLIIIJLLLLLLLZ != null) {
                C786410Ut5.c6(this.LLJJLIIIJLLLLLLLZ, layoutParamsLLLLZIL2);
            }
        }
    }

    public VEVideoPublishPreviewScene() {
        this.LLJJL = true;
        this.LLLLIL = true;
        this.LLLLLIL = new ArrayList();
        this.LLLLLILLIL = new ArrayList();
        this.LLLLLLJ = new C1664680tQA<>(new C194335111h());
        this.LLLLLLLLLL = false;
        this.LLLLLLLZIL = false;
        this.LLLLLLZ = null;
        this.LLLLLLZZ = false;
        this.LLLLLZIL = null;
        this.LLLLLZL = null;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        super.onStop();
        C1441830ncj c1441830ncj = this.LLJLIL;
        if (c1441830ncj != null && (interfaceC1452170ntP = c1441830ncj.LJIIIZ) != null) {
            interfaceC1452170ntP.If();
        }
        if (!this.LLLLILI) {
            VideoPublishEditModel videoPublishEditModel = this.LLJL;
            boolean z = !this.LLLLIILL;
            C1402440mbC.LIZ.getClass();
            C1402470mbF.LJFF(videoPublishEditModel, z);
        }
        C0FSK c0fsk = this.LLLLLZ;
        if (c0fsk != null) {
            c0fsk.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final InterfaceC1674890tgd LLLLLILLIL() {
        return c0.LIZ;
    }

    public final void LLLLLLZ(boolean z) {
        NavigationScene navigationScene;
        int previewVideoLength;
        int i;
        C1402820mbo.LIZIZ(this.LLJL, this.LLLIIIL, this.LLLIIL, "preview_video", !this.LLLLIILL);
        View view = this.LLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ImageView imageView = this.LLLFFI;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        ImageView imageView2 = this.LLLFZ;
        if (imageView2 != null) {
            C786410Ut5.LJZI(8, imageView2);
        }
        View view2 = this.LLLLLZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLLLLLZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        C120A c120a = this.LLJLLL;
        if (c120a != null) {
            int visibility = c120a.getVisibility();
            c120a.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c120a);
        }
        FrameLayout frameLayout = this.LLLLJI;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        C1461760o8s c1461760o8s = this.LLJZ;
        if (c1461760o8s != null) {
            C786410Ut5.N0(c1461760o8s, 8);
        }
        C194331111d c194331111d = this.LLJZIJLIL;
        if (c194331111d != null) {
            int visibility2 = c194331111d.getVisibility();
            c194331111d.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c194331111d);
        }
        View view4 = this.LLLF;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJL;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getPreviewInfo() != null) {
                previewVideoLength = this.LLJL.getPreviewInfo().getPreviewVideoLength();
            } else {
                previewVideoLength = -1;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", this.LLJL.mShootWay);
            c0lab.LJ("enter_from", this.LLJL.getEnterFrom());
            c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LLJL));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LLJL));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis() - this.LLLIILIL);
            sbLIZ.append("");
            c0lab.LJ("duration", C2188811AlT.LIZIZ(sbLIZ));
            c0lab.LIZ(-1, "fps");
            c0lab.LIZ(-1, "lag_count");
            c0lab.LIZ(-1, "lag_total_duration");
            c0lab.LIZ(previewVideoLength, "creation_duration");
            c0lab.LJ("creation_id", this.LLJL.getCreationId());
            c0lab.LIZ(C1428470nHB.LJJIL(this.LLJL), "source_is_hdr");
            Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(this.LLJL);
            if (pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue() > 1) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "is_multi_content");
            C15O7.LIZJ(new ACallableS250S0200000_22(this, c0lab, 5));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0o9L
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SurfaceView surfaceView = this.LL.LLJLILLLLZIIL;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(surfaceView);
                surfaceView.setAlpha(fFloatValue);
            }
        });
        valueAnimatorOfFloat.addListener(new AAListenerS333S0100000_22(this, 0));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.start();
        this.LLJJLIIIJLLLLLLLZ.bringToFront();
        C786410Ut5.V4(this.LLJJLIIIJLLLLLLLZ, 1.0f);
        C786410Ut5.LJZI(0, this.LLJJLIIIJLLLLLLLZ);
        LLLLLZ(false);
        this.LLLLILI = true;
        if (!z && (navigationScene = this.LLLIZZ) != null) {
            navigationScene.remove(this);
        }
    }

    public final void LLLLLZ(boolean z) {
        LinearLayout linearLayout;
        C197039127h c197039127h = this.LLLJL;
        if (c197039127h == null || (linearLayout = this.LLLJIL) == null) {
            return;
        }
        if (this.LLJLLIL) {
            C786410Ut5.LJZL(8, linearLayout);
        } else if (z) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
            C786410Ut5.LJZL(0, linearLayout);
        } else {
            C786410Ut5.LJZL(8, linearLayout);
        }
    }

    public final void LLLLZLL(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int height = ((FrameLayout.LayoutParams) this.LLJLILLLLZIIL.getLayoutParams()).topMargin + ((this.LLJLILLLLZIIL.getHeight() - this.LLJLIL.LJIIIZ.getInitSize().height) / 2);
        if (height > 0) {
            layoutParams.height = height;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.LJLLLLLL(0, view);
            view.bringToFront();
        }
    }

    public final void LLLLZLLIL(boolean z) {
        if (z) {
            View view = this.LLLLLZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            if (!this.LLLLLLLZIL) {
                this.LLLLLLLZIL = true;
                ViewStub viewStub = (ViewStub) findViewById(R.id.m5i);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLJLILLLLZIIL.getLayoutParams();
                C0FFA c0ffa = C0FFA.LIZ;
                SurfaceView surfaceView = this.LLJLILLLLZIIL;
                VideoPublishEditModel videoPublishEditModel = this.LLJL;
                c0ffa.getClass();
                VideoPublishEditModel videoPublishEditModelClone = videoPublishEditModel.clone();
                RectF rectFLIZLLL = C0FFA.LIZLLL(surfaceView);
                RectF rectFLIZIZ = C0FFA.LIZIZ(rectFLIZLLL, videoPublishEditModel.getNleModel());
                if (rectFLIZIZ != null) {
                    List<StickerModel> listLJFF = C1466090oFr.LJFF(videoPublishEditModel.creativeModel.stickerModel);
                    ArrayList<StickerModel> arrayList = new ArrayList();
                    for (Object obj : (ArrayList) listLJFF) {
                        if (RectF.intersects(rectFLIZIZ, ((StickerModel) obj).getBaseModel().getStickerBoundingRect())) {
                            arrayList.add(obj);
                        }
                    }
                    float fWidth = rectFLIZIZ.width() / rectFLIZIZ.height();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (StickerModel stickerModel : arrayList) {
                        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(stickerModel.getBaseModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
                        BaseStickerModel baseModel = stickerModel.getBaseModel();
                        float scale = baseStickerModelCopy$default.getScale() * fWidth;
                        BaseStickerModel baseStickerModelCopy$default2 = BaseStickerModel.copy$default(baseModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, (int) rectFLIZLLL.width(), (int) rectFLIZLLL.height(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, (-baseStickerModelCopy$default.getTranslateY()) * fWidth, baseStickerModelCopy$default.getTranslateX() * fWidth, scale, baseStickerModelCopy$default.getRotation() + 90.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31481857, 15, null);
                        if (stickerModel instanceof TextStickerModel) {
                            arrayList2.add(TextStickerModel.copy$default((TextStickerModel) stickerModel, baseStickerModelCopy$default2, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
                        } else if (stickerModel instanceof DonationStickerModel) {
                            DonationStickerModel donationStickerModel = (DonationStickerModel) stickerModel;
                            arrayList3.add(donationStickerModel.copy(baseStickerModelCopy$default2, donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, donationStickerModel.displayStyle, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender));
                        } else if (stickerModel instanceof CommentStickerModel) {
                            CommentStickerModel commentStickerModel = (CommentStickerModel) stickerModel;
                            arrayList4.add(commentStickerModel.copy(baseStickerModelCopy$default2, commentStickerModel.commentStickerModel, commentStickerModel.alpha, commentStickerModel.visible, commentStickerModel.isCommentDeleted));
                        } else if (stickerModel instanceof HashTagStickerModel) {
                            HashTagStickerModel hashTagStickerModel = (HashTagStickerModel) stickerModel;
                            arrayList5.add(hashTagStickerModel.copy(baseStickerModelCopy$default2, hashTagStickerModel.hashtagName, hashTagStickerModel.editable, hashTagStickerModel.visible, hashTagStickerModel.useCapsuleStyle));
                        } else if (stickerModel instanceof MentionStickerModel) {
                            MentionStickerModel mentionStickerModel = (MentionStickerModel) stickerModel;
                            arrayList6.add(mentionStickerModel.copy(baseStickerModelCopy$default2, mentionStickerModel.user, mentionStickerModel.userId, mentionStickerModel.secUid, mentionStickerModel.userName, mentionStickerModel.avatarUrl, mentionStickerModel.nickname, mentionStickerModel.useNickName, mentionStickerModel.editable, mentionStickerModel.visible, mentionStickerModel.useCapsuleStyle));
                        } else if (stickerModel instanceof LocationStickerModel) {
                            LocationStickerModel locationStickerModel = (LocationStickerModel) stickerModel;
                            arrayList7.add(locationStickerModel.copy(baseStickerModelCopy$default2, locationStickerModel.theme, locationStickerModel.poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle));
                        }
                    }
                    C1466090oFr.LJ(videoPublishEditModelClone.creativeModel.stickerModel);
                    videoPublishEditModelClone.creativeModel.stickerModel.textStickerModels.addAll(arrayList2);
                    videoPublishEditModelClone.creativeModel.stickerModel.donationStickers.addAll(arrayList3);
                    videoPublishEditModelClone.creativeModel.stickerModel.commentStickerModels.addAll(arrayList4);
                    videoPublishEditModelClone.creativeModel.stickerModel.hashtagStickerModel.addAll(arrayList5);
                    videoPublishEditModelClone.creativeModel.stickerModel.mentionStickerModel.addAll(arrayList6);
                    videoPublishEditModelClone.creativeModel.stickerModel.locationStickerModels.addAll(arrayList7);
                }
                C1465030oE9 c1465030oE9 = C1465030oE9.LIZ;
                C19EG c19eg = (C19EG) requireActivity();
                AObjectS365S0100000_22 aObjectS365S0100000_22 = new AObjectS365S0100000_22(this, 2);
                AObjectS396S0100000_22 aObjectS396S0100000_22 = new AObjectS396S0100000_22(this, 7);
                AObjectS396S0100000_22 aObjectS396S0100000_222 = new AObjectS396S0100000_22(this, 8);
                c1465030oE9.getClass();
                C1465030oE9.LIZLLL(1.0f, viewStub, layoutParams, null, c19eg, this, videoPublishEditModelClone, "video_post_page_preview_page", aObjectS396S0100000_22, aObjectS396S0100000_222, aObjectS365S0100000_22);
            }
            View view2 = this.LLLLLZL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = this.LLLLLLZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
                return;
            }
            return;
        }
        View view4 = this.LLLLLZIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLLLLZL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
        }
        View view6 = this.LLLLLLZ;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(0, view6);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
        int iLIZIZ;
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
        int iLIZIZ2 = C0LEO.LIZIZ();
        View view = this.LLLILZLLLI;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (z) {
                iLIZIZ = iLIZIZ2;
            } else {
                iLIZIZ = (int) C11VU.LIZIZ(0.0f, requireActivity());
            }
            layoutParams.bottomMargin = iLIZIZ;
            if (getContext() != null) {
                Window window = getWindow();
                if (window != null) {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = C1257310ip7.LIZ(window.getDecorView());
                } else {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext());
                }
                layoutParams.bottomMargin = c0.LIZ.LLJJJJLIIL() - iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
            }
            C786410Ut5.W5(this.LLLILZLLLI, layoutParams);
        }
        LinearLayout linearLayout = this.LLLJIL;
        if (linearLayout != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.bottomMargin = iLIZIZ2 - ((int) C11VU.LIZIZ(52.0f, requireActivity()));
            C786410Ut5.d6(this.LLLJIL, layoutParams2);
        } else {
            C197039127h c197039127h = this.LLLJL;
            if (c197039127h == null) {
                return;
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) c197039127h.getLayoutParams();
            layoutParams3.bottomMargin = iLIZIZ2 - ((int) C11VU.LIZIZ(52.0f, requireActivity()));
            C786410Ut5.J6(this.LLLJL, layoutParams3);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C197039127h c197039127h;
        Bundle bundle2;
        Integer numValueOf;
        super.onActivityCreated(bundle);
        if (this.LLJJL && (bundle2 = this.mArguments) != null) {
            this.LLLIIIL = bundle2.getString("last_group_id");
            this.LLLII = (UrlModel) bundle2.getSerializable("anchor_icon_url");
            this.LLLI = bundle2.getString("anchor_text");
            if (bundle2.containsKey("anchor_icon_raw_id")) {
                numValueOf = Integer.valueOf(bundle2.getInt("anchor_icon_raw_id"));
            } else {
                numValueOf = null;
            }
            this.LLLIIII = numValueOf;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) bundle2.getParcelable("model");
            this.LLJL = videoPublishEditModel;
            videoPublishEditModel.creativeModel = C0MUK.LIZJ(bundle2);
            this.LLJL.refreshOldFieldIfNeeded();
            this.LLLIIIIL = bundle2.getInt("permission_state");
            this.LLLLLLIL = bundle2.getBundle("publish_bundle");
            this.LLJLL = bundle2.getString("publish_button_name");
            this.LLJLLIL = bundle2.getBoolean("publish_hide_button");
        }
        o.LJFF(C2216131BoR.LIZ());
        this.LLLILZ = (FrameLayout) findViewById(R.id.mg3);
        this.LLLJIL = (LinearLayout) findViewById(R.id.sga);
        this.LLLILZLLLI = findViewById(R.id.rs3);
        this.LLLILZJ = findViewById(R.id.rs4);
        this.LLLFZ = (ImageView) findViewById(R.id.rrl);
        this.LLLLJI = (FrameLayout) findViewById(R.id.xle);
        this.LLLL = (TuxIconView) findViewById(R.id.rrw);
        this.LLLJL = (C197039127h) findViewById(R.id.sg9);
        C786410Ut5.a9(this.LLLL, new ACListenerS156S0100000_22(this, 21));
        if (this.LLJL.creativeModel.editPostModel != null) {
            this.LLLJL.setText(2131833454);
        }
        String str = this.LLJLL;
        if (str != null && !str.isEmpty()) {
            this.LLLJL.setText(this.LLJLL);
        }
        C786410Ut5.LLLLLLZZ(this.LLLL, 4);
        C197039127h c197039127h2 = this.LLLJL;
        if (c197039127h2 != null) {
            c197039127h2.setBackgroundRadius(200);
        }
        this.LLLJL.setButtonStartIcon(Integer.valueOf(R.raw.icon_post));
        if (this.LLLJL != null) {
            LLLLLZ(true);
            C786410Ut5.U8(this.LLLJL, new ACListenerS149S0100000_14(this, 47));
            if (C286950BMn.LIZ()) {
                int iLIZIZ = (int) C11VU.LIZIZ(6.0f, requireActivity());
                C19713912Bd c19713912Bd = C19713912Bd.LIZ;
                C197039127h c197039127h3 = this.LLLJL;
                Rect rect = new Rect(0, iLIZIZ, iLIZIZ, iLIZIZ);
                FrameLayout frameLayout = this.LLLILZ;
                c19713912Bd.getClass();
                C19713912Bd.LIZ(rect, c197039127h3, frameLayout);
            }
            C01GW c01gw = C1462430o9x.LIZIZ;
            if (((ExpandRegionBean) c01gw.getValue()).isEnable) {
                Rect rectLIZ = C1462420o9w.LIZ(requireActivity(), (ExpandRegionBean) c01gw.getValue());
                C19713912Bd c19713912Bd2 = C19713912Bd.LIZ;
                C197039127h c197039127h4 = this.LLLJL;
                FrameLayout frameLayout2 = this.LLLILZ;
                c19713912Bd2.getClass();
                C19713912Bd.LIZ(rectLIZ, c197039127h4, frameLayout2);
            }
            C197039127h c197039127h5 = this.LLLJL;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            C20094813ju.LIZ(c197039127h5, c1397760mTe.LIZ());
            this.LLLJL.setBackgroundResource(R.drawable.a99);
        }
        C197039127h c197039127h6 = (C197039127h) findViewById(R.id.sgt);
        this.LLLLLJLJLL = c197039127h6;
        if (c197039127h6 != null) {
            c197039127h6.setBackgroundRadius(200);
        }
        TCMPostPageSubmitTextModel submitText = this.LLJL.creativeModel.commerceModel.getTcmModel().getSubmitText();
        if (this.LLLJL != null && this.LLLLLJLJLL != null && submitText != null && submitText.getSubmitButtonText() != null) {
            this.LLLLLJLJLL.setText(submitText.getSubmitButtonText());
            C786410Ut5.LLLLLLJ(this.LLLJL, 8);
            C786410Ut5.LLLLLLJ(this.LLLLLJLJLL, 0);
        }
        this.LLLLIIIILLL = findViewById(R.id.sgu);
        this.LLLF = findViewById(R.id.rpe);
        this.LLLFF = (FrameLayout) findViewById(R.id.y9j);
        View viewFindViewById = findViewById(R.id.rpf);
        this.LLL = viewFindViewById;
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        C786410Ut5.I7(new ACListenerS156S0100000_22(this, 23), this.LLL);
        ImageView imageView = (ImageView) findViewById(R.id.rp2);
        this.LLLFFI = imageView;
        C786410Ut5.LJZI(0, imageView);
        C786410Ut5.Q7(this.LLLFFI, new ACListenerS156S0100000_22(this, 24));
        C120A c120a = (C120A) findViewById(R.id.rqe);
        this.LLJLLL = c120a;
        int visibility = c120a.getVisibility();
        c120a.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c120a);
        this.LLJZ = (C1461760o8s) findViewById(R.id.rqb);
        C194331111d c194331111d = (C194331111d) findViewById(R.id.hkn);
        this.LLJZIJLIL = c194331111d;
        int visibility2 = c194331111d.getVisibility();
        c194331111d.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c194331111d);
        this.LLJZIJLIL.LIZ(this, this.LLLLLLJ);
        this.LLJZIJLIL.setOnEntranceClickListener(new InterfaceC194336111i() { // from class: X.0o8p
            @Override // X.InterfaceC194336111i
            public final void LIZ() {
                NLEModel nLEModelDynamicCast;
                NLETrack mainTrack;
                VecNLETrackSlotSPtr slots;
                NLETrackSlot nLETrackSlot;
                Pair pairLJ;
                final VEVideoPublishPreviewScene vEVideoPublishPreviewScene = this.LIZ;
                if (vEVideoPublishPreviewScene.LLLLIILLL) {
                    vEVideoPublishPreviewScene.LLJLIL.LJ();
                    C786410Ut5.LJZI(4, vEVideoPublishPreviewScene.LLLFZ);
                    vEVideoPublishPreviewScene.LLLLIILLL = false;
                }
                vEVideoPublishPreviewScene.LLLLJ = true;
                vEVideoPublishPreviewScene.LLLLLLLZIL();
                C1461760o8s c1461760o8s = vEVideoPublishPreviewScene.LLJZ;
                VideoPublishEditModel videoPublishEditModel2 = vEVideoPublishPreviewScene.LLJL;
                if (videoPublishEditModel2 == null) {
                    c1461760o8s.getClass();
                } else {
                    c1461760o8s.LIZ();
                    String title = videoPublishEditModel2.getTitle();
                    if (title == null || title.length() == 0) {
                        C417010GWt c417010GWt = c1461760o8s.LLILZIL;
                        if (c417010GWt != null) {
                            int visibility3 = c417010GWt.getVisibility();
                            c417010GWt.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility3, 8, c417010GWt);
                        }
                    } else {
                        String title2 = videoPublishEditModel2.getTitle();
                        C417010GWt c417010GWt2 = c1461760o8s.LLILZIL;
                        if (c417010GWt2 != null) {
                            int visibility4 = c417010GWt2.getVisibility();
                            c417010GWt2.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility4, 0, c417010GWt2);
                        }
                        C417010GWt c417010GWt3 = c1461760o8s.LLILZIL;
                        if (c417010GWt3 != null) {
                            c417010GWt3.setText(title2);
                        }
                        C417010GWt c417010GWt4 = c1461760o8s.LLILZIL;
                        if (c417010GWt4 != null) {
                            c417010GWt4.setTextColor(C960203pA.LIZ(R.attr.bx, c1461760o8s.getContext()));
                        }
                    }
                }
                C786410Ut5.N0(vEVideoPublishPreviewScene.LLJZ, 0);
                vEVideoPublishPreviewScene.LLJZ.bringToFront();
                vEVideoPublishPreviewScene.LLJZ.setBackClickListener(new InterfaceC1461770o8t() { // from class: X.0o8q
                    @Override // X.InterfaceC1461770o8t
                    public final void LIZ() {
                        VEVideoPublishPreviewScene vEVideoPublishPreviewScene2 = vEVideoPublishPreviewScene;
                        vEVideoPublishPreviewScene2.LLLLJ = false;
                        C786410Ut5.U5(vEVideoPublishPreviewScene2.LLJLILLLLZIIL, vEVideoPublishPreviewScene2.LLLLZIL());
                        C786410Ut5.N0(vEVideoPublishPreviewScene2.LLJZ, 8);
                        C786410Ut5.LJZL(0, vEVideoPublishPreviewScene2.LLLJIL);
                        FrameLayout frameLayout3 = vEVideoPublishPreviewScene2.LLLLJI;
                        if (frameLayout3 != null) {
                            C786410Ut5.LJZ(0, frameLayout3);
                        }
                        vEVideoPublishPreviewScene2.LLLLLLZZ();
                        C786410Ut5.LJZ(0, vEVideoPublishPreviewScene2.LLLFF);
                        if (vEVideoPublishPreviewScene2.LLJL.getNleModel() != null) {
                            vEVideoPublishPreviewScene2.LLJLIL.LJIIIIZZ(vEVideoPublishPreviewScene2.LLJL.getNleModel());
                        }
                        if (vEVideoPublishPreviewScene2.getWindow() != null) {
                            vEVideoPublishPreviewScene2.getWindow().clearFlags(1024);
                        }
                        vEVideoPublishPreviewScene2.LLLLZLLIL(false);
                    }
                });
                vEVideoPublishPreviewScene.LLJLIL.LJIIIZ.cg(new InterfaceC1464120oCg() { // from class: X.0o8r
                    @Override // X.InterfaceC1464120oCg
                    public final void LIZ(int i) {
                        VEVideoPublishPreviewScene vEVideoPublishPreviewScene2 = vEVideoPublishPreviewScene;
                        if (vEVideoPublishPreviewScene2.LLJZ.getVisibility() == 0) {
                            vEVideoPublishPreviewScene2.LLJZ.setProgress(i / vEVideoPublishPreviewScene2.LLJLIL.LJIIIZ.getDuration());
                        }
                    }
                });
                C786410Ut5.LJZL(8, vEVideoPublishPreviewScene.LLLJIL);
                C786410Ut5.LJZ(8, vEVideoPublishPreviewScene.LLLFF);
                FrameLayout frameLayout3 = vEVideoPublishPreviewScene.LLLLJI;
                if (frameLayout3 != null) {
                    C786410Ut5.LJZ(8, frameLayout3);
                }
                if (vEVideoPublishPreviewScene.getWindow() != null) {
                    vEVideoPublishPreviewScene.getWindow().setFlags(1024, 1024);
                }
                FrameLayout.LayoutParams layoutParamsLLLLZIL = vEVideoPublishPreviewScene.LLLLZIL();
                if (layoutParamsLLLLZIL != null) {
                    layoutParamsLLLLZIL.topMargin = (vEVideoPublishPreviewScene.LLLILZ.getHeight() - vEVideoPublishPreviewScene.LLJLILLLLZIIL.getHeight()) / 2;
                    C786410Ut5.U5(vEVideoPublishPreviewScene.LLJLILLLLZIIL, layoutParamsLLLLZIL);
                }
                C0FFA c0ffa = C0FFA.LIZ;
                SurfaceView surfaceView = vEVideoPublishPreviewScene.LLJLILLLLZIIL;
                NLEModel nleModel = vEVideoPublishPreviewScene.LLJL.getNleModel();
                boolean zHf = vEVideoPublishPreviewScene.LLJLIL.LJIIIZ.Hf();
                c0ffa.getClass();
                if (surfaceView != null && nleModel != null && C0FFA.LJFF(nleModel) && (nLEModelDynamicCast = NLEModel.dynamicCast(nleModel.deepClone())) != null && (mainTrack = nLEModelDynamicCast.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && slots.size() == 1 && u4.LJJJLIIL((NLETrackSlot) ListProtector.get(slots, 0)) && (pairLJ = C0FFA.LJ((nLETrackSlot = (NLETrackSlot) ListProtector.get(slots, 0)))) != null && ((Number) pairLJ.getFirst()).floatValue() != 0.0f && ((Number) pairLJ.getSecond()).floatValue() != 0.0f) {
                    float f = zHf ? -90.0f : 90.0f;
                    float fFloatValue = ((Number) pairLJ.getFirst()).floatValue() / ((Number) pairLJ.getSecond()).floatValue();
                    nLETrackSlot.setScale(fFloatValue);
                    nLETrackSlot.setRotation(f);
                    RectF rectFLIZLLL = C0FFA.LIZLLL(surfaceView);
                    float fWidth = rectFLIZLLL.width() / rectFLIZLLL.height();
                    VecNLETrackSPtr tracks = nLEModelDynamicCast.getTracks();
                    if (tracks != null) {
                        for (NLETrack nLETrack : tracks) {
                            if (C351220Dpo.LLLIZZ(nLETrack) && !nLETrack.getMainTrack()) {
                                for (NLETrackSlot nLETrackSlot2 : nLETrack.getSlots()) {
                                    nLETrackSlot2.setRotation(nLETrackSlot2.getRotation() - 90.0f);
                                    nLETrackSlot2.setScale(nLETrackSlot2.getScale() * fFloatValue);
                                    float transformX = nLETrackSlot2.getTransformX();
                                    nLETrackSlot2.setTransformX((nLETrackSlot2.getTransformY() * fFloatValue) / fWidth);
                                    nLETrackSlot2.setTransformY((-transformX) * fFloatValue * fWidth);
                                }
                            }
                        }
                    }
                    vEVideoPublishPreviewScene.LLJLIL.LJIIIIZZ(nLEModelDynamicCast);
                }
                vEVideoPublishPreviewScene.LLLLZLLIL(true);
                C823050WQl.LIZLLL().execute(new ARunnableS122S0100000_22(vEVideoPublishPreviewScene, 44));
            }
        });
        FrameLayout.LayoutParams layoutParamsLJ = c0.LIZ.LJ(9, 16);
        this.LLLLLL = layoutParamsLJ;
        C120A c120a2 = this.LLJLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c120a2);
        c120a2.setLayoutParams(layoutParamsLJ);
        C194331111d c194331111d2 = this.LLJZIJLIL;
        FrameLayout.LayoutParams layoutParams = this.LLLLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c194331111d2);
        c194331111d2.setLayoutParams(layoutParams);
        ImageView imageView2 = (ImageView) findViewById(R.id.video_publish_preview_img);
        this.LLJJLIIIJLLLLLLLZ = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = VideoCoverBitmapHolder.LL;
        if (bitmap != null) {
            this.LLJJLIIIJLLLLLLLZ.setImageBitmap(bitmap);
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "preview_cover_flash_opt", true, false)) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                ImageView imageView3 = this.LLJJLIIIJLLLLLLLZ;
                float screenWidth = ScreenUtils.getScreenWidth(requireActivity());
                float f = height;
                float f2 = width;
                float f3 = ((f * 1.0f) / f2) * screenWidth;
                float screenHeight = ScreenUtils.getScreenHeight(requireActivity());
                if (f3 > screenHeight) {
                    screenWidth = screenHeight * ((f2 * 1.0f) / f);
                    f3 = screenHeight;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = (int) screenWidth;
                    layoutParams2.height = (int) f3;
                    layoutParams2.gravity = 17;
                    C786410Ut5.W5(imageView3, layoutParams2);
                }
            }
        }
        this.LLJJLIIIJLLLLLLLZ.setTransitionName("transition_name_thumbnail");
        this.LLLJL.setTransitionName("transition_name_choose_cover");
        this.LLJLILLLLZIIL = (SurfaceView) findViewById(R.id.rsa);
        C1428470nHB.LJJIL(this.LLJL);
        C786410Ut5.LLIIII(this.LLJLILLLLZIIL, 4);
        C786410Ut5.O7(this.LLLILZ, new ACListenerS156S0100000_22(this, 25));
        C197039127h c197039127h7 = (C197039127h) findViewById(R.id.sgh);
        this.LLLJ = c197039127h7;
        if (c197039127h7 != null) {
            c197039127h7.setBackgroundRadius(200);
        }
        if (C1447250nlT.LIZIZ() && (c197039127h = this.LLLJ) != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
            C786410Ut5.U8(this.LLLJ, new ACListenerS149S0100000_14(this, 48));
        }
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi(IAVPublishPageUIRefactorService.class);
        if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableRefactorPublishIcon()) {
            this.LLLJL.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_up_circle_fill));
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: X.0nct
            /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
            @Override // androidx.lifecycle.LifecycleEventObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner r14, androidx.lifecycle.Lifecycle.Event r15) {
                /*
                    Method dump skipped, instruction units count: 545
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1441930nct.onStateChanged(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS271S0100000_22(this, 1));
        valueAnimatorOfFloat.addListener(new AAListenerS333S0100000_22(this, 1));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.start();
        this.LLLIIL = String.valueOf(System.currentTimeMillis() / 1000);
        this.LLLIILIL = System.currentTimeMillis();
        this.mActivity.getWindow().addFlags(128);
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
        if (((Number) C275510Aqz.LIZ.getValue()).intValue() == 2 && interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.ac(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
        C11VU.LIZIZ(13.0f, requireActivity());
        int iLIZIZ = (int) C11VU.LIZIZ(3.0f, requireActivity());
        FrameLayout frameLayout = this.LLLFF;
        if (frameLayout != null) {
            LLLLLZL(iLIZIZ, frameLayout, true);
        }
        ImageView imageView = this.LLLFZ;
        if (imageView != null) {
            LLLLLZL(iLIZIZ, imageView, true);
        }
        View view = this.LLLILZJ;
        if (view != null) {
            LLLLLZL(0, view, false);
        }
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        LLLLLLZ(false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLIZZ = C1447800nmM.LIZ(this);
        C1447800nmM.LIZIZ(this).LLLIILIL(this, new C1466910oHB(this, 2));
    }

    public final void LLLLLZL(int i, View view, boolean z) {
        int statusBarHeight = ScreenUtils.getStatusBarHeight(requireActivity());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            i += statusBarHeight;
        }
        layoutParams.topMargin = i;
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4 && intent != null) {
            setResult(i2, intent);
            LLLLLLZ(false);
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.kk, viewGroup, false);
    }

    public VEVideoPublishPreviewScene(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, Integer num, int i, String str2, Function0<Void> function0) {
        this.LLJJL = true;
        this.LLLLIL = true;
        this.LLLLLIL = new ArrayList();
        this.LLLLLILLIL = new ArrayList();
        this.LLLLLLJ = new C1664680tQA<>(new C194335111h());
        this.LLLLLLLLLL = false;
        this.LLLLLLLZIL = false;
        this.LLLLLLZ = null;
        this.LLLLLLZZ = false;
        this.LLLLLZIL = null;
        this.LLLLLZL = null;
        this.LLLIIIL = str2;
        this.LLLIIIIL = i;
        this.LLJL = videoPublishEditModel;
        this.LLLI = str;
        this.LLLII = urlModel;
        this.LLLIIII = num;
        this.LLLLII = function0;
        this.LLJJL = false;
    }
}
