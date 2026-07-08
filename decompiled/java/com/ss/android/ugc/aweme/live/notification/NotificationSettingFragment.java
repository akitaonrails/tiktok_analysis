package com.ss.android.ugc.aweme.live.notification;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.C004I;
import X.C01GW;
import X.C036E;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0XQ7;
import X.C0ZP4;
import X.C10EJ;
import X.C10EK;
import X.C10EL;
import X.C10EW;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C11S5;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1765020w20;
import X.C1770850wBP;
import X.C1841350y17;
import X.C189200o6;
import X.C19336710kv;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC0148002o;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC344240DeY;
import X.InterfaceC420801kM;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AfS197S0100000_28;
import Y.AfS88S0101000_28;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationSettingFragment extends Fragment implements InterfaceC344240DeY, View.OnClickListener, InterfaceC1171660gay, InterfaceC724530SbT, InterfaceC1075600e62<AnonymousClass0412> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9Jio4ICk6HELIOSKyQ4ICA9ZgsjPSY1ISYtPSY8JhYpPTs6JiIKOy40JSAiPQ==";
    public final User LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final C10EW LLILZIL;
    public final Map<String, String> LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public C1841350y17 LLJI;
    public C1841350y17 LLJIJIL;
    public C1841350y17 LLJILJIL;
    public LinearLayout LLJILJILJ;
    public LinearLayout LLJILLL;
    public LinearLayout LLJJ;
    public final lifecycleAwareLazy LLJJI;
    public final C01GW LLJJIII;
    public final int LLJJIJI;
    public final AnonymousClass0412 LLJJIJIIJIL;

    public static String OR(int i) {
        return i != 1 ? (i == 2 || i != 3) ? "FOLLOWED_PERSONALIZED" : "FOLLOWED_NONE" : "FOLLOWED_ALL";
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationSettingFragment() {
        this(new User(), 5, (String) null, (String) (0 == true ? 1 : 0), (C10EW) (0 == true ? 1 : 0), 60);
    }

    public final View NR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.n37) : null;
            this.LLIZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LLILLJJLI == 1 ? getString(2131849303) : getString(2131849285);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 293));
        c0om1.LIZIZ(c1251150ifB);
        int i = this.LLILLJJLI;
        if (i != 1 && i != 4) {
            return c0om1;
        }
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB2.LIZJ(new AwS572S0100000_28(this, 294));
        c0om1.LJ(c1251150ifB2);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String strOR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LLILZLL);
        linkedHashMap.put("final_notification_setting", OR(PR(1)));
        if (!this.LLILZLL.containsKey("initial_notification_setting") || (strOR = this.LLILZLL.get("initial_notification_setting")) == null) {
            strOR = OR(this.LLJJIJI);
        }
        linkedHashMap.put("initial_notification_setting", strOR);
        C10EJ.LIZ.getClass();
        C10EJ.LJ("change_notification", "closed", linkedHashMap);
        C10EW c10ew = this.LLILZIL;
        if (c10ew != null) {
            c10ew.LIZJ();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLJJIJIIJIL;
    }

    public final int PR(int i) {
        if (i != 1) {
            if (i == 4) {
                int livePushNotificationStatus = this.LL.getLivePushNotificationStatus();
                if (livePushNotificationStatus != 1) {
                    if (livePushNotificationStatus != 2 && livePushNotificationStatus == 3) {
                        return 3;
                    }
                } else {
                    return 1;
                }
            }
        } else {
            int postNotificationStatus = this.LL.getPostNotificationStatus();
            if (postNotificationStatus != 1) {
                if (postNotificationStatus != 2 && postNotificationStatus == 3) {
                    return 3;
                }
            } else {
                return 1;
            }
        }
        return 2;
    }

    public final void UR(C19EG c19eg) {
        int i;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = this;
        if (C960203pA.LIZIZ(c19eg)) {
            i = R.attr.c3;
        } else {
            i = R.attr.zp;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, c19eg);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "NotificationDetailSettingFragment");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        if (Intrinsics.LJFF(view, null)) {
            RR(1, 1);
            return;
        }
        if (Intrinsics.LJFF(view, null)) {
            RR(1, 2);
            return;
        }
        if (Intrinsics.LJFF(view, null)) {
            RR(1, 3);
            return;
        }
        if (Intrinsics.LJFF(view, this.LLJILJILJ)) {
            RR(4, 1);
        } else if (Intrinsics.LJFF(view, this.LLJILLL)) {
            RR(4, 2);
        } else {
            if (!Intrinsics.LJFF(view, this.LLJJ)) {
                return;
            }
            RR(4, 3);
        }
    }

    public final void MR(int i, int i2) {
        int postNotificationStatus;
        SR(i, i2);
        C10EJ c10ej = C10EJ.LIZ;
        String str = this.LLILLL;
        int followStatus = this.LL.getFollowStatus();
        String uid = this.LL.getUid();
        if (uid == null) {
            uid = "";
        }
        String str2 = this.LLILZ;
        User user = this.LL;
        if (i == 4) {
            postNotificationStatus = user.getLivePushNotificationStatus();
        } else {
            postNotificationStatus = user.getPostNotificationStatus();
        }
        c10ej.getClass();
        C10EJ.LIZIZ(i, followStatus, postNotificationStatus, i2, str, uid, str2);
        if (i != 1) {
            if (i == 4) {
                this.LL.setLivePushNotificationStatus(i2);
            }
        } else {
            this.LL.setPostNotificationStatus(i2);
        }
        VR(Integer.valueOf(i), Integer.valueOf(i2), true);
        C10EW c10ew = this.LLILZIL;
        if (c10ew != null) {
            c10ew.LJ(i, i2);
        }
        if (SubscribeSettingsExp.LIZJ() && this.LLILLJJLI != 3) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILJJIL(this);
        }
    }

    public final void RR(int i, int i2) {
        boolean zLIZIZ;
        getActivity();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            VR(null, null, false);
            return;
        }
        if (i != 1) {
            if (i == 4) {
                C10EK c10ek = C10EK.LIZ;
                C19EG activity = getActivity();
                User user = this.LL;
                c10ek.getClass();
                if (C10EK.LIZIZ(activity, null, user, "notification_panel") && this.LL.getLivePushNotificationStatus() != i2) {
                    NotificationLiveViewModel notificationLiveViewModel = (NotificationLiveViewModel) this.LLJJI.getValue();
                    String secUid = this.LL.getSecUid();
                    if (secUid == null) {
                        secUid = "";
                    }
                    notificationLiveViewModel.hR2(i2, secUid);
                    return;
                }
                return;
            }
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        C10EK c10ek2 = C10EK.LIZ;
        User user2 = this.LL;
        c10ek2.getClass();
        if (!C10EK.LIZJ(context, user2) || this.LL.getPostNotificationStatus() == i2) {
            return;
        }
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        String uid = this.LL.getUid();
        if (TextUtils.isEmpty(curUserId) || TextUtils.isEmpty(uid)) {
            return;
        }
        long j = CastLongProtector.parseLong(curUserId);
        long j2 = CastLongProtector.parseLong(uid);
        C10EL.LIZ.getClass();
        ((C11NJ) this.LLJJIII.getValue()).LIZ(C10EL.LJIIZILJ(i2, j, j2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS88S0101000_28(this, i2, 0), new AfS197S0100000_28(this, 70)));
    }

    public final void SR(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i != 1 && i == 4) {
            C1841350y17 c1841350y17 = this.LLJI;
            if (c1841350y17 != null) {
                if (i2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1841350y17.setChecked(z2);
            }
            C1841350y17 c1841350y172 = this.LLJIJIL;
            if (c1841350y172 != null) {
                if (i2 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                c1841350y172.setChecked(z);
            }
            C1841350y17 c1841350y173 = this.LLJILJIL;
            if (c1841350y173 != null) {
                if (i2 != 3) {
                    z3 = false;
                }
                c1841350y173.setChecked(z3);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView = (TextView) NR().findViewById(R.id.q_j);
        TuxTextView tuxTextView = (TuxTextView) NR().findViewById(R.id.bcb);
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.rlq);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = viewFindViewById;
        }
        TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById.findViewById(R.id.q_j);
        if (this.LLILLJJLI == 5) {
            View viewFindViewById2 = this.LLIZLLLIL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.rlq);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLIZLLLIL = viewFindViewById2;
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            View viewFindViewById3 = this.LLJ;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.q1m);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJ = (TuxTextView) viewFindViewById3;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById3, 0);
            textView.setText(getString(2131849282));
            String nickname = this.LL.getNickname();
            if (nickname != null && nickname.length() > 0) {
                tuxTextView.setText(getString(2131849284, nickname));
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
        if ((this.LLILLJJLI & 4) == 4) {
            this.LLJI = (C1841350y17) NR().findViewById(R.id.awu);
            this.LLJIJIL = (C1841350y17) NR().findViewById(R.id.q_g);
            this.LLJILJIL = (C1841350y17) NR().findViewById(R.id.pb0);
            C1841350y17 c1841350y17 = this.LLJI;
            if (c1841350y17 != null) {
                c1841350y17.setInterceptToggleListener(new AwS572S0100000_28(this, 295));
            }
            C1841350y17 c1841350y172 = this.LLJIJIL;
            if (c1841350y172 != null) {
                c1841350y172.setInterceptToggleListener(new AwS572S0100000_28(this, 296));
            }
            C1841350y17 c1841350y173 = this.LLJILJIL;
            if (c1841350y173 != null) {
                c1841350y173.setInterceptToggleListener(new AwS572S0100000_28(this, 297));
            }
            this.LLJILJILJ = (LinearLayout) NR().findViewById(R.id.awv);
            this.LLJILLL = (LinearLayout) NR().findViewById(R.id.q_h);
            this.LLJJ = (LinearLayout) NR().findViewById(R.id.pb1);
            LinearLayout linearLayout = this.LLJILJILJ;
            if (linearLayout != null) {
                C786410Ut5.R7(linearLayout, this);
            }
            LinearLayout linearLayout2 = this.LLJILLL;
            if (linearLayout2 != null) {
                C786410Ut5.R7(linearLayout2, this);
            }
            LinearLayout linearLayout3 = this.LLJJ;
            if (linearLayout3 != null) {
                C786410Ut5.R7(linearLayout3, this);
            }
            C11EA.LJIIJ(this, (JediViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.10Jn
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ResponseState) obj).getNetworkEvent();
                }
            }, new C2217381BqS() { // from class: X.0ihz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((ResponseState) obj).getPushState());
                }
            }, new C2217381BqS() { // from class: X.10Jk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((ResponseState) obj).getStatusCode());
                }
            }, new C19336710kv(this, 2));
            SR(4, PR(4));
        }
        C10EJ c10ej = C10EJ.LIZ;
        Map<String, String> map = this.LLILZLL;
        c10ej.getClass();
        C10EJ.LJFF("change_notification", map);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public final void VR(Integer num, Integer num2, boolean z) {
        Integer num3;
        if (!z) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131849291);
            c1389890mGx.LJIIJJI();
            return;
        }
        if (num != null) {
            if (num.intValue() == 4) {
                if (num2 != null) {
                    if (num2.intValue() == 1) {
                        num3 = 2131849293;
                    } else if (num2.intValue() == 2) {
                        num3 = 2131849295;
                    } else if (num2.intValue() != 3) {
                        return;
                    } else {
                        num3 = 2131849297;
                    }
                } else {
                    return;
                }
            } else {
                if (num.intValue() != 1 || num2 == null) {
                    return;
                }
                if (num2.intValue() == 1) {
                    num3 = 2131849292;
                } else if (num2.intValue() == 2) {
                    num3 = 2131849294;
                } else if (num2.intValue() != 3) {
                    return;
                } else {
                    num3 = 2131849296;
                }
            }
            if (num3 != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                c1389890mGx2.LJIIIZ(num3.intValue());
                c1389890mGx2.LJIIJJI();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dfb, viewGroup, false);
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

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public NotificationSettingFragment(User user, int i, String str, String str2, C10EW c10ew, Map<String, String> map) {
        this.LL = user;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c10ew;
        this.LLILZLL = map;
        AFwS315S0000000_28 aFwS315S0000000_28 = AFwS315S0000000_28.get$arr$(16);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationLiveViewModel.class);
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c19719912DlLIZ, 298);
        this.LLJJI = new lifecycleAwareLazy(this, awS572S0100000_28, new AwS156S0400000_28(this, awS572S0100000_28, c19719912DlLIZ, aFwS315S0000000_28, 5));
        this.LLJJIII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(250));
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = new AnonymousClass0412();
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public /* synthetic */ NotificationSettingFragment(User user, int i, String str, String str2, C10EW c10ew, int i2) {
        this(user, i, (i2 & 4) != 0 ? "" : str, (i2 & 8) == 0 ? str2 : "", (i2 & 16) != 0 ? null : c10ew, (Map<String, String>) ((i2 & 32) != 0 ? C2097608Jq.LJ() : null));
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
