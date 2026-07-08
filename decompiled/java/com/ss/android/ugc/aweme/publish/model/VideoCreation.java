package com.ss.android.ugc.aweme.publish.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class VideoCreation extends BaseResponse {
    public PublishImageModel imageCoverModel;
    public String mCoverTextImageUri;
    public String mCoverUri;

    @C09CT("material_id")
    public String materialId;
    public int videoHeight;
    public int videoWidth;
    public List<PublishImageModel> imageGroup = new ArrayList();
    public List<PublishImageModel> dynamicImages = new ArrayList();

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCreation{mCoverUri='");
        sbLIZ.append(this.mCoverUri);
        sbLIZ.append('\'');
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.videoWidth);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.videoHeight);
        sbLIZ.append(", mCoverTextImageUri='");
        sbLIZ.append(this.mCoverTextImageUri);
        sbLIZ.append('\'');
        sbLIZ.append(", materialId='");
        sbLIZ.append(this.materialId);
        sbLIZ.append('\'');
        sbLIZ.append(", imageGroup='");
        sbLIZ.append(this.imageGroup);
        sbLIZ.append('\'');
        sbLIZ.append(", imageCoverModel='");
        sbLIZ.append(this.imageCoverModel);
        sbLIZ.append('\'');
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", error_code=");
        sbLIZ.append(this.error_code);
        sbLIZ.append(", message='");
        sbLIZ.append(this.message);
        sbLIZ.append('\'');
        sbLIZ.append(", status_msg='");
        sbLIZ.append(this.status_msg);
        sbLIZ.append('\'');
        sbLIZ.append(", prompts='");
        sbLIZ.append(this.prompts);
        sbLIZ.append('\'');
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append('\'');
        sbLIZ.append(", dynamicImages=");
        sbLIZ.append(this.dynamicImages);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getCoverTextImageUri() {
        return this.mCoverTextImageUri;
    }

    public String getCoverUri() {
        return this.mCoverUri;
    }

    public List<PublishImageModel> getDynamicImages() {
        return this.dynamicImages;
    }

    public PublishImageModel getImageCoverModel() {
        return this.imageCoverModel;
    }

    public List<PublishImageModel> getImageGroup() {
        return this.imageGroup;
    }

    public String getMaterialId() {
        return this.materialId;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public VideoCreation setCoverTextImageUri(String str) {
        this.mCoverTextImageUri = str;
        return this;
    }

    public VideoCreation setCoverUri(String str) {
        this.mCoverUri = str;
        return this;
    }

    public void setDynamicImages(List<PublishImageModel> list) {
        this.dynamicImages = list;
    }

    public void setImageCoverModel(PublishImageModel publishImageModel) {
        this.imageCoverModel = publishImageModel;
    }

    public void setImageGroup(List<PublishImageModel> list) {
        this.imageGroup = list;
    }

    public VideoCreation setMaterialId(String str) {
        this.materialId = str;
        return this;
    }

    public VideoCreation setVideoHeight(int i) {
        this.videoHeight = i;
        return this;
    }

    public VideoCreation setVideoWidth(int i) {
        this.videoWidth = i;
        return this;
    }
}
