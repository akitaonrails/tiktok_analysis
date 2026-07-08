package kotlin.jvm.internal;

import X.AbstractC1569120qw2;
import X.C09AY;
import X.C105300aZ;
import X.C1569010qvr;
import X.C1569070qvx;
import X.C1601400rm6;
import X.C20673215v0;
import X.C2188811AlT;
import X.C23250099c;
import X.C289000BUk;
import X.C293570Bf1;
import X.C606130Npz;
import X.C606150Nq1;
import X.C606500Nqa;
import X.C606600Nqk;
import X.InterfaceC497601wk;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.interest.card.InterestCardPanelComponent;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS162S0101000_24 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS162S0101000_24 awS162S0101000_24) {
        boolean z;
        Map<AbstractC1569120qw2, Integer> map = C1569070qvx.LJIIIIZZ;
        Integer num = (Integer) ((LinkedHashMap) map).get((AbstractC1569120qw2) awS162S0101000_24.l0);
        if (num != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        map.put((AbstractC1569120qw2) awS162S0101000_24.l0, Integer.valueOf(awS162S0101000_24.i1));
        int i = awS162S0101000_24.i1;
        if (i != 0) {
            if (i == 1) {
                C1569070qvx.LJII.put((AbstractC1569120qw2) awS162S0101000_24.l0, Boolean.TRUE);
            }
        } else if (z) {
            C1569070qvx c1569070qvx = C1569070qvx.LIZ;
            AbstractC1569120qw2 abstractC1569120qw2 = (AbstractC1569120qw2) awS162S0101000_24.l0;
            c1569070qvx.getClass();
            if (((Boolean) C105300aZ.LIZ.getValue()).booleanValue()) {
                C23250099c.LIZLLL((InterfaceC497601wk) C1569070qvx.LIZIZ.getValue(), null, null, new C1569010qvr(abstractC1569120qw2, null), 3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS162S0101000_24 awS162S0101000_24) {
        if (C289000BUk.LIZ() && !LandscapeFeedMonitorImpl.LJIIJJI) {
            HashMap<Integer, Pair<Long, Map<String, String>>> map = LandscapeFeedMonitorImpl.LJIIIIZZ;
            if (!map.containsKey(Integer.valueOf(awS162S0101000_24.i1))) {
                map.put(Integer.valueOf(awS162S0101000_24.i1), new Pair<>(Long.valueOf(System.currentTimeMillis()), (Map) awS162S0101000_24.l0));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS162S0101000_24 r6) {
        /*
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner r5 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LL
            X.19EG r0 = r5.LIZIZ()
            r2 = 0
            if (r0 == 0) goto L77
            X.0Q7z r0 = X.C1558360qeg.LJI(r0, r2)
            com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility r4 = X.C1583510rJF.LIZLLL(r0)
        L11:
            r3 = 1
            if (r4 == 0) goto L36
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol r0 = (com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol) r0
            java.lang.String r0 = r0.LLIZ
            X.0rLB r0 = r4.Kx(r0)
            if (r0 == 0) goto L2b
            int r1 = r6.i1
            int r0 = r0.getDotCount()
            if (r1 != r0) goto L2b
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            int r1 = r6.i1
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol r0 = (com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol) r0
            java.lang.String r0 = r0.LLIZ
            r4.do0(r1, r0)
        L36:
            int r0 = r6.i1
            if (r0 == 0) goto L28
            X.19EG r0 = r5.LIZIZ()
            if (r0 == 0) goto L28
            X.0Q7z r0 = X.C1558360qeg.LJI(r0, r2)
            com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility r0 = X.C1583510rJF.LJIIIZ(r0)
            if (r0 == 0) goto L28
            boolean r0 = r0.hv0()
            if (r0 != r3) goto L28
            if (r4 == 0) goto L56
            java.lang.String r2 = r4.nk0()
        L56:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol r0 = (com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol) r0
            java.lang.String r0 = r0.LLIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L28
            X.0rP9 r1 = X.C1587170rP9.LIZ
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol r0 = (com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol) r0
            java.lang.String r3 = r0.LLIZ
            int r2 = r6.i1
            r1.getClass()
            java.lang.String r1 = "show"
            java.lang.String r0 = "number_dot"
            X.C1587170rP9.LJIILJJIL(r2, r3, r1, r0)
            goto L28
        L77:
            r4 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS162S0101000_24.invoke$2(kotlin.jvm.internal.AwS162S0101000_24):java.lang.Object");
    }

    public static final Object invoke$3(AwS162S0101000_24 awS162S0101000_24) {
        return C20673215v0.LIZJ(awS162S0101000_24.i1, (Activity) awS162S0101000_24.l0);
    }

    public static final Object invoke$4(AwS162S0101000_24 awS162S0101000_24) {
        Integer numValueOf;
        C606600Nqk c606600NqkGm2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataLayerAbility?.size: ");
        DataLayerAbility dataLayerAbility = (DataLayerAbility) ((InterestCardPanelComponent) awS162S0101000_24.l0).LL.getValue();
        Integer numValueOf2 = null;
        if (dataLayerAbility != null) {
            numValueOf = Integer.valueOf(dataLayerAbility.Q0());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        ((InterestCardPanelComponent) awS162S0101000_24.l0).getClass();
        Aweme aweme = new Aweme();
        aweme.setAid("id_interests_reselection_card");
        aweme.setGroupId("id_interests_reselection_card");
        aweme.setAwemeType(601);
        aweme.setCardInsertInfo(new CardInsertInfo(0, 0L, "", 3, 0, null, "id_interests_reselection_card"));
        DataLayerAbility dataLayerAbility2 = (DataLayerAbility) ((InterestCardPanelComponent) awS162S0101000_24.l0).LL.getValue();
        if (dataLayerAbility2 != null) {
            int i = awS162S0101000_24.i1;
            C606150Nq1 c606150Nq1 = C606500Nqa.LIZLLL;
            c606600NqkGm2 = dataLayerAbility2.Gm2(aweme, i, C606130Npz.LIZ("id_interests_reselection_card"));
        } else {
            c606600NqkGm2 = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("insertResult: ");
        if (c606600NqkGm2 != null) {
            numValueOf2 = Integer.valueOf(c606600NqkGm2.LIZJ);
        }
        sbLIZ2.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS162S0101000_24 awS162S0101000_24) {
        return ((NonPersonalizedAssem) awS162S0101000_24.l0).yp(awS162S0101000_24.i1);
    }

    public static final Object invoke$6(AwS162S0101000_24 awS162S0101000_24) {
        if (C293570Bf1.LIZ()) {
            ((C1601400rm6) awS162S0101000_24.l0).LIZIZ(awS162S0101000_24.i1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0101000_24(int i, FriendsFeedProtocol friendsFeedProtocol, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = friendsFeedProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS162S0101000_24(int i, int i2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0101000_24(AbstractC1569120qw2 abstractC1569120qw2, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractC1569120qw2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0101000_24(C1601400rm6 c1601400rm6, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1601400rm6;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0101000_24(Activity activity, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = activity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0101000_24(InterestCardPanelComponent interestCardPanelComponent, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interestCardPanelComponent;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S0101000_24(NonPersonalizedAssem nonPersonalizedAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = nonPersonalizedAssem;
        this.i1 = i;
    }
}
