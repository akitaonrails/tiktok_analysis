package com.ss.android.ugc.aweme.model;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SlidesImageLoadParams implements Parcelable {
    public static final Parcelable.Creator<SlidesImageLoadParams> CREATOR = new Parcelable.Creator<SlidesImageLoadParams>() { // from class: X.0SAU
        @Override // android.os.Parcelable.Creator
        public final SlidesImageLoadParams createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            Integer numValueOf7;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            Integer numValueOf8 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf7 = null;
            } else {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                numValueOf8 = Integer.valueOf(parcel.readInt());
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new SlidesImageLoadParams(j, j2, i, i2, string, i3, string2, z, string3, numValueOf, string4, numValueOf2, string5, i4, i5, string6, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, z2, string7, string8, z3, numValueOf8, string9, string10, z4, z5, parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SlidesImageLoadParams[] newArray(int i) {
            return new SlidesImageLoadParams[i];
        }
    };
    public final String aid;
    public final String allBitrateGears;
    public final String bitmapConfig;
    public final long duration;
    public final String errorMsg;
    public final int fileSize;
    public final Integer height;
    public final String hitCDNCache;
    public final long imageLoadStartTime;
    public final int imageLoadStatus;
    public final Integer imageSize;
    public final int imageSource;
    public final String imageType;
    public final int index;
    public final boolean isHeicFormatSupport;
    public final boolean isHeicHardDecoded;
    public final boolean isImageCached;
    public final Integer originHeight;
    public final Integer originWidth;
    public final String originalUrl;
    public final String photoLoaderType;
    public final int playLadderCnt;
    public final Integer playLadderErrCode;
    public final String playLadderGear;
    public final Integer playLadderNetSpeed;
    public final int playLadderSelectedIndex;
    public final int priority;
    public final String requestInfo;
    public final String resolution;
    public final String sourceFromScene;
    public final double srLevel;
    public final String srState;
    public final int status;
    public final Integer statusCode;
    public Map<String, ? extends Object> strategyExtra;
    public final int totalCount;
    public final String url;
    public final boolean useCoverImage;
    public final boolean useMultiBitRate;
    public final Integer width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlidesImageLoadParams)) {
            return false;
        }
        SlidesImageLoadParams slidesImageLoadParams = (SlidesImageLoadParams) obj;
        return this.imageLoadStartTime == slidesImageLoadParams.imageLoadStartTime && this.duration == slidesImageLoadParams.duration && this.status == slidesImageLoadParams.status && this.index == slidesImageLoadParams.index && Intrinsics.LJFF(this.url, slidesImageLoadParams.url) && this.totalCount == slidesImageLoadParams.totalCount && Intrinsics.LJFF(this.aid, slidesImageLoadParams.aid) && this.useMultiBitRate == slidesImageLoadParams.useMultiBitRate && Intrinsics.LJFF(this.sourceFromScene, slidesImageLoadParams.sourceFromScene) && Intrinsics.LJFF(this.playLadderErrCode, slidesImageLoadParams.playLadderErrCode) && Intrinsics.LJFF(this.playLadderGear, slidesImageLoadParams.playLadderGear) && Intrinsics.LJFF(this.playLadderNetSpeed, slidesImageLoadParams.playLadderNetSpeed) && Intrinsics.LJFF(this.allBitrateGears, slidesImageLoadParams.allBitrateGears) && this.playLadderCnt == slidesImageLoadParams.playLadderCnt && this.playLadderSelectedIndex == slidesImageLoadParams.playLadderSelectedIndex && Intrinsics.LJFF(this.resolution, slidesImageLoadParams.resolution) && Intrinsics.LJFF(this.width, slidesImageLoadParams.width) && Intrinsics.LJFF(this.height, slidesImageLoadParams.height) && Intrinsics.LJFF(this.originWidth, slidesImageLoadParams.originWidth) && Intrinsics.LJFF(this.originHeight, slidesImageLoadParams.originHeight) && Intrinsics.LJFF(this.imageSize, slidesImageLoadParams.imageSize) && this.isImageCached == slidesImageLoadParams.isImageCached && Intrinsics.LJFF(this.originalUrl, slidesImageLoadParams.originalUrl) && Intrinsics.LJFF(this.photoLoaderType, slidesImageLoadParams.photoLoaderType) && this.useCoverImage == slidesImageLoadParams.useCoverImage && Intrinsics.LJFF(this.statusCode, slidesImageLoadParams.statusCode) && Intrinsics.LJFF(this.requestInfo, slidesImageLoadParams.requestInfo) && Intrinsics.LJFF(this.errorMsg, slidesImageLoadParams.errorMsg) && this.isHeicFormatSupport == slidesImageLoadParams.isHeicFormatSupport && this.isHeicHardDecoded == slidesImageLoadParams.isHeicHardDecoded && Intrinsics.LJFF(this.bitmapConfig, slidesImageLoadParams.bitmapConfig) && Double.compare(this.srLevel, slidesImageLoadParams.srLevel) == 0 && Intrinsics.LJFF(this.srState, slidesImageLoadParams.srState) && this.imageSource == slidesImageLoadParams.imageSource && Intrinsics.LJFF(this.hitCDNCache, slidesImageLoadParams.hitCDNCache) && Intrinsics.LJFF(this.imageType, slidesImageLoadParams.imageType) && this.imageLoadStatus == slidesImageLoadParams.imageLoadStatus && this.priority == slidesImageLoadParams.priority && this.fileSize == slidesImageLoadParams.fileSize;
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.imageLoadStartTime) * 31) + C786410Ut5.Y2(this.duration)) * 31) + this.status) * 31) + this.index) * 31;
        String str = this.url;
        int iHashCode = (((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.totalCount) * 31;
        String str2 = this.aid;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.useMultiBitRate)) * 31;
        String str3 = this.sourceFromScene;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.playLadderErrCode;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.playLadderGear;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.playLadderNetSpeed;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.allBitrateGears;
        int iHashCode7 = (((((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.playLadderCnt) * 31) + this.playLadderSelectedIndex) * 31;
        String str6 = this.resolution;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.width;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.height;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.originWidth;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.originHeight;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.imageSize;
        int iHashCode13 = (((iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31) + C786410Ut5.Z2(this.isImageCached)) * 31;
        String str7 = this.originalUrl;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photoLoaderType;
        int iHashCode15 = (((iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31) + C786410Ut5.Z2(this.useCoverImage)) * 31;
        Integer num8 = this.statusCode;
        int iHashCode16 = (iHashCode15 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str9 = this.requestInfo;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.errorMsg;
        int iHashCode18 = (((((((((((((iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31) + C786410Ut5.Z2(this.isHeicFormatSupport)) * 31) + C786410Ut5.Z2(this.isHeicHardDecoded)) * 31) + this.bitmapConfig.hashCode()) * 31) + C786410Ut5.X2(this.srLevel)) * 31) + this.srState.hashCode()) * 31) + this.imageSource) * 31;
        String str11 = this.hitCDNCache;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.imageType;
        return ((((((iHashCode19 + (str12 != null ? str12.hashCode() : 0)) * 31) + this.imageLoadStatus) * 31) + this.priority) * 31) + this.fileSize;
    }

    public final String toString() {
        return "SlidesImageLoadParams(imageLoadStartTime=" + this.imageLoadStartTime + ", duration=" + this.duration + ", status=" + this.status + ", index=" + this.index + ", url=" + this.url + ", totalCount=" + this.totalCount + ", aid=" + this.aid + ", useMultiBitRate=" + this.useMultiBitRate + ", sourceFromScene=" + this.sourceFromScene + ", playLadderErrCode=" + this.playLadderErrCode + ", playLadderGear=" + this.playLadderGear + ", playLadderNetSpeed=" + this.playLadderNetSpeed + ", allBitrateGears=" + this.allBitrateGears + ", playLadderCnt=" + this.playLadderCnt + ", playLadderSelectedIndex=" + this.playLadderSelectedIndex + ", resolution=" + this.resolution + ", width=" + this.width + ", height=" + this.height + ", originWidth=" + this.originWidth + ", originHeight=" + this.originHeight + ", imageSize=" + this.imageSize + ", isImageCached=" + this.isImageCached + ", originalUrl=" + this.originalUrl + ", photoLoaderType=" + this.photoLoaderType + ", useCoverImage=" + this.useCoverImage + ", statusCode=" + this.statusCode + ", requestInfo=" + this.requestInfo + ", errorMsg=" + this.errorMsg + ", isHeicFormatSupport=" + this.isHeicFormatSupport + ", isHeicHardDecoded=" + this.isHeicHardDecoded + ", bitmapConfig=" + this.bitmapConfig + ", srLevel=" + this.srLevel + ", srState=" + this.srState + ", imageSource=" + this.imageSource + ", hitCDNCache=" + this.hitCDNCache + ", imageType=" + this.imageType + ", imageLoadStatus=" + this.imageLoadStatus + ", priority=" + this.priority + ", fileSize=" + this.fileSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.imageLoadStartTime);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.status);
        parcel.writeInt(this.index);
        parcel.writeString(this.url);
        parcel.writeInt(this.totalCount);
        parcel.writeString(this.aid);
        parcel.writeInt(this.useMultiBitRate ? 1 : 0);
        parcel.writeString(this.sourceFromScene);
        Integer num = this.playLadderErrCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.playLadderGear);
        Integer num2 = this.playLadderNetSpeed;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.allBitrateGears);
        parcel.writeInt(this.playLadderCnt);
        parcel.writeInt(this.playLadderSelectedIndex);
        parcel.writeString(this.resolution);
        Integer num3 = this.width;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.height;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.originWidth;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.originHeight;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.imageSize;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        parcel.writeInt(this.isImageCached ? 1 : 0);
        parcel.writeString(this.originalUrl);
        parcel.writeString(this.photoLoaderType);
        parcel.writeInt(this.useCoverImage ? 1 : 0);
        Integer num8 = this.statusCode;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        parcel.writeString(this.requestInfo);
        parcel.writeString(this.errorMsg);
        parcel.writeInt(this.isHeicFormatSupport ? 1 : 0);
        parcel.writeInt(this.isHeicHardDecoded ? 1 : 0);
        parcel.writeString(this.bitmapConfig);
        parcel.writeDouble(this.srLevel);
        parcel.writeString(this.srState);
        parcel.writeInt(this.imageSource);
        parcel.writeString(this.hitCDNCache);
        parcel.writeString(this.imageType);
        parcel.writeInt(this.imageLoadStatus);
        parcel.writeInt(this.priority);
        parcel.writeInt(this.fileSize);
    }

    public static SlidesImageLoadParams LIZ(SlidesImageLoadParams slidesImageLoadParams, long j, String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, int i, String str4, String str5, int i2, int i3, int i4) {
        long j2;
        int i5;
        int i6;
        String str6;
        int i7;
        String str7;
        boolean z;
        String str8;
        Integer num5;
        String str9;
        Integer num6;
        String str10;
        int i8;
        int i9;
        Integer num7;
        Integer num8;
        boolean z2;
        String str11;
        String str12;
        boolean z3;
        boolean z4;
        boolean z5;
        String str13;
        double d;
        int i10;
        int i11;
        int i12 = i2;
        String str14 = str5;
        int i13 = i;
        Integer num9 = num4;
        Integer num10 = num2;
        String str15 = str4;
        Integer num11 = num3;
        String str16 = str2;
        String str17 = str;
        String str18 = str3;
        Integer num12 = num;
        long j3 = j;
        if ((i3 & 1) != 0) {
            j3 = slidesImageLoadParams.imageLoadStartTime;
        }
        if ((i3 & 2) != 0) {
            j2 = slidesImageLoadParams.duration;
        } else {
            j2 = 0;
        }
        if ((i3 & 4) != 0) {
            i5 = slidesImageLoadParams.status;
        } else {
            i5 = 0;
        }
        if ((i3 & 8) != 0) {
            i6 = slidesImageLoadParams.index;
        } else {
            i6 = 0;
        }
        String str19 = null;
        if ((i3 & 16) != 0) {
            str6 = slidesImageLoadParams.url;
        } else {
            str6 = null;
        }
        if ((i3 & 32) != 0) {
            i7 = slidesImageLoadParams.totalCount;
        } else {
            i7 = 0;
        }
        if ((i3 & 64) != 0) {
            str7 = slidesImageLoadParams.aid;
        } else {
            str7 = null;
        }
        if ((i3 & 128) != 0) {
            z = slidesImageLoadParams.useMultiBitRate;
        } else {
            z = false;
        }
        if ((i3 & 256) != 0) {
            str8 = slidesImageLoadParams.sourceFromScene;
        } else {
            str8 = null;
        }
        if ((i3 & 512) != 0) {
            num5 = slidesImageLoadParams.playLadderErrCode;
        } else {
            num5 = null;
        }
        if ((i3 & 1024) != 0) {
            str9 = slidesImageLoadParams.playLadderGear;
        } else {
            str9 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num6 = slidesImageLoadParams.playLadderNetSpeed;
        } else {
            num6 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = slidesImageLoadParams.allBitrateGears;
        } else {
            str10 = null;
        }
        if ((i3 & 8192) != 0) {
            i8 = slidesImageLoadParams.playLadderCnt;
        } else {
            i8 = 0;
        }
        if ((i3 & 16384) != 0) {
            i9 = slidesImageLoadParams.playLadderSelectedIndex;
        } else {
            i9 = 0;
        }
        if ((32768 & i3) != 0) {
            str17 = slidesImageLoadParams.resolution;
        }
        if ((65536 & i3) != 0) {
            num12 = slidesImageLoadParams.width;
        }
        if ((131072 & i3) != 0) {
            num10 = slidesImageLoadParams.height;
        }
        if ((262144 & i3) != 0) {
            num7 = slidesImageLoadParams.originWidth;
        } else {
            num7 = null;
        }
        if ((524288 & i3) != 0) {
            num8 = slidesImageLoadParams.originHeight;
        } else {
            num8 = null;
        }
        if ((1048576 & i3) != 0) {
            num11 = slidesImageLoadParams.imageSize;
        }
        if ((2097152 & i3) != 0) {
            z2 = slidesImageLoadParams.isImageCached;
        } else {
            z2 = false;
        }
        if ((4194304 & i3) != 0) {
            str11 = slidesImageLoadParams.originalUrl;
        } else {
            str11 = null;
        }
        if ((8388608 & i3) != 0) {
            str12 = slidesImageLoadParams.photoLoaderType;
        } else {
            str12 = null;
        }
        if ((16777216 & i3) != 0) {
            z3 = slidesImageLoadParams.useCoverImage;
        } else {
            z3 = false;
        }
        if ((33554432 & i3) != 0) {
            num9 = slidesImageLoadParams.statusCode;
        }
        if ((67108864 & i3) != 0) {
            str16 = slidesImageLoadParams.requestInfo;
        }
        if ((134217728 & i3) != 0) {
            str18 = slidesImageLoadParams.errorMsg;
        }
        if ((268435456 & i3) != 0) {
            z4 = slidesImageLoadParams.isHeicFormatSupport;
        } else {
            z4 = false;
        }
        if ((536870912 & i3) != 0) {
            z5 = slidesImageLoadParams.isHeicHardDecoded;
        } else {
            z5 = false;
        }
        if ((1073741824 & i3) != 0) {
            str13 = slidesImageLoadParams.bitmapConfig;
        } else {
            str13 = null;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            d = slidesImageLoadParams.srLevel;
        } else {
            d = 0.0d;
        }
        if ((i4 & 1) != 0) {
            str19 = slidesImageLoadParams.srState;
        }
        if ((i4 & 2) != 0) {
            i13 = slidesImageLoadParams.imageSource;
        }
        if ((i4 & 4) != 0) {
            str15 = slidesImageLoadParams.hitCDNCache;
        }
        if ((i4 & 8) != 0) {
            str14 = slidesImageLoadParams.imageType;
        }
        if ((i4 & 16) != 0) {
            i12 = slidesImageLoadParams.imageLoadStatus;
        }
        if ((i4 & 32) != 0) {
            i10 = slidesImageLoadParams.priority;
        } else {
            i10 = 0;
        }
        if ((i4 & 64) != 0) {
            i11 = slidesImageLoadParams.fileSize;
        } else {
            i11 = 0;
        }
        return new SlidesImageLoadParams(j3, j2, i5, i6, str6, i7, str7, z, str8, num5, str9, num6, str10, i8, i9, str17, num12, num10, num7, num8, num11, z2, str11, str12, z3, num9, str16, str18, z4, z5, str13, d, str19, i13, str15, str14, i12, i10, i11);
    }

    public SlidesImageLoadParams(long j, long j2, int i, int i2, String str, int i3, String str2, boolean z, String str3, Integer num, String str4, Integer num2, String str5, int i4, int i5, String str6, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, boolean z2, String str7, String str8, boolean z3, Integer num8, String str9, String str10, boolean z4, boolean z5, String str11, double d, String str12, int i6, String str13, String str14, int i7, int i8, int i9) {
        this.imageLoadStartTime = j;
        this.duration = j2;
        this.status = i;
        this.index = i2;
        this.url = str;
        this.totalCount = i3;
        this.aid = str2;
        this.useMultiBitRate = z;
        this.sourceFromScene = str3;
        this.playLadderErrCode = num;
        this.playLadderGear = str4;
        this.playLadderNetSpeed = num2;
        this.allBitrateGears = str5;
        this.playLadderCnt = i4;
        this.playLadderSelectedIndex = i5;
        this.resolution = str6;
        this.width = num3;
        this.height = num4;
        this.originWidth = num5;
        this.originHeight = num6;
        this.imageSize = num7;
        this.isImageCached = z2;
        this.originalUrl = str7;
        this.photoLoaderType = str8;
        this.useCoverImage = z3;
        this.statusCode = num8;
        this.requestInfo = str9;
        this.errorMsg = str10;
        this.isHeicFormatSupport = z4;
        this.isHeicHardDecoded = z5;
        this.bitmapConfig = str11;
        this.srLevel = d;
        this.srState = str12;
        this.imageSource = i6;
        this.hitCDNCache = str13;
        this.imageType = str14;
        this.imageLoadStatus = i7;
        this.priority = i8;
        this.fileSize = i9;
    }
}
