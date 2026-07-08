package com.ss.android.ugc.aweme.comment.widgets;

import X.C1244110iTp;
import X.C1353470lKD;
import X.C1402020maW;
import X.EnumC1244100iTo;
import X.InterfaceC1353590lKP;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentGroupChatSpan extends ForegroundColorSpan implements InterfaceC1353590lKP {
    public EnumC1244100iTo addGroupMethod;
    public String awemeId;
    public int color;
    public String secId;
    public TextExtraStruct struct;
    public String text;
    public int type;
    public String uid;
    public static final C1353470lKD Companion = new Object() { // from class: X.0lKD
    };
    public static final Parcelable.Creator<CommentGroupChatSpan> CREATOR = new C1402020maW(1);

    public final String LIZIZ() {
        return this.addGroupMethod.getMethod();
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

    @Override // X.InterfaceC1353590lKP
    public final TextExtraStruct LIZ() {
        return this.struct;
    }

    public final String LIZJ() {
        return this.text;
    }

    @Override // X.InterfaceC1353590lKP
    public final int getType() {
        return this.type;
    }

    public CommentGroupChatSpan(Parcel parcel) {
        EnumC1244100iTo enumC1244100iTo;
        super(parcel);
        this.uid = "";
        this.secId = "";
        this.awemeId = "";
        this.addGroupMethod = EnumC1244100iTo.UNKNOWN;
        this.text = parcel.readString();
        this.type = parcel.readInt();
        C1244110iTp c1244110iTp = EnumC1244100iTo.Companion;
        String string = parcel.readString();
        String str = string != null ? string : "";
        c1244110iTp.getClass();
        EnumC1244100iTo[] enumC1244100iToArrValues = EnumC1244100iTo.values();
        int length = enumC1244100iToArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC1244100iTo = enumC1244100iToArrValues[i];
                if (Intrinsics.LJFF(enumC1244100iTo.getMethod(), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC1244100iTo = EnumC1244100iTo.UNKNOWN;
                break;
            }
        }
        this.addGroupMethod = enumC1244100iTo;
        this.struct = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
    }

    public final boolean equals(Object obj) {
        CommentGroupChatSpan commentGroupChatSpan;
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(CommentGroupChatSpan.class, obj.getClass()) || !(obj instanceof CommentGroupChatSpan) || (commentGroupChatSpan = (CommentGroupChatSpan) obj) == null || this.type != commentGroupChatSpan.type) {
            return false;
        }
        String str = this.uid;
        if (str != null) {
            if (!Intrinsics.LJFF(str, commentGroupChatSpan.uid)) {
                return false;
            }
        } else if (commentGroupChatSpan.uid != null) {
            return false;
        }
        String str2 = this.text;
        if (str2 != null) {
            if (!Intrinsics.LJFF(str2, commentGroupChatSpan.text)) {
                return false;
            }
        } else if (commentGroupChatSpan.text != null) {
            return false;
        }
        TextExtraStruct textExtraStruct = this.struct;
        if (textExtraStruct != null) {
            if (!Intrinsics.LJFF(textExtraStruct, commentGroupChatSpan.struct)) {
                return false;
            }
        } else if (commentGroupChatSpan.struct != null) {
            return false;
        }
        String str3 = this.awemeId;
        if (str3 != null) {
            if (!Intrinsics.LJFF(str3, commentGroupChatSpan.awemeId)) {
                return false;
            }
        } else if (commentGroupChatSpan.awemeId != null) {
            return false;
        }
        String str4 = this.secId;
        if (str4 != null) {
            return Intrinsics.LJFF(str4, commentGroupChatSpan.secId);
        }
        if (commentGroupChatSpan.secId == null) {
            return true;
        }
        return false;
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeInt(this.type);
        parcel.writeString(this.addGroupMethod.getMethod());
        parcel.writeParcelable(this.struct, i);
    }

    public CommentGroupChatSpan(int i, String str, long j, String str2, EnumC1244100iTo enumC1244100iTo) {
        super(i);
        this.uid = "";
        this.secId = "";
        this.awemeId = "";
        this.addGroupMethod = EnumC1244100iTo.UNKNOWN;
        this.text = str;
        this.type = 9;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        this.struct = textExtraStruct;
        textExtraStruct.setType(9);
        TextExtraStruct textExtraStruct2 = this.struct;
        if (textExtraStruct2 != null) {
            textExtraStruct2.setGroupId(j);
        }
        TextExtraStruct textExtraStruct3 = this.struct;
        if (textExtraStruct3 != null) {
            textExtraStruct3.setGroupName(str2);
        }
        TextExtraStruct textExtraStruct4 = this.struct;
        if (textExtraStruct4 != null) {
            textExtraStruct4.setGroupScene(enumC1244100iTo.getMethod());
        }
        this.addGroupMethod = enumC1244100iTo;
        this.uid = "";
        TextExtraStruct textExtraStruct5 = this.struct;
        if (textExtraStruct5 != null) {
            textExtraStruct5.setUserId("");
        }
        this.secId = "";
        TextExtraStruct textExtraStruct6 = this.struct;
        if (textExtraStruct6 != null) {
            textExtraStruct6.setSecUid("");
        }
        this.awemeId = "";
        TextExtraStruct textExtraStruct7 = this.struct;
        if (textExtraStruct7 != null) {
            textExtraStruct7.setAwemeId("");
        }
    }
}
