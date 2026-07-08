package com.ss.android.ugc.aweme.ecommerce.search.result.tab;

import X.AnonymousClass0378;
import X.C019F;
import X.C0A50;
import X.C0QER;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C13LZ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1744700vVE;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C435470H5t;
import X.C676890Qgp;
import X.C676900Qgq;
import X.C676910Qgr;
import X.C676940Qgu;
import X.C676970Qgx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC669620QOi;
import X.InterfaceC1164530gPT;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.h;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchLynxFilterAssem;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.AwS95S1200000_10;
import kotlin.jvm.internal.AwS96S0201000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchLynxFilterAssem extends UIContentAssem implements IECSearchFilterAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public C435470H5t LLIZLLLIL;
    public LinearLayout LLJ;
    public View LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public C676940Qgu LLJILLL = new C676940Qgu(0);
    public boolean LLJJ = true;
    public int LLJJI;
    public Integer LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C676900Qgq LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECSearchLynxFilterAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/ecommerce/search/result/tab/ECSearchFilterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Qgq] */
    public ECSearchLynxFilterAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECSearchFilterViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 110), AFwS241S0000000_10.get$arr$(65), null, true);
        this.LLJJIJIIJIL = new InterfaceC1164530gPT() { // from class: X.0Qgq
            @Override // X.InterfaceC1164530gPT
            public final void onEvent(String str, String str2) {
                Object c098200Yq;
                if (!Intrinsics.LJFF(str, "ecSearchTabSortFilterStateUpdate")) {
                    return;
                }
                try {
                    c098200Yq = new JSONObject(str2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Activity activityLIZ = null;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                JSONObject jSONObject = (JSONObject) c098200Yq;
                if (jSONObject == null) {
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("params")) != null) {
                    jSONObject = jSONObjectOptJSONObject;
                }
                this.LL.getClass();
                String strOptString = jSONObject.optString("containerUniqueId");
                if (strOptString.length() <= 0) {
                    strOptString = jSONObject.optString("container_unique_id");
                    if (strOptString.length() <= 0) {
                        return;
                    }
                }
                ECSearchLynxFilterAssem eCSearchLynxFilterAssem = this.LL;
                eCSearchLynxFilterAssem.getClass();
                Context context = eCSearchLynxFilterAssem.getContext();
                if (context != null) {
                    activityLIZ = C1388190mED.LIZ(context);
                }
                String strLIZ = C676850Qgl.LIZ(activityLIZ, C724240Sb0.LJI(eCSearchLynxFilterAssem));
                if (strLIZ == null || !Intrinsics.LJFF(strOptString, strLIZ)) {
                    return;
                }
                AssemVMLazy assemVMLazy = this.LL.LLJJIJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ECSearchLynxFilterAssem.LLJJIJIL;
                assemVMLazy.getValue().setState(new AwS589S0100000_10(new AwS95S1200000_10(jSONObject, strOptString, this.LL, 5), (Function1<? super h, Unit>) 387));
            }
        };
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 436252153) {
            return null;
        }
        return this;
    }

    public final void Go() {
        Integer num = this.LLJJIII;
        if (num != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(LJJIJL().getContext(), num.intValue());
            TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, R$styleable.TuxTabBar, R.attr.yx, 0);
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextSelectColor, 0);
            typedArrayObtainStyledAttributes.recycle();
            Integer numValueOf = Integer.valueOf(color);
            if (numValueOf.intValue() == 0 && (numValueOf = C1308910kAL.LIZJ(R.attr.a1h, contextThemeWrapper)) == null) {
                return;
            }
            int iIntValue = numValueOf.intValue();
            TuxIconView tuxIconView = this.LLJIJIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue);
            }
            TuxTextView tuxTextView = this.LLJILJIL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility
    public final void H41() {
        Integer numLIZJ;
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null);
        C435470H5t c435470H5tJo = Jo();
        if (c435470H5tJo == null) {
            return;
        }
        boolean zHo = Ho();
        if (!zHo || !Zo(iSearchResultSubPageAbility)) {
            C786410Ut5.L(c435470H5tJo, 8);
            LinearLayout linearLayout = this.LLJ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            hp(false);
            if (zHo || this.LLJ != null || C0A50.LIZ()) {
                bp(iSearchResultSubPageAbility, 0);
                return;
            }
            return;
        }
        if (iSearchResultSubPageAbility == null) {
            return;
        }
        if (getContext() != null) {
            if (c435470H5tJo.getChildCount() == 0) {
                Integer numQQ = iSearchResultSubPageAbility.qQ();
                int iIntValue = numQQ != null ? numQQ.intValue() : 0;
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
                    iSearchResultSubPageAbility.MP1(numLIZJ.intValue());
                    iSearchResultSubPageAbility.Hb2(0);
                }
                int iOo = Oo();
                iSearchResultSubPageAbility.GO0(true);
                ip(iSearchResultSubPageAbility, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iOo))), 0);
                dp(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iOo))));
                LinearLayout linearLayout2 = new LinearLayout(LJJIJL().getContext());
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(17);
                linearLayout2.setPadding(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
                linearLayout2.setMinimumWidth(So());
                View view = new View(linearLayout2.getContext());
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, view.getContext());
                view.setBackgroundColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
                this.LLJI = view;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                linearLayout2.addView(view, layoutParams);
                View view2 = new View(linearLayout2.getContext());
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a02, view2.getContext());
                view2.setBackgroundColor(numLIZJ3 != null ? numLIZJ3.intValue() : 0);
                this.LLJILJILJ = view2;
                linearLayout2.addView(view2, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                TuxIconView tuxIconView = new TuxIconView(linearLayout2.getContext(), null, 0, 6, null);
                tuxIconView.setIconRes(R.raw.icon_control);
                tuxIconView.setTintColorRes(R.attr.a1h);
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                this.LLJIJIL = tuxIconView;
                linearLayout2.addView(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                TuxTextView tuxTextView = new TuxTextView(linearLayout2.getContext(), null, 6, 0);
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
                tuxTextView.setTextColor(numLIZJ4 != null ? numLIZJ4.intValue() : 0);
                tuxTextView.setTuxFont(62);
                tuxTextView.setGravity(17);
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                this.LLJILJIL = tuxTextView;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                linearLayout2.addView(tuxTextView, layoutParams2);
                Go();
                C786410Ut5.I7(new AjS65S0100000_10(this, 8), linearLayout2);
                this.LLJ = linearLayout2;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                layoutParams3.gravity = 16;
                c435470H5tJo.addView(linearLayout2, layoutParams3);
                ap();
                c435470H5tJo.setOnSizeChangedListener(new C676910Qgr(iSearchResultSubPageAbility, this, iIntValue, c435470H5tJo));
            } else {
                iSearchResultSubPageAbility.GO0(true);
                ip(iSearchResultSubPageAbility, c435470H5tJo.getWidth(), 0);
            }
        }
        C786410Ut5.L(c435470H5tJo, 0);
        ap();
    }

    public final C435470H5t Jo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d7n) : null;
            this.LLIZLLLIL = (C435470H5t) viewFindViewById;
        }
        return (C435470H5t) viewFindViewById;
    }

    public final boolean ep() {
        ISearchResultSubPageAbility iSearchResultSubPageAbility;
        int iIntValue;
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout == null || !linearLayout.isAttachedToWindow() || (iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null)) == null) {
            return false;
        }
        if (!Zo(iSearchResultSubPageAbility)) {
            return true;
        }
        Integer numValueOf = Integer.valueOf(iSearchResultSubPageAbility.dx0());
        if (numValueOf.intValue() <= 0) {
            return false;
        }
        int iIntValue2 = numValueOf.intValue();
        int iNo = No();
        if (iNo < 0) {
            iNo = 0;
        }
        if (iNo > iIntValue2) {
            iNo = iIntValue2;
        }
        int iSo = So();
        if (iSo < 0) {
            iSo = 0;
        }
        if (iSo > iNo) {
            iSo = iNo;
        }
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(iNo, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), 1073741824));
        Integer numValueOf2 = Integer.valueOf(linearLayout.getMeasuredWidth());
        if (numValueOf2.intValue() > 0) {
            iIntValue = numValueOf2.intValue();
        } else {
            Integer numValueOf3 = Integer.valueOf(linearLayout.getWidth());
            iIntValue = numValueOf3.intValue() > 0 ? numValueOf3.intValue() : So();
        }
        int iLJ = C13LZ.LJ(iIntValue, iSo, iNo);
        dp(iLJ);
        int i = iIntValue2 - iLJ;
        iSearchResultSubPageAbility.setMaxWidth(i >= 0 ? i : 0);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility
    public final void xU1() {
        if (this.LLJ != null && !C0A50.LIZ()) {
            bp((ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null), 0);
        }
        C435470H5t c435470H5tJo = Jo();
        if (c435470H5tJo != null) {
            C786410Ut5.L(c435470H5tJo, 8);
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c435470H5tJo, null);
            c435470H5tJo.removeAllViews();
            ViewGroup.LayoutParams layoutParams = c435470H5tJo.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            } else {
                layoutParams = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c435470H5tJo);
            c435470H5tJo.setLayoutParams(layoutParams);
        }
        View viewFindViewById = LJJIJL().findViewById(R.id.h2t);
        if (viewFindViewById != null) {
            C1744700vVE.LJIIL(viewFindViewById, 0);
        }
        this.LLJ = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    public static int No() {
        Integer num = C676970Qgx.LIZ().filterMaxWidth;
        return num != null ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
    }

    public static int Oo() {
        Integer num = C676970Qgx.LIZ().filterSkeletonWidth;
        return Math.max(num != null ? num.intValue() : 40, 45);
    }

    public static int So() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Oo())));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility
    public final boolean GX() {
        return Vo() && C676890Qgp.LIZ.LIZIZ(Lo());
    }

    public final boolean Ho() {
        return Vo() && this.LLJJ && C676890Qgp.LIZ.LIZ(Lo());
    }

    public final ECSearchEntranceData Lo() {
        SearchResultParam searchResultParamTb;
        C0QER searchEnterParam;
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility == null || (searchResultParamTb = iSearchResultSubPageAbility.Tb()) == null || (searchEnterParam = searchResultParamTb.getSearchEnterParam()) == null) {
            return null;
        }
        return searchEnterParam.getEcSearchEntranceData();
    }

    public final boolean Vo() {
        Integer numWz;
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null);
        return (iSearchResultSubPageAbility == null || (numWz = iSearchResultSubPageAbility.wz()) == null || numWz.intValue() <= 1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e A[PHI: r8
      0x012e: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean), (r8v3 boolean) binds: [B:106:0x012a, B:26:0x0054, B:28:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchLynxFilterAssem.ap():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IECSearchFilterAbility.class, null, null);
        }
        AnonymousClass0378.LIZ().LIZLLL("ecSearchTabSortFilterStateUpdate", this.LLJJIJIIJIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJI++;
        AnonymousClass0378.LIZ().LIZJ("ecSearchTabSortFilterStateUpdate", this.LLJJIJIIJIL);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IECSearchFilterAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility
    public final boolean yN2() {
        return Ho();
    }

    public static boolean Zo(ISearchResultSubPageAbility iSearchResultSubPageAbility) {
        EnumC669620QOi enumC669620QOiP1;
        EnumC669620QOi enumC669620QOiYC0;
        if (iSearchResultSubPageAbility == null || (enumC669620QOiP1 = iSearchResultSubPageAbility.P1()) == null || (enumC669620QOiYC0 = iSearchResultSubPageAbility.yC0()) == null || enumC669620QOiP1 != enumC669620QOiYC0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility
    public final void Cy2(boolean z) {
        this.LLJJ = z;
    }

    public final void dp(int i) {
        View viewFindViewById = LJJIJL().findViewById(R.id.h2t);
        if (viewFindViewById != null) {
            C1744700vVE.LJIIL(viewFindViewById, i);
        }
        C435470H5t c435470H5tJo = Jo();
        if (c435470H5tJo != null) {
            ViewGroup.LayoutParams layoutParams = c435470H5tJo.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            } else {
                layoutParams = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c435470H5tJo);
            c435470H5tJo.setLayoutParams(layoutParams);
            c435470H5tJo.requestLayout();
        }
    }

    public final void hp(boolean z) {
        int iOo;
        if (z) {
            iOo = Oo();
        } else {
            iOo = 0;
        }
        dp(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iOo))));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility
    public final void oN2(int i) {
        this.LLJJIII = Integer.valueOf(i);
        Go();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Qh6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C677050Qh5) obj).LLILLL;
            }
        }, null, new AwS624S0100000_10(this, 91), 6);
    }

    public final void bp(ISearchResultSubPageAbility iSearchResultSubPageAbility, int i) {
        hp(false);
        if (iSearchResultSubPageAbility != null) {
            iSearchResultSubPageAbility.GO0(false);
            iSearchResultSubPageAbility.Hb2(8);
            int iDx0 = iSearchResultSubPageAbility.dx0();
            if (iDx0 > 0) {
                iSearchResultSubPageAbility.setMaxWidth(iDx0);
            } else {
                cp(i, new AwS376S0200000_10(this, iSearchResultSubPageAbility, 17));
            }
        }
    }

    public final void cp(final int i, final Function1<? super Integer, Unit> function1) {
        if (i >= 3) {
            return;
        }
        final View viewLJJIJL = this.LLJ;
        if (viewLJJIJL == null) {
            viewLJJIJL = LJJIJL();
        }
        final int i2 = this.LLJJI;
        HandlerHook.viewPost(viewLJJIJL, new Runnable() { // from class: X.07xl
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ECSearchLynxFilterAssem@770.scheduleNativeFilterLayoutRetry$1");
                try {
                    if (i2 == this.LLJJI && viewLJJIJL.getParent() != null && viewLJJIJL.isAttachedToWindow()) {
                        function1.invoke(Integer.valueOf(i + 1));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ECSearchLynxFilterAssem@770.scheduleNativeFilterLayoutRetry$1");
            }
        });
    }

    public final void ip(ISearchResultSubPageAbility iSearchResultSubPageAbility, int i, int i2) {
        if (iSearchResultSubPageAbility != null) {
            int iDx0 = iSearchResultSubPageAbility.dx0();
            if (iDx0 <= 0) {
                cp(i2, new AwS96S0201000_10(this, iSearchResultSubPageAbility, i, 0));
                return;
            }
            int i3 = 0;
            if (i < 0) {
                i = 0;
            }
            int i4 = iDx0 - i;
            if (i4 >= 0) {
                i3 = i4;
            }
            iSearchResultSubPageAbility.setMaxWidth(i3);
        }
    }
}
