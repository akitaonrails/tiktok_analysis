package com.ss.android.ugc.aweme.sticker;

import X.C04TD;
import X.C1611300s24;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.ISecretRepliesStickerRecordService;

/* JADX INFO: loaded from: classes30.dex */
public final class SecretRepliesStickerRecordServiceImpl implements ISecretRepliesStickerRecordService {
    public static ISecretRepliesStickerRecordService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ISecretRepliesStickerRecordService.class, false);
        if (objLIZ != null) {
            return (ISecretRepliesStickerRecordService) objLIZ;
        }
        if (C04TD.w5 == null) {
            synchronized (ISecretRepliesStickerRecordService.class) {
                if (C04TD.w5 == null) {
                    C04TD.w5 = new SecretRepliesStickerRecordServiceImpl();
                }
            }
        }
        return C04TD.w5;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.ISecretRepliesStickerRecordService
    public final C1611300s24 LIZ(Context context, Aweme aweme, SecretRepliesRecordParam secretRepliesRecordParam) {
        SecretRepliesStickerStruct secretRepliesStickerStructCopy;
        SecretRepliesStickerStruct secretRepliesStickerStruct = secretRepliesRecordParam.getSecretRepliesStickerStruct();
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStructCopy = null;
        if (secretRepliesStickerStruct != null) {
            secretRepliesStickerStructCopy = secretRepliesStickerStruct.copy(secretRepliesStickerStruct.questionText);
        } else {
            secretRepliesStickerStructCopy = null;
        }
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = secretRepliesRecordParam.getSecretRepliesResponseStickerStruct();
        if (secretRepliesResponseStickerStruct != null) {
            secretRepliesResponseStickerStructCopy = secretRepliesResponseStickerStruct.copy(secretRepliesResponseStickerStruct.baseAwemeId, secretRepliesResponseStickerStruct.questionText, secretRepliesResponseStickerStruct.responseText);
        }
        return new C1611300s24(context, secretRepliesRecordParam.copy(secretRepliesStickerStructCopy, secretRepliesResponseStickerStructCopy));
    }
}
