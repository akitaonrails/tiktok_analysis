package com.ss.android.ugc.aweme.creative.tangram.dsl.basic;

import X.EnumC574990Mgr;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCWorkflowModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class BasicModelCompat extends BasicModel {
    public static final Parcelable.Creator<BasicModelCompat> CREATOR = new Parcelable.Creator<BasicModelCompat>() { // from class: X.0Mgp
        @Override // android.os.Parcelable.Creator
        public final BasicModelCompat createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new BasicModelCompat();
        }

        @Override // android.os.Parcelable.Creator
        public final BasicModelCompat[] newArray(int i) {
            return new BasicModelCompat[i];
        }
    };
    public transient AIPortraitModel aiPortraitModel;
    public transient AIGCWorkflowModel aigcWorkflowModel;
    public transient DraftInfoModel draftInfoModel;

    public BasicModelCompat() {
        super(EnumC574990Mgr.ComposeType_Default, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, null, null, new ArrayList(), null, new LinkedHashMap(), new LinkedHashMap(), new ArrayList(), null);
    }

    @Override // com.ss.ugc.aweme.creation.base.BasicModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final AIPortraitModel getAiPortraitModel() {
        return this.aiPortraitModel;
    }

    public final AIGCWorkflowModel getAigcWorkflowModel() {
        return this.aigcWorkflowModel;
    }

    public final DraftInfoModel getDraftInfoModel() {
        return this.draftInfoModel;
    }

    public final void setAiPortraitModel(AIPortraitModel aIPortraitModel) {
        this.aiPortraitModel = aIPortraitModel;
    }

    public final void setAigcWorkflowModel(AIGCWorkflowModel aIGCWorkflowModel) {
        this.aigcWorkflowModel = aIGCWorkflowModel;
    }

    public final void setDraftInfoModel(DraftInfoModel draftInfoModel) {
        this.draftInfoModel = draftInfoModel;
    }
}
