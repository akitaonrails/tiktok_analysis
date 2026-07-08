package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm;

import X.C09U0;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1949407kK;
import X.C2217381BqS;
import X.C329680CwA;
import X.C329910CwX;
import X.C329930CwZ;
import X.C357001a4;
import X.C651420Pgq;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchProsConsTabAssemViewModel extends AssemViewModel<C329680CwA> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public Function1<? super Integer, Unit> LL;
    public final SearchProsConsRepo LLILLJJLI;
    public volatile C09U0 LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchProsConsTabAssemViewModel.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return C329680CwA.LLJ.getValue();
    }

    public SearchProsConsTabAssemViewModel() {
        SearchProsConsRepo searchProsConsRepo;
        EventBus.LIZLLL().LJIJJ(this);
        SearchRootFragment searchRootFragmentLIZJ = C651420Pgq.LIZJ();
        this.LLILLJJLI = (searchRootFragmentLIZJ == null || (searchProsConsRepo = (SearchProsConsRepo) ((SearchProsConsRepo.RepoViewModel) ViewModelProviders.of(searchRootFragmentLIZJ).get(SearchProsConsRepo.RepoViewModel.class)).LL.getValue()) == null) ? new SearchProsConsRepo() : searchProsConsRepo;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        EventBus.LIZLLL().LJJI(this);
        super.onCleared();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.07kK, java.lang.Object] */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        final AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(this, 116);
        ?? r2 = new Object(awS583S0100000_4) { // from class: X.07kK
            public final Function1<C07YR, Unit> LIZ;

            {
                this.LIZ = awS583S0100000_4;
            }

            @C14EU
            public final void onVideoEvent(C737030Svd c737030Svd) {
                String str;
                Aweme aweme;
                String aid;
                int i = c737030Svd.LIZ;
                if (i != 13) {
                    if (i == 66) {
                        Object obj = c737030Svd.LIZIZ;
                        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (aid = aweme.getAid()) != null) {
                            this.LIZ.invoke(new C07YQ(aid));
                            return;
                        }
                        return;
                    }
                    return;
                }
                Object obj2 = c737030Svd.LIZIZ;
                if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                    return;
                }
                this.LIZ.invoke(new C07YP(str));
            }
        };
        EventBus.LIZLLL().LJIJJ(r2);
        C357001a4.LIZ(this, new AwS548S0100000_4((C1949407kK) r2, 429));
    }

    @C14EU
    public final void onReviewPanelTagClickedEvent(C329930CwZ c329930CwZ) {
        withState(new AwS370S0200000_4(this, c329930CwZ, 27));
    }

    public final Map vQ2(Aweme aweme, Map map) {
        Object objLJJJLL;
        UrlModel cover;
        List<String> urlList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("card_content_id", aweme.getAid());
        Video video = aweme.getVideo();
        if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || (objLJJJLL = C13LP.LJJJLL(urlList)) == null) {
            objLJJJLL = "";
        }
        linkedHashMap.put("card_extra_content", objLJJJLL);
        Iterator<C329910CwX> it2 = getState().LLILLL.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LLILLJJLI.getAid(), aweme.getAid())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        linkedHashMap.put("card_rank", String.valueOf(i));
        return linkedHashMap;
    }
}
