package com.ss.android.ugc.gamora.editor.lyric.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LyricMiniDraftItemData {

    @C09CT("lyric_id")
    public final String lyricId;

    @C09CT("mini_draft")
    public final String miniDraft;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("effect_panel")
    public final String panelKey;

    @C09CT("effect_resource_id")
    public final String resourceId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricMiniDraftItemData)) {
            return false;
        }
        LyricMiniDraftItemData lyricMiniDraftItemData = (LyricMiniDraftItemData) obj;
        return Intrinsics.LJFF(this.musicId, lyricMiniDraftItemData.musicId) && Intrinsics.LJFF(this.lyricId, lyricMiniDraftItemData.lyricId) && Intrinsics.LJFF(this.resourceId, lyricMiniDraftItemData.resourceId) && Intrinsics.LJFF(this.panelKey, lyricMiniDraftItemData.panelKey) && Intrinsics.LJFF(this.miniDraft, lyricMiniDraftItemData.miniDraft);
    }

    public final int hashCode() {
        String str = this.musicId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lyricId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resourceId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.panelKey;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.miniDraft;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricMiniDraftItemData(musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", lyricId=");
        sbLIZ.append(this.lyricId);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", panelKey=");
        sbLIZ.append(this.panelKey);
        sbLIZ.append(", miniDraft=");
        sbLIZ.append(this.miniDraft);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyricMiniDraftItemData(String str, String str2, String str3, String str4, String str5) {
        this.musicId = str;
        this.lyricId = str2;
        this.resourceId = str3;
        this.panelKey = str4;
        this.miniDraft = str5;
    }
}
