package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class NLEInfoModel implements Parcelable {
    public static final Parcelable.Creator<NLEInfoModel> CREATOR = new Parcelable.Creator<NLEInfoModel>() { // from class: X.0FP8
        @Override // android.os.Parcelable.Creator
        public final NLEInfoModel createFromParcel(Parcel parcel) {
            boolean z;
            HashMap map;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i2 = parcel.readInt();
                map = new HashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            return new NLEInfoModel(string, string2, i, string3, z, map);
        }

        @Override // android.os.Parcelable.Creator
        public final NLEInfoModel[] newArray(int i) {
            return new NLEInfoModel[i];
        }
    };

    @C040H
    public HashMap<String, String> copyResMap;

    @C09CT("image_nle_data_path")
    @C0MY0
    public String imageNleDataPath;

    @C040H
    public String nleData;

    @C040H
    public boolean nleDataChange;

    @C09CT("nle_data_path")
    @C0MY0
    public String nleDataPath;

    @C09CT("nle_data_version")
    public int nleDataVersion;
    public transient NLEModel nleModel;

    public NLEInfoModel() {
        this("", "", 0, null, true, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nleDataPath);
        parcel.writeString(this.imageNleDataPath);
        parcel.writeInt(this.nleDataVersion);
        parcel.writeString(this.nleData);
        parcel.writeInt(this.nleDataChange ? 1 : 0);
        HashMap<String, String> map = this.copyResMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public NLEInfoModel(String str, String str2, int i, String str3, boolean z, HashMap<String, String> map) {
        this.nleDataPath = str;
        this.imageNleDataPath = str2;
        this.nleDataVersion = i;
        this.nleData = str3;
        this.nleDataChange = z;
        this.copyResMap = map;
    }
}
