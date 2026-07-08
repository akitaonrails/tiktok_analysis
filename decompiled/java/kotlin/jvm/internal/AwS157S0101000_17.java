package kotlin.jvm.internal;

import X.AbstractC1111600f26;
import X.AbstractC21673619ry;
import X.C09AY;
import X.C0UKZ;
import X.C1111150f1N;
import X.C1112390f3N;
import X.C1124290fMZ;
import X.C1124490fMt;
import X.C20337914i1;
import X.C21674119s3;
import X.C781550UlF;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.ViewOnClickListenerC986770bml;
import Y.ARunnableS23S0201000_17;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS157S0101000_17 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS157S0101000_17 awS157S0101000_17) {
        ((ViewOnClickListenerC986770bml) awS157S0101000_17.l0).J2(awS157S0101000_17.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS157S0101000_17 awS157S0101000_17) {
        ((PreviewServicePlusWidget) awS157S0101000_17.l0).LLJJJJJIL = System.currentTimeMillis();
        C0UKZ.LLIIIL.LIZJ(Integer.valueOf(awS157S0101000_17.i1));
        ((PreviewServicePlusWidget) awS157S0101000_17.l0).d2("smb_content_templates_promotion");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS157S0101000_17 awS157S0101000_17) {
        int iLLLFZ;
        AbstractC21673619ry adapter;
        int itemCount;
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.R6;
        if (Intrinsics.LJFF(c20337914i1.LIZIZ(), Boolean.FALSE)) {
            C1124490fMt c1124490fMt = ((C1124290fMZ) awS157S0101000_17.l0).LLJI;
            if (c1124490fMt == null || (iLLLFZ = c1124490fMt.LLLFZ()) < 0) {
                iLLLFZ = 0;
            }
            C1124290fMZ c1124290fMZ = (C1124290fMZ) awS157S0101000_17.l0;
            int i = awS157S0101000_17.i1;
            final Context context = c1124290fMZ.LL;
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0fMY
                @Override // X.C21674119s3
                public final float LJIIJJI(DisplayMetrics displayMetrics) {
                    if (displayMetrics == null) {
                        return 1.875f;
                    }
                    return 300.0f / displayMetrics.densityDpi;
                }
            };
            RecyclerView recyclerView = c1124290fMZ.LLJ;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (itemCount = adapter.getItemCount()) != 0 && iLLLFZ < itemCount && i >= 0 && i < itemCount) {
                RecyclerView recyclerView2 = c1124290fMZ.LLJ;
                if (recyclerView2 != null) {
                    HandlerHook.viewPostDelay(recyclerView2, new ARunnableS23S0201000_17(i, c1124290fMZ, c21674119s3, 4), 1000L);
                }
                RecyclerView recyclerView3 = c1124290fMZ.LLJ;
                if (recyclerView3 != null) {
                    HandlerHook.viewPostDelay(recyclerView3, new ARunnableS23S0201000_17(iLLLFZ, c1124290fMZ, c21674119s3, 5), 2500L);
                }
            }
            c20337914i1.LJFF(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS157S0101000_17 r13) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS157S0101000_17.invoke$3(kotlin.jvm.internal.AwS157S0101000_17):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS157S0101000_17 awS157S0101000_17) {
        C786410Ut5.LJLLLLLL(awS157S0101000_17.i1, (View) awS157S0101000_17.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS157S0101000_17 awS157S0101000_17) {
        AbstractC1111600f26 abstractC1111600f26 = ((C1112390f3N) awS157S0101000_17.l0).LIZJ;
        if (abstractC1111600f26 != null) {
            abstractC1111600f26.notifyItemChanged(awS157S0101000_17.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS157S0101000_17 awS157S0101000_17) {
        C781550UlF c781550UlF = ((C1112390f3N) awS157S0101000_17.l0).LIZ;
        if (c781550UlF != null) {
            c781550UlF.scrollToPosition(awS157S0101000_17.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS157S0101000_17 awS157S0101000_17) {
        C781550UlF c781550UlF = ((C1112390f3N) awS157S0101000_17.l0).LIZ;
        if (c781550UlF != null) {
            c781550UlF.smoothScrollToPosition(awS157S0101000_17.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS157S0101000_17 awS157S0101000_17) {
        ((C1111150f1N) awS157S0101000_17.l0).U5();
        C1111150f1N c1111150f1N = (C1111150f1N) awS157S0101000_17.l0;
        int i = awS157S0101000_17.i1;
        c1111150f1N.LLJJ = i;
        c1111150f1N.S5(i);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0101000_17(int i, ViewOnClickListenerC986770bml viewOnClickListenerC986770bml, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = viewOnClickListenerC986770bml;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0101000_17(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0101000_17(int i, Long l, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = l;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0101000_17(C1111150f1N c1111150f1N, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1111150f1N;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0101000_17(C1112390f3N c1112390f3N, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1112390f3N;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0101000_17(C1124290fMZ c1124290fMZ, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1124290fMZ;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0101000_17(PreviewServicePlusWidget previewServicePlusWidget, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = previewServicePlusWidget;
        this.i1 = i;
    }
}
