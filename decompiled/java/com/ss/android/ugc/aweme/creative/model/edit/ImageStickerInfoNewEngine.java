package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import X.C1464940oE0;
import X.C1465040oEA;
import X.C1466090oFr;
import X.C2188811AlT;
import X.EnumC1466150oFx;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.tts.oecverify.BdTuring;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageStickerInfoNewEngine implements Serializable, Parcelable {

    @C09CT("add_yours_sticker_model")
    public List<AddYoursStickerModel> addYoursStickerModels;

    @C09CT("article_stickers")
    public final List<ArticleStickerModel> articleStickers;

    @C09CT("dm_group_chat_sticker_models")
    public List<DMGroupChatStickerModel> dmGroupChatStickerModels;

    @C09CT("hash_stickers_embed")
    public final List<EmbedHashTagStickerModel> hashStickersEmbed;

    @C09CT("hash_stickers_global")
    public final List<GlobalHashTagStickerModel> hashStickersGlobal;

    @C09CT("hash_stickers_single")
    public final List<SingleHashTagStickerModel> hashStickersSingle;

    @C09CT("mention_sticker_model")
    public final List<MentionStickerModel> mentionStickerModels;

    @C09CT("music_sticker_model")
    public List<MusicStickerModel> musicStickerModels;

    @C040H
    public final transient MutableLiveData<Boolean> stickerAddLiveData;

    @C09CT("text_sticker_model")
    public CopyOnWriteArrayList<TextStickerModel> textStickerModels;
    public static final C1464940oE0 Companion = new Object() { // from class: X.0oE0
    };
    public static final Parcelable.Creator<ImageStickerInfoNewEngine> CREATOR = new Parcelable.Creator<ImageStickerInfoNewEngine>() { // from class: X.0oDz
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfoNewEngine createFromParcel(Parcel parcel) {
            ImageStickerInfoNewEngine.Companion.getClass();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                Parcelable parcelable = parcel.readParcelable(GlobalHashTagStickerModel.class.getClassLoader());
                if (parcelable != null) {
                    arrayList.add(parcelable);
                }
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < i3; i4++) {
                Parcelable parcelable2 = parcel.readParcelable(SingleHashTagStickerModel.class.getClassLoader());
                if (parcelable2 != null) {
                    arrayList2.add(parcelable2);
                }
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList();
            for (int i6 = 0; i6 < i5; i6++) {
                Parcelable parcelable3 = parcel.readParcelable(EmbedHashTagStickerModel.class.getClassLoader());
                if (parcelable3 != null) {
                    arrayList3.add(parcelable3);
                }
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList();
            for (int i8 = 0; i8 < i7; i8++) {
                Parcelable parcelable4 = parcel.readParcelable(AddYoursStickerModel.class.getClassLoader());
                if (parcelable4 != null) {
                    arrayList4.add(parcelable4);
                }
            }
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList();
            for (int i10 = 0; i10 < i9; i10++) {
                Parcelable parcelable5 = parcel.readParcelable(MusicStickerModel.class.getClassLoader());
                if (parcelable5 != null) {
                    arrayList5.add(parcelable5);
                }
            }
            int i11 = parcel.readInt();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            for (int i12 = 0; i12 < i11; i12++) {
                Parcelable parcelable6 = parcel.readParcelable(TextStickerModel.class.getClassLoader());
                if (parcelable6 != null) {
                    copyOnWriteArrayList.add(parcelable6);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList();
            for (int i14 = 0; i14 < i13; i14++) {
                Parcelable parcelable7 = parcel.readParcelable(MentionStickerModel.class.getClassLoader());
                if (parcelable7 != null) {
                    arrayList6.add(parcelable7);
                }
            }
            int i15 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList();
            for (int i16 = 0; i16 < i15; i16++) {
                Parcelable parcelable8 = parcel.readParcelable(ArticleStickerModel.class.getClassLoader());
                if ((parcelable8 instanceof ArticleStickerModel) && parcelable8 != null) {
                    arrayList7.add(parcelable8);
                }
            }
            int i17 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList();
            for (int i18 = 0; i18 < i17; i18++) {
                Parcelable parcelable9 = parcel.readParcelable(DMGroupChatStickerModel.class.getClassLoader());
                if ((parcelable9 instanceof DMGroupChatStickerModel) && parcelable9 != null) {
                    arrayList8.add(parcelable9);
                }
            }
            return new ImageStickerInfoNewEngine(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, copyOnWriteArrayList, arrayList6, arrayList7, arrayList8, null, 512, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfoNewEngine[] newArray(int i) {
            return new ImageStickerInfoNewEngine[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public ImageStickerInfoNewEngine() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    public final ImageStickerInfoNewEngine copy(List<GlobalHashTagStickerModel> list, List<SingleHashTagStickerModel> list2, List<EmbedHashTagStickerModel> list3, List<AddYoursStickerModel> list4, List<MusicStickerModel> list5, CopyOnWriteArrayList<TextStickerModel> copyOnWriteArrayList, List<MentionStickerModel> list6, List<ArticleStickerModel> list7, List<DMGroupChatStickerModel> list8, MutableLiveData<Boolean> mutableLiveData) {
        return new ImageStickerInfoNewEngine(list, list2, list3, list4, list5, copyOnWriteArrayList, list6, list7, list8, mutableLiveData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageStickerInfoNewEngine)) {
            return false;
        }
        ImageStickerInfoNewEngine imageStickerInfoNewEngine = (ImageStickerInfoNewEngine) obj;
        return Intrinsics.LJFF(this.hashStickersGlobal, imageStickerInfoNewEngine.hashStickersGlobal) && Intrinsics.LJFF(this.hashStickersSingle, imageStickerInfoNewEngine.hashStickersSingle) && Intrinsics.LJFF(this.hashStickersEmbed, imageStickerInfoNewEngine.hashStickersEmbed) && Intrinsics.LJFF(this.addYoursStickerModels, imageStickerInfoNewEngine.addYoursStickerModels) && Intrinsics.LJFF(this.musicStickerModels, imageStickerInfoNewEngine.musicStickerModels) && Intrinsics.LJFF(this.textStickerModels, imageStickerInfoNewEngine.textStickerModels) && Intrinsics.LJFF(this.mentionStickerModels, imageStickerInfoNewEngine.mentionStickerModels) && Intrinsics.LJFF(this.articleStickers, imageStickerInfoNewEngine.articleStickers) && Intrinsics.LJFF(this.dmGroupChatStickerModels, imageStickerInfoNewEngine.dmGroupChatStickerModels) && Intrinsics.LJFF(this.stickerAddLiveData, imageStickerInfoNewEngine.stickerAddLiveData);
    }

    public int hashCode() {
        return (((((((((((((((((this.hashStickersGlobal.hashCode() * 31) + this.hashStickersSingle.hashCode()) * 31) + this.hashStickersEmbed.hashCode()) * 31) + this.addYoursStickerModels.hashCode()) * 31) + this.musicStickerModels.hashCode()) * 31) + this.textStickerModels.hashCode()) * 31) + this.mentionStickerModels.hashCode()) * 31) + this.articleStickers.hashCode()) * 31) + this.dmGroupChatStickerModels.hashCode()) * 31) + this.stickerAddLiveData.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageStickerInfoNewEngine(hashStickersGlobal=");
        sbLIZ.append(this.hashStickersGlobal);
        sbLIZ.append(", hashStickersSingle=");
        sbLIZ.append(this.hashStickersSingle);
        sbLIZ.append(", hashStickersEmbed=");
        sbLIZ.append(this.hashStickersEmbed);
        sbLIZ.append(", addYoursStickerModels=");
        sbLIZ.append(this.addYoursStickerModels);
        sbLIZ.append(", musicStickerModels=");
        sbLIZ.append(this.musicStickerModels);
        sbLIZ.append(", textStickerModels=");
        sbLIZ.append(this.textStickerModels);
        sbLIZ.append(", mentionStickerModels=");
        sbLIZ.append(this.mentionStickerModels);
        sbLIZ.append(", articleStickers=");
        sbLIZ.append(this.articleStickers);
        sbLIZ.append(", dmGroupChatStickerModels=");
        sbLIZ.append(this.dmGroupChatStickerModels);
        sbLIZ.append(", stickerAddLiveData=");
        sbLIZ.append(this.stickerAddLiveData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<StickerModel> getAllStickers() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.hashStickersGlobal);
        arrayList.addAll(this.hashStickersSingle);
        arrayList.addAll(this.hashStickersEmbed);
        arrayList.addAll(this.addYoursStickerModels);
        arrayList.addAll(this.musicStickerModels);
        arrayList.addAll(this.textStickerModels);
        arrayList.addAll(this.mentionStickerModels);
        arrayList.addAll(this.articleStickers);
        arrayList.addAll(this.dmGroupChatStickerModels);
        return arrayList;
    }

    public final boolean hasSticker() {
        return (this.hashStickersGlobal.isEmpty() ^ true) || (this.hashStickersSingle.isEmpty() ^ true) || (this.hashStickersEmbed.isEmpty() ^ true) || (this.addYoursStickerModels.isEmpty() ^ true) || (this.musicStickerModels.isEmpty() ^ true) || (this.textStickerModels.isEmpty() ^ true) || (this.mentionStickerModels.isEmpty() ^ true) || (this.articleStickers.isEmpty() ^ true) || (this.dmGroupChatStickerModels.isEmpty() ^ true);
    }

    public final List<AddYoursStickerModel> getAddYoursStickerModels() {
        return this.addYoursStickerModels;
    }

    public final List<ArticleStickerModel> getArticleStickers() {
        return this.articleStickers;
    }

    public final List<DMGroupChatStickerModel> getDmGroupChatStickerModels() {
        return this.dmGroupChatStickerModels;
    }

    public final List<EmbedHashTagStickerModel> getHashStickersEmbed() {
        return this.hashStickersEmbed;
    }

    public final List<GlobalHashTagStickerModel> getHashStickersGlobal() {
        return this.hashStickersGlobal;
    }

    public final List<SingleHashTagStickerModel> getHashStickersSingle() {
        return this.hashStickersSingle;
    }

    public final List<MentionStickerModel> getMentionStickerModels() {
        return this.mentionStickerModels;
    }

    public final List<MusicStickerModel> getMusicStickerModels() {
        return this.musicStickerModels;
    }

    public final MutableLiveData<Boolean> getStickerAddLiveData() {
        return this.stickerAddLiveData;
    }

    public final CopyOnWriteArrayList<TextStickerModel> getTextStickerModels() {
        return this.textStickerModels;
    }

    public final void addStickerByType(StickerModel stickerModel) {
        clearStickerById(stickerModel);
        if (stickerModel instanceof AddYoursStickerModel) {
            this.addYoursStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof MusicStickerModel) {
            this.musicStickerModels.add(stickerModel);
            return;
        }
        if (stickerModel instanceof GlobalHashTagStickerModel) {
            this.hashStickersGlobal.add(stickerModel);
            return;
        }
        if (stickerModel instanceof EmbedHashTagStickerModel) {
            this.hashStickersEmbed.add(stickerModel);
            return;
        }
        if (stickerModel instanceof SingleHashTagStickerModel) {
            this.hashStickersSingle.add(stickerModel);
            return;
        }
        if (stickerModel instanceof TextStickerModel) {
            this.textStickerModels.add(stickerModel);
            this.stickerAddLiveData.setValue(Boolean.TRUE);
        } else if (stickerModel instanceof MentionStickerModel) {
            this.mentionStickerModels.add(stickerModel);
        } else if (stickerModel instanceof ArticleStickerModel) {
            this.articleStickers.add(stickerModel);
        } else {
            if (!(stickerModel instanceof DMGroupChatStickerModel)) {
                return;
            }
            this.dmGroupChatStickerModels.add(stickerModel);
        }
    }

    public final void clearStickerById(StickerModel stickerModel) {
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(stickerModel, 55);
        switch (C1465040oEA.LIZ[stickerModel.getStickerType().ordinal()]) {
            case 1:
                C1466090oFr.LJIILJJIL(this.addYoursStickerModels, awS601S0100000_22);
                break;
            case 2:
                C1466090oFr.LJIILJJIL(this.musicStickerModels, awS601S0100000_22);
                break;
            case 3:
                C1466090oFr.LJIILJJIL(this.hashStickersGlobal, awS601S0100000_22);
                break;
            case 4:
                C1466090oFr.LJIILJJIL(this.hashStickersEmbed, awS601S0100000_22);
                break;
            case 5:
                C1466090oFr.LJIILJJIL(this.hashStickersSingle, awS601S0100000_22);
                break;
            case 6:
                CopyOnWriteArrayList<TextStickerModel> copyOnWriteArrayList = this.textStickerModels;
                ArrayList arrayList = new ArrayList();
                for (TextStickerModel textStickerModel : copyOnWriteArrayList) {
                    if (((Boolean) awS601S0100000_22.invoke(textStickerModel)).booleanValue()) {
                        arrayList.add(textStickerModel);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.textStickerModels.remove(it2.next());
                }
                break;
            case 7:
                C1466090oFr.LJIILJJIL(this.mentionStickerModels, awS601S0100000_22);
                break;
            case 8:
                C1466090oFr.LJIILJJIL(this.articleStickers, awS601S0100000_22);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C1466090oFr.LJIILJJIL(this.dmGroupChatStickerModels, awS601S0100000_22);
                break;
        }
    }

    public final void clearStickerByType(EnumC1466150oFx enumC1466150oFx) {
        switch (C1465040oEA.LIZ[enumC1466150oFx.ordinal()]) {
            case 1:
                this.addYoursStickerModels.clear();
                break;
            case 2:
                this.musicStickerModels.clear();
                break;
            case 3:
                this.hashStickersGlobal.clear();
                break;
            case 4:
                this.hashStickersEmbed.clear();
                break;
            case 5:
                this.hashStickersSingle.clear();
                break;
            case 6:
                this.textStickerModels.clear();
                break;
            case 7:
                this.mentionStickerModels.clear();
                break;
            case 8:
                this.articleStickers.clear();
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                this.dmGroupChatStickerModels.clear();
                break;
        }
    }

    public final void setAddYoursStickerModels(List<AddYoursStickerModel> list) {
        this.addYoursStickerModels = list;
    }

    public final void setDmGroupChatStickerModels(List<DMGroupChatStickerModel> list) {
        this.dmGroupChatStickerModels = list;
    }

    public final void setMusicStickerModels(List<MusicStickerModel> list) {
        this.musicStickerModels = list;
    }

    public final void setTextStickerModels(CopyOnWriteArrayList<TextStickerModel> copyOnWriteArrayList) {
        this.textStickerModels = copyOnWriteArrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Companion.getClass();
        ArrayList arrayList = new ArrayList(getHashStickersGlobal());
        parcel.writeInt(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((GlobalHashTagStickerModel) it2.next(), i);
        }
        ArrayList arrayList2 = new ArrayList(getHashStickersSingle());
        parcel.writeInt(arrayList2.size());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable((SingleHashTagStickerModel) it3.next(), i);
        }
        ArrayList arrayList3 = new ArrayList(getHashStickersEmbed());
        parcel.writeInt(arrayList3.size());
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable((EmbedHashTagStickerModel) it4.next(), i);
        }
        ArrayList arrayList4 = new ArrayList(getAddYoursStickerModels());
        parcel.writeInt(arrayList4.size());
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            parcel.writeParcelable((AddYoursStickerModel) it5.next(), i);
        }
        ArrayList arrayList5 = new ArrayList(getMusicStickerModels());
        parcel.writeInt(arrayList5.size());
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            parcel.writeParcelable((MusicStickerModel) it6.next(), i);
        }
        ArrayList arrayList6 = new ArrayList(getTextStickerModels());
        parcel.writeInt(arrayList6.size());
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            parcel.writeParcelable((TextStickerModel) it7.next(), i);
        }
        ArrayList arrayList7 = new ArrayList(getMentionStickerModels());
        parcel.writeInt(arrayList7.size());
        Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            parcel.writeParcelable((MentionStickerModel) it8.next(), i);
        }
        ArrayList arrayList8 = new ArrayList(getArticleStickers());
        parcel.writeInt(arrayList8.size());
        Iterator it9 = arrayList8.iterator();
        while (it9.hasNext()) {
            parcel.writeParcelable((ArticleStickerModel) it9.next(), i);
        }
        ArrayList arrayList9 = new ArrayList(getDmGroupChatStickerModels());
        parcel.writeInt(arrayList9.size());
        Iterator it10 = arrayList9.iterator();
        while (it10.hasNext()) {
            parcel.writeParcelable((DMGroupChatStickerModel) it10.next(), i);
        }
    }

    public ImageStickerInfoNewEngine(List<GlobalHashTagStickerModel> list, List<SingleHashTagStickerModel> list2, List<EmbedHashTagStickerModel> list3, List<AddYoursStickerModel> list4, List<MusicStickerModel> list5, CopyOnWriteArrayList<TextStickerModel> copyOnWriteArrayList, List<MentionStickerModel> list6, List<ArticleStickerModel> list7, List<DMGroupChatStickerModel> list8, MutableLiveData<Boolean> mutableLiveData) {
        this.hashStickersGlobal = list;
        this.hashStickersSingle = list2;
        this.hashStickersEmbed = list3;
        this.addYoursStickerModels = list4;
        this.musicStickerModels = list5;
        this.textStickerModels = copyOnWriteArrayList;
        this.mentionStickerModels = list6;
        this.articleStickers = list7;
        this.dmGroupChatStickerModels = list8;
        this.stickerAddLiveData = mutableLiveData;
    }

    public /* synthetic */ ImageStickerInfoNewEngine(List list, List list2, List list3, List list4, List list5, CopyOnWriteArrayList copyOnWriteArrayList, List list6, List list7, List list8, MutableLiveData mutableLiveData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new ArrayList() : list3, (i & 8) != 0 ? new ArrayList() : list4, (i & 16) != 0 ? new ArrayList() : list5, (i & 32) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList, (i & 64) != 0 ? new ArrayList() : list6, (i & 128) != 0 ? new ArrayList() : list7, (i & 256) != 0 ? new ArrayList() : list8, (i & 512) != 0 ? new MutableLiveData() : mutableLiveData);
    }
}
