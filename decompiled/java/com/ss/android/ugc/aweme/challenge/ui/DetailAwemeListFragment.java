package com.ss.android.ugc.aweme.challenge.ui;

import X.AbstractC1255880imo;
import X.AbstractC1261240ivS;
import X.AbstractC1620180sGO;
import X.AbstractC654930PmV;
import X.C036E;
import X.C086I;
import X.C098200Yq;
import X.C0C05;
import X.C0DXR;
import X.C0HCL;
import X.C0P6P;
import X.C0PN0;
import X.C0VWN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XKC;
import X.C1076010e6h;
import X.C1209530ha3;
import X.C1235870iGX;
import X.C1255920ims;
import X.C1258460iqy;
import X.C1259890itH;
import X.C1260260its;
import X.C1261230ivR;
import X.C12ES;
import X.C1386150mAv;
import X.C1387620mDI;
import X.C1389890mGx;
import X.C1398410mUh;
import X.C1400650mYJ;
import X.C1401200mZC;
import X.C1401250mZH;
import X.C1401260mZI;
import X.C14EU;
import X.C1620190sGP;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C19341510lh;
import X.C19EG;
import X.C19GS;
import X.C20595415iS;
import X.C20684915wt;
import X.C21689319uV;
import X.C2187451AjH;
import X.C2344809Gs;
import X.C341940Daq;
import X.C446980Hfs;
import X.C616540OGe;
import X.C629480OmY;
import X.C683660Qrk;
import X.C735370Ssx;
import X.C737030Svd;
import X.C786410Ut5;
import X.C844470XAv;
import X.C888460YtI;
import X.InterfaceC1255930imt;
import X.InterfaceC1258040iqI;
import X.InterfaceC1259900itI;
import X.InterfaceC1260110itd;
import X.InterfaceC1400710mYP;
import X.InterfaceC1401240mZG;
import X.InterfaceC1401270mZJ;
import X.InterfaceC1401310mZN;
import X.InterfaceC19400810vG;
import X.InterfaceC21676019sM;
import X.InterfaceC627000OiY;
import X.InterfaceC627640Oja;
import X.InterfaceC645470PTl;
import X.InterfaceC683650Qrj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS155S0100000_21;
import Y.AObjectS395S0100000_21;
import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class DetailAwemeListFragment extends AbsDetailAwemeListFragment implements InterfaceC1260110itd, C0P6P, InterfaceC1258040iqI, InterfaceC683650Qrj, InterfaceC645470PTl<AbstractC1620180sGO>, InterfaceC1255930imt, InterfaceC19400810vG {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKCM/LSHELIOSsrLGEmIWsILDsyISkNPio+LQklOjsVOiQrJCo9PA==";
    public int LL;
    public String LLILLJJLI;
    public C1255920ims<AbstractC1255880imo> LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public C1401250mZH LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public float LLJJ;
    public DetailViewModel LLJJI;
    public int LLJJIII;
    public C19341510lh LLJJIJI;
    public RecyclerView LLJJIJIIJIL;
    public C1235870iGX LLJJIJIL;
    public FrameLayout LLJJJ;
    public C1749280vcc LLJJJIL;
    public C1261230ivR LLJJJJ;
    public C1259890itH LLJJJJJIL;
    public InterfaceC627640Oja LLJJJJLIIL;
    public int LLJJL;
    public InterfaceC1401310mZN LLJJLIIIJLLLLLLLZ;
    public C1400650mYJ LLJL;
    public String LLJLILLLLZIIL;
    public String LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public Object LLLF;
    public Challenge LLLFF;
    public InterfaceC1401270mZJ LLLIILIL;
    public String LLLIL;
    public WrapGridLayoutManager LLLILZ;
    public InterfaceC1400710mYP LLLILZJ;
    public String LLILLL = "";
    public final List<InterfaceC1401240mZG> LLJLIL = new ArrayList();
    public boolean LLJLL = false;
    public List<NewFaceStickerBean> LLJLLIL = new ArrayList();
    public boolean LLLFFI = false;
    public boolean LLLFZ = false;
    public String LLLI = "";
    public final SparseArray<C1255920ims> LLLII = new SparseArray<>();
    public final SparseArray<C1261230ivR> LLLIIII = new SparseArray<>();
    public final SparseBooleanArray LLLIIIIL = new SparseBooleanArray();
    public final SparseBooleanArray LLLIIIL = new SparseBooleanArray();
    public final SparseArray<C1235870iGX> LLLIIL = new SparseArray<>();

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ boolean B1(C0PN0 c0pn0) {
        return false;
    }

    @Override // X.InterfaceC1260110itd
    public /* synthetic */ void GA(Boolean bool) {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void IK(int[] iArr) {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void Js(List list) {
    }

    @Override // X.InterfaceC1260110itd
    public /* synthetic */ void LD(TuxTextView tuxTextView, Aweme aweme) {
    }

    @Override // X.InterfaceC19400810vG
    public /* synthetic */ void LJLJLLL(String str) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void LLLLLZL(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void LLLZZIL(List list) {
    }

    public void MR(SmartRoute smartRoute, Aweme aweme) {
    }

    @Override // X.InterfaceC1260110itd
    public /* synthetic */ void NN() {
    }

    public boolean PR() {
        return false;
    }

    public boolean UR() {
        return false;
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void V1(int i, Object obj) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void Xt(View view, Aweme aweme, String str, int i) {
    }

    @Override // X.InterfaceC1260110itd
    public /* synthetic */ void ZF(Aweme aweme, View view) {
    }

    @Override // X.InterfaceC1260110itd
    public /* synthetic */ void fx(Boolean bool) {
    }

    public void gS(C1398410mUh c1398410mUh) {
    }

    public List hS(List list) {
        return list;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public void kS(int i, boolean z, List list) {
    }

    public void rS(RecyclerView.LayoutManager layoutManager) {
    }

    @Override // X.InterfaceC19400810vG
    public void refresh() {
        cb(false, false);
    }

    public void sS() {
        boolean z;
        C1255920ims<AbstractC1255880imo> c1255920ims = this.LLLII.get(this.LL);
        this.LLILZ = c1255920ims;
        boolean z2 = true;
        if (c1255920ims == null) {
            if (C629480OmY.LIZIZ(this)) {
                this.LLILZ = this.LLLILZJ.getPresenter(this.LL, getActivity(), SAFExtensionKt.LJIIIZ(this));
            } else {
                this.LLILZ = this.LLLILZJ.getPresenter(this.LL, getActivity());
            }
            C1255920ims<AbstractC1255880imo> c1255920ims2 = this.LLILZ;
            if (c1255920ims2 != null) {
                c1255920ims2.LJIIJJI(new C1401200mZC(this));
                this.LLILZ.LJIILL(this);
                this.LLLII.put(this.LL, this.LLILZ);
            }
            z = true;
        } else {
            z = false;
        }
        int i = this.LL;
        if (i == 41) {
            this.LLJJJJ = this.LLLIIII.get(i);
        } else {
            this.LLJJJJ = this.LLLIIII.get(i);
        }
        if (this.LLJJJJ == null) {
            C1261230ivR c1261230ivR = new C1261230ivR(this.LLILLJJLI, this, this, this.LLLILZJ, getArguments());
            this.LLJJJJ = c1261230ivR;
            c1261230ivR.setLoadMoreListener(this);
            C1261230ivR c1261230ivR2 = this.LLJJJJ;
            c1261230ivR2.mmLabel = "detail_list";
            c1261230ivR2.LLIZ = this.LLLFFI;
            this.LLLIIII.put(this.LL, c1261230ivR2);
        } else {
            z2 = z;
        }
        this.LLJJIJIIJIL.setAdapter(this.LLJJJJ);
        this.LLJJJJ.LLIZ = this.LLLFFI;
        SR(z2);
    }

    @Override // X.InterfaceC1255930imt
    public final void w(int i, List list) {
    }

    @Override // X.InterfaceC645470PTl
    public /* synthetic */ void zt(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // X.InterfaceC683650Qrj
    public boolean LJIIJJI() {
        return this.LLLIIIL.get(this.LL, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RR() {
        RecyclerView.ViewHolder childViewHolder;
        if (this.LLJJIJIIJIL == null || !isViewValid()) {
            return;
        }
        int childCount = this.LLJJIJIIJIL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LLJJIJIIJIL.getChildAt(i);
            if (childAt != null && (childViewHolder = this.LLJJIJIIJIL.getChildViewHolder(childAt)) != 0 && childViewHolder.getItemViewType() == 0) {
                ((InterfaceC1259900itI) childViewHolder).H();
            }
        }
    }

    public AbstractC1255880imo ZR() {
        return (AbstractC1255880imo) this.LLILZ.LL;
    }

    public final String aS() {
        int i = this.LL;
        if (i == 0 || i == 1) {
            return "single_song";
        }
        if (i == 2 || i == 3) {
            return "challenge";
        }
        if (i == 15) {
            return "prop_page";
        }
        if (i == 20) {
            return "mv_page";
        }
        switch (i) {
            case 28:
            case 29:
            case 30:
            case 31:
                return "question";
            case 32:
                return "mv_page";
            default:
                return null;
        }
    }

    public int bS() {
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0);
    }

    @Override // X.InterfaceC19400810vG
    public final boolean bo() {
        return this.LLLIIIIL.get(this.LL, true);
    }

    public final void oS() {
        View viewFindViewById;
        C1749280vcc c1749280vcc = this.LLJJJIL;
        if (c1749280vcc != null && (viewFindViewById = c1749280vcc.findViewById(R.id.z1_)) != null && viewFindViewById.getVisibility() == 0) {
            C786410Ut5.LLLZLZ(this.LLJJJIL, 8);
        }
        InterfaceC1401270mZJ interfaceC1401270mZJ = this.LLLIILIL;
        if (interfaceC1401270mZJ != null) {
            interfaceC1401270mZJ.V();
        }
    }

    @Override // X.InterfaceC19400810vG
    public final void Bp() {
        if (isViewValid()) {
            if (getUserVisibleHint()) {
                getContext();
                if (C1620190sGP.LIZ()) {
                    getActivity();
                    try {
                        if (C036E.LIZ.LIZIZ()) {
                            C1259890itH c1259890itH = this.LLJJJJJIL;
                            if (c1259890itH != null) {
                                c1259890itH.LIZ(false, false);
                                return;
                            }
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            C1259890itH c1259890itH2 = this.LLJJJJJIL;
            if (c1259890itH2 != null) {
                c1259890itH2.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC19400810vG
    public final void K() {
        if (!isViewValid() || this.LLJJIJIIJIL.getChildCount() <= 0) {
            return;
        }
        this.LLJJIJIIJIL.smoothScrollToPosition(0);
    }

    @Override // X.C0P6P
    public void LJJIFFI() {
        boolean zLJI = MethodIDManager.LJI(197711);
        this.LLJJL = this.LL;
        if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
            if (this.LLJJIJI == null) {
                this.LLJJIJI = new C19341510lh(new AObjectS395S0100000_21(this, 1), new AObjectS395S0100000_21(this, 2), getActivity(), null, new BPEAHandler(Looper.getMainLooper()), "detail_page_load_more", 1);
            }
            C19341510lh c19341510lh = this.LLJJIJI;
            c19341510lh.getClass();
            c19341510lh.LJIIIZ = System.currentTimeMillis();
        }
        if (this.LLILZ != null && !TextUtils.isEmpty(this.LLILLL)) {
            InterfaceC1400710mYP interfaceC1400710mYP = this.LLLILZJ;
            if (interfaceC1400710mYP != null && interfaceC1400710mYP.sendCustomRequest(this.LLILZ, 4)) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            } else if (!this.LLJILJILJ || TextUtils.isEmpty(this.LLJLILLLLZIIL)) {
                this.LLILZ.LIZJ(4, this.LLILLL, Integer.valueOf(this.LLJJL), Boolean.FALSE, Integer.valueOf(this.LLJI));
            } else {
                this.LLILZ.LIZJ(4, this.LLJLILLLLZIIL, Integer.valueOf(this.LLJJL), Boolean.TRUE);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void dS() {
        TuxTextView tuxTextViewOR = OR(R.string.l6r);
        C786410Ut5.h9(tuxTextViewOR, new ACListenerS155S0100000_21(this, 16));
        C1235870iGX c1235870iGX = this.LLJJIJIL;
        C1209530ha3 c1209530ha3LIZ = C1209530ha3.LIZ(getContext());
        c1209530ha3LIZ.LIZIZ(OR(2131833905));
        c1209530ha3LIZ.LIZLLL(tuxTextViewOR);
        c1235870iGX.setBuilder(c1209530ha3LIZ);
    }

    public void initData() {
        C1260260its c1260260its;
        dS();
        int iBS = bS();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(iBS, 1, (Context) getActivity(), false);
        this.LLLILZ = wrapGridLayoutManager;
        this.LLJJIJIIJIL.setLayoutManager(wrapGridLayoutManager);
        this.LLJJIJIIJIL.setOverScrollMode(2);
        this.LLJJIJIIJIL.addItemDecoration(VR(iBS));
        this.LLJJIJIIJIL.addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0mYN
            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                String str;
                String str2;
                String str3;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        DetailAwemeListFragment detailAwemeListFragment = this.LL;
                        float y = motionEvent.getY();
                        DetailAwemeListFragment detailAwemeListFragment2 = this.LL;
                        detailAwemeListFragment.LLJJ = y - detailAwemeListFragment2.LLJJ;
                        if (C735370Ssx.LJJIIZ(detailAwemeListFragment2.aS()) || C735370Ssx.LJJIJIIJI(this.LL.aS())) {
                            if (C735370Ssx.LJJIJIIJI(this.LL.aS())) {
                                str = "music_id";
                                str2 = "music_detail_slide_up";
                                str3 = "music_detail_slide_down";
                            } else {
                                str = "";
                                str2 = "";
                                str3 = "";
                            }
                            if (C735370Ssx.LJJIIZ(this.LL.aS())) {
                                str = "tag_id";
                                str2 = "tag_detail_slide_up";
                                str3 = "tag_detail_slide_down";
                            }
                            if (!TextUtils.isEmpty(str)) {
                                float f = this.LL.LLJJ;
                                if (f > 10.0f) {
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJIIIIZZ("process_id", this.LL.LLJILJIL);
                                    c2344009Gk.LJIIIIZZ(str, this.LL.LLILLL);
                                    C20684815ws.LJIILLIIL(str3, c2344009Gk.LIZ);
                                    return false;
                                }
                                if (f >= -10.0f) {
                                    return false;
                                }
                                C2344009Gk c2344009Gk2 = new C2344009Gk();
                                c2344009Gk2.LJIIIIZZ("process_id", this.LL.LLJILJIL);
                                c2344009Gk2.LJIIIIZZ(str, this.LL.LLILLL);
                                C20684815ws.LJIILLIIL(str2, c2344009Gk2.LIZ);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                this.LL.LLJJ = motionEvent.getY();
                return false;
            }
        });
        if (C20595415iS.LIZIZ()) {
            c1260260its = null;
        } else {
            c1260260its = new C1260260its() { // from class: X.0mZF
                @Override // X.C1260260its
                public final boolean LJJIL(RecyclerView.ViewHolder viewHolder) {
                    if (viewHolder != null) {
                        if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 110003) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            };
            this.LLJJIJIIJIL.addOnScrollListener(c1260260its);
        }
        RecyclerView recyclerView = this.LLJJIJIIJIL;
        this.LLJJJJJIL = new C1259890itH(recyclerView, c1260260its);
        C683660Qrk.LIZ(recyclerView, this, null, 2, false);
        this.LLJJIJIIJIL = recyclerView;
        if (this.LLJIJIL.LL) {
            int iLIZ = C341940Daq.LIZ(16.0d);
            RecyclerView recyclerView2 = this.LLJJIJIIJIL;
            recyclerView2.setPadding(iLIZ, recyclerView2.getPaddingTop(), iLIZ, this.LLJJIJIIJIL.getPaddingBottom());
        }
        RecyclerView recyclerView3 = this.LLJJIJIIJIL;
        if (recyclerView3 instanceof C21689319uV) {
            ((C21689319uV) recyclerView3).setLabel("detail_list");
        }
        C0VWN.LIZ(this.LLILLJJLI, false).LIZIZ(this.LLJJIJIIJIL);
        if (this.LLJJJ != null) {
            if (this.LLLIIL.size() == 0) {
                this.LLLIIL.put(this.LL, this.LLJJIJIL);
            } else {
                if (this.LLJJIJIL != null) {
                    C1235870iGX c1235870iGX = this.LLJJIJIL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1235870iGX);
                    c1235870iGX.setAlpha(0.0f);
                }
                C1235870iGX c1235870iGX2 = this.LLLIIL.get(this.LL);
                this.LLJJIJIL = c1235870iGX2;
                if (c1235870iGX2 == null) {
                    this.LLJJIJIL = new C1235870iGX(this.LLJJJ.getContext(), null);
                    dS();
                    this.LLJJJ.addView(this.LLJJIJIL, new FrameLayout.LayoutParams(-1, -1));
                    this.LLLIIL.put(this.LL, this.LLJJIJIL);
                } else {
                    C1235870iGX c1235870iGX3 = this.LLJJIJIL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1235870iGX3);
                    c1235870iGX3.setAlpha(1.0f);
                }
            }
        }
        sS();
        rS(this.LLLILZ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C1255920ims<AbstractC1255880imo> c1255920ims = this.LLILZ;
        if (c1255920ims != null) {
            c1255920ims.LIZ();
        }
        if (this.LLJJJIL != null) {
            this.LLJJJIL = null;
        }
        C1259890itH c1259890itH = this.LLJJJJJIL;
        if (c1259890itH != null) {
            c1259890itH.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        C1259890itH c1259890itH;
        super.onPause();
        if (getUserVisibleHint() && (c1259890itH = this.LLJJJJJIL) != null) {
            c1259890itH.LIZIZ();
        }
        try {
            RR();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C1259890itH c1259890itH;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        if (!getUserVisibleHint() || (c1259890itH = this.LLJJJJJIL) == null) {
            return;
        }
        c1259890itH.LIZ(false, true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        C1259890itH c1259890itH;
        try {
            RR();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
        super.onStop();
        if (!getUserVisibleHint() || (c1259890itH = this.LLJJJJJIL) == null) {
            return;
        }
        c1259890itH.LIZIZ();
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC683650Qrj
    public final void preload() {
        LJJIFFI();
    }

    @Override // X.InterfaceC19400810vG
    public final void Jo(boolean z) {
        this.LLLIIIIL.put(this.LL, z);
    }

    public final TuxTextView OR(int i) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setText(i);
        tuxTextView.setBackgroundColor(C446980Hfs.LIZ(getContext(), R.color.ac4));
        return tuxTextView;
    }

    public void SR(boolean z) {
        C1259890itH c1259890itH;
        getActivity();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!this.LLLFZ && z) {
                    cb(true, false);
                    return;
                }
                if (getUserVisibleHint() && bo()) {
                    cb(true, false);
                    return;
                } else {
                    if (getUserVisibleHint() && (c1259890itH = this.LLJJJJJIL) != null) {
                        c1259890itH.LIZ(false, false);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(getActivity());
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }

    public C0DXR VR(int i) {
        final int iLIZJ = (int) C12ES.LIZJ(1.0f, getContext());
        return new C0DXR(iLIZJ) { // from class: X.0DXW
            public final int LL;

            {
                this.LL = iLIZJ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                GridLayoutManager gridLayoutManager;
                AbstractC214823195h abstractC214823195h;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    int i2 = gridLayoutManager.LLILLJJLI;
                    if (abstractC214823195h.LJFF(childAdapterPosition) == 1) {
                        int iLJ = abstractC214823195h.LJ(childAdapterPosition, i2);
                        int i3 = this.LL;
                        rect.left = (iLJ * i3) / i2;
                        rect.right = i3 - (((iLJ + 1) * i3) / i2);
                        if (abstractC214823195h.LIZLLL(childAdapterPosition, i2) > 0) {
                            rect.top = this.LL;
                        }
                    }
                }
            }
        };
    }

    public final List<Aweme> WR(List<Aweme> list) {
        CCTemplateInfo ccTemplateInfo;
        ArrayList arrayList = new ArrayList();
        if (C086I.LIZIZ(list)) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (aweme != null) {
                C1387620mDI.LIZ.getClass();
                if (C1387620mDI.LJI(aweme) && (ccTemplateInfo = aweme.getCcTemplateInfo()) != null) {
                    ccTemplateInfo.setTemplate_music_id(this.LLILLL);
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1255930imt
    public final void Y1(int i) {
        if (!isViewValid()) {
            return;
        }
        this.LLJJJJ.notifyItemRemoved(i);
        if (this.LLJJJJ.getBasicItemCount() == 0) {
            C786410Ut5.LLLLIILL(this.LLJJIJIL, 0);
            this.LLJJIJIL.LJII();
        }
    }

    @Override // X.InterfaceC19400810vG
    public final void b7(String str) {
        this.LLILLL = str;
        this.LLJILJILJ = false;
    }

    public final C1235870iGX cS(int i) {
        if (!isViewValid()) {
            return null;
        }
        if (this.LLJJJ == null) {
            return this.LLJJIJIL;
        }
        return this.LLLIIL.get(i);
    }

    public boolean iS(int i) {
        View viewFindViewByPosition = this.LLJJIJIIJIL.getLayoutManager().findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            return true;
        }
        int[] iArr = new int[2];
        viewFindViewByPosition.getLocationOnScreen(iArr);
        C844470XAv.LIZ.getClass();
        int iLJIIIIZZ = C12ES.LJIIIIZZ(C844470XAv.LIZ()) - iArr[1];
        if (viewFindViewByPosition.getHeight() <= 0 || (iLJIIIIZZ * 1.0f) / viewFindViewByPosition.getHeight() <= 0.4f) {
            return true;
        }
        return false;
    }

    public void initArguments(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.LLLIL = bundle.getString("creation_id", "");
        this.LL = bundle.getInt("detail_aweme_list_type", 0);
        this.LLILLJJLI = bundle.getString("event_label", "");
        this.LLILLL = bundle.getString("detail_id", "");
        bundle.getString("detail_id", "");
        this.LLJI = bundle.getInt("detail_source_id", 1);
        C1401250mZH c1401250mZH = (C1401250mZH) bundle.getSerializable("detail_config");
        this.LLJIJIL = c1401250mZH;
        if (c1401250mZH == null) {
            this.LLJIJIL = new C1401250mZH(null);
        }
        this.LLILZIL = bundle.getString("detail_aweme_from", "");
        this.LLJJIII = bundle.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        this.LLILZLL = bundle.getString("detail_aweme_from_aid", "");
        this.LLJ = bundle.getString("detail_aweme_previous_page_position", "");
        this.LLJILJIL = bundle.getString("process_id", "");
        bundle.getString("group_id", "");
        this.LLJILJILJ = bundle.getBoolean("extra_challenge_is_hashtag", false);
        this.LLJLILLLLZIIL = bundle.getString("extra_challenge_hashtag_name", "");
        this.LLJILLL = bundle.getString("top_aweme_ids", "");
        bundle.getString("extra_sticker_from", "");
        this.LLIZ = bundle.getString("enter_method", "");
        this.LLIZLLLIL = bundle.getString("previous_search_query", "");
    }

    @Override // X.InterfaceC683650Qrj
    public final void n2(boolean z) {
        C1261230ivR c1261230ivR = this.LLJJJJ;
        if (!z) {
            c1261230ivR.setLoadMoreListener((C0P6P) null);
            c1261230ivR.setShowFooter(false);
        }
    }

    @Override // X.InterfaceC645470PTl
    /* JADX INFO: renamed from: nS, reason: merged with bridge method [inline-methods] */
    public void Tr(AbstractC1620180sGO abstractC1620180sGO) {
        Aweme aweme;
        C1261230ivR c1261230ivR;
        List<T> list;
        int iIndexOf;
        String strAS = aS();
        if (abstractC1620180sGO != null && abstractC1620180sGO.LL != null && C735370Ssx.LJJIIZ(strAS) && (aweme = abstractC1620180sGO.LL) != null && (c1261230ivR = this.LLJJJJ) != null && (list = c1261230ivR.mmItems) != 0 && (iIndexOf = list.indexOf(aweme)) >= 0) {
            if (!C0C05.LIZ()) {
                C1386150mAv c1386150mAv = new C1386150mAv();
                if (strAS == null) {
                    strAS = "";
                }
                c1386150mAv.LIZLLL = strAS;
                c1386150mAv.LJJII = String.valueOf(iIndexOf);
                c1386150mAv.LJJIFFI = this.LLJILJIL;
                c1386150mAv.LJJIII = this.LLILLL;
                c1386150mAv.LJJIIJ = this.LLJIJIL.LLILLJJLI;
                c1386150mAv.LJIILLIIL(this.LL, abstractC1620180sGO.LL);
                c1386150mAv.LJIILJJIL();
            }
            HashMap map = new HashMap();
            map.put("enter_from", "challenge");
            map.put("tag_id", this.LLILLL);
            map.put("process_id", this.LLJILJIL);
            map.put("order", String.valueOf(iIndexOf));
            map.put("group_id", abstractC1620180sGO.LL.getAid());
            map.put("parent_tag_id", this.LLJIJIL.LLILLJJLI);
            C20684915wt.LJFF("tag_show_video", map);
        }
    }

    @C14EU
    public void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null) {
            if (str.contains("/aweme/v1/challenge/aweme/?") || str.contains("/aweme/v1/music/fresh/aweme/?")) {
                EventBus.LIZLLL().LIZIZ(c0xkc);
                refresh();
            }
        }
    }

    @C14EU
    public void onBlockUserEvent(C888460YtI c888460YtI) {
        refresh();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.LLLILZ != null) {
            int iBS = bS();
            WrapGridLayoutManager wrapGridLayoutManager = this.LLLILZ;
            if (wrapGridLayoutManager instanceof WrapGridLayoutManager) {
                wrapGridLayoutManager.LJIJ(iBS);
                rS(this.LLLILZ);
            }
            this.LLJJIJIIJIL.invalidateItemDecorations();
        }
    }

    @C14EU
    public void onDynamicEvent(C1258460iqy c1258460iqy) {
        if (c1258460iqy.LIZ == 0) {
            C1259890itH c1259890itH = this.LLJJJJJIL;
            if (c1259890itH != null) {
                c1259890itH.LIZ(true, false);
                return;
            }
            return;
        }
        C1259890itH c1259890itH2 = this.LLJJJJJIL;
        if (c1259890itH2 == null) {
            return;
        }
        c1259890itH2.LIZIZ();
    }

    @C14EU
    public void onReceiveVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        int iIndexOf;
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        getActivity();
        iCommercePageTrackingServiceLIZLLL.LIZ(new C1401260mZI(this.LLJJJJ.mmItems, c737030Svd.LIZ, c737030Svd.LIZIZ));
        if (c737030Svd.LIZ == 21) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof Aweme) && (iIndexOf = this.LLJJJJ.mmItems.indexOf(obj)) > -1 && iS(iIndexOf)) {
                this.LLJJI.LLILLJJLI.setValue(Boolean.TRUE);
                ((InterfaceC627000OiY) this.LLJJIJIIJIL.getLayoutManager()).scrollToPositionWithOffset(iIndexOf, 0);
            }
        }
        if (!((ArrayList) this.LLJLIL).isEmpty()) {
            Object obj2 = c737030Svd.LIZIZ;
            Integer numValueOf = null;
            if (obj2 instanceof Aweme) {
                aweme = (Aweme) obj2;
                if (aweme != null) {
                    numValueOf = Integer.valueOf(this.LLJJJJ.mmItems.indexOf(aweme));
                }
            } else {
                aweme = null;
            }
            Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1401240mZG) it2.next()).LIZ();
            }
            if (c737030Svd.LIZ == 21 && aweme != null) {
                Iterator it3 = ((ArrayList) this.LLJLIL).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1401240mZG) it3.next()).LIZJ(numValueOf.intValue(), c737030Svd, aweme);
                }
            }
            if (c737030Svd.LIZ == 66) {
                Iterator it4 = ((ArrayList) this.LLJLIL).iterator();
                while (it4.hasNext()) {
                    ((InterfaceC1401240mZG) it4.next()).LIZIZ();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            C786410Ut5.LJJIZ(bundle, "provider", this.LLLILZJ);
        }
    }

    @C14EU
    public void onVideoEvent(C737030Svd c737030Svd) {
        if (c737030Svd.LIZ == 2) {
            this.LLILZ.LJIILLIIL(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ((String) c737030Svd.LIZIZ));
            T t = this.LLILZ.LL;
            if (t instanceof AbstractC1255880imo) {
                this.LLJJJJ.setData(((AbstractC1255880imo) t).getItems());
            }
            if (this.LL == 51 && this.LLJJJJ.getBasicItemCount() == 0) {
                C786410Ut5.LLLLIILL(this.LLJJIJIL, 0);
                this.LLJJIJIL.LJII();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        RecyclerView recyclerView;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/challenge/ui/DetailAwemeListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpPC2TyfV++OzJUcPe0J/rxaxQoS4g+JxUPLFOEO11lBrQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            C1261230ivR c1261230ivR = this.LLJJJJ;
            if (isViewValid() && (recyclerView = this.LLJJIJIIJIL) != null && this.LLJJJJ != null && !c1261230ivR.LLIZ) {
                c1261230ivR.LLIZ = true;
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLJJIJIIJIL.findViewHolderForAdapterPosition(i);
                    if (viewHolderFindViewHolderForAdapterPosition instanceof AbstractC1261240ivS) {
                        AbstractC1261240ivS abstractC1261240ivS = (AbstractC1261240ivS) viewHolderFindViewHolderForAdapterPosition;
                        abstractC1261240ivS.a6();
                        Tr(abstractC1261240ivS);
                    }
                }
            }
        }
    }

    public SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        String str;
        String string;
        String string2;
        String str2;
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(getContext())) {
            str = "//duo";
        } else {
            str = "aweme://aweme/detail/";
        }
        Bundle arguments = getArguments();
        String str3 = "";
        if (arguments == null) {
            string = "";
        } else {
            string = arguments.getString("qa_origin_detail_key", "");
        }
        if (arguments == null) {
            string2 = "";
        } else {
            string2 = arguments.getString("shoot_enter_from", "");
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), str);
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        smartRouteBuildRoute.withParam("refer", c1398410mUh.LIZJ);
        smartRouteBuildRoute.withParam("previous_page", this.LLILZIL);
        smartRouteBuildRoute.withParam("shoot_enter_from", string2);
        smartRouteBuildRoute.withParam("extra_previous_page_position", this.LLJ);
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "");
        smartRouteBuildRoute.withParam("video_from", c1398410mUh.LIZ);
        int i = this.LL;
        if (i != 3 && i != 2) {
            str2 = "";
        } else {
            str2 = this.LLILZIL;
        }
        smartRouteBuildRoute.withParam("video_challenge_profile_from", str2);
        smartRouteBuildRoute.withParam("video_type", this.LL);
        smartRouteBuildRoute.withParam("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
        String str4 = this.LLJILJIL;
        if (str4 != null) {
            str3 = str4;
        }
        smartRouteBuildRoute.withParam("process_id", str3);
        smartRouteBuildRoute.withParam("duo_type", "duo_detail");
        smartRouteBuildRoute.withParam("extra_parent_tag_id", this.LLJIJIL.LLILLJJLI);
        smartRouteBuildRoute.withParam(c1398410mUh.LIZIZ, this.LLILLL);
        smartRouteBuildRoute.withParam("from_group_id", this.LLILZLL);
        smartRouteBuildRoute.withParam("creation_id", this.LLLIL);
        smartRouteBuildRoute.withParam("qa_origin_detail_key", string);
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LLJJIII);
        smartRouteBuildRoute.withParam("extra_sticker_from", getArguments().getString("extra_sticker_from"));
        smartRouteBuildRoute.withParam("single_song_shoot_previous_page", this.LLILZIL);
        smartRouteBuildRoute.withParam("single_song_shoot_previous_enter_method", this.LLIZ);
        smartRouteBuildRoute.withParam("previous_search_query", this.LLIZLLLIL);
        smartRouteBuildRoute.withParam(c1398410mUh.LJI);
        return smartRouteBuildRoute;
    }

    @Override // X.InterfaceC19400810vG
    public void cb(boolean z, boolean z2) {
        boolean z3;
        C1235870iGX c1235870iGX;
        C1235870iGX c1235870iGX2;
        if (!isViewValid()) {
            return;
        }
        if (this.LLJJIJIL.getVisibility() != 0 && !bo()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (isViewValid()) {
            if (!z) {
                Jo(false);
            }
            this.LLJJL = this.LL;
            if (this.LLILZ != null && !TextUtils.isEmpty(this.LLILLL)) {
                InterfaceC1400710mYP interfaceC1400710mYP = this.LLLILZJ;
                if (interfaceC1400710mYP == null || !interfaceC1400710mYP.sendCustomRequest(this.LLILZ, 1)) {
                    this.LLILZ.LIZJ(1, this.LLILLL, Integer.valueOf(this.LLJJL), Boolean.valueOf(this.LLJILJILJ), this.LLJILLL, Boolean.valueOf(z2), Integer.valueOf(this.LLJI), this.LLLF);
                }
                if (z3 && !TextUtils.equals("question", aS()) && (c1235870iGX2 = this.LLJJIJIL) != null) {
                    c1235870iGX2.LJIIIIZZ();
                    return;
                }
                return;
            }
            if (this.LLILZ == null || !TextUtils.equals(this.LLILZIL, "from_duet_mode")) {
                return;
            }
            C1255920ims<AbstractC1255880imo> c1255920ims = this.LLILZ;
            if (c1255920ims != null) {
                c1255920ims.LIZJ(1);
            }
            if (!z3 || (c1235870iGX = this.LLJJIJIL) == null) {
                return;
            }
            c1235870iGX.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().step("tool_performance_effect_shoot_same", "Create Grid View Fragment");
        this.LLJJIJIIJIL = (RecyclerView) view.findViewById(R.id.hto);
        this.LLJJIJIL = (C1235870iGX) view.findViewById(R.id.w28);
        this.LLJJJ = (FrameLayout) view.findViewById(R.id.w2_);
        super.onViewCreated(view, bundle);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLJJIJIL.getLayoutParams();
        layoutParams.topMargin = C0HCL.LIZ(80.0f, getContext());
        C786410Ut5.D6(this.LLJJIJIL, layoutParams);
        if (this.LLLILZJ == null && bundle != null) {
            Serializable serializable = bundle.getSerializable("provider");
            if (serializable instanceof InterfaceC1400710mYP) {
                this.LLLILZJ = (InterfaceC1400710mYP) serializable;
            }
        }
        this.LLJJIJIIJIL.setItemAnimator(null);
        initData();
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS224S0100000_21(this, 15));
    }

    public void qS(AbstractC654930PmV abstractC654930PmV, List<Aweme> list) {
        abstractC654930PmV.setDataAfterLoadMore(list);
    }

    @Override // X.InterfaceC1260110itd
    public void I2(Aweme aweme, View view, String str) {
        xe(view, aweme, str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void mS(int i, boolean z, List list) {
        C19341510lh c19341510lh;
        if (!isViewValid()) {
            return;
        }
        if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable() && (c19341510lh = this.LLJJIJI) != null) {
            c19341510lh.LIZIZ();
        }
        C1400650mYJ c1400650mYJ = this.LLJL;
        if (c1400650mYJ != null) {
            c1400650mYJ.LIZIZ();
        }
        if (list == null) {
            list = new ArrayList();
        }
        C1261230ivR c1261230ivR = this.LLLIIII.get(i);
        C1235870iGX c1235870iGXCS = cS(i);
        if (c1261230ivR != null && c1235870iGXCS != null) {
            c1261230ivR.resetLoadMoreState();
            if (C086I.LIZIZ(list) && z) {
                if (this.LL == i) {
                    LJJIFFI();
                    return;
                }
                return;
            }
            List<T> list2 = c1261230ivR.mmItems;
            if (list2 == 0 || list2.size() != list.size() || !list2.containsAll(list) || UR()) {
                qS(c1261230ivR, hS(WR(list)));
            }
            C786410Ut5.LLLLIILL(c1235870iGXCS, 4);
            this.LLLIIIL.put(i, z);
            n2(z);
            if (list2 == 0 || list2.isEmpty()) {
                K();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bk2, viewGroup, false);
        initArguments(getArguments());
        Object objLJIIIZ = SAFExtensionKt.LJIIIZ(this);
        if (objLJIIIZ != null && (objLJIIIZ instanceof Fragment)) {
            this.LLJJI = (DetailViewModel) ViewModelProviders.of((Fragment) objLJIIIZ).get(DetailViewModel.class);
        }
        if (this.LLJJI == null) {
            this.LLJJI = (DetailViewModel) ViewModelProviders.of(getActivity()).get(DetailViewModel.class);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    @Override // X.InterfaceC1260110itd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void xe(android.view.View r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment.xe(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }
}
