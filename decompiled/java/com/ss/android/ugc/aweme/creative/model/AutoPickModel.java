package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickTemplateDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoPickModel implements Parcelable {
    public static final Parcelable.Creator<AutoPickModel> CREATOR = new Parcelable.Creator<AutoPickModel>() { // from class: X.0LAo
        @Override // android.os.Parcelable.Creator
        public final AutoPickModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AutoPickMediaModel.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(AutoPickTemplateDraft.CREATOR.createFromParcel(parcel));
            }
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            return new AutoPickModel(arrayList, string, string2, string3, z, string4, z2, z3, i3, z4, arrayList2, i6, i7, i8, i9, string5, string6, string7, string8, string9, z5, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoPickModel[] newArray(int i) {
            return new AutoPickModel[i];
        }
    };

    @C040H
    public boolean albumNavigationFlag;

    @C09CT("autopick_cluster_id")
    public String clusterId;

    @C09CT("autopick_is_first_try")
    public boolean isFirstTry;

    @C09CT("autopick_is_from_auto_pick_panel")
    public boolean isFromAutoPickPanel;

    @C09CT("autopick_is_repick")
    public boolean isRepick;

    @C09CT("autopick_mae_request_id")
    public String maeRequestId;

    @C09CT("autopick_media_list")
    public final List<AutoPickMediaModel> mediaList;

    @C09CT("autopick_pick_enter_method")
    public String pickEnterMethod;

    @C09CT("autopick_pick_id")
    public String pickId;

    @C09CT("autopick_pick_method")
    public String pickMethod;

    @C09CT("autopick_pick_type")
    public String pickType;

    @C09CT("autopick_picked_image_count")
    public int pickedImageCount;

    @C09CT("autopick_picked_video_count")
    public int pickedVideoCount;

    @C09CT("autopick_raw_asset_image_count")
    public int rawAssetImageCount;

    @C09CT("autopick_raw_asset_video_count")
    public int rawAssetVideoCount;

    @C09CT("autopick_server_generated_theme")
    public boolean serverGeneratedTheme;

    @C09CT("autopick_task_count")
    public int taskCount;

    @C09CT("autopick_template_infos")
    public List<AutoPickTemplateDraft> templateInfos;

    @C09CT("autopick_theme_name")
    public String themeName;

    @C09CT("autopick_to_be_show_auto_cut_panel")
    public boolean tobeShowAutoCutPanel;

    @C09CT("autopick_track_enter_from")
    public String trackEnterFrom;

    @C09CT("autopick_uploaded_vid")
    public String uploadedVid;

    public AutoPickModel() {
        this(new ArrayList(), null, null, "", false, null, false, false, 1, false, new ArrayList(), 0, 0, 0, 0, "", "", "", "", "", false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AutoPickMediaModel> list = this.mediaList;
        parcel.writeInt(list.size());
        Iterator<AutoPickMediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.themeName);
        parcel.writeString(this.clusterId);
        parcel.writeString(this.pickType);
        parcel.writeInt(this.serverGeneratedTheme ? 1 : 0);
        parcel.writeString(this.trackEnterFrom);
        parcel.writeInt(this.isFromAutoPickPanel ? 1 : 0);
        parcel.writeInt(this.albumNavigationFlag ? 1 : 0);
        parcel.writeInt(this.taskCount);
        parcel.writeInt(this.tobeShowAutoCutPanel ? 1 : 0);
        List<AutoPickTemplateDraft> list2 = this.templateInfos;
        parcel.writeInt(list2.size());
        Iterator<AutoPickTemplateDraft> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.rawAssetImageCount);
        parcel.writeInt(this.rawAssetVideoCount);
        parcel.writeInt(this.pickedImageCount);
        parcel.writeInt(this.pickedVideoCount);
        parcel.writeString(this.uploadedVid);
        parcel.writeString(this.maeRequestId);
        parcel.writeString(this.pickId);
        parcel.writeString(this.pickMethod);
        parcel.writeString(this.pickEnterMethod);
        parcel.writeInt(this.isFirstTry ? 1 : 0);
        parcel.writeInt(this.isRepick ? 1 : 0);
    }

    public final boolean LIZ() {
        String str = this.themeName;
        return (str == null || str.length() <= 0 || this.isFromAutoPickPanel) ? false : true;
    }

    public AutoPickModel(List<AutoPickMediaModel> list, String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, int i, boolean z4, List<AutoPickTemplateDraft> list2, int i2, int i3, int i4, int i5, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6) {
        this.mediaList = list;
        this.themeName = str;
        this.clusterId = str2;
        this.pickType = str3;
        this.serverGeneratedTheme = z;
        this.trackEnterFrom = str4;
        this.isFromAutoPickPanel = z2;
        this.albumNavigationFlag = z3;
        this.taskCount = i;
        this.tobeShowAutoCutPanel = z4;
        this.templateInfos = list2;
        this.rawAssetImageCount = i2;
        this.rawAssetVideoCount = i3;
        this.pickedImageCount = i4;
        this.pickedVideoCount = i5;
        this.uploadedVid = str5;
        this.maeRequestId = str6;
        this.pickId = str7;
        this.pickMethod = str8;
        this.pickEnterMethod = str9;
        this.isFirstTry = z5;
        this.isRepick = z6;
    }
}
