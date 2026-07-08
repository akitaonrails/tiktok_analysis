package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C03C8;
import X.C045D;
import X.C04FN;
import X.C098200Yq;
import X.C09R3;
import X.C0HHT;
import X.C0QSJ;
import X.C1120604Zw;
import X.C127G;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1421670n6D;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C19ME;
import X.C1AQS;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C687700QyG;
import X.C698190Ra5;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817803Hk;
import X.EnumC1761630vwX;
import X.InterfaceC1053404Aa;
import X.InterfaceC1731706qJ;
import X.InterfaceC1761600vwU;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS69S0300000_1;
import Y.AObjectS400S0100000_26;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.ability.IPdpNavBarAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class UsPdpTopStoreIdentityReusedAssem extends PdpBodyListCardReusedAssem<UsPdpTopStoreIdentityReusedAssem, UsPdpTopStoreIdentityModuleVO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final InterfaceC1731706qJ LLJLL;
    public EnumC1761630vwX LLJLLIL;
    public boolean LLJLLL;
    public View LLJZ;
    public volatile InterfaceC1761670vwb LLJZIJLIL;
    public volatile IPdpNavBarAbility LLL;
    public C127G LLLF;
    public InterfaceC665370Q7z LLLFF;
    public C0QSJ LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UsPdpTopStoreIdentityReusedAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/topstoreidentity/UsPdpTopStoreIdentityVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(UsPdpTopStoreIdentityReusedAssem.class, "pdpViewModelAbility", "getPdpViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(UsPdpTopStoreIdentityReusedAssem.class, "pdpNavBarAbility", "getPdpNavBarAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/header/ability/IPdpNavBarAbility;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public UsPdpTopStoreIdentityReusedAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UsPdpTopStoreIdentityVM.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 298), null, AFwS268S0000000_26.get$arr$(244));
        this.LLJLLIL = EnumC1761630vwX.LL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b35;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    public final C0QSJ Ap() {
        C0QSJ c0qsj = this.LLLFFI;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLFF;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLFF = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLFFI = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final IPdpNavBarAbility Ep() {
        IPdpNavBarAbility iPdpNavBarAbility;
        IPdpNavBarAbility iPdpNavBarAbility2 = this.LLL;
        if (iPdpNavBarAbility2 == null) {
            synchronized (this) {
                iPdpNavBarAbility2 = this.LLL;
                if (iPdpNavBarAbility2 == null) {
                    C0QSJ c0qsjAp = Ap();
                    if (c0qsjAp != null) {
                        iPdpNavBarAbility = (IPdpNavBarAbility) c0qsjAp.getAbility(IPdpNavBarAbility.class);
                        C687700QyG.LJ(iPdpNavBarAbility, IPdpNavBarAbility.class);
                    } else {
                        iPdpNavBarAbility = null;
                    }
                    this.LLL = iPdpNavBarAbility;
                    return iPdpNavBarAbility;
                }
            }
        }
        return iPdpNavBarAbility2;
    }

    public final UsPdpTopStoreIdentityVM Fp() {
        return (UsPdpTopStoreIdentityVM) this.LLJLL.getValue(this, LLLFZ[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        View view = this.LLJZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJLLIL = EnumC1761630vwX.LL;
        this.LLJLLL = false;
        Ep().wI(false);
    }

    public final SmartImageView Bp() {
        return (SmartImageView) getContentView().findViewById(R.id.ydq);
    }

    public final void Gp() {
        InterfaceC1761600vwU interfaceC1761600vwU;
        KeyEvent.Callback contentView = getContentView();
        if ((contentView instanceof InterfaceC1761600vwU) && (interfaceC1761600vwU = (InterfaceC1761600vwU) contentView) != null) {
            interfaceC1761600vwU.LJJJJJL(null);
        }
        C786410Ut5.LJLLLLLL(8, getContentView().findViewById(R.id.ydr));
        C786410Ut5.LJLLLLLL(8, getContentView());
    }

    public final void Ip() {
        InterfaceC1761600vwU interfaceC1761600vwU;
        KeyEvent.Callback contentView = getContentView();
        if ((contentView instanceof InterfaceC1761600vwU) && (interfaceC1761600vwU = (InterfaceC1761600vwU) contentView) != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            C04FN c04fnLJIIIIZZ = ((UsPdpTopStoreIdentityModuleVO) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJIIIIZZ();
            interfaceC1761600vwU.LJJJJJL(c04fnLJIIIIZZ != null ? c04fnLJIIIIZZ.LJIILLIIL : null);
        }
        C786410Ut5.LJLLLLLL(0, getContentView());
        C786410Ut5.LJLLLLLL(0, getContentView().findViewById(R.id.ydr));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{UsPdpTopStoreIdentityVM.class, new AObjectS400S0100000_26(this, 5)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void yp() {
        Ep().wI(this.LLJLLIL == EnumC1761630vwX.LLILLL);
    }

    public final void Jp(boolean z) {
        boolean z2;
        EnumC1761630vwX enumC1761630vwX = this.LLJLLIL;
        EnumC1761630vwX enumC1761630vwX2 = EnumC1761630vwX.LL;
        boolean z3 = true;
        if (enumC1761630vwX != enumC1761630vwX2) {
            if (!this.LLJLLL) {
                enumC1761630vwX2 = EnumC1761630vwX.LLILLJJLI;
            } else {
                enumC1761630vwX2 = EnumC1761630vwX.LLILLL;
            }
        }
        this.LLJLLIL = enumC1761630vwX2;
        EnumC1761630vwX enumC1761630vwX3 = EnumC1761630vwX.LLILLL;
        if (enumC1761630vwX2 == enumC1761630vwX3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (enumC1761630vwX != enumC1761630vwX3) {
            z3 = false;
        }
        getContentView().animate().cancel();
        if (z && getContentView().isAttachedToWindow()) {
            if (z2) {
                if (!z3) {
                    C786410Ut5.T4(getContentView(), 0.0f);
                    Ip();
                    getContentView().animate().alpha(1.0f).setDuration(180L).withEndAction(new ARunnableS109S0100000_9(this, 34)).start();
                }
            } else if (z3) {
                getContentView().animate().alpha(0.0f).setDuration(180L).withEndAction(new ARunnableS109S0100000_9(this, 35)).start();
            }
        } else {
            C786410Ut5.T4(getContentView(), 1.0f);
            if (z2) {
                Ip();
            } else {
                Gp();
            }
        }
        yp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Jp(false);
        InterfaceC1761670vwb interfaceC1761670vwb = this.LLJZIJLIL;
        if (interfaceC1761670vwb == null) {
            synchronized (this) {
                interfaceC1761670vwb = this.LLJZIJLIL;
                if (interfaceC1761670vwb == null) {
                    C0QSJ c0qsjAp = Ap();
                    if (c0qsjAp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjAp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJZIJLIL = interfaceC1761670vwb;
                }
            }
        }
        interfaceC1761670vwb.lX().hR2(new C2217381BqS() { // from class: X.0vsk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AwS605S0100000_26(this, 241));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void op(UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO) {
        InterfaceC1761600vwU interfaceC1761600vwU;
        if (this.LLJLLL) {
            super.op(usPdpTopStoreIdentityModuleVO);
            return;
        }
        KeyEvent.Callback contentView = getContentView();
        if (!(contentView instanceof InterfaceC1761600vwU) || (interfaceC1761600vwU = (InterfaceC1761600vwU) contentView) == null) {
            return;
        }
        interfaceC1761600vwU.LJJJJJL(null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void tp(UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO) {
        Map<String, Object> mapLIZJ;
        int iIntValue;
        ViewGroup viewGroup;
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        Object c098200Yq;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        String strLIZ;
        InterfaceC1053404Aa interfaceC1053404Aa;
        UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO2 = usPdpTopStoreIdentityModuleVO;
        if (usPdpTopStoreIdentityModuleVO2.title == null) {
            this.LLJLLIL = EnumC1761630vwX.LL;
            Gp();
            yp();
            return;
        }
        this.LLJLLIL = EnumC1761630vwX.LLILLJJLI;
        Jp(false);
        UsPdpTopStoreIdentityVM usPdpTopStoreIdentityVMFp = Fp();
        usPdpTopStoreIdentityVMFp.getClass();
        String str = usPdpTopStoreIdentityModuleVO2.btm;
        Object obj = null;
        if (str != null && (!a0.LJJJIL(str)) && (strLIZ = C045D.LIZ(str, "d0")) != null && (interfaceC1053404Aa = usPdpTopStoreIdentityVMFp.LLILLJJLI) != null) {
            mapLIZJ = interfaceC1053404Aa.LIZJ(new C817803Hk(strLIZ, null));
        } else {
            mapLIZJ = null;
        }
        C1421670n6D.LIZIZ(getContentView(), new AwS427S0200000_26(usPdpTopStoreIdentityModuleVO2, this, 63), new AwS210S0300000_1(this, (UsPdpTopStoreIdentityReusedAssem) usPdpTopStoreIdentityModuleVO2, (UsPdpTopStoreIdentityModuleVO) mapLIZJ, (Map<String, ? extends Object>) 52));
        C03C8.LIZJ((TextView) getContentView().findViewById(R.id.ydt), usPdpTopStoreIdentityModuleVO2.title, "ProductSellerInfoView", null);
        TextView textView = (TextView) getContentView().findViewById(R.id.yds);
        if (usPdpTopStoreIdentityModuleVO2.subtitle != null) {
            C786410Ut5.LJLLLLLL(0, textView);
            C03C8.LIZJ(textView, usPdpTopStoreIdentityModuleVO2.subtitle, "ProductSellerInfoView", null);
        } else {
            C786410Ut5.LJLLLLLL(8, textView);
            textView.setText((CharSequence) null);
        }
        ViewGroup.LayoutParams layoutParams = Bp().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (usPdpTopStoreIdentityModuleVO2.liveInfo != null) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            } else {
                iLIZIZ = 0;
            }
            if (marginLayoutParams.getMarginStart() != iLIZIZ) {
                marginLayoutParams.setMarginStart(iLIZIZ);
                C786410Ut5.G6(Bp(), marginLayoutParams);
            }
        }
        SmartImageView smartImageViewBp = Bp();
        Image image = usPdpTopStoreIdentityModuleVO2.avatarImage;
        Context context = LJJIJL().getContext();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_store;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (iLIZJ == null) {
            iLIZJ = 0;
        }
        c419910GdJ.LIZLLL = iLIZJ;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.ng);
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        C1331750klB c1331750klB = new C1331750klB();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = fLIZIZ;
        c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LIZLLL.LJIL(layerDrawableLJIILIIL);
        c1331670kl3LIZLLL.LJJ(smartImageViewBp);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        if (usPdpTopStoreIdentityModuleVO2.liveInfo == null) {
            View view = this.LLJZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            zp(usPdpTopStoreIdentityModuleVO2);
        } else {
            if (this.LLJZ == null) {
                View viewFindViewById = getContentView().findViewById(R.id.ydr);
                if ((viewFindViewById instanceof ConstraintLayout) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = ILiveDependencyService.class.getName();
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                    }
                    View viewCreateLiveCircleView = ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).createLiveCircleView(LJJIJL().getContext(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f))));
                    if (viewCreateLiveCircleView != null) {
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.75f)));
                        viewCreateLiveCircleView.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
                        C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)));
                        c19me.topToTop = R.id.ydq;
                        c19me.bottomToBottom = R.id.ydq;
                        c19me.startToStart = R.id.ydq;
                        c19me.endToEnd = R.id.ydq;
                        C786410Ut5.W5(viewCreateLiveCircleView, c19me);
                        C786410Ut5.LJLLLLLL(8, viewCreateLiveCircleView);
                        viewCreateLiveCircleView.setClickable(false);
                        viewCreateLiveCircleView.setFocusable(false);
                    } else {
                        viewCreateLiveCircleView = null;
                    }
                    this.LLJZ = viewCreateLiveCircleView;
                    if (viewCreateLiveCircleView != null) {
                        viewGroup.addView(viewCreateLiveCircleView);
                    }
                }
            }
            View view2 = this.LLJZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C1421670n6D.LIZIZ(getContentView(), new AwS427S0200000_26(usPdpTopStoreIdentityModuleVO2, this, 64), new AwS392S0200000_26(usPdpTopStoreIdentityModuleVO2, this, 108));
            zp(usPdpTopStoreIdentityModuleVO2);
        }
        String str2 = usPdpTopStoreIdentityModuleVO2.trailingIcon;
        if (str2 != null) {
            try {
                C01GW c01gw = C2248361CzK.LIZ;
                c098200Yq = C2248361CzK.LJFF(LJJIJL().getContext(), str2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            C698190Ra5 c698190Ra5 = (C698190Ra5) obj;
            if (c698190Ra5 != null) {
                TuxIconView tuxIconView = (TuxIconView) getContentView().findViewById(R.id.ydu);
                tuxIconView.setIconRes(c698190Ra5.LIZ);
                Integer num = c698190Ra5.LIZIZ;
                if (num != null) {
                    tuxIconView.setTintColor(num.intValue());
                } else {
                    tuxIconView.LIZ();
                }
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            }
        }
        C786410Ut5.I7(new ACListenerS69S0300000_1(this, usPdpTopStoreIdentityModuleVO2, mapLIZJ, 3), getContentView());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void up(UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO) {
        if (this.LLJLLL) {
            super.up(usPdpTopStoreIdentityModuleVO);
        }
    }

    public final void zp(UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO) {
        if (usPdpTopStoreIdentityModuleVO.liveInfo == null) {
            SmartImageView smartImageViewBp = Bp();
            C786410Ut5.Q8(smartImageViewBp, null);
            smartImageViewBp.setClickable(false);
            smartImageViewBp.setFocusable(false);
            return;
        }
        SmartImageView smartImageViewBp2 = Bp();
        smartImageViewBp2.setClickable(true);
        smartImageViewBp2.setFocusable(true);
        C786410Ut5.Q8(smartImageViewBp2, new ACListenerS128S0200000_26(this, usPdpTopStoreIdentityModuleVO, 5));
    }
}
