package kotlin.jvm.internal;

import X.C09AY;
import X.C1210090hax;
import X.C1556460qbc;
import X.C1563970qnj;
import X.C1564050qnr;
import X.C21202017y6;
import X.C2188811AlT;
import X.C2341109Fh;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3SkylightBridgeAssem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS22S1110000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS22S1110000_24 awS22S1110000_24) {
        Long l;
        String str = awS22S1110000_24.s0;
        if (str != null) {
            boolean zContains = C1563970qnj.LJ.contains(str);
            C1556460qbc c1556460qbc = new C1556460qbc(awS22S1110000_24.s0, new WeakReference((C21202017y6) awS22S1110000_24.l1), zContains);
            ((ArrayList) C1563970qnj.LIZ).add(c1556460qbc);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jyq_debug ");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" registerListener, subScene:");
            sbLIZ.append(awS22S1110000_24.s0);
            sbLIZ.append(", syncLatestData:");
            sbLIZ.append(awS22S1110000_24.z2);
            sbLIZ.append(", preloadReady:");
            sbLIZ.append(c1556460qbc.LIZJ);
            sbLIZ.append(", latestData_popCardId:");
            C1564050qnr c1564050qnr = C1563970qnj.LIZIZ;
            if (c1564050qnr != null) {
                l = c1564050qnr.LIZJ;
            } else {
                l = null;
            }
            sbLIZ.append(l);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            if (awS22S1110000_24.z2 && c1556460qbc.LIZJ) {
                C1563970qnj.LJI((C21202017y6) awS22S1110000_24.l1, awS22S1110000_24.s0, "register_listener_sync_on_preloaded");
                C1563970qnj.LIZIZ(awS22S1110000_24.s0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S1110000_24 awS22S1110000_24) {
        ((FriendsV3SkylightBridgeAssem) awS22S1110000_24.l1).Jo(awS22S1110000_24.s0, !awS22S1110000_24.z2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1110000_24(C1210090hax c1210090hax, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1210090hax;
        this.z2 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1110000_24(FriendsV3SkylightBridgeAssem friendsV3SkylightBridgeAssem, boolean z, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = friendsV3SkylightBridgeAssem;
        this.z2 = z;
        this.s0 = str;
    }
}
