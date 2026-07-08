package com.ss.android.ugc.aweme.search.middle;

import X.AbstractC681090Qnb;
import X.C07H0;
import X.C07IO;
import X.C098200Yq;
import X.C0BCO;
import X.C0HBM;
import X.C0P7X;
import X.C0P9S;
import X.C0POX;
import X.C0PRW;
import X.C0Q9K;
import X.C0QER;
import X.C0QGZ;
import X.C0QH7;
import X.C0QID;
import X.C0QL0;
import X.C0QLK;
import X.C0QLS;
import X.C0QLV;
import X.C0QLX;
import X.C0QLY;
import X.C0QM0;
import X.C0QNZ;
import X.C0QSX;
import X.C0QWU;
import X.C0QXC;
import X.C0R4H;
import X.C0WZX;
import X.C11JF;
import X.C11K9;
import X.C11NZ;
import X.C11S5;
import X.C1255704vj;
import X.C14EU;
import X.C1585030rLh;
import X.C1685300txQ;
import X.C18102077c;
import X.C189200o6;
import X.C1906580ziK;
import X.C1947807k4;
import X.C19EG;
import X.C19GS;
import X.C1C7U;
import X.C1ER1;
import X.C20642515q3;
import X.C20673215v0;
import X.C21146717pB;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C23250099c;
import X.C288080BQw;
import X.C288090BQx;
import X.C301160BrG;
import X.C301290BrT;
import X.C313800CRu;
import X.C467860IWi;
import X.C616540OGe;
import X.C640090P8t;
import X.C640270P9l;
import X.C644560PPy;
import X.C650500PfM;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C663180Pzo;
import X.C663980Q2q;
import X.C664110Q3d;
import X.C665470Q8j;
import X.C666820QDo;
import X.C668670QKr;
import X.C668690QKt;
import X.C668700QKu;
import X.C668750QKz;
import X.C668780QLc;
import X.C668800QLe;
import X.C668890QLn;
import X.C668940QLs;
import X.C669560QOc;
import X.C669810QPb;
import X.C669870QPh;
import X.C672020QXo;
import X.C672250QYl;
import X.C673080Qag;
import X.C679340Qkm;
import X.C682840QqQ;
import X.C689810R3z;
import X.C786410Ut5;
import X.EnumC673010QaZ;
import X.InterfaceC214902198i;
import X.InterfaceC500500Jk0;
import X.InterfaceC668730QKx;
import X.InterfaceC668770QLb;
import Y.ACListenerS145S0100000_10;
import Y.AObjectS353S0100000_10;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.ATListenerS444S0100000_10;
import Y.AfS179S0100000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.ExtraInfo;
import com.ss.android.ugc.aweme.discover.model.suggest.Params;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.middle.preload.SugInputTracker$register$observer$1;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchStateData;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseDiscoverAndSearchFragmentNew extends AmeBaseFragment {
    public static final /* synthetic */ int LLLLIIIILLL = 0;
    public C0QLY LL;
    public ViewGroup LLILLJJLI;
    public EditText LLILLL;
    public TuxIconView LLILZ;
    public LinearLayout LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public LinearLayout LLIZLLLIL;
    public View LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public ViewGroup LLJJI;
    public View LLJJIII;
    public TextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public ImageView LLJJIJIL;
    public FrameLayout LLJJJ;
    public SmartImageView LLJJJIL;
    public TuxIconView LLJJJJ;
    public boolean LLJJJJJIL;
    public C0QWU LLJJLIIIJLLLLLLLZ;
    public SearchStateViewModel LLJL;
    public C0QLV LLJLIL;
    public String LLJLILLLLZIIL;
    public SearchStartViewModel LLJLL;
    public SearchStateData LLJLLIL;
    public boolean LLJLLL;
    public ViewStub LLLILZ;
    public InterfaceC668730QKx LLLILZJ;
    public ViewStub LLLILZLLLI;
    public InterfaceC668730QKx LLLIZZ;
    public C672020QXo LLLJ;
    public final boolean LLLJIL;
    public long LLLJL;
    public String LLLL;
    public Word LLLLII;
    public boolean LLJJJJLIIL = true;
    public Long LLJJL = 0L;
    public C11JF LLJZ = null;
    public SearchResultParam LLJZIJLIL = null;
    public C668670QKr LLL = null;
    public C668750QKz LLLF = null;
    public C0QLX LLLFF = null;
    public C0QLX LLLFFI = null;
    public C0QLK LLLFZ = null;
    public C0QLS LLLI = null;
    public C668690QKt LLLII = null;
    public C0Q9K LLLIIII = null;
    public C668700QKu LLLIIIIL = null;
    public C665470Q8j LLLIIIL = null;
    public SugKeywordPresenter LLLIIL = null;
    public boolean LLLIILIL = false;
    public C668780QLc LLLIL = null;

    public abstract boolean ES();

    public abstract boolean FS();

    public void NS() {
    }

    public void QS() {
    }

    public boolean RR() {
        return true;
    }

    public void RS(String str, String str2, String str3) {
    }

    public void SR() {
    }

    public abstract void YS(boolean z);

    public abstract void aS();

    public abstract int bS();

    public abstract String getEnterFrom();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public abstract void kS();

    public void mT(String str) {
    }

    public abstract void nT();

    public abstract void oS();

    public abstract void rS();

    public void sT() {
    }

    public boolean uS() {
        return false;
    }

    public void uT(int i, boolean z) {
    }

    public final boolean PR() {
        SearchResultParam searchResultParam = this.LLJZIJLIL;
        if (searchResultParam == null) {
            return false;
        }
        C0QSX c0qsx = ECSearchEntranceData.Companion;
        C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
        c0qsx.getClass();
        return C650500PfM.LIZJ(searchEnterParam) && C672250QYl.LIZ(this.LLJZIJLIL.getSearchEnterParam(), false);
    }

    public void PS() {
        C672020QXo c672020QXo = this.LLLJ;
        if (c672020QXo != null) {
            c672020QXo.LIZJ("click_cancel");
        }
        this.LLJL.setBackToMiddle(true);
        C669870QPh.LIZ.getClass();
        C669870QPh.LIZ("click_clear");
        this.LLJLL.LL = true;
        NS();
        if (FS()) {
            ((IMiddleForSearchFromEC) ServiceManager.get().getService(IMiddleForSearchFromEC.class)).LJIIL(C2204961BRm.LLJILLL(cS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString());
        } else {
            new C663980Q2q(this).LIZ(new C0QID(C2204961BRm.LLJILLL(cS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString()));
        }
        cS().setText("");
        cS().setSelection(0);
        if (!C0QGZ.LIZ(this)) {
            hS(true);
        }
        mT("cancel");
    }

    public final int UR() {
        Integer value = this.LLJL.searchState.getValue();
        if (value != null) {
            return value.intValue();
        }
        aS();
        return 7;
    }

    public void XS() {
        C786410Ut5.LJLIIL(800L, new BPEAHandler(), new ARunnableS110S0100000_10(this, 222));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.EditText cS() {
        /*
            r4 = this;
            android.widget.EditText r1 = r4.LLILLL
            boolean r0 = r4.PR()
            if (r0 == 0) goto L61
            X.0QLY r2 = r4.LL
            r2.getClass()
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getCurrentInputView, current: "
            r3.append(r0)
            X.0QLz r0 = r2.LIZ
            r1 = 0
            if (r0 == 0) goto L7a
            X.0QL3 r0 = r0.LIZ
        L1d:
            r3.append(r0)
            java.lang.String r0 = ", generalSearchBar: "
            r3.append(r0)
            X.0QLw r0 = r2.LIZIZ
            if (r0 == 0) goto L78
            android.widget.EditText r0 = r0.LIZ()
        L2d:
            r3.append(r0)
            java.lang.String r0 = ", ecomSearchBar: "
            r3.append(r0)
            X.0QLw r0 = r2.LIZJ
            if (r0 == 0) goto L3d
            android.widget.EditText r1 = r0.LIZ()
        L3d:
            r3.append(r1)
            X.C2188811AlT.LIZIZ(r3)
            X.0QLz r0 = r2.LIZ
            if (r0 == 0) goto L6f
            X.0QL3 r0 = r0.LIZ
            if (r0 == 0) goto L6f
            int[] r1 = X.C0QLC.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L66
            r0 = 2
            if (r1 != r0) goto L6f
            X.0QLw r0 = r2.LIZJ
            if (r0 == 0) goto L63
            android.widget.EditText r1 = r0.LIZ()
        L61:
            if (r1 != 0) goto L65
        L63:
            android.widget.EditText r1 = r4.LLILLL
        L65:
            return r1
        L66:
            X.0QLw r0 = r2.LIZIZ
            if (r0 == 0) goto L63
            android.widget.EditText r1 = r0.LIZ()
            goto L61
        L6f:
            X.0QLw r0 = r2.LIZIZ
            if (r0 == 0) goto L63
            android.widget.EditText r1 = r0.LIZ()
            goto L61
        L78:
            r0 = r1
            goto L2d
        L7a:
            r0 = r1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew.cS():android.widget.EditText");
    }

    public void sS() {
        Context context;
        C786410Ut5.a9(this.LLJJIJIIJIL, new ACListenerS145S0100000_10(this, 110));
        C786410Ut5.a9(this.LLILZ, new ACListenerS145S0100000_10(this, 111));
        C786410Ut5.a9(this.LLJILJIL, new ACListenerS145S0100000_10(this, 112));
        C786410Ut5.a9(this.LLJILJILJ, new ACListenerS145S0100000_10(this, 113));
        if (((Number) C0BCO.LIZ.getValue()).intValue() != 0 && (context = getContext()) != null && this.LLJILJILJ != null) {
            Drawable drawableLIZIZ = C0HBM.LIZIZ(OR(20), C467860IWi.LIZ(context) ? -1 : -16777216);
            if (drawableLIZIZ != null) {
                this.LLJILJILJ.setImageDrawable(drawableLIZIZ);
                int iOR = OR(5);
                this.LLJILJILJ.setPadding(iOR, iOR, iOR, iOR);
            } else {
                this.LLJILJILJ.setPadding(0, 0, 0, 0);
            }
        }
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS145S0100000_10(this, 112));
        }
        TuxIconView tuxIconView2 = this.LLJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS145S0100000_10(this, 113));
        }
        this.LLJJIJI.setOnTouchListener(new AbstractC681090Qnb() { // from class: X.0QLh
            @Override // X.AbstractC681090Qnb
            public final void LIZLLL(View view) {
                this.LLILLJJLI.eT();
            }

            @Override // X.AbstractC681090Qnb, X.AbstractViewOnTouchListenerC19382810sM, android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.LLILLJJLI.fT(motionEvent);
                return super.onTouch(view, motionEvent);
            }
        });
        C0QH7 c0qh7 = C0QNZ.LIZ;
        C0QM0 c0qm0 = new C0QM0(this);
        Lifecycle lifecycle = getLifecycle();
        SugInputTracker$register$observer$1 sugInputTracker$register$observer$1 = new SugInputTracker$register$observer$1(lifecycle);
        lifecycle.addObserver(sugInputTracker$register$observer$1);
        C0QNZ.LIZIZ.put(lifecycle, sugInputTracker$register$observer$1);
        C0QNZ.LIZ = c0qm0;
        C786410Ut5.a9(this.LLJJJJ, new ACListenerS145S0100000_10(this, 114));
        C0QLV c0qlv = this.LLJLIL;
        EditText editText = this.LLILLL;
        c0qlv.getClass();
        if (editText != null) {
            editText.addTextChangedListener(new C0R4H(c0qlv, 6));
        }
        qT(new C0QL0(VR()));
        this.LLILLL.setHint(VR());
        this.LLILLL.setFilters(new InputFilter[]{new C1947807k4()});
        C0QSX c0qsx = ECSearchEntranceData.Companion;
        C0QER c0qerLIZJ = C640270P9l.LIZJ(this, getActivity());
        c0qsx.getClass();
        boolean zLIZJ = C650500PfM.LIZJ(c0qerLIZJ);
        if (this.LLJZIJLIL != null && !zLIZJ && C07IO.LIZIZ() && TextUtils.isEmpty(this.LLJZIJLIL.getKeyword())) {
            this.LLJJJJLIIL = false;
            if (((Boolean) C18102077c.LIZ.getValue()).booleanValue()) {
                C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS110S0100000_10(this, 224));
            } else {
                iT(false);
            }
        }
        this.LLILLL.addTextChangedListener(new C0R4H(this, 7));
        this.LLILLL.setOnTouchListener(new ATListenerS444S0100000_10(this, 25));
        this.LLILLL.setOnEditorActionListener(new C689810R3z(this, 4));
        if (getActivity() != null) {
            LiveData liveData = (LiveData) ((KeyboardModel) C679340Qkm.LIZIZ(this, getActivity()).get(KeyboardModel.class)).LL.getValue();
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG activity = getActivity();
            sAFHelper.getClass();
            liveData.observe(SAFHelper.LJJIIZ(this, activity), new AObserverS214S0100000_10(this, 164));
        }
    }

    public BaseDiscoverAndSearchFragmentNew() {
        this.LLLJIL = C673080Qag.LIZIZ() && C1255704vj.LIZ().LJJJ();
        this.LLLJL = 0L;
    }

    public final boolean BS() {
        C0QER c0qer;
        return getActivity() != null && (c0qer = C640270P9l.LIZ(this, getActivity()).LL) != null && c0qer.getLeftIcon() && C1585030rLh.LIZIZ();
    }

    public final void JS() {
        InterfaceC668770QLb interfaceC668770QLbLJJJLZIJ = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJJLZIJ();
        if (interfaceC668770QLbLJJJLZIJ != null) {
            interfaceC668770QLbLJJJLZIJ.LIZIZ(true);
        }
        this.LLJL.setBackToMiddle(true);
        iS();
        if (interfaceC668770QLbLJJJLZIJ != null) {
            interfaceC668770QLbLJJJLZIJ.LIZIZ(false);
        }
        if (C663180Pzo.LJI() && C301290BrT.LIZ()) {
            C663180Pzo.LIZJ = false;
        }
    }

    public final String VR() {
        String stringOrNullStrategy;
        C669560QOc c669560QOc;
        String str;
        if (getActivity() != null) {
            C650960Pg6 c650960Pg6FetchOwnImmutableData = C650950Pg5.fetchOwnImmutableData(this, getActivity());
            if (c650960Pg6FetchOwnImmutableData != null && (c669560QOc = c650960Pg6FetchOwnImmutableData.searchEcommerceModel) != null && (str = c669560QOc.defaultHintWord) != null) {
                return str;
            }
            if (WR() != null && (stringOrNullStrategy = WR().getStringOrNullStrategy("default_hint_word")) != null) {
                return stringOrNullStrategy;
            }
        }
        return C20642515q3.LJI(2131840572);
    }

    public final ECSearchEntranceData WR() {
        C0QER c0qer = C640270P9l.LIZ(this, getActivity()).LL;
        if (c0qer != null) {
            return c0qer.getEcSearchEntranceData();
        }
        return null;
    }

    public final C0QL0 ZR() {
        if (getActivity() == null) {
            return null;
        }
        C0QER c0qer = C640270P9l.LIZ(this, getActivity()).LL;
        C650960Pg6 c650960Pg6FetchOwnImmutableData = C650950Pg5.fetchOwnImmutableData(this, getActivity());
        if (c0qer == null) {
            return null;
        }
        if (c650960Pg6FetchOwnImmutableData != null && !TextUtils.isEmpty(c650960Pg6FetchOwnImmutableData.searchEcommerceModel.hintWord)) {
            c0qer.setSearchHint(c650960Pg6FetchOwnImmutableData.searchEcommerceModel.hintWord);
        }
        if (TextUtils.isEmpty(c0qer.getSearchHint())) {
            return null;
        }
        String searchHintWordId = (String) c0qer.obtainLogData("hint_group_id");
        if (TextUtils.isEmpty(searchHintWordId)) {
            searchHintWordId = c0qer.getSearchHintWordId();
        }
        return new C0QL0(c0qer.getSearchHint(), searchHintWordId, (String) c0qer.obtainLogData("hint_imp_id"), (String) c0qer.obtainLogData("key_log_hint_query_category"));
    }

    public final String dS() {
        String enterFrom = getEnterFrom();
        C0PRW c0prwFetchTopFragmentData = C650950Pg5.fetchTopFragmentData(this, getActivity());
        return (c0prwFetchTopFragmentData == null || c0prwFetchTopFragmentData.searchPosition.isEmpty()) ? enterFrom : c0prwFetchTopFragmentData.searchPosition;
    }

    public final void eT() {
        boolean zLJI = MethodIDManager.LJI(72010);
        if (cS() != null) {
            mS(C2204961BRm.LLJILLL(cS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString());
            oT("click_search");
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else if (zLJI) {
            MethodIDManager.LJ();
        }
        C0QH7 c0qh7 = C0QNZ.LIZ;
        if (C301160BrG.LIZ() && C0QNZ.LJIIIIZZ != null) {
            C23250099c.LIZLLL(C0QNZ.LIZJ, null, null, new C313800CRu(null), 3);
        }
        C1ER1.LIZIZ.LLJJJJJIL(this.LLJJL.longValue(), "normal_search", false);
    }

    public final void gT() {
        HandlerHook.viewPostDelay(cS(), new ARunnableS110S0100000_10(this, 216), C288090BQx.LIZ() ? 0L : 200L);
    }

    public void iS() {
        if (FS()) {
            ((IMiddleForSearchFromEC) ServiceManager.get().getService(IMiddleForSearchFromEC.class)).LJIIIZ();
        } else {
            new C663980Q2q(this).LIZ(new C664110Q3d());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.LLLIILIL = true;
        C11K9 c11k9LJJJJZ = C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII());
        SAFHelper.LIZ.getClass();
        this.LLJZ = (C11JF) C11NZ.LJLLILLLL(c11k9LJJJJZ, SAFHelper.LJIIJJI() ? C1906580ziK.LIZJ().LJI() : C2214201BlK.LIZJ(), new InterfaceC500500Jk0() { // from class: X.0QLr
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return new C668920QLq((ITpcConsentService) obj);
            }
        }).LJL(C11S5.LIZ()).LJJLJLI(new AfS179S0100000_10(this, 19));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        this.LLLIILIL = false;
        this.LLJZ = (C11JF) C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()).LJL(C11S5.LIZ()).LJJLJLI(new AfS179S0100000_10(this, 20));
    }

    public void qS() {
        getActivity().getWindow().setSoftInputMode(50);
    }

    public final boolean wS() {
        C0QER c0qer;
        if (getActivity() == null || (c0qer = C640270P9l.LIZ(this, requireActivity()).LL) == null) {
            return false;
        }
        return "1".equals(c0qer.obtainLogData("is_from_video"));
    }

    public final boolean yS() {
        C668700QKu c668700QKu;
        return UR() == 3 && (c668700QKu = this.LLLIIIIL) != null && c668700QKu.LIZ() == 2;
    }

    public final boolean zS() {
        if (cS() == null) {
            return false;
        }
        return !TextUtils.isEmpty(C2204961BRm.LLJILLL(cS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString().trim());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public static void GS(BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew) {
        C1C7U.LIZ("BaseDiscoverAndSearchFragmentNew@d3de.openKeyBoardImmediatePost$1L");
        if ((!baseDiscoverAndSearchFragmentNew.LLLIILIL || !baseDiscoverAndSearchFragmentNew.ES()) && baseDiscoverAndSearchFragmentNew.isViewValid()) {
            try {
                baseDiscoverAndSearchFragmentNew.cS().requestFocus();
                baseDiscoverAndSearchFragmentNew.cS().setCursorVisible(true);
                C669810QPb c669810QPb = C669810QPb.LIZ;
                EditText editTextCS = baseDiscoverAndSearchFragmentNew.cS();
                c669810QPb.getClass();
                C669810QPb.LIZ(editTextCS);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("BaseDiscoverAndSearchFragmentNew@d3de.openKeyBoardImmediatePost$1L");
    }

    private int OR(int i) {
        if (getContext() != null && getContext().getResources() != null && getContext().getResources().getDisplayMetrics() != null) {
            return (int) ((((double) i) * ((double) getContext().getResources().getDisplayMetrics().density)) + 0.5d);
        }
        return 0;
    }

    public static int lT(C0QER c0qer) {
        int ecSearchEntranceValue;
        try {
            ECSearchEntranceData ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            if (ecSearchEntranceData != null) {
                ECSearchEntranceData.Companion.getClass();
                ecSearchEntranceValue = C650500PfM.LIZ(ecSearchEntranceData);
            } else {
                ecSearchEntranceValue = c0qer.getEcSearchEntranceValue();
            }
            if (ecSearchEntranceValue <= 0) {
                return 0;
            }
            return ecSearchEntranceValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public final void HS(boolean z) {
        C19EG activity;
        C0QER c0qer;
        com.ss.android.ugc.aweme.ecommerce.search.sug.spi.IEcomSearchService iEcomSearchServiceLIZ;
        if (!z || (activity = getActivity()) == null || (c0qer = C640270P9l.LIZ(this, activity).LL) == null) {
            return;
        }
        ECSearchEntranceData.Companion.getClass();
        if (C650500PfM.LIZJ(c0qer) && C0QXC.LIZ().enable && (iEcomSearchServiceLIZ = C668940QLs.LIZ()) != null) {
            iEcomSearchServiceLIZ.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void MR(android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew.MR(android.view.View):void");
    }

    public Boolean NR(SearchResultParam searchResultParam) {
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZS(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew.ZS(java.lang.CharSequence):void");
    }

    public final void fT(MotionEvent motionEvent) {
        this.LLJJL = Long.valueOf(System.currentTimeMillis());
        if (motionEvent.getAction() == 0) {
            C666820QDo.LIZ.getClass();
            if (C666820QDo.LIZ().enableNormal) {
                String string = C2204961BRm.LLJILLL(cS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString();
                String string2 = cS().getHint().toString();
                boolean z = false;
                if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    int iLIZLLL = C644560PPy.LIZLLL();
                    int i = 0;
                    while (true) {
                        if (i < iLIZLLL) {
                            if (TextUtils.equals(string2, VR())) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            z = true;
                            string = string2;
                            break;
                        }
                    }
                }
                String strTrim = string.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    SearchResultParam searchResultParamGS = gS(strTrim, z);
                    C0POX.LIZ.getClass();
                    searchResultParamGS.setPrefetchId(C0POX.LIZJ());
                    searchResultParamGS.setPrefetchType("press");
                    C1ER1.LIZIZ.u(getActivity(), this, searchResultParamGS);
                }
            }
        }
    }

    public final void hS(boolean z) {
        if (z) {
            gT();
        } else {
            KeyboardUtils.LIZIZ(cS());
            cS().setCursorVisible(false);
        }
    }

    public void iT(boolean z) {
        EnumC673010QaZ enumC673010QaZ;
        boolean zYS = yS();
        if (z) {
            enumC673010QaZ = EnumC673010QaZ.BACK;
        } else {
            enumC673010QaZ = null;
        }
        C1ER1.LIZIZ.LLLI(enumC673010QaZ);
        HS(zYS);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[PHI: r8
      0x00cf: PHI (r8v3 long) = (r8v2 long), (r8v4 long) binds: [B:40:0x00c7, B:42:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jT(boolean r13) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew.jT(boolean):void");
    }

    public void mS(String str) {
        nS(str, false);
    }

    public final void oT(String str) {
        String string;
        if (cS() != null) {
            string = C2204961BRm.LLJILLL(cS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString();
            if (TextUtils.isEmpty(string)) {
                string = cS().getHint().toString();
            }
        } else {
            string = "";
        }
        C668890QLn c668890QLn = new C668890QLn();
        c668890QLn.LJIIZILJ("enter_method", str);
        c668890QLn.LJIIZILJ("search_keyword", string);
        c668890QLn.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJL = (SearchStateViewModel) C679340Qkm.LIZIZ(this, getActivity()).get(SearchStateViewModel.class);
        this.LLJLIL = new C0QLV();
        getArguments();
        this.LLJLLIL = (SearchStateData) C679340Qkm.LIZIZ(this, getActivity()).get(SearchStateData.class);
        this.LLJL.isLeavingSearchPage.observe(this, new AObserverS214S0100000_10(this, 172));
    }

    @C14EU
    public void onSearchSugCompletionEvent(C668800QLe c668800QLe) {
        String str;
        if (isViewValid() && c668800QLe != null && (str = c668800QLe.LIZ) != null && str.length() != 0) {
            if (FS()) {
                InterfaceC668730QKx interfaceC668730QKx = this.LLLIZZ;
                if (interfaceC668730QKx != null && interfaceC668730QKx.getViewVisibility() == 0) {
                    this.LLJJJJJIL = true;
                    cS().setText(str);
                    cS().setSelection(str.length());
                    cS().setCursorVisible(true);
                    KeyboardUtils.LIZLLL(cS());
                    return;
                }
                return;
            }
            if (this.LLLILZJ.getViewVisibility() != 0) {
                return;
            }
            this.LLJJJJJIL = true;
            cS().setText(str);
            cS().setSelection(str.length());
            cS().setCursorVisible(true);
            C669810QPb c669810QPb = C669810QPb.LIZ;
            EditText editTextCS = cS();
            c669810QPb.getClass();
            C669810QPb.LIZ(editTextCS);
        }
    }

    public void pT(int i) {
        this.LLJL.setSearchState(i);
        SearchStateData searchStateData = this.LLJLLIL;
        if (searchStateData.LL == null) {
            searchStateData.LL = new MutableLiveData<>();
        }
        searchStateData.LL.setValue(Integer.valueOf(i));
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            C786410Ut5.LJZ(4, this.LLJJJ);
            SmartImageView smartImageView = this.LLJJJIL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(4, smartImageView);
                return;
            }
            return;
        }
        C786410Ut5.LJZ(0, this.LLJJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qT(X.C0QL0 r5) {
        /*
            r4 = this;
            X.0QL0 r2 = r4.ZR()
            X.19EG r0 = r4.getActivity()
            X.0Pg6 r0 = X.C650950Pg5.fetchOwnImmutableData(r4, r0)
            r3 = 0
            if (r0 == 0) goto L37
            X.0Q2s r0 = r0.searchCommonModel
            boolean r0 = r0.isFromVideoDetail()
            if (r0 != 0) goto L37
            X.19EG r0 = r4.getActivity()
            if (r0 == 0) goto L3d
            X.19EG r0 = r4.requireActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = X.C640270P9l.LIZ(r4, r0)
            X.0QER r1 = r0.LL
            if (r1 == 0) goto L2f
            java.lang.String r0 = "is_from_photo"
            java.lang.Object r3 = r1.obtainLogData(r0)
        L2f:
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L3d
        L37:
            if (r2 == 0) goto L3c
            r4.rT(r2)
        L3c:
            return
        L3d:
            X.0QSX r1 = com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData.Companion
            X.19EG r0 = r4.getActivity()
            X.0QER r0 = X.C640270P9l.LIZJ(r4, r0)
            r1.getClass()
            boolean r0 = X.C650500PfM.LIZJ(r0)
            if (r0 != 0) goto L37
            boolean r0 = X.C288100BQy.LIZ()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.search.middle.SearchStartViewModel r0 = r4.LLJLL
            boolean r0 = r0.LLIZ
            if (r0 == 0) goto L37
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew.qT(X.0QL0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rT(X.C0QL0 r7) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew.rT(X.0QL0):void");
    }

    public final void US(int i, KeyEvent keyEvent) {
        String string;
        C0QER c0qer;
        boolean z = false;
        if (i != 0 ? i == 3 || 0 != 0 : keyEvent != null && keyEvent.getKeyCode() == 66) {
            z = true;
        }
        if (z) {
            EditText editTextCS = cS();
            if (editTextCS != null) {
                string = C2204961BRm.LLJILLL(editTextCS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString();
            } else {
                string = null;
            }
            C19EG activity = getActivity();
            if (activity != null && (c0qer = C640270P9l.LIZ(this, activity).LL) != null) {
                ECSearchEntranceData.Companion.getClass();
                if (C650500PfM.LIZJ(c0qer) && C0QXC.LIZ().enable && yS()) {
                    int iLT = lT(c0qer);
                    com.ss.android.ugc.aweme.ecommerce.search.sug.spi.IEcomSearchService iEcomSearchServiceLIZ = C668940QLs.LIZ();
                    if (iEcomSearchServiceLIZ != null) {
                        iEcomSearchServiceLIZ.LJ(iLT, string);
                    }
                }
            }
            mS(C2204961BRm.LLJILLL(cS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz8BDdKu8WqRWRKdtqJXrQDh4Hq2QOKNXGsYXra4Cl+XB2oj5MY68E=", null)).toString());
            oT("default_click_keyboard");
        }
    }

    public final void VS(MotionEvent motionEvent, View view) {
        if (motionEvent.getAction() == 1) {
            SearchResultParam searchResultParam = this.LLJZIJLIL;
            if (searchResultParam != null && searchResultParam.getCapsuleWords() != null && this.LLJZIJLIL.getCapsuleWords().isVisible()) {
                return;
            }
            kS();
        }
    }

    public final SearchResultParam gS(String str, boolean z) {
        String str2;
        Params params;
        ExtraInfo extraInfo;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String searchHintPenetrateInfo = null;
        if (z) {
            SearchStartViewModel searchStartViewModel = this.LLJLL;
            if (searchStartViewModel != null && searchStartViewModel.wQ2().getValue() != null) {
                Word value = this.LLJLL.wQ2().getValue();
                if (value != null && (params = value.getParams()) != null && (extraInfo = params.extraInfo) != null) {
                    searchHintPenetrateInfo = extraInfo.penetrateInfo;
                }
            } else {
                C0QER c0qer = C640270P9l.LIZ(this, requireActivity()).LL;
                if (c0qer != null) {
                    searchHintPenetrateInfo = c0qer.getSearchHintPenetrateInfo();
                }
            }
        }
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setKeyword(str);
        if (UR() == 3) {
            if (z) {
                str2 = "default_search_keyword";
            } else {
                str2 = "normal_search";
            }
        } else {
            str2 = "click_topright_search";
        }
        searchResultParam.setSearchFrom(str2);
        searchResultParam.setOpenNewSearchContainer(atomicBoolean.get());
        if (searchResultParam.getSearchEnterParam() != null) {
            searchResultParam.getSearchEnterParam().setHideTabs(false);
        }
        C0P7X.LIZ(new C0P9S("search_penetrate_info", searchHintPenetrateInfo), searchResultParam);
        HashMap map = new HashMap(8);
        map.put("position_type", "blankpage_searchbox");
        C0P7X.LIZ(new C640090P8t(map), searchResultParam);
        return searchResultParam;
    }

    public void hT(SearchResultParam searchResultParam, boolean z) {
        boolean zYS = yS();
        C1ER1.LIZIZ.g0();
        HS(zYS);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nS(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew.nS(java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InterfaceC668730QKx interfaceC668730QKx;
        super.onViewCreated(view, bundle);
        aS();
        pT(7);
        this.LLLILZJ.LJIIJJI(this, this.LLL, new AObjectS353S0100000_10(this, 4));
        C0QSX c0qsx = ECSearchEntranceData.Companion;
        C0QER c0qerLIZJ = C640270P9l.LIZJ(this, getActivity());
        c0qsx.getClass();
        if (C650500PfM.LIZJ(c0qerLIZJ) && (interfaceC668730QKx = this.LLLIZZ) != null) {
            interfaceC668730QKx.LJIIJJI(this, this.LLL, new AObjectS353S0100000_10(this, 5));
        }
        sS();
        oS();
        rS();
        qS();
    }

    public final void kT(Context context, Fragment fragment, SearchResultParam searchResultParam) {
        C1ER1.LIZIZ.LLJJLIIIJLLLLLLLZ(context, fragment, searchResultParam);
        if (NR(searchResultParam).booleanValue()) {
            sT();
        }
        hT(searchResultParam, false);
        KeyboardUtils.LIZIZ(cS());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL;
        if (C07H0.LIZ()) {
            if (C288080BQw.LIZ()) {
                viewLIZLLL = C21146717pB.LIZIZ(layoutInflater.getContext(), bS(), viewGroup, false);
            } else {
                SAFHelper sAFHelper = SAFHelper.LIZ;
                C19EG activity = getActivity();
                sAFHelper.getClass();
                viewLIZLLL = SAFExtensionKt.LJJII(requireActivity(), layoutInflater.getContext(), bS(), C682840QqQ.LIZ((InterfaceC214902198i) SAFHelper.LJJIJ(this, activity), requireActivity()));
            }
        } else if (C288080BQw.LIZ()) {
            viewLIZLLL = C21146717pB.LIZIZ(getActivity(), bS(), viewGroup, false);
        } else {
            viewLIZLLL = C20673215v0.LIZLLL(bS(), getActivity(), viewGroup, false);
        }
        MR(viewLIZLLL);
        C19GS c19gs = null;
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
    }
}
