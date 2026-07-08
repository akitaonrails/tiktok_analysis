package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C12ES;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1EB1;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C435810H7b;
import X.C452501pT;
import X.C659520Ptu;
import X.C660650Pvj;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class SearchVideoKeyFrameAssem extends ReusedUIContentAssem<SearchVideoKeyFrameAssem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public View LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchVideoKeyFrameAssem.class, "searchVideoHolderVM", "getSearchVideoHolderVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoHolderVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchVideoKeyFrameAssem.class, "keyFrameVM", "getKeyFrameVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoKeyFrameViewModel;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchVideoKeyFrameAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoHolderVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 576), null, AFwS236S0000000_6.get$arr$(283));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchVideoKeyFrameViewModel.class);
        this.LLJJJJJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 577), null, AFwS236S0000000_6.get$arr$(284));
        this.LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 575));
    }

    public void hp() {
        View view = this.LLJJL;
        if (view == null) {
            return;
        }
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) this.LLJL.getValue();
        if (iSearchVideoHolderAbility != null) {
            iSearchVideoHolderAbility.Bd2(view, new C435810H7b(2, null, new AwS620S0100000_6(this, 64)));
        }
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0H7g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C435950H7p) obj).LL;
            }
        }, null, new AwS620S0100000_6(view, 65), 6);
    }

    public void ip() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SearchVideoKeyFrameViewModel dp() {
        return (SearchVideoKeyFrameViewModel) this.LLJJJJJIL.getValue(this, LLJLIL[1]);
    }

    public void ep() {
        View view = this.LLJJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public void mp() {
        View view;
        if ((!((Boolean) C1EB1.LIZIZ.getValue()).booleanValue() || this.LLJJLIIIJLLLLLLLZ) && (view = this.LLJJL) != null) {
            C12ES.LJIILL(0, view);
        }
    }

    public void cp(View view) {
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.ufh);
        this.LLJJL = view.findViewById(R.id.ue5);
    }

    public void kp(View view) {
        View viewFindViewById = view.findViewById(R.id.ufc);
        if (viewFindViewById != null) {
            C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, false, 30);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: lp, reason: merged with bridge method [inline-methods] */
    public void up(C659520Ptu c659520Ptu) {
        this.LLJJLIIIJLLLLLLLZ = c659520Ptu.LLILLL instanceof C660650Pvj;
        dp().vQ2(c659520Ptu);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        dp().LLILLL = ((SearchVideoHolderVM) this.LLJJJJ.getValue(this, LLJLIL[0])).LLILLL;
        cp(view);
        kp(view);
        hp();
        ip();
    }

    public void op(int i) {
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(tuxTextView.getContext().getResources().getQuantityString(2131755106, i, Integer.valueOf(i)));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
