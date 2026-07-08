package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0KWL;
import X.C13BV;
import X.C189200o6;
import X.C18MZ;
import X.C18RW;
import X.C18S0;
import X.C190Q;
import X.C190T;
import X.C197G;
import X.C21409818qW;
import X.C375830EoP;
import X.C957403oi;
import android.text.Layout;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayFragment;
import com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS138S0101000_32 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS138S0101000_32 awS138S0101000_32, Object obj) throws IllegalAccessException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((SimpleLiveTextView) awS138S0101000_32.l0).invalidate();
        Field field = SimpleLiveTextView.LLJJJJLIIL;
        if (field != null) {
            field.set((SimpleLiveTextView) awS138S0101000_32.l0, Integer.valueOf(awS138S0101000_32.i1));
        }
        SimpleLiveTextView simpleLiveTextView = (SimpleLiveTextView) awS138S0101000_32.l0;
        Layout layout = simpleLiveTextView.LLJJIJI;
        if (layout != null && zBooleanValue) {
            simpleLiveTextView.LJJLIIIJILLIZJL(layout.getWidth(), C21409818qW.LJIILIIL, ((simpleLiveTextView.getRight() - simpleLiveTextView.getLeft()) - simpleLiveTextView.getCompoundPaddingLeft()) - simpleLiveTextView.getCompoundPaddingRight());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        return C18S0.LIZ((C18S0) obj, null, null, null, null, null, null, new C375830EoP(new C18RW((List) awS138S0101000_32.l0, awS138S0101000_32.i1, true)), null, null, null, 3967);
    }

    public static final Object invoke$2(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        return C18S0.LIZ((C18S0) obj, null, null, null, null, null, null, null, new C375830EoP(new C18RW((List) awS138S0101000_32.l0, awS138S0101000_32.i1, true)), null, null, 3839);
    }

    public static final Object invoke$3(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        int i;
        C190T c190t = (C190T) obj;
        if (((C190Q) awS138S0101000_32.l0).n5(awS138S0101000_32.i1)) {
            i = 8;
        } else {
            i = 0;
        }
        return C190T.LJII(c190t, i, false, false, null, null, null, 1022);
    }

    public static final Object invoke$4(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        Unit unit;
        List list = (List) obj;
        TuxTextView tuxTextView = (TuxTextView) awS138S0101000_32.l0;
        int i = awS138S0101000_32.i1;
        if (tuxTextView == null) {
            unit = null;
        } else {
            try {
                C0KWL.LIZ.getClass();
                C0KWL.LJII(tuxTextView, i, list);
                tuxTextView.requestLayout();
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        Unit unit;
        List list = (List) obj;
        TuxTextView tuxTextView = (TuxTextView) awS138S0101000_32.l0;
        int i = awS138S0101000_32.i1;
        if (tuxTextView == null) {
            unit = null;
        } else {
            try {
                C0KWL.LIZ.getClass();
                C0KWL.LJII(tuxTextView, i, list);
                tuxTextView.requestLayout();
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        RecommendDescResponse recommendDescResponse = (RecommendDescResponse) obj;
        C197G c197g = ((AIRewriteModule) awS138S0101000_32.l0).LLLIILIL;
        if (c197g != null) {
            int i = awS138S0101000_32.i1;
            List<PoweredTextItem> list = recommendDescResponse.generatedPoweredText;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c197g.LIZ(i, list);
            c197g.LJI = false;
            c197g.LIZIZ(i, false, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        RecommendDescResponse recommendDescResponse = (RecommendDescResponse) obj;
        C197G c197g = ((AIRewriteModule) awS138S0101000_32.l0).LLLIILIL;
        if (c197g != null) {
            int i = awS138S0101000_32.i1;
            List<PoweredTextItem> list = recommendDescResponse.generatedPoweredText;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c197g.LIZ(i, list);
            c197g.LJFF = false;
            c197g.LIZIZ(i, false, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AnchorPanelProductManager anchorPanelProductManagerLLLIIIIL = ((C18MZ) awS138S0101000_32.l0).LLLIIIIL();
            int i = awS138S0101000_32.i1;
            anchorPanelProductManagerLLLIIIIL.LJ(i, ((C18MZ) awS138S0101000_32.l0).LLLFZ(awS138S0101000_32.i1), (AnchorProductInfoModel) ListProtector.get(((C18MZ) awS138S0101000_32.l0).LLJI, i));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS138S0101000_32 awS138S0101000_32, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        ((ECLiveVideoReplayFragment) awS138S0101000_32.l0).VR(c957403oi.LIZ);
        c957403oi.LIZJ("stay_time", Integer.valueOf(awS138S0101000_32.i1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0101000_32(int i, AIRewriteModule aIRewriteModule, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aIRewriteModule;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0101000_32(C18MZ c18mz, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c18mz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0101000_32(C190Q c190q, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c190q;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0101000_32(SimpleLiveTextView simpleLiveTextView, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = simpleLiveTextView;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0101000_32(TuxTextView tuxTextView, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = tuxTextView;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S0101000_32(ECLiveVideoReplayFragment eCLiveVideoReplayFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = eCLiveVideoReplayFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS138S0101000_32(List list, List<AIPlaygroundChipsModel> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
