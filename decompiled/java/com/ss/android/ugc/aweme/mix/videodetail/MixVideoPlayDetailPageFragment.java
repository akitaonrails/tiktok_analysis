package com.ss.android.ugc.aweme.mix.videodetail;

import X.C01GW;
import X.C05FU;
import X.C05FZ;
import X.C098200Yq;
import X.C09R3;
import X.C0P6P;
import X.C0RQA;
import X.C0SZ8;
import X.C0T0X;
import X.C0T45;
import X.C0XQ7;
import X.C1164120gOo;
import X.C1165370gQp;
import X.C1168860gWS;
import X.C1169150gWv;
import X.C1169160gWw;
import X.C1169240gX4;
import X.C1209530ha3;
import X.C1220000hqw;
import X.C1235870iGX;
import X.C1321305Fb;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1401260mZI;
import X.C14EU;
import X.C1578630rBN;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C19371010qS;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2189821An6;
import X.C2217381BqS;
import X.C297010BkZ;
import X.C338490DOt;
import X.C338520DOw;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C596990NbF;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737030Svd;
import X.C739870T0n;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C960203pA;
import X.C985403tE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC583830Mv7;
import X.InterfaceC752360TfG;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistInfoViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistManagementViewModel;
import com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPageComponent;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideoPlayDetailPageFragment extends MultiTypeDetailPageFragment implements C0P6P, InterfaceC583830Mv7 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWElISEpJis2HELIOSPCQlJWEeIT0aICs2JxUgKDYXLTEtICMDKSIpDz0yLygpJzs=";
    public TuxTextView LLJ;
    public ConstraintLayout LLJI;
    public TuxTextView LLJIJIL;
    public boolean LLJILJIL;
    public C1169240gX4 LLJILLL;
    public TuxSheet LLJJ;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public Aweme LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Aweme LLJJJ;
    public C1209530ha3 LLJJJIL;
    public View LLJJJJ;
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C736950SvV LLJL;
    public final C736950SvV LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public String LLJILJILJ = "";
    public String LLJJI = "";
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(215));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixVideoPlayDetailPageFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MixVideoPlayDetailPageFragment.class, "playlistInfoViewModel", "getPlaylistInfoViewModel()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/PlaylistInfoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MixVideoPlayDetailPageFragment.class, "playlistManagementViewModel", "getPlaylistManagementViewModel()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/PlaylistManagementViewModel;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
    }

    public MixVideoPlayDetailPageFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixVideosViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 691);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(209);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJJJLIIL = new AssemVMLazy(function0LJIIJ, awS562S0100000_18, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 692), aFwS256S0000000_18);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PlaylistInfoViewModel.class);
        this.LLJJL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS562S0100000_18(c19719912DlLIZ2, 693), c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 694), AFwS256S0000000_18.get$arr$(210));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PlaylistManagementViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), new AwS562S0100000_18(c19719912DlLIZ3, 695), c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 696), AFwS256S0000000_18.get$arr$(211));
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(this, 689);
        this.LLJL = new C736950SvV(C13LE.LIZ(PlaylistConsumptionViewModel.class), awS562S0100000_182, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(212), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(214);
        this.LLJLIL = new C736950SvV(C13LE.LIZ(MixBottomBarVM.class), aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(213), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 697));
    }

    @Override // X.InterfaceC583830Mv7
    public final void EJ() {
    }

    @Override // X.InterfaceC583830Mv7
    public final boolean Cv() {
        return ((Keva) this.LLJJJJJIL.getValue()).getBoolean("autoplay_toast_show", false);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailPageComponent NR() {
        return new MixVideoDetailPageComponent();
    }

    public final TuxTextView ZR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bg2) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView aS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fr7) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final PlaylistConsumptionViewModel cS() {
        return (PlaylistConsumptionViewModel) this.LLJL.getValue();
    }

    public final MixVideosViewModel dS() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (MixVideosViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // X.InterfaceC583830Mv7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ga() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment.ga():boolean");
    }

    public final void kS() {
        TuxSheet tuxSheet;
        if (this.LLJJIII && this.LLJJIJI) {
            C0XQ7.LJ();
            if (Intrinsics.LJFF(C0XQ7.LIZ.LJIIJ().getCurUserId(), !C297010BkZ.LIZ() ? dS().LLJILJIL : cS().LLJIJIL)) {
                TuxSheet tuxSheet2 = this.LLJJ;
                if (tuxSheet2 != null) {
                    tuxSheet2.dismiss();
                }
                ViewGroup viewGroup = SR().LLLII;
                if (viewGroup != null) {
                    C786410Ut5.LJLLLLLL(8, viewGroup);
                }
                C1235870iGX c1235870iGXAp = SR().ap();
                if (c1235870iGXAp != null) {
                    c1235870iGXAp.LJII();
                }
                View view = this.LLJJJJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
            } else {
                C1235870iGX c1235870iGXAp2 = SR().ap();
                if (c1235870iGXAp2 != null) {
                    c1235870iGXAp2.LJII();
                }
                C1397580mTM c1397580mTM = new C1397580mTM(getContext());
                c1397580mTM.LIZIZ(C786410Ut5.j4(getString(2131833900), Arrays.copyOf(new Object[]{this.LLJJI}, 1)));
                C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 951));
                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                c1397510mTF.LIZLLL();
                c1397510mTF.LLJJIII = false;
                c1397510mTF.LJFF(false);
                C1169240gX4 c1169240gX4 = this.LLJILLL;
                if (c1169240gX4 != null && c1169240gX4.getFromShare() && (tuxSheet = this.LLJJ) != null) {
                    tuxSheet.dismiss();
                }
            }
            this.LLJJIII = false;
        }
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        if (!C297010BkZ.LIZ()) {
            dS().xQ2(Long.valueOf(dS().LLJIJIL), "", "");
        } else if (cS().LLILZIL == null) {
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailFragmentPanel OR() {
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        C1169240gX4 c1169240gX4 = this.LLJILLL;
        String previousPage = c1169240gX4 != null ? c1169240gX4.getPreviousPage() : null;
        Intrinsics.LJFF(curUserId, this.LLILLJJLI.getUid());
        C2189821An6 c2189821An6 = this.LLILLJJLI;
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("mix_video_list_params") : null;
        return new MixVideoPlayDetailPageFragmentPanel(previousPage, c2189821An6, serializable instanceof C1169240gX4 ? (C1169240gX4) serializable : null);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final void VR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1578630rBN.LJIIIIZZ(arguments, "DETAIL_MIX_VIDEO");
        }
    }

    public final View bS() {
        C0XQ7.LJ();
        if (!Intrinsics.LJFF(C0XQ7.LIZ.LJIIJ().getCurUserId(), !C297010BkZ.LIZ() ? dS().LLJILJIL : cS().LLJIJIL)) {
            View viewSd = C786410Ut5.Sd(R.layout.dod, C786410Ut5.ne(getContext()), null);
            View viewFindViewById = viewSd.findViewById(R.id.k0a);
            TextView textView = (TextView) viewSd.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) viewSd.findViewById(R.id.zhs);
            viewFindViewById.setBackgroundResource(R.drawable.c73);
            if (getContext() != null) {
                textView.setTextColor(C960203pA.LIZ(R.attr.bx, textView.getContext()));
                textView2.setTextColor(C960203pA.LIZ(R.attr.bx, textView.getContext()));
            }
            textView.setText(getString(2131838190));
            C786410Ut5.LLIL(textView2, 8);
            return viewSd;
        }
        View viewSd2 = C786410Ut5.Sd(R.layout.doe, C786410Ut5.ne(getContext()), null);
        C1749280vcc c1749280vcc = (C1749280vcc) viewSd2.findViewById(R.id.h33);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_no_video;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        String string = getString(2131840553);
        String str = this.LLJJI;
        if (str == null) {
            str = "";
        }
        c1722300uv6.LJI = u.LJJIFFI(string, "%1$s", str, false);
        c1722300uv6.LJIIIIZZ = getString(2131840552);
        c1722300uv6.LJIIJJI = new AwS581S0100000_2(this, 584);
        c1749280vcc.setStatus(c1722300uv6);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c1749280vcc.getLayoutParams();
        Context context = getContext();
        layoutParams.topMargin = context != null ? C497820Jfg.LIZJ(context) : 0;
        return viewSd2;
    }

    public final void mS() {
        String mUsrId;
        String mSecUid;
        C0SZ8 c0sz8LJLIL;
        RootCellComponent rootCellComponentLIZ;
        Context context = getContext();
        if (context == null) {
            return;
        }
        DetailFragmentPanel detailFragmentPanel = this.LL;
        if (detailFragmentPanel != null && (c0sz8LJLIL = detailFragmentPanel.LJLIL()) != null && (rootCellComponentLIZ = C0T0X.LIZ(c0sz8LJLIL)) != null) {
            rootCellComponentLIZ.ip(C0RQA.PAUSE);
        }
        String str = this.LLJILJILJ;
        Aweme aweme = this.LLJJIJIIJIL;
        C1169240gX4 c1169240gX4 = this.LLJILLL;
        String str2 = "";
        if (c1169240gX4 == null || (mUsrId = c1169240gX4.getMUsrId()) == null) {
            mUsrId = "";
        }
        C1169240gX4 c1169240gX42 = this.LLJILLL;
        if (c1169240gX42 != null && (mSecUid = c1169240gX42.getMSecUid()) != null) {
            str2 = mSecUid;
        }
        C1169240gX4 c1169240gX43 = this.LLJILLL;
        this.LLJJ = C1168860gWS.LIZ(context, "playlist", str, aweme, mUsrId, str2, "", c1169240gX43 != null ? c1169240gX43.getSearchParam() : null, new AwS562S0100000_18(this, 690), this.LLILLJJLI.getExtra().get("playlist_session_id"));
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        Aweme aweme2 = this.LLJJJ;
        String str3 = this.LLJILJILJ;
        C1169240gX4 c1169240gX44 = this.LLJILLL;
        C1169150gWv searchParam = c1169240gX44 != null ? c1169240gX44.getSearchParam() : null;
        C1169240gX4 c1169240gX45 = this.LLJILLL;
        String enterMethod = c1169240gX45 != null ? c1169240gX45.getEnterMethod() : null;
        C1169240gX4 c1169240gX46 = this.LLJILLL;
        String previousPage = c1169240gX46 != null ? c1169240gX46.getPreviousPage() : null;
        String str4 = this.LLILLJJLI.getExtra().get("playlist_session_id");
        c1169160gWw.getClass();
        C1169160gWw.LJI(aweme2, str3, "playlist", searchParam, enterMethod, previousPage, str4);
        if (!C297010BkZ.LIZ()) {
            dS().LLILZLL = this.LLJJJ;
            dS().setState(AFwS256S0000000_18.get$arr$(868));
        } else {
            cS().IQ2(this.LLJJJ);
            PlaylistConsumptionViewModel playlistConsumptionViewModelCS = cS();
            playlistConsumptionViewModelCS.getClass();
            playlistConsumptionViewModelCS.setState(AFwS256S0000000_18.get$arr$(871));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (C297010BkZ.LIZ()) {
            C736680Sv4.LJIJJ(cS(), new AwS597S0100000_18(this, 186));
        } else {
            C736680Sv4.LJIJJ(dS(), new AwS597S0100000_18(this, 185));
        }
        C596990NbF c596990NbF = C596990NbF.LIZ;
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0N8t
            public static void LIZ() {
                LinkedHashMap<String, String> linkedHashMap = C596990NbF.LIZJ;
                if (linkedHashMap != null) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(entry.getKey());
                        sbLIZ.append(',');
                        sbLIZ.append(entry.getValue());
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (arrayList != null) {
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "|", null, null, 0, null, null, 62);
                        InterfaceC625970Ogt interfaceC625970Ogt = C596990NbF.LIZIZ;
                        if (interfaceC625970Ogt != null) {
                            interfaceC625970Ogt.LIZIZ("playlist_watch_history", strLJJLIIIJ);
                        }
                        C589140N8u.LJ.LJIIIZ("watch history has been written into disk");
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PlaylistWatchHistoryHelper@9ea7.writeIntoDisk$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PlaylistWatchHistoryHelper@9ea7.writeIntoDisk$1");
            }
        });
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC583830Mv7
    public final boolean rt() {
        return ((CommentService) ServiceManager.get().getService(CommentService.class)).LLFFF(getActivity()) || !this.LLJILJIL;
    }

    public final void gS(List list) {
        String aid;
        String aid2;
        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
        Aweme aweme = dS().LLILZIL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        Aweme awemeLLILZ = iAwemeService.LLILZ(aid);
        int i = 0;
        for (Aweme aweme2 : (ArrayList) list) {
            int i2 = i + 1;
            AwemeExtKt.appendMobParam(aweme2, "playlist_session_id", this.LLILLJJLI.getExtra().get("playlist_session_id"));
            String aid3 = aweme2.getAid();
            Aweme aweme3 = dS().LLILZIL;
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            } else {
                aid2 = null;
            }
            if (Intrinsics.LJFF(aid3, aid2) && awemeLLILZ != null) {
                AwemeExtKt.appendMobParam(awemeLLILZ, "playlist_session_id", this.LLILLJJLI.getExtra().get("playlist_session_id"));
                AwemeExtKt.appendMobParam(awemeLLILZ, "key_mix_id", this.LLJILJILJ);
                ListProtector.set(list, i, awemeLLILZ);
            } else {
                ListProtector.set(list, i, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme2));
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void hS(List<? extends Aweme> list) {
        boolean z;
        ?? arrayList;
        VerticalViewPager verticalViewPager;
        PagerAdapter adapter;
        DetailFragmentPanel detailFragmentPanel;
        C1169240gX4 c1169240gX4;
        Aweme aweme;
        String aid;
        DetailFragmentPanel detailFragmentPanel2;
        C2189821An6 c2189821An6;
        DetailPageComponent detailPageComponentRR;
        DetailFragmentPanel detailFragmentPanel3;
        PlayerComponentTemp playerComponentTemp;
        if (list.isEmpty()) {
            this.LLJJIII = true;
            kS();
        }
        if (dS().LLILZIL != null && WR(dS().LLILZIL, list) != 0 && (detailPageComponentRR = RR()) != null && (detailFragmentPanel3 = detailPageComponentRR.LLJL) != null && (playerComponentTemp = detailFragmentPanel3.LLLLIILLL) != null) {
            playerComponentTemp.LLJJIII = true;
        }
        C1169240gX4 c1169240gX42 = this.LLJILLL;
        if (c1169240gX42 != null && c1169240gX42.getShowLast() && (c1169240gX4 = this.LLJILLL) != null && c1169240gX4.getTotalVideoCount() > 1 && (aweme = (Aweme) C13LP.LJJLIIIJL(list)) != null && (aid = aweme.getAid()) != null && (detailFragmentPanel2 = this.LL) != null && (c2189821An6 = detailFragmentPanel2.LLLLIIIILLL) != null) {
            c2189821An6.setAid(aid);
        }
        if (!C297010BkZ.LIZ()) {
            z = dS().LLIZ;
        } else {
            z = cS().LLJI;
        }
        if (z) {
            arrayList = new ArrayList();
            for (Aweme aweme2 : list) {
                String aid2 = aweme2.getAid();
                C596990NbF c596990NbF = C596990NbF.LIZ;
                if (Intrinsics.LJFF(aid2, C596990NbF.LIZ(this.LLJILJILJ))) {
                    arrayList.add(aweme2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        DetailFragmentPanel detailFragmentPanel4 = this.LL;
        if (detailFragmentPanel4 != null && (verticalViewPager = detailFragmentPanel4.LLJJIJI) != null && (adapter = verticalViewPager.getAdapter()) != null && adapter.getCount() == 0 && (true ^ arrayList.isEmpty()) && (detailFragmentPanel = this.LL) != null) {
            String aid3 = ((Aweme) C13LP.LJJJJZI(arrayList)).getAid();
            C2189821An6 c2189821An62 = detailFragmentPanel.LLLLIIIILLL;
            if (c2189821An62 != null) {
                c2189821An62.setAid(aid3);
            }
        }
        DetailFragmentPanel detailFragmentPanel5 = this.LL;
        if (detailFragmentPanel5 != null) {
            ArrayList arrayList2 = new ArrayList(list);
            gS(arrayList2);
            detailFragmentPanel5.LLJJJIL(arrayList2, dS().LLJ);
        }
        C20684815ws.onEventV3("playlist_first_frame");
        C736680Sv4.LJIJJ(dS(), new AwS384S0200000_18(this, (MixVideoPlayDetailPageFragment) list, (List<? extends Aweme>) 66));
    }

    public final void iS(Aweme aweme) {
        int iWR;
        VerticalViewPager verticalViewPager;
        if (aweme == null) {
            return;
        }
        C1169240gX4 c1169240gX4 = this.LLJILLL;
        if (c1169240gX4 != null) {
            c1169240gX4.getSearchParam();
        }
        if (!C297010BkZ.LIZ()) {
            iWR = WR(aweme, ((C1164120gOo) dS().vmDispatcher.getState()).LL);
        } else {
            C1165370gQp c1165370gQp = cS().LLILZIL;
            if (c1165370gQp == null) {
                c1165370gQp = null;
            }
            iWR = WR(aweme, C13LP.LLIIII(c1165370gQp.LLILLL));
        }
        DetailFragmentPanel detailFragmentPanel = this.LL;
        if (detailFragmentPanel != null && (verticalViewPager = detailFragmentPanel.LLJJIJI) != null) {
            verticalViewPager.LJJIJLIJ(iWR, true);
        }
        this.LLJJJ = aweme;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentListPanelShow(C739870T0n c739870T0n) {
        MixVideoPlayDetailPageFragmentPanel mixVideoPlayDetailPageFragmentPanel;
        if (c739870T0n.LIZ == 1) {
            DetailFragmentPanel detailFragmentPanel = this.LL;
            if ((detailFragmentPanel instanceof MixVideoPlayDetailPageFragmentPanel) && (mixVideoPlayDetailPageFragmentPanel = (MixVideoPlayDetailPageFragmentPanel) detailFragmentPanel) != null) {
                mixVideoPlayDetailPageFragmentPanel.LJIIZILJ("panel_open");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033e  */
    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment.onCreate(android.os.Bundle):void");
    }

    @C14EU
    public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        getActivity();
        iCommercePageTrackingServiceLIZLLL.LIZ(new C1401260mZI(((C1164120gOo) dS().vmDispatcher.getState()).LL, c737030Svd.LIZ, c737030Svd.LIZIZ));
    }

    public static int WR(Aweme aweme, List list) {
        String aid;
        if (list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                String aid2 = ((Aweme) it2.next()).getAid();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(aid2, aid)) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object objLLFF;
        C05FZ c05fz = C05FZ.LIZ;
        C2097608Jq.LJ();
        c05fz.getClass();
        if (C1321305Fb.LIZ()) {
            C05FU.LIZ(C05FU.LIZ, "playlist_launch_performance", "playlist_detail_create_start");
        }
        C19GS c19gs = null;
        if (C20673215v0.LIZ(R.layout.do3, null)) {
            C19371010qS.LIZIZ(-1L, "playlist_detail_inflate");
        } else {
            C19371010qS.LIZIZ(-2L, "playlist_detail_inflate");
        }
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.do3, getActivity(), viewGroup, false);
        C2097608Jq.LJ();
        if (C1321305Fb.LIZ()) {
            C05FU.LIZ(C05FU.LIZ, "playlist_launch_performance", "playlist_detail_created");
        }
        C0T45 c0t45LJIIIIZZ = C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
        DetailFragmentPanel detailFragmentPanel = this.LL;
        if (detailFragmentPanel == null || (objLLFF = detailFragmentPanel.LLFF()) == null) {
            objLLFF = 0;
        }
        String strValueOf = String.valueOf(objLLFF);
        c0t45LJIIIIZZ.getClass();
        InterfaceC752360TfG interfaceC752360TfGLIZ = SplitContainerManager.LIZ(strValueOf, this, viewLIZLLL, false);
        SR().LLLF = interfaceC752360TfGLIZ;
        View viewLJ = interfaceC752360TfGLIZ.LJ();
        if (!(viewLJ instanceof View)) {
            viewLJ = null;
        }
        if (viewLJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLJ, this);
                viewLJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLJ;
    }
}
