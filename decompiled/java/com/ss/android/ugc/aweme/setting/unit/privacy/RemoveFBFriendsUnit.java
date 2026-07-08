package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.AbstractC19293010ds;
import X.C01GW;
import X.C1070520dxq;
import X.C10F0;
import X.C11NJ;
import X.C1238760iLC;
import X.C19213210Eo;
import X.C19213610Es;
import X.C19213710Et;
import X.C19214210Ey;
import X.C19323610io;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC1216700hlc;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RemoveFBFriendsUnit extends C1238760iLC implements C10F0, View.OnClickListener {
    public final BasePage LLILZIL;
    public C19214210Ey LLILZLL;
    public final C01GW LLIZ;

    @Override // X.C10F0
    public final void A() {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context contextLJIIJ = LJIIJ();
        BasePage basePage = this.LLILZIL;
        c1070520dxq.getClass();
        C1070520dxq.LJIIJJI(contextLJIIJ, basePage);
    }

    @Override // X.C1238760iLC
    /* JADX INFO: renamed from: LJII */
    public final C19323610io LIZLLL() {
        EnumC1216700hlc enumC1216700hlc = EnumC1216700hlc.DESTRUCTIVE;
        C844470XAv.LIZ.getClass();
        String string = C844470XAv.LIZ().getString(2131847812);
        String string2 = C844470XAv.LIZ().getString(2131847813);
        View view = new View(LJIIJ());
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        return new C19323610io(string, null, this, null, false, view, null, null, false, false, enumC1216700hlc, string2, false, false, this, null, null, 16730842);
    }

    public final Context LJIIJ() {
        return (Context) this.LLIZ.getValue();
    }

    @Override // X.C10F0
    public final void rY() {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context contextLJIIJ = LJIIJ();
        BasePage basePage = this.LLILZIL;
        C19213610Es c19213610Es = new C19213610Es(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 134);
        c1070520dxq.getClass();
        C1070520dxq.LJIILIIL(contextLJIIJ, basePage, c19213610Es, awS607S0100000_28);
    }

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZJ() {
        super.LIZJ();
        C19214210Ey c19214210Ey = new C19214210Ey();
        c19214210Ey.LLILLJJLI = this;
        this.LLILZLL = c19214210Ey;
        LJI(AFwS271S0000000_28.get$arr$(282));
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context contextLJIIJ = LJIIJ();
        BasePage basePage = this.LLILZIL;
        C19213210Eo c19213210Eo = new C19213210Eo(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 219);
        c1070520dxq.getClass();
        C1070520dxq.LIZIZ(contextLJIIJ, basePage, c19213210Eo, awS607S0100000_28);
        return LIZIZ();
    }

    @Override // X.C1238760iLC, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public RemoveFBFriendsUnit(BasePage basePage) {
        super(null);
        this.LLILZIL = basePage;
        new C11NJ();
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 536));
        basePage.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C19214210Ey c19214210Ey;
                if (event == Lifecycle.Event.ON_DESTROY && (c19214210Ey = RemoveFBFriendsUnit.this.LLILZLL) != null) {
                    c19214210Ey.LIZ();
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context contextLJIIJ = LJIIJ();
        BasePage basePage = this.LLILZIL;
        C19213710Et c19213710Et = new C19213710Et(this);
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 135);
        AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this, 136);
        c1070520dxq.getClass();
        C1070520dxq.LJIIZILJ(contextLJIIJ, basePage, c19213710Et, awS607S0100000_28, awS607S0100000_282);
    }

    @Override // X.C10F0
    public final void t00(int i) {
        rY();
    }
}
