package com.ss.android.ugc.aweme.feed.assem.addiction;

import X.C01GW;
import X.C0RJN;
import X.C0RP1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2189821An6;
import X.C2217381BqS;
import X.C452501pT;
import X.C700100RdA;
import X.C717590SCv;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1350790lFt;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AntiAddictionToastAssem extends BaseCellSlotComponent<AntiAddictionToastAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 193));
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public ViewGroup LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AntiAddictionToastAssem.class, "antiAddictionVM", "getAntiAddictionVM()Lcom/ss/android/ugc/aweme/feed/assem/addiction/VideoAntiAddictionVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AntiAddictionToastAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoAntiAddictionVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 194), null, AFwS243S0000000_11.get$arr$(51));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(52));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b55;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Rj9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0R91) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(37), 6);
    }

    public final VideoAntiAddictionVM Bp() {
        return (VideoAntiAddictionVM) this.LLJLLL.getValue(this, LLL[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void wr() {
        C717590SCv c717590SCv = Bp().LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoAntiAddictionVM.LLILZ;
        c717590SCv.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        InterfaceC1350790lFt interfaceC1350790lFtLJIILL;
        C2189821An6 c2189821An6;
        ITakoService iTakoService;
        super.onViewCreated(view);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LLJZIJLIL = viewGroup;
        if (viewGroup != null) {
            viewGroup.findViewById(R.id.z8j);
        }
        ViewGroup viewGroup2 = this.LLJZIJLIL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        ViewGroup viewGroup3 = this.LLJZIJLIL;
        if (viewGroup3 != null) {
            C786410Ut5.K7(viewGroup3, new View.OnClickListener() { // from class: X.0RjC
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        ViewGroup viewGroup4 = this.LLJZIJLIL;
        if (viewGroup4 != null) {
            viewGroup4.setTag(C700100RdA.LJIIIZ, "no_click");
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0RjB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLILZLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(38), 6);
        ITakoService iTakoService2 = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
        if (iTakoService2 != null && (interfaceC1350790lFtLJIILL = iTakoService2.LJIILL()) != null) {
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            if (c0rjnLIZIZ != null) {
                c2189821An6 = c0rjnLIZIZ.LIZJ;
            } else {
                c2189821An6 = null;
            }
            if (interfaceC1350790lFtLJIILL.LJ(c2189821An6) && (iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null)) != null) {
                iTakoService.LJJZZIII(view, null);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: zp */
    public final void vr(VideoItemParams videoItemParams) {
        VideoAntiAddictionVM videoAntiAddictionVMBp = Bp();
        Context context = getContext();
        C717590SCv c717590SCv = videoAntiAddictionVMBp.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoAntiAddictionVM.LLILZ;
        c717590SCv.LIZIZ(context);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }
}
