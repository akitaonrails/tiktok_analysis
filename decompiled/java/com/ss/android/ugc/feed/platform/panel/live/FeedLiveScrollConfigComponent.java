package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C0OHK;
import X.C0OHO;
import X.C0RUJ;
import X.C1566140qrE;
import X.C2327809Ae;
import X.C299750Boz;
import X.C452501pT;
import X.C607450Ns7;
import X.C607460Ns8;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedLiveScrollConfigComponent extends BasePanelUIComponent implements C0RUJ {
    public static String LLJJ = "For You";
    public static boolean LLJJI;
    public final C01GW LLJIJIL;
    public final C630740Ooa LLJILJIL;
    public C0OHK LLJILJILJ;
    public VerticalViewPager LLJILLL;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "live_scroll_config_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    public final void Go() {
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        Double dLJII;
        Double dLJII2;
        String str2;
        Double dLJII3;
        int iDoubleValue;
        String str3;
        Double dLJII4;
        int iDoubleValue2;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJILJIL.getValue();
        Integer numValueOf3 = null;
        Aweme awemeLJIIIIZZ = iViewPagerComponentAbility != null ? iViewPagerComponentAbility.LJIIIIZZ() : null;
        if (awemeLJIIIIZZ == null || awemeLJIIIIZZ.getAwemeType() != 101) {
            VerticalViewPager verticalViewPager = this.LLJILLL;
            if (verticalViewPager != null) {
                verticalViewPager.LLLIL = verticalViewPager.LLLILZ;
                verticalViewPager.LLLLLLZ = false;
                return;
            }
            return;
        }
        List<LiveRoomStatesTag> liveExtraInfoStruct = awemeLJIIIIZZ.getLiveExtraInfoStruct();
        if (liveExtraInfoStruct != null) {
            numValueOf = null;
            numValueOf2 = null;
            for (LiveRoomStatesTag liveRoomStatesTag : liveExtraInfoStruct) {
                String str4 = liveRoomStatesTag.tagKey;
                if (str4 != null) {
                    int iHashCode = str4.hashCode();
                    if (iHashCode != -2102332403) {
                        if (iHashCode != 609942086) {
                            if (iHashCode == 1864907075 && str4.equals("live_exp_minimum_velocity") && (str = liveRoomStatesTag.tagValue) != null && (dLJII = C2327809Ae.LJII(str)) != null && ((int) dLJII.doubleValue()) > 0) {
                                String str5 = liveRoomStatesTag.tagValue;
                                numValueOf = (str5 == null || (dLJII2 = C2327809Ae.LJII(str5)) == null) ? -1 : Integer.valueOf((int) dLJII2.doubleValue());
                            }
                        } else if (str4.equals("live_touchSlop") && (str2 = liveRoomStatesTag.tagValue) != null && (dLJII3 = C2327809Ae.LJII(str2)) != null && (iDoubleValue = (int) dLJII3.doubleValue()) > 0) {
                            numValueOf3 = Integer.valueOf(iDoubleValue);
                        }
                    } else if (str4.equals("live_exp_fling_distance") && (str3 = liveRoomStatesTag.tagValue) != null && (dLJII4 = C2327809Ae.LJII(str3)) != null && (iDoubleValue2 = (int) dLJII4.doubleValue()) > 0) {
                        numValueOf2 = Integer.valueOf(iDoubleValue2);
                    }
                }
            }
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        VerticalViewPager verticalViewPager2 = this.LLJILLL;
        if (verticalViewPager2 != null) {
            int iIntValue = numValueOf3 != null ? numValueOf3.intValue() : ((Number) C0OHO.LIZJ.getValue()).intValue();
            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : ((Number) C0OHO.LJ.getValue()).intValue();
            int iIntValue3 = numValueOf2 != null ? numValueOf2.intValue() : ((Number) C0OHO.LIZIZ.getValue()).intValue();
            float f = C0OHO.LIZ().liveExpAddedPageOffset;
            if (iIntValue <= 0 || iIntValue3 <= 0 || iIntValue2 <= 0 || f < 0.0f) {
                return;
            }
            verticalViewPager2.LLLLLLZ = true;
            verticalViewPager2.LLLIL = iIntValue;
            verticalViewPager2.LLLLZLL = iIntValue3;
            verticalViewPager2.LLLLZLLLI = iIntValue2;
            verticalViewPager2.LLLZI = f;
        }
    }

    public FeedLiveScrollConfigComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 1614), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C607450Ns7(false, this));
        }
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJILJIL = C628500Oky.LIZ(new C607460Ns8(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        super.onDestroy();
        C0OHK c0ohk = this.LLJILJILJ;
        if (c0ohk == null || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJILJIL.getValue()) == null) {
            return;
        }
        iViewPagerComponentAbility.Xl0(c0ohk);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        LLJJ = getPanelContext().LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0OHK] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r3) {
        /*
            r2 = this;
            super.onViewCreated(r3)
            r0 = 2131400227(0x7f0a9623, float:1.8421302E38)
            android.view.View r0 = r3.findViewById(r0)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = (com.ss.android.ugc.aweme.common.widget.VerticalViewPager) r0
            r2.LLJILLL = r0
            if (r0 == 0) goto L3b
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L3b
        L17:
            com.ss.android.ugc.feed.platform.panel.live.FeedLiveScrollConfigComponent.LLJJI = r0
            X.0RJN r0 = r2.getPanelContext()
            java.lang.String r0 = r0.LIZ
            com.ss.android.ugc.feed.platform.panel.live.FeedLiveScrollConfigComponent.LLJJ = r0
            X.0OHK r0 = new X.0OHK
            r0.<init>()
            r2.LLJILJILJ = r0
            X.0Ooa r0 = r2.LLJILJIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r1 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility) r1
            if (r1 == 0) goto L37
            X.0OHK r0 = r2.LLJILJILJ
            r1.Bv0(r0)
        L37:
            r2.Go()
            return
        L3b:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.live.FeedLiveScrollConfigComponent.onViewCreated(android.view.View):void");
    }
}
