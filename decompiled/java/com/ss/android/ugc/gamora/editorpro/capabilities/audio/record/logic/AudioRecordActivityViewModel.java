package com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic;

import X.AnonymousClass0956;
import X.C08XD;
import X.C0E48;
import X.C0E4R;
import X.C0E5P;
import X.C0PEM;
import X.C13LP;
import X.C15438062q;
import X.C19719612Di;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C301680Bs6;
import X.C314670CVd;
import X.C350150Do5;
import X.C350870DpF;
import X.C351220Dpo;
import X.C355130Dw7;
import X.C356530DyN;
import X.C389790FQb;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import Y.AComparatorS24S0000000_5;
import Y.ARunnableS38S0300000_5;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioRecordActivityViewModel extends ViewModel implements InterfaceC497601wk {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final CoroutineContext LL;
    public final MutableLiveData<List<Float>> LLILLJJLI;
    public final MutableLiveData<C355130Dw7> LLILLL;
    public final MutableLiveData<String> LLILZ;
    public final BPEAHandler LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public boolean LLIZ;

    public AudioRecordActivityViewModel() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = C2107308Nj.LIZ.plus(C2296908zH.LIZ());
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = new MutableLiveData<>();
        this.LLILZ = new MutableLiveData<>();
        this.LLILZIL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ(this, null);
        this.LLILZIL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public static Stack vQ2(NLEModel nLEModel) {
        int i;
        Stack stack = new Stack();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        for (NLETimeSpaceNode nLETimeSpaceNode : C13LP.LJLLLL(new AComparatorS24S0000000_5(64), arrayList2)) {
            int iLLLLLLL = (int) C351220Dpo.LLLLLLL(nLETimeSpaceNode.getStartTime());
            int iLLLLLLL2 = (int) C351220Dpo.LLLLLLL(nLETimeSpaceNode.getEndTime());
            if (nLETimeSpaceNode.hasExtra("ep_slot_add_order")) {
                i = CastIntegerProtector.parseInt(nLETimeSpaceNode.getExtra("ep_slot_add_order"));
            } else {
                i = 0;
            }
            if (!stack.isEmpty() && ((C0E4R) stack.peek()).LIZ.getY() > iLLLLLLL) {
                C0E4R c0e4r = (C0E4R) stack.peek();
                Point point = c0e4r.LIZ;
                point.setY(Math.max(point.getY(), iLLLLLLL2));
                c0e4r.LIZ.setT(r2.getY() - c0e4r.LIZ.getX());
                c0e4r.LIZIZ = i;
                nLEModel.setExtra("is_audio_record_overlap", "1");
            } else {
                stack.push(new C0E4R(i, new Point(iLLLLLLL, iLLLLLLL2, iLLLLLLL2 - iLLLLLLL)));
            }
        }
        if (stack.size() > 1) {
            C08XD.LJJ(stack, new AComparatorS24S0000000_5(63));
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(stack, 10));
        Iterator it3 = stack.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C0E4R) it3.next()).LIZ);
        }
        Stack stack2 = new Stack();
        stack2.addAll(arrayList3);
        return stack2;
    }

    public static void wQ2(C0E48 c0e48, boolean z) {
        if (C301680Bs6.LIZ()) {
            return;
        }
        C350150Do5.LIZ(C350870DpF.LJI(c0e48), z);
        if (C389790FQb.LIZIZ) {
            long jJh = c0e48.getPlayer().Jh();
            C350870DpF.LIZ(c0e48, false);
            c0e48.getPlayer().LIZIZ(jJh);
            return;
        }
        C350870DpF.LIZ(c0e48, false);
    }

    public final void xQ2(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        C0E5P c0e5p = C0E5P.LIZIZ;
        C356530DyN.LIZ(c0e5p, "compileRecordAudio call");
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null && !anonymousClass0956.isCompleted()) {
            C356530DyN.LIZ(c0e5p, "compileRecordAudio call canel");
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = C23250099c.LIZLLL(this, null, null, new C314670CVd(this, c0e48, videoPublishEditModel, null), 3);
        if (c0e48 != null) {
            C350870DpF.LJI(c0e48).setExtra("is_audio_record_edited", "1");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(android.app.Dialog r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0E4Q
            if (r0 == 0) goto L67
            r5 = r8
            X.0E4Q r5 = (X.C0E4Q) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            java.lang.String r2 = ""
            if (r0 == 0) goto L39
            if (r0 != r3) goto L6e
            java.lang.Object r7 = r5.LL
            android.app.Dialog r7 = (android.app.Dialog) r7
            X.C155000ia.LIZIZ(r1)
        L28:
            if (r7 == 0) goto L30
            r7.dismiss()
            X.C785410UrT.LIZ(r7)
        L30:
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r6.LLILZ
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L6d
            return r0
        L39:
            X.C155000ia.LIZIZ(r1)
            X.0956 r1 = r6.LLILZLL
            if (r1 != 0) goto L48
            X.0E5P r1 = X.C0E5P.LIZIZ
            java.lang.String r0 = "compileJob is null"
            X.C356530DyN.LJFF(r1, r0)
            return r2
        L48:
            boolean r0 = r1.isCompleted()
            if (r0 == 0) goto L57
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r6.LLILZ
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L76
            return r0
        L57:
            if (r7 == 0) goto L5c
            X.C786410Ut5.B4(r7)
        L5c:
            r5.LL = r7
            r5.LLILZ = r3
            java.lang.Object r0 = r1.LJJZ(r5)
            if (r0 != r4) goto L28
            return r4
        L67:
            X.0E4Q r5 = new X.0E4Q
            r5.<init>(r6, r8)
            goto L12
        L6d:
            return r2
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel.yQ2(android.app.Dialog, X.05Vn):java.lang.Object");
    }

    public final void AQ2(long j, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 == null) {
            xQ2(videoPublishEditModel, c0e48);
            return;
        }
        if (!anonymousClass0956.isCompleted()) {
            C356530DyN.LIZ(C0E5P.LIZIZ, "compileRecordAudio call canel");
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZIL.removeCallbacksAndMessages(null);
        this.LLIZ = true;
        C786410Ut5.LJLIIL(j, this.LLILZIL, new ARunnableS38S0300000_5(this, c0e48, videoPublishEditModel, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, X.C0E48 r9, kotlin.jvm.functions.Function0<? extends android.app.Dialog> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel.zQ2(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0E48, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
