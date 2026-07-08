package kotlin.jvm.internal;

import X.C09AY;
import X.C0CNO;
import X.C20684815ws;
import X.C2344009Gk;
import X.C631370Opb;
import X.C688460QzU;
import X.EnumC688550Qzd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTriggerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public class AwS153S0110000_10 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0110000_10(boolean z, FeedSearchBottomBarAssemTrigger feedSearchBottomBarAssemTrigger, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = feedSearchBottomBarAssemTrigger;
    }

    public static final Object invoke$0(AwS153S0110000_10 awS153S0110000_10, Object obj, Object obj2) {
        String str = (String) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) obj2;
        if (!awS153S0110000_10.z1) {
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
            C0CNO.LIZLLL(0L, new AwS554S0100000_10((FeedSearchBottomBarAssemTrigger) awS153S0110000_10.l0, 918));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS153S0110000_10 awS153S0110000_10, Object obj, Object obj2) {
        boolean z;
        String str = (String) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) obj2;
        if (!awS153S0110000_10.z1) {
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
            FeedSearchBottomBarAssemTriggerV2 feedSearchBottomBarAssemTriggerV2 = (FeedSearchBottomBarAssemTriggerV2) awS153S0110000_10.l0;
            EnumC688550Qzd enumC688550Qzd = EnumC688550Qzd.SAME_AS_FCP;
            int i = FeedSearchBottomBarAssemTriggerV2.LLJLIL;
            if (C688460QzU.LIZIZ(0, (VideoItemParams) C631370Opb.LIZ(feedSearchBottomBarAssemTriggerV2)).LIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            feedSearchBottomBarAssemTriggerV2.yp(enumC688550Qzd, z, 0);
            ((FeedSearchBottomBarAssemTriggerV2) awS153S0110000_10.l0).zp();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S0110000_10(boolean z, FeedSearchBottomBarAssemTriggerV2 feedSearchBottomBarAssemTriggerV2, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = feedSearchBottomBarAssemTriggerV2;
    }
}
