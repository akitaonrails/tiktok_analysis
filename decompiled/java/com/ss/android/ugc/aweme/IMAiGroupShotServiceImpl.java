package com.ss.android.ugc.aweme;

import X.AbstractC1682806iQ;
import X.C1228210i4B;
import X.C1608406Rm;
import X.C1682606iO;
import X.C1682706iP;
import X.C1759206uk;
import X.C1783520wVq;
import X.C1786270waH;
import X.C1954807lC;
import X.C19EG;
import X.C911590ZpV;
import X.EnumC1206810hVf;
import X.EnumC1783370wVb;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import com.ss.android.ugc.aweme.exp.groupshot.AIGroupShotConfig;
import com.ss.android.ugc.aweme.im.service.experiment.ImQRGroupConfig;
import com.ss.android.ugc.aweme.im.service.experiment.QrcodeCreateGroupEntranceConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS285S0000000_2;

/* JADX INFO: loaded from: classes28.dex */
public final class IMAiGroupShotServiceImpl implements IIMAiGroupShotService {
    public final IMAiGroupShotConfig.ContactSelectConfig.TextConfig LIZ = new IMAiGroupShotConfig.ContactSelectConfig.TextConfig(2131831538, 2131830904, AFwS285S0000000_2.get$arr$(8));
    public final IMAiGroupShotConfig.ContactSelectConfig.TextConfig LIZIZ = new IMAiGroupShotConfig.ContactSelectConfig.TextConfig(2131830902, 2131830903, AFwS285S0000000_2.get$arr$(9));

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super X.EnumC1783410wVf> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1783460wVk
            if (r0 == 0) goto L6f
            r5 = r7
            X.0wVk r5 = (X.C1783460wVk) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L56
            if (r0 != r3) goto L75
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0qcW r1 = (X.C1557020qcW) r1
            java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r1 = r1.LIZIZ
            X.01GW r0 = X.C911590ZpV.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.exp.groupshot.AIGroupShotConfig r0 = (com.ss.android.ugc.aweme.exp.groupshot.AIGroupShotConfig) r0
            int r0 = r0.userCountActiveGroupCheck
            java.util.List r1 = X.C13LP.LL(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L41
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L41
        L3e:
            X.0wVf r0 = X.EnumC1783410wVf.NO_RECENT_GROUP_CHAT
            return r0
        L41:
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L45
            X.0wVf r0 = X.EnumC1783410wVf.HAS_RECENT_GROUP_CHAT
            return r0
        L56:
            X.C155000ia.LIZIZ(r1)
            X.0wVq r0 = X.C1783520wVq.LL
            r0.LIZJ()
            X.0951 r2 = X.C1783520wVq.LLILLL
            X.0yd3 r1 = new X.0yd3
            r0 = 5
            r1.<init>(r2, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C09IC.LJIIZILJ(r1, r5)
            if (r1 != r4) goto L22
            return r4
        L6f:
            X.0wVk r5 = new X.0wVk
            r5.<init>(r6, r7)
            goto L12
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl.LJ(X.05Vn):java.lang.Object");
    }

    public static IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction LJFF(String str, String str2) {
        String str3;
        if (C1608406Rm.LIZ()) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ImQRGroupConfig imQRGroupConfig = C1228210i4B.LIZ;
            ImQRGroupConfig imQRGroupConfig2 = (ImQRGroupConfig) settingsManagerLIZLLL.LJIIIIZZ("im_qr_group_config", ImQRGroupConfig.class, imQRGroupConfig);
            if (imQRGroupConfig2 != null) {
                imQRGroupConfig = imQRGroupConfig2;
            }
            QrcodeCreateGroupEntranceConfig qrcodeCreateGroupEntranceConfig = imQRGroupConfig.qrcodeCreateGroupEntranceConfig;
            if (qrcodeCreateGroupEntranceConfig == null || (str3 = qrcodeCreateGroupEntranceConfig.entranceText) == null) {
                str3 = "";
            }
            return new IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible(R.raw.icon_link, R.raw.icon_chevron_right_offset_ltr, new IMAiGroupShotConfig.Text.FromString(str3), new IMAiGroupShotConfig.CustomClick.DismissPanel(new IMAiGroupShotConfig.CustomClick.DismissPanel.CreateQrGroupConfig(str, str2)));
        }
        return IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.None.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r21, java.lang.String r22, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.IMAiGroupShotConfig.ContactSelectConfig.Selecting> r23) {
        /*
            r20 = this;
            r5 = r23
            r4 = r21
            r11 = r22
            boolean r0 = r5 instanceof X.C1783450wVj
            r2 = r20
            if (r0 == 0) goto L8e
            r6 = r5
            X.0wVj r6 = (X.C1783450wVj) r6
            int r3 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L8e
            int r3 = r3 - r1
            r6.LLILZIL = r3
        L1a:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r1 = 0
            r7 = 1
            if (r0 == 0) goto L59
            if (r0 != r7) goto Lbd
            java.lang.Object r11 = r6.LLILLJJLI
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r4 = r6.LL
            android.content.Context r4 = (android.content.Context) r4
            X.C155000ia.LIZIZ(r5)
        L33:
            X.0wVf r5 = (X.EnumC1783410wVf) r5
            int[] r3 = X.C1783420wVg.LIZ
            int r0 = r5.ordinal()
            r3 = r3[r0]
            if (r3 == r7) goto L9a
            r0 = 2
            if (r3 != r0) goto L94
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$Selecting r5 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$Selecting
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$TextConfig r6 = r2.LIZIZ
            X.13BV r8 = X.C13BV.INSTANCE
            kotlin.jvm.internal.AwS141S1100000_27 r9 = new kotlin.jvm.internal.AwS141S1100000_27
            r0 = 3
            r9.<init>(r2, r4, r11, r0)
            X.0wVb r10 = X.EnumC1783370wVb.MUF_AND_GROUP
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$Action$TakePhotoAndSend r12 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$Action$TakePhotoAndSend
            r12.<init>(r1, r11, r7)
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L59:
            X.C155000ia.LIZIZ(r5)
            X.06uk r0 = X.C1759206uk.LIZ
            boolean r0 = X.C1759206uk.LIZ()
            if (r0 != 0) goto L81
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$Selecting r5 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$Selecting
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$TextConfig r13 = r2.LIZIZ
            r14 = 1
            X.13BV r15 = X.C13BV.INSTANCE
            r0 = 36
            kotlin.jvm.internal.AFwS269S0000000_27 r16 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            X.0wVb r17 = X.EnumC1783370wVb.MUF
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$Action$TakePhotoAndSend r0 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$Action$TakePhotoAndSend
            r0.<init>(r1, r11, r7)
            r12 = r5
            r18 = r11
            r19 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r5
        L81:
            r6.LL = r4
            r6.LLILLJJLI = r11
            r6.LLILZIL = r7
            java.lang.Object r5 = r2.LJ(r6)
            if (r5 != r3) goto L33
            return r3
        L8e:
            X.0wVj r6 = new X.0wVj
            r6.<init>(r2, r5)
            goto L1a
        L94:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L9a:
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$Selecting r5 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$Selecting
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig$TextConfig r6 = r2.LIZ
            X.01GW r0 = X.C911590ZpV.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.exp.groupshot.AIGroupShotConfig r0 = (com.ss.android.ugc.aweme.exp.groupshot.AIGroupShotConfig) r0
            int r0 = r0.inviteFriendsGroupLimit
            int r7 = r0 + (-1)
            X.13BV r8 = X.C13BV.INSTANCE
            kotlin.jvm.internal.AwS141S1100000_27 r9 = new kotlin.jvm.internal.AwS141S1100000_27
            r0 = 2
            r9.<init>(r2, r11, r0)
            X.0wVb r10 = X.EnumC1783370wVb.MUF_AND_GROUP
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$Action$CreateNewGroup r12 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$Action$CreateNewGroup
            r12.<init>(r11)
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl.LIZLLL(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // com.ss.android.ugc.aweme.IIMAiGroupShotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C19EG r6, com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry.OutChat r7, java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof X.C1783440wVi
            if (r0 == 0) goto L57
            r4 = r10
            X.0wVi r4 = (X.C1783440wVi) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r0 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZLL
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L5d
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$TemplateConfig$Selected r1 = r4.LLILLL
            com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry$OutChat r7 = r4.LLILLJJLI
            X.19EG r6 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L28:
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig r0 = (com.ss.android.ugc.aweme.IMAiGroupShotConfig.ContactSelectConfig) r0
            com.ss.android.ugc.aweme.IMAiGroupShotConfig r2 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig
            r2.<init>(r7, r1, r0)
            X.0waH r0 = X.C1786270waH.LIZ
            r0.getClass()
            r0 = 0
            X.C1786270waH.LIZIZ(r6, r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3b:
            X.C155000ia.LIZIZ(r0)
            X.0wVq r0 = X.C1783520wVq.LL
            X.C1783520wVq.LIZIZ()
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$TemplateConfig$Selected r1 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$TemplateConfig$Selected
            r1.<init>(r8)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILLL = r1
            r4.LLILZLL = r2
            java.lang.Object r0 = r5.LIZLLL(r6, r9, r4)
            if (r0 != r3) goto L28
            return r3
        L57:
            X.0wVi r4 = new X.0wVi
            r4.<init>(r5, r10)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl.LIZIZ(X.19EG, com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry$OutChat, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    @Override // com.ss.android.ugc.aweme.IIMAiGroupShotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C19EG r13, com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry.OutChat r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            r12 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C1783430wVh
            if (r0 == 0) goto L63
            r4 = r3
            X.0wVh r4 = (X.C1783430wVh) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L14:
            java.lang.Object r3 = r4.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L69
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$TemplateConfig$Selecting r5 = r4.LLILLL
            com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry$OutChat r14 = r4.LLILLJJLI
            X.19EG r13 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L2a:
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$ContactSelectConfig r3 = (com.ss.android.ugc.aweme.IMAiGroupShotConfig.ContactSelectConfig) r3
            com.ss.android.ugc.aweme.IMAiGroupShotConfig r1 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig
            r1.<init>(r14, r5, r3)
            X.0waH r0 = X.C1786270waH.LIZ
            r0.getClass()
            r0 = 0
            X.C1786270waH.LIZIZ(r13, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3d:
            X.C155000ia.LIZIZ(r3)
            X.0wVq r0 = X.C1783520wVq.LL
            X.C1783520wVq.LIZIZ()
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$TemplateConfig$Selecting r5 = new com.ss.android.ugc.aweme.IMAiGroupShotConfig$TemplateConfig$Selecting
            X.0hVf r8 = X.EnumC1206810hVf.GROUP
            com.ss.android.ugc.aweme.IMAiGroupShotConfig$TemplateConfig$Selecting$CustomBottomAction$None r9 = com.ss.android.ugc.aweme.IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.None.INSTANCE
            r11 = 0
            r10 = r17
            r7 = r16
            r6 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LL = r13
            r4.LLILLJJLI = r14
            r4.LLILLL = r5
            r4.LLILZLL = r1
            java.lang.Object r3 = r12.LIZLLL(r13, r10, r4)
            if (r3 != r2) goto L2a
            return r2
        L63:
            X.0wVh r4 = new X.0wVh
            r4.<init>(r12, r3)
            goto L14
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl.LIZ(X.19EG, com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry$OutChat, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.IIMAiGroupShotService
    public final void LIZJ(C19EG c19eg, AIGroupShotEntry.InChat inChat, AbstractC1682806iQ abstractC1682806iQ, String str, String str2, String str3, Integer num) {
        EnumC1206810hVf enumC1206810hVf;
        IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction visible;
        C1783520wVq c1783520wVq = C1783520wVq.LL;
        C1783520wVq.LIZIZ();
        boolean z = abstractC1682806iQ instanceof C1682606iO;
        if (z) {
            enumC1206810hVf = EnumC1206810hVf.PRIVATE;
        } else if (abstractC1682806iQ instanceof C1682706iP) {
            enumC1206810hVf = EnumC1206810hVf.GROUP;
        } else {
            throw new C1954807lC();
        }
        if (abstractC1682806iQ instanceof C1682706iP) {
            visible = IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.None.INSTANCE;
        } else if (z) {
            C1759206uk c1759206uk = C1759206uk.LIZ;
            if (C1759206uk.LIZ()) {
                visible = new IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.Visible(2131830888, new IMAiGroupShotConfig.CustomClick.MoveToNext(new IMAiGroupShotConfig.ContactSelectConfig.Selecting(this.LIZ, ((AIGroupShotConfig) C911590ZpV.LIZ.getValue()).inviteFriendsGroupLimit - 1, Collections.singletonList(abstractC1682806iQ.LIZ), AFwS269S0000000_27.get$arr$(325), EnumC1783370wVb.MUF, str3, new IMAiGroupShotConfig.Action.CreateNewGroup(str3)), 1));
            } else {
                visible = IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.None.INSTANCE;
            }
        } else {
            throw new C1954807lC();
        }
        IMAiGroupShotConfig iMAiGroupShotConfig = new IMAiGroupShotConfig(inChat, new IMAiGroupShotConfig.TemplateConfig.Selecting(str, str2, enumC1206810hVf, visible, str3, num), new IMAiGroupShotConfig.ContactSelectConfig.Selected(new IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds(Collections.singletonList(abstractC1682806iQ.LIZIZ)), new IMAiGroupShotConfig.Action.TakePhotoAndSend(null, str3, false)));
        C1786270waH.LIZ.getClass();
        C1786270waH.LIZIZ(c19eg, iMAiGroupShotConfig, null);
    }
}
