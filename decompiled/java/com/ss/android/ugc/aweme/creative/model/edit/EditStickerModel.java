package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes23.dex */
public final class EditStickerModel implements Parcelable {
    public static final Parcelable.Creator<EditStickerModel> CREATOR = new Parcelable.Creator<EditStickerModel>() { // from class: X.0mfy
        @Override // android.os.Parcelable.Creator
        public final EditStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            TextStickerChallenges textStickerChallengesCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            StickerChallenge stickerChallenge = (StickerChallenge) parcel.readParcelable(EditStickerModel.class.getClassLoader());
            CommentVideoModel commentVideoModel = (CommentVideoModel) parcel.readSerializable();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                textStickerChallengesCreateFromParcel = null;
            } else {
                textStickerChallengesCreateFromParcel = TextStickerChallenges.CREATOR.createFromParcel(parcel);
            }
            return new EditStickerModel(z, stickerChallenge, commentVideoModel, f, f2, string, string2, textStickerChallengesCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EditStickerModel[] newArray(int i) {
            return new EditStickerModel[i];
        }
    };

    @C040H
    public CommentVideoModel commentVideoModel;

    @C09CT("has_used_timestamp_ability")
    public boolean hasUsedTimestampAbility;

    @C040H
    public StickerChallenge stickerChallenge;

    @C040H
    public String textEffectIds;

    @C040H
    public float textLayoutHeight;

    @C040H
    public float textLayoutWidth;

    @C040H
    public TextStickerChallenges textStickerChallenges;

    @C040H
    public String textTypes;

    public EditStickerModel() {
        this(false, null, null, 0.0f, 0.0f, "", "", new TextStickerChallenges(new LinkedList()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasUsedTimestampAbility ? 1 : 0);
        parcel.writeParcelable(this.stickerChallenge, i);
        parcel.writeSerializable(this.commentVideoModel);
        parcel.writeFloat(this.textLayoutWidth);
        parcel.writeFloat(this.textLayoutHeight);
        parcel.writeString(this.textEffectIds);
        parcel.writeString(this.textTypes);
        TextStickerChallenges textStickerChallenges = this.textStickerChallenges;
        if (textStickerChallenges == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStickerChallenges.writeToParcel(parcel, i);
        }
    }

    public EditStickerModel(boolean z, StickerChallenge stickerChallenge, CommentVideoModel commentVideoModel, float f, float f2, String str, String str2, TextStickerChallenges textStickerChallenges) {
        this.hasUsedTimestampAbility = z;
        this.stickerChallenge = stickerChallenge;
        this.commentVideoModel = commentVideoModel;
        this.textLayoutWidth = f;
        this.textLayoutHeight = f2;
        this.textEffectIds = str;
        this.textTypes = str2;
        this.textStickerChallenges = textStickerChallenges;
    }
}
