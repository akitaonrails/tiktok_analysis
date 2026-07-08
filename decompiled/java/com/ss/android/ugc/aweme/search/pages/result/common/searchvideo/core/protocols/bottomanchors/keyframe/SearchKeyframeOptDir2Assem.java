package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C659520Ptu;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS6S0800000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchKeyframeOptDir2Assem extends ReusedUISlotAssem<SearchKeyframeOptDir2Assem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchKeyframeOptDir2Assem.class, "searchVideoHolderVM", "getSearchVideoHolderVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoHolderVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchKeyframeOptDir2Assem.class, "keyFrameVM", "getKeyFrameVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoKeyFrameViewModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchKeyframeOptDir2Assem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoHolderVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 583), null, AFwS236S0000000_6.get$arr$(287));
        AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(127);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchVideoKeyFrameViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, aFwS192S0000000_6, null, AFwS236S0000000_6.get$arr$(288));
        this.LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 582));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d02;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SearchVideoKeyFrameViewModel op() {
        return (SearchVideoKeyFrameViewModel) this.LLJL.getValue(this, LLJLILLLLZIIL[1]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op().LLILLL = ((SearchVideoHolderVM) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLILLLLZIIL[0])).LLILLL;
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0H7j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C435950H7p) obj).LL;
            }
        }, null, new AwS6S0800000_6(view, view.findViewById(R.id.i6t), view.findViewById(R.id.i6u), (ImageView) view.findViewById(R.id.lzg), (ImageView) view.findViewById(R.id.ll_), (TuxTextView) view.findViewById(R.id.tv_text_chip), (TuxTextView) view.findViewById(R.id.tv_video_timing), (TuxTextView) view.findViewById(R.id.zqb), 1), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        op().vQ2(c659520Ptu);
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
