package kotlin.jvm.internal;

import X.AbstractC948140amS;
import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C942270acz;
import X.C948110amP;
import X.C948300ami;
import X.C975960bVK;
import X.C976040bVS;
import X.EnumC964170bCJ;
import X.InterfaceC975520bUc;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS155S1200000_15 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS155S1200000_15 awS155S1200000_15, Object obj, Object obj2) {
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) awS155S1200000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onApplySharedBg, download image ");
        sbLIZ.append(awS155S1200000_15.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((LiveEffect) awS155S1200000_15.l2).LLJLLIL());
        sbLIZ.append(" fail");
        multiGuestSharedBgGuestViewModel.yQ2(C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(((MultiGuestSharedBgGuestViewModel) awS155S1200000_15.l1).LLILZ, awS155S1200000_15.s0)) {
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel2 = (MultiGuestSharedBgGuestViewModel) awS155S1200000_15.l1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onApplySharedBg, sharedBgStickerId = ");
            sbLIZ2.append(awS155S1200000_15.s0);
            sbLIZ2.append(" imageFilePath = ");
            sbLIZ2.append(((LiveEffect) awS155S1200000_15.l2).LLJLLIL());
            multiGuestSharedBgGuestViewModel2.yQ2(C2188811AlT.LIZIZ(sbLIZ2));
            ((MultiGuestSharedBgGuestViewModel) awS155S1200000_15.l1).setState(AFwS250S0000000_15.get$arr$(71));
            ((MultiGuestSharedBgGuestViewModel) awS155S1200000_15.l1).LLILZ = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS155S1200000_15 awS155S1200000_15, Object obj, Object obj2) {
        long jLongValue = ((Number) obj2).longValue();
        C20441214yg.LIZIZ(awS155S1200000_15.s0, "handling Info Result");
        InterfaceC975520bUc interfaceC975520bUc = ((C976040bVS) awS155S1200000_15.l1).LIZIZ;
        if (interfaceC975520bUc != null) {
            String str = awS155S1200000_15.s0;
            Function2 function2 = (Function2) awS155S1200000_15.l2;
            C975960bVK c975960bVKM3 = interfaceC975520bUc.m3();
            if (c975960bVKM3 != null && !c975960bVKM3.LIZIZ) {
                C20441214yg.LJ(str, "not anchor");
            } else if (interfaceC975520bUc.Y2().compareTo(EnumC964170bCJ.MATCH_START) < 0) {
                C20441214yg.LIZIZ(str, "ACTION_OPEN with battle/info API");
                function2.invoke(obj, Long.valueOf(jLongValue));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS155S1200000_15 awS155S1200000_15, Object obj, Object obj2) {
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        C942270acz.LIZIZ(((C948300ami) awS155S1200000_15.l1).LIZLLL, iIntValue, "click", "change", awS155S1200000_15.s0);
        ((Function1) awS155S1200000_15.l2).invoke(new C948110amP(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S1200000_15(C948300ami c948300ami, C948300ami c948300ami2, String str, Function1<? super AbstractC948140amS, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l1 = c948300ami;
        this.s0 = c948300ami2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S1200000_15(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, LiveEffect liveEffect, int i) {
        super(2);
        this.$t = i;
        this.l1 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
        this.l2 = liveEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS155S1200000_15(String str, String str2, C976040bVS<COORDINATOR> c976040bVS, Function2<? super BattleInfoResponse, ? super Long, Unit> function2) {
        super(2);
        this.$t = function2;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c976040bVS;
    }
}
