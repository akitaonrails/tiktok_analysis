package com.ss.ugc.aweme;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.CreationConfigModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.PublishConfigModel;
import com.ss.ugc.aweme.creation.base.RecordConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class CreationConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreationConfigModel> CREATOR = new Parcelable.Creator<CreationConfigModel>() { // from class: X.0MSw
        @Override // android.os.Parcelable.Creator
        public final CreationConfigModel createFromParcel(Parcel parcel) {
            return new CreationConfigModel(parcel.readString(), (BasicModel) parcel.readParcelable(CreationConfigModel.class.getClassLoader()), (PublishConfigModel) parcel.readParcelable(CreationConfigModel.class.getClassLoader()), (RecordConfigModel) parcel.readParcelable(CreationConfigModel.class.getClassLoader()), (EditConfigModel) parcel.readParcelable(CreationConfigModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreationConfigModel[] newArray(int i) {
            return new CreationConfigModel[i];
        }
    };

    @C09CT("basic")
    public BasicModel basic;

    @C09CT("edit")
    public EditConfigModel edit;

    @C09CT("page_stack")
    public String pageStack;

    @C09CT("publish")
    public PublishConfigModel publish;

    @C09CT("record")
    public RecordConfigModel record;

    public CreationConfigModel() {
        this("", null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pageStack);
        parcel.writeParcelable(this.basic, i);
        parcel.writeParcelable(this.publish, i);
        parcel.writeParcelable(this.record, i);
        parcel.writeParcelable(this.edit, i);
    }

    public final BasicModel getBasic() {
        return this.basic;
    }

    public final EditConfigModel getEdit() {
        return this.edit;
    }

    public final String getPageStack() {
        return this.pageStack;
    }

    public final PublishConfigModel getPublish() {
        return this.publish;
    }

    public final RecordConfigModel getRecord() {
        return this.record;
    }

    public final void setBasic(BasicModel basicModel) {
        this.basic = basicModel;
    }

    public final void setEdit(EditConfigModel editConfigModel) {
        this.edit = editConfigModel;
    }

    public final void setPageStack(String str) {
        this.pageStack = str;
    }

    public final void setPublish(PublishConfigModel publishConfigModel) {
        this.publish = publishConfigModel;
    }

    public final void setRecord(RecordConfigModel recordConfigModel) {
        this.record = recordConfigModel;
    }

    public CreationConfigModel(String str, BasicModel basicModel, PublishConfigModel publishConfigModel, RecordConfigModel recordConfigModel, EditConfigModel editConfigModel) {
        this.pageStack = str;
        this.basic = basicModel;
        this.publish = publishConfigModel;
        this.record = recordConfigModel;
        this.edit = editConfigModel;
    }
}
