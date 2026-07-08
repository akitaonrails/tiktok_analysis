package com.ss.android.ugc.aweme.shortvideo.cut;

import X.AbstractActivityC1674880tgc;
import X.C0CHQ;
import X.C0L0K;
import X.C0WIY;
import X.C0WZX;
import X.C1173010gd9;
import X.C1173030gdB;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C12ES;
import X.C12W6;
import X.C12WZ;
import X.C1308910kAL;
import X.C13LP;
import X.C1402840mbq;
import X.C1444820nhY;
import X.C14D2;
import X.C14EU;
import X.C15438062q;
import X.C1659650tI3;
import X.C1660610tJb;
import X.C1697810uHb;
import X.C19286810cs;
import X.C19768312Wb;
import X.C1B46;
import X.C201955140j;
import X.C214873197f;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C524780Ki4;
import X.C530750Krh;
import X.C536240L1i;
import X.C537520L6g;
import X.C569050MTn;
import X.C569220MUe;
import X.C569350MUr;
import X.C574570MgB;
import X.C574690MgN;
import X.C574730MgR;
import X.C574750MgT;
import X.C574790MgX;
import X.C579950Mor;
import X.C580130Mp9;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC569040MTm;
import X.InterfaceC214877197j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS18S0002000_29;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import pyl.s;

/* JADX INFO: loaded from: classes9.dex */
public final class VECutVideoActivity extends AbstractActivityC1674880tgc {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nHELIOSPiwoLCB9KzA4ZxkWCzA4HyY3LSoNKjs6Piw4MA==";
    public C19768312Wb LLIZ;
    public CutVideoViewModel LLIZLLLIL;

