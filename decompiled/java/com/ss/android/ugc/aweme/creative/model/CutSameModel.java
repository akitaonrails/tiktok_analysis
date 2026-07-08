package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CutSameModel implements Parcelable {
    public static final Parcelable.Creator<CutSameModel> CREATOR = new Parcelable.Creator<CutSameModel>() { // from class: X.0L8B
        @Override // android.os.Parcelable.Creator
        public final CutSameModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CutSameMediaItem.CREATOR.createFromParcel(parcel));
            }
            return new CutSameModel(string, arrayList, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameModel[] newArray(int i) {
            return new CutSameModel[i];
        }
    };

    @C09CT("cut_same_nle_model_cached_id")
    public long nleModelCachedId;

    @C09CT("cut_same_selected_template")
    public String selectedTemplate;

    @C09CT("cut_same_selected_template_media_item_list")
    public List<CutSameMediaItem> selectedTemplateMediaItemList;

    public CutSameModel() {
        this(null, new ArrayList(), 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.selectedTemplate);
        List<CutSameMediaItem> list = this.selectedTemplateMediaItemList;
        parcel.writeInt(list.size());
        Iterator<CutSameMediaItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.nleModelCachedId);
    }

    public CutSameModel(String str, List<CutSameMediaItem> list, long j) {
        this.selectedTemplate = str;
        this.selectedTemplateMediaItemList = list;
        this.nleModelCachedId = j;
    }
}
