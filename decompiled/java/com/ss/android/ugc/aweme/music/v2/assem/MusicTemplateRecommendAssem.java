package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicTemplateRecommendAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public View LLJJI;
    public SmartImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public final AssemVMLazy LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicTemplateRecommendAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicTemplateRecommendAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 723), AFwS259S0000000_21.get$arr$(203), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dr9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r3 r4
      0x004b: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v8 java.lang.String) binds: [B:23:0x0048, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v7 java.lang.String) binds: [B:23:0x0048, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[PHI: r3 r4 r5
      0x004f: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v7 java.lang.String) binds: [B:26:0x004c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:26:0x004c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v5 java.lang.Integer) binds: [B:26:0x004c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053 A[PHI: r3 r4 r5 r6
      0x0053: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v6 java.lang.String) binds: [B:29:0x0050, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:29:0x0050, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r5v2 java.lang.Integer) = (r5v1 java.lang.Integer), (r5v4 java.lang.Integer) binds: [B:29:0x0050, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:29:0x0050, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo lp(com.ss.android.ugc.aweme.music.model.MusicDetail r9) {
        /*
            X.0Op3 r0 = X.C631030Op3.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.music.model.MDPRelatedBanner r1 = X.C631030Op3.LIZ(r9)
            com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo r2 = new com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo
            r8 = 0
            if (r1 == 0) goto L46
            java.lang.String r3 = r1.getItemId()
            com.ss.android.ugc.aweme.music.model.MDPTemplatePinReason r0 = r1.getMdpTemplatePinReason()
            if (r0 == 0) goto L47
            java.lang.String r4 = r0.getReason()
        L1c:
            com.ss.android.ugc.aweme.music.model.MDPTemplatePinReason r0 = r1.getMdpTemplatePinReason()
            if (r0 == 0) goto L4b
            java.lang.Integer r5 = r0.getTtTemplatePinType()
        L26:
            com.ss.android.ugc.aweme.music.model.MDPTemplatePinReason r0 = r1.getMdpTemplatePinReason()
            if (r0 == 0) goto L4f
            java.lang.String r6 = r0.getTemplateId()
        L30:
            com.ss.android.ugc.aweme.music.model.MDPTemplatePinReason r0 = r1.getMdpTemplatePinReason()
            if (r0 == 0) goto L53
            java.lang.String r7 = r0.getTemplateType()
        L3a:
            com.ss.android.ugc.aweme.music.model.Music r0 = r9.music
            if (r0 == 0) goto L42
            java.lang.String r8 = r0.getIdStr()
        L42:
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L46:
            r3 = r8
        L47:
            r4 = r8
            if (r1 == 0) goto L4b
            goto L1c
        L4b:
            r5 = r8
            if (r1 == 0) goto L4f
            goto L26
        L4f:
            r6 = r8
            if (r1 == 0) goto L53
            goto L30
        L53:
            r7 = r8
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicTemplateRecommendAssem.lp(com.ss.android.ugc.aweme.music.model.MusicDetail):com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo");
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        this.LLJJI = view.findViewById(R.id.tqy);
        this.LLJJIII = (SmartImageView) view.findViewById(R.id.xgt);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.xhe);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.xhd);
        this.LLJJIJIL = view.findViewById(R.id.yld);
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0mVp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, this, null, null, null, new AwS600S0100000_21(this, 157), 28, null);
    }
}
