package com.ss.android.ugc.aweme.creatortools.videogift;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VideoGiftEligibilityResponse extends BaseResponse {

    @C09CT("image")
    public final Image image;

    @C09CT("requirements")
    public final List<Requirement> requirements;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGiftEligibilityResponse)) {
            return false;
        }
        VideoGiftEligibilityResponse videoGiftEligibilityResponse = (VideoGiftEligibilityResponse) obj;
        return Intrinsics.LJFF(this.image, videoGiftEligibilityResponse.image) && Intrinsics.LJFF(this.requirements, videoGiftEligibilityResponse.requirements);
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        List<Requirement> list = this.requirements;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoGiftEligibilityResponse(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", requirements=");
        sbLIZ.append(this.requirements);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoGiftEligibilityResponse(Image image, List<Requirement> list) {
        this.image = image;
        this.requirements = list;
    }
}
