package com.ss.android.ugc.aweme.fangroup.action;

import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupAnchorChooseGroupAction implements IRouteAction {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r18, java.lang.String r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r4 = r18
            if (r4 != 0) goto L7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L7:
            java.lang.String r13 = ""
            r15 = 0
            r1 = r20
            if (r1 == 0) goto L16
            java.lang.String r0 = "invite_list_type"
            java.lang.String r3 = r1.getString(r0)     // Catch: java.lang.Exception -> L2a
            if (r3 != 0) goto L17
        L16:
            r3 = r13
        L17:
            com.google.gson.Gson r2 = X.C051M.LIZ     // Catch: java.lang.Exception -> L2a
            java.lang.Class<java.lang.Integer[]> r0 = java.lang.Integer[].class
            java.lang.Object r0 = r2.LJII(r3, r0)     // Catch: java.lang.Exception -> L2a
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L28
            java.util.List r14 = X.C13LQ.LJJLL(r0)     // Catch: java.lang.Exception -> L2a
            goto L2f
        L28:
            r14 = r15
            goto L2f
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r14 = r15
        L2f:
            if (r1 == 0) goto L89
            java.lang.String r0 = "build_param"
            java.io.Serializable r11 = r1.getSerializable(r0)
        L37:
            boolean r0 = r11 instanceof X.C1226850i1z
            if (r0 == 0) goto L87
            X.0i1z r11 = (X.C1226850i1z) r11
        L3d:
            if (r11 != 0) goto L6a
            X.0i1z r11 = new X.0i1z
            if (r1 == 0) goto L4b
            java.lang.String r0 = "enter_from"
            java.lang.String r12 = r1.getString(r0)
            if (r12 != 0) goto L4c
        L4b:
            r12 = r13
        L4c:
            if (r1 == 0) goto L57
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L57
            r13 = r0
        L57:
            if (r1 == 0) goto L65
            java.lang.String r0 = "time_range"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L65
            java.lang.Integer r15 = X.C2095008Iq.LJIIJJI(r0)
        L65:
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
        L6a:
            X.0i52 r0 = com.ss.android.ugc.aweme.fangroup.api.ICreatorGroupSelectorService.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.fangroup.api.ICreatorGroupSelectorService> r0 = X.C1228740i52.LIZIZ
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.fangroup.api.ICreatorGroupSelectorService r3 = (com.ss.android.ugc.aweme.fangroup.api.ICreatorGroupSelectorService) r3
            if (r3 == 0) goto L8b
            java.lang.String r5 = r11.enterFrom
            java.lang.String r6 = r11.enterMethod
            r7 = 1
            r8 = 0
            r9 = 0
            r3.LIZ(r4, r5, r6, r7, r8, r9, r11)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L87:
            r11 = r15
            goto L3d
        L89:
            r11 = r15
            goto L37
        L8b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fangroup.action.FanGroupAnchorChooseGroupAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
