package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CommentPublishRequestModel extends BaseCommentPublishRequestModel {

    @C09CT("ad_creative_id")
    public Long creativeId;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("image_extra")
    public List<CommentImageModel> imageList;

    @C09CT("sticker_info")
    public CommentStickerInfo stickerInfo;

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public List<CommentImageModel> getImageList() {
        return this.imageList;
    }

    public CommentStickerInfo getStickerInfo() {
        return this.stickerInfo;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public void setImageList(List<CommentImageModel> list) {
        this.imageList = list;
    }

    public void setStickerInfo(CommentStickerInfo commentStickerInfo) {
        this.stickerInfo = commentStickerInfo;
    }
}
