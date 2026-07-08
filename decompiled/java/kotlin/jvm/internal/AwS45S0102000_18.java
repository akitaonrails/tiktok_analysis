package kotlin.jvm.internal;

import X.C09AY;
import X.C1160360gIk;
import X.C1196110hEP;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS45S0102000_18 extends C09AY implements Function0 {
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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS45S0102000_18 awS45S0102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manual load more complete, stop auto fetch more on no progress, cursor = ");
        sbLIZ.append(awS45S0102000_18.i1);
        sbLIZ.append(", next = ");
        sbLIZ.append(awS45S0102000_18.i2);
        sbLIZ.append(", data.size=");
        sbLIZ.append(((List) awS45S0102000_18.l0).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS45S0102000_18 awS45S0102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more complete, stop auto fetch more on no progress, cursor = ");
        sbLIZ.append(awS45S0102000_18.i1);
        sbLIZ.append(", next = ");
        sbLIZ.append(awS45S0102000_18.i2);
        sbLIZ.append(", data.size=");
        sbLIZ.append(((List) awS45S0102000_18.l0).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS45S0102000_18 awS45S0102000_18) {
        ((C1196110hEP) awS45S0102000_18.l0).setText(C786410Ut5.k4(Locale.getDefault(), "%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(awS45S0102000_18.i1 + 1), Integer.valueOf(awS45S0102000_18.i2)}, 2)));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS45S0102000_18 awS45S0102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.onItemRangeChanged(positionStart,itemCount,payload) positionStart=");
        sbLIZ.append(awS45S0102000_18.i1);
        sbLIZ.append(" itemCount=");
        sbLIZ.append(awS45S0102000_18.i2);
        sbLIZ.append(" nextChunkIsLoadMore=");
        sbLIZ.append(((C1160360gIk) awS45S0102000_18.l0).LJFF);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS45S0102000_18 awS45S0102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.onItemRangeChanged(positionStart,itemCount) positionStart=");
        sbLIZ.append(awS45S0102000_18.i1);
        sbLIZ.append(" itemCount=");
        sbLIZ.append(awS45S0102000_18.i2);
        sbLIZ.append(" nextChunkIsLoadMore=");
        sbLIZ.append(((C1160360gIk) awS45S0102000_18.l0).LJFF);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS45S0102000_18 awS45S0102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.onItemRangeInserted positionStart=");
        sbLIZ.append(awS45S0102000_18.i1);
        sbLIZ.append(" itemCount=");
        sbLIZ.append(awS45S0102000_18.i2);
        sbLIZ.append(" nextChunkIsLoadMore=");
        sbLIZ.append(((C1160360gIk) awS45S0102000_18.l0).LJFF);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0102000_18(int i, int i2, C1160360gIk c1160360gIk, int i3) {
        super(0);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = c1160360gIk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S0102000_18(int i, int i2, int i3, List<InterfaceC1891350zJl> list) {
        super(0);
        this.$t = list;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0102000_18(C1196110hEP c1196110hEP, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c1196110hEP;
        this.i1 = i;
        this.i2 = i2;
    }
}
