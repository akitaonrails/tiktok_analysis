package kotlin.jvm.internal;

import X.C09AY;
import X.C1448290nn9;
import X.C1654790tAD;
import X.EnumC1448830no1;
import com.ss.android.ugc.aweme.shortvideo.countdown.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS14S0101100_25 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS14S0101100_25 awS14S0101100_25) {
        ((b) awS14S0101100_25.l0).getRecordControlApi().xB(new C1448290nn9(EnumC1448830no1.COUNT_DOWN, awS14S0101100_25.i1, awS14S0101100_25.j2, 8), ((b) awS14S0101100_25.l0).getShortVideoContext().creativeModel.aigcMetadataModel.isAigcEffect);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S0101100_25 awS14S0101100_25) {
        ((C1654790tAD) awS14S0101100_25.l0).getRecordControlApi().xB(new C1448290nn9(EnumC1448830no1.COUNT_DOWN, awS14S0101100_25.i1, awS14S0101100_25.j2, 8), ((C1654790tAD) awS14S0101100_25.l0).getShortVideoContext().creativeModel.aigcMetadataModel.isAigcEffect);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0101100_25(C1654790tAD c1654790tAD, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1654790tAD;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0101100_25(b bVar, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = bVar;
        this.i1 = i;
        this.j2 = j;
    }
}
