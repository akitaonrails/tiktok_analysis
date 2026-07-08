package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply;

import X.AnonymousClass0951;
import X.C05YW;
import X.C09IC;
import X.C09IR;
import X.C0I20;
import X.C0I3C;
import X.C0ZDU;
import X.C1370905Yd;
import X.C1559260qg8;
import X.C1710306mr;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C454980Hsm;
import X.C457780HxI;
import X.C459840I1m;
import X.C460830I5h;
import X.C463000IDq;
import X.C463090IDz;
import X.C723600SZy;
import X.C869590Y9l;
import X.EnumC2252401DDy;
import X.InterfaceC0148002o;
import X.InterfaceC454990Hsn;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: loaded from: classes7.dex */
public final class MessageReplyVM extends AssemViewModel<InterfaceC0148002o> implements C0I20 {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C1559260qg8 LLILLL;
    public final AnonymousClass0951 LLILZ;
    public final C2252321DDq LLILZIL;
    public final AnonymousClass0951 LLILZLL;
    public final C2252331DDr LLIZ;
    public final C2252331DDr LLIZLLLIL;

    @Override // X.C0I20
    public final void At1() {
        this.LLIZ.LIZJ(null);
        this.LL.setValue(null);
        this.LLILZIL.setValue(new C460830I5h(0));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(11);
    }

