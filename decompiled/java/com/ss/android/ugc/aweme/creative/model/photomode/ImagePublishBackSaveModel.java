package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C040H;
import X.C08MN;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.GenItem;
import com.ss.android.ugc.aweme.creative.model.photomode.ImagePublishBackSaveModel;
import com.ss.android.ugc.aweme.creative.model.photomode.RecommendDescRequestContent;
import com.ss.android.ugc.aweme.creative.model.photomode.VoiceInputMobModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.AIRewriteModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImagePublishBackSaveModel implements Parcelable {
    public static final Parcelable.Creator<ImagePublishBackSaveModel> CREATOR = new Parcelable.Creator<ImagePublishBackSaveModel>() { // from class: X.0mh6
        @Override // android.os.Parcelable.Creator
        public final ImagePublishBackSaveModel createFromParcel(Parcel parcel) {
            boolean z;
            RecommendDescRequestContent recommendDescRequestContentCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
            C08MN c08mn = (C08MN) parcel.readSerializable();
            C08MN c08mn2 = (C08MN) parcel.readSerializable();
            C08MN c08mn3 = (C08MN) parcel.readSerializable();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(GenItem.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                recommendDescRequestContentCreateFromParcel = null;
            } else {
                recommendDescRequestContentCreateFromParcel = RecommendDescRequestContent.CREATOR.createFromParcel(parcel);
            }
            return new ImagePublishBackSaveModel(z, map, c08mn, c08mn2, c08mn3, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string, string2, arrayList, recommendDescRequestContentCreateFromParcel, AIRewriteModel.CREATOR.createFromParcel(parcel), VoiceInputMobModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ImagePublishBackSaveModel[] newArray(int i) {
            return new ImagePublishBackSaveModel[i];
        }
    };

    @C09CT("ai_rewrite_model")
    public final AIRewriteModel aiRewriteModel;

    @C09CT("ai_tip_map")
    public HashMap<String, String> aiTipsMap;

    @C09CT("continue_inspiration_list")
    public final C08MN<String> continueInspirations;

    @C09CT("has_show_text_sticker_to_des_card")
    public boolean hasShowTextStickerToDesCard;

    @C040H
    public String hitVertical;

    @C09CT("inspiration_list")
    public final C08MN<String> inspirations;

    @C040H
    public List<GenItem> lastGenerateInspiration;

    @C040H
    public RecommendDescRequestContent lastRequestContent;

    @C09CT("photo_text_list")
    public final C08MN<String> photoTexts;

    @C09CT("topic_default_copy")
    public String topicDefaultCopy;

    @C09CT("topic_inspiration_descriptions_list")
    public final List<String> topicInspirationDescriptions;

    @C09CT("topic_inspirations_list")
    public final List<String> topicInspirations;

    @C09CT("voice_input_model")
    public final VoiceInputMobModel voiceInputModel;

    public ImagePublishBackSaveModel() {
        this(false, new HashMap(), new C08MN(100), new C08MN(100), new C08MN(100), new ArrayList(), new ArrayList(), "", "", new ArrayList(), null, new AIRewriteModel(null, false, new LinkedHashMap(), false, false), new VoiceInputMobModel(false, 0, 0L, 0));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePublishBackSaveModel)) {
            return false;
        }
        ImagePublishBackSaveModel imagePublishBackSaveModel = (ImagePublishBackSaveModel) obj;
        return this.hasShowTextStickerToDesCard == imagePublishBackSaveModel.hasShowTextStickerToDesCard && Intrinsics.LJFF(this.aiTipsMap, imagePublishBackSaveModel.aiTipsMap) && Intrinsics.LJFF(this.inspirations, imagePublishBackSaveModel.inspirations) && Intrinsics.LJFF(this.continueInspirations, imagePublishBackSaveModel.continueInspirations) && Intrinsics.LJFF(this.photoTexts, imagePublishBackSaveModel.photoTexts) && Intrinsics.LJFF(this.topicInspirations, imagePublishBackSaveModel.topicInspirations) && Intrinsics.LJFF(this.topicInspirationDescriptions, imagePublishBackSaveModel.topicInspirationDescriptions) && Intrinsics.LJFF(this.topicDefaultCopy, imagePublishBackSaveModel.topicDefaultCopy) && Intrinsics.LJFF(this.hitVertical, imagePublishBackSaveModel.hitVertical) && Intrinsics.LJFF(this.lastGenerateInspiration, imagePublishBackSaveModel.lastGenerateInspiration) && Intrinsics.LJFF(this.lastRequestContent, imagePublishBackSaveModel.lastRequestContent) && Intrinsics.LJFF(this.aiRewriteModel, imagePublishBackSaveModel.aiRewriteModel) && Intrinsics.LJFF(this.voiceInputModel, imagePublishBackSaveModel.voiceInputModel);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((((C786410Ut5.Z2(this.hasShowTextStickerToDesCard) * 31) + this.aiTipsMap.hashCode()) * 31) + this.inspirations.hashCode()) * 31) + this.continueInspirations.hashCode()) * 31) + this.photoTexts.hashCode()) * 31) + this.topicInspirations.hashCode()) * 31) + this.topicInspirationDescriptions.hashCode()) * 31) + this.topicDefaultCopy.hashCode()) * 31) + this.hitVertical.hashCode()) * 31) + this.lastGenerateInspiration.hashCode()) * 31;
        RecommendDescRequestContent recommendDescRequestContent = this.lastRequestContent;
        return ((((iZ2 + (recommendDescRequestContent == null ? 0 : recommendDescRequestContent.hashCode())) * 31) + this.aiRewriteModel.hashCode()) * 31) + this.voiceInputModel.hashCode();
    }

    public final String toString() {
        return "ImagePublishBackSaveModel(hasShowTextStickerToDesCard=" + this.hasShowTextStickerToDesCard + ", aiTipsMap=" + this.aiTipsMap + ", inspirations=" + this.inspirations + ", continueInspirations=" + this.continueInspirations + ", photoTexts=" + this.photoTexts + ", topicInspirations=" + this.topicInspirations + ", topicInspirationDescriptions=" + this.topicInspirationDescriptions + ", topicDefaultCopy=" + this.topicDefaultCopy + ", hitVertical=" + this.hitVertical + ", lastGenerateInspiration=" + this.lastGenerateInspiration + ", lastRequestContent=" + this.lastRequestContent + ", aiRewriteModel=" + this.aiRewriteModel + ", voiceInputModel=" + this.voiceInputModel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasShowTextStickerToDesCard ? 1 : 0);
        HashMap<String, String> map = this.aiTipsMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeSerializable(this.inspirations);
        parcel.writeSerializable(this.continueInspirations);
        parcel.writeSerializable(this.photoTexts);
        parcel.writeStringList(this.topicInspirations);
        parcel.writeStringList(this.topicInspirationDescriptions);
        parcel.writeString(this.topicDefaultCopy);
        parcel.writeString(this.hitVertical);
        List<GenItem> list = this.lastGenerateInspiration;
        parcel.writeInt(list.size());
        Iterator<GenItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        RecommendDescRequestContent recommendDescRequestContent = this.lastRequestContent;
        if (recommendDescRequestContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recommendDescRequestContent.writeToParcel(parcel, i);
        }
        this.aiRewriteModel.writeToParcel(parcel, i);
        this.voiceInputModel.writeToParcel(parcel, i);
    }

    public ImagePublishBackSaveModel(boolean z, HashMap<String, String> map, C08MN<String> c08mn, C08MN<String> c08mn2, C08MN<String> c08mn3, List<String> list, List<String> list2, String str, String str2, List<GenItem> list3, RecommendDescRequestContent recommendDescRequestContent, AIRewriteModel aIRewriteModel, VoiceInputMobModel voiceInputMobModel) {
        this.hasShowTextStickerToDesCard = z;
        this.aiTipsMap = map;
        this.inspirations = c08mn;
        this.continueInspirations = c08mn2;
        this.photoTexts = c08mn3;
        this.topicInspirations = list;
        this.topicInspirationDescriptions = list2;
        this.topicDefaultCopy = str;
        this.hitVertical = str2;
        this.lastGenerateInspiration = list3;
        this.lastRequestContent = recommendDescRequestContent;
        this.aiRewriteModel = aIRewriteModel;
        this.voiceInputModel = voiceInputMobModel;
    }
}
