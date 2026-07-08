package kotlin.jvm.internal;

import X.AbstractC1111600f26;
import X.C09AY;
import X.C1112390f3N;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS44S0102000_17 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS44S0102000_17 awS44S0102000_17) {
        AbstractC1111600f26 abstractC1111600f26 = ((C1112390f3N) awS44S0102000_17.l0).LIZJ;
        if (abstractC1111600f26 != null) {
            abstractC1111600f26.notifyItemRangeChanged(awS44S0102000_17.i1, awS44S0102000_17.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS44S0102000_17 awS44S0102000_17) {
        AbstractC1111600f26 abstractC1111600f26 = ((C1112390f3N) awS44S0102000_17.l0).LIZJ;
        if (abstractC1111600f26 != null) {
            abstractC1111600f26.notifyItemRangeInserted(awS44S0102000_17.i1, awS44S0102000_17.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS44S0102000_17 awS44S0102000_17) {
        AbstractC1111600f26 abstractC1111600f26 = ((C1112390f3N) awS44S0102000_17.l0).LIZJ;
        if (abstractC1111600f26 != null) {
            abstractC1111600f26.notifyItemRangeRemoved(awS44S0102000_17.i1, awS44S0102000_17.i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS44S0102000_17 awS44S0102000_17) {
        SmoothLinearLayoutManager smoothLinearLayoutManager = ((C1112390f3N) awS44S0102000_17.l0).LIZLLL;
        if (smoothLinearLayoutManager != null) {
            smoothLinearLayoutManager.scrollToPositionWithOffset(awS44S0102000_17.i1, awS44S0102000_17.i2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0102000_17(C1112390f3N c1112390f3N, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c1112390f3N;
        this.i1 = i;
        this.i2 = i2;
    }
}
