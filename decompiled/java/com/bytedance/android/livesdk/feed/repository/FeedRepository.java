package com.bytedance.android.livesdk.feed.repository;

import X.AbstractC470740Id6;
import X.C036E;
import X.C08D8;
import X.C0IJT;
import X.C0IR5;
import X.C0IXL;
import X.C0IY7;
import X.C0IZ1;
import X.C0IZ6;
import X.C0IZ7;
import X.C0IZC;
import X.C0IZD;
import X.C0IZH;
import X.C0J1O;
import X.C0J1R;
import X.C0J1U;
import X.C1148310fzJ;
import X.C11NJ;
import X.C11RK;
import X.C2093608Ic;
import X.C467800IWc;
import X.C467820IWe;
import X.C469770IbX;
import X.C470610Ict;
import X.C470620Icu;
import X.C470630Icv;
import X.C470680Id0;
import X.C470820IdE;
import X.C470870IdJ;
import X.C470930IdP;
import X.C474500IjA;
import X.C476690Imh;
import X.C476700Imi;
import X.C497740JfY;
import X.EnumC470670Icz;
import X.InterfaceC470690Id1;
import X.InterfaceC470700Id2;
import X.InterfaceC470710Id3;
import X.InterfaceC470830IdF;
import X.InterfaceC470850IdH;
import X.InterfaceC470890IdL;
import Y.AObserverS211S0100000_7;
import Y.AfS132S0000000_7;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class FeedRepository implements C0IZD, InterfaceC470890IdL, GenericLifecycleObserver {
    public final FeedApi LL;
    public final InterfaceC470710Id3<String, FeedExtra> LLILLJJLI;
    public InterfaceC470850IdH LLILLL;
    public C0IZ1 LLILZ;
    public C0IZ6 LLILZIL;
    public final C0IZ7 LLILZLL;
    public final C469770IbX LLIZ;
    public String LLIZLLLIL;
    public final String LLJ;
    public final C11RK<Object> LLJI;
    public final C11RK<String> LLJIJIL;
    public final C11RK<List<ImageModel>> LLJILJIL;
    public final C11RK<Pair<String, String>> LLJILJILJ;
    public final C11RK<String> LLJILLL;
    public final C11NJ LLJJ;
    public final C11RK<EnumC470670Icz> LLJJI;
    public final C11RK<EnumC470670Icz> LLJJIII;
    public C0IY7 LLJJIJI;
    public final InterfaceC470690Id1 LLJJIJIIJIL;
    public C470630Icv LLJJIJIL;
    public final InterfaceC470700Id2<String, FeedItem> LLJJJ;
    public long LLJJJIL;

    @Override // X.InterfaceC470890IdL
    public final void Is() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            registerFeedRepository();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            unRegisterFeedRepository();
        }
    }

    public final void LIZLLL() {
        InterfaceC470850IdH interfaceC470850IdH = this.LLILLL;
        if (interfaceC470850IdH == null) {
            throw new IllegalStateException("not call init() or params be null");
        }
        ((C470820IdE) interfaceC470850IdH).LIZ.getClass();
    }

    @Override // X.InterfaceC470890IdL
    public final void Q62() {
        InterfaceC470700Id2<String, FeedItem> interfaceC470700Id2 = this.LLJJJ;
        LIZLLL();
        interfaceC470700Id2.LIZIZ("live");
        if (this.LLJJIJIL != null) {
            C467800IWc.LJIJ.LJIIIIZZ();
            this.LLJJIJIL.LJ.onNext(C0J1R.LIZJ);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void unRegisterFeedRepository() {
        InterfaceC470690Id1 interfaceC470690Id1 = this.LLJJIJIIJIL;
        LIZLLL();
        if (interfaceC470690Id1.LJFF(this)) {
            InterfaceC470700Id2<String, FeedItem> interfaceC470700Id2 = this.LLJJJ;
            LIZLLL();
            interfaceC470700Id2.LIZIZ("live");
            C0IZ1 c0iz1 = this.LLILZ;
            if (c0iz1 != null) {
                c0iz1.LJIIJJI.LJ();
            }
            C0IZ6 c0iz6 = this.LLILZIL;
            if (c0iz6 != null) {
                c0iz6.LJII.LJ();
                c0iz6.LJ.release();
            }
            this.LLJJ.LJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void registerFeedRepository() {
        LIZLLL();
        InterfaceC470690Id1 interfaceC470690Id1 = this.LLJJIJIIJIL;
        LIZLLL();
        interfaceC470690Id1.LIZJ(this);
    }

    @Override // X.InterfaceC470890IdL
    public final C11RK gO1() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC470890IdL
    public final InterfaceC470690Id1 vM() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC470890IdL
    public final void Fw1(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC470890IdL
    public final void LH2(String str) {
        this.LLIZLLLIL = str;
    }

    public final void LIZIZ(C0IZC c0izc) {
        boolean z;
        this.LLJJJIL = System.currentTimeMillis();
        if (C467820IWe.LIZIZ <= 0 && !C467820IWe.LJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C467820IWe.LIZIZ = jCurrentTimeMillis;
            long j = C467820IWe.LIZ;
            if (1 <= j && j < jCurrentTimeMillis) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C467820IWe.LIZJ().put("enter2request_duration", String.valueOf(C467820IWe.LIZIZ - C467820IWe.LIZ));
            } else {
                C467820IWe.LIZJ().put("enter2request_duration", CardStruct.IStatusCode.DEFAULT);
            }
            C467820IWe.LIZJ().put("request_start_timestamp", String.valueOf(C467820IWe.LIZIZ));
        }
        C0IY7 c0iy7 = new C0IY7();
        this.LLJJIJI = c0iy7;
        c0iy7.LIZ = SystemClock.uptimeMillis();
        if (c0izc == C0IZC.REFRESH) {
            this.LLJJI.onNext(EnumC470670Icz.START);
            return;
        }
        if (c0izc != C0IZC.LOAD_MORE) {
            return;
        }
        this.LLJJIII.onNext(EnumC470670Icz.START);
        C0IY7 c0iy72 = this.LLJJIJI;
        if (c0iy72 == null) {
            return;
        }
        c0iy72.LIZ = SystemClock.uptimeMillis();
    }

    @Override // X.InterfaceC470890IdL
    public final InterfaceC470830IdF<FeedItem> NK2(String str) {
        String str2;
        C0IZH<V> c0izh;
        int i;
        int i2;
        int i3;
        FeedRepository feedRepository = this;
        InterfaceC470710Id3<String, FeedExtra> interfaceC470710Id3 = feedRepository.LLILLJJLI;
        ((C470820IdE) feedRepository.LLILLL).LIZ.getClass();
        feedRepository.LLJJ.LIZ(interfaceC470710Id3.LLLLLLIL().LJJLJLI(new AfS132S0000000_7(33)));
        if (feedRepository.LLILZLL != null) {
            C469770IbX c469770IbX = feedRepository.LLIZ;
            InterfaceC470690Id1 interfaceC470690Id1 = feedRepository.LLJJIJIIJIL;
            C11RK<List<ImageModel>> c11rk = feedRepository.LLJILJIL;
            C11RK<Pair<String, String>> c11rk2 = feedRepository.LLJILJILJ;
            C0IZ7 c0iz7 = feedRepository.LLILZLL;
            feedRepository = feedRepository;
            C0IZ6 c0iz6 = new C0IZ6(c469770IbX, interfaceC470690Id1, feedRepository, c11rk, c11rk2, c0iz7);
            feedRepository.LLILZIL = c0iz6;
            c0izh = c0iz6;
        } else {
            FeedApi feedApi = feedRepository.LL;
            InterfaceC470690Id1 interfaceC470690Id12 = feedRepository.LLJJIJIIJIL;
            C11RK<Pair<String, String>> c11rk3 = feedRepository.LLJILJILJ;
            C11RK<String> c11rk4 = feedRepository.LLJILLL;
            C11RK<String> c11rk5 = feedRepository.LLJIJIL;
            if (!C2093608Ic.LJ(feedRepository.LLIZLLLIL)) {
                str2 = feedRepository.LLIZLLLIL;
            } else {
                str2 = "enter_auto";
            }
            C0IZ1 c0iz1 = new C0IZ1(str, feedApi, interfaceC470690Id12, c11rk3, feedRepository, c11rk4, c11rk5, str2, feedRepository.LLJILJIL, feedRepository.LLJ);
            feedRepository.LLILZ = c0iz1;
            c0izh = c0iz1;
        }
        final C470610Ict c470610Ict = new C470610Ict();
        c470610Ict.LJIILL = c0izh;
        ((C470820IdE) feedRepository.LLILLL).LIZ.getClass();
        c470610Ict.LJIIJJI = "live";
        InterfaceC470700Id2 interfaceC470700Id2 = feedRepository.LLJJJ;
        InterfaceC470710Id3 interfaceC470710Id32 = feedRepository.LLILLJJLI;
        c470610Ict.LJIIL = interfaceC470700Id2;
        c470610Ict.LJIILIIL = interfaceC470710Id32;
        C470620Icu c470620Icu = new C470620Icu();
        c470620Icu.LIZLLL = false;
        InterfaceC470850IdH interfaceC470850IdH = feedRepository.LLILLL;
        int i4 = 12;
        if (interfaceC470850IdH == null || (i = ((C470820IdE) interfaceC470850IdH).LIZ.LLJJIJIL) <= 0) {
            i = 12;
        }
        c470620Icu.LIZ = i;
        if (interfaceC470850IdH != null && (i3 = ((C470820IdE) interfaceC470850IdH).LIZ.LLJJIJIL) > 0) {
            i4 = i3;
        }
        c470620Icu.LIZJ = i4;
        if (interfaceC470850IdH == null || (i2 = ((C470820IdE) interfaceC470850IdH).LIZ.LLJJJ) <= 0) {
            i2 = 4;
        }
        c470620Icu.LIZIZ = i2;
        c470610Ict.LJIILJJIL = c470620Icu.LIZ();
        AbstractC470740Id6<Long, Object> abstractC470740Id6 = new AbstractC470740Id6<Long, Object>() { // from class: X.0Id4
            @Override // X.AbstractC470740Id6
            public final AbstractC470910IdN<Long, Object> LIZ() {
                return new C470600Ics(c470610Ict);
            }
        };
        C470930IdP c470930IdP = new C470930IdP(c470610Ict.LIZJ, c470610Ict.LIZLLL);
        C470680Id0 c470680Id0 = new C470680Id0(abstractC470740Id6, c470610Ict.LJIILJJIL);
        c470680Id0.LIZJ = c470930IdP;
        C476690Imh c476690Imh = c470680Id0.LIZ;
        AbstractC470740Id6<Key, Value> abstractC470740Id62 = c470680Id0.LIZIZ;
        C08D8 c08d8 = c470680Id0.LIZLLL;
        C470630Icv c470630Icv = new C470630Icv(c470610Ict, new C476700Imi(c08d8, abstractC470740Id62, c476690Imh, c08d8, c470930IdP).getLiveData());
        feedRepository.LLJJIJIL = c470630Icv;
        c470630Icv.LIZJ.observeForever(new AObserverS211S0100000_7(feedRepository, 47));
        return feedRepository.LLJJIJIL;
    }

    @Override // X.InterfaceC470890IdL
    public final void PB0(C470820IdE c470820IdE) {
        this.LLILLL = c470820IdE;
    }

    @Override // X.InterfaceC470890IdL
    public final void Cw1(String str, String str2) {
        this.LLJILJILJ.onNext(new Pair<>(str, str2));
    }

    public final void LIZ(C0IZC c0izc, Throwable th) {
        if (c0izc == C0IZC.REFRESH) {
            this.LLJJI.onNext(EnumC470670Icz.FAIL);
            if (this.LLJJIJI != null) {
                C497740JfY.LJII();
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        this.LLJJIJI.LJIIL("refresh", th);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        if (c0izc == C0IZC.LOAD_MORE) {
            this.LLJJIII.onNext(EnumC470670Icz.FAIL);
            if (this.LLJJIJI != null) {
                C497740JfY.LJII();
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        this.LLJJIJI.LJIIL("load_more", th);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    public final void LIZJ(C0IZC c0izc, String str, String str2) {
        C0IXL c0ixl;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_request_finish");
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        c474500IjALIZ.LJJII(c467800IWc.LJFF, "show_method");
        c474500IjALIZ.LJJII(str2, "tab_type");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "request_duration");
        c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIIJ();
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            String str3 = c0ixl.LJJIIZ;
            if (!TextUtils.isEmpty(str3)) {
                c474500IjALIZ.LJJII(str3, "from_drawer_tab");
            }
        }
        if (!"enter_auto_vertical_game".equals(str) && !"vertical_game_loadmore".equals(str)) {
            c474500IjALIZ.LJJII("foru", "request_from");
        } else {
            c474500IjALIZ.LJJII("game", "request_from");
        }
        C0IZC c0izc2 = C0IZC.REFRESH;
        if (c0izc == c0izc2) {
            c474500IjALIZ.LJJII("refresh", "request_type");
        } else {
            c474500IjALIZ.LJJII("loadmore", "request_type");
        }
        c474500IjALIZ.LIZ();
        if (c0izc == c0izc2) {
            this.LLJJI.onNext(EnumC470670Icz.SUCCESS);
            C0IY7 c0iy7 = this.LLJJIJI;
            if (c0iy7 != null) {
                c0iy7.LJIILIIL("refresh");
                return;
            }
            return;
        }
        if (c0izc != C0IZC.LOAD_MORE) {
            return;
        }
        this.LLJJIII.onNext(EnumC470670Icz.SUCCESS);
        C0IY7 c0iy72 = this.LLJJIJI;
        if (c0iy72 == null) {
            return;
        }
        c0iy72.LJIILIIL("load_more");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public FeedRepository(InterfaceC470690Id1 interfaceC470690Id1, FeedApi feedApi, C0J1U c0j1u, C0J1O c0j1o) {
        this.LLJ = "";
        this.LLJI = new C11RK<>();
        this.LLJIJIL = new C11RK<>();
        this.LLJILJIL = new C11RK<>();
        this.LLJILJILJ = new C11RK<>();
        this.LLJILLL = new C11RK<>();
        C11NJ c11nj = new C11NJ();
        this.LLJJ = c11nj;
        this.LLJJI = new C11RK<>();
        this.LLJJIII = new C11RK<>();
        this.LLJJIJIIJIL = interfaceC470690Id1;
        this.LLJJJ = c0j1o;
        this.LL = feedApi;
        this.LLILLJJLI = c0j1u;
        c11nj.LIZ(c0j1o.LJFF.LJJLJLI(new AfS132S0000000_7(32)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public FeedRepository(C470870IdJ c470870IdJ, FeedApi feedApi, C0J1U c0j1u, C0J1O c0j1o, String str) {
        this.LLJ = "";
        this.LLJI = new C11RK<>();
        this.LLJIJIL = new C11RK<>();
        this.LLJILJIL = new C11RK<>();
        this.LLJILJILJ = new C11RK<>();
        this.LLJILLL = new C11RK<>();
        C11NJ c11nj = new C11NJ();
        this.LLJJ = c11nj;
        this.LLJJI = new C11RK<>();
        this.LLJJIII = new C11RK<>();
        this.LLJJIJIIJIL = c470870IdJ;
        this.LLJJJ = c0j1o;
        this.LL = feedApi;
        this.LLILLJJLI = c0j1u;
        this.LLJ = str;
        c11nj.LIZ(c0j1o.LJFF.LJJLJLI(new AfS132S0000000_7(34)));
    }

    public FeedRepository(C470870IdJ c470870IdJ, FeedApi feedApi, C0J1U c0j1u, C0J1O c0j1o, C0IZ7 c0iz7, C469770IbX c469770IbX) {
        this.LLJ = "";
        this.LLJI = new C11RK<>();
        this.LLJIJIL = new C11RK<>();
        this.LLJILJIL = new C11RK<>();
        this.LLJILJILJ = new C11RK<>();
        this.LLJILLL = new C11RK<>();
        this.LLJJ = new C11NJ();
        this.LLJJI = new C11RK<>();
        this.LLJJIII = new C11RK<>();
        this.LLJJIJIIJIL = c470870IdJ;
        this.LLJJJ = c0j1o;
        this.LL = feedApi;
        this.LLILLJJLI = c0j1u;
        this.LLILZLL = c0iz7;
        this.LLIZ = c469770IbX;
    }
}
