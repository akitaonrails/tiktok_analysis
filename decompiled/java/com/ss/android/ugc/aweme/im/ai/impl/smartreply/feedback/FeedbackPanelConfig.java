package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback;

import X.AnonymousClass0604;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackPanelConfig implements Parcelable {
    public static final Parcelable.Creator<FeedbackPanelConfig> CREATOR = new Parcelable.Creator<FeedbackPanelConfig>() { // from class: X.060X
        @Override // android.os.Parcelable.Creator
        public final FeedbackPanelConfig createFromParcel(Parcel parcel) {
            AnonymousClass0604 anonymousClass0604ValueOf = AnonymousClass0604.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new FeedbackPanelConfig(anonymousClass0604ValueOf, string, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbackPanelConfig[] newArray(int i) {
            return new FeedbackPanelConfig[i];
        }
    };
    public final String conversationId;
    public final String enterMethod;
    public final List<BotFeedbackReason> feedBackReasons;
    public final String msgId;
    public final AnonymousClass0604 panelType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackPanelConfig)) {
            return false;
        }
        FeedbackPanelConfig feedbackPanelConfig = (FeedbackPanelConfig) obj;
        return this.panelType == feedbackPanelConfig.panelType && Intrinsics.LJFF(this.msgId, feedbackPanelConfig.msgId) && Intrinsics.LJFF(this.conversationId, feedbackPanelConfig.conversationId) && Intrinsics.LJFF(this.feedBackReasons, feedbackPanelConfig.feedBackReasons) && Intrinsics.LJFF(this.enterMethod, feedbackPanelConfig.enterMethod);
    }

    public final int hashCode() {
        return (((((((this.panelType.hashCode() * 31) + this.msgId.hashCode()) * 31) + this.conversationId.hashCode()) * 31) + this.feedBackReasons.hashCode()) * 31) + this.enterMethod.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedbackPanelConfig(panelType=");
        sbLIZ.append(this.panelType);
        sbLIZ.append(", msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", feedBackReasons=");
        sbLIZ.append(this.feedBackReasons);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.panelType.name());
        parcel.writeString(this.msgId);
        parcel.writeString(this.conversationId);
        List<BotFeedbackReason> list = this.feedBackReasons;
        parcel.writeInt(list.size());
        Iterator<BotFeedbackReason> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeString(this.enterMethod);
    }

    public FeedbackPanelConfig(AnonymousClass0604 anonymousClass0604, String str, String str2, List<BotFeedbackReason> list, String str3) {
        this.panelType = anonymousClass0604;
        this.msgId = str;
        this.conversationId = str2;
        this.feedBackReasons = list;
        this.enterMethod = str3;
    }
}
