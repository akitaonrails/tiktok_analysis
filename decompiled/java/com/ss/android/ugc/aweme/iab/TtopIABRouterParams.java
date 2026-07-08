package com.ss.android.ugc.aweme.iab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.iab.TtopIABRouterParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TtopIABRouterParams implements Parcelable {

    @C09CT("businessScene")
    public final int businessScene;

    @C09CT("conversationId")
    public final String conversationId;

    @C09CT("conversationType")
    public final Integer conversationType;

    @C09CT("hyperlinkEnabled")
    public final boolean hyperlinkEnabled;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("url")
    public final String url;

    @C09CT("userId")
    public final Long userId;
    public static final Parcelable.Creator<TtopIABRouterParams> CREATOR = new Parcelable.Creator<TtopIABRouterParams>() { // from class: X.09gM
        @Override // android.os.Parcelable.Creator
        public final TtopIABRouterParams createFromParcel(Parcel parcel) {
            boolean z;
            Long lValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TtopIABRouterParams(string, i, i2, z, lValueOf, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TtopIABRouterParams[] newArray(int i) {
            return new TtopIABRouterParams[i];
        }
    };
    public static final int $stable = 8;

    public TtopIABRouterParams() {
        this("", 0, 0, true, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtopIABRouterParams)) {
            return false;
        }
        TtopIABRouterParams ttopIABRouterParams = (TtopIABRouterParams) obj;
        return Intrinsics.LJFF(this.url, ttopIABRouterParams.url) && this.scene == ttopIABRouterParams.scene && this.businessScene == ttopIABRouterParams.businessScene && this.hyperlinkEnabled == ttopIABRouterParams.hyperlinkEnabled && Intrinsics.LJFF(this.userId, ttopIABRouterParams.userId) && Intrinsics.LJFF(this.conversationId, ttopIABRouterParams.conversationId) && Intrinsics.LJFF(this.conversationType, ttopIABRouterParams.conversationType);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.url.hashCode() * 31) + this.scene) * 31) + this.businessScene) * 31) + C786410Ut5.Z2(this.hyperlinkEnabled)) * 31;
        Long l = this.userId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.conversationId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.conversationType;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TtopIABRouterParams(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.businessScene);
        sbLIZ.append(", hyperlinkEnabled=");
        sbLIZ.append(this.hyperlinkEnabled);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.conversationType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.scene);
        parcel.writeInt(this.businessScene);
        parcel.writeInt(this.hyperlinkEnabled ? 1 : 0);
        Long l = this.userId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.conversationId);
        Integer num = this.conversationType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public TtopIABRouterParams(String str, int i, int i2, boolean z, Long l, String str2, Integer num) {
        this.url = str;
        this.scene = i;
        this.businessScene = i2;
        this.hyperlinkEnabled = z;
        this.userId = l;
        this.conversationId = str2;
        this.conversationType = num;
    }
}
