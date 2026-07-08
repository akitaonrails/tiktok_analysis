package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0I27;
import X.C0I28;
import X.C0XQ7;
import X.C1071780dzs;
import X.C1072540e16;
import X.C1073970e3P;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338490DOt;
import X.C338530DOx;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.C987103tV;
import X.EnumC1070410dxf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class FullScreenAuthFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISoiZykhKSHELIOSIhLCEnZig5LyM6OzFiDzo/JBYvOyo2JgQ5PScVOiQrJCo9PA==";
    public LinearLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public C197039127h LLJ;
    public SmartAvatarImageView LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 552));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 553));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 558));
    public final Boolean LLJJI = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJFF();
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FullScreenAuthFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/relation/fragment/muflist/MufListPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FullScreenAuthFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MufListPageViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 554);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(333);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 555), aFwS252S0000000_16, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new AwS560S0100000_16((Fragment) this, 556), aFwS252S0000000_16, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 557), aFwS252S0000000_16, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
    }

    public final C1073970e3P UR() {
        return (C1073970e3P) this.LLJJ.getValue();
    }

    public final MufListPageViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (MufListPageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[PHI: r1
      0x004a: PHI (r1v3 android.view.View) = (r1v2 android.view.View), (r1v10 android.view.View) binds: [B:17:0x0034, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r4 = this;
            super.onResume()
            android.widget.LinearLayout r1 = r4.LLIZ
            r3 = 0
            if (r1 != 0) goto L1a
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L8c
            r0 = 2131368448(0x7f0a1a00, float:1.8356846E38)
            android.view.View r1 = r1.findViewById(r0)
        L15:
            r0 = r1
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.LLIZ = r0
        L1a:
            r2 = 8
            if (r1 == 0) goto L32
            X.0dxf r0 = X.EnumC1070410dxf.CONTACT
            boolean r0 = r0.isGrant()
            if (r0 != 0) goto L89
            java.lang.Boolean r0 = r4.LLJJI
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L89
            r0 = 0
        L2f:
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L32:
            android.widget.LinearLayout r1 = r4.LLIZLLLIL
            if (r1 != 0) goto L4a
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L87
            r0 = 2131372572(0x7f0a2a1c, float:1.836521E38)
            android.view.View r1 = r1.findViewById(r0)
        L43:
            r0 = r1
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.LLIZLLLIL = r0
            if (r1 == 0) goto L5e
        L4a:
            X.0dxf r0 = X.EnumC1070410dxf.FACEBOOK
            boolean r0 = r0.isGrant()
            if (r0 != 0) goto L84
            java.lang.Boolean r0 = r4.LLJJI
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L84
            r0 = 0
        L5b:
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L5e:
            X.127h r1 = r4.LLJ
            if (r1 != 0) goto L75
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L6f
            r0 = 2131376972(0x7f0a3b4c, float:1.8374135E38)
            android.view.View r3 = r1.findViewById(r0)
        L6f:
            r0 = r3
            X.127h r0 = (X.C197039127h) r0
            r4.LLJ = r0
            r1 = r3
        L75:
            java.lang.Boolean r0 = r4.LLJJI
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            if (r0 == 0) goto L80
            r2 = 0
        L80:
            X.C786410Ut5.LJLLLLLL(r2, r1)
            return
        L84:
            r0 = 8
            goto L5b
        L87:
            r1 = r3
            goto L43
        L89:
            r0 = 8
            goto L2f
        L8c:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.muflist.FullScreenAuthFragment.onResume():void");
    }

    public final FindFriendsPageVM SR(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            return (FindFriendsPageVM) new C736950SvV(C13LE.LIZ(FindFriendsPageVM.class), AFwS204S0000000_16.get$arr$(252), new C452070Ho5(), C724750Sbp.LJII(c19egLIZIZ), C1220000hqw.LIZ(c19egLIZIZ), AFwS252S0000000_16.get$arr$(331), new C0I27(c19egLIZIZ), new C0I28(c19egLIZIZ), new C338530DOx(c19egLIZIZ)).getValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void WR(EnumC1070410dxf enumC1070410dxf) {
        C1071780dzs c1071780dzs = C1071780dzs.LIZ;
        String string = enumC1070410dxf.getString();
        c1071780dzs.getClass();
        String strLIZJ = C1071780dzs.LIZJ(string);
        String strLIZLLL = C1071780dzs.LIZLLL(enumC1070410dxf.getString());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", UR().LIZ);
        c2344009Gk.LJIIIIZZ("platform", enumC1070410dxf.getString());
        c2344009Gk.LJIIIIZZ("position", UR().LIZLLL);
        c2344009Gk.LJIIIIZZ("did_status", strLIZJ);
        c2344009Gk.LJIIIIZZ("uid_status", strLIZLLL);
        C20684815ws.LJIILLIIL("authorize_card_click", c2344009Gk.LIZ);
    }

    public final void ZR(EnumC1070410dxf enumC1070410dxf) {
        C1071780dzs c1071780dzs = C1071780dzs.LIZ;
        String string = enumC1070410dxf.getString();
        c1071780dzs.getClass();
        String strLIZJ = C1071780dzs.LIZJ(string);
        String strLIZLLL = C1071780dzs.LIZLLL(enumC1070410dxf.getString());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", UR().LIZ);
        c2344009Gk.LJIIIIZZ("platform", enumC1070410dxf.getString());
        c2344009Gk.LJIIIIZZ("previous_page", UR().LIZJ);
        c2344009Gk.LJIIIIZZ("position", UR().LIZLLL);
        c2344009Gk.LJIIIIZZ("did_status", strLIZJ);
        c2344009Gk.LJIIIIZZ("uid_status", strLIZLLL);
        C20684815ws.LJIILLIIL("authorize_card_show", c2344009Gk.LIZ);
    }

    public final void aS(EnumC1070410dxf enumC1070410dxf) {
        new C1072540e16((String) this.LLJILJILJ.getValue(), UR().LIZIZ, UR().LIZJ, enumC1070410dxf, UR().LIZLLL).LIZLLL(null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS252S0000000_16.get$arr$(332));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        View viewFindViewById = null;
        if (curUser != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(curUser.getAvatarThumb()));
            View viewFindViewById2 = this.LLJI;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.p07);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJI = (SmartAvatarImageView) viewFindViewById2;
            }
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) viewFindViewById2);
            c1331670kl3LJIIIIZZ.LIZLLL("[ffp]");
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        View viewFindViewById3 = this.LLJIJIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.xvt);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJIJIL = (TuxIconView) viewFindViewById3;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1h, context);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        viewFindViewById3.setBackground(c384050F3z.LIZ(context));
        View viewFindViewById4 = this.LLJILJIL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.title);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJILJIL = (TuxTextView) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        String string = textView.getResources().getString(2131834653);
        String string2 = textView.getResources().getString(2131834654);
        int i3 = 0;
        int iLJJJ = a0.LJJJ(string, "%s", 0, false, 6);
        int length = string2.length() + iLJJJ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2}, 1)));
        if (iLJJJ != -1 && iLJJJ <= length) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a0d, textView.getContext())), iLJJJ, length, 33);
        }
        textView.setText(spannableStringBuilder);
        View viewFindViewById5 = this.LLIZ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.eqj);
            } else {
                viewFindViewById5 = null;
            }
            this.LLIZ = (LinearLayout) viewFindViewById5;
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById5;
        EnumC1070410dxf enumC1070410dxf = EnumC1070410dxf.CONTACT;
        if (!enumC1070410dxf.isGrant() && !this.LLJJI.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, linearLayout);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z2.LIZ = C1308910kAL.LIZJ(R.attr.ek, context);
        linearLayout.setBackground(c384050F3z2.LIZ(linearLayout.getContext()));
        C786410Ut5.R7(linearLayout, new ACListenerS119S0200000_16(this, linearLayout, 10));
        if (linearLayout.getVisibility() == 0) {
            ZR(enumC1070410dxf);
        }
        View viewFindViewById6 = this.LLIZLLLIL;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.hr0);
            } else {
                viewFindViewById6 = null;
            }
            this.LLIZLLLIL = (LinearLayout) viewFindViewById6;
        }
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById6;
        EnumC1070410dxf enumC1070410dxf2 = EnumC1070410dxf.FACEBOOK;
        if (!enumC1070410dxf2.isGrant() && !this.LLJJI.booleanValue()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, linearLayout2);
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z3.LIZ = C1308910kAL.LIZJ(R.attr.hx, context);
        linearLayout2.setBackground(c384050F3z3.LIZ(linearLayout2.getContext()));
        C786410Ut5.R7(linearLayout2, new ACListenerS119S0200000_16(this, linearLayout2, 11));
        if (linearLayout2.getVisibility() == 0) {
            ZR(enumC1070410dxf2);
        }
        View view7 = this.LLJ;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById = view8.findViewById(R.id.kyx);
            }
            this.LLJ = (C197039127h) viewFindViewById;
            view7 = viewFindViewById;
        }
        C197039127h c197039127h = (C197039127h) view7;
        c197039127h.setButtonVariant(1);
        c197039127h.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        C786410Ut5.U8(c197039127h, new ACListenerS151S0100000_16(c197039127h, 50));
        if (!(!this.LLJJI.booleanValue())) {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, c197039127h);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_r, viewGroup, false);
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
