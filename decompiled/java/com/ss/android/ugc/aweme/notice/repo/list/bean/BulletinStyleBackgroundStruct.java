package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinStyleBackgroundStruct {

    @C09CT("background_source")
    public final BulletinGeckoResourceModel backgroundResourceModel;

    public BulletinStyleBackgroundStruct() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BulletinStyleBackgroundStruct) && Intrinsics.LJFF(this.backgroundResourceModel, ((BulletinStyleBackgroundStruct) obj).backgroundResourceModel);
    }

    public final int hashCode() {
        BulletinGeckoResourceModel bulletinGeckoResourceModel = this.backgroundResourceModel;
        if (bulletinGeckoResourceModel == null) {
            return 0;
        }
        return bulletinGeckoResourceModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinStyleBackgroundStruct(backgroundResourceModel=");
        sbLIZ.append(this.backgroundResourceModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinStyleBackgroundStruct(BulletinGeckoResourceModel bulletinGeckoResourceModel) {
        this.backgroundResourceModel = bulletinGeckoResourceModel;
    }
}
