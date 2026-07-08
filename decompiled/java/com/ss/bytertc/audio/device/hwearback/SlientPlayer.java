package com.ss.bytertc.audio.device.hwearback;

import X.C0W9U;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public class SlientPlayer {
    public boolean mIsPlaying;
    public PlaybackThread mPlaybackThread;
    public boolean mRequireDeepBuffer;
    public AudioTrack mTrack;
    public int mSampleRate = 44100;
    public int mChannelConfig = 12;
    public int mAudioFormat = 2;
    public int mTrackBufSize = AudioTrack.getMinBufferSize(44100, 12, 2);

    public class PlaybackThread extends BPEAThread {
        public boolean isStop;

        private void bpea_origin_run() {
            com_ss_bytertc_audio_device_hwearback_SlientPlayer$PlaybackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public synchronized void closeThread() {
            try {
                notify();
                this.isStop = true;
                interrupt();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public void com_ss_bytertc_audio_device_hwearback_SlientPlayer$PlaybackThread__run$___twin___() {
            AudioTrack audioTrack;
            try {
                if (!SlientPlayer.this.mRequireDeepBuffer || Build.VERSION.SDK_INT < 26) {
                    SlientPlayer slientPlayer = SlientPlayer.this;
                    audioTrack = new AudioTrack(3, slientPlayer.mSampleRate, slientPlayer.mChannelConfig, slientPlayer.mAudioFormat, slientPlayer.mTrackBufSize, 1);
                } else {
                    AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(SlientPlayer.this.mSampleRate).setChannelMask(SlientPlayer.this.mChannelConfig).setEncoding(SlientPlayer.this.mAudioFormat).build();
                    audioTrack = new AudioTrack.Builder().setAudioFormat(audioFormatBuild).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build()).setBufferSizeInBytes(SlientPlayer.this.mTrackBufSize).setPerformanceMode(2).build();
                }
                audioTrack.play();
                int i = SlientPlayer.this.mTrackBufSize;
                byte[] bArr = new byte[i];
                while (!this.isStop && !isInterrupted()) {
                    try {
                        audioTrack.write(bArr, 0, i);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        audioTrack.stop();
                        audioTrack.flush();
                        audioTrack.release();
                    }
                }
                audioTrack.stop();
                audioTrack.flush();
                audioTrack.release();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SlientPlayer createAudioTrack has exception: ");
                sbLIZ.append(Log.getStackTraceString(e2));
                Logging.w("SlientPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("SlientPlayer$PlaybackThread@7a.run");
            boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
            try {
                com_ss_bytertc_audio_device_hwearback_SlientPlayer$PlaybackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("SlientPlayer$PlaybackThread@7a.run");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public PlaybackThread() {
        }

        public static void com_ss_bytertc_audio_device_hwearback_SlientPlayer$PlaybackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(PlaybackThread playbackThread) {
            try {
                playbackThread.com_ss_bytertc_audio_device_hwearback_SlientPlayer$PlaybackThread__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public void play() {
        if (!this.mIsPlaying && this.mPlaybackThread == null) {
            this.mIsPlaying = true;
            PlaybackThread playbackThread = new PlaybackThread();
            this.mPlaybackThread = playbackThread;
            playbackThread.start();
        }
    }

    public void stop() {
        PlaybackThread playbackThread = this.mPlaybackThread;
        if (playbackThread != null) {
            this.mIsPlaying = false;
            playbackThread.closeThread();
            this.mPlaybackThread = null;
        }
    }

    public boolean isPlaying() {
        return this.mIsPlaying;
    }

    public void setRequireDeepBuffer(boolean z) {
        this.mRequireDeepBuffer = z;
    }

    public void setSampleRate(int i) {
        this.mSampleRate = i;
    }
}
