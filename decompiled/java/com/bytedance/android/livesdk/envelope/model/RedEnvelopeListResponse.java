package com.bytedance.android.livesdk.envelope.model;

import X.C09CT;
import com.bytedance.android.livesdk.envelope.model.EnvelopeListResponse;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class RedEnvelopeListResponse {

    @C09CT("envelope_infos")
    public List<RedEnvelopInfo> envelopList;

    @C09CT("extra_info")
    public EnvelopeListResponse.ExtraInfo extraInfo;

    @C09CT("message")
    public String message;

    @C09CT("prompts")
    public String prompts;

    public RedEnvelopeListResponse() {
        this(null, "", "", null);
    }

    public RedEnvelopeListResponse(List<RedEnvelopInfo> list, String str, String str2, EnvelopeListResponse.ExtraInfo extraInfo) {
        this.envelopList = list;
        this.message = str;
        this.prompts = str2;
        this.extraInfo = extraInfo;
    }
}
