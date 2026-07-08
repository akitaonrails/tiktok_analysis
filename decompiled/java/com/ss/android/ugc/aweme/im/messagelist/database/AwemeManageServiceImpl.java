package com.ss.android.ugc.aweme.im.messagelist.database;

import X.C01GW;
import X.C05CP;
import X.C0BQP;
import X.C0I0B;
import X.C0NP1;
import X.C0NPC;
import X.C0PEM;
import X.C0ZDX;
import X.C123100dR;
import X.C13LP;
import X.C1400340mXo;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2241931Cox;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C461060I6e;
import X.C593190NOj;
import X.C593230NOn;
import X.C593240NOo;
import X.C593250NOp;
import X.C869590Y9l;
import X.InterfaceC1364105Vn;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.experiment.ImSpecialEffectsFrequencyControlSettings;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AwemeManageServiceImpl implements IAwemeDataBaseService {
    public final Keva LIZ = Keva.getRepo("im_aweme_database_assem");
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(128));

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService
    public final void LLILZIL() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            return;
        }
        ImSpecialEffectsFrequencyControlSettings.ImSpecialEffectsFrequencyControlModel imSpecialEffectsFrequencyControlModelLIZ = ImSpecialEffectsFrequencyControlSettings.LIZ();
        long jMax = Math.max(imSpecialEffectsFrequencyControlModelLIZ.shareAgainRetroactiveValidityPeriod + imSpecialEffectsFrequencyControlModelLIZ.shareAgainValidityWindow, imSpecialEffectsFrequencyControlModelLIZ.shareHighFreqValidityWindow);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("database_synced_");
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append((int) jMax);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ.getBoolean(strLIZIZ, false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Database already synced for user: ");
            sbLIZ2.append(curUserId);
            sbLIZ2.append(", timeWindow: ");
            sbLIZ2.append(jMax);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Starting database sync for user: ");
        sbLIZ3.append(curUserId);
        sbLIZ3.append(", timeWindow: ");
        sbLIZ3.append(jMax);
        C2188811AlT.LIZIZ(sbLIZ3);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05CP(this, strLIZIZ, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService
    public final void LLIZ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_delete_check_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long j = this.LIZ.getLong(strLIZIZ, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j < 86400000) {
            return;
        }
        this.LIZ.storeLong(strLIZIZ, jCurrentTimeMillis);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NP1(this, null), 3);
    }

    public static List LIZJ(List list) {
        List listLIZLLL = LIZLLL(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) listLIZLLL;
        for (Object obj : arrayList2) {
            if (C123100dR.LIZ(((C0NPC) obj).LIZLLL)) {
                arrayList.add(obj);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseAndFilterEntities: parsed=");
        sbLIZ.append(arrayList2.size());
        sbLIZ.append(", after awemeId filter=");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        return arrayList;
    }

    public static List LIZLLL(List list) {
        String str;
        List<String> list2;
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseEntityFromMessage: input size=");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        IMCameraBridgeApi iMCameraBridgeApi = (IMCameraBridgeApi) PluggableExtentionKt.pluggableSpiForReal(IMCameraBridgeApi.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ C0ZDX.LJJJJZ((C869590Y9l) obj)) {
                arrayList.add(obj);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("parseEntityFromMessage: after violation filter: ");
        sbLIZ2.append(arrayList.size());
        sbLIZ2.append(" (filtered out ");
        sbLIZ2.append(list.size() - arrayList.size());
        sbLIZ2.append(')');
        C2188811AlT.LIZIZ(sbLIZ2);
        ArrayList<C869590Y9l> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C869590Y9l c869590Y9l = (C869590Y9l) obj2;
            if (iMCameraBridgeApi != null && iMCameraBridgeApi.LJJIJIIJI(c869590Y9l)) {
                z = true;
            } else {
                z = false;
            }
            if (c869590Y9l.getMsgType() == 1809) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !c869590Y9l.isRecalled();
            boolean z4 = !c869590Y9l.isDeleted();
            boolean z5 = !z;
            boolean z6 = !C0ZDX.LJIIZILJ(c869590Y9l);
            boolean z7 = !C461060I6e.LIZ(c869590Y9l);
            if (z2 && z3 && z4 && z5 && z6 && z7) {
                arrayList2.add(obj2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("parseEntityFromMessage: filtered out msgId=");
                sbLIZ3.append(c869590Y9l.getMsgId());
                sbLIZ3.append(", msgType=");
                sbLIZ3.append(c869590Y9l.getMsgType());
                sbLIZ3.append("(isAwemeCard=");
                sbLIZ3.append(z2);
                sbLIZ3.append("), isRecalled=");
                sbLIZ3.append(c869590Y9l.isRecalled());
                sbLIZ3.append(", isDeleted=");
                sbLIZ3.append(c869590Y9l.isDeleted());
                sbLIZ3.append(", isNudityMask=");
                sbLIZ3.append(z);
                sbLIZ3.append(", hasUnavailableAwemeCard=");
                sbLIZ3.append(C0ZDX.LJIIZILJ(c869590Y9l));
                sbLIZ3.append(", scene=");
                sbLIZ3.append(c869590Y9l.getScene());
                sbLIZ3.append("(isStory=");
                sbLIZ3.append(C461060I6e.LIZ(c869590Y9l));
                sbLIZ3.append(')');
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("parseEntityFromMessage: after type filter: ");
        sbLIZ4.append(arrayList2.size());
        sbLIZ4.append(" (filtered out ");
        sbLIZ4.append(arrayList.size() - arrayList2.size());
        sbLIZ4.append(')');
        C2188811AlT.LIZIZ(sbLIZ4);
        ArrayList arrayList3 = new ArrayList();
        for (C869590Y9l c869590Y9l2 : arrayList2) {
            AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C2241931Cox.LIZJ(c869590Y9l2, AwemeCardTemplate.class);
            if (awemeCardTemplate == null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("parseEntityFromMessage: parseContentPB returned null for msgId=");
                sbLIZ5.append(c869590Y9l2.getMsgId());
                C2188811AlT.LIZIZ(sbLIZ5);
            } else {
                VideoCoverComponent videoCoverComponent = awemeCardTemplate.baseVideoComponent;
                if (videoCoverComponent == null) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("parseEntityFromMessage: baseVideoComponent is null for msgId=");
                    sbLIZ6.append(c869590Y9l2.getMsgId());
                    C2188811AlT.LIZIZ(sbLIZ6);
                } else if (videoCoverComponent.id.length() == 0) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("parseEntityFromMessage: videoCoverComponent.id is empty for msgId=");
                    sbLIZ7.append(c869590Y9l2.getMsgId());
                    C2188811AlT.LIZIZ(sbLIZ7);
                } else {
                    ImageComponent imageComponent = videoCoverComponent.coverImage;
                    if (imageComponent != null && (list2 = imageComponent.urls) != null) {
                        str = (String) C13LP.LJJJLL(list2);
                    } else {
                        str = null;
                    }
                    long msgId = c869590Y9l2.getMsgId();
                    String uuid = c869590Y9l2.getUuid();
                    String conversationId = c869590Y9l2.getConversationId();
                    String str2 = videoCoverComponent.id;
                    str2.toString();
                    long createdAt = c869590Y9l2.getCreatedAt();
                    boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l2);
                    if (!((Boolean) C0BQP.LIZ.getValue()).booleanValue()) {
                        videoCoverComponent = null;
                    }
                    long index = c869590Y9l2.getIndex();
                    if (str == null) {
                        str = "";
                    }
                    arrayList3.add(new C0NPC(msgId, createdAt, index, videoCoverComponent, uuid, conversationId, str2, str, zLJJJJIZL, false, false));
                }
            }
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("parseEntityFromMessage: final entity count: ");
        sbLIZ8.append(arrayList3.size());
        C2188811AlT.LIZIZ(sbLIZ8);
        return arrayList3;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService
    public final void LLILZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRecallMessage messageId=");
        sbLIZ.append(c869590Y9l.getMsgId());
        C2188811AlT.LIZIZ(sbLIZ);
        if (c869590Y9l.getMsgType() == 1809) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C593230NOn(c869590Y9l, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService
    public final void LLIZLLLIL(List<C869590Y9l> list) {
        String conversationId;
        if (list == null) {
            return;
        }
        C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL(list);
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        } else {
            conversationId = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadLoader list size=");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C593250NOp(this, LIZJ(list), conversationId, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService
    public final void LLJ(C869590Y9l c869590Y9l) {
        C0NPC c0npc;
        if (c869590Y9l == null || !C1697810uHb.LJIIJJI(2, 5).contains(Integer.valueOf(c869590Y9l.getMsgStatus())) || (c0npc = (C0NPC) C13LP.LJJJLL(LIZLLL(Collections.singletonList(c869590Y9l)))) == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C593240NOo(c0npc, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005c -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<X.C0NPC> r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C593280NOs
            if (r0 == 0) goto L7b
            r5 = r10
            X.0NOs r5 = (X.C593280NOs) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r2 = r5.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r4 = 1
            if (r0 == 0) goto L5f
            if (r0 != r4) goto L84
            java.lang.Object r7 = r5.LLILLL
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r3 = r5.LLILLJJLI
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.0NOi r1 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L2c:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Inserted batch of "
            r2.append(r0)
            int r0 = r7.size()
            r2.append(r0)
            java.lang.String r0 = " entities"
            r2.append(r0)
            X.C2188811AlT.LIZIZ(r2)
        L44:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r7 = r3.next()
            java.util.List r7 = (java.util.List) r7
            r5.LL = r1
            r5.LLILLJJLI = r3
            r5.LLILLL = r7
            r5.LLILZLL = r4
            java.lang.Object r0 = r1.LJII(r7, r5)
            if (r0 != r6) goto L2c
            return r6
        L5f:
            X.C155000ia.LIZIZ(r2)
            X.0Nyj r0 = X.InterfaceC593180NOi.LIZ
            r0.getClass()
            X.0NOi r1 = X.C611550Nyj.LIZ()
            if (r1 != 0) goto L70
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L70:
            r0 = 100
            java.util.List r0 = X.C13LP.LJJJIL(r9, r0)
            java.util.Iterator r3 = r0.iterator()
            goto L44
        L7b:
            X.0NOs r5 = new X.0NOs
            r5.<init>(r8, r10)
            goto L12
        L81:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r6, X.InterfaceC1364105Vn<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C593270NOr
            if (r0 == 0) goto L46
            r4 = r8
            X.0NOr r4 = (X.C593270NOr) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L4c
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
        L28:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            X.0Nyj r0 = X.InterfaceC593180NOi.LIZ
            r0.getClass()
            X.0NOi r0 = X.C611550Nyj.LIZ()
            if (r0 == 0) goto L44
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJFF(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L44:
            r0 = 0
            goto L28
        L46:
            X.0NOr r4 = new X.0NOr
            r4.<init>(r5, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl.LIZIZ(long, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService
    public final Object LLILZLL(String str, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C593190NOj(str, j, 259200000L, null));
    }
}
