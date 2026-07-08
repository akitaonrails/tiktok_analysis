package com.ss.android.ugc.aweme.commercialize.media.impl.service;

import X.C04PP;
import X.C0XEE;
import X.C12BT;
import X.C15HA;
import X.C15HT;
import X.C15M9;
import X.C15MA;
import X.C15MD;
import X.C15ME;
import X.C15MF;
import X.C15MG;
import X.C15MH;
import X.C15MI;
import X.C1850140yFI;
import X.C19744212Mu;
import X.C19EG;
import X.InterfaceC1399180mVw;
import X.InterfaceC19744412Mw;
import X.InterfaceC20494615Hk;
import X.InterfaceC2217461Bqa;
import X.InterfaceC681390Qo5;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.api.viewmodel.CommerceMediaViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.CommerceSoundPageHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.banner.CommerceMusicBannerTargetPageHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.csptab.CommerceMusicTabHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.playlist.CommerceMusicPlaylistHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.search.CommerceSearchMusicHandler;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceMediaServiceImpl implements ICommerceMediaService {
    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final C1850140yFI LJIILIIL() {
        return new C1850140yFI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final String LJIJJLI() {
        C15MF c15mfLIZIZ;
        if (C15MA.LL.getInCommercialSoundPage() && (c15mfLIZIZ = C15MA.LIZIZ()) != null && (c15mfLIZIZ instanceof C15MG)) {
            return "commercial_sound_page";
        }
        C15M9 c15m9 = C15MA.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return TextUtils.equals((String) c15m9.LIZ, "change_ban_music") ? "BA_muted_music_replace" : "";
    }

    public CommerceMediaServiceImpl() {
        C15MA c15ma = C15MA.LL;
        C15MD c15md = new C15MD(this);
        c15ma.getClass();
        C15MA.LLJJI = c15md;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LIZLLL() {
        return C19744212Mu.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJ() {
        return C19744212Mu.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJFF() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_music_legal_optimize", false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIIJ() {
        if (C19744212Mu.LJII()) {
            C15MA c15ma = C15MA.LL;
            if (!c15ma.getInCommercialSoundPage()) {
                c15ma.setInCommercialSoundPage(true);
            }
        }
        return C15MA.LL.getInCommercialSoundPage();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIILLIIL() {
        User currentUser;
        InterfaceC19744412Mw interfaceC19744412MwLIZ = C04PP.LIZ();
        if (interfaceC19744412MwLIZ == null || !interfaceC19744412MwLIZ.LIZ()) {
            C19744212Mu.LIZ.getClass();
            if (!C19744212Mu.LJ()) {
                BizAccount bizAccountLIZ = C0XEE.LIZ();
                C15MA.LL.getClass();
                C15M9 c15m9 = C15MA.LLJJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
                if (!TextUtils.equals((String) c15m9.LIZ, "change_ban_music")) {
                    return false;
                }
                InterfaceC19744412Mw interfaceC19744412MwLIZ2 = C04PP.LIZ();
                if (interfaceC19744412MwLIZ2 == null || (currentUser = interfaceC19744412MwLIZ2.getCurrentUser()) == null || currentUser.getAccountType() != 3) {
                    if (bizAccountLIZ != null) {
                        return bizAccountLIZ.isVerifiedBA() || bizAccountLIZ.getRestrictCommerceMusic();
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIJI() {
        InterfaceC19744412Mw interfaceC19744412MwLIZ;
        InterfaceC19744412Mw interfaceC19744412MwLIZ2 = C04PP.LIZ();
        return ((interfaceC19744412MwLIZ2 != null && interfaceC19744412MwLIZ2.LIZ()) || (interfaceC19744412MwLIZ = C04PP.LIZ()) == null || interfaceC19744412MwLIZ.getCurrentUser() == null || C19744212Mu.LJII()) ? false : true;
    }

    public static CommerceMediaViewModel LIZ(Fragment fragment) {
        return (CommerceMediaViewModel) ViewModelProviders.of(fragment).get(CommerceMediaViewModel.class);
    }

    public static CommerceMediaViewModel LIZIZ(C19EG c19eg) {
        return (CommerceMediaViewModel) ViewModelProviders.of(c19eg).get(CommerceMediaViewModel.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LIZJ(Music music) {
        return C19744212Mu.LJI(music);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJII(Music music) {
        if (music == null) {
            return false;
        }
        return !music.isCommercialMusic();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final C15HA LJIIIIZZ(C19EG c19eg) {
        CommerceMusicPlaylistHandler commerceMusicPlaylistHandler = LIZIZ(c19eg).LLILLJJLI;
        if (commerceMusicPlaylistHandler == null) {
            CommerceMusicPlaylistHandler commerceMusicPlaylistHandler2 = new CommerceMusicPlaylistHandler();
            c19eg.getLifecycle().addObserver(commerceMusicPlaylistHandler2);
            LIZIZ(c19eg).LLILLJJLI = commerceMusicPlaylistHandler2;
            return commerceMusicPlaylistHandler2;
        }
        return commerceMusicPlaylistHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final C15HT LJIIIZ(Fragment fragment) {
        CommerceMusicTabHandler commerceMusicTabHandler = LIZ(fragment).LLILZIL;
        if (commerceMusicTabHandler == null) {
            CommerceMusicTabHandler commerceMusicTabHandler2 = new CommerceMusicTabHandler();
            fragment.getLifecycle().addObserver(commerceMusicTabHandler2);
            LIZ(fragment).LLILZIL = commerceMusicTabHandler2;
            return commerceMusicTabHandler2;
        }
        return commerceMusicTabHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final InterfaceC681390Qo5 LJIIJJI(Fragment fragment) {
        CommerceSearchMusicHandler commerceSearchMusicHandler = LIZ(fragment).LLILZ;
        if (commerceSearchMusicHandler == null) {
            CommerceSearchMusicHandler commerceSearchMusicHandler2 = new CommerceSearchMusicHandler();
            fragment.getLifecycle().addObserver(commerceSearchMusicHandler2);
            LIZ(fragment).LLILZ = commerceSearchMusicHandler2;
            return commerceSearchMusicHandler2;
        }
        return commerceSearchMusicHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final InterfaceC20494615Hk LJIIL(Fragment fragment) {
        CommerceSoundPageHandler commerceSoundPageHandler = LIZ(fragment).LL;
        if (commerceSoundPageHandler == null) {
            CommerceSoundPageHandler commerceSoundPageHandler2 = new CommerceSoundPageHandler();
            fragment.getLifecycle().addObserver(commerceSoundPageHandler2);
            LIZ(fragment).LL = commerceSoundPageHandler2;
            return commerceSoundPageHandler2;
        }
        return commerceSoundPageHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final InterfaceC1399180mVw LJIILJJIL(Fragment fragment) {
        CommerceMusicBannerTargetPageHandler commerceMusicBannerTargetPageHandler = LIZ(fragment).LLILLL;
        if (commerceMusicBannerTargetPageHandler == null) {
            CommerceMusicBannerTargetPageHandler commerceMusicBannerTargetPageHandler2 = new CommerceMusicBannerTargetPageHandler();
            fragment.getLifecycle().addObserver(commerceMusicBannerTargetPageHandler2);
            LIZ(fragment).LLILLL = commerceMusicBannerTargetPageHandler2;
            return commerceMusicBannerTargetPageHandler2;
        }
        return commerceMusicBannerTargetPageHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIILL(Music music) {
        if (music == null) {
            return true;
        }
        if (!music.isCommercialMusic() && !music.isOriginalSound()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final InterfaceC1399180mVw LJIL(C19EG c19eg) {
        CommerceMusicBannerTargetPageHandler commerceMusicBannerTargetPageHandler = LIZIZ(c19eg).LLILLL;
        if (commerceMusicBannerTargetPageHandler == null) {
            CommerceMusicBannerTargetPageHandler commerceMusicBannerTargetPageHandler2 = new CommerceMusicBannerTargetPageHandler();
            c19eg.getLifecycle().addObserver(commerceMusicBannerTargetPageHandler2);
            LIZIZ(c19eg).LLILLL = commerceMusicBannerTargetPageHandler2;
            return commerceMusicBannerTargetPageHandler2;
        }
        return commerceMusicBannerTargetPageHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final void LJJ(C12BT c12bt) {
        C04PP.LIZ.LIZIZ(c12bt);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final MusicModel.FromSection LJIJ(MusicModel musicModel, boolean z) {
        return LJIIZILJ(musicModel, z, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final C15HA LJIJJ(ViewModelProvider viewModelProvider, Scene scene) {
        CommerceMusicPlaylistHandler commerceMusicPlaylistHandler = ((CommerceMediaViewModel) viewModelProvider.get(CommerceMediaViewModel.class)).LLILLJJLI;
        if (commerceMusicPlaylistHandler == null) {
            CommerceMusicPlaylistHandler commerceMusicPlaylistHandler2 = new CommerceMusicPlaylistHandler();
            scene.getLifecycle().addObserver(commerceMusicPlaylistHandler2);
            ((CommerceMediaViewModel) viewModelProvider.get(CommerceMediaViewModel.class)).LLILLJJLI = commerceMusicPlaylistHandler2;
            return commerceMusicPlaylistHandler2;
        }
        return commerceMusicPlaylistHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final MusicModel.FromSection LJIIZILJ(MusicModel musicModel, boolean z, boolean z2) {
        if (musicModel == null) {
            return MusicModel.FromSection.NO_MUSIC;
        }
        if (!C15MA.LL.getInCommercialSoundPage()) {
            return MusicModel.FromSection.OTHER;
        }
        C15MF c15mfLIZIZ = C15MA.LIZIZ();
        if (c15mfLIZIZ instanceof C15ME) {
            if (((C15ME) c15mfLIZIZ).LIZJ == null) {
                C15M9 c15m9 = C15MA.LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
                if (!Intrinsics.LJFF(c15m9.LIZ, Banner.BannerSchemaType.AI_RECOMMEND_PLAYLIST.mobValue)) {
                    if (z) {
                        return MusicModel.FromSection.CSP_RECOMMENDED;
                    }
                    if (z2) {
                        return MusicModel.FromSection.CSP_VIEW_ALL_UNFOLDED_PLAYLIST;
                    }
                    return MusicModel.FromSection.CSP_PLAYLISTS;
                }
            }
            return MusicModel.FromSection.CSP_BANNER;
        }
        if (c15mfLIZIZ instanceof C15MG) {
            if (((C15MG) c15mfLIZIZ).LIZ) {
                return MusicModel.FromSection.FAVORITE;
            }
            if (z) {
                return MusicModel.FromSection.CSP_RECOMMENDED;
            }
            return MusicModel.FromSection.CSP_UNFOLDED_PLAYLISTS;
        }
        if (c15mfLIZIZ instanceof C15MI) {
            if (((C15MI) c15mfLIZIZ).LIZ != null) {
                return MusicModel.FromSection.CSP_BANNER;
            }
            return MusicModel.FromSection.OTHER;
        }
        if (c15mfLIZIZ instanceof C15MH) {
            return MusicModel.FromSection.SEARCH;
        }
        return MusicModel.FromSection.OTHER;
    }
}
