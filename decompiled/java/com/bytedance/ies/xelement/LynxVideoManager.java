package com.bytedance.ies.xelement;

import X.AbstractC21340218fI;
import X.C1297650jsB;
import X.C1313270kHN;
import X.C1313900kIO;
import X.C1540130qBH;
import X.C21340318fJ;
import X.C2188811AlT;
import X.C259800zU;
import X.InterfaceC1294060jmO;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.List;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class LynxVideoManager extends UISimpleView<AbstractC21340218fI> {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        ((AbstractC21340218fI) this.mView).LIZIZ();
        super.onPropsUpdated();
        System.out.println((Object) "LynxVideoManager- onPropsUpdated");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ((AbstractC21340218fI) this.mView).LIZ();
    }

    public LynxVideoManager(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public AbstractC21340218fI createView(Context context) {
        C1540130qBH c1540130qBH = C21340318fJ.LIZIZ.getValue().LIZ;
        if (c1540130qBH == null) {
            c1540130qBH = null;
        }
        AbstractC21340218fI abstractC21340218fIInvoke = c1540130qBH.LIZ.invoke(context);
        abstractC21340218fIInvoke.setStateChangeReporter(new AwS681S0100000_32(this, 1));
        return abstractC21340218fIInvoke;
    }

    @InterfaceC1967107nB
    public final void getDuration(Callback callback) {
        int duration = ((AbstractC21340218fI) this.mView).getDuration();
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(duration));
        }
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
        ((AbstractC21340218fI) this.mView).setBorderRadius((float[]) c259800zU.element);
    }

    @InterfaceC1312540kGC(name = "autolifecycle")
    public final void setAutoLifecycle(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- autolifecycle -> ");
        sbLIZ.append(z);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setAutoLifecycle(z);
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- autoplay -> ");
        sbLIZ.append(z);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setAutoPlay(z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC1312540kGC(name = "__control")
    public final void setControl(String str) {
        boolean z;
        List listLJJLIIIJILLIZJL;
        AbstractC21340218fI abstractC21340218fI;
        JSONObject jSONObject;
        AbstractC21340218fI abstractC21340218fI2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- __control -> ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            boolean z2 = true;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6)) != null && listLJJLIIIJILLIZJL.size() == 3 && 1 != 0) {
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6);
                String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL2, 0);
                switch (str2.hashCode()) {
                    case -1879513255:
                        if (str2.equals("exitfullscreen")) {
                            ((AbstractC21340218fI) this.mView).LIZLLL();
                        }
                        break;
                    case -619198582:
                        if (str2.equals("requestfullscreen")) {
                            ((AbstractC21340218fI) this.mView).LIZJ();
                        }
                        break;
                    case 3443508:
                        if (str2.equals("play") && (abstractC21340218fI = (AbstractC21340218fI) this.mView) != null) {
                            abstractC21340218fI.LJ(null);
                            break;
                        }
                        break;
                    case 3526264:
                        if (str2.equals("seek")) {
                            try {
                                jSONObject = new JSONObject((String) listLJJLIIIJILLIZJL2.get(1));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                jSONObject = new JSONObject();
                            }
                            AbstractC21340218fI abstractC21340218fI3 = (AbstractC21340218fI) this.mView;
                            if (abstractC21340218fI3 != null) {
                                int iOptInt = jSONObject.optInt("position", 0);
                                if (jSONObject.optInt("play") != 1) {
                                    z2 = false;
                                }
                                abstractC21340218fI3.LJFF(iOptInt, z2);
                            }
                        }
                        break;
                    case 106440182:
                        if (str2.equals("pause") && (abstractC21340218fI2 = (AbstractC21340218fI) this.mView) != null) {
                            abstractC21340218fI2.pause();
                            break;
                        }
                        break;
                }
            }
        }
    }

    @InterfaceC1312540kGC(name = "devicechangeaware")
    public final void setDeviceChangeAware(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- devicechangeaware -> ");
        sbLIZ.append(z);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setDeviceChangeAware(z);
    }

    @InterfaceC1312540kGC(name = "inittime")
    public final void setInitTime(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- inittime -> ");
        sbLIZ.append(i);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setInitTime(i);
    }

    @InterfaceC1312540kGC(name = "log-extra")
    public final void setLogExtra(ReadableMap readableMap) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- log-extra -> ");
        sbLIZ.append(readableMap);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        if (readableMap != null) {
            ((AbstractC21340218fI) this.mView).setLogExtra(readableMap.asHashMap());
        }
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void setLoop(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- loop -> ");
        sbLIZ.append(z);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setLoop(z);
    }

    @InterfaceC1312540kGC(name = "muted")
    public final void setMuted(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- muted -> ");
        sbLIZ.append(z);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setMuted(z);
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectFit(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- objectfit -> ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setObjectFit(str);
    }

    @InterfaceC1312540kGC(name = "performanceLog")
    @InterfaceC1294060jmO
    public final void setPerformanceLog(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- performanceLog -> ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            ((AbstractC21340218fI) this.mView).setPerformanceLog(str);
        }
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null && C1297650jsB.LIZ[type.ordinal()] == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxVideoManager- poster -> ");
            sbLIZ.append(interfaceC1298070jsr.asString());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC1298070jsr.asString().length() > 0) {
                ((AbstractC21340218fI) this.mView).setPoster(interfaceC1298070jsr.asString());
            }
        }
    }

    @InterfaceC1312540kGC(name = "preload")
    public final void setPreload(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- preload -> ");
        sbLIZ.append(z);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setPreload(z);
    }

    @InterfaceC1312540kGC(name = "rate")
    public final void setRate(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- rate -> ");
        sbLIZ.append(i);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setRate(i);
    }

    @InterfaceC1312540kGC(name = "singleplayer")
    public final void setSinglePlayer(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- singleplayer -> ");
        sbLIZ.append(z);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setSinglePlayer(z);
    }

    @InterfaceC1312540kGC(name = "singleplayerscene")
    public final void setSinglePlayerScene(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- singleplayerscene -> ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setSinglePlayerScene(str);
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null && C1297650jsB.LIZ[type.ordinal()] == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxVideoManager- src -> ");
            sbLIZ.append(interfaceC1298070jsr.asString());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC1298070jsr.asString().length() > 0) {
                ((AbstractC21340218fI) this.mView).setSrc(interfaceC1298070jsr.asString());
            }
        }
    }

    @InterfaceC1312540kGC(name = "videoheight")
    public final void setVideoHeight(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- videoheight -> ");
        sbLIZ.append(i);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setVideoHeight(i);
    }

    @InterfaceC1312540kGC(name = "videowidth")
    public final void setVideoWidth(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- videowidth -> ");
        sbLIZ.append(i);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setVideoWidth(i);
    }

    @InterfaceC1312540kGC(name = "volume")
    public final void setVolume(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxVideoManager- preload -> ");
        sbLIZ.append(f);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC21340218fI) this.mView).setVolume(f);
    }
}
