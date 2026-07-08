package kotlin.jvm.internal;

import X.C09AY;
import X.C1393190mMH;
import X.C1573110r2T;
import X.C1587170rP9;
import X.C1595530rcd;
import X.C1595550rcf;
import X.C1614710s7Z;
import X.EnumC1392960mLu;
import X.EnumC1614730s7b;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS26S1400000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS26S1400000_24 awS26S1400000_24, Object obj) {
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = (SkylightCellLongClickAbilityImpl) awS26S1400000_24.l1;
        Map map = (Map) awS26S1400000_24.l2;
        String str = awS26S1400000_24.s0;
        skylightCellLongClickAbilityImpl.getClass();
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393190mMH c1393190mMHLJI = SkylightCellLongClickAbilityImpl.LJI(str, map);
        c1587170rP9.getClass();
        C1587170rP9.LJIIJ("click_mute_stories", c1393190mMHLJI);
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl2 = (SkylightCellLongClickAbilityImpl) awS26S1400000_24.l1;
        Context context = (Context) awS26S1400000_24.l3;
        User user = (User) awS26S1400000_24.l4;
        EnumC1392960mLu enumC1392960mLu = EnumC1392960mLu.STORIES;
        Map map2 = (Map) awS26S1400000_24.l2;
        String str2 = awS26S1400000_24.s0;
        skylightCellLongClickAbilityImpl2.getClass();
        SkylightCellLongClickAbilityImpl.LIZLLL(context, user, enumC1392960mLu, map2, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S1400000_24 awS26S1400000_24, Object obj) {
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = (SkylightCellLongClickAbilityImpl) awS26S1400000_24.l1;
        Map map = (Map) awS26S1400000_24.l2;
        String str = awS26S1400000_24.s0;
        skylightCellLongClickAbilityImpl.getClass();
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393190mMH c1393190mMHLJI = SkylightCellLongClickAbilityImpl.LJI(str, map);
        c1587170rP9.getClass();
        C1587170rP9.LJIIJ("click_mute_lives", c1393190mMHLJI);
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl2 = (SkylightCellLongClickAbilityImpl) awS26S1400000_24.l1;
        Context context = (Context) awS26S1400000_24.l3;
        User user = (User) awS26S1400000_24.l4;
        EnumC1392960mLu enumC1392960mLu = EnumC1392960mLu.LIVES;
        Map map2 = (Map) awS26S1400000_24.l2;
        String str2 = awS26S1400000_24.s0;
        skylightCellLongClickAbilityImpl2.getClass();
        SkylightCellLongClickAbilityImpl.LIZLLL(context, user, enumC1392960mLu, map2, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS26S1400000_24 awS26S1400000_24, Object obj) {
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = (SkylightCellLongClickAbilityImpl) awS26S1400000_24.l1;
        Map map = (Map) awS26S1400000_24.l2;
        String str = awS26S1400000_24.s0;
        skylightCellLongClickAbilityImpl.getClass();
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393190mMH c1393190mMHLJI = SkylightCellLongClickAbilityImpl.LJI(str, map);
        c1587170rP9.getClass();
        C1587170rP9.LJIIJ("click_mute_all", c1393190mMHLJI);
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl2 = (SkylightCellLongClickAbilityImpl) awS26S1400000_24.l1;
        Context context = (Context) awS26S1400000_24.l3;
        User user = (User) awS26S1400000_24.l4;
        EnumC1392960mLu enumC1392960mLu = EnumC1392960mLu.ALL;
        Map map2 = (Map) awS26S1400000_24.l2;
        String str2 = awS26S1400000_24.s0;
        skylightCellLongClickAbilityImpl2.getClass();
        SkylightCellLongClickAbilityImpl.LIZLLL(context, user, enumC1392960mLu, map2, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS26S1400000_24 awS26S1400000_24, Object obj) {
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = (VipSubscriptionDetailResponse) awS26S1400000_24.l1;
        return C1614710s7Z.LIZ((C1614710s7Z) obj, null, vipSubscriptionDetailResponse, (EnumC1614730s7b) awS26S1400000_24.l2, awS26S1400000_24.s0, false, null, false, false, null, null, null, null, (List) awS26S1400000_24.l3, SeriesVipSubscriptionViewModel.zQ2((SeriesVipSubscriptionViewModel) awS26S1400000_24.l4, vipSubscriptionDetailResponse), null, true, null, null, 446449);
    }

    public static final Object invoke$4(AwS26S1400000_24 awS26S1400000_24, Object obj) {
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = (VipSubscriptionDetailResponse) awS26S1400000_24.l1;
        return C1614710s7Z.LIZ((C1614710s7Z) obj, null, vipSubscriptionDetailResponse, (EnumC1614730s7b) awS26S1400000_24.l2, awS26S1400000_24.s0, false, null, false, false, null, null, null, null, (List) awS26S1400000_24.l3, SeriesVipSubscriptionViewModel.zQ2((SeriesVipSubscriptionViewModel) awS26S1400000_24.l4, vipSubscriptionDetailResponse), null, false, null, null, 446449);
    }

    public static final Object invoke$5(AwS26S1400000_24 awS26S1400000_24, Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        C1595530rcd c1595530rcdLIZ = C1595530rcd.LIZ((C1595530rcd) obj, null, awS26S1400000_24.s0, false, false, false, 0, 0, (Bitmap) awS26S1400000_24.l1, (C1595550rcf) awS26S1400000_24.l2, 0, null, 3709);
        C1595550rcf c1595550rcf = (C1595550rcf) awS26S1400000_24.l2;
        StoryToolBarIconViewModel storyToolBarIconViewModel = (StoryToolBarIconViewModel) awS26S1400000_24.l3;
        String str = awS26S1400000_24.s0;
        C1595550rcf c1595550rcf2 = (C1595550rcf) awS26S1400000_24.l4;
        if (c1595550rcf.LIZ(2) && Intrinsics.LJFF(storyToolBarIconViewModel.LLILLJJLI.get(str), Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        if (c1595550rcf2 != null && Integer.valueOf(c1595550rcf2.LJIIIIZZ) != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(!c1595550rcf.LIZIZ(c1595550rcf2));
        if (!z || z2) {
            z3 = true;
        }
        storyToolBarIconViewModel.getClass();
        storyToolBarIconViewModel.setState(new AwS41S0310000_24(storyToolBarIconViewModel, c1595530rcdLIZ, boolValueOf, z3, 1));
        return c1595530rcdLIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S1400000_24(VipSubscriptionDetailResponse vipSubscriptionDetailResponse, VipSubscriptionDetailResponse vipSubscriptionDetailResponse2, EnumC1614730s7b enumC1614730s7b, String str, List<C1573110r2T> list, SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel) {
        super(1);
        this.$t = seriesVipSubscriptionViewModel;
        this.l1 = vipSubscriptionDetailResponse;
        this.l2 = vipSubscriptionDetailResponse2;
        this.s0 = enumC1614730s7b;
        this.l3 = str;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S1400000_24(SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl, SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl2, Map<String, String> map, String str, Context context, User user) {
        super(1);
        this.$t = user;
        this.l1 = skylightCellLongClickAbilityImpl;
        this.l2 = skylightCellLongClickAbilityImpl2;
        this.s0 = map;
        this.l3 = str;
        this.l4 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S1400000_24(String str, Bitmap bitmap, C1595550rcf c1595550rcf, StoryToolBarIconViewModel storyToolBarIconViewModel, C1595550rcf c1595550rcf2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = bitmap;
        this.l2 = c1595550rcf;
        this.l3 = storyToolBarIconViewModel;
        this.l4 = c1595550rcf2;
    }
}
