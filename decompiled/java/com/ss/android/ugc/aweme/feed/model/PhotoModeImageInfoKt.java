package com.ss.android.ugc.aweme.feed.model;

import X.C13LP;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.ImagePreviewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeImageInfoKt {
    public static final boolean hasBlurHash(PhotoModeImageInfo photoModeImageInfo) {
        List<PhotoModeImageUrlModel> imageList;
        ImagePreviewModel previewModel;
        String data;
        ImagePreviewModel previewModel2;
        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.isEmpty()) {
            return false;
        }
        for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
            UrlModel urlModel = photoModeImageUrlModel.displayImageNoWatermark;
            if (urlModel == null || (previewModel2 = urlModel.getPreviewModel()) == null || previewModel2.getPreviewType() != 0) {
                UrlModel urlModel2 = photoModeImageUrlModel.displayImageNoWatermark;
                if (urlModel2 != null && (previewModel = urlModel2.getPreviewModel()) != null && (data = previewModel.getData()) != null && data.length() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean hasLocalImagePath(PhotoModeImageInfo photoModeImageInfo) {
        List<PhotoModeImageUrlModel> imageList;
        Boolean boolValueOf;
        boolean z;
        List<String> urlList;
        String str;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                UrlModel urlModel = photoModeImageUrlModel.displayImageNoWatermark;
                if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                    boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(str, "file://", false));
                } else {
                    boolValueOf = null;
                }
                if (photoModeImageUrlModel.sourceFrom == PhotoSourceFromScene.PUBLISH) {
                    z = true;
                } else {
                    z = false;
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || z) {
                    return true;
                }
            }
        }
        return false;
    }
}
