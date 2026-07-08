package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C11UL;
import X.C2188811AlT;
import X.C2353809Ke;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class ReadTextEffectBean extends C11UL implements Parcelable {
    public static final Parcelable.Creator<ReadTextEffectBean> CREATOR = new Parcelable.Creator<ReadTextEffectBean>() { // from class: X.092A
        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectBean createFromParcel(Parcel parcel) {
            return new ReadTextEffectBean((Effect) parcel.readParcelable(ReadTextEffectBean.class.getClassLoader()), (ReadTextEffectSpeakerExtra) parcel.readParcelable(ReadTextEffectBean.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectBean[] newArray(int i) {
            return new ReadTextEffectBean[i];
        }
    };
    public TTSCategory category;
    public boolean instantClonePlaceHolder;
    public final Effect mEffect;
    public final ReadTextEffectSpeakerExtra mSpeaker;
    public boolean selected;
    public boolean voiceClonePlaceHolder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mEffect, i);
        parcel.writeParcelable(this.mSpeaker, i);
    }

    public final boolean LIZJ() {
        return this.mSpeaker.voiceUseCommercial == 1 && !C2353809Ke.LIZ;
    }

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.category.name);
        sbLIZ.append('_');
        sbLIZ.append(this.effect.getName());
        sbLIZ.append('_');
        sbLIZ.append(this.mSpeaker.speakreID);
        sbLIZ.append('_');
        sbLIZ.append(this.mSpeaker.streamTTSSpkID);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReadTextEffectBean) {
            return Intrinsics.LJFF(((C11UL) obj).effect.getEffectId(), this.effect.getEffectId());
        }
        return false;
    }

    public ReadTextEffectBean(Effect effect, ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra) {
        super(effect);
        this.mEffect = effect;
        this.mSpeaker = readTextEffectSpeakerExtra;
        this.category = new TTSCategory((String) null, (String) null, (String) null, 15);
    }
}
