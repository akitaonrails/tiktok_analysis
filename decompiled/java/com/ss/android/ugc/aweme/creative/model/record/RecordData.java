package com.ss.android.ugc.aweme.creative.model.record;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.RecordData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordData implements Parcelable {
    public static final Parcelable.Creator<RecordData> CREATOR = new Parcelable.Creator<RecordData>() { // from class: X.0mft
        @Override // android.os.Parcelable.Creator
        public final RecordData createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            boolean z2;
            boolean z3;
            boolean z4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string6 = parcel.readString();
            long j = parcel.readLong();
            float f = parcel.readFloat();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i5 = parcel.readInt();
                arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(Boolean.valueOf(z2));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            int i7 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            int i8 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            FilterBean filterBean = (FilterBean) parcel.readParcelable(RecordData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new RecordData(string, string2, string3, string4, string5, i, i2, i3, string6, j, f, i4, z, arrayListCreateStringArrayList, arrayList, arrayListCreateStringArrayList2, i7, arrayListCreateStringArrayList3, i8, arrayListCreateStringArrayList4, z3, string7, string8, filterBean, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordData[] newArray(int i) {
            return new RecordData[i];
        }
    };

    @C040H
    public String applyEffectId;

    @C040H
    public String applyEffectResId;

    @C09CT("cameraIds")
    public String cameraIds;

    @C040H
    public ArrayList<String> cameraLensInfo;

    @C09CT("cameraPosition")
    public int cameraPosition;

    @C040H
    public boolean containBackgroundVideo;

    @C040H
    public float currentZoomValue;

    @C040H
    public FilterBean defaultFilter;

    @C040H
    public String encodedAudioOutputFile;

    @C040H
    public long enterShootPageTime;

    @C09CT("fromItemId")
    public String fromItemId;

    @C09CT("fromPropId")
    public String fromPropId;

    @C09CT("hardEncode")
    public int hardEncode;

    @C09CT("is_child_effect")
    public ArrayList<Boolean> isChildEffect;

    @C040H
    public boolean isEditorProToRecord;

    @C040H
    public boolean isEditorProToRecordRetake;

    @C040H
    public boolean isLongVideoRecordingMode;

    @C040H
    public boolean lightRecordContainerMode;

    @C040H
    public long maxDuration;

    @C09CT("origin")
    public int origin;

    @C040H
    public int recordMode;

    @C09CT("recordTypeList")
    public ArrayList<String> recordTypeList;

    @C09CT("resourceId")
    public ArrayList<String> resourceId;

    @C040H
    public int shootMode;

    @C040H
    public int shootedShootMode;

    @C09CT("tabKey")
    public ArrayList<String> tabKey;

    @C09CT("videoSegmentsDesc")
    public String videoSegmentsDesc;

    @C09CT("videoSpeed")
    public String videoSpeed;

    public RecordData() {
        this("", "", null, null, null, 0, 0, 0, null, 15000L, 0.0f, 0, false, null, null, null, 0, null, -1, null, false, "", "", null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fromItemId);
        parcel.writeString(this.fromPropId);
        parcel.writeString(this.videoSpeed);
        parcel.writeString(this.cameraIds);
        parcel.writeString(this.videoSegmentsDesc);
        parcel.writeInt(this.origin);
        parcel.writeInt(this.hardEncode);
        parcel.writeInt(this.cameraPosition);
        parcel.writeString(this.encodedAudioOutputFile);
        parcel.writeLong(this.maxDuration);
        parcel.writeFloat(this.currentZoomValue);
        parcel.writeInt(this.shootMode);
        parcel.writeInt(this.isLongVideoRecordingMode ? 1 : 0);
        parcel.writeStringList(this.tabKey);
        ArrayList<Boolean> arrayList = this.isChildEffect;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Boolean> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().booleanValue() ? 1 : 0);
            }
        }
        parcel.writeStringList(this.resourceId);
        parcel.writeInt(this.recordMode);
        parcel.writeStringList(this.recordTypeList);
        parcel.writeInt(this.shootedShootMode);
        parcel.writeStringList(this.cameraLensInfo);
        parcel.writeInt(this.containBackgroundVideo ? 1 : 0);
        parcel.writeString(this.applyEffectId);
        parcel.writeString(this.applyEffectResId);
        parcel.writeParcelable(this.defaultFilter, i);
        parcel.writeInt(this.lightRecordContainerMode ? 1 : 0);
    }

    public RecordData(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, long j, float f, int i4, boolean z, ArrayList<String> arrayList, ArrayList<Boolean> arrayList2, ArrayList<String> arrayList3, int i5, ArrayList<String> arrayList4, int i6, ArrayList<String> arrayList5, boolean z2, String str7, String str8, FilterBean filterBean, boolean z3) {
        this.fromItemId = str;
        this.fromPropId = str2;
        this.videoSpeed = str3;
        this.cameraIds = str4;
        this.videoSegmentsDesc = str5;
        this.origin = i;
        this.hardEncode = i2;
        this.cameraPosition = i3;
        this.encodedAudioOutputFile = str6;
        this.maxDuration = j;
        this.currentZoomValue = f;
        this.shootMode = i4;
        this.isLongVideoRecordingMode = z;
        this.tabKey = arrayList;
        this.isChildEffect = arrayList2;
        this.resourceId = arrayList3;
        this.recordMode = i5;
        this.recordTypeList = arrayList4;
        this.shootedShootMode = i6;
        this.cameraLensInfo = arrayList5;
        this.containBackgroundVideo = z2;
        this.applyEffectId = str7;
        this.applyEffectResId = str8;
        this.defaultFilter = filterBean;
        this.lightRecordContainerMode = z3;
    }
}
