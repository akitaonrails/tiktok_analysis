package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class FeedbackBody {

    @C09CT("utterances")
    public List<Utterance> mUtterances;

    @C09CT("vid")
    public String vid;

    public FeedbackBody(String str, List<Utterance> list) {
        this.vid = "";
        this.vid = str;
        this.mUtterances = list;
    }
}
