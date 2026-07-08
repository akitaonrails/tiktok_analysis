package com.ss.android.ugc.aweme.services;

import com.bytedance.tux.navigation.TuxNavBar;

/* JADX INFO: loaded from: classes10.dex */
public interface IAppDiffMusicService {

    public static final class DefaultImpls {
        public static boolean enableToMusicShoot(IAppDiffMusicService iAppDiffMusicService) {
            return true;
        }

        public static boolean enableToShowSearchEntrance(IAppDiffMusicService iAppDiffMusicService) {
            return true;
        }
    }

    boolean enableDetailShoot();

    boolean enableInitMusicCreateSongAssem();

    boolean enableMusicDetailNavBarAssem();

    boolean enableMusicShareToEditAssem();

    boolean enableShare();

    boolean enableToMusicShoot();

    boolean enableToShowSearchEntrance();

    boolean initMusicListViewTitleBar(TuxNavBar tuxNavBar, Object obj);
}
