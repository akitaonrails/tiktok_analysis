package com.ss.android.ugc.aweme.livewallpaper;

import android.content.Intent;
import android.service.wallpaper.WallpaperService;

/* JADX INFO: loaded from: classes14.dex */
public interface IAmeLiveWallpaperDelegate {
    IAmeLiveWallpaperEngineDelegate createEngineDelegate(WallpaperService wallpaperService);

    void onCreate(WallpaperService wallpaperService, IAmeLiveWallpaperHost iAmeLiveWallpaperHost);

    void onDestroy();

    void onStartCommand(Intent intent, int i, int i2);
}
