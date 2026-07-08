package com.ss.android.ugc.aweme.ui;

import X.AbstractC1031660cxA;
import X.AbstractC1891907b3;
import X.C01GW;
import X.C03ES;
import X.C098200Yq;
import X.C0C64;
import X.C0OZQ;
import X.C1007900cKq;
import X.C1009340cNA;
import X.C1014540cVY;
import X.C1014570cVb;
import X.C1016050cXz;
import X.C1016230cYH;
import X.C1016660cYy;
import X.C1022280ci2;
import X.C1025720cna;
import X.C1026310coX;
import X.C1028100crQ;
import X.C1031290cwZ;
import X.C1031310cwb;
import X.C1031370cwh;
import X.C1031550cwz;
import X.C1031750cxJ;
import X.C1031810cxP;
import X.C1031850cxT;
import X.C1032890cz9;
import X.C1032910czB;
import X.C1035140d2m;
import X.C128Y;
import X.C1390410mHn;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1891207aw;
import X.C1891707b1;
import X.C189200o6;
import X.C1892107b5;
import X.C1892507b9;
import X.C1906580ziK;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C277740Aua;
import X.C371360EhC;
import X.C452501pT;
import X.C7740030o;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C988850bq7;
import X.C989530brD;
import X.C994003uc;
import X.C995850c1P;
import X.C997480c42;
import X.C997490c43;
import X.C997500c44;
import X.C997510c45;
import X.EnumC1009140cMq;
import X.EnumC1031610cx5;
import X.EnumC1031620cx6;
import X.EnumC1031640cx8;
import X.EnumC696280RSw;
import X.InterfaceC1014340cVE;
import X.InterfaceC1031540cwy;
import X.InterfaceC1031710cxF;
import X.InterfaceC1031720cxG;
import X.InterfaceC1031820cxQ;
import X.InterfaceC1031910cxZ;
import X.InterfaceC1031950cxd;
import X.InterfaceC1032010cxj;
import X.InterfaceC1032100cxs;
import X.InterfaceC1033010czL;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036270d4b;
import X.ViewOnClickListenerC1031580cx2;
import X.ViewTreeObserverOnWindowFocusChangeListenerC1031740cxI;
import Y.ALAdapterS3S0100000_6;
import Y.AfS185S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdRewardData;
import com.ss.android.ugc.aweme.feed.model.ad.RewardAdCountdownInfo;
import com.ss.android.ugc.aweme.feed.model.ad.RewardAdRetentionPopup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardAdContainer extends Fragment implements InterfaceC1032010cxj, InterfaceC1031950cxd, View.OnClickListener, InterfaceC1033010czL {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCHELIOSI2ZjAlZx02PyQ+LQ43CyoiPS46JiA+";
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public FrameLayout LLILZLL;
    public C1390410mHn LLIZ;
    public C1035140d2m LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public InterfaceC1031540cwy LLJIJIL;
    public C1016230cYH LLJILLL;
    public C1016050cXz LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public int LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public ViewGroup LLJJJ;
    public TextView LLJJJIL;
    public ViewGroup LLJJJJ;
    public C03ES LLJJJJJIL;
    public C371360EhC LLJJJJLIIL;
    public Boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public Boolean LLJLIL;
    public InterfaceC1031910cxZ LLJLILLLLZIIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(280));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(279));
    public String LLJJL = EnumC1031620cx6.DEFAULT.getValue();
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 593));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 594));
    public final ViewTreeObserverOnWindowFocusChangeListenerC1031740cxI LLJLLL = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0cxI
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            InterfaceC1031720cxG interfaceC1031720cxGOR = this.LL.OR();
            if (interfaceC1031720cxGOR != null) {
                interfaceC1031720cxGOR.LIZ(z);
            }
        }
    };
    public final C1031750cxJ LLJZ = new InterfaceC1031820cxQ() { // from class: X.0cxJ
        @Override // X.InterfaceC1031820cxQ
        public final C1031760cxK LJI() {
            return new C1031760cxK(this.LIZ);
        }

        @Override // X.InterfaceC1031820cxQ
        public final C1022270ci1 getEventTracker() {
            return new C1022270ci1(this.LIZ);
        }

        @Override // X.InterfaceC1031820cxQ
        public final C1031700cxE getPlayer() {
            return new C1031700cxE(this.LIZ);
        }
    };

    @Override // X.InterfaceC1032010cxj
    public final void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // X.InterfaceC1032010cxj
    public final void N() {
        Object hostModel;
        AwemeRawAd awemeRawAd;
        Object hostModel2;
        View view;
        TuxIconView tuxIconView;
        this.LLJJIJIIJIL++;
        C1016230cYH c1016230cYH = this.LLJILLL;
        if (c1016230cYH != null && (view = c1016230cYH.LIZ) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.tis)) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        View viewFindViewById = this.LLILZLL;
        UrlModel trackUrlList = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            viewFindViewById = view2 != null ? view2.findViewById(R.id.tio) : null;
            this.LLILZLL = (FrameLayout) viewFindViewById;
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        View viewFindViewById2 = this.LLIZ;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            viewFindViewById2 = view3 != null ? view3.findViewById(R.id.tii) : null;
            this.LLIZ = (C1390410mHn) viewFindViewById2;
        }
        C1390410mHn c1390410mHn = (C1390410mHn) viewFindViewById2;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C989530brD.LIZ();
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        if (interfaceC1031540cwy != null) {
            interfaceC1031540cwy.videoPlayStateDidChange(EnumC1031610cx5.START, this.LLJJIJIIJIL);
        }
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if (interfaceC1031540cwy2 != null && (hostModel2 = interfaceC1031540cwy2.getHostModel()) != null) {
            interfaceC1031540cwy2.trackEvent(new C1031310cwb("show", interfaceC1031540cwy2.getCustomAdExtraDataParams(), 4), hostModel2);
        }
        InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
        if (interfaceC1031540cwy3 != null) {
            Object hostModel3 = interfaceC1031540cwy3.getHostModel();
            RewardAdModel rewardAdModel = interfaceC1031540cwy3.getRewardAdModel();
            if (rewardAdModel != null && (awemeRawAd = rewardAdModel.awemeRawAd) != null) {
                trackUrlList = awemeRawAd.getTrackUrlList();
            }
            if (hostModel3 != null && trackUrlList != null && interfaceC1031540cwy3 != null) {
                interfaceC1031540cwy3.track3rdPartyURL(new C1031370cwh(trackUrlList, "show", 12), hostModel3);
            }
        }
        Context context = getContext();
        int i = this.LLJJIJIIJIL;
        FrameLayout frameLayoutPR = PR();
        InterfaceC1031710cxF interfaceC1031710cxFRR = RR();
        InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLJIJIL;
        if (interfaceC1031540cwy4 != null && (hostModel = interfaceC1031540cwy4.getHostModel()) != null && frameLayoutPR != null && interfaceC1031540cwy4 != null) {
            interfaceC1031540cwy4.trackOMSDK(new C1031290cwZ(i - 1, frameLayoutPR, new AwS560S0100000_16(interfaceC1031710cxFRR, 568), new AwS560S0100000_16(interfaceC1031710cxFRR, 578)), hostModel, context);
        }
        InterfaceC1031540cwy interfaceC1031540cwy5 = this.LLJIJIL;
        if (interfaceC1031540cwy5 != null) {
            HashMap map = new HashMap();
            map.put("tag", "reward_ad");
            map.putAll(interfaceC1031540cwy5.getCustomAdExtraDataParams());
            C1032910czB.LIZ(interfaceC1031540cwy5, "reward_video_show", C1032910czB.LIZJ(map));
        }
        C1022280ci2.LIZ(this, true);
        C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null) {
            c1016050cXz.LIZJ(C995850c1P.LIZ);
        }
        InterfaceC1031540cwy interfaceC1031540cwy6 = this.LLJIJIL;
        if (interfaceC1031540cwy6 != null) {
            interfaceC1031540cwy6.onRewardAdShow(Integer.valueOf(this.LLJJIJIIJIL));
        }
    }

    public final InterfaceC1031720cxG OR() {
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        if (interfaceC1031540cwy != null) {
            return interfaceC1031540cwy.getGpMiniCardManager();
        }
        return null;
    }

    public final FrameLayout PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tij) : null;
            this.LL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final InterfaceC1031710cxF RR() {
        return (InterfaceC1031710cxF) this.LLJILJIL.getValue();
    }

    public final void SR() {
        Pair pair;
        InterfaceC1032100cxs interfaceC1032100cxs;
        RewardAdModel rewardAdModel;
        AwemeRawAd awemeRawAd;
        AdRewardData adRewardData;
        RewardAdRetentionPopup retentionPopup;
        String singularDesc;
        Object hostModel;
        Window window;
        InterfaceC1032100cxs interfaceC1032100cxs2;
        C1031810cxP adConfig;
        Object hostModel2;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        int i = this.LLJJIJIIJIL;
        long jLIZIZ = RR().LIZIZ().LIZIZ();
        if (interfaceC1031540cwy != null && (hostModel2 = interfaceC1031540cwy.getHostModel()) != null) {
            interfaceC1031540cwy.trackEvent(new C1031310cwb("draw_ad", "close", "button", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i)), new Pair("duration", Long.valueOf(jLIZIZ)))), hostModel2);
        }
        Context context = getContext();
        if (context != null) {
            InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
            if (interfaceC1031540cwy2 == null || (adConfig = interfaceC1031540cwy2.getAdConfig()) == null || !adConfig.LIZJ) {
                if (this.LLJJIII) {
                    Boolean bool = Boolean.FALSE;
                    pair = new Pair(bool, bool);
                } else {
                    InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
                    if (!(interfaceC1031540cwy3 instanceof InterfaceC1032100cxs) || (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1031540cwy3) == null) {
                        Boolean bool2 = Boolean.TRUE;
                        pair = new Pair(bool2, bool2);
                    } else {
                        InterfaceC1031910cxZ interfaceC1031910cxZ = this.LLJLILLLLZIIL;
                        if (interfaceC1031910cxZ == null) {
                            Boolean bool3 = Boolean.TRUE;
                            pair = new Pair(bool3, bool3);
                        } else if (interfaceC1031910cxZ.LIZ()) {
                            pair = new Pair(Boolean.TRUE, Boolean.FALSE);
                        } else {
                            int iLIZIZ = interfaceC1031910cxZ.LIZIZ();
                            InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLJIJIL;
                            if (interfaceC1031540cwy4 == null || (rewardAdModel = interfaceC1031540cwy4.getRewardAdModel()) == null || (awemeRawAd = rewardAdModel.awemeRawAd) == null || (adRewardData = awemeRawAd.adRewardData) == null || (retentionPopup = adRewardData.getRetentionPopup()) == null) {
                                Boolean bool4 = Boolean.TRUE;
                                pair = new Pair(bool4, bool4);
                            } else {
                                this.LLJJIII = true;
                                ViewOnClickListenerC1031580cx2 viewOnClickListenerC1031580cx2 = new ViewOnClickListenerC1031580cx2(context);
                                viewOnClickListenerC1031580cx2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0cxS
                                    @Override // android.widget.PopupWindow.OnDismissListener
                                    public final void onDismiss() {
                                        this.LL.LLJJIII = false;
                                    }
                                });
                                C19EG activity = getActivity();
                                View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                                viewOnClickListenerC1031580cx2.LLILZIL = interfaceC1032100cxs;
                                viewOnClickListenerC1031580cx2.LLILZLL = interfaceC1032100cxs instanceof InterfaceC1031540cwy ? (InterfaceC1031540cwy) interfaceC1032100cxs : null;
                                interfaceC1032100cxs.pause();
                                InterfaceC1031540cwy interfaceC1031540cwy5 = viewOnClickListenerC1031580cx2.LLILZLL;
                                if (interfaceC1031540cwy5 != null) {
                                    interfaceC1031540cwy5.onRewardAdPause(null);
                                }
                                TextView textView = viewOnClickListenerC1031580cx2.LL;
                                if (textView != null) {
                                    textView.setText(retentionPopup.getTitle());
                                }
                                if (iLIZIZ <= 1 ? (singularDesc = retentionPopup.getSingularDesc()) == null : (singularDesc = retentionPopup.getPluralDesc()) == null) {
                                    singularDesc = "";
                                }
                                TextView textView2 = viewOnClickListenerC1031580cx2.LLILLJJLI;
                                if (textView2 != null) {
                                    textView2.setText(u.LJJIFFI(singularDesc, "{num}", String.valueOf(iLIZIZ), false));
                                }
                                TextView textView3 = viewOnClickListenerC1031580cx2.LLILLL;
                                if (textView3 != null) {
                                    textView3.setText(retentionPopup.getConfirmButtonText());
                                }
                                TextView textView4 = viewOnClickListenerC1031580cx2.LLILZ;
                                if (textView4 != null) {
                                    textView4.setText(retentionPopup.getBackButtonText());
                                }
                                viewOnClickListenerC1031580cx2.showAtLocation(decorView, 17, 0, 0);
                                PopupMonitorServiceImpl.LIZ.getClass();
                                PopupMonitorServiceImpl.LJJJI(viewOnClickListenerC1031580cx2);
                                C787990Uvd.LIZ.getClass();
                                C994003uc.LIZ();
                                InterfaceC1031540cwy interfaceC1031540cwy6 = viewOnClickListenerC1031580cx2.LLILZLL;
                                if (interfaceC1031540cwy6 != null && (hostModel = interfaceC1031540cwy6.getHostModel()) != null) {
                                    interfaceC1031540cwy6.trackEvent(new C1031310cwb("draw_ad", "othershow", "popup_window", interfaceC1031540cwy6.getCustomAdExtraDataParams()), hostModel);
                                }
                                Boolean bool5 = Boolean.FALSE;
                                pair = new Pair(bool5, bool5);
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                if (((Boolean) pair.getSecond()).booleanValue()) {
                    MR(false);
                }
                if (zBooleanValue) {
                    InterfaceC1031540cwy interfaceC1031540cwy7 = this.LLJIJIL;
                    if ((interfaceC1031540cwy7 instanceof InterfaceC1032100cxs) && (interfaceC1032100cxs2 = (InterfaceC1032100cxs) interfaceC1031540cwy7) != null) {
                        interfaceC1032100cxs2.exit(true);
                    }
                }
            } else {
                InterfaceC1031540cwy interfaceC1031540cwy8 = this.LLJIJIL;
                if (interfaceC1031540cwy8 != null) {
                    interfaceC1031540cwy8.willExit(context);
                }
            }
            C1016050cXz c1016050cXz = this.LLJJ;
            if (c1016050cXz != null) {
                c1016050cXz.LJI = true;
                for (String str : c1016050cXz.LJIIJ) {
                    IAnoleManager iAnoleManager = c1016050cXz.LJIIIIZZ;
                    if (iAnoleManager != null) {
                        iAnoleManager.LJI(str);
                    }
                }
                C989530brD.LIZ();
            }
        }
    }

    public final void UR() throws JSONException {
        Object hostModel;
        Object hostModel2;
        IAnoleManager iAnoleManager;
        C1009340cNA c1009340cNA;
        RewardAdModel rewardAdModel;
        n nVar;
        HashMap<String, Object> customAdExtraDataParams;
        ViewTreeObserver viewTreeObserver;
        RewardAdModel rewardAdModel2;
        AwemeRawAd awemeRawAd;
        TuxIconView tuxIconView;
        C1016230cYH c1016230cYH = this.LLJILLL;
        if (c1016230cYH != null) {
            View view = c1016230cYH.LIZ;
            if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.tie)) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            c1016230cYH.LIZ(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareToShowAd, model.adid: ");
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        sbLIZ.append((interfaceC1031540cwy == null || (rewardAdModel2 = interfaceC1031540cwy.getRewardAdModel()) == null || (awemeRawAd = rewardAdModel2.awemeRawAd) == null) ? null : awemeRawAd.getAdId());
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        RR().LIZJ(this);
        View view2 = getView();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnWindowFocusChangeListener(this.LLJLLL);
        }
        InterfaceC1031720cxG interfaceC1031720cxGOR = OR();
        if (interfaceC1031720cxGOR != null) {
            interfaceC1031720cxGOR.LJFF(getContext(), this.LLJZ);
        }
        ArrayList<C1031850cxT> arrayList = new ArrayList();
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view3 = getView();
            viewFindViewById = view3 != null ? view3.findViewById(R.id.tj1) : null;
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        if (viewGroup != null) {
            arrayList.add(new C1031850cxT(EnumC696280RSw.REWARD_ANOLE_SLIDE_SLOT.getSlotName(), viewGroup));
        }
        View viewFindViewById2 = this.LLJI;
        if (viewFindViewById2 == null) {
            View view4 = getView();
            viewFindViewById2 = view4 != null ? view4.findViewById(R.id.ti0) : null;
            this.LLJI = (FrameLayout) viewFindViewById2;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        if (viewGroup2 != null) {
            arrayList.add(new C1031850cxT(EnumC696280RSw.REWARD_ANOLE_TOP_FULL_SLOT.getSlotName(), viewGroup2));
        }
        final C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null) {
            InterfaceC1031540cwy interfaceC1031540cwy2 = c1016050cXz.LIZIZ;
            if (interfaceC1031540cwy2 == null || (rewardAdModel = interfaceC1031540cwy2.getRewardAdModel()) == null) {
                c1009340cNA = null;
            } else {
                String str = rewardAdModel.aid;
                Object hostModel3 = c1016050cXz.LIZIZ.getHostModel();
                AwemeRawAd awemeRawAd2 = rewardAdModel.awemeRawAd;
                InterfaceC1031540cwy interfaceC1031540cwy3 = c1016050cXz.LIZIZ;
                if (interfaceC1031540cwy3 == null || (customAdExtraDataParams = interfaceC1031540cwy3.getCustomAdExtraDataParams()) == null || customAdExtraDataParams.isEmpty()) {
                    nVar = null;
                } else {
                    nVar = new n();
                    nVar.LJJIFFI("coinTrackInfo", GsonProtectorUtils.toJsonTree(C7740030o.LIZ().getGson(), customAdExtraDataParams));
                }
                c1009340cNA = new C1009340cNA(str, null, hostModel3, awemeRawAd2, nVar, null, null, 96);
            }
            Context context = c1016050cXz.LIZ;
            if (c1009340cNA != null && context != null) {
                C1007900cKq c1007900cKqLJI = ((IAnoleService) c1016050cXz.LJFF.getValue()).LJI(context, null, c1009340cNA, c1016050cXz, null);
                c1016050cXz.LJIIIIZZ = c1007900cKqLJI;
                if (c1007900cKqLJI != null) {
                    c1007900cKqLJI.mount(c1016050cXz.LIZJ, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName(), new InterfaceC1014340cVE() { // from class: X.0cY1
                        @Override // X.InterfaceC1014340cVE
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LIZLLL(boolean z) {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJFF(boolean z) {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJI(String str2, Integer num, Integer num2, Integer num3, Integer num4) {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJII() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJJJIL() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJ(String str2, View view5, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                            ViewGroup.MarginLayoutParams marginLayoutParams;
                            int height = view5.getHeight() + C341940Daq.LIZ(anoleComponentLayoutModel.bottom);
                            C1016050cXz c1016050cXz2 = c1016050cXz;
                            if (c1016050cXz2.LJIIIZ == height) {
                                return;
                            }
                            c1016050cXz2.LJIIIZ = height;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("updateRewardAnoleLayout height: ");
                            sbLIZ2.append(height);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C989530brD.LIZ();
                            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "incentive_ad_lynx2native_enable", true, true)) {
                                ViewGroup viewGroup3 = c1016050cXz2.LIZJ;
                                ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = height;
                                    C786410Ut5.X5(layoutParams, viewGroup3);
                                }
                                viewGroup3.requestLayout();
                            }
                            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                                C786410Ut5.W5(view5, marginLayoutParams);
                            }
                            view5.requestLayout();
                        }
                    });
                }
                if (!arrayList.isEmpty()) {
                    for (C1031850cxT c1031850cxT : arrayList) {
                        IAnoleManager iAnoleManager2 = c1016050cXz.LJIIIIZZ;
                        if (iAnoleManager2 != null) {
                            iAnoleManager2.mount(c1031850cxT.LIZ, c1031850cxT.LIZIZ, null);
                        }
                    }
                }
            }
        }
        C1016050cXz c1016050cXz2 = this.LLJJ;
        if (c1016050cXz2 != null && (iAnoleManager = c1016050cXz2.LJIIIIZZ) != null) {
            iAnoleManager.LJIIL("now_render", null);
        }
        Context context2 = getContext();
        InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLJIJIL;
        if (interfaceC1031540cwy4 != null && (hostModel2 = interfaceC1031540cwy4.getHostModel()) != null) {
            interfaceC1031540cwy4.trackOMSDK(new C1891207aw(), hostModel2, context2);
        }
        Context context3 = getContext();
        FrameLayout frameLayoutPR = PR();
        InterfaceC1031540cwy interfaceC1031540cwy5 = this.LLJIJIL;
        if (interfaceC1031540cwy5 != null && (hostModel = interfaceC1031540cwy5.getHostModel()) != null && frameLayoutPR != null && interfaceC1031540cwy5 != null) {
            interfaceC1031540cwy5.trackOMSDK(new C1892507b9(frameLayoutPR), hostModel, context3);
        }
        InterfaceC1031540cwy interfaceC1031540cwy6 = this.LLJIJIL;
        System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        C1032910czB.LIZ(interfaceC1031540cwy6, "reward_video_render_start", jSONObject);
        int iHashCode = hashCode();
        InterfaceC1031540cwy interfaceC1031540cwy7 = this.LLJIJIL;
        C988850bq7.LIZIZ(iHashCode, interfaceC1031540cwy7 != null ? interfaceC1031540cwy7.getHostModel() : null);
    }

    public final void VR() {
        C1031810cxP adConfig;
        RewardAdModel rewardAdModel;
        AwemeRawAd awemeRawAd;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        AdRewardData adRewardData = (interfaceC1031540cwy == null || (rewardAdModel = interfaceC1031540cwy.getRewardAdModel()) == null || (awemeRawAd = rewardAdModel.awemeRawAd) == null) ? null : awemeRawAd.adRewardData;
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if (interfaceC1031540cwy2 == null || (adConfig = interfaceC1031540cwy2.getAdConfig()) == null || adConfig.LIZIZ || adRewardData == null) {
            TextView textView = this.LLJJJIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
                return;
            }
            return;
        }
        C0OZQ c0ozq = new C0OZQ(new AwS560S0100000_16(this, 595));
        Long rewardDuration = adRewardData.getRewardDuration();
        long jLongValue = rewardDuration != null ? rewardDuration.longValue() : 0L;
        RewardAdCountdownInfo countDownInfo = adRewardData.getCountDownInfo();
        TextView textView2 = this.LLJJJIL;
        ViewGroup viewGroup = this.LLJJJJ;
        c0ozq.LJIIIZ = jLongValue;
        c0ozq.LJIIJ = countDownInfo;
        c0ozq.LJII = textView2;
        c0ozq.LJIIIIZZ = viewGroup;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 0);
        }
        c0ozq.LIZLLL();
        this.LLJLILLLLZIIL = c0ozq;
    }

    public final void finish() {
        C371360EhC c371360EhC = this.LLJJJJLIIL;
        if (c371360EhC != null) {
            int visibility = c371360EhC.getVisibility();
            c371360EhC.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c371360EhC);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC1032010cxj
    public final void h0() {
        RewardAdModel rewardAdModel;
        AwemeRawAd awemeRawAd;
        RewardAdModel rewardAdModel2;
        AwemeRawAd awemeRawAd2;
        Object hostModel;
        AwemeRawAd awemeRawAd3;
        Object hostModel2;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        int i = this.LLJJIJIIJIL;
        long jLIZJ = RR().LIZIZ().LIZJ();
        if (interfaceC1031540cwy != null && (hostModel2 = interfaceC1031540cwy.getHostModel()) != null) {
            interfaceC1031540cwy.trackEvent(new C1031310cwb("over", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i)), new Pair("duration", Long.valueOf(jLIZJ))), 4), hostModel2);
        }
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        UrlModel playOverTrackUrlList = null;
        if (interfaceC1031540cwy2 != null) {
            Object hostModel3 = interfaceC1031540cwy2.getHostModel();
            RewardAdModel rewardAdModel3 = interfaceC1031540cwy2.getRewardAdModel();
            if (rewardAdModel3 != null && (awemeRawAd3 = rewardAdModel3.awemeRawAd) != null) {
                playOverTrackUrlList = awemeRawAd3.getPlayOverTrackUrlList();
            }
            if (hostModel3 != null && playOverTrackUrlList != null && interfaceC1031540cwy2 != null) {
                interfaceC1031540cwy2.track3rdPartyURL(new C1031370cwh(playOverTrackUrlList, "play_over", 12), hostModel3);
            }
        }
        Context context = getContext();
        int i2 = this.LLJJIJIIJIL;
        FrameLayout frameLayoutPR = PR();
        InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
        if (interfaceC1031540cwy3 != null && (hostModel = interfaceC1031540cwy3.getHostModel()) != null && frameLayoutPR != null && interfaceC1031540cwy3 != null) {
            interfaceC1031540cwy3.trackOMSDK(new C1891707b1(i2, frameLayoutPR), hostModel, context);
        }
        C989530brD.LIZ();
        InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLJIJIL;
        if (interfaceC1031540cwy4 != null) {
            interfaceC1031540cwy4.videoPlayStateDidChange(EnumC1031610cx5.OVER, this.LLJJIJIIJIL);
        }
        C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null) {
            c1016050cXz.LIZJ(C997480c42.LIZ);
        }
        InterfaceC1031720cxG interfaceC1031720cxGOR = OR();
        if (interfaceC1031720cxGOR != null) {
            interfaceC1031720cxGOR.LIZIZ();
        }
        InterfaceC1031540cwy interfaceC1031540cwy5 = this.LLJIJIL;
        if (interfaceC1031540cwy5 != null) {
            interfaceC1031540cwy5.videoPlayStateDidChange(EnumC1031610cx5.RESTART, this.LLJJIJIIJIL);
        }
        C1016050cXz c1016050cXz2 = this.LLJJ;
        if (c1016050cXz2 != null) {
            c1016050cXz2.LIZJ(C997500c44.LIZ);
        }
        this.LLJJIJIIJIL++;
        C1022280ci2.LIZ(this, false);
        if (!Intrinsics.LJFF(this.LLJJL, EnumC1031620cx6.VIDEO_FINISH_AUTO_EXPAND.getValue()) || Intrinsics.LJFF(this.LLJJIJI, "up_slide")) {
            return;
        }
        final C1031550cwz c1031550cwz = (C1031550cwz) this.LLJILJILJ.getValue();
        final InterfaceC1031540cwy interfaceC1031540cwy6 = this.LLJIJIL;
        C19EG activity = getActivity();
        boolean z = this.LLJJI;
        c1031550cwz.getClass();
        if (activity == null || interfaceC1031540cwy6 == null || (rewardAdModel = interfaceC1031540cwy6.getRewardAdModel()) == null || (awemeRawAd = rewardAdModel.awemeRawAd) == null) {
            return;
        }
        c1031550cwz.LIZLLL = awemeRawAd.isOpenSystemBrowser();
        if (c1031550cwz.LIZ != EnumC1031640cx8.SHOWN) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("autoOpenLandingPage, openSystemBrowser: ");
            sbLIZ.append(c1031550cwz.LIZLLL);
            sbLIZ.append(", isLynx: ");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C989530brD.LIZ();
            Boolean bool = Boolean.FALSE;
            C1026310coX c1026310coX = new C1026310coX(null, awemeRawAd, new AdlpExtraModel(null, null, null, null, null, "auto_openpage_ad_page", 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null), false, new C1025720cna(0.6f, bool, Boolean.TRUE, 3, Boolean.FALSE, -1, -1, Boolean.FALSE), new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, false, false, bool, Boolean.TRUE, null, null, null, false, false, true, false, null, Boolean.FALSE));
            if (c1031550cwz.LIZLLL && (rewardAdModel2 = interfaceC1031540cwy6.getRewardAdModel()) != null && (awemeRawAd2 = rewardAdModel2.awemeRawAd) != null) {
                awemeRawAd2.setOpenSystemBrowser(false);
            }
            ((IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class)).LJIIJ(-1, activity, new InterfaceC1036270d4b() { // from class: X.0cx0
                @Override // X.InterfaceC1036270d4b
                public final void LLLFFI(TuxSheet tuxSheet, float f) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void Yc() {
                }

                @Override // X.InterfaceC1036270d4b
                public final void V() {
                    c1031550cwz.LJ = true;
                    C989530brD.LIZ();
                }

                @Override // X.InterfaceC1036270d4b
                public final void Gn(MotionEvent motionEvent) {
                    Object hostModel4;
                    C1031550cwz c1031550cwz2 = c1031550cwz;
                    if (c1031550cwz2.LIZIZ) {
                        return;
                    }
                    if (!c1031550cwz2.LIZ(motionEvent)) {
                        InterfaceC1031540cwy interfaceC1031540cwy7 = interfaceC1031540cwy6;
                        if (interfaceC1031540cwy7 != null && (hostModel4 = interfaceC1031540cwy7.getHostModel()) != null) {
                            interfaceC1031540cwy7.trackEvent(new C1031310cwb("auto_openpage_ad", "click", "page", interfaceC1031540cwy7.getCustomAdExtraDataParams()), hostModel4);
                        }
                        c1031550cwz.LIZIZ = true;
                    }
                    Fragment fragment = c1031550cwz.LJI;
                    if (fragment != null) {
                        String str = TuxSheet._pnsPageId;
                        C1391190mJ3.LJIIIIZZ(fragment, true);
                    }
                }

                @Override // X.InterfaceC1036270d4b
                public final void LLLLIIIILLL(TuxSheet tuxSheet, int i3) {
                    BottomSheetBehavior bottomSheetBehavior;
                    TuxSheetBehavior tuxSheetBehavior;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("autoOpenLandingPage onStateChanged, newState: ");
                    sbLIZ2.append(i3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C989530brD.LIZ();
                    if (c1031550cwz.LJ && i3 == 3) {
                        if (C299110Bnx.LIZ()) {
                            C16BC<?> c16bcLIZIZ = c1031550cwz.LIZIZ();
                            if ((c16bcLIZIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLIZIZ) != null) {
                                tuxSheetBehavior.LJIJI = false;
                                return;
                            }
                            return;
                        }
                        C16BC<?> c16bcLIZIZ2 = c1031550cwz.LIZIZ();
                        if (!(c16bcLIZIZ2 instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bcLIZIZ2) == null) {
                            return;
                        }
                        bottomSheetBehavior.setDraggable(false);
                    }
                }

                @Override // X.InterfaceC1036270d4b
                public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("autoOpenLandingPage onClose, fragment: ");
                    sbLIZ2.append(interfaceC1034470d1h);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C989530brD.LIZ();
                    if (tuxSheet != null) {
                        tuxSheet.dismiss();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1036270d4b
                public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str) {
                    Fragment fragment;
                    AwemeRawAd awemeRawAd4;
                    InterfaceC1033010czL interfaceC1033010czL = this;
                    if (interfaceC1033010czL != null) {
                        interfaceC1033010czL.pause(EnumC1031620cx6.VIDEO_FINISH_AUTO_EXPAND.getValue());
                    }
                    C1031550cwz c1031550cwz2 = c1031550cwz;
                    c1031550cwz2.LIZ = EnumC1031640cx8.SHOWING;
                    if (interfaceC1034470d1h instanceof Fragment) {
                        fragment = (Fragment) interfaceC1034470d1h;
                    } else {
                        fragment = null;
                    }
                    c1031550cwz2.LJI = fragment;
                    RewardAdModel rewardAdModel4 = interfaceC1031540cwy6.getRewardAdModel();
                    if (rewardAdModel4 != null && (awemeRawAd4 = rewardAdModel4.awemeRawAd) != null) {
                        awemeRawAd4.setOpenSystemBrowser(c1031550cwz.LIZLLL);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("autoOpenLandingPage onShow, fragment: ");
                    sbLIZ2.append(interfaceC1034470d1h);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C989530brD.LIZ();
                }

                @Override // X.InterfaceC1036270d4b
                public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str, String str2) {
                    BottomSheetBehavior bottomSheetBehavior;
                    TuxSheetBehavior tuxSheetBehavior;
                    InterfaceC1033010czL interfaceC1033010czL = this;
                    if (interfaceC1033010czL != null) {
                        interfaceC1033010czL.resume();
                    }
                    c1031550cwz.LIZ = EnumC1031640cx8.SHOWN;
                    if (C299110Bnx.LIZ()) {
                        C16BC<?> c16bcLIZIZ = c1031550cwz.LIZIZ();
                        if ((c16bcLIZIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLIZIZ) != null) {
                            tuxSheetBehavior.LJIJI = true;
                        }
                    } else {
                        C16BC<?> c16bcLIZIZ2 = c1031550cwz.LIZIZ();
                        if ((c16bcLIZIZ2 instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLIZIZ2) != null) {
                            bottomSheetBehavior.setDraggable(true);
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("autoOpenLandingPage onHide, fragment: ");
                    sbLIZ2.append(interfaceC1034470d1h);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C989530brD.LIZ();
                }
            }, c1026310coX, null);
        }
    }

    @Override // X.InterfaceC1032010cxj
    public final void M() {
        Object hostModel;
        Object hostModel2;
        C989530brD.LIZ();
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        if (interfaceC1031540cwy != null) {
            interfaceC1031540cwy.videoPlayStateDidChange(EnumC1031610cx5.RESUME, this.LLJJIJIIJIL);
        }
        C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null) {
            c1016050cXz.LIZJ(C997510c45.LIZ);
        }
        Context context = getContext();
        int i = this.LLJJIJIIJIL;
        final FrameLayout frameLayoutPR = PR();
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if (interfaceC1031540cwy2 != null && (hostModel2 = interfaceC1031540cwy2.getHostModel()) != null && frameLayoutPR != null && interfaceC1031540cwy2 != null) {
            final int i2 = i - 1;
            interfaceC1031540cwy2.trackOMSDK(new AbstractC1891907b3(i2, frameLayoutPR) { // from class: X.07ay
                public final int LIZ;
                public final View LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1891407ay)) {
                        return false;
                    }
                    C1891407ay c1891407ay = (C1891407ay) obj;
                    return this.LIZ == c1891407ay.LIZ && Intrinsics.LJFF(this.LIZIZ, c1891407ay.LIZIZ);
                }

                public final int hashCode() {
                    return (this.LIZ * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnPlayResume(loop=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", adView=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = i2;
                    this.LIZIZ = frameLayoutPR;
                }
            }, hostModel2, context);
        }
        InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
        int i3 = this.LLJJIJIIJIL;
        long jLIZIZ = RR().LIZIZ().LIZIZ();
        if (interfaceC1031540cwy3 != null && (hostModel = interfaceC1031540cwy3.getHostModel()) != null) {
            interfaceC1031540cwy3.trackEvent(new C1031310cwb("resume", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i3)), new Pair("duration", Long.valueOf(jLIZIZ))), 4), hostModel);
        }
        InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLJIJIL;
        if (interfaceC1031540cwy4 != null) {
            interfaceC1031540cwy4.onRewardAdResume(Integer.valueOf(this.LLJJIJIIJIL));
        }
    }

    @Override // X.InterfaceC1033010czL
    public final long getVideoDuration() {
        return RR().LIZIZ().LIZJ();
    }

    @Override // X.InterfaceC1033010czL
    public final long getVideoPosition() {
        return RR().LIZIZ().LIZIZ();
    }

    @Override // X.InterfaceC1032010cxj
    public final void l3() {
        Object hostModel;
        Object hostModel2;
        C989530brD.LIZ();
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        if (interfaceC1031540cwy != null) {
            interfaceC1031540cwy.videoPlayStateDidChange(EnumC1031610cx5.PAUSE, this.LLJJIJIIJIL);
        }
        C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null) {
            c1016050cXz.LIZJ(C997490c43.LIZ);
        }
        Context context = getContext();
        int i = this.LLJJIJIIJIL;
        final FrameLayout frameLayoutPR = PR();
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if (interfaceC1031540cwy2 != null && (hostModel2 = interfaceC1031540cwy2.getHostModel()) != null && frameLayoutPR != null && interfaceC1031540cwy2 != null) {
            final int i2 = i - 1;
            interfaceC1031540cwy2.trackOMSDK(new AbstractC1891907b3(i2, frameLayoutPR) { // from class: X.07au
                public final int LIZ;
                public final View LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1891007au)) {
                        return false;
                    }
                    C1891007au c1891007au = (C1891007au) obj;
                    return this.LIZ == c1891007au.LIZ && Intrinsics.LJFF(this.LIZIZ, c1891007au.LIZIZ);
                }

                public final int hashCode() {
                    return (this.LIZ * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnPlayPause(loop=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", adView=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = i2;
                    this.LIZIZ = frameLayoutPR;
                }
            }, hostModel2, context);
        }
        InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
        int i3 = this.LLJJIJIIJIL;
        long jLIZIZ = RR().LIZIZ().LIZIZ();
        if (interfaceC1031540cwy3 == null || (hostModel = interfaceC1031540cwy3.getHostModel()) == null) {
            return;
        }
        interfaceC1031540cwy3.trackEvent(new C1031310cwb("pause", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i3)), new Pair("duration", Long.valueOf(jLIZIZ))), 4), hostModel);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        IAnoleManager iAnoleManager;
        IAnoleManager iAnoleManager2;
        ViewTreeObserver viewTreeObserver;
        Object hostModel;
        Object hostModel2;
        super.onDestroy();
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        if (interfaceC1031540cwy != null) {
            interfaceC1031540cwy.videoPlayStateDidChange(EnumC1031610cx5.END, this.LLJJIJIIJIL);
        }
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        int i = this.LLJJIJIIJIL;
        long jLIZIZ = RR().LIZIZ().LIZIZ();
        if (interfaceC1031540cwy2 != null && (hostModel2 = interfaceC1031540cwy2.getHostModel()) != null) {
            interfaceC1031540cwy2.trackEvent(new C1031310cwb("break", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i)), new Pair("duration", Long.valueOf(jLIZIZ))), 4), hostModel2);
        }
        Context context = getContext();
        InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
        if (interfaceC1031540cwy3 != null && (hostModel = interfaceC1031540cwy3.getHostModel()) != null) {
            interfaceC1031540cwy3.trackOMSDK(C1892107b5.LIZ, hostModel, context);
        }
        RR().LIZ();
        InterfaceC1031720cxG interfaceC1031720cxGOR = OR();
        if (interfaceC1031720cxGOR != null) {
            interfaceC1031720cxGOR.LIZLLL();
        }
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.LLJLLL);
        }
        C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null && (iAnoleManager2 = c1016050cXz.LJIIIIZZ) != null) {
            iAnoleManager2.LIZ();
        }
        C1016050cXz c1016050cXz2 = this.LLJJ;
        if (c1016050cXz2 != null) {
            c1016050cXz2.LJI = false;
            c1016050cXz2.LJII = false;
            String[] strArr = {EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName(), EnumC696280RSw.REWARD_ANOLE_SLIDE_SLOT.getSlotName(), EnumC696280RSw.REWARD_ANOLE_TOP_FULL_SLOT.getSlotName()};
            int i2 = 0;
            do {
                String str = strArr[i2];
                IAnoleManager iAnoleManager3 = c1016050cXz2.LJIIIIZZ;
                if (iAnoleManager3 != null) {
                    iAnoleManager3.LJIIJJI(str);
                }
                i2++;
            } while (i2 < 3);
        }
        C1016050cXz c1016050cXz3 = this.LLJJ;
        if (c1016050cXz3 != null && (iAnoleManager = c1016050cXz3.LJIIIIZZ) != null) {
            iAnoleManager.clear();
        }
        C988850bq7.LIZJ(hashCode());
        this.LLJL = false;
        this.LLJIJIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        C1031550cwz c1031550cwz = (C1031550cwz) this.LLJILJILJ.getValue();
        if (c1031550cwz.LJIIJ) {
            IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
            if (iAdWebUtils != null) {
                iAdWebUtils.ev();
            }
            c1031550cwz.LJIIJ = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJLIIIJLLLLLLLZ = Boolean.valueOf(RR().LIZIZ().LIZLLL());
        RR().onPause();
        C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null) {
            c1016050cXz.LIZ(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause, isVideoPlayBeforeBackground=");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC1031540cwy interfaceC1031540cwy;
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, isVideoPlayBeforeBackground=");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        if (!Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, Boolean.FALSE)) {
            RR().onResume();
        }
        if (Intrinsics.LJFF(this.LLJLIL, Boolean.TRUE) && C0C64.LJIILLIIL().LJIIIZ(31744, "incentive_ad_fix_report_logic_enable", true, true) && (interfaceC1031540cwy = this.LLJIJIL) != null) {
            interfaceC1031540cwy.onRewardAdResume(null);
        }
        this.LLJLIL = null;
        C1016050cXz c1016050cXz = this.LLJJ;
        if (c1016050cXz != null) {
            c1016050cXz.LIZ(true);
        }
    }

    @Override // X.InterfaceC1033010czL
    public final void resume() {
        InterfaceC1031540cwy interfaceC1031540cwy;
        if (!RR().LIZIZ().LIZLLL()) {
            RR().LIZIZ().LJFF();
        }
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if (interfaceC1031540cwy2 == null || !interfaceC1031540cwy2.shouldDirectOpenLandingPage() || (interfaceC1031540cwy = this.LLJIJIL) == null) {
            return;
        }
        interfaceC1031540cwy.onRewardAdResume(null);
    }

    @Override // X.InterfaceC1032010cxj
    public final void LIZJ() {
        finish();
    }

    @Override // X.InterfaceC1033010czL
    public final InterfaceC1031910cxZ O1() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1033010czL
    public final ViewGroup getBottomInteractView() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1032010cxj
    public final void H2(String str) {
        Object hostModel;
        C989530brD.LIZ();
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        if (interfaceC1031540cwy != null && (hostModel = interfaceC1031540cwy.getHostModel()) != null) {
            interfaceC1031540cwy.trackEvent(new C1031310cwb("show_failed", null, 12), hostModel);
        }
        C1032910czB.LJI(this.LLJIJIL, false, str, 8);
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if (interfaceC1031540cwy2 != null) {
            interfaceC1031540cwy2.videoPlayFailed();
        }
    }

    @Override // X.InterfaceC1033010czL
    public final void LLZLLLL(boolean z) {
        InterfaceC1034470d1h interfaceC1034470d1h;
        if (Intrinsics.LJFF(this.LLJJL, EnumC1031620cx6.DEFAULT.getValue())) {
            C1031550cwz c1031550cwz = (C1031550cwz) this.LLJILJILJ.getValue();
            if (c1031550cwz.LJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("directOpenLandingPage onClose, landingPageFragment: ");
                sbLIZ.append(c1031550cwz.LJI);
                C2188811AlT.LIZIZ(sbLIZ);
                C989530brD.LIZ();
                C128Y c128y = c1031550cwz.LJI;
                if ((c128y instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) c128y) != null) {
                    interfaceC1034470d1h.LLLIL(null);
                }
            }
        }
        finish();
    }

    public final void MR(boolean z) {
        InterfaceC1032100cxs interfaceC1032100cxs;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        HashMap<String, Object> customAdExtraDataParams = null;
        if (interfaceC1031540cwy != null) {
            customAdExtraDataParams = interfaceC1031540cwy.getCustomAdExtraDataParams();
        }
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if ((interfaceC1031540cwy2 instanceof InterfaceC1032100cxs) && (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1031540cwy2) != null) {
            interfaceC1032100cxs.taskCompleted(z, customAdExtraDataParams, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(X.AbstractC1031660cxA r60) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.RewardAdContainer.NR(X.0cxA):void");
    }

    @Override // X.InterfaceC1031950cxd
    public final void We(AbstractC1031660cxA abstractC1031660cxA) throws JSONException {
        NR(abstractC1031660cxA);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Object hostModel;
        boolean z;
        InterfaceC1031540cwy interfaceC1031540cwy;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.tis) {
                Context context = getContext();
                InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
                if (interfaceC1031540cwy2 != null) {
                    hostModel = interfaceC1031540cwy2.getHostModel();
                } else {
                    hostModel = null;
                }
                if (context != null && hostModel != null) {
                    InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
                    if (interfaceC1031540cwy3 != null && interfaceC1031540cwy3.getCurrentRewardResume()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLJLIL = Boolean.valueOf(z);
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "incentive_ad_fix_report_logic_enable", true, true) && (interfaceC1031540cwy = this.LLJIJIL) != null) {
                        interfaceC1031540cwy.onRewardAdPause(null);
                    }
                    InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLJIJIL;
                    if (interfaceC1031540cwy4 != null) {
                        interfaceC1031540cwy4.report(context, hostModel);
                        return;
                    }
                    return;
                }
                return;
            }
            if (numValueOf.intValue() != R.id.tie) {
                return;
            }
            SR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1032890cz9.LIZ.getClass();
        InterfaceC1031540cwy interfaceC1031540cwyRemove = C1032890cz9.LIZIZ.remove(RewardAdActivity.class);
        this.LLJIJIL = interfaceC1031540cwyRemove;
        if (interfaceC1031540cwyRemove != null) {
            interfaceC1031540cwyRemove.registerStateChangeListener(this);
            interfaceC1031540cwyRemove.registerAdContainerDelegate(this);
            C1906580ziK.LIZJ().LIZ().LJJLJLI((AfS185S0100000_16) this.LLJLL.getValue());
        } else {
            C989530brD.LIZ();
            finish();
        }
    }

    @Override // X.InterfaceC1033010czL
    public final void onHandleTapFinished(String str) {
        this.LLJJIJI = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleFinished, refer: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
    }

    @Override // X.InterfaceC1033010czL
    public final void pause(String str) {
        InterfaceC1031540cwy interfaceC1031540cwy;
        if (!Intrinsics.LJFF(str, EnumC1031620cx6.VIDEO_FINISH_AUTO_EXPAND.getValue()) && (interfaceC1031540cwy = this.LLJIJIL) != null) {
            interfaceC1031540cwy.onRewardAdPause(null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pausePlay(), pauseReason: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        if (RR().LIZIZ().LIZLLL()) {
            RR().LIZIZ().LJ();
        }
    }

    @Override // X.InterfaceC1033010czL
    public final void addOverlayViewIfNeed(String str, boolean z) {
        C371360EhC c371360EhC;
        if (!Intrinsics.LJFF(this.LLJJL, EnumC1031620cx6.DIRECT.getValue()) && ((Boolean) C277740Aua.LIZ.getValue()).booleanValue()) {
            View view = getView();
            if (view != null) {
                c371360EhC = (C371360EhC) view.findViewById(R.id.tip);
            } else {
                c371360EhC = null;
            }
            this.LLJJJJLIIL = c371360EhC;
            if (c371360EhC != null) {
                if (!z || Intrinsics.LJFF(str, "cta_button")) {
                    c371360EhC.LLILZIL = 0.0f;
                    c371360EhC.LIZ();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addOverlayViewIfNeed, didShow: ");
                sbLIZ.append(z);
                sbLIZ.append(", componentType: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C989530brD.LIZ();
            }
            C371360EhC c371360EhC2 = this.LLJJJJLIIL;
            if (c371360EhC2 != null) {
                int visibility = c371360EhC2.getVisibility();
                c371360EhC2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c371360EhC2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        AbstractC1031660cxA state;
        super.onViewCreated(view, bundle);
        this.LLJILLL = new C1016230cYH(view);
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLJIJIL;
        View viewFindViewById = null;
        if (interfaceC1031540cwy != null) {
            View viewFindViewById2 = this.LLILLL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.tj4);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLL = (FrameLayout) viewFindViewById2;
            }
            interfaceC1031540cwy.viewDidLoad((ViewGroup) viewFindViewById2, this);
        }
        View viewFindViewById3 = this.LLILZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.tis);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZ = (TuxIconView) viewFindViewById3;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById3;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, this);
        }
        View viewFindViewById4 = this.LLILZIL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.tie);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZIL = (TuxIconView) viewFindViewById4;
        }
        TuxIconView tuxIconView2 = (TuxIconView) viewFindViewById4;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, this);
        }
        InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLJIJIL;
        if (interfaceC1031540cwy2 != null && !interfaceC1031540cwy2.shouldDirectOpenLandingPage()) {
            View viewFindViewById5 = this.LLILZLL;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.tio);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILZLL = (FrameLayout) viewFindViewById5;
            }
            FrameLayout frameLayout = (FrameLayout) viewFindViewById5;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            View viewFindViewById6 = this.LLIZ;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.tii);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLIZ = (C1390410mHn) viewFindViewById6;
            }
            C1390410mHn c1390410mHn = (C1390410mHn) viewFindViewById6;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
            }
        }
        this.LLJJJJJIL = (C03ES) view.findViewById(R.id.tin);
        this.LLJJJIL = (TextView) view.findViewById(R.id.tih);
        this.LLJJJJ = (ViewGroup) view.findViewById(R.id.tif);
        this.LLJJIJIL = (ViewGroup) view.findViewById(R.id.ti2);
        this.LLJJJ = (ViewGroup) view.findViewById(R.id.tib);
        InterfaceC1031710cxF interfaceC1031710cxFRR = RR();
        View view7 = this.LLILLJJLI;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById = view8.findViewById(R.id.tir);
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
            view7 = viewFindViewById;
        }
        interfaceC1031710cxFRR.LIZLLL((FrameLayout) view7, this.LLJIJIL);
        IVideoPlayTaskManager iVideoPlayTaskManager = (IVideoPlayTaskManager) this.LLJLLIL.getValue();
        if (iVideoPlayTaskManager == null) {
            C989530brD.LIZ();
            finish();
        } else {
            InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLJIJIL;
            AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(this, iVideoPlayTaskManager, 47);
            if (interfaceC1031540cwy3 == null) {
                finish();
            } else {
                awS382S0200000_16.invoke(interfaceC1031540cwy3);
            }
        }
        InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLJIJIL;
        if (interfaceC1031540cwy4 != null && (state = interfaceC1031540cwy4.getState()) != null) {
            NR(state);
        }
        VR();
    }

    @Override // X.InterfaceC1033010czL
    public final void showOrHideViewWithAnim(boolean z, AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel) {
        Animator animatorLIZIZ;
        Animator animatorLIZIZ2;
        List<String> list = anoleComponentBusinessAppearModel.businessComponents;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), EnumC1009140cMq.ANOLE_REWARD_BOTTOM_NATIVE_BASE_VIEW.getInteractName())) {
                    if (z) {
                        if (this.LLJILLL != null) {
                            ViewGroup viewGroup = this.LLJJIJIL;
                            AnoleComponentAnimationModel anoleComponentAnimationModel = anoleComponentBusinessAppearModel.animationModels;
                            if (viewGroup != null && anoleComponentAnimationModel != null && C1016660cYy.LIZLLL(anoleComponentAnimationModel)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("showBottomAdInfoWithAnim, animations:");
                                sbLIZ.append(anoleComponentAnimationModel);
                                C2188811AlT.LIZIZ(sbLIZ);
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (Intrinsics.LJFF(C1014570cVb.LIZIZ, C1014540cVY.LIZ(anoleComponentAnimationModel.type)) && (animatorLIZIZ = C1016230cYH.LIZIZ(viewGroup, anoleComponentAnimationModel)) != null) {
                                    animatorSet.playTogether(animatorLIZIZ);
                                    C786410Ut5.LJLZ(0, viewGroup);
                                    animatorSet.start();
                                }
                            }
                        }
                    } else if (this.LLJILLL != null) {
                        ViewGroup viewGroup2 = this.LLJJIJIL;
                        AnoleComponentAnimationModel anoleComponentAnimationModel2 = anoleComponentBusinessAppearModel.animationModels;
                        if (viewGroup2 != null && anoleComponentAnimationModel2 != null && C1016660cYy.LIZLLL(anoleComponentAnimationModel2)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getTotalAnimatorSet, hideBottomAdInfoWithAnim:");
                            sbLIZ2.append(anoleComponentAnimationModel2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            if (Intrinsics.LJFF(C1014570cVb.LIZIZ, C1014540cVY.LIZ(anoleComponentAnimationModel2.type)) && (animatorLIZIZ2 = C1016230cYH.LIZIZ(viewGroup2, anoleComponentAnimationModel2)) != null) {
                                animatorSet2.playTogether(animatorLIZIZ2);
                                ALAdapterS3S0100000_6 aLAdapterS3S0100000_6 = new ALAdapterS3S0100000_6(viewGroup2, 17);
                                C786410Ut5.LJLZ(0, viewGroup2);
                                animatorSet2.start();
                                animatorSet2.addListener(aLAdapterS3S0100000_6);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.em4, viewGroup, false);
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