    public MessageReplyVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILLL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
        C463000IDq c463000IDq = new C463000IDq(c2252321DDqLIZ, 29);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C05YW.LIZ.getClass();
        this.LLILZ = C09IC.LJJIJIL(c463000IDq, viewModelScope, C1370905Yd.LIZIZ, null);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new C460830I5h(0));
        this.LLILZIL = c2252321DDqLIZ2;
        this.LLILZLL = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);
        this.LLIZ = c2252331DDrLIZIZ;
        this.LLIZLLLIL = c2252331DDrLIZIZ;
    }

    @Override // X.C0I20
    public final AnonymousClass0951 Sc0() {
        return this.LLILZ;
    }

    @Override // X.C0I20
    public final AnonymousClass0951 cf1() {
        return this.LLILLJJLI;
    }

    @Override // X.C0I20
    public final C2252331DDr mP2() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0I20
    public final void RW0(C869590Y9l c869590Y9l) {
        Object value;
        Object c454980Hsm;
        Object value2;
        C460830I5h c460830I5hLIZ;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
            InterfaceC454990Hsn interfaceC454990Hsn = (InterfaceC454990Hsn) value;
            boolean z = interfaceC454990Hsn instanceof C454980Hsm;
            c454980Hsm = interfaceC454990Hsn;
            if (z) {
                C454980Hsm c454980Hsm2 = (C454980Hsm) interfaceC454990Hsn;
                long msgId = c454980Hsm2.LIZ.getMsgId();
                c454980Hsm = c454980Hsm2;
                if (msgId == c869590Y9l.getMsgId()) {
                    c454980Hsm = new C454980Hsm(c869590Y9l, c454980Hsm2.LIZIZ);
                }
            }
        } while (!c2252321DDq.compareAndSet(value, c454980Hsm));
        C2252321DDq c2252321DDq2 = this.LLILZIL;
        do {
            value2 = c2252321DDq2.getValue();
            c460830I5hLIZ = (C460830I5h) value2;
            C869590Y9l c869590Y9l2 = c460830I5hLIZ.LIZ;
            if (c869590Y9l2 != null && c869590Y9l2.getMsgId() == c869590Y9l.getMsgId()) {
                IMUser iMUserVQ2 = vQ2(c869590Y9l);
                C0ZDU.LIZ.getClass();
                c460830I5hLIZ = C460830I5h.LIZ(c460830I5hLIZ, c869590Y9l, iMUserVQ2, false, C0ZDU.LIZ(c869590Y9l), 20);
            }
        } while (!c2252321DDq2.compareAndSet(value2, c460830I5hLIZ));
    }

    @Override // X.C0I20
    public final void aS0(boolean z) {
        Object value;
        C2252321DDq c2252321DDq = this.LLILZIL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C460830I5h.LIZ((C460830I5h) value, null, null, z, null, 27)));
    }

    @Override // X.C0I20
    public final void h32(C869590Y9l c869590Y9l) {
        wQ2(c869590Y9l);
    }

    @Override // X.C0I20
    public final void og2(C459840I1m c459840I1m) {
        this.LLIZ.LIZJ(C0I3C.THOUGHT_BUBBLE);
        this.LL.setValue(c459840I1m);
        String str = c459840I1m.LIZ.textContent;
        if (str == null) {
            str = "";
        }
        C2252321DDq c2252321DDq = this.LLILZIL;
        c2252321DDq.setValue(C460830I5h.LIZ((C460830I5h) c2252321DDq.getValue(), null, null, true, C1710306mr.LIZIZ(2131850196, c459840I1m.LIZJ, str), 16));
    }

    @Override // X.C0I20
    public final void qH1(C454980Hsm c454980Hsm) {
        this.LLIZ.LIZJ(c454980Hsm.LIZIZ);
        this.LL.setValue(c454980Hsm);
        C2252321DDq c2252321DDq = this.LLILZIL;
        C460830I5h c460830I5h = (C460830I5h) this.LLILZLL.getValue();
        C869590Y9l c869590Y9l = c454980Hsm.LIZ;
        IMUser iMUserVQ2 = vQ2(c869590Y9l);
        C0ZDU c0zdu = C0ZDU.LIZ;
        C869590Y9l c869590Y9l2 = c454980Hsm.LIZ;
        c0zdu.getClass();
        c2252321DDq.setValue(C460830I5h.LIZ(c460830I5h, c869590Y9l, iMUserVQ2, true, C0ZDU.LIZ(c869590Y9l2), 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.contacts.api.model.IMUser vQ2(X.C869590Y9l r8) {
        /*
            r7 = this;
            long r0 = r8.getSender()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r5 = X.C1527905yX.LIZIZ(r0)
            java.lang.String r2 = r8.getConversationId()
            java.lang.String r4 = ""
            if (r2 != 0) goto L15
            r2 = r4
        L15:
            X.0qg8 r0 = r7.LLILLL
            java.lang.Object r0 = r0.getValue()
            X.0HxI r0 = (X.C457780HxI) r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LL
            if (r0 == 0) goto L53
            boolean r1 = r0.isBotChat()
            r0 = 1
            if (r1 != r0) goto L53
        L2a:
            r3 = 0
            if (r0 == 0) goto L6b
            long r1 = X.C0YNP.LJII(r2)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L55
            X.0629 r0 = com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI r0 = X.AnonymousClass0629.LIZ()
            X.05sh r0 = r0.LIZIZ()
            com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo r1 = r0.LIZ(r1)
            com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI r0 = X.AnonymousClass0629.LIZ()
            X.05sh r0 = r0.LIZIZ()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r0.LJI(r1)
            return r0
        L53:
            r0 = 0
            goto L2a
        L55:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            java.lang.String r0 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r1.LIZLLL(r0, r3, r4)
            return r0
        L6b:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            java.lang.String r0 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r1.LIZLLL(r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM.vQ2(X.0Y9l):com.ss.android.ugc.aweme.im.contacts.api.model.IMUser");
    }

    public final void wQ2(C869590Y9l c869590Y9l) {
        Object value;
        C460830I5h c460830I5hLIZ;
        C2252321DDq c2252321DDq = this.LLILZIL;
        do {
            value = c2252321DDq.getValue();
            c460830I5hLIZ = (C460830I5h) value;
            if (c460830I5hLIZ.LIZ != null) {
                c460830I5hLIZ = C460830I5h.LIZ(c460830I5hLIZ, c869590Y9l, null, false, "\u200b", 22);
            }
        } while (!c2252321DDq.compareAndSet(value, c460830I5hLIZ));
    }

    @Override // X.C0I20
    public final void ym0(C869590Y9l c869590Y9l) {
        wQ2(c869590Y9l);
    }
}
