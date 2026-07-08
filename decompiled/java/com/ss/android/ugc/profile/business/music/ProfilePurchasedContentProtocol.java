package com.ss.android.ugc.profile.business.music;

import X.C09CT;
import X.C2192401ArG;
import X.C2344009Gk;
import X.C293501Bt;
import X.C589170N8x;
import X.InterfaceC625970Ogt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.component.SemiPopProtocol;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class ProfilePurchasedContentProtocol extends SemiPopProtocol {
    public final InterfaceC625970Ogt LLJL = C2192401ArG.LIZ(C589170N8x.LIZ("pcs"), "course_video");
    public PurchasedContentBaseData LLJLIL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "settings_semi_pop_up_purchased_content";
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
        this.LLJLIL = purchasedContentBaseData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.09Gk] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Map<String, String> uP(int i, String str) {
        ?? r3;
        ?? c2344009Gk = new C2344009Gk();
        if (Intrinsics.LJFF(str, "order_center_entrance_show")) {
            PurchasedContentBaseData purchasedContentBaseData = this.LLJLIL;
            int i2 = 0;
            if (purchasedContentBaseData != null) {
                boolean hasPaidVideo = purchasedContentBaseData.getHasPaidVideo();
                r3 = hasPaidVideo;
                if (hasPaidVideo) {
                    boolean z = this.LLJL.getBoolean("has_shown_purchase_content_entrance_reddot", false);
                    PurchasedContentBaseData purchasedContentBaseData2 = this.LLJLIL;
                    if (purchasedContentBaseData2 != null && purchasedContentBaseData2.getHasPaidVideo() && !z) {
                        i2 = 1;
                    }
                    c2344009Gk.LIZJ(i2, "has_red_dot");
                    r3 = hasPaidVideo;
                }
            } else {
                r3 = 0;
            }
            c2344009Gk.LIZJ(r3, "has_course");
        }
        return c2344009Gk.LIZ;
    }
}
