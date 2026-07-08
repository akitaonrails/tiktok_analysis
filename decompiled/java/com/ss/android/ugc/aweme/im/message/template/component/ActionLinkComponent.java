package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C1516540pZE;
import X.C2188811AlT;
import X.C2244301Csm;
import X.C2244311Csn;
import X.C2244321Cso;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ActionLinkComponent implements BaseComponent<C2244321Cso> {
    public final List<String> data;
    public final String displayName;
    public final ActionLinkType linkType;
    public static final C2244301Csm Companion = new C2244301Csm();
    public static final Parcelable.Creator<ActionLinkComponent> CREATOR = new Parcelable.Creator<ActionLinkComponent>() { // from class: X.1Csq
        @Override // android.os.Parcelable.Creator
        public final ActionLinkComponent createFromParcel(Parcel parcel) {
            return new ActionLinkComponent(parcel.createStringArrayList(), ActionLinkType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinkComponent[] newArray(int i) {
            return new ActionLinkComponent[i];
        }
    };
    public static final C01GW<ActionLinkComponent> INVALID_ACTION_LINK$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(68));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinkComponent)) {
            return false;
        }
        ActionLinkComponent actionLinkComponent = (ActionLinkComponent) obj;
        return Intrinsics.LJFF(this.data, actionLinkComponent.data) && this.linkType == actionLinkComponent.linkType && Intrinsics.LJFF(this.displayName, actionLinkComponent.displayName);
    }

    public final int hashCode() {
        return (((this.data.hashCode() * 31) + this.linkType.hashCode()) * 31) + this.displayName.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionLinkComponent(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", linkType=");
        sbLIZ.append(this.linkType);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.data);
        this.linkType.writeToParcel(parcel, i);
        parcel.writeString(this.displayName);
    }

    public final C2244321Cso LIZIZ() {
        C2244311Csn c2244311Csn = new C2244311Csn();
        List<String> list = this.data;
        C1516540pZE.LIZ(list);
        c2244311Csn.LIZLLL = list;
        c2244311Csn.LJ = this.linkType.toProto();
        c2244311Csn.LJFF = this.displayName;
        return c2244311Csn.build();
    }

    public /* synthetic */ ActionLinkComponent(List list, ActionLinkType actionLinkType) {
        this(list, actionLinkType, "");
    }

    public static ActionLinkComponent LIZ(ActionLinkComponent actionLinkComponent, ActionLinkType actionLinkType) {
        List<String> list = actionLinkComponent.data;
        String str = actionLinkComponent.displayName;
        actionLinkComponent.getClass();
        return new ActionLinkComponent(list, actionLinkType, str);
    }

    public ActionLinkComponent(List<String> list, ActionLinkType actionLinkType, String str) {
        this.data = list;
        this.linkType = actionLinkType;
        this.displayName = str;
    }
}
