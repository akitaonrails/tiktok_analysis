package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AnonymousClass0801;
import X.C01GW;
import X.C0AFJ;
import X.C0CHQ;
import X.C0L3Q;
import X.C0LE3;
import X.C0MNL;
import X.C0MWS;
import X.C0MWV;
import X.C1269404xw;
import X.C12IR;
import X.C1443540nfU;
import X.C1443590nfZ;
import X.C1448130nmt;
import X.C1448150nmv;
import X.C1453870nw9;
import X.C14EU;
import X.C1602160rnK;
import X.C1630980sXo;
import X.C1652200t62;
import X.C1655440tBG;
import X.C1655630tBZ;
import X.C1659630tI1;
import X.C1688700u2u;
import X.C198Q;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C201967140v;
import X.C20684815ws;
import X.C2188811AlT;
import X.C259800zU;
import X.C267810AeZ;
import X.C295700BiS;
import X.C297290Bl1;
import X.C306720C0o;
import X.C418440Gaw;
import X.C452501pT;
import X.C524780Ki4;
import X.C537970L7z;
import X.C569770MWh;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1641390sob;
import X.InterfaceC1269304xv;
import X.InterfaceC1642910sr3;
import X.InterfaceC1645720sva;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650180t2m;
import X.InterfaceC1650230t2r;
import X.InterfaceC1655400tBC;
import X.InterfaceC20685415wy;
import X.InterfaceC21500319Cf;
import X.InterfaceC2177841ALe;
import X.InterfaceC855400Xh4;
import Y.ARunnableS125S0100000_25;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bck.u;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.offline.statsfornerds.IStatsForNerdsService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.services.performance.OpenCameraStep;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenCameraLatencyMonitor;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.gamora.PageFactory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lgo.a;
import lth.o;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
@InterfaceC21500319Cf(featureKey = "tiktok_creation_shoot")
public final class VideoRecordContainerScene extends TikTokCameraBaseGroupScene implements InterfaceC1650180t2m, IPreDownloadMusic, C0MWS, C198Q, C0L3Q, InterfaceC855400Xh4 {
    public C1DRG LLJZIJLIL;
    public ShortVideoContext LLL;
    public VideoRecordRootView LLLF;
    public FrameLayout LLLFF;
    public View LLLFFI;
    public FrameLayout LLLFZ;
    public View LLLI;
    public NavigationScene LLLII;
    public kg LLLIIII;
    public MvChoosePhotoScene LLLIIIIL;
    public x2 LLLIIIL;
    public final C01GW LLLIIL;
    public e0 LLLIILIL;
    public ViewGroup LLLIL;
    public InterfaceC1648570t0B LLLILZ;
    public InterfaceC20685415wy LLLILZJ;
    public C1453870nw9<EnumC1641390sob> LLLILZLLLI;
    public InterfaceC2177841ALe LLLIZZ;
    public final C0LE3 LLLJ;

