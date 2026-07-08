package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view;

import X.C01GW;
import X.C03H5;
import X.C06TB;
import X.C0I6K;
import X.C0I6Y;
import X.C0QSJ;
import X.C0Z2Z;
import X.C0ZDX;
import X.C0ZTJ;
import X.C0ZW3;
import X.C0ZW5;
import X.C0ZW6;
import X.C0ZW9;
import X.C0ZWB;
import X.C0ZWC;
import X.C0ZWE;
import X.C0ZWG;
import X.C0ZWH;
import X.C0ZWJ;
import X.C0ZWK;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332060klg;
import X.C1332130kln;
import X.C13LE;
import X.C13LP;
import X.C1509305vX;
import X.C1848410yCV;
import X.C1954807lC;
import X.C1BNE;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C438710HIf;
import X.C457780HxI;
import X.C461530I7z;
import X.C462630ICf;
import X.C687700QyG;
import X.C723580SZw;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C893560Z3q;
import X.C896400ZEo;
import X.C900900ZVw;
import X.C900930ZVz;
import X.C901040ZWk;
import X.C902210ZaN;
import X.C902500Zaq;
import X.C912070ZqH;
import X.EnumC454500Hs0;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2187608he;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC900840ZVq;
import X.InterfaceC902220ZaO;
import X.InterfaceC911210Zot;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import avg.f;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.MediaThumbnailViewAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import mf.a;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MediaThumbnailViewAssem<T extends C0ZWC<?>, RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<T>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C1509305vX.LIZ(new AwS558S0100000_14((MediaThumbnailViewAssem) this, 991));
    public C0ZWK LLJL;
    public final C902500Zaq LLJLIL;
    public final C2252321DDq LLJLILLLLZIIL;
    public final C0ZW9 LLJLL;
    public volatile InterfaceC911210Zot LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MediaThumbnailViewAssem.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract void Bp(C462630ICf c462630ICf);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cl8;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public abstract String yp();

    public InterfaceC2187608he zp() {
        return null;
    }

    public final C0I6K up() {
        return (C0I6K) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0ZW9] */
    public MediaThumbnailViewAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C457780HxI.class, null);
        this.LLJLIL = new C902500Zaq();
        this.LLJLILLLLZIIL = C1BNE.LIZ(C0ZWE.INIT);
        this.LLJLL = new C0ZWH(this) { // from class: X.0ZW9
            public final /* synthetic */ MediaThumbnailViewAssem<T, RECEIVER> LIZ;

            {
                this.LIZ = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
            @Override // X.C0ZWH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C0ZWE r8) {
                /*
                    r7 = this;
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.MediaThumbnailViewAssem<T, RECEIVER> r0 = r7.LIZ
                    X.1DDq r1 = r0.LLJLILLLLZIIL
                L4:
                    java.lang.Object r0 = r1.getValue()
                    boolean r0 = r1.compareAndSet(r0, r8)
                    if (r0 == 0) goto L4
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.MediaThumbnailViewAssem<T, RECEIVER> r0 = r7.LIZ
                    r0.sp()
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.MediaThumbnailViewAssem<T, RECEIVER> r6 = r7.LIZ
                    r6.getClass()
                    X.0ZWE r0 = X.C0ZWE.SUCCESS
                    if (r8 != r0) goto L72
                    X.08he r5 = r6.zp()
                    if (r5 == 0) goto L72
                    X.0Zot r1 = r6.LLJLLIL
                    r4 = 0
                    if (r1 != 0) goto L5f
                    monitor-enter(r6)
                    X.0Zot r1 = r6.LLJLLIL     // Catch: java.lang.Throwable -> L5a
                    if (r1 != 0) goto L58
                    X.0QSJ r1 = r6.LLJZ     // Catch: java.lang.Throwable -> L5a
                    if (r1 != 0) goto L4c
                    X.0Q7z r3 = r6.LLJLLL     // Catch: java.lang.Throwable -> L5a
                    if (r3 != 0) goto L3a
                    X.0Q7z r3 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L5a
                    r6.LLJLLL = r3     // Catch: java.lang.Throwable -> L5a
                L3a:
                    r0 = 1
                    java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L5a
                    java.lang.Class<com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope> r1 = com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope.class
                    r0 = 0
                    r2[r0] = r1     // Catch: java.lang.Throwable -> L5a
                    X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L5a
                    r6.LLJZ = r1     // Catch: java.lang.Throwable -> L5a
                    if (r1 != 0) goto L4c
                    r1 = r4
                    goto L54
                L4c:
                    java.lang.Class<X.0Zot> r0 = X.InterfaceC911210Zot.class
                    java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L5a
                    X.0Zot r1 = (X.InterfaceC911210Zot) r1     // Catch: java.lang.Throwable -> L5a
                L54:
                    r6.LLJLLIL = r1     // Catch: java.lang.Throwable -> L5a
                    monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
                    goto L5d
                L58:
                    monitor-exit(r6)
                    goto L5f
                L5a:
                    r0 = move-exception
                    monitor-exit(r6)
                    throw r0
                L5d:
                    if (r1 == 0) goto L72
                L5f:
                    X.0Sb3 r0 = r6.LLJI
                    if (r0 == 0) goto L65
                    java.lang.Object r4 = r0.LL
                L65:
                    X.0I7k r4 = (X.InterfaceC461380I7k) r4
                    X.0Y9l r0 = X.C0I6Y.LIZ(r4)
                    java.lang.String r0 = r0.getUuid()
                    r1.LIZLLL(r0, r5)
                L72:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0ZW9.LIZ(X.0ZWE):void");
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
        C0ZWK c0zwk = new C0ZWK(getContentView().getContext());
        up().addView(c0zwk);
        this.LLJL = c0zwk;
        c0zwk.setReportableComponent(zp());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.bo()
            X.0ZWC r0 = (X.C0ZWC) r0
            X.0ZWB r2 = r0.getImageData()
            X.1DDq r0 = r4.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            X.0ZWE r0 = (X.C0ZWE) r0
            int[] r1 = X.C0ZWD.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L73
            r0 = 2
            if (r1 == r0) goto L66
            r0 = 3
            if (r1 == r0) goto L59
            r0 = 4
            if (r1 != r0) goto L7b
            X.0ZW3 r1 = r2.LIZJ
            boolean r0 = r1 instanceof X.C900930ZVz
            if (r0 == 0) goto L34
            X.0ZVz r1 = (X.C900930ZVz) r1
            if (r1 == 0) goto L34
            java.util.List<X.0ZVq> r1 = r1.LIZLLL
        L32:
            if (r1 != 0) goto L3a
        L34:
            X.0ZVm r0 = X.C900800ZVm.LIZ
            java.util.List r1 = java.util.Collections.singletonList(r0)
        L3a:
            X.0ZWK r3 = r4.LLJL
            if (r3 == 0) goto L7a
            android.widget.FrameLayout r0 = r3.LLILLL
            X.C786410Ut5.LJJJJIZL(r0)
            java.util.Iterator r2 = r1.iterator()
        L47:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r2.next()
            X.0ZVq r1 = (X.InterfaceC900840ZVq) r1
            android.widget.FrameLayout r0 = r3.LLILLL
            r3.LIZ(r0, r1)
            goto L47
        L59:
            X.0ZW3 r1 = r2.LIZJ
            boolean r0 = r1 instanceof X.C900930ZVz
            if (r0 == 0) goto L34
            X.0ZVz r1 = (X.C900930ZVz) r1
            if (r1 == 0) goto L34
            java.util.List<X.0ZVq> r1 = r1.LIZJ
            goto L32
        L66:
            X.0ZW3 r1 = r2.LIZJ
            boolean r0 = r1 instanceof X.C900930ZVz
            if (r0 == 0) goto L34
            X.0ZVz r1 = (X.C900930ZVz) r1
            if (r1 == 0) goto L34
            java.util.List<X.0ZVq> r1 = r1.LIZIZ
            goto L32
        L73:
            X.0ZVm r0 = X.C900800ZVm.LIZ
            java.util.List r1 = java.util.Collections.singletonList(r0)
            goto L32
        L7a:
            return
        L7b:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.MediaThumbnailViewAssem.sp():void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public final void up(T t) {
        String str;
        String strLIZLLL;
        C869590Y9l c869590Y9l = t.LLILII().LIZ.LIZ;
        C901040ZWk extraData = t.getExtraData();
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        C893560Z3q c893560Z3q = C893560Z3q.LIZ;
        Long lValueOf = Long.valueOf(c869590Y9l.getSender());
        String conversationId = c869590Y9l.getConversationId();
        if (extraData.LIZIZ) {
            str = "private_video";
        } else {
            str = "private_image";
        }
        String strLIZIZ = null;
        if (baseTemplateLIZ != null) {
            strLIZLLL = C0ZDX.LIZLLL(baseTemplateLIZ);
        } else {
            strLIZLLL = null;
        }
        boolean zLJI = C896400ZEo.LJI(c869590Y9l);
        boolean zLJIIIZ = C896400ZEo.LJIIIZ(c869590Y9l);
        boolean z = extraData.LIZ;
        if (baseTemplateLIZ != null) {
            strLIZIZ = C0ZTJ.LIZIZ(baseTemplateLIZ);
        }
        C893560Z3q.LIZJ(c893560Z3q, lValueOf, null, conversationId, null, str, strLIZLLL, zLJI, zLJIIIZ, z, C123100dR.LIZ(strLIZIZ), null, null, null, null, 64512);
        op(t.getImageData());
        tp(t.getImageData().LIZLLL);
        Bp(t.LJLIL());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C0I6K c0i6kUp = up();
        View.OnClickListener aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(this, 41);
        if (C1848410yCV.LIZ) {
            aCListenerS149S0100000_14 = new f(aCListenerS149S0100000_14);
        }
        a aVar = new a(aCListenerS149S0100000_14);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0i6kUp);
        }
        c0i6kUp.setOnClickListener(aVar);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 12));
    }

    public final void op(C0ZWB c0zwb) {
        Object obj;
        C902500Zaq c902500Zaq = this.LLJLIL;
        String strYp = yp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Uri uri = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c902500Zaq.LIZJ(C0I6Y.LIZ((InterfaceC461380I7k) obj), strYp);
        C0ZWK c0zwk = this.LLJL;
        if (c0zwk != null) {
            c0zwk.setCallback(this.LLJLL);
        }
        C0ZWK c0zwk2 = this.LLJL;
        if (c0zwk2 != null) {
            C0ZW3 c0zw3 = c0zwb.LIZJ;
            if (c0zw3 instanceof C900930ZVz) {
                C900930ZVz c900930ZVz = (C900930ZVz) c0zw3;
                if (!c900930ZVz.LIZ.LIZIZ.isEmpty()) {
                    C0ZWJ c0zwj = c0zwk2.LL;
                    C0ZW5 c0zw5 = c900930ZVz.LIZ;
                    EnumC454500Hs0 enumC454500Hs0 = EnumC454500Hs0.PRIVATE_PHOTO;
                    c0zwj.getClass();
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(c0zw5.LIZIZ);
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    c1331670kl3LJIIIIZZ.LJJ(c0zwj);
                    c1331670kl3LJIIIIZZ.LIZLLL(enumC454500Hs0.getCallerId());
                    c1331670kl3LJIIIIZZ.LJJJJLI = false;
                    int i = C0ZW6.LIZ[c0zw5.LIZLLL.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c1331670kl3LJIIIIZZ.LJJIJIL(C912070ZqH.LIZIZ.getUiService().LJII(16));
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            c1331670kl3LJIIIIZZ.LJJIFFI = new C1332060klg(25, 3, 0);
                        }
                    }
                    Context context = c0zwj.getContext();
                    String str = (String) C13LP.LJJJLL(c0zw5.LIZIZ);
                    if (str != null) {
                        uri = UriProtector.parse(str);
                    }
                    C1332130kln.LIZ(c1331670kl3LJIIIIZZ, context, uri);
                    C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, C06TB.DEFAULT);
                    C1332130kln.LJFF(c1331670kl3LJIIIIZZ, c0zw5.LIZJ.LIZ, c0zwj.LLJI, false, null, null, null, 60);
                }
            } else if (c0zw3 instanceof C900900ZVw) {
                C786410Ut5.LJJJJIZL(c0zwk2.LLILLL);
                c0zwk2.LL.setImageResource(0);
                InterfaceC902220ZaO.LIZ.getClass();
                c0zwk2.setTag(C902210ZaN.LIZJ, null);
            } else {
                throw new C1954807lC();
            }
        }
        C0I6K c0i6kUp = up();
        ViewGroup.LayoutParams layoutParams = c0i6kUp.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = c0zwb.LIZ;
            layoutParams.height = c0zwb.LIZIZ;
            C786410Ut5.W5(c0i6kUp, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void tp(List<? extends InterfaceC900840ZVq> list) {
        C0ZWK c0zwk = this.LLJL;
        if (c0zwk != null) {
            C786410Ut5.LJJJJIZL(c0zwk.LLILZ);
            Iterator<? extends InterfaceC900840ZVq> it2 = list.iterator();
            while (it2.hasNext()) {
                c0zwk.LIZ(c0zwk.LLILZ, it2.next());
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZWG c0zwg;
        C0ZWC c0zwc = (C0ZWC) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0ZWG) && (c0zwg = (C0ZWG) obj2) != null) {
                    if (c0zwg.LIZIZ) {
                        Bp(c0zwc.LJLIL());
                    }
                    if (c0zwg.LIZ) {
                        op(c0zwc.getImageData());
                    }
                    if (c0zwg.LIZJ) {
                        tp(c0zwc.getImageData().LIZLLL);
                    }
                    if (c0zwg.LIZLLL) {
                        sp();
                    }
                }
            }
            return;
        }
        up(c0zwc);
    }
}
