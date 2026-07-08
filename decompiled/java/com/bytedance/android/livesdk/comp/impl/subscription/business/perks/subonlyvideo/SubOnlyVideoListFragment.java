package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C098200Yq;
import X.C0JS1;
import X.C0JTI;
import X.C0JTY;
import X.C0JTZ;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C386801es;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC492180JRw;
import X.EnumC492200JRy;
import X.EnumC492500JTc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.subscription.lifecycleawarecomponents.SubscriptionSuspensionLifecycleObserver;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubscriptionPhotoTextConsumptionKillswitch;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo.SubOnlyVideoListFragment;
import com.bytedance.android.livesdk.livesetting.subscription.SubOnlyVideoLynxUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyVideoListFragment extends Fragment implements C0JTI {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2HELIOSExPTYlJyogO2s8LD04O2s/PC08Jik1PyY3LSpiGjoxBysgMBk6LCAjBSYgPAM+KCg+LSs4";
    public boolean LL;
    public long LLILLJJLI;
    public Integer LLILZIL;
    public Boolean LLIZ;
    public LiveIconView LLIZLLLIL;
    public LiveIconView LLJ;
    public LiveIconView LLJI;
    public Integer LLJIJIL;
    public int LLJILJIL;
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZLL = "";
    public EnumC492500JTc LLJILJILJ = EnumC492500JTc.PRIVILEGE_PAGE;

    @Override // X.C0JTI
    public final boolean onBackPressed() {
        List<Fragment> listLJJLIIIJL;
        FragmentManager fragmentManager = getFragmentManager();
        if (((fragmentManager == null || (listLJJLIIIJL = fragmentManager.LJJLIIIJL()) == null) ? 0 : listLJJLIIIJL.size()) > 1) {
            C784440Upu.LIZ().LIZIZ(new C0JS1(EnumC492180JRw.SUB_ONLY_VIDEO_PAGE, EnumC492200JRy.CLOSE, null, null, null, null, null, 252));
            return true;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Integer num = this.LLJIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
            tuxImmersionBarLIZLLL.LJIIIZ(iIntValue);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LL = arguments.getBoolean("is_author", false);
            this.LLILLJJLI = arguments.getLong("user_id", 0L);
            this.LLILLL = arguments.getString("sec_user_id", "");
            this.LLILZ = arguments.getString("enter_from", "");
            if (arguments.containsKey("creator_status")) {
                arguments.getInt("creator_status", C386801es.DEFAULT);
            }
            if (arguments.containsKey("sov_video_count")) {
                this.LLILZIL = Integer.valueOf(arguments.getInt("sov_video_count", C386801es.DEFAULT));
            }
            this.LLILZLL = arguments.getString("enter_method", "");
            if (SubscriptionPhotoTextConsumptionKillswitch.INSTANCE.isDisabled()) {
                this.LLJILJILJ = EnumC492500JTc.values()[arguments.getInt("content_page_type", 0)];
            }
        }
        Fragment fragmentWt1 = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).wt1(this.LL, null, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, this.LLIZ, new C0JTZ(this), new SubOnlyVideoOpenParams(this.LLILZLL, this.LLJILJILJ, 4, 0), null);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.iiv, fragmentWt1);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        Window window;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (LiveIconView) view.findViewById(R.id.bmy);
        this.LLJ = (LiveIconView) view.findViewById(R.id.hof);
        this.LLJI = (LiveIconView) view.findViewById(R.id.p1h);
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).oV1() && this.LL) {
            C500260Jjc.LLFFF(this.LLJI);
            C500260Jjc.LJIILIIL(this.LLJ);
            LiveIconView liveIconView = this.LLJI;
            if (liveIconView != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JTW
                    {
                        super(300L);
                    }

                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view2) {
                        int i;
                        if (view2 != null) {
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILZ.getContext(), ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).ms1());
                            SubOnlyVideoListFragment subOnlyVideoListFragment = this.LLILZ;
                            subOnlyVideoListFragment.getClass();
                            C474500IjA c474500IjALIZJ = C0IJT.LIZJ("subscription_sub_only_video_page_setting_click");
                            c474500IjALIZJ.LJJII(Long.valueOf(subOnlyVideoListFragment.LLILLJJLI), "creator_id");
                            int i2 = 0;
                            if (subOnlyVideoListFragment.LLJILJIL == 1) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            c474500IjALIZJ.LJJII(Integer.valueOf(i), "subonly_video_status");
                            if (subOnlyVideoListFragment.LLJILJIL == 1) {
                                i2 = 1;
                            }
                            c474500IjALIZJ.LJJII(Integer.valueOf(i2), "sub_only_status");
                            c474500IjALIZJ.LJJII(subOnlyVideoListFragment.LLILZIL, "sub_only_video_cnt");
                            c474500IjALIZJ.LJJII(subOnlyVideoListFragment.LLILZ, "enter_from");
                            c474500IjALIZJ.LJJII(Long.valueOf(subOnlyVideoListFragment.LLILLJJLI), "anchor_id");
                            if (!subOnlyVideoListFragment.LL) {
                                c474500IjALIZJ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getFollowInfo().getFollowStatus()), "follow_status");
                            }
                            c474500IjALIZJ.LIZ();
                        }
                    }
                }, liveIconView);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJI);
            C500260Jjc.LLFFF(this.LLJ);
            if (!this.LL) {
                C500260Jjc.LJIILIIL(this.LLJ);
            }
            LiveIconView liveIconView2 = this.LLJ;
            if (liveIconView2 != null) {
                C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0JTX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), SubOnlyVideoLynxUrlSetting.INSTANCE.getSubOnlyVideosFAQ());
                        SubOnlyVideoListFragment subOnlyVideoListFragment = this.LL;
                        subOnlyVideoListFragment.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_video_list_faq_click");
                        c474500IjALIZ.LJJII(subOnlyVideoListFragment.LLILZ, "enter_from");
                        c474500IjALIZ.LJJII(Long.valueOf(subOnlyVideoListFragment.LLILLJJLI), "anchor_id");
                        if (!subOnlyVideoListFragment.LL) {
                            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getFollowInfo().getFollowStatus()), "follow_status");
                        }
                        c474500IjALIZ.LIZ();
                    }
                });
            }
        }
        LiveIconView liveIconView3 = this.LLIZLLLIL;
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, new View.OnClickListener() { // from class: X.0JTa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.onBackPressed();
                }
            });
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            numValueOf = Integer.valueOf(window.getStatusBarColor());
        } else {
            numValueOf = null;
        }
        this.LLJIJIL = numValueOf;
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
        tuxImmersionBarLIZLLL.LJIIIZ(C497740JfY.LJFF(R.color.aas));
        tuxImmersionBarLIZLLL.LIZLLL();
        getLifecycle().addObserver(new SubscriptionSuspensionLifecycleObserver(new C0JTY(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.glj, viewGroup, false);
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
