package com.ss.android.ugc.aweme.services.now.model;

import com.ss.android.ugc.aweme.creative.model.NowsShootModel;

/* JADX INFO: loaded from: classes9.dex */
public final class CreativeNowDraftKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap getBackBitmap(com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft r1) {
        /*
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r1 = r1.nowsShootData
            if (r1 == 0) goto L10
            android.graphics.Bitmap r0 = r1.backBitmap
            if (r0 != 0) goto L16
            java.lang.String r0 = r1.backImageSharePath
            if (r0 != 0) goto L12
            java.lang.String r0 = r1.backImagePath
            if (r0 != 0) goto L12
        L10:
            java.lang.String r0 = ""
        L12:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
        L16:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.now.model.CreativeNowDraftKt.getBackBitmap(com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap getFrontBitmap(com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft r1) {
        /*
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r1 = r1.nowsShootData
            if (r1 == 0) goto L10
            android.graphics.Bitmap r0 = r1.frontBitmap
            if (r0 != 0) goto L16
            java.lang.String r0 = r1.frontImageSharePath
            if (r0 != 0) goto L12
            java.lang.String r0 = r1.frontImagePath
            if (r0 != 0) goto L12
        L10:
            java.lang.String r0 = ""
        L12:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
        L16:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.now.model.CreativeNowDraftKt.getFrontBitmap(com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft):android.graphics.Bitmap");
    }

    public static final int getType(CreativeNowDraft creativeNowDraft) {
        NowsShootModel nowsShootModel = creativeNowDraft.nowsShootData;
        if (nowsShootModel != null) {
            return nowsShootModel.type;
        }
        return 0;
    }

    public static final boolean isPhotoDraft(CreativeNowDraft creativeNowDraft) {
        if (getType(creativeNowDraft) == 0) {
            return true;
        }
        return false;
    }
}
