package com.ss.android.ugc.aweme.im.contacts.impl;

import X.C01GW;
import X.C05KE;
import X.C069R;
import X.C069S;
import X.C069T;
import X.C069U;
import X.C06F1;
import X.C13LE;
import X.C1807670x8n;
import X.C1BGS;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC15516065q;
import X.InterfaceC1725106pF;
import X.InterfaceC1908920zm6;
import X.InterfaceC2217461Bqa;
import X.InterfaceC893670Z4b;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;

/* JADX INFO: loaded from: classes3.dex */
public final class IMContactImpl implements IMContactApi {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJII;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C069S());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C069R());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C069U());
    public final C01GW LJ = C452501pT.LIZIZ(new C069T());
    public final C01GW LJFF = C452501pT.LIZIZ(new C05KE());
    public volatile C1BGS LJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMContactImpl.class, "imUserRepo", "getImUserRepo()Lcom/ss/android/ugc/aweme/im/contacts/impl/serviceimpl/IMUserRepository;", 0);
        C13LE.LIZ.getClass();
        LJII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.IMContactApi
    public final InterfaceC1725106pF LIZ() {
        return (InterfaceC1725106pF) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.IMContactApi
    public final C06F1 LIZIZ() {
        return (C06F1) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.IMContactApi
    public final InterfaceC15516065q LIZJ() {
        return (InterfaceC15516065q) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.IMContactApi
    public final InterfaceC893670Z4b LIZLLL() {
        return (InterfaceC893670Z4b) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.IMContactApi
    public final C1BGS LJ() {
        C1BGS c1bgs = this.LJI;
        if (c1bgs == null) {
            synchronized (this) {
                c1bgs = this.LJI;
                if (c1bgs == null) {
                    C1BGS c1bgs2 = (C1BGS) C1807670x8n.LJLIL();
                    this.LJI = c1bgs2;
                    return c1bgs2;
                }
            }
        }
        return c1bgs;
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.IMContactApi
    public final InterfaceC1908920zm6 getImMafService() {
        return (InterfaceC1908920zm6) this.LIZJ.getValue();
    }
}
