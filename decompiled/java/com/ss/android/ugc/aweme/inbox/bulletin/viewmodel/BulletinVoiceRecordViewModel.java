package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AnonymousClass0950;
import X.C005X;
import X.C01GW;
import X.C098200Yq;
import X.C09A1;
import X.C09IC;
import X.C09IR;
import X.C0OLV;
import X.C0OPQ;
import X.C0OPX;
import X.C0PEM;
import X.C0VSJ;
import X.C13LP;
import X.C1559260qg8;
import X.C189200o6;
import X.C1BNE;
import X.C20684815ws;
import X.C2151408bo;
import X.C2152808c2;
import X.C2153008c4;
import X.C2183208gw;
import X.C2183308gx;
import X.C2183808h2;
import X.C2184408h8;
import X.C2188811AlT;
import X.C2226908nz;
import X.C2228508oF;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C621330OYp;
import X.C621370OYt;
import X.C723600SZy;
import X.EnumC194439115h;
import X.EnumC194441115j;
import X.EnumC2227308o3;
import X.EnumC2228908oJ;
import X.EnumC2252401DDy;
import X.InterfaceC0148002o;
import X.InterfaceC1256404vq;
import X.InterfaceC332260D0u;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoiceDraftManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS18S0010000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BulletinVoiceRecordViewModel extends AssemViewModel<C005X> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C0OLV.class, "bulletin_board_param"), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS547S0100000_3(this, 32));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 31));
    public boolean LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final C2252321DDq LLJI;
    public final C2226908nz LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final C2184408h8 LLJILJILJ;
    public final C2252321DDq LLJILLL;
    public final C2252331DDr LLJJ;
    public final C621370OYt LLJJI;
    public final C2183208gw LLJJIII;
    public final C2252331DDr LLJJIJI;
    public final AnonymousClass0950 LLJJIJIIJIL;
    public C2228508oF LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public File LLJJJJ;
    public long LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        BulletinVoiceDraftManager.DraftMeta draftMeta;
        Object value = this.LLILZIL.getValue();
        EnumC194439115h enumC194439115h = EnumC194439115h.RECORDING;
        if ((value != enumC194439115h && value != EnumC194439115h.PAUSED && value != EnumC194439115h.PREVIEW) || this.LLJJJ.length() == 0 || this.LLJJJJ == null) {
            draftMeta = null;
        } else {
            if (value == enumC194439115h) {
                C2228508oF c2228508oF = this.LLJJIJIL;
                if (c2228508oF != null) {
                    c2228508oF.LIZIZ();
                }
                this.LLJILJILJ.LIZ();
                C2228508oF c2228508oF2 = this.LLJJIJIL;
                if (c2228508oF2 != null) {
                    c2228508oF2.LJI();
                }
                this.LLJJIJIL = null;
            }
            this.LLJJI.LJIIJ();
            long jLongValue = ((Number) this.LLJILJILJ.LIZIZ.getValue()).longValue();
            File file = this.LLJJJJ;
            long jLIZIZ = file != null ? C2183808h2.LIZIZ(C2183808h2.LIZ(), file) : 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VoiceRecordVM: captureDraftIfNeeded state=");
            sbLIZ.append(value);
            sbLIZ.append(" timerMs=");
            sbLIZ.append(jLongValue);
            sbLIZ.append(" wavMs=");
            sbLIZ.append(jLIZIZ);
            sbLIZ.append(" diff=");
            sbLIZ.append(jLongValue - jLIZIZ);
            sbLIZ.append("ms");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            draftMeta = new BulletinVoiceDraftManager.DraftMeta(this.LLJJJ, jLongValue, (List) this.LLJILJIL.getValue(), 0L, 8, null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VoiceRecordVM: onCleared() draftPending=");
        sbLIZ2.append(draftMeta != null);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        if (draftMeta != null) {
            BulletinVoiceDraftManager.LIZJ.put(yQ2().LIZ, draftMeta);
        }
        super.onCleared();
        this.LLJJI.LJI();
        C2228508oF c2228508oF3 = this.LLJJIJIL;
        if (c2228508oF3 != null && c2228508oF3.LJII.get()) {
            c2228508oF3.LJI();
        }
        this.LLJJIJIL = null;
        this.LLJILJILJ.LIZIZ();
        if (this.LLILZ || draftMeta != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)), null, null, new C2153008c4(draftMeta, yQ2(), zQ2(), draftMeta == null, null), 3);
        }
    }

    public final boolean AQ2() {
        Object value = this.LLILZIL.getValue();
        return value == EnumC194439115h.PAUSED || value == EnumC194439115h.PREVIEW;
    }

    public final List<Float> CQ2() {
        List<Float> listLLIIII;
        C2226908nz c2226908nz = this.LLJIJIL;
        synchronized (c2226908nz.LIZ) {
            try {
                listLLIIII = C13LP.LLIIII(c2226908nz.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLLIIII;
    }

    public final C2151408bo HQ2() throws Throwable {
        BulletinVoiceDraftManager.DraftMeta draftMetaLJI;
        File[] fileArrListFiles;
        Object next;
        if (this.LLILZIL.getValue() != EnumC194439115h.INITIAL || (draftMetaLJI = yQ2().LJI()) == null) {
            return null;
        }
        try {
            yQ2().LIZIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C0VSJ c0vsjLJII = zQ2().LJII();
        if (c0vsjLJII.exists() && (fileArrListFiles = c0vsjLJII.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.length() > 0) {
                    File[] fileArrListFiles2 = zQ2().LJII().listFiles();
                    if (fileArrListFiles2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (File file2 : fileArrListFiles2) {
                            if (file2.length() > 0) {
                                arrayList.add(file2);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                long jLastModified = ((File) next).lastModified();
                                do {
                                    Object next2 = it2.next();
                                    long jLastModified2 = ((File) next2).lastModified();
                                    if (jLastModified < jLastModified2) {
                                        next = next2;
                                        jLastModified = jLastModified2;
                                    }
                                } while (it2.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        File file3 = (File) next;
                        if (file3 != null && file3.length() > 44) {
                            int iLIZJ = C2183808h2.LIZJ(file3);
                            int iLIZ = C2183808h2.LIZ();
                            if (iLIZJ > 0 && iLIZJ != iLIZ) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("VoiceRecordVM: draft sample-rate mismatch (draft=");
                                sbLIZ.append(iLIZJ);
                                sbLIZ.append(", current=");
                                sbLIZ.append(iLIZ);
                                sbLIZ.append("). Cleaning.");
                                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                                try {
                                    C189200o6.m2constructorimpl(Boolean.valueOf(file3.delete()));
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                                }
                                yQ2().LIZ();
                                return null;
                            }
                            long jLIZIZ = C2183808h2.LIZIZ(iLIZ, file3);
                            long j = jLIZIZ > 0 ? jLIZIZ : draftMetaLJI.durationMs;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("VoiceRecordVM: tryRestoreDraftInternal metaMs=");
                            sbLIZ2.append(draftMetaLJI.durationMs);
                            sbLIZ2.append(" wavMs=");
                            sbLIZ2.append(jLIZIZ);
                            sbLIZ2.append(" durationMs=");
                            sbLIZ2.append(j);
                            sbLIZ2.append(" diff=");
                            sbLIZ2.append(draftMetaLJI.durationMs - jLIZIZ);
                            sbLIZ2.append("ms");
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                            return new C2151408bo(draftMetaLJI.fakeId, file3, j, draftMetaLJI.waveformData);
                        }
                    }
                    C0OPX.LJII("VoiceRecordVM: draft file missing or too small, cleaning");
                    yQ2().LIZ();
                    return null;
                }
            }
        }
        yQ2().LIZ();
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C005X(false);
    }

    public final String xQ2() {
        String str;
        C0OLV c0olv = (C0OLV) this.LL.getValue();
        return (c0olv == null || (str = c0olv.LL) == null) ? "" : str;
    }

    public final BulletinVoiceDraftManager yQ2() {
        return (BulletinVoiceDraftManager) this.LLILLL.getValue();
    }

    public final C2152808c2 zQ2() {
        return (C2152808c2) this.LLILLJJLI.getValue();
    }

    public BulletinVoiceRecordViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC194439115h.INITIAL);
        this.LLILZIL = c2252321DDqLIZ;
        this.LLILZLL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(EnumC194441115j.TAP);
        this.LLIZ = c2252321DDqLIZ2;
        this.LLIZLLLIL = c2252321DDqLIZ2;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(Boolean.FALSE);
        this.LLJ = c2252321DDqLIZ3;
        this.LLJI = c2252321DDqLIZ3;
        C2226908nz c2226908nz = new C2226908nz();
        this.LLJIJIL = c2226908nz;
        this.LLJILJIL = c2226908nz.LIZLLL;
        C2184408h8 c2184408h8 = new C2184408h8();
        this.LLJILJILJ = c2184408h8;
        this.LLJILLL = c2184408h8.LIZIZ;
        this.LLJJ = c2184408h8.LIZLLL;
        this.LLJJI = new C621370OYt(ViewModelKt.getViewModelScope(this));
        this.LLJJIII = new C2183208gw(0);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);
        this.LLJJIJI = c2252331DDrLIZIZ;
        this.LLJJIJIIJIL = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLJJJ = "";
        this.LLJJJIL = -1;
    }

    public final void vQ2() {
        if (AQ2()) {
            EQ2(EnumC2227308o3.DELETE);
        }
        this.LLJJI.LJIIJ();
        C2228508oF c2228508oF = this.LLJJIJIL;
        if (c2228508oF != null) {
            c2228508oF.LJI();
        }
        this.LLJJIJIL = null;
        this.LLJILJILJ.LIZIZ();
        this.LLJIJIL.LIZJ();
        C2152808c2 c2152808c2ZQ2 = zQ2();
        String str = this.LLJJJ;
        c2152808c2ZQ2.getClass();
        C0VSJ c0vsjLJII = c2152808c2ZQ2.LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".wav");
        new C0VSJ(c0vsjLJII, C2188811AlT.LIZIZ(sbLIZ)).delete();
        yQ2().LIZ();
        this.LLJ.setValue(Boolean.FALSE);
        this.LLIZ.setValue(EnumC194441115j.TAP);
        FQ2(EnumC194439115h.DELETED);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VoiceRecordVM deleted: fakeId=");
        sbLIZ2.append(this.LLJJJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void BQ2(EnumC2228908oJ enumC2228908oJ) {
        long jLIZ;
        if (this.LLILZIL.getValue() != EnumC194439115h.RECORDING) {
            return;
        }
        C2228508oF c2228508oF = this.LLJJIJIL;
        if (c2228508oF != null) {
            c2228508oF.LIZIZ();
        }
        C2226908nz c2226908nz = this.LLJIJIL;
        synchronized (c2226908nz.LIZ) {
            try {
                if (!((ArrayList) c2226908nz.LIZIZ).isEmpty()) {
                    ((ArrayList) c2226908nz.LIZIZ).clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJILJILJ.LIZ();
        long jLongValue = ((Number) this.LLJILJILJ.LIZIZ.getValue()).longValue();
        long j = jLongValue - this.LLJJJJJIL;
        if (j < 0) {
            j = 0;
        }
        this.LLJJIII.LIZJ = jLongValue;
        C2228508oF c2228508oF2 = this.LLJJIJIL;
        if (c2228508oF2 != null) {
            jLIZ = c2228508oF2.LIZ();
        } else {
            jLIZ = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceRecordVM: pause reason=");
        sbLIZ.append(enumC2228908oJ);
        sbLIZ.append(" timerMs=");
        sbLIZ.append(jLongValue);
        sbLIZ.append(" pcmMs=");
        sbLIZ.append(jLIZ);
        sbLIZ.append(" segmentMs=");
        sbLIZ.append(j);
        sbLIZ.append(" diff=");
        sbLIZ.append(jLongValue - jLIZ);
        sbLIZ.append("ms");
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        FQ2(EnumC194439115h.PAUSED);
        DQ2(enumC2228908oJ, j, jLongValue);
    }

    public final void EQ2(EnumC2227308o3 enumC2227308o3) {
        String str;
        String str2;
        String strXQ2 = xQ2();
        if (strXQ2.length() == 0) {
            return;
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        C2183208gw c2183208gw = this.LLJJIII;
        String str3 = c2183208gw.LIZ;
        boolean z = c2183208gw.LIZIZ;
        long j = c2183208gw.LIZJ;
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("channel_id", strXQ2);
        if (Intrinsics.LJFF(str3, "hold")) {
            str = "long_press_voice";
        } else {
            str = "click_voice_icon";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_used_locker", str2);
        c2344009Gk.LJIIIIZZ("total_duration", String.valueOf(j));
        c2344009Gk.LJIIIIZZ("action_type", enumC2227308o3.getEventValue());
        C20684815ws.LJIILLIIL("bulletin_voice_record_operation", c2344009Gk.LIZ);
    }

    public final void FQ2(EnumC194439115h enumC194439115h) {
        boolean z;
        this.LLILZIL.setValue(enumC194439115h);
        if (enumC194439115h != EnumC194439115h.RECORDING && enumC194439115h != EnumC194439115h.PAUSED && enumC194439115h != EnumC194439115h.PREVIEW) {
            z = false;
        } else {
            z = true;
        }
        setState(new AwS18S0010000_3(z, 3));
    }

    public final void wQ2(EnumC2228908oJ enumC2228908oJ) {
        if (this.LLILZIL.getValue() != EnumC194439115h.RECORDING || this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = true;
        long jLongValue = ((Number) this.LLJILJILJ.LIZIZ.getValue()).longValue();
        long j = jLongValue - this.LLJJJJJIL;
        if (j < 0) {
            j = 0;
        }
        this.LLJJIII.LIZJ = jLongValue;
        DQ2(enumC2228908oJ, j, jLongValue);
    }

    public final void GQ2(String str, String str2) {
        boolean z;
        EnumC194441115j enumC194441115j;
        if (this.LLILZIL.getValue() != EnumC194439115h.INITIAL && this.LLILZIL.getValue() != EnumC194439115h.DELETED) {
            return;
        }
        String str3 = this.LLJJJ;
        if (str3.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !Intrinsics.LJFF(str3, str)) {
            C621370OYt c621370OYt = this.LLJJI;
            if (Intrinsics.LJFF(c621370OYt.LJIIIIZZ, str3)) {
                c621370OYt.LIZ();
                c621370OYt.LIZLLL.setValue(null);
            }
            InterfaceC332260D0u<InterfaceC1256404vq> interfaceC332260D0uRemove = c621370OYt.LIZIZ.remove(str3);
            if (interfaceC332260D0uRemove != null) {
                interfaceC332260D0uRemove.setValue(C621330OYp.LIZ);
            }
            c621370OYt.LIZJ.remove(str3);
        }
        this.LLJJJ = str;
        C2252321DDq c2252321DDq = this.LLIZ;
        if (Intrinsics.LJFF(str2, "hold")) {
            enumC194441115j = EnumC194441115j.HOLD;
        } else {
            enumC194441115j = EnumC194441115j.TAP;
        }
        c2252321DDq.setValue(enumC194441115j);
        C2183208gw c2183208gw = this.LLJJIII;
        c2183208gw.LIZIZ = false;
        c2183208gw.LIZJ = 0L;
        c2183208gw.LIZ = str2;
        this.LLJIJIL.LIZJ();
        this.LLJILJILJ.LIZIZ();
        this.LLJ.setValue(Boolean.FALSE);
        C2228508oF c2228508oF = new C2228508oF(new AwS547S0100000_3(this, 34), new AwS582S0100000_3(this, 43), new AwS582S0100000_3(this, 44));
        try {
            C2152808c2 c2152808c2ZQ2 = zQ2();
            File[] fileArrListFiles = c2152808c2ZQ2.LJII().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            C0VSJ c0vsjLJII = c2152808c2ZQ2.LJII();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".wav");
            C0VSJ c0vsj = new C0VSJ(c0vsjLJII, C2188811AlT.LIZIZ(sbLIZ));
            c2228508oF.LJ(c0vsj);
            this.LLJJJJ = c0vsj;
            this.LLJJIJIL = c2228508oF;
            C2184408h8 c2184408h8 = this.LLJILJILJ;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
            AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(this, 33);
            c2184408h8.LJ = 0L;
            c2184408h8.LJIIIIZZ = -1;
            c2184408h8.LJIIIZ = awS547S0100000_3;
            c2184408h8.LJFF = System.nanoTime();
            c2184408h8.LJI = true;
            c2184408h8.LJII = C23250099c.LIZLLL(viewModelScope, null, null, new C2183308gx(c2184408h8, null), 3);
            this.LLJJJJJIL = 0L;
            this.LLJJJJLIIL = false;
            FQ2(EnumC194439115h.RECORDING);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VoiceRecordVM started: fakeId=");
            sbLIZ2.append(str);
            sbLIZ2.append(", method=");
            sbLIZ2.append(str2);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("VoiceRecordVM start failed: ");
            sbLIZ3.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
            FQ2(EnumC194439115h.INITIAL);
        }
    }

    public final void DQ2(EnumC2228908oJ enumC2228908oJ, long j, long j2) {
        String str;
        String str2;
        String strXQ2 = xQ2();
        if (strXQ2.length() == 0) {
            return;
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        C2183208gw c2183208gw = this.LLJJIII;
        String str3 = c2183208gw.LIZ;
        boolean z = c2183208gw.LIZIZ;
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("channel_id", strXQ2);
        if (Intrinsics.LJFF(str3, "hold")) {
            str = "long_press_voice";
        } else {
            str = "click_voice_icon";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_used_locker", str2);
        c2344009Gk.LJIIIIZZ("exit_method", enumC2228908oJ.getEventValue());
        c2344009Gk.LJIIIIZZ("duration", String.valueOf(j));
        c2344009Gk.LJIIIIZZ("total_duration", String.valueOf(j2));
        C20684815ws.LJIILLIIL("bulletin_voice_record_end", c2344009Gk.LIZ);
    }
}
