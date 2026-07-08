package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ChangeAvatarModel implements Parcelable {
    public static final Parcelable.Creator<ChangeAvatarModel> CREATOR = new Parcelable.Creator<ChangeAvatarModel>() { // from class: X.0nfY
        @Override // android.os.Parcelable.Creator
        public final ChangeAvatarModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            String string3 = parcel.readString();
            AvatarUpdateInfoStruct avatarUpdateInfoStructCreateFromParcel = AvatarUpdateInfoStruct.CREATOR.createFromParcel(parcel);
            SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStructCreateFromParcel = SocialAvatarUpdateInfoStruct.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            return new ChangeAvatarModel(z, z2, z3, string, string2, z4, z5, string3, avatarUpdateInfoStructCreateFromParcel, socialAvatarUpdateInfoStructCreateFromParcel, string4, string5, arrayListCreateStringArrayList, string6, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final ChangeAvatarModel[] newArray(int i) {
            return new ChangeAvatarModel[i];
        }
    };

    @C09CT("ai_vatar_mode")
    public String aiVatarMode;

    @C09CT("origin_avatar")
    public AvatarUpdateInfoStruct avatarStruct;

    @C09CT("avatar_cover_path")
    @C0MY0
    public String coverPath;

    @C09CT("first_enter_edit")
    public boolean firstEnterEdit;

    @C09CT("is_from_ai_vatar")
    public boolean isFromAiVatar;

    @C09CT("is_change_avatar")
    public boolean isFromChangeAvatar;

    @C09CT("is_from_social_avatar")
    public boolean isFromSocialAvatar;

    @C040H
    public boolean isSingletonRecover;

    @C09CT("new_avatar_url")
    public String newAvatarUrl;

    @C09CT("origin_path")
    @C0MY0
    public String originPath;

    @C040H
    public String publishEnterMethod;

    @C09CT("realEnterMethod")
    public String realEnterMethod;

    @C040H
    public boolean skipDecorativeInfoStickers;

    @C09CT("social_avatar_info")
    public SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct;

    @C040H
    public List<String> stickerIds;

    public ChangeAvatarModel() {
        this(false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, 32767, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFromChangeAvatar ? 1 : 0);
        parcel.writeInt(this.isFromAiVatar ? 1 : 0);
        parcel.writeInt(this.isFromSocialAvatar ? 1 : 0);
        parcel.writeString(this.aiVatarMode);
        parcel.writeString(this.realEnterMethod);
        parcel.writeInt(this.isSingletonRecover ? 1 : 0);
        parcel.writeInt(this.firstEnterEdit ? 1 : 0);
        parcel.writeString(this.originPath);
        this.avatarStruct.writeToParcel(parcel, i);
        this.socialAvatarUpdateInfoStruct.writeToParcel(parcel, i);
        parcel.writeString(this.newAvatarUrl);
        parcel.writeString(this.coverPath);
        parcel.writeStringList(this.stickerIds);
        parcel.writeString(this.publishEnterMethod);
        parcel.writeInt(this.skipDecorativeInfoStickers ? 1 : 0);
    }

    public ChangeAvatarModel(boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, String str3, AvatarUpdateInfoStruct avatarUpdateInfoStruct, SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct, String str4, String str5, List<String> list, String str6, boolean z6) {
        this.isFromChangeAvatar = z;
        this.isFromAiVatar = z2;
        this.isFromSocialAvatar = z3;
        this.aiVatarMode = str;
        this.realEnterMethod = str2;
        this.isSingletonRecover = z4;
        this.firstEnterEdit = z5;
        this.originPath = str3;
        this.avatarStruct = avatarUpdateInfoStruct;
        this.socialAvatarUpdateInfoStruct = socialAvatarUpdateInfoStruct;
        this.newAvatarUrl = str4;
        this.coverPath = str5;
        this.stickerIds = list;
        this.publishEnterMethod = str6;
        this.skipDecorativeInfoStickers = z6;
    }

    public ChangeAvatarModel(boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, String str3, AvatarUpdateInfoStruct avatarUpdateInfoStruct, SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct, String str4, String str5, List list, String str6, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? true : z5, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? new AvatarUpdateInfoStruct("", "") : avatarUpdateInfoStruct, (i & 512) != 0 ? new SocialAvatarUpdateInfoStruct(null, null, null, null, null, null, null, null, null, null, null, null, -1L, null, null) : socialAvatarUpdateInfoStruct, (i & 1024) != 0 ? "" : str4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str5 : "", (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list, (i & 8192) == 0 ? str6 : null, (i & 16384) != 0 ? false : z6);
    }
}
