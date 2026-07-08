package com.bytedance.ies.xelement.bytedlottie;

import X.AbstractC1290140jg4;
import X.AbstractC1291220jho;
import X.AbstractC1321260kUG;
import X.AbstractC1327750kej;
import X.C08XD;
import X.C1289440jew;
import X.C1289620jfE;
import X.C1290210jgB;
import X.C1290230jgD;
import X.C1290280jgI;
import X.C1290490jgd;
import X.C1290610jgp;
import X.C1290800jh8;
import X.C1290880jhG;
import X.C1290900jhI;
import X.C1290910jhJ;
import X.C1290940jhM;
import X.C1291330jhz;
import X.C1291430ji9;
import X.C1291600jiQ;
import X.C1294030jmL;
import X.C1298720jtu;
import X.C1299120juY;
import X.C1315790kLR;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1325700kbQ;
import X.C2188811AlT;
import X.C530820Kro;
import X.C786410Ut5;
import X.C822700WPc;
import X.ChoreographerFrameCallbackC1291420ji8;
import X.EnumC1290240jgE;
import X.EnumC1331380kka;
import X.InterfaceC1290690jgx;
import X.InterfaceC1290780jh6;
import X.InterfaceC1291000jhS;
import X.InterfaceC1312540kGC;
import X.InterfaceC1320200kSY;
import X.InterfaceC1967107nB;
import X.InterfaceC2033107xp;
import Y.AAListenerS331S0100000_20;
import Y.ACallableS68S1100000_20;
import Y.ACallableS92S0400000_20;
import Y.AComparatorS39S0000000_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS24S1200000_20;
import Y.AUListenerS269S0100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxBytedLottieView extends LynxUI<C1291330jhz> implements InterfaceC1290690jgx {
    public static final /* synthetic */ int LLJLL = 0;
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public Set<String> LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public EnumC1290240jgE LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public ReadableMap LLJJI;
    public InterfaceC2033107xp<C1290210jgB> LLJJIII;
    public final List<Integer> LLJJIJI;
    public final HashSet<Integer> LLJJIJIIJIL;
    public final C1290940jhM LLJJIJIL;
    public C1291600jiQ LLJJJ;
    public final C1290910jhJ LLJJJIL;
    public String LLJJJJ;
    public final ArrayList<C1323050kX9<?>> LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public volatile boolean LLJLIL;
    public C1290280jgI LLJLILLLLZIIL;

    public LynxBytedLottieView(s sVar) {
        this(sVar, 0);
    }

    @Override // X.InterfaceC1291560jiM
    public final void LJJIFFI() {
        LynxLog.e("byted-lottie", "fetch bitmap should not be called!!!");
    }

    public final void LJJIIZI() {
        if (this.LLJ != null) {
            this.LLJ = null;
            this.LLJILLL = true;
            ((C1291330jhz) this.mView).setImageDrawable(null);
            C1291330jhz c1291330jhz = (C1291330jhz) this.mView;
            if (c1291330jhz != null) {
                c1291330jhz.setImageAssetDelegate(null);
                c1291330jhz.cancelAnimation();
            }
        }
    }

    public final void LJJIJLIJ() {
        C1291330jhz c1291330jhz = (C1291330jhz) this.mView;
        if (c1291330jhz != null) {
            this.LLJJIJIIJIL.clear();
            c1291330jhz.playAnimation();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 193);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS120S0100000_20.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), aRunnableS120S0100000_20);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLILLJJLI && !this.LLILLL && !this.LLIZLLLIL && this.LLJILLL) {
            LJJIJLIJ();
        }
        this.LLIZLLLIL = false;
    }

    public final boolean LJJIJIL(String str) {
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:3:0x0003, B:5:0x0020, B:7:0x002a, B:11:0x0035, B:13:0x003d, B:14:0x0055, B:23:0x0070, B:26:0x0077, B:28:0x007f, B:29:0x0083, B:31:0x0089, B:32:0x008c, B:17:0x005e, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00c8, B:44:0x00d2, B:48:0x00fd, B:49:0x0101, B:20:0x0067, B:34:0x00b0), top: B:55:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:3:0x0003, B:5:0x0020, B:7:0x002a, B:11:0x0035, B:13:0x003d, B:14:0x0055, B:23:0x0070, B:26:0x0077, B:28:0x007f, B:29:0x0083, B:31:0x0089, B:32:0x008c, B:17:0x005e, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00c8, B:44:0x00d2, B:48:0x00fd, B:49:0x0101, B:20:0x0067, B:34:0x00b0), top: B:55:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.LJJIJL(java.lang.String):void");
    }

    public final String LJJIZ(String str) {
        String strLIZIZ;
        EnumC1290240jgE enumC1290240jgE = this.LLJIJIL;
        if (enumC1290240jgE != null) {
            int i = C1290230jgD.LIZ[enumC1290240jgE.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && !LJJIJIL(str)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LLJ);
                        sbLIZ.append('/');
                        sbLIZ.append(str);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    return str;
                }
                if (LJJIJIL(str)) {
                    strLIZIZ = C1294030jmL.LIZ(this.mContext, str, false);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LLJ);
                    sbLIZ2.append('/');
                    sbLIZ2.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (!LJJIJIL(strLIZIZ) && !u.LJJIIJZLJL(strLIZIZ, "file:", false)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("file:");
                    sbLIZ3.append(strLIZIZ);
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
                return strLIZIZ;
            }
            if (!LJJIJIL(str)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(this.LLJ);
                sbLIZ4.append('/');
                sbLIZ4.append(str);
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            return str;
        }
        return str;
    }

    public final void LJJJJ(String str) {
        int iLJJJJ = a0.LJJJJ(str, '/', 0, 6);
        if (iLJJJJ > 0) {
            this.LLJ = str.substring(0, iLJJJJ);
            ((C1291330jhz) this.mView).setImageAssetDelegate(this);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uri is error:");
            sbLIZ.append(str);
            LynxLog.e("byted-lottie", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        boolean z;
        final C1290900jhI c1290900jhI = new C1290900jhI(context);
        if (Build.VERSION.SDK_INT == 24 && u.LJIJI("huawei", Build.MANUFACTURER, true)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (c1290900jhI.LLIZLLLIL != z2) {
            c1290900jhI.LLIZLLLIL = z2;
            c1290900jhI.LIZJ();
        }
        c1290900jhI.enableMergePathsForKitKatAndAbove(true);
        c1290900jhI.LLJ = true;
        C1291430ji9 c1291430ji9 = c1290900jhI.LLILLL;
        c1291430ji9.LLJILLL = true;
        c1291430ji9.getClass();
        c1290900jhI.LLILLL.LLILLL.addListener(new AAListenerS331S0100000_20(this, 1));
        InterfaceC1291000jhS interfaceC1291000jhS = new InterfaceC1291000jhS() { // from class: X.0jhE
            @Override // X.InterfaceC1291000jhS
            public final void LIZ(C1291600jiQ c1291600jiQ) {
                C1291600jiQ composition;
                C1291600jiQ composition2;
                ReadableMap readableMap;
                final LynxBytedLottieView lynxBytedLottieView = this.LIZ;
                C1290900jhI c1290900jhI2 = c1290900jhI;
                lynxBytedLottieView.LLJJJ = c1291600jiQ;
                C1291010jhT performanceTracker = c1290900jhI2.getPerformanceTracker();
                if (performanceTracker != null) {
                    performanceTracker.LIZ = true;
                }
                C1291010jhT performanceTracker2 = c1290900jhI2.getPerformanceTracker();
                if (performanceTracker2 != null) {
                    performanceTracker2.LIZJ.add(new InterfaceC1290980jhQ() { // from class: X.0jhK
                        @Override // X.InterfaceC1290980jhQ
                        public final void LIZ() {
                            lynxBytedLottieView.LLJJJIL.LIZIZ();
                        }
                    });
                }
                if (c1291600jiQ.LJIILIIL) {
                    C1291600jiQ c1291600jiQ2 = lynxBytedLottieView.LLJJJ;
                    if (c1291600jiQ2 != null && (readableMap = lynxBytedLottieView.LLJJI) != null) {
                        new C1290490jgd(new ACallableS92S0400000_20(readableMap, new C1290880jhG(lynxBytedLottieView), c1291600jiQ2, lynxBytedLottieView, 0));
                        return;
                    }
                    return;
                }
                float f = 0.0f;
                int frame = 0;
                if (c1291600jiQ.LJIIL) {
                    C1291330jhz c1291330jhz = (C1291330jhz) lynxBytedLottieView.mView;
                    if (c1291330jhz != null) {
                        frame = c1291330jhz.getFrame();
                    }
                    C1291330jhz c1291330jhz2 = (C1291330jhz) lynxBytedLottieView.mView;
                    if (c1291330jhz2 != null && (composition2 = c1291330jhz2.getComposition()) != null) {
                        f = composition2.LJIIJ - composition2.LJIIIZ;
                    }
                    lynxBytedLottieView.LJJJIL("ready", lynxBytedLottieView.LJJIJ(frame, (int) f, lynxBytedLottieView.LLIZ, lynxBytedLottieView.LLJJ));
                    lynxBytedLottieView.LLJJIJIL.LIZ(lynxBytedLottieView.LLJI);
                    if (!lynxBytedLottieView.LLILLJJLI || !lynxBytedLottieView.LLJILLL) {
                        return;
                    }
                    lynxBytedLottieView.LJJIJLIJ();
                    return;
                }
                C1291330jhz c1291330jhz3 = (C1291330jhz) lynxBytedLottieView.mView;
                if (c1291330jhz3 != null) {
                    frame = c1291330jhz3.getFrame();
                }
                C1291330jhz c1291330jhz4 = (C1291330jhz) lynxBytedLottieView.mView;
                if (c1291330jhz4 != null && (composition = c1291330jhz4.getComposition()) != null) {
                    f = composition.LJIIJ - composition.LJIIIZ;
                }
                lynxBytedLottieView.LJJJIL("error", lynxBytedLottieView.LJJIJ(frame, (int) f, lynxBytedLottieView.LLIZ, lynxBytedLottieView.LLJJ));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lottieComposition Loaded, but bitmap is not ready, lottieUrl is ");
                sbLIZ.append(lynxBytedLottieView.LLJI);
                sbLIZ.append(", mSrcDir is ");
                sbLIZ.append(lynxBytedLottieView.LLJ);
                LynxLog.e("byted-lottie", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        C1291600jiQ c1291600jiQ = c1290900jhI.LLJILJIL;
        if (c1291600jiQ != null) {
            interfaceC1291000jhS.LIZ(c1291600jiQ);
        }
        ((HashSet) c1290900jhI.LLJI).add(interfaceC1291000jhS);
        c1290900jhI.LLILLL.LLILLL.addUpdateListener(new AUListenerS269S0100000_20(this, 4));
        return c1290900jhI;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LLILLJJLI = z;
        T t = this.mView;
        if (t != 0) {
            ((C1290900jhI) t).setMAutoPlay(z);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieAnimationView");
    }

    @InterfaceC1312540kGC(name = "bid")
    public final void setBID(String str) {
        this.LLJJJJ = str;
    }

    @InterfaceC1312540kGC(defaultInt = -1, name = "end-frame")
    public final void setEndFrame(int i) {
        if (i < 0) {
            LynxLog.i("byted-lottie", "use negative end-frame, switch to MaxValue by default!!");
            this.LLJJL = Integer.MAX_VALUE;
            ((C1291330jhz) this.mView).setMaxFrame(Integer.MAX_VALUE);
        } else {
            this.LLJJL = i;
            ((C1291330jhz) this.mView).setMaxFrame(i);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        Set<String> setKeySet;
        super.setEvents(map);
        if (map != null) {
            setKeySet = map.keySet();
        } else {
            setKeySet = null;
        }
        this.LLILZ = setKeySet;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "filter-image")
    public final void setFilterImage(boolean z) {
        this.LLJL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "ignore-attach-status")
    public final void setIgnoreAttachStatus(boolean z) {
        C1290900jhI c1290900jhI;
        T t = this.mView;
        if ((t instanceof C1290900jhI) && (c1290900jhI = (C1290900jhI) t) != null) {
            c1290900jhI.setIgnoreAttachStatus(z);
        }
    }

    @InterfaceC1312540kGC(name = "json")
    public final void setJson(String str) {
        if (str != null && str.length() != 0) {
            this.LLJI = str;
            ((C1291330jhz) this.mView).setImageAssetDelegate(this);
            C1290280jgI c1290280jgI = new C1290280jgI(this, str);
            this.LLJLILLLLZIIL = c1290280jgI;
            C1290610jgp.LJI(str, this, c1290280jgI);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "keeplastframe")
    public final void setKeepLastFrame(boolean z) {
        this.LL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "loop")
    public final void setLoop(boolean z) {
        if (z) {
            ((C1291330jhz) this.mView).setRepeatCount(-1);
        } else {
            ((C1291330jhz) this.mView).setRepeatCount(0);
        }
    }

    @InterfaceC1312540kGC(defaultInt = 1, name = "loop-count")
    public final void setLoopCount(int i) {
        if (i <= 0) {
            ((C1291330jhz) this.mView).setRepeatCount(-1);
        } else {
            ((C1291330jhz) this.mView).setRepeatCount(i - 1);
        }
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectFit(String str) {
        ImageView.ScaleType scaleType;
        if (Intrinsics.LJFF(str, "cover")) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (Intrinsics.LJFF(str, "contain")) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER;
        }
        ((ImageView) this.mView).setScaleType(scaleType);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "only-local")
    public final void setOnlyLocal(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @InterfaceC1312540kGC(name = "playstatus")
    public final void setPlayStatus(String str) {
        if (Intrinsics.LJFF("play", str)) {
            LJJIJLIJ();
            this.LLIZLLLIL = true;
            this.LLILLL = false;
        } else {
            if (!Intrinsics.LJFF("pause", str)) {
                return;
            }
            ((C1291330jhz) this.mView).cancelAnimation();
            this.LLILLL = true;
        }
    }

    @InterfaceC1312540kGC(name = "progress")
    public final void setProgress(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            ((C1291330jhz) this.mView).setProgress(f);
        }
    }

    @InterfaceC1312540kGC(name = "auto-reverse")
    public final void setReverseMode(boolean z) {
        if (z) {
            ((C1291330jhz) this.mView).setRepeatMode(2);
        } else {
            ((C1291330jhz) this.mView).setRepeatMode(1);
        }
    }

    @InterfaceC1312540kGC(name = "speed")
    public final void setSpeed(float f) {
        boolean z;
        ((C1291330jhz) this.mView).setSpeed(f);
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load lottie: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TraceEvent.LIZLLL(strLIZIZ);
        if (str != null && !a0.LJJJIL(str)) {
            LJJIIZI();
            ((C1291330jhz) this.mView).setImageDrawable(null);
            synchronized (this) {
                try {
                    Iterator<C1323050kX9<?>> it2 = this.LLJJJJJIL.iterator();
                    while (it2.hasNext()) {
                        C1323050kX9.LJII(it2.next());
                    }
                    this.LLJJJJJIL.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ((C1291330jhz) this.mView).setMinFrame(this.LLJJJJLIIL);
            ((C1291330jhz) this.mView).setMaxFrame(this.LLJJL);
            new C1290490jgd(new ACallableS68S1100000_20(this, str, 3));
            TraceEvent.LJII(strLIZIZ);
            return;
        }
        TraceEvent.LJII(strLIZIZ);
    }

    @InterfaceC1312540kGC(name = "src-format")
    public final void setSrcFormat(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            LJJIIZI();
            new C1290490jgd(new ACallableS68S1100000_20(this, str, 3));
        }
    }

    @InterfaceC1312540kGC(name = "src-polyfill")
    public final void setSrcPolyfill(ReadableMap readableMap) {
        this.LLJJI = readableMap;
        C1291600jiQ c1291600jiQ = this.LLJJJ;
        if (c1291600jiQ != null && readableMap != null) {
            new C1290490jgd(new ACallableS92S0400000_20(readableMap, new C1290880jhG(this), c1291600jiQ, this, 0));
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "start-frame")
    public final void setStartFrame(int i) {
        this.LLJJJJLIIL = i;
        ((C1291330jhz) this.mView).setMinFrame(i);
    }

    public LynxBytedLottieView(s sVar, int i) {
        super(sVar);
        this.LL = true;
        this.LLILLJJLI = true;
        this.LLILZLL = -1;
        this.LLJILJILJ = true;
        this.LLJILLL = true;
        this.LLJJ = "";
        this.LLJJIJI = new ArrayList();
        this.LLJJIJIIJIL = new HashSet<>();
        this.LLJJIJIL = new C1290940jhM("");
        this.LLJJJIL = new C1290910jhJ();
        this.LLJJJJ = "";
        this.LLJJJJJIL = new ArrayList<>();
        this.LLJJL = Integer.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    @Override // X.InterfaceC1290690jgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C1290800jh8 r6, final X.C1290650jgt r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.LJIJI(X.0jh8, X.0jgt):void");
    }

    public final Map<String, Object> LJJIJIIJI(int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        return linkedHashMap;
    }

    public final void LJJJIL(String str, Map<String, Object> map) {
        C1298720jtu c1298720jtu;
        Set<String> set = this.LLILZ;
        if (set != null && set.contains(str)) {
            if (C1289620jfE.LIZIZ()) {
                s sVar = this.mContext;
                if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                    c1298720jtu.LIZIZ(new C1289440jew(str, map, getSign()));
                    return;
                }
                return;
            }
            C1289620jfE.LIZJ(new ARunnableS24S1200000_20(map, str, this, 11));
        }
    }

    @InterfaceC1967107nB
    public final void getCurrentFrame(ReadableMap readableMap, Callback callback) {
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(this.LLILZIL));
        }
    }

    @InterfaceC1967107nB
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            javaOnlyMap.putInt("data", (int) ((C1291330jhz) t).getDuration());
            callback.invoke(0, javaOnlyMap);
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @InterfaceC1967107nB
    public final void isAnimating(ReadableMap readableMap, Callback callback) {
        boolean z;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = ((C1291330jhz) t).LLILLL.LLILLL;
            if (choreographerFrameCallbackC1291420ji8 == null) {
                z = false;
            } else {
                z = choreographerFrameCallbackC1291420ji8.LLJIJIL;
            }
            javaOnlyMap.putBoolean("data", z);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void listenAnimationUpdate(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0) {
            javaOnlyMap.putBoolean("data", true);
            this.LLJILJILJ = readableMap.getBoolean("isListen");
            callback.invoke(0, javaOnlyMap);
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            try {
                ((C1291330jhz) t).pauseAnimation();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap, Callback callback) {
        this.LLJJ = UUID.randomUUID().toString();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0) {
            try {
                LJJIJLIJ();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void resume(ReadableMap readableMap, Callback callback) {
        this.LLJJ = UUID.randomUUID().toString();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            try {
                C1291330jhz c1291330jhz = (C1291330jhz) t;
                c1291330jhz.LLILLL.LJ();
                c1291330jhz.LIZJ();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
        if (this.mView == 0) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        C1291430ji9 c1291430ji9;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        T t = this.mView;
        if (t != 0) {
            C1291330jhz c1291330jhz = (C1291330jhz) t;
            if (c1291330jhz != null) {
                c1291330jhz.cancelAnimation();
                Drawable drawable = c1291330jhz.getDrawable();
                if ((drawable instanceof C1291430ji9) && (c1291430ji9 = (C1291430ji9) drawable) != null) {
                    c1291430ji9.stop();
                }
            }
            ((C1291330jhz) this.mView).setFrame(readableMap.getInt("frame"));
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void stop(ReadableMap readableMap, Callback callback) {
        C1291430ji9 c1291430ji9;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0) {
            try {
                C1291330jhz c1291330jhz = (C1291330jhz) this.mView;
                if (c1291330jhz != null) {
                    c1291330jhz.cancelAnimation();
                    Drawable drawable = c1291330jhz.getDrawable();
                    if ((drawable instanceof C1291430ji9) && (c1291430ji9 = (C1291430ji9) drawable) != null) {
                        c1291430ji9.stop();
                    }
                }
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        int i = readableMap.getInt("frame");
        if (!((ArrayList) this.LLJJIJI).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LLJJIJI).add(Integer.valueOf(i));
            ArrayList arrayList = (ArrayList) this.LLJJIJI;
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS39S0000000_20(3));
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("already subscribeUpdateEvent with ");
        sbLIZ.append(i);
        sbLIZ.append(" frame");
        callback.invoke(1, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1967107nB
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        int i = readableMap.getInt("frame");
        if (((ArrayList) this.LLJJIJI).contains(Integer.valueOf(i))) {
            ((ArrayList) this.LLJJIJI).remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" frame is not subscribed");
        callback.invoke(1, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIJIIJIL(int i, String str, String str2) throws JSONException {
        LJJJIL("error", LJJIJIIJI(i, str));
        this.LLJJIJIL.LIZIZ(this.LLJI, str2, str);
        LynxLog.e("byted-lottie", str);
    }

    public final Map<String, Object> LJJIJ(int i, int i2, int i3, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("current", Integer.valueOf(i));
        linkedHashMap.put("total", Integer.valueOf(i2));
        linkedHashMap.put("loopIndex", Integer.valueOf(i3));
        linkedHashMap.put("animationID", str);
        return linkedHashMap;
    }

    public final void LJJJ(String str, final String str2, final C1290800jh8 c1290800jh8, final InterfaceC1290780jh6 interfaceC1290780jh6) {
        final String strLIZ = C1294030jmL.LIZ(this.mContext, str, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestBitmap: ");
        sbLIZ.append(strLIZ);
        LynxLog.i("byted-lottie", C2188811AlT.LIZIZ(sbLIZ));
        Uri uri = UriProtector.parse(strLIZ);
        if (uri != null && uri.getPath() != null) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
            C1315790kLR.LIZ(c1325700kbQLIZLLL);
            final String path = uri.getPath();
            if (path != null && !c1290800jh8.LJFF) {
                c1325700kbQLIZLLL.LJIILIIL = new AbstractC1291220jho() { // from class: X.0jhN
                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x005c
                        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                        */
                    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                    public final X.C1323050kX9<android.graphics.Bitmap> process(android.graphics.Bitmap r6, X.AbstractC1301670jyf r7) {
                        /*
                            r5 = this;
                            java.lang.String r1 = "byted-lottie"
                            java.lang.String r0 = "some memory is wasted, recreate the bitmap with 565"
                            com.lynx.base.log.LynxLog.i(r1, r0)
                            r3 = 0
                            int r2 = r6.getWidth()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L5c
                            int r1 = r6.getHeight()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L5c
                            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L5c
                            X.0kX9 r4 = r7.LJFF(r2, r1, r0)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L5c
                            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L56
                            java.lang.Object r0 = r4.get()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L56
                            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L56
                            r1.<init>(r0)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L56
                            r0 = 0
                            r1.drawBitmap(r6, r0, r0, r3)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L56
                            X.0kX9 r0 = X.C1323050kX9.LJFF(r4)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L56
                            X.C1323050kX9.LJII(r4)
                            return r0
                        L2d:
                            r0 = move-exception
                            goto L31
                        L2f:
                            r0 = move-exception
                            r4 = r3
                        L31:
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L56
                            com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView r3 = r5.LIZ     // Catch: java.lang.Throwable -> L56
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L56
                            java.lang.String r0 = "error happened when change bitmap from ARG_8888 to RGB_565, imagePath is "
                            r1.append(r0)     // Catch: java.lang.Throwable -> L56
                            java.lang.String r0 = r2     // Catch: java.lang.Throwable -> L56
                            r1.append(r0)     // Catch: java.lang.Throwable -> L56
                            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L56
                            java.lang.String r1 = r2     // Catch: java.lang.Throwable -> L56
                            r0 = 3
                            r3.LJJIJIIJIL(r0, r2, r1)     // Catch: java.lang.Throwable -> L56
                            X.C1323050kX9.LJII(r4)
                            X.0kX9 r0 = super.process(r6, r7)
                            return r0
                        L56:
                            r0 = move-exception
                            r3 = r4
                        L58:
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5c
                            goto L5e
                        L5c:
                            r0 = move-exception
                            goto L58
                        L5e:
                            X.C1323050kX9.LJII(r3)
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1290950jhN.process(android.graphics.Bitmap, X.0jyf):X.0kX9");
                    }
                };
            }
            final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), "byted-lottie");
            ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC1290140jg4() { // from class: X.0jh5
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    String message;
                    Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestBitmap failed! url: ");
                    sbLIZ2.append(strLIZ);
                    sbLIZ2.append(" Reason: ");
                    String message2 = null;
                    if (thLIZLLL != null) {
                        message = thLIZLLL.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ2.append(message);
                    LynxLog.i("byted-lottie", C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC1290780jh6 interfaceC1290780jh62 = interfaceC1290780jh6;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(" error msg is ");
                    if (thLIZLLL != null) {
                        message2 = thLIZLLL.getMessage();
                    }
                    sbLIZ3.append(message2);
                    sbLIZ3.append('}');
                    interfaceC1290780jh62.onFailed(C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC1320200kSY.close();
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[Catch: Exception -> 0x0058, all -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x0058, blocks: (B:14:0x003e, B:16:0x0046, B:18:0x004d), top: B:31:0x003e, outer: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #1 {all -> 0x007e, blocks: (B:6:0x0024, B:8:0x0028, B:11:0x002f, B:13:0x0039, B:14:0x003e, B:16:0x0046, B:21:0x0074, B:18:0x004d, B:20:0x0059, B:23:0x0078), top: B:33:0x0024, inners: #0 }] */
                @Override // X.AbstractC1290140jg4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJI(X.C1323050kX9<android.graphics.Bitmap> r8) {
                    /*
                        r7 = this;
                        java.lang.String r2 = "byted-lottie"
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "requestBitmap success. url: "
                        r1.append(r0)
                        java.lang.String r0 = r1
                        r1.append(r0)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        com.lynx.base.log.LynxLog.i(r2, r0)
                        if (r8 == 0) goto L85
                        com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView r4 = r4
                        X.0jh6 r5 = r2
                        X.0jh8 r3 = r5
                        java.lang.String r2 = r1
                        java.lang.String r6 = r6
                        monitor-enter(r4)
                        boolean r0 = r4.LLJLIL     // Catch: java.lang.Throwable -> L7e
                        if (r0 == 0) goto L2f
                        java.lang.String r0 = "the lottie-view is destroyed already."
                        r5.onFailed(r0)     // Catch: java.lang.Throwable -> L7e
                        monitor-exit(r4)
                        return
                    L2f:
                        int r1 = r3.LIZ     // Catch: java.lang.Throwable -> L7e
                        int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L7e
                        X.0kX9 r1 = r4.LJJJI(r8, r1, r0, r2)     // Catch: java.lang.Throwable -> L7e
                        if (r1 == 0) goto L78
                        java.util.ArrayList<X.0kX9<?>> r0 = r4.LLJJJJJIL     // Catch: java.lang.Throwable -> L7e
                        r0.add(r1)     // Catch: java.lang.Throwable -> L7e
                        java.lang.Object r0 = r1.get()     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7e
                        android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7e
                        if (r0 == 0) goto L4d
                        r5.LIZ(r0, r6)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7e
                        kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7e
                        if (r0 != 0) goto L74
                    L4d:
                        java.lang.String r1 = "byted-lottie"
                        java.lang.String r0 = "requestBitmapSync, onNewResultImpl"
                        com.lynx.base.log.LynxLog.e(r1, r0)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7e
                        r5.onFailed(r6)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7e
                        goto L74
                    L58:
                        r3 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L7e
                        java.lang.String r2 = "byted-lottie"
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7e
                        java.lang.String r0 = "requestBitmapSync, onNewResultImpl, error is "
                        r1.append(r0)     // Catch: java.lang.Throwable -> L7e
                        r1.append(r3)     // Catch: java.lang.Throwable -> L7e
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7e
                        com.lynx.base.log.LynxLog.e(r2, r0)     // Catch: java.lang.Throwable -> L7e
                        r5.onFailed(r6)     // Catch: java.lang.Throwable -> L7e
                    L74:
                        kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7e
                        if (r0 != 0) goto L84
                    L78:
                        java.lang.String r0 = "failed when scaleBitmap"
                        r5.onFailed(r0)     // Catch: java.lang.Throwable -> L7e
                        goto L84
                    L7e:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7e
                        monitor-exit(r4)
                        throw r0
                    L84:
                        monitor-exit(r4)
                    L85:
                        X.0kSY<X.0kX9<X.0kej>> r0 = r3
                        r0.close()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1290770jh5.LJI(X.0kX9):void");
                }
            }, C822700WPc.LL);
            return;
        }
        this.LLJILLL = false;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("uri.path is null and uri is ");
        sbLIZ2.append(uri);
        interfaceC1290780jh6.onFailed(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final C1323050kX9<Bitmap> LJJJI(C1323050kX9<Bitmap> c1323050kX9, int i, int i2, String str) throws JSONException {
        Bitmap bitmap = c1323050kX9.get();
        try {
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                return c1323050kX9.LIZLLL();
            }
            return C1323050kX9.LJJIZ(Bitmap.createScaledBitmap(bitmap, i, i2, this.LLJL), C530820Kro.LIZIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scale image failed, and detail is ");
            sbLIZ.append(e);
            LJJIJIIJIL(2, C2188811AlT.LIZIZ(sbLIZ), str);
            return null;
        }
    }
}