    public VideoRecordContainerScene() {
        super(0);
        disableSupportRestore();
        this.LLLIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(158));
        this.LLLJ = C0LE3.RECORD;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLZL() {
        this.LLLIIIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.InterfaceC1650070t2b
    public final String getTag() {
        return "VideoRecordContainerScene";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public void onEvent(AnonymousClass0801 anonymousClass0801) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    @C14EU(sticky = true)
    public void receiveToast(C1630980sXo c1630980sXo) {
    }

    @Override // X.InterfaceC1452540nu0
    public final void LLLJIL() {
        View view = this.LLLFFI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC214814194y
    public final boolean LLLLILI() {
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        return (this.LLL == null || LLLLZIL() || (shortVideoContext = this.LLL) == null || (creativeModel = shortVideoContext.creativeModel) == null || (storyShootModel = creativeModel.storyModel) == null || storyShootModel.getSharedElementTransitionMode() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLLL() {
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLLILZ;
        if (interfaceC1648570t0B != null) {
            interfaceC1648570t0B.V2(false);
        }
    }

    public final boolean LLLLZIL() {
        return ((Boolean) this.LLLIIL.getValue()).booleanValue();
    }

    public final boolean LLLLZLLIL() {
        ShortVideoContext shortVideoContext = this.LLL;
        if (shortVideoContext != null) {
            return (shortVideoContext.mToLive || shortVideoContext.mToStatus || (shortVideoContext.enterMvThemeEffect != null) || C306720C0o.LIZ()) ? false : true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, X.AbstractC214814194y
    public final int getFinishAnimationType() {
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        CreativeModel creativeModel2;
        StoryShootModel storyShootModel2;
        CreativeModel creativeModel3;
        EditorProSchemeModel editorProSchemeModel;
        ShortVideoContext shortVideoContext = this.LLL;
        if (shortVideoContext != null && (creativeModel3 = shortVideoContext.creativeModel) != null && (editorProSchemeModel = creativeModel3.editorProSchemeModel) != null && C537970L7z.LJFF(editorProSchemeModel)) {
            return 1;
        }
        String exitMethod = null;
        if (C295700BiS.LIZ()) {
            ShortVideoContext shortVideoContext2 = this.LLL;
            if (Intrinsics.LJFF(shortVideoContext2 != null ? shortVideoContext2.shootWay : null, "ugc_template")) {
                return 1;
            }
        }
        ShortVideoContext shortVideoContext3 = this.LLL;
        if (shortVideoContext3 != null) {
            String str = shortVideoContext3.enterMethod;
            if (TextUtils.equals(str, "story_fixed_icon") || TextUtils.equals(str, "pull_down")) {
                ShortVideoContext shortVideoContext4 = this.LLL;
                Integer numValueOf = (shortVideoContext4 == null || (creativeModel2 = shortVideoContext4.creativeModel) == null || (storyShootModel2 = creativeModel2.storyModel) == null) ? null : Integer.valueOf(storyShootModel2.getSharedElementTransitionMode());
                if (LLLLZIL() || (numValueOf != null && numValueOf.intValue() == 1)) {
                    return 1;
                }
                ShortVideoContext shortVideoContext5 = this.LLL;
                if (shortVideoContext5 != null && (creativeModel = shortVideoContext5.creativeModel) != null && (storyShootModel = creativeModel.storyModel) != null) {
                    exitMethod = storyShootModel.getExitMethod();
                }
                return TextUtils.equals(exitMethod, "swipe_up") ? 21 : 16;
            }
        }
        ShortVideoContext shortVideoContext6 = this.LLL;
        if (shortVideoContext6 == null || shortVideoContext6.creativeModel.albumOpenApiModel == null) {
            return super.getFinishAnimationType();
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final IPreDownloadMusic.PreDownloadMusicData getPreDownloadMusicData() {
        IPreDownloadMusic.PreDownloadMusicData preDownloadMusicData;
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIIIIL;
        return (mvChoosePhotoScene == null || mvChoosePhotoScene.mActivity == null || (preDownloadMusicData = mvChoosePhotoScene.getPreDownloadMusicData()) == null) ? new IPreDownloadMusic.PreDownloadMusicData(null, null) : preDownloadMusicData;
    }

    @Override // X.AbstractC214814194y
    public final int getStartAnimationType() {
        Bundle bundle = this.mArguments;
        return bundle == null ? super.getStartAnimationType() : C0MWV.LIZIZ(bundle);
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final boolean isReEnterChoosePhoto() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIIIIL;
        return mvChoosePhotoScene != null && mvChoosePhotoScene.isReEnterChoosePhoto();
    }

    @Override // X.AbstractC214814194y
    public final void onEnterAnimationComplete() {
        CreativeModel creativeModel;
        RecordMobModel recordMobModel;
        CreativeModel creativeModel2;
        RecordMobModel recordMobModel2;
        C1453870nw9<EnumC1641390sob> c1453870nw9 = this.LLLILZLLLI;
        if (c1453870nw9 != null) {
            c1453870nw9.LIZLLL = System.currentTimeMillis();
        }
        a.LIZIZ.recordService().onEnterAnimationComplete();
        C524780Ki4.LIZ.end(OpenCameraLatencyMonitor.INSTANCE, OpenCameraStep.ANIMATION_DONE.getStepName());
        VideoRecordRootView videoRecordRootView = this.LLLF;
        if (videoRecordRootView != null) {
            ShortVideoContext shortVideoContext = this.LLL;
            if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (recordMobModel2 = creativeModel2.recordMobModel) != null) {
                recordMobModel2.firstMeasureStartTimeMS = videoRecordRootView.getFirstMeasureStartTimeMS();
            }
            ShortVideoContext shortVideoContext2 = this.LLL;
            if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (recordMobModel = creativeModel.recordMobModel) != null) {
                recordMobModel.firstDrawnTimeMS = videoRecordRootView.getFirstDrawnTimeMS();
            }
        }
        C1453870nw9<EnumC1641390sob> c1453870nw92 = this.LLLILZLLLI;
        if (c1453870nw92 != null) {
            c1453870nw92.LIZIZ(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        IStatsForNerdsService iStatsForNerdsService;
        this.LLJLLL.LIZIZ("video_record_activity_resume");
        super.onResume();
        C1453870nw9<EnumC1641390sob> c1453870nw9 = this.LLLILZLLLI;
        if (c1453870nw9 != null) {
            c1453870nw9.LIZIZ(EnumC1641390sob.ACTIVITY_RESUME);
        }
        this.LLJLLL.LIZ("video_record_activity_resume");
        if (this.LLLIL != null && (iStatsForNerdsService = (IStatsForNerdsService) PluggableExtentionKt.pluggableSpi$default(IStatsForNerdsService.class, false, false, false, 14, null)) != null) {
            requireContext();
            iStatsForNerdsService.onResume();
        }
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "VideoRecordContainerScene onResume");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        this.LLJLLL.LIZIZ("video_record_activity_start");
        super.onStart();
        if (((Boolean) C267810AeZ.LIZ.getValue()).booleanValue() && this.LLLILZJ == null) {
            InterfaceC20685415wy interfaceC20685415wyLIZ = a.LIZIZ.LIZLLL().LIZ();
            this.LLLILZJ = interfaceC20685415wyLIZ;
            C20684815ws.LIZ(interfaceC20685415wyLIZ);
        }
        C1453870nw9<EnumC1641390sob> c1453870nw9 = this.LLLILZLLLI;
        if (c1453870nw9 != null) {
            c1453870nw9.LIZIZ(EnumC1641390sob.ACTIVITY_STARTED);
        }
        VideoRecordRootView videoRecordRootView = this.LLLF;
        if (videoRecordRootView != null) {
            int visibility = videoRecordRootView.getVisibility();
            videoRecordRootView.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, videoRecordRootView);
        }
        C1655440tBG c1655440tBG = this.LLJJLIIIJLLLLLLLZ;
        Iterator it2 = ((ArrayList) c1655440tBG.LLILZIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655400tBC) it2.next()).onShow();
        }
        ((ArrayList) c1655440tBG.LLIZ).add(C1269404xw.LIZ);
        this.LLJLLL.LIZ("video_record_activity_start");
    }

    @Override // X.InterfaceC1452540nu0
    public final void r7() {
        View view = this.LLLFFI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LLIIZ() {
        return (FrameLayout) findViewById(R.id.szh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.bytedance.scene.Scene, com.ss.android.ugc.aweme.shortvideo.x2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0t2l, com.ss.android.ugc.aweme.shortvideo.x2] */
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
    public final void LLLLZLL() {
        if (isFinishing()) {
            return;
        }
        C524780Ki4.LIZ.step("av_video_record_init", "addFragment");
        C201967140v c201967140v = C201967140v.LIZIZ;
        C201955140j.LIZJ(c201967140v, "[loadPlanC] start");
        kg kgVar = this.LLLIIII;
        C259800zU c259800zU = new C259800zU();
        ?? r0 = this.LLLIIIL;
        c259800zU.element = r0;
        if (kgVar != 0 && r0 != 0 && kgVar.isAdded(r0)) {
            C201955140j.LIZJ(c201967140v, "[loadPlanC] remove previous PlanC");
            kgVar.remove((Scene) c259800zU.element);
        }
        C201955140j.LIZJ(c201967140v, "[loadPlanC] create new PlanC");
        ?? x2Var = new x2(this.LLL, this.mArguments, this.LLJZIJLIL, new InterfaceC1642910sr3() { // from class: X.0sr1
            @Override // X.InterfaceC1642910sr3
            public final void LIZ(C19A3 c19a3) {
                InterfaceC1642900sr2 interfaceC1642900sr2LIZ;
                PageFactory pageFactory = (PageFactory) PluggableExtentionKt.pluggableSpi$default(PageFactory.class, false, false, false, 14, null);
                if (pageFactory != null && (interfaceC1642900sr2LIZ = pageFactory.LIZ(this.LIZ.LLL)) != null) {
                    interfaceC1642900sr2LIZ.LIZ(c19a3);
                }
            }
        });
        c259800zU.element = x2Var;
        x2Var.LLJJ = new ARunnableS125S0100000_25(this, c259800zU, 40);
        this.LLLIIIL = x2Var;
        if (kgVar != 0) {
            kgVar.LLLLIILL(x2Var);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.InterfaceC2077908Cb
    public final Analysis getAnalysis() {
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        String str;
        CreativeModel creativeModel2;
        RecordMobModel recordMobModel;
        if (super.getAnalysis() == null) {
            return super.getAnalysis();
        }
        HashMap map = new HashMap();
        ShortVideoContext shortVideoContext = this.LLL;
        map.put("creation_id", shortVideoContext != null ? shortVideoContext.getCreationId() : null);
        map.put("is_story_shoot", CardStruct.IStatusCode.DEFAULT);
        ShortVideoContext shortVideoContext2 = this.LLL;
        String str2 = (shortVideoContext2 == null || (creativeModel2 = shortVideoContext2.creativeModel) == null || (recordMobModel = creativeModel2.recordMobModel) == null) ? null : recordMobModel.fromMusicId;
        if (!TextUtils.isEmpty(str2)) {
            map.put("music_id", str2);
        }
        ShortVideoContext shortVideoContext3 = this.LLL;
        if (shortVideoContext3 != null && (creativeModel = shortVideoContext3.creativeModel) != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null && (str = dMCameraModel.enterDM) != null && str.length() != 0) {
            map.put("enter_dm", str);
        }
        Analysis analysis = super.getAnalysis();
        if (analysis == null) {
            return null;
        }
        analysis.setExtraMap(map);
        return analysis;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C1652200t62 c1652200t62;
        u uVar;
        InterfaceC1645720sva interfaceC1645720sva;
        C12IR c12ir;
        IStatsForNerdsService iStatsForNerdsService;
        super.onDestroyView();
        if (this.LLLIL != null && (iStatsForNerdsService = (IStatsForNerdsService) PluggableExtentionKt.pluggableSpi$default(IStatsForNerdsService.class, false, false, false, 14, null)) != null) {
            iStatsForNerdsService.LJI();
        }
        this.LLLIL = null;
        try {
            C1DRG c1drg = this.LLJZIJLIL;
            if (c1drg != null && (c1652200t62 = (C1652200t62) c1drg.LJIIL(null, C1652200t62.class)) != null && c1652200t62.LJIIIIZZ.compareAndSet(true, false)) {
                try {
                    InterfaceC2177841ALe interfaceC2177841ALeGz0 = c1652200t62.LIZ.Gz0();
                    if (interfaceC2177841ALeGz0 != null && (interfaceC1645720sva = (uVar = (u) interfaceC2177841ALeGz0).LIZ) != null && (c12ir = uVar.LJFF) != null) {
                        interfaceC1645720sva.Co(c12ir);
                        uVar.LJFF = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                try {
                    c1652200t62.LJFF.onRecordRuntimeStateProviderUpdated(null);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        a.LIZIZ.recordService().onDestroyView();
        this.LLLIIIL = null;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || !iLiveOuterService.y3()) {
            return;
        }
        this.LLLILZ = null;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        IStatsForNerdsService iStatsForNerdsService;
        super.onPause();
        if (this.LLLIL != null && (iStatsForNerdsService = (IStatsForNerdsService) PluggableExtentionKt.pluggableSpi$default(IStatsForNerdsService.class, false, false, false, 14, null)) != null) {
            iStatsForNerdsService.onPause();
        }
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "VideoRecordContainerScene onPause");
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        if (((Boolean) C267810AeZ.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJIJJLI(this.LLLILZJ);
            this.LLLILZJ = null;
        }
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LJLLLL() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1650180t2m
    public final InterfaceC2177841ALe LLIZLLLIL() {
        return this.LLLIZZ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final InterfaceC1650230t2r LLLLLLLLL() {
        return this.LLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final NavigationScene LLLLLLLLLL() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final x2 LLLLLLZ() {
        return this.LLLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final ShortVideoContext LLLLLLZZ() {
        return this.LLL;
    }

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return this.LLLJ;
    }

    @Override // X.C0MWS
    public final void LJLL(final boolean z) {
        View view;
        VideoRecordRootView videoRecordRootView = this.LLLF;
        if (videoRecordRootView != null) {
            int visibility = videoRecordRootView.getVisibility();
            videoRecordRootView.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, videoRecordRootView);
        }
        if (z && (view = this.LLLFFI) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C1655440tBG c1655440tBG = this.LLJJLIIIJLLLLLLLZ;
        Iterator it2 = ((ArrayList) c1655440tBG.LLILZIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655400tBC) it2.next()).onHide();
        }
        ((ArrayList) c1655440tBG.LLIZ).add(new InterfaceC1269304xv(z) { // from class: X.04xu
            public final boolean LIZ;

            public final int hashCode() {
                return C786410Ut5.Z2(this.LIZ);
            }

            public final String toString() {
                boolean z2 = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Hide(hideSurface=");
                sbLIZ.append(z2);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = z;
            }

            public final boolean equals(Object obj) {
                boolean z2 = this.LIZ;
                if (!(obj instanceof C1269204xu) || z2 != ((C1269204xu) obj).LIZ) {
                    return false;
                }
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLLJ(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LLLIIIIL = mvChoosePhotoScene;
    }

    public final void LLLLZ(Bundle bundle) {
        boolean z;
        ShortVideoContext shortVideoContextLIZJ = this.LLL;
        if (bundle != null) {
            shortVideoContextLIZJ = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            if (C297290Bl1.LIZ() && shortVideoContextLIZJ != null) {
                shortVideoContextLIZJ.isRestoreFromSaveInstance = true;
            }
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initData with outState,shortVideoContext is NULL:");
            if (shortVideoContextLIZJ == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (this.mArguments == null) {
            this.mArguments = new Bundle();
        }
        if (shortVideoContextLIZJ == null) {
            C0CHQ.LIZ().LJJIZ();
            shortVideoContextLIZJ = C1443540nfU.LIZJ(bundle2, requireAppCompatActivity(), null);
            if (shortVideoContextLIZJ.mIsFromDraft && shortVideoContextLIZJ.shootMode == 16) {
                C1443590nfZ c1443590nfZ = o.LJIIJJI;
                c1443590nfZ.LIZ();
                shortVideoContextLIZJ.cameraComponentModel.mVideoWidth = c1443590nfZ.LIZ;
                C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
                c1443590nfZ2.LIZ();
                shortVideoContextLIZJ.cameraComponentModel.mVideoHeight = c1443590nfZ2.LIZIZ;
                shortVideoContextLIZJ.creativeModel.nowsShootModel = null;
            }
            C201955140j.LIZJ(C201967140v.LIZIZ, "initData with arguments");
        }
        this.LLL = shortVideoContextLIZJ;
        C1448150nmv.LIZIZ(shortVideoContextLIZJ, bundle2, requireAppCompatActivity());
        if (C1448130nmt.LIZIZ || bundle2.getBoolean("is_cold_start", false)) {
            C1448130nmt.LIZIZ = false;
            shortVideoContextLIZJ.creativeModel.recordMobModel.isColdStart = true;
        }
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
        shortVideoContextViewModel.LL = shortVideoContextLIZJ;
        shortVideoContextViewModel.wQ2(shortVideoContextLIZJ.shootMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0463  */
    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r32) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordContainerScene.onActivityCreated(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && ((Boolean) C0AFJ.LIZ.getValue()).booleanValue() && bundle2.getLong("extra_start_record_time", 0L) <= 0) {
            bundle2.putLong("extra_start_record_time", System.currentTimeMillis());
        }
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        C786410Ut5.LJJIJL(bundle, "save_state_short_video_context", this.LLL);
    }

    @Override // X.AbstractC214814194y
    public final boolean processNewArguments(Bundle bundle) {
        CreativeModel creativeModel;
        RecordEffectModel recordEffectModel;
        Bundle bundle2;
        C1655630tBZ c1655630tBZ;
        C201967140v c201967140v = C201967140v.LIZIZ;
        C201955140j.LJIILJJIL(c201967140v, "VideoRecordContainerScene processNewArguments");
        if (bundle == null) {
            return true;
        }
        final C19EG fragmentActivity = getFragmentActivity();
        boolean z = false;
        if (bundle.getBoolean("is_ecom_publish", false) && fragmentActivity != null) {
            IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
            iAVPublishServicePublishService.addPublishProgressToActivity(fragmentActivity, false, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102)), false, null, false);
            iAVPublishServicePublishService.addPublishCallback(new C0MNL() { // from class: X.0nmX
                @Override // X.InterfaceC1433360nP4
                public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z2, PublishModel publishModel) {
                    C19EG c19eg = fragmentActivity;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
                    creativeToastBuilder.iconColorRes(R.attr.a0i);
                    creativeToastBuilder.messageRes(2131832863);
                    creativeToastBuilder.isTuxToast(true);
                    C1390380mHk.LIZ(c19eg, 2005, creativeToastBuilder);
                }
            }, bundle.getString("multi_publish_id"));
            return true;
        }
        if (this.LLL != null && C1688700u2u.LIZ(requireAppCompatActivity())) {
            C1DRG c1drg = this.LLJZIJLIL;
            if (c1drg != null && (c1655630tBZ = (C1655630tBZ) c1drg.LJII(C1655630tBZ.class, null)) != null) {
                c1655630tBZ.LIZ.LIZLLL(new AwS604S0100000_25(bundle, 784), true);
            }
            if (Intrinsics.LJFF("video_edit_page", bundle.getString("enter_from")) && bundle.getBoolean("to_ai_self") && (bundle2 = this.mArguments) != null) {
                C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle2);
            }
            boolean z2 = bundle.getBoolean("recreate_record_and_clear", false);
            ShortVideoContext shortVideoContext = this.LLL;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (recordEffectModel = creativeModel.recordEffectModel) != null) {
                recordEffectModel.autoShowStickerPanel = bundle.getBoolean("sticker_pannel_show", false);
            }
            boolean z3 = bundle.getBoolean("enter_record_from_other_platform", false);
            C569770MWh.LIZLLL(getStartAnimationType(), requireAppCompatActivity());
            if (z2) {
                C201955140j.LIZJ(c201967140v, "VideoRecordContainerScene isClear");
                this.mArguments = bundle;
                LLLLZ(null);
                LLLLZLL();
            } else if (this.LLL == null) {
                LLLLZ(null);
            }
            ShortVideoContext shortVideoContext2 = this.LLL;
            if (shortVideoContext2 != null) {
                if (z3 || shortVideoContext2.microAppModel != null) {
                    z = true;
                }
                shortVideoContext2.mFromOtherPlatform = z;
            }
            return true;
        }
        C201955140j.LJIJI(c201967140v, "close record page because of null shortVideoContext instance when invoking onNewIntent method");
        finish();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsReEnterChoosePhoto(boolean z) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIIIIL;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.setIsReEnterChoosePhoto(false);
        }
    }

    @Override // X.C198Q
    public final void vg(boolean z) {
        e0 e0Var = this.LLLIILIL;
        if (e0Var != null) {
            e0Var.vg(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLZ(boolean z, boolean z2) {
        throw new IllegalStateException("Use LiveApiComponent.onSwitchLiveMode() to replace notAdaptLiveFullScreen()");
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        LLLLLLIL();
        ILayoutPreloadService iLayoutPreloadService = (ILayoutPreloadService) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadService.class, false, false, false, 14, null);
        if (iLayoutPreloadService == null || (viewTd = iLayoutPreloadService.loadLayoutFiles("VideoRecordContainerScene", getSceneContext(), layoutInflater, R.layout.kn, viewGroup, false)) == null) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.kn, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewTd;
        IStatsForNerdsService iStatsForNerdsService = (IStatsForNerdsService) PluggableExtentionKt.pluggableSpi$default(IStatsForNerdsService.class, false, false, false, 14, null);
        if (iStatsForNerdsService != null) {
            iStatsForNerdsService.isOpen();
        }
        this.LLLIL = null;
        return viewGroup2;
    }

    @Override // com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic
    public final void setIsChangeMusicDownloadSuccess(boolean z, MusicModel musicModel, String str) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLLIIIIL;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.setIsChangeMusicDownloadSuccess(true, musicModel, str);
        }
    }
}
