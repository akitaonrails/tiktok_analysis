package kotlin.jvm.internal;

import X.C09AY;
import X.C915980Zwa;
import X.C950000apS;
import X.C950340aq0;
import X.C950360aq2;
import X.C955410ayB;
import X.EnumC959580b4u;
import X.InterfaceC950020apU;
import X.InterfaceC950290apv;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS3S0900000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;

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

    public static final Object invoke$0(AwS3S0900000_15 awS3S0900000_15) {
        C950360aq2 c950360aq2 = (C950360aq2) awS3S0900000_15.l0;
        C950340aq0.LJIIIIZZ(c950360aq2.LJIIL, (Room) awS3S0900000_15.l1, c950360aq2.LJI, (RivalExtraInfo) awS3S0900000_15.l2);
        C915980Zwa.LJII().LJJLIIIIJ(true);
        DataChannel dataChannel = (DataChannel) awS3S0900000_15.l3;
        C950000apS c950000apS = (C950000apS) awS3S0900000_15.l4;
        Room room = (Room) awS3S0900000_15.l1;
        InterfaceC950290apv interfaceC950290apv = (InterfaceC950290apv) awS3S0900000_15.l5;
        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus = (MGetUserLinkmicStatusResponse.LinkmicStatus) awS3S0900000_15.l6;
        InterfaceC950290apv interfaceC950290apv2 = (InterfaceC950290apv) awS3S0900000_15.l7;
        C950360aq2 c950360aq22 = (C950360aq2) awS3S0900000_15.l0;
        C950340aq0.LJ(dataChannel, c950000apS, room, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, c950360aq22.LJIIL, (RivalExtraInfo) awS3S0900000_15.l2, c950360aq22.LJI, (InterfaceC950020apU) awS3S0900000_15.l8);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0900000_15 awS3S0900000_15) {
        C955410ayB.LJI(C915980Zwa.LJIIIZ().LIZLLL(), "popup", "switch_random_to_invite");
        C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.WITHDRAW_QUICK_CO_HOST_TO_INVITE, null);
        C950360aq2 c950360aq2 = (C950360aq2) awS3S0900000_15.l0;
        C950340aq0.LJIIIIZZ(c950360aq2.LJIIL, (Room) awS3S0900000_15.l1, c950360aq2.LJI, (RivalExtraInfo) awS3S0900000_15.l2);
        DataChannel dataChannel = (DataChannel) awS3S0900000_15.l3;
        C950000apS c950000apS = (C950000apS) awS3S0900000_15.l4;
        Room room = (Room) awS3S0900000_15.l1;
        InterfaceC950290apv interfaceC950290apv = (InterfaceC950290apv) awS3S0900000_15.l5;
        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus = (MGetUserLinkmicStatusResponse.LinkmicStatus) awS3S0900000_15.l6;
        InterfaceC950290apv interfaceC950290apv2 = (InterfaceC950290apv) awS3S0900000_15.l7;
        C950360aq2 c950360aq22 = (C950360aq2) awS3S0900000_15.l0;
        C950340aq0.LJ(dataChannel, c950000apS, room, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, c950360aq22.LJIIL, (RivalExtraInfo) awS3S0900000_15.l2, c950360aq22.LJI, (InterfaceC950020apU) awS3S0900000_15.l8);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0900000_15(C950360aq2 c950360aq2, Room room, RivalExtraInfo rivalExtraInfo, DataChannel dataChannel, C950000apS c950000apS, InterfaceC950290apv interfaceC950290apv, MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus, InterfaceC950290apv interfaceC950290apv2, InterfaceC950020apU interfaceC950020apU, int i) {
        super(0);
        this.$t = i;
        this.l0 = c950360aq2;
        this.l1 = room;
        this.l2 = rivalExtraInfo;
        this.l3 = dataChannel;
        this.l4 = c950000apS;
        this.l5 = interfaceC950290apv;
        this.l6 = linkmicStatus;
        this.l7 = interfaceC950290apv2;
        this.l8 = interfaceC950020apU;
    }
}
