package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CompileLevel implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CompileLevel[] $VALUES;
    public static final CompileLevel CLOUD_PROCESS_WITH_MUSIC;
    public static final CompileLevel CONCAT_WITH_METADATA;
    public static final CompileLevel COPY;
    public static final CompileLevel COPY_WITH_METADATA;
    public static final Parcelable.Creator<CompileLevel> CREATOR;
    public static final CompileLevel PIC_UPLOAD_DIRECTLY;
    public static final CompileLevel REENCODE;
    public static final CompileLevel REMUX;
    public static final CompileLevel REMUX_VIDEO_AND_AUDIO;
    public static final CompileLevel UNKNOWN;
    public static final CompileLevel UPLOAD_DIRECTLY;

    @C040H
    public final int intVal;

    public static InterfaceC2044707zh<CompileLevel> getEntries() {
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

    static {
        CompileLevel compileLevel = new CompileLevel("UNKNOWN", 0, -1);
        UNKNOWN = compileLevel;
        CompileLevel compileLevel2 = new CompileLevel("REENCODE", 1, 0);
        REENCODE = compileLevel2;
        CompileLevel compileLevel3 = new CompileLevel("REMUX", 2, 1);
        REMUX = compileLevel3;
        CompileLevel compileLevel4 = new CompileLevel("COPY_WITH_METADATA", 3, 2);
        COPY_WITH_METADATA = compileLevel4;
        CompileLevel compileLevel5 = new CompileLevel("COPY", 4, 3);
        COPY = compileLevel5;
        CompileLevel compileLevel6 = new CompileLevel("CONCAT_WITH_METADATA", 5, 4);
        CONCAT_WITH_METADATA = compileLevel6;
        CompileLevel compileLevel7 = new CompileLevel("UPLOAD_DIRECTLY", 6, 5);
        UPLOAD_DIRECTLY = compileLevel7;
        CompileLevel compileLevel8 = new CompileLevel("CLOUD_PROCESS_WITH_MUSIC", 7, 6);
        CLOUD_PROCESS_WITH_MUSIC = compileLevel8;
        CompileLevel compileLevel9 = new CompileLevel("PIC_UPLOAD_DIRECTLY", 8, 7);
        PIC_UPLOAD_DIRECTLY = compileLevel9;
        CompileLevel compileLevel10 = new CompileLevel("REMUX_VIDEO_AND_AUDIO", 9, 8);
        REMUX_VIDEO_AND_AUDIO = compileLevel10;
        CompileLevel[] compileLevelArr = {compileLevel, compileLevel2, compileLevel3, compileLevel4, compileLevel5, compileLevel6, compileLevel7, compileLevel8, compileLevel9, compileLevel10};
        $VALUES = compileLevelArr;
        $ENTRIES = new C2254308sP(compileLevelArr);
        CREATOR = new Parcelable.Creator<CompileLevel>() { // from class: X.0nT5
            @Override // android.os.Parcelable.Creator
            public final CompileLevel createFromParcel(Parcel parcel) {
                return CompileLevel.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CompileLevel[] newArray(int i) {
                return new CompileLevel[i];
            }
        };
    }

    public static CompileLevel[] values() {
        return (CompileLevel[]) $VALUES.clone();
    }

    public final int getIntVal() {
        return this.intVal;
    }

    public static CompileLevel valueOf(String str) {
        return (CompileLevel) C08FF.LIZ(CompileLevel.class, str);
    }

    public CompileLevel(String str, int i, int i2) {
        this.intVal = i2;
    }
}
