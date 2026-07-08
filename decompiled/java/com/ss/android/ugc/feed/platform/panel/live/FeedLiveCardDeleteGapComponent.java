package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C0J4Y;
import X.C0SR4;
import X.C1389300mG0;
import X.C13BV;
import X.C1564320qoI;
import X.C1564330qoJ;
import X.C1564360qoM;
import X.C1566140qrE;
import X.C1569210qwB;
import X.C1620830sHR;
import X.C2188811AlT;
import X.C299750Boz;
import X.C452501pT;
import X.C606500Nqa;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import X.InterfaceC606850Nr9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveCardDeleteGapComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedLiveCardDeleteGapComponent extends BasePanelComponent implements INotifyDataSetChangedAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLILZLL = 0;
    public int LL;
    public boolean LLILLJJLI = true;
    public final C01GW LLILLL;
    public final C630740Ooa LLILZ;
    public final C01GW LLILZIL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2089499660) {
            return null;
        }
        return this;
    }

    public FeedLiveCardDeleteGapComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1535), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 23));
        }
        this.LLILLL = c01gwLIZIZ;
        this.LLILZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 1537));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1536), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 24));
        }
        this.LLILZIL = c01gwLIZIZ2;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (C1564330qoJ.LIZIZ().clearData) {
            C1564360qoM.LIZ.getClass();
            C1564360qoM.LIZ();
        }
        C1564360qoM c1564360qoM = C1564360qoM.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page = ");
        sbLIZ.append(C1389300mG0.LIZ(getPanelContext()));
        c1564360qoM.LIZIZ("onParentViewCreated", C2188811AlT.LIZIZ(sbLIZ));
        DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LLILZIL.getValue();
        if (dataLayerAbility != null) {
            dataLayerAbility.pV(new InterfaceC606850Nr9() { // from class: X.0qoH
                @Override // X.InterfaceC606850Nr9
                public final void LIZ(List<? extends Aweme> list) {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJFF() {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJIIJ(List<? extends Aweme> list) {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJII(Map map) {
                    FeedLiveCardDeleteGapComponent feedLiveCardDeleteGapComponent = this.LIZ;
                    int i = FeedLiveCardDeleteGapComponent.LLILZLL;
                    feedLiveCardDeleteGapComponent.fo(null, null);
                }

                @Override // X.InterfaceC606850Nr9
                public final void LIZIZ(int i, String str, List list) {
                    if (Intrinsics.LJFF(str, "live_card_update_insert")) {
                        FeedLiveCardDeleteGapComponent feedLiveCardDeleteGapComponent = this.LIZ;
                        int i2 = FeedLiveCardDeleteGapComponent.LLILZLL;
                        feedLiveCardDeleteGapComponent.fo(null, str);
                    }
                }

                @Override // X.InterfaceC606850Nr9
                public final void LIZLLL(int i, Aweme aweme, String str) {
                    FeedLiveCardDeleteGapComponent feedLiveCardDeleteGapComponent = this.LIZ;
                    int i2 = FeedLiveCardDeleteGapComponent.LLILZLL;
                    feedLiveCardDeleteGapComponent.fo(null, str);
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJIIJJI(int i, int i2, String str, List list, List list2) {
                    FeedLiveCardDeleteGapComponent feedLiveCardDeleteGapComponent = this.LIZ;
                    int i3 = FeedLiveCardDeleteGapComponent.LLILZLL;
                    feedLiveCardDeleteGapComponent.fo(null, str);
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1620830sHR(this, 9));
        }
    }

    public final void bo(C1564320qoI c1564320qoI) {
        String aid;
        DataLayerAbility dataLayerAbility;
        C1564360qoM c1564360qoM = C1564360qoM.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markDelete: ");
        Aweme aweme = c1564320qoI.LIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(",   reason: ");
        sbLIZ.append(c1564320qoI.LIZIZ);
        sbLIZ.append(' ');
        c1564360qoM.LIZIZ("remove", C2188811AlT.LIZIZ(sbLIZ));
        Aweme aweme2 = c1564320qoI.LIZ;
        if (aweme2 != null && (dataLayerAbility = (DataLayerAbility) this.LLILZIL.getValue()) != null) {
            dataLayerAbility.wT(aweme2, new C606500Nqa("delete_live_min_gap", "live"));
        }
        C1569210qwB.LIZIZ(c1564320qoI, C1389300mG0.LIZ(getPanelContext()));
    }

    public final void fo(Integer num, String str) {
        List<Aweme> listFg;
        int i;
        int i2;
        int i3;
        C0SR4 c0sr4Zv0;
        if (C1564330qoJ.LIZIZ().enable && !Intrinsics.LJFF("delete_live_min_gap", str)) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILLL.getValue();
            if ((iFeedPanelPlatformAbility == null || (c0sr4Zv0 = iFeedPanelPlatformAbility.Zv0()) == null || (listFg = c0sr4Zv0.Fg()) == null) && (listFg = C13BV.INSTANCE) == null) {
                return;
            }
            if (C1564330qoJ.LIZ()) {
                i = 2;
            } else {
                i = 1;
            }
            ArrayList arrayList = new ArrayList();
            C1564360qoM.LIZ.getClass();
            int i4 = C1564360qoM.LJIIIZ;
            if (i4 > 0 && (i3 = C1564360qoM.LJIIIIZZ) > 0) {
                i2 = i4 - i3;
            } else {
                i2 = -1;
            }
            Long lValueOf = C1564360qoM.LJIIJ;
            if (i2 < 0) {
                i2 = i + 1;
            }
            int iIntValue = this.LL + 1;
            if (num != null && num.intValue() < iIntValue) {
                iIntValue = num.intValue();
            }
            while (iIntValue < listFg.size()) {
                Aweme aweme = (Aweme) ListProtector.get(listFg, iIntValue);
                if (aweme != null && AwemeSaaSExtKt.isLive(aweme)) {
                    Long lValueOf2 = null;
                    if (C1569210qwB.LIZ(aweme) && i2 < i) {
                        C1564360qoM c1564360qoM = C1564360qoM.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("filterLiveGapMin: remove gap0 curAweme=");
                        sbLIZ.append(aweme.getAid());
                        c1564360qoM.LIZIZ("remove", C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("data_modify_");
                        sbLIZ2.append(str);
                        arrayList.add(new C1564320qoI(aweme, C2188811AlT.LIZIZ(sbLIZ2), i2, lValueOf));
                        iIntValue++;
                        LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
                        if (liveRoomStructLJI != null) {
                            lValueOf = Long.valueOf(liveRoomStructLJI.id);
                        } else {
                            lValueOf = null;
                        }
                    } else {
                        LiveRoomStruct liveRoomStructLJI2 = C0J4Y.LJI(aweme);
                        if (liveRoomStructLJI2 != null) {
                            lValueOf2 = Long.valueOf(liveRoomStructLJI2.id);
                        }
                        i2 = 0;
                        lValueOf = lValueOf2;
                        iIntValue++;
                    }
                } else {
                    i2++;
                    iIntValue++;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bo((C1564320qoI) it2.next());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.live.INotifyDataSetChangedAbility
    public final void kJ(int i, String str) {
        fo(Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static int m338do(Aweme aweme, int i, List list, List list2, String str, int i2) {
        int i3;
        if (i >= 0 && i < list.size()) {
            Aweme aweme2 = (Aweme) ListProtector.get(list, i);
            i3 = i;
            while (true) {
                int i4 = 1;
                if (aweme2 == null || !AwemeSaaSExtKt.isLive(aweme2) || !C1569210qwB.LIZ(aweme2)) {
                    break;
                }
                LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
                Long lValueOf = null;
                if (liveRoomStructLJI != null) {
                    lValueOf = Long.valueOf(liveRoomStructLJI.id);
                }
                int i5 = i3 - i;
                i3++;
                if (i5 <= 0) {
                    i4 = i2;
                }
                ((ArrayList) list2).add(new C1564320qoI(aweme2, str, i4, lValueOf));
                if (i3 < 0 || i3 >= list.size()) {
                    break;
                }
                aweme = aweme2;
                aweme2 = (Aweme) ListProtector.get(list, i3);
            }
        } else {
            i3 = i;
        }
        return i3 - i;
    }
}
