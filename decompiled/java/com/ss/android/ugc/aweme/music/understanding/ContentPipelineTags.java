package com.ss.android.ugc.aweme.music.understanding;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentPipelineTags {
    public static final ContentPipelineTags INSTANCE = new ContentPipelineTags();
    public static final String NODE_COMPRESS;
    public static final String NODE_LOCAL_EMB_SCAN;
    public static final String NODE_LOCAL_EMB_UNDERSTAND;
    public static final String NODE_REQUEST;
    public static final String NODE_WAIT_EXTRACT;
    public static final String NODE_ZIP;

    static {
        NodeTag.m283constructorimpl("compress");
        NODE_COMPRESS = "compress";
        NodeTag.m283constructorimpl("zip");
        NODE_ZIP = "zip";
        NodeTag.m283constructorimpl("request");
        NODE_REQUEST = "request";
        NodeTag.m283constructorimpl("wait_extract");
        NODE_WAIT_EXTRACT = "wait_extract";
        NodeTag.m283constructorimpl("local_emb_scan");
        NODE_LOCAL_EMB_SCAN = "local_emb_scan";
        NodeTag.m283constructorimpl("local_emb_understand");
        NODE_LOCAL_EMB_UNDERSTAND = "local_emb_understand";
    }

    /* JADX INFO: renamed from: getNODE_COMPRESS-q0GeycQ, reason: not valid java name */
    public final String m273getNODE_COMPRESSq0GeycQ() {
        return NODE_COMPRESS;
    }

    /* JADX INFO: renamed from: getNODE_LOCAL_EMB_SCAN-q0GeycQ, reason: not valid java name */
    public final String m274getNODE_LOCAL_EMB_SCANq0GeycQ() {
        return NODE_LOCAL_EMB_SCAN;
    }

    /* JADX INFO: renamed from: getNODE_LOCAL_EMB_UNDERSTAND-q0GeycQ, reason: not valid java name */
    public final String m275getNODE_LOCAL_EMB_UNDERSTANDq0GeycQ() {
        return NODE_LOCAL_EMB_UNDERSTAND;
    }

    /* JADX INFO: renamed from: getNODE_REQUEST-q0GeycQ, reason: not valid java name */
    public final String m276getNODE_REQUESTq0GeycQ() {
        return NODE_REQUEST;
    }

    /* JADX INFO: renamed from: getNODE_WAIT_EXTRACT-q0GeycQ, reason: not valid java name */
    public final String m277getNODE_WAIT_EXTRACTq0GeycQ() {
        return NODE_WAIT_EXTRACT;
    }

    /* JADX INFO: renamed from: getNODE_ZIP-q0GeycQ, reason: not valid java name */
    public final String m278getNODE_ZIPq0GeycQ() {
        return NODE_ZIP;
    }
}
