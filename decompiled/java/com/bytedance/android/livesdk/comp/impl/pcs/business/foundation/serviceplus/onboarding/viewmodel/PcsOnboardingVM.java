package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel;

import X.AbstractC1825390xbN;
import X.AbstractC1825450xbT;
import X.AnonymousClass0950;
import X.C09IC;
import X.C09IR;
import X.C1097400efC;
import X.C1106750euH;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1148760g02;
import X.C13BV;
import X.C13LP;
import X.C1410610moN;
import X.C1410730moZ;
import X.C1410780moe;
import X.C1410960mow;
import X.C1410970mox;
import X.C1411040mp4;
import X.C1411350mpZ;
import X.C1411390mpd;
import X.C1411420mpg;
import X.C1411430mph;
import X.C1411440mpi;
import X.C15438062q;
import X.C1554960qZC;
import X.C1697810uHb;
import X.C1822260xWK;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C23250099c;
import X.C262100zr;
import X.C518640KVq;
import X.EnumC2252401DDy;
import X.InterfaceC0148002o;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1555100qZQ;
import X.InterfaceC518660KVs;
import X.InterfaceC665370Q7z;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: loaded from: classes23.dex */
public final class PcsOnboardingVM extends AssemViewModel<C1411350mpZ> {
    public final InterfaceC518660KVs LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C1822260xWK LLILLL;
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public List<? extends AbstractC1825390xbN> LLIZLLLIL;
    public final ObservableBoolean LLJ;
    public final ObservableBoolean LLJI;
    public final String LLJIJIL;
    public String LLJILJIL;
    public List<String> LLJILJILJ;
    public SMBOptInStep LLJILLL;
    public int LLJJ;
    public final int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public C1148760g02 LLJJJIL;

