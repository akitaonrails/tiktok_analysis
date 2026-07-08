package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AICreateModel;

/* JADX INFO: loaded from: classes23.dex */
public final class AICreateModel implements Parcelable {
    public static final Parcelable.Creator<AICreateModel> CREATOR = new Parcelable.Creator<AICreateModel>() { // from class: X.0nWY
        @Override // android.os.Parcelable.Creator
        public final AICreateModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AICreateModel(z, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AICreateModel[] newArray(int i) {
            return new AICreateModel[i];
        }
    };

    @C09CT("generate_cnt")
    public final int generatedCnt;

    @C09CT("input_prompt")
    public final String inputPrompt;

    @C09CT("is_text_2_image_mode")
    public final boolean isText2ImageMode;

    @C09CT("same_prompt_re_generate_cnt")
    public final int samePromptReGenerateCount;

    @C09CT("selected_img")
    public final String selectedImage;

    @C09CT("selected_img_pos")
    public final int selectedImagePos;

    @C09CT("selected_topic_name")
    public final String selectedTopicText;

    @C09CT("selected_topic_type")
    public final int selectedTopicType;

    public AICreateModel() {
        this(true, 0, "", 1, 0, "", null, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isText2ImageMode ? 1 : 0);
        parcel.writeInt(this.selectedImagePos);
        parcel.writeString(this.selectedImage);
        parcel.writeInt(this.generatedCnt);
        parcel.writeInt(this.samePromptReGenerateCount);
        parcel.writeString(this.inputPrompt);
        parcel.writeString(this.selectedTopicText);
        parcel.writeInt(this.selectedTopicType);
    }

    public AICreateModel(boolean z, int i, String str, int i2, int i3, String str2, String str3, int i4) {
        this.isText2ImageMode = z;
        this.selectedImagePos = i;
        this.selectedImage = str;
        this.generatedCnt = i2;
        this.samePromptReGenerateCount = i3;
        this.inputPrompt = str2;
        this.selectedTopicText = str3;
        this.selectedTopicType = i4;
    }
}
