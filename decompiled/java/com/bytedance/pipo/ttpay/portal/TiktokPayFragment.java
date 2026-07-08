package com.bytedance.pipo.ttpay.portal;

import X.C01GW;
import X.C098200Yq;
import X.C0HG7;
import X.C123100dR;
import X.C1294250jmh;
import X.C1323820kYO;
import X.C1505710pHl;
import X.C1548820qPI;
import X.C1623706Xj;
import X.C1685300txQ;
import X.C16FB;
import X.C1713230ugT;
import X.C1717290un1;
import X.C1719680uqs;
import X.C1776080wJq;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C23250099c;
import X.C259800zU;
import X.C397901gf;
import X.C491001vg;
import X.C786410Ut5;
import X.InterfaceC1292040jj8;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import com.bytedance.pipo.ttpay.ab.TtpayEventModel;
import com.bytedance.pipo.ttpay.ab.TtpayLoadingConfig;
import com.bytedance.pipo.ttpay.portal.TiktokPayFragment;
import com.bytedance.pipo.ttpay.portal.wallet.BalanceCardAdapter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS570S0100000_26;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class TiktokPayFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjE4OS4qZjHELIOSUjOzsyJGsYICQnJy4cKDYVOiQrJCo9PA==";
    public StellarFragment LLIZ;
    public boolean LLJJI;
    public final String LLIZLLLIL = "stellar_fragment_tag";
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(51), "previous_page_id", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(48), "enter_from", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(54), "trace_id", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(52), "session_id", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(50), "host", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(49), "entrance", String.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(53), "source_btm_token", String.class);
    public final C1776080wJq LLJJIII = new C1776080wJq(this, 0);

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1548820qPI.LJIIIIZZ("PA_FREEZE_COMPLETE", this.LLJJIII);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        IPipoService iPipoService;
        View view;
        C16FB c16fb;
        super.onStart();
        StellarFragment stellarFragment = this.LLIZ;
        if (stellarFragment != null && !(stellarFragment.SR().getState().LL instanceof C491001vg) && !(stellarFragment.SR().getState().LL instanceof C1623706Xj) && (view = stellarFragment.getView()) != null && (c16fb = (C16FB) view.findViewById(R.id.w34)) != null) {
            c16fb.LJ();
        }
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        StellarFragment stellarFragment2 = this.LLIZ;
        if (stellarFragment2 != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(stellarFragment2), null, null, new C0HG7(stellarFragment2, new BalanceCardAdapter(), null), 3);
        }
        List<String> list = C1717290un1.LIZ().geckoChannels;
        if (list == null || (iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iPipoService.LIZ("ttpay", "h5", new ArrayList(list));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object c098200Yq;
        super.onCreate(bundle);
        C1505710pHl.LIZ = (String) this.LLJILJIL.getValue();
        C1505710pHl.LIZIZ = (String) this.LLJILJILJ.getValue();
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b3733", (String) this.LLJJ.getValue());
        try {
            List<TtpayEventModel> list = C1717290un1.LIZ().eventsPortalNeedPublish;
            if (list != null) {
                for (TtpayEventModel ttpayEventModel : list) {
                    if (C123100dR.LIZ(ttpayEventModel.eventName) && C123100dR.LIZ(ttpayEventModel.eventParams)) {
                        String str = ttpayEventModel.eventName;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        JSONObject jSONObject = new JSONObject(ttpayEventModel.eventParams);
                        jSONObject.put("entrance", (String) this.LLJILLL.getValue());
                        jSONObject.put("enter_from", (String) this.LLJI.getValue());
                        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), str));
                    }
                }
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("enter_from");
                    String string2 = extras.getString("previous_page_id");
                    String string3 = extras.getString("trace_id");
                    StellarFragment stellarFragment = this.LLIZ;
                    if (stellarFragment != null) {
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(stellarFragment), null, null, new C1713230ugT(stellarFragment, string, string2, string3, "payment_home", null), 3);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        StellarFragment stellarFragment;
        String str;
        long jLongValue;
        super.onViewCreated(view, bundle);
        Fragment fragmentLJJJJZI = getParentFragmentManager().LJJJJZI(this.LLIZLLLIL);
        if (fragmentLJJJJZI instanceof StellarFragment) {
            stellarFragment = (StellarFragment) fragmentLJJJJZI;
        } else {
            stellarFragment = null;
        }
        if (stellarFragment == null) {
            stellarFragment = new StellarFragment();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.w2y, stellarFragment, this.LLIZLLLIL);
            c19ehLJIIJ.LJIIIZ();
        }
        this.LLIZ = stellarFragment;
        stellarFragment.setArguments(new Bundle());
        stellarFragment.LLJJJIL = new C1719680uqs((String) this.LLJILLL.getValue(), (String) this.LLJILJIL.getValue());
        stellarFragment.LLJJJJ = new AwS570S0100000_26(this, 62);
        stellarFragment.LLJILJIL = new AwS427S0200000_26(view, (ViewGroup) view.findViewById(R.id.w2y), 5);
        stellarFragment.LLJJ = AFwS215S0000000_26.get$arr$(22);
        TtpayLoadingConfig ttpayLoadingConfig = C1717290un1.LIZ().loadingConfig;
        if (ttpayLoadingConfig != null && (str = ttpayLoadingConfig.lottieUrl) != null) {
            final C259800zU c259800zU = new C259800zU();
            C1294250jmh.LJIIJJI(getContext(), str).LIZIZ(new InterfaceC1292040jj8() { // from class: X.08oi
                /* JADX WARN: Type inference failed for: r1v3, types: [T, android.view.View] */
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    Unit unit;
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    if (c1294720jnS != null) {
                        TiktokPayFragment tiktokPayFragment = this.LL;
                        View view2 = view;
                        C259800zU<View> c259800zU2 = c259800zU;
                        try {
                            Context context = tiktokPayFragment.getContext();
                            if (context != null) {
                                ?? r1 = (T) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i30, (ViewGroup) view2.findViewById(R.id.w2y), false);
                                C1295960jpS c1295960jpS = (C1295960jpS) r1.findViewById(R.id.nru);
                                if (c1295960jpS != null) {
                                    c1295960jpS.setComposition(c1294720jnS);
                                }
                                c259800zU2.element = r1;
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
                }
            });
            Long l = ttpayLoadingConfig.secondaryLoadingDelayMs;
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 760);
            String str2 = StellarFragment._pnsPageId;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 3000;
            }
            stellarFragment.LLJI = jLongValue;
            stellarFragment.LLJILJILJ = null;
            stellarFragment.LLJILLL = null;
            stellarFragment.LLJIJIL = awS556S0100000_12;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(stellarFragment), null, null, new C1713230ugT(stellarFragment, (String) this.LLJI.getValue(), (String) this.LLJ.getValue(), (String) this.LLJIJIL.getValue(), "payment_home", null), 3);
        C1548820qPI.LIZLLL("PA_FREEZE_COMPLETE", this.LLJJIII);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9v, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
