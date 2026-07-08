package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting;

import X.C01GW;
import X.C0JS1;
import X.C0JTI;
import X.C0JTJ;
import X.C0OM1;
import X.C11GO;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C452501pT;
import X.C492590JTl;
import X.C492600JTm;
import X.C492670JTt;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.EnumC492180JRw;
import X.EnumC492200JRy;
import X.InterfaceC492580JTk;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingFragment;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLivePreviewSettingFragment extends BaseFragment implements C0JTI {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2HELIOSs8LD04O2s/PC08Jik1JSYlLWs/LDsnISsrZxwmKgoiJTYfITMpGT02PiwpPhw2PDElJygVOiQrJCo9PA==";
    public GetSubInfoResponse LLILLJJLI;
    public Function0<Unit> LLILLL;
    public View LLILZLL;
    public boolean LLIZ;
    public String LL = "";
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0JTJ(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C492590JTl(this));

    public final void NR() {
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        C784440Upu.LIZ().LIZIZ(new C0JS1(EnumC492180JRw.SUB_ONLY_LIVE_PREVIEW_PAGE, EnumC492200JRy.CLOSE, null, null, null, null, null, 252));
    }

    @Override // X.C0JTI
    public final boolean onBackPressed() {
        NR();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C127M accessory;
        int i;
        super.onViewCreated(view, bundle);
        view.setClickable(true);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        tuxNavBar.setNavBackground(C497740JfY.LIZLLL(R.attr.zp, tuxNavBar.getContext()));
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new C492600JTm(this));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C497740JfY.LJIJI(2131844239);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        C127K c127k = (C127K) view.findViewById(R.id.axs);
        C500260Jjc.LJLJLJ(c127k, C494680Jac.LIZJ());
        if (c127k != null) {
            c127k.setTitle(C497740JfY.LJIJI(2131844228));
            if (this.LLIZ) {
                i = 2131856621;
            } else {
                i = 2131844223;
            }
            c127k.setSubtitle(C497740JfY.LJIJI(i));
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            C11GO c11go = (C11GO) c127k.getAccessory();
            c11go.LJIILJJIL(C494680Jac.LJFF());
            c11go.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0JTj
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Boolean boolValueOf;
                    String str;
                    C494680Jac.LJIL(z);
                    SubOnlyLivePreviewSettingFragment subOnlyLivePreviewSettingFragment = this.LL;
                    subOnlyLivePreviewSettingFragment.getClass();
                    String str2 = subOnlyLivePreviewSettingFragment.LL;
                    String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    GetSubInfoResponse getSubInfoResponse = subOnlyLivePreviewSettingFragment.LLILLJJLI;
                    if (getSubInfoResponse != null) {
                        boolValueOf = Boolean.valueOf(getSubInfoResponse.initialized);
                    } else {
                        boolValueOf = null;
                    }
                    boolean zLJJIJIIJIL = C500260Jjc.LJJIJIIJIL(boolValueOf);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_preview_allow_click");
                    c474500IjALIZ.LJJII(str2, "show_entrance");
                    c474500IjALIZ.LJJII(str2, "click_position");
                    c474500IjALIZ.LJJII(strValueOf, "anchor_id");
                    c474500IjALIZ.LJJII(Integer.valueOf(!zLJJIJIIJIL ? 1 : 0), "is_opt_in");
                    if (z) {
                        str = "open";
                    } else {
                        str = "close";
                    }
                    c474500IjALIZ.LJJII(str, "click_type");
                    c474500IjALIZ.LIZ();
                }
            });
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            ((InterfaceC492580JTk) this.LLILZIL.getValue()).LIZIZ((C16F5) view.findViewById(R.id.guz), view2, requireActivity(), this.LLIZ);
        }
        if (this.LLIZ) {
            ((InterfaceC492580JTk) this.LLILZIL.getValue()).LIZ((C1324720kZq) view.findViewById(R.id.gcr), (C1324720kZq) view.findViewById(R.id.wj1), (C16F5) view.findViewById(R.id.f04), (C16F5) view.findViewById(R.id.wi7), (C16FS) view.findViewById(R.id.whx));
        } else {
            ((InterfaceC492580JTk) this.LLILZIL.getValue()).LJ((C1324720kZq) view.findViewById(R.id.gcr), (C1324720kZq) view.findViewById(R.id.wj1), (C16F5) view.findViewById(R.id.f04));
        }
        C492670JTt.LIZ(String.valueOf(UserService.getInstance().user().getCurrentUserId()), this.LL, C494680Jac.LJFF());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r1 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r1
            X.01GW r0 = r4.LLILZ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = (com.bytedance.ies.sdk.datachannel.DataChannel) r0
            boolean r0 = r1.Kw0(r0)
            r3 = 0
            r2 = 0
            if (r0 != 0) goto L6b
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r1 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r1
            com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse r0 = r4.LLILLJJLI
            if (r0 == 0) goto L69
            webcast.data.SubSplitStatus r0 = r0.subSplitStatus
        L26:
            boolean r0 = r1.pY1(r0)
            if (r0 != 0) goto L6b
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r1 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r1
            webcast.data.SubSplitStatus r0 = com.bytedance.android.live.base.model.user.User.subSplitStatus
            boolean r0 = r1.pY1(r0)
            if (r0 != 0) goto L6b
            r0 = 0
        L3d:
            r4.LLIZ = r0
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r1 = r0.getValue()
            X.0JTk r1 = (X.InterfaceC492580JTk) r1
            boolean r0 = r4.LLIZ
            r1.LJFF(r0)
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r0 = r0.getValue()
            X.0JTk r0 = (X.InterfaceC492580JTk) r0
            android.view.View r0 = r0.LIZJ()
            r4.LLILZLL = r0
            r0 = 2131568194(0x7f0d2642, float:1.876198E38)
            android.view.View r2 = X.C786410Ut5.Td(r5, r0, r6, r2)
            boolean r0 = r2 instanceof android.view.View
            if (r0 != 0) goto L66
            r2 = r3
        L66:
            if (r2 == 0) goto L8b
            goto L6d
        L69:
            r0 = r3
            goto L26
        L6b:
            r0 = 1
            goto L3d
        L6d:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L91
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)     // Catch: java.lang.Throwable -> L91
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r4)     // Catch: java.lang.Throwable -> L91
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r2.setTag(r0, r4)     // Catch: java.lang.Throwable -> L91
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L91
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L88
            r3 = r1
            X.19GS r3 = (X.C19GS) r3     // Catch: java.lang.Throwable -> L91
        L88:
            X.C1685300txQ.LIZ(r3)     // Catch: java.lang.Throwable -> L91
        L8b:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L91
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L91
            return r2
        L91:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
