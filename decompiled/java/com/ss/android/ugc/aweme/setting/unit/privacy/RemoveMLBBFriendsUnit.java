package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.AbstractC19293010ds;
import X.AbstractViewOnClickListenerC372950Ejl;
import X.C1070520dxq;
import X.C10F0;
import X.C1238760iLC;
import X.C19213310Ep;
import X.C19213810Eu;
import X.C19214210Ey;
import X.C19323610io;
import X.C844470XAv;
import X.EnumC1216700hlc;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RemoveMLBBFriendsUnit extends C1238760iLC implements C10F0 {
    public final BasePage LLILZIL;
    public C19214210Ey LLILZLL;

    @Override // X.C10F0
    public final void A() {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = this.LLILZIL.getContext();
        BasePage basePage = this.LLILZIL;
        c1070520dxq.getClass();
        C1070520dxq.LJIIJJI(context, basePage);
    }

    @Override // X.C1238760iLC
    /* JADX INFO: renamed from: LJII */
    public final C19323610io LIZLLL() {
        EnumC1216700hlc enumC1216700hlc = EnumC1216700hlc.DESTRUCTIVE;
        AbstractViewOnClickListenerC372950Ejl abstractViewOnClickListenerC372950Ejl = new AbstractViewOnClickListenerC372950Ejl() { // from class: X.10Ew
            {
                super(2000L);
            }

            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context contextRequireContext = this.LLILZ.LLILZIL.requireContext();
                BasePage basePage = this.LLILZ.LLILZIL;
                C19213910Ev c19213910Ev = new C19213910Ev(this.LLILZ);
                AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this.LLILZ, 221);
                AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this.LLILZ, 222);
                c1070520dxq.getClass();
                C1070520dxq.LJIJ(contextRequireContext, basePage, c19213910Ev, awS607S0100000_28, awS607S0100000_282);
            }
        };
        AbstractViewOnClickListenerC372950Ejl abstractViewOnClickListenerC372950Ejl2 = new AbstractViewOnClickListenerC372950Ejl() { // from class: X.10Ew
            {
                super(2000L);
            }

            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context contextRequireContext = this.LLILZ.LLILZIL.requireContext();
                BasePage basePage = this.LLILZ.LLILZIL;
                C19213910Ev c19213910Ev = new C19213910Ev(this.LLILZ);
                AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this.LLILZ, 221);
                AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this.LLILZ, 222);
                c1070520dxq.getClass();
                C1070520dxq.LJIJ(contextRequireContext, basePage, c19213910Ev, awS607S0100000_28, awS607S0100000_282);
            }
        };
        C844470XAv.LIZ.getClass();
        return new C19323610io(C844470XAv.LIZ().getString(2131837437), null, abstractViewOnClickListenerC372950Ejl2, null, false, null, null, null, false, false, enumC1216700hlc, C844470XAv.LIZ().getString(2131837436), false, false, abstractViewOnClickListenerC372950Ejl, null, null, 16730874);
    }

    @Override // X.C10F0
    public final void rY() {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = this.LLILZIL.getContext();
        BasePage basePage = this.LLILZIL;
        C19213810Eu c19213810Eu = new C19213810Eu(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 137);
        c1070520dxq.getClass();
        C1070520dxq.LJIILJJIL(context, basePage, c19213810Eu, awS607S0100000_28);
    }

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZJ() {
        AbstractC19293010ds abstractC19293010dsLIZJ = super.LIZJ();
        C19214210Ey c19214210Ey = new C19214210Ey();
        c19214210Ey.LLILLJJLI = this;
        this.LLILZLL = c19214210Ey;
        LJI(AFwS271S0000000_28.get$arr$(286));
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = this.LLILZIL.getContext();
        BasePage basePage = this.LLILZIL;
        C19213310Ep c19213310Ep = new C19213310Ep(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 223);
        c1070520dxq.getClass();
        C1070520dxq.LIZJ(context, basePage, c19213310Ep, awS607S0100000_28);
        return abstractC19293010dsLIZJ;
    }

    @Override // X.C1238760iLC, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public RemoveMLBBFriendsUnit(BasePage basePage) {
        super(null);
        this.LLILZIL = basePage;
        basePage.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C19214210Ey c19214210Ey;
                if (event == Lifecycle.Event.ON_DESTROY && (c19214210Ey = RemoveMLBBFriendsUnit.this.LLILZLL) != null) {
                    c19214210Ey.LIZ();
                }
            }
        });
    }

    @Override // X.C10F0
    public final void t00(int i) {
        rY();
    }
}
