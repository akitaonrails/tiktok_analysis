package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.AbstractC19293010ds;
import X.C01GW;
import X.C1070520dxq;
import X.C10F0;
import X.C1238760iLC;
import X.C19213110En;
import X.C19213410Eq;
import X.C19213510Er;
import X.C19214210Ey;
import X.C19323610io;
import X.C452501pT;
import X.C844470XAv;
import X.EnumC1216700hlc;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RemoveContactsUnit extends C1238760iLC implements C10F0, View.OnClickListener {
    public final BasePage LLILZIL;
    public C19214210Ey LLILZLL;
    public final C01GW LLIZ;

    @Override // X.C10F0
    public final void rY() {
        t00(0);
    }

    @Override // X.C10F0
    public final void A() {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = (Context) this.LLIZ.getValue();
        BasePage basePage = this.LLILZIL;
        c1070520dxq.getClass();
        C1070520dxq.LJIIJJI(context, basePage);
    }

    @Override // X.C1238760iLC
    /* JADX INFO: renamed from: LJII */
    public final C19323610io LIZLLL() {
        EnumC1216700hlc enumC1216700hlc = EnumC1216700hlc.DESTRUCTIVE;
        C844470XAv.LIZ.getClass();
        return new C19323610io(C844470XAv.LIZ().getString(2131847810), null, this, null, false, null, null, null, false, false, enumC1216700hlc, C844470XAv.LIZ().getString(2131847811), false, false, this, null, null, 16730874);
    }

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZJ() {
        AbstractC19293010ds abstractC19293010dsLIZJ = super.LIZJ();
        C19214210Ey c19214210Ey = new C19214210Ey();
        c19214210Ey.LLILLJJLI = this;
        this.LLILZLL = c19214210Ey;
        LJI(AFwS271S0000000_28.get$arr$(278));
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = (Context) this.LLIZ.getValue();
        BasePage basePage = this.LLILZIL;
        C19213110En c19213110En = new C19213110En(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 217);
        c1070520dxq.getClass();
        C1070520dxq.LIZ(context, basePage, c19213110En, awS607S0100000_28);
        return abstractC19293010dsLIZJ;
    }

    @Override // X.C1238760iLC, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public RemoveContactsUnit(BasePage basePage) {
        super(null);
        this.LLILZIL = basePage;
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 535));
        basePage.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C19214210Ey c19214210Ey;
                if (event == Lifecycle.Event.ON_DESTROY && (c19214210Ey = RemoveContactsUnit.this.LLILZLL) != null) {
                    c19214210Ey.LIZ();
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = (Context) this.LLIZ.getValue();
        BasePage basePage = this.LLILZIL;
        C19213510Er c19213510Er = new C19213510Er(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 132);
        AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this, 133);
        c1070520dxq.getClass();
        C1070520dxq.LJIILLIIL(context, basePage, c19213510Er, awS607S0100000_28, awS607S0100000_282);
    }

    @Override // X.C10F0
    public final void t00(int i) {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = (Context) this.LLIZ.getValue();
        BasePage basePage = this.LLILZIL;
        C19213410Eq c19213410Eq = new C19213410Eq(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 131);
        c1070520dxq.getClass();
        C1070520dxq.LJIIL(context, basePage, c19213410Eq, awS607S0100000_28, i);
    }
}
