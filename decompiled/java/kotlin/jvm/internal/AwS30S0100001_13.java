package kotlin.jvm.internal;

import X.C09AY;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS30S0100001_13 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS30S0100001_13 awS30S0100001_13) {
        float f = awS30S0100001_13.f1;
        if (f >= 0.0f) {
            View view = ((SeaPdpCreatorSheetWidget) awS30S0100001_13.l0).LLJI;
            if (view != null) {
                C786410Ut5.ed(view, f * view.getHeight());
            }
        } else {
            View view2 = ((SeaPdpCreatorSheetWidget) awS30S0100001_13.l0).LLJI;
            if (view2 != null) {
                C786410Ut5.ed(view2, 0.0f);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS30S0100001_13 awS30S0100001_13) {
        float f = awS30S0100001_13.f1;
        if (f >= 0.0f) {
            View view = ((PdpCreatorSheetWidget) awS30S0100001_13.l0).LLJI;
            if (view != null) {
                C786410Ut5.ed(view, f * view.getHeight());
            }
        } else {
            View view2 = ((PdpCreatorSheetWidget) awS30S0100001_13.l0).LLJI;
            if (view2 != null) {
                C786410Ut5.ed(view2, 0.0f);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0100001_13(float f, SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget, int i) {
        super(0);
        this.$t = i;
        this.f1 = f;
        this.l0 = seaPdpCreatorSheetWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0100001_13(float f, PdpCreatorSheetWidget pdpCreatorSheetWidget, int i) {
        super(0);
        this.$t = i;
        this.f1 = f;
        this.l0 = pdpCreatorSheetWidget;
    }
}
