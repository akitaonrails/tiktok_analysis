package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AutoPopupActionModel implements Serializable {

    @C09CT("auto_popup_refer_list")
    public final List<String> autoPopUpReferList;

    @C09CT("auto_popup_in_all_refer")
    public final boolean autoPopupInAllRefer;

    @C09CT("auto_popup_in_all_refer_time_interval")
    public final long autoPopupInAllReferTimeInterval;

    @C09CT("jump_data")
    public final AutoPopupLynxJumpData jumpData;

    public AutoPopupActionModel() {
        this(null, null, false, 0L);
    }

    public AutoPopupActionModel(AutoPopupLynxJumpData autoPopupLynxJumpData, List<String> list, boolean z, long j) {
        this.jumpData = autoPopupLynxJumpData;
        this.autoPopUpReferList = list;
        this.autoPopupInAllRefer = z;
        this.autoPopupInAllReferTimeInterval = j;
    }
}
