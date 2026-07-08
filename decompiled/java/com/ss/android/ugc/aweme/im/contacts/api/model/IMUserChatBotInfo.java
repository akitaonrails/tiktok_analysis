package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class IMUserChatBotInfo implements Serializable {

    @C09CT("digital_creator_info")
    public final IMUserDigitalCreatorInfo digitalCreatorInfo;

    @C09CT("type")
    public final int type;

    public IMUserChatBotInfo() {
        this(null, 0);
    }

    public IMUserChatBotInfo(IMUserDigitalCreatorInfo iMUserDigitalCreatorInfo, int i) {
        this.digitalCreatorInfo = iMUserDigitalCreatorInfo;
        this.type = i;
    }
}
