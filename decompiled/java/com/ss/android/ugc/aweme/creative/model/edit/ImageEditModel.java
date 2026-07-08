package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.EnumC1438880nXy;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageEditModel implements Parcelable {
    public static final Parcelable.Creator<ImageEditModel> CREATOR = new Parcelable.Creator<ImageEditModel>() { // from class: X.0nXx
        @Override // android.os.Parcelable.Creator
        public final ImageEditModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
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
            boolean z14;
            boolean z15;
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
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
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i4 = parcel.readInt();
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
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            EnumC1438880nXy enumC1438880nXyValueOf = EnumC1438880nXy.valueOf(parcel.readString());
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
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            return new ImageEditModel(map, z, z2, z3, z4, z5, z6, i3, z7, i4, z8, z9, z10, z11, enumC1438880nXyValueOf, z12, z13, z14, z15);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageEditModel[] newArray(int i) {
            return new ImageEditModel[i];
        }
    };

    @C040H
    public boolean cameraIs9to16;

    @C040H
    public boolean enterFromImageMode;

    @C040H
    public boolean enterFromImagePublishPreview;

    @C040H
    public boolean enterFromImageSecondaryPage;

    @C040H
    public boolean enterFromImageSwitch;

    @C040H
    public boolean enterFromPhotoTemplateApplied;

    @C040H
    public boolean fromBenchmark;

    @C040H
    public boolean goToAutoCut;

    @C040H
    public boolean isAutoCropTo3v4;

    @C040H
    public boolean isEditPostEnterImage;

    @C040H
    public boolean isSelectCollageImg;

    @C040H
    public boolean isVideoChildPageFromImage;

    @C040H
    public int livePicCnt;

    @C040H
    public HashMap<String, String> map;

    @C040H
    public boolean needRestoreCollageShowState;

    @C040H
    public boolean needToKeepEdit;

    @C040H
    public int selectedImageIndex;

    @C040H
    public EnumC1438880nXy switchMode;

    @C040H
    public boolean useNewReEditImageExp;

    public ImageEditModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<String, String> map = this.map;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.enterFromImageSwitch ? 1 : 0);
        parcel.writeInt(this.cameraIs9to16 ? 1 : 0);
        parcel.writeInt(this.enterFromPhotoTemplateApplied ? 1 : 0);
        parcel.writeInt(this.enterFromImagePublishPreview ? 1 : 0);
        parcel.writeInt(this.enterFromImageSecondaryPage ? 1 : 0);
        parcel.writeInt(this.goToAutoCut ? 1 : 0);
        parcel.writeInt(this.selectedImageIndex);
        parcel.writeInt(this.isVideoChildPageFromImage ? 1 : 0);
        parcel.writeInt(this.livePicCnt);
        parcel.writeInt(this.isSelectCollageImg ? 1 : 0);
        parcel.writeInt(this.isAutoCropTo3v4 ? 1 : 0);
        parcel.writeInt(this.enterFromImageMode ? 1 : 0);
        parcel.writeInt(this.fromBenchmark ? 1 : 0);
        parcel.writeString(this.switchMode.name());
        parcel.writeInt(this.needToKeepEdit ? 1 : 0);
        parcel.writeInt(this.needRestoreCollageShowState ? 1 : 0);
        parcel.writeInt(this.useNewReEditImageExp ? 1 : 0);
        parcel.writeInt(this.isEditPostEnterImage ? 1 : 0);
    }

    public /* synthetic */ ImageEditModel(int i) {
        this(new HashMap(), false, true, false, false, false, false, 0, false, 0, false, false, false, false, EnumC1438880nXy.NORMAL, false, false, false, false);
    }

    public ImageEditModel(HashMap<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, int i2, boolean z8, boolean z9, boolean z10, boolean z11, EnumC1438880nXy enumC1438880nXy, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.map = map;
        this.enterFromImageSwitch = z;
        this.cameraIs9to16 = z2;
        this.enterFromPhotoTemplateApplied = z3;
        this.enterFromImagePublishPreview = z4;
        this.enterFromImageSecondaryPage = z5;
        this.goToAutoCut = z6;
        this.selectedImageIndex = i;
        this.isVideoChildPageFromImage = z7;
        this.livePicCnt = i2;
        this.isSelectCollageImg = z8;
        this.isAutoCropTo3v4 = z9;
        this.enterFromImageMode = z10;
        this.fromBenchmark = z11;
        this.switchMode = enumC1438880nXy;
        this.needToKeepEdit = z12;
        this.needRestoreCollageShowState = z13;
        this.useNewReEditImageExp = z14;
        this.isEditPostEnterImage = z15;
    }
}
