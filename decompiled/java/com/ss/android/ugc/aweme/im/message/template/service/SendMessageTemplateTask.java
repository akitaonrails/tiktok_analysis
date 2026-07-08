package com.ss.android.ugc.aweme.im.message.template.service;

import X.C0YC6;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMessageTemplateTask implements Parcelable {
    public static final Parcelable.Creator<SendMessageTemplateTask> CREATOR = new Parcelable.Creator<SendMessageTemplateTask>() { // from class: X.0Ycf
        @Override // android.os.Parcelable.Creator
        public final SendMessageTemplateTask createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            String string = parcel.readString();
            BaseTemplate baseTemplate = (BaseTemplate) parcel.readParcelable(SendMessageTemplateTask.class.getClassLoader());
            SendMessageEventParcel sendMessageEventParcelCreateFromParcel = SendMessageEventParcel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SendMessageTemplateTask(string, baseTemplate, sendMessageEventParcelCreateFromParcel, arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public final SendMessageTemplateTask[] newArray(int i) {
            return new SendMessageTemplateTask[i];
        }
    };
    public AsyncMessageTemplateInfo asyncMessageTemplateInfo;
    public final List<C0YC6> attachments;
    public final String scene;
    public final SendMessageEventParcel sendMessageEventParcel;
    public final BaseTemplate template;
    public final boolean useAsync;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageTemplateTask)) {
            return false;
        }
        SendMessageTemplateTask sendMessageTemplateTask = (SendMessageTemplateTask) obj;
        return Intrinsics.LJFF(this.scene, sendMessageTemplateTask.scene) && Intrinsics.LJFF(this.template, sendMessageTemplateTask.template) && Intrinsics.LJFF(this.sendMessageEventParcel, sendMessageTemplateTask.sendMessageEventParcel) && Intrinsics.LJFF(this.attachments, sendMessageTemplateTask.attachments) && this.useAsync == sendMessageTemplateTask.useAsync;
    }

    public final int hashCode() {
        int iHashCode = ((((this.scene.hashCode() * 31) + this.template.hashCode()) * 31) + this.sendMessageEventParcel.hashCode()) * 31;
        List<C0YC6> list = this.attachments;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.useAsync);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageTemplateTask(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", sendMessageEventParcel=");
        sbLIZ.append(this.sendMessageEventParcel);
        sbLIZ.append(", attachments=");
        sbLIZ.append(this.attachments);
        sbLIZ.append(", useAsync=");
        sbLIZ.append(this.useAsync);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scene);
        parcel.writeParcelable(this.template, i);
        this.sendMessageEventParcel.writeToParcel(parcel, i);
        List<C0YC6> list = this.attachments;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<C0YC6> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeInt(this.useAsync ? 1 : 0);
    }

    public SendMessageTemplateTask(String str, BaseTemplate baseTemplate, SendMessageEventParcel sendMessageEventParcel, List<C0YC6> list, boolean z) {
        this.scene = str;
        this.template = baseTemplate;
        this.sendMessageEventParcel = sendMessageEventParcel;
        this.attachments = list;
        this.useAsync = z;
    }

    public /* synthetic */ SendMessageTemplateTask(String str, BaseTemplate baseTemplate, SendMessageEventParcel sendMessageEventParcel, List list, boolean z, int i) {
        this(str, baseTemplate, sendMessageEventParcel, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z);
    }
}
