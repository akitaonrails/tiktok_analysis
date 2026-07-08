package com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong;

import X.C01GW;
import X.C09R3;
import X.C0PCY;
import X.C0PL0;
import X.C0PRC;
import X.C0QCK;
import X.C0QSJ;
import X.C13LE;
import X.C15438062q;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C646370PWx;
import X.C652840Pj8;
import X.C655760Pnq;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC656150PoT;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC652300PiG;
import X.InterfaceC652810Pj5;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS82S0100000_10;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchViralSongCardAssem extends ReusedUISlotAssem<SearchViralSongCardAssem> implements InterfaceC712990Rxx<C0PL0>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public TuxTextView LLJLIL;
    public volatile InterfaceC652300PiG LLJLL;
    public InterfaceC652300PiG LLJLLIL;
    public InterfaceC652810Pj5 LLJLLL;
    public List<InterfaceC687730QyJ> LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;
    public final C0QCK LLJJLIIIJLLLLLLLZ = new C0QCK(InterfaceC652810Pj5.class);
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 798));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 797));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchViralSongCardAssem.class, "searchHorizontalListAbility", "getSearchHorizontalListAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/horizontallist/ability/SearchHorizontalListAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchViralSongCardAssem.class, "searchScrollToOpenAbility", "getSearchScrollToOpenAbility()Ltiktok/communication/LazyAbility;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f1q;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLJLLIL = (InterfaceC652300PiG) obj;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLJLLL = (InterfaceC652810Pj5) obj;
            C687700QyG.LJFF(this, this.LLJZ, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchHorizontalListScope.class, SearchHorizontalListScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            return this.LLJLLIL;
        }
        if (cls == InterfaceC652810Pj5.class) {
            return this.LLJLLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLJLLIL = null;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLJLLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJZ;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final InterfaceC652300PiG op() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJZIJLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJZIJLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{SearchHorizontalListScope.class});
            this.LLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC652300PiG interfaceC652300PiG = (InterfaceC652300PiG) c0qsjLIZLLL.getAbility(InterfaceC652300PiG.class);
        C687700QyG.LJ(interfaceC652300PiG, InterfaceC652300PiG.class);
        return interfaceC652300PiG;
    }

    public final C0PRC sp() {
        C0PCY<C0PRC> c0pcyPh1;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJL.getValue();
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null) {
            return null;
        }
        return (C0PRC) c0pcyPh1.LIZJ();
    }

    public final C646370PWx up() {
        C0PCY<C646370PWx> c0pcyWO2;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJL.getValue();
        if (iSearchContextAbility == null || (c0pcyWO2 = iSearchContextAbility.wO2()) == null) {
            return null;
        }
        return (C646370PWx) c0pcyWO2.LIZJ();
    }

    public final C2344009Gk tp() {
        C646370PWx c646370PWxUp = up();
        C0PRC c0prcSp = sp();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_id", c0prcSp != null ? c0prcSp.LLILLL : null);
        c2344009Gk.LJIIIIZZ("search_keyword", c0prcSp != null ? c0prcSp.LLIZLLLIL : null);
        C724270Sb3 c724270Sb3 = this.LLJI;
        ViralSongCard viralSongCard = ((C0PL0) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.getViralSongCard();
        c2344009Gk.LJIIIIZZ("search_result_id", viralSongCard != null ? viralSongCard.musicId : null);
        c2344009Gk.LJIIIIZZ("enter_from", c646370PWxUp != null ? c646370PWxUp.LLILLL : null);
        c2344009Gk.LJIIIIZZ("token_type", "viral_song");
        c2344009Gk.LJIIIIZZ("rank", String.valueOf(c646370PWxUp != null ? Integer.valueOf(c646370PWxUp.LLILZLL) : null));
        c2344009Gk.LJIIIIZZ("universal_rank", String.valueOf(c646370PWxUp != null ? c646370PWxUp.LLJILJIL : null));
        c2344009Gk.LJIIIIZZ("is_music_chart", "1");
        return c2344009Gk;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.title);
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 574));
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS79S0200000_10(view, this, 39));
        C786410Ut5.I7(new AkS82S0100000_10(this, 3), view.findViewById(R.id.view_full_chart_btn));
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(view, this, 40));
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJZ == null) {
            this.LLJZ = new ArrayList();
        }
        ((ArrayList) this.LLJZ).add(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0PL0 c0pl0) {
        String string;
        ViralSongCard viralSongCard = c0pl0.LL.getViralSongCard();
        if (viralSongCard != null) {
            TuxTextView tuxTextView = this.LLJLIL;
            if (tuxTextView != null) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131837694, String.valueOf(viralSongCard.ranking));
                } else {
                    string = null;
                }
                tuxTextView.setText(string);
            }
            List<Aweme> list = viralSongCard.videos;
            InterfaceC652300PiG interfaceC652300PiGOp = this.LLJLL;
            if (interfaceC652300PiGOp == null) {
                synchronized (this) {
                    interfaceC652300PiGOp = this.LLJLL;
                    if (interfaceC652300PiGOp == null) {
                        interfaceC652300PiGOp = op();
                        this.LLJLL = interfaceC652300PiGOp;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Aweme aweme : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C655760Pnq(aweme, new C652840Pj8(0), EnumC656150PoT.DIGG));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            interfaceC652300PiGOp.j4(arrayList, true);
            C0QCK c0qck = this.LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
            c0qck.LIZ(this).LIZIZ(this, new AwS589S0100000_10(this, 570));
        }
        TuxTextView tuxTextView2 = this.LLJLIL;
        if (tuxTextView2 != null) {
            HandlerHook.viewPost(tuxTextView2, new ARunnableS110S0100000_10(this, 162));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0PL0 c0pl0) {
        return true;
    }

    public final void yp(String str) {
        Object obj;
        C2344009Gk c2344009GkTp = tp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ViralSongCard viralSongCard = ((C0PL0) obj).LL.getViralSongCard();
        if (viralSongCard != null) {
            str2 = viralSongCard.searchSource;
        }
        c2344009GkTp.LJFF("enter_method", str2);
        c2344009GkTp.LJFF("is_music_chart", "1");
        c2344009GkTp.LJFF("button_type", str);
        C20684815ws.LJIILLIIL("search_result_click", c2344009GkTp.LIZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0PL0 c0pl0) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
