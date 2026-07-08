package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C08FF;
import X.C1443710nfl;
import X.C15438062q;
import X.C2097908Jt;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class StoryUploadPageEntranceType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StoryUploadPageEntranceType[] $VALUES;
    public static final StoryUploadPageEntranceType CAMERA;
    public static final Parcelable.Creator<StoryUploadPageEntranceType> CREATOR;
    public static final C1443710nfl Companion;
    public static final StoryUploadPageEntranceType REVEAL;
    public static final StoryUploadPageEntranceType REVEAL_ONLY;
    public static final StoryUploadPageEntranceType THOUGHT;
    public static final Map<String, StoryUploadPageEntranceType> map;

    @C040H
    public final String value;

    public static InterfaceC2044707zh<StoryUploadPageEntranceType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0nfl] */
    static {
        StoryUploadPageEntranceType storyUploadPageEntranceType = new StoryUploadPageEntranceType("THOUGHT", 0, "note");
        THOUGHT = storyUploadPageEntranceType;
        StoryUploadPageEntranceType storyUploadPageEntranceType2 = new StoryUploadPageEntranceType("CAMERA", 1, "camera");
        CAMERA = storyUploadPageEntranceType2;
        StoryUploadPageEntranceType storyUploadPageEntranceType3 = new StoryUploadPageEntranceType("REVEAL", 2, "reveal");
        REVEAL = storyUploadPageEntranceType3;
        StoryUploadPageEntranceType storyUploadPageEntranceType4 = new StoryUploadPageEntranceType("REVEAL_ONLY", 3, "reveal_only");
        REVEAL_ONLY = storyUploadPageEntranceType4;
        StoryUploadPageEntranceType[] storyUploadPageEntranceTypeArr = {storyUploadPageEntranceType, storyUploadPageEntranceType2, storyUploadPageEntranceType3, storyUploadPageEntranceType4};
        $VALUES = storyUploadPageEntranceTypeArr;
        $ENTRIES = new C2254308sP(storyUploadPageEntranceTypeArr);
        Companion = new Object() { // from class: X.0nfl
        };
        CREATOR = new Parcelable.Creator<StoryUploadPageEntranceType>() { // from class: X.0nfo
            @Override // android.os.Parcelable.Creator
            public final StoryUploadPageEntranceType createFromParcel(Parcel parcel) {
                return StoryUploadPageEntranceType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StoryUploadPageEntranceType[] newArray(int i) {
                return new StoryUploadPageEntranceType[i];
            }
        };
        InterfaceC2044707zh<StoryUploadPageEntranceType> entries = getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (StoryUploadPageEntranceType storyUploadPageEntranceType5 : entries) {
            linkedHashMap.put(storyUploadPageEntranceType5.value, storyUploadPageEntranceType5);
        }
        map = linkedHashMap;
    }

    public static StoryUploadPageEntranceType[] values() {
        return (StoryUploadPageEntranceType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static StoryUploadPageEntranceType valueOf(String str) {
        return (StoryUploadPageEntranceType) C08FF.LIZ(StoryUploadPageEntranceType.class, str);
    }

    public StoryUploadPageEntranceType(String str, int i, String str2) {
        this.value = str2;
    }
}
