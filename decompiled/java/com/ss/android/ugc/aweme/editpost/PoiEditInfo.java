package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class PoiEditInfo implements Serializable {

    @C09CT("anchor_content")
    public final CreateAnchorInfo createAnchorInfo;

    @C09CT("action")
    public final int editAction;

    @C09CT("poi_id")
    public final String poiId;

    public PoiEditInfo(int i, String str, CreateAnchorInfo createAnchorInfo) {
        this.editAction = i;
        this.poiId = str;
        this.createAnchorInfo = createAnchorInfo;
    }
}
