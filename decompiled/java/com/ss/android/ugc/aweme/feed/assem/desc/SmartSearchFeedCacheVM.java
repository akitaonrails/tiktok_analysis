package com.ss.android.ugc.aweme.feed.assem.desc;

import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.SmartSearchInfoStruct;
import com.ss.android.ugc.aweme.feed.model.search.VisualSearchInfoStruct;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class SmartSearchFeedCacheVM extends FeedBaseViewModel<InterfaceC0148002o> {
    public final ConcurrentHashMap<String, SmartSearchInfoStruct> LL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, VisualSearchInfoStruct> LLILLJJLI = new ConcurrentHashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0S7D
        };
    }

    public final SmartSearchInfoStruct vQ2(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        String aid = aweme.getAid();
        if (aid != null && this.LL.get(aid) != null) {
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                return null;
            }
            return this.LL.get(aid2);
        }
        SmartSearchInfoStruct smartSearchInfo = aweme.getSmartSearchInfo();
        if (smartSearchInfo != null) {
            String aid3 = aweme.getAid();
            if (aid3 == null) {
                return smartSearchInfo;
            }
            this.LL.put(aid3, smartSearchInfo);
            return smartSearchInfo;
        }
        String aid4 = aweme.getAid();
        if (aid4 == null) {
            return smartSearchInfo;
        }
        this.LL.put(aid4, new SmartSearchInfoStruct(0, 0, 0, 0, 0));
        return smartSearchInfo;
    }
}
