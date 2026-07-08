package com.bytedance.ies.xelement;

import X.AbstractC2178181AMm;
import X.C1289960jfm;
import X.C1298720jtu;
import X.C1954807lC;
import X.C1ANB;
import X.C1ANG;
import X.C1ANH;
import X.C1AQV;
import X.C1AQX;
import X.C1ARY;
import X.C2178901APg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1782190wTh;
import X.EnumC2178191AMn;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC2178171AMl;
import X.InterfaceC2178211AMp;
import X.InterfaceC2178251AMt;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import j27.s;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxAudio extends UISimpleView<AbstractC2178181AMm> implements C1AQX, InterfaceC2178211AMp, C1ARY {
    public InterfaceC2178251AMt LL;
    public Long LLILLJJLI;

    public LynxAudio() {
        throw null;
    }

    @Override // X.C1ARY
    public final void onAppBackground() {
    }

    @Override // X.C1ARY
    public final void onAppForeground() {
    }

    @Override // X.InterfaceC2178211AMp
    public final void onAttachedToWindow() {
    }

    @Override // X.InterfaceC2178211AMp
    public final void onDetachedFromWindow() {
    }

    @Override // X.C1AQX
    public final void LJFF() {
        C1298720jtu c1298720jtu;
        s sVar = this.mContext;
        if (sVar == null || (c1298720jtu = sVar.LLIZ) == null) {
            return;
        }
        c1298720jtu.LIZIZ(new C1289960jfm(getSign(), "listchange"));
    }

    @Override // X.C1AQX
    public final void LJ(EnumC1782190wTh enumC1782190wTh) {
        C1298720jtu c1298720jtu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxAudio");
        sbLIZ.append("- onLoadStateChanged, state:");
        sbLIZ.append(enumC1782190wTh);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "loadstatechanged");
            c1289960jfm.LIZIZ(enumC1782190wTh.name(), "loadState");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @Override // X.C1AQX
    public final void LJI(String str) {
        C1298720jtu c1298720jtu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCurrentSrcChanged -> ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "srcchange");
            c1289960jfm.LIZIZ(str, "currentSrcID");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @Override // X.C1AQX
    public final void LJIIJJI(C1ANG c1ang) {
        String str;
        C1298720jtu c1298720jtu;
        String strLJIIL;
        InterfaceC2178171AMl player;
        String strLJIIL2;
        InterfaceC2178171AMl player2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaybackStateChanged -> ");
        sbLIZ.append(c1ang.name());
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        switch (C1ANH.LIZ[c1ang.ordinal()]) {
            case 1:
            case 2:
                str = "play";
                break;
            case 3:
                str = "pause";
                break;
            case 4:
                str = "error";
                break;
            case 5:
                str = "stop";
                break;
            case 6:
                str = "ended";
                break;
            default:
                throw new C1954807lC();
        }
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), str);
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            String str2 = "";
            if (abstractC2178181AMm == null || (player2 = abstractC2178181AMm.getPlayer()) == null || (strLJIIL = player2.LJIIL()) == null) {
                strLJIIL = "";
            }
            c1289960jfm.LIZIZ(strLJIIL, "currentSrcID");
            c1289960jfm.LIZIZ(c1ang.getDesc(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c1298720jtu.LIZIZ(c1289960jfm);
            C1289960jfm c1289960jfm2 = new C1289960jfm(getSign(), "statuschange");
            AbstractC2178181AMm abstractC2178181AMm2 = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm2 != null && (player = abstractC2178181AMm2.getPlayer()) != null && (strLJIIL2 = player.LJIIL()) != null) {
                str2 = strLJIIL2;
            }
            c1289960jfm2.LIZIZ(str2, "currentSrcID");
            c1289960jfm2.LIZIZ(c1ang.getDesc(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c1298720jtu.LIZIZ(c1289960jfm2);
        }
    }

    @Override // X.C1AQX
    public final void LJIILIIL(int i) {
        C1298720jtu c1298720jtu;
        String strLJIIL;
        InterfaceC2178171AMl player;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "seek");
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm == null || (player = abstractC2178181AMm.getPlayer()) == null || (strLJIIL = player.LJIIL()) == null) {
                strLJIIL = "";
            }
            c1289960jfm.LIZIZ(strLJIIL, "currentSrcID");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "currentTime");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @Override // X.C1AQX
    public final void LJJIIZ(int i) {
        C1298720jtu c1298720jtu;
        String strLJIIL;
        Long lValueOf;
        InterfaceC2178171AMl player;
        String strLJIIL2;
        InterfaceC2178171AMl player2;
        InterfaceC2178171AMl player3;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "timeupdate");
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            String str = "";
            if (abstractC2178181AMm == null || (player3 = abstractC2178181AMm.getPlayer()) == null || (strLJIIL = player3.LJIIL()) == null) {
                strLJIIL = "";
            }
            c1289960jfm.LIZIZ(strLJIIL, "currentSrcID");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "currentTime");
            c1298720jtu.LIZIZ(c1289960jfm);
            AbstractC2178181AMm abstractC2178181AMm2 = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm2 != null && (player2 = abstractC2178181AMm2.getPlayer()) != null) {
                lValueOf = Long.valueOf(player2.LJIILIIL());
            } else {
                lValueOf = null;
            }
            if (!Intrinsics.LJFF(lValueOf, this.LLILLJJLI)) {
                this.LLILLJJLI = lValueOf;
                C1289960jfm c1289960jfm2 = new C1289960jfm(getSign(), "cachetimeupdate");
                AbstractC2178181AMm abstractC2178181AMm3 = (AbstractC2178181AMm) this.mView;
                if (abstractC2178181AMm3 != null && (player = abstractC2178181AMm3.getPlayer()) != null && (strLJIIL2 = player.LJIIL()) != null) {
                    str = strLJIIL2;
                }
                c1289960jfm2.LIZIZ(str, "currentSrcID");
                c1289960jfm2.LIZIZ(lValueOf, "cacheTime");
                c1298720jtu.LIZIZ(c1289960jfm2);
            }
        }
    }

    @InterfaceC1967107nB
    public final void cacheTime(Callback callback) {
        Long lValueOf;
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxAudio");
        sbLIZ.append(" Getter method: cacheTime");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
                lValueOf = Long.valueOf(player.LJIILIIL());
            } else {
                lValueOf = null;
            }
            javaOnlyMap.put("cacheTime", lValueOf);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        if (context == null) {
            return null;
        }
        AbstractC2178181AMm abstractC2178181AMm = new AbstractC2178181AMm(context) { // from class: X.1AMo
            {
                new LinkedHashMap();
            }
        };
        C1AQV c1aqv = new C1AQV(C786410Ut5.N3(context), this.mContext, getSign());
        c1aqv.LIZIZ = this;
        InterfaceC2178251AMt interfaceC2178251AMt = this.LL;
        if (interfaceC2178251AMt != null) {
            c1aqv.LJIILL(interfaceC2178251AMt);
        }
        abstractC2178181AMm.setPlayer(c1aqv);
        abstractC2178181AMm.setLifecycle(this);
        return abstractC2178181AMm;
    }

    @InterfaceC1967107nB
    public final void currentSrcID(Callback callback) {
        String strLJIIL;
        InterfaceC2178171AMl player;
        C2178901APg.LIZIZ("LynxAudio", "Getter method: -> currentSrcID");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
                strLJIIL = player.LJIIL();
            } else {
                strLJIIL = null;
            }
            javaOnlyMap.put("currentSrcID", strLJIIL);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void currentTime(Callback callback) {
        Integer numValueOf;
        InterfaceC2178171AMl player;
        C2178901APg.LIZIZ("LynxAudio", "Getter method: -> currentTime");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
                numValueOf = Integer.valueOf(player.LIZIZ());
            } else {
                numValueOf = null;
            }
            javaOnlyMap.put("currentTime", numValueOf);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void duration(Callback callback) {
        Integer numValueOf;
        InterfaceC2178171AMl player;
        C2178901APg.LIZIZ("LynxAudio", "Getter method: -> duration");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
                numValueOf = Integer.valueOf(player.getDuration());
            } else {
                numValueOf = null;
            }
            javaOnlyMap.put("duration", numValueOf);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void isAutoPlay(boolean z) {
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAutoPlay -> ");
        sbLIZ.append(z);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.LJIIIZ(z);
        }
    }

    @InterfaceC1967107nB
    public final void pause(Callback callback) {
        InterfaceC2178171AMl player;
        C2178901APg.LIZIZ("LynxAudio", "Control method: --> pause()");
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.pause();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @InterfaceC1967107nB
    public final void play(Callback callback) {
        InterfaceC2178171AMl player;
        C2178901APg.LIZIZ("LynxAudio", "Control method: --> play()");
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.play();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @InterfaceC1967107nB
    public final void playBitrate(Callback callback) {
        Long lValueOf;
        InterfaceC2178171AMl player;
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
                lValueOf = Long.valueOf(player.LJFF());
            } else {
                lValueOf = null;
            }
            javaOnlyMap.put("playBitrate", lValueOf);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1312540kGC(name = "list")
    public final void setList(String str) {
        InterfaceC2178171AMl player;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxAudio");
            sbLIZ.append("- list -> ");
            sbLIZ.append(str);
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
                player.LJIIJJI(str);
            }
        }
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void setLoop(String str) {
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLoop -> ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            EnumC2178191AMn enumC2178191AMn = EnumC2178191AMn.SINGLE;
            if (!Intrinsics.LJFF(str, enumC2178191AMn.getDesc())) {
                enumC2178191AMn = EnumC2178191AMn.LIST;
                if (!Intrinsics.LJFF(str, enumC2178191AMn.getDesc())) {
                    enumC2178191AMn = EnumC2178191AMn.ORDER;
                }
            }
            player.LJIIIIZZ(enumC2178191AMn);
        }
    }

    @InterfaceC1312540kGC(name = "nativeplugins")
    public final void setNativePlugins(String str) {
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNativePlugins -> ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LynxAudio");
        sbLIZ2.append("- nativeplugins -> ");
        sbLIZ2.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.LJIIJ(str);
        }
    }

    @InterfaceC1312540kGC(name = "playerType")
    public final void setPlayerType(String str) {
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlayerType -> ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            C1ANB c1anb = C1ANB.DEFAULT;
            if (!Intrinsics.LJFF(str, c1anb.getDesc()) && (Intrinsics.LJFF(str, C1ANB.SHORT.getDesc()) || Intrinsics.LJFF(str, C1ANB.LIGHT.getDesc()))) {
                c1anb = C1ANB.LIGHT;
            }
            player.LJIILLIIL(c1anb);
        }
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        AbstractC2178181AMm abstractC2178181AMm;
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSrc -> ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() > 0 && (abstractC2178181AMm = (AbstractC2178181AMm) this.mView) != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.setSrc(str);
        }
    }

    @InterfaceC1312540kGC(name = "focusable")
    public final void setSupportFocusable(boolean z) {
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSupportFocusable -> ");
        sbLIZ.append(z);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.LJII(z);
        }
    }

    @InterfaceC1312540kGC(name = "nativecontrol")
    public final void setSupportNativeControl(boolean z) {
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSupportNativeControl -> ");
        sbLIZ.append(z);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.LJIILJJIL(z);
        }
    }

    @InterfaceC1967107nB
    public final void status(Callback callback) {
        String desc;
        InterfaceC2178171AMl player;
        C1ANG c1angLIZJ;
        C2178901APg.LIZIZ("LynxAudio", "Getter method: -> status");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null && (c1angLIZJ = player.LIZJ()) != null) {
                desc = c1angLIZJ.getDesc();
            } else {
                desc = null;
            }
            javaOnlyMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, desc);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @InterfaceC1967107nB
    public final void stop(Callback callback) {
        InterfaceC2178171AMl player;
        C2178901APg.LIZIZ("LynxAudio", "Control method: --> stop()");
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.stop();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public LynxAudio(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILLJJLI = 0L;
    }

    @Override // X.C1AQX
    public final void onError(int i, String str) {
        C1298720jtu c1298720jtu;
        String strLJIIL;
        InterfaceC2178171AMl player;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError -> ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C2178901APg.LIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "error");
            AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
            if (abstractC2178181AMm == null || (player = abstractC2178181AMm.getPlayer()) == null || (strLJIIL = player.LJIIL()) == null) {
                strLJIIL = "";
            }
            c1289960jfm.LIZIZ(strLJIIL, "currentSrcID");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "code");
            if (str == null) {
                str = "";
            }
            c1289960jfm.LIZIZ(str, "msg");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        InterfaceC2178171AMl player;
        int i = readableMap.getInt("currentTime", 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Control method: --> seek(), param is: ");
        sbLIZ.append(i);
        C2178901APg.LIZIZ("LynxAudio", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC2178181AMm abstractC2178181AMm = (AbstractC2178181AMm) this.mView;
        if (abstractC2178181AMm != null && (player = abstractC2178181AMm.getPlayer()) != null) {
            player.LJ(i);
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
