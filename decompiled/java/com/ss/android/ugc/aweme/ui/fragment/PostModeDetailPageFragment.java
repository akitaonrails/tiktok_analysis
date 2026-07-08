package com.ss.android.ugc.aweme.ui.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0N0Y;
import X.C0SRK;
import X.C0SRM;
import X.C0SRX;
import X.C0SRZ;
import X.C0SSM;
import X.C0SSR;
import X.C0SSX;
import X.C0SSZ;
import X.C0TU8;
import X.C0TU9;
import X.C0TUB;
import X.C11VU;
import X.C1220000hqw;
import X.C13LE;
import X.C1590400rUM;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21146717pB;
import X.C21599719g3;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C721090SQh;
import X.C721370SRj;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC469360Ias;
import Y.ARunnableS22S0101000_11;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeDetailPageFragment extends BaseFragment implements C0SRZ {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZykhKSHELIOSIhLCEnZhUjOjseJyEpDSonKSwgGS40LQM+KCg+LSs4";
    public C0TU9 LLIZ;
    public C0TUB LLIZLLLIL;
    public C0SSR LLJ;
    public C1590400rUM LLJI;
    public PostModeDetailParams LLJIJIL;
    public ScrollSwitchStateManager LLJILJIL;
    public C21599719g3 LLJILJILJ;
    public InterfaceC469360Ias LLJILLL;
    public Aweme LLJJ;
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS555S0100000_11((Fragment) this, 1461), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(641), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1099));

    @Override // X.C0SRZ
    public final PostModePageViewModel DR() {
        return (PostModePageViewModel) this.LLJJIII.getValue();
    }

    @Override // X.C0SRZ
    public final C0SSR LLLIIIIL() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.view_pager) : null;
            this.LLJ = (C0SSR) viewFindViewById;
        }
        return (C0SSR) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0TUB SR() {
        /*
            r22 = this;
            r0 = r22
            com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel r2 = r0.UR()
            com.ss.android.ugc.aweme.model.PostModeDetailParams r4 = r0.LLJIJIL
            r3 = 0
            if (r4 != 0) goto Lc
            r4 = r3
        Lc:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r2.LLILLJJLI
            java.lang.String r15 = ""
            if (r1 == 0) goto L46
            com.ss.android.ugc.aweme.music.model.Music r0 = r1.getMusic()
            if (r0 == 0) goto L2c
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getPlayUrl()
            if (r0 == 0) goto L2c
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L2c
            java.lang.Object r10 = X.C13LP.LJJJLL(r0)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L47
        L2c:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            if (r0 == 0) goto L46
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L46
            java.lang.Object r10 = X.C13LP.LJJJLL(r0)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L47
        L46:
            r10 = r15
        L47:
            X.0TUB r6 = new X.0TUB
            if (r4 == 0) goto Lb1
            com.ss.android.ugc.aweme.model.PostModeEntranceMechanism r5 = r4.postModeEntranceMechanism
        L4d:
            com.ss.android.ugc.aweme.model.PostModeEntranceMechanism r0 = com.ss.android.ugc.aweme.model.PostModeEntranceMechanism.EXPLORE_CARD
            if (r5 != r0) goto Laf
            r7 = 1
        L52:
            if (r1 == 0) goto Lac
            java.lang.String r8 = r1.getAid()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            if (r0 == 0) goto Lad
            java.lang.String r9 = r0.getSourceId()
        L68:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r2.LL
            if (r0 == 0) goto L70
            java.lang.String r11 = r0.mEventType
            if (r11 != 0) goto L71
        L70:
            r11 = r15
        L71:
            boolean r12 = r2.LLJJI
            boolean r13 = r2.LLJILLL
            if (r1 == 0) goto Laa
            int r14 = r1.getAwemeType()
            java.lang.String r0 = r1.getRequestId()
            if (r0 == 0) goto L82
            r15 = r0
        L82:
            if (r4 == 0) goto La2
            com.ss.android.ugc.aweme.model.PostModeEntranceMechanism r0 = r4.postModeEntranceMechanism
            if (r0 == 0) goto La2
            java.lang.String r16 = r0.getValue()
        L8c:
            java.lang.Integer r2 = r4.modelSource
            java.lang.String r1 = r4.fromExplorePage
            java.lang.Long r0 = r4.exploreTabId
            java.lang.String r3 = r4.exploreTabName
        L94:
            r21 = 1
            r17 = r2
            r18 = r1
            r19 = r0
            r20 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        La2:
            r16 = r3
            if (r4 != 0) goto L8c
            r2 = r3
            r1 = r3
            r0 = r3
            goto L94
        Laa:
            r14 = 0
            goto L82
        Lac:
            r8 = r3
        Lad:
            r9 = r3
            goto L68
        Laf:
            r7 = 0
            goto L52
        Lb1:
            r5 = r3
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment.SR():X.0TUB");
    }

    public final PhotoSharedViewModel UR() {
        return (PhotoSharedViewModel) this.LLJJI.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0TU9 c0tu9 = this.LLIZ;
        if (c0tu9 != null) {
            C0TUB c0tubSR = this.LLIZLLLIL;
            if (c0tubSR == null) {
                c0tubSR = SR();
            }
            c0tu9.LJIIIIZZ(c0tubSR);
        }
        super.onDestroy();
    }

    @Override // X.C0SRZ
    public final boolean LLLLIIL() {
        C21599719g3 c21599719g3Mo34LLLIIIIL = mo34LLLIIIIL();
        if (c21599719g3Mo34LLLIIIIL == null || c21599719g3Mo34LLLIIIIL.getCurrentItem() != 1) {
            return false;
        }
        C21599719g3 c21599719g3Mo34LLLIIIIL2 = mo34LLLIIIIL();
        if (c21599719g3Mo34LLLIIIIL2 != null) {
            c21599719g3Mo34LLLIIIIL2.setCurrentItem(0);
        }
        return true;
    }

    public final PostModeDetailRootFragment VR() {
        View view = getView();
        if (view == null) {
            return null;
        }
        C0SRX.LJLILLLLZI.getClass();
        return C721370SRj.LIZ(view);
    }

    public final void WR() {
        View view = getView();
        if (view != null) {
            C0SSM c0ssm = (C0SSM) view.findViewById(R.id.fc3);
            double dLJ = ((double) C11VU.LJ(requireActivity())) * 0.16d;
            if (c0ssm != null) {
                c0ssm.setEnableLayoutChange(false);
                c0ssm.setOnActionUpCallback(new C0SRM(dLJ, this));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0SSM c0ssm;
        C0SSM c0ssm2;
        C21599719g3 c21599719g3;
        super.onDestroyView();
        InterfaceC469360Ias interfaceC469360Ias = this.LLJILLL;
        if (interfaceC469360Ias != null && (c21599719g3 = this.LLJILJILJ) != null) {
            c21599719g3.LJJIIJZLJL(interfaceC469360Ias);
        }
        this.LLJILLL = null;
        this.LLJ = null;
        View view = getView();
        if (view != null && (c0ssm2 = (C0SSM) view.findViewById(R.id.fc3)) != null) {
            c0ssm2.LLJJJJJIL = null;
            c0ssm2.LLJJJJLIIL = null;
            c0ssm2.LLJJL = null;
            c0ssm2.LLJJLIIIJLLLLLLLZ = null;
            c0ssm2.LLJL = null;
        }
        View view2 = getView();
        if (view2 == null || (c0ssm = (C0SSM) view2.findViewById(R.id.fc3)) == null) {
            return;
        }
        c0ssm.LLJJJJJIL = null;
        c0ssm.LLJJJJLIIL = null;
        c0ssm.LLJJL = null;
        c0ssm.LLJJLIIIJLLLLLLLZ = null;
        c0ssm.LLJL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0TU9 c0tu9 = this.LLIZ;
        if (c0tu9 != null) {
            c0tu9.LJIIIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0TU9 c0tu9 = this.LLIZ;
        if (c0tu9 != null && c0tu9.LIZIZ) {
            c0tu9.LIZLLL();
            if (!c0tu9.LJJIIJ) {
                c0tu9.LJJIFFI = System.currentTimeMillis();
            }
        }
        ZR(8);
        PostModeDetailParams postModeDetailParams = this.LLJIJIL;
        if (postModeDetailParams == null || !Intrinsics.LJFF(postModeDetailParams.eventType, "homepage_explore") || postModeDetailParams.postModeEntranceMechanism != PostModeEntranceMechanism.EXPLORE_CARD || postModeDetailParams.isPreviewLightWeight) {
            return;
        }
        C0TU9.LJJIJIIJI.getClass();
        C0TU8.LIZ(true);
    }

    @Override // X.C0SRZ
    public final void tI() {
        C0SSM c0ssm;
        View view = getView();
        if (view == null || (c0ssm = (C0SSM) view.findViewById(R.id.fc3)) == null) {
            return;
        }
        c0ssm.setEnableLayoutChange(true);
        c0ssm.setOnActionUpCallback(null);
        c0ssm.setLeftCallback(new AwS590S0100000_11((C0SRZ) this, 367));
    }

    @Override // X.C0SRZ
    public final C1590400rUM LH() {
        return this.LLJI;
    }

    @Override // X.C0SRZ
    public final Aweme LJIIIIZZ() {
        return this.LLJJ;
    }

    @Override // X.C0SRZ
    public final ScrollSwitchStateManager Yo() {
        return this.LLJILJIL;
    }

    @Override // X.C0SRZ
    /* JADX INFO: renamed from: LLLIIIIL */
    public final C21599719g3 mo34LLLIIIIL() {
        return this.LLJILJILJ;
    }

    @Override // X.C0SRZ
    public final void Ej(String str) {
        PostModeProfileWrapperFragment postModeProfileWrapperFragment;
        C0SSX c0ssx;
        C1590400rUM c1590400rUM = this.LLJI;
        CommonPageFragment commonPageFragmentLJJIJLIJ = null;
        if (c1590400rUM != null) {
            commonPageFragmentLJJIJLIJ = c1590400rUM.LJJIJLIJ("page_profile");
        }
        if ((commonPageFragmentLJJIJLIJ instanceof PostModeProfileWrapperFragment) && (postModeProfileWrapperFragment = (PostModeProfileWrapperFragment) commonPageFragmentLJJIJLIJ) != null) {
            ComponentCallbacks componentCallbacks = postModeProfileWrapperFragment.LLILLL;
            if ((componentCallbacks instanceof C0SSX) && (c0ssx = (C0SSX) componentCallbacks) != null) {
                c0ssx.b2(str);
            } else if (!(postModeProfileWrapperFragment.LLILZ instanceof C0SSZ)) {
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ZR(int i) {
        PostModeDetailParams postModeDetailParams;
        View view;
        CommonPageFragment commonPageFragmentLJJIJLIJ;
        PostModeDetailFragment postModeDetailFragment;
        Object c098200Yq;
        C0TU9 c0tu9 = this.LLIZ;
        if (c0tu9 == null || (postModeDetailParams = this.LLJIJIL) == null || postModeDetailParams.postModeEntranceMechanism != PostModeEntranceMechanism.EXPLORE_CARD || (view = getView()) == null) {
            return;
        }
        C1590400rUM c1590400rUM = this.LLJI;
        C0N0Y c0n0y = null;
        Object obj = null;
        c0n0y = null;
        if (c1590400rUM != null) {
            commonPageFragmentLJJIJLIJ = c1590400rUM.LJJIJLIJ("PostModeDetailFragment");
        } else {
            commonPageFragmentLJJIJLIJ = null;
        }
        if ((commonPageFragmentLJJIJLIJ instanceof PostModeDetailFragment) && (postModeDetailFragment = (PostModeDetailFragment) commonPageFragmentLJJIJLIJ) != null) {
            try {
                c098200Yq = postModeDetailFragment.getPlayerManager();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            c0n0y = (C0N0Y) obj;
        }
        if (!c0tu9.LIZ(c0n0y) && i > 0) {
            HandlerHook.viewPost(view, new ARunnableS22S0101000_11(i, this, 4));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C0SRK.LIZJ("page_create");
        super.onCreate(bundle);
        NR(AFwS243S0000000_11.get$arr$(541));
        C0SRK.LIZJ("page_create_end");
        C721090SQh.LIZ.LIZLLL(UR().LLILZIL, UR().LLILLJJLI, "page_create", Boolean.valueOf(UR().LLJILLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r62, android.os.Bundle r63) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C0SRK.LIZJ("page_create_view");
        try {
            Context context = layoutInflater.getContext();
            if (context != null) {
                viewTd = C21146717pB.LIZIZ(context, R.layout.e_7, viewGroup, false);
            } else {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.e_7, viewGroup, false);
            }
            C0SRK.LIZJ("page_create_view_end");
            C721090SQh.LIZ.LIZLLL(UR().LLILZIL, UR().LLILLJJLI, "page_create_view", Boolean.valueOf(UR().LLJILLL));
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
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0SRK.LIZJ("page_create_view_end");
            C721090SQh.LIZ.LIZLLL(UR().LLILZIL, UR().LLILLJJLI, "page_create_view", Boolean.valueOf(UR().LLJILLL));
            throw th2;
        }
    }
}
