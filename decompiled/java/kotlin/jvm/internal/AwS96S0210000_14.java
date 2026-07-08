package kotlin.jvm.internal;

import X.C09AY;
import X.C1459970o5z;
import X.C895240ZAc;
import X.C895440ZAw;
import Y.ARunnableS15S0210000_14;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.widget.multi.ArchiveEntranceViewModel;
import kotlin.jvm.functions.Function0;
import oyl.d0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS96S0210000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AwS96S0210000_14 awS96S0210000_14) {
        C1459970o5z c1459970o5z = (C1459970o5z) awS96S0210000_14.l0;
        d0 d0Var = c1459970o5z.LLJJI;
        if (d0Var == null) {
            d0Var = null;
        }
        return Boolean.valueOf(HandlerHook.viewPostDelay(d0Var, new ARunnableS15S0210000_14(c1459970o5z, (Function0) awS96S0210000_14.l1, awS96S0210000_14.z2, 0), 300L));
    }

    public static final Object invoke$1(AwS96S0210000_14 awS96S0210000_14) {
        String str;
        C895440ZAw c895440ZAw = (C895440ZAw) awS96S0210000_14.l0;
        C895240ZAc c895240ZAc = (C895240ZAc) awS96S0210000_14.l1;
        boolean z = awS96S0210000_14.z2;
        if (c895440ZAw.LLJJJJ != null) {
            if (z) {
                str = "unpin";
            } else {
                str = "pin";
            }
            ArchiveEntranceViewModel.vQ2("click", str, c895240ZAc, Integer.valueOf(c895440ZAw.getLayoutPosition() - 1));
        }
        if (z) {
            ArchiveEntranceViewModel archiveEntranceViewModel = c895440ZAw.LLJJJJ;
            if (archiveEntranceViewModel != null) {
                archiveEntranceViewModel.wQ2(c895240ZAc, 0, "entrance_long_press_action");
            }
        } else {
            ArchiveEntranceViewModel archiveEntranceViewModel2 = c895440ZAw.LLJJJJ;
            if (archiveEntranceViewModel2 != null) {
                archiveEntranceViewModel2.wQ2(c895240ZAc, 50, "entrance_long_press_action");
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0210000_14(C895440ZAw c895440ZAw, C895240ZAc c895240ZAc, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c895440ZAw;
        this.l1 = c895240ZAc;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0210000_14(C1459970o5z c1459970o5z, Function0 function0, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1459970o5z;
        this.z2 = z;
        this.l1 = function0;
    }
}
