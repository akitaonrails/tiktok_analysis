package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0CRW;
import X.C0DOO;
import X.C0DV2;
import X.C0DV3;
import X.C0M6J;
import X.C0PEM;
import X.C1391190mJ3;
import X.C14TF;
import X.C1558360qeg;
import X.C1558520qew;
import X.C23250099c;
import X.C329910CwX;
import X.C329930CwZ;
import X.C331070CyP;
import X.C343970De7;
import X.C346160Dhe;
import X.C724240Sb0;
import X.EnumC1579290rCR;
import X.EnumC1579300rCS;
import X.EnumC338610DPf;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsAddLocationErrorAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsAddLocationNoNetworkAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.IMyMomentsAbility;
import com.ss.android.ugc.aweme.poi.videopublish.retag.PoiRetagEducationPanelFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsDropdownPanelCategoryPowerCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsUserContentPowerCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes5.dex */
public class AkS76S0100000_4 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS76S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS76S0100000_4 akS76S0100000_4, View view) {
        IMyMomentsAbility iMyMomentsAbility;
        MyMomentsAddLocationErrorAssem myMomentsAddLocationErrorAssem = (MyMomentsAddLocationErrorAssem) akS76S0100000_4.l0;
        myMomentsAddLocationErrorAssem.getClass();
        Fragment fragmentLJI = C724240Sb0.LJI(myMomentsAddLocationErrorAssem);
        if (fragmentLJI != null && (iMyMomentsAbility = (IMyMomentsAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IMyMomentsAbility.class, null)) != null) {
            iMyMomentsAbility.lu1();
        }
    }

    public static final void LIZ$1(AkS76S0100000_4 akS76S0100000_4, View view) {
        IMyMomentsAbility iMyMomentsAbility;
        MyMomentsAddLocationNoNetworkAssem myMomentsAddLocationNoNetworkAssem = (MyMomentsAddLocationNoNetworkAssem) akS76S0100000_4.l0;
        myMomentsAddLocationNoNetworkAssem.getClass();
        Fragment fragmentLJI = C724240Sb0.LJI(myMomentsAddLocationNoNetworkAssem);
        if (fragmentLJI != null && (iMyMomentsAbility = (IMyMomentsAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IMyMomentsAbility.class, null)) != null) {
            iMyMomentsAbility.lu1();
        }
    }

    public static final void LIZ$2(AkS76S0100000_4 akS76S0100000_4, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((PoiRetagEducationPanelFragment) akS76S0100000_4.l0, C343970De7.LIZ);
    }

    public static final void LIZ$3(AkS76S0100000_4 akS76S0100000_4, View view) {
        AssemViewModel assemViewModel;
        C331070CyP item = ((SearchProsConsDropdownPanelCategoryPowerCell) akS76S0100000_4.l0).getItem();
        if (item != null && (assemViewModel = (AssemViewModel) ((SearchProsConsDropdownPanelCategoryPowerCell) akS76S0100000_4.l0).LL.getValue()) != null) {
            EventBus.LIZLLL().LJIILL(new C329930CwZ(item));
            assemViewModel.setState(AFwS232S0000000_4.get$arr$(179));
        }
    }

    public static final void LIZ$4(AkS76S0100000_4 akS76S0100000_4, View view) {
        SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel;
        C329910CwX item = ((SearchProsConsUserContentPowerCell) akS76S0100000_4.l0).getItem();
        if (item != null && (searchProsConsTabAssemViewModel = (SearchProsConsTabAssemViewModel) ((SearchProsConsUserContentPowerCell) akS76S0100000_4.l0).LL.getValue()) != null) {
            Context context = ((SearchProsConsUserContentPowerCell) akS76S0100000_4.l0).itemView.getContext();
            new C0DV2(C0DV3.CLICK_ITEM, item.LLILLJJLI, searchProsConsTabAssemViewModel.getState().LLILZLL).LJIILJJIL();
            Map<String, String> map = searchProsConsTabAssemViewModel.getState().LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchProsConsTabAssemViewModel.LLILZ;
            if (Intrinsics.LJFF(map.get("source"), "tako")) {
                C14TF.LIZIZ.LJJJLL().mobMediaCardClick(searchProsConsTabAssemViewModel.vQ2(item.LLILLJJLI, searchProsConsTabAssemViewModel.getState().LLIZ));
            }
            searchProsConsTabAssemViewModel.withState(new AwS219S0300000_10(searchProsConsTabAssemViewModel, context, item, 16));
        }
    }

    public static final void LIZ$5(AkS76S0100000_4 akS76S0100000_4, View view) {
        C0M6J c0m6j = (C0M6J) akS76S0100000_4.l0;
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c0m6j.LL.getLifecycle()), C0PEM.LIZJ, null, new C0CRW(c0m6j, "draft_box_cover", null), 2);
        c0m6j.N5(false);
        AVDraftMigrateService aVDraftMigrateServiceI5 = c0m6j.I5();
        if (aVDraftMigrateServiceI5 != null) {
            aVDraftMigrateServiceI5.setM2MigrateProfileHoverClicked();
        }
    }

    public static final void LIZ$6(AkS76S0100000_4 akS76S0100000_4, View view) {
        C0M6J c0m6j = (C0M6J) akS76S0100000_4.l0;
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c0m6j.LL.getLifecycle()), C0PEM.LIZJ, null, new C0CRW(c0m6j, "draft_box_cover", null), 2);
        c0m6j.N5(false);
        AVDraftMigrateService aVDraftMigrateServiceI5 = c0m6j.I5();
        if (aVDraftMigrateServiceI5 != null) {
            aVDraftMigrateServiceI5.setM2MigrateProfileHoverClicked();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$7(AkS76S0100000_4 akS76S0100000_4, View view) {
        ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().manualListRefresh();
        C0DOO c0doo = C0DOO.LIZ;
        EnumC1579300rCS enumC1579300rCS = EnumC1579300rCS.CLICK_RESET;
        EnumC1579290rCR enumC1579290rCR = EnumC1579290rCR.ERROR;
        Pair<Integer, Integer> pair = ((C346160Dhe) ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().getState()).LLILLL;
        boolean z = ((C346160Dhe) ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().getState()).LL;
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.USER;
        c0doo.getClass();
        C0DOO.LJI(enumC1579300rCS, enumC1579290rCR, pair, z, enumC338610DPf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$8(AkS76S0100000_4 akS76S0100000_4, View view) {
        SchoolUsersListViewModel schoolUsersListViewModelAS = ((SchoolUsersListFragment) akS76S0100000_4.l0).aS();
        schoolUsersListViewModelAS.setState(AFwS232S0000000_4.get$arr$(215));
        schoolUsersListViewModelAS.manualListRefresh();
        C0DOO c0doo = C0DOO.LIZ;
        EnumC1579300rCS enumC1579300rCS = EnumC1579300rCS.CLICK_RESET;
        EnumC1579290rCR enumC1579290rCR = EnumC1579290rCR.NO_CONTENT;
        Pair<Integer, Integer> pair = ((C346160Dhe) ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().getState()).LLILLL;
        boolean z = ((C346160Dhe) ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().getState()).LL;
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.USER;
        c0doo.getClass();
        C0DOO.LJI(enumC1579300rCS, enumC1579290rCR, pair, z, enumC338610DPf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$9(AkS76S0100000_4 akS76S0100000_4, View view) {
        ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().manualListRefresh();
        C0DOO c0doo = C0DOO.LIZ;
        EnumC1579300rCS enumC1579300rCS = EnumC1579300rCS.CLICK_RESET;
        EnumC1579290rCR enumC1579290rCR = EnumC1579290rCR.ERROR;
        Pair<Integer, Integer> pair = ((C346160Dhe) ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().getState()).LLILLL;
        boolean z = ((C346160Dhe) ((SchoolUsersListFragment) akS76S0100000_4.l0).aS().getState()).LL;
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.USER;
        c0doo.getClass();
        C0DOO.LJI(enumC1579300rCS, enumC1579290rCR, pair, z, enumC338610DPf);
    }
}
