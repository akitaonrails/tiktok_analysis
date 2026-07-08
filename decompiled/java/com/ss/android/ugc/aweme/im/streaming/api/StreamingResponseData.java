package com.ss.android.ugc.aweme.im.streaming.api;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StreamingResponseData implements Parcelable {
    public static final Parcelable.Creator<StreamingResponseData> CREATOR = new Parcelable.Creator<StreamingResponseData>() { // from class: X.0Zge
        @Override // android.os.Parcelable.Creator
        public final StreamingResponseData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            RetryInfoComponent retryInfoComponentCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(parcel.readParcelable(StreamingResponseData.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                retryInfoComponentCreateFromParcel = null;
            } else {
                retryInfoComponentCreateFromParcel = RetryInfoComponent.CREATOR.createFromParcel(parcel);
            }
            return new StreamingResponseData(string, string2, string3, string4, i, string5, arrayList, z, i4, i5, z2, retryInfoComponentCreateFromParcel, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StreamingResponseData[] newArray(int i) {
            return new StreamingResponseData[i];
        }
    };
    public final List<StreamBlockComponent> blocks;
    public final int errorCode;
    public final String errorMessage;
    public final int firstSeqId;
    public final boolean isFinish;
    public final int messageType;
    public final String replyClientMessageId;
    public final String replyServerMessageId;
    public final String requestLogId;
    public final boolean resetContent;
    public final RetryInfoComponent retryInfo;
    public final String scene;
    public final String sendClientMessageId;
    public final String sendServerMessageId;
    public final int seqId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingResponseData)) {
            return false;
        }
        StreamingResponseData streamingResponseData = (StreamingResponseData) obj;
        return Intrinsics.LJFF(this.replyClientMessageId, streamingResponseData.replyClientMessageId) && Intrinsics.LJFF(this.replyServerMessageId, streamingResponseData.replyServerMessageId) && Intrinsics.LJFF(this.sendServerMessageId, streamingResponseData.sendServerMessageId) && Intrinsics.LJFF(this.sendClientMessageId, streamingResponseData.sendClientMessageId) && this.messageType == streamingResponseData.messageType && Intrinsics.LJFF(this.scene, streamingResponseData.scene) && Intrinsics.LJFF(this.blocks, streamingResponseData.blocks) && this.isFinish == streamingResponseData.isFinish && this.seqId == streamingResponseData.seqId && this.firstSeqId == streamingResponseData.firstSeqId && this.resetContent == streamingResponseData.resetContent && Intrinsics.LJFF(this.retryInfo, streamingResponseData.retryInfo) && this.errorCode == streamingResponseData.errorCode && Intrinsics.LJFF(this.errorMessage, streamingResponseData.errorMessage) && Intrinsics.LJFF(this.requestLogId, streamingResponseData.requestLogId);
    }

    public final int hashCode() {
        int iHashCode = this.replyClientMessageId.hashCode() * 31;
        String str = this.replyServerMessageId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sendServerMessageId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sendClientMessageId;
        int iHashCode4 = (((((((((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.messageType) * 31) + this.scene.hashCode()) * 31) + this.blocks.hashCode()) * 31) + C786410Ut5.Z2(this.isFinish)) * 31) + this.seqId) * 31) + this.firstSeqId) * 31) + C786410Ut5.Z2(this.resetContent)) * 31;
        RetryInfoComponent retryInfoComponent = this.retryInfo;
        int iHashCode5 = (((((iHashCode4 + (retryInfoComponent == null ? 0 : retryInfoComponent.hashCode())) * 31) + this.errorCode) * 31) + this.errorMessage.hashCode()) * 31;
        String str4 = this.requestLogId;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "StreamingResponseData(replyClientMessageId=" + this.replyClientMessageId + ", replyServerMessageId=" + this.replyServerMessageId + ", sendServerMessageId=" + this.sendServerMessageId + ", sendClientMessageId=" + this.sendClientMessageId + ", messageType=" + this.messageType + ", scene=" + this.scene + ", blocks=" + this.blocks + ", isFinish=" + this.isFinish + ", seqId=" + this.seqId + ", firstSeqId=" + this.firstSeqId + ", resetContent=" + this.resetContent + ", retryInfo=" + this.retryInfo + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", requestLogId=" + this.requestLogId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.replyClientMessageId);
        parcel.writeString(this.replyServerMessageId);
        parcel.writeString(this.sendServerMessageId);
        parcel.writeString(this.sendClientMessageId);
        parcel.writeInt(this.messageType);
        parcel.writeString(this.scene);
        List<StreamBlockComponent> list = this.blocks;
        parcel.writeInt(list.size());
        Iterator<StreamBlockComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeInt(this.isFinish ? 1 : 0);
        parcel.writeInt(this.seqId);
        parcel.writeInt(this.firstSeqId);
        parcel.writeInt(this.resetContent ? 1 : 0);
        RetryInfoComponent retryInfoComponent = this.retryInfo;
        if (retryInfoComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            retryInfoComponent.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.requestLogId);
    }

    public static StreamingResponseData LIZ(StreamingResponseData streamingResponseData, List list, boolean z, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3;
        int i4;
        boolean z2;
        RetryInfoComponent retryInfoComponent;
        int i5;
        String str6;
        boolean z3 = z;
        List list2 = list;
        String str7 = null;
        if ((i & 1) != 0) {
            str = streamingResponseData.replyClientMessageId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = streamingResponseData.replyServerMessageId;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = streamingResponseData.sendServerMessageId;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = streamingResponseData.sendClientMessageId;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            i2 = streamingResponseData.messageType;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            str5 = streamingResponseData.scene;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            list2 = streamingResponseData.blocks;
        }
        if ((i & 128) != 0) {
            z3 = streamingResponseData.isFinish;
        }
        if ((i & 256) != 0) {
            i3 = streamingResponseData.seqId;
        } else {
            i3 = 0;
        }
        if ((i & 512) != 0) {
            i4 = streamingResponseData.firstSeqId;
        } else {
            i4 = 0;
        }
        if ((i & 1024) != 0) {
            z2 = streamingResponseData.resetContent;
        } else {
            z2 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            retryInfoComponent = streamingResponseData.retryInfo;
        } else {
            retryInfoComponent = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i5 = streamingResponseData.errorCode;
        } else {
            i5 = 0;
        }
        if ((i & 8192) != 0) {
            str6 = streamingResponseData.errorMessage;
        } else {
            str6 = null;
        }
        if ((i & 16384) != 0) {
            str7 = streamingResponseData.requestLogId;
        }
        streamingResponseData.getClass();
        return new StreamingResponseData(str, str2, str3, str4, i2, str5, list2, z3, i3, i4, z2, retryInfoComponent, i5, str6, str7);
    }

    public StreamingResponseData(String str, String str2, String str3, String str4, int i, String str5, List<StreamBlockComponent> list, boolean z, int i2, int i3, boolean z2, RetryInfoComponent retryInfoComponent, int i4, String str6, String str7) {
        this.replyClientMessageId = str;
        this.replyServerMessageId = str2;
        this.sendServerMessageId = str3;
        this.sendClientMessageId = str4;
        this.messageType = i;
        this.scene = str5;
        this.blocks = list;
        this.isFinish = z;
        this.seqId = i2;
        this.firstSeqId = i3;
        this.resetContent = z2;
        this.retryInfo = retryInfoComponent;
        this.errorCode = i4;
        this.errorMessage = str6;
        this.requestLogId = str7;
    }
}
