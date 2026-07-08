package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.AbstractC848400XPy;
import X.C0M7Y;
import X.C0XPD;
import X.C0XQ7;
import X.C1019100ccu;
import X.C1022820ciu;
import X.C1362890lZP;
import X.C1370970lmR;
import X.C1375500ltk;
import X.C1389890mGx;
import X.C1599690rjL;
import X.C20642515q3;
import X.C2184171Adz;
import X.C419910GdJ;
import X.C733420Spo;
import X.C786410Ut5;
import X.C844470XAv;
import X.DialogC1389100mFg;
import X.InterfaceC1364520lc2;
import X.InterfaceC1364710lcL;
import X.InterfaceC1365250ldD;
import X.InterfaceC1365380ldQ;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ImChannel extends PureLogicChannel {
    public final SharePackage LL;
    public final String LLILLJJLI;
    public final InterfaceC1365380ldQ LLILLL;
    public boolean LLILZ;
    public InterfaceC1364520lc2 LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "chat_merge";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(2131845896);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIIJZLJL(int i) {
        if (this.LLILZLL) {
            Bundle bundle = this.LL.extras;
            bundle.putInt("rank_num", i);
            C786410Ut5.LJJJI("button_type", "airplane", bundle);
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LJJIIJZLJL(this.LL);
            this.LLILZLL = false;
        }
    }

    public ImChannel(SharePackage sharePackage, String str) {
        this.LL = sharePackage;
        this.LLILLJJLI = str;
        IMSharePanelApi.LIZ.getClass();
        this.LLILLL = C1599690rjL.LIZ().getShareService();
        IInternalShareApi.LIZ.getClass();
        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
        C844470XAv.LIZ.getClass();
        interfaceC1364710lcLLIZIZ.LJJJJ(new C1362890lZP(C844470XAv.LIZ(), sharePackage));
        this.LLILZ = true;
        this.LLILZLL = true;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z) {
                c419910GdJ.LIZ = R.raw.icon_color_paperplane_square;
            } else {
                c419910GdJ.LIZ = R.raw.icon_color_dm_icon_experiment_v1;
            }
            return c419910GdJ.LIZ(context);
        }
        return null;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        Aweme awemeZr;
        if (Intrinsics.LJFF(this.LLILLJJLI, "homepage_hot")) {
            this.LLILLL.LJIJ(this.LL.extras.getLong("clicked_time", System.currentTimeMillis()), "icon");
        }
        AwemeRawAd awemeRawAd = null;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(C1375500ltk.LJII(context), this.LLILLJJLI, "click_shareim_button", null, null);
            return true;
        }
        Activity activityLJII = C1375500ltk.LJII(context);
        if (activityLJII == null) {
            return false;
        }
        if (!this.LLILZ) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLJII);
            c1389890mGx.LJIIIZ(2131847320);
            c1389890mGx.LJIIJJI();
            return true;
        }
        C786410Ut5.LJJJI("button_type", "airplane", this.LL.extras);
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LJIJJLI(this.LL);
        DialogC1389100mFg dialogC1389100mFgLJJJJZ = this.LLILLL.LJJJJZ(activityLJII, this.LL, null, null, true, new InterfaceC1365250ldD() { // from class: X.0lby
            @Override // X.InterfaceC1365250ldD
            public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1365250ldD
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1365250ldD
            public final void LJII(Dialog dialog, SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1365250ldD
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1365250ldD
            public final void LIZIZ(HashMap<String, String> map) {
                InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LLILZIL;
                if (interfaceC1364520lc2 != null) {
                    interfaceC1364520lc2.LIZIZ(map);
                }
            }

            @Override // X.InterfaceC1365250ldD
            public final void LJFF(SharePackage sharePackage) {
                InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LLILZIL;
                if (interfaceC1364520lc2 != null) {
                    interfaceC1364520lc2.LJIIL(sharePackage);
                }
            }

            @Override // X.InterfaceC1365250ldD
            public final void LJI(SharePackage sharePackage) {
                InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LLILZIL;
                if (interfaceC1364520lc2 != null) {
                    interfaceC1364520lc2.LJII(sharePackage);
                }
            }

            @Override // X.InterfaceC1365250ldD
            public final void LJIIIZ(SharePackage sharePackage) {
                InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LLILZIL;
                if (interfaceC1364520lc2 != null) {
                    interfaceC1364520lc2.LJIIIZ();
                }
            }

            @Override // X.InterfaceC1365250ldD
            public final void LJIIJ(SharePackage sharePackage, List<? extends IMContact> list) {
                InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LLILZIL;
                if (interfaceC1364520lc2 != null) {
                    interfaceC1364520lc2.LJIILIIL(sharePackage);
                }
            }
        }, false, null, false, true, false, false, null, false, false, false, "more_tiktok_contacts");
        if (dialogC1389100mFgLJJJJZ != null) {
            C786410Ut5.B4(dialogC1389100mFgLJJJJZ);
        }
        C733420Spo.LIZLLL("chat_merge");
        long j = this.LL.extras.getLong("ad_id");
        if (j != 0 && (awemeZr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).zr(String.valueOf(j))) != null && AwemeExtKt.isAdTraffic(awemeZr)) {
            FeedRawAdLogUtilsImpl.LIZIZ().LIZ(context, awemeZr);
            if (awemeZr != null) {
                awemeRawAd = awemeZr.getAwemeRawAd();
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "share", awemeRawAd);
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(awemeZr), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(awemeZr), "room_id");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
        return true;
    }
}
