package com.ss.android.ugc.aweme.series.singleepisode.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C11NJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C1612200s3W;
import X.C1612490s3z;
import X.C1612570s47;
import X.C1612600s4A;
import X.C1613010s4p;
import X.C1614160s6g;
import X.C1614180s6i;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.EnumC1612690s4J;
import X.InterfaceC344240DeY;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS459S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPurchaseOptionFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s/ICE0JCApOSYgHELIOSJyEpZykhKSIhLCEnZhYpOyY2OxU5Oyw7KTYpBj8nISoiDz0yLygpJzs=";
    public final Function1<C1613010s4p, Unit> LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1856));
    public List<PurchaseOption> LLJI = C13BV.INSTANCE;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(792));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(628));
    public final C11NJ LLJILJILJ = new C11NJ();
    public C1614160s6g LLJILLL;

    public final C1614180s6i SR() {
        return (C1614180s6i) this.LLJ.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        C1614180s6i c1614180s6iSR;
        Integer num;
        C1614180s6i c1614180s6iSR2 = SR();
        if ((c1614180s6iSR2 != null ? c1614180s6iSR2.orderSubmissionExpGroup : null) == null || !((c1614180s6iSR = SR()) == null || (num = c1614180s6iSR.orderSubmissionExpGroup) == null || num.intValue() != 0)) {
            C1614180s6i c1614180s6iSR3 = SR();
            if (c1614180s6iSR3 == null || !c1614180s6iSR3.hasUserPartialPurchased) {
                string = getResources().getString(2131847569);
            } else {
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                C1614180s6i c1614180s6iSR4 = SR();
                objArr[0] = c1614180s6iSR4 != null ? Integer.valueOf(c1614180s6iSR4.firstUnpurchasedSeqId) : null;
                string = resources.getString(2131847451, objArr);
            }
        } else {
            string = getResources().getString(2131837277);
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1101));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        MiniDramaPaymentService miniDramaPaymentService;
        super.onDestroy();
        this.LLJILJILJ.dispose();
        C1614160s6g c1614160s6g = this.LLJILLL;
        if (c1614160s6g == null || (miniDramaPaymentService = (MiniDramaPaymentService) this.LLJIJIL.getValue()) == null) {
            return;
        }
        miniDramaPaymentService.LIZ(c1614160s6g);
    }

    public SeriesPurchaseOptionFragment(C1612200s3W c1612200s3W, Function0 function0) {
        this.LLIZ = c1612200s3W;
        this.LLIZLLLIL = function0;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<PurchaseOption> list;
        CollectionDetailModel collectionDetailModel;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolIsFromDramaComponent;
        Boolean boolValueOf3;
        String str;
        String key;
        Integer num;
        Boolean boolValueOf4;
        String str2;
        String str3;
        SeriesCategory seriesCategory;
        C1612600s4A c1612600s4A;
        Boolean boolIsLimitedFree;
        Boolean boolIsFromHotZone;
        String str4;
        C1612570s47 c1612570s47;
        String str5;
        CollectionDetailModel collectionDetailModel2;
        EnumC1612690s4J enumC1612690s4J;
        super.onViewCreated(view, bundle);
        C1614180s6i c1614180s6iSR = SR();
        if (c1614180s6iSR == null || (list = c1614180s6iSR.purchaseOptions) == null) {
            list = C13BV.INSTANCE;
        }
        this.LLJI = list;
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        C1614180s6i c1614180s6iSR2 = SR();
        DramaExtraTrackingParams dramaExtraTrackingParams = null;
        if (c1614180s6iSR2 != null) {
            collectionDetailModel = c1614180s6iSR2.collectionDetailModel;
        } else {
            collectionDetailModel = null;
        }
        C1614180s6i c1614180s6iSR3 = SR();
        if (c1614180s6iSR3 != null) {
            boolValueOf = Boolean.valueOf(c1614180s6iSR3.isFromAnchor());
        } else {
            boolValueOf = null;
        }
        C1614180s6i c1614180s6iSR4 = SR();
        if (c1614180s6iSR4 != null) {
            boolValueOf2 = Boolean.valueOf(c1614180s6iSR4.isFromBottomBanner());
        } else {
            boolValueOf2 = null;
        }
        C1614180s6i c1614180s6iSR5 = SR();
        if (c1614180s6iSR5 != null) {
            boolIsFromDramaComponent = c1614180s6iSR5.isFromDramaComponent();
        } else {
            boolIsFromDramaComponent = null;
        }
        C1614180s6i c1614180s6iSR6 = SR();
        if (c1614180s6iSR6 != null) {
            boolValueOf3 = Boolean.valueOf(c1614180s6iSR6.isFromSdp());
        } else {
            boolValueOf3 = null;
        }
        C1614180s6i c1614180s6iSR7 = SR();
        if (c1614180s6iSR7 != null) {
            str = c1614180s6iSR7.enterFrom;
        } else {
            str = null;
        }
        C1614180s6i c1614180s6iSR8 = SR();
        if (c1614180s6iSR8 != null && (enumC1612690s4J = c1614180s6iSR8.sourceWay) != null) {
            key = enumC1612690s4J.getKey();
        } else {
            key = null;
        }
        C1614180s6i c1614180s6iSR9 = SR();
        if (c1614180s6iSR9 != null) {
            num = c1614180s6iSR9.index;
        } else {
            num = null;
        }
        C1614180s6i c1614180s6iSR10 = SR();
        if (c1614180s6iSR10 != null) {
            boolValueOf4 = Boolean.valueOf(c1614180s6iSR10.isAutoDisplay());
        } else {
            boolValueOf4 = null;
        }
        C1614180s6i c1614180s6iSR11 = SR();
        if (c1614180s6iSR11 != null) {
            str2 = c1614180s6iSR11.groupId;
        } else {
            str2 = null;
        }
        List<PurchaseOption> list2 = this.LLJI;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            Iterator<PurchaseOption> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next().discountId != null) {
                    str3 = "1";
                    break;
                }
            }
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C1614180s6i c1614180s6iSR12 = SR();
        if (c1614180s6iSR12 != null && (collectionDetailModel2 = c1614180s6iSR12.collectionDetailModel) != null) {
            seriesCategory = collectionDetailModel2.category;
        } else {
            seriesCategory = null;
        }
        C1614180s6i c1614180s6iSR13 = SR();
        if (c1614180s6iSR13 != null) {
            c1612600s4A = c1614180s6iSR13.anchorInfo;
        } else {
            c1612600s4A = null;
        }
        C1614180s6i c1614180s6iSR14 = SR();
        if (c1614180s6iSR14 != null) {
            boolIsLimitedFree = c1614180s6iSR14.isLimitedFree();
        } else {
            boolIsLimitedFree = null;
        }
        C1614180s6i c1614180s6iSR15 = SR();
        if (c1614180s6iSR15 != null) {
            boolIsFromHotZone = c1614180s6iSR15.isFromHotZone();
        } else {
            boolIsFromHotZone = null;
        }
        C1614180s6i c1614180s6iSR16 = SR();
        if (c1614180s6iSR16 != null) {
            str4 = c1614180s6iSR16.sourceCard;
        } else {
            str4 = null;
        }
        C1614180s6i c1614180s6iSR17 = SR();
        if (c1614180s6iSR17 != null) {
            c1612570s47 = c1614180s6iSR17.sourceInfo;
        } else {
            c1612570s47 = null;
        }
        C1614180s6i c1614180s6iSR18 = SR();
        if (c1614180s6iSR18 != null) {
            str5 = c1614180s6iSR18.seriesEnterEntrance;
        } else {
            str5 = null;
        }
        C1614180s6i c1614180s6iSR19 = SR();
        if (c1614180s6iSR19 != null) {
            dramaExtraTrackingParams = c1614180s6iSR19.dramaExtraTrackingParams;
        }
        c1612490s3z.getClass();
        C1612490s3z.LJJJLL(collectionDetailModel, boolValueOf, boolValueOf2, boolIsFromDramaComponent, boolValueOf3, str, key, num, boolValueOf4, str2, str3, seriesCategory, c1612600s4A, boolIsLimitedFree, boolIsFromHotZone, str4, c1612570s47, str5, "half", null, dramaExtraTrackingParams);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.f8a);
        if (composeView != null) {
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(301038785, new AwS459S0200000_24(this, view, 4), true));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bi8, viewGroup, false);
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
