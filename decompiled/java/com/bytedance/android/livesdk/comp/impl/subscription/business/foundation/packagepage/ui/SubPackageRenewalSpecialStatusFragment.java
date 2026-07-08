package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui;

import X.C098200Yq;
import X.C0IJT;
import X.C0J3Y;
import X.C0KAT;
import X.C0KAV;
import X.C0KCF;
import X.C0KWK;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C513040KAc;
import X.C513050KAd;
import X.C513070KAf;
import X.C786410Ut5;
import X.EnumC513410KBn;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackageRenewalSpecialStatusFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxFeedbackUrl;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageRenewalSpecialStatusFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2sqHELIOSJjo9LCQ4ICA9ZjUtKiQyLyA8KCg2ZjAlZxwmKhUtKiQyLyAeLCE2PyQgGj82KywtJRwnKTE5OgkhKSIhLCEn";
    public Map<String, String> LLILZ;
    public LiveIconView LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public LinearLayout LLIZLLLIL;
    public C16FS LLJ;
    public C16F5 LLJI;
    public String LL = "";
    public EnumC513410KBn LLILLJJLI = EnumC513410KBn.LATE_CALLBACK_SCENE;
    public C0KCF LLILLL = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0, 0, false, -1, 15);
    public Function0<Unit> LLJIJIL = new C513040KAc();
    public Function0<Unit> LLJILJIL = new C513050KAd();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    public final void NR(CharSequence charSequence) {
        View viewSd = C786410Ut5.Sd(R.layout.g1z, getLayoutInflater(), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.fof);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        textView.setText(charSequence);
        LinearLayout linearLayout = this.LLIZLLLIL;
        if (linearLayout != null) {
            linearLayout.addView(viewSd);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.e26);
        this.LLILZLL = (C16F5) view.findViewById(R.id.pyo);
        this.LLIZ = (C16F5) view.findViewById(R.id.je5);
        this.LLIZLLLIL = (LinearLayout) view.findViewById(R.id.evm);
        this.LLJ = (C16FS) view.findViewById(R.id.a0z);
        this.LLJI = (C16F5) view.findViewById(R.id.a10);
        LiveIconView liveIconView = this.LLILZIL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0KAb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.LLJIJIL.invoke();
                }
            });
        }
        EnumC513410KBn enumC513410KBn = this.LLILLJJLI;
        if (enumC513410KBn != null) {
            int i = C513070KAf.LIZ[enumC513410KBn.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C16F5 c16f5 = this.LLILZLL;
                        if (c16f5 != null) {
                            c16f5.setText(C497740JfY.LJIJI(2131844263));
                        }
                        C16F5 c16f52 = this.LLIZ;
                        if (c16f52 != null) {
                            c16f52.setText(C497740JfY.LJIJI(2131844258));
                        }
                        C16FS c16fs = this.LLJ;
                        if (c16fs != null) {
                            c16fs.setRadius((int) C497740JfY.LIZIZ(8.0f));
                            c16fs.setText(C497740JfY.LJIJI(2131844262));
                            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0KAa
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    this.LL.LLJILJIL.invoke();
                                    Map<String, String> map = this.LL.LLILZ;
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ios_resubscirbe_popup_month_click");
                                    c474500IjALIZ.LJJIIZI(map);
                                    c474500IjALIZ.LIZ();
                                }
                            });
                        }
                        C16F5 c16f53 = this.LLJI;
                        if (c16f53 != null) {
                            C500260Jjc.LLFFF(c16f53);
                            c16f53.setText(C497740JfY.LJIJI(2131844261));
                            C786410Ut5.l8(c16f53, new View.OnClickListener() { // from class: X.0KAY
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C480460Ism.LIZ().getClass();
                                    C11NZ<R> c11nzLJIILIIL = ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).setRenewReminder(this.LL.LLILLL.LIZ).LJIILIIL(new C0UO0());
                                    final SubPackageRenewalSpecialStatusFragment subPackageRenewalSpecialStatusFragment = this.LL;
                                    c11nzLJIILIIL.LJJLJLI(new C09JN() { // from class: X.0KAZ
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("SubPackageRenewalSpecialStatusFragment@97bb.initRenewalCancelViews$2$1$1");
                                            BaseResponse baseResponse = (BaseResponse) obj;
                                            if (baseResponse.statusCode == 0) {
                                                subPackageRenewalSpecialStatusFragment.LLJIJIL.invoke();
                                            } else {
                                                String strLJIJI = baseResponse.LJ.prompts;
                                                if (strLJIJI == null || strLJIJI.length() == 0) {
                                                    strLJIJI = C497740JfY.LJIJI(2131843667);
                                                }
                                                C766270U4b.LJIIJJI(strLJIJI);
                                            }
                                            C1C7U.LIZIZ("SubPackageRenewalSpecialStatusFragment@97bb.initRenewalCancelViews$2$1$1");
                                        }
                                    });
                                    Map<String, String> map = this.LL.LLILZ;
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ios_resubscirbe_popup_remind_click");
                                    c474500IjALIZ.LJJIIZI(map);
                                    c474500IjALIZ.LIZ();
                                }
                            });
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(C497740JfY.LJIJI(2131844259));
                        arrayList.add(C497740JfY.LJIJI(2131844260));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            NR((CharSequence) it2.next());
                        }
                        Map<String, String> map = this.LLILZ;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ios_resubscirbe_popup_show");
                        c474500IjALIZ.LJJIIZI(map);
                        c474500IjALIZ.LIZ();
                        return;
                    }
                    return;
                }
                C16F5 c16f54 = this.LLILZLL;
                if (c16f54 != null) {
                    c16f54.setText(C497740JfY.LJIJI(2131844257));
                }
                C16F5 c16f55 = this.LLIZ;
                if (c16f55 != null) {
                    c16f55.setText(C497740JfY.LJIJI(2131844255));
                }
                final C16FS c16fs2 = this.LLJ;
                if (c16fs2 != null) {
                    c16fs2.setRadius((int) C497740JfY.LIZIZ(8.0f));
                    c16fs2.setText(C497740JfY.LJIJI(2131844256));
                    C786410Ut5.h8(c16fs2, new View.OnClickListener() { // from class: X.0KAU
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C2089008Gi c2089008Gi = new C2089008Gi(LiveSubscribeLynxFeedbackUrl.INSTANCE.getValue());
                            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                            Context context = c16fs2.getContext();
                            String strLJ = c2089008Gi.LJ();
                            strLJ.toString();
                            C494790Jan.LJIIIZ(context, strLJ, null);
                            Map<String, String> map2 = this.LLILZ;
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_late_call_subscirbe_popup_click");
                            c474500IjALIZ2.LJJIIZI(map2);
                            c474500IjALIZ2.LIZ();
                        }
                    });
                }
                ArrayList arrayList2 = new ArrayList();
                SpannableStringBuilder spannableStringBuilderLIZ = C0KWK.LIZ(C497740JfY.LJIJI(2131844254), C497740JfY.LJIJI(2131844267), C20736316Cj.LIZIZ(R.attr.esd, getContext()), new C0KAV(this));
                arrayList2.add(C497740JfY.LJIJI(2131844253));
                arrayList2.add(spannableStringBuilderLIZ);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    NR((CharSequence) it3.next());
                }
                Map<String, String> map2 = this.LLILZ;
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_late_call_subscirbe_popup_show");
                c474500IjALIZ2.LJJIIZI(map2);
                c474500IjALIZ2.LIZ();
                return;
            }
            Map<String, String> map3 = this.LLILZ;
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_onhold_subscirbe_popup_show");
            c474500IjALIZ3.LJIL();
            c474500IjALIZ3.LJJIIZI(map3);
            c474500IjALIZ3.LIZ();
            C16F5 c16f56 = this.LLILZLL;
            if (c16f56 != null) {
                c16f56.setText(C497740JfY.LJIJI(2131844270));
            }
            C16F5 c16f57 = this.LLIZ;
            if (c16f57 != null) {
                c16f57.setText(C497740JfY.LJIJI(2131844268));
            }
            final C16FS c16fs3 = this.LLJ;
            if (c16fs3 != null) {
                c16fs3.setRadius((int) C497740JfY.LIZIZ(8.0f));
                c16fs3.setText(C497740JfY.LJIJI(2131844269));
                C786410Ut5.h8(c16fs3, new View.OnClickListener() { // from class: X.0KNN
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (!C2093608Ic.LJ(this.LL)) {
                            Map<String, String> map4 = this.LLILZ;
                            C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_onhold_subscirbe_popup_check_click");
                            c474500IjALIZ4.LJIL();
                            c474500IjALIZ4.LJJIIZI(map4);
                            c474500IjALIZ4.LIZ();
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(UriProtector.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", this.LL).appendQueryParameter("package", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getApplicationInfo().packageName).build());
                            intent.setPackage("com.android.vending");
                            ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965953);
                            Context context = c16fs3.getContext();
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, context);
                            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbhasEQxV+j89E1j1MzcWG2NiIFmjMKKoSjvycA4OTQyHIAPE3e8wQXFExcZUrSqHlkxACPSOMHLHHSd+t5N7wiyw", null));
                        }
                    }
                });
            }
            C16F5 c16f58 = this.LLJI;
            if (c16f58 != null) {
                C500260Jjc.LJIILIIL(c16f58);
            }
            String strLJIJI = C497740JfY.LJIJI(2131844266);
            ArrayList arrayList3 = new ArrayList();
            SpannableStringBuilder spannableStringBuilderLIZ2 = C0KWK.LIZ(C497740JfY.LJIJI(2131844265), C497740JfY.LJIJI(2131844267), C20736316Cj.LIZIZ(R.attr.esd, getContext()), new C0KAT(this));
            arrayList3.add(C497740JfY.LJIJJ(2131844264, strLJIJI));
            arrayList3.add(spannableStringBuilderLIZ2);
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                NR((CharSequence) it4.next());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hpu, viewGroup, false, layoutInflater.getContext(), false, 48);
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLJFF;
        }
    }
}
