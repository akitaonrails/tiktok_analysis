package kotlin.jvm.internal;

import X.C09AY;
import X.C1592080rX4;
import X.C1592520rXm;
import X.C1592730rY7;
import X.C291001Au;
import X.EnumC1571190qzN;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS15S0211000_24 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
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

    public static final Object invoke$0(AwS15S0211000_24 awS15S0211000_24, Object obj) {
        int iEQ2;
        InboxSkylightListState inboxSkylightListState = (InboxSkylightListState) obj;
        Aweme aweme = (Aweme) awS15S0211000_24.l0;
        if (aweme != null) {
            try {
                iEQ2 = ((SkylightListViewModel) awS15S0211000_24.l1).EQ2(awS15S0211000_24.i3, aweme);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iEQ2 = -1;
            }
        } else {
            iEQ2 = awS15S0211000_24.i3;
        }
        return inboxSkylightListState.copy(inboxSkylightListState.listState, inboxSkylightListState.selectedCellPosition, new C291001Au<>(new Pair(Integer.valueOf(iEQ2), Boolean.valueOf(awS15S0211000_24.z2))), inboxSkylightListState.itemDeleteEvent, inboxSkylightListState.onResumeNotRefreshingEvent, inboxSkylightListState.isListEmpty, inboxSkylightListState.rerankState);
    }

    public static final Object invoke$1(AwS15S0211000_24 awS15S0211000_24, Object obj) {
        TextView customTextView = ((C1592080rX4) obj).getCustomTextView();
        if (customTextView != null) {
            boolean z = awS15S0211000_24.z2;
            EnumC1571190qzN enumC1571190qzN = (EnumC1571190qzN) awS15S0211000_24.l0;
            C1592080rX4 c1592080rX4 = (C1592080rX4) awS15S0211000_24.l1;
            int i = awS15S0211000_24.i3;
            if (z && enumC1571190qzN == EnumC1571190qzN.DARK) {
                C1592520rXm.LIZ(customTextView, !Intrinsics.LJFF(r6, c1592080rX4));
            } else {
                customTextView.setShadowLayer(C1592730rY7.LIZ(), 0.0f, C1592730rY7.LIZIZ(), i);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0211000_24(Aweme aweme, int i, boolean z, SkylightListViewModel skylightListViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i3 = i;
        this.z2 = z;
        this.l1 = skylightListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0211000_24(boolean z, EnumC1571190qzN enumC1571190qzN, C1592080rX4 c1592080rX4, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z2 = z;
        this.l0 = enumC1571190qzN;
        this.l1 = c1592080rX4;
        this.i3 = i;
    }
}
