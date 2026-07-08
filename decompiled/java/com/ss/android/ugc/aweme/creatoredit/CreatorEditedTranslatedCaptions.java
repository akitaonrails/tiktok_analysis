package com.ss.android.ugc.aweme.creatoredit;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreatorEditedTranslatedCaptions extends BaseResponse {

    @C09CT("subtitle_edit_infos")
    public final List<SubtitleEditInfo> subtitleEditInfos;

    public final CreatorEditedTranslatedCaptions copy(List<SubtitleEditInfo> list) {
        return new CreatorEditedTranslatedCaptions(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatorEditedTranslatedCaptions) && Intrinsics.LJFF(this.subtitleEditInfos, ((CreatorEditedTranslatedCaptions) obj).subtitleEditInfos);
    }

    public int hashCode() {
        List<SubtitleEditInfo> list = this.subtitleEditInfos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorEditedTranslatedCaptions(subtitleEditInfos=");
        sbLIZ.append(this.subtitleEditInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<SubtitleEditInfo> getSubtitleEditInfos() {
        return this.subtitleEditInfos;
    }

    public CreatorEditedTranslatedCaptions(List<SubtitleEditInfo> list) {
        this.subtitleEditInfos = list;
    }
}
