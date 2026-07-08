package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.AbstractC214823195h;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0NKE;
import X.C1308910kAL;
import X.C1398410mUh;
import X.C13LE;
import X.C14EU;
import X.C1622206Wu;
import X.C1935107i1;
import X.C19651011uW;
import X.C19719912Dl;
import X.C19EG;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C338490DOt;
import X.C339190DRl;
import X.C344010DeB;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616360OFm;
import X.C616540OGe;
import X.C724750Sbp;
import X.C730000SkI;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC1400710mYP;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.AsS36S0100000_9;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS125S1200000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2stLSsqJzA+OmEmIWsqHELIOSOy40JSAiPWESLCEVJjohOwEpPS46JAQ7LCI2BCw/PQkhKSIhLCEn";
    public final AssemVMLazy LLLILZLLLI;
    public final float LLLIZZ;
    public AddYoursTopic LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursDetailAwemeListFragment.class, "detailVM", "getDetailVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initData() {
        this.LLLFFI = true;
        super.initData();
    }

    public AddYoursDetailAwemeListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1646);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(696);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1647), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1648), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1649), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLILZLLLI = assemVMLazy;
        this.LLLIZZ = C339190DRl.LIZ(100);
        this.LLLJIL = C1935107i1.LIZ(new AwS125S1200000_9(this, "from_aweme", (Object) null, 4));
        this.LLLJL = C1935107i1.LIZ(new AwS125S1200000_9(this, "detail_aweme_from", (Object) null, 5));
        this.LLLL = C1935107i1.LIZ(AFwS195S0000000_9.get$arr$(362));
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddYoursDetailAwemeListFragment.class.getName());
        }
        super.onResume();
        C730000SkI.LIZIZ.LIZJ(249372161, 3);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initArguments(Bundle bundle) {
        Serializable serializable;
        super.initArguments(bundle);
        AddYoursTopic addYoursTopic = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("topic");
        } else {
            serializable = null;
        }
        if (serializable instanceof AddYoursTopic) {
            addYoursTopic = (AddYoursTopic) serializable;
        }
        this.LLLJ = addYoursTopic;
    }

    @C14EU
    public final void onTopicUpdated(C0NKE c0nke) {
        C616360OFm c616360OFm;
        Long topicId = c0nke.LIZ.getTopicId();
        AddYoursTopic addYoursTopic = this.LLLJ;
        Long topicId2 = null;
        if (addYoursTopic != null) {
            topicId2 = addYoursTopic.getTopicId();
        }
        if (Intrinsics.LJFF(topicId, topicId2)) {
            this.LLLJ = c0nke.LIZ;
            InterfaceC1400710mYP interfaceC1400710mYP = this.LLLILZJ;
            if ((interfaceC1400710mYP instanceof C616360OFm) && (c616360OFm = (C616360OFm) interfaceC1400710mYP) != null) {
                c616360OFm.updateTopic(c0nke.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void rS(RecyclerView.LayoutManager layoutManager) {
        GridLayoutManager gridLayoutManager;
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJI(new AbstractC214823195h() { // from class: X.0OFj
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    int i2;
                    C616360OFm c616360OFm;
                    C616350OFl presenter$addyours_release;
                    C0OCM c0ocm;
                    if (i == 0) {
                        return this.LJ.bS();
                    }
                    InterfaceC1400710mYP interfaceC1400710mYP = this.LJ.LLLILZJ;
                    if ((interfaceC1400710mYP instanceof C616360OFm) && (c616360OFm = (C616360OFm) interfaceC1400710mYP) != null && (presenter$addyours_release = c616360OFm.getPresenter$addyours_release()) != null && (c0ocm = (C0OCM) presenter$addyours_release.LL) != null) {
                        i2 = c0ocm.LLIZLLLIL;
                    } else {
                        i2 = 0;
                    }
                    if (i >= i2 + 1) {
                        return this.LJ.bS();
                    }
                    return 1;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        String string;
        String string2;
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        Bundle arguments = getArguments();
        String aid = null;
        if (arguments != null) {
            string = arguments.getString("detail_aweme_from");
        } else {
            string = null;
        }
        AddYoursTopic addYoursTopic = this.LLLJ;
        if (addYoursTopic != null) {
            smartRouteNR.withParam("question_content", addYoursTopic.getText());
            smartRouteNR.withParam("show_add_yours_button", 1);
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string2 = arguments2.getString("add_yours_enter_from_before_detail_page")) != null) {
                string = string2;
            }
            smartRouteNR.withParam("add_yours_enter_from_before_detail_page", string);
            smartRouteNR.withParam("video_from", "add_yours");
            smartRouteNR.withParam("enter_from", "add_yours_detail_page");
            Aweme aweme2 = (Aweme) this.LLLJIL.getValue();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            smartRouteNR.withParam("from_group_id", aid);
        }
        return smartRouteNR;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        TuxTextView tuxTextView;
        super.onViewCreated(view, bundle);
        C426750GoL.LJIIL(this.LLJJIJIIJIL, null, null, null, Integer.valueOf((int) C339190DRl.LIZ(85)), 23);
        this.LLJJIJIIJIL.addOnScrollListener(new AsS36S0100000_9(this, 7));
        Context context = getContext();
        int i = 0;
        if (context != null && C960203pA.LIZIZ(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View[] viewArr = {this.LLJJIJIL.LIZJ(1), this.LLJJIJIL.LIZJ(2)};
            do {
                View view2 = viewArr[i];
                if ((view2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) view2) != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, tuxTextView.getContext());
                    if (numLIZJ != null) {
                        tuxTextView.setBackgroundColor(numLIZJ.intValue());
                    }
                    tuxTextView.setTextColorRes(R.attr.a1h);
                }
                i++;
            } while (i < 2);
        }
        C730000SkI.LIZIZ.LIZJ(249372161, 2);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void I2(Aweme aweme, View view, String str) {
        String aid;
        Long topicId;
        AddYoursTopic addYoursTopic;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, "aid_fake_topic_header")) {
            if (Intrinsics.LJFF(str, "click_invite")) {
                AddYoursTopic addYoursTopic2 = this.LLLJ;
                if (addYoursTopic2 != null) {
                    C344010DeB c344010DeB = C344010DeB.LIZIZ;
                    c344010DeB.LIZJ(getActivity(), c344010DeB.LIZIZ(), new AwS375S0200000_9(addYoursTopic2, this, 179));
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(str, "click_eoy_banner") || (addYoursTopic = this.LLLJ) == null) {
                return;
            }
            C19651011uW.LIZIZ.LJFF(getActivity(), "click_eoy_banner", addYoursTopic.getEoyCampaignSchema());
            return;
        }
        if (Intrinsics.LJFF(str, "_addyours_topic_report_link")) {
            AddYoursTopic addYoursTopic3 = this.LLLJ;
            if (addYoursTopic3 == null || (topicId = addYoursTopic3.getTopicId()) == null) {
                return;
            }
            long jLongValue = topicId.longValue();
            IReportService iReportService = (IReportService) this.LLLL.getValue();
            C19EG activity = getActivity();
            Uri.Builder builder = new Uri.Builder();
            builder.appendQueryParameter("object_id", String.valueOf(jLongValue));
            builder.appendQueryParameter("report_type", "add_yours");
            builder.appendQueryParameter("enter_from", "add_yours_detail_page");
            iReportService.LIZIZ(activity, builder);
            return;
        }
        xe(view, aweme, str, 0);
    }
}
