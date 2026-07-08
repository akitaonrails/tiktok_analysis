package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialContent {

    @C09CT("author")
    public final Author author;

    @C09CT("cameo")
    public final Map<String, Object> cameo;

    @C09CT("image")
    public final ImageBlock image;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    @C09CT("video")
    public final VideoBlock video;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialContent)) {
            return false;
        }
        MaterialContent materialContent = (MaterialContent) obj;
        return Intrinsics.LJFF(this.type, materialContent.type) && Intrinsics.LJFF(this.text, materialContent.text) && Intrinsics.LJFF(this.image, materialContent.image) && Intrinsics.LJFF(this.video, materialContent.video) && Intrinsics.LJFF(this.author, materialContent.author) && Intrinsics.LJFF(this.cameo, materialContent.cameo);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageBlock imageBlock = this.image;
        int iHashCode3 = (iHashCode2 + (imageBlock == null ? 0 : imageBlock.hashCode())) * 31;
        VideoBlock videoBlock = this.video;
        int iHashCode4 = (iHashCode3 + (videoBlock == null ? 0 : videoBlock.hashCode())) * 31;
        Author author = this.author;
        int iHashCode5 = (iHashCode4 + (author == null ? 0 : author.hashCode())) * 31;
        Map<String, Object> map = this.cameo;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialContent(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", cameo=");
        sbLIZ.append(this.cameo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MaterialContent(Integer num, String str, ImageBlock imageBlock, VideoBlock videoBlock, Author author, Map<String, ? extends Object> map) {
        this.type = num;
        this.text = str;
        this.image = imageBlock;
        this.video = videoBlock;
        this.author = author;
        this.cameo = map;
    }
}
