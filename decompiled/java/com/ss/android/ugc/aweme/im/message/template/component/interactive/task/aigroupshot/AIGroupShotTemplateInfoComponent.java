package com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot;

import X.C2188811AlT;
import X.C2241421Co8;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotTemplateInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGroupShotTemplateInfoComponent implements BaseComponent<C2241421Co8> {
    public static final Parcelable.Creator<AIGroupShotTemplateInfoComponent> CREATOR = new Parcelable.Creator<AIGroupShotTemplateInfoComponent>() { // from class: X.1CoJ
        @Override // android.os.Parcelable.Creator
        public final AIGroupShotTemplateInfoComponent createFromParcel(Parcel parcel) {
            return new AIGroupShotTemplateInfoComponent(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGroupShotTemplateInfoComponent[] newArray(int i) {
            return new AIGroupShotTemplateInfoComponent[i];
        }
    };
    public final int participantCount;
    public final String templateId;
    public final String templateName;
    public final String templateResId;
    public final String templateThumbnailUrl;

    public AIGroupShotTemplateInfoComponent() {
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
        if (!(obj instanceof AIGroupShotTemplateInfoComponent)) {
            return false;
        }
        AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent = (AIGroupShotTemplateInfoComponent) obj;
        return Intrinsics.LJFF(this.templateId, aIGroupShotTemplateInfoComponent.templateId) && Intrinsics.LJFF(this.templateResId, aIGroupShotTemplateInfoComponent.templateResId) && this.participantCount == aIGroupShotTemplateInfoComponent.participantCount && Intrinsics.LJFF(this.templateName, aIGroupShotTemplateInfoComponent.templateName) && Intrinsics.LJFF(this.templateThumbnailUrl, aIGroupShotTemplateInfoComponent.templateThumbnailUrl);
    }

    public final int hashCode() {
        return (((((((this.templateId.hashCode() * 31) + this.templateResId.hashCode()) * 31) + this.participantCount) * 31) + this.templateName.hashCode()) * 31) + this.templateThumbnailUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotTemplateInfoComponent(templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(", templateResId=");
        sbLIZ.append(this.templateResId);
        sbLIZ.append(", participantCount=");
        sbLIZ.append(this.participantCount);
        sbLIZ.append(", templateName=");
        sbLIZ.append(this.templateName);
        sbLIZ.append(", templateThumbnailUrl=");
        sbLIZ.append(this.templateThumbnailUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateResId);
        parcel.writeInt(this.participantCount);
        parcel.writeString(this.templateName);
        parcel.writeString(this.templateThumbnailUrl);
    }

    public /* synthetic */ AIGroupShotTemplateInfoComponent(int i) {
        this("", "", 0, "", "");
    }

    public AIGroupShotTemplateInfoComponent(String str, String str2, int i, String str3, String str4) {
        this.templateId = str;
        this.templateResId = str2;
        this.participantCount = i;
        this.templateName = str3;
        this.templateThumbnailUrl = str4;
    }
}
