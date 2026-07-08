package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C688190Qz3;
import X.EnumC688390QzN;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoSearchCacheVM extends FeedBaseViewModel<InterfaceC0148002o> {
    public final ConcurrentHashMap<String, C688190Qz3> LL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> LLILLJJLI = new ConcurrentHashMap<>();
    public final HashMap<String, EnumC688390QzN> LLILLL = new HashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0QzZ
        };
    }

    public final C688190Qz3 vQ2(String str) {
        if (str == null) {
            return null;
        }
        return this.LL.get(str);
    }

    public final int wQ2(String str) {
        Integer num;
        if (str == null || (num = this.LLILLJJLI.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void xQ2(String str, C688190Qz3 c688190Qz3) {
        this.LL.put(str, c688190Qz3);
    }
}
