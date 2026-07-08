package kotlin.jvm.internal;

import X.AbstractC1452680nuE;
import X.C09AY;
import X.C0CHQ;
import X.C0EDQ;
import X.C0F1E;
import X.C0F26;
import X.C0FGT;
import X.C0FHM;
import X.C0FMO;
import X.C0FMR;
import X.C0XF1;
import X.C123100dR;
import X.C1390380mHk;
import X.C1397620mTQ;
import X.C2243608qg;
import X.C23260099m;
import X.C259800zU;
import X.C348100Dkm;
import X.C348240Dl0;
import X.C352470Drp;
import X.C352510Drt;
import X.C354270Duj;
import X.C357590E0f;
import X.C361850EGp;
import X.C375830EoP;
import X.C377730ErT;
import X.C377830Erd;
import X.C381540Exc;
import X.C381700Exs;
import X.C382890Ezn;
import X.C383380F1k;
import X.C385410F9f;
import X.C385430F9h;
import X.C385490F9n;
import X.C387180FGa;
import X.C387490FHf;
import X.EnumC356010DxX;
import X.EnumC378320EsQ;
import X.EnumC378720Et4;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.bytedance.ies.nle.editor_jni.EpResourceDelegate;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEEditor;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS119S1100000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        C354270Duj.LIZ(0L, new AwS122S1200000_5((C0FMR) awS119S1100000_5.l1, awS119S1100000_5.s0, (C0FMO) obj, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        return Boolean.valueOf(((EpResourceDelegate) ((NLETextStickerServiceImpl) awS119S1100000_5.l1).LIZIZ.getValue()).request(awS119S1100000_5.s0, (EpResourceCallback) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        ((C259800zU) awS119S1100000_5.l1).element = obj;
        C352470Drp c352470Drp = C352470Drp.LIZ;
        String str = awS119S1100000_5.s0;
        c352470Drp.getClass();
        C352510Drt c352510DrtLIZJ = C352470Drp.LIZJ(str);
        if (c352510DrtLIZJ != null) {
            c352510DrtLIZJ.LIZIZ = (VEEditor) ((C259800zU) awS119S1100000_5.l1).element;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        if (C123100dR.LIZ(awS119S1100000_5.s0)) {
            C352470Drp.LIZJ.remove(awS119S1100000_5.s0);
        } else {
            C352470Drp.LIZIZ.remove(obj);
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS119S1100000_5.l1;
        Unit unit = Unit.LIZ;
        C2243608qg.LIZ(unit, interfaceC1364105Vn);
        return unit;
    }

    public static final Object invoke$12(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        if (!C0XF1.LIZLLL(C0CHQ.LIZ)) {
            Activity activityLJIIIZ = ((C361850EGp) awS119S1100000_5.l1).LJIIIZ();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131826911);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activityLJIIIZ, 6001, creativeToastBuilder);
        } else if (!((C361850EGp) awS119S1100000_5.l1).LJIJ()) {
            ((C361850EGp) awS119S1100000_5.l1).LJIJI(awS119S1100000_5.s0, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131833329, new AwS119S1100000_5((C361850EGp) awS119S1100000_5.l1, awS119S1100000_5.s0, 12));
        c1397620mTQ.LJII(2131833328, AFwS234S0000000_5.get$arr$(591));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        boolean z;
        C381540Exc c381540Exc = (C381540Exc) obj;
        if (((C381700Exs) awS119S1100000_5.l1).LIZLLL && Intrinsics.LJFF(c381540Exc.LJIILJJIL, awS119S1100000_5.s0) && !Intrinsics.LJFF(c381540Exc.LJ, "CANCELED")) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        String resourceId;
        C387490FHf c387490FHf = (C387490FHf) obj;
        String str = awS119S1100000_5.s0;
        Effect effect = ((C0FGT) awS119S1100000_5.l1).LIZ;
        if (effect != null) {
            resourceId = effect.getResourceId();
        } else {
            resourceId = null;
        }
        return C387490FHf.LIZ(c387490FHf, null, null, null, null, new C387180FGa(str, resourceId), false, false, null, null, null, null, 0, 4079);
    }

    public static final Object invoke$3(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        return C377830Erd.LIZ((C377830Erd) obj, false, EnumC378720Et4.AI_TRANSITION_RESULT, EnumC378320EsQ.SHOW, new C375830EoP((List) awS119S1100000_5.l1), null, null, null, null, null, null, null, awS119S1100000_5.s0, false, 196579);
    }

    public static final Object invoke$4(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        return C382890Ezn.LIZ((C382890Ezn) obj, false, awS119S1100000_5.s0, (C0F1E) awS119S1100000_5.l1, false, 0, null, 0, false, 0L, null, 0, null, false, false, false, 32761);
    }

    public static final Object invoke$5(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        C377730ErT c377730ErT = (C377730ErT) awS119S1100000_5.l1;
        return C377830Erd.LIZ((C377830Erd) obj, false, null, null, new C375830EoP(c377730ErT.R5(awS119S1100000_5.s0, c377730ErT.d6(c377730ErT.T2().LIZJ))), null, null, null, null, null, null, null, awS119S1100000_5.s0, false, 196591);
    }

    public static final Object invoke$6(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        String str;
        C0EDQ c0edq = (C0EDQ) obj;
        CharSequence charSequence = (CharSequence) ((C259800zU) awS119S1100000_5.l1).element;
        if (charSequence != null && charSequence.length() != 0) {
            C357590E0f category = c0edq.LIZ.getCategory();
            String str2 = null;
            if (category != null && (str = category.LIZIZ) != null && str.length() != 0) {
                C357590E0f category2 = c0edq.LIZ.getCategory();
                if (category2 != null) {
                    str2 = category2.LIZIZ;
                }
                if (!Intrinsics.LJFF(str2, ((C259800zU) awS119S1100000_5.l1).element)) {
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.valueOf(Intrinsics.LJFF(c0edq.LIZ.getResourceId(), awS119S1100000_5.s0));
    }

    public static final Object invoke$7(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        return C383380F1k.LIZ((C383380F1k) obj, awS119S1100000_5.s0, (List) awS119S1100000_5.l1, false, new C375830EoP(Unit.LIZ), 4);
    }

    public static final Object invoke$8(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        C0FHM c0fhm;
        C0FHM c0fhm2;
        C0FHM c0fhm3;
        C385430F9h c385430F9h = (C385430F9h) obj;
        List<C385490F9n> listU7 = ((C385410F9f) awS119S1100000_5.l1).u7(awS119S1100000_5.s0, true);
        if (Intrinsics.LJFF(awS119S1100000_5.s0, "text_font")) {
            c0fhm = C0FHM.VISIBLE;
        } else {
            c0fhm = C0FHM.GONE;
        }
        if (Intrinsics.LJFF(awS119S1100000_5.s0, "text_style")) {
            c0fhm2 = C0FHM.VISIBLE;
        } else {
            c0fhm2 = C0FHM.GONE;
        }
        if (Intrinsics.LJFF(awS119S1100000_5.s0, "text_motion")) {
            c0fhm3 = C0FHM.VISIBLE;
        } else {
            c0fhm3 = C0FHM.GONE;
        }
        return C385430F9h.LIZ(c385430F9h, null, null, listU7, c0fhm, C0FHM.GONE, c0fhm2, c0fhm3, null, null, null, null, 0L, 3971);
    }

    public static final Object invoke$9(AwS119S1100000_5 awS119S1100000_5, Object obj) {
        C348240Dl0 c348240Dl0LIZIZ;
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        if (!TextUtils.isEmpty(((AbstractC1452680nuE) awS119S1100000_5.l1).LJJIII) && (c348240Dl0LIZIZ = c348100Dkm.LJ().LIZIZ()) != null) {
            c348240Dl0LIZIZ.LIZ(((AbstractC1452680nuE) awS119S1100000_5.l1).LJJIII);
        }
        C348240Dl0 c348240Dl0 = new C348240Dl0(EnumC356010DxX.COLOR);
        c348240Dl0.LJ(null, awS119S1100000_5.s0, "");
        c348100Dkm.LJ().LJIJ(c348240Dl0, true, false);
        ((AbstractC1452680nuE) awS119S1100000_5.l1).LJJIII = awS119S1100000_5.s0;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(C361850EGp c361850EGp, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c361850EGp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(C377730ErT c377730ErT, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c377730ErT;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(C381700Exs c381700Exs, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c381700Exs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(C385410F9f c385410F9f, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c385410F9f;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(C0FMR c0fmr, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0fmr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(AbstractC1452680nuE abstractC1452680nuE, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC1452680nuE;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(NLETextStickerServiceImpl nLETextStickerServiceImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = nLETextStickerServiceImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(String str, C259800zU c259800zU, int i) {
        super(1);
        this.$t = i;
        this.l1 = c259800zU;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(String str, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(String str, C0F1E c0f1e, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0f1e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S1100000_5(String str, C0FGT c0fgt, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0fgt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS119S1100000_5(String str, String str2, List<? extends C0F26> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS119S1100000_5(List list, List<EditorProAIGCMediaItemModel> list2, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.s0 = list2;
    }
}
