package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card;

import X.C0QSJ;
import X.C1155600gB4;
import X.C13LE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C497740JfY;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1884840z9G;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public abstract class MixCardBaseAssem<M, S extends InterfaceC0148002o> extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public View LLJJI;
    public int LLJJIII;
    public volatile InterfaceC1884840z9G LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixCardBaseAssem.class, "cardBaseAbility", "getCardBaseAbility()Lcom/bytedance/android/livesdk/comp/impl/game/partnership/mixlayout/framework/base/ICardBaseAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MixCardScope.class});
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MixCardScope.class);
        return arrayList;
    }

    public abstract GameIntroViewModel ip();

    public abstract void kp();

    public final InterfaceC1884840z9G hp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJIJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIIJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJIJIIJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MixCardScope.class});
            this.LLJJIJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1884840z9G interfaceC1884840z9G = (InterfaceC1884840z9G) c0qsjLIZLLL.getAbility(InterfaceC1884840z9G.class);
        C687700QyG.LJ(interfaceC1884840z9G, InterfaceC1884840z9G.class);
        return interfaceC1884840z9G;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        if (this.LLJJIII != 1) {
            this.LLJJIII = 1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cardLoadingStart ");
            sbLIZ.append(this);
            C20441214yg.LIZIZ("MixCardBaseAssem", C2188811AlT.LIZIZ(sbLIZ));
            AbsBaseAssemMixCard absBaseAssemMixCardLJIILLIIL = ip().LL.LJIILLIIL();
            if (absBaseAssemMixCardLJIILLIIL != null) {
                absBaseAssemMixCardLJIILLIIL.LJJIJIL();
            }
        }
        super.onCreate();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
    }

    public final void lp(int i) {
        ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = -2;
        C786410Ut5.W5(getContentView(), layoutParams);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fFloatValue;
        super.onViewCreated(view);
        this.LLJJI = view;
        InterfaceC1884840z9G interfaceC1884840z9GHp = this.LLJJIJI;
        if (interfaceC1884840z9GHp == null) {
            synchronized (this) {
                interfaceC1884840z9GHp = this.LLJJIJI;
                if (interfaceC1884840z9GHp == null) {
                    interfaceC1884840z9GHp = hp();
                    this.LLJJIJI = interfaceC1884840z9GHp;
                }
            }
        }
        interfaceC1884840z9GHp.LJIIL(getContentView());
        View view2 = this.LLJJI;
        ViewGroup.LayoutParams layoutParams = null;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            Float f = ((C1155600gB4) ip().LLILLJJLI.getValue()).LLILLL.topMargin;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(fFloatValue);
        }
        kp();
    }
}
