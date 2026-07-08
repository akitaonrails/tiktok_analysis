package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import X.C01GW;
import X.C04TS;
import X.C0CHQ;
import X.C0L3N;
import X.C0L48;
import X.C15O7;
import X.C2188811AlT;
import X.C238400w2;
import X.C2472609mW;
import X.C2472709mX;
import X.C366700EZg;
import X.C452501pT;
import X.C581190Mqr;
import X.C786410Ut5;
import X.C823050WQl;
import X.ExecutorServiceC822430WOb;
import X.InterfaceC2385309Wh;
import X.InterfaceC534950KyT;
import Y.ACallableS415S0100000_8;
import Y.ACallableS61S1100000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.ss.android.vesdk.VEMediaParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import v7.o;

/* JADX INFO: loaded from: classes9.dex */
public final class VEMediaParserProviderV2 implements GenericLifecycleObserver {
    public boolean LL;
    public final Map<String, VEMediaParser> LLILLJJLI = new LinkedHashMap();
    public final ExecutorService LLILLL;
    public final List<C2472609mW> LLILZ;
    public final List<C15O7<Bitmap>> LLILZIL;
    public final List<Long> LLILZLL;
    public final C01GW LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            releaseFrames();
        }
    }

    public final void LIZ() {
        Iterator<C2472609mW> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
        this.LLILZ.clear();
        this.LLILZIL.clear();
    }

    public final void LIZJ() {
        C15O7.LJJI(this.LLILZIL).LJ(new C581190Mqr(this, 0), C15O7.LJI, null);
        ((ArrayList) this.LLILZIL).clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void releaseFrames() {
        C15O7.LIZJ(new ACallableS415S0100000_8(this, 5));
    }

    public VEMediaParserProviderV2(Context context, Lifecycle lifecycle) {
        ExecutorService executorServiceH4;
        if (C04TS.LIZ()) {
            executorServiceH4 = new ExecutorServiceC822430WOb(C823050WQl.LIZLLL(), 1);
        } else {
            executorServiceH4 = C786410Ut5.h4();
        }
        this.LLILLL = executorServiceH4;
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
        this.LLILZLL = new ArrayList();
        this.LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(context, 176));
        this.LLIZLLLIL = C366700EZg.LIZ(56.0d);
        this.LLJ = C366700EZg.LIZ(56.0d);
        C0CHQ.LIZ().LJJIZ();
        lifecycle.addObserver(this);
    }

    public final void LIZIZ(final int i, final String str, final int i2, final InterfaceC534950KyT interfaceC534950KyT, final boolean z) {
        C15O7 c15o7LIZJ;
        DiskLruCache.Snapshot snapshot;
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(i2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0L48 c0l48 = (C0L48) this.LLIZ.getValue();
        c0l48.getClass();
        if (!TextUtils.isEmpty(strLIZIZ) && (snapshot = c0l48.LIZIZ().get(MD5Utils.getMD5String(strLIZIZ))) != null) {
            snapshot.close();
            c15o7LIZJ = C15O7.LIZJ(new ACallableS61S1100000_8(this, strLIZIZ, 0));
        } else {
            c238400w2.element = System.currentTimeMillis();
            C2472609mW c2472609mW = new C2472609mW();
            ((ArrayList) this.LLILZ).add(c2472609mW);
            C2472709mX c2472709mXLIZ = c2472609mW.LIZ();
            int i3 = this.LLJ;
            o oVar = new o();
            this.LLILLL.execute(new C0L3N(c2472709mXLIZ, oVar, str, i3, this, i2, strLIZIZ));
            c15o7LIZJ = oVar.LIZ;
            ((ArrayList) this.LLILZIL).add(c15o7LIZJ);
        }
        c15o7LIZJ.LJ(new InterfaceC2385309Wh() { // from class: X.0KyS
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("VEMediaParserProviderV2@d09d.getBitmapInner$1");
                if (c15o7.LJIILL() && z) {
                    this.LIZIZ(i, str, i2, interfaceC534950KyT, false);
                } else {
                    Bitmap bitmap = (Bitmap) c15o7.LJIIL();
                    if (bitmap != null && (!bitmap.isRecycled())) {
                        InterfaceC534950KyT interfaceC534950KyT2 = interfaceC534950KyT;
                        C238400w2 c238400w22 = c238400w2;
                        VEMediaParserProviderV2 vEMediaParserProviderV2 = this;
                        interfaceC534950KyT2.LIZ(bitmap);
                        if (c238400w22.element != -1) {
                            ((ArrayList) vEMediaParserProviderV2.LLILZLL).add(Long.valueOf(System.currentTimeMillis() - c238400w22.element));
                        }
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.getBitmapInner$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
