package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC1375550ltp;
import X.AbstractC1376120luk;
import X.AbstractC1387200mCc;
import X.AbstractC19483511Kn;
import X.C01GW;
import X.C08YU;
import X.C093100Wr;
import X.C093200Ws;
import X.C09JN;
import X.C0C64;
import X.C0M7Y;
import X.C11NJ;
import X.C11S5;
import X.C123100dR;
import X.C1370370llT;
import X.C1370940lmO;
import X.C1370990lmT;
import X.C1371430lnB;
import X.C1373440lqQ;
import X.C1373540lqa;
import X.C1373560lqc;
import X.C1373680lqo;
import X.C1373840lr4;
import X.C1373850lr5;
import X.C1374340lrs;
import X.C1374350lrt;
import X.C1374410lrz;
import X.C1374420ls0;
import X.C1374430ls1;
import X.C1374500ls8;
import X.C1374510ls9;
import X.C1374520lsA;
import X.C1374560lsE;
import X.C1374720lsU;
import X.C1374740lsW;
import X.C1374750lsX;
import X.C1374870lsj;
import X.C1375500ltk;
import X.C1375860luK;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1609006Rs;
import X.C1701940uOG;
import X.C1906580ziK;
import X.C20684815ws;
import X.C2344009Gk;
import X.C262450AQh;
import X.C452501pT;
import X.C621180OYa;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1365040lcs;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import X.InterfaceC1374600lsI;
import X.InterfaceC1487280oo2;
import Y.ACallableS410S0100000_2;
import Y.AfS152S0200000_16;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS144S0201000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeSharePackage extends SharePackage {
    public Aweme aweme;
    public InterfaceC1365040lcs interceptChannelClick;
    public final C01GW urlShorterViewModel$delegate;
    public static final C1375860luK Companion = new C1375860luK();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZJ() {
        C1609006Rs.LIZ.getClass();
        return !C1609006Rs.LIZJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> LJIJI() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.LJIJI():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[PHI: r1
      0x0021: PHI (r1v2 java.lang.Integer) = (r1v1 java.lang.Integer), (r1v4 java.lang.Integer) binds: [B:16:0x0046, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJ() {
        /*
            r4 = this;
            java.lang.String r3 = r4.url
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJJIFFI()
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L36
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r0)
            if (r0 != r2) goto L36
            X.0luZ r0 = X.C1376010luZ.LIZ
            r0.getClass()
            int r0 = X.C1376010luZ.LJIJJLI
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < 0) goto L49
        L21:
            int r2 = r1.intValue()
            X.0XI4 r1 = new X.0XI4
            r1.<init>(r3)
            java.lang.String r0 = "ug_photo_idx"
            r1.LIZIZ(r2, r0)
            java.lang.String r0 = r1.LJFF()
            if (r0 == 0) goto L49
            return r0
        L36:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJJIFFI()
            if (r0 == 0) goto L49
            boolean r0 = X.C710930Rud.LJII(r0)
            if (r0 != r2) goto L49
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L49
            goto L21
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.LJJ():java.lang.String");
    }

    public final Aweme LJJIFFI() {
        Aweme aweme = this.aweme;
        if (aweme != null) {
            return aweme;
        }
        return null;
    }

    public final C1374740lsW LJJII() {
        return (C1374740lsW) this.urlShorterViewModel$delegate.getValue();
    }

    public AwemeSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.urlShorterViewModel$delegate = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(327));
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX) {
        if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy") || !Intrinsics.LJFF(this.extras.getString("panel_source", ""), "share_panel") || !C0C64.LJIILLIIL().LJIIIZ(31744, "copylink_share_disable_dismiss_panel", true, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJI(Context context, InterfaceC1369790lkX interfaceC1369790lkX) {
        InterfaceC1365040lcs interfaceC1365040lcs = this.interceptChannelClick;
        if (interfaceC1365040lcs != null && interfaceC1365040lcs.LIZ(context, interfaceC1369790lkX)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJIIJJI(InterfaceC1370310llN interfaceC1370310llN, Context context) {
        if (Intrinsics.LJFF(interfaceC1370310llN.key(), "download")) {
            C844470XAv.LIZ.getClass();
            if (C786410Ut5.y2(C844470XAv.LIZ(), null) != null || C1375500ltk.LJI(context)) {
                return false;
            }
            C1374720lsU.LJIIIIZZ(context, TokenCert.Companion.with("bpea-request_intercept_download_aweme_storage_permission"), null, null, null);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIJ(final InterfaceC1369790lkX interfaceC1369790lkX, final Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        int iIndexOf;
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = this.itemType;
        String str2 = this.description;
        c1373440lqQ.getClass();
        final String strLIZ = C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
        String strKey = interfaceC1369790lkX.key();
        C1374740lsW c1374740lsWLJJII = LJJII();
        if (C093100Wr.LIZ() && c1374740lsWLJJII.LIZJ.contains(strKey)) {
            iIndexOf = c1374740lsWLJJII.LIZJ.indexOf(strKey);
        } else {
            iIndexOf = -1;
        }
        boolean zLIZ = C093100Wr.LIZ();
        String str3 = (String) C093100Wr.LIZ.getValue();
        String strValueOf = String.valueOf(C093200Ws.LIZ.getValue());
        if (C123100dR.LIZ(strValueOf) && C123100dR.LIZ(str3) && !Intrinsics.LJFF(str3, "pre_load_all")) {
            C786410Ut5.LJJJI("share_crowds", strValueOf, this.extras);
        }
        if (C123100dR.LIZ(str3)) {
            C786410Ut5.LJJJI("pre_load_crowd_name", str3, this.extras);
        }
        C1609006Rs.LIZ.getClass();
        if (C1609006Rs.LIZJ(this)) {
            final String strLJJ = LJJ();
            final String str4 = this.itemType;
            final C1370990lmT c1370990lmT = new C1370990lmT(this);
            AwS387S0200000_21 awS387S0200000_21 = new AwS387S0200000_21(this, (AwemeSharePackage) function2, (Function2<? super AbstractC1375550ltp, ? super Boolean, Unit>) 35);
            ((C11NJ) LJJII().LIZ.getValue()).LIZ(AbstractC19483511Kn.LJIIJJI(new ACallableS410S0100000_2(this, 1)).LJIJJ(C11S5.LIZ()).LJIIJ(new InterfaceC1487280oo2() { // from class: X.0iXv
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    GroupInviteInfoModel groupInviteInfoModel = (GroupInviteInfoModel) obj;
                    String inviteId = groupInviteInfoModel.getInviteId();
                    if (inviteId != null && inviteId.length() != 0 && groupInviteInfoModel.getInviteError() == null) {
                        C1609006Rs c1609006Rs = C1609006Rs.LIZ;
                        String str5 = strLJJ;
                        String inviteId2 = groupInviteInfoModel.getInviteId();
                        if (inviteId2 == null) {
                            inviteId2 = "";
                        }
                        c1609006Rs.getClass();
                        C0XI4 c0xi4 = new C0XI4(str5);
                        if (C703302op.LIZ(inviteId2)) {
                            c0xi4.LJ("group_invite_id", inviteId2);
                        }
                        return C1374720lsU.LJ(c0xi4.LJFF(), str4, interfaceC1369790lkX.key(), this, 4);
                    }
                    return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0idZ
                        @Override // X.InterfaceC1254030ijp
                        public final void LIZ(C11KY c11ky) {
                            c11ky.onError(new Throwable("invite id is empty"));
                        }
                    });
                }
            }).LJIIJ(new InterfaceC1487280oo2() { // from class: X.0lmi
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    String str5 = (String) obj;
                    if (!c1370990lmT.invoke(str5).booleanValue()) {
                        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0Xag
                            @Override // X.InterfaceC1254030ijp
                            public final void LIZ(C11KY c11ky) {
                                c11ky.onError(new Throwable("share url is illegal"));
                            }
                        });
                    }
                    final String strLIZ2 = C1374720lsU.LIZ(this.extras.getBundle("short_link_params"), str5);
                    if (strLIZ2 == null) {
                        strLIZ2 = "";
                    }
                    C786410Ut5.LJJJI("share_url", strLIZ2, this.extras);
                    this.extras.putInt("is_preload", 0);
                    final SharePackage sharePackage = this;
                    final InterfaceC1369790lkX interfaceC1369790lkX2 = interfaceC1369790lkX;
                    return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmj
                        @Override // X.InterfaceC1254030ijp
                        public final void LIZ(C11KY c11ky) {
                            C1609006Rs c1609006Rs = C1609006Rs.LIZ;
                            SharePackage sharePackage2 = sharePackage;
                            String str6 = strLIZ2;
                            String strKey2 = interfaceC1369790lkX2.key();
                            c1609006Rs.getClass();
                            c11ky.onSuccess(C1609006Rs.LIZ(sharePackage2, str6, strKey2));
                        }
                    });
                }
            }).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new AfS152S0200000_16(this, awS387S0200000_21, 0), new AfS152S0200000_16(this, awS387S0200000_21, 1)));
            return;
        }
        if (zLIZ && iIndexOf >= 0 && iIndexOf < LJJII().LIZJ.size()) {
            if (!LJJII().LIZLLL.isEmpty()) {
                LJJI(LJJII().LIZLLL, interfaceC1369790lkX, strLIZ, iIndexOf, function2);
                return;
            }
            if (((Boolean) C262450AQh.LIZ.getValue()).booleanValue()) {
                final int i = iIndexOf;
                ((C11NJ) LJJII().LIZ.getValue()).LIZ(LJJII().LIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0lrw
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("AwemeSharePackage@5a97.selectContentAsync$3");
                        this.LL.LJJI(((C1374630lsL) obj).LIZ, interfaceC1369790lkX, strLIZ, i, function2);
                        C1C7U.LIZIZ("AwemeSharePackage@5a97.selectContentAsync$3");
                    }
                }));
                return;
            } else {
                String strLJJ2 = LJJ();
                C1375860luK c1375860luK = Companion;
                String str5 = this.itemType;
                c1375860luK.getClass();
                C1375860luK.LIZ(strLJJ2, str5, interfaceC1369790lkX, strLIZ, this, function2);
                return;
            }
        }
        String strLJJ3 = LJJ();
        C1375860luK c1375860luK2 = Companion;
        String str6 = this.itemType;
        c1375860luK2.getClass();
        C1375860luK.LIZ(strLJJ3, str6, interfaceC1369790lkX, strLIZ, this, function2);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIL(Context context, InterfaceC1370310llN interfaceC1370310llN, AwS144S0201000_21 awS144S0201000_21) {
        String str = "download";
        if (Intrinsics.LJFF(interfaceC1370310llN.key(), "download") || Intrinsics.LJFF(interfaceC1370310llN.key(), "save") || Intrinsics.LJFF(interfaceC1370310llN.key(), "gif")) {
            String strKey = interfaceC1370310llN.key();
            if (!Intrinsics.LJFF(strKey, "download") && !Intrinsics.LJFF(strKey, "save")) {
                str = strKey;
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", str, bundle);
            IShareWarningInfoService iShareWarningInfoServiceLJJIFFI = ComplianceServiceProvider.LJJIFFI();
            if (iShareWarningInfoServiceLJJIFFI != null && iShareWarningInfoServiceLJJIFFI.LIZIZ(context, LJJIFFI(), bundle, awS144S0201000_21)) {
                return;
            }
        }
        awS144S0201000_21.invoke();
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        String strKey;
        String strKey2;
        AwemeStatus statusSafety;
        Aweme awemeLJJIFFI;
        AwemeStatus statusSafety2;
        Aweme awemeLJJIFFI2 = LJJIFFI();
        if (awemeLJJIFFI2 != null && (statusSafety = AwemeExtKt.getStatusSafety(awemeLJJIFFI2)) != null && statusSafety.isInReviewing() && (awemeLJJIFFI = LJJIFFI()) != null && (statusSafety2 = AwemeExtKt.getStatusSafety(awemeLJJIFFI)) != null && statusSafety2.isSelfSee()) {
            if (view != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131850553);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        if (interfaceC1369790lkX == null || (strKey = interfaceC1369790lkX.key()) == null) {
            strKey = "send_to";
        }
        C786410Ut5.LJJJI("enter_from", strKey, bundle);
        if (interfaceC1369790lkX != null) {
            strKey2 = interfaceC1369790lkX.key();
        } else {
            strKey2 = null;
        }
        C786410Ut5.LJJJI("channel_key", strKey2, bundle);
        IShareWarningInfoService iShareWarningInfoServiceLJJIFFI = ComplianceServiceProvider.LJJIFFI();
        if (iShareWarningInfoServiceLJJIFFI != null && iShareWarningInfoServiceLJJIFFI.LIZIZ(context, LJJIFFI(), bundle, function0)) {
            return;
        }
        IShareWarningInfoService iShareWarningInfoServiceLJJIFFI2 = ComplianceServiceProvider.LJJIFFI();
        if (iShareWarningInfoServiceLJJIFFI2 != null && iShareWarningInfoServiceLJJIFFI2.LIZJ(context, LJJIFFI(), bundle, function0)) {
            return;
        }
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(final InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        InterfaceC1374600lsI c1373560lqc;
        ACLCommonShare aCLCommonShareLJII;
        ShareExtService shareExtService = C621180OYa.LIZIZ;
        String strKey = interfaceC1369790lkX.key();
        C08YU c08yu = C08YU.LIZ;
        Aweme awemeLJJIFFI = LJJIFFI();
        String str = "others_video_share_list";
        if (awemeLJJIFFI != null) {
            C1374870lsj.LIZ.getClass();
            if (C1374870lsj.LIZJ(awemeLJJIFFI)) {
                str = "self_video_share_list";
            }
        }
        shareExtService.LJJLI(0, strKey, str);
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJIILJJIL(interfaceC1369790lkX);
        if (this.aweme == null) {
            return false;
        }
        if ((Intrinsics.LJFF(interfaceC1369790lkX.key(), "chat_merge") || (interfaceC1369790lkX instanceof QrCodeChannel)) && !C621180OYa.LIZIZ.LJJJZ(context, LJJIFFI())) {
            if (LJJIFFI().isAd()) {
                function1.invoke(Boolean.FALSE);
                return true;
            }
            function1.invoke(Boolean.TRUE);
            return true;
        }
        if ((interfaceC1369790lkX instanceof C1373680lqo) && ((AbstractC1376120luk) interfaceC1369790lkX).LIZJ()) {
            function1.invoke(Boolean.FALSE);
            return true;
        }
        if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "chat_merge") && !(interfaceC1369790lkX instanceof QrCodeChannel)) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            String strKey2 = interfaceC1369790lkX.key();
            c1373540lqa.getClass();
            if (C1373540lqa.LJIIJJI(strKey2) && (aCLCommonShareLJII = C1373540lqa.LJII(LJJIFFI(), interfaceC1369790lkX.key())) != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(aCLCommonShareLJII.getCode(), "code");
                c2344009Gk.LIZJ(aCLCommonShareLJII.getShowType(), "show_type");
                c2344009Gk.LJIIIIZZ("toast_msg", aCLCommonShareLJII.getToastMsg());
                c2344009Gk.LJIIIIZZ("extra", aCLCommonShareLJII.getExtra());
                c2344009Gk.LIZJ(aCLCommonShareLJII.getTranscode(), "transcode");
                c2344009Gk.LJ(Boolean.valueOf(aCLCommonShareLJII.getMute()), "mute");
                c2344009Gk.LJIIIIZZ("popup_msg", aCLCommonShareLJII.getPopupMsg());
                C20684815ws.LJIILLIIL("share_video_acl", c2344009Gk.LIZ);
            }
            List arrayList = (List) C1374750lsX.LIZJ.getValue();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String strKey3 = interfaceC1369790lkX.key();
            if (arrayList.contains(strKey3)) {
                c1373560lqc = new C1374350lrt(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "facebook")) {
                c1373560lqc = new C1374340lrs(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "facebook_lite")) {
                c1373560lqc = new C1374410lrz(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "instagram")) {
                c1373560lqc = new C1374510ls9(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "youtube")) {
                c1373560lqc = new C1374520lsA(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "instagram_story")) {
                c1373560lqc = new C1374560lsE(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "snapchat")) {
                c1373560lqc = new C1374500ls8(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "kakaotalk")) {
                c1373560lqc = new C1374420ls0(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "whatsapp")) {
                c1373560lqc = new C1373840lr4(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "messenger")) {
                c1373560lqc = new C1374430ls1(interfaceC1369790lkX);
            } else if (Intrinsics.LJFF(strKey3, "repost")) {
                c1373560lqc = new InterfaceC1374600lsI(interfaceC1369790lkX) { // from class: X.0ls6
                    public final InterfaceC1369790lkX LIZ;

                    {
                        this.LIZ = interfaceC1369790lkX;
                    }

                    @Override // X.InterfaceC1374600lsI
                    public final boolean LIZ(Context context2, View view2, AwemeSharePackage awemeSharePackage, C0M7Y c0m7y2, Function1<? super Boolean, Unit> function12) {
                        this.LIZ.LJJIIJ(new C1371430lnB("", "", ""), context2, null);
                        function12.invoke(Boolean.TRUE);
                        return true;
                    }
                };
            } else if (Intrinsics.LJFF(strKey3, "ai_remix")) {
                c1373560lqc = new InterfaceC1374600lsI(interfaceC1369790lkX) { // from class: X.0ls5
                    public final InterfaceC1369790lkX LIZ;

                    {
                        this.LIZ = interfaceC1369790lkX;
                    }

                    @Override // X.InterfaceC1374600lsI
                    public final boolean LIZ(Context context2, View view2, AwemeSharePackage awemeSharePackage, C0M7Y c0m7y2, Function1<? super Boolean, Unit> function12) {
                        this.LIZ.LJJIIJ(new C1371430lnB("", "", ""), context2, c0m7y2);
                        function12.invoke(Boolean.TRUE);
                        return true;
                    }
                };
            } else if (Intrinsics.LJFF(strKey3, "share_to_story")) {
                c1373560lqc = new InterfaceC1374600lsI(interfaceC1369790lkX) { // from class: X.0ls7
                    public final InterfaceC1369790lkX LIZ;

                    {
                        this.LIZ = interfaceC1369790lkX;
                    }

                    @Override // X.InterfaceC1374600lsI
                    public final boolean LIZ(Context context2, View view2, AwemeSharePackage awemeSharePackage, C0M7Y c0m7y2, Function1<? super Boolean, Unit> function12) {
                        this.LIZ.LJJIIJ(new C1371430lnB("", "", ""), context2, null);
                        function12.invoke(Boolean.TRUE);
                        return true;
                    }
                };
            } else {
                c1373560lqc = new C1373560lqc(interfaceC1369790lkX);
            }
            return c1373560lqc.LIZ(context, view, this, c0m7y, function1);
        }
        if (!(interfaceC1369790lkX instanceof QrCodeChannel)) {
            return false;
        }
        new InterfaceC1374600lsI(interfaceC1369790lkX) { // from class: X.0lrv
            public final InterfaceC1369790lkX LIZ;

            {
                this.LIZ = interfaceC1369790lkX;
            }

            @Override // X.InterfaceC1374600lsI
            public final boolean LIZ(Context context2, View view2, AwemeSharePackage awemeSharePackage, C0M7Y c0m7y2, Function1<? super Boolean, Unit> function12) {
                this.LIZ.LJJIIJ(new C1371430lnB("", (String) null, 6), context2, null);
                C786410Ut5.LJJJI("share_form", "qrcode_form", awemeSharePackage.extras);
                function12.invoke(Boolean.TRUE);
                return true;
            }
        }.LIZ(context, view, this, c0m7y, function1);
        return true;
    }

    public final void LJJI(List<String> list, InterfaceC1369790lkX interfaceC1369790lkX, String str, int i, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        String strLIZ;
        C1371430lnB c1371430lnB;
        Activity activityLIZ;
        Activity activityLIZIZ;
        if (i >= 0 && i < list.size()) {
            String str2 = (String) ListProtector.get(list, i);
            Bundle bundle = this.extras.getBundle("short_link_params");
            if (str2 == null || str2.length() == 0 || (strLIZ = C1374720lsU.LIZ(bundle, str2)) == null) {
                strLIZ = "";
            }
            C786410Ut5.LJJJI("share_url", strLIZ, this.extras);
            this.extras.putInt("is_preload", 1);
            C786410Ut5.LJJJI("pre_load_crowd_name", (String) C093100Wr.LIZ.getValue(), this.extras);
            C786410Ut5.LJJJI("share_crowds", String.valueOf(C093200Ws.LIZ.getValue()), this.extras);
            String strKey = interfaceC1369790lkX.key();
            if (Intrinsics.LJFF(strKey, "email")) {
                c1371430lnB = new C1371430lnB(strLIZ, C1374720lsU.LIZIZ().getString(2131845764), str);
            } else if (Intrinsics.LJFF(strKey, "copy")) {
                c1371430lnB = new C1371430lnB(strLIZ, str, 4);
            } else {
                c1371430lnB = new C1371430lnB(strLIZ, str, 4);
            }
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            String string = this.extras.getString("share_form", "url_form");
            if (SharePackage.LJIL(strLIZ)) {
                this.extras.putInt("link_form", C1370370llT.LJ.LIZJ(strLIZ));
                function2.invoke(c1371430lnB, Boolean.TRUE);
                return;
            }
            this.extras.putInt("link_form", 1);
            if (Intrinsics.LJFF(string, "url_form") && activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131848062);
                c1389890mGx.LJIIJJI();
            }
            function2.invoke(c1371430lnB, Boolean.FALSE);
        }
    }
}
