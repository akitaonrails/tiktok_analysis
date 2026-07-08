package kotlin.jvm.internal;

import X.C09AY;
import X.C1161920gLG;
import X.C1533950q1J;
import X.C20441214yg;
import X.C2188811AlT;
import X.C766270U4b;
import X.C924790aAn;
import X.C939000aXi;
import X.InterfaceC923600a8s;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperUrlEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS36S1101000_15 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS36S1101000_15 awS36S1101000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode = ");
        sbLIZ.append(awS36S1101000_15.i2);
        sbLIZ.append(", msg = ");
        sbLIZ.append(awS36S1101000_15.s0);
        C20441214yg.LJ("MultiGuestV3GuestPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (((Number) C924790aAn.LIZLLL().LIZIZ).intValue() >= 1) {
            C766270U4b.LIZLLL(2131841089);
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) ((MultiGuestV3GuestPresenter) awS36S1101000_15.l1).mView;
            if (interfaceC923600a8s != null) {
                interfaceC923600a8s.oY();
            }
            ((MultiGuestV3GuestPresenter) awS36S1101000_15.l1).stopInteract("multi_guest_layout_error", false, false, 10069);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S1101000_15 awS36S1101000_15) {
        C939000aXi c939000aXi = C939000aXi.LIZ;
        String str = awS36S1101000_15.s0;
        c939000aXi.getClass();
        C939000aXi.LJ = str;
        if (awS36S1101000_15.i2 == 2) {
            C939000aXi.LIZLLL = null;
            C939000aXi.LJI = null;
            C939000aXi.LJFF = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalidateSei: source = ");
        sbLIZ.append(awS36S1101000_15.i2);
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (C1533950q1J.LJ(awS36S1101000_15.s0)) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).du0("shared_bg");
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).We1("aigc_play_info", C939000aXi.LIZ());
            DataChannel dataChannel = (DataChannel) awS36S1101000_15.l1;
            if (dataChannel != null) {
                dataChannel.zW(AigcWallpaperUrlEvent.class, awS36S1101000_15.s0);
            }
        } else {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).du0("aigc_play_info");
            DataChannel dataChannel2 = (DataChannel) awS36S1101000_15.l1;
            if (dataChannel2 != null) {
                dataChannel2.zW(AigcWallpaperUrlEvent.class, "");
            }
            if (awS36S1101000_15.i2 == 2) {
                C939000aXi.LIZIZ((DataChannel) awS36S1101000_15.l1);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S1101000_15(int i, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, String str, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = multiGuestV3GuestPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S1101000_15(int i, DataChannel dataChannel, String str, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = dataChannel;
    }
}
