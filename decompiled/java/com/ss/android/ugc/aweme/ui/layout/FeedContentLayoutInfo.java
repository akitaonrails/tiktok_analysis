package com.ss.android.ugc.aweme.ui.layout;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.aweme.ui.layout.FeedContentUiConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedContentLayoutInfo implements Parcelable {
    public static final Parcelable.Creator<FeedContentLayoutInfo> CREATOR = new Parcelable.Creator<FeedContentLayoutInfo>() { // from class: X.0SMy
        @Override // android.os.Parcelable.Creator
        public final FeedContentLayoutInfo createFromParcel(Parcel parcel) {
            FeedContentLayoutInfo feedContentLayoutInfoCreateFromParcel;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            FeedContentUiConfig feedContentUiConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                feedContentLayoutInfoCreateFromParcel = null;
            } else {
                feedContentLayoutInfoCreateFromParcel = FeedContentLayoutInfo.CREATOR.createFromParcel(parcel);
            }
            FeedContentLayoutInfo feedContentLayoutInfo = feedContentLayoutInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                feedContentUiConfigCreateFromParcel = FeedContentUiConfig.CREATOR.createFromParcel(parcel);
            }
            return new FeedContentLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, feedContentLayoutInfo, feedContentUiConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FeedContentLayoutInfo[] newArray(int i) {
            return new FeedContentLayoutInfo[i];
        }
    };
    public final int belowTextHeight;
    public final int bottom;
    public final int descLineH;
    public final int descriptionLines;
    public final FeedContentLayoutInfo initLayoutInfo;
    public boolean isPlaceholder;
    public final int maxTotalHeight;
    public final int rawDescLines;
    public final int textHeight;
    public final int titleLineH;
    public final int titleLines;
    public final int totalHeight;
    public FeedContentUiConfig uiConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    public FeedContentLayoutInfo() {
        int i = 0;
        this(i, i, i, i, i, i, i, i, i, 4095);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedContentLayoutInfo)) {
            return false;
        }
        FeedContentLayoutInfo feedContentLayoutInfo = (FeedContentLayoutInfo) obj;
        return this.titleLines == feedContentLayoutInfo.titleLines && this.descriptionLines == feedContentLayoutInfo.descriptionLines && this.rawDescLines == feedContentLayoutInfo.rawDescLines && this.totalHeight == feedContentLayoutInfo.totalHeight && this.textHeight == feedContentLayoutInfo.textHeight && this.belowTextHeight == feedContentLayoutInfo.belowTextHeight && this.maxTotalHeight == feedContentLayoutInfo.maxTotalHeight && this.titleLineH == feedContentLayoutInfo.titleLineH && this.descLineH == feedContentLayoutInfo.descLineH && this.bottom == feedContentLayoutInfo.bottom && Intrinsics.LJFF(this.initLayoutInfo, feedContentLayoutInfo.initLayoutInfo) && Intrinsics.LJFF(this.uiConfig, feedContentLayoutInfo.uiConfig);
    }

    public final int hashCode() {
        int i = ((((((((((((((((((this.titleLines * 31) + this.descriptionLines) * 31) + this.rawDescLines) * 31) + this.totalHeight) * 31) + this.textHeight) * 31) + this.belowTextHeight) * 31) + this.maxTotalHeight) * 31) + this.titleLineH) * 31) + this.descLineH) * 31) + this.bottom) * 31;
        FeedContentLayoutInfo feedContentLayoutInfo = this.initLayoutInfo;
        int iHashCode = (i + (feedContentLayoutInfo == null ? 0 : feedContentLayoutInfo.hashCode())) * 31;
        FeedContentUiConfig feedContentUiConfig = this.uiConfig;
        return iHashCode + (feedContentUiConfig != null ? feedContentUiConfig.hashCode() : 0);
    }

    public final String toString() {
        return "FeedContentLayoutInfo(titleLines=" + this.titleLines + ", descriptionLines=" + this.descriptionLines + ", rawDescLines=" + this.rawDescLines + ", totalHeight=" + this.totalHeight + ", textHeight=" + this.textHeight + ", belowTextHeight=" + this.belowTextHeight + ", maxTotalHeight=" + this.maxTotalHeight + ", titleLineH=" + this.titleLineH + ", descLineH=" + this.descLineH + ", bottom=" + this.bottom + ", initLayoutInfo=" + this.initLayoutInfo + ", uiConfig=" + this.uiConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.titleLines);
        parcel.writeInt(this.descriptionLines);
        parcel.writeInt(this.rawDescLines);
        parcel.writeInt(this.totalHeight);
        parcel.writeInt(this.textHeight);
        parcel.writeInt(this.belowTextHeight);
        parcel.writeInt(this.maxTotalHeight);
        parcel.writeInt(this.titleLineH);
        parcel.writeInt(this.descLineH);
        parcel.writeInt(this.bottom);
        FeedContentLayoutInfo feedContentLayoutInfo = this.initLayoutInfo;
        if (feedContentLayoutInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedContentLayoutInfo.writeToParcel(parcel, i);
        }
        FeedContentUiConfig feedContentUiConfig = this.uiConfig;
        if (feedContentUiConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedContentUiConfig.writeToParcel(parcel, i);
        }
    }

    public static FeedContentLayoutInfo LIZ(FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, FeedContentLayoutInfo feedContentLayoutInfo2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        FeedContentUiConfig feedContentUiConfig;
        int i11 = i2;
        FeedContentLayoutInfo feedContentLayoutInfo3 = feedContentLayoutInfo2;
        int i12 = i;
        int i13 = 0;
        if ((i3 & 1) != 0) {
            i4 = feedContentLayoutInfo.titleLines;
        } else {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            i12 = feedContentLayoutInfo.descriptionLines;
        }
        if ((i3 & 4) != 0) {
            i5 = feedContentLayoutInfo.rawDescLines;
        } else {
            i5 = 0;
        }
        if ((i3 & 8) != 0) {
            i6 = feedContentLayoutInfo.totalHeight;
        } else {
            i6 = 0;
        }
        if ((i3 & 16) != 0) {
            i7 = feedContentLayoutInfo.textHeight;
        } else {
            i7 = 0;
        }
        if ((i3 & 32) != 0) {
            i8 = feedContentLayoutInfo.belowTextHeight;
        } else {
            i8 = 0;
        }
        if ((i3 & 64) != 0) {
            i9 = feedContentLayoutInfo.maxTotalHeight;
        } else {
            i9 = 0;
        }
        if ((i3 & 128) != 0) {
            i10 = feedContentLayoutInfo.titleLineH;
        } else {
            i10 = 0;
        }
        if ((i3 & 256) != 0) {
            i13 = feedContentLayoutInfo.descLineH;
        }
        if ((i3 & 512) != 0) {
            i11 = feedContentLayoutInfo.bottom;
        }
        if ((i3 & 1024) != 0) {
            feedContentLayoutInfo3 = feedContentLayoutInfo.initLayoutInfo;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            feedContentUiConfig = feedContentLayoutInfo.uiConfig;
        } else {
            feedContentUiConfig = null;
        }
        feedContentLayoutInfo.getClass();
        return new FeedContentLayoutInfo(i4, i12, i5, i6, i7, i8, i9, i10, i13, i11, feedContentLayoutInfo3, feedContentUiConfig);
    }

    public /* synthetic */ FeedContentLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this((i10 & 1) != 0 ? 0 : i, (i10 & 2) != 0 ? 0 : i2, (i10 & 4) != 0 ? 0 : i3, (i10 & 8) != 0 ? 0 : i4, (i10 & 16) != 0 ? 0 : i5, (i10 & 32) != 0 ? 0 : i6, (i10 & 64) != 0 ? 0 : i7, (i10 & 128) != 0 ? 0 : i8, (i10 & 256) != 0 ? 0 : i9, (i10 & 512) != 0 ? -1 : 0, null, null);
    }

    public FeedContentLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, FeedContentLayoutInfo feedContentLayoutInfo, FeedContentUiConfig feedContentUiConfig) {
        this.titleLines = i;
        this.descriptionLines = i2;
        this.rawDescLines = i3;
        this.totalHeight = i4;
        this.textHeight = i5;
        this.belowTextHeight = i6;
        this.maxTotalHeight = i7;
        this.titleLineH = i8;
        this.descLineH = i9;
        this.bottom = i10;
        this.initLayoutInfo = feedContentLayoutInfo;
        this.uiConfig = feedContentUiConfig;
    }
}
