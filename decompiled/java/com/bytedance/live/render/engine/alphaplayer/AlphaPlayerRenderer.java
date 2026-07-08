package com.bytedance.live.render.engine.alphaplayer;

import X.AbstractC1140160fmA;
import X.C1138510fjV;
import X.C1140370fmV;
import X.C1140900fnM;
import X.C1140960fnS;
import X.C1141080fne;
import X.C1141160fnm;
import X.C1141820foq;
import X.EnumC1138990fkH;
import X.InterfaceC1138560fja;
import X.InterfaceC1140400fmY;
import X.InterfaceC1140820fnE;
import X.InterfaceC1141380fo8;
import X.InterfaceC2247071CxF;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class AlphaPlayerRenderer implements InterfaceC1141380fo8 {
    @Override // X.InterfaceC1141380fo8
    public boolean support() {
        return true;
    }

    public EnumC1138990fkH getType() {
        return EnumC1138990fkH.ALPHA_PLAYER;
    }

    @Override // X.InterfaceC1141380fo8
    public boolean canRender(AbstractC1140160fmA abstractC1140160fmA) {
        return abstractC1140160fmA instanceof C1140370fmV;
    }

    @Override // X.InterfaceC1141380fo8
    public InterfaceC1140400fmY create(AbstractC1140160fmA abstractC1140160fmA) {
        InterfaceC2247071CxF interfaceC2247071CxF;
        C1138510fjV c1138510fjVLIZ;
        C1141820foq c1141820foqLIZ = null;
        if (!(abstractC1140160fmA instanceof C1140370fmV) || !canRender(abstractC1140160fmA)) {
            return null;
        }
        C1140900fnM c1140900fnM = C1140960fnS.LIZ;
        if (c1140900fnM != null) {
            interfaceC2247071CxF = c1140900fnM.LJFF;
        } else {
            interfaceC2247071CxF = null;
        }
        C1140370fmV c1140370fmV = (C1140370fmV) abstractC1140160fmA;
        Object obj = ((LinkedHashMap) abstractC1140160fmA.LJFF).get(InterfaceC1138560fja.class);
        if (obj == null) {
            obj = null;
        }
        InterfaceC1138560fja interfaceC1138560fja = (InterfaceC1138560fja) obj;
        if (interfaceC1138560fja != null) {
            c1138510fjVLIZ = interfaceC1138560fja.LIZ();
        } else {
            c1138510fjVLIZ = null;
        }
        Object obj2 = ((LinkedHashMap) abstractC1140160fmA.LJFF).get(InterfaceC1140820fnE.class);
        if (obj2 == null) {
            obj2 = null;
        }
        InterfaceC1140820fnE interfaceC1140820fnE = (InterfaceC1140820fnE) obj2;
        if (interfaceC1140820fnE != null) {
            c1141820foqLIZ = interfaceC1140820fnE.LIZ();
        }
        return new C1141080fne(c1140370fmV, interfaceC2247071CxF, new C1141160fnm(c1138510fjVLIZ, c1141820foqLIZ));
    }
}
