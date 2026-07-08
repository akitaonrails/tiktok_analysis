package com.ss.android.ugc.aweme.share.improve.handler;

import X.AbstractC1382550m57;
import X.AlertDialogC1377870lxZ;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0SXF;
import X.C123100dR;
import X.C1361670lXR;
import X.C1373440lqQ;
import X.C1373450lqR;
import X.C1373540lqa;
import X.C1373850lr5;
import X.C1374050lrP;
import X.C1374080lrS;
import X.C1374320lrq;
import X.C1374720lsU;
import X.C1375500ltk;
import X.C1375730lu7;
import X.C1379870m0n;
import X.C1380780m2G;
import X.C13LE;
import X.C1554960qZC;
import X.C21169617ss;
import X.C2286608xc;
import X.C23260099m;
import X.C238400w2;
import X.C294850Bh5;
import X.C710930Rud;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import X.InterfaceC1376040luc;
import X.InterfaceC21168717sj;
import Y.ARunnableS29S0400000_21;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemePhotoShareAbilityHandler extends TTShareDefaultHandler<AwemeSharePackage> {
    public final Function1<Boolean, Unit> LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final InterfaceC1371340ln2 LJFF() {
        return new InterfaceC1371340ln2() { // from class: X.0lrO
            @Override // X.InterfaceC1371340ln2
            public final void LIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, C1374170lrb c1374170lrb) {
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
                this.LIZ.LLILLJJLI.invoke(Boolean.TRUE);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LIZ(C1374080lrS c1374080lrS) {
        ShareContentType shareContentType = c1374080lrS.LJ.LIZ;
        if (shareContentType == ShareContentType.LINK) {
            return C123100dR.LIZ(c1374080lrS.LIZ);
        }
        boolean z = false;
        if (shareContentType == ShareContentType.PHOTO) {
            List<String> list = c1374080lrS.LIZIZ;
            if (list == null || list.isEmpty()) {
                z = true;
            }
            return !z;
        }
        if (shareContentType == ShareContentType.LINK_PLUS_PHOTO) {
            if (C123100dR.LIZ(c1374080lrS.LIZ)) {
                return true;
            }
            List<String> list2 = c1374080lrS.LIZIZ;
            if (list2 != null && !list2.isEmpty()) {
                return true;
            }
            return false;
        }
        if (shareContentType != ShareContentType.ILEGAL) {
            return true;
        }
        return false;
    }

    public AwemePhotoShareAbilityHandler(Context context, Function1 function1) {
        super(context);
        this.LLILLJJLI = function1;
        C13LE.LIZ(AwemeSharePackage.class);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = baseSharePackage.itemType;
        int num = ShareContentType.LINK_PLUS_PHOTO.getNum();
        c1373440lqQ.getClass();
        return C1373440lqQ.LIZIZ(interfaceC1369790lkX, str, num);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJI(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = baseSharePackage.itemType;
        String str2 = baseSharePackage.description;
        c1373440lqQ.getClass();
        return C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJII(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
            return C1374720lsU.LIZIZ().getString(2131845764);
        }
        return baseSharePackage.title;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.share.base.model.ShareContentType[] LJIIIIZZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7, X.InterfaceC1369790lkX r8) {
        /*
            r6 = this;
            java.lang.String r2 = r8.key()
            java.lang.String r1 = r7.itemType
            int r0 = r1.hashCode()
            switch(r0) {
                case -439827310: goto L59;
                case 972568762: goto L71;
                case 1662319721: goto L62;
                case 1663411607: goto L7e;
                default: goto Ld;
            }
        Ld:
            java.util.List r0 = X.C1373450lqR.LIZLLL()
            int r5 = X.C1373450lqR.LIZJ(r2, r0)
        L15:
            com.ss.android.ugc.aweme.share.base.model.ShareContentType r2 = com.ss.android.ugc.aweme.share.base.model.ShareContentType.LINK_PLUS_PHOTO
            int r0 = r2.getNum()
            java.lang.String r4 = ""
            java.lang.String r3 = "share_form"
            if (r5 != r0) goto L46
            android.os.Bundle r1 = r7.extras
            java.util.Map<com.ss.android.ugc.aweme.share.base.model.ShareContentType, java.lang.String> r0 = X.C1373990lrJ.LIZ
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2e
            r4 = r0
        L2e:
            X.C786410Ut5.LJJJI(r3, r4, r1)
        L31:
            r0 = 1
            com.ss.android.ugc.aweme.share.base.model.ShareContentType[] r2 = new com.ss.android.ugc.aweme.share.base.model.ShareContentType[r0]
            java.util.Map<java.lang.Integer, com.ss.android.ugc.aweme.share.base.model.ShareContentType> r1 = X.C1373990lrJ.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L42
            com.ss.android.ugc.aweme.share.base.model.ShareContentType r1 = com.ss.android.ugc.aweme.share.base.model.ShareContentType.ILEGAL
        L42:
            r0 = 0
            r2[r0] = r1
            return r2
        L46:
            android.os.Bundle r2 = r7.extras
            java.util.Map<com.ss.android.ugc.aweme.share.base.model.ShareContentType, java.lang.String> r1 = X.C1373990lrJ.LIZ
            com.ss.android.ugc.aweme.share.base.model.ShareContentType r0 = com.ss.android.ugc.aweme.share.base.model.ShareContentType.PHOTO
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L55
            r4 = r0
        L55:
            X.C786410Ut5.LJJJI(r3, r4, r2)
            goto L31
        L59:
            java.lang.String r0 = "now_invite"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6a
            goto Ld
        L62:
            java.lang.String r0 = "now_post"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
        L6a:
            X.0lqN r0 = X.EnumC1373410lqN.SHARE_NOW
            int r5 = X.C1373450lqR.LIZ(r2, r0)
            goto L15
        L71:
            java.lang.String r0 = "aweme_photo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            int r5 = X.C1373450lqR.LIZIZ(r2)
            goto L15
        L7e:
            java.lang.String r0 = "now_post_memory"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.0lqN r0 = X.EnumC1373410lqN.SHARE_NOW_MEMORY
            int r5 = X.C1373450lqR.LIZ(r2, r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoShareAbilityHandler.LJIIIIZZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.0lkX):com.ss.android.ugc.aweme.share.base.model.ShareContentType[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1369790lkX r9, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoShareAbilityHandler.LJIIIZ(X.0lkX, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0lsk] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIJ(final Context context, BaseSharePackage baseSharePackage, final InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        String string;
        UrlModel originCover;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final AwemeSharePackage awemeSharePackage = (AwemeSharePackage) baseSharePackage;
        final Aweme awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        final C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = System.currentTimeMillis();
        String str = "";
        if (C710930Rud.LJII(awemeSharePackage.LJJIFFI())) {
            InterfaceC21168717sj interfaceC21168717sj = new InterfaceC21168717sj() { // from class: X.0lrI
                @Override // X.InterfaceC21168717sj
                public final void onProgress(int i) {
                }

                @Override // X.InterfaceC21168717sj
                public final void onStart() {
                }

                @Override // X.InterfaceC21168717sj
                public final void onCancel() {
                    c238400w22.element = System.currentTimeMillis();
                    awemeSharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                    this.LLILLJJLI.invoke(Boolean.FALSE);
                    C1376270luz c1376270luz = C1376270luz.LIZ;
                    c1376270luz.getClass();
                    C1376270luz.LIZJ = false;
                    c1376270luz.getClass();
                    C1376270luz.LIZLLL = false;
                }

                @Override // X.InterfaceC21168717sj
                public final void onFailed() {
                    c238400w22.element = System.currentTimeMillis();
                    awemeSharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                    this.LLILLJJLI.invoke(Boolean.FALSE);
                }

                @Override // X.InterfaceC21168717sj
                public final void onSuccess(String str2) {
                    c238400w22.element = System.currentTimeMillis();
                    awemeSharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                    InterfaceC1364105Vn<String[]> interfaceC1364105Vn2 = c23260099m;
                    String[] strArr = new String[1];
                    if (str2 == null) {
                        str2 = "";
                    }
                    strArr[0] = str2;
                    C189200o6.m2constructorimpl(strArr);
                    interfaceC1364105Vn2.resumeWith(strArr);
                }
            };
            Bundle bundle = awemeSharePackage.extras;
            String string2 = bundle.getString("enter_from");
            if (string2 != null) {
                str = string2;
            }
            int i = bundle.getInt("page_type");
            String str2 = str;
            C1554960qZC.LIZ(GScope.LL, new C1380780m2G(awemeLJJIFFI, str2, "download_to_share", C0SXF.LJJIII(context, awemeLJJIFFI), UUID.randomUUID().toString(), null, null, 401), C1380780m2G.class, "Download");
            C1379870m0n c1379870m0n = C1379870m0n.LIZ;
            String strKey = interfaceC1369790lkX.key();
            c1379870m0n.getClass();
            AbstractC1382550m57 abstractC1382550m57LIZ = C1379870m0n.LIZ(context, interfaceC21168717sj, awemeLJJIFFI, str, "download_to_share", false, "share_download", i, strKey, "", 0, false);
            C21169617ss.LIZ.getClass();
            C21169617ss.LIZIZ(abstractC1382550m57LIZ);
        } else {
            C1373850lr5.LIZ.getClass();
            if (C294850Bh5.LIZ()) {
                string = context.getString(2131825054);
            } else {
                string = context.getResources().getString(2131846827);
            }
            final AlertDialogC1377870lxZ alertDialogC1377870lxZLIZLLL = AlertDialogC1377870lxZ.LIZLLL(context, string);
            C1374050lrP value = C1373850lr5.LIZIZ.getValue();
            value.LIZIZ = true;
            value.LIZ = C1373540lqa.LJII(awemeLJJIFFI, interfaceC1369790lkX.key());
            if (!C1373450lqR.LJ(awemeLJJIFFI)) {
                value.LIZLLL = true;
                Video video = awemeLJJIFFI.getVideo();
                if (video != null) {
                    if (C1361670lXR.LIZIZ(awemeLJJIFFI.getVideo().getCover())) {
                        originCover = video.getCover();
                    } else {
                        originCover = video.getOriginCover();
                    }
                } else {
                    originCover = null;
                }
                value.LIZJ = originCover;
            }
            C1374320lrq c1374320lrqLIZ = value.LIZ();
            Bundle bundle2 = awemeSharePackage.extras;
            if (bundle2 != null) {
                C786410Ut5.LJJJI("download_method", "download_to_share", bundle2);
            }
            C1375730lu7 c1375730lu7 = C1375730lu7.LIZIZ;
            c1375730lu7.LJFF(awemeSharePackage);
            C786410Ut5.LJLIIL(20000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS29S0400000_21(awemeSharePackage, context, awemeLJJIFFI, alertDialogC1377870lxZLIZLLL, 0));
            Activity activityLJII = C1375500ltk.LJII(context);
            if (activityLJII != null) {
                Integer numLJ = C2286608xc.LJ(awemeSharePackage.extras.getInt("page_type"));
                ?? r15 = new InterfaceC1376040luc() { // from class: X.0lsk
                    @Override // X.InterfaceC1376040luc
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1376040luc
                    public final void LIZ() {
                        c238400w22.element = System.currentTimeMillis();
                        awemeSharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                        this.LLILLJJLI.invoke(Boolean.FALSE);
                    }

                    @Override // X.InterfaceC1376040luc
                    public final void onCancel() {
                        c238400w22.element = System.currentTimeMillis();
                        awemeSharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                        this.LLILLJJLI.invoke(Boolean.FALSE);
                    }

                    @Override // X.InterfaceC1376040luc
                    public final void onProgress(int i2) {
                        C1373540lqa c1373540lqa = C1373850lr5.LIZ;
                        AlertDialogC1377870lxZ alertDialogC1377870lxZ = alertDialogC1377870lxZLIZLLL;
                        c1373540lqa.getClass();
                        if (alertDialogC1377870lxZ.isShowing()) {
                            alertDialogC1377870lxZ.LIZJ(i2);
                        }
                    }

                    @Override // X.InterfaceC1376040luc
                    public final void LIZJ(String str3, int i2, String str4, C1260870iur<?, ?> c1260870iur, Pair<Integer, String> pair) {
                        c238400w22.element = System.currentTimeMillis();
                        awemeSharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                        C1373540lqa c1373540lqa = C1373850lr5.LIZ;
                        Context context2 = context;
                        AlertDialogC1377870lxZ alertDialogC1377870lxZ = alertDialogC1377870lxZLIZLLL;
                        c1373540lqa.getClass();
                        C1373540lqa.LIZ(context2, alertDialogC1377870lxZ);
                        Aweme aweme = awemeLJJIFFI;
                        String string3 = awemeSharePackage.extras.getString("enter_from");
                        if (string3 == null) {
                            string3 = "";
                        }
                        C1357300lQO.LIZIZ(aweme, string3, interfaceC1369790lkX.key(), "short", null, i2, 1);
                        Aweme aweme2 = awemeLJJIFFI;
                        C1376270luz.LIZ.getClass();
                        C1379790m0f.LIZIZ(1, aweme2, C1376270luz.LJIIIIZZ, str4);
                        C1374950lsr.LIZ(awemeLJJIFFI.getAid(), Integer.valueOf(awemeLJJIFFI.getAwemeType()), c1260870iur, pair);
                        InterfaceC1364105Vn<String[]> interfaceC1364105Vn2 = c23260099m;
                        String[] strArr = new String[1];
                        if (str3 == null) {
                            str3 = "";
                        }
                        strArr[0] = str3;
                        C189200o6.m2constructorimpl(strArr);
                        interfaceC1364105Vn2.resumeWith(strArr);
                    }
                };
                String string3 = awemeSharePackage.extras.getString("enter_from");
                if (string3 != null) {
                    str = string3;
                }
                c1375730lu7.LIZIZ(activityLJII, numLJ, awemeLJJIFFI, r15, c1374320lrqLIZ, str);
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIILIIL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }
}
