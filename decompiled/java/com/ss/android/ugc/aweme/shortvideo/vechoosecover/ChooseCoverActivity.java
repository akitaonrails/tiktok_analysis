package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import X.ActivityC214874197g;
import X.AnimationAnimationListenerC1466590oGf;
import X.C0GZU;
import X.C0IKQ;
import X.C0LAB;
import X.C0MUK;
import X.C0WZX;
import X.C1088800eRK;
import X.C122T;
import X.C1308910kAL;
import X.C1428470nHB;
import X.C1429320nIY;
import X.C1432210nND;
import X.C1440480naY;
import X.C1441830ncj;
import X.C1443400nfG;
import X.C1443990ngD;
import X.C1447150nlJ;
import X.C1447250nlT;
import X.C1447370nlf;
import X.C1452730nuJ;
import X.C1453180nv2;
import X.C1465030oE9;
import X.C1697810uHb;
import X.C19565911gn;
import X.C196925122x;
import X.C19712912At;
import X.C19726612Ga;
import X.C1AF0;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2341909Fp;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C889340Yui;
import X.EnumC335920DEw;
import X.InterfaceC1447120nlG;
import X.InterfaceC1447480nlq;
import X.InterfaceC1452170ntP;
import X.InterfaceC1464120oCg;
import X.InterfaceC2342209Fs;
import Y.AObjectS365S0100000_22;
import Y.AObjectS396S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.R;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishSecureModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import joo.f;

/* JADX INFO: loaded from: classes23.dex */
public class ChooseCoverActivity extends ActivityC214874197g implements InterfaceC1447120nlG, InterfaceC1447480nlq {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCHELIOSB9PiAvISA8OyAvJjk2OmsPISA8OyAPJjk2OgQvPSYlITE1";
    public VideoPublishEditModel LL;
    public C1441830ncj LLILLJJLI;
    public VEChooseVideoCoverFragment LLILLL;
    public SurfaceView LLILZ;
    public C19726612Ga LLILZIL;
    public View LLILZLL;
    public ImageView LLIZ;
    public C1088800eRK LLIZLLLIL;
    public FrameLayout LLJ;
    public InfoStickerModel LLJILJIL;
    public SafeHandler LLJJI;
    public Bitmap LLJJIJIIJIL;
    public Bitmap LLJJIJIL;
    public Matrix LLJJJJ;
    public Matrix LLJJJJJIL;
    public C1447370nlf LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<Bitmap> LLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJIJIL = new MutableLiveData<>();
    public final List<TextStickerData> LLJILJILJ = new ArrayList();
    public final List<C196925122x> LLJILLL = new ArrayList();
    public volatile boolean LLJJ = false;
    public String LLJJIII = "";
    public MediaModel LLJJIJI = null;
    public volatile boolean LLJJJ = true;
    public Rect LLJJJIL = null;
    public String LLJJJJLIIL = "by_default";
    public boolean LLJJL = false;
    public boolean LLJL = false;
    public final MutableLiveData<C1452730nuJ> LLJLIL = new MutableLiveData<>();

