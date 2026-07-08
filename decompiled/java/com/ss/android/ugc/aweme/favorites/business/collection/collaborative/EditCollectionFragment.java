package com.ss.android.ugc.aweme.favorites.business.collection.collaborative;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C098200Yq;
import X.C0BKG;
import X.C0C64;
import X.C0GUG;
import X.C0I7D;
import X.C0LAB;
import X.C0OM1;
import X.C0WZX;
import X.C1110404Vy;
import X.C1171340gaS;
import X.C1171420gaa;
import X.C1171430gab;
import X.C1171750gb7;
import X.C1172570gcR;
import X.C1172600gcU;
import X.C11JF;
import X.C11S5;
import X.C1208770hYp;
import X.C1208860hYy;
import X.C1209040hZG;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C1370970lmR;
import X.C14K9;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C197020126o;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21411818qq;
import X.C2187701Ajg;
import X.C2204961BRm;
import X.C2277711EDh;
import X.C276800At4;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.C814420VxA;
import X.InterfaceC1172550gcP;
import X.InterfaceC1172610gcV;
import X.InterfaceC1355580lNc;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1208850hYx;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS118S0100000_18;
import Y.AfS178S0100000_9;
import Y.AfS179S0100000_10;
import Y.AkS473S0100000_10;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS136S0110000_18;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes19.dex */
public final class EditCollectionFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyogO2svJiHELIOSM/LSY4ICA9ZiYjJSMyKio+KDs6PiBiDCs6PAYjJSM2KzElJiEVOiQrJCo9PA==";
    public TuxSpinner LL;
    public C0I7D LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxNavBar LLILZLL;
    public C1172600gcU LLIZ;
    public C197039127h LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C11JF LLJI;
    public InterfaceC1172550gcP LLJIJIL;
    public View LLJILJIL;
    public C21411818qq LLJILJILJ;
    public View LLJILLL;
    public boolean LLJJ;
    public C0GUG LLJJIII;
    public boolean LLJJIJI;
    public List<CollaborativeUserInfo> LLJJIJIIJIL;
    public List<String> LLJJJ;
    public AwS589S0100000_10 LLJJJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1208850hYx LLJJJJJIL;
    public InterfaceC1355580lNc LLJJJJLIIL;
    public View LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJJI = true;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(133));
    public boolean LLJJJJ = true;
    public final Rect LLJL = new Rect();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC1172550gcP interfaceC1172550gcP;
        View view;
        ViewTreeObserver viewTreeObserver;
        View view2 = this.LLJJL;
        if (view2 != null) {
            C14K9.LJIJJ(view2, null);
        }
        super.onDestroyView();
        InterfaceC1355580lNc interfaceC1355580lNc = this.LLJJJJLIIL;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.release();
        }
        this.LLJJJJLIIL = null;
        ViewTreeObserverOnGlobalLayoutListenerC1208850hYx viewTreeObserverOnGlobalLayoutListenerC1208850hYx = this.LLJJJJJIL;
        if (viewTreeObserverOnGlobalLayoutListenerC1208850hYx != null && (view = getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1208850hYx);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1208850hYx, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        if (!this.LLJJJJ || (interfaceC1172550gcP = this.LLJIJIL) == null) {
            return;
        }
        interfaceC1172550gcP.LIZIZ();
    }

    public final void OR() {
        View view = getView();
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), Math.max(this.LLJJLIIIJLLLLLLLZ - this.LLJL.bottom, 0));
            view.requestLayout();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C11JF c11jf;
        super.onDestroy();
        C11JF c11jf2 = this.LLJI;
        if (c11jf2 == null || c11jf2.isDisposed() || (c11jf = this.LLJI) == null) {
            return;
        }
        c11jf.dispose();
    }

    public final TuxSheet MR(Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment == null || !parentFragment.isAdded() || !(parentFragment instanceof TuxSheet)) {
            return null;
        }
        return (TuxSheet) parentFragment;
    }

    public final void NR(boolean z) {
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(z);
        }
    }

    public final void nG(String str) {
        String string;
        int i;
        List<String> selectedUserList;
        String string2;
        if (!this.LLJJI) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("click_type", str);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (string = arguments.getString("enterFrom")) == null) {
            string = "";
        }
        c0lab.LJ("enter_from", string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("enterType")) != null) {
            str2 = string2;
        }
        c0lab.LJ("enter_type", str2);
        C1172600gcU c1172600gcU = this.LLIZ;
        int i2 = 0;
        if (c1172600gcU != null && c1172600gcU.LLJ) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_new_tag");
        C1172600gcU c1172600gcU2 = this.LLIZ;
        if (c1172600gcU2 != null && (selectedUserList = c1172600gcU2.getSelectedUserList()) != null && selectedUserList.isEmpty()) {
            i2 = 1;
        }
        c0lab.LIZ(i2 ^ 1, "is_choose_friend");
        C20684815ws.LJIILLIIL("ttsocial_create_new_collection_panel_click", c0lab.LIZ);
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
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        boolean z;
        ViewTreeObserver viewTreeObserver;
        Bundle arguments;
        Bundle arguments2;
        String string;
        int i;
        boolean z2;
        String string2;
        String string3;
        int length;
        String string4;
        String string5;
        String string6;
        boolean z3;
        boolean z4;
        C0OM1 c0om1;
        Context context;
        String string7;
        int iIntValue;
        Integer numLIZJ;
        Context context2;
        String string8;
        int iIntValue2;
        Integer numLIZJ2;
        C0GUG c0gug;
        View decorView;
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        Window window2;
        if (((Boolean) C276800At4.LIZ.getValue()).booleanValue()) {
            this.LLJJL = view.getRootView();
            IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
            Context context3 = getContext();
            C19EG activity = getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null) {
                decorView = window2.getDecorView();
            } else {
                decorView = null;
            }
            KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(context3, decorView);
            if (keyboardFakePopupWindowLIZ != null) {
                this.LLJJJJLIIL = keyboardFakePopupWindowLIZ;
                Fragment parentFragment = getParentFragment();
                if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                    window.setSoftInputMode(48);
                }
                keyboardFakePopupWindowLIZ.LLJ = (C1172570gcR) this.LLJLIL.getValue();
                keyboardFakePopupWindowLIZ.show();
            }
            View view2 = this.LLJJL;
            if (view2 != null) {
                C14K9.LJIJJ(view2, new C1209040hZG(this, 1));
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("enableCollectionOptions");
        } else {
            z = true;
        }
        this.LLJJI = z;
        this.LLILZ = (TuxTextView) view.findViewById(R.id.zyp);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.zyo);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.lbx);
        this.LLILLJJLI = (C0I7D) view.findViewById(R.id.hd7);
        this.LLJILJIL = view.findViewById(R.id.e7x);
        this.LLJILJILJ = (C21411818qq) view.findViewById(R.id.rus);
        view.findViewById(R.id.zd0);
        this.LLJILLL = view.findViewById(R.id.e7z);
        this.LLILZLL = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLIZ = (C1172600gcU) view.findViewById(R.id.kz_);
        this.LLIZLLLIL = (C197039127h) view.findViewById(R.id.tzc);
        this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.sxl);
        if (C0BKG.LIZ()) {
            if (view instanceof C0GUG) {
                c0gug = (C0GUG) view;
            } else {
                c0gug = null;
            }
            this.LLJJIII = c0gug;
        }
        this.LL = (TuxSpinner) view.findViewById(R.id.nl1);
        TuxNavBar tuxNavBar = this.LLILZLL;
        String str = "";
        if (tuxNavBar != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null && arguments4.getBoolean("cancelStyle")) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLIZ = C0BKG.LIZ();
            int i2 = R.raw.icon_chevron_left_offset_ltr;
            if (zLIZ) {
                c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                Bundle arguments5 = getArguments();
                if ((arguments5 == null || (string8 = arguments5.getString("title")) == null) && ((context2 = getContext()) == null || (string8 = context2.getString(2131847937)) == null)) {
                    string8 = "";
                }
                c1250250idj.LIZJ = string8;
                c0om1.LIZJ = c1250250idj;
                Context context4 = getContext();
                if (context4 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, context4)) != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                c0om1.LIZJ(iIntValue2);
                if (!z3) {
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
                    c1251150ifB.LIZLLL = true;
                    c1251150ifB.LIZJ(new AwS562S0100000_18(this, 302));
                    c0om1.LJ(c1251150ifB);
                }
                C197020126o c197020126o = new C197020126o();
                c197020126o.LIZJ = true;
                c197020126o.LIZ(new AwS553S0100000_9(this, 127));
                c0om1.LIZIZ(c197020126o);
            } else {
                Bundle arguments6 = getArguments();
                if (arguments6 != null && arguments6.getBoolean("cancelStyle")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c0om1 = new C0OM1();
                AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                if (z4) {
                    i2 = R.raw.icon_x_mark_small;
                }
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = i2;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZJ(new AwS136S0110000_18(this, z4, 0));
                abstractC1250290idnArr[0] = c1251150ifB2;
                c0om1.LJ(abstractC1250290idnArr);
                C1250250idj c1250250idj2 = new C1250250idj();
                Bundle arguments7 = getArguments();
                if ((arguments7 == null || (string7 = arguments7.getString("title")) == null) && ((context = getContext()) == null || (string7 = context.getString(2131847937)) == null)) {
                    string7 = "";
                }
                c1250250idj2.LIZJ = string7;
                c0om1.LIZJ = c1250250idj2;
                Context context5 = getContext();
                if (context5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context5)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c0om1.LIZJ(iIntValue);
            }
            tuxNavBar.setNavActions(c0om1);
        }
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 == null || (string6 = arguments8.getString("btnName")) == null) {
                string6 = "";
            }
            c197039127h.setText(string6);
            C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 22));
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS153S0100000_18(this, 23));
        }
        C0I7D c0i7d = this.LLILLJJLI;
        if (c0i7d != null) {
            c0i7d.addTextChangedListener(new C1208860hYy(this, 0));
        }
        Context context6 = getContext();
        if (context6 != null) {
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_triangle_fill;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1l);
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1l, context6);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context6);
                tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
                tuxTextView.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
            }
            TuxTextView tuxTextView2 = this.LLILZIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
        }
        C0I7D c0i7d2 = this.LLILLJJLI;
        if (c0i7d2 != null) {
            Bundle arguments9 = getArguments();
            if (arguments9 == null || (string5 = arguments9.getString("defaultInput")) == null) {
                string5 = "";
            }
            c0i7d2.setText(string5);
        }
        C0I7D c0i7d3 = this.LLILLJJLI;
        if (c0i7d3 != null) {
            Editable editableLLLLJ = C2204961BRm.LLLLJ(c0i7d3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl2EYAwyyYek258TdiN3FbcEmZZs/0umHZjyGVbihZKXPK9MCW6UISIkchxVikaqw==", null));
            if (editableLLLLJ != null && (string4 = editableLLLLJ.toString()) != null) {
                length = string4.length();
            } else {
                length = 0;
            }
            c0i7d3.setSelection(length);
        }
        boolean z5 = !this.LLJJI;
        C0I7D c0i7d4 = this.LLILLJJLI;
        if (c0i7d4 != null) {
            HandlerHook.viewPostDelay(c0i7d4, new ARunnableS118S0100000_18(this, 15), 200L);
        }
        C21411818qq c21411818qq = this.LLJILJILJ;
        if (c21411818qq != null) {
            C786410Ut5.C7(c21411818qq, new C1208770hYp(this, 1));
        }
        C1172600gcU c1172600gcU = this.LLIZ;
        if (c1172600gcU != null) {
            if (!C1336205Ku.LIZJ().LIZJ() && !C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (C1171750gb7.LIZIZ(z2) && C2277711EDh.LIZIZ.LJFF()) {
                C12ES.LJIILL(0, c1172600gcU);
                c1172600gcU.LLIZ = new InterfaceC1172610gcV() { // from class: X.0gcQ
                    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
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
                    @Override // X.InterfaceC1172610gcV
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ() {
                        /*
                            r4 = this;
                            com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment r0 = r4.LIZ
                            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r0.MR(r0)
                            if (r0 == 0) goto L19
                            android.app.Dialog r0 = r0.getDialog()
                            if (r0 == 0) goto L19
                            android.view.Window r1 = r0.getWindow()
                            if (r1 == 0) goto L19
                            r0 = 48
                            r1.setSoftInputMode(r0)
                        L19:
                            com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment r1 = r4.LIZ
                            java.lang.String r0 = "share_with_friend"
                            r1.nG(r0)
                            X.0LAB r3 = new X.0LAB
                            r3.<init>()
                            com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment r0 = r4.LIZ
                            android.os.Bundle r1 = r0.getArguments()
                            java.lang.String r2 = ""
                            if (r1 == 0) goto L37
                            java.lang.String r0 = "enterFrom"
                            java.lang.String r1 = r1.getString(r0)
                            if (r1 != 0) goto L38
                        L37:
                            r1 = r2
                        L38:
                            java.lang.String r0 = "enter_from"
                            r3.LJ(r0, r1)
                            com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment r0 = r4.LIZ
                            android.os.Bundle r1 = r0.getArguments()
                            if (r1 == 0) goto L4e
                            java.lang.String r0 = "enterType"
                            java.lang.String r0 = r1.getString(r0)
                            if (r0 == 0) goto L4e
                            r2 = r0
                        L4e:
                            java.lang.String r0 = "enter_type"
                            r3.LJ(r0, r2)
                            com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment r0 = r4.LIZ
                            X.0gcU r0 = r0.LLIZ
                            if (r0 == 0) goto L6b
                            boolean r0 = r0.LLJ
                            r1 = 1
                            if (r0 != r1) goto L6b
                        L5e:
                            java.lang.String r0 = "is_new_tag"
                            r3.LIZ(r1, r0)
                            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
                            java.lang.String r0 = "ttsocial_create_new_collection_sharewith_panel_show"
                            X.C20684815ws.LJIILLIIL(r0, r1)
                            return
                        L6b:
                            r1 = 0
                            goto L5e
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1172560gcQ.LIZIZ():void");
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
                    @Override // X.InterfaceC1172610gcV
                    public final void onDismiss() {
                        Dialog dialog2;
                        Window window3;
                        Dialog dialog3;
                        Window window4;
                        if (!((Boolean) C276800At4.LIZ.getValue()).booleanValue()) {
                            EditCollectionFragment editCollectionFragment = this.LIZ;
                            TuxSheet tuxSheetMR = editCollectionFragment.MR(editCollectionFragment);
                            if (tuxSheetMR == null || (dialog2 = tuxSheetMR.getDialog()) == null || (window3 = dialog2.getWindow()) == null) {
                                return;
                            }
                            window3.setSoftInputMode(16);
                            return;
                        }
                        EditCollectionFragment editCollectionFragment2 = this.LIZ;
                        TuxSheet tuxSheetMR2 = editCollectionFragment2.MR(editCollectionFragment2);
                        if (tuxSheetMR2 != null && (dialog3 = tuxSheetMR2.getDialog()) != null && (window4 = dialog3.getWindow()) != null) {
                            window4.setSoftInputMode(48);
                        }
                        EditCollectionFragment editCollectionFragment3 = this.LIZ;
                        C0I7D c0i7d5 = editCollectionFragment3.LLILLJJLI;
                        if (c0i7d5 != null) {
                            HandlerHook.viewPostDelay(c0i7d5, new ARunnableS118S0100000_18(editCollectionFragment3, 16), 200L);
                        }
                    }

                    @Override // X.InterfaceC1172610gcV
                    public final void LIZ(boolean z6) {
                        if (z6) {
                            View view3 = this.LIZ.LLJILLL;
                            if (view3 != null) {
                                C786410Ut5.T4(view3, 0.34f);
                            }
                            EditCollectionFragment editCollectionFragment = this.LIZ;
                            View view4 = editCollectionFragment.LLJILLL;
                            if (view4 != null) {
                                C786410Ut5.I7(new ACListenerS153S0100000_18(editCollectionFragment, 24), view4);
                            }
                            C21411818qq c21411818qq2 = this.LIZ.LLJILJILJ;
                            if (c21411818qq2 != null) {
                                c21411818qq2.setClickable(false);
                                return;
                            }
                            return;
                        }
                        View view5 = this.LIZ.LLJILLL;
                        if (view5 != null) {
                            C786410Ut5.T4(view5, 1.0f);
                        }
                        View view6 = this.LIZ.LLJILLL;
                        if (view6 != null) {
                            C786410Ut5.I7(null, view6);
                        }
                        C21411818qq c21411818qq3 = this.LIZ.LLJILJILJ;
                        if (c21411818qq3 == null) {
                            return;
                        }
                        c21411818qq3.setClickable(true);
                    }
                };
                List<CollaborativeUserInfo> list = this.LLJJIJIIJIL;
                if (list != null) {
                    c1172600gcU.e0(list);
                }
            } else {
                C337180DJs.LIZ(c1172600gcU);
            }
            Bundle arguments10 = getArguments();
            if (arguments10 == null || (string2 = arguments10.getString("enterFrom")) == null) {
                string2 = "";
            }
            c1172600gcU.setEnterFrom(string2);
            Bundle arguments11 = getArguments();
            if (arguments11 != null && (string3 = arguments11.getString("enterType")) != null) {
                str = string3;
            }
            c1172600gcU.setEnterType(str);
        }
        View view3 = this.LLJILJIL;
        if (view3 != null) {
            if (!z5) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        IInternalShareApi.LIZ.getClass();
        c799890VZj.LIZ(C1370970lmR.LIZ().LIZIZ().LJIJ());
        c799890VZj.LIZIZ();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ls_collection_recommend_name", true, false) && (arguments = getArguments()) != null && arguments.getBoolean("isLSContent") && (arguments2 = getArguments()) != null && (string = arguments2.getString("awemeId")) != null) {
            new C1171340gaS().LLILLL.LL.LL.LIZJ(string).LJJIJIIJIL(C1171420gaa.LL).LJJIJIIJI(C1171430gab.LL).LJL(C11S5.LIZ()).LJJJJZI(new AkS473S0100000_10(this, 0)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS179S0100000_10(this, 3), new AfS178S0100000_9(this, 17));
        }
        if (C0BKG.LIZ()) {
            this.LLJJJJJIL = new ViewTreeObserverOnGlobalLayoutListenerC1208850hYx(view, this, 0);
            View view4 = getView();
            if (view4 != null && (viewTreeObserver = view4.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1208850hYx viewTreeObserverOnGlobalLayoutListenerC1208850hYx = this.LLJJJJJIL;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1208850hYx);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1208850hYx, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C0BKG.LIZ()) {
            i = R.layout.c66;
        } else {
            i = R.layout.c65;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
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
