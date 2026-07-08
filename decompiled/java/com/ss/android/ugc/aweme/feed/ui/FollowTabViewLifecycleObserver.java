package com.ss.android.ugc.aweme.feed.ui;

import X.AbstractC1255540imG;
import X.AbstractC1584410rKh;
import X.C01GW;
import X.C04R9;
import X.C059B;
import X.C08TN;
import X.C098200Yq;
import X.C0BK6;
import X.C0DMM;
import X.C0J5E;
import X.C0J6Q;
import X.C0J8Q;
import X.C0J97;
import X.C0J9A;
import X.C0QSJ;
import X.C0S4U;
import X.C0X35;
import X.C1255500imC;
import X.C1255510imD;
import X.C1255550imH;
import X.C1255570imJ;
import X.C12ES;
import X.C1324840ka2;
import X.C1388190mED;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1570570qyN;
import X.C1581510rG1;
import X.C1584440rKk;
import X.C1585060rLk;
import X.C1588550rRN;
import X.C1588690rRb;
import X.C1590840rV4;
import X.C1590890rV9;
import X.C1590900rVA;
import X.C1590910rVB;
import X.C1590920rVC;
import X.C1590930rVD;
import X.C1619080sEc;
import X.C1620910sHZ;
import X.C1697810uHb;
import X.C189200o6;
import X.C1903780zdo;
import X.C199Y;
import X.C19EG;
import X.C1C7U;
import X.C20629915o1;
import X.C20684815ws;
import X.C2344009Gk;
import X.C296200BjG;
import X.C303460Buy;
import X.C418440Gaw;
import X.C424620Gku;
import X.C452501pT;
import X.C486860J7k;
import X.C607830Nsj;
import X.C607840Nsk;
import X.C614770O9j;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC1255080ilW;
import X.EnumC1570580qyO;
import X.EnumC1584360rKc;
import X.EnumC1588650rRX;
import X.EnumC805750VjB;
import X.InterfaceC1055110dYz;
import X.InterfaceC1583870rJp;
import X.InterfaceC1585190rLx;
import X.InterfaceC1586210rNb;
import X.InterfaceC1590940rVE;
import X.InterfaceC1590960rVG;
import X.InterfaceC1711206n0;
import X.InterfaceC19244510Qp;
import X.InterfaceC20315114eL;
import X.InterfaceC20622815ms;
import X.InterfaceC482890Iwh;
import X.RunnableC1590880rV8;
import Y.AComparatorS28S0000000_9;
import Y.ALAdapterS13S0100000_17;
import Y.AObjectS123S0000000_24;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS124S0100000_24;
import Y.AUListenerS254S0100000_4;
import Y.AUListenerS260S0100000_10;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.reddot.RedDotService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.service.protection.TooltipProtectionSetting;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowTabViewLifecycleObserver extends AbstractC1584410rKh implements FollowTabAbility, InterfaceC1055110dYz {
    public View LL;
    public View LLILLJJLI;
    public ViewStub LLILLL;
    public TextView LLILZ;
    public ViewStub LLILZIL;
    public TextView LLILZLL;
    public ViewGroup LLIZ;
    public ViewStub LLIZLLLIL;
    public List<? extends C424620Gku> LLJ;
    public View LLJI;
    public ViewStub LLJIJIL;
    public C607840Nsk LLJILJILJ;
    public InterfaceC1590940rVE LLJJI;
    public int LLJJIII;
    public C0J6Q LLJJIJIL;
    public boolean LLJJJJ;
    public C19EG LLJJL;
    public final Map<Integer, C607840Nsk> LLJILJIL = new LinkedHashMap();
    public final BPEAHandler LLJILLL = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC1590880rV8 LLJJ = new Runnable() { // from class: X.0rV8
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("FollowTabViewLifecycleObserver@f208.newHintRunnable$1");
            try {
                this.LL.LJIIZILJ(false);
                this.LL.LJJIL();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("FollowTabViewLifecycleObserver@f208.newHintRunnable$1");
        }
    };
    public int LLJJIJI = -1;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C1590900rVA());
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C1590890rV9());
    public EnumC1588650rRX LLJJJIL = EnumC1588650rRX.NONE;
    public final C1590910rVB LLJJJJJIL = new InterfaceC1585190rLx() { // from class: X.0rVB
        @Override // X.InterfaceC1585190rLx
        public final void p1(String str, String str2) {
            C0J6Q c0j6q = this.LL.LLJJIJIL;
            if (c0j6q != null) {
                c0j6q.LJII(str2);
            }
        }
    };
    public final C1620910sHZ LLJJJJLIIL = new C1620910sHZ(this, 14);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C1588690rRb());
    public final C1590840rV4 LLJL = new InterfaceC482890Iwh() { // from class: X.0rV4
        @Override // X.InterfaceC482890Iwh
        public final void LIZ() {
            Context context;
            C19EG c19egLIZIZ;
            MainActivityScope mainActivityScopeLIZJ;
            HomeTabAbility homeTabAbilityLIZ;
            InterfaceC1590940rVE interfaceC1590940rVE;
            C0J90 c0j90LJJIIZI;
            String strLIZJ;
            C1587230rPF socialTabNoticeData = C1595430rcT.LIZIZ.LIZIZ().getSocialTabNoticeData();
            C0J9A c0j9aLJIILIIL = this.LIZ.LJIILIIL();
            if (c0j9aLJIILIIL != null && (c0j90LJJIIZI = c0j9aLJIILIIL.LJJIIZI()) != null) {
                C1590820rV2 c1590820rV2 = new C1590820rV2("enter_homepage_follow");
                if (socialTabNoticeData != null) {
                    String str = socialTabNoticeData.LIZ;
                    Integer numValueOf = Integer.valueOf(socialTabNoticeData.LIZIZ);
                    Integer numValueOf2 = Integer.valueOf(socialTabNoticeData.LJFF);
                    Integer numValueOf3 = Integer.valueOf(socialTabNoticeData.LJI);
                    if (str != null) {
                        c1590820rV2.LJ("notice_type", str);
                        c1590820rV2.LIZLLL(numValueOf.intValue(), "number_cnt");
                        c1590820rV2.LIZLLL(numValueOf2.intValue(), "number_cnt_single");
                        c1590820rV2.LIZLLL(numValueOf3.intValue(), "number_cnt_mutual");
                    }
                }
                c1590820rV2.LJIJ = "click_bubble";
                c1590820rV2.LIZLLL = "homepage_hot";
                c1590820rV2.LJJI = c0j90LJJIIZI.LIZ;
                c1590820rV2.LJJIFFI = c0j90LJJIIZI.LIZIZ;
                C1D0F c1d0f = C1D0F.LIZ;
                c1590820rV2.LJJIII = c1d0f != null ? c1d0f.isConnected() : false;
                if (c1d0f == null || (strLIZJ = c1d0f.LIZJ()) == null) {
                    strLIZJ = "";
                }
                c1590820rV2.LJJIIJ = strLIZJ;
                c1590820rV2.LJIILJJIL();
            }
            if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled() && (interfaceC1590940rVE = this.LIZ.LLJJI) != null && interfaceC1590940rVE.shouldShow()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                c2344009Gk.LJIIIIZZ("position", "follow_tab");
                c2344009Gk.LJIIIIZZ("content", "Live!");
                c2344009Gk.LJIIIIZZ("product_line", "live");
                c2344009Gk.LJIIIIZZ("sub_type", "follow_live");
                c2344009Gk.LJIIIIZZ("tooltip_id", "2002");
                c2344009Gk.LJIIIIZZ("click_method", "click");
                C20684815ws.LJIILLIIL("click_tooltip", c2344009Gk.LIZ);
            }
            View view = this.LIZ.LL;
            if (view == null || (context = view.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                return;
            }
            homeTabAbilityLIZ.fw0(new Bundle(), "Following");
        }

        @Override // X.InterfaceC482890Iwh
        public final void LIZIZ() {
            Object next;
            List<User> list;
            User user;
            FollowTabViewLifecycleObserver followTabViewLifecycleObserver = this.LIZ;
            int i = followTabViewLifecycleObserver.LLJJIJI;
            if (i != -1) {
                followTabViewLifecycleObserver.LJJIJIIJIL(i);
                Iterator it2 = C13LP.LJLLLL(new AComparatorS28S0000000_9(24), ((LinkedHashMap) followTabViewLifecycleObserver.LLJILJIL).values()).iterator();
                while (true) {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    C607840Nsk c607840Nsk = (C607840Nsk) next;
                    if (FollowTabViewLifecycleObserver.LJJIFFI(c607840Nsk.LIZ) && C1903780zdo.LJIIJJI(c607840Nsk.LIZ)) {
                        break;
                    }
                }
                C607840Nsk c607840Nsk2 = (C607840Nsk) next;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("notice_type", FollowTabViewLifecycleObserver.LJIIJJI(followTabViewLifecycleObserver.LLJJIJI));
                c2344009Gk.LJIIIIZZ("action_type", "show");
                if (c607840Nsk2 != null && (list = c607840Nsk2.LIZJ) != null && (user = (User) C13LP.LJJJLL(list)) != null) {
                    c2344009Gk.LJFF("to_user_id", user.getUid());
                }
                int i2 = followTabViewLifecycleObserver.LLJJIJI;
                if (i2 == 41) {
                    int iLJIIJ = C1903780zdo.LJIIJ(i2);
                    c2344009Gk.LIZJ(iLJIIJ, "number_cnt");
                    FollowTabViewLifecycleObserver.LJJIIZI(new C1255500imC(iLJIIJ));
                }
                if (followTabViewLifecycleObserver.LLJJIJI == 38) {
                    c2344009Gk.LIZJ(1, "live_notice_type");
                    FollowTabViewLifecycleObserver.LJJIIZI(new C1255510imD("live"));
                }
                if (followTabViewLifecycleObserver.LLJJIJI == 40) {
                    FollowTabViewLifecycleObserver.LJJIIZI(new C1255550imH());
                }
                C20684815ws.LJIILLIIL("homepage_follow_notice", c2344009Gk.LIZ);
                followTabViewLifecycleObserver.LLJJIJI = -1;
            }
        }

        @Override // X.InterfaceC482890Iwh
        public final void LIZJ() {
            C0J90 c0j90LJJIIZI;
            FollowTabViewLifecycleObserver followTabViewLifecycleObserver = this.LIZ;
            if (followTabViewLifecycleObserver.LLJJIJI == -1) {
                View view = followTabViewLifecycleObserver.LLILLJJLI;
                if (view != null && view.getVisibility() == 0) {
                    followTabViewLifecycleObserver.LLJJIJI = 40;
                    View view2 = followTabViewLifecycleObserver.LLILLJJLI;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                }
                TextView textView = followTabViewLifecycleObserver.LLILZ;
                if (textView != null && textView.getVisibility() == 0) {
                    followTabViewLifecycleObserver.LLJJIJI = 41;
                    TextView textView2 = followTabViewLifecycleObserver.LLILZ;
                    if (textView2 != null) {
                        C786410Ut5.LLIL(textView2, 8);
                    }
                }
                View view3 = followTabViewLifecycleObserver.LLJI;
                if (view3 != null && view3.getVisibility() == 0) {
                    followTabViewLifecycleObserver.LLJJIJI = 38;
                    View view4 = followTabViewLifecycleObserver.LLJI;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(8, view4);
                    }
                }
                RedDotService.LIZ.getClass();
                RedDotService redDotServiceLIZ = C04R9.LIZ();
                if (redDotServiceLIZ != null) {
                    redDotServiceLIZ.LJI(EnumC1584360rKc.FOLLOWING, null);
                }
            }
            C0J9A c0j9aLJIILIIL = this.LIZ.LJIILIIL();
            if (c0j9aLJIILIIL != null && (c0j90LJJIIZI = c0j9aLJIILIIL.LJJIIZI()) != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("notice_type", "live");
                c2344009Gk.LJIIIIZZ("action_type", "show");
                c2344009Gk.LIZJ(c0j90LJJIIZI.LIZ, "live_notice_type");
                c2344009Gk.LIZJ(c0j90LJJIIZI.LIZIZ, "anchor_bubble_num");
                ArrayList<String> arrayList = c0j90LJJIIZI.LIZJ;
                c2344009Gk.LJIIIIZZ("anchor_bubble_list", arrayList != null ? Arrays.toString(arrayList.toArray()) : "[]");
                C20684815ws.LJIILLIIL("homepage_follow_notice", c2344009Gk.LIZ);
            }
            InterfaceC1590940rVE interfaceC1590940rVE = this.LIZ.LLJJI;
            if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled() && interfaceC1590940rVE != null && interfaceC1590940rVE.shouldShow()) {
                interfaceC1590940rVE.LIZJ("2002");
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", "homepage_hot");
                c2344009Gk2.LJIIIIZZ("position", "follow_tab");
                c2344009Gk2.LJIIIIZZ("content", "Live!");
                c2344009Gk2.LJIIIIZZ("product_line", "live");
                c2344009Gk2.LJIIIIZZ("sub_type", "follow_live");
                c2344009Gk2.LJIIIIZZ("tooltip_id", "2002");
                C20684815ws.LJIILLIIL("show_tooltip", c2344009Gk2.LIZ);
            }
        }
    };

    public static String LJIIJJI(int i) {
        switch (i) {
            case 38:
                return "live";
            case 39:
                return "head";
            case 40:
                return "red_dot";
            case 41:
                return "number";
            default:
                return "";
        }
    }

    @Override // X.AbstractC1584410rKh
    public final void LJI() {
        LJIIZILJ(true);
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
    }

    @Override // X.AbstractC1584410rKh
    public final void LIZLLL() {
        EnumC1588650rRX enumC1588650rRX;
        C607840Nsk c607840Nsk = this.LLJILJILJ;
        if (c607840Nsk != null) {
            EnumC1588650rRX[] enumC1588650rRXArrValues = EnumC1588650rRX.values();
            int length = enumC1588650rRXArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC1588650rRX = EnumC1588650rRX.NONE;
                    break;
                }
                enumC1588650rRX = enumC1588650rRXArrValues[i];
                if (enumC1588650rRX.getGroup() == c607840Nsk.LIZ) {
                    break;
                } else {
                    i++;
                }
            }
            this.LLJJJIL = enumC1588650rRX;
            LJJIIJ(c607840Nsk, "click");
        }
        LJIIZILJ(true);
        LJJIL();
    }

    public final C19EG LJIIJ() {
        Context context;
        C19EG c19egLIZIZ = this.LLJJL;
        if (c19egLIZIZ == null) {
            View view = this.LL;
            c19egLIZIZ = (view == null || (context = view.getContext()) == null) ? null : C1388190mED.LIZIZ(context);
            this.LLJJL = c19egLIZIZ;
        }
        return c19egLIZIZ;
    }

    public final C0J9A LJIILIIL() {
        return (C0J9A) this.LLJJIJIIJIL.getValue();
    }

    public final void LJIJJLI() {
        View view = this.LLJI;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        }
        View view2 = this.LLJI;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.LLJI;
        ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iLIZIZ = -measuredWidth;
            if (!((InterfaceC1586210rNb) ServiceManager.get().getService(ISearchService.class)).LJJ()) {
                iLIZIZ -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            }
            marginLayoutParams.setMarginStart(iLIZIZ);
        }
        C1581510rG1.LJFF(this.LLJI);
        View view4 = this.LLJI;
        if (view4 != null) {
            C786410Ut5.W5(view4, layoutParams);
        }
        if (this.LLJI != null) {
            C614770O9j.LIZIZ.LJ().LJIJJ(true);
        }
    }

    public final void LJJ() {
        ViewGroup viewGroup = this.LLIZ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLIZ;
        if (viewGroup2 != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.lda), Integer.valueOf(R.id.ldb), Integer.valueOf(R.id.ldc));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                arrayList.add(viewGroup2.findViewById(((Number) it2.next()).intValue()));
            }
            this.LLJ = arrayList;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C786410Ut5.k((C424620Gku) it3.next(), 8);
            }
        }
    }

    public final boolean LJJI() {
        View view = this.LL;
        if (view == null) {
            return false;
        }
        ITabStrip iTabStrip = (ITabStrip) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ITabStrip.class, null);
        return Intrinsics.LJFF(iTabStrip != null ? iTabStrip.U31(false) : null, "Following");
    }

    public final void LJJIL() {
        int i;
        Object next;
        C19EG c19egLJIIJ;
        int i2;
        Iterator it2 = C13LP.LJLLLL(new Comparator() { // from class: X.0Nsl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(((C607840Nsk) t2).LIZIZ), Integer.valueOf(((C607840Nsk) t).LIZIZ));
            }
        }, ((LinkedHashMap) this.LLJILJIL).values()).iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C607840Nsk c607840Nsk = (C607840Nsk) next;
            boolean zLJJIFFI = LJJIFFI(c607840Nsk.LIZ);
            boolean zLJIIJJI = C1903780zdo.LJIIJJI(c607840Nsk.LIZ);
            if (zLJJIFFI && zLJIIJJI) {
                break;
            }
        }
        C607840Nsk c607840Nsk2 = (C607840Nsk) next;
        if (c607840Nsk2 == null) {
            if (this.LLJILJILJ != null) {
                LJIIZILJ(true);
                return;
            }
            return;
        }
        C607840Nsk c607840Nsk3 = this.LLJILJILJ;
        if (c607840Nsk3 == null || c607840Nsk2.LIZ != c607840Nsk3.LIZ) {
            Iterator<EnumC1588650rRX> it3 = EnumC1588650rRX.getEntries().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                EnumC1588650rRX next2 = it3.next();
                if (c607840Nsk2.LIZ == next2.getGroup()) {
                    if (next2 != null) {
                        Iterator it4 = ((List) this.LLJJLIIIJLLLLLLLZ.getValue()).iterator();
                        while (it4.hasNext()) {
                            ((Function1) it4.next()).invoke(next2);
                        }
                    }
                }
            }
            C0J6Q c0j6q = this.LLJJIJIL;
            if ((!(c0j6q != null && c0j6q.LJI()) || ((i2 = c607840Nsk2.LIZ) != 40 && i2 != 41 && i2 != 38)) && (c19egLJIIJ = LJIIJ()) != null) {
                if (Hox.LLJILJIL.LIZ(c19egLJIIJ).LQ2("HOME")) {
                    LJJIIJ(c607840Nsk2, "show");
                } else {
                    this.LLJJJJ = true;
                }
            }
            this.LLJILJILJ = c607840Nsk2;
            this.LLJILLL.removeCallbacks(this.LLJJ);
            int i3 = c607840Nsk2.LIZ;
            switch (i3) {
                case 38:
                    LJJIZ(i3);
                    C786410Ut5.LJLIIL(120000L, this.LLJILLL, this.LLJJ);
                    return;
                case 39:
                    LJJIZ(-1);
                    List<User> list = c607840Nsk2.LIZJ;
                    if (list != null) {
                        int size = list.size();
                        if (C303460Buy.LIZ() && this.LLIZ == null && this.LLIZLLLIL != null) {
                            C0X35.LJIILL(new ARunnableS117S0100000_17(this, 272));
                        }
                        List<? extends C424620Gku> list2 = this.LLJ;
                        if (list2 != null) {
                            int i4 = 0;
                            for (Object obj : (ArrayList) list2) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                                C424620Gku c424620Gku = (C424620Gku) obj;
                                if (i4 < size) {
                                    C1324840ka2.LJFF(c424620Gku, ((User) ListProtector.get(list, i4)).getAvatarThumb());
                                    C786410Ut5.k(c424620Gku, 4);
                                } else {
                                    C786410Ut5.k(c424620Gku, 8);
                                }
                                i4 = i5;
                            }
                        }
                        TextView textView = this.LLILZLL;
                        if (textView != null) {
                            C786410Ut5.LLIL(textView, 8);
                        }
                        ViewGroup viewGroup = this.LLIZ;
                        if (viewGroup != null) {
                            C786410Ut5.LJLZ(0, viewGroup);
                        }
                        ArrayList arrayList = new ArrayList();
                        List<? extends C424620Gku> list3 = this.LLJ;
                        if (list3 != null) {
                            for (Object obj2 : (ArrayList) list3) {
                                int i6 = i + 1;
                                if (i < 0) {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                                C424620Gku c424620Gku2 = (C424620Gku) obj2;
                                if (i < size) {
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                    valueAnimatorOfFloat.setDuration(400L);
                                    valueAnimatorOfFloat.setStartDelay(((long) i) * 30);
                                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS260S0100000_10(c424620Gku2, 14));
                                    arrayList.add(valueAnimatorOfFloat);
                                }
                                i = i6;
                            }
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList);
                        animatorSet.start();
                        return;
                    }
                    return;
                case 40:
                    LJJIZ(i3);
                    return;
                case 41:
                    int iLJIIJ = C1903780zdo.LJIIJ(i3);
                    if (iLJIIJ <= 0) {
                        LJJIZ(40);
                        return;
                    }
                    TextView textView2 = this.LLILZ;
                    if (textView2 != null) {
                        textView2.setText(iLJIIJ > 99 ? "99+" : String.valueOf(iLJIIJ));
                    }
                    LJJIZ(c607840Nsk2.LIZ);
                    return;
                default:
                    return;
            }
        }
    }

    public final void LJJJ() {
        C607830Nsj c607830Nsj = C607830Nsj.LIZ;
        c607830Nsj.getClass();
        C607840Nsk c607840Nsk = C607830Nsj.LIZJ;
        if (c607840Nsk == null) {
            return;
        }
        this.LLJILJIL.put(Integer.valueOf(c607840Nsk.LIZ), c607840Nsk);
        c607830Nsj.getClass();
        C607830Nsj.LIZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.follow.spi.FollowTabAbility
    public final String Q21() {
        C607840Nsk c607840Nsk = this.LLJILJILJ;
        if (c607840Nsk != null) {
            return LJIIJJI(c607840Nsk.LIZ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.follow.spi.FollowTabAbility
    public final void fO1() {
        ((LinkedHashMap) this.LLJILJIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.follow.spi.FollowTabAbility
    public final boolean s22() {
        Collection collectionValues = ((LinkedHashMap) this.LLJILJIL).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            String strLJIIJJI = LJIIJJI(((C607840Nsk) obj).LIZ);
            if (TextUtils.equals(EnumC1588650rRX.RED_DOT.getDesc(), strLJIIJJI) || TextUtils.equals(EnumC1588650rRX.NUMBER.getDesc(), strLJIIJJI) || TextUtils.equals(EnumC1588650rRX.LIVE.getDesc(), strLJIIJJI)) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    @Override // X.AbstractC1584410rKh
    public final void LIZ() {
        C19EG c19egLJIIJ = LJIIJ();
        if (c19egLJIIJ != null) {
            Hox.LLJILJIL.LIZ(c19egLJIIJ).PQ2("HOME", this);
        }
    }

    @Override // X.AbstractC1584410rKh
    public final void onResume() {
        if (LJJI()) {
            return;
        }
        C19EG c19egLJIIJ = LJIIJ();
        if (c19egLJIIJ != null && Hox.LLJILJIL.LIZ(c19egLJIIJ).LQ2("HOME")) {
            C607840Nsk c607840Nsk = this.LLJILJILJ;
            if (c607840Nsk == null) {
                this.LLJJJJ = false;
            } else if (this.LLJJJJ) {
                LJJIIJ(c607840Nsk, "show");
                this.LLJJJJ = false;
            }
        }
        LJJJ();
        LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.follow.spi.FollowTabAbility
    public final EnumC1588650rRX bT0() {
        return this.LLJJJIL;
    }

    public static boolean LJJIFFI(int i) {
        if (i == 38) {
            if (C0BK6.LIZ() && !C0J8Q.LIZ()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void LJJIIZI(AbstractC1255540imG abstractC1255540imG) {
        RedDotService.LIZ.getClass();
        RedDotService redDotServiceLIZ = C04R9.LIZ();
        if (redDotServiceLIZ != null) {
            redDotServiceLIZ.LIZJ(new C1255570imJ(EnumC1584360rKc.FOLLOWING, abstractC1255540imG, EnumC1255080ilW.HOMEPAGE, null, 241));
        }
    }

    public final void LJIIZILJ(boolean z) {
        List<? extends C424620Gku> list;
        int i;
        C607840Nsk c607840Nsk = this.LLJILJILJ;
        if (c607840Nsk != null) {
            int i2 = c607840Nsk.LIZ;
            LJJIZ(-1);
            if (i2 == 39) {
                if (C303460Buy.LIZ() && this.LLIZ == null && this.LLIZLLLIL != null) {
                    C0X35.LJIILL(new ARunnableS117S0100000_17(this, 272));
                }
                ViewGroup viewGroup = this.LLIZ;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && (list = this.LLJ) != null) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            if (((View) it2.next()).getVisibility() == 0 && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<? extends C424620Gku> list2 = this.LLJ;
                    if (list2 != null) {
                        int i3 = 0;
                        for (Object obj : (ArrayList) list2) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                C424620Gku c424620Gku = (C424620Gku) obj;
                                if (i3 < i) {
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    valueAnimatorOfFloat.setDuration(400L);
                                    valueAnimatorOfFloat.setStartDelay(((long) ((i - i3) - 1)) * 30);
                                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS254S0100000_4(c424620Gku, 20));
                                    arrayList2.add(valueAnimatorOfFloat);
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(new ALAdapterS13S0100000_17(this, 90));
                    animatorSet.playTogether(arrayList2);
                    animatorSet.start();
                }
            }
            if (z) {
                C1903780zdo.LJ(38);
                C1903780zdo.LJ(39);
                C1903780zdo.LJ(40);
                C1903780zdo.LJ(41);
                C614770O9j.LIZIZ.LJ().LJIJJ(false);
            } else {
                C1903780zdo.LJ(i2);
                if (i2 == 38) {
                    C614770O9j.LIZIZ.LJ().LJIJJ(false);
                }
            }
            this.LLJILJILJ = null;
        }
    }

    public final void LJJIJIIJIL(int i) {
        int i2;
        int i3;
        View view = this.LLILLJJLI;
        int i4 = 8;
        if (view != null) {
            if (i == 40) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view);
        }
        TextView textView = this.LLILZ;
        if (textView != null) {
            if (i == 41) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, textView);
        }
        TextView textView2 = this.LLILZ;
        if (textView2 != null) {
            HandlerHook.viewPost(textView2, new ARunnableS117S0100000_17(this, 127));
        }
        if (!C1585060rLk.LIZIZ()) {
            View view2 = this.LLJI;
            if (view2 != null) {
                if (i == 38) {
                    i4 = 0;
                }
                C786410Ut5.LJLLLLLL(i4, view2);
            }
            if (i == 38) {
                C0J9A c0j9aLJIILIIL = LJIILIIL();
                if (c0j9aLJIILIIL != null) {
                    c0j9aLJIILIIL.LJIIL(new ArrayList(), 1);
                    return;
                }
                return;
            }
            C0J9A c0j9aLJIILIIL2 = LJIILIIL();
            if (c0j9aLJIILIIL2 == null) {
                return;
            }
            c0j9aLJIILIIL2.LJIIL(new ArrayList(), -1);
        }
    }

    public final void LJJIZ(int i) {
        if (C303460Buy.LIZ()) {
            if (i == 40) {
                if (this.LLILLJJLI == null && this.LLILLL != null) {
                    C0X35.LJIILL(new Runnable() { // from class: X.0rV6
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FollowTabViewLifecycleObserver@f208.inflateFollowDot$1");
                            try {
                                FollowTabViewLifecycleObserver followTabViewLifecycleObserver = this.LL;
                                ViewStub viewStub = followTabViewLifecycleObserver.LLILLL;
                                followTabViewLifecycleObserver.LLILLJJLI = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
                                C1581510rG1.LJI(this.LL.LLILLJJLI);
                                this.LL.LLILLL = null;
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FollowTabViewLifecycleObserver@f208.inflateFollowDot$1");
                        }
                    });
                }
                TextView textView = this.LLILZ;
                if (textView != null) {
                    textView.setBackgroundResource(R.drawable.bug);
                }
            } else if (i == 41) {
                if (this.LLILZ == null && this.LLILZIL != null) {
                    C0X35.LJIILL(new ARunnableS124S0100000_24(this, 165));
                }
            } else if (i == 38 && !C1585060rLk.LIZIZ() && this.LLJI == null && this.LLJIJIL != null) {
                C0X35.LJIILL(new ARunnableS124S0100000_24(this, 166));
            }
        }
        C0J6Q c0j6q = this.LLJJIJIL;
        if (c0j6q != null && c0j6q.LJI()) {
            this.LLJJIJI = i;
        } else {
            LJJIJIIJIL(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.follow.spi.FollowTabAbility
    public final void RM0(EnumC1588650rRX enumC1588650rRX) {
        this.LLJJJIL = enumC1588650rRX;
    }

    @Override // com.ss.android.ugc.aweme.follow.spi.FollowTabAbility
    public final void oN0(AObjectS123S0000000_24 aObjectS123S0000000_24) {
        ((List) this.LLJJLIIIJLLLLLLLZ.getValue()).add(aObjectS123S0000000_24);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFollowFeedHideRedDotEvent(C1588550rRN c1588550rRN) {
        LJIIZILJ(true);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFollowLiveBubbleShowEvent(C1590930rVD c1590930rVD) {
        Integer numValueOf;
        C0J6Q c0j6q;
        C0J6Q c0j6q2;
        InterfaceC1590940rVE interfaceC1590940rVE;
        boolean z;
        c1590930rVD.getClass();
        InterfaceC1590940rVE interfaceC1590940rVELJIIIIZZ = null;
        Context context = null;
        if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled()) {
            C0J9A c0j9aLJIILIIL = LJIILIIL();
            if (c0j9aLJIILIIL != null) {
                WeakReference<View> weakReference = new WeakReference<>(this.LLILZLL);
                C0J97 c0j97 = (C0J97) this.LLJJJ.getValue();
                WeakReference<C0J6Q> weakReference2 = new WeakReference<>(this.LLJJIJIL);
                if (c1590930rVD.LIZ == 3) {
                    z = true;
                } else {
                    z = false;
                }
                InterfaceC19244510Qp interfaceC19244510QpLJJIII = c0j9aLJIILIIL.LJJIII(weakReference, c0j97, weakReference2, z);
                if (interfaceC19244510QpLJJIII != null) {
                    C0J9A c0j9aLJIILIIL2 = LJIILIIL();
                    if (c0j9aLJIILIIL2 != null) {
                        View view = this.LL;
                        if (view != null) {
                            context = view.getContext();
                        }
                        interfaceC1590940rVELJIIIIZZ = c0j9aLJIILIIL2.LJIIIIZZ(interfaceC19244510QpLJJIII, new WeakReference<>(context));
                    }
                    this.LLJJI = interfaceC1590940rVELJIIIIZZ;
                }
            }
            InterfaceC1590940rVE interfaceC1590940rVE2 = this.LLJJI;
            if (interfaceC1590940rVE2 != null && interfaceC1590940rVE2.shouldShow() && (interfaceC1590940rVE = this.LLJJI) != null) {
                interfaceC1590940rVE.q0(AFwS213S0000000_24.get$arr$(145));
                return;
            }
            return;
        }
        if (!((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.TRUE, "following_inbox_bubble_enable")).booleanValue()) {
            return;
        }
        IntRange intRange = new IntRange(2, 3);
        C0J97 c0j972 = (C0J97) this.LLJJJ.getValue();
        if (c0j972 == null || (numValueOf = Integer.valueOf(c0j972.LIZ)) == null || !intRange.LJLJL(numValueOf.intValue())) {
            return;
        }
        if (c1590930rVD.LIZ == 2 && (c0j6q2 = this.LLJJIJIL) != null) {
            c0j6q2.LIZIZ("", false);
        }
        if (c1590930rVD.LIZ != 3 || (c0j6q = this.LLJJIJIL) == null) {
            return;
        }
        c0j6q.LIZIZ("", true);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onIncentiveLiveBubbleShowEvent(C1590920rVC c1590920rVC) {
        TextView textView;
        ILiveOuterService iLiveOuterService;
        InterfaceC20315114eL interfaceC20315114eLW4;
        InterfaceC1590960rVG interfaceC1590960rVGLIZ;
        if (c1590920rVC.LIZ == EnumC805750VjB.FOLLOW && (textView = this.LLILZLL) != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20315114eLW4 = iLiveOuterService.W4()) != null && (interfaceC1590960rVGLIZ = interfaceC20315114eLW4.LIZ()) != null) {
            interfaceC1590960rVGLIZ.LIZ(textView);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        LJJJ();
        C607840Nsk c607840Nsk = this.LLJILJILJ;
        if (c607840Nsk == null) {
            this.LLJJJJ = false;
        } else {
            if (!this.LLJJJJ) {
                return;
            }
            LJJIIJ(c607840Nsk, "show");
            this.LLJJJJ = false;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C1619080sEc c1619080sEc) {
        if (c1619080sEc.LIZJ == 2) {
            this.LLJJIII++;
        }
        if ((!c1619080sEc.LIZ(38) && !c1619080sEc.LIZ(39) && !c1619080sEc.LIZ(40) && !c1619080sEc.LIZ(41)) || LJJI()) {
            return;
        }
        C19EG c19egLJIIJ = LJIIJ();
        if (c19egLJIIJ != null && Hox.LLJILJIL.LIZ(c19egLJIIJ).LQ2("HOME")) {
            LJJJ();
        }
        LJJIL();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeFollowingTabInfo(C607840Nsk c607840Nsk) {
        this.LLJILJIL.put(Integer.valueOf(c607840Nsk.LIZ), c607840Nsk);
    }

    @Override // X.AbstractC1584410rKh
    public final void LIZIZ(View view, Fragment fragment) {
        Bundle arguments;
        if (fragment != null && (arguments = fragment.getArguments()) != null) {
            int i = arguments.getInt("tab", -1);
            EnumC1570580qyO.Companion.getClass();
            if (C1570570qyN.LIZ(i) == EnumC1570580qyO.FOLLOW) {
                LJIIZILJ(true);
            }
        }
    }

    @Override // X.AbstractC1584410rKh
    public final void LJFF(int i, Fragment fragment) {
        HomeTabAbility homeTabAbility;
        List listL32;
        Object ability;
        Object obj = null;
        if (C296200BjG.LIZ()) {
            View view = this.LL;
            if (view != null) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJ(view, null), MainActivityScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(HomeTabAbility.class);
                } else {
                    ability = null;
                }
                if (ability instanceof HomeTabAbility) {
                    obj = ability;
                }
                homeTabAbility = (HomeTabAbility) obj;
            } else {
                return;
            }
        } else {
            View view2 = this.LL;
            if (view2 != null) {
                homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJ(view2, null), HomeTabAbility.class, null);
            } else {
                return;
            }
        }
        if (homeTabAbility != null && (listL32 = homeTabAbility.l32()) != null) {
            try {
                if (Intrinsics.LJFF(((InterfaceC1583870rJp) listL32.get(i)).tag(), "Following") || (fragment instanceof FeedFollowFragment)) {
                    LJIIZILJ(true);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // X.AbstractC1584410rKh
    public final void LJII(View view, C1584440rKk c1584440rKk) {
        C0J6Q c0j6qLJIILIIL;
        TextView textView;
        View viewFindViewById;
        TextView textView2;
        View viewFindViewById2;
        View view2;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        C0J6Q c0j6q;
        this.LL = view;
        final C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZIZ).wQ2("HOME", this);
            LJJJ();
            C0J9A c0j9aLJIILIIL = LJIILIIL();
            ViewGroup viewGroup = null;
            ViewStub viewStub4 = null;
            if (c0j9aLJIILIIL != null) {
                c0j6qLJIILIIL = c0j9aLJIILIIL.LJIILIIL();
            } else {
                c0j6qLJIILIIL = null;
            }
            this.LLJJIJIL = c0j6qLJIILIIL;
            if (view.isAttachedToWindow()) {
                C1558520qew.LJII(C1558360qeg.LJI(c19egLIZIZ, null), this, FollowTabAbility.class, null, null);
            }
            HandlerHook.viewPost(view, new Runnable() { // from class: com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver$onViewCreated$1
                public final void LIZ() {
                    Lifecycle lifecycle;
                    LifecycleOwner lifecycleOwner = c19egLIZIZ;
                    if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0)) {
                        Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwner);
                        if (objLIZ != null && (objLIZ instanceof C0J5E)) {
                            lifecycleOwner = (Fragment) objLIZ;
                            if (lifecycleOwner != null) {
                                final C19EG c19eg = c19egLIZIZ;
                                final FollowTabViewLifecycleObserver followTabViewLifecycleObserver = this;
                                lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver$onViewCreated$1.1
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                        if (event == Lifecycle.Event.ON_START) {
                                            onStart();
                                        } else if (event == Lifecycle.Event.ON_STOP) {
                                            onStop();
                                        }
                                    }

                                    @OnLifecycleEvent(Lifecycle.Event.ON_START)
                                    public final void onStart() {
                                        HomeTabAbility homeTabAbilityLIZ;
                                        HomeTabAbility homeTabAbilityLIZ2;
                                        try {
                                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                                homeTabAbilityLIZ2.ao(followTabViewLifecycleObserver.LLJJJJJIL);
                                            }
                                            MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                                return;
                                            }
                                            homeTabAbilityLIZ.UC1(followTabViewLifecycleObserver.LLJJJJLIIL);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }

                                    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                                    public final void onStop() {
                                        HomeTabAbility homeTabAbilityLIZ;
                                        HomeTabAbility homeTabAbilityLIZ2;
                                        try {
                                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                                homeTabAbilityLIZ2.tx0(followTabViewLifecycleObserver.LLJJJJJIL);
                                            }
                                            MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                                return;
                                            }
                                            homeTabAbilityLIZ.Ik0(followTabViewLifecycleObserver.LLJJJJLIIL);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                });
                            }
                        }
                    } else if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        final C19EG c19eg2 = c19egLIZIZ;
                        final FollowTabViewLifecycleObserver followTabViewLifecycleObserver2 = this;
                        lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver$onViewCreated$1.1
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                if (event == Lifecycle.Event.ON_START) {
                                    onStart();
                                } else if (event == Lifecycle.Event.ON_STOP) {
                                    onStop();
                                }
                            }

                            @OnLifecycleEvent(Lifecycle.Event.ON_START)
                            public final void onStart() {
                                HomeTabAbility homeTabAbilityLIZ;
                                HomeTabAbility homeTabAbilityLIZ2;
                                try {
                                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                        homeTabAbilityLIZ2.ao(followTabViewLifecycleObserver2.LLJJJJJIL);
                                    }
                                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                        return;
                                    }
                                    homeTabAbilityLIZ.UC1(followTabViewLifecycleObserver2.LLJJJJLIIL);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }

                            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                            public final void onStop() {
                                HomeTabAbility homeTabAbilityLIZ;
                                HomeTabAbility homeTabAbilityLIZ2;
                                try {
                                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                        homeTabAbilityLIZ2.tx0(followTabViewLifecycleObserver2.LLJJJJJIL);
                                    }
                                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                        return;
                                    }
                                    homeTabAbilityLIZ.Ik0(followTabViewLifecycleObserver2.LLJJJJLIIL);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        });
                    }
                    final ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZIZ);
                    C19EG c19eg3 = c19egLIZIZ;
                    final FollowTabViewLifecycleObserver followTabViewLifecycleObserver3 = this;
                    scrollSwitchStateManagerLIZIZ.IQ2(c19eg3, new Observer<Integer>() { // from class: X.0rV7
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Integer num) {
                            C0J6Q c0j6q2;
                            if (!Intrinsics.LJFF(scrollSwitchStateManagerLIZIZ.CQ2(num.intValue()), "page_feed") && (c0j6q2 = followTabViewLifecycleObserver3.LLJJIJIL) != null) {
                                c0j6q2.LIZLLL(true);
                            }
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FollowTabViewLifecycleObserver@f208.onViewCreated$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FollowTabViewLifecycleObserver@f208.onViewCreated$1");
                }
            });
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0rV5
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view3) {
                    C0J6Q c0j6q2 = this.LLJJIJIL;
                    if (c0j6q2 != null) {
                        c0j6q2.LIZJ(c19egLIZIZ);
                    }
                    EventBus.LIZLLL().LJIJJ(this);
                    C19EG c19eg = c19egLIZIZ;
                    C1558520qew.LJII(C1558360qeg.LJI(c19eg, null), this, FollowTabAbility.class, null, null);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view3) {
                    C0J6Q c0j6q2 = this.LLJJIJIL;
                    if (c0j6q2 != null) {
                        c0j6q2.dispose();
                    }
                    this.LLJJIJIL = null;
                    EventBus.LIZLLL().LJJI(this);
                    C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZIZ, null), FollowTabAbility.class, null);
                }
            });
            View view3 = this.LL;
            if (view3 != null) {
                textView = (TextView) view3.findViewById(android.R.id.text1);
            } else {
                textView = null;
            }
            this.LLILZLL = textView;
            if (textView != null && (c0j6q = this.LLJJIJIL) != null) {
                c0j6q.LIZ(textView);
            }
            C0J6Q c0j6q2 = this.LLJJIJIL;
            if (c0j6q2 != null) {
                c0j6q2.LJ(this.LLJL);
            }
            TextView textView3 = this.LLILZLL;
            if (textView3 != null) {
                textView3.setText(c1584440rKk.LIZJ);
            }
            if (C303460Buy.LIZ()) {
                View view4 = this.LL;
                if (view4 != null) {
                    viewStub = (ViewStub) view4.findViewById(R.id.tv_tab_dot_stub);
                } else {
                    viewStub = null;
                }
                this.LLILLL = viewStub;
                View view5 = this.LL;
                if (view5 != null) {
                    viewStub2 = (ViewStub) view5.findViewById(R.id.tv_tab_dot_count_stub);
                } else {
                    viewStub2 = null;
                }
                this.LLILZIL = viewStub2;
                if (C0BK6.LIZ()) {
                    View view6 = this.LL;
                    if (view6 != null) {
                        viewStub3 = (ViewStub) view6.findViewById(R.id.tv_tab_dot_living_stub);
                    } else {
                        viewStub3 = null;
                    }
                    this.LLJIJIL = viewStub3;
                }
                View view7 = this.LL;
                if (view7 != null) {
                    viewStub4 = (ViewStub) view7.findViewById(R.id.igu);
                }
                this.LLIZLLLIL = viewStub4;
            } else {
                View view8 = this.LL;
                if (view8 != null) {
                    viewFindViewById = view8.findViewById(R.id.tv_tab_dot);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLJJLI = viewFindViewById;
                View view9 = this.LL;
                if (view9 != null) {
                    textView2 = (TextView) view9.findViewById(R.id.tv_tab_dot_count);
                } else {
                    textView2 = null;
                }
                this.LLILZ = textView2;
                C1581510rG1.LJI(this.LLILLJJLI);
                C1581510rG1.LJII(this.LLILZ);
                if (C0BK6.LIZ()) {
                    View view10 = this.LL;
                    if (view10 != null) {
                        viewFindViewById2 = view10.findViewById(R.id.n9l);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJI = viewFindViewById2;
                    LJIJJLI();
                }
                View view11 = this.LL;
                if (view11 != null) {
                    viewGroup = (ViewGroup) view11.findViewById(R.id.igt);
                }
                this.LLIZ = viewGroup;
                LJJ();
            }
            LJJIZ(-1);
            if (!C303460Buy.LIZ() && (view2 = this.LLILLJJLI) != null) {
                view2.setBackgroundResource(R.drawable.bug);
            }
            TextView textView4 = this.LLILZLL;
            if (textView4 != null) {
                C844470XAv.LIZ.getClass();
                textView4.setShadowLayer(C12ES.LIZJ(2.0f, C844470XAv.LIZ()), 0.0f, C12ES.LIZJ(2.0f, C844470XAv.LIZ()), ColorProtector.parseColor("#26000000"));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJJIIJ(C607840Nsk c607840Nsk, String str) {
        int i;
        C059B next;
        AbstractC1255540imG c1255510imD;
        C0J97 c0j97;
        int i2;
        User user;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("notice_type", LJIIJJI(c607840Nsk.LIZ));
        c2344009Gk.LJIIIIZZ("action_type", str);
        List<User> list = c607840Nsk.LIZJ;
        if (list != null && (user = (User) C13LP.LJJJLL(list)) != null) {
            c2344009Gk.LJFF("to_user_id", user.getUid());
        }
        int i3 = c607840Nsk.LIZ;
        if (i3 == 41) {
            c2344009Gk.LIZJ(C1903780zdo.LJIIJ(i3), "number_cnt");
        }
        if (c607840Nsk.LIZ == 38 && (c0j97 = (C0J97) this.LLJJJ.getValue()) != null && ((i2 = c0j97.LIZ) == 2 || i2 == 3)) {
            c2344009Gk.LIZJ(1, "live_notice_type");
        }
        if (this.LLJJIII == 1) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_from_coldlaunch");
        if (Intrinsics.LJFF(str, "show")) {
            if (i != 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - C08TN.LIZ().LJJLIIIJL;
                long j2 = jElapsedRealtime - C08TN.LIZ().LJJLIIIJLJLI;
                c2344009Gk.LIZLLL(j, "launch_to_show");
                c2344009Gk.LIZLLL(j2, "firstframe_to_show");
            }
            Long l = c607840Nsk.LIZLLL;
            if (l != null && l.longValue() > 0) {
                c2344009Gk.LIZLLL(System.currentTimeMillis() - (l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "trigger_to_show_duration");
            }
        }
        c2344009Gk.LJFF("enter_from", "default");
        Iterator<C059B> it2 = C059B.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (c607840Nsk.LJ == next.getValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C059B c059b = next;
        if (c059b != null) {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, c059b.getEventField());
        }
        C20684815ws.LJIILLIIL("homepage_follow_notice", c2344009Gk.LIZ);
        if (Intrinsics.LJFF(str, "show")) {
            String strLJIIJJI = LJIIJJI(c607840Nsk.LIZ);
            if (Intrinsics.LJFF(strLJIIJJI, EnumC1588650rRX.RED_DOT.getDesc())) {
                c1255510imD = new C1255550imH();
            } else if (Intrinsics.LJFF(strLJIIJJI, EnumC1588650rRX.NUMBER.getDesc())) {
                c1255510imD = new C1255500imC(C1903780zdo.LJIIJ(c607840Nsk.LIZ));
            } else if (!Intrinsics.LJFF(strLJIIJJI, EnumC1588650rRX.LIVE.getDesc())) {
                return;
            } else {
                c1255510imD = new C1255510imD("live");
            }
            LJJIIZI(c1255510imD);
        }
    }
}
