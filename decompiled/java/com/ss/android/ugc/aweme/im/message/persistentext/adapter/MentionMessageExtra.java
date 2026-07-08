package com.ss.android.ugc.aweme.im.message.persistentext.adapter;

import X.C0Z4C;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.MentionMessageExtra;

/* JADX INFO: loaded from: classes15.dex */
public final class MentionMessageExtra implements Parcelable {
    public final boolean hasCaptionMode;
    public final boolean hasPostPage;
    public final boolean hasStickerMode;
    public final boolean hasStoryMentionAfterPublishFeedBottom;
    public final boolean hasStoryMentionAfterPublishSharePanel;
    public final boolean hasTextMode;
    public static final C0Z4C Companion = new Object() { // from class: X.0Z4C
    };
    public static final Parcelable.Creator<MentionMessageExtra> CREATOR = new Parcelable.Creator<MentionMessageExtra>() { // from class: X.0Z4B
        @Override // android.os.Parcelable.Creator
        public final MentionMessageExtra createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
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
            return new MentionMessageExtra(z, z2, z3, z4, z5, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final MentionMessageExtra[] newArray(int i) {
            return new MentionMessageExtra[i];
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
        if (!(obj instanceof MentionMessageExtra)) {
            return false;
        }
        MentionMessageExtra mentionMessageExtra = (MentionMessageExtra) obj;
        return this.hasCaptionMode == mentionMessageExtra.hasCaptionMode && this.hasTextMode == mentionMessageExtra.hasTextMode && this.hasStickerMode == mentionMessageExtra.hasStickerMode && this.hasPostPage == mentionMessageExtra.hasPostPage && this.hasStoryMentionAfterPublishSharePanel == mentionMessageExtra.hasStoryMentionAfterPublishSharePanel && this.hasStoryMentionAfterPublishFeedBottom == mentionMessageExtra.hasStoryMentionAfterPublishFeedBottom;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.hasCaptionMode) * 31) + C786410Ut5.Z2(this.hasTextMode)) * 31) + C786410Ut5.Z2(this.hasStickerMode)) * 31) + C786410Ut5.Z2(this.hasPostPage)) * 31) + C786410Ut5.Z2(this.hasStoryMentionAfterPublishSharePanel)) * 31) + C786410Ut5.Z2(this.hasStoryMentionAfterPublishFeedBottom);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionMessageExtra(hasCaptionMode=");
        sbLIZ.append(this.hasCaptionMode);
        sbLIZ.append(", hasTextMode=");
        sbLIZ.append(this.hasTextMode);
        sbLIZ.append(", hasStickerMode=");
        sbLIZ.append(this.hasStickerMode);
        sbLIZ.append(", hasPostPage=");
        sbLIZ.append(this.hasPostPage);
        sbLIZ.append(", hasStoryMentionAfterPublishSharePanel=");
        sbLIZ.append(this.hasStoryMentionAfterPublishSharePanel);
        sbLIZ.append(", hasStoryMentionAfterPublishFeedBottom=");
        sbLIZ.append(this.hasStoryMentionAfterPublishFeedBottom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasCaptionMode ? 1 : 0);
        parcel.writeInt(this.hasTextMode ? 1 : 0);
        parcel.writeInt(this.hasStickerMode ? 1 : 0);
        parcel.writeInt(this.hasPostPage ? 1 : 0);
        parcel.writeInt(this.hasStoryMentionAfterPublishSharePanel ? 1 : 0);
        parcel.writeInt(this.hasStoryMentionAfterPublishFeedBottom ? 1 : 0);
    }

    public MentionMessageExtra(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.hasCaptionMode = z;
        this.hasTextMode = z2;
        this.hasStickerMode = z3;
        this.hasPostPage = z4;
        this.hasStoryMentionAfterPublishSharePanel = z5;
        this.hasStoryMentionAfterPublishFeedBottom = z6;
    }
}
