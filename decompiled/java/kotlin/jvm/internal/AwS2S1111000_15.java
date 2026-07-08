package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C520010KaN;
import X.C920550a3x;
import X.C922680a7O;
import X.C925080aBG;
import X.InterfaceC919320a1y;
import X.InterfaceC923600a8s;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS2S1111000_15 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS2S1111000_15 awS2S1111000_15, Object obj) {
        Context context;
        int iIntValue = ((Number) obj).intValue();
        if (awS2S1111000_15.z2) {
            ((MultiGuestV3GuestPresenter) awS2S1111000_15.l1).showApplyDialog(iIntValue, awS2S1111000_15.s0);
        } else {
            InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) ((MultiGuestV3GuestPresenter) awS2S1111000_15.l1).mView;
            if (interfaceC919320a1y != null) {
                context = interfaceC919320a1y.getContext();
            } else {
                context = null;
            }
            Activity activityLJIJ = C520010KaN.LJIJ(context, false);
            if (activityLJIJ != null) {
                boolean z = C925080aBG.LIZ;
                DataChannel dataChannel = ((MultiGuestV3GuestPresenter) awS2S1111000_15.l1).mDataChannel;
                int i = awS2S1111000_15.i3;
                Long lValueOf = Long.valueOf(iIntValue);
                String str = awS2S1111000_15.s0;
                C925080aBG.LIZ(false, dataChannel, i, activityLJIJ, lValueOf, str, new C920550a3x(iIntValue, (MultiGuestV3GuestPresenter) awS2S1111000_15.l1, str), null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1111000_15 awS2S1111000_15, Object obj) {
        Context context;
        int iIntValue = ((Number) obj).intValue();
        if (awS2S1111000_15.z2) {
            C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "showReservationDialog, checkDeviceDelay");
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) ((C922680a7O) awS2S1111000_15.l1).mView;
            if (interfaceC923600a8s != null) {
                interfaceC923600a8s.YX1();
            }
        } else {
            C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "showReservationDialog, checkDeviceAndPlugin");
            InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) ((C922680a7O) awS2S1111000_15.l1).mView;
            if (interfaceC919320a1y != null) {
                context = interfaceC919320a1y.getContext();
            } else {
                context = null;
            }
            Activity activityLJIJ = C520010KaN.LJIJ(context, false);
            if (activityLJIJ != null) {
                boolean z = C925080aBG.LIZ;
                C925080aBG.LIZ(false, ((C922680a7O) awS2S1111000_15.l1).LL, awS2S1111000_15.i3, activityLJIJ, Long.valueOf(iIntValue), awS2S1111000_15.s0, new AwS594S0100000_15((C922680a7O) awS2S1111000_15.l1, iIntValue, 734), null);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1111000_15(C922680a7O c922680a7O, String str, int i) {
        super(1);
        this.$t = i;
        this.z2 = true;
        this.l1 = c922680a7O;
        this.i3 = 0;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1111000_15(boolean z, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z2 = z;
        this.l1 = multiGuestV3GuestPresenter;
        this.s0 = str;
        this.i3 = i;
    }
}
