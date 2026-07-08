package com.ss.android.ugc.aweme.rich.reward.ui;

import X.AbstractC1016110cY5;
import X.AbstractC1032220cy4;
import X.AbstractC1892207b6;
import X.C01GW;
import X.C03GC;
import X.C098200Yq;
import X.C1016080cY2;
import X.C1016120cY6;
import X.C1016140cY8;
import X.C1016160cYA;
import X.C1016170cYB;
import X.C1016180cYC;
import X.C1016250cYJ;
import X.C1018530cbz;
import X.C1031480cws;
import X.C1031810cxP;
import X.C1032060cxo;
import X.C1032130cxv;
import X.C1032140cxw;
import X.C1032160cxy;
import X.C1032170cxz;
import X.C1032180cy0;
import X.C1032200cy2;
import X.C1032270cy9;
import X.C1032340cyG;
import X.C1032350cyH;
import X.C1032740cyu;
import X.C1032750cyv;
import X.C1032880cz8;
import X.C1032900czA;
import X.C1035140d2m;
import X.C11JF;
import X.C11NJ;
import X.C1390410mHn;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C189200o6;
import X.C1892407b8;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C20635115or;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C371340EhA;
import X.C427190Gp3;
import X.C452501pT;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C994003uc;
import X.EnumC1031610cx5;
import X.EnumC1031630cx7;
import X.EnumC696290RSx;
import X.InterfaceC1031440cwo;
import X.InterfaceC1032100cxs;
import X.InterfaceC1032120cxu;
import X.InterfaceC1032210cy3;
import X.InterfaceC1032240cy6;
import X.InterfaceC1032280cyA;
import X.InterfaceC1032290cyB;
import X.InterfaceC1032330cyF;
import X.InterfaceC1032380cyK;
import X.InterfaceC1032400cyM;
import X.InterfaceC1032420cyO;
import X.InterfaceC1032610cyh;
import X.InterfaceC1032630cyj;
import X.InterfaceC1032710cyr;
import X.InterfaceC1032870cz7;
import X.ViewOnClickListenerC1032040cxm;
import X.ViewTreeObserverOnWindowFocusChangeListenerC1032390cyL;
import Y.ACListenerS82S0300000_16;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.OneToNInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.RewardAdRetentionPopup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtRewardAdContainer extends Fragment implements InterfaceC1032400cyM, InterfaceC1032710cyr, View.OnClickListener, InterfaceC1032870cz7 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjclKid9HELIOSOiA7KD03ZjAlZwg+PBcpPi4hLAQoCiA9PCQlJyoh";
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public TextView LLIZ;
    public FrameLayout LLIZLLLIL;
    public C1390410mHn LLJ;
    public C1035140d2m LLJI;
    public FrameLayout LLJIJIL;
    public FrameLayout LLJILJIL;
    public FrameLayout LLJILJILJ;
    public FrameLayout LLJILLL;
    public InterfaceC1032120cxu LLJJ;
    public C1016250cYJ LLJJIJI;
    public InterfaceC1032210cy3 LLJJIJIIJIL;
    public C1032060cxo LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public long LLJJL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public C03GC LLJLIL;
    public C1032270cy9 LLJLILLLLZIIL;
    public C371340EhA LLJLL;
    public C1032140cxw LLJLLIL;
    public Boolean LLJZ;
    public boolean LLJZIJLIL;
    public Boolean LLL;
    public ViewOnClickListenerC1032040cxm LLLF;
    public C1032200cy2 LLLFF;
    public InterfaceC1032610cyh LLLFFI;
    public InterfaceC1032630cyj LLLFZ;
    public C1032170cxz LLLI;
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(257));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 566));
    public String LLJLLL = EnumC1031630cx7.DEFAULT.getValue();
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(256));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 565));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 567));
    public final ViewTreeObserverOnWindowFocusChangeListenerC1032390cyL LLLIIIL = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0cyL
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            InterfaceC1032380cyK interfaceC1032380cyKRR = this.LL.RR();
            if (interfaceC1032380cyKRR != null) {
                interfaceC1032380cyKRR.LIZ(z);
            }
        }
    };
    public final C1032340cyG LLLIIL = new InterfaceC1032420cyO() { // from class: X.0cyG
        @Override // X.InterfaceC1032420cyO
        public final C1032430cyP LJI() {
            return new C1032430cyP(this.LIZ);
        }

        @Override // X.InterfaceC1032420cyO
        public final C1018560cc2 getEventTracker() {
            return new C1018560cc2(this.LIZ);
        }

        @Override // X.InterfaceC1032420cyO
        public final C1032260cy8 getPlayer() {
            return new C1032260cy8(this.LIZ);
        }
    };

    @Override // X.InterfaceC1032400cyM
    public final void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // X.InterfaceC1032400cyM
    public final void LIZJ() {
        GmtRewardAdModel rewardAdModel;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        if (interfaceC1032120cxu == null || (rewardAdModel = interfaceC1032120cxu.getRewardAdModel()) == null || !(!C1032350cyH.LIZ(rewardAdModel))) {
            return;
        }
        finish();
    }

    @Override // X.InterfaceC1032400cyM
    public final void M() {
        GmtRewardAdModel rewardAdModel;
        InterfaceC1032120cxu interfaceC1032120cxu;
        Object hostModel;
        Object hostModel2;
        InterfaceC1032210cy3 interfaceC1032210cy3;
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
        if (interfaceC1032120cxu2 != null) {
            interfaceC1032120cxu2.videoPlayStateDidChange(EnumC1031610cx5.RESUME, this.LLJJJJLIIL);
        }
        C1032060cxo c1032060cxo = this.LLJJIJIL;
        if (c1032060cxo != null && (interfaceC1032210cy3 = c1032060cxo.LIZ) != null) {
            interfaceC1032210cy3.LJIIJ(C1016160cYA.LIZ);
        }
        Context context = getContext();
        int i = this.LLJJJJLIIL;
        final FrameLayout frameLayoutUR = UR();
        InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
        if (interfaceC1032120cxu3 != null && (hostModel2 = interfaceC1032120cxu3.getHostModel()) != null && frameLayoutUR != null && interfaceC1032120cxu3 != null) {
            final int i2 = i - 1;
            interfaceC1032120cxu3.trackOMSDK(new AbstractC1892207b6(i2, frameLayoutUR) { // from class: X.07az
                public final int LIZ;
                public final View LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1891507az)) {
                        return false;
                    }
                    C1891507az c1891507az = (C1891507az) obj;
                    return this.LIZ == c1891507az.LIZ && Intrinsics.LJFF(this.LIZIZ, c1891507az.LIZIZ);
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
                    this.LIZIZ = frameLayoutUR;
                }
            }, hostModel2, context);
        }
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = VR().LIZLLL();
        long currentPosition = interfaceC1032290cyBLIZLLL != null ? interfaceC1032290cyBLIZLLL.getCurrentPosition() : 0L;
        InterfaceC1032120cxu interfaceC1032120cxu4 = this.LLJJ;
        int i3 = this.LLJJJJLIIL;
        if (interfaceC1032120cxu4 != null && (hostModel = interfaceC1032120cxu4.getHostModel()) != null) {
            interfaceC1032120cxu4.trackEvent(new C1031480cws("resume", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i3)), new Pair("duration", Long.valueOf(currentPosition))), 4), hostModel);
        }
        InterfaceC1032120cxu interfaceC1032120cxu5 = this.LLJJ;
        if (interfaceC1032120cxu5 == null || (rewardAdModel = interfaceC1032120cxu5.getRewardAdModel()) == null || !(!C1032350cyH.LIZ(rewardAdModel)) || (interfaceC1032120cxu = this.LLJJ) == null) {
            return;
        }
        interfaceC1032120cxu.onRewardAdResume(Integer.valueOf(this.LLJJJJLIIL));
    }

    public final void MR() {
        C1032200cy2 c1032200cy2;
        InterfaceC1032630cyj interfaceC1032630cyj;
        C1016250cYJ c1016250cYJ = this.LLJJIJI;
        if (c1016250cYJ != null) {
            View viewFindViewById = this.LLIZ;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.tj0) : null;
                this.LLIZ = (TextView) viewFindViewById;
            }
            View view2 = viewFindViewById;
            boolean zLIZ = true;
            if ((view2 == null || view2.getVisibility() != 0) && ((c1032200cy2 = this.LLLFF) == null || c1032200cy2.LLILZIL)) {
                InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
                if (interfaceC1032120cxu != null && C1032130cxv.LIZIZ(interfaceC1032120cxu) && (interfaceC1032630cyj = this.LLLFZ) != null) {
                    zLIZ = interfaceC1032630cyj.LIZ();
                }
            } else {
                zLIZ = false;
            }
            c1016250cYJ.LIZLLL(zLIZ);
        }
    }

    @Override // X.InterfaceC1032400cyM
    public final void N() throws JSONException {
        Object hostModel;
        GmtRewardAdModel nextRewardAdModel;
        InterfaceC1032210cy3 interfaceC1032210cy3;
        GmtRewardAdModel rewardAdModel;
        GMTBaseModel gMTBaseModel;
        AdRewardData adRewardData;
        OneToNInfo oneToNInfo;
        TextView textView;
        InterfaceC1032120cxu interfaceC1032120cxu;
        View view;
        View viewFindViewById;
        GmtRewardAdModel rewardAdModel2;
        this.LLJJJJLIIL++;
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
        boolean z = (interfaceC1032120cxu2 == null || (rewardAdModel2 = interfaceC1032120cxu2.getRewardAdModel()) == null || !(C1032350cyH.LIZ(rewardAdModel2) ^ true)) ? false : true;
        C1016250cYJ c1016250cYJ = this.LLJJIJI;
        if (c1016250cYJ != null && (interfaceC1032120cxu = this.LLJJ) != null && interfaceC1032120cxu.getAdConfig().LJI && z && (view = c1016250cYJ.LIZ) != null && (viewFindViewById = view.findViewById(R.id.tik)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.I7(new ACListenerS82S0300000_16(c1016250cYJ, viewFindViewById, interfaceC1032120cxu, 13), viewFindViewById);
        }
        InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
        if (interfaceC1032120cxu3 != null && (rewardAdModel = interfaceC1032120cxu3.getRewardAdModel()) != null && (gMTBaseModel = rewardAdModel.awemeRawAd) != null && (adRewardData = gMTBaseModel.adRewardData) != null && (oneToNInfo = adRewardData.getOneToNInfo()) != null && Intrinsics.LJFF(oneToNInfo.getCanShowSkipButton(), Boolean.TRUE)) {
            C1016250cYJ c1016250cYJ2 = this.LLJJIJI;
            if (c1016250cYJ2 != null) {
                String skipButtonText = oneToNInfo.getSkipButtonText();
                View view2 = c1016250cYJ2.LIZ;
                if (view2 != null && (textView = (TextView) view2.findViewById(R.id.tj0)) != null) {
                    if (skipButtonText == null || skipButtonText.length() == 0) {
                        C786410Ut5.LLIL(textView, 8);
                        c1016250cYJ2.LIZLLL(true);
                    } else {
                        C786410Ut5.LLIL(textView, 0);
                        textView.setText(skipButtonText);
                        c1016250cYJ2.LIZLLL(false);
                    }
                }
            }
            MR();
        }
        InterfaceC1032120cxu interfaceC1032120cxu4 = this.LLJJ;
        if (interfaceC1032120cxu4 != null) {
            interfaceC1032120cxu4.videoPlayStateDidChange(EnumC1031610cx5.START, this.LLJJJJLIIL);
        }
        C1032160cxy.LIZIZ(this, true, false);
        C1032060cxo c1032060cxo = this.LLJJIJIL;
        if (c1032060cxo != null) {
            GmtRewardAdModel rewardAdModel3 = c1032060cxo.LIZIZ.getRewardAdModel();
            if ((rewardAdModel3 == null || !C1032350cyH.LIZ(rewardAdModel3)) && (interfaceC1032210cy3 = c1032060cxo.LIZ) != null) {
                interfaceC1032210cy3.LIZJ();
            }
            InterfaceC1032210cy3 interfaceC1032210cy32 = c1032060cxo.LIZ;
            if (interfaceC1032210cy32 != null) {
                interfaceC1032210cy32.LJIIJ(C1016170cYB.LIZ);
            }
        }
        InterfaceC1032120cxu interfaceC1032120cxu5 = this.LLJJ;
        if (interfaceC1032120cxu5 != null && (nextRewardAdModel = interfaceC1032120cxu5.getNextRewardAdModel()) != null) {
            VR().LJ(nextRewardAdModel);
        }
        if (z) {
            C1016250cYJ c1016250cYJ3 = this.LLJJIJI;
            if (c1016250cYJ3 != null) {
                c1016250cYJ3.LJ(this.LLJJ);
            }
            InterfaceC1032120cxu interfaceC1032120cxu6 = this.LLJJ;
            if (interfaceC1032120cxu6 != null) {
                interfaceC1032120cxu6.onRewardAdShow(Integer.valueOf(this.LLJJJJLIIL));
            }
            InterfaceC1032120cxu interfaceC1032120cxu7 = this.LLJJ;
            if (interfaceC1032120cxu7 != null && interfaceC1032120cxu7.markCurrentAdShowIfNeeded()) {
                InterfaceC1032120cxu interfaceC1032120cxu8 = this.LLJJ;
                long jLIZ = this.LLJJL + C1032160cxy.LIZ(this, 0L);
                if (interfaceC1032120cxu8 != null && (hostModel = interfaceC1032120cxu8.getHostModel()) != null) {
                    HashMap<String, Object> customAdExtraDataParams = interfaceC1032120cxu8.getCustomAdExtraDataParams();
                    customAdExtraDataParams.put("total_duration", Long.valueOf(jLIZ));
                    interfaceC1032120cxu8.trackEvent(new C1031480cws("show", customAdExtraDataParams, 4), hostModel);
                }
                C1018530cbz.LIZIZ(this.LLJJ);
                InterfaceC1032120cxu interfaceC1032120cxu9 = this.LLJJ;
                if (interfaceC1032120cxu9 != null) {
                    HashMap map = new HashMap();
                    map.put("tag", "reward_ad");
                    map.putAll(interfaceC1032120cxu9.getCustomAdExtraDataParams());
                    C1032900czA.LIZ(interfaceC1032120cxu9, "reward_video_show", C1032900czA.LIZJ(map));
                }
            }
            bS();
        }
    }

    public final void NR() {
        ArrayList arrayList = new ArrayList();
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tj1) : null;
            this.LLJIJIL = (FrameLayout) viewFindViewById;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        if (viewGroup != null) {
            arrayList.add(new C1016180cYC(EnumC696290RSx.REWARD_ANOLE_SLIDE_SLOT.getSlotName(), viewGroup));
        }
        View viewFindViewById2 = this.LLJILJIL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.ti0) : null;
            this.LLJILJIL = (FrameLayout) viewFindViewById2;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        if (viewGroup2 != null) {
            arrayList.add(new C1016180cYC(EnumC696290RSx.REWARD_ANOLE_TOP_FULL_SLOT.getSlotName(), viewGroup2));
        }
        View view3 = this.LLJILJILJ;
        if (view3 == null) {
            View view4 = getView();
            View viewFindViewById3 = view4 != null ? view4.findViewById(R.id.ti1) : null;
            this.LLJILJILJ = (FrameLayout) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        ViewGroup viewGroup3 = (ViewGroup) view3;
        if (viewGroup3 != null) {
            arrayList.add(new C1016180cYC(EnumC696290RSx.REWARD_ANOLE_TOP_FULL_ABOVE_ALL_SLOT.getSlotName(), viewGroup3));
        }
        InterfaceC1032210cy3 interfaceC1032210cy3 = this.LLJJIJIIJIL;
        if (interfaceC1032210cy3 != null) {
            interfaceC1032210cy3.LJIILIIL(arrayList);
        }
    }

    public final InterfaceC1032380cyK RR() {
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        if (interfaceC1032120cxu != null) {
            return interfaceC1032120cxu.getGpMiniCardManager();
        }
        return null;
    }

    public final InterfaceC1032240cy6 SR() {
        return (InterfaceC1032240cy6) this.LLJJIII.getValue();
    }

    public final FrameLayout UR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tij) : null;
            this.LL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final InterfaceC1032280cyA VR() {
        return (InterfaceC1032280cyA) this.LLJJI.getValue();
    }

    public final void WR() {
        GmtRewardAdModel rewardAdModel;
        GMTBaseModel gMTBaseModel;
        AdRewardData adRewardData;
        OneToNInfo oneToNInfo;
        TextView textView;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        if (interfaceC1032120cxu == null || (rewardAdModel = interfaceC1032120cxu.getRewardAdModel()) == null || (gMTBaseModel = rewardAdModel.awemeRawAd) == null || (adRewardData = gMTBaseModel.adRewardData) == null || (oneToNInfo = adRewardData.getOneToNInfo()) == null || !Intrinsics.LJFF(oneToNInfo.getCanShowSkipButton(), Boolean.TRUE)) {
            return;
        }
        C1016250cYJ c1016250cYJ = this.LLJJIJI;
        if (c1016250cYJ != null) {
            View view = c1016250cYJ.LIZ;
            if (view != null && (textView = (TextView) view.findViewById(R.id.tj0)) != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            c1016250cYJ.LIZLLL(true);
        }
        MR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102 A[PHI: r5
      0x0102: PHI (r5v4 android.view.View) = (r5v3 android.view.View), (r5v6 android.view.View) binds: [B:55:0x00ec, B:60:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.0cc0, X.0cyQ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer.aS():void");
    }

    public final void bS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tio) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        View view2 = this.LLJ;
        if (view2 == null) {
            View view3 = getView();
            View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.tii) : null;
            this.LLJ = (C1390410mHn) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C1390410mHn c1390410mHn = (C1390410mHn) view2;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
    }

    public final void clear() {
        RecyclerView recyclerView;
        ViewGroup viewGroup;
        ViewTreeObserver viewTreeObserver;
        Object hostModel;
        Object hostModel2;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        if (interfaceC1032120cxu != null) {
            interfaceC1032120cxu.videoPlayStateDidChange(EnumC1031610cx5.END, this.LLJJJJLIIL);
        }
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = VR().LIZLLL();
        long currentPosition = interfaceC1032290cyBLIZLLL != null ? interfaceC1032290cyBLIZLLL.getCurrentPosition() : 0L;
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
        int i = this.LLJJJJLIIL;
        long jLIZ = this.LLJJL + C1032160cxy.LIZ(this, null);
        if (interfaceC1032120cxu2 != null && (hostModel2 = interfaceC1032120cxu2.getHostModel()) != null) {
            interfaceC1032120cxu2.trackEvent(new C1031480cws("break", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i)), new Pair("duration", Long.valueOf(currentPosition)), new Pair("total_duration", Long.valueOf(jLIZ))), 4), hostModel2);
        }
        Context context = getContext();
        InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
        if (interfaceC1032120cxu3 != null && (hostModel = interfaceC1032120cxu3.getHostModel()) != null) {
            interfaceC1032120cxu3.trackOMSDK(C1892407b8.LIZ, hostModel, context);
        }
        VR().LIZ();
        C1032170cxz c1032170cxz = this.LLLI;
        if (c1032170cxz != null) {
            c1032170cxz.LIZJ();
        }
        this.LLLI = null;
        InterfaceC1032630cyj interfaceC1032630cyj = this.LLLFZ;
        if (interfaceC1032630cyj != null) {
            interfaceC1032630cyj.stop();
        }
        C1032200cy2 c1032200cy2 = this.LLLFF;
        if (c1032200cy2 != null) {
            c1032200cy2.stop();
        }
        this.LLLFF = null;
        InterfaceC1032380cyK interfaceC1032380cyKRR = RR();
        if (interfaceC1032380cyKRR != null) {
            interfaceC1032380cyKRR.LIZLLL();
        }
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.LLLIIIL);
        }
        InterfaceC1032210cy3 interfaceC1032210cy3 = this.LLJJIJIIJIL;
        if (interfaceC1032210cy3 != null) {
            interfaceC1032210cy3.hide();
        }
        InterfaceC1032210cy3 interfaceC1032210cy32 = this.LLJJIJIIJIL;
        if (interfaceC1032210cy32 != null) {
            interfaceC1032210cy32.LIZ();
        }
        InterfaceC1032210cy3 interfaceC1032210cy33 = this.LLJJIJIIJIL;
        if (interfaceC1032210cy33 != null) {
            interfaceC1032210cy33.LJI();
        }
        InterfaceC1032240cy6 interfaceC1032240cy6SR = SR();
        if (interfaceC1032240cy6SR != null) {
            interfaceC1032240cy6SR.LIZIZ(hashCode());
        }
        this.LLJZIJLIL = false;
        this.LLJJ = null;
        ViewOnClickListenerC1032040cxm viewOnClickListenerC1032040cxm = this.LLLF;
        if (viewOnClickListenerC1032040cxm != null && viewOnClickListenerC1032040cxm.isShowing()) {
            viewOnClickListenerC1032040cxm.dismiss();
        }
        this.LLLF = null;
        ((C11NJ) this.LLLII.getValue()).LJ();
        C1032140cxw c1032140cxw = this.LLJLLIL;
        if (c1032140cxw != null) {
            c1032140cxw.LJI = false;
            c1032140cxw.LJII.removeCallbacksAndMessages(null);
            C1032180cy0 c1032180cy0 = c1032140cxw.LJIILLIIL;
            if (c1032180cy0 != null && (recyclerView = c1032180cy0.LIZ) != null) {
                recyclerView.removeOnScrollListener(c1032180cy0.LJIIJ);
                C20635115or c20635115or = c1032180cy0.LIZJ;
                if (c20635115or != null) {
                    C1032180cy0.LIZ(c20635115or, null);
                }
                c1032180cy0.LIZJ = null;
                recyclerView.setAdapter(null);
                c1032180cy0.LIZIZ = null;
                ViewParent parent = recyclerView.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(recyclerView, viewGroup);
                }
                c1032180cy0.LIZ = null;
                c1032180cy0.LIZLLL.clear();
                c1032180cy0.LJ.removeCallbacksAndMessages(null);
            }
            c1032140cxw.LJIIJ = false;
            C427190Gp3 c427190Gp3 = c1032140cxw.LJIILIIL;
            if (c427190Gp3 != null) {
                c427190Gp3.LIZ();
            }
            c1032140cxw.LIZJ = null;
            c1032140cxw.LIZLLL = null;
            c1032140cxw.LJ = null;
            c1032140cxw.LJIILLIIL = null;
            c1032140cxw.LJIIIZ = null;
        }
    }

    public final void finish() {
        C371340EhA c371340EhA = this.LLJLL;
        if (c371340EhA != null) {
            int visibility = c371340EhA.getVisibility();
            c371340EhA.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c371340EhA);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC1032870cz7
    public final Map<String, Object> getCarouselAdExtraParams() {
        C1032140cxw c1032140cxw = this.LLJLLIL;
        return c1032140cxw != null ? c1032140cxw.LIZIZ() : C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1032400cyM
    public final void l3() {
        Object hostModel;
        Object hostModel2;
        InterfaceC1032210cy3 interfaceC1032210cy3;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        if (interfaceC1032120cxu != null) {
            interfaceC1032120cxu.videoPlayStateDidChange(EnumC1031610cx5.PAUSE, this.LLJJJJLIIL);
        }
        C1032060cxo c1032060cxo = this.LLJJIJIL;
        if (c1032060cxo != null && (interfaceC1032210cy3 = c1032060cxo.LIZ) != null) {
            interfaceC1032210cy3.LJIIJ(C1016140cY8.LIZ);
        }
        Context context = getContext();
        int i = this.LLJJJJLIIL;
        final FrameLayout frameLayoutUR = UR();
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
        if (interfaceC1032120cxu2 != null && (hostModel2 = interfaceC1032120cxu2.getHostModel()) != null && frameLayoutUR != null && interfaceC1032120cxu2 != null) {
            final int i2 = i - 1;
            interfaceC1032120cxu2.trackOMSDK(new AbstractC1892207b6(i2, frameLayoutUR) { // from class: X.07av
                public final int LIZ;
                public final View LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1891107av)) {
                        return false;
                    }
                    C1891107av c1891107av = (C1891107av) obj;
                    return this.LIZ == c1891107av.LIZ && Intrinsics.LJFF(this.LIZIZ, c1891107av.LIZIZ);
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
                    this.LIZIZ = frameLayoutUR;
                }
            }, hostModel2, context);
        }
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = VR().LIZLLL();
        long currentPosition = interfaceC1032290cyBLIZLLL != null ? interfaceC1032290cyBLIZLLL.getCurrentPosition() : 0L;
        InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
        int i3 = this.LLJJJJLIIL;
        if (interfaceC1032120cxu3 == null || (hostModel = interfaceC1032120cxu3.getHostModel()) == null) {
            return;
        }
        interfaceC1032120cxu3.trackEvent(new C1031480cws("pause", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i3)), new Pair("duration", Long.valueOf(currentPosition))), 4), hostModel);
    }

    public final void ZR() {
        Pair pair;
        InterfaceC1032100cxs interfaceC1032100cxs;
        GmtRewardAdModel rewardAdModel;
        GMTBaseModel gMTBaseModel;
        AdRewardData adRewardData;
        RewardAdRetentionPopup retentionPopup;
        String singularDesc;
        Object hostModel;
        Window window;
        InterfaceC1032100cxs interfaceC1032100cxs2;
        InterfaceC1032630cyj interfaceC1032630cyj;
        C1031810cxP adConfig;
        Object hostModel2;
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = VR().LIZLLL();
        long currentPosition = interfaceC1032290cyBLIZLLL != null ? interfaceC1032290cyBLIZLLL.getCurrentPosition() : 0L;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        int i = this.LLJJJJLIIL;
        long jLIZ = this.LLJJL + C1032160cxy.LIZ(this, null);
        if (interfaceC1032120cxu != null && (hostModel2 = interfaceC1032120cxu.getHostModel()) != null) {
            interfaceC1032120cxu.trackEvent(new C1031480cws("draw_ad", "close", "button", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i)), new Pair("duration", Long.valueOf(currentPosition)), new Pair("total_duration", Long.valueOf(jLIZ)))), hostModel2);
        }
        Context context = getContext();
        if (context != null) {
            InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
            if (interfaceC1032120cxu2 == null || (adConfig = interfaceC1032120cxu2.getAdConfig()) == null || !adConfig.LIZJ) {
                C1032200cy2 c1032200cy2 = this.LLLFF;
                if (c1032200cy2 != null && !c1032200cy2.LLILZIL) {
                    return;
                }
                InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
                if (interfaceC1032120cxu3 != null && C1032130cxv.LIZIZ(interfaceC1032120cxu3) && (interfaceC1032630cyj = this.LLLFZ) != null && !interfaceC1032630cyj.LIZ()) {
                    return;
                }
                if (this.LLJJJIL) {
                    Boolean bool = Boolean.FALSE;
                    pair = new Pair(bool, bool);
                } else {
                    InterfaceC1032120cxu interfaceC1032120cxu4 = this.LLJJ;
                    if (interfaceC1032120cxu4 == null || !C1032130cxv.LIZIZ(interfaceC1032120cxu4)) {
                        InterfaceC1032120cxu interfaceC1032120cxu5 = this.LLJJ;
                        if (!(interfaceC1032120cxu5 instanceof InterfaceC1032100cxs) || (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1032120cxu5) == null) {
                            Boolean bool2 = Boolean.TRUE;
                            pair = new Pair(bool2, bool2);
                        } else {
                            InterfaceC1032610cyh interfaceC1032610cyh = this.LLLFFI;
                            if (interfaceC1032610cyh == null) {
                                Boolean bool3 = Boolean.TRUE;
                                pair = new Pair(bool3, bool3);
                            } else if (interfaceC1032610cyh.LIZ()) {
                                pair = new Pair(Boolean.TRUE, Boolean.FALSE);
                            } else {
                                int iLIZIZ = interfaceC1032610cyh.LIZIZ();
                                InterfaceC1032120cxu interfaceC1032120cxu6 = this.LLJJ;
                                if (interfaceC1032120cxu6 == null || (rewardAdModel = interfaceC1032120cxu6.getRewardAdModel()) == null || (gMTBaseModel = rewardAdModel.awemeRawAd) == null || (adRewardData = gMTBaseModel.adRewardData) == null || (retentionPopup = adRewardData.getRetentionPopup()) == null) {
                                    Boolean bool4 = Boolean.TRUE;
                                    pair = new Pair(bool4, bool4);
                                } else {
                                    this.LLJJJIL = true;
                                    ViewOnClickListenerC1032040cxm viewOnClickListenerC1032040cxm = new ViewOnClickListenerC1032040cxm(context);
                                    viewOnClickListenerC1032040cxm.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0cyX
                                        @Override // android.widget.PopupWindow.OnDismissListener
                                        public final void onDismiss() {
                                            this.LL.LLJJJIL = false;
                                        }
                                    });
                                    C19EG activity = getActivity();
                                    View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                                    viewOnClickListenerC1032040cxm.LLILZIL = interfaceC1032100cxs;
                                    viewOnClickListenerC1032040cxm.LLILZLL = interfaceC1032100cxs instanceof InterfaceC1032120cxu ? (InterfaceC1032120cxu) interfaceC1032100cxs : null;
                                    interfaceC1032100cxs.pause();
                                    InterfaceC1032120cxu interfaceC1032120cxu7 = viewOnClickListenerC1032040cxm.LLILZLL;
                                    if (interfaceC1032120cxu7 != null) {
                                        interfaceC1032120cxu7.onRewardAdPause(null);
                                    }
                                    TextView textView = viewOnClickListenerC1032040cxm.LL;
                                    if (textView != null) {
                                        textView.setText(retentionPopup.getTitle());
                                    }
                                    if (iLIZIZ <= 1 ? (singularDesc = retentionPopup.getSingularDesc()) == null : (singularDesc = retentionPopup.getPluralDesc()) == null) {
                                        singularDesc = "";
                                    }
                                    TextView textView2 = viewOnClickListenerC1032040cxm.LLILLJJLI;
                                    if (textView2 != null) {
                                        textView2.setText(u.LJJIFFI(singularDesc, "{num}", String.valueOf(iLIZIZ), false));
                                    }
                                    TextView textView3 = viewOnClickListenerC1032040cxm.LLILLL;
                                    if (textView3 != null) {
                                        textView3.setText(retentionPopup.getConfirmButtonText());
                                    }
                                    TextView textView4 = viewOnClickListenerC1032040cxm.LLILZ;
                                    if (textView4 != null) {
                                        textView4.setText(retentionPopup.getBackButtonText());
                                    }
                                    viewOnClickListenerC1032040cxm.showAtLocation(decorView, 17, 0, 0);
                                    PopupMonitorServiceImpl.LIZ.getClass();
                                    PopupMonitorServiceImpl.LJJJI(viewOnClickListenerC1032040cxm);
                                    C787990Uvd.LIZ.getClass();
                                    C994003uc.LIZ();
                                    InterfaceC1032120cxu interfaceC1032120cxu8 = viewOnClickListenerC1032040cxm.LLILZLL;
                                    if (interfaceC1032120cxu8 != null && (hostModel = interfaceC1032120cxu8.getHostModel()) != null) {
                                        interfaceC1032120cxu8.trackEvent(new C1031480cws("draw_ad", "othershow", "popup_window", interfaceC1032120cxu8.getCustomAdExtraDataParams()), hostModel);
                                    }
                                    this.LLLF = viewOnClickListenerC1032040cxm;
                                    Boolean bool5 = Boolean.FALSE;
                                    pair = new Pair(bool5, bool5);
                                }
                            }
                        }
                    } else {
                        pair = new Pair(Boolean.TRUE, Boolean.FALSE);
                    }
                }
                boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                if (((Boolean) pair.getSecond()).booleanValue()) {
                    OR(false);
                }
                if (zBooleanValue) {
                    if (this.LLJJJJJIL) {
                        this.LLJJJJJIL = false;
                        InterfaceC1032210cy3 interfaceC1032210cy3 = this.LLJJIJIIJIL;
                        if (interfaceC1032210cy3 != null) {
                            interfaceC1032210cy3.LJIILJJIL();
                        }
                        InterfaceC1032210cy3 interfaceC1032210cy32 = this.LLJJIJIIJIL;
                        if (interfaceC1032210cy32 != null) {
                            interfaceC1032210cy32.LJIIJJI();
                            return;
                        }
                        return;
                    }
                    InterfaceC1032120cxu interfaceC1032120cxu9 = this.LLJJ;
                    if ((interfaceC1032120cxu9 instanceof InterfaceC1032100cxs) && (interfaceC1032100cxs2 = (InterfaceC1032100cxs) interfaceC1032120cxu9) != null) {
                        interfaceC1032100cxs2.exit(true);
                    }
                }
            } else {
                InterfaceC1032120cxu interfaceC1032120cxu10 = this.LLJJ;
                if (interfaceC1032120cxu10 != null) {
                    interfaceC1032120cxu10.willExit(context);
                }
            }
            InterfaceC1032210cy3 interfaceC1032210cy33 = this.LLJJIJIIJIL;
            if (interfaceC1032210cy33 != null) {
                interfaceC1032210cy33.LJIIJJI();
            }
        }
    }

    @Override // X.InterfaceC1032870cz7
    public final long getVideoDuration() {
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = VR().LIZLLL();
        if (interfaceC1032290cyBLIZLLL != null) {
            return interfaceC1032290cyBLIZLLL.getDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC1032870cz7
    public final long getVideoPosition() {
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = VR().LIZLLL();
        if (interfaceC1032290cyBLIZLLL != null) {
            return interfaceC1032290cyBLIZLLL.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0cxC] */
    @Override // X.InterfaceC1032400cyM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0() {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer.h0():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        clear();
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
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        InterfaceC1032240cy6 interfaceC1032240cy6SR = SR();
        if (interfaceC1032240cy6SR != null) {
            interfaceC1032240cy6SR.onDestroyView();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            r3 = this;
            super.onPause()
            X.0cy2 r1 = r3.LLLFF
            if (r1 == 0) goto Le
            boolean r0 = r1.LLILZIL
            if (r0 != 0) goto Le
            r1.stop()
        Le:
            X.0cyA r0 = r3.VR()
            X.0cyB r0 = r0.LIZLLL()
            r2 = 0
            if (r0 == 0) goto L46
            boolean r1 = r0.isPlaying()
            r0 = 1
            if (r1 != r0) goto L46
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.LLJZ = r0
            X.0cyA r0 = r3.VR()
            r0.onPause()
            X.0cy3 r0 = r3.LLJJIJIIJIL
            if (r0 == 0) goto L34
            r0.LJIIIZ(r2)
        L34:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onPause, isVideoPlayBeforeBackground="
            r1.append(r0)
            java.lang.Boolean r0 = r3.LLJZ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return
        L46:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer.onPause():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC1032120cxu interfaceC1032120cxu;
        super.onResume();
        C1032200cy2 c1032200cy2 = this.LLLFF;
        if (c1032200cy2 != null && !c1032200cy2.LLILZIL) {
            c1032200cy2.start();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, isVideoPlayBeforeBackground=");
        sbLIZ.append(this.LLJZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(this.LLJZ, Boolean.FALSE)) {
            VR().onResume();
        }
        if (Intrinsics.LJFF(this.LLL, Boolean.TRUE) && C1032750cyv.LIZ && (interfaceC1032120cxu = this.LLJJ) != null) {
            interfaceC1032120cxu.onRewardAdResume(null);
        }
        this.LLL = null;
        InterfaceC1032210cy3 interfaceC1032210cy3 = this.LLJJIJIIJIL;
        if (interfaceC1032210cy3 != null) {
            interfaceC1032210cy3.LJIIIZ(true);
        }
    }

    @Override // X.InterfaceC1032870cz7
    public final void resume() {
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL;
        InterfaceC1032120cxu interfaceC1032120cxu;
        GmtRewardAdModel rewardAdModel;
        InterfaceC1032120cxu interfaceC1032120cxu2;
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL2 = VR().LIZLLL();
        if ((interfaceC1032290cyBLIZLLL2 == null || !interfaceC1032290cyBLIZLLL2.isPlaying()) && (interfaceC1032290cyBLIZLLL = VR().LIZLLL()) != null) {
            interfaceC1032290cyBLIZLLL.LJIILLIIL();
        }
        InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
        if (((interfaceC1032120cxu3 == null || !interfaceC1032120cxu3.shouldDirectOpenLandingPage()) && ((interfaceC1032120cxu = this.LLJJ) == null || (rewardAdModel = interfaceC1032120cxu.getRewardAdModel()) == null || !C1032350cyH.LIZ(rewardAdModel))) || (interfaceC1032120cxu2 = this.LLJJ) == null) {
            return;
        }
        interfaceC1032120cxu2.onRewardAdResume(null);
    }

    @Override // X.InterfaceC1032870cz7
    public final InterfaceC1032610cyh O1() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1032870cz7
    public final InterfaceC1032630cyj Xf() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1032870cz7
    public final ViewGroup getBottomInteractView() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1032400cyM
    public final void H2(String str) {
        GmtRewardAdModel rewardAdModel;
        Object hostModel;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        if (interfaceC1032120cxu != null && (rewardAdModel = interfaceC1032120cxu.getRewardAdModel()) != null && (!C1032350cyH.LIZ(rewardAdModel))) {
            InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
            if (interfaceC1032120cxu2 != null && (hostModel = interfaceC1032120cxu2.getHostModel()) != null) {
                interfaceC1032120cxu2.trackEvent(new C1031480cws("show_failed", null, 12), hostModel);
            }
            C1032900czA.LJIIJ(this.LLJJ, false, str, 8);
            InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
            if (interfaceC1032120cxu3 != null) {
                interfaceC1032120cxu3.videoPlayFailed();
            }
        }
    }

    @Override // X.InterfaceC1032870cz7
    public final void LLZLLLL(boolean z) {
        InterfaceC1032240cy6 interfaceC1032240cy6SR;
        if (Intrinsics.LJFF(this.LLJLLL, EnumC1031630cx7.DEFAULT.getValue()) && (interfaceC1032240cy6SR = SR()) != null) {
            interfaceC1032240cy6SR.LIZJ();
        }
        finish();
    }

    public final void OR(boolean z) {
        InterfaceC1032100cxs interfaceC1032100cxs;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
        HashMap<String, Object> customAdExtraDataParams = null;
        if (interfaceC1032120cxu != null) {
            customAdExtraDataParams = interfaceC1032120cxu.getCustomAdExtraDataParams();
        }
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
        if ((interfaceC1032120cxu2 instanceof InterfaceC1032100cxs) && (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1032120cxu2) != null) {
            interfaceC1032100cxs.taskCompleted(z, customAdExtraDataParams, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ad  */
    /* JADX WARN: Type inference failed for: r0v108, types: [X.0cxD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(X.AbstractC1032220cy4 r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer.PR(X.0cy4):void");
    }

    @Override // X.InterfaceC1032870cz7
    public final View getInteractContainerView(String str) {
        if (Intrinsics.LJFF(str, "tt_reward_bottom_native_base_view")) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        return null;
    }

    @Override // X.InterfaceC1032870cz7
    public final boolean j8(AbstractC1016110cY5 abstractC1016110cY5) {
        int visibility;
        int visibility2;
        if (abstractC1016110cY5 instanceof C1016080cY2) {
            boolean enable = ((C1016080cY2) abstractC1016110cY5).getEnable();
            ViewGroup viewGroup = this.LLJL;
            View viewFindViewById = this.LLJIJIL;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.tj1);
                } else {
                    viewFindViewById = null;
                }
                this.LLJIJIL = (FrameLayout) viewFindViewById;
            }
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            if (enable) {
                if (this.LLJLILLLLZIIL == null) {
                    if (viewGroup != null) {
                        visibility = viewGroup.getVisibility();
                    } else {
                        visibility = 8;
                    }
                    if (frameLayout != null) {
                        visibility2 = frameLayout.getVisibility();
                    } else {
                        visibility2 = 8;
                    }
                    this.LLJLILLLLZIIL = new C1032270cy9(visibility, visibility2);
                }
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                    return true;
                }
                return true;
            }
            C1032270cy9 c1032270cy9 = this.LLJLILLLLZIIL;
            if (c1032270cy9 == null) {
                return true;
            }
            if (viewGroup != null) {
                C786410Ut5.LJLZ(c1032270cy9.LIZ, viewGroup);
            }
            if (frameLayout != null) {
                C786410Ut5.LJZ(c1032270cy9.LIZIZ, frameLayout);
            }
            this.LLJLILLLLZIIL = null;
            return true;
        }
        if (abstractC1016110cY5 instanceof C1016120cY6) {
            InterfaceC1032210cy3 interfaceC1032210cy3 = this.LLJJIJIIJIL;
            if (interfaceC1032210cy3 != null) {
                ((C1016120cY6) abstractC1016110cY5).isSuccess();
                interfaceC1032210cy3.LJIIIIZZ();
            }
            if (this.LLJJIJIIJIL != null) {
                return true;
            }
            return false;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1032710cyr
    public final void oi(AbstractC1032220cy4 abstractC1032220cy4) throws JSONException {
        PR(abstractC1032220cy4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            r4 = 0
            if (r8 == 0) goto L49
            int r0 = r8.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L49
            int r1 = r2.intValue()
            r0 = 2131388694(0x7f0a6916, float:1.839791E38)
            if (r1 != r0) goto L4e
            android.content.Context r3 = r7.getContext()
            X.0cxu r0 = r7.LLJJ
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r0.getHostModel()
        L22:
            if (r3 == 0) goto L49
            if (r2 == 0) goto L49
            X.0cxu r0 = r7.LLJJ
            if (r0 == 0) goto L4a
            boolean r1 = r0.getCurrentRewardResume()
            r0 = 1
            if (r1 != r0) goto L4a
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.LLL = r0
            boolean r0 = X.C1032750cyv.LIZ
            if (r0 == 0) goto L42
            X.0cxu r0 = r7.LLJJ
            if (r0 == 0) goto L42
            r0.onRewardAdPause(r4)
        L42:
            X.0cxu r0 = r7.LLJJ
            if (r0 == 0) goto L49
            r0.report(r3, r2)
        L49:
            return
        L4a:
            r0 = 0
            goto L31
        L4c:
            r2 = r4
            goto L22
        L4e:
            int r1 = r2.intValue()
            r0 = 2131388680(0x7f0a6908, float:1.8397882E38)
            if (r1 != r0) goto L5b
            r7.ZR()
            return
        L5b:
            int r1 = r2.intValue()
            r0 = 2131388702(0x7f0a691e, float:1.8397926E38)
            if (r1 != r0) goto L49
            X.0cy3 r0 = r7.LLJJIJIIJIL
            if (r0 == 0) goto L6b
            r0.LJ()
        L6b:
            r7.WR()
            X.0cxu r6 = r7.LLJJ
            if (r6 == 0) goto L49
            java.lang.Object r5 = r6.getHostModel()
            if (r5 == 0) goto L49
            X.0cws r4 = new X.0cws
            java.util.HashMap r3 = r6.getCustomAdExtraDataParams()
            java.lang.String r2 = "skip"
            java.lang.String r1 = "button"
            java.lang.String r0 = "draw_ad"
            r4.<init>(r0, r2, r1, r3)
            r6.trackEvent(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer.onClick(android.view.View):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC1032330cyF hostUtils;
        C11JF c11jfLIZIZ;
        super.onCreate(bundle);
        InterfaceC1032120cxu interfaceC1032120cxuRemove = C1032880cz8.LIZ.remove(RewardAdActivity.class);
        this.LLJJ = interfaceC1032120cxuRemove;
        if (interfaceC1032120cxuRemove != null) {
            interfaceC1032120cxuRemove.registerStateChangeListener(this);
            interfaceC1032120cxuRemove.registerAdContainerDelegate(this);
            InterfaceC1032120cxu interfaceC1032120cxu = this.LLJJ;
            if (interfaceC1032120cxu != null && (hostUtils = interfaceC1032120cxu.getHostUtils()) != null && (c11jfLIZIZ = hostUtils.LIZIZ((InterfaceC1031440cwo) this.LLLIIII.getValue())) != null) {
                ((C11NJ) this.LLLII.getValue()).LIZ(c11jfLIZIZ);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1032900czA.LIZJ = jCurrentTimeMillis;
            C1032900czA.LIZLLL = jCurrentTimeMillis;
            return;
        }
        finish();
    }

    @Override // X.InterfaceC1032870cz7
    public final void onHandleTapFinished(String str) {
        this.LLJJJJ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleFinished, refer: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1032870cz7
    public final void pause(String str) {
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL;
        InterfaceC1032120cxu interfaceC1032120cxu;
        if (!Intrinsics.LJFF(str, EnumC1031630cx7.VIDEO_FINISH_AUTO_EXPAND.getValue()) && (interfaceC1032120cxu = this.LLJJ) != null) {
            interfaceC1032120cxu.onRewardAdPause(null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pausePlay(), pauseReason: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL2 = VR().LIZLLL();
        if (interfaceC1032290cyBLIZLLL2 != null && interfaceC1032290cyBLIZLLL2.isPlaying() && (interfaceC1032290cyBLIZLLL = VR().LIZLLL()) != null) {
            interfaceC1032290cyBLIZLLL.pausePlay();
        }
    }

    @Override // X.InterfaceC1032870cz7
    public final void addOverlayViewIfNeed(String str, boolean z) {
        C371340EhA c371340EhA;
        if (!Intrinsics.LJFF(this.LLJLLL, EnumC1031630cx7.DIRECT.getValue()) && C1032740cyu.LIZ) {
            View view = getView();
            if (view != null) {
                c371340EhA = (C371340EhA) view.findViewById(R.id.tip);
            } else {
                c371340EhA = null;
            }
            this.LLJLL = c371340EhA;
            if (c371340EhA != null) {
                if (!z || Intrinsics.LJFF(str, "cta_button")) {
                    c371340EhA.LLILZIL = 0.0f;
                    c371340EhA.LIZ();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addOverlayViewIfNeed, didShow: ");
                sbLIZ.append(z);
                sbLIZ.append(", componentType: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C371340EhA c371340EhA2 = this.LLJLL;
            if (c371340EhA2 != null) {
                int visibility = c371340EhA2.getVisibility();
                c371340EhA2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c371340EhA2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        AbstractC1032220cy4 state;
        InterfaceC1032120cxu interfaceC1032120cxu;
        Double closeButtonDelaySeconds;
        super.onViewCreated(view, bundle);
        this.LLJJIJI = new C1016250cYJ(view, new AwS560S0100000_16(this, 792));
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLJJ;
        View viewFindViewById = null;
        if (interfaceC1032120cxu2 != null) {
            View viewFindViewById2 = this.LLILZ;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.tj4);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILZ = (FrameLayout) viewFindViewById2;
            }
            interfaceC1032120cxu2.viewDidLoad((ViewGroup) viewFindViewById2, this);
        }
        View viewFindViewById3 = this.LLILZIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.tis);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZIL = (TuxIconView) viewFindViewById3;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById3;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, this);
        }
        View viewFindViewById4 = this.LLILZLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.tie);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZLL = (TuxIconView) viewFindViewById4;
        }
        TuxIconView tuxIconView2 = (TuxIconView) viewFindViewById4;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, this);
        }
        View viewFindViewById5 = this.LLIZ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.tj0);
            } else {
                viewFindViewById5 = null;
            }
            this.LLIZ = (TextView) viewFindViewById5;
        }
        TextView textView = (TextView) viewFindViewById5;
        if (textView != null) {
            C786410Ut5.T7(textView, this);
        }
        InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLJJ;
        if (interfaceC1032120cxu3 != null && !interfaceC1032120cxu3.shouldDirectOpenLandingPage()) {
            View viewFindViewById6 = this.LLIZLLLIL;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.tio);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLIZLLLIL = (FrameLayout) viewFindViewById6;
            }
            FrameLayout frameLayout = (FrameLayout) viewFindViewById6;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            View viewFindViewById7 = this.LLJ;
            if (viewFindViewById7 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById7 = view7.findViewById(R.id.tii);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLJ = (C1390410mHn) viewFindViewById7;
            }
            C1390410mHn c1390410mHn = (C1390410mHn) viewFindViewById7;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
            }
        }
        this.LLJLIL = (C03GC) view.findViewById(R.id.tin);
        this.LLJJLIIIJLLLLLLLZ = (ViewGroup) view.findViewById(R.id.ti2);
        this.LLJL = (ViewGroup) view.findViewById(R.id.tib);
        InterfaceC1032280cyA interfaceC1032280cyAVR = VR();
        View view8 = this.LLILLJJLI;
        if (view8 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById = view9.findViewById(R.id.tir);
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
            view8 = viewFindViewById;
        }
        interfaceC1032280cyAVR.LIZIZ((FrameLayout) view8, this.LLJJ);
        InterfaceC1032120cxu interfaceC1032120cxu4 = this.LLJJ;
        AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 299);
        if (interfaceC1032120cxu4 == null) {
            finish();
        } else {
            awS595S0100000_16.invoke(interfaceC1032120cxu4);
        }
        if (C1032130cxv.LIZ(this) && this.LLLFF == null && (interfaceC1032120cxu = this.LLJJ) != null && (closeButtonDelaySeconds = interfaceC1032120cxu.getCloseButtonDelaySeconds()) != null) {
            this.LLLFF = new C1032200cy2(closeButtonDelaySeconds.doubleValue(), new AwS560S0100000_16(this, 791));
            MR();
            C1032200cy2 c1032200cy2 = this.LLLFF;
            if (c1032200cy2 != null) {
                c1032200cy2.start();
            }
        }
        InterfaceC1032120cxu interfaceC1032120cxu5 = this.LLJJ;
        if (interfaceC1032120cxu5 != null && (state = interfaceC1032120cxu5.getState()) != null) {
            PR(state);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ccp, viewGroup, false);
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
