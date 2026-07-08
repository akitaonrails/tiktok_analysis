package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe;

import X.C01GW;
import X.C0HHT;
import X.C13BV;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C434810H3f;
import X.C434820H3g;
import X.C435810H7b;
import X.C452501pT;
import X.C506301y9;
import X.C659520Ptu;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchKeyframeOptDir3PanelAssem extends ReusedUISlotAssem<SearchKeyframeOptDir3PanelAssem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C434810H3f LLJL;
    public final C01GW LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public RecyclerView LLJLLIL;
    public View LLJLLL;
    public TuxTextView LLJZ;
    public List<C434820H3g> LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchKeyframeOptDir3PanelAssem.class, "keyFrameVM", "getKeyFrameVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoKeyFrameViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchKeyframeOptDir3PanelAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(130);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoKeyFrameViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, aFwS192S0000000_6, null, AFwS236S0000000_6.get$arr$(292));
        this.LLJL = new C434810H3f();
        this.LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 585));
        this.LLJZIJLIL = C13BV.INSTANCE;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d05;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SearchVideoKeyFrameViewModel op() {
        return (SearchVideoKeyFrameViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = view;
        this.LLJLL = view.findViewById(R.id.mdb);
        this.LLJLLIL = (RecyclerView) view.findViewById(R.id.tw9);
        this.LLJLLL = view.findViewById(R.id.cwk);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.tv_view_all);
        RecyclerView recyclerView = this.LLJLLIL;
        if (recyclerView != null) {
            this.LLJL.LLILLL = new AwS655S0100000_6(this, 12);
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem$initRecyclerView$2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return false;
                }
            });
            recyclerView.setAdapter(this.LLJL);
            recyclerView.setNestedScrollingEnabled(false);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C506301y9(view, this, null), 3);
        View viewFindViewById = view.findViewById(R.id.cwk);
        View viewFindViewById2 = view.findViewById(R.id.mdb);
        C427690Gpr.LJFF(viewFindViewById, C418440Gaw.LIZIZ(200));
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) this.LLJLIL.getValue();
        if (iSearchVideoHolderAbility != null) {
            iSearchVideoHolderAbility.rF0(viewFindViewById, new C435810H7b(2, null, new AwS442S0200000_6(viewFindViewById, this, 16)));
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 136), viewFindViewById2);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0H7i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C435950H7p) obj).LL;
            }
        }, null, new AwS620S0100000_6(view, 146), 6);
    }

    public final void sp(int i) {
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView == null) {
            return;
        }
        String string = tuxTextView.getContext().getString(2131858070);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(" (");
        sbLIZ.append(i);
        sbLIZ.append(')');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
