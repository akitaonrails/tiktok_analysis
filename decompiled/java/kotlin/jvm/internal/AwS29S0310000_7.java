package kotlin.jvm.internal;

import X.C09AY;
import X.C0IJT;
import X.C20441214yg;
import X.C474500IjA;
import X.C498770JhD;
import X.InterfaceC1103130eoR;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import qo2.w;
import webcast.api.room.StrategyData;

/* JADX INFO: loaded from: classes8.dex */
public class AwS29S0310000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS29S0310000_7 awS29S0310000_7, Object obj) {
        ((C498770JhD) awS29S0310000_7.l0).LJI((InterfaceC1103130eoR) awS29S0310000_7.l1, (DataChannel) awS29S0310000_7.l2, awS29S0310000_7.z3, (StrategyData) obj, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S0310000_7 awS29S0310000_7, Object obj) {
        StrategyData strategyData = (StrategyData) obj;
        C498770JhD c498770JhD = (C498770JhD) awS29S0310000_7.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) awS29S0310000_7.l1;
        DataChannel dataChannel = (DataChannel) awS29S0310000_7.l2;
        boolean z = awS29S0310000_7.z3;
        Function0<Unit> function0 = c498770JhD.LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
        c498770JhD.LLILLL = true;
        c498770JhD.LLILZ = System.currentTimeMillis();
        int i = c498770JhD.LIZIZ().getInt("repost_bubble_show_count", 0);
        c498770JhD.LIZLLL();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_repost_guide_bubble_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LIZ();
        if (Intrinsics.LJFF("replace_share_button", strategyData.actionType) || (Intrinsics.LJFF("replace_share_button_with_edu_bubble", strategyData.actionType) && i > 0)) {
            C20441214yg.LIZIZ("LiveRepostManager", "repost switch icon guide shouldn't have tooltips");
        } else {
            c498770JhD.LJI(interfaceC1103130eoR, dataChannel, z, strategyData, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0310000_7(C498770JhD c498770JhD, InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c498770JhD;
        this.l1 = interfaceC1103130eoR;
        this.l2 = dataChannel;
        this.z3 = z;
    }
}
