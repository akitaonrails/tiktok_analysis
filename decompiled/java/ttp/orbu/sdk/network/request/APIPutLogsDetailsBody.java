package ttp.orbu.sdk.network.request;

import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class APIPutLogsDetailsBody {
    public final List<APILogEntryBatch> logEntryBatches;
    public final String specversion;

    public final APIPutLogsDetailsBody copy(String str, List<APILogEntryBatch> list) {
        return new APIPutLogsDetailsBody(str, list);
    }

    public APIPutLogsDetailsBody(String str, List<APILogEntryBatch> list) {
        this.specversion = str;
        this.logEntryBatches = list;
    }
}
