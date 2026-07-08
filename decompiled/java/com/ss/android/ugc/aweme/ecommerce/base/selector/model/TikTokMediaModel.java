package com.ss.android.ugc.aweme.ecommerce.base.selector.model;

import X.C2188811AlT;
import X.C2402409bC;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: loaded from: classes4.dex */
public final class TikTokMediaModel extends MediaModel {
    public final String id;
    public int mediaIndex;
    public int originIndex;
    public int selectIndex;
    public static final C2402409bC Companion = new Object() { // from class: X.09bC
    };
    public static final int $stable = 8;

    public final String LJIILLIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.id);
        sbLIZ.append(this.selectIndex);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final int hashCode() {
        return LJIILLIIL().hashCode();
    }

    public TikTokMediaModel(String str) {
        super(str);
        this.id = str;
        this.originIndex = -1;
        this.selectIndex = -1;
        this.mediaIndex = -1;
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TikTokMediaModel)) {
            return false;
        }
        return TextUtils.equals(LJIILLIIL(), ((TikTokMediaModel) obj).LJIILLIIL());
    }
}
