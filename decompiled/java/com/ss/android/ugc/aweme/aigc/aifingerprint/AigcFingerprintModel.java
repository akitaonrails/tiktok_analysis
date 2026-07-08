package com.ss.android.ugc.aweme.aigc.aifingerprint;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AigcFingerprintModel {
    public static final int $stable = 8;

    @C09CT("aigc_label_type")
    public final Integer aigcLabelType;

    @C09CT("aweme_id")
    public final String awemeID;

    @C09CT("c2pa_info")
    public final String c2paInfo;

    @C09CT("c2pa_meta_data")
    public final String c2paMetadata;

    @C09CT("fingerprint_id")
    public final String fingerprintID;

    @C09CT("former_fingerprint_id_list")
    public final List<String> formerFingerprintIDList;

    @C09CT("prompt_trace_id_list")
    public final List<String> promptTraceIDList;

    public AigcFingerprintModel() {
        this(null, null, 2, null, null, null, null);
    }

    public AigcFingerprintModel(String str, String str2, Integer num, String str3, String str4, List<String> list, List<String> list2) {
        this.fingerprintID = str;
        this.awemeID = str2;
        this.aigcLabelType = num;
        this.c2paInfo = str3;
        this.c2paMetadata = str4;
        this.promptTraceIDList = list;
        this.formerFingerprintIDList = list2;
    }
}
