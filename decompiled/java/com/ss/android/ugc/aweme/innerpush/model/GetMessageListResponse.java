package com.ss.android.ugc.aweme.innerpush.model;

import X.C09CT;
import X.InterfaceC2337209Du;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.SettingMessage;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class GetMessageListResponse extends BaseResponse implements InterfaceC2337209Du {
    public String LL;

    @C09CT("messages")
    public final List<InnerPushMessage> messages;

    @C09CT("setting_messages")
    public final List<SettingMessage> settingMessages;

    public GetMessageListResponse() {
        this(null, null);
    }

    @Override // X.InterfaceC2337209Du
    public final void setJsonData(String str) {
        this.LL = str;
    }

    public GetMessageListResponse(List<InnerPushMessage> list, List<SettingMessage> list2) {
        this.messages = list;
        this.settingMessages = list2;
    }
}
