package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* JADX INFO: loaded from: classes35.dex */
public class PlayerControllerFactory {
    public static IPlayerController getPlayerController(Configuration configuration, IMediaPlayer iMediaPlayer) {
        return getPlayerController(true, configuration, iMediaPlayer);
    }

    public static IPlayerController getPlayerController(boolean z, Configuration configuration, IMediaPlayer iMediaPlayer) {
        if (z) {
            return PlayerController.get(configuration, iMediaPlayer);
        }
        return new PlayerControllerNormal(configuration.getContext(), configuration.getLifecycleOwner(), iMediaPlayer);
    }
}
