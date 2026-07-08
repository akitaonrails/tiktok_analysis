package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0HE8;
import X.C0K0R;
import X.C0K4B;
import X.C0K5A;
import X.C0K6U;
import X.C0K6V;
import X.C0K6W;
import X.C0K7C;
import X.C0K7D;
import X.C0K7K;
import X.C0K7M;
import X.C0K7S;
import X.C0KXU;
import X.C0TVI;
import X.C0WZX;
import X.C118300cf;
import X.C14K9;
import X.C15WP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1766560w4U;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20097313kJ;
import X.C2095008Iq;
import X.C2204961BRm;
import X.C417410GYh;
import X.C426930God;
import X.C452501pT;
import X.C457801qK;
import X.C511420K3w;
import X.C511430K3x;
import X.C511990K6b;
import X.C512000K6c;
import X.C512010K6d;
import X.C521940KdU;
import X.C786410Ut5;
import X.EnumC510710K1d;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS6S0500000_7;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPrivilegeDetailFullPage extends PgcBaseFragment implements C0K7M {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmJiHELIOSEtPSY8Jms8OyYlISkpLiojKSIpZykhKSIhLCEnZhY5Kx8hITMlJSo0LQEpPS46JAM5JSMDKSIp";
    public TuxTextView LLILLL;
    public ConstraintLayout LLILZ;
    public ConstraintLayout LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;
    public C197039127h LLIZLLLIL;
    public FrameLayout LLJ;
    public TuxIconView LLJI;
    public TextView LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public C417410GYh LLJILJILJ;
    public C417410GYh LLJILLL;
    public ConstraintLayout LLJJ;
    public C417410GYh LLJJI;
    public C417410GYh LLJJIII;
    public C417410GYh LLJJIJI;
    public int LLJJIJIIJIL;
    public SubscriptionPrivilegeDetailFragment LLJJJJLIIL;
    public C512000K6c LLJJL;
    public PGCGetSubPrivilegeDetailResponse.Data LLJJLIIIJLLLLLLLZ;
    public SubscriptionSceneContext LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 456));
    public int LLJJIJIL = -1;
    public int LLJJJ = -1;
    public String LLJJJIL = "";
    public String LLJJJJ = "";
    public String LLJJJJJIL = "";
    public String LLJL = "";

    @Override // X.C0K7M
    public final void Gs(DataResponse<n> dataResponse) {
    }

    @Override // X.C0K7M
    public final void he(C0K7C c0k7c) {
    }

    public final TuxTextView OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wgl) : null;
            this.LLILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxIconView PR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wk0) : null;
            this.LLJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final void RR() {
        if (Intrinsics.LJFF(this.LLJJJIL, "others_homepage") && this.LLJLILLLLZIIL) {
            Intent intent = new Intent();
            intent.putExtra("subscribe_success", "1");
            C19EG activity = getActivity();
            if (activity != null) {
                C2204961BRm.LLJJIJIL(-1, intent, activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyTj883OIPvjFpOJdiszMyrkSGaaQdQPIi/2Ad6RKUpLNX9LKx2o+ZJnpI1M1Ur0nMNLVT8yhlNoGc8RVj", null));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (Intrinsics.LJFF(C0K4B.LIZ(), this.LLJLIL)) {
            C0K4B.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
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
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIL = -1;
        this.LLJJJ = -1;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long jLongValue;
        long jLongValue2;
        Object c098200Yq;
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(arguments.getString("room_id", CardStruct.IStatusCode.DEFAULT));
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(arguments.getString("anchor_id", CardStruct.IStatusCode.DEFAULT));
        if (lLJIILIIL2 != null) {
            jLongValue2 = lLJIILIIL2.longValue();
        } else {
            jLongValue2 = 0;
        }
        String string = arguments.getString("scenario", "live");
        String str = "";
        if (string == null) {
            string = "";
        }
        boolean zLJFF = Intrinsics.LJFF(arguments.getString("use_new_style", ""), "true");
        String string2 = arguments.getString("log_param", "");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = arguments.getString("extra_log_pb", "");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = arguments.getString("previous_page");
        if (string4 == null) {
            string4 = "";
        }
        Object obj = null;
        try {
            String string5 = arguments.getString("original_url", "");
            if (string5 == null) {
                string5 = "";
            }
            if (string5.length() == 0) {
                c098200Yq = null;
            } else {
                c098200Yq = UriProtector.parse(string5);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Uri uri = (Uri) obj;
        String str2 = this.LLJJJJJIL;
        String str3 = this.LLJJJIL;
        String string6 = arguments.getString("enter_from_merge", "");
        if (string6 == null) {
            string6 = "";
        }
        String string7 = arguments.getString("enter_method", "");
        if (string7 == null) {
            string7 = "";
        }
        String string8 = arguments.getString("request_id", "");
        if (string8 == null) {
            string8 = "";
        }
        String string9 = arguments.getString("video_id", "");
        if (string9 == null) {
            string9 = "";
        }
        if (jLongValue > 0) {
            z = true;
        } else {
            z = false;
        }
        String string10 = arguments.getString("package_id", "");
        if (string10 != null) {
            str = string10;
        }
        SubscriptionSceneContext subscriptionSceneContext = new SubscriptionSceneContext(jLongValue, jLongValue2, str2, string6, string7, str3, string8, string9, z, false, string, zLJFF, str, 0L, 0L, string2, string3, false, string4, uri, 156160);
        this.LLJLIL = subscriptionSceneContext;
        C0K4B.LIZIZ(subscriptionSceneContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    public static Bitmap MR(Context context, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(context.getResources().getDisplayMetrics().densityDpi);
        if (view.getDrawingCacheBackgroundColor() != 0) {
            bitmapCreateBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // X.C0K7M
    public final void oP(C0K7D c0k7d, boolean z) {
        TuxIconView tuxIconViewPR;
        this.LLJJLIIIJLLLLLLLZ = c0k7d.LIZ;
        if (this.LLJJL == null && (tuxIconViewPR = PR()) != null) {
            C0K0R.LIZJ(tuxIconViewPR);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        long j;
        User currentUser;
        String uniqueId;
        String nickname;
        String strLIZIZ;
        com.bytedance.android.live.base.model.user.User user;
        final View viewFindViewById;
        C0KXU c0kxu;
        super.onViewCreated(view, bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
        tuxImmersionBarLIZLLL.LJIIIZ(C426930God.LIZ(R.attr.f8h, getContext()));
        tuxImmersionBarLIZLLL.LIZLLL();
        final View viewFindViewById2 = view.findViewById(R.id.view_title);
        View viewFindViewById3 = null;
        if (viewFindViewById2 != null && (viewFindViewById = view.findViewById(R.id.mg1)) != null) {
            if (this.LLJJIJIL < 0) {
                this.LLJJIJIL = viewFindViewById2.getPaddingTop();
            }
            if (this.LLJJJ < 0) {
                this.LLJJJ = viewFindViewById.getPaddingBottom();
            }
            final int i = this.LLJJIJIL;
            final int i2 = this.LLJJJ;
            viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), i, viewFindViewById2.getPaddingRight(), viewFindViewById2.getPaddingBottom());
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), i2);
            if ((viewFindViewById instanceof C0KXU) && (c0kxu = (C0KXU) viewFindViewById) != null) {
                c0kxu.setEnableFullPageBottomInsetFallback(true);
            }
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0K6X
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C0KXU c0kxu2;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = this.LL;
                    int i3 = c20244914JjLIZ.LIZIZ;
                    subPrivilegeDetailFullPage.getClass();
                    subPrivilegeDetailFullPage.LLJJIJIIJIL = c20244914JjLIZ.LIZLLL;
                    View view3 = viewFindViewById2;
                    view3.setPadding(view3.getPaddingLeft(), i + i3, view3.getPaddingRight(), view3.getPaddingBottom());
                    View view4 = viewFindViewById;
                    view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), i2 + this.LL.LLJJIJIIJIL);
                    View view5 = viewFindViewById;
                    if ((view5 instanceof C0KXU) && (c0kxu2 = (C0KXU) view5) != null) {
                        c0kxu2.e0(this.LL.LLJJIJIIJIL);
                    }
                    return c20246014Ju;
                }
            });
            C20097313kJ.LIZJ(view);
        }
        PrivilegeRepository privilegeRepositoryLIZ = C0K7K.LIZ(this.LLJJJJJIL, this);
        String str = this.LLJJJJJIL;
        SubscriptionSceneContext subscriptionSceneContext = this.LLJLIL;
        if (subscriptionSceneContext == null || (string = Long.valueOf(subscriptionSceneContext.roomId).toString()) == null) {
            string = "";
        }
        SubscriptionSceneContext subscriptionSceneContext2 = this.LLJLIL;
        if (subscriptionSceneContext2 != null) {
            j = subscriptionSceneContext2.liveSubOnlyLiveTier;
        } else {
            j = 0;
        }
        if (a0.LJJJIL(string)) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        C0K6W c0k6w = new C0K6W(j, str, string);
        if (privilegeRepositoryLIZ.LLILZ.get(c0k6w) == null) {
            privilegeRepositoryLIZ.LLILZ.put(c0k6w, C1697810uHb.LJIILJJIL(this));
        } else {
            List<C0K7M> list = privilegeRepositoryLIZ.LLILZ.get(c0k6w);
            if (list != null) {
                list.add(this);
            }
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragmentLIZ = C0K5A.LIZ(this.LLJLIL, this.LLJJJIL, this.LLJJJJ, new LinkedHashMap(), null, EnumC510710K1d.FULL_PAGE, this.LLJJJJJIL, this.LLJL, null, null, null, null, 15872);
        this.LLJJJJLIIL = subscriptionPrivilegeDetailFragmentLIZ;
        subscriptionPrivilegeDetailFragmentLIZ.f(new AwS621S0100000_7(this, 41));
        subscriptionPrivilegeDetailFragmentLIZ.a2(new AwS586S0100000_7(this, 297));
        subscriptionPrivilegeDetailFragmentLIZ.n(new AwS551S0100000_7(this, 457));
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LLJJJJLIIL;
        if (subscriptionPrivilegeDetailFragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.rvw, subscriptionPrivilegeDetailFragment, null);
            c19ehLJIIJ.LJIIL();
        }
        View viewFindViewById4 = this.LLJ;
        if (viewFindViewById4 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById4 = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJ = (FrameLayout) viewFindViewById4;
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById4;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS142S0100000_7(this, 146));
        }
        C457801qK.LIZ(new C521940KdU(((SubscriptionBridgeViewModel) this.LLILLJJLI.getValue()).LL, 6), this, new C0K6U(this, null));
        C457801qK.LIZ(new C521940KdU(((SubscriptionBridgeViewModel) this.LLILLJJLI.getValue()).LL, 1), this, new C0K6V(this, null));
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            currentUser = iUserService.getCurrentUser();
        } else {
            currentUser = null;
        }
        PGCGetSubPrivilegeDetailResponse.Data data = this.LLJJLIIIJLLLLLLLZ;
        if (data == null || (user = data.anchorDetail) == null || (strLIZIZ = C0K7S.LIZ(user)) == null) {
            if (currentUser != null) {
                uniqueId = currentUser.getUniqueId();
                nickname = currentUser.getNickname();
            } else {
                uniqueId = null;
                nickname = null;
            }
            strLIZIZ = C0K7S.LIZIZ(uniqueId, nickname);
            if (a0.LJJJIL(strLIZIZ)) {
                strLIZIZ = C0K7S.LIZJ(C15WP.LJ(currentUser));
            }
        }
        View view3 = this.LLJIJIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.mrn);
            }
            this.LLJIJIL = (TextView) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        TextView textView = (TextView) view3;
        if (textView != null) {
            textView.setText(e3.g + strLIZIZ);
        }
        TuxIconView tuxIconViewPR = PR();
        if (tuxIconViewPR != null) {
            C786410Ut5.a9(tuxIconViewPR, new C511990K6b(this));
        }
        TuxIconView tuxIconViewPR2 = PR();
        if (tuxIconViewPR2 != null) {
            C0K0R.LIZ(tuxIconViewPR2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ffg, viewGroup, false);
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

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0K4P, X.0K6Y] */
    public final void NR(final ConstraintLayout constraintLayout, final Context context, String str, Object obj, C417410GYh c417410GYh, C417410GYh c417410GYh2, C417410GYh c417410GYh3, final int i, final Function1 function1, final Function0 function0) {
        C786410Ut5.LJLLLLLL(0, constraintLayout);
        final C118300cf c118300cf = new C118300cf();
        ?? r3 = new C512010K6d() { // from class: X.0K6Y
            @Override // X.C0K4P
            public final void LJIJJLI() {
                final View view = constraintLayout;
                final C118300cf c118300cf2 = c118300cf;
                final int i2 = i;
                final SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = this;
                final Function0<Unit> function02 = function0;
                final Function1<String, Unit> function12 = function1;
                final Context context2 = context;
                HandlerHook.viewPost(view, new Runnable() { // from class: X.0K6Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SubPrivilegeDetailFullPage@8e7b.generateAndUploadSubLinkShareImg$listener$1$onLoadSuccess$1");
                        try {
                            C118300cf c118300cf3 = c118300cf2;
                            int i3 = c118300cf3.element + 1;
                            c118300cf3.element = i3;
                            int i4 = i2;
                            View view2 = view;
                            SubPrivilegeDetailFullPage subPrivilegeDetailFullPage2 = subPrivilegeDetailFullPage;
                            Function0<Unit> function03 = function02;
                            Function1<String, Unit> function13 = function12;
                            Context context3 = context2;
                            if (i3 == i4) {
                                HandlerHook.viewPost(view2, new ARunnableS6S0500000_7(subPrivilegeDetailFullPage2, view2, function03, function13, context3, 3));
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SubPrivilegeDetailFullPage@8e7b.generateAndUploadSubLinkShareImg$listener$1$onLoadSuccess$1");
                    }
                });
            }

            @Override // X.C0K4P
            public final void LIZIZ(Exception exc) {
                function0.invoke();
            }
        };
        C511430K3x c511430K3x = C511430K3x.LIZ;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        c511430K3x.getClass();
        C511430K3x.LIZIZ(c417410GYh, str, "ttlive_sub_link_share_img_bg.png", scaleType, r3);
        if (c417410GYh3 != null) {
            C511430K3x.LIZIZ(c417410GYh3, str, "ttlive_sub_link_share_tiktok_logo.png", ImageView.ScaleType.CENTER_CROP, r3);
        }
        C511420K3w.LJIIJ.getClass();
        C511420K3w c511420K3w = new C511420K3w();
        c511420K3w.LIZ = obj;
        c511420K3w.LJIIIZ = r3;
        c511420K3w.LIZ(c417410GYh2);
    }
}
