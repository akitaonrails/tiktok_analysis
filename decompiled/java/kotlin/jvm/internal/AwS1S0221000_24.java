package kotlin.jvm.internal;

import X.C09AY;
import X.C1573030r2L;
import X.C291001Au;
import X.C443120HZe;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS1S0221000_24 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public boolean z2;
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

    public static final Object invoke$0(AwS1S0221000_24 awS1S0221000_24, Object obj) {
        int iEQ2;
        SkylightFollowingUserItem skylightFollowingUserItem;
        SkylightFollowingUserRedDot skylightFollowingUserRedDot;
        C1573030r2L c1573030r2L = (C1573030r2L) obj;
        Aweme aweme = (Aweme) awS1S0221000_24.l0;
        if (aweme != null) {
            try {
                iEQ2 = ((FeedSkylightListViewModel) awS1S0221000_24.l1).EQ2(awS1S0221000_24.i4, aweme);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iEQ2 = -1;
            }
        } else {
            iEQ2 = awS1S0221000_24.i4;
        }
        List<ITEM> listListGetAll = ((FeedSkylightListViewModel) awS1S0221000_24.l1).listGetAll();
        if (listListGetAll != 0 && iEQ2 >= 0 && iEQ2 < listListGetAll.size()) {
            Object obj2 = ListProtector.get(listListGetAll, iEQ2);
            if ((obj2 instanceof SkylightFollowingUserItem) && (skylightFollowingUserItem = (SkylightFollowingUserItem) obj2) != null && (skylightFollowingUserRedDot = skylightFollowingUserItem.redDot) != null) {
                skylightFollowingUserRedDot.setStatus(0);
            }
        }
        return C1573030r2L.LIZ(c1573030r2L, null, new C291001Au(new C443120HZe(Integer.valueOf(iEQ2), Boolean.valueOf(awS1S0221000_24.z2), Boolean.valueOf(awS1S0221000_24.z3))), null, null, null, null, null, 509);
    }

    public static final Object invoke$1(AwS1S0221000_24 awS1S0221000_24, Object obj) {
        int iEQ2;
        InboxSkylightListState inboxSkylightListState = (InboxSkylightListState) obj;
        Aweme aweme = (Aweme) awS1S0221000_24.l0;
        if (aweme != null) {
            try {
                iEQ2 = ((SkylightListViewModel) awS1S0221000_24.l1).EQ2(awS1S0221000_24.i4, aweme);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iEQ2 = -1;
            }
        } else {
            iEQ2 = awS1S0221000_24.i4;
        }
        return inboxSkylightListState.copy(inboxSkylightListState.listState, new C291001Au<>(new C443120HZe(Integer.valueOf(iEQ2), Boolean.valueOf(awS1S0221000_24.z2), Boolean.valueOf(awS1S0221000_24.z3))), inboxSkylightListState.lifecycleFreeScrollPosition, inboxSkylightListState.itemDeleteEvent, inboxSkylightListState.onResumeNotRefreshingEvent, inboxSkylightListState.isListEmpty, inboxSkylightListState.rerankState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0221000_24(Aweme aweme, int i, FeedSkylightListViewModel feedSkylightListViewModel, boolean z, boolean z2, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i4 = i;
        this.l1 = feedSkylightListViewModel;
        this.z2 = z;
        this.z3 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0221000_24(Aweme aweme, int i, boolean z, boolean z2, SkylightListViewModel skylightListViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i4 = i;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = skylightListViewModel;
    }
}
