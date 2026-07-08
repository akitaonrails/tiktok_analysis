package com.ss.android.ugc.aweme.live.notification.ui;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.C004I;
import X.C011Z;
import X.C03H5;
import X.C098200Yq;
import X.C0OVM;
import X.C0ZP4;
import X.C1022820ciu;
import X.C10EF;
import X.C10EJ;
import X.C10EK;
import X.C10EW;
import X.C1119850fFP;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11GO;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C1233040iBy;
import X.C1252380ihA;
import X.C127K;
import X.C1365450ldX;
import X.C1391190mJ3;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C1770850wBP;
import X.C1841350y17;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C343970De7;
import X.C422820Gi0;
import X.C444920HcY;
import X.C735350Ssv;
import X.C736680Sv4;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.C824390WVp;
import X.DialogC1239500iMO;
import X.DialogC19728412Gs;
import X.DialogInterfaceOnCancelListenerC19332810kI;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.InterfaceC0148002o;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC19225710Jj;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveControllableDialogFragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class NotificationLiveBottomDialog extends LiveControllableDialogFragment implements InterfaceC1171660gay, InterfaceC724530SbT, InterfaceC1075600e62<AnonymousClass0412> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9Jio4ICk6KyHELIOSQ4ICA9ZjAlZwE8PCwqICwyPCwjJwM6PiAOJjsnJygIIC4/JyI=";
    public final User LL;
    public final InterfaceC19225710Jj LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final AwemeRawAd LLIZLLLIL;
    public final C10EW LLJ;
    public C422820Gi0 LLJI;
    public ConstraintLayout LLJIJIL;
    public ScrollView LLJILJIL;
    public FrameLayout LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxNavBar LLJJIII;
    public TuxTextView LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public C127K LLJLIL;
    public C1841350y17 LLJLILLLLZIIL;
    public C1841350y17 LLJLL;
    public C1841350y17 LLJLLIL;
    public TuxTextView LLJLLL;
    public LinearLayout LLJZ;
    public final AnonymousClass0412 LLJZIJLIL;
    public final DialogC1239500iMO LLL;
    public final C11NJ LLLF;
    public final lifecycleAwareLazy LLLFF;
    public final lifecycleAwareLazy LLLFFI;
    public final DialogInterfaceOnDismissListenerC19333210kM LLLFZ;
    public final DialogInterfaceOnCancelListenerC19332810kI LLLI;

    public NotificationLiveBottomDialog() {
        this(null, null, false, "", "", "", "", null, null);
    }

    public final void clearFromXmlViewCache() {
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
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLLL = null;
        this.LLJZ = null;
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

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void NR() {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "save", this.LLIZLLLIL);
        c1022820ciuLIZLLL.LIZJ("manage_page", "refer");
        c1022820ciuLIZLLL.LIZIZ(this.LLIZ, "enter_from");
        c1022820ciuLIZLLL.LIZIZ(1, "success");
        c1022820ciuLIZLLL.LJII();
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131835040);
        c1233040iBy.LIZLLL();
    }

    public final void OR() {
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131838302);
        c1233040iBy.LIZLLL();
    }

    public final void PR() {
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131848597);
        c1233040iBy.LIZLLL();
    }

    public final void RR() {
        User user = this.LL;
        int i = (user == null || user.getFollowStatus() != 0) ? 0 : 1;
        UserViewModel userViewModel = (UserViewModel) this.LLLFFI.getValue();
        C0OVM c0ovm = new C0OVM();
        User user2 = this.LL;
        c0ovm.LIZJ(user2 != null ? user2.getUid() : null);
        User user3 = this.LL;
        c0ovm.LIZIZ(user3 != null ? user3.getSecUid() : null);
        C1252380ihA c1252380ihA = c0ovm.LIZ;
        c1252380ihA.LIZLLL = i;
        c1252380ihA.LJI = "other_places";
        c1252380ihA.LJ = 0;
        User user4 = this.LL;
        c0ovm.LIZ.LJIIJJI = user4 != null ? user4.getFollowerStatus() : 0;
        userViewModel.hR2(c0ovm.LIZ());
        User user5 = this.LL;
        String str = (user5 == null || user5.getFollowerStatus() != 1) ? "single" : "mutual";
        C735350Ssv c735350Ssv = new C735350Ssv();
        User user6 = this.LL;
        c735350Ssv.LJJLIIIJJIZ = user6 != null ? user6.getUid() : null;
        c735350Ssv.LIZLLL = this.LLILZ;
        c735350Ssv.LJJLIIJ = "notification_bell";
        c735350Ssv.LJJLIIIJ = this.LLILZIL;
        c735350Ssv.LJJLIIIJILLIZJL = Intrinsics.LJFF(this.LLILZLL, "") ? "other_places" : this.LLILZLL;
        c735350Ssv.LJJZ = str;
        User user7 = this.LL;
        c735350Ssv.LJLIIIL = (user7 == null || !user7.isSecret()) ? 0 : 1;
        C1365450ldX.LIZLLL(c735350Ssv, this.LL);
        c735350Ssv.LJIILJJIL();
        C10EJ c10ej = C10EJ.LIZ;
        User user8 = this.LL;
        String uid = user8 != null ? user8.getUid() : null;
        User user9 = this.LL;
        int followStatus = user9 != null ? user9.getFollowStatus() : 0;
        User user10 = this.LL;
        boolean z = user10 != null && user10.getAccountType() == 3;
        c10ej.getClass();
        C10EJ.LJII(followStatus, uid, z);
    }

    public final C1841350y17 UR() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ax0) : null;
            this.LLJLILLLLZIIL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iec) : null;
            this.LLJJIJIIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C422820Gi0 WR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ies) : null;
            this.LLJI = (C422820Gi0) viewFindViewById;
        }
        return (C422820Gi0) viewFindViewById;
    }

    public final ConstraintLayout ZR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iew) : null;
            this.LLJIJIL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C1841350y17 aS() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pi3) : null;
            this.LLJLLIL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final LinearLayout bS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.six) : null;
            this.LLJZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final ConstraintLayout cS() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.siy) : null;
            this.LLJJJJLIIL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C127K dS() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sj4) : null;
            this.LLJLIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    public final ScrollView gS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sj5) : null;
            this.LLJILJIL = (ScrollView) viewFindViewById;
        }
        return (ScrollView) viewFindViewById;
    }

    public final TuxTextView hS() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sjb) : null;
            this.LLJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1841350y17 iS() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sy2) : null;
            this.LLJLL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final FrameLayout kS() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqy) : null;
            this.LLJJIJIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final void mS() {
        CommerceUserInfo commerceUserInfo;
        Resources resources;
        C10EF c10efLIZIZ;
        String strLIZLLL;
        C10EW c10ew = this.LLJ;
        boolean z = false;
        if (c10ew != null && (strLIZLLL = c10ew.LIZLLL()) != null && strLIZLLL.length() != 0) {
            C786410Ut5.LLLLZLL(hS(), 0);
            hS().setText(c10ew.LIZLLL());
        }
        View viewFindViewById = this.LLJJJIL;
        String string = null;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.awz) : null;
            this.LLJJJIL = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(2131842793);
        View viewFindViewById2 = this.LLJJJJ;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.sy1) : null;
            this.LLJJJJ = (TuxTextView) viewFindViewById2;
        }
        ((TextView) viewFindViewById2).setText(2131842795);
        View viewFindViewById3 = this.LLJJJJJIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            viewFindViewById3 = view3 != null ? view3.findViewById(R.id.pi2) : null;
            this.LLJJJJJIL = (TuxTextView) viewFindViewById3;
        }
        ((TextView) viewFindViewById3).setText(2131842794);
        C786410Ut5.LLLLZLL(hS(), 8);
        C786410Ut5.Y7(cS(), new ACListenerS162S0100000_28(this, 56));
        View viewFindViewById4 = this.LLJJL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            viewFindViewById4 = view4 != null ? view4.findViewById(R.id.sj9) : null;
            this.LLJJL = (ConstraintLayout) viewFindViewById4;
        }
        C786410Ut5.Y7((ConstraintLayout) viewFindViewById4, new ACListenerS162S0100000_28(this, 57));
        View viewFindViewById5 = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            viewFindViewById5 = view5 != null ? view5.findViewById(R.id.sj8) : null;
            this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) viewFindViewById5;
        }
        C786410Ut5.Y7((ConstraintLayout) viewFindViewById5, new ACListenerS162S0100000_28(this, 58));
        View viewFindViewById6 = this.LLJL;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            viewFindViewById6 = view6 != null ? view6.findViewById(R.id.siz) : null;
            this.LLJL = (TuxIconView) viewFindViewById6;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById6, new ACListenerS162S0100000_28(this, 59));
        User user = this.LL;
        MR(user != null ? user.getLivePushNotificationStatus() : 1);
        C10EW c10ew2 = this.LLJ;
        if (c10ew2 != null && (c10efLIZIZ = c10ew2.LIZIZ()) != null) {
            C10EJ.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", c10efLIZIZ.LIZJ);
            c2344009Gk.LJIIIIZZ("enter_method", c10efLIZIZ.LIZLLL);
            c2344009Gk.LJIIIIZZ("room_id", c10efLIZIZ.LIZ);
            c2344009Gk.LJIIIIZZ("anchor_id", c10efLIZIZ.LIZIZ);
            c2344009Gk.LJII(c10efLIZIZ.LJ);
            C20684815ws.LJIILLIIL("livesdk_live_notification_show", c2344009Gk.LIZ);
        }
        AwemeRawAd awemeRawAd = this.LLIZLLLIL;
        if (awemeRawAd == null || awemeRawAd.getNotificationConfig() != 1) {
            C786410Ut5.LJZL(8, bS());
            return;
        }
        View viewFindViewById7 = this.LLJLLL;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            viewFindViewById7 = view7 != null ? view7.findViewById(R.id.sj_) : null;
            this.LLJLLL = (TuxTextView) viewFindViewById7;
        }
        TextView textView = (TextView) viewFindViewById7;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            string = resources.getString(2131835043);
        }
        textView.setText(string);
        C786410Ut5.LJZL(0, bS());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cS().getLayoutParams();
        marginLayoutParams.topMargin = 0;
        C786410Ut5.m6(cS(), marginLayoutParams);
        dS().setOnClickListener(new AwS607S0100000_28(this, 237));
        C11GO c11go = (C11GO) dS().getAccessory();
        User user2 = this.LL;
        if (user2 != null && (commerceUserInfo = user2.getCommerceUserInfo()) != null && commerceUserInfo.getNotificationConfig() == 1) {
            z = true;
        }
        c11go.LJIILJJIL(z);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "othershow", this.LLIZLLLIL);
        c1022820ciuLIZLLL.LIZJ("manage_page", "refer");
        c1022820ciuLIZLLL.LIZIZ(this.LLIZ, "enter_from");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LLLF.LJ();
        clearFromXmlViewCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C824390WVp.LIZJ(getContext())) {
            C10EK.LIZ.getClass();
            if (C10EK.LJII("live_push")) {
                return;
            }
        }
        dismiss();
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLJZIJLIL;
    }

    public final void MR(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    UR().setChecked(false);
                    iS().setChecked(false);
                    aS().setChecked(true);
                    return;
                }
                return;
            }
            UR().setChecked(false);
            iS().setChecked(true);
            aS().setChecked(false);
            return;
        }
        UR().setChecked(true);
        iS().setChecked(false);
        aS().setChecked(false);
    }

    public final void nS(int i) {
        String secUid;
        C10EF c10efLIZIZ;
        DialogC1239500iMO dialogC1239500iMO = this.LLL;
        if (dialogC1239500iMO != null) {
            dialogC1239500iMO.show();
            C785410UrT.LIZIZ(dialogC1239500iMO);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC1239500iMO);
            C816490W1f.LIZ(dialogC1239500iMO);
        }
        NotificationLiveViewModel notificationLiveViewModel = (NotificationLiveViewModel) this.LLLFF.getValue();
        User user = this.LL;
        if (user == null || (secUid = user.getSecUid()) == null) {
            secUid = "";
        }
        notificationLiveViewModel.hR2(i, secUid);
        C10EW c10ew = this.LLJ;
        if (c10ew != null && (c10efLIZIZ = c10ew.LIZIZ()) != null) {
            C10EJ.LIZ.getClass();
            C10EJ.LIZJ(c10efLIZIZ, i);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean z;
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (!c1119850fFP.LJIJJ(getContext()) && c1119850fFP.LJIIZILJ(getContext())) {
            z = true;
        } else {
            z = false;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (z) {
            return layoutInflaterOnGetLayoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), c1119850fFP.LJIIIZ()));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public static SpannableString SR(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), 0, str.length(), 33);
        C786410Ut5.p2(spannableString, new C444920HcY(61, false), str.length(), str.length() + str2.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028f  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dck, viewGroup, false);
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

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
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

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationLiveBottomDialog(User user, InterfaceC19225710Jj interfaceC19225710Jj, boolean z, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, C10EW c10ew) {
        DialogC1239500iMO dialogC1239500iMO;
        this.LL = user;
        this.LLILLJJLI = interfaceC19225710Jj;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = awemeRawAd;
        this.LLJ = c10ew;
        this.LLJZIJLIL = new AnonymousClass0412();
        Context context = getContext();
        if (context != null) {
            dialogC1239500iMO = new DialogC19728412Gs(context) { // from class: X.0iMO
                @Override // android.app.Dialog
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    setContentView(C786410Ut5.Sd(R.layout.dcj, C786410Ut5.ne(getContext()), null));
                    C1235900iGa c1235900iGa = (C1235900iGa) findViewById(R.id.nl1);
                    if (c1235900iGa != null) {
                        C786410Ut5.LLLLIIL(c1235900iGa, 0);
                    }
                    Window window = getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    Window window2 = getWindow();
                    if (window2 != null) {
                        window2.setLayout(-1, -1);
                    }
                }
            };
        } else {
            dialogC1239500iMO = 0;
        }
        this.LLL = dialogC1239500iMO;
        this.LLLF = new C11NJ();
        AFwS303S0000000_19 aFwS303S0000000_19 = AFwS303S0000000_19.get$arr$(16);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationLiveViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1613);
        this.LLLFF = new lifecycleAwareLazy(this, awS563S0100000_19, new AwS156S0400000_28(this, awS563S0100000_19, c19719912DlLIZ, aFwS303S0000000_19, 6));
        AwS633S0100000_19 awS633S0100000_19 = new AwS633S0100000_19(this, 59);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(UserViewModel.class);
        AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c19719912DlLIZ2, 1614);
        this.LLLFFI = new lifecycleAwareLazy(this, awS563S0100000_192, new AwS156S0400000_28(this, awS563S0100000_192, c19719912DlLIZ2, awS633S0100000_19, 7));
        this.LLLFZ = new DialogInterfaceOnDismissListenerC19333210kM(this, 6);
        this.LLLI = new DialogInterfaceOnCancelListenerC19332810kI(this, 3);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
