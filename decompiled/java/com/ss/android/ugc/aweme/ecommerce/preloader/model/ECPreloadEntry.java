package com.ss.android.ugc.aweme.ecommerce.preloader.model;

import X.C09CT;
import com.google.gson.n;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ECPreloadEntry {

    @C09CT("api")
    public List<ECPreloadApiData> apiList;

    @C09CT("btm")
    public String btm;

    @C09CT("btm_v2")
    public List<String> btmV2;

    @C09CT("delay")
    public long delay;

    @C09CT("entry_id")
    public String entryId;

    @C09CT("event")
    public List<ECPreloadEventData> eventList;

    @C09CT("page_name")
    public String pageName;

    @C09CT("preload_param")
    public n preloadParam;

    @C09CT("type")
    public String type;

    public ECPreloadEntry() {
        this(null, null, null, null, null, 0L, null, null, null);
    }

    public final void LIZ() {
        List<ECPreloadApiData> list = this.apiList;
        if (list != null) {
            Iterator<ECPreloadApiData> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ = this.entryId;
            }
        }
        List<ECPreloadEventData> list2 = this.eventList;
        if (list2 != null) {
            Iterator<ECPreloadEventData> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ = this.entryId;
            }
        }
    }

    public ECPreloadEntry(String str, String str2, String str3, String str4, List<String> list, long j, List<ECPreloadApiData> list2, List<ECPreloadEventData> list3, n nVar) {
        this.entryId = str;
        this.type = str2;
        this.pageName = str3;
        this.btm = str4;
        this.btmV2 = list;
        this.delay = j;
        this.apiList = list2;
        this.eventList = list3;
        this.preloadParam = nVar;
    }
}
