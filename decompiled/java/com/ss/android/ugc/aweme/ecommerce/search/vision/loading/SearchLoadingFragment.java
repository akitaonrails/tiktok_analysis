package com.ss.android.ugc.aweme.ecommerce.search.vision.loading;

import X.C098200Yq;
import X.C1295960jpS;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C676090QfX;
import X.C676160Qfe;
import X.C786410Ut5;
import Y.ACListenerS145S0100000_10;
import Y.AObserverS175S0200000_10;
import Y.AObserverS214S0100000_10;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLoadingFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+HELIOSKid9Piw/ICA9ZikjKCs6JiJiGioyOiYkBSAyLCwiLgkhKSIhLCEn";
    public C1295960jpS LL;
    public TextView LLILLJJLI;
    public PhotoSearchBaseVM LLILLL;
    public AObserverS214S0100000_10 LLILZ;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        PhotoSearchBaseVM photoSearchBaseVM;
        MutableLiveData<Unit> mutableLiveData;
        PhotoSearchBaseVM photoSearchBaseVM2;
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null && (photoSearchBaseVM2 = this.LLILLL) != null) {
            photoSearchBaseVM2.vQ2(c1295960jpS);
        }
        super.onDestroy();
        C19EG activity = getActivity();
        if (activity == null || (photoSearchBaseVM = this.LLILLL) == null || (mutableLiveData = photoSearchBaseVM.LLILZIL) == null) {
            return;
        }
        mutableLiveData.removeObservers(activity);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (photoSearchEnterParams = C676160Qfe.LIZIZ(activity).LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            str = photoSearchBusinessEnterParams.sourceBtmToken;
        } else {
            str = null;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b2260", str);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<C676090QfX<PhotoSearchResponse>> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        super.onViewCreated(view, bundle);
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.nrl);
        this.LL = c1295960jpS;
        if (c1295960jpS != null) {
            c1295960jpS.setRepeatCount(-1);
        }
        C1295960jpS c1295960jpS2 = this.LL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setRepeatMode(2);
        }
        C1295960jpS c1295960jpS3 = this.LL;
        if (c1295960jpS3 != null) {
            C786410Ut5.LJLLLLLL(0, c1295960jpS3);
        }
        C1295960jpS c1295960jpS4 = this.LL;
        if (c1295960jpS4 != null) {
            c1295960jpS4.playAnimation();
        }
        TextView textView = (TextView) view.findViewById(R.id.zbu);
        this.LLILLJJLI = textView;
        if (textView != null) {
            C786410Ut5.T7(textView, new ACListenerS145S0100000_10(this, 69));
        }
        C19EG activity = getActivity();
        if (activity != null) {
            PhotoSearchBaseVM photoSearchBaseVMLIZIZ = C676160Qfe.LIZIZ(activity);
            this.LLILLL = photoSearchBaseVMLIZIZ;
            if (photoSearchBaseVMLIZIZ != null && (mutableLiveData2 = photoSearchBaseVMLIZIZ.LLILZIL) != null) {
                mutableLiveData2.observe(activity, new AObserverS175S0200000_10(new AObserverS214S0100000_10(this, 127), mutableLiveData2, 6));
            }
        }
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILLL;
        if (photoSearchBaseVM != null) {
            photoSearchBaseVM.LLJJJJ = PageFinder.via(view);
        }
        AObserverS214S0100000_10 aObserverS214S0100000_10 = new AObserverS214S0100000_10(this, 128);
        this.LLILZ = aObserverS214S0100000_10;
        PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILLL;
        if (photoSearchBaseVM2 != null && (mutableLiveData = photoSearchBaseVM2.LL) != null) {
            mutableLiveData.observe(this, new AObserverS175S0200000_10(aObserverS214S0100000_10, mutableLiveData, 6));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ewy, viewGroup, false);
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
