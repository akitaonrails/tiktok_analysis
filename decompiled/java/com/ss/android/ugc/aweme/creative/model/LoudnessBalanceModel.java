package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class LoudnessBalanceModel implements Parcelable {
    public static final Parcelable.Creator<LoudnessBalanceModel> CREATOR = new Parcelable.Creator<LoudnessBalanceModel>() { // from class: X.0mj6
        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            String string = parcel.readString();
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), LoudnessDetectResult.CREATOR.createFromParcel(parcel));
            }
            return new LoudnessBalanceModel(arrayList, d, d2, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceModel[] newArray(int i) {
            return new LoudnessBalanceModel[i];
        }
    };

    @C09CT("loudness_balance_types")
    public List<Integer> balanceTypes;

    @C09CT("audio_loudness_result")
    public Map<String, LoudnessDetectResult> loudnessMap;

    @C09CT("shooting_bgm_avg_loudness")
    public double shootingBgmAvgLoudness;

    @InterfaceC2270908v5
    @C09CT("shooting_bgm_path")
    public String shootingBgmPath;

    @C09CT("shooting_bgm_peak_loudness")
    public double shootingBgmPeakLoudness;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Integer> list = this.balanceTypes;
        parcel.writeInt(list.size());
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeDouble(this.shootingBgmAvgLoudness);
        parcel.writeDouble(this.shootingBgmPeakLoudness);
        parcel.writeString(this.shootingBgmPath);
        Map<String, LoudnessDetectResult> map = this.loudnessMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, LoudnessDetectResult> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public LoudnessBalanceModel() {
        this(new ArrayList(), 0.0d, 0.0d, "", Collections.synchronizedMap(new LinkedHashMap()));
    }

    public LoudnessBalanceModel(List<Integer> list, double d, double d2, String str, Map<String, LoudnessDetectResult> map) {
        this.balanceTypes = list;
        this.shootingBgmAvgLoudness = d;
        this.shootingBgmPeakLoudness = d2;
        this.shootingBgmPath = str;
        this.loudnessMap = map;
    }
}
