package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0CNO;
import X.C0LSN;
import X.C0M2T;
import X.C0M7N;
import X.C0MUV;
import X.C0MV0;
import X.C0VSJ;
import X.C1402520mbK;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1431870nMf;
import X.C1439190nYT;
import X.C1455260nyO;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2354709Kn;
import X.C280820AzY;
import X.C301570Brv;
import X.C301790BsH;
import X.C356610DyV;
import X.C538590LAj;
import X.C539270LCz;
import X.C540340LHc;
import X.C562560M4o;
import X.C568750MSj;
import X.C576120Mig;
import X.InterfaceC1446740nke;
import X.InterfaceC540360LHe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CheckPointModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class AwS8S1401000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S1401000_8 awS8S1401000_8) {
        if (((C0M7N) awS8S1401000_8.l1).LIZJ.getAILivePhotoModel().LJI() && ((C0M7N) awS8S1401000_8.l1).LIZJ.getAILivePhotoModel().initialDraftSaveType == null) {
            ((C0M7N) awS8S1401000_8.l1).LIZJ.getAILivePhotoModel().initialDraftSaveType = Integer.valueOf(C562560M4o.LIZLLL(((C0M7N) awS8S1401000_8.l1).LIZJ));
        }
        C1402520mbK.LIZLLL(((C0M7N) awS8S1401000_8.l1).LIZJ, "video_edit_page", null, false, Boolean.FALSE, "", null, null, null);
        C356610DyV c356610DyV = C1455260nyO.A;
        C0M7N c0m7n = (C0M7N) awS8S1401000_8.l1;
        InterfaceC1446740nke interfaceC1446740nke = c0m7n.LJ;
        VideoPublishEditModel videoPublishEditModel = c0m7n.LIZJ;
        c356610DyV.getClass();
        C356610DyV.LIZIZ(videoPublishEditModel, interfaceC1446740nke);
        C1428520nHG.LJLI(((C0M7N) awS8S1401000_8.l1).LIZJ);
        C1428470nHB.LIZJ(((C0M7N) awS8S1401000_8.l1).LIZJ.creativeModel.draftInfoModel);
        C0CNO.LIZLLL(0L, new AwS552S0100000_8((Function0) awS8S1401000_8.l2, (Function0<Unit>) 637));
        C0CHQ.LIZ().getPublishService().LJJJLL();
        final C0M7N c0m7n2 = (C0M7N) awS8S1401000_8.l1;
        C538590LAj c538590LAj = new C538590LAj(c0m7n2.LIZJ, new C0M2T(false, awS8S1401000_8.s0, null, awS8S1401000_8.i5, false, 28), false);
        final Function0 function0 = (Function0) awS8S1401000_8.l3;
        final Function0 function02 = (Function0) awS8S1401000_8.l4;
        C1431870nMf.LJIIL(c538590LAj, new InterfaceC540360LHe() { // from class: X.0LHv
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
                C1402520mbK.LJI(C1402520mbK.LIZ, c0m7n2.LIZJ, "video_edit_page", 0, false, 16);
                C0CNO.LIZLLL(0L, new AwS552S0100000_8(function02, (Function0<Unit>) 638));
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZJ(C540340LHc c540340LHc) {
                C1402520mbK.LJI(C1402520mbK.LIZ, c0m7n2.LIZJ, "video_edit_page", 1, false, 16);
                C0CNO.LIZLLL(0L, new AwS552S0100000_8(function0, (Function0<Unit>) 639));
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S1401000_8 awS8S1401000_8) {
        DraftInfoModel draftInfoModel;
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel2;
        long jLJJLIIIJLLLLLLLZ;
        long j;
        long jLJIILL;
        long jMax;
        List<EditVideoSegment> videoList;
        CreativeModel creativeModel2;
        CheckPointModel checkPointModel;
        C0MV0 c0mv0 = (C0MV0) awS8S1401000_8.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS8S1401000_8.l2;
        String str = awS8S1401000_8.s0;
        int i = awS8S1401000_8.i5;
        Function0 function0 = (Function0) awS8S1401000_8.l3;
        Function1 function1 = (Function1) awS8S1401000_8.l4;
        synchronized (c0mv0) {
            if (!C0CHQ.LIZ().getAccountService().LIZ() && !C568750MSj.LIZIZ(videoPublishEditModel)) {
                ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveCheckPoint creationId: ");
                sbLIZ.append(str);
                sbLIZ.append(" start.");
                C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (videoPublishEditModel == null || (creativeModel2 = videoPublishEditModel.creativeModel) == null || (checkPointModel = creativeModel2.checkPointModel) == null || checkPointModel.enableCheckPoint) {
                    if (videoPublishEditModel != null) {
                        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                        if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null) {
                            Iterator<EditVideoSegment> it2 = videoList.iterator();
                            jMax = 0;
                            while (it2.hasNext()) {
                                jMax = Math.max(jMax, new C0VSJ(it2.next().getVideoPath()).length());
                            }
                        } else {
                            jMax = 0;
                        }
                        long j2 = 1024;
                        if ((jMax / j2) / j2 <= 2048) {
                            if (videoPublishEditModel != null && C1428470nHB.LJJZ(videoPublishEditModel)) {
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            }
                        }
                    }
                    if (((Boolean) C280820AzY.LIZ.getValue()).booleanValue()) {
                        if (videoPublishEditModel != null) {
                            jLJJLIIIJLLLLLLLZ = C1416310mxZ.LJJLIIIJLLLLLLLZ(videoPublishEditModel);
                        } else {
                            jLJJLIIIJLLLLLLLZ = 0;
                        }
                        try {
                            jLJIILL = (C2354709Kn.LJIILL() / ((long) 1024)) / 1024;
                            j = 2048;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            j = 2048;
                            jLJIILL = 0;
                        }
                        if (jLJJLIIIJLLLLLLLZ > j) {
                            if (videoPublishEditModel != null && videoPublishEditModel.isUploadVideo()) {
                                C0CHQ.LIZ().LJI().LJIIJ(true);
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else if (jLJIILL > 0 && jLJJLIIIJLLLLLLLZ > 0 && jLJIILL / jLJJLIIIJLLLLLLLZ < 2.0d) {
                            C0CHQ.LIZ().LJI().LJIIJ(true);
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            C0CHQ.LIZ().LJI().LJIIJ(false);
                        }
                    }
                    if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (draftInfoModel2 = creativeModel.draftInfoModel) != null && draftInfoModel2.isDraft && ((!C301570Brv.LIZ() && !C301790BsH.LIZ()) || !videoPublishEditModel.isFromRestoreRecover())) {
                        if (function0 != null) {
                            function0.invoke();
                        }
                    } else {
                        boolean z = true;
                        boolean z2 = !C0MUV.LIZIZ();
                        if (videoPublishEditModel == null || c0mv0.LJIIIZ(videoPublishEditModel)) {
                            z = false;
                        }
                        if (!z2 && !z) {
                            try {
                                if (videoPublishEditModel != null) {
                                    CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
                                    if (creativeModel3 != null && (draftInfoModel = creativeModel3.draftInfoModel) != null) {
                                        draftInfoModel.saveDraftScene = "silence";
                                    }
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ), null, null, new C539270LCz(videoPublishEditModel, str, function1, c0mv0, i, null), 3);
                                } else if (function0 != null) {
                                    function0.invoke();
                                }
                                C1439190nYT.LIZLLL(i);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            }
                        } else {
                            C1439190nYT.LIZLLL(3);
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }
                    }
                }
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S1401000_8(C0M7N c0m7n, C0M7N c0m7n2, String str, int i, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(0);
        this.$t = function03;
        this.l1 = c0m7n;
        this.s0 = c0m7n2;
        this.i5 = str;
        this.l2 = i;
        this.l3 = function0;
        this.l4 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S1401000_8(C0MV0 c0mv0, C0MV0 c0mv02, VideoPublishEditModel videoPublishEditModel, String str, int i, Function0<Unit> function0, Function1<? super C540340LHc, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l1 = c0mv0;
        this.l2 = c0mv02;
        this.s0 = videoPublishEditModel;
        this.i5 = str;
        this.l3 = i;
        this.l4 = function0;
    }
}
