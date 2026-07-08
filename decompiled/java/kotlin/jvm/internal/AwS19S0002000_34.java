package kotlin.jvm.internal;

import X.C09AY;
import X.C2245781CvA;
import X.C2246381Cw8;
import X.C291001Au;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS19S0002000_34 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f965i0;
    public int i1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S0002000_34 awS19S0002000_34, Object obj) {
        C2245781CvA c2245781CvA = (C2245781CvA) obj;
        int i = awS19S0002000_34.f965i0;
        int i2 = awS19S0002000_34.i1;
        int i3 = i2 / LSPassThroughRecordSizeConfig.DEFAULT;
        if ((i > i3 || i < 0) && i2 != -1) {
            i = i3;
        }
        return C2245781CvA.LIZ(c2245781CvA, null, null, new C291001Au(Integer.valueOf(i)), null, null, null, null, 123);
    }

    public static final Object invoke$1(AwS19S0002000_34 awS19S0002000_34, Object obj) {
        return C2246381Cw8.LIZ((C2246381Cw8) obj, null, null, null, new Pair(Integer.valueOf(awS19S0002000_34.f965i0), Integer.valueOf(awS19S0002000_34.i1)), null, null, false, null, 247);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0002000_34(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f965i0 = i;
        this.i1 = i2;
    }
}
