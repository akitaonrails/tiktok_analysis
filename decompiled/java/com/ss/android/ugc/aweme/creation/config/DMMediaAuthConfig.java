package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class DMMediaAuthConfig extends BaseResponse implements Serializable {

    @C09CT("image_upload_config")
    public final DMImageAuthConfig imageUploadConfig;

    @C09CT("upload_scene")
    public final int uploadScene;

    @C09CT("video_upload_config")
    public final DMVideoAuthConfig videoUploadConfig;

    public final DMMediaAuthConfig copy(int i, DMVideoAuthConfig dMVideoAuthConfig, DMImageAuthConfig dMImageAuthConfig) {
        return new DMMediaAuthConfig(i, dMVideoAuthConfig, dMImageAuthConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMMediaAuthConfig)) {
            return false;
        }
        DMMediaAuthConfig dMMediaAuthConfig = (DMMediaAuthConfig) obj;
        return this.uploadScene == dMMediaAuthConfig.uploadScene && Intrinsics.LJFF(this.videoUploadConfig, dMMediaAuthConfig.videoUploadConfig) && Intrinsics.LJFF(this.imageUploadConfig, dMMediaAuthConfig.imageUploadConfig);
    }

    public int hashCode() {
        int i = this.uploadScene * 31;
        DMVideoAuthConfig dMVideoAuthConfig = this.videoUploadConfig;
        int iHashCode = (i + (dMVideoAuthConfig == null ? 0 : dMVideoAuthConfig.hashCode())) * 31;
        DMImageAuthConfig dMImageAuthConfig = this.imageUploadConfig;
        return iHashCode + (dMImageAuthConfig != null ? dMImageAuthConfig.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMMediaAuthConfig(uploadScene=");
        sbLIZ.append(this.uploadScene);
        sbLIZ.append(", videoUploadConfig=");
        sbLIZ.append(this.videoUploadConfig);
        sbLIZ.append(", imageUploadConfig=");
        sbLIZ.append(this.imageUploadConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DMImageAuthConfig getImageUploadConfig() {
        return this.imageUploadConfig;
    }

    public final int getUploadScene() {
        return this.uploadScene;
    }

    public final DMVideoAuthConfig getVideoUploadConfig() {
        return this.videoUploadConfig;
    }

    public DMMediaAuthConfig(int i, DMVideoAuthConfig dMVideoAuthConfig, DMImageAuthConfig dMImageAuthConfig) {
        this.uploadScene = i;
        this.videoUploadConfig = dMVideoAuthConfig;
        this.imageUploadConfig = dMImageAuthConfig;
    }
}
