package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2095008Iq;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class AVTextExtraStructHelper {
    public static final AVTextExtraStructHelper INSTANCE = new AVTextExtraStructHelper();

    public static final AVTextExtraStruct createCommentChainBoundaryStruct(String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 2;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(str);
        aVTextExtraStruct.setTransient(true);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createDuetChainBoundaryStruct(String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(str);
        aVTextExtraStruct.setTransient(true);
        aVTextExtraStruct.setDuet(true);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createStitchChainBoundaryStruct(String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(str);
        aVTextExtraStruct.setTransient(true);
        aVTextExtraStruct.setDuet(false);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct from(TextExtraStruct textExtraStruct) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.cid = textExtraStruct.getCid();
        aVTextExtraStruct.hashTagName = textExtraStruct.getHashTagName();
        aVTextExtraStruct.userId = textExtraStruct.getUserId();
        aVTextExtraStruct.atUserType = textExtraStruct.getAtUserType();
        aVTextExtraStruct.type = textExtraStruct.getType();
        aVTextExtraStruct.start = textExtraStruct.getStart();
        aVTextExtraStruct.end = textExtraStruct.getEnd();
        aVTextExtraStruct.awemeId = textExtraStruct.getAwemeId();
        aVTextExtraStruct.subType = textExtraStruct.getSubtype();
        aVTextExtraStruct.setSecUid(textExtraStruct.getSecUid());
        aVTextExtraStruct.commentId = textExtraStruct.getCommentId();
        return aVTextExtraStruct;
    }

    public final AVTextExtraStruct createPostCommentBoundaryStruct(String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 16;
        aVTextExtraStruct.start = 0;
        aVTextExtraStruct.end = INSTANCE.getChainTextLength(str);
        aVTextExtraStruct.setTransient(true);
        return aVTextExtraStruct;
    }

    public final int getChainTextLength(String str) {
        return a0.LJLILLLLZI(str).toString().length();
    }

    public static final AVTextExtraStruct createCommentStruct(int i, int i2, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 2;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createAtStruct(int i, int i2, String str, String str2) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        if (str2 == null) {
            str2 = "";
        }
        aVTextExtraStruct.setSecUid(str2);
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createDuetStruct(int i, int i2, String str, String str2) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        aVTextExtraStruct.awemeId = str2;
        return aVTextExtraStruct;
    }

    public final AVTextExtraStruct createPostCommentStruct(int i, int i2, String str, String str2) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 5;
        aVTextExtraStruct.subType = 16;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = "";
        aVTextExtraStruct.awemeId = str2;
        return aVTextExtraStruct;
    }

    public final AVTextExtraStruct createTextImageCommentStruct(int i, int i2, String str, String str2, String str3) {
        long jLongValue;
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 5;
        aVTextExtraStruct.subType = 6;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        aVTextExtraStruct.awemeId = str2;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str3);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        aVTextExtraStruct.commentId = jLongValue;
        return aVTextExtraStruct;
    }
}
