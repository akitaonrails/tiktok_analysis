package com.ss.android.ugc.aweme.base.xelements.xvideo;

import X.C1058540deW;
import X.C1289960jfm;
import X.C1298530jtb;
import X.C1298720jtu;
import X.C1311730kEt;
import X.C1313270kHN;
import X.C1313900kIO;
import X.C1479570obb;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C1486030om1;
import X.C1AM8;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.EnumC1046760dLW;
import X.EnumC1486640on0;
import X.InterfaceC1312540kGC;
import X.InterfaceC1473950oSX;
import X.InterfaceC1483820oiS;
import X.InterfaceC1483850oiV;
import X.InterfaceC1484830ok5;
import X.InterfaceC1967107nB;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.videoshop.context.VideoContext;
import j27.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxUgVideoUI extends UISimpleView<C1AM8> implements InterfaceC1483820oiS, GenericLifecycleObserver {
    public EnumC1486640on0 LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onHostResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onHostPause(lifecycleOwner);
        }
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @InterfaceC1312540kGC(name = "cache-size")
    public final void setCacheSize(int i) {
    }

    @InterfaceC1312540kGC(name = "rate")
    public final void setRate(double d) {
    }

    @InterfaceC1312540kGC(name = "volume")
    public final void setVolume(float f) {
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return (FrameLayout) this.mView;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.destroy();
        this.LL = EnumC1486640on0.DESTROY;
        C1AM8 c1am8 = (C1AM8) this.mView;
        InterfaceC1484830ok5 interfaceC1484830ok5 = c1am8.LLILLJJLI;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.release();
        }
        try {
            VideoContext videoContextLJJJJLL = VideoContext.LJJJJLL(c1am8.getContext());
            if (videoContextLJJJJLL != null) {
                videoContextLJJJJLL.LJJLIIIJL(null);
            }
            VideoContext videoContextLJJJJLL2 = VideoContext.LJJJJLL(c1am8.getContext());
            if (videoContextLJJJJLL2 != null) {
                videoContextLJJJJLL2.LJJLIIIJLLLLLLLZ(null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fail to set VideoContext's objects to null ");
            sbLIZ.append(e);
            LynxLog.e("LynxVideoView", C2188811AlT.LIZIZ(sbLIZ));
        }
        s sVar = this.mContext;
        sVar.getClass();
        ComponentCallbacks2 componentCallbacks2LIZ = C1298530jtb.LIZ(sVar);
        if (!(componentCallbacks2LIZ instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.initialize();
        this.LL = EnumC1486640on0.INIT;
        s sVar = this.mContext;
        sVar.getClass();
        ComponentCallbacks2 componentCallbacks2LIZ = C1298530jtb.LIZ(sVar);
        if (!(componentCallbacks2LIZ instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    public LynxUgVideoUI(s sVar) {
        super(sVar);
        this.LL = EnumC1486640on0.INIT;
        this.LLILLJJLI = "";
        this.LLIZLLLIL = "contain";
        this.LLJ = "";
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJIL = true;
        this.LLJILJILJ = "";
    }

    public final void LJJIIZI(Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.mView.getClass();
        ((C1AM8) this.mView).LIZJ();
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    public final void LJJIJ(Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.mView.getClass();
        javaOnlyMap.putString("msg", "not in fullscreen");
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    public final void LJJIJIIJI(Callback callback) {
        this.LL = ((C1AM8) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486030om1.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error state: ");
                    sbLIZ.append(this.LL);
                    javaOnlyMap.putString("error", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("invoke pause in wrong state: ");
                    sbLIZ2.append(this.LL);
                    LynxLog.e("LynxUgVideoUI", C2188811AlT.LIZIZ(sbLIZ2));
                    if (callback != null) {
                        callback.invoke(1, javaOnlyMap);
                        return;
                    }
                    return;
                }
                InterfaceC1484830ok5 interfaceC1484830ok5 = ((C1AM8) this.mView).LLILLJJLI;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.pause();
                }
                if (callback == null) {
                    return;
                }
                callback.invoke(0, javaOnlyMap);
                return;
            }
            javaOnlyMap.putString("msg", "already pause");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("msg", "just ready");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJIJIIJIL(Callback callback) {
        InterfaceC1483850oiV playState;
        if (this.LL != EnumC1486640on0.READY) {
            this.LL = ((C1AM8) this.mView).LIZ();
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486030om1.LIZ[this.LL.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error state: ");
                sbLIZ.append(this.LL);
                javaOnlyMap.putString("error", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("invoke play in wrong state: ");
                sbLIZ2.append(this.LL);
                LynxLog.e("LynxUgVideoUI", C2188811AlT.LIZIZ(sbLIZ2));
                if (callback != null) {
                    callback.invoke(1, javaOnlyMap);
                    return;
                }
                return;
            }
            javaOnlyMap.putString("msg", "already play");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        C1AM8 c1am8 = (C1AM8) this.mView;
        c1am8.LIZJ();
        InterfaceC1484830ok5 interfaceC1484830ok5 = c1am8.LLILLJJLI;
        if (interfaceC1484830ok5 != null && (playState = interfaceC1484830ok5.getPlayState()) != null && playState.isPaused()) {
            InterfaceC1484830ok5 interfaceC1484830ok52 = c1am8.LLILLJJLI;
            if (interfaceC1484830ok52 != null) {
                interfaceC1484830ok52.resume();
            }
        } else {
            InterfaceC1484830ok5 interfaceC1484830ok53 = c1am8.LLILLJJLI;
            if (interfaceC1484830ok53 != null) {
                interfaceC1484830ok53.LJ(c1am8.LLILZLL);
            }
        }
        this.LLJJ = false;
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        ReadableMap readableMap;
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator;
        String str;
        List listLJJLIIIJILLIZJL;
        JSONObject jSONObject;
        boolean z;
        String str2;
        super.afterPropsUpdated(c1311730kEt);
        long jLongValue = 0;
        if (this.LLJILLL) {
            this.LLJJ = false;
            this.LL = EnumC1486640on0.CREATE;
            C1482580ogS c1482580ogS = new C1482580ogS();
            String str3 = "";
            if (u.LJJIIJZLJL(this.LLILLJJLI, "https://", false) || u.LJJIIJZLJL(this.LLILLJJLI, "http://", false)) {
                str2 = "";
                str3 = this.LLILLJJLI;
            } else if (u.LJJIIJZLJL(this.LLILLJJLI, "video://", false)) {
                Uri uri = UriProtector.parse(this.LLILLJJLI);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "play_url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "video_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                str2 = str3;
                str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("illegal source: ");
                sbLIZ.append(this);
                sbLIZ.append(".src");
                sendEvent("error", C2097608Jq.LJI(new Pair("errorCode", 1), new Pair("errorMsg", C2188811AlT.LIZIZ(sbLIZ)), new Pair("url", this.LLILLJJLI)));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("illegal source: ");
                sbLIZ2.append(this);
                sbLIZ2.append(".src");
                LynxLog.e("LynxUgVideoUI", C2188811AlT.LIZIZ(sbLIZ2));
                str2 = "";
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("parse url: ");
            sbLIZ3.append(str3);
            sbLIZ3.append(", vid: ");
            sbLIZ3.append(str2);
            LynxLog.d("LynxUgVideoUI", C2188811AlT.LIZIZ(sbLIZ3));
            this.LL = EnumC1486640on0.READY;
            sendEvent("ready", new HashMap());
            c1482580ogS.LIZ = String.valueOf(System.currentTimeMillis());
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            if (str3.length() > 0 && this.LLJILJIL) {
                c1058540deW.LIZIZ(str3);
                c1058540deW.LIZIZ = this.LLJILJILJ;
            } else if (str3.length() > 0) {
                c1058540deW.LIZIZ(str3);
            }
            C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
            String str4 = this.LLJI;
            C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
            c1479570obb.LJIILL = str4;
            c1479570obb.LJIIIZ = this.LLILZLL;
            c1479570obb.LJJ = this.LLILLL;
            c1479570obb.LIZIZ = this.LLILZIL;
            Long duration = ((C1AM8) this.mView).getDuration();
            if (duration != null) {
                jLongValue = duration.longValue();
            }
            c1482570ogRLIZ.LIZJ = jLongValue;
            c1482570ogRLIZ.LIZIZ.LJIJJ = false;
            c1482570ogRLIZ.LIZ(EnumC1046760dLW.VIDEO);
            C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
            c1482580ogS2.LJ = c1482570ogRLIZ;
            ((C1AM8) this.mView).setPlayEntity(new C1484680ojq(c1482580ogS2).LIZ());
            ((C1AM8) this.mView).LJFF(this.LLJIJIL, this.LLIZLLLIL);
            if (this.LLILZ) {
                LJJIJIIJIL(null);
            }
            this.LLJILLL = false;
            return;
        }
        if (c1311730kEt == null || (readableMap = c1311730kEt.LIZ) == null || (readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator()) == null) {
            return;
        }
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (Intrinsics.LJFF(strNextKey, "muted")) {
                ((C1AM8) this.mView).setMuted(this.LLILLL);
            } else if (Intrinsics.LJFF(strNextKey, "__control") && (str = this.LLJ) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6)) != null) {
                String str5 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                switch (str5.hashCode()) {
                    case -1879513255:
                        if (str5.equals("exitfullscreen")) {
                            LJJIJ(null);
                        }
                        break;
                    case -619198582:
                        if (str5.equals("requestfullscreen")) {
                            LJJIIZI(null);
                        }
                        break;
                    case 3443508:
                        if (str5.equals("play")) {
                            LJJIJIIJIL(null);
                        }
                        break;
                    case 3526264:
                        if (str5.equals("seek")) {
                            try {
                                jSONObject = new JSONObject((String) listLJJLIIIJILLIZJL.get(1));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                jSONObject = new JSONObject();
                            }
                            long jOptLong = jSONObject.optLong("position", 0L);
                            if (jSONObject.optInt("play") == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            LJJIJIL(jOptLong, z, null);
                            break;
                        }
                        break;
                    case 106440182:
                        if (str5.equals("pause")) {
                            this.LLJJ = true;
                            LJJIJIIJI(null);
                        }
                        break;
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C1AM8(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i) {
        C1313900kIO c1313900kIOLJIIL;
        boolean z;
        super.onBorderRadiusUpdated(i);
        C259800zU c259800zU = new C259800zU();
        C1313270kHN c1313270kHN = this.mLynxBackground;
        if (c1313270kHN != null && (c1313900kIOLJIIL = c1313270kHN.LJIIL()) != null) {
            int paddingLeft = this.mView.getPaddingLeft();
            int paddingRight = this.mView.getPaddingRight();
            int paddingTop = this.mView.getPaddingTop();
            int paddingBottom = this.mView.getPaddingBottom();
            c1313900kIOLJIIL.LIZLLL(this.mView.getWidth() + paddingLeft + paddingRight, this.mView.getHeight() + paddingTop + paddingBottom);
            float[] fArrLIZ = c1313900kIOLJIIL.LIZ();
            T t = 0;
            t = 0;
            if (fArrLIZ != null) {
                int i2 = 0;
                if (fArrLIZ.length == 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    float f = paddingLeft;
                    float f2 = paddingTop;
                    float f3 = paddingRight;
                    float f4 = paddingBottom;
                    float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                    do {
                        fArrLIZ[i2] = Math.max(0.0f, fArrLIZ[i2] - fArr[i2]);
                        i2++;
                    } while (i2 < 8);
                    t = fArrLIZ;
                }
            }
            c259800zU.element = t;
        }
        ((C1AM8) this.mView).setBorderRadius((float[]) c259800zU.element);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onHostPause(LifecycleOwner lifecycleOwner) {
        if (this.LLIZ) {
            LJJIJIIJI(null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onHostResume(LifecycleOwner lifecycleOwner) {
        if (this.LLIZ && !this.LLJJ) {
            LJJIJIIJIL(null);
        }
    }

    @InterfaceC1312540kGC(name = "autolifecycle")
    public final void setAutoLifeCycle(boolean z) {
        this.LLIZ = z;
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LLILZ = z;
    }

    @InterfaceC1312540kGC(name = "cache")
    public final void setCache(boolean z) {
        this.LLJILJIL = z;
    }

    @InterfaceC1312540kGC(name = "__control")
    public final void setControl(String str) {
        this.LLJ = str;
    }

    @InterfaceC1312540kGC(name = "inittime")
    public final void setInitTime(int i) {
        this.LLILZLL = i;
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void setLoop(boolean z) {
        this.LLILZIL = z;
    }

    @InterfaceC1312540kGC(name = "muted")
    public final void setMuted(boolean z) {
        this.LLILLL = z;
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectFit(String str) {
        this.LLIZLLLIL = str;
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(String str) {
        this.LLJIJIL = str;
    }

    @InterfaceC1312540kGC(name = "preload-key")
    public final void setPreloadKey(String str) {
        this.LLJILJILJ = str;
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        if (str != null) {
            this.LLJILLL = true ^ Intrinsics.LJFF(this.LLILLJJLI, str);
            this.LLILLJJLI = str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set Src: ");
            sbLIZ.append(str);
            LynxLog.i("LynxUgVideoUI", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LynxLog.e("LynxUgVideoUI", "src is null");
        sendEvent("error", C2097608Jq.LJI(new Pair("src is null", "msg")));
    }

    @InterfaceC1312540kGC(name = "video-tag")
    public final void setVideoTag(String str) {
        this.LLJI = str;
    }

    @InterfaceC1967107nB
    public final void exitFullScreen(ReadableMap readableMap, Callback callback) {
        LJJIJ(callback);
    }

    @InterfaceC1967107nB
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, ((C1AM8) this.mView).getDuration());
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap, Callback callback) {
        this.LLJJ = true;
        LJJIJIIJI(callback);
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap, Callback callback) {
        LJJIJIIJIL(callback);
    }

    @InterfaceC1967107nB
    public final void requestFullScreen(ReadableMap readableMap, Callback callback) {
        LJJIIZI(callback);
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        LJJIJIL(readableMap.getLong("position"), readableMap.getBoolean("play"), callback);
    }

    public final void sendEvent(String str, Map<String, ? extends Object> map) {
        C1298720jtu c1298720jtu;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), str);
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                c1289960jfm.LIZIZ(entry.getValue(), entry.getKey());
            }
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @InterfaceC1967107nB
    public final void stop(ReadableMap readableMap, Callback callback) {
        this.LL = ((C1AM8) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486030om1.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error state: ");
                    sbLIZ.append(this.LL);
                    javaOnlyMap.putString("msg", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("invoke stop in wrong state: ");
                    sbLIZ2.append(this.LL);
                    LynxLog.e("LynxUgVideoUI", C2188811AlT.LIZIZ(sbLIZ2));
                    if (callback != null) {
                        callback.invoke(1, javaOnlyMap);
                        return;
                    }
                    return;
                }
                C1AM8 c1am8 = (C1AM8) this.mView;
                InterfaceC1484830ok5 interfaceC1484830ok5 = c1am8.LLILLJJLI;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.pause();
                }
                InterfaceC1484830ok5 interfaceC1484830ok52 = c1am8.LLILLJJLI;
                if (interfaceC1484830ok52 != null) {
                    interfaceC1484830ok52.seek(0.0f);
                }
                if (callback == null) {
                    return;
                }
                callback.invoke(0, javaOnlyMap);
                return;
            }
            ((C1AM8) this.mView).LJ(0L, false);
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("msg", "just ready");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJIJIL(long j, boolean z, Callback callback) {
        this.LL = ((C1AM8) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486030om1.LIZ[this.LL.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error state: ");
            sbLIZ.append(this.LL);
            javaOnlyMap.putString("msg", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invoke seek in wrong state: ");
            sbLIZ2.append(this.LL);
            LynxLog.e("LynxUgVideoUI", C2188811AlT.LIZIZ(sbLIZ2));
            if (callback != null) {
                callback.invoke(1, javaOnlyMap);
                return;
            }
            return;
        }
        ((C1AM8) this.mView).LJ(j, z);
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }
}
