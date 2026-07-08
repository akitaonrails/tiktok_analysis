package com.ss.android.ugc.aweme.live.alphaplayer.player;

import android.content.Context;
import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class AbsPlayer<T extends AbsPlayer> implements IMediaPlayer<AbsPlayer<T>> {
    public IMediaPlayer.OnCompletionListener<AbsPlayer<T>> completionListener;
    public Context context;
    public IMediaPlayer.OnErrorListener<AbsPlayer<T>> errorListener;
    public IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> firstFrameListener;
    public IMediaPlayer.OnPreparedListener<AbsPlayer<T>> preparedListener;
    public AbsPlayer<T> self;

    public AbsPlayer() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public int getCurrentPosition() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public VideoInfo getVideoInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void initMediaPlayer() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public boolean isPlaying() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public boolean isSupportDataPathList() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void pause() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void prepareAsync() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void release() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void reset() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void seekTo(int i) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setDataSource(String str) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setDataSource(List<String> list) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setLooping(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setSurface(Surface surface) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void start() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void stop() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public String getPlayerSimpleName() {
        return "AbsPlayer";
    }

    public AbsPlayer(Context context) {
        this.self = this;
        this.context = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener) {
        this.completionListener = onCompletionListener;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setOnErrorListener(IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener) {
        this.errorListener = onErrorListener;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setOnFirstFrameListener(IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener) {
        this.firstFrameListener = onFirstFrameListener;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener) {
        this.preparedListener = onPreparedListener;
    }
}
