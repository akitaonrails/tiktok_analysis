package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.C09CT;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class VCAudioResponse extends BaseNetResponse {

    @C09CT("extra")
    public final VCExtra extra;

    @C09CT("results")
    public final List<VCAudioResult> results = new ArrayList();

    @C09CT("status_msg")
    public String statusMsg;
}
