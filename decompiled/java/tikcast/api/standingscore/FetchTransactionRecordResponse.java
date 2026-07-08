package tikcast.api.standingscore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FetchTransactionRecordResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("total_num")
        public long totalNum;

        @C09CT("transaction_record_list")
        public List<TransactionRecord> transactionRecordList = new ArrayList();
    }
}
