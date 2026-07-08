package com.ss.android.ugc.profile.business.ur.longpress;

import X.AbstractC737180Svs;
import X.C0HTT;
import X.C11RK;
import X.C1389890mGx;
import X.C1391600mJi;
import X.C1952207km;
import X.C20684815ws;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C734080Sqs;
import X.C735210Ssh;
import X.C737030Svd;
import X.C737100Svk;
import X.C814420VxA;
import X.EnumC1235690iGF;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.ur.longpress.ILongPressService;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class LongPressServiceImpl implements ILongPressService {
    public C11RK<MotionEvent> LIZ;

    @Override // com.ss.android.ugc.ur.longpress.ILongPressService
    public final void LLLLLZL(MotionEvent motionEvent) {
        C11RK<MotionEvent> c11rk = this.LIZ;
        if (c11rk == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            } else {
                c11rk.onNext(motionEvent);
                return;
            }
        }
        c11rk.onNext(motionEvent);
        c11rk.onComplete();
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.ur.longpress.ILongPressService
    public final void LLLLZI(Context context, View view) {
        C1952207km.LIZ.getClass();
        if (C1952207km.LIZ().getBoolean("long_press_aweme_instruction_tooltip_shown", false)) {
            return;
        }
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        c450720Hlu.LJIIJ(2131836863);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c450720Hlu.LIZIZ().show();
        C734080Sqs.LIZ.getClass();
        C20684815ws.LJIILLIIL("show_long_press_tooltip", new C2344009Gk().LIZ);
        C1952207km.LIZ().storeBoolean("long_press_aweme_instruction_tooltip_shown", true);
    }

    @Override // com.ss.android.ugc.ur.longpress.ILongPressService
    public final List<AbstractC737180Svs> LLLLZIL(C735210Ssh c735210Ssh, C0HTT<C737030Svd> c0htt) {
        return new C737100Svk(c735210Ssh, null).LIZJ(c0htt);
    }

    public static void LIZ(Activity activity, String str, Integer num) {
        if (str != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
            return;
        }
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
        c1389890mGx2.LJIIIZ(iIntValue);
        c1389890mGx2.LIZ(true);
        c1389890mGx2.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a3  */
    @Override // com.ss.android.ugc.ur.longpress.ILongPressService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1259330isN LLLLZ(android.view.View r20, final X.C19EG r21, final androidx.fragment.app.Fragment r22, android.os.Bundle r23, com.ss.android.ugc.ur.longpress.AwemeRouteDetailPageParams r24, X.C19742912Mh r25) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl.LLLLZ(android.view.View, X.19EG, androidx.fragment.app.Fragment, android.os.Bundle, com.ss.android.ugc.ur.longpress.AwemeRouteDetailPageParams, X.12Mh):X.0isN");
    }
}
