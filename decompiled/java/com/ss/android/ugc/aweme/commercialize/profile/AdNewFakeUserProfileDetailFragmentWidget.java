package com.ss.android.ugc.aweme.commercialize.profile;

import X.AbstractC480470Isn;
import X.C01GW;
import X.C1017180cZo;
import X.C1022820ciu;
import X.C1035130d2l;
import X.C1039050d95;
import X.C1051930dTr;
import X.C1051950dTt;
import X.C1077470e93;
import X.C1077480e94;
import X.C1260280itu;
import X.C1260300itw;
import X.C128Y;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1848410yCV;
import X.C19EH;
import X.C2184171Adz;
import X.C2187701Ajg;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C442330HWd;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1051960dTu;
import X.InterfaceC1056670dbV;
import X.InterfaceC1258040iqI;
import X.InterfaceC1260330itz;
import X.ViewTreeObserverOnGlobalLayoutListenerC1077380e8u;
import Y.ACListenerS22S0301000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spark.AdSparkFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import mf.a;

/* JADX INFO: loaded from: classes17.dex */
public final class AdNewFakeUserProfileDetailFragmentWidget extends AbsAdProfileWidget implements InterfaceC1051960dTu {
    public ScrollView LLJILLL;
    public WebView LLJJ;
    public C442330HWd<Fragment> LLJJIII;
    public AdSparkFragment LLJJIJI;
    public AdFakeUserProfileAwemeListFragment LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public Function0<Unit> LLJJJIL;
    public AwemeRawAd LLJJJJ;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 182));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 181));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 183));
    public final List<Fragment> LLJJI = new ArrayList();

    @Override // X.InterfaceC1051960dTu
    public final void LJIIJJI(int i) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1260280itu LJIJ() {
        return (C1260280itu) this.LLJIJIL.getValue();
    }

    public final void LJIJJLI() {
        C1039050d95 c1039050d95;
        AdSparkFragment adSparkFragment = this.LLJJIJI;
        InterfaceC1056670dbV interfaceC1056670dbVZR = null;
        if ((adSparkFragment instanceof AdSparkFragment) && adSparkFragment != null) {
            interfaceC1056670dbVZR = adSparkFragment.ZR();
        }
        if (!(interfaceC1056670dbVZR instanceof C1039050d95) || (c1039050d95 = (C1039050d95) interfaceC1056670dbVZR) == null) {
            return;
        }
        c1039050d95.LLJILLL = new ARunnableS116S0100000_16(this, 39);
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [X.0HWd, X.0HWd<androidx.fragment.app.Fragment>] */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILL(C1035130d2l c1035130d2l) {
        AwemeRawAd awemeRawAd;
        FragmentManager childFragmentManager;
        String uid;
        String secUid;
        String aid;
        String advId;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        String str;
        ViewPager viewPager;
        final FragmentManager childFragmentManager2;
        AwemeRawAd awemeRawAd4;
        NativeSiteConfig nativeSiteConfig;
        AwemeRawAd awemeRawAd5;
        User author;
        User author2;
        super.LJIILL(c1035130d2l);
        Aweme aweme = this.LLIZLLLIL;
        LinearLayout linearLayout = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LLJJJJ = awemeRawAd;
        Fragment fragment = this.LLJ;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            Bundle bundle = new Bundle();
            Aweme aweme2 = this.LLIZLLLIL;
            if (aweme2 != null && (author2 = aweme2.getAuthor()) != null) {
                uid = author2.getUid();
            } else {
                uid = null;
            }
            C786410Ut5.LJJJI("user_id", uid, bundle);
            Aweme aweme3 = this.LLIZLLLIL;
            if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                secUid = author.getSecUid();
            } else {
                secUid = null;
            }
            C786410Ut5.LJJJI("sec_user_id", secUid, bundle);
            Aweme aweme4 = this.LLIZLLLIL;
            if (aweme4 != null) {
                aid = aweme4.getAid();
            } else {
                aid = null;
            }
            C786410Ut5.LJJJI("aweme_id", aid, bundle);
            Aweme aweme5 = this.LLIZLLLIL;
            if (aweme5 != null && (awemeRawAd5 = aweme5.getAwemeRawAd()) != null) {
                advId = awemeRawAd5.getAdvId();
            } else {
                advId = null;
            }
            C786410Ut5.LJJJI("adv_id", advId, bundle);
            Aweme aweme6 = this.LLIZLLLIL;
            if (aweme6 != null) {
                awemeRawAd2 = aweme6.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            AdFakeUserProfileAwemeListFragment adFakeUserProfileAwemeListFragment = new AdFakeUserProfileAwemeListFragment();
            adFakeUserProfileAwemeListFragment.LLJIJIL = awemeRawAd2;
            adFakeUserProfileAwemeListFragment.setArguments(bundle);
            this.LLJJIJIIJIL = adFakeUserProfileAwemeListFragment;
            ((ArrayList) this.LLJJI).add(adFakeUserProfileAwemeListFragment);
            Aweme aweme7 = this.LLIZLLLIL;
            if (aweme7 != null && (awemeRawAd3 = aweme7.getAwemeRawAd()) != null && C1017180cZo.LJJIJ(awemeRawAd3) && C1017180cZo.LJIIJJI(awemeRawAd3)) {
                Aweme aweme8 = this.LLIZLLLIL;
                if (aweme8 != null && (awemeRawAd4 = aweme8.getAwemeRawAd()) != null && (nativeSiteConfig = awemeRawAd4.getNativeSiteConfig()) != null) {
                    str = nativeSiteConfig.lynxScheme;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                View view = (View) this.LLJILJIL.getValue();
                if (view != null) {
                    int visibility = view.getVisibility();
                    view.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, view);
                }
                ViewPager viewPager2 = (ViewPager) this.LLJILJILJ.getValue();
                if (viewPager2 != null) {
                    C786410Ut5.LLJ(viewPager2, 0);
                }
                this.LLJJIJI = new AdSparkFragment(true);
                LJIJJLI();
                AdSparkFragment adSparkFragment = this.LLJJIJI;
                if (adSparkFragment != null) {
                    ListProtector.add(this.LLJJI, 0, adSparkFragment);
                }
                Fragment fragment2 = this.LLJ;
                if (fragment2 != null && (childFragmentManager2 = fragment2.getChildFragmentManager()) != null) {
                    final List<Fragment> list = this.LLJJI;
                    this.LLJJIII = new AbstractC480470Isn(childFragmentManager2, list) { // from class: X.0HWd
                        public final List<? extends T> LLIZ;

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final int getCount() {
                            return this.LLIZ.size();
                        }

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final int LJIJJ(Object obj) {
                            if (C13LP.LJJJJ(obj, this.LLIZ)) {
                                return this.LLIZ.indexOf(obj);
                            }
                            return -2;
                        }

                        @Override // X.AbstractC480470Isn
                        public final Fragment LJJIJIL(int i) {
                            return (Fragment) ListProtector.get(this.LLIZ, i);
                        }

                        {
                            this.LLIZ = list;
                        }
                    };
                }
                ViewPager viewPager3 = (ViewPager) this.LLJILJILJ.getValue();
                if (viewPager3 != null) {
                    viewPager3.setAdapter(this.LLJJIII);
                }
                C1051950dTt c1051950dTt = (C1051950dTt) this.LLJILJIL.getValue();
                if (c1051950dTt != null && (viewPager = (ViewPager) this.LLJILJILJ.getValue()) != null && viewPager.getAdapter() != null) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(R.drawable.a3f), Integer.valueOf(R.raw.icon_3pt_video));
                    int count = viewPager.getAdapter().getCount();
                    if (count > 0) {
                        LinearLayout linearLayout2 = c1051950dTt.LL;
                        if (linearLayout2 == null) {
                            linearLayout2 = null;
                        }
                        C786410Ut5.LJJJJJL(linearLayout2);
                        int i = 0;
                        do {
                            Context context = c1051950dTt.getContext();
                            LinearLayout linearLayout3 = c1051950dTt.LL;
                            if (linearLayout3 == null) {
                                linearLayout3 = null;
                            }
                            int iIntValue = ((Number) ListProtector.get(listLJIIJJI, i)).intValue();
                            C1051930dTr c1051930dTr = (C1051930dTr) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ejk, linearLayout3, false);
                            c1051930dTr.setImageResource(iIntValue);
                            c1051930dTr.setAnimationEnabled(true);
                            View.OnClickListener aCListenerS22S0301000_16 = new ACListenerS22S0301000_16(c1051950dTt, this, i, viewPager, 0);
                            if (C1848410yCV.LIZ) {
                                aCListenerS22S0301000_16 = new f(aCListenerS22S0301000_16);
                            }
                            a aVar = new a(aCListenerS22S0301000_16);
                            if (C2213981Bky.LIZIZ.isOffline()) {
                                C2211941Bhg.LIZ.injectViewListener(c1051930dTr);
                            }
                            c1051930dTr.setOnClickListener(aVar);
                            LinearLayout linearLayout4 = c1051950dTt.LL;
                            if (linearLayout4 == null) {
                                linearLayout4 = null;
                            }
                            linearLayout4.addView(c1051930dTr);
                            i++;
                        } while (i < count);
                        LinearLayout linearLayout5 = c1051950dTt.LL;
                        if (linearLayout5 != null) {
                            linearLayout = linearLayout5;
                        }
                        C1051930dTr c1051930dTr2 = (C1051930dTr) linearLayout.getChildAt(0);
                        if (c1051930dTr2 != null) {
                            c1051950dTt.LLILLL = c1051930dTr2;
                            c1051930dTr2.setSelected(true);
                        }
                        C1077470e93 c1077470e93 = c1051950dTt.LLILZIL;
                        if (c1077470e93 != null) {
                            viewPager.removeOnPageChangeListener(c1077470e93);
                        }
                        C1077470e93 c1077470e932 = new C1077470e93(c1051950dTt, this, 1);
                        c1051950dTt.LLILZIL = c1077470e932;
                        viewPager.addOnPageChangeListener(c1077470e932);
                        ViewTreeObserver viewTreeObserver = c1051950dTt.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            ViewTreeObserverOnGlobalLayoutListenerC1077380e8u viewTreeObserverOnGlobalLayoutListenerC1077380e8u = new ViewTreeObserverOnGlobalLayoutListenerC1077380e8u(viewTreeObserver, c1051950dTt, viewPager, 0);
                            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1077380e8u);
                            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1077380e8u, ViewTreeObserver.OnGlobalLayoutListener.class);
                        }
                    }
                }
                ViewPager viewPager4 = (ViewPager) this.LLJILJILJ.getValue();
                if (viewPager4 != null) {
                    viewPager4.addOnPageChangeListener(new C1077480e94(this, 1));
                }
            } else {
                View view2 = (View) this.LLJILJIL.getValue();
                if (view2 != null) {
                    int visibility2 = view2.getVisibility();
                    view2.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility2, 8, view2);
                }
                ViewPager viewPager5 = (ViewPager) this.LLJILJILJ.getValue();
                if (viewPager5 != null) {
                    C786410Ut5.LLJ(viewPager5, 8);
                }
                C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
                AdFakeUserProfileAwemeListFragment adFakeUserProfileAwemeListFragment2 = this.LLJJIJIIJIL;
                if (adFakeUserProfileAwemeListFragment2 != null) {
                    c19ehLJIIJ.LJIJ(R.id.hld, adFakeUserProfileAwemeListFragment2, null);
                    c19ehLJIIJ.LJIIIZ();
                }
                FrameLayout frameLayout = (FrameLayout) LJIILLIIL(R.id.hld);
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
            }
            C1260280itu c1260280ituLJIJ = LJIJ();
            if (c1260280ituLJIJ != null) {
                c1260280ituLJIJ.setOnScrollListener(new InterfaceC1260330itz() { // from class: X.0dTs
                    @Override // X.InterfaceC1260330itz
                    public final boolean onScrollEnd() {
                        return false;
                    }

                    @Override // X.InterfaceC1260330itz
                    public final void onScroll(int i2, int i3) {
                        C1260280itu c1260280ituLJIJ2;
                        List<Fragment> list2 = this.LL.LLJJI;
                        if (list2 != null && !((ArrayList) list2).isEmpty() && this.LL.LJIJ() != null && (c1260280ituLJIJ2 = this.LL.LJIJ()) != null) {
                            c1260280ituLJIJ2.setCanScrollUp(true);
                        }
                    }

                    @Override // X.InterfaceC1260330itz
                    public final void onScrolled(float f, float f2) {
                        List<Fragment> list2;
                        C1260280itu c1260280ituLJIJ2;
                        AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget = this.LL;
                        if (adNewFakeUserProfileDetailFragmentWidget.LLILZLL && (list2 = adNewFakeUserProfileDetailFragmentWidget.LLJJI) != null && !((ArrayList) list2).isEmpty() && this.LL.LJIJ() != null && (c1260280ituLJIJ2 = this.LL.LJIJ()) != null) {
                            c1260280ituLJIJ2.setCanScrollUp(true);
                        }
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIIZILJ(boolean z) throws Throwable {
        String str;
        AwemeRawAd awemeRawAd;
        NativeSiteConfig nativeSiteConfig;
        if (z) {
            Aweme aweme = this.LLIZLLLIL;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) != null) {
                str = nativeSiteConfig.lynxScheme;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                HandlerHook.viewPostDelay(this.LLILLL, new ARunnableS116S0100000_16(this, 38), 500L);
            }
            if (this.LLJJIJI == null) {
                LJIJI(0);
                AdFakeUserProfileAwemeListFragment adFakeUserProfileAwemeListFragment = this.LLJJIJIIJIL;
                if (adFakeUserProfileAwemeListFragment != null) {
                    adFakeUserProfileAwemeListFragment.setUserVisibleHint(true);
                }
            }
        }
    }

    public final void LJIJI(int i) {
        C1260280itu c1260280ituLJIJ;
        C1260300itw helper;
        C1260280itu c1260280ituLJIJ2;
        C1260300itw helper2;
        C1260300itw helper3;
        C1260300itw helper4;
        if (i >= 0 && i < ((ArrayList) this.LLJJI).size() && LJIJ() != null) {
            C128Y c128y = (Fragment) ListProtector.get(this.LLJJI, i);
            int i2 = this.LLJJIJIL;
            if (i != i2 && i2 >= 0 && i2 < ((ArrayList) this.LLJJI).size()) {
                ((Fragment) ListProtector.get(this.LLJJI, this.LLJJIJIL)).setUserVisibleHint(false);
            }
            this.LLJJIJIL = i;
            if (c128y instanceof AdFakeUserProfileAwemeListFragment) {
                C1260280itu c1260280ituLJIJ3 = LJIJ();
                if (c1260280ituLJIJ3 != null && (helper4 = c1260280ituLJIJ3.getHelper()) != null) {
                    helper4.LIZIZ = (InterfaceC1258040iqI) c128y;
                }
            } else if (c128y instanceof SparkFragment) {
                C1260280itu c1260280ituLJIJ4 = LJIJ();
                if (c1260280ituLJIJ4 != null && (helper3 = c1260280ituLJIJ4.getHelper()) != null) {
                    helper3.LIZIZ = null;
                }
                ScrollView scrollView = this.LLJILLL;
                if (scrollView != null && (c1260280ituLJIJ2 = LJIJ()) != null && (helper2 = c1260280ituLJIJ2.getHelper()) != null) {
                    helper2.LIZ = scrollView;
                }
                WebView webView = this.LLJJ;
                if (webView != null && (c1260280ituLJIJ = LJIJ()) != null && (helper = c1260280ituLJIJ.getHelper()) != null) {
                    helper.LIZ = webView;
                }
            }
            C1260280itu c1260280ituLJIJ5 = LJIJ();
            if (c1260280ituLJIJ5 != null) {
                c1260280ituLJIJ5.setCanScrollUp(true);
            }
        }
    }

    @Override // X.InterfaceC1051960dTu
    public final void onSelect(int i) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "otherclick", this.LLJJJJ);
        c1022820ciuLIZLLL.LIZJ("swipe", "refer");
        c1022820ciuLIZLLL.LJII();
    }
}
