package com.ss.android.ugc.profile.business.commerce;

import android.view.View;
import com.ss.android.ugc.profile.platform.ab.TiktokSellerProfileRedDotSettings;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.SemiPopProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SemiSellerHubProtocol extends SemiPopProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "settings_semi_pop_up_seller_hub";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String str;
        ProfileComponents profileComponents = this.LLJILJILJ;
        if (profileComponents != null) {
            str = profileComponents.componentId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "settings_semi_pop_up_base_item")) {
            TiktokSellerProfileRedDotSettings.LIZ();
            return false;
        }
        return false;
    }
}
