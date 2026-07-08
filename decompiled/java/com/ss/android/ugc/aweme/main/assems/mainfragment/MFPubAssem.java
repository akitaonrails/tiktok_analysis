package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0CN5;
import X.C0QSJ;
import X.C13LE;
import X.C1558520qew;
import X.C1559310qgD;
import X.C1564620qom;
import X.C1589640rT8;
import X.C15WT;
import X.C199Y;
import X.C19EG;
import X.C2217381BqS;
import X.C285090BFj;
import X.C319860CgK;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1581610rGB;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS124S0100000_24;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MFPubAssem extends AbstractC738140SxQ implements IMFPubAbility, InterfaceC1581610rGB, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public int LL = 1;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1559310qgD(this));
    public volatile HomeViewPagerAbility LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MFPubAssem.class, "homeViewPagerAbility", "getHomeViewPagerAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1581610rGB
    public final void Ae(int i, Fragment fragment) {
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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1047333186) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1581610rGB
    public final void u5(int i, boolean z) {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final boolean iI2() {
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLILLJJLI.getValue();
        if (homeViewPagerAbility != null && homeViewPagerAbility.VM2()) {
            int iGk1 = homeViewPagerAbility.gk1();
            if (iGk1 == 0) {
                if (this.LL == 0) {
                    return true;
                }
            } else {
                if (iGk1 == 1) {
                    return this.LL == 1;
                }
                if (iGk1 == 31) {
                    return this.LL == 31;
                }
                if (iGk1 == 7) {
                    return this.LL == 7;
                }
                if (iGk1 == 35 && this.LL == 35) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void bo() {
        super.onCreate();
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLILLJJLI.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLJJI(new InterfaceC469360Ias() { // from class: X.0qeX
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    this.LL.PA1(i);
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (((Boolean) C285090BFj.LJLLILLLL.getValue()).booleanValue()) {
            C0CN5.LIZJ(Long.valueOf(((Number) C285090BFj.LJLJLJ.getValue()).longValue()), new ARunnableS124S0100000_24(this, 44), false);
        } else {
            bo();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final int E10() {
        return this.LL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final void PA1(int i) {
        C19EG c19egLIZ;
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLILLJJLI.getValue();
        if (homeViewPagerAbility != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null && homeViewPagerAbility.VM2() && (c19egLIZ instanceof MainActivity) && !((C199Y) c19egLIZ).isDestroyed()) {
            int iVd = homeViewPagerAbility.Vd(i, false);
            int i2 = this.LL;
            if (iVd != i2) {
                C1564620qom.LIZ(c19egLIZ);
                return;
            }
            if (i2 != 1) {
                if (i2 != 7) {
                    if (i2 != 31) {
                        if (i2 != 35) {
                            return;
                        }
                        C1564620qom.LIZIZ(c19egLIZ);
                        return;
                    }
                    C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                    if (c1589640rT8.F2()) {
                        C1564620qom.LIZIZ(c19egLIZ);
                        return;
                    } else {
                        if (c1589640rT8.LIZ() && !C319860CgK.LIZ()) {
                            return;
                        }
                        C1564620qom.LIZIZ(c19egLIZ);
                        return;
                    }
                }
                ((INearbyFeedService) ServiceManager.get().getService(INearbyFeedService.class)).LJIILL();
                return;
            }
            if (C1589640rT8.LIZIZ.LIZ() || C15WT.LIZIZ.LIZ()) {
                return;
            }
            C1564620qom.LIZIZ(c19egLIZ);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility
    public final void gB1(int i) {
        this.LL = i;
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeHide(Bundle bundle) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        String strHQ2 = Hox.LLJILJIL.LIZ(c19egLIZ).HQ2("HOME");
        if (Intrinsics.LJFF(string, "MainPage") || bundle.getBoolean(strHQ2)) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().uploadRecoverPopViewSetVisibility(false);
        }
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeShow(Bundle bundle) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        String strHQ2 = Hox.LLJILJIL.LIZ(c19egLIZ).HQ2("HOME");
        if ((Intrinsics.LJFF(string, "MainPage") || bundle.getBoolean(strHQ2)) && bundle.getInt("switchType", -1) == 1) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().uploadRecoverPopViewSetVisibility(true);
        }
    }
}
