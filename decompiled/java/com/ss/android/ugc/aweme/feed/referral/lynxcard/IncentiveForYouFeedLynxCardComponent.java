package com.ss.android.ugc.aweme.feed.referral.lynxcard;

import X.C01GW;
import X.C0T2V;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC606850Nr9;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.referral.FeedBannerAwemeHelper;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class IncentiveForYouFeedLynxCardComponent extends BasePanelComponent {
    public final C01GW LL;

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LL.getValue();
        if (dataLayerAbility != null) {
            dataLayerAbility.pV(new InterfaceC606850Nr9() { // from class: X.0T2U
                @Override // X.InterfaceC606850Nr9
                public final void LIZIZ(int i, String str, List list) {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LIZLLL(int i, Aweme aweme, String str) {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJFF() {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJII(Map map) {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJIIJ(List<? extends Aweme> list) {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LJIIJJI(int i, int i2, String str, List list, List list2) {
                }

                @Override // X.InterfaceC606850Nr9
                public final void LIZ(List<? extends Aweme> list) {
                    if (!C749302wF.LIZLLL) {
                        FeedBannerAwemeHelper feedBannerAwemeHelperLIZ = C0R69.LIZ("homepage_hot");
                        try {
                            int iLJ = C0T82.LJ(feedBannerAwemeHelperLIZ.LIZ);
                            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                            ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) C2178808gE.LIZ().LJ(iLJ);
                            if (referralFeedBanner != null && referralFeedBanner.bannerType == 100) {
                                Iterator<FeedBannerAwemeHelper.AwemeInfo> it2 = feedBannerAwemeHelperLIZ.LIZJ.iterator();
                                while (it2.hasNext()) {
                                    C1440005kM.LIZ(new C1210880hcE(feedBannerAwemeHelperLIZ.LIZ, "FUNCTION_FROM_DEFAULT", "referral_banner_delete", it2.next().aweme));
                                }
                                feedBannerAwemeHelperLIZ.LIZJ.clear();
                                C01GW<C759500Tqm> c01gw2 = C759500Tqm.LJ;
                                C739380SzQ.LIZ().LIZ("RefreshList");
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            });
        }
    }

    public IncentiveForYouFeedLynxCardComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 486), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C0T2V(false, this));
        }
        this.LL = c01gwLIZIZ;
    }
}
