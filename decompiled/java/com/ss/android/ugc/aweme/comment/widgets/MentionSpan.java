package com.ss.android.ugc.aweme.comment.widgets;

import X.C1353480lKE;
import X.C1402020maW;
import X.InterfaceC1353590lKP;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class MentionSpan extends ForegroundColorSpan implements InterfaceC1353590lKP {
    public String awemeId;
    public int color;
    public int fromQuickMention;
    public String secId;
    public TextExtraStruct struct;
    public String text;
    public int type;
    public String uid;
    public static final C1353480lKE Companion = new Object() { // from class: X.0lKE
    };
    public static final Parcelable.Creator<MentionSpan> CREATOR = new C1402020maW(3);

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

    @Override // X.InterfaceC1353590lKP
    public final TextExtraStruct LIZ() {
        return this.struct;
    }

    public final String LIZIZ() {
        return this.text;
    }

    public final String LIZJ() {
        return this.uid;
    }

    @Override // X.InterfaceC1353590lKP
    public final int getType() {
        return this.type;
    }

    public MentionSpan(Parcel parcel) {
        super(parcel);
        this.secId = "";
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
        this.fromQuickMention = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(getClass(), obj.getClass())) {
            return false;
        }
        MentionSpan mentionSpan = (MentionSpan) obj;
        if (this.type != mentionSpan.type) {
            return false;
        }
        String str = this.uid;
        if (str != null) {
            if (!Intrinsics.LJFF(str, mentionSpan.uid)) {
                return false;
            }
        } else if (mentionSpan.uid != null) {
            return false;
        }
        String str2 = this.text;
        if (str2 != null) {
            if (!Intrinsics.LJFF(str2, mentionSpan.text)) {
                return false;
            }
        } else if (mentionSpan.text != null) {
            return false;
        }
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            if (!Intrinsics.LJFF(textExtraStruct, mentionSpan.struct)) {
                return false;
            }
        } else if (mentionSpan.struct != null) {
            return false;
        }
        String str3 = this.awemeId;
        if (str3 != null) {
            if (!Intrinsics.LJFF(str3, mentionSpan.awemeId)) {
                return false;
            }
        } else if (mentionSpan.awemeId != null) {
            return false;
        }
        String str4 = this.secId;
        if (str4 != null) {
            return Intrinsics.LJFF(str4, mentionSpan.secId);
        }
        if (mentionSpan.secId == null) {
            return true;
        }
        return false;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setAwemeId(str);
        }
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.text);
        parcel.writeInt(this.type);
        parcel.writeParcelable(this.struct, i);
        parcel.writeString(this.secId);
        parcel.writeInt(this.fromQuickMention);
    }

    public MentionSpan(int i, int i2, String str, String str2, String str3) {
        super(i);
        this.secId = "";
        this.awemeId = "";
        this.fromQuickMention = i2;
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

    public MentionSpan(int i, String str, String str2, int i2, String str3) {
        super(i);
        this.secId = "";
        this.awemeId = "";
        this.uid = str2;
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            textExtraStruct.setUserId(str2);
        }
        this.text = str;
        this.type = i2;
        this.secId = str3;
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 != null) {
            textExtraStruct2.setSecUid(str3);
        }
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        this.struct = textExtraStruct3;
        textExtraStruct3.setUserId(str2);
        TextExtraStruct textExtraStruct4 = this.struct;
        if (textExtraStruct4 != null) {
            textExtraStruct4.setType(i2);
        }
        TextExtraStruct textExtraStruct5 = this.struct;
        if (textExtraStruct5 != null) {
            textExtraStruct5.setSecUid(str3);
        }
    }
}
