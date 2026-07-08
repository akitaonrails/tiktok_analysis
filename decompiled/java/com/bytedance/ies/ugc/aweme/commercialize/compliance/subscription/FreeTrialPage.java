package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.C098200Yq;
import X.C0HTI;
import X.C0TNG;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C419910GdJ;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.FreeTrialPage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class FreeTrialPage extends Fragment {
    public static C0TNG LLJILJILJ = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyHELIOSp9KyohOSM6KSsvLGEgPSc/Kj06ODElJiF9DjcpLBshISQgGS40LQ==";
    public AdFreeTrialPageInfo LL;
    public Context LLILLJJLI;
    public ImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C197039127h LLJILJIL;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LL = (AdFreeTrialPageInfo) arguments.getParcelable("page_data");
            arguments.getInt("enter_from");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawableLIZ;
        String str;
        String str2;
        String str3;
        String str4;
        Description description;
        Description description2;
        String str5;
        Description description3;
        Description description4;
        String str6;
        Description description5;
        Description description6;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LLILLJJLI = context;
        this.LLILLL = (ImageView) view.findViewById(R.id.il7);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.ile);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.il8);
        this.LLJ = (TuxTextView) view.findViewById(R.id.il9);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.il_);
        this.LLJI = (TuxTextView) view.findViewById(R.id.ila);
        this.LLIZ = (TuxIconView) view.findViewById(R.id.ilb);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.ilc);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.ild);
        this.LLJILJIL = (C197039127h) view.findViewById(R.id.il6);
        Context context2 = this.LLILLJJLI;
        C197039127h c197039127h = null;
        if (context2 != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.pt;
            drawableLIZ = c0hti.LIZ(context2);
        } else {
            drawableLIZ = null;
        }
        ImageView imageView = this.LLILLL;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawableLIZ);
        AdFreeTrialPageInfo adFreeTrialPageInfo = this.LL;
        if (adFreeTrialPageInfo != null) {
            if (!TextUtils.isEmpty(adFreeTrialPageInfo.getTitle())) {
                TuxTextView tuxTextView = this.LLILZ;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                tuxTextView.setText(adFreeTrialPageInfo.getTitle());
                TuxTextView tuxTextView2 = this.LLILZ;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            if (!TextUtils.isEmpty(adFreeTrialPageInfo.getSubtitle())) {
                TuxTextView tuxTextView3 = this.LLILZIL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setText(adFreeTrialPageInfo.getSubtitle());
                TuxTextView tuxTextView4 = this.LLILZIL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.nx);
            List<Description> description7 = adFreeTrialPageInfo.getDescription();
            if (description7 != null && (description6 = (Description) C13LP.LJJJLZIJ(0, description7)) != null) {
                str = description6.title;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                TuxTextView tuxTextView5 = this.LLJ;
                if (tuxTextView5 == null) {
                    tuxTextView5 = null;
                }
                List<Description> description8 = adFreeTrialPageInfo.getDescription();
                if (description8 != null && (description5 = (Description) C13LP.LJJJLZIJ(0, description8)) != null) {
                    str6 = description5.title;
                } else {
                    str6 = null;
                }
                tuxTextView5.setText(str6);
                TuxIconView tuxIconView = this.LLILZLL;
                if (tuxIconView == null) {
                    tuxIconView = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                TuxIconView tuxIconView2 = this.LLILZLL;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                tuxIconView2.setTuxIcon(c419910GdJ);
                TuxTextView tuxTextView6 = this.LLJ;
                if (tuxTextView6 == null) {
                    tuxTextView6 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView6, 0);
            }
            List<Description> description9 = adFreeTrialPageInfo.getDescription();
            if (description9 != null && (description4 = (Description) C13LP.LJJJLZIJ(1, description9)) != null) {
                str2 = description4.title;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                TuxTextView tuxTextView7 = this.LLJI;
                if (tuxTextView7 == null) {
                    tuxTextView7 = null;
                }
                List<Description> description10 = adFreeTrialPageInfo.getDescription();
                if (description10 != null && (description3 = (Description) C13LP.LJJJLZIJ(1, description10)) != null) {
                    str5 = description3.title;
                } else {
                    str5 = null;
                }
                tuxTextView7.setText(str5);
                TuxIconView tuxIconView3 = this.LLIZ;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                TuxIconView tuxIconView4 = this.LLIZ;
                if (tuxIconView4 == null) {
                    tuxIconView4 = null;
                }
                tuxIconView4.setTuxIcon(c419910GdJ);
                TuxTextView tuxTextView8 = this.LLJI;
                if (tuxTextView8 == null) {
                    tuxTextView8 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView8, 0);
            }
            List<Description> description11 = adFreeTrialPageInfo.getDescription();
            if (description11 != null && (description2 = (Description) C13LP.LJJJLZIJ(2, description11)) != null) {
                str3 = description2.title;
            } else {
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                TuxTextView tuxTextView9 = this.LLJIJIL;
                if (tuxTextView9 == null) {
                    tuxTextView9 = null;
                }
                List<Description> description12 = adFreeTrialPageInfo.getDescription();
                if (description12 != null && (description = (Description) C13LP.LJJJLZIJ(2, description12)) != null) {
                    str4 = description.title;
                } else {
                    str4 = null;
                }
                tuxTextView9.setText(str4);
                TuxIconView tuxIconView5 = this.LLIZLLLIL;
                if (tuxIconView5 == null) {
                    tuxIconView5 = null;
                }
                tuxIconView5.setTuxIcon(c419910GdJ);
                TuxIconView tuxIconView6 = this.LLIZLLLIL;
                if (tuxIconView6 == null) {
                    tuxIconView6 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
                TuxTextView tuxTextView10 = this.LLJIJIL;
                if (tuxTextView10 == null) {
                    tuxTextView10 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView10, 0);
            }
            C197039127h c197039127h2 = this.LLJILJIL;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            c197039127h2.setText(adFreeTrialPageInfo.getButtonText());
        }
        C197039127h c197039127h3 = this.LLJILJIL;
        if (c197039127h3 != null) {
            c197039127h = c197039127h3;
        }
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0TNE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C20684815ws.LJIILLIIL("click_ad_free_trial_prompt", new C2344009Gk().LIZ);
                C0TNG c0tng = FreeTrialPage.LLJILJILJ;
                if (c0tng != null) {
                    c0tng.LIZ();
                }
            }
        });
        C20684815ws.LJIILLIIL("show_ad_free_trial_prompt", new C2344009Gk().LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bfd, viewGroup, false);
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
