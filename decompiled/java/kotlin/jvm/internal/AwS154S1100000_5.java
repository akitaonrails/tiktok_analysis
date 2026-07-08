package kotlin.jvm.internal;

import X.C013C;
import X.C098200Yq;
import X.C09AY;
import X.C0E5K;
import X.C0FLW;
import X.C189200o6;
import X.C20137613qo;
import X.C2188811AlT;
import X.C351220Dpo;
import X.C352310DrZ;
import X.C354160DuY;
import X.C354570DvD;
import X.C357280Dza;
import X.C377730ErT;
import X.InterfaceC354020DuK;
import X.InterfaceC354030DuL;
import X.InterfaceC361710EGb;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedType;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.ClientToEffectMessage;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.SlowMotionCacheModel;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS154S1100000_5 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS154S1100000_5 awS154S1100000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache hit , callMethod: ");
        sbLIZ.append(awS154S1100000_5.s0);
        sbLIZ.append(" ,return ");
        sbLIZ.append(awS154S1100000_5.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS154S1100000_5 awS154S1100000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache miss, write new value: ");
        sbLIZ.append(awS154S1100000_5.s0);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS154S1100000_5.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS154S1100000_5 awS154S1100000_5) {
        ((C377730ErT) awS154S1100000_5.l1).W7(awS154S1100000_5.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS154S1100000_5 awS154S1100000_5) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        String resourceFile;
        Long lValueOf;
        InterfaceC361710EGb previewPanelApi;
        C354160DuY c354160DuY = (C354160DuY) awS154S1100000_5.l1;
        String str = awS154S1100000_5.s0;
        NLETrackSlot nLETrackSlot = c354160DuY.LLILZIL;
        if (nLETrackSlot != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
            nLETrackSlot.setExtra("slot_extra_has_applied_slow_motion", "true");
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            if (resource != null) {
                resourceFile = resource.getResourceFile();
            } else {
                resourceFile = null;
            }
            nLETrackSlot.setExtra("slot_extra_origin_resource_file", resourceFile);
            NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
            if (resource2 != null) {
                lValueOf = Long.valueOf(resource2.getDuration());
            } else {
                lValueOf = null;
            }
            nLETrackSlot.setExtra("slot_extra_origin_duration", String.valueOf(lValueOf));
            nLETrackSlot.setExtra("slot_extra_origin_start_time", String.valueOf(nLETrackSlot.getStartTime()));
            nLETrackSlot.setExtra("slot_extra_origin_end_time", String.valueOf(nLETrackSlot.getEndTime()));
            nLETrackSlot.setExtra("slot_extra_origin_clip_start_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipStart()));
            nLETrackSlot.setExtra("slot_extra_origin_clip_end_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipEnd()));
            NLEResourceNode resource3 = nLESegmentVideoDynamicCast.getResource();
            if (resource3 != null) {
                resource3.setResourceFile(str);
            }
            long jLIZLLL = C352310DrZ.LIZLLL(C20137613qo.LIZ.LIZLLL(str).LJ);
            NLEResourceNode resource4 = nLESegmentVideoDynamicCast.getResource();
            if (resource4 != null) {
                resource4.setDuration(jLIZLLL);
            }
            nLESegmentVideoDynamicCast.clearCurveSpeedPoint();
            nLESegmentVideoDynamicCast.clearSegCurveSpeedPoint();
            nLESegmentVideoDynamicCast.setCurveSpeedType(NLECurveSpeedType.Normal);
            nLESegmentVideoDynamicCast.setCurveActionBeam(null);
            nLESegmentVideoDynamicCast.setSpeed(1.0f);
            nLESegmentVideoDynamicCast.setAbsSpeed(1.0f);
            nLESegmentVideoDynamicCast.setTimeClipStart(0L);
            nLESegmentVideoDynamicCast.setTimeClipEnd(jLIZLLL);
            nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + jLIZLLL);
            IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
            if (iPreviewServiceLIZ != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
                previewPanelApi.XF1(true);
            }
            c354160DuY.LL.commit();
            InterfaceC354020DuK interfaceC354020DuK = c354160DuY.LLJILJILJ;
            if (interfaceC354020DuK != null) {
                interfaceC354020DuK.LIZ(new C354570DvD(true, null, null, 6));
            }
            ClientToEffectMessage clientToEffectMessage = c354160DuY.LLJJ;
            if (clientToEffectMessage != null && c354160DuY.LLJIJIL != null) {
                ((InterfaceC354030DuL) c354160DuY.LLIZ.getValue()).LIZ(c354160DuY.LLJILJIL, new SlowMotionCacheModel(str, clientToEffectMessage));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS154S1100000_5 awS154S1100000_5) {
        String str = awS154S1100000_5.s0;
        C0E5K c0e5k = (C0E5K) awS154S1100000_5.l1;
        try {
            NLEResType.VIDEO.swigValue();
            c0e5k.LJIIJ.xQ2(C351220Dpo.LJFF(str).LJ, str);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS154S1100000_5 awS154S1100000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache hit , callMethod: ");
        sbLIZ.append(awS154S1100000_5.s0);
        sbLIZ.append(" ,return ");
        sbLIZ.append(awS154S1100000_5.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS154S1100000_5 awS154S1100000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache miss, write new value: ");
        sbLIZ.append(awS154S1100000_5.s0);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS154S1100000_5.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS154S1100000_5 awS154S1100000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isBottombarEnterLiveQuickly  aid ");
        sbLIZ.append(awS154S1100000_5.s0);
        sbLIZ.append(" hasHeroInfo: ");
        sbLIZ.append(((C013C) awS154S1100000_5.l1).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS154S1100000_5 awS154S1100000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEnterMLBBLivePage  aid ");
        sbLIZ.append(awS154S1100000_5.s0);
        sbLIZ.append(" hasHeroInfo: ");
        sbLIZ.append(((C013C) awS154S1100000_5.l1).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS154S1100000_5 awS154S1100000_5) {
        ((C0FLW) awS154S1100000_5.l1).LJII = awS154S1100000_5.s0;
        if (!((ArrayList) r1.LJIIIZ).isEmpty()) {
            ((C0FLW) awS154S1100000_5.l1).LJIILJJIL();
        } else {
            C0FLW c0flw = (C0FLW) awS154S1100000_5.l1;
            if (c0flw.LIZJ.LJIIIZ.LJJ.LJ) {
                c0flw.LJIILIIL("");
            } else {
                c0flw.LJIIIZ();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1100000_5(Object obj, int i) {
        super(0);
        this.$t = i;
        this.s0 = "getUsedFunctions";
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1100000_5(C354160DuY c354160DuY, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c354160DuY;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1100000_5(C377730ErT c377730ErT, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c377730ErT;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1100000_5(C0FLW c0flw, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0flw;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1100000_5(String str, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1100000_5(String str, C0E5K c0e5k, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0e5k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S1100000_5(String str, String str2, T t) {
        super(0);
        this.$t = t;
        this.s0 = str;
        this.l1 = str2;
    }
}
