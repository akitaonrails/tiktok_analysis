package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SocialAvatarUpdateInfoStruct implements Serializable, Parcelable {
    public static final Parcelable.Creator<SocialAvatarUpdateInfoStruct> CREATOR = new Parcelable.Creator<SocialAvatarUpdateInfoStruct>() { // from class: X.09Xo
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarUpdateInfoStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Long lValueOf;
            Integer numValueOf3;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Long lValueOf2;
            Integer numValueOf4;
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z3 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            return new SocialAvatarUpdateInfoStruct(numValueOf, numValueOf2, string, string2, string3, string4, lValueOf, numValueOf3, string5, string6, boolValueOf, boolValueOf2, lValueOf2, numValueOf4, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarUpdateInfoStruct[] newArray(int i) {
            return new SocialAvatarUpdateInfoStruct[i];
        }
    };

    @C09CT("avatar_color")
    public Integer avatarColor;

    @C09CT("avatar_count")
    public Integer avatarCount;

    @C09CT("avatar_id")
    public Long avatarId;

    @C09CT("compiled_avatar_uri")
    public String compiledAvatarUri;

    @C09CT("download_time_ms")
    public Long downloadTimeInMs;

    @C09CT("dynamic_avatar_gif_uri")
    public String dynamicAvatarGifUri;

    @C09CT("dynamic_avatar_uri")
    public String dynamicAvatarUri;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("expression_selection")
    public Integer expressionSelection;

    @C09CT("is_first_avatar")
    public Boolean isFirstAvatar;

    @C09CT("is_using_user_bucket")
    public Boolean isUsingUserBucket;

    @C09CT("need_update")
    public Boolean needUpdate;

    @C09CT("static_avatar_uri")
    public String staticAvatarUri;

    @C09CT("style_selection")
    public Integer styleSelection;

    public SocialAvatarUpdateInfoStruct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, -1L, null, null);
    }

    public final SocialAvatarUpdateInfoStruct copy(Integer num, Integer num2, String str, String str2, String str3, String str4, Long l, Integer num3, String str5, String str6, Boolean bool, Boolean bool2, Long l2, Integer num4, Boolean bool3) {
        return new SocialAvatarUpdateInfoStruct(num, num2, str, str2, str3, str4, l, num3, str5, str6, bool, bool2, l2, num4, bool3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarUpdateInfoStruct)) {
            return false;
        }
        SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct = (SocialAvatarUpdateInfoStruct) obj;
        return Intrinsics.LJFF(this.styleSelection, socialAvatarUpdateInfoStruct.styleSelection) && Intrinsics.LJFF(this.expressionSelection, socialAvatarUpdateInfoStruct.expressionSelection) && Intrinsics.LJFF(this.dynamicAvatarUri, socialAvatarUpdateInfoStruct.dynamicAvatarUri) && Intrinsics.LJFF(this.dynamicAvatarGifUri, socialAvatarUpdateInfoStruct.dynamicAvatarGifUri) && Intrinsics.LJFF(this.staticAvatarUri, socialAvatarUpdateInfoStruct.staticAvatarUri) && Intrinsics.LJFF(this.compiledAvatarUri, socialAvatarUpdateInfoStruct.compiledAvatarUri) && Intrinsics.LJFF(this.avatarId, socialAvatarUpdateInfoStruct.avatarId) && Intrinsics.LJFF(this.avatarColor, socialAvatarUpdateInfoStruct.avatarColor) && Intrinsics.LJFF(this.enterMethod, socialAvatarUpdateInfoStruct.enterMethod) && Intrinsics.LJFF(this.enterFrom, socialAvatarUpdateInfoStruct.enterFrom) && Intrinsics.LJFF(this.isFirstAvatar, socialAvatarUpdateInfoStruct.isFirstAvatar) && Intrinsics.LJFF(this.isUsingUserBucket, socialAvatarUpdateInfoStruct.isUsingUserBucket) && Intrinsics.LJFF(this.downloadTimeInMs, socialAvatarUpdateInfoStruct.downloadTimeInMs) && Intrinsics.LJFF(this.avatarCount, socialAvatarUpdateInfoStruct.avatarCount) && Intrinsics.LJFF(this.needUpdate, socialAvatarUpdateInfoStruct.needUpdate);
    }

    public int hashCode() {
        Integer num = this.styleSelection;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expressionSelection;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.dynamicAvatarUri;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dynamicAvatarGifUri;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.staticAvatarUri;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.compiledAvatarUri;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.avatarId;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.avatarColor;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.enterMethod;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.enterFrom;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isFirstAvatar;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUsingUserBucket;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.downloadTimeInMs;
        int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num4 = this.avatarCount;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool3 = this.needUpdate;
        return iHashCode14 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "SocialAvatarUpdateInfoStruct(styleSelection=" + this.styleSelection + ", expressionSelection=" + this.expressionSelection + ", dynamicAvatarUri=" + this.dynamicAvatarUri + ", dynamicAvatarGifUri=" + this.dynamicAvatarGifUri + ", staticAvatarUri=" + this.staticAvatarUri + ", compiledAvatarUri=" + this.compiledAvatarUri + ", avatarId=" + this.avatarId + ", avatarColor=" + this.avatarColor + ", enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", isFirstAvatar=" + this.isFirstAvatar + ", isUsingUserBucket=" + this.isUsingUserBucket + ", downloadTimeInMs=" + this.downloadTimeInMs + ", avatarCount=" + this.avatarCount + ", needUpdate=" + this.needUpdate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.styleSelection;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.expressionSelection;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.dynamicAvatarUri);
        parcel.writeString(this.dynamicAvatarGifUri);
        parcel.writeString(this.staticAvatarUri);
        parcel.writeString(this.compiledAvatarUri);
        Long l = this.avatarId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num3 = this.avatarColor;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        Boolean bool = this.isFirstAvatar;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isUsingUserBucket;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l2 = this.downloadTimeInMs;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num4 = this.avatarCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Boolean bool3 = this.needUpdate;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public final Integer getAvatarColor() {
        return this.avatarColor;
    }

    public final Integer getAvatarCount() {
        return this.avatarCount;
    }

    public final Long getAvatarId() {
        return this.avatarId;
    }

    public final String getCompiledAvatarUri() {
        return this.compiledAvatarUri;
    }

    public final Long getDownloadTimeInMs() {
        return this.downloadTimeInMs;
    }

    public final String getDynamicAvatarGifUri() {
        return this.dynamicAvatarGifUri;
    }

    public final String getDynamicAvatarUri() {
        return this.dynamicAvatarUri;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Integer getExpressionSelection() {
        return this.expressionSelection;
    }

    public final Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public final String getStaticAvatarUri() {
        return this.staticAvatarUri;
    }

    public final Integer getStyleSelection() {
        return this.styleSelection;
    }

    public final Boolean isFirstAvatar() {
        return this.isFirstAvatar;
    }

    public final Boolean isUsingUserBucket() {
        return this.isUsingUserBucket;
    }

    public final void setAvatarColor(Integer num) {
        this.avatarColor = num;
    }

    public final void setAvatarCount(Integer num) {
        this.avatarCount = num;
    }

    public final void setAvatarId(Long l) {
        this.avatarId = l;
    }

    public final void setCompiledAvatarUri(String str) {
        this.compiledAvatarUri = str;
    }

    public final void setDownloadTimeInMs(Long l) {
        this.downloadTimeInMs = l;
    }

    public final void setDynamicAvatarGifUri(String str) {
        this.dynamicAvatarGifUri = str;
    }

    public final void setDynamicAvatarUri(String str) {
        this.dynamicAvatarUri = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setExpressionSelection(Integer num) {
        this.expressionSelection = num;
    }

    public final void setFirstAvatar(Boolean bool) {
        this.isFirstAvatar = bool;
    }

    public final void setNeedUpdate(Boolean bool) {
        this.needUpdate = bool;
    }

    public final void setStaticAvatarUri(String str) {
        this.staticAvatarUri = str;
    }

    public final void setStyleSelection(Integer num) {
        this.styleSelection = num;
    }

    public final void setUsingUserBucket(Boolean bool) {
        this.isUsingUserBucket = bool;
    }

    public SocialAvatarUpdateInfoStruct(Integer num, Integer num2, String str, String str2, String str3, String str4, Long l, Integer num3, String str5, String str6, Boolean bool, Boolean bool2, Long l2, Integer num4, Boolean bool3) {
        this.styleSelection = num;
        this.expressionSelection = num2;
        this.dynamicAvatarUri = str;
        this.dynamicAvatarGifUri = str2;
        this.staticAvatarUri = str3;
        this.compiledAvatarUri = str4;
        this.avatarId = l;
        this.avatarColor = num3;
        this.enterMethod = str5;
        this.enterFrom = str6;
        this.isFirstAvatar = bool;
        this.isUsingUserBucket = bool2;
        this.downloadTimeInMs = l2;
        this.avatarCount = num4;
        this.needUpdate = bool3;
    }
}
