package kotlin.jvm.internal;

import X.C09AY;
import X.C0FQS;
import X.C0LAB;
import X.C0LDJ;
import X.C0MP7;
import X.C0MVT;
import X.C11KT;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390380mHk;
import X.C19EG;
import X.C2341909Fp;
import X.C299100Bnw;
import X.C381350ExJ;
import X.C523390Kfp;
import X.C525290Kit;
import X.C536350L1t;
import X.C538050L8h;
import X.C540060LGa;
import X.C564410MBr;
import X.C565060MEe;
import X.C576730Mjf;
import X.C576760Mji;
import X.C576790Mjl;
import X.InterfaceC2329309At;
import X.InterfaceC2342209Fs;
import X.InterfaceC537900L7s;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS157S1100000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS157S1100000_8 awS157S1100000_8) {
        Activity activityLIZ = C1388190mED.LIZ((Context) awS157S1100000_8.l1);
        if (activityLIZ != null) {
            String str = awS157S1100000_8.s0;
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS157S1100000_8 awS157S1100000_8) {
        String creationId;
        ((MvChoosePhotoScene) awS157S1100000_8.l1).fullRefreshMediaSelectorData();
        C540060LGa c540060LGa = C540060LGa.LIZ;
        String str = awS157S1100000_8.s0;
        ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) awS157S1100000_8.l1).shortVideoContext;
        c540060LGa.getClass();
        String strLJFF = C540060LGa.LJFF(shortVideoContext, str);
        String strLIZLLL = C540060LGa.LIZLLL(((MvChoosePhotoScene) awS157S1100000_8.l1).getChooseScene$tools_camera_record_release(), new C525290Kit((MvChoosePhotoScene) awS157S1100000_8.l1));
        C523390Kfp c523390Kfp = C523390Kfp.LIZ;
        ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) awS157S1100000_8.l1).shortVideoContext;
        if (shortVideoContext2 == null || (creationId = shortVideoContext2.getCreationId()) == null) {
            creationId = "";
        }
        c523390Kfp.getClass();
        C523390Kfp.LIZJ(strLJFF, strLIZLLL, creationId, true);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS157S1100000_8 awS157S1100000_8) {
        String creationId;
        String str;
        String str2;
        String str3;
        if (C299100Bnw.LIZ()) {
            C536350L1t c536350L1t = ((SocialMediaPickerViewModel) awS157S1100000_8.l1).LLL;
            if (c536350L1t != null) {
                String str4 = awS157S1100000_8.s0;
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                ShortVideoContext shortVideoContext = c536350L1t.LJII;
                if (shortVideoContext != null) {
                    creationId = shortVideoContext.getCreationId();
                } else {
                    creationId = null;
                }
                c0lab.LJ("creation_id", creationId);
                ShortVideoContext shortVideoContext2 = c536350L1t.LJII;
                String str5 = "";
                if ((shortVideoContext2 == null || (str = shortVideoContext2.shootWay) == null) && (str = c536350L1t.LJIILL) == null) {
                    str = "";
                }
                c0lab.LJ("shoot_way", str);
                c0lab.LJ("enter_from", str4);
                ShortVideoContext shortVideoContext3 = c536350L1t.LJII;
                if (shortVideoContext3 == null || (str2 = shortVideoContext3.enterFrom) == null) {
                    str2 = "";
                }
                c0lab.LJ("shoot_enter_from", str2);
                ShortVideoContext shortVideoContext4 = c536350L1t.LJII;
                if (shortVideoContext4 != null && (str3 = shortVideoContext4.enterMethod) != null) {
                    str5 = str3;
                }
                c0lab.LJ("shoot_enter_method", str5);
                c0lab.LIZ(c536350L1t.LJIILJJIL ? 1 : 0, "is_upload_direct_enter");
                C2341909Fp.LIZ("click_autocut", c0lab.LIZ);
            }
            SocialMediaPickerViewModel socialMediaPickerViewModel = (SocialMediaPickerViewModel) awS157S1100000_8.l1;
            C536350L1t c536350L1t2 = socialMediaPickerViewModel.LLL;
            if (c536350L1t2 != null) {
                c536350L1t2.LIZLLL(awS157S1100000_8.s0, socialMediaPickerViewModel.xQ2().LIZ);
            }
        } else {
            SocialMediaPickerViewModel socialMediaPickerViewModel2 = (SocialMediaPickerViewModel) awS157S1100000_8.l1;
            C536350L1t c536350L1t3 = socialMediaPickerViewModel2.LLL;
            if (c536350L1t3 != null) {
                c536350L1t3.LIZLLL("upload_page", socialMediaPickerViewModel2.xQ2().LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS157S1100000_8 awS157S1100000_8) {
        ((C565060MEe) awS157S1100000_8.l1).LIZJ();
        C564410MBr c564410MBr = C564410MBr.LIZ;
        String str = ((C565060MEe) awS157S1100000_8.l1).LIZIZ;
        String str2 = awS157S1100000_8.s0;
        c564410MBr.getClass();
        C564410MBr.LJIILL(null, null, "cancel", "feed", str, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS157S1100000_8 awS157S1100000_8) {
        ((C565060MEe) awS157S1100000_8.l1).LIZJ();
        C564410MBr c564410MBr = C564410MBr.LIZ;
        String str = ((C565060MEe) awS157S1100000_8.l1).LIZIZ;
        String str2 = awS157S1100000_8.s0;
        c564410MBr.getClass();
        C564410MBr.LJIILL(null, null, "reject", "feed", str, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS157S1100000_8 awS157S1100000_8) {
        IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) awS157S1100000_8.l1;
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(Integer.valueOf(TEVideoUtils.nativeCheckMp3File(awS157S1100000_8.s0)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS157S1100000_8 awS157S1100000_8) {
        ((C538050L8h) awS157S1100000_8.l1).LJJIIZ(new C381350ExJ(10002, awS157S1100000_8.s0, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS157S1100000_8 awS157S1100000_8) {
        ((InterfaceC2329309At) awS157S1100000_8.l1).onSuccess(C0MVT.LIZIZ(awS157S1100000_8.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS157S1100000_8 awS157S1100000_8) {
        Iterator<InterfaceC537900L7s> it2 = ((C0FQS) awS157S1100000_8.l1).LJIJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(awS157S1100000_8.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS157S1100000_8 awS157S1100000_8) {
        Iterator<InterfaceC537900L7s> it2 = ((C0FQS) awS157S1100000_8.l1).LJIJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(awS157S1100000_8.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS157S1100000_8 awS157S1100000_8) {
        ((Function1) awS157S1100000_8.l1).invoke(awS157S1100000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS157S1100000_8 awS157S1100000_8) {
        ((Function1) awS157S1100000_8.l1).invoke(awS157S1100000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS157S1100000_8 awS157S1100000_8) {
        C576730Mjf.LJIIIZ("CameraLayoutGoNextComponent", "onCompileDone");
        ((C576760Mji) awS157S1100000_8.l1).LLJJLIIIJLLLLLLLZ.onNext(new C576790Mjl(awS157S1100000_8.s0));
        C0LDJ c0ldj = C0LDJ.LIZ;
        C0LAB c0lab = ((C576760Mji) awS157S1100000_8.l1).LLJLLIL;
        c0ldj.getClass();
        C0LDJ.LJI(c0lab);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS157S1100000_8 awS157S1100000_8) {
        int i;
        CreativeModel creativeModel;
        CelebrationData celebrationData;
        Integer celebrationType;
        String entranceType;
        CreativeModel creativeModel2;
        CelebrationData celebrationData2;
        Integer celebrationType2;
        C0LAB c0lab = new C0LAB();
        C540060LGa.LIZ.getClass();
        c0lab.LJ("photo_status", C540060LGa.LJ());
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS157S1100000_8.l1;
        String str = awS157S1100000_8.s0;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (celebrationData2 = creativeModel2.celebrationData) != null && (celebrationType2 = celebrationData2.getCelebrationType()) != null && celebrationType2.intValue() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_eoy");
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (celebrationData = creativeModel.celebrationData) != null && (celebrationType = celebrationData.getCelebrationType()) != null && celebrationType.intValue() == 2) {
            CelebrationData celebrationData3 = shortVideoContext.creativeModel.celebrationData;
            c0lab.LJ("enter_from", "end_of_year_page");
            c0lab.LJ("from_page", "end_of_year_page");
            if (celebrationData3 != null) {
                entranceType = celebrationData3.getEntranceType();
            } else {
                entranceType = null;
            }
            c0lab.LJ("eoy_entrance_type", entranceType);
        }
        if (str.length() > 0) {
            c0lab.LJ("chat_type", str);
        }
        return c0lab.LIZ;
    }

    public static final Object invoke$8(AwS157S1100000_8 awS157S1100000_8) {
        int i;
        CreativeModel creativeModel;
        CelebrationData celebrationData;
        Integer celebrationType;
        String entranceType;
        CreativeModel creativeModel2;
        CelebrationData celebrationData2;
        Integer celebrationType2;
        C0LAB c0lab = new C0LAB();
        C540060LGa.LIZ.getClass();
        c0lab.LJ("photo_status", C540060LGa.LJ());
        String str = awS157S1100000_8.s0;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS157S1100000_8.l1;
        if (str.length() > 0) {
            c0lab.LJ("chat_type", str);
        }
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (celebrationData2 = creativeModel2.celebrationData) != null && (celebrationType2 = celebrationData2.getCelebrationType()) != null && celebrationType2.intValue() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_eoy");
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (celebrationData = creativeModel.celebrationData) != null && (celebrationType = celebrationData.getCelebrationType()) != null && celebrationType.intValue() == 2) {
            CelebrationData celebrationData3 = shortVideoContext.creativeModel.celebrationData;
            c0lab.LJ("enter_from", "end_of_year_page");
            c0lab.LJ("from_page", "end_of_year_page");
            if (celebrationData3 != null) {
                entranceType = celebrationData3.getEntranceType();
            } else {
                entranceType = null;
            }
            c0lab.LJ("eoy_entrance_type", entranceType);
        }
        return c0lab.LIZ;
    }

    public static final Object invoke$9(AwS157S1100000_8 awS157S1100000_8) {
        String string;
        if (awS157S1100000_8.s0.length() > 0) {
            string = awS157S1100000_8.s0;
        } else {
            string = ((C0MP7) awS157S1100000_8.l1).LL.getResources().getString(2131821933);
        }
        C19EG c19eg = ((C0MP7) awS157S1100000_8.l1).LL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C1390380mHk.LIZ(c19eg, 3002, creativeToastBuilder);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS157S1100000_8(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 7 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS157S1100000_8.<init>(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(C0FQS c0fqs, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0fqs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(C538050L8h c538050L8h, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c538050L8h;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(C565060MEe c565060MEe, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c565060MEe;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(C576760Mji c576760Mji, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c576760Mji;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(C11KT c11kt, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c11kt;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(MvChoosePhotoScene mvChoosePhotoScene, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = mvChoosePhotoScene;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = socialMediaPickerViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(String str, C0MP7 c0mp7, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0mp7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(String str, IAVInfoService.IGetInfoCallback iGetInfoCallback, int i) {
        super(0);
        this.$t = i;
        this.l1 = iGetInfoCallback;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(String str, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l1 = function1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S1100000_8(String str, AFwS239S0000000_8 aFwS239S0000000_8, int i) {
        super(0);
        this.$t = i;
        this.l1 = aFwS239S0000000_8;
        this.s0 = str;
    }
}
