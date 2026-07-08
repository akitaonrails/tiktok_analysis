package com.ss.android.ugc.aweme.relation.ffp;

import X.C680870QnF;
import X.EnumC666200QBe;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;

/* JADX INFO: loaded from: classes11.dex */
public final class FindFriendsPageArg implements IRouteArg {
    public final boolean darkMode;
    public final int mafApiScene;
    public final int newMafCount;
    public final boolean newSuggestArea;
    public final EnumC666200QBe pageStyle;
    public final PlaceUserInfo placeUserInfo;
    public final String previousPage;
    public final String previousPosition;
    public final String recUserSharedKey;
    public final int transitionType;
    public static final C680870QnF Companion = new Object() { // from class: X.0QnF
    };
    public static final Parcelable.Creator<FindFriendsPageArg> CREATOR = new Parcelable.Creator<FindFriendsPageArg>() { // from class: X.0QFi
        @Override // android.os.Parcelable.Creator
        public final FindFriendsPageArg createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            EnumC666200QBe enumC666200QBeValueOf = EnumC666200QBe.valueOf(parcel.readString());
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new FindFriendsPageArg(z, i, string, string2, enumC666200QBeValueOf, string3, i2, z2, parcel.readInt(), (PlaceUserInfo) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final FindFriendsPageArg[] newArray(int i) {
            return new FindFriendsPageArg[i];
        }
    };

    public FindFriendsPageArg() {
        this(false, 0, "", "", EnumC666200QBe.DEFAULT, null, 0, false, -1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.darkMode ? 1 : 0);
        parcel.writeInt(this.transitionType);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.previousPosition);
        parcel.writeString(this.pageStyle.name());
        parcel.writeString(this.recUserSharedKey);
        parcel.writeInt(this.newMafCount);
        parcel.writeInt(this.newSuggestArea ? 1 : 0);
        parcel.writeInt(this.mafApiScene);
        parcel.writeSerializable(this.placeUserInfo);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final int getMafApiScene() {
        return this.mafApiScene;
    }

    public final int getNewMafCount() {
        return this.newMafCount;
    }

    public final boolean getNewSuggestArea() {
        return this.newSuggestArea;
    }

    public final EnumC666200QBe getPageStyle() {
        return this.pageStyle;
    }

    public final PlaceUserInfo getPlaceUserInfo() {
        return this.placeUserInfo;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getPreviousPosition() {
        return this.previousPosition;
    }

    public final String getRecUserSharedKey() {
        return this.recUserSharedKey;
    }

    public final int getTransitionType() {
        return this.transitionType;
    }

    public static FindFriendsPageArg __fromBundle(Bundle bundle) {
        Boolean bool;
        Integer num;
        String str;
        String str2;
        EnumC666200QBe enumC666200QBe;
        String str3;
        Integer num2;
        Boolean bool2;
        Integer num3;
        boolean zBooleanValue;
        int iIntValue;
        int iIntValue2;
        boolean zBooleanValue2;
        PlaceUserInfo placeUserInfo = null;
        if (bundle == null) {
            return null;
        }
        int i = 1;
        int iIntValue3 = 0;
        if (bundle.containsKey("key_dark_mode")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("key_dark_mode"), Boolean.class);
            if (bool != null) {
                i = 0;
            }
        } else {
            bool = null;
        }
        if (bundle.containsKey("key_transition_type")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("key_transition_type"), Integer.class);
            if (num == null) {
                i += 2;
            }
        } else {
            i += 2;
            num = null;
        }
        if (bundle.containsKey("key_prev_page")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("key_prev_page"), String.class);
        } else {
            i += 4;
            str = null;
        }
        if (bundle.containsKey("key_prev_position")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("key_prev_position"), String.class);
        } else {
            i += 8;
            str2 = null;
        }
        if (bundle.containsKey("key_page_style")) {
            enumC666200QBe = (EnumC666200QBe) RouteParser.INSTANCE.parse(bundle.get("key_page_style"), EnumC666200QBe.class);
        } else {
            i += 16;
            enumC666200QBe = null;
        }
        if (bundle.containsKey("rec_user_source_shared_key")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("rec_user_source_shared_key"), String.class);
        } else {
            i += 32;
            str3 = null;
        }
        if (bundle.containsKey("key_maf_count")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("key_maf_count"), Integer.class);
            if (num2 == null) {
                i += 64;
            }
        } else {
            i += 64;
            num2 = null;
        }
        if (bundle.containsKey("key_new_suggest_area")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("key_new_suggest_area"), Boolean.class);
            if (bool2 == null) {
                i += 128;
            }
        } else {
            i += 128;
            bool2 = null;
        }
        if (bundle.containsKey("key_maf_api_scene")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("key_maf_api_scene"), Integer.class);
            if (num3 == null) {
                i += 256;
            }
        } else {
            i += 256;
            num3 = null;
        }
        if (bundle.containsKey("key_place_user_info")) {
            placeUserInfo = (PlaceUserInfo) RouteParser.INSTANCE.parse(bundle.get("key_place_user_info"), PlaceUserInfo.class);
        } else {
            i += 512;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        }
        String str4 = null;
        boolean z = false;
        if ((i & 1) != 0) {
            zBooleanValue = false;
        }
        if ((i & 2) != 0) {
            iIntValue = 0;
        }
        String str5 = "";
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) == 0) {
            str5 = str2;
        }
        if ((i & 16) != 0) {
            enumC666200QBe = EnumC666200QBe.DEFAULT;
        }
        PlaceUserInfo placeUserInfo2 = null;
        if ((i & 32) == 0) {
            str4 = str3;
        }
        if ((i & 64) != 0) {
            iIntValue2 = 0;
        }
        if ((i & 128) == 0) {
            z = zBooleanValue2;
        }
        if ((i & 256) != 0) {
            iIntValue3 = -1;
        }
        if ((i & 512) == 0) {
            placeUserInfo2 = placeUserInfo;
        }
        return new FindFriendsPageArg(zBooleanValue, iIntValue, str, str5, enumC666200QBe, str4, iIntValue2, z, iIntValue3, placeUserInfo2);
    }

    public FindFriendsPageArg(boolean z, int i, String str, String str2, EnumC666200QBe enumC666200QBe, String str3, int i2, boolean z2, int i3, PlaceUserInfo placeUserInfo) {
        this.darkMode = z;
        this.transitionType = i;
        this.previousPage = str;
        this.previousPosition = str2;
        this.pageStyle = enumC666200QBe;
        this.recUserSharedKey = str3;
        this.newMafCount = i2;
        this.newSuggestArea = z2;
        this.mafApiScene = i3;
        this.placeUserInfo = placeUserInfo;
    }
}
