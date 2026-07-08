package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;

/* JADX INFO: loaded from: classes23.dex */
public final class FollowUpPublishTrackerModel implements Parcelable {
    public static final Parcelable.Creator<FollowUpPublishTrackerModel> CREATOR = new Parcelable.Creator<FollowUpPublishTrackerModel>() { // from class: X.0nJN
        @Override // android.os.Parcelable.Creator
        public final FollowUpPublishTrackerModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new FollowUpPublishTrackerModel(string, string2, z, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FollowUpPublishTrackerModel[] newArray(int i) {
            return new FollowUpPublishTrackerModel[i];
        }
    };

    @C09CT("enter_record_from_feed")
    public boolean enterRecordFromFeed;

    @C09CT("follow_up_first_item_id")
    public String followUpFirstItemId;

    @C09CT("follow_up_item_id_groups")
    public String followUpItemIdGroups;

    @C09CT("follow_up_promo_id")
    public String followUpPromoId;

    @C09CT("followed_main_anchor_type")
    public String followedMainAnchorType;

    @C09CT("followed_tt_template_type")
    public String followedTemplateType;

    public FollowUpPublishTrackerModel() {
        this("", "", false, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.followUpFirstItemId);
        parcel.writeString(this.followUpItemIdGroups);
        parcel.writeInt(this.enterRecordFromFeed ? 1 : 0);
        parcel.writeString(this.followedMainAnchorType);
        parcel.writeString(this.followedTemplateType);
        parcel.writeString(this.followUpPromoId);
    }

    public FollowUpPublishTrackerModel(String str, String str2, boolean z, String str3, String str4, String str5) {
        this.followUpFirstItemId = str;
        this.followUpItemIdGroups = str2;
        this.enterRecordFromFeed = z;
        this.followedMainAnchorType = str3;
        this.followedTemplateType = str4;
        this.followUpPromoId = str5;
    }
}
