package com.ss.android.ugc.aweme.data;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.data.PlDataBean;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes28.dex */
public final class PlDataBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<PlDataBean> CREATOR = new Parcelable.Creator<PlDataBean>() { // from class: X.0wQq
        @Override // android.os.Parcelable.Creator
        public final PlDataBean createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new PlDataBean(arrayListCreateStringArrayList, string, string2, z, z2, i, i2, i3, i4, i5, i6, i7, i8, i9, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final PlDataBean[] newArray(int i) {
            return new PlDataBean[i];
        }
    };

    @C09CT("albumFilter")
    public int albumFilter;

    @C09CT("alg")
    public ArrayList<String> alg;

    @C09CT("defaultHeight")
    public int defaultHeight;

    @C09CT("defaultWidth")
    public int defaultWidth;

    @C09CT("face_count_max")
    public int faceCountMax;

    @C09CT("face_count_min")
    public int faceCountMin;

    @C09CT("doneButton")
    public boolean forceDoneUploadMode;

    @C09CT("guide")
    public boolean guide;

    @C09CT("imgK")
    public String imgK;

    @C09CT("loading")
    public boolean loading;

    @C09CT("max_count")
    public int maxCount;

    @C09CT("min_count")
    public int minCount;

    @C09CT("minFilterHeight")
    public int minFilterHeight;

    @C09CT("minFilterWidth")
    public int minFilterWidth;

    @C09CT("relation")
    public String relation;

    public PlDataBean() {
        this(new ArrayList(), null, null, true, true, 0, 2, 5, -1, -1, -1, -1, 0, 0, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.alg);
        parcel.writeString(this.relation);
        parcel.writeString(this.imgK);
        parcel.writeInt(this.loading ? 1 : 0);
        parcel.writeInt(this.guide ? 1 : 0);
        parcel.writeInt(this.albumFilter);
        parcel.writeInt(this.faceCountMin);
        parcel.writeInt(this.faceCountMax);
        parcel.writeInt(this.minCount);
        parcel.writeInt(this.maxCount);
        parcel.writeInt(this.defaultHeight);
        parcel.writeInt(this.defaultWidth);
        parcel.writeInt(this.minFilterHeight);
        parcel.writeInt(this.minFilterWidth);
        parcel.writeInt(this.forceDoneUploadMode ? 1 : 0);
    }

    public final int getRealMaxCount() {
        int i = this.maxCount;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public final boolean isMultiSlot() {
        return this.minCount > 0 && this.maxCount > 0;
    }

    public final int getAlbumFilter() {
        return this.albumFilter;
    }

    public final ArrayList<String> getAlg() {
        return this.alg;
    }

    public final int getDefaultHeight() {
        return this.defaultHeight;
    }

    public final int getDefaultWidth() {
        return this.defaultWidth;
    }

    public final int getFaceCountMax() {
        return this.faceCountMax;
    }

    public final int getFaceCountMin() {
        return this.faceCountMin;
    }

    public final boolean getForceDoneUploadMode() {
        return this.forceDoneUploadMode;
    }

    public final boolean getGuide() {
        return this.guide;
    }

    public final String getImgK() {
        return this.imgK;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final int getMinFilterHeight() {
        return this.minFilterHeight;
    }

    public final int getMinFilterWidth() {
        return this.minFilterWidth;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final void setAlbumFilter(int i) {
        this.albumFilter = i;
    }

    public final void setAlg(ArrayList<String> arrayList) {
        this.alg = arrayList;
    }

    public final void setDefaultHeight(int i) {
        this.defaultHeight = i;
    }

    public final void setDefaultWidth(int i) {
        this.defaultWidth = i;
    }

    public final void setFaceCountMax(int i) {
        this.faceCountMax = i;
    }

    public final void setFaceCountMin(int i) {
        this.faceCountMin = i;
    }

    public final void setForceDoneUploadMode(boolean z) {
        this.forceDoneUploadMode = z;
    }

    public final void setGuide(boolean z) {
        this.guide = z;
    }

    public final void setImgK(String str) {
        this.imgK = str;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setMaxCount(int i) {
        this.maxCount = i;
    }

    public final void setMinCount(int i) {
        this.minCount = i;
    }

    public final void setMinFilterHeight(int i) {
        this.minFilterHeight = i;
    }

    public final void setMinFilterWidth(int i) {
        this.minFilterWidth = i;
    }

    public final void setRelation(String str) {
        this.relation = str;
    }

    public PlDataBean(ArrayList<String> arrayList, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z3) {
        this.alg = arrayList;
        this.relation = str;
        this.imgK = str2;
        this.loading = z;
        this.guide = z2;
        this.albumFilter = i;
        this.faceCountMin = i2;
        this.faceCountMax = i3;
        this.minCount = i4;
        this.maxCount = i5;
        this.defaultHeight = i6;
        this.defaultWidth = i7;
        this.minFilterHeight = i8;
        this.minFilterWidth = i9;
        this.forceDoneUploadMode = z3;
    }
}
