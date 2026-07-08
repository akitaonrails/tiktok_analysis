package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundSchemaModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AiPlaygroundCameraModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AiPlaygroundCameraModel implements Parcelable {
    public static final Parcelable.Creator<AiPlaygroundCameraModel> CREATOR = new Parcelable.Creator<AiPlaygroundCameraModel>() { // from class: X.0Eor
        @Override // android.os.Parcelable.Creator
        public final AiPlaygroundCameraModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
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
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            AIPlaygroundSchemaModel aIPlaygroundSchemaModelCreateFromParcel = AIPlaygroundSchemaModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new AiPlaygroundCameraModel(string, string2, z, z2, z3, z4, z5, z6, z7, aIPlaygroundSchemaModelCreateFromParcel, z8);
        }

        @Override // android.os.Parcelable.Creator
        public final AiPlaygroundCameraModel[] newArray(int i) {
            return new AiPlaygroundCameraModel[i];
        }
    };

    @C09CT("ai_playground_schema_model")
    public AIPlaygroundSchemaModel aiPlaygroundSchemaModel;

    @C040H
    public transient boolean anchorRemoved;

    @C040H
    public boolean autoSelectAiCreateVideoClip;

    @C09CT("click_from")
    public String clickFrom;

    @C09CT("from_ai_playground")
    public boolean fromAiPlayground;

    @C09CT("from_anchor")
    public boolean fromAiPlaygroundAnchor;

    @C09CT("is_editor_pro")
    public boolean isEditorPro;

    @C040H
    public boolean loadingPageToEditPage;

    @C040H
    public boolean needAddRecommendMusic;

    @C09CT("shoot_way")
    public String shootWay;

    @C040H
    public boolean showEditVideoClipGuide;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiPlaygroundCameraModel)) {
            return false;
        }
        AiPlaygroundCameraModel aiPlaygroundCameraModel = (AiPlaygroundCameraModel) obj;
        return Intrinsics.LJFF(this.clickFrom, aiPlaygroundCameraModel.clickFrom) && Intrinsics.LJFF(this.shootWay, aiPlaygroundCameraModel.shootWay) && this.fromAiPlayground == aiPlaygroundCameraModel.fromAiPlayground && this.isEditorPro == aiPlaygroundCameraModel.isEditorPro && this.fromAiPlaygroundAnchor == aiPlaygroundCameraModel.fromAiPlaygroundAnchor && this.loadingPageToEditPage == aiPlaygroundCameraModel.loadingPageToEditPage && this.autoSelectAiCreateVideoClip == aiPlaygroundCameraModel.autoSelectAiCreateVideoClip && this.showEditVideoClipGuide == aiPlaygroundCameraModel.showEditVideoClipGuide && this.needAddRecommendMusic == aiPlaygroundCameraModel.needAddRecommendMusic && Intrinsics.LJFF(this.aiPlaygroundSchemaModel, aiPlaygroundCameraModel.aiPlaygroundSchemaModel) && this.anchorRemoved == aiPlaygroundCameraModel.anchorRemoved;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.clickFrom.hashCode() * 31) + this.shootWay.hashCode()) * 31) + C786410Ut5.Z2(this.fromAiPlayground)) * 31) + C786410Ut5.Z2(this.isEditorPro)) * 31) + C786410Ut5.Z2(this.fromAiPlaygroundAnchor)) * 31) + C786410Ut5.Z2(this.loadingPageToEditPage)) * 31) + C786410Ut5.Z2(this.autoSelectAiCreateVideoClip)) * 31) + C786410Ut5.Z2(this.showEditVideoClipGuide)) * 31) + C786410Ut5.Z2(this.needAddRecommendMusic)) * 31) + this.aiPlaygroundSchemaModel.hashCode()) * 31) + C786410Ut5.Z2(this.anchorRemoved);
    }

    public final String toString() {
        return "AiPlaygroundCameraModel(clickFrom=" + this.clickFrom + ", shootWay=" + this.shootWay + ", fromAiPlayground=" + this.fromAiPlayground + ", isEditorPro=" + this.isEditorPro + ", fromAiPlaygroundAnchor=" + this.fromAiPlaygroundAnchor + ", loadingPageToEditPage=" + this.loadingPageToEditPage + ", autoSelectAiCreateVideoClip=" + this.autoSelectAiCreateVideoClip + ", showEditVideoClipGuide=" + this.showEditVideoClipGuide + ", needAddRecommendMusic=" + this.needAddRecommendMusic + ", aiPlaygroundSchemaModel=" + this.aiPlaygroundSchemaModel + ", anchorRemoved=" + this.anchorRemoved + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clickFrom);
        parcel.writeString(this.shootWay);
        parcel.writeInt(this.fromAiPlayground ? 1 : 0);
        parcel.writeInt(this.isEditorPro ? 1 : 0);
        parcel.writeInt(this.fromAiPlaygroundAnchor ? 1 : 0);
        parcel.writeInt(this.loadingPageToEditPage ? 1 : 0);
        parcel.writeInt(this.autoSelectAiCreateVideoClip ? 1 : 0);
        parcel.writeInt(this.showEditVideoClipGuide ? 1 : 0);
        parcel.writeInt(this.needAddRecommendMusic ? 1 : 0);
        this.aiPlaygroundSchemaModel.writeToParcel(parcel, i);
        parcel.writeInt(this.anchorRemoved ? 1 : 0);
    }

    public AiPlaygroundCameraModel() {
        this("", "", false, false, false, false, false, false, false, new AIPlaygroundSchemaModel(0, 0, ""), false);
    }

    public AiPlaygroundCameraModel(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, AIPlaygroundSchemaModel aIPlaygroundSchemaModel, boolean z8) {
        this.clickFrom = str;
        this.shootWay = str2;
        this.fromAiPlayground = z;
        this.isEditorPro = z2;
        this.fromAiPlaygroundAnchor = z3;
        this.loadingPageToEditPage = z4;
        this.autoSelectAiCreateVideoClip = z5;
        this.showEditVideoClipGuide = z6;
        this.needAddRecommendMusic = z7;
        this.aiPlaygroundSchemaModel = aIPlaygroundSchemaModel;
        this.anchorRemoved = z8;
    }
}
