package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.C09CT;
import X.C11NZ;
import X.C2188811AlT;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface MusicCopyrightApi {
    @InterfaceC1501200pAU("/tiktok/ugc_sound/check/")
    C11NZ<MusicCopyrightCheckResponse> LIZ(@InterfaceC1501120pAM("music_id") String str);

    public static final class MusicCopyrightCheckResponse extends BaseResponse {

        @C09CT("music_identification")
        public final Integer musicIdentification;

        public MusicCopyrightCheckResponse() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MusicCopyrightCheckResponse) && Intrinsics.LJFF(this.musicIdentification, ((MusicCopyrightCheckResponse) obj).musicIdentification);
        }

        public final int hashCode() {
            Integer num = this.musicIdentification;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusicCopyrightCheckResponse(musicIdentification=");
            sbLIZ.append(this.musicIdentification);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MusicCopyrightCheckResponse(Integer num) {
            this.musicIdentification = num;
        }
    }
}
