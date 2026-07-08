package kotlin.jvm.internal;

import X.C09AY;
import X.C0IJT;
import X.C0J0I;
import X.C0JCX;
import X.C0K6E;
import X.C1102420enI;
import X.C238400w2;
import X.C469700IbQ;
import X.C474500IjA;
import X.C484630IzV;
import X.C511520K4g;
import android.app.Activity;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS147S0101000_7 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS147S0101000_7 awS147S0101000_7) {
        ((C238400w2) awS147S0101000_7.l0).element = System.currentTimeMillis();
        C469700IbQ.LIZ(1, awS147S0101000_7.i1);
        int i = awS147S0101000_7.i1;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_tooltip_show");
        c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "guidance_type");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS147S0101000_7 awS147S0101000_7) {
        ((C238400w2) awS147S0101000_7.l0).element = System.currentTimeMillis();
        C469700IbQ.LIZ(3, awS147S0101000_7.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS147S0101000_7 awS147S0101000_7) {
        ((Activity) awS147S0101000_7.l0).setContentView(awS147S0101000_7.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS147S0101000_7 awS147S0101000_7) {
        Room room;
        C484630IzV c484630IzV = (C484630IzV) awS147S0101000_7.l0;
        Integer numValueOf = Integer.valueOf(awS147S0101000_7.i1);
        c484630IzV.getClass();
        if (numValueOf != null) {
            numValueOf.intValue();
            DataChannel dataChannel = c484630IzV.LIZLLL;
            Long lValueOf = null;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room = null;
            }
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            C1102420enI.LJIIL(lValueOf, numValueOf, 1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS147S0101000_7 awS147S0101000_7) {
        Room room;
        C0J0I c0j0i = (C0J0I) awS147S0101000_7.l0;
        Integer numValueOf = Integer.valueOf(awS147S0101000_7.i1);
        c0j0i.getClass();
        if (numValueOf != null) {
            numValueOf.intValue();
            DataChannel dataChannel = c0j0i.LIZ;
            Long lValueOf = null;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room = null;
            }
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            C1102420enI.LJIIL(lValueOf, numValueOf, 1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS147S0101000_7 awS147S0101000_7) {
        String strLJII = ((C0K6E) awS147S0101000_7.l0).LIZJ;
        if (strLJII == null || strLJII.length() <= 0) {
            strLJII = C511520K4g.LJII(awS147S0101000_7.i1);
        }
        C0JCX.LIZLLL(strLJII);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0101000_7(int i, C238400w2 c238400w2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c238400w2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0101000_7(C484630IzV c484630IzV, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c484630IzV;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0101000_7(C0J0I c0j0i, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0j0i;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0101000_7(C0K6E c0k6e, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0k6e;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0101000_7(Activity activity, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = activity;
        this.i1 = i;
    }
}
