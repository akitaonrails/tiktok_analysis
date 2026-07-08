package com.ss.android.ugc.aweme.tools.sticker.core.text.mention;

import X.C0FMZ;
import X.C391580FWy;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class MentionSpanData implements Parcelable {
    public UrlModel avatarThumb;
    public String awemeId;
    public String nickname;
    public String secId;
    public TextExtraStruct struct;
    public String text;
    public int type;
    public String uid;
    public String username;
    public static final C0FMZ Companion = new Object() { // from class: X.0FMZ
    };
    public static final int $stable = 8;
    public static final Parcelable.Creator<MentionSpanData> CREATOR = new C391580FWy(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.uid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type) * 31;
        TextExtraStruct textExtraStruct = this.struct;
        int iHashCode3 = (iHashCode2 + (textExtraStruct != null ? textExtraStruct.hashCode() : 0)) * 31;
        String str3 = this.awemeId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.secId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public MentionSpanData(Parcel parcel) {
        this.uid = "";
        this.secId = "";
        this.username = "";
        this.nickname = "";
        this.awemeId = "";
        String string = parcel.readString();
        this.uid = string;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setUserId(string);
        }
        this.text = parcel.readString();
        this.type = parcel.readInt();
        this.struct = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        String string2 = parcel.readString();
        this.secId = string2;
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 != null) {
            textExtraStruct2.setSecUid(string2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(getClass(), obj.getClass())) {
            return false;
        }
        MentionSpanData mentionSpanData = (MentionSpanData) obj;
        if (this.type != mentionSpanData.type) {
            return false;
        }
        String str = this.uid;
        if (str != null) {
            if (!Intrinsics.LJFF(str, mentionSpanData.uid)) {
                return false;
            }
        } else if (mentionSpanData.uid != null) {
            return false;
        }
        String str2 = this.text;
        if (str2 != null) {
            if (!Intrinsics.LJFF(str2, mentionSpanData.text)) {
                return false;
            }
        } else if (mentionSpanData.text != null) {
            return false;
        }
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            if (!Intrinsics.LJFF(textExtraStruct, mentionSpanData.struct)) {
                return false;
            }
        } else if (mentionSpanData.struct != null) {
            return false;
        }
        String str3 = this.awemeId;
        if (str3 != null) {
            if (!Intrinsics.LJFF(str3, mentionSpanData.awemeId)) {
                return false;
            }
        } else if (mentionSpanData.awemeId != null) {
            return false;
        }
        String str4 = this.secId;
        String str5 = mentionSpanData.secId;
        if (str4 != null) {
            return Intrinsics.LJFF(str4, str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.text);
        parcel.writeInt(this.type);
        parcel.writeParcelable(this.struct, i);
        parcel.writeString(this.secId);
    }

    public MentionSpanData(String str, String str2, String str3, String str4, String str5, UrlModel urlModel) {
        this.secId = "";
        this.username = "";
        this.nickname = "";
        this.awemeId = "";
        this.uid = str2;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setUserId(str2);
        }
        this.text = str;
        this.type = 0;
        this.secId = str3;
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 != null) {
            textExtraStruct2.setSecUid(str3);
        }
        this.username = str4;
        this.nickname = str5;
        this.avatarThumb = urlModel;
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        this.struct = textExtraStruct3;
        textExtraStruct3.setUserId(str2);
        TextExtraStruct textExtraStruct4 = this.struct;
        if (textExtraStruct4 != null) {
            textExtraStruct4.setType(0);
        }
        TextExtraStruct textExtraStruct5 = this.struct;
        if (textExtraStruct5 != null) {
            textExtraStruct5.setSecUid(str3);
        }
    }
}
