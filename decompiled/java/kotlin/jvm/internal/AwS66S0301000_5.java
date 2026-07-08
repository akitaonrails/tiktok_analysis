package kotlin.jvm.internal;

import X.C09AY;
import X.C0E6P;
import X.C0EGC;
import X.C0EM5;
import X.C0EZE;
import X.C0EZF;
import X.C0F8M;
import X.C0F8O;
import X.C0F8Y;
import X.C0F8Z;
import X.C0FGR;
import X.C0FGZ;
import X.C13LP;
import X.C1664680tQA;
import X.C2188811AlT;
import X.C259800zU;
import X.C347080Dj8;
import X.C377390Eqv;
import X.C377730ErT;
import X.C387270FGj;
import X.InterfaceC1452170ntP;
import X.InterfaceC377650ErL;
import X.InterfaceC387360FGs;
import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETextTemplateClipSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Font;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NewTextTemplateRichText;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Style;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS66S0301000_5 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS66S0301000_5 awS66S0301000_5) {
        String str;
        C0FGZ c0fgz;
        InterfaceC387360FGs interfaceC387360FGs = ((C387270FGj) awS66S0301000_5.l0).LLJJIJIL;
        if (interfaceC387360FGs != null) {
            interfaceC387360FGs.LIZJ((TextMotionModel) awS66S0301000_5.l1);
        }
        List<C0FGZ> list = ((C387270FGj) awS66S0301000_5.l0).T2().LIZJ;
        if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(awS66S0301000_5.i3, list)) != null) {
            str = c0fgz.LIZ;
        } else {
            str = null;
        }
        C0FGR c0fgrT4 = ((C387270FGj) awS66S0301000_5.l0).T4();
        if (c0fgrT4 != null) {
            c0fgrT4.LJJIFFI(((C387270FGj) awS66S0301000_5.l0).LLJJJ, str, ((Effect) awS66S0301000_5.l2).getResourceId());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS66S0301000_5 awS66S0301000_5) {
        InterfaceC377650ErL interfaceC377650ErLC5 = ((C377730ErT) awS66S0301000_5.l0).C5();
        if (interfaceC377650ErLC5 != null) {
            interfaceC377650ErLC5.rX0((String) ((C259800zU) awS66S0301000_5.l1).element, ((AIGCGenerationParam) ((C259800zU) awS66S0301000_5.l2).element).mediaType, new C377390Eqv(false, true, false, false, 13));
        }
        ((C377730ErT) awS66S0301000_5.l0).L7((AIGCGenerationParam) ((C259800zU) awS66S0301000_5.l2).element, awS66S0301000_5.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS66S0301000_5 awS66S0301000_5) {
        NLESegment mainSegment;
        NLEStyText nLEStyText;
        VecNLETextTemplateClipSPtr textClips;
        NLETextTemplateClip nLETextTemplateClip;
        VecNLETextTemplateClipSPtr textClips2;
        NLETextTemplateClip nLETextTemplateClip2;
        NLESegmentTextSticker nLESegmentTextStickerLIZ;
        SubTemplateStyle subTemplateStyle;
        List<Style> list;
        Style style;
        if (!((C0F8Z) awS66S0301000_5.l0).LJIL.get()) {
            if (C0F8Y.LJIIL((TextStickerModel) ((C1664680tQA) awS66S0301000_5.l1).LIZ)) {
                NLETrackSlot nLETrackSlotLJIILLIIL = ((C0F8Z) awS66S0301000_5.l0).LJIILLIIL();
                if (nLETrackSlotLJIILLIIL != null && (nLESegmentTextStickerLIZ = C347080Dj8.LIZ(awS66S0301000_5.i3, nLETrackSlotLJIILLIIL)) != null) {
                    C1664680tQA c1664680tQA = (C1664680tQA) awS66S0301000_5.l1;
                    int i = awS66S0301000_5.i3;
                    TextFontModel textFontModel = (TextFontModel) awS66S0301000_5.l2;
                    C0F8O c0f8o = C0F8M.LJJIJ;
                    String richContent = nLESegmentTextStickerLIZ.getRichContent();
                    c0f8o.getClass();
                    C0F8M c0f8mLIZ = C0F8O.LIZ(richContent);
                    NewTextTemplateRichText newTextTemplateRichText = c0f8mLIZ.LJJIIZI;
                    if (newTextTemplateRichText != null && (list = newTextTemplateRichText.styles) != null && (style = (Style) C13LP.LJJJLL(list)) != null) {
                        style.font = new Font(textFontModel.fontId, textFontModel.localPath);
                    }
                    nLESegmentTextStickerLIZ.setRichContent(c0f8mLIZ.LJFF());
                    SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(i, ((TextStickerModel) c1664680tQA.LIZ).getCompatModel().getSubTemplates());
                    if (subTemplateInfo != null && (subTemplateStyle = subTemplateInfo.style) != null) {
                        subTemplateStyle.fontModel = textFontModel;
                    }
                }
            } else {
                NLETrackSlot nLETrackSlotLJIILLIIL2 = ((C0F8Z) awS66S0301000_5.l0).LJIILLIIL();
                if (nLETrackSlotLJIILLIIL2 != null && (mainSegment = nLETrackSlotLJIILLIIL2.getMainSegment()) != null) {
                    TextFontModel textFontModel2 = (TextFontModel) awS66S0301000_5.l2;
                    NLESegmentTextTemplate nLESegmentTextTemplateDynamicCast = NLESegmentTextTemplate.dynamicCast(mainSegment);
                    if (nLESegmentTextTemplateDynamicCast == null || (textClips2 = nLESegmentTextTemplateDynamicCast.getTextClips()) == null || (nLETextTemplateClip2 = (NLETextTemplateClip) C13LP.LJJJLL(textClips2)) == null || (nLEStyText = nLETextTemplateClip2.getContentStyle()) == null) {
                        nLEStyText = new NLEStyText();
                    }
                    nLEStyText.setFont(new NLEResourceNode());
                    NLEResourceNode font = nLEStyText.getFont();
                    if (font != null) {
                        font.setResourceFile(textFontModel2.localPath);
                    }
                    nLEStyText.setTypeSettingKind(0);
                    if (nLESegmentTextTemplateDynamicCast != null && (textClips = nLESegmentTextTemplateDynamicCast.getTextClips()) != null && (nLETextTemplateClip = (NLETextTemplateClip) C13LP.LJJJLL(textClips)) != null) {
                        nLETextTemplateClip.setContentStyle(nLEStyText);
                    }
                }
            }
            ((C0F8Z) awS66S0301000_5.l0).LJIIJJI.commit();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS66S0301000_5 awS66S0301000_5) {
        int iLLL;
        Integer numValueOf;
        ((C0EZE) awS66S0301000_5.l0).LIZLLL((Cert) awS66S0301000_5.l1);
        InterfaceC1452170ntP interfaceC1452170ntP = ((C0EZF) awS66S0301000_5.l2).LJI;
        if (interfaceC1452170ntP != null) {
            iLLL = interfaceC1452170ntP.LLL();
        } else {
            iLLL = 0;
        }
        int i = awS66S0301000_5.i3;
        if (i != -1) {
            iLLL = i;
        }
        Point point = ((C0EZF) awS66S0301000_5.l2).LIZIZ;
        if (point != null) {
            point.setY(iLLL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pauseSeekBar2-->curPoint?.y:");
        Point point2 = ((C0EZF) awS66S0301000_5.l2).LIZIZ;
        if (point2 != null) {
            numValueOf = Integer.valueOf(point2.getY());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        ((C0EZF) awS66S0301000_5.l2).LIZLLL.LJIIJ(new Pair<>(Integer.valueOf(iLLL), Integer.valueOf(((C0EZF) awS66S0301000_5.l2).LIZJ)));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS66S0301000_5 awS66S0301000_5) {
        C0EGC c0egcLJIILL = ((C0E6P) awS66S0301000_5.l0).LJIILL();
        if (c0egcLJIILL != null) {
            final C0E6P c0e6p = (C0E6P) awS66S0301000_5.l0;
            final NLETrack nLETrack = (NLETrack) awS66S0301000_5.l2;
            final int i = awS66S0301000_5.i3;
            final Function1 function1 = (Function1) awS66S0301000_5.l1;
            c0egcLJIILL.e1(null, false, false, false, new C0EM5() { // from class: X.0Dwz
                @Override // X.C0EM5
                public final void onFailed() {
                }

                @Override // X.C0EM5
                public final void onSuccess() {
                    VecNLETrackSlotSPtr slots;
                    Activity activityLJIIIZ = c0e6p.LJIIIZ();
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131850360);
                    C1390380mHk.LIZ(activityLJIIIZ, 1039, creativeToastBuilder);
                    NLETrack nLETrack2 = nLETrack;
                    function1.invoke((NLETrackSlot) ((nLETrack2 == null || (slots = nLETrack2.getSlots()) == null) ? null : C13LP.LJJJLZIJ(i, slots)));
                }
            });
        } else {
            ((Function1) awS66S0301000_5.l1).invoke(null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0301000_5(int i, NLETrack nLETrack, C0E6P c0e6p, AwS214S0300000_5 awS214S0300000_5, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0e6p;
        this.l1 = awS214S0300000_5;
        this.l2 = nLETrack;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0301000_5(C0EZE c0eze, Cert cert, C0EZF c0ezf, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0eze;
        this.l1 = cert;
        this.l2 = c0ezf;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS66S0301000_5(C377730ErT c377730ErT, C377730ErT c377730ErT2, C259800zU<String> c259800zU, C259800zU<AIGCGenerationParam> c259800zU2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c377730ErT;
        this.l1 = c377730ErT2;
        this.l2 = c259800zU;
        this.i3 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS66S0301000_5(C0F8Z c0f8z, C0F8Z c0f8z2, C1664680tQA<TextStickerModel> c1664680tQA, int i, TextFontModel textFontModel) {
        super(0);
        this.$t = textFontModel;
        this.l0 = c0f8z;
        this.l1 = c0f8z2;
        this.i3 = c1664680tQA;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0301000_5(C387270FGj c387270FGj, TextMotionModel textMotionModel, int i, Effect effect, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c387270FGj;
        this.l1 = textMotionModel;
        this.i3 = i;
        this.l2 = effect;
    }
}
