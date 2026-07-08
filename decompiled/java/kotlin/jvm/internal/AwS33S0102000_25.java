package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C09AY;
import X.C0DXR;
import X.C1657020tDo;
import X.C1675840tiA;
import X.C1692260u8e;
import X.C1695950uEb;
import X.C1697940uHo;
import X.C814420VxA;
import X.InterfaceC1680960tqQ;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS33S0102000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS33S0102000_25 awS33S0102000_25, Object obj) {
        ((AbstractC1683310tuD) obj).LIZLLL((AbstractC1686530tzP) awS33S0102000_25.l0, C814420VxA.LIZIZ((awS33S0102000_25.i1 - ((AbstractC1686530tzP) awS33S0102000_25.l0).LL) / 2.0f), C814420VxA.LIZIZ((awS33S0102000_25.i2 - ((AbstractC1686530tzP) awS33S0102000_25.l0).LLILLJJLI) / 2.0f), 0.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS33S0102000_25 awS33S0102000_25, Object obj) {
        return C1657020tDo.LIZ((C1657020tDo) obj, null, awS33S0102000_25.i1, awS33S0102000_25.i2, null, (Effect) awS33S0102000_25.l0, false, null, null, null, null, null, null, null, null, 16361);
    }

    public static final Object invoke$2(AwS33S0102000_25 awS33S0102000_25, Object obj) {
        AbstractC1683310tuD.LJI((AbstractC1683310tuD) obj, (AbstractC1686530tzP) awS33S0102000_25.l0, awS33S0102000_25.i1, awS33S0102000_25.i2, null, 12);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS33S0102000_25 awS33S0102000_25, Object obj) {
        ((AbstractC1683310tuD) obj).LIZLLL((AbstractC1686530tzP) awS33S0102000_25.l0, awS33S0102000_25.i1, awS33S0102000_25.i2, 0.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS33S0102000_25 awS33S0102000_25, Object obj) {
        ((AbstractC1683310tuD) obj).LIZLLL((AbstractC1686530tzP) awS33S0102000_25.l0, awS33S0102000_25.i1, awS33S0102000_25.i2, 0.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS33S0102000_25 awS33S0102000_25, Object obj) {
        Context context = (Context) obj;
        RecyclerView recyclerView = new RecyclerView(context);
        C1697940uHo c1697940uHo = (C1697940uHo) awS33S0102000_25.l0;
        final int i = awS33S0102000_25.i1;
        final int i2 = awS33S0102000_25.i2;
        recyclerView.setLayoutManager(new WrapGridLayoutManager(c1697940uHo.LIZJ, 1, context, false));
        final int i3 = c1697940uHo.LIZJ;
        recyclerView.addItemDecoration(new C0DXR(i3, i, i2) { // from class: X.0DXM
            public final int LL;
            public final int LLILLJJLI;
            public final int LLILLL;

            {
                this.LL = i3;
                this.LLILLJJLI = i;
                this.LLILLL = i2;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                int i4 = childAdapterPosition % this.LL;
                if (!C444960Hcc.LIZIZ()) {
                    int i5 = this.LLILLJJLI;
                    int i6 = this.LL;
                    rect.left = (i4 * i5) / i6;
                    rect.right = i5 - (((i4 + 1) * i5) / i6);
                } else {
                    int i7 = this.LLILLJJLI;
                    int i8 = this.LL;
                    rect.right = (i4 * i7) / i8;
                    rect.left = i7 - (((i4 + 1) * i7) / i8);
                }
                if (childAdapterPosition >= this.LL) {
                    rect.top = this.LLILLL;
                }
            }
        });
        recyclerView.setAdapter(c1697940uHo.LJFF);
        return recyclerView;
    }

    public static final Object invoke$6(AwS33S0102000_25 awS33S0102000_25, Object obj) {
        C1692260u8e c1692260u8e = (C1692260u8e) obj;
        InterfaceC1680960tqQ interfaceC1680960tqQ = (InterfaceC1680960tqQ) awS33S0102000_25.l0;
        C1695950uEb c1695950uEbLJIJJLI = c1692260u8e.LIZ.LJIJJLI(c1692260u8e.LIZLLL(awS33S0102000_25.i1), c1692260u8e.LIZLLL(awS33S0102000_25.i2));
        float f = c1692260u8e.LJFF;
        c1695950uEbLJIJJLI.LJIJ((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
        C1675840tiA.LIZIZ(interfaceC1680960tqQ, c1695950uEbLJIJJLI);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS33S0102000_25(int r3, int r4, X.AbstractC1686530tzP r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L10
            r1 = r2
            r1.l0 = r5
            r1.i1 = r3
            r1.i2 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r5
            r1.i2 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS33S0102000_25.<init>(int, int, X.0tzP, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0102000_25(int i, int i2, Effect effect, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0102000_25(C1695950uEb c1695950uEb, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c1695950uEb;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0102000_25(C1697940uHo c1697940uHo, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c1697940uHo;
        this.i1 = i;
        this.i2 = i2;
    }
}
