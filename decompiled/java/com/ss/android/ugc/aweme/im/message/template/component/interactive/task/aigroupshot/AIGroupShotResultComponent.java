package com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot;

import X.C13BV;
import X.C18ZU;
import X.C2188811AlT;
import X.C2241451CoB;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotResultComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotResultComponent implements BaseComponent<C2241451CoB> {
    public static final Parcelable.Creator<AIGroupShotResultComponent> CREATOR = new Parcelable.Creator<AIGroupShotResultComponent>() { // from class: X.0Zqv
        @Override // android.os.Parcelable.Creator
        public final AIGroupShotResultComponent createFromParcel(Parcel parcel) {
            ImageComponent imageComponentCreateFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AIGroupShotMentionInfoComponent.CREATOR.createFromParcel(parcel));
            }
            return new AIGroupShotResultComponent(imageComponentCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGroupShotResultComponent[] newArray(int i) {
            return new AIGroupShotResultComponent[i];
        }
    };
    public final ImageComponent image;
    public final List<AIGroupShotMentionInfoComponent> mentionInfo;

    public AIGroupShotResultComponent() {
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
        if (!(obj instanceof AIGroupShotResultComponent)) {
            return false;
        }
        AIGroupShotResultComponent aIGroupShotResultComponent = (AIGroupShotResultComponent) obj;
        return Intrinsics.LJFF(this.image, aIGroupShotResultComponent.image) && Intrinsics.LJFF(this.mentionInfo, aIGroupShotResultComponent.mentionInfo);
    }

    public final int hashCode() {
        return (this.image.hashCode() * 31) + this.mentionInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotResultComponent(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", mentionInfo=");
        sbLIZ.append(this.mentionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.image.writeToParcel(parcel, i);
        List<AIGroupShotMentionInfoComponent> list = this.mentionInfo;
        parcel.writeInt(list.size());
        Iterator<AIGroupShotMentionInfoComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AIGroupShotResultComponent(int i) {
        this(C18ZU.LIZ(), C13BV.INSTANCE);
        ImageComponent.Companion.getClass();
    }

    public AIGroupShotResultComponent(ImageComponent imageComponent, List<AIGroupShotMentionInfoComponent> list) {
        this.image = imageComponent;
        this.mentionInfo = list;
    }
}
