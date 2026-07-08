package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding;

import X.AbstractC212300186g;
import X.AbstractViewOnClickListenerC19509711Up;
import X.C038R;
import X.C098200Yq;
import X.C0H27;
import X.C0H28;
import X.C0I7D;
import X.C1391190mJ3;
import X.C1507790pL7;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1748470vbJ;
import X.C181U;
import X.C181X;
import X.C189200o6;
import X.C19673811yC;
import X.C19673911yD;
import X.C197039127h;
import X.C19773412Ya;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C21198117xT;
import X.C21578619ce;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2487409ou;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C810203Em;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS16S0101000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.CustomizePanel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS395S0200000_29;
import webcast.data.oec_msg.ExtendAuctionCfg;

/* JADX INFO: loaded from: classes30.dex */
public class UsMaxBidFragment extends Fragment implements C0H28, C181X {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKiA+JSHELIOSoiZy06Mms5OmEjJzUvKD03ZiclLSs6JiJiHDweKT0OICsVOiQrJCo9PA==";
    public C0H27 LL;
    public UsBidViewModel LLILLJJLI;
    public int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(426));
    public long LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public AbstractC212300186g LLIZ;
    public C197039127h LLIZLLLIL;
    public C1748470vbJ LLJ;
    public LinearLayout LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public View LLJILLL;
    public LinearLayout LLJJ;
    public SmartImageView LLJJI;
    public Function0<Unit> LLJJIII;
    public boolean LLJJIJI;

    @Override // X.C181X
    public final void Hi(UsPopupCardVO usPopupCardVO) {
    }

    public int getLayoutId() {
        return R.layout.bxh;
    }

    @Override // X.C0H28
    public final void LLIIIZ() {
        int i = C2187451AjH.LIZ;
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, 0));
        }
        this.LLJJIJI = false;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && parentFragment != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(this.LLILLL, this);
        }
        Function0<Unit> function0 = this.LLJJIII;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJJIII = null;
    }

    public void RR() {
        UsPopupCardVO usPopupCardVO;
        AuctionData auctionData;
        CustomizePanel customizePanel;
        UsPopupCardVO usPopupCardVO2;
        UsPopupCardVO usPopupCardVO3;
        AbstractC212300186g abstractC212300186g;
        UsBidViewModel usBidViewModel = this.LLILLJJLI;
        if (usBidViewModel != null && (usPopupCardVO3 = usBidViewModel.LLILLJJLI) != null && (abstractC212300186g = this.LLIZ) != null) {
            abstractC212300186g.F0(usPopupCardVO3, null, true, null, null, null, null);
        }
        UsBidViewModel usBidViewModel2 = this.LLILLJJLI;
        String str = null;
        PR((usBidViewModel2 == null || (usPopupCardVO2 = usBidViewModel2.LLILLJJLI) == null) ? null : usPopupCardVO2.auctionData);
        C21198117xT c21198117xT = C21198117xT.LIZ;
        UsBidViewModel usBidViewModel3 = this.LLILLJJLI;
        c21198117xT.getClass();
        C21198117xT.LIZ("auction_maxbid_popup_show", usBidViewModel3, null);
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            C786410Ut5.I7(new C19673911yD(new AwS395S0200000_29(c197039127h, this, 74)), c197039127h);
        }
        C810203Em.LIZIZ(getContext(), this.LLJJI);
        SmartImageView smartImageView = this.LLJJI;
        if (smartImageView != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC19509711Up() { // from class: X.11yB
                @Override // X.AbstractViewOnClickListenerC19509711Up
                public final void LIZ(View view) {
                    UsPopupCardVO usPopupCardVO4;
                    AuctionData auctionData2;
                    BidPanel bidPanel;
                    String str2;
                    if (view != null) {
                        this.LLILLL.OR("wallet", false);
                        UsMaxBidFragment usMaxBidFragment = this.LLILLL;
                        UsBidViewModel usBidViewModel4 = usMaxBidFragment.LLILLJJLI;
                        if (usBidViewModel4 != null && (usPopupCardVO4 = usBidViewModel4.LLILLJJLI) != null && (auctionData2 = usPopupCardVO4.auctionData) != null && (bidPanel = auctionData2.bidPanel) != null && (str2 = bidPanel.addressPaymentSchema) != null) {
                            SmartRouter.buildRoute(usMaxBidFragment.getContext(), str2).open();
                        }
                    }
                }
            }, smartImageView);
        }
        SmartImageView smartImageView2 = this.LLJJI;
        UsBidViewModel usBidViewModel4 = this.LLILLJJLI;
        if (usBidViewModel4 != null && (usPopupCardVO = usBidViewModel4.LLILLJJLI) != null && (auctionData = usPopupCardVO.auctionData) != null && (customizePanel = auctionData.customizePanel) != null) {
            str = customizePanel.addressPayIcon;
        }
        C810203Em.LIZ(smartImageView2, str);
        OR("wallet", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[PHI: r3
      0x0016: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:9:0x0014, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL() {
        /*
            r4 = this;
            X.19EG r0 = r4.getActivity()
            if (r0 == 0) goto Lc
            android.view.View r3 = r0.getCurrentFocus()
            if (r3 != 0) goto L16
        Lc:
            X.0vbJ r0 = r4.LLJ
            if (r0 == 0) goto L3e
            X.0I7D r3 = r0.getEditText()
        L14:
            if (r3 == 0) goto L19
        L16:
            r3.clearFocus()
        L19:
            com.ss.android.ugc.aweme.base.utils.KeyboardUtils.LIZIZ(r3)
            X.19EG r1 = r4.getActivity()
            r2 = 0
            if (r1 == 0) goto L3c
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = X.C786410Ut5.J2(r1, r0)
        L29:
            boolean r0 = r1 instanceof android.view.inputmethod.InputMethodManager
            if (r0 == 0) goto L3b
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L3b
            if (r3 == 0) goto L37
            android.os.IBinder r2 = r3.getWindowToken()
        L37:
            r0 = 2
            r1.hideSoftInputFromWindow(r2, r0)
        L3b:
            return
        L3c:
            r1 = r2
            goto L29
        L3e:
            android.view.View r3 = r4.getView()
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment.LJJIL():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        UsBidViewModel usBidViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        super.onDestroy();
        LJJIL();
        C0H27 c0h27 = this.LL;
        if (c0h27 != null) {
            C786410Ut5.C3(c0h27.getContentView().getViewTreeObserver(), c0h27);
        }
        UsBidViewModel usBidViewModel2 = this.LLILLJJLI;
        if (usBidViewModel2 != null && (mutableLiveData = usBidViewModel2.LLJI) != null) {
            mutableLiveData.removeObservers(this);
        }
        UsBidViewModel usBidViewModel3 = this.LLILLJJLI;
        if (usBidViewModel3 != null) {
            ((ArrayList) usBidViewModel3.LLJILJILJ).remove(this);
        }
        AbstractC212300186g abstractC212300186g = this.LLIZ;
        if (abstractC212300186g == null || (usBidViewModel = this.LLILLJJLI) == null) {
            return;
        }
        ((ArrayList) usBidViewModel.LLJILJIL).remove(abstractC212300186g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        String str;
        UsPopupCardVO usPopupCardVO;
        AuctionData auctionData;
        C181U c181u;
        UsBidViewModel usBidViewModel;
        Window window;
        super.onDetach();
        LJJIL();
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(this.LLILZLL);
        }
        AbstractC212300186g abstractC212300186g = this.LLIZ;
        if (abstractC212300186g != null && (usBidViewModel = this.LLILLJJLI) != null) {
            ((ArrayList) usBidViewModel.LLJILJIL).remove(abstractC212300186g);
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        UsBidViewModel usBidViewModel2 = this.LLILLJJLI;
        Map<String, String> map = null;
        extendAuctionCfg = null;
        extendAuctionCfg = null;
        ExtendAuctionCfg extendAuctionCfg = null;
        if (usBidViewModel2 != null) {
            Map<String, String> mapXQ2 = usBidViewModel2.xQ2(null, null, true);
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("page_name", "live_auction_set_max_bid");
            UsBidViewModel usBidViewModel3 = this.LLILLJJLI;
            if (usBidViewModel3 == null || (c181u = usBidViewModel3.LLJIJIL) == null || (str = c181u.LJIIJJI) == null) {
                str = "";
            }
            pairArr[1] = new Pair("auction_id", str);
            UsBidViewModel usBidViewModel4 = this.LLILLJJLI;
            if (usBidViewModel4 != null && (usPopupCardVO = usBidViewModel4.LLILLJJLI) != null && (auctionData = usPopupCardVO.auctionData) != null) {
                extendAuctionCfg = auctionData.extendAuctionCfg;
            }
            pairArr[2] = new Pair("is_extended_auction", C19673811yC.LIZJ(extendAuctionCfg));
            pairArr[3] = new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LLILZ));
            pairArr[4] = new Pair("quit_type", this.LLILZIL ? "submit" : "user_close");
            mapXQ2.putAll(C2097608Jq.LJIIJ(pairArr));
            map = mapXQ2;
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_stay_page", map);
        C21198117xT c21198117xT = C21198117xT.LIZ;
        UsBidViewModel usBidViewModel5 = this.LLILLJJLI;
        c21198117xT.getClass();
        C21198117xT.LIZ("auction_maxbid_popup_dismiss", usBidViewModel5, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        LJJIL();
    }

    public final void MR(boolean z) {
        MutableLiveData<Boolean> mutableLiveData;
        TuxSheet tuxSheet;
        this.LLILZIL = z;
        LJJIL();
        try {
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof TuxSheet) && (tuxSheet = (TuxSheet) parentFragment) != null) {
                tuxSheet.dismiss();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        UsBidViewModel usBidViewModel = this.LLILLJJLI;
        if (usBidViewModel != null && (mutableLiveData = usBidViewModel.LLJ) != null) {
            mutableLiveData.postValue(Boolean.TRUE);
        }
    }

    public void NR(View view) {
        this.LLIZ = (AbstractC212300186g) view.findViewById(R.id.bzg);
        this.LLIZLLLIL = (C197039127h) view.findViewById(R.id.gkj);
        this.LLJ = (C1748470vbJ) view.findViewById(R.id.o4e);
        this.LLJI = (LinearLayout) view.findViewById(R.id.o4f);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.o4g);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.o4i);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.o4j);
        this.LLJILLL = view.findViewById(R.id.voh);
        view.findViewById(R.id.warning_tips);
        this.LLJJ = (LinearLayout) view.findViewById(R.id.bzl);
        this.LLJJI = (SmartImageView) view.findViewById(R.id.v5g);
    }

    public void PR(AuctionData auctionData) {
        List<String> list;
        SinglePriceItem singlePriceItem;
        String str;
        CustomizePanel customizePanel;
        CustomizePanel customizePanel2;
        String str2;
        CustomizePanel customizePanel3;
        String str3;
        CustomizePanel customizePanel4;
        C181U c181u;
        AbstractC212300186g abstractC212300186g = this.LLIZ;
        String strCurrency = null;
        if (abstractC212300186g != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("usbid", "setAuctionData from max bid fragment setAuctionData");
            UsBidViewModel usBidViewModel = this.LLILLJJLI;
            if (usBidViewModel != null) {
                c181u = usBidViewModel.LLJIJIL;
            } else {
                c181u = null;
            }
            abstractC212300186g.z0(c181u, Boolean.FALSE);
        }
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            if (auctionData != null && (customizePanel4 = auctionData.customizePanel) != null) {
                str3 = customizePanel4.title;
            } else {
                str3 = null;
            }
            tuxTextView.setText(str3);
        }
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 != null) {
            if (auctionData != null && (customizePanel3 = auctionData.customizePanel) != null) {
                str2 = customizePanel3.desc;
            } else {
                str2 = null;
            }
            tuxTextView2.setText(str2);
        }
        if (auctionData != null && (customizePanel2 = auctionData.customizePanel) != null) {
            list = customizePanel2.infoList;
        } else {
            list = null;
        }
        LinearLayout linearLayout = this.LLJJ;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
            if (list != null) {
                int i2 = 0;
                for (String str4 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C038R c038r = new C038R(linearLayout.getContext());
                        c038r.LL.setText(str4);
                        if (i2 > 0) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c038r);
                            c038r.setLayoutParams(layoutParams);
                        }
                        linearLayout.addView(c038r);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            if (auctionData != null && (customizePanel = auctionData.customizePanel) != null) {
                str = customizePanel.submitBtnText;
            } else {
                str = null;
            }
            c197039127h.setText(str);
        }
        C1748470vbJ c1748470vbJ = this.LLJ;
        if (c1748470vbJ != null) {
            TuxTextView tuxTextView3 = new TuxTextView(c1748470vbJ.getContext(), null, 6, 0);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
            C786410Ut5.R6(tuxTextView3, layoutParams2);
            tuxTextView3.setIncludeFontPadding(false);
            if (auctionData != null && (singlePriceItem = auctionData.currentBidPrice) != null) {
                strCurrency = singlePriceItem.currency();
            }
            tuxTextView3.setText(strCurrency);
            tuxTextView3.setTuxFont(123);
            c1748470vbJ.LJIIL(tuxTextView3);
            C0I7D editText = c1748470vbJ.getEditText();
            if (editText != null) {
                editText.setIncludeFontPadding(false);
            }
            c1748470vbJ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.11yE
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                }
            });
        }
    }

    @Override // X.C181X
    public final void ky(UsPopupCardVO usPopupCardVO) {
        RR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        OR("submit", true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[PHI: r1
      0x00ca: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:50:0x00c8, B:48:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment.OR(java.lang.String, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        UsPopupCardVO usPopupCardVO;
        AuctionData auctionData;
        C181U c181u;
        UsBidViewModel usBidViewModel;
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = this.LLJI;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
        }
        C1748470vbJ c1748470vbJ = this.LLJ;
        if (c1748470vbJ != null) {
            c1748470vbJ.LJII(2);
            c1748470vbJ.setFocusable(true);
            c1748470vbJ.LJIIIZ(1);
            c1748470vbJ.LIZJ();
            c1748470vbJ.LJFF(false);
            c1748470vbJ.getEditText().requestFocus();
            c1748470vbJ.LIZIZ(new C19773412Ya(this, 16));
            c1748470vbJ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.11yF
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    if (z) {
                        int i = C2187451AjH.LIZ;
                    } else {
                        int i2 = C2187451AjH.LIZ;
                    }
                }
            });
        }
        Fragment parentFragment = getParentFragment();
        Map<String, String> map = null;
        extendAuctionCfg = null;
        extendAuctionCfg = null;
        ExtendAuctionCfg extendAuctionCfg = null;
        if ((parentFragment instanceof TuxSheet) && parentFragment != null) {
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(this.LLILLL, this);
        }
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            C197039127h c197039127h2 = this.LLIZLLLIL;
            if (c197039127h2 != null) {
                C786410Ut5.w5(c197039127h2, 0.4f);
            }
        }
        AbstractC212300186g abstractC212300186g = this.LLIZ;
        if (abstractC212300186g != null && (usBidViewModel = this.LLILLJJLI) != null) {
            usBidViewModel.CQ2(abstractC212300186g);
        }
        UsBidViewModel usBidViewModel2 = this.LLILLJJLI;
        if (usBidViewModel2 != null) {
            ((ArrayList) usBidViewModel2.LLJILJILJ).add(this);
        }
        RR();
        if (this.LLJ != null) {
            C2487409ou.LIZJ(new ARunnableS129S0100000_29(this, 27));
        }
        this.LLILZ = System.currentTimeMillis();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        UsBidViewModel usBidViewModel3 = this.LLILLJJLI;
        if (usBidViewModel3 != null) {
            Map<String, String> mapXQ2 = usBidViewModel3.xQ2(null, null, true);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("page_name", "live_auction_set_max_bid");
            UsBidViewModel usBidViewModel4 = this.LLILLJJLI;
            if (usBidViewModel4 == null || (c181u = usBidViewModel4.LLJIJIL) == null || (str = c181u.LJIIJJI) == null) {
                str = "";
            }
            pairArr[1] = new Pair("auction_id", str);
            UsBidViewModel usBidViewModel5 = this.LLILLJJLI;
            if (usBidViewModel5 != null && (usPopupCardVO = usBidViewModel5.LLILLJJLI) != null && (auctionData = usPopupCardVO.auctionData) != null) {
                extendAuctionCfg = auctionData.extendAuctionCfg;
            }
            pairArr[2] = new Pair("is_extended_auction", C19673811yC.LIZJ(extendAuctionCfg));
            mapXQ2.putAll(C2097608Jq.LJIIJ(pairArr));
            map = mapXQ2;
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_enter_page", map);
    }

    @Override // X.C0H28
    public final void uj(int i, int i2) {
        C21578619ce c21578619ce;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOpened, keyboardhelper, cvh:");
        sbLIZ.append(i);
        sbLIZ.append(", kbh:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, i2));
        }
        this.LLJJIJI = true;
        this.LLILLL = i;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && parentFragment != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(this.LLILLL + i2, this);
            int i4 = this.LLILLL + i2;
            View view2 = parentFragment.getView();
            if (view2 != null && (c21578619ce = (C21578619ce) view2.findViewById(R.id.v4b)) != null) {
                HandlerHook.viewPost(c21578619ce, new ARunnableS16S0101000_5(i4, c21578619ce, 12));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        MutableLiveData<Boolean> mutableLiveData;
        View viewTd = C786410Ut5.Td(layoutInflater, getLayoutId(), viewGroup, false);
        C0H27 c0h27 = new C0H27(viewTd.getContext(), viewTd);
        this.LL = c0h27;
        c0h27.LLIZ = this;
        C786410Ut5.x3(c0h27.getContentView().getViewTreeObserver(), c0h27);
        HandlerHook.viewPost(c0h27.LL, new ARunnableS106S0100000_6(c0h27, 181));
        UsBidViewModel usBidViewModel = this.LLILLJJLI;
        if (usBidViewModel != null && (mutableLiveData = usBidViewModel.LLJI) != null) {
            mutableLiveData.observe(this, new AObserverS231S0100000_29(this, 41));
        }
        NR(viewTd);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