    public final List<AbstractC1825450xbT> FQ2() {
        List<? extends AbstractC1825390xbN> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1825390xbN abstractC1825390xbN : list) {
            if (abstractC1825390xbN instanceof AbstractC1825450xbT) {
                arrayList.add(abstractC1825390xbN);
            }
        }
        return arrayList;
    }

    public final int GQ2() {
        List<? extends AbstractC1825390xbN> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC1825390xbN abstractC1825390xbN : list) {
            if (abstractC1825390xbN instanceof AbstractC1825450xbT) {
                arrayList.add(abstractC1825390xbN);
            }
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((AbstractC1825450xbT) it2.next()).LIZ && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final C1822260xWK JQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            C1822260xWK c1822260xWK = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1822260xWK.class, null)) != null) {
                c1822260xWK = (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c1822260xWK;
        }
        return this.LLILLL;
    }

    public final void LJJJJL() {
        setState(new C1410970mox());
    }

    public final void LJLJLJ() {
        setState(new C1410960mow());
    }

    public final void SQ2() {
        if (this.LLJILJIL.length() == 0) {
            String strLIZ = InterfaceC1106030et7.o8.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            this.LLJILJIL = strLIZ;
        }
        if (this.LLJILJILJ.isEmpty()) {
            List<String> listLIZ = InterfaceC1106030et7.p8.LIZ();
            if (listLIZ == null) {
                listLIZ = C13BV.INSTANCE;
            }
            this.LLJILJILJ = listLIZ;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1411350mpZ(0);
    }

    public final int xQ2() {
        SMBOptInStep sMBOptInStep = this.LLJILLL;
        if (sMBOptInStep == null) {
            return -1;
        }
        List<SMBOptInStep> listLIZ = C1411040mp4.LIZ(getState().LLILZIL, this.LLJJIII);
        int iIndexOf = listLIZ.indexOf(sMBOptInStep);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        Iterator<SMBOptInStep> it2 = listLIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = it2.next().type;
            if (i2 == 9 || i2 == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean AQ2() {
        List<SMBOptInStep> list = getState().LLILZIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SMBOptInStep> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().type == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean BQ2() {
        List<SMBOptInStep> list = getState().LLILZIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SMBOptInStep> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().type == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean CQ2() {
        return BQ2() || this.LLJJIJIL;
    }

    public final PcsServicePlusOptinPageParams DQ2() {
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        C1822260xWK c1822260xWKJQ2 = JQ2();
        return (c1822260xWKJQ2 == null || (pcsServicePlusOptinPageParams = c1822260xWKJQ2.LLILLJJLI) == null) ? new PcsServicePlusOptinPageParams("", "", "", 0L, "", new HashMap()) : pcsServicePlusOptinPageParams;
    }

    public final SMBOptInQualificationResponse.ResponseData EQ2() {
        return getState().LLILLJJLI;
    }

    public final int KQ2() {
        return C1411040mp4.LIZ(getState().LLILZIL, this.LLJJIII).size();
    }

    public final String LQ2() {
        return (C1122150fJ7.LIZLLL(EQ2()) && this.LLILZLL + 1 == 2) ? "business" : "individual";
    }

    public final boolean MQ2() {
        List<SMBOptInStep> list = getState().LLILZIL;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<SMBOptInStep> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().type == 7 && (i = i + 1) < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        return i > 0;
    }

    public final boolean NQ2() {
        return (CQ2() || !yQ2() || zQ2()) ? false : true;
    }

    public final boolean OQ2() {
        return (CQ2() || yQ2() || !zQ2()) ? false : true;
    }

    public final boolean PQ2() {
        return (!AQ2() || CQ2() || yQ2() || zQ2()) ? false : true;
    }

    public final boolean QQ2() {
        return (!CQ2() || yQ2() || zQ2()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean RQ2() {
        /*
            r9 = this;
            X.002o r0 = r9.getState()
            X.0mpZ r0 = (X.C1411350mpZ) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SMBOptInStep> r1 = r0.LLILZIL
            boolean r0 = r1 instanceof java.util.Collection
            r8 = 1
            if (r0 == 0) goto L15
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L15
        L13:
            r8 = 0
            return r8
        L15:
            java.util.Iterator r7 = r1.iterator()
            r6 = 0
        L1a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6e
            r7.next()
            X.002o r0 = r9.getState()
            X.0mpZ r0 = (X.C1411350mpZ) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SMBOptInStep> r1 = r0.LLILZIL
            boolean r0 = r1 instanceof java.util.Collection
            r5 = 0
            if (r0 == 0) goto L44
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L44
        L36:
            boolean r0 = r9.MQ2()
            if (r0 == 0) goto L1a
        L3c:
            int r6 = r6 + 1
            if (r6 >= 0) goto L1a
            X.C1697810uHb.LJIJ()
            throw r5
        L44:
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L49:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r2 = r4.next()
            com.bytedance.android.livesdk.chatroom.api.SMBOptInStep r2 = (com.bytedance.android.livesdk.chatroom.api.SMBOptInStep) r2
            int r1 = r2.type
            r0 = 8
            if (r1 != r0) goto L49
            boolean r0 = r2.isMandatory
            if (r0 == 0) goto L49
            boolean r0 = r2.isCompleted
            if (r0 != 0) goto L49
            int r3 = r3 + 1
            if (r3 >= 0) goto L49
            X.C1697810uHb.LJIJ()
            throw r5
        L6b:
            if (r3 <= 0) goto L36
            goto L3c
        L6e:
            if (r6 <= 0) goto L13
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM.RQ2():boolean");
    }

    public final void vQ2() {
        List<SMBOptInStep> listLIZJ = C1411040mp4.LIZJ(getState().LLILZIL, this.LLJJIII);
        while (this.LLJJ < ((ArrayList) listLIZJ).size() - 1) {
            int i = this.LLJJ + 1;
            this.LLJJ = i;
            SMBOptInStep sMBOptInStep = (SMBOptInStep) C13LP.LJJJLZIJ(i, listLIZJ);
            this.LLJILLL = sMBOptInStep;
            if (sMBOptInStep == null || !sMBOptInStep.isCompleted) {
                return;
            }
        }
    }

    public final boolean yQ2() {
        List<SMBOptInStep> list = getState().LLILZIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SMBOptInStep> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().type == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zQ2() {
        List<SMBOptInStep> list = getState().LLILZIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SMBOptInStep> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().type == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public PcsOnboardingVM(C518640KVq c518640KVq) {
        this.LL = c518640KVq;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 16, EnumC2252401DDy.DROP_OLDEST, 1);
        this.LLILZ = c2252331DDrLIZIZ;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLILZLL = -1;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLIZLLLIL = c13bv;
        this.LLJ = new ObservableBoolean(false);
        this.LLJI = new ObservableBoolean(false);
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = c13bv;
        this.LLJJ = -1;
        this.LLJJI = 1;
        this.LLJJIJIIJIL = "recommended";
    }

    public final void TQ2(Function1<? super Throwable, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestOptinQualification LivePcsOnboardingPerfOptSetting.enabledFrontPrefetch()=");
        LivePcsOnboardingPerfOptSetting livePcsOnboardingPerfOptSetting = LivePcsOnboardingPerfOptSetting.INSTANCE;
        sbLIZ.append(livePcsOnboardingPerfOptSetting.enabledFrontPrefetch());
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (livePcsOnboardingPerfOptSetting.enabledFrontPrefetch()) {
            C1106750euH c1106750euH = C1106750euH.LIZ;
            C1106750euH.LIZ.LJI("/webcast/sub/smb/qualification/", C2097608Jq.LJ(), SMBOptInQualificationResponse.ResponseData.class, new C1410780moe(this, function1), new C1410730moZ(this, function1), 1000L);
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1410610moN(this, function1, null), 3);
    }

    public final void VQ2(C262100zr c262100zr) {
        Map<String, Object> mapLJ;
        List<String> list;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null || (mapLJ = interfaceC1107590evd.LIZ()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("questions");
        if ((obj instanceof List) && (list = (List) obj) != null) {
            this.LLJILJILJ = list;
            InterfaceC1106030et7.p8.LIZJ(list);
        }
    }

    public final void WQ2(List<SMBOptInStep> list) {
        if (!LivePcsOnboardingPerfOptSetting.INSTANCE.enabledLynxPreload() || ((ArrayList) C1411040mp4.LIZJ(list, this.LLJJIII)).isEmpty()) {
            return;
        }
        C1148760g02 c1148760g02 = this.LLJJJIL;
        if (c1148760g02 != null) {
            C1097400efC.LIZJ(c1148760g02);
        }
        C1148760g02 c1148760g022 = new C1148760g02(0);
        this.LLJJJIL = c1148760g022;
        C1411440mpi c1411440mpi = new C1411440mpi(this);
        C1411430mph c1411430mph = new C1411430mph(this);
        C1411420mpg c1411420mpg = new C1411420mpg(this);
        c1148760g022.LJI = list;
        c1148760g022.LJII = c1411440mpi;
        c1148760g022.LJIIIIZZ = c1411430mph;
        c1148760g022.LJIIIZ = c1411420mpg;
        StringBuilder sb = new StringBuilder("PcsOnboardingStepsPreloadScene.initData opt_in_steps_count=");
        sb.append(list.size());
        sb.append(" types=");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SMBOptInStep> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().type));
        }
        sb.append(arrayList);
        C1121890fIh.LIZ(sb.toString());
        C1148760g02 c1148760g023 = this.LLJJJIL;
        if (c1148760g023 != null) {
            C1097400efC.LIZIZ(c1148760g023);
        }
    }

    public final void YQ2(SMBOptInQualificationResponse.ResponseData responseData) {
        boolean z;
        SMBVerificationInfo sMBVerificationInfo;
        SMBKYBInfo sMBKYBInfo;
        ObservableBoolean observableBoolean = this.LLJ;
        boolean z2 = true;
        if (responseData != null && responseData.hasLivePermission == 0) {
            z = true;
        } else {
            z = false;
        }
        observableBoolean.set(z);
        ObservableBoolean observableBoolean2 = this.LLJI;
        if (responseData == null || (sMBVerificationInfo = responseData.verificationInfo) == null || (sMBKYBInfo = sMBVerificationInfo.kybInfo) == null || sMBKYBInfo.status != 2) {
            z2 = false;
        }
        observableBoolean2.set(z2);
    }

    public final boolean wQ2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAllowDMDialogNeeded preDMStep=");
        sbLIZ.append(z);
        sbLIZ.append(" isAllowedDM=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(" canEveryoneSendDm.not()=");
        sbLIZ.append(!getState().LLILZ);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (z && !this.LLIZ && !getState().LLILZ) {
            return true;
        }
        return false;
    }

    public final void XQ2(Throwable th, Function0<Unit> function0) {
        setState(new C1411390mpd(th, function0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r21, webcast.api.sub.SMBServiceSwitchInfoResponse.ResponseData r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM.HQ2(kotlin.jvm.functions.Function1, webcast.api.sub.SMBServiceSwitchInfoResponse$ResponseData, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IQ2(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r21, webcast.api.smb.GetSMBOptInProgressResponse.ResponseData r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM.IQ2(kotlin.jvm.functions.Function1, webcast.api.smb.GetSMBOptInProgressResponse$ResponseData, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object UQ2(java.lang.String r17, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r18, webcast.api.sub.SMBOptInQualificationResponse.ResponseData r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM.UQ2(java.lang.String, kotlin.jvm.functions.Function1, webcast.api.sub.SMBOptInQualificationResponse$ResponseData, X.05Vn):java.lang.Object");
    }
}
