package com.ss.android.ugc.aweme.services.story.forward;

import X.C08FF;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;

/* JADX INFO: loaded from: classes9.dex */
public interface ForwardMediaDownloader {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes28.dex */
    public static final class DownloadErrorType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ DownloadErrorType[] $VALUES;
        public final int value;
        public static final DownloadErrorType LOCAL_FILE_UNAVAILABLE = new DownloadErrorType("LOCAL_FILE_UNAVAILABLE", 0, -11111);
        public static final DownloadErrorType PLAYER_CACHE_UNAVAILABLE = new DownloadErrorType("PLAYER_CACHE_UNAVAILABLE", 1, -22222);
        public static final DownloadErrorType DATA_UNAVAILABLE = new DownloadErrorType("DATA_UNAVAILABLE", 2, -33333);

        public static final /* synthetic */ DownloadErrorType[] $values() {
            return new DownloadErrorType[]{LOCAL_FILE_UNAVAILABLE, PLAYER_CACHE_UNAVAILABLE, DATA_UNAVAILABLE};
        }

        public static InterfaceC2044707zh<DownloadErrorType> getEntries() {
            return $ENTRIES;
        }

        static {
            DownloadErrorType[] downloadErrorTypeArr$values = $values();
            $VALUES = downloadErrorTypeArr$values;
            $ENTRIES = new C2254308sP(downloadErrorTypeArr$values);
        }

        public static DownloadErrorType[] values() {
            return (DownloadErrorType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static DownloadErrorType valueOf(String str) {
            return (DownloadErrorType) C08FF.LIZ(DownloadErrorType.class, str);
        }

        public DownloadErrorType(String str, int i, int i2) {
            this.value = i2;
        }
    }

    void download(ForwardVideo forwardVideo, DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, boolean z, DownloadListener downloadListener);

    void downloadVideoWithTruncatedPreloadCache(ForwardVideo forwardVideo, DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, boolean z, long j, DownloadListener downloadListener);

    void partialDownload(ForwardVideo forwardVideo, DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, boolean z, DownloadListener downloadListener, long j);

    public static final class DownloadConfig {
        public final String cacheDir;
        public final String fileName;
        public final String filePath;
        public final long minDurationMs;
        public final boolean useStreamingEntry;
        public final boolean waitDownloadFinished;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DownloadConfig[cacheDir:");
            sbLIZ.append(this.cacheDir);
            sbLIZ.append(",fileName:");
            sbLIZ.append(this.fileName);
            sbLIZ.append(']');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public DownloadConfig(String str, String str2, String str3, boolean z, long j, boolean z2) {
            this.cacheDir = str;
            this.fileName = str2;
            this.filePath = str3;
            this.waitDownloadFinished = z;
            this.minDurationMs = j;
            this.useStreamingEntry = z2;
        }
    }

    /* JADX INFO: loaded from: classes31.dex */
    public interface DownloadListener {
        void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult);

        void onFileHeaderInfoReady(boolean z);

        void onSuccess(String str);

        public static final class DefaultImpls {
            public static /* synthetic */ void onError$default(DownloadListener downloadListener, int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 8) != 0) {
                        videoDownloadPartialResult = null;
                    }
                    downloadListener.onError(i, str, exc, videoDownloadPartialResult);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
            }
        }
    }

    public static final class DefaultImpls {
        public static void downloadVideoWithTruncatedPreloadCache(ForwardMediaDownloader forwardMediaDownloader, ForwardVideo forwardVideo, DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, boolean z, long j, DownloadListener downloadListener) {
            forwardMediaDownloader.download(forwardVideo, downloadConfig, videoDownloadPartialResult, z, downloadListener);
        }
    }
}
