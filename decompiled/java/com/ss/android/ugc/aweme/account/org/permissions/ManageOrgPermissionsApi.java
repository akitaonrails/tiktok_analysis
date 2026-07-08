package com.ss.android.ugc.aweme.account.org.permissions;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageOrgPermissionsApi {
    public static final ManageOrgPermissionsApi LIZ = new ManageOrgPermissionsApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(48));

    public interface Api {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/org/account/aaas/begin/")
        Object accountAAASBegin(@InterfaceC1501050pAF("product_scene") int i, InterfaceC1364105Vn<? super DefaultResponse> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/org/account/permission/role/invite/cancel/")
        Object cancelInvite(@InterfaceC1501050pAF("invite_id") String str, InterfaceC1364105Vn<? super DefaultResponse> interfaceC1364105Vn);

        @InterfaceC1501170pAR("/passport/org/account/permission/role/list_role_and_invitations/")
        Object getRolesAndInvites(InterfaceC1364105Vn<? super GetRoleAndInvitesResponse> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/org/account/permission/role/remove/")
        Object removeRole(@InterfaceC1501050pAF("target_uid") String str, InterfaceC1364105Vn<? super DefaultResponse> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/org/account/permission/role/invite/resend/")
        Object resendInvite(@InterfaceC1501050pAF("invite_id") String str, InterfaceC1364105Vn<? super DefaultResponse> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/org/account/permission/role/invite/send/")
        Object sendInvite(@InterfaceC1501050pAF("email") String str, @InterfaceC1501050pAF("mobile") String str2, @InterfaceC1501050pAF("mix_mode") String str3, @InterfaceC1501050pAF("role") int i, InterfaceC1364105Vn<? super SendInviteResponse> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/org/account/permission/role/update/")
        Object updateRole(@InterfaceC1501050pAF("target_uid") String str, @InterfaceC1501050pAF("role") int i, InterfaceC1364105Vn<? super DefaultResponse> interfaceC1364105Vn);
    }

    public static final class Invite {

        @C09CT("email")
        public final String email;

        @C09CT("expiry_time")
        public final long expiryTime;

        @C09CT("invite_id")
        public final String inviteId;

        @C09CT("mobile")
        public final String mobile;

        @C09CT("role")
        public final int role;

        @C09CT("sent_time")
        public final long sentTime;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final int status;

        public Invite() {
            this("", "", "", 0, 0, 0L, 0L);
        }

        public Invite(String str, String str2, String str3, int i, int i2, long j, long j2) {
            this.inviteId = str;
            this.email = str2;
            this.mobile = str3;
            this.role = i;
            this.status = i2;
            this.sentTime = j;
            this.expiryTime = j2;
        }
    }

    public static final class Role {

        @C09CT("email")
        public final String email;

        @C09CT("grant_time")
        public final long grantTime;

        @C09CT("mobile")
        public final String mobile;

        @C09CT("role")
        public final int role;

        @C09CT("user_id")
        public final String userId;

        public Role() {
            this("", "", "", 0, 0L);
        }

        public Role(String str, String str2, String str3, int i, long j) {
            this.userId = str;
            this.email = str2;
            this.mobile = str3;
            this.role = i;
            this.grantTime = j;
        }
    }

    public static Api LIZJ() {
        return (Api) LIZIZ.getValue();
    }

    public static String LIZLLL(k kVar) {
        n nVar;
        k kVarLJJIIZ;
        String strLJIL;
        if (!(kVar instanceof n) || (nVar = (n) kVar) == null || (kVarLJJIIZ = nVar.LJJIIZ("description")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
            return "";
        }
        return strLJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1243700iTA
            if (r0 == 0) goto L20
            r4 = r6
            X.0iTA r4 = (X.C1243700iTA) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L40
        L20:
            X.0iTA r4 = new X.0iTA
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$Api r1 = LIZJ()     // Catch: java.lang.Exception -> L46
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L46
            r0 = 37
            java.lang.Object r3 = r1.accountAAASBegin(r0, r4)     // Catch: java.lang.Exception -> L46
            if (r3 != r2) goto L43
            return r2
        L40:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L46
        L43:
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = (com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse) r3     // Catch: java.lang.Exception -> L46
            return r3
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.GetRoleAndInvitesResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1243710iTB
            if (r0 == 0) goto L20
            r4 = r6
            X.0iTB r4 = (X.C1243710iTB) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0iTB r4 = new X.0iTB
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$Api r0 = LIZJ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.getRolesAndInvites(r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$GetRoleAndInvitesResponse r3 = (com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.GetRoleAndInvitesResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$GetRoleAndInvitesResponse r3 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$GetRoleAndInvitesResponse
            r2 = 0
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$GetRoleAndInvitesData r0 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$GetRoleAndInvitesData
            r0.<init>(r2, r2, r2, r2)
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.LJ(X.05Vn):java.lang.Object");
    }

    public static final class DefaultResponse {

        @C09CT("data")
        public final k data;

        @C09CT("message")
        public final String message;

        public DefaultResponse() {
            this("", null);
        }

        public DefaultResponse(String str, k kVar) {
            this.message = str;
            this.data = kVar;
        }
    }

    public static final class GetRoleAndInvitesResponse {

        @C09CT("data")
        public final GetRoleAndInvitesData data;

        @C09CT("message")
        public final String message;

        public GetRoleAndInvitesResponse() {
            this("", new GetRoleAndInvitesData(null, null, null, null));
        }

        public GetRoleAndInvitesResponse(String str, GetRoleAndInvitesData getRoleAndInvitesData) {
            this.message = str;
            this.data = getRoleAndInvitesData;
        }
    }

    public static final class SendInviteResponse {

        @C09CT("data")
        public final SendInviteData data;

        @C09CT("message")
        public final String message;

        public SendInviteResponse() {
            this("", new SendInviteData(null, null, null));
        }

        public SendInviteResponse(String str, SendInviteData sendInviteData) {
            this.message = str;
            this.data = sendInviteData;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1243690iT9
            if (r0 == 0) goto L20
            r4 = r7
            X.0iT9 r4 = (X.C1243690iT9) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0iT9 r4 = new X.0iT9
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$Api r0 = LIZJ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.cancelInvite(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = (com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1243720iTC
            if (r0 == 0) goto L20
            r4 = r7
            X.0iTC r4 = (X.C1243720iTC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0iTC r4 = new X.0iTC
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$Api r0 = LIZJ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.removeRole(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = (com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1243730iTD
            if (r0 == 0) goto L20
            r4 = r7
            X.0iTD r4 = (X.C1243730iTD) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0iTD r4 = new X.0iTD
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$Api r0 = LIZJ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.resendInvite(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = (com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final class SendInviteData {

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("invite_id")
        public final String inviteId;

        public SendInviteData() {
            this(null, null, null);
        }

        public SendInviteData(String str, String str2, Integer num) {
            this.inviteId = str;
            this.description = str2;
            this.errorCode = num;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r6, int r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1243740iTE
            if (r0 == 0) goto L20
            r4 = r8
            X.0iTE r4 = (X.C1243740iTE) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0iTE r4 = new X.0iTE
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$Api r0 = LIZJ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.updateRole(r6, r7, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = (com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.DefaultResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse r3 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$DefaultResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.LJIIIIZZ(java.lang.String, int, X.05Vn):java.lang.Object");
    }

    public static final class GetRoleAndInvitesData {

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("invites")
        public final List<Invite> invites;

        @C09CT("roles")
        public final List<Role> roles;

        public GetRoleAndInvitesData() {
            this(null, null, null, null);
        }

        public GetRoleAndInvitesData(List<Role> list, List<Invite> list2, String str, Integer num) {
            this.roles = list;
            this.invites = list2;
            this.description = str;
            this.errorCode = num;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C1243750iTF
            if (r0 == 0) goto L21
            r9 = r14
            X.0iTF r9 = (X.C1243750iTF) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r4 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r9.LLILLL
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L27
            goto L53
        L21:
            X.0iTF r9 = new X.0iTF
            r9.<init>(r10, r14)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$Api r4 = LIZJ()     // Catch: java.lang.Exception -> L59
            if (r12 == 0) goto L3d
            java.lang.String r5 = X.C2093608Ic.LIZIZ(r12)     // Catch: java.lang.Exception -> L59
            goto L3e
        L3d:
            r5 = r2
        L3e:
            if (r13 == 0) goto L41
            goto L43
        L41:
            r6 = r2
            goto L47
        L43:
            java.lang.String r6 = X.C2093608Ic.LIZIZ(r13)     // Catch: java.lang.Exception -> L59
        L47:
            java.lang.String r7 = "1"
            r9.LLILLL = r0     // Catch: java.lang.Exception -> L59
            r8 = r11
            java.lang.Object r4 = r4.sendInvite(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L59
            if (r4 != r3) goto L56
            return r3
        L53:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L59
        L56:
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$SendInviteResponse r4 = (com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.SendInviteResponse) r4     // Catch: java.lang.Exception -> L59
            return r4
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$SendInviteResponse r4 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$SendInviteResponse
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$SendInviteData r0 = new com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi$SendInviteData
            r0.<init>(r2, r2, r2)
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi.LJII(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
