package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageStickerInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<ImageStickerInfo> CREATOR = new Parcelable.Creator<ImageStickerInfo>() { // from class: X.0nLL
        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(parcel.readParcelable(ImageStickerInfo.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(parcel.readParcelable(ImageStickerInfo.class.getClassLoader()));
                }
            }
            return new ImageStickerInfo(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfo[] newArray(int i) {
            return new ImageStickerInfo[i];
        }
    };

    @C09CT("recover_stickers")
    public final List<StickerItemModel> recoverStickers;

    @C09CT("stickers")
    public final List<StickerItemModel> stickers;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getRecoverStickers$annotations() {
    }

    public final ImageStickerInfo copy(List<StickerItemModel> list, List<StickerItemModel> list2) {
        return new ImageStickerInfo(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageStickerInfo)) {
            return false;
        }
        ImageStickerInfo imageStickerInfo = (ImageStickerInfo) obj;
        return Intrinsics.LJFF(this.stickers, imageStickerInfo.stickers) && Intrinsics.LJFF(this.recoverStickers, imageStickerInfo.recoverStickers);
    }

    public int hashCode() {
        int iHashCode = this.stickers.hashCode() * 31;
        List<StickerItemModel> list = this.recoverStickers;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageStickerInfo(stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(", recoverStickers=");
        sbLIZ.append(this.recoverStickers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<StickerItemModel> list = this.stickers;
        parcel.writeInt(list.size());
        Iterator<StickerItemModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        List<StickerItemModel> list2 = this.recoverStickers;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<StickerItemModel> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
    }

    public final List<StickerItemModel> getRecoverStickers() {
        return this.recoverStickers;
    }

    public final List<StickerItemModel> getStickers() {
        return this.stickers;
    }

    public ImageStickerInfo(List<StickerItemModel> list, List<StickerItemModel> list2) {
        this.stickers = list;
        this.recoverStickers = list2;
    }

    public /* synthetic */ ImageStickerInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
