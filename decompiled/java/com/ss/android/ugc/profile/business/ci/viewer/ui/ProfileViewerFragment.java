package com.ss.android.ugc.profile.business.ci.viewer.ui;

import X.AbstractC329610Cw3;
import X.C01GW;
import X.C098200Yq;
import X.C0B9E;
import X.C0OM1;
import X.C0P6P;
import X.C1076010e6h;
import X.C1211690hdX;
import X.C1214150hhV;
import X.C1221140hsm;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1261830iwP;
import X.C1308910kAL;
import X.C1386850mC3;
import X.C1386890mC7;
import X.C1386950mCD;
import X.C1619690sFb;
import X.C1685300txQ;
import X.C1720106oR;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1913380ztI;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19M4;
import X.C20277814Wa;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2344009Gk;
import X.C297570BlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C421540Gfw;
import X.C452501pT;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897520ZIw;
import X.C960203pA;
import X.InterfaceC1221630htZ;
import X.InterfaceC1891350zJl;
import X.InterfaceC20660615sy;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnClickListenerC1203580hQS;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import Y.ATListenerS339S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher;
import com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC836760Ws6
public final class ProfileViewerFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1221630htZ, InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9HELIOSKyxiPyY2PyA+Zzo6ZhU+Jik6JCAaICokLTcKOy40JSAiPQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public ViewOnClickListenerC1203580hQS LLIZLLLIL;
    public TuxNavBar LLJ;
    public C1214150hhV LLJI;
    public C1749280vcc LLJIJIL;
    public C19M4 LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS232S0000000_4.get$arr$(105), "enter_from", String.class);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 664));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 663));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1150));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 316));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS548S0100000_4(this, 317));
    public final String LLJJJ = "profile_viewers_page";

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return false;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // X.InterfaceC1221630htZ
    public final C1221140hsm LJIIZILJ() {
        return new C1221140hsm(ZR(), new C0P6P() { // from class: X.0mCE
            @Override // X.C0P6P
            public final void LJJIFFI() {
                ((PowerPageSource) this.LL.WR().LLJJI.getValue()).getOperator().LIZIZ(EnumC323450Cm7.Next);
            }
        });
    }

    public final C1214150hhV SR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bbu) : null;
            this.LLJI = (C1214150hhV) viewFindViewById;
        }
        return (C1214150hhV) viewFindViewById;
    }

    public final ViewOnClickListenerC1203580hQS UR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cfc) : null;
            this.LLIZLLLIL = (ViewOnClickListenerC1203580hQS) viewFindViewById;
        }
        return (ViewOnClickListenerC1203580hQS) viewFindViewById;
    }

    public final C1749280vcc VR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLJIJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final ProfileViewerViewModel WR() {
        return (ProfileViewerViewModel) this.LLJILJILJ.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv ZR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.viewer_list) : null;
            this.LLIZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final void aS() {
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR = ZR();
        if (viewOnAttachStateChangeListenerC20604515jvZR != null) {
            viewOnAttachStateChangeListenerC20604515jvZR.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
            viewOnAttachStateChangeListenerC20604515jvZR.setClipToPadding(false);
        }
    }

    public final boolean bS() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public final void hS() {
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null && frameLayout.getVisibility() == 8) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "profile_visitor_list");
            C20684815ws.LJIILLIIL("profile_views_publish_entry_show", c2344009Gk.LIZ);
        }
        FrameLayout frameLayout2 = this.LLJJIJIIJIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR = ZR();
        if (viewOnAttachStateChangeListenerC20604515jvZR != null) {
            viewOnAttachStateChangeListenerC20604515jvZR.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
            viewOnAttachStateChangeListenerC20604515jvZR.setClipToPadding(false);
        }
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    public final void gS() {
        if (C0B9E.LIZ()) {
            aS();
        }
        C786410Ut5.LLF(8, ZR());
        C1214150hhV c1214150hhVSR = SR();
        if (c1214150hhVSR != null) {
            C786410Ut5.z1(c1214150hhVSR, 8);
        }
        C786410Ut5.LLLZLZ(VR(), 0);
        C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
        if (c1913380ztI.isStandardUIEnable()) {
            c1913380ztI.setStatusView(VR(), "profile_viewer", new AwS565S0100000_21(this, 1151), (Exception) null);
            c1913380ztI.triggerNetworkTips(getActivity(), "profile_viewer", (Exception) null, VR());
        } else {
            VR().setStatus((C1722300uv6) this.LLJJ.getValue());
        }
        iS(false);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        if (context != null) {
            return new C688120Qyw(context, this, null);
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C897520ZIw c897520ZIwWQ2 = WR().wQ2();
        if (c897520ZIwWQ2 != null) {
            c897520ZIwWQ2.destroy();
        }
        ((UpdateProfilePopupLauncher) ServiceManager.get().getService(UpdateProfilePopupLauncher.class)).LIZIZ();
        PopupManager.LIZJ(C1261830iwP.class);
        C1386890mC7.LIZ.getClass();
        C421540Gfw.LIZ(AFwS209S0000000_21.get$arr$(662));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if ((WR().xQ2().getValue() instanceof C1386950mCD) && C297570BlT.LIZLLL() && ZR() != null && ZR().getVisibility() == 0) {
            int size = ((ArrayList) ZR().getState().LJII()).size();
            for (int i = 0; i < size; i++) {
                InterfaceC1891350zJl interfaceC1891350zJlLJI = ZR().getState().LJI(i);
                if (interfaceC1891350zJlLJI instanceof C1386850mC3) {
                    C1386850mC3 c1386850mC3 = (C1386850mC3) interfaceC1891350zJlLJI;
                    String uid = c1386850mC3.LL.user.getUid();
                    if (uid != null && uid.length() != 0) {
                        C1211690hdX c1211690hdX = C1211690hdX.LIZ;
                        User user = c1386850mC3.LL.user;
                        c1211690hdX.getClass();
                        ZR().getState().LJIILJJIL(i, C1386850mC3.LIZ(c1386850mC3, C1211690hdX.LIZ(user), null, 5));
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C897520ZIw c897520ZIwWQ2 = WR().wQ2();
        if (c897520ZIwWQ2 != null) {
            c897520ZIwWQ2.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C897520ZIw c897520ZIwWQ2 = WR().wQ2();
        if (c897520ZIwWQ2 != null) {
            c897520ZIwWQ2.LJII();
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        C20277814Wa.LIZIZ(this);
        int i = C2187451AjH.LIZ;
        C1619690sFb.LIZ(getActivity(), null);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLJJJ;
    }

    public final void cS(Context context) {
        C19M4 c19m4 = this.LLJJIJI;
        if (c19m4 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(99));
            c19m4.setBackground(c384050F3z.LIZ(context));
        }
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            dS(frameLayout, true, false);
        }
    }

    public final void iS(boolean z) {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.y1z);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).LJJ(new AwS34S0010000_21(z, 4), "navbar_end_action");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(AFwS259S0000000_21.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823332);
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 1212));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131845517);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZIZ = "navbar_end_action";
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_gear;
        c1251150ifB2.LIZJ(new AwS556S0100000_12(this, 996));
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.y1z);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(c1251150ifB2);
        c0om1.LIZLLL = true;
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        iS(false);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR = ZR();
        viewOnAttachStateChangeListenerC20604515jvZR.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvZR.LJIILJJIL(ProfileViewerCell.class);
        viewOnAttachStateChangeListenerC20604515jvZR.LJIIL((AbstractC329610Cw3) WR().LLJJI.getValue());
        ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jvZR.getAdapter()).LLLLII(this, InterfaceC1221630htZ.class);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().subscribe(this, new AObserverS224S0100000_21(this, 109));
        C1214150hhV c1214150hhVSR = SR();
        if (c1214150hhVSR != null) {
            ((C197039127h) c1214150hhVSR.LLILLJJLI.findViewById(R.id.csi)).setButtonVariant(1);
        }
        C1214150hhV c1214150hhVSR2 = SR();
        if (c1214150hhVSR2 != null) {
            c1214150hhVSR2.setOnClickNotNowListener(new AwS591S0100000_12(this, 1221));
            c1214150hhVSR2.setOnClickTurnOnListener(new AwS591S0100000_12(this, 1222));
        }
        if (C0B9E.LIZ()) {
            this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.i9d);
            this.LLJJIJI = (C19M4) view.findViewById(R.id.syg);
            if (C960203pA.LIZIZ(view.getContext())) {
                FrameLayout frameLayout = this.LLJJIJIIJIL;
                if (frameLayout != null) {
                    dS(frameLayout, false, true);
                }
            } else {
                FrameLayout frameLayout2 = this.LLJJIJIIJIL;
                if (frameLayout2 != null) {
                    dS(frameLayout2, true, false);
                }
            }
            C19M4 c19m4 = this.LLJJIJI;
            if (c19m4 != null) {
                if (C960203pA.LIZIZ(view.getContext())) {
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int[] iArr = {android.R.attr.state_pressed};
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(99));
                    stateListDrawable.addState(iArr, c384050F3z.LIZ(c19m4.getContext()));
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.c3);
                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(99));
                    stateListDrawable.addState(new int[0], c384050F3z2.LIZ(c19m4.getContext()));
                    c19m4.setBackground(stateListDrawable);
                } else {
                    c19m4.setOnTouchListener(new ATListenerS339S0200000_12(this, c19m4, 3));
                }
                C786410Ut5.c9(c19m4, new ACListenerS155S0100000_21(c19m4, 281));
            }
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("PVFragment", "Enter ProfileViewerFragment");
        ((PowerPageSource) WR().LLJJI.getValue()).getOperator().refresh();
    }

    public static void dS(FrameLayout frameLayout, final boolean z, boolean z2) {
        Integer numLIZJ;
        if (z2) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.c3, frameLayout.getContext());
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.bx, frameLayout.getContext());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, frameLayout.getContext());
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, frameLayout.getContext());
        if (numLIZJ != null && numLIZJ2 != null && numLIZJ3 != null) {
            final int iIntValue = numLIZJ.intValue();
            final int iIntValue2 = numLIZJ2.intValue();
            final int iIntValue3 = numLIZJ3.intValue();
            frameLayout.setBackground(new Drawable(iIntValue, iIntValue2, iIntValue3, z) { // from class: X.0FOx
                public final int LIZ;
                public final int LIZIZ;
                public final int LIZJ;
                public final boolean LIZLLL;
                public final Paint LJ = new Paint();
                public final RectF LJFF = new RectF();

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -2;
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    this.LJ.setStyle(Paint.Style.FILL);
                    this.LJ.setColor(this.LIZ);
                    this.LJFF.set(C418440Gaw.LIZIZ(20), C418440Gaw.LIZIZ(20), getBounds().width() - C418440Gaw.LIZIZ(20), getBounds().height() - C418440Gaw.LIZIZ(34));
                    if (this.LIZLLL) {
                        this.LJ.setShadowLayer(C418440Gaw.LIZIZ(12), 0.0f, C418440Gaw.LIZIZ(3), this.LIZIZ);
                        this.LJ.setShadowLayer(C418440Gaw.LIZIZ(30), 0.0f, C418440Gaw.LIZIZ(12), this.LIZJ);
                    }
                    canvas.drawRoundRect(this.LJFF, C418440Gaw.LIZIZ(99), C418440Gaw.LIZIZ(99), this.LJ);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                    getAlpha();
                }

                {
                    this.LIZ = iIntValue;
                    this.LIZIZ = iIntValue2;
                    this.LIZJ = iIntValue3;
                    this.LIZLLL = z;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ee2, viewGroup, false);
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
