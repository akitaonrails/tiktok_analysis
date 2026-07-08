package com.ss.android.ugc.aweme;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.EffectImgCreator$Input;
import com.ss.android.ugc.aweme.data.EffectImgPageConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectImgCreator$Input implements Parcelable {
    public static final Parcelable.Creator<EffectImgCreator$Input> CREATOR = new Parcelable.Creator<EffectImgCreator$Input>() { // from class: X.0vJ9
        @Override // android.os.Parcelable.Creator
        public final EffectImgCreator$Input createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new EffectImgCreator$Input(linkedHashMap, EffectImgPageConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EffectImgCreator$Input[] newArray(int i) {
            return new EffectImgCreator$Input[i];
        }
    };
    public final Map<String, String> commonEventMap;
    public final EffectImgPageConfig pageConfig;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, String> map = this.commonEventMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        this.pageConfig.writeToParcel(parcel, i);
    }

    public EffectImgCreator$Input(Map<String, String> map, EffectImgPageConfig effectImgPageConfig) {
        this.commonEventMap = map;
        this.pageConfig = effectImgPageConfig;
    }
}
