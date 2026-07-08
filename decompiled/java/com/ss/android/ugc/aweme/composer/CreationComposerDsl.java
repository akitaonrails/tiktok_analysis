package com.ss.android.ugc.aweme.composer;

import X.C576100Mie;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.composer.model.ExternalContentShareStoryInputData;
import com.ss.android.ugc.aweme.composer.model.MixStudioShareStoryInputData;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationComposerDsl extends CreationConfigModelCompat {
    public static final Parcelable.Creator<CreationComposerDsl> CREATOR = new Parcelable.Creator<CreationComposerDsl>() { // from class: X.0Mid
        @Override // android.os.Parcelable.Creator
        public final CreationComposerDsl createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CreationComposerDsl();
        }

        @Override // android.os.Parcelable.Creator
        public final CreationComposerDsl[] newArray(int i) {
            return new CreationComposerDsl[i];
        }
    };

    @Override // com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat, com.ss.ugc.aweme.CreationConfigModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final BasicModelDsl basic(Function1<? super BasicModelDsl, Unit> function1) {
        BasicModelDsl basicModelDsl = new BasicModelDsl();
        function1.invoke(basicModelDsl);
        setBasic(basicModelDsl);
        return basicModelDsl;
    }

    public final C576100Mie callback(Function1<? super C576100Mie, Unit> function1) {
        C576100Mie c576100Mie = new C576100Mie(AFwS194S0000000_8.get$arr$(345), AFwS194S0000000_8.get$arr$(346));
        function1.invoke(c576100Mie);
        setCallback(c576100Mie);
        return c576100Mie;
    }

    public final ExternalContentShareStoryInputData externalShareStory(Function1<? super ExternalContentShareStoryInputData, Unit> function1) {
        ExternalContentShareStoryInputData externalContentShareStoryInputData = new ExternalContentShareStoryInputData(null, null, null);
        function1.invoke(externalContentShareStoryInputData);
        setExternContentShareStoryData(externalContentShareStoryInputData);
        return externalContentShareStoryInputData;
    }

    public final MixStudioShareStoryInputData mixStudioShareStory(Function1<? super MixStudioShareStoryInputData, Unit> function1) {
        MixStudioShareStoryInputData mixStudioShareStoryInputData = new MixStudioShareStoryInputData(null);
        function1.invoke(mixStudioShareStoryInputData);
        setMixStudioData(mixStudioShareStoryInputData);
        return mixStudioShareStoryInputData;
    }

    public final MusicShareStoryInputData musicShareStory(Function1<? super MusicShareStoryInputData, Unit> function1) {
        MusicShareStoryInputData musicShareStoryInputData = new MusicShareStoryInputData(null, null, new MusicModel(), null, null, null, null);
        function1.invoke(musicShareStoryInputData);
        setMusicShareStoryData(musicShareStoryInputData);
        return musicShareStoryInputData;
    }
}
