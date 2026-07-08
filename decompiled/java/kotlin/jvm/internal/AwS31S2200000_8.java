package kotlin.jvm.internal;

import X.C09AY;
import X.C0M0P;
import X.C567820MOu;
import X.InterfaceC562000M2k;
import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS31S2200000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS31S2200000_8 awS31S2200000_8) {
        boolean z;
        InterfaceC562000M2k interfaceC562000M2kT5 = ((DraftBoxNormalItemViewHolder) awS31S2200000_8.l2).T5();
        if (interfaceC562000M2kT5 != null) {
            ((DraftBoxNormalItemViewHolder) awS31S2200000_8.l2).f6();
            Context context = ((DraftBoxNormalItemViewHolder) awS31S2200000_8.l2).f6().getContext();
            C0M0P c0m0p = (C0M0P) awS31S2200000_8.l3;
            String str = c0m0p.LJ;
            String str2 = awS31S2200000_8.s0;
            String str3 = awS31S2200000_8.s1;
            String str4 = c0m0p.LJIL;
            if (c0m0p.LJII.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC562000M2kT5.qR(context, str, str2, str3, str4, true, z);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS31S2200000_8 r11) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS31S2200000_8.invoke$1(kotlin.jvm.internal.AwS31S2200000_8):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS31S2200000_8(C567820MOu c567820MOu, C567820MOu c567820MOu2, String str, String str2, Pair<Integer, Integer> pair) {
        super(0);
        this.$t = pair;
        this.l2 = c567820MOu;
        this.s0 = c567820MOu2;
        this.s1 = str;
        this.l3 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S2200000_8(DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder, C0M0P c0m0p, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = draftBoxNormalItemViewHolder;
        this.l3 = c0m0p;
        this.s0 = str;
        this.s1 = str2;
    }
}
