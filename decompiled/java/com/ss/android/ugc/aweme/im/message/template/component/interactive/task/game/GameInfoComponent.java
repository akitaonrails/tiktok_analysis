package com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game;

import X.C18ZU;
import X.C2188811AlT;
import X.C2241671CoX;
import X.EnumC19360410ok;
import X.EnumC19360610om;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class GameInfoComponent implements BaseComponent<C2241671CoX> {
    public static final Parcelable.Creator<GameInfoComponent> CREATOR = new Parcelable.Creator<GameInfoComponent>() { // from class: X.0Zqs
        @Override // android.os.Parcelable.Creator
        public final GameInfoComponent createFromParcel(Parcel parcel) {
            EnumC19360610om enumC19360610omValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ImageComponent imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            EnumC19360410ok enumC19360410okValueOf = null;
            if (parcel.readInt() == 0) {
                enumC19360610omValueOf = null;
            } else {
                enumC19360610omValueOf = EnumC19360610om.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                enumC19360410okValueOf = EnumC19360410ok.valueOf(parcel.readString());
            }
            return new GameInfoComponent(string, string2, string3, imageComponentCreateFromParcel, enumC19360610omValueOf, enumC19360410okValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GameInfoComponent[] newArray(int i) {
            return new GameInfoComponent[i];
        }
    };
    public final String gameId;
    public final String gameName;
    public final ImageComponent gameThumbnail;
    public final EnumC19360610om order;
    public final EnumC19360410ok rankType;
    public final String resId;

    /* JADX WARN: Multi-variable type inference failed */
    public GameInfoComponent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameInfoComponent)) {
            return false;
        }
        GameInfoComponent gameInfoComponent = (GameInfoComponent) obj;
        return Intrinsics.LJFF(this.gameId, gameInfoComponent.gameId) && Intrinsics.LJFF(this.resId, gameInfoComponent.resId) && Intrinsics.LJFF(this.gameName, gameInfoComponent.gameName) && Intrinsics.LJFF(this.gameThumbnail, gameInfoComponent.gameThumbnail) && this.order == gameInfoComponent.order && this.rankType == gameInfoComponent.rankType;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.gameId.hashCode() * 31) + this.resId.hashCode()) * 31) + this.gameName.hashCode()) * 31) + this.gameThumbnail.hashCode()) * 31;
        EnumC19360610om enumC19360610om = this.order;
        int iHashCode2 = (iHashCode + (enumC19360610om == null ? 0 : enumC19360610om.hashCode())) * 31;
        EnumC19360410ok enumC19360410ok = this.rankType;
        return iHashCode2 + (enumC19360410ok != null ? enumC19360410ok.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameInfoComponent(gameId=");
        sbLIZ.append(this.gameId);
        sbLIZ.append(", resId=");
        sbLIZ.append(this.resId);
        sbLIZ.append(", gameName=");
        sbLIZ.append(this.gameName);
        sbLIZ.append(", gameThumbnail=");
        sbLIZ.append(this.gameThumbnail);
        sbLIZ.append(", order=");
        sbLIZ.append(this.order);
        sbLIZ.append(", rankType=");
        sbLIZ.append(this.rankType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.gameId);
        parcel.writeString(this.resId);
        parcel.writeString(this.gameName);
        this.gameThumbnail.writeToParcel(parcel, i);
        EnumC19360610om enumC19360610om = this.order;
        if (enumC19360610om == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC19360610om.name());
        }
        EnumC19360410ok enumC19360410ok = this.rankType;
        if (enumC19360410ok == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC19360410ok.name());
        }
    }

    public GameInfoComponent(String str, String str2, String str3, ImageComponent imageComponent, EnumC19360610om enumC19360610om, EnumC19360410ok enumC19360410ok) {
        this.gameId = str;
        this.resId = str2;
        this.gameName = str3;
        this.gameThumbnail = imageComponent;
        this.order = enumC19360610om;
        this.rankType = enumC19360410ok;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GameInfoComponent(String str, String str2, String str3, ImageComponent imageComponent, EnumC19360610om enumC19360610om, EnumC19360410ok enumC19360410ok, int i) {
        EnumC19360610om enumC19360610om2 = enumC19360610om;
        ImageComponent imageComponentLIZ = imageComponent;
        String str4 = str2;
        String str5 = (i & 1) != 0 ? "" : str;
        str4 = (i & 2) != 0 ? "" : str4;
        String str6 = (i & 4) == 0 ? str3 : "";
        if ((i & 8) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        this(str5, str4, str6, imageComponentLIZ, (i & 16) != 0 ? null : enumC19360610om2, (i & 32) == 0 ? enumC19360410ok : null);
    }
}
