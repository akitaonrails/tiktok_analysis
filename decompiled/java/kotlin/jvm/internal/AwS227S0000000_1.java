package kotlin.jvm.internal;

import X.C09AY;
import X.C19ME;
import X.InterfaceC2257711DYj;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS227S0000000_1 extends C09AY implements Function1 {
    public final int $t;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS227S0000000_1(int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        ((InterfaceC2257711DYj) obj).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        ((InterfaceC2257711DYj) obj).Am();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        C19ME c19me = (C19ME) obj;
        c19me.topToTop = 0;
        c19me.startToEnd = R.id.yz1;
        c19me.bottomToBottom = -1;
        c19me.topToBottom = -1;
        c19me.startToStart = -1;
        c19me.goneStartMargin = 0;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        C19ME c19me = (C19ME) obj;
        c19me.topToTop = -1;
        c19me.startToEnd = R.id.yz3;
        c19me.bottomToBottom = R.id.yz3;
        c19me.topToBottom = -1;
        c19me.startToStart = -1;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        C19ME c19me = (C19ME) obj;
        c19me.topToTop = -1;
        c19me.startToEnd = R.id.yz2;
        c19me.bottomToBottom = R.id.yz2;
        c19me.topToBottom = -1;
        c19me.startToStart = -1;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        C19ME c19me = (C19ME) obj;
        c19me.topToTop = -1;
        c19me.startToEnd = R.id.yz3;
        c19me.bottomToBottom = R.id.yz3;
        c19me.topToBottom = -1;
        c19me.startToStart = -1;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        C19ME c19me = (C19ME) obj;
        c19me.topToTop = R.id.yz2;
        c19me.startToEnd = R.id.yz2;
        c19me.bottomToBottom = R.id.yz2;
        c19me.topToBottom = -1;
        c19me.startToStart = -1;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS227S0000000_1 awS227S0000000_1, Object obj) {
        ((C19ME) obj).topToBottom = R.id.dgr;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS227S0000000_1(RecyclerView recyclerView, int i, int i2) {
        super(1);
        this.$t = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS227S0000000_1(RecyclerView recyclerView, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
    }
}
