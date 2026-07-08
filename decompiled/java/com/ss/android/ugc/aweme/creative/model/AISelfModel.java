package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C566080MIc;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.ModelPictureUploadedResultWrapper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class AISelfModel implements Parcelable {
    public static final Parcelable.Creator<AISelfModel> CREATOR = new Parcelable.Creator<AISelfModel>() { // from class: X.0MIE
        @Override // android.os.Parcelable.Creator
        public final AISelfModel createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            Integer numValueOf2;
            boolean z2;
            ModelPictureUploadedResultWrapper modelPictureUploadedResultWrapperCreateFromParcel;
            boolean z3;
            boolean z4;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                modelPictureUploadedResultWrapperCreateFromParcel = null;
            } else {
                modelPictureUploadedResultWrapperCreateFromParcel = ModelPictureUploadedResultWrapper.CREATOR.createFromParcel(parcel);
            }
            ModelPictureUploadedResultWrapper modelPictureUploadedResultWrapper = modelPictureUploadedResultWrapperCreateFromParcel;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            int i2 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i3 = parcel.readInt();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new AISelfModel(z, i, numValueOf, numValueOf2, string, z2, modelPictureUploadedResultWrapper, string2, string3, string4, string5, string6, boolValueOf, i2, string7, string8, string9, arrayListCreateStringArrayList, i3, string10, string11, string12, string13, arrayListCreateStringArrayList2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final AISelfModel[] newArray(int i) {
            return new AISelfModel[i];
        }
    };

    @C040H
    public int aiSelfAIGCLabelType;

    @C09CT("ai_self_is_from_album_ai_tab")
    public int aiSelfIsFromAlbumAiTab;

    @C09CT("ai_self_entrance")
    public String aimeEntrance;

    @C09CT("ai_self_anchor_icon_uri")
    public String anchorIconUri;

    @C040H
    public String challengeId;

    @C09CT("ai_self_is_child_style")
    public Boolean isChildStyle;

    @C09CT("ai_self_is_main_cover")
    public int isFromMainCover;

    @C09CT("effect_apply_logic")
    public boolean isTemplateStyle;

    @C09CT("ai_self_is_ultra_fast_model_creation")
    public boolean isUltraFastModelCreation;

    @C09CT("ai_self_is_ultra_fast_style_generation")
    public boolean isUltraFastStyleGeneration;

    @C09CT("ai_self_model_picture_uploaded_result")
    public ModelPictureUploadedResultWrapper modelPictureUploadedResultWrapper;

    @C040H
    public String musicId;

    @C09CT("ai_self_edit_effect_id")
    public List<String> originalEditEffectIds;

    @C040H
    public Integer quota;

    @C040H
    public Integer quotaRemain;

    @C09CT("ai_self_style_customized_prompt_text")
    public String styleCustomizedPromptText;

    @C09CT("ai_self_style_icon_uri")
    @C0MY0
    public String styleIconUri;

    @C09CT("ai_self_style_id")
    public String styleId;

    @C09CT("ai_self_style_name")
    public String styleName;

    @C09CT("ai_self_style_parent_id")
    public String styleParentId;

    @C09CT("ai_self_style_resource_id")
    public String styleResourceId;

    @C09CT("ai_self_style_selected_from")
    public String styleSelectedFrom;

    @C09CT("ai_self_style_video_result_image")
    @C0MY0
    public String styleVideoResultImage;

    @C09CT("ai_self_task_id")
    public String taskId;

    @C09CT("ai_self_template_ids")
    public List<String> templateIds;

    public AISelfModel() {
        this(false, 0, null, null, null, false, null, null, null, null, null, null, null, 2, null, null, null, null, 0, null, null, null, null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isUltraFastStyleGeneration ? 1 : 0);
        parcel.writeInt(this.aiSelfIsFromAlbumAiTab);
        Integer num = this.quota;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.quotaRemain;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.styleVideoResultImage);
        parcel.writeInt(this.isUltraFastModelCreation ? 1 : 0);
        ModelPictureUploadedResultWrapper modelPictureUploadedResultWrapper = this.modelPictureUploadedResultWrapper;
        if (modelPictureUploadedResultWrapper == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            modelPictureUploadedResultWrapper.writeToParcel(parcel, i);
        }
        parcel.writeString(this.styleId);
        parcel.writeString(this.styleParentId);
        parcel.writeString(this.styleName);
        parcel.writeString(this.styleIconUri);
        parcel.writeString(this.styleCustomizedPromptText);
        Boolean bool = this.isChildStyle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.aiSelfAIGCLabelType);
        parcel.writeString(this.anchorIconUri);
        parcel.writeString(this.taskId);
        parcel.writeString(this.styleResourceId);
        parcel.writeStringList(this.originalEditEffectIds);
        parcel.writeInt(this.isFromMainCover);
        parcel.writeString(this.styleSelectedFrom);
        parcel.writeString(this.musicId);
        parcel.writeString(this.challengeId);
        parcel.writeString(this.aimeEntrance);
        parcel.writeStringList(this.templateIds);
        parcel.writeInt(this.isTemplateStyle ? 1 : 0);
    }

    public final String LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!C566080MIc.LIZ()) {
                jSONObject.put("style_id", this.styleId);
                jSONObject.put("root_style_id", this.styleParentId);
                jSONObject.put("root_resource_id", this.styleResourceId);
                jSONObject.put("is_new_style", this.isChildStyle);
            }
            jSONObject.put("task_id", this.taskId);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public AISelfModel(boolean z, int i, Integer num, Integer num2, String str, boolean z2, ModelPictureUploadedResultWrapper modelPictureUploadedResultWrapper, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i2, String str7, String str8, String str9, List<String> list, int i3, String str10, String str11, String str12, String str13, List<String> list2, boolean z3) {
        this.isUltraFastStyleGeneration = z;
        this.aiSelfIsFromAlbumAiTab = i;
        this.quota = num;
        this.quotaRemain = num2;
        this.styleVideoResultImage = str;
        this.isUltraFastModelCreation = z2;
        this.modelPictureUploadedResultWrapper = modelPictureUploadedResultWrapper;
        this.styleId = str2;
        this.styleParentId = str3;
        this.styleName = str4;
        this.styleIconUri = str5;
        this.styleCustomizedPromptText = str6;
        this.isChildStyle = bool;
        this.aiSelfAIGCLabelType = i2;
        this.anchorIconUri = str7;
        this.taskId = str8;
        this.styleResourceId = str9;
        this.originalEditEffectIds = list;
        this.isFromMainCover = i3;
        this.styleSelectedFrom = str10;
        this.musicId = str11;
        this.challengeId = str12;
        this.aimeEntrance = str13;
        this.templateIds = list2;
        this.isTemplateStyle = z3;
    }
}
