package com.ss.android.ugc.aweme.commercialize.feed.assem.tag;

import X.C01GW;
import X.C098200Yq;
import X.C0SD1;
import X.C1017070cZd;
import X.C12ES;
import X.C13LE;
import X.C15438062q;
import X.C189200o6;
import X.C2217381BqS;
import X.C426750GoL;
import X.C446980Hfs;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdBesideSponsorLabelTagAssem extends BaseCellSlotComponent<AdBesideSponsorLabelTagAssem> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS252S0000000_16.get$arr$(128));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 167));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.lc;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0c5d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LJ(), AFwS300S0000000_16.get$arr$(51), 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C1017070cZd.LJLIIIL(videoItemParams.getAweme());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AwemeRawAd awemeRawAd;
        List<AdTagStruct> adTags;
        Object c098200Yq;
        Object c098200Yq2;
        ((C0SD1) this.LLJLLL.getValue()).LIZIZ();
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adTags = awemeRawAd.getAdTags()) != null) {
            ArrayList<AdTagStruct> arrayList = new ArrayList();
            for (AdTagStruct adTagStruct : adTags) {
                AdTagStruct adTagStruct2 = adTagStruct;
                if (adTagStruct2.getPosition() == 1 && !TextUtils.isEmpty(adTagStruct2.getTagText())) {
                    arrayList.add(adTagStruct);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (AdTagStruct adTagStruct3 : arrayList) {
                try {
                    c098200Yq = Integer.valueOf(Color.parseColor(adTagStruct3.getBackgroundColor()));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Integer numValueOf = Integer.valueOf(C446980Hfs.LIZ(((View) this.LLJLLL.getValue()).getContext(), R.color.dr));
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = numValueOf;
                }
                int iIntValue = ((Number) c098200Yq).intValue();
                try {
                    c098200Yq2 = Integer.valueOf(Color.parseColor(adTagStruct3.getTextColor()));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Integer numValueOf2 = Integer.valueOf(C446980Hfs.LIZ(((View) this.LLJLLL.getValue()).getContext(), R.color.be));
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = numValueOf2;
                }
                if (C0SD1.LIZ((C0SD1) this.LLJLLL.getValue(), adTagStruct3.getTagText(), iIntValue, ((Number) c098200Yq2).intValue(), adTagStruct3.getIcon(), LJJIJL().getWidth(), 0, 0, true, 96)) {
                    C426750GoL.LJIIIZ(LJJIJL(), null, null, Integer.valueOf((int) C12ES.LIZJ(4.0f, getContext())), Integer.valueOf((int) C12ES.LIZJ(4.0f, getContext())), false, 19);
                    arrayList2.add(Unit.LIZ);
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
