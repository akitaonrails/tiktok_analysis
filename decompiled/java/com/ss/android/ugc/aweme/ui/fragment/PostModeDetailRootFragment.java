package com.ss.android.ugc.aweme.ui.fragment;

import X.AnonymousClass1916;
import X.C01GW;
import X.C0SQX;
import X.C0SRK;
import X.C0SRW;
import X.C0SRX;
import X.C0SRZ;
import X.C0SSR;
import X.C1220000hqw;
import X.C13LE;
import X.C1570830qyn;
import X.C191C;
import X.C19EG;
import X.C304280BwI;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C707090RoR;
import X.C721090SQh;
import X.C721640SSk;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS97S0201000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class PostModeDetailRootFragment extends SAFTikTokFragment implements C0SRX {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZykhKSHELIOSIhLCEnZhUjOjseJyEpDSonKSwgGyA8PAM+KCg+LSs4";
    public C0SSR LLJILLL;
    public C0SRZ LLJJ;
    public String LLJJI;
    public PostModeDetailParams LLJJIII;
    public ARunnableS111S0100000_11 LLJJJJ;
    public View LLJJJJJIL;
    public AnonymousClass1916 LLJJJJLIIL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1101));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1100));
    public final C736950SvV LLJJIJIL = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS555S0100000_11((Fragment) this, 1461), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(641), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public boolean LLJJJ = true;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(238));
    public final int LLJJL = R.layout.e_9;

    @Override // X.C0SRX
    public final void ft() {
        this.LLJJJ = false;
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return 0;
    }

    @Override // X.C0SRX
    public final C0SSR FO() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.view_pager) : null;
            this.LLJILLL = (C0SSR) viewFindViewById;
        }
        return (C0SSR) viewFindViewById;
    }

    @Override // X.C0SRX
    public final CommentContextSource GL() {
        return (CommentContextSource) this.LLJJJIL.getValue();
    }

    @Override // X.C0SRX
    public final PhotoSharedViewModel LA() {
        return (PhotoSharedViewModel) this.LLJJIJIL.getValue();
    }

    @Override // X.C0SRX
    public final PostModeTimeLoggerViewModel SJ() {
        return (PostModeTimeLoggerViewModel) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.C0SRX
    public final PostModePageViewModel getViewModel() {
        return (PostModePageViewModel) this.LLJJIJI.getValue();
    }

    public PostModeDetailRootFragment() {
        aS(AFwS264S0000000_24.get$arr$(501));
    }

    public static boolean mS() {
        return C304280BwI.LIZLLL() && Build.VERSION.SDK_INT >= 35;
    }

    @Override // X.C0SRX
    public final boolean cw() {
        VideoItemParams videoItemParams = LA().LL;
        return Intrinsics.LJFF(videoItemParams != null ? videoItemParams.mEventType : null, "homepage_explore");
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() {
        C0SRW.LJIIIIZZ(this);
        super.finish();
    }

    public final ViewGroup hS() {
        ViewGroup viewGroup;
        C19EG activity = getActivity();
        if (activity == null) {
            return null;
        }
        View viewLIZ = C1570830qyn.LIZ(activity);
        return (!(viewLIZ instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLIZ) == null) ? (ViewGroup) activity.findViewById(R.id.nwe) : viewGroup;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        C0SRW.LJFF(this);
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        final ViewGroup viewGroupHS;
        super.onDestroy();
        ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLJJJJ;
        if (aRunnableS111S0100000_11 != null) {
            C707090RoR.LIZ().removeCallbacks(aRunnableS111S0100000_11);
        }
        this.LLJJJJ = null;
        C721640SSk c721640SSk = C721640SSk.LIZ;
        PostModeDetailParams postModeDetailParams = this.LLJJIII;
        c721640SSk.getClass();
        if (!C721640SSk.LJIILJJIL(postModeDetailParams) || mS() || Build.VERSION.SDK_INT < 29 || (viewGroupHS = hS()) == null) {
            return;
        }
        HandlerHook.viewPost(viewGroupHS, new Runnable() { // from class: X.0SRY
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PostModeDetailRootFragment@5017.onDestroy$1");
                try {
                    viewGroupHS.suppressLayout(false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PostModeDetailRootFragment@5017.onDestroy$1");
            }
        });
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0SRW.LJIIIZ(this);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0SQX c0sqx = SJ().LL;
        c0sqx.getClass();
        c0sqx.LIZ = Long.valueOf(System.currentTimeMillis());
        getViewModel().LLJJIII.setValue(Unit.LIZ);
    }

    @Override // X.C0SRX
    public final PostModeDetailParams H() {
        return this.LLJJIII;
    }

    @Override // X.C0SRX
    public final void LLLLLLIL() {
        C0SRW.LJ(this);
    }

    @Override // X.C0SRX
    public final void M9() {
        C0SRW.LIZ(this);
    }

    @Override // X.C0SRX
    public final C0SRZ N6() {
        return this.LLJJ;
    }

    @Override // X.C0SRX
    public final View Nd() {
        return this.LLJJJJJIL;
    }

    @Override // X.C0SRX
    public final void aL() {
        C0SRW.LJIIL(this);
    }

    @Override // X.C0SRX
    public final String getEnterFrom() {
        return this.LLJJI;
    }

    @Override // X.C0SRX
    /* JADX INFO: renamed from: if */
    public final boolean mo33if() {
        return this.LLJJJ;
    }

    @Override // X.C0SRX
    public final void DP(PostModeDetailPageFragment postModeDetailPageFragment) {
        this.LLJJ = postModeDetailPageFragment;
    }

    @Override // X.C0SRX
    public final void LI(PostModeDetailParams postModeDetailParams) {
        this.LLJJIII = postModeDetailParams;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0SRW.LIZIZ(this, keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Window window;
        if (bundle != null) {
            string = bundle.getString("enter_from", "");
        } else {
            string = null;
        }
        this.LLJJI = string;
        C0SRK.LIZJ("root_fragment_create");
        C0SRW.LJII(this);
        C721640SSk c721640SSk = C721640SSk.LIZ;
        PostModeDetailParams postModeDetailParams = this.LLJJIII;
        c721640SSk.getClass();
        boolean z = false;
        if (C721640SSk.LJIILJJIL(postModeDetailParams) && !mS() && Build.VERSION.SDK_INT >= 29) {
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                this.LLJJLIIIJLLLLLLLZ = Integer.valueOf(window.getNavigationBarColor());
                if ((window.getDecorView().getSystemUiVisibility() & 16) != 0) {
                    z = true;
                }
                this.LLJL = z;
            }
            ViewGroup viewGroupHS = hS();
            if (viewGroupHS != null) {
                viewGroupHS.suppressLayout(true);
            }
        }
        aS(new AwS590S0100000_11(this, 371));
        super.onCreate(bundle);
        C0SRW.LJI(this);
        C0SRK.LIZJ("root_fragment_create_end");
        C721090SQh.LIZ.LIZLLL(LA().LLILZIL, LA().LLILLJJLI, "root_fragment_create", Boolean.valueOf(LA().LLJILLL));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        PostModeDetailParams postModeDetailParams = this.LLJJIII;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // X.C0SRX
    public final void vy(Context context) {
        C0SRW.LJIIJ(this, context);
    }

    public final void iS(int i, Map map) {
        if (map == null) {
            aS(AFwS243S0000000_11.get$arr$(592));
        } else {
            aS(new AwS97S0201000_11(this, (PostModeDetailRootFragment) map, (Map<String, ? extends C191C>) i, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.C0SRX
    public final boolean FL(String str, String str2, String str3, PostModeDetailParams postModeDetailParams) {
        return C0SRW.LJIILJJIL(str, str2, str3, postModeDetailParams);
    }
}
