package com.ss.android.ugc.aweme.tako.otherpage.image.detail;

import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewNavParam;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import com.ss.android.ugc.aweme.tako.router.TakoRouteArg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TakoMultiImagePreviewNavParam extends TakoRouteArg {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TakoMultiImagePreviewNavParam> CREATOR = new Parcelable.Creator<TakoMultiImagePreviewNavParam>() { // from class: X.0W74
        @Override // android.os.Parcelable.Creator
        public final TakoMultiImagePreviewNavParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(TakoMultiImagePreviewNavParam.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i4 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new TakoMultiImagePreviewNavParam(arrayList, i3, string, z, arrayListCreateStringArrayList, linkedHashMap, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final TakoMultiImagePreviewNavParam[] newArray(int i) {
            return new TakoMultiImagePreviewNavParam[i];
        }
    };
    public final boolean bypassImg2Video;
    public final Map<String, String> commonParams;
    public final List<String> hashTags;
    public final boolean isAIGC;
    public final List<TakoContentPreviewItem> items;
    public final String msgId;
    public final int openIndex;
    public final boolean skipEnterAnimation;

    public TakoMultiImagePreviewNavParam() {
        this(null, 0, null, false, null, null, false, false, 255, null);
    }

    public final TakoMultiImagePreviewNavParam copy(List<? extends TakoContentPreviewItem> list, int i, String str, boolean z, List<String> list2, Map<String, String> map, boolean z2, boolean z3) {
        return new TakoMultiImagePreviewNavParam(list, i, str, z, list2, map, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoMultiImagePreviewNavParam)) {
            return false;
        }
        TakoMultiImagePreviewNavParam takoMultiImagePreviewNavParam = (TakoMultiImagePreviewNavParam) obj;
        return Intrinsics.LJFF(this.items, takoMultiImagePreviewNavParam.items) && this.openIndex == takoMultiImagePreviewNavParam.openIndex && Intrinsics.LJFF(this.msgId, takoMultiImagePreviewNavParam.msgId) && this.isAIGC == takoMultiImagePreviewNavParam.isAIGC && Intrinsics.LJFF(this.hashTags, takoMultiImagePreviewNavParam.hashTags) && Intrinsics.LJFF(this.commonParams, takoMultiImagePreviewNavParam.commonParams) && this.bypassImg2Video == takoMultiImagePreviewNavParam.bypassImg2Video && this.skipEnterAnimation == takoMultiImagePreviewNavParam.skipEnterAnimation;
    }

    @Override // com.ss.android.ugc.aweme.tako.router.TakoRouteArg
    public int getEnterAnim() {
        return R.anim.cd;
    }

    @Override // com.ss.android.ugc.aweme.tako.router.TakoRouteArg
    public int getExitAnim() {
        return R.anim.ce;
    }

    public int hashCode() {
        int iHashCode = ((this.items.hashCode() * 31) + this.openIndex) * 31;
        String str = this.msgId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isAIGC)) * 31;
        List<String> list = this.hashTags;
        return ((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.commonParams.hashCode()) * 31) + C786410Ut5.Z2(this.bypassImg2Video)) * 31) + C786410Ut5.Z2(this.skipEnterAnimation);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMultiImagePreviewNavParam(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", openIndex=");
        sbLIZ.append(this.openIndex);
        sbLIZ.append(", msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(", isAIGC=");
        sbLIZ.append(this.isAIGC);
        sbLIZ.append(", hashTags=");
        sbLIZ.append(this.hashTags);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.commonParams);
        sbLIZ.append(", bypassImg2Video=");
        sbLIZ.append(this.bypassImg2Video);
        sbLIZ.append(", skipEnterAnimation=");
        sbLIZ.append(this.skipEnterAnimation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<TakoContentPreviewItem> list = this.items;
        parcel.writeInt(list.size());
        Iterator<TakoContentPreviewItem> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeInt(this.openIndex);
        parcel.writeString(this.msgId);
        parcel.writeInt(this.isAIGC ? 1 : 0);
        parcel.writeStringList(this.hashTags);
        Map<String, String> map = this.commonParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.bypassImg2Video ? 1 : 0);
        parcel.writeInt(this.skipEnterAnimation ? 1 : 0);
    }

    public final boolean getBypassImg2Video() {
        return this.bypassImg2Video;
    }

    public final Map<String, String> getCommonParams() {
        return this.commonParams;
    }

    public final List<String> getHashTags() {
        return this.hashTags;
    }

    public final List<TakoContentPreviewItem> getItems() {
        return this.items;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final int getOpenIndex() {
        return this.openIndex;
    }

    public final boolean getSkipEnterAnimation() {
        return this.skipEnterAnimation;
    }

    public final boolean isAIGC() {
        return this.isAIGC;
    }

    public TakoMultiImagePreviewNavParam(TakoContentPreviewItem takoContentPreviewItem, String str, boolean z, List<String> list, Map<String, String> map, boolean z2, boolean z3) {
        this(Collections.singletonList(takoContentPreviewItem), 0, str, z, list, map, z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakoMultiImagePreviewNavParam(List<? extends TakoContentPreviewItem> list, int i, String str, boolean z, List<String> list2, Map<String, String> map, boolean z2, boolean z3) {
        super("//tako/detal/image_preview");
        this.items = list;
        this.openIndex = i;
        this.msgId = str;
        this.isAIGC = z;
        this.hashTags = list2;
        this.commonParams = map;
        this.bypassImg2Video = z2;
        this.skipEnterAnimation = z3;
    }

    public TakoMultiImagePreviewNavParam(List list, int i, String str, boolean z, List list2, Map map, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? list2 : null, (i2 & 32) != 0 ? C2097608Jq.LJ() : map, (i2 & 64) != 0 ? true : z2, (i2 & 128) == 0 ? z3 : false);
    }
}
