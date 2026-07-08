package com.ss.android.ugc.aweme.creative.model.record;

import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.creative.model.record.LayoutPlayerType;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraLayoutModel implements Parcelable {
    public static final Parcelable.Creator<CameraLayoutModel> CREATOR = new Parcelable.Creator<CameraLayoutModel>() { // from class: X.0L9Y
        @Override // android.os.Parcelable.Creator
        public final CameraLayoutModel createFromParcel(Parcel parcel) {
            boolean z;
            LayoutApplyFrom layoutApplyFromCreateFromParcel;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LayoutMediaType layoutMediaTypeCreateFromParcel;
            LayoutPlayerType layoutPlayerTypeCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                layoutApplyFromCreateFromParcel = null;
            } else {
                layoutApplyFromCreateFromParcel = LayoutApplyFrom.CREATOR.createFromParcel(parcel);
            }
            LayoutApplyFrom layoutApplyFrom = layoutApplyFromCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LayoutMediaType.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(LayoutMediaSource.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(parcel.readParcelable(CameraLayoutModel.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                layoutMediaTypeCreateFromParcel = null;
            } else {
                layoutMediaTypeCreateFromParcel = LayoutMediaType.CREATOR.createFromParcel(parcel);
            }
            LayoutMediaType layoutMediaType = layoutMediaTypeCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                layoutPlayerTypeCreateFromParcel = null;
            } else {
                layoutPlayerTypeCreateFromParcel = LayoutPlayerType.CREATOR.createFromParcel(parcel);
            }
            LayoutPlayerType layoutPlayerType = layoutPlayerTypeCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(parcel.readParcelable(CameraLayoutModel.class.getClassLoader()));
                }
            }
            return new CameraLayoutModel(z, string, layoutApplyFrom, arrayList, arrayList2, arrayListCreateStringArrayList, arrayList3, layoutMediaType, string2, layoutPlayerType, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraLayoutModel[] newArray(int i) {
            return new CameraLayoutModel[i];
        }
    };

    @C09CT("album_layout_items")
    public ArrayList<TimeSpeedModelExtension> albumLayoutItems;

    @C09CT("layout_items")
    public ArrayList<TimeSpeedModelExtension> captureSegments;

    @C09CT("compile_result_type")
    public LayoutMediaType compileResultType;

    @C09CT("compile_result_file")
    @C0MY0
    public String compiledFilePath;

    @C09CT("layout_apply_from")
    public LayoutApplyFrom layoutApplyFrom;

    @C09CT("layout_enabled")
    public boolean layoutEnabled;

    @C09CT("layout_item_sources")
    public ArrayList<LayoutMediaSource> layoutItemSources;

    @C09CT("layout_item_types")
    public ArrayList<LayoutMediaType> layoutItemTypes;

    @C09CT("layout_mode")
    public String layoutMode;

    @C09CT("layout_player_type")
    public LayoutPlayerType layoutPlayerType;

    @C09CT("origin_file_paths")
    public ArrayList<String> originFilePaths;

    public CameraLayoutModel() {
        this(false, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.layoutEnabled ? 1 : 0);
        parcel.writeString(this.layoutMode);
        LayoutApplyFrom layoutApplyFrom = this.layoutApplyFrom;
        if (layoutApplyFrom == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layoutApplyFrom.writeToParcel(parcel, i);
        }
        ArrayList<LayoutMediaType> arrayList = this.layoutItemTypes;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<LayoutMediaType> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<LayoutMediaSource> arrayList2 = this.layoutItemSources;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<LayoutMediaSource> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.originFilePaths);
        ArrayList<TimeSpeedModelExtension> arrayList3 = this.captureSegments;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator<TimeSpeedModelExtension> it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                parcel.writeParcelable(it4.next(), i);
            }
        }
        LayoutMediaType layoutMediaType = this.compileResultType;
        if (layoutMediaType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layoutMediaType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.compiledFilePath);
        LayoutPlayerType layoutPlayerType = this.layoutPlayerType;
        if (layoutPlayerType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layoutPlayerType.writeToParcel(parcel, i);
        }
        ArrayList<TimeSpeedModelExtension> arrayList4 = this.albumLayoutItems;
        if (arrayList4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList4.size());
        Iterator<TimeSpeedModelExtension> it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            parcel.writeParcelable(it5.next(), i);
        }
    }

    public CameraLayoutModel(boolean z, String str, LayoutApplyFrom layoutApplyFrom, ArrayList<LayoutMediaType> arrayList, ArrayList<LayoutMediaSource> arrayList2, ArrayList<String> arrayList3, ArrayList<TimeSpeedModelExtension> arrayList4, LayoutMediaType layoutMediaType, String str2, LayoutPlayerType layoutPlayerType, ArrayList<TimeSpeedModelExtension> arrayList5) {
        this.layoutEnabled = z;
        this.layoutMode = str;
        this.layoutApplyFrom = layoutApplyFrom;
        this.layoutItemTypes = arrayList;
        this.layoutItemSources = arrayList2;
        this.originFilePaths = arrayList3;
        this.captureSegments = arrayList4;
        this.compileResultType = layoutMediaType;
        this.compiledFilePath = str2;
        this.layoutPlayerType = layoutPlayerType;
        this.albumLayoutItems = arrayList5;
    }
}
