package com.ss.android.ugc.aweme.creatoredit;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreatorCaptionEditTranslatedModel extends BaseResponse {

    @C09CT("subtitle_edit_info")
    public final SubtitleEditInfo subtitleEditInfo;

    public final CreatorCaptionEditTranslatedModel copy(SubtitleEditInfo subtitleEditInfo) {
        return new CreatorCaptionEditTranslatedModel(subtitleEditInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatorCaptionEditTranslatedModel) && Intrinsics.LJFF(this.subtitleEditInfo, ((CreatorCaptionEditTranslatedModel) obj).subtitleEditInfo);
    }

    public int hashCode() {
        SubtitleEditInfo subtitleEditInfo = this.subtitleEditInfo;
        if (subtitleEditInfo == null) {
            return 0;
        }
        return subtitleEditInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorCaptionEditTranslatedModel(subtitleEditInfo=");
        sbLIZ.append(this.subtitleEditInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SubtitleEditInfo getSubtitleEditInfo() {
        return this.subtitleEditInfo;
    }

    public CreatorCaptionEditTranslatedModel(SubtitleEditInfo subtitleEditInfo) {
        this.subtitleEditInfo = subtitleEditInfo;
    }
}
