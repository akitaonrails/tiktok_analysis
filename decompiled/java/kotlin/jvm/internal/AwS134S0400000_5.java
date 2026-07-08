package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C0EGY;
import X.C0EIM;
import X.C0EKW;
import X.C0ELI;
import X.C0EYP;
import X.C0EZH;
import X.C0F8J;
import X.C0F8Z;
import X.C0FGA;
import X.C0FKD;
import X.C0FMO;
import X.C0FMR;
import X.C13LP;
import X.C1402900mbw;
import X.C1463860oCG;
import X.C1664680tQA;
import X.C194431114z;
import X.C19A3;
import X.C19EG;
import X.C19GS;
import X.C1DRG;
import X.C20684815ws;
import X.C353880Du6;
import X.C354270Duj;
import X.C358780E4u;
import X.C358790E4v;
import X.C363500EMy;
import X.C364440EQo;
import X.C365910EWf;
import X.C365920EWg;
import X.C372480Ej0;
import X.C376610Epf;
import X.C384550F5x;
import X.C389960FQs;
import X.C573570MeZ;
import X.C786410Ut5;
import X.EnumC359990E9l;
import X.EnumC361800EGk;
import X.InterfaceC359850E8x;
import android.view.TextureView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class AwS134S0400000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS134S0400000_5 awS134S0400000_5) {
        if (!((C194431114z) awS134S0400000_5.l0).d6()) {
            ((C0FMR) awS134S0400000_5.l1).LIZJ(((Effect) awS134S0400000_5.l2).getEffectId(), (C0FMO) awS134S0400000_5.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS134S0400000_5 awS134S0400000_5) {
        C0EYP c0eyp = (C0EYP) awS134S0400000_5.l0;
        if (c0eyp != null) {
            c0eyp.Dy0((Scene) awS134S0400000_5.l1, new C0EZH((C364440EQo) awS134S0400000_5.l3, false, false, false, false, false, false, false, EnumC359990E9l.OPEN_EDITOR_PRO_RETOUCH_PANEL, false, true, ((C384550F5x) awS134S0400000_5.l2).LJII, null, false, false, 58878));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS134S0400000_5 awS134S0400000_5) {
        C0FKD c0fkd = (C0FKD) awS134S0400000_5.l0;
        c0fkd.LJII = true;
        ((C0FGA) awS134S0400000_5.l1).LIZIZ(new AwS371S0200000_5((Function1) awS134S0400000_5.l2, (Function1<? super TextTemplateParams, Unit>) c0fkd, (C0FKD) awS134S0400000_5.l3, (TextTemplateModel) 302));
        C786410Ut5.c2(((C0FKD) awS134S0400000_5.l0).LIZIZ, 4);
        C0F8J.LIZ("inspiration", "textStickerView.visibility = View.INVISIBLE");
        ((C0FKD) awS134S0400000_5.l0).LIZJ.LIZLLL(new AwS584S0100000_5((TextTemplateModel) awS134S0400000_5.l3, 1180), true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS134S0400000_5 awS134S0400000_5) {
        ((C376610Epf) awS134S0400000_5.l0).LJFF((Function0) awS134S0400000_5.l1, (Function2) awS134S0400000_5.l2);
        ((Function0) awS134S0400000_5.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS134S0400000_5 awS134S0400000_5) {
        return new C358790E4v((C19EG) awS134S0400000_5.l0, (C19A3) awS134S0400000_5.l1, (C1DRG) awS134S0400000_5.l2, ((C358780E4u) awS134S0400000_5.l3).LJI(), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1098), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1099), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1100), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1101), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1102), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1103), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1105), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1107), new AwS549S0100000_5((C358780E4u) awS134S0400000_5.l3, 1109), new AwS584S0100000_5((C358780E4u) awS134S0400000_5.l3, 917), new AwS584S0100000_5((C358780E4u) awS134S0400000_5.l3, 918), new AwS584S0100000_5((C358780E4u) awS134S0400000_5.l3, 919));
    }

    public static final Object invoke$4(AwS134S0400000_5 awS134S0400000_5) {
        INLEPlayer playerApi;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        float fFloatValue;
        C0F8Z c0f8z = (C0F8Z) awS134S0400000_5.l0;
        c0f8z.LJIIJJI.setModel(c0f8z.LJIILIIL());
        final NLETrackSlot nLETrackSlotLJIJJ = ((C0F8Z) awS134S0400000_5.l0).LJIJJ((TextStickerModel) awS134S0400000_5.l1);
        if (nLETrackSlotLJIJJ != null) {
            long measuredEndTime = nLETrackSlotLJIJJ.getMeasuredEndTime() - nLETrackSlotLJIJJ.getMeasuredStartTime();
            NLEModel model = ((C0F8Z) awS134S0400000_5.l0).LJIIJJI.getModel();
            if (model != null) {
                Float f = (Float) awS134S0400000_5.l2;
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.5625f;
                }
                model.setCanvasRatio(fFloatValue);
            }
            NLEModel model2 = ((C0F8Z) awS134S0400000_5.l0).LJIIJJI.getModel();
            if (model2 != null && (mainTrack = model2.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
                if (aVFile != null) {
                    aVFile.setDuration(measuredEndTime);
                }
                nLESegmentVideoDynamicCast.setTimeClipEnd(measuredEndTime);
                nLETrackSlot.setEndTime(measuredEndTime);
            }
            ((C0F8Z) awS134S0400000_5.l0).LJIILIIL = measuredEndTime;
            NLETrackSlot nLETrackSlotLJIILLIIL = ((C0F8Z) awS134S0400000_5.l0).LJIILLIIL();
            if (nLETrackSlotLJIILLIIL != null) {
                nLETrackSlotLJIILLIIL.setEnable(true);
            }
            ((C0F8Z) awS134S0400000_5.l0).LJIIJJI.commit();
            C1463860oCG c1463860oCG = ((C0F8Z) awS134S0400000_5.l0).LJIIL;
            if (c1463860oCG != null && (playerApi = c1463860oCG.getPlayerApi()) != null) {
                ((C389960FQs) playerApi).prepare();
            }
            final C0F8Z c0f8z2 = (C0F8Z) awS134S0400000_5.l0;
            final TextStickerModel textStickerModel = (TextStickerModel) awS134S0400000_5.l1;
            final Function0 function0 = (Function0) awS134S0400000_5.l3;
            C0F8Z.LJIJI(c0f8z2, new INLEListenerSeek() { // from class: X.0F8a
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                public final void onSeekDone(int i) {
                    Integer numValueOf;
                    float f2;
                    INLEPlayer playerApi2;
                    INLEPlayer playerApi3;
                    C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showSticker seek callback isHint: ");
                    sbLIZ.append(textStickerModel.getTextTemplateModel().isHint);
                    sbLIZ.append(" visible: ");
                    TextureView textureView = c0f8z2.LJIILJJIL;
                    String uuid = null;
                    if (textureView != null) {
                        numValueOf = Integer.valueOf(textureView.getVisibility());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
                    TextureView textureView2 = c0f8z2.LJIILJJIL;
                    if (textureView2 != null && textureView2.getVisibility() == 8) {
                        return;
                    }
                    NLETrackSlot nLETrackSlotLJIILLIIL2 = c0f8z2.LJIILLIIL();
                    if (nLETrackSlotLJIILLIIL2 != null) {
                        uuid = nLETrackSlotLJIILLIIL2.getUUID();
                    }
                    if (!Intrinsics.LJFF(uuid, nLETrackSlotLJIJJ.getUUID())) {
                        C1453810nw3 c1453810nw3 = C1453810nw3.LIZ;
                        VideoPublishEditModel videoPublishEditModel = c0f8z2.LIZJ;
                        c1453810nw3.getClass();
                        if (C1453810nw3.LIZ(videoPublishEditModel)) {
                            return;
                        }
                    }
                    C1463860oCG c1463860oCG2 = c0f8z2.LJIIL;
                    if (c1463860oCG2 != null && (playerApi3 = c1463860oCG2.getPlayerApi()) != null) {
                        ((C389960FQs) playerApi3).refreshCurrentFrame();
                    }
                    C1463860oCG c1463860oCG3 = c0f8z2.LJIIL;
                    if (c1463860oCG3 != null && (playerApi2 = c1463860oCG3.getPlayerApi()) != null) {
                        ((C389960FQs) playerApi2).play();
                    }
                    TextureView textureView3 = c0f8z2.LJIILJJIL;
                    if (textureView3 != null) {
                        C786410Ut5.LLIIIILZ(textureView3, 0);
                    }
                    TextureView textureView4 = c0f8z2.LJIILJJIL;
                    if (textureView4 != null) {
                        if (textStickerModel.getTextTemplateModel().isHint) {
                            c0f8z2.getClass();
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        C786410Ut5.Q4(f2, textureView4);
                    }
                    function0.invoke();
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS134S0400000_5 awS134S0400000_5) {
        ((C0F8Z) awS134S0400000_5.l0).LJIIZILJ((LifecycleOwner) awS134S0400000_5.l1, (C1664680tQA) awS134S0400000_5.l2);
        ((Function0) awS134S0400000_5.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS134S0400000_5 awS134S0400000_5) {
        ((C0F8Z) awS134S0400000_5.l0).LJIIZILJ((LifecycleOwner) awS134S0400000_5.l1, (C1664680tQA) awS134S0400000_5.l2);
        ((Function0) awS134S0400000_5.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS134S0400000_5 awS134S0400000_5) {
        C354270Duj.LIZ(0L, new AwS134S0400000_5((C0F8Z) awS134S0400000_5.l0, (C0F8Z) awS134S0400000_5.l1, (LifecycleOwner) awS134S0400000_5.l2, (C1664680tQA<TextStickerModel>) awS134S0400000_5.l3, (Function0<Unit>) 6));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS134S0400000_5 awS134S0400000_5) {
        InterfaceC359850E8x interfaceC359850E8xB20;
        ((C0EKW) awS134S0400000_5.l0).LLIZ.uV(false);
        C0EKW c0ekw = (C0EKW) awS134S0400000_5.l0;
        C0EGY c0egy = (C0EGY) c0ekw.LLJILLL.getValue(c0ekw, C0EKW.LLJJL[5]);
        if (c0egy != null && (interfaceC359850E8xB20 = c0egy.B20()) != null) {
            interfaceC359850E8xB20.LJIIZILJ("bottom_item_text_edit_text_to_speech", C353880Du6.LIZ(null, null, 3), true);
        }
        C0EIM c0eim = C0EIM.LIZ;
        C0E48 c0e48 = (C0E48) awS134S0400000_5.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS134S0400000_5.l2;
        EnumC361800EGk enumC361800EGk = EnumC361800EGk.SOUND;
        c0eim.getClass();
        C20684815ws.LJIILLIIL("use_ai_voice", C0EIM.LIZ(c0e48, videoPublishEditModel, enumC361800EGk).LIZ);
        ((Function0) awS134S0400000_5.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS134S0400000_5 awS134S0400000_5) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        C0ELI c0eli = ((C365910EWf) awS134S0400000_5.l0).LJI;
        C365920EWg c365920EWg = (C365920EWg) awS134S0400000_5.l1;
        NLEModel nLEModel = (NLEModel) awS134S0400000_5.l2;
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS134S0400000_5.l3;
        if (c365920EWg.LIZ) {
            videoPublishEditModel = videoPublishEditModel2;
            C1402900mbw.LIZLLL(videoPublishEditModel, c365920EWg.LIZLLL, false, c0eli.LJI, c365920EWg.LJ, c0eli.LIZ, c0eli.LIZIZ, false, false, C573570MeZ.LIZIZ(videoPublishEditModel2), c365920EWg.LJFF, false, false, false, 29452);
        } else {
            videoPublishEditModel = videoPublishEditModel2;
        }
        if (c365920EWg.LIZJ) {
            u4.LJJLI(videoPublishEditModel, nLEModel, "edit_to_ep_before");
        }
        if (c365920EWg.LIZIZ) {
            boolean z2 = c365920EWg.LIZLLL;
            boolean z3 = c0eli.LIZ;
            boolean z4 = c0eli.LJI;
            boolean z5 = c0eli.LIZIZ;
            boolean z6 = c365920EWg.LJFF;
            C363500EMy.LIZ.getClass();
            if (!C363500EMy.LJIIJ && !C363500EMy.LJIIJJI) {
                z = false;
            } else {
                z = true;
            }
            C1402900mbw.LJ(videoPublishEditModel, z2, false, z4, z3, z5, z6, false, false, false, z, false, 11804);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0400000_5(C0EKW c0ekw, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, AwS249S0300000_5 awS249S0300000_5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0ekw;
        this.l1 = c0e48;
        this.l2 = videoPublishEditModel;
        this.l3 = awS249S0300000_5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0400000_5(C365910EWf c365910EWf, C365920EWg c365920EWg, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c365910EWf;
        this.l1 = c365920EWg;
        this.l2 = nLEModel;
        this.l3 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0400000_5(C0EYP c0eyp, Scene scene, C384550F5x c384550F5x, C364440EQo c364440EQo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0eyp;
        this.l1 = scene;
        this.l2 = c384550F5x;
        this.l3 = c364440EQo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS134S0400000_5(C376610Epf c376610Epf, C376610Epf c376610Epf2, Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = c376610Epf;
        this.l1 = c376610Epf2;
        this.l2 = function0;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS134S0400000_5(C0F8Z c0f8z, C0F8Z c0f8z2, LifecycleOwner lifecycleOwner, C1664680tQA<TextStickerModel> c1664680tQA, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c0f8z;
        this.l1 = c0f8z2;
        this.l2 = lifecycleOwner;
        this.l3 = c1664680tQA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0400000_5(C0F8Z c0f8z, LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA, AwS134S0400000_5 awS134S0400000_5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0f8z;
        this.l1 = lifecycleOwner;
        this.l2 = c1664680tQA;
        this.l3 = awS134S0400000_5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0400000_5(C0F8Z c0f8z, TextStickerModel textStickerModel, Float f, AwS549S0100000_5 awS549S0100000_5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0f8z;
        this.l1 = textStickerModel;
        this.l2 = f;
        this.l3 = awS549S0100000_5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS134S0400000_5(C0FKD c0fkd, C0FKD c0fkd2, C0FGA c0fga, Function1<? super TextTemplateParams, Unit> function1, TextTemplateModel textTemplateModel) {
        super(0);
        this.$t = textTemplateModel;
        this.l0 = c0fkd;
        this.l1 = c0fkd2;
        this.l2 = c0fga;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0400000_5(C194431114z c194431114z, C0FMR c0fmr, Effect effect, C0FMO c0fmo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c194431114z;
        this.l1 = c0fmr;
        this.l2 = effect;
        this.l3 = c0fmo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0400000_5(C19GS c19gs, C372480Ej0 c372480Ej0, C1DRG c1drg, C358780E4u c358780E4u, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19gs;
        this.l1 = c372480Ej0;
        this.l2 = c1drg;
        this.l3 = c358780E4u;
    }
}
