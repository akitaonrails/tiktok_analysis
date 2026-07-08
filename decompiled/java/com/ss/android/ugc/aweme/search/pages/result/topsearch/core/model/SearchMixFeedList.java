package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C0PQA;
import X.InterfaceC1515800pY2;
import X.InterfaceC2337209Du;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PatchConfig;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderInfo;
import com.ss.android.ugc.aweme.search.performance.core.model.CardStreamInfo;
import com.ss.android.ugc.aweme.search.performance.core.model.PreloadImg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class SearchMixFeedList extends SearchApiResult implements InterfaceC2337209Du, InterfaceC1515800pY2, Cloneable {
    public transient JSONObject LL;
    public String LLILLJJLI;
    public transient C0PQA LLILLL;
    public EntityCardTitle LLILZ;
    public SearchMixFeed LLILZIL;
    public Boolean LLILZLL;
    public Boolean LLIZ;
    public transient boolean LLIZLLLIL;
    public transient int LLJ;
    public transient int LLJI;
    public transient boolean LLJIJIL;
    public volatile transient boolean LLJILJIL;
    public transient Boolean LLJILJILJ;
    public transient Boolean LLJILLL;
    public transient Boolean LLJJ;
    public transient Boolean LLJJI;
    public transient boolean LLJJIII;

    @C09CT("cards_info")
    public List<CardStreamInfo> cardStreamInfos;

    @C09CT("content_rel_scores")
    public List<Map<String, List<Double>>> contentRelScores;

    @C09CT("cursor")
    public int cursor;

    @C09CT("display")
    public boolean display;

    @C09CT("engine_sort_scores")
    public List<Double> engineSortScores;

    @C09CT("first_screen")
    public boolean firstScreen;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("backtrace")
    public String mBacktrace;

    @C09CT("data")
    public List<SearchMixFeed> mItems;

    @C09CT("patch_config")
    public PatchConfig patchConfig;

    @C09CT("patch_v2")
    public List<ChunkPatch> patchs;

    @C09CT("pre_render")
    public PreRenderInfo preRenderInfo;

    @C09CT("preload_img")
    public PreloadImg preloadImg;

    @C09CT("reason")
    public String reason;

    @C09CT("result_status")
    public int resultStatus;

    @C09CT("result_type")
    public int resultType;

    @C09CT("top_bars")
    public List<SearchTopBarStruct> topBars;

    @C09CT("card_flush")
    public boolean cardFlush = true;

    @C09CT("ack")
    public int ack = -2;

    @C09CT("data_scope")
    public int dataScope = -2;

    @C09CT("card_index")
    public int cardIndex = -1;

    public SearchMixFeedList() {
        Boolean bool = Boolean.FALSE;
        this.LLILZLL = bool;
        this.LLIZ = bool;
        this.LLIZLLLIL = false;
        this.LLJ = 0;
        this.LLJI = -1;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = bool;
        this.LLJILLL = bool;
        this.LLJJ = bool;
        this.LLJJI = bool;
        this.LLJJIII = false;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1515800pY2
    public final void LIZIZ(C0PQA c0pqa) {
        this.LLILLL = c0pqa;
    }

    @Override // X.InterfaceC2337209Du
    public final void setJsonData(String str) {
        this.LLILLJJLI = str;
        if (this.LL == null) {
            try {
                this.LL = new JSONObject(str).optJSONObject("extra");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.model.SearchApiResult, X.C0X12
    public final void setRequestId(String str) {
        super.setRequestId(str);
        List<SearchMixFeed> list = this.mItems;
        if (list != null) {
            Iterator<SearchMixFeed> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setRequestId(str);
            }
        }
    }
}
