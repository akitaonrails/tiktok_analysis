package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.C01GW;
import X.C0CQT;
import X.C12ES;
import X.C1390410mHn;
import X.C452501pT;
import X.C638980P4m;
import X.C786410Ut5;
import X.InterfaceC746220TOy;
import Y.AObserverS216S0100000_12;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.IAdChoiceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ConsistentContentAndAdChoiceFragment extends BaseAdChoiceFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSHELIOSsvLGEyLCYkJiYwLWsPJiEgITY4LCEnCyoiPSo9PAQiLQ43Cy0jICw2DjctLiI2JjE=";
    public FrameLayout LLILZIL;
    public JourneyConsistentContentAndAdChoicesStruct LLILZLL;
    public C1390410mHn LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(154));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 339));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 340));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 341));

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final int MR() {
        return R.layout.bfp;
    }

    public final FrameLayout PR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqy) : null;
            this.LLILZIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final void RR() {
        if (this.LLIZ == null) {
            this.LLIZ = new C1390410mHn(requireContext(), null, 6);
            FrameLayout frameLayoutPR = PR();
            ViewGroup.LayoutParams layoutParams = PR().getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            C786410Ut5.a6(frameLayoutPR, layoutParams);
            FrameLayout frameLayoutPR2 = PR();
            C1390410mHn c1390410mHn = this.LLIZ;
            if (c1390410mHn == null) {
                c1390410mHn = null;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C12ES.LIZJ(36.0f, PR().getContext()), (int) C12ES.LIZJ(36.0f, PR().getContext()));
            layoutParams2.gravity = 17;
            frameLayoutPR2.addView(c1390410mHn, layoutParams2);
            C1390410mHn c1390410mHn2 = this.LLIZ;
            (c1390410mHn2 != null ? c1390410mHn2 : null).LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        RR();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct;
        InterfaceC746220TOy interfaceC746220TOyLIZIZ;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            journeyConsistentContentAndAdChoicesStruct = (JourneyConsistentContentAndAdChoicesStruct) arguments.getParcelable("keyAdChoiceData");
        } else {
            journeyConsistentContentAndAdChoicesStruct = null;
        }
        this.LLILZLL = journeyConsistentContentAndAdChoicesStruct;
        if (journeyConsistentContentAndAdChoicesStruct == null) {
            IConsistentContentAndAdChoiceService iConsistentContentAndAdChoiceServiceNR = NR();
            if (iConsistentContentAndAdChoiceServiceNR != null && (interfaceC746220TOyLIZIZ = iConsistentContentAndAdChoiceServiceNR.LIZIZ()) != null) {
                interfaceC746220TOyLIZIZ.onComplete();
                return;
            }
            return;
        }
        AdChoiceViewModel adChoiceViewModelOR = OR();
        adChoiceViewModelOR.getClass();
        IAdChoiceApi.LIZ.getClass();
        ((IAdChoiceApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(IAdChoiceApi.class)).getDeviceUserAge().enqueue(new C638980P4m(adChoiceViewModelOR, 0));
        C786410Ut5.LJLIIL(3000L, (Handler) this.LLILLL.getValue(), (Runnable) this.LLJIJIL.getValue());
        OR().LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 1));
        OR().LLILLL.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 2));
        OR().LLILZ.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 26));
        OR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 3));
    }
}
