package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC1604130rqV;
import X.C01D1;
import X.C01GW;
import X.C0CAU;
import X.C0QSJ;
import X.C0T3R;
import X.C11JF;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1565370qpz;
import X.C1567040qsg;
import X.C1584420rKi;
import X.C1620910sHZ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2214201BlK;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C343710Ddh;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1586360rNq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ACListenerS124S0200000_21;
import Y.AObserverS226S0100000_24;
import Y.ARunnableS124S0100000_24;
import Y.AfS193S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.INonPersonalizedAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS638S0100000_24;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class NonPersonalizedAssem extends UISlotAssem implements INonPersonalizedAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final C1565370qpz LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static boolean LLJLLL;
    public static final BPEAHandler LLJZ;
    public View LLJJI;
    public TuxTextView LLJJIII;
    public int LLJJIJI;
    public C11JF LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 724));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 723));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(224));
    public final AssemVMLazy LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final ARunnableS124S0100000_24 LLJJJJLIIL;
    public volatile HomeTabAbility LLJJL;
    public volatile HomeViewPagerAbility LLJJLIIIJLLLLLLLZ;
    public volatile MainPageBusinessAbility LLJL;
    public InterfaceC665370Q7z LLJLIL;
    public C0QSJ LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0qpz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NonPersonalizedAssem.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(NonPersonalizedAssem.class, "nonPersonalizedVM", "getNonPersonalizedVM()Lcom/bytedance/tiktok/homepage/mainfragment/NonPersonalizedVM;", 0), new C2217381BqS(NonPersonalizedAssem.class, "knitHomeViewPageAbility", "getKnitHomeViewPageAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0), new C2217381BqS(NonPersonalizedAssem.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0)};
        LLJLL = new Object() { // from class: X.0qpz
        };
        LLJZ = new BPEAHandler(Looper.getMainLooper());
    }

    public NonPersonalizedAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NonPersonalizedVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 725), AFwS264S0000000_24.get$arr$(203), null, true);
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(225));
        this.LLJJJJLIIL = new ARunnableS124S0100000_24(this, 51);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cdq;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LJJIII().observe(this, new AObserverS226S0100000_24(this, 4));
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217371BqR() { // from class: X.0qsW
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1383310m6L) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1383310m6L) obj).LL = (Boolean) obj2;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 52), 4);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217371BqR() { // from class: X.0qsX
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1383310m6L) obj).LLILLJJLI);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1383310m6L) obj).LLILLJJLI = ((Number) obj2).intValue();
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 53), 4);
        if (!up()) {
            C343710Ddh.LIZ(C724240Sb0.LIZ(this)).wQ2(new InterfaceC1586360rNq() { // from class: X.0qsV
                @Override // X.InterfaceC1586360rNq
                public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
                    if (!C13LP.LJJJJ(str, C1567040qsg.LIZ())) {
                        this.LL.tp().vQ2();
                    }
                }
            });
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 32270333) {
            return null;
        }
        return this;
    }

    public final C0QSJ lp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJLILLLLZIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJLILLLLZIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final HomeTabAbility mp() {
        return (HomeTabAbility) this.LLJJJ.getValue();
    }

    public final AbstractC1604130rqV op() {
        return (AbstractC1604130rqV) this.LLJJJJJIL.getValue();
    }

    public final MainPageBusinessAbility sp() {
        MainPageBusinessAbility mainPageBusinessAbility = this.LLJL;
        if (mainPageBusinessAbility == null) {
            synchronized (this) {
                mainPageBusinessAbility = this.LLJL;
                if (mainPageBusinessAbility == null) {
                    C0QSJ c0qsjLp = lp();
                    MainPageBusinessAbility mainPageBusinessAbility2 = c0qsjLp != null ? (MainPageBusinessAbility) c0qsjLp.getAbility(MainPageBusinessAbility.class) : null;
                    this.LLJL = mainPageBusinessAbility2;
                    return mainPageBusinessAbility2;
                }
            }
        }
        return mainPageBusinessAbility;
    }

    public final NonPersonalizedVM tp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (NonPersonalizedVM) assemVMLazy.getValue();
    }

    public static boolean up() {
        return ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.base.INonPersonalizedAbility
    public final boolean ds() {
        return LJJIJL().getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp() {
        /*
            r4 = this;
            X.19EG r3 = X.C724240Sb0.LIZ(r4)
            androidx.fragment.app.Fragment r2 = X.C724240Sb0.LJI(r4)
            if (r3 == 0) goto L32
            if (r2 == 0) goto L32
            X.01GW r0 = r4.LLJJJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.service.IFeedSkylightCommonService r0 = (com.ss.android.ugc.aweme.service.IFeedSkylightCommonService) r0
            r1 = 0
            boolean r0 = r0.LJJIIJ(r1, r3)
            if (r0 == 0) goto L21
            r0 = 1125515264(0x43160000, float:150.0)
        L1d:
            r4.kp(r0)
            return
        L21:
            X.01GW r0 = r4.LLJJJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.service.IFeedSkylightCommonService r0 = (com.ss.android.ugc.aweme.service.IFeedSkylightCommonService) r0
            boolean r0 = r0.LJJIL(r1, r2)
            if (r0 == 0) goto L32
            r0 = 1103101952(0x41c00000, float:24.0)
            goto L1d
        L32:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem.hp():void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem.ip():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null) {
            if (!c11jf.isDisposed()) {
                c11jf.dispose();
            }
            this.LLJJIJIIJIL = null;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void kp(float f) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LLJJI;
        Context context = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View view2 = this.LLJJI;
            if (view2 != null) {
                context = view2.getContext();
            }
            marginLayoutParams.topMargin = (int) C12ES.LIZJ(f, context);
            View view3 = this.LLJJI;
            if (view3 != null) {
                C786410Ut5.W5(view3, marginLayoutParams);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onPlayerControllerRenderFrameVideoCounter(C1584420rKi c1584420rKi) {
        NonPersonalizedVM nonPersonalizedVMTp = tp();
        nonPersonalizedVMTp.LL++;
        if (NonPersonalizedVM.wQ2() && nonPersonalizedVMTp.LL == 5) {
            nonPersonalizedVMTp.xQ2(6, null);
        }
    }

    @C14EU
    public final void onSkylightShow(C0T3R c0t3r) {
        ip();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        this.LLJJI = getContentView().findViewById(R.id.pg_);
        this.LLJJIII = (TuxTextView) getContentView().findViewById(R.id.pgb);
        View view2 = this.LLJJI;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS124S0200000_21(iComplianceBusinessService, this, 59), view2);
        }
        if (!up()) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS124S0100000_24(this, 141));
            return;
        }
        HomeTabAbility homeTabAbilityMp = mp();
        if (homeTabAbilityMp != null) {
            homeTabAbilityMp.ao(new C1620910sHZ(this, 23));
        }
        HomeTabAbility homeTabAbilityMp2 = mp();
        if (homeTabAbilityMp2 != null) {
            homeTabAbilityMp2.UC1(new C1620910sHZ(this, 24));
        }
        this.LLJJIJIIJIL = (C11JF) C2214201BlK.LJIIJ.LJJLIIJ().LJJLJLI(new AfS193S0100000_24(this, 46));
    }

    public final View yp(int i) {
        int i2;
        String string;
        HandlerHook.viewRemoveCallbacks(LJJIJL(), this.LLJJJJLIIL);
        if (C1567040qsg.LIZIZ()) {
            i2 = 2131838202;
        } else {
            i2 = 2131838203;
        }
        TuxTextView tuxTextView = this.LLJJIII;
        GradientDrawable gradientDrawable = null;
        if (tuxTextView != null) {
            Resources resources = tuxTextView.getResources();
            if (resources != null) {
                string = resources.getString(i2);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        if (up()) {
            ip();
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        Context context = getContext();
        if (context != null) {
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.bvo);
            if (drawableLIZIZ instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) drawableLIZIZ;
            }
            TuxIconView tuxIconView = (TuxIconView) getContentView().findViewById(R.id.pga);
            if (i == 3) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(iIntValue);
                    }
                }
                TuxTextView tuxTextView2 = this.LLJJIII;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColorRes(R.attr.z_);
                }
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.z_);
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e3, context);
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(iIntValue2);
                    }
                }
                TuxTextView tuxTextView3 = this.LLJJIII;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColorRes(R.attr.eg);
                }
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.ef);
                }
            }
            View view = this.LLJJI;
            if (view != null) {
                view.setBackground(gradientDrawable);
            }
        }
        tp();
        if (!NonPersonalizedVM.wQ2()) {
            HandlerHook.viewPostDelay(LJJIJL(), this.LLJJJJLIIL, 3000L);
        }
        withState(tp(), new AwS600S0100000_21(this, 143));
        return LJJIJL();
    }
}
