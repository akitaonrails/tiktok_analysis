package com.bytedance.pipo.stellar.base.page;

import X.AbstractC2201008jo;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12ES;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1716280ulO;
import X.C1719440uqU;
import X.C1719840ur8;
import X.C1720030urR;
import X.C1720080urW;
import X.C1720100urY;
import X.C1720250urn;
import X.C1720710usX;
import X.C1720720usY;
import X.C1720760usc;
import X.C1721300utU;
import X.C1749280vcc;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2187701Ajg;
import X.C2200508jj;
import X.C2200608jk;
import X.C2200808jm;
import X.C2217381BqS;
import X.C426750GoL;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1720110urZ;
import X.EnumC1720740usa;
import X.EnumC452301pR;
import X.InterfaceC1720050urT;
import X.InterfaceC1720700usW;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem;
import com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageViewModel;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.prop.DialogContentDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.stellar.base.model.prop.ToastContentDO;
import com.bytedance.pipo.stellar.base.page.StellarPageAssem;
import com.bytedance.pipo.stellar.base.page.StellarPageViewModel;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.reflect.TypeToken;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarPageAssem extends DynamicPageAssem<C1720030urR> implements InterfaceC1720050urT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723580SZw(this, C1719840ur8.class, "pipo_stellar_page_args"), checkSupervisorPrepared());
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 56));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 58));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 55));
    public final AssemVMLazy LLJJI;
    public C1720710usX LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final long LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StellarPageAssem.class, "vm", "getVm()Lcom/bytedance/pipo/stellar/base/page/StellarPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StellarPageAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StellarPageViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 57), AFwS268S0000000_26.get$arr$(35), null, true);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJIJIIJIL = C452501pT.LIZ(enumC452301pR, AFwS215S0000000_26.get$arr$(18));
        this.LLJJIJIL = C452501pT.LIZ(enumC452301pR, new AwS570S0100000_26(this, 48));
        this.LLJJJ = System.currentTimeMillis();
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 49));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final C1720760usc Ka1() {
        return (C1720760usc) this.LLJJJIL.getValue();
    }

    public final C1749280vcc So() {
        return (C1749280vcc) this.LLJILLL.getValue();
    }

    public final C1719840ur8 Vo() {
        return (C1719840ur8) this.LLJILJIL.getValue();
    }

    public final StellarPageViewModel Zo() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (StellarPageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final DynamicPageViewModel Jo() {
        return Zo();
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final void Lo() {
        C1720720usY.LIZIZ(Ho(), (C1720760usc) this.LLJJJIL.getValue(), EnumC1720740usa.POWER_LIST, (InterfaceC1720700usW) this.LLJJIJIL.getValue(), false, 8);
        ViewOnAttachStateChangeListenerC20604515jv powerList = Ho().getPowerList();
        if (powerList != null) {
            this.LLJJIII = new C1720710usX(powerList, (InterfaceC1720700usW) this.LLJJIJIL.getValue());
        }
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final void No() {
        Unit unit;
        Ho().LIZJ();
        try {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            ViewTreeObserver viewTreeObserver = Ho().getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0ur7
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        C1719840ur8 c1719840ur8;
                        String str;
                        String str2;
                        Integer num;
                        Long l;
                        Map mapZQ2;
                        CardDO cardDO;
                        Integer num2;
                        ViewTreeObserver viewTreeObserver2 = this.LL.Ho().getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeOnGlobalLayoutListener(this);
                            C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                        }
                        C1719840ur8 c1719840ur8Vo = this.LL.Vo();
                        if (c1719840ur8Vo == null || (num2 = c1719840ur8Vo.LLJJ) == null || num2.intValue() != 0) {
                            String pageId = BtmSDK.INSTANCE.getPageId(PageFinder.via(C724240Sb0.LJI(this.LL)));
                            StellarPageViewModel stellarPageViewModelZo = this.LL.Zo();
                            stellarPageViewModelZo.LLILLL.LJ(null, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), stellarPageViewModelZo.LLIZ, pageId);
                        }
                        StellarPageViewModel stellarPageViewModelZo2 = this.LL.Zo();
                        if (stellarPageViewModelZo2.LLJIJIL) {
                            stellarPageViewModelZo2.LLJIJIL = false;
                            StellarChunk stellarChunk = stellarPageViewModelZo2.LLILLJJLI;
                            if ((stellarChunk == null || (cardDO = stellarChunk.errorComponent) == null || !StellarPageViewModel.yQ2(cardDO)) && (c1719840ur8 = stellarPageViewModelZo2.LL) != null && (str = c1719840ur8.LLIZ) != null && (str2 = c1719840ur8.LLIZLLLIL) != null && (num = c1719840ur8.LLJJIII) != null && num.intValue() == 1 && (l = c1719840ur8.LLJJIJI) != null) {
                                long jLongValue = l.longValue();
                                Integer num3 = c1719840ur8.LLJJIJIIJIL;
                                if (num3 != null) {
                                    int iIntValue = num3.intValue();
                                    if (jLongValue >= 0 && (mapZQ2 = StellarPageViewModel.zQ2(c1719840ur8.LLJJIJIL)) != null) {
                                        ArrayList arrayList = new ArrayList();
                                        try {
                                            Type type = new TypeToken<List<String>>() { // from class: X.04Yv
                                            }.getType();
                                            C1227904rF c1227904rF = C1227904rF.LIZ;
                                            String strDecode = Uri.decode(String.valueOf(mapZQ2.get("section_id")));
                                            strDecode.toString();
                                            c1227904rF.getClass();
                                            C189200o6.m2constructorimpl(Boolean.valueOf(arrayList.addAll((List) C1227904rF.LIZJ(strDecode, type))));
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C189200o6.m2constructorimpl(new C098200Yq(th));
                                        }
                                        C07ZN c07zn = new C07ZN(iIntValue, jLongValue, arrayList, mapZQ2);
                                        AnonymousClass0956 anonymousClass0956 = stellarPageViewModelZo2.LLJ;
                                        if (anonymousClass0956 != null) {
                                            anonymousClass0956.LIZIZ(null);
                                        }
                                        stellarPageViewModelZo2.LLJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stellarPageViewModelZo2), C0PEM.LIZJ, null, new C1719810ur5(c07zn, stellarPageViewModelZo2, str, str2, null), 2);
                                    }
                                }
                            }
                        }
                        StellarPageAssem stellarPageAssem = this.LL;
                        if (stellarPageAssem.LLJJIJI) {
                            return;
                        }
                        stellarPageAssem.LLJJIJI = true;
                        C1222130huN c1222130huN = C1222130huN.LIZ;
                        C1719840ur8 c1719840ur8Vo2 = stellarPageAssem.Vo();
                        String str3 = c1719840ur8Vo2 != null ? c1719840ur8Vo2.LLJILJIL : null;
                        c1222130huN.getClass();
                        C1222130huN.LIZIZ("STELLAR_EVENT_PAGE_RENDER_COMPLETED", str3, null);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final void onRenderStart() {
        try {
            Zo().BQ2();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        Integer num;
        super.onStop();
        C1719840ur8 c1719840ur8Vo = Vo();
        if (c1719840ur8Vo == null || (num = c1719840ur8Vo.LLJJ) == null || num.intValue() != 0) {
            Vo();
            Zo().DQ2(System.currentTimeMillis() - this.LLJJJ, "close");
        }
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final InterfaceC1720700usW Go() {
        return this.LLJJIII;
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final void Oo(StellarActionDO stellarActionDO) {
        AbstractC2201008jo abstractC2201008joLIZIZ = C1720100urY.LIZIZ(stellarActionDO);
        if (abstractC2201008joLIZIZ == null) {
            return;
        }
        ap(abstractC2201008joLIZIZ, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        C426750GoL.LJIIIZ((View) this.LLJJ.getValue(), null, Integer.valueOf(C12ES.LJIIJJI(C724240Sb0.LIZ(this))), null, null, false, 29);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        C1719840ur8 c1719840ur8Vo = Vo();
        if (c1719840ur8Vo == null || (str = c1719840ur8Vo.LLJIJIL) == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1623));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        tuxNavBar.setNavActions(c0om1);
        C736680Sv4.LJIIIZ(this, Zo(), new C2217381BqS() { // from class: X.0urM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720030urR) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0urO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720030urR) obj).LLILLJJLI;
            }
        }, null, new AwS675S0100000_26(this, 50), 12);
        So().setLayoutVariant(2);
        Zo().CQ2(Vo());
        Zo().wQ2(null);
    }

    public final void ap(AbstractC2201008jo abstractC2201008jo, C1720250urn c1720250urn) {
        String str;
        String str2;
        Fragment fragmentLJI;
        Fragment fragmentLJI2;
        C19EG activity;
        OnBackPressedDispatcher onBackPressedDispatcher;
        String str3;
        Fragment fragmentLJI3;
        C19EG activity2;
        C19EG activity3;
        String string;
        Map<String, Object> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1720250urn != null && (map = c1720250urn.LIZIZ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        String str4 = (String) linkedHashMap.get("track_btm_id");
        String str5 = null;
        if (str4 == null) {
            str4 = null;
        }
        String str6 = "";
        if (str4 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str4, PageFinder.via(C724240Sb0.LJI(this)), null, 4, null).entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                linkedHashMap2.put(key, string);
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        if (c1720250urn != null) {
            str = c1720250urn.LIZJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "button")) {
            str2 = "pipo_button_click";
        } else {
            str2 = "pipo_card_click";
        }
        C1716280ulO c1716280ulO = Zo().LLILLL;
        c1716280ulO.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("event_type", "click");
        linkedHashMap3.putAll(linkedHashMap);
        c1716280ulO.LIZJ(str2, C2097608Jq.LJIIL(c1716280ulO.LJI, linkedHashMap3));
        if (abstractC2201008jo instanceof C1720080urW) {
            C1720080urW c1720080urW = (C1720080urW) abstractC2201008jo;
            String str7 = c1720080urW.LIZ;
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            String str8 = c1720080urW.LIZLLL;
            if (str8 != null) {
                str6 = str8;
            }
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(str7).buildUpon().appendQueryParameter("source_btm_token", btmSDK.createJumpSourceBtmToken(str6, PageFinder.via(C724240Sb0.LIZ(this)), null));
            C1719840ur8 c1719840ur8Vo = Vo();
            if (c1719840ur8Vo != null) {
                str3 = c1719840ur8Vo.LLILZIL;
            } else {
                str3 = null;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("trace_id", str3);
            C1719840ur8 c1719840ur8Vo2 = Vo();
            if (c1719840ur8Vo2 != null) {
                str5 = c1719840ur8Vo2.LLILLL;
            }
            String string2 = builderAppendQueryParameter2.appendQueryParameter("previous_page_id", str5).build().toString();
            Fragment fragmentLJI4 = C724240Sb0.LJI(this);
            if (fragmentLJI4 != null && (activity3 = fragmentLJI4.getActivity()) != null) {
                C1719440uqU.LIZ(activity3, string2, "stellar");
            }
            Integer num = c1720080urW.LIZJ;
            if (num != null && num.intValue() == 1 && (fragmentLJI3 = C724240Sb0.LJI(this)) != null && (activity2 = fragmentLJI3.getActivity()) != null) {
                activity2.finish();
                return;
            }
            return;
        }
        if (abstractC2201008jo instanceof C2200808jm) {
            if (((C2200808jm) abstractC2201008jo).LIZ != EnumC1720110urZ.PAGE || (fragmentLJI2 = C724240Sb0.LJI(this)) == null || (activity = fragmentLJI2.getActivity()) == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.LJ();
            return;
        }
        if (abstractC2201008jo instanceof C2200608jk) {
            C1721300utU c1721300utU = C1721300utU.LIZ;
            Context context = getContext();
            DialogContentDO dialogContentDO = ((C2200608jk) abstractC2201008jo).LIZ;
            c1721300utU.getClass();
            C1721300utU.LJIIJJI(this, context, dialogContentDO, null);
            return;
        }
        if (!(abstractC2201008jo instanceof C2200508jj) || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        C1721300utU c1721300utU2 = C1721300utU.LIZ;
        ToastContentDO toastContentDO = ((C2200508jj) abstractC2201008jo).LIZ;
        c1721300utU2.getClass();
        C1721300utU.LJIIL(fragmentLJI, toastContentDO);
    }

    @Override // X.InterfaceC1720050urT
    public final void bL(StellarActionDO stellarActionDO, C1720250urn c1720250urn, Fragment fragment) {
        C1720100urY.LIZ(stellarActionDO.eventUrl);
        AbstractC2201008jo abstractC2201008joLIZIZ = C1720100urY.LIZIZ(stellarActionDO);
        if (abstractC2201008joLIZIZ == null) {
            return;
        }
        ap(abstractC2201008joLIZIZ, c1720250urn);
    }
}
