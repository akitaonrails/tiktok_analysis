package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.richtext;

import X.C01GW;
import X.C03C8;
import X.C04CS;
import X.C098200Yq;
import X.C09R3;
import X.C0QSJ;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C189200o6;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C418440Gaw;
import X.C687700QyG;
import X.C698190Ra5;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1053404Aa;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpRichTitleReusedAssem extends PdpBodyListCardReusedAssem<UsPdpRichTitleReusedAssem, UsPdpRichTitleModuleVO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public volatile C04CS LLJLL;
    public volatile InterfaceC1053404Aa LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UsPdpRichTitleReusedAssem.class, "eventTrackingAbility", "getEventTrackingAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/sdet/IPDPEventTrackingAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(UsPdpRichTitleReusedAssem.class, "btmManager", "getBtmManager()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/event/btm/IBtmManager;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.at_;
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    public final C0QSJ yp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLLL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLJZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1053404Aa zp() {
        InterfaceC1053404Aa interfaceC1053404Aa;
        InterfaceC1053404Aa interfaceC1053404Aa2 = this.LLJLLIL;
        if (interfaceC1053404Aa2 == null) {
            synchronized (this) {
                interfaceC1053404Aa2 = this.LLJLLIL;
                if (interfaceC1053404Aa2 == null) {
                    C0QSJ c0qsjYp = yp();
                    if (c0qsjYp != null) {
                        interfaceC1053404Aa = (InterfaceC1053404Aa) c0qsjYp.getAbility(InterfaceC1053404Aa.class);
                        C687700QyG.LJ(interfaceC1053404Aa, InterfaceC1053404Aa.class);
                    } else {
                        interfaceC1053404Aa = null;
                    }
                    this.LLJLLIL = interfaceC1053404Aa;
                    return interfaceC1053404Aa;
                }
            }
        }
        return interfaceC1053404Aa2;
    }

    public final TuxIconView Ap() {
        return (TuxIconView) getContentView().findViewById(R.id.tju);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void tp(UsPdpRichTitleModuleVO usPdpRichTitleModuleVO) {
        int iIntValue;
        Object c098200Yq;
        UsPdpRichTitleModuleVO usPdpRichTitleModuleVO2 = usPdpRichTitleModuleVO;
        C698190Ra5 c698190Ra5 = null;
        Object obj = null;
        c698190Ra5 = null;
        C03C8.LIZJ((TextView) getContentView().findViewById(R.id.tjw), usPdpRichTitleModuleVO2.text, "ProductSellerInfoView", null);
        Icon icon = usPdpRichTitleModuleVO2.trailingIcon;
        if (icon == null) {
            C786410Ut5.LJLLLLLL(8, Ap());
        } else {
            TuxIconView tuxIconViewAp = Ap();
            ViewGroup.LayoutParams layoutParams = Ap().getLayoutParams();
            Integer viewWidth = icon.getViewWidth();
            int iIntValue2 = 16;
            if (viewWidth != null) {
                iIntValue = viewWidth.intValue();
            } else {
                iIntValue = 16;
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            Integer viewHeight = icon.getViewHeight();
            if (viewHeight != null) {
                iIntValue2 = viewHeight.intValue();
            }
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
            C786410Ut5.M6(tuxIconViewAp, layoutParams);
            String token = icon.getToken();
            if (token != null && token.length() != 0) {
                try {
                    C01GW c01gw = C2248361CzK.LIZ;
                    c098200Yq = C2248361CzK.LJFF(LJJIJL().getContext(), token);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                c698190Ra5 = (C698190Ra5) obj;
            }
            Image imageRequireImageForEcDarkMode = icon.requireImageForEcDarkMode(LJJIJL().getContext());
            if (c698190Ra5 != null) {
                Ap().setIconRes(c698190Ra5.LIZ);
                Integer num = c698190Ra5.LIZIZ;
                if (num != null) {
                    Ap().setTintColor(num.intValue());
                } else {
                    Ap().LIZ();
                }
                C786410Ut5.LJLLLLLL(0, Ap());
            } else if (imageRequireImageForEcDarkMode != null) {
                Ap().LIZ();
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode);
                c1331670kl3LIZLLL.LJJI(Ap());
                C786410Ut5.h3(c1331670kl3LIZLLL);
                C786410Ut5.LJLLLLLL(0, Ap());
            } else {
                C786410Ut5.LJLLLLLL(8, Ap());
            }
        }
        C786410Ut5.I7(new AjS40S0200000_1(usPdpRichTitleModuleVO2, this, 74), getContentView().findViewById(R.id.tjv));
    }
}
