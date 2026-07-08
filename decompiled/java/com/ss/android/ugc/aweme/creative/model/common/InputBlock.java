package com.ss.android.ugc.aweme.creative.model.common;

import X.C09CT;
import X.C2188811AlT;
import X.C547680Ldu;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.InputImage;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.common.MentionVideoItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class InputBlock implements Parcelable {

    @C09CT("content")
    public final String content;

    @C09CT("input_image")
    public final InputImage inputImage;

    @C09CT("is_auto_fill_prompt")
    public final boolean isAutoFillPrompt;

    @C09CT("mention_video")
    public final MentionVideoItem mentionVideo;

    @C09CT("type")
    public final String type;

    @C09CT("user_item")
    public final MentionDataItem userItem;
    public static final C547680Ldu Companion = new C547680Ldu();
    public static final Parcelable.Creator<InputBlock> CREATOR = new Parcelable.Creator<InputBlock>() { // from class: X.0Ldw
        @Override // android.os.Parcelable.Creator
        public final InputBlock createFromParcel(Parcel parcel) {
            MentionDataItem mentionDataItemCreateFromParcel;
            InputImage inputImageCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            MentionVideoItem mentionVideoItemCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                mentionDataItemCreateFromParcel = null;
            } else {
                mentionDataItemCreateFromParcel = MentionDataItem.CREATOR.createFromParcel(parcel);
            }
            MentionDataItem mentionDataItem = mentionDataItemCreateFromParcel;
            if (parcel.readInt() == 0) {
                inputImageCreateFromParcel = null;
            } else {
                inputImageCreateFromParcel = InputImage.CREATOR.createFromParcel(parcel);
            }
            InputImage inputImage = inputImageCreateFromParcel;
            if (parcel.readInt() != 0) {
                mentionVideoItemCreateFromParcel = MentionVideoItem.CREATOR.createFromParcel(parcel);
            }
            MentionVideoItem mentionVideoItem = mentionVideoItemCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new InputBlock(string, string2, mentionDataItem, inputImage, mentionVideoItem, z);
        }

        @Override // android.os.Parcelable.Creator
        public final InputBlock[] newArray(int i) {
            return new InputBlock[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputBlock)) {
            return false;
        }
        InputBlock inputBlock = (InputBlock) obj;
        return Intrinsics.LJFF(this.type, inputBlock.type) && Intrinsics.LJFF(this.content, inputBlock.content) && Intrinsics.LJFF(this.userItem, inputBlock.userItem) && Intrinsics.LJFF(this.inputImage, inputBlock.inputImage) && Intrinsics.LJFF(this.mentionVideo, inputBlock.mentionVideo) && this.isAutoFillPrompt == inputBlock.isAutoFillPrompt;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MentionDataItem mentionDataItem = this.userItem;
        int iHashCode3 = (iHashCode2 + (mentionDataItem == null ? 0 : mentionDataItem.hashCode())) * 31;
        InputImage inputImage = this.inputImage;
        int iHashCode4 = (iHashCode3 + (inputImage == null ? 0 : inputImage.hashCode())) * 31;
        MentionVideoItem mentionVideoItem = this.mentionVideo;
        return ((iHashCode4 + (mentionVideoItem != null ? mentionVideoItem.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isAutoFillPrompt);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputBlock(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", userItem=");
        sbLIZ.append(this.userItem);
        sbLIZ.append(", inputImage=");
        sbLIZ.append(this.inputImage);
        sbLIZ.append(", mentionVideo=");
        sbLIZ.append(this.mentionVideo);
        sbLIZ.append(", isAutoFillPrompt=");
        sbLIZ.append(this.isAutoFillPrompt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.content);
        MentionDataItem mentionDataItem = this.userItem;
        if (mentionDataItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mentionDataItem.writeToParcel(parcel, i);
        }
        InputImage inputImage = this.inputImage;
        if (inputImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputImage.writeToParcel(parcel, i);
        }
        MentionVideoItem mentionVideoItem = this.mentionVideo;
        if (mentionVideoItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mentionVideoItem.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAutoFillPrompt ? 1 : 0);
    }

    public static InputBlock LIZ(InputBlock inputBlock) {
        String str = inputBlock.type;
        String str2 = inputBlock.content;
        MentionDataItem mentionDataItem = inputBlock.userItem;
        InputImage inputImage = inputBlock.inputImage;
        MentionVideoItem mentionVideoItem = inputBlock.mentionVideo;
        inputBlock.getClass();
        return new InputBlock(str, str2, mentionDataItem, inputImage, mentionVideoItem, true);
    }

    public InputBlock(String str, String str2, MentionDataItem mentionDataItem, InputImage inputImage, MentionVideoItem mentionVideoItem, boolean z) {
        this.type = str;
        this.content = str2;
        this.userItem = mentionDataItem;
        this.inputImage = inputImage;
        this.mentionVideo = mentionVideoItem;
        this.isAutoFillPrompt = z;
    }
}
