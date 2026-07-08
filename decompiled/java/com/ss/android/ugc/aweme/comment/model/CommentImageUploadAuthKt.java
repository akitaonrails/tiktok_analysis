package com.ss.android.ugc.aweme.comment.model;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class CommentImageUploadAuthKt {
    public static final boolean isValid(CommentImageUploadAuth commentImageUploadAuth) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (commentImageUploadAuth == null) {
            return false;
        }
        String accessKey = commentImageUploadAuth.getAccessKey();
        if (accessKey != null && accessKey.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z5 = !z;
        String secretKey = commentImageUploadAuth.getSecretKey();
        if (secretKey != null && secretKey.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z6 = z5 & (!z2);
        String sessionToken = commentImageUploadAuth.getSessionToken();
        if (sessionToken != null && sessionToken.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z7 = z6 & (!z3);
        if (commentImageUploadAuth.getExpiredTime() != 0) {
            z4 = true;
        }
        return z7 & z4;
    }

    public static final boolean isTypeValid(CommentImageUploadAuth commentImageUploadAuth, String str) {
        CommentBaseMediaUploadAuth commentBaseMediaUploadAuth;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String sessionToken;
        String secretKey;
        CommentBaseMediaUploadAuth next;
        boolean z5 = false;
        if (commentImageUploadAuth == null) {
            return false;
        }
        List<CommentBaseMediaUploadAuth> config = commentImageUploadAuth.getConfig();
        String accessKey = null;
        if (config != null) {
            Iterator<CommentBaseMediaUploadAuth> it2 = config.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getType(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            commentBaseMediaUploadAuth = next;
            if (commentBaseMediaUploadAuth != null) {
                accessKey = commentBaseMediaUploadAuth.getAccessKey();
            }
        } else {
            commentBaseMediaUploadAuth = null;
        }
        if (accessKey != null && accessKey.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z6 = !z;
        if (commentBaseMediaUploadAuth != null && (secretKey = commentBaseMediaUploadAuth.getSecretKey()) != null && secretKey.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z7 = z6 & (!z2);
        if (commentBaseMediaUploadAuth != null && (sessionToken = commentBaseMediaUploadAuth.getSessionToken()) != null && sessionToken.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z8 = z7 & (!z3);
        if (commentBaseMediaUploadAuth != null && Long.valueOf(commentBaseMediaUploadAuth.getExpiredTime()) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z9 = z8 & z4;
        if (commentBaseMediaUploadAuth != null && commentBaseMediaUploadAuth.getExpiredTime() == 0) {
            z5 = true;
        }
        return z9 & (true ^ z5);
    }
}
