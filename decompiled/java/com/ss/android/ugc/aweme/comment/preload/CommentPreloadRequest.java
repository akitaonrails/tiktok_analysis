package com.ss.android.ugc.aweme.comment.preload;

import X.C1345960l86;
import X.C1402020maW;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes22.dex */
public class CommentPreloadRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1402020maW(0);
    public final Long adCreativeId;
    public final int adPricingType;
    public final String aid;
    public final int authorRelationType;
    public final int channelId;
    public final int commentPreloadType;
    public final int count;
    public final long cursor;
    public final String enterType;
    public final long expireTime;
    public final int forwardPageType;
    public final String insertCids;
    public final int loadType;
    public final int offlinePin;
    public final Object policy;
    public final String searchParams;
    public final long shownCount;
    public final Integer source;
    public final String userAvatarShrink;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CommentPreloadRequest(Parcel parcel) {
        this.aid = parcel.readString();
        this.cursor = parcel.readLong();
        this.count = parcel.readInt();
        this.insertCids = parcel.readString();
        this.forwardPageType = parcel.readInt();
        this.adCreativeId = Long.valueOf(parcel.readLong());
        this.channelId = parcel.readInt();
        this.userAvatarShrink = parcel.readString();
        this.adPricingType = parcel.readInt();
        this.loadType = parcel.readInt();
        this.policy = GsonProtectorUtils.fromJson(new Gson(), parcel.readString(), Object.class);
        this.offlinePin = parcel.readInt();
        this.authorRelationType = parcel.readInt();
        this.enterType = parcel.readString();
        this.searchParams = parcel.readString();
        this.shownCount = parcel.readLong();
        this.commentPreloadType = parcel.readInt();
        this.expireTime = parcel.readLong();
        this.source = Integer.valueOf(parcel.readInt());
    }

    public CommentPreloadRequest(C1345960l86 c1345960l86) {
        this.aid = c1345960l86.LIZ;
        this.cursor = c1345960l86.LIZIZ;
        this.count = c1345960l86.LIZJ;
        this.insertCids = c1345960l86.LIZLLL;
        this.forwardPageType = c1345960l86.LJ;
        this.adCreativeId = c1345960l86.LJFF;
        this.channelId = c1345960l86.LJI;
        this.userAvatarShrink = c1345960l86.LJII;
        this.adPricingType = c1345960l86.LJIIIIZZ;
        this.loadType = c1345960l86.LJIIIZ;
        this.policy = c1345960l86.LJIIJ;
        this.offlinePin = c1345960l86.LJIIJJI;
        this.authorRelationType = c1345960l86.LJIIL;
        this.enterType = c1345960l86.LJIILIIL;
        this.searchParams = c1345960l86.LJIILJJIL;
        this.shownCount = c1345960l86.LJIILL;
        this.commentPreloadType = c1345960l86.LJIILLIIL;
        this.expireTime = 0L;
        this.source = c1345960l86.LJIIZILJ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aid);
        parcel.writeLong(this.cursor);
        parcel.writeInt(this.count);
        parcel.writeString(this.insertCids);
        parcel.writeInt(this.forwardPageType);
        parcel.writeLong(this.adCreativeId.longValue());
        parcel.writeInt(this.channelId);
        parcel.writeString(this.userAvatarShrink);
        parcel.writeInt(this.adPricingType);
        parcel.writeInt(this.loadType);
        parcel.writeString(GsonProtectorUtils.toJson(new Gson(), this.policy));
        parcel.writeInt(this.offlinePin);
        parcel.writeInt(this.authorRelationType);
        parcel.writeString(this.enterType);
        parcel.writeString(this.searchParams);
        parcel.writeLong(this.shownCount);
        parcel.writeLong(this.expireTime);
        parcel.writeInt(this.source.intValue());
    }
}
