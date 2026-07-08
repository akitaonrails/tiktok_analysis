package com.ss.android.ugc.aweme.prop.fragment;

import X.AnonymousClass1991;
import X.AnonymousClass1993;
import X.C098200Yq;
import X.C0CHQ;
import X.C0QFS;
import X.C1202330hOR;
import X.C1202340hOS;
import X.C1361400lX0;
import X.C1395980mQm;
import X.C1399730mWp;
import X.C1399920mX8;
import X.C1457570o27;
import X.C1685300txQ;
import X.C1800490wxD;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AF0;
import X.C2211631BhB;
import X.C294780Bgy;
import X.C488650JEh;
import X.C755440TkE;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1399520mWU;
import X.InterfaceC1457290o1f;
import X.InterfaceC1581830rGX;
import X.InterfaceC1670800ta2;
import X.InterfaceC1740760vOs;
import X.InterfaceC214897198d;
import X.InterfaceC21659319pf;
import X.InterfaceC2269341Ds4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class StickerPropDetailRootFragment extends SAFTikTokFragment implements InterfaceC1581830rGX, InterfaceC1740760vOs, C0QFS, InterfaceC21659319pf {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjctLiHELIOSI2JjFiGjs6Ky4pOx8hJzUILDsyISkeJiAnDjctLiI2JjE=";

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b1030";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "prop_page";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public StickerPropDetailRootFragment() {
        aS(new AwS600S0100000_21(this, 164));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void YP() {
        InterfaceC214897198d interfaceC214897198d;
        AnonymousClass1993 anonymousClass1993;
        C1202330hOR c1202330hOR;
        BaseActivity baseActivity;
        C1361400lX0 c1361400lX0;
        if (ib() != null) {
            super.YP();
            return;
        }
        InterfaceC1670800ta2 activity = getActivity();
        if (C294780Bgy.LIZ()) {
            if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null) {
                return;
            }
        } else if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null || !interfaceC214897198d.getEnableSAF()) {
            return;
        }
        if (interfaceC214897198d.migrateDarkModeImplToFragment()) {
            C19EG activity2 = getActivity();
            if (!(activity2 instanceof BaseActivity) || (baseActivity = (BaseActivity) activity2) == null) {
                return;
            }
            C755440TkE.LIZ(baseActivity);
            if (C960203pA.LIZIZ(baseActivity) && baseActivity.isDarkModeSupported()) {
                SAFFragmentRootScene sAFFragmentRootSceneIb = ib();
                Context sceneContext = sAFFragmentRootSceneIb != null ? sAFFragmentRootSceneIb.getSceneContext() : null;
                if ((sceneContext instanceof C488650JEh) && (c1361400lX0 = (C1361400lX0) sceneContext) != null) {
                    c1361400lX0.setTheme(R.style.y0);
                }
            }
        }
        if (interfaceC214897198d.migrateImmersiveBarImplToFragment()) {
            AnonymousClass1991 anonymousClass1991LIZIZ = C1800490wxD.LIZIZ(this);
            if (!(anonymousClass1991LIZIZ instanceof AnonymousClass1993) || (anonymousClass1993 = (AnonymousClass1993) anonymousClass1991LIZIZ) == null || (c1202330hOR = anonymousClass1993.LJIL) == null || !(!c1202330hOR.LIZIZ)) {
                return;
            }
            C1202340hOS.LIZJ(C1202340hOS.LIZ(this, c1202330hOR, true, false), c1202330hOR);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() {
        SAFTikTokFragment sAFTikTokFragmentLIZIZ = C1399730mWp.LIZIZ(this);
        if (sAFTikTokFragmentLIZIZ != null) {
            sAFTikTokFragmentLIZIZ.finish();
        } else {
            super.finish();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        SAFTikTokFragment sAFTikTokFragmentLIZIZ = C1399730mWp.LIZIZ(this);
        return sAFTikTokFragmentLIZIZ != null ? sAFTikTokFragmentLIZIZ.onBackPressed() : super.onBackPressed();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2211631BhB.LJIIL(this, requireActivity());
    }

    @Override // X.InterfaceC21659319pf
    public final View uN() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R.id.u30);
        }
        return null;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String currentUserID;
        String string;
        InterfaceC1457290o1f accountService;
        super.onCreate(bundle);
        aS(new AwS600S0100000_21(this, 165));
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = null;
        IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
        if (iEffectCreatorService != null) {
            InterfaceC1399520mWU interfaceC1399520mWULJ = iEffectCreatorService.LJ();
            InterfaceC2269341Ds4 interfaceC2269341Ds4LIZ = C0CHQ.LIZ();
            String string2 = null;
            if (interfaceC2269341Ds4LIZ != null && (accountService = interfaceC2269341Ds4LIZ.getAccountService()) != null) {
                currentUserID = accountService.getCurrentUserID();
            } else {
                currentUserID = null;
            }
            InterfaceC2269341Ds4 interfaceC2269341Ds4LIZ2 = C0CHQ.LIZ();
            if (interfaceC2269341Ds4LIZ2 != null && interfaceC2269341Ds4LIZ2.getApplicationService() != null) {
                strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            }
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("extra_previous_page")) != null && string.length() > 0) {
                string2 = string;
            } else {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    string2 = arguments2.getString("enter_from");
                }
            }
            interfaceC1399520mWULJ.LIZ(currentUserID, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, string2, "effect_detail");
        }
        BaseViewModel baseViewModel = (BaseViewModel) new ViewModelProvider(this).get(BaseFragmentViewModel.class);
        baseViewModel.Dw2(AFwS209S0000000_21.get$arr$(306));
        baseViewModel.Dw2(AFwS209S0000000_21.get$arr$(307));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isAdded()) {
            return Boolean.FALSE;
        }
        if (i == 24 || i == 25) {
            C1457570o27.LIZ(i, "", "prop_page", "entrance");
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Intent intent = new Intent();
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent.putExtras(arguments);
        }
        C1395980mQm.LIZ.getClass();
        ArrayList arrayListLIZ = C1395980mQm.LIZ(intent);
        if (arrayListLIZ != null && !arrayListLIZ.isEmpty()) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                C786410Ut5.LJJJIL(arguments2, "extra_stickers", arrayListLIZ);
            }
            getChildFragmentManager().LJZL(new C1399920mX8(intent), false);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.eqx, new StickerPropDetailFragment(), "sticker_prop_detail_fragment_tag");
            c19ehLJIIJ.LJIIIZ();
            C2211631BhB.LJIIL(this, requireActivity());
            return;
        }
        C1AF0.LIZJ("No Prop id provided");
        finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.kd, viewGroup, false);
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

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        if (i == 10086 && i2 == -1) {
            SAFTikTokFragment sAFTikTokFragmentLIZIZ = C1399730mWp.LIZIZ(this);
            if (sAFTikTokFragmentLIZIZ == null) {
                sAFTikTokFragmentLIZIZ = this;
            }
            C1399730mWp.LIZ(sAFTikTokFragmentLIZIZ, intent);
            finish();
            return true;
        }
        return super.onResult(i, i2, intent);
    }
}
