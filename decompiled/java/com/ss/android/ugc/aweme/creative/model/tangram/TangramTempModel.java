package com.ss.android.ugc.aweme.creative.model.tangram;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramTempModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.aweme.creation.base.EditUIConfigModel;
import com.ss.ugc.aweme.creation.base.PublishPushConfigModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class TangramTempModel implements Parcelable {
    public static final Parcelable.Creator<TangramTempModel> CREATOR = new Parcelable.Creator<TangramTempModel>() { // from class: X.0MhL
        @Override // android.os.Parcelable.Creator
        public final TangramTempModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(TangramTempModel.class.getClassLoader()));
                }
            }
            PublishPushConfigModel publishPushConfigModel = (PublishPushConfigModel) parcel.readParcelable(TangramTempModel.class.getClassLoader());
            EditUIConfigModel editUIConfigModel = (EditUIConfigModel) parcel.readParcelable(TangramTempModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new TangramTempModel(arrayList, publishPushConfigModel, editUIConfigModel, z);
        }

        @Override // android.os.Parcelable.Creator
        public final TangramTempModel[] newArray(int i) {
            return new TangramTempModel[i];
        }
    };

    @C040H
    public boolean captionEnable;

    @C040H
    public EditUIConfigModel editUIConfigModel;

    @C040H
    public List<? extends Effect> presetEffects;

    @C040H
    public PublishPushConfigModel publishPushConfigModel;

    public TangramTempModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<? extends Effect> list = this.presetEffects;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends Effect> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeParcelable(this.publishPushConfigModel, i);
        parcel.writeParcelable(this.editUIConfigModel, i);
        parcel.writeInt(this.captionEnable ? 1 : 0);
    }

    public /* synthetic */ TangramTempModel(int i) {
        this(null, null, null, false);
    }

    public TangramTempModel(List<? extends Effect> list, PublishPushConfigModel publishPushConfigModel, EditUIConfigModel editUIConfigModel, boolean z) {
        this.presetEffects = list;
        this.publishPushConfigModel = publishPushConfigModel;
        this.editUIConfigModel = editUIConfigModel;
        this.captionEnable = z;
    }
}
