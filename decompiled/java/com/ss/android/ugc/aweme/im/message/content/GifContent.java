package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class GifContent extends BaseContent {

    @C09CT("attachment")
    public FeatureAttachmentContent attachment;

    @C09CT("display_name")
    public String displayName;

    @C09CT("header")
    public BaseHeader header;

    @C09CT("height")
    public int height;

    @C09CT("image_id")
    public long imageId;

    @C09CT("image_type")
    public String imageType;

    @C09CT("isUpdateConversationTime")
    public boolean isUpdateConversationTime = true;

    @C09CT("package_id")
    public long packageId;

    @C09CT("static_url")
    public UrlModel staticUrl;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("url")
    public UrlModel url;

    @C09CT("version")
    public String version;

    @C09CT("width")
    public int width;

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        UrlModel urlModel = this.url;
        if (urlModel != null) {
            return Collections.singletonList(urlModel);
        }
        return null;
    }

    public final FeatureAttachmentContent getAttachment() {
        return this.attachment;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final BaseHeader getHeader() {
        return this.header;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final long getPackageId() {
        return this.packageId;
    }

    public final UrlModel getStaticUrl() {
        return this.staticUrl;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final UrlModel getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isUpdateConversationTime() {
        return this.isUpdateConversationTime;
    }

    public final void setAttachment(FeatureAttachmentContent featureAttachmentContent) {
        this.attachment = featureAttachmentContent;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setHeader(BaseHeader baseHeader) {
        this.header = baseHeader;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setImageId(long j) {
        this.imageId = j;
    }

    public final void setImageType(String str) {
        this.imageType = str;
    }

    public final void setPackageId(long j) {
        this.packageId = j;
    }

    public final void setStaticUrl(UrlModel urlModel) {
        this.staticUrl = urlModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setUpdateConversationTime(boolean z) {
        this.isUpdateConversationTime = z;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
