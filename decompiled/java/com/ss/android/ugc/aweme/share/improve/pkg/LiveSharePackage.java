package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC1375550ltp;
import X.AbstractC19483511Kn;
import X.C0M7Y;
import X.C0N6J;
import X.C0XI4;
import X.C11S5;
import X.C1370940lmO;
import X.C1372380loi;
import X.C1373440lqQ;
import X.C1374180lrc;
import X.C1374720lsU;
import X.C1380720m2A;
import X.C13LE;
import X.C1554610qYd;
import X.C1701940uOG;
import X.C19480611Jk;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1369790lkX;
import X.InterfaceC1374150lrZ;
import Y.AfS113S0300000_21;
import Y.AfS156S0200000_21;
import Y.AkS72S1200000_21;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveSharePackage extends LinkDefaultSharePackage {
    public static final C1372380loi Companion = new C1372380loi();
    public static final int $stable = 8;

    public LiveSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC19483511Kn<AbstractC1375550ltp> LJIIZILJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        Companion.getClass();
        if (!this.extras.getBoolean("live_share_use_custom_link_share_content", false)) {
            return super.LJIIZILJ(interfaceC1369790lkX);
        }
        return LJJI(interfaceC1369790lkX).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ());
    }

    public final C19480611Jk LJJI(InterfaceC1369790lkX interfaceC1369790lkX) {
        String strLJFF;
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = this.itemType;
        String str2 = this.description;
        c1373440lqQ.getClass();
        String strLIZ = C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
        C786410Ut5.LJJJI("share_form", "url_form", this.extras);
        Companion.getClass();
        String string = this.extras.getString("live_referral_key");
        if (string == null) {
            string = "";
        }
        if (a0.LJJJIL(string)) {
            strLJFF = this.url;
        } else {
            strLJFF = this.url;
            try {
                if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJFF), "live_referral_key"), string)) {
                    C0XI4 c0xi4 = new C0XI4(strLJFF);
                    c0xi4.LJ("live_referral_key", string);
                    strLJFF = c0xi4.LJFF();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return C1374720lsU.LJ(strLJFF, this.itemType, interfaceC1369790lkX.key(), null, 12).LJIIJ(new AkS72S1200000_21(this, interfaceC1369790lkX, strLIZ, 4));
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        Companion.getClass();
        if (!this.extras.getBoolean("live_share_use_custom_link_share_content", false)) {
            super.LJIJ(interfaceC1369790lkX, function2);
        } else {
            LJJI(interfaceC1369790lkX).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new AfS156S0200000_21(this, function2, 9), new AfS113S0300000_21(this, interfaceC1369790lkX, function2, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0lrW] */
    public final boolean LJJIFFI(InterfaceC1369790lkX interfaceC1369790lkX, Context context, final C0M7Y c0m7y, final Function1 function1) {
        ArrayList arrayList;
        C0N6J c0n6jLJI;
        if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).i5()) {
            return false;
        }
        String string = this.extras.getString("panel_source");
        if (string == null) {
            string = "";
        }
        if (!TextUtils.equals("screenshot_popup", string) || Intrinsics.LJFF(interfaceC1369790lkX.key(), "chat_merge")) {
            return false;
        }
        C1374180lrc c1374180lrc = new C1374180lrc(interfaceC1369790lkX);
        ?? r5 = new InterfaceC1374150lrZ() { // from class: X.0lrW
            @Override // X.InterfaceC1374150lrZ
            public final Function1<Boolean, Unit> LIZ() {
                return function1;
            }
        };
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, ScreenshotShareStrategy.class, false);
        if (listLIZIZ != null) {
            arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (Intrinsics.LJFF(((ScreenshotShareStrategy) obj).LJFF(), C13LE.LIZ(LiveSharePackage.class))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                ScreenshotShareStrategy screenshotShareStrategy = (ScreenshotShareStrategy) it2.next();
                if (screenshotShareStrategy.LIZ(c1374180lrc.LIZ, this) && screenshotShareStrategy.LJ(c1374180lrc.LIZ, context, this, r5)) {
                    c0n6jLJI = screenshotShareStrategy.LJI();
                    break;
                }
            } else {
                c0n6jLJI = C0N6J.ILLEGAL;
                break;
            }
        }
        if (c0n6jLJI == C0N6J.ILLEGAL) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        String string;
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "snapchat")) {
            try {
                Bundle bundle = this.extras;
                Object obj = null;
                if (bundle != null) {
                    string = bundle.getString("author_name");
                } else {
                    string = null;
                }
                C1380720m2A.LIZ = string;
                if (bundle != null) {
                    try {
                        try {
                            obj = bundle.get("video_cover");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                C1380720m2A.LIZIZ = (UrlModel) obj;
                C1380720m2A.LIZ(context, new AwS230S0300000_21(context, interfaceC1369790lkX, function1, 18));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            LJJIFFI(interfaceC1369790lkX, context, c0m7y, function1);
            return true;
        }
        return LJJIFFI(interfaceC1369790lkX, context, c0m7y, function1);
    }
}
