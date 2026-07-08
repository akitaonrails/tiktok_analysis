package com.ss.android.ugc.aweme.comment.model;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentExtKt {
    public static final String getPhotoType(Comment comment) {
        if (comment.getIsPhotoContained() == 0) {
            return "";
        }
        if (Intrinsics.LJFF(isAIImageComment(comment), Boolean.TRUE)) {
            return "visual_poet";
        }
        return "upload";
    }

    public static final Boolean isAIImageComment(Comment comment) {
        List<CommentImageStruct> imageList;
        if (comment != null && (imageList = comment.getImageList()) != null) {
            boolean z = false;
            if (!imageList.isEmpty()) {
                Iterator<CommentImageStruct> it2 = imageList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CommentImageStruct next = it2.next();
                    if (next != null && next.isAIImageComment()) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return null;
    }
}
