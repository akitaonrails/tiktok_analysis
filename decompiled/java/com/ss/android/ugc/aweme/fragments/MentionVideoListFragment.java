package com.ss.android.ugc.aweme.fragments;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0ZIK;
import X.C1220040hr0;
import X.C1220050hr1;
import X.C1220270hrN;
import X.C12823050b;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C427270GpB;
import X.C444960Hcc;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.BaseVideoListVM;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class MentionVideoListFragment extends BaseFragment {
    public static final C1220040hr0 LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static C1220050hr1 LLJJIJIL = null;
    public static boolean LLJJJ = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM+KCg+HELIOSLSs4OmEeLSs4ICA9HiwoLCAfITY4Dz0yLygpJzs=";
    public LinearLayout LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public final IAVPublishService LLJIJIL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
    public ViewGroup LLJILJIL;
    public C427270GpB LLJILJILJ;
    public boolean LLJILLL;
    public BaseVideoListVM<C1220270hrN, C12823050b, Long> LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MentionVideoListFragment.class, "shareVm", "getShareVm()Lcom/ss/android/ugc/aweme/viewmodel/MentionVideoShareModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = new C1220040hr0();
    }

    public MentionVideoListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionVideoShareModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1445);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(162);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1446), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 1447), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1448), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
        this.LLJJIII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(248));
    }

    private final MentionVideoShareModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (MentionVideoShareModel) assemVMLazy.getValue();
    }

    public void UR() {
        String str;
        if (this.LLIZLLLIL == 8 && (str = this.LLJI) != null && str.length() != 0) {
            ViewGroup viewGroup = this.LLJILJIL;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C786410Ut5.LJLZ(4, viewGroup);
            C427270GpB c427270GpB = this.LLJILJILJ;
            if (c427270GpB == null) {
                c427270GpB = null;
            }
            String str2 = this.LLJI;
            int i = 1 ^ (C444960Hcc.LIZIZ() ? 1 : 0);
            c427270GpB.setLayoutDirection(i ^ 1);
            c427270GpB.setTextDirection(i != 0 ? 3 : 4);
            c427270GpB.setText(str2);
        }
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 161), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (LLJJJ) {
            LLJJJ = false;
        }
        if (LLJJIJIL != null) {
            LLJJIJIL = null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.LLIZLLLIL = getArguments().getInt("page_type");
            this.LLJ = getArguments().getString("music_id");
            this.LLJI = getArguments().getString("music_title");
        }
        UR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Aweme aweme;
        int privateStatus;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            int i3 = -1;
            if (i2 == -1) {
                if (intent != null && intent.getSerializableExtra("mention_video_Info_respose") != null) {
                    VideoInfoFromURLResponse videoInfoFromURLResponse = (VideoInfoFromURLResponse) intent.getSerializableExtra("mention_video_Info_respose");
                    try {
                        stringExtra = intent.getStringExtra("mention_video_enter_method");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    this.LLJIJIL.returnMentionVideoRespose(getActivity(), videoInfoFromURLResponse, stringExtra);
                    SR().setState(new AwS593S0100000_14(new Pair(videoInfoFromURLResponse, stringExtra), (Pair<VideoInfoFromURLResponse, String>) 229));
                    return;
                }
                C1220050hr1 c1220050hr1 = LLJJIJIL;
                if (c1220050hr1 != null && (aweme = c1220050hr1.LIZIZ) != null) {
                    String uniqueId = aweme.getAuthor().getUniqueId();
                    if (uniqueId == null) {
                        uniqueId = aweme.getAuthor().getShortId();
                    }
                    String nickname = aweme.getAuthor().getNickname();
                    String uid = aweme.getAuthor().getUid();
                    String secUid = aweme.getAuthor().getSecUid();
                    String aid = aweme.getAid();
                    AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
                    if (statusSafety != null) {
                        privateStatus = statusSafety.getPrivateStatus();
                    } else {
                        privateStatus = 0;
                    }
                    boolean zIsAccuratePrivateAccount = aweme.getAuthor().isAccuratePrivateAccount();
                    C1220050hr1 c1220050hr12 = LLJJIJIL;
                    if (c1220050hr12 != null) {
                        i3 = c1220050hr12.LIZ;
                    }
                    C0ZIK c0zik = new C0ZIK(uniqueId, nickname, uid, secUid, aid, privateStatus, zIsAccuratePrivateAccount ? 1 : 0, i3, "click_preview");
                    this.LLJIJIL.setChainInfo(getActivity(), c0zik);
                    SR().setState(new AwS598S0100000_19(c0zik, 595));
                    LLJJIJIL = null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dm9, viewGroup, false);
        this.LLJILJIL = (ViewGroup) viewTd.findViewById(R.id.vqr);
        this.LLJILJILJ = (C427270GpB) viewTd.findViewById(R.id.ox6);
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
