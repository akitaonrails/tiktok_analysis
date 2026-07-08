package kotlin.jvm.internal;

import X.C09AY;
import X.C0EZ9;
import X.C0FGR;
import X.C0FHQ;
import X.C0FHS;
import X.C118300cf;
import X.C13LP;
import X.C346900Diq;
import X.C348100Dkm;
import X.C349310Dmj;
import X.C351220Dpo;
import X.C351510DqH;
import X.C352130DrH;
import X.InterfaceC1452170ntP;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS74S1300000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS74S1300000_5 awS74S1300000_5) {
        C348100Dkm c348100DkmLIZIZ;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLESegmentAudio nLESegmentAudio;
        InterfaceC1452170ntP value = ((C0EZ9) awS74S1300000_5.l1).JY0().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
            AudioRecorderParam audioRecorderParam = (AudioRecorderParam) awS74S1300000_5.l2;
            AudioRecorderParam audioRecorderParam2 = (AudioRecorderParam) awS74S1300000_5.l3;
            if (C346900Diq.LIZ(c348100DkmLIZIZ.LIZ.getModel())) {
                List listLLIIII = C13LP.LLIIII(audioRecorderParam2.getMStack());
                List listLLIIII2 = C13LP.LLIIII(audioRecorderParam.getMStack());
                ArrayList<Point> arrayList = new ArrayList();
                ArrayList<Point> arrayList2 = new ArrayList();
                int size = listLLIIII.size() - 1;
                while (true) {
                    if (-1 >= size) {
                        break;
                    }
                    Point point = (Point) C13LP.LJJJLZIJ(size, listLLIIII2);
                    if (point != null && point.isEqual((Point) ListProtector.get(listLLIIII, size))) {
                        Integer numValueOf = Integer.valueOf(size);
                        if (numValueOf != null) {
                            int size2 = listLLIIII2.size();
                            for (int iIntValue = numValueOf.intValue(); iIntValue < size2; iIntValue++) {
                                if (iIntValue != numValueOf.intValue()) {
                                    arrayList.add(ListProtector.get(listLLIIII2, iIntValue));
                                }
                            }
                            int size3 = listLLIIII.size();
                            for (int iIntValue2 = numValueOf.intValue(); iIntValue2 < size3; iIntValue2++) {
                                if (iIntValue2 != numValueOf.intValue()) {
                                    arrayList2.add(ListProtector.get(listLLIIII, iIntValue2));
                                }
                            }
                        }
                    } else {
                        size--;
                    }
                }
                arrayList.addAll(listLLIIII2);
                arrayList2.addAll(listLLIIII);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
                if (!arrayList.isEmpty()) {
                    VecNLETrackSPtr tracks = c348100DkmLIZIZ.LIZ.getModel().getTracks();
                    ArrayList<NLETrack> arrayList3 = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        if (C351220Dpo.LLILL(nLETrack)) {
                            arrayList3.add(nLETrack);
                        }
                    }
                    for (NLETrack nLETrack2 : arrayList3) {
                        for (Point point2 : arrayList) {
                            for (NLETrackSlot nLETrackSlot : nLETrack2.getSlots()) {
                                long startTime = nLETrackSlot.getStartTime();
                                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                                long j2 = startTime / j;
                                long endTime = nLETrackSlot.getEndTime() / j;
                                if (j2 >= point2.getX() && endTime <= point2.getY()) {
                                    nLETrack2.removeSlot(nLETrackSlot);
                                }
                            }
                        }
                    }
                    C351510DqH c351510DqH = C351510DqH.LIZ;
                    NLEModel model = c348100DkmLIZIZ.LIZ.getModel();
                    NLETrackType nLETrackType = NLETrackType.AUDIO;
                    c351510DqH.getClass();
                    C351510DqH.LJIIJJI(model, nLETrackType, "");
                }
                if (!arrayList2.isEmpty()) {
                    NLETrack nLETrackLIZIZ = C349310Dmj.LIZIZ(c348100DkmLIZIZ.LIZ.getModel());
                    for (Point point3 : arrayList2) {
                        Iterator<NLETrack> it4 = c348100DkmLIZIZ.LIZ.getModel().getTracks().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NLETrack nLETrack3 = next;
                        if (nLETrack3 != null && (slots = nLETrack3.getSlots()) != null) {
                            NLETrackSlot nLETrackSlot2 = null;
                            for (NLETrackSlot nLETrackSlot3 : slots) {
                                if (nLETrackSlot3.getStartTime() == ((long) point3.getX()) * 1000) {
                                    nLETrackSlot2 = nLETrackSlot3;
                                }
                            }
                            if (nLETrackSlot2 != null) {
                                C351510DqH c351510DqH2 = C351510DqH.LIZ;
                                NLEModel model2 = c348100DkmLIZIZ.LIZ.getModel();
                                c351510DqH2.getClass();
                                int iLJIL = C351510DqH.LJIL(model2) + 1;
                                nLETrackSlot2.getMainSegment().getResource().setResourceName("Record");
                                NLESegment mainSegment = nLETrackSlot2.getMainSegment();
                                if ((mainSegment instanceof NLESegmentAudio) && (nLESegmentAudio = (NLESegmentAudio) mainSegment) != null) {
                                    nLESegmentAudio.setKeepTone(true);
                                }
                                nLETrackSlot2.setExtra("ep_slot_add_order", String.valueOf(iLJIL));
                                nLETrackLIZIZ.addSlot(NLETrackSlot.dynamicCast(nLETrackSlot2.deepClone(true)));
                            }
                        }
                    }
                }
            }
            c348100DkmLIZIZ.LIZ.commit();
        }
        ((C0EZ9) awS74S1300000_5.l1).Z1();
        C0EZ9 c0ez9 = (C0EZ9) awS74S1300000_5.l1;
        String str = awS74S1300000_5.s0;
        if (str == null) {
            str = "";
        }
        c0ez9.Q3(str);
        ((C0EZ9) awS74S1300000_5.l1).q3().Sq(true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS74S1300000_5 awS74S1300000_5) {
        ((C0FHS) awS74S1300000_5.l1).i3(new AwS584S0100000_5((TextFontModel) awS74S1300000_5.l2, 201));
        C0FHQ c0fhq = ((C0FHS) awS74S1300000_5.l1).LLJJIJIL;
        if (c0fhq != null) {
            c0fhq.LIZ((TextFontModel) awS74S1300000_5.l2, ((C118300cf) awS74S1300000_5.l3).element);
        }
        C0FGR c0fgrV5 = ((C0FHS) awS74S1300000_5.l1).v5();
        if (c0fgrV5 != null) {
            c0fgrV5.LJIIIIZZ(((C0FHS) awS74S1300000_5.l1).LLJJJ, awS74S1300000_5.s0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S1300000_5(C0EZ9 c0ez9, String str, AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0ez9;
        this.s0 = str;
        this.l2 = audioRecorderParam;
        this.l3 = audioRecorderParam2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S1300000_5(C0FHS c0fhs, TextFontModel textFontModel, C118300cf c118300cf, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0fhs;
        this.l2 = textFontModel;
        this.l3 = c118300cf;
        this.s0 = str;
    }
}
