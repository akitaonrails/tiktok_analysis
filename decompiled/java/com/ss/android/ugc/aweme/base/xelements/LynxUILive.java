package com.ss.android.ugc.aweme.base.xelements;

import X.C1289960jfm;
import X.C1298720jtu;
import X.C1ADA;
import X.C21396418oM;
import X.C21396818oQ;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC21396518oN;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.base.xelements.LynxUILive;
import j27.s;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class LynxUILive extends LynxUI<C21396418oM> {
    public static final C21396818oQ Companion = new Object() { // from class: X.18oQ
    };
    public static Function1<? super Context, ? extends InterfaceC21396518oN> createLivePlayerFactory = AFwS278S0000000_32.get$arr$(24);
    public InterfaceC21396518oN livePlayer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.18oO] */
    public final InterfaceC21396518oN player$spark_base_release() {
        ViewGroup viewGroup;
        InterfaceC21396518oN interfaceC21396518oN = this.livePlayer;
        InterfaceC21396518oN interfaceC21396518oN2 = interfaceC21396518oN;
        if (interfaceC21396518oN == null) {
            C21396818oQ c21396818oQ = Companion;
            s sVar = this.mContext;
            c21396818oQ.getClass();
            InterfaceC21396518oN interfaceC21396518oNInvoke = createLivePlayerFactory.invoke(sVar);
            interfaceC21396518oNInvoke.LIZ(this);
            interfaceC21396518oNInvoke.LJFF(new C1ADA() { // from class: X.18oO
                @Override // X.C1ADA
                public final void LJII() {
                    this.LIZ.updatePauseFrame(null);
                    LynxUILive.sendCustomEvent$spark_base_release$default(this.LIZ, "firstframe", null, 2, null);
                }

                @Override // X.C1ADA
                public final void onEnd() {
                    LynxUILive.sendCustomEvent$spark_base_release$default(this.LIZ, "ended", null, 2, null);
                }

                @Override // X.C1ADA
                public final void onPause() {
                    LynxUILive.sendCustomEvent$spark_base_release$default(this.LIZ, "pause", null, 2, null);
                }

                @Override // X.C1ADA
                public final void onPlay() {
                    LynxUILive.sendCustomEvent$spark_base_release$default(this.LIZ, "play", null, 2, null);
                }

                @Override // X.C1ADA
                public final void onStop() {
                    LynxUILive.sendCustomEvent$spark_base_release$default(this.LIZ, "stop", null, 2, null);
                }

                @Override // X.C1ADA
                public final void W1(String str) {
                    this.LIZ.sendCustomEvent$spark_base_release("sei", C2097608Jq.LJIIJ(new Pair("sei", str)));
                }

                @Override // X.C1ADA
                public final void onError(String str) {
                    this.LIZ.sendCustomEvent$spark_base_release("error", C2097608Jq.LJIIJ(new Pair("msg", str)));
                }
            });
            this.livePlayer = interfaceC21396518oNInvoke;
            interfaceC21396518oN2 = interfaceC21396518oNInvoke;
        }
        View viewLIZLLL = interfaceC21396518oN2.LIZLLL();
        if (viewLIZLLL != null && !Intrinsics.LJFF(viewLIZLLL.getParent(), this.mView)) {
            ViewParent parent = viewLIZLLL.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewLIZLLL, viewGroup);
            }
            ((ViewGroup) this.mView).addView(viewLIZLLL);
        }
        return interfaceC21396518oN2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        player$spark_base_release().destroy();
    }

    public LynxUILive(s sVar) {
        super(sVar);
    }

    public static final void injectCreateLivePlayer(Function1<? super Context, ? extends InterfaceC21396518oN> function1) {
        Companion.getClass();
        createLivePlayerFactory = function1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public C21396418oM createView(Context context) {
        if (context == null) {
            return null;
        }
        C21396418oM c21396418oM = new C21396418oM(context, this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21396418oM);
        c21396418oM.setLayoutParams(layoutParams);
        setBackgroundColor(-16777216);
        return c21396418oM;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "mute")
    public void setMuted(boolean z) {
        player$spark_base_release().LJIILJJIL(z);
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public void setObjectFit(String str) {
        int i = 0;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3143043) {
                if (iHashCode != 94852023) {
                    if (iHashCode == 951526612) {
                        str.equals("contain");
                    }
                } else if (str.equals("cover")) {
                    i = 2;
                }
            } else if (str.equals("fill")) {
                i = 1;
            }
        }
        player$spark_base_release().setScaleType(i);
        ((C21396418oM) this.mView).setScaleType(str);
    }

    @InterfaceC1312540kGC(name = "qualities")
    public void setQualities(String str) {
        InterfaceC21396518oN interfaceC21396518oNPlayer$spark_base_release = player$spark_base_release();
        if (str == null) {
            str = "auto";
        }
        interfaceC21396518oNPlayer$spark_base_release.LIZJ(str);
    }

    @InterfaceC1312540kGC(name = "stream-data")
    public void setStreamData(String str) {
        if (str != null) {
            player$spark_base_release().LJI(str);
        } else {
            player$spark_base_release().stop();
        }
    }

    public void updatePauseFrame(Bitmap bitmap) {
        C21396418oM c21396418oM = (C21396418oM) this.mView;
        if (bitmap != null) {
            C786410Ut5.LJZI(0, c21396418oM.LLILLJJLI);
            c21396418oM.LLILLJJLI.setImageBitmap(bitmap);
            if (!Intrinsics.LJFF(c21396418oM.LLILLJJLI.getParent(), c21396418oM)) {
                if (c21396418oM.LLILLJJLI.getParent() != null && (c21396418oM.LLILLJJLI.getParent() instanceof ViewGroup)) {
                    C786410Ut5.LJJJLZIJ(c21396418oM.LLILLJJLI, (ViewGroup) c21396418oM.LLILLJJLI.getParent());
                }
                c21396418oM.addView(c21396418oM.LLILLJJLI);
            }
            c21396418oM.LLILLJJLI.bringToFront();
            return;
        }
        C786410Ut5.LJZI(8, c21396418oM.LLILLJJLI);
    }

    private final void dispatchMethodError(String str, Callback callback) {
        if (str != null && str.length() != 0) {
            if (callback != null) {
                callback.invoke(1, str);
            }
        } else {
            if (callback == null) {
                return;
            }
            callback.invoke(0);
        }
    }

    @InterfaceC1967107nB
    public void enterLiveRoom(ReadableMap readableMap, Callback callback) {
        HashMap<String, Object> mapAsHashMap;
        InterfaceC21396518oN interfaceC21396518oNPlayer$spark_base_release = player$spark_base_release();
        if (readableMap != null) {
            mapAsHashMap = readableMap.asHashMap();
        } else {
            mapAsHashMap = null;
        }
        dispatchMethodError(interfaceC21396518oNPlayer$spark_base_release.LJ(mapAsHashMap), callback);
    }

    @InterfaceC1967107nB
    public void pause(ReadableMap readableMap, Callback callback) {
        dispatchMethodError(player$spark_base_release().pause(), callback);
    }

    @InterfaceC1967107nB
    public void play(ReadableMap readableMap, Callback callback) {
        dispatchMethodError(player$spark_base_release().play(), callback);
    }

    public final void sendCustomEvent$spark_base_release(String str, Map<String, ? extends Object> map) {
        C1298720jtu c1298720jtu;
        int sign = getSign();
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        C1289960jfm c1289960jfm = new C1289960jfm(sign, str, map);
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @InterfaceC1967107nB
    public void stop(ReadableMap readableMap, Callback callback) {
        dispatchMethodError(player$spark_base_release().stop(), callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendCustomEvent$spark_base_release$default(LynxUILive lynxUILive, String str, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                map = null;
            }
            lynxUILive.sendCustomEvent$spark_base_release(str, map);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCustomEvent");
    }
}
