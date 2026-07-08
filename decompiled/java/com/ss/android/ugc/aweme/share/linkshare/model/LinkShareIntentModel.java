package com.ss.android.ugc.aweme.share.linkshare.model;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import X.EnumC21376718lB;
import X.EnumC2198891B4d;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class LinkShareIntentModel implements Parcelable {

    @C09CT("backgroundColor")
    public final LinkShareData.BackgroundColor backgroundColor;

    @C09CT("backgroundImagePath")
    public final String backgroundImagePath;

    @C09CT("clientKey")
    public final String clientKey;

    @C09CT("coverImageSize")
    public final EnumC21376718lB coverImageSize;

    @C09CT("creativeInfo")
    public final CreativeInfo creativeInfo;

    @C09CT("entityUri")
    public final String entityUri;

    @C09CT("isShareToStoryOnly")
    public final boolean isShareToStoryOnly;

    @C09CT("link")
    public final String link;

    @C09CT("mediaUriPaths")
    public List<String> mediaUriPaths;

    @C09CT("musicId")
    public String musicId;

    @C09CT("musicMetadata")
    public final String musicMetadata;

    @C09CT("musicStartTimeMs")
    public int musicStartTimeMs;

    @C09CT("option")
    public final EnumC2198891B4d option;

    @C09CT("textInShareContent")
    public final String textInShareContent;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<LinkShareIntentModel> CREATOR = new Parcelable.Creator<LinkShareIntentModel>() { // from class: X.1B4c
        @Override // android.os.Parcelable.Creator
        public final LinkShareIntentModel createFromParcel(Parcel parcel) {
            boolean z;
            EnumC2198891B4d enumC2198891B4dValueOf = EnumC2198891B4d.valueOf(parcel.readString());
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            EnumC21376718lB enumC21376718lBValueOf = EnumC21376718lB.valueOf(parcel.readString());
            String string2 = parcel.readString();
            CreativeInfo creativeInfo = (CreativeInfo) parcel.readParcelable(LinkShareIntentModel.class.getClassLoader());
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            LinkShareData.BackgroundColor backgroundColor = (LinkShareData.BackgroundColor) parcel.readParcelable(LinkShareIntentModel.class.getClassLoader());
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new LinkShareIntentModel(enumC2198891B4dValueOf, string, arrayListCreateStringArrayList, enumC21376718lBValueOf, string2, creativeInfo, string3, i, string4, string5, string6, backgroundColor, string7, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkShareIntentModel[] newArray(int i) {
            return new LinkShareIntentModel[i];
        }
    };
    public static final int $stable = 8;

    public LinkShareIntentModel() {
        this(null, null, null, null, null, null, null, 0, null, null, null, null, null, false, null, 32767, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkShareIntentModel)) {
            return false;
        }
        LinkShareIntentModel linkShareIntentModel = (LinkShareIntentModel) obj;
        return this.option == linkShareIntentModel.option && Intrinsics.LJFF(this.clientKey, linkShareIntentModel.clientKey) && Intrinsics.LJFF(this.mediaUriPaths, linkShareIntentModel.mediaUriPaths) && this.coverImageSize == linkShareIntentModel.coverImageSize && Intrinsics.LJFF(this.link, linkShareIntentModel.link) && Intrinsics.LJFF(this.creativeInfo, linkShareIntentModel.creativeInfo) && Intrinsics.LJFF(this.musicId, linkShareIntentModel.musicId) && this.musicStartTimeMs == linkShareIntentModel.musicStartTimeMs && Intrinsics.LJFF(this.title, linkShareIntentModel.title) && Intrinsics.LJFF(this.backgroundImagePath, linkShareIntentModel.backgroundImagePath) && Intrinsics.LJFF(this.entityUri, linkShareIntentModel.entityUri) && Intrinsics.LJFF(this.backgroundColor, linkShareIntentModel.backgroundColor) && Intrinsics.LJFF(this.musicMetadata, linkShareIntentModel.musicMetadata) && this.isShareToStoryOnly == linkShareIntentModel.isShareToStoryOnly && Intrinsics.LJFF(this.textInShareContent, linkShareIntentModel.textInShareContent);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.option.hashCode() * 31) + this.clientKey.hashCode()) * 31) + this.mediaUriPaths.hashCode()) * 31) + this.coverImageSize.hashCode()) * 31;
        String str = this.link;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.creativeInfo.hashCode()) * 31;
        String str2 = this.musicId;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.musicStartTimeMs) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundImagePath;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entityUri;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkShareData.BackgroundColor backgroundColor = this.backgroundColor;
        int iHashCode7 = (iHashCode6 + (backgroundColor == null ? 0 : backgroundColor.hashCode())) * 31;
        String str6 = this.musicMetadata;
        return ((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isShareToStoryOnly)) * 31) + this.textInShareContent.hashCode();
    }

    public final String toString() {
        return "LinkShareIntentModel(option=" + this.option + ", clientKey=" + this.clientKey + ", mediaUriPaths=" + this.mediaUriPaths + ", coverImageSize=" + this.coverImageSize + ", link=" + this.link + ", creativeInfo=" + this.creativeInfo + ", musicId=" + this.musicId + ", musicStartTimeMs=" + this.musicStartTimeMs + ", title=" + this.title + ", backgroundImagePath=" + this.backgroundImagePath + ", entityUri=" + this.entityUri + ", backgroundColor=" + this.backgroundColor + ", musicMetadata=" + this.musicMetadata + ", isShareToStoryOnly=" + this.isShareToStoryOnly + ", textInShareContent=" + this.textInShareContent + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.option.name());
        parcel.writeString(this.clientKey);
        parcel.writeStringList(this.mediaUriPaths);
        parcel.writeString(this.coverImageSize.name());
        parcel.writeString(this.link);
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.musicStartTimeMs);
        parcel.writeString(this.title);
        parcel.writeString(this.backgroundImagePath);
        parcel.writeString(this.entityUri);
        parcel.writeParcelable(this.backgroundColor, i);
        parcel.writeString(this.musicMetadata);
        parcel.writeInt(this.isShareToStoryOnly ? 1 : 0);
        parcel.writeString(this.textInShareContent);
    }

    public LinkShareIntentModel(EnumC2198891B4d enumC2198891B4d, String str, List<String> list, EnumC21376718lB enumC21376718lB, String str2, CreativeInfo creativeInfo, String str3, int i, String str4, String str5, String str6, LinkShareData.BackgroundColor backgroundColor, String str7, boolean z, String str8) {
        this.option = enumC2198891B4d;
        this.clientKey = str;
        this.mediaUriPaths = list;
        this.coverImageSize = enumC21376718lB;
        this.link = str2;
        this.creativeInfo = creativeInfo;
        this.musicId = str3;
        this.musicStartTimeMs = i;
        this.title = str4;
        this.backgroundImagePath = str5;
        this.entityUri = str6;
        this.backgroundColor = backgroundColor;
        this.musicMetadata = str7;
        this.isShareToStoryOnly = z;
        this.textInShareContent = str8;
    }

    public LinkShareIntentModel(EnumC2198891B4d enumC2198891B4d, String str, List list, EnumC21376718lB enumC21376718lB, String str2, CreativeInfo creativeInfo, String str3, int i, String str4, String str5, String str6, LinkShareData.BackgroundColor backgroundColor, String str7, boolean z, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EnumC2198891B4d.IMAGE : enumC2198891B4d, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? EnumC21376718lB.NORMAL : enumC21376718lB, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : backgroundColor, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str7, (i2 & 8192) != 0 ? false : z, (i2 & 16384) == 0 ? str8 : "");
    }
}
