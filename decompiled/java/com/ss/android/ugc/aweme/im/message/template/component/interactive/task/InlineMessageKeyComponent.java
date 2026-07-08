package com.ss.android.ugc.aweme.im.message.template.component.interactive.task;

import X.C2188811AlT;
import X.C2230191CQn;
import X.EnumC1710806mw;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageKeyComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InlineMessageKeyComponent implements BaseComponent<C2230191CQn> {
    public static final Parcelable.Creator<InlineMessageKeyComponent> CREATOR = new Parcelable.Creator<InlineMessageKeyComponent>() { // from class: X.0ZhU
        @Override // android.os.Parcelable.Creator
        public final InlineMessageKeyComponent createFromParcel(Parcel parcel) {
            EnumC1710806mw enumC1710806mwValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                enumC1710806mwValueOf = null;
            } else {
                enumC1710806mwValueOf = EnumC1710806mw.valueOf(parcel.readString());
            }
            return new InlineMessageKeyComponent(string, string2, string3, enumC1710806mwValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final InlineMessageKeyComponent[] newArray(int i) {
            return new InlineMessageKeyComponent[i];
        }
    };
    public final EnumC1710806mw action;
    public final String key;
    public final String link;
    public final String name;

    public InlineMessageKeyComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineMessageKeyComponent)) {
            return false;
        }
        InlineMessageKeyComponent inlineMessageKeyComponent = (InlineMessageKeyComponent) obj;
        return Intrinsics.LJFF(this.key, inlineMessageKeyComponent.key) && Intrinsics.LJFF(this.name, inlineMessageKeyComponent.name) && Intrinsics.LJFF(this.link, inlineMessageKeyComponent.link) && this.action == inlineMessageKeyComponent.action;
    }

    public final int hashCode() {
        int iHashCode = ((((this.key.hashCode() * 31) + this.name.hashCode()) * 31) + this.link.hashCode()) * 31;
        EnumC1710806mw enumC1710806mw = this.action;
        return iHashCode + (enumC1710806mw == null ? 0 : enumC1710806mw.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineMessageKeyComponent(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        parcel.writeString(this.link);
        EnumC1710806mw enumC1710806mw = this.action;
        if (enumC1710806mw == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1710806mw.name());
        }
    }

    public /* synthetic */ InlineMessageKeyComponent(int i) {
        this("", "", "", null);
    }

    public InlineMessageKeyComponent(String str, String str2, String str3, EnumC1710806mw enumC1710806mw) {
        this.key = str;
        this.name = str2;
        this.link = str3;
        this.action = enumC1710806mw;
    }
}
