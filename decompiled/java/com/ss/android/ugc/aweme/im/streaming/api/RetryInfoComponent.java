package com.ss.android.ugc.aweme.im.streaming.api;

import X.C01GW;
import X.C1887707aN;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.api.RetryStrategyComponent;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class RetryInfoComponent implements Parcelable {
    public final long delayMs;
    public final int maxRetries;
    public final boolean retryable;
    public final RetryStrategyComponent strategy;
    public static final C1887707aN Companion = new Object() { // from class: X.07aN
    };
    public static final Parcelable.Creator<RetryInfoComponent> CREATOR = new Parcelable.Creator<RetryInfoComponent>() { // from class: X.0Zgf
        @Override // android.os.Parcelable.Creator
        public final RetryInfoComponent createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new RetryInfoComponent(z, RetryStrategyComponent.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RetryInfoComponent[] newArray(int i) {
            return new RetryInfoComponent[i];
        }
    };
    public static final C01GW<RetryInfoComponent> EMPTY$delegate = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(265));

    public RetryInfoComponent() {
        this(false, null, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryInfoComponent)) {
            return false;
        }
        RetryInfoComponent retryInfoComponent = (RetryInfoComponent) obj;
        return this.retryable == retryInfoComponent.retryable && this.strategy == retryInfoComponent.strategy && this.delayMs == retryInfoComponent.delayMs && this.maxRetries == retryInfoComponent.maxRetries;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.retryable) * 31) + this.strategy.hashCode()) * 31) + C786410Ut5.Y2(this.delayMs)) * 31) + this.maxRetries;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetryInfoComponent(retryable=");
        sbLIZ.append(this.retryable);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.strategy);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.delayMs);
        sbLIZ.append(", maxRetries=");
        sbLIZ.append(this.maxRetries);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.retryable ? 1 : 0);
        this.strategy.writeToParcel(parcel, i);
        parcel.writeLong(this.delayMs);
        parcel.writeInt(this.maxRetries);
    }

    public /* synthetic */ RetryInfoComponent(boolean z, RetryStrategyComponent retryStrategyComponent, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? RetryStrategyComponent.NONE : retryStrategyComponent, 0L, (i & 8) != 0 ? 3 : 0);
    }

    public RetryInfoComponent(boolean z, RetryStrategyComponent retryStrategyComponent, long j, int i) {
        this.retryable = z;
        this.strategy = retryStrategyComponent;
        this.delayMs = j;
        this.maxRetries = i;
    }
}
