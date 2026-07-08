package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0E1C;
import X.C0E2D;
import X.C0E48;
import X.C0E54;
import X.C0E55;
import X.C0E5G;
import X.C0E5S;
import X.C0EBP;
import X.C0EC7;
import X.C0EDF;
import X.C0EIG;
import X.C0F8M;
import X.C0F8O;
import X.C0F8Y;
import X.C0F8Z;
import X.C0F9I;
import X.C0FAS;
import X.C0FO3;
import X.C0FO6;
import X.C0FOA;
import X.C118300cf;
import X.C1391600mJi;
import X.C13LP;
import X.C1421590n65;
import X.C1664680tQA;
import X.C1664750tQH;
import X.C1697810uHb;
import X.C201955140j;
import X.C2188811AlT;
import X.C347080Dj8;
import X.C355320DwQ;
import X.C357320Dze;
import X.C357350Dzh;
import X.C358780E4u;
import X.C363750ENx;
import X.C450720Hlu;
import X.EnumC1235690iGF;
import X.EnumC357850E1f;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC355360DwU;
import X.InterfaceC356810Dyp;
import X.InterfaceC368720Ecw;
import android.graphics.Color;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETextTemplateClipSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Content;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Fill;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NewTextTemplateRichText;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Solid;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Stroke;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Style;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS132S0201000_5 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS132S0201000_5 awS132S0201000_5) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0EDF c0edf = ((C0EBP) awS132S0201000_5.l0).LLJLL;
        RecyclerView.LayoutManager layoutManager2 = null;
        if (c0edf != null && (recyclerView2 = c0edf.getRecyclerView()) != null) {
            layoutManager = recyclerView2.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = 0;
        }
        C0EDF c0edf2 = ((C0EBP) awS132S0201000_5.l0).LLJLL;
        if (c0edf2 != null && (recyclerView = c0edf2.getRecyclerView()) != null) {
            layoutManager2 = recyclerView.getLayoutManager();
        }
        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
            iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        int i = awS132S0201000_5.i2;
        if (iFindFirstVisibleItemPosition <= i && i <= iFindLastVisibleItemPosition) {
            C0EBP c0ebp = (C0EBP) awS132S0201000_5.l0;
            c0ebp.LLLLJI((ResourceItem) awS132S0201000_5.l1, c0ebp.LLJJJJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS132S0201000_5 awS132S0201000_5) {
        C013C c013c = (C013C) awS132S0201000_5.l0;
        if (!c013c.element) {
            c013c.element = true;
            ((INLEListenerSeek) awS132S0201000_5.l1).onSeekDone(awS132S0201000_5.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS132S0201000_5 awS132S0201000_5) {
        long endTime;
        C0E48 c0e48LIZLLL;
        NLETrackSlot nLETrackSlot;
        C358780E4u c358780E4uXJ2;
        C0E55 player;
        if (awS132S0201000_5.i2 == 0) {
            endTime = ((NLETrackSlot) awS132S0201000_5.l0).getStartTime() + ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            endTime = ((NLETrackSlot) awS132S0201000_5.l0).getEndTime() - ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C0E2D c0e2d = (C0E2D) awS132S0201000_5.l1;
        C1664750tQH c1664750tQH = c0e2d.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0E2D.LLJIJIL;
        ((C0E5S) c1664750tQH.getValue(c0e2d, interfaceC2217461BqaArr[1])).zv(new PlayPositionState(endTime, false, false), false);
        C0E48 c0e48LIZLLL2 = ((C0E2D) awS132S0201000_5.l1).LIZLLL();
        if (c0e48LIZLLL2 != null && (player = c0e48LIZLLL2.getPlayer()) != null) {
            player.LIZIZ(endTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C0E2D c0e2d2 = (C0E2D) awS132S0201000_5.l1;
        C0EC7 c0ec7 = (C0EC7) c0e2d2.LLILZIL.getValue(c0e2d2, interfaceC2217461BqaArr[2]);
        if (c0ec7 != null && (c358780E4uXJ2 = c0ec7.xJ2()) != null) {
            C0E54.LJIIIIZZ(c358780E4uXJ2, Long.valueOf(endTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), null, 6);
        }
        if ((((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_BLACK_SLOT_OPERATE, Boolean.FALSE)).booleanValue() || (nLETrackSlot = (NLETrackSlot) awS132S0201000_5.l0) == null || !Boolean.parseBoolean(nLETrackSlot.getExtra("is_black_frame"))) && (c0e48LIZLLL = ((C0E2D) awS132S0201000_5.l1).LIZLLL()) != null) {
            c0e48LIZLLL.S7().LIZIZ(Unit.LIZ, "check_effect_func_event", false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS132S0201000_5 awS132S0201000_5) {
        InterfaceC356810Dyp interfaceC356810Dyp;
        if (Intrinsics.LJFF(((C357320Dze) awS132S0201000_5.l0).LIZLLL, ((C357350Dzh) awS132S0201000_5.l1).LIZ) && (interfaceC356810Dyp = ((C357320Dze) awS132S0201000_5.l0).LIZJ) != null) {
            interfaceC356810Dyp.onProgress(awS132S0201000_5.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS132S0201000_5 awS132S0201000_5) {
        C450720Hlu c450720Hlu = new C450720Hlu(((C0EIG) awS132S0201000_5.l0).LL);
        c450720Hlu.LJII(R.attr.ot);
        View view = ((InterfaceC368720Ecw) awS132S0201000_5.l1).getView();
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        c450720Hlu.LJIIJ(2131826855);
        int i = awS132S0201000_5.i2;
        C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
        c1391600mJi2.LJ = i;
        c1391600mJi2.LJI = i;
        c450720Hlu.LIZIZ().show();
        C363750ENx.LJ("multi_music_strip_guide_has_shown_in_root");
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS132S0201000_5 awS132S0201000_5) {
        C118300cf c118300cf = (C118300cf) awS132S0201000_5.l0;
        int i = c118300cf.element + 1;
        c118300cf.element = i;
        int i2 = i * awS132S0201000_5.i2;
        if (i2 >= 45) {
            InterfaceC355360DwU interfaceC355360DwU = ((C355320DwQ) awS132S0201000_5.l1).LJ;
            if (interfaceC355360DwU != null) {
                interfaceC355360DwU.onProgress(90);
            }
            ((C355320DwQ) awS132S0201000_5.l1).LLJJIJIIJIL();
        } else {
            int i3 = i2 + 45;
            InterfaceC355360DwU interfaceC355360DwU2 = ((C355320DwQ) awS132S0201000_5.l1).LJ;
            if (interfaceC355360DwU2 != null) {
                interfaceC355360DwU2.onProgress(i3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS132S0201000_5 awS132S0201000_5) {
        boolean z;
        C0FO6 c0fo6 = (C0FO6) awS132S0201000_5.l0;
        C0FO3 c0fo3 = (C0FO3) awS132S0201000_5.l1;
        int i = awS132S0201000_5.i2;
        InterfaceC1631620sYq<C0FO3, Integer, Boolean, Unit> interfaceC1631620sYq = c0fo6.LLILLJJLI;
        Integer numValueOf = Integer.valueOf(i);
        if (c0fo3.LIZIZ.LIZ != C0FOA.SELECTED) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1631620sYq.invoke(c0fo3, numValueOf, Boolean.valueOf(z));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS132S0201000_5 awS132S0201000_5) {
        C013C c013c = (C013C) awS132S0201000_5.l0;
        if (!c013c.element) {
            c013c.element = true;
            ((INLEListenerSeek) awS132S0201000_5.l1).onSeekDone(awS132S0201000_5.i2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS132S0201000_5 awS132S0201000_5) {
        NLESegment mainSegment;
        NLEStyText nLEStyText;
        VecNLETextTemplateClipSPtr textClips;
        NLETextTemplateClip nLETextTemplateClip;
        VecNLETextTemplateClipSPtr textClips2;
        NLETextTemplateClip nLETextTemplateClip2;
        int selectSlotIndex;
        NLESegmentTextSticker nLESegmentTextStickerLIZ;
        SubTemplateStyle subTemplateStyle;
        if (!((C0F8Z) awS132S0201000_5.l0).LJIL.get()) {
            if (C0F8Y.LJIIL((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ)) {
                if (((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ).getTextTemplateModel().isGroupTextTemplates) {
                    selectSlotIndex = ((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ).getCompatModel().getSelectSlotIndex();
                } else {
                    selectSlotIndex = 0;
                }
                if (!C0FAS.LIZJ(((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ).getTextTemplateModel(), selectSlotIndex)) {
                    C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aligh changed: ");
                    sbLIZ.append(awS132S0201000_5.i2);
                    sbLIZ.append(" currentSelectId: ");
                    sbLIZ.append(selectSlotIndex);
                    C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
                    NLETrackSlot nLETrackSlotLJIILLIIL = ((C0F8Z) awS132S0201000_5.l0).LJIILLIIL();
                    if (nLETrackSlotLJIILLIIL != null && (nLESegmentTextStickerLIZ = C347080Dj8.LIZ(selectSlotIndex, nLETrackSlotLJIILLIIL)) != null) {
                        C1664680tQA c1664680tQA = (C1664680tQA) awS132S0201000_5.l1;
                        int i = awS132S0201000_5.i2;
                        C0F8O c0f8o = C0F8M.LJJIJ;
                        String richContent = nLESegmentTextStickerLIZ.getRichContent();
                        c0f8o.getClass();
                        C0F8M c0f8mLIZ = C0F8O.LIZ(richContent);
                        c0f8mLIZ.LJ(0);
                        c0f8mLIZ.LIZLLL(Integer.valueOf(i - 1));
                        nLESegmentTextStickerLIZ.setRichContent(c0f8mLIZ.LJFF());
                        SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(selectSlotIndex, ((TextStickerModel) c1664680tQA.LIZ).getCompatModel().getSubTemplates());
                        if (subTemplateInfo != null && (subTemplateStyle = subTemplateInfo.style) != null) {
                            subTemplateStyle.align = i;
                        }
                    }
                }
            } else {
                NLETrackSlot nLETrackSlotLJIILLIIL2 = ((C0F8Z) awS132S0201000_5.l0).LJIILLIIL();
                if (nLETrackSlotLJIILLIIL2 != null && (mainSegment = nLETrackSlotLJIILLIIL2.getMainSegment()) != null) {
                    C1664680tQA c1664680tQA2 = (C1664680tQA) awS132S0201000_5.l1;
                    int i2 = awS132S0201000_5.i2;
                    if (!((TextStickerModel) c1664680tQA2.LIZ).getTextTemplateModel().useDefaultAlign) {
                        NLESegmentTextTemplate nLESegmentTextTemplateDynamicCast = NLESegmentTextTemplate.dynamicCast(mainSegment);
                        if (nLESegmentTextTemplateDynamicCast == null || (textClips2 = nLESegmentTextTemplateDynamicCast.getTextClips()) == null || (nLETextTemplateClip2 = (NLETextTemplateClip) C13LP.LJJJLL(textClips2)) == null || (nLEStyText = nLETextTemplateClip2.getContentStyle()) == null) {
                            nLEStyText = new NLEStyText();
                        }
                        nLEStyText.setAlignType(i2 - 1);
                        nLEStyText.setTypeSettingKind(0);
                        if (nLESegmentTextTemplateDynamicCast != null && (textClips = nLESegmentTextTemplateDynamicCast.getTextClips()) != null && (nLETextTemplateClip = (NLETextTemplateClip) C13LP.LJJJLL(textClips)) != null) {
                            nLETextTemplateClip.setContentStyle(nLEStyText);
                        }
                    }
                }
            }
            ((C0F8Z) awS132S0201000_5.l0).LJIIJJI.commit();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS132S0201000_5 awS132S0201000_5) {
        C0F8Z c0f8z = (C0F8Z) awS132S0201000_5.l0;
        AwS132S0201000_5 awS132S0201000_52 = new AwS132S0201000_5(c0f8z, (C0F8Z) awS132S0201000_5.l1, (C1664680tQA<TextStickerModel>) awS132S0201000_5.i2, 4);
        c0f8z.getClass();
        awS132S0201000_52.invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS132S0201000_5 awS132S0201000_5) {
        NLESegment mainSegment;
        NLEStyText nLEStyText;
        VecNLETextTemplateClipSPtr textClips;
        NLETextTemplateClip nLETextTemplateClip;
        VecNLETextTemplateClipSPtr textClips2;
        NLETextTemplateClip nLETextTemplateClip2;
        int selectSlotIndex;
        NLESegmentTextSticker nLESegmentTextStickerLIZ;
        SubTemplateStyle subTemplateStyle;
        List<Style> list;
        Style style;
        Stroke stroke;
        Solid solid;
        Solid solid2;
        Content content;
        Solid solid3;
        if (!((C0F8Z) awS132S0201000_5.l0).LJIL.get()) {
            if (C0F8Y.LJIIL((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ)) {
                if (((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ).getTextTemplateModel().isGroupTextTemplates) {
                    selectSlotIndex = ((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ).getCompatModel().getSelectSlotIndex();
                } else {
                    selectSlotIndex = 0;
                }
                if (!C0FAS.LIZLLL(((TextStickerModel) ((C1664680tQA) awS132S0201000_5.l1).LIZ).getTextTemplateModel(), selectSlotIndex)) {
                    C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("color changed: ");
                    sbLIZ.append(awS132S0201000_5.i2);
                    sbLIZ.append(" currentSelectId: ");
                    sbLIZ.append(selectSlotIndex);
                    C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
                    NLETrackSlot nLETrackSlotLJIILLIIL = ((C0F8Z) awS132S0201000_5.l0).LJIILLIIL();
                    if (nLETrackSlotLJIILLIIL != null && (nLESegmentTextStickerLIZ = C347080Dj8.LIZ(selectSlotIndex, nLETrackSlotLJIILLIIL)) != null) {
                        C1664680tQA c1664680tQA = (C1664680tQA) awS132S0201000_5.l1;
                        int i = awS132S0201000_5.i2;
                        C0F8O c0f8o = C0F8M.LJJIJ;
                        String richContent = nLESegmentTextStickerLIZ.getRichContent();
                        c0f8o.getClass();
                        C0F8M c0f8mLIZ = C0F8O.LIZ(richContent);
                        NewTextTemplateRichText newTextTemplateRichText = c0f8mLIZ.LJJIIZI;
                        if (newTextTemplateRichText != null && (list = newTextTemplateRichText.styles) != null && (style = (Style) C13LP.LJJJLL(list)) != null) {
                            Pair pairLIZLLL = C0F9I.LIZLLL(i, 4);
                            int iIntValue = ((Number) pairLIZLLL.getFirst()).intValue();
                            Fill fill = style.fill;
                            if (fill != null && (content = fill.content) != null && (solid3 = content.solid) != null) {
                                solid3.color = C1697810uHb.LJIIJJI(Float.valueOf(Color.red(iIntValue) / 255.0f), Float.valueOf(Color.green(iIntValue) / 255.0f), Float.valueOf(Color.blue(iIntValue) / 255.0f));
                            }
                            int iIntValue2 = ((Number) pairLIZLLL.getSecond()).intValue();
                            List<Stroke> list2 = style.strokes;
                            if (list2 != null && (stroke = (Stroke) C13LP.LJJJLL(list2)) != null) {
                                Content content2 = stroke.content;
                                if (content2 != null && (solid2 = content2.solid) != null) {
                                    solid2.color = C1697810uHb.LJIIJJI(Float.valueOf(Color.red(iIntValue2) / 255.0f), Float.valueOf(Color.green(iIntValue2) / 255.0f), Float.valueOf(Color.blue(iIntValue2) / 255.0f));
                                }
                                Content content3 = stroke.content;
                                if (content3 != null && (solid = content3.solid) != null) {
                                    solid.alpha = Float.valueOf(Color.alpha(iIntValue2) / 255.0f);
                                }
                            }
                        }
                        nLESegmentTextStickerLIZ.setRichContent(c0f8mLIZ.LJFF());
                        SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(selectSlotIndex, ((TextStickerModel) c1664680tQA.LIZ).getCompatModel().getSubTemplates());
                        if (subTemplateInfo != null && (subTemplateStyle = subTemplateInfo.style) != null) {
                            subTemplateStyle.color = i;
                        }
                    }
                }
            } else {
                NLETrackSlot nLETrackSlotLJIILLIIL2 = ((C0F8Z) awS132S0201000_5.l0).LJIILLIIL();
                if (nLETrackSlotLJIILLIIL2 != null && (mainSegment = nLETrackSlotLJIILLIIL2.getMainSegment()) != null) {
                    C1664680tQA c1664680tQA2 = (C1664680tQA) awS132S0201000_5.l1;
                    int i2 = awS132S0201000_5.i2;
                    if (!((TextStickerModel) c1664680tQA2.LIZ).getTextTemplateModel().useDefaultColor) {
                        NLESegmentTextTemplate nLESegmentTextTemplateDynamicCast = NLESegmentTextTemplate.dynamicCast(mainSegment);
                        if (nLESegmentTextTemplateDynamicCast == null || (textClips2 = nLESegmentTextTemplateDynamicCast.getTextClips()) == null || (nLETextTemplateClip2 = (NLETextTemplateClip) C13LP.LJJJLL(textClips2)) == null || (nLEStyText = nLETextTemplateClip2.getContentStyle()) == null) {
                            nLEStyText = new NLEStyText();
                        }
                        Pair pairLIZLLL2 = C0F9I.LIZLLL(i2, 4);
                        nLEStyText.setTextColor(((Number) pairLIZLLL2.getFirst()).intValue());
                        nLEStyText.setOutlineColor(((Number) pairLIZLLL2.getSecond()).intValue());
                        nLEStyText.setTypeSettingKind(0);
                        if (nLESegmentTextTemplateDynamicCast != null && (textClips = nLESegmentTextTemplateDynamicCast.getTextClips()) != null && (nLETextTemplateClip = (NLETextTemplateClip) C13LP.LJJJLL(textClips)) != null) {
                            nLETextTemplateClip.setContentStyle(nLEStyText);
                        }
                    }
                }
            }
            ((C0F8Z) awS132S0201000_5.l0).LJIIJJI.commit();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS132S0201000_5 awS132S0201000_5) {
        C0F8Z c0f8z = (C0F8Z) awS132S0201000_5.l0;
        AwS132S0201000_5 awS132S0201000_52 = new AwS132S0201000_5(c0f8z, (C0F8Z) awS132S0201000_5.l1, (C1664680tQA<TextStickerModel>) awS132S0201000_5.i2, 6);
        c0f8z.getClass();
        awS132S0201000_52.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS132S0201000_5 awS132S0201000_5) {
        C013C c013c = (C013C) awS132S0201000_5.l0;
        if (!c013c.element) {
            c013c.element = true;
            ((INLEListenerSeek) awS132S0201000_5.l1).onSeekDone(awS132S0201000_5.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS132S0201000_5 awS132S0201000_5) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0EDF c0edfInvoke = ((C0E1C) awS132S0201000_5.l0).LIZ.invoke();
        RecyclerView.LayoutManager layoutManager2 = null;
        if (c0edfInvoke != null && (recyclerView2 = c0edfInvoke.getRecyclerView()) != null) {
            layoutManager = recyclerView2.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = 0;
        }
        C0EDF c0edfInvoke2 = ((C0E1C) awS132S0201000_5.l0).LIZ.invoke();
        if (c0edfInvoke2 != null && (recyclerView = c0edfInvoke2.getRecyclerView()) != null) {
            layoutManager2 = recyclerView.getLayoutManager();
        }
        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
            iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        int i = awS132S0201000_5.i2;
        if (iFindFirstVisibleItemPosition <= i && i <= iFindLastVisibleItemPosition) {
            ((C0E1C) awS132S0201000_5.l0).LIZLLL((ResourceItem) awS132S0201000_5.l1, i);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(int i, NLETrackSlot nLETrackSlot, C0E2D c0e2d, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = nLETrackSlot;
        this.l1 = c0e2d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(C118300cf c118300cf, int i, C355320DwQ c355320DwQ, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c118300cf;
        this.i2 = i;
        this.l1 = c355320DwQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(C013C c013c, INLEListenerSeek iNLEListenerSeek, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c013c;
        this.l1 = iNLEListenerSeek;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(C357320Dze c357320Dze, C357350Dzh c357350Dzh, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c357320Dze;
        this.l1 = c357350Dzh;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(C0E1C c0e1c, int i, ResourceItem resourceItem, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0e1c;
        this.i2 = i;
        this.l1 = resourceItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(C0EBP c0ebp, int i, ResourceItem resourceItem, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0ebp;
        this.i2 = i;
        this.l1 = resourceItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(C0EIG c0eig, InterfaceC368720Ecw interfaceC368720Ecw, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0eig;
        this.l1 = interfaceC368720Ecw;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS132S0201000_5(C0F8Z c0f8z, C0F8Z c0f8z2, C1664680tQA<TextStickerModel> c1664680tQA, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0f8z;
        this.l1 = c0f8z2;
        this.i2 = c1664680tQA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0201000_5(C0FO6 c0fo6, C0FO3 c0fo3, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0fo6;
        this.l1 = c0fo3;
        this.i2 = i;
    }
}
