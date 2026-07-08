package com.ss.android.ugc.aweme.lemon.feed.component;

import X.C01GW;
import X.C03IT;
import X.C08JS;
import X.C098200Yq;
import X.C0CSN;
import X.C0WZX;
import X.C1052320dUU;
import X.C1052420dUe;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C14LC;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C189200o6;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C428600GrK;
import X.C452501pT;
import X.C497820Jfg;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C786960Uty;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC427850Gq7;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.lemon.feed.config.LemonAdaptionProtocol;
import com.ss.android.ugc.aweme.lemon.feed.model.LemonGuideCardData;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;
import wh6.AbS697S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class LemonGuideCardComponent extends BaseCellContentComponent<LemonGuideCardComponent> implements InterfaceC427850Gq7, LemonAdaptionProtocol {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 328));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 329));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 330));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 326));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 327));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 331));

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    @Override // com.ss.android.ugc.aweme.lemon.feed.config.LemonAdaptionProtocol
    public final void LJJIJLIJ() {
        C1578630rBN.LJIIJJI(this, new C0CSN(this, null));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Keva keva = C1052420dUe.LIZ;
        C1052320dUU.LIZ.getClass();
        if (C1052320dUU.LIZIZ) {
            C1052420dUe.LIZ.storeLong("fyp_big_card_not_interested_time", System.currentTimeMillis());
        }
    }

    public final LemonGuideCardData hp() {
        Object c098200Yq;
        String cardInsertStatus;
        try {
            C724270Sb3 c724270Sb3 = this.LLJI;
            CardInsertInfo cardInsertInfo = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getCardInsertInfo();
            if (cardInsertInfo == null || (cardInsertStatus = cardInsertInfo.getCardInsertStatus()) == null) {
                cardInsertStatus = "";
            }
            c098200Yq = (LemonGuideCardData) C08JS.LIZ(cardInsertStatus, LemonGuideCardData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new LemonGuideCardData(0, null, null, null, 0, null, null);
        }
        return (LemonGuideCardData) c098200Yq;
    }

    public final RadiusLayout ip() {
        return (RadiusLayout) this.LLJJJJLIIL.getValue();
    }

    public final SmartImageView kp() {
        return (SmartImageView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        kp().setImageBitmap(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), LemonAdaptionProtocol.class, this);
    }

    public final void ep() {
        Context context;
        Context context2 = getContext();
        boolean z = (context2 != null ? C497820Jfg.LIZ(context2) : 0) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(740));
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLJLILLLLZIIL.getValue();
        int iKA2 = iScreenComponentAbility != null ? iScreenComponentAbility.KA2() : 0;
        IScreenComponentAbility iScreenComponentAbility2 = (IScreenComponentAbility) this.LLJLILLLLZIIL.getValue();
        int iWN0 = iScreenComponentAbility2 != null ? iScreenComponentAbility2.wN0() : 0;
        int iLIZJ = (iKA2 > 0 || (context = getContext()) == null) ? 0 : C497820Jfg.LIZJ(context);
        int iLIZIZ = iWN0 <= 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))) : 0;
        if (z) {
            RadiusLayout radiusLayoutIp = ip();
            ViewGroup.LayoutParams layoutParams = radiusLayoutIp.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = iLIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(58.0d))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            C786410Ut5.W5(radiusLayoutIp, marginLayoutParams);
            View view = (View) this.LLJL.getValue();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)) + iLIZIZ;
            C786410Ut5.W5(view, marginLayoutParams2);
        } else {
            RadiusLayout radiusLayoutIp2 = ip();
            ViewGroup.LayoutParams layoutParams3 = radiusLayoutIp2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = iLIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(58.0d))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
            C786410Ut5.W5(radiusLayoutIp2, marginLayoutParams3);
            View view2 = (View) this.LLJL.getValue();
            ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)) + iLIZIZ;
            C786410Ut5.W5(view2, marginLayoutParams4);
        }
        View view3 = (View) this.LLJJL.getValue();
        ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + iLIZIZ;
        C786410Ut5.W5(view3, marginLayoutParams5);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), LemonAdaptionProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    public final void lp(Context context) {
        C1052320dUU.LIZ.getClass();
        C1052320dUU.LIZIZ = false;
        C844470XAv.LIZ.getClass();
        if (C786960Uty.LIZ(C844470XAv.LIZ())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tiktok_fyp_card_");
            String str = hp().userGroup;
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Intent intent = new Intent();
            intent.setClassName("com.bd.nproject", "com.bytedance.nproject.router.impl.ui.RouteActivity");
            intent.setFlags(268435456);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("snssdk2657://main?pid=");
            sbLIZ2.append(strLIZIZ);
            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)));
            Context contextLIZ = C844470XAv.LIZ();
            try {
                if (intent.resolveActivity(contextLIZ.getPackageManager()) != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, contextLIZ);
                    C2204961BRm.LJJJJJL(contextLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatbpDAkifosf4zHkDn7zC9OjxZycqvoA==", null));
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        String str2 = hp().jumpLink;
        if (C123100dR.LIZ(str2) && str2 != null) {
            SmartRouter.buildRoute(context, str2).open();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ep();
        ((View) this.LLJL.getValue()).setTag(R.id.ekt, Boolean.TRUE);
        C786410Ut5.I7(new AbS697S0100000_16(this, 0), (View) this.LLJL.getValue());
        C786410Ut5.I7(new AbS697S0100000_16(this, 1), (View) this.LLJLIL.getValue());
        C786410Ut5.I7(new AbS697S0100000_16(this, 2), ip());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        List<String> urlList;
        UrlModel urlModel = hp().image;
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlList));
        c1331670kl3LJIIJ.LIZLLL("lemon_guide");
        c1331670kl3LJIIJ.LJIILJJIL = 0;
        c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIJ.LJJ(kp());
        c1331670kl3LJIIJ.LJIIJ(this);
        ((TextView) this.LLJL.getValue()).setText(hp().buttonTextNegative);
        ((TextView) this.LLJLIL.getValue()).setText(hp().buttonTextPositive);
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIntermediateImageSet, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", image info: ");
        if (c428600GrK != null) {
            string = c428600GrK.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        if (!this.LLJJIII) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, kp());
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComplete, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", image info: ");
        if (c428600GrK != null) {
            string = c428600GrK.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLJJIII) {
            return;
        }
        HandlerHook.viewPost(LJJIJL(), new ARunnableS85S0200000_16(this, c428600GrK, 15));
    }
}
