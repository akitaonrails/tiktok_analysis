package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.tools.data.AIChatPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatPayload implements Parcelable {
    public static final Parcelable.Creator<AIChatPayload> CREATOR = new Parcelable.Creator<AIChatPayload>() { // from class: X.18TF
        @Override // android.os.Parcelable.Creator
        public final AIChatPayload createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AIChatGenPrompt aIChatGenPrompt = (AIChatGenPrompt) parcel.readParcelable(AIChatPayload.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AIChatPayload.class.getClassLoader()));
                }
            }
            return new AIChatPayload(aIChatGenPrompt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatPayload[] newArray(int i) {
            return new AIChatPayload[i];
        }
    };
    public final List<MediaPayload> medias;
    public final AIChatGenPrompt prompt;

    public AIChatPayload() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatPayload)) {
            return false;
        }
        AIChatPayload aIChatPayload = (AIChatPayload) obj;
        return Intrinsics.LJFF(this.prompt, aIChatPayload.prompt) && Intrinsics.LJFF(this.medias, aIChatPayload.medias);
    }

    public final int hashCode() {
        AIChatGenPrompt aIChatGenPrompt = this.prompt;
        int iHashCode = (aIChatGenPrompt == null ? 0 : aIChatGenPrompt.hashCode()) * 31;
        List<MediaPayload> list = this.medias;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatPayload(prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", medias=");
        sbLIZ.append(this.medias);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.prompt, i);
        List<MediaPayload> list = this.medias;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<MediaPayload> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AIChatPayload(AIChatGenPrompt aIChatGenPrompt, List<? extends MediaPayload> list) {
        this.prompt = aIChatGenPrompt;
        this.medias = list;
    }
}
