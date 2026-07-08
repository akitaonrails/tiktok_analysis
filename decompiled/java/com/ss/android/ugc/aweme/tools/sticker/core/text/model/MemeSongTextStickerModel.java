package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.AbstractC1442160ndG;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.MemeSongTextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeSongTextStickerModel implements StickerModel, Parcelable {

    @C09CT("animation_path")
    public final String animationPath;

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("can_move")
    public final boolean canMove;

    @C09CT("color")
    public final int color;

    @C09CT("font_model")
    public final TextFontModel fontModel;

    @C09CT("lyrics_lines")
    public final List<String> lyrics;

    @C09CT("duration")
    public int songDuration;

    @C09CT("text_str")
    public final String textStr;

    @C09CT("timestamps")
    public final List<List<Double>> timeStamps;

    @C09CT("uuid")
    public String uuid;

    @C09CT("visible")
    public final boolean visible;
    public static final Parcelable.Creator<MemeSongTextStickerModel> CREATOR = new Parcelable.Creator<MemeSongTextStickerModel>() { // from class: X.0EYs
        @Override // android.os.Parcelable.Creator
        public final MemeSongTextStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(Double.valueOf(parcel.readDouble()));
                }
                arrayList.add(arrayList2);
            }
            int i6 = parcel.readInt();
            TextFontModel textFontModelCreateFromParcel = TextFontModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new MemeSongTextStickerModel(baseStickerModelCreateFromParcel, string, i, string2, arrayListCreateStringArrayList, arrayList, i6, textFontModelCreateFromParcel, z, string3, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final MemeSongTextStickerModel[] newArray(int i) {
            return new MemeSongTextStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public MemeSongTextStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), null, 0, "", new ArrayList(), new ArrayList(), -1, new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 16383, null), true, "", true);
    }

    public final MemeSongTextStickerModel copy(BaseStickerModel baseStickerModel, String str, int i, String str2, List<String> list, List<? extends List<Double>> list2, int i2, TextFontModel textFontModel, boolean z, String str3, boolean z2) {
        return new MemeSongTextStickerModel(baseStickerModel, str, i, str2, list, list2, i2, textFontModel, z, str3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeSongTextStickerModel)) {
            return false;
        }
        MemeSongTextStickerModel memeSongTextStickerModel = (MemeSongTextStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, memeSongTextStickerModel.baseStickerModel) && Intrinsics.LJFF(this.uuid, memeSongTextStickerModel.uuid) && this.songDuration == memeSongTextStickerModel.songDuration && Intrinsics.LJFF(this.textStr, memeSongTextStickerModel.textStr) && Intrinsics.LJFF(this.lyrics, memeSongTextStickerModel.lyrics) && Intrinsics.LJFF(this.timeStamps, memeSongTextStickerModel.timeStamps) && this.color == memeSongTextStickerModel.color && Intrinsics.LJFF(this.fontModel, memeSongTextStickerModel.fontModel) && this.visible == memeSongTextStickerModel.visible && Intrinsics.LJFF(this.animationPath, memeSongTextStickerModel.animationPath) && this.canMove == memeSongTextStickerModel.canMove;
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.uuid;
        return ((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.songDuration) * 31) + this.textStr.hashCode()) * 31) + this.lyrics.hashCode()) * 31) + this.timeStamps.hashCode()) * 31) + this.color) * 31) + this.fontModel.hashCode()) * 31) + C786410Ut5.Z2(this.visible)) * 31) + this.animationPath.hashCode()) * 31) + C786410Ut5.Z2(this.canMove);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return true;
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
        return "MemeSongTextStickerModel(baseStickerModel=" + this.baseStickerModel + ", uuid=" + this.uuid + ", songDuration=" + this.songDuration + ", textStr=" + this.textStr + ", lyrics=" + this.lyrics + ", timeStamps=" + this.timeStamps + ", color=" + this.color + ", fontModel=" + this.fontModel + ", visible=" + this.visible + ", animationPath=" + this.animationPath + ", canMove=" + this.canMove + ')';
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.uuid);
        parcel.writeInt(this.songDuration);
        parcel.writeString(this.textStr);
        parcel.writeStringList(this.lyrics);
        List<List<Double>> list = this.timeStamps;
        parcel.writeInt(list.size());
        for (List<Double> list2 : list) {
            parcel.writeInt(list2.size());
            Iterator<Double> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeDouble(it2.next().doubleValue());
            }
        }
        parcel.writeInt(this.color);
        this.fontModel.writeToParcel(parcel, i);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeString(this.animationPath);
        parcel.writeInt(this.canMove ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        return new InteractStickerStruct();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return C123100dR.LIZ(this.textStr) && (a0.LJJJIL(this.textStr) ^ true);
    }

    public final String getAnimationPath() {
        return this.animationPath;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getCanMove() {
        return this.canMove;
    }

    public final int getColor() {
        return this.color;
    }

    public final TextFontModel getFontModel() {
        return this.fontModel;
    }

    public final List<String> getLyrics() {
        return this.lyrics;
    }

    public final int getSongDuration() {
        return this.songDuration;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.MEME_SONG_TEXT;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final List<List<Double>> getTimeStamps() {
        return this.timeStamps;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setSongDuration(int i) {
        this.songDuration = i;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MemeSongTextStickerModel(BaseStickerModel baseStickerModel, String str, int i, String str2, List<String> list, List<? extends List<Double>> list2, int i2, TextFontModel textFontModel, boolean z, String str3, boolean z2) {
        this.baseStickerModel = baseStickerModel;
        this.uuid = str;
        this.songDuration = i;
        this.textStr = str2;
        this.lyrics = list;
        this.timeStamps = list2;
        this.color = i2;
        this.fontModel = textFontModel;
        this.visible = z;
        this.animationPath = str3;
        this.canMove = z2;
    }
}
