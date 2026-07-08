package com.ss.android.ugc.aweme.shortvideo;

import X.C09CT;
import X.C2354709Kn;
import X.C2401009ay;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class CreateBaseAwemeResponse extends BaseResponse {

    @C09CT("creation_id")
    public String creationId;

    @C09CT("save_local_with_watermark")
    public boolean isSaveLocalWithWatermark;

    @C09CT("save_model")
    public AVUploadSaveModel mSaveModel;
    public transient String materialId;
    public int realVideoHeight;
    public int realVideoWidth;
    public List<String> videoCoverPaths = new ArrayList();

    public String getVideoCoverPath() {
        if (!C2401009ay.LIZ(this.videoCoverPaths) && C2354709Kn.LIZIZ((String) ListProtector.get(this.videoCoverPaths, 0))) {
            return (String) ListProtector.get(this.videoCoverPaths, 0);
        }
        return null;
    }

    public String getCreationId() {
        return this.creationId;
    }

    public AVUploadSaveModel getSaveModel() {
        return this.mSaveModel;
    }

    public List<String> getVideoCoverPaths() {
        return this.videoCoverPaths;
    }

    public boolean isSaveLocalWithWatermark() {
        return this.isSaveLocalWithWatermark;
    }

    public void setCreationId(String str) {
        this.creationId = str;
    }

    public void setSaveLocalWithWatermark(boolean z) {
        this.isSaveLocalWithWatermark = z;
    }

    public void setSaveModel(AVUploadSaveModel aVUploadSaveModel) {
        this.mSaveModel = aVUploadSaveModel;
    }

    public void setVideoCoverPath(String str) {
        List<String> list = this.videoCoverPaths;
        if (list == null) {
            this.videoCoverPaths = new ArrayList();
        } else {
            list.clear();
        }
        this.videoCoverPaths.add(str);
    }

    public void setVideoCoverPaths(List<String> list) {
        this.videoCoverPaths = list;
    }
}
