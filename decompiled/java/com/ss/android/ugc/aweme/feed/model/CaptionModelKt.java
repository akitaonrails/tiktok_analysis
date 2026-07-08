package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: loaded from: classes22.dex */
public final class CaptionModelKt {
    public static final Long getCreatorEditedCaptionIdIfExists(CaptionModel captionModel) {
        if (captionModel == null || captionModel.creatorEditedCaptionId == null) {
            return null;
        }
        Long l = captionModel.creatorEditedCaptionId;
        if (l != null && l.longValue() == 0) {
            return null;
        }
        return captionModel.creatorEditedCaptionId;
    }

    public static final Integer toColor(String str) {
        if (str != null && str.length() != 0) {
            return Integer.valueOf(ColorProtector.parseColor(str));
        }
        return null;
    }
}
