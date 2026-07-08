package com.ss.android.ugc.aweme.favorites.business.collection.vm;

import X.C09YA;
import X.C1170570gZD;
import X.C11S5;
import X.InterfaceC0148002o;
import X.InterfaceC1170280gYk;
import Y.AfS187S0100000_18;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.poi.PoiRevisitBannerRelatedResponse;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoCollectionContentViewModel extends AssemViewModel<C1170570gZD> {
    public static final /* synthetic */ int LLIZ = 0;
    public final String LL;
    public int LLILLJJLI;
    public PoiRevisitBannerRelatedResponse LLILLL;
    public Boolean LLILZ;
    public String LLILZIL;
    public final C09YA LLILZLL = new C09YA(this, AFwS206S0000000_18.get$arr$(140));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1170570gZD(null, 0L, false, 0 == true ? 1 : 0, 63);
    }

    public VideoCollectionContentViewModel() {
    }

    public VideoCollectionContentViewModel(String str) {
        this.LL = str;
    }

    public static void wQ2(VideoCollectionContentViewModel videoCollectionContentViewModel) {
        videoCollectionContentViewModel.getClass();
        boolean zLJI = MethodIDManager.LJI(202198);
        String str = videoCollectionContentViewModel.LL;
        if (str == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            videoCollectionContentViewModel.disposeOnClear(((InterfaceC1170280gYk) videoCollectionContentViewModel.LLILZLL.getValue().getOperator()).LL(str).LJL(C11S5.LIZ()).LJJLL(new AfS187S0100000_18(videoCollectionContentViewModel, 81), new AfS187S0100000_18(videoCollectionContentViewModel, 82)));
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
        }
    }

    public final void vQ2(boolean z) {
        withState(new AwS105S0110000_18(this, z, 3));
    }

    public final void xQ2(boolean z) {
        boolean z2;
        setState(new AwS32S0010000_18(z, 2));
        if (!z && Intrinsics.LJFF(this.LLILZ, Boolean.TRUE)) {
            z2 = true;
        } else {
            z2 = false;
        }
        setState(new AwS32S0010000_18(z2, 3));
        this.LLILZ = Boolean.valueOf(z);
    }
}
