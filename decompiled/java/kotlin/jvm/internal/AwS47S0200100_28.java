package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C1897460zTc;
import X.C1897590zTp;
import X.C1897600zTq;
import X.C2188811AlT;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemTriggerV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS47S0200100_28 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS47S0200100_28 awS47S0200100_28) {
        int iIntValue;
        C1897590zTp c1897590zTp = (C1897590zTp) awS47S0200100_28.l0;
        List list = (List) awS47S0200100_28.l1;
        c1897590zTp.getClass();
        String strLIZ = C1897590zTp.LIZ(list);
        ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - awS47S0200100_28.j2;
            C01GW<C1897600zTq> c01gw = C1897600zTq.LJII;
            Integer num = C1897460zTc.LIZ().LJFF;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            iTouchPointModuleService.LJJIIZI(1, iIntValue, C1897460zTc.LIZ().LJ, C1897460zTc.LIZ().LJI.LLILLL, jCurrentTimeMillis, strLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS47S0200100_28 awS47S0200100_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkUpdateContent ");
        sbLIZ.append((GameLiveBottomBarAssemTriggerV2) awS47S0200100_28.l0);
        sbLIZ.append(" , currentTime ");
        sbLIZ.append(awS47S0200100_28.j2);
        sbLIZ.append(" , dataTime ");
        sbLIZ.append(((RelatedLiveTagStruct) awS47S0200100_28.l1).updateTime);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS47S0200100_28) (LINE:67108864) kotlin.jvm.internal.AwS47S0200100_28.$t int, block:B:2:0x0000 */
    public AwS47S0200100_28(C1897590zTp c1897590zTp, C1897590zTp c1897590zTp2, List<TouchPoint> list, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = c1897590zTp;
        this.l1 = c1897590zTp2;
        this.j2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0200100_28(GameLiveBottomBarAssemTriggerV2 gameLiveBottomBarAssemTriggerV2, long j, RelatedLiveTagStruct relatedLiveTagStruct, int i) {
        super(0);
        this.$t = i;
        this.l0 = gameLiveBottomBarAssemTriggerV2;
        this.j2 = j;
        this.l1 = relatedLiveTagStruct;
    }
}
