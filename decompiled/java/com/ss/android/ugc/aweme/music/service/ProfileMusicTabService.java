package com.ss.android.ugc.aweme.music.service;

import X.AbstractC20660815t0;
import X.C0O7A;
import X.C0TGX;
import X.C118300cf;
import X.C1252710ihh;
import X.C1254760il0;
import X.C1256930ioV;
import X.C1387310mCn;
import X.C13BV;
import X.C13LE;
import X.C19EG;
import X.C20656615sK;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C262100zr;
import X.C613960O6g;
import X.C631600Opy;
import X.C632050Oqh;
import X.C632070Oqj;
import X.C632120Oqo;
import X.C632210Oqx;
import X.C632990OsD;
import X.C633860Otc;
import X.C633880Ote;
import X.C633890Otf;
import X.InterfaceC1107590evd;
import X.InterfaceC20660615sy;
import X.InterfaceC346201Wa;
import X.InterfaceC613710O5h;
import X.InterfaceC633510Ot3;
import X.InterfaceC633870Otd;
import X.InterfaceC633930Otj;
import X.InterfaceC633940Otk;
import X.InterfaceC633950Otl;
import X.InterfaceC633960Otm;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.OriginMusicListNewFragment;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.music.ghost.GhostMusicFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS149S0101000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileMusicTabService implements IProfileMusicTabService {
    public InterfaceC633940Otk LIZ;

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZ() {
        InterfaceC633940Otk interfaceC633940Otk = this.LIZ;
        if (interfaceC633940Otk != null) {
            interfaceC633940Otk.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZIZ() {
        InterfaceC633940Otk interfaceC633940Otk = this.LIZ;
        if (interfaceC633940Otk != null) {
            interfaceC633940Otk.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJJ() {
        C633880Ote.LIZ.getClass();
        C633880Ote.LJ = null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJJII() {
        C632210Oqx.LIZ.getClass();
        String strLIZIZ = C632210Oqx.LIZIZ();
        Keva kevaLIZIZ = C632070Oqj.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_show_ghost_entrance_alert_badge");
        sbLIZ.append(strLIZIZ);
        kevaLIZIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJJIIJ() {
        C632210Oqx.LIZ.getClass();
        return C632070Oqj.LJ(C632210Oqx.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZJ() {
        C632070Oqj.LIZIZ().storeLong("key_use_fan_spotlight", System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZLLL(ProfileListFragment profileListFragment) {
        InterfaceC633870Otd interfaceC633870Otd;
        if ((profileListFragment instanceof InterfaceC633870Otd) && (interfaceC633870Otd = (InterfaceC633870Otd) profileListFragment) != null) {
            interfaceC633870Otd.clearData();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJFF(User user) {
        C632210Oqx.LIZ.getClass();
        if (C632210Oqx.LJII() && C632210Oqx.LJIIIIZZ(user) && C632050Oqh.LJIIIZ(user)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJI(ProfileListFragment profileListFragment) {
        if ((profileListFragment instanceof GhostMusicFragment) && profileListFragment != null) {
            InterfaceC633960Otm interfaceC633960Otm = (InterfaceC633960Otm) C1252710ihh.LJII(profileListFragment, C13LE.LIZ(InterfaceC633960Otm.class));
            if (interfaceC633960Otm != null) {
                interfaceC633960Otm.u0();
            }
            InterfaceC633950Otl interfaceC633950Otl = (InterfaceC633950Otl) C1252710ihh.LJII(profileListFragment, C13LE.LIZ(InterfaceC633950Otl.class));
            if (interfaceC633950Otl != null) {
                interfaceC633950Otl.u0();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJII(User user) {
        if (user.getShowArtistPlaylist() == 1) {
            C632070Oqj.LIZIZ().storeBoolean("key_first_enter_profile", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIJ(ProfileListFragment profileListFragment) {
        GhostMusicFragment ghostMusicFragment;
        if ((profileListFragment instanceof GhostMusicFragment) && (ghostMusicFragment = (GhostMusicFragment) profileListFragment) != null) {
            ghostMusicFragment.LLLZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIJJI(C1256930ioV c1256930ioV) {
        this.LIZ = c1256930ioV;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIILIIL(C1254760il0 c1254760il0) {
        C633880Ote.LIZ.getClass();
        C633880Ote.LJ = c1254760il0;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIILL(C262100zr c262100zr) {
        String string;
        InterfaceC633930Otj interfaceC633930Otj;
        C633880Ote.LIZ.getClass();
        C20656615sK c20656615sK = C633880Ote.LIZLLL;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
        C633880Ote.LIZLLL = null;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null && (string = interfaceC1107590evd.getString("type")) != null) {
            if ((Intrinsics.LJFF(string, "close") || Intrinsics.LJFF(string, "confirm")) && (interfaceC633930Otj = C633880Ote.LJ) != null) {
                interfaceC633930Otj.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJIILLIIL(User user) {
        if (user.getShowArtistPlaylist() == 1 && C632070Oqj.LIZIZ().getBoolean("key_first_enter_profile", true)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIJJLI(String str) {
        C632120Oqo.LIZ.getClass();
        C632120Oqo.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJJI(String str) {
        C632990OsD.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJJIFFI(String str) {
        C632990OsD.LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJJIII(String str) {
        return Intrinsics.LJFF(str, "spotlight_video_play");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJJIIJZLJL(User user) {
        C632210Oqx.LIZ.getClass();
        if (C632210Oqx.LJII() && C632210Oqx.LJIIIIZZ(user) && C632050Oqh.LJI(user)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJJIIZ(User user) {
        C632210Oqx.LIZ.getClass();
        if (C632210Oqx.LJII() && C632210Oqx.LJIIIIZZ(user)) {
            if (C632050Oqh.LJIIIIZZ(user) || C632050Oqh.LJI(user)) {
                return true;
            }
            return false;
        }
        return C632050Oqh.LJIIIIZZ(user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIIIZZ(ProfileListFragment profileListFragment, String str) {
        InterfaceC633870Otd interfaceC633870Otd;
        if ((profileListFragment instanceof InterfaceC633870Otd) && (interfaceC633870Otd = (InterfaceC633870Otd) profileListFragment) != null) {
            interfaceC633870Otd.fl(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIIZ(C19EG c19eg, final C0TGX c0tgx) {
        final AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(c19eg, 309);
        PopupManager.LJIJI(new AbstractC20660815t0(c0tgx, awS588S0100000_9) { // from class: X.0Otb
            public final Function1<C20656615sK, Unit> LL;

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 0;
            }

            {
                this.LL = awS588S0100000_9;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                this.LL.invoke(c20656615sK);
            }
        }, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIILJJIL(ProfileListFragment profileListFragment, InterfaceC633510Ot3 interfaceC633510Ot3) {
        InterfaceC633870Otd interfaceC633870Otd;
        if ((profileListFragment instanceof InterfaceC633870Otd) && (interfaceC633870Otd = (InterfaceC633870Otd) profileListFragment) != null) {
            interfaceC633870Otd.ZM(interfaceC633510Ot3);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final ProfileListFragment LJIJ(Fragment fragment, OriginMusicArg originMusicArg) {
        User user;
        if (fragment instanceof OriginMusicListNewFragment) {
            LJIJJLI("getMusicTabFragment cachedFragment");
            return (ProfileListFragment) fragment;
        }
        if (originMusicArg.isMe() && (user = originMusicArg.getUser()) != null && C632050Oqh.LJI(user)) {
            GhostMusicFragment ghostMusicFragment = new GhostMusicFragment();
            RouteArgExtension.INSTANCE.withNavArg(ghostMusicFragment, originMusicArg);
            return ghostMusicFragment;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileMusicTabService getMusicTabFragment, uid:");
        sbLIZ.append(originMusicArg.getUserId());
        sbLIZ.append(", secUid:");
        sbLIZ.append(originMusicArg.getSecUserID());
        LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
        OriginMusicListNewFragment originMusicListNewFragment = new OriginMusicListNewFragment();
        RouteArgExtension.INSTANCE.withNavArg(originMusicListNewFragment, originMusicArg);
        return originMusicListNewFragment;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJIJJ(boolean z, Boolean bool) {
        User userLIZJ;
        User userLIZJ2;
        List<Long> newReleaseClipIds;
        OriginalMusician originalMusician;
        C633880Ote.LIZ.getClass();
        boolean z2 = false;
        if (z) {
            C632210Oqx.LIZ.getClass();
            if (C632210Oqx.LJII() && !C632210Oqx.LJI() && (((userLIZJ = C632210Oqx.LIZJ()) == null || userLIZJ.getAccountType() != 3) && !Intrinsics.LJFF(bool, Boolean.FALSE) && (userLIZJ2 = C632210Oqx.LIZJ()) != null && userLIZJ2.getShowArtistPlaylist() == 1)) {
                C631600Opy.LIZ.getClass();
                if (C631600Opy.LIZ()) {
                    User userLIZJ3 = C632210Oqx.LIZJ();
                    if (userLIZJ3 == null || (originalMusician = userLIZJ3.getOriginalMusician()) == null || (newReleaseClipIds = originalMusician.getNewReleaseClipIds()) == null) {
                        newReleaseClipIds = C13BV.INSTANCE;
                    }
                    String[] stringArray = Keva.getRepo("artist_new_release_highlight_repo").getStringArray(C633880Ote.LIZJ("artist_new_released_musics"), new String[0]);
                    ArrayList arrayList = new ArrayList();
                    for (String str : stringArray) {
                        arrayList.add(C2095008Iq.LJIILIIL(str));
                    }
                    Iterator<Long> it2 = newReleaseClipIds.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains(Long.valueOf(it2.next().longValue()))) {
                            z2 = true;
                        }
                    }
                }
            }
        }
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIL(ProfileListFragment profileListFragment, boolean z) throws Throwable {
        if ((profileListFragment instanceof OriginMusicListNewFragment) && profileListFragment != null) {
            profileListFragment.onHiddenChanged(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final <D extends InterfaceC613710O5h> InterfaceC346201Wa<C0O7A<D>> LJIIL(C613960O6g<D> c613960O6g, String str, Map<String, String> map) {
        return C632050Oqh.LIZLLL(c613960O6g, str, map);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJIIZILJ(boolean z, boolean z2, boolean z3) {
        C633880Ote.LIZ.getClass();
        if (!C1387310mCn.LJFF(Keva.getRepo("artist_new_release_highlight_repo").getLong(C633880Ote.LIZJ("artist_music_offline_last_show_timestamp"), 0L))) {
            int i = Keva.getRepo("artist_new_release_highlight_repo").getInt(C633880Ote.LIZJ("artist_music_offline_show_times"), 0);
            C633860Otc.LIZ.getClass();
            if (i >= C633860Otc.LIZ().count || !z) {
                return false;
            }
            C632210Oqx.LIZ.getClass();
            if (!C632210Oqx.LJII() || C632210Oqx.LJI() || C632210Oqx.LJFF() || !z2 || !z3) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIJI(C19EG c19eg, View view, final C0TGX c0tgx) {
        final C633890Otf c633890Otf = new C633890Otf(view, this, c19eg, new C118300cf());
        PopupManager.LJIJI(new AbstractC20660815t0(c0tgx, c633890Otf) { // from class: X.0Ota
            public final Function1<C20656615sK, Unit> LL;

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 0;
            }

            {
                this.LL = c633890Otf;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                this.LL.invoke(c20656615sK);
            }
        }, true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJ(View view, C19EG c19eg, InterfaceC20660615sy interfaceC20660615sy, C0TGX c0tgx) {
        long highlightMusicId;
        List<Long> newReleaseClipIds;
        OriginalMusician originalMusician;
        OriginalMusician originalMusician2;
        C633880Ote.LIZ.getClass();
        C632210Oqx.LIZ.getClass();
        User userLIZJ = C632210Oqx.LIZJ();
        if (userLIZJ != null && (originalMusician2 = userLIZJ.getOriginalMusician()) != null) {
            highlightMusicId = originalMusician2.getHighlightMusicId();
        } else {
            highlightMusicId = 0;
        }
        User userLIZJ2 = C632210Oqx.LIZJ();
        if (userLIZJ2 == null || (originalMusician = userLIZJ2.getOriginalMusician()) == null || (newReleaseClipIds = originalMusician.getNewReleaseClipIds()) == null) {
            newReleaseClipIds = C13BV.INSTANCE;
        }
        int i = Keva.getRepo("artist_new_release_highlight_repo").getInt(C633880Ote.LIZJ("artist_new_release_show_times"), 0);
        AwS149S0101000_9 awS149S0101000_9 = new AwS149S0101000_9(newReleaseClipIds, (List<Long>) i, 13);
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(385);
        if (i != 0) {
            if (i != 1) {
                if (c0tgx != null) {
                    C633880Ote.LIZ(awS149S0101000_9, aFwS195S0000000_9, view, c0tgx);
                    return;
                }
                return;
            } else if (highlightMusicId == 0) {
                C633880Ote.LIZIZ(awS149S0101000_9, aFwS195S0000000_9, c19eg, interfaceC20660615sy);
                return;
            } else {
                if (c0tgx == null) {
                    return;
                }
                C633880Ote.LIZ(awS149S0101000_9, aFwS195S0000000_9, view, c0tgx);
                return;
            }
        }
        C633880Ote.LIZIZ(awS149S0101000_9, aFwS195S0000000_9, c19eg, interfaceC20660615sy);
    }
}
