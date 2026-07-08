package com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui;

import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C07E5;
import X.C07F4;
import X.C098200Yq;
import X.C09A1;
import X.C0BT5;
import X.C0J4W;
import X.C0PCY;
import X.C0PEM;
import X.C0PFS;
import X.C0PLO;
import X.C0PPQ;
import X.C0PQ2;
import X.C0PQ3;
import X.C0PRC;
import X.C0PUT;
import X.C0PUV;
import X.C0Q1G;
import X.C0Q39;
import X.C0Q3E;
import X.C0R12;
import X.C0R45;
import X.C1010120cOQ;
import X.C1202104n5;
import X.C1227904rF;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1823007Ca;
import X.C189200o6;
import X.C1954807lC;
import X.C19ME;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C212367188v;
import X.C21565319aV;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C293650Bf9;
import X.C294600Bgg;
import X.C418440Gaw;
import X.C452501pT;
import X.C486180J4u;
import X.C639780P7o;
import X.C645630PUb;
import X.C646370PWx;
import X.C650240Pew;
import X.C650430PfF;
import X.C653660PkS;
import X.C654590Plx;
import X.C655000Pmc;
import X.C655100Pmm;
import X.C655150Pmr;
import X.C655160Pms;
import X.C655200Pmw;
import X.C655360PnC;
import X.C655440PnK;
import X.C655900Po4;
import X.C656680PpK;
import X.C661350Pwr;
import X.C691880RBy;
import X.C723830SaL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC645610PTz;
import X.EnumC655370PnD;
import X.EnumC656690PpL;
import X.EnumC657940PrM;
import X.InterfaceC1010860cPc;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC494301wD;
import X.InterfaceC645880PVa;
import X.InterfaceC655060Pmi;
import X.InterfaceC655080Pmk;
import X.InterfaceC655250Pn1;
import X.InterfaceC655280Pn4;
import X.InterfaceC655350PnB;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.live.ISearchLiveDynamicAnchorAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ClickSearchTriggerAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ability.ISearchMixLiveCardAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMixLiveCardContentAssem extends ReusedUISlotAssem<SearchMixLiveCardContentAssem> implements InterfaceC712990Rxx<C655000Pmc>, ClickSearchTriggerAbility, ISearchMixLiveCardAbility, ISearchLiveDynamicAnchorAbility, InterfaceC1554640qYg {
    public InterfaceC655350PnB LLJZ;
    public RadiusLayout LLL;
    public C655000Pmc LLLF;
    public Integer LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public List<? extends InterfaceC655280Pn4> LLLIIIL;
    public List<? extends InterfaceC655250Pn1> LLLIIL;
    public Map<String, ? extends Object> LLLIILIL;
    public final C054G LLLIL;
    public AnonymousClass0956 LLLILZ;
    public C0PUT LLLILZJ;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 777));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 781));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 788));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 786));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 778));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 779));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 785));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 784));
    public final C01GW LLLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(339));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 787));
    public final HashMap<View, C655200Pmw> LLLIIII = new HashMap<>();
    public final C01GW<InterfaceC655060Pmi> LLLIIIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 780));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ett;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -311217055 || iHashCode == 1376919331 || iHashCode == 1688955684) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ISearchLiveDynamicAnchorAbility
    public final String vG0() {
        Object c098200Yq;
        C0Q39 c0q39;
        try {
            C0PCY<C0Q39> c0pcyP70 = C0Q3E.LJI().P70();
            c098200Yq = (c0pcyP70 == null || (c0q39 = (C0Q39) c0pcyP70.LIZJ()) == null) ? null : c0q39.LLILLJJLI;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (X.C294600Bgg.LIZ((r0 == null || (r0 = r0.LLILLJJLI) == null || (r0 = r0.getCommerceVideoAuthInfo()) == null) ? null : r0.getEcSearchBoBcLabelText()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ap() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem.Ap():void");
    }

    public final void Bp() {
        for (InterfaceC655250Pn1 interfaceC655250Pn1 : this.LLLIIL) {
            if (interfaceC655250Pn1.isPlaying()) {
                interfaceC655250Pn1.pause();
            }
        }
    }

    public final void Fp() {
        if (this.LLLFZ) {
            View viewUp = up();
            if (viewUp != null) {
                ViewGroup.LayoutParams layoutParams = viewUp.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                C19ME c19me = (C19ME) layoutParams;
                c19me.bottomToTop = -1;
                c19me.bottomToBottom = 0;
                c19me.startToEnd = -1;
                C786410Ut5.W5(viewUp, c19me);
            }
            View viewSp = sp();
            if (viewSp != null) {
                ViewGroup.LayoutParams layoutParams2 = viewSp.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                C19ME c19me2 = (C19ME) layoutParams2;
                ((ViewGroup.MarginLayoutParams) c19me2).width = -1;
                c19me2.endToStart = -1;
                c19me2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                C786410Ut5.W5(viewSp, c19me2);
            }
            Integer num = this.LLLFF;
            if (num != null) {
                int iIntValue = num.intValue();
                View viewOp = op();
                if (viewOp != null) {
                    ViewGroup.LayoutParams layoutParams3 = viewOp.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams.bottomMargin = iIntValue;
                    C786410Ut5.W5(viewOp, marginLayoutParams);
                }
            }
            this.LLLFZ = false;
        }
    }

    public final View op() {
        return (View) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ClickSearchTriggerAbility
    public final void op0() {
        C0PUT c0put = this.LLLILZJ;
        if (c0put != null) {
            c0put.LJI(-1);
        } else {
            C0PUV.LIZ(getContentView());
        }
    }

    public final View sp() {
        return (View) this.LLJLILLLLZIIL.getValue();
    }

    public final ISearchContextAbility tp() {
        return (ISearchContextAbility) this.LLLII.getValue();
    }

    public final View up() {
        return (View) this.LLJLIL.getValue();
    }

    public SearchMixLiveCardContentAssem() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LLLIIIL = c13bv;
        this.LLLIIL = c13bv;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
    }

    public final void Ep() {
        View viewSp = sp();
        ViewGroup viewGroup = viewSp instanceof ViewGroup ? (ViewGroup) viewSp : null;
        if (viewGroup != null) {
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (Intrinsics.LJFF(childAt != null ? childAt.getTag() : null, "dynamic_anchor_view")) {
                    C786410Ut5.LJJLIL(childCount, viewGroup);
                } else if (childAt != null) {
                    C786410Ut5.LJLLLLLL(0, childAt);
                }
            }
        }
        this.LLLIIIL = C13BV.INSTANCE;
        Iterator<? extends InterfaceC655250Pn1> it2 = this.LLLIIL.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
        this.LLLIIL = C13BV.INSTANCE;
        this.LLLIILIL = null;
        this.LLLFFI = false;
        AnonymousClass0956 anonymousClass0956 = this.LLLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLILZ = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC655060Pmi value;
        Ep();
        if (!this.LLLIIIIL.isInitialized() || (value = this.LLLIIIIL.getValue()) == null) {
            return;
        }
        value.release();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        Aweme aweme;
        Ep();
        Fp();
        C655000Pmc c655000Pmc = this.LLLF;
        if (c655000Pmc == null || (aweme = c655000Pmc.LLILLJJLI) == null || !aweme.isAd()) {
            return;
        }
        this.LLJZ = null;
        ViewGroup viewGroup = (ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        View view = (View) this.LLJL.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ClickSearchTriggerAbility
    public final void JD(Object obj) {
        C0PUT c0put = null;
        if ((obj instanceof ClickSearchViewModel) && obj != null && this.LLLILZJ == null) {
            ClickSearchViewModel clickSearchViewModel = (ClickSearchViewModel) obj;
            EnumC645610PTz enumC645610PTz = EnumC645610PTz.LIVE_IN_MIX_FEED;
            clickSearchViewModel.getClass();
            if (ClickSearchViewModel.AQ2(enumC645610PTz)) {
                c0put = new C0PUT(clickSearchViewModel);
                clickSearchViewModel.BQ2(new AObserverS214S0100000_10(c0put, 150));
            }
            this.LLLILZJ = c0put;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ability.ISearchMixLiveCardAbility
    public final void Ua(View view) {
        zp(view);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLL = (RadiusLayout) view.findViewById(R.id.n97);
        if (C650240Pew.LIZ()) {
            RadiusLayout radiusLayout = this.LLL;
            if (radiusLayout != null) {
                C650240Pew.LIZ.getClass();
                radiusLayout.setRadius(0.0f);
            }
            View view2 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (view2 != null) {
                C650240Pew.LIZ.getClass();
                C21565319aV.LIZIZ(view2, Float.valueOf(0.0f), null, null, null, null, 30);
            }
            View viewSp = sp();
            if (viewSp != null) {
                C650240Pew.LIZ.getClass();
                C21565319aV.LIZIZ(viewSp, Float.valueOf(0.0f), null, null, null, null, 30);
            }
        } else {
            RadiusLayout radiusLayout2 = this.LLL;
            if (radiusLayout2 != null) {
                C21565319aV.LIZIZ(radiusLayout2, null, null, null, (Float) this.LLLI.getValue(), (Float) this.LLLI.getValue(), 7);
            }
            View view3 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (view3 != null) {
                C21565319aV.LIZIZ(view3, (Float) this.LLLI.getValue(), null, null, null, null, 30);
            }
            View viewSp2 = sp();
            if (viewSp2 != null) {
                C21565319aV.LIZIZ(viewSp2, (Float) this.LLLI.getValue(), null, null, null, null, 30);
            }
        }
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(this, view, 67));
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(this, this, 36));
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(this, this, 37));
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 26));
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(this, this, 38));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C655000Pmc c655000Pmc) {
        String ecSearchBoBcLabelText;
        Object c098200Yq;
        CommonLogParams commonLogParams;
        InterfaceC655080Pmk anchorType;
        String ecSearchBoBcLabelText2;
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Aweme aweme2;
        AwemeCommerceStruct commerceVideoAuthInfo2;
        C655000Pmc c655000Pmc2 = c655000Pmc;
        this.LLLF = c655000Pmc2;
        InterfaceC655080Pmk anchorType2 = c655000Pmc2.getAnchorType();
        C655000Pmc c655000Pmc3 = this.LLLF;
        ViewGroup viewGroup = null;
        if (c655000Pmc3 != null && (aweme2 = c655000Pmc3.LLILLJJLI) != null && (commerceVideoAuthInfo2 = aweme2.getCommerceVideoAuthInfo()) != null) {
            ecSearchBoBcLabelText = commerceVideoAuthInfo2.getEcSearchBoBcLabelText();
        } else {
            ecSearchBoBcLabelText = null;
        }
        if (C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
            View viewSp = sp();
            if (viewSp != null) {
                C786410Ut5.LJLLLLLL(8, viewSp);
            }
            FrameLayout frameLayout = (FrameLayout) this.LLJLL.getValue();
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            TextView textView = (TextView) this.LLJLLIL.getValue();
            if (textView != null) {
                C655000Pmc c655000Pmc4 = this.LLLF;
                if (c655000Pmc4 != null && (aweme = c655000Pmc4.LLILLJJLI) != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                    ecSearchBoBcLabelText2 = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
                } else {
                    ecSearchBoBcLabelText2 = null;
                }
                textView.setText(ecSearchBoBcLabelText2);
            }
        } else {
            View viewSp2 = sp();
            if (viewSp2 != null) {
                C786410Ut5.LJLLLLLL(0, viewSp2);
            }
            FrameLayout frameLayout2 = (FrameLayout) this.LLJLL.getValue();
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
        }
        C0PQ2 c0pq2 = C0PQ2.LIZ;
        Aweme aweme3 = c655000Pmc2.LLILLJJLI;
        c0pq2.getClass();
        C0PLO c0ploLIZ = C0PQ2.LIZ(aweme3);
        int i = C0PQ3.LIZ[c0ploLIZ.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            Ep();
            this.LLLIILIL = c0ploLIZ.LIZJ;
        } else {
            String str = c0ploLIZ.LIZIZ;
            if (str == null) {
                str = "";
            }
            Aweme aweme4 = c655000Pmc2.LLILLJJLI;
            if (str.length() == 0) {
                Ep();
            } else {
                Ep();
                try {
                    C1227904rF.LIZ.getClass();
                    ViewObjectWrapper viewObjectWrapper = (ViewObjectWrapper) C1227904rF.LIZIZ(str, ViewObjectWrapper.class);
                    if (viewObjectWrapper != null && (commonLogParams = viewObjectWrapper.commonLogParams) != null) {
                        c098200Yq = commonLogParams.cardLog;
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Map<String, ? extends Object> map = (Map) c098200Yq;
                aweme4.getAid();
                if (map != null) {
                    map.isEmpty();
                }
                Objects.toString(map);
                this.LLLIILIL = map;
                InterfaceC655060Pmi value = this.LLLIIIIL.getValue();
                if (value == null) {
                    Ep();
                } else {
                    this.LLLILZ = C23250099c.LIZLLL(this.LLLIL, null, null, new C655150Pmr(this, aweme4.getAid(), value, aweme4, str, null), 3);
                }
            }
        }
        if (anchorType2 instanceof C655100Pmm) {
            C655000Pmc c655000Pmc5 = this.LLLF;
            if (c655000Pmc5 != null) {
                anchorType = c655000Pmc5.getAnchorType();
            } else {
                anchorType = null;
            }
            if ((anchorType instanceof C655100Pmm) && ((C655100Pmm) anchorType).LIZ.showDropsTag) {
                if (!C1823007Ca.LIZ()) {
                    C723830SaL.LJ(this, C13LE.LIZ(SearchLiveGameAnchorAssem.class), true, null);
                }
                View view = (View) this.LLJL.getValue();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            } else {
                View view2 = (View) this.LLJL.getValue();
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
            }
        }
        final Aweme aweme5 = c655000Pmc2.LLILLJJLI;
        if ((aweme5 != null && aweme5.isAd()) || C1010120cOQ.LJJIJ(aweme5)) {
            InterfaceC655350PnB interfaceC655350PnBLJIIJ = C0R12.LIZIZ.LJIIJ(new C655360PnC(this, aweme5));
            this.LLJZ = interfaceC655350PnBLJIIJ;
            if (interfaceC655350PnBLJIIJ != null) {
                interfaceC655350PnBLJIIJ.ik(new InterfaceC1010860cPc() { // from class: X.0Pmu
                    @Override // X.InterfaceC1010860cPc
                    public final long getCurrentPosition() {
                        return 0L;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final Context LIZ() {
                        return this.LIZ.getContext();
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final View getView() {
                        return this.LIZ.LJJIJL();
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final boolean isMute() {
                        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchComponentCenter$Player$PlayerControlAbility.class, null);
                        if (searchComponentCenter$Player$PlayerControlAbility != null) {
                            return searchComponentCenter$Player$PlayerControlAbility.isMute();
                        }
                        return false;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final boolean isPlaying() {
                        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchComponentCenter$Player$PlayerControlAbility.class, null);
                        if (searchComponentCenter$Player$PlayerControlAbility != null) {
                            return searchComponentCenter$Player$PlayerControlAbility.isPlaying();
                        }
                        return false;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final Aweme getAweme() {
                        return aweme5;
                    }
                });
            }
        } else {
            this.LLJZ = null;
            ViewGroup viewGroup2 = (ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
            View viewUp = up();
            if (viewUp != null) {
                C661350Pwr.LJIIIIZZ(0, viewUp);
            }
        }
        Ap();
        InterfaceC655350PnB interfaceC655350PnB = this.LLJZ;
        if (interfaceC655350PnB != null) {
            interfaceC655350PnB.bind();
        }
        Context context = getContext();
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewLJJIJL;
        }
        C691880RBy.LIZ(context, viewGroup, c655000Pmc2.LLILLJJLI.getAwemeRawAd(), false);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C655000Pmc c655000Pmc) {
        return true;
    }

    public final boolean yp(View view) {
        Aweme aweme;
        List<Product> productsInfo;
        Product product;
        String str;
        String str2;
        String str3;
        Long lValueOf;
        String strValueOf;
        Long lValueOf2;
        C0PCY<C646370PWx> c0pcyWO2;
        C646370PWx c646370PWx;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C646370PWx> c0pcyWO22;
        C646370PWx c646370PWx2;
        C655000Pmc c655000Pmc = this.LLLF;
        if (c655000Pmc == null || (productsInfo = (aweme = c655000Pmc.LLILLJJLI).getProductsInfo()) == null || (product = (Product) C13LP.LJJJLL(productsInfo)) == null) {
            return false;
        }
        IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ = C1202104n5.LIZ();
        C655440PnK c655440PnK = new C655440PnK(aweme);
        C653660PkS c653660PkS = new C653660PkS();
        ISearchContextAbility iSearchContextAbilityTp = tp();
        String str4 = "";
        if (iSearchContextAbilityTp == null || (c0pcyWO22 = iSearchContextAbilityTp.wO2()) == null || (c646370PWx2 = (C646370PWx) c0pcyWO22.LIZJ()) == null || (str = c646370PWx2.LL) == null) {
            str = "";
        }
        c653660PkS.LJIIJJI = str;
        ISearchContextAbility iSearchContextAbilityTp2 = tp();
        if (iSearchContextAbilityTp2 == null || (c0pcyPh1 = iSearchContextAbilityTp2.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str2 = c0prc.LLILLL) == null) {
            str2 = "";
        }
        c653660PkS.LJIIJ = str2;
        ISearchContextAbility iSearchContextAbilityTp3 = tp();
        if (iSearchContextAbilityTp3 == null || (c0pcyWO2 = iSearchContextAbilityTp3.wO2()) == null || (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) == null || (str3 = c646370PWx.LLILLL) == null) {
            str3 = "";
        }
        c653660PkS.LJIIIIZZ = str3;
        Product product2 = null;
        if (C0PPQ.LIZ() && Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "searchMixLiveCard")) {
            HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
            if (searchExtraParams == null || (strValueOf = searchExtraParams.get("search_result_id")) == null) {
                User author = aweme.getAuthor();
                if (author != null) {
                    lValueOf2 = Long.valueOf(C486180J4u.LIZ(author));
                } else {
                    lValueOf2 = null;
                }
                strValueOf = String.valueOf(lValueOf2);
            }
        } else {
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                lValueOf = Long.valueOf(C486180J4u.LIZ(author2));
            } else {
                lValueOf = null;
            }
            strValueOf = String.valueOf(lValueOf);
        }
        c653660PkS.LJIJI = strValueOf;
        C654590Plx c654590Plx = new C654590Plx((SearchCardInfo) null, c653660PkS, (List) null, 0L, 29);
        List<Product> productsInfo2 = aweme.getProductsInfo();
        if (productsInfo2 != null) {
            product2 = (Product) C13LP.LJJJLL(productsInfo2);
        }
        IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ2 = C1202104n5.LIZ();
        if (product2 != null && iEcomGeneralSearchServiceLIZ2.LJIIL(product2)) {
            str4 = iEcomGeneralSearchServiceLIZ2.LIZ(product2) ? "search_live_single_entrance_with_discount" : "search_live_single_entrance_without_discount";
        } else {
            List<Product> productsInfo3 = aweme.getProductsInfo();
            if (productsInfo3 != null && !productsInfo3.isEmpty() && C0BT5.LIZ() && !aweme.isAd()) {
                int iLIZ = C293650Bf9.LIZ();
                str4 = (iLIZ == 4 || iLIZ == 5) ? "search_live_single_anchor" : iLIZ == 6 ? "search_live_shownow_banner" : iLIZ == 8 ? "search_live_single_entrance" : "search_live_merge_entrance";
            }
        }
        return iEcomGeneralSearchServiceLIZ.LJIILLIIL(new C645630PUb(product, c655440PnK, c654590Plx, null, str4, view, "a2270.b6880.c6710.d47166", PageFinder.via(view), EnumC657940PrM.LIVE_CHILD_CARD, getContext(), new AwS554S0100000_10(this, 782), null, new C655160Pms(this, view, aweme), null, new AwS554S0100000_10(this, 783), 20480));
    }

    public final void zp(final View view) {
        boolean z;
        BcmParams bcmParams;
        String str;
        C650430PfF c650430PfF;
        String str2;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0J4W c0j4wC4;
        ILiveOuterService iLiveOuterService;
        C0J4W c0j4wC42;
        Function1<View, Map<String, String>> function1;
        Map<String, String> mapInvoke;
        Function1<View, Map<String, String>> function12;
        Map<String, String> mapInvoke2;
        Map<String, String> map;
        String str3;
        C650430PfF c650430PfF2;
        String str4;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        AwemeSearchAdModel searchAdInfo;
        C0Q1G clickType;
        EnumC655370PnD enumC655370PnD;
        C0Q3E.LIZ(getContentView()).fe(new C639780P7o(true));
        final C655000Pmc c655000Pmc = this.LLLF;
        if (c655000Pmc == null) {
            return;
        }
        InterfaceC655350PnB interfaceC655350PnB = this.LLJZ;
        if (interfaceC655350PnB != null) {
            EnumC656690PpL enumC656690PpL = C656680PpK.LIZ.get(Integer.valueOf(view.getId()));
            if (enumC656690PpL != null && C0PQ3.LIZIZ[enumC656690PpL.ordinal()] == 1) {
                enumC655370PnD = EnumC655370PnD.VIDEO;
            } else {
                enumC655370PnD = EnumC655370PnD.BOTTOM_USER_AREA;
            }
            interfaceC655350PnB.MM2(enumC655370PnD);
        }
        Aweme aweme = c655000Pmc.LLILLJJLI;
        boolean z2 = false;
        if (aweme != null && C1010120cOQ.LJJIJLIJ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC655350PnB interfaceC655350PnB2 = this.LLJZ;
            if (interfaceC655350PnB2 != null) {
                clickType = interfaceC655350PnB2.getClickType();
            } else {
                clickType = null;
            }
            if (clickType != C0Q1G.PRODUCT_ANCHOR) {
                z2 = true;
            }
        }
        String str5 = "";
        if (z2) {
            C212367188v c212367188v = BcmParams.Companion;
            AwemeRawAd awemeRawAd = c655000Pmc.LLILLJJLI.getAwemeRawAd();
            if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
                map = searchAdInfo.chainParamMap;
            } else {
                map = null;
            }
            c212367188v.getClass();
            bcmParams = C212367188v.LIZJ(map);
            ISearchContextAbility iSearchContextAbilityTp = tp();
            if (iSearchContextAbilityTp != null && (c0pcyPh12 = iSearchContextAbilityTp.Ph1()) != null && (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) != null) {
                str3 = c0prc2.LLILLL;
            } else {
                str3 = null;
            }
            bcmParams.put("search_id", str3);
            C655000Pmc c655000Pmc2 = this.LLLF;
            if (c655000Pmc2 != null && (c650430PfF2 = c655000Pmc2.LLILZ) != null && (str4 = c650430PfF2.LIZIZ().get("search_result_id")) != null) {
                str5 = str4;
            }
            bcmParams.put("search_result_id", str5);
        } else {
            bcmParams = new BcmParams();
            ISearchContextAbility iSearchContextAbilityTp2 = tp();
            if (iSearchContextAbilityTp2 != null && (c0pcyPh1 = iSearchContextAbilityTp2.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
                str = c0prc.LLILLL;
            } else {
                str = null;
            }
            bcmParams.put("search_id", str);
            C655000Pmc c655000Pmc3 = this.LLLF;
            if (c655000Pmc3 != null && (c650430PfF = c655000Pmc3.LLILZ) != null && (str2 = c650430PfF.LIZIZ().get("search_result_id")) != null) {
                str5 = str2;
            }
            bcmParams.put("search_result_id", str5);
        }
        String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c6710.d0", PageFinder.via(LJJIJL()), bcmParams);
        op0();
        JSONObject jSONObject = new JSONObject();
        C655900Po4 c655900Po4 = C655900Po4.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC655080Pmk anchorType = c655000Pmc.getAnchorType();
        c655900Po4.getClass();
        C655900Po4.LIZ(linkedHashMap, anchorType);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("live_enter_extra_data", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        Iterator<Map.Entry<View, C655200Pmw>> it2 = this.LLLIIII.entrySet().iterator();
        while (it2.hasNext()) {
            C655200Pmw value = it2.next().getValue();
            if (value != null && (function12 = value.LIZJ) != null && (mapInvoke2 = function12.invoke(view)) != null) {
                for (Map.Entry<String, String> entry2 : mapInvoke2.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        jSONObject2.put("search_mob_extra", jSONObject3);
        linkedHashMap2.put("live_extra_params", C786410Ut5.J3(jSONObject2));
        C655200Pmw c655200Pmw = this.LLLIIII.get(view);
        if (c655200Pmw != null && (function1 = c655200Pmw.LIZ) != null && (mapInvoke = function1.invoke(view)) != null) {
            linkedHashMap2.putAll(mapInvoke);
        } else {
            linkedHashMap2.put("enter_method", "live_cover");
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 != null && (c0j4wC4 = iLiveOuterService2.C4()) != null && c0j4wC4.enable() && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (c0j4wC42 = iLiveOuterService.C4()) != null && c0j4wC42.LIZJ()) {
            Aweme aweme2 = c655000Pmc.LLILLJJLI;
            ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService3 != null) {
                iLiveOuterService3.R3(getContext(), aweme2);
            }
        }
        SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$NavigateAbility.class, null);
        if (searchServiceCenter$NavigateAbility != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            Aweme aweme3 = c655000Pmc.LLILLJJLI;
            AwemeBizExtKt.setSourceBtmToken(aweme3, strCreateJumpSourceBtmToken);
            searchServiceCenter$NavigateAbility.GV0(interfaceC665370Q7zLJIIL, aweme3, new InterfaceC645880PVa(c655000Pmc, this, view) { // from class: X.0PmN
                public final C650430PfF LL;

                @Override // X.InterfaceC645880PVa
                public final boolean LLJJJIL() {
                    return false;
                }

                @Override // X.InterfaceC1891350zJl
                public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return null;
                }

                @Override // X.InterfaceC645880PVa
                public final C650430PfF LLIZLLLIL() {
                    return this.LL;
                }

                @Override // X.InterfaceC1891350zJl
                public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                }

                @Override // X.InterfaceC1891350zJl
                public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                }

                {
                    this.LL = new C650430PfF(new AwS219S0300000_10(c655000Pmc, this, view, 11));
                }
            }, false, linkedHashMap2, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C655000Pmc c655000Pmc) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ClickSearchTriggerAbility
    public final void GP2(int i, Aweme aweme) {
        String aid;
        String uid;
        User author;
        String str = ((C0PRC) C0Q3E.LIZ(getContentView()).Ph1().LIZJ()).LLIZLLLIL;
        C0PUT c0put = this.LLLILZJ;
        if (c0put != null) {
            c0put.LIZ(i, aweme, str);
        }
        C0PUT c0put2 = this.LLLILZJ;
        if (c0put2 != null) {
            String aid2 = aweme.getAid();
            Aweme aweme2 = c0put2.LIZLLL;
            String aid3 = null;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(aid2, aid)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("diff compare srcId ");
                sbLIZ.append(aid2);
                sbLIZ.append(", awemeId ");
                Aweme aweme3 = c0put2.LIZLLL;
                if (aweme3 != null) {
                    aid3 = aweme3.getAid();
                }
                sbLIZ.append(aid3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            Aweme aweme4 = c0put2.LIZLLL;
            if (aweme4 == null || !aweme4.isAd()) {
                c0put2.LJII.DQ2(c0put2.LIZJ);
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("room_id", aid2);
                Aweme aweme5 = c0put2.LIZLLL;
                if (aweme5 == null || (author = aweme5.getAuthor()) == null || (uid = author.getUid()) == null) {
                    uid = "";
                }
                pairArr[1] = new Pair("author_id", uid);
                pairArr[2] = new Pair("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                pairArr[3] = new Pair("is_src", Boolean.TRUE);
                c0put2.LJII(c0put2.LIZIZ, aid2, c0put2.LIZJ, C2097608Jq.LJIIJ(pairArr), c0put2.LIZLLL(c0put2.LIZ, c0put2.LIZLLL), null);
            }
        }
        if (C07F4.LIZ()) {
            C0PUV.LIZIZ(aweme, getContentView(), C0PFS.LIZ(C1558520qew.LJIIL(this)), EnumC645610PTz.SEARCH_LIVE_IN_MIX_FEED, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0007  */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ISearchLiveDynamicAnchorAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ny2(android.view.View r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
        /*
            r2 = this;
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r2.LLLIILIL
            r2.LLLIILIL = r4
            if (r4 == 0) goto L7
            goto L9
        L7:
            r0 = 0
            goto L15
        L9:
            java.lang.String r0 = "auction_type"
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
        L15:
            boolean r0 = X.C123100dR.LIZ(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L21
            boolean r0 = r2.yp(r3)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L24
        L21:
            r2.zp(r3)     // Catch: java.lang.Throwable -> L27
        L24:
            r2.LLLIILIL = r1
            return
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L27
            r2.LLLIILIL = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem.ny2(android.view.View, java.util.Map):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ability.ISearchMixLiveCardAbility
    public final void un0(View view, C655200Pmw c655200Pmw) {
        this.LLLIIII.put(view, c655200Pmw);
    }
}
