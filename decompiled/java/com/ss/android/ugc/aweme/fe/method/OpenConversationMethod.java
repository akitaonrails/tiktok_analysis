package com.ss.android.ugc.aweme.fe.method;

import X.C14EU;
import X.C913100Zrw;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenConversationMethod extends BaseCommonJavaMethod {
    public final HashMap<String, InterfaceC1041760dDS> LLILLL;

    public OpenConversationMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenConversationMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = new HashMap<>();
    }

    @C14EU
    public final void onSelectedChatMsg(C913100Zrw c913100Zrw) throws JSONException {
        InterfaceC1041760dDS interfaceC1041760dDSRemove;
        boolean z;
        String str = c913100Zrw.LIZIZ;
        if (str != null && str.length() > 0 && this.LLILLL.containsKey(str) && (interfaceC1041760dDSRemove = this.LLILLL.remove(str)) != null) {
            String str2 = c913100Zrw.LIZ;
            if (str2 != null && str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("msgList", c913100Zrw.LIZ);
                interfaceC1041760dDSRemove.LIZJ(1, jSONObject, "");
                return;
            }
            interfaceC1041760dDSRemove.LIZ(0, "");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(5:20|(0)(2:23|(5:16|(1:18)(2:26|(0))|19|49|29)(0))|(2:(1:41)|(2:43|(1:45)))(0)|46|47)(1:12)|13|(1:15)(0)|16|(0)(0)|19|49|29|(3:33|(3:36|39|41)|(0))(0)|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r1 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[PHI: r4
      0x004e: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v10 java.lang.String) binds: [B:21:0x004b, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[PHI: r3 r4
      0x0052: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:24:0x004f, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v9 java.lang.String) binds: [B:24:0x004f, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099 A[PHI: r4
      0x0099: PHI (r4v7 java.lang.String) = (r4v4 java.lang.String), (r4v3 java.lang.String) binds: [B:42:0x0097, B:34:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r9, X.InterfaceC1041760dDS r10) throws org.json.JSONException {
        /*
            r8 = this;
            r1 = 0
            if (r9 == 0) goto Lb1
            java.lang.String r0 = "extra"
            java.lang.String r2 = r9.optString(r0)
            r7 = 0
            r5 = 1
            if (r2 == 0) goto Lb1
            int r0 = r2.length()
            if (r0 == 0) goto Lb1
            java.lang.String r0 = "utf-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r6 = X.C08JS.LIZ(r2, r0)
            com.google.gson.n r6 = (com.google.gson.n) r6
            if (r6 == 0) goto L4a
            java.lang.String r0 = "conversation_id"
            com.google.gson.k r0 = r6.LJJIIZ(r0)
            if (r0 == 0) goto L4a
            java.lang.String r4 = r0.LJIL()
        L2f:
            java.lang.String r0 = "uid"
            com.google.gson.k r0 = r6.LJJIIZ(r0)
            if (r0 == 0) goto L4e
            java.lang.String r3 = r0.LJIL()
        L3b:
            java.lang.String r0 = "nickname"
            com.google.gson.k r0 = r6.LJJIIZ(r0)
            if (r0 == 0) goto L52
            java.lang.String r2 = r0.LJIL()
        L47:
            java.lang.String r0 = "msg_list"
            goto L56
        L4a:
            r4 = r1
            if (r6 == 0) goto L4e
            goto L2f
        L4e:
            r3 = r1
            if (r6 == 0) goto L52
            goto L3b
        L52:
            r2 = r1
            if (r6 == 0) goto L65
            goto L47
        L56:
            com.google.gson.k r0 = r6.LJJIIZ(r0)     // Catch: java.lang.ClassCastException -> L5f
            java.lang.String r1 = r0.LJIL()     // Catch: java.lang.ClassCastException -> L5f
            goto L65
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = ""
        L65:
            if (r4 == 0) goto L6d
            int r0 = r4.length()
            if (r0 != 0) goto L99
        L6d:
            if (r3 == 0) goto L97
            int r0 = r3.length()
            if (r0 <= 0) goto L97
            if (r2 == 0) goto L97
            int r0 = r2.length()
            if (r0 <= 0) goto L97
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r7)
            X.05Ol r0 = r0.getImUserService()
            java.lang.String r4 = r0.LIZLLL(r3)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = new com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            r0.<init>()
            r0.setUid(r3)
            r0.setNickName(r2)
            r0.setFake(r5)
        L97:
            if (r4 == 0) goto La4
        L99:
            int r0 = r4.length()
            if (r0 == 0) goto La4
            java.util.HashMap<java.lang.String, X.0dDS> r0 = r8.LLILLL
            r0.put(r4, r10)
        La4:
            X.0Zrw r0 = new X.0Zrw
            r0.<init>()
            r0.LIZIZ = r4
            r0.LIZ = r1
            r8.onSelectedChatMsg(r0)
            return
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod.handle(org.json.JSONObject, X.0dDS):void");
    }
}
