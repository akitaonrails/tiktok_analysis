package com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C1440500naa;
import X.C19591311kt;
import X.C19605611nC;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.interactiveemoji.model.InteractiveEmojiStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InteractiveEmojiStickerModel implements StickerModel, Serializable {

    @C09CT("android_ver")
    public String androidVer;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("emoji_content")
    public String emojiContent;

    @C09CT("ios_ver")
    public String iosVer;

    @C09CT("visible")
    public final boolean visible;
    public static final C19605611nC Companion = new Object() { // from class: X.11nC
    };
    public static final Parcelable.Creator<InteractiveEmojiStickerModel> CREATOR = new Parcelable.Creator<InteractiveEmojiStickerModel>() { // from class: X.11n7
        @Override // android.os.Parcelable.Creator
        public final InteractiveEmojiStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new InteractiveEmojiStickerModel(baseStickerModelCreateFromParcel, z, z2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InteractiveEmojiStickerModel[] newArray(int i) {
            return new InteractiveEmojiStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public InteractiveEmojiStickerModel() {
        this(new BaseStickerModel(100, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), false, true, "😍", "19", "8.3");
    }

    public final InteractiveEmojiStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2, String str, String str2, String str3) {
        return new InteractiveEmojiStickerModel(baseStickerModel, z, z2, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractiveEmojiStickerModel)) {
            return false;
        }
        InteractiveEmojiStickerModel interactiveEmojiStickerModel = (InteractiveEmojiStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, interactiveEmojiStickerModel.baseStickerModel) && this.clickable == interactiveEmojiStickerModel.clickable && this.visible == interactiveEmojiStickerModel.visible && Intrinsics.LJFF(this.emojiContent, interactiveEmojiStickerModel.emojiContent) && Intrinsics.LJFF(this.androidVer, interactiveEmojiStickerModel.androidVer) && Intrinsics.LJFF(this.iosVer, interactiveEmojiStickerModel.iosVer);
    }

    public int hashCode() {
        return (((((((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.clickable)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + this.emojiContent.hashCode()) * 31) + this.androidVer.hashCode()) * 31) + this.iosVer.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractiveEmojiStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", emojiContent=");
        sbLIZ.append(this.emojiContent);
        sbLIZ.append(", androidVer=");
        sbLIZ.append(this.androidVer);
        sbLIZ.append(", iosVer=");
        sbLIZ.append(this.iosVer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeString(this.emojiContent);
        parcel.writeString(this.androidVer);
        parcel.writeString(this.iosVer);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        interactStickerStructLIZLLL.setInteractiveEmojiStickerStruct(new InteractiveEmojiStickerStruct(this.emojiContent, this.androidVer, this.iosVer));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return this.emojiContent.length() > 0 && this.androidVer.length() > 0 && this.iosVer.length() > 0;
    }

    public final String getAndroidVer() {
        return this.androidVer;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final String getEmojiContent() {
        return this.emojiContent;
    }

    public final String getIosVer() {
        return this.iosVer;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setAndroidVer(String str) {
        this.androidVer = str;
    }

    public final void setEmojiContent(String str) {
        this.emojiContent = str;
    }

    public final void setIosVer(String str) {
        this.iosVer = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return copy(BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, pair.getFirst().intValue(), pair.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24577, 15, null), this.clickable, this.visible, this.emojiContent, this.androidVer, this.iosVer);
    }

    public InteractiveEmojiStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, String str, String str2, String str3) {
        this.baseStickerModel = baseStickerModel;
        this.clickable = z;
        this.visible = z2;
        this.emojiContent = str;
        this.androidVer = str2;
        this.iosVer = str3;
    }
}
