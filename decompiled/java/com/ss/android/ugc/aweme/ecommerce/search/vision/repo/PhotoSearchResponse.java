package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import X.C676340Qfw;
import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchResponse {
    public PhotoSearchImageResponse LIZ;
    public LogPbBean LIZIZ;
    public String LIZJ;
    public PhotoSearchServerPerfInfo LIZLLL;
    public final C676340Qfw LJ;
    public boolean LJFF;
    public GlobalDoodleConfig LJI;
    public final Extra LJII;

    @C09CT("searchResData")
    public n photoSearchResponse;

    @C09CT("techLogParams")
    public RDPhotoSearchTraceTime techLogParams;

    public PhotoSearchResponse() {
        this(null, null, null, null, null, null, null, false, null, null);
    }

    public PhotoSearchResponse(n nVar, PhotoSearchImageResponse photoSearchImageResponse, RDPhotoSearchTraceTime rDPhotoSearchTraceTime, LogPbBean logPbBean, String str, PhotoSearchServerPerfInfo photoSearchServerPerfInfo, C676340Qfw c676340Qfw, boolean z, GlobalDoodleConfig globalDoodleConfig, Extra extra) {
        this.photoSearchResponse = nVar;
        this.LIZ = photoSearchImageResponse;
        this.techLogParams = rDPhotoSearchTraceTime;
        this.LIZIZ = logPbBean;
        this.LIZJ = str;
        this.LIZLLL = photoSearchServerPerfInfo;
        this.LJ = c676340Qfw;
        this.LJFF = z;
        this.LJI = globalDoodleConfig;
        this.LJII = extra;
    }
}
