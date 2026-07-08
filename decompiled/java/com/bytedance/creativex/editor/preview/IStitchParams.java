package com.bytedance.creativex.editor.preview;

import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public interface IStitchParams extends Parcelable, Serializable {
    String getAwemeId();

    String getChain();

    String getConcatAudioPath();

    String getConcatVideoPath();

    long getDuration();

    boolean getEnableMic();

    String getMusicId();

    String getMusicPath();

    int getMusicStart();

    String getVideoPath();

    boolean isMuted();

    boolean isPGCMusic();

    void setAwemeId(String str);

    void setChain(String str);

    void setConcatAudioPath(String str);

    void setConcatVideoPath(String str);

    void setDuration(long j);

    void setEnableMic(boolean z);

    void setMusicId(String str);

    void setMusicPath(String str);

    void setMusicStart(int i);

    void setMuted(boolean z);

    void setPGCMusic(boolean z);

    void setVideoPath(String str);
}
