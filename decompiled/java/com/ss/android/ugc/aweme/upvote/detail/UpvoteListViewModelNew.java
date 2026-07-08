package com.ss.android.ugc.aweme.upvote.detail;

import X.C01GW;
import X.C0PEM;
import X.C0RT1;
import X.C10EU;
import X.C1358950lT3;
import X.C13BV;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1359020lTA;
import X.InterfaceC1359100lTI;
import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS136S1200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteListViewModelNew implements InterfaceC1359100lTI, GenericLifecycleObserver {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final LifecycleOwner LL;
    public String LLILZ;
    public Aweme LLILZIL;
    public boolean LLIZ;
    public String LLILLJJLI = "unknown";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(26));
    public EnumC1359020lTA LLILZLL = EnumC1359020lTA.OTHERS;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final MutableLiveData<UpvoteList> LIZIZ() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0RT1(this, null), 3);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        String str = this.LLILZ;
        if (str != null) {
            C1358950lT3.LIZ.getClass();
            C1358950lT3.LJIIJJI(str, this);
        }
    }

    public final List<UpvoteStruct> LIZ() {
        List<UpvoteStruct> list;
        UpvoteList value = LIZIZ().getValue();
        return (value == null || (list = value.upvotes) == null) ? C13BV.INSTANCE : list;
    }

    public final boolean LIZJ() {
        List<UpvoteStruct> listLIZ = LIZ();
        if ((listLIZ instanceof Collection) && listLIZ.isEmpty()) {
            return false;
        }
        Iterator<UpvoteStruct> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            if (C10EU.LJIILLIIL(it2.next().user)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL() {
        List<UpvoteStruct> list;
        UpvoteList value = LIZIZ().getValue();
        return value == null || value.total <= 0 || (list = value.upvotes) == null || list.isEmpty();
    }

    public UpvoteListViewModelNew(UpvoteVideoAssemNew upvoteVideoAssemNew) {
        this.LL = upvoteVideoAssemNew;
        upvoteVideoAssemNew.getLifecycle().addObserver(this);
    }

    public static void LJ(Function0 function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6(function0, 122));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5 A[EDGE_INSN: B:57:0x00b5->B:29:0x00b5 BREAK  A[LOOP:0: B:11:0x003d->B:28:0x00b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r10 r11
      0x0036: PHI (r10v5 int) = (r10v1 int), (r10v1 int), (r10v6 int) binds: [B:53:0x0142, B:55:0x0146, B:8:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r11v5 ??) = (r11v1 ??), (r11v1 ??), (r11v6 ??) binds: [B:53:0x0142, B:55:0x0146, B:8:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew.LJFF(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList, java.lang.String):void");
    }

    @Override // X.InterfaceC1359100lTI
    public final void P12(String str, UpvoteList upvoteList, String str2, boolean z) {
        if (!Intrinsics.LJFF(this.LLILZ, str)) {
            C1358950lT3.LIZ.getClass();
            C1358950lT3.LJIIJJI(str, this);
        } else {
            LJ(new AwS136S1200000_21(this, z, upvoteList, str2, 3));
        }
    }
}
