package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class CaptionModel implements Parcelable {
    public static final Parcelable.Creator<CaptionModel> CREATOR = new Parcelable.Creator<CaptionModel>() { // from class: X.0mt4
        @Override // android.os.Parcelable.Creator
        public final CaptionModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AVTextExtraStruct.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new CaptionModel(string, arrayList, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionModel[] newArray(int i) {
            return new CaptionModel[i];
        }
    };

    @C09CT("chain")
    public String chain;

    @C09CT("disable_delete_chain")
    public boolean disableDeleteChain;

    @C09CT("markup_extra")
    public List<AVTextExtraStruct> markupExtra;

    @C09CT("markup_text")
    public String markupText;

    public CaptionModel() {
        this(null, null, null, false, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.markupText);
        List<AVTextExtraStruct> list = this.markupExtra;
        parcel.writeInt(list.size());
        Iterator<AVTextExtraStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.chain);
        parcel.writeInt(this.disableDeleteChain ? 1 : 0);
    }

    public CaptionModel(String str, List<AVTextExtraStruct> list, String str2, boolean z) {
        this.markupText = str;
        this.markupExtra = list;
        this.chain = str2;
        this.disableDeleteChain = z;
    }

    public CaptionModel(String str, List list, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
    }
}
