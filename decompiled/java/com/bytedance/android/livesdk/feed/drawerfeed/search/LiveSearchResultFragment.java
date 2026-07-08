package com.bytedance.android.livesdk.feed.drawerfeed.search;

import X.AbstractC1556290qbL;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1556270qbJ;
import X.C1556280qbK;
import X.C1556300qbM;
import X.C1685300txQ;
import X.C1809010xAx;
import X.C1834150xpV;
import X.C1864610ycd;
import X.C1864790ycv;
import X.C189200o6;
import X.C19719612Di;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C2204961BRm;
import X.C2834017w;
import X.C469420Iay;
import X.C472030IfB;
import X.C472230IfV;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1808960xAs;
import X.InterfaceC1808970xAt;
import X.InterfaceC469270Iaj;
import X.InterfaceC500940Jki;
import Y.ACListenerS161S0100000_27;
import Y.AObserverS229S0100000_27;
import Y.ARunnableS96S0200000_27;
import Y.ATListenerS459S0100000_27;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.feed.drawerfeed.search.result.LiveSearchContainerFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveSearchResultFragment extends BaseFragment implements InterfaceC469270Iaj {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7HELIOSLD01LSAoZzw2KTcvIWEfITMpGioyOiYkGyogPSk4Dz0yLygpJzs=";
    public EditText LL;
    public C1809010xAx LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public LiveSearchContainerFragment LLILZIL;
    public LiveSearchIntermediateViewModel LLILZLL;
    public InterfaceC1808970xAt LLIZ;
    public C469420Iay LLIZLLLIL;
    public boolean LLJ;
    public String LLJI = "";
    public int LLJIJIL = 2;
    public boolean LLJILJIL;
    public String LLJILJILJ;

    @Override // X.InterfaceC469270Iaj
    public final Fragment LLLIILIL() {
        return this;
    }

    @Override // X.InterfaceC469270Iaj
    public final void LLLLLZ() {
        OR(false);
    }

    public final void RR() {
        this.LLJIJIL = 2;
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LLILZLL;
        if (liveSearchIntermediateViewModel != null) {
            AbstractC1556290qbL value = liveSearchIntermediateViewModel.wQ2().getValue();
            C1556280qbK c1556280qbK = C1556280qbK.LIZ;
            if (!Intrinsics.LJFF(value, c1556280qbK)) {
                liveSearchIntermediateViewModel.wQ2().setValue(c1556280qbK);
            }
        }
        LiveSearchContainerFragment liveSearchContainerFragment = this.LLILZIL;
        if (liveSearchContainerFragment == null || !liveSearchContainerFragment.isAdded()) {
            return;
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIIZILJ(liveSearchContainerFragment);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // X.InterfaceC469270Iaj
    public final void S0() {
        Editable editableLLJILLL;
        if (this.LLJIJIL == 2) {
            List<String> listLIZ = C2834017w.LIZ();
            if (listLIZ == null || ((ArrayList) listLIZ).isEmpty()) {
                EditText editText = this.LL;
                if ((editText == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IYdy3U3sot4Nq0BUPT9XZNE/sSZ7pF27HePL3ouwTvs=", null))) == null || a0.LJJJIL(editableLLJILLL)) && C500260Jjc.LJJIIZ(this.LLJILJILJ)) {
                    String str = this.LLJILJILJ;
                    if (str == null) {
                        str = "";
                    }
                    C472230IfV.LJ("", str);
                }
            }
        }
    }

    public final void reset() {
        EditText editText = this.LL;
        if (editText != null) {
            editText.setText("");
        }
        EditText editText2 = this.LL;
        if (editText2 != null) {
            editText2.setSelection(0);
        }
        this.LLJI = "";
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LLILZLL;
        if (liveSearchIntermediateViewModel != null) {
            ((LiveData) liveSearchIntermediateViewModel.LLILLJJLI.getValue()).setValue(new Pair("", -1));
            ((LiveData) liveSearchIntermediateViewModel.LLILLL.getValue()).setValue(null);
            liveSearchIntermediateViewModel.wQ2().setValue(C1556300qbM.LIZ);
        }
        this.LLJILJILJ = null;
    }

    public final void NR() {
        InterfaceC1808970xAt interfaceC1808970xAt;
        boolean z = getUserVisibleHint() && isResumed() && (interfaceC1808970xAt = this.LLIZ) != null && interfaceC1808970xAt.isOpen();
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
        if (z) {
            LiveSearchContainerFragment liveSearchContainerFragment = this.LLILZIL;
            if (liveSearchContainerFragment == null || !liveSearchContainerFragment.isAdded()) {
                C1809010xAx c1809010xAx = this.LLILLJJLI;
                if (c1809010xAx != null) {
                    c1809010xAx.LIZ(true);
                    return;
                }
                return;
            }
            LiveSearchContainerFragment liveSearchContainerFragment2 = this.LLILZIL;
            if (liveSearchContainerFragment2 != null) {
                liveSearchContainerFragment2.NR(true);
                return;
            }
            return;
        }
        LiveSearchContainerFragment liveSearchContainerFragment3 = this.LLILZIL;
        if (liveSearchContainerFragment3 == null || !liveSearchContainerFragment3.isAdded()) {
            C1809010xAx c1809010xAx2 = this.LLILLJJLI;
            if (c1809010xAx2 != null) {
                c1809010xAx2.LIZ(false);
                return;
            }
            return;
        }
        LiveSearchContainerFragment liveSearchContainerFragment4 = this.LLILZIL;
        if (liveSearchContainerFragment4 != null) {
            liveSearchContainerFragment4.NR(false);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        reset();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJ = true;
        NR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJ = false;
        NR();
    }

    public final void OR(boolean z) {
        EditText editText = this.LL;
        if (editText == null) {
            return;
        }
        if (z) {
            HandlerHook.viewPost(editText, new ARunnableS96S0200000_27(editText, this, 4));
        } else {
            KeyBoardUtil.LIZJ(getContext(), editText);
            editText.setCursorVisible(false);
        }
    }

    public final void SR(C472030IfB c472030IfB) {
        String str;
        LiveSearchContainerFragment liveSearchContainerFragment;
        Long lValueOf;
        if (c472030IfB != null && (str = c472030IfB.LIZIZ) != null && !a0.LJJJIL(str)) {
            if (this.LLILZIL == null) {
                this.LLILZIL = new LiveSearchContainerFragment();
            }
            LiveSearchContainerFragment liveSearchContainerFragment2 = this.LLILZIL;
            if ((liveSearchContainerFragment2 == null || !liveSearchContainerFragment2.isAdded()) && (liveSearchContainerFragment = this.LLILZIL) != null) {
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZJ(R.id.ue2, liveSearchContainerFragment, "live_search_container");
                c19ehLJIIJ.LJIIJ();
            }
            LiveSearchContainerFragment liveSearchContainerFragment3 = this.LLILZIL;
            if (liveSearchContainerFragment3 != null) {
                liveSearchContainerFragment3.OR(c472030IfB);
            }
            this.LLJIJIL = 1;
            LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LLILZLL;
            if (liveSearchIntermediateViewModel != null) {
                AbstractC1556290qbL value = liveSearchIntermediateViewModel.wQ2().getValue();
                C1556300qbM c1556300qbM = C1556300qbM.LIZ;
                if (!Intrinsics.LJFF(value, c1556300qbM)) {
                    liveSearchIntermediateViewModel.wQ2().setValue(c1556300qbM);
                }
            }
            String str2 = c472030IfB.LIZIZ;
            Keva keva = C2834017w.LIZ;
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId())) != null) {
                lValueOf.longValue();
                if (str2 != null && !a0.LJJJIL(str2)) {
                    List<String> list = C2834017w.LIZIZ;
                    ArrayList arrayList = (ArrayList) list;
                    int iIndexOf = arrayList.indexOf(str2);
                    if (iIndexOf != 0) {
                        if (iIndexOf > 0) {
                            arrayList.remove(str2);
                        }
                        if (arrayList.size() >= 10) {
                            C19719612Di.LJJIJ(list);
                        }
                        ListProtector.add(list, 0, str2);
                        C2834017w.LIZJ(lValueOf.toString());
                    }
                }
            }
        }
    }

    public final void UR(String str) {
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel;
        this.LLJIJIL = 2;
        if (str != null && !a0.LJJJIL(str) && (liveSearchIntermediateViewModel = this.LLILZLL) != null && str != null && !a0.LJJJIL(str)) {
            liveSearchIntermediateViewModel.wQ2().setValue(new C1556270qbJ(str));
        }
        LiveSearchContainerFragment liveSearchContainerFragment = this.LLILZIL;
        if (liveSearchContainerFragment != null && liveSearchContainerFragment.isAdded()) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(liveSearchContainerFragment);
            c19ehLJIIJ.LJIIJ();
        }
    }

    public final void VR(String str) {
        if (isAdded() && str != null && !a0.LJJJIL(str)) {
            this.LLJI = str;
            EditText editText = this.LL;
            if (editText != null) {
                editText.setText(str);
            }
            C472030IfB c472030IfB = new C472030IfB();
            c472030IfB.LIZIZ = str;
            c472030IfB.LIZ = "normal_search";
            SR(c472030IfB);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILZLL = (LiveSearchIntermediateViewModel) ViewModelProviders.of(this).get(LiveSearchIntermediateViewModel.class);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        InterfaceC1808970xAt interfaceC1808970xAt;
        Object obj;
        boolean z2 = true;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/feed/drawerfeed/search/LiveSearchResultFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IYdy3U3sot4Nq0BUPT9XZNE/sSZ7pF27HePL3ouwTvs=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (!z || (interfaceC1808970xAt = this.LLIZ) == null || !interfaceC1808970xAt.isOpen()) {
            z2 = false;
        }
        super.setUserVisibleHint(z2);
        NR();
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(LiveSearchResultFragment.class);
        }
    }

    public final void PR(String str, String str2) {
        List<String> listLIZ = C2834017w.LIZ();
        if (listLIZ != null && !((ArrayList) listLIZ).isEmpty()) {
            return;
        }
        C472230IfV.LJ(str, str2);
        this.LLJILJILJ = str2;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        Editable editableLLJILLL;
        super.onViewCreated(view, bundle);
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LLILZLL;
        if (liveSearchIntermediateViewModel != null) {
            liveSearchIntermediateViewModel.LLILZ = String.valueOf(System.currentTimeMillis());
        }
        C469420Iay c469420Iay = this.LLIZLLLIL;
        if (c469420Iay != null && C500260Jjc.LJJIIZ(c469420Iay.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        String string = null;
        if (z) {
            C469420Iay c469420Iay2 = this.LLIZLLLIL;
            if (c469420Iay2 != null) {
                string = c469420Iay2.LIZ;
            }
            VR(string);
            return;
        }
        List<String> listLIZ = C2834017w.LIZ();
        if (listLIZ != null && !((ArrayList) listLIZ).isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = !z2;
        EditText editText = this.LL;
        if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IYdy3U3sot4Nq0BUPT9XZNE/sSZ7pF27HePL3ouwTvs=", null))) != null) {
            string = editableLLJILLL.toString();
        }
        if (z3) {
            RR();
            return;
        }
        if (string != null && !a0.LJJJIL(string)) {
            UR(string);
            OR(true);
        } else {
            PR(string, "search");
            OR(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LiveData liveData;
        LiveData liveData2;
        Fragment fragmentLJJJJZI;
        C19EH c19ehLJIIJ;
        String string;
        Resources resources;
        View viewTd = C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.ghe, viewGroup, false);
        EditText editText = (EditText) viewTd.findViewById(R.id.hdi);
        this.LL = editText;
        C19GS c19gs = null;
        if (editText != null) {
            editText.setInputType(524289);
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(2131852027);
            } else {
                string = null;
            }
            editText.setHint(string);
            editText.setFilters(new InputFilter[]{new InputFilter() { // from class: X.06Yy
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    if (TextUtils.isEmpty(a0.LJLIIIL(charSequence.toString()).toString()) && charSequence.length() > 0 && i3 == 0) {
                        return "";
                    }
                    return null;
                }
            }});
            editText.addTextChangedListener(new C1864790ycv(this, 9));
        }
        EditText editText2 = this.LL;
        if (editText2 != null) {
            editText2.setOnTouchListener(new ATListenerS459S0100000_27(this, 17));
        }
        EditText editText3 = this.LL;
        if (editText3 != null) {
            editText3.setOnEditorActionListener(new C1864610ycd(this, 1));
        }
        View viewFindViewById = viewTd.findViewById(R.id.tv_search_cancel);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 194), viewFindViewById);
        }
        View viewFindViewById2 = viewTd.findViewById(R.id.coo);
        this.LLILZ = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 195), viewFindViewById2);
        }
        C1809010xAx c1809010xAx = (C1809010xAx) viewTd.findViewById(R.id.ub3);
        this.LLILLJJLI = c1809010xAx;
        if (c1809010xAx != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            c1809010xAx.LLILLJJLI = childFragmentManager;
            if (childFragmentManager != null) {
                fragmentLJJJJZI = childFragmentManager.LJJJJZI("tag_live_search_intermediate");
            } else {
                fragmentLJJJJZI = null;
            }
            FragmentManager fragmentManager = c1809010xAx.LLILLJJLI;
            if (fragmentManager != null && (c19ehLJIIJ = fragmentManager.LJIIJ()) != null) {
                if (!(fragmentLJJJJZI instanceof LiveSearchIntermediateFragment)) {
                    LiveSearchIntermediateFragment liveSearchIntermediateFragment = new LiveSearchIntermediateFragment();
                    liveSearchIntermediateFragment.LL = this;
                    c19ehLJIIJ.LJIJ(R.id.ub3, liveSearchIntermediateFragment, "tag_live_search_intermediate");
                    c19ehLJIIJ.LJIIJ();
                    c1809010xAx.LLILLL = liveSearchIntermediateFragment;
                } else {
                    LiveSearchIntermediateFragment liveSearchIntermediateFragment2 = c1809010xAx.LLILLL;
                    if (liveSearchIntermediateFragment2 != null) {
                        c19ehLJIIJ.LJJIFFI(liveSearchIntermediateFragment2);
                        c19ehLJIIJ.LJIIJ();
                    }
                }
            }
        }
        C1809010xAx c1809010xAx2 = this.LLILLJJLI;
        if (c1809010xAx2 != null) {
            c1809010xAx2.setOnDispatchTouchEventListener(new InterfaceC1808960xAs() { // from class: X.0xAq
                @Override // X.InterfaceC1808960xAs
                public final void LIZ(MotionEvent motionEvent) {
                    Integer numValueOf;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null && numValueOf.intValue() == 0) {
                        this.LIZ.OR(false);
                    }
                }
            });
        }
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = this.LLILZLL;
        if (liveSearchIntermediateViewModel != null && (liveData2 = (LiveData) liveSearchIntermediateViewModel.LLILLJJLI.getValue()) != null) {
            liveData2.observe(this, new AObserverS229S0100000_27(this, 60));
        }
        LiveSearchIntermediateViewModel liveSearchIntermediateViewModel2 = this.LLILZLL;
        if (liveSearchIntermediateViewModel2 != null && (liveData = (LiveData) liveSearchIntermediateViewModel2.LLILLL.getValue()) != null) {
            liveData.observe(this, new AObserverS229S0100000_27(this, 61));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
