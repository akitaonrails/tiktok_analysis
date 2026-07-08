package kotlin.jvm.internal;

import X.C09AY;
import X.C1729400v6Y;
import X.InterfaceC497601wk;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS29S1101000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS29S1101000_26 awS29S1101000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("url", ((Request) awS29S1101000_26.l1).getUrl());
        laneParams.plusAssign("host", ((Request) awS29S1101000_26.l1).getHost());
        laneParams.plusAssign("path", ((Request) awS29S1101000_26.l1).getPath());
        laneParams.plusAssign("key", awS29S1101000_26.s0);
        laneParams.plusAssign("type", Integer.valueOf(awS29S1101000_26.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S1101000_26 awS29S1101000_26, Object obj) {
        C1729400v6Y c1729400v6Y = C1729400v6Y.LIZ;
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS29S1101000_26.l1;
        String str = awS29S1101000_26.s0;
        int i = awS29S1101000_26.i2;
        c1729400v6Y.getClass();
        C1729400v6Y.LJIIIIZZ(interfaceC497601wk, str, i, null, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1101000_26(InterfaceC497601wk interfaceC497601wk, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = interfaceC497601wk;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S1101000_26(Request request, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = request;
        this.s0 = str;
        this.i2 = i;
    }
}
