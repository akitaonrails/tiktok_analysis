package com.ss.android.ugc.aweme.im.saas.host.impl.airemix;

import X.C054G;
import X.C09A1;
import X.C0A64;
import X.C0LOV;
import X.C0M70;
import X.C0M73;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C547860LeC;
import X.C563030M6j;
import X.C563080M6o;
import X.InterfaceC1364105Vn;
import X.InterfaceC563090M6p;
import X.InterfaceC563140M6u;
import android.app.Activity;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;

/* JADX INFO: loaded from: classes9.dex */
public final class IMAIRemixBridgeService implements IMAIRemixBridgeApi {
    public final C054G LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final boolean LIZIZ() {
        return ((Boolean) C0A64.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final boolean LIZLLL() {
        IAIRemixService.LIZ.getClass();
        return C563030M6j.LIZ().LIZ() != null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final boolean LJI() {
        IAIRemixService.LIZ.getClass();
        InterfaceC563140M6u interfaceC563140M6uLJIIIZ = C563030M6j.LIZ().LJIIIZ();
        return interfaceC563140M6uLJIIIZ != null && interfaceC563140M6uLJIIIZ.LIZ();
    }

    public IMAIRemixBridgeService() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final void LIZ(int i, Aweme aweme) {
        int i2;
        String firstGid;
        int i3 = 4;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i3 = 0;
                    } else {
                        i2 = 1;
                    }
                }
            } else {
                i3 = 5;
            }
            i2 = i3;
        } else {
            i2 = i3;
        }
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        String mobName = C0M70.DM_SHARE_CARD.getMobName();
        AIRemixInfo aIRemixInfo = aweme.aiRemixInfo;
        String gamePlay = null;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        String aid = aweme.getAid();
        AIRemixInfo aIRemixInfo2 = aweme.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        }
        iAIRemixEntranceMobServiceLIZ.LIZJ(i2, "dm_card_remix", mobName, aid, firstGid, gamePlay, aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Integer> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C05BV
            if (r0 == 0) goto L5d
            r5 = r8
            X.05BV r5 = (X.C05BV) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L90
            X.C155000ia.LIZIZ(r1)
        L23:
            X.0LNy r1 = (X.C542120LNy) r1
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L63
            r0 = 4
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            if (r7 == 0) goto L98
            int r0 = r7.length()
            if (r0 == 0) goto L98
            com.ss.android.ugc.airemix.api.experiment.AIRemixCreationConfig r0 = X.C1275604yw.LIZ()
            boolean r0 = r0.enableAuthShare
            if (r0 != 0) goto L49
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            return r0
        L49:
            X.0LeC r0 = X.C547860LeC.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.common.AITaskService r1 = X.C547860LeC.LJII()
            X.0Ldr r0 = X.C547650Ldr.LIZ
            r5.LLILLL = r2
            java.lang.Object r1 = r1.LJ(r7, r0, r2, r5)
            if (r1 != r4) goto L23
            return r4
        L5d:
            X.05BV r5 = new X.05BV
            r5.<init>(r6, r8)
            goto L12
        L63:
            java.util.List<X.0LNu> r1 = r1.LIZIZ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L74
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L74
        L6f:
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            return r0
        L74:
            java.util.Iterator r2 = r1.iterator()
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r2.next()
            X.0LNw r0 = X.C542100LNw.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L78
            r0 = 3
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L98:
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.airemix.IMAIRemixBridgeService.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final Object LJFF(String str, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        C547860LeC.LIZ.getClass();
        return C547860LeC.LJII().LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final void LJ(Aweme aweme, String str, boolean z) {
        String firstGid;
        String gamePlay;
        String firstGid2;
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        C0M70 c0m70 = C0M70.DM_SHARE_CARD;
        String mobName = c0m70.getMobName();
        AIRemixInfo aIRemixInfo = aweme.aiRemixInfo;
        String gamePlay2 = null;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        String aid = aweme.getAid();
        AIRemixInfo aIRemixInfo2 = aweme.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        } else {
            gamePlay = null;
        }
        iAIRemixEntranceMobServiceLIZ.LJIIL(str, z, mobName, aid, firstGid, gamePlay, aweme);
        String mobName2 = c0m70.getMobName();
        AIRemixInfo aIRemixInfo3 = aweme.aiRemixInfo;
        if (aIRemixInfo3 != null) {
            firstGid2 = aIRemixInfo3.getFirstGid();
        } else {
            firstGid2 = null;
        }
        String aid2 = aweme.getAid();
        AIRemixInfo aIRemixInfo4 = aweme.aiRemixInfo;
        if (aIRemixInfo4 != null) {
            gamePlay2 = aIRemixInfo4.getGamePlay();
        }
        iAIRemixEntranceMobServiceLIZ.LJFF(str, z, mobName2, aid2, firstGid2, gamePlay2, aweme);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final void LJIIIIZZ(Aweme aweme, String str, boolean z) {
        String firstGid;
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        String mobName = C0M70.DM_SHARE_CARD.getMobName();
        AIRemixInfo aIRemixInfo = aweme.aiRemixInfo;
        String gamePlay = null;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        String aid = aweme.getAid();
        AIRemixInfo aIRemixInfo2 = aweme.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        }
        iAIRemixEntranceMobServiceLIZ.LIZIZ(str, z, mobName, aid, firstGid, gamePlay, aweme);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi
    public final void LJII(Activity activity, String str, Aweme aweme, String str2) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ2 = C0LOV.LIZ();
            if (creativeToolsBizPluginServiceLIZ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("airemix_");
                sbLIZ.append(C0M70.DM_SHARE_CARD.getMobName());
                creativeToolsBizPluginServiceLIZ2.LIZIZ(activity, C2188811AlT.LIZIZ(sbLIZ), true);
                return;
            }
            return;
        }
        IAIRemixService.LIZ.getClass();
        InterfaceC563090M6p interfaceC563090M6pLIZ = C563030M6j.LIZ().LIZ();
        if (interfaceC563090M6pLIZ == null) {
            return;
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C563080M6o(interfaceC563090M6pLIZ, str, aweme, str2, activity, null), 3);
    }
}
