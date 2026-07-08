package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0C64;
import X.C0CIJ;
import X.C1397660mTU;
import X.C13LP;
import X.C1524705y1;
import X.C15438062q;
import X.C189200o6;
import X.C19719612Di;
import X.C2252611DEt;
import X.C2286708xd;
import X.C348740Dlo;
import X.C357700E0q;
import X.C378920EtO;
import X.C380190EvR;
import X.C385050F7v;
import X.InterfaceC20236714Gf;
import Y.ARunnableS8S0210000_5;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AwS28S0310000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S0310000_5 awS28S0310000_5, Object obj) {
        ((C378920EtO) awS28S0310000_5.l0).x5((List) obj, (C380190EvR) awS28S0310000_5.l1, awS28S0310000_5.z3, (Function2) awS28S0310000_5.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS28S0310000_5 awS28S0310000_5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            ((C1397660mTU) awS28S0310000_5.l0).LIZ().LIZIZ(null);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ep_magic_bugfix_login_apply_error", true, true) && !awS28S0310000_5.z3) {
            C1524705y1.LIZIZ(500L, new ARunnableS8S0210000_5((C357700E0q) awS28S0310000_5.l2, (Function1) awS28S0310000_5.l1, zBooleanValue, 0));
        } else {
            ((Function1) awS28S0310000_5.l1).invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS28S0310000_5 awS28S0310000_5, Object obj) {
        NLEModel model;
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        NLEResourceNode nLEResourceNode;
        Object next2;
        String resourceFile;
        NLEResourceNode blend;
        NLESegmentAIMatting segment;
        NLEModel nLEModel = (NLEModel) obj;
        if (nLEModel == null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS28S0310000_5.l0;
            DraftFileRestoreResult draftFileRestoreResult = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, 2131832448, true, new DraftFileRestoreException(-3004, null, "PUGC"));
            C189200o6.m2constructorimpl(draftFileRestoreResult);
            interfaceC20236714Gf.resumeWith(draftFileRestoreResult);
        } else {
            String resourceFile2 = null;
            if (((AwemeDraft) awS28S0310000_5.l1).LIZ.pugcTemplateData.hasMatting) {
                C013C c013c = new C013C();
                VecNLETrackSPtr tracks2 = nLEModel.getTracks();
                if (tracks2 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLETrack> it2 = tracks2.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        NLEAIMatting aIMatting = ((NLETrackSlot) it3.next()).getAIMatting();
                        if (aIMatting != null && (segment = aIMatting.getSegment()) != null) {
                            blend = segment.getBlend();
                        } else {
                            blend = null;
                        }
                        arrayList2.add(blend);
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next2 = it4.next();
                            NLEResourceNode nLEResourceNode2 = (NLEResourceNode) next2;
                            if (nLEResourceNode2 != null) {
                                resourceFile = nLEResourceNode2.getResourceFile();
                            } else {
                                resourceFile = null;
                            }
                            if (C2286708xd.LIZJ(resourceFile)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    nLEResourceNode = (NLEResourceNode) next2;
                } else {
                    nLEResourceNode = null;
                }
                NLEModel model2 = ((NLEEditor) awS28S0310000_5.l2).getModel();
                if (model2 != null) {
                    C348740Dlo.LIZ(model2, new AwS371S0200000_5(c013c, nLEResourceNode, 278));
                }
                if (c013c.element) {
                    C385050F7v.LJ((NLEEditor) awS28S0310000_5.l2);
                    ((AwemeDraft) awS28S0310000_5.l1).LJIJJ(((NLEEditor) awS28S0310000_5.l2).store());
                }
            }
            if ((awS28S0310000_5.z3 || ((AwemeDraft) awS28S0310000_5.l1).LIZ.pugcTemplateData.featureCodes.contains(Integer.valueOf(C0CIJ.UGC_NEW_AI_CREATE.getValue()))) && (model = ((NLEEditor) awS28S0310000_5.l2).getModel()) != null && (tracks = model.getTracks()) != null) {
                Iterator<NLETrack> it5 = tracks.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next = it5.next();
                        NLETrack nLETrack = next;
                        if (nLETrack != null) {
                            NLETrackType trackType = nLETrack.getTrackType();
                            NLETrackType extraTrackType = nLETrack.getExtraTrackType();
                            NLETrackType nLETrackType = NLETrackType.NONE;
                            if (trackType == nLETrackType || trackType == NLETrackType.FILTER) {
                                if (extraTrackType != nLETrackType) {
                                    trackType = extraTrackType;
                                } else {
                                    trackType = nLETrackType;
                                }
                            }
                            if (trackType == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM")) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = next;
                if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null) {
                    AwemeDraft awemeDraft = (AwemeDraft) awS28S0310000_5.l1;
                    NLEEditor nLEEditor = (NLEEditor) awS28S0310000_5.l2;
                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                    if (nLESegmentAudioDynamicCast != null && (resource2 = nLESegmentAudioDynamicCast.getResource()) != null) {
                        resourceFile2 = resource2.getResourceFile();
                    }
                    if (!C2286708xd.LIZJ(resourceFile2)) {
                        if (nLESegmentAudioDynamicCast != null && (resource = nLESegmentAudioDynamicCast.getResource()) != null) {
                            resource.setResourceFile(awemeDraft.LJII);
                        }
                        C385050F7v.LJ(nLEEditor);
                        awemeDraft.LJIJJ(nLEEditor.store());
                    }
                }
            }
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) awS28S0310000_5.l0;
            DraftFileRestoreResult draftFileRestoreResult2 = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, null, false, new DraftFileRestoreException(0, null, "Unknown"));
            C189200o6.m2constructorimpl(draftFileRestoreResult2);
            interfaceC20236714Gf2.resumeWith(draftFileRestoreResult2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0310000_5(C378920EtO c378920EtO, C378920EtO c378920EtO2, C380190EvR c380190EvR, boolean z, Function2<? super Boolean, ? super String, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l0 = c378920EtO;
        this.l1 = c378920EtO2;
        this.z3 = c380190EvR;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0310000_5(C1397660mTU c1397660mTU, C1397660mTU c1397660mTU2, boolean z, Function1<? super Boolean, Unit> function1, C357700E0q c357700E0q) {
        super(1);
        this.$t = c357700E0q;
        this.l0 = c1397660mTU;
        this.z3 = c1397660mTU2;
        this.l1 = z;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0310000_5(C2252611DEt c2252611DEt, AwemeDraft awemeDraft, NLEEditor nLEEditor, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = awemeDraft;
        this.l2 = nLEEditor;
        this.z3 = z;
    }
}
