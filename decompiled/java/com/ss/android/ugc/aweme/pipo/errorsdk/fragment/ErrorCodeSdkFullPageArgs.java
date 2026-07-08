package com.ss.android.ugc.aweme.pipo.errorsdk.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.pipo.errorsdk.fragment.ErrorCodeSdkFullPageArgs;

/* JADX INFO: loaded from: classes7.dex */
public final class ErrorCodeSdkFullPageArgs implements IRouteArg {
    public static final Parcelable.Creator<ErrorCodeSdkFullPageArgs> CREATOR = new Parcelable.Creator<ErrorCodeSdkFullPageArgs>() { // from class: X.0Hdn
        @Override // android.os.Parcelable.Creator
        public final ErrorCodeSdkFullPageArgs createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf = Boolean.valueOf(z3);
            }
            return new ErrorCodeSdkFullPageArgs(string, string2, string3, z, string4, z2, string5, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorCodeSdkFullPageArgs[] newArray(int i) {
            return new ErrorCodeSdkFullPageArgs[i];
        }
    };
    public final String contentText;
    public final boolean hasPrimaryButton;
    public final boolean hasSecondaryButton;
    public final String iconType;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final Boolean showBack;
    public final String titleText;

    public ErrorCodeSdkFullPageArgs() {
        this(null, null, null, false, null, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.titleText);
        parcel.writeString(this.contentText);
        parcel.writeString(this.iconType);
        parcel.writeInt(this.hasPrimaryButton ? 1 : 0);
        parcel.writeString(this.primaryButtonText);
        parcel.writeInt(this.hasSecondaryButton ? 1 : 0);
        parcel.writeString(this.secondaryButtonText);
        Boolean bool = this.showBack;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final boolean getHasPrimaryButton() {
        return this.hasPrimaryButton;
    }

    public final boolean getHasSecondaryButton() {
        return this.hasSecondaryButton;
    }

    public final String getIconType() {
        return this.iconType;
    }

    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final Boolean getShowBack() {
        return this.showBack;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public ErrorCodeSdkFullPageArgs(String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, Boolean bool) {
        this.titleText = str;
        this.contentText = str2;
        this.iconType = str3;
        this.hasPrimaryButton = z;
        this.primaryButtonText = str4;
        this.hasSecondaryButton = z2;
        this.secondaryButtonText = str5;
        this.showBack = bool;
    }
}
