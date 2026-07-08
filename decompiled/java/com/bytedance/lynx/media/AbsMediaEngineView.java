package com.bytedance.lynx.media;

import X.AbstractC1289780jfU;
import X.AbstractC1299960jvu;
import X.C01GW;
import X.C1289960jfm;
import X.C1298720jtu;
import X.C1301600jyY;
import X.C1311730kEt;
import X.C1485970olv;
import X.C1491110ouD;
import X.C1491120ouE;
import X.C1529730puV;
import X.C1530360pvW;
import X.C1AML;
import X.C1AMO;
import X.C1AMQ;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC1299880jvm;
import X.EnumC1473790oSH;
import X.EnumC1534460q28;
import X.EnumC452301pR;
import X.InterfaceC1290540jgi;
import X.InterfaceC1301330jy7;
import X.InterfaceC1310460kCq;
import X.InterfaceC1312540kGC;
import X.InterfaceC1485980olw;
import X.InterfaceC1491100ouC;
import X.InterfaceC1967107nB;
import android.media.AudioManager;
import com.bytedance.lynx.media.AbsMediaEngineView;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes34.dex */
public abstract class AbsMediaEngineView<T extends C1AML> extends UISimpleView<T> implements InterfaceC1310460kCq, InterfaceC1485980olw {
    public static final /* synthetic */ int LLLFF = 0;
    public final String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public HashMap<Integer, Pair<Object, EnumC1473790oSH>> LLJJIJI;
    public ReadableMap LLJJIJIIJIL;
    public ReadableMap LLJJIJIL;
    public String LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public int LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public volatile int LLJJLIIIJLLLLLLLZ;
    public AbstractC1299960jvu LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public String LLJLLIL;
    public final C01GW LLJLLL;
    public final C1AMO LLJZ;
    public Map<String, Object> LLJZIJLIL;
    public volatile boolean LLL;
    public C1AMQ LLLF;

    @Override // X.InterfaceC1310460kCq
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1485980olw
    public final void LJIILJJIL() {
        this.LLJLILLLLZIIL = true;
    }

    @Override // X.InterfaceC1310460kCq
    public final void LJIILLIIL() {
        if (this.LLJILJILJ) {
            ((C1AML) this.mView).LIZIZ(null);
        }
    }

