package com.ss.android.ugc.aweme.share.qrcode.pkg;

import X.AbstractC848400XPy;
import X.C06VO;
import X.C0M7Y;
import X.C0XJW;
import X.C0XQ7;
import X.C11FQ;
import X.C123100dR;
import X.C1255100ilY;
import X.C1370940lmO;
import X.C1373040lpm;
import X.C1373600lqg;
import X.C1375500ltk;
import X.C1375700lu4;
import X.C621180OYa;
import X.InterfaceC1096790eeD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1373050lpn;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class QRCodeSharePackage extends SharePackage {
    public InterfaceC1096790eeD callback;
    public View qrCodeContainerView;
    public static final C1373040lpm Companion = new Object() { // from class: X.0lpm
    };
    public static final int $stable = 8;

    public QRCodeSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        KeyEvent.Callback callback = this.qrCodeContainerView;
        if (callback != null) {
            ((InterfaceC1373050lpn) callback).LIZ();
        }
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        String str;
        String string = this.extras.getString("qrcode_author_id");
        if (string == null) {
            string = "";
        }
        if (C123100dR.LIZ(string) && Intrinsics.LJFF(string, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid())) {
            str = "self_video_share_list";
        } else {
            str = "others_video_share_list";
        }
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), str);
        View view2 = this.qrCodeContainerView;
        if (view2 != 0 && (view2 instanceof InterfaceC1373050lpn)) {
            C11FQ qrCodeSquareView = ((InterfaceC1373050lpn) view2).getQrCodeSquareView();
            if (interfaceC1369790lkX instanceof C06VO) {
                C1255100ilY.LIZ.getClass();
                Activity activityLJII = C1375500ltk.LJII(context);
                if (activityLJII != null) {
                    C0XJW.LIZ(activityLJII, TokenCert.Companion.with("bpea-check_save_square_view_qrcode_permission"), null, new AwS265S0300000_21(context, view2, qrCodeSquareView, 11), null);
                }
            } else {
                C1255100ilY.LIZ.getClass();
                C1375700lu4.LIZ(context, view2, qrCodeSquareView, false, true, new C1373600lqg(context, interfaceC1369790lkX));
            }
            function1.invoke(Boolean.TRUE);
            return true;
        }
        return true;
    }
}
