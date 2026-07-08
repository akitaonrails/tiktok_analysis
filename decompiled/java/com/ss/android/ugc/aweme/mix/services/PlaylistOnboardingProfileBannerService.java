package com.ss.android.ugc.aweme.mix.services;

import X.AbstractC848400XPy;
import X.C0C64;
import X.C0TGX;
import X.C0XQ7;
import X.C1167750gUf;
import X.C20515215Pi;
import X.C20661915tB;
import X.C20662015tC;
import X.C20662115tD;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.experiment.PlaylistBottomBannerStrategyConfig;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaylistOnboardingProfileBannerService implements IPlaylistOnboardingProfileBannerService {
    public final C20662015tC LIZ = new C20662015tC();

    @Override // com.ss.android.ugc.aweme.mix.services.IPlaylistOnboardingProfileBannerService
    public final boolean LIZ() {
        if (!((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LIZIZ()) {
            return false;
        }
        C1167750gUf.LIZ.getClass();
        if (!C1167750gUf.LIZLLL()) {
            return false;
        }
        if (!(C0C64.LJIILLIIL().LJIJ(31744, 0, "playlist_bottom_banner_optimize", true) == 1)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "playlist_bottom_banner_optimize", true) != 2) {
                return false;
            }
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            int i = curUser != null ? curUser.historyMaxFollowerCount : 0;
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PlaylistBottomBannerStrategyConfig playlistBottomBannerStrategyConfig = C20662115tD.LIZ;
            PlaylistBottomBannerStrategyConfig playlistBottomBannerStrategyConfig2 = (PlaylistBottomBannerStrategyConfig) c0c64LJIILLIIL.LJJII(PlaylistBottomBannerStrategyConfig.class, playlistBottomBannerStrategyConfig, "playlist_bottom_banner_strategy", true);
            if (playlistBottomBannerStrategyConfig2 != null) {
                playlistBottomBannerStrategyConfig = playlistBottomBannerStrategyConfig2;
            }
            if (i < playlistBottomBannerStrategyConfig.displayFollowerCountThreshold) {
                return false;
            }
        }
        C20662015tC c20662015tC = this.LIZ;
        if (c20662015tC.LIZ.getBoolean("is_quit_forever_v1", false)) {
            return false;
        }
        int i2 = c20662015tC.LIZ.getInt("auto_dismiss_time_v1", 0);
        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
        PlaylistBottomBannerStrategyConfig playlistBottomBannerStrategyConfig3 = C20662115tD.LIZ;
        PlaylistBottomBannerStrategyConfig playlistBottomBannerStrategyConfig4 = (PlaylistBottomBannerStrategyConfig) c0c64LJIILLIIL2.LJJII(PlaylistBottomBannerStrategyConfig.class, playlistBottomBannerStrategyConfig3, "playlist_bottom_banner_strategy", true);
        if (playlistBottomBannerStrategyConfig4 != null) {
            playlistBottomBannerStrategyConfig3 = playlistBottomBannerStrategyConfig4;
        }
        return i2 < playlistBottomBannerStrategyConfig3.maxShowCount;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IPlaylistOnboardingProfileBannerService
    public final void LIZIZ(C0TGX c0tgx, C20515215Pi c20515215Pi) {
        PopupManager.LJIJI(new C20661915tB(c0tgx, c20515215Pi, this.LIZ), true);
    }
}
