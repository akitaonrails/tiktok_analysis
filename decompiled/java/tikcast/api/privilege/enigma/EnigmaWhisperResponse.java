package tikcast.api.privilege.enigma;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class EnigmaWhisperResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("msg_id")
        public String msgId = "";

        @C09CT("next_send_at")
        public long nextSendAt;
    }
}
