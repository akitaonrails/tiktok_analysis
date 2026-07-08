package com.ss.android.ugc.aweme.vibefeed.feed;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C09R9;
import X.C0P35;
import X.C0P3U;
import X.C13BV;
import X.C13LE;
import X.C19EG;
import X.C20603715jn;
import X.C2189821An6;
import X.C2217401BqU;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C607780Nse;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C628980Olk;
import X.C629160Om2;
import X.C638660P3g;
import X.EnumC323450Cm7;
import X.EnumC912680ZrG;
import X.InterfaceC0148002o;
import X.InterfaceC1209780haS;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeDetailSharedVM extends BaseDetailShareVM<C0P3U, C607780Nse, String> {
    public static final /* synthetic */ int LLJILLL = 0;
    public C2189821An6 LLILZLL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1582));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1584));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(345));
    public final C09R9 LLJ = new C09R9(this, C13LE.LIZ(C628980Olk.class));
    public List<String> LLJI = C13BV.INSTANCE;
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1583));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 56;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        return 0;
    }

    public static boolean EQ2() {
        C629160Om2.LIZ.getClass();
        return C629160Om2.LIZ();
    }

    public final String CQ2() {
        return (String) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0P3U(0);
    }

    public final int DQ2() {
        if (!EQ2()) {
            return 15;
        }
        if (((EnumC912680ZrG) this.LLJILJILJ.getValue()).isGroup()) {
            C629160Om2.LIZ.getClass();
            return C629160Om2.LIZIZ().groupPageSize;
        }
        C629160Om2.LIZ.getClass();
        return C629160Om2.LIZIZ().pageSize;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1216440hlC
    public final boolean aH0() {
        return EQ2();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return !EQ2();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadMore() {
        return !EQ2();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final boolean wQ2() {
        return EQ2();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        Context context = interfaceC1209780haS.getFragment().getContext();
        if (context != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = false;
            c20603715jn.LJIIJ = true;
            c20603715jn.LIZ = 1;
            c20603715jn.LIZIZ = 1;
            c20603715jn.LJ = true;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0P3c
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
        super.bindView(interfaceC1209780haS);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        MutableLiveData<Boolean> mutableLiveData;
        C19EG activity = fragment.getActivity();
        if (activity != null && fragment.isAdded()) {
            DetailLoadStateManager detailLoadStateManagerLIZ = C638660P3g.LIZ(activity);
            this.LLILZ = detailLoadStateManagerLIZ;
            if (detailLoadStateManagerLIZ != null && (mutableLiveData = detailLoadStateManagerLIZ.LL) != null) {
                mutableLiveData.setValue(Boolean.valueOf(EQ2()));
            }
        }
        super.init(fragment);
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C607780Nse> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 411));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r14) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C607780Nse) interfaceC1891350zJl).LLILLJJLI;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str = (String) obj;
        if (EQ2() && str.length() != 0) {
            return BQ2(str, DQ2(), C0P35.LOAD_LATEST, interfaceC1364105Vn);
        }
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str = (String) obj;
        if (EQ2() && str.length() != 0) {
            return BQ2(str, DQ2(), C0P35.LOAD_MORE, interfaceC1364105Vn);
        }
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<C607780Nse> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<C607780Nse> list, List<C607780Nse> list2) {
        List listOnLoadPageAddData = super.onLoadPageAddData(enumC323450Cm7, list, list2);
        if (listOnLoadPageAddData != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOnLoadPageAddData) {
                if (hashSet.add(((C607780Nse) obj).LLILLJJLI.getAid())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(java.lang.String r29, int r30, X.C0P35 r31, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r32) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM.BQ2(java.lang.String, int, X.0P35, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLILZLL = c2189821An6;
        super.request(i, c2189821An6, i2, z);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final String yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        if (i != 2) {
            if (i != 4) {
                return "";
            }
            return this.LLJILJIL;
        }
        return this.LLJIJIL;
    }
}
