package kotlin.jvm.internal;

import X.C09AY;
import X.C0C64;
import X.C0CHQ;
import X.C0M2T;
import X.C0M7N;
import X.C1402520mbK;
import X.C1404710mer;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1431870nMf;
import X.C1455260nyO;
import X.C19576911iZ;
import X.C19GS;
import X.C2281551ESb;
import X.C306470Bzp;
import X.C356610DyV;
import X.C538590LAj;
import X.C545510LaP;
import X.C550560LiY;
import X.C550570LiZ;
import X.C550580Lia;
import X.C551060LjM;
import X.C551070LjN;
import X.C552880LmI;
import X.InterfaceC1446740nke;
import X.InterfaceC540360LHe;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS16S1110000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S1110000_8 awS16S1110000_8) {
        final C0M7N c0m7n = (C0M7N) awS16S1110000_8.l1;
        boolean z = awS16S1110000_8.z2;
        String str = awS16S1110000_8.s0;
        c0m7n.getClass();
        C356610DyV c356610DyV = C1455260nyO.A;
        InterfaceC1446740nke interfaceC1446740nke = c0m7n.LJ;
        VideoPublishEditModel videoPublishEditModel = c0m7n.LIZJ;
        c356610DyV.getClass();
        C356610DyV.LIZIZ(videoPublishEditModel, interfaceC1446740nke);
        C1402520mbK.LIZLLL(c0m7n.LIZJ, str, null, false, Boolean.FALSE, "", null, null, null);
        VideoPublishEditModel videoPublishEditModel2 = c0m7n.LIZJ;
        videoPublishEditModel2.creativeModel.draftInfoModel.fromDraftPopup = z;
        C1428520nHG.LJLI(videoPublishEditModel2);
        C1428470nHB.LIZJ(c0m7n.LIZJ.creativeModel.draftInfoModel);
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        C19GS c19gs = c0m7n.LJIIL;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.loadingMessage(c0m7n.LJIIL.getString(2131846827));
        final CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(c19gs, 1601, creativeLoadingDialogBuilder);
        creativeDialogWrapper.show();
        C0CHQ.LIZ().getPublishService().LJJJLL();
        C1431870nMf.LJIIL(new C538590LAj(c0m7n.LIZJ, new C0M2T(false, "VEVideoPublishEditActivity", null, 5, false, 28), false), new InterfaceC540360LHe() { // from class: X.0M7O
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
                creativeDialogWrapper.dismiss();
                C19GS c19gs2 = c0m7n.LJIIL;
                if (c19gs2 != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131829844);
                    creativeToastBuilder.acrossActivities(true);
                    C1390380mHk.LIZ(c19gs2, 1008, creativeToastBuilder);
                }
                C1402520mbK.LJI(C1402520mbK.LIZ, c0m7n.LIZJ, "video_edit_page", 0, true, 16);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
            @Override // X.InterfaceC540360LHe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(X.C540340LHc r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 443
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0M7O.LIZJ(X.0LHc):void");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS16S1110000_8 awS16S1110000_8) {
        IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) awS16S1110000_8.l1;
        String str = awS16S1110000_8.s0;
        boolean z = awS16S1110000_8.z2;
        C0CHQ.LIZ().LJJIZ();
        int[] iArr = new int[11];
        if (z) {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
            if (videoFileInfo != null) {
                if (videoFileInfo.rotation % 180 != 0) {
                    int i = videoFileInfo.height;
                    videoFileInfo.height = videoFileInfo.width;
                    videoFileInfo.width = i;
                    if (C2281551ESb.LIZIZ.LJJIJIIJIL()) {
                        videoFileInfo.rotation = 0;
                    }
                }
                iArr[0] = videoFileInfo.width;
                iArr[1] = videoFileInfo.height;
                int i2 = videoFileInfo.rotation;
                iArr[2] = i2;
                iArr[3] = i2;
                iArr[4] = 0;
                iArr[5] = 0;
                iArr[6] = videoFileInfo.bitrate;
                iArr[7] = videoFileInfo.fps;
                iArr[8] = videoFileInfo.codec;
                iArr[9] = videoFileInfo.keyFrameCount;
                iArr[10] = videoFileInfo.maxDuration;
            }
        } else {
            C1404710mer.LIZIZ(str);
        }
        iGetInfoCallback.finish(iArr);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS16S1110000_8 awS16S1110000_8) {
        C550560LiY c550560LiY = new C550560LiY(C306470Bzp.LIZ(), new C550570LiZ(C0C64.LJIILLIIL().LJIIIZ(31744, "aigc_arch_quota_cache_enabled", true, false), C0C64.LJIILLIIL().LJIJ(31744, 1, "aigc_arch_quota_check_threshold", true)));
        String str = awS16S1110000_8.s0;
        if (str != null && str.length() > 0) {
            return C552880LmI.LIZ(new AwS62S0210000_8((C545510LaP) awS16S1110000_8.l1, (C545510LaP<C550580Lia<C551070LjN>>) awS16S1110000_8.z2, (boolean) c550560LiY, (C550560LiY) 8));
        }
        C545510LaP c545510LaP = (C545510LaP) awS16S1110000_8.l1;
        return C552880LmI.LIZ(new C551060LjM(c545510LaP, AFwS291S0000000_8.get$arr$(34), ((C550580Lia) c545510LaP.LJIIJ).LIZ, awS16S1110000_8.z2, false, c550560LiY));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1110000_8(C0M7N c0m7n, boolean z, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0m7n;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS16S1110000_8(String str, String str2, C545510LaP<C550580Lia<C551070LjN>> c545510LaP, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.s0 = str;
        this.l1 = str2;
        this.z2 = c545510LaP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1110000_8(String str, boolean z, IAVInfoService.IGetInfoCallback iGetInfoCallback, int i) {
        super(0);
        this.$t = i;
        this.l1 = iGetInfoCallback;
        this.s0 = str;
        this.z2 = z;
    }
}
