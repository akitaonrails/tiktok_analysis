package com.ss.android.ugc.aweme.dependence.beauty.data;

import X.C12I6;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class BeautyComposerInfo implements Parcelable {
    public static final C12I6 CREATOR = new Parcelable.Creator<BeautyComposerInfo>() { // from class: X.12I6
        @Override // android.os.Parcelable.Creator
        public final BeautyComposerInfo createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = parcel.readString();
            if (string3 == null) {
                string3 = "";
            }
            String string4 = parcel.readString();
            if (string4 == null) {
                string4 = "";
            }
            String string5 = parcel.readString();
            if (string5 == null) {
                string5 = "";
            }
            return new BeautyComposerInfo(string, string2, string3, string4, string5);
        }

        @Override // android.os.Parcelable.Creator
        public final BeautyComposerInfo[] newArray(int i) {
            return new BeautyComposerInfo[i];
        }
    };
    public final String categoryId;
    public final String effectId;
    public final String extra;
    public String nodePath;
    public final String resourceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return (((((((this.nodePath.hashCode() * 31) + this.extra.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.resourceId.hashCode()) * 31) + this.categoryId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautyComposerInfo(nodePath=");
        sbLIZ.append(this.nodePath);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", categoryId=");
        sbLIZ.append(this.categoryId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeautyComposerInfo) {
            BeautyComposerInfo beautyComposerInfo = (BeautyComposerInfo) obj;
            if (Intrinsics.LJFF(this.nodePath, beautyComposerInfo.nodePath)) {
                return true;
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.nodePath, new String[]{":"}, 0, 6);
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(beautyComposerInfo.nodePath, new String[]{":"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() >= 2 && listLJJLIIIJILLIZJL2.size() >= 2 && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL2, 0)) && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 1), ListProtector.get(listLJJLIIIJILLIZJL2, 1))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nodePath);
        parcel.writeString(this.extra);
        parcel.writeString(this.effectId);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.categoryId);
    }

    public /* synthetic */ BeautyComposerInfo(String str, String str2, String str3, String str4, int i) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? null : "");
    }

    public BeautyComposerInfo(String str, String str2, String str3, String str4, String str5) {
        this.nodePath = str;
        this.extra = str2;
        this.effectId = str3;
        this.resourceId = str4;
        this.categoryId = str5;
    }
}
