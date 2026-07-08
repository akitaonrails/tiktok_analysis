package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C09U0;
import X.C0DXR;
import X.C13LE;
import X.C1744700vVE;
import X.C1807670x8n;
import X.C20600815jK;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C621840OaE;
import X.C653450Pk7;
import X.C661350Pwr;
import X.C684810Qtb;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC684740QtU;
import X.InterfaceC684820Qtc;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchMultiSummaryBaseAssem<ITEM extends InterfaceC684740QtU> extends ReusedUISlotAssem<SearchMultiSummaryBaseAssem<ITEM>> implements InterfaceC712990Rxx<ITEM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public C653450Pk7<Aweme> LLJL;
    public ITEM LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchMultiSummaryBaseAssem) this, 655));
    public volatile C09U0 LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMultiSummaryBaseAssem.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void sp(ITEM item) {
    }

    public abstract void tp(View view);

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public static final InterfaceC665370Q7z op(SearchMultiSummaryBaseAssem searchMultiSummaryBaseAssem) {
        return (InterfaceC665370Q7z) searchMultiSummaryBaseAssem.LLJLILLLLZIIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        if (this instanceof InterfaceC684820Qtc) {
            InterfaceC684820Qtc interfaceC684820Qtc = (InterfaceC684820Qtc) this;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvR8 = interfaceC684820Qtc.r8(view);
            this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jvR8;
            if (viewOnAttachStateChangeListenerC20604515jvR8 != null) {
                viewOnAttachStateChangeListenerC20604515jvR8.setNestedScrollingEnabled(false);
                C1744700vVE.LJIIIIZZ(interfaceC684820Qtc.wm(), viewOnAttachStateChangeListenerC20604515jvR8);
                viewOnAttachStateChangeListenerC20604515jvR8.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
                Class<? extends PowerCell<?>>[] clsArrRd = interfaceC684820Qtc.rd();
                viewOnAttachStateChangeListenerC20604515jvR8.LJIILJJIL((Class[]) Arrays.copyOf(clsArrRd, clsArrRd.length));
                C0DXR c0dxrW5 = interfaceC684820Qtc.W5();
                if (c0dxrW5 != null) {
                    viewOnAttachStateChangeListenerC20604515jvR8.addItemDecoration(c0dxrW5);
                }
                viewOnAttachStateChangeListenerC20604515jvR8.setTag(R.id.rnd, this.LLJLILLLLZIIL.getValue());
                C661350Pwr.LJIIJJI(interfaceC684820Qtc.el(), viewOnAttachStateChangeListenerC20604515jvR8);
            }
        }
        tp(view);
    }

    @Override // X.InterfaceC712990Rxx
    public void up(ITEM item) {
        this.LLJLIL = item;
        if (item.LJJLI()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C621840OaE(this, item, null), 3);
        } else {
            zp(item);
        }
        sp(item);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yp(boolean z) {
        if (this instanceof InterfaceC684820Qtc) {
            if (z) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    C661350Pwr.LJIIJJI(((InterfaceC684820Qtc) this).el(), viewOnAttachStateChangeListenerC20604515jv);
                    return;
                }
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
                return;
            }
            C661350Pwr.LJIIJJI(0, viewOnAttachStateChangeListenerC20604515jv2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zp(ITEM item) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if ((this instanceof InterfaceC684820Qtc) && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ) != null) {
            AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter();
            if (adapter != null) {
                this.LLJL = new C653450Pk7<>(adapter);
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C09U0 c09u0 = this.LLJLL;
            if (c09u0 == null) {
                synchronized (this) {
                    c09u0 = this.LLJLL;
                    if (c09u0 == null) {
                        c09u0 = (C09U0) C1807670x8n.p();
                        this.LLJLL = c09u0;
                    }
                }
            }
            C23250099c.LIZLLL(lifecycleScope, c09u0.LIZ, null, new C684810Qtb(this, item, null), 2);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            if (state != null) {
                state.LJIILL(((InterfaceC684820Qtc) this).Jf(item), null);
            }
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(item.LJJJZ());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
