package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C0EKO;
import X.C0ELJ;
import X.C0EQI;
import X.C0EQR;
import X.C0ETH;
import X.C0F7U;
import X.C0F8Y;
import X.C0FFC;
import X.C0L7R;
import X.C0MUK;
import X.C0PEM;
import X.C118300cf;
import X.C122Q;
import X.C1398350mUb;
import X.C1402930mbz;
import X.C1415610mwR;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1697810uHb;
import X.C1DFH;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C337180DJs;
import X.C349460Dmy;
import X.C351220Dpo;
import X.C351510DqH;
import X.C354870Dvh;
import X.C358630E4f;
import X.C364810ERz;
import X.C365600EVa;
import X.C375830EoP;
import X.C376610Epf;
import X.C377120EqU;
import X.C377240Eqg;
import X.C380160EvO;
import X.C385410F9f;
import X.C385710FAj;
import X.C385730FAl;
import X.C391040FUw;
import X.C443120HZe;
import X.C817403Hg;
import X.EnumC364790ERx;
import X.InterfaceC361710EGb;
import X.InterfaceC497601wk;
import X.InterfaceC559500Lwy;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public class AwS41S0500000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        String strStore;
        float fFloatValue = ((Number) obj).floatValue();
        int i = C0L7R.LJJIJL;
        float f = i * fFloatValue;
        int i2 = (int) (f - ((C817403Hg) awS41S0500000_5.l0).element);
        if (fFloatValue == 1.0f) {
            ((C0L7R) awS41S0500000_5.l1).LJJJJZ(i - ((C118300cf) awS41S0500000_5.l2).element);
            C118300cf c118300cf = (C118300cf) awS41S0500000_5.l2;
            int i3 = C0L7R.LJJIJL;
            c118300cf.element = i3;
            ((C817403Hg) awS41S0500000_5.l0).element = i3;
        } else {
            ((C0L7R) awS41S0500000_5.l1).LJJJJZ(i2);
            ((C118300cf) awS41S0500000_5.l2).element += i2;
            ((C817403Hg) awS41S0500000_5.l0).element = f;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Template_Freeze ui progress=");
        sbLIZ.append(((C0L7R) awS41S0500000_5.l1).LJIIL);
        C201955140j.LIZLLL(c1398350mUb, "CutOptimizedVideoChosenHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (C358630E4f.LIZ()) {
            PUgcTemplateData pUgcTemplateData = C0MUK.LIZIZ((Intent) awS41S0500000_5.l3).pugcTemplateData;
            NLETemplateModel nLETemplateModel = (NLETemplateModel) ((C443120HZe) awS41S0500000_5.l4).getSecond();
            if (nLETemplateModel != null) {
                strStore = nLETemplateModel.store();
            } else {
                strStore = null;
            }
            pUgcTemplateData.combineEffectNLETemplateModel = strStore;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        int i = C364810ERz.LIZ[((EnumC364790ERx) obj).ordinal()];
        if (i != 1) {
            if (i == 2) {
                C337180DJs.LIZ((TuxIconView) awS41S0500000_5.l2);
                if (((Boolean) ((C0ETH) awS41S0500000_5.l1).LLJJJJ.getValue()).booleanValue()) {
                    C337180DJs.LIZJ((FrameLayout) awS41S0500000_5.l4);
                } else {
                    C337180DJs.LIZJ((ConstraintLayout) awS41S0500000_5.l3);
                }
                C337180DJs.LIZ((TuxIconView) awS41S0500000_5.l0);
                ((C0ETH) awS41S0500000_5.l1).LLLLIL().LIZJ.invoke(4);
            }
        } else {
            C337180DJs.LIZJ((TuxIconView) awS41S0500000_5.l0);
            if (((C0ETH) awS41S0500000_5.l1).LLLLILI().LIZ.LIZJ) {
                C337180DJs.LIZJ((TuxIconView) awS41S0500000_5.l2);
                C337180DJs.LIZ((ConstraintLayout) awS41S0500000_5.l3);
                C337180DJs.LIZ((FrameLayout) awS41S0500000_5.l4);
            } else {
                if (((Boolean) ((C0ETH) awS41S0500000_5.l1).LLJJJJ.getValue()).booleanValue()) {
                    C337180DJs.LIZJ((FrameLayout) awS41S0500000_5.l4);
                } else {
                    C337180DJs.LIZJ((ConstraintLayout) awS41S0500000_5.l3);
                }
                C337180DJs.LIZ((TuxIconView) awS41S0500000_5.l2);
            }
            ((C0ETH) awS41S0500000_5.l1).LLLLIL().LIZJ.invoke(0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel] */
    public static final Object invoke$2(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        LiveState<Size> canvasSize;
        Size sizeLIZJ;
        Number numberValueOf;
        BaseStickerModel baseStickerModel = (BaseStickerModel) obj;
        if (!Intrinsics.LJFF(((C259800zU) awS41S0500000_5.l0).element, baseStickerModel)) {
            if (((BaseStickerModel) ((C259800zU) awS41S0500000_5.l0).element).getTranslateX() == baseStickerModel.getTranslateX() && ((BaseStickerModel) ((C259800zU) awS41S0500000_5.l0).element).getTranslateY() == baseStickerModel.getTranslateY() && ((BaseStickerModel) ((C259800zU) awS41S0500000_5.l0).element).getScale() == baseStickerModel.getScale() && ((BaseStickerModel) ((C259800zU) awS41S0500000_5.l0).element).getRotation() == baseStickerModel.getRotation()) {
                ((LiveState) awS41S0500000_5.l1).LJI((C385410F9f) awS41S0500000_5.l2);
                C0EKO c0eko = C0EKO.LIZ;
                C0FFC c0ffc = (C0FFC) awS41S0500000_5.l3;
                InterfaceC361710EGb interfaceC361710EGbC5 = ((C385410F9f) awS41S0500000_5.l2).C5();
                PairIntInt pairIntInt = (PairIntInt) awS41S0500000_5.l4;
                c0eko.getClass();
                if (interfaceC361710EGbC5 != null && (canvasSize = interfaceC361710EGbC5.getCanvasSize()) != null && (sizeLIZJ = canvasSize.LIZJ()) != null) {
                    if (pairIntInt.getFirst() == 0) {
                        numberValueOf = Integer.valueOf(C1415610mwR.LIZIZ());
                    } else {
                        numberValueOf = Float.valueOf(pairIntInt.getFirst());
                    }
                    numberValueOf.floatValue();
                    sizeLIZJ.getWidth();
                    RectF visibleRectWithoutRotationInContainer = c0ffc.LJJIIJZLJL().getVisibleRectWithoutRotationInContainer();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(c0ffc.LJJIIJZLJL().getRotation(), visibleRectWithoutRotationInContainer.centerX(), visibleRectWithoutRotationInContainer.centerY());
                    matrix.mapRect(visibleRectWithoutRotationInContainer);
                    RectF rectF = new RectF((C1415610mwR.LIZIZ() - pairIntInt.getFirst()) / 2.0f, 0.0f, (C1415610mwR.LIZIZ() + pairIntInt.getFirst()) / 2.0f, pairIntInt.getSecond());
                    if (visibleRectWithoutRotationInContainer.left < rectF.left || visibleRectWithoutRotationInContainer.right > rectF.right || visibleRectWithoutRotationInContainer.top < rectF.top || visibleRectWithoutRotationInContainer.bottom > rectF.bottom) {
                        ((C385410F9f) awS41S0500000_5.l2).LLJJLIIIJLLLLLLLZ = Boolean.TRUE;
                        C391040FUw.LIZ.getClass();
                        C391040FUw.LIZIZ.storeBoolean("text_gesture_guide_show", true);
                        ((C385410F9f) awS41S0500000_5.l2).i3(AFwS234S0000000_5.get$arr$(289));
                    }
                }
            } else {
                ((C259800zU) awS41S0500000_5.l0).element = BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS41S0500000_5.l0;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C0EQR((C365600EVa) awS41S0500000_5.l1, (C0EQI) awS41S0500000_5.l2, zBooleanValue, (Function0) awS41S0500000_5.l3, (Function0) awS41S0500000_5.l4, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        C385730FAl c385730FAl = (C385730FAl) obj;
        Boolean bool = (Boolean) awS41S0500000_5.l0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = ((C385710FAj) awS41S0500000_5.l1).T2().LJIIIZ;
        }
        Boolean bool2 = (Boolean) awS41S0500000_5.l2;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = ((C385710FAj) awS41S0500000_5.l1).T2().LJIIIIZZ;
        }
        Boolean bool3 = (Boolean) awS41S0500000_5.l3;
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = ((C385710FAj) awS41S0500000_5.l1).T2().LJIIJ;
        }
        Boolean bool4 = (Boolean) awS41S0500000_5.l4;
        if (bool4 != null) {
            zBooleanValue4 = bool4.booleanValue();
        } else {
            zBooleanValue4 = ((C385710FAj) awS41S0500000_5.l1).T2().LJIIJJI;
        }
        return C385730FAl.LIZ(c385730FAl, null, null, null, null, 0, false, null, null, zBooleanValue2, zBooleanValue, zBooleanValue3, zBooleanValue4, null, null, null, false, null, new C375830EoP(Unit.LIZ), null, false, null, false, 4059391);
    }

    public static final Object invoke$5(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        C380160EvO c380160EvO = (C380160EvO) obj;
        if (C1428470nHB.LJJJJIZL((VideoPublishEditModel) awS41S0500000_5.l0) || C377240Eqg.LIZIZ((VideoPublishEditModel) awS41S0500000_5.l0)) {
            C377120EqU c377120EqU = C377120EqU.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS41S0500000_5.l0;
            C0E48 c0e48 = (C0E48) awS41S0500000_5.l1;
            c377120EqU.getClass();
            C377120EqU.LJIILL(videoPublishEditModel, c0e48, "click_back", "click_discard");
        }
        if (!u4.LJJIL((VideoPublishEditModel) awS41S0500000_5.l0) && !C1416310mxZ.LJJJJIZL((VideoPublishEditModel) awS41S0500000_5.l0) && !C1416310mxZ.LJJ((VideoPublishEditModel) awS41S0500000_5.l0)) {
            ((C376610Epf) awS41S0500000_5.l2).LJ((Function2) awS41S0500000_5.l3, (C0E48) awS41S0500000_5.l1, (C0ELJ) awS41S0500000_5.l4);
        } else {
            InterfaceC559500Lwy interfaceC559500Lwy = (InterfaceC559500Lwy) ((C376610Epf) awS41S0500000_5.l2).LIZ.LJIIL(null, InterfaceC559500Lwy.class);
            if (interfaceC559500Lwy != null) {
                interfaceC559500Lwy.Bw0();
            }
            Function2 function2 = (Function2) awS41S0500000_5.l3;
            Boolean bool = Boolean.FALSE;
            function2.invoke(bool, bool);
        }
        C1402930mbz.LJI((VideoPublishEditModel) awS41S0500000_5.l0, "editor_pro", C1402930mbz.LIZJ(c380160EvO.LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        C380160EvO c380160EvO = (C380160EvO) obj;
        if (C1428470nHB.LJJJJIZL((VideoPublishEditModel) awS41S0500000_5.l0) || C377240Eqg.LIZIZ((VideoPublishEditModel) awS41S0500000_5.l0)) {
            C377120EqU c377120EqU = C377120EqU.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS41S0500000_5.l0;
            C0E48 c0e48 = (C0E48) awS41S0500000_5.l1;
            c377120EqU.getClass();
            C377120EqU.LJIILL(videoPublishEditModel, c0e48, "click_back", "click_generate_in_drafts");
        }
        ((C376610Epf) awS41S0500000_5.l2).LJFF((Function0) awS41S0500000_5.l3, (Function2) awS41S0500000_5.l4);
        C1402930mbz.LJI((VideoPublishEditModel) awS41S0500000_5.l0, "editor_pro", C1402930mbz.LIZJ(c380160EvO.LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        ((C376610Epf) awS41S0500000_5.l0).LJ((Function2) awS41S0500000_5.l1, (C0E48) awS41S0500000_5.l2, (C0ELJ) awS41S0500000_5.l3);
        C1402930mbz.LJI((VideoPublishEditModel) awS41S0500000_5.l4, "editor_pro", C1402930mbz.LIZJ(((C380160EvO) obj).LIZIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        C122Q c122q;
        InlineCaptionModel inlineCaptionModel;
        ArrayList<StickerItemModel> arrayList;
        List<StickerItemModel> list;
        ((TextStickerData) awS41S0500000_5.l0).setTextWrapList(C1697810uHb.LJ(obj));
        StickerItemModel stickerItemModelLIZ = C0F7U.LIZ(((TextStickerModel) awS41S0500000_5.l1).getId(), (TextStickerData) awS41S0500000_5.l0);
        InfoStickerModel infoStickerModel = ((VideoPublishEditModel) awS41S0500000_5.l2).getInfoStickerModel();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            list.add(stickerItemModelLIZ);
        }
        if (C0F8Y.LJIIIIZZ((TextStickerModel) awS41S0500000_5.l1) && (inlineCaptionModel = ((VideoPublishEditModel) awS41S0500000_5.l2).creativeModel.inlineCaptionModel) != null && (arrayList = inlineCaptionModel.utterances) != null) {
            arrayList.add(stickerItemModelLIZ);
        }
        C118300cf c118300cf = (C118300cf) awS41S0500000_5.l3;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0 && (c122q = (C122Q) awS41S0500000_5.l4) != null) {
            c122q.i7(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS41S0500000_5 awS41S0500000_5, Object obj) {
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        NLETrackSlot nLETrackSlotLIZJ;
        IntRange intRange = (IntRange) obj;
        if (!intRange.isEmpty() && (mainTrack = ((NLEModel) awS41S0500000_5.l0).getMainTrack()) != null && (slotByIndex = mainTrack.getSlotByIndex(intRange.LL)) != null && (nLETrackSlotLIZJ = C354870Dvh.LIZJ((NLEModel) awS41S0500000_5.l1, slotByIndex.getUUID())) != null) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            NLETrack mainTrack2 = ((NLEModel) awS41S0500000_5.l1).getMainTrack();
            c351510DqH.getClass();
            long jLJJIJ = C351510DqH.LJJIJ(mainTrack2, nLETrackSlotLIZJ) - C351510DqH.LJJIJ(((NLEModel) awS41S0500000_5.l0).getMainTrack(), slotByIndex);
            NLETrack mainTrack3 = ((NLEModel) awS41S0500000_5.l1).getMainTrack();
            ((C349460Dmy) awS41S0500000_5.l2).LJFF(intRange, (((slotByIndex.getStartTime() + C351510DqH.LJJIJ(((NLEModel) awS41S0500000_5.l0).getMainTrack(), slotByIndex)) - nLETrackSlotLIZJ.getStartTime()) - C351510DqH.LJJIJ(mainTrack3, nLETrackSlotLIZJ)) + jLJJIJ, (ArrayList) awS41S0500000_5.l3, (Map) awS41S0500000_5.l4, null);
            ArrayList<NLETrackSlot> arrayList = (ArrayList) ((Map) awS41S0500000_5.l4).get(slotByIndex.getUUID());
            if (arrayList != null) {
                NLEModel nLEModel = (NLEModel) awS41S0500000_5.l1;
                C349460Dmy c349460Dmy = (C349460Dmy) awS41S0500000_5.l2;
                ArrayList arrayList2 = (ArrayList) awS41S0500000_5.l3;
                for (NLETrackSlot nLETrackSlot : arrayList) {
                    NLETrackSlot nLETrackSlotLJL = C351220Dpo.LJL(nLEModel, nLETrackSlot.getUUID());
                    if (nLETrackSlotLJL != null) {
                        long startTime = nLETrackSlotLIZJ.getStartTime();
                        C351510DqH c351510DqH2 = C351510DqH.LIZ;
                        NLETrack mainTrack4 = nLEModel.getMainTrack();
                        c351510DqH2.getClass();
                        c349460Dmy.LJIIIZ(-jLJJIJ, nLETrackSlot, nLETrackSlotLJL.getStartTime() - (startTime + C351510DqH.LJJIJ(mainTrack4, nLETrackSlotLIZJ)), slotByIndex);
                        arrayList2.add(nLETrackSlot);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS41S0500000_5(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, X.C376610Epf r4, X.C0ELJ r5, X.C0E48 r6, kotlin.jvm.functions.Function2 r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 5 - r8
            if (r8 == 0) goto L16
            r1 = r2
            r1.l0 = r4
            r1.l1 = r7
            r1.l2 = r6
            r1.l3 = r5
            r1.l4 = r3
            r0 = 1
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r6
            r1.l2 = r4
            r1.l3 = r7
            r1.l4 = r5
            r0 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS41S0500000_5.<init>(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0Epf, X.0ELJ, X.0E48, kotlin.jvm.functions.Function2, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S0500000_5(C259800zU c259800zU, C259800zU<BaseStickerModel> c259800zU2, LiveState<BaseStickerModel> liveState, C385410F9f c385410F9f, C0FFC c0ffc, PairIntInt pairIntInt) {
        super(1);
        this.$t = pairIntInt;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = liveState;
        this.l3 = c385410F9f;
        this.l4 = c0ffc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S0500000_5(InterfaceC497601wk interfaceC497601wk, InterfaceC497601wk interfaceC497601wk2, C365600EVa c365600EVa, C0EQI c0eqi, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = interfaceC497601wk;
        this.l1 = interfaceC497601wk2;
        this.l2 = c365600EVa;
        this.l3 = c0eqi;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S0500000_5(C817403Hg c817403Hg, C817403Hg c817403Hg2, C0L7R c0l7r, C118300cf c118300cf, Intent intent, C443120HZe<Boolean, ? extends NLETemplateModel, Long> c443120HZe) {
        super(1);
        this.$t = c443120HZe;
        this.l0 = c817403Hg;
        this.l1 = c817403Hg2;
        this.l2 = c0l7r;
        this.l3 = c118300cf;
        this.l4 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S0500000_5(NLEModel nLEModel, NLEModel nLEModel2, NLEModel nLEModel3, C349460Dmy c349460Dmy, ArrayList<NLETrackSlot> arrayList, Map<String, ? extends ArrayList<NLETrackSlot>> map) {
        super(1);
        this.$t = map;
        this.l0 = nLEModel;
        this.l1 = nLEModel2;
        this.l2 = nLEModel3;
        this.l3 = c349460Dmy;
        this.l4 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0500000_5(TuxIconView tuxIconView, C0ETH c0eth, TuxIconView tuxIconView2, ConstraintLayout constraintLayout, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = tuxIconView;
        this.l1 = c0eth;
        this.l2 = tuxIconView2;
        this.l3 = constraintLayout;
        this.l4 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0500000_5(TextStickerData textStickerData, TextStickerModel textStickerModel, VideoPublishEditModel videoPublishEditModel, C118300cf c118300cf, C122Q c122q, int i) {
        super(1);
        this.$t = i;
        this.l0 = textStickerData;
        this.l1 = textStickerModel;
        this.l2 = videoPublishEditModel;
        this.l3 = c118300cf;
        this.l4 = c122q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S0500000_5(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, C0E48 c0e48, C376610Epf c376610Epf, Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l0 = videoPublishEditModel;
        this.l1 = videoPublishEditModel2;
        this.l2 = c0e48;
        this.l3 = c376610Epf;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0500000_5(Boolean bool, C385710FAj c385710FAj, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        super(1);
        this.$t = i;
        this.l0 = bool;
        this.l1 = c385710FAj;
        this.l2 = bool2;
        this.l3 = bool3;
        this.l4 = bool4;
    }
}
