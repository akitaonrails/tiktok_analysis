package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LandingModel;

/* JADX INFO: loaded from: classes23.dex */
public final class LandingModel implements Parcelable {
    public static final Parcelable.Creator<LandingModel> CREATOR = new Parcelable.Creator<LandingModel>() { // from class: X.0mcz
        @Override // android.os.Parcelable.Creator
        public final LandingModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new LandingModel(string, string2, boolValueOf, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final LandingModel[] newArray(int i) {
            return new LandingModel[i];
        }
    };

    @C09CT("landing_come_from")
    public String dataComeFrom;

    @C09CT("default_landing_create_tab")
    public boolean defaultLandingCreateTab;

    @C040H
    public boolean fromAlbumNav;

    @C09CT("landing_is_from_external_link")
    public Boolean isFromExternalLink;

    @C09CT("landing_tab")
    public String landingTab;

    public LandingModel() {
        this(null, null, null, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.landingTab);
        parcel.writeString(this.dataComeFrom);
        Boolean bool = this.isFromExternalLink;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeInt(this.defaultLandingCreateTab ? 1 : 0);
        parcel.writeInt(this.fromAlbumNav ? 1 : 0);
    }

    public LandingModel(String str, String str2, Boolean bool, boolean z, boolean z2) {
        this.landingTab = str;
        this.dataComeFrom = str2;
        this.isFromExternalLink = bool;
        this.defaultLandingCreateTab = z;
        this.fromAlbumNav = z2;
    }
}
