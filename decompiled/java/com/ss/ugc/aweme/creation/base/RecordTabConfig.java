package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordTabConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class RecordTabConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordTabConfig> CREATOR = new Parcelable.Creator<RecordTabConfig>() { // from class: X.0wQf
        @Override // android.os.Parcelable.Creator
        public final RecordTabConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            int i = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            return new RecordTabConfig(i, string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordTabConfig[] newArray(int i) {
            return new RecordTabConfig[i];
        }
    };

    @C09CT("is_initial")
    public Boolean isInitial;

    @C09CT("tab_id")
    public int tabId;

    @C09CT("tab_title_key")
    public String tabTitleKey;

    public RecordTabConfig() {
        this(0, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeInt(this.tabId);
        parcel.writeString(this.tabTitleKey);
        Boolean bool = this.isInitial;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
    }

    public final int getTabId() {
        return this.tabId;
    }

    public final String getTabTitleKey() {
        return this.tabTitleKey;
    }

    public final Boolean isInitial() {
        return this.isInitial;
    }

    public final void setInitial(Boolean bool) {
        this.isInitial = bool;
    }

    public final void setTabId(int i) {
        this.tabId = i;
    }

    public final void setTabTitleKey(String str) {
        this.tabTitleKey = str;
    }

    public RecordTabConfig(int i, String str, Boolean bool) {
        this.tabId = i;
        this.tabTitleKey = str;
        this.isInitial = bool;
    }
}
