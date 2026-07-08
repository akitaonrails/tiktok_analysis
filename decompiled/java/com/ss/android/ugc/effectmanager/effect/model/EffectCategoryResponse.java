package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public class EffectCategoryResponse implements Serializable, Parcelable {
    public static final Parcelable.Creator<EffectCategoryResponse> CREATOR = new Creator();
    public List<? extends Effect> collection_effect;
    public String extra;
    public Effect front_effect;
    public String icon_normal_url;
    public String icon_selected_url;
    public String id;
    public boolean is_default;
    public String key;
    public String name;
    public Effect rear_effect;
    public List<String> tags;
    public String tags_update_time;
    public List<? extends Effect> total_effects;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<EffectCategoryResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectCategoryResponse createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Effect effect = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            Effect effect2 = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
            }
            return new EffectCategoryResponse(string, string2, string3, string4, string5, effect, effect2, arrayList, arrayListCreateStringArrayList, string6, arrayList2, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectCategoryResponse[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.front_effect, i);
        parcel.writeParcelable(this.rear_effect, i);
        List<? extends Effect> list = this.total_effects;
        parcel.writeInt(list.size());
        Iterator<? extends Effect> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_update_time);
        List<? extends Effect> list2 = this.collection_effect;
        parcel.writeInt(list2.size());
        Iterator<? extends Effect> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
        parcel.writeInt(this.is_default ? 1 : 0);
        parcel.writeString(this.extra);
    }

    public final List<Effect> getCollectionEffect() {
        return this.collection_effect;
    }

    public final List<Effect> getCollection_effect() {
        return this.collection_effect;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Effect getFrontEffect() {
        return this.front_effect;
    }

    public final Effect getFront_effect() {
        return this.front_effect;
    }

    public final String getIcon_normal_url() {
        return this.icon_normal_url;
    }

    public final String getIcon_selected_url() {
        return this.icon_selected_url;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final Effect getRearEffect() {
        return this.rear_effect;
    }

    public final Effect getRear_effect() {
        return this.rear_effect;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTagsUpdateTime() {
        return this.tags_update_time;
    }

    public final String getTags_update_time() {
        return this.tags_update_time;
    }

    public final List<Effect> getTotalEffects() {
        return this.total_effects;
    }

    public final List<Effect> getTotal_effects() {
        return this.total_effects;
    }

    public final boolean isDefault() {
        return this.is_default;
    }

    public final boolean is_default() {
        return this.is_default;
    }

    public final void setCollectionEffect(List<? extends Effect> list) {
        this.collection_effect = list;
    }

    public final void setCollection_effect(List<? extends Effect> list) {
        this.collection_effect = list;
    }

    public final void setDefault(boolean z) {
        this.is_default = z;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFrontEffect(Effect effect) {
        this.front_effect = effect;
    }

    public final void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public final void setIcon_normal_url(String str) {
        this.icon_normal_url = str;
    }

    public final void setIcon_selected_url(String str) {
        this.icon_selected_url = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRearEffect(Effect effect) {
        this.rear_effect = effect;
    }

    public final void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTagsUpdateTime(String str) {
        this.tags_update_time = str;
    }

    public final void setTags_update_time(String str) {
        this.tags_update_time = str;
    }

    public final void setTotalEffects(List<? extends Effect> list) {
        this.total_effects = list;
    }

    public final void setTotal_effects(List<? extends Effect> list) {
        this.total_effects = list;
    }

    public final void set_default(boolean z) {
        this.is_default = z;
    }

    public EffectCategoryResponse(String str, String str2, String str3, String str4, String str5, Effect effect, Effect effect2, List<? extends Effect> list, List<String> list2, String str6, List<? extends Effect> list3, boolean z, String str7) {
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon_normal_url = str4;
        this.icon_selected_url = str5;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.total_effects = list;
        this.tags = list2;
        this.tags_update_time = str6;
        this.collection_effect = list3;
        this.is_default = z;
        this.extra = str7;
    }

    public /* synthetic */ EffectCategoryResponse(String str, String str2, String str3, String str4, String str5, Effect effect, Effect effect2, List list, List list2, String str6, List list3, boolean z, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : effect, (i & 64) != 0 ? null : effect2, (i & 128) != 0 ? new ArrayList() : list, (i & 256) != 0 ? new ArrayList() : list2, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? new ArrayList() : list3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str7 : null);
    }
}
