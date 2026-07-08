package com.ss.android.ugc.aweme.tools.sticker.core.music;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C19591311kt;
import X.C19621011pg;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("artist_name")
    public final String artistName;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("editable")
    public final boolean editable;

    @C09CT("is_pgc")
    public final Boolean isPGC;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_sticker_from")
    public final String musicStickerFrom;

    @C09CT("sticker_style")
    public final int stickerStyle;

    @C09CT("title")
    public final String title;

    @C09CT("visible")
    public final boolean visible;
    public static final C19621011pg Companion = new Object() { // from class: X.11pg
    };
    public static final Parcelable.Creator<MusicStickerModel> CREATOR = new Parcelable.Creator<MusicStickerModel>() { // from class: X.0oGA
        @Override // android.os.Parcelable.Creator
        public final MusicStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Boolean boolValueOf;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            boolean z4 = true;
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            return new MusicStickerModel(baseStickerModelCreateFromParcel, z, z2, z3, string, string2, string3, urlModel, boolValueOf, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicStickerModel[] newArray(int i) {
            return new MusicStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public MusicStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), true, false, false, null, null, null, null, null, 1, null);
    }

    public final MusicStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2, boolean z3, String str, String str2, String str3, UrlModel urlModel, Boolean bool, int i, String str4) {
        return new MusicStickerModel(baseStickerModel, z, z2, z3, str, str2, str3, urlModel, bool, i, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicStickerModel)) {
            return false;
        }
        MusicStickerModel musicStickerModel = (MusicStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, musicStickerModel.baseStickerModel) && this.visible == musicStickerModel.visible && this.editable == musicStickerModel.editable && this.clickable == musicStickerModel.clickable && Intrinsics.LJFF(this.musicId, musicStickerModel.musicId) && Intrinsics.LJFF(this.artistName, musicStickerModel.artistName) && Intrinsics.LJFF(this.title, musicStickerModel.title) && Intrinsics.LJFF(this.cover, musicStickerModel.cover) && Intrinsics.LJFF(this.isPGC, musicStickerModel.isPGC) && this.stickerStyle == musicStickerModel.stickerStyle && Intrinsics.LJFF(this.musicStickerFrom, musicStickerModel.musicStickerFrom);
    }

    public int hashCode() {
        int iHashCode = ((((((this.baseStickerModel.hashCode() * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.clickable)) * 31;
        String str = this.musicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.artistName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Boolean bool = this.isPGC;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + this.stickerStyle) * 31;
        String str4 = this.musicStickerFrom;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
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
        return "MusicStickerModel(baseStickerModel=" + this.baseStickerModel + ", visible=" + this.visible + ", editable=" + this.editable + ", clickable=" + this.clickable + ", musicId=" + this.musicId + ", artistName=" + this.artistName + ", title=" + this.title + ", cover=" + this.cover + ", isPGC=" + this.isPGC + ", stickerStyle=" + this.stickerStyle + ", musicStickerFrom=" + this.musicStickerFrom + ')';
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeString(this.musicId);
        parcel.writeString(this.artistName);
        parcel.writeString(this.title);
        parcel.writeSerializable(this.cover);
        Boolean bool = this.isPGC;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeInt(this.stickerStyle);
        parcel.writeString(this.musicStickerFrom);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        interactStickerStructLIZLLL.setMusicStickerStruct(new MusicStickerStruct(getMusicId(), getArtistName(), getTitle(), getCover(), isPGC(), getStickerStyle(), getMusicStickerFrom()));
        interactStickerStructLIZLLL.setType(getStickerType().getType());
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(this.musicId);
    }

    public final String getArtistName() {
        return this.artistName;
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

    public final UrlModel getCover() {
        return this.cover;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicStickerFrom() {
        return this.musicStickerFrom;
    }

    public final int getStickerStyle() {
        return this.stickerStyle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final Boolean isPGC() {
        return this.isPGC;
    }

    public MusicStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, boolean z3, String str, String str2, String str3, UrlModel urlModel, Boolean bool, int i, String str4) {
        this.baseStickerModel = baseStickerModel;
        this.visible = z;
        this.editable = z2;
        this.clickable = z3;
        this.musicId = str;
        this.artistName = str2;
        this.title = str3;
        this.cover = urlModel;
        this.isPGC = bool;
        this.stickerStyle = i;
        this.musicStickerFrom = str4;
    }
}
