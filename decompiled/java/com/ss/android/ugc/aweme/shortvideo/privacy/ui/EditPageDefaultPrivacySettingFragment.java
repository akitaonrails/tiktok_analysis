package com.ss.android.ugc.aweme.shortvideo.privacy.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C10BZ;
import X.C10CK;
import X.C1250250idj;
import X.C127K;
import X.C1308910kAL;
import X.C1428470nHB;
import X.C1644450stX;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2274431E0r;
import X.C298680BnG;
import X.C341940Daq;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommentSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.DuetSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import uxk.a;

/* JADX INFO: loaded from: classes29.dex */
public final class EditPageDefaultPrivacySettingFragment extends PublishDefaultPermissionFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9ODclPy4wHELIOSMWs5IGEWLCw4GS40LQEpLy4mJDEcOyYlKSY1GionPCwiLgkhKSIhLCEn";
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public LinearLayout LLJZ;
    public TuxTextView LLJZIJLIL;
    public C127K LLL;
    public C127K LLLF;
    public C127K LLLFF;
    public CommentSettingItemStatus LLLFFI;
    public C127K LLLFZ;
    public DuetSettingItemStatus LLLI;
    public C127K LLLII;
    public StitchSettingItemStatus LLLIIII;
    public C127K LLLIIIIL;
    public C127K LLLIIIL;
    public C127K LLLIIL;
    public C127K LLLIILIL;
    public C127K LLLIL;
    public int LLLILZ;

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final String WR() {
        return "video_edit_page";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final String ZR() {
        return "video_edit_page";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final void iS() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final void MR() {
        ViewGroup viewGroup = (ViewGroup) this.LLJJJ.getValue();
        if (viewGroup != null) {
            ComplianceServiceProvider.LJIJJ().LJIILIIL("video_publish_edit_menu_gear_icon", viewGroup);
        }
    }

    public final void NS() {
        if (this.LLLILZ == 0) {
            C786410Ut5.LLLLZLL(US(), 8);
            C786410Ut5.LJZL(8, RS());
            return;
        }
        C786410Ut5.LLLLZLL(US(), 0);
        C786410Ut5.LJZL(0, RS());
        if (this.LLLILZ > 1) {
            RS().setPadding(0, C341940Daq.LIZ(6.0d), 0, C341940Daq.LIZ(6.0d));
        } else {
            RS().setPadding(0, 0, 0, 0);
        }
    }

    public final C127K PS() {
        View viewFindViewById = this.LLLF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eut) : null;
            this.LLLF = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final int RR() {
        a.LIZ.getClass();
        return a.LIZ() == 4 ? a.LIZJ() : a.LIZ();
    }

    public final LinearLayout RS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rub) : null;
            this.LLJZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView US() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ruc) : null;
            this.LLJLLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final int yS() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment, X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Context context;
        Integer numPR;
        View view = getView();
        if (view == null || (context = view.getContext()) == null) {
            context = getContext();
        }
        int iIntValue = (context == null || (numPR = PublishDefaultPermissionFragment.PR(context)) == null) ? 0 : numPR.intValue();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZIZ(PublishDefaultPermissionFragment.NR(getString(2131823353), new AwS572S0100000_28(this, 556)));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(((Number) C2274431E0r.LIZIZ.getValue()).intValue());
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        c0om1.LIZJ(iIntValue);
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        VideoPublishEditModel videoPublishEditModel = aS().getVideoPublishEditModel();
        if (videoPublishEditModel == null) {
            return;
        }
        if (mS() && this.LLJJL == 2) {
            OR(1);
        }
        boolean z = videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2;
        C10CK c10ck = this.LLJJJJJIL;
        if (c10ck != null) {
            c10ck.LJ.setValue(new C1644450stX<>(new Pair(Boolean.valueOf(z), "")));
        }
        if (z && this.LLJJL == 1) {
            OR(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final int uS() {
        return C10BZ.LIZ() ? R.style.al3 : R.style.my;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final int wS() {
        return C10BZ.LIZ() ? R.drawable.co7 : R.drawable.aqj;
    }

    public static HashMap QS(VideoPublishEditModel videoPublishEditModel) {
        HashMap map = new HashMap();
        map.put("creation_id", videoPublishEditModel.getCreationId());
        map.put("enter_from", "video_edit_page");
        map.put("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        map.put("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        map.put("shoot_way", str);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final void JS(View view) {
        super.JS(view);
        View viewFindViewById = null;
        if (C10BZ.LIZ()) {
            C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))), 23);
            LinearLayout linearLayoutRS = RS();
            if (linearLayoutRS != null) {
                linearLayoutRS.setBackgroundResource(R.drawable.co7);
                C426750GoL.LJIIIZ(linearLayoutRS, Integer.valueOf(yS()), null, Integer.valueOf(yS()), null, false, 26);
            }
            View viewFindViewById2 = view.findViewById(R.id.eux);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackgroundResource(R.drawable.co7);
                C426750GoL.LJIIIZ(viewFindViewById2, Integer.valueOf(yS()), null, Integer.valueOf(yS()), null, false, 26);
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            View viewFindViewById3 = this.LLJLLIL;
            if (viewFindViewById3 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.visibility_header);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJLLIL = (TuxTextView) viewFindViewById3;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById3;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, false, 26);
                CharSequence charSequenceGS = gS();
                if (charSequenceGS != null) {
                    tuxTextView.setText(charSequenceGS);
                }
            }
            TuxTextView tuxTextViewUS = US();
            if (tuxTextViewUS != null) {
                C426750GoL.LJIIIZ(tuxTextViewUS, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, false, 26);
            }
            View view3 = this.LLJZIJLIL;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.aj2);
                }
                this.LLJZIJLIL = (TuxTextView) viewFindViewById;
                view3 = viewFindViewById;
            }
            if (view3 != null) {
                C426750GoL.LJIIIZ(view3, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, false, 26);
                return;
            }
            return;
        }
        View view5 = this.LLJLLIL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.visibility_header);
            }
            this.LLJLLIL = (TuxTextView) viewFindViewById;
            view5 = viewFindViewById;
        }
        TuxTextView tuxTextView2 = (TuxTextView) view5;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final void OR(int i) {
        C10CK c10ck = this.LLJJJJJIL;
        if (c10ck != null) {
            c10ck.LIZJ(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final String VR(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return "";
                    }
                    return "edit_privacy_visibility_options_subscriber";
                }
                return "edit_privacy_visibility_options_friend_visible";
            }
            if (mS()) {
                return "edit_privacy_visibility_options_available_for_ads";
            }
            return "edit_privacy_visibility_options_private";
        }
        return "edit_privacy_visibility_options_public";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final void kS(Context context) {
        if (C298680BnG.LIZ()) {
            super.kS(context);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment
    public final void sS(View view) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        super.sS(view);
        if (!C298680BnG.LIZ() && (videoPublishEditModel = aS().getVideoPublishEditModel()) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null) {
            privacySettingModel.isSubscribeOnly = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:325:0x0879  */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, X.10Ij, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.privacy.ui.EditPageDefaultPrivacySettingFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        Integer numLIZJ;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            context = getContext();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, uS());
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(contextThemeWrapper), R.layout.c9e, viewGroup, false);
        if (C10BZ.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, contextThemeWrapper)) != null) {
            viewTd.setBackgroundColor(numLIZJ.intValue());
        }
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
