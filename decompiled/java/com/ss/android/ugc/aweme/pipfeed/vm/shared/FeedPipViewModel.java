package com.ss.android.ugc.aweme.pipfeed.vm.shared;

import X.C0N3W;
import X.C1210990hcP;
import X.C1211000hcQ;
import X.C13BV;
import X.C15438062q;
import X.C1619990sG5;
import X.C1620060sGC;
import X.C1620070sGD;
import X.C2189821An6;
import X.C261830ANx;
import X.C587670N3d;
import X.EnumC1216720hle;
import X.EnumC1620090sGF;
import X.InterfaceC1620010sG7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedPipViewModel extends ViewModel {
    public static final CopyOnWriteArrayList<C1210990hcP> LLJJJIL = new CopyOnWriteArrayList<>();
    public final FeedPipViewModel$currentAweme$1 LL;
    public final C587670N3d LLILLJJLI;
    public Aweme LLILLL;
    public final C1620060sGC LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public C2189821An6 LLIZ;
    public C0N3W LLIZLLLIL;
    public InterfaceC1620010sG7 LLJ;
    public final List<Aweme> LLJI;
    public final Set<String> LLJIJIL;
    public final MutableLiveData<List<Aweme>> LLJILJIL;
    public boolean LLJILJILJ;
    public final MutableLiveData<Boolean> LLJILLL;
    public final MutableLiveData<Boolean> LLJJ;
    public final MutableLiveData<EnumC1620090sGF> LLJJI;
    public Aweme LLJJIII;
    public int LLJJIJI;
    public final Set<String> LLJJIJIIJIL;
    public final C1619990sG5 LLJJIJIL;
    public boolean LLJJJ;

    public final List<Aweme> wQ2() {
        List<Aweme> list = this.LLJI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (C1211000hcQ.LIZ((Aweme) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sGC] */
    public FeedPipViewModel() {
        C1211000hcQ.LIZIZ(new C1210990hcP("force_skip_list", EnumC1216720hle.BLOCK, new C1620070sGD(this)));
        this.LL = new MutableLiveData<Aweme>() { // from class: com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1
            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void postValue(Aweme aweme) {
                String aid;
                if (aweme != null) {
                    FeedPipViewModel feedPipViewModel = this.this$0;
                    CopyOnWriteArrayList<C1210990hcP> copyOnWriteArrayList = FeedPipViewModel.LLJJJIL;
                    if (!C1211000hcQ.LIZ(aweme)) {
                        Aweme awemeVQ2 = feedPipViewModel.vQ2(aweme);
                        if (awemeVQ2 != null) {
                            feedPipViewModel.LLJJIJIL.LIZIZ = false;
                            postValue(awemeVQ2);
                            return;
                        }
                        return;
                    }
                }
                Aweme value = getValue();
                String aid2 = null;
                if (value != null) {
                    aid = value.getAid();
                } else {
                    aid = null;
                }
                if (aweme != null) {
                    aid2 = aweme.getAid();
                }
                if (!Intrinsics.LJFF(aid, aid2)) {
                    this.this$0.LLJJIJIL.LIZ = 0.0f;
                }
                super.postValue(aweme);
            }

            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void setValue(Aweme aweme) {
                String aid;
                if (aweme != null) {
                    FeedPipViewModel feedPipViewModel = this.this$0;
                    CopyOnWriteArrayList<C1210990hcP> copyOnWriteArrayList = FeedPipViewModel.LLJJJIL;
                    if (!C1211000hcQ.LIZ(aweme)) {
                        Aweme awemeVQ2 = feedPipViewModel.vQ2(aweme);
                        if (awemeVQ2 != null) {
                            feedPipViewModel.LLJJIJIL.LIZIZ = false;
                            setValue(awemeVQ2);
                            return;
                        }
                        return;
                    }
                }
                Aweme value = getValue();
                String aid2 = null;
                if (value != null) {
                    aid = value.getAid();
                } else {
                    aid = null;
                }
                if (aweme != null) {
                    aid2 = aweme.getAid();
                }
                if (!Intrinsics.LJFF(aid, aid2)) {
                    this.this$0.LLJJIJIL.LIZ = 0.0f;
                }
                super.setValue(aweme);
            }
        };
        this.LLILLJJLI = new C587670N3d("FeedPipViewModel");
        this.LLILZ = new Observer() { // from class: X.0sGC
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean z;
                FeedPipViewModel feedPipViewModel = this.LL;
                if (obj != null) {
                    feedPipViewModel.yQ2(((ArrayList) feedPipViewModel.wQ2()).indexOf(obj));
                }
                MutableLiveData<Boolean> mutableLiveData = feedPipViewModel.LLJJ;
                boolean z2 = false;
                if (feedPipViewModel.LLJJIJI > 0) {
                    z = true;
                } else {
                    z = false;
                }
                mutableLiveData.setValue(Boolean.valueOf(z));
                MutableLiveData<Boolean> mutableLiveData2 = feedPipViewModel.LLJILLL;
                if (feedPipViewModel.LLJJIJI < ((ArrayList) feedPipViewModel.wQ2()).size() - 1 || feedPipViewModel.LLJILJILJ) {
                    z2 = true;
                }
                mutableLiveData2.setValue(Boolean.valueOf(z2));
            }
        };
        this.LLIZLLLIL = new C0N3W(0);
        this.LLJI = new ArrayList();
        this.LLJIJIL = new LinkedHashSet();
        this.LLJILJIL = new MutableLiveData<>(C13BV.INSTANCE);
        this.LLJILJILJ = true;
        this.LLJILLL = new MutableLiveData<>(Boolean.TRUE);
        this.LLJJ = new MutableLiveData<>(Boolean.FALSE);
        this.LLJJI = new MutableLiveData<>(EnumC1620090sGF.SUCCEED);
        this.LLJJIJIIJIL = new LinkedHashSet();
        this.LLJJIJIL = new C1619990sG5();
    }

    public final Aweme vQ2(Aweme aweme) {
        boolean z;
        Integer numValueOf = Integer.valueOf(((ArrayList) this.LLJI).indexOf(aweme));
        if (numValueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ListIterator listIterator = ((ArrayList) this.LLJI).listIterator(numValueOf.intValue());
            while (listIterator.hasNext()) {
                Aweme aweme2 = (Aweme) listIterator.next();
                if (C1211000hcQ.LIZ(aweme2)) {
                    return aweme2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L20
            java.lang.String r1 = r4.getAid()
            com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1 r0 = r3.LL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getAid()
        L15:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L20
        L1b:
            r3.LLJJIII = r4
            return
        L1e:
            r0 = r2
            goto L15
        L20:
            r4 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel.xQ2(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void yQ2(int i) {
        if (i >= 0 && i < ((ArrayList) wQ2()).size()) {
            if (!((ArrayList) this.LLJI).isEmpty() && !((ArrayList) wQ2()).isEmpty()) {
                ((ArrayList) this.LLJI).indexOf(ListProtector.get(wQ2(), i));
                this.LLJJIJIL.getClass();
                this.LLJJIJI = i;
                return;
            }
            this.LLJJIJI = 0;
            this.LLJJIJIL.getClass();
        }
    }

    public final void zQ2(List<? extends Aweme> list) {
        if (((Boolean) C261830ANx.LIZ.getValue()).booleanValue()) {
            this.LLJIJIL.clear();
            Set<String> set = this.LLJIJIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAid());
            }
            set.addAll(arrayList);
        }
    }
}
