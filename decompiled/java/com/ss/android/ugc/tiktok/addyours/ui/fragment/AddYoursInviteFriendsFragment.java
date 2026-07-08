package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0QSJ;
import X.C1250250idj;
import X.C1308910kAL;
import X.C1389340mG4;
import X.C13LE;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749260vca;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C1935107i1;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C343910De1;
import X.C343930De3;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C618720OOo;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C730000SkI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC1058150ddt;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC330080Cwo;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AddYoursInviteFriendsFragment extends BaseFragment implements InterfaceC344240DeY, InterfaceC1058150ddt, C0QSJ, InterfaceC1146704e9 {
    public static final C343910De1 LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static InterfaceC1631620sYq<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LLJJJJJIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2stLSsqJzA+OmEmIWsqHELIOSOy40JSAiPWESLCEVJjohOwwiPyYnLQM+ICo9LDYKOy40JSAiPQ==";
    public C197039127h LLIZ;
    public View LLIZLLLIL;
    public C1749260vca LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public C1749280vcc LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public InterfaceC330080Cwo LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0De1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursInviteFriendsFragment.class, "inviteVM", "getInviteVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursInviteFriendsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AddYoursInviteFriendsFragment.class, "recommendVM", "getRecommendVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/UserRecommendListViewModel;", 0)};
        LLJJJIL = new Object() { // from class: X.0De1
        };
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{AddYoursInviteScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursInviteScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursInviteScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public AddYoursInviteFriendsFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        int i;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursInviteFriendsViewModel.class);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 403);
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(152);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 404), aFwS232S0000000_4, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new AwS548S0100000_4((Fragment) this, 405), aFwS232S0000000_4, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 406), aFwS232S0000000_4, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(UserRecommendListViewModel.class);
        AwS548S0100000_4 awS548S0100000_42 = new AwS548S0100000_4(c19719912DlLIZ2, 407);
        AFwS232S0000000_4 aFwS232S0000000_42 = AFwS232S0000000_4.get$arr$(153);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS548S0100000_42, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 408), aFwS232S0000000_42, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            i = 1;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS548S0100000_42, new AwS548S0100000_4((Fragment) this, 409), aFwS232S0000000_42, null, null, null);
            i = 1;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            i = 1;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS548S0100000_42, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 402), aFwS232S0000000_42, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy2;
        this.LLJJIII = C1935107i1.LIZ(new AwS548S0100000_4(this, 401));
        this.LLJJIJI = C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == i;
        this.LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1389340mG4.LIZLLL())));
        this.LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131825080);
        c0om1.LIZJ = c1250250idj;
        return c0om1;
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
        this.LLJILJILJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C730000SkI.LIZIZ.LIZJ(249372162, 3);
    }

    public static final void UR(View view) {
        Context context;
        Integer numLIZJ;
        if (view != null && (context = view.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
    }

    public final void SR(float f) {
        int iLIZIZ;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (getView() == null) {
            return;
        }
        if (this.LLJJIJI) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            iLIZIZ = (int) (((double) this.LLJJIJIL) + (((double) this.LLJJIJIIJIL) * 0.16000000000000003d * ((double) (1 - f))));
        }
        View viewFindViewById = this.LLIZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.cra);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (C197039127h) viewFindViewById;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        if (i != iLIZIZ) {
            View viewFindViewById3 = this.LLIZ;
            if (viewFindViewById3 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.cra);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLIZ = (C197039127h) viewFindViewById3;
            }
            C426750GoL.LJIIIZ(viewFindViewById3, null, null, null, Integer.valueOf(iLIZIZ), false, 23);
        }
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.crc);
            }
            this.LLIZLLLIL = viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C618720OOo.LIZIZ(view3, -1, iLIZIZ + this.LLJJJ);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1389340mG4.LIZLLL())));
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Map<String, ? extends Object> map;
        Serializable serializable;
        InterfaceC330080Cwo interfaceC330080Cwo;
        super.onCreate(bundle);
        if (this.LLJILLL == null) {
            if (bundle != null) {
                serializable = bundle.getSerializable("ay_invite_behavior");
            } else {
                serializable = null;
            }
            if (serializable instanceof InterfaceC330080Cwo) {
                interfaceC330080Cwo = (InterfaceC330080Cwo) serializable;
            } else {
                interfaceC330080Cwo = null;
            }
            this.LLJILLL = interfaceC330080Cwo;
        }
        InterfaceC330080Cwo interfaceC330080Cwo2 = this.LLJILLL;
        if (interfaceC330080Cwo2 != null) {
            C343930De3 c343930De3 = (C343930De3) this.LLJJIII.getValue();
            if (c343930De3 != null && (map = c343930De3.extras) != null) {
                interfaceC330080Cwo2.initExtra(map);
            }
            interfaceC330080Cwo2.initScope(C1558360qeg.LJFF(this, null));
        }
        InterfaceC330080Cwo interfaceC330080Cwo3 = this.LLJILLL;
        if (interfaceC330080Cwo3 != null) {
            interfaceC330080Cwo3.mobEnter(getContext(), C1558360qeg.LJFF(this, null));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJIZ(bundle, "ay_invite_behavior", this.LLJILLL);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        SR(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object VR(java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment.VR(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[PHI: r1
      0x0045: PHI (r1v4 android.view.View) = (r1v3 android.view.View), (r1v28 android.view.View) binds: [B:7:0x002f, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            super.onViewCreated(r5, r6)
            X.0SkI r2 = X.C730000SkI.LIZIZ
            r1 = 249372162(0xedd1e02, float:5.4509603E-30)
            r0 = 2
            r2.LIZJ(r1, r0)
            kotlin.jvm.internal.AwS370S0200000_4 r3 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 44
            r3.<init>(r4, r5, r0)
            r1 = 3
            r0 = 0
            r2 = 0
            X.C723850SaN.LIZ(r4, r0, r2, r3, r1)
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto Lba
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto Lba
            android.view.View r0 = r4.getView()
            UR(r0)
            X.0vca r1 = r4.LLJ
            if (r1 != 0) goto L45
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto Lc5
            r0 = 2131389598(0x7f0a6c9e, float:1.8399744E38)
            android.view.View r1 = r1.findViewById(r0)
        L3e:
            r0 = r1
            X.0vca r0 = (X.C1749260vca) r0
            r4.LLJ = r0
            if (r1 == 0) goto L51
        L45:
            r0 = 2131389601(0x7f0a6ca1, float:1.839975E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L51
            UR(r0)
        L51:
            X.15jv r1 = r4.LLJI
            if (r1 != 0) goto L67
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto Lc3
            r0 = 2131379483(0x7f0a451b, float:1.8379228E38)
            android.view.View r1 = r1.findViewById(r0)
        L62:
            r0 = r1
            X.15jv r0 = (X.ViewOnAttachStateChangeListenerC20604515jv) r0
            r4.LLJI = r0
        L67:
            android.view.View r1 = (android.view.View) r1
            UR(r1)
            X.15jv r1 = r4.LLJIJIL
            if (r1 != 0) goto L82
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto Lc1
            r0 = 2131379484(0x7f0a451c, float:1.837923E38)
            android.view.View r1 = r1.findViewById(r0)
        L7d:
            r0 = r1
            X.15jv r0 = (X.ViewOnAttachStateChangeListenerC20604515jv) r0
            r4.LLJIJIL = r0
        L82:
            android.view.View r1 = (android.view.View) r1
            UR(r1)
            X.0vcc r1 = r4.LLJILJIL
            if (r1 != 0) goto L9d
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto Lbf
            r0 = 2131387715(0x7f0a6543, float:1.8395924E38)
            android.view.View r1 = r1.findViewById(r0)
        L98:
            r0 = r1
            X.0vcc r0 = (X.C1749280vcc) r0
            r4.LLJILJIL = r0
        L9d:
            UR(r1)
            X.0vcc r0 = r4.LLJILJILJ
            if (r0 != 0) goto Lb7
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto Lb1
            r0 = 2131389911(0x7f0a6dd7, float:1.8400378E38)
            android.view.View r2 = r1.findViewById(r0)
        Lb1:
            r0 = r2
            X.0vcc r0 = (X.C1749280vcc) r0
            r4.LLJILJILJ = r0
            r0 = r2
        Lb7:
            UR(r0)
        Lba:
            r0 = 0
            r4.SR(r0)
            return
        Lbf:
            r1 = r2
            goto L98
        Lc1:
            r1 = r2
            goto L7d
        Lc3:
            r1 = r2
            goto L62
        Lc5:
            r1 = r2
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.m4, viewGroup, false);
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
