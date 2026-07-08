package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C0VY4;
import X.C1408920mle;
import X.C1417350mzF;
import X.C1418220n0e;
import X.C1424090nA7;
import X.C1428470nHB;
import X.C1433230nOr;
import X.C1433240nOs;
import X.C1433340nP2;
import X.C1433500nPI;
import X.C1433730nPf;
import X.C1434050nQB;
import X.C1434070nQD;
import X.C1434090nQF;
import X.C1435900nTA;
import X.C1436140nTY;
import X.C1436230nTh;
import X.C1441390nc1;
import X.C1441430nc5;
import X.C1447790nmL;
import X.C1453730nvv;
import X.C1460230o6P;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2471909mP;
import X.C805360ViY;
import X.C805370ViZ;
import X.C859300XnM;
import X.InterfaceC1433860nPs;
import Y.ARunnableS83S0200000_14;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS171S1100000_22 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS171S1100000_22 awS171S1100000_22) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z = false;
        if (!((C1436140nTY) awS171S1100000_22.l1).LJ() && ((C1436140nTY) awS171S1100000_22.l1).LJIJI.simulateProgressDuration > 0 && Intrinsics.LJFF(awS171S1100000_22.s0, "DefaultWavePublisher")) {
            PublishModel publishModel = ((C1436140nTY) awS171S1100000_22.l1).LJFF;
            BaseShortVideoContext baseShortVideoContext = null;
            if (publishModel != null) {
                baseShortVideoContext = publishModel.editModel;
            }
            if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && !C1428470nHB.LJJZZI(videoPublishEditModel)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS171S1100000_22 r5) {
        /*
            java.lang.Object r0 = r5.l1
            X.0nTY r0 = (X.C1436140nTY) r0
            com.ss.android.ugc.aweme.shortvideo.experiment.UploadTargetAnimationConfig r0 = r0.LJIJJ
            long r3 = r0.uploadTargetAnimationDurationInMs
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L3d
            java.lang.String r1 = r5.s0
            java.lang.String r0 = "DefaultWavePublisher"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3d
            java.lang.Object r1 = r5.l1
            X.0nTY r1 = (X.C1436140nTY) r1
            com.ss.android.ugc.aweme.shortvideo.experiment.UploadTargetAnimationConfig r0 = r1.LJIJJ
            boolean r0 = r0.enableImageMode
            if (r0 != 0) goto L38
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r1.LJFF
            r1 = 0
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r1 = r0.editModel
        L2a:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r1
            if (r1 == 0) goto L3d
            boolean r0 = X.C1428470nHB.LJJZZI(r1)
            if (r0 != 0) goto L3d
        L38:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L3d:
            r2 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS171S1100000_22.invoke$1(kotlin.jvm.internal.AwS171S1100000_22):java.lang.Object");
    }

    public static final Object invoke$10(AwS171S1100000_22 awS171S1100000_22) {
        ((C1453730nvv) awS171S1100000_22.l1).d5(awS171S1100000_22.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS171S1100000_22 awS171S1100000_22) {
        ((C1418220n0e) awS171S1100000_22.l1).LJ.setMediaCover(C2471909mP.LJIILIIL(awS171S1100000_22.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS171S1100000_22 awS171S1100000_22) {
        C1424090nA7 c1424090nA7 = (C1424090nA7) awS171S1100000_22.l1;
        String str = awS171S1100000_22.s0;
        if (str == null) {
            str = "";
        }
        c1424090nA7.getClass();
        return C1424090nA7.LIZLLL(str);
    }

    public static final Object invoke$13(AwS171S1100000_22 awS171S1100000_22) {
        C1424090nA7 c1424090nA7 = (C1424090nA7) awS171S1100000_22.l1;
        String str = awS171S1100000_22.s0;
        if (str == null) {
            str = "";
        }
        c1424090nA7.getClass();
        return C1424090nA7.LIZLLL(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS171S1100000_22 r5) {
        /*
            java.lang.Object r0 = r5.l1
            X.0nTA r0 = (X.C1435900nTA) r0
            com.ss.android.ugc.aweme.shortvideo.experiment.PublishPatienceConfig r0 = r0.LJIJI
            long r3 = r0.simulateProgressDuration
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L37
            java.lang.String r1 = r5.s0
            java.lang.String r0 = "DefaultWavePublisher"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L37
            java.lang.Object r0 = r5.l1
            X.0nTA r0 = (X.C1435900nTA) r0
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r0.LJFF
            r1 = 0
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r1 = r0.editModel
        L24:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r1
            if (r1 == 0) goto L37
            boolean r0 = X.C1428470nHB.LJJZZI(r1)
            if (r0 != 0) goto L37
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L37:
            r2 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS171S1100000_22.invoke$2(kotlin.jvm.internal.AwS171S1100000_22):java.lang.Object");
    }

    public static final Object invoke$3(AwS171S1100000_22 awS171S1100000_22) {
        C1417350mzF c1417350mzF = (C1417350mzF) awS171S1100000_22.l1;
        c1417350mzF.LJII.LJFF = awS171S1100000_22.s0;
        c1417350mzF.LJ();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS171S1100000_22 awS171S1100000_22) {
        if (((VideoPublishEditModel) awS171S1100000_22.l1) == null) {
            C859300XnM.LIZ("cancelEditPagePrePublish null editModel");
        } else {
            C1436230nTh.LIZ.getClass();
            if (C1436230nTh.LJ != null) {
                CommonMobParamModel commonMobParamModel = ((VideoPublishEditModel) awS171S1100000_22.l1).creativeModel.commonMobModel;
                String str = awS171S1100000_22.s0;
                if (str == null) {
                    str = "unknown";
                }
                commonMobParamModel.editPrePublishCancelReason = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cancelEditPagePrePublish ");
                sbLIZ.append(awS171S1100000_22.s0);
                C1433230nOr c1433230nOr = new C1433230nOr(C2188811AlT.LIZIZ(sbLIZ), null, 6);
                C1433500nPI c1433500nPI = C1433730nPf.LJIIIZ;
                C1433730nPf.LJIIIZ = null;
                C1433730nPf.LJI.execute(new ARunnableS83S0200000_14(c1433500nPI, c1433230nOr, 19));
            }
            C1436230nTh.LJIILIIL(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS171S1100000_22 awS171S1100000_22) {
        C805370ViZ c805370ViZ = ((C1441430nc5) awS171S1100000_22.l1).LJIIJJI;
        Map<String, String> map = C1441390nc1.LIZ;
        c805370ViZ.LIZJ = (String) ((LinkedHashMap) map).get(awS171S1100000_22.s0);
        C805370ViZ c805370ViZ2 = ((C1441430nc5) awS171S1100000_22.l1).LJIIL;
        Map<String, StringBuilder> map2 = C1441390nc1.LIZIZ;
        c805370ViZ2.LIZJ = String.valueOf(((LinkedHashMap) map2).get(awS171S1100000_22.s0));
        C805370ViZ c805370ViZ3 = ((C1441430nc5) awS171S1100000_22.l1).LJIILIIL;
        Map<String, Integer> map3 = C1441390nc1.LIZJ;
        c805370ViZ3.LIZJ = String.valueOf(((LinkedHashMap) map3).get(awS171S1100000_22.s0));
        C805360ViY.LIZ((C1441430nc5) awS171S1100000_22.l1, C0VY4.LIZ(new Throwable("")), "AuditMonitorStage", "creative_tools_audit_monitor_stage");
        map.remove(awS171S1100000_22.s0);
        map2.remove(awS171S1100000_22.s0);
        map3.remove(awS171S1100000_22.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS171S1100000_22 awS171S1100000_22) {
        InterfaceC1433860nPs c1434090nQF;
        PublishProgressDialogAddHelper.LIZ.getClass();
        PublishProgressDialogAddHelper.LJFF();
        C1447790nmL c1447790nmL = PublishProgressDialogAddHelper.LJ;
        if (c1447790nmL != null) {
            String str = awS171S1100000_22.s0;
            PublishModel publishModel = (PublishModel) awS171S1100000_22.l1;
            StoryGroupPublishModel storyGroupPublishModel = publishModel.storyGroupPublishModel;
            if (storyGroupPublishModel != null) {
                C1433240nOs c1433240nOs = C1433240nOs.LIZ;
                String str2 = storyGroupPublishModel.groupId;
                c1434090nQF = new C1434050nQB(c1447790nmL, str, publishModel, str2, c1433240nOs);
                if (str2 != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C1434050nQB.LLJILJIL;
                    Object arrayList = linkedHashMap.get(str2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(str2, arrayList);
                    }
                    ((List) arrayList).add(c1434090nQF);
                }
            } else {
                c1434090nQF = EnableParallelPublishSchedulerV2Exp.LIZ().enable ? new C1434090nQF(c1447790nmL, str, publishModel) : new C1434070nQD(c1447790nmL, str, publishModel);
            }
            if (c1434090nQF.LIZ()) {
                C1433730nPf.LIZ(awS171S1100000_22.s0, new C1433340nP2(c1434090nQF));
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1408920mle(null), 3);
            }
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$7(AwS171S1100000_22 awS171S1100000_22) {
        C1460230o6P c1460230o6P = (C1460230o6P) awS171S1100000_22.l1;
        c1460230o6P.LLLILZLLLI(new AwS171S1100000_22(c1460230o6P, awS171S1100000_22.s0, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS171S1100000_22 awS171S1100000_22) {
        C1460230o6P.LLLIL((C1460230o6P) awS171S1100000_22.l1, awS171S1100000_22.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS171S1100000_22 awS171S1100000_22) {
        C1460230o6P.LLLIL((C1460230o6P) awS171S1100000_22.l1, awS171S1100000_22.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1436140nTY c1436140nTY, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1436140nTY;
        this.s0 = "DefaultWavePublisher";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1417350mzF c1417350mzF, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1417350mzF;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1418220n0e c1418220n0e, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1418220n0e;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1424090nA7 c1424090nA7, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1424090nA7;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1435900nTA c1435900nTA, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1435900nTA;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1441430nc5 c1441430nc5, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1441430nc5;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1453730nvv c1453730nvv, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1453730nvv;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(C1460230o6P c1460230o6P, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1460230o6P;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S1100000_22(PublishModel publishModel, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = publishModel;
    }
}
