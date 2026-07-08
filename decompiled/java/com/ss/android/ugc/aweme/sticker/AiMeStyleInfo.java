package com.ss.android.ugc.aweme.sticker;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class AiMeStyleInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<AiMeStyleInfo> CREATOR = new Parcelable.Creator<AiMeStyleInfo>() { // from class: X.0mcu
        @Override // android.os.Parcelable.Creator
        public final AiMeStyleInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AiMeStyleInfo(string, string2, string3, string4, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AiMeStyleInfo[] newArray(int i) {
            return new AiMeStyleInfo[i];
        }
    };

    @C09CT("anchorIconUri")
    public final String anchorIconUri;

    @C09CT("currentStyleId")
    public final String currentStyleId;

    @C09CT("editEffectIds")
    public final List<String> editEffectIds;

    @C09CT("effectStyleCategory")
    public final String effectStyleSelectedFrom;

    @C09CT("isChildStyle")
    public final boolean isChildStyle;

    @C09CT("publishStyleId")
    public final String publishStyleId;

    @C09CT("resourceId")
    public final String resourceId;

    @C09CT("rootStyleId")
    public final String rootStyleId;

    @C09CT("styleCustomizedPromptText")
    public final String styleCustomizedPromptText;

    @C09CT("styleIconUri")
    public final String styleIconUri;

    @C09CT("styleName")
    public final String styleName;

    @C09CT("taskId")
    public final String taskId;

    public AiMeStyleInfo() {
        this(null, null, null, null, false, null, null, null, null, null, null, null);
    }

    public final AiMeStyleInfo copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list) {
        return new AiMeStyleInfo(str, str2, str3, str4, z, str5, str6, str7, str8, str9, str10, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiMeStyleInfo)) {
            return false;
        }
        AiMeStyleInfo aiMeStyleInfo = (AiMeStyleInfo) obj;
        return Intrinsics.LJFF(this.publishStyleId, aiMeStyleInfo.publishStyleId) && Intrinsics.LJFF(this.styleName, aiMeStyleInfo.styleName) && Intrinsics.LJFF(this.styleIconUri, aiMeStyleInfo.styleIconUri) && Intrinsics.LJFF(this.styleCustomizedPromptText, aiMeStyleInfo.styleCustomizedPromptText) && this.isChildStyle == aiMeStyleInfo.isChildStyle && Intrinsics.LJFF(this.anchorIconUri, aiMeStyleInfo.anchorIconUri) && Intrinsics.LJFF(this.rootStyleId, aiMeStyleInfo.rootStyleId) && Intrinsics.LJFF(this.taskId, aiMeStyleInfo.taskId) && Intrinsics.LJFF(this.resourceId, aiMeStyleInfo.resourceId) && Intrinsics.LJFF(this.effectStyleSelectedFrom, aiMeStyleInfo.effectStyleSelectedFrom) && Intrinsics.LJFF(this.currentStyleId, aiMeStyleInfo.currentStyleId) && Intrinsics.LJFF(this.editEffectIds, aiMeStyleInfo.editEffectIds);
    }

    public int hashCode() {
        String str = this.publishStyleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.styleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.styleIconUri;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.styleCustomizedPromptText;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.isChildStyle)) * 31;
        String str5 = this.anchorIconUri;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rootStyleId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.taskId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.resourceId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.effectStyleSelectedFrom;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currentStyleId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.editEffectIds;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "AiMeStyleInfo(publishStyleId=" + this.publishStyleId + ", styleName=" + this.styleName + ", styleIconUri=" + this.styleIconUri + ", styleCustomizedPromptText=" + this.styleCustomizedPromptText + ", isChildStyle=" + this.isChildStyle + ", anchorIconUri=" + this.anchorIconUri + ", rootStyleId=" + this.rootStyleId + ", taskId=" + this.taskId + ", resourceId=" + this.resourceId + ", effectStyleSelectedFrom=" + this.effectStyleSelectedFrom + ", currentStyleId=" + this.currentStyleId + ", editEffectIds=" + this.editEffectIds + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.publishStyleId);
        parcel.writeString(this.styleName);
        parcel.writeString(this.styleIconUri);
        parcel.writeString(this.styleCustomizedPromptText);
        parcel.writeInt(this.isChildStyle ? 1 : 0);
        parcel.writeString(this.anchorIconUri);
        parcel.writeString(this.rootStyleId);
        parcel.writeString(this.taskId);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.effectStyleSelectedFrom);
        parcel.writeString(this.currentStyleId);
        parcel.writeStringList(this.editEffectIds);
    }

    public final String getAiMeAwemeData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("style_id", this.publishStyleId);
            jSONObject.put("root_style_id", this.rootStyleId);
            jSONObject.put("root_resource_id", this.resourceId);
            jSONObject.put("task_id", this.taskId);
            jSONObject.put("is_new_style", this.isChildStyle);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String getAiMeAwemeDataForEffectAnchor() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("task_id", this.taskId);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String getAnchorIconUri() {
        return this.anchorIconUri;
    }

    public final String getCurrentStyleId() {
        return this.currentStyleId;
    }

    public final List<String> getEditEffectIds() {
        return this.editEffectIds;
    }

    public final String getEffectStyleSelectedFrom() {
        return this.effectStyleSelectedFrom;
    }

    public final String getPublishStyleId() {
        return this.publishStyleId;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final String getRootStyleId() {
        return this.rootStyleId;
    }

    public final String getStyleCustomizedPromptText() {
        return this.styleCustomizedPromptText;
    }

    public final String getStyleIconUri() {
        return this.styleIconUri;
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final boolean isChildStyle() {
        return this.isChildStyle;
    }

    public AiMeStyleInfo(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list) {
        this.publishStyleId = str;
        this.styleName = str2;
        this.styleIconUri = str3;
        this.styleCustomizedPromptText = str4;
        this.isChildStyle = z;
        this.anchorIconUri = str5;
        this.rootStyleId = str6;
        this.taskId = str7;
        this.resourceId = str8;
        this.effectStyleSelectedFrom = str9;
        this.currentStyleId = str10;
        this.editEffectIds = list;
    }
}
