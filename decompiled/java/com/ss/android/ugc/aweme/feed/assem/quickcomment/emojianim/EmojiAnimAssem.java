package com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim;

import X.C01GW;
import X.C0RSG;
import X.C0RSI;
import X.C0RSJ;
import X.C0RSK;
import X.C0RSL;
import X.C0RSM;
import X.C13LE;
import X.C19606111nH;
import X.C2217381BqS;
import X.C2487409ou;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import Y.ARunnableS111S0100000_11;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class EmojiAnimAssem extends FeedBaseAssem<EmojiAnimAssem> {
    public static final /* synthetic */ int LLJLL = 0;
    public C19606111nH LLJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C0RSJ(this));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C0RSL());
    public final C01GW LLJLILLLLZIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0RSM());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b6a;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C2487409ou.LIZJ(new ARunnableS111S0100000_11(this, 24));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = new C19606111nH((EmojiAnimPlayground) view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0RDr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJJ;
            }
        }, null, new C0RSG(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0RFZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new C0RSK(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0RDs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, C736820SvI.LIZLLL(), new C0RSI(), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem
    /* JADX INFO: renamed from: op */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ur(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            r5 = this;
            r0 = 202355(0x31673, float:2.8356E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            X.01GW r0 = r5.LLJJLIIIJLLLLLLLZ
            java.lang.Object r0 = r0.getValue()
            X.0R8b r0 = (X.C690870R8b) r0
            X.0RF0 r0 = r0.LIZLLL
            if (r0 == 0) goto L60
            androidx.fragment.app.Fragment r1 = r0.LIZJ
        L15:
            X.0sDa r0 = X.C1618440sDa.LIZIZ
            X.0Rnv r0 = r0.LJJIIJ()
            boolean r0 = r0.LJJIIJZLJL(r1)
            r3 = 0
            if (r0 != 0) goto L59
            X.01GW r0 = r5.LLJJLIIIJLLLLLLLZ
            java.lang.Object r0 = r0.getValue()
            X.0R8b r0 = (X.C690870R8b) r0
            X.0RJN r0 = r0.LIZIZ()
            boolean r0 = X.C1389300mG0.LJIILL(r0)
            if (r0 != 0) goto L59
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r0 = X.C729510SjV.LJJIJIL(r0)
            if (r0 != 0) goto L59
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSharer(r0)
            if (r0 != 0) goto L59
            X.0lGd r2 = X.C1351250lGd.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.getAweme()
            java.lang.String r0 = r6.mEventType
            r2.getClass()
            boolean r0 = X.C1351250lGd.LJIJJ(r1, r0)
            if (r0 == 0) goto L5a
        L59:
            r3 = 1
        L5a:
            if (r4 == 0) goto L5f
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5f:
            return r3
        L60:
            r1 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem.ur(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(VideoItemParams videoItemParams) {
        boolean zLJI = MethodIDManager.LJI(202355);
        boolean zUr = ur(videoItemParams);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zUr;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
