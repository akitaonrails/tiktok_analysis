package com.ss.android.ugc.aweme.tako.botpage.components.action.multiple;

import X.C09YA;
import X.C0PEM;
import X.C1160200gIU;
import X.C123100dR;
import X.C13LP;
import X.C1575790r6n;
import X.C1854150yLl;
import X.C1857510yRB;
import X.C1DFH;
import X.C2107308Nj;
import X.C2156908ch;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C326880Cre;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import Y.AComparatorS46S0000000_27;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultipleSelectVM extends AssemViewModel<C1160200gIU> {
    public static final /* synthetic */ int LLIZ = 0;
    public Map<Long, Pair<Boolean, Bitmap>> LLILLL;
    public Map<C326880Cre, WeakReference<View>> LLILZ;
    public final ConcurrentHashMap<String, C326880Cre> LL = new ConcurrentHashMap<>();
    public final Map<String, C326880Cre> LLILLJJLI = new LinkedHashMap();
    public final C09YA LLILZIL = new C09YA(this, AFwS206S0000000_18.get$arr$(619));
    public final AtomicInteger LLILZLL = new AtomicInteger(0);

    public final void AQ2() {
        setState(AFwS269S0000000_27.get$arr$(219));
    }

    public final List<C326880Cre> DQ2() {
        return C13LP.LJLLLL(new AComparatorS46S0000000_27(5), ((LinkedHashMap) this.LLILLJJLI).values());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1160200gIU(0);
    }

    public static String CQ2() {
        String nickname = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getNickname();
        return nickname == null ? "" : nickname;
    }

    public final void EQ2(Map<String, String> map) {
        String string = UUID.randomUUID().toString();
        setState(AFwS269S0000000_27.get$arr$(472));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1857510yRB(this, string, map, null), 2);
    }

    public final void FQ2(Function1<? super Boolean, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0yRF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160200gIU) obj).LLILZ;
            }
        }, null, null, null, new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 244), 14, null);
    }

    public final void GQ2(Function1<? super Boolean, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0yOq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160200gIU) obj).LL;
            }
        }, null, null, null, new AwS603S0100000_24(function1, (Function1<? super C1575790r6n, Unit>) 317), 14, null);
    }

    public final boolean zQ2(C326880Cre c326880Cre) {
        if (((LinkedHashMap) this.LLILLJJLI).get(c326880Cre.LLILLL.msgId) != null) {
            return true;
        }
        return false;
    }

    public final void BQ2(InterfaceC665370Q7z interfaceC665370Q7z, Function1<? super Bitmap, Unit> function1) {
        Collection collectionValues;
        Map<Long, Pair<Boolean, Bitmap>> map = this.LLILLL;
        if (map != null && (collectionValues = new TreeMap(map).values()) != null) {
            ArrayList arrayList = new ArrayList(C13LP.LJJJJLI(collectionValues));
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2156908ch(interfaceC665370Q7z, arrayList, null, function1), 3);
        }
    }

    public final void vQ2(boolean z, C326880Cre c326880Cre) {
        String str = c326880Cre.LLILLL.msgId;
        if (C123100dR.LIZ(str) && str != null) {
            if (z) {
                this.LL.put(str, c326880Cre);
            } else {
                this.LL.remove(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(long r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1857540yRE
            if (r0 == 0) goto L4e
            r6 = r11
            X.0yRE r6 = (X.C1857540yRE) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r2 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L46
            if (r0 != r5) goto L57
            long r0 = r6.LLILLJJLI
            long r9 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L26:
            java.util.concurrent.atomic.AtomicInteger r2 = r8.LLILZLL
            int r2 = r2.get()
            if (r2 <= 0) goto L54
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 > 0) goto L54
            r6.LL = r9
            r6.LLILLJJLI = r0
            r6.LLILZIL = r5
            r2 = 50
            java.lang.Object r2 = X.AnonymousClass0958.LIZIZ(r2, r6)
            if (r2 != r7) goto L26
            return r7
        L46:
            X.C155000ia.LIZIZ(r2)
            long r0 = java.lang.System.currentTimeMillis()
            goto L26
        L4e:
            X.0yRE r6 = new X.0yRE
            r6.<init>(r8, r11)
            goto L12
        L54:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM.wQ2(long, X.05Vn):java.lang.Object");
    }

    public final void xQ2(Bitmap bitmap, C326880Cre c326880Cre) {
        boolean z;
        Pair<Boolean, Bitmap> pairRemove;
        Bitmap second;
        if (this.LLILLL == null) {
            this.LLILLL = new LinkedHashMap();
        }
        if (bitmap == null) {
            Map<Long, Pair<Boolean, Bitmap>> map = this.LLILLL;
            if (map != null && (pairRemove = map.remove(Long.valueOf(c326880Cre.LLILLL.serverSeq))) != null && (second = pairRemove.getSecond()) != null) {
                second.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(second);
                return;
            }
            return;
        }
        Map<Long, Pair<Boolean, Bitmap>> map2 = this.LLILLL;
        if (map2 == null) {
            return;
        }
        Long lValueOf = Long.valueOf(c326880Cre.LLILLL.serverSeq);
        if (c326880Cre.LLILLL.sender.senderType == 2) {
            z = true;
        } else {
            z = false;
        }
        map2.put(lValueOf, new Pair<>(Boolean.valueOf(z), bitmap));
    }

    public final void yQ2(List list, boolean z) {
        ArrayList<C326880Cre> arrayList = new ArrayList();
        for (Object obj : list) {
            if (C123100dR.LIZ(((C326880Cre) obj).LLILLL.msgId)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (C326880Cre c326880Cre : arrayList) {
                if (z) {
                    this.LLILLJJLI.put(c326880Cre.LLILLL.msgId, c326880Cre);
                } else {
                    this.LLILLJJLI.remove(c326880Cre.LLILLL.msgId);
                }
            }
            setState(new AwS606S0100000_27(this, 585));
        }
    }
}
