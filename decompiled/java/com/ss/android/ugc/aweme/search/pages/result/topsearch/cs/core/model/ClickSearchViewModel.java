package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model;

import X.AbstractC683590Qrd;
import X.C01GW;
import X.C07F3;
import X.C07F4;
import X.C0CVQ;
import X.C0PBG;
import X.C0PEM;
import X.C0PGD;
import X.C0PGG;
import X.C0PL1;
import X.C0PQX;
import X.C0PR3;
import X.C0PU0;
import X.C0PU8;
import X.C0PUB;
import X.C1202104n5;
import X.C1388190mED;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1840807Iw;
import X.C1954807lC;
import X.C19EG;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2487409ou;
import X.C326401Ok;
import X.C423520Gj8;
import X.C452501pT;
import X.C640690PBb;
import X.C645130PSd;
import X.C645510PTp;
import X.C645520PTq;
import X.C645550PTt;
import X.C647350PaH;
import X.C647500PaW;
import X.C653660PkS;
import X.EnumC645530PTr;
import X.EnumC645590PTx;
import X.EnumC645610PTz;
import X.InterfaceC594520NTm;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class ClickSearchViewModel extends ViewModel {
    public WeakReference<Fragment> LL;
    public InterfaceC594520NTm LLILZ;
    public SearchMixFeed LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(333));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(335));
    public Integer LLIZ = -1;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(334));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(331));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(332));

    public final void CQ2() {
        Fragment fragment;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility;
        Fragment fragment2;
        InterfaceC594520NTm interfaceC594520NTm = this.LLILZ;
        if (interfaceC594520NTm != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeCard ");
            WeakReference<Fragment> weakReference = this.LL;
            Boolean boolValueOf = null;
            sbLIZ.append((weakReference == null || (fragment2 = weakReference.get()) == null) ? null : C1558520qew.LIZ(C1558360qeg.LJFF(fragment2, null), SearchServiceCenter$AdapterControlAbility.class, null));
            C2188811AlT.LIZIZ(sbLIZ);
            WeakReference<Fragment> weakReference2 = this.LL;
            if (weakReference2 != null && (fragment = weakReference2.get()) != null && (searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), SearchServiceCenter$AdapterControlAbility.class, null)) != null) {
                boolValueOf = Boolean.valueOf(searchServiceCenter$AdapterControlAbility.vb(interfaceC594520NTm, C0PL1.CLICK_SEARCH_CARD));
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                this.LLJIJIL = false;
            }
        }
    }

    public final void EQ2() {
        Fragment fragment;
        SearchFragment searchFragment;
        WeakReference<Fragment> weakReference = this.LL;
        if (weakReference == null || (fragment = weakReference.get()) == null || !(fragment instanceof SearchFragment) || (searchFragment = (SearchFragment) fragment) == null || searchFragment.BS().getItemAnimator() != null) {
            return;
        }
        searchFragment.BS().setItemAnimator(((Number) C1840807Iw.LIZ.getValue()).intValue() != 0 ? new C423520Gj8() { // from class: X.0PYF
            {
                long jIntValue = ((Number) C1840807Iw.LIZ.getValue()).intValue();
                this.LLILLL = jIntValue;
                this.LLILZ = jIntValue;
                this.LLILZLL = jIntValue;
                this.LLILZIL = jIntValue;
            }
        } : new C423520Gj8());
    }

    public final void reset() {
        ((C645550PTt) this.LLJILJILJ.getValue()).reset();
        C0PR3 c0pr3 = (C0PR3) this.LLJILLL.getValue();
        if (c0pr3 != null) {
            c0pr3.reset();
        }
        xQ2().setValue(null);
    }

    public final NextLiveData<C645520PTq> xQ2() {
        return (NextLiveData) this.LLILLJJLI.getValue();
    }

    public final boolean yQ2() {
        SearchJediMixFeedFragment searchJediMixFeedFragment;
        C645130PSd c645130PSd;
        try {
            WeakReference<Fragment> weakReference = this.LL;
            Fragment fragment = weakReference != null ? weakReference.get() : null;
            if ((fragment instanceof SearchJediMixFeedFragment) && (searchJediMixFeedFragment = (SearchJediMixFeedFragment) fragment) != null) {
                AbstractC683590Qrd<SearchMixFeed> abstractC683590QrdNS = searchJediMixFeedFragment.NS();
                this.LLJIJIL = (!(abstractC683590QrdNS instanceof C645130PSd) || (c645130PSd = (C645130PSd) abstractC683590QrdNS) == null) ? this.LLJIJIL : c645130PSd.LLLLLJLJLL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return this.LLJIJIL;
    }

    public final void FQ2() {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            ((LiveData) this.LLILLL.getValue()).setValue(null);
            return;
        }
        C640690PBb.LIZ.getClass();
        if (C640690PBb.LIZIZ.enablePostValue) {
            C2487409ou.LIZJ(new ARunnableS73S0200000_4(this, 54));
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LJ(C2107308Nj.LIZ, new C0CVQ(this, null, null));
        }
    }

    public static boolean AQ2(EnumC645610PTz enumC645610PTz) {
        boolean zLJJIJ = C1202104n5.LIZ().LJJIJ(enumC645610PTz);
        switch (C0PU0.LIZIZ[enumC645610PTz.ordinal()]) {
            case 1:
                if (!zLJJIJ && !C07F3.LIZ() && !C1202104n5.LIZ().LJII()) {
                    return false;
                }
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return C07F4.LIZ();
            default:
                return zLJJIJ;
        }
    }

    public final void BQ2(Observer<C0PQX> observer) {
        Fragment fragment;
        boolean z;
        boolean z2;
        WeakReference<Fragment> weakReference = this.LL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            C645550PTt c645550PTt = (C645550PTt) this.LLJILJILJ.getValue();
            C640690PBb.LIZ.getClass();
            AsyncLoadConfig asyncLoadConfig = C640690PBb.LIZIZ;
            boolean z3 = asyncLoadConfig.enablePostValue;
            C01GW c01gw = C326401Ok.LIZ;
            boolean z4 = false;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            c645550PTt.LIZJ(fragment, observer, z3, z);
            C0PR3 c0pr3 = (C0PR3) this.LLJILLL.getValue();
            if (c0pr3 != null) {
                boolean z5 = asyncLoadConfig.enablePostValue;
                if (((Number) c01gw.getValue()).intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0pr3.LIZJ(fragment, observer, z5, z2);
            }
            C0PR3 c0pr32 = (C0PR3) this.LLJJ.getValue();
            if (c0pr32 != null) {
                boolean z6 = asyncLoadConfig.enablePostValue;
                if (((Number) c01gw.getValue()).intValue() == 1) {
                    z4 = true;
                }
                c0pr32.LIZJ(fragment, observer, z6, z4);
            }
        }
    }

    public final void DQ2(int i) {
        C645520PTq value = xQ2().getValue();
        if (value != null && value.LIZ == i) {
            xQ2().setValue(new C645520PTq(i, EnumC645530PTr.FINISHED));
        }
    }

    public final int wQ2(int i) {
        Fragment fragment;
        AbstractC683590Qrd abstractC683590QrdNS;
        Integer numLLFFF;
        SearchFragment searchFragment;
        WeakReference<Fragment> weakReference = this.LL;
        C645130PSd c645130PSd = null;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if ((fragment instanceof SearchJediMixFeedFragment) && (searchFragment = (SearchFragment) fragment) != null) {
            abstractC683590QrdNS = searchFragment.NS();
        } else {
            abstractC683590QrdNS = null;
        }
        if (abstractC683590QrdNS instanceof C645130PSd) {
            c645130PSd = (C645130PSd) abstractC683590QrdNS;
        }
        if (c645130PSd == null || (numLLFFF = c645130PSd.LLFFF(i)) == null) {
            return -1;
        }
        return numLLFFF.intValue();
    }

    public final void GQ2(C653660PkS c653660PkS, int i) {
        SearchFragment searchFragment;
        C645130PSd c645130PSd;
        int iLLLLL;
        WeakReference<Fragment> weakReference = this.LL;
        Fragment fragment = null;
        if (weakReference != null) {
            fragment = weakReference.get();
        }
        if ((fragment instanceof SearchJediMixFeedFragment) && (searchFragment = (SearchFragment) fragment) != null) {
            AbstractC683590Qrd abstractC683590QrdNS = searchFragment.NS();
            if ((abstractC683590QrdNS instanceof C645130PSd) && (c645130PSd = (C645130PSd) abstractC683590QrdNS) != null && (iLLLLL = c645130PSd.LLLLL(i)) >= 0 && c653660PkS != null) {
                c653660PkS.LJJJLIIL = iLLLLL;
            }
        }
    }

    public final void HQ2(int i, boolean z) {
        Fragment fragment;
        SearchJediMixFeedFragment searchJediMixFeedFragment;
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zLJJIIZI;
        boolean z2;
        SearchMixFeed searchMixFeed;
        SearchMixFeed searchMixFeed2;
        DynamicPatch dynamicPatch;
        String str;
        SearchMixFeed searchMixFeed3;
        boolean z3;
        WeakReference<Fragment> weakReference = this.LL;
        C645130PSd c645130PSd = null;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if ((fragment instanceof SearchJediMixFeedFragment) && (searchJediMixFeedFragment = (SearchJediMixFeedFragment) fragment) != null) {
            this.LLIZ = Integer.valueOf(i);
            AbstractC683590Qrd<SearchMixFeed> abstractC683590QrdNS = searchJediMixFeedFragment.NS();
            if (abstractC683590QrdNS instanceof C645130PSd) {
                c645130PSd = (C645130PSd) abstractC683590QrdNS;
            }
            boolean zIsAweme = true;
            if (searchJediMixFeedFragment.yU(i) && !z) {
                i2 = i + 2;
                i3 = i + 1;
            } else {
                i2 = i + 1;
                i3 = i - 1;
            }
            if (c645130PSd != null) {
                if (c645130PSd.LLLLLLL(i2) || (!z && c645130PSd.LLLLLLLLLL(i3))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zBooleanValue = Boolean.valueOf(z3).booleanValue();
            } else {
                zBooleanValue = true;
            }
            this.LLIZLLLIL = zBooleanValue;
            if (c645130PSd != null) {
                List<T> list = c645130PSd.mmItems;
                if (list != 0 && (searchMixFeed3 = (SearchMixFeed) C13LP.LJJJLZIJ(i2 - c645130PSd.LLLLILI(), list)) != null) {
                    C645130PSd.LLLLLLLZIL(searchMixFeed3);
                }
                List<T> list2 = c645130PSd.mmItems;
                if (list2 != 0 && (searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i2 - c645130PSd.LLLLILI(), list2)) != null && (dynamicPatch = searchMixFeed2.getDynamicPatch()) != null && (str = dynamicPatch.schema) != null) {
                    zLJJIIZI = a0.LJJIIZI(str, "tiktok_ecommerce_click_search_product_card", false);
                } else {
                    zLJJIIZI = false;
                }
            } else {
                zLJJIIZI = true;
            }
            this.LLILZLL = zLJJIIZI;
            if (c645130PSd == null || c645130PSd.LLLLLLL(i2) || (!z && c645130PSd != null && c645130PSd.LLLLLLLLLL(i3))) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJ = z2;
            if (c645130PSd != null) {
                List<T> list3 = c645130PSd.mmItems;
                if (list3 != 0 && (searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i2 - c645130PSd.LLLLILI(), list3)) != null) {
                    zIsAweme = searchMixFeed.isAweme();
                } else {
                    zIsAweme = false;
                }
            }
            this.LLJI = zIsAweme;
        }
    }

    public final void zQ2(InterfaceC594520NTm interfaceC594520NTm, int i) {
        Fragment fragment;
        C19EG c19egLIZIZ;
        Lifecycle.State currentState;
        WeakReference<Fragment> weakReference = this.LL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Context context = fragment.getContext();
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            } else {
                c19egLIZIZ = null;
            }
            sAFHelper.getClass();
            Lifecycle lifecycleLJIIZILJ = SAFHelper.LJIIZILJ(fragment, c19egLIZIZ);
            if (lifecycleLJIIZILJ != null) {
                currentState = lifecycleLJIIZILJ.getCurrentState();
            } else {
                currentState = null;
            }
            if (currentState != Lifecycle.State.DESTROYED) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C0PBG(fragment, interfaceC594520NTm, i, this, null), 3);
            }
        }
    }

    public final void vQ2(EnumC645610PTz enumC645610PTz, String str, String str2, int i, Map<String, ? extends Object> map, EnumC645590PTx enumC645590PTx, C0PUB c0pub) {
        String str3;
        C645550PTt c645550PTt;
        C0PR3 c0pr3;
        Fragment fragment;
        String str4;
        String strSubstring;
        String str5;
        String str6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene ");
        sbLIZ.append(enumC645610PTz.name());
        sbLIZ.append(" exe ");
        sbLIZ.append(enumC645590PTx.name());
        sbLIZ.append("  triggerReason ");
        String str7 = null;
        if (c0pub != null) {
            str3 = c0pub.LIZJ;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        xQ2().setValue(new C645520PTq(i, EnumC645530PTr.DATA_FETCHING));
        if (enumC645590PTx == EnumC645590PTx.ECOM_RECOMMEND_PRODUCTS) {
            c645550PTt = (C645550PTt) this.LLJILJILJ.getValue();
        } else {
            c645550PTt = null;
        }
        if (enumC645590PTx == EnumC645590PTx.GENERAL && C0PU8.LIZ()) {
            WeakReference<Fragment> weakReference = this.LL;
            if (weakReference != null) {
                fragment = weakReference.get();
            } else {
                fragment = null;
            }
            if ((fragment instanceof SearchJediMixFeedFragment) && fragment != null) {
                if (c0pub != null) {
                    str4 = c0pub.LIZJ;
                } else {
                    str4 = null;
                }
                String strLIZJ = C0PU8.LIZJ(str4);
                C647500PaW c647500PaW = C647500PaW.LIZ;
                c647500PaW.getClass();
                if (!C647500PaW.LJFF(fragment, strLIZJ)) {
                    List listLIZIZ = C647350PaH.LIZIZ(strLIZJ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cacheData: ");
                    if (listLIZIZ != null && (str6 = (String) ListProtector.get(listLIZIZ, 0)) != null) {
                        strSubstring = str6.substring(0, 100);
                    } else {
                        strSubstring = null;
                    }
                    sbLIZ2.append(strSubstring);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Context context = fragment.getContext();
                    if (listLIZIZ != null) {
                        str5 = (String) C13LP.LJJJLZIJ(0, listLIZIZ);
                        str7 = (String) C13LP.LJJJLZIJ(1, listLIZIZ);
                    } else {
                        str5 = null;
                    }
                    C647500PaW.LJJIFFI(c647500PaW, context, fragment, strLIZJ, str5, null, false, C0PGG.LOCAL_CACHE_DATA, C0PGD.NON_FIRST_SCREEN, str7, false, 544);
                }
            }
        }
        int i2 = C0PU0.LIZ[enumC645590PTx.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    c0pr3 = (C0PR3) this.LLJJ.getValue();
                } else {
                    throw new C1954807lC();
                }
            } else {
                c0pr3 = (C0PR3) this.LLJILLL.getValue();
            }
        } else {
            c0pr3 = (C645550PTt) this.LLJILJILJ.getValue();
        }
        if (c0pr3 != null) {
            c0pr3.LIZ(enumC645610PTz, str, str2, i, map, new AwS150S0101000_10(this, i, 5), c0pub, new C645510PTp(c645550PTt, enumC645610PTz, str, str2, i, map, c0pub, this));
        }
    }
}
