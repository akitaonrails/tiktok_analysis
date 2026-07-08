package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.C0AAD;
import X.C0QOD;
import X.C12869051v;
import X.C133900fB;
import X.C1422405hW;
import X.C1C7U;
import X.C490901vf;
import X.C675150Qe1;
import X.C675970QfL;
import X.C676390Qg1;
import X.C676790Qgf;
import X.C677480Qhm;
import X.C678510QjR;
import X.C679540Ql6;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC676230Qfl;
import X.InterfaceC0148002o;
import X.InterfaceC676660QgS;
import X.RunnableC678870Qk1;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class MixShopSearchBizVM extends AssemViewModel<C490901vf> {
    public final C677480Qhm LL;
    public final ConcurrentHashMap<String, C679540Ql6> LLILLJJLI;
    public Object LLILLL;
    public C675150Qe1 LLILZ;
    public final Map<String, Object> LLILZIL;
    public String LLILZLL;
    public final NextLiveData<LogPbBean> LLIZ;
    public final NextLiveData<n> LLIZLLLIL;
    public final NextLiveData<LogPbBean> LLJ;
    public final NextLiveData<n> LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final NextLiveData<C0QOD> LLJILJILJ;
    public final NextLiveData<Boolean> LLJILLL;
    public final NextLiveData<C675970QfL> LLJJ;
    public final NextLiveData<C1422405hW> LLJJI;
    public final NextLiveData<C676790Qgf> LLJJIII;
    public final NextLiveData<String> LLJJIJI;
    public final NextLiveData<Boolean> LLJJIJIIJIL;
    public final NextLiveData<Integer> LLJJIJIL;
    public final List<Integer> LLJJJ;
    public final CopyOnWriteArrayList<C676390Qg1> LLJJJIL;
    public final LinkedBlockingQueue<RunnableC678870Qk1> LLJJJJ;
    public final HandlerThread LLJJJJJIL;
    public final MixShopSearchBizVM$mainHandler$1 LLJJJJLIIL;
    public final BPEAHandler LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final C678510QjR LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C490901vf(null);
    }

    public final void reset() {
        ((LinkedHashMap) this.LLILZIL).clear();
        this.LLILZLL = null;
        this.LLILZ = null;
        this.LLJJJIL.clear();
        C677480Qhm c677480Qhm = this.LL;
        c677480Qhm.LLILLL = 0L;
        c677480Qhm.LLILLJJLI.clear();
        removeCallbacksAndMessages(null);
    }

    public final HashMap<String, Integer> vQ2() {
        HashMap<String, Integer> map = new HashMap<>();
        int i = this.LLJLL;
        if (i >= 0) {
            map.put("last_state", Integer.valueOf(i));
            map.put("last_state_data", Integer.valueOf(this.LLJLLIL));
            return map;
        }
        map.put("last_state", Integer.valueOf(this.LLJLIL));
        map.put("last_state_data", Integer.valueOf(this.LLJLILLLLZIIL));
        return map;
    }

    public final void wQ2() {
        C676390Qg1 next;
        C676390Qg1 c676390Qg1Previous;
        Iterator<C676390Qg1> it2 = this.LLJJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C676390Qg1 c676390Qg1 = next;
            if (c676390Qg1.LIZ == EnumC676230Qfl.USER_INTERACTION_TYPE_CLICK_CORRECT_WORD.getValue() && c676390Qg1.LIZIZ != null) {
                break;
            }
        }
        C676390Qg1 c676390Qg12 = next;
        if (c676390Qg12 == null) {
            CopyOnWriteArrayList<C676390Qg1> copyOnWriteArrayList = this.LLJJJIL;
            ListIterator<C676390Qg1> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c676390Qg1Previous = null;
                    break;
                }
                c676390Qg1Previous = listIterator.previous();
                C676390Qg1 c676390Qg13 = c676390Qg1Previous;
                if (c676390Qg13.LIZIZ != null && c676390Qg13.LIZJ == null) {
                    break;
                }
            }
            c676390Qg12 = c676390Qg1Previous;
            if (c676390Qg12 == null) {
                return;
            }
        }
        this.LLJJJIL.clear();
        this.LLJJJIL.add(c676390Qg12);
        c676390Qg12.LIZLLL = System.currentTimeMillis();
        InterfaceC676660QgS interfaceC676660QgS = c676390Qg12.LIZIZ;
        c676390Qg12.LIZJ = interfaceC676660QgS != null ? interfaceC676660QgS.run() : null;
        c676390Qg12.LIZIZ = null;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM$mainHandler$1] */
    public MixShopSearchBizVM() {
        C677480Qhm c677480Qhm = new C677480Qhm();
        this.LL = c677480Qhm;
        this.LLILLJJLI = c677480Qhm.LLILLJJLI;
        this.LLILZIL = new LinkedHashMap();
        NextLiveData<LogPbBean> nextLiveData = new NextLiveData<>();
        nextLiveData.setValue(new LogPbBean());
        this.LLIZ = nextLiveData;
        NextLiveData<n> nextLiveData2 = new NextLiveData<>();
        nextLiveData2.setValue(new n());
        this.LLIZLLLIL = nextLiveData2;
        NextLiveData<LogPbBean> nextLiveData3 = new NextLiveData<>();
        nextLiveData3.setValue(new LogPbBean());
        this.LLJ = nextLiveData3;
        NextLiveData<n> nextLiveData4 = new NextLiveData<>();
        nextLiveData4.setValue(new n());
        this.LLJI = nextLiveData4;
        this.LLJIJIL = true;
        this.LLJILJILJ = new NextLiveData<>();
        this.LLJILLL = new NextLiveData<>();
        this.LLJJ = new NextLiveData<>();
        this.LLJJI = new NextLiveData<>();
        this.LLJJIII = new NextLiveData<>();
        this.LLJJIJI = new NextLiveData<>();
        this.LLJJIJIIJIL = new NextLiveData<>();
        this.LLJJIJIL = new NextLiveData<>();
        this.LLJJJ = new ArrayList();
        this.LLJJJIL = new CopyOnWriteArrayList<>();
        this.LLJJJJ = new LinkedBlockingQueue<>();
        HandlerThread handlerThread = new HandlerThread("ec_v_search_mix_render_thread");
        handlerThread.start();
        this.LLJJJJJIL = handlerThread;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLJJJJLIIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM$mainHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                RunnableC678870Qk1 runnableC678870Qk1Poll;
                C1C7U.LIZ("MixShopSearchBizVM@db23.mainHandler$1");
                if (message.what == 100 && (runnableC678870Qk1Poll = this.LL.LLJJJJ.poll()) != null) {
                    runnableC678870Qk1Poll.run();
                }
                C1C7U.LIZIZ("MixShopSearchBizVM@db23.mainHandler$1");
            }
        };
        this.LLJJL = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LLJJLIIIJLLLLLLLZ = ((Boolean) C133900fB.LIZ.getValue()).booleanValue();
        this.LLJLIL = -1;
        this.LLJLILLLLZIIL = -1;
        this.LLJLL = -1;
        this.LLJLLIL = -1;
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && ((Boolean) C0AAD.LIZ.getValue()).booleanValue()) {
            this.LLJL = new C678510QjR();
        }
    }

    public final void xQ2(n nVar) {
        String strLIZLLL = C12869051v.LIZLLL(nVar, "backtrace");
        if (strLIZLLL != null) {
            this.LLILZIL.put("backtrace", strLIZLLL);
        }
        String strLIZLLL2 = C12869051v.LIZLLL(nVar, "template_name_versions");
        if (strLIZLLL2 != null) {
            this.LLILZIL.put("template_name_versions", strLIZLLL2);
        }
        String strLIZLLL3 = C12869051v.LIZLLL(nVar, "is_hit_cache");
        if (strLIZLLL3 != null) {
            this.LLILZIL.put("is_hit_cache", strLIZLLL3);
        }
        Long lLIZJ = C12869051v.LIZJ(nVar, "is_non_personalized_search");
        if (lLIZJ != null) {
            this.LLILZIL.put("is_non_personalized_search", Long.valueOf(lLIZJ.longValue()));
        }
        String strLIZLLL4 = C12869051v.LIZLLL(nVar, "last_search_pid_list");
        if (strLIZLLL4 != null) {
            this.LLILZIL.put("last_search_pid_list", strLIZLLL4);
        }
        String strLIZLLL5 = C12869051v.LIZLLL(nVar, "return_to_server_content");
        if (strLIZLLL5 != null) {
            this.LLILZIL.put("return_to_server_content", strLIZLLL5);
        }
        String strLIZLLL6 = C12869051v.LIZLLL(nVar, "filter_origin_search_id");
        if (strLIZLLL6 != null) {
            this.LLILZLL = strLIZLLL6;
        }
    }
}
