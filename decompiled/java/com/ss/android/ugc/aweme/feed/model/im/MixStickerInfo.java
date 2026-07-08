package com.ss.android.ugc.aweme.feed.model.im;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStickerInfo implements Serializable {

    @C09CT("data")
    public String data;

    @C09CT("elements")
    public List<AwemeMixStickerElement> elements = C13BV.INSTANCE;

    @C09CT("id_type")
    public Integer idType;

    @C09CT("is_animation_sticker")
    public Boolean isAnimated;

    @C09CT("sticker_id")
    public Long stickerId;

    @C09CT("sticker_urls")
    public List<String> stickerUrls;

    @C09CT("type")
    public Integer type;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStickerInfo{type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", stickerUrls=");
        sbLIZ.append(this.stickerUrls);
        sbLIZ.append(", isAnimated=");
        sbLIZ.append(this.isAnimated);
        sbLIZ.append(", idType=");
        sbLIZ.append(this.idType);
        sbLIZ.append(", elements=");
        sbLIZ.append(this.elements);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getData() {
        return this.data;
    }

    public final List<AwemeMixStickerElement> getElements() {
        return this.elements;
    }

    public final Integer getIdType() {
        return this.idType;
    }

    public final Long getStickerId() {
        return this.stickerId;
    }

    public final List<String> getStickerUrls() {
        return this.stickerUrls;
    }

    public final Integer getType() {
        return this.type;
    }

    public final Boolean isAnimated() {
        return this.isAnimated;
    }

    public final void setAnimated(Boolean bool) {
        this.isAnimated = bool;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setElements(List<AwemeMixStickerElement> list) {
        this.elements = list;
    }

    public final void setIdType(Integer num) {
        this.idType = num;
    }

    public final void setStickerId(Long l) {
        this.stickerId = l;
    }

    public final void setStickerUrls(List<String> list) {
        this.stickerUrls = list;
    }

    public final void setType(Integer num) {
        this.type = num;
    }
}
