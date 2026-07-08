package com.ss.android.ugc.aweme.inbox.followerv2;

import X.C01GW;
import X.C07P9;
import X.C098200Yq;
import X.C09R7;
import X.C0OM1;
import X.C0QSJ;
import X.C0Z3L;
import X.C1246590iXp;
import X.C1250250idj;
import X.C12ES;
import X.C1308910kAL;
import X.C1365870leD;
import X.C1379050lzT;
import X.C13BV;
import X.C13IQ;
import X.C14EU;
import X.C1508630pMT;
import X.C1558520qew;
import X.C1599690rjL;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1749280vcc;
import X.C1767106w1;
import X.C1890620zIa;
import X.C1890720zIk;
import X.C1890750zIn;
import X.C189200o6;
import X.C1901120zZW;
import X.C1901350zZt;
import X.C1901580zaG;
import X.C1902470zbh;
import X.C1902490zbj;
import X.C1902510zbl;
import X.C1902900zcO;
import X.C1904500zey;
import X.C1905930zhH;
import X.C19252910Tv;
import X.C19EG;
import X.C19GS;
import X.C20603715jn;
import X.C20673215v0;
import X.C2095008Iq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C452501pT;
import X.C481090Itn;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1889540zGq;
import X.EnumC1901360zZu;
import X.EnumC1906270zhp;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC1554640qYg;
import X.InterfaceC1889460zGi;
import X.InterfaceC1891350zJl;
import X.InterfaceC1901490za7;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache;
import com.ss.android.ugc.aweme.notification.v2.assem.FollowerFragmentData;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class InboxFollowerFragmentV2 extends AmeBaseFragment implements FollowerPageAbilityCenter$IFollowerFragmentAbility, InterfaceC1901490za7, InterfaceC1206390hUz, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZiMjHELIOSJSM8PyA+P319ASsuJjcVJykgJjg2OgM+KCg+LSs4H30=";
    public C481090Itn LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public C1749280vcc LLILLL;
    public C1749280vcc LLILZ;
    public InboxWidgetContainer LLILZIL;
    public int LLILZLL = Integer.MIN_VALUE;
    public int LLIZ = 21;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 248));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 247));
    public final C01GW LLJI;

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FollowerFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FollowerFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FollowerFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1635867683) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        InterfaceC1889460zGi interfaceC1889460zGi;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
        if (!(interfaceC665370Q7z instanceof InterfaceC1889460zGi) || (interfaceC1889460zGi = (InterfaceC1889460zGi) interfaceC665370Q7z) == null) {
            return;
        }
        interfaceC1889460zGi.LLLILZLLLI();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ifv) : null;
            this.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C481090Itn NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ifx) : null;
            this.LL = (C481090Itn) viewFindViewById;
        }
        return (C481090Itn) viewFindViewById;
    }

    public final C1749280vcc OR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nl7) : null;
            this.LLILZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1749280vcc PR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w0t) : null;
            this.LLILLL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public InboxFollowerFragmentV2() {
        C1901350zZt.LIZ.getClass();
        if (C1901350zZt.LIZJ()) {
            EnumC1901360zZu.LLILZLL.LIZJ();
        }
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 246));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility
    public final void Wv2() {
        C481090Itn c481090ItnNR = NR();
        if (c481090ItnNR != null) {
            HandlerHook.viewPost(c481090ItnNR, new ARunnableS128S0100000_28(this, 35));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FollowerPreCacheManager.FollowNoticeData followNoticeDataLIZIZ;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(R.layout.a94), Integer.valueOf(R.layout.aaj)).iterator();
        while (it2.hasNext()) {
            C20673215v0.LJIIIIZZ(((Number) it2.next()).intValue());
        }
        C1901350zZt.LIZ.getClass();
        C1901350zZt.LIZIZ();
        C1901350zZt.LJ.set(0);
        for (EnumC1901360zZu enumC1901360zZu : EnumC1901360zZu.values()) {
            synchronized (enumC1901360zZu) {
                enumC1901360zZu.LLILLL.LIZ = 0L;
                enumC1901360zZu.LLILLL.LIZIZ = 0L;
                enumC1901360zZu.LLILZ.LIZ = -1;
            }
        }
        C1901350zZt.LIZJ.set(false);
        C1901350zZt.LIZLLL.set(false);
        FollowerPreCacheManager.LIZ.getClass();
        C1901120zZW c1901120zZWLIZIZ = FollowerPreCacheManager.LIZIZ();
        if (c1901120zZWLIZIZ != null && (followNoticeDataLIZIZ = c1901120zZWLIZIZ.LIZIZ()) != null) {
            followNoticeDataLIZIZ.timestamp = System.currentTimeMillis();
        }
        FollowerPreCacheManager.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Object c098200Yq;
        super.onDestroyView();
        C1901580zaG.LIZ.getClass();
        C1901580zaG.LJI().storeLong("last_visit_follower_subpage", Calendar.getInstance().getTimeInMillis() / 1000);
        FollowSortDataCache.LIZ.getClass();
        try {
            Keva kevaLIZIZ = FollowSortDataCache.LIZIZ();
            LinkedHashMap<String, Integer> linkedHashMap = FollowSortDataCache.LIZIZ;
            if (!linkedHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
                    arrayList.add(new FollowSortDataCache.NidCountEntry(entry.getKey(), entry.getValue().intValue()));
                }
                kevaLIZIZ.storeString("inbox_new_follower_expose", JsonParseUtils.LJ(arrayList));
            }
            FollowSortDataCache.LIZIZ.clear();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "storeNidCountMap error", thM5exceptionOrNullimpl);
        }
        C1902490zbj.LIZJ("new_followers");
        if (this.LLIZ == 21) {
            C1902900zcO.LIZ.LIZ();
        }
        if (C1890720zIk.LIZ().enable) {
            C1890620zIa c1890620zIa = (C1890620zIa) this.LLIZLLLIL.getValue();
            c1890620zIa.LJIIIIZZ = 0L;
            c1890620zIa.LJ = C13BV.INSTANCE;
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1904500zey.LJFF.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility
    public final ViewOnAttachStateChangeListenerC20604515jv qp() {
        return MR();
    }

    @Override // X.InterfaceC1901490za7
    public final EnumC1906270zhp wj() {
        return EnumC1906270zhp.NEW_FOLLOWER;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility
    public final int x70() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility
    public final void Mv(InboxWidgetContainer inboxWidgetContainer) {
        this.LLILZIL = inboxWidgetContainer;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Integer numValueOf = Integer.valueOf(R.layout.aaj);
        Iterator it2 = C1697810uHb.LJ(Integer.valueOf(R.layout.a94), numValueOf, numValueOf, numValueOf).iterator();
        while (it2.hasNext()) {
            C20673215v0.LJI(((Number) it2.next()).intValue(), activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int iIntValue;
        String string;
        Integer numLJIIJJI;
        String string2;
        Integer numLJIIJJI2;
        NoticeTabModel noticeTabModel;
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        C1508630pMT.LIZ.getClass();
        C1508630pMT.LIZIZ = SystemClock.uptimeMillis();
        C1558520qew.LJI(this, FollowerFragmentScope.class, this, FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null, null);
        if (this.LLJ.getValue() != null) {
            iIntValue = 22;
        } else {
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("scenario")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 21;
            }
        }
        this.LLIZ = iIntValue;
        C1904500zey.LJFF.getClass();
        C1904500zey.LJI = iIntValue;
        C723850SaN.LIZ(this, false, null, new AwS607S0100000_28(this, 82), 3);
        int iIntValue2 = Integer.MIN_VALUE;
        if (this.LLJ.getValue() != null) {
            FollowerFragmentData followerFragmentData = (FollowerFragmentData) this.LLJ.getValue();
            if (followerFragmentData != null && (noticeTabModel = followerFragmentData.tabInfo) != null) {
                iIntValue2 = noticeTabModel.filterType;
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string2 = arguments2.getString("filter_type")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string2)) != null) {
                iIntValue2 = numLJIIJJI2.intValue();
            } else {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    iIntValue2 = arguments3.getInt("filter_type", Integer.MIN_VALUE);
                }
            }
        }
        this.LLILZLL = iIntValue2;
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b75988", (String) null);
        C1890750zIn c1890750zIn = C1890750zIn.LIZIZ;
        if (C1890720zIk.LIZ().enable) {
            ((C1890620zIa) this.LLIZLLLIL.getValue()).LJFF(c1890750zIn);
        }
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        InterfaceC1889460zGi interfaceC1889460zGi;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
        if ((interfaceC665370Q7z instanceof InterfaceC1889460zGi) && (interfaceC1889460zGi = (InterfaceC1889460zGi) interfaceC665370Q7z) != null) {
            interfaceC1889460zGi.onPageSelected(i);
        }
    }

    @C14EU
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        if (getActivity() != null && getView() != null) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJJIIZ(this, c1365870leD);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        Integer numLIZJ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvMR;
        List<C13IQ<? extends PowerCell<?>>> listFo;
        super.onViewCreated(view, bundle);
        C07P9.LIZ(getActivity());
        C481090Itn c481090ItnNR = NR();
        if (c481090ItnNR != null) {
            c481090ItnNR.setNestedScrollEnabledWhenNonTouch(false);
            c481090ItnNR.setOnRefreshListener(new AwS429S0200000_28(this, c481090ItnNR, 168));
        }
        C481090Itn c481090ItnNR2 = NR();
        if (c481090ItnNR2 != null && (viewOnAttachStateChangeListenerC20604515jvMR = MR()) != null) {
            C1246590iXp.LIZ(viewOnAttachStateChangeListenerC20604515jvMR, c481090ItnNR2);
            viewOnAttachStateChangeListenerC20604515jvMR.addOnScrollListener(new C1379050lzT(viewOnAttachStateChangeListenerC20604515jvMR.getContext()));
            viewOnAttachStateChangeListenerC20604515jvMR.addOnScrollListener(new C1902510zbl(viewOnAttachStateChangeListenerC20604515jvMR.getContext()));
            if (this.LLIZ != 22) {
                viewOnAttachStateChangeListenerC20604515jvMR.addItemDecoration(new C1767106w1(6));
            }
            viewOnAttachStateChangeListenerC20604515jvMR.setClipToPadding(false);
            viewOnAttachStateChangeListenerC20604515jvMR.setPadding(0, 0, 0, (int) C12ES.LIZJ(19.0f, viewOnAttachStateChangeListenerC20604515jvMR.getContext()));
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).LIZIZ(viewOnAttachStateChangeListenerC20604515jvMR, "inbox_follower_page");
            viewOnAttachStateChangeListenerC20604515jvMR.addOnScrollListener(new C1902470zbh("inbox_follower_page"));
            InboxWidgetContainer inboxWidgetContainer = this.LLILZIL;
            if (inboxWidgetContainer != null && (listFo = inboxWidgetContainer.fo()) != null) {
                Iterator<C13IQ<? extends PowerCell<?>>> it2 = listFo.iterator();
                while (it2.hasNext()) {
                    viewOnAttachStateChangeListenerC20604515jvMR.LJIILJJIL(C09R7.LIZ(it2.next()));
                }
            }
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LJI = true;
            viewOnAttachStateChangeListenerC20604515jvMR.setListConfig(c20603715jn);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI() && (arguments = getArguments()) != null && arguments.getBoolean("tablet_create_top_nav")) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131836049);
            IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
            if (iGatekeeperService != null) {
                eligibilityModelLIZ = iGatekeeperService.LIZ("follower_request_transparency");
            } else {
                eligibilityModelLIZ = null;
            }
            C1905930zhH.LIZ.getClass();
            if (C1905930zhH.LIZ(eligibilityModelLIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(getString(2131836049));
                sbLIZ.append(' ');
                c1250250idj.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                c1250250idj.LJFF = R.raw.icon_info_circle;
                c1250250idj.LJI = null;
                c1250250idj.LIZ(new AwS572S0100000_28(eligibilityModelLIZ, 1090));
            }
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
            C0OM1 c0om1 = new C0OM1();
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZLLL = false;
            tuxNavBar.setNavActions(c0om1);
            C786410Ut5.LJLLLLLL(0, tuxNavBar);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                view.setBackgroundColor(iIntValue);
                tuxNavBar.setNavBackground(iIntValue);
                MR().setBackgroundColor(iIntValue);
            }
        }
        C1902490zbj.LIZIZ("new_followers");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility
    public final void zP0(EnumC1889540zGq enumC1889540zGq, List<? extends InterfaceC1891350zJl> list) {
        C2252408s6.LJII(new AwS272S0300000_28(enumC1889540zGq, (EnumC1889540zGq) list, (List<? extends InterfaceC1891350zJl>) this, (InboxFollowerFragmentV2) 1));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Integer numLIZJ;
        View viewLIZ = C0Z3L.LIZ(C786410Ut5.ne(getContext()), R.layout.a94, viewGroup);
        Context context = viewLIZ.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            viewLIZ.setBackgroundColor(numLIZJ.intValue());
        }
        try {
            ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZ, this);
            viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZ;
        }
    }
}
