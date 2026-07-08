package com.ss.android.ugc.profile.business.commerce;

import X.C0TMQ;
import X.C13LQ;
import X.C2192401ArG;
import X.C589170N8x;
import X.InterfaceC625970Ogt;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.ab.TiktokSellerProfileRedDotSettings;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ContentCellSellerHubProtocol extends ContentCellProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_seller_hub";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        TiktokSellerProfileRedDotSettings.LIZ();
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final boolean LJLJLLL(n nVar) {
        Object objLJJIIZ;
        Object objLJJIIZ2;
        TiktokSellerProfileRedDotSettings.TiktokSellerProfileRedConfig tiktokSellerProfileRedConfig = (TiktokSellerProfileRedDotSettings.TiktokSellerProfileRedConfig) SettingsManager.LIZLLL().LJIIIIZZ("seller_profile_red_dot_dict", TiktokSellerProfileRedDotSettings.TiktokSellerProfileRedConfig.class, TiktokSellerProfileRedDotSettings.LIZ);
        if (tiktokSellerProfileRedConfig == null) {
            return false;
        }
        InterfaceC625970Ogt interfaceC625970OgtLIZ = C2192401ArG.LIZ(C589170N8x.LIZ("social", "profile"), "keva_repo_profile_component");
        C0TMQ.LIZ.getClass();
        String[] strArrLJI = interfaceC625970OgtLIZ.LJI(C0TMQ.LIZ("profile_seller_hub_cus_red_dot_key"), new String[0]);
        if (strArrLJI == null || (objLJJIIZ = C13LQ.LJJIIZ(0, strArrLJI)) == null) {
            objLJJIIZ = "hidden_red_dot";
        }
        if (strArrLJI == null || (objLJJIIZ2 = C13LQ.LJJIIZ(1, strArrLJI)) == null) {
            objLJJIIZ2 = "hidden_red_dot";
        }
        String str = tiktokSellerProfileRedConfig.campaignSeller;
        if (str == null) {
            str = "hidden_red_dot";
        }
        if (Intrinsics.LJFF(str, objLJJIIZ2) || Intrinsics.LJFF(str, "hidden_red_dot")) {
            String str2 = tiktokSellerProfileRedConfig.newSeller;
            if (str2 == null) {
                str2 = "hidden_red_dot";
            }
            if (Intrinsics.LJFF(str2, objLJJIIZ) || Intrinsics.LJFF(str2, "hidden_red_dot")) {
                return false;
            }
        }
        return true;
    }
}
