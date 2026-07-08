package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C0RF0;
import X.C0RRR;
import X.C0XPD;
import X.C0XQ7;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1577310r9F;
import X.C1577360r9K;
import X.C1577450r9T;
import X.C1701940uOG;
import X.C20647815qu;
import X.C20648115qx;
import X.C20648315qz;
import X.C259800zU;
import X.C627150Oin;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.DialogInterfaceOnDismissListenerC1620760sHK;
import X.EnumC1577410r9P;
import X.EnumC20654715s1;
import X.InterfaceC1577280r9C;
import X.InterfaceC1577470r9V;
import X.InterfaceC420801kM;
import X.InterfaceC586170Myt;
import Y.ARunnableS102S0100000_2;
import Y.AfS9S0200100_24;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.DramaContentType;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import com.ss.android.ugc.aweme.model.MiniDramaTabConfigResponse;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaSpecialCardServiceImpl;
import com.ss.android.ugc.aweme.series.commonfeed.holder.MiniDramaDNUGuideListCard;
import com.ss.android.ugc.aweme.series.commonfeed.holder.MiniDramaDNUHighlightCard;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.specialcard.component.MiniDramaDNUGuideCardPanelComponent;
import com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaSpecialCardServiceImpl implements IMiniDramaSpecialCardService, InterfaceC586170Myt {
    public C11JF LL;
    public Aweme LLILLJJLI;
    public boolean LLILLL;
    public DramaDNUFeedCardConfig LLILZ;
    public C1577450r9T LLILZIL;
    public final C1577360r9K LLILZLL;

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final boolean LIZ() throws JSONException {
        Aweme aweme = this.LLILLJJLI;
        if (aweme == null) {
            return false;
        }
        C20648315qz.LIZ.getClass();
        long jLJII = C20648315qz.LJII();
        if (jLJII == 0) {
            jLJII = System.currentTimeMillis();
        }
        String typeName = EnumC20654715s1.SPECIAL_CARD.getTypeName();
        String strLJI = C20648315qz.LJI(new Date(jLJII));
        String str = C20648315qz.LJFF;
        String requestId = aweme.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        OutreachRecordData outreachRecordData = new OutreachRecordData(typeName, "drama_dnu_card", null, "hot", strLJI, str, requestId);
        outreachRecordData.setAwemeId(aweme.getAid());
        C20647815qu.LIZ.getClass();
        C20648115qx c20648115qxLJ = C20647815qu.LJ(outreachRecordData, false);
        if (!c20648115qxLJ.LIZ()) {
            C1577310r9F c1577310r9F = C1577310r9F.LIZ;
            EnumC1577410r9P enumC1577410r9P = EnumC1577410r9P.DISPERSION;
            c1577310r9F.getClass();
            C1577310r9F.LIZJ(c1577310r9F, enumC1577410r9P, C1577310r9F.LIZ(aweme), null, null, null, String.valueOf(c20648115qxLJ.LIZ), c20648115qxLJ.LIZIZ, null, null, null, 7406);
        }
        return c20648115qxLJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LIZLLL() {
        this.LLILLL = true;
        this.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LJII(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LJIIJ(Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final C13IQ<? extends AbstractC738140SxQ> LIZJ() {
        return C13LE.LIZ(MiniDramaDNUGuideCardPanelComponent.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, X.0mGW, android.app.Dialog] */
    public final void LJIIJJI() {
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        C11NZ<MiniDramaTabConfigResponse> c11nzLIZLLL;
        Context context;
        Activity activityLIZ;
        C11JF c11jf;
        C11JF c11jf2 = this.LL;
        boolean z = false;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LL) != null) {
            c11jf.dispose();
        }
        C259800zU c259800zU = new C259800zU();
        C1577450r9T c1577450r9T = this.LLILZIL;
        if (c1577450r9T != null && c1577450r9T.LIZIZ) {
            z = true;
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = null;
        if (z && c1577450r9T != null && (context = c1577450r9T.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && !activityLIZ.isFinishing() && !activityLIZ.isDestroyed()) {
            ?? dialogC1389620mGW = new DialogC1389620mGW(activityLIZ);
            c259800zU.element = dialogC1389620mGW;
            dialogC1389620mGW.setCanceledOnTouchOutside(true);
            ((Dialog) c259800zU.element).setOnDismissListener(new DialogInterfaceOnDismissListenerC1620760sHK(this, 1));
            C786410Ut5.J4((DialogC1389620mGW) c259800zU.element);
        }
        C1577310r9F.LIZJ(C1577310r9F.LIZ, EnumC1577410r9P.TAB_CONFIG_REQUEST, null, null, null, null, null, null, null, null, null, 8190);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null && (c11nzLIZLLL = interfaceC1577280r9CLIZ.LIZLLL()) != null) {
            interfaceC420801kMLJJLL = c11nzLIZLLL.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS9S0200100_24(jCurrentTimeMillis, c259800zU, this, 0), new AfS9S0200100_24(jCurrentTimeMillis, c259800zU, this, 1));
        }
        this.LL = (C11JF) interfaceC420801kMLJJLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0r9K] */
    public MiniDramaSpecialCardServiceImpl() {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(this, 34));
        new LinkedHashMap();
        this.LLILZLL = new InterfaceC1577470r9V() { // from class: X.0r9K
            @Override // X.InterfaceC1577470r9V
            public final void LIZIZ(DramaDNUFeedCardConfig dramaDNUFeedCardConfig) {
            }

            @Override // X.InterfaceC1577470r9V
            public final void LIZ(MiniDramaFeedCardResponse miniDramaFeedCardResponse) {
                boolean z;
                String str;
                DramaDNUFeedCardConfig cardConfig;
                DramaDNUFeedCardConfig cardConfig2;
                if (miniDramaFeedCardResponse.getContentType() != DramaContentType.DRAMA_CONTENT_TYPE_FEED_CARD) {
                    return;
                }
                MiniDramaSpecialCardServiceImpl miniDramaSpecialCardServiceImpl = this.LIZ;
                Aweme cardInfo = miniDramaFeedCardResponse.getCardInfo();
                C1577310r9F.LIZ.getClass();
                if (cardInfo != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                    c2344009Gk.LJIIIIZZ("card_id", "pgc_drama_dnu_card");
                    c2344009Gk.LJIIIIZZ("aweme_id", cardInfo.getAid());
                    c2344009Gk.LJIIIIZZ("business_type", "pgc");
                    c2344009Gk.LJIIIIZZ("card_type", "card");
                    c2344009Gk.LJIIIIZZ("series_card_type", C1577310r9F.LIZ(cardInfo));
                    C20684815ws.LJIILLIIL("special_shaped_card_server", c2344009Gk.LIZ);
                }
                miniDramaSpecialCardServiceImpl.LLILLJJLI = cardInfo;
                miniDramaSpecialCardServiceImpl.LLILZ = miniDramaFeedCardResponse.getCardConfig();
                boolean z2 = true;
                if (!miniDramaSpecialCardServiceImpl.LLILLL && miniDramaFeedCardResponse.getCardInfo() != null && ((cardConfig2 = miniDramaFeedCardResponse.getCardConfig()) == null || !Intrinsics.LJFF(cardConfig2.shouldShowCard, Boolean.FALSE))) {
                    z = true;
                    str = "replace_card";
                } else {
                    z = false;
                    str = "permission_deny";
                }
                if (!z && ((cardConfig = miniDramaFeedCardResponse.getCardConfig()) == null || !Intrinsics.LJFF(cardConfig.shouldShowCard, Boolean.FALSE))) {
                    z2 = false;
                }
                C1440005kM.LIZIZ(new C584950Mwv(z2, z, str));
                Map<String, String> trackInfo = miniDramaFeedCardResponse.getTrackInfo();
                if (trackInfo != null) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", "homepage_hot");
                    c2344009Gk2.LJII(trackInfo);
                    C20684815ws.LJIILLIIL("special_shaped_card_server_attribute", c2344009Gk2.LIZ);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final Aweme LJ() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final InterfaceC1577470r9V LJI() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final Object LJFF(Object obj) {
        if (!(obj instanceof C0RF0) || obj == null) {
            return null;
        }
        return new MiniDramaDNUHighlightCard((C0RF0) obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final View LJIIIIZZ(Context context) {
        return C786410Ut5.Sd(R.layout.bgq, C786410Ut5.ne(context), null);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LJIIIZ(Context context, C1577450r9T c1577450r9T) {
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        String str = null;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            this.LLILZIL = c1577450r9T;
            Activity activityLIZ = C1388190mED.LIZ(context);
            C627150Oin c627150Oin = new C627150Oin();
            C786410Ut5.LJJJI("login_title", "", c627150Oin.LIZ);
            C0XPD.LIZIZ(activityLIZ, "homepage_hot", "pgc_drama_dnu_card", c627150Oin.LIZ, null);
            return;
        }
        Aweme aweme = c1577450r9T.LIZJ;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            str = miniDramaCardInfo.cardType;
        }
        if (Intrinsics.LJFF(str, "drama_guide")) {
            Function1<DramaDNUFeedCardConfig, Unit> function1 = c1577450r9T.LIZLLL;
            Boolean bool = Boolean.TRUE;
            function1.invoke(new DramaDNUFeedCardConfig(bool, bool, bool, null, null, null, null, null));
        } else {
            DramaDNUFeedCardConfig dramaDNUFeedCardConfig = this.LLILZ;
            if (dramaDNUFeedCardConfig != null) {
                c1577450r9T.LIZLLL.invoke(dramaDNUFeedCardConfig);
            } else {
                this.LLILZIL = c1577450r9T;
                LJIIJJI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final Object LIZIZ(View view, Fragment fragment, String str) {
        return new MiniDramaDNUGuideListCard(view, fragment);
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String str;
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        if (i == 3) {
            this.LLILZ = null;
            return;
        }
        if (i != 1 || !z) {
            return;
        }
        C1577450r9T c1577450r9T = this.LLILZIL;
        if (c1577450r9T != null && (aweme = c1577450r9T.LIZJ) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            str = miniDramaCardInfo.cardType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "drama_guide")) {
            C1577450r9T c1577450r9T2 = this.LLILZIL;
            if (c1577450r9T2 != null) {
                Function1<DramaDNUFeedCardConfig, Unit> function1 = c1577450r9T2.LIZLLL;
                Boolean bool = Boolean.TRUE;
                function1.invoke(new DramaDNUFeedCardConfig(bool, bool, bool, null, null, null, null, null));
                return;
            }
            return;
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1577450r9T(null, null, AFwS264S0000000_24.get$arr$(274), false);
        }
        LJIIJJI();
    }
}
