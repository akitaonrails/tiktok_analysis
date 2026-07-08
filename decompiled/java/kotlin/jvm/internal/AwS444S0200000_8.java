package kotlin.jvm.internal;

import X.AnonymousClass0880;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0CHQ;
import X.C0M6S;
import X.C0M87;
import X.C0MAY;
import X.C0MH8;
import X.C0MIN;
import X.C0MJM;
import X.C1398110mUD;
import X.C1452640nuA;
import X.C1664590tQ1;
import X.C1668720tWg;
import X.C1672550tcr;
import X.C1680510tph;
import X.C1680520tpi;
import X.C19712912At;
import X.C201955140j;
import X.C2188811AlT;
import X.C259800zU;
import X.C298260Bma;
import X.C376420EpM;
import X.C383300F1c;
import X.C493401w4;
import X.C562830M5p;
import X.C563550M8j;
import X.C571420Mb6;
import X.C879460Yem;
import X.EnumC1668730tWh;
import X.InterfaceC1631620sYq;
import X.InterfaceC1668850tWt;
import X.InterfaceC1680500tpg;
import X.InterfaceC562800M5m;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IEditorShareHelper;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2;
import com.ss.android.ugc.aweme.service.ISparrowService;
import com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AwS444S0200000_8 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS444S0200000_8(C562830M5p c562830M5p, AwS94S0201000_8 awS94S0201000_8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c562830M5p;
        this.l1 = awS94S0201000_8;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        ISparrowService iSparrowService;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Neo] reportDraftRestoreFailureToNeo success: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C201955140j.LIZIZ("DraftMonitorService", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue && (iSparrowService = (ISparrowService) PluggableExtentionKt.pluggableSpi$default(ISparrowService.class, false, false, false, 14, null)) != null && iSparrowService.getDraftMonitorService() != null) {
            new AwS409S0200000_8((DraftMonitorServiceImpl) awS444S0200000_8.l1, (DraftRestoreResult) awS444S0200000_8.l0, 20);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((AimeCameraScene) awS444S0200000_8.l0).LLLLLLLZIL(AimeCameraScene.LLLLLLLLL((C05P1) awS444S0200000_8.l1), interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        ((AwemeDraft) awS444S0200000_8.l0).LJIJJ.put(obj, obj2);
        ((Map) ((C259800zU) awS444S0200000_8.l1).element).put(obj2, obj);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        IEditorShareHelper.LIZ.getClass();
        IEditorShareHelper value = C0M87.LIZIZ.getValue();
        if (value != null) {
            value.LIZ((VideoPublishEditModel) awS444S0200000_8.l0, C1664590tQ1.LJII((C376420EpM) awS444S0200000_8.l1), null, AFwS239S0000000_8.get$arr$(210));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        int i;
        Bitmap bitmap = (Bitmap) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (bitmap != null) {
            if (C493401w4.LIZ()) {
                if (zBooleanValue) {
                    i = 5;
                } else {
                    i = 3;
                }
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS444S0200000_8.l0;
                PublishPreviewModel publishPreviewModel = videoPublishEditModel.creativeModel.publishPreviewModel;
                C0MH8 c0mh8 = C0MH8.LIZ;
                c0mh8.getClass();
                publishPreviewModel.firstFramePath = C0MH8.LJI(videoPublishEditModel, i);
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS444S0200000_8.l0;
                videoPublishEditModel2.setVideoCoverPath(videoPublishEditModel2.creativeModel.publishPreviewModel.firstFramePath);
                VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) awS444S0200000_8.l0;
                C0MH8.LJIIZILJ(c0mh8, videoPublishEditModel3, bitmap, 0, i, videoPublishEditModel3.creativeModel.publishPreviewModel.firstFramePath, 0, null, new AwS581S0100000_2((Function0) awS444S0200000_8.l1, (Function0<Unit>) 347), 100);
            } else {
                String videoCoverPath = ((VideoPublishEditModel) awS444S0200000_8.l0).getVideoCoverPath();
                if (videoCoverPath != null) {
                    ((VideoPublishEditModel) awS444S0200000_8.l0).creativeModel.publishPreviewModel.firstFramePath = videoCoverPath;
                } else {
                    VideoPublishEditModel videoPublishEditModel4 = (VideoPublishEditModel) awS444S0200000_8.l0;
                    videoPublishEditModel4.creativeModel.publishPreviewModel.firstFramePath = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(videoPublishEditModel4.getCreativeInfo());
                    videoPublishEditModel4.setVideoCoverPath(videoPublishEditModel4.creativeModel.publishPreviewModel.firstFramePath);
                }
                C383300F1c.LJ(bitmap, ((VideoPublishEditModel) awS444S0200000_8.l0).creativeModel.publishPreviewModel.firstFramePath, 100, (Function0) awS444S0200000_8.l1);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS444S0200000_8 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131855780(0x7f1189a4, float:1.9345273E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet r2 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS408S0200000_7 r6 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 44
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131855754(0x7f11898a, float:1.934522E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS552S0100000_8 r6 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 899(0x383, float:1.26E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$13(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AwS444S0200000_8 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131855793(0x7f1189b1, float:1.93453E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem r2 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS408S0200000_7 r8 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 45
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131855792(0x7f1189b0, float:1.9345297E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem r2 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS408S0200000_7 r8 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 46
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$14(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS444S0200000_8 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131855793(0x7f1189b1, float:1.93453E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2 r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2 r2 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS408S0200000_7 r8 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 54
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131855792(0x7f1189b0, float:1.9345297E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2 r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2 r2 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS408S0200000_7 r8 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 56
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$15(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AwS444S0200000_8 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131855780(0x7f1189a4, float:1.9345273E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2 r0 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2 r2 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS408S0200000_7 r6 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 55
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIIZZ(r2, r3, r4, r5, r6, r7)
            r0 = 2131855754(0x7f11898a, float:1.934522E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS552S0100000_8 r6 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 936(0x3a8, float:1.312E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$16(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$17(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((SocialMediaPickerViewModel) awS444S0200000_8.l0).onEvent$social_creation_mediapicker_release(new C563550M8j(iIntValue2, iIntValue));
        Function2 function2 = (Function2) awS444S0200000_8.l1;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C562830M5p c562830M5p = (C562830M5p) awS444S0200000_8.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadAiRemixStatus: ");
        sbLIZ.append(obj);
        sbLIZ.append(", count: ");
        sbLIZ.append(iIntValue);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC562800M5m interfaceC562800M5mLIZIZ = c562830M5p.P5().LIZIZ();
        if (interfaceC562800M5mLIZIZ != null) {
            interfaceC562800M5mLIZIZ.LJ("DraftBoxTidyViewHolder", strLIZIZ);
        }
        if (obj == C0M6S.NONE && iIntValue == 0) {
            Function1 function1 = (Function1) awS444S0200000_8.l1;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        } else {
            Function1 function12 = (Function1) awS444S0200000_8.l1;
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            ((InterfaceC1631620sYq) awS444S0200000_8.l0).invoke((C1672550tcr) awS444S0200000_8.l1, interfaceC1680500tpg, 0);
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            C0MIN c0min = (C0MIN) awS444S0200000_8.l0;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = c0min.LLJILLL;
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            C0MIN c0min2 = (C0MIN) awS444S0200000_8.l0;
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = c0min2.LLJJ;
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            interfaceC1680500tpg.LJ();
            C0MIN c0min3 = (C0MIN) awS444S0200000_8.l0;
            Function0<Unit> function0 = c0min3.LLJJI;
            Function0<Unit> function02 = c0min3.LLJJIII;
            Function0<Unit> function03 = c0min3.LLJJIJI;
            EnumC1668730tWh enumC1668730tWh = (EnumC1668730tWh) c05p0.getValue();
            int iIntValue = ((Number) ((C05P0) objLJJ2).getValue()).intValue();
            String string = ((C0MIN) awS444S0200000_8.l0).LLJJIJIIJIL;
            if (string == null) {
                string = ((ComposeView) awS444S0200000_8.l1).getResources().getString(2131825841);
            }
            C0MIN c0min4 = (C0MIN) awS444S0200000_8.l0;
            C1668720tWg.LIZ(function0, function02, function03, enumC1668730tWh, iIntValue, string, c0min4.LLJJJ, c0min4.LLJJIJIL, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        AVMusic aVMusicM174clone;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = "";
        if (!zBooleanValue) {
            C201955140j.LJIILJJIL(C0MAY.LIZIZ, "illegal draft music checked");
            AwemeDraft awemeDraft = (AwemeDraft) awS444S0200000_8.l0;
            awemeDraft.LJ = null;
            awemeDraft.LJII = null;
            awemeDraft.LJIILJJIL = 0;
            awemeDraft.LJIIJ = 50;
            awemeDraft.LJJJJIZL.isDraftMusicIllegal = true;
            ((Keva) C879460Yem.LIZIZ.getValue()).storeBoolean(awemeDraft.LIZ(), false);
            C1452640nuA.LJII(null, false, ((AwemeDraft) awS444S0200000_8.l0).LIZ.musicBuzModel);
            C571420Mb6 c571420Mb6 = new C571420Mb6();
            c571420Mb6.LIZ = "";
            c571420Mb6.LIZIZ = "";
            c571420Mb6.LIZJ = 0;
            c571420Mb6.LJI = false;
            c571420Mb6.LJII = null;
            AnonymousClass0880.LIZ(((DraftViewModel) awS444S0200000_8.l1).LLJI, c571420Mb6);
        } else if (C19712912At.LIZ.LIZJ()) {
            C201955140j.LJIILJJIL(C0MAY.LIZIZ, "app is running background");
        } else {
            AVMusic aVMusic = ((AwemeDraft) awS444S0200000_8.l0).LJ;
            if (aVMusic != null) {
                aVMusicM174clone = aVMusic.m174clone();
            } else {
                aVMusicM174clone = null;
            }
            aVMusicM174clone.setExtendMusicList(null);
            if (!C298260Bma.LIZ()) {
                C0MJM.LIZJ(new AVMusic(), null);
            }
            aVMusicM174clone.setMusicPriority(99);
            C1452640nuA.LJII(aVMusicM174clone, false, ((AwemeDraft) awS444S0200000_8.l0).LIZ.musicBuzModel);
            AwemeDraft awemeDraft2 = (AwemeDraft) awS444S0200000_8.l0;
            String str2 = awemeDraft2.LJII;
            if (str2 != null) {
                str = str2;
            }
            int i = awemeDraft2.LJIILJJIL;
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("toVideoRecord() called with: path = [");
            sbLIZ.append(str);
            sbLIZ.append("], context = [], musicModel = [");
            sbLIZ.append(aVMusicM174clone);
            sbLIZ.append("], start = [");
            sbLIZ.append(i);
            sbLIZ.append(']');
            C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
            try {
                new JSONObject().put("route", "1");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1398110mUD.LIZ = "draft_page";
            C571420Mb6 c571420Mb62 = new C571420Mb6();
            c571420Mb62.LIZ = aVMusicM174clone.getMusicId();
            c571420Mb62.LIZIZ = str;
            c571420Mb62.LIZJ = i;
            c571420Mb62.LJI = zBooleanValue;
            c571420Mb62.LJII = aVMusicM174clone;
            MusicBuzModel musicBuzModel = ((AwemeDraft) awS444S0200000_8.l0).LIZ.musicBuzModel;
            c571420Mb62.LJIIIIZZ = musicBuzModel.musicOrigin;
            c571420Mb62.LJIIIZ = musicBuzModel.musicSelectedFromDraft;
            AnonymousClass0880.LIZ(((DraftViewModel) awS444S0200000_8.l1).LLJI, c571420Mb62);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS444S0200000_8 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131855798(0x7f1189b6, float:1.934531E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity r0 = (com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity r2 = (com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS408S0200000_7 r8 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 76
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131855797(0x7f1189b5, float:1.9345308E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity r0 = (com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity r2 = (com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS408S0200000_7 r8 = new kotlin.jvm.internal.AwS408S0200000_7
            r0 = 77
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$21(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) awS444S0200000_8.l0;
        mvChoosePhotoScene.ugcTemplateUrl = (String) obj;
        mvChoosePhotoScene.ugcTemplateMd5 = (String) obj2;
        ((Function0) awS444S0200000_8.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS444S0200000_8 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131830681(0x7f112799, float:1.9294366E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r0 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r2 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS409S0200000_8 r6 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 48
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJII(r2, r3, r4, r5, r6, r7)
            r0 = 2131830680(0x7f112798, float:1.9294364E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS552S0100000_8 r6 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 350(0x15e, float:4.9E-43)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$4(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS444S0200000_8 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131828394(0x7f111eaa, float:1.9289728E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r0 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r2 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS409S0200000_8 r6 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 49
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJII(r2, r3, r4, r5, r6, r7)
            r0 = 2131828393(0x7f111ea9, float:1.9289726E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS552S0100000_8 r6 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 351(0x15f, float:4.92E-43)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$5(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS444S0200000_8 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131828391(0x7f111ea7, float:1.9289722E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r0 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r2 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS409S0200000_8 r6 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 50
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJII(r2, r3, r4, r5, r6, r7)
            r0 = 2131828390(0x7f111ea6, float:1.928972E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS552S0100000_8 r6 = new kotlin.jvm.internal.AwS552S0100000_8
            r0 = 352(0x160, float:4.93E-43)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$6(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS444S0200000_8 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131828398(0x7f111eae, float:1.9289736E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r0 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r2 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS409S0200000_8 r8 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 51
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJII(r4, r5, r6, r7, r8, r9)
            r0 = 2131828397(0x7f111ead, float:1.9289734E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r0 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r2 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS409S0200000_8 r8 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 52
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$7(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS444S0200000_8 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L19
            r7.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r5 = (com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel) r5
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r7.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r0 = (com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel) r0
            boolean r4 = r7.LJII(r0)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene r0 = (com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene) r0
            boolean r0 = r7.LJII(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r6.l0
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r3 = (com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel) r3
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene r2 = (com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene) r2
            java.lang.Object r1 = r7.LJJ()
            if (r4 != 0) goto L4b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L55
        L4b:
            kotlin.jvm.internal.AwS409S0200000_8 r1 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 61
            r1.<init>(r3, r2, r0)
            r7.LJJIJIIJI(r1)
        L55:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r7.LJ()
            r0 = 0
            X.C1671520tbC.LIZ(r5, r1, r7, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS444S0200000_8.invoke$8(kotlin.jvm.internal.AwS444S0200000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS444S0200000_8 awS444S0200000_8, Object obj, Object obj2) {
        ((AwemeDraft) awS444S0200000_8.l0).LJIJJ.put(obj, obj2);
        ((Map) ((C259800zU) awS444S0200000_8.l1).element).put(obj2, obj);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS444S0200000_8(C0MIN c0min, ComposeView composeView, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0min;
        this.l1 = composeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super InterfaceC1668850tWt, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2, C1672550tcr c1672550tcr) {
        super(2);
        this.$t = c1672550tcr;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(AwemeDraft awemeDraft, AwemeDraft awemeDraft2, C259800zU<Map<String, String>> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = awemeDraft;
        this.l1 = awemeDraft2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS444S0200000_8(AwemeDraft awemeDraft, DraftViewModel draftViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = awemeDraft;
        this.l1 = draftViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(PcsCourseActivity pcsCourseActivity, PcsCourseActivity pcsCourseActivity2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = pcsCourseActivity;
        this.l1 = pcsCourseActivity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(PcsCourseManagementContainerAssem pcsCourseManagementContainerAssem, PcsCourseManagementContainerAssem pcsCourseManagementContainerAssem2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = pcsCourseManagementContainerAssem;
        this.l1 = pcsCourseManagementContainerAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(PcsCoursePriceTierSheet pcsCoursePriceTierSheet, PcsCoursePriceTierSheet pcsCoursePriceTierSheet2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = pcsCoursePriceTierSheet;
        this.l1 = pcsCoursePriceTierSheet2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(PcsCourseManagementContainerAssemV2 pcsCourseManagementContainerAssemV2, PcsCourseManagementContainerAssemV2 pcsCourseManagementContainerAssemV22, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = pcsCourseManagementContainerAssemV2;
        this.l1 = pcsCourseManagementContainerAssemV22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(PcsCoursePriceTierSheetV2 pcsCoursePriceTierSheetV2, PcsCoursePriceTierSheetV2 pcsCoursePriceTierSheetV22, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = pcsCoursePriceTierSheetV2;
        this.l1 = pcsCoursePriceTierSheetV22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS444S0200000_8(DraftMonitorServiceImpl draftMonitorServiceImpl, DraftRestoreResult draftRestoreResult, int i) {
        super(2);
        this.$t = i;
        this.l1 = draftMonitorServiceImpl;
        this.l0 = draftRestoreResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS444S0200000_8(VideoPublishEditModel videoPublishEditModel, C376420EpM c376420EpM, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c376420EpM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = videoPublishEditModel;
        this.l1 = videoPublishEditModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS444S0200000_8(AimeCameraScene aimeCameraScene, C05P0 c05p0, int i) {
        super(2);
        this.$t = i;
        this.l0 = aimeCameraScene;
        this.l1 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(MvChoosePhotoScene mvChoosePhotoScene, MvChoosePhotoScene mvChoosePhotoScene2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = mvChoosePhotoScene;
        this.l1 = mvChoosePhotoScene2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(EditCaptionScene editCaptionScene, EditCaptionScene editCaptionScene2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = editCaptionScene;
        this.l1 = editCaptionScene2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS444S0200000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, SocialMediaPickerPageScene socialMediaPickerPageScene, int i) {
        super(2);
        this.$t = i;
        this.l0 = socialMediaPickerViewModel;
        this.l1 = socialMediaPickerPageScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS444S0200000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, SocialMediaPickerViewModel socialMediaPickerViewModel2, Function2<? super Integer, ? super Integer, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = socialMediaPickerViewModel;
        this.l1 = socialMediaPickerViewModel2;
    }
}
