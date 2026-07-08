package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic;

import X.AbstractC1252750ihl;
import X.AbstractC21673619ry;
import X.AnonymousClass0317;
import X.C004I;
import X.C01GW;
import X.C034S;
import X.C03C8;
import X.C03DZ;
import X.C03FA;
import X.C04E4;
import X.C098200Yq;
import X.C0H1U;
import X.C0H9H;
import X.C0HI3;
import X.C1058220de0;
import X.C1077804Jk;
import X.C1120604Zw;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1749280vcc;
import X.C1765020w20;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2217381BqS;
import X.C259800zU;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C809903Ej;
import X.C811603Fa;
import X.C817603Hi;
import X.C960203pA;
import X.C963403pg;
import X.C963603pi;
import X.C963903pl;
import X.C964303pp;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ACListenerS105S0200000_1;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import i0b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticSelectFragment extends ECBaseFragment implements InterfaceC1171660gay, c {
    public static LogisticSelectFragment LLJJIJI = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZys2JCHELIOSw6LD0qZjUtLip9JCorIDwnISZiBSA0ITY4ICwALSkpKjsVOiQrJCo9PA==";
    public C0HI3 LLILLL;
    public FrameLayout LLILZ;
    public C04E4 LLILZIL;
    public TuxNavBar LLILZLL;
    public C809903Ej LLIZ;
    public C1749280vcc LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public LinearLayout LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final AwS545S0100000_1 LLJJ;
    public boolean LLJJI;
    public C963403pg LLJJIII;

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "logistics";
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "LogisticSelectFragment";
    }

    public final C04E4 WR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cal) : null;
            this.LLILZIL = (C04E4) viewFindViewById;
        }
        return (C04E4) viewFindViewById;
    }

    public final C809903Ej ZR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rnt) : null;
            this.LLIZ = (C809903Ej) viewFindViewById;
        }
        return (C809903Ej) viewFindViewById;
    }

    public final C0HI3 aS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LLILLL = (C0HI3) viewFindViewById;
        }
        return (C0HI3) viewFindViewById;
    }

    public final TuxTextView bS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tu4) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxNavBar cS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xzl) : null;
            this.LLILZLL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final DeliveryPanelViewModel dS() {
        return (DeliveryPanelViewModel) this.LLJILJIL.getValue();
    }

    public LogisticSelectFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 6));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 93));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 95));
        this.LLJJ = new AwS545S0100000_1(this, 94);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        if (dS().LLJJJJLIIL.LIZ) {
            return;
        }
        C817603Hi c817603Hi = dS().LLJJJJLIIL;
        DeliveryPanelStarter.EnterParam enterParam = dS().LLILZIL;
        c817603Hi.LIZJ = enterParam != null ? enterParam.btmToken : null;
        dS().LLJJJJLIIL.LJIIL(this, "a2270.b5363", null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DeliveryPanelViewModel deliveryPanelViewModelDS = dS();
        if (deliveryPanelViewModelDS.FQ2().getStatus() == 0) {
            deliveryPanelViewModelDS.BR2(0L, "user_leave", false);
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LLD(new C964303pp(this.LLJJ));
        }
        dS().lR2();
        this.LLILLL = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        LLJJIJI = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        String string;
        int size;
        if (!((Boolean) withState(dS(), AFwS228S0000000_1.get$arr$(50))).booleanValue()) {
            return false;
        }
        DeliveryPanelViewModel deliveryPanelViewModelDS = dS();
        DeliveryPanelState deliveryPanelStateFQ2 = deliveryPanelViewModelDS.FQ2();
        if (deliveryPanelStateFQ2.getStatus() != 0) {
            Integer num = deliveryPanelViewModelDS.LLJIJIL;
            if (num == null || (string = num.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            HashMap map2 = (HashMap) map;
            map2.put("biz_type", string);
            List<Object> logisticList = deliveryPanelStateFQ2.getLogisticList();
            if (logisticList != null) {
                size = logisticList.size();
            } else {
                size = 0;
            }
            map2.put("content_list_size", String.valueOf(size));
            if (deliveryPanelStateFQ2.getStatus() != 2 && deliveryPanelStateFQ2.getStatus() != 3) {
                List<Object> logisticList2 = deliveryPanelStateFQ2.getLogisticList();
                if (logisticList2 != null && logisticList2.isEmpty()) {
                    map2.put("blank_type", "no_meta_data");
                    return true;
                }
            } else {
                map2.put("blank_type", "error_status");
                return true;
            }
        }
        if (dS().FQ2().getStatus() != -1 || (aS().getChildCount() > 0 && aS().getHeight() > 0)) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS228S0000000_1.get$arr$(48));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", AFwS228S0000000_1.get$arr$(49));
    }

    public final void VR(ECRichText eCRichText, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        C786410Ut5.LLLLZLL(bS(), 0);
        C03C8.LIZJ(bS(), eCRichText, "rt_privacy_policy", interfaceC1631620sYq);
        bS().setMovementMethod(LinkMovementMethod.getInstance());
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.v_sep_line);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = viewFindViewById;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        if (!this.LLJJI) {
            C03FA.LJFF("shipping_policy", null, null, 6);
            this.LLJJI = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        LogisticPanelModule logisticPanelModule;
        DeliveryPanelStarter.EnterParam enterParam;
        Integer num;
        List<SelectionBar> list;
        boolean z;
        ECRichText eCRichText;
        List<SelectionBar> list2;
        DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage;
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        super.onViewCreated(view, bundle);
        LLJJIJI = this;
        DeliveryPanelViewModel deliveryPanelViewModelDS = dS();
        Parcelable parcelable = deliveryPanelViewModelDS.LLILZLL;
        int i = 1;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            deliveryPanelViewModelDS.LLJILJIL = "continue";
            deliveryPanelViewModelDS.LLJJ = null;
            deliveryPanelViewModelDS.LLJJIII = 1;
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            deliveryPanelViewModelDS.LLJILJIL = "save";
            DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage2 = (DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable;
            deliveryPanelViewModelDS.LLJILJILJ = enterParamForOrderSubmitPage2.panelTitle;
            deliveryPanelViewModelDS.LLJJ = enterParamForOrderSubmitPage2.selfCollectionOpt;
            deliveryPanelViewModelDS.LLJJIII = 2;
        }
        dS().CR2();
        DeliveryPanelStarter.EnterParam enterParam2 = dS().LLILZIL;
        if (enterParam2 != null && Intrinsics.LJFF(enterParam2.hideTitle, Boolean.TRUE)) {
            C786410Ut5.LLLLZLLLI(cS(), 8);
        } else {
            C04E4 c04e4WR = WR();
            Context context = getContext();
            if (context != null) {
                string = context.getString(((b) this.LLJILLL.getValue()).LJZL());
            } else {
                string = null;
            }
            c04e4WR.setText(string);
            withState(dS(), new AwS580S0100000_1(this, 997));
        }
        C04E4 c04e4WR2 = WR();
        ((b) this.LLJILLL.getValue()).LJLIIIL();
        c04e4WR2.setStyle(1);
        WR().setButtonVariant(0);
        C786410Ut5.I7(new AjS60S0100000_1(this, 143), WR());
        Context context2 = getContext();
        if (context2 != null) {
            aS().setAdapter((AbstractC21673619ry) this.LLJILJILJ.getValue());
            aS().setLayoutManager(new LinearLayoutManager(context2));
            aS().addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, context2), 0, C12ES.LIZJ(16.0f, context2), 2));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IPerformanceOptDependencyService.class.getName();
                if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
            }
            ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor("tiktokec_anchor_logistics").LIZIZ(aS());
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJFF(new C964303pp(this.LLJJ));
        }
        Parcelable parcelable2 = dS().LLILZLL;
        if ((parcelable2 instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) && (enterParamForOrderSubmitPage = (DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable2) != null) {
            logisticPanelModule = enterParamForOrderSubmitPage.logisticsPanelModule;
        } else {
            logisticPanelModule = null;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            View viewFindViewById = this.LLJIJIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.flh);
                } else {
                    viewFindViewById = null;
                }
                this.LLJIJIL = (LinearLayout) viewFindViewById;
            }
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            C963603pi c963603pi = new C963603pi(dS());
            if (logisticPanelModule != null) {
                list = logisticPanelModule.selectionBar;
            } else {
                list = null;
            }
            this.LLJJIII = new C963403pg(linearLayout, c963603pi, activity, list);
            if (logisticPanelModule != null && Intrinsics.LJFF(logisticPanelModule.showSelectionBar, Boolean.TRUE) && (list2 = logisticPanelModule.selectionBar) != null && !list2.isEmpty()) {
                z = true;
                TuxNavBar tuxNavBarCS = cS();
                if (tuxNavBarCS != null) {
                    tuxNavBarCS.LJIIZILJ(false);
                }
                C0HI3 c0hi3AS = aS();
                if (c0hi3AS != null) {
                    C0H1U.LJIIJ(0, c0hi3AS);
                }
            } else {
                z = false;
            }
            C963403pg c963403pg = this.LLJJIII;
            if (c963403pg != null) {
                if (!Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE)) {
                    C03DZ.LIZ(c963403pg.LIZ);
                } else {
                    C03DZ.LIZJ(c963403pg.LIZ);
                    LinearLayout linearLayout2 = c963403pg.LIZ;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJJJJJL(linearLayout2);
                    }
                    ((ArrayList) c963403pg.LJ).clear();
                    List<SelectionBar> list3 = c963403pg.LIZLLL;
                    if (list3 != null) {
                        int i2 = 0;
                        for (SelectionBar selectionBar : list3) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                SelectionBar selectionBar2 = selectionBar;
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                                layoutParams.weight = 1.0f;
                                if (i2 > 0) {
                                    layoutParams.setMarginStart((int) C418440Gaw.LIZIZ(4));
                                }
                                LinearLayout linearLayout3 = new LinearLayout(c963403pg.LIZJ);
                                linearLayout3.setOrientation(i);
                                linearLayout3.setGravity(17);
                                linearLayout3.setPadding(C0H9H.LIZIZ(12), C0H9H.LIZIZ(4), C0H9H.LIZIZ(12), C0H9H.LIZIZ(4));
                                TuxTextView tuxTextView = new TuxTextView(c963403pg.LIZJ, null, 6, 0);
                                tuxTextView.setText(selectionBar2.title);
                                tuxTextView.setGravity(17);
                                tuxTextView.setTuxFont(52);
                                tuxTextView.setMaxLines(i);
                                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                                linearLayout3.addView(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                                C259800zU c259800zU = new C259800zU();
                                List<ECRichText> list4 = selectionBar2.titleAppendix;
                                if (list4 != null && (eCRichText = (ECRichText) C13LP.LJJJLL(list4)) != null) {
                                    ?? tuxTextView2 = new TuxTextView(c963403pg.LIZJ, null, 6, 0);
                                    tuxTextView2.setGravity(17);
                                    tuxTextView2.setTuxFont(71);
                                    tuxTextView2.setPadding(0, C0H9H.LIZIZ(2), 0, 0);
                                    C03C8.LIZJ(tuxTextView2, eCRichText, "source_logistic_sub_title", null);
                                    c259800zU.element = tuxTextView2;
                                    linearLayout3.addView((View) tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
                                }
                                LinearLayout linearLayout4 = c963403pg.LIZ;
                                if (linearLayout4 != null) {
                                    linearLayout4.addView(linearLayout3, layoutParams);
                                }
                                ((ArrayList) c963403pg.LJ).add(new C963903pl(linearLayout3, tuxTextView, (TuxTextView) c259800zU.element));
                                C786410Ut5.R7(linearLayout3, new ACListenerS105S0200000_1(selectionBar2, c963403pg, 22));
                                i2 = i3;
                                i = 1;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        C11EA.LJII(this, dS(), new C2217381BqS() { // from class: X.03pm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getTab());
            }
        }, new AwS615S0100000_1(this, 233));
        C11EA.LJII(this, dS(), new C2217381BqS() { // from class: X.03pv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getLogisticList();
            }
        }, new AwS615S0100000_1(this, 234));
        C11EA.LJII(this, dS(), new C2217381BqS() { // from class: X.03pw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getClaimVoucherExceptionUX();
            }
        }, new AwS615S0100000_1(this, 236));
        C11EA.LJIIIIZZ(this, dS(), new C2217381BqS() { // from class: X.03pk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getStatus());
            }
        }, new C2217381BqS() { // from class: X.03pn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getTab());
            }
        }, new AwS650S0100000_1(this, 29));
        C11EA.LJII(this, dS(), new C2217381BqS() { // from class: X.03Gw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getSelectedLogistic();
            }
        }, new AwS615S0100000_1(this, 230));
        C11EA.LJIIIZ(this, dS(), new C2217381BqS() { // from class: X.03pu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getAddressRenderData();
            }
        }, new C2217381BqS() { // from class: X.03pq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getSelectedShipToInfo();
            }
        }, new C2217381BqS() { // from class: X.03pr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getPrivacyPolicyStatement();
            }
        }, new C2217381BqS() { // from class: X.03ps
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getShippingPolicyModule();
            }
        }, new C1077804Jk(this, 6));
        if (C811603Fa.LIZ()) {
            C11EA.LJII(this, dS(), new C2217381BqS() { // from class: X.03pt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((DeliveryPanelState) obj).getLogistics();
                }
            }, new AwS615S0100000_1(this, 232));
        }
        dS().LLJJIJIL = SystemClock.elapsedRealtime();
        dS().uR2(getContext());
        if (dS().zR2() || ((enterParam = dS().LLILZIL) != null && (num = enterParam.selectTab) != null && num.intValue() == 2)) {
            TuxNavBar tuxNavBarCS2 = cS();
            if (tuxNavBarCS2 != null) {
                tuxNavBarCS2.LJIIZILJ(false);
            }
            DeliveryPanelViewModel deliveryPanelViewModelDS2 = dS();
            deliveryPanelViewModelDS2.getClass();
            deliveryPanelViewModelDS2.setState(new AwS16S0001000_1(2, 16));
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.anv, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
