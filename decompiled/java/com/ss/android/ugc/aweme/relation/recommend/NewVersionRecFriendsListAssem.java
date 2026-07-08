package com.ss.android.ugc.aweme.relation.recommend;

import X.AbstractC1261460ivo;
import X.AbstractC1263550izB;
import X.AbstractC1623806Xk;
import X.AbstractC1906720ziY;
import X.C01GW;
import X.C1072510e13;
import X.C1072640e1G;
import X.C1075800e6M;
import X.C1077090e8R;
import X.C1261440ivm;
import X.C1261470ivp;
import X.C1262950iyD;
import X.C1262970iyF;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C1559260qg8;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1749280vcc;
import X.C1913380ztI;
import X.C19EG;
import X.C452501pT;
import X.C491001vg;
import X.C491101vh;
import X.C626160OhC;
import X.C723590SZx;
import X.C786410Ut5;
import X.EnumC1072920e1i;
import X.EnumC1609900rzo;
import X.InterfaceC1261750iwH;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS88S0200000_19;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class NewVersionRecFriendsListAssem extends UIContentAssem implements InterfaceC1261750iwH {
    public TuxNavBar LLIZLLLIL;
    public C1390410mHn LLJ;
    public AbstractC1263550izB LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, C1077090e8R.class, null), checkSupervisorPrepared());
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1749));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1748));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1750));

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C1072510e13.LIZ.getClass();
        C1072510e13.LIZJ("follow_rec", "background");
    }

    public final void Ho(C19EG c19eg) {
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJIIJ(((C1262950iyD) this.LLJILJIL.getValue()).toast);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS88S0200000_19(this, c19eg, 20), 1000L);
    }

    public final void Jo(C19EG c19eg) {
        if (c19eg != null) {
            ((SocialRecFlowModel) ViewModelProviders.of(c19eg).get(SocialRecFlowModel.class)).LLILLJJLI.postValue(new Bundle());
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        if ((abstractC1261460ivo instanceof C1261440ivm) || (abstractC1261460ivo instanceof C1261470ivp)) {
            C1072640e1G c1072640e1G = C1072640e1G.LIZ;
            int value = EnumC1072920e1i.NEW_VERSION_RECOMMEND.getValue();
            c1072640e1G.getClass();
            C1072640e1G.LJ(3, value);
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        boolean z;
        Exception exc;
        List<InterfaceC1891350zJl> listLIZ = c1075800e6M.LIZJ.LIZ();
        if (listLIZ != null && listLIZ.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
        if (!(abstractC1623806Xk instanceof C491101vh) && !(abstractC1623806Xk instanceof C1623706Xj)) {
            AbstractC1263550izB abstractC1263550izB = null;
            if (abstractC1623806Xk instanceof C491001vg) {
                if (z) {
                    Ho((C19EG) this.LLJILJILJ.getValue());
                    return;
                }
                C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
                Activity activity = (Activity) this.LLJILJILJ.getValue();
                EnumC1609900rzo enumC1609900rzo = EnumC1609900rzo.DEFAULT;
                Throwable th = ((C491001vg) abstractC1623806Xk).LIZ;
                if (th instanceof Exception) {
                    exc = (Exception) th;
                } else {
                    exc = null;
                }
                c1913380ztI.triggerNetworkTips(activity, enumC1609900rzo, exc, (C1749280vcc) null);
                return;
            }
            if (!(abstractC1623806Xk instanceof C1623606Xi) || !(c1075800e6M.LIZJ instanceof C1623606Xi)) {
                return;
            }
            if (c1075800e6M.LIZLLL()) {
                Ho((C19EG) this.LLJILJILJ.getValue());
                return;
            }
            List<AbstractC1906720ziY> allChunks = Go().getAllChunks();
            AbstractC1263550izB abstractC1263550izB2 = this.LLJI;
            if (abstractC1263550izB2 == null) {
                abstractC1263550izB2 = null;
            }
            if (!allChunks.contains(abstractC1263550izB2)) {
                AbstractC1263550izB abstractC1263550izB3 = this.LLJI;
                if (abstractC1263550izB3 == null) {
                    abstractC1263550izB3 = null;
                }
                ((C1262970iyF) abstractC1263550izB3).LLIIZ(Go());
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
                AbstractC1263550izB abstractC1263550izB4 = this.LLJI;
                if (abstractC1263550izB4 == null) {
                    abstractC1263550izB4 = null;
                }
                viewOnAttachStateChangeListenerC20604515jvGo.LIZJ(abstractC1263550izB4);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo2 = Go();
                AbstractC1263550izB abstractC1263550izB5 = this.LLJI;
                if (abstractC1263550izB5 != null) {
                    abstractC1263550izB = abstractC1263550izB5;
                }
                viewOnAttachStateChangeListenerC20604515jvGo2.setItemAnimator(((C1262970iyF) abstractC1263550izB).getItemAnimator());
            }
            setLoading(false);
            return;
        }
        setLoading(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x024d  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recommend.NewVersionRecFriendsListAssem.onViewCreated(android.view.View):void");
    }

    public final void setLoading(boolean z) {
        C1390410mHn c1390410mHn = null;
        if (z) {
            C1390410mHn c1390410mHn2 = this.LLJ;
            if (c1390410mHn2 == null) {
                c1390410mHn2 = null;
            }
            C786410Ut5.LLLZZIL(c1390410mHn2, 0);
            C1390410mHn c1390410mHn3 = this.LLJ;
            if (c1390410mHn3 != null) {
                c1390410mHn = c1390410mHn3;
            }
            c1390410mHn.LIZJ();
            return;
        }
        C1390410mHn c1390410mHn4 = this.LLJ;
        if (c1390410mHn4 == null) {
            c1390410mHn4 = null;
        }
        C786410Ut5.LLLZZIL(c1390410mHn4, 8);
        C1390410mHn c1390410mHn5 = this.LLJ;
        if (c1390410mHn5 != null) {
            c1390410mHn = c1390410mHn5;
        }
        c1390410mHn.LIZLLL();
    }
}
