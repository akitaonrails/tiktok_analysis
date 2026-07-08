package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EffectDataTransport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectDataTransport implements Parcelable {
    public static final Parcelable.Creator<EffectDataTransport> CREATOR = new Parcelable.Creator<EffectDataTransport>() { // from class: X.0Mnf
        @Override // android.os.Parcelable.Creator
        public final EffectDataTransport createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(Boolean.valueOf(z));
                }
            }
            return new EffectDataTransport(string, arrayListCreateStringArrayList, arrayList, arrayListCreateStringArrayList2, arrayList2, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectDataTransport[] newArray(int i) {
            return new EffectDataTransport[i];
        }
    };

    @C09CT("effect_publish_time")
    public List<Long> effectPublishTimes;

    @C09CT("is_child_effect")
    public List<Boolean> isChildEffect;

    @C09CT("met_parent_resource_ids")
    public List<String> metParentResourceIds;

    @C09CT("resourceId")
    public List<String> resourceId;

    @C09CT("resource_id")
    public String resourceIds;

    @C09CT("tab_Key")
    public List<String> tabKey;

    public EffectDataTransport() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resourceIds);
        parcel.writeStringList(this.metParentResourceIds);
        List<Long> list = this.effectPublishTimes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }
        parcel.writeStringList(this.tabKey);
        List<Boolean> list2 = this.isChildEffect;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Boolean> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeInt(it3.next().booleanValue() ? 1 : 0);
            }
        }
        parcel.writeStringList(this.resourceId);
    }

    public EffectDataTransport(String str, List<String> list, List<Long> list2, List<String> list3, List<Boolean> list4, List<String> list5) {
        this.resourceIds = str;
        this.metParentResourceIds = list;
        this.effectPublishTimes = list2;
        this.tabKey = list3;
        this.isChildEffect = list4;
        this.resourceId = list5;
    }
}
