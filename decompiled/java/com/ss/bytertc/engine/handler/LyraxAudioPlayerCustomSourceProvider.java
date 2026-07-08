package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.lyrax.audio.ILyraxAudioPlayerCustomSourceProvider;
import com.ss.lyrax.audio.LyraxAudioPlayerCustomSourceSeekWhence;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPlayerCustomSourceProvider {
    public ILyraxAudioPlayerCustomSourceProvider mCustomSourceProvider;

    public void setCustomSourceProvider(ILyraxAudioPlayerCustomSourceProvider iLyraxAudioPlayerCustomSourceProvider) {
        this.mCustomSourceProvider = iLyraxAudioPlayerCustomSourceProvider;
    }

    public int onReadData(ByteBuffer byteBuffer, int i) {
        ILyraxAudioPlayerCustomSourceProvider iLyraxAudioPlayerCustomSourceProvider = this.mCustomSourceProvider;
        if (iLyraxAudioPlayerCustomSourceProvider != null) {
            return iLyraxAudioPlayerCustomSourceProvider.onReadData(byteBuffer, i);
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    public long onSeek(long j, int i) {
        ILyraxAudioPlayerCustomSourceProvider iLyraxAudioPlayerCustomSourceProvider = this.mCustomSourceProvider;
        if (iLyraxAudioPlayerCustomSourceProvider != null) {
            return iLyraxAudioPlayerCustomSourceProvider.onSeek(j, LyraxAudioPlayerCustomSourceSeekWhence.fromId(i));
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }
}
