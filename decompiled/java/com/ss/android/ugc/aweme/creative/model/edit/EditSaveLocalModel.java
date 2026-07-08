package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
public final class EditSaveLocalModel implements Parcelable {
    public static final Parcelable.Creator<EditSaveLocalModel> CREATOR = new Parcelable.Creator<EditSaveLocalModel>() { // from class: X.0mfs
        @Override // android.os.Parcelable.Creator
        public final EditSaveLocalModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Integer numValueOf;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = parcel.readInt();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
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
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(ImageSelectItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            int i5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList2.add(parcel.readParcelable(EditSaveLocalModel.class.getClassLoader()));
            }
            return new EditSaveLocalModel(string, z, z2, i, numValueOf, z3, z4, z5, z6, z7, z8, z9, z10, i2, z11, arrayList, z12, z13, arrayList2, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final EditSaveLocalModel[] newArray(int i) {
            return new EditSaveLocalModel[i];
        }
    };

    @C040H
    public List<AIGCInfo> aigcInfoList;

    @C040H
    public boolean aigcInfoUpdated;

    @C040H
    public boolean compileWatermark;

    @C040H
    public String flowId;

    @C040H
    public boolean forceQuickPublicPost;

    @C040H
    public boolean forceSaveToVideo;

    @C040H
    public boolean forceSaveWithWatermark;

    @C040H
    public int imageModeSelectedItem;

    @C040H
    public boolean isAiSelf;

    @C040H
    public boolean isBackFromQuickPublish;

    @C040H
    public boolean isChoosePhotos;

    @C040H
    public boolean isClickQuickPublishToNext;

    @C040H
    public boolean isFromDMPanel;

    @C040H
    public boolean isFromQuickPublish;

    @C040H
    public boolean isQuickPostAsStory;

    @C040H
    public Integer moderationResult;

    @C040H
    public int saveLocalProgress;

    @C040H
    public List<ImageSelectItem> selectedImagesList;

    @C040H
    public List<String> sourceWithoutAIGCInfoList;

    @C040H
    public boolean withSaveTypeOption;

    public EditSaveLocalModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.flowId);
        parcel.writeInt(this.compileWatermark ? 1 : 0);
        parcel.writeInt(this.forceSaveWithWatermark ? 1 : 0);
        parcel.writeInt(this.saveLocalProgress);
        Integer num = this.moderationResult;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isFromQuickPublish ? 1 : 0);
        parcel.writeInt(this.isClickQuickPublishToNext ? 1 : 0);
        parcel.writeInt(this.isBackFromQuickPublish ? 1 : 0);
        parcel.writeInt(this.isQuickPostAsStory ? 1 : 0);
        parcel.writeInt(this.forceQuickPublicPost ? 1 : 0);
        parcel.writeInt(this.isFromDMPanel ? 1 : 0);
        parcel.writeInt(this.withSaveTypeOption ? 1 : 0);
        parcel.writeInt(this.forceSaveToVideo ? 1 : 0);
        parcel.writeInt(this.imageModeSelectedItem);
        parcel.writeInt(this.isChoosePhotos ? 1 : 0);
        List<ImageSelectItem> list = this.selectedImagesList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ImageSelectItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isAiSelf ? 1 : 0);
        parcel.writeInt(this.aigcInfoUpdated ? 1 : 0);
        List<AIGCInfo> list2 = this.aigcInfoList;
        parcel.writeInt(list2.size());
        Iterator<AIGCInfo> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
        parcel.writeStringList(this.sourceWithoutAIGCInfoList);
    }

    public /* synthetic */ EditSaveLocalModel(int i) {
        this(UUID.randomUUID().toString(), false, false, -1, null, false, false, false, false, false, false, false, false, -1, false, null, false, false, new ArrayList(), new ArrayList());
    }

    public final void LIZ(String str) {
        this.flowId = str;
    }

    public EditSaveLocalModel(String str, boolean z, boolean z2, int i, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, boolean z11, List<ImageSelectItem> list, boolean z12, boolean z13, List<AIGCInfo> list2, List<String> list3) {
        this.flowId = str;
        this.compileWatermark = z;
        this.forceSaveWithWatermark = z2;
        this.saveLocalProgress = i;
        this.moderationResult = num;
        this.isFromQuickPublish = z3;
        this.isClickQuickPublishToNext = z4;
        this.isBackFromQuickPublish = z5;
        this.isQuickPostAsStory = z6;
        this.forceQuickPublicPost = z7;
        this.isFromDMPanel = z8;
        this.withSaveTypeOption = z9;
        this.forceSaveToVideo = z10;
        this.imageModeSelectedItem = i2;
        this.isChoosePhotos = z11;
        this.selectedImagesList = list;
        this.isAiSelf = z12;
        this.aigcInfoUpdated = z13;
        this.aigcInfoList = list2;
        this.sourceWithoutAIGCInfoList = list3;
    }
}
