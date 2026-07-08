package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C526710KlB;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutMediaModel implements Parcelable {

    @C09CT("autocut_compress_path")
    @C0MY0
    @InterfaceC2270808v4
    public String compressPath;

    @C09CT("autocut_media_cut_duration")
    public long cutDuration;

    @C09CT("autocut_media_cut_start_time")
    public long cutStartTime;

    @C09CT("autocut_media_date")
    public Long date;

    @C09CT("autocut_media_duration")
    public long duration;

    @C09CT("autocut_media_path")
    @C0MY0(blockCreative = false)
    @InterfaceC2270808v4
    public String filePath;

    @C040H
    public final String fileUriPath;

    @C09CT("autocut_media_height")
    public int height;

    @C09CT("autocut_media_from_live_highlight")
    public boolean isLiveHighlight;

    @C09CT("autocut_media_is_video_type")
    public final boolean isVideoType;

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("autocut_ori_media_path")
    @C0MY0(blockCreative = false)
    public String oriFilePath;

    @C09CT("autocut_media_speed")
    public float speed;

    @C09CT("autocut_media_width")
    public int width;
    public static final C526710KlB Companion = new C526710KlB();
    public static final Parcelable.Creator<AutoCutMediaModel> CREATOR = new Parcelable.Creator<AutoCutMediaModel>() { // from class: X.0KyB
        @Override // android.os.Parcelable.Creator
        public final AutoCutMediaModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new AutoCutMediaModel(string, string2, string3, i, i2, z, j, j2, j3, f, z2, string4, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutMediaModel[] newArray(int i) {
            return new AutoCutMediaModel[i];
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoCutMediaModel() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, j, j, 0.0f, 0 == true ? 1 : 0, objArr3, objArr4, 8191, objArr5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filePath);
        parcel.writeString(this.fileUriPath);
        parcel.writeString(this.oriFilePath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.isVideoType ? 1 : 0);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.cutStartTime);
        parcel.writeLong(this.cutDuration);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.isLiveHighlight ? 1 : 0);
        parcel.writeString(this.compressPath);
        Long l = this.date;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutMediaModel(filePath = ");
        sbLIZ.append(this.filePath);
        sbLIZ.append(", fileUriPath = ");
        sbLIZ.append(this.fileUriPath);
        sbLIZ.append(", width = ");
        sbLIZ.append(this.width);
        sbLIZ.append(", height = ");
        sbLIZ.append(this.height);
        sbLIZ.append(", isVideoType = ");
        sbLIZ.append(this.isVideoType);
        sbLIZ.append(", duration = ");
        sbLIZ.append(this.duration);
        sbLIZ.append(",cutStartTime = ");
        sbLIZ.append(this.cutStartTime);
        sbLIZ.append(",cutDuration = ");
        sbLIZ.append(this.cutDuration);
        sbLIZ.append(",isLiveHighlight = ");
        sbLIZ.append(this.isLiveHighlight);
        sbLIZ.append(',');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoCutMediaModel(String str, String str2, String str3, int i, int i2, boolean z, long j, long j2, long j3, float f, boolean z2, String str4, Long l) {
        this.filePath = str;
        this.fileUriPath = str2;
        this.oriFilePath = str3;
        this.width = i;
        this.height = i2;
        this.isVideoType = z;
        this.duration = j;
        this.cutStartTime = j2;
        this.cutDuration = j3;
        this.speed = f;
        this.isLiveHighlight = z2;
        this.compressPath = str4;
        this.date = l;
    }

    public /* synthetic */ AutoCutMediaModel(String str, String str2, String str3, int i, int i2, boolean z, long j, long j2, long j3, float f, boolean z2, String str4, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? 0L : j, (i3 & 128) == 0 ? j2 : 0L, (i3 & 256) != 0 ? -1L : j3, (i3 & 512) != 0 ? 1.0f : f, (i3 & 1024) == 0 ? z2 : false, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str4 : "", (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l);
    }
}
