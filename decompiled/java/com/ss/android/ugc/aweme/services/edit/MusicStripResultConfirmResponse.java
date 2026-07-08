package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MusicStripResultConfirmResponse extends BaseResponse {

    @C09CT("data")
    public final MusicStripConfirmData data;

    public MusicStripResultConfirmResponse() {
        this(null);
    }

    public final MusicStripResultConfirmResponse copy(MusicStripConfirmData musicStripConfirmData) {
        return new MusicStripResultConfirmResponse(musicStripConfirmData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MusicStripResultConfirmResponse) && Intrinsics.LJFF(this.data, ((MusicStripResultConfirmResponse) obj).data);
    }

    public int hashCode() {
        MusicStripConfirmData musicStripConfirmData = this.data;
        if (musicStripConfirmData == null) {
            return 0;
        }
        return musicStripConfirmData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicStripResultConfirmResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MusicStripConfirmData getData() {
        return this.data;
    }

    public MusicStripResultConfirmResponse(MusicStripConfirmData musicStripConfirmData) {
        this.data = musicStripConfirmData;
    }
}
