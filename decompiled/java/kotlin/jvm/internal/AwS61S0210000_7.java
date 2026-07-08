package kotlin.jvm.internal;

import X.AbstractC1542200qEc;
import X.C098200Yq;
import X.C09AY;
import X.C189200o6;
import X.C19748512Ol;
import X.C20743716Ff;
import X.C766270U4b;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.PaidRoomChannel;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS61S0210000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AwS61S0210000_7 awS61S0210000_7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((FrameLayout) awS61S0210000_7.l0).setEnabled(true);
        if (zBooleanValue) {
            ((C20743716Ff) awS61S0210000_7.l1).setChecked(awS61S0210000_7.z2);
        } else {
            ((C20743716Ff) awS61S0210000_7.l1).setChecked(!awS61S0210000_7.z2);
        }
        if (!awS61S0210000_7.z2) {
            C766270U4b.LIZLLL(2131850849);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS61S0210000_7 awS61S0210000_7, Object obj) {
        String strLJIILL;
        SparkContext sparkContext = (SparkContext) obj;
        final boolean z = awS61S0210000_7.z2;
        final DataChannel dataChannel = (DataChannel) awS61S0210000_7.l0;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0IZU
            @Override // X.AbstractC1537870q7d
            public final void onDestroy() {
                if (z) {
                    return;
                }
                dataChannel.zW(PaidRoomChannel.class, new C0IGV());
            }
        });
        Room room = (Room) awS61S0210000_7.l1;
        if (room != null) {
            try {
                LiveEventInfo liveEventInfo = room.liveEventInfo;
                if (liveEventInfo != null && (strLJIILL = C19748512Ol.LIZIZ.LJIILL(liveEventInfo)) != null) {
                    sparkContext.LJJLIIIJ(strLJIILL, "live_event_info");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0210000_7(FrameLayout frameLayout, C20743716Ff c20743716Ff, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = frameLayout;
        this.l1 = c20743716Ff;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0210000_7(Room room, DataChannel dataChannel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = dataChannel;
        this.l1 = room;
    }
}
