package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.fans_platform.Ticket;

/* JADX INFO: loaded from: classes29.dex */
public final class TicketListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("tickets")
        public List<Ticket> tickets = new ArrayList();

        @C09CT("next_page_token")
        public String nextPageToken = "";
    }
}
