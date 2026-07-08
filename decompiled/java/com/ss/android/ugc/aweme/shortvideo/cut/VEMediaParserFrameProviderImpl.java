package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C01GW;
import X.C0L3L;
import X.C0L3M;
import X.C0L48;
import X.C11VU;
import X.C12UU;
import X.C15O7;
import X.C19FO;
import X.C19GS;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC2385309Wh;
import Y.ACallableS415S0100000_8;
import Y.ACallableS61S1100000_8;
import Y.ARunnableS13S1100000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.ss.android.vesdk.VEMediaParser;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import v7.o;

/* JADX INFO: loaded from: classes9.dex */
public final class VEMediaParserFrameProviderImpl implements C12UU, GenericLifecycleObserver {
    public final Context LL;
    public boolean LLILLJJLI;
    public int LLILZIL;
    public final Map<String, VEMediaParser> LLILLL = new LinkedHashMap();
    public final ExecutorService LLILZ = C786410Ut5.h4();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 175));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            releaseFrames();
        }
    }

    @Override // X.C12UU
    public final void LIZIZ() {
        this.LLILZ.submit(new Runnable() { // from class: X.0Kzc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VEMediaParserFrameProviderImpl@276f.releaseProvider$1");
                try {
                    VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl = this.LL;
                    Iterator it2 = ((LinkedHashMap) vEMediaParserFrameProviderImpl.LLILLL).entrySet().iterator();
                    while (it2.hasNext()) {
                        vEMediaParserFrameProviderImpl.LIZLLL((String) ((Map.Entry) it2.next()).getKey());
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VEMediaParserFrameProviderImpl@276f.releaseProvider$1");
            }
        });
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void releaseFrames() {
        C15O7.LIZJ(new ACallableS415S0100000_8(this, 4));
    }

    public VEMediaParserFrameProviderImpl(Context context) {
        this.LL = context;
        this.LLILZIL = (int) C11VU.LIZIZ(60.0f, context);
        if (context instanceof C19GS) {
            ((C19FO) context).getLifecycle().addObserver(this);
        }
    }

    @Override // X.C12UU
    public final void LIZ(int i) {
        this.LLILZIL = i;
    }

    @Override // X.C12UU
    public final void LIZLLL(String str) {
        this.LLILZ.submit(new ARunnableS13S1100000_8(this, str, 2));
    }

    @Override // X.C12UU
    public final void LIZJ(int i, String str, int i2, C0L3L c0l3l) {
        LJ(i, str, i2, c0l3l, true);
    }

    public final void LJ(final int i, final String str, final int i2, final C0L3L c0l3l, final boolean z) {
        C15O7 c15o7LIZJ;
        DiskLruCache.Snapshot snapshot;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(i2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0L48 c0l48 = (C0L48) this.LLILZLL.getValue();
        c0l48.getClass();
        if (!TextUtils.isEmpty(strLIZIZ) && (snapshot = c0l48.LIZIZ().get(MD5Utils.getMD5String(strLIZIZ))) != null) {
            snapshot.close();
            c15o7LIZJ = C15O7.LIZJ(new ACallableS61S1100000_8(this, strLIZIZ, 2));
        } else {
            o oVar = new o();
            this.LLILZ.execute(new C0L3M(str, this, i2, oVar, strLIZIZ));
            c15o7LIZJ = oVar.LIZ;
        }
        c15o7LIZJ.LJ(new InterfaceC2385309Wh() { // from class: X.0L3K
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("VEMediaParserFrameProviderImpl@276f.getBitmapInner$1");
                if (c15o7.LJIILL() && z) {
                    this.LJ(i, str, i2, c0l3l, false);
                } else {
                    Bitmap bitmap = (Bitmap) c15o7.LJIIL();
                    if (bitmap != null && (!bitmap.isRecycled())) {
                        VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl = this;
                        C0L3L c0l3l2 = c0l3l;
                        vEMediaParserFrameProviderImpl.getClass();
                        C1323050kX9 c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU(bitmap, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
                        if (c1323050kX9LJIJJLI != null && c1323050kX9LJIJJLI.LJIILLIIL()) {
                            c0l3l2.LIZ(c1323050kX9LJIJJLI.clone());
                            C1323050kX9.LJII(c1323050kX9LJIJJLI);
                        }
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VEMediaParserFrameProviderImpl@276f.getBitmapInner$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
