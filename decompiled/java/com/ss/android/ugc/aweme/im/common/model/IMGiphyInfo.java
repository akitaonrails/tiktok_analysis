package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC451150Hmb;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IMGiphyInfo implements InterfaceC451150Hmb, Serializable {
    public final boolean LL;

    @C09CT("height")
    public final Integer height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("source")
    public final int source;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    @C09CT("info")
    public final IMTypingRecommendationStickerInfo typingRecommendationStickerInfo;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;

    public IMGiphyInfo() {
        this(null, null, null, null, null, null, false, 0, null);
    }

    public final IMGiphyInfo copy(String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z, int i, IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo) {
        return new IMGiphyInfo(str, str2, num, num2, str3, str4, z, i, iMTypingRecommendationStickerInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMGiphyInfo)) {
            return false;
        }
        IMGiphyInfo iMGiphyInfo = (IMGiphyInfo) obj;
        return Intrinsics.LJFF(this.id, iMGiphyInfo.id) && Intrinsics.LJFF(this.url, iMGiphyInfo.url) && Intrinsics.LJFF(this.width, iMGiphyInfo.width) && Intrinsics.LJFF(this.height, iMGiphyInfo.height) && Intrinsics.LJFF(this.type, iMGiphyInfo.type) && Intrinsics.LJFF(this.title, iMGiphyInfo.title) && this.LL == iMGiphyInfo.LL && this.source == iMGiphyInfo.source && Intrinsics.LJFF(this.typingRecommendationStickerInfo, iMGiphyInfo.typingRecommendationStickerInfo);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode6 = (((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.LL)) * 31) + this.source) * 31;
        IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo = this.typingRecommendationStickerInfo;
        return iHashCode6 + (iMTypingRecommendationStickerInfo != null ? iMTypingRecommendationStickerInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMGiphyInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", isFav=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", typingRecommendationStickerInfo=");
        sbLIZ.append(this.typingRecommendationStickerInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final IMTypingRecommendationStickerInfo getTypingRecommendationStickerInfo() {
        return this.typingRecommendationStickerInfo;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final boolean isFav() {
        return this.LL;
    }

    public IMGiphyInfo(String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z, int i, IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo) {
        this.id = str;
        this.url = str2;
        this.width = num;
        this.height = num2;
        this.type = str3;
        this.title = str4;
        this.LL = z;
        this.source = i;
        this.typingRecommendationStickerInfo = iMTypingRecommendationStickerInfo;
    }
}
