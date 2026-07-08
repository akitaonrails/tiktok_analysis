package com.ss.android.ugc.aweme.effectplatform;

import X.C09CT;
import X.C13MQ;
import X.C20307314d5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes31.dex */
public final class FilterEffect extends Effect {

    @C09CT("is_buildin")
    public boolean buildIn;

    @C09CT("is_checked")
    public boolean checked;
    public final Effect otherEffect;
    public static final C13MQ Companion = new Object() { // from class: X.13MQ
    };
    public static final Parcelable.Creator<FilterEffect> CREATOR = new C20307314d5(5);

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getInt(boolean z) {
        return z ? 1 : 0;
    }

    public final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public final boolean getBuildIn() {
        return this.buildIn;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public FilterEffect(Effect effect) {
        super(effect);
        this.otherEffect = effect;
    }

    public final void setBuildIn(boolean z) {
        this.buildIn = z;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte((byte) getInt(this.checked));
        parcel.writeByte((byte) getInt(this.checked));
    }
}
