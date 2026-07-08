package com.ss.android.ugc.aweme.feed.title.assem;

import X.AbstractC1177930gl5;
import X.AbstractC1354300lLY;
import X.AbstractC21673619ry;
import X.AbstractViewOnClickListenerC1212570hex;
import X.C019F;
import X.C1022820ciu;
import X.C1343140l3Y;
import X.C1343170l3b;
import X.C1350320lF8;
import X.C1354140lLI;
import X.C1354200lLO;
import X.C1354220lLQ;
import X.C1354260lLU;
import X.C1354270lLV;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C16BC;
import X.C16G1;
import X.C1766560w4U;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C416060GTc;
import X.C418440Gaw;
import X.C426750GoL;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1349720lEA;
import X.EnumC1354280lLW;
import X.InterfaceC1146704e9;
import X.InterfaceC1343320l3q;
import X.InterfaceC1349690lE7;
import X.InterfaceC1354310lLZ;
import X.InterfaceC1354320lLa;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnLayoutChangeListenerC1401880maI;
import Y.ARunnableS106S0100000_6;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.TitlePanelBottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.feed.title.assem.TitlePanelSheetAssem;
import com.ss.android.ugc.aweme.feed.title.vm.TitlePanelRootVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelSheetAssem extends UIContentAssem implements InterfaceC1349690lE7, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public TitlePanelBottomSheetBehavior LLJ;
    public C1354270lLV LLJI;
    public final AssemVMLazy LLJILJIL;
    public EnumC1354280lLW LLJILJILJ;
    public final TitlePanelSheetAssem LLJILLL;
    public List<InterfaceC1343320l3q> LLJJ;
    public EnumC1349720lEA LLIZLLLIL = EnumC1349720lEA.NONE;
    public final Set<InterfaceC1354310lLZ> LLJIJIL = new LinkedHashSet();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelSheetAssem.class, "rootVM", "getRootVM()Lcom/ss/android/ugc/aweme/feed/title/vm/TitlePanelRootVM;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TitlePanelSheetAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TitlePanelRootVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 197), AFwS259S0000000_21.get$arr$(158), null, true);
        this.LLJILJILJ = EnumC1354280lLW.LL;
        this.LLJILLL = this;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final TitlePanelRootVM Go() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (TitlePanelRootVM) assemVMLazy.getValue();
    }

    public final void Jo() {
        this.LLJILJILJ = EnumC1354280lLW.LLILLL;
        TitlePanelBottomSheetBehavior titlePanelBottomSheetBehavior = this.LLJ;
        if (titlePanelBottomSheetBehavior != null) {
            titlePanelBottomSheetBehavior.setState(3);
        }
        Iterator<InterfaceC1354310lLZ> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().onShow();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentLJI);
            tuxImmersionBarLIZLLL.LJ(R.attr.a1b);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    @Override // X.InterfaceC1349690lE7
    public final void LJJJJLI() {
        C1354270lLV c1354270lLV = this.LLJI;
        if (c1354270lLV != null) {
            c1354270lLV.scrollTo(0, 0);
        }
    }

    @Override // X.InterfaceC1349690lE7
    public final boolean isShowing() {
        EnumC1354280lLW enumC1354280lLW = this.LLJILJILJ;
        return enumC1354280lLW == EnumC1354280lLW.LLILLL || enumC1354280lLW == EnumC1354280lLW.LLILLJJLI;
    }

    public final void onDismiss() {
        Fragment fragmentLJI;
        this.LLJILJILJ = EnumC1354280lLW.LL;
        Iterator<InterfaceC1354310lLZ> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().lM(this.LLIZLLLIL);
        }
        int i = C1354200lLO.LIZIZ[this.LLIZLLLIL.ordinal()];
        Ho(i != 1 ? i != 2 ? i != 3 ? this.LLIZLLLIL.getDesc() : "back_press" : "click_video" : "click_exit");
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 == null || !fragmentLJI2.isAdded() || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentLJI);
        tuxImmersionBarLIZLLL.LJ(R.attr.e1);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // X.InterfaceC1349690lE7
    public final void Ag() {
        RecyclerView recyclerView = (RecyclerView) LJJIJL().findViewById(R.id.t0h);
        if (recyclerView != null) {
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter == null || adapter.getItemCount() == 0) {
                return;
            }
            recyclerView.stopScroll();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
        int height = LJJIJL().getRootView().findViewById(R.id.y2m).getHeight();
        boolean z = C1343170l3b.LIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1343170l3b.LIZ ? 85 : 44)));
        C1354270lLV c1354270lLV = this.LLJI;
        if (c1354270lLV != null) {
            c1354270lLV.stopNestedScroll();
        }
        C1354270lLV c1354270lLV2 = this.LLJI;
        if (c1354270lLV2 != null) {
            c1354270lLV2.scrollTo(0, height - iLIZIZ);
        }
    }

    @Override // X.InterfaceC1349690lE7
    public final boolean jg() {
        if (isShowing()) {
            return false;
        }
        Jo();
        this.LLIZLLLIL = EnumC1349720lEA.NONE;
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C1906580ziK.LJI() || this.LLIZLLLIL != EnumC1349720lEA.NONE) {
            return;
        }
        Ho("skip_to_other_page");
    }

    @Override // X.InterfaceC1349690lE7
    public final void Ej(AbstractC1177930gl5 abstractC1177930gl5) {
        TitlePanelBottomSheetBehavior titlePanelBottomSheetBehavior = this.LLJ;
        if (titlePanelBottomSheetBehavior != null) {
            titlePanelBottomSheetBehavior.addBottomSheetCallback(abstractC1177930gl5);
        }
    }

    @Override // X.InterfaceC1349690lE7
    public final boolean H5(EnumC1349720lEA enumC1349720lEA) {
        EnumC1354280lLW enumC1354280lLW = this.LLJILJILJ;
        EnumC1354280lLW enumC1354280lLW2 = EnumC1354280lLW.LLILZ;
        if (enumC1354280lLW == enumC1354280lLW2 || enumC1354280lLW == EnumC1354280lLW.LL) {
            return false;
        }
        this.LLJILJILJ = enumC1354280lLW2;
        EnumC1349720lEA enumC1349720lEA2 = this.LLIZLLLIL;
        EnumC1349720lEA enumC1349720lEA3 = EnumC1349720lEA.NONE;
        if (enumC1349720lEA2 == enumC1349720lEA3 || enumC1349720lEA == enumC1349720lEA3) {
            this.LLIZLLLIL = enumC1349720lEA;
        }
        TitlePanelBottomSheetBehavior titlePanelBottomSheetBehavior = this.LLJ;
        if (titlePanelBottomSheetBehavior != null && titlePanelBottomSheetBehavior.getState() == 5) {
            onDismiss();
        } else {
            TitlePanelBottomSheetBehavior titlePanelBottomSheetBehavior2 = this.LLJ;
            if (titlePanelBottomSheetBehavior2 != null) {
                titlePanelBottomSheetBehavior2.setState(5);
                return true;
            }
        }
        return true;
    }

    public final void Ho(String str) {
        String str2;
        String str3;
        Aweme aweme;
        String aid;
        int awemeType;
        String str4;
        C1350320lF8 c1350320lF8;
        String authorUid;
        C1350320lF8 c1350320lF82;
        C1350320lF8 c1350320lF83;
        C1354260lLU c1354260lLU = C1354260lLU.LIZ;
        C1354140lLI c1354140lLI = Go().LL;
        String str5 = "";
        if (c1354140lLI == null || (c1350320lF83 = c1354140lLI.LL) == null || (str2 = c1350320lF83.LLILLJJLI) == null) {
            str2 = "";
        }
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        C1354140lLI c1354140lLI2 = Go().LL;
        Aweme aweme2 = null;
        if (c1354140lLI2 != null && (c1350320lF82 = c1354140lLI2.LL) != null) {
            aweme = c1350320lF82.LL;
        } else {
            aweme = null;
        }
        c1354260lLU.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = -1;
        }
        c2344009Gk.LIZJ(awemeType, "aweme_type");
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str5 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str5);
        C20684815ws.LJIILLIIL("title_panel_close", c2344009Gk.LIZ);
        C1354140lLI c1354140lLI3 = Go().LL;
        if (c1354140lLI3 != null && (c1350320lF8 = c1354140lLI3.LL) != null) {
            aweme2 = c1350320lF8.LL;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "click_exit");
        if (aweme2 != null && AwemeExtKt.isTextMoreAd(aweme2)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "close", aweme2.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("text_more_panel", "refer");
            if (zLJFF) {
                str4 = "close_button";
            } else {
                str4 = "pull_down";
            }
            c1022820ciuLIZLLL.LIZIZ(str4, "interaction_type");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1349690lE7
    public final void aj(C1343140l3Y c1343140l3Y) {
        C1354270lLV c1354270lLV = this.LLJI;
        if (c1354270lLV == null) {
            List<InterfaceC1343320l3q> list = this.LLJJ;
            if (list == null) {
                this.LLJJ = C1697810uHb.LJIILJJIL(c1343140l3Y);
                return;
            } else {
                list.add(c1343140l3Y);
                return;
            }
        }
        if (c1354270lLV.LL.contains(c1343140l3Y)) {
            return;
        }
        c1354270lLV.LL.add(c1343140l3Y);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TitlePanelRootScope.class}).unbindAbility(this.LLJILLL, InterfaceC1349690lE7.class);
    }

    @Override // X.InterfaceC1349690lE7
    public final void d9(InterfaceC1354310lLZ interfaceC1354310lLZ) {
        this.LLJIJIL.add(interfaceC1354310lLZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TitlePanelBottomSheetBehavior titlePanelBottomSheetBehavior;
        super.onViewCreated(view);
        this.LLJILJILJ = EnumC1354280lLW.LLILLJJLI;
        final C416060GTc c416060GTc = (C416060GTc) view.findViewById(R.id.y2l);
        if (c416060GTc == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            c416060GTc.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.0lLd
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    view2.setPadding(0, 0, 0, windowInsets.getInsets(2).bottom);
                    return windowInsets;
                }
            });
        }
        TitlePanelBottomSheetBehavior.Companion.getClass();
        ViewGroup.LayoutParams layoutParams = c416060GTc.getLayoutParams();
        if (layoutParams instanceof C16G1) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if ((c16bc instanceof TitlePanelBottomSheetBehavior) && (titlePanelBottomSheetBehavior = (TitlePanelBottomSheetBehavior) c16bc) != null) {
                this.LLJ = titlePanelBottomSheetBehavior;
                titlePanelBottomSheetBehavior.setPeekHeight(0);
                titlePanelBottomSheetBehavior.setGestureInsetBottomIgnored(true);
                titlePanelBottomSheetBehavior.setSkipCollapsed(true);
                titlePanelBottomSheetBehavior.setFitToContents(true);
                titlePanelBottomSheetBehavior.setHideable(true);
                titlePanelBottomSheetBehavior.setBeginHideCallback$common_feed_release(new InterfaceC1354320lLa() { // from class: X.0lLT
                    @Override // X.InterfaceC1354320lLa
                    public final void LIZ(int i) {
                        EnumC1349720lEA enumC1349720lEA;
                        TitlePanelSheetAssem titlePanelSheetAssem = this.LIZ;
                        if (i == 1) {
                            enumC1349720lEA = EnumC1349720lEA.SWIPE_DOWN;
                        } else {
                            enumC1349720lEA = EnumC1349720lEA.SWIPE_RIGHT;
                        }
                        EnumC1349720lEA enumC1349720lEA2 = titlePanelSheetAssem.LLIZLLLIL;
                        EnumC1349720lEA enumC1349720lEA3 = EnumC1349720lEA.NONE;
                        if (enumC1349720lEA2 == enumC1349720lEA3 || enumC1349720lEA == enumC1349720lEA3) {
                            titlePanelSheetAssem.LLIZLLLIL = enumC1349720lEA;
                        }
                    }
                });
                titlePanelBottomSheetBehavior.setOptBottomSheetCallback(new AbstractC1354300lLY() { // from class: X.0lLX
                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view2, float f) {
                    }

                    @Override // X.AbstractC1354300lLY
                    public final void LJ(int i) {
                        if (i == 5) {
                            this.LIZ.onDismiss();
                        }
                    }
                });
                float fLIZIZ = C418440Gaw.LIZIZ(26);
                float fLIZIZ2 = C418440Gaw.LIZIZ(26);
                c416060GTc.setClipToOutline(true);
                final float[] fArr = new float[8];
                if (C426750GoL.LIZLLL(c416060GTc.getContext())) {
                    fArr[0] = fLIZIZ2;
                    fArr[1] = fLIZIZ2;
                    fArr[2] = fLIZIZ;
                    fArr[3] = fLIZIZ;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                } else {
                    fArr[0] = fLIZIZ;
                    fArr[1] = fLIZIZ;
                    fArr[2] = fLIZIZ2;
                    fArr[3] = fLIZIZ2;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                }
                c416060GTc.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0Ga2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view2, Outline outline) {
                        if (view2 == null) {
                            return;
                        }
                        Path path = new Path();
                        path.addRoundRect(0.0f, 0.0f, view2.getWidth(), view2.getHeight(), fArr, Path.Direction.CW);
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (outline != null) {
                                outline.setPath(path);
                            }
                        } else {
                            if (outline == null) {
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                    }
                });
                c416060GTc.invalidate();
                View viewFindViewById = view.findViewById(R.id.y29);
                final FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.y2h);
                final C1354270lLV c1354270lLV = (C1354270lLV) LJJIJL().findViewById(R.id.y2g);
                this.LLJI = c1354270lLV;
                if (c1354270lLV == null) {
                    return;
                }
                final C1354220lLQ c1354220lLQ = Go().LLILLJJLI;
                int i = C1354200lLO.LIZ[c1354220lLQ.LIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c416060GTc.getLayoutParams().height = -2;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c416060GTc.getLayoutParams().height = 0;
                    }
                } else {
                    c416060GTc.getLayoutParams().height = c1354220lLQ.LIZIZ;
                }
                final int i2 = 0;
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this, c1354220lLQ, c416060GTc, i2) { // from class: X.0maN
                    public final int $t;
                    public Object l0;
                    public Object l1;
                    public Object l2;

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        switch (this.$t) {
                            case 0:
                                onLayoutChange$0(this, view2, i3, i4, i5, i6, i7, i8, i9, i10);
                                break;
                            case 1:
                                onLayoutChange$1(this, view2, i3, i4, i5, i6, i7, i8, i9, i10);
                                break;
                        }
                    }

                    {
                        this.$t = i2;
                        this.l0 = this;
                        this.l1 = c1354220lLQ;
                        this.l2 = c416060GTc;
                    }

                    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1401930maN viewOnLayoutChangeListenerC1401930maN, View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        int i11 = i6 - i4;
                        if (i11 != i10 - i8) {
                            TitlePanelRootVM titlePanelRootVMGo = ((TitlePanelSheetAssem) viewOnLayoutChangeListenerC1401930maN.l0).Go();
                            if (titlePanelRootVMGo.getState().LL != i11) {
                                titlePanelRootVMGo.setState(new AwS34S0001000_21(i11, 13));
                            }
                            C1354220lLQ c1354220lLQ2 = (C1354220lLQ) viewOnLayoutChangeListenerC1401930maN.l1;
                            EnumC1354210lLP enumC1354210lLP = c1354220lLQ2.LIZ;
                            if (enumC1354210lLP == EnumC1354210lLP.EXACTLY_RATIO) {
                                ((C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2).getLayoutParams().height = (int) (i11 * ((C1354220lLQ) viewOnLayoutChangeListenerC1401930maN.l1).LIZJ);
                                C416060GTc c416060GTc2 = (C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2;
                                HandlerHook.viewPost(c416060GTc2, new ARunnableS106S0100000_6((Object) c416060GTc2, 62));
                                return;
                            }
                            if (enumC1354210lLP != EnumC1354210lLP.WRAP_CONTENT) {
                                return;
                            }
                            float f = i11;
                            ((C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2).setMaxHeightCompat((int) (c1354220lLQ2.LJ * f));
                            ((C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2).setMinHeightCompat((int) (f * ((C1354220lLQ) viewOnLayoutChangeListenerC1401930maN.l1).LIZLLL));
                        }
                    }

                    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1401930maN viewOnLayoutChangeListenerC1401930maN, View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        int height;
                        int i11 = i6 - i4;
                        if (i11 != i10 - i8) {
                            TitlePanelRootVM titlePanelRootVMGo = ((TitlePanelSheetAssem) viewOnLayoutChangeListenerC1401930maN.l0).Go();
                            if (titlePanelRootVMGo.getState().LLILLJJLI != i11) {
                                titlePanelRootVMGo.setState(new AwS34S0001000_21(i11, 14));
                            }
                            if (i11 > 0) {
                                TitlePanelSheetAssem titlePanelSheetAssem = (TitlePanelSheetAssem) viewOnLayoutChangeListenerC1401930maN.l0;
                                if (titlePanelSheetAssem.LLJILJILJ == EnumC1354280lLW.LLILLJJLI) {
                                    titlePanelSheetAssem.Jo();
                                }
                            }
                            if (((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1) != null && ((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).getLayoutParams().height != (height = ((C1354270lLV) viewOnLayoutChangeListenerC1401930maN.l2).getHeight() - ((C1354270lLV) viewOnLayoutChangeListenerC1401930maN.l2).getPaddingBottom())) {
                                ((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).getLayoutParams().height = height;
                                if (((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).getVisibility() != 8) {
                                    ((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).requestLayout();
                                }
                            }
                        }
                    }
                });
                final int i3 = 1;
                c416060GTc.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this, frameLayout, c1354270lLV, i3) { // from class: X.0maN
                    public final int $t;
                    public Object l0;
                    public Object l1;
                    public Object l2;

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        switch (this.$t) {
                            case 0:
                                onLayoutChange$0(this, view2, i32, i4, i5, i6, i7, i8, i9, i10);
                                break;
                            case 1:
                                onLayoutChange$1(this, view2, i32, i4, i5, i6, i7, i8, i9, i10);
                                break;
                        }
                    }

                    {
                        this.$t = i3;
                        this.l0 = this;
                        this.l1 = frameLayout;
                        this.l2 = c1354270lLV;
                    }

                    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1401930maN viewOnLayoutChangeListenerC1401930maN, View view2, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        int i11 = i6 - i4;
                        if (i11 != i10 - i8) {
                            TitlePanelRootVM titlePanelRootVMGo = ((TitlePanelSheetAssem) viewOnLayoutChangeListenerC1401930maN.l0).Go();
                            if (titlePanelRootVMGo.getState().LL != i11) {
                                titlePanelRootVMGo.setState(new AwS34S0001000_21(i11, 13));
                            }
                            C1354220lLQ c1354220lLQ2 = (C1354220lLQ) viewOnLayoutChangeListenerC1401930maN.l1;
                            EnumC1354210lLP enumC1354210lLP = c1354220lLQ2.LIZ;
                            if (enumC1354210lLP == EnumC1354210lLP.EXACTLY_RATIO) {
                                ((C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2).getLayoutParams().height = (int) (i11 * ((C1354220lLQ) viewOnLayoutChangeListenerC1401930maN.l1).LIZJ);
                                C416060GTc c416060GTc2 = (C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2;
                                HandlerHook.viewPost(c416060GTc2, new ARunnableS106S0100000_6((Object) c416060GTc2, 62));
                                return;
                            }
                            if (enumC1354210lLP != EnumC1354210lLP.WRAP_CONTENT) {
                                return;
                            }
                            float f = i11;
                            ((C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2).setMaxHeightCompat((int) (c1354220lLQ2.LJ * f));
                            ((C416060GTc) viewOnLayoutChangeListenerC1401930maN.l2).setMinHeightCompat((int) (f * ((C1354220lLQ) viewOnLayoutChangeListenerC1401930maN.l1).LIZLLL));
                        }
                    }

                    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1401930maN viewOnLayoutChangeListenerC1401930maN, View view2, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        int height;
                        int i11 = i6 - i4;
                        if (i11 != i10 - i8) {
                            TitlePanelRootVM titlePanelRootVMGo = ((TitlePanelSheetAssem) viewOnLayoutChangeListenerC1401930maN.l0).Go();
                            if (titlePanelRootVMGo.getState().LLILLJJLI != i11) {
                                titlePanelRootVMGo.setState(new AwS34S0001000_21(i11, 14));
                            }
                            if (i11 > 0) {
                                TitlePanelSheetAssem titlePanelSheetAssem = (TitlePanelSheetAssem) viewOnLayoutChangeListenerC1401930maN.l0;
                                if (titlePanelSheetAssem.LLJILJILJ == EnumC1354280lLW.LLILLJJLI) {
                                    titlePanelSheetAssem.Jo();
                                }
                            }
                            if (((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1) != null && ((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).getLayoutParams().height != (height = ((C1354270lLV) viewOnLayoutChangeListenerC1401930maN.l2).getHeight() - ((C1354270lLV) viewOnLayoutChangeListenerC1401930maN.l2).getPaddingBottom())) {
                                ((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).getLayoutParams().height = height;
                                if (((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).getVisibility() != 8) {
                                    ((FrameLayout) viewOnLayoutChangeListenerC1401930maN.l1).requestLayout();
                                }
                            }
                        }
                    }
                });
                List<InterfaceC1343320l3q> list = this.LLJJ;
                if (list != null) {
                    for (InterfaceC1343320l3q interfaceC1343320l3q : list) {
                        if (!c1354270lLV.LL.contains(interfaceC1343320l3q)) {
                            c1354270lLV.LL.add(interfaceC1343320l3q);
                        }
                    }
                }
                this.LLJJ = null;
                viewFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1401880maI(this, c1354270lLV, viewFindViewById, frameLayout, 0));
                View viewFindViewById2 = view.findViewById(R.id.y2_);
                if (viewFindViewById2 != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1212570hex() { // from class: X.0lLS
                        @Override // X.AbstractViewOnClickListenerC1212570hex
                        public final void LIZ(View view2) {
                            if (view2 != null) {
                                this.LLILZ.H5(EnumC1349720lEA.CLICK_OUTSIDE);
                            }
                        }
                    }, viewFindViewById2);
                }
                View viewFindViewById3 = view.findViewById(R.id.y28);
                if (viewFindViewById3 != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1212570hex() { // from class: X.0lLR
                        @Override // X.AbstractViewOnClickListenerC1212570hex
                        public final void LIZ(View view2) {
                            C1350320lF8 c1350320lF8;
                            String aid;
                            int awemeType;
                            String authorUid;
                            if (view2 != null) {
                                this.LLILZ.H5(EnumC1349720lEA.CLICK_CLOSE_ICON);
                                C1354260lLU c1354260lLU = C1354260lLU.LIZ;
                                C1354140lLI c1354140lLI = this.LLILZ.Go().LL;
                                if (c1354140lLI != null) {
                                    c1350320lF8 = c1354140lLI.LL;
                                } else {
                                    c1350320lF8 = null;
                                }
                                c1354260lLU.getClass();
                                if (c1350320lF8 != null) {
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJIIIIZZ("enter_from", c1350320lF8.LLILLJJLI);
                                    c2344009Gk.LJIIIIZZ("enter_method", c1350320lF8.LLILZIL);
                                    c2344009Gk.LJIIIIZZ("click_actions", "click_close");
                                    Aweme aweme = c1350320lF8.LL;
                                    String str = "";
                                    if (aweme == null || (aid = aweme.getAid()) == null) {
                                        aid = "";
                                    }
                                    c2344009Gk.LJIIIIZZ("group_id", aid);
                                    Aweme aweme2 = c1350320lF8.LL;
                                    if (aweme2 != null) {
                                        awemeType = aweme2.getAwemeType();
                                    } else {
                                        awemeType = -1;
                                    }
                                    c2344009Gk.LIZJ(awemeType, "aweme_type");
                                    Aweme aweme3 = c1350320lF8.LL;
                                    if (aweme3 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme3)) != null) {
                                        str = authorUid;
                                    }
                                    c2344009Gk.LJIIIIZZ("author_id", str);
                                    C20684815ws.LJIILLIIL("title_panel_click", c2344009Gk.LIZ);
                                }
                            }
                        }
                    }, viewFindViewById3);
                }
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TitlePanelRootScope.class}).bindAbility(this.LLJILLL, InterfaceC1349690lE7.class);
    }
}