    @Override // X.ActivityC214874197g
    public final boolean LLLLZIL() {
        return true;
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZIL(boolean z) {
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LJII;
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZ() {
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.mR2()) {
            return;
        }
        C19768312Wb c19768312Wb = this.LLIZ;
        if (c19768312Wb == null) {
            c19768312Wb = null;
        }
        CutVideoViewModel cutVideoViewModel2 = c19768312Wb.LLJJL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        if (cutVideoViewModel2.mR2()) {
            return;
        }
        VideoEditViewModel videoEditViewModel = c19768312Wb.LLJJLIIIJLLLLLLLZ;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        int i = ((VideoSegment) ListProtector.get(videoEditViewModel.zQ2(), 0)).width;
        VideoEditViewModel videoEditViewModel2 = c19768312Wb.LLJJLIIIJLLLLLLLZ;
        if (videoEditViewModel2 == null) {
            videoEditViewModel2 = null;
        }
        int iMin = Math.min(i, ((VideoSegment) ListProtector.get(videoEditViewModel2.zQ2(), 0)).height);
        VideoEditViewModel videoEditViewModel3 = c19768312Wb.LLJJLIIIJLLLLLLLZ;
        if (videoEditViewModel3 == null) {
            videoEditViewModel3 = null;
        }
        int i2 = ((VideoSegment) ListProtector.get(videoEditViewModel3.zQ2(), 0)).width;
        VideoEditViewModel videoEditViewModel4 = c19768312Wb.LLJJLIIIJLLLLLLLZ;
        if (videoEditViewModel4 == null) {
            videoEditViewModel4 = null;
        }
        int iMax = Math.max(i2, ((VideoSegment) ListProtector.get(videoEditViewModel4.zQ2(), 0)).height);
        CutVideoPreviewViewModel cutVideoPreviewViewModel = c19768312Wb.LLJLLIL;
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = cutVideoPreviewViewModel != null ? cutVideoPreviewViewModel : null;
        cutVideoPreviewViewModel2.getClass();
        cutVideoPreviewViewModel2.setState(new AwS18S0002000_29(iMin, iMax, 3));
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        cutVideoViewModel.nR2();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        String str;
        super.finish();
        C530750Krh c530750Krh = C530750Krh.LJFF;
        if (c530750Krh != null) {
            c530750Krh.LIZ();
        }
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        String str2 = null;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (TextUtils.isEmpty((cutVideoViewModel.LLILZIL == null || cutVideoViewModel.lR2().LJI == null) ? null : cutVideoViewModel.lR2().LJI.appId)) {
            return;
        }
        CutVideoViewModel cutVideoViewModel2 = this.LLIZLLLIL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        MicroAppModel microAppModel = cutVideoViewModel2.lR2().LJI;
        if (microAppModel != null) {
            try {
                str = microAppModel.extra;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (1 == new JSONObject(microAppModel != null ? microAppModel.extra : null).optInt("timor_video_source")) {
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getMiniAppService();
            CutVideoViewModel cutVideoViewModel3 = this.LLIZLLLIL;
            if (cutVideoViewModel3 == null) {
                cutVideoViewModel3 = null;
            }
            if (cutVideoViewModel3.LLILZIL != null && cutVideoViewModel3.lR2().LJI != null) {
                str2 = cutVideoViewModel3.lR2().LJI.appId;
            }
            C19286810cs.LIZ(str2);
        }
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C524780Ki4.LIZ.leave(this, "clip");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        j jVar = C524780Ki4.LIZ;
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        String str = cutVideoViewModel.lR2().LJIIJJI;
        CutVideoViewModel cutVideoViewModel2 = this.LLIZLLLIL;
        jVar.pause(this, "clip", str, (cutVideoViewModel2 != null ? cutVideoViewModel2 : null).lR2().LJIILLIIL.getCreationId());
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

    public static Bundle LLLZZIL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLLZLLLI(boolean z) {
        Pair pair;
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        CutVideoViewModel cutVideoViewModel2 = null;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (!cutVideoViewModel.mR2()) {
            C19768312Wb c19768312Wb = this.LLIZ;
            if (c19768312Wb == null) {
                c19768312Wb = null;
            }
            CutVideoViewModel cutVideoViewModel3 = c19768312Wb.LLJJL;
            if (cutVideoViewModel3 == null) {
                cutVideoViewModel3 = null;
            }
            if (!cutVideoViewModel3.mR2()) {
                C1173010gd9 c1173010gd9 = (C1173010gd9) c19768312Wb.LLJJJIL.getValue();
                CutVideoViewModel cutVideoViewModel4 = c1173010gd9.LLJJJIL;
                if (cutVideoViewModel4 != null) {
                    cutVideoViewModel2 = cutVideoViewModel4;
                }
                if (cutVideoViewModel2.lR2().LJIIZILJ.newVideoPipelineExtraModel.isNewVideoPipelineEnabled) {
                    pair = new Pair(Integer.valueOf((int) C12ES.LIZJ(60.0f, c1173010gd9.mActivity)), Integer.valueOf((int) C12ES.LIZJ(60.0f, c1173010gd9.mActivity)));
                } else {
                    pair = new Pair(Integer.valueOf((int) C12ES.LIZJ(132.0f, c1173010gd9.mActivity)), 0);
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                int iP2 = C1660610tJb.LIZ.p2();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((Scene) c1173010gd9.LLJJJJJIL.getValue()).mView.getLayoutParams();
                if (z) {
                    iIntValue = iP2;
                }
                marginLayoutParams.height = iIntValue;
                C786410Ut5.W5(((Scene) c1173010gd9.LLJJJJJIL.getValue()).mView, marginLayoutParams);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c1173010gd9.LLLLIILL().mView.getLayoutParams();
                if (z) {
                    iIntValue2 = (int) (C12ES.LIZJ(5.5f, c1173010gd9.mActivity) + iP2);
                }
                marginLayoutParams2.bottomMargin = iIntValue2;
                C786410Ut5.W5(c1173010gd9.LLLLIILL().mView, marginLayoutParams2);
            }
        }
    }

    @Override // X.AbstractActivityC1674880tgc, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CommentVideoModel commentVideoModel;
        String commentId;
        String userId;
        Workspace workspaceLIZ;
        Serializable serializable;
        ShareKitPanel shareKitPanel;
        Effect sharePanelEffect;
        String effectId;
        BaseShareContext baseShareContext;
        String str;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", true);
        C524780Ki4.LIZ.enter(this, "clip");
        super.onCreate(bundle);
        try {
            if (C1B46.LJIIJJI(LLZ(getIntent(), "shoot_way"))) {
                C1444820nhY.LIZ = false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJ("cut video upload exception");
        }
        C536240L1i.LIZ = false;
        String strLLZ = LLZ(getIntent(), "shoot_way");
        if (C1B46.LJIIJJI(strLLZ)) {
            C574750MgT c574750MgT = C574750MgT.LIZ;
            String strLLZ2 = LLZ(getIntent(), "shoot_way");
            String creationId = C537520L6g.LIZ(getIntent()).getCreationId();
            c574750MgT.getClass();
            C574750MgT.LIZIZ = strLLZ2;
            C574750MgT.LIZJ = creationId;
        } else if ("comment_reply".equals(strLLZ)) {
            Serializable serializableExtra = getIntent().getSerializableExtra("comment_video_model");
            if (serializableExtra instanceof CommentVideoModel) {
                commentVideoModel = (CommentVideoModel) serializableExtra;
            } else {
                commentVideoModel = null;
            }
            C574750MgT c574750MgT2 = C574750MgT.LIZ;
            if (commentVideoModel != null) {
                commentId = commentVideoModel.getCommentId();
                userId = commentVideoModel.getUserId();
            } else {
                commentId = null;
                userId = null;
            }
            c574750MgT2.getClass();
            C574750MgT.LJ = commentId;
            C574750MgT.LJFF = userId;
        }
        C574750MgT c574750MgT3 = C574750MgT.LIZ;
        String strLLZ3 = LLZ(getIntent(), "prop_id");
        String strLLZ4 = LLZ(getIntent(), "prop_resource_id");
        String strLLZ5 = LLZ(getIntent(), "effect_source");
        if (!getIntent().hasExtra("effect_source")) {
            strLLZ5 = null;
        }
        String strLLZ6 = LLZ(getIntent(), "is_ai_prop");
        String strLLZ7 = LLZ(getIntent(), "ai_prop_type");
        String strLLZ8 = LLZ(getIntent(), "is_async");
        if (!getIntent().hasExtra("is_async")) {
            strLLZ8 = null;
        }
        String strLLZ9 = LLZ(getIntent(), "sub_ai_prop_type");
        String strLLZ10 = LLZ(getIntent(), "ai_prop_model_name");
        String strLLZ11 = LLZ(getIntent(), "tab_key");
        String strLLZ12 = LLZ(getIntent(), "prop_selected_from");
        String strLLZ13 = LLZ(getIntent(), "is_default_prop");
        String strLLZ14 = LLZ(getIntent(), "prop_trigger_type");
        String strLLZ15 = LLZ(getIntent(), "shoot_tab_name");
        c574750MgT3.getClass();
        C574750MgT.LJIIJJI = strLLZ3;
        C574750MgT.LJIIL = strLLZ4;
        C574750MgT.LJIILIIL = strLLZ5;
        C574750MgT.LJIILJJIL = strLLZ6;
        C574750MgT.LJIILL = strLLZ7;
        C574750MgT.LJIILLIIL = strLLZ8;
        C574750MgT.LJIIZILJ = strLLZ9;
        C574750MgT.LJIJ = strLLZ10;
        C574750MgT.LJIJI = strLLZ11;
        C574750MgT.LJIJJ = strLLZ12;
        C574750MgT.LJIJJLI = strLLZ13;
        C574750MgT.LJIL = strLLZ14;
        C574750MgT.LJJ = strLLZ15;
        String strLLZ16 = LLZ(getIntent(), "shoot_way");
        String creationId2 = C537520L6g.LIZ(getIntent()).getCreationId();
        C574750MgT.LIZIZ = strLLZ16;
        C574750MgT.LIZJ = creationId2;
        C0CHQ.LIZ().LJJIZ();
        setContentView(R.layout.ip);
        this.LLIZLLLIL = (CutVideoViewModel) C1659650tI3.LIZ(this).LIZ(CutVideoViewModel.class);
        C569220MUe c569220MUe = new C569220MUe();
        c569220MUe.LJIILLIIL = C537520L6g.LIZ(getIntent());
        CutVideoViewModel cutVideoViewModel = this.LLIZLLLIL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        cutVideoViewModel.LLILZIL = c569220MUe;
        ArrayList<MediaModel> arrayList = new ArrayList<>();
        C530750Krh c530750Krh = C530750Krh.LJFF;
        if (c530750Krh != null) {
            new ArrayList(c530750Krh.LIZLLL);
            C530750Krh c530750Krh2 = C530750Krh.LJFF;
            c530750Krh2.getClass();
            arrayList = new ArrayList<>(c530750Krh2.LIZLLL);
            C530750Krh.LJFF.LIZ();
        }
        String strLLZ17 = LLZ(getIntent(), "file_path");
        if (!getIntent().hasExtra("open_sdk_import_media_list") || (arrayList = getIntent().getParcelableArrayListExtra("open_sdk_import_media_list")) != null) {
            if (TextUtils.isEmpty(strLLZ17) && arrayList.isEmpty()) {
                finish();
            } else {
                if (strLLZ17 != null && strLLZ17.length() != 0) {
                    C0L0K.LIZIZ(this, strLLZ17, "share_to_tt", false, 24);
                }
                c569220MUe.LIZ = arrayList;
                c569220MUe.LIZIZ = strLLZ17;
                if (bundle == null || (workspaceLIZ = (Workspace) bundle.getParcelable("workspace")) == null) {
                    workspaceLIZ = C14D2.LIZ(c569220MUe.LJIILLIIL);
                }
                c569220MUe.LJIIIIZZ = workspaceLIZ;
                C569350MUr c569350MUr = C569350MUr.LIZ;
                Intent intent = getIntent();
                c569350MUr.getClass();
                C569350MUr.LIZIZ(c569220MUe, intent);
                C19768312Wb c19768312Wb = new C19768312Wb(C537520L6g.LIZ(getIntent()));
                Bundle bundleLLLZZIL = LLLZZIL(getIntent());
                if (bundleLLLZZIL != null) {
                    c19768312Wb.mArguments = bundleLLLZZIL;
                }
                this.LLIZ = c19768312Wb;
                C214873197f c214873197f = new C214873197f(this, C19768312Wb.class);
                c214873197f.LJI = false;
                c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0MgU
                    @Override // X.InterfaceC214877197j
                    public final Scene LIZ(ClassLoader classLoader, String str2, Bundle bundle2) {
                        C19768312Wb c19768312Wb2;
                        if (!Intrinsics.LJFF(C19768312Wb.class.getName(), str2) || (c19768312Wb2 = this.LIZ.LLIZ) == null) {
                            return null;
                        }
                        return c19768312Wb2;
                    }
                };
                c214873197f.LIZLLL = false;
                c214873197f.LJ = false;
                c214873197f.LJFF = R.id.tp8;
                c214873197f.LIZ();
                CutVideoViewModel cutVideoViewModel2 = this.LLIZLLLIL;
                if (cutVideoViewModel2 == null) {
                    cutVideoViewModel2 = null;
                }
                C569220MUe c569220MUeLR2 = cutVideoViewModel2.lR2();
                getIntent().getLongExtra("key_remaining_video_duration", 0L);
                c569220MUeLR2.getClass();
                CutVideoViewModel cutVideoViewModel3 = this.LLIZLLLIL;
                if (cutVideoViewModel3 == null) {
                    cutVideoViewModel3 = null;
                }
                cutVideoViewModel3.lR2().LIZLLL = getIntent().getLongExtra("key_default_trim_length", 0L);
                CutVideoViewModel cutVideoViewModel4 = this.LLIZLLLIL;
                if (cutVideoViewModel4 == null) {
                    cutVideoViewModel4 = null;
                }
                int i = 0;
                cutVideoViewModel4.lR2().LJIIZILJ.newVideoPipelineExtraModel.isNewVideoPipelineEnabled = getIntent().getBooleanExtra("is_new_background_video_pipeline", false);
                CutVideoViewModel cutVideoViewModel5 = this.LLIZLLLIL;
                if (cutVideoViewModel5 == null) {
                    cutVideoViewModel5 = null;
                }
                if (cutVideoViewModel5.mR2()) {
                    this.LLILLL = false;
                }
                CutVideoViewModel cutVideoViewModel6 = this.LLIZLLLIL;
                if (cutVideoViewModel6 == null) {
                    cutVideoViewModel6 = null;
                }
                C1402840mbq c1402840mbq = cutVideoViewModel6.lR2().LJIIIZ;
                if (c1402840mbq != null && (str = c1402840mbq.mClientKey) != null) {
                    C574750MgT.LJII = str;
                }
                C569050MTn c569050MTn = EnumC569040MTm.Companion;
                Bundle bundleLLLZZIL2 = LLLZZIL(getIntent());
                if (bundleLLLZZIL2 != null) {
                    i = bundleLLLZZIL2.getInt("open_sdk_share_format");
                }
                c569050MTn.getClass();
                if (C569050MTn.LIZ(i) == EnumC569040MTm.GREEN_SCREEN) {
                    CutVideoViewModel cutVideoViewModel7 = this.LLIZLLLIL;
                    if (cutVideoViewModel7 == null) {
                        cutVideoViewModel7 = null;
                    }
                    CreativeFlowData creativeFlowData = cutVideoViewModel7.lR2().LJIL;
                    Bundle bundleLLLZZIL3 = LLLZZIL(getIntent());
                    if (bundleLLLZZIL3 != null) {
                        serializable = bundleLLLZZIL3.getSerializable("extra_share_context");
                    } else {
                        serializable = null;
                    }
                    if ((serializable instanceof C1402840mbq) && (baseShareContext = (BaseShareContext) serializable) != null) {
                        shareKitPanel = baseShareContext.mShareKitPanel;
                    } else {
                        shareKitPanel = null;
                    }
                    creativeFlowData.setShareKitPanel(shareKitPanel);
                    CutVideoViewModel cutVideoViewModel8 = this.LLIZLLLIL;
                    if (cutVideoViewModel8 == null) {
                        cutVideoViewModel8 = null;
                    }
                    ShareKitPanel shareKitPanel2 = cutVideoViewModel8.lR2().LJIL.getShareKitPanel();
                    if (shareKitPanel2 != null) {
                        Effect sharePanelEffect2 = shareKitPanel2.getSharePanelEffect();
                        if (sharePanelEffect2 != null && (effectId = sharePanelEffect2.getEffectId()) != null && effectId.length() != 0) {
                            sharePanelEffect = shareKitPanel2.getSharePanelEffect();
                        } else {
                            Bundle bundleLLLZZIL4 = LLLZZIL(getIntent());
                            if (bundleLLLZZIL4 != null) {
                                sharePanelEffect = (Effect) bundleLLLZZIL4.getParcelable("green_screen_kit_preset_effect");
                            } else {
                                sharePanelEffect = null;
                            }
                        }
                        shareKitPanel2.setSharePanelEffect(sharePanelEffect);
                        C574750MgT.LJII = shareKitPanel2.getClientKey();
                        C574750MgT.LJIIJ = shareKitPanel2.getShareMediaType();
                        C574750MgT.LJIIIZ = shareKitPanel2.getEffectResourceId();
                        C574750MgT.LJIIIIZZ = shareKitPanel2.getSharePanelOption();
                    }
                }
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
                return;
            }
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C579950Mor c579950Mor) {
        finish();
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

    public static String LLZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Bundle bundleLLLZZIL;
        List<VideoSegment> videoSegmentList;
        long jLongValue;
        long jLJJLIIIJJIZ;
        super.onActivityResult(i, i2, intent);
        C19768312Wb c19768312Wb = this.LLIZ;
        if (c19768312Wb == null) {
            c19768312Wb = null;
        }
        CutVideoViewModel cutVideoViewModel = c19768312Wb.LLJJL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.mR2()) {
            C1173030gdB c1173030gdBLLLLIILL = c19768312Wb.LLLLIILL();
            c1173030gdBLLLLIILL.getClass();
            if (i == 1001 && i2 == -1 && intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                if (!C580130Mp9.LIZ(parcelableArrayListExtra)) {
                    ArrayList<VideoSegment> arrayList = new ArrayList();
                    VideoEditViewModel videoEditViewModel = c1173030gdBLLLLIILL.LLJJJ;
                    if (videoEditViewModel == null) {
                        videoEditViewModel = null;
                    }
                    int size = videoEditViewModel.zQ2().size();
                    int size2 = parcelableArrayListExtra.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        VideoSegment videoSegment = new VideoSegment((MediaModel) ListProtector.get(parcelableArrayListExtra, i3));
                        videoSegment.videoIndex = size;
                        arrayList.add(videoSegment);
                        size++;
                    }
                    C12W6 c12w6 = ((C12WZ) c1173030gdBLLLLIILL.LLJJJJJIL.getValue()).LLJI;
                    if (c12w6 != null) {
                        c12w6.LLLFZ(arrayList);
                    }
                    c1173030gdBLLLLIILL.LLLLIILL().LLLIIIIL().LIZ(arrayList);
                    VECutVideoPresenter vECutVideoPresenter = c1173030gdBLLLLIILL.LLJJIJIIJIL;
                    if (vECutVideoPresenter == null) {
                        vECutVideoPresenter = null;
                    }
                    VideoEditViewModel videoEditViewModel2 = c1173030gdBLLLLIILL.LLJJJ;
                    if (videoEditViewModel2 == null) {
                        videoEditViewModel2 = null;
                    }
                    int size3 = videoEditViewModel2.zQ2().size();
                    C0WIY<Long, Long> c0wiyLLJILJIL = vECutVideoPresenter.LLILLJJLI.LLJILJIL();
                    Long l = c0wiyLLJILJIL.LIZ;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Long l2 = c0wiyLLJILJIL.LIZIZ;
                    if (l2 != null) {
                        jLJJLIIIJJIZ = l2.longValue();
                    } else {
                        jLJJLIIIJJIZ = vECutVideoPresenter.LLILLJJLI.LJJLIIIJJIZ();
                    }
                    C574570MgB c574570MgB = vECutVideoPresenter.LLJJIJIL;
                    C574690MgN c574690MgN = c574570MgB.LIZIZ;
                    if (c574690MgN != null && !C580130Mp9.LIZ(arrayList)) {
                        C574790MgX.LIZ(c574690MgN.LIZIZ, arrayList);
                    }
                    C574730MgR c574730MgR = c574570MgB.LIZ;
                    if (c574730MgR != null && !arrayList.isEmpty()) {
                        C574790MgX.LIZ(c574730MgR.LIZIZ, arrayList);
                    }
                    C574730MgR c574730MgR2 = c574570MgB.LIZ;
                    if (c574730MgR2 != null && !arrayList.isEmpty()) {
                        int size4 = arrayList.size();
                        ArrayList arrayList2 = new ArrayList(size4);
                        ArrayList arrayList3 = new ArrayList(size4);
                        for (VideoSegment videoSegment2 : arrayList) {
                            VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                            String strLJFF = videoSegment2.LJFF(false);
                            strLJFF.toString();
                            vEClipSourceParam.clipFilePath = strLJFF;
                            vEClipSourceParam.clipWidth = videoSegment2.width;
                            vEClipSourceParam.clipHeight = videoSegment2.height;
                            arrayList2.add(vEClipSourceParam);
                            VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                            vEClipTimelineParam.speed = s.NORMAL.value();
                            vEClipTimelineParam.trimIn = 0;
                            vEClipTimelineParam.trimOut = (int) videoSegment2.duration;
                            arrayList3.add(vEClipTimelineParam);
                        }
                        c574730MgR2.LIZ.gg(size3 - arrayList.size(), arrayList2, arrayList3);
                        c574730MgR2.LIZ.uf((int) jLongValue, (int) jLJJLIIIJJIZ);
                    }
                }
                VideoEditViewModel videoEditViewModel3 = c1173030gdBLLLLIILL.LLJJJ;
                if (videoEditViewModel3 == null) {
                    videoEditViewModel3 = null;
                }
                CutVideoContext value = videoEditViewModel3.LLJJJJJIL.getValue();
                if (value != null && (videoSegmentList = value.getVideoSegmentList()) != null) {
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(videoSegmentList, 10));
                    Iterator<VideoSegment> it2 = videoSegmentList.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Long.valueOf(it2.next().duration));
                    }
                    if (C13LP.LJZL(arrayList4) > 60000) {
                        c1173030gdBLLLLIILL.LLLLIL();
                    }
                }
            }
        }
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (intent != null && LLLZZIL(intent) != null) {
                intent2.putExtra("record result", "RecordActivity return success ".concat(LLLZZIL(intent).getString("edit result")));
            }
            C2204961BRm.l(this, -1, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhn9fRx7o4Ku/s4aGo5rzq0qNQsELeeA==", null));
            finish();
            return;
        }
        if (i != 8 || i2 != 9) {
            return;
        }
        Intent intent3 = new Intent();
        if (intent != null && (bundleLLLZZIL = LLLZZIL(intent)) != null) {
            intent3.putExtras(bundleLLLZZIL);
        }
        C2204961BRm.l(this, 9, intent3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhn9fRx7o4Ku/s4aGo5rzq0qNQsELeeA==", null));
        finish();
    }
}
