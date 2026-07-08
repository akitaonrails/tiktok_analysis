package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0LD8;
import X.C0LD9;
import X.C0M7N;
import X.C0M81;
import X.C0PEM;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1455260nyO;
import X.C2089008Gi;
import X.C2188811AlT;
import X.C2273271DyP;
import X.C2296808zG;
import X.C23250099c;
import X.C356610DyV;
import X.C562560M4o;
import X.C564410MBr;
import X.InterfaceC1446740nke;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS8S3300000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S3300000_8 awS8S3300000_8) {
        C2089008Gi c2089008Gi = new C2089008Gi(C2273271DyP.LIZ());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS8S3300000_8.l3, "aweme://webview");
        smartRouteBuildRoute.withParam("url", c2089008Gi.LJ());
        smartRouteBuildRoute.withParam("show_separate_line", true);
        smartRouteBuildRoute.open();
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS8S3300000_8.l4;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS8S3300000_8.l5;
        String str = awS8S3300000_8.s0;
        String str2 = awS8S3300000_8.s1;
        String str3 = awS8S3300000_8.s2;
        c564410MBr.getClass();
        C564410MBr.LJIILL(videoPublishEditModel, shortVideoContext, "privacy_policy", str, str2, str3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S3300000_8 awS8S3300000_8) {
        ((Function0) awS8S3300000_8.l3).invoke();
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS8S3300000_8.l4;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS8S3300000_8.l5;
        String str = awS8S3300000_8.s0;
        String str2 = awS8S3300000_8.s1;
        String str3 = awS8S3300000_8.s2;
        c564410MBr.getClass();
        C564410MBr.LJIILL(videoPublishEditModel, shortVideoContext, "terms", str, str2, str3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS8S3300000_8 awS8S3300000_8) {
        Context context = (Context) awS8S3300000_8.l3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://roma_redirect/?spark_page=");
        sbLIZ.append("ai_live_photo_terms");
        sbLIZ.append("&lang=");
        String appLanguage = C0CHQ.LIZ().getAppLanguage();
        if (!C2273271DyP.LIZ.contains(appLanguage)) {
            appLanguage = "en";
        }
        if (Intrinsics.LJFF(appLanguage, "zh-Hant")) {
            appLanguage = "zh_Hant";
        } else if (Intrinsics.LJFF(appLanguage, "he")) {
            appLanguage = "he_IL";
        }
        sbLIZ.append(appLanguage);
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS8S3300000_8.l4;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS8S3300000_8.l5;
        String str = awS8S3300000_8.s0;
        String str2 = awS8S3300000_8.s1;
        String str3 = awS8S3300000_8.s2;
        c564410MBr.getClass();
        C564410MBr.LJIILL(videoPublishEditModel, shortVideoContext, "help_center", str, str2, str3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS8S3300000_8 awS8S3300000_8) {
        C356610DyV c356610DyV = C1455260nyO.A;
        C0M7N c0m7n = (C0M7N) awS8S3300000_8.l3;
        InterfaceC1446740nke interfaceC1446740nke = c0m7n.LJ;
        VideoPublishEditModel videoPublishEditModel = c0m7n.LIZJ;
        c356610DyV.getClass();
        C356610DyV.LIZIZ(videoPublishEditModel, interfaceC1446740nke);
        C1428520nHG.LJLI(((C0M7N) awS8S3300000_8.l3).LIZJ);
        C1428470nHB.LIZJ(((C0M7N) awS8S3300000_8.l3).LIZJ.creativeModel.draftInfoModel);
        if (((C0M7N) awS8S3300000_8.l3).LIZJ.getAILivePhotoModel().initialDraftSaveType == null) {
            ((C0M7N) awS8S3300000_8.l3).LIZJ.getAILivePhotoModel().initialDraftSaveType = Integer.valueOf(C562560M4o.LIZLLL(((C0M7N) awS8S3300000_8.l3).LIZJ));
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LD9(awS8S3300000_8.s0, ((C0M7N) awS8S3300000_8.l3).LIZJ.clone(), awS8S3300000_8.s1, awS8S3300000_8.s2, (Function0) awS8S3300000_8.l4, (Function1) awS8S3300000_8.l5, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS8S3300000_8 awS8S3300000_8) {
        C356610DyV c356610DyV = C1455260nyO.A;
        C0M81 c0m81 = (C0M81) awS8S3300000_8.l3;
        InterfaceC1446740nke interfaceC1446740nke = c0m81.LJ;
        VideoPublishEditModel videoPublishEditModel = c0m81.LIZJ;
        c356610DyV.getClass();
        C356610DyV.LIZIZ(videoPublishEditModel, interfaceC1446740nke);
        C1428520nHG.LJLI(((C0M81) awS8S3300000_8.l3).LIZJ);
        C1428470nHB.LIZJ(((C0M81) awS8S3300000_8.l3).LIZJ.creativeModel.draftInfoModel);
        if (((C0M81) awS8S3300000_8.l3).LIZJ.getAILivePhotoModel().LJI() && ((C0M81) awS8S3300000_8.l3).LIZJ.getAILivePhotoModel().initialDraftSaveType == null) {
            ((C0M81) awS8S3300000_8.l3).LIZJ.getAILivePhotoModel().initialDraftSaveType = Integer.valueOf(C562560M4o.LIZLLL(((C0M81) awS8S3300000_8.l3).LIZJ));
        }
        VideoPublishEditModel videoPublishEditModelClone = ((C0M81) awS8S3300000_8.l3).LIZJ.clone();
        videoPublishEditModelClone.creativeModel.draftInfoModel.fromDraftPopup = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LD8(awS8S3300000_8.s0, videoPublishEditModelClone, awS8S3300000_8.s1, awS8S3300000_8.s2, (Function0) awS8S3300000_8.l4, (Function1) awS8S3300000_8.l5, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S3300000_8(C0M7N c0m7n, C0M7N c0m7n2, String str, String str2, String str3, Function0<Unit> function0, Function1<? super VideoPublishEditModel, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l3 = c0m7n;
        this.s0 = c0m7n2;
        this.s1 = str;
        this.s2 = str2;
        this.l4 = str3;
        this.l5 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S3300000_8(C0M81 c0m81, C0M81 c0m812, String str, String str2, String str3, Function0<Unit> function0, Function1<? super VideoPublishEditModel, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l3 = c0m81;
        this.s0 = c0m812;
        this.s1 = str;
        this.s2 = str2;
        this.l4 = str3;
        this.l5 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S3300000_8(Context context, VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.l3 = context;
        this.l4 = videoPublishEditModel;
        this.l5 = shortVideoContext;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S3300000_8(Function0 function0, Function0<Unit> function02, VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, String str, String str2, String str3) {
        super(0);
        this.$t = str3;
        this.l3 = function0;
        this.l4 = function02;
        this.l5 = videoPublishEditModel;
        this.s0 = shortVideoContext;
        this.s1 = str;
        this.s2 = str2;
    }
}
