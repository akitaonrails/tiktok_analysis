package com.ss.android.ugc.aweme.player.sdk.v3;

import X.AbstractC586270Mz3;
import X.C00UI;
import X.C1474810oTv;
import X.C1479510obV;
import X.C1480000ocI;
import X.C1C7U;
import X.EnumC1473260oRQ;
import X.InterfaceC1471920oPG;
import X.InterfaceC1472010oPP;
import X.InterfaceC1479560oba;
import X.InterfaceC1480020ocK;
import X.InterfaceC1499700p84;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.playerkit.model.PlayerThreadPriorityConfig;
import com.tts.oecverify.BdTuring;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class PlayHandler extends BPEAHandler {
    public final InterfaceC1479560oba LL;
    public volatile int LLILLJJLI;
    public boolean LLILLL;
    public final InterfaceC1480020ocK LLILZ;

    public final void LJ(int i) {
        int i2;
        if (i > 0) {
            int iIntValue = ((Number) C1474810oTv.LLLLLLLLLL.getValue()).intValue();
            if (i < iIntValue) {
                i = iIntValue;
            }
            this.LLILLJJLI = i;
        }
        if (((Boolean) C1474810oTv.LLLLLLZ.getValue()).booleanValue()) {
            i2 = this.LLILLJJLI;
        } else {
            i2 = 0;
        }
        sendEmptyMessageDelayed(12, i2);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("PlayHandler@4dc8.handleMessage");
        InterfaceC1479560oba interfaceC1479560oba = this.LL;
        if (interfaceC1479560oba != null && !this.LLILLL) {
            int i = message.what;
            boolean z = true;
            if (i != 1) {
                if (i != 255) {
                    switch (i) {
                        case 3:
                            interfaceC1479560oba.start();
                            break;
                        case 4:
                            if (HandlerHook.getMessageObj(message.obj) == null) {
                                this.LL.resume();
                            } else {
                                this.LL.LJJLIIIIJ((String) HandlerHook.getMessageObj(message.obj));
                            }
                            break;
                        case 5:
                            interfaceC1479560oba.pause();
                            break;
                        case 6:
                            interfaceC1479560oba.stop();
                            break;
                        case 7:
                            if ((HandlerHook.getMessageObj(message.obj) instanceof Boolean) && ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue()) {
                                if (1 == C1474810oTv.LLILLL()) {
                                    PlayerThreadPriorityConfig playerThreadPriorityConfig = (PlayerThreadPriorityConfig) C1474810oTv.LLLLZLLLI.getValue();
                                    if (playerThreadPriorityConfig != null) {
                                        this.LL.LJLLLLLL(playerThreadPriorityConfig.getReleaseStoryValue());
                                    }
                                } else {
                                    this.LL.LJLLLL(EnumC1473260oRQ.LOW);
                                }
                            }
                            this.LL.release();
                            this.LLILLL = true;
                            InterfaceC1480020ocK interfaceC1480020ocK = this.LLILZ;
                            if (interfaceC1480020ocK != null) {
                                interfaceC1480020ocK.LIZ();
                            }
                            break;
                        case 8:
                            interfaceC1479560oba.LJJLJLI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            Pair pair = (Pair) HandlerHook.getMessageObj(message.obj);
                            if (pair != null) {
                                this.LL.LJIILLIIL(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                            }
                            break;
                        default:
                            switch (i) {
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    interfaceC1479560oba.LJIILL(((Float) HandlerHook.getMessageObj(message.obj)).floatValue());
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    interfaceC1479560oba.LJLLI();
                                    if (((Boolean) C1474810oTv.LLLLLLJ.getValue()).booleanValue()) {
                                        removeMessages(12);
                                    }
                                    sendEmptyMessageDelayed(12, this.LLILLJJLI);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    Pair pair2 = (Pair) HandlerHook.getMessageObj(message.obj);
                                    if (pair2 != null) {
                                        this.LL.LJLJJLL(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                                    }
                                    break;
                                case 14:
                                    interfaceC1479560oba.LJJL((SurfaceHolder) HandlerHook.getMessageObj(message.obj));
                                    break;
                                case 15:
                                    interfaceC1479560oba.setSurface((Surface) HandlerHook.getMessageObj(message.obj));
                                    this.LL.LJJIL((Surface) HandlerHook.getMessageObj(message.obj));
                                    break;
                                case 16:
                                    interfaceC1479560oba.init();
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    if ((HandlerHook.getMessageObj(message.obj) instanceof Boolean) && ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue()) {
                                        if (1 == C1474810oTv.LLILLL()) {
                                            PlayerThreadPriorityConfig playerThreadPriorityConfig2 = (PlayerThreadPriorityConfig) C1474810oTv.LLLLZLLLI.getValue();
                                            if (playerThreadPriorityConfig2 != null) {
                                                this.LL.LJLLLLLL(playerThreadPriorityConfig2.getCleanStoryValue());
                                            }
                                        } else {
                                            this.LL.LJLLLL(EnumC1473260oRQ.LOW);
                                        }
                                    }
                                    this.LL.LJJIL(null);
                                    this.LL.LJJJLZIJ();
                                    if (((Boolean) C1474810oTv.LJLLJ.getValue()).booleanValue()) {
                                        this.LL.setSurface(null);
                                    }
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    int i2 = message.arg1;
                                    if (i2 == 0) {
                                        interfaceC1479560oba.LJJLIIIJJI(message.arg2);
                                    } else if (i2 == 1) {
                                        if (message.arg2 != 1) {
                                            z = false;
                                        }
                                        interfaceC1479560oba.LJJIJLIJ(z);
                                    } else if (i2 == 2) {
                                        interfaceC1479560oba.LJJIJL((InterfaceC1472010oPP) HandlerHook.getMessageObj(message.obj));
                                    } else if (i2 == 3) {
                                        interfaceC1479560oba.LJJJZ(message.arg2, (JSONObject) HandlerHook.getMessageObj(message.obj));
                                    }
                                    break;
                                case 19:
                                    interfaceC1479560oba.LJJJ();
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    interfaceC1479560oba.LJLLILLLL();
                                    break;
                                case 21:
                                    interfaceC1479560oba.setSurface((Surface) HandlerHook.getMessageObj(message.obj));
                                    break;
                                case 22:
                                    int i3 = message.arg1;
                                    if (i3 == 0) {
                                        interfaceC1479560oba.LJJIZ((String) HandlerHook.getMessageObj(message.obj));
                                    } else if (i3 == 2) {
                                        interfaceC1479560oba.LJJLIIIJ((InterfaceC1471920oPG) HandlerHook.getMessageObj(message.obj));
                                    }
                                    break;
                                case 23:
                                    Bundle bundle = (Bundle) HandlerHook.getMessageObj(message.obj);
                                    this.LL.LJLJL(bundle, bundle.getBoolean("crop_param_open", false));
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    Bundle bundle2 = (Bundle) HandlerHook.getMessageObj(message.obj);
                                    this.LL.LJJZ(bundle2.getInt("texture_layout_param", 0), bundle2);
                                    break;
                                case 25:
                                    C00UI c00ui = (C00UI) HandlerHook.getMessageObj(message.obj);
                                    if (c00ui != null) {
                                        this.LL.LJLJJI(c00ui);
                                    }
                                    break;
                                case 26:
                                    interfaceC1479560oba.LJLILLLLZI((InterfaceC1499700p84) HandlerHook.getMessageObj(message.obj));
                                    break;
                                case 27:
                                    this.LL.LJL((Bundle) HandlerHook.getMessageObj(message.obj));
                                    break;
                                case 28:
                                    if (HandlerHook.getMessageObj(message.obj) instanceof Pair) {
                                        Pair pair3 = (Pair) HandlerHook.getMessageObj(message.obj);
                                        this.LL.LJJLIIIJJIZ((String) pair3.first, ((Boolean) pair3.second).booleanValue());
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.LL.LIZIZ((AbstractC586270Mz3) HandlerHook.getMessageObj(message.obj));
                }
            } else {
                interfaceC1479560oba.LJLIL((C1479510obV) HandlerHook.getMessageObj(message.obj));
                if (1 == C1474810oTv.LLILLL()) {
                    PlayerThreadPriorityConfig playerThreadPriorityConfig3 = (PlayerThreadPriorityConfig) C1474810oTv.LLLLZLLLI.getValue();
                    if (playerThreadPriorityConfig3 != null) {
                        if (((C1479510obV) HandlerHook.getMessageObj(message.obj)).LJJI && ((C1479510obV) HandlerHook.getMessageObj(message.obj)).LLIIIILZ) {
                            this.LL.LJLLLLLL(playerThreadPriorityConfig3.getPreprepareStoryValue());
                        } else {
                            this.LL.LJLLLLLL(playerThreadPriorityConfig3.getPrepareStoryValue());
                        }
                    }
                } else if (HandlerHook.getMessageObj(message.obj) != null && ((C1479510obV) HandlerHook.getMessageObj(message.obj)).LLIIIZ) {
                    if (((C1479510obV) HandlerHook.getMessageObj(message.obj)).LJJI && ((C1479510obV) HandlerHook.getMessageObj(message.obj)).LLIIIILZ) {
                        this.LL.LJLLLL(EnumC1473260oRQ.LOW);
                    } else {
                        this.LL.LJLLLL(EnumC1473260oRQ.NORMAL);
                    }
                }
            }
            C1C7U.LIZIZ("PlayHandler@4dc8.handleMessage");
            return;
        }
        C1C7U.LIZIZ("PlayHandler@4dc8.handleMessage");
    }

    public PlayHandler(InterfaceC1480020ocK interfaceC1480020ocK, Looper looper, C1480000ocI c1480000ocI) {
        super(looper);
        int iIntValue = ((Number) C1474810oTv.LLLLLLLLLL.getValue()).intValue();
        this.LLILLJJLI = 300 >= iIntValue ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : iIntValue;
        this.LL = c1480000ocI;
        this.LLILZ = interfaceC1480020ocK;
    }
}
