package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18ZU;
import X.C2242451Cpn;
import X.C2242511Cpt;
import X.C2243491CrT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.RepostCardStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareRepostComponent implements BaseComponent<C2242451Cpn> {
    public static final Parcelable.Creator<ShareRepostComponent> CREATOR = new Parcelable.Creator<ShareRepostComponent>() { // from class: X.1Cpm
        @Override // android.os.Parcelable.Creator
        public final ShareRepostComponent createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            Parcelable.Creator<BaseUserComponent> creator = BaseUserComponent.CREATOR;
            return new ShareRepostComponent(lValueOf, lValueOf2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), TextComponent.CREATOR.createFromParcel(parcel), ImageComponent.CREATOR.createFromParcel(parcel), RepostCardStatusComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShareRepostComponent[] newArray(int i) {
            return new ShareRepostComponent[i];
        }
    };
    public final Long itemId;
    public final BaseUserComponent itemUserInfo;
    public final Long repostId;
    public final ImageComponent repostImage;
    public final TextComponent repostText;
    public final BaseUserComponent repostUserInfo;
    public final RepostCardStatusComponent status;

    public ShareRepostComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.repostId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.itemId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        this.itemUserInfo.writeToParcel(parcel, i);
        this.repostUserInfo.writeToParcel(parcel, i);
        this.repostText.writeToParcel(parcel, i);
        this.repostImage.writeToParcel(parcel, i);
        this.status.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ShareRepostComponent(int i) {
        C2242511Cpt c2242511Cpt = BaseUserComponent.Companion;
        c2242511Cpt.getClass();
        BaseUserComponent baseUserComponentLIZ = C2242511Cpt.LIZ();
        c2242511Cpt.getClass();
        BaseUserComponent baseUserComponentLIZ2 = C2242511Cpt.LIZ();
        TextComponent.Companion.getClass();
        TextComponent textComponentLIZ = C2243491CrT.LIZ();
        ImageComponent.Companion.getClass();
        this(-1L, -1L, baseUserComponentLIZ, baseUserComponentLIZ2, textComponentLIZ, C18ZU.LIZ(), RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_UNKNOWN);
    }

    public ShareRepostComponent(Long l, Long l2, BaseUserComponent baseUserComponent, BaseUserComponent baseUserComponent2, TextComponent textComponent, ImageComponent imageComponent, RepostCardStatusComponent repostCardStatusComponent) {
        this.repostId = l;
        this.itemId = l2;
        this.itemUserInfo = baseUserComponent;
        this.repostUserInfo = baseUserComponent2;
        this.repostText = textComponent;
        this.repostImage = imageComponent;
        this.status = repostCardStatusComponent;
    }
}
