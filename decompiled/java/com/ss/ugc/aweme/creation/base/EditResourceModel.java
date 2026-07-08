package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.CaptionResModel;
import com.ss.ugc.aweme.creation.base.EditResourceModel;
import com.ss.ugc.aweme.creation.base.MusicResModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class EditResourceModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditResourceModel> CREATOR = new Parcelable.Creator<EditResourceModel>() { // from class: X.0MhH
        @Override // android.os.Parcelable.Creator
        public final EditResourceModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(EditResourceModel.class.getClassLoader()));
                i--;
            }
            MusicResModel musicResModel = (MusicResModel) parcel.readParcelable(EditResourceModel.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (i2 != 0) {
                arrayList2.add(parcel.readParcelable(EditResourceModel.class.getClassLoader()));
                i2--;
            }
            return new EditResourceModel(arrayList, musicResModel, arrayList2, (CaptionResModel) parcel.readParcelable(EditResourceModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EditResourceModel[] newArray(int i) {
            return new EditResourceModel[i];
        }
    };

    @C09CT("caption_config")
    public CaptionResModel captionConfig;

    @C09CT("music_config")
    public MusicResModel musicConfig;

    @C09CT("special_effect_config")
    public List<SpecialEffectResModel> specialEffectConfig;

    @C09CT("sticker_config")
    public List<StickerResModel> stickerConfig;

    public EditResourceModel() {
        this(new ArrayList(), null, new ArrayList(), null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<StickerResModel> list = this.stickerConfig;
        parcel.writeInt(list.size());
        Iterator<StickerResModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeParcelable(this.musicConfig, i);
        List<SpecialEffectResModel> list2 = this.specialEffectConfig;
        parcel.writeInt(list2.size());
        Iterator<SpecialEffectResModel> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
        parcel.writeParcelable(this.captionConfig, i);
    }

    public final CaptionResModel getCaptionConfig() {
        return this.captionConfig;
    }

    public final MusicResModel getMusicConfig() {
        return this.musicConfig;
    }

    public final List<SpecialEffectResModel> getSpecialEffectConfig() {
        return this.specialEffectConfig;
    }

    public final List<StickerResModel> getStickerConfig() {
        return this.stickerConfig;
    }

    public final void setCaptionConfig(CaptionResModel captionResModel) {
        this.captionConfig = captionResModel;
    }

    public final void setMusicConfig(MusicResModel musicResModel) {
        this.musicConfig = musicResModel;
    }

    public final void setSpecialEffectConfig(List<SpecialEffectResModel> list) {
        this.specialEffectConfig = list;
    }

    public final void setStickerConfig(List<StickerResModel> list) {
        this.stickerConfig = list;
    }

    public EditResourceModel(List<StickerResModel> list, MusicResModel musicResModel, List<SpecialEffectResModel> list2, CaptionResModel captionResModel) {
        this.stickerConfig = list;
        this.musicConfig = musicResModel;
        this.specialEffectConfig = list2;
        this.captionConfig = captionResModel;
    }
}
