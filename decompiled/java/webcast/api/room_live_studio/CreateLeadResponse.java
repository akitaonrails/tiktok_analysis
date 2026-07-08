package webcast.api.room_live_studio;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CreateLeadResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("created")
        public boolean created;

        @C09CT("lead_id")
        public long leadId;
    }
}
