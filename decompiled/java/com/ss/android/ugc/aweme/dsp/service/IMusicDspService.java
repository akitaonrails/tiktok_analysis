package com.ss.android.ugc.aweme.dsp.service;

/* JADX INFO: loaded from: classes20.dex */
public interface IMusicDspService {
    boolean hasMusicDsp();

    void recordAddSongTimestamp();

    boolean shouldBlockAddSongsToMyMusic();

    boolean shouldShowMyMusicEntrance();

    boolean showProfileMenuPanelAlertBadge();

    void trackAddToMyMusic();

    void trackEnterMyMusic();

    void trackEnterProfileMenuPanel();

    void trackProfileMenuPanelShow();
}
