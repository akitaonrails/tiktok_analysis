package com.ss.android.ugc.aweme.notification.v2;

import X.AbstractC712240Rwk;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0APB;
import X.C0C64;
import X.C0P0T;
import X.C0XQ7;
import X.C118300cf;
import X.C1238750iLB;
import X.C1246860iYG;
import X.C1308910kAL;
import X.C1391600mJi;
import X.C13LE;
import X.C14EU;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1720106oR;
import X.C189200o6;
import X.C1900870zZ7;
import X.C1901580zaG;
import X.C1902360zbW;
import X.C1902390zbZ;
import X.C1902420zbc;
import X.C1904220zeW;
import X.C1905930zhH;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20632315oP;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C415660GRo;
import X.C417460GYm;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C913080Zru;
import X.C987103tV;
import X.EnumC1235690iGF;
import X.EnumC428980Grw;
import X.InterfaceC1581830rGX;
import X.InterfaceC1586310rNl;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import X.ViewTreeObserverOnPreDrawListenerC19333310kN;
import Y.ACListenerS162S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.inbox.followerv2.InboxFollowerFragmentV2;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notification.v2.MergedNotificationFragment;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS123S0400000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class MergedNotificationFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1581830rGX, InterfaceC1586310rNl {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSHELIOSY8Jms6e2EeLTcrLCsdJzElLyYwKTElJiEVOiQrJCo9PA==";
    public C0P0T LLIZ;
    public C20632315oP LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxIconView LLJILJIL;
    public C417460GYm LLJILJILJ;
    public C417460GYm LLJILLL;
    public TuxIconView LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public TuxIconView LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public HorizontalScrollView LLJJJIL;
    public C1902420zbc LLJJJJJIL;
    public C1902360zbW LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(290));
    public int LLJJJJ = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MergedNotificationFragment.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MergedNotificationFragment.class, "mergedViewModel", "getMergedViewModel()Lcom/ss/android/ugc/aweme/notification/v2/MergedNotificationViewModel;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC1586310rNl
    public final void Zu(String str) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC1586310rNl
    public final String getEnterMethod() {
        return "notification_page";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "merged_notification_page";
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

    public MergedNotificationFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c19719912DlLIZ, 350);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(170);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS572S0100000_28, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 351), aFwS271S0000000_28, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS572S0100000_28, new AwS572S0100000_28((Fragment) this, 352), aFwS271S0000000_28, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS572S0100000_28, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 353), aFwS271S0000000_28, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MergedNotificationViewModel.class);
        AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(c19719912DlLIZ2, 354);
        AFwS271S0000000_28 aFwS271S0000000_282 = AFwS271S0000000_28.get$arr$(171);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS572S0100000_282, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 355), aFwS271S0000000_282, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS572S0100000_282, new AwS572S0100000_28((Fragment) this, 356), aFwS271S0000000_282, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS572S0100000_282, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 349), aFwS271S0000000_282, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJJLIIIJLLLLLLLZ = assemVMLazy2;
        this.LLJL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(291));
    }

    public final int SR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("default_tab", 0);
        }
        return 0;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C1902360zbW c1902360zbW = this.LLJJJJLIIL;
        if (c1902360zbW != null) {
            c1902360zbW.dismiss();
        }
        this.LLJJJJLIIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0P0T c0p0t = this.LLIZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        this.LLIZ = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJIL = null;
        this.LLJJJJJIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1900870zZ7.LIZ = null;
        C1900870zZ7.LIZIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C20632315oP c20632315oP = this.LLJ;
        int currentItem = c20632315oP != null ? c20632315oP.getCurrentItem() : 0;
        C1900870zZ7.LIZ = currentItem == 0 ? "new_activities" : "merged_activity_follower";
        C1900870zZ7.LIZIZ = currentItem != 0 ? "merged_activity_follower" : "new_activities";
    }

    public final void UR(int i) {
        boolean z;
        String str;
        C20632315oP c20632315oP;
        View view;
        TuxIconView tuxIconView;
        HorizontalScrollView horizontalScrollView;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        Context context;
        Integer numLIZJ;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = i;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        C1902420zbc c1902420zbc = this.LLJJJJJIL;
        int i7 = 8;
        if (c1902420zbc != null && (tuxTextView = c1902420zbc.LIZ) != null && (tuxTextView2 = c1902420zbc.LIZIZ) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (context = tuxTextView.getContext()))) != null) {
            int iIntValue = numLIZJ.intValue();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
            if (numLIZJ2 != null) {
                int iIntValue2 = numLIZJ2.intValue();
                if (z) {
                    i2 = iIntValue;
                } else {
                    i2 = iIntValue2;
                }
                tuxTextView.setTextColor(i2);
                if (z) {
                    i3 = iIntValue2;
                } else {
                    i3 = iIntValue;
                }
                tuxTextView2.setTextColor(i3);
                if (c1902420zbc.LJIIL) {
                    i4 = 42;
                } else {
                    i4 = 32;
                }
                TuxTextView tuxTextView3 = c1902420zbc.LIZ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTuxFont(i4);
                }
                TuxTextView tuxTextView4 = c1902420zbc.LIZIZ;
                if (tuxTextView4 != null) {
                    tuxTextView4.setTuxFont(i4);
                }
                TuxIconView tuxIconView2 = c1902420zbc.LIZJ;
                if (tuxIconView2 != null) {
                    if (!z) {
                        iIntValue = iIntValue2;
                    }
                    tuxIconView2.setTintColor(iIntValue);
                }
                View view2 = c1902420zbc.LJI;
                if (view2 != null) {
                    if (z) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i6, view2);
                }
                View view3 = c1902420zbc.LJII;
                if (view3 != null) {
                    if (z) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i5, view3);
                }
            }
        }
        C1902420zbc c1902420zbc2 = this.LLJJJJJIL;
        if (c1902420zbc2 != null && (horizontalScrollView = c1902420zbc2.LJIIJ) != null && horizontalScrollView.getWidth() > 0) {
            if (z) {
                horizontalScrollView.scrollTo(0, 0);
            } else {
                View childAt = horizontalScrollView.getChildAt(0);
                if (childAt != null) {
                    int width = childAt.getWidth() - ((horizontalScrollView.getWidth() - horizontalScrollView.getPaddingLeft()) - horizontalScrollView.getPaddingRight());
                    if (width < 0) {
                        width = 0;
                    }
                    horizontalScrollView.scrollTo(width, 0);
                }
            }
        }
        C1902420zbc c1902420zbc3 = this.LLJJJJJIL;
        if (c1902420zbc3 != null) {
            if (z) {
                C417460GYm c417460GYm = c1902420zbc3.LIZLLL;
                if (c417460GYm != null) {
                    C786410Ut5.g0(c417460GYm, 8);
                }
            } else {
                C417460GYm c417460GYm2 = c1902420zbc3.LJ;
                if (c417460GYm2 != null) {
                    C786410Ut5.g0(c417460GYm2, 8);
                }
            }
        }
        C1902420zbc c1902420zbc4 = this.LLJJJJJIL;
        if (c1902420zbc4 != null && (tuxIconView = c1902420zbc4.LJFF) != null) {
            if (c1902420zbc4.LJIIJJI) {
                if (z) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
            }
            if (tuxIconView.getVisibility() != i7) {
                C786410Ut5.LLLLLLZZ(tuxIconView, i7);
            }
        }
        String str2 = "new_activities";
        if (z) {
            str = "new_activities";
        } else {
            str = "merged_activity_follower";
        }
        C1900870zZ7.LIZ = str;
        if (!z) {
            str2 = "merged_activity_follower";
        }
        C1900870zZ7.LIZIZ = str2;
        if (i == 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_merge_follower_tooltip", true) > 0 && (c20632315oP = this.LLJ) != null && c20632315oP.getCurrentItem() == 1 && (view = this.LLJJIJIL) != null && view.isAttachedToWindow()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inbox_merge_follower_tooltip_keva:");
            C0XQ7.LJ();
            sbLIZ.append(C0XQ7.LIZ.LJIIJ().getCurUserId());
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_merge_follower_tooltip", true);
            if (iLJIJ > repo.getInt("follower_tab_tooltip_exp_value", 0)) {
                repo.storeInt("follower_tab_tooltip_exp_value", iLJIJ);
                repo.storeBoolean("follower_tab_tooltip_shown", false);
                int i8 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tooltip new exp round, reset shown. value=");
                sbLIZ2.append(iLJIJ);
                C1720106oR.LJI("MergedNotificationFragment", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (!repo.getBoolean("follower_tab_tooltip_shown", false)) {
                C450720Hlu c450720Hlu = new C450720Hlu(view.getContext());
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c450720Hlu.LJIIJ(2131837173);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
                c1391600mJi2.LJIIIIZZ = iLIZIZ;
                c1391600mJi2.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                c1391600mJi2.LJIJJ = true;
                C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                c0p0tLIZIZ.show();
                this.LLIZ = c0p0tLIZIZ;
                repo.storeBoolean("follower_tab_tooltip_shown", true);
                int i9 = C2187451AjH.LIZ;
                C1720106oR.LJI("MergedNotificationFragment", "show follower tab tooltip");
            }
        }
        int i10 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onTabSelected position=");
        sbLIZ3.append(i);
        C1720106oR.LJI("MergedNotificationFragment", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(AFwS271S0000000_28.get$arr$(169));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach(android.app.Activity r5) {
        /*
            r4 = this;
            android.os.Bundle r2 = r4.getArguments()
            r1 = 0
            if (r2 == 0) goto Lf
            java.lang.String r0 = "default_tab"
            int r0 = r2.getInt(r0, r1)
            if (r0 != 0) goto L3a
        Lf:
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r3 = "group"
            r2 = -1
            if (r0 == 0) goto L1e
            int r1 = r0.getInt(r3, r2)
            if (r1 != r2) goto L34
        L1e:
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.getString(r3)
            if (r0 == 0) goto L3a
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L3a
            int r1 = r0.intValue()
        L34:
            if (r1 == r2) goto L3a
            int r0 = X.C1904270zeb.LIZ
            X.C1904270zeb.LIZJ = r1
        L3a:
            super.onAttach(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.MergedNotificationFragment.onAttach(android.app.Activity):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Intent intent;
        Intent intent2;
        super.onCreate(bundle);
        NR(AFwS269S0000000_27.get$arr$(135));
        EventBus.LIZLLL().LJIJJ(this);
        C1246860iYG c1246860iYG = C1246860iYG.LIZ;
        C19EG activity = getActivity();
        Bundle extras2 = null;
        if (activity != null && (intent2 = activity.getIntent()) != null) {
            try {
                extras = intent2.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        c1246860iYG.getClass();
        C1246860iYG.LIZ(extras);
        C19EG activity2 = getActivity();
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            try {
                extras2 = intent.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C1246860iYG.LIZIZ(this, extras2, 0);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, defaultTab=");
        sbLIZ.append(SR());
        sbLIZ.append(", isCreator=");
        sbLIZ.append(((Boolean) this.LLIZLLLIL.getValue()).booleanValue());
        C1720106oR.LJI("MergedNotificationFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C1238750iLB c1238750iLB) {
        C913080Zru.LIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        Bundle extras;
        C1246860iYG c1246860iYG = C1246860iYG.LIZ;
        Bundle extras2 = null;
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        c1246860iYG.getClass();
        C1246860iYG.LIZ(extras);
        if (intent != null) {
            try {
                extras2 = intent.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C1246860iYG.LIZIZ(this, extras2, 0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        String str;
        boolean z2;
        C1902420zbc c1902420zbc;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        this.LLJ = (C20632315oP) view.findViewById(R.id.o8u);
        this.LLJJJ = view.findViewById(R.id.o8s);
        this.LLJJJIL = (HorizontalScrollView) view.findViewById(R.id.o8t);
        this.LLJI = (TuxTextView) view.findViewById(R.id.wwy);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.wxp);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.wwu);
        this.LLJILJILJ = (C417460GYm) view.findViewById(R.id.wwv);
        this.LLJILLL = (C417460GYm) view.findViewById(R.id.wxm);
        this.LLJJ = (TuxIconView) view.findViewById(R.id.wxq);
        this.LLJJI = view.findViewById(R.id.wwx);
        this.LLJJIII = view.findViewById(R.id.wxo);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.o8q);
        this.LLJJIJIIJIL = view.findViewById(R.id.www_res_0x7f0a7b2b);
        this.LLJJIJIL = view.findViewById(R.id.wxn);
        C415660GRo c415660GRo = (C415660GRo) view.findViewById(R.id.wxs);
        if (c415660GRo != null) {
            c415660GRo.setDirection(EnumC428980Grw.START);
        }
        C415660GRo c415660GRo2 = (C415660GRo) view.findViewById(R.id.wxr);
        if (c415660GRo2 != null) {
            c415660GRo2.setDirection(EnumC428980Grw.END);
        }
        this.LLJJJJJIL = new C1902420zbc(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJIL);
        TuxIconView tuxIconView = this.LLJJIJI;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 105));
        }
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 107), view2);
        }
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 108), view3);
        }
        if (!((Boolean) this.LLIZLLLIL.getValue()).booleanValue()) {
            TuxIconView tuxIconView2 = this.LLJILJIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            View view4 = this.LLJJIJIIJIL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS162S0100000_28(this, 109), view4);
            }
        }
        int i2 = 4;
        if (!((Boolean) this.LLIZLLLIL.getValue()).booleanValue()) {
            i = 0;
        } else {
            i = (int) (4 * getResources().getDisplayMetrics().density);
        }
        C417460GYm c417460GYm = this.LLJILJILJ;
        ViewGroup.LayoutParams layoutParams = null;
        if (c417460GYm != null) {
            layoutParams = c417460GYm.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
        }
        boolean z4 = true;
        if (((Number) C0APB.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c1902420zbc = this.LLJJJJJIL) != null) {
            DecisionMakerNetworkApi.EligibilityModel eligibilityModel = (DecisionMakerNetworkApi.EligibilityModel) this.LLJL.getValue();
            C1905930zhH.LIZ.getClass();
            boolean zLIZ = C1905930zhH.LIZ(eligibilityModel);
            c1902420zbc.LJIIJJI = zLIZ;
            TuxIconView tuxIconView3 = this.LLJJ;
            if (tuxIconView3 != null) {
                tuxIconView3.setClickable(zLIZ);
                C786410Ut5.a9(tuxIconView3, new ACListenerS162S0100000_28(eligibilityModel, 106));
            }
            if (SR() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            TuxIconView tuxIconView4 = c1902420zbc.LJFF;
            if (tuxIconView4 != null) {
                if (!c1902420zbc.LJIIJJI) {
                    i2 = 8;
                } else if (!z3) {
                    i2 = 0;
                }
                if (tuxIconView4.getVisibility() != i2) {
                    C786410Ut5.LLLLLLZZ(tuxIconView4, i2);
                }
            }
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_merge_follower_tab_dot_offline", true) < 1) {
            AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
            C1902390zbZ c1902390zbZ = (C1902390zbZ) assemVMLazy.getValue().getState();
            C1902420zbc c1902420zbc2 = this.LLJJJJJIL;
            if (c1902420zbc2 != null) {
                int i3 = c1902390zbZ.LL;
                int i4 = c1902390zbZ.LLILLL;
                C1904220zeW c1904220zeW = C1904220zeW.LL;
                int iLJJ = c1904220zeW.LJJ(i3);
                C417460GYm c417460GYm2 = c1902420zbc2.LIZLLL;
                if (c417460GYm2 != null) {
                    if (iLJJ > 0) {
                        c417460GYm2.setCount(iLJJ);
                        C786410Ut5.g0(c417460GYm2, 0);
                    } else {
                        C786410Ut5.g0(c417460GYm2, 8);
                    }
                }
                int iLJJ2 = c1904220zeW.LJJ(i4);
                C417460GYm c417460GYm3 = c1902420zbc2.LJ;
                if (c417460GYm3 != null) {
                    if (iLJJ2 > 0) {
                        c417460GYm3.setCount(iLJJ2);
                        C786410Ut5.g0(c417460GYm3, 0);
                    } else {
                        C786410Ut5.g0(c417460GYm3, 8);
                    }
                }
            }
        }
        AssemVMLazy assemVMLazy2 = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJLIL;
        AssemViewModel value = assemVMLazy2.getValue();
        C1901580zaG.LIZ.getClass();
        List<InboxEntranceCell> listLJFF = C1901580zaG.LJFF();
        if (listLJFF == null) {
            int i5 = C2187451AjH.LIZ;
            C1720106oR.LJI("MergedNotificationViewModel", "initFilterTypes: entranceCellList is null, using defaults");
        } else {
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = 13;
            C118300cf c118300cf2 = new C118300cf();
            c118300cf2.element = 602;
            C118300cf c118300cf3 = new C118300cf();
            c118300cf3.element = 9;
            C118300cf c118300cf4 = new C118300cf();
            c118300cf4.element = 533;
            for (InboxEntranceCell inboxEntranceCell : listLJFF) {
                int i6 = inboxEntranceCell.cellId;
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = inboxEntranceCell.filterType;
                        if (i7 != Integer.MIN_VALUE) {
                            c118300cf3.element = i7;
                        }
                        int i8 = inboxEntranceCell.group;
                        if (i8 != 0) {
                            c118300cf4.element = i8;
                        }
                    }
                } else {
                    int i9 = inboxEntranceCell.filterType;
                    if (i9 != Integer.MIN_VALUE) {
                        c118300cf.element = i9;
                    }
                    int i10 = inboxEntranceCell.group;
                    if (i10 != 0) {
                        c118300cf2.element = i10;
                    }
                }
            }
            value.setState(new AwS123S0400000_28(c118300cf, c118300cf2, c118300cf3, c118300cf4, 3));
            int i11 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initFilterTypes: activity(filterType=");
            sbLIZ.append(c118300cf.element);
            sbLIZ.append(", group=");
            sbLIZ.append(c118300cf2.element);
            sbLIZ.append("), follower(filterType=");
            sbLIZ.append(c118300cf3.element);
            sbLIZ.append(", group=");
            sbLIZ.append(c118300cf4.element);
            sbLIZ.append(')');
            C1720106oR.LJI("MergedNotificationViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }
        C20632315oP c20632315oP = this.LLJ;
        if (c20632315oP != null) {
            c20632315oP.setAdapter(new FragmentStateAdapter(this) { // from class: X.0zbY
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return 2;
                }

                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public final Fragment LLLII(int i12) {
                    AssemVMLazy assemVMLazy3 = this.LLJI.LLJJLIIIJLLLLLLLZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = MergedNotificationFragment.LLJLIL;
                    C1902390zbZ c1902390zbZ2 = (C1902390zbZ) assemVMLazy3.getValue().getState();
                    if (i12 != 0) {
                        if (i12 == 1) {
                            InboxFollowerFragmentV2 inboxFollowerFragmentV2 = new InboxFollowerFragmentV2();
                            Bundle arguments = this.LLJI.getArguments();
                            if (arguments == null) {
                                arguments = new Bundle();
                            }
                            Bundle bundle2 = new Bundle(arguments);
                            int i13 = c1902390zbZ2.LLILLL;
                            if (i13 != Integer.MIN_VALUE) {
                                bundle2.putInt("filter_type", i13);
                            }
                            inboxFollowerFragmentV2.setArguments(bundle2);
                            return inboxFollowerFragmentV2;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Invalid tab position: ");
                        sbLIZ2.append(i12);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    NotificationFragmentV2 notificationFragmentV2 = new NotificationFragmentV2();
                    Bundle arguments2 = this.LLJI.getArguments();
                    if (arguments2 == null) {
                        arguments2 = new Bundle();
                    }
                    Bundle bundle3 = new Bundle(arguments2);
                    bundle3.putBoolean("embedded_mode", true);
                    bundle3.putInt("group", c1902390zbZ2.LLILLJJLI);
                    int i14 = c1902390zbZ2.LL;
                    if (i14 != Integer.MIN_VALUE) {
                        bundle3.putInt("filter_type", i14);
                    }
                    notificationFragmentV2.setArguments(bundle3);
                    return notificationFragmentV2;
                }
            });
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_merge_disable_swipe_tab", true) >= 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c20632315oP.setUserInputEnabled(!z2);
            c20632315oP.LIZIZ(new AbstractC712240Rwk() { // from class: X.0zbd
                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i12) {
                    this.LL.UR(i12);
                }
            });
        }
        if (SR() != 0) {
            z4 = false;
        }
        if (z4) {
            str = "new_activities";
        } else {
            str = "merged_activity_follower";
        }
        C1900870zZ7.LIZ = str;
        C1900870zZ7.LIZIZ = str;
        int iSR = SR();
        C20632315oP c20632315oP2 = this.LLJ;
        if (c20632315oP2 != null) {
            c20632315oP2.LJ(iSR, false);
        }
        C786410Ut5.y3(view.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC19333310kN(view, this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a9a, viewGroup, false);
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
