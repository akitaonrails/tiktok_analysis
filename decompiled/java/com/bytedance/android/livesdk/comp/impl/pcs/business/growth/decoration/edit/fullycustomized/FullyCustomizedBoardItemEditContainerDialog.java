package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C01Q4;
import X.C01Q5;
import X.C01Q6;
import X.C03H5;
import X.C0IJT;
import X.C0JDJ;
import X.C0QSJ;
import X.C0TVI;
import X.C0U4R;
import X.C0ZP4;
import X.C1148404eQ;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1439605kI;
import X.C14K9;
import X.C1622206Wu;
import X.C1770850wBP;
import X.C1817530xOh;
import X.C1817700xOy;
import X.C1817710xOz;
import X.C1817720xP0;
import X.C1817740xP2;
import X.C1817750xP3;
import X.C1817760xP4;
import X.C1817770xP5;
import X.C1817780xP6;
import X.C1817790xP7;
import X.C1817800xP8;
import X.C1817810xP9;
import X.C1817820xPA;
import X.C1817850xPD;
import X.C1817860xPE;
import X.C1817870xPF;
import X.C1817880xPG;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C230700un;
import X.C230800uo;
import X.C230900up;
import X.C330001Pu;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C465220IMe;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C758440Tp4;
import X.C764830TzN;
import X.C766270U4b;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1814530xJr;
import X.InterfaceC1818210xPn;
import X.InterfaceC19323110ij;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.BoardSaveEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class FullyCustomizedBoardItemEditContainerDialog extends LiveDialogFragment implements InterfaceC724530SbT, C0JDJ, InterfaceC19323110ij, InterfaceC1818210xPn, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C330001Pu LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0Oio7PSd9LCAvJj0yPCHELIOSwjJ2E2LCw4ZykmJCk1KjogPCohIDU2LGsKPCM/MQY5Ojs8JSw2LCsRJyQ+LQYnLSgJLSYnCyoiPS46JiA+DSYyJCor";
    public int LLILLL;
    public boolean LLILZIL;
    public BoardItem LLILZLL;
    public boolean LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public InterfaceC1818210xPn LLJJ;
    public final FullyCustomizedBoardItemEditContainerDialog LL = this;
    public final InterfaceC1814530xJr LLILLJJLI = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
    public String LLILZ = "live_take_page";
    public String LLIZ = "";

    /* JADX WARN: Type inference failed for: r0v7, types: [X.01Pu] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FullyCustomizedBoardItemEditContainerDialog.class, "customizedBoardTitleDoneViewModel", "getCustomizedBoardTitleDoneViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/title/CustomizedBoardTitleDoneViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(FullyCustomizedBoardItemEditContainerDialog.class, "editPageViewModel", "getEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0), new C2217381BqS(FullyCustomizedBoardItemEditContainerDialog.class, "customizedBoardEditFragmentViewModel", "getCustomizedBoardEditFragmentViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/CustomizedBoardEditFragmentViewModel;", 0)};
        LLJJI = new Object() { // from class: X.01Pu
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1818210xPn.class) {
            this.LLJJ = (InterfaceC1818210xPn) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CustomizedBoardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1818210xPn.class) {
            return this.LLJJ;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CustomizedBoardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CustomizedBoardScope.class);
        return arrayList;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        MR(false);
        return super.onBackPressed();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1818210xPn.class) {
            this.LLJJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public FullyCustomizedBoardItemEditContainerDialog() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        AssemVMLazy assemVMLazy3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CustomizedBoardTitleDoneViewModel.class);
        C01Q5 c01q5 = new C01Q5(c19719912DlLIZ);
        C1817850xPD c1817850xPD = new C1817850xPD();
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01q5, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1817780xP6(this), c1817850xPD, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01q5, new C1817790xP7(this), c1817850xPD, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01q5, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1817800xP8(this), c1817850xPD, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        C01Q6 c01q6 = new C01Q6(c19719912DlLIZ2);
        C1817870xPF c1817870xPF = new C1817870xPF();
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01q6, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new C1817810xP9(this), c1817870xPF, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
            z3 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01q6, new C1817820xPA(this), c1817870xPF, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01q6, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1817740xP2(this), c1817870xPF, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CustomizedBoardEditFragmentViewModel.class);
        C01Q4 c01q4 = new C01Q4(c19719912DlLIZ3);
        C1817860xPE c1817860xPE = new C1817860xPE();
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01q4, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new C1817750xP3(this), c1817860xPE, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01q4, new C1817760xP4(this), c1817860xPE, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01q4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1817770xP5(this), c1817860xPE, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLJILJILJ = assemVMLazy3;
        this.LLJILLL = C452501pT.LIZIZ(new C1817530xOh(this));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g0p);
        c500980Jkm.LIZJ = R.style.ahl;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = this.LLILZIL ? 5 : 3;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJFF = false;
        return c500980Jkm;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LLIZLLLIL) {
            return;
        }
        MR(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        assemVMLazy.getValue().setState(new C230800uo());
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setWindowAnimations(R.style.ahj);
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r9.add(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(boolean r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.FullyCustomizedBoardItemEditContainerDialog.MR(boolean):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CustomizedBoardScope.class}).unbindAbility(this.LL, InterfaceC1818210xPn.class);
    }

    @Override // X.InterfaceC1818210xPn
    public final void jq(C1817880xPG c1817880xPG) {
        C0U4R c0u4r = new C0U4R();
        c0u4r.LIZ = getContext();
        c0u4r.LIZIZ = c1817880xPG.LIZ;
        c0u4r.LIZJ = c1817880xPG.LIZIZ;
        c0u4r.LJII = this.LL.dataChannel;
        c0u4r.LJFF = true;
        C766270U4b.LJIIJ(c0u4r);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C687700QyG.LJI(this);
        int i = this.LLILLL;
        if (i != 4) {
            if (i != 5) {
                if (i != 7) {
                    return;
                }
            } else {
                this.LLIZ = " ";
                return;
            }
        }
        String strLJIJI = C758440Tp4.LIZJ;
        if (strLJIJI == null) {
            strLJIJI = C497740JfY.LJIJI(2131851168);
        }
        this.LLIZ = strLJIJI;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        assemVMLazy.getValue().setState(new C230900up());
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CustomizedBoardScope.class}).bindAbility(this.LL, InterfaceC1818210xPn.class);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Class cls;
        C19719912Dl c19719912DlLIZ;
        String str;
        Window window;
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            final int paddingTop = view.getPaddingTop();
            final int paddingBottom = view.getPaddingBottom();
            final int paddingStart = view.getPaddingStart();
            final int paddingEnd = view.getPaddingEnd();
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0xRF
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(paddingStart + c20244914JjLIZ.LIZ, paddingTop, paddingEnd + c20244914JjLIZ.LIZJ, paddingBottom + c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        BoardItem boardItem = this.LLILZLL;
        if (boardItem == null) {
            boardItem = new BoardItem();
        }
        int i = boardItem.boardItemType;
        int i2 = 1;
        if (i == 8) {
            c19719912DlLIZ = C13LE.LIZ(OverlayImageEditorAssem.class);
        } else {
            if (i == 5 && boardItem.editorMode == 1) {
                cls = MinimalRichTextEditorAssem.class;
            } else {
                cls = FullyCustomizedBoardItemEditAssem.class;
            }
            c19719912DlLIZ = C13LE.LIZ(cls);
        }
        C723850SaN.LIZ(this, false, null, new C1148404eQ(this, boardItem, c19719912DlLIZ), 3);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C764830TzN c764830TzN = new C764830TzN();
            c764830TzN.LIZ = this;
            c764830TzN.LIZIZ = view;
            c764830TzN.LIZJ = window;
            c764830TzN.LJ = C20736316Cj.LIZIZ(R.attr.c5n, window.getContext());
            c764830TzN.LIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BoardSaveEvent.class, new C1817720xP0(this));
        }
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xPB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1817990xPR) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C1439605kI(this), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.0xPC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1817990xPR) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new C1817710xOz(this), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJIJIL.getValue(), new C2217381BqS() { // from class: X.0xP1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159360gH8) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1817700xOy(this), 4);
        FullyCustomizedBoardEditPageViewModel fullyCustomizedBoardEditPageViewModel = (FullyCustomizedBoardEditPageViewModel) this.LLJILJIL.getValue();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_full_customized_board_edit_slot_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(fullyCustomizedBoardEditPageViewModel.wQ2().LLILZ, "board_entrance");
        if (fullyCustomizedBoardEditPageViewModel.wQ2().LIZ()) {
            str = "headline";
        } else {
            str = "secondary_board";
        }
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
        if (fullyCustomizedBoardEditPageViewModel.wQ2().LIZ()) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_decoration_text_item_editing_page");
            c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ2.LJJII(fullyCustomizedBoardEditPageViewModel.wQ2().LLILZ, "decoration_entrance");
            c474500IjALIZ2.LJJII("show", "action_type");
            c474500IjALIZ2.LIZ();
        }
        int i3 = fullyCustomizedBoardEditPageViewModel.wQ2().LLILLL;
        if (i3 == 4 || i3 == 7) {
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_decoration_secondary_board_editing_page");
            c474500IjALIZ3.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ3.LJJII(fullyCustomizedBoardEditPageViewModel.wQ2().LLILZ, "decoration_entrance");
            c474500IjALIZ3.LJJII(C758440Tp4.LIZLLL, "secondary_board_title_type");
            long j = fullyCustomizedBoardEditPageViewModel.wQ2().LL.id;
            if (j != 0) {
                c474500IjALIZ3.LJJII(Long.valueOf(j), "item_id");
            }
            if (fullyCustomizedBoardEditPageViewModel.wQ2().LL.fullyCustomizedContent.length() != 0) {
                i2 = 0;
            }
            c474500IjALIZ3.LJJII(Integer.valueOf(i2), "is_empty");
            c474500IjALIZ3.LIZ();
        }
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        assemVMLazy.getValue().setState(new C230700un(z, i));
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
