package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class QueryAudioResponse {

    @C09CT("code")
    public int code;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("message")
    public String message = "";

    @C09CT("utterances")
    public List<Utterance> mList = C13BV.INSTANCE;

    @C09CT("lid_language")
    public String lidLanguage = "";

    @C09CT("asr_service")
    public String asrService = "";
}
