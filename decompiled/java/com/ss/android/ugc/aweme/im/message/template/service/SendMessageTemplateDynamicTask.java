package com.ss.android.ugc.aweme.im.message.template.service;

import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMessageTemplateDynamicTask implements Parcelable {
    public static final Parcelable.Creator<SendMessageTemplateDynamicTask> CREATOR = new Parcelable.Creator<SendMessageTemplateDynamicTask>() { // from class: X.0Ycd
        @Override // android.os.Parcelable.Creator
        public final SendMessageTemplateDynamicTask createFromParcel(Parcel parcel) {
            return new SendMessageTemplateDynamicTask((Function2) parcel.readSerializable(), SendMessageEventParcel.CREATOR.createFromParcel(parcel), (Function2) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final SendMessageTemplateDynamicTask[] newArray(int i) {
            return new SendMessageTemplateDynamicTask[i];
        }
    };
    public final Function2<List<BatchDynamicRequest>, InterfaceC1364105Vn<? super List<BatchDynamicResponse>>, Object> batchDynamicTemplateConstructor;
    public final Function2<String, InterfaceC1364105Vn<? super Pair<String, ? extends BaseTemplate>>, Object> dynamicTemplateConstructor;
    public final SendMessageEventParcel sendMessageEventParcel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageTemplateDynamicTask)) {
            return false;
        }
        SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask = (SendMessageTemplateDynamicTask) obj;
        return Intrinsics.LJFF(this.dynamicTemplateConstructor, sendMessageTemplateDynamicTask.dynamicTemplateConstructor) && Intrinsics.LJFF(this.sendMessageEventParcel, sendMessageTemplateDynamicTask.sendMessageEventParcel) && Intrinsics.LJFF(this.batchDynamicTemplateConstructor, sendMessageTemplateDynamicTask.batchDynamicTemplateConstructor);
    }

    public final int hashCode() {
        Function2<String, InterfaceC1364105Vn<? super Pair<String, ? extends BaseTemplate>>, Object> function2 = this.dynamicTemplateConstructor;
        int iHashCode = (((function2 == null ? 0 : function2.hashCode()) * 31) + this.sendMessageEventParcel.hashCode()) * 31;
        Function2<List<BatchDynamicRequest>, InterfaceC1364105Vn<? super List<BatchDynamicResponse>>, Object> function22 = this.batchDynamicTemplateConstructor;
        return iHashCode + (function22 != null ? function22.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageTemplateDynamicTask(dynamicTemplateConstructor=");
        sbLIZ.append(this.dynamicTemplateConstructor);
        sbLIZ.append(", sendMessageEventParcel=");
        sbLIZ.append(this.sendMessageEventParcel);
        sbLIZ.append(", batchDynamicTemplateConstructor=");
        sbLIZ.append(this.batchDynamicTemplateConstructor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable((Serializable) this.dynamicTemplateConstructor);
        this.sendMessageEventParcel.writeToParcel(parcel, i);
        parcel.writeSerializable((Serializable) this.batchDynamicTemplateConstructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SendMessageTemplateDynamicTask(Function2<? super String, ? super InterfaceC1364105Vn<? super Pair<String, ? extends BaseTemplate>>, ? extends Object> function2, SendMessageEventParcel sendMessageEventParcel, Function2<? super List<BatchDynamicRequest>, ? super InterfaceC1364105Vn<? super List<BatchDynamicResponse>>, ? extends Object> function22) {
        this.dynamicTemplateConstructor = function2;
        this.sendMessageEventParcel = sendMessageEventParcel;
        this.batchDynamicTemplateConstructor = function22;
    }
}
