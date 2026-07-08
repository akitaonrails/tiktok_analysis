package com.ss.android.ugc.aweme.series.seriesdetail.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C1155320gAc;
import X.C1220000hqw;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1389910mGz;
import X.C13LE;
import X.C14EU;
import X.C14KI;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1606610ruV;
import X.C1611550s2T;
import X.C1611630s2b;
import X.C1611660s2e;
import X.C1611790s2r;
import X.C1611800s2s;
import X.C1612160s3S;
import X.C1612480s3y;
import X.C1612490s3z;
import X.C1612600s4A;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2211631BhB;
import X.C23250099c;
import X.C2344009Gk;
import X.C338520DOw;
import X.C345280DgE;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1612760s4Q;
import X.EnumC587030N0r;
import X.InterfaceC1236080iGs;
import X.InterfaceC1740760vOs;
import X.InterfaceC836760Ws6;
import Y.ACListenerS86S0300000_21;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.paidseries.consumer.fragment.PaidSeriesShopPanelFragment;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class SeriesDetailFragment extends BaseFragment implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s/LD06LTHELIOSYoLDsyISliLz0yLygpJzt9GyA+ICogDCA4KCY/DjctLiI2JjE=";
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJJ;
    public final C736950SvV LLJJI;
    public final C736950SvV LLJJIII;
    public final C01GW LLJJIJI;
    public String LLIZ = "";
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1823));
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS264S0000000_24.get$arr$(340), "collection_detail", CollectionDetailModel.class);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(326));
    public final MutableLiveData<InterfaceC1236080iGs> LLJILJILJ = new MutableLiveData<>();
    public final MutableLiveData<Object> LLJILLL = new MutableLiveData<>();

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC587030N0r.SERIES_DETAIL.getPageCode();
    }

    public SeriesDetailFragment() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1088);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesDetailVideoListViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(342);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJI = new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, c451460Hn6, c451620HnM, c338520DOw);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(this, 1089);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(SeriesInnerFeedViewModel.class), awS568S0100000_242, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(343), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(327));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null) {
            miniDramaCacheServiceLIZ.LJ(Long.valueOf(this.LLIZLLLIL));
        }
        EventBus.LIZLLL().LJJI(this);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJ;
        CollectionDetailModel collectionDetailModelLIZ = ((C1612160s3S) ((AssemViewModel) this.LLJJI.getValue()).getState()).LLILLJJLI.LIZ();
        if (collectionDetailModelLIZ != null) {
            SeriesDetailVideoListViewModel seriesDetailVideoListViewModel = (SeriesDetailVideoListViewModel) this.LLJJI.getValue();
            CollectionDetailModel collectionDetailModelBQ2 = seriesDetailVideoListViewModel.BQ2();
            if (collectionDetailModelBQ2 != null) {
                ((IPaidContentService) seriesDetailVideoListViewModel.LLJIJIL.getValue()).LJIIJJI(collectionDetailModelBQ2.collectionId);
            }
            C1611790s2r c1611790s2r = C1611790s2r.LIZ;
            String str = this.LLIZ;
            C19EG activity = getActivity();
            Intent intent = activity != null ? activity.getIntent() : null;
            String str2 = (String) this.LLJILJIL.getValue();
            c1611790s2r.getClass();
            C1612490s3z c1612490s3z = C1612490s3z.LJI;
            boolean zLIZJ = C1611790s2r.LIZJ(intent);
            c1612490s3z.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", str);
            C1612480s3y.LJIIJ(c2344009Gk, collectionDetailModelLIZ);
            C1611660s2e.LJJI(c2344009Gk, collectionDetailModelLIZ);
            C1611660s2e.LJJII(c2344009Gk, collectionDetailModelLIZ);
            c2344009Gk.LIZLLL(collectionDetailModelLIZ.collectionSalesNum, "collection_sold_cnt");
            C1612480s3y.LJIILL(c2344009Gk, zLIZJ);
            c2344009Gk.LJIIIIZZ("is_success_purchase", C1612480s3y.LJIJJ(collectionDetailModelLIZ.hasPurchasedCollection));
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "staytime_duration");
            c2344009Gk.LJFF("session_id", str2);
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("collection_detail_page_staytime", c2344009Gk.LIZ);
            }
        }
        MiniDramaCacheService miniDramaCacheServiceLIZ2 = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ2 != null) {
            miniDramaCacheServiceLIZ2.LJ(Long.valueOf(this.LLIZLLLIL));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2211631BhB.LJIIL(this, null);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final void UR(PaidSeriesShopPanelFragment paidSeriesShopPanelFragment) {
        this.LLJILJILJ.postValue(paidSeriesShopPanelFragment);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        long j;
        long longExtra;
        Bundle arguments;
        Serializable serializable;
        boolean z;
        int i;
        Intent intent;
        String strSR;
        String strSR2;
        String strSR3;
        int intExtra;
        boolean booleanExtra;
        boolean booleanExtra2;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean z2;
        boolean booleanExtra3;
        boolean booleanExtra4;
        String strSR4;
        String strSR5;
        boolean booleanExtra5;
        String strSR6;
        String string6;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        Intent intent7;
        Intent intent8;
        Intent intent9;
        Intent intent10;
        Intent intent11;
        Intent intent12;
        Intent intent13;
        Intent intent14;
        Intent intent15;
        Intent intent16;
        NR(AFwS264S0000000_24.get$arr$(341));
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null) {
            miniDramaCacheServiceLIZ.LIZJ(Long.valueOf(this.LLIZLLLIL));
        }
        this.LLJJ = System.currentTimeMillis();
        C19EG activity = getActivity();
        if (activity == null || (intent16 = activity.getIntent()) == null || (string = SR(intent16, "enter_from")) == null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                string = arguments2.getString("enter_from");
            } else {
                string = null;
            }
        }
        this.LLIZ = string;
        Bundle arguments3 = getArguments();
        long j2 = 0;
        if (arguments3 != null) {
            j = arguments3.getLong("collection_id");
        } else {
            j = 0;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null && (intent15 = activity2.getIntent()) != null) {
            longExtra = intent15.getLongExtra("collection_id", j);
        } else {
            longExtra = 0;
        }
        this.LLIZLLLIL = longExtra;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            j2 = arguments4.getLong("room_id", 0L);
        }
        this.LLJ = j2;
        C19EG activity3 = getActivity();
        if ((activity3 == null || (intent14 = activity3.getIntent()) == null || (serializable = intent14.getSerializableExtra("entry_source")) == null) && ((arguments = getArguments()) == null || (serializable = arguments.getSerializable("entry_source")) == null)) {
            serializable = EnumC1612760s4Q.UNKNOWN;
        }
        EnumC1612760s4Q enumC1612760s4Q = (EnumC1612760s4Q) serializable;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z = arguments5.getBoolean("hide_back_button", false);
        } else {
            z = false;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            i = arguments6.getInt("purchase_button_text", 2131847500);
        } else {
            i = 2131847500;
        }
        long j3 = this.LLIZLLLIL;
        String str = this.LLIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C19EG activity4 = getActivity();
        if (activity4 != null) {
            intent = activity4.getIntent();
        } else {
            intent = null;
        }
        String str3 = (String) this.LLJI.getValue();
        String str4 = (String) this.LLJILJIL.getValue();
        long j4 = this.LLJ;
        MutableLiveData<InterfaceC1236080iGs> mutableLiveData = this.LLJILJILJ;
        MutableLiveData<Object> mutableLiveData2 = this.LLJILLL;
        C19EG activity5 = getActivity();
        if (activity5 != null && (intent13 = activity5.getIntent()) != null) {
            strSR = SR(intent13, "anchor_id");
        } else {
            strSR = null;
        }
        C19EG activity6 = getActivity();
        if (activity6 != null && (intent12 = activity6.getIntent()) != null) {
            strSR2 = SR(intent12, "anchor_video_id");
        } else {
            strSR2 = null;
        }
        C19EG activity7 = getActivity();
        if (activity7 != null && (intent11 = activity7.getIntent()) != null) {
            strSR3 = SR(intent11, "anchor_group_id");
        } else {
            strSR3 = null;
        }
        C19EG activity8 = getActivity();
        if (activity8 != null && (intent10 = activity8.getIntent()) != null) {
            intExtra = intent10.getIntExtra("anchor_number", 0);
        } else {
            intExtra = 0;
        }
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) this.LLJIJIL.getValue();
        C19EG activity9 = getActivity();
        if (activity9 != null && (intent9 = activity9.getIntent()) != null) {
            booleanExtra = false;
            booleanExtra2 = intent9.getBooleanExtra("is_ad", false);
        } else {
            booleanExtra = false;
            booleanExtra2 = false;
        }
        C19EG activity10 = getActivity();
        if (activity10 != null && (intent8 = activity10.getIntent()) != null) {
            booleanExtra = intent8.getBooleanExtra("is_from_bottom_banner", booleanExtra);
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            string2 = arguments7.getString("anchor_author_id", "");
        } else {
            string2 = null;
        }
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            string3 = arguments8.getString("anchor_group_id", "");
        } else {
            string3 = null;
        }
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            string4 = arguments9.getString("series_anchor_type", "default_anchor_type");
        } else {
            string4 = null;
        }
        Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            string5 = arguments10.getString("anchor_video_id", "");
        } else {
            string5 = null;
        }
        C1612600s4A c1612600s4A = new C1612600s4A(string2, string3, string4, string5);
        C19EG activity11 = getActivity();
        if (activity11 != null && (intent7 = activity11.getIntent()) != null) {
            z2 = false;
            booleanExtra3 = intent7.getBooleanExtra("is_limited_free", false);
        } else {
            z2 = false;
            booleanExtra3 = false;
        }
        C19EG activity12 = getActivity();
        if (activity12 != null && (intent6 = activity12.getIntent()) != null) {
            booleanExtra4 = intent6.getBooleanExtra("is_from_hot_zone", z2);
        } else {
            booleanExtra4 = false;
        }
        C19EG activity13 = getActivity();
        if (activity13 != null && (intent5 = activity13.getIntent()) != null) {
            strSR4 = SR(intent5, "source_card");
        } else {
            strSR4 = null;
        }
        C19EG activity14 = getActivity();
        if (activity14 == null || (intent4 = activity14.getIntent()) == null || (strSR5 = SR(intent4, "root_scene")) == null) {
            strSR5 = "1";
        }
        C19EG activity15 = getActivity();
        if (activity15 != null && (intent3 = activity15.getIntent()) != null) {
            booleanExtra5 = intent3.getBooleanExtra("is_from_drama_component", false);
        } else {
            booleanExtra5 = false;
        }
        C1155320gAc c1155320gAc = DramaExtraTrackingParams.Companion;
        C19EG activity16 = getActivity();
        if (activity16 != null && (intent2 = activity16.getIntent()) != null) {
            strSR6 = SR(intent2, "drama_extra_tracking_params");
        } else {
            strSR6 = null;
        }
        c1155320gAc.getClass();
        DramaExtraTrackingParams dramaExtraTrackingParamsLIZ = C1155320gAc.LIZ(strSR6);
        Bundle arguments11 = getArguments();
        if (arguments11 != null && (string6 = arguments11.getString("series_enter_entrance", "")) != null) {
            str2 = string6;
        }
        C1611800s2s c1611800s2s = new C1611800s2s(j3, str, enumC1612760s4Q, intent, str3, str4, j4, z, i, mutableLiveData, mutableLiveData2, strSR, strSR2, strSR3, intExtra, collectionDetailModel, booleanExtra2, booleanExtra, c1612600s4A, booleanExtra3, booleanExtra4, strSR4, strSR5, booleanExtra5, dramaExtraTrackingParamsLIZ, str2);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1611800s2s, C1611800s2s.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new AwS390S0200000_24(this, c1611800s2s, 30), 3);
        SeriesDetailVideoListViewModel seriesDetailVideoListViewModel = (SeriesDetailVideoListViewModel) this.LLJJI.getValue();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(seriesDetailVideoListViewModel), null, null, new C1611630s2b(seriesDetailVideoListViewModel, null), 3);
        ((SeriesInnerFeedViewModel) this.LLJJIII.getValue()).oK2(this.LLIZLLLIL);
    }

    @C14EU
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        String strLIZ;
        if (getActivity() != null && getView() != null && Intrinsics.LJFF(this.LLIZ, c1365870leD.LJ)) {
            C19EG activity = getActivity();
            ACListenerS86S0300000_21 aCListenerS86S0300000_21 = null;
            if (activity != null) {
                strLIZ = C345280DgE.LIZ(activity, c1365870leD);
            } else {
                strLIZ = null;
            }
            int iLIZIZ = C14KI.LIZIZ(requireContext()) + getResources().getDimensionPixelOffset(R.dimen.f601m3);
            C1389910mGz c1389910mGz = new C1389910mGz(this);
            c1389910mGz.LJIIJ(strLIZ);
            c1389910mGz.LIZ.LIZIZ = 0;
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(iLIZIZ);
            Context context = getContext();
            if (context != null) {
                aCListenerS86S0300000_21 = new ACListenerS86S0300000_21(c1365870leD, this, context, 7);
            }
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LJIIIIZZ = aCListenerS86S0300000_21;
            c1360890lWB.LIZLLL = 0;
            c1389910mGz.LJIIJJI();
        }
    }

    public static String SR(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f881bha, viewGroup, false);
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
