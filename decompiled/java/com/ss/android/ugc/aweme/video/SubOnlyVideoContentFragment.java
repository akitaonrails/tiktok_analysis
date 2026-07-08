package com.ss.android.ugc.aweme.video;

import X.AbstractC329610Cw3;
import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0IJT;
import X.C0IPN;
import X.C0JU4;
import X.C0K70;
import X.C0P6P;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1361400lX0;
import X.C1390410mHn;
import X.C14EU;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C20603715jn;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C275330Aqh;
import X.C292401Bi;
import X.C298650BnD;
import X.C346250Dhn;
import X.C452501pT;
import X.C474500IjA;
import X.C494910Jaz;
import X.C497740JfY;
import X.C516970KPf;
import X.C516980KPg;
import X.C517240KQg;
import X.C521910KdR;
import X.C697110RWb;
import X.C737030Svd;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC516950KPd;
import X.InterfaceC1891350zJl;
import X.InterfaceC344240DeY;
import X.InterfaceC517020KPk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS142S0100000_7;
import Y.AObserverS211S0100000_7;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.event.OpenNewRecordPage;
import com.bytedance.android.livesdk.comp.api.subscription.event.SubOnlyVideoDeleteEvent;
import com.bytedance.android.livesdk.comp.api.subscription.setting.PrivilegePageVideoListSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyVideoContentFragment extends Fragment implements InterfaceC517020KPk, InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLSo8HELIOSZhY5KwA9JDwaICs2JwYjJzs2JjEKOy40JSAiPQ==";
    public Room LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public Function0<Unit> LLIZLLLIL;
    public Boolean LLJ;
    public boolean LLJI;
    public Function1<? super Integer, Unit> LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public ConstraintLayout LLJJI;
    public TuxIconView LLJJIII;
    public TuxTextView LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public SubOnlyVideoViewModel LLJJIJIL;
    public boolean LLJJJ;
    public EnumC516950KPd LLJJJJJIL;
    public int LL = -1;
    public String LLILZIL = "";
    public String LLILZLL = "";
    public SubOnlyVideoOpenParams LLIZ = new SubOnlyVideoOpenParams(null, null, 7, 0);
    public final C01GW LLJJJIL = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(195));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(194));
    public final IAVDraftService LLJJJJLIIL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService();
    public final C516970KPf LLJJL = new IDraftListener() { // from class: X.0KPf
        @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
        public final void onDeleted(AwemeDraft awemeDraft) {
            this.LIZ.LLJJJ = true;
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
        public final void onUpdated(IDraftListener.UpdateParams updateParams) {
            IDraftListener.DefaultImpls.onUpdated(this, updateParams);
        }
    };
    public final C521910KdR LLJJLIIIJLLLLLLLZ = new C521910KdR(this, 1);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0KPe] */
    @Override // X.InterfaceC517020KPk
    public final C516980KPg LJIIZILJ() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            return new C516980KPg(viewOnAttachStateChangeListenerC20604515jv, new C0P6P() { // from class: X.0KPe
                @Override // X.C0P6P
                public final void LJJIFFI() {
                    SubOnlyVideoViewModel subOnlyVideoViewModel = this.LL.LLJJIJIL;
                    if (subOnlyVideoViewModel != null) {
                        subOnlyVideoViewModel.manualListRetry(EnumC323450Cm7.Next);
                    }
                }
            });
        }
        return null;
    }

    public final void UR() {
        C1390410mHn c1390410mHn;
        View view = this.LLJILJIL;
        if (view != null && (c1390410mHn = (C1390410mHn) view.findViewById(R.id.z07)) != null) {
            c1390410mHn.LIZLLL();
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    public final void MR() {
        C20600815jK<InterfaceC1891350zJl> state;
        if (getContext() != null) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                VR(EnumC516950KPd.LLILLL);
                return;
            }
        }
        final SubOnlyVideoViewModel subOnlyVideoViewModel = this.LLJJIJIL;
        if (subOnlyVideoViewModel != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                subOnlyVideoViewModel.setListState(state);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.LJIIL((AbstractC329610Cw3) new C2217401BqU(subOnlyVideoViewModel) { // from class: X.0KPj
                    @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                    public final Object get() {
                        return ((AssemListViewModel) this.receiver).getConfig();
                    }
                }.get());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    @Override // X.InterfaceC344240DeY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0OM1 Sn() {
        /*
            r7 = this;
            android.view.View r1 = r7.getView()
            if (r1 == 0) goto L14
            r0 = 2131370127(0x7f0a208f, float:1.8360252E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L14
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L14:
            boolean r0 = X.C298650BnD.LIZ()
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L6a
            com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams r0 = r7.LLIZ
            int r0 = r0.videoCount
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.content.Context r2 = r7.getContext()
            if (r2 == 0) goto L37
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            r0 = 2131839512(0x7f114a18, float:1.9312278E38)
            java.lang.String r1 = r2.getString(r0, r1)
            if (r1 != 0) goto L39
        L37:
            java.lang.String r1 = ""
        L39:
            X.0OM1 r4 = new X.0OM1
            r4.<init>()
            r4.LIZLLL = r5
            X.0idj r0 = new X.0idj
            r0.<init>()
            r0.LIZJ = r1
            r4.LIZJ = r0
            X.0idn[] r3 = new X.AbstractC1250290idn[r6]
            X.0ifB r2 = new X.0ifB
            r2.<init>()
            r2.LIZLLL()
            r0 = 2130775061(0x7f010c15, float:1.7153314E38)
            r2.LIZJ = r0
            r2.LIZLLL = r6
            kotlin.jvm.internal.AwS551S0100000_7 r1 = new kotlin.jvm.internal.AwS551S0100000_7
            r0 = 547(0x223, float:7.67E-43)
            r1.<init>(r7, r0)
            r2.LIZJ(r1)
            r3[r5] = r2
            r4.LIZIZ(r3)
            return r4
        L6a:
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L37
            r0 = 2131844379(0x7f115d1b, float:1.932215E38)
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L37
            com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams r0 = r7.LLIZ
            int r0 = r0.videoCount
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "%s"
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r2, r0, r1, r5)
            if (r1 != 0) goto L39
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment.Sn():X.0OM1");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        this.LLJJJJLIIL.unregisterListener(this.LLJJL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJJJ) {
            MR();
            this.LLJJJ = false;
        }
    }

    public final void PR(int i) {
        String str;
        Long lValueOf;
        Long lValueOf2;
        User owner;
        FollowInfo followInfo;
        User owner2;
        if (i == 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else if (i < 3) {
            str = "3-";
        } else {
            str = "3+";
        }
        if (this.LLILLL) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_video_page_show");
            c474500IjALIZ.LJJII(this.LLILZLL, "enter_from");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLILZ), "anchor_id");
            c474500IjALIZ.LJJII(str, "video_cnt_range");
            c474500IjALIZ.LJJII("anchor", "user_type");
            c474500IjALIZ.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_video_page_show");
        c474500IjALIZ2.LJJII(this.LLILZLL, "enter_from");
        Room room = this.LLILLJJLI;
        Long lValueOf3 = null;
        if (room != null && (owner2 = room.getOwner()) != null) {
            lValueOf = Long.valueOf(owner2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ2.LJJII(lValueOf, "anchor_id");
        Room room2 = this.LLILLJJLI;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ2.LJJII(lValueOf2, "room_id");
        Room room3 = this.LLILLJJLI;
        if (room3 != null && (owner = room3.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            lValueOf3 = Long.valueOf(followInfo.getFollowStatus());
        }
        c474500IjALIZ2.LJJII(lValueOf3, "follow_status");
        c474500IjALIZ2.LJJII(str, "video_cnt_range");
        c474500IjALIZ2.LJJII("user", "user_type");
        c474500IjALIZ2.LIZ();
    }

    public final void RR(int i) {
        String str;
        if (i == 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else if (i < 3) {
            str = "3-";
        } else {
            str = "3+";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_video_page_post_click");
        c474500IjALIZ.LJJII(this.LLILZLL, "enter_from");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILZ), "anchor_id");
        c474500IjALIZ.LJJII(str, "video_cnt_range");
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZJ = C0IJT.LIZJ("subscription_subonly_video_create_click");
        c474500IjALIZJ.LJJII("subonly_video_page", "event_page");
        c474500IjALIZJ.LJJII(Integer.valueOf(i), "sub_only_video_cnt");
        c474500IjALIZJ.LJJII(Long.valueOf(this.LLILZ), "creator_id");
        c474500IjALIZJ.LIZ();
    }

    public final void SR(String str) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("type", "sub_only_video"), new Pair("enter_method", str), new Pair("need_mob_shoot", "1"));
        if (Intrinsics.LJFF(this.LLILZLL, "live_take_page")) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            C784440Upu.LIZ().LIZIZ(new C0JU4(0));
            DataChannelGlobal.LLILZ.FQ2(OpenNewRecordPage.class, mapLJIIIIZZ);
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://openRecord").buildUpon();
        for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
            builderBuildUpon = builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), builderBuildUpon.build());
    }

    public final void VR(EnumC516950KPd enumC516950KPd) {
        C1390410mHn c1390410mHn;
        this.LLJJJJJIL = enumC516950KPd;
        int iOrdinal = enumC516950KPd.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        View view = this.LLJILJIL;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                        View view2 = this.LLJILJIL;
                        if (view2 != null && (c1390410mHn = (C1390410mHn) view2.findViewById(R.id.z07)) != null) {
                            c1390410mHn.LIZJ();
                        }
                        View view3 = this.LLJJ;
                        if (view3 != null) {
                            C786410Ut5.LJLLLLLL(8, view3);
                        }
                        View view4 = this.LLJILLL;
                        if (view4 != null) {
                            C786410Ut5.LJLLLLLL(8, view4);
                        }
                        View view5 = this.LLJILJILJ;
                        if (view5 != null) {
                            C786410Ut5.LJLLLLLL(8, view5);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                UR();
                View view6 = this.LLJJ;
                if (view6 != null) {
                    C786410Ut5.LJLLLLLL(8, view6);
                }
                View view7 = this.LLJILLL;
                if (view7 != null) {
                    C786410Ut5.LJLLLLLL(8, view7);
                }
                View view8 = this.LLJILJILJ;
                if (view8 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, view8);
                return;
            }
            UR();
            View view9 = this.LLJJ;
            if (view9 != null) {
                C786410Ut5.LJLLLLLL(8, view9);
            }
            View view10 = this.LLJILJILJ;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(8, view10);
            }
            View view11 = this.LLJILLL;
            if (view11 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view11);
            return;
        }
        UR();
        View view12 = this.LLJILLL;
        if (view12 != null) {
            C786410Ut5.LJLLLLLL(8, view12);
        }
        View view13 = this.LLJILJILJ;
        if (view13 != null) {
            C786410Ut5.LJLLLLLL(8, view13);
        }
        View view14 = this.LLJJ;
        if (view14 != null) {
            C786410Ut5.LJLLLLLL(0, view14);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        GridLayoutManager gridLayoutManager;
        super.onConfigurationChanged(configuration);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                gridLayoutManager.LJIJ(3);
            }
            viewOnAttachStateChangeListenerC20604515jv.invalidateItemDecorations();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (C275330Aqh.LIZ()) {
            C1548820qPI.LIZLLL("sub_only_videos_status_change", this.LLJJLIIIJLLLLLLLZ);
        }
        C0K70.LJFF(requireContext(), "SubOnlyVideoContentFragment", this.LLILZLL, "sub_only_video");
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("is_author")) {
                z = arguments.getBoolean("is_author");
            } else if (!Intrinsics.LJFF(arguments.getString("is_author"), "true") && !Intrinsics.LJFF(arguments.getString("is_author"), "1") && arguments.getLong("is_author") != 1) {
                z = false;
            } else {
                z = true;
            }
            this.LLILLL = z;
            this.LLILZ = arguments.getLong("user_id");
            this.LLILZIL = arguments.getString("sec_user_id", "");
            this.LLILZLL = arguments.getString("enter_from", "");
            arguments.getString("enter_method", "");
        }
        SubOnlyVideoViewModel subOnlyVideoViewModel = (SubOnlyVideoViewModel) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(getLifecycle(), "sub_only_video", SubOnlyVideoViewModel.class);
        subOnlyVideoViewModel.LLILZIL = this.LLILLL;
        subOnlyVideoViewModel.LLILZLL = this.LLILZ;
        subOnlyVideoViewModel.LLIZ = this.LLILZIL;
        subOnlyVideoViewModel.LLIZLLLIL = this.LLILZLL;
        subOnlyVideoViewModel.LLJ = this.LLIZ.contentPageType;
        subOnlyVideoViewModel.AQ2(this);
        this.LLJJIJIL = subOnlyVideoViewModel;
        EventBus.LIZLLL().LJIJJ(this);
        KevaBuilder.getInstance().setContext(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        String str;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Context contextRequireContext = requireContext();
        if ((contextRequireContext.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "PGC_ThemeOverlay_Subscription_Dark";
        } else {
            str = "PGC_ThemeOverlay_Subscription_Light";
        }
        int iN3 = C786410Ut5.n3(contextRequireContext.getResources(), str, "style", contextRequireContext.getPackageName());
        if (iN3 != 0) {
            contextRequireContext = new C1361400lX0(contextRequireContext, iN3);
        }
        return layoutInflaterOnGetLayoutInflater.cloneInContext(contextRequireContext);
    }

    @C14EU
    public final void onMyEnterpriseProfileEvent(C517240KQg c517240KQg) {
        c517240KQg.getClass();
        this.LLJJJ = true;
    }

    @C14EU
    public final void onPrivateModelEvent(C697110RWb c697110RWb) {
        if (c697110RWb.LIZIZ != null) {
            this.LLJJJ = true;
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        if (c737030Svd.LIZ == 2) {
            this.LLJJJ = true;
            DataChannelGlobal.LLILZ.GQ2(SubOnlyVideoDeleteEvent.class);
        }
    }

    public final void NR(int i, String str) {
        String str2;
        if (i == 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (i < 3) {
            str2 = "3-";
        } else {
            str2 = "3+";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_video_page_submission_guidance_click");
        c474500IjALIZ.LJJII(this.LLILZLL, "enter_from");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILZ), "anchor_id");
        c474500IjALIZ.LJJII(str2, "video_cnt_range");
        c474500IjALIZ.LJJII(str, "submission_guidance_type");
        c474500IjALIZ.LIZ();
    }

    public final void OR(int i, String str) {
        String str2;
        if (i == 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (i < 3) {
            str2 = "3-";
        } else {
            str2 = "3+";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_video_page_submission_guidance_show");
        c474500IjALIZ.LJJII(this.LLILZLL, "enter_from");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILZ), "anchor_id");
        c474500IjALIZ.LJJII(str2, "video_cnt_range");
        c474500IjALIZ.LJJII(str, "submission_guidance_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData mutableLiveData;
        C197039127h c197039127h;
        SubOnlyVideoViewModel subOnlyVideoViewModel;
        View viewFindViewById;
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        TextView textView;
        String strLJIJI;
        View viewFindViewById2;
        View view2;
        C16FS c16fs;
        View viewFindViewById3;
        int i;
        ViewGroup viewGroup2;
        C197039127h c197039127h2;
        View viewFindViewById4;
        super.onViewCreated(view, bundle);
        PrivilegePageVideoListSetting privilegePageVideoListSetting = PrivilegePageVideoListSetting.INSTANCE;
        if (privilegePageVideoListSetting.isEnabled() && ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).l21() && (viewFindViewById4 = view.findViewById(R.id.fyx)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
        C0K70.LIZJ(requireContext(), "SubOnlyVideoContentFragment");
        this.LLJILJIL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.nm3));
        VR(EnumC516950KPd.LLILZ);
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.p50));
        this.LLJILJILJ = viewLJLLLL;
        if (viewLJLLLL != null && (c197039127h2 = (C197039127h) viewLJLLLL.findViewById(R.id.tec)) != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS142S0100000_7(this, 161));
        }
        View view3 = this.LLJILJILJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View viewLJLLLL2 = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.h3l));
        this.LLJILLL = viewLJLLLL2;
        if (viewLJLLLL2 != null && (viewGroup2 = (ViewGroup) viewLJLLLL2.findViewById(R.id.f6c)) != null) {
            C786410Ut5.K7(viewGroup2, new ACListenerS142S0100000_7(this, 160));
        }
        View view4 = this.LLJILLL;
        if (view4 != null && (viewFindViewById3 = view4.findViewById(R.id.f6j)) != null) {
            if (C275330Aqh.LIZ()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById3);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
        if (C275330Aqh.LIZ() && (view2 = this.LLJILLL) != null && (c16fs = (C16FS) view2.findViewById(R.id.f64)) != null) {
            c16fs.setIcon((Drawable) null);
        }
        View view5 = this.LLJILLL;
        if (view5 != null && (viewFindViewById2 = view5.findViewById(R.id.h2q)) != null) {
            C1143680frq.LIZLLL(viewFindViewById2, C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "live_sub_only_video_empty_list_pic.png");
        }
        View view6 = this.LLJILLL;
        if (view6 != null && (textView = (TextView) view6.findViewById(R.id.jb_)) != null) {
            if (C275330Aqh.LIZ()) {
                strLJIJI = C497740JfY.LJIJI(2131839364);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131844370);
            }
            String strLJIJI2 = C497740JfY.LJIJI(2131844366);
            int iLJJJ = a0.LJJJ(strLJIJI, "%s", 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (iLJJJ >= 0) {
                String strSubstring = strLJIJI.substring(0, iLJJJ);
                String strSubstring2 = strLJIJI.substring(iLJJJ + 2);
                spannableStringBuilder.append((CharSequence) strSubstring);
                spannableStringBuilder.append((CharSequence) strLJIJI2);
                spannableStringBuilder.append((CharSequence) strSubstring2);
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.eu2, getContext())), strSubstring.length(), strSubstring.length() + strLJIJI2.length(), 34);
                C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(1.0769231f), strSubstring.length(), strSubstring.length() + strLJIJI2.length(), 34);
                C1119920fFW.LJIIIIZZ(spannableStringBuilder, strSubstring.length(), strSubstring.length() + strLJIJI2.length(), 34, 500);
            } else {
                spannableStringBuilder.append((CharSequence) strLJIJI);
            }
            textView.setText(spannableStringBuilder);
        }
        View view7 = this.LLJILLL;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(8, view7);
        }
        View viewLJLLLL3 = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.video_list_page));
        this.LLJJ = viewLJLLLL3;
        if (viewLJLLLL3 != null) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJLLLL3.findViewById(R.id.video_list);
        }
        this.LLJJIJIIJIL = viewOnAttachStateChangeListenerC20604515jv;
        View view8 = this.LLJJ;
        if (view8 != null && (viewGroup = (ViewGroup) view8.findViewById(R.id.f6c)) != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS142S0100000_7(this, 162));
        }
        if (!this.LLILLL) {
            View view9 = this.LLJJ;
            if (view9 != null && (frameLayout = (FrameLayout) view9.findViewById(R.id.f6c)) != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            View view10 = this.LLJJ;
            if (view10 != null && (viewFindViewById = view10.findViewById(R.id.f70)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 1, getContext(), false);
            wrapGridLayoutManager.LLIZ = new C346250Dhn(viewOnAttachStateChangeListenerC20604515jv2, wrapGridLayoutManager, 1);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(wrapGridLayoutManager);
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(SubOnlyVideoItemCell.class);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = true;
            c20603715jn.LIZ = 2;
            c20603715jn.LIZLLL = SubOnlyVideoFooterCell.class;
            viewOnAttachStateChangeListenerC20604515jv2.setListConfig(c20603715jn);
            ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv2.getAdapter()).LLLLII(this, SubOnlyVideoContentFragment.class);
        }
        SubOnlyVideoViewModel subOnlyVideoViewModel2 = this.LLJJIJIL;
        if (subOnlyVideoViewModel2 != null) {
            AssemViewModel.asyncSubscribe$default(subOnlyVideoViewModel2, new C2217381BqS() { // from class: X.0CxH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C326190CqX c326190CqX = (C326190CqX) obj;
                    c326190CqX.getClass();
                    return C627260Oiy.LIZLLL(c326190CqX);
                }
            }, null, new AwS586S0100000_7(this, 323), new AwS551S0100000_7(this, 548), new AwS586S0100000_7(this, 324), 2, null);
        }
        if (C275330Aqh.LIZ() && (subOnlyVideoViewModel = this.LLJJIJIL) != null) {
            AssemViewModel.asyncSubscribe$default(subOnlyVideoViewModel, new C2217381BqS() { // from class: X.0CqY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C326190CqX) obj).LLILLJJLI;
                }
            }, null, AFwS237S0000000_7.get$arr$(238), AFwS193S0000000_7.get$arr$(196), new AwS586S0100000_7(this, 322), 2, null);
        }
        View view11 = this.LLJJ;
        if (view11 != null) {
            C786410Ut5.LJLLLLLL(8, view11);
        }
        if (privilegePageVideoListSetting.isEnabled()) {
            if (C494910Jaz.LIZ[this.LLIZ.contentPageType.ordinal()] == 1) {
                if (!this.LLILLL && (c197039127h = (C197039127h) view.findViewById(R.id.my1)) != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h);
                    C786410Ut5.U8(c197039127h, new ACListenerS142S0100000_7(this, 164));
                }
            } else if (C298650BnD.LIZ()) {
                this.LLJJI = (ConstraintLayout) view.findViewById(R.id.my2);
                this.LLJJIII = (TuxIconView) view.findViewById(R.id.my3);
                this.LLJJIJI = (TuxTextView) view.findViewById(R.id.my4);
                SubOnlyVideoViewModel subOnlyVideoViewModel3 = this.LLJJIJIL;
                if (subOnlyVideoViewModel3 != null && (mutableLiveData = subOnlyVideoViewModel3.LLJILJIL) != null) {
                    mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 32));
                }
            }
        }
        MR();
        this.LLJJJJLIIL.registerListener(this.LLJJL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dde, viewGroup, false);
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
