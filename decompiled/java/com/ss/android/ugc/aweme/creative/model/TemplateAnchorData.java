package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateAnchorData;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateAnchorData implements Parcelable {
    public static final Parcelable.Creator<TemplateAnchorData> CREATOR = new Parcelable.Creator<TemplateAnchorData>() { // from class: X.0mbi
        @Override // android.os.Parcelable.Creator
        public final TemplateAnchorData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2 = true;
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
                z2 = false;
            }
            return new TemplateAnchorData(boolValueOf, z2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateAnchorData[] newArray(int i) {
            return new TemplateAnchorData[i];
        }
    };

    @C09CT("followed_template_dispatch_type")
    public String followedTemplateDispatchType;

    @C09CT("is_effect_from_mix_editing_anchor")
    public Boolean isEffectFromTemplateDispatchAnchor;

    @C09CT("is_follow_publish_from_anchor")
    public boolean isFollowPublishFromAnchor;

    @C09CT("tt_template_type")
    public String ttTemplateType;

    public TemplateAnchorData() {
        this(Boolean.FALSE, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.isEffectFromTemplateDispatchAnchor;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeInt(this.isFollowPublishFromAnchor ? 1 : 0);
        parcel.writeString(this.followedTemplateDispatchType);
        parcel.writeString(this.ttTemplateType);
    }

    public TemplateAnchorData(Boolean bool, boolean z, String str, String str2) {
        this.isEffectFromTemplateDispatchAnchor = bool;
        this.isFollowPublishFromAnchor = z;
        this.followedTemplateDispatchType = str;
        this.ttTemplateType = str2;
    }
}
