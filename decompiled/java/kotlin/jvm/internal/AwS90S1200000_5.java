package kotlin.jvm.internal;

import X.AbstractC381680Exq;
import X.AbstractC381690Exr;
import X.AbstractC381830Ey5;
import X.C08A4;
import X.C09AY;
import X.C0E48;
import X.C1397620mTQ;
import X.C189200o6;
import X.C2188811AlT;
import X.C23260099m;
import X.C361680EFy;
import X.C364260EPw;
import X.C375830EoP;
import X.C377660ErM;
import X.C377730ErT;
import X.C377760ErW;
import X.C378870EtJ;
import X.C381330ExH;
import X.C381340ExI;
import X.C381370ExL;
import X.C381480ExW;
import X.C381530Exb;
import X.C381550Exd;
import X.InterfaceC1364105Vn;
import X.InterfaceC381510ExZ;
import X.InterfaceC382380Eyy;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS90S1200000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS90S1200000_5 awS90S1200000_5, Object obj) {
        return C364260EPw.LIZ((C364260EPw) obj, null, false, null, false, null, false, null, 0, null, new C375830EoP(ListProtector.get((List) awS90S1200000_5.l1, 0)), null, null, new C375830EoP(new Pair(((EffectModel) awS90S1200000_5.l2).key, awS90S1200000_5.s0)), null, null, null, null, null, false, null, null, null, null, 8383999);
    }

    public static final Object invoke$1(AwS90S1200000_5 awS90S1200000_5, Object obj) {
        Integer numValueOf;
        Object next;
        Object next2;
        Integer numValueOf2;
        List list = (List) obj;
        String str = awS90S1200000_5.s0;
        Iterator it2 = list.iterator();
        while (true) {
            numValueOf = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C381550Exd) next).LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C381550Exd c381550Exd = (C381550Exd) next;
        if (c381550Exd != null && (numValueOf2 = Integer.valueOf(c381550Exd.LIZIZ)) != null && numValueOf2.intValue() > 0) {
            ((C377730ErT) awS90S1200000_5.l1).s7((List) awS90S1200000_5.l2);
        } else {
            C377730ErT c377730ErT = (C377730ErT) awS90S1200000_5.l1;
            String str2 = awS90S1200000_5.s0;
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(((C381550Exd) next2).LIZ, str2)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C381550Exd c381550Exd2 = (C381550Exd) next2;
            if (c381550Exd2 != null) {
                numValueOf = Integer.valueOf(c381550Exd2.LIZJ);
            }
            C377730ErT.I7(c377730ErT, numValueOf);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS90S1200000_5 awS90S1200000_5, Object obj) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS90S1200000_5.l1;
        if (videoPublishEditModel != null) {
            C361680EFy.LJJJJ(videoPublishEditModel, (C0E48) awS90S1200000_5.l2, awS90S1200000_5.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS90S1200000_5 awS90S1200000_5, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131829625, new AwS90S1200000_5((VideoPublishEditModel) awS90S1200000_5.l1, (C0E48) awS90S1200000_5.l2, awS90S1200000_5.s0, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS90S1200000_5 awS90S1200000_5, Object obj) {
        C381370ExL c381370ExL = (C381370ExL) awS90S1200000_5.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateCombineEffectTask: Continuation cancelled for info.slot ");
        sbLIZ.append(((C381340ExI) awS90S1200000_5.l2).LIZ.getExtra("ep_magic_resource_id"));
        sbLIZ.append(". Attempting to cancel IETTask.");
        C381530Exb.LIZIZ(c381370ExL, C2188811AlT.LIZIZ(sbLIZ));
        C381370ExL c381370ExL2 = (C381370ExL) awS90S1200000_5.l1;
        Map<String, InterfaceC381510ExZ<C381480ExW, C381330ExH>> map = c381370ExL2.LJII;
        String str = awS90S1200000_5.s0;
        synchronized (map) {
            try {
                InterfaceC381510ExZ interfaceC381510ExZ = (InterfaceC381510ExZ) ((LinkedHashMap) c381370ExL2.LJII).get(str);
                if (interfaceC381510ExZ != null) {
                    interfaceC381510ExZ.cancel();
                }
                c381370ExL2.LJII.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS90S1200000_5 awS90S1200000_5, Object obj) {
        int iLJ;
        C377660ErM c377660ErM = (C377660ErM) obj;
        if (c377660ErM.LIZIZ != 0) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS90S1200000_5.l1;
            Boolean bool = Boolean.FALSE;
            C189200o6.m2constructorimpl(bool);
            interfaceC1364105Vn.resumeWith(bool);
            InterfaceC382380Eyy interfaceC382380Eyy = ((AbstractC381830Ey5) awS90S1200000_5.l2).LIZLLL;
            if (interfaceC382380Eyy != null) {
                Integer numValueOf = Integer.valueOf(c377660ErM.LJ);
                if (C08A4.LIZ(Integer.valueOf(numValueOf.intValue()))) {
                    iLJ = numValueOf.intValue();
                } else {
                    iLJ = ((AbstractC381830Ey5) awS90S1200000_5.l2).LJ();
                }
                interfaceC382380Eyy.LIZIZ(new C377760ErW(5, awS90S1200000_5.s0, iLJ, "Quota error", null, 16));
            }
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS90S1200000_5.l1;
            Boolean bool2 = Boolean.TRUE;
            C189200o6.m2constructorimpl(bool2);
            interfaceC1364105Vn2.resumeWith(bool2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS90S1200000_5 awS90S1200000_5, Object obj) {
        int iLIZ;
        C377660ErM c377660ErM = (C377660ErM) obj;
        if (c377660ErM.LIZIZ != 0) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS90S1200000_5.l1;
            Boolean bool = Boolean.FALSE;
            C189200o6.m2constructorimpl(bool);
            interfaceC1364105Vn.resumeWith(bool);
            InterfaceC382380Eyy interfaceC382380Eyy = ((AbstractC381690Exr) awS90S1200000_5.l2).LIZLLL;
            if (interfaceC382380Eyy != null) {
                Integer numValueOf = Integer.valueOf(c377660ErM.LJ);
                if (C08A4.LIZ(Integer.valueOf(numValueOf.intValue()))) {
                    iLIZ = numValueOf.intValue();
                } else {
                    iLIZ = C378870EtJ.LIZ();
                }
                interfaceC382380Eyy.LIZIZ(new C377760ErW(5, awS90S1200000_5.s0, iLIZ, "Quota error", null, 16));
            }
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS90S1200000_5.l1;
            Boolean bool2 = Boolean.TRUE;
            C189200o6.m2constructorimpl(bool2);
            interfaceC1364105Vn2.resumeWith(bool2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1200000_5(C23260099m c23260099m, AbstractC381690Exr abstractC381690Exr, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c23260099m;
        this.l2 = abstractC381690Exr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S1200000_5(C377730ErT c377730ErT, C377730ErT c377730ErT2, List<EditorProAIGCMediaItemModel> list, String str) {
        super(1);
        this.$t = str;
        this.l1 = c377730ErT;
        this.l2 = c377730ErT2;
        this.s0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1200000_5(C381370ExL c381370ExL, C381340ExI c381340ExI, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c381370ExL;
        this.l2 = c381340ExI;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1200000_5(AbstractC381680Exq abstractC381680Exq, String str, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l1 = c23260099m;
        this.l2 = abstractC381680Exq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1200000_5(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.l2 = c0e48;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S1200000_5(List list, List<? extends NLETrackSlot> list2, EffectModel effectModel, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.l2 = list2;
        this.s0 = effectModel;
    }
}
