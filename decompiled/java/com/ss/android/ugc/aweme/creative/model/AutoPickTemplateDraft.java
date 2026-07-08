package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoPickTemplateDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoPickTemplateDraft implements Parcelable {
    public static final Parcelable.Creator<AutoPickTemplateDraft> CREATOR = new Parcelable.Creator<AutoPickTemplateDraft>() { // from class: X.0LAp
        @Override // android.os.Parcelable.Creator
        public final AutoPickTemplateDraft createFromParcel(Parcel parcel) {
            return new AutoPickTemplateDraft(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoPickTemplateDraft[] newArray(int i) {
            return new AutoPickTemplateDraft[i];
        }
    };

    @C09CT("autopick_template_cover_thumb")
    public final String coverThumb;

    @C09CT("autopick_template_music_id")
    public final String musicId;

    @C09CT("autopick_template_music_name")
    public final String musicName;

    @C09CT("autopick_template_nle_draft")
    public final String nleDraft;

    @C09CT("autopick_template_task_id")
    public final String taskId;

    @C09CT("autopick_template_title")
    public final String title;

    public final AutoPickTemplateDraft copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new AutoPickTemplateDraft(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoPickTemplateDraft)) {
            return false;
        }
        AutoPickTemplateDraft autoPickTemplateDraft = (AutoPickTemplateDraft) obj;
        return Intrinsics.LJFF(this.taskId, autoPickTemplateDraft.taskId) && Intrinsics.LJFF(this.musicId, autoPickTemplateDraft.musicId) && Intrinsics.LJFF(this.nleDraft, autoPickTemplateDraft.nleDraft) && Intrinsics.LJFF(this.coverThumb, autoPickTemplateDraft.coverThumb) && Intrinsics.LJFF(this.musicName, autoPickTemplateDraft.musicName) && Intrinsics.LJFF(this.title, autoPickTemplateDraft.title);
    }

    public int hashCode() {
        return (((((((((this.taskId.hashCode() * 31) + this.musicId.hashCode()) * 31) + this.nleDraft.hashCode()) * 31) + this.coverThumb.hashCode()) * 31) + this.musicName.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTemplateDraft(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", nleDraft=");
        sbLIZ.append(this.nleDraft);
        sbLIZ.append(", coverThumb=");
        sbLIZ.append(this.coverThumb);
        sbLIZ.append(", musicName=");
        sbLIZ.append(this.musicName);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskId);
        parcel.writeString(this.musicId);
        parcel.writeString(this.nleDraft);
        parcel.writeString(this.coverThumb);
        parcel.writeString(this.musicName);
        parcel.writeString(this.title);
    }

    public AutoPickTemplateDraft() {
        this("", "", "", "", "", "");
    }

    public final String getCoverThumb() {
        return this.coverThumb;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final String getNleDraft() {
        return this.nleDraft;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTitle() {
        return this.title;
    }

    public AutoPickTemplateDraft(String str, String str2, String str3, String str4, String str5, String str6) {
        this.taskId = str;
        this.musicId = str2;
        this.nleDraft = str3;
        this.coverThumb = str4;
        this.musicName = str5;
        this.title = str6;
    }
}
