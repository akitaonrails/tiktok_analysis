package com.ss.android.ugc.aweme.photodownload;

import X.C098200Yq;
import X.C0HZQ;
import X.C1308910kAL;
import X.C1371590lnR;
import X.C1376010luZ;
import X.C1376330lv5;
import X.C1377080lwI;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C294850Bh5;
import X.C786410Ut5;
import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoModeDownloadFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUkJjs8LCo7HELIOSJyM8KSFiGSc8PCoBJis2DCo7JyM8KSEKOy40JSAiPQ==";
    public final Aweme LL;
    public final C1371590lnR LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final C1376330lv5 LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final int LLIZLLLIL;
    public C0HZQ LLJ;
    public C197039127h LLJI;
    public TuxTextView LLJIJIL;
    public TuxIconView LLJILJIL;
    public RecyclerView LLJILJILJ;
    public TuxTextView LLJILLL;
    public String LLJJ;
    public PhotoSelectionViewModel LLJJI;
    public AObserverS224S0100000_21 LLJJIII;

    public final RecyclerView MR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qdk) : null;
            this.LLJILJILJ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C197039127h NR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tzz) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C0HZQ OR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ukb) : null;
            this.LLJ = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final void PR() {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        List<PhotoModeImageUrlModel> imageList2;
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.okm) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById;
        if (C294850Bh5.LIZ()) {
            tuxTextView.setText(tuxTextView.getContext().getResources().getText(2131825048));
        } else {
            tuxTextView.setText(tuxTextView.getContext().getResources().getText(2131858254));
        }
        Integer numLIZJ = C1308910kAL.LIZJ(this.LLILLJJLI.LJIIZILJ, tuxTextView.getContext());
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        C786410Ut5.B5(tuxTextView, this.LLILLJJLI.LJIJ);
        int size = 0;
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C197039127h c197039127hNR = NR();
        if (C294850Bh5.LIZ()) {
            c197039127hNR.setText(c197039127hNR.getContext().getResources().getText(2131825047));
        }
        View viewFindViewById2 = this.LLJILJIL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.g4a) : null;
            this.LLJILJIL = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS155S0100000_21(this, 4));
        MR().setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        Aweme aweme = this.LL;
        PhotoSelectionViewModel photoSelectionViewModel = this.LLJJI;
        if (photoSelectionViewModel == null) {
            photoSelectionViewModel = null;
        }
        C1377080lwI c1377080lwI = new C1377080lwI(aweme, photoSelectionViewModel);
        MR().setAdapter(c1377080lwI);
        if (Keva.getRepo("download_photo_selection_keva").getBoolean("is_default_select_all", false)) {
            OR().setChecked(true);
            PhotoSelectionViewModel photoSelectionViewModel2 = this.LLJJI;
            if (photoSelectionViewModel2 == null) {
                photoSelectionViewModel2 = null;
            }
            PhotoModeImageInfo photoModeImageInfo2 = this.LL.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null) {
                size = imageList2.size();
            }
            photoSelectionViewModel2.xQ2(size);
        } else {
            C1376010luZ.LIZ.getClass();
            int i = C1376010luZ.LJIJJLI;
            if (i >= 0 && (photoModeImageInfo = this.LL.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && i < imageList.size()) {
                PhotoSelectionViewModel photoSelectionViewModel3 = this.LLJJI;
                if (photoSelectionViewModel3 == null) {
                    photoSelectionViewModel3 = null;
                }
                photoSelectionViewModel3.yQ2(i);
                RecyclerView recyclerViewMR = MR();
                if (recyclerViewMR != null) {
                    recyclerViewMR.scrollToPosition(i);
                }
            }
        }
        View view3 = this.LLJILLL;
        if (view3 == null) {
            View view4 = getView();
            View viewFindViewById3 = view4 != null ? view4.findViewById(R.id.ukd) : null;
            this.LLJILLL = (TuxTextView) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        C786410Ut5.h9((TuxTextView) view3, new ACListenerS124S0200000_21(c1377080lwI, this, 1));
        C786410Ut5.b9(OR(), new ACListenerS124S0200000_21(c1377080lwI, this, 2));
        C786410Ut5.U8(NR(), new ACListenerS155S0100000_21(this, 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        AObserverS224S0100000_21 aObserverS224S0100000_21;
        super.onDestroy();
        PhotoSelectionViewModel photoSelectionViewModel = this.LLJJI;
        if (photoSelectionViewModel == null || (aObserverS224S0100000_21 = this.LLJJIII) == null) {
            return;
        }
        photoSelectionViewModel.wQ2().removeObserver(aObserverS224S0100000_21);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        View view2 = getView();
        Object parent = null;
        if (view2 != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJIII = new AObserverS224S0100000_21(this, 40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photodownload.PhotoModeDownloadFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e_b, viewGroup, false);
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

    public PhotoModeDownloadFragment(Aweme aweme, C1371590lnR c1371590lnR, String str, String str2, C1376330lv5 c1376330lv5, String str3, String str4, int i) {
        this.LL = aweme;
        this.LLILLJJLI = c1371590lnR;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1376330lv5;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = i;
    }
}
