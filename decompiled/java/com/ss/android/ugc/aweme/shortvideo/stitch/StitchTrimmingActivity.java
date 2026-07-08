package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.AbstractActivityC1674880tgc;
import X.C0CHQ;
import X.C0LAB;
import X.C0MBA;
import X.C0MNM;
import X.C0MUK;
import X.C1173000gd8;
import X.C12ES;
import X.C1308910kAL;
import X.C1440005kM;
import X.C1443560nfW;
import X.C14D2;
import X.C1659650tI3;
import X.C1660610tJb;
import X.C1697810uHb;
import X.C19768712Wf;
import X.C201955140j;
import X.C20684815ws;
import X.C214873197f;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C537520L6g;
import X.C560350LyL;
import X.C560380LyO;
import X.C560470LyX;
import X.C569220MUe;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC560450LyV;
import X.InterfaceC214877197j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS18S0002000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StitchTrimmingActivity extends AbstractActivityC1674880tgc {
    public static boolean LLJIJIL = true;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoHELIOSLCB9OzElPSw7ZhY4IDswIBE+ICI+ISsrCCwnITMlPTY=";
    public C19768712Wf LLIZ;
    public CutVideoViewModel LLIZLLLIL;
    public CreativeInfo LLJ;
    public DuetAndStitchRouterConfig LLJI;

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZIL(boolean z) {
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZ() {
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        if (cutVideoViewModel == null || cutVideoViewModel.mR2()) {
            return;
        }
        C19768712Wf c19768712Wf = this.LLIZ;
        if (c19768712Wf == null) {
            c19768712Wf = null;
        }
        CutVideoViewModel cutVideoViewModel2 = c19768712Wf.LLJJIJIL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        if (cutVideoViewModel2.mR2()) {
            return;
        }
        VideoEditViewModel videoEditViewModel = c19768712Wf.LLJJJJ;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        int i = ((VideoSegment) ListProtector.get(videoEditViewModel.zQ2(), 0)).width;
        VideoEditViewModel videoEditViewModel2 = c19768712Wf.LLJJJJ;
        if (videoEditViewModel2 == null) {
            videoEditViewModel2 = null;
        }
        int iMin = Math.min(i, ((VideoSegment) ListProtector.get(videoEditViewModel2.zQ2(), 0)).height);
        VideoEditViewModel videoEditViewModel3 = c19768712Wf.LLJJJJ;
        if (videoEditViewModel3 == null) {
            videoEditViewModel3 = null;
        }
        int i2 = ((VideoSegment) ListProtector.get(videoEditViewModel3.zQ2(), 0)).width;
        VideoEditViewModel videoEditViewModel4 = c19768712Wf.LLJJJJ;
        if (videoEditViewModel4 == null) {
            videoEditViewModel4 = null;
        }
        int iMax = Math.max(i2, ((VideoSegment) ListProtector.get(videoEditViewModel4.zQ2(), 0)).height);
        CutVideoPreviewViewModel cutVideoPreviewViewModel = c19768712Wf.LLJJJ;
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = cutVideoPreviewViewModel != null ? cutVideoPreviewViewModel : null;
        cutVideoPreviewViewModel2.getClass();
        cutVideoPreviewViewModel2.setState(new AwS18S0002000_29(iMin, iMax, 3));
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "StitchTrimmingActivity onDestroy");
        C560380LyO.LIZ.getClass();
        if (!C560380LyO.LIZLLL) {
            C560350LyL c560350LyL = C560380LyO.LJIILIIL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.NONE, jCurrentTimeMillis));
            C560380LyO.LJIIJJI(c560350LyL.LJIIJ, jCurrentTimeMillis, c560350LyL.LJIIIIZZ, "close_video_shoot_page");
            C560380LyO.LIZ();
        }
        super.onDestroy();
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        StitchParams stitchParams;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", true);
        super.onResume();
        long jCurrentTimeMillis = 0;
        if (LLJIJIL && (stitchParams = (StitchParams) getIntent().getParcelableExtra("stitch_params")) != null) {
            long clickStitchTime = stitchParams.getClickStitchTime();
            if (clickStitchTime > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - clickStitchTime;
            }
        }
        CreativeInfo creativeInfo = this.LLJ;
        if (creativeInfo == null) {
            creativeInfo = null;
        }
        String creationId = creativeInfo.getCreationId();
        boolean z = LLJIJIL;
        C0MNM c0mnm = C0MNM.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", "stitch");
        c0lab.LJ("enter_from", "video_stitch_page");
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", "video");
        c0lab.LJ("enter_method", z ? "normal" : "back");
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("enter_video_stitch_page", c0lab.LIZ);
        LLJIJIL = false;
        C1440005kM.LIZ(new C0MBA());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
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

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLLZLLLI(boolean z) {
        int iLIZJ;
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        int iLIZJ2 = 0;
        if (cutVideoViewModel != null && !cutVideoViewModel.mR2()) {
            C19768712Wf c19768712Wf = this.LLIZ;
            CutVideoViewModel cutVideoViewModel2 = null;
            if (c19768712Wf == null) {
                c19768712Wf = null;
            }
            CutVideoViewModel cutVideoViewModel3 = c19768712Wf.LLJJIJIL;
            if (cutVideoViewModel3 != null) {
                cutVideoViewModel2 = cutVideoViewModel3;
            }
            if (!cutVideoViewModel2.mR2()) {
                C1173000gd8 c1173000gd8LLLLIILL = c19768712Wf.LLLLIILL();
                c1173000gd8LLLLIILL.getClass();
                int iP2 = C1660610tJb.LIZ.p2();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((Scene) c1173000gd8LLLLIILL.LLJJJ.getValue()).mView.getLayoutParams();
                if (z) {
                    iLIZJ = iP2;
                } else {
                    iLIZJ = (int) C12ES.LIZJ(132.0f, c1173000gd8LLLLIILL.mActivity);
                }
                marginLayoutParams.height = iLIZJ;
                C786410Ut5.W5(((Scene) c1173000gd8LLLLIILL.LLJJJ.getValue()).mView, marginLayoutParams);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c1173000gd8LLLLIILL.LLLLIILL().mView.getLayoutParams();
                if (z) {
                    iLIZJ2 = (int) (C12ES.LIZJ(5.5f, c1173000gd8LLLLIILL.mActivity) + iP2);
                }
                marginLayoutParams2.bottomMargin = iLIZJ2;
                C786410Ut5.W5(c1173000gd8LLLLIILL.LLLLIILL().mView, marginLayoutParams2);
            }
        }
    }

    @Override // X.AbstractActivityC1674880tgc, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CutVideoViewModel cutVideoViewModel;
        Workspace workspaceLIZ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", true);
        super.onCreate(bundle);
        C0CHQ.LIZ().LJJIZ();
        setContentView(R.layout.ik);
        if (!getIntent().hasExtra("stitch_params")) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
            return;
        }
        this.LLJ = C537520L6g.LIZ(getIntent());
        this.LLJI = (DuetAndStitchRouterConfig) getIntent().getParcelableExtra("duet_and_stitch_router_config");
        this.LLIZLLLIL = (CutVideoViewModel) C1659650tI3.LIZ(this).LIZ(CutVideoViewModel.class);
        C569220MUe c569220MUe = new C569220MUe();
        StitchParams stitchParams = (StitchParams) getIntent().getParcelableExtra("stitch_params");
        CutVideoViewModel cutVideoViewModel2 = null;
        if (stitchParams != null) {
            c569220MUe.LJIILLIIL = C537520L6g.LIZ(getIntent());
            CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(getIntent());
            c569220MUe.LJIIZILJ = creativeModelLIZIZ;
            creativeModelLIZIZ.initialModel.duetAndStitchRouterConfig = this.LLJI;
            FollowUpPublishTrackerModel followUpPublishTrackerModel = creativeModelLIZIZ.followUpPublishTrackerModel;
            followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
            followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
            followUpPublishTrackerModel.enterRecordFromFeed = stitchParams.getEnterRecordFromFeed();
            c569220MUe.LJJIFFI = stitchParams;
            String videoPath = stitchParams.getVideoPath();
            if (TextUtils.isEmpty(videoPath)) {
                finish();
            } else {
                ArrayList<MediaModel> arrayList = new ArrayList<>();
                MediaModel mediaModel = new MediaModel(1L);
                mediaModel.LJIILL(videoPath);
                arrayList.add(mediaModel);
                c569220MUe.LIZ = arrayList;
                c569220MUe.LIZJ = true;
                getIntent().getLongExtra("min_duration", 3000L);
                if (bundle == null) {
                    CreativeInfo creativeInfo = this.LLJ;
                    if (creativeInfo == null) {
                        creativeInfo = null;
                    }
                    workspaceLIZ = C14D2.LIZ(creativeInfo);
                } else {
                    workspaceLIZ = (Workspace) bundle.getParcelable("workspace");
                }
                c569220MUe.LJIIIIZZ = workspaceLIZ;
                c569220MUe.LJIIZILJ.followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
                CutVideoViewModel cutVideoViewModel3 = this.LLIZLLLIL;
                if (cutVideoViewModel3 == null) {
                    cutVideoViewModel3 = null;
                }
                cutVideoViewModel3.LLILZIL = c569220MUe;
                C201955140j.LJ("cutVideoModel initialized");
            }
        }
        CreativeInfo creativeInfo2 = this.LLJ;
        if (creativeInfo2 == null) {
            creativeInfo2 = null;
        }
        this.LLIZ = new C19768712Wf(creativeInfo2);
        C214873197f c214873197f = new C214873197f(this, C19768712Wf.class);
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0MB9
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                C19768712Wf c19768712Wf;
                if (!Intrinsics.LJFF(C19768712Wf.class.getName(), str) || (c19768712Wf = this.LIZ.LLIZ) == null) {
                    return null;
                }
                return c19768712Wf;
            }
        };
        c214873197f.LIZLLL = false;
        c214873197f.LJ = false;
        c214873197f.LJFF = R.id.tp8;
        c214873197f.LIZ();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "StitchTrimmingActivity onCreate");
        C560380LyO c560380LyO = C560380LyO.LIZ;
        Lifecycle lifecycle = getLifecycle();
        c560380LyO.getClass();
        C560380LyO.LIZIZ(lifecycle, false);
        CreativeInfo creativeInfo3 = this.LLJ;
        if (creativeInfo3 == null) {
            creativeInfo3 = null;
        }
        String creationId = creativeInfo3.getCreationId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterStitchTrimming: creationId = ");
        sbLIZ.append(creationId);
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C560350LyL c560350LyL = C560380LyO.LJIILIIL;
        c560350LyL.LJIIIIZZ = "shoot";
        c560350LyL.LJIIJ = jCurrentTimeMillis;
        c560350LyL.LIZ = creationId;
        c560350LyL.LIZIZ = "stitch";
        c560350LyL.LJ = false;
        C560380LyO.LJFF = true;
        C560380LyO.LIZJ = true;
        C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.OTHERS, jCurrentTimeMillis));
        CutVideoViewModel cutVideoViewModel4 = this.LLIZLLLIL;
        if (cutVideoViewModel4 == null) {
            cutVideoViewModel = null;
        } else {
            cutVideoViewModel = cutVideoViewModel4;
        }
        if (cutVideoViewModel.LLILZIL != null) {
            if (cutVideoViewModel4 != null) {
                cutVideoViewModel2 = cutVideoViewModel4;
            }
            if (cutVideoViewModel2.mR2()) {
                this.LLILLL = false;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        CutVideoViewModel cutVideoViewModel2 = null;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.LLILZIL != null && cutVideoViewModel.lR2().LJIIIIZZ != null) {
            CutVideoViewModel cutVideoViewModel3 = this.LLIZLLLIL;
            if (cutVideoViewModel3 != null) {
                cutVideoViewModel2 = cutVideoViewModel3;
            }
            C786410Ut5.LJJIJL(bundle, "workspace", cutVideoViewModel2.lR2().LJIIIIZZ);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            finish();
        }
    }
}
