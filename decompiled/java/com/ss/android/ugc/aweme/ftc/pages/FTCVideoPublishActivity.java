package com.ss.android.ugc.aweme.ftc.pages;

import X.ActivityC214874197g;
import X.C086I;
import X.C0I7D;
import X.C0MUK;
import X.C0MWH;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C1428470nHB;
import X.C1436370nTv;
import X.C1438710nXh;
import X.C1697810uHb;
import X.C1886700zCG;
import X.C19EH;
import X.C19M4;
import X.C201955140j;
import X.C299020Bno;
import X.C335910DEv;
import X.C537520L6g;
import X.C569390MUv;
import X.C569770MWh;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC569430MUz;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import java.io.Serializable;
import java.util.List;
import joo.f;

/* JADX INFO: loaded from: classes9.dex */
public final class FTCVideoPublishActivity extends ActivityC214874197g {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM4KmEjHELIOSKSIpOmEVHAYaICs2JxU5KyM6Oy0NKjs6Piw4MA==";
    public C19M4 LL;
    public C0I7D LLILLJJLI;
    public VideoPublishEditModel LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C569770MWh.LIZ(1, this);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        FTCVideoPublishFragment fTCVideoPublishFragment;
        VideoPublishEditModel videoPublishEditModel;
        Bundle extras;
        if (getIntent().getIntExtra("fromDraft", 0) != 1) {
            super.onBackPressed();
            return;
        }
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiv);
        Bundle extras2 = null;
        if (!(fragmentLJJJJZ instanceof FTCVideoPublishFragment) || (fTCVideoPublishFragment = (FTCVideoPublishFragment) fragmentLJJJJZ) == null || (videoPublishEditModel = fTCVideoPublishFragment.LLILZIL) == null) {
            throw new IllegalStateException("Empty VideoPublishEditModel in FTC Publish Page.");
        }
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, videoPublishEditModel.creativeModel);
        intent.putExtra("draft_to_edit_from", this.LLILZIL);
        intent.putExtra("workspace", C1436370nTv.LIZ(videoPublishEditModel));
        C537520L6g.LIZLLL(intent, videoPublishEditModel.getCreativeInfo());
        intent.putExtra("camera", videoPublishEditModel.getCameraPosition());
        intent.putExtra("extra_av_camera_ids", videoPublishEditModel.getCameraIds());
        intent.putExtra("music_start", videoPublishEditModel.getMMusicStart());
        intent.putExtra("extra_music_end", videoPublishEditModel.getMMusicEnd());
        intent.putExtra("video_segment", videoPublishEditModel.getVideoSegmentsDesc());
        intent.putExtra("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        intent.putExtra("content_source", (videoPublishEditModel.getFromCut() || videoPublishEditModel.getFromMultiCut() || videoPublishEditModel.isMvThemeVideoType()) ? "upload" : "shoot");
        intent.putExtra("hard_encode", videoPublishEditModel.getHardEncode());
        intent.putExtra("isFromDraft", true);
        intent.putExtra("extra_video_canvas_width", videoPublishEditModel.getVideoCanvasWidth());
        intent.putExtra("extra_video_canvas_height", videoPublishEditModel.getVideoCanvasHeight());
        intent.putExtra("origin", videoPublishEditModel.getOrigin());
        List<AVChallenge> list = videoPublishEditModel.challenges;
        intent.putExtra("challenge", list instanceof Serializable ? (Serializable) list : null);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        intent.putExtra("video_title", videoPublishEditModel.getTitle());
        intent.putExtra("video_title_chain", videoPublishEditModel.getChain());
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.isDisableDeleteChain());
        List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
        intent.putExtra("struct_list", structList instanceof Serializable ? (Serializable) structList : null);
        intent.putExtra("is_private", videoPublishEditModel.isPrivate);
        if (!C086I.LIZIZ(videoPublishEditModel.geofencingSetting)) {
            List<String> list2 = videoPublishEditModel.geofencingSetting;
            intent.putExtra("geo_fencing", list2 instanceof Serializable ? (Serializable) list2 : null);
        }
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("duet_setting", videoPublishEditModel.reactDuetSetting);
        intent.putExtra("stitch_setting", videoPublishEditModel.stitchSetting);
        intent.putExtra("music_volume", videoPublishEditModel.getMusicVolume());
        intent.putExtra("music_origin", videoPublishEditModel.getMusicOriginWithCheck());
        intent.putExtra("voice_volume", videoPublishEditModel.getVoiceVolume());
        ClientCherEffectParam veCherEffectParam = videoPublishEditModel.getVeCherEffectParam();
        if (veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) veCherEffectParam);
        }
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            intent.putExtra("audio_record_param", (Parcelable) veAudioRecorderParam);
        }
        C569390MUv.LIZIZ(getIntent(), C1438710nXh.LIZIZ(videoPublishEditModel), EnumC569430MUz.PUBLISH, EnumC569430MUz.EDIT);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        DraftEditTransferModel draftEditTransferModel = videoPublishEditModel.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        if (!C086I.LIZIZ(videoPublishEditModel.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", videoPublishEditModel.messageBubbleTexts);
        }
        intent.putExtra("use_music_before_edit", videoPublishEditModel.isUseMusicBeforeEdit());
        intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
        intent.putExtra("extra_is_sound_loop", videoPublishEditModel.getIsSoundLoop().booleanValue());
        ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        iLayoutPreloadServiceForEditPage.preloadLayoutFiles(this, extras);
        try {
            extras2 = intent.getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C0MWH.LJIILL(this, extras2);
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f.LIZ.getClass();
        f.LIZ(this);
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

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", true);
        C569770MWh.LIZLLL(1, this);
        super.onCreate(bundle);
        setContentView(R.layout.iz);
        f fVar = f.LIZ;
        Intent intent = getIntent();
        fVar.getClass();
        f.LIZJ(this, intent, bundle);
        this.LLILLL = C1428470nHB.LJIILLIIL(getIntent());
        if (getIntent().getIntExtra("fromDraft", 0) != 1) {
            z = false;
        }
        this.LLIZ = z;
        this.LLILZ = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        this.LLILZLL = getIntent().getBooleanExtra("extra_enter_from_live", false);
        this.LLILZIL = getIntent().getIntExtra("draft_to_edit_from", 0);
        if (this.LLILLL == null) {
            C201955140j.LJ("VideoPublishActivity onCreate error, model == null");
            finish();
        } else {
            Bundle bundle2 = new Bundle();
            C1428470nHB.LLIL(bundle2, this.LLILLL);
            bundle2.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
            bundle2.putBoolean("enter_record_from_other_platform", this.LLILZ);
            bundle2.putBoolean("extra_enter_from_live", this.LLILZLL);
            bundle2.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
            bundle2.putBoolean("fromDraft", this.LLIZ);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment fragmentLJJJJZ = supportFragmentManager.LJJJJZ(R.id.iiv);
            if (!(fragmentLJJJJZ instanceof FTCVideoPublishFragment) || fragmentLJJJJZ == null) {
                FTCVideoPublishFragment fTCVideoPublishFragment = new FTCVideoPublishFragment();
                fTCVideoPublishFragment.setArguments(bundle2);
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.iiv, fTCVideoPublishFragment);
                c19ehLJIIJ.LJIIIZ();
            }
            KeyEvent.Callback callbackFindViewById = this.LL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.bmy);
                this.LL = (C19M4) callbackFindViewById;
            }
            C786410Ut5.c9((C19M4) callbackFindViewById, new AkS80S0100000_8(this, 34));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", false);
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
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiv);
        if ((fragmentLJJJJZ instanceof FTCVideoPublishFragment) && fragmentLJJJJZ != null && fragmentLJJJJZ.isAdded()) {
            fragmentLJJJJZ.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/ss/android/ugc/aweme/ftc/pages/FTCVideoPublishActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYx7/uf49AbXj94wjvbSdqsmIIUlw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        C1886700zCG.LIZ(this, iIntValue, iArr2);
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
    }
}
