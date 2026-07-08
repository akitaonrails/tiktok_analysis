package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.AnonymousClass1915;
import X.C0CHQ;
import X.C0M2U;
import X.C0SQV;
import X.C1428470nHB;
import X.C1437510nVl;
import X.C1443400nfG;
import X.C1443990ngD;
import X.C1447800nmM;
import X.C1455550nyr;
import X.C1653260t7k;
import X.C1CP7;
import X.C2188811AlT;
import X.C289610BWt;
import X.C443120HZe;
import X.C569760MWg;
import X.C571290Mat;
import X.C621180OYa;
import X.C855120Xgc;
import X.C885630Yoj;
import X.C888110Ysj;
import X.RunnableC855390Xh3;
import Y.AObjectS357S0100000_14;
import Y.AObjectS389S0100000_14;
import Y.AObjectS67S0000000_14;
import android.util.ArrayMap;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestBottomContainerAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishPreviewViewPagerScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes15.dex */
public class AkS85S0100000_14 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS85S0100000_14(VideoPublishContainerScene videoPublishContainerScene, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = videoPublishContainerScene;
    }

    public static final void LIZ$0(AkS85S0100000_14 akS85S0100000_14, View view) {
        ((C888110Ysj) akS85S0100000_14.l0).setTabSelected(true);
    }

    public static final void LIZ$1(AkS85S0100000_14 akS85S0100000_14, View view) {
        if (!C885630Yoj.LIZIZ() || ((MessageRequestBottomContainerAssem) akS85S0100000_14.l0).mp().CQ2()) {
            ((MessageRequestBottomContainerAssem) akS85S0100000_14.l0).mp().vQ2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0262 A[LOOP:3: B:71:0x025c->B:73:0x0262, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$10(irm.AkS85S0100000_14 r21, android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS85S0100000_14.LIZ$10(irm.AkS85S0100000_14, android.view.View):void");
    }

    public static final void LIZ$11(AkS85S0100000_14 akS85S0100000_14, View view) {
        ((BaseMessageRequestChatListCell) akS85S0100000_14.l0).P5();
    }

    public static final void LIZ$2(AkS85S0100000_14 akS85S0100000_14, View view) {
        ((MessageRequestBottomContainerAssem) akS85S0100000_14.l0).mp().wQ2();
    }

    public static final void LIZ$3(AkS85S0100000_14 akS85S0100000_14, View view) {
        ((MessageRequestBottomContainerAssem) akS85S0100000_14.l0).mp().xQ2();
    }

    public static final void LIZ$4(AkS85S0100000_14 akS85S0100000_14, View view) {
        C621180OYa.LIZIZ.LJLI();
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) akS85S0100000_14.l0;
        CreativeModel creativeModel = videoPublishContainerScene.LLLLIILL.creativeModel;
        creativeModel.shortcutPublishStatusModel.LIZ = true;
        creativeModel.transientPostPageModel.LJJ = "top_publish";
        videoPublishContainerScene.v();
        ((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL.creativeModel.transientPostPageModel.LJJ = "root";
    }

    public static final void LIZ$5(AkS85S0100000_14 akS85S0100000_14, View view) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) akS85S0100000_14.l0;
        CreativeModel creativeModel = videoPublishContainerScene.LLLLIILL.creativeModel;
        creativeModel.shortcutPublishStatusModel.LIZ = true;
        creativeModel.transientPostPageModel.LJJ = "top_submit";
        videoPublishContainerScene.v();
        ((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL.creativeModel.transientPostPageModel.LJJ = "root";
    }

    public static final void LIZ$6(AkS85S0100000_14 akS85S0100000_14, View view) throws Throwable {
        if (((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL.isDirectToPublishByNewExp()) {
            if (!C571290Mat.LIZJ(((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL) && !C571290Mat.LIZLLL(((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL)) {
                if (C289610BWt.LIZ(((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL)) {
                    ((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLLLLLLL(Boolean.FALSE);
                }
            } else {
                ((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL.getCreativeModel().transientPostPageModel.LJJJLIIL = true;
                ((VideoPublishContainerScene) akS85S0100000_14.l0).LLLLIILL.getCreativeModel().transientPostPageModel.LJJJLZIJ = true;
                ((VideoPublishContainerScene) akS85S0100000_14.l0).w();
            }
        }
    }

    public static final void LIZ$7(AkS85S0100000_14 akS85S0100000_14, View view) throws Throwable {
        ((VideoPublishContainerScene) akS85S0100000_14.l0).r(0);
    }

    public static final void LIZ$8(AkS85S0100000_14 akS85S0100000_14, View view) throws Throwable {
        ((VideoPublishContainerScene) akS85S0100000_14.l0).r(0);
    }

    public static final void LIZ$9(AkS85S0100000_14 akS85S0100000_14, View view) throws Throwable {
        Scene imagePublishPreviewScene;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) akS85S0100000_14.l0;
        videoPublishContainerScene.getClass();
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(videoPublishContainerScene);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLJL();
            Scene sceneLLLLIIIILLL = navigationSceneLIZ.LLLLIIIILLL();
            if (sceneLLLLIIIILLL != null && navigationSceneLIZ.LLLLLIL(sceneLLLLIIIILLL)) {
                return;
            }
        }
        C0M2U c0m2u = C0M2U.LIZ;
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
        c0m2u.getClass();
        AnonymousClass1915 anonymousClass1915 = null;
        C0M2U.LIZ(videoPublishEditModel, "preview", null);
        C1653260t7k.LIZ("click_publish_preview_entrance");
        VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLLLIILL;
        if (videoPublishEditModel2 != null && C1455550nyr.LIZ(videoPublishEditModel2)) {
            C1CP7.LIZ.getClass();
            C1CP7.LIZJ();
        }
        videoPublishContainerScene.LLLILZJ.setShouldDisableTrim(true);
        videoPublishContainerScene.N(true);
        C443120HZe<String, UrlModel, Integer> c443120HZeLJIILLIIL = C1443400nfG.LJIILLIIL(videoPublishContainerScene.LLLLL);
        String first = c443120HZeLJIILLIIL.getFirst();
        UrlModel second = c443120HZeLJIILLIIL.getSecond();
        Integer third = c443120HZeLJIILLIIL.getThird();
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchorText: ");
        sbLIZ.append(first);
        sbLIZ.append(", anchorUrl: ");
        sbLIZ.append(second);
        sbLIZ.append(", anchorIconRawId: ");
        sbLIZ.append(third);
        sbLIZ.append(", isDisplayAnchor: ");
        sbLIZ.append(C1443400nfG.LJIIL(videoPublishContainerScene.LLLLL));
        c1437510nVlLJJLIIIJ.LIZJ("video_preview", C2188811AlT.LIZIZ(sbLIZ));
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModel3 = videoPublishContainerScene.LLLLIILL;
        String strLJII = videoPublishContainerScene.LLLF.LJII(true);
        c1443990ngD.getClass();
        C1443990ngD.LJFF(videoPublishEditModel3, strLJII, false, true);
        if (!C1428470nHB.LJJZZI(videoPublishContainerScene.LLLLIILL)) {
            return;
        }
        C0SQV c0sqv = new C0SQV();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("transition_name_thumbnail", c0sqv);
        AnonymousClass1915 anonymousClass19152 = new AnonymousClass1915(arrayMap);
        anonymousClass19152.LIZIZ = new RunnableC855390Xh3();
        if (C855120Xgc.LIZ()) {
            imagePublishPreviewScene = new ImagePublishPreviewViewPagerScene(videoPublishContainerScene.LLLLIILL, first, second, videoPublishContainerScene.LLLZI(), videoPublishContainerScene.LLLLIILL.creativeModel.transientPostPageModel.LJJI, 0, new AObjectS389S0100000_14(videoPublishContainerScene, 20), new AObjectS67S0000000_14(5), videoPublishContainerScene.LLLF.LIZIZ.getPureHashtagLength(), new AObjectS357S0100000_14(videoPublishContainerScene, 0), new AObjectS357S0100000_14(videoPublishContainerScene, 2));
        } else {
            imagePublishPreviewScene = new ImagePublishPreviewScene(videoPublishContainerScene.LLLLIILL, first, second, videoPublishContainerScene.LLLZI(), videoPublishContainerScene.LLLLIILL.creativeModel.transientPostPageModel.LJJI, 0, new AObjectS389S0100000_14(videoPublishContainerScene, 8), new AObjectS67S0000000_14(5), false, videoPublishContainerScene.LLLF.LIZIZ.getPureHashtagLength(), null, new AObjectS357S0100000_14(videoPublishContainerScene, 4), new AObjectS357S0100000_14(videoPublishContainerScene, 6), false);
            anonymousClass1915 = anonymousClass19152;
        }
        C569760MWg c569760MWg = new C569760MWg();
        if (navigationSceneLIZ == null || anonymousClass1915 == null) {
            return;
        }
        c569760MWg.LIZJ = anonymousClass1915;
        navigationSceneLIZ.LLLLLLLLLL(imagePublishPreviewScene, c569760MWg.LIZ());
    }

    public AkS85S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
