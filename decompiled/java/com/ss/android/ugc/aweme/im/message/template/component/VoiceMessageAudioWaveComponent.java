package com.ss.android.ugc.aweme.im.message.template.component;

import X.C13BV;
import X.C1404040mdm;
import X.C2188811AlT;
import X.C2227651CGt;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VoiceMessageAudioWaveComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class VoiceMessageAudioWaveComponent implements BaseComponent<C2227651CGt> {
    public final float sampleRate;
    public final List<Float> volumeLevels;
    public static final C1404040mdm Companion = new Object() { // from class: X.0mdm
    };
    public static final Parcelable.Creator<VoiceMessageAudioWaveComponent> CREATOR = new Parcelable.Creator<VoiceMessageAudioWaveComponent>() { // from class: X.0mdl
        @Override // android.os.Parcelable.Creator
        public final VoiceMessageAudioWaveComponent createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            return new VoiceMessageAudioWaveComponent(arrayList, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceMessageAudioWaveComponent[] newArray(int i) {
            return new VoiceMessageAudioWaveComponent[i];
        }
    };
    public static final VoiceMessageAudioWaveComponent DEFAULT = new VoiceMessageAudioWaveComponent(C13BV.INSTANCE, 0.0f);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceMessageAudioWaveComponent)) {
            return false;
        }
        VoiceMessageAudioWaveComponent voiceMessageAudioWaveComponent = (VoiceMessageAudioWaveComponent) obj;
        return Intrinsics.LJFF(this.volumeLevels, voiceMessageAudioWaveComponent.volumeLevels) && Float.compare(this.sampleRate, voiceMessageAudioWaveComponent.sampleRate) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceMessageAudioWaveComponent(volumeLevels=");
        sbLIZ.append(this.volumeLevels);
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Float> list = this.volumeLevels;
        parcel.writeInt(list.size());
        Iterator<Float> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeFloat(it2.next().floatValue());
        }
        parcel.writeFloat(this.sampleRate);
    }

    public final int hashCode() {
        return (this.volumeLevels.hashCode() * 31) + Float.floatToIntBits(this.sampleRate);
    }

    public VoiceMessageAudioWaveComponent(List<Float> list, float f) {
        this.volumeLevels = list;
        this.sampleRate = f;
    }
}
