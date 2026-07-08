package com.lynx.animax;

import X.C08DZ;
import X.C1285920jZG;
import X.C1289090jeN;
import X.C1289210jeZ;
import X.C1289890jff;
import X.C1292490jjr;
import X.C1299120juY;
import X.C2188811AlT;
import X.EnumC1288660jdg;
import X.EnumC1289070jeL;
import X.EnumC1289080jeM;
import X.InterfaceC1288690jdj;
import X.InterfaceC1289150jeT;
import X.InterfaceC1289180jeW;
import X.InterfaceC1310460kCq;
import X.InterfaceC1312540kGC;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.animax.AnimaXPlayer;
import com.lynx.animax.UIAnimaX;
import com.lynx.animax.util.AnimaXLog;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.lynx.tasm.service.ILynxTrailService;
import j27.s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class UIAnimaX extends LynxUI<View> implements InterfaceC1310460kCq {
    public static final EnumC1289080jeM LLJJI = EnumC1289080jeM.LOW;
    public static final EnumC1289080jeM LLJJIII = EnumC1289080jeM.HIGH;
    public final s LL;
    public C1289210jeZ LLILLJJLI;
    public InterfaceC1288690jdj LLILLL;
    public AnimaXPlayer LLILZ;
    public final C1289890jff LLILZIL;
    public final C1289090jeN LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public EnumC1289070jeL LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;

    public UIAnimaX() {
        throw null;
    }

    @Override // X.InterfaceC1310460kCq
    public final void LJIIIIZZ() {
        AnimaXPlayer animaXPlayer;
        if (this.LLJILJIL || (animaXPlayer = this.LLILZ) == null) {
            return;
        }
        animaXPlayer.getClass();
        animaXPlayer.LJIIZILJ(true, EnumC1288660jdg.BACKGROUND);
    }

    @Override // X.InterfaceC1310460kCq
    public final void LJIILLIIL() {
        AnimaXPlayer animaXPlayer;
        if (this.LLJILJIL || (animaXPlayer = this.LLILZ) == null) {
            return;
        }
        animaXPlayer.getClass();
        animaXPlayer.LJIIZILJ(false, EnumC1288660jdg.BACKGROUND);
    }

    public final void LJJIJIIJI() {
        HandlerHook.viewPost(this.mView, new ARunnableS120S0100000_20(this, 233));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final long getMemoryUsageBytes() {
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (animaXPlayer == null) {
            return 0L;
        }
        return animaXPlayer.LJIIJJI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        AnimaXLog.LIZIZ("UIAnimaX", "UIAnimaX destroy");
        InterfaceC1288690jdj interfaceC1288690jdj = this.LLILLL;
        if (interfaceC1288690jdj != null) {
            interfaceC1288690jdj.release();
        } else {
            AnimaXPlayer animaXPlayer = this.LLILZ;
            if (animaXPlayer != null) {
                animaXPlayer.LJIIL();
            }
        }
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        C1289890jff c1289890jff = this.LLILZIL;
        if (c1289890jff == null || this.LLILLL == null) {
            return;
        }
        c1289890jff.setPadding(this.mBorderLeftWidth + this.mPaddingLeft, this.mBorderTopWidth + this.mPaddingTop, this.mBorderRightWidth + this.mPaddingRight, this.mBorderBottomWidth + this.mPaddingBottom);
        this.LLILLL.requestLayout();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReload() {
        super.onNodeReload();
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (animaXPlayer != null) {
            animaXPlayer.LJIILIIL();
        }
    }

    public UIAnimaX(s sVar) {
        super(sVar, null);
        this.LLILZLL = new C1289090jeN();
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = EnumC1289070jeL.SURFACE;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJJ = false;
        this.LL = sVar;
        if (!(this.mView instanceof C1289890jff)) {
            LJJIJIIJI();
        }
        this.LLILZIL = (C1289890jff) this.mView;
    }

    public static int[] LJJIIZI(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        if (array == null) {
            return null;
        }
        int[] iArr = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public static void LJJIJ(Callback callback) {
        if (callback != null) {
            callback.invoke(1, "animax view is not inited.");
        }
    }

    public final void LJJIJIIJIL(final String str) {
        s sVar;
        ILynxTrailService iLynxTrailService;
        if (str != null && !str.isEmpty() && (sVar = this.LL) != null && sVar.LIZLLL() && !this.LLJJ && (iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class)) != null && "true".equals(iLynxTrailService.stringValueForTrailKey("enable_motion_ui_report"))) {
            this.LLJJ = true;
            LynxEventReporter.onEvent("lynxsdk_motion_ui_event", this.LL.LLJLILLLLZIIL, new InterfaceC1289180jeW() { // from class: X.0jeS
                @Override // X.InterfaceC1289180jeW
                public final Map build() {
                    String str2 = str;
                    HashMap map = new HashMap();
                    map.put("component_name", "animax-view");
                    map.put("src", str2);
                    return map;
                }
            });
        }
    }

    public final void LJJIJIL(String str) {
        if (this.LLJILLL == null && this.LL != null && this.mView != 0) {
            if (str == null) {
                str = "unknown";
            } else {
                this.LLJILLL = str;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("url: ");
            sbLIZ.append(C08DZ.LIZ(this.LL.LLJJIII));
            sbLIZ.append(", src: ");
            sbLIZ.append(str);
            this.mView.setTag(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (!(context instanceof s)) {
            LynxLog.e("UIAnimaX", "context is not LynxContext, create AnimaXView fail");
            return new View(context);
        }
        this.LLILLJJLI = new C1289210jeZ((s) context, this);
        return new C1289890jff(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean dispatchTouch(MotionEvent motionEvent) {
        if (this.LLJIJIL && this.LLILLL != null && isUserInteractionEnabled() && motionEvent.getAction() == 0) {
            RectF rectFLJ = C1292490jjr.LJ(this, new RectF(0.0f, 0.0f, getWidth(), getHeight()));
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            float rawX = motionEvent.getRawX() - rectFLJ.left;
            float rawY = motionEvent.getRawY() - rectFLJ.top;
            if (this.LLILZIL == null) {
                motionEventObtain.setLocation(rawX, rawY);
            } else {
                motionEventObtain.setLocation(rawX - r0.getPaddingLeft(), rawY - this.LLILZIL.getPaddingTop());
            }
            this.LLILLL.LJI(motionEventObtain);
        }
        return super.dispatchTouch(motionEvent);
    }

    @InterfaceC1312540kGC(name = "anti-aliasing")
    public void setAntiAliasing(final String str) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0je0
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.LLILZLL = !"none".equals(str);
            }
        });
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "autoplay")
    public void setAutoPlay(final boolean z) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdu
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setAutoPlay(z);
            }
        });
    }

    @InterfaceC1312540kGC(name = "display-mode")
    public void setDisplayMode(String str) {
        EnumC1289070jeL enumC1289070jeL = EnumC1289070jeL.SURFACE;
        if (str != null) {
            EnumC1289070jeL[] enumC1289070jeLArrValues = EnumC1289070jeL.values();
            int length = enumC1289070jeLArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC1289070jeL enumC1289070jeL2 = enumC1289070jeLArrValues[i];
                if (enumC1289070jeL2.LL.equals(str)) {
                    enumC1289070jeL = enumC1289070jeL2;
                    break;
                }
                i++;
            }
        }
        this.LLJ = enumC1289070jeL;
    }

    @InterfaceC1312540kGC(name = "dynamic-resource")
    public void setDynamicResource(final boolean z) {
        this.LLILZLL.LIZIZ(new InterfaceC1289150jeT() { // from class: X.0jds
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setDynamicResource(z);
            }
        }, LLJJIII);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-audio")
    public void setEnableAudio(final boolean z) {
        this.LLILZLL.LIZIZ(new InterfaceC1289150jeT() { // from class: X.0jdq
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setEnableAudio(z);
            }
        }, LLJJIII);
    }

    @InterfaceC1312540kGC(name = "android-enable-screenshot")
    public void setEnableScreenshot(boolean z) {
        this.LLJILJILJ = z;
    }

    @InterfaceC1312540kGC(defaultInt = -1, name = "end-frame")
    public void setEndFrame(final int i) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdw
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setEndFrame(i);
            }
        });
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        boolean z;
        super.setEvents(map);
        if (map != null && map.containsKey("taplayers")) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = z;
    }

    @InterfaceC1312540kGC(name = "fps-event-interval")
    public void setFpsEventInterval(final int i) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdx
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setFpsEventInterval(i);
            }
        });
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "ignore-attach-status")
    public void setIgnoreAttachStatus(boolean z) {
        InterfaceC1288690jdj interfaceC1288690jdj = this.LLILLL;
        if (interfaceC1288690jdj != null) {
            interfaceC1288690jdj.setIgnoreAttachStatus(z);
        } else {
            this.LLIZLLLIL = z;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "ignore-lynx-lifecycle")
    public void setIgnoreLynxLifecycle(boolean z) {
        this.LLJILJIL = z;
    }

    @InterfaceC1312540kGC(name = "json")
    public void setJson(final String str) {
        this.LLILZLL.LIZIZ(new InterfaceC1289150jeT() { // from class: X.0jeP
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                UIAnimaX uIAnimaX = this.LIZ;
                String str2 = str;
                uIAnimaX.getClass();
                animaXPlayer.setJson(str2);
                uIAnimaX.LJJIJIL("json");
                uIAnimaX.LJJIJIIJIL("json");
            }
        }, LLJJI);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "keeplastframe")
    public void setKeepLastFrame(final boolean z) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdp
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setKeepLastFrame(z);
            }
        });
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "loop")
    public void setLoop(final boolean z) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdr
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setLoop(z);
            }
        });
    }

    @InterfaceC1312540kGC(defaultInt = 1, name = "loop-count")
    public void setLoopCount(final int i) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdt
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setLoopCount(i);
            }
        });
    }

    @InterfaceC1312540kGC(name = "max-frame-rate")
    public void setMaxFrameRate(final double d) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdk
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setMaxFrameRate(d);
            }
        });
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "multi-thread-accelerate")
    public void setMultiThreadAccelerate(boolean z) {
        this.LLIZ = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "muted")
    public void setMuted(final boolean z) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdo
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setMuted(z);
            }
        });
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public void setObjectFit(final String str) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdi
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setObjectFit(C1311900kFA.LIZ(str));
            }
        });
    }

    @InterfaceC1312540kGC(name = "object-position")
    public void setObjectPosition(final String str) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jrg
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                String str2 = str;
                EnumC1297350jrh enumC1297350jrh = EnumC1297350jrh.CENTER;
                if ("left".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.LEFT;
                } else if ("right".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.RIGHT;
                } else if ("top".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.TOP;
                } else if ("bottom".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.BOTTOM;
                } else if ("top-left".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.TOP_LEFT;
                } else if ("top-right".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.TOP_RIGHT;
                } else if ("bottom-left".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.BOTTOM_LEFT;
                } else if ("bottom-right".equals(str2)) {
                    enumC1297350jrh = EnumC1297350jrh.BOTTOM_RIGHT;
                }
                animaXPlayer.setObjectPosition(enumC1297350jrh);
            }
        });
    }

    @InterfaceC1312540kGC(name = "progress")
    public void setProgress(final float f) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdm
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setProgress(f);
            }
        });
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "auto-reverse")
    public void setReverseMode(final boolean z) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdv
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setAutoReverse(z);
            }
        });
    }

    @InterfaceC1312540kGC(name = "speed")
    public void setSpeed(final float f) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdl
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setSpeed(f);
            }
        });
    }

    @InterfaceC1312540kGC(name = "src")
    public void setSrc(final String str) {
        this.LLILZLL.LIZIZ(new InterfaceC1289150jeT() { // from class: X.0jeR
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                UIAnimaX uIAnimaX = this.LIZ;
                String str2 = str;
                uIAnimaX.getClass();
                animaXPlayer.setSrc(str2);
                uIAnimaX.LJJIJIL(str2);
                uIAnimaX.LJJIJIIJIL(str2);
            }
        }, LLJJI);
    }

    @InterfaceC1312540kGC(name = "src-format")
    public void setSrcFormat(final String str) {
        this.LLILZLL.LIZIZ(new InterfaceC1289150jeT() { // from class: X.0jeQ
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                UIAnimaX uIAnimaX = this.LIZ;
                String str2 = str;
                uIAnimaX.getClass();
                animaXPlayer.setSrc(str2);
                uIAnimaX.LJJIJIL(str2);
                uIAnimaX.LJJIJIIJIL(str2);
            }
        }, LLJJI);
    }

    @InterfaceC1312540kGC(name = "src-polyfill")
    public void setSrcPolyfill(final ReadableMap readableMap) {
        if (readableMap instanceof JavaOnlyMap) {
            this.LLILZLL.LIZIZ(new InterfaceC1289150jeT() { // from class: X.0je1
                @Override // X.InterfaceC1289150jeT
                public final void LIZ(AnimaXPlayer animaXPlayer) {
                    UIAnimaX uIAnimaX = this.LIZ;
                    ReadableMap readableMap2 = readableMap;
                    uIAnimaX.getClass();
                    JavaOnlyMap javaOnlyMap = (JavaOnlyMap) readableMap2;
                    com.lynx.animax.base.bridge.JavaOnlyMap javaOnlyMap2 = new com.lynx.animax.base.bridge.JavaOnlyMap();
                    javaOnlyMap.asHashMap();
                    for (Map.Entry<String, Object> entry : javaOnlyMap.entrySet()) {
                        if (entry.getValue() instanceof String) {
                            javaOnlyMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    animaXPlayer.setSrcPolyfill(javaOnlyMap2);
                }
            }, LLJJIII);
        } else {
            AnimaXLog.LIZ("UIAnimaX", "setSrcPolyfill fail");
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "start-frame")
    public void setStartFrame(final int i) {
        this.LLILZLL.LIZ(new InterfaceC1289150jeT() { // from class: X.0jdy
            @Override // X.InterfaceC1289150jeT
            public final void LIZ(AnimaXPlayer animaXPlayer) {
                animaXPlayer.setStartFrame(i);
            }
        });
    }

    @InterfaceC1312540kGC(name = "tag")
    public void setTag(String str) {
        this.LLJI = str;
        ((ConcurrentHashMap) this.LLILLJJLI.LJ.LIZLLL).put("tag", str);
    }

    @InterfaceC1312540kGC(name = "video-frame-timeout")
    public void setVideoFrameTimeout(int i) {
        C1289210jeZ c1289210jeZ = this.LLILLJJLI;
        if (c1289210jeZ != null) {
            c1289210jeZ.LIZLLL.LIZJ = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updatePropertiesInterval(X.C1311730kEt r8) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.animax.UIAnimaX.updatePropertiesInterval(X.0kEt):void");
    }

    public void getCurrentFrame(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
        } else if (callback != null) {
            callback.invoke(0, Double.valueOf(this.LLILZ.getCurrentFrame()));
        }
    }

    public void getDuration(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
        } else if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble("data", this.LLILZ.getDurationMs());
            callback.invoke(0, javaOnlyMap);
        }
    }

    public void isAnimating(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
        } else if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putBoolean("data", this.LLILZ.oi());
            callback.invoke(0, javaOnlyMap);
        }
    }

    public void listenAnimationUpdate(ReadableMap readableMap, Callback callback) {
        C1289210jeZ c1289210jeZ = this.LLILLJJLI;
        if (c1289210jeZ == null) {
            LJJIJ(callback);
            return;
        }
        if (readableMap != null) {
            c1289210jeZ.LJII = readableMap.getBoolean("isListen");
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putBoolean("data", this.LLILLJJLI.LJII);
            callback.invoke(0, javaOnlyMap);
        }
    }

    public void pause(ReadableMap readableMap, Callback callback) {
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (animaXPlayer == null) {
            LJJIJ(callback);
            return;
        }
        animaXPlayer.pause();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void play(ReadableMap readableMap, Callback callback) {
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (animaXPlayer == null) {
            LJJIJ(callback);
            return;
        }
        animaXPlayer.play();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void playSegment(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
            return;
        }
        int i = readableMap.getInt("startFrame");
        int i2 = readableMap.getInt("endFrame");
        if (i2 > 0 && i > i2) {
            if (callback != null) {
                callback.invoke(1, "startFrame and endFrame are not valid!");
            }
        } else {
            this.LLILZ.LJIIJ(i, i2);
            if (callback != null) {
                callback.invoke(0);
            }
        }
    }

    public void resume(ReadableMap readableMap, Callback callback) {
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (animaXPlayer == null) {
            LJJIJ(callback);
            return;
        }
        animaXPlayer.resume();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void seek(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
            return;
        }
        this.LLILZ.LJ(readableMap.getInt("frame"));
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void stop(ReadableMap readableMap, Callback callback) {
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (animaXPlayer == null) {
            LJJIJ(callback);
            return;
        }
        animaXPlayer.stop();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
            return;
        }
        this.LLILZ.LJIILJJIL(readableMap.getInt("frame"));
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void subscribeUpdateEvents(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
            return;
        }
        int[] iArrLJJIIZI = LJJIIZI(readableMap);
        if (iArrLJJIIZI == null) {
            LJJIJ(callback);
            return;
        }
        this.LLILZ.LIZJ(iArrLJJIIZI, true);
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
            return;
        }
        this.LLILZ.LJIILL(readableMap.getInt("frame"));
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void unsubscribeUpdateEvents(ReadableMap readableMap, Callback callback) {
        if (this.LLILZ == null) {
            LJJIJ(callback);
            return;
        }
        int[] iArrLJJIIZI = LJJIIZI(readableMap);
        if (iArrLJJIIZI == null) {
            LJJIJ(callback);
            return;
        }
        this.LLILZ.LIZJ(iArrLJJIIZI, false);
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
