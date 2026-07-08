package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.EnumC1412640mre;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutAnchorModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutAnchorModel> CREATOR = new Parcelable.Creator<AutoCutAnchorModel>() { // from class: X.0Kj6
        @Override // android.os.Parcelable.Creator
        public final AutoCutAnchorModel createFromParcel(Parcel parcel) {
            MusicBuzModel musicBuzModelCreateFromParcel;
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            MusicInfo musicInfo = (MusicInfo) parcel.readParcelable(AutoCutAnchorModel.class.getClassLoader());
            MusicInfo musicInfo2 = (MusicInfo) parcel.readParcelable(AutoCutAnchorModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                musicBuzModelCreateFromParcel = null;
            } else {
                musicBuzModelCreateFromParcel = MusicBuzModel.CREATOR.createFromParcel(parcel);
            }
            MusicBuzModel musicBuzModel = musicBuzModelCreateFromParcel;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AutoCutMediaModel.CREATOR.createFromParcel(parcel));
            }
            return new AutoCutAnchorModel(string, i, string2, musicInfo, musicInfo2, musicBuzModel, string3, string4, string5, string6, string7, string8, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutAnchorModel[] newArray(int i) {
            return new AutoCutAnchorModel[i];
        }
    };

    @C09CT("autocut_anchor_aweme_music_info")
    public final MusicInfo awemeMusicInfo;

    @C09CT("autocut_anchor_content")
    public final String content;

    @C09CT("autocut_anchor_extra")
    public final String extra;

    @C09CT("autocut_anchor_language")
    public final String language;

    @C09CT("autocut_anchor_media_list")
    public final List<AutoCutMediaModel> mediaList;

    @C09CT("autocut_anchor_music")
    public MusicBuzModel music;

    @C09CT("autocut_anchor_music_id")
    public final String musicId;

    @C040H
    public String nleData;

    @C09CT("autocut_recommend_nlemodel_data_path")
    @C0MY0
    public String nleDataPath;

    @C09CT("autocut_recommend_nlemodel_data_version")
    public int nleDataVersion;

    @C040H
    public final String templateGroupId;

    @C09CT("autocut_anchor_template_id")
    public final String templateId;

    @C09CT("autocut_anchor_template_music_info")
    public final MusicInfo templateMusicInfo;

    @C040H
    public final String templateTag;

    @C09CT("autocut_anchor_template_type_value")
    public final int templateTypeValue;

    @C040H
    public String templateZipPath;

    @C09CT("autocut_anchor_thumbnail_url")
    public final String thumbnailUrl;

    @C09CT("autocut_anchor_url")
    public final String url;

    public AutoCutAnchorModel() {
        this(null, EnumC1412640mre.CUT_SAME.getValue(), null, null, null, null, null, null, null, null, null, null, new ArrayList(), null, null, 0, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeInt(this.templateTypeValue);
        parcel.writeString(this.musicId);
        parcel.writeParcelable(this.awemeMusicInfo, i);
        parcel.writeParcelable(this.templateMusicInfo, i);
        MusicBuzModel musicBuzModel = this.music;
        if (musicBuzModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicBuzModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.language);
        parcel.writeString(this.extra);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.content);
        parcel.writeString(this.templateZipPath);
        List<AutoCutMediaModel> list = this.mediaList;
        parcel.writeInt(list.size());
        Iterator<AutoCutMediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.nleData);
        parcel.writeString(this.nleDataPath);
        parcel.writeInt(this.nleDataVersion);
        parcel.writeString(this.templateGroupId);
        parcel.writeString(this.templateTag);
    }

    public AutoCutAnchorModel(String str, int i, String str2, MusicInfo musicInfo, MusicInfo musicInfo2, MusicBuzModel musicBuzModel, String str3, String str4, String str5, String str6, String str7, String str8, List<AutoCutMediaModel> list, String str9, String str10, int i2, String str11, String str12) {
        this.templateId = str;
        this.templateTypeValue = i;
        this.musicId = str2;
        this.awemeMusicInfo = musicInfo;
        this.templateMusicInfo = musicInfo2;
        this.music = musicBuzModel;
        this.url = str3;
        this.language = str4;
        this.extra = str5;
        this.thumbnailUrl = str6;
        this.content = str7;
        this.templateZipPath = str8;
        this.mediaList = list;
        this.nleData = str9;
        this.nleDataPath = str10;
        this.nleDataVersion = i2;
        this.templateGroupId = str11;
        this.templateTag = str12;
    }
}
