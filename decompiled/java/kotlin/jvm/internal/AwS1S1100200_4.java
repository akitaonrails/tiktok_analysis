package kotlin.jvm.internal;

import X.C09AY;
import X.C0C6R;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS1S1100200_4 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public long j3;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS1S1100200_4 awS1S1100200_4) {
        ((C0C6R) awS1S1100200_4.l1).LJFF((awS1S1100200_4.j2 - awS1S1100200_4.j3) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), awS1S1100200_4.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1100200_4 awS1S1100200_4) {
        ((C0C6R) awS1S1100200_4.l1).LJFF((awS1S1100200_4.j2 - awS1S1100200_4.j3) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), awS1S1100200_4.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1100200_4(C0C6R c0c6r, long j, long j2, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0c6r;
        this.j2 = j;
        this.j3 = j2;
        this.s0 = str;
    }
}
