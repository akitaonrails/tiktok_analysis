package com.ss.android.ugc.aweme.editSticker.model;

import X.C097U;
import X.C09CT;
import X.C0MZX;
import X.C2475009mu;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public class EffectTextModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectTextModel> CREATOR = new Parcelable.Creator<EffectTextModel>() { // from class: X.0nK6
        @Override // android.os.Parcelable.Creator
        public final EffectTextModel createFromParcel(Parcel parcel) {
            boolean z;
            CreateAwemeCoverInfo createAwemeCoverInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            StickerItemModel stickerItemModel = (StickerItemModel) parcel.readParcelable(EffectTextModel.class.getClassLoader());
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                createAwemeCoverInfoCreateFromParcel = null;
            } else {
                createAwemeCoverInfoCreateFromParcel = CreateAwemeCoverInfo.CREATOR.createFromParcel(parcel);
            }
            CreateAwemeCoverInfo createAwemeCoverInfo = createAwemeCoverInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new EffectTextModel(z, stickerItemModel, createAwemeCoverInfo, string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectTextModel[] newArray(int i) {
            return new EffectTextModel[i];
        }
    };

    @C09CT("cover_frame_index")
    public Integer coverFrameIndex;

    @C09CT("cover_select_from")
    public String coverSelectedFrom;

    @C09CT("create_aweme_cover_info")
    public CreateAwemeCoverInfo createAwemeCoverInfo;

    @C09CT("has_cover_text")
    public boolean hasCoverText;

    @C09CT("text_sticker")
    public StickerItemModel textSticker;

    public EffectTextModel() {
        this(false, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void reset() {
        this.hasCoverText = false;
        this.textSticker = null;
        this.createAwemeCoverInfo = null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasCoverText ? 1 : 0);
        parcel.writeParcelable(this.textSticker, i);
        CreateAwemeCoverInfo createAwemeCoverInfo = this.createAwemeCoverInfo;
        if (createAwemeCoverInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createAwemeCoverInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.coverSelectedFrom);
        Integer num = this.coverFrameIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final boolean isCoverTextValid() {
        StickerItemModel stickerItemModel;
        String str;
        return (!this.hasCoverText || (stickerItemModel = this.textSticker) == null || (str = stickerItemModel.path) == null || str.length() == 0) ? false : true;
    }

    public final Integer getCoverFrameIndex() {
        return this.coverFrameIndex;
    }

    public final String getCoverSelectedFrom() {
        return this.coverSelectedFrom;
    }

    public final CreateAwemeCoverInfo getCreateAwemeCoverInfo() {
        return this.createAwemeCoverInfo;
    }

    public final boolean getHasCoverText() {
        return this.hasCoverText;
    }

    public final StickerItemModel getTextSticker() {
        return this.textSticker;
    }

    public final Bitmap directMergeCoverText(Bitmap bitmap) {
        StickerItemModel stickerItemModel;
        if (this.hasCoverText && (stickerItemModel = this.textSticker) != null) {
            try {
                Bitmap bitmapLIZIZ = C097U.LIZIZ(bitmap.getWidth(), bitmap.getHeight(), stickerItemModel.path);
                Bitmap bitmapLIZLLL = C2475009mu.LIZLLL(bitmap, bitmapLIZIZ);
                C2475009mu.LJ(bitmapLIZIZ);
                return bitmapLIZLLL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return bitmap;
    }

    public final Bitmap mergeCoverText(Bitmap bitmap) {
        StickerItemModel stickerItemModel;
        boolean z;
        Bitmap.Config config;
        Bitmap bitmapLIZ;
        if (this.hasCoverText && (stickerItemModel = this.textSticker) != null) {
            try {
                int width = bitmap.getWidth();
                Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(stickerItemModel.path);
                if (bitmap.getWidth() > bitmap.getHeight() && pairLIZJ.getSecond().intValue() > pairLIZJ.getFirst().intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (pairLIZJ.getFirst().intValue() != 0 && pairLIZJ.getSecond().intValue() != 0 && z) {
                    Bitmap bitmapLIZIZ = C097U.LIZIZ(width, (int) ((width * pairLIZJ.getSecond().intValue()) / pairLIZJ.getFirst().floatValue()), stickerItemModel.path);
                    if (bitmapLIZIZ != null) {
                        config = bitmapLIZIZ.getConfig();
                    } else {
                        config = null;
                    }
                    if (config == null) {
                        bitmapLIZ = bitmap;
                    } else {
                        bitmapLIZ = C0MZX.LIZ(bitmap, bitmapLIZIZ, config);
                    }
                    C2475009mu.LJ(bitmapLIZIZ);
                    return bitmapLIZ;
                }
                Bitmap bitmapLIZIZ2 = C097U.LIZIZ(width, bitmap.getHeight(), stickerItemModel.path);
                Bitmap bitmapLIZLLL = C2475009mu.LIZLLL(bitmap, bitmapLIZIZ2);
                C2475009mu.LJ(bitmapLIZIZ2);
                return bitmapLIZLLL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return bitmap;
    }

    public final void setCoverFrameIndex(Integer num) {
        this.coverFrameIndex = num;
    }

    public final void setCoverSelectedFrom(String str) {
        this.coverSelectedFrom = str;
    }

    public final void setCreateAwemeCoverInfo(CreateAwemeCoverInfo createAwemeCoverInfo) {
        this.createAwemeCoverInfo = createAwemeCoverInfo;
    }

    public final void setHasCoverText(boolean z) {
        this.hasCoverText = z;
    }

    public final void setTextSticker(StickerItemModel stickerItemModel) {
        this.textSticker = stickerItemModel;
    }

    public EffectTextModel(boolean z, StickerItemModel stickerItemModel, CreateAwemeCoverInfo createAwemeCoverInfo, String str, Integer num) {
        this.hasCoverText = z;
        this.textSticker = stickerItemModel;
        this.createAwemeCoverInfo = createAwemeCoverInfo;
        this.coverSelectedFrom = str;
        this.coverFrameIndex = num;
    }
}
