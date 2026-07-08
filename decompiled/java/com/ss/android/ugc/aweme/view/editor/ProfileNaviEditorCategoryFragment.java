package com.ss.android.ugc.aweme.view.editor;

import X.C11EA;
import X.C19401910vR;
import X.C19402010vS;
import X.C19402610vY;
import X.C19403110vd;
import X.C19423210ys;
import X.C19424410z4;
import X.C19425110zB;
import X.C19429110zp;
import X.C20010313Rd;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.InterfaceC19402510vX;
import X.InterfaceC19402810va;
import X.InterfaceC19403010vc;
import X.InterfaceC19423310yt;
import X.InterfaceC19426310zN;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviEditorCategoryFragment extends ProfileNaviViewPagerFragment implements InterfaceC19402810va {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9LSElPSAhHELIOSZhU+Jik6JCACKDk6DSElPSAhCyQ4LCg8OjwKOy40JSAiPQ==";
    public RecyclerView LLILLL;
    public InterfaceC19423310yt LLILZ;
    public C19402610vY LLILZIL;

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final int MR() {
        return R.layout.egv;
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final void OR() {
        if (this.LLILZ == null) {
            return;
        }
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s3r) : null;
            this.LLILLL = (RecyclerView) viewFindViewById;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        NR().getClass();
        C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
        if (c19424410z4 != null) {
            View view2 = this.LLILLL;
            if (view2 == null) {
                View view3 = getView();
                View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.s3r) : null;
                this.LLILLL = (RecyclerView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            RecyclerView recyclerView2 = (RecyclerView) view2;
            if (recyclerView2 != null) {
                C19402610vY c19402610vY = new C19402610vY(c19424410z4, this.LLILZ, this);
                this.LLILZIL = c19402610vY;
                recyclerView2.setAdapter(c19402610vY);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
    }

    @Override // X.InterfaceC19402810va
    public final void u(InterfaceC19402510vX interfaceC19402510vX) {
        String key;
        String key2;
        InterfaceC19403010vc interfaceC19403010vc;
        C19403110vd extra;
        List<String> list;
        C19402010vS c19402010vS;
        C19423210ys c19423210ys = C19423210ys.LIZ;
        String key3 = interfaceC19402510vX.getKey();
        InterfaceC19423310yt interfaceC19423310yt = this.LLILZ;
        String str = null;
        if (interfaceC19423310yt != null) {
            key = interfaceC19423310yt.getKey();
        } else {
            key = null;
        }
        String key4 = interfaceC19402510vX.getCategory().getKey();
        C19401910vR c19401910vRLJFF = interfaceC19402510vX.getCategory().LJFF();
        if (c19401910vRLJFF != null && (c19402010vS = c19401910vRLJFF.LIZIZ) != null) {
            str = c19402010vS.LIZ;
        }
        c19423210ys.getClass();
        C19423210ys.LIZIZ(key3, key, key4, str);
        ProfileNaviEditorViewModel profileNaviEditorViewModelNR = NR();
        profileNaviEditorViewModelNR.getClass();
        if (interfaceC19402510vX instanceof InterfaceC19426310zN) {
            InterfaceC19426310zN interfaceC19426310zNLR2 = ProfileNaviEditorViewModel.lR2(interfaceC19402510vX.getCategory());
            if (interfaceC19426310zNLR2 == null || !Intrinsics.LJFF(interfaceC19426310zNLR2.getKey(), interfaceC19402510vX.getKey())) {
                InterfaceC19426310zN interfaceC19426310zN = (InterfaceC19426310zN) interfaceC19402510vX;
                InterfaceC19426310zN interfaceC19426310zNLR22 = ProfileNaviEditorViewModel.lR2(interfaceC19426310zN.getCategory());
                if (interfaceC19426310zNLR22 == null || !Intrinsics.LJFF(interfaceC19426310zNLR22.getKey(), interfaceC19426310zN.getKey())) {
                    InterfaceC19403010vc category = interfaceC19426310zN.getCategory();
                    String groupId = category.getGroupId();
                    if (groupId != null && groupId.length() != 0) {
                        key2 = category.getGroupId();
                    } else {
                        key2 = category.getKey();
                    }
                    C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
                    if (c19424410z4 != null) {
                        HashMap<String, InterfaceC19403010vc> map = C19429110zp.LJ;
                        if (map != null && (interfaceC19403010vc = map.get(interfaceC19426310zN.getCategory().getKey())) != null && (extra = interfaceC19403010vc.getExtra()) != null && (list = extra.LIZ) != null) {
                            Iterator<String> it2 = list.iterator();
                            while (it2.hasNext()) {
                                c19424410z4.LIZJ.remove(it2.next());
                            }
                        }
                        c19424410z4.LIZJ.put(key2, interfaceC19426310zN);
                    }
                    if (interfaceC19426310zNLR22 != null) {
                        profileNaviEditorViewModelNR.setStateImmediate(new AwS608S0100000_29(interfaceC19426310zNLR22, 573));
                    }
                    C20010313Rd c20010313Rd = C20010313Rd.LIZ;
                    Effect effectLIZ = interfaceC19426310zN.LIZ();
                    AwS464S0200000_29 awS464S0200000_29 = new AwS464S0200000_29(interfaceC19426310zN, profileNaviEditorViewModelNR, 8);
                    c20010313Rd.getClass();
                    C20010313Rd.LIZ(0, effectLIZ, awS464S0200000_29);
                }
                profileNaviEditorViewModelNR.setState(AFwS273S0000000_29.get$arr$(328));
                profileNaviEditorViewModelNR.setState(new AwS608S0100000_29(interfaceC19402510vX, 575));
                return;
            }
            return;
        }
        if (!(interfaceC19402510vX instanceof C19425110zB)) {
            return;
        }
        C19424410z4 c19424410z42 = C19429110zp.LIZIZ;
        if (c19424410z42 != null) {
            C19425110zB c19425110zB = (C19425110zB) interfaceC19402510vX;
            c19424410z42.LIZLLL.put(c19425110zB.LIZJ.getKey(), c19425110zB);
        }
        profileNaviEditorViewModelNR.setState(new AwS608S0100000_29(interfaceC19402510vX, 576));
    }

    @Override // X.InterfaceC19402810va
    public final void Av(InterfaceC19403010vc interfaceC19403010vc, C19402010vS c19402010vS) {
        String key;
        C19423210ys c19423210ys = C19423210ys.LIZ;
        NR().getClass();
        InterfaceC19426310zN interfaceC19426310zNLR2 = ProfileNaviEditorViewModel.lR2(interfaceC19403010vc);
        String key2 = null;
        if (interfaceC19426310zNLR2 != null) {
            key = interfaceC19426310zNLR2.getKey();
        } else {
            key = null;
        }
        InterfaceC19423310yt interfaceC19423310yt = this.LLILZ;
        if (interfaceC19423310yt != null) {
            key2 = interfaceC19423310yt.getKey();
        }
        String key3 = interfaceC19403010vc.getKey();
        String str = c19402010vS.LIZ;
        c19423210ys.getClass();
        C19423210ys.LIZIZ(key, key2, key3, str);
        ProfileNaviEditorViewModel profileNaviEditorViewModelNR = NR();
        profileNaviEditorViewModelNR.getClass();
        if (c19402010vS.LIZ != null && interfaceC19403010vc.LJFF() != null) {
            interfaceC19403010vc.LJFF().LIZIZ = c19402010vS;
            profileNaviEditorViewModelNR.setStateImmediate(new AwS608S0100000_29(c19402010vS, 557));
        }
    }

    @Override // X.InterfaceC19402810va
    public final void O2(InterfaceC19402510vX interfaceC19402510vX, int i) {
        String key = null;
        if (i != 1) {
            if (i == 2) {
                InterfaceC19403010vc category = interfaceC19402510vX.getCategory();
                C19423210ys c19423210ys = C19423210ys.LIZ;
                InterfaceC19423310yt interfaceC19423310yt = this.LLILZ;
                if (interfaceC19423310yt != null) {
                    key = interfaceC19423310yt.getKey();
                }
                String key2 = category.getKey();
                c19423210ys.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("item_tab", key);
                c2344009Gk.LJIIIIZZ("item_subcategory", key2);
                C20684815ws.LJIILLIIL("click_avatar_flip", c2344009Gk.LIZ);
                ProfileNaviEditorViewModel profileNaviEditorViewModelNR = NR();
                profileNaviEditorViewModelNR.getClass();
                if (category.LIZIZ() != null) {
                    if (category.LIZIZ().LIZIZ == 0) {
                        category.LIZIZ().LIZIZ = 1;
                    } else {
                        category.LIZIZ().LIZIZ = 0;
                    }
                    profileNaviEditorViewModelNR.setStateImmediate(new AwS608S0100000_29(category, 564));
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC19403010vc category2 = interfaceC19402510vX.getCategory();
        C19423210ys c19423210ys2 = C19423210ys.LIZ;
        InterfaceC19423310yt interfaceC19423310yt2 = this.LLILZ;
        if (interfaceC19423310yt2 != null) {
            key = interfaceC19423310yt2.getKey();
        }
        String key3 = category2.getKey();
        c19423210ys2.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("item_tab", key);
        c2344009Gk2.LJIIIIZZ("item_subcategory", key3);
        C20684815ws.LJIILLIIL("click_edit_avatar_detail", c2344009Gk2.LIZ);
        ProfileNaviEditorViewModel profileNaviEditorViewModelNR2 = NR();
        profileNaviEditorViewModelNR2.getClass();
        profileNaviEditorViewModelNR2.setState(new AwS608S0100000_29(category2, 559));
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C11EA.LJII(this, NR(), new C2217381BqS() { // from class: X.10yr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getCurrentProfileNaviSelectable();
            }
        }, new AwS643S0100000_29(this, 47));
    }
}
