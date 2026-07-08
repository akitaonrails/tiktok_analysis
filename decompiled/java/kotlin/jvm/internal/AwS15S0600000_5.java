package kotlin.jvm.internal;

import X.C09AY;
import X.C0E12;
import X.C0ES4;
import X.C0EYP;
import X.C0EZH;
import X.C2113008Po;
import X.C275380Aqm;
import X.C289250BVj;
import X.C351160Dpi;
import X.C351180Dpk;
import X.C351190Dpl;
import X.C351220Dpo;
import X.C351560DqM;
import X.C363750ENx;
import X.C364440EQo;
import X.EnumC359990E9l;
import X.InterfaceC1455620nyy;
import X.InterfaceC351200Dpm;
import Y.ARunnableS0S0400010_5;
import Y.ARunnableS0S1501000_5;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnDone;
import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnProgressChanged;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS15S0600000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS15S0600000_5 awS15S0600000_5) {
        Effect effectOh0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS15S0600000_5.l0;
        if (videoPublishEditModel.creativeModel.inlineCaptionModel == null && !C289250BVj.LIZ(videoPublishEditModel)) {
            ((C364440EQo) awS15S0600000_5.l1).LIZ();
        }
        C0ES4 c0es4 = new C0ES4((Context) awS15S0600000_5.l2);
        int iLIZ = C363750ENx.LIZ();
        C0E12 c0e12 = C363750ENx.LIZ;
        c0e12.LIZJ("before_caption_control_height", iLIZ);
        C363750ENx.LJFF(c0es4.LIZ());
        c0e12.LIZIZ("sync_control_height_when_enter_ep", true);
        C0EYP c0eyp = (C0EYP) awS15S0600000_5.l3;
        if (c0eyp != null) {
            Scene scene = (Scene) awS15S0600000_5.l4;
            EnumC359990E9l enumC359990E9l = EnumC359990E9l.OPEN_EDITOR_PRO_CAPTION;
            InterfaceC1455620nyy interfaceC1455620nyy = (InterfaceC1455620nyy) awS15S0600000_5.l5;
            if (interfaceC1455620nyy != null) {
                effectOh0 = interfaceC1455620nyy.Oh0();
            } else {
                effectOh0 = null;
            }
            c0eyp.Dy0(scene, new C0EZH((C364440EQo) awS15S0600000_5.l1, false, false, false, false, false, false, false, enumC359990E9l, true, false, false, effectOh0, false, false, 55806));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S0600000_5 awS15S0600000_5) {
        NLETrackSlot renderProxy;
        NLESegment mainSegment;
        NLEError nLEErrorLLJJIJIL;
        NLETrackSlot nLETrackSlotLLJJI = ((C351560DqM) awS15S0600000_5.l0).LLJJI();
        if (nLETrackSlotLLJJI != null && (renderProxy = nLETrackSlotLLJJI.getRenderProxy()) != null && (mainSegment = renderProxy.getMainSegment()) != null) {
            final C351180Dpk c351180Dpk = (C351180Dpk) awS15S0600000_5.l2;
            final Function0 function0 = (Function0) awS15S0600000_5.l1;
            final C351560DqM c351560DqM = (C351560DqM) awS15S0600000_5.l0;
            final NLETrackSlot nLETrackSlot = (NLETrackSlot) awS15S0600000_5.l3;
            final InterfaceC351200Dpm interfaceC351200Dpm = (InterfaceC351200Dpm) awS15S0600000_5.l4;
            final C351190Dpl c351190Dpl = (C351190Dpl) awS15S0600000_5.l5;
            if (C351220Dpo.LJJLIIIJJI(mainSegment).length() > 0 && !Intrinsics.LJFF(C351220Dpo.LJJLIIIJJI(mainSegment), mainSegment.getResource().getResourceFile())) {
                c351180Dpk.LIZIZ = C351220Dpo.LJJLIIIJJI(mainSegment);
                function0.invoke();
            } else {
                String resourceFile = mainSegment.getResource().getResourceFile();
                final String strLLJJJIL = c351560DqM.LLJJJIL(NLEResType.VIDEO, resourceFile);
                if (strLLJJJIL != null && !C2113008Po.LIZIZ(strLLJJJIL)) {
                    INLEMediaReverseOnProgressChanged iNLEMediaReverseOnProgressChanged = new INLEMediaReverseOnProgressChanged() { // from class: X.0DqX
                        @Override // com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnProgressChanged
                        public final void onChanged(double d) {
                            C351560DqM c351560DqM2 = c351560DqM;
                            C786410Ut5.LJJZZIII(c351560DqM2.LIZJ, new ARunnableS0S0400010_5(c351560DqM2, nLETrackSlot, interfaceC351200Dpm, d, c351190Dpl, 1));
                        }
                    };
                    INLEMediaReverseOnDone iNLEMediaReverseOnDone = new INLEMediaReverseOnDone() { // from class: X.0DqV
                        @Override // com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnDone
                        public final void onDone(int i) {
                            C351560DqM c351560DqM2 = c351560DqM;
                            C786410Ut5.LJJZZIII(c351560DqM2.LIZJ, new ARunnableS0S1501000_5(c351560DqM2, nLETrackSlot, i, c351180Dpk, strLLJJJIL, function0, interfaceC351200Dpm, 1));
                        }
                    };
                    if (((Boolean) C275380Aqm.LIZ.getValue()).booleanValue()) {
                        nLEErrorLLJJIJIL = c351560DqM.LLJJJ(nLETrackSlot.getUUID(), resourceFile, strLLJJJIL, iNLEMediaReverseOnProgressChanged, iNLEMediaReverseOnDone);
                    } else {
                        nLEErrorLLJJIJIL = c351560DqM.LLJJIJIL(resourceFile, strLLJJJIL, iNLEMediaReverseOnProgressChanged, iNLEMediaReverseOnDone);
                    }
                    if (nLEErrorLLJJIJIL != NLEError.SUCCESS) {
                        if (interfaceC351200Dpm != null) {
                            interfaceC351200Dpm.LIZIZ(-1);
                            interfaceC351200Dpm.LIZJ();
                        }
                    } else if (interfaceC351200Dpm != null) {
                        interfaceC351200Dpm.LIZLLL();
                    }
                } else {
                    c351180Dpk.LIZIZ = strLLJJJIL;
                    function0.invoke();
                }
            }
        } else {
            ((Function0) awS15S0600000_5.l1).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0600000_5(C351560DqM c351560DqM, C351160Dpi c351160Dpi, C351180Dpk c351180Dpk, NLETrackSlot nLETrackSlot, InterfaceC351200Dpm interfaceC351200Dpm, C351190Dpl c351190Dpl, int i) {
        super(0);
        this.$t = i;
        this.l0 = c351560DqM;
        this.l1 = c351160Dpi;
        this.l2 = c351180Dpk;
        this.l3 = nLETrackSlot;
        this.l4 = interfaceC351200Dpm;
        this.l5 = c351190Dpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0600000_5(Context context, Scene scene, VideoPublishEditModel videoPublishEditModel, C364440EQo c364440EQo, InterfaceC1455620nyy interfaceC1455620nyy, C0EYP c0eyp, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c364440EQo;
        this.l2 = context;
        this.l3 = c0eyp;
        this.l4 = scene;
        this.l5 = interfaceC1455620nyy;
    }
}
