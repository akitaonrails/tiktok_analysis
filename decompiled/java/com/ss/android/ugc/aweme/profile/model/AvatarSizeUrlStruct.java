package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AvatarSizeUrlStruct implements Serializable {

    @C09CT("avatar_168x168")
    public UrlModel avatar168;

    @C09CT("avatar_300x300")
    public UrlModel avatar300;

    @C09CT("avatar_larger")
    public UrlModel avatarLarger;

    @C09CT("avatar_medium")
    public UrlModel avatarMedium;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    public AvatarSizeUrlStruct() {
        this(null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarSizeUrlStruct(avatarLarger=");
        sbLIZ.append(this.avatarLarger);
        sbLIZ.append(", avatarMedium=");
        sbLIZ.append(this.avatarMedium);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", avatar168=");
        sbLIZ.append(this.avatar168);
        sbLIZ.append(", avatar300=");
        sbLIZ.append(this.avatar300);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AvatarSizeUrlStruct(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5) {
        this.avatarLarger = urlModel;
        this.avatarMedium = urlModel2;
        this.avatarThumb = urlModel3;
        this.avatar168 = urlModel4;
        this.avatar300 = urlModel5;
    }
}
