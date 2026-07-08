package com.ss.android.ugc.aweme.search.common.model;

import X.C09CT;
import X.InterfaceC653500PkC;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ContinuousLoadingAwemeList implements InterfaceC653500PkC<ContinuousLoadingAwemeList> {

    @C09CT("items")
    public List<Aweme> awemeList;

    @C09CT("cursor")
    public int cursor;

    @C09CT("extra")
    public Extra extra;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("status_code")
    public int statusCode;

    @Override // X.InterfaceC653500PkC
    public final void LIZJ() {
        this.hasMore = 0;
    }

    @Override // X.InterfaceC653500PkC
    public final int LIZIZ() {
        return this.hasMore;
    }

    @Override // X.InterfaceC653500PkC
    public final List<Aweme> LIZLLL() {
        return this.awemeList;
    }

    @Override // X.InterfaceC653500PkC
    public final void LIZ(InterfaceC653500PkC interfaceC653500PkC) {
        ContinuousLoadingAwemeList continuousLoadingAwemeList = (ContinuousLoadingAwemeList) interfaceC653500PkC;
        this.hasMore &= continuousLoadingAwemeList.hasMore;
        this.cursor = continuousLoadingAwemeList.cursor;
        this.statusCode = continuousLoadingAwemeList.statusCode;
        this.extra = continuousLoadingAwemeList.extra;
        this.logPb = continuousLoadingAwemeList.logPb;
    }
}
