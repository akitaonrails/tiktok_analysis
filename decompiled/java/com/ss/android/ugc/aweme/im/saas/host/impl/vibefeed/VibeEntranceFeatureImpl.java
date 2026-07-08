package com.ss.android.ugc.aweme.im.saas.host.impl.vibefeed;

import X.C1557990qe5;
import X.EnumC2007507th;
import X.EnumC912680ZrG;
import android.content.Context;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeCacheService;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class VibeEntranceFeatureImpl implements VibeEntranceFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature
    public final boolean LIZ(String str) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            return iVibeEntranceServiceLIZ.LIZ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature
    public final void LJIIIZ(String str, EnumC912680ZrG enumC912680ZrG) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            iVibeEntranceServiceLIZ.LJIILIIL(str, "shared_feed_top_btn", enumC912680ZrG);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature
    public final void LJII(String str, int i, EnumC912680ZrG enumC912680ZrG) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            iVibeEntranceServiceLIZ.LJIIIIZZ(str, "shared_feed_top_btn", i, enumC912680ZrG);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature
    public final void LJ(String str, String str2, int i, EnumC912680ZrG enumC912680ZrG) {
        IVibeCacheService iVibeCacheService = (IVibeCacheService) C1557990qe5.LIZJ.getValue();
        if (iVibeCacheService != null) {
            iVibeCacheService.LIZ(str);
        }
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            iVibeEntranceServiceLIZ.LJ(str, str2, i, enumC912680ZrG);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature
    public final void LJI(Context context, String str, String str2, String str3, String str4, String str5, List<String> list) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            iVibeEntranceServiceLIZ.LJI(context, str, str2, str3, str4, str5, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature
    public final void LJIIIIZZ(String str, String str2, String str3, TuxAlertBadgeLayout tuxAlertBadgeLayout, EnumC2007507th enumC2007507th, String str4, AwS558S0100000_14 awS558S0100000_14) {
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            iVibeEntranceServiceLIZ.LJIIIZ(false, str, str2, str3, tuxAlertBadgeLayout, enumC2007507th, awS558S0100000_14);
        }
    }
}
