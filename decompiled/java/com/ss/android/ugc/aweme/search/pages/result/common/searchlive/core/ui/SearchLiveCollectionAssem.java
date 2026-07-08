package com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui;

import X.AbstractC654530Plr;
import X.AnonymousClass0206;
import X.C01GW;
import X.C0BRN;
import X.C0BY7;
import X.C0P8E;
import X.C0P8O;
import X.C0PA7;
import X.C0PC0;
import X.C0PCX;
import X.C0PCY;
import X.C0PFR;
import X.C0PM7;
import X.C0PRC;
import X.C0PRF;
import X.C0PRP;
import X.C0PS1;
import X.C0PS7;
import X.C0PUF;
import X.C0PUG;
import X.C0PWT;
import X.C0PYA;
import X.C0PYB;
import X.C0PYC;
import X.C0PYD;
import X.C0Q39;
import X.C0Q3E;
import X.C0Q8M;
import X.C0QCK;
import X.C0QDC;
import X.C0QSJ;
import X.C0VWN;
import X.C13LE;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C301190BrJ;
import X.C418440Gaw;
import X.C452501pT;
import X.C639820P7s;
import X.C639830P7t;
import X.C639840P7u;
import X.C640110P8v;
import X.C640480PAg;
import X.C646370PWx;
import X.C646670PYb;
import X.C647460PaS;
import X.C651130PgN;
import X.C652150Pi1;
import X.C652190Pi5;
import X.C652200Pi6;
import X.C652220Pi8;
import X.C652290PiF;
import X.C653520PkE;
import X.C653660PkS;
import X.C654590Plx;
import X.C654840PmM;
import X.C655740Pno;
import X.C663990Q2r;
import X.C669520QNy;
import X.C673150Qan;
import X.C679280Qkg;
import X.C687700QyG;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC655550PnV;
import X.EnumC656150PoT;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC641090PCp;
import X.InterfaceC644520PPu;
import X.InterfaceC652300PiG;
import X.InterfaceC652810Pj5;
import X.InterfaceC654580Plw;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC655110Pmn;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveCollectionAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveViewHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveCollectionAssem extends ReusedUIContentAssem<SearchLiveCollectionAssem> implements InterfaceC712990Rxx<C652220Pi8>, ISearchContextAbility, C0QSJ, InterfaceC1146704e9 {
    public static final C653520PkE LLLILZLLLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIZZ;
    public final /* synthetic */ ISearchContextAbility LLJJJJ;
    public final InterfaceC641090PCp LLJJJJJIL;
    public final Fragment LLJJJJLIIL;
    public final View LLJJL;
    public final LifecycleOwner LLJJLIIIJLLLLLLLZ;
    public C654590Plx LLJLLIL;
    public C652200Pi6 LLJZ;
    public final ClickSearchViewModel LLJZIJLIL;
    public C0PUF LLL;
    public int LLLFF;
    public int LLLFFI;
    public volatile InterfaceC652300PiG LLLIIIL;
    public InterfaceC652300PiG LLLIIL;
    public InterfaceC652810Pj5 LLLIILIL;
    public List<InterfaceC687730QyJ> LLLIL;
    public InterfaceC665370Q7z LLLILZ;
    public C0QSJ LLLILZJ;
    public final C0QCK LLJL = new C0QCK(InterfaceC652810Pj5.class);
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1247));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1257));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1259));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1254));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(686));
    public List<? extends Aweme> LLLFZ = new ArrayList();
    public final C01GW LLLI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(489));
    public boolean LLLII = true;
    public final C01GW LLLIIII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(687));
    public final C652190Pi5 LLLIIIIL = new InterfaceC644520PPu() { // from class: X.0Pi5
        @Override // X.InterfaceC644520PPu
        public final boolean sq(String str) {
            return this.LL.dp().containsKey(str);
        }

        @Override // X.InterfaceC644520PPu
        public final void x(String str) {
            Pair<Aweme, Integer> pair;
            boolean z;
            if (this.LL.LLLFZ.size() > 1 && (pair = this.LL.dp().get(str)) != null) {
                int iIntValue = pair.getSecond().intValue();
                SearchLiveCollectionAssem searchLiveCollectionAssem = this.LL;
                int i = searchLiveCollectionAssem.LLLFF;
                int i2 = 0;
                if (iIntValue <= searchLiveCollectionAssem.LLLFFI && i <= iIntValue) {
                    z = true;
                } else {
                    z = false;
                }
                Aweme aweme = null;
                if (!z) {
                    int i3 = (iIntValue - 10) + 1;
                    if (i3 < 0) {
                        iIntValue = Math.min(9, searchLiveCollectionAssem.dp().size() - 1);
                        i3 = 0;
                    }
                    SearchLiveCollectionAssem.kp(this.LL, C652230Pi9.LIZ(i3, iIntValue + 1, C09RB.LJJII(new C08LY(new C1939607ik(this.LL.dp().values()), AFwS241S0000000_10.get$arr$(226)))), null, null, 6);
                }
                int i4 = -1;
                for (Aweme aweme2 : this.LL.LLLFZ) {
                    int i5 = i2 + 1;
                    if (i2 >= 0) {
                        if (Intrinsics.LJFF(aweme2.getAid(), str)) {
                            i4 = i2;
                        }
                        i2 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                SearchLiveViewHolderAbility searchLiveViewHolderAbility = (SearchLiveViewHolderAbility) this.LL.LLJLL.getValue();
                if (searchLiveViewHolderAbility != null) {
                    searchLiveViewHolderAbility.B12();
                }
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) this.LL.LLJLIL.getValue();
                if (searchServiceCenter$AutoPlayAbility != null) {
                    searchServiceCenter$AutoPlayAbility.Ot0(new C640750PBh(i4, null, true, 0, 10), new AwS554S0100000_10(this.LL, 503));
                }
                Iterator<? extends Aweme> it2 = this.LL.LLLFZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Aweme next = it2.next();
                    if (Intrinsics.LJFF(next.getAid(), str)) {
                        aweme = next;
                        break;
                    }
                }
                Aweme aweme3 = aweme;
                C0PUV.LIZIZ(aweme3, this.LL.ep().pm(), ((C652220Pi8) C631370Opb.LIZ(this.LL)).LLILLJJLI, EnumC645610PTz.SEARCH_LIVE_FEED, false, false);
                C652200Pi6 c652200Pi6 = this.LL.LLJZ;
                if (c652200Pi6 != null) {
                    c652200Pi6.LIZ(aweme3);
                }
            }
        }

        @Override // X.InterfaceC644520PPu
        public final void rq(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
            this.LL.lp(list);
            SearchLiveCollectionAssem searchLiveCollectionAssem = this.LL;
            C654590Plx c654590Plx = searchLiveCollectionAssem.LLJLLIL;
            if (c654590Plx != null) {
                Collection<Pair<Aweme, Integer>> collectionValues = searchLiveCollectionAssem.dp().values();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Pair) it2.next()).getFirst());
                }
                c654590Plx.LIZJ = arrayList;
            }
            C654590Plx c654590Plx2 = this.LL.LLJLLIL;
            if (c654590Plx2 != null) {
                c654590Plx2.LIZLLL = searchLiveList.cursor;
            }
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchLiveCollectionAssem.class, "searchHorizontalListAbility", "getSearchHorizontalListAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/horizontallist/ability/SearchHorizontalListAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIZZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(SearchLiveCollectionAssem.class, "searchScrollToOpenAbility", "getSearchScrollToOpenAbility()Ltiktok/communication/LazyAbility;", 0)};
        LLLILZLLLI = new C653520PkE();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C651130PgN> AX1() {
        return this.LLJJJJ.AX1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PS7> Bq1() {
        return this.LLJJJJ.Bq1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PRP> CV0() {
        return this.LLJJJJ.CV0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYB> FF2() {
        return this.LLJJJJ.FF2();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C669520QNy> FU1() {
        return this.LLJJJJ.FU1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0P8E> Im0() {
        return this.LLJJJJ.Im0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C646670PYb> Jh0() {
        return this.LLJJJJ.Jh0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0Q39> P70() {
        return this.LLJJJJ.P70();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PRC> Ph1() {
        return this.LLJJJJ.Ph1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C640480PAg> Pw0() {
        return this.LLJJJJ.Pw0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0P8O> R22() {
        return this.LLJJJJ.R22();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C640110P8v> SL1() {
        return this.LLJJJJ.SL1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<CreationSearchSignalState> UL1() {
        return this.LLJJJJ.UL1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PA7> VG2() {
        return this.LLJJJJ.VG2();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C639820P7s> Wa0() {
        return this.LLJJJJ.Wa0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PRF> Wg1() {
        return this.LLJJJJ.Wg1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C663990Q2r> Ww1() {
        return this.LLJJJJ.Ww1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0Q8M> Xf0() {
        return this.LLJJJJ.Xf0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYD> Y30() {
        return this.LLJJJJ.Y30();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C652150Pi1> Y52() {
        return this.LLJJJJ.Y52();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PM7> ak0() {
        return this.LLJJJJ.ak0();
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLLIIL = (InterfaceC652300PiG) obj;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLLIILIL = (InterfaceC652810Pj5) obj;
            C687700QyG.LJFF(this, this.LLLIL, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYA> cP2() {
        return this.LLJJJJ.cP2();
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchHorizontalListScope.class, SearchHorizontalListScope.class});
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PC0> cp2() {
        return this.LLJJJJ.cp2();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C639830P7t> dP0() {
        return this.LLJJJJ.dP0();
    }

    public final InterfaceC652300PiG ep() {
        InterfaceC652300PiG interfaceC652300PiG = this.LLLIIIL;
        if (interfaceC652300PiG == null) {
            synchronized (this) {
                interfaceC652300PiG = this.LLLIIIL;
                if (interfaceC652300PiG == null) {
                    InterfaceC652300PiG interfaceC652300PiGCp = cp();
                    this.LLLIIIL = interfaceC652300PiGCp;
                    return interfaceC652300PiGCp;
                }
            }
        }
        return interfaceC652300PiG;
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final void fe(C0PWT c0pwt) {
        this.LLJJJJ.fe(c0pwt);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C647460PaS> gX() {
        return this.LLJJJJ.gX();
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            return this.LLLIIL;
        }
        if (cls == InterfaceC652810Pj5.class) {
            return this.LLLIILIL;
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

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C639840P7u> jy() {
        return this.LLJJJJ.jy();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PCX> lI1() {
        return this.LLJJJJ.lI1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0QDC> ov1() {
        return this.LLJJJJ.ov1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PM7> pR() {
        return this.LLJJJJ.pR();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PM7> uF() {
        return this.LLJJJJ.uF();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLLIIL = null;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLLIILIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C646370PWx> wO2() {
        return this.LLJJJJ.wO2();
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<SearchBehaviorSignalState> yY1() {
        return this.LLJJJJ.yY1();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final C0PCY<C0PYC> zJ2() {
        return this.LLJJJJ.zJ2();
    }

    public final InterfaceC652300PiG cp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLILZJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLILZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLILZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{SearchHorizontalListScope.class});
            this.LLLILZJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC652300PiG interfaceC652300PiG = (InterfaceC652300PiG) c0qsjLIZLLL.getAbility(InterfaceC652300PiG.class);
        C687700QyG.LJ(interfaceC652300PiG, InterfaceC652300PiG.class);
        return interfaceC652300PiG;
    }

    public final LinkedHashMap<String, Pair<Aweme, Integer>> dp() {
        return (LinkedHashMap) this.LLLI.getValue();
    }

    public final AbstractC654530Plr hp() {
        Integer numValueOf;
        Integer numValueOf2;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1) {
            return new AbstractC654530Plr() { // from class: X.0PiB
                {
                    new Size(198, 317);
                }
            };
        }
        Context context = getContext();
        if (context == null || (numValueOf = Integer.valueOf(C418440Gaw.LIZLLL(context))) == null || (numValueOf2 = Integer.valueOf(C679280Qkg.LIZIZ(Float.valueOf((numValueOf.intValue() * 57.0f) / 100.0f)))) == null) {
            return new AbstractC654530Plr() { // from class: X.0PiB
                {
                    new Size(198, 317);
                }
            };
        }
        final Size size = new Size(numValueOf2.intValue(), (int) (numValueOf2.intValue() * 1.6f));
        return new AbstractC654530Plr(size) { // from class: X.0PiA
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, ISearchContextAbility.class, null, null);
    }

    public final void lp(List<? extends Aweme> list) {
        Integer numValueOf;
        for (Aweme aweme : list) {
            if (aweme.getAid() != null && !dp().containsKey(aweme.getAid())) {
                dp().put(aweme.getAid(), new Pair<>(aweme, Integer.valueOf(((AtomicInteger) this.LLLF.getValue()).getAndIncrement())));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeToFullMap, totalSize: ");
        LinkedHashMap<String, Pair<Aweme, Integer>> linkedHashMapDp = dp();
        if (linkedHashMapDp != null) {
            numValueOf = Integer.valueOf(linkedHashMapDp.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", lastIndex: ");
        sbLIZ.append(((AtomicInteger) this.LLLF.getValue()).get());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (C0BY7.LIZ()) {
            C723830SaL.LIZ(this, null, new AwS376S0200000_10(this, view, 39));
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLIL == null) {
            this.LLLIL = new ArrayList();
        }
        ((ArrayList) this.LLLIL).add(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C652220Pi8 c652220Pi8) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvPm;
        int i;
        C652220Pi8 c652220Pi82 = c652220Pi8;
        View viewFindViewById = LJJIJL().findViewById(R.id.n8g);
        View viewFindViewById2 = LJJIJL().findViewById(R.id.i77);
        if (C0BY7.LIZ()) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                if (Intrinsics.LJFF(c652220Pi82.LL.getShouldHideTitle(), Boolean.TRUE)) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById2);
            }
        }
        if (C301190BrJ.LIZ()) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj6 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            C653660PkS c653660PkS = ((C652220Pi8) obj).LLILLJJLI;
            if (interfaceC665370Q7zLJIIL != null) {
                C1554960qZC.LIZ(interfaceC665370Q7zLJIIL, new C0PFR(c653660PkS), C0PFR.class, "source_default_key");
            }
            if (C0BRN.LIZ() && this.LLLII && (viewOnAttachStateChangeListenerC20604515jvPm = ep().pm()) != null) {
                C0PS1.LIZ(viewOnAttachStateChangeListenerC20604515jvPm);
            }
            dp().clear();
            ((AtomicInteger) this.LLLF.getValue()).set(0);
            if (this.LLL == null) {
                ClickSearchViewModel clickSearchViewModel = this.LLJZIJLIL;
                String str = ((C0PRC) C0Q3E.LIZIZ(this.LLJJJJLIIL).Ph1().LIZJ()).LLIZLLLIL;
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj5 = c724270Sb32.LL;
                } else {
                    obj5 = null;
                }
                this.LLL = C0PUG.LIZ(clickSearchViewModel, str, ((C652220Pi8) obj5).LLILLL);
            }
            if (this.LLJZ == null) {
                this.LLJZ = new C652200Pi6(this);
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj2 = c724270Sb33.LL;
            } else {
                obj2 = null;
            }
            List<Aweme> list = ((C652220Pi8) obj2).LL.getCollectionLive().lives;
            if (list != null) {
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj3 = c724270Sb34.LL;
                } else {
                    obj3 = null;
                }
                SearchCardInfo searchCardInfo = ((C652220Pi8) obj3).LL.getSearchCardInfo();
                C724270Sb3 c724270Sb35 = this.LLJI;
                if (c724270Sb35 != null) {
                    obj4 = c724270Sb35.LL;
                } else {
                    obj4 = null;
                }
                kp(this, list, searchCardInfo, ((C652220Pi8) obj4).LL.getCollectionLive().cursor, 8);
            }
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj6 = c724270Sb36.LL;
            }
            if (Intrinsics.LJFF(((C652220Pi8) obj6).LL.getCollectionLive().isMore(), Boolean.TRUE)) {
                C0QCK c0qck = this.LLJL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIZZ;
                c0qck.LIZ(this).LIZIZ(this, new AwS589S0100000_10(this, 612));
            } else {
                C0QCK c0qck2 = this.LLJL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLLIZZ;
                c0qck2.LIZ(this).LIZIZ(this, AFwS241S0000000_10.get$arr$(557));
            }
            if (this.LLLII) {
                ep().Tl(new InterfaceC654580Plw() { // from class: X.0Plu
                    @Override // X.InterfaceC654580Plw
                    public final void LIZ(int i2) {
                    }

                    @Override // X.InterfaceC654580Plw
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC654580Plw
                    public final void LIZJ(int i2) {
                    }

                    @Override // X.InterfaceC654580Plw
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC654580Plw
                    public final void LLD(int i2, InterfaceC1891350zJl interfaceC1891350zJl) {
                    }

                    @Override // X.InterfaceC654580Plw
                    public final void LJFF(FixedRatioFrameLayout fixedRatioFrameLayout) {
                        AbstractC654530Plr abstractC654530PlrHp = this.LIZ.hp();
                        if ((fixedRatioFrameLayout instanceof FixedRatioFrameLayout) && fixedRatioFrameLayout != null) {
                            ViewGroup.LayoutParams layoutParams = fixedRatioFrameLayout.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(abstractC654530PlrHp.LIZ.getHeight())));
                                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                                C786410Ut5.W5(fixedRatioFrameLayout, layoutParams);
                                fixedRatioFrameLayout.setWhRatio(abstractC654530PlrHp.LIZ.getWidth() / abstractC654530PlrHp.LIZ.getHeight());
                                fixedRatioFrameLayout.setMode(0);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }

                    @Override // X.InterfaceC654580Plw
                    public final void LJLJJI(int i2, InterfaceC1891350zJl interfaceC1891350zJl) {
                        if (!(interfaceC1891350zJl instanceof C655740Pno)) {
                            return;
                        }
                        this.LIZ.ip(i2, ((C655740Pno) interfaceC1891350zJl).LL, "search_result_show");
                    }

                    @Override // X.InterfaceC654580Plw
                    public final void LJ(InterfaceC1891350zJl interfaceC1891350zJl, int i2, View view, C661490Px5 c661490Px5, C1606420ruC c1606420ruC) {
                        C658530PsJ c658530PsJ;
                        BcmParams bcmParams;
                        Object obj7;
                        Object obj8;
                        Object obj9;
                        String livePlayerTag;
                        FirstScreenHelperAbility firstScreenHelperAbility;
                        Map<String, String> map;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        AwemeSearchAdModel searchAdInfo;
                        SearchLiveCollectionAssem searchLiveCollectionAssem = this.LIZ;
                        if (view instanceof C658530PsJ) {
                            c658530PsJ = (C658530PsJ) view;
                        } else {
                            c658530PsJ = null;
                        }
                        searchLiveCollectionAssem.getClass();
                        if (interfaceC1891350zJl instanceof C655740Pno) {
                            C655740Pno c655740Pno = (C655740Pno) interfaceC1891350zJl;
                            Aweme aweme = c655740Pno.LL;
                            if (C1010120cOQ.LJJIJLIJ(aweme)) {
                                C212367188v c212367188v = BcmParams.Companion;
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
                                    map = searchAdInfo.chainParamMap;
                                } else {
                                    map = null;
                                }
                                c212367188v.getClass();
                                bcmParams = C212367188v.LIZJ(map);
                                C724270Sb3 c724270Sb37 = searchLiveCollectionAssem.LLJI;
                                if (c724270Sb37 != null) {
                                    obj10 = c724270Sb37.LL;
                                } else {
                                    obj10 = null;
                                }
                                bcmParams.put("search_id", ((C652220Pi8) obj10).LLILLJJLI.LJIIJ);
                                C724270Sb3 c724270Sb38 = searchLiveCollectionAssem.LLJI;
                                if (c724270Sb38 != null) {
                                    obj11 = c724270Sb38.LL;
                                } else {
                                    obj11 = null;
                                }
                                bcmParams.put("search_result_id", ((C652220Pi8) obj11).LLILLJJLI.LJIJI);
                                C724270Sb3 c724270Sb39 = searchLiveCollectionAssem.LLJI;
                                if (c724270Sb39 != null) {
                                    obj12 = c724270Sb39.LL;
                                } else {
                                    obj12 = null;
                                }
                                bcmParams.put("list_item_id", ((C652220Pi8) obj12).LLILLJJLI.LJIJJ);
                            } else {
                                bcmParams = new BcmParams();
                                C724270Sb3 c724270Sb310 = searchLiveCollectionAssem.LLJI;
                                if (c724270Sb310 != null) {
                                    obj7 = c724270Sb310.LL;
                                } else {
                                    obj7 = null;
                                }
                                bcmParams.put("search_id", ((C652220Pi8) obj7).LLILLJJLI.LJIIJ);
                                C724270Sb3 c724270Sb311 = searchLiveCollectionAssem.LLJI;
                                if (c724270Sb311 != null) {
                                    obj8 = c724270Sb311.LL;
                                } else {
                                    obj8 = null;
                                }
                                bcmParams.put("search_result_id", ((C652220Pi8) obj8).LLILLJJLI.LJIJI);
                                C724270Sb3 c724270Sb312 = searchLiveCollectionAssem.LLJI;
                                if (c724270Sb312 != null) {
                                    obj9 = c724270Sb312.LL;
                                } else {
                                    obj9 = null;
                                }
                                bcmParams.put("list_item_id", ((C652220Pi8) obj9).LLILLJJLI.LJIJJ);
                            }
                            BtmSDK btmSDK = BtmSDK.INSTANCE;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("c8929.d2722_i");
                            sbLIZ.append(i2);
                            String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(searchLiveCollectionAssem.LJJIJL()), bcmParams);
                            C0Q00 c0q00 = C0Q00.LIZ;
                            C654590Plx c654590Plx = searchLiveCollectionAssem.LLJLLIL;
                            C652190Pi5 c652190Pi5 = searchLiveCollectionAssem.LLLIIIIL;
                            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                            enterRoomConfig.mLogData.sourceBtmToken = strCreateJumpSourceBtmToken;
                            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                            C655900Po4 c655900Po4 = C655900Po4.LIZ;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            InterfaceC655080Pmk anchorType = c655740Pno.getAnchorType();
                            c655900Po4.getClass();
                            C655900Po4.LIZ(linkedHashMap, anchorType);
                            roomsData.gamePartnershipExtra = linkedHashMap;
                            if (c658530PsJ != null) {
                                livePlayerTag = c658530PsJ.getLivePlayerTag();
                            } else {
                                livePlayerTag = null;
                            }
                            View viewLJJIJL = searchLiveCollectionAssem.LJJIJL();
                            Context context = searchLiveCollectionAssem.LJJIJL().getContext();
                            c0q00.getClass();
                            C0Q00.LIZJ(aweme, c654590Plx, c652190Pi5, enterRoomConfig, livePlayerTag, viewLJJIJL, context);
                            searchLiveCollectionAssem.ip(i2, aweme, "search_result_click");
                            if (C0BRN.LIZ() && (firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZ(C1558360qeg.LJ(searchLiveCollectionAssem.LJJIJL(), null), FirstScreenHelperAbility.class, null)) != null) {
                                firstScreenHelperAbility.Am();
                            }
                            ((C652260PiC) searchLiveCollectionAssem.LLJLLL.getValue()).LIZIZ(aweme);
                        }
                    }
                });
            }
            C0VWN.LIZ("search_multi_live", false).LIZIZ(ep().pm());
            this.LLLII = false;
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C652220Pi8 c652220Pi8) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C652220Pi8 c652220Pi8) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void ip(int i, Aweme aweme, String str) {
        Object obj;
        LLLILZLLLI.getClass();
        int iLIZ = C653520PkE.LIZ(aweme);
        int i2 = ViewOnAttachStateChangeListenerC655110Pmn.LLLLII;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C653660PkS c653660PkS = ((C652220Pi8) obj).LLILLJJLI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        }
        ((C652220Pi8) obj2).LL.getSearchCardInfo();
        C654840PmM.LIZJ(str, aweme, c653660PkS, i, LJJIJL(), i, "", iLIZ, C654840PmM.LIZIZ(LJJIJL()), "live_card", null, null, 6144);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0Pi5] */
    public SearchLiveCollectionAssem(InterfaceC641090PCp interfaceC641090PCp, Fragment fragment, View view, Fragment fragment2, SearchContextAbilityImpl searchContextAbilityImpl) {
        this.LLJJJJ = searchContextAbilityImpl;
        this.LLJJJJJIL = interfaceC641090PCp;
        this.LLJJJJLIIL = fragment;
        this.LLJJL = view;
        this.LLJJLIIIJLLLLLLLZ = fragment2;
        this.LLJZIJLIL = (ClickSearchViewModel) ViewModelProviders.of(fragment).get(ClickSearchViewModel.class);
    }

    public static void kp(SearchLiveCollectionAssem searchLiveCollectionAssem, List list, SearchCardInfo searchCardInfo, Long l, int i) {
        boolean z;
        int iIntValue;
        Object obj;
        long jLongValue;
        SearchCardInfo searchCardInfo2 = searchCardInfo;
        if ((i & 2) != 0) {
            searchCardInfo2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        int i2 = 0;
        if ((i & 8) != 0) {
            z = true;
            searchLiveCollectionAssem.LLJLLIL = null;
            searchLiveCollectionAssem.dp().clear();
            ((AtomicInteger) searchLiveCollectionAssem.LLLF.getValue()).set(0);
        } else {
            z = false;
        }
        searchLiveCollectionAssem.LLLFZ = list;
        if (searchLiveCollectionAssem.dp().isEmpty()) {
            searchLiveCollectionAssem.lp(list);
        }
        Pair<Aweme, Integer> pair = searchLiveCollectionAssem.dp().get(((Aweme) ListProtector.get(list, 0)).getAid());
        int iIntValue2 = -1;
        if (pair != null) {
            iIntValue = pair.getSecond().intValue();
        } else {
            iIntValue = -1;
        }
        searchLiveCollectionAssem.LLLFF = iIntValue;
        Pair<Aweme, Integer> pair2 = searchLiveCollectionAssem.dp().get(((Aweme) ListProtector.get(list, list.size() - 1)).getAid());
        if (pair2 != null) {
            iIntValue2 = pair2.getSecond().intValue();
        }
        searchLiveCollectionAssem.LLLFFI = iIntValue2;
        if (searchLiveCollectionAssem.LLJLLIL == null) {
            C724270Sb3 c724270Sb3 = searchLiveCollectionAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            C653660PkS c653660PkS = ((C652220Pi8) obj).LLILLJJLI;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            searchLiveCollectionAssem.LLJLLIL = new C654590Plx(searchCardInfo2, c653660PkS, list, jLongValue, 16);
        }
        InterfaceC652300PiG interfaceC652300PiGEp = searchLiveCollectionAssem.ep();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new C655740Pno((Aweme) obj2, new C652290PiF(EnumC655550PnV.ICON_COUNT, 2), EnumC656150PoT.AUTHOR));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        interfaceC652300PiGEp.j4(arrayList, z);
    }
}
