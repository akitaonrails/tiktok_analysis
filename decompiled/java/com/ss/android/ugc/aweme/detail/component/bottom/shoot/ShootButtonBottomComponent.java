package com.ss.android.ugc.aweme.detail.component.bottom.shoot;

import X.C1400500mY4;
import X.C14LC;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C21459218yU;
import X.C309690CBz;
import X.C786410Ut5;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS37S0300000_4;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ShootButtonBottomComponent extends BasePanelComponent implements IDetailBottomProtocol {
    public boolean LL;
    public Drawable LLILLJJLI;
    public Drawable LLILLL;
    public View LLILZ;
    public View LLILZIL;

    public abstract void bo(View view);

    /* JADX INFO: renamed from: do */
    public abstract int mo176do();

    public void fo(View view) {
    }

    public abstract View ko(ViewGroup viewGroup);

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
        boolean z = C14LC.LJIIIZ;
        if (C309690CBz.LIZ.LJFF) {
            return;
        }
        this.LL = true;
        View view = this.LLILZIL;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.htn);
            View viewFindViewById2 = view.findViewById(R.id.huj);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    public void ho(ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(R.id.szn);
        if (textView == null) {
            return;
        }
        textView.setText(mo176do());
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getABService();
        if (!C1400500mY4.LIZJ()) {
            HandlerHook.viewPost(viewGroup, new ARunnableS37S0300000_4(viewGroup, textView, this, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewKo = ko(viewGroup);
        this.LLILZIL = viewKo;
        if (viewKo == null) {
            return null;
        }
        View viewFindViewById = viewKo.findViewById(R.id.cbx);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null) {
            fo(viewFindViewById);
            ho((ViewGroup) this.LLILZ);
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS154S0100000_19(this, 95), view);
            }
        }
        return this.LLILZIL;
    }

    public final void lo(final C21459218yU c21459218yU, final String str) {
        c21459218yU.setText(str);
        C786410Ut5.x3(c21459218yU.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0hfB
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View view;
                C786410Ut5.C3(c21459218yU.getViewTreeObserver(), this);
                if (c21459218yU.getMeasuredWidth() < c21459218yU.getPaint().measureText(str)) {
                    ShootButtonBottomComponent shootButtonBottomComponent = this;
                    if (!shootButtonBottomComponent.LL && (view = shootButtonBottomComponent.LLILZIL) != null) {
                        shootButtonBottomComponent.getClass();
                        View viewFindViewById = view.findViewById(R.id.htn);
                        View viewFindViewById2 = view.findViewById(R.id.huj);
                        if (viewFindViewById != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        }
                        if (viewFindViewById2 != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                        }
                        if (C444960Hcc.LIZJ(shootButtonBottomComponent.getContext()) && viewFindViewById2 != null && viewFindViewById != null) {
                            if (shootButtonBottomComponent.LLILLJJLI == null) {
                                shootButtonBottomComponent.LLILLJJLI = viewFindViewById.getBackground();
                            }
                            if (shootButtonBottomComponent.LLILLL == null) {
                                shootButtonBottomComponent.LLILLL = viewFindViewById2.getBackground();
                            }
                            viewFindViewById.setBackground(shootButtonBottomComponent.LLILLL);
                            viewFindViewById2.setBackground(shootButtonBottomComponent.LLILLJJLI);
                        }
                    }
                    c21459218yU.LIZJ();
                }
            }
        });
    }
}
