package com.ss.android.ugc.aweme.publish.service;

import X.C01GW;
import X.C054G;
import X.C0C64;
import X.C0M4M;
import X.C0MAY;
import X.C0PEM;
import X.C0WYJ;
import X.C0WYK;
import X.C12EI;
import X.C1352605Rc;
import X.C1438570nXT;
import X.C1BWL;
import X.C20182913y7;
import X.C20183913yH;
import X.C201955140j;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C256080A1u;
import X.C273270AnN;
import X.C452501pT;
import X.C553680Lna;
import X.C562260M3k;
import X.C855060XgW;
import X.EnumC562220M3g;
import X.InterfaceC1352705Rd;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes30.dex */
public final class InternalDraftSizeCalculatorImpl implements IInternalDraftSizeCalculator {
    public long LIZIZ;
    public boolean LIZJ;
    public Long LJ;
    public boolean LJI;
    public C12EI LJIIJJI;
    public final String LIZ = "InternalDraftSizeCalculator";
    public final ConcurrentHashMap<String, Long> LIZLLL = new ConcurrentHashMap<>();
    public long LJFF = -1;
    public final List<InterfaceC1352705Rd> LJII = new ArrayList();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(608));
    public final C054G LJIIIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final Object LJIIJ = new Object();

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final void LIZJ() {
        this.LJ = null;
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" getDraftSize, markLeavePublishPage");
        C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final boolean LJ() {
        return ((Boolean) C273270AnN.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final void LIZLLL() {
        IAVDraftService iAVDraftServiceDraftService;
        if (C256080A1u.LIZ() && !this.LJI) {
            this.LJI = true;
            C553680Lna c553680LnaQueryDraftsInfo = null;
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (iAVDraftServiceDraftService = iExternalService.draftService()) != null) {
                c553680LnaQueryDraftsInfo = iAVDraftServiceDraftService.queryDraftsInfo(new C0M4M(true, false, EnumC562220M3g.NORMAL, (C562260M3k) null, true));
            }
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" refreshDraftBoxSize, calculate result, ");
            sbLIZ.append(c553680LnaQueryDraftsInfo != null ? Long.valueOf(c553680LnaQueryDraftsInfo.LJFF) : null);
            C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
            if (c553680LnaQueryDraftsInfo != null) {
                this.LJFF = c553680LnaQueryDraftsInfo.LJFF;
            }
            this.LJI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final long LJII() {
        if (!(C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_draft_calculator_summary", true) != 0)) {
            return 0L;
        }
        if (this.LJFF < 0) {
            LIZLLL();
            return this.LJFF;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" getDraftBoxSize, use lastVisibleDraftBoxSize, ");
        sbLIZ.append(this.LJFF);
        C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final boolean LJIIIIZZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_draft_calculator_summary", true) != 0;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        this.LJ = this.LIZLLL.get(videoPublishEditModel.getCreativeInfo().getCreationId());
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" getDraftSize, markEnterPublishPage, ");
        sbLIZ.append(this.LJ);
        C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final void LIZIZ(C855060XgW c855060XgW) {
        ((ArrayList) this.LJII).remove(c855060XgW);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final void LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (!C256080A1u.LIZ()) {
            return;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" calculateDraftSize start");
        C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
        if (((Number) this.LJIIIIZZ.getValue()).longValue() < 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(" calculateDraftSize, ignore, reason: gap<0");
            C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        synchronized (this.LJIIJ) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.LIZJ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LIZ);
                    sbLIZ3.append(" calculateDraftSize, ignore, reason: isCalculating");
                    C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                long j = this.LIZIZ;
                if (j > 0 && jCurrentTimeMillis - j < ((Number) this.LJIIIIZZ.getValue()).longValue()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(this.LIZ);
                    sbLIZ4.append(" calculateDraftSize, ignore, reason: gap limit");
                    C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                this.LIZJ = true;
                this.LIZIZ = jCurrentTimeMillis;
                C23250099c.LIZLLL(this.LJIIIZ, null, null, new C1352605Rc(this, videoPublishEditModel, null), 3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final void LJI(C855060XgW c855060XgW) {
        ((ArrayList) this.LJII).add(c855060XgW);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator
    public final Long LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (this.LJ != null) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" getDraftSize, use publishMarkSize");
            C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
            return this.LJ;
        }
        C0MAY c0may2 = C0MAY.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(" getDraftSize, use cachedDraftSize");
        C201955140j.LJIILJJIL(c0may2, C2188811AlT.LIZIZ(sbLIZ2));
        return this.LIZLLL.get(videoPublishEditModel.getCreativeInfo().getCreationId());
    }

    public final long LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        AwemeDraft awemeDraftLIZLLL;
        long j;
        if (((Boolean) C273270AnN.LIZ.getValue()).booleanValue()) {
            new C1438570nXT("DraftSizeCalculator");
            awemeDraftLIZLLL = C1438570nXT.LIZLLL(videoPublishEditModel.clone());
        } else {
            new C1438570nXT("DraftSizeCalculator");
            awemeDraftLIZLLL = C1438570nXT.LIZLLL(videoPublishEditModel);
        }
        C20182913y7 c20182913y7 = new C20182913y7();
        C12EI c12ei = this.LJIIJJI;
        if (c12ei == null) {
            C0WYK c0wykLJIILLIIL = C0WYJ.LJIILLIIL(C1BWL.LIZ());
            j = c0wykLJIILLIIL.LIZIZ;
            this.LJIIJJI = new C12EI(j, c0wykLJIILLIIL.LIZ, c0wykLJIILLIIL.LJ);
        } else {
            j = c12ei.LIZ;
        }
        Iterator<C20183913yH> it2 = c20182913y7.LIZLLL(awemeDraftLIZLLL, Long.valueOf(j)).iterator();
        long j2 = 0;
        while (it2.hasNext()) {
            j2 += it2.next().LJ;
        }
        return j2;
    }
}
