package webcast.api.activity_advertising;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LSPackDataResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("cards")
        public List<CardInfo> cards = new ArrayList();
    }
}
