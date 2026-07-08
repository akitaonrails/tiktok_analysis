package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday;

import X.C533870Kwj;
import X.EnumC538220L8y;
import android.os.Parcel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: loaded from: classes9.dex */
public final class OnThisDayTiktokMediaModel extends TikTokMediaModel {
    public boolean disableAutoSelectMusicInEditing;
    public ForwardMedia forwardMedia;
    public boolean isDefaultSelectItem;
    public int isPoster;
    public final String selectType;
    public static final C533870Kwj Companion = new Object() { // from class: X.0Kwj
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeSerializable(this.forwardMedia);
        parcel.writeString(this.mediaPickerAbsolutePath);
        parcel.writeInt(this.isPoster);
    }

    public /* synthetic */ OnThisDayTiktokMediaModel(String str, EnumC538220L8y enumC538220L8y, String str2, int i) {
        this(str, (i & 2) != 0 ? EnumC538220L8y.MEDIA_STORE : enumC538220L8y, false, (i & 8) != 0 ? "post" : str2);
    }

    public OnThisDayTiktokMediaModel(String str, EnumC538220L8y enumC538220L8y, boolean z, String str2) {
        super(str, enumC538220L8y, z);
        this.selectType = str2;
    }
}
