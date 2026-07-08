package com.ss.android.ugc.profile.business.profile.menu.business.content.business.base;

import X.C09CT;
import X.EnumC995430c0j;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellRichCardData implements Serializable {
    public static final int $stable = 8;

    @C09CT("lynx_cell_height")
    public final int cellHeight;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    @C09CT("minis_card")
    public final ContentCellMinisRichCardParams minisInfo;

    @C09CT("container_location")
    public final int style;

    @C09CT("container_lynx_view_location")
    public final Integer viewLocation;

    public ContentCellRichCardData() {
        this(EnumC995430c0j.CONTAINER_LOCATION_UNKNOWN.ordinal(), null, 44, "", new ContentCellMinisRichCardParams(null, null, null, 7, null));
    }

    public ContentCellRichCardData(int i, Integer num, int i2, String str, ContentCellMinisRichCardParams contentCellMinisRichCardParams) {
        this.style = i;
        this.viewLocation = num;
        this.cellHeight = i2;
        this.lynxSchema = str;
        this.minisInfo = contentCellMinisRichCardParams;
    }
}
