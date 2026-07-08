package com.ss.android.ugc.gamora.editor.ailive.prompt;

import X.C013C;
import X.C01GW;
import X.C09HQ;
import X.C11PQ;
import X.C123100dR;
import X.C15438062q;
import X.C1701940uOG;
import X.C189200o6;
import X.C19475711Hn;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C554440Loo;
import X.C559010LwB;
import X.C560970LzL;
import X.C564500MCa;
import X.C564530MCd;
import X.C564540MCe;
import X.C564550MCf;
import X.C564560MCg;
import X.C564610MCl;
import X.C564620MCm;
import X.InterfaceC497601wk;
import Y.AObjectS241S0100000_8;
import Y.AfS177S0100000_8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.ailive.BlipData;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoPromptManager {
    public static final /* synthetic */ int LJIIJ = 0;
    public Pair<String, String> LIZJ;
    public boolean LJIIIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(261));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(263));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(262));
    public final h0<Boolean> LJ = new h0<>(Boolean.FALSE);
    public final C11PQ<BlipData> LJFF = new C11PQ<>();
    public final C11PQ<PromptRequestState> LJI = new C11PQ<>();
    public final C11PQ<PromptRequestState> LJII = new C11PQ<>();
    public final C11PQ<PromptModel> LJIIIIZZ = new C11PQ<>();

    public final C564620MCm LIZIZ() {
        return (C564620MCm) this.LIZLLL.getValue();
    }

    public final void LJIIJ() {
        PromptRequestState promptRequestStateLJLZ = this.LJII.LJLZ();
        if (promptRequestStateLJLZ == null || promptRequestStateLJLZ.state != PromptRequestStateType.LOADING) {
            PromptRequestState promptRequestStateLJLZ2 = this.LJII.LJLZ();
            if (promptRequestStateLJLZ2 == null || promptRequestStateLJLZ2.state != PromptRequestStateType.SUCCESS) {
                C013C c013c = new C013C();
                ArrayList arrayList = (ArrayList) C564540MCe.LIZ;
                if (true ^ arrayList.isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("use cache ");
                    sbLIZ.append("preset_prompt");
                    sbLIZ.append(':');
                    sbLIZ.append(arrayList);
                    C559010LwB.LIZJ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ));
                    C11PQ<PromptRequestState> c11pq = this.LJII;
                    PromptRequestStateType promptRequestStateType = PromptRequestStateType.SUCCESS;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((AILivePhotoPromptStruct) it2.next()).LIZ(false));
                    }
                    c11pq.onNext(new PromptRequestState(promptRequestStateType, arrayList2, true, null, 8, null));
                    boolean z = this.LJIIIZ;
                    c013c.element = z;
                    if (!z) {
                        return;
                    }
                }
                if (!C560970LzL.LIZIZ()) {
                    this.LJII.onNext(new PromptRequestState(PromptRequestStateType.FAIL, null, false, new C564610MCl("no network"), 6, null));
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("start request ");
                sbLIZ2.append("preset_prompt");
                sbLIZ2.append(", just for default:");
                sbLIZ2.append(c013c.element);
                C559010LwB.LIZJ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ2));
                C554440Loo c554440Loo = C554440Loo.LIZ;
                String source = Source.EDIT_AI_LIVE_PHOTO.getSource();
                c554440Loo.getClass();
                C554440Loo.LJFF(source, "preset_prompt");
                if (!c013c.element) {
                    this.LJII.onNext(new PromptRequestState(PromptRequestStateType.LOADING, null, false, null, 14, null));
                }
                C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C564560MCg(this, c013c, "preset_prompt", null), 3);
            }
        }
    }

    public final void LJIIJJI() {
        String second;
        PromptRequestState promptRequestStateLJLZ;
        String first;
        PromptRequestState promptRequestStateLJLZ2;
        PromptRequestState promptRequestStateLJLZ3;
        PromptRequestState promptRequestStateLJLZ4;
        PromptRequestState promptRequestStateLJLZ5 = this.LJII.LJLZ();
        if (promptRequestStateLJLZ5 == null || promptRequestStateLJLZ5.state != PromptRequestStateType.SUCCESS || (promptRequestStateLJLZ4 = this.LJI.LJLZ()) == null || promptRequestStateLJLZ4.state != PromptRequestStateType.SUCCESS) {
            BlipData blipDataLJLZ = this.LJFF.LJLZ();
            String str = blipDataLJLZ != null ? blipDataLJLZ.blip : null;
            Boolean boolLIZJ = this.LJ.LIZJ();
            if (C564500MCa.LIZ() && (((promptRequestStateLJLZ2 = this.LJII.LJLZ()) != null && promptRequestStateLJLZ2.state == PromptRequestStateType.NONE) || ((promptRequestStateLJLZ3 = this.LJII.LJLZ()) != null && promptRequestStateLJLZ3.state == PromptRequestStateType.FAIL))) {
                LJIIJ();
            }
            if (C123100dR.LIZ(str) && boolLIZJ.booleanValue()) {
                LJIIIZ(str);
                return;
            }
            Pair<String, String> pair = this.LIZJ;
            if (pair == null || (second = pair.getSecond()) == null) {
                return;
            }
            if ((str == null || str.length() == 0) && C123100dR.LIZ(second)) {
                PromptRequestState promptRequestStateLJLZ6 = this.LJI.LJLZ();
                if ((promptRequestStateLJLZ6 == null || promptRequestStateLJLZ6.state != PromptRequestStateType.NONE) && ((promptRequestStateLJLZ = this.LJI.LJLZ()) == null || promptRequestStateLJLZ.state != PromptRequestStateType.FAIL)) {
                    return;
                }
                Pair<String, String> pair2 = this.LIZJ;
                if (pair2 == null || (first = pair2.getFirst()) == null) {
                    first = "";
                }
                LJI(second, first);
            }
        }
    }

    public final void LJIIIZ(String str) {
        PromptRequestState promptRequestStateLJLZ = this.LJI.LJLZ();
        if (promptRequestStateLJLZ != null && promptRequestStateLJLZ.state == PromptRequestStateType.LOADING) {
            return;
        }
        PromptRequestState promptRequestStateLJLZ2 = this.LJI.LJLZ();
        if (promptRequestStateLJLZ2 != null && promptRequestStateLJLZ2.state == PromptRequestStateType.SUCCESS) {
            return;
        }
        if (!C560970LzL.LIZIZ()) {
            this.LJI.onNext(new PromptRequestState(PromptRequestStateType.FAIL, null, false, new C564610MCl("no network"), 6, null));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start request ");
        sbLIZ.append("Gpt");
        C559010LwB.LIZJ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ));
        C554440Loo c554440Loo = C554440Loo.LIZ;
        String source = Source.EDIT_AI_LIVE_PHOTO.getSource();
        c554440Loo.getClass();
        C554440Loo.LJFF(source, "Gpt");
        this.LJI.onNext(new PromptRequestState(PromptRequestStateType.LOADING, null, false, null, 14, null));
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C564550MCf(this, str, "Gpt", null), 3);
    }

    public static Pair LIZJ(Function1 function1, Object obj) {
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            return (Pair) function1.invoke(obj);
        }
        if (thM5exceptionOrNullimpl instanceof C09HQ) {
            return new Pair(10003, ((C09HQ) thM5exceptionOrNullimpl).message());
        }
        if (thM5exceptionOrNullimpl instanceof C564610MCl) {
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            return new Pair(10004, message);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error: ");
        sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
        return new Pair(10001, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C564590MCj
            if (r0 == 0) goto L75
            r5 = r10
            X.0MCj r5 = (X.C564590MCj) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L59
            if (r0 != r3) goto L7b
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            java.lang.Throwable r5 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r5 == 0) goto L58
            X.11PQ<com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState> r0 = r8.LJI
            com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState r1 = new com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState
            com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType r2 = com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType.FAIL
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.onNext(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "request blip fail:"
            r1.append(r0)
            java.lang.String r0 = r5.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AILivePhotoPromptManager"
            X.C559010LwB.LIZ(r0, r1)
            r0 = 0
        L58:
            return r0
        L59:
            X.C155000ia.LIZIZ(r1)
            X.0Loo r2 = X.C554440Loo.LIZ
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EDIT_AI_LIVE_PHOTO
            java.lang.String r1 = r0.getSource()
            r2.getClass()
            java.lang.String r0 = "Blip"
            X.C554440Loo.LJFF(r1, r0)
            r5.LLILLL = r3
            java.lang.Object r0 = r8.LJIIIIZZ(r3, r9, r5)
            if (r0 != r4) goto L28
            return r4
        L75:
            X.0MCj r5 = new X.0MCj
            r5.<init>(r8, r10)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJ(LifecycleOwner lifecycleOwner, boolean z) {
        this.LJIIIZ = z;
        C11PQ<BlipData> c11pq = this.LJFF;
        c11pq.getClass();
        new C19475711Hn(c11pq).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 32));
        this.LJ.LIZ(lifecycleOwner, new AObjectS241S0100000_8(this, 42));
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager$initObserver$3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event.getTargetState() == Lifecycle.State.DESTROYED) {
                    C2296808zG.LIZJ((InterfaceC497601wk) this.LL.LIZ.getValue(), null);
                    C559010LwB.LIZJ("AILivePhotoPromptManager", "destory");
                }
            }
        });
    }

    public final void LJI(String str, String str2) {
        String str3;
        LJIIL(str, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tos: ");
        sbLIZ.append(str);
        C559010LwB.LIZIZ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ));
        BlipData blipDataLJLZ = this.LJFF.LJLZ();
        if (blipDataLJLZ != null) {
            str3 = blipDataLJLZ.blip;
        } else {
            str3 = null;
        }
        if (str3 != null && C123100dR.LIZ(str3)) {
            return;
        }
        PromptRequestState promptRequestStateLJLZ = this.LJI.LJLZ();
        if (promptRequestStateLJLZ != null && promptRequestStateLJLZ.state == PromptRequestStateType.LOADING) {
            return;
        }
        PromptRequestState promptRequestStateLJLZ2 = this.LJI.LJLZ();
        if (promptRequestStateLJLZ2 != null && promptRequestStateLJLZ2.state == PromptRequestStateType.SUCCESS) {
            return;
        }
        if (!C560970LzL.LIZIZ()) {
            this.LJI.onNext(new PromptRequestState(PromptRequestStateType.FAIL, null, false, new C564610MCl("no network"), 6, null));
        } else {
            C559010LwB.LIZJ("AILivePhotoPromptManager", "start request blip");
            C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C564530MCd(this, str, str2, null), 3);
        }
    }

    public final void LJIIL(String str, String str2) {
        this.LIZJ = new Pair<>(str2, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTos=");
        sbLIZ.append(this.LIZJ);
        C559010LwB.LIZJ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:20:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r20, java.lang.String r21, X.InterfaceC1364105Vn r22) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager.LJIIIIZZ(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LIZLLL(PromptModel promptModel, BlipData blipData, PromptRequestState promptRequestState, PromptRequestState promptRequestState2) {
        if (promptModel != null) {
            this.LJIIIIZZ.onNext(promptModel);
        }
        if (promptRequestState != null) {
            this.LJII.onNext(promptRequestState);
        }
        if (promptRequestState2 != null) {
            this.LJI.onNext(promptRequestState2);
        }
        if (blipData != null) {
            this.LJFF.onNext(blipData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r13, long r14, java.lang.String r16, X.InterfaceC1364105Vn r17) {
        /*
            r12 = this;
            r3 = r17
            r8 = r14
            r10 = r13
            boolean r0 = r3 instanceof X.C564580MCi
            r5 = r12
            if (r0 == 0) goto L6d
            r4 = r3
            X.0MCi r4 = (X.C564580MCi) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L17:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 != r1) goto L77
            int r10 = r4.LLILLJJLI
            long r8 = r4.LL
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r6 = r3.m10unboximpl()
        L31:
            java.lang.String r7 = "Blip"
            kotlin.jvm.internal.AwS587S0100000_8 r11 = new kotlin.jvm.internal.AwS587S0100000_8
            r0 = 604(0x25c, float:8.46E-43)
            r11.<init>(r5, r0)
            r5.LJFF(r6, r7, r8, r10, r11)
            boolean r0 = X.C189200o6.m8isSuccessimpl(r6)
            if (r0 == 0) goto L73
            com.ss.android.ugc.gamora.editor.ailive.repo.BlipDescriptionResponse r6 = (com.ss.android.ugc.gamora.editor.ailive.repo.BlipDescriptionResponse) r6
            java.util.List<java.lang.String> r0 = r6.blipDescription
            java.lang.Object r6 = X.C13LP.LJJJLL(r0)
            if (r6 != 0) goto L4f
            java.lang.String r6 = ""
        L4f:
            X.C189200o6.m2constructorimpl(r6)
            return r6
        L53:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = r5.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0MCp r0 = (X.C564650MCp) r0
            r4.LL = r8
            r4.LLILLJJLI = r10
            r4.LLILZIL = r1
            r1 = r16
            java.lang.Object r6 = r0.LIZJ(r1, r4)
            if (r6 != r2) goto L31
            return r2
        L6d:
            X.0MCi r4 = new X.0MCi
            r4.<init>(r5, r3)
            goto L17
        L73:
            X.C189200o6.m2constructorimpl(r6)
            return r6
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager.LJII(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJFF(Object obj, String str, long j, int i, Function1 function1) {
        Pair pair = (Pair) function1.invoke(C189200o6.m1boximpl(obj));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        String str2 = (String) pair.getSecond();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C554440Loo c554440Loo = C554440Loo.LIZ;
        Source source = Source.EDIT_AI_LIVE_PHOTO;
        String source2 = source.getSource();
        boolean zM8isSuccessimpl = C189200o6.m8isSuccessimpl(obj);
        c554440Loo.getClass();
        C554440Loo.LIZLLL(zM8isSuccessimpl ? 1 : 0, i, jCurrentTimeMillis, source2, iIntValue, str, str2);
        if (Intrinsics.LJFF(str, "Blip")) {
            LIZIZ().LIZ = jCurrentTimeMillis;
        } else if (Intrinsics.LJFF(str, "Gpt")) {
            LIZIZ().LIZIZ = jCurrentTimeMillis;
        }
        if (!C189200o6.m8isSuccessimpl(obj)) {
            String source3 = source.getSource();
            long j2 = LIZIZ().LIZ + LIZIZ().LIZIZ;
            c554440Loo.getClass();
            C554440Loo.LIZLLL(0, 0, j2, source3, iIntValue, "Whole", str2);
        }
    }
}
