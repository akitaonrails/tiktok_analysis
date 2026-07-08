package com.ss.android.ugc.profile.business.music;

import X.C09CT;
import X.C2192401ArG;
import X.C293501Bt;
import X.C589170N8x;
import X.InterfaceC625970Ogt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;

/* JADX INFO: loaded from: classes29.dex */
public class ContentCellPurchasedContentProtocol extends ContentCellProtocol {
    public final InterfaceC625970Ogt LLL = C2192401ArG.LIZ(C589170N8x.LIZ("pcs"), "course_video");
    public PurchasedContentBaseData LLLF;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_purchased_content";
    }

    public static final class PurchasedContentBaseData extends BizBaseData {
        public static final int $stable = 8;

        @C09CT("has_paid_video")
        public boolean hasPaidVideo;

        public final boolean getHasPaidVideo() {
            return this.hasPaidVideo;
        }

        public final void setHasPaidVideo(boolean z) {
            this.hasPaidVideo = z;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        PurchasedContentBaseData purchasedContentBaseData;
        try {
            purchasedContentBaseData = (PurchasedContentBaseData) C293501Bt.LIZ().LJII(nVar.toString(), PurchasedContentBaseData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            purchasedContentBaseData = null;
        }
        this.LLLF = purchasedContentBaseData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final boolean LJLJLLL(n nVar) {
        boolean z = this.LLL.getBoolean("has_shown_purchase_content_entrance_reddot", false);
        PurchasedContentBaseData purchasedContentBaseData = this.LLLF;
        if (purchasedContentBaseData == null || !purchasedContentBaseData.getHasPaidVideo() || z) {
            return false;
        }
        this.LLL.LIZLLL("has_shown_purchase_content_entrance_reddot", true);
        return true;
    }
}
