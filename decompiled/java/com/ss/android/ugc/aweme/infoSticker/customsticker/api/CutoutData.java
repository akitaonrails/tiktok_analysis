package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CutoutData {
    public List<? extends List<Coordinate>> contours;
    public File image;
    public Location location;

    public CutoutData() {
        this(null, new ArrayList(), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutoutData)) {
            return false;
        }
        CutoutData cutoutData = (CutoutData) obj;
        return Intrinsics.LJFF(this.image, cutoutData.image) && Intrinsics.LJFF(this.contours, cutoutData.contours) && Intrinsics.LJFF(this.location, cutoutData.location);
    }

    public final boolean checkData() {
        return (this.location == null || !(this.contours.isEmpty() ^ true) || this.image == null) ? false : true;
    }

    public final void setContours(List<? extends List<Coordinate>> list) {
        this.contours = list;
    }

    public final void setImage(File file) {
        this.image = file;
    }

    public final void setLocation(Location location) {
        this.location = location;
    }

    public CutoutData(File file, List<? extends List<Coordinate>> list, Location location) {
        this.image = file;
        this.contours = list;
        this.location = location;
    }
}
