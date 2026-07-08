package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC384940F7k;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PoiStickerStruct implements Serializable, InterfaceC384940F7k {

    @C09CT("end_time")
    public int endTime;

    @C09CT("poi_data")
    public PoiData poiData;

    @C09CT("poi_id")
    public String poiId;

    @C09CT("start_time")
    public int startTime;

    @C09CT("sticker_theme")
    public int stickerTheme;

    @C09CT("text_size")
    public float textSize;

    public PoiStickerStruct() {
    }

    public final PoiStickerStruct copy(String str) {
        return new PoiStickerStruct(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiStickerStruct) && Intrinsics.LJFF(this.poiId, ((PoiStickerStruct) obj).poiId);
    }

    public int hashCode() {
        return this.poiId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiStickerStruct(poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final PoiData getPoiData() {
        return this.poiData;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getStickerTheme() {
        return this.stickerTheme;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public PoiStickerStruct(String str) {
        this.poiId = str;
        this.stickerTheme = 1;
        this.textSize = 30.0f;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setPoiData(PoiData poiData) {
        this.poiData = poiData;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setStickerTheme(int i) {
        this.stickerTheme = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }
}
