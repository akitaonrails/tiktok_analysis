package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import X.C09CT;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CutoutResult {
    public Location bbox;
    public String content;

    @C09CT("contours_point")
    public List<? extends List<Coordinate>> contoursPoint;

    public CutoutResult() {
        this("", new ArrayList(), null);
    }

    public final void setBbox(Location location) {
        this.bbox = location;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setContoursPoint(List<? extends List<Coordinate>> list) {
        this.contoursPoint = list;
    }

    public CutoutResult(String str, List<? extends List<Coordinate>> list, Location location) {
        this.content = str;
        this.contoursPoint = list;
        this.bbox = location;
    }
}
