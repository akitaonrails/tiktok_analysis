package com.bytedance.android.livesdk.comp.impl.subscription.legacy;

import X.C098200Yq;
import X.C0JT9;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C1871910yoP;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C262100zr;
import X.C492400JSs;
import X.C495520Jby;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeInfoListFragment extends BaseFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjHELIOSYvOyYjPCwjJ2E/LSItKjZ9GzAuOiwhIScpACE1JwklOjsVOiQrJCo9PA==";
    public String LL = "";

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1548820qPI.LJIIIIZZ("open_native_subscription_settings", this);
        super.onDestroy();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        List<Fragment> listLJJLIIIJL;
        FragmentManager fragmentManager;
        C19EH c19ehLJIIJ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "open_native_subscription_settings")) {
            IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "type", "");
            } else {
                strLJFF = null;
            }
            boolean z = false;
            if (Intrinsics.LJFF(strLJFF, "popup")) {
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).xf();
                PreviewSubscriptionSettingDialog previewSubscriptionSettingDialogLIZIZ = C0JT9.LIZIZ(0, "live_take_page", null);
                FragmentManager fragmentManager2 = getFragmentManager();
                if (fragmentManager2 != null && (listLJJLIIIJL = fragmentManager2.LJJLIIIJL()) != null) {
                    for (Fragment fragment : listLJJLIIIJL) {
                        if (fragment instanceof PreviewSubscriptionSettingDialog) {
                            if (!((LiveDialogFragment) fragment).isShowing() && (fragmentManager = getFragmentManager()) != null && (c19ehLJIIJ = fragmentManager.LJIIJ()) != null) {
                                c19ehLJIIJ.LJJIFFI(fragment);
                                c19ehLJIIJ.LJIIJ();
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
                FragmentManager fragmentManager3 = getFragmentManager();
                if (fragmentManager3 != null) {
                    C492400JSs.LIZ(previewSubscriptionSettingDialogLIZIZ, fragmentManager3, "");
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(strLJFF, "fullscreen")) {
                C19EG activity = getActivity();
                if (activity != null && iHostSubscription != null) {
                    iHostSubscription.EB0(activity.getBaseContext(), 0, "creator_tools_page");
                    return;
                }
                return;
            }
            C19EG activity2 = getActivity();
            if (activity2 != null && iHostSubscription != null) {
                iHostSubscription.EB0(activity2.getBaseContext(), 0, "creator_tools_page");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LL = arguments.getString("enter_from");
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1548820qPI.LIZLLL("open_native_subscription_settings", this);
        C495520Jby c495520Jby = new C495520Jby(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_list());
        c495520Jby.LIZJ("show_entrance", this.LL);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.glw, viewGroup, false);
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
