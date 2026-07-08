package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.AbstractC2217051Bpv;
import X.C013C;
import X.C01GW;
import X.C01TT;
import X.C051R;
import X.C09AY;
import X.C0E1V;
import X.C0E1X;
import X.C0E48;
import X.C0E6L;
import X.C0E6P;
import X.C0EBN;
import X.C0EBZ;
import X.C0EGV;
import X.C0EGW;
import X.C0EJZ;
import X.C0F59;
import X.C0F5F;
import X.C0FC9;
import X.C0FS2;
import X.C0FS5;
import X.C0LAB;
import X.C0P0T;
import X.C0XF1;
import X.C1390380mHk;
import X.C13LP;
import X.C1602160rnK;
import X.C1619980sG4;
import X.C1664600tQ2;
import X.C1954807lC;
import X.C19614411oc;
import X.C19A3;
import X.C1DRG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C350410DoV;
import X.C351510DqH;
import X.C353560Dta;
import X.C354660DvM;
import X.C357590E0f;
import X.C360510EBl;
import X.C360680ECc;
import X.C360690ECd;
import X.C360920EDa;
import X.C361680EFy;
import X.C361850EGp;
import X.C362710EJx;
import X.C363110ELl;
import X.C368910EdF;
import X.C370190EfJ;
import X.C371210Egx;
import X.C372480Ej0;
import X.C376330EpD;
import X.C376630Eph;
import X.C380780EwO;
import X.C380820EwS;
import X.C388490FLb;
import X.C388620FLo;
import X.C388960FMw;
import X.C390250FRv;
import X.C418440Gaw;
import X.C560970LzL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1641380soa;
import X.EnumC362260EIe;
import X.InterfaceC358190E2n;
import X.InterfaceC362230EIb;
import X.InterfaceC370200EfK;
import X.InterfaceC371250Eh1;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AComparatorS24S0000000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.model.InlineCaptionViewModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS441S0200000_5 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C0E6L c0e6l, NLETrackSlot nLETrackSlot, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0e6l;
        this.l1 = nLETrackSlot;
    }

    public static final Object invoke$0(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        List<TextStickerData> listLJLLLL;
        Iterable iterable = (Iterable) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (iterable != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(3), iterable)) != null) {
            ((C0F5F) ((C0F59) awS441S0200000_5.l0).LIZ.LLLZL.getValue()).LIZ(listLJLLLL);
        } else {
            InlineCaptionFragment inlineCaptionFragment = ((C0F59) awS441S0200000_5.l0).LIZ;
            inlineCaptionFragment.getClass();
            inlineCaptionFragment.FT();
        }
        AbstractC2217051Bpv abstractC2217051Bpv = ((InlineCaptionViewModel) awS441S0200000_5.l1).LLIZ;
        if (abstractC2217051Bpv != null) {
            abstractC2217051Bpv.LJIIJ = ((C0F59) awS441S0200000_5.l0).LIZ;
        }
        if (zBooleanValue) {
            ((C0F59) awS441S0200000_5.l0).LIZ.LLLLIL = true;
        }
        ((C0F59) awS441S0200000_5.l0).LIZ.YT(true, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        if (r6 == null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS441S0200000_5 r17, java.lang.Object r18, java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS441S0200000_5.invoke$1(kotlin.jvm.internal.AwS441S0200000_5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS441S0200000_5 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS441S0200000_5.invoke$10(kotlin.jvm.internal.AwS441S0200000_5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        Function1 function1 = (Function1) obj2;
        if (obj != null) {
            ((Function2) awS441S0200000_5.l0).invoke(obj, new AwS371S0200000_5((NLETrackSlot) awS441S0200000_5.l1, function1, 291));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        C1DRG c1drg;
        InterfaceC362230EIb interfaceC362230EIb;
        NLEEditor nLEEditorLJI;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            if (zBooleanValue) {
                C353560Dta c353560Dta = C353560Dta.LIZ;
                C0E48 c0e48LJIIJ = ((C0E6P) awS441S0200000_5.l0).LJIIJ();
                c353560Dta.getClass();
                C353560Dta.LJIIJJI(c0e48LJIIJ);
                C351510DqH c351510DqH = C351510DqH.LIZ;
                NLETrackSlot nLETrackSlot = (NLETrackSlot) awS441S0200000_5.l1;
                c351510DqH.getClass();
                C0E1X c0e1x = new C0E1X(C0E1V.REMOVE_MAGIC.getNameId(), null, null, C351510DqH.LJJII(nLETrackSlot), null, 22);
                C0E48 c0e48LJIIJ2 = ((C0E6P) awS441S0200000_5.l0).LJIIJ();
                if (c0e48LJIIJ2 != null && (nLEEditorLJI = c0e48LJIIJ2.LLFII().LJI()) != null) {
                    C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
                }
            }
            C0E6P c0e6p = (C0E6P) awS441S0200000_5.l0;
            C19A3 c19a3 = c0e6p.LL;
            if (c19a3 != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null && (interfaceC362230EIb = (InterfaceC362230EIb) c1drg.LJIIL(null, InterfaceC362230EIb.class)) != null) {
                interfaceC362230EIb.HI0();
                if (interfaceC362230EIb.pg0() == EnumC362260EIe.MAX) {
                    interfaceC362230EIb.T81(EnumC362260EIe.MIN, new AwS406S0200000_5(c0e6p, c1drg, 147));
                } else {
                    c0e6p.LJJIIZ(c1drg);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        C1DRG c1drg;
        InterfaceC362230EIb interfaceC362230EIb;
        NLEEditor nLEEditorLJI;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            if (zBooleanValue) {
                C353560Dta c353560Dta = C353560Dta.LIZ;
                C0E48 c0e48LJIIJ = ((C0E6L) awS441S0200000_5.l0).LJIIJ();
                c353560Dta.getClass();
                C353560Dta.LJIIJJI(c0e48LJIIJ);
                C351510DqH c351510DqH = C351510DqH.LIZ;
                NLETrackSlot nLETrackSlot = (NLETrackSlot) awS441S0200000_5.l1;
                c351510DqH.getClass();
                C0E1X c0e1x = new C0E1X(C0E1V.REMOVE_MAGIC.getNameId(), null, null, C351510DqH.LJJII(nLETrackSlot), null, 22);
                C0E48 c0e48LJIIJ2 = ((C0E6L) awS441S0200000_5.l0).LJIIJ();
                if (c0e48LJIIJ2 != null && (nLEEditorLJI = c0e48LJIIJ2.LLFII().LJI()) != null) {
                    C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
                }
            }
            C0E6L c0e6l = (C0E6L) awS441S0200000_5.l0;
            C19A3 c19a3 = c0e6l.LL;
            if (c19a3 != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null && (interfaceC362230EIb = (InterfaceC362230EIb) c1drg.LJIIL(null, InterfaceC362230EIb.class)) != null) {
                interfaceC362230EIb.HI0();
                if (interfaceC362230EIb.pg0() == EnumC362260EIe.MAX) {
                    interfaceC362230EIb.T81(EnumC362260EIe.MIN, new AwS406S0200000_5(c0e6l, c1drg, 148));
                } else {
                    c0e6l.LJJI(c1drg);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (obj2 instanceof C0EGW) {
            ((Function0) awS441S0200000_5.l0).invoke();
        } else if (obj2 instanceof C0EGV) {
            if (!zBooleanValue) {
                ((C361850EGp) awS441S0200000_5.l1).LJIJ();
            } else {
                C361850EGp c361850EGp = (C361850EGp) awS441S0200000_5.l1;
                c361850EGp.getClass();
                c361850EGp.LJIIZILJ(true, null, null, false);
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        View view = (View) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int paddingTop = view.getPaddingTop();
        if (zBooleanValue) {
            int[] iArr = new int[2];
            ((View) awS441S0200000_5.l0).getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            float width = i + ((((View) awS441S0200000_5.l0).getWidth() - measuredWidth) / 2.0f);
            float fLIZIZ = (i2 - measuredHeight) - C418440Gaw.LIZIZ(6);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            float f = iArr2[0];
            float fLIZIZ2 = iArr2[1] + C418440Gaw.LIZIZ(4);
            ((C0P0T) awS441S0200000_5.l1).LJIILL().LJIIJ = 350L;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(150L), ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.0f).setDuration(350L), ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.0f).setDuration(350L), ObjectAnimator.ofFloat(view, "x", f, width).setDuration(350L), ObjectAnimator.ofFloat(view, "y", fLIZIZ2, fLIZIZ).setDuration(350L));
            animatorSet.start();
            return new AnimatorSet();
        }
        ((View) awS441S0200000_5.l0).getLocationOnScreen(new int[2]);
        view.measure(0, 0);
        float measuredHeight2 = view.getMeasuredHeight();
        float height = (((r1[1] + (((View) awS441S0200000_5.l0).getHeight() / 2.0f)) - (measuredHeight2 / 2.0f)) - (paddingTop * 0.4f)) - (measuredHeight2 * 0.4f);
        float y = view.getY();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.4f).setDuration(350L), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.4f).setDuration(350L), ObjectAnimator.ofFloat(view, "y", y, height).setDuration(350L), ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(350L));
        animatorSet2.start();
        return new AnimatorSet();
    }

    public static final Object invoke$2(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        if (Intrinsics.LJFF(obj2, a0.LJLIIIL(((TextView) awS441S0200000_5.l0).getText().toString()).toString())) {
            C388960FMw c388960FMw = (C388960FMw) awS441S0200000_5.l1;
            if (c388960FMw.LIZIZ.getVisibility() != 0) {
                C388490FLb.LIZ(c388960FMw.LIZIZ);
                C388620FLo c388620FLo = c388960FMw.LIZIZ;
                int visibility = c388620FLo.getVisibility();
                c388620FLo.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c388620FLo);
                C388620FLo c388620FLo2 = c388960FMw.LIZIZ;
                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c388620FLo2);
                c388620FLo2.setTranslationY(fLIZIZ);
                C388620FLo c388620FLo3 = c388960FMw.LIZIZ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c388620FLo3);
                c388620FLo3.setAlpha(0.0f);
                c388960FMw.LIZIZ.animate().alpha(1.0f).translationY(0.0f).setDuration(200L).setInterpolator(C1619980sG4.LJIILIIL()).start();
            }
            ((ArrayList) ((C388960FMw) awS441S0200000_5.l1).LJI).clear();
            ((ArrayList) ((C388960FMw) awS441S0200000_5.l1).LJI).addAll(collection);
            AbstractC21673619ry adapter = ((C388960FMw) awS441S0200000_5.l1).LIZIZ.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            ((C388960FMw) awS441S0200000_5.l1).LIZIZ.scrollToPosition(0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        if (((Number) obj).intValue() == 67) {
            C0FS2 c0fs2 = (C0FS2) awS441S0200000_5.l0;
            C390250FRv c390250FRv = c0fs2.LIZJ;
            if (c390250FRv.LJII) {
                c390250FRv.LJII = false;
                c0fs2.LJIIIIZZ.LIZLLL(AFwS234S0000000_5.get$arr$(424), true);
                ((C0FS2) awS441S0200000_5.l0).LIZJ.LJIIJ = C0FS5.MANUAL;
            }
        }
        ((C0FS2) awS441S0200000_5.l0).LIZJ.LJII = false;
        ((C19614411oc) awS441S0200000_5.l1).getContentEditText().LLIZ.clear();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        Pair<BeatInfo, Integer> pair = (Pair) obj2;
        C371210Egx c371210Egx = (C371210Egx) awS441S0200000_5.l0;
        c371210Egx.LLJILJILJ = pair;
        InterfaceC371250Eh1 interfaceC371250Eh1 = c371210Egx.LLJILLL;
        if (interfaceC371250Eh1 != null) {
            interfaceC371250Eh1.LIZJ(pair);
        }
        ((Function1) awS441S0200000_5.l1).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        VideoPublishEditModel videoPublishEditModelLLLLLJIL;
        C0E48 c0e48LIZIZ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            ((C0EBN) awS441S0200000_5.l0).LLLLLLIL().LIZ();
            if (((C360690ECd) awS441S0200000_5.l1).getCategoryList().size() == 1) {
                C0EJZ c0ejz = ((C360690ECd) awS441S0200000_5.l1).LLILZLL;
                if (c0ejz != null) {
                    C786410Ut5.L1(c0ejz, 8);
                }
            } else {
                C0EJZ c0ejz2 = ((C360690ECd) awS441S0200000_5.l1).LLILZLL;
                if (c0ejz2 != null) {
                    C786410Ut5.L1(c0ejz2, 0);
                }
            }
            InterfaceC358190E2n interfaceC358190E2n = (InterfaceC358190E2n) ((C0EBN) awS441S0200000_5.l0).LLLFFI.getValue();
            if (interfaceC358190E2n != null) {
                interfaceC358190E2n.Qc0(((C360690ECd) awS441S0200000_5.l1).getCategoryList());
            }
            if (zBooleanValue2) {
                videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
                if (videoPublishEditModelLLLLLJIL != null && (c0e48LIZIZ = ((C0EBN) awS441S0200000_5.l0).LIZIZ()) != null) {
                    C362710EJx.LIZ.getClass();
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_editor_pro", "1"));
                    mapLJIIJ.putAll(C361680EFy.LJFF(-1L, videoPublishEditModelLLLLLJIL, c0e48LIZIZ, new Pair(-1, -1)).LIZ);
                    C20684815ws.LJIILLIIL("filter_loading_fail", mapLJIIJ);
                }
            }
        } else {
            ((C0EBN) awS441S0200000_5.l0).LLLLLLIL().LIZLLL();
            ((View) ((C0EBN) awS441S0200000_5.l0).LLLFF.getValue()).bringToFront();
            if (zBooleanValue2) {
                ((C0EBN) awS441S0200000_5.l0).LLLLLLIL().LJ(((C0EBN) awS441S0200000_5.l0).LLJJJJLIIL);
                videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
                if (videoPublishEditModelLLLLLJIL != null) {
                    C362710EJx.LIZ.getClass();
                    Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("is_editor_pro", "1"));
                    mapLJIIJ2.putAll(C361680EFy.LJFF(-1L, videoPublishEditModelLLLLLJIL, c0e48LIZIZ, new Pair(-1, -1)).LIZ);
                    C20684815ws.LJIILLIIL("filter_loading_fail", mapLJIIJ2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        String str;
        C357590E0f next;
        String string;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (!((C360920EDa) awS441S0200000_5.l0).mViewDestroyed) {
            if (!zBooleanValue) {
                C360920EDa c360920EDa = (C360920EDa) awS441S0200000_5.l0;
                View viewRequireView = c360920EDa.requireView();
                KeyEvent.Callback callbackFindViewById = c360920EDa.LLLFFI;
                if (callbackFindViewById == null) {
                    callbackFindViewById = viewRequireView.findViewById(R.id.yi7);
                    c360920EDa.LLLFFI = (LinearLayout) callbackFindViewById;
                }
                LinearLayout linearLayout = (LinearLayout) callbackFindViewById;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
                LinearLayout linearLayoutLLLLLLZ = ((C360920EDa) awS441S0200000_5.l0).LLLLLLZ();
                if (linearLayoutLLLLLLZ != null) {
                    C786410Ut5.LJZL(0, linearLayoutLLLLLLZ);
                }
                if (zBooleanValue2) {
                    C360920EDa c360920EDa2 = (C360920EDa) awS441S0200000_5.l0;
                    c360920EDa2.getClass();
                    C01GW c01gw = C560970LzL.LIZ;
                    boolean zIsFakeNetwork = ((INetworkStateService) c01gw.getValue()).isFakeNetwork();
                    boolean zIsWeakNetwork = ((INetworkStateService) c01gw.getValue()).isWeakNetwork();
                    boolean zLIZIZ = C0XF1.LIZIZ(c360920EDa2.LLJJJJJIL);
                    if (zIsFakeNetwork) {
                        string = c360920EDa2.LLJJJJJIL.getString(2131850741);
                    } else if (!zIsWeakNetwork && zLIZIZ) {
                        string = c360920EDa2.LLJJJJJIL.getString(2131850737);
                    } else {
                        string = c360920EDa2.LLJJJJJIL.getString(2131850739);
                    }
                    Activity activity = c360920EDa2.LLJJJJJIL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(string);
                    C1390380mHk.LIZ(activity, 6001, creativeToastBuilder);
                    C20684815ws.LJIILLIIL("transition_loading_fail", new C0LAB().LIZ);
                }
            } else {
                C0EBZ c0ebz = (C0EBZ) ((C360920EDa) awS441S0200000_5.l0).LLLIIIIL.getValue();
                if (c0ebz != null) {
                    Iterator<C357590E0f> it2 = ((C360690ECd) awS441S0200000_5.l1).getCategoryList().iterator();
                    while (true) {
                        str = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!C360510EBl.LIZ(next.LIZIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C357590E0f c357590E0f = next;
                    if (c357590E0f != null) {
                        str = c357590E0f.LIZIZ;
                    }
                    c0ebz.Rb2(str);
                }
                C0EBZ c0ebz2 = (C0EBZ) ((C360920EDa) awS441S0200000_5.l0).LLLIIIIL.getValue();
                if (c0ebz2 != null) {
                    c0ebz2.AF0(true);
                }
                ((C360920EDa) awS441S0200000_5.l0).LLLLIL().LJFF(((C360690ECd) awS441S0200000_5.l1).getCategoryList());
                if (zBooleanValue2) {
                    C20684815ws.LJIILLIIL("transition_loading_fail", new C0LAB().LIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        if (((C380820EwS) awS441S0200000_5.l0).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            C380820EwS.t5((C380820EwS) awS441S0200000_5.l0, ((C380780EwO) awS441S0200000_5.l1).LIZLLL, null, EnumC1641380soa.START, Integer.valueOf(iIntValue), null, null, null, false);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        float fMin;
        int scrollX;
        float videoFrameScale;
        float f;
        long lastSeekTimeStamp;
        float fFloatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        float translationX = ((C376330EpD) awS441S0200000_5.l0).getTranslationX() + fFloatValue;
        float videoSelectFrameLeft = ((C370190EfJ) awS441S0200000_5.l1).getVideoSelectFrameLeft();
        float videoSelectFrameRight = ((C370190EfJ) awS441S0200000_5.l1).getVideoSelectFrameRight();
        float fWidth = ((C370190EfJ) awS441S0200000_5.l1).getVideoSelectFrameFromXml().getSelectFrameRect().width();
        if (((C370190EfJ) awS441S0200000_5.l1).LJ()) {
            fMin = -Math.min(-(-Math.max(-translationX, ((C370190EfJ) awS441S0200000_5.l1).LLILZ + videoSelectFrameRight)), videoSelectFrameRight + ((C370190EfJ) awS441S0200000_5.l1).LLILZ + fWidth);
        } else {
            fMin = Math.min(Math.max(translationX, videoSelectFrameLeft + ((C370190EfJ) awS441S0200000_5.l1).LLILZ), videoSelectFrameRight + ((C370190EfJ) awS441S0200000_5.l1).LLILZ);
        }
        C786410Ut5.Xc((C376330EpD) awS441S0200000_5.l0, fMin);
        C368910EdF videoFrameTrack$tools_camera_edit_release = ((C370190EfJ) awS441S0200000_5.l1).getVideoFrameTrack$tools_camera_edit_release();
        if (videoFrameTrack$tools_camera_edit_release != null) {
            scrollX = videoFrameTrack$tools_camera_edit_release.getScrollX();
        } else {
            scrollX = 0;
        }
        float f2 = scrollX;
        C368910EdF videoFrameTrack$tools_camera_edit_release2 = ((C370190EfJ) awS441S0200000_5.l1).getVideoFrameTrack$tools_camera_edit_release();
        if (videoFrameTrack$tools_camera_edit_release2 != null) {
            videoFrameScale = videoFrameTrack$tools_camera_edit_release2.getVideoFrameScale();
        } else {
            videoFrameScale = ((C370190EfJ) awS441S0200000_5.l1).LLILZLL;
        }
        if (((C370190EfJ) awS441S0200000_5.l1).LJ()) {
            f = ((-f2) - fMin) + ((C370190EfJ) awS441S0200000_5.l1).LLILZ;
        } else {
            f = (fMin + f2) - ((C370190EfJ) awS441S0200000_5.l1).LLILZ;
        }
        float f3 = f / videoFrameScale;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((C370190EfJ) awS441S0200000_5.l1).getLastSeekTimeStamp() == 0) {
            lastSeekTimeStamp = 1;
        } else {
            lastSeekTimeStamp = jCurrentTimeMillis - ((C370190EfJ) awS441S0200000_5.l1).getLastSeekTimeStamp();
        }
        ((C370190EfJ) awS441S0200000_5.l1).setLastSeekTimeStamp(jCurrentTimeMillis);
        float f4 = lastSeekTimeStamp;
        float fAbs = Math.abs(fFloatValue) / f4;
        float fAbs2 = Math.abs(((C370190EfJ) awS441S0200000_5.l1).getLastSeekTimeMs() - f3) / f4;
        ((C370190EfJ) awS441S0200000_5.l1).setLastSeekTimeMs((long) f3);
        InterfaceC370200EfK videoCursorTouchListener = ((C370190EfJ) awS441S0200000_5.l1).getVideoCursorTouchListener();
        if (videoCursorTouchListener != null) {
            videoCursorTouchListener.LIZ(fAbs, fAbs2, C814420VxA.LIZJ(f3 * LSPassThroughRecordSizeConfig.DEFAULT));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS441S0200000_5 awS441S0200000_5, Object obj, Object obj2) {
        C372480Ej0 c372480Ej0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        Activity activity = ((C376630Eph) awS441S0200000_5.l0).LLILZIL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131846787);
        creativeToastBuilder.isTuxToast(true);
        creativeToastBuilder.acrossActivities(true);
        C1390380mHk.LIZ(activity, 9016, creativeToastBuilder);
        MutableLiveData<Boolean> mutableLiveDataO3 = ((C376630Eph) awS441S0200000_5.l0).O3();
        if (mutableLiveDataO3 != null) {
            mutableLiveDataO3.setValue(Boolean.TRUE);
        }
        MutableLiveData<Boolean> mutableLiveDataW2 = ((C376630Eph) awS441S0200000_5.l0).w2();
        if (mutableLiveDataW2 != null) {
            mutableLiveDataW2.setValue(Boolean.TRUE);
        }
        C19A3 c19a3 = ((C376630Eph) awS441S0200000_5.l0).LLILLL;
        if ((c19a3 instanceof C372480Ej0) && (c372480Ej0 = (C372480Ej0) c19a3) != null) {
            c372480Ej0.LLLLLJIL(zBooleanValue, zBooleanValue2);
        }
        ((VideoPublishEditModel) awS441S0200000_5.l1).getEditorProModel().setActionsViaEPMoreOptions("");
        C01TT.LIZJ(new AwS549S0100000_5((C376630Eph) awS441S0200000_5.l0, 779));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C0E6P c0e6p, NLETrackSlot nLETrackSlot, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0e6p;
        this.l1 = nLETrackSlot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C0EBN c0ebn, C360690ECd c360690ECd, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0ebn;
        this.l1 = c360690ECd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C360920EDa c360920EDa, C360690ECd c360690ECd, int i) {
        super(2);
        this.$t = i;
        this.l0 = c360920EDa;
        this.l1 = c360690ECd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C371210Egx c371210Egx, AwS584S0100000_5 awS584S0100000_5, int i) {
        super(2);
        this.$t = i;
        this.l0 = c371210Egx;
        this.l1 = awS584S0100000_5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C376330EpD c376330EpD, C370190EfJ c370190EfJ, int i) {
        super(2);
        this.$t = i;
        this.l0 = c376330EpD;
        this.l1 = c370190EfJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C376630Eph c376630Eph, VideoPublishEditModel videoPublishEditModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c376630Eph;
        this.l1 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C380820EwS c380820EwS, C380780EwO c380780EwO, int i) {
        super(2);
        this.$t = i;
        this.l0 = c380820EwS;
        this.l1 = c380780EwO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C0F59 c0f59, InlineCaptionViewModel inlineCaptionViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0f59;
        this.l1 = inlineCaptionViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C0FS2 c0fs2, C19614411oc c19614411oc, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0fs2;
        this.l1 = c19614411oc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(View view, C0P0T c0p0t, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = c0p0t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(TextView textView, C388960FMw c388960FMw, int i) {
        super(2);
        this.$t = i;
        this.l0 = textView;
        this.l1 = c388960FMw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(VideoAnimFragment videoAnimFragment, C360680ECc c360680ECc, int i) {
        super(2);
        this.$t = i;
        this.l0 = c360680ECc;
        this.l1 = videoAnimFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS441S0200000_5(Function2 function2, Function2<? super C363110ELl, ? super Function1<? super NLETrackSlot, Unit>, Unit> function22, NLETrackSlot nLETrackSlot) {
        super(2);
        this.$t = nLETrackSlot;
        this.l0 = function2;
        this.l1 = function22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(AwS549S0100000_5 awS549S0100000_5, C361850EGp c361850EGp, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS549S0100000_5;
        this.l1 = c361850EGp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS441S0200000_5(C354660DvM c354660DvM, C013C c013c, C013C c013c2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c354660DvM;
        this.l1 = c013c2;
    }
}
