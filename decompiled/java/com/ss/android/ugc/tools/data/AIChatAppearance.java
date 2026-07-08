package com.ss.android.ugc.tools.data;

import X.C0LD5;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.GuideAppearance;
import com.ss.android.ugc.tools.data.InputAreaAppearance;
import com.ss.android.ugc.tools.data.PostButtonAppearance;
import com.ss.android.ugc.tools.data.TitleBarAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatAppearance implements Parcelable {
    public static final Parcelable.Creator<AIChatAppearance> CREATOR = new Parcelable.Creator<AIChatAppearance>() { // from class: X.18Wk
        @Override // android.os.Parcelable.Creator
        public final AIChatAppearance createFromParcel(Parcel parcel) {
            GuideAppearance guideAppearanceCreateFromParcel;
            TitleBarAppearance titleBarAppearanceCreateFromParcel = TitleBarAppearance.CREATOR.createFromParcel(parcel);
            InputAreaAppearance inputAreaAppearanceCreateFromParcel = InputAreaAppearance.CREATOR.createFromParcel(parcel);
            PostButtonAppearance postButtonAppearanceCreateFromParcel = PostButtonAppearance.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                guideAppearanceCreateFromParcel = null;
            } else {
                guideAppearanceCreateFromParcel = GuideAppearance.CREATOR.createFromParcel(parcel);
            }
            return new AIChatAppearance(titleBarAppearanceCreateFromParcel, inputAreaAppearanceCreateFromParcel, postButtonAppearanceCreateFromParcel, guideAppearanceCreateFromParcel, C0LD5.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatAppearance[] newArray(int i) {
            return new AIChatAppearance[i];
        }
    };
    public final GuideAppearance guideAppearance;
    public final InputAreaAppearance inputArea;
    public final PostButtonAppearance postButton;
    public final C0LD5 theme;
    public final TitleBarAppearance titleBar;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatAppearance)) {
            return false;
        }
        AIChatAppearance aIChatAppearance = (AIChatAppearance) obj;
        return Intrinsics.LJFF(this.titleBar, aIChatAppearance.titleBar) && Intrinsics.LJFF(this.inputArea, aIChatAppearance.inputArea) && Intrinsics.LJFF(this.postButton, aIChatAppearance.postButton) && Intrinsics.LJFF(this.guideAppearance, aIChatAppearance.guideAppearance) && this.theme == aIChatAppearance.theme;
    }

    public final int hashCode() {
        int iHashCode = ((((this.titleBar.hashCode() * 31) + this.inputArea.hashCode()) * 31) + this.postButton.hashCode()) * 31;
        GuideAppearance guideAppearance = this.guideAppearance;
        return ((iHashCode + (guideAppearance == null ? 0 : guideAppearance.hashCode())) * 31) + this.theme.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatAppearance(titleBar=");
        sbLIZ.append(this.titleBar);
        sbLIZ.append(", inputArea=");
        sbLIZ.append(this.inputArea);
        sbLIZ.append(", postButton=");
        sbLIZ.append(this.postButton);
        sbLIZ.append(", guideAppearance=");
        sbLIZ.append(this.guideAppearance);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.theme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.titleBar.writeToParcel(parcel, i);
        this.inputArea.writeToParcel(parcel, i);
        this.postButton.writeToParcel(parcel, i);
        GuideAppearance guideAppearance = this.guideAppearance;
        if (guideAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guideAppearance.writeToParcel(parcel, i);
        }
        parcel.writeString(this.theme.name());
    }

    public AIChatAppearance(TitleBarAppearance titleBarAppearance, InputAreaAppearance inputAreaAppearance, PostButtonAppearance postButtonAppearance, GuideAppearance guideAppearance, C0LD5 c0ld5) {
        this.titleBar = titleBarAppearance;
        this.inputArea = inputAreaAppearance;
        this.postButton = postButtonAppearance;
        this.guideAppearance = guideAppearance;
        this.theme = c0ld5;
    }
}
