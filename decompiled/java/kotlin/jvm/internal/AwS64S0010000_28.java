package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C1893440zN8;
import X.C1893790zNh;
import X.C1894330zOZ;
import X.C1897790zU9;
import X.C1898700zVc;
import X.C1901580zaG;
import X.C1904430zer;
import X.InterfaceC1896860zSe;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS64S0010000_28 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0010000_28(int i) {
        super(0);
        this.$t = i;
        this.z0 = true;
    }

    public static final Object invoke$0(AwS64S0010000_28 awS64S0010000_28) {
        if (!((Boolean) C1904430zer.LJFF.getValue()).booleanValue() || awS64S0010000_28.z0) {
            C1901580zaG.LIZ.LJIIIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS64S0010000_28 awS64S0010000_28) {
        C1897790zU9 c1897790zU9 = C1897790zU9.LL;
        boolean z = awS64S0010000_28.z0;
        c1897790zU9.getClass();
        if (z) {
            C1897790zU9.LLILZ++;
        } else {
            C1897790zU9.LLILZ--;
        }
        C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
        FeedTimerPendantManger feedTimerPendantMangerLIZ = C1893440zN8.LIZ();
        boolean z2 = awS64S0010000_28.z0;
        feedTimerPendantMangerLIZ.LLJJI = z2;
        if (z2) {
            C1898700zVc c1898700zVc = feedTimerPendantMangerLIZ.LLIZ;
            if (c1898700zVc != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1898700zVc);
                c1898700zVc.setAlpha(0.5f);
            }
        } else {
            C1898700zVc c1898700zVc2 = feedTimerPendantMangerLIZ.LLIZ;
            if (c1898700zVc2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1898700zVc2);
                c1898700zVc2.setAlpha(1.0f);
            }
        }
        C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
        SpecActPendantManager specActPendantManagerLIZ = C1894330zOZ.LIZ();
        boolean z3 = awS64S0010000_28.z0;
        InterfaceC1896860zSe interfaceC1896860zSeLJIIJJI = specActPendantManagerLIZ.LJIIJJI();
        if (interfaceC1896860zSeLJIIJJI != null) {
            interfaceC1896860zSeLJIIJJI.monitorShowingDialogCount(z3);
        }
        specActPendantManagerLIZ.LLJJ = z3;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS64S0010000_28 awS64S0010000_28) {
        if (awS64S0010000_28.z0) {
            C1893790zNh.LIZ.getClass();
            C1893790zNh.LJIIZILJ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS64S0010000_28 awS64S0010000_28) {
        return Boolean.valueOf(awS64S0010000_28.z0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0010000_28(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
