package com.ss.android.ugc.aweme.poi.osp.component;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1193190h9h;
import X.C1193260h9o;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.osp.assem.PoiOrderSubmitSheetViewModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitSkuListAssem extends BaseSlashReusedComponent<SkuListData> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1669));
    public List<SkuData> LLJLIL = new ArrayList();
    public final Map<String, C1193190h9h> LLJLILLLLZIIL = new LinkedHashMap();
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitSkuListAssem.class, "mainVm", "getMainVm()Lcom/ss/android/ugc/aweme/poi/osp/PoiOrderSubmitViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiOrderSubmitSkuListAssem.class, "panelVm", "getPanelVm()Lcom/ss/android/ugc/aweme/poi/osp/assem/PoiOrderSubmitSheetViewModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiOrderSubmitSkuListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiOrderSubmitViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1671), null, AFwS256S0000000_18.get$arr$(538));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiOrderSubmitSheetViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1672), null, AFwS256S0000000_18.get$arr$(539));
        this.LLJLLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1670));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e5p;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final String IY1() {
        return C13LP.LJJLIIIJ(this.LLJLIL, null, null, null, 0, null, AFwS256S0000000_18.get$arr$(537), 31);
    }

    public final C1193260h9o sp() {
        return (C1193260h9o) this.LLJL.getValue();
    }

    public final PoiOrderSubmitSheetViewModel tp() {
        return (PoiOrderSubmitSheetViewModel) this.LLJLLIL.getValue(this, LLJZ[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[PHI: r6
      0x0078: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String), (r6v5 java.lang.String) binds: [B:40:0x0067, B:44:0x0070, B:46:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f A[PHI: r6 r14
      0x007f: PHI (r6v4 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:48:0x007d, B:46:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r14v3 java.util.Map<java.lang.String, java.lang.Object>) = (r14v0 java.util.Map<java.lang.String, java.lang.Object>), (r14v4 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:48:0x007d, B:46:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085 A[PHI: r6 r14
      0x0085: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:48:0x007d, B:50:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r14v2 java.util.Map<java.lang.String, java.lang.Object>) = (r14v0 java.util.Map<java.lang.String, java.lang.Object>), (r14v3 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:48:0x007d, B:50:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fm1() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitSkuListAssem.fm1():void");
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJLL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJZ;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0h9q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159320gH4) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 144), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLL.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0h9t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159320gH4) obj).LLILZ;
            }
        }, null, new AwS632S0100000_18(this, 145), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0115 A[PHI: r1
      0x0115: PHI (r1v25 java.lang.String) = (r1v4 java.lang.String), (r1v26 java.lang.String) binds: [B:60:0x0113, B:58:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119 A[PHI: r1
      0x0119: PHI (r1v24 java.lang.String) = (r1v4 java.lang.String), (r1v25 java.lang.String) binds: [B:60:0x0113, B:62:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128 A[PHI: r1
      0x0128: PHI (r1v22 java.lang.String) = (r1v6 java.lang.String), (r1v23 java.lang.String) binds: [B:69:0x0126, B:67:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c A[PHI: r1
      0x012c: PHI (r1v21 java.lang.String) = (r1v6 java.lang.String), (r1v22 java.lang.String) binds: [B:69:0x0126, B:71:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData r14) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitSkuListAssem.up(com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData):void");
    }
}
