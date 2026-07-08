package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.AbstractC1442160ndG;
import X.C040H;
import X.C098200Yq;
import X.C09CT;
import X.C0EP9;
import X.C0FKI;
import X.C1440500naa;
import X.C189200o6;
import X.C1946707jt;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricFailbackFont;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InitialTrimInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class LyricStickerModel implements Parcelable, StickerModel {

    @C09CT("base_sticker_model")
    public BaseStickerModel baseStickerModel;

    @C09CT("clip_end")
    public long clipEnd;

    @C09CT("clip_start")
    public long clipStart;

    @C040H
    public Boolean enabled;

    @C09CT("lyric_fallback_fonts")
    public List<LyricFailbackFont> fallbackFonts;

    @C09CT("initial_trim_info")
    public InitialTrimInfo initialTrimInfo;

    @C09CT("lyric_id")
    public String lyricId;

    @C09CT("lyric_style_effect_id")
    public String lyricStyleEffectId;

    @C09CT("lyric_style_urs")
    public String lyricStyleUrs;

    @C09CT("music_id")
    public String musicId;

    @C09CT("music_name")
    public String musicName;

    @C09CT("recommend_height")
    public Integer recommendHeight;

    @C09CT("recommend_width")
    public Integer recommendWidth;

    @C09CT("selected_from")
    public String selectedFrom;

    @C09CT("text_stickers")
    public final List<TextStickerModel> textStickerModels;

    @C09CT("uuid")
    public String uuid;
    public static final C0EP9 Companion = new Object() { // from class: X.0EP9
    };
    public static final Parcelable.Creator<LyricStickerModel> CREATOR = new Parcelable.Creator<LyricStickerModel>() { // from class: X.0EKT
        @Override // android.os.Parcelable.Creator
        public final LyricStickerModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            InitialTrimInfo initialTrimInfoCreateFromParcel;
            ArrayList arrayList;
            Boolean boolValueOf;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                initialTrimInfoCreateFromParcel = null;
            } else {
                initialTrimInfoCreateFromParcel = InitialTrimInfo.CREATOR.createFromParcel(parcel);
            }
            InitialTrimInfo initialTrimInfo = initialTrimInfoCreateFromParcel;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            boolean z = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(TextStickerModel.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(LyricFailbackFont.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new LyricStickerModel(baseStickerModelCreateFromParcel, string, j, j2, string2, string3, string4, string5, string6, string7, numValueOf, numValueOf2, initialTrimInfo, arrayList2, arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final LyricStickerModel[] newArray(int i) {
            return new LyricStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public LyricStickerModel() {
        this(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), null, 0L, 0L, null, null, null, null, null, null, null, null, null, new ArrayList(), null, null);
    }

    public final LyricStickerModel copy(BaseStickerModel baseStickerModel, String str, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, InitialTrimInfo initialTrimInfo, List<TextStickerModel> list, List<LyricFailbackFont> list2, Boolean bool) {
        return new LyricStickerModel(baseStickerModel, str, j, j2, str2, str3, str4, str5, str6, str7, num, num2, initialTrimInfo, list, list2, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricStickerModel)) {
            return false;
        }
        LyricStickerModel lyricStickerModel = (LyricStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, lyricStickerModel.baseStickerModel) && Intrinsics.LJFF(this.uuid, lyricStickerModel.uuid) && this.clipStart == lyricStickerModel.clipStart && this.clipEnd == lyricStickerModel.clipEnd && Intrinsics.LJFF(this.musicId, lyricStickerModel.musicId) && Intrinsics.LJFF(this.lyricId, lyricStickerModel.lyricId) && Intrinsics.LJFF(this.musicName, lyricStickerModel.musicName) && Intrinsics.LJFF(this.lyricStyleUrs, lyricStickerModel.lyricStyleUrs) && Intrinsics.LJFF(this.selectedFrom, lyricStickerModel.selectedFrom) && Intrinsics.LJFF(this.lyricStyleEffectId, lyricStickerModel.lyricStyleEffectId) && Intrinsics.LJFF(this.recommendWidth, lyricStickerModel.recommendWidth) && Intrinsics.LJFF(this.recommendHeight, lyricStickerModel.recommendHeight) && Intrinsics.LJFF(this.initialTrimInfo, lyricStickerModel.initialTrimInfo) && Intrinsics.LJFF(this.textStickerModels, lyricStickerModel.textStickerModels) && Intrinsics.LJFF(this.fallbackFonts, lyricStickerModel.fallbackFonts) && Intrinsics.LJFF(this.enabled, lyricStickerModel.enabled);
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        String str = this.uuid;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.clipStart)) * 31) + C786410Ut5.Y2(this.clipEnd)) * 31;
        String str2 = this.musicId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lyricId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.musicName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lyricStyleUrs;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.selectedFrom;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lyricStyleEffectId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.recommendWidth;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.recommendHeight;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        InitialTrimInfo initialTrimInfo = this.initialTrimInfo;
        int iHashCode11 = (((iHashCode10 + (initialTrimInfo == null ? 0 : initialTrimInfo.hashCode())) * 31) + this.textStickerModels.hashCode()) * 31;
        List<LyricFailbackFont> list = this.fallbackFonts;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.enabled;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return null;
    }

    public String toString() {
        return "LyricStickerModel(baseStickerModel=" + this.baseStickerModel + ", uuid=" + this.uuid + ", clipStart=" + this.clipStart + ", clipEnd=" + this.clipEnd + ", musicId=" + this.musicId + ", lyricId=" + this.lyricId + ", musicName=" + this.musicName + ", lyricStyleUrs=" + this.lyricStyleUrs + ", selectedFrom=" + this.selectedFrom + ", lyricStyleEffectId=" + this.lyricStyleEffectId + ", recommendWidth=" + this.recommendWidth + ", recommendHeight=" + this.recommendHeight + ", initialTrimInfo=" + this.initialTrimInfo + ", textStickerModels=" + this.textStickerModels + ", fallbackFonts=" + this.fallbackFonts + ", enabled=" + this.enabled + ')';
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        parcel.writeString(this.uuid);
        parcel.writeLong(this.clipStart);
        parcel.writeLong(this.clipEnd);
        parcel.writeString(this.musicId);
        parcel.writeString(this.lyricId);
        parcel.writeString(this.musicName);
        parcel.writeString(this.lyricStyleUrs);
        parcel.writeString(this.selectedFrom);
        parcel.writeString(this.lyricStyleEffectId);
        Integer num = this.recommendWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.recommendHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        InitialTrimInfo initialTrimInfo = this.initialTrimInfo;
        if (initialTrimInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            initialTrimInfo.writeToParcel(parcel, i);
        }
        List<TextStickerModel> list = this.textStickerModels;
        parcel.writeInt(list.size());
        Iterator<TextStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<LyricFailbackFont> list2 = this.fallbackFonts;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<LyricFailbackFont> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setLyricStickerStruct(new LyricStickerStruct(this.musicId, null));
        return interactStickerStruct;
    }

    public final long getRealClipEnd() {
        return (this.clipEnd - this.clipStart) + getRealClipStart();
    }

    public final long getRealClipStart() {
        long j = this.clipStart;
        InitialTrimInfo initialTrimInfo = this.initialTrimInfo;
        return j + (initialTrimInfo != null ? initialTrimInfo.getInTime() : 0L);
    }

    public final String getResourceId() {
        Object c098200Yq;
        String str = this.lyricStyleUrs;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return null;
        }
        try {
            c098200Yq = C1946707jt.LIZ(UriProtector.parse(str), "resource_id");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str2 = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return str2 == null ? "" : str2;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return !this.textStickerModels.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final long getClipEnd() {
        return this.clipEnd;
    }

    public final long getClipStart() {
        return this.clipStart;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final List<LyricFailbackFont> getFallbackFonts() {
        return this.fallbackFonts;
    }

    public final InitialTrimInfo getInitialTrimInfo() {
        return this.initialTrimInfo;
    }

    public final String getLyricId() {
        return this.lyricId;
    }

    public final String getLyricStyleEffectId() {
        return this.lyricStyleEffectId;
    }

    public final String getLyricStyleUrs() {
        return this.lyricStyleUrs;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final Integer getRecommendHeight() {
        return this.recommendHeight;
    }

    public final Integer getRecommendWidth() {
        return this.recommendWidth;
    }

    public final String getSelectedFrom() {
        return this.selectedFrom;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.LYRIC_STICKER;
    }

    public final List<TextStickerModel> getTextStickerModels() {
        return this.textStickerModels;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setBaseStickerModel(BaseStickerModel baseStickerModel) {
        this.baseStickerModel = baseStickerModel;
    }

    public final void setClipEnd(long j) {
        this.clipEnd = j;
    }

    public final void setClipStart(long j) {
        this.clipStart = j;
    }

    public final void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public final void setFallbackFonts(List<LyricFailbackFont> list) {
        this.fallbackFonts = list;
    }

    public final void setInitialTrimInfo(InitialTrimInfo initialTrimInfo) {
        this.initialTrimInfo = initialTrimInfo;
    }

    public final void setLyricId(String str) {
        this.lyricId = str;
    }

    public final void setLyricStyleEffectId(String str) {
        this.lyricStyleEffectId = str;
    }

    public final void setLyricStyleUrs(String str) {
        this.lyricStyleUrs = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicName(String str) {
        this.musicName = str;
    }

    public final void setRecommendHeight(Integer num) {
        this.recommendHeight = num;
    }

    public final void setRecommendWidth(Integer num) {
        this.recommendWidth = num;
    }

    public final void setSelectedFrom(String str) {
        this.selectedFrom = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public LyricStickerModel(BaseStickerModel baseStickerModel, String str, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, InitialTrimInfo initialTrimInfo, List<TextStickerModel> list, List<LyricFailbackFont> list2, Boolean bool) {
        this.baseStickerModel = baseStickerModel;
        this.uuid = str;
        this.clipStart = j;
        this.clipEnd = j2;
        this.musicId = str2;
        this.lyricId = str3;
        this.musicName = str4;
        this.lyricStyleUrs = str5;
        this.selectedFrom = str6;
        this.lyricStyleEffectId = str7;
        this.recommendWidth = num;
        this.recommendHeight = num2;
        this.initialTrimInfo = initialTrimInfo;
        this.textStickerModels = list;
        this.fallbackFonts = list2;
        this.enabled = bool;
    }
}
