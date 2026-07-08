package com.bytedance.live.render.engine.sticker;

import X.AbstractC1140160fmA;
import X.C1137660fi8;
import X.C1140530fml;
import X.C1140850fnH;
import X.C1140900fnM;
import X.C1140960fnS;
import X.C1140990fnV;
import X.C1141130fnj;
import X.C2043807zY;
import X.EnumC1138990fkH;
import X.InterfaceC1140400fmY;
import X.InterfaceC1140810fnD;
import X.InterfaceC1141190fnp;
import X.InterfaceC1141380fo8;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class StickerRenderer implements InterfaceC1141380fo8 {
    @Override // X.InterfaceC1141380fo8
    public boolean support() {
        return true;
    }

    public EnumC1138990fkH getType() {
        return EnumC1138990fkH.STICKER;
    }

    @Override // X.InterfaceC1141380fo8
    public boolean canRender(AbstractC1140160fmA abstractC1140160fmA) {
        return abstractC1140160fmA instanceof C1140530fml;
    }

    @Override // X.InterfaceC1141380fo8
    public InterfaceC1140400fmY create(AbstractC1140160fmA abstractC1140160fmA) {
        InterfaceC1140810fnD interfaceC1140810fnD;
        C1137660fi8 c1137660fi8LIZJ;
        if (!(abstractC1140160fmA instanceof C1140530fml) || !canRender(abstractC1140160fmA)) {
            return null;
        }
        C1140900fnM c1140900fnM = C1140960fnS.LIZ;
        if (c1140900fnM != null && (interfaceC1140810fnD = c1140900fnM.LJIIIZ) != null && (c1137660fi8LIZJ = interfaceC1140810fnD.LIZJ()) != null) {
            final C1141130fnj c1141130fnj = new C1141130fnj(c1137660fi8LIZJ, ((C1140530fml) abstractC1140160fmA).LJIIJ, abstractC1140160fmA.LJI, new AwS596S0100000_17(abstractC1140160fmA, 255));
            final C1140850fnH c1140850fnH = abstractC1140160fmA.LIZ;
            return new InterfaceC1140400fmY(c1141130fnj, c1140850fnH) { // from class: X.0fni
                public final C1141130fnj LL;
                public final InterfaceC1140870fnJ LLILLJJLI;

                @Override // X.InterfaceC1140400fmY
                public final void LIZIZ(JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1140400fmY
                public final void LIZJ() {
                    C1141130fnj c1141130fnj2 = this.LL;
                    if (c1141130fnj2.LLILZLL == null) {
                        C1141240fnu.LIZLLL("StickerRenderManager_ttlive_gift_render", "triggerComplete ignored: already finished");
                        return;
                    }
                    C1141240fnu.LIZLLL("StickerRenderManager_ttlive_gift_render", "triggerComplete (external graceful end)");
                    c1141130fnj2.LLILZIL.removeMessages(140001);
                    BPEAHandler bPEAHandler = c1141130fnj2.LLILZIL;
                    C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(140001));
                }

                @Override // X.InterfaceC1140400fmY
                public final void start() {
                    C1141130fnj c1141130fnj2 = this.LL;
                    InterfaceC1140870fnJ interfaceC1140870fnJ = this.LLILLJJLI;
                    if (interfaceC1140870fnJ != null) {
                        c1141130fnj2.getClass();
                        interfaceC1140870fnJ.LIZJ(EnumC1138990fkH.STICKER);
                    }
                    LiveEffect liveEffect = c1141130fnj2.LLILLJJLI;
                    if (liveEffect == null) {
                        if (interfaceC1140870fnJ != null) {
                            interfaceC1140870fnJ.LJI(EnumC1138990fkH.STICKER, new C1141050fnb(-10, "liveEffect is null", null));
                            return;
                        }
                        return;
                    }
                    String filePath = liveEffect.getFilePath();
                    if (filePath.length() == 0) {
                        if (interfaceC1140870fnJ != null) {
                            interfaceC1140870fnJ.LJI(EnumC1138990fkH.STICKER, new C1141050fnb(-16, "filePath is empty", null));
                            return;
                        }
                        return;
                    }
                    if (!new C0VSJ(filePath).exists()) {
                        if (interfaceC1140870fnJ != null) {
                            interfaceC1140870fnJ.LJI(EnumC1138990fkH.STICKER, new C1141050fnb(-16, "file not exist", null));
                            return;
                        }
                        return;
                    }
                    c1141130fnj2.LLIZ = 0;
                    c1141130fnj2.LLILZLL = c1141130fnj2.LLILLJJLI;
                    c1141130fnj2.LLJI = interfaceC1140870fnJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start to play sticker gift for: ");
                    sbLIZ.append(c1141130fnj2.LLILLJJLI.getDuration());
                    C1141240fnu.LIZLLL("StickerRenderManager_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
                    C2043807zY.LIZIZ(InterfaceC1137750fiH.class, C1141110fnh.LL);
                    ConcurrentHashSet<C1141180fno> concurrentHashSet = C1141110fnh.LLILLJJLI;
                    Iterator<C1141180fno> it2 = concurrentHashSet.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1141180fno next = it2.next();
                        if (Intrinsics.LJFF(next.LL.get(), c1141130fnj2)) {
                            if (next == null) {
                                break;
                            }
                        }
                    }
                    concurrentHashSet.add(new C1141180fno(c1141130fnj2));
                    InterfaceC1140870fnJ interfaceC1140870fnJ2 = c1141130fnj2.LLJI;
                    if (interfaceC1140870fnJ2 != null) {
                        interfaceC1140870fnJ2.LJFF(EnumC1138990fkH.STICKER);
                    }
                    InterfaceC1140870fnJ interfaceC1140870fnJ3 = c1141130fnj2.LLJI;
                    if (interfaceC1140870fnJ3 != null) {
                        interfaceC1140870fnJ3.LJII(EnumC1138990fkH.STICKER);
                    }
                    c1141130fnj2.LL.LIZIZ(c1141130fnj2.LLILLJJLI);
                    long duration = c1141130fnj2.LLILLJJLI.getDuration();
                    BPEAHandler bPEAHandler = c1141130fnj2.LLILZIL;
                    C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(140001), duration);
                }

                @Override // X.InterfaceC1140400fmY
                public final void stop() {
                    C1141130fnj c1141130fnj2 = this.LL;
                    c1141130fnj2.getClass();
                    C1141240fnu.LIZIZ("StickerRenderManager_ttlive_gift_render", "cancel");
                    c1141130fnj2.LLIZ = 200;
                    c1141130fnj2.LLILZIL.removeMessages(140001);
                    BPEAHandler bPEAHandler = c1141130fnj2.LLILZIL;
                    C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(140001));
                }

                @Override // X.InterfaceC1140400fmY
                public final EnumC1138990fkH LIZ() {
                    return EnumC1138990fkH.STICKER;
                }

                {
                    this.LL = c1141130fnj;
                    this.LLILLJJLI = c1140850fnH;
                }
            };
        }
        InterfaceC1141190fnp interfaceC1141190fnp = (InterfaceC1141190fnp) C2043807zY.LIZ(InterfaceC1141190fnp.class);
        if (interfaceC1141190fnp != null) {
            interfaceC1141190fnp.ensureNotReachHere(new C1140990fnV(), "live_sticker_gift_create_without_composer");
        }
        return null;
    }
}
