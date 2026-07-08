package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EntryData {

    @C09CT("conditions")
    public Conditions conditions;

    @C09CT("entry_type")
    public long entryType;

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("bubble_condition")
    public List<BubbleCondition> bubbleCondition = new ArrayList();

    public static final class Conditions {

        @C09CT("block_gift_ids")
        public List<Long> blockGiftIds = new ArrayList();

        @C09CT("gift_price")
        public long giftPrice;
    }
}
