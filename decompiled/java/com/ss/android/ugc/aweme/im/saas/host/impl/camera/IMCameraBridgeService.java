package com.ss.android.ugc.aweme.im.saas.host.impl.camera;

import X.C069P;
import X.C0I0B;
import X.C0PEM;
import X.C0Y3I;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZFW;
import X.C0ZQS;
import X.C0ZSW;
import X.C1229100i5c;
import X.C1229870i6r;
import X.C12857051j;
import X.C13LE;
import X.C1483340ohg;
import X.C15597068t;
import X.C1684506ih;
import X.C19666711x3;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C294790Bgz;
import X.C461720I8s;
import X.C869590Y9l;
import X.C894660Z7w;
import X.C896060ZDg;
import X.C896400ZEo;
import X.C909050ZlP;
import X.C911220Zou;
import X.C911370Zp9;
import X.C911420ZpE;
import X.C911450ZpH;
import X.C911480ZpK;
import X.C911520ZpO;
import X.C912070ZqH;
import X.EnumC911440ZpG;
import X.InterfaceC1331800klG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1757506uT;
import X.InterfaceC456840Hvm;
import X.InterfaceC876950Yaj;
import X.InterfaceC911530ZpP;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes15.dex */
public final class IMCameraBridgeService implements IMCameraBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final InterfaceC456840Hvm LJI() {
        return C912070ZqH.LIZIZ.getUiService().LJI();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJIJJLI() {
        C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJIL() {
        C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJJ() {
        C912070ZqH.LIZIZ.LJIIIIZZ().LJII();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJJIFFI() {
        C911520ZpO.LIZ.getClass();
        C911520ZpO.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJJIJIL() {
        C912070ZqH.LIZIZ.LJIILIIL().LJII(true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJJIJIIJIL() {
        C12857051j.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LIZ(C869590Y9l c869590Y9l) {
        C912070ZqH.LIZIZ.LJIJI().LIZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final boolean LIZIZ(C869590Y9l c869590Y9l) {
        return C912070ZqH.LIZIZ.LJIILJJIL().LIZIZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final String LIZJ(C869590Y9l c869590Y9l) {
        return C912070ZqH.LIZIZ.LJIILJJIL().LIZJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final String LIZLLL(boolean z) {
        return C912070ZqH.LIZIZ.LJIIZILJ().LIZLLL(z);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final InterfaceC1331800klG LJII(int i) {
        return C912070ZqH.LIZIZ.getUiService().LJII(i);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final String LJIIIIZZ(C869590Y9l c869590Y9l) {
        return C912070ZqH.LIZIZ.LJIILJJIL().LJIIIIZZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJIIIZ(String str) {
        C912070ZqH.LIZIZ.LJIIL().LJIIIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final String LJIIJ(C869590Y9l c869590Y9l) {
        return C912070ZqH.LIZIZ.LJIILJJIL().LJIIJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final Aweme LJIILJJIL(C869590Y9l c869590Y9l) {
        return C911220Zou.LIZJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final boolean LJIJI(String str) {
        return C909050ZlP.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJIJJ(Aweme aweme) {
        C1483340ohg.LJIL(819200, aweme);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final C0ZSW LJJII(C869590Y9l c869590Y9l) {
        return C896060ZDg.LJFF(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final Object LJJIII(InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC911530ZpP interfaceC911530ZpPLJJIFFI = C912070ZqH.LIZIZ.LJJIFFI();
        C0I0B.LJFF.LIZJ();
        return interfaceC911530ZpPLJJIFFI.LJI(C894660Z7w.LIZ(), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJJIIJ(C869590Y9l c869590Y9l) {
        String strSubstring;
        String str = c869590Y9l.getExt().get("a:im_session_id");
        if (str != null) {
            C911450ZpH c911450ZpH = C911450ZpH.LIZ;
            C13LE.LIZ(c869590Y9l.getClass());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try handle imSessionId=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c911450ZpH.getClass();
            if (u.LJJIIJZLJL(str, "gamechallengefake_", false)) {
                if (u.LJJIIJZLJL(str, "gamechallengefake_", false) && (strSubstring = str.substring(18)) != null) {
                    C1684506ih c1684506ih = new C1684506ih();
                    c1684506ih.LIZLLL(35);
                    c1684506ih.LIZJ = strSubstring;
                    FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
                    if (fakeMsgOperatorService != null) {
                        fakeMsgOperatorService.LIZ(c869590Y9l.getConversationId(), c1684506ih, null, new InterfaceC1757506uT() { // from class: X.0ZpF
                            @Override // X.InterfaceC1757506uT
                            public final void LIZIZ(C1736606r6 c1736606r6, int i, String str2) {
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            if (C911450ZpH.LJ(str)) {
                if (!C911450ZpH.LJ(str)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("obtainFakeMsgIdOrNull not fake card command: ");
                    sbLIZ2.append((String) null);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C911450ZpH.LJFF();
                    return;
                }
                String strSubstring2 = str.substring(12);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("obtainFakeMsgIdOrNull ");
                sbLIZ3.append(strSubstring2);
                C2188811AlT.LIZIZ(sbLIZ3);
                C911450ZpH.LJFF();
                if (strSubstring2 == null) {
                    return;
                }
                C911420ZpE.LIZ(strSubstring2, c869590Y9l.getConversationId());
                return;
            }
            if (!C911450ZpH.LIZLLL(str)) {
                return;
            }
            if (!C911450ZpH.LIZLLL(str)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("obtainCardMsgIdOrNull not fake card command: ");
                sbLIZ4.append(str);
                C2188811AlT.LIZIZ(sbLIZ4);
                C911450ZpH.LJFF();
                return;
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str.substring(12));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("obtainCardMsgIdOrNull ");
            sbLIZ5.append(lLJIILIIL);
            C2188811AlT.LIZIZ(sbLIZ5);
            C911450ZpH.LJFF();
            if (lLJIILIIL == null) {
                return;
            }
            C911450ZpH.LIZ(lLJIILIIL.longValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJJIIZI(String str) {
        C911520ZpO.LIZ.getClass();
        C911520ZpO.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final boolean LJJIJ(String str) {
        boolean z;
        C911520ZpO.LIZ.getClass();
        C911450ZpH.LIZ.getClass();
        C911480ZpK c911480ZpKLIZIZ = C911450ZpH.LIZIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkForNewGroupChatBanner ");
        sbLIZ.append(c911480ZpKLIZIZ);
        sbLIZ.append(", result=");
        if (c911480ZpKLIZIZ.LIZIZ > 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C911520ZpO.LIZLLL();
        if (c911480ZpKLIZIZ.LIZIZ > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final boolean LJJIJIIJI(C869590Y9l c869590Y9l) {
        return C896060ZDg.LIZLLL(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final ResolutionComponent LJ(C869590Y9l c869590Y9l, String str) {
        return C912070ZqH.LIZIZ.LJIILJJIL().LJ(c869590Y9l, str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJFF(C0Y3I c0y3i, C869590Y9l c869590Y9l) {
        C912070ZqH.LIZIZ.LJIILIIL().LJFF(c0y3i, c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final List<String> LJIIJJI(C869590Y9l c869590Y9l, String str) {
        return C912070ZqH.LIZIZ.LJIILJJIL().LJIIJJI(c869590Y9l, str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final VideoCardFallbackInfoComponent LJIIL(C869590Y9l c869590Y9l, VideoCardTemplate videoCardTemplate) {
        return C0ZQS.LIZIZ(c869590Y9l, videoCardTemplate);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final Aweme LJIILIIL(C869590Y9l c869590Y9l, Boolean bool) {
        return C911220Zou.LJ(c869590Y9l, bool);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final boolean LJIILLIIL(String str, String str2) {
        return C912070ZqH.LIZIZ.LJIIIIZZ().LJII().LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final Aweme LJIJ(C869590Y9l c869590Y9l, Boolean bool) {
        return C911220Zou.LIZLLL(c869590Y9l, bool);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final boolean LJJI(C869590Y9l c869590Y9l, boolean z) {
        C0ZSW c0zswLJ = C896060ZDg.LJ(c869590Y9l, z);
        if (c0zswLJ != C0ZSW.NUDE_MASK && c0zswLJ != C0ZSW.SAFETY_MASK) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C911400ZpC
            if (r0 == 0) goto L47
            r5 = r8
            X.0ZpC r5 = (X.C911400ZpC) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L55
            if (r0 != r2) goto L4d
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
        L2b:
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            X.01GW r0 = X.C271130Ajv.LIZ
            boolean r0 = X.C271130Ajv.LIZIZ
            if (r0 == 0) goto L3e
            r5.LLILLL = r1
            java.lang.Object r0 = r6.LJJIL(r7, r5)
            if (r0 != r3) goto L5e
            return r3
        L3e:
            r5.LLILLL = r2
            java.lang.Object r0 = r6.LJJIJLIJ(r7, r5)
            if (r0 != r3) goto L2b
            return r3
        L47:
            X.0ZpC r5 = new X.0ZpC
            r5.<init>(r6, r8)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L55:
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService.LJJIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJLIJ(java.lang.String r17, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult>> r18) {
        /*
            r16 = this;
            r4 = r18
            boolean r0 = r4 instanceof X.C911390ZpB
            if (r0 == 0) goto L98
            r3 = r4
            X.0ZpB r3 = (X.C911390ZpB) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r3.LLILZ = r2
        L14:
            java.lang.Object r4 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto La1
            X.C155000ia.LIZIZ(r4)
        L24:
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
            return r0
        L2b:
            X.C155000ia.LIZIZ(r4)
            r7 = r17
            r3.LL = r7
            r3.LLILZ = r1
            X.1DEt r4 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r3)
            r4.<init>(r1, r0)
            r4.LJIJJ()
            X.0ZqH r0 = X.C912070ZqH.LIZIZ
            com.ss.android.ugc.aweme.service.IIMMediaCreativeService r0 = r0.LJIILIIL()
            com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager r5 = r0.LJIIIZ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            X.0I0B r0 = X.C0I0B.LJFF
            X.0I8r r0 = r0.LIZ()
            X.0mXo r0 = (X.C1400340mXo) r0
            java.lang.String r0 = r0.getCurUserId()
            if (r0 != 0) goto L5e
            java.lang.String r0 = ""
        L5e:
            r1.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r1.append(r0)
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
            X.09KR r0 = X.C09KR.GROUP_CHAT_AVATAR
            int r9 = r0.getScene()
            r15 = 0
            r1 = r5
            r8 = 0
            r11 = 1
            java.util.Map r14 = X.C2097608Jq.LJ()
            r10 = r8
            r12 = r11
            r13 = r11
            r5.LJIIIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0ZpA r0 = new X.0ZpA
            r0.<init>()
            r1.LIZIZ(r0, r6)
            java.lang.Object r4 = r4.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r4 != r0) goto L95
            X.C099Q.LIZJ(r3)
        L95:
            if (r4 != r2) goto L24
            return r2
        L98:
            X.0ZpB r3 = new X.0ZpB
            r0 = r16
            r3.<init>(r0, r4)
            goto L14
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService.LJJIJLIJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(java.lang.String r10, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C911410ZpD
            if (r0 == 0) goto L8a
            r8 = r11
            X.0ZpD r8 = (X.C911410ZpD) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r1 = 1
            if (r0 == 0) goto L44
            if (r0 != r1) goto L9d
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r3 = r3.m10unboximpl()
        L28:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r1 != 0) goto L94
            com.ss.android.ugc.aweme.creation.config.DMUploadImageResult r3 = (com.ss.android.ugc.aweme.creation.config.DMUploadImageResult) r3
            com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent r0 = r3.decryptData
            if (r0 != 0) goto L90
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Empty Image data"
            r1.<init>(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r1)
            X.C189200o6.m2constructorimpl(r3)
            return r3
        L44:
            X.C155000ia.LIZIZ(r3)
            r5 = r10
            if (r5 == 0) goto La5
            int r0 = r5.length()
            if (r0 == 0) goto La5
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            X.0I0B r0 = X.C0I0B.LJFF
            X.0I8r r0 = r0.LIZ()
            java.lang.String r0 = r0.getCurUserId()
            if (r0 != 0) goto L62
            java.lang.String r0 = ""
        L62:
            r3.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r3.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r3)
            X.0ZqH r0 = X.C912070ZqH.LIZIZ
            com.ss.android.ugc.aweme.service.IIMMediaCreativeService r0 = r0.LJIILIIL()
            com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager r3 = r0.LJIIIZ()
            X.09KR r0 = X.C09KR.GROUP_CHAT_AVATAR
            int r6 = r0.getScene()
            r7 = 0
            r8.LLILLL = r1
            java.lang.Object r3 = r3.LJ(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L28
            return r2
        L8a:
            X.0ZpD r8 = new X.0ZpD
            r8.<init>(r9, r11)
            goto L12
        L90:
            X.C189200o6.m2constructorimpl(r3)
            return r3
        L94:
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uploadAvatarFile: filePath is null or empty"
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService.LJJIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJIIZILJ(Context context, String str, String str2) {
        String str3;
        EnumC911440ZpG enumC911440ZpG;
        GroupPreviewDisplayMeta next;
        GroupForPreview groupForPreview;
        String str4;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            return;
        }
        C0ZFW c0zfw = C0ZFW.LIZ;
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(C461720I8s.LIZIZ(), null, "im_local_db");
        if (iMUserLJIIL != null && (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null) {
            str3 = userB2CAccountInfo.userTags;
        } else {
            str3 = null;
        }
        String strLJI = C1229100i5c.LJI(str);
        String strValueOf = String.valueOf(c0y8tLIZ.getConversationShortId());
        C19666711x3 c19666711x3 = new C19666711x3(c0y8tLIZ, c0zfw, strLJI, str3, str, context, str2);
        String strLIZIZ = C461720I8s.LIZIZ();
        if (C294790Bgz.LIZ()) {
            enumC911440ZpG = EnumC911440ZpG.ALL_PUBLIC_GROUP;
        } else {
            enumC911440ZpG = EnumC911440ZpG.FAN_GROUP_ONLY;
        }
        List<GroupPreviewDisplayMeta> listLIZIZ = C1229870i6r.LIZIZ(strLIZIZ, strLIZIZ, enumC911440ZpG);
        if (listLIZIZ != null) {
            Iterator<GroupPreviewDisplayMeta> it2 = listLIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(String.valueOf(next.groupInfo.convShortId), strValueOf)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GroupPreviewDisplayMeta groupPreviewDisplayMeta = next;
            if (groupPreviewDisplayMeta != null && (groupForPreview = groupPreviewDisplayMeta.groupInfo) != null && (str4 = groupForPreview.accessCriteriaDesc) != null) {
                c19666711x3.invoke(str4);
                return;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C911370Zp9(this, strValueOf, c19666711x3, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final Object LJJIIJZLJL(Context context, String str, C15597068t c15597068t) {
        return C911520ZpO.LIZ.LIZ(context, str, c15597068t, true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final List<String> LJJIJL(String str, List<String> list, List<String> list2, List<String> list3) {
        return C896400ZEo.LIZIZ(str, list, list2, list3);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi
    public final void LJIILL(String str, String str2, String str3, String str4, Double d) {
        C912070ZqH.LIZIZ.LJFF().LJIIL(str, str2, str3, str4, d, C0I0B.LJFF.LIZIZ());
    }
}
