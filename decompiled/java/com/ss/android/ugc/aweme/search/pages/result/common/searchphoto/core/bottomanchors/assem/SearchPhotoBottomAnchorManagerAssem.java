package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.assem;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C659270PtV;
import X.C659750PuH;
import X.C659950Pub;
import X.C659980Pue;
import X.C687700QyG;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoBottomAnchorManagerAssem extends ReusedUIContentAssem<SearchPhotoBottomAnchorManagerAssem> implements InterfaceC712990Rxx<C659750PuH>, InterfaceC1146704e9 {
    public final int LLJJJJ = R.id.qci;
    public final C01GW LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchPhotoViewModel.class), AFwS241S0000000_10.get$arr$(232));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPhotoScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPhotoScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0PuO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C237400vs) obj).LLILZ;
            }
        }, null, AFwS293S0000000_10.get$arr$(6), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        ISearchVideoAnchorPriorityProtocol iSearchVideoAnchorPriorityProtocol;
        List<Integer> listYD2;
        C659750PuH c659750PuH2 = c659750PuH;
        Iterator it2 = ((List) C659980Pue.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            List<Integer> listYD22 = ((ISearchVideoAnchorPriorityProtocol) it2.next()).yD2();
            if (listYD22 != null) {
                Iterator<Integer> it3 = listYD22.iterator();
                while (it3.hasNext()) {
                    View viewFindViewById = LJJIJL().findViewById(it3.next().intValue());
                    if (viewFindViewById != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById);
                    }
                }
            }
        }
        Object obj = C659980Pue.LIZIZ().get(c659750PuH2.LLILLL);
        if ((obj instanceof ISearchPhotoBottomAnchorProtocol) && (iSearchVideoAnchorPriorityProtocol = (ISearchVideoAnchorPriorityProtocol) obj) != null && (listYD2 = iSearchVideoAnchorPriorityProtocol.yD2()) != null) {
            Iterator<Integer> it4 = listYD2.iterator();
            while (it4.hasNext()) {
                View viewFindViewById2 = LJJIJL().findViewById(it4.next().intValue());
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                }
            }
        }
        if (!Intrinsics.LJFF(c659750PuH2.LLILLL, C659270PtV.LIZ)) {
            int i = C659950Pub.LIZ;
            C659950Pub.LIZ(LJJIJL(), Integer.valueOf(this.LLJJJJ));
        } else {
            int i2 = C659950Pub.LIZ;
            C659950Pub.LIZ(LJJIJL(), null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
