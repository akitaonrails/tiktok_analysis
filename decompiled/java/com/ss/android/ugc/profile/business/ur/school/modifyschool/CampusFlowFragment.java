package com.ss.android.ugc.profile.business.ur.school.modifyschool;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0DPW;
import X.C0DPX;
import X.C0QSJ;
import X.C0XQ7;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C1246150iX7;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389600mGU;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C1900180zY0;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1A6V;
import X.C2217381BqS;
import X.C337850DMh;
import X.C338490DOt;
import X.C338590DPd;
import X.C338650DPj;
import X.C426750GoL;
import X.C444960Hcc;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.EnumC1231460i9Q;
import X.EnumC337830DMf;
import X.EnumC337870DMj;
import X.EnumC338580DPc;
import X.EnumC338600DPe;
import X.EnumC338610DPf;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CampusFlowFragment extends GlobalHookDialogFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiHELIOSOiw7JyogZyI8LCwqMDwwICojJWEQKSg8PDwVJCo7Dz0yLygpJzs=";
    public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2235));
    public final AssemVMLazy LLILLJJLI;
    public final Map<EnumC337870DMj, View> LLILLL;
    public EnumC337870DMj LLILZ;
    public final Set<EnumC337870DMj> LLILZIL;
    public Integer LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CampusFlowFragment.class, "campusFlowVM", "getCampusFlowVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampusFlowScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampusFlowScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampusFlowScope.class);
        return arrayList;
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

    public CampusFlowFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 350);
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(117);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 351), aFwS232S0000000_4, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new AwS548S0100000_4((Fragment) this, 352), aFwS232S0000000_4, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 353), aFwS232S0000000_4, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = new LinkedHashMap();
        this.LLILZIL = new LinkedHashSet();
        this.LLJ = true;
        C1245840iWc.LIZ.getClass();
        this.LLJI = C1245840iWc.LIZ();
        this.LLJIJIL = C1245840iWc.LIZIZ();
    }

    public final CampusFlowViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (CampusFlowViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Dialog dialog;
        Window window;
        View currentFocus;
        InputMethodManager inputMethodManager;
        super.onPause();
        Context context = getContext();
        if (context == null || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null) {
            return;
        }
        Object objH2 = C786410Ut5.H2(context, "input_method");
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
        currentFocus.clearFocus();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LJ(R.attr.bx);
        tuxImmersionBarLIZJ.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZJ.LIZ(true);
        tuxImmersionBarLIZJ.LIZLLL();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            if (this.LLILZLL == null) {
                this.LLILZLL = Integer.valueOf(window2.getStatusBarColor());
            }
            if (this.LLIZ == null) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                this.LLIZ = attributes != null ? Integer.valueOf(attributes.flags) : null;
            }
            if (this.LLIZLLLIL == null) {
                this.LLIZLLLIL = Integer.valueOf(window2.getDecorView().getSystemUiVisibility());
            }
        }
        if (this.LLJ) {
            this.LLJ = false;
            EnumC337870DMj enumC337870DMj = this.LLILZ;
            if (enumC337870DMj != null) {
                MR(enumC337870DMj);
            }
        } else {
            EnumC337870DMj enumC337870DMj2 = (EnumC337870DMj) C13LP.LJJLIIIJL(NR().getState().LLILLJJLI);
            if (enumC337870DMj2 != null) {
                MR(enumC337870DMj2);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void MR(EnumC337870DMj enumC337870DMj) {
        Window window;
        Window window2;
        boolean z;
        if (enumC337870DMj == EnumC337870DMj.FIND_SCHOOL_FRIENDS) {
            View view = getView();
            if (view != null) {
                view.setFitsSystemWindows(false);
            }
            Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.clearFlags(67108864);
                window2.addFlags(Integer.MIN_VALUE);
                window2.setStatusBarColor(0);
                window2.getDecorView().setSystemUiVisibility(1280);
                Context context = window2.getContext();
                if (context != null && C960203pA.LIZIZ(context)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = true ^ z;
                C1A6V c1a6v = new C1A6V(window2, window2.getDecorView());
                c1a6v.LIZJ(z2);
                c1a6v.LIZIZ(z2);
                View view2 = getView();
                if (view2 != null) {
                    C426750GoL.LJIIL(view2, 0, 0, 0, 0, 16);
                    return;
                }
                return;
            }
            return;
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setFitsSystemWindows(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        Integer num = this.LLIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            window.setFlags(iIntValue, iIntValue);
        }
        Integer num2 = this.LLIZLLLIL;
        if (num2 != null) {
            window.getDecorView().setSystemUiVisibility(num2.intValue());
        }
        Integer num3 = this.LLILZLL;
        if (num3 == null) {
            return;
        }
        window.setStatusBarColor(num3.intValue());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        Window window;
        Window window2;
        super.onCreate(bundle);
        if (C444960Hcc.LIZIZ()) {
            i = R.style.af3;
        } else {
            i = R.style.af2;
        }
        setStyle(1, i);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setSoftInputMode(16);
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        View decorView2;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(20);
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
            decorView2.setTag("saf_skip_auto_dismiss");
        }
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.08qD
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 1) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C2240608qC(this.LL, null), 3);
                    return true;
                }
                return false;
            }
        });
        Window window3 = dialogOnCreateDialog.getWindow();
        if (window3 != null && (decorView = window3.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String dataString;
        Intent intent;
        boolean z2;
        EnumC338580DPc enumC338580DPc;
        Serializable serializable;
        EnumC338600DPe enumC338600DPe;
        EnumC338610DPf enumC338610DPf;
        String string;
        Serializable serializable2;
        C1245860iWe c1245860iWe;
        Serializable serializable3;
        SchoolMutualStruct schoolMutualStruct;
        EnumC337830DMf enumC337830DMf;
        EnumC337870DMj enumC337870DMj;
        Serializable serializable4;
        super.onViewCreated(view, bundle);
        if (((UserCampusService) this.LL.getValue()).LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) != null) {
            z = true;
        } else {
            z = false;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (dataString = arguments.getString("CampusFlowFragmentInputRoute")) == null) {
            C19EG activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                dataString = intent.getDataString();
            } else {
                dataString = null;
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("skip_fsfp")) {
            z2 = true;
        } else {
            z2 = false;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.containsKey("CampusFlowFragmentInputLandingPage")) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                serializable4 = arguments4.getSerializable("CampusFlowFragmentInputLandingPage");
            } else {
                serializable4 = null;
            }
            if (!(serializable4 instanceof EnumC338580DPc) || (enumC338580DPc = (EnumC338580DPc) serializable4) == null) {
                throw new IllegalArgumentException("Unrecognized landing page");
            }
        } else if (Intrinsics.LJFF(dataString, "aweme://user/school/edit")) {
            enumC338580DPc = EnumC338580DPc.EDIT_SCHOOL;
        } else if (Intrinsics.LJFF(dataString, "aweme://school/find_friends")) {
            C1246150iX7.LIZ.getClass();
            if (!C1246150iX7.LIZ().disableFindSchoolFriends) {
                enumC338580DPc = EnumC338580DPc.FIND_SCHOOL_FRIENDS;
            } else {
                throw new IllegalArgumentException("NavigationUrl is find school friends but user not in experiment.");
            }
        } else {
            throw new IllegalArgumentException("The landing page must be passed into ModifySchoolFragment");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            serializable = arguments5.getSerializable("CampusFlowFragmentLandingTab");
        } else {
            serializable = null;
        }
        if (serializable instanceof EnumC338600DPe) {
            enumC338600DPe = (EnumC338600DPe) serializable;
        } else {
            enumC338600DPe = null;
        }
        if (enumC338600DPe != null && enumC338580DPc == EnumC338580DPc.FIND_SCHOOL_FRIENDS) {
            int i = C338590DPd.LIZ[enumC338600DPe.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC338610DPf = EnumC338610DPf.GROUP;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC338610DPf = EnumC338610DPf.USER;
                }
            } else {
                enumC338610DPf = EnumC338610DPf.POST;
            }
        } else {
            enumC338610DPf = null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            string = arguments6.getString("CampusFlowFragmentInsertAwemeId");
        } else {
            string = null;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null && arguments7.containsKey("CampusFlowFragmentInputEnterFrom")) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                serializable2 = arguments8.getSerializable("CampusFlowFragmentInputEnterFrom");
            } else {
                serializable2 = null;
            }
            if ((serializable2 instanceof C1245860iWe) && (c1245860iWe = (C1245860iWe) serializable2) != null) {
                C338650DPj c338650DPj = C338650DPj.LIZ;
                Context contextRequireContext = requireContext();
                EnumC1231460i9Q enumC1231460i9Q = c1245860iWe.internalEnterFrom;
                c338650DPj.getClass();
                if (C338650DPj.LIZJ(enumC1231460i9Q)) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C338650DPj.LIZ(contextRequireContext));
                    c1331670kl3LJIIIZ.LIZLLL("CampusRevisitPopup");
                    c1331670kl3LJIIIZ.LJJIJL(C786410Ut5.N3(contextRequireContext));
                    c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                    c1331670kl3LJIIIZ.LJJIII();
                }
                Bundle arguments9 = getArguments();
                if (arguments9 != null) {
                    serializable3 = arguments9.getSerializable("CampusFlowFragmentInputSchoolMutualStruct");
                } else {
                    serializable3 = null;
                }
                if (serializable3 instanceof SchoolMutualStruct) {
                    schoolMutualStruct = (SchoolMutualStruct) serializable3;
                    if (schoolMutualStruct != null) {
                        enumC337830DMf = EnumC337830DMf.EDIT_SCHOOL_FLOW;
                        enumC337870DMj = EnumC337870DMj.FIND_SCHOOL_FRIENDS;
                    }
                    this.LLILZ = enumC337870DMj;
                    C723850SaN.LIZ(this, false, null, new C0DPX(this, enumC337870DMj, enumC337830DMf, c1245860iWe, z2, enumC338610DPf, string, schoolMutualStruct), 3);
                    C1900180zY0 c1900180zY0 = C1900180zY0.LL;
                    C736680Sv4.LJIIIIZZ(c1900180zY0, NR(), new C2217381BqS() { // from class: X.0DN5
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C337920DMo) obj).LLILLJJLI;
                        }
                    }, null, new C0DPW(this), 6);
                    C736680Sv4.LJIIIIZZ(c1900180zY0, NR(), new C2217381BqS() { // from class: X.0DN6
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C337920DMo) obj).LLJ;
                        }
                    }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 37), 4);
                    C736680Sv4.LJIIIIZZ(c1900180zY0, NR(), new C2217381BqS() { // from class: X.0DN7
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C337920DMo) obj).LLJIJIL;
                        }
                    }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 38), 4);
                    C736680Sv4.LJIIIIZZ(c1900180zY0, NR(), new C2217381BqS() { // from class: X.0DPZ
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C337920DMo) obj).LLJI;
                        }
                    }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 39), 4);
                    return;
                }
                schoolMutualStruct = null;
                C337850DMh c337850DMh = EnumC337830DMf.Companion;
                C1246150iX7.LIZ.getClass();
                boolean z3 = !C1246150iX7.LIZ().disableFindSchoolFriends;
                c337850DMh.getClass();
                if (z) {
                    if (z3) {
                        enumC337830DMf = EnumC337830DMf.EDIT_SCHOOL_FLOW;
                    } else {
                        enumC337830DMf = EnumC337830DMf.EDIT_SCHOOL_CANNOT_FIND_FRIENDS_FLOW;
                    }
                    int i2 = C338590DPd.LIZIZ[enumC338580DPc.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            enumC337870DMj = EnumC337870DMj.FIND_SCHOOL_FRIENDS;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        enumC337870DMj = EnumC337870DMj.EDIT_CAMPUS;
                    }
                } else {
                    if (z3 && !z2) {
                        C1245840iWc.LIZ.getClass();
                        if (C1245840iWc.LIZIZ()) {
                            enumC337830DMf = EnumC337830DMf.ADD_SCHOOL_SIMPLIFIED_FLOW;
                        } else {
                            enumC337830DMf = EnumC337830DMf.ADD_SCHOOL_FLOW;
                        }
                    } else {
                        C1245840iWc.LIZ.getClass();
                        if (C1245840iWc.LIZIZ()) {
                            enumC337830DMf = EnumC337830DMf.ADD_SCHOOL_SIMPLIFIED_FLOW_CANNOT_FIND_FRIENDS_FLOW;
                        } else {
                            enumC337830DMf = EnumC337830DMf.ADD_SCHOOL_CANNOT_FIND_FRIENDS_FLOW;
                        }
                    }
                    if (this.LLJIJIL) {
                        enumC337870DMj = EnumC337870DMj.ENTER_EMAIL;
                    } else {
                        enumC337870DMj = EnumC337870DMj.SELECT_SCHOOL;
                    }
                }
                this.LLILZ = enumC337870DMj;
                C723850SaN.LIZ(this, false, null, new C0DPX(this, enumC337870DMj, enumC337830DMf, c1245860iWe, z2, enumC338610DPf, string, schoolMutualStruct), 3);
                C1900180zY0 c1900180zY02 = C1900180zY0.LL;
                C736680Sv4.LJIIIIZZ(c1900180zY02, NR(), new C2217381BqS() { // from class: X.0DN5
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C337920DMo) obj).LLILLJJLI;
                    }
                }, null, new C0DPW(this), 6);
                C736680Sv4.LJIIIIZZ(c1900180zY02, NR(), new C2217381BqS() { // from class: X.0DN6
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C337920DMo) obj).LLJ;
                    }
                }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 37), 4);
                C736680Sv4.LJIIIIZZ(c1900180zY02, NR(), new C2217381BqS() { // from class: X.0DN7
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C337920DMo) obj).LLJIJIL;
                    }
                }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 38), 4);
                C736680Sv4.LJIIIIZZ(c1900180zY02, NR(), new C2217381BqS() { // from class: X.0DPZ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C337920DMo) obj).LLJI;
                    }
                }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 39), 4);
                return;
            }
            throw new IllegalArgumentException("Unrecognized enter from");
        }
        throw new IllegalArgumentException("The enter from param must be passed into ModifySchoolFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, contextRequireContext);
        if (numLIZJ != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        for (EnumC337870DMj enumC337870DMj : EnumC337870DMj.values()) {
            Map<EnumC337870DMj, View> map = this.LLILLL;
            FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
            frameLayout2.setId(View.generateViewId());
            C786410Ut5.LJLLLLLL(4, frameLayout2);
            frameLayout.addView(frameLayout2);
            map.put(enumC337870DMj, frameLayout2);
        }
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
