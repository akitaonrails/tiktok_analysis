package com.ss.android.ugc.aweme.poi.commonalbum.viewmodel;

import X.C098200Yq;
import X.C0H7B;
import X.C0H7E;
import X.C0HVI;
import X.C0HVP;
import X.C0HVW;
import X.C0WQX;
import X.C1203204nG;
import X.C1272304yP;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C1954807lC;
import X.C2093608Ic;
import X.C2097908Jt;
import X.C2123408To;
import X.C2123508Tp;
import X.C2360109Mp;
import X.C2360309Mr;
import X.C442070HVd;
import X.C442100HVg;
import X.C442110HVh;
import X.C823050WQl;
import X.EnumC442080HVe;
import X.InterfaceC0148002o;
import X.RunnableC2359909Mn;
import Y.ARunnableS5S0310000_6;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceAlbumVM extends AssemViewModel<C0HVP> {
    public static final /* synthetic */ int LLJJ = 0;
    public Function1<? super C2360309Mr, Unit> LLILZ;
    public C1272304yP LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public C442110HVh LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final ExecutorService LLJILJILJ;
    public final ExecutorService LLJILLL;
    public boolean LL = true;
    public boolean LLILLJJLI = true;
    public boolean LLILLL = true;
    public final CopyOnWriteArrayList<C0H7B> LLILZIL = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<C0H7B>> LLILZLL = new ConcurrentHashMap<>();

    public final int zQ2() {
        Object c098200Yq;
        AlbumTrackParams albumTrackParams;
        Map<String, String> map;
        String str;
        try {
            C442110HVh c442110HVh = this.LLJI;
            c098200Yq = Integer.valueOf((c442110HVh == null || (albumTrackParams = c442110HVh.LJFF) == null || (map = albumTrackParams.bizParams) == null || (str = map.get("has_chosen_image_cnt")) == null) ? 0 : CastIntegerProtector.parseInt(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        int iIntValue = num != null ? num.intValue() : 0;
        CopyOnWriteArrayList<C0H7E> copyOnWriteArrayList = getState().LLIZLLLIL.LIZ;
        return iIntValue + (copyOnWriteArrayList != null ? copyOnWriteArrayList.size() : 0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0HVP(0);
    }

    public LocalServiceAlbumVM() {
        new LinkedHashMap();
        this.LLJ = -1L;
        this.LLJI = new C442110HVh(C1697810uHb.LJIIJJI(EnumC442080HVe.TAKE_PHOTO, EnumC442080HVe.PHOTO), 0, null, "back", 1, null, -1L);
        C0WQX c0wqx = C0WQX.SERIAL;
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(c0wqx);
        c2123408ToLIZ.LIZIZ = "compressPhoto";
        this.LLJILJILJ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
        C2123408To c2123408ToLIZ2 = C2123508Tp.LIZ(c0wqx);
        c2123408ToLIZ2.LIZIZ = "lsFetchAlbum";
        this.LLJILLL = C823050WQl.LIZ(c2123408ToLIZ2.LIZ());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJILLL.shutdownNow();
    }

    public final String xQ2() {
        C0HVI c0hvi = getState().LLILLJJLI;
        if (c0hvi == null) {
            return "";
        }
        int i = C442070HVd.LIZIZ[c0hvi.ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "none" : "" : "partial" : "total";
    }

    public final boolean yQ2() {
        return getState().LLILLL == C0HVW.TAKE_PHOTO_PERMISSION;
    }

    public final void BQ2(List<C0H7E> list) {
        int i;
        boolean z;
        boolean z2;
        int iIntValue;
        boolean z3;
        String str;
        CopyOnWriteArrayList<C0H7B> copyOnWriteArrayList;
        C442110HVh c442110HVh = this.LLJI;
        if (c442110HVh != null) {
            i = c442110HVh.LJ;
        } else {
            i = 0;
        }
        if (list.size() >= i) {
            z = true;
        } else {
            z = false;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C0H7E c0h7e : list) {
            Pair pair = new Pair(c0h7e.LIZ, Integer.valueOf(c0h7e.LIZIZ));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        int size = this.LLILZIL.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0H7B c0h7b = this.LLILZIL.get(i2);
            Integer num = (Integer) linkedHashMap.get(c0h7b.LLILLJJLI);
            if (num != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            if (z && !z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c0h7b.LLILLL != z2 || c0h7b.LLILZ != iIntValue || c0h7b.LLILZIL != z3) {
                C0H7B c0h7bLIZ = C0H7B.LIZ(c0h7b, z2, iIntValue, z3);
                this.LLILZIL.set(i2, c0h7bLIZ);
                MediaModel mediaModel = c0h7b.LLILLJJLI;
                if (mediaModel != null && (str = mediaModel.albumClass) != null && str.length() != 0 && (copyOnWriteArrayList = this.LLILZLL.get(str)) != null) {
                    Iterator<C0H7B> it2 = copyOnWriteArrayList.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(it2.next().LLILLJJLI, c0h7b.LLILLJJLI)) {
                            if (i3 != -1) {
                                copyOnWriteArrayList.set(i3, c0h7bLIZ);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
    }

    public final void vQ2(Context context) {
        List<EnumC442080HVe> list;
        List<EnumC442080HVe> list2;
        List<EnumC442080HVe> list3;
        C442110HVh c442110HVh = this.LLJI;
        if (c442110HVh != null) {
            list = c442110HVh.LIZ;
        } else {
            list = null;
        }
        for (EnumC442080HVe enumC442080HVe : EnumC442080HVe.getEntries()) {
            int i = C442070HVd.LIZ[enumC442080HVe.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (list == null) {
                        list2 = C13BV.INSTANCE;
                    } else {
                        list2 = list;
                    }
                    if (!list2.contains(enumC442080HVe)) {
                        setState(AFwS236S0000000_6.get$arr$(255));
                    } else if (C442100HVg.LIZIZ(context, (String[]) C442100HVg.LIZ.getValue())) {
                        setState(AFwS236S0000000_6.get$arr$(256));
                        setState(new AwS21S0010000_6(true, 27));
                    } else if (C442100HVg.LIZ(context)) {
                        setState(AFwS236S0000000_6.get$arr$(257));
                    } else {
                        setState(AFwS236S0000000_6.get$arr$(258));
                        setState(new AwS21S0010000_6(true, 27));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                if (list == null) {
                    list3 = C13BV.INSTANCE;
                } else {
                    list3 = list;
                }
                if (!list3.contains(enumC442080HVe)) {
                    setState(AFwS236S0000000_6.get$arr$(252));
                } else if (C442100HVg.LIZIZ(context, new String[]{"android.permission.CAMERA"})) {
                    setState(AFwS236S0000000_6.get$arr$(253));
                } else {
                    setState(AFwS236S0000000_6.get$arr$(254));
                }
            }
        }
    }

    public final void wQ2(Context context, Function1<? super List<C0H7B>, Unit> function1) {
        if (context == null) {
            return;
        }
        boolean z = this.LL;
        this.LL = false;
        if (!C1203204nG.LIZ()) {
            this.LLJILLL.execute(new ARunnableS5S0310000_6(context, z, this, function1, 0));
        } else {
            this.LLJILLL.execute(new ARunnableS5S0310000_6(context, z, this, function1, 1));
        }
    }

    public final void AQ2(Activity activity, List<? extends Uri> list, String str, Function0<Unit> function0) {
        if (activity == null) {
            return;
        }
        this.LLJ = System.currentTimeMillis();
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator<? extends Uri> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (C2093608Ic.LJ(it2.next().toString())) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Uri> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().toString());
            }
            this.LLJILJILJ.execute(new RunnableC2359909Mn(activity, arrayList, this.LLJI, new C2360109Mp(this, activity, arrayList, str, function0)));
            return;
        }
        Function1<? super C2360309Mr, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(new C2360309Mr(false, "Path empty", null));
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
