package com.ss.android.ugc.aweme.commerce.tools.music.model;

import X.C09CT;
import X.C1446500nkG;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.music.model.CommerceToolsMusicModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CommerceToolsMusicModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<CommerceToolsMusicModel> CREATOR = new Parcelable.Creator<CommerceToolsMusicModel>() { // from class: X.0nkF
        @Override // android.os.Parcelable.Creator
        public final CommerceToolsMusicModel createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CommerceToolsMusicModel();
        }

        @Override // android.os.Parcelable.Creator
        public final CommerceToolsMusicModel[] newArray(int i) {
            return new CommerceToolsMusicModel[i];
        }
    };

    @C09CT("banner_id")
    public String bannerId;

    @C09CT("banner_type")
    public String bannerType;

    @C09CT("category_id")
    public String categoryId;

    @C09CT("is_commercial")
    public boolean fromCommercialSoundPage;

    @C09CT("is_legal_term_checked")
    public Boolean isMusicLegalUsageTermChecked;

    @C09CT("music_order")
    public Integer musicOrder;

    @C09CT("suggestion_id")
    public String playlistSuggestionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public String getBannerId() {
        return C1446500nkG.LIZ;
    }

    public String getBannerType() {
        return C1446500nkG.LIZIZ;
    }

    public String getCategoryId() {
        return C1446500nkG.LIZLLL;
    }

    public boolean getFromCommercialSoundPage() {
        return C1446500nkG.LJFF;
    }

    public Integer getMusicOrder() {
        return C1446500nkG.LJ;
    }

    public String getPlaylistSuggestionId() {
        return C1446500nkG.LIZJ;
    }

    public final Boolean isMusicLegalUsageTermChecked() {
        return this.isMusicLegalUsageTermChecked;
    }

    public void setBannerId(String str) {
        C1446500nkG.LIZ = str;
        this.bannerId = str;
    }

    public void setBannerType(String str) {
        C1446500nkG.LIZIZ = str;
        this.bannerType = str;
    }

    public void setCategoryId(String str) {
        C1446500nkG.LIZLLL = str;
        this.categoryId = str;
    }

    public void setFromCommercialSoundPage(boolean z) {
        C1446500nkG.LJFF = z;
        this.fromCommercialSoundPage = z;
    }

    public final void setMusicLegalUsageTermChecked(Boolean bool) {
        this.isMusicLegalUsageTermChecked = bool;
    }

    public void setMusicOrder(Integer num) {
        C1446500nkG.LJ = num;
        this.musicOrder = num;
    }

    public void setPlaylistSuggestionId(String str) {
        C1446500nkG.LIZJ = str;
        this.playlistSuggestionId = str;
    }
}