    public final Bitmap LLLZZIL() {
        int width;
        int height;
        Bitmap bitmapCreateBitmap = null;
        try {
            width = this.LLILZIL.getWidth();
            height = this.LLILZIL.getHeight();
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.printStackTrace();
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1AF0.LJFF(e3, "getPreviewBitmap");
            return bitmapCreateBitmap;
        }
        if (width <= 0 || height <= 0) {
            return null;
        }
        bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.LLILZIL.getImageMatrix());
        Drawable drawableLLZ = LLZ();
        if (drawableLLZ != null) {
            drawableLLZ.draw(canvas);
        }
        if (C889340Yui.LIZ()) {
            LLLZIL(canvas);
            return bitmapCreateBitmap;
        }
        return bitmapCreateBitmap;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1447120nlG
    public final InterfaceC1452170ntP LLFII() {
        C1441830ncj c1441830ncj = this.LLILLJJLI;
        if (c1441830ncj != null) {
            return c1441830ncj.LJIIIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1447120nlG
    public final void LLJJJJJIL() {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        CoverPublishModel coverPublishModel2 = this.LL.getCreativeModel().coverPublishModel;
        if ((coverPublishModel2 != null ? coverPublishModel2.getCoverFromLocalPath() : "").equals("fake_path_for_screen_34") && this.LLILLL != null && ((videoPublishEditModel = this.LL) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (coverPublishModel = creativeModel.coverPublishModel) == null || !coverPublishModel.isCoverFromUrl())) {
            this.LLILLL.MR();
        }
        if (!C1429320nIY.LIZJ(this.LL) || this.LLJJIJIIJIL == null) {
            InterfaceC1452170ntP interfaceC1452170ntPLLFII = LLFII();
            if (interfaceC1452170ntPLLFII == null) {
                if (this.LLJJI == null) {
                    this.LLJJI = new SafeHandler(this);
                }
                this.LLJJI.postDelayed(new ARunnableS122S0100000_22(this, 105), 50L);
                return;
            }
            Bitmap currDisplayImage = interfaceC1452170ntPLLFII.getCurrDisplayImage();
            if (currDisplayImage != null) {
                a(currDisplayImage);
                return;
            }
            if (this.LLJJI == null) {
                this.LLJJI = new SafeHandler(this);
            }
            this.LLJJI.postDelayed(new ARunnableS122S0100000_22(this, 105), 50L);
        }
    }

    @Override // X.InterfaceC1447480nlq
    public final void LLLIIII() {
        runOnUiThread(new ARunnableS122S0100000_22(this, 106));
    }

    public final Drawable LLZ() {
        Bitmap bitmapLJ;
        C19726612Ga c19726612Ga = this.LLILZIL;
        if (c19726612Ga == null) {
            return null;
        }
        if (c19726612Ga.getDrawable() != null) {
            return this.LLILZIL.getDrawable();
        }
        if (!C1443400nfG.LJIILIIL(this.LL) || (bitmapLJ = C1443400nfG.LJ(this.LL.creativeModel.coverPublishModel.getCoverFromLocalPath())) == null) {
            return null;
        }
        this.LLILZIL.setImageBitmap(bitmapLJ);
        return this.LLILZIL.getDrawable();
    }

    public final void LLZZLLIL() {
        if (this.LLJJJJJIL == null || this.LLJJIJIIJIL == null) {
            return;
        }
        this.LLILZIL.LJIIJ();
        this.LLILZIL.setPreviewAreaOutMatrix(this.LLJJJJJIL);
        C786410Ut5.O0(this.LLILZIL);
        this.LLILZIL.setImageBitmap(this.LLJJIJIIJIL);
        if (C1447250nlT.LIZLLL()) {
            LLZZZIL(this.LLJJIJIL);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this.LLILLL;
        if (vEChooseVideoCoverFragment != null) {
            vEChooseVideoCoverFragment.WR(new AObjectS365S0100000_22(this, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167 A[PHI: r0
      0x0167: PHI (r0v25 android.graphics.Bitmap) = (r0v24 android.graphics.Bitmap), (r0v40 android.graphics.Bitmap) binds: [B:65:0x014e, B:71:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01af  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity.onResume():void");
    }

    static {
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
    }

    public final Bitmap LLLZLZ() {
        Rect rect;
        int i = 0;
        if (C889340Yui.LIZ()) {
            Bitmap bitmapLLLZZIL = LLLZZIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPreviewBitmapByDisplaySize: supportScreenChange=");
            sbLIZ.append(C1447250nlT.LIZ());
            sbLIZ.append(", mergedPreviewNull=");
            sbLIZ.append(bitmapLLLZZIL == null);
            sbLIZ.append(", hasDisplayRect=");
            sbLIZ.append(this.LLJJJIL != null);
            C201955140j.LIZIZ("cover_debug", C2188811AlT.LIZIZ(sbLIZ));
            if (C1447250nlT.LIZ() && bitmapLLLZZIL != null && (rect = this.LLJJJIL) != null) {
                try {
                    int iMax = Math.max(0, rect.left);
                    int iMax2 = Math.max(0, this.LLJJJIL.top);
                    int iMin = Math.min(this.LLJJJIL.width(), bitmapLLLZZIL.getWidth() - iMax);
                    int iMin2 = Math.min(this.LLJJJIL.height(), bitmapLLLZZIL.getHeight() - iMax2);
                    if (iMin <= 0 || iMin2 <= 0) {
                        return bitmapLLLZZIL;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLLLZZIL, iMax, iMax2, iMin, iMin2);
                    if (bitmapCreateBitmap != bitmapLLLZZIL) {
                        bitmapLLLZZIL.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLLLZZIL);
                    }
                    return bitmapCreateBitmap;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "getPreviewBitmapByDisplaySize crop failed");
                }
            }
            return bitmapLLLZZIL;
        }
        if (!C1447250nlT.LIZ()) {
            return LLLZZIL();
        }
        Rect rect2 = this.LLJJJIL;
        if (rect2 == null) {
            return null;
        }
        C19726612Ga c19726612Ga = this.LLILZIL;
        try {
            if (rect2.width() <= 0 || rect2.height() <= 0) {
                return null;
            }
            int i2 = rect2.left;
            int i3 = rect2.top;
            int iWidth = rect2.width();
            int iHeight = rect2.height();
            if (i2 < 0 || rect2.width() + i2 > c19726612Ga.getWidth()) {
                iWidth = c19726612Ga.getWidth();
                C1AF0.LJ(new Throwable("createBitmapFromView : left < 0 or (left + rect.width()) > view.width"));
                i2 = 0;
            }
            if (i3 < 0 || rect2.height() + i3 > c19726612Ga.getHeight()) {
                iHeight = c19726612Ga.getHeight();
                C1AF0.LJ(new Throwable("createBitmapFromView : top < 0 or (top + rect.height()) > view.height"));
            } else {
                i = i3;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(c19726612Ga.getWidth(), c19726612Ga.getHeight(), Bitmap.Config.ARGB_8888);
            c19726612Ga.draw(new Canvas(bitmapCreateBitmap2));
            return Bitmap.createBitmap(bitmapCreateBitmap2, i2, i, iWidth, iHeight);
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "createBitmapFromView happen crash");
            return null;
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1AF0.LJFF(e3, "getPreviewBitmap");
            return null;
        }
    }

    public final boolean LLZLI() {
        VideoPublishEditModel videoPublishEditModel;
        if (!C1447250nlT.LIZ()) {
            if (!C1440480naY.LIZ() || (videoPublishEditModel = this.LL) == null || !(!C1428470nHB.LLIIIJ(videoPublishEditModel))) {
                return true;
            }
            if (!this.LL.hasTextSticker()) {
                if (this.LL.getInfoStickerModel() == null || C0IKQ.LIZ(this.LL.getInfoStickerModel().stickers)) {
                    return true;
                }
                Iterator<StickerItemModel> it2 = this.LL.getInfoStickerModel().stickers.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isTextSticker()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void LLZLLLL() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.LL.creativeModel.postPageModel.clickCover);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZLLL(lValueOf, "duration");
        c0lab.LJ("type", "publish_select_cover");
        c0lab.LJ("content_type", "publish_video_cover");
        c0lab.LIZ(this.LL.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0lab.LJ("enter_from", this.LL.creativeModel.postPageModel.coverEnterFrom);
        C2341909Fp.LIZ("tool_performance_publish_cover_first_frame", c0lab.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        View viewFindViewById = getWindow().getDecorView().findViewById(R.id.statusBarBackground);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, com.zhiliaoapp.musically.R.anim.a8);
        animationLoadAnimation.setFillAfter(true);
        View viewFindViewById2 = findViewById(com.zhiliaoapp.musically.R.id.mg3);
        if (viewFindViewById2 == null) {
            finish();
        } else {
            viewFindViewById2.startAnimation(animationLoadAnimation);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC1466590oGf(this, 2));
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        ((LifecycleRegistry) getLifecycle()).setCurrentState(Lifecycle.State.DESTROYED);
        if (this.LLILLJJLI != null && LLFII() != null) {
            LLFII().cancelGetVideoFrames();
            this.LLILLJJLI.LIZJ();
        }
        C1453180nv2.LJ = 0;
        C1453180nv2.LJFF = 0;
        super.onDestroy();
        f.LIZ.getClass();
        f.LIZ(this);
        C1447370nlf c1447370nlf = this.LLJJLIIIJLLLLLLLZ;
        if (c1447370nlf != null) {
            C19712912At.LIZ.LJFF(c1447370nlf);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (this.LLILLJJLI != null && LLFII() != null) {
            LLFII().If();
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1447120nlG
    public final VideoPublishEditModel LJI() {
        return this.LL;
    }

    @Override // X.InterfaceC1447120nlG
    public final MutableLiveData<C1452730nuJ> LLIIII() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1447120nlG
    public final void LLIIIZ(boolean z) throws Throwable {
        ChooseCoverBackData chooseCoverBackData;
        String str;
        String str2;
        Boolean boolValueOf;
        Intent intent = new Intent();
        if (z) {
            VideoPublishEditModel videoPublishEditModel = this.LL;
            intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) videoPublishEditModel);
            C0MUK.LJIIIZ(intent, videoPublishEditModel.creativeModel);
            C1432210nND c1432210nND = ChooseCoverBackData.Companion;
            VideoPublishEditModel videoPublishEditModel2 = this.LL;
            c1432210nND.getClass();
            if (videoPublishEditModel2 == null) {
                chooseCoverBackData = null;
            } else {
                CreativeModel creativeModel = videoPublishEditModel2.creativeModel;
                CoverPublishModel coverPublishModel = creativeModel.coverPublishModel;
                PostPageModel postPageModel = creativeModel.postPageModel;
                PublishCustomCoverModel publishCustomCoverModel = creativeModel.publishCustomCoverModel;
                PublishSecureModel publishSecureModel = creativeModel.publishSecureModel;
                String videoCoverPath = videoPublishEditModel2.getVideoCoverPath();
                MvCreateVideoData mvCreateVideoData = videoPublishEditModel2.getMvCreateVideoData();
                if (mvCreateVideoData != null) {
                    str = mvCreateVideoData.videoCoverImgPath;
                } else {
                    str = null;
                }
                MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel2.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData != null) {
                    str2 = multiEditVideoRecordData.coverImagePath;
                } else {
                    str2 = null;
                }
                CreativeModel creativeModel2 = videoPublishEditModel2.creativeModel;
                String str3 = creativeModel2.publishPreviewModel.firstFramePath;
                EditPostModel editPostModel = creativeModel2.editPostModel;
                if (editPostModel != null) {
                    boolValueOf = Boolean.valueOf(editPostModel.isChangeCover());
                } else {
                    boolValueOf = null;
                }
                chooseCoverBackData = new ChooseCoverBackData(coverPublishModel, postPageModel, publishCustomCoverModel, publishSecureModel, videoCoverPath, str, str2, str3, boolValueOf);
            }
            intent.putExtra("KEY_COVER_CHOOSE_RESULT_NEW", chooseCoverBackData);
            f.LIZ.getClass();
            f.LIZIZ(intent);
            C2204961BRm.LJIIL(-1, this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOapcZjLkiZMwmGWWQ3jzzBc9k0YSkGjdB7Rw7obGhUIB5U=", null));
        }
        finish();
    }

    public final void LLLZIL(Canvas canvas) {
        int childCount;
        FrameLayout frameLayout = this.LLJ;
        int childCount2 = 0;
        if (frameLayout == null) {
            childCount = 0;
        } else {
            childCount = frameLayout.getChildCount();
        }
        View viewFindViewById = findViewById(com.zhiliaoapp.musically.R.id.p6g);
        if (viewFindViewById instanceof ViewGroup) {
            childCount2 = ((ViewGroup) viewFindViewById).getChildCount();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("drawStickerLayers: textStickerChildCount=");
        sbLIZ.append(childCount);
        sbLIZ.append(", textCaptionStickerDataCount=");
        sbLIZ.append(((ArrayList) this.LLJILJILJ).size());
        sbLIZ.append(", newEngineChildCount=");
        sbLIZ.append(childCount2);
        C201955140j.LIZIZ("cover_debug", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout frameLayout2 = this.LLJ;
        if (frameLayout2 != null) {
            frameLayout2.draw(canvas);
        }
        if (viewFindViewById != null) {
            viewFindViewById.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZZ(boolean r5) {
        /*
            r4 = this;
            android.graphics.Bitmap r0 = r4.LLJJIJIIJIL
            if (r0 == 0) goto L5e
            java.lang.String r0 = r4.LLJJJJLIIL
            java.lang.String r2 = "upload"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L6c
            if (r5 != 0) goto L6e
            boolean r0 = X.C1447250nlT.LIZ()
            if (r0 == 0) goto L20
            X.12Ga r0 = r4.LLILZIL
            if (r0 == 0) goto L20
            android.graphics.Matrix r0 = r0.LJIIIIZZ()
            r4.LLJJJJ = r0
        L20:
            boolean r0 = X.C1447250nlT.LIZ()
            if (r0 == 0) goto L36
            X.12Ga r0 = r4.LLILZIL
            if (r0 == 0) goto L36
            r0.LJIIJ()
            android.graphics.Matrix r1 = r4.LLJJJJJIL
            if (r1 == 0) goto L36
            X.12Ga r0 = r4.LLILZIL
            r0.setPreviewAreaOutMatrix(r1)
        L36:
            r4.LLJJJJLIIL = r2
        L38:
            android.graphics.Bitmap r3 = r4.LLJJIJIIJIL
            X.12Ga r0 = r4.LLILZIL
            X.C786410Ut5.O0(r0)
            boolean r0 = X.C01NR.LIZ()
            if (r0 == 0) goto L66
            android.widget.ImageView r2 = r4.LLIZ
            Y.AObjectS316S0200000_22 r1 = new Y.AObjectS316S0200000_22
            r0 = 2
            r1.<init>(r4, r3, r0)
            X.C01NP.LIZ(r2, r3, r1)
        L50:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r4.LL
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r0 = r0.postPageModel
            java.lang.String r0 = r0.customCoverPath
            if (r0 != 0) goto L5e
            r0 = 0
            X.C1443400nfG.LJIIIZ(r1, r0)
        L5e:
            android.graphics.Bitmap r0 = r4.LLJJIJIL
            if (r0 == 0) goto L65
            r4.LLZZZIL(r0)
        L65:
            return
        L66:
            X.12Ga r0 = r4.LLILZIL
            r0.setImageBitmap(r3)
            goto L50
        L6c:
            if (r5 == 0) goto L38
        L6e:
            r4.LLJJJJLIIL = r2
            boolean r0 = X.C1447250nlT.LIZ()
            if (r0 == 0) goto L80
            X.12Ga r0 = r4.LLILZIL
            if (r0 == 0) goto L80
            android.graphics.Matrix r0 = r0.LJIIIIZZ()
            r4.LLJJJJ = r0
        L80:
            X.12Ga r0 = r4.LLILZIL
            r0.LJIIJ()
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity.LLZZ(boolean):void");
    }

    public final void LLZZZIL(Bitmap bitmap) {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this.LLILLL;
        if (vEChooseVideoCoverFragment != null && bitmap != null) {
            if (vEChooseVideoCoverFragment.LLLIIIIL) {
                vEChooseVideoCoverFragment.LLLII = "upload";
                vEChooseVideoCoverFragment.LLLIIIIL = false;
            }
            vEChooseVideoCoverFragment.LLJ.setImageBitmap(bitmap);
            vEChooseVideoCoverFragment.cS();
            C786410Ut5.LL(8, vEChooseVideoCoverFragment.LLILZ);
            C786410Ut5.LJZ(0, vEChooseVideoCoverFragment.LLIZ);
            vEChooseVideoCoverFragment.LLIZLLLIL.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.aww);
            C786410Ut5.U4(vEChooseVideoCoverFragment.LLIZLLLIL, 1.0f);
            C1447150nlJ c1447150nlJ = this.LLILLL.LLILLJJLI;
            if (c1447150nlJ.indexOfChild(c1447150nlJ.LLILZIL) != -1) {
                C0GZU c0gzu = c1447150nlJ.LLILZIL;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1447150nlJ, c0gzu);
                c1447150nlJ.removeView(c0gzu);
            }
        }
    }

    public final void a(Bitmap bitmap) {
        C19726612Ga c19726612Ga;
        C19726612Ga c19726612Ga2;
        if (!this.LLJJJJLIIL.equals("frame")) {
            if (C1447250nlT.LIZ() && (c19726612Ga2 = this.LLILZIL) != null) {
                this.LLJJJJJIL = c19726612Ga2.LJIIIIZZ();
            }
            if (C1447250nlT.LIZ() && (c19726612Ga = this.LLILZIL) != null) {
                c19726612Ga.LJIIJ();
                Matrix matrix = this.LLJJJJ;
                if (matrix != null) {
                    this.LLILZIL.setPreviewAreaOutMatrix(matrix);
                }
            }
            this.LLJJJJLIIL = "frame";
        }
        this.LLILZIL.setImageBitmap(bitmap);
        C786410Ut5.O0(this.LLILZIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270  */
    /* JADX WARN: Type inference failed for: r11v8, types: [X.0nld] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.0nlf, X.12Az] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = f.LIZ;
        getIntent();
        fVar.getClass();
        f.LJII(this, bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(com.zhiliaoapp.musically.R.style.a9t), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9u), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9v), Integer.valueOf(com.zhiliaoapp.musically.R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(com.zhiliaoapp.musically.R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9u, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9v, true);
                } else {
                    getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(com.zhiliaoapp.musically.R.style.a9y, true);
        }
    }

    public static /* synthetic */ void LLLLZLL(ChooseCoverActivity chooseCoverActivity, Boolean bool) {
        chooseCoverActivity.getClass();
        if (!bool.booleanValue()) {
            super.onBackPressed();
        }
    }

    public final void LLLZ(int i, int i2, int i3) {
        if (!this.LLJL && this.LLILLJJLI != null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.p6g);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
            layoutParams.setMarginStart((ScreenUtils.getScreenWidth(this) - i2) / 2);
            layoutParams.topMargin = i;
            C1465030oE9 c1465030oE9 = C1465030oE9.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LL;
            AObjectS396S0100000_22 aObjectS396S0100000_22 = new AObjectS396S0100000_22(this, 14);
            AObjectS396S0100000_22 aObjectS396S0100000_222 = new AObjectS396S0100000_22(this, 15);
            c1465030oE9.getClass();
            C1465030oE9.LIZLLL(i2 / ScreenUtils.getScreenWidth(this), null, layoutParams, frameLayout, this, this, videoPublishEditModel, "video_post_page_choose_cover_page", aObjectS396S0100000_22, aObjectS396S0100000_222, null);
            this.LLJL = true;
        }
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        MediaModel mediaModel;
        String strLJFF;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 10006 && intent != null && C1447250nlT.LIZLLL() && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && parcelableArrayListExtra.size() > 0 && (strLJFF = (mediaModel = (MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF()) != null && mediaModel != null) {
            this.LLJJIII = strLJFF;
            this.LLJJIJI = mediaModel;
            Bitmap bitmapLJ = C1443400nfG.LJ(strLJFF);
            if (bitmapLJ == null) {
                return;
            }
            this.LLJJIJIIJIL = bitmapLJ;
            if (C1447250nlT.LIZLLL()) {
                this.LLJJIJIL = bitmapLJ;
            }
            VideoPublishEditModel videoPublishEditModel = this.LL;
            if (videoPublishEditModel != null) {
                videoPublishEditModel.creativeModel.coverPublishModel.setCoverFromLocalPath(strLJFF);
            }
            LLZZ(true);
            VideoPublishEditModel videoPublishEditModel2 = this.LL;
            if (videoPublishEditModel2 != null) {
                videoPublishEditModel2.creativeModel.publishCustomCoverModel.isCoverUpload = 1;
            }
            C1443990ngD c1443990ngD = C1443990ngD.LIZ;
            float width = bitmapLJ.getWidth() / bitmapLJ.getHeight();
            float fAbs = Math.abs(width - 1.7777778f);
            float fAbs2 = Math.abs(width - 1.3333334f);
            float fAbs3 = Math.abs(width - 1.0f);
            float fAbs4 = Math.abs(width - 0.75f);
            if (fAbs < 0.1d) {
                str = "16:9";
            } else if (fAbs2 < 0.1d) {
                str = "4:3";
            } else if (fAbs3 < 0.1d) {
                str = "1:1";
            } else if (fAbs4 < 0.1d) {
                str = "3:4";
            } else {
                str = "9:16";
            }
            c1443990ngD.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModel2.getCreationId());
            c0lab.LJ("enter_from", "edit_cover_page");
            c0lab.LJ("shoot_way", videoPublishEditModel2.mShootWay);
            c0lab.LJ("picture_size", str);
            C20684815ws.LJIILLIIL("choose_upload_cover_content", c0lab.LIZ);
        }
    }

    public final void LLLLZLLLI(final int i, final int i2, final int i3, final int i4) {
        VideoPublishEditModel videoPublishEditModel = this.LL;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null && C1440480naY.LIZ() && C1428470nHB.LJLJI(this.LL) && this.LLILLJJLI != null) {
            this.LLJJI = new SafeHandler(this);
            this.LLJ = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.xle);
            this.LLILLJJLI.LJIIIZ.cg(new InterfaceC1464120oCg() { // from class: X.0nla
                @Override // X.InterfaceC1464120oCg
                public final void LIZ(int i5) {
                    ChooseCoverActivity chooseCoverActivity = this.LIZ;
                    int i6 = i;
                    int i7 = i3;
                    int i8 = i2;
                    int i9 = i4;
                    for (TextStickerData textStickerData : (ArrayList) chooseCoverActivity.LLJILJILJ) {
                        if (i5 >= textStickerData.getStartTime() && i5 <= textStickerData.getEndTime() && !textStickerData.getAddToLayoutInPreviewOrCover()) {
                            C196925122x c196925122x = new C196925122x(chooseCoverActivity, chooseCoverActivity.LLJJI, textStickerData, false, new C124G() { // from class: X.0nli
                                @Override // X.C124G
                                public final boolean LIZ() {
                                    return false;
                                }
                            }, Boolean.FALSE);
                            int left = chooseCoverActivity.LLILZ.getLeft() + i6 + (i7 / 2);
                            int top = chooseCoverActivity.LLILZ.getTop() + i8 + (i9 / 2);
                            float fMax = Math.max(i7 / textStickerData.getLayoutWidth(), i9 / textStickerData.getLayoutHeight());
                            int layoutWidth = (int) (left - (textStickerData.getLayoutWidth() / 2.0f));
                            int layoutHeight = (int) (top - (textStickerData.getLayoutHeight() / 2.0f));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) textStickerData.getLayoutWidth(), (int) textStickerData.getLayoutHeight());
                            marginLayoutParams.setMarginStart(layoutWidth);
                            marginLayoutParams.topMargin = layoutHeight;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196925122x);
                            c196925122x.setScaleX(fMax);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196925122x);
                            c196925122x.setScaleY(fMax);
                            chooseCoverActivity.LLJ.addView(c196925122x, marginLayoutParams);
                            ((ArrayList) chooseCoverActivity.LLJILLL).add(c196925122x);
                            textStickerData.setAddToLayoutInPreviewOrCover(true);
                        }
                        for (C196925122x c196925122x2 : (ArrayList) chooseCoverActivity.LLJILLL) {
                            c196925122x2.setPlayPosition(i5);
                            c196925122x2.LJJII();
                        }
                    }
                }
            });
        }
    }
}
