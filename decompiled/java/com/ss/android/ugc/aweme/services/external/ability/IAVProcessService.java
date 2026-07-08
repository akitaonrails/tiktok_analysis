package com.ss.android.ugc.aweme.services.external.ability;

import X.C2188811AlT;
import android.graphics.Bitmap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public interface IAVProcessService {

    public interface IConvertImageToVideoCallback {
        void onFailure();

        void onProgress(float f);

        void onSuccess(String str);
    }

    public interface IProcessCallback<T> {
        void finish(T t);
    }

    Pair<Integer, Integer> calculateGradientBackground(Bitmap bitmap);

    void compressPhoto(String str, Integer num, Integer num2, IProcessCallback<String> iProcessCallback);

    void convertImageToVideo(String str, String str2, String str3, long j, int i, IConvertImageToVideoCallback iConvertImageToVideoCallback);

    void convertLivePhotoToVideo(String str, String str2, String str3, long j, int i, int i2, IConvertImageToVideoCallback iConvertImageToVideoCallback);

    int[] getVideoFileInfo(String str);

    void muteVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback);

    public static final class CompileParam {
        public final String rawVideoPath;
        public int videoHeight;
        public int videoWidth;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CompileParam{rawVideoPath=");
            sbLIZ.append(this.rawVideoPath);
            sbLIZ.append(", videoWidth=");
            sbLIZ.append(this.videoWidth);
            sbLIZ.append(", videoHeight=");
            sbLIZ.append(this.videoHeight);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getRawVideoPath() {
            return this.rawVideoPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }

        public CompileParam(String str, int i, int i2) {
            this.rawVideoPath = str;
            this.videoWidth = i;
            this.videoHeight = i2;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class CompileResult {
        public String checkPic;
        public String thumbnailPath;
        public String videoMd5;
        public String videoPath;
        public int videoWidth = -1;
        public int videoHeight = -1;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CompileResult{videoPath=");
            sbLIZ.append(this.videoPath);
            sbLIZ.append(", videoMd5=");
            sbLIZ.append(this.videoMd5);
            sbLIZ.append(", checkPic=");
            sbLIZ.append(this.checkPic);
            sbLIZ.append(", thumbnailPath=");
            sbLIZ.append(this.thumbnailPath);
            sbLIZ.append(", width=");
            sbLIZ.append(this.videoWidth);
            sbLIZ.append(", height=");
            sbLIZ.append(this.videoHeight);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getCheckPic() {
            return this.checkPic;
        }

        public final String getThumbnailPath() {
            return this.thumbnailPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final String getVideoMd5() {
            return this.videoMd5;
        }

        public final String getVideoPath() {
            return this.videoPath;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final void setCheckPic(String str) {
            this.checkPic = str;
        }

        public final void setThumbnailPath(String str) {
            this.thumbnailPath = str;
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoMd5(String str) {
            this.videoMd5 = str;
        }

        public final void setVideoPath(String str) {
            this.videoPath = str;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }
    }
}
