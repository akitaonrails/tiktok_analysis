package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard;

import X.C01GW;
import X.C020C;
import X.C0QB6;
import X.C0R12;
import X.C0R45;
import X.C1558520qew;
import X.C21565319aV;
import X.C2188811AlT;
import X.C452501pT;
import X.C654810PmJ;
import X.C656490Pp1;
import X.C657990PrR;
import X.C691880RBy;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC656500Pp2;
import X.EnumC658110Prd;
import X.EnumC658120Pre;
import X.InterfaceC1587906Jp;
import X.InterfaceC656520Pp4;
import X.InterfaceC656550Pp7;
import X.InterfaceC712990Rxx;
import Y.ACListenerS114S0200000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdTopLiveSingleCardAssem extends ReusedUISlotAssem<SearchAdTopVideoSingleCardAssem> implements InterfaceC712990Rxx<C654810PmJ> {
    public InterfaceC656520Pp4 LLJLILLLLZIIL;
    public C654810PmJ LLJLLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 703));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 704));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 705));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(308));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eta;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC656520Pp4 interfaceC656520Pp4 = this.LLJLILLLLZIIL;
        if (interfaceC656520Pp4 != null) {
            interfaceC656520Pp4.onDestroy();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        InterfaceC656520Pp4 interfaceC656520Pp4 = this.LLJLILLLLZIIL;
        if (interfaceC656520Pp4 != null) {
            interfaceC656520Pp4.onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 56));
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 22));
        HandlerHook.viewPost(view, new ARunnableS79S0200000_10(this, this, 33));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C654810PmJ c654810PmJ) {
        InterfaceC656520Pp4 interfaceC656520Pp4;
        Object obj;
        int value;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        final C654810PmJ c654810PmJ2 = c654810PmJ;
        this.LLJLLIL = c654810PmJ2;
        InterfaceC656550Pp7 interfaceC656550Pp7LJJII = C0R12.LIZIZ.LJJII(c654810PmJ2.LLILZLL, getContext(), EnumC658110Prd.TOP_SINGLE_CARD_LIVE);
        ViewGroup viewGroup = null;
        if (interfaceC656550Pp7LJJII instanceof InterfaceC656520Pp4) {
            interfaceC656520Pp4 = (InterfaceC656520Pp4) interfaceC656550Pp7LJJII;
        } else {
            interfaceC656520Pp4 = null;
        }
        this.LLJLILLLLZIIL = interfaceC656520Pp4;
        if (interfaceC656520Pp4 != null) {
            interfaceC656520Pp4.LIZJ(new C0QB6() { // from class: X.0Pp5
                @Override // X.C0QB6
                public final void LJ(String str) {
                    this.LIZ.op(c654810PmJ2.LLILZLL, str);
                }
            });
        }
        Aweme aweme2 = c654810PmJ2.LLILZLL;
        if (aweme2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.LLJL.getValue();
            if (viewGroup2 != null) {
                C786410Ut5.K7(viewGroup2, new ACListenerS114S0200000_10(aweme2, this, 9));
            }
            Context context = getContext();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            C654810PmJ c654810PmJ3 = (C654810PmJ) obj;
            if (c654810PmJ3 != null && (aweme = c654810PmJ3.LLILZLL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (num = searchAdInfo.displayType) != null) {
                value = num.intValue();
            } else {
                value = EnumC656500Pp2.VERTICAL.getValue();
            }
            Pair pairLIZIZ = C656490Pp1.LIZIZ(context, value);
            int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLIZIZ.getSecond()).intValue();
            View view = (View) this.LLJL.getValue();
            if (view != null) {
                C657990PrR.LIZJ(view, new C020C(iIntValue, iIntValue2, 0));
            }
            View view2 = (View) this.LLJL.getValue();
            if (view2 != null) {
                C21565319aV.LIZIZ(view2, (Float) this.LLJLL.getValue(), null, null, null, null, 30);
            }
        }
        C656490Pp1.LIZ(c654810PmJ2.LLILZLL, (ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue(), EnumC658120Pre.TOP_SINGLE_CARD);
        InterfaceC656520Pp4 interfaceC656520Pp42 = this.LLJLILLLLZIIL;
        if (interfaceC656520Pp42 != null) {
            interfaceC656520Pp42.bind();
        }
        Context context2 = getContext();
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewLJJIJL;
        }
        C691880RBy.LIZ(context2, viewGroup, c654810PmJ2.LLILZLL.getAwemeRawAd(), true);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C654810PmJ c654810PmJ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C654810PmJ c654810PmJ) {
    }

    public final void op(Aweme aweme, String str) {
        Object obj;
        if (aweme == null) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        AwemeBizExtKt.setSourceBtmToken(((C654810PmJ) obj).LLILZLL, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[enterLive] aweme=");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$NavigateAbility.class, null);
        if (searchServiceCenter$NavigateAbility != null) {
            searchServiceCenter$NavigateAbility.GV0(C1558520qew.LJIIL(this), aweme, null, false, null, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
