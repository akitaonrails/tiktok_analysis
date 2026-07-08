package com.ss.android.ugc.aweme.im.message.persistentext.adapter;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.BotFeedbackData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.ReplySourcePayloadData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.TrackInfoData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PersistentExtraData implements Parcelable {
    public static final Parcelable.Creator<PersistentExtraData> CREATOR = new Parcelable.Creator<PersistentExtraData>() { // from class: X.0ZfS
        @Override // android.os.Parcelable.Creator
        public final PersistentExtraData createFromParcel(Parcel parcel) {
            TrackInfoData trackInfoDataCreateFromParcel;
            Long lValueOf;
            Long lValueOf2;
            ReplySourcePayloadData replySourcePayloadDataCreateFromParcel;
            BotFeedbackData botFeedbackDataCreateFromParcel;
            String string = parcel.readString();
            FeatureAttachmentData featureAttachmentDataCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                trackInfoDataCreateFromParcel = null;
            } else {
                trackInfoDataCreateFromParcel = TrackInfoData.CREATOR.createFromParcel(parcel);
            }
            TrackInfoData trackInfoData = trackInfoDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                replySourcePayloadDataCreateFromParcel = null;
            } else {
                replySourcePayloadDataCreateFromParcel = ReplySourcePayloadData.CREATOR.createFromParcel(parcel);
            }
            ReplySourcePayloadData replySourcePayloadData = replySourcePayloadDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                botFeedbackDataCreateFromParcel = null;
            } else {
                botFeedbackDataCreateFromParcel = BotFeedbackData.CREATOR.createFromParcel(parcel);
            }
            BotFeedbackData botFeedbackData = botFeedbackDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                featureAttachmentDataCreateFromParcel = FeatureAttachmentData.CREATOR.createFromParcel(parcel);
            }
            return new PersistentExtraData(string, trackInfoData, lValueOf, lValueOf2, replySourcePayloadData, botFeedbackData, featureAttachmentDataCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PersistentExtraData[] newArray(int i) {
            return new PersistentExtraData[i];
        }
    };
    public final BotFeedbackData botFeedback;
    public final Long bubbleStyleId;
    public final FeatureAttachmentData featureAttachment;
    public final Long preEntranceType;
    public final ReplySourcePayloadData replySourcePayload;
    public final String sessionId;
    public final TrackInfoData trackInfo;

    public PersistentExtraData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistentExtraData)) {
            return false;
        }
        PersistentExtraData persistentExtraData = (PersistentExtraData) obj;
        return Intrinsics.LJFF(this.sessionId, persistentExtraData.sessionId) && Intrinsics.LJFF(this.trackInfo, persistentExtraData.trackInfo) && Intrinsics.LJFF(this.preEntranceType, persistentExtraData.preEntranceType) && Intrinsics.LJFF(this.bubbleStyleId, persistentExtraData.bubbleStyleId) && Intrinsics.LJFF(this.replySourcePayload, persistentExtraData.replySourcePayload) && Intrinsics.LJFF(this.botFeedback, persistentExtraData.botFeedback) && Intrinsics.LJFF(this.featureAttachment, persistentExtraData.featureAttachment);
    }

    public final int hashCode() {
        String str = this.sessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TrackInfoData trackInfoData = this.trackInfo;
        int iHashCode2 = (iHashCode + (trackInfoData == null ? 0 : trackInfoData.hashCode())) * 31;
        Long l = this.preEntranceType;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.bubbleStyleId;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ReplySourcePayloadData replySourcePayloadData = this.replySourcePayload;
        int iHashCode5 = (iHashCode4 + (replySourcePayloadData == null ? 0 : replySourcePayloadData.hashCode())) * 31;
        BotFeedbackData botFeedbackData = this.botFeedback;
        int iHashCode6 = (iHashCode5 + (botFeedbackData == null ? 0 : botFeedbackData.hashCode())) * 31;
        FeatureAttachmentData featureAttachmentData = this.featureAttachment;
        return iHashCode6 + (featureAttachmentData != null ? featureAttachmentData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PersistentExtraData(sessionId=");
        sbLIZ.append(this.sessionId);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.trackInfo);
        sbLIZ.append(", preEntranceType=");
        sbLIZ.append(this.preEntranceType);
        sbLIZ.append(", bubbleStyleId=");
        sbLIZ.append(this.bubbleStyleId);
        sbLIZ.append(", replySourcePayload=");
        sbLIZ.append(this.replySourcePayload);
        sbLIZ.append(", botFeedback=");
        sbLIZ.append(this.botFeedback);
        sbLIZ.append(", featureAttachment=");
        sbLIZ.append(this.featureAttachment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sessionId);
        TrackInfoData trackInfoData = this.trackInfo;
        if (trackInfoData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trackInfoData.writeToParcel(parcel, i);
        }
        Long l = this.preEntranceType;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.bubbleStyleId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        ReplySourcePayloadData replySourcePayloadData = this.replySourcePayload;
        if (replySourcePayloadData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            replySourcePayloadData.writeToParcel(parcel, i);
        }
        BotFeedbackData botFeedbackData = this.botFeedback;
        if (botFeedbackData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botFeedbackData.writeToParcel(parcel, i);
        }
        FeatureAttachmentData featureAttachmentData = this.featureAttachment;
        if (featureAttachmentData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featureAttachmentData.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PersistentExtraData(int i) {
        this(null, null, 0L, null, null, null, null);
    }

    public PersistentExtraData(String str, TrackInfoData trackInfoData, Long l, Long l2, ReplySourcePayloadData replySourcePayloadData, BotFeedbackData botFeedbackData, FeatureAttachmentData featureAttachmentData) {
        this.sessionId = str;
        this.trackInfo = trackInfoData;
        this.preEntranceType = l;
        this.bubbleStyleId = l2;
        this.replySourcePayload = replySourcePayloadData;
        this.botFeedback = botFeedbackData;
        this.featureAttachment = featureAttachmentData;
    }
}
