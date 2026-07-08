package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AVDraftAwemeCompat {

    @C09CT("cha_list")
    public List<? extends AVChallenge> challengeList;

    @C09CT("desc")
    public String desc;

    @C09CT("disable_delete_title_chain")
    public boolean isDisableDeleteTitleChain;

    @C09CT("text_extra")
    public List<AVTextExtraStruct> textExtra;

    @C09CT("title_chain")
    public String titleChain;

    @C09CT("video_length")
    public int videoLength;
}
