package com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic;

import X.AnonymousClass0956;
import X.C01GW;
import X.C051R;
import X.C08CX;
import X.C09BV;
import X.C09IR;
import X.C0E1T;
import X.C0E1V;
import X.C0E1X;
import X.C0E48;
import X.C0LAB;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C19EG;
import X.C1BNE;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C350410DoV;
import X.C350870DpF;
import X.C352250DrT;
import X.C353560Dta;
import X.C354260Dui;
import X.C362580EJk;
import X.C377230Eqf;
import X.C377260Eqi;
import X.C377270Eqj;
import X.C377360Eqs;
import X.C377370Eqt;
import X.C377380Equ;
import X.C377390Eqv;
import X.C377740ErU;
import X.C379370Eu7;
import X.C452501pT;
import X.C563650M8t;
import X.EnumC2331909Bt;
import X.EnumC377350Eqr;
import X.EnumC381960EyI;
import X.EnumC382030EyP;
import X.InterfaceC355850DxH;
import X.InterfaceC356750Dyj;
import X.InterfaceC357170DzP;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksPanelFragment;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class AsyncTasksPanelViewModel extends BaseViewModel {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public List<String> LL = new ArrayList();
    public Set<String> LLILLJJLI;
    public Set<String> LLILLL;
    public final C2252321DDq LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final C2252331DDr LLJ;
    public final C2252331DDr LLJI;
    public final C2252331DDr LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public List<C377380Equ> LLJILJILJ;
    public final Set<String> LLJILLL;
    public final C01GW LLJJ;
    public DTResourcePanelFragment<? extends ViewModel> LLJJI;
    public AnonymousClass0956 LLJJIII;
    public AnonymousClass0956 LLJJIJI;
    public final MutableLiveData<C377360Eqs> LLJJIJIIJIL;
    public final MutableLiveData<C377380Equ> LLJJIJIL;
    public final MutableLiveData<C377380Equ> LLJJJ;
    public final C01GW LLJJJIL;
    public Set<String> LLJJJJ;
    public final C377230Eqf LLJJJJJIL;

    public final NLEEditor AQ2() {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null) {
            return c0e48.LLFII().LJI();
        }
        return null;
    }

    public final void FQ2() {
        List<C377380Equ> list = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (C377380Equ c377380Equ : list) {
            if (c377380Equ.LJI == EnumC377350Eqr.PROCESSING) {
                arrayList.add(c377380Equ);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = ((C377380Equ) it2.next()).LIZ;
                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
                if (iCreationAsyncTaskManagerLIZ != null) {
                    iCreationAsyncTaskManagerLIZ.LJII(str);
                }
                BQ2(str);
            }
            NLEEditor nLEEditorAQ2 = AQ2();
            if (nLEEditorAQ2 != null) {
                nLEEditorAQ2.done();
            }
        }
    }

    public final NLEModel LLZ() {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null) {
            return C350870DpF.LJI(c0e48);
        }
        return null;
    }

    public final VideoPublishEditModel getEditModel() {
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ != null) {
            return editModelProviderLIZIZ.getEditModel();
        }
        return null;
    }

    public final C377260Eqi zQ2() {
        return (C377260Eqi) this.LLJJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0Eqf] */
    public AsyncTasksPanelViewModel() {
        C08CX c08cx = C08CX.INSTANCE;
        this.LLILLJJLI = c08cx;
        this.LLILLL = c08cx;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C377270Eqj(0));
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(Float.valueOf(0.0f));
        this.LLILZLL = c2252321DDqLIZ2;
        this.LLIZ = c2252321DDqLIZ2;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJ = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(1, 0, null, 6);
        this.LLJI = c2252331DDrLIZIZ2;
        this.LLJIJIL = c2252331DDrLIZIZ2;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJILJIL = C1BNE.LIZ(c13bv);
        this.LLJILJILJ = c13bv;
        this.LLJILLL = Collections.synchronizedSet(new LinkedHashSet());
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 766));
        this.LLJJIJIIJIL = new MutableLiveData<>();
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJ = new MutableLiveData<>();
        this.LLJJJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(221));
        this.LLJJJJ = c08cx;
        this.LLJJJJJIL = new InterfaceC357170DzP() { // from class: X.0Eqf
            @Override // X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
                Set<String> setLLIIJI;
                NLEModel model;
                NLEModel model2;
                NLEModel model3;
                AsyncTasksPanelViewModel asyncTasksPanelViewModel = this.LIZ;
                NLEEditor nLEEditorAQ2 = asyncTasksPanelViewModel.AQ2();
                if (nLEEditorAQ2 == null || (model3 = nLEEditorAQ2.getModel()) == null || (setLLIIJI = C13LP.LLIIJI(C352250DrT.LJ(model3))) == null) {
                    setLLIIJI = C08CX.INSTANCE;
                }
                asyncTasksPanelViewModel.LLJJJJ = setLLIIJI;
                if (C379370Eu7.LIZIZ(this.LIZ.getEditModel())) {
                    NLEEditor nLEEditorAQ22 = this.LIZ.AQ2();
                    if (nLEEditorAQ22 != null && (model2 = nLEEditorAQ22.getModel()) != null) {
                        List<NLETrackSlot> listLJFF = C352250DrT.LJFF(model2);
                        AsyncTasksPanelViewModel asyncTasksPanelViewModel2 = this.LIZ;
                        Iterator it2 = ((ArrayList) listLJFF).iterator();
                        while (it2.hasNext()) {
                            asyncTasksPanelViewModel2.LLJJJJ = C15442062u.LJIIIZ(asyncTasksPanelViewModel2.LLJJJJ, C13LP.LLIIJI(C377740ErU.LJ((NLETrackSlot) it2.next())));
                        }
                    }
                    NLEEditor nLEEditorAQ23 = this.LIZ.AQ2();
                    if (nLEEditorAQ23 != null && (model = nLEEditorAQ23.getModel()) != null) {
                        C352250DrT.LJIIIIZZ(model);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Type inference failed for: r0v23, types: [T, java.util.Set] */
            @Override // X.InterfaceC357170DzP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.EnumC357140DzM r6, boolean r7) {
                /*
                    r5 = this;
                    X.00zU r4 = new X.00zU
                    r4.<init>()
                    com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r0 = r5.LIZ
                    com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.AQ2()
                    if (r0 == 0) goto L1d
                    com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.getModel()
                    if (r0 == 0) goto L1d
                    java.util.List r0 = X.C352250DrT.LJ(r0)
                    java.util.Set r0 = X.C13LP.LLIIJI(r0)
                    if (r0 != 0) goto L1f
                L1d:
                    X.08CX r0 = X.C08CX.INSTANCE
                L1f:
                    r4.element = r0
                    com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r0 = r5.LIZ
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.getEditModel()
                    boolean r0 = X.C379370Eu7.LIZIZ(r0)
                    if (r0 == 0) goto L75
                    com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r0 = r5.LIZ
                    com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.AQ2()
                    if (r0 == 0) goto L64
                    com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.getModel()
                    if (r0 == 0) goto L64
                    java.util.List r0 = X.C352250DrT.LJFF(r0)
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    java.util.Iterator r2 = r0.iterator()
                L45:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L64
                    java.lang.Object r0 = r2.next()
                    com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
                    T r1 = r4.element
                    java.util.Set r1 = (java.util.Set) r1
                    java.util.List r0 = X.C377740ErU.LJ(r0)
                    java.util.Set r0 = X.C13LP.LLIIJI(r0)
                    java.util.Set r0 = X.C15442062u.LJIIIZ(r1, r0)
                    r4.element = r0
                    goto L45
                L64:
                    com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r0 = r5.LIZ
                    com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.AQ2()
                    if (r0 == 0) goto L75
                    com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.getModel()
                    if (r0 == 0) goto L75
                    X.C352250DrT.LJIIIIZZ(r0)
                L75:
                    com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r0 = r5.LIZ
                    X.01wk r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
                    X.0Eqe r2 = new X.0Eqe
                    com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r0 = r5.LIZ
                    r1 = 0
                    r2.<init>(r0, r4, r1)
                    r0 = 3
                    X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C377230Eqf.LIZIZ(X.0DzM, boolean):void");
            }
        };
    }

    public final void DQ2() {
        CreativeModel creativeModel;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null || (creativeModel = editModel.creativeModel) == null) {
            return;
        }
        creativeModel.asyncTaskIds = C13LP.LLIIII(this.LLILLJJLI);
        if (!this.LL.isEmpty()) {
            List<C377380Equ> list = this.LLJILJILJ;
            ArrayList arrayList = new ArrayList();
            for (C377380Equ c377380Equ : list) {
                if (GQ2(c377380Equ)) {
                    arrayList.add(c377380Equ);
                }
            }
            creativeModel.asyncFuncList = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save async task info in creative model, funcList: ");
        sbLIZ.append(creativeModel.asyncFuncList);
        sbLIZ.append(", taskId size: ");
        sbLIZ.append(creativeModel.asyncTaskIds.size());
        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String getCreationId() {
        String creationId;
        VideoPublishEditModel editModel = getEditModel();
        return (editModel == null || (creationId = editModel.getCreationId()) == null) ? "" : creationId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x006c, PHI: r1
      0x0058: PHI (r1v4 org.json.JSONObject) = (r1v3 org.json.JSONObject), (r1v6 org.json.JSONObject), (r1v8 org.json.JSONObject) binds: [B:11:0x003b, B:13:0x0041, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x006c, blocks: (B:10:0x0032, B:12:0x003d, B:14:0x0043, B:16:0x004b, B:18:0x0051, B:22:0x0064, B:21:0x0058), top: B:47:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C377380Equ HQ2(X.C381540Exc r16) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel.HQ2(X.0Exc):X.0Equ");
    }

    public final void BQ2(String str) {
        NLETrackSlot nLETrackSlotLJIIJ;
        NLEEditor nLEEditorAQ2 = AQ2();
        if (nLEEditorAQ2 != null) {
            NLEModel model = nLEEditorAQ2.getModel();
            if (model != null && (nLETrackSlotLJIIJ = C352250DrT.LJIIJ(model, str)) != null) {
                C354260Dui.LIZ.getClass();
                nLETrackSlotLJIIJ.removeExtraWithKey("creation_async_task_id");
                nLETrackSlotLJIIJ.removeExtraWithKey("ep_magic_category_id");
                C354260Dui.LIZJ(nLETrackSlotLJIIJ);
                nLETrackSlotLJIIJ.removeVideoEffect(C354260Dui.LJI(nLETrackSlotLJIIJ));
            }
            nLEEditorAQ2.commit();
        }
    }

    public final boolean GQ2(C377380Equ c377380Equ) {
        if (c377380Equ.LJI == EnumC377350Eqr.COMPLETE) {
            return true;
        }
        if (C377740ErU.LJFF(c377380Equ.LJFF)) {
            int i = C377370Eqt.LIZ[c377380Equ.LJI.ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                String str = c377380Equ.LIZ;
                String str2 = c377380Equ.LJII;
                NLEModel nLEModelLLZ = LLZ();
                if (nLEModelLLZ != null && (str.length() != 0 || str2.length() != 0)) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(str, str2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listLJIIJJI) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    List<String> listLJ = C352250DrT.LJ(nLEModelLLZ);
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((ArrayList) listLJ).contains(it2.next())) {
                                return true;
                            }
                        }
                    }
                    if (C379370Eu7.LIZIZ(getEditModel())) {
                        Iterator it3 = ((ArrayList) C352250DrT.LJFF(nLEModelLLZ)).iterator();
                        while (it3.hasNext()) {
                            List listLJ2 = C377740ErU.LJ((NLETrackSlot) it3.next());
                            if (!arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    if (listLJ2.contains(it4.next())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            NLEModel nLEModelLLZ2 = LLZ();
            if (nLEModelLLZ2 != null && ((ArrayList) C352250DrT.LJ(nLEModelLLZ2)).contains(c377380Equ.LIZ)) {
                return true;
            }
        }
        return false;
    }

    public final void wQ2(String str) {
        ((InterfaceC355850DxH) this.LLJJJIL.getValue()).LJII(EnumC382030EyP.CANCEL, EnumC2331909Bt.TASK_ID, str, "GenAITaskService");
        BQ2(str);
    }

    public final void CQ2(String str, String str2) {
        C377260Eqi c377260EqiZQ2 = zQ2();
        c377260EqiZQ2.getClass();
        C0LAB c0labLIZIZ = C377260Eqi.LIZIZ(C377260Eqi.LJ(), c377260EqiZQ2.LIZ, null);
        if (c0labLIZIZ != null) {
            c0labLIZIZ.LJ("async_function", str);
            C20684815ws.LJIILLIIL("retry_async_process", c0labLIZIZ.LIZ);
        }
        this.LLJILLL.remove(str2);
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJJIJIL(str2);
        }
    }

    public final void EQ2(C19EG c19eg, C362580EJk c362580EJk) {
        c362580EJk.LIZIZ = c19eg;
        c362580EJk.LIZJ(new AsyncTasksPanelFragment());
        C377260Eqi c377260EqiZQ2 = zQ2();
        List<String> list = this.LL;
        c377260EqiZQ2.getClass();
        C0LAB c0labLIZIZ = C377260Eqi.LIZIZ(C377260Eqi.LJ(), c377260EqiZQ2.LIZ, list);
        if (c0labLIZIZ != null) {
            C20684815ws.LJIILLIIL("enter_ep_async_process_page", c0labLIZIZ.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.util.Set<java.lang.String> r10, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, X.C0ELY>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C377330Eqp
            if (r0 == 0) goto L88
            r4 = r11
            X.0Eqp r4 = (X.C377330Eqp) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            if (r0 == 0) goto L5b
            if (r0 != r2) goto Lb9
            com.bytedance.ies.nle.editor_jni.NLEModel r5 = r4.LLILLJJLI
            java.lang.Object r6 = r4.LL
            java.util.Map r6 = (java.util.Map) r6
            X.C155000ia.LIZIZ(r1)
        L28:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lc1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r1.iterator()
        L35:
            boolean r0 = r4.hasNext()
            r7 = 0
            if (r0 == 0) goto L8e
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.0LSZ r2 = (X.C0LSZ) r2
            java.lang.String r1 = r2.LJ
            java.lang.String r0 = "STARTED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L57
            java.lang.String r1 = r2.LJ
            java.lang.String r0 = "DEFAULT"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L35
        L57:
            r8.add(r3)
            goto L35
        L5b:
            X.C155000ia.LIZIZ(r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            com.bytedance.ies.nle.editor_jni.NLEModel r5 = r9.LLZ()
            if (r5 != 0) goto L6a
            return r6
        L6a:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L71
            return r6
        L71:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = X.C09BV.LIZ()
            if (r1 == 0) goto Lc1
            java.util.List r0 = X.C13LP.LLIIII(r10)
            r4.LL = r6
            r4.LLILLJJLI = r5
            r4.LLILZIL = r2
            java.lang.Object r1 = r1.LJIJJ(r0, r4)
            if (r1 != r3) goto L28
            return r3
        L88:
            X.0Eqp r4 = new X.0Eqp
            r4.<init>(r9, r11)
            goto L12
        L8e:
            java.util.Iterator r4 = r8.iterator()
        L92:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r1 = r4.next()
            X.0LSZ r1 = (X.C0LSZ) r1
            java.lang.String r0 = r1.LIZ
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = X.C352250DrT.LJIIJ(r5, r0)
            if (r0 == 0) goto L92
            java.lang.String r3 = r0.getUUID()
            X.0ELY r2 = new X.0ELY
            int r0 = r1.LJII
            float r1 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r2.<init>(r7, r1, r7)
            r6.put(r3, r2)
            goto L92
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel.vQ2(java.util.Set, X.05Vn):java.lang.Object");
    }

    public final void yQ2(List<C377380Equ> list, C377390Eqv c377390Eqv) {
        NLETrackSlot nLETrackSlotLJIIJ;
        C0E48 c0e48;
        this.LLJJIJIIJIL.setValue(new C377360Eqs(list, c377390Eqv));
        for (C377380Equ c377380Equ : list) {
            if (c377380Equ.LJFF == EnumC381960EyI.EDITOR_PRO) {
                C09BV.LIZ();
                if (c377380Equ.LJI == EnumC377350Eqr.FAILED) {
                    wQ2(c377380Equ.LIZ);
                } else {
                    String str = c377380Equ.LIZ;
                    ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
                    if (iCreationAsyncTaskManagerLIZ != null) {
                        iCreationAsyncTaskManagerLIZ.LJII(str);
                    }
                    BQ2(str);
                }
                synchronized (this.LLJILLL) {
                    try {
                        this.LLJILLL.remove(c377380Equ.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (!c377390Eqv.LIZLLL) {
                    C201955140j.LIZLLL(C563650M8t.LIZIZ, "MagicPanelComponent", "deleteNLEAsyncTask");
                    NLEModel nLEModelLLZ = LLZ();
                    if (nLEModelLLZ != null && (nLETrackSlotLJIIJ = C352250DrT.LJIIJ(nLEModelLLZ, c377380Equ.LIZ)) != null && (c0e48 = this.editorContext) != null) {
                        EditModelProvider.Companion.getClass();
                        InterfaceC356750Dyj magicProcessorManager$tools_camera_edit_release = C0E1T.LIZ().getMagicProcessorManager$tools_camera_edit_release();
                        if (magicProcessorManager$tools_camera_edit_release != null) {
                            C353560Dta.LIZ.getClass();
                            C353560Dta.LJIIIZ(c0e48, nLETrackSlotLJIIJ, magicProcessorManager$tools_camera_edit_release);
                            C350410DoV.LIZLLL(AQ2(), true, C051R.LIZIZ(new C0E1X(C0E1V.MAGIC.getNameId(), null, null, c377380Equ.LIZLLL, null, 22)), false, true);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.C19EG r19, X.C362580EJk r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel.xQ2(X.19EG, X.0EJk, X.05Vn):java.lang.Object");
    }
}
