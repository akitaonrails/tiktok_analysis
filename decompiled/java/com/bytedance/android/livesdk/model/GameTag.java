package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C0UT3;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.GameTagCategory;
import com.bytedance.android.livesdk.model.Hashtag;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class GameTag implements Parcelable {

    @C09CT("bundle_id")
    public String bundleId;

    @C09CT("full_name")
    public String fullName;

    @C09CT("game_category")
    public List<GameTagCategory> gameCategory;

    @C09CT("gar")
    public List<GameAgeRating> gar;

    @C09CT("hashtag_list")
    public List<Hashtag> hashtagList;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;
    public boolean isFromClick;

    @C09CT("is_new_game")
    public boolean isNewGame;

    @C09CT("landscape")
    public int landscape;

    @C09CT("package_name")
    public String packageName;
    public boolean selected;

    @C09CT("short_name")
    public String shortName;

    @C09CT("show_name")
    public String showName;
    public static final C0UT3 Companion = new Object() { // from class: X.0UT3
    };
    public static final Parcelable.Creator<GameTag> CREATOR = new Parcelable.Creator<GameTag>() { // from class: X.0UT1
        @Override // android.os.Parcelable.Creator
        public final GameTag createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(Hashtag.CREATOR.createFromParcel(parcel));
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(GameTagCategory.CREATOR.createFromParcel(parcel));
            }
            return new GameTag(lValueOf, string, string2, string3, i, string4, string5, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final GameTag[] newArray(int i) {
            return new GameTag[i];
        }
    };

    /* JADX INFO: loaded from: classes.dex */
    public static final class GameAgeRating {

        @C09CT("ar")
        public int ar;

        @C09CT("rs")
        public int rs;
    }

    public GameTag() {
        this(null, null, null, null, 0, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.showName);
        parcel.writeString(this.shortName);
        parcel.writeString(this.fullName);
        parcel.writeInt(this.landscape);
        parcel.writeString(this.packageName);
        parcel.writeString(this.bundleId);
        List<Hashtag> list = this.hashtagList;
        parcel.writeInt(list.size());
        Iterator<Hashtag> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<GameTagCategory> list2 = this.gameCategory;
        parcel.writeInt(list2.size());
        Iterator<GameTagCategory> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public final Hashtag firstHashTag() {
        List<Hashtag> list = this.hashtagList;
        if (list != null) {
            return (Hashtag) C13LP.LJJJLL(list);
        }
        return null;
    }

    public final boolean isMobileGame() {
        List<GameTagCategory> list = this.gameCategory;
        if (list == null) {
            return false;
        }
        Iterator<GameTagCategory> it2 = list.iterator();
        while (it2.hasNext()) {
            GameTagCategory next = it2.next();
            if (next.gameType == 2) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean isNonGameItem() {
        Long l = this.id;
        return l != null && l.longValue() == 0;
    }

    public final boolean isNonGameOrOtherGameItem() {
        Long l = this.id;
        if (l != null && l.longValue() == -1) {
            return true;
        }
        Long l2 = this.id;
        return l2 != null && l2.longValue() == 0;
    }

    public final boolean isOtherGameItem() {
        Long l = this.id;
        return l != null && l.longValue() == -1;
    }

    public final boolean isRealGameItem() {
        Long l = this.id;
        return (l == null || l.longValue() != 0) && !isNonGameItem();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameTag(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", showName=");
        sbLIZ.append(this.showName);
        sbLIZ.append(", shortName=");
        sbLIZ.append(this.shortName);
        sbLIZ.append(", fullName=");
        sbLIZ.append(this.fullName);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.selected);
        sbLIZ.append(" ,landscape =");
        sbLIZ.append(this.landscape);
        sbLIZ.append(",package_name = ");
        sbLIZ.append(this.packageName);
        sbLIZ.append(",bundleId= ");
        sbLIZ.append(this.bundleId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean isFromClick() {
        return this.isFromClick;
    }

    public final void setFromClick(boolean z) {
        this.isFromClick = z;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public GameTag(Long l, String str, String str2, String str3, int i, String str4, String str5, List<Hashtag> list, List<GameTagCategory> list2) {
        this.id = l;
        this.showName = str;
        this.shortName = str2;
        this.fullName = str3;
        this.landscape = i;
        this.packageName = str4;
        this.bundleId = str5;
        this.hashtagList = list;
        this.gameCategory = list2;
        this.gar = new ArrayList();
    }

    public GameTag(Long l, String str, String str2, String str3, int i, String str4, String str5, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : l, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) == 0 ? str5 : "", (i2 & 128) != 0 ? C13BV.INSTANCE : list, (i2 & 256) != 0 ? C13BV.INSTANCE : list2);
    }
}
