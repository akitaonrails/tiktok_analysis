package com.ss.android.ugc.aweme.search.pages.result.bot.waiting;

import X.C01GW;
import X.C07E5;
import X.C0FE5;
import X.C0PRC;
import X.C0SVC;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C14TF;
import X.C1710306mr;
import X.C197039127h;
import X.C285520BHa;
import X.C339190DRl;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C467860IWi;
import X.C643120PKk;
import X.C643200PKs;
import X.C646370PWx;
import X.C654740PmC;
import X.C661350Pwr;
import X.C723830SaL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1334290kpH;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS114S0200000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoWaitingListAssem extends ReusedUISlotAssem<SearchTakoWaitingListAssem> implements InterfaceC712990Rxx<C643120PKk> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 414));
    public final float LLJL = 0.375f;
    public final float LLJLIL = 0.4489796f;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 416));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 415));
    public final boolean LLJLLIL = C467860IWi.LIZ(ActivityStack.getTopActivity());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f3j;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C0PRC op() {
        return (C0PRC) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        boolean z = true;
        if (((Number) C285520BHa.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (z) {
            C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 181));
            C339190DRl.LIZIZ(LJJIJL().findViewById(R.id.dz1));
            getContentView().getLayoutParams().height = -2;
            ((RadiusLayout) this.LLJJLIIIJLLLLLLLZ.getValue()).setRadius(C418440Gaw.LIZIZ(10));
            C661350Pwr.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), (View) this.LLJJLIIIJLLLLLLLZ.getValue());
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
                ((RadiusLayout) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZIZ(numLIZJ.intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 0, 0);
            }
            View viewFindViewById = getContentView().findViewById(R.id.kb6);
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewFindViewById, new ARunnableS79S0200000_10(viewFindViewById, this, 27));
        } else {
            View viewFindViewById2 = getContentView().findViewById(R.id.kb6);
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewFindViewById2, new ARunnableS79S0200000_10(viewFindViewById2, this, 28));
        }
        C427690Gpr.LJ(LJJIJL().findViewById(R.id.kb6), 0.0f);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C643120PKk c643120PKk) throws JSONException {
        String str;
        C643120PKk c643120PKk2 = c643120PKk;
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c643120PKk2.LLILLJJLI);
        c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) LJJIJL().findViewById(R.id.kb6));
        c1331670kl3LJIIIZ.LJIIJJI();
        C786410Ut5.Q8((SmartImageView) LJJIJL().findViewById(R.id.kb6), new ACListenerS114S0200000_10(c643120PKk2, this, 10));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "general_search");
        C0PRC c0prcOp = op();
        if (c0prcOp != null) {
            str = c0prcOp.LLILLL;
        } else {
            str = null;
        }
        jSONObject.put("search_id", str);
        AppLogNewUtils.onEventV3("tikbot_beta_card_show", jSONObject);
        if (((Number) C285520BHa.LIZ.getValue()).intValue() != 1) {
            SmartImageView smartImageView = (SmartImageView) LJJIJL().findViewById(R.id.bh2);
            if (smartImageView != null) {
                C14TF.LIZIZ.LJI().LIZIZ(new C0FE5(smartImageView, this), this.LLJLLIL);
            }
            Context context = getContext();
            if (context != null) {
                LJJIJL().findViewById(R.id.bh2).setBackgroundColor((C0SVC.LIZ(R.attr.a0v, context) & 16777215) | fe.f);
            }
            C786410Ut5.U8((C197039127h) LJJIJL().findViewById(R.id.d6g), new ACListenerS114S0200000_10(c643120PKk2, this, 11));
            ((TextView) LJJIJL().findViewById(R.id.xjk)).setText(C1710306mr.LIZIZ(2131849855, c643120PKk2.LL));
        }
    }

    public final void sp(C643120PKk c643120PKk) {
        String str;
        String str2;
        String str3;
        C654740PmC c654740PmC = new C654740PmC(null);
        c654740PmC.LJIJJ("general_search");
        C0PRC c0prcOp = op();
        if (c0prcOp != null) {
            str = c0prcOp.LLILLL;
        } else {
            str = null;
        }
        c654740PmC.LJIIZILJ("search_id", str);
        if (c643120PKk != null) {
            str2 = c643120PKk.LLILLL;
        } else {
            str2 = null;
        }
        c654740PmC.LJIJI("search_result_id", str2);
        C0PRC c0prcOp2 = op();
        if (c0prcOp2 != null) {
            str3 = c0prcOp2.LLIZLLLIL;
        } else {
            str3 = null;
        }
        c654740PmC.LJIIZILJ("search_keyword", str3);
        c654740PmC.LJIIZILJ("token_type", "tikbot_waiting_list");
        C643200PKs.LIZ(c654740PmC, (C646370PWx) this.LLJLL.getValue(), null);
        c654740PmC.LJIILJJIL();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C643120PKk c643120PKk) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C643120PKk c643120PKk) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        up(interfaceC1587906Jp);
    }
}
