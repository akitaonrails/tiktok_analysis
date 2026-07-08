package kotlin.jvm.internal;

import X.C01GW;
import X.C01QU;
import X.C098200Yq;
import X.C09AY;
import X.C0C64;
import X.C0E48;
import X.C0L7R;
import X.C0L9L;
import X.C0LJD;
import X.C0LJE;
import X.C0LJP;
import X.C0MAY;
import X.C0MIK;
import X.C0MIT;
import X.C1322110kVd;
import X.C1403010mc7;
import X.C1428470nHB;
import X.C1457450o1v;
import X.C15438062q;
import X.C1660680tJi;
import X.C189200o6;
import X.C19EG;
import X.C201955140j;
import X.C214799194j;
import X.C2253508sH;
import X.C2275708vr;
import X.C2292008yU;
import X.C259800zU;
import X.C341530DaB;
import X.C348390DlF;
import X.C361680EFy;
import X.C563770M9f;
import X.C566110MIf;
import X.C569440MVa;
import X.C569580MVo;
import X.C574170MfX;
import X.EnumC563950M9x;
import X.InterfaceC1737690vJv;
import X.InterfaceC497601wk;
import X.InterfaceC566130MIh;
import X.InterfaceC574250Mff;
import X.InterfaceC574340Mfo;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.external.router.OpenVideoEditInterceptor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.StickPointRecommendMusicTimeOutOpt;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS137S0400000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS137S0400000_8 awS137S0400000_8) {
        C0LJP c0ljp = C0LJP.LIZ;
        String[] strArr = (String[]) awS137S0400000_8.l0;
        C19EG c19eg = (C19EG) awS137S0400000_8.l1;
        c0ljp.getClass();
        boolean zLIZ = C0LJP.LIZ(strArr, c19eg);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS137S0400000_8.l2;
        if (videoPublishEditModel != null) {
            C361680EFy.LJJJJLI(videoPublishEditModel, (C0E48) awS137S0400000_8.l3, true, zLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS137S0400000_8 awS137S0400000_8) {
        return new C569580MVo(((C569440MVa) awS137S0400000_8.l0).getDiContainer(), (Uri) awS137S0400000_8.l1, new AwS217S0300000_8((C259800zU) awS137S0400000_8.l2, (C259800zU<String>) awS137S0400000_8.l3, (C259800zU<C214799194j>) awS137S0400000_8.l0, (C569440MVa) 12));
    }

    public static final Object invoke$2(AwS137S0400000_8 awS137S0400000_8) {
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        final OpenVideoEditInterceptor openVideoEditInterceptor = (OpenVideoEditInterceptor) awS137S0400000_8.l0;
        final CreativeInitialModel creativeInitialModel = (CreativeInitialModel) awS137S0400000_8.l1;
        final Context context = (Context) awS137S0400000_8.l2;
        final EditConfig editConfig = (EditConfig) awS137S0400000_8.l3;
        iExternalService.asyncService("other_platform", new IExternalService.ServiceLoadCallback() { // from class: X.0Mpk
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                openVideoEditInterceptor.getClass();
                CreativeInitialModel creativeInitialModel2 = creativeInitialModel;
                if (creativeInitialModel2 != null) {
                    creativeInitialModel2.vqEvaluationConfig = null;
                    VQEvaluationConfig vQEvaluationConfig = creativeInitialModel2.vqEvaluationConfig;
                    if (vQEvaluationConfig != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VQEvaluation ; VQEvaluationConfig : ");
                        sbLIZ.append(GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), vQEvaluationConfig));
                        C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                        IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
                        if (iToolsVQEvaluationService != null) {
                            iToolsVQEvaluationService.LIZJ();
                            if (Unit.LIZ != null) {
                                return;
                            }
                        }
                    }
                }
                asyncAVService.uiService().editService().startEdit(context, editConfig);
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS137S0400000_8 awS137S0400000_8) {
        VideoPublishEditModel videoPublishEditModel;
        long jLJIJJLI;
        if (C2292008yU.LIZ() && (videoPublishEditModel = (VideoPublishEditModel) awS137S0400000_8.l0) != null) {
            C0L7R c0l7r = (C0L7R) awS137S0400000_8.l1;
            ShortVideoContext shortVideoContext = (ShortVideoContext) awS137S0400000_8.l2;
            List list = (List) awS137S0400000_8.l3;
            try {
                C1403010mc7.LIZ.getMusicService().al();
                C2275708vr.LJI(C1428470nHB.LJIILL(videoPublishEditModel), C1428470nHB.LJIILIIL(videoPublishEditModel), videoPublishEditModel.getCreationId());
                C01GW c01gw = StickPointRecommendMusicTimeOutOpt.LIZIZ;
                if (((StickPointRecommendMusicTimeOutOpt.StickPointRecommendMusicTimeOutOptConfig) c01gw.getValue()).isEnable) {
                    jLJIJJLI = ((StickPointRecommendMusicTimeOutOpt.StickPointRecommendMusicTimeOutOptConfig) c01gw.getValue()).uploadFrameTimeoutMs;
                } else {
                    jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 2000L, "cloud_content_understanding_video_timeout", true);
                }
                C2253508sH c2253508sH = C2253508sH.LIZ;
                C1457450o1v c1457450o1v = C1457450o1v.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((MediaModel) it2.next()).LJFF());
                }
                ContentUnderstandingRequest contentUnderstandingRequestLIZ = C1457450o1v.LIZ(c1457450o1v, videoPublishEditModel, arrayList, null, 4);
                c2253508sH.getClass();
                return (String) C2253508sH.LJII(contentUnderstandingRequestLIZ).LJLJI(jLJIJJLI, TimeUnit.MILLISECONDS).LIZLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c0l7r.getClass();
                    C0L7R.LJJIIJZLJL(shortVideoContext, "upload_frame", "failure(UnderstandingKeyException)", 0L, null);
                }
            }
        }
        return null;
    }

    public static final Object invoke$4(AwS137S0400000_8 awS137S0400000_8) {
        String resourceId;
        Effect effect;
        C566110MIf c566110MIf = C566110MIf.LIZ;
        C0MIK c0mik = (C0MIK) awS137S0400000_8.l0;
        String str = c0mik.LJIIJJI;
        String str2 = c0mik.LJIIIZ.shootWay;
        if (str.length() > 0 && (effect = ((C0MIK) awS137S0400000_8.l0).LJIJ) != null) {
            resourceId = effect.getResourceId();
        } else {
            resourceId = null;
        }
        c566110MIf.getClass();
        C566110MIf.LIZ(str, str, str2, resourceId, "scan_page");
        ((C0MIK) awS137S0400000_8.l0).LIZLLL((InterfaceC566130MIh) awS137S0400000_8.l1);
        ((NavigationScene) awS137S0400000_8.l2).LLLLLLLZIL((InterfaceC1737690vJv) awS137S0400000_8.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS137S0400000_8 awS137S0400000_8) {
        ((C0MIK) awS137S0400000_8.l0).LIZJ((InterfaceC566130MIh) awS137S0400000_8.l1, (NavigationScene) awS137S0400000_8.l2, (C0MIT) awS137S0400000_8.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.0DlF] */
    public static final Object invoke$6(AwS137S0400000_8 awS137S0400000_8) {
        ((C259800zU) awS137S0400000_8.l0).element = ((InterfaceC574250Mff) ((C574170MfX) awS137S0400000_8.l1).LJJIJIIJIL.getValue()).LIZ((NLEEditor) awS137S0400000_8.l2, (InterfaceC574340Mfo) awS137S0400000_8.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS137S0400000_8 awS137S0400000_8) {
        C563770M9f c563770M9fLIZLLL;
        C341530DaB c341530DaB = C341530DaB.LIZ;
        Activity activity = (Activity) awS137S0400000_8.l0;
        C01QU c01qu = new C01QU((InterfaceC497601wk) awS137S0400000_8.l2, (StoryHighlightsCreationVM) awS137S0400000_8.l1, (Context) awS137S0400000_8.l3);
        c341530DaB.getClass();
        EnterStoryParam enterStoryParam = new EnterStoryParam(null, null, null, null, null, null, null, null, null, false, false, false, 0, 0.0f, 0, AFwS194S0000000_8.get$arr$(381), new SocialMediaPickerConfig(new SocialMediaPickerConfig.PageUIConfig(true, EnumC563950M9x.STORY_STYLE, false), new SocialMediaPickerConfig.TitleAreaUIConfig(false, true, null, null), null, null, null, new SocialMediaPickerConfig.MediaAreaUIConfig(true, false, false, C0L9L.WIDTH_HEIGHT_1_1, false), new SocialMediaPickerConfig.MediaLoadingStrategy(C0LJE.IMAGE_ONLY, false, false, C0LJD.FIXED_TOP), new SocialMediaPickerConfig.MediaSelectorStrategy(false, 1, false, true), false, false, false), null, null, null, null, false, null, false, null, null, 67010559, null);
        SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
        if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
            c563770M9fLIZLLL.requestPermission(activity, enterStoryParam, c563770M9fLIZLLL.chooseBPEAToken("bpea-story_profile_photo_request_read_storage_permission_2_target34", "bpea-story_profile_photo_request_read_storage_permission_2_target33", "bpea-story_profile_photo_request_read_storage_permission_2"), new AwS217S0300000_8(activity, enterStoryParam, c01qu, 33), null);
        }
        ((StoryHighlightsCreationVM) awS137S0400000_8.l1).zJ("click_cover_upload", null);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS137S0400000_8 r5) {
        /*
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel r0 = r0.getCoverPublishModel()
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.editSticker.model.EffectTextModel r1 = r0.getEffectTextModel()
            if (r1 == 0) goto L1c
            java.lang.Object r0 = r5.l1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L46
            android.graphics.Bitmap r4 = r1.mergeCoverText(r0)
            if (r4 != 0) goto L20
        L1c:
            java.lang.Object r4 = r5.l1
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L20:
            java.lang.Object r0 = r5.l2
            X.19EG r0 = (X.C19EG) r0
            if (r0 == 0) goto L43
            java.lang.Object r3 = r5.l3
            X.0kVd r3 = (X.C1322110kVd) r3
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r2
            android.content.res.Resources r1 = r0.getResources()
            X.0HaJ r0 = new X.0HaJ
            r0.<init>(r1, r4)
            r3.setImageDrawable(r0)
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L43
            X.C565950MHp.LIZ(r2)
        L43:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS137S0400000_8.invoke$8(kotlin.jvm.internal.AwS137S0400000_8):java.lang.Object");
    }

    public static final Object invoke$9(AwS137S0400000_8 awS137S0400000_8) {
        C0MAY c0may = C0MAY.LIZIZ;
        C201955140j.LJII(c0may, "[DraftRoute] NLEDraftBuilder fetch audio enhance model failed");
        ((NLEEditor) awS137S0400000_8.l0).done();
        ((VideoPublishEditModel) awS137S0400000_8.l1).setNleData(((NLEEditor) awS137S0400000_8.l0).store());
        C1428470nHB.LLIIZ((Intent) awS137S0400000_8.l2, (VideoPublishEditModel) awS137S0400000_8.l1);
        C1660680tJi.LIZ().LJIIJ((Context) awS137S0400000_8.l3, (Intent) awS137S0400000_8.l2);
        C201955140j.LJIILJJIL(c0may, "[DraftRoute] openVideoPublishPage done (nleImpl+audioEnhance failed)");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S0400000_8(C259800zU c259800zU, C259800zU<C348390DlF> c259800zU2, C574170MfX c574170MfX, NLEEditor nLEEditor, InterfaceC574340Mfo interfaceC574340Mfo) {
        super(0);
        this.$t = interfaceC574340Mfo;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c574170MfX;
        this.l3 = nLEEditor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0400000_8(C0MIK c0mik, InterfaceC566130MIh interfaceC566130MIh, NavigationScene navigationScene, C0MIT c0mit, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0mik;
        this.l1 = interfaceC566130MIh;
        this.l2 = navigationScene;
        this.l3 = c0mit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0400000_8(C0MIK c0mik, InterfaceC566130MIh interfaceC566130MIh, NavigationScene navigationScene, InterfaceC1737690vJv interfaceC1737690vJv, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0mik;
        this.l1 = interfaceC566130MIh;
        this.l2 = navigationScene;
        this.l3 = interfaceC1737690vJv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S0400000_8(C569440MVa c569440MVa, C569440MVa c569440MVa2, Uri uri, C259800zU<String> c259800zU, C259800zU<C214799194j> c259800zU2) {
        super(0);
        this.$t = c259800zU2;
        this.l0 = c569440MVa;
        this.l1 = c569440MVa2;
        this.l2 = uri;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0400000_8(Activity activity, StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC497601wk interfaceC497601wk, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = activity;
        this.l1 = storyHighlightsCreationVM;
        this.l2 = interfaceC497601wk;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0400000_8(Bitmap bitmap, C19EG c19eg, C1322110kVd c1322110kVd, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = bitmap;
        this.l2 = c19eg;
        this.l3 = c1322110kVd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0400000_8(NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel, Intent intent, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = nLEEditor;
        this.l1 = videoPublishEditModel;
        this.l2 = intent;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0400000_8(OpenVideoEditInterceptor openVideoEditInterceptor, CreativeInitialModel creativeInitialModel, Context context, EditConfig editConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = openVideoEditInterceptor;
        this.l1 = creativeInitialModel;
        this.l2 = context;
        this.l3 = editConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS137S0400000_8(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, C0L7R c0l7r, ShortVideoContext shortVideoContext, List<? extends MediaModel> list) {
        super(0);
        this.$t = list;
        this.l0 = videoPublishEditModel;
        this.l1 = videoPublishEditModel2;
        this.l2 = c0l7r;
        this.l3 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0400000_8(String[] strArr, C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, int i) {
        super(0);
        this.$t = i;
        this.l0 = strArr;
        this.l1 = c19eg;
        this.l2 = videoPublishEditModel;
        this.l3 = c0e48;
    }
}
