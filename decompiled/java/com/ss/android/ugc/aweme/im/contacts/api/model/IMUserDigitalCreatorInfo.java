package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class IMUserDigitalCreatorInfo implements Serializable {

    @C09CT("creator_uid")
    public final long creatorUid;

    @C09CT("speaker_id")
    public final String speakerId;

    public IMUserDigitalCreatorInfo() {
        this(0L, "");
    }

    public IMUserDigitalCreatorInfo(long j, String str) {
        this.creatorUid = j;
        this.speakerId = str;
    }
}
