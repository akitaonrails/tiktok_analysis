package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraSlotModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CameraSlotModel> CREATOR = new Parcelable.Creator<CameraSlotModel>() { // from class: X.0Kqy
        @Override // android.os.Parcelable.Creator
        public final CameraSlotModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(parcel.readParcelable(CameraSlotModel.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList.add(parcel.readParcelable(CameraSlotModel.class.getClassLoader()));
                }
            }
            int i6 = parcel.readInt();
            VideoTemplateSlot videoTemplateSlot = (VideoTemplateSlot) parcel.readParcelable(CameraSlotModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CameraSlotModel(arrayList2, i3, arrayList, i6, videoTemplateSlot, z);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraSlotModel[] newArray(int i) {
            return new CameraSlotModel[i];
        }
    };

    @C040H
    public VideoTemplateSlot clipProcessMusicItem;

    @C040H
    public boolean isFromShotClick;

    @C040H
    public transient ArrayList<MediaModel> mediaList;

    @C040H
    public int minVideoOrPhotoCount;

    @C040H
    public int slotIndex;

    @C09CT("tt_template_slot_info")
    public ArrayList<VideoTemplateSlot> templateSlots;

    public CameraSlotModel() {
        this(new ArrayList(), -1, new ArrayList(), -1, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList<VideoTemplateSlot> arrayList = this.templateSlots;
        parcel.writeInt(arrayList.size());
        Iterator<VideoTemplateSlot> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeInt(this.slotIndex);
        ArrayList<MediaModel> arrayList2 = this.mediaList;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<MediaModel> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        parcel.writeInt(this.minVideoOrPhotoCount);
        parcel.writeParcelable(this.clipProcessMusicItem, i);
        parcel.writeInt(this.isFromShotClick ? 1 : 0);
    }

    public final VideoTemplateSlot getClipProcessMusicItem() {
        return this.clipProcessMusicItem;
    }

    public final ArrayList<MediaModel> getMediaList() {
        return this.mediaList;
    }

    public final int getMinVideoOrPhotoCount() {
        return this.minVideoOrPhotoCount;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final ArrayList<VideoTemplateSlot> getTemplateSlots() {
        return this.templateSlots;
    }

    public final boolean isFromShotClick() {
        return this.isFromShotClick;
    }

    public final void setClipProcessMusicItem(VideoTemplateSlot videoTemplateSlot) {
        this.clipProcessMusicItem = videoTemplateSlot;
    }

    public final void setFromShotClick(boolean z) {
        this.isFromShotClick = z;
    }

    public final void setMediaList(ArrayList<MediaModel> arrayList) {
        this.mediaList = arrayList;
    }

    public final void setMinVideoOrPhotoCount(int i) {
        this.minVideoOrPhotoCount = i;
    }

    public final void setSlotIndex(int i) {
        this.slotIndex = i;
    }

    public final void setTemplateSlots(ArrayList<VideoTemplateSlot> arrayList) {
        this.templateSlots = arrayList;
    }

    public CameraSlotModel(ArrayList<VideoTemplateSlot> arrayList, int i, ArrayList<MediaModel> arrayList2, int i2, VideoTemplateSlot videoTemplateSlot, boolean z) {
        this.templateSlots = arrayList;
        this.slotIndex = i;
        this.mediaList = arrayList2;
        this.minVideoOrPhotoCount = i2;
        this.clipProcessMusicItem = videoTemplateSlot;
        this.isFromShotClick = z;
    }
}
