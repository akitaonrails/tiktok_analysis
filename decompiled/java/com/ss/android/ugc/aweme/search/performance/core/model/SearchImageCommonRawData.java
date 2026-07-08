package com.ss.android.ugc.aweme.search.performance.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.model.LynxImageUrl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchImageCommonRawData implements Serializable {
    public static final int $stable = 8;

    @C09CT(alternate = {"music_list", "display"}, value = "user_list")
    public List<LynxImageUrl> lynxImageUrl = new ArrayList();

    public final List<LynxImageUrl> getLynxImageUrl() {
        return this.lynxImageUrl;
    }

    public final void setLynxImageUrl(List<LynxImageUrl> list) {
        this.lynxImageUrl = list;
    }
}
