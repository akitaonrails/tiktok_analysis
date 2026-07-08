package com.ss.android.ugc.aweme.ecommerce.mall;

import X.AbstractC1767850w6Z;
import X.C01GW;
import X.C098200Yq;
import X.C0CAU;
import X.C0QSJ;
import X.C1058560deY;
import X.C1388190mED;
import X.C1537820q7Y;
import X.C1565720qqY;
import X.C1565920qqs;
import X.C1581510rG1;
import X.C1583120rIc;
import X.C1772260wDg;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C296200BjG;
import X.C300440Bq6;
import X.C343710Ddh;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C7879035x;
import X.C960203pA;
import X.EnumC1570580qyO;
import X.EnumC1571190qzN;
import X.EnumC1583970rJz;
import X.InterfaceC665370Q7z;
import Y.ARunnableS93S0200000_24;
import Y.ATListenerS438S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallTouchDownPreconnectConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class ShopTopTabProtocol extends TopTabProtocol {
    public Context LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;
    public EnumC1571190qzN LLIZLLLIL;
    public EnumC1571190qzN LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;
    public final String LLJILJIL;
    public final int LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final String LLJJI;
    public final EnumC1570580qyO LLJJIII;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        final String str = this.LLJJI;
        return new C1583120rIc(str) { // from class: X.0rI4
            public final String LIZJ;

            {
                this.LIZJ = str;
            }

            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, final C1584440rKk c1584440rKk) throws JSONException {
                C1767950w6j c1767950w6j = C1767950w6j.LIZ;
                String str2 = this.LIZJ;
                c1767950w6j.getClass();
                C1767950w6j.LJJI(str2);
                final View viewLIZJ = C20673215v0.LIZJ(R.layout.ayn, C1388190mED.LIZ(c1584440rKk.LIZ));
                final TextView textView = (TextView) viewLIZJ.findViewById(android.R.id.text1);
                if (C1388190mED.LIZIZ(c1584440rKk.LIZ) != null) {
                    EcMixMallTouchDownPreconnectConfig.LIZ.getClass();
                    if (((EcMixMallTouchDownPreconnectConfig.EcMixMallTouchDownPreconnectConfigModel) EcMixMallTouchDownPreconnectConfig.LIZJ.getValue()).enableTopTabTouchDown) {
                        viewLIZJ.setOnTouchListener(new ATListenerS438S0100000_4(2));
                    }
                }
                return new InterfaceC1583070rIX() { // from class: X.0rI7
                    @Override // X.InterfaceC1583070rIX
                    public final float getTextWidth() {
                        TextPaint paint;
                        TextView textView2 = textView;
                        if (textView2 == null || (paint = textView2.getPaint()) == null) {
                            return 0.0f;
                        }
                        return paint.measureText(c1584440rKk.LIZJ);
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final int LIZ() {
                        return getView().getWidth();
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final View getView() {
                        return viewLIZJ;
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final void setText(String str3) {
                        TextView textView2 = textView;
                        if (textView2 != null) {
                            textView2.setText(str3);
                        }
                    }
                };
            }
        };
    }

    public final InterfaceC665370Q7z LJIILLIIL() {
        return (InterfaceC665370Q7z) this.LLJI.getValue();
    }

    public final boolean LJIIZILJ() {
        C19EG c19egLIZIZ;
        Context context = this.LLILZIL;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            return Intrinsics.LJFF("HOME", C343710Ddh.LIZ(c19egLIZIZ).CQ2()) && Hox.LLJILJIL.LIZ(c19egLIZIZ).KQ2("Shop");
        }
        "activity is null".toString();
        throw new IllegalArgumentException("activity is null");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return (Class) this.LLJILLL.getValue();
    }

    public ShopTopTabProtocol() {
        EnumC1571190qzN enumC1571190qzN = EnumC1571190qzN.LIGHT;
        this.LLIZLLLIL = enumC1571190qzN;
        this.LLJ = enumC1571190qzN;
        this.LLJI = C452501pT.LIZIZ(new C1565720qqY(this));
        this.LLJILJIL = "Shop";
        this.LLJILJILJ = 42;
        this.LLJILLL = C452501pT.LIZIZ(new C1565920qqs());
        this.LLJJ = C452501pT.LIZIZ(new C1772260wDg(this));
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLJJI = "homepage_mall";
        this.LLJJIII = EnumC1570580qyO.SHOP;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() throws JSONException {
        MainBusinessAbility mainBusinessAbilityLIZJ;
        C19EG c19egLIZIZ;
        Intent intent;
        C19EG c19egLIZIZ2;
        Intent intent2;
        if (!LJIIZILJ()) {
            boolean z = true;
            this.LLILZLL = true;
            if (C296200BjG.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(LJIILLIIL(), MainActivityScope.class);
                Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MainBusinessAbility.class) : null;
                if (!(ability instanceof MainBusinessAbility)) {
                    ability = null;
                }
                mainBusinessAbilityLIZJ = (MainBusinessAbility) ability;
            } else {
                mainBusinessAbilityLIZJ = C1058560deY.LIZJ(LJIILLIIL());
            }
            String strUP1 = mainBusinessAbilityLIZJ != null ? mainBusinessAbilityLIZJ.uP1() : null;
            this.LLIZ = strUP1;
            Context context = this.LLILZIL;
            if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (intent = c19egLIZIZ.getIntent()) == null || intent.getIntExtra("extra_shop_tab_mock_click", -1) != 1) {
                z = false;
            } else {
                Context context2 = this.LLILZIL;
                if (context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null && (intent2 = c19egLIZIZ2.getIntent()) != null) {
                    intent2.removeExtra("extra_shop_tab_mock_click");
                }
            }
            ((AbstractC1767850w6Z) this.LLJJ.getValue()).LIZIZ(strUP1, false, z);
            return;
        }
        if (C300440Bq6.LIZ()) {
            return;
        }
        if (C7879035x.LIZLLL()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tab_clicked_time", String.valueOf(System.currentTimeMillis()));
            jSONObject.put("ec_mall_top_tab_click", jSONObject2);
            C1537820q7Y.LIZ("ec_mall_data_for_lynx", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("tab_clicked_time", String.valueOf(System.currentTimeMillis()));
            jSONObject3.put("ec_mall_top_tab_click", jSONObject4);
            C1537820q7Y.LIZ("ec_mall_data_for_lynx", jSONObject3);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1571190qzN LJIIL() {
        if (!C1581510rG1.LIZLLL()) {
            return this.LLIZLLLIL;
        }
        Context context = this.LLILZIL;
        return (context == null || !C960203pA.LIZIZ(context)) ? this.LLIZLLLIL : EnumC1571190qzN.DARK;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTopTab();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).hitTopTabExpExperiment();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1570580qyO LJFF() {
        return this.LLJJIII;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLJILJILJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1571190qzN LJIIJJI() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLJJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        this.LLILZIL = context;
        C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS93S0200000_24(context, this, 5));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        return context.getResources().getString(2131833076);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        MainBusinessAbility mainBusinessAbilityLIZJ;
        Object ability;
        if (this.LLILZLL) {
            this.LLILZLL = false;
            return;
        }
        String strUP1 = null;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(LJIILLIIL(), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(MainBusinessAbility.class);
            } else {
                ability = null;
            }
            if (!(ability instanceof MainBusinessAbility)) {
                ability = null;
            }
            mainBusinessAbilityLIZJ = (MainBusinessAbility) ability;
        } else {
            mainBusinessAbilityLIZJ = C1058560deY.LIZJ(LJIILLIIL());
        }
        if (mainBusinessAbilityLIZJ != null) {
            strUP1 = mainBusinessAbilityLIZJ.uP1();
        }
        this.LLIZ = strUP1;
        ((AbstractC1767850w6Z) this.LLJJ.getValue()).LIZIZ(strUP1, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb A[Catch: all -> 0x00e6, PHI: r2
      0x00bb: PHI (r2v4 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v6 boolean) binds: [B:53:0x008d, B:55:0x0095, B:57:0x00a1, B:64:0x00b9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00e6, blocks: (B:52:0x008b, B:54:0x008f, B:56:0x0097, B:58:0x00a3, B:70:0x00d0, B:72:0x00da, B:74:0x00de, B:65:0x00bb, B:67:0x00c4, B:69:0x00cd), top: B:83:0x008b }] */
    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C1591640rWM r8, X.C1591550rWD r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.ShopTopTabProtocol.LJIILIIL(X.0rWM, X.0rWD):void");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIILJJIL(EnumC1571190qzN enumC1571190qzN, EnumC1571190qzN enumC1571190qzN2) {
        if (enumC1571190qzN != null) {
            this.LLIZLLLIL = enumC1571190qzN;
        }
        if (enumC1571190qzN2 != null) {
            this.LLJ = enumC1571190qzN2;
        }
    }
}
