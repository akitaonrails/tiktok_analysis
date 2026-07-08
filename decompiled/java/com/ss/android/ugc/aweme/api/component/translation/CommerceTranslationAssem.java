package com.ss.android.ugc.aweme.api.component.translation;

import X.C01GW;
import X.C0S7A;
import X.C0S7B;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS335S0000000_11;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes12.dex */
public final class CommerceTranslationAssem extends BaseCellLogicComponent<CommerceTranslationAssem> implements C0S7B {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C01GW LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final TranslationOptimizeHandler LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceTranslationAssem.class, "translationViewModel", "getTranslationViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLJJJ.removeMessages(1);
    }

    public CommerceTranslationAssem() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(46));
        this.LLJJIJI = c01gwLIZIZ;
        this.LLJJIJIIJIL = ((ITranslationService) c01gwLIZIZ.getValue()).LJLJL(this);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 75));
        this.LLJJJ = new TranslationOptimizeHandler(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJJ.removeMessages(1);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.C0S7B
    public final void Nn(IAdTranslatableData iAdTranslatableData) {
        Iterator it2 = ((List) this.LLJJIJIL.getValue()).iterator();
        while (it2.hasNext()) {
            ((C0S7A) it2.next()).LJZ(iAdTranslatableData);
        }
    }

    @Override // X.C0S7B
    public final void qh(IAdTranslationData iAdTranslationData) {
        Iterator it2 = ((List) this.LLJJIJIL.getValue()).iterator();
        while (it2.hasNext()) {
            ((C0S7A) it2.next()).LJJLJ(iAdTranslationData);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(this, LLJJJIL[0]), new C2217381BqS() { // from class: X.0Rp9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S5G) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0S5I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S5G) obj).LLJ;
            }
        }, null, AFwS335S0000000_11.get$arr$(4), 12);
    }
}
