package com.ss.android.ugc.aweme.live.alphaplayer.player;

import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface IMediaPlayer<T extends IMediaPlayer> {

    /* JADX INFO: loaded from: classes24.dex */
    public interface OnCompletionListener<T> {
        void onCompletion(T t);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public interface OnErrorListener<T> {
        void onError(T t, int i, int i2, String str);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public interface OnFirstFrameListener<T> {
        void onFirstFrame(T t);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public interface OnPreparedListener<T> {
        void onPrepared(T t);
    }

    int getCurrentPosition();

    String getPlayerSimpleName();

    VideoInfo getVideoInfo();

    void initMediaPlayer();

    boolean isPlaying();

    boolean isSupportDataPathList();

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(int i);

    void setDataSource(String str);

    void setDataSource(List<String> list);

    void setLooping(boolean z);

    void setOnCompletionListener(OnCompletionListener<T> onCompletionListener);

    void setOnErrorListener(OnErrorListener<T> onErrorListener);

    void setOnFirstFrameListener(OnFirstFrameListener<T> onFirstFrameListener);

    void setOnPreparedListener(OnPreparedListener<T> onPreparedListener);

    void setScreenOnWhilePlaying(boolean z);

    void setSurface(Surface surface);

    void start();

    void stop();
}