    @Override // X.InterfaceC1485980olw
    public final int LJJIIJZLJL() {
        C1AML c1aml = (C1AML) this.mView;
        c1aml.getClass();
        LynxLog.i("LynxMediaEngineBaseView", "invoke getDuration");
        InterfaceC1491100ouC interfaceC1491100ouC = c1aml.LL;
        if (interfaceC1491100ouC != null) {
            return interfaceC1491100ouC.LJIIJJI(null);
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        C1AML c1aml = (C1AML) this.mView;
        c1aml.getClass();
        LynxLog.i("LynxMediaEngineBaseView", "trigger release");
        InterfaceC1491100ouC interfaceC1491100ouC = c1aml.LL;
        if (interfaceC1491100ouC != null) {
            interfaceC1491100ouC.destroy();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeRemoved() {
        super.onNodeRemoved();
        ((C1AML) this.mView).LIZIZ(null);
    }

    public static Pair LJJIJIIJI(String str) {
        String strLJJJLL;
        int iLJJJJI;
        if (u.LJJIIJZLJL(str, "@encode(", false) && u.LJIIZILJ(str, ")", false) && (iLJJJJI = a0.LJJJJI((strLJJJLL = a0.LJJJLL(")", a0.LJJJJZ("@encode(", str))), ",", 0, 6)) != -1) {
            String strSubstring = strLJJJLL.substring(0, iLJJJJI);
            String string = a0.LJLIIIL(strLJJJLL.substring(iLJJJJI + 1)).toString();
            int iHashCode = string.hashCode();
            if (iHashCode != 102) {
                if (iHashCode != 105) {
                    if (iHashCode != 108) {
                        if (iHashCode == 90613 && string.equals("[c]")) {
                            return new Pair(strSubstring, EnumC1473790oSH.TYPE_STRING);
                        }
                        return null;
                    }
                    if (string.equals("l")) {
                        return new Pair(Long.valueOf(CastLongProtector.parseLong(strSubstring)), EnumC1473790oSH.TYPE_LONG);
                    }
                    return null;
                }
                if (string.equals("i")) {
                    return new Pair(Integer.valueOf(CastIntegerProtector.parseInt(strSubstring)), EnumC1473790oSH.TYPE_INT);
                }
                return null;
            }
            if (string.equals("f")) {
                return new Pair(Float.valueOf(CastFloatProtector.parseFloat(strSubstring)), EnumC1473790oSH.TYPE_FLOAT);
            }
            return null;
        }
        return null;
    }

    public final boolean LJJIIZI(Callback callback) {
        if (this.LLJJ || ((C1AML) this.mView).LIZLLL()) {
            return true;
        }
        callback.invoke(7, "The player is not prepared! Please invoke prepare operation first");
        return false;
    }

    public final boolean LJJIJ(Callback callback) {
        if (this.LLL) {
            return true;
        }
        callback.invoke(7, "The url is not redirected! Please try again after redirecting.");
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        ReadableMap readableMap;
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator;
        String str;
        boolean z;
        TraceEvent.LIZLLL("AbsMediaEngineView.afterPropsUpdated");
        super.afterPropsUpdated(c1311730kEt);
        if (this.LLJLL) {
            ((C1AML) this.mView).LJFF();
            if (this.LLILZIL.length() > 0) {
                str = this.LLILZIL;
            } else if (this.LLILLJJLI.length() > 0) {
                str = this.LLILLJJLI;
            } else {
                str = this.LLILZLL;
            }
            String str2 = this.LLJLLIL;
            if (str2.length() > 0 && 1 != 0 && !Intrinsics.LJFF(str2, str)) {
                sendEvent("reload", C2097608Jq.LJI(new Pair("oldUrl", str2), new Pair("newUrl", str)));
            }
            this.LLJLLIL = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.LLILZIL.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put("video_model", this.LLILZIL);
                this.LLLF = C1AMQ.VIDEO_MODEL;
            } else if (this.LLILLJJLI.length() > 0) {
                linkedHashMap.put("video_id", this.LLILLJJLI);
                if (this.LLILZ.length() > 0) {
                    linkedHashMap.put("domain", this.LLILZ);
                }
                if (this.LLILLL.length() > 0) {
                    linkedHashMap.put("token", this.LLILLL);
                }
                this.LLLF = C1AMQ.VIDEO_ID;
            } else if (this.LLILZLL.length() > 0) {
                linkedHashMap.put("play_url", this.LLILZLL);
                this.LLLF = C1AMQ.PLAY_URL;
            }
            if (this.LLLF == C1AMQ.UNSUPPORTED) {
                sendEvent("error", C2097608Jq.LJI(new Pair("errorMsg", "unsupported src type"), new Pair("errorCode", -1)));
                this.LLJLL = false;
                return;
            }
            linkedHashMap.put("muted", Boolean.valueOf(this.LLIZ));
            linkedHashMap.put("loop", Boolean.valueOf(this.LLIZLLLIL));
            linkedHashMap.put("inittime", Integer.valueOf(this.LLJ));
            linkedHashMap.put("objectfit", this.LLJI);
            String str3 = this.LLJIJIL;
            if (str3 != null) {
                linkedHashMap.put("tag", str3);
            }
            String str4 = this.LLJILJIL;
            if (str4 != null) {
                linkedHashMap.put("sub_tag", str4);
            }
            linkedHashMap.put("preload-key", this.LLJJI);
            linkedHashMap.put("cache-size", Integer.valueOf(this.LLJJIII));
            linkedHashMap.put("auto_prepare", Boolean.valueOf(this.LLJILLL));
            linkedHashMap.put("volume", Float.valueOf(this.LLJJJIL));
            linkedHashMap.put("speed", Float.valueOf(this.LLJJJJ));
            ReadableMap readableMap2 = this.LLJJIJIIJIL;
            if (readableMap2 != null) {
                linkedHashMap.put("headers", readableMap2);
            }
            ReadableMap readableMap3 = this.LLJJIJIL;
            if (readableMap3 != null) {
                linkedHashMap.put("extended_params", readableMap3);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str5 = this.LLJJJ;
            if (str5 != null) {
                linkedHashMap2.put("experimental-force-prepare-play-after-surface-available", str5);
            }
            linkedHashMap.put("experimental-props", linkedHashMap2);
            linkedHashMap.put("progress_update_interval", Integer.valueOf(this.LLJJJJJIL));
            linkedHashMap.put("player-type", this.LLJJJJLIIL);
            linkedHashMap.put("resolution", this.LLJJL);
            linkedHashMap.put("skip_prepare_check", Boolean.valueOf(this.LLJJ));
            this.LLJZIJLIL = linkedHashMap;
            if (!this.mSkipRedirection && this.LLLF == C1AMQ.PLAY_URL) {
                this.LLL = false;
                Object obj = linkedHashMap.get("play_url");
                if (obj != null) {
                    final String str6 = (String) obj;
                    if (!this.LLJLIL) {
                        if (this.LLJLLL.getValue() == null) {
                            this.mContext.LJIILLIIL(new LynxError(32103, "AbsMediaEngineView can't get resource service.", "An error occurred while attempting to get ILynxResourceService. You can call LynxServiceCenter.register(ILynxResourceService::class.java, YourResourceServiceClass) to fix this. If you are unable to resolve this issue, you can seek help from the client RD.", "error"));
                        } else {
                            TraceEvent.LIZLLL("AbsMediaEngineView.legacyAsyncFetchResource");
                            C1530360pvW c1530360pvW = new C1530360pvW();
                            Boolean bool = Boolean.TRUE;
                            c1530360pvW.LIZIZ = bool;
                            c1530360pvW.LIZJ = bool;
                            c1530360pvW.LIZ = EnumC1534460q28.LYNX_VIDEO;
                            this.LLJJLIIIJLLLLLLLZ = str6.hashCode();
                            final int i = this.LLJJLIIIJLLLLLLLZ;
                            ((InterfaceC1301330jy7) this.LLJLLL.getValue()).fetchResourceAsync(str6, c1530360pvW, new AbstractC1289780jfU() { // from class: X.1AMM
                                @Override // X.AbstractC1289780jfU
                                public final void LIZ(InterfaceC1289770jfT interfaceC1289770jfT) {
                                    String filePath;
                                    TraceEvent.LIZLLL("AbsMediaEngineView.ResourceResponseCallback");
                                    if (i != this.LLJJLIIIJLLLLLLLZ) {
                                        return;
                                    }
                                    this.LLL = true;
                                    if (interfaceC1289770jfT.LIZJ().booleanValue() && (filePath = interfaceC1289770jfT.getFilePath()) != null && !a0.LJJJIL(filePath)) {
                                        AbsMediaEngineView<C1AML> absMediaEngineView = this;
                                        String filePath2 = interfaceC1289770jfT.getFilePath();
                                        absMediaEngineView.getClass();
                                        absMediaEngineView.LJJIJIIJIL(new C1AMS(absMediaEngineView, filePath2), null);
                                    } else {
                                        AbsMediaEngineView<C1AML> absMediaEngineView2 = this;
                                        absMediaEngineView2.getClass();
                                        absMediaEngineView2.LJJIJIIJIL(null, new C1AMP(absMediaEngineView2));
                                    }
                                    this.sendEvent("redirect", C2097608Jq.LJI(new Pair("url", str6), new Pair("redirected", interfaceC1289770jfT.getFilePath())));
                                    TraceEvent.LJII("AbsMediaEngineView.ResourceResponseCallback");
                                }
                            });
                            TraceEvent.LJII("AbsMediaEngineView.legacyAsyncFetchResource");
                        }
                    } else if (this.LLJL == null) {
                        this.mContext.LJIILLIIL(new LynxError(30301, "AbsMediaEngineView can't get generic resource fetcher.", "An error occurred while attempting to get LynxGenericResourceFetcher. You can request Hybrid Container team to register such instance to fix this. If you are unable to resolve this issue, you can seek help from the client RD.", "error"));
                    } else {
                        TraceEvent.LIZLLL("AbsMediaEngineView.genericAsyncFetchResource");
                        this.LLJJLIIIJLLLLLLLZ = str6.hashCode();
                        final int i2 = this.LLJJLIIIJLLLLLLLZ;
                        AbstractC1299960jvu abstractC1299960jvu = this.LLJL;
                        if (abstractC1299960jvu != null) {
                            abstractC1299960jvu.LIZJ(new C1301600jyY(str6, EnumC1299880jvm.LynxResourceTypeVideo), new InterfaceC1290540jgi<String>() { // from class: X.1AMN
                                @Override // X.InterfaceC1290540jgi
                                public final void LIZ(C1289590jfB<String> c1289590jfB) {
                                    String str7;
                                    TraceEvent.LIZLLL("AbsMediaEngineView.genericResourceResponseCallback");
                                    if (i2 != this.LLJJLIIIJLLLLLLLZ) {
                                        return;
                                    }
                                    this.LLL = true;
                                    if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS && (str7 = c1289590jfB.LIZIZ) != null && !a0.LJJJIL(str7)) {
                                        AbsMediaEngineView<C1AML> absMediaEngineView = this;
                                        String str8 = c1289590jfB.LIZIZ;
                                        absMediaEngineView.getClass();
                                        absMediaEngineView.LJJIJIIJIL(new C1AMS(absMediaEngineView, str8), null);
                                    } else {
                                        AbsMediaEngineView<C1AML> absMediaEngineView2 = this;
                                        absMediaEngineView2.getClass();
                                        absMediaEngineView2.LJJIJIIJIL(null, new C1AMP(absMediaEngineView2));
                                    }
                                    this.sendEvent("redirect", C2097608Jq.LJI(new Pair("url", str6), new Pair("redirected", c1289590jfB.LIZIZ)));
                                    TraceEvent.LJII("AbsMediaEngineView.genericResourceResponseCallback");
                                }
                            });
                        }
                        TraceEvent.LJII("AbsMediaEngineView.genericAsyncFetchResource");
                    }
                    this.LLJLL = false;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.LLL = true;
            LJJIJIIJIL(null, null);
            this.LLJLL = false;
            sendEvent("redirect", C2097608Jq.LJI(new Pair("url", this.LLILZLL), new Pair("redirected", this.LLILZLL)));
        } else if (c1311730kEt != null && (readableMap = c1311730kEt.LIZ) != null && (readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator()) != null) {
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (strNextKey != null) {
                    String str7 = "";
                    switch (strNextKey.hashCode()) {
                        case -1869688179:
                            if (strNextKey.equals("sub-tag")) {
                                if (!this.LLL) {
                                    Map<String, Object> map = this.LLJZIJLIL;
                                    if (map != null) {
                                        String str8 = this.LLJILJIL;
                                        if (str8 != null) {
                                            str7 = str8;
                                        }
                                        map.put("sub_tag", str7);
                                    }
                                } else {
                                    C1AML c1aml = (C1AML) this.mView;
                                    String str9 = this.LLJILJIL;
                                    if (str9 != null) {
                                        str7 = str9;
                                    }
                                    c1aml.setSubTag(str7);
                                }
                            }
                            break;
                        case -1600030548:
                            if (strNextKey.equals("resolution")) {
                                if (!this.LLL) {
                                    Map<String, Object> map2 = this.LLJZIJLIL;
                                    if (map2 != null) {
                                        map2.put("resolution", this.LLJJL);
                                    }
                                } else {
                                    ((C1AML) this.mView).setResolution(this.LLJJL);
                                }
                            }
                            break;
                        case -810883302:
                            if (strNextKey.equals("volume")) {
                                if (!this.LLL) {
                                    Map<String, Object> map3 = this.LLJZIJLIL;
                                    if (map3 != null) {
                                        map3.put("volume", Float.valueOf(this.LLJJJIL));
                                    }
                                } else {
                                    ((C1AML) this.mView).setVolume(this.LLJJJIL);
                                }
                            }
                            break;
                        case -17124500:
                            if (strNextKey.equals("cache-size")) {
                                if (!this.LLL) {
                                    Map<String, Object> map4 = this.LLJZIJLIL;
                                    if (map4 != null) {
                                        map4.put("cache-size", Integer.valueOf(this.LLJJIII));
                                    }
                                } else {
                                    ((C1AML) this.mView).setCacheSize(this.LLJJIII);
                                }
                            }
                            break;
                        case 114586:
                            if (strNextKey.equals("tag")) {
                                if (!this.LLL) {
                                    Map<String, Object> map5 = this.LLJZIJLIL;
                                    if (map5 != null) {
                                        String str10 = this.LLJIJIL;
                                        if (str10 != null) {
                                            str7 = str10;
                                        }
                                        map5.put("tag", str7);
                                    }
                                } else {
                                    C1AML c1aml2 = (C1AML) this.mView;
                                    String str11 = this.LLJIJIL;
                                    if (str11 != null) {
                                        str7 = str11;
                                    }
                                    c1aml2.setTag(str7);
                                }
                            }
                            break;
                        case 3327652:
                            if (strNextKey.equals("loop")) {
                                if (!this.LLL) {
                                    Map<String, Object> map6 = this.LLJZIJLIL;
                                    if (map6 != null) {
                                        map6.put("loop", Boolean.valueOf(this.LLIZLLLIL));
                                    }
                                } else {
                                    ((C1AML) this.mView).setLoop(this.LLIZLLLIL);
                                }
                            }
                            break;
                        case 3493088:
                            if (strNextKey.equals("rate")) {
                                if (!this.LLL) {
                                    Map<String, Object> map7 = this.LLJZIJLIL;
                                    if (map7 != null) {
                                        map7.put("progress_update_interval", Integer.valueOf(this.LLJJJJJIL));
                                    }
                                } else {
                                    ((C1AML) this.mView).setProgressUpdateInterval(this.LLJJJJJIL);
                                }
                            }
                            break;
                        case 104264043:
                            if (strNextKey.equals("muted")) {
                                if (!this.LLL) {
                                    Map<String, Object> map8 = this.LLJZIJLIL;
                                    if (map8 != null) {
                                        map8.put("muted", Boolean.valueOf(this.LLIZ));
                                    }
                                } else {
                                    ((C1AML) this.mView).setMuted(this.LLIZ);
                                }
                            }
                            break;
                        case 109641799:
                            if (strNextKey.equals("speed")) {
                                if (!this.LLL) {
                                    Map<String, Object> map9 = this.LLJZIJLIL;
                                    if (map9 != null) {
                                        map9.put("speed", Float.valueOf(this.LLJJJJ));
                                    }
                                } else {
                                    ((C1AML) this.mView).setSpeed(this.LLJJJJ);
                                }
                            }
                            break;
                    }
                }
            }
        }
        TraceEvent.LJII("AbsMediaEngineView.afterPropsUpdated");
    }

    @InterfaceC1967107nB
    public final void releaseFocus(Callback callback) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" invoke releaseFocus");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ((C1AML) this.mView).LIZ(this.LLJZ);
        callback.invoke(0, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public final void requestFocus(Callback callback) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" invoke requestFocus");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ((C1AML) this.mView).LJ(this.LLJZ);
        callback.invoke(0, javaOnlyMap);
    }

    @InterfaceC1312540kGC(name = "auto-prepare")
    public final void setAutoPrepare(boolean z) {
        this.LLJILLL = z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set autoPrepare ");
        sbLIZ.append(z);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "cache-size")
    public final void setCacheSize(int i) {
        this.LLJJIII = i;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set CacheSize ");
        sbLIZ.append(i);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "inittime")
    public final void setDeprecatedInitTime(int i) {
        this.LLJ = i;
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setDeprecatedObjectFit(String str) {
        this.LLJI = str;
    }

    @InterfaceC1312540kGC(name = "domain")
    public final void setDomain(String str) {
        if (str != null) {
            this.LLJLL = !Intrinsics.LJFF(this.LLILZ, str);
            this.LLILZ = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" set domain ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "extended-params")
    public final void setExtendedParams(ReadableMap readableMap) {
        this.LLJJIJIL = readableMap;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set extendedParams");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "experimental-force-prepare-play-after-surface-available")
    public final void setForcePreparePlayAfterSurfaceAvailable(String str) {
        this.LLJJJ = str;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set force_prepare_play_after_surface_available prop");
        LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "headers")
    public final void setHeaders(ReadableMap readableMap) {
        this.LLJJIJIIJIL = readableMap;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set headers");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "initial-time")
    public final void setInitTime(int i) {
        this.LLJ = i;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set inittime ");
        sbLIZ.append(i);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void setLoop(boolean z) {
        this.LLIZLLLIL = z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set loop ");
        sbLIZ.append(z);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "muted")
    public final void setMuted(boolean z) {
        this.LLIZ = z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set muted ");
        sbLIZ.append(z);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "object-fit")
    public final void setObjectFit(String str) {
        this.LLJI = str;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set objectFit ");
        sbLIZ.append(str);
        LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "pause-on-hide")
    public final void setPauseOnHide(boolean z) {
        this.LLJILJILJ = z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set pauseOnHide ");
        sbLIZ.append(z);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "play-url")
    public final void setPlayUrl(String str) {
        if (str != null) {
            this.LLJLL = !Intrinsics.LJFF(this.LLILZLL, str);
            this.LLILZLL = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" set playUrl ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "player-option")
    public final void setPlayerOption(ReadableMap readableMap) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator;
        this.LLJJIJI = new HashMap<>();
        if (readableMap != null && (readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator()) != null) {
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                try {
                    Pair<Object, EnumC1473790oSH> pairLJJIJIIJI = LJJIJIIJI(readableMap.getString(strNextKey));
                    if (pairLJJIJIIJI != null) {
                        this.LLJJIJI.put(Integer.valueOf(CastIntegerProtector.parseInt(strNextKey)), pairLJJIJIIJI);
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    s sVar = this.mContext;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to parse the ");
                    sbLIZ.append(strNextKey);
                    sbLIZ.append(" field in player-option during the attempt. ");
                    sVar.LJIILLIIL(new LynxError(990100, C2188811AlT.LIZIZ(sbLIZ), "Please check if the types match.", "error"));
                }
            }
        }
        String str = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(getSign());
        sbLIZ2.append(" set playerOptions");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @InterfaceC1312540kGC(name = "player-type")
    public final void setPlayerType(String str) {
        if (str.length() > 0) {
            this.LLJJJJLIIL = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" set playerType ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "preload-key")
    public final void setPreloadKey(String str) {
        this.LLJJI = str;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set preloadKey ");
        sbLIZ.append(str);
        LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "rate")
    public final void setRate(int i) {
        this.LLJJJJJIL = i;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set rate ");
        sbLIZ.append(i);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "resolution")
    public final void setResolution(String str) {
        if (str != null) {
            this.LLJJL = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" set resolution ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "skip-prepare-check")
    public final void setSkipPrepareCheck(boolean z) {
        this.LLJJ = z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set skipPrepareCheck ");
        sbLIZ.append(z);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "speed")
    public final void setSpeed(float f) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set speed ");
        sbLIZ.append(f);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJ = f;
    }

    @InterfaceC1312540kGC(name = "token")
    public final void setToken(String str) {
        if (str != null) {
            this.LLILLL = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" set token ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "vid")
    public final void setVid(String str) {
        if (str != null) {
            this.LLJLL = !Intrinsics.LJFF(this.LLILLJJLI, str);
            this.LLILLJJLI = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" set vid ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "video-model")
    public final void setVideoModel(String str) {
        if (str != null) {
            this.LLJLL = !Intrinsics.LJFF(this.LLILZIL, str);
            this.LLILZIL = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" set media model ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "sub-tag")
    public final void setVideoSubTag(String str) {
        this.LLJILJIL = str;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set subTag ");
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "tag")
    public final void setVideoTag(String str) {
        this.LLJIJIL = str;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set tag ");
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "volume")
    public final void setVolume(float f) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" set volume ");
        sbLIZ.append(f);
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        if (f >= 0.0f && f < 1.0f) {
            this.LLJJJIL = f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1AMO] */
    public AbsMediaEngineView(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = "AbsMediaEngineView";
        this.LLILLJJLI = "";
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = "";
        this.LLILZLL = "";
        this.LLJI = "contain";
        this.LLJIJIL = "x-media-engine";
        this.LLJILJIL = "";
        this.LLJILLL = true;
        this.LLJJI = "";
        this.LLJJJ = "false";
        this.LLJJJIL = 1.0f;
        this.LLJJJJ = 1.0f;
        this.LLJJJJJIL = 167;
        this.LLJJJJLIIL = "default";
        this.LLJJL = "auto";
        this.LLJLLIL = "";
        this.LLJLLL = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C1529730puV());
        this.LLJZ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.1AMO
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                InterfaceC1491100ouC interfaceC1491100ouC;
                C1AML c1aml;
                InterfaceC1491100ouC interfaceC1491100ouC2;
                AbsMediaEngineView absMediaEngineView = this.LL;
                int i2 = AbsMediaEngineView.LLLFF;
                if (i != -2) {
                    if (i != -1) {
                        if (i == 1 && (c1aml = (C1AML) absMediaEngineView.mView) != null && (interfaceC1491100ouC2 = c1aml.LL) != null) {
                            LynxLog.i("LynxMediaEngineBaseView", "invoke play");
                            interfaceC1491100ouC2.LJFF(null);
                            return;
                        }
                        return;
                    }
                    C1AML c1aml2 = (C1AML) absMediaEngineView.mView;
                    if (c1aml2 == null || (interfaceC1491100ouC = c1aml2.LL) == null) {
                        return;
                    }
                    LynxLog.i("LynxMediaEngineBaseView", "invoke stop");
                    interfaceC1491100ouC.LIZ(null);
                    return;
                }
                C1AML c1aml3 = (C1AML) absMediaEngineView.mView;
                if (c1aml3 == null) {
                    return;
                }
                c1aml3.LIZIZ(null);
            }
        };
        this.LLLF = C1AMQ.UNSUPPORTED;
    }

    public final void LJJIJIIJIL(Function0<Unit> function0, Function0<Unit> function02) {
        if (function0 != null) {
            function0.invoke();
        }
        Map<String, Object> map = this.LLJZIJLIL;
        if (map != null) {
            ((C1AML) this.mView).setPlayParams(C2097608Jq.LJIIZILJ(map));
        }
        C1485970olv c1485970olv = new C1485970olv(this);
        ((C1AML) this.mView).setVideoEngineCallback(c1485970olv);
        ((C1AML) this.mView).setVideoEngineInfoListener(c1485970olv);
        ((C1AML) this.mView).setMediaVideoEngineCallback(c1485970olv);
        HashMap<Integer, Pair<Object, EnumC1473790oSH>> map2 = this.LLJJIJI;
        if (map2 != null) {
            ((C1AML) this.mView).setPlayOptions(map2);
        }
        if (function02 != null) {
            function02.invoke();
        }
    }

    @InterfaceC1967107nB
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        if (LJJIJ(callback) && LJJIIZI(callback)) {
            String str = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" invoke getDuration");
            LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
            C1AML c1aml = (C1AML) this.mView;
            C1491110ouD c1491110ouD = new C1491110ouD(callback);
            c1aml.getClass();
            LynxLog.i("LynxMediaEngineBaseView", "invoke getDuration");
            InterfaceC1491100ouC interfaceC1491100ouC = c1aml.LL;
            if (interfaceC1491100ouC != null) {
                interfaceC1491100ouC.LJIIJJI(c1491110ouD);
            }
        }
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap, Callback callback) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" invoke pause");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        ((C1AML) this.mView).LIZIZ(new C1491120ouE(callback));
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap, Callback callback) {
        if (LJJIJ(callback) && LJJIIZI(callback)) {
            String str = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" invoke play");
            LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
            C1AML c1aml = (C1AML) this.mView;
            C1491120ouE c1491120ouE = new C1491120ouE(callback);
            InterfaceC1491100ouC interfaceC1491100ouC = c1aml.LL;
            if (interfaceC1491100ouC != null) {
                LynxLog.i("LynxMediaEngineBaseView", "invoke play");
                interfaceC1491100ouC.LJFF(c1491120ouE);
            }
        }
    }

    @InterfaceC1967107nB
    public final void prepare(ReadableMap readableMap, Callback callback) {
        if (!LJJIJ(callback)) {
            return;
        }
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" invoke prepare");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        ((C1AML) this.mView).LIZJ(new C1491120ouE(callback));
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        boolean z;
        if (LJJIJ(callback) && LJJIIZI(callback)) {
            String str = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getSign());
            sbLIZ.append(" invoke seek");
            LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
            long j = readableMap.getLong("position");
            if (readableMap.hasKey("play")) {
                z = readableMap.getBoolean("play");
            } else {
                z = false;
            }
            C1AML c1aml = (C1AML) this.mView;
            C1491120ouE c1491120ouE = new C1491120ouE(callback);
            InterfaceC1491100ouC interfaceC1491100ouC = c1aml.LL;
            if (interfaceC1491100ouC != null) {
                LynxLog.i("LynxMediaEngineBaseView", "invoke seek");
                interfaceC1491100ouC.LIZIZ(j, z, c1491120ouE);
            }
        }
    }

    @Override // X.InterfaceC1485980olw
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
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" invoke stop");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        C1AML c1aml = (C1AML) this.mView;
        C1491120ouE c1491120ouE = new C1491120ouE(callback);
        InterfaceC1491100ouC interfaceC1491100ouC = c1aml.LL;
        if (interfaceC1491100ouC != null) {
            LynxLog.i("LynxMediaEngineBaseView", "invoke stop");
            interfaceC1491100ouC.LIZ(c1491120ouE);
        }
    }
}
