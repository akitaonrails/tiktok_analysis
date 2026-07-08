package com.ss.android.ugc.aweme.composer.model;

import X.C576100Mie;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.ugc.aweme.CreationConfigModel;

/* JADX INFO: loaded from: classes9.dex */
public class CreationConfigModelCompat extends CreationConfigModel {
    public static final Parcelable.Creator<CreationConfigModelCompat> CREATOR = new Parcelable.Creator<CreationConfigModelCompat>() { // from class: X.0MSx
        @Override // android.os.Parcelable.Creator
        public final CreationConfigModelCompat createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CreationConfigModelCompat();
        }

        @Override // android.os.Parcelable.Creator
        public final CreationConfigModelCompat[] newArray(int i) {
            return new CreationConfigModelCompat[i];
        }
    };
    public C576100Mie callback;
    public ExternalContentShareStoryInputData externContentShareStoryData;
    public LinkShareData linkShare;
    public MixStudioShareStoryInputData mixStudioData;
    public MusicComposerModel music;
    public MusicShareStoryInputData musicShareStoryData;

    public CreationConfigModelCompat() {
        super("", null, null, null, null);
    }

    @Override // com.ss.ugc.aweme.CreationConfigModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final C576100Mie getCallback() {
        return this.callback;
    }

    public final ExternalContentShareStoryInputData getExternContentShareStoryData() {
        return this.externContentShareStoryData;
    }

    public final LinkShareData getLinkShare() {
        return this.linkShare;
    }

    public final MixStudioShareStoryInputData getMixStudioData() {
        return this.mixStudioData;
    }

    public final MusicComposerModel getMusic() {
        return this.music;
    }

    public MusicShareStoryInputData getMusicShareStoryData() {
        return this.musicShareStoryData;
    }

    public final void setCallback(C576100Mie c576100Mie) {
        this.callback = c576100Mie;
    }

    public final void setExternContentShareStoryData(ExternalContentShareStoryInputData externalContentShareStoryInputData) {
        this.externContentShareStoryData = externalContentShareStoryInputData;
    }

    public final void setLinkShare(LinkShareData linkShareData) {
        this.linkShare = linkShareData;
    }

    public final void setMixStudioData(MixStudioShareStoryInputData mixStudioShareStoryInputData) {
        this.mixStudioData = mixStudioShareStoryInputData;
    }

    public final void setMusic(MusicComposerModel musicComposerModel) {
        this.music = musicComposerModel;
    }

    public void setMusicShareStoryData(MusicShareStoryInputData musicShareStoryInputData) {
        this.musicShareStoryData = musicShareStoryInputData;
    }
}
