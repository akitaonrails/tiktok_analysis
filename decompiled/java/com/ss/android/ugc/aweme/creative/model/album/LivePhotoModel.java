package com.ss.android.ugc.aweme.creative.model.album;

import X.C040H;
import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoMemoryState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoTransitionEffectParam;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LivePhotoModel implements Parcelable {
    public static final Parcelable.Creator<LivePhotoModel> CREATOR = new Parcelable.Creator<LivePhotoModel>() { // from class: X.0KxP
        @Override // android.os.Parcelable.Creator
        public final LivePhotoModel createFromParcel(Parcel parcel) {
            LivePhotoTransitionEffectParam livePhotoTransitionEffectParamCreateFromParcel;
            boolean z;
            boolean z2;
            LivePhotoPreviewMode livePhotoPreviewModeCreateFromParcel = LivePhotoPreviewMode.CREATOR.createFromParcel(parcel);
            LivePhotoMemoryState livePhotoMemoryStateCreateFromParcel = LivePhotoMemoryState.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(LivePhotoModel.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(LivePhotoModel.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                livePhotoTransitionEffectParamCreateFromParcel = null;
            } else {
                livePhotoTransitionEffectParamCreateFromParcel = LivePhotoTransitionEffectParam.CREATOR.createFromParcel(parcel);
            }
            LivePhotoTransitionEffectParam livePhotoTransitionEffectParam = livePhotoTransitionEffectParamCreateFromParcel;
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
            return new LivePhotoModel(livePhotoPreviewModeCreateFromParcel, livePhotoMemoryStateCreateFromParcel, arrayList, linkedHashMap, livePhotoTransitionEffectParam, z, z2, parcel.readInt(), parcel.readLong(), parcel.readInt(), (CropData) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final LivePhotoModel[] newArray(int i) {
            return new LivePhotoModel[i];
        }
    };

    @C040H
    public int compileRepeatCount;

    @C09CT("crop_data")
    public CropData cropData;

    @C040H
    public long durationMs;

    @C09CT("embedded_video_map")
    public Map<String, MediaModel> embeddedVideoMap;

    @C09CT("enable_live_mode")
    public boolean enableLiveMode;

    @C09CT("enter_to_image_framework")
    public boolean enterToImageFramework;

    @C09CT("imported_live_photo_list")
    public List<? extends MediaModel> importedLivePhotoList;

    @C09CT("live_photo_transition_effect_param")
    public LivePhotoTransitionEffectParam livePhotoTransitionEffectParam;

    @C09CT("memory_state")
    public LivePhotoMemoryState memoryState;

    @C09CT("preview_mode")
    public LivePhotoPreviewMode previewMode;

    @C040H
    public int repeatCount;

    public LivePhotoModel() {
        this(null, null, null, null, null, false, false, 0, 0L, 0, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoModel)) {
            return false;
        }
        LivePhotoModel livePhotoModel = (LivePhotoModel) obj;
        return this.previewMode == livePhotoModel.previewMode && Intrinsics.LJFF(this.memoryState, livePhotoModel.memoryState) && Intrinsics.LJFF(this.importedLivePhotoList, livePhotoModel.importedLivePhotoList) && Intrinsics.LJFF(this.embeddedVideoMap, livePhotoModel.embeddedVideoMap) && Intrinsics.LJFF(this.livePhotoTransitionEffectParam, livePhotoModel.livePhotoTransitionEffectParam) && this.enableLiveMode == livePhotoModel.enableLiveMode && this.enterToImageFramework == livePhotoModel.enterToImageFramework && this.repeatCount == livePhotoModel.repeatCount && this.durationMs == livePhotoModel.durationMs && this.compileRepeatCount == livePhotoModel.compileRepeatCount && Intrinsics.LJFF(this.cropData, livePhotoModel.cropData);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.previewMode.hashCode() * 31) + this.memoryState.hashCode()) * 31) + this.importedLivePhotoList.hashCode()) * 31) + this.embeddedVideoMap.hashCode()) * 31;
        LivePhotoTransitionEffectParam livePhotoTransitionEffectParam = this.livePhotoTransitionEffectParam;
        int iHashCode2 = (((((((((((iHashCode + (livePhotoTransitionEffectParam == null ? 0 : livePhotoTransitionEffectParam.hashCode())) * 31) + C786410Ut5.Z2(this.enableLiveMode)) * 31) + C786410Ut5.Z2(this.enterToImageFramework)) * 31) + this.repeatCount) * 31) + C786410Ut5.Y2(this.durationMs)) * 31) + this.compileRepeatCount) * 31;
        CropData cropData = this.cropData;
        return iHashCode2 + (cropData != null ? cropData.hashCode() : 0);
    }

    public final String toString() {
        return "LivePhotoModel(previewMode=" + this.previewMode + ", memoryState=" + this.memoryState + ", importedLivePhotoList=" + this.importedLivePhotoList + ", embeddedVideoMap=" + this.embeddedVideoMap + ", livePhotoTransitionEffectParam=" + this.livePhotoTransitionEffectParam + ", enableLiveMode=" + this.enableLiveMode + ", enterToImageFramework=" + this.enterToImageFramework + ", repeatCount=" + this.repeatCount + ", durationMs=" + this.durationMs + ", compileRepeatCount=" + this.compileRepeatCount + ", cropData=" + this.cropData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.previewMode.writeToParcel(parcel, i);
        this.memoryState.writeToParcel(parcel, i);
        List<? extends MediaModel> list = this.importedLivePhotoList;
        parcel.writeInt(list.size());
        Iterator<? extends MediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        Map<String, MediaModel> map = this.embeddedVideoMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, MediaModel> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i);
        }
        LivePhotoTransitionEffectParam livePhotoTransitionEffectParam = this.livePhotoTransitionEffectParam;
        if (livePhotoTransitionEffectParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livePhotoTransitionEffectParam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enableLiveMode ? 1 : 0);
        parcel.writeInt(this.enterToImageFramework ? 1 : 0);
        parcel.writeInt(this.repeatCount);
        parcel.writeLong(this.durationMs);
        parcel.writeInt(this.compileRepeatCount);
        parcel.writeSerializable(this.cropData);
    }

    public LivePhotoModel(LivePhotoPreviewMode livePhotoPreviewMode, LivePhotoMemoryState livePhotoMemoryState, List<? extends MediaModel> list, Map<String, MediaModel> map, LivePhotoTransitionEffectParam livePhotoTransitionEffectParam, boolean z, boolean z2, int i, long j, int i2, CropData cropData) {
        this.previewMode = livePhotoPreviewMode;
        this.memoryState = livePhotoMemoryState;
        this.importedLivePhotoList = list;
        this.embeddedVideoMap = map;
        this.livePhotoTransitionEffectParam = livePhotoTransitionEffectParam;
        this.enableLiveMode = z;
        this.enterToImageFramework = z2;
        this.repeatCount = i;
        this.durationMs = j;
        this.compileRepeatCount = i2;
        this.cropData = cropData;
    }

    public LivePhotoModel(LivePhotoPreviewMode livePhotoPreviewMode, LivePhotoMemoryState livePhotoMemoryState, List list, Map map, LivePhotoTransitionEffectParam livePhotoTransitionEffectParam, boolean z, boolean z2, int i, long j, int i2, CropData cropData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? LivePhotoPreviewMode.LIVE_PHOTO : livePhotoPreviewMode, (i3 & 2) != 0 ? new LivePhotoMemoryState(false, false, false, true) : livePhotoMemoryState, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? new LinkedHashMap() : map, (i3 & 16) != 0 ? null : livePhotoTransitionEffectParam, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0 ? z2 : false, (i3 & 128) != 0 ? 1 : i, (i3 & 256) != 0 ? -1L : j, (i3 & 512) != 0 ? -1 : i2, (i3 & 1024) == 0 ? cropData : null);
    }
}
