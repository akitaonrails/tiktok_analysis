package defpackage;

import X.C01GW;
import X.C2188811AlT;
import X.C2237891CiR;
import X.C2237911CiT;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class BulletinExtraComponent implements BaseComponent<C2237891CiR> {
    public final long exposeCnt;
    public static final b Companion = new b();
    public static final Parcelable.Creator<BulletinExtraComponent> CREATOR = new c();
    public static final C01GW<BulletinExtraComponent> DEFAULT_BUBBLE_CARD_EXTRA_COMPONENT$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(0));

    public static final class b {
        public static BulletinExtraComponent LIZ() {
            return BulletinExtraComponent.DEFAULT_BUBBLE_CARD_EXTRA_COMPONENT$delegate.getValue();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BulletinExtraComponent) && this.exposeCnt == ((BulletinExtraComponent) obj).exposeCnt;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.exposeCnt);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinExtraComponent(exposeCnt=");
        sbLIZ.append(this.exposeCnt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.exposeCnt);
    }

    public BulletinExtraComponent() {
        this(0L);
    }

    public final C2237891CiR LIZ() {
        C2237911CiT c2237911CiT = new C2237911CiT();
        c2237911CiT.LIZLLL = Long.valueOf(this.exposeCnt);
        return c2237911CiT.build();
    }

    public static final class c implements Parcelable.Creator<BulletinExtraComponent> {
        @Override // android.os.Parcelable.Creator
        public final BulletinExtraComponent createFromParcel(Parcel parcel) {
            return new BulletinExtraComponent(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final BulletinExtraComponent[] newArray(int i) {
            return new BulletinExtraComponent[i];
        }
    }

    public BulletinExtraComponent(long j) {
        this.exposeCnt = j;
    }
}
