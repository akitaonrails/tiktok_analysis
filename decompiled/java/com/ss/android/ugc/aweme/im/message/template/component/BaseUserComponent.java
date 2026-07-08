package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C2188811AlT;
import X.C2242511Cpt;
import X.C2242531Cpv;
import X.C2242541Cpw;
import X.C2244301Csm;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseUserComponent implements BaseComponent<C2242541Cpw> {
    public ImageComponent avatar;
    public TextComponent description;
    public Integer followerCount;
    public Boolean isVerify;
    public final ActionLinkComponent linkComponent;
    public TextComponent nickname;
    public Long userId;
    public TextComponent username;
    public static final C2242511Cpt Companion = new C2242511Cpt();
    public static final Parcelable.Creator<BaseUserComponent> CREATOR = new Parcelable.Creator<BaseUserComponent>() { // from class: X.1Cpu
        @Override // android.os.Parcelable.Creator
        public final BaseUserComponent createFromParcel(Parcel parcel) {
            Long lValueOf;
            TextComponent textComponentCreateFromParcel;
            TextComponent textComponentCreateFromParcel2;
            ImageComponent imageComponentCreateFromParcel;
            TextComponent textComponentCreateFromParcel3;
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel = null;
            } else {
                textComponentCreateFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent = textComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel2 = null;
            } else {
                textComponentCreateFromParcel2 = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent2 = textComponentCreateFromParcel2;
            if (parcel.readInt() == 0) {
                imageComponentCreateFromParcel = null;
            } else {
                imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            }
            ImageComponent imageComponent = imageComponentCreateFromParcel;
            ActionLinkComponent actionLinkComponentCreateFromParcel = ActionLinkComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                textComponentCreateFromParcel3 = null;
            } else {
                textComponentCreateFromParcel3 = TextComponent.CREATOR.createFromParcel(parcel);
            }
            TextComponent textComponent3 = textComponentCreateFromParcel3;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new BaseUserComponent(lValueOf, textComponent, textComponent2, imageComponent, actionLinkComponentCreateFromParcel, textComponent3, numValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseUserComponent[] newArray(int i) {
            return new BaseUserComponent[i];
        }
    };
    public static final C01GW<BaseUserComponent> EMPTY_USER_INFO$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(71));

    /* JADX WARN: Multi-variable type inference failed */
    public BaseUserComponent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseUserComponent)) {
            return false;
        }
        BaseUserComponent baseUserComponent = (BaseUserComponent) obj;
        return Intrinsics.LJFF(this.userId, baseUserComponent.userId) && Intrinsics.LJFF(this.nickname, baseUserComponent.nickname) && Intrinsics.LJFF(this.description, baseUserComponent.description) && Intrinsics.LJFF(this.avatar, baseUserComponent.avatar) && Intrinsics.LJFF(this.linkComponent, baseUserComponent.linkComponent) && Intrinsics.LJFF(this.username, baseUserComponent.username) && Intrinsics.LJFF(this.followerCount, baseUserComponent.followerCount) && Intrinsics.LJFF(this.isVerify, baseUserComponent.isVerify);
    }

    public final int hashCode() {
        Long l = this.userId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        TextComponent textComponent = this.nickname;
        int iHashCode2 = (iHashCode + (textComponent == null ? 0 : textComponent.hashCode())) * 31;
        TextComponent textComponent2 = this.description;
        int iHashCode3 = (iHashCode2 + (textComponent2 == null ? 0 : textComponent2.hashCode())) * 31;
        ImageComponent imageComponent = this.avatar;
        int iHashCode4 = (((iHashCode3 + (imageComponent == null ? 0 : imageComponent.hashCode())) * 31) + this.linkComponent.hashCode()) * 31;
        TextComponent textComponent3 = this.username;
        int iHashCode5 = (iHashCode4 + (textComponent3 == null ? 0 : textComponent3.hashCode())) * 31;
        Integer num = this.followerCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isVerify;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseUserComponent(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", linkComponent=");
        sbLIZ.append(this.linkComponent);
        sbLIZ.append(", username=");
        sbLIZ.append(this.username);
        sbLIZ.append(", followerCount=");
        sbLIZ.append(this.followerCount);
        sbLIZ.append(", isVerify=");
        sbLIZ.append(this.isVerify);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.userId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        TextComponent textComponent = this.nickname;
        if (textComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent.writeToParcel(parcel, i);
        }
        TextComponent textComponent2 = this.description;
        if (textComponent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent2.writeToParcel(parcel, i);
        }
        ImageComponent imageComponent = this.avatar;
        if (imageComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageComponent.writeToParcel(parcel, i);
        }
        this.linkComponent.writeToParcel(parcel, i);
        TextComponent textComponent3 = this.username;
        if (textComponent3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textComponent3.writeToParcel(parcel, i);
        }
        Integer num = this.followerCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isVerify;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public final C2242541Cpw LIZ() {
        C2242531Cpv c2242531Cpv = new C2242531Cpv();
        c2242531Cpv.LIZLLL = this.userId;
        TextComponent textComponent = this.nickname;
        c2242531Cpv.LJ = textComponent != null ? textComponent.LIZ() : null;
        TextComponent textComponent2 = this.description;
        c2242531Cpv.LJFF = textComponent2 != null ? textComponent2.LIZ() : null;
        ImageComponent imageComponent = this.avatar;
        c2242531Cpv.LJI = imageComponent != null ? imageComponent.LIZIZ() : null;
        c2242531Cpv.LJII = this.linkComponent.LIZIZ();
        TextComponent textComponent3 = this.username;
        c2242531Cpv.LJIIIIZZ = textComponent3 != null ? textComponent3.LIZ() : null;
        c2242531Cpv.LJIIIZ = this.followerCount;
        c2242531Cpv.LJIIJ = this.isVerify;
        return c2242531Cpv.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseUserComponent(Long l, TextComponent textComponent, TextComponent textComponent2, ImageComponent imageComponent, int i) {
        ImageComponent imageComponent2 = imageComponent;
        TextComponent textComponent3 = textComponent2;
        TextComponent textComponent4 = textComponent;
        ActionLinkComponent actionLinkComponentLIZ = null;
        Long l2 = (i & 1) != 0 ? null : l;
        textComponent4 = (i & 2) != 0 ? null : textComponent4;
        textComponent3 = (i & 4) != 0 ? null : textComponent3;
        imageComponent2 = (i & 8) != 0 ? null : imageComponent2;
        if ((i & 16) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        this(l2, textComponent4, textComponent3, imageComponent2, actionLinkComponentLIZ, null, null, null);
    }

    public BaseUserComponent(Long l, TextComponent textComponent, TextComponent textComponent2, ImageComponent imageComponent, ActionLinkComponent actionLinkComponent, TextComponent textComponent3, Integer num, Boolean bool) {
        this.userId = l;
        this.nickname = textComponent;
        this.description = textComponent2;
        this.avatar = imageComponent;
        this.linkComponent = actionLinkComponent;
        this.username = textComponent3;
        this.followerCount = num;
        this.isVerify = bool;
    }
}
