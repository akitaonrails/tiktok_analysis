package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoBitrate implements Serializable, Parcelable {
    public static final Parcelable.Creator<VideoBitrate> CREATOR = new Creator();

    @C09CT("HDR_type")
    public final String HDR_type;

    @C09CT("HDT_bit")
    public final String HDT_bit;

    @C09CT("bit_rate")
    public final Integer bit_rate;

    @C09CT("codec_type")
    public final String codec_type;

    @C09CT("fid_profile_labels")
    public final String fid_profile_labels;

    @C09CT("format")
    public final String format;

    @C09CT("fps")
    public final Integer fps;

    @C09CT("gear_name")
    public final String gear_name;

    @C09CT("is_bytevc1")
    public final Integer is_bytevc1;

    @C09CT("play_addr")
    public final PlayAddress play_addr;

    @C09CT("quality_type")
    public final Integer quality_type;

    @C09CT("video_extra")
    public final String video_extra;

    public static final class Creator implements Parcelable.Creator<VideoBitrate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoBitrate createFromParcel(Parcel parcel) {
            return new VideoBitrate(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : PlayAddress.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoBitrate[] newArray(int i) {
            return new VideoBitrate[i];
        }
    }

    public final VideoBitrate copy(String str, Integer num, Integer num2, PlayAddress playAddress, String str2, String str3, String str4, String str5, String str6, Integer num3, String str7, Integer num4) {
        return new VideoBitrate(str, num, num2, playAddress, str2, str3, str4, str5, str6, num3, str7, num4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoBitrate)) {
            return false;
        }
        VideoBitrate videoBitrate = (VideoBitrate) obj;
        return Intrinsics.LJFF(this.gear_name, videoBitrate.gear_name) && Intrinsics.LJFF(this.bit_rate, videoBitrate.bit_rate) && Intrinsics.LJFF(this.quality_type, videoBitrate.quality_type) && Intrinsics.LJFF(this.play_addr, videoBitrate.play_addr) && Intrinsics.LJFF(this.codec_type, videoBitrate.codec_type) && Intrinsics.LJFF(this.HDR_type, videoBitrate.HDR_type) && Intrinsics.LJFF(this.HDT_bit, videoBitrate.HDT_bit) && Intrinsics.LJFF(this.video_extra, videoBitrate.video_extra) && Intrinsics.LJFF(this.format, videoBitrate.format) && Intrinsics.LJFF(this.fps, videoBitrate.fps) && Intrinsics.LJFF(this.fid_profile_labels, videoBitrate.fid_profile_labels) && Intrinsics.LJFF(this.is_bytevc1, videoBitrate.is_bytevc1);
    }

    public int hashCode() {
        String str = this.gear_name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bit_rate;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.quality_type;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PlayAddress playAddress = this.play_addr;
        int iHashCode4 = (iHashCode3 + (playAddress == null ? 0 : playAddress.hashCode())) * 31;
        String str2 = this.codec_type;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.HDR_type;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.HDT_bit;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.video_extra;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.format;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.fps;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.fid_profile_labels;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.is_bytevc1;
        return iHashCode11 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "VideoBitrate(gear_name=" + this.gear_name + ", bit_rate=" + this.bit_rate + ", quality_type=" + this.quality_type + ", play_addr=" + this.play_addr + ", codec_type=" + this.codec_type + ", HDR_type=" + this.HDR_type + ", HDT_bit=" + this.HDT_bit + ", video_extra=" + this.video_extra + ", format=" + this.format + ", fps=" + this.fps + ", fid_profile_labels=" + this.fid_profile_labels + ", is_bytevc1=" + this.is_bytevc1 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.gear_name);
        Integer num = this.bit_rate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.quality_type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        PlayAddress playAddress = this.play_addr;
        if (playAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            playAddress.writeToParcel(parcel, i);
        }
        parcel.writeString(this.codec_type);
        parcel.writeString(this.HDR_type);
        parcel.writeString(this.HDT_bit);
        parcel.writeString(this.video_extra);
        parcel.writeString(this.format);
        Integer num3 = this.fps;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.fid_profile_labels);
        Integer num4 = this.is_bytevc1;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public final Integer getBit_rate() {
        return this.bit_rate;
    }

    public final String getCodec_type() {
        return this.codec_type;
    }

    public final String getFid_profile_labels() {
        return this.fid_profile_labels;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getFps() {
        return this.fps;
    }

    public final String getGear_name() {
        return this.gear_name;
    }

    public final String getHDR_type() {
        return this.HDR_type;
    }

    public final String getHDT_bit() {
        return this.HDT_bit;
    }

    public final PlayAddress getPlay_addr() {
        return this.play_addr;
    }

    public final Integer getQuality_type() {
        return this.quality_type;
    }

    public final String getVideo_extra() {
        return this.video_extra;
    }

    public final Integer is_bytevc1() {
        return this.is_bytevc1;
    }

    public VideoBitrate(String str, Integer num, Integer num2, PlayAddress playAddress, String str2, String str3, String str4, String str5, String str6, Integer num3, String str7, Integer num4) {
        this.gear_name = str;
        this.bit_rate = num;
        this.quality_type = num2;
        this.play_addr = playAddress;
        this.codec_type = str2;
        this.HDR_type = str3;
        this.HDT_bit = str4;
        this.video_extra = str5;
        this.format = str6;
        this.fps = num3;
        this.fid_profile_labels = str7;
        this.is_bytevc1 = num4;
    }
}
