package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.C05P0;
import X.C098200Yq;
import X.C0HTI;
import X.C0OM1;
import X.C0TOM;
import X.C1251150ifB;
import X.C1674230tfZ;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20028913Yh;
import X.C746100TOm;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionNotificationPrompt extends Fragment implements InterfaceC344240DeY {
    public static TuxSheet LLIZ = null;
    public static SubscriptionVM LLIZLLLIL = null;
    public static AdFreeSubscription LLJ = null;
    public static PersonalizationViewModel LLJI = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6HELIOSKSsvLGEgPSc/Kj06ODElJiF9GzAuOiwhITU4ICA9Bio4ICk6KyQ4ICA9GDcjJD8n";
    public ImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C197039127h LLILZ;
    public Activity LLILZIL;
    public static final C1674230tfZ LLILZLL = new C1674230tfZ();
    public static final MutableLiveData<IapProductDetail> LLJIJIL = new MutableLiveData<>();
    public static final C05P0<Boolean> LLJILJIL = C20028913Yh.LJI(Boolean.FALSE);

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(AFwS199S0000000_12.get$arr$(158));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String string;
        Integer num2;
        super.onViewCreated(view, bundle);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.vs;
        Activity activity = this.LLILZIL;
        View viewFindViewById = null;
        if (activity == null) {
            activity = null;
        }
        Drawable drawableLIZ = c0hti.LIZ(activity);
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.vx0);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (ImageView) viewFindViewById2;
        }
        ((ImageView) viewFindViewById2).setImageDrawable(drawableLIZ);
        C0TOM.LIZ.getClass();
        AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
        if (adFreeSubscriptionLJ != null) {
            num = adFreeSubscriptionLJ.standardScheduledStartTime;
        } else {
            num = null;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            View viewFindViewById3 = this.LLILLJJLI;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.vx2);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById3;
            }
            TextView textView = (TextView) viewFindViewById3;
            C746100TOm c746100TOm = C746100TOm.LIZ;
            Activity activity2 = this.LLILZIL;
            if (activity2 == null) {
                activity2 = null;
            }
            String string2 = getString(2131849317);
            c746100TOm.getClass();
            textView.setText(C746100TOm.LJ(activity2, iIntValue, string2, "{date}"));
            View viewFindViewById4 = this.LLILLL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.vx1);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById4;
            }
            TextView textView2 = (TextView) viewFindViewById4;
            AdFreeSubscription adFreeSubscription = LLJ;
            if (adFreeSubscription != null && (num2 = adFreeSubscription.subscriptionMode) != null && num2.intValue() == 1) {
                string = getString(2131849319);
            } else {
                string = getString(2131849320);
            }
            textView2.setText(string);
        } else {
            View viewFindViewById5 = this.LLILLJJLI;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.vx2);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById5;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById5, 8);
            View viewFindViewById6 = this.LLILLL;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.vx1);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById6;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById6, 8);
        }
        View view7 = this.LLILZ;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById = view8.findViewById(R.id.vwz);
            }
            this.LLILZ = (C197039127h) viewFindViewById;
            view7 = viewFindViewById;
        }
        C786410Ut5.U8((C197039127h) view7, new View.OnClickListener() { // from class: X.0TNl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                boolean zLJFF;
                int i;
                int i2;
                Integer num3;
                C2344009Gk c2344009Gk = new C2344009Gk();
                AdFreeSubscription adFreeSubscription2 = SubscriptionNotificationPrompt.LLJ;
                if (adFreeSubscription2 != null) {
                    zLJFF = Intrinsics.LJFF(adFreeSubscription2.isShowStandardScheduledPopUp(), Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                if (zLJFF) {
                    i = 2;
                } else {
                    i = 5;
                }
                c2344009Gk.LIZJ(i, "prompt_type");
                AdFreeSubscription adFreeSubscription3 = SubscriptionNotificationPrompt.LLJ;
                if (adFreeSubscription3 != null && (num3 = adFreeSubscription3.subscriptionStatus) != null && num3.intValue() == 2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c2344009Gk.LIZJ(i2, "content_type");
                c2344009Gk.LIZJ(0, "click_value");
                C20684815ws.LJIILLIIL("click_tt_plus_coldstart_reminder", c2344009Gk.LIZ);
                TuxSheet tuxSheet = SubscriptionNotificationPrompt.LLIZ;
                if (tuxSheet == null) {
                    tuxSheet = null;
                }
                tuxSheet.dismiss();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bfj, viewGroup, false);
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
