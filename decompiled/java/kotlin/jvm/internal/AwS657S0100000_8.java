package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C0MMC;
import X.C1666020tSK;
import X.C1666410tSx;
import X.C1674390tfp;
import X.C1680510tph;
import X.C2243608qg;
import X.C23260099m;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC522380KeC;
import com.ss.android.ugc.aweme.creative.model.NewBackgroundVideoPipelineModel;
import com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS657S0100000_8 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS657S0100000_8(C05P0 c05p0, C05P0<String> c05p02) {
        super(3);
        this.$t = c05p02;
        this.l0 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(C23260099m c23260099m, int i) {
        super(3);
        this.$t = i;
        this.l0 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(PcsCourseActivity pcsCourseActivity, int i) {
        super(3);
        this.$t = i;
        this.l0 = pcsCourseActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(PcsCourseManagementContainerAssem pcsCourseManagementContainerAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pcsCourseManagementContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(PcsCoursePriceTierSheet pcsCoursePriceTierSheet, int i) {
        super(3);
        this.$t = i;
        this.l0 = pcsCoursePriceTierSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(PcsCourseManagementContainerAssemV2 pcsCourseManagementContainerAssemV2, int i) {
        super(3);
        this.$t = i;
        this.l0 = pcsCourseManagementContainerAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(PcsCoursePriceTierSheetV2 pcsCoursePriceTierSheetV2, int i) {
        super(3);
        this.$t = i;
        this.l0 = pcsCoursePriceTierSheetV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(ShortVideoContext shortVideoContext, int i) {
        super(3);
        this.$t = i;
        this.l0 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(MvChoosePhotoScene mvChoosePhotoScene, int i) {
        super(3);
        this.$t = i;
        this.l0 = mvChoosePhotoScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(EditCaptionScene editCaptionScene, int i) {
        super(3);
        this.$t = i;
        this.l0 = editCaptionScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = socialMediaPickerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS657S0100000_8(StoryHighlightsCreationVM storyHighlightsCreationVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = storyHighlightsCreationVM;
    }

    public static final Object invoke$0(AwS657S0100000_8 awS657S0100000_8, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        C2243608qg.LIZ(obj2, (InterfaceC1364105Vn) awS657S0100000_8.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS657S0100000_8 awS657S0100000_8, Object obj, Object obj2, Object obj3) {
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) obj;
        List<? extends TikTokMediaModel> list = (List) obj2;
        String str = (String) obj3;
        InterfaceC522380KeC interfaceC522380KeC = ((MvChoosePhotoScene) awS657S0100000_8.l0).autoPickCoordinator;
        if (interfaceC522380KeC != null) {
            interfaceC522380KeC.ce2(tikTokMediaModel, list, str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r0 = r2 & 6
            r4 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L9c
            r0 = 4
        L20:
            r2 = r2 | r0
        L21:
            r1 = r2 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r2 & 14
            r2 = 1
            r1 = 0
            if (r0 != r4) goto L9a
            r0 = 1
        L40:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L58
        L4f:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 4
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L58:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r0 = 2131855781(0x7f1189a5, float:1.9345275E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = "90"
            r2[r1] = r0
            r1 = 2131755958(0x7f1003b6, float:1.914281E38)
            r0 = 90
            java.lang.String r10 = X.C497740JfY.LJIIL(r1, r0, r2)
            r8 = 0
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet r1 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet) r1
            r0 = 13
            r2.<init>(r1, r4, r0)
            r0 = 1399679928(0x536d6bb8, float:1.0197145E12)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r5 = 1
            r7 = 0
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L9a:
            r0 = 0
            goto L40
        L9c:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$10(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS657S0100000_8 awS657S0100000_8, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1674390tfp.LIZJ((StoryHighlightsCreationVM) awS657S0100000_8.l0, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8c
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8a
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 6
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131855794(0x7f1189b2, float:1.9345301E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2 r1 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2) r1
            r0 = 15
            r2.<init>(r1, r4, r0)
            r0 = 497160468(0x1da21114, float:4.28987E-21)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8a:
            r0 = 0
            goto L3e
        L8c:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$12(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r0 = r2 & 6
            r4 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L9c
            r0 = 4
        L20:
            r2 = r2 | r0
        L21:
            r1 = r2 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r2 & 14
            r2 = 1
            r1 = 0
            if (r0 != r4) goto L9a
            r0 = 1
        L40:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L58
        L4f:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 7
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L58:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r0 = 2131855781(0x7f1189a5, float:1.9345275E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = "90"
            r2[r1] = r0
            r1 = 2131755958(0x7f1003b6, float:1.914281E38)
            r0 = 90
            java.lang.String r10 = X.C497740JfY.LJIIL(r1, r0, r2)
            r8 = 0
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2 r1 = (com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2) r1
            r0 = 16
            r2.<init>(r1, r4, r0)
            r0 = 264125748(0xfbe3d34, float:1.8759021E-29)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r5 = 1
            r7 = 0
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L9a:
            r0 = 0
            goto L40
        L9c:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$13(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8d
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8b
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 9
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131855799(0x7f1189b7, float:1.9345312E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity r1 = (com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity) r1
            r0 = 21
            r2.<init>(r1, r4, r0)
            r0 = 1873914397(0x6fb1aa1d, float:1.09969E29)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8b:
            r0 = 0
            goto L3e
        L8d:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$14(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8b
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L89
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 0
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131830678(0x7f112796, float:1.929436E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r1 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r1
            r0 = 4
            r2.<init>(r1, r4, r0)
            r0 = -654590849(0xffffffffd8fbbc7f, float:-2.214296E15)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L89:
            r0 = 0
            goto L3e
        L8b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$2(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8b
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L89
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 1
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131828392(0x7f111ea8, float:1.9289724E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r1 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r1
            r0 = 5
            r2.<init>(r1, r4, r0)
            r0 = -391200234(0xffffffffe8aec216, float:-6.602176E24)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L89:
            r0 = 0
            goto L3e
        L8b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$3(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8b
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L89
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 3
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131828399(0x7f111eaf, float:1.9289738E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene r1 = (com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene) r1
            r0 = 7
            r2.<init>(r1, r4, r0)
            r0 = 456332878(0x1b33164e, float:1.481374E-22)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L89:
            r0 = 0
            goto L3e
        L8b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$4(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS657S0100000_8 awS657S0100000_8, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1666410tSx.LIZJ((SocialMediaPickerViewModel) awS657S0100000_8.l0, InterfaceC1685750ty9.LIZ, interfaceC1680500tpg, 48, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS657S0100000_8 awS657S0100000_8, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            String str = (String) ((C05P0) awS657S0100000_8.l0).getValue();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            C05P0 c05p0 = (C05P0) awS657S0100000_8.l0;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS552S0100000_8(c05p0, (C05P0<String>) 366);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg.LJ();
            C1666020tSK.LIZ(432, 0, interfaceC1680500tpg, InterfaceC1685750ty9.LIZ, str, (Function0) objLJJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS657S0100000_8 awS657S0100000_8, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        NewBackgroundVideoPipelineModel newBackgroundVideoPipelineModel = ((ShortVideoContext) awS657S0100000_8.l0).creativeModel.newVideoPipelineExtraModel;
        newBackgroundVideoPipelineModel.outputPath = (String) obj;
        newBackgroundVideoPipelineModel.videoName = (String) obj2;
        newBackgroundVideoPipelineModel.isNewVideoPipelineEnabled = zBooleanValue;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS657S0100000_8 awS657S0100000_8, Object obj, Object obj2, Object obj3) {
        C2243608qg.LIZ(new C0MMC((String) obj, (Effect) obj2), (InterfaceC1364105Vn) awS657S0100000_8.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS657S0100000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8c
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8a
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 5
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131855794(0x7f1189b2, float:1.9345301E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS444S0200000_8 r2 = new kotlin.jvm.internal.AwS444S0200000_8
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem r1 = (com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem) r1
            r0 = 14
            r2.<init>(r1, r4, r0)
            r0 = 1198676248(0x47725918, float:62041.094)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8a:
            r0 = 0
            goto L3e
        L8c:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS657S0100000_8.invoke$9(kotlin.jvm.internal.AwS657S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
