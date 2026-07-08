package tikcast.api.fans;

import X.C09CT;
import webcast.data.SlotFansRecord;

/* JADX INFO: loaded from: classes29.dex */
public final class GetFansDataResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("slot_fans_record")
        public SlotFansRecord slotFansRecord;
    }
}
