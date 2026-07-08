package com.ss.android.ugc.gamora.editor.lyric.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LyricMiniDraftRespData {

    @C09CT("mini_draft_list")
    public List<LyricMiniDraftItemData> miniDraftList;

    public LyricMiniDraftRespData() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LyricMiniDraftRespData) && Intrinsics.LJFF(this.miniDraftList, ((LyricMiniDraftRespData) obj).miniDraftList);
    }

    public final int hashCode() {
        List<LyricMiniDraftItemData> list = this.miniDraftList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricMiniDraftRespData(miniDraftList=");
        sbLIZ.append(this.miniDraftList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyricMiniDraftRespData(List<LyricMiniDraftItemData> list) {
        this.miniDraftList = list;
    }

    public LyricMiniDraftRespData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
