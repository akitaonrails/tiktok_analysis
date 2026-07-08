package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveInformationLivingResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_living")
        public boolean isLiving;

        @C09CT("room_id")
        public long roomId;
    }
}
