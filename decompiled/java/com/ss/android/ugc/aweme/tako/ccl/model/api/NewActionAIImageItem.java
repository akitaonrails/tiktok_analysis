package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class NewActionAIImageItem {

    @C09CT("convert_style")
    public final ConvertStyle convertStyle;

    @C09CT("draw_image")
    public final DrawImage drawImage;

    @C09CT("edit_image")
    public final DrawImage editImage;

    public NewActionAIImageItem() {
        this(null, null, null);
    }

    public final int hashCode() {
        DrawImage drawImage = this.drawImage;
        int iHashCode = (drawImage == null ? 0 : drawImage.hashCode()) * 31;
        DrawImage drawImage2 = this.editImage;
        int iHashCode2 = (iHashCode + (drawImage2 == null ? 0 : drawImage2.hashCode())) * 31;
        ConvertStyle convertStyle = this.convertStyle;
        return iHashCode2 + (convertStyle != null ? convertStyle.hashCode() : 0);
    }

    public NewActionAIImageItem(DrawImage drawImage, DrawImage drawImage2, ConvertStyle convertStyle) {
        this.drawImage = drawImage;
        this.editImage = drawImage2;
        this.convertStyle = convertStyle;
    }
}
