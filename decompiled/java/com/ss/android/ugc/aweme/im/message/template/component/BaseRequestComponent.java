package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C1516540pZE;
import X.C18Y8;
import X.C1CH0;
import X.C1CH1;
import X.C1CH3;
import X.C2188811AlT;
import X.C2227701CGy;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseRequestComponent implements BaseComponent<C1CH0> {
    public final QueryDataComponent queryData;
    public static final C18Y8 Companion = new C18Y8();
    public static final Parcelable.Creator<BaseRequestComponent> CREATOR = new Parcelable.Creator<BaseRequestComponent>() { // from class: X.0m1Q
        @Override // android.os.Parcelable.Creator
        public final BaseRequestComponent createFromParcel(Parcel parcel) {
            return new BaseRequestComponent(QueryDataComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseRequestComponent[] newArray(int i) {
            return new BaseRequestComponent[i];
        }
    };
    public static final C01GW<BaseRequestComponent> EMPTY_BASE_REQUEST$delegate = C452501pT.LIZIZ(new C1CH3());

    public BaseRequestComponent() {
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
        return (obj instanceof BaseRequestComponent) && Intrinsics.LJFF(this.queryData, ((BaseRequestComponent) obj).queryData);
    }

    public final int hashCode() {
        return this.queryData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseRequestComponent(queryData=");
        sbLIZ.append(this.queryData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.queryData.writeToParcel(parcel, i);
    }

    public final C1CH0 LIZ() {
        C1CH1 c1ch1 = new C1CH1();
        QueryDataComponent queryDataComponent = this.queryData;
        queryDataComponent.getClass();
        C2227701CGy c2227701CGy = new C2227701CGy();
        c2227701CGy.LIZLLL = queryDataComponent.resourceID;
        Map<String, String> map = queryDataComponent.extras;
        C1516540pZE.LIZIZ(map);
        c2227701CGy.LJ = map;
        c1ch1.LIZLLL = c2227701CGy.build();
        return c1ch1.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ BaseRequestComponent(int i) {
        this(new QueryDataComponent(null, 0 == true ? 1 : 0, 3));
    }

    public BaseRequestComponent(QueryDataComponent queryDataComponent) {
        this.queryData = queryDataComponent;
    }
}
