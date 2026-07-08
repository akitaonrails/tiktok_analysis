package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicFrameInfo implements Serializable {

    @C09CT("bbox")
    public TagBoundBoxStruct bbox;

    @C09CT("frame_time")
    public Long frameTime;

    @C09CT("tag_coord")
    public VTagCoordStruct tagCoordinate;

    public DynamicFrameInfo() {
    }

    public DynamicFrameInfo(Long l, VTagCoordStruct vTagCoordStruct, TagBoundBoxStruct tagBoundBoxStruct) {
        this.frameTime = l;
        this.tagCoordinate = vTagCoordStruct;
        this.bbox = tagBoundBoxStruct;
    }
}
