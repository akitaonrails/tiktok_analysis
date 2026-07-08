package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubbleExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VideoPlayConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EntranceBubble implements Parcelable {

    @C09CT("author_id")
    public final Long authorID;

    @C09CT("bubble_style")
    public final Integer bubbleStyle;

    @C09CT("bubble_type")
    public final Integer bubbleType;

    @C09CT("extra_info")
    public final EntranceBubbleExtraInfo extraInfo;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("preview_stream_data")
    public final PlaybackVideoPreviewStreamData previewStreamData;

    @C09CT("room_id")
    public final Long roomID;

    @C09CT("schema")
    public final String schema;

    @C09CT("style")
    public final Integer style;

    @C09CT("title")
    public final ECRichText title;

    @C09CT("video_play_conf")
    public final VideoPlayConfig videoPlayConfig;
    public static final Parcelable.Creator<EntranceBubble> CREATOR = new Parcelable.Creator<EntranceBubble>() { // from class: X.0vbL
        @Override // android.os.Parcelable.Creator
        public final EntranceBubble createFromParcel(Parcel parcel) {
            Integer numValueOf;
            EntranceBubbleExtraInfo entranceBubbleExtraInfoCreateFromParcel;
            Long lValueOf;
            Long lValueOf2;
            Integer numValueOf2;
            Integer numValueOf3;
            PlaybackVideoPreviewStreamData playbackVideoPreviewStreamDataCreateFromParcel;
            VideoPlayConfig videoPlayConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(EntranceBubble.class.getClassLoader());
            Icon icon = (Icon) parcel.readParcelable(EntranceBubble.class.getClassLoader());
            if (parcel.readInt() == 0) {
                entranceBubbleExtraInfoCreateFromParcel = null;
            } else {
                entranceBubbleExtraInfoCreateFromParcel = EntranceBubbleExtraInfo.CREATOR.createFromParcel(parcel);
            }
            EntranceBubbleExtraInfo entranceBubbleExtraInfo = entranceBubbleExtraInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                playbackVideoPreviewStreamDataCreateFromParcel = null;
            } else {
                playbackVideoPreviewStreamDataCreateFromParcel = PlaybackVideoPreviewStreamData.CREATOR.createFromParcel(parcel);
            }
            PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData = playbackVideoPreviewStreamDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                videoPlayConfigCreateFromParcel = VideoPlayConfig.CREATOR.createFromParcel(parcel);
            }
            return new EntranceBubble(numValueOf, eCRichText, icon, entranceBubbleExtraInfo, string, lValueOf, lValueOf2, numValueOf2, numValueOf3, playbackVideoPreviewStreamData, videoPlayConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EntranceBubble[] newArray(int i) {
            return new EntranceBubble[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceBubble)) {
            return false;
        }
        EntranceBubble entranceBubble = (EntranceBubble) obj;
        return Intrinsics.LJFF(this.style, entranceBubble.style) && Intrinsics.LJFF(this.title, entranceBubble.title) && Intrinsics.LJFF(this.icon, entranceBubble.icon) && Intrinsics.LJFF(this.extraInfo, entranceBubble.extraInfo) && Intrinsics.LJFF(this.schema, entranceBubble.schema) && Intrinsics.LJFF(this.roomID, entranceBubble.roomID) && Intrinsics.LJFF(this.authorID, entranceBubble.authorID) && Intrinsics.LJFF(this.bubbleType, entranceBubble.bubbleType) && Intrinsics.LJFF(this.bubbleStyle, entranceBubble.bubbleStyle) && Intrinsics.LJFF(this.previewStreamData, entranceBubble.previewStreamData) && Intrinsics.LJFF(this.videoPlayConfig, entranceBubble.videoPlayConfig);
    }

    public final int hashCode() {
        Integer num = this.style;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ECRichText eCRichText = this.title;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        EntranceBubbleExtraInfo entranceBubbleExtraInfo = this.extraInfo;
        int iHashCode4 = (iHashCode3 + (entranceBubbleExtraInfo == null ? 0 : entranceBubbleExtraInfo.hashCode())) * 31;
        String str = this.schema;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.roomID;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.authorID;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.bubbleType;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bubbleStyle;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData = this.previewStreamData;
        int iHashCode10 = (iHashCode9 + (playbackVideoPreviewStreamData == null ? 0 : playbackVideoPreviewStreamData.hashCode())) * 31;
        VideoPlayConfig videoPlayConfig = this.videoPlayConfig;
        return iHashCode10 + (videoPlayConfig != null ? videoPlayConfig.hashCode() : 0);
    }

    public final String toString() {
        return "EntranceBubble(style=" + this.style + ", title=" + this.title + ", icon=" + this.icon + ", extraInfo=" + this.extraInfo + ", schema=" + this.schema + ", roomID=" + this.roomID + ", authorID=" + this.authorID + ", bubbleType=" + this.bubbleType + ", bubbleStyle=" + this.bubbleStyle + ", previewStreamData=" + this.previewStreamData + ", videoPlayConfig=" + this.videoPlayConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.icon, i);
        EntranceBubbleExtraInfo entranceBubbleExtraInfo = this.extraInfo;
        if (entranceBubbleExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(entranceBubbleExtraInfo.daInfo);
        }
        parcel.writeString(this.schema);
        Long l = this.roomID;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.authorID;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num2 = this.bubbleType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.bubbleStyle;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData = this.previewStreamData;
        if (playbackVideoPreviewStreamData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            playbackVideoPreviewStreamData.writeToParcel(parcel, i);
        }
        VideoPlayConfig videoPlayConfig = this.videoPlayConfig;
        if (videoPlayConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoPlayConfig.writeToParcel(parcel, i);
        }
    }

    public EntranceBubble(Integer num, ECRichText eCRichText, Icon icon, EntranceBubbleExtraInfo entranceBubbleExtraInfo, String str, Long l, Long l2, Integer num2, Integer num3, PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData, VideoPlayConfig videoPlayConfig) {
        this.style = num;
        this.title = eCRichText;
        this.icon = icon;
        this.extraInfo = entranceBubbleExtraInfo;
        this.schema = str;
        this.roomID = l;
        this.authorID = l2;
        this.bubbleType = num2;
        this.bubbleStyle = num3;
        this.previewStreamData = playbackVideoPreviewStreamData;
        this.videoPlayConfig = videoPlayConfig;
    }
}
