package com.ss.android.ugc.aweme.dsp.service;

import android.content.Context;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicDspServiceEmptyImpl implements IMusicDspService {
    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public boolean hasMusicDsp() {
        return false;
    }

    public void openMyMusic(Context context, String str, String str2, String str3) {
    }

    public void openMyMusicFromProfileMenu(Context context, String str) {
    }

    public void preLoadHistoryMusic(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public void recordAddSongTimestamp() {
    }

    public void removeCacheWhenLikeChange() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public boolean shouldBlockAddSongsToMyMusic() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public boolean shouldShowMyMusicEntrance() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public boolean showProfileMenuPanelAlertBadge() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public void trackAddToMyMusic() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public void trackEnterMyMusic() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public void trackEnterProfileMenuPanel() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public void trackProfileMenuPanelShow() {
    }
}
