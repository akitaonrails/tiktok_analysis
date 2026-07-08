package com.ss.android.ugc.aweme.shortvideo;

import X.C0LJL;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.EditorProRecordVideoContext;

/* JADX INFO: loaded from: classes9.dex */
public final class EditorProRecordVideoContext implements Parcelable {
    public final CreativeInfo creativeInfo;
    public CreativeModel creativeModel;
    public boolean isNows;
    public boolean isPip;
    public boolean isRetake;
    public boolean isRetakeOriginUploadSource;
    public int maxDuration;
    public String musicOrigin;
    public String musicPath;
    public int musicTrimIn;
    public static final C0LJL CREATOR = new Parcelable.Creator<EditorProRecordVideoContext>() { // from class: X.0LJL
        @Override // android.os.Parcelable.Creator
        public final EditorProRecordVideoContext createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            CreativeInfo creativeInfo = (CreativeInfo) parcel.readParcelable(CreativeInfo.class.getClassLoader());
            if (creativeInfo == null) {
                creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            }
            EditorProRecordVideoContext editorProRecordVideoContext = new EditorProRecordVideoContext(creativeInfo);
            editorProRecordVideoContext.creativeModel = (CreativeModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
            editorProRecordVideoContext.musicOrigin = parcel.readString();
            editorProRecordVideoContext.musicPath = parcel.readString();
            editorProRecordVideoContext.musicTrimIn = parcel.readInt();
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            editorProRecordVideoContext.disableBGM = z;
            String string = parcel.readString();
            String str = "";
            if (string == null) {
                string = "";
            }
            editorProRecordVideoContext.recordDir = string;
            String string2 = parcel.readString();
            if (string2 != null) {
                str = string2;
            }
            editorProRecordVideoContext.shootWay = str;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            editorProRecordVideoContext.isNows = z2;
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            editorProRecordVideoContext.isPip = z3;
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            editorProRecordVideoContext.isRetake = z4;
            if (parcel.readInt() == 0) {
                z5 = false;
            }
            editorProRecordVideoContext.isRetakeOriginUploadSource = z5;
            editorProRecordVideoContext.maxDuration = parcel.readInt();
            return editorProRecordVideoContext;
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProRecordVideoContext[] newArray(int i) {
            return new EditorProRecordVideoContext[i];
        }
    };
    public static final int $stable = 8;
    public boolean disableBGM = true;
    public String recordDir = "";
    public String shootWay = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EditorProRecordVideoContext(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.creativeInfo, i);
        CreativeModel creativeModel = this.creativeModel;
        if (creativeModel != null) {
            parcel.writeParcelable(creativeModel, i);
        }
        String str = this.musicOrigin;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        String str3 = this.musicPath;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        parcel.writeInt(this.musicTrimIn);
        parcel.writeInt(this.disableBGM ? 1 : 0);
        parcel.writeString(this.recordDir);
        String str4 = this.shootWay;
        if (str4 != null) {
            str2 = str4;
        }
        parcel.writeString(str2);
        parcel.writeInt(this.isNows ? 1 : 0);
        parcel.writeInt(this.isPip ? 1 : 0);
        parcel.writeInt(this.isRetake ? 1 : 0);
        parcel.writeInt(this.isRetakeOriginUploadSource ? 1 : 0);
        parcel.writeInt(this.maxDuration);
    }
}
