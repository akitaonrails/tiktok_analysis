package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C20441214yg;
import X.C2074808Aw;
import X.C2188811AlT;
import X.C753790ThZ;
import X.C786410Ut5;
import X.C921240a54;
import X.C924490aAJ;
import X.C955400ayA;
import X.C975500bUa;
import X.C975600bUk;
import X.C986490bmJ;
import X.C986510bmL;
import X.EnumC1998907sJ;
import X.EnumC919170a1j;
import X.EnumC932550aNJ;
import X.InterfaceC986560bmQ;
import X.RunnableC514501zT;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveInviteFriendFreqCtrl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS55S0310000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS55S0310000_15 awS55S0310000_15) {
        String str;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        Room room = (Room) awS55S0310000_15.l0;
        if (awS55S0310000_15.z3) {
            str = "apply";
        } else {
            str = "invite";
        }
        C955400ayA.LLF(room, str, null, (RivalExtraInfo) awS55S0310000_15.l1, null, null, (Map) awS55S0310000_15.l2, false, null, 436);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS55S0310000_15 awS55S0310000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleInviteSuccess,matchWidgetDelegate = null ");
        sbLIZ.append(((MultiMatchAnchorWidget) awS55S0310000_15.l0).LLJI);
        sbLIZ.append(" event=");
        sbLIZ.append((C975600bUk) awS55S0310000_15.l1);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (awS55S0310000_15.z3) {
            C2074808Aw.LJI((EnumC1998907sJ) awS55S0310000_15.l2);
        }
        C975500bUa c975500bUa = ((MultiMatchAnchorWidget) awS55S0310000_15.l0).LLJI;
        if (c975500bUa != null) {
            c975500bUa.LJIILLIIL((C975600bUk) awS55S0310000_15.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS55S0310000_15 awS55S0310000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleInviteSuccess,matchWidgetDelegate = null ");
        sbLIZ.append(((MultiMatchAnchorWidget) awS55S0310000_15.l0).LLJI);
        sbLIZ.append(" event=");
        sbLIZ.append((C975600bUk) awS55S0310000_15.l1);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (awS55S0310000_15.z3) {
            C2074808Aw.LJI((EnumC1998907sJ) awS55S0310000_15.l2);
        }
        C975500bUa c975500bUa = ((MultiMatchAnchorWidget) awS55S0310000_15.l0).LLJI;
        if (c975500bUa != null) {
            c975500bUa.LJIILLIIL((C975600bUk) awS55S0310000_15.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS55S0310000_15 awS55S0310000_15) {
        C924490aAJ.LIZJ((DataChannel) awS55S0310000_15.l0, (MultiGuestDataHolder) awS55S0310000_15.l1, awS55S0310000_15.z3, (EnumC932550aNJ) awS55S0310000_15.l2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS55S0310000_15 awS55S0310000_15) {
        if (awS55S0310000_15.z3) {
            C013C c013c = (C013C) awS55S0310000_15.l0;
            c013c.element = true;
            C786410Ut5.LJLIIL(MultiLiveInviteFriendFreqCtrl.INSTANCE.getSettingValue().singleUserTimeWindow * ((long) LSPassThroughRecordSizeConfig.DEFAULT), ((MultiGuestAsGuestModeratorManageDialog) awS55S0310000_15.l1).LLJJ, new RunnableC514501zT(c013c, (Function0) awS55S0310000_15.l2, 40));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS55S0310000_15 awS55S0310000_15) {
        ((C986510bmL) awS55S0310000_15.l0).LIZ.SX0(C753790ThZ.class, Boolean.TRUE);
        InterfaceC986560bmQ interfaceC986560bmQ = (InterfaceC986560bmQ) awS55S0310000_15.l1;
        if (interfaceC986560bmQ != null) {
            C986490bmJ.LIZJ(interfaceC986560bmQ, (EnumC919170a1j) awS55S0310000_15.l2, awS55S0310000_15.z3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0310000_15(C986510bmL c986510bmL, InterfaceC986560bmQ interfaceC986560bmQ, EnumC919170a1j enumC919170a1j, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c986510bmL;
        this.l1 = interfaceC986560bmQ;
        this.l2 = enumC919170a1j;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0310000_15(MultiMatchAnchorWidget multiMatchAnchorWidget, C975600bUk c975600bUk, boolean z, EnumC1998907sJ enumC1998907sJ, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiMatchAnchorWidget;
        this.l1 = c975600bUk;
        this.z3 = z;
        this.l2 = enumC1998907sJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS55S0310000_15(Room room, Room room2, boolean z, RivalExtraInfo rivalExtraInfo, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = room;
        this.z3 = room2;
        this.l1 = z;
        this.l2 = rivalExtraInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0310000_15(DataChannel dataChannel, MultiGuestDataHolder multiGuestDataHolder, boolean z, EnumC932550aNJ enumC932550aNJ, int i) {
        super(0);
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = multiGuestDataHolder;
        this.z3 = z;
        this.l2 = enumC932550aNJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0310000_15(boolean z, C013C c013c, MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog, C921240a54 c921240a54, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l0 = c013c;
        this.l1 = multiGuestAsGuestModeratorManageDialog;
        this.l2 = c921240a54;
    }
}
