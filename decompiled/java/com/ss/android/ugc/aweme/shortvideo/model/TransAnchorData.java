package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C1697810uHb;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TransAnchorData implements Parcelable {

    @C09CT("add_time")
    public final Long addTime;

    @C09CT("anchor_content")
    public final String anchorContent;

    @C09CT("anchor_icon")
    public final UrlModel anchorIcon;

    @C09CT("anchor_icon_raw")
    public final Integer anchorIconRaw;

    @C09CT("anchor_tag")
    public final String anchorTag;

    @C09CT("business_type")
    public final int businessType;

    @C09CT("can_delete")
    public final boolean canDelete;

    @C09CT("extra")
    public final String extra;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("language")
    public final String language;

    @C09CT("source")
    public final Integer source;

    @C09CT("subtype")
    public final String subtype;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<TransAnchorData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<TransAnchorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransAnchorData createFromParcel(Parcel parcel) {
            return new TransAnchorData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransAnchorData[] newArray(int i) {
            return new TransAnchorData[i];
        }
    }

    public final TransAnchorData copy(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, Integer num2) {
        return new TransAnchorData(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransAnchorData)) {
            return false;
        }
        TransAnchorData transAnchorData = (TransAnchorData) obj;
        return this.businessType == transAnchorData.businessType && Intrinsics.LJFF(this.anchorContent, transAnchorData.anchorContent) && Intrinsics.LJFF(this.title, transAnchorData.title) && Intrinsics.LJFF(this.anchorTag, transAnchorData.anchorTag) && Intrinsics.LJFF(this.source, transAnchorData.source) && Intrinsics.LJFF(this.id, transAnchorData.id) && Intrinsics.LJFF(this.anchorIcon, transAnchorData.anchorIcon) && this.canDelete == transAnchorData.canDelete && Intrinsics.LJFF(this.url, transAnchorData.url) && Intrinsics.LJFF(this.language, transAnchorData.language) && Intrinsics.LJFF(this.addTime, transAnchorData.addTime) && Intrinsics.LJFF(this.extra, transAnchorData.extra) && Intrinsics.LJFF(this.subtype, transAnchorData.subtype) && Intrinsics.LJFF(this.anchorIconRaw, transAnchorData.anchorIconRaw);
    }

    public int hashCode() {
        int iHashCode = ((this.businessType * 31) + this.anchorContent.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.anchorTag;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.source;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.anchorIcon;
        int iHashCode6 = (((iHashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + C786410Ut5.Z2(this.canDelete)) * 31;
        String str4 = this.url;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.language;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.addTime;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.extra;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subtype;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.anchorIconRaw;
        return iHashCode11 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "TransAnchorData(businessType=" + this.businessType + ", anchorContent=" + this.anchorContent + ", title=" + this.title + ", anchorTag=" + this.anchorTag + ", source=" + this.source + ", id=" + this.id + ", anchorIcon=" + this.anchorIcon + ", canDelete=" + this.canDelete + ", url=" + this.url + ", language=" + this.language + ", addTime=" + this.addTime + ", extra=" + this.extra + ", subtype=" + this.subtype + ", anchorIconRaw=" + this.anchorIconRaw + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.businessType);
        parcel.writeString(this.anchorContent);
        parcel.writeString(this.title);
        parcel.writeString(this.anchorTag);
        Integer num = this.source;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.id);
        parcel.writeSerializable(this.anchorIcon);
        parcel.writeInt(this.canDelete ? 1 : 0);
        parcel.writeString(this.url);
        parcel.writeString(this.language);
        Long l = this.addTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.extra);
        parcel.writeString(this.subtype);
        Integer num2 = this.anchorIconRaw;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final String getAnchorContent() {
        return this.anchorContent;
    }

    public final UrlModel getAnchorIcon() {
        return this.anchorIcon;
    }

    public final Integer getAnchorIconRaw() {
        return this.anchorIconRaw;
    }

    public final String getAnchorTag() {
        return this.anchorTag;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public static final class Companion {
        public final TransAnchorData transFromCreateAnchorInfo(CreateAnchorInfo createAnchorInfo) {
            int type = createAnchorInfo.getType();
            String content = createAnchorInfo.getContent();
            String keyword = createAnchorInfo.getKeyword();
            UrlModel urlModel = new UrlModel();
            boolean zBooleanValue = true;
            urlModel.setUrlList(C1697810uHb.LJ(createAnchorInfo.getIconUrl()));
            urlModel.setUri(Uri.decode(createAnchorInfo.getIconUrl()));
            String url = createAnchorInfo.getUrl();
            String extra = createAnchorInfo.getExtra();
            Boolean canDelete = createAnchorInfo.getCanDelete();
            if (canDelete != null) {
                zBooleanValue = canDelete.booleanValue();
            }
            return new TransAnchorData(type, content, keyword, "", 0, "", urlModel, zBooleanValue, url, "", Long.MAX_VALUE, extra, "", createAnchorInfo.getIconRawId());
        }
    }

    public TransAnchorData(int i, String str) {
        this(i, str, "", "", 0, "", null, true, "", "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2) {
        this(i, str, str2, "", 0, "", null, true, "", "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, 0, "", null, true, "", "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num) {
        this(i, str, str2, str3, num, "", null, true, "", "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4) {
        this(i, str, str2, str3, num, str4, null, true, "", "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel) {
        this(i, str, str2, str3, num, str4, urlModel, true, "", "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z) {
        this(i, str, str2, str3, num, str4, urlModel, z, "", "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, "", Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, Long.MAX_VALUE, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, "", "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, "", null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8, null);
    }

    public TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, Integer num2) {
        this.businessType = i;
        this.anchorContent = str;
        this.title = str2;
        this.anchorTag = str3;
        this.source = num;
        this.id = str4;
        this.anchorIcon = urlModel;
        this.canDelete = z;
        this.url = str5;
        this.language = str6;
        this.addTime = l;
        this.extra = str7;
        this.subtype = str8;
        this.anchorIconRaw = num2;
    }
}
