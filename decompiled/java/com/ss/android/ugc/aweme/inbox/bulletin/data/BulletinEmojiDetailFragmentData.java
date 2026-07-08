package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailListFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiDetailFragmentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiDetailFragmentData extends PowerViewPagerFragmentItem<BulletinEmojiDetailListFragment> {
    public final long bbId;
    public final long bbItemId;
    public final int count;
    public final String currentEmoji;
    public final int tabType;
    public final boolean useCacheData;
    public static final Parcelable.Creator<BulletinEmojiDetailFragmentData> CREATOR = new Parcelable.Creator<BulletinEmojiDetailFragmentData>() { // from class: X.0Obn
        @Override // android.os.Parcelable.Creator
        public final BulletinEmojiDetailFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new BulletinEmojiDetailFragmentData(i, i2, j, j2, string, z);
        }

        @Override // android.os.Parcelable.Creator
        public final BulletinEmojiDetailFragmentData[] newArray(int i) {
            return new BulletinEmojiDetailFragmentData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinEmojiDetailFragmentData)) {
            return false;
        }
        BulletinEmojiDetailFragmentData bulletinEmojiDetailFragmentData = (BulletinEmojiDetailFragmentData) obj;
        return this.bbId == bulletinEmojiDetailFragmentData.bbId && this.bbItemId == bulletinEmojiDetailFragmentData.bbItemId && Intrinsics.LJFF(this.currentEmoji, bulletinEmojiDetailFragmentData.currentEmoji) && this.tabType == bulletinEmojiDetailFragmentData.tabType && this.count == bulletinEmojiDetailFragmentData.count && this.useCacheData == bulletinEmojiDetailFragmentData.useCacheData;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.bbId) * 31) + C786410Ut5.Y2(this.bbItemId)) * 31;
        String str = this.currentEmoji;
        return ((((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.tabType) * 31) + this.count) * 31) + C786410Ut5.Z2(this.useCacheData);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiDetailFragmentData(bbId=");
        sbLIZ.append(this.bbId);
        sbLIZ.append(", bbItemId=");
        sbLIZ.append(this.bbItemId);
        sbLIZ.append(", currentEmoji=");
        sbLIZ.append(this.currentEmoji);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.tabType);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", useCacheData=");
        sbLIZ.append(this.useCacheData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.bbId);
        parcel.writeLong(this.bbItemId);
        parcel.writeString(this.currentEmoji);
        parcel.writeInt(this.tabType);
        parcel.writeInt(this.count);
        parcel.writeInt(this.useCacheData ? 1 : 0);
    }

    public BulletinEmojiDetailFragmentData(int i, int i2, long j, long j2, String str, boolean z) {
        this.bbId = j;
        this.bbItemId = j2;
        this.currentEmoji = str;
        this.tabType = i;
        this.count = i2;
        this.useCacheData = z;
    }
}
