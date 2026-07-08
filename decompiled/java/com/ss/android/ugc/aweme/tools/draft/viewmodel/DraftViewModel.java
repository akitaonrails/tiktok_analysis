package com.ss.android.ugc.aweme.tools.draft.viewmodel;

import X.AnonymousClass0880;
import X.C01GW;
import X.C054G;
import X.C08CX;
import X.C099R;
import X.C09AE;
import X.C09BV;
import X.C09X7;
import X.C0LCT;
import X.C0M08;
import X.C0M0F;
import X.C0M0P;
import X.C0M4A;
import X.C0M4E;
import X.C0MAY;
import X.C0PEM;
import X.C13LP;
import X.C15438062q;
import X.C19719612Di;
import X.C1AF0;
import X.C1DFH;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2330409Be;
import X.C452501pT;
import X.C539070LCf;
import X.C560530Lyd;
import X.C561140Lzc;
import X.C561950M2f;
import X.C562260M3k;
import X.C562270M3l;
import X.C562560M4o;
import X.C571420Mb6;
import X.C571770Mbf;
import X.EnumC545550LaT;
import X.EnumC562220M3g;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.model.RFCDraftModel;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class DraftViewModel extends ViewModel {
    public static final /* synthetic */ int LLL = 0;
    public RFCDraftModel LLILZLL;
    public int LLJILJILJ;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public final MutableLiveData<Boolean> LLJJIJIIJIL;
    public final MutableLiveData LLJJIJIL;
    public final MutableLiveData<Integer> LLJJJ;
    public final MutableLiveData LLJJJIL;
    public boolean LLJJJJ;
    public final C560530Lyd<Unit> LLJJJJJIL;
    public final C560530Lyd LLJJJJLIIL;
    public final MutableLiveData<Long> LLJJL;
    public final MutableLiveData LLJJLIIIJLLLLLLLZ;
    public final C560530Lyd<Boolean> LLJL;
    public final C560530Lyd<List<C561950M2f>> LLJLIL;
    public final C560530Lyd LLJLILLLLZIIL;
    public final C560530Lyd<Pair<Integer, Boolean>> LLJLL;
    public final C560530Lyd LLJLLIL;
    public final Map<String, C09AE> LLJLLL;
    public final C054G LLJZ;
    public final C01GW LLJZIJLIL;
    public final String LL = "DraftViewModel";
    public final Set<C0M0P> LLILLJJLI = new HashSet();
    public final Set<C0M0P> LLILLL = new HashSet();
    public final List<C561950M2f> LLILZ = new ArrayList();
    public String LLILZIL = "";
    public final MutableLiveData<Pair<String, Boolean>> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Pair<AwemeDraft, Boolean>> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<AwemeDraft> LLJ = new MutableLiveData<>();
    public final MutableLiveData<C571420Mb6> LLJI = new MutableLiveData<>();
    public final C561140Lzc LLJIJIL = new C561140Lzc();
    public final MutableLiveData<Boolean> LLJILJIL = new MutableLiveData<>();
    public final int LLJILLL = 48;
    public long LLJJIJI = -1;

    public final void AQ2() {
        int iLIZLLL = C0M4A.LIZLLL(new C0M4E(null, null, null, false, BQ2(), null, null, null, false, null, 1007));
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" getAllDraftSize: ");
        sbLIZ.append(iLIZLLL);
        C201955140j.LJII(c0may, C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJI = iLIZLLL;
    }

    public final boolean DQ2() {
        for (C561950M2f c561950M2f : (ArrayList) this.LLILZ) {
            if (c561950M2f.LIZ() == 101 || c561950M2f.LIZ() == 106 || c561950M2f.LIZ() == 109) {
                return false;
            }
        }
        return true;
    }

    public DraftViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.TRUE);
        this.LLJJIJIIJIL = mutableLiveData;
        this.LLJJIJIL = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LLJJJ = mutableLiveData2;
        this.LLJJJIL = mutableLiveData2;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJJJJJIL = c560530Lyd;
        this.LLJJJJLIIL = c560530Lyd;
        MutableLiveData<Long> mutableLiveData3 = new MutableLiveData<>();
        this.LLJJL = mutableLiveData3;
        this.LLJJLIIIJLLLLLLLZ = mutableLiveData3;
        this.LLJL = new C560530Lyd<>();
        C560530Lyd<List<C561950M2f>> c560530Lyd2 = new C560530Lyd<>();
        this.LLJLIL = c560530Lyd2;
        this.LLJLILLLLZIIL = c560530Lyd2;
        C560530Lyd<Pair<Integer, Boolean>> c560530Lyd3 = new C560530Lyd<>();
        this.LLJLL = c560530Lyd3;
        this.LLJLLIL = c560530Lyd3;
        this.LLJLLL = new LinkedHashMap();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(237));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" -> onCleared: ");
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
    }

    public EnumC562220M3g BQ2() {
        return EnumC562220M3g.NORMAL;
    }

    public final void CQ2(C562260M3k c562260M3k) {
        int i;
        int iLIZLLL = C0M4A.LIZLLL(new C0M4E(null, null, null, false, BQ2(), null, c562260M3k, null, false, null, 943));
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" getTotalPage: ");
        sbLIZ.append(iLIZLLL);
        C201955140j.LJII(c0may, C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = iLIZLLL;
        int i2 = this.LLJILLL;
        int i3 = iLIZLLL / i2;
        if (iLIZLLL % i2 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        this.LLJILJILJ = i3 + i;
    }

    public final void EQ2(List<String> list) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ == null || list.isEmpty()) {
            return;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeDraftWithAsyncTasks creationId: ");
        sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        C201955140j.LIZLLL(c0may, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2330409Be(list, iCreationAsyncTaskManagerLIZ, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C0M0E
            if (r0 == 0) goto L65
            r6 = r9
            X.0M0E r6 = (X.C0M0E) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r7 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L4e
            if (r0 != r3) goto L6b
            X.C155000ia.LIZIZ(r7)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r7)
            X.0M3g r1 = r8.BQ2()
            X.0M3g r0 = X.EnumC562220M3g.POSTED
            if (r1 == r0) goto L73
            java.util.List<X.0M2f> r0 = r8.LLILZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L73
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0M09 r0 = new X.0M09
            r0.<init>(r4)
            r6.LLILLL = r2
            java.lang.Object r7 = X.C23250099c.LJI(r6, r1, r0)
            if (r7 != r5) goto L51
            return r5
        L4e:
            X.C155000ia.LIZIZ(r7)
        L51:
            X.0Lna r7 = (X.C553680Lna) r7
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.09Bn r0 = new X.09Bn
            r0.<init>(r7, r8, r4)
            r6.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r6, r1, r0)
            if (r0 != r5) goto L26
            return r5
        L65:
            X.0M0E r6 = new X.0M0E
            r6.<init>(r8, r9)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.FQ2(X.05Vn):java.lang.Object");
    }

    public final void GQ2(boolean z) {
        Object next;
        C0M0F c0m0f;
        C0M0F c0m0f2;
        C19719612Di.LJJIIJ(this.LLILZ, AFwS239S0000000_8.get$arr$(164), true);
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C0M0F) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C561950M2f c561950M2f = (C561950M2f) next;
        if (c561950M2f != null) {
            if (this.LLJJ < this.LLJJI) {
                if ((c561950M2f instanceof C0M0F) && (c0m0f2 = (C0M0F) c561950M2f) != null) {
                    c0m0f2.LJ = 0;
                }
            } else if ((c561950M2f instanceof C0M0F) && (c0m0f = (C0M0F) c561950M2f) != null) {
                c0m0f.LJ = 8;
            }
        }
        if (z) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C09X7(this, null), 3);
        }
    }

    public final void IQ2(boolean z) {
        Boolean value = this.LLJJIJIIJIL.getValue();
        if (value == null || !Intrinsics.LJFF(value, Boolean.valueOf(z))) {
            this.LLJJIJIIJIL.setValue(Boolean.valueOf(z));
        }
    }

    public final void zQ2(List<C0M0P> list) {
        Set setLIZIZ;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ2 == null || iCreationAsyncTaskManagerLIZ2.LJIILIIL() == null || (setLIZIZ = C0LCT.LIZIZ()) == null) {
            setLIZIZ = C08CX.INSTANCE;
        }
        ArrayList<C0M0P> arrayList = new ArrayList();
        ArrayList<C0M0P> arrayList2 = (ArrayList) list;
        for (Object obj : arrayList2) {
            C0M0P c0m0p = (C0M0P) obj;
            if (c0m0p.LJIILIIL != EnumC545550LaT.NONE || setLIZIZ.contains(c0m0p.LJ)) {
                arrayList.add(obj);
            }
        }
        ArrayList<Pair> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C0M0P c0m0p2 : arrayList) {
            arrayList3.add(new Pair(c0m0p2.LJ, c0m0p2.LJIILIIL));
        }
        if (!arrayList3.isEmpty()) {
            for (Pair pair : arrayList3) {
                String str = (String) pair.getFirst();
                if (pair.getSecond() == EnumC545550LaT.PROCESSING && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
                    iCreationAsyncTaskManagerLIZ.LJJIL(str);
                }
                C09AE c09ae = (C09AE) ((LinkedHashMap) this.LLJLLL).get(str);
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                this.LLJLLL.remove(str);
            }
        }
        for (C0M0P c0m0p3 : arrayList2) {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ3 = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ3 != null && iCreationAsyncTaskManagerLIZ3.LJIILIIL() != null) {
                C0LCT.LIZLLL(c0m0p3.LJ, false);
            }
            ((ArrayList) this.LLILZ).remove(c0m0p3);
        }
        if (DQ2()) {
            ((ArrayList) this.LLILZ).clear();
        }
        AnonymousClass0880.LIZ(this.LLIZ, new Pair("deleteDraftItems", Boolean.TRUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(com.ss.android.ugc.aweme.draft.model.AwemeDraft r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r14 = this;
            r3 = r16
            r8 = r15
            boolean r0 = r3 instanceof X.C0M0C
            if (r0 == 0) goto L89
            r5 = r3
            X.0M0C r5 = (X.C0M0C) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r5.LLILZ = r2
        L15:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L2b
            if (r0 == r6) goto L6d
            if (r0 != r3) goto L8f
            X.C155000ia.LIZIZ(r1)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            int r0 = r14.LLJJ
            int r0 = r0 + (-1)
            r14.LLJJ = r0
            X.0nlB r0 = X.C1403010mc7.LIZ
            r0.getBusinessGoodsService()
            java.lang.String r0 = r8.LIZJ()
            X.C1912970zsd.LIZ(r0)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0M6F r0 = r0.LJI()
            X.0LaW r2 = r0.LIZIZ()
            X.0MYl r7 = new X.0MYl
            X.0LzJ r9 = new X.0LzJ
            java.lang.String r1 = "clickDeleteInDraft"
            java.lang.String r0 = "user_click"
            r9.<init>(r0, r1)
            boolean r10 = X.C298170BmR.LIZ()
            r11 = 0
            r13 = 116(0x74, float:1.63E-43)
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r5.LL = r8
            r5.LLILZ = r6
            java.lang.Object r0 = r2.LIZJ(r7, r5)
            if (r0 != r4) goto L72
            return r4
        L6d:
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r8 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L72:
            X.0LfN r0 = X.C548590LfN.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService r2 = X.C548590LfN.LIZ()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r8.LIZ
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r3
            java.lang.Object r0 = r2.LIZIZ(r1, r5)
            if (r0 != r4) goto L28
            return r4
        L89:
            X.0M0C r5 = new X.0M0C
            r5.<init>(r14, r3)
            goto L15
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.yQ2(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.lang.String r14, java.util.List<X.C0LSZ> r15, X.InterfaceC1364105Vn<? super X.C539070LCf> r16) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.vQ2(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public final void wQ2(Context context, List list, Map map) {
        int size;
        EnumC545550LaT enumC545550LaT;
        float f;
        Source source;
        if (list.isEmpty()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((C561950M2f) it2.next()).LIZ() == 108) {
                if (i > 0) {
                    size = ((ArrayList) this.LLILZ).size() - i;
                }
            } else {
                i++;
            }
        }
        size = 2;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            DraftViewInfo draftViewInfo = (DraftViewInfo) it3.next();
            C539070LCf c539070LCf = (C539070LCf) map.get(draftViewInfo.creationId);
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dealDraftViewInfosForNewUI overallStatus: ");
            sbLIZ.append(c539070LCf);
            C201955140j.LIZLLL(c0may, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
            String str = draftViewInfo.creationId;
            DraftShowInfo draftShowInfo = draftViewInfo.draftShowInfo;
            String str2 = draftShowInfo.coverPath;
            long j = draftViewInfo.draftOperationInfo.freeUpSpace;
            String str3 = draftShowInfo.musicName;
            String strLJII = C562270M3l.LJII(draftViewInfo, context);
            DraftShowInfo draftShowInfo2 = draftViewInfo.draftShowInfo;
            long j2 = draftShowInfo2.saveTime;
            long j3 = draftShowInfo2.time;
            boolean z = this.LLJJJJ;
            if (c539070LCf == null || (enumC545550LaT = c539070LCf.LIZJ) == null) {
                enumC545550LaT = EnumC545550LaT.NONE;
            }
            if (c539070LCf != null) {
                f = c539070LCf.LIZIZ;
            } else {
                f = 0.0f;
            }
            if (c539070LCf == null || (source = c539070LCf.LIZLLL) == null) {
                source = Source.EDITOR_PRO;
            }
            C0M0P c0m0p = new C0M0P(106, str, str2, j, str3, strLJII, j2, j3, z, enumC545550LaT, f, source, draftShowInfo2.mentionUserAvatars, draftShowInfo2.isFirstAISelfAutoCast, null, null, null, null, null, false, false, false, 67076608);
            List<C561950M2f> list2 = this.LLILZ;
            ListProtector.add(list2, ((ArrayList) list2).size() - size, c0m0p);
        }
        C201955140j.LIZJ(C0MAY.LIZIZ, this.LL + " -> dealDraftViewInfosForNewUI: draftList.size = " + ((ArrayList) this.LLILZ).size());
        AnonymousClass0880.LIZ(this.LLIZ, new Pair("dealDraftViewInfosForNewUI", Boolean.TRUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(X.C0M4N r18, android.content.Context r19, X.C562260M3k r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.HQ2(X.0M4N, android.content.Context, X.0M3k, X.05Vn):java.lang.Object");
    }

    public final Object xQ2(String str, String str2, EnumC545550LaT enumC545550LaT, Function1 function1, C0M08 c0m08) {
        AwemeDraft awemeDraftLIZ = this.LLJIJIL.LIZ(str);
        if (awemeDraftLIZ == null) {
            C201955140j.LIZJ(C0MAY.LIZIZ, "deleteAwemeDraft -> draft ie null");
            C1AF0.LIZJ("queryNull -> deleteAwemeDraft");
            return Unit.LIZ;
        }
        if (Intrinsics.LJFF(str2, "shoot_page_edit_tab")) {
            awemeDraftLIZ.LJIJI = LivePreCreateNextRoomPlayer.ENABLE;
        }
        if (((Boolean) function1.invoke(awemeDraftLIZ)).booleanValue()) {
            if (enumC545550LaT != null) {
                C562560M4o.LJ(awemeDraftLIZ.LIZ.aiLivePhotoModel, enumC545550LaT);
            }
            ((HashMap) this.LLJIJIL.LIZ).remove(str);
            if (this.LLJJIJI != 0) {
                if (awemeDraftLIZ.LJJI == 0) {
                    C571770Mbf c571770Mbf = new C571770Mbf();
                    c571770Mbf.LIZ = awemeDraftLIZ;
                    awemeDraftLIZ.LJJI = c571770Mbf.LIZIZ();
                }
                this.LLJJIJI -= awemeDraftLIZ.LJJI;
            }
            Object objYQ2 = yQ2(awemeDraftLIZ, c0m08);
            if (objYQ2 == C099R.LJFF()) {
                return objYQ2;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object JQ2(X.C0M0P r24, X.C19567911h7 r25, android.content.Context r26, java.lang.String r27, boolean r28, X.InterfaceC1364105Vn<? super kotlin.Unit> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.JQ2(X.0M0P, X.11h7, android.content.Context, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
