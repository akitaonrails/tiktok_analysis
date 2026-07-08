package com.ss.android.ugc.gamora.editor.mixediting.resource.utils;

import X.C01GW;
import X.C13LP;
import X.C1412860ms0;
import X.C1412940ms8;
import X.C2026507wl;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1416020mx6;
import X.InterfaceC1437705jz;
import Y.ARunnableS11S0310000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS28S0201000_22;
import Y.ARunnableS55S0300000_22;
import Y.ARunnableS91S0200000_22;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes23.dex */
public final class MixAssetDownloader implements InterfaceC1416020mx6<C1412860ms0>, LifecycleEventObserver {
    public static final boolean LLJ;
    public final int LL;
    public final List<InterfaceC1416020mx6<C1412860ms0>> LLILLJJLI;
    public final Function0<VideoPublishEditModel> LLILLL;
    public final LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> LLILZ = new LinkedList<>();
    public final LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> LLILZIL = new LinkedList<>();
    public final LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> LLILZLL = new LinkedList<>();
    public final LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> LLIZ = new LinkedList<>();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(219));

    public final void LJFF() {
        Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pairPoll;
        Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> next;
        InterfaceC1416020mx6<C1412860ms0> next2;
        InterfaceC1416020mx6<C1412860ms0> next3;
        int size = this.LLILZ.size() + this.LLILZIL.size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("findNextTaskAndRun, running=");
        sbLIZ.append(this.LLILZ.size());
        sbLIZ.append(", cancelling=");
        sbLIZ.append(this.LLILZIL.size());
        sbLIZ.append(",  size = ");
        sbLIZ.append(size);
        sbLIZ.append(", max=");
        sbLIZ.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("findNextTaskAndRun, running=");
        sbLIZ2.append(C13LP.LJJLIIIJ(this.LLILZ, null, e3.e, e3.f, 0, null, AFwS261S0000000_22.get$arr$(186), 25));
        sbLIZ2.append(", cancelling=");
        sbLIZ2.append(C13LP.LJJLIIIJ(this.LLILZIL, null, e3.e, e3.f, 0, null, AFwS261S0000000_22.get$arr$(187), 25));
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
        InterfaceC1416020mx6<C1412860ms0> interfaceC1416020mx6 = null;
        if (!(!this.LLILZLL.isEmpty())) {
            if (!(!this.LLIZ.isEmpty()) || size >= this.LL || (pairPoll = this.LLIZ.poll()) == null) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("findNextTaskAndRun() data=");
            sbLIZ3.append(pairPoll.getFirst().LIZ.getAsset_id());
            sbLIZ3.append(", type=");
            sbLIZ3.append(pairPoll.getFirst().LIZ.getAsset_type());
            sbLIZ3.append(" in normal");
            C2188811AlT.LIZIZ(sbLIZ3);
            Iterator<InterfaceC1416020mx6<C1412860ms0>> it2 = this.LLILLJJLI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1416020mx6<C1412860ms0> next4 = it2.next();
                if (next4.LIZ(pairPoll.getFirst())) {
                    interfaceC1416020mx6 = next4;
                    break;
                }
            }
            InterfaceC1416020mx6<C1412860ms0> interfaceC1416020mx62 = interfaceC1416020mx6;
            if (interfaceC1416020mx62 != null) {
                C1412940ms8 c1412940ms8 = C1412940ms8.LIZ;
                C1412860ms0 first = pairPoll.getFirst();
                c1412940ms8.getClass();
                C1412940ms8.LIZJ(first, true);
                this.LLILZ.add(pairPoll);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("added data=");
                sbLIZ4.append(pairPoll.getFirst().LIZ.getAsset_id());
                sbLIZ4.append(" to running from normal");
                C2188811AlT.LIZIZ(sbLIZ4);
                C1412860ms0 first2 = pairPoll.getFirst();
                final C1412860ms0 first3 = pairPoll.getFirst();
                interfaceC1416020mx62.LIZJ(first2, false, new InterfaceC1437705jz<C1412860ms0>() { // from class: X.0mx5
                    @Override // X.InterfaceC1437705jz
                    public final void LIZ(Exception exc) {
                        this.LIZ.LJI().submit(new ARunnableS55S0300000_22(this.LIZ, first3, exc, 10));
                    }

                    @Override // X.InterfaceC1437705jz
                    public final void onProgress(int i) {
                        this.LIZ.LJI().submit(new ARunnableS28S0201000_22(this.LIZ, first3, i, 4));
                    }

                    @Override // X.InterfaceC1437705jz
                    public final void LIZIZ(C1412860ms0 c1412860ms0, boolean z) {
                        this.LIZ.LJI().submit(new ARunnableS11S0310000_22(this.LIZ, first3, c1412860ms0, z, 2));
                    }
                });
                return;
            }
            return;
        }
        if (this.LLILZ.size() >= this.LL) {
            int size2 = (this.LLILZ.size() - this.LL) + 1;
            for (int i = 0; i < size2; i++) {
                Iterator<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> it3 = this.LLILZ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pair = next;
                    Iterator<InterfaceC1416020mx6<C1412860ms0>> it4 = this.LLILLJJLI.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next3 = it4.next();
                            if (next3.LIZ(pair.getFirst())) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    InterfaceC1416020mx6<C1412860ms0> interfaceC1416020mx63 = next3;
                    if (interfaceC1416020mx63 != null && interfaceC1416020mx63.LIZLLL(pair.getFirst())) {
                        break;
                    }
                }
                Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pair2 = next;
                if (pair2 != null) {
                    LinkedList<Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>>> linkedList = this.LLILZ;
                    ArrayList<Pair> arrayList = new ArrayList();
                    for (Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pair3 : linkedList) {
                        if (LJII(pair3.getFirst(), pair2.getFirst())) {
                            arrayList.add(pair3);
                        }
                    }
                    for (Pair pair4 : arrayList) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("[cancelBeforeAdd][running] to [cancelling] data=");
                        sbLIZ5.append(((C1412860ms0) pair4.getFirst()).LIZ.getAsset_id());
                        sbLIZ5.append(", type=");
                        sbLIZ5.append(((C1412860ms0) pair4.getFirst()).LIZ.getAsset_type());
                        C2188811AlT.LIZIZ(sbLIZ5);
                    }
                    this.LLILZIL.addAll(arrayList);
                    Iterator<InterfaceC1416020mx6<C1412860ms0>> it5 = this.LLILLJJLI.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            if (next2.LIZ(pair2.getFirst())) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    InterfaceC1416020mx6<C1412860ms0> interfaceC1416020mx64 = next2;
                    if (interfaceC1416020mx64 != null) {
                        interfaceC1416020mx64.LIZIZ(pair2.getFirst());
                    }
                }
            }
        }
        Pair<C1412860ms0, InterfaceC1437705jz<C1412860ms0>> pairPoll2 = this.LLILZLL.poll();
        if (pairPoll2 != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("findNextTaskAndRun() data=");
            sbLIZ6.append(pairPoll2.getFirst().LIZ.getAsset_id());
            sbLIZ6.append(", type=");
            sbLIZ6.append(pairPoll2.getFirst().LIZ.getAsset_consumer_type());
            sbLIZ6.append(" in priority");
            C2188811AlT.LIZIZ(sbLIZ6);
            Iterator<InterfaceC1416020mx6<C1412860ms0>> it6 = this.LLILLJJLI.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                InterfaceC1416020mx6<C1412860ms0> next5 = it6.next();
                if (next5.LIZ(pairPoll2.getFirst())) {
                    interfaceC1416020mx6 = next5;
                    break;
                }
            }
            InterfaceC1416020mx6<C1412860ms0> interfaceC1416020mx65 = interfaceC1416020mx6;
            if (interfaceC1416020mx65 != null) {
                C1412940ms8 c1412940ms82 = C1412940ms8.LIZ;
                C1412860ms0 first4 = pairPoll2.getFirst();
                c1412940ms82.getClass();
                C1412940ms8.LIZJ(first4, false);
                this.LLILZ.add(pairPoll2);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("added data=");
                sbLIZ7.append(pairPoll2.getFirst().LIZ.getAsset_id());
                sbLIZ7.append(" to running from high");
                C2188811AlT.LIZIZ(sbLIZ7);
                C1412860ms0 first5 = pairPoll2.getFirst();
                final C1412860ms0 first6 = pairPoll2.getFirst();
                interfaceC1416020mx65.LIZJ(first5, true, new InterfaceC1437705jz<C1412860ms0>() { // from class: X.0mx5
                    @Override // X.InterfaceC1437705jz
                    public final void LIZ(Exception exc) {
                        this.LIZ.LJI().submit(new ARunnableS55S0300000_22(this.LIZ, first6, exc, 10));
                    }

                    @Override // X.InterfaceC1437705jz
                    public final void onProgress(int i2) {
                        this.LIZ.LJI().submit(new ARunnableS28S0201000_22(this.LIZ, first6, i2, 4));
                    }

                    @Override // X.InterfaceC1437705jz
                    public final void LIZIZ(C1412860ms0 c1412860ms0, boolean z) {
                        this.LIZ.LJI().submit(new ARunnableS11S0310000_22(this.LIZ, first6, c1412860ms0, z, 2));
                    }
                });
            }
        }
    }

    public final ExecutorService LJI() {
        return (ExecutorService) this.LLIZLLLIL.getValue();
    }

    static {
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        LLJ = false;
    }

    @Override // X.InterfaceC1416020mx6
    public final void LIZIZ(C1412860ms0 c1412860ms0) {
        Boolean boolValueOf;
        InterfaceC1416020mx6<C1412860ms0> next;
        C1412860ms0 c1412860ms02 = c1412860ms0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelDownloadData(), name=");
        sbLIZ.append(c1412860ms02.LIZ.getTitle());
        sbLIZ.append(", data=");
        sbLIZ.append(c1412860ms02.LIZ.getAsset_id());
        sbLIZ.append(", type=");
        sbLIZ.append(c1412860ms02.LIZ.getAsset_type());
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<InterfaceC1416020mx6<C1412860ms0>> it2 = this.LLILLJJLI.iterator();
        while (true) {
            boolValueOf = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ(c1412860ms02)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1416020mx6<C1412860ms0> interfaceC1416020mx6 = next;
        if (interfaceC1416020mx6 != null) {
            boolValueOf = Boolean.valueOf(interfaceC1416020mx6.LIZLLL(c1412860ms02));
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cancelDownloadData() data=");
            sbLIZ2.append(c1412860ms02.LIZ.getAsset_id());
            sbLIZ2.append(", type=");
            sbLIZ2.append(c1412860ms02.LIZ.getAsset_type());
            sbLIZ2.append(" not supported");
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        LJI().submit(new ARunnableS91S0200000_22(this, c1412860ms02, 38));
    }

    @Override // X.InterfaceC1416020mx6
    public final /* bridge */ /* synthetic */ boolean LIZLLL(C1412860ms0 c1412860ms0) {
        return false;
    }

    @Override // X.InterfaceC1416020mx6
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final boolean LIZ(C1412860ms0 c1412860ms0) {
        List<InterfaceC1416020mx6<C1412860ms0>> list = this.LLILLJJLI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<InterfaceC1416020mx6<C1412860ms0>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ(c1412860ms0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJII(C1412860ms0 c1412860ms0, C1412860ms0 c1412860ms02) {
        if (c1412860ms0.LIZ.getAsset_parent_type() == c1412860ms02.LIZ.getAsset_parent_type() && Intrinsics.LJFF(c1412860ms0.LIZ.getAsset_id(), c1412860ms02.LIZ.getAsset_id())) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2026507wl.LIZ[event.ordinal()] == 1) {
            LJI().submit(new ARunnableS122S0100000_22(this, 65));
        }
    }

    @Override // X.InterfaceC1416020mx6
    public final void LIZJ(C1412860ms0 c1412860ms0, boolean z, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz) {
        C1412860ms0 c1412860ms02 = c1412860ms0;
        if (c1412860ms02.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadData -> data.downloadedAsset != null, assetId=");
            sbLIZ.append(c1412860ms02.LIZ.getAsset_id());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (LIZ(c1412860ms02)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("downloadData -> ");
            sbLIZ2.append(c1412860ms02.LIZ.getTitle());
            sbLIZ2.append(", assetId=");
            sbLIZ2.append(c1412860ms02.LIZ.getAsset_id());
            sbLIZ2.append(", highPriority=");
            sbLIZ2.append(z);
            C2188811AlT.LIZIZ(sbLIZ2);
            LJI().submit(new ARunnableS11S0310000_22(this, c1412860ms02, interfaceC1437705jz, z, 1));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("unsupported data type: ");
        sbLIZ3.append(c1412860ms02.LIZ.getAsset_parent_type());
        interfaceC1437705jz.LIZ(new Exception(C2188811AlT.LIZIZ(sbLIZ3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MixAssetDownloader(LifecycleOwner lifecycleOwner, int i, List<? extends InterfaceC1416020mx6<C1412860ms0>> list, Function0<? extends VideoPublishEditModel> function0) {
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = function0;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
