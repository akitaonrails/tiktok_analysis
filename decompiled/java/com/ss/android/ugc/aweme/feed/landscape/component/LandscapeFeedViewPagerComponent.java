package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C01GW;
import X.C0AHX;
import X.C0RU3;
import X.C0SR4;
import X.C0SZ8;
import X.C0VWN;
import X.C1389300mG0;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C19EG;
import X.C2189821An6;
import X.C452501pT;
import X.C711330RvH;
import X.C713370RyZ;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import Y.ARunnableS22S0101000_11;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeViewPagerSelectedAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedViewPagerComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedViewPagerComponent extends BasePanelUIComponent implements LandscapeFeedViewPagerAbility, LandscapeViewPagerSelectedAbility, InterfaceC1554640qYg {
    public VerticalViewPager LLJIJIL;
    public int LLJILJIL;
    public C711330RvH LLJILLL;
    public C0SZ8 LLJJ;
    public Aweme LLJJI;
    public boolean LLJJIJIIJIL;
    public final CopyOnWriteArrayList<Function2<Integer, Boolean, Unit>> LLJILJILJ = new CopyOnWriteArrayList<>();
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 420));
    public final CopyOnWriteArrayList<Integer> LLJJIJI = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final void SB() {
        this.LLJJIJIIJIL = true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 802344177) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final Aweme BD1() {
        C0SR4 c0sr4;
        VerticalViewPager verticalViewPager = this.LLJIJIL;
        PagerAdapter adapter = verticalViewPager != null ? verticalViewPager.getAdapter() : null;
        if (!(adapter instanceof C713370RyZ) || (c0sr4 = (C0SR4) adapter) == null) {
            return null;
        }
        return c0sr4.getItem(this.LLJILJIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C0SZ8 D() {
        VerticalViewPager verticalViewPager;
        View childAt;
        VerticalViewPager verticalViewPager2 = this.LLJIJIL;
        if ((verticalViewPager2 != null ? verticalViewPager2.getCurrentItem() : 0) >= 1 && (verticalViewPager = this.LLJIJIL) != null) {
            for (int childCount = verticalViewPager.getChildCount() - 1; -1 < childCount; childCount--) {
                VerticalViewPager verticalViewPager3 = this.LLJIJIL;
                Object tag = (verticalViewPager3 == null || (childAt = verticalViewPager3.getChildAt(childCount)) == null) ? null : childAt.getTag(R.id.hu_);
                if (tag instanceof C0SZ8) {
                    VerticalViewPager verticalViewPager4 = this.LLJIJIL;
                    C0SZ8 c0sz8 = (C0SZ8) tag;
                    if (Go((verticalViewPager4 != null ? verticalViewPager4.getCurrentItem() : 0) - 1, c0sz8)) {
                        return c0sz8;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C0SZ8 F() {
        View childAt;
        VerticalViewPager verticalViewPager = this.LLJIJIL;
        int childCount = (verticalViewPager != null ? verticalViewPager.getChildCount() : 0) - 1;
        while (true) {
            Object tag = null;
            if (-1 >= childCount) {
                return null;
            }
            VerticalViewPager verticalViewPager2 = this.LLJIJIL;
            if (verticalViewPager2 != null && (childAt = verticalViewPager2.getChildAt(childCount)) != null) {
                tag = childAt.getTag(R.id.hu_);
            }
            if (tag instanceof C0SZ8) {
                VerticalViewPager verticalViewPager3 = this.LLJIJIL;
                C0SZ8 c0sz8 = (C0SZ8) tag;
                if (Go((verticalViewPager3 != null ? verticalViewPager3.getCurrentItem() : 0) + 1, c0sz8)) {
                    return c0sz8;
                }
            }
            childCount--;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final C0SZ8 LJLIL() {
        View childAt;
        VerticalViewPager verticalViewPager = this.LLJIJIL;
        int childCount = (verticalViewPager != null ? verticalViewPager.getChildCount() : 0) - 1;
        while (true) {
            if (-1 >= childCount) {
                return null;
            }
            VerticalViewPager verticalViewPager2 = this.LLJIJIL;
            Object tag = (verticalViewPager2 == null || (childAt = verticalViewPager2.getChildAt(childCount)) == null) ? null : childAt.getTag(R.id.hu_);
            C0SZ8 c0sz8 = tag instanceof C0SZ8 ? (C0SZ8) tag : null;
            VerticalViewPager verticalViewPager3 = this.LLJIJIL;
            if (Go(verticalViewPager3 != null ? verticalViewPager3.getCurrentItem() : 0, c0sz8)) {
                return c0sz8;
            }
            childCount--;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final int LJLLJ() {
        VerticalViewPager verticalViewPager = this.LLJIJIL;
        if (verticalViewPager != null) {
            return verticalViewPager.getCurrentItem();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final int getItemCount() {
        C711330RvH c711330RvH = this.LLJILLL;
        if (c711330RvH != null) {
            return c711330RvH.getCount();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility, com.ss.android.ugc.aweme.feed.landscape.LandscapeViewPagerSelectedAbility
    public final Aweme LLLLLJLJLL() {
        return d2(LJLLJ());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C0SZ8 c0sz8;
        View childAt;
        super.onDestroy();
        VerticalViewPager verticalViewPager = this.LLJIJIL;
        int childCount = (verticalViewPager != null ? verticalViewPager.getChildCount() : 0) - 1;
        while (true) {
            Object tag = null;
            if (-1 >= childCount) {
                break;
            }
            VerticalViewPager verticalViewPager2 = this.LLJIJIL;
            if (verticalViewPager2 != null && (childAt = verticalViewPager2.getChildAt(childCount)) != null) {
                tag = childAt.getTag(R.id.hu_);
            }
            if ((tag instanceof C0SZ8) && (c0sz8 = (C0SZ8) tag) != null) {
                c0sz8.onDestroyView();
            }
            childCount--;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), LandscapeViewPagerSelectedAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final VerticalViewPager sP1() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0SZ8 LJJIJIL(java.lang.String r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r5.LLJIJIL
            r3 = 0
            if (r0 == 0) goto L61
            int r2 = r0.getChildCount()
        L9:
            r4 = 0
            if (r3 >= r2) goto L63
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r5.LLJIJIL
            if (r0 == 0) goto L5f
            android.view.View r1 = r0.getChildAt(r3)
            if (r1 == 0) goto L5f
            r0 = 2131372693(0x7f0a2a95, float:1.8365456E38)
            java.lang.Object r1 = r1.getTag(r0)
        L1d:
            boolean r0 = r1 instanceof X.C0SZ8
            if (r0 == 0) goto L5c
            X.0SZ8 r1 = (X.C0SZ8) r1
            if (r1 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.hm()
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.getAid()
        L2f:
            boolean r0 = X.C2093608Ic.LIZJ(r0, r6)
            if (r0 == 0) goto L44
            if (r1 == 0) goto L42
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.hm()
        L3b:
            boolean r0 = X.C729510SjV.LJJIIZ(r0)
            if (r0 != 0) goto L44
            return r1
        L42:
            r0 = r4
            goto L3b
        L44:
            if (r1 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r1.hm()
        L4a:
            boolean r0 = X.C729510SjV.LJJIIZ(r4)
            if (r0 == 0) goto L59
            if (r1 == 0) goto L59
            X.0SZ8 r0 = r1.LJJIJIL(r6)
            if (r0 == 0) goto L59
            return r0
        L59:
            int r3 = r3 + 1
            goto L9
        L5c:
            r1 = r4
        L5d:
            r0 = r4
            goto L2f
        L5f:
            r1 = r4
            goto L1d
        L61:
            r2 = 0
            goto L9
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedViewPagerComponent.LJJIJIL(java.lang.String):X.0SZ8");
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final Aweme d2(int i) {
        C711330RvH c711330RvH = this.LLJILLL;
        if (c711330RvH != null) {
            return c711330RvH.getItem(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final int hu(Aweme aweme) {
        List<Aweme> listFg;
        C711330RvH c711330RvH = this.LLJILLL;
        if (c711330RvH != null && (listFg = c711330RvH.Fg()) != null) {
            int size = listFg.size();
            for (int i = 0; i < size; i++) {
                if (aweme != null && TextUtils.equals(((Aweme) ListProtector.get(listFg, i)).getAid(), aweme.getAid())) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0RvJ] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        VerticalViewPager verticalViewPager;
        C711330RvH c711330RvH;
        final LandscapeFragmentPanel landscapeFragmentPanel;
        LandscapeFeedVideoEventDispatcherAbility landscapeFeedVideoEventDispatcherAbility;
        final C0RU3 c0ru3BE2;
        int i;
        boolean z;
        boolean z2;
        String cid;
        Intent intent;
        String challengeId;
        C2189821An6 c2189821An6;
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.viewpager);
        if (viewFindViewById instanceof VerticalViewPager) {
            verticalViewPager = (VerticalViewPager) viewFindViewById;
        } else {
            verticalViewPager = null;
        }
        this.LLJIJIL = verticalViewPager;
        final Context context = getContext();
        if (context != null) {
            final Fragment fragment = getPanelContext().LJ;
            if (fragment != null && (landscapeFragmentPanel = (LandscapeFragmentPanel) this.LLJJIII.getValue()) != null && (landscapeFeedVideoEventDispatcherAbility = (LandscapeFeedVideoEventDispatcherAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedVideoEventDispatcherAbility.class, null)) != null && (c0ru3BE2 = landscapeFeedVideoEventDispatcherAbility.bE2()) != null) {
                final LayoutInflater layoutInflaterNe = C786410Ut5.ne(getPanelContext().LIZ());
                final ?? r9 = new View.OnTouchListener() { // from class: X.0RvJ
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return false;
                    }
                };
                boolean booleanExtra = true;
                if (Intrinsics.LJFF(C1389300mG0.LIZLLL(getPanelContext()), "homepage_hot")) {
                    i = 1;
                } else {
                    i = 2;
                }
                final BaseFeedPageParams baseFeedPageParamsNewBuilder = BaseFeedPageParams.Companion.newBuilder();
                baseFeedPageParamsNewBuilder.setAwemeFromPage(i);
                baseFeedPageParamsNewBuilder.setEventType(C1389300mG0.LIZLLL(getPanelContext()));
                C2189821An6 c2189821An62 = getPanelContext().LIZJ;
                if (c2189821An62 == null) {
                    c2189821An62 = new C2189821An6();
                }
                baseFeedPageParamsNewBuilder.setParam(c2189821An62);
                if (TextUtils.equals("from_profile_self", C1389300mG0.LIZLLL(getPanelContext())) || ((c2189821An6 = getPanelContext().LIZJ) != null && c2189821An6.isMyProfile())) {
                    z = true;
                } else {
                    z = false;
                }
                baseFeedPageParamsNewBuilder.setMyProfile(z);
                C2189821An6 c2189821An63 = getPanelContext().LIZJ;
                if (c2189821An63 != null && c2189821An63.isFromPostList()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                baseFeedPageParamsNewBuilder.setFromPostList(z2);
                baseFeedPageParamsNewBuilder.setPageType(C1389300mG0.LJ(getPanelContext()));
                C2189821An6 c2189821An64 = getPanelContext().LIZJ;
                String str = "";
                if (c2189821An64 == null || (cid = c2189821An64.getCid()) == null) {
                    cid = "";
                }
                baseFeedPageParamsNewBuilder.setCid(cid);
                C2189821An6 c2189821An65 = getPanelContext().LIZJ;
                if (c2189821An65 != null && (challengeId = c2189821An65.getChallengeId()) != null) {
                    str = challengeId;
                }
                baseFeedPageParamsNewBuilder.setChallengeId(str);
                C19EG c19egLIZ = getPanelContext().LIZ();
                if (c19egLIZ != null && (intent = c19egLIZ.getIntent()) != null) {
                    booleanExtra = intent.getBooleanExtra("is_original_caption", true);
                }
                baseFeedPageParamsNewBuilder.setIsOriginalCaption(booleanExtra);
                c711330RvH = new C713370RyZ(context, layoutInflaterNe, c0ru3BE2, fragment, r9, baseFeedPageParamsNewBuilder, landscapeFragmentPanel) { // from class: X.0RvH
                    public final Map<Integer, C711420RvQ> LLJL;

                    @Override // X.C713370RyZ, X.C0SR4
                    public final String LJJJLIIL() {
                        return "full_feed";
                    }

                    @Override // X.C0SR4
                    public final List<C711420RvQ> LJJJJIZL() {
                        return new ArrayList();
                    }

                    @Override // X.C0SR4
                    public final Collection LJJJJJ() {
                        return (Collection) C711310RvF.LIZIZ.getValue();
                    }

                    @Override // X.C713370RyZ
                    /* JADX INFO: renamed from: LJJLL */
                    public final C711360RvK LJJLI() {
                        final AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(682);
                        return new C711360RvK(aFwS243S0000000_11) { // from class: X.0RvG
                            {
                                AFwS243S0000000_11 aFwS243S0000000_112 = C711310RvF.LIZ;
                            }
                        };
                    }

                    @Override // X.C713370RyZ, X.C0SR4
                    public final /* bridge */ /* synthetic */ C711420RvQ LJJLI() {
                        return LJJLI();
                    }

                    @Override // X.C0SR4, X.AbstractC714000Rza
                    public final int LJJIL(int i2) {
                        Aweme item = getItem(i2);
                        if (item != null) {
                            for (Map.Entry entry : ((LinkedHashMap) this.LLJL).entrySet()) {
                                int iIntValue = ((Number) entry.getKey()).intValue();
                                Function1<C711340RvI, Boolean> function1 = ((C711420RvQ) entry.getValue()).LIZIZ;
                                BaseFeedPageParams baseFeedPageParams = this.LLJI;
                                String str2 = baseFeedPageParams.eventType;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                if (function1.invoke(new C711340RvI(item, i2, str2, baseFeedPageParams.awemeFromPage, baseFeedPageParams.pageType, baseFeedPageParams.param.getFrom(), null)).booleanValue()) {
                                    return iIntValue;
                                }
                            }
                            return 0;
                        }
                        return 0;
                    }

                    {
                        List list = (List) C711310RvF.LIZIZ.getValue();
                        list.add(LJJLI());
                        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
                        for (Object obj : list) {
                            linkedHashMap.put(Integer.valueOf(((C711420RvQ) obj).LIZ), obj);
                        }
                        this.LLJL = linkedHashMap;
                    }
                };
            } else {
                c711330RvH = 0;
            }
            this.LLJILLL = c711330RvH;
        }
        C711330RvH c711330RvH2 = this.LLJILLL;
        if (c711330RvH2 != null) {
            c711330RvH2.LLJILJILJ = (LandscapeFragmentPanel) this.LLJJIII.getValue();
        }
        VerticalViewPager verticalViewPager2 = this.LLJIJIL;
        if (verticalViewPager2 != null) {
            verticalViewPager2.setAdapter(this.LLJILLL);
        }
        if (((Boolean) C0AHX.LIZ.getValue()).booleanValue()) {
            C0VWN.LIZ("landscape_feed_viewpager", false).LJFF(this.LLJIJIL);
        }
        VerticalViewPager verticalViewPager3 = this.LLJIJIL;
        if (verticalViewPager3 != null) {
            verticalViewPager3.LIZJ(new InterfaceC469360Ias() { // from class: X.0SW2
                public boolean LL = true;
                public int LLILLJJLI = -1;
                public boolean LLILLL;

                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i2) {
                    String str2;
                    if (i2 == 0 && this.LLILLL) {
                        this.LLILLL = false;
                        C726690Sex c726690Sex = C726690Sex.LIZIZ;
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = new Pair("enter_from", C1389300mG0.LIZLLL(this.LLILZ.getPanelContext()));
                        if (this.LLILZ.LLJJIJIIJIL) {
                            str2 = "profile_list";
                        } else {
                            str2 = "scroll";
                        }
                        pairArr[1] = new Pair("scroll_initiated_from", str2);
                        c726690Sex.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
                        this.LLILZ.LLJJIJIIJIL = false;
                    }
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i2) {
                    String aid;
                    String aid2;
                    int pageType;
                    boolean z3;
                    Aweme awemeM199clone;
                    Aweme awemeM199clone2;
                    String str2;
                    String str3;
                    String aid3;
                    String authorUid;
                    String requestId;
                    String requestId2;
                    String aid4;
                    String authorUid2;
                    String requestId3;
                    String requestId4;
                    Aweme awemeD2 = this.LLILZ.d2(i2);
                    boolean z4 = true;
                    String eventType = null;
                    if (!this.LL) {
                        LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent = this.LLILZ;
                        if (i2 > landscapeFeedViewPagerComponent.LLJILJIL) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Aweme aweme = landscapeFeedViewPagerComponent.LLJJI;
                        if (aweme != null) {
                            awemeM199clone = aweme.m199clone();
                        } else {
                            awemeM199clone = null;
                        }
                        if (awemeD2 != null) {
                            awemeM199clone2 = awemeD2.m199clone();
                        } else {
                            awemeM199clone2 = null;
                        }
                        if (z3) {
                            str2 = "landscape_screen_slide_next";
                        } else {
                            str2 = "landscape_screen_slide_previous";
                        }
                        if (landscapeFeedViewPagerComponent.LLJJIJI.contains(Integer.valueOf(i2))) {
                            landscapeFeedViewPagerComponent.LLJJIJI.remove(Integer.valueOf(i2));
                            str3 = "1";
                        } else {
                            str3 = "2";
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        if (awemeM199clone != null) {
                            aid3 = awemeM199clone.getAid();
                        } else {
                            aid3 = null;
                        }
                        c2344009Gk.LJIIIIZZ("from_group_id", aid3);
                        if (awemeM199clone != null) {
                            authorUid = AwemeExtKt.getAuthorUid(awemeM199clone);
                        } else {
                            authorUid = null;
                        }
                        c2344009Gk.LJIIIIZZ("from_author_id", authorUid);
                        if (awemeM199clone != null) {
                            requestId = awemeM199clone.getRequestId();
                        } else {
                            requestId = null;
                        }
                        c2344009Gk.LJIIIIZZ("from_request_id", requestId);
                        C611410NyV c611410NyV = C584850Mwl.LIZ;
                        if (awemeM199clone != null) {
                            requestId2 = awemeM199clone.getRequestId();
                        } else {
                            requestId2 = null;
                        }
                        c2344009Gk.LJIIIIZZ("from_log_pb", c611410NyV.LIZIZ(requestId2));
                        if (awemeM199clone2 != null) {
                            aid4 = awemeM199clone2.getAid();
                        } else {
                            aid4 = null;
                        }
                        c2344009Gk.LJIIIIZZ("to_group_id", aid4);
                        if (awemeM199clone2 != null) {
                            authorUid2 = AwemeExtKt.getAuthorUid(awemeM199clone2);
                        } else {
                            authorUid2 = null;
                        }
                        c2344009Gk.LJIIIIZZ("to_author_id", authorUid2);
                        if (awemeM199clone2 != null) {
                            requestId3 = awemeM199clone2.getRequestId();
                        } else {
                            requestId3 = null;
                        }
                        c2344009Gk.LJIIIIZZ("to_request_id", requestId3);
                        if (awemeM199clone2 != null) {
                            requestId4 = awemeM199clone2.getRequestId();
                        } else {
                            requestId4 = null;
                        }
                        c2344009Gk.LJIIIIZZ("to_log_pb", c611410NyV.LIZIZ(requestId4));
                        c2344009Gk.LJIIIIZZ("enter_method", str3);
                        C0SXF.LJFF(c2344009Gk, landscapeFeedViewPagerComponent.getPanelContext().LIZJ, awemeM199clone, landscapeFeedViewPagerComponent.getContext(), true);
                        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
                        if (i2 != this.LLILZ.LLJILJIL) {
                            this.LLILLL = true;
                        }
                    }
                    Aweme aweme2 = this.LLILZ.LLJJI;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (awemeD2 != null) {
                        aid2 = awemeD2.getAid();
                    } else {
                        aid2 = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(aid, aid2);
                    LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent2 = this.LLILZ;
                    landscapeFeedViewPagerComponent2.LLJILJIL = i2;
                    landscapeFeedViewPagerComponent2.LLJJI = landscapeFeedViewPagerComponent2.d2(i2);
                    if (zLJFF) {
                        this.LLILLJJLI = i2;
                        this.LL = false;
                        LandscapeFeedDataLoadLogicAbility landscapeFeedDataLoadLogicAbility = (LandscapeFeedDataLoadLogicAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), LandscapeFeedDataLoadLogicAbility.class, null);
                        if (landscapeFeedDataLoadLogicAbility != null) {
                            landscapeFeedDataLoadLogicAbility.vK1(i2);
                            return;
                        }
                        return;
                    }
                    C0SZ8 c0sz8 = this.LLILZ.LLJJ;
                    if (c0sz8 != null) {
                        if (i2 <= this.LLILLJJLI) {
                            z4 = false;
                        }
                        c0sz8.h(z4);
                    }
                    if (this.LLILZ.LJLIL() == null) {
                        LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent3 = this.LLILZ;
                        VerticalViewPager verticalViewPager4 = landscapeFeedViewPagerComponent3.LLJIJIL;
                        if (verticalViewPager4 != null) {
                            HandlerHook.viewPost(verticalViewPager4, new ARunnableS22S0101000_11(i2, landscapeFeedViewPagerComponent3, 3));
                        }
                    } else {
                        LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent4 = this.LLILZ;
                        landscapeFeedViewPagerComponent4.LLJJ = landscapeFeedViewPagerComponent4.LJLIL();
                        C0SZ8 c0sz82 = this.LLILZ.LLJJ;
                        if (c0sz82 != null) {
                            c0sz82.LJJIJIIJIL(i2);
                        }
                    }
                    LandscapeFragmentPanel landscapeFragmentPanel2 = (LandscapeFragmentPanel) this.LLILZ.LLJJIII.getValue();
                    if (landscapeFragmentPanel2 != null) {
                        LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent5 = this.LLILZ;
                        Aweme aweme3 = landscapeFeedViewPagerComponent5.LLJJI;
                        C2189821An6 c2189821An66 = landscapeFeedViewPagerComponent5.getPanelContext().LIZJ;
                        if (c2189821An66 != null) {
                            eventType = c2189821An66.getEventType();
                        }
                        C2189821An6 c2189821An67 = landscapeFeedViewPagerComponent5.getPanelContext().LIZJ;
                        if (c2189821An67 != null) {
                            pageType = c2189821An67.getPageType();
                        } else {
                            pageType = 0;
                        }
                        C1440005kM.LIZ(new C1D01(pageType, aweme3, landscapeFragmentPanel2, eventType));
                    }
                    Iterator<Function2<Integer, Boolean, Unit>> it2 = this.LLILZ.LLJILJILJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke(Integer.valueOf(i2), Boolean.valueOf(this.LL));
                    }
                    this.LL = false;
                    this.LLILLJJLI = i2;
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i2, float f, int i3) {
                    if (this.LL && f == 0.0f && i3 == 0) {
                        onPageSelected(i2);
                    }
                }
            });
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ2, null), this, LandscapeViewPagerSelectedAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final void to(int i) {
        LandscapeFragmentPanel landscapeFragmentPanel;
        VerticalViewPager verticalViewPagerSP1;
        if (i >= 0 && (landscapeFragmentPanel = (LandscapeFragmentPanel) this.LLJJIII.getValue()) != null) {
            PagerAdapter adapter = null;
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(landscapeFragmentPanel), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility != null && (verticalViewPagerSP1 = landscapeFeedViewPagerAbility.sP1()) != null) {
                adapter = verticalViewPagerSP1.getAdapter();
            }
            if ((adapter instanceof C0SR4) && adapter != null && i <= adapter.getCount() - 1) {
                this.LLJJIJI.add(Integer.valueOf(i));
                VerticalViewPager verticalViewPager = this.LLJIJIL;
                if (verticalViewPager != null) {
                    verticalViewPager.setCurrentItemWithDefaultVelocity(i);
                }
            }
        }
    }

    public final boolean Go(int i, C0SZ8 c0sz8) {
        C711330RvH c711330RvH;
        if (c0sz8 == null || (c711330RvH = this.LLJILLL) == null || c711330RvH.getItem(i) != c0sz8.hm()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeViewPagerSelectedAbility
    public final void RI(LifecycleOwner lifecycleOwner, final AwS618S0100000_4 awS618S0100000_4) {
        Lifecycle lifecycle;
        this.LLJILJILJ.add(awS618S0100000_4);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedViewPagerComponent$registerPageSelectedListener$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.LL.LLJILJILJ.remove(awS618S0100000_4);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility
    public final void bY0(LifecycleOwner lifecycleOwner, final Function2<? super Integer, ? super Boolean, Unit> function2) {
        Lifecycle lifecycle;
        this.LLJILJILJ.add(function2);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedViewPagerComponent$registerOnPageSelectedListener$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.LL.LLJILJILJ.remove(function2);
                    }
                }
            });
        }
    }
}
