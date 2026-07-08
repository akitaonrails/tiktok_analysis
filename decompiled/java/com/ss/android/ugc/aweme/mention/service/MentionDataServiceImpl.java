package com.ss.android.ugc.aweme.mention.service;

import android.content.Intent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MentionDataServiceImpl implements IMentionDataService {
    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final User LIZ(Intent intent) {
        if (intent == null) {
            return null;
        }
        Serializable serializableExtra = intent.getSerializableExtra("extra_data");
        if (!(serializableExtra instanceof User)) {
            return null;
        }
        return (User) serializableExtra;
    }
}
