package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C579190Mnd;
import X.InterfaceC2270808v4;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.PhotoEditData;

/* JADX INFO: loaded from: classes9.dex */
public final class NowsShootModel implements Parcelable {

    @C040H
    public Bitmap backBitmap;

    @C09CT("backImagePath")
    @C0MY0
    public String backImagePath;

    @C09CT("backImageSharePath")
    @InterfaceC2270808v4
    public String backImageSharePath;

    @C09CT("edit_data")
    public PhotoEditData editData;

    @C040H
    public Bitmap frontBitmap;

    @C09CT("frontImagePath")
    @C0MY0
    public String frontImagePath;

    @C09CT("frontImageSharePath")
    @InterfaceC2270808v4
    public String frontImageSharePath;

    @C09CT("is_normal_publish")
    public boolean isNormalPublish;

    @C09CT("ltrCompileImage")
    @InterfaceC2270808v4
    public String ltrCompileImage;

    @C040H
    public String multiCameraMode;

    @C09CT("nowsExtra")
    public NowsExtra nowsExtra;

    @C09CT("rtlCompileImage")
    @InterfaceC2270808v4
    public String rtlCompileImage;

    @C09CT("syntheticVideoPath")
    @InterfaceC2270808v4
    public String syntheticVideoPath;

    @C09CT("type")
    public int type;

    @C040H
    public int videoDuration;
    public static final C579190Mnd Companion = new Object() { // from class: X.0Mnd
    };
    public static final Parcelable.Creator<NowsShootModel> CREATOR = new Parcelable.Creator<NowsShootModel>() { // from class: X.0Mnb
        @Override // android.os.Parcelable.Creator
        public final NowsShootModel createFromParcel(Parcel parcel) {
            return new NowsShootModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), NowsExtra.CREATOR.createFromParcel(parcel), PhotoEditData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NowsShootModel[] newArray(int i) {
            return new NowsShootModel[i];
        }
    };

    public NowsShootModel() {
        this(0, null, null, null, null, new NowsExtra("back_first", "", null, "", "", "now", "now_shoot_page", null, 0, null, null, false, false, 0, null), new PhotoEditData(1, true, true), null, null, null, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.backImagePath);
        parcel.writeString(this.frontImagePath);
        parcel.writeString(this.backImageSharePath);
        parcel.writeString(this.frontImageSharePath);
        this.nowsExtra.writeToParcel(parcel, i);
        this.editData.writeToParcel(parcel, i);
        parcel.writeString(this.ltrCompileImage);
        parcel.writeString(this.rtlCompileImage);
        parcel.writeString(this.syntheticVideoPath);
        parcel.writeString(this.multiCameraMode);
    }

    public NowsShootModel(int i, String str, String str2, String str3, String str4, NowsExtra nowsExtra, PhotoEditData photoEditData, String str5, String str6, String str7, String str8) {
        this.type = i;
        this.backImagePath = str;
        this.frontImagePath = str2;
        this.backImageSharePath = str3;
        this.frontImageSharePath = str4;
        this.nowsExtra = nowsExtra;
        this.editData = photoEditData;
        this.ltrCompileImage = str5;
        this.rtlCompileImage = str6;
        this.syntheticVideoPath = str7;
        this.multiCameraMode = str8;
    }
}
